package com.tmoney.kscc.sslio.dto.request;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class DPCG0004RequestDTO implements RequestDTO.Request {
    private String chgTrdNo;
    private String loadRst;
    private String mbphNo;
    private String tmcrNo;
    private String unicId;

    public String getChgTrdNo() {
        return this.chgTrdNo;
    }

    public String getLoadRst() {
        return this.loadRst;
    }

    public String getMbphNo() {
        return this.mbphNo;
    }

    public String getTmcrNo() {
        return this.tmcrNo;
    }

    public String getUnicId() {
        return this.unicId;
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setChgTrdNo(String str) {
        this.chgTrdNo = str;
    }

    public void setLoadRst(String str) {
        this.loadRst = str;
    }

    public void setMbphNo(String str) {
        this.mbphNo = str;
    }

    public void setTmcrNo(String str) {
        this.tmcrNo = str;
    }

    public void setUnicId(String str) {
        this.unicId = str;
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.chgTrdNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 791);
            jsonWriter.value(this.chgTrdNo);
        }
        if (this != this.loadRst) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 253);
            jsonWriter.value(this.loadRst);
        }
        if (this != this.mbphNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 517);
            jsonWriter.value(this.mbphNo);
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
            onNavigationEvent(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 305) {
            if (!z) {
                this.chgTrdNo = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.chgTrdNo = jsonReader.nextString();
                return;
            } else {
                this.chgTrdNo = Boolean.toString(jsonReader.nextBoolean());
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
        if (i == 752) {
            if (!z) {
                this.loadRst = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.loadRst = jsonReader.nextString();
                return;
            } else {
                this.loadRst = Boolean.toString(jsonReader.nextBoolean());
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
