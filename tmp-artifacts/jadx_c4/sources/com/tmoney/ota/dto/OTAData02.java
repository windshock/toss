package com.tmoney.ota.dto;

import android.content.Context;
import com.tmoney.utils.DeviceInfoHelper;
import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class OTAData02 extends OTAData {
    private int d;
    private String a = "";
    private String b = "";
    private String c = "";
    private String e = "";
    private ArrayList<Product> f = new ArrayList<>();

    public OTAData02() {
    }

    public OTAData02(Context context) {
        setUNIC_CARD_NO(DeviceInfoHelper.getSimSerialNumber(context));
        setTLCM_CD(DeviceInfoHelper.getOtaTelecom(context));
    }

    public int getAPP_CNT() {
        return this.d;
    }

    public String getCARD_NO() {
        return this.a;
    }

    public ArrayList<Product> getProdList() {
        return this.f;
    }

    public String getRPTN_STT() {
        return this.e;
    }

    public String getTLCM_CD() {
        return this.c;
    }

    public String getUNIC_CARD_NO() {
        return this.b;
    }

    public void setAPP_CNT(int i) {
        this.d = i;
    }

    public void setCARD_NO(String str) {
        this.a = str;
    }

    public void setProd(Product product) {
        this.f.add(product);
    }

    public void setRPTN_STT(String str) {
        this.e = str;
    }

    public void setTLCM_CD(String str) {
        this.c = str;
    }

    public void setUNIC_CARD_NO(String str) {
        this.b = str;
    }
}
