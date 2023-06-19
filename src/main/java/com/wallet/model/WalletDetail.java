package com.wallet.model;

import java.math.BigDecimal;

/**
 * @Author:Jack
 * @Date: 2023/6/19
 */
public class WalletDetail {
    private int walletDetailId;
    private int userId;
    private BigDecimal amount;

    public int getWalletDetailId() {
        return walletDetailId;
    }

    public void setWalletDetailId(int walletDetailId) {
        this.walletDetailId = walletDetailId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "WalletDetail{" +
                "walletDetailId=" + walletDetailId +
                ", userId=" + userId +
                ", amount=" + amount +
                '}';
    }
}
