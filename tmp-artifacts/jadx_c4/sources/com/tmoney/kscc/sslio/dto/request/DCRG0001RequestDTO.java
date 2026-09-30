package com.tmoney.kscc.sslio.dto.request;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class DCRG0001RequestDTO implements RequestDTO.Request {
    private String intzPrmtUpdInf;
    private String mbphNo;
    private String ntkmDvsCd;
    private String pymBrdt;
    private String slctRst;
    private String tmcrNo;
    private String unicId;

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public String getIntzPrmtUpdInf() {
        return this.intzPrmtUpdInf;
    }

    public String getMbphNo() {
        return this.mbphNo;
    }

    public String getNtkmDvsCd() {
        return this.ntkmDvsCd;
    }

    public String getSlctRst() {
        return this.slctRst;
    }

    public String getTmcrNo() {
        return this.tmcrNo;
    }

    public String getUnic() {
        return this.unicId;
    }

    public String getpymBrdt() {
        return this.pymBrdt;
    }

    public void setIntzPrmtUpdInf(String str) {
        this.intzPrmtUpdInf = str;
    }

    public void setMbphNo(String str) {
        this.mbphNo = str;
    }

    public void setNtkmDvsCd(String str) {
        this.ntkmDvsCd = str;
    }

    public void setSlctRst(String str) {
        this.slctRst = str;
    }

    public void setTmcrNo(String str) {
        this.tmcrNo = str;
    }

    public void setUnic(String str) {
        this.unicId = str;
    }

    public void setpymBrdt(String str) {
        this.pymBrdt = str;
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.intzPrmtUpdInf) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 64);
            jsonWriter.value(this.intzPrmtUpdInf);
        }
        if (this != this.mbphNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 517);
            jsonWriter.value(this.mbphNo);
        }
        if (this != this.ntkmDvsCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 336);
            jsonWriter.value(this.ntkmDvsCd);
        }
        if (this != this.pymBrdt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 839);
            jsonWriter.value(this.pymBrdt);
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
        if (i == 167) {
            if (!z) {
                this.pymBrdt = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.pymBrdt = jsonReader.nextString();
                return;
            } else {
                this.pymBrdt = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 283) {
            if (!z) {
                this.intzPrmtUpdInf = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.intzPrmtUpdInf = jsonReader.nextString();
                return;
            } else {
                this.intzPrmtUpdInf = Boolean.toString(jsonReader.nextBoolean());
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
        if (i != 863) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.ntkmDvsCd = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.ntkmDvsCd = jsonReader.nextString();
        } else {
            this.ntkmDvsCd = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
