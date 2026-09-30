package com.tmoney.kscc.sslio.dto.request;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class PRCG0001RequestDTO implements RequestDTO.Request {
    private String autMnlDvsCd;
    private String chgAmt;
    private String crcmCd;
    private String crdtChecDvsCd;
    private String iLoadRst;
    private String mbphNo;
    private String mrkgUserId;
    private String mrkgUserPw;
    private String pymAmt;
    private String pymMnsTypCd;
    private String slctRst;
    private String svcUtam;
    private String tmcrNo;
    private String unicId;
    private String utamMnsCd;

    public String getAutMnlDvsCd() {
        return this.autMnlDvsCd;
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

    public String getILoadRst() {
        return this.iLoadRst;
    }

    public String getMbphNo() {
        return this.mbphNo;
    }

    public String getMrkgUserId() {
        return this.mrkgUserId;
    }

    public String getMrkgUserPw() {
        return this.mrkgUserPw;
    }

    public String getPymAmt() {
        return this.pymAmt;
    }

    public String getPymMnsTypCd() {
        return this.pymMnsTypCd;
    }

    public String getSlctRst() {
        return this.slctRst;
    }

    public String getSvcUtam() {
        return this.svcUtam;
    }

    public String getTmcrNo() {
        return this.tmcrNo;
    }

    public String getUnic() {
        return this.unicId;
    }

    public String getUtamMnsCd() {
        return this.utamMnsCd;
    }

    public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setAutMnlDvsCd(String str) {
        this.autMnlDvsCd = str;
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

    public void setILoadRst(String str) {
        this.iLoadRst = str;
    }

    public void setMbphNo(String str) {
        this.mbphNo = str;
    }

    public void setMrkgUserId(String str) {
        this.mrkgUserId = str;
    }

    public void setMrkgUserPw(String str) {
        this.mrkgUserPw = str;
    }

    public void setPymAmt(String str) {
        this.pymAmt = str;
    }

    public void setPymMnsTypCd(String str) {
        this.pymMnsTypCd = str;
    }

    public void setSlctRst(String str) {
        this.slctRst = str;
    }

    public void setSvcUtam(String str) {
        this.svcUtam = str;
    }

    public void setTmcrNo(String str) {
        this.tmcrNo = str;
    }

    public void setUnic(String str) {
        this.unicId = str;
    }

    public void setUtamMnsCd(String str) {
        this.utamMnsCd = str;
    }

    protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.autMnlDvsCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 122);
            jsonWriter.value(this.autMnlDvsCd);
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
        if (this != this.iLoadRst) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 260);
            jsonWriter.value(this.iLoadRst);
        }
        if (this != this.mbphNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 517);
            jsonWriter.value(this.mbphNo);
        }
        if (this != this.mrkgUserId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 204);
            jsonWriter.value(this.mrkgUserId);
        }
        if (this != this.mrkgUserPw) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 361);
            jsonWriter.value(this.mrkgUserPw);
        }
        if (this != this.pymAmt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 105);
            jsonWriter.value(this.pymAmt);
        }
        if (this != this.pymMnsTypCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 347);
            jsonWriter.value(this.pymMnsTypCd);
        }
        if (this != this.slctRst) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 37);
            jsonWriter.value(this.slctRst);
        }
        if (this != this.svcUtam) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 251);
            jsonWriter.value(this.svcUtam);
        }
        if (this != this.tmcrNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 114);
            jsonWriter.value(this.tmcrNo);
        }
        if (this != this.unicId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 595);
            jsonWriter.value(this.unicId);
        }
        if (this != this.utamMnsCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 20);
            jsonWriter.value(this.utamMnsCd);
        }
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onExtraCallbackWithResult(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        switch (i) {
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                if (!z) {
                    this.utamMnsCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.utamMnsCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.utamMnsCd = jsonReader.nextString();
                    break;
                }
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                if (!z) {
                    this.autMnlDvsCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.autMnlDvsCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.autMnlDvsCd = jsonReader.nextString();
                    break;
                }
            case 29:
                if (!z) {
                    this.svcUtam = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.svcUtam = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.svcUtam = jsonReader.nextString();
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
            case 82:
                if (!z) {
                    this.mrkgUserPw = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.mrkgUserPw = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.mrkgUserPw = jsonReader.nextString();
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
            case 532:
                if (!z) {
                    this.iLoadRst = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.iLoadRst = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.iLoadRst = jsonReader.nextString();
                    break;
                }
            case 569:
                if (!z) {
                    this.mrkgUserId = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.mrkgUserId = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.mrkgUserId = jsonReader.nextString();
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
            case 638:
                if (!z) {
                    this.pymMnsTypCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.pymMnsTypCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.pymMnsTypCd = jsonReader.nextString();
                    break;
                }
            case 695:
                if (!z) {
                    this.pymAmt = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.pymAmt = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.pymAmt = jsonReader.nextString();
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
            default:
                jsonReader.skipValue();
                break;
        }
    }
}
