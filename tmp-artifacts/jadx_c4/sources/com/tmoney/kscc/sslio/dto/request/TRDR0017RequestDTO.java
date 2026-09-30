package com.tmoney.kscc.sslio.dto.request;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class TRDR0017RequestDTO implements RequestDTO.Request {
    private String rgtFromDt;
    private String rgtToDt;
    private String tmcrNo;

    public String getRgtFromDt() {
        return this.rgtFromDt;
    }

    public String getRgtToDt() {
        return this.rgtToDt;
    }

    public String getTmcrNo() {
        return this.tmcrNo;
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setRgtFromDt(String str) {
        this.rgtFromDt = str;
    }

    public void setRgtToDt(String str) {
        this.rgtToDt = str;
    }

    public void setTmcrNo(String str) {
        this.tmcrNo = str;
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.rgtFromDt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 210);
            jsonWriter.value(this.rgtFromDt);
        }
        if (this != this.rgtToDt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 461);
            jsonWriter.value(this.rgtToDt);
        }
        if (this != this.tmcrNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 114);
            jsonWriter.value(this.tmcrNo);
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
        if (i == 266) {
            if (!z) {
                this.rgtToDt = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.rgtToDt = jsonReader.nextString();
                return;
            } else {
                this.rgtToDt = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 373) {
            if (!z) {
                this.rgtFromDt = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.rgtFromDt = jsonReader.nextString();
                return;
            } else {
                this.rgtFromDt = Boolean.toString(jsonReader.nextBoolean());
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
