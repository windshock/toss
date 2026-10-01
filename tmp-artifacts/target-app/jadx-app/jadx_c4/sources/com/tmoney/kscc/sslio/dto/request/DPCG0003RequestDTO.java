package com.tmoney.kscc.sslio.dto.request;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class DPCG0003RequestDTO implements RequestDTO.Request {
    private String autMnlDvsCd;
    private String chgAmt;
    private String dpyCncnMxchYn;
    private String iLoadRst;
    private String initPurchaseRst;
    private String mbphNo;
    private String slctRst;
    private String tmcrNo;
    private String unicId;

    public String getAutMnlDvsCd() {
        return this.autMnlDvsCd;
    }

    public String getChgAmt() {
        return this.chgAmt;
    }

    public String getDpyCncnMxchYn() {
        return this.dpyCncnMxchYn;
    }

    public String getILoadRst() {
        return this.iLoadRst;
    }

    public String getInitPurchaseRst() {
        return this.initPurchaseRst;
    }

    public String getMbphNo() {
        return this.mbphNo;
    }

    public String getSlctRst() {
        return this.slctRst;
    }

    public String getTmcrNo() {
        return this.tmcrNo;
    }

    public String getUnicId() {
        return this.unicId;
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setAutMnlDvsCd(String str) {
        this.autMnlDvsCd = str;
    }

    public void setChgAmt(String str) {
        this.chgAmt = str;
    }

    public void setDpyCncnMxchYn(String str) {
        this.dpyCncnMxchYn = str;
    }

    public void setILoadRst(String str) {
        this.iLoadRst = str;
    }

    public void setInitPurchaseRst(String str) {
        this.initPurchaseRst = str;
    }

    public void setMbphNo(String str) {
        this.mbphNo = str;
    }

    public void setSlctRst(String str) {
        this.slctRst = str;
    }

    public void setTmcrNo(String str) {
        this.tmcrNo = str;
    }

    public void setUnicId(String str) {
        this.unicId = str;
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.autMnlDvsCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 122);
            jsonWriter.value(this.autMnlDvsCd);
        }
        if (this != this.chgAmt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 240);
            jsonWriter.value(this.chgAmt);
        }
        if (this != this.dpyCncnMxchYn) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 101);
            jsonWriter.value(this.dpyCncnMxchYn);
        }
        if (this != this.iLoadRst) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 260);
            jsonWriter.value(this.iLoadRst);
        }
        if (this != this.initPurchaseRst) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 465);
            jsonWriter.value(this.initPurchaseRst);
        }
        if (this != this.mbphNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 517);
            jsonWriter.value(this.mbphNo);
        }
        if (this != this.slctRst) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 37);
            jsonWriter.value(this.slctRst);
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

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            IAuthTabCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 13) {
            if (!z) {
                this.autMnlDvsCd = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.autMnlDvsCd = jsonReader.nextString();
                return;
            } else {
                this.autMnlDvsCd = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
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
        if (i == 395) {
            if (!z) {
                this.initPurchaseRst = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.initPurchaseRst = jsonReader.nextString();
                return;
            } else {
                this.initPurchaseRst = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 427) {
            if (!z) {
                this.dpyCncnMxchYn = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.dpyCncnMxchYn = jsonReader.nextString();
                return;
            } else {
                this.dpyCncnMxchYn = Boolean.toString(jsonReader.nextBoolean());
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
        if (i == 532) {
            if (!z) {
                this.iLoadRst = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.iLoadRst = jsonReader.nextString();
                return;
            } else {
                this.iLoadRst = Boolean.toString(jsonReader.nextBoolean());
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
        if (i != 761) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.tmcrNo = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.tmcrNo = jsonReader.nextString();
        } else {
            this.tmcrNo = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
