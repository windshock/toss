package com.tmoney.ota.dto;

import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class Product implements Serializable {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    public Product(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public String getCAPP_SVC_ID() {
        return this.d;
    }

    public String getCARD_PRD_ID() {
        return this.b;
    }

    public String getCARD_PRD_NM() {
        return this.c;
    }

    public String getCARD_STA_CD() {
        return this.e;
    }

    public String getPBCM_CD() {
        return this.a;
    }
}
