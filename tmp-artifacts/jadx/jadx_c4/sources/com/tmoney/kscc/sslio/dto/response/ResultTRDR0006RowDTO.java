package com.tmoney.kscc.sslio.dto.response;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class ResultTRDR0006RowDTO {
    private String billDay;
    private String billMon;
    private String billYM;

    public String getBillDay() {
        return this.billDay;
    }

    public String getBillMon() {
        return this.billMon;
    }

    public String getBillYearMonth() {
        return this.billYM;
    }

    public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.billDay) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 634);
            jsonWriter.value(this.billDay);
        }
        if (this != this.billMon) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 863);
            jsonWriter.value(this.billMon);
        }
        if (this != this.billYM) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 800);
            jsonWriter.value(this.billYM);
        }
    }

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onWarmupCompleted(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 32) {
            if (!z) {
                this.billDay = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.billDay = jsonReader.nextString();
                return;
            } else {
                this.billDay = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 38) {
            if (!z) {
                this.billYM = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.billYM = jsonReader.nextString();
                return;
            } else {
                this.billYM = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 794) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.billMon = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.billMon = jsonReader.nextString();
        } else {
            this.billMon = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
