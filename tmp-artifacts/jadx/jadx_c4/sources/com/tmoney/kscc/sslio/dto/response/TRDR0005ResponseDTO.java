package com.tmoney.kscc.sslio.dto.response;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import o.AutoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda4;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class TRDR0005ResponseDTO extends ResponseDTO {
    private Response response;

    public class Response {
        private String nowCnt;
        private String rspCd;
        public ArrayList<ResultTRDR0005RowDTO> rspDta;
        private String rspMsg;
        private String totCnt;

        public Response() {
        }

        public String getNowCnt() {
            return this.nowCnt;
        }

        public String getRspCd() {
            return this.rspCd;
        }

        public ArrayList<ResultTRDR0005RowDTO> getRspDta() {
            return this.rspDta;
        }

        public String getRspMsg() {
            return this.rspMsg;
        }

        public String getTotCnt() {
            return this.totCnt;
        }

        public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onNavigationEvent(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        public void setNowCnt(String str) {
            this.nowCnt = str;
        }

        public void setRspCd(String str) {
            this.rspCd = str;
        }

        public void setRspDta(ArrayList<ResultTRDR0005RowDTO> arrayList) {
            this.rspDta = arrayList;
        }

        public void setRspMsg(String str) {
            this.rspMsg = str;
        }

        public void setTotCnt(String str) {
            this.totCnt = str;
        }

        protected /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.nowCnt) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 342);
                jsonWriter.value(this.nowCnt);
            }
            if (this != this.rspCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 482);
                jsonWriter.value(this.rspCd);
            }
            if (this != this.rspDta) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 705);
                AutoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda4 autoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda4 = new AutoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda4();
                ArrayList<ResultTRDR0005RowDTO> arrayList = this.rspDta;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, autoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda4, arrayList).write(jsonWriter, arrayList);
            }
            if (this != this.rspMsg) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 785);
                jsonWriter.value(this.rspMsg);
            }
            if (this != this.totCnt) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 249);
                jsonWriter.value(this.totCnt);
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
            if (i == 171) {
                if (!z) {
                    this.totCnt = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.totCnt = jsonReader.nextString();
                    return;
                } else {
                    this.totCnt = Boolean.toString(jsonReader.nextBoolean());
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
            if (i == 289) {
                if (z) {
                    this.rspDta = (ArrayList) gson.getAdapter(new AutoClosingRoomOpenHelperAutoClosingSupportSQLiteStatementExternalSyntheticLambda4()).read(jsonReader);
                    return;
                } else {
                    this.rspDta = null;
                    jsonReader.nextNull();
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
            if (i != 777) {
                jsonReader.skipValue();
                return;
            }
            if (!z) {
                this.nowCnt = null;
                jsonReader.nextNull();
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.nowCnt = jsonReader.nextString();
            } else {
                this.nowCnt = Boolean.toString(jsonReader.nextBoolean());
            }
        }
    }

    public Response getResponse() {
        return this.response;
    }

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
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
