package com.tmoney.kscc.sslio.dto.response;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import o.AutoClosingRoomOpenHelperAutoClosingSupportSQLiteDatabaseExternalSyntheticLambda8;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class ResultTRDR0012CardRowDTO {

    @SerializedName("code")
    private String code;

    @SerializedName("fee")
    private String fee;

    @SerializedName("gubun")
    private String gubun;

    @SerializedName("info")
    private String info;

    @SerializedName("limit")
    private ArrayList<String> limit;

    @SerializedName("superCode")
    private String super_code;

    public String getCode() {
        return this.code;
    }

    public String getFee() {
        return this.fee;
    }

    public String getGubun() {
        return this.gubun;
    }

    public String getInfo() {
        return this.info;
    }

    public String getLimit(int i) {
        return this.limit.get(i);
    }

    public ArrayList<String> getLimit() {
        return this.limit;
    }

    public String getSuperCode() {
        return this.super_code;
    }

    public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
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

    public void setInfo(String str) {
        this.info = str;
    }

    public void setLimit(ArrayList<String> arrayList) {
        this.limit = arrayList;
    }

    public void setSuperCode(String str) {
        this.super_code = str;
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
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
        if (this != this.info) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 811);
            jsonWriter.value(this.info);
        }
        if (this != this.limit) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 493);
            AutoClosingRoomOpenHelperAutoClosingSupportSQLiteDatabaseExternalSyntheticLambda8 autoClosingRoomOpenHelperAutoClosingSupportSQLiteDatabaseExternalSyntheticLambda8 = new AutoClosingRoomOpenHelperAutoClosingSupportSQLiteDatabaseExternalSyntheticLambda8();
            ArrayList<String> arrayList = this.limit;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, autoClosingRoomOpenHelperAutoClosingSupportSQLiteDatabaseExternalSyntheticLambda8, arrayList).write(jsonWriter, arrayList);
        }
        if (this != this.super_code) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 602);
            jsonWriter.value(this.super_code);
        }
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            IAuthTabCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 72) {
            if (z) {
                this.limit = (ArrayList) gson.getAdapter(new AutoClosingRoomOpenHelperAutoClosingSupportSQLiteDatabaseExternalSyntheticLambda8()).read(jsonReader);
                return;
            } else {
                this.limit = null;
                jsonReader.nextNull();
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
        if (i == 350) {
            if (!z) {
                this.info = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.info = jsonReader.nextString();
                return;
            } else {
                this.info = Boolean.toString(jsonReader.nextBoolean());
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
        if (i != 641) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.fee = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.fee = jsonReader.nextString();
        } else {
            this.fee = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
