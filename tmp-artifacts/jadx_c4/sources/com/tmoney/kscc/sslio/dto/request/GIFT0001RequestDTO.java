package com.tmoney.kscc.sslio.dto.request;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class GIFT0001RequestDTO implements RequestDTO.Request {
    private String gnrlSmpcDvsCd;
    private String iPurRst;
    private String limitAmt;
    private String mbphNo;
    private String rcvrMbphNo;
    private String rcvrMrkgUserId;
    private String reqAmt;
    private String sendMsgCtt;
    private String slctRst;
    private String sndrMrkgUserId;
    private String svcUtam;
    private String tmcrNo;
    private String unicId;

    public String getGnrlSmpcDvsCd() {
        return this.gnrlSmpcDvsCd;
    }

    public String getIPurRst() {
        return this.iPurRst;
    }

    public String getMbphNo() {
        return this.mbphNo;
    }

    public String getRcvrMbphNo() {
        return this.rcvrMbphNo;
    }

    public String getRcvrMrkgUserId() {
        return this.rcvrMrkgUserId;
    }

    public String getReqAmt() {
        return this.reqAmt;
    }

    public String getSendMsgCtt() {
        return this.sendMsgCtt;
    }

    public String getSlctRst() {
        return this.slctRst;
    }

    public String getSndrMrkgUserId() {
        return this.sndrMrkgUserId;
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

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setGnrlSmpcDvsCd(String str) {
        this.gnrlSmpcDvsCd = str;
    }

    public void setIPurRst(String str) {
        this.iPurRst = str;
    }

    public void setLimitAmt(String str) {
        this.limitAmt = str;
    }

    public void setMbphNo(String str) {
        this.mbphNo = str;
    }

    public void setRcvrMbphNo(String str) {
        this.rcvrMbphNo = str;
    }

    public void setRcvrMrkgUserId(String str) {
        this.rcvrMrkgUserId = str;
    }

    public void setReqAmt(String str) {
        this.reqAmt = str;
    }

    public void setSendMsgCtt(String str) {
        this.sendMsgCtt = str;
    }

    public void setSlctRst(String str) {
        this.slctRst = str;
    }

    public void setSndrMrkgUserId(String str) {
        this.sndrMrkgUserId = str;
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

    protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.gnrlSmpcDvsCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 637);
            jsonWriter.value(this.gnrlSmpcDvsCd);
        }
        if (this != this.iPurRst) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 430);
            jsonWriter.value(this.iPurRst);
        }
        if (this != this.limitAmt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 727);
            jsonWriter.value(this.limitAmt);
        }
        if (this != this.mbphNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 517);
            jsonWriter.value(this.mbphNo);
        }
        if (this != this.rcvrMbphNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 352);
            jsonWriter.value(this.rcvrMbphNo);
        }
        if (this != this.rcvrMrkgUserId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 478);
            jsonWriter.value(this.rcvrMrkgUserId);
        }
        if (this != this.reqAmt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 808);
            jsonWriter.value(this.reqAmt);
        }
        if (this != this.sendMsgCtt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 462);
            jsonWriter.value(this.sendMsgCtt);
        }
        if (this != this.slctRst) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 37);
            jsonWriter.value(this.slctRst);
        }
        if (this != this.sndrMrkgUserId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 154);
            jsonWriter.value(this.sndrMrkgUserId);
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
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onWarmupCompleted(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        switch (i) {
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
            case 94:
                if (!z) {
                    this.rcvrMbphNo = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.rcvrMbphNo = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.rcvrMbphNo = jsonReader.nextString();
                    break;
                }
            case 179:
                if (!z) {
                    this.gnrlSmpcDvsCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.gnrlSmpcDvsCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.gnrlSmpcDvsCd = jsonReader.nextString();
                    break;
                }
            case 251:
                if (!z) {
                    this.rcvrMrkgUserId = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.rcvrMrkgUserId = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.rcvrMrkgUserId = jsonReader.nextString();
                    break;
                }
            case 297:
                if (!z) {
                    this.iPurRst = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.iPurRst = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.iPurRst = jsonReader.nextString();
                    break;
                }
            case 497:
                if (!z) {
                    this.sndrMrkgUserId = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.sndrMrkgUserId = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.sndrMrkgUserId = jsonReader.nextString();
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
            case 659:
                if (!z) {
                    this.reqAmt = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.reqAmt = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.reqAmt = jsonReader.nextString();
                    break;
                }
            case 729:
                if (!z) {
                    this.limitAmt = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.limitAmt = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.limitAmt = jsonReader.nextString();
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
            case 813:
                if (!z) {
                    this.sendMsgCtt = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.sendMsgCtt = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.sendMsgCtt = jsonReader.nextString();
                    break;
                }
            default:
                jsonReader.skipValue();
                break;
        }
    }
}
