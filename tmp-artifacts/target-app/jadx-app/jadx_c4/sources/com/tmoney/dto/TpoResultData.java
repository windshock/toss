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
public class TpoResultData implements Serializable {

    @SerializedName("gubun")
    private String gubun;

    @SerializedName("station")
    private String station;

    @SerializedName("epurse_tr_seq")
    private String tr_no;

    @SerializedName("trans_mth")
    private String trans_mth;

    @SerializedName("use_amt")
    private String use_amt;

    @SerializedName("use_dtm")
    private String use_dtm;

    public String getGubun() {
        return this.gubun;
    }

    public String getInfo() {
        return this.station;
    }

    public String getTransMth() {
        return this.trans_mth;
    }

    public String getUseAmt() {
        return this.use_amt;
    }

    public String getUseDtm() {
        return this.use_dtm;
    }

    public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onNavigationEvent(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setGubun(String str) {
        this.gubun = str;
    }

    public void setInfo(String str) {
        this.station = str;
    }

    public void setTransMth(String str) {
        this.trans_mth = str;
    }

    public void setUseAmt(String str) {
        this.use_amt = str;
    }

    public void setUseDtm(String str) {
        this.use_dtm = str;
    }

    protected /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.gubun) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 610);
            jsonWriter.value(this.gubun);
        }
        if (this != this.station) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 381);
            jsonWriter.value(this.station);
        }
        if (this != this.tr_no) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 407);
            jsonWriter.value(this.tr_no);
        }
        if (this != this.trans_mth) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 774);
            jsonWriter.value(this.trans_mth);
        }
        if (this != this.use_amt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 74);
            jsonWriter.value(this.use_amt);
        }
        if (this != this.use_dtm) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 28);
            jsonWriter.value(this.use_dtm);
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
        if (i == 17) {
            if (!z) {
                this.trans_mth = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.trans_mth = jsonReader.nextString();
                return;
            } else {
                this.trans_mth = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 163) {
            if (!z) {
                this.gubun = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.gubun = jsonReader.nextString();
                return;
            } else {
                this.gubun = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 403) {
            if (!z) {
                this.station = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.station = jsonReader.nextString();
                return;
            } else {
                this.station = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 552) {
            if (!z) {
                this.use_dtm = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.use_dtm = jsonReader.nextString();
                return;
            } else {
                this.use_dtm = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 587) {
            if (!z) {
                this.use_amt = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.use_amt = jsonReader.nextString();
                return;
            } else {
                this.use_amt = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 861) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.tr_no = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.tr_no = jsonReader.nextString();
        } else {
            this.tr_no = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
