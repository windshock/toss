package com.tmoney.dto;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class MembershipItemDto {
    private String mAfltPrdId;
    private String mCardPrdId;
    private String mCode;
    private String mDtaRecSno;
    private String mName;

    public MembershipItemDto(String str, String str2, String str3, String str4) {
        this.mCode = str;
        this.mCardPrdId = str2;
        this.mDtaRecSno = str3;
        this.mAfltPrdId = str4;
    }

    public String getAfltPrdId() {
        return this.mAfltPrdId;
    }

    public String getCardPrdId() {
        return this.mCardPrdId;
    }

    public String getCode() {
        return this.mCode;
    }

    public String getDtaRecSno() {
        return this.mDtaRecSno;
    }

    public String getName() {
        return this.mName;
    }
}
