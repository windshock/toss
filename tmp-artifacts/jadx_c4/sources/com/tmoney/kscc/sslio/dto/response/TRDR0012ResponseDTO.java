package com.tmoney.kscc.sslio.dto.response;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import java.util.Iterator;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;
import o.Recreator;
import o.RecreatorCompanion;
import o.RecreatorSavedStateProvider;
import o.RelationUtil;
import o.RelationUtil__RelationUtilKt;
import o.RelationUtil__RelationUtil_androidKt;
import o.SavedStateRegistryControllerCompanionExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class TRDR0012ResponseDTO extends ResponseDTO {
    private Response response;

    public class Response {

        @SerializedName("alliance")
        public ArrayList<ResultTRDR0012AllianceRowDTO> alliance;

        @SerializedName("dpcgNonRecommender")
        public ArrayList<ResultTRDR0012AllianceRowDTO> dpcgNonRecommender;

        @SerializedName("dpcgRecommender")
        public ArrayList<ResultTRDR0012AllianceRowDTO> dpcgRecommender;

        @SerializedName("dpcgAlliance")
        public ArrayList<ResultTRDR0012AllianceRowDTO> dpcg_Alliance;

        @SerializedName("nonAlliance")
        public ArrayList<ResultTRDR0012AllianceRowDTO> non_alliance;

        @SerializedName("prcgNonRecommender")
        public ArrayList<ResultTRDR0012AllianceRowDTO> prcgNonRecommender;

        @SerializedName("prcgRecommender")
        public ArrayList<ResultTRDR0012AllianceRowDTO> prcgRecommender;
        private String rspCd;
        private String rspMsg;

        public Response() {
        }

        public ArrayList<ResultTRDR0012AllianceRowDTO> getAlliance() {
            return this.alliance;
        }

        public ArrayList<ResultTRDR0012AllianceRowDTO> getDpcg_Alliance() {
            return this.dpcg_Alliance;
        }

        public ArrayList<ResultTRDR0012AllianceRowDTO> getNon_alliance() {
            return this.non_alliance;
        }

        public String getRspCd() {
            return this.rspCd;
        }

        public String getRspMsg() {
            return this.rspMsg;
        }

        public void normalize() {
            ArrayList<ResultTRDR0012AllianceRowDTO> arrayList = this.prcgRecommender;
            if (arrayList != null && arrayList.size() > 0) {
                if (this.alliance == null) {
                    this.alliance = new ArrayList<>();
                }
                Iterator<ResultTRDR0012AllianceRowDTO> it = this.prcgRecommender.iterator();
                while (it.hasNext()) {
                    ResultTRDR0012AllianceRowDTO next = it.next();
                    next.setRecommend("Y");
                    this.alliance.add(next);
                }
            }
            ArrayList<ResultTRDR0012AllianceRowDTO> arrayList2 = this.prcgNonRecommender;
            if (arrayList2 != null && arrayList2.size() > 0) {
                if (this.alliance == null) {
                    this.alliance = new ArrayList<>();
                }
                Iterator<ResultTRDR0012AllianceRowDTO> it2 = this.prcgNonRecommender.iterator();
                while (it2.hasNext()) {
                    ResultTRDR0012AllianceRowDTO next2 = it2.next();
                    next2.setRecommend("N");
                    this.alliance.add(next2);
                }
            }
            ArrayList<ResultTRDR0012AllianceRowDTO> arrayList3 = this.dpcgRecommender;
            if (arrayList3 != null && arrayList3.size() > 0) {
                if (this.dpcg_Alliance == null) {
                    this.dpcg_Alliance = new ArrayList<>();
                }
                Iterator<ResultTRDR0012AllianceRowDTO> it3 = this.dpcgRecommender.iterator();
                while (it3.hasNext()) {
                    ResultTRDR0012AllianceRowDTO next3 = it3.next();
                    next3.setRecommend("Y");
                    this.dpcg_Alliance.add(next3);
                }
            }
            ArrayList<ResultTRDR0012AllianceRowDTO> arrayList4 = this.dpcgNonRecommender;
            if (arrayList4 == null || arrayList4.size() <= 0) {
                return;
            }
            if (this.dpcg_Alliance == null) {
                this.dpcg_Alliance = new ArrayList<>();
            }
            Iterator<ResultTRDR0012AllianceRowDTO> it4 = this.dpcgNonRecommender.iterator();
            while (it4.hasNext()) {
                ResultTRDR0012AllianceRowDTO next4 = it4.next();
                next4.setRecommend("N");
                this.dpcg_Alliance.add(next4);
            }
        }

        public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        public void setAlliance(ArrayList<ResultTRDR0012AllianceRowDTO> arrayList) {
            this.alliance = arrayList;
        }

        public void setDpcg_Alliance(ArrayList<ResultTRDR0012AllianceRowDTO> arrayList) {
            this.dpcg_Alliance = arrayList;
        }

        public void setNon_alliance(ArrayList<ResultTRDR0012AllianceRowDTO> arrayList) {
            this.non_alliance = arrayList;
        }

        public void setRspCd(String str) {
            this.rspCd = str;
        }

        public void setRspMsg(String str) {
            this.rspMsg = str;
        }

        protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.alliance) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 433);
                RelationUtil relationUtil = new RelationUtil();
                ArrayList<ResultTRDR0012AllianceRowDTO> arrayList = this.alliance;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, relationUtil, arrayList).write(jsonWriter, arrayList);
            }
            if (this != this.dpcgNonRecommender) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 501);
                RelationUtil__RelationUtilKt relationUtil__RelationUtilKt = new RelationUtil__RelationUtilKt();
                ArrayList<ResultTRDR0012AllianceRowDTO> arrayList2 = this.dpcgNonRecommender;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, relationUtil__RelationUtilKt, arrayList2).write(jsonWriter, arrayList2);
            }
            if (this != this.dpcgRecommender) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 326);
                SavedStateRegistryControllerCompanionExternalSyntheticLambda0 savedStateRegistryControllerCompanionExternalSyntheticLambda0 = new SavedStateRegistryControllerCompanionExternalSyntheticLambda0();
                ArrayList<ResultTRDR0012AllianceRowDTO> arrayList3 = this.dpcgRecommender;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, savedStateRegistryControllerCompanionExternalSyntheticLambda0, arrayList3).write(jsonWriter, arrayList3);
            }
            if (this != this.dpcg_Alliance) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 537);
                RecreatorSavedStateProvider recreatorSavedStateProvider = new RecreatorSavedStateProvider();
                ArrayList<ResultTRDR0012AllianceRowDTO> arrayList4 = this.dpcg_Alliance;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, recreatorSavedStateProvider, arrayList4).write(jsonWriter, arrayList4);
            }
            if (this != this.non_alliance) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 281);
                RecreatorCompanion recreatorCompanion = new RecreatorCompanion();
                ArrayList<ResultTRDR0012AllianceRowDTO> arrayList5 = this.non_alliance;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, recreatorCompanion, arrayList5).write(jsonWriter, arrayList5);
            }
            if (this != this.prcgNonRecommender) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 658);
                Recreator recreator = new Recreator();
                ArrayList<ResultTRDR0012AllianceRowDTO> arrayList6 = this.prcgNonRecommender;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, recreator, arrayList6).write(jsonWriter, arrayList6);
            }
            if (this != this.prcgRecommender) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 539);
                RelationUtil__RelationUtil_androidKt relationUtil__RelationUtil_androidKt = new RelationUtil__RelationUtil_androidKt();
                ArrayList<ResultTRDR0012AllianceRowDTO> arrayList7 = this.prcgRecommender;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, relationUtil__RelationUtil_androidKt, arrayList7).write(jsonWriter, arrayList7);
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

        public /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                onExtraCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, int i) {
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (i == 160) {
                if (z) {
                    this.dpcg_Alliance = (ArrayList) gson.getAdapter(new RecreatorSavedStateProvider()).read(jsonReader);
                    return;
                } else {
                    this.dpcg_Alliance = null;
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
            if (i == 280) {
                if (z) {
                    this.dpcgNonRecommender = (ArrayList) gson.getAdapter(new RelationUtil__RelationUtilKt()).read(jsonReader);
                    return;
                } else {
                    this.dpcgNonRecommender = null;
                    jsonReader.nextNull();
                    return;
                }
            }
            if (i == 357) {
                if (z) {
                    this.dpcgRecommender = (ArrayList) gson.getAdapter(new SavedStateRegistryControllerCompanionExternalSyntheticLambda0()).read(jsonReader);
                    return;
                } else {
                    this.dpcgRecommender = null;
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
            if (i == 424) {
                if (z) {
                    this.alliance = (ArrayList) gson.getAdapter(new RelationUtil()).read(jsonReader);
                    return;
                } else {
                    this.alliance = null;
                    jsonReader.nextNull();
                    return;
                }
            }
            if (i == 473) {
                if (z) {
                    this.prcgNonRecommender = (ArrayList) gson.getAdapter(new Recreator()).read(jsonReader);
                    return;
                } else {
                    this.prcgNonRecommender = null;
                    jsonReader.nextNull();
                    return;
                }
            }
            if (i == 556) {
                if (z) {
                    this.prcgRecommender = (ArrayList) gson.getAdapter(new RelationUtil__RelationUtil_androidKt()).read(jsonReader);
                    return;
                } else {
                    this.prcgRecommender = null;
                    jsonReader.nextNull();
                    return;
                }
            }
            if (i != 627) {
                jsonReader.skipValue();
            } else if (z) {
                this.non_alliance = (ArrayList) gson.getAdapter(new RecreatorCompanion()).read(jsonReader);
            } else {
                this.non_alliance = null;
                jsonReader.nextNull();
            }
        }
    }

    public Response getResponse() {
        return this.response;
    }

    public void normalize() {
        Response response = this.response;
        if (response == null) {
            return;
        }
        response.normalize();
    }

    public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
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
            onWarmupCompleted(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, int i) {
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
