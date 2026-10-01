package com.skt.usp.tools.dao;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class URMSComponents extends AbstractDao {
    protected String comp_id = null;
    protected String expire_date = null;

    public void setCompId(String str) {
        this.comp_id = str;
    }

    public String getCompId() {
        return this.comp_id;
    }

    public void setExpireDate(String str) {
        this.expire_date = str;
    }

    public String getExpireDate() {
        return this.expire_date;
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.comp_id) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 279);
            jsonWriter.value(this.comp_id);
        }
        if (this != this.expire_date) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 689);
            jsonWriter.value(this.expire_date);
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
        if (i != 585) {
            IAuthTabCallback(gson, jsonReader, i);
            return;
        }
        if (!z) {
            this.comp_id = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.comp_id = jsonReader.nextString();
        } else {
            this.comp_id = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
