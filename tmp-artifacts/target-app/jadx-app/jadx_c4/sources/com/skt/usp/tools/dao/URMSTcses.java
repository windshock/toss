package com.skt.usp.tools.dao;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class URMSTcses extends AbstractDao {
    protected String finance_cd = null;
    protected String sd_aid = null;
    protected String expire_date = null;

    public void setFinanceCd(String str) {
        this.finance_cd = str;
    }

    public String getFinanceCd() {
        return this.finance_cd;
    }

    public void setSdAid(String str) {
        this.sd_aid = str;
    }

    public String getSdAid() {
        return this.sd_aid;
    }

    public void setExpireDate(String str) {
        this.expire_date = str;
    }

    public String getExpireDate() {
        return this.expire_date;
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.expire_date) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 689);
            jsonWriter.value(this.expire_date);
        }
        if (this != this.finance_cd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 25);
            jsonWriter.value(this.finance_cd);
        }
        if (this != this.sd_aid) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 520);
            jsonWriter.value(this.sd_aid);
        }
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onExtraCallbackWithResult(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 238) {
            if (!z) {
                this.sd_aid = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.sd_aid = jsonReader.nextString();
                return;
            } else {
                this.sd_aid = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 399) {
            if (!z) {
                this.expire_date = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.expire_date = jsonReader.nextString();
                return;
            } else {
                this.expire_date = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 815) {
            IAuthTabCallback(gson, jsonReader, i);
            return;
        }
        if (!z) {
            this.finance_cd = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.finance_cd = jsonReader.nextString();
        } else {
            this.finance_cd = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
