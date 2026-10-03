package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class hasCatalystInstance implements Parcelable {
    public static final Parcelable.Creator<hasCatalystInstance> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;

    @SerializedName("authType")
    private List<String> authType;

    @SerializedName("data")
    private String data;

    @SerializedName("did")
    private String did;

    @SerializedName("encryptType")
    private int encryptType;

    @SerializedName("keyType")
    private int keyType;

    @SerializedName("nonce")
    private String nonce;

    @SerializedName("presentType")
    private int presentType;

    @SerializedName("timezone")
    private String timezone;

    @SerializedName("type")
    private String type;

    @SerializedName("zkpNonce")
    private String zkpNonce;

    public static final class onWarmupCompleted implements Parcelable.Creator<hasCatalystInstance> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ hasCatalystInstance createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            hasCatalystInstance hascatalystinstanceOnWarmupCompleted = onWarmupCompleted(parcel);
            int i4 = onNavigationEvent + 15;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return hascatalystinstanceOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ hasCatalystInstance[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 85;
            onNavigationEvent = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                onNavigationEvent(i);
                throw null;
            }
            hasCatalystInstance[] hascatalystinstanceArrOnNavigationEvent = onNavigationEvent(i);
            int i4 = onNavigationEvent + 79;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return hascatalystinstanceArrOnNavigationEvent;
            }
            obj.hashCode();
            throw null;
        }

        public final hasCatalystInstance[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 27;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            hasCatalystInstance[] hascatalystinstanceArr = new hasCatalystInstance[i];
            int i6 = i3 + 35;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return hascatalystinstanceArr;
        }

        public final hasCatalystInstance onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            hasCatalystInstance hascatalystinstance = new hasCatalystInstance(parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = onNavigationEvent + 7;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return hascatalystinstance;
            }
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 33;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof hasCatalystInstance)) {
            return false;
        }
        hasCatalystInstance hascatalystinstance = (hasCatalystInstance) obj;
        if (!Intrinsics.areEqual(this.authType, hascatalystinstance.authType)) {
            int i4 = onExtraCallbackWithResult + 43;
            onExtraCallback = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.data, hascatalystinstance.data) || !Intrinsics.areEqual(this.did, hascatalystinstance.did)) {
            return false;
        }
        if (this.encryptType != hascatalystinstance.encryptType) {
            int i5 = onExtraCallback + 47;
            onExtraCallbackWithResult = i5 % 128;
            return i5 % 2 != 0;
        }
        if (this.keyType != hascatalystinstance.keyType) {
            int i6 = onExtraCallback + 51;
            onExtraCallbackWithResult = i6 % 128;
            return !(i6 % 2 == 0);
        }
        if (!Intrinsics.areEqual(this.nonce, hascatalystinstance.nonce)) {
            return false;
        }
        if (this.presentType != hascatalystinstance.presentType) {
            int i7 = onExtraCallback + 83;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.timezone, hascatalystinstance.timezone) || (!Intrinsics.areEqual(this.type, hascatalystinstance.type))) {
            return false;
        }
        if (Intrinsics.areEqual(this.zkpNonce, hascatalystinstance.zkpNonce)) {
            return true;
        }
        int i9 = onExtraCallbackWithResult + 61;
        onExtraCallback = i9 % 128;
        return i9 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((this.authType.hashCode() * 31) + this.data.hashCode()) * 31) + this.did.hashCode()) * 31) + Integer.hashCode(this.encryptType)) * 31) + Integer.hashCode(this.keyType)) * 31) + this.nonce.hashCode()) * 31) + Integer.hashCode(this.presentType)) * 31) + this.timezone.hashCode()) * 31) + this.type.hashCode()) * 31) + this.zkpNonce.hashCode();
        int i4 = onExtraCallbackWithResult + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "M400Vp(authType=" + this.authType + ", data=" + this.data + ", did=" + this.did + ", encryptType=" + this.encryptType + ", keyType=" + this.keyType + ", nonce=" + this.nonce + ", presentType=" + this.presentType + ", timezone=" + this.timezone + ", type=" + this.type + ", zkpNonce=" + this.zkpNonce + ")";
        int i2 = onExtraCallbackWithResult + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.authType);
        parcel.writeString(this.data);
        parcel.writeString(this.did);
        parcel.writeInt(this.encryptType);
        parcel.writeInt(this.keyType);
        parcel.writeString(this.nonce);
        parcel.writeInt(this.presentType);
        parcel.writeString(this.timezone);
        parcel.writeString(this.type);
        parcel.writeString(this.zkpNonce);
        int i5 = onExtraCallback + 51;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public hasCatalystInstance(@NotNull List<String> list, @NotNull String str, @NotNull String str2, int i, int i2, @NotNull String str3, int i3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.authType = list;
        this.data = str;
        this.did = str2;
        this.encryptType = i;
        this.keyType = i2;
        this.nonce = str3;
        this.presentType = i3;
        this.timezone = str4;
        this.type = str5;
        this.zkpNonce = str6;
    }

    public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.authType) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 541);
            hasReactInstance hasreactinstance = new hasReactInstance();
            List<String> list = this.authType;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, hasreactinstance, list).write(jsonWriter, list);
        }
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 697);
        jsonWriter.value(this.data);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 668);
        jsonWriter.value(this.did);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 196);
        jsonWriter.value(Integer.valueOf(this.encryptType));
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 664);
        jsonWriter.value(Integer.valueOf(this.keyType));
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 695);
        jsonWriter.value(this.nonce);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 178);
        jsonWriter.value(Integer.valueOf(this.presentType));
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 681);
        jsonWriter.value(this.timezone);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 849);
        jsonWriter.value(this.type);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 706);
        jsonWriter.value(this.zkpNonce);
    }

    public /* synthetic */ hasCatalystInstance() {
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) throws JsonSyntaxException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onNavigationEvent(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.gson.JsonSyntaxException */
    protected /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, int i) throws JsonSyntaxException {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 159) {
            if (!z) {
                jsonReader.nextNull();
                return;
            }
            try {
                this.presentType = jsonReader.nextInt();
                return;
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }
        if (i == 311) {
            if (!z) {
                this.type = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.type = jsonReader.nextString();
                return;
            } else {
                this.type = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 494) {
            if (!z) {
                jsonReader.nextNull();
                return;
            }
            try {
                this.encryptType = jsonReader.nextInt();
                return;
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }
        if (i == 525) {
            if (!z) {
                jsonReader.nextNull();
                return;
            }
            try {
                this.keyType = jsonReader.nextInt();
                return;
            } catch (NumberFormatException e3) {
                throw new JsonSyntaxException(e3);
            }
        }
        if (i == 548) {
            if (z) {
                this.authType = (List) gson.getAdapter(new hasReactInstance()).read(jsonReader);
                return;
            } else {
                this.authType = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 573) {
            if (!z) {
                this.timezone = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.timezone = jsonReader.nextString();
                return;
            } else {
                this.timezone = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 618) {
            if (!z) {
                this.data = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.data = jsonReader.nextString();
                return;
            } else {
                this.data = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 629) {
            if (!z) {
                this.zkpNonce = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.zkpNonce = jsonReader.nextString();
                return;
            } else {
                this.zkpNonce = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 686) {
            if (!z) {
                this.did = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.did = jsonReader.nextString();
                return;
            } else {
                this.did = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 697) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.nonce = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.nonce = jsonReader.nextString();
        } else {
            this.nonce = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
