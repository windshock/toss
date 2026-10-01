package com.tmoney.kscc.sslio.dto.response;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;
import o.SavedStateRegistryImplExternalSyntheticLambda0;
import o.SavedStateRegistryImplExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class TRDR0016ResponseDTO extends ResponseDTO {
    private Response response;

    public class Response {
        private ArrayList<TRDR0016List> phonebill;
        private ArrayList<TRDR0016List> remit;
        private String rspCd;
        private String rspMsg;

        public Response() {
        }

        public ArrayList<TRDR0016List> getPhonebill() {
            return this.phonebill;
        }

        public ArrayList<TRDR0016List> getRemit() {
            return this.remit;
        }

        public String getRspCd() {
            return this.rspCd;
        }

        public String getRspMsg() {
            return this.rspMsg;
        }

        public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        public void setPhonebill(ArrayList<TRDR0016List> arrayList) {
            this.phonebill = arrayList;
        }

        public void setRemit(ArrayList<TRDR0016List> arrayList) {
            this.remit = arrayList;
        }

        public void setRspCd(String str) {
            this.rspCd = str;
        }

        public void setRspMsg(String str) {
            this.rspMsg = str;
        }

        protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.phonebill) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 814);
                SavedStateRegistryImplExternalSyntheticLambda0 savedStateRegistryImplExternalSyntheticLambda0 = new SavedStateRegistryImplExternalSyntheticLambda0();
                ArrayList<TRDR0016List> arrayList = this.phonebill;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, savedStateRegistryImplExternalSyntheticLambda0, arrayList).write(jsonWriter, arrayList);
            }
            if (this != this.remit) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 124);
                SavedStateRegistryImplExternalSyntheticLambda1 savedStateRegistryImplExternalSyntheticLambda1 = new SavedStateRegistryImplExternalSyntheticLambda1();
                ArrayList<TRDR0016List> arrayList2 = this.remit;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, savedStateRegistryImplExternalSyntheticLambda1, arrayList2).write(jsonWriter, arrayList2);
            }
            if (this != this.rspCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 482);
                jsonWriter.value(this.rspCd);
            }
            if (this != this.rspMsg) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 785);
                jsonWriter.value(this.rspMsg);
            }
        }

        public /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                onWarmupCompleted(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, int i) {
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (i == 10) {
                if (z) {
                    this.phonebill = (ArrayList) gson.getAdapter(new SavedStateRegistryImplExternalSyntheticLambda0()).read(jsonReader);
                    return;
                } else {
                    this.phonebill = null;
                    jsonReader.nextNull();
                    return;
                }
            }
            if (i == 227) {
                if (!z) {
                    this.rspCd = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.rspCd = jsonReader.nextString();
                    return;
                } else {
                    this.rspCd = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            }
            if (i != 385) {
                if (i != 685) {
                    jsonReader.skipValue();
                    return;
                } else if (z) {
                    this.remit = (ArrayList) gson.getAdapter(new SavedStateRegistryImplExternalSyntheticLambda1()).read(jsonReader);
                    return;
                } else {
                    this.remit = null;
                    jsonReader.nextNull();
                    return;
                }
            }
            if (!z) {
                this.rspMsg = null;
                jsonReader.nextNull();
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.rspMsg = jsonReader.nextString();
            } else {
                this.rspMsg = Boolean.toString(jsonReader.nextBoolean());
            }
        }
    }

    public class TRDR0016List {
        private String fee;
        private String fxrtFamtDvsCd;
        private String maxChg;
        private String minChg;
        private String minFee;
        private String pymMnsTypCd;
        private String svcNm;

        public TRDR0016List() {
        }

        public String getFee() {
            return this.fee;
        }

        public String getFxrtFamtDvsCd() {
            return this.fxrtFamtDvsCd;
        }

        public String getMaxChg() {
            return this.maxChg;
        }

        public String getMinChg() {
            return this.minChg;
        }

        public String getMinFee() {
            return this.minFee;
        }

        public String getPymMnsTypCd() {
            return this.pymMnsTypCd;
        }

        public String getSvcNm() {
            return this.svcNm;
        }

        public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onNavigationEvent(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        public void setFee(String str) {
            this.fee = str;
        }

        public void setFxrtFamtDvsCd(String str) {
            this.fxrtFamtDvsCd = str;
        }

        public void setMaxChg(String str) {
            this.maxChg = str;
        }

        public void setMinChg(String str) {
            this.minChg = str;
        }

        public void setMinFee(String str) {
            this.minFee = str;
        }

        public void setPymMnsTypCd(String str) {
            this.pymMnsTypCd = str;
        }

        public void setSvcNm(String str) {
            this.svcNm = str;
        }

        protected /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.fee) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 571);
                jsonWriter.value(this.fee);
            }
            if (this != this.fxrtFamtDvsCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 802);
                jsonWriter.value(this.fxrtFamtDvsCd);
            }
            if (this != this.maxChg) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 143);
                jsonWriter.value(this.maxChg);
            }
            if (this != this.minChg) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 588);
                jsonWriter.value(this.minChg);
            }
            if (this != this.minFee) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 125);
                jsonWriter.value(this.minFee);
            }
            if (this != this.pymMnsTypCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 347);
                jsonWriter.value(this.pymMnsTypCd);
            }
            if (this != this.svcNm) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 9);
                jsonWriter.value(this.svcNm);
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
            if (i == 24) {
                if (!z) {
                    this.fxrtFamtDvsCd = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.fxrtFamtDvsCd = jsonReader.nextString();
                    return;
                } else {
                    this.fxrtFamtDvsCd = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            }
            if (i == 39) {
                if (!z) {
                    this.maxChg = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.maxChg = jsonReader.nextString();
                    return;
                } else {
                    this.maxChg = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            }
            if (i == 146) {
                if (!z) {
                    this.svcNm = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.svcNm = jsonReader.nextString();
                    return;
                } else {
                    this.svcNm = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            }
            if (i == 252) {
                if (!z) {
                    this.minFee = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.minFee = jsonReader.nextString();
                    return;
                } else {
                    this.minFee = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            }
            if (i == 638) {
                if (!z) {
                    this.pymMnsTypCd = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.pymMnsTypCd = jsonReader.nextString();
                    return;
                } else {
                    this.pymMnsTypCd = Boolean.toString(jsonReader.nextBoolean());
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
            if (i != 790) {
                jsonReader.skipValue();
                return;
            }
            if (!z) {
                this.minChg = null;
                jsonReader.nextNull();
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.minChg = jsonReader.nextString();
            } else {
                this.minChg = Boolean.toString(jsonReader.nextBoolean());
            }
        }
    }

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public Response getResponse() {
        return this.response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.response) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 280);
            Response response = this.response;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, Response.class, response).write(jsonWriter, response);
        }
        asInterface(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
    }

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            IAuthTabCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i != 231) {
            IAuthTabCallbackStub(gson, jsonReader, i);
        } else if (z) {
            this.response = (Response) gson.getAdapter(Response.class).read(jsonReader);
        } else {
            this.response = null;
            jsonReader.nextNull();
        }
    }
}
