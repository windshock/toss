package com.tmoney.kscc.sslio.dto.response;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class SIN0001ResponseDTO extends ResponseDTO {
    private Response response;

    public class Response {
        private String dpyActCd;
        private String rspCd;
        private String rspMsg;
        private String ucfmYn;
        private String usrUseLtnCd;

        public Response() {
        }

        public String getDpyActCd() {
            return this.dpyActCd;
        }

        public String getRspCd() {
            return this.rspCd;
        }

        public String getRspMsg() {
            return this.rspMsg;
        }

        public String getUcfmYn() {
            return this.ucfmYn;
        }

        public String getUsrUseLtnCd() {
            return this.usrUseLtnCd;
        }

        public /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onNavigationEvent(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        public void setDpyActCd(String str) {
            this.dpyActCd = str;
        }

        public void setRspCd(String str) {
            this.rspCd = str;
        }

        public void setRspMsg(String str) {
            this.rspMsg = str;
        }

        public void setUcfmYn(String str) {
            this.ucfmYn = str;
        }

        public void setUsrUseLtnCd(String str) {
            this.usrUseLtnCd = str;
        }

        protected /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.dpyActCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 340);
                jsonWriter.value(this.dpyActCd);
            }
            if (this != this.rspCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 482);
                jsonWriter.value(this.rspCd);
            }
            if (this != this.rspMsg) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 785);
                jsonWriter.value(this.rspMsg);
            }
            if (this != this.ucfmYn) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 450);
                jsonWriter.value(this.ucfmYn);
            }
            if (this != this.usrUseLtnCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 73);
                jsonWriter.value(this.usrUseLtnCd);
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
            if (i == 385) {
                if (!z) {
                    this.rspMsg = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.rspMsg = jsonReader.nextString();
                    return;
                } else {
                    this.rspMsg = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            }
            if (i == 388) {
                if (!z) {
                    this.dpyActCd = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.dpyActCd = jsonReader.nextString();
                    return;
                } else {
                    this.dpyActCd = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            }
            if (i == 404) {
                if (!z) {
                    this.usrUseLtnCd = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.usrUseLtnCd = jsonReader.nextString();
                    return;
                } else {
                    this.usrUseLtnCd = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            }
            if (i != 666) {
                jsonReader.skipValue();
                return;
            }
            if (!z) {
                this.ucfmYn = null;
                jsonReader.nextNull();
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.ucfmYn = jsonReader.nextString();
            } else {
                this.ucfmYn = Boolean.toString(jsonReader.nextBoolean());
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
            onExtraCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, int i) {
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
