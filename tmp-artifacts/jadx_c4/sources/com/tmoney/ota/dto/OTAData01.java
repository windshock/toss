package com.tmoney.ota.dto;

import android.content.Context;
import com.tmoney.utils.DeviceInfoHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class OTAData01 extends OTAData {
    private String a = "";
    private String b = "";
    private String c = "";
    private String d = "";
    private String e = "";
    private String f = "";
    private String g = "";
    private String h = "";
    private String i = "";
    private String j = "";

    public OTAData01() {
    }

    public OTAData01(Context context) {
        setUNIC_CARD_NO(DeviceInfoHelper.getSimSerialNumber(context));
        setHNDH_TEL_NO(DeviceInfoHelper.getLine1NumberLocaleRemove(context));
        setTLCM_CD(DeviceInfoHelper.getOtaTelecom(context));
        setMBPH_TRCN_NM(DeviceInfoHelper.getBrand() + DeviceInfoHelper.getModel());
        setUSE_OS_VER(DeviceInfoHelper.getAndroidOsVersion());
    }

    public String getAGE_DVS_CD() {
        return this.f;
    }

    public String getCARD_NO() {
        return this.c;
    }

    public String getGNDR() {
        return this.g;
    }

    public String getHNDH_TEL_NO() {
        return this.d;
    }

    public String getMBPH_TRCN_NM() {
        return this.h;
    }

    public String getMOAPP_ID() {
        return this.j;
    }

    public String getTLCM_CD() {
        return this.e;
    }

    public String getUNIC_CARD_NO() {
        return this.b;
    }

    public String getUSER_ID() {
        return this.a;
    }

    public String getUSE_OS_VER() {
        return this.i;
    }

    public void setAGE_DVS_CD(String str) {
        this.f = str;
    }

    public void setCARD_NO(String str) {
        this.c = str;
    }

    public void setGNDR(String str) {
        this.g = str;
    }

    public void setHNDH_TEL_NO(String str) {
        this.d = str;
    }

    public void setMBPH_TRCN_NM(String str) {
        this.h = str;
    }

    public void setMOAPP_ID(String str) {
        this.j = str;
    }

    public void setTLCM_CD(String str) {
        this.e = str;
    }

    public void setUNIC_CARD_NO(String str) {
        this.b = str;
    }

    public void setUSER_ID(String str) {
        this.a = str;
    }

    public void setUSE_OS_VER(String str) {
        this.i = str;
    }
}
