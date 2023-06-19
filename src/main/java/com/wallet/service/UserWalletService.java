package com.wallet.service;

import com.wallet.model.UserWallet;
import com.wallet.model.WalletDetail;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author:Jack
 * @Date: 2023/6/19
 */
public interface UserWalletService {
    UserWallet getUserWallet(int userId);
    int updateUserWallet(UserWallet userWallet);
    int addWalletDetail(WalletDetail walletDetail);
    BigDecimal getWalletDetailSum(int userId);
    List<WalletDetail> getWalletDetailList(int userId);
}
