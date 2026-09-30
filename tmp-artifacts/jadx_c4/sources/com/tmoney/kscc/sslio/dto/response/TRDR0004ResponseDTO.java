package com.tmoney.kscc.sslio.dto.response;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import o.AutoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda5;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class TRDR0004ResponseDTO extends ResponseDTO {
    private Response response;

    public class Response {
        private String rspCd;
        public ArrayList<ResultTRDR0004RowDTO> rspDta;
        private String rspMsg;

        public Response() {
        }

        public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        public String getRspCd() {
            return this.rspCd;
        }

        public ArrayList<ResultTRDR0004RowDTO> getRspDta() {
            return this.rspDta;
        }

        public String getRspMsg() {
            return this.rspMsg;
        }

        public void setRspCd(String str) {
            this.rspCd = str;
        }

        public void setRspDta(ArrayList<ResultTRDR0004RowDTO> arrayList) {
            this.rspDta = arrayList;
        }

        public void setRspMsg(String str) {
            this.rspMsg = str;
        }

        protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.rspCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 482);
                jsonWriter.value(this.rspCd);
            }
            if (this != this.rspDta) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 705);
                AutoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda5 autoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda5 = new AutoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda5();
                ArrayList<ResultTRDR0004RowDTO> arrayList = this.rspDta;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, autoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda5, arrayList).write(jsonWriter, arrayList);
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
            if (i == 289) {
                if (z) {
                    this.rspDta = (ArrayList) gson.getAdapter(new AutoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda5()).read(jsonReader);
                    return;
                } else {
                    this.rspDta = null;
                    jsonReader.nextNull();
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

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onNavigationEvent(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public Response getResponse() {
        return this.response;
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

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onNavigationEvent(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, int i) {
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
