package com.wallet.controller;

/**
 * @Author:Jack
 * @Date: 2023/6/19
 */
import com.alibaba.fastjson2.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.wallet.mapper.UserWalletMapper;
import com.wallet.model.UserWallet;
import com.wallet.model.WalletDetail;
import com.wallet.service.UserWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/wallet")
public class UserWalletController {

    @Autowired
    private UserWalletService userWalletService;

    @GetMapping("/balance")
    @ResponseBody
    public UserWallet getUserWallet(@RequestParam("userId") int userId) {
        return userWalletService.getUserWallet(userId);
    }

    @PostMapping ("/consume")
    @ResponseBody
    public JSONObject consume(@RequestParam("userId") int userId){
        UserWallet userWallet = userWalletService.getUserWallet(userId);
        JSONObject message = new JSONObject();
        BigDecimal consumeSum = new BigDecimal(100);
        if (userWallet.getBalance().compareTo(consumeSum) >= 0) {
            BigDecimal newBalance = userWallet.getBalance().subtract(consumeSum);
            userWallet.setBalance(newBalance);
            userWalletService.updateUserWallet(userWallet);

            WalletDetail walletDetail = new WalletDetail();
            walletDetail.setUserId(userId);
            walletDetail.setAmount(consumeSum.negate());
            userWalletService.addWalletDetail(walletDetail);
            message.put("message", "成功消费100元");
        } else {
            message.put("message", "消费失败，余额不足");
        }
        return message;
    }

    @PostMapping("/refund")
    @ResponseBody
    @Transactional(rollbackFor = Exception.class)
    public JSONObject refund(@RequestParam("userId") int userId) throws Exception {
        UserWallet userWallet = userWalletService.getUserWallet(userId);
        JSONObject message = new JSONObject();
        BigDecimal amount = new BigDecimal(20);
        if (userWalletService.getWalletDetailSum(userId) != null && userWalletService.getWalletDetailSum(userId).add(amount).compareTo(new BigDecimal(0)) < 0) {
            BigDecimal newBalance = userWallet.getBalance().add(amount);
            userWallet.setBalance(newBalance);
            int result = userWalletService.updateUserWallet(userWallet);

            WalletDetail walletDetail = new WalletDetail();
            walletDetail.setUserId(userId);
            walletDetail.setAmount(amount);
            result += userWalletService.addWalletDetail(walletDetail);
            if (result >= 2) {
                message.put("message", "成功退款20元");
            } else {
                throw new Exception("退款失败！");
            }
        } else {
            message.put("message", "消费明细中不存在这笔消费，退款失败！");
        }
        return message;
    }

    @GetMapping("/walletDetail")
    @ResponseBody
    public List<WalletDetail> getWalletDetail(@RequestParam("userId") int userId) {
        return userWalletService.getWalletDetailList(userId);
    }
}
