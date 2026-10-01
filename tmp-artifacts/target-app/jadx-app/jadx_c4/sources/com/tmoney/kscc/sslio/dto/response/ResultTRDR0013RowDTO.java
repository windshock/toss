package com.tmoney.kscc.sslio.dto.response;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class ResultTRDR0013RowDTO {
    private String afltStupDvsCd;
    private String afltStupVal;

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public String getAfltStupDvsCd() {
        return this.afltStupDvsCd;
    }

    public String getAfltStupVal() {
        return this.afltStupVal;
    }

    public void setAfltStupDvsCd(String str) {
        this.afltStupDvsCd = str;
    }

    public void setAfltStupVal(String str) {
        this.afltStupVal = str;
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.afltStupDvsCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 78);
            jsonWriter.value(this.afltStupDvsCd);
        }
        if (this != this.afltStupVal) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 820);
            jsonWriter.value(this.afltStupVal);
        }
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onWarmupCompleted(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 481) {
            if (!z) {
                this.afltStupVal = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.afltStupVal = jsonReader.nextString();
                return;
            } else {
                this.afltStupVal = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 523) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.afltStupDvsCd = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.afltStupDvsCd = jsonReader.nextString();
        } else {
            this.afltStupDvsCd = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
