package com.tmoney.kscc.sslio.dto.response;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class GIFT0001ResponseDTO extends ResponseDTO {
    private Response response;

    public class Response {
        private String giftTrdNo;
        private String purApdu;
        private String rspCd;
        private String rspMsg;

        public Response() {
        }

        public String getGiftTrdNo() {
            return this.giftTrdNo;
        }

        public String getPurApdu() {
            return this.purApdu;
        }

        public String getRspCd() {
            return this.rspCd;
        }

        public String getRspMsg() {
            return this.rspMsg;
        }

        public /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onNavigationEvent(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        public void setGiftTrdNo(String str) {
            this.giftTrdNo = str;
        }

        public void setPurApdu(String str) {
            this.purApdu = str;
        }

        public void setRspCd(String str) {
            this.rspCd = str;
        }

        public void setRspMsg(String str) {
            this.rspMsg = str;
        }

        protected /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.giftTrdNo) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 867);
                jsonWriter.value(this.giftTrdNo);
            }
            if (this != this.purApdu) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 163);
                jsonWriter.value(this.purApdu);
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

        public /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                onNavigationEvent(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, int i) {
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (i == 213) {
                if (!z) {
                    this.giftTrdNo = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.giftTrdNo = jsonReader.nextString();
                    return;
                } else {
                    this.giftTrdNo = Boolean.toString(jsonReader.nextBoolean());
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
            if (i != 665) {
                jsonReader.skipValue();
                return;
            }
            if (!z) {
                this.purApdu = null;
                jsonReader.nextNull();
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.purApdu = jsonReader.nextString();
            } else {
                this.purApdu = Boolean.toString(jsonReader.nextBoolean());
            }
        }
    }

    public Response getResponse() {
        return this.response;
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
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
            onExtraCallbackWithResult(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, int i) {
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
