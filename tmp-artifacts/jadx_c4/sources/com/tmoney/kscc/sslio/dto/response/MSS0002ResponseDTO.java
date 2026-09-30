package com.tmoney.kscc.sslio.dto.response;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class MSS0002ResponseDTO extends ResponseDTO {
    private Response response;

    public class Response {
        private String missTrdNo;
        private String rspCd;
        private String rspMsg;
        private String unLoadApdu;

        public Response() {
        }

        public String getMissTrdNo() {
            return this.missTrdNo;
        }

        public String getRspCd() {
            return this.rspCd;
        }

        public String getRspMsg() {
            return this.rspMsg;
        }

        public String getUnLoadApdu() {
            return this.unLoadApdu;
        }

        public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        public void setMissTrdNo(String str) {
            this.missTrdNo = str;
        }

        public void setRspCd(String str) {
            this.rspCd = str;
        }

        public void setRspMsg(String str) {
            this.rspMsg = str;
        }

        public void setUnLoadApdu(String str) {
            this.unLoadApdu = str;
        }

        protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.missTrdNo) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 561);
                jsonWriter.value(this.missTrdNo);
            }
            if (this != this.rspCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 482);
                jsonWriter.value(this.rspCd);
            }
            if (this != this.rspMsg) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 785);
                jsonWriter.value(this.rspMsg);
            }
            if (this != this.unLoadApdu) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 630);
                jsonWriter.value(this.unLoadApdu);
            }
        }

        public /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
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
            if (i == 295) {
                if (!z) {
                    this.missTrdNo = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.missTrdNo = jsonReader.nextString();
                    return;
                } else {
                    this.missTrdNo = Boolean.toString(jsonReader.nextBoolean());
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
            if (i != 598) {
                jsonReader.skipValue();
                return;
            }
            if (!z) {
                this.unLoadApdu = null;
                jsonReader.nextNull();
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.unLoadApdu = jsonReader.nextString();
            } else {
                this.unLoadApdu = Boolean.toString(jsonReader.nextBoolean());
            }
        }
    }

    public Response getResponse() {
        return this.response;
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.response) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 280);
            Response response = this.response;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, Response.class, response).write(jsonWriter, response);
        }
        asInterface(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
    }

    public /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
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
