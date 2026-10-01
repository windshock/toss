package com.tmoney.dto;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class PostpaidBillInfoListDto {
    private String amt;
    private String crcmCd;
    private String crcmNm;
    private String key;
    private String linkId;
    private String pointName;
    private String seq;
    private String trdDt;

    public String getAmount() {
        return this.amt;
    }

    public String getCardName() {
        return this.crcmNm;
    }

    public String getJoinCard() {
        return this.crcmCd;
    }

    public String getKey() {
        return this.key;
    }

    public String getLinkId() {
        return this.linkId;
    }

    public String getPointName() {
        return this.pointName;
    }

    public String getSeq() {
        return this.seq;
    }

    public String getTransDate() {
        return this.trdDt;
    }

    public void setAmt(String str) {
        this.amt = str;
    }

    public void setCrcmCd(String str) {
        this.crcmCd = str;
    }

    public void setCrcmNm(String str) {
        this.crcmNm = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLinkId(String str) {
        this.linkId = str;
    }

    public void setPointName(String str) {
        this.pointName = str;
    }

    public void setSeq(String str) {
        this.seq = str;
    }

    public void setTrdDt(String str) {
        this.trdDt = str;
    }
}
