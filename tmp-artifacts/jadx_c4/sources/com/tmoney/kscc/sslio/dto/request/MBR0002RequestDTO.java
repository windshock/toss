package com.tmoney.kscc.sslio.dto.request;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class MBR0002RequestDTO implements RequestDTO.Request {
    private String areaCd;
    private String gndrCd;
    private String mbphMdlId;
    private String mbphNo;
    private String moappVer;
    private String mvnoCd;
    private String ppyDpyDvsCd;
    private String tlcmCd;
    private String tmcrNo;
    private String unicId;
    private String userBrdt;

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public String getAreaCd() {
        return this.areaCd;
    }

    public String getGndrCd() {
        return this.gndrCd;
    }

    public String getMbphMdlId() {
        return this.mbphMdlId;
    }

    public String getMbphNo() {
        return this.mbphNo;
    }

    public String getMoappVer() {
        return this.moappVer;
    }

    public String getMvnoCd() {
        return this.mvnoCd;
    }

    public String getPpyDpyDvsCd() {
        return this.ppyDpyDvsCd;
    }

    public String getTlcmCd() {
        return this.tlcmCd;
    }

    public String getTmcrNo() {
        return this.tmcrNo;
    }

    public String getUnic() {
        return this.unicId;
    }

    public String getUserBrdt() {
        return this.userBrdt;
    }

    public void setAreaCd(String str) {
        this.areaCd = str;
    }

    public void setGndrCd(String str) {
        this.gndrCd = str;
    }

    public void setMbphMdlId(String str) {
        this.mbphMdlId = str;
    }

    public void setMbphNo(String str) {
        this.mbphNo = str;
    }

    public void setMoappVer(String str) {
        this.moappVer = str;
    }

    public void setMvnoCd(String str) {
        this.mvnoCd = str;
    }

    public void setPpyDpyDvsCd(String str) {
        this.ppyDpyDvsCd = str;
    }

    public void setTlcmCd(String str) {
        this.tlcmCd = str;
    }

    public void setTmcrNo(String str) {
        this.tmcrNo = str;
    }

    public void setUnic(String str) {
        this.unicId = str;
    }

    public void setUserBrdt(String str) {
        this.userBrdt = str;
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.areaCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 771);
            jsonWriter.value(this.areaCd);
        }
        if (this != this.gndrCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 830);
            jsonWriter.value(this.gndrCd);
        }
        if (this != this.mbphMdlId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 2);
            jsonWriter.value(this.mbphMdlId);
        }
        if (this != this.mbphNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 517);
            jsonWriter.value(this.mbphNo);
        }
        if (this != this.moappVer) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 643);
            jsonWriter.value(this.moappVer);
        }
        if (this != this.mvnoCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 199);
            jsonWriter.value(this.mvnoCd);
        }
        if (this != this.ppyDpyDvsCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 363);
            jsonWriter.value(this.ppyDpyDvsCd);
        }
        if (this != this.tlcmCd) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 33);
            jsonWriter.value(this.tlcmCd);
        }
        if (this != this.tmcrNo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 114);
            jsonWriter.value(this.tmcrNo);
        }
        if (this != this.unicId) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 595);
            jsonWriter.value(this.unicId);
        }
        if (this != this.userBrdt) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 147);
            jsonWriter.value(this.userBrdt);
        }
    }

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onExtraCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        switch (i) {
            case 356:
                if (!z) {
                    this.gndrCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.gndrCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.gndrCd = jsonReader.nextString();
                    break;
                }
            case 447:
                if (!z) {
                    this.moappVer = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.moappVer = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.moappVer = jsonReader.nextString();
                    break;
                }
            case 511:
                if (!z) {
                    this.mbphNo = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.mbphNo = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.mbphNo = jsonReader.nextString();
                    break;
                }
            case 593:
                if (!z) {
                    this.unicId = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.unicId = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.unicId = jsonReader.nextString();
                    break;
                }
            case 628:
                if (!z) {
                    this.userBrdt = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.userBrdt = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.userBrdt = jsonReader.nextString();
                    break;
                }
            case 696:
                if (!z) {
                    this.tlcmCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.tlcmCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.tlcmCd = jsonReader.nextString();
                    break;
                }
            case 715:
                if (!z) {
                    this.mvnoCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.mvnoCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.mvnoCd = jsonReader.nextString();
                    break;
                }
            case 728:
                if (!z) {
                    this.ppyDpyDvsCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.ppyDpyDvsCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.ppyDpyDvsCd = jsonReader.nextString();
                    break;
                }
            case 738:
                if (!z) {
                    this.mbphMdlId = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.mbphMdlId = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.mbphMdlId = jsonReader.nextString();
                    break;
                }
            case 761:
                if (!z) {
                    this.tmcrNo = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.tmcrNo = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.tmcrNo = jsonReader.nextString();
                    break;
                }
            case 767:
                if (!z) {
                    this.areaCd = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.areaCd = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.areaCd = jsonReader.nextString();
                    break;
                }
            default:
                jsonReader.skipValue();
                break;
        }
    }
}
