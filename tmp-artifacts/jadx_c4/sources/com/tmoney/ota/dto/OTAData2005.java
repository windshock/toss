package com.tmoney.ota.dto;

import android.content.Context;
import com.tmoney.utils.DeviceInfoHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class OTAData2005 extends OTAData {
    private String a = "";
    private String b = "";
    private String c = "";
    private String d = "";

    public OTAData2005() {
    }

    public OTAData2005(Context context) {
        setUNIC_CARD_NO(DeviceInfoHelper.getSimSerialNumber(context));
        setHNDH_TEL_NO(DeviceInfoHelper.getLine1NumberLocaleRemove(context));
        setTLCM_CD(DeviceInfoHelper.getOtaTelecom(context));
    }

    public String getENCR_DTA() {
        return this.b;
    }

    public String getHNDH_TEL_NO() {
        return this.d;
    }

    public String getTLCM_CD() {
        return this.c;
    }

    public String getUNIC_CARD_NO() {
        return this.a;
    }

    public void setENCR_DTA(String str) {
        this.b = str;
    }

    public void setHNDH_TEL_NO(String str) {
        this.d = str;
    }

    public void setTLCM_CD(String str) {
        this.c = str;
    }

    public void setUNIC_CARD_NO(String str) {
        this.a = str;
    }
}
