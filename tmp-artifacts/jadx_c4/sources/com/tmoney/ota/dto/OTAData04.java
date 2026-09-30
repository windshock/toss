package com.tmoney.ota.dto;

import android.content.Context;
import com.tmoney.utils.DeviceInfoHelper;
import com.tmoney.utils.LogHelper;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class OTAData04 extends OTAData implements Serializable {
    private int j;
    private final String a = "OTAData04";
    private String b = "";
    private String c = "";
    private String d = "";
    private String e = "";
    private String f = "";
    private String g = "";
    private String h = "";
    private String i = "";
    private ArrayList<APDU> k = new ArrayList<>();
    private String l = "";

    public OTAData04() {
    }

    public OTAData04(Context context) {
        setUNIC_CARD_NO(DeviceInfoHelper.getSimSerialNumber(context));
        setHNDH_TEL_NO(DeviceInfoHelper.getLine1NumberLocaleRemove(context));
        setTLCM_CD(DeviceInfoHelper.getOtaTelecom(context));
    }

    public int getAPP_CNT() {
        return this.j;
    }

    public String getCAPP_SVC_ID() {
        return this.f;
    }

    public String getCARD_NO() {
        return this.g;
    }

    public String getCARD_PRD_ID() {
        return this.e;
    }

    public String getCARD_STA_CD() {
        return this.i;
    }

    public String getDUTY_DVS_CD() {
        return this.l;
    }

    public String getHNDH_TEL_NO() {
        return this.c;
    }

    public String getPBCM_CD() {
        return this.h;
    }

    public String getTLCM_CD() {
        return this.d;
    }

    public ArrayList<APDU> getTRM_APDU_VAL() {
        return this.k;
    }

    public String getUNIC_CARD_NO() {
        return this.b;
    }

    public void setAPP_CNT(int i) {
        this.j = i;
    }

    public void setCAPP_SVC_ID(String str) {
        this.f = str;
    }

    public void setCARD_NO(String str) {
        this.g = str;
    }

    public void setCARD_PRD_ID(String str) {
        this.e = str;
    }

    public void setCARD_STA_CD(String str) {
        this.i = str;
    }

    public void setDUTY_DVS_CD(String str) {
        this.l = str;
    }

    public void setHNDH_TEL_NO(String str) {
        this.c = str;
    }

    public void setPBCM_CD(String str) {
        this.h = str;
    }

    public void setTLCM_CD(String str) {
        this.d = str;
    }

    public void setTRM_APDU_VAL(APDU apdu) {
        if (apdu != null) {
            LogHelper.d("OTAData04", "added >> " + apdu.getCMD() + "/" + apdu.getSW());
            this.k.add(apdu);
        }
    }

    public void setUNIC_CARD_NO(String str) {
        this.b = str;
    }
}
