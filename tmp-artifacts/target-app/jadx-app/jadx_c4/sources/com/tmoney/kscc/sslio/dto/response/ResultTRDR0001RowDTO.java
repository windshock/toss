package com.tmoney.kscc.sslio.dto.response;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class ResultTRDR0001RowDTO {
    private String amt;
    private String crcmCd;
    private String crcmNm;
    private String pntNm;
    private String sKey;
    private String takDt;
    private String trdDt;

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public String getAmt() {
        return this.amt;
    }

    public String getCrcmCd() {
        return this.crcmCd;
    }

    public String getCrcmNm() {
        return this.crcmNm;
    }

    public String getPntNm() {
        return this.pntNm;
    }

    public String getSKey() {
        return this.sKey;
    }

    public String getTakDt() {
        return this.takDt;
    }

    public String getTrdDt() {
        return this.trdDt;
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.amt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 206);
            jsonWriter.value(this.amt);
        }
        if (this != this.crcmCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 801);
            jsonWriter.value(this.crcmCd);
        }
        if (this != this.crcmNm) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 182);
            jsonWriter.value(this.crcmNm);
        }
        if (this != this.pntNm) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 751);
            jsonWriter.value(this.pntNm);
        }
        if (this != this.sKey) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 300);
            jsonWriter.value(this.sKey);
        }
        if (this != this.takDt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 255);
            jsonWriter.value(this.takDt);
        }
        if (this != this.trdDt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 813);
            jsonWriter.value(this.trdDt);
        }
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            IAuthTabCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 44) {
            if (!z) {
                this.takDt = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.takDt = jsonReader.nextString();
                return;
            } else {
                this.takDt = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 180) {
            if (!z) {
                this.amt = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.amt = jsonReader.nextString();
                return;
            } else {
                this.amt = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 201) {
            if (!z) {
                this.crcmCd = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.crcmCd = jsonReader.nextString();
                return;
            } else {
                this.crcmCd = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 248) {
            if (!z) {
                this.trdDt = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.trdDt = jsonReader.nextString();
                return;
            } else {
                this.trdDt = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 375) {
            if (!z) {
                this.crcmNm = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.crcmNm = jsonReader.nextString();
                return;
            } else {
                this.crcmNm = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 463) {
            if (!z) {
                this.pntNm = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.pntNm = jsonReader.nextString();
                return;
            } else {
                this.pntNm = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 830) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.sKey = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.sKey = jsonReader.nextString();
        } else {
            this.sKey = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
