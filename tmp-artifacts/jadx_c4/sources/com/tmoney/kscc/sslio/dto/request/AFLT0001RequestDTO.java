package com.tmoney.kscc.sslio.dto.request;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class AFLT0001RequestDTO implements RequestDTO.Request {
    public String mbrsCardNo;
    public String mbrsCardStaCd;
    public String mbrsPrdId;
    public String tmcrNo;

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.mbrsCardNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 306);
            jsonWriter.value(this.mbrsCardNo);
        }
        if (this != this.mbrsCardStaCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 793);
            jsonWriter.value(this.mbrsCardStaCd);
        }
        if (this != this.mbrsPrdId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 744);
            jsonWriter.value(this.mbrsPrdId);
        }
        if (this != this.tmcrNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 114);
            jsonWriter.value(this.tmcrNo);
        }
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onNavigationEvent(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 398) {
            if (!z) {
                this.mbrsCardNo = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.mbrsCardNo = jsonReader.nextString();
                return;
            } else {
                this.mbrsCardNo = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 416) {
            if (!z) {
                this.mbrsCardStaCd = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.mbrsCardStaCd = jsonReader.nextString();
                return;
            } else {
                this.mbrsCardStaCd = Boolean.toString(jsonReader.nextBoolean());
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
        if (i != 836) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.mbrsPrdId = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.mbrsPrdId = jsonReader.nextString();
        } else {
            this.mbrsPrdId = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
