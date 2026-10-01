package com.tmoney.dto;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class CreditCardGroupDto {
    private boolean alliance;

    @SerializedName("cardDescription")
    private String card_description;

    @SerializedName("cardName")
    private String card_name;

    @SerializedName("checkcard")
    private CreditCardInfoDto checkcard;

    @SerializedName("creditcard")
    private CreditCardInfoDto creditcard;

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

    private String getCard_description() {
        return this.card_description;
    }

    private String getCard_name() {
        return this.card_name;
    }

    private String getIs_certify() {
        return this.is_certify;
    }

    private String getIs_cvc() {
        return this.is_cvc;
    }

    private String getIs_fee_usepoint() {
        return this.is_fee_usepoint;
    }

    private String getIs_mvno() {
        return this.is_mvno;
    }

    private String getIs_new() {
        return this.is_new;
    }

    private String getIs_view() {
        return this.is_view;
    }

    private String getLogo_path() {
        return this.logo_path;
    }

    public String getCardDescription() {
        return getCard_description();
    }

    public String getCardName() {
        return getCard_name();
    }

    public CreditCardInfoDto getCheckcard() {
        return this.checkcard;
    }

    public CreditCardInfoDto getCreditcard() {
        return this.creditcard;
    }

    public String getIsNew() {
        return getIs_new();
    }

    public String getLogoPath() {
        return getLogo_path();
    }

    public boolean isAlliance() {
        return this.alliance;
    }

    public boolean isRecommend() {
        String str = this.recommend;
        return str != null && str.equals("Y");
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setAlliance(boolean z) {
        this.alliance = z;
    }

    public void setCard_description(String str) {
        this.card_description = str;
    }

    public void setCard_name(String str) {
        this.card_name = str;
    }

    public void setCheckcard(CreditCardInfoDto creditCardInfoDto) {
        this.checkcard.setName(this.card_name);
        this.checkcard.setIsCredit(false);
        this.checkcard = creditCardInfoDto;
    }

    public void setCreditcard(CreditCardInfoDto creditCardInfoDto) {
        this.creditcard.setName(this.card_name);
        this.creditcard.setIsCredit(true);
        this.creditcard = creditCardInfoDto;
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

    protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 433);
        jsonWriter.value(this.alliance);
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
            CreditCardInfoDto creditCardInfoDto = this.checkcard;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, CreditCardInfoDto.class, creditCardInfoDto).write(jsonWriter, creditCardInfoDto);
        }
        if (this != this.creditcard) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 379);
            CreditCardInfoDto creditCardInfoDto2 = this.creditcard;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, CreditCardInfoDto.class, creditCardInfoDto2).write(jsonWriter, creditCardInfoDto2);
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

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onExtraCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        switch (i) {
            case 63:
                if (!z) {
                    this.card_description = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.card_description = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.card_description = jsonReader.nextString();
                    break;
                }
            case 75:
                if (!z) {
                    this.checkcard = null;
                    jsonReader.nextNull();
                    break;
                } else {
                    this.checkcard = (CreditCardInfoDto) gson.getAdapter(CreditCardInfoDto.class).read(jsonReader);
                    break;
                }
            case 302:
                if (!z) {
                    this.is_new = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.is_new = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.is_new = jsonReader.nextString();
                    break;
                }
            case 408:
                if (!z) {
                    this.creditcard = null;
                    jsonReader.nextNull();
                    break;
                } else {
                    this.creditcard = (CreditCardInfoDto) gson.getAdapter(CreditCardInfoDto.class).read(jsonReader);
                    break;
                }
            case 424:
                if (!z) {
                    jsonReader.nextNull();
                    break;
                } else {
                    this.alliance = ((Boolean) gson.getAdapter(Boolean.class).read(jsonReader)).booleanValue();
                    break;
                }
            case 465:
                if (!z) {
                    this.is_view = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.is_view = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.is_view = jsonReader.nextString();
                    break;
                }
            case 485:
                if (!z) {
                    this.logo_path = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.logo_path = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.logo_path = jsonReader.nextString();
                    break;
                }
            case 496:
                if (!z) {
                    this.is_fee_usepoint = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.is_fee_usepoint = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.is_fee_usepoint = jsonReader.nextString();
                    break;
                }
            case 605:
                if (!z) {
                    this.is_mvno = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.is_mvno = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.is_mvno = jsonReader.nextString();
                    break;
                }
            case 606:
                if (!z) {
                    this.is_cvc = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.is_cvc = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.is_cvc = jsonReader.nextString();
                    break;
                }
            case 674:
                if (!z) {
                    this.recommend = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.recommend = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.recommend = jsonReader.nextString();
                    break;
                }
            case 703:
                if (!z) {
                    this.card_name = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.card_name = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.card_name = jsonReader.nextString();
                    break;
                }
            case 835:
                if (!z) {
                    this.is_certify = null;
                    jsonReader.nextNull();
                    break;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.is_certify = Boolean.toString(jsonReader.nextBoolean());
                    break;
                } else {
                    this.is_certify = jsonReader.nextString();
                    break;
                }
            default:
                jsonReader.skipValue();
                break;
        }
    }
}
