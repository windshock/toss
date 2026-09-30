package com.tmoney.kscc.sslio.dto.request;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class ACRY0001RequestDTO implements RequestDTO.Request {
    private String acntCusName;
    private String acntEncCd;
    private String acntNo;
    private String bnkCd;
    private String iuLoadRst;
    private String mbphNo;
    private String ryAmt;
    private String ryDvsCd;
    private String slctRst;
    private String svcUtam;
    private String tmcrNo;
    private String unicId;

    public String getAcntCusName() {
        return this.acntCusName;
    }

    public String getAcntEncCd() {
        return this.acntEncCd;
    }

    public String getAcntNo() {
        return this.acntNo;
    }

    public String getBnkCd() {
        return this.bnkCd;
    }

    public String getIuLoadRst() {
        return this.iuLoadRst;
    }

    public String getMbphNo() {
        return this.mbphNo;
    }

    public String getRyAmt() {
        return this.ryAmt;
    }

    public String getRyDvsCd() {
        return this.ryDvsCd;
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

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setAcntCusName(String str) {
        this.acntCusName = str;
    }

    public void setAcntEncCd(String str) {
        this.acntEncCd = str;
    }

    public void setAcntNo(String str) {
        this.acntNo = str;
    }

    public void setBnkCd(String str) {
        this.bnkCd = str;
    }

    public void setIuLoadRst(String str) {
        this.iuLoadRst = str;
    }

    public void setMbphNo(String str) {
        this.mbphNo = str;
    }

    public void setRyAmt(String str) {
        this.ryAmt = str;
    }

    public void setRyDvsCd(String str) {
        this.ryDvsCd = str;
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

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.acntCusName) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 472);
            jsonWriter.value(this.acntCusName);
        }
        if (this != this.acntEncCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 686);
            jsonWriter.value(this.acntEncCd);
        }
        if (this != this.acntNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 151);
            jsonWriter.value(this.acntNo);
        }
        if (this != this.bnkCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 54);
            jsonWriter.value(this.bnkCd);
        }
        if (this != this.iuLoadRst) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 350);
            jsonWriter.value(this.iuLoadRst);
        }
        if (this != this.mbphNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 517);
            jsonWriter.value(this.mbphNo);
        }
        if (this != this.ryAmt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 221);
            jsonWriter.value(this.ryAmt);
        }
        if (this != this.ryDvsCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 654);
            jsonWriter.value(this.ryDvsCd);
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
    }

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onExtraCallbackWithResult(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, int i) {
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
            case 342:
                if (!z) {
                    this.acntCusName = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.acntCusName = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.acntCusName = jsonReader.nextString();
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
            case 559:
                if (!z) {
                    this.acntNo = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.acntNo = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.acntNo = jsonReader.nextString();
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
            case 664:
                if (!z) {
                    this.ryDvsCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.ryDvsCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.ryDvsCd = jsonReader.nextString();
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
            case 775:
                if (!z) {
                    this.bnkCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.bnkCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.bnkCd = jsonReader.nextString();
                    break;
                }
            case 789:
                if (!z) {
                    this.acntEncCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.acntEncCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.acntEncCd = jsonReader.nextString();
                    break;
                }
            case 841:
                if (!z) {
                    this.ryAmt = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.ryAmt = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.ryAmt = jsonReader.nextString();
                    break;
                }
            case 864:
                if (!z) {
                    this.iuLoadRst = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.iuLoadRst = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.iuLoadRst = jsonReader.nextString();
                    break;
                }
            default:
                jsonReader.skipValue();
                break;
        }
    }
}
