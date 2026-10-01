package com.tmoney.kscc.sslio.dto.response;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.constants.APIConstants;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class ResponseDTO {
    private APIConstants.EAPI_CONST m_eCmd;
    private String success;
    private String txId;

    public APIConstants.EAPI_CONST getCmd() {
        return this.m_eCmd;
    }

    public String getSuccess() {
        return this.success;
    }

    public String getTxId() {
        return this.txId;
    }

    public boolean isSuccess() {
        return TextUtils.equals(this.success, "true");
    }

    public /* synthetic */ void onTransact(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        asInterface(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setCmd(APIConstants.EAPI_CONST eapi_const) {
        this.m_eCmd = eapi_const;
    }

    public void setSuccess(String str) {
        this.success = str;
    }

    public void setTxId(String str) {
        this.txId = str;
    }

    protected /* synthetic */ void asInterface(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.m_eCmd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 56);
            APIConstants.EAPI_CONST eapi_const = this.m_eCmd;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, APIConstants.EAPI_CONST.class, eapi_const).write(jsonWriter, eapi_const);
        }
        if (this != this.success) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 312);
            jsonWriter.value(this.success);
        }
        if (this != this.txId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 629);
            jsonWriter.value(this.txId);
        }
    }

    public /* synthetic */ void IAuthTabCallbackStub(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            IAuthTabCallbackStub(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void IAuthTabCallbackStub(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
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
        if (i != 545) {
            if (i != 699) {
                jsonReader.skipValue();
                return;
            } else if (z) {
                this.m_eCmd = (APIConstants.EAPI_CONST) gson.getAdapter(APIConstants.EAPI_CONST.class).read(jsonReader);
                return;
            } else {
                this.m_eCmd = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (!z) {
            this.success = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.success = jsonReader.nextString();
        } else {
            this.success = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
