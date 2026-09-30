package com.tmoney.kscc.sslio.dto.response;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class ResultTRDR0005RowDTO {
    private String amt;
    private String cardTrdSno;
    private String dvsCd;
    private String mns;
    private String raa;
    private String stn;
    private String useDt;

    public String getAmt() {
        return this.amt;
    }

    public String getCardTrdSno() {
        return this.cardTrdSno;
    }

    public String getDvsCd() {
        return this.dvsCd;
    }

    public String getMns() {
        return this.mns;
    }

    public String getRaa() {
        return this.raa;
    }

    public String getStn() {
        return this.stn;
    }

    public String getUseDt() {
        return this.useDt;
    }

    public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onNavigationEvent(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setAmt(String str) {
        this.amt = str;
    }

    public void setCardTrdSno(String str) {
        this.cardTrdSno = str;
    }

    public void setDvsCd(String str) {
        this.dvsCd = str;
    }

    public void setMns(String str) {
        this.mns = str;
    }

    public void setRaa(String str) {
        this.raa = str;
    }

    public void setStn(String str) {
        this.stn = str;
    }

    public void setUseDt(String str) {
        this.useDt = str;
    }

    protected /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.amt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 206);
            jsonWriter.value(this.amt);
        }
        if (this != this.cardTrdSno) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 424);
            jsonWriter.value(this.cardTrdSno);
        }
        if (this != this.dvsCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 477);
            jsonWriter.value(this.dvsCd);
        }
        if (this != this.mns) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 288);
            jsonWriter.value(this.mns);
        }
        if (this != this.raa) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 497);
            jsonWriter.value(this.raa);
        }
        if (this != this.stn) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 429);
            jsonWriter.value(this.stn);
        }
        if (this != this.useDt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 42);
            jsonWriter.value(this.useDt);
        }
    }

    public /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onExtraCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 97) {
            if (!z) {
                this.useDt = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.useDt = jsonReader.nextString();
                return;
            } else {
                this.useDt = Boolean.toString(jsonReader.nextBoolean());
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
        if (i == 216) {
            if (!z) {
                this.cardTrdSno = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.cardTrdSno = jsonReader.nextString();
                return;
            } else {
                this.cardTrdSno = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 442) {
            if (!z) {
                this.dvsCd = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.dvsCd = jsonReader.nextString();
                return;
            } else {
                this.dvsCd = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 503) {
            if (!z) {
                this.mns = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.mns = jsonReader.nextString();
                return;
            } else {
                this.mns = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 508) {
            if (!z) {
                this.stn = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.stn = jsonReader.nextString();
                return;
            } else {
                this.stn = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 763) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.raa = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.raa = jsonReader.nextString();
        } else {
            this.raa = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
