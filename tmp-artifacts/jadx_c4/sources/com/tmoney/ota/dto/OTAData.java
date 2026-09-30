package com.tmoney.ota.dto;

import com.tmoney.utils.LogHelper;
import java.io.Serializable;
import java.lang.reflect.Field;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class OTAData implements Serializable {
    private String b;
    private String f;
    private final String a = "OTAData";
    private String c = "";
    private String d = "";
    private int e = 0;
    private String g = "";
    private String h = "";
    private String i = "";
    private String j = "";

    public String getISSU_REQ_SNO() {
        return this.b;
    }

    public String getMSG_DVS_CD() {
        return this.c;
    }

    public int getMSG_SNO() {
        return this.e;
    }

    public String getRST_CD() {
        return this.g;
    }

    public String getRST_MSG() {
        return this.j;
    }

    public String getRTRM_YN() {
        return this.h;
    }

    public String getSP_ID() {
        return this.f;
    }

    public String getTLCN_SERV_ID() {
        return this.d;
    }

    public String getTL_PRRS_CD() {
        return this.i;
    }

    public void print() {
        LogHelper.d("OTAData", toString());
    }

    public void setISSU_REQ_SNO(String str) {
        this.b = str;
    }

    public void setMSG_DVS_CD(String str) {
        this.c = str;
    }

    public void setMSG_SNO(int i) {
        this.e = i;
    }

    public void setRST_CD(String str) {
        this.g = str;
    }

    public void setRST_MSG(String str) {
        this.j = str;
    }

    public void setRTRM_YN(String str) {
        this.h = str;
    }

    public void setSP_ID(String str) {
        this.f = str;
    }

    public void setTLCN_SERV_ID(String str) {
        this.d = str;
    }

    public void setTL_PRRS_CD(String str) {
        this.i = str;
    }

    public String toString() throws SecurityException {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            for (Field field : getClass().getDeclaredFields()) {
                field.setAccessible(true);
                stringBuffer.append("[" + field.getName() + "][" + field.get(this) + "]");
                stringBuffer.append("\n");
            }
        } catch (Exception e) {
            LogHelper.exception("OTAData", e);
        }
        return stringBuffer.toString();
    }
}
