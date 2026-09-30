package com.tmoney.dto;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class RequestT5 {
    public String APP_VER;
    public String CARD_CMPL_CD;
    public String CARD_ID;
    public int CHG_AMT;
    public String CHG_TYPE;
    public String ENC_KEY;
    public int FEE_AMT;
    public String GUBUN;
    public String ILOAD_RESULT;
    public String MOBILE_NO;
    public String MODEL_ID;
    public String MTEL_CO;
    public String OS_VER;
    public String PAY_METHOD;
    public String PAY_METHOD_VAL;
    public String PLATFORM;
    public String REQ_DH;
    public String SELECT_RESULT;
    public String TYPE = "T5";
    public String UUID;
    public String WAY;

    public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.APP_VER) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 360);
            jsonWriter.value(this.APP_VER);
        }
        if (this != this.CARD_CMPL_CD) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 753);
            jsonWriter.value(this.CARD_CMPL_CD);
        }
        if (this != this.CARD_ID) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 405);
            jsonWriter.value(this.CARD_ID);
        }
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 246);
        jsonWriter.value(Integer.valueOf(this.CHG_AMT));
        if (this != this.CHG_TYPE) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 457);
            jsonWriter.value(this.CHG_TYPE);
        }
        if (this != this.ENC_KEY) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 646);
            jsonWriter.value(this.ENC_KEY);
        }
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 638);
        jsonWriter.value(Integer.valueOf(this.FEE_AMT));
        if (this != this.GUBUN) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 463);
            jsonWriter.value(this.GUBUN);
        }
        if (this != this.ILOAD_RESULT) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 235);
            jsonWriter.value(this.ILOAD_RESULT);
        }
        if (this != this.MOBILE_NO) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 834);
            jsonWriter.value(this.MOBILE_NO);
        }
        if (this != this.MODEL_ID) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 460);
            jsonWriter.value(this.MODEL_ID);
        }
        if (this != this.MTEL_CO) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 662);
            jsonWriter.value(this.MTEL_CO);
        }
        if (this != this.OS_VER) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 175);
            jsonWriter.value(this.OS_VER);
        }
        if (this != this.PAY_METHOD) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 708);
            jsonWriter.value(this.PAY_METHOD);
        }
        if (this != this.PAY_METHOD_VAL) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 66);
            jsonWriter.value(this.PAY_METHOD_VAL);
        }
        if (this != this.PLATFORM) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 696);
            jsonWriter.value(this.PLATFORM);
        }
        if (this != this.REQ_DH) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 369);
            jsonWriter.value(this.REQ_DH);
        }
        if (this != this.SELECT_RESULT) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 794);
            jsonWriter.value(this.SELECT_RESULT);
        }
        if (this != this.TYPE) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 653);
            jsonWriter.value(this.TYPE);
        }
        if (this != this.UUID) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 821);
            jsonWriter.value(this.UUID);
        }
        if (this != this.WAY) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 799);
            jsonWriter.value(this.WAY);
        }
    }

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) throws JsonSyntaxException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onExtraCallbackWithResult(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.gson.JsonSyntaxException */
    protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, int i) throws JsonSyntaxException {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        switch (i) {
            case 69:
                if (!z) {
                    this.ENC_KEY = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.ENC_KEY = jsonReader.nextString();
                    return;
                } else {
                    this.ENC_KEY = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 96:
                if (!z) {
                    this.PAY_METHOD_VAL = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.PAY_METHOD_VAL = jsonReader.nextString();
                    return;
                } else {
                    this.PAY_METHOD_VAL = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 204:
                if (!z) {
                    this.CARD_CMPL_CD = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.CARD_CMPL_CD = jsonReader.nextString();
                    return;
                } else {
                    this.CARD_CMPL_CD = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 214:
                if (!z) {
                    this.CHG_TYPE = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.CHG_TYPE = jsonReader.nextString();
                    return;
                } else {
                    this.CHG_TYPE = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 253:
                if (!z) {
                    this.MTEL_CO = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.MTEL_CO = jsonReader.nextString();
                    return;
                } else {
                    this.MTEL_CO = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case AbstractSmartcard.RES_BUFF /* 258 */:
                if (!z) {
                    this.MOBILE_NO = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.MOBILE_NO = jsonReader.nextString();
                    return;
                } else {
                    this.MOBILE_NO = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 259:
                if (!z) {
                    this.UUID = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.UUID = jsonReader.nextString();
                    return;
                } else {
                    this.UUID = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 332:
                if (!z) {
                    jsonReader.nextNull();
                    return;
                }
                try {
                    this.FEE_AMT = jsonReader.nextInt();
                    return;
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            case 364:
                if (!z) {
                    this.OS_VER = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.OS_VER = jsonReader.nextString();
                    return;
                } else {
                    this.OS_VER = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 471:
                if (!z) {
                    this.TYPE = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.TYPE = jsonReader.nextString();
                    return;
                } else {
                    this.TYPE = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 517:
                if (!z) {
                    this.REQ_DH = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.REQ_DH = jsonReader.nextString();
                    return;
                } else {
                    this.REQ_DH = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 533:
                if (!z) {
                    this.PAY_METHOD = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.PAY_METHOD = jsonReader.nextString();
                    return;
                } else {
                    this.PAY_METHOD = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 609:
                if (!z) {
                    this.MODEL_ID = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.MODEL_ID = jsonReader.nextString();
                    return;
                } else {
                    this.MODEL_ID = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 612:
                if (!z) {
                    this.PLATFORM = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.PLATFORM = jsonReader.nextString();
                    return;
                } else {
                    this.PLATFORM = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 651:
                if (!z) {
                    this.SELECT_RESULT = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.SELECT_RESULT = jsonReader.nextString();
                    return;
                } else {
                    this.SELECT_RESULT = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 653:
                if (!z) {
                    this.GUBUN = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.GUBUN = jsonReader.nextString();
                    return;
                } else {
                    this.GUBUN = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 654:
                if (!z) {
                    this.APP_VER = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.APP_VER = jsonReader.nextString();
                    return;
                } else {
                    this.APP_VER = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 712:
                if (!z) {
                    jsonReader.nextNull();
                    return;
                }
                try {
                    this.CHG_AMT = jsonReader.nextInt();
                    return;
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            case 739:
                if (!z) {
                    this.ILOAD_RESULT = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.ILOAD_RESULT = jsonReader.nextString();
                    return;
                } else {
                    this.ILOAD_RESULT = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 764:
                if (!z) {
                    this.WAY = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.WAY = jsonReader.nextString();
                    return;
                } else {
                    this.WAY = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            case 773:
                if (!z) {
                    this.CARD_ID = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.CARD_ID = jsonReader.nextString();
                    return;
                } else {
                    this.CARD_ID = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            default:
                jsonReader.skipValue();
                return;
        }
    }
}
