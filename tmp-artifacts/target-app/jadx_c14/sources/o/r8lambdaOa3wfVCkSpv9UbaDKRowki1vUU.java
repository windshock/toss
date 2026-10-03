package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import javax.crypto.spec.OAEPParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import o.BaseRoundCornerProgressBarSavedState1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU implements Parcelable {
    public static final Parcelable.Creator<r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU> CREATOR;
    private static int IAuthTabCallback;
    private static char[] onExtraCallback;
    private static long onWarmupCompleted;

    @SerializedName("cmd")
    private String cmd;

    @SerializedName("request")
    private String request;

    @SerializedName("trxcode")
    private String trxCode;

    @SerializedName("type")
    private String type;

    @SerializedName("version")
    private String version;

    @SerializedName("vp")
    private hasCatalystInstance vp;
    private static final byte[] $$a = {70, -47, -65, 52};
    private static final int $$b = 220;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int asInterface = 1;
    private static int onExtraCallbackWithResult = 1;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU r8lambdaoa3wfvckspv9ubadkrowki1vuu = new r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), hasCatalystInstance.CREATOR.createFromParcel(parcel));
            int i2 = onWarmupCompleted + 53;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return r8lambdaoa3wfvckspv9ubadkrowki1vuu;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                IAuthTabCallback(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU r8lambdaoa3wfvckspv9ubadkrowki1vuuIAuthTabCallback = IAuthTabCallback(parcel);
            int i3 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return r8lambdaoa3wfvckspv9ubadkrowki1vuuIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU[] r8lambdaoa3wfvckspv9ubadkrowki1vuuArrOnNavigationEvent = onNavigationEvent(i);
            int i5 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return r8lambdaoa3wfvckspv9ubadkrowki1vuuArrOnNavigationEvent;
        }

        public final r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i3 % 128;
            r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU[] r8lambdaoa3wfvckspv9ubadkrowki1vuuArr = new r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU[i];
            if (i3 % 2 != 0) {
                return r8lambdaoa3wfvckspv9ubadkrowki1vuuArr;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, short r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 97
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r1 = o.r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU.$$a
            int r8 = r8 * 2
            int r8 = 3 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r8 = r8 + 1
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU.$$c(int, byte, short):java.lang.String");
    }

    static {
        IAuthTabCallback = 0;
        onExtraCallbackWithResult();
        CREATOR = new onExtraCallbackWithResult();
        int i = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2 == 0 ? 1 : 0;
        int i5 = i3 + 51;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU)) {
            int i4 = i3 + 79;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU r8lambdaoa3wfvckspv9ubadkrowki1vuu = (r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU) obj;
        if ((!Intrinsics.areEqual(this.cmd, r8lambdaoa3wfvckspv9ubadkrowki1vuu.cmd)) || !Intrinsics.areEqual(this.request, r8lambdaoa3wfvckspv9ubadkrowki1vuu.request) || !Intrinsics.areEqual(this.trxCode, r8lambdaoa3wfvckspv9ubadkrowki1vuu.trxCode) || !Intrinsics.areEqual(this.type, r8lambdaoa3wfvckspv9ubadkrowki1vuu.type)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.version, r8lambdaoa3wfvckspv9ubadkrowki1vuu.version)) {
            int i6 = asInterface + 41;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.vp, r8lambdaoa3wfvckspv9ubadkrowki1vuu.vp))) {
            return true;
        }
        int i8 = onNavigationEvent + 85;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.cmd.hashCode() * 31) + this.request.hashCode()) * 31) + this.trxCode.hashCode()) * 31) + this.type.hashCode()) * 31) + this.version.hashCode()) * 31) + this.vp.hashCode();
        int i4 = onNavigationEvent + 51;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifyMobileIdM400(cmd=" + this.cmd + ", request=" + this.request + ", trxCode=" + this.trxCode + ", type=" + this.type + ", version=" + this.version + ", vp=" + this.vp + ")";
        int i2 = asInterface + 25;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 7;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.cmd);
        parcel.writeString(this.request);
        parcel.writeString(this.trxCode);
        parcel.writeString(this.type);
        parcel.writeString(this.version);
        this.vp.writeToParcel(parcel, i);
        int i5 = onNavigationEvent + 123;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull hasCatalystInstance hascatalystinstance) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(hascatalystinstance, "");
        this.cmd = str;
        this.request = str2;
        this.trxCode = str3;
        this.type = str4;
        this.version = str5;
        this.vp = hascatalystinstance;
    }

    public final JsonObject onWarmupCompleted(@NotNull String str, @NotNull BaseRoundCornerProgressBarSavedState1.IAuthTabCallback iAuthTabCallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        String json = ALCEyeBlink.onWarmupCompleted.onExtraCallbackWithResult().create().toJson(this, r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU.class);
        try {
            BaseRoundCornerProgressBarSavedState1 baseRoundCornerProgressBarSavedState1 = BaseRoundCornerProgressBarSavedState1.onExtraCallbackWithResult;
            Intrinsics.checkNotNull(json);
            JsonObject jsonObjectOnWarmupCompleted = BaseRoundCornerProgressBarSavedState1.onWarmupCompleted(baseRoundCornerProgressBarSavedState1, str, json, iAuthTabCallback, (String) null, (OAEPParameterSpec) null, 24, (Object) null);
            int i2 = onNavigationEvent + 89;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return jsonObjectOnWarmupCompleted;
        } catch (Throwable th) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("VerifyMobileIdM400", th);
            if (zzaj.onNavigationEvent().onActivityLayout()) {
                JsonObject jsonObject = new JsonObject();
                Object[] objArr = new Object[1];
                a(ViewConfiguration.getPressedStateDuration() >> 16, TextUtils.lastIndexOf("", '0') + 8, (char) (ViewConfiguration.getTapTimeout() >> 16), objArr);
                jsonObject.addProperty(((String) objArr[0]).intern(), th.getMessage());
                return jsonObject;
            }
            JsonObject jsonObject2 = new JsonObject();
            int i4 = onNavigationEvent + 93;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return jsonObject2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r28, int r29, char r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU.a(int, int, char, java.lang.Object[]):void");
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        jsonWriter.beginObject();
        onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
        if (i3 != 0) {
            throw null;
        }
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 337);
        jsonWriter.value(this.cmd);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 702);
        jsonWriter.value(this.request);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 490);
        jsonWriter.value(this.trxCode);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 849);
        jsonWriter.value(this.type);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 557);
        jsonWriter.value(this.version);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 276);
        hasCatalystInstance hascatalystinstance = this.vp;
        DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, hasCatalystInstance.class, hascatalystinstance).write(jsonWriter, hascatalystinstance);
        int i4 = onNavigationEvent + 13;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU() {
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        int i = 2 % 2;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int i2 = onNavigationEvent + 47;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            int i4 = asInterface + 7;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        jsonReader.endObject();
        int i6 = onNavigationEvent + 125;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, int i) {
        int i2 = 2 % 2;
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 119) {
            if (!z) {
                this.cmd = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.cmd = jsonReader.nextString();
                return;
            } else {
                this.cmd = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 311) {
            if (!z) {
                this.type = null;
                jsonReader.nextNull();
                int i3 = onNavigationEvent + 87;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            if (jsonReader.peek() == JsonToken.BOOLEAN) {
                this.type = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
            int i5 = asInterface + 5;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            this.type = jsonReader.nextString();
            return;
        }
        if (i == 379) {
            if (!z) {
                this.trxCode = null;
                jsonReader.nextNull();
                return;
            } else {
                if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.trxCode = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
                int i7 = onNavigationEvent + 123;
                asInterface = i7 % 128;
                if (i7 % 2 != 0) {
                    this.trxCode = jsonReader.nextString();
                    return;
                } else {
                    this.trxCode = jsonReader.nextString();
                    int i8 = 98 / 0;
                    return;
                }
            }
        }
        if (i == 597) {
            if (z) {
                this.vp = (hasCatalystInstance) gson.getAdapter(hasCatalystInstance.class).read(jsonReader);
                return;
            } else {
                this.vp = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 722) {
            if (!z) {
                this.version = null;
                jsonReader.nextNull();
                return;
            }
            int i9 = asInterface + 41;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.version = jsonReader.nextString();
                return;
            } else {
                this.version = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 747) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.request = null;
            jsonReader.nextNull();
            int i11 = asInterface + 25;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            return;
        }
        int i13 = asInterface + 67;
        onNavigationEvent = i13 % 128;
        int i14 = i13 % 2;
        if (jsonReader.peek() == JsonToken.BOOLEAN) {
            this.request = Boolean.toString(jsonReader.nextBoolean());
            return;
        }
        int i15 = onNavigationEvent + 59;
        asInterface = i15 % 128;
        int i16 = i15 % 2;
        this.request = jsonReader.nextString();
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = new char[]{60857, 41618, 29665, 206, 53561, 26140, 14179};
        onWarmupCompleted = 4219779939430802167L;
    }
}
