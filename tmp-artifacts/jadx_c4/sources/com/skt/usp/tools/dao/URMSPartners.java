package com.skt.usp.tools.dao;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class URMSPartners extends AbstractDao {
    protected String bp_id = null;
    protected String partner_type = null;
    protected String partner_cd = null;
    protected String expire_date = null;

    public void setBpId(String str) {
        this.bp_id = str;
    }

    public String getBpId() {
        return this.bp_id;
    }

    public void setPartnerType(String str) {
        this.partner_type = str;
    }

    public String getPartnerType() {
        return this.partner_type;
    }

    public void setExpireDate(String str) {
        this.expire_date = str;
    }

    public String getExpireDate() {
        return this.expire_date;
    }

    public void setPartnerCd(String str) {
        this.partner_cd = str;
    }

    public String getPartnerCd() {
        return this.partner_cd;
    }

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.bp_id) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 526);
            jsonWriter.value(this.bp_id);
        }
        if (this != this.expire_date) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 689);
            jsonWriter.value(this.expire_date);
        }
        if (this != this.partner_cd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 516);
            jsonWriter.value(this.partner_cd);
        }
        if (this != this.partner_type) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 277);
            jsonWriter.value(this.partner_type);
        }
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onWarmupCompleted(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 365) {
            if (!z) {
                this.partner_type = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.partner_type = jsonReader.nextString();
                return;
            } else {
                this.partner_type = Boolean.toString(jsonReader.nextBoolean());
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
        if (i == 688) {
            if (!z) {
                this.bp_id = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.bp_id = jsonReader.nextString();
                return;
            } else {
                this.bp_id = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 821) {
            IAuthTabCallback(gson, jsonReader, i);
            return;
        }
        if (!z) {
            this.partner_cd = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.partner_cd = jsonReader.nextString();
        } else {
            this.partner_cd = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
