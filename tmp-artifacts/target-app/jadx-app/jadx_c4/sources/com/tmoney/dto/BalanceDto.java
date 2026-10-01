package com.tmoney.dto;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class BalanceDto {
    private int mAfterBalance;
    private int mBeforeBalance;
    private String mCardNum;

    public BalanceDto(String str, int i, int i2) {
        this.mCardNum = str;
        this.mBeforeBalance = i;
        this.mAfterBalance = i2;
    }

    public int getAfterBalance() {
        return this.mAfterBalance;
    }

    public int getBeforeBalance() {
        return this.mBeforeBalance;
    }

    public String getCardNum() {
        return this.mCardNum;
    }
}
