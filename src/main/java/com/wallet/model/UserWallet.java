package com.wallet.model;

import java.math.BigDecimal;

/**
 * @Author:Jack
 * @Date: 2023/6/19
 */
public class UserWallet {
    private int userWalletId;
    private int userId;
    private BigDecimal balance;

    public int getUserWalletId() {
        return userWalletId;
    }

    public void setUserWalletId(int userWalletId) {
        this.userWalletId = userWalletId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "UserWallet{" +
                "userWalletId=" + userWalletId +
                ", userId=" + userId +
                ", balance=" + balance +
                '}';
    }
}
