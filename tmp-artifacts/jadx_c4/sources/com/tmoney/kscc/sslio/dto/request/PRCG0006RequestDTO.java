package com.tmoney.kscc.sslio.dto.request;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class PRCG0006RequestDTO implements RequestDTO.Request {
    private String chgAmt;
    private String iLoadRst;
    private String mbphNo;
    private String pymAmt;
    private String pymInf;
    private String pymMnsTypCd;
    private String slctRst;
    private String svcUtam;
    private String tmcrNo;
    private String unicId;

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onNavigationEvent(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public String getChgAmt() {
        return this.chgAmt;
    }

    public String getILoadRst() {
        return this.iLoadRst;
    }

    public String getMbphNo() {
        return this.mbphNo;
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

    public String getUnic() {
        return this.unicId;
    }

    public void setChgAmt(String str) {
        this.chgAmt = str;
    }

    public void setILoadRst(String str) {
        this.iLoadRst = str;
    }

    public void setMbphNo(String str) {
        this.mbphNo = str;
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

    public void setUnic(String str) {
        this.unicId = str;
    }

    protected /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
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
        if (i == 29) {
            if (!z) {
                this.svcUtam = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.svcUtam = jsonReader.nextString();
                return;
            } else {
                this.svcUtam = Boolean.toString(jsonReader.nextBoolean());
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
        if (i == 236) {
            if (!z) {
                this.pymInf = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.pymInf = jsonReader.nextString();
                return;
            } else {
                this.pymInf = Boolean.toString(jsonReader.nextBoolean());
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
        if (i == 638) {
            if (!z) {
                this.pymMnsTypCd = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.pymMnsTypCd = jsonReader.nextString();
                return;
            } else {
                this.pymMnsTypCd = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 695) {
            if (!z) {
                this.pymAmt = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.pymAmt = jsonReader.nextString();
                return;
            } else {
                this.pymAmt = Boolean.toString(jsonReader.nextBoolean());
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
