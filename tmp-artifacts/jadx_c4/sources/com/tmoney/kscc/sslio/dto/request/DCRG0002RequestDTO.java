package com.tmoney.kscc.sslio.dto.request;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class DCRG0002RequestDTO implements RequestDTO.Request {
    private String mbphNo;
    private String prmtUpdChipRst;
    private String tmcrNo;
    private String trdNo;
    private String unicId;
    private String userCode;

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public String getMbphNo() {
        return this.mbphNo;
    }

    public String getPrmtUpdChipRst() {
        return this.prmtUpdChipRst;
    }

    public String getTmcrNo() {
        return this.tmcrNo;
    }

    public String getTrdNo() {
        return this.trdNo;
    }

    public String getUnic() {
        return this.unicId;
    }

    public String getUserCode() {
        return this.userCode;
    }

    public void setMbphNo(String str) {
        this.mbphNo = str;
    }

    public void setPrmtUpdChipRst(String str) {
        this.prmtUpdChipRst = str;
    }

    public void setTmcrNo(String str) {
        this.tmcrNo = str;
    }

    public void setTrdNo(String str) {
        this.trdNo = str;
    }

    public void setUnic(String str) {
        this.unicId = str;
    }

    public void setUserCode(String str) {
        this.userCode = str;
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.mbphNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 517);
            jsonWriter.value(this.mbphNo);
        }
        if (this != this.prmtUpdChipRst) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 555);
            jsonWriter.value(this.prmtUpdChipRst);
        }
        if (this != this.tmcrNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 114);
            jsonWriter.value(this.tmcrNo);
        }
        if (this != this.trdNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 580);
            jsonWriter.value(this.trdNo);
        }
        if (this != this.unicId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 595);
            jsonWriter.value(this.unicId);
        }
        if (this != this.userCode) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 389);
            jsonWriter.value(this.userCode);
        }
    }

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onWarmupCompleted(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 314) {
            if (!z) {
                this.prmtUpdChipRst = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.prmtUpdChipRst = jsonReader.nextString();
                return;
            } else {
                this.prmtUpdChipRst = Boolean.toString(jsonReader.nextBoolean());
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
        if (i == 593) {
            if (!z) {
                this.unicId = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.unicId = jsonReader.nextString();
                return;
            } else {
                this.unicId = Boolean.toString(jsonReader.nextBoolean());
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
        if (i == 786) {
            if (!z) {
                this.userCode = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.userCode = jsonReader.nextString();
                return;
            } else {
                this.userCode = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 834) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.trdNo = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.trdNo = jsonReader.nextString();
        } else {
            this.trdNo = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
