package com.tmoney.dto;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class MembershipDto {
    private String mCardNumber;
    private String mCode;
    private String mValidDate;

    public MembershipDto(String str, String str2, String str3) {
        this.mCode = str;
        this.mCardNumber = str2;
        this.mValidDate = str3;
    }

    public String getCardNumber() {
        return this.mCardNumber;
    }

    public String getCode() {
        return this.mCode;
    }

    public String getValidDate() {
        return this.mValidDate;
    }
}
