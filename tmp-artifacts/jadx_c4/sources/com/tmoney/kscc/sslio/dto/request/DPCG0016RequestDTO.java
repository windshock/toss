package com.tmoney.kscc.sslio.dto.request;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class DPCG0016RequestDTO implements RequestDTO.Request {
    private String bftrBal;
    private String chgAmt;
    private String crcmCd;
    private String encTgtDvsCd;
    private String mbphNo;
    private String slctRst;
    private String tlcmCd;
    private String tmcrNo;
    private String unicId;

    public String getChgAmt() {
        return this.chgAmt;
    }

    public String getCrcmCd() {
        return this.crcmCd;
    }

    public String getMbphNo() {
        return this.mbphNo;
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
        onNavigationEvent(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
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

    public void setEncTgtDvsCd(String str) {
        this.encTgtDvsCd = str;
    }

    public void setMbphNo(String str) {
        this.mbphNo = str;
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

    protected /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
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
        if (this != this.encTgtDvsCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 496);
            jsonWriter.value(this.encTgtDvsCd);
        }
        if (this != this.mbphNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 517);
            jsonWriter.value(this.mbphNo);
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

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onExtraCallbackWithResult(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 53) {
            if (!z) {
                this.chgAmt = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.chgAmt = jsonReader.nextString();
                return;
            } else {
                this.chgAmt = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 161) {
            if (!z) {
                this.bftrBal = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.bftrBal = jsonReader.nextString();
                return;
            } else {
                this.bftrBal = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 201) {
            if (!z) {
                this.crcmCd = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.crcmCd = jsonReader.nextString();
                return;
            } else {
                this.crcmCd = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 507) {
            if (!z) {
                this.slctRst = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.slctRst = jsonReader.nextString();
                return;
            } else {
                this.slctRst = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 511) {
            if (!z) {
                this.mbphNo = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.mbphNo = jsonReader.nextString();
                return;
            } else {
                this.mbphNo = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 593) {
            if (!z) {
                this.unicId = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.unicId = jsonReader.nextString();
                return;
            } else {
                this.unicId = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 696) {
            if (!z) {
                this.tlcmCd = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.tlcmCd = jsonReader.nextString();
                return;
            } else {
                this.tlcmCd = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 761) {
            if (!z) {
                this.tmcrNo = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.tmcrNo = jsonReader.nextString();
                return;
            } else {
                this.tmcrNo = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 804) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.encTgtDvsCd = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.encTgtDvsCd = jsonReader.nextString();
        } else {
            this.encTgtDvsCd = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
