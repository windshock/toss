package com.tmoney.kscc.sslio.dto.request;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class TRDR0015RequestDTO implements RequestDTO.Request {
    private String cardReqCtt;
    private String cardReqDvsCd;
    private String cardRspCtt;
    private String mbphMdlId;
    private String mbphNo;
    private String mbphOsVer;
    private String moappVer;
    private String unicId;

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public String getCardReqCtt() {
        return this.cardReqCtt;
    }

    public String getCardReqDvsCd() {
        return this.cardReqDvsCd;
    }

    public String getCardRspCtt() {
        return this.cardRspCtt;
    }

    public String getMbphMdlId() {
        return this.mbphMdlId;
    }

    public String getMbphNo() {
        return this.mbphNo;
    }

    public String getMbphOsVer() {
        return this.mbphOsVer;
    }

    public String getMoappVer() {
        return this.moappVer;
    }

    public String getUnicId() {
        return this.unicId;
    }

    public void setCardReqCtt(String str) {
        this.cardReqCtt = str;
    }

    public void setCardReqDvsCd(String str) {
        this.cardReqDvsCd = str;
    }

    public void setCardRspCtt(String str) {
        this.cardRspCtt = str;
    }

    public void setMbphMdlId(String str) {
        this.mbphMdlId = str;
    }

    public void setMbphNo(String str) {
        this.mbphNo = str;
    }

    public void setMbphOsVer(String str) {
        this.mbphOsVer = str;
    }

    public void setMoappVer(String str) {
        this.moappVer = str;
    }

    public void setUnicId(String str) {
        this.unicId = str;
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.cardReqCtt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 385);
            jsonWriter.value(this.cardReqCtt);
        }
        if (this != this.cardReqDvsCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 565);
            jsonWriter.value(this.cardReqDvsCd);
        }
        if (this != this.cardRspCtt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 137);
            jsonWriter.value(this.cardRspCtt);
        }
        if (this != this.mbphMdlId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 2);
            jsonWriter.value(this.mbphMdlId);
        }
        if (this != this.mbphNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 517);
            jsonWriter.value(this.mbphNo);
        }
        if (this != this.mbphOsVer) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 187);
            jsonWriter.value(this.mbphOsVer);
        }
        if (this != this.moappVer) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 643);
            jsonWriter.value(this.moappVer);
        }
        if (this != this.unicId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 595);
            jsonWriter.value(this.unicId);
        }
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onExtraCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 200) {
            if (!z) {
                this.cardReqCtt = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.cardReqCtt = jsonReader.nextString();
                return;
            } else {
                this.cardReqCtt = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 244) {
            if (!z) {
                this.cardRspCtt = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.cardRspCtt = jsonReader.nextString();
                return;
            } else {
                this.cardRspCtt = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 293) {
            if (!z) {
                this.cardReqDvsCd = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.cardReqDvsCd = jsonReader.nextString();
                return;
            } else {
                this.cardReqDvsCd = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 447) {
            if (!z) {
                this.moappVer = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.moappVer = jsonReader.nextString();
                return;
            } else {
                this.moappVer = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 511) {
            if (!z) {
                this.mbphNo = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.mbphNo = jsonReader.nextString();
                return;
            } else {
                this.mbphNo = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 553) {
            if (!z) {
                this.mbphOsVer = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.mbphOsVer = jsonReader.nextString();
                return;
            } else {
                this.mbphOsVer = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 593) {
            if (!z) {
                this.unicId = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.unicId = jsonReader.nextString();
                return;
            } else {
                this.unicId = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 738) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.mbphMdlId = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.mbphMdlId = jsonReader.nextString();
        } else {
            this.mbphMdlId = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
