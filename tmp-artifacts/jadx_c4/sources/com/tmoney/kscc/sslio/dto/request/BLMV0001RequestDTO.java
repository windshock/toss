package com.tmoney.kscc.sslio.dto.request;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class BLMV0001RequestDTO implements RequestDTO.Request {
    private String iuLoadRst;
    private String mbphNo;
    private String reqAmt;
    private String slctRst;
    private String sndrCardNo;
    private String tmcrNo;
    private String unicId;

    public String getIuLoadRst() {
        return this.iuLoadRst;
    }

    public String getMbphNo() {
        return this.mbphNo;
    }

    public String getReqAmt() {
        return this.reqAmt;
    }

    public String getSlctRst() {
        return this.slctRst;
    }

    public String getSndrCardNo() {
        return this.sndrCardNo;
    }

    public String getTmcrNo() {
        return this.tmcrNo;
    }

    public String getUnic() {
        return this.unicId;
    }

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setIuLoadRst(String str) {
        this.iuLoadRst = str;
    }

    public void setMbphNo(String str) {
        this.mbphNo = str;
    }

    public void setReqAmt(String str) {
        this.reqAmt = str;
    }

    public void setSlctRst(String str) {
        this.slctRst = str;
    }

    public void setSndrCardNo(String str) {
        this.sndrCardNo = str;
    }

    public void setTmcrNo(String str) {
        this.tmcrNo = str;
    }

    public void setUnic(String str) {
        this.unicId = str;
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.iuLoadRst) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 350);
            jsonWriter.value(this.iuLoadRst);
        }
        if (this != this.mbphNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 517);
            jsonWriter.value(this.mbphNo);
        }
        if (this != this.reqAmt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 808);
            jsonWriter.value(this.reqAmt);
        }
        if (this != this.slctRst) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 37);
            jsonWriter.value(this.slctRst);
        }
        if (this != this.sndrCardNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 102);
            jsonWriter.value(this.sndrCardNo);
        }
        if (this != this.tmcrNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 114);
            jsonWriter.value(this.tmcrNo);
        }
        if (this != this.unicId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 595);
            jsonWriter.value(this.unicId);
        }
    }

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onExtraCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 507) {
            if (!z) {
                this.slctRst = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.slctRst = jsonReader.nextString();
                return;
            } else {
                this.slctRst = Boolean.toString(jsonReader.nextBoolean());
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
        if (i == 659) {
            if (!z) {
                this.reqAmt = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.reqAmt = jsonReader.nextString();
                return;
            } else {
                this.reqAmt = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 676) {
            if (!z) {
                this.sndrCardNo = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.sndrCardNo = jsonReader.nextString();
                return;
            } else {
                this.sndrCardNo = Boolean.toString(jsonReader.nextBoolean());
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
        if (i != 864) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.iuLoadRst = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.iuLoadRst = jsonReader.nextString();
        } else {
            this.iuLoadRst = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
