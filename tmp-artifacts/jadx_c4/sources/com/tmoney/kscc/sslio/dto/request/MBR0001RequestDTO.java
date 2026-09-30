package com.tmoney.kscc.sslio.dto.request;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class MBR0001RequestDTO implements RequestDTO.Request {
    private String areaCd;
    private String gndrCd;
    private String mbphMdlId;
    private String mbphNo;
    private String moappVer;
    private String mvnoCd;
    private String prsnAuthCiVal;
    private String tlcmCd;
    private String tmcrNo;
    private String unicId;
    private String userBrdt;

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

    public /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
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

    public void setPrsnAuthCiVal(String str) {
        this.prsnAuthCiVal = str;
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

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
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
        if (this != this.prsnAuthCiVal) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 600);
            jsonWriter.value(this.prsnAuthCiVal);
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
            case 118:
                if (!z) {
                    this.prsnAuthCiVal = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.prsnAuthCiVal = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.prsnAuthCiVal = jsonReader.nextString();
                    break;
                }
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
