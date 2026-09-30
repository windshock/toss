package com.tmoney.dto;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.Serializable;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class TpoResult implements Serializable {

    @SerializedName("errCode")
    private String resultCode;

    @SerializedName("param")
    private TpoResultData resultData;

    @SerializedName("msg")
    private String resultMessage;

    public String getResultCode() {
        return this.resultCode;
    }

    public TpoResultData getResultData() {
        return this.resultData;
    }

    public String getResultMessage() {
        return this.resultMessage;
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }

    public void setResultData(TpoResultData tpoResultData) {
        this.resultData = tpoResultData;
    }

    public void setResultMessage(String str) {
        this.resultMessage = str;
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.resultCode) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 92);
            jsonWriter.value(this.resultCode);
        }
        if (this != this.resultData) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 529);
            TpoResultData tpoResultData = this.resultData;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, TpoResultData.class, tpoResultData).write(jsonWriter, tpoResultData);
        }
        if (this != this.resultMessage) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 763);
            jsonWriter.value(this.resultMessage);
        }
    }

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onExtraCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 65) {
            if (z) {
                this.resultData = (TpoResultData) gson.getAdapter(TpoResultData.class).read(jsonReader);
                return;
            } else {
                this.resultData = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 277) {
            if (!z) {
                this.resultMessage = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.resultMessage = jsonReader.nextString();
                return;
            } else {
                this.resultMessage = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 531) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.resultCode = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.resultCode = jsonReader.nextString();
        } else {
            this.resultCode = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
