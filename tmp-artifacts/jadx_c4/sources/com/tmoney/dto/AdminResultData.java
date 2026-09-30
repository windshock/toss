package com.tmoney.dto;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.skt.usp.UCPApiConstants;
import java.io.Serializable;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class AdminResultData implements Serializable {

    @SerializedName("addr")
    private String addr;

    @SerializedName("advrChkYn")
    private String advrChkYn;

    @SerializedName("advrId")
    private String advrId;

    @SerializedName("advrTtl")
    private String advrTtl;

    @SerializedName("advrTyp")
    private String advrTyp;

    @SerializedName("advrUrl")
    private String advrUrl;

    @SerializedName("appId")
    private String appId;

    @SerializedName("appNm")
    private String appNm;

    @SerializedName("authRst")
    private String authRst;

    @SerializedName("blthctt")
    private String blthCtt;

    @SerializedName("blthSno")
    private String blthSno;

    @SerializedName("blthTtl")
    private String blthTtl;

    @SerializedName("blthTypCd")
    private String blthTypCd;

    @SerializedName("bltnEndDtm")
    private String bltnEndDtm;

    @SerializedName("bltnSrsq")
    private String bltnSrsq;

    @SerializedName("bltnSttDtm")
    private String bltnSttDtm;

    @SerializedName("bltnYn")
    private String bltnYn;

    @SerializedName("cardTypCd")
    private String cardTypCd;

    @SerializedName("deductionDtm")
    private String deductionDtm;

    @SerializedName("dtlTtl2")
    private String dtlTtl2;

    @SerializedName("eventYn")
    private String eventYn;

    @SerializedName("frcAdvrId")
    private String frcAdvrId;

    @SerializedName("frcCtt")
    private String frcCtt;

    @SerializedName("frcId")
    private String frcId;

    @SerializedName("frcNm")
    private String frcNm;

    @SerializedName("frcSno")
    private String frcSno;

    @SerializedName("imgAtflId")
    private String imgAtflId;

    @SerializedName("imgPath")
    private String imgPath;

    @SerializedName("ksccAdvrId")
    private String ksccAdvrId;

    @SerializedName("ltntLocTypCd")
    private String ltntLocTypCd;

    @SerializedName("ltntTypCd")
    private String ltntTypeCd;

    @SerializedName("mbrsPntTot")
    private String mbrsPntTot;

    @SerializedName("mileageAmt")
    private String mileageAmt;

    @SerializedName("mncrCd")
    private String mncrCd;

    @SerializedName("noticeYn")
    private String noticeYn;

    @SerializedName("pckgNm")
    private String pckgNm;

    @SerializedName("prdDtlUrl")
    private String prdDtlUrl;

    @SerializedName("prdId")
    private String prdId;

    @SerializedName("randingPageYn")
    private String randingPageYn;

    @SerializedName("resultCd")
    private String resultCd;

    @SerializedName("rgtDtm")
    private String rgtDtm;

    @SerializedName("tabDvs")
    private String tabDvs;

    @SerializedName("tabNm")
    private String tabNm;

    @SerializedName("tabUrl")
    private String tabUrl;

    @SerializedName("thumImgUrl")
    private String thumImgUrl;

    @SerializedName("urlAddr")
    private String urlAddr;

    @SerializedName("payPnt")
    private String payPnt = null;

    @SerializedName("advrAppPkg")
    private String advrAppPkg = null;

    @SerializedName("rcmYn")
    private String recommYn = null;
    private String advrInflPathDvs = "";

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public String getAddr() {
        return this.addr;
    }

    public String getAdvrAppPkg() {
        return this.advrAppPkg;
    }

    public String getAdvrChkYn() {
        return this.advrChkYn;
    }

    public String getAdvrId() {
        return this.advrId;
    }

    public String getAdvrInflPathDvs() {
        return this.advrInflPathDvs;
    }

    public String getAdvrTtl() {
        return this.advrTtl;
    }

    public String getAdvrTyp() {
        return this.advrTyp;
    }

    public String getAdvrUrl() {
        return this.advrUrl;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppNm() {
        return this.appNm;
    }

    public String getAuthRst() {
        return this.authRst;
    }

    public String getBlthCtt() {
        return this.blthCtt;
    }

    public String getBlthSno() {
        return this.blthSno;
    }

    public String getBlthTtl() {
        return this.blthTtl;
    }

    public String getBlthTypCd() {
        return this.blthTypCd;
    }

    public String getBltnEndDtm() {
        return this.bltnEndDtm;
    }

    public String getBltnSrsq() {
        return this.bltnSrsq;
    }

    public String getBltnSttDtm() {
        return this.bltnSttDtm;
    }

    public String getBltnYn() {
        return this.bltnYn;
    }

    public String getCardTypCd() {
        return this.cardTypCd;
    }

    public String getDeductionDtm() {
        return this.deductionDtm;
    }

    public String getDtlTtl2() {
        return this.dtlTtl2;
    }

    public String getEventYn() {
        return this.eventYn;
    }

    public String getFrcAdvrId() {
        return this.frcAdvrId;
    }

    public String getFrcId() {
        return this.frcId;
    }

    public String getFrcNm() {
        return this.frcNm;
    }

    public String getFrcSno() {
        return this.frcSno;
    }

    public String getFrcTt() {
        return this.frcCtt;
    }

    public String getImgAtflId() {
        return this.imgAtflId;
    }

    public String getImgPath() {
        return this.imgPath;
    }

    public String getKsccAdvrId() {
        return this.ksccAdvrId;
    }

    public String getLtntLocTypCd() {
        return this.ltntLocTypCd;
    }

    public String getLtntTypeCd() {
        return this.ltntTypeCd;
    }

    public String getMbrsPntTot() {
        return this.mbrsPntTot;
    }

    public String getMileageAmt() {
        return this.mileageAmt;
    }

    public String getMncrCd() {
        return this.mncrCd;
    }

    public String getNoticeYn() {
        return this.noticeYn;
    }

    public String getPayPnt() {
        return this.payPnt;
    }

    public String getPckgNm() {
        return this.pckgNm;
    }

    public String getPrdDtlUrl() {
        return this.prdDtlUrl;
    }

    public String getPrdId() {
        return this.prdId;
    }

    public String getRandingPageYn() {
        return this.randingPageYn;
    }

    public String getResultCd() {
        return this.resultCd;
    }

    public String getRgtDtm() {
        return this.rgtDtm;
    }

    public String getTabDvs() {
        return this.tabDvs;
    }

    public String getTabNm() {
        return this.tabNm;
    }

    public String getTabUrl() {
        return this.tabUrl;
    }

    public String getThumImgUrl() {
        return this.thumImgUrl;
    }

    public String getUrlAddr() {
        return this.urlAddr;
    }

    public String getrecommYn() {
        return this.recommYn;
    }

    public void setAddr(String str) {
        this.addr = str;
    }

    public void setAdvrAppPkg(String str) {
        this.advrAppPkg = str;
    }

    public void setAdvrChkYn(String str) {
        this.advrChkYn = str;
    }

    public void setAdvrId(String str) {
        this.advrId = str;
    }

    public void setAdvrInflPathDvs(String str) {
        this.advrInflPathDvs = str;
    }

    public void setAdvrTtl(String str) {
        this.advrTtl = str;
    }

    public void setAdvrTyp(String str) {
        this.advrTyp = str;
    }

    public void setAdvrUrl(String str) {
        this.advrUrl = str;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppNm(String str) {
        this.appNm = str;
    }

    public void setAuthRst(String str) {
        this.authRst = str;
    }

    public void setBlthCtt(String str) {
        this.blthCtt = str;
    }

    public void setBlthSno(String str) {
        this.blthSno = str;
    }

    public void setBlthTtl(String str) {
        this.blthTtl = str;
    }

    public void setBlthTypCd(String str) {
        this.blthTypCd = str;
    }

    public void setBltnEndDtm(String str) {
        this.bltnEndDtm = str;
    }

    public void setBltnSrsq(String str) {
        this.bltnSrsq = str;
    }

    public void setBltnSttDtm(String str) {
        this.bltnSttDtm = str;
    }

    public void setBltnYn(String str) {
        this.bltnYn = str;
    }

    public void setCardTypCd(String str) {
        this.cardTypCd = str;
    }

    public void setDeductionDtm(String str) {
        this.deductionDtm = str;
    }

    public void setDtlTtl2(String str) {
        this.dtlTtl2 = str;
    }

    public void setEventYn(String str) {
        this.eventYn = str;
    }

    public void setFrcAdvrId(String str) {
        this.frcAdvrId = str;
    }

    public void setFrcId(String str) {
        this.frcId = str;
    }

    public void setFrcNm(String str) {
        this.frcNm = str;
    }

    public void setFrcSno(String str) {
        this.frcSno = str;
    }

    public void setFrcTt(String str) {
        this.frcCtt = str;
    }

    public void setImgAtflId(String str) {
        this.imgAtflId = str;
    }

    public void setImgPath(String str) {
        this.imgPath = str;
    }

    public void setKsccAdvrId(String str) {
        this.ksccAdvrId = str;
    }

    public void setLtntLocTypCd(String str) {
        this.ltntLocTypCd = str;
    }

    public void setLtntTypeCd(String str) {
        this.ltntTypeCd = str;
    }

    public void setMbrsPntTot(String str) {
        this.mbrsPntTot = str;
    }

    public void setMileageAmt(String str) {
        this.mileageAmt = str;
    }

    public void setMncrCd(String str) {
        this.mncrCd = str;
    }

    public void setNoticeYn(String str) {
        this.noticeYn = str;
    }

    public void setPayPnt(String str) {
        this.payPnt = str;
    }

    public void setPckgNm(String str) {
        this.pckgNm = str;
    }

    public void setPrdDtlUrl(String str) {
        this.prdDtlUrl = str;
    }

    public void setPrdId(String str) {
        this.prdId = str;
    }

    public void setRandingPageYn(String str) {
        this.randingPageYn = str;
    }

    public void setRecommYn(String str) {
        this.recommYn = str;
    }

    public void setResultCd(String str) {
        this.resultCd = str;
    }

    public void setRgtDtm(String str) {
        this.rgtDtm = str;
    }

    public void setTabDvs(String str) {
        this.tabDvs = str;
    }

    public void setTabNm(String str) {
        this.tabNm = str;
    }

    public void setTabUrl(String str) {
        this.tabUrl = str;
    }

    public void setThumImgUrl(String str) {
        this.thumImgUrl = str;
    }

    public void setUrlAddr(String str) {
        this.urlAddr = str;
    }

    protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.addr) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 195);
            jsonWriter.value(this.addr);
        }
        if (this != this.advrAppPkg) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 559);
            jsonWriter.value(this.advrAppPkg);
        }
        if (this != this.advrChkYn) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 239);
            jsonWriter.value(this.advrChkYn);
        }
        if (this != this.advrId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 693);
            jsonWriter.value(this.advrId);
        }
        if (this != this.advrInflPathDvs) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 452);
            jsonWriter.value(this.advrInflPathDvs);
        }
        if (this != this.advrTtl) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 852);
            jsonWriter.value(this.advrTtl);
        }
        if (this != this.advrTyp) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 470);
            jsonWriter.value(this.advrTyp);
        }
        if (this != this.advrUrl) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 745);
            jsonWriter.value(this.advrUrl);
        }
        if (this != this.appId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 302);
            jsonWriter.value(this.appId);
        }
        if (this != this.appNm) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 502);
            jsonWriter.value(this.appNm);
        }
        if (this != this.authRst) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 370);
            jsonWriter.value(this.authRst);
        }
        if (this != this.blthCtt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 83);
            jsonWriter.value(this.blthCtt);
        }
        if (this != this.blthSno) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 776);
            jsonWriter.value(this.blthSno);
        }
        if (this != this.blthTtl) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 391);
            jsonWriter.value(this.blthTtl);
        }
        if (this != this.blthTypCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 851);
            jsonWriter.value(this.blthTypCd);
        }
        if (this != this.bltnEndDtm) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 596);
            jsonWriter.value(this.bltnEndDtm);
        }
        if (this != this.bltnSrsq) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 575);
            jsonWriter.value(this.bltnSrsq);
        }
        if (this != this.bltnSttDtm) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 268);
            jsonWriter.value(this.bltnSttDtm);
        }
        if (this != this.bltnYn) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 676);
            jsonWriter.value(this.bltnYn);
        }
        if (this != this.cardTypCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 639);
            jsonWriter.value(this.cardTypCd);
        }
        if (this != this.deductionDtm) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 227);
            jsonWriter.value(this.deductionDtm);
        }
        if (this != this.dtlTtl2) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 605);
            jsonWriter.value(this.dtlTtl2);
        }
        if (this != this.eventYn) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 382);
            jsonWriter.value(this.eventYn);
        }
        if (this != this.frcAdvrId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 543);
            jsonWriter.value(this.frcAdvrId);
        }
        if (this != this.frcCtt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 35);
            jsonWriter.value(this.frcCtt);
        }
        if (this != this.frcId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 726);
            jsonWriter.value(this.frcId);
        }
        if (this != this.frcNm) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 723);
            jsonWriter.value(this.frcNm);
        }
        if (this != this.frcSno) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 796);
            jsonWriter.value(this.frcSno);
        }
        if (this != this.imgAtflId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 807);
            jsonWriter.value(this.imgAtflId);
        }
        if (this != this.imgPath) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 666);
            jsonWriter.value(this.imgPath);
        }
        if (this != this.ksccAdvrId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 503);
            jsonWriter.value(this.ksccAdvrId);
        }
        if (this != this.ltntLocTypCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 521);
            jsonWriter.value(this.ltntLocTypCd);
        }
        if (this != this.ltntTypeCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 316);
            jsonWriter.value(this.ltntTypeCd);
        }
        if (this != this.mbrsPntTot) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 554);
            jsonWriter.value(this.mbrsPntTot);
        }
        if (this != this.mileageAmt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 75);
            jsonWriter.value(this.mileageAmt);
        }
        if (this != this.mncrCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 440);
            jsonWriter.value(this.mncrCd);
        }
        if (this != this.noticeYn) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 129);
            jsonWriter.value(this.noticeYn);
        }
        if (this != this.payPnt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 294);
            jsonWriter.value(this.payPnt);
        }
        if (this != this.pckgNm) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 168);
            jsonWriter.value(this.pckgNm);
        }
        if (this != this.prdDtlUrl) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 663);
            jsonWriter.value(this.prdDtlUrl);
        }
        if (this != this.prdId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 278);
            jsonWriter.value(this.prdId);
        }
        if (this != this.randingPageYn) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 49);
            jsonWriter.value(this.randingPageYn);
        }
        if (this != this.recommYn) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 688);
            jsonWriter.value(this.recommYn);
        }
        if (this != this.resultCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 155);
            jsonWriter.value(this.resultCd);
        }
        if (this != this.rgtDtm) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 88);
            jsonWriter.value(this.rgtDtm);
        }
        if (this != this.tabDvs) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 47);
            jsonWriter.value(this.tabDvs);
        }
        if (this != this.tabNm) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 194);
            jsonWriter.value(this.tabNm);
        }
        if (this != this.tabUrl) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 599);
            jsonWriter.value(this.tabUrl);
        }
        if (this != this.thumImgUrl) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 257);
            jsonWriter.value(this.thumImgUrl);
        }
        if (this != this.urlAddr) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 365);
            jsonWriter.value(this.urlAddr);
        }
    }

    public /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onNavigationEvent(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        switch (i) {
            case 4:
                if (!z) {
                    this.tabUrl = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.tabUrl = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.tabUrl = jsonReader.nextString();
                    break;
                }
            case UCPApiConstants.MULTI_UICC_MIN_SEIOAGENT_VERSION_CODE /* 18 */:
                if (!z) {
                    this.eventYn = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.eventYn = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.eventYn = jsonReader.nextString();
                    break;
                }
            case 35:
                if (!z) {
                    this.payPnt = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.payPnt = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.payPnt = jsonReader.nextString();
                    break;
                }
            case 49:
                if (!z) {
                    this.thumImgUrl = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.thumImgUrl = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.thumImgUrl = jsonReader.nextString();
                    break;
                }
            case 50:
                if (!z) {
                    this.advrUrl = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.advrUrl = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.advrUrl = jsonReader.nextString();
                    break;
                }
            case 103:
                if (!z) {
                    this.blthSno = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.blthSno = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.blthSno = jsonReader.nextString();
                    break;
                }
            case 104:
                if (!z) {
                    this.ltntLocTypCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.ltntLocTypCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.ltntLocTypCd = jsonReader.nextString();
                    break;
                }
            case 106:
                if (!z) {
                    this.pckgNm = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.pckgNm = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.pckgNm = jsonReader.nextString();
                    break;
                }
            case 107:
                if (!z) {
                    this.frcId = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.frcId = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.frcId = jsonReader.nextString();
                    break;
                }
            case 116:
                if (!z) {
                    this.blthTtl = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.blthTtl = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.blthTtl = jsonReader.nextString();
                    break;
                }
            case 166:
                if (!z) {
                    this.bltnSrsq = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.bltnSrsq = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.bltnSrsq = jsonReader.nextString();
                    break;
                }
            case 172:
                if (!z) {
                    this.mncrCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.mncrCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.mncrCd = jsonReader.nextString();
                    break;
                }
            case 182:
                if (!z) {
                    this.advrTyp = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.advrTyp = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.advrTyp = jsonReader.nextString();
                    break;
                }
            case 187:
                if (!z) {
                    this.imgAtflId = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.imgAtflId = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.imgAtflId = jsonReader.nextString();
                    break;
                }
            case 190:
                if (!z) {
                    this.bltnEndDtm = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.bltnEndDtm = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.bltnEndDtm = jsonReader.nextString();
                    break;
                }
            case 209:
                if (!z) {
                    this.bltnYn = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.bltnYn = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.bltnYn = jsonReader.nextString();
                    break;
                }
            case 263:
                if (!z) {
                    this.imgPath = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.imgPath = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.imgPath = jsonReader.nextString();
                    break;
                }
            case 320:
                if (!z) {
                    this.advrTtl = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.advrTtl = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.advrTtl = jsonReader.nextString();
                    break;
                }
            case 346:
                if (!z) {
                    this.mbrsPntTot = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.mbrsPntTot = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.mbrsPntTot = jsonReader.nextString();
                    break;
                }
            case 360:
                if (!z) {
                    this.mileageAmt = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.mileageAmt = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.mileageAmt = jsonReader.nextString();
                    break;
                }
            case 362:
                if (!z) {
                    this.advrInflPathDvs = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.advrInflPathDvs = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.advrInflPathDvs = jsonReader.nextString();
                    break;
                }
            case 367:
                if (!z) {
                    this.prdDtlUrl = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.prdDtlUrl = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.prdDtlUrl = jsonReader.nextString();
                    break;
                }
            case 390:
                if (!z) {
                    this.resultCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.resultCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.resultCd = jsonReader.nextString();
                    break;
                }
            case 401:
                if (!z) {
                    this.frcSno = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.frcSno = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.frcSno = jsonReader.nextString();
                    break;
                }
            case 402:
                if (!z) {
                    this.cardTypCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.cardTypCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.cardTypCd = jsonReader.nextString();
                    break;
                }
            case 430:
                if (!z) {
                    this.randingPageYn = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.randingPageYn = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.randingPageYn = jsonReader.nextString();
                    break;
                }
            case 444:
                if (!z) {
                    this.appId = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.appId = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.appId = jsonReader.nextString();
                    break;
                }
            case 446:
                if (!z) {
                    this.frcCtt = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.frcCtt = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.frcCtt = jsonReader.nextString();
                    break;
                }
            case 454:
                if (!z) {
                    this.recommYn = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.recommYn = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.recommYn = jsonReader.nextString();
                    break;
                }
            case 455:
                if (!z) {
                    this.ltntTypeCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.ltntTypeCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.ltntTypeCd = jsonReader.nextString();
                    break;
                }
            case 479:
                if (!z) {
                    this.bltnSttDtm = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.bltnSttDtm = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.bltnSttDtm = jsonReader.nextString();
                    break;
                }
            case 480:
                if (!z) {
                    this.frcNm = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.frcNm = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.frcNm = jsonReader.nextString();
                    break;
                }
            case 483:
                if (!z) {
                    this.urlAddr = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.urlAddr = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.urlAddr = jsonReader.nextString();
                    break;
                }
            case 489:
                if (!z) {
                    this.rgtDtm = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.rgtDtm = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.rgtDtm = jsonReader.nextString();
                    break;
                }
            case 500:
                if (!z) {
                    this.deductionDtm = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.deductionDtm = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.deductionDtm = jsonReader.nextString();
                    break;
                }
            case 524:
                if (!z) {
                    this.frcAdvrId = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.frcAdvrId = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.frcAdvrId = jsonReader.nextString();
                    break;
                }
            case 540:
                if (!z) {
                    this.noticeYn = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.noticeYn = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.noticeYn = jsonReader.nextString();
                    break;
                }
            case 546:
                if (!z) {
                    this.tabDvs = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.tabDvs = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.tabDvs = jsonReader.nextString();
                    break;
                }
            case 565:
                if (!z) {
                    this.addr = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.addr = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.addr = jsonReader.nextString();
                    break;
                }
            case 591:
                if (!z) {
                    this.prdId = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.prdId = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.prdId = jsonReader.nextString();
                    break;
                }
            case 690:
                if (!z) {
                    this.appNm = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.appNm = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.appNm = jsonReader.nextString();
                    break;
                }
            case 755:
                if (!z) {
                    this.advrChkYn = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.advrChkYn = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.advrChkYn = jsonReader.nextString();
                    break;
                }
            case 785:
                if (!z) {
                    this.ksccAdvrId = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.ksccAdvrId = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.ksccAdvrId = jsonReader.nextString();
                    break;
                }
            case 796:
                if (!z) {
                    this.authRst = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.authRst = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.authRst = jsonReader.nextString();
                    break;
                }
            case 811:
                if (!z) {
                    this.dtlTtl2 = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.dtlTtl2 = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.dtlTtl2 = jsonReader.nextString();
                    break;
                }
            case 826:
                if (!z) {
                    this.tabNm = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.tabNm = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.tabNm = jsonReader.nextString();
                    break;
                }
            case 828:
                if (!z) {
                    this.advrAppPkg = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.advrAppPkg = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.advrAppPkg = jsonReader.nextString();
                    break;
                }
            case 845:
                if (!z) {
                    this.blthCtt = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.blthCtt = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.blthCtt = jsonReader.nextString();
                    break;
                }
            case 849:
                if (!z) {
                    this.blthTypCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.blthTypCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.blthTypCd = jsonReader.nextString();
                    break;
                }
            case 860:
                if (!z) {
                    this.advrId = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.advrId = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.advrId = jsonReader.nextString();
                    break;
                }
            default:
                jsonReader.skipValue();
                break;
        }
    }
}
