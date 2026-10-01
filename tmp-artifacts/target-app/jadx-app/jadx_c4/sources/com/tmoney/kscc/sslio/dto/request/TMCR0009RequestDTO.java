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
public class TMCR0009RequestDTO implements RequestDTO.Request {
    private String chgAmt;
    private String iLoadRst;
    private String mbphNo;
    private String pltCardNo;
    private String pymAmt;
    private String pymInf;
    private String pymMnsTypCd;
    private String slctRst;
    private String svcUtam;
    private String tmcrNo;
    private String unicId;
    private String utamMnsCd;

    public String getChgAmt() {
        return this.chgAmt;
    }

    public String getMbphNo() {
        return this.mbphNo;
    }

    public String getPltCardNo() {
        return this.pltCardNo;
    }

    public String getPymAmt() {
        return this.pymAmt;
    }

    public String getPymInf() {
        return this.pymInf;
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

    public String getUnicId() {
        return this.unicId;
    }

    public String getUtamMnsCd() {
        return this.utamMnsCd;
    }

    public String getiLoadRst() {
        return this.iLoadRst;
    }

    public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setChgAmt(String str) {
        this.chgAmt = str;
    }

    public void setMbphNo(String str) {
        this.mbphNo = str;
    }

    public void setPltCardNo(String str) {
        this.pltCardNo = str;
    }

    public void setPymAmt(String str) {
        this.pymAmt = str;
    }

    public void setPymInf(String str) {
        this.pymInf = str;
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

    public void setUnicId(String str) {
        this.unicId = str;
    }

    public void setUtamMnsCd(String str) {
        this.utamMnsCd = str;
    }

    public void setiLoadRst(String str) {
        this.iLoadRst = str;
    }

    protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.chgAmt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 240);
            jsonWriter.value(this.chgAmt);
        }
        if (this != this.iLoadRst) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 260);
            jsonWriter.value(this.iLoadRst);
        }
        if (this != this.mbphNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 517);
            jsonWriter.value(this.mbphNo);
        }
        if (this != this.pltCardNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 650);
            jsonWriter.value(this.pltCardNo);
        }
        if (this != this.pymAmt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 105);
            jsonWriter.value(this.pymAmt);
        }
        if (this != this.pymInf) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 671);
            jsonWriter.value(this.pymInf);
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

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onWarmupCompleted(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, int i) {
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
            case 236:
                if (!z) {
                    this.pymInf = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.pymInf = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.pymInf = jsonReader.nextString();
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
            case 757:
                if (!z) {
                    this.pltCardNo = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.pltCardNo = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.pltCardNo = jsonReader.nextString();
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
