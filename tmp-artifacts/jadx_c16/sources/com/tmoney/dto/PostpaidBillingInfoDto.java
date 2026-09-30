package com.tmoney.dto;

import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class PostpaidBillingInfoDto {
    private String aprvTtam;
    private String billDay;
    private String cancTtam;
    private String nAprvTtam;
    private String nAprvYn;
    private String pntTtam;
    private String ttam;
    private String useTtam;
    ArrayList<PostpaidBillInfoListDto> apprDtaV = new ArrayList<>();
    ArrayList<PostpaidBillInfoListDto> cancDtaV = new ArrayList<>();
    ArrayList<PostpaidBillInfoListDto> pntDtaV = new ArrayList<>();

    public String getAllSum() {
        return this.ttam;
    }

    public String getApprAmount() {
        return this.aprvTtam;
    }

    public ArrayList<PostpaidBillInfoListDto> getApprList() {
        return this.apprDtaV;
    }

    public String getBillDay() {
        return this.billDay;
    }

    public ArrayList<PostpaidBillInfoListDto> getCancelList() {
        return this.cancDtaV;
    }

    public String getCancelSum() {
        return this.cancTtam;
    }

    public String getNapprAmount() {
        return this.nAprvTtam;
    }

    public String getNapprYn() {
        return this.nAprvYn;
    }

    public ArrayList<PostpaidBillInfoListDto> getPointList() {
        return this.pntDtaV;
    }

    public String getPointSum() {
        return this.pntTtam;
    }

    public String getUseSum() {
        return this.useTtam;
    }

    public void setApprDtaV(ArrayList<PostpaidBillInfoListDto> arrayList) {
        this.apprDtaV = arrayList;
    }

    public void setAprvTtam(String str) {
        this.aprvTtam = str;
    }

    public void setBillDay(String str) {
        this.billDay = str;
    }

    public void setCancDtaV(ArrayList<PostpaidBillInfoListDto> arrayList) {
        this.cancDtaV = arrayList;
    }

    public void setCancTtam(String str) {
        this.cancTtam = str;
    }

    public void setNAprvTtam(String str) {
        this.nAprvTtam = str;
    }

    public void setNAprvYn(String str) {
        this.nAprvYn = str;
    }

    public void setPntDtaV(ArrayList<PostpaidBillInfoListDto> arrayList) {
        this.pntDtaV = arrayList;
    }

    public void setPntTtam(String str) {
        this.pntTtam = str;
    }

    public void setTtam(String str) {
        this.ttam = str;
    }

    public void setUseTtam(String str) {
        this.useTtam = str;
    }
}
