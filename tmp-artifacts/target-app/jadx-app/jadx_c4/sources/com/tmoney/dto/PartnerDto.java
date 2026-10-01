package com.tmoney.dto;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class PartnerDto {
    private String mAppName;
    private String mPackage;
    private String mScheme;

    public PartnerDto(String str, String str2, String str3) {
        this.mAppName = str;
        this.mPackage = str2;
        this.mScheme = str3;
    }

    public String getAppName() {
        return this.mAppName;
    }

    public String getPackage() {
        return this.mPackage;
    }

    public String getScheme() {
        return this.mScheme;
    }
}
