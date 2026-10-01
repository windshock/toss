package com.tmoney.kscc.sslio.dto.request;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.Serializable;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class RequestDTO {
    private String bsnCd;
    private String locale;
    private String partnerCd;
    private String partnerKey;
    private Request request;
    private String token;
    private String txId;

    public interface Request extends Serializable {
    }

    public String getBsnCd() {
        return this.bsnCd;
    }

    public String getLocale() {
        return this.locale;
    }

    public String getPartnerCd() {
        return this.partnerCd;
    }

    public String getPartnerKey() {
        return this.partnerKey;
    }

    public Request getRequest() {
        return this.request;
    }

    public String getToken() {
        return this.token;
    }

    public String getTxId() {
        return this.txId;
    }

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setBsnCd(String str) {
        this.bsnCd = str;
    }

    public void setLocale(String str) {
        this.locale = str;
    }

    public void setPartnerCd(String str) {
        this.partnerCd = str;
    }

    public void setPartnerKey(String str) {
        this.partnerKey = str;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setTxId(String str) {
        this.txId = str;
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.bsnCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 556);
            jsonWriter.value(this.bsnCd);
        }
        if (this != this.locale) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 162);
            jsonWriter.value(this.locale);
        }
        if (this != this.partnerCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 4);
            jsonWriter.value(this.partnerCd);
        }
        if (this != this.partnerKey) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 43);
            jsonWriter.value(this.partnerKey);
        }
        if (this != this.request) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 702);
            Request request = this.request;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, Request.class, request).write(jsonWriter, request);
        }
        if (this != this.token) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 444);
            jsonWriter.value(this.token);
        }
        if (this != this.txId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 629);
            jsonWriter.value(this.txId);
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
        if (i == 55) {
            if (!z) {
                this.token = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.token = jsonReader.nextString();
                return;
            } else {
                this.token = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 222) {
            if (!z) {
                this.txId = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.txId = jsonReader.nextString();
                return;
            } else {
                this.txId = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 225) {
            if (!z) {
                this.partnerKey = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.partnerKey = jsonReader.nextString();
                return;
            } else {
                this.partnerKey = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 405) {
            if (!z) {
                this.locale = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.locale = jsonReader.nextString();
                return;
            } else {
                this.locale = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 415) {
            if (!z) {
                this.partnerCd = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.partnerCd = jsonReader.nextString();
                return;
            } else {
                this.partnerCd = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 747) {
            if (z) {
                this.request = (Request) gson.getAdapter(Request.class).read(jsonReader);
                return;
            } else {
                this.request = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i != 824) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.bsnCd = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.bsnCd = jsonReader.nextString();
        } else {
            this.bsnCd = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
