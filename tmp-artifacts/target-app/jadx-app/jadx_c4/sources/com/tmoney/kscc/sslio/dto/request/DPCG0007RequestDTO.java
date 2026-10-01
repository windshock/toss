package com.tmoney.kscc.sslio.dto.request;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.LiveCheckConstants;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class DPCG0007RequestDTO implements RequestDTO.Request {
    private String bftrBal;
    private String chgAmt;
    private String crcmCd;
    private String crdtChecDvsCd;
    private String cvc;
    private String encTgtDvsCd;
    private String mbphNo;
    private String mvnoCd;
    private String ontp;
    private String pymBrdt;
    private String pymCardNo;
    private String pymExdt;
    private String pymFrgnYn;
    private String pymGndrCd;
    private String pymPwd;
    private String slctRst;
    private String tlcmCd;
    private String tmcrNo;
    private String unicId;

    public String getBftrBal() {
        return this.bftrBal;
    }

    public String getChgAmt() {
        return this.chgAmt;
    }

    public String getCrcmCd() {
        return this.crcmCd;
    }

    public String getCrdtChecDvsCd() {
        return this.crdtChecDvsCd;
    }

    public String getCvc() {
        return this.cvc;
    }

    public String getEncTgtDvsCd() {
        return this.encTgtDvsCd;
    }

    public String getMbphNo() {
        return this.mbphNo;
    }

    public String getMvnoCd() {
        return this.mvnoCd;
    }

    public String getOntp() {
        return this.ontp;
    }

    public String getPymBrdt() {
        return this.pymBrdt;
    }

    public String getPymCardNo() {
        return this.pymCardNo;
    }

    public String getPymExdt() {
        return this.pymExdt;
    }

    public String getPymFrgnYn() {
        return this.pymFrgnYn;
    }

    public String getPymGndrCd() {
        return this.pymGndrCd;
    }

    public String getPymPwd() {
        return this.pymPwd;
    }

    public String getSlctRst() {
        return this.slctRst;
    }

    public String getTlcmCd() {
        return this.tlcmCd;
    }

    public String getTmcrNo() {
        return this.tmcrNo;
    }

    public String getUnicId() {
        return this.unicId;
    }

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setBftrBal(String str) {
        this.bftrBal = str;
    }

    public void setChgAmt(String str) {
        this.chgAmt = str;
    }

    public void setCrcmCd(String str) {
        this.crcmCd = str;
    }

    public void setCrdtChecDvsCd(String str) {
        this.crdtChecDvsCd = str;
    }

    public void setCvc(String str) {
        this.cvc = str;
    }

    public void setEncTgtDvsCd(String str) {
        this.encTgtDvsCd = str;
    }

    public void setMbphNo(String str) {
        this.mbphNo = str;
    }

    public void setMvnoCd(String str) {
        this.mvnoCd = str;
    }

    public void setOntp(String str) {
        this.ontp = str;
    }

    public void setPymBrdt(String str) {
        this.pymBrdt = str;
    }

    public void setPymCardNo(String str) {
        this.pymCardNo = str;
    }

    public void setPymExdt(String str) {
        this.pymExdt = str;
    }

    public void setPymFrgnYn(String str) {
        this.pymFrgnYn = str;
    }

    public void setPymGndrCd(String str) {
        this.pymGndrCd = str;
    }

    public void setPymPwd(String str) {
        this.pymPwd = str;
    }

    public void setSlctRst(String str) {
        this.slctRst = str;
    }

    public void setTlcmCd(String str) {
        this.tlcmCd = str;
    }

    public void setTmcrNo(String str) {
        this.tmcrNo = str;
    }

    public void setUnicId(String str) {
        this.unicId = str;
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.bftrBal) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 528);
            jsonWriter.value(this.bftrBal);
        }
        if (this != this.chgAmt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 240);
            jsonWriter.value(this.chgAmt);
        }
        if (this != this.crcmCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 801);
            jsonWriter.value(this.crcmCd);
        }
        if (this != this.crdtChecDvsCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 296);
            jsonWriter.value(this.crdtChecDvsCd);
        }
        if (this != this.cvc) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 130);
            jsonWriter.value(this.cvc);
        }
        if (this != this.encTgtDvsCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 496);
            jsonWriter.value(this.encTgtDvsCd);
        }
        if (this != this.mbphNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 517);
            jsonWriter.value(this.mbphNo);
        }
        if (this != this.mvnoCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 199);
            jsonWriter.value(this.mvnoCd);
        }
        if (this != this.ontp) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 640);
            jsonWriter.value(this.ontp);
        }
        if (this != this.pymBrdt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 839);
            jsonWriter.value(this.pymBrdt);
        }
        if (this != this.pymCardNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 504);
            jsonWriter.value(this.pymCardNo);
        }
        if (this != this.pymExdt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 841);
            jsonWriter.value(this.pymExdt);
        }
        if (this != this.pymFrgnYn) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 354);
            jsonWriter.value(this.pymFrgnYn);
        }
        if (this != this.pymGndrCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 436);
            jsonWriter.value(this.pymGndrCd);
        }
        if (this != this.pymPwd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 339);
            jsonWriter.value(this.pymPwd);
        }
        if (this != this.slctRst) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 37);
            jsonWriter.value(this.slctRst);
        }
        if (this != this.tlcmCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 33);
            jsonWriter.value(this.tlcmCd);
        }
        if (this != this.tmcrNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 114);
            jsonWriter.value(this.tmcrNo);
        }
        if (this != this.unicId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 595);
            jsonWriter.value(this.unicId);
        }
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onNavigationEvent(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        switch (i) {
            case LiveCheckConstants.SVC_U1 /* 12 */:
                if (!z) {
                    this.cvc = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.cvc = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.cvc = jsonReader.nextString();
                    break;
                }
            case 53:
                if (!z) {
                    this.chgAmt = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.chgAmt = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.chgAmt = jsonReader.nextString();
                    break;
                }
            case 161:
                if (!z) {
                    this.bftrBal = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.bftrBal = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.bftrBal = jsonReader.nextString();
                    break;
                }
            case 167:
                if (!z) {
                    this.pymBrdt = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.pymBrdt = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.pymBrdt = jsonReader.nextString();
                    break;
                }
            case 201:
                if (!z) {
                    this.crcmCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.crcmCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.crcmCd = jsonReader.nextString();
                    break;
                }
            case 323:
                if (!z) {
                    this.crdtChecDvsCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.crdtChecDvsCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.crdtChecDvsCd = jsonReader.nextString();
                    break;
                }
            case 349:
                if (!z) {
                    this.pymFrgnYn = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.pymFrgnYn = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.pymFrgnYn = jsonReader.nextString();
                    break;
                }
            case 456:
                if (!z) {
                    this.pymCardNo = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.pymCardNo = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.pymCardNo = jsonReader.nextString();
                    break;
                }
            case 507:
                if (!z) {
                    this.slctRst = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.slctRst = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.slctRst = jsonReader.nextString();
                    break;
                }
            case 511:
                if (!z) {
                    this.mbphNo = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.mbphNo = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.mbphNo = jsonReader.nextString();
                    break;
                }
            case 578:
                if (!z) {
                    this.pymExdt = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.pymExdt = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.pymExdt = jsonReader.nextString();
                    break;
                }
            case 593:
                if (!z) {
                    this.unicId = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.unicId = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.unicId = jsonReader.nextString();
                    break;
                }
            case 696:
                if (!z) {
                    this.tlcmCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.tlcmCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.tlcmCd = jsonReader.nextString();
                    break;
                }
            case 715:
                if (!z) {
                    this.mvnoCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.mvnoCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.mvnoCd = jsonReader.nextString();
                    break;
                }
            case 761:
                if (!z) {
                    this.tmcrNo = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.tmcrNo = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.tmcrNo = jsonReader.nextString();
                    break;
                }
            case 804:
                if (!z) {
                    this.encTgtDvsCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.encTgtDvsCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.encTgtDvsCd = jsonReader.nextString();
                    break;
                }
            case 825:
                if (!z) {
                    this.pymGndrCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.pymGndrCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.pymGndrCd = jsonReader.nextString();
                    break;
                }
            case 843:
                if (!z) {
                    this.pymPwd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.pymPwd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.pymPwd = jsonReader.nextString();
                    break;
                }
            case 855:
                if (!z) {
                    this.ontp = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.ontp = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.ontp = jsonReader.nextString();
                    break;
                }
            default:
                jsonReader.skipValue();
                break;
        }
    }
}
