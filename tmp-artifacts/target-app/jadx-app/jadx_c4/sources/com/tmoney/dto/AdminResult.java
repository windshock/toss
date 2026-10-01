package com.tmoney.dto;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.Serializable;
import java.util.ArrayList;
import o.AmbiguousColumnResolverExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class AdminResult implements Serializable {

    @SerializedName("cashReceiptsRgtDtm")
    private String cashReceiptsRgtDtm;

    @SerializedName("cashReceiptsYn")
    private String cashReceiptsYn;
    private String command;

    @SerializedName("count")
    private int count;

    @SerializedName("date")
    private String date;

    @SerializedName("deductionRgtDtm")
    private String deductionRgtDtm;

    @SerializedName("deductionYn")
    private String deductionYn;

    @SerializedName("denoCd")
    private String denoCd;

    @SerializedName("discountRgtDtm")
    private String discountRgtDtm;

    @SerializedName("discountYn")
    private String discountYn;

    @SerializedName("item")
    private AdminResultData item;

    @SerializedName("itemList")
    private ArrayList<AdminResultData> itemList = new ArrayList<>();

    @SerializedName("lossRgtDtm")
    private String lossRgtDtm;

    @SerializedName("lossYn")
    private String lossYn;

    @SerializedName("mileageRgtDtm")
    private String mileageRgtDtm;

    @SerializedName("mileageYn")
    private String mileageYn;

    @SerializedName("msg")
    private String msg;

    @SerializedName("msgCd")
    private String msgCd;

    @SerializedName("msgCont")
    private String msgCont;

    @SerializedName("plCd")
    private String plCd;

    @SerializedName("prcDvs")
    private String prcDvs;

    @SerializedName("RESULT_DATA")
    private AdminResultData resultData;

    @SerializedName("status")
    private String status;

    @SerializedName("useMileage")
    private String useMileage;

    public String getCashReceiptsRgtDtm() {
        return this.cashReceiptsRgtDtm;
    }

    public String getCashReceiptsYn() {
        return this.cashReceiptsYn;
    }

    public String getCommand() {
        return this.command;
    }

    public int getCount() {
        return this.count;
    }

    public String getDate() {
        return this.date;
    }

    public String getDeductionRgtDtm() {
        return this.deductionRgtDtm;
    }

    public String getDeductionYn() {
        return this.deductionYn;
    }

    public String getDenoCd() {
        return this.denoCd;
    }

    public String getDiscountRgtDtm() {
        return this.discountRgtDtm;
    }

    public String getDiscountYn() {
        return this.discountYn;
    }

    public AdminResultData getItem() {
        return this.item;
    }

    public String getLossRgtDtm() {
        return this.lossRgtDtm;
    }

    public String getLossYn() {
        return this.lossYn;
    }

    public String getMileageRgtDtm() {
        return this.mileageRgtDtm;
    }

    public String getMileageYn() {
        return this.mileageYn;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getMsgCd() {
        return this.msgCd;
    }

    public String getMsgCont() {
        return this.msgCont;
    }

    public String getPlCd() {
        return this.plCd;
    }

    public String getPrcDvs() {
        return this.prcDvs;
    }

    public AdminResultData getResultData() {
        return this.resultData;
    }

    public ArrayList<AdminResultData> getResultList() {
        return this.itemList;
    }

    public String getStatus() {
        return this.status;
    }

    public String getUseMileage() {
        return this.useMileage;
    }

    public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setCashReceiptsRgtDtm(String str) {
        this.cashReceiptsRgtDtm = str;
    }

    public void setCashReceiptsYn(String str) {
        this.cashReceiptsYn = str;
    }

    public void setCommand(String str) {
        this.command = str;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setDeductionRgtDtm(String str) {
        this.deductionRgtDtm = str;
    }

    public void setDeductionYn(String str) {
        this.deductionYn = str;
    }

    public void setDenoCd(String str) {
        this.denoCd = str;
    }

    public void setDiscountRgtDtm(String str) {
        this.discountRgtDtm = str;
    }

    public void setDiscountYn(String str) {
        this.discountYn = str;
    }

    public void setItem(AdminResultData adminResultData) {
        this.item = adminResultData;
    }

    public void setLossRgtDtm(String str) {
        this.lossRgtDtm = str;
    }

    public void setLossYn(String str) {
        this.lossYn = str;
    }

    public void setMileageRgtDtm(String str) {
        this.mileageRgtDtm = str;
    }

    public void setMileageYn(String str) {
        this.mileageYn = str;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setMsgCd(String str) {
        this.msgCd = str;
    }

    public void setMsgCont(String str) {
        this.msgCont = str;
    }

    public void setPlCd(String str) {
        this.plCd = str;
    }

    public void setPrcDvs(String str) {
        this.prcDvs = str;
    }

    public void setResultData(AdminResultData adminResultData) {
        this.resultData = adminResultData;
    }

    public void setResultList(ArrayList<AdminResultData> arrayList) {
        this.itemList = arrayList;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setUseMileage(String str) {
        this.useMileage = str;
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.cashReceiptsRgtDtm) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 141);
            jsonWriter.value(this.cashReceiptsRgtDtm);
        }
        if (this != this.cashReceiptsYn) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 31);
            jsonWriter.value(this.cashReceiptsYn);
        }
        if (this != this.command) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 308);
            jsonWriter.value(this.command);
        }
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 560);
        jsonWriter.value(Integer.valueOf(this.count));
        if (this != this.date) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 432);
            jsonWriter.value(this.date);
        }
        if (this != this.deductionRgtDtm) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 169);
            jsonWriter.value(this.deductionRgtDtm);
        }
        if (this != this.deductionYn) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 806);
            jsonWriter.value(this.deductionYn);
        }
        if (this != this.denoCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 547);
            jsonWriter.value(this.denoCd);
        }
        if (this != this.discountRgtDtm) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 233);
            jsonWriter.value(this.discountRgtDtm);
        }
        if (this != this.discountYn) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 13);
            jsonWriter.value(this.discountYn);
        }
        if (this != this.item) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 58);
            AdminResultData adminResultData = this.item;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, AdminResultData.class, adminResultData).write(jsonWriter, adminResultData);
        }
        if (this != this.itemList) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 106);
            AmbiguousColumnResolverExternalSyntheticLambda0 ambiguousColumnResolverExternalSyntheticLambda0 = new AmbiguousColumnResolverExternalSyntheticLambda0();
            ArrayList<AdminResultData> arrayList = this.itemList;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, ambiguousColumnResolverExternalSyntheticLambda0, arrayList).write(jsonWriter, arrayList);
        }
        if (this != this.lossRgtDtm) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 292);
            jsonWriter.value(this.lossRgtDtm);
        }
        if (this != this.lossYn) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 404);
            jsonWriter.value(this.lossYn);
        }
        if (this != this.mileageRgtDtm) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 377);
            jsonWriter.value(this.mileageRgtDtm);
        }
        if (this != this.mileageYn) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 213);
            jsonWriter.value(this.mileageYn);
        }
        if (this != this.msg) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 763);
            jsonWriter.value(this.msg);
        }
        if (this != this.msgCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 91);
            jsonWriter.value(this.msgCd);
        }
        if (this != this.msgCont) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 825);
            jsonWriter.value(this.msgCont);
        }
        if (this != this.plCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 757);
            jsonWriter.value(this.plCd);
        }
        if (this != this.prcDvs) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 491);
            jsonWriter.value(this.prcDvs);
        }
        if (this != this.resultData) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 23);
            AdminResultData adminResultData2 = this.resultData;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, AdminResultData.class, adminResultData2).write(jsonWriter, adminResultData2);
        }
        if (this != this.status) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 836);
            jsonWriter.value(this.status);
        }
        if (this != this.useMileage) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 157);
            jsonWriter.value(this.useMileage);
        }
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) throws JsonSyntaxException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            IAuthTabCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.gson.JsonSyntaxException */
    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, int i) throws JsonSyntaxException {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        switch (i) {
            case 16:
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
            case 40:
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
            case 45:
                if (!z) {
                    this.msgCd = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.msgCd = jsonReader.nextString();
                    return;
                } else {
                    this.msgCd = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 77:
                if (z) {
                    this.resultData = (AdminResultData) gson.getAdapter(AdminResultData.class).read(jsonReader);
                    return;
                } else {
                    this.resultData = null;
                    jsonReader.nextNull();
                    return;
                }
            case 264:
                if (!z) {
                    this.discountYn = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.discountYn = jsonReader.nextString();
                    return;
                } else {
                    this.discountYn = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 277:
                if (!z) {
                    this.msg = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.msg = jsonReader.nextString();
                    return;
                } else {
                    this.msg = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 303:
                if (!z) {
                    this.mileageYn = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.mileageYn = jsonReader.nextString();
                    return;
                } else {
                    this.mileageYn = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 366:
                if (!z) {
                    jsonReader.nextNull();
                    return;
                }
                try {
                    this.count = jsonReader.nextInt();
                    return;
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            case 431:
                if (!z) {
                    this.cashReceiptsRgtDtm = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.cashReceiptsRgtDtm = jsonReader.nextString();
                    return;
                } else {
                    this.cashReceiptsRgtDtm = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 459:
                if (z) {
                    this.item = (AdminResultData) gson.getAdapter(AdminResultData.class).read(jsonReader);
                    return;
                } else {
                    this.item = null;
                    jsonReader.nextNull();
                    return;
                }
            case 472:
                if (!z) {
                    this.useMileage = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.useMileage = jsonReader.nextString();
                    return;
                } else {
                    this.useMileage = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 539:
                if (!z) {
                    this.cashReceiptsYn = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.cashReceiptsYn = jsonReader.nextString();
                    return;
                } else {
                    this.cashReceiptsYn = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 549:
                if (!z) {
                    this.discountRgtDtm = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.discountRgtDtm = jsonReader.nextString();
                    return;
                } else {
                    this.discountRgtDtm = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 601:
                if (!z) {
                    this.lossRgtDtm = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.lossRgtDtm = jsonReader.nextString();
                    return;
                } else {
                    this.lossRgtDtm = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 603:
                if (!z) {
                    this.deductionRgtDtm = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.deductionRgtDtm = jsonReader.nextString();
                    return;
                } else {
                    this.deductionRgtDtm = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 614:
                if (!z) {
                    this.denoCd = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.denoCd = jsonReader.nextString();
                    return;
                } else {
                    this.denoCd = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 624:
                if (!z) {
                    this.deductionYn = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.deductionYn = jsonReader.nextString();
                    return;
                } else {
                    this.deductionYn = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 670:
                if (!z) {
                    this.plCd = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.plCd = jsonReader.nextString();
                    return;
                } else {
                    this.plCd = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 724:
                if (!z) {
                    this.msgCont = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.msgCont = jsonReader.nextString();
                    return;
                } else {
                    this.msgCont = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 744:
                if (!z) {
                    this.command = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.command = jsonReader.nextString();
                    return;
                } else {
                    this.command = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 748:
                if (!z) {
                    this.prcDvs = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.prcDvs = jsonReader.nextString();
                    return;
                } else {
                    this.prcDvs = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 779:
                if (!z) {
                    this.mileageRgtDtm = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.mileageRgtDtm = jsonReader.nextString();
                    return;
                } else {
                    this.mileageRgtDtm = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 822:
                if (z) {
                    this.itemList = (ArrayList) gson.getAdapter(new AmbiguousColumnResolverExternalSyntheticLambda0()).read(jsonReader);
                    return;
                } else {
                    this.itemList = null;
                    jsonReader.nextNull();
                    return;
                }
            case 837:
                if (!z) {
                    this.lossYn = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.lossYn = jsonReader.nextString();
                    return;
                } else {
                    this.lossYn = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            default:
                jsonReader.skipValue();
                return;
        }
    }
}
