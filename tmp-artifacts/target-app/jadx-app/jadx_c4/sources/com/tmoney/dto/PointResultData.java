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
public class PointResultData implements Serializable {

    @SerializedName("cum_mileage")
    private String cumMileage;

    @SerializedName("cum_pnt")
    private String cumPnt;

    @SerializedName("cum_sum")
    private String cumSum;

    @SerializedName("expi_mileage")
    private String expiMileage;

    @SerializedName("expi_pnt")
    private String expiPnt;

    @SerializedName("expi_sum")
    private String expiSum;

    @SerializedName("mbr_mng_no")
    private String mbrMngNo;

    @SerializedName("prc_dvs")
    private String prcDvs;

    @SerializedName("ptu_mileage")
    private String ptuMileage;

    @SerializedName("ptu_pnt")
    private String ptuPnt;

    @SerializedName("ptu_sum")
    private String ptuSum;

    @SerializedName("rmn_mileage")
    private String rmnMileage;

    @SerializedName("rmn_pnt")
    private String rmnPnt;

    @SerializedName("rmn_sum")
    private String rmnSum;

    @SerializedName("schd_mileage")
    private String schdMileage;

    @SerializedName("schd_pnt")
    private String schdPnt;

    @SerializedName("schd_sum")
    private String schdSum;

    @SerializedName("use_mileage")
    private String useMileage;

    @SerializedName("use_pnt")
    private String usePnt;

    @SerializedName("use_sum")
    private String useSum;

    public String getCumMileage() {
        return this.cumMileage;
    }

    public String getCumPnt() {
        return this.cumPnt;
    }

    public String getCumSum() {
        return this.cumSum;
    }

    public String getExpiMileage() {
        return this.expiMileage;
    }

    public String getExpiPnt() {
        return this.expiPnt;
    }

    public String getExpiSum() {
        return this.expiSum;
    }

    public String getMbrMngNo() {
        return this.mbrMngNo;
    }

    public String getPrcDvs() {
        return this.prcDvs;
    }

    public String getPtuMileage() {
        return this.ptuMileage;
    }

    public String getPtuPnt() {
        return this.ptuPnt;
    }

    public String getPtuSum() {
        return this.ptuSum;
    }

    public String getRmnMileage() {
        return this.rmnMileage;
    }

    public String getRmnPnt() {
        return this.rmnPnt;
    }

    public String getRmnSum() {
        return this.rmnSum;
    }

    public String getSchdMileage() {
        return this.schdMileage;
    }

    public String getSchdPnt() {
        return this.schdPnt;
    }

    public String getSchdSum() {
        return this.schdSum;
    }

    public String getUseMileage() {
        return this.useMileage;
    }

    public String getUsePnt() {
        return this.usePnt;
    }

    public String getUseSum() {
        return this.useSum;
    }

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.cumMileage) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 38);
            jsonWriter.value(this.cumMileage);
        }
        if (this != this.cumPnt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 217);
            jsonWriter.value(this.cumPnt);
        }
        if (this != this.cumSum) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 80);
            jsonWriter.value(this.cumSum);
        }
        if (this != this.expiMileage) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 224);
            jsonWriter.value(this.expiMileage);
        }
        if (this != this.expiPnt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 118);
            jsonWriter.value(this.expiPnt);
        }
        if (this != this.expiSum) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 642);
            jsonWriter.value(this.expiSum);
        }
        if (this != this.mbrMngNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 319);
            jsonWriter.value(this.mbrMngNo);
        }
        if (this != this.prcDvs) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 769);
            jsonWriter.value(this.prcDvs);
        }
        if (this != this.ptuMileage) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 818);
            jsonWriter.value(this.ptuMileage);
        }
        if (this != this.ptuPnt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 384);
            jsonWriter.value(this.ptuPnt);
        }
        if (this != this.ptuSum) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 164);
            jsonWriter.value(this.ptuSum);
        }
        if (this != this.rmnMileage) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 343);
            jsonWriter.value(this.rmnMileage);
        }
        if (this != this.rmnPnt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 590);
            jsonWriter.value(this.rmnPnt);
        }
        if (this != this.rmnSum) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 181);
            jsonWriter.value(this.rmnSum);
        }
        if (this != this.schdMileage) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 95);
            jsonWriter.value(this.schdMileage);
        }
        if (this != this.schdPnt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 186);
            jsonWriter.value(this.schdPnt);
        }
        if (this != this.schdSum) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 661);
            jsonWriter.value(this.schdSum);
        }
        if (this != this.useMileage) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 750);
            jsonWriter.value(this.useMileage);
        }
        if (this != this.usePnt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 684);
            jsonWriter.value(this.usePnt);
        }
        if (this != this.useSum) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 330);
            jsonWriter.value(this.useSum);
        }
    }

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onNavigationEvent(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        switch (i) {
            case 19:
                if (!z) {
                    this.expiPnt = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.expiPnt = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.expiPnt = jsonReader.nextString();
                    break;
                }
            case 20:
                if (!z) {
                    this.rmnSum = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.rmnSum = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.rmnSum = jsonReader.nextString();
                    break;
                }
            case 89:
                if (!z) {
                    this.cumMileage = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.cumMileage = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.cumMileage = jsonReader.nextString();
                    break;
                }
            case 124:
                if (!z) {
                    this.useMileage = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.useMileage = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.useMileage = jsonReader.nextString();
                    break;
                }
            case 142:
                if (!z) {
                    this.ptuSum = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.ptuSum = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.ptuSum = jsonReader.nextString();
                    break;
                }
            case 147:
                if (!z) {
                    this.ptuMileage = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.ptuMileage = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.ptuMileage = jsonReader.nextString();
                    break;
                }
            case 175:
                if (!z) {
                    this.prcDvs = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.prcDvs = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.prcDvs = jsonReader.nextString();
                    break;
                }
            case 229:
                if (!z) {
                    this.schdMileage = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.schdMileage = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.schdMileage = jsonReader.nextString();
                    break;
                }
            case 241:
                if (!z) {
                    this.ptuPnt = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.ptuPnt = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.ptuPnt = jsonReader.nextString();
                    break;
                }
            case 288:
                if (!z) {
                    this.expiSum = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.expiSum = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.expiSum = jsonReader.nextString();
                    break;
                }
            case 400:
                if (!z) {
                    this.cumSum = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.cumSum = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.cumSum = jsonReader.nextString();
                    break;
                }
            case 482:
                if (!z) {
                    this.expiMileage = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.expiMileage = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.expiMileage = jsonReader.nextString();
                    break;
                }
            case 515:
                if (!z) {
                    this.usePnt = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.usePnt = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.usePnt = jsonReader.nextString();
                    break;
                }
            case 681:
                if (!z) {
                    this.useSum = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.useSum = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.useSum = jsonReader.nextString();
                    break;
                }
            case 691:
                if (!z) {
                    this.schdSum = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.schdSum = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.schdSum = jsonReader.nextString();
                    break;
                }
            case 737:
                if (!z) {
                    this.rmnPnt = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.rmnPnt = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.rmnPnt = jsonReader.nextString();
                    break;
                }
            case 810:
                if (!z) {
                    this.schdPnt = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.schdPnt = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.schdPnt = jsonReader.nextString();
                    break;
                }
            case 829:
                if (!z) {
                    this.mbrMngNo = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.mbrMngNo = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.mbrMngNo = jsonReader.nextString();
                    break;
                }
            case 847:
                if (!z) {
                    this.rmnMileage = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.rmnMileage = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.rmnMileage = jsonReader.nextString();
                    break;
                }
            case 871:
                if (!z) {
                    this.cumPnt = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.cumPnt = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.cumPnt = jsonReader.nextString();
                    break;
                }
            default:
                jsonReader.skipValue();
                break;
        }
    }
}
