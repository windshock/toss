package com.tmoney.dto;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class Response6T {
    public Data data;
    public String msg;
    public String result;

    public class Data {
        public String ERR_MSG;
        public String REPL_CD;
        public String TR_NO;
        public String TYPE;

        public Data() {
        }

        public /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.ERR_MSG) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 656);
                jsonWriter.value(this.ERR_MSG);
            }
            if (this != this.REPL_CD) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 103);
                jsonWriter.value(this.REPL_CD);
            }
            if (this != this.TR_NO) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 76);
                jsonWriter.value(this.TR_NO);
            }
            if (this != this.TYPE) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 653);
                jsonWriter.value(this.TYPE);
            }
        }

        public /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                onExtraCallbackWithResult(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, int i) {
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (i == 70) {
                if (!z) {
                    this.REPL_CD = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.REPL_CD = jsonReader.nextString();
                    return;
                } else {
                    this.REPL_CD = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            }
            if (i == 471) {
                if (!z) {
                    this.TYPE = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.TYPE = jsonReader.nextString();
                    return;
                } else {
                    this.TYPE = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            }
            if (i == 616) {
                if (!z) {
                    this.ERR_MSG = null;
                    jsonReader.nextNull();
                    return;
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.ERR_MSG = jsonReader.nextString();
                    return;
                } else {
                    this.ERR_MSG = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
            }
            if (i != 875) {
                jsonReader.skipValue();
                return;
            }
            if (!z) {
                this.TR_NO = null;
                jsonReader.nextNull();
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.TR_NO = jsonReader.nextString();
            } else {
                this.TR_NO = Boolean.toString(jsonReader.nextBoolean());
            }
        }
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.data) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 697);
            Data data = this.data;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, Data.class, data).write(jsonWriter, data);
        }
        if (this != this.msg) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 763);
            jsonWriter.value(this.msg);
        }
        if (this != this.result) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 158);
            jsonWriter.value(this.result);
        }
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            IAuthTabCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 277) {
            if (!z) {
                this.msg = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.msg = jsonReader.nextString();
                return;
            } else {
                this.msg = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 618) {
            if (z) {
                this.data = (Data) gson.getAdapter(Data.class).read(jsonReader);
                return;
            } else {
                this.data = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i != 657) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.result = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.result = jsonReader.nextString();
        } else {
            this.result = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
