package com.tmoney.kscc.sslio.dto.response;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class ResultTRDR0012AllianceRowDTO {

    @SerializedName("cardDescription")
    private String card_description;

    @SerializedName("cardName")
    private String card_name;

    @SerializedName("checkcard")
    private ResultTRDR0012CardRowDTO checkcard;

    @SerializedName("creditcard")
    private ResultTRDR0012CardRowDTO creditcard;

    @SerializedName("isCertify")
    private String is_certify;

    @SerializedName("isCvc")
    private String is_cvc;

    @SerializedName("isFeeUsepoint")
    private String is_fee_usepoint;

    @SerializedName("isMvno")
    private String is_mvno;

    @SerializedName("isNew")
    private String is_new;

    @SerializedName("isView")
    private String is_view;

    @SerializedName("logoPath")
    private String logo_path;

    @SerializedName("recommmend")
    private String recommend;

    public String getCard_description() {
        return this.card_description;
    }

    public String getCard_name() {
        return this.card_name;
    }

    public ResultTRDR0012CardRowDTO getCheckcard() {
        return this.checkcard;
    }

    public ResultTRDR0012CardRowDTO getCreditcard() {
        return this.creditcard;
    }

    public String getIs_certify() {
        return this.is_certify;
    }

    public String getIs_cvc() {
        return this.is_cvc;
    }

    public String getIs_fee_usepoint() {
        return this.is_fee_usepoint;
    }

    public String getIs_mvno() {
        return this.is_mvno;
    }

    public String getIs_new() {
        return this.is_new;
    }

    public String getIs_view() {
        return this.is_view;
    }

    public String getLogo_path() {
        return this.logo_path;
    }

    public String getRecommend() {
        return this.recommend;
    }

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onNavigationEvent(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setCard_description(String str) {
        this.card_description = str;
    }

    public void setCard_name(String str) {
        this.card_name = str;
    }

    public void setCheckcard(ResultTRDR0012CardRowDTO resultTRDR0012CardRowDTO) {
        this.checkcard = resultTRDR0012CardRowDTO;
    }

    void setCreditcard(ResultTRDR0012CardRowDTO resultTRDR0012CardRowDTO) {
        this.creditcard = resultTRDR0012CardRowDTO;
    }

    public void setIs_certify(String str) {
        this.is_certify = str;
    }

    public void setIs_cvc(String str) {
        this.is_cvc = str;
    }

    public void setIs_fee_usepoint(String str) {
        this.is_fee_usepoint = str;
    }

    public void setIs_mvno(String str) {
        this.is_mvno = str;
    }

    public void setIs_new(String str) {
        this.is_new = str;
    }

    public void setIs_view(String str) {
        this.is_view = str;
    }

    public void setLogo_path(String str) {
        this.logo_path = str;
    }

    public void setRecommend(String str) {
        this.recommend = str;
    }

    protected /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.card_description) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 132);
            jsonWriter.value(this.card_description);
        }
        if (this != this.card_name) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 254);
            jsonWriter.value(this.card_name);
        }
        if (this != this.checkcard) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 608);
            ResultTRDR0012CardRowDTO resultTRDR0012CardRowDTO = this.checkcard;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, ResultTRDR0012CardRowDTO.class, resultTRDR0012CardRowDTO).write(jsonWriter, resultTRDR0012CardRowDTO);
        }
        if (this != this.creditcard) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 379);
            ResultTRDR0012CardRowDTO resultTRDR0012CardRowDTO2 = this.creditcard;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, ResultTRDR0012CardRowDTO.class, resultTRDR0012CardRowDTO2).write(jsonWriter, resultTRDR0012CardRowDTO2);
        }
        if (this != this.is_certify) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 104);
            jsonWriter.value(this.is_certify);
        }
        if (this != this.is_cvc) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 612);
            jsonWriter.value(this.is_cvc);
        }
        if (this != this.is_fee_usepoint) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 585);
            jsonWriter.value(this.is_fee_usepoint);
        }
        if (this != this.is_mvno) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 236);
            jsonWriter.value(this.is_mvno);
        }
        if (this != this.is_new) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 770);
            jsonWriter.value(this.is_new);
        }
        if (this != this.is_view) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 855);
            jsonWriter.value(this.is_view);
        }
        if (this != this.logo_path) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 577);
            jsonWriter.value(this.logo_path);
        }
        if (this != this.recommend) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 150);
            jsonWriter.value(this.recommend);
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
        if (i == 63) {
            if (!z) {
                this.card_description = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.card_description = jsonReader.nextString();
                return;
            } else {
                this.card_description = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 75) {
            if (z) {
                this.checkcard = (ResultTRDR0012CardRowDTO) gson.getAdapter(ResultTRDR0012CardRowDTO.class).read(jsonReader);
                return;
            } else {
                this.checkcard = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 302) {
            if (!z) {
                this.is_new = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.is_new = jsonReader.nextString();
                return;
            } else {
                this.is_new = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 408) {
            if (z) {
                this.creditcard = (ResultTRDR0012CardRowDTO) gson.getAdapter(ResultTRDR0012CardRowDTO.class).read(jsonReader);
                return;
            } else {
                this.creditcard = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 465) {
            if (!z) {
                this.is_view = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.is_view = jsonReader.nextString();
                return;
            } else {
                this.is_view = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 485) {
            if (!z) {
                this.logo_path = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.logo_path = jsonReader.nextString();
                return;
            } else {
                this.logo_path = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 496) {
            if (!z) {
                this.is_fee_usepoint = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.is_fee_usepoint = jsonReader.nextString();
                return;
            } else {
                this.is_fee_usepoint = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 674) {
            if (!z) {
                this.recommend = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.recommend = jsonReader.nextString();
                return;
            } else {
                this.recommend = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 703) {
            if (!z) {
                this.card_name = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.card_name = jsonReader.nextString();
                return;
            } else {
                this.card_name = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 835) {
            if (!z) {
                this.is_certify = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.is_certify = jsonReader.nextString();
                return;
            } else {
                this.is_certify = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 605) {
            if (!z) {
                this.is_mvno = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.is_mvno = jsonReader.nextString();
                return;
            } else {
                this.is_mvno = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 606) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.is_cvc = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.is_cvc = jsonReader.nextString();
        } else {
            this.is_cvc = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
