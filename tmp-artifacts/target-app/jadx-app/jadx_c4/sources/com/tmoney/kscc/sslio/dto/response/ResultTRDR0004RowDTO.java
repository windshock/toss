package com.tmoney.kscc.sslio.dto.response;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class ResultTRDR0004RowDTO {
    private String chgAmt;
    private String dvsCd;
    private String mon;
    private String useAmt;

    public String getChgAmt() {
        return this.chgAmt;
    }

    public String getDvsCd() {
        return this.dvsCd;
    }

    public String getMon() {
        return this.mon;
    }

    public String getUseAmt() {
        return this.useAmt;
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setChgAmt(String str) {
        this.chgAmt = str;
    }

    public void setDvsCd(String str) {
        this.dvsCd = str;
    }

    public void setMon(String str) {
        this.mon = str;
    }

    public void setUseAmt(String str) {
        this.useAmt = str;
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.chgAmt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 240);
            jsonWriter.value(this.chgAmt);
        }
        if (this != this.dvsCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 477);
            jsonWriter.value(this.dvsCd);
        }
        if (this != this.mon) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 475);
            jsonWriter.value(this.mon);
        }
        if (this != this.useAmt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 7);
            jsonWriter.value(this.useAmt);
        }
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onExtraCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
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
        if (i == 355) {
            if (!z) {
                this.mon = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.mon = jsonReader.nextString();
                return;
            } else {
                this.mon = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 391) {
            if (!z) {
                this.useAmt = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.useAmt = jsonReader.nextString();
                return;
            } else {
                this.useAmt = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 442) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.dvsCd = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.dvsCd = jsonReader.nextString();
        } else {
            this.dvsCd = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
