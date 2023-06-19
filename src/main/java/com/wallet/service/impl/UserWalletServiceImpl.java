package com.wallet.service.impl;

import com.wallet.mapper.UserWalletMapper;
import com.wallet.model.UserWallet;
import com.wallet.model.WalletDetail;
import com.wallet.service.UserWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author:Jack
 * @Date: 2023/6/19
 */
@Service
public class UserWalletServiceImpl implements UserWalletService {

    @Autowired
    private UserWalletMapper userWalletMapper;

    @Override
    public UserWallet getUserWallet(int userId) {
        return userWalletMapper.getUserWallet(userId);
    }

    @Override
    public int updateUserWallet(UserWallet userWallet) {
        return userWalletMapper.updateUserWallet(userWallet);
    }

    @Override
    public int addWalletDetail(WalletDetail walletDetail) {
        return userWalletMapper.addWalletDetail(walletDetail);
    }

    @Override
    public BigDecimal getWalletDetailSum(int userId) {
        return userWalletMapper.getWalletDetailSum(userId);
    }

    @Override
    public List<WalletDetail> getWalletDetailList(int userId) {
        return userWalletMapper.getWalletDetailList(userId);
    }
}
