package com.tmoney.kscc.sslio.dto.request;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class UCAD0001RequestDTO implements RequestDTO.Request {
    private String initPurchaseRst;
    private String mbphNo;
    private String[] purseRst;
    private String purseRstState;
    private String slctRst;
    private String tmcrNo;
    private String unicId;

    public String getMbphNo() {
        return this.mbphNo;
    }

    public String[] getPurseRst() {
        return this.purseRst;
    }

    public String getSlctRst() {
        return this.slctRst;
    }

    public String getTmcrNo() {
        return this.tmcrNo;
    }

    public String getUnicId() {
        return this.unicId;
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setInitPurchaseRst(String str) {
        this.initPurchaseRst = str;
    }

    public void setMbphNo(String str) {
        this.mbphNo = str;
    }

    public void setPurseRst(String[] strArr) {
        this.purseRst = strArr;
    }

    public void setPurseRstState(String str) {
        this.purseRstState = str;
    }

    public void setSlctRst(String str) {
        this.slctRst = str;
    }

    public void setTmcrNo(String str) {
        this.tmcrNo = str;
    }

    public void setUnicId(String str) {
        this.unicId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.initPurchaseRst) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 465);
            jsonWriter.value(this.initPurchaseRst);
        }
        if (this != this.mbphNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 517);
            jsonWriter.value(this.mbphNo);
        }
        if (this != this.purseRst) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 483);
            String[] strArr = this.purseRst;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, String[].class, strArr).write(jsonWriter, strArr);
        }
        if (this != this.purseRstState) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 873);
            jsonWriter.value(this.purseRstState);
        }
        if (this != this.slctRst) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 37);
            jsonWriter.value(this.slctRst);
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

    public /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            IAuthTabCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 334) {
            if (!z) {
                this.purseRstState = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.purseRstState = jsonReader.nextString();
                return;
            } else {
                this.purseRstState = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 395) {
            if (!z) {
                this.initPurchaseRst = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.initPurchaseRst = jsonReader.nextString();
                return;
            } else {
                this.initPurchaseRst = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
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
        if (i == 631) {
            if (z) {
                this.purseRst = (String[]) gson.getAdapter(String[].class).read(jsonReader);
                return;
            } else {
                this.purseRst = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i != 761) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.tmcrNo = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.tmcrNo = jsonReader.nextString();
        } else {
            this.tmcrNo = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
