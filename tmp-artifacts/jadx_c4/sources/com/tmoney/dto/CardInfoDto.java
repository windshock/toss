package com.tmoney.dto;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class CardInfoDto {
    private int mBalance;
    private String mCardNum;

    public CardInfoDto(String str, int i) {
        this.mCardNum = str;
        this.mBalance = i;
    }

    public int getBalance() {
        return this.mBalance;
    }

    public String getCardNum() {
        return this.mCardNum;
    }
}
