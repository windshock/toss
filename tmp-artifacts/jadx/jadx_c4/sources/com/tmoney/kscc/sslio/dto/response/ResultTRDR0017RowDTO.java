package com.tmoney.kscc.sslio.dto.response;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class ResultTRDR0017RowDTO {
    private String acntDpstDt;
    private String acntNo;
    private String bnkNm;
    private String cusRyAmt;
    private String rcvStaCd;
    private String ryReqDt;

    public String getAcntDpstDt() {
        return this.acntDpstDt;
    }

    public String getAcntNo() {
        return this.acntNo;
    }

    public String getBnkNm() {
        return this.bnkNm;
    }

    public String getCusRyAmt() {
        return this.cusRyAmt;
    }

    public String getRcvStaCd() {
        return this.rcvStaCd;
    }

    public String getRyReqDt() {
        return this.ryReqDt;
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.acntDpstDt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 265);
            jsonWriter.value(this.acntDpstDt);
        }
        if (this != this.acntNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 151);
            jsonWriter.value(this.acntNo);
        }
        if (this != this.bnkNm) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 707);
            jsonWriter.value(this.bnkNm);
        }
        if (this != this.cusRyAmt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 412);
            jsonWriter.value(this.cusRyAmt);
        }
        if (this != this.rcvStaCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 586);
            jsonWriter.value(this.rcvStaCd);
        }
        if (this != this.ryReqDt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 228);
            jsonWriter.value(this.ryReqDt);
        }
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onWarmupCompleted(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 41) {
            if (!z) {
                this.rcvStaCd = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.rcvStaCd = jsonReader.nextString();
                return;
            } else {
                this.rcvStaCd = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 148) {
            if (!z) {
                this.bnkNm = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.bnkNm = jsonReader.nextString();
                return;
            } else {
                this.bnkNm = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 559) {
            if (!z) {
                this.acntNo = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.acntNo = jsonReader.nextString();
                return;
            } else {
                this.acntNo = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 564) {
            if (!z) {
                this.acntDpstDt = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.acntDpstDt = jsonReader.nextString();
                return;
            } else {
                this.acntDpstDt = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 604) {
            if (!z) {
                this.cusRyAmt = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.cusRyAmt = jsonReader.nextString();
                return;
            } else {
                this.cusRyAmt = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 711) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.ryReqDt = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.ryReqDt = jsonReader.nextString();
        } else {
            this.ryReqDt = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
