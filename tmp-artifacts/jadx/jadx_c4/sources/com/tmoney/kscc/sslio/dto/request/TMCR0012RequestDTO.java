package com.tmoney.kscc.sslio.dto.request;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class TMCR0012RequestDTO implements RequestDTO.Request {
    private String bftrBal;
    private String intgMbrsId;
    private String pltCardNo;
    private String pymMnsGrpCd;
    private String tmcrNo;

    public TMCR0012RequestDTO(String str, String str2) {
        this.tmcrNo = str;
        this.pltCardNo = str2;
    }

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public String getBftrBal() {
        return this.bftrBal;
    }

    public String getIntgMbrsId() {
        return this.intgMbrsId;
    }

    public String getPltCardNo() {
        return this.pltCardNo;
    }

    public String getTmcrNo() {
        return this.tmcrNo;
    }

    public void setBftrBal(String str) {
        this.bftrBal = str;
    }

    public void setIntgMbrsId(String str) {
        this.intgMbrsId = str;
    }

    public void setPltCardNo(String str) {
        this.pltCardNo = str;
    }

    public void setPymMnsGrpCd(String str) {
        this.pymMnsGrpCd = str;
    }

    public void setTmcrNo(String str) {
        this.tmcrNo = str;
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.bftrBal) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 528);
            jsonWriter.value(this.bftrBal);
        }
        if (this != this.intgMbrsId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 18);
            jsonWriter.value(this.intgMbrsId);
        }
        if (this != this.pltCardNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 650);
            jsonWriter.value(this.pltCardNo);
        }
        if (this != this.pymMnsGrpCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 725);
            jsonWriter.value(this.pymMnsGrpCd);
        }
        if (this != this.tmcrNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 114);
            jsonWriter.value(this.tmcrNo);
        }
    }

    public /* synthetic */ TMCR0012RequestDTO() {
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onExtraCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 31) {
            if (!z) {
                this.pymMnsGrpCd = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.pymMnsGrpCd = jsonReader.nextString();
                return;
            } else {
                this.pymMnsGrpCd = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 161) {
            if (!z) {
                this.bftrBal = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.bftrBal = jsonReader.nextString();
                return;
            } else {
                this.bftrBal = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 371) {
            if (!z) {
                this.intgMbrsId = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.intgMbrsId = jsonReader.nextString();
                return;
            } else {
                this.intgMbrsId = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 757) {
            if (!z) {
                this.pltCardNo = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.pltCardNo = jsonReader.nextString();
                return;
            } else {
                this.pltCardNo = Boolean.toString(jsonReader.nextBoolean());
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
