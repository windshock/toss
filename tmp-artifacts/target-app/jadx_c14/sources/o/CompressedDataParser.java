package o;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CompressedDataParser implements UST_CERT_VerifyEnvelopeVID {
    public static final int $stable = 8;

    @SerializedName("cardCode")
    private int cardCode;

    @SerializedName("userId")
    private String userId;

    @SerializedName("userPw")
    private String userPw;

    public CompressedDataParser() {
        this(0, null, null, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompressedDataParser)) {
            return false;
        }
        CompressedDataParser compressedDataParser = (CompressedDataParser) obj;
        return this.cardCode == compressedDataParser.cardCode && Intrinsics.areEqual(this.userId, compressedDataParser.userId) && Intrinsics.areEqual(this.userPw, compressedDataParser.userPw);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.cardCode) * 31) + this.userId.hashCode()) * 31) + this.userPw.hashCode();
    }

    public CompressedDataParser(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.cardCode = i;
        this.userId = str;
        this.userPw = str2;
    }

    public /* synthetic */ CompressedDataParser(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }

    @Override // o.UST_CERT_VerifyEnvelopeVID
    public UST_CMP_Issue_Close onWarmupCompleted() {
        return UST_CMP_Issue_Close.IDPW;
    }

    @Override // o.UST_CERT_VerifyEnvelopeVID
    public UST_CMP_IssueCertificate_SendConf IAuthTabCallbackDefault() {
        return UST_CMP_IssueCertificate_SendConf.CARD;
    }

    @Override // o.UST_CERT_VerifyEnvelopeVID
    public int onExtraCallback() {
        return this.cardCode;
    }

    public String toString() {
        return "CardIdLogin(" + this.cardCode + ")";
    }

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 878);
        jsonWriter.value(Integer.valueOf(this.cardCode));
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 538);
        jsonWriter.value(this.userId);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 408);
        jsonWriter.value(this.userPw);
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) throws JsonSyntaxException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onNavigationEvent(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.gson.JsonSyntaxException */
    protected /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, int i) throws JsonSyntaxException {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 218) {
            if (!z) {
                this.userPw = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.userPw = jsonReader.nextString();
                return;
            } else {
                this.userPw = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 710) {
            if (!z) {
                jsonReader.nextNull();
                return;
            }
            try {
                this.cardCode = jsonReader.nextInt();
                return;
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }
        if (i != 753) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.userId = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.userId = jsonReader.nextString();
        } else {
            this.userId = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
