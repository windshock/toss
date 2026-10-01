package com.skt.usp.tools.dao.protocol.urms;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.skt.usp.tools.dao.AbstractDao;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class HeaderOfUrms extends AbstractDao {
    protected String client_type = null;
    protected String client_id = null;
    protected String result_code = null;
    protected String result_msg = null;

    public void setClientType(String str) {
        this.client_type = str;
    }

    public String getClientType() {
        return this.client_type;
    }

    public void setClientId(String str) {
        this.client_id = str;
    }

    public String getClientId() {
        return this.client_id;
    }

    public void setResultCode(String str) {
        this.result_code = str;
    }

    public String getResultCode() {
        return this.result_code;
    }

    public void setResultMsg(String str) {
        this.result_msg = str;
    }

    public String getResultMsg() {
        return this.result_msg;
    }

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.client_id) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 748);
            jsonWriter.value(this.client_id);
        }
        if (this != this.client_type) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 569);
            jsonWriter.value(this.client_type);
        }
        if (this != this.result_code) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 492);
            jsonWriter.value(this.result_code);
        }
        if (this != this.result_msg) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 139);
            jsonWriter.value(this.result_msg);
        }
    }

    public /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onExtraCallbackWithResult(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 110) {
            if (!z) {
                this.result_msg = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.result_msg = jsonReader.nextString();
                return;
            } else {
                this.result_msg = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 418) {
            if (!z) {
                this.client_type = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.client_type = jsonReader.nextString();
                return;
            } else {
                this.client_type = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 555) {
            if (!z) {
                this.client_id = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.client_id = jsonReader.nextString();
                return;
            } else {
                this.client_id = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 611) {
            IAuthTabCallback(gson, jsonReader, i);
            return;
        }
        if (!z) {
            this.result_code = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.result_code = jsonReader.nextString();
        } else {
            this.result_code = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
