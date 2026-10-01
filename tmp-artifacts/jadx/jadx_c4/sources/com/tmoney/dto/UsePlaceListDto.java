package com.tmoney.dto;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.Serializable;
import java.util.List;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;
import o.RoomdatabaseBuilder3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class UsePlaceListDto implements Serializable {

    @SerializedName("count")
    private String count;

    @SerializedName("date")
    private String date;

    @SerializedName("itemList")
    private List<UsePlaceInfoDto> itemList;

    @SerializedName("msg")
    private String message;

    @SerializedName("status")
    private String status;

    public String getCount() {
        return this.count;
    }

    public String getDate() {
        return this.date;
    }

    public List<UsePlaceInfoDto> getItemList() {
        return this.itemList;
    }

    public String getMessage() {
        return this.message;
    }

    public String getStatus() {
        return this.status;
    }

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setCount(String str) {
        this.count = str;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setItemList(List<UsePlaceInfoDto> list) {
        this.itemList = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.count) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 560);
            jsonWriter.value(this.count);
        }
        if (this != this.date) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 432);
            jsonWriter.value(this.date);
        }
        if (this != this.itemList) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 106);
            RoomdatabaseBuilder3 roomdatabaseBuilder3 = new RoomdatabaseBuilder3();
            List<UsePlaceInfoDto> list = this.itemList;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, roomdatabaseBuilder3, list).write(jsonWriter, list);
        }
        if (this != this.message) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 763);
            jsonWriter.value(this.message);
        }
        if (this != this.status) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 836);
            jsonWriter.value(this.status);
        }
    }

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onNavigationEvent(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 16) {
            if (!z) {
                this.status = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.status = jsonReader.nextString();
                return;
            } else {
                this.status = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 40) {
            if (!z) {
                this.date = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.date = jsonReader.nextString();
                return;
            } else {
                this.date = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 277) {
            if (!z) {
                this.message = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.message = jsonReader.nextString();
                return;
            } else {
                this.message = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 366) {
            if (i != 822) {
                jsonReader.skipValue();
                return;
            } else if (z) {
                this.itemList = (List) gson.getAdapter(new RoomdatabaseBuilder3()).read(jsonReader);
                return;
            } else {
                this.itemList = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (!z) {
            this.count = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.count = jsonReader.nextString();
        } else {
            this.count = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
