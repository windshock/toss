package com.tmoney.dto;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.Serializable;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class PointRequestData implements Serializable {
    private static final long serialVersionUID = 1;

    @SerializedName("acmt_amt")
    private String acmtAmount;

    @SerializedName("acmt_canc_dvs_cd")
    private String acmtCancelDvsCode;

    @SerializedName("acmt_dvs")
    private String acmtDivision;

    @SerializedName("acmt_prd_nm")
    private String acmtProductName;

    @SerializedName("acmt_prd_id")
    private String acmtProductdId;

    @SerializedName("app_id")
    private String appId;

    @SerializedName("area")
    private String area;

    @SerializedName("brdt")
    private String birthDay;

    @SerializedName("card_no")
    private String cardNo;

    @SerializedName("CMD")
    private String cmd;

    @SerializedName("current_page")
    private String currentPage;

    @SerializedName("frc_id")
    private String frcId;

    @SerializedName("frc_trd_id")
    private String frcTradeId;

    @SerializedName("gndr")
    private String gender;

    @SerializedName("gift_mbr_mng_no")
    private String giftMbrMngNo;

    @SerializedName("gift_pnt")
    private String giftPoint;

    @SerializedName("gift_sta")
    private String giftStatus;

    @SerializedName("inqr_dvs")
    private String inqrDivision;

    @SerializedName("mbr_mng_no")
    private String memberManageNo;

    @SerializedName("message")
    private String message;

    @SerializedName("page_size")
    private String pageSize;

    @SerializedName("pnt_acmt_id")
    private String pointAcmtId;

    @SerializedName("pnt_gift_id")
    private String pointGiftId;

    @SerializedName("pnt_use_pwd")
    private String pointUsePassword;

    @SerializedName("ptu_cyc")
    private String ptuCycle;

    @SerializedName("srch_end_dt")
    private String srchEndDate;

    @SerializedName("srch_stt_dt")
    private String srchStartDate;

    @SerializedName("tgt_mbr_mng_no")
    private String targetMbrMngNo;

    @SerializedName("TOKEN")
    private String token;

    @SerializedName("uprc")
    private String uprc;

    @SerializedName("use_amt")
    private String useAmount;

    @SerializedName("use_dvs")
    private String useDivision;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getAcmtAmount() {
        return this.acmtAmount;
    }

    public String getAcmtCancelDvsCode() {
        return this.acmtCancelDvsCode;
    }

    public String getAcmtDivision() {
        return this.acmtDivision;
    }

    public String getAcmtProductName() {
        return this.acmtProductName;
    }

    public String getAcmtProductdId() {
        return this.acmtProductdId;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getArea() {
        return this.area;
    }

    public String getBirthDay() {
        return this.birthDay;
    }

    public String getCardNo() {
        return this.cardNo;
    }

    public String getCmd() {
        return this.cmd;
    }

    public String getCurrentPage() {
        return this.currentPage;
    }

    public String getFrcId() {
        return this.frcId;
    }

    public String getFrcTradeId() {
        return this.frcTradeId;
    }

    public String getGender() {
        return this.gender;
    }

    public String getGiftMbrMngNo() {
        return this.giftMbrMngNo;
    }

    public String getGiftPoint() {
        return this.giftPoint;
    }

    public String getGiftStatus() {
        return this.giftStatus;
    }

    public String getInqrDivision() {
        return this.inqrDivision;
    }

    public String getMemberManageNo() {
        return this.memberManageNo;
    }

    public String getMessage() {
        return this.message;
    }

    public String getPageSize() {
        return this.pageSize;
    }

    public String getPointAcmtId() {
        return this.pointAcmtId;
    }

    public String getPointGiftId() {
        return this.pointGiftId;
    }

    public String getPointUsePassword() {
        return this.pointUsePassword;
    }

    public String getPtuCycle() {
        return this.ptuCycle;
    }

    public String getSrchEndDate() {
        return this.srchEndDate;
    }

    public String getSrchStartDate() {
        return this.srchStartDate;
    }

    public String getTargetMbrMngNo() {
        return this.targetMbrMngNo;
    }

    public String getToken() {
        return this.token;
    }

    public String getUprc() {
        return this.uprc;
    }

    public String getUseAmount() {
        return this.useAmount;
    }

    public String getUseDivision() {
        return this.useDivision;
    }

    public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onNavigationEvent(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setAcmtAmount(String str) {
        this.acmtAmount = str;
    }

    public void setAcmtCancelDvsCode(String str) {
        this.acmtCancelDvsCode = str;
    }

    public void setAcmtDivision(String str) {
        this.acmtDivision = str;
    }

    public void setAcmtProductName(String str) {
        this.acmtProductName = str;
    }

    public void setAcmtProductdId(String str) {
        this.acmtProductdId = str;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setArea(String str) {
        this.area = str;
    }

    public void setBirthDay(String str) {
        this.birthDay = str;
    }

    public void setCardNo(String str) {
        this.cardNo = str;
    }

    public void setCmd(String str) {
        this.cmd = str;
    }

    public void setCurrentPage(String str) {
        this.currentPage = str;
    }

    public void setFrcId(String str) {
        this.frcId = str;
    }

    public void setFrcTradeId(String str) {
        this.frcTradeId = str;
    }

    public void setGender(String str) {
        this.gender = str;
    }

    public void setGiftMbrMngNo(String str) {
        this.giftMbrMngNo = str;
    }

    public void setGiftPoint(String str) {
        this.giftPoint = str;
    }

    public void setGiftStatus(String str) {
        this.giftStatus = str;
    }

    public void setInqrDivision(String str) {
        this.inqrDivision = str;
    }

    public void setMemberManageNo(String str) {
        this.memberManageNo = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setPageSize(String str) {
        this.pageSize = str;
    }

    public void setPointAcmtId(String str) {
        this.pointAcmtId = str;
    }

    public void setPointGiftId(String str) {
        this.pointGiftId = str;
    }

    public void setPointUsePassword(String str) {
        this.pointUsePassword = str;
    }

    public void setPtuCycle(String str) {
        this.ptuCycle = str;
    }

    public void setSrchEndDate(String str) {
        this.srchEndDate = str;
    }

    public void setSrchStartDate(String str) {
        this.srchStartDate = str;
    }

    public void setTargetMbrMngNo(String str) {
        this.targetMbrMngNo = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUprc(String str) {
        this.uprc = str;
    }

    public void setUseAmount(String str) {
        this.useAmount = str;
    }

    public void setUseDivision(String str) {
        this.useDivision = str;
    }

    protected /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.acmtAmount) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 165);
            jsonWriter.value(this.acmtAmount);
        }
        if (this != this.acmtCancelDvsCode) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 489);
            jsonWriter.value(this.acmtCancelDvsCode);
        }
        if (this != this.acmtDivision) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 179);
            jsonWriter.value(this.acmtDivision);
        }
        if (this != this.acmtProductName) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 24);
            jsonWriter.value(this.acmtProductName);
        }
        if (this != this.acmtProductdId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 632);
            jsonWriter.value(this.acmtProductdId);
        }
        if (this != this.appId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 476);
            jsonWriter.value(this.appId);
        }
        if (this != this.area) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 211);
            jsonWriter.value(this.area);
        }
        if (this != this.birthDay) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 443);
            jsonWriter.value(this.birthDay);
        }
        if (this != this.cardNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 304);
            jsonWriter.value(this.cardNo);
        }
        if (this != this.cmd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 657);
            jsonWriter.value(this.cmd);
        }
        if (this != this.currentPage) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 636);
            jsonWriter.value(this.currentPage);
        }
        if (this != this.frcId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 703);
            jsonWriter.value(this.frcId);
        }
        if (this != this.frcTradeId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 838);
            jsonWriter.value(this.frcTradeId);
        }
        if (this != this.gender) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 40);
            jsonWriter.value(this.gender);
        }
        if (this != this.giftMbrMngNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 403);
            jsonWriter.value(this.giftMbrMngNo);
        }
        if (this != this.giftPoint) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 111);
            jsonWriter.value(this.giftPoint);
        }
        if (this != this.giftStatus) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 90);
            jsonWriter.value(this.giftStatus);
        }
        if (this != this.inqrDivision) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 51);
            jsonWriter.value(this.inqrDivision);
        }
        if (this != this.memberManageNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 319);
            jsonWriter.value(this.memberManageNo);
        }
        if (this != this.message) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 848);
            jsonWriter.value(this.message);
        }
        if (this != this.pageSize) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 216);
            jsonWriter.value(this.pageSize);
        }
        if (this != this.pointAcmtId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 773);
            jsonWriter.value(this.pointAcmtId);
        }
        if (this != this.pointGiftId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 467);
            jsonWriter.value(this.pointGiftId);
        }
        if (this != this.pointUsePassword) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 494);
            jsonWriter.value(this.pointUsePassword);
        }
        if (this != this.ptuCycle) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 396);
            jsonWriter.value(this.ptuCycle);
        }
        if (this != this.srchEndDate) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 351);
            jsonWriter.value(this.srchEndDate);
        }
        if (this != this.srchStartDate) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 176);
            jsonWriter.value(this.srchStartDate);
        }
        if (this != this.targetMbrMngNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 121);
            jsonWriter.value(this.targetMbrMngNo);
        }
        if (this != this.token) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 329);
            jsonWriter.value(this.token);
        }
        if (this != this.uprc) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 551);
            jsonWriter.value(this.uprc);
        }
        if (this != this.useAmount) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 74);
            jsonWriter.value(this.useAmount);
        }
        if (this != this.useDivision) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 592);
            jsonWriter.value(this.useDivision);
        }
    }

    public /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onWarmupCompleted(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        switch (i) {
            case 6:
                if (!z) {
                    this.pointGiftId = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.pointGiftId = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.pointGiftId = jsonReader.nextString();
                    break;
                }
            case 91:
                if (!z) {
                    this.acmtProductdId = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.acmtProductdId = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.acmtProductdId = jsonReader.nextString();
                    break;
                }
            case 140:
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
            case 174:
                if (!z) {
                    this.giftStatus = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.giftStatus = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.giftStatus = jsonReader.nextString();
                    break;
                }
            case 207:
                if (!z) {
                    this.giftMbrMngNo = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.giftMbrMngNo = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.giftMbrMngNo = jsonReader.nextString();
                    break;
                }
            case 254:
                if (!z) {
                    this.token = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.token = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.token = jsonReader.nextString();
                    break;
                }
            case 260:
                if (!z) {
                    this.gender = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.gender = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.gender = jsonReader.nextString();
                    break;
                }
            case 287:
                if (!z) {
                    this.pointUsePassword = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.pointUsePassword = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.pointUsePassword = jsonReader.nextString();
                    break;
                }
            case 322:
                if (!z) {
                    this.pointAcmtId = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.pointAcmtId = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.pointAcmtId = jsonReader.nextString();
                    break;
                }
            case 329:
                if (!z) {
                    this.birthDay = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.birthDay = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.birthDay = jsonReader.nextString();
                    break;
                }
            case 339:
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
            case 428:
                if (!z) {
                    this.area = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.area = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.area = jsonReader.nextString();
                    break;
                }
            case 458:
                if (!z) {
                    this.cardNo = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.cardNo = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.cardNo = jsonReader.nextString();
                    break;
                }
            case 474:
                if (!z) {
                    this.cmd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.cmd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.cmd = jsonReader.nextString();
                    break;
                }
            case 498:
                if (!z) {
                    this.inqrDivision = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.inqrDivision = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.inqrDivision = jsonReader.nextString();
                    break;
                }
            case 530:
                if (!z) {
                    this.message = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.message = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.message = jsonReader.nextString();
                    break;
                }
            case 561:
                if (!z) {
                    this.acmtCancelDvsCode = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.acmtCancelDvsCode = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.acmtCancelDvsCode = jsonReader.nextString();
                    break;
                }
            case 574:
                if (!z) {
                    this.targetMbrMngNo = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.targetMbrMngNo = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.targetMbrMngNo = jsonReader.nextString();
                    break;
                }
            case 581:
                if (!z) {
                    this.pageSize = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.pageSize = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.pageSize = jsonReader.nextString();
                    break;
                }
            case 587:
                if (!z) {
                    this.useAmount = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.useAmount = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.useAmount = jsonReader.nextString();
                    break;
                }
            case 590:
                if (!z) {
                    this.srchEndDate = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.srchEndDate = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.srchEndDate = jsonReader.nextString();
                    break;
                }
            case 625:
                if (!z) {
                    this.uprc = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.uprc = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.uprc = jsonReader.nextString();
                    break;
                }
            case 662:
                if (!z) {
                    this.frcTradeId = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.frcTradeId = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.frcTradeId = jsonReader.nextString();
                    break;
                }
            case 671:
                if (!z) {
                    this.acmtDivision = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.acmtDivision = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.acmtDivision = jsonReader.nextString();
                    break;
                }
            case 704:
                if (!z) {
                    this.currentPage = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.currentPage = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.currentPage = jsonReader.nextString();
                    break;
                }
            case 819:
                if (!z) {
                    this.acmtAmount = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.acmtAmount = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.acmtAmount = jsonReader.nextString();
                    break;
                }
            case 829:
                if (!z) {
                    this.memberManageNo = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.memberManageNo = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.memberManageNo = jsonReader.nextString();
                    break;
                }
            case 840:
                if (!z) {
                    this.ptuCycle = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.ptuCycle = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.ptuCycle = jsonReader.nextString();
                    break;
                }
            case 842:
                if (!z) {
                    this.giftPoint = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.giftPoint = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.giftPoint = jsonReader.nextString();
                    break;
                }
            case 846:
                if (!z) {
                    this.acmtProductName = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.acmtProductName = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.acmtProductName = jsonReader.nextString();
                    break;
                }
            case 867:
                if (!z) {
                    this.useDivision = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.useDivision = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.useDivision = jsonReader.nextString();
                    break;
                }
            case 873:
                if (!z) {
                    this.srchStartDate = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.srchStartDate = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.srchStartDate = jsonReader.nextString();
                    break;
                }
            default:
                jsonReader.skipValue();
                break;
        }
    }
}
