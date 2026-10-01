package com.tmoney.kscc.sslio.dto.request;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class MSS0004RequestDTO implements RequestDTO.Request {
    private String acntCusName;
    private String acntEncCd;
    private String acntNo;
    private String bnkCd;
    private String mbphNo;
    private String tmcrNo;

    public String getAcntEncCd() {
        return this.acntEncCd;
    }

    public String getAcntNo() {
        return this.acntNo;
    }

    public String getBnkCd() {
        return this.bnkCd;
    }

    public String getCusName() {
        return this.acntCusName;
    }

    public String getMbphNo() {
        return this.mbphNo;
    }

    public String getTmcrNo() {
        return this.tmcrNo;
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onNavigationEvent(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setAcntEncCd(String str) {
        this.acntEncCd = str;
    }

    public void setAcntNo(String str) {
        this.acntNo = str;
    }

    public void setBnkCd(String str) {
        this.bnkCd = str;
    }

    public void setCusName(String str) {
        this.acntCusName = str;
    }

    public void setMbphNo(String str) {
        this.mbphNo = str;
    }

    public void setTmcrNo(String str) {
        this.tmcrNo = str;
    }

    protected /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.acntCusName) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 472);
            jsonWriter.value(this.acntCusName);
        }
        if (this != this.acntEncCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 686);
            jsonWriter.value(this.acntEncCd);
        }
        if (this != this.acntNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 151);
            jsonWriter.value(this.acntNo);
        }
        if (this != this.bnkCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 54);
            jsonWriter.value(this.bnkCd);
        }
        if (this != this.mbphNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 517);
            jsonWriter.value(this.mbphNo);
        }
        if (this != this.tmcrNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 114);
            jsonWriter.value(this.tmcrNo);
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
        if (i == 342) {
            if (!z) {
                this.acntCusName = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.acntCusName = jsonReader.nextString();
                return;
            } else {
                this.acntCusName = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 511) {
            if (!z) {
                this.mbphNo = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.mbphNo = jsonReader.nextString();
                return;
            } else {
                this.mbphNo = Boolean.toString(jsonReader.nextBoolean());
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
        if (i == 761) {
            if (!z) {
                this.tmcrNo = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.tmcrNo = jsonReader.nextString();
                return;
            } else {
                this.tmcrNo = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 775) {
            if (!z) {
                this.bnkCd = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.bnkCd = jsonReader.nextString();
                return;
            } else {
                this.bnkCd = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 789) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.acntEncCd = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.acntEncCd = jsonReader.nextString();
        } else {
            this.acntEncCd = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
