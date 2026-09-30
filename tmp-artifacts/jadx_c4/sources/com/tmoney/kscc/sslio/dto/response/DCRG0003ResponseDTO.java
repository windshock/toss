package com.tmoney.kscc.sslio.dto.response;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class DCRG0003ResponseDTO extends ResponseDTO {
    private Response response;

    public class Response {
        private String InttRgtDtm;
        private String InttRgtYn;
        private String csrcRgtDtm;
        private String csrcRgtYn;
        private String dcRgtDtm;
        private String dcRgtYn;
        private String dutyDvs;
        private String missStolRgtDtm;
        private String missStolRgtYn;
        private String mlgRgtDtm;
        private String mlgRgtYn;
        private String ntknCd;
        private String plCd;
        private String rspCd;
        private String rspMsg;
        private String usePsbMlg;

        public Response() {
        }

        public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        public String getCsrcRgtDtm() {
            return this.csrcRgtDtm;
        }

        public String getCsrcRgtYn() {
            return this.csrcRgtYn;
        }

        public String getDcRgtDtm() {
            return this.dcRgtDtm;
        }

        public String getDcRgtYn() {
            return this.dcRgtYn;
        }

        public String getDutyDvs() {
            return this.dutyDvs;
        }

        public String getInttRgtDtm() {
            return this.InttRgtDtm;
        }

        public String getInttRgtYn() {
            return this.InttRgtYn;
        }

        public String getMissStolRgtDtm() {
            return this.missStolRgtDtm;
        }

        public String getMissStolRgtYn() {
            return this.missStolRgtYn;
        }

        public String getMlgRgtDtm() {
            return this.mlgRgtDtm;
        }

        public String getMlgRgtYn() {
            return this.mlgRgtYn;
        }

        public String getNtknCd() {
            return this.ntknCd;
        }

        public String getPlCd() {
            return this.plCd;
        }

        public String getRspCd() {
            return this.rspCd;
        }

        public String getRspMsg() {
            return this.rspMsg;
        }

        public String getUsePsbMlg() {
            return this.usePsbMlg;
        }

        public void setCsrcRgtDtm(String str) {
            this.csrcRgtDtm = str;
        }

        public void setCsrcRgtYn(String str) {
            this.csrcRgtYn = str;
        }

        public void setDcRgtDtm(String str) {
            this.dcRgtDtm = str;
        }

        public void setDcRgtYn(String str) {
            this.dcRgtYn = str;
        }

        public void setDutyDvs(String str) {
            this.dutyDvs = str;
        }

        public void setInttRgtDtm(String str) {
            this.InttRgtDtm = str;
        }

        public void setInttRgtYn(String str) {
            this.InttRgtYn = str;
        }

        public void setMissStolRgtDtm(String str) {
            this.missStolRgtDtm = str;
        }

        public void setMissStolRgtYn(String str) {
            this.missStolRgtYn = str;
        }

        public void setMlgRgtDtm(String str) {
            this.mlgRgtDtm = str;
        }

        public void setMlgRgtYn(String str) {
            this.mlgRgtYn = str;
        }

        public void setNtknCd(String str) {
            this.ntknCd = str;
        }

        public void setPlCd(String str) {
            this.plCd = str;
        }

        public void setRspCd(String str) {
            this.rspCd = str;
        }

        public void setRspMsg(String str) {
            this.rspMsg = str;
        }

        public void setUsePsbMlg(String str) {
            this.usePsbMlg = str;
        }

        protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.InttRgtDtm) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 209);
                jsonWriter.value(this.InttRgtDtm);
            }
            if (this != this.InttRgtYn) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 205);
                jsonWriter.value(this.InttRgtYn);
            }
            if (this != this.csrcRgtDtm) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 262);
                jsonWriter.value(this.csrcRgtDtm);
            }
            if (this != this.csrcRgtYn) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 546);
                jsonWriter.value(this.csrcRgtYn);
            }
            if (this != this.dcRgtDtm) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 523);
                jsonWriter.value(this.dcRgtDtm);
            }
            if (this != this.dcRgtYn) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 98);
                jsonWriter.value(this.dcRgtYn);
            }
            if (this != this.dutyDvs) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 514);
                jsonWriter.value(this.dutyDvs);
            }
            if (this != this.missStolRgtDtm) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 116);
                jsonWriter.value(this.missStolRgtDtm);
            }
            if (this != this.missStolRgtYn) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 156);
                jsonWriter.value(this.missStolRgtYn);
            }
            if (this != this.mlgRgtDtm) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 212);
                jsonWriter.value(this.mlgRgtDtm);
            }
            if (this != this.mlgRgtYn) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 564);
                jsonWriter.value(this.mlgRgtYn);
            }
            if (this != this.ntknCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 55);
                jsonWriter.value(this.ntknCd);
            }
            if (this != this.plCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 757);
                jsonWriter.value(this.plCd);
            }
            if (this != this.rspCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 482);
                jsonWriter.value(this.rspCd);
            }
            if (this != this.rspMsg) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 785);
                jsonWriter.value(this.rspMsg);
            }
            if (this != this.usePsbMlg) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 845);
                jsonWriter.value(this.usePsbMlg);
            }
        }

        public /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                onNavigationEvent(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, int i) {
            boolean z = jsonReader.peek() != JsonToken.NULL;
            switch (i) {
                case 0:
                    if (!z) {
                        this.dcRgtYn = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.dcRgtYn = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.dcRgtYn = jsonReader.nextString();
                        break;
                    }
                case 83:
                    if (!z) {
                        this.csrcRgtDtm = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.csrcRgtDtm = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.csrcRgtDtm = jsonReader.nextString();
                        break;
                    }
                case 111:
                    if (!z) {
                        this.dutyDvs = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.dutyDvs = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.dutyDvs = jsonReader.nextString();
                        break;
                    }
                case 138:
                    if (!z) {
                        this.dcRgtDtm = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.dcRgtDtm = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.dcRgtDtm = jsonReader.nextString();
                        break;
                    }
                case 181:
                    if (!z) {
                        this.ntknCd = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.ntknCd = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.ntknCd = jsonReader.nextString();
                        break;
                    }
                case 227:
                    if (!z) {
                        this.rspCd = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.rspCd = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.rspCd = jsonReader.nextString();
                        break;
                    }
                case 290:
                    if (!z) {
                        this.mlgRgtYn = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.mlgRgtYn = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.mlgRgtYn = jsonReader.nextString();
                        break;
                    }
                case 351:
                    if (!z) {
                        this.InttRgtYn = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.InttRgtYn = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.InttRgtYn = jsonReader.nextString();
                        break;
                    }
                case 385:
                    if (!z) {
                        this.rspMsg = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.rspMsg = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.rspMsg = jsonReader.nextString();
                        break;
                    }
                case 460:
                    if (!z) {
                        this.csrcRgtYn = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.csrcRgtYn = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.csrcRgtYn = jsonReader.nextString();
                        break;
                    }
                case 499:
                    if (!z) {
                        this.missStolRgtYn = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.missStolRgtYn = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.missStolRgtYn = jsonReader.nextString();
                        break;
                    }
                case 506:
                    if (!z) {
                        this.usePsbMlg = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.usePsbMlg = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.usePsbMlg = jsonReader.nextString();
                        break;
                    }
                case 576:
                    if (!z) {
                        this.mlgRgtDtm = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.mlgRgtDtm = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.mlgRgtDtm = jsonReader.nextString();
                        break;
                    }
                case 619:
                    if (!z) {
                        this.InttRgtDtm = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.InttRgtDtm = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.InttRgtDtm = jsonReader.nextString();
                        break;
                    }
                case 670:
                    if (!z) {
                        this.plCd = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.plCd = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.plCd = jsonReader.nextString();
                        break;
                    }
                case 774:
                    if (!z) {
                        this.missStolRgtDtm = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.missStolRgtDtm = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.missStolRgtDtm = jsonReader.nextString();
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    public Response getResponse() {
        return this.response;
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onNavigationEvent(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    protected /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.response) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 280);
            Response response = this.response;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, Response.class, response).write(jsonWriter, response);
        }
        asInterface(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
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
