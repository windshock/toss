package com.tmoney.dto;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class RequestT6 {
    public String APP_VER;
    public String CARD_ID;
    public String GUBUN;
    public String ILOAD_RESULT;
    public String LOAD_APDU;
    public String LOAD_RESULT;
    public String MOBILE_NO;
    public String MODEL_ID;
    public String MTEL_CO;
    public String OS_VER;
    public String PLATFORM;
    public String REQ_DH;
    public String TR_NO;
    public String TSIGN3;
    public String TYPE = "T6";
    public String UUID;

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.APP_VER) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 360);
            jsonWriter.value(this.APP_VER);
        }
        if (this != this.CARD_ID) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 405);
            jsonWriter.value(this.CARD_ID);
        }
        if (this != this.GUBUN) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 463);
            jsonWriter.value(this.GUBUN);
        }
        if (this != this.ILOAD_RESULT) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 235);
            jsonWriter.value(this.ILOAD_RESULT);
        }
        if (this != this.LOAD_APDU) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 71);
            jsonWriter.value(this.LOAD_APDU);
        }
        if (this != this.LOAD_RESULT) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 119);
            jsonWriter.value(this.LOAD_RESULT);
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
        if (this != this.PLATFORM) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 696);
            jsonWriter.value(this.PLATFORM);
        }
        if (this != this.REQ_DH) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 369);
            jsonWriter.value(this.REQ_DH);
        }
        if (this != this.TR_NO) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 76);
            jsonWriter.value(this.TR_NO);
        }
        if (this != this.TSIGN3) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 687);
            jsonWriter.value(this.TSIGN3);
        }
        if (this != this.TYPE) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 653);
            jsonWriter.value(this.TYPE);
        }
        if (this != this.UUID) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 821);
            jsonWriter.value(this.UUID);
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
        switch (i) {
            case 88:
                if (!z) {
                    this.TSIGN3 = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.TSIGN3 = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.TSIGN3 = jsonReader.nextString();
                    break;
                }
            case 253:
                if (!z) {
                    this.MTEL_CO = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.MTEL_CO = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.MTEL_CO = jsonReader.nextString();
                    break;
                }
            case AbstractSmartcard.RES_BUFF /* 258 */:
                if (!z) {
                    this.MOBILE_NO = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.MOBILE_NO = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.MOBILE_NO = jsonReader.nextString();
                    break;
                }
            case 259:
                if (!z) {
                    this.UUID = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.UUID = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.UUID = jsonReader.nextString();
                    break;
                }
            case 364:
                if (!z) {
                    this.OS_VER = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.OS_VER = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.OS_VER = jsonReader.nextString();
                    break;
                }
            case 376:
                if (!z) {
                    this.LOAD_APDU = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.LOAD_APDU = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.LOAD_APDU = jsonReader.nextString();
                    break;
                }
            case 471:
                if (!z) {
                    this.TYPE = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.TYPE = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.TYPE = jsonReader.nextString();
                    break;
                }
            case 517:
                if (!z) {
                    this.REQ_DH = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.REQ_DH = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.REQ_DH = jsonReader.nextString();
                    break;
                }
            case 609:
                if (!z) {
                    this.MODEL_ID = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.MODEL_ID = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.MODEL_ID = jsonReader.nextString();
                    break;
                }
            case 612:
                if (!z) {
                    this.PLATFORM = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.PLATFORM = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.PLATFORM = jsonReader.nextString();
                    break;
                }
            case 653:
                if (!z) {
                    this.GUBUN = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.GUBUN = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.GUBUN = jsonReader.nextString();
                    break;
                }
            case 654:
                if (!z) {
                    this.APP_VER = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.APP_VER = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.APP_VER = jsonReader.nextString();
                    break;
                }
            case 739:
                if (!z) {
                    this.ILOAD_RESULT = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.ILOAD_RESULT = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.ILOAD_RESULT = jsonReader.nextString();
                    break;
                }
            case 773:
                if (!z) {
                    this.CARD_ID = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.CARD_ID = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.CARD_ID = jsonReader.nextString();
                    break;
                }
            case 831:
                if (!z) {
                    this.LOAD_RESULT = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.LOAD_RESULT = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.LOAD_RESULT = jsonReader.nextString();
                    break;
                }
            case 875:
                if (!z) {
                    this.TR_NO = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.TR_NO = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.TR_NO = jsonReader.nextString();
                    break;
                }
            default:
                jsonReader.skipValue();
                break;
        }
    }
}
