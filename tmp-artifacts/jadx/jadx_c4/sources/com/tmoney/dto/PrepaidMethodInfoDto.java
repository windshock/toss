package com.tmoney.dto;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class PrepaidMethodInfoDto {
    private String fee;
    private String fxrtFamtDvsCd;
    private String maxChg;
    private String minChg;
    private String minFee;
    private String pymMnsTypCd;
    private String svcNm;

    public PrepaidMethodInfoDto(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.svcNm = str;
        this.pymMnsTypCd = str2;
        this.fxrtFamtDvsCd = str3;
        this.fee = str4;
        this.minFee = str5;
        this.minChg = str6;
        this.maxChg = str7;
    }

    public String getFee() {
        return this.fee;
    }

    public String getFxrtFamtDvsCd() {
        return this.fxrtFamtDvsCd;
    }

    public String getMaxChg() {
        return this.maxChg;
    }

    public String getMinChg() {
        return this.minChg;
    }

    public String getMinFee() {
        return this.minFee;
    }

    public String getPymMnsTypCd() {
        return this.pymMnsTypCd;
    }

    public String getSvcNm() {
        return this.svcNm;
    }
}
