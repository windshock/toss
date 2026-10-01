package com.skt.usp.tools.dao;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class URMSApplets extends AbstractDao {
    protected String inst_aid = null;
    protected String sd_aid = null;
    protected String expire_date = null;

    public void setInstAid(String str) {
        this.inst_aid = str;
    }

    public String getInstAid() {
        return this.inst_aid;
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

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onNavigationEvent(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    protected /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.expire_date) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 689);
            jsonWriter.value(this.expire_date);
        }
        if (this != this.inst_aid) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 869);
            jsonWriter.value(this.inst_aid);
        }
        if (this != this.sd_aid) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 520);
            jsonWriter.value(this.sd_aid);
        }
    }

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onNavigationEvent(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 14) {
            if (!z) {
                this.inst_aid = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.inst_aid = jsonReader.nextString();
                return;
            } else {
                this.inst_aid = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
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
        if (i != 399) {
            IAuthTabCallback(gson, jsonReader, i);
            return;
        }
        if (!z) {
            this.expire_date = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.expire_date = jsonReader.nextString();
        } else {
            this.expire_date = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
