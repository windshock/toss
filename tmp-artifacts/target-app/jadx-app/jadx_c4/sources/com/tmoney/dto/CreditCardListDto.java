package com.tmoney.dto;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.List;
import o.BaseRoomConnectionManagerDriverWrapperExternalSyntheticLambda0;
import o.CoroutinesRoomCompanionExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;
import o.EntityDeletionOrUpdateAdapter;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class CreditCardListDto {
    private Response response;

    public class Response {

        @SerializedName("alliance")
        public List<CreditCardGroupDto> alliance;

        @SerializedName("dpcgAlliance")
        public List<CreditCardGroupDto> dpcg_Alliance;

        @SerializedName("nonAlliance")
        public List<CreditCardGroupDto> non_alliance;

        public Response() {
        }

        public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        public List<CreditCardGroupDto> getAlliance() {
            return this.alliance;
        }

        public List<CreditCardGroupDto> getDpcg_alliance() {
            return this.dpcg_Alliance;
        }

        public List<CreditCardGroupDto> getNon_alliance() {
            return this.non_alliance;
        }

        public void setAlliance(List<CreditCardGroupDto> list) {
            this.alliance = list;
        }

        public void setDpcg_alliance(List<CreditCardGroupDto> list) {
            this.dpcg_Alliance = list;
        }

        public void setNon_alliance(List<CreditCardGroupDto> list) {
            this.non_alliance = list;
        }

        protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.alliance) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 433);
                CoroutinesRoomCompanionExternalSyntheticLambda0 coroutinesRoomCompanionExternalSyntheticLambda0 = new CoroutinesRoomCompanionExternalSyntheticLambda0();
                List<CreditCardGroupDto> list = this.alliance;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, coroutinesRoomCompanionExternalSyntheticLambda0, list).write(jsonWriter, list);
            }
            if (this != this.dpcg_Alliance) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 537);
                EntityDeletionOrUpdateAdapter entityDeletionOrUpdateAdapter = new EntityDeletionOrUpdateAdapter();
                List<CreditCardGroupDto> list2 = this.dpcg_Alliance;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, entityDeletionOrUpdateAdapter, list2).write(jsonWriter, list2);
            }
            if (this != this.non_alliance) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 281);
                BaseRoomConnectionManagerDriverWrapperExternalSyntheticLambda0 baseRoomConnectionManagerDriverWrapperExternalSyntheticLambda0 = new BaseRoomConnectionManagerDriverWrapperExternalSyntheticLambda0();
                List<CreditCardGroupDto> list3 = this.non_alliance;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, baseRoomConnectionManagerDriverWrapperExternalSyntheticLambda0, list3).write(jsonWriter, list3);
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
            if (i == 160) {
                if (z) {
                    this.dpcg_Alliance = (List) gson.getAdapter(new EntityDeletionOrUpdateAdapter()).read(jsonReader);
                    return;
                } else {
                    this.dpcg_Alliance = null;
                    jsonReader.nextNull();
                    return;
                }
            }
            if (i == 424) {
                if (z) {
                    this.alliance = (List) gson.getAdapter(new CoroutinesRoomCompanionExternalSyntheticLambda0()).read(jsonReader);
                    return;
                } else {
                    this.alliance = null;
                    jsonReader.nextNull();
                    return;
                }
            }
            if (i != 627) {
                jsonReader.skipValue();
            } else if (z) {
                this.non_alliance = (List) gson.getAdapter(new BaseRoomConnectionManagerDriverWrapperExternalSyntheticLambda0()).read(jsonReader);
            } else {
                this.non_alliance = null;
                jsonReader.nextNull();
            }
        }
    }

    public List<CreditCardGroupDto> getAllianceCardList() {
        return this.response.alliance;
    }

    public List<CreditCardGroupDto> getDpcgAllianceCardList() {
        return this.response.dpcg_Alliance;
    }

    public List<CreditCardGroupDto> getNonAllianceCardList() {
        return this.response.non_alliance;
    }

    public int getTotalCount() {
        return this.response.getAlliance().size() + this.response.getNon_alliance().size() + this.response.getDpcg_alliance().size();
    }

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.response) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 280);
            Response response = this.response;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, Response.class, response).write(jsonWriter, response);
        }
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
            jsonReader.skipValue();
        } else if (z) {
            this.response = (Response) gson.getAdapter(Response.class).read(jsonReader);
        } else {
            this.response = null;
            jsonReader.nextNull();
        }
    }
}
