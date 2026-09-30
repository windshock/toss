package com.tmoney.kscc.sslio.dto.response;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;
import o.LocalSavedStateRegistryOwnerKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class TRDR0013ResponseDTO extends ResponseDTO {
    private Response response;

    public class Response {
        public ArrayList<ResultTRDR0013RowDTO> afltDta;
        private String rspCd;
        private String rspMsg;

        public Response() {
        }

        public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        public String getRspCd() {
            return this.rspCd;
        }

        public ArrayList<ResultTRDR0013RowDTO> getRspDta() {
            return this.afltDta;
        }

        public String getRspMsg() {
            return this.rspMsg;
        }

        public void setRspCd(String str) {
            this.rspCd = str;
        }

        public void setRspDta(ArrayList<ResultTRDR0013RowDTO> arrayList) {
            this.afltDta = arrayList;
        }

        public void setRspMsg(String str) {
            this.rspMsg = str;
        }

        protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.afltDta) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 41);
                LocalSavedStateRegistryOwnerKtExternalSyntheticLambda0 localSavedStateRegistryOwnerKtExternalSyntheticLambda0 = new LocalSavedStateRegistryOwnerKtExternalSyntheticLambda0();
                ArrayList<ResultTRDR0013RowDTO> arrayList = this.afltDta;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, localSavedStateRegistryOwnerKtExternalSyntheticLambda0, arrayList).write(jsonWriter, arrayList);
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
                onWarmupCompleted(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, int i) {
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (i == 137) {
                if (z) {
                    this.afltDta = (ArrayList) gson.getAdapter(new LocalSavedStateRegistryOwnerKtExternalSyntheticLambda0()).read(jsonReader);
                    return;
                } else {
                    this.afltDta = null;
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
                jsonReader.skipValue();
                return;
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

    public Response getResponse() {
        return this.response;
    }

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
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
