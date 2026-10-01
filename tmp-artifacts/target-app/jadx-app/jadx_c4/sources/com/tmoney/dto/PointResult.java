package com.tmoney.dto;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.Serializable;
import java.util.ArrayList;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;
import o.RenameColumnEntries;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class PointResult implements Serializable {
    private String command;

    @SerializedName("RESULT_CODE")
    private String resultCode;

    @SerializedName("RESULT_DATA")
    private PointResultData resultData;

    @SerializedName("RESULT_LIST")
    ArrayList<PointResultData> resultList = new ArrayList<>();

    @SerializedName("RESULT_LIST_CNT")
    private int resultListCount;

    @SerializedName("RESULT_MESSAGE")
    private String resultMessage;

    public String getCommand() {
        return this.command;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public PointResultData getResultData() {
        return this.resultData;
    }

    public ArrayList<PointResultData> getResultList() {
        return this.resultList;
    }

    public int getResultListCount() {
        return this.resultListCount;
    }

    public String getResultMessage() {
        return this.resultMessage;
    }

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setCommand(String str) {
        this.command = str;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }

    public void setResultData(PointResultData pointResultData) {
        this.resultData = pointResultData;
    }

    public void setResultList(ArrayList<PointResultData> arrayList) {
        this.resultList = arrayList;
    }

    public void setResultListCount(int i) {
        this.resultListCount = i;
    }

    public void setResultMessage(String str) {
        this.resultMessage = str;
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.command) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 308);
            jsonWriter.value(this.command);
        }
        if (this != this.resultCode) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 241);
            jsonWriter.value(this.resultCode);
        }
        if (this != this.resultData) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 23);
            PointResultData pointResultData = this.resultData;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, PointResultData.class, pointResultData).write(jsonWriter, pointResultData);
        }
        if (this != this.resultList) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 552);
            RenameColumnEntries renameColumnEntries = new RenameColumnEntries();
            ArrayList<PointResultData> arrayList = this.resultList;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, renameColumnEntries, arrayList).write(jsonWriter, arrayList);
        }
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 159);
        jsonWriter.value(Integer.valueOf(this.resultListCount));
        if (this != this.resultMessage) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 400);
            jsonWriter.value(this.resultMessage);
        }
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) throws JsonSyntaxException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onExtraCallbackWithResult(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.gson.JsonSyntaxException */
    protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, int i) throws JsonSyntaxException {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 58) {
            if (!z) {
                jsonReader.nextNull();
                return;
            }
            try {
                this.resultListCount = jsonReader.nextInt();
                return;
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }
        if (i == 77) {
            if (z) {
                this.resultData = (PointResultData) gson.getAdapter(PointResultData.class).read(jsonReader);
                return;
            } else {
                this.resultData = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 131) {
            if (!z) {
                this.resultCode = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.resultCode = jsonReader.nextString();
                return;
            } else {
                this.resultCode = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 245) {
            if (!z) {
                this.resultMessage = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.resultMessage = jsonReader.nextString();
                return;
            } else {
                this.resultMessage = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 743) {
            if (z) {
                this.resultList = (ArrayList) gson.getAdapter(new RenameColumnEntries()).read(jsonReader);
                return;
            } else {
                this.resultList = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i != 744) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.command = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.command = jsonReader.nextString();
        } else {
            this.command = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
