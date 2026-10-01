package com.tmoney.dto;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.Serializable;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class UsePlaceInfoDto implements Serializable {

    @SerializedName("blthCtt")
    private String blthCtt;

    @SerializedName("blthTtl")
    private String blthTtl;

    public String getblthCtt() {
        return this.blthCtt;
    }

    public String getblthTtl() {
        return this.blthTtl;
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setblthCtt(String str) {
        this.blthCtt = str;
    }

    public void setblthTtl(String str) {
        this.blthTtl = str;
    }

    protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.blthCtt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 318);
            jsonWriter.value(this.blthCtt);
        }
        if (this != this.blthTtl) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 391);
            jsonWriter.value(this.blthTtl);
        }
    }

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onWarmupCompleted(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 116) {
            if (!z) {
                this.blthTtl = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.blthTtl = jsonReader.nextString();
                return;
            } else {
                this.blthTtl = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 382) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.blthCtt = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.blthCtt = jsonReader.nextString();
        } else {
            this.blthCtt = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
