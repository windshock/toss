package com.tmoney.ota.dto;

import android.content.Context;
import com.tmoney.utils.DeviceInfoHelper;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class EfIssuActCDTO extends OTAData {
    private String a = "";
    private String b = "";
    private String c = "";
    private String d = "";
    private String e = "";
    private String f = "";
    private String g = "";
    private String h = "";
    private String i = "";
    private int j = 0;
    private ArrayList<APDU> k = new ArrayList<>();

    public EfIssuActCDTO() {
    }

    public EfIssuActCDTO(Context context) {
        setUnicCardNo(DeviceInfoHelper.getSimSerialNumber(context));
        setHndhTelNo(DeviceInfoHelper.getLine1NumberLocaleRemove(context));
        setTlcmCd(DeviceInfoHelper.getTelecom(context));
    }

    public String getAfltPrdId() {
        return this.h;
    }

    public int getAppCnt() {
        return this.j;
    }

    public String getCardPrdId() {
        return this.f;
    }

    public String getCardPrdInhrNo() {
        return this.a;
    }

    public String getCardStaCd() {
        return this.i;
    }

    public String getDtaRecSno() {
        return this.g;
    }

    public String getHndhTelNo() {
        return this.d;
    }

    public String getTlcmCd() {
        return this.e;
    }

    public String getTmcrNo() {
        return this.c;
    }

    public ArrayList<APDU> getTrmApduList() {
        return this.k;
    }

    public String getUnicCardNo() {
        return this.b;
    }

    public void setAfltPrdId(String str) {
        this.h = str;
    }

    public void setAppCnt(int i) {
        this.j = i;
    }

    public void setCardPrdId(String str) {
        this.f = str;
    }

    public void setCardPrdInhrNo(String str) {
        this.a = str;
    }

    public void setCardStaCd(String str) {
        this.i = str;
    }

    public void setDtaRecSno(String str) {
        this.g = str;
    }

    public void setHndhTelNo(String str) {
        this.d = str;
    }

    public void setTlcmCd(String str) {
        this.e = str;
    }

    public void setTmcrNo(String str) {
        this.c = str;
    }

    public void setTrmApdu(APDU apdu) {
        if (apdu != null) {
            apdu.getCMD();
            Objects.toString(apdu.getSW());
            this.k.add(apdu);
        }
    }

    public void setUnicCardNo(String str) {
        this.b = str;
    }
}
