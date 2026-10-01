package com.tmoney.dto;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.Serializable;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class TpoRequestInfo implements Serializable {
    private static final long serialVersionUID = 1;

    @SerializedName("AppGubun")
    private String appGubun;

    @SerializedName("CardInfo")
    private String cardInfo;

    @SerializedName("FirstFlag")
    private String firstFlag;

    @SerializedName("Purse")
    private String purse;

    @SerializedName("ReciveYn")
    private String reciveYn;

    @SerializedName("Transport")
    private String transport;

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public String getAppGubun() {
        return this.firstFlag;
    }

    public String getCardInfo() {
        return this.cardInfo;
    }

    public String getFirstFlag() {
        return this.firstFlag;
    }

    public String getPurse() {
        return this.purse;
    }

    public String getReciveYn() {
        return this.reciveYn;
    }

    public String getTransport() {
        return this.transport;
    }

    public void setAppGubun(String str) {
        this.appGubun = str;
    }

    public void setCardInfo(String str) {
        this.cardInfo = str;
    }

    public void setFirstFlag(String str) {
        this.firstFlag = str;
    }

    public void setPurse(String str) {
        this.purse = str;
    }

    public void setReciveYn(String str) {
        this.reciveYn = str;
    }

    public void setTransport(String str) {
        this.transport = str;
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.appGubun) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 65);
            jsonWriter.value(this.appGubun);
        }
        if (this != this.cardInfo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 746);
            jsonWriter.value(this.cardInfo);
        }
        if (this != this.firstFlag) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 320);
            jsonWriter.value(this.firstFlag);
        }
        if (this != this.purse) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 345);
            jsonWriter.value(this.purse);
        }
        if (this != this.reciveYn) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 589);
            jsonWriter.value(this.reciveYn);
        }
        if (this != this.transport) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 427);
            jsonWriter.value(this.transport);
        }
    }

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onExtraCallbackWithResult(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 80) {
            if (!z) {
                this.reciveYn = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.reciveYn = jsonReader.nextString();
                return;
            } else {
                this.reciveYn = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 102) {
            if (!z) {
                this.transport = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.transport = jsonReader.nextString();
                return;
            } else {
                this.transport = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 109) {
            if (!z) {
                this.purse = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.purse = jsonReader.nextString();
                return;
            } else {
                this.purse = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 125) {
            if (!z) {
                this.cardInfo = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.cardInfo = jsonReader.nextString();
                return;
            } else {
                this.cardInfo = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 307) {
            if (!z) {
                this.appGubun = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.appGubun = jsonReader.nextString();
                return;
            } else {
                this.appGubun = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 414) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.firstFlag = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.firstFlag = jsonReader.nextString();
        } else {
            this.firstFlag = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
