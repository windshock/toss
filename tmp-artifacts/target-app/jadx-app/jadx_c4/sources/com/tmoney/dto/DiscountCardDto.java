package com.tmoney.dto;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class DiscountCardDto {
    private String mCardNum;
    private String mUserCode;

    public DiscountCardDto(String str, String str2) {
        this.mCardNum = str;
        this.mUserCode = str2;
    }

    public String getCardNum() {
        return this.mCardNum;
    }

    public String getUserCode() {
        return this.mUserCode;
    }
}
