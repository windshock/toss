package com.tmoney.dto;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class OtcDto {
    private String mPublicExponent;
    private String mPublicModulus;

    public OtcDto(String str, String str2) {
        this.mPublicModulus = str;
        this.mPublicExponent = str2;
    }

    public String getPublicExponent() {
        return this.mPublicExponent;
    }

    public String getPublicModulus() {
        return this.mPublicModulus;
    }
}
