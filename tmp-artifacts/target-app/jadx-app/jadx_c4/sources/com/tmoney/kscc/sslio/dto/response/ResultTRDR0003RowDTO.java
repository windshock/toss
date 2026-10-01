package com.tmoney.kscc.sslio.dto.response;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class ResultTRDR0003RowDTO {
    private String amt;
    private String dvsCd;
    private String stn;
    private String trdArea;
    private String trdMns;
    private String useDt;

    public String getAmt() {
        return this.amt;
    }

    public String getDvsCd() {
        return this.dvsCd;
    }

    public String getStn() {
        return this.stn;
    }

    public String getTrdArea() {
        return this.trdArea;
    }

    public String getTrdMns() {
        return this.trdMns;
    }

    public String getUseDt() {
        return this.useDt;
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setAmt(String str) {
        this.amt = str;
    }

    public void setDvsCd(String str) {
        this.dvsCd = str;
    }

    public void setStn(String str) {
        this.stn = str;
    }

    public void setTrdArea(String str) {
        this.trdArea = str;
    }

    public void setTrdMns(String str) {
        this.trdMns = str;
    }

    public void setUseDt(String str) {
        this.useDt = str;
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.amt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 206);
            jsonWriter.value(this.amt);
        }
        if (this != this.dvsCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 477);
            jsonWriter.value(this.dvsCd);
        }
        if (this != this.stn) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 429);
            jsonWriter.value(this.stn);
        }
        if (this != this.trdArea) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 192);
            jsonWriter.value(this.trdArea);
        }
        if (this != this.trdMns) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 456);
            jsonWriter.value(this.trdMns);
        }
        if (this != this.useDt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 42);
            jsonWriter.value(this.useDt);
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
        if (i == 607) {
            if (!z) {
                this.trdArea = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.trdArea = jsonReader.nextString();
                return;
            } else {
                this.trdArea = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 809) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.trdMns = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.trdMns = jsonReader.nextString();
        } else {
            this.trdMns = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
