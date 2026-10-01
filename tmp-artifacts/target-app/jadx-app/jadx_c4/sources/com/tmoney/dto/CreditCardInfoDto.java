package com.tmoney.dto;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import o.AmbiguousColumnResolverExternalSyntheticLambda1;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class CreditCardInfoDto {
    private boolean bCredit;

    @SerializedName("code")
    private String code;

    @SerializedName("fee")
    private String fee;

    @SerializedName("gubun")
    private String gubun;

    @SerializedName("limit")
    private ArrayList<String> limit;

    @SerializedName("name")
    private String name;

    @SerializedName("superCode")
    private String super_code = "";

    public String getCode() {
        return this.code;
    }

    public String getFee() {
        return this.fee;
    }

    public String getGubun() {
        return this.gubun;
    }

    public boolean getIsCredit() {
        return this.bCredit;
    }

    public int getLimit() {
        ArrayList<String> arrayList = this.limit;
        if (arrayList == null || arrayList.size() == 0) {
            return -1;
        }
        return Integer.parseInt(this.limit.get(0));
    }

    public String getName() {
        return this.name;
    }

    public String getSuperCode() {
        return this.super_code;
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setFee(String str) {
        this.fee = str;
    }

    public void setGubun(String str) {
        this.gubun = str;
    }

    public void setIsCredit(boolean z) {
        this.bCredit = z;
    }

    public void setLimit(ArrayList<String> arrayList) {
        this.limit = arrayList;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSuperCode(String str) {
        this.super_code = str;
    }

    protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 247);
        jsonWriter.value(this.bCredit);
        if (this != this.code) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 324);
            jsonWriter.value(this.code);
        }
        if (this != this.fee) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 571);
            jsonWriter.value(this.fee);
        }
        if (this != this.gubun) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 610);
            jsonWriter.value(this.gubun);
        }
        if (this != this.limit) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 493);
            AmbiguousColumnResolverExternalSyntheticLambda1 ambiguousColumnResolverExternalSyntheticLambda1 = new AmbiguousColumnResolverExternalSyntheticLambda1();
            ArrayList<String> arrayList = this.limit;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, ambiguousColumnResolverExternalSyntheticLambda1, arrayList).write(jsonWriter, arrayList);
        }
        if (this != this.name) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 765);
            jsonWriter.value(this.name);
        }
        if (this != this.super_code) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 602);
            jsonWriter.value(this.super_code);
        }
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onNavigationEvent(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 72) {
            if (z) {
                this.limit = (ArrayList) gson.getAdapter(new AmbiguousColumnResolverExternalSyntheticLambda1()).read(jsonReader);
                return;
            } else {
                this.limit = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 168) {
            if (!z) {
                this.super_code = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.super_code = jsonReader.nextString();
                return;
            } else {
                this.super_code = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 448) {
            if (!z) {
                this.code = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.code = jsonReader.nextString();
                return;
            } else {
                this.code = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 639) {
            if (z) {
                this.bCredit = ((Boolean) gson.getAdapter(Boolean.class).read(jsonReader)).booleanValue();
                return;
            } else {
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 641) {
            if (!z) {
                this.fee = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.fee = jsonReader.nextString();
                return;
            } else {
                this.fee = Boolean.toString(jsonReader.nextBoolean());
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
        if (i != 164) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.name = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.name = jsonReader.nextString();
        } else {
            this.name = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
