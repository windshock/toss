package o;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeVibrationSpec implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<NativeVibrationSpec> CREATOR = new onExtraCallback();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private String href;
    private String iconUri;
    private String id;
    private String sectionItemId;
    private vibrateByPattern style;
    private String title;
    private boolean trackEvent;
    private showWithGravityAndOffset type;
    private String value;

    public static final class onExtraCallback implements Parcelable.Creator<NativeVibrationSpec> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeVibrationSpec createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            NativeVibrationSpec nativeVibrationSpecOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return nativeVibrationSpecOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeVibrationSpec[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            NativeVibrationSpec[] nativeVibrationSpecArrOnExtraCallback = onExtraCallback(i);
            if (i4 != 0) {
                int i5 = 49 / 0;
            }
            return nativeVibrationSpecArrOnExtraCallback;
        }

        public final NativeVibrationSpec[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            NativeVibrationSpec[] nativeVibrationSpecArr = new NativeVibrationSpec[i];
            int i6 = i3 + 35;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return nativeVibrationSpecArr;
        }

        public final NativeVibrationSpec onExtraCallbackWithResult(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            showWithGravityAndOffset showwithgravityandoffsetValueOf = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                parcel.readString();
                parcel.readString();
                parcel.readString();
                parcel.readString();
                parcel.readInt();
                showwithgravityandoffsetValueOf.hashCode();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = onWarmupCompleted + 33;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    showwithgravityandoffsetValueOf.hashCode();
                    throw null;
                }
            } else {
                showwithgravityandoffsetValueOf = showWithGravityAndOffset.valueOf(parcel.readString());
            }
            showWithGravityAndOffset showwithgravityandoffset = showwithgravityandoffsetValueOf;
            vibrateByPattern vibratebypatternCreateFromParcel = vibrateByPattern.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i5 = onWarmupCompleted + 111;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
            return new NativeVibrationSpec(string, string2, string3, string4, showwithgravityandoffset, vibratebypatternCreateFromParcel, string5, z, parcel.readString());
        }
    }

    static {
        int i = onExtraCallbackWithResult + 29;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public NativeVibrationSpec() {
        this(null, null, null, null, null, null, null, false, null, 511, null);
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~(i4 | i2);
        int i8 = ~i4;
        int i9 = ~i2;
        int i10 = i8 | i9;
        int i11 = i7 | (~(i10 | i5));
        int i12 = i9 | i4;
        int i13 = (~i10) | i5;
        int i14 = i5 + i4 + i6 + ((-1587644119) * i3) + (1302866265 * i);
        int i15 = i14 * i14;
        int i16 = (i5 * (-1579585154)) + 1163788288 + ((-1579585154) * i4) + ((-914001539) * i11) + (i12 * 914001539) + (914001539 * i13) + ((-665583616) * i6) + (1500774400 * i3) + ((-1456209920) * i) + ((-2144468992) * i15);
        int i17 = ((i5 * (-855313886)) - 1253577507) + (i4 * (-855313886)) + (i11 * (-13)) + (i12 * 13) + (i13 * 13) + (i6 * (-855313873)) + (i3 * (-1467678585)) + (i * 593082711) + (i15 * 74579968);
        return i16 + ((i17 * i17) * (-1668153344)) != 1 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onNavigationEvent = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeVibrationSpec)) {
            return false;
        }
        NativeVibrationSpec nativeVibrationSpec = (NativeVibrationSpec) obj;
        if ((!Intrinsics.areEqual(this.id, nativeVibrationSpec.id)) || !Intrinsics.areEqual(this.title, nativeVibrationSpec.title)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.href, nativeVibrationSpec.href)) {
            int i2 = onWarmupCompleted + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.iconUri, nativeVibrationSpec.iconUri)) {
            return false;
        }
        if (this.type != nativeVibrationSpec.type) {
            int i4 = onNavigationEvent + 25;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.style, nativeVibrationSpec.style)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.value, nativeVibrationSpec.value)) {
            int i6 = onWarmupCompleted + 85;
            onNavigationEvent = i6 % 128;
            return i6 % 2 == 0;
        }
        if (this.trackEvent != nativeVibrationSpec.trackEvent) {
            return false;
        }
        if (!Intrinsics.areEqual(this.sectionItemId, nativeVibrationSpec.sectionItemId)) {
            int i7 = onWarmupCompleted + 39;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = onWarmupCompleted + 107;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c A[PHI: r1 r3 r4 r5 r6
      0x004c: PHI (r1v23 int) = (r1v5 int), (r1v25 int) binds: [B:8:0x0049, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r3v3 int) = (r3v1 int), (r3v5 int) binds: [B:8:0x0049, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r4v3 int) = (r4v1 int), (r4v5 int) binds: [B:8:0x0049, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r5v3 int) = (r5v1 int), (r5v5 int) binds: [B:8:0x0049, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r6v1 o.showWithGravityAndOffset) = (r6v0 o.showWithGravityAndOffset), (r6v5 o.showWithGravityAndOffset) binds: [B:8:0x0049, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.NativeVibrationSpec.onNavigationEvent
            int r1 = r1 + 103
            int r2 = r1 % 128
            o.NativeVibrationSpec.onWarmupCompleted = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L2f
            java.lang.String r1 = r8.id
            int r1 = r1.hashCode()
            java.lang.String r3 = r8.title
            int r3 = r3.hashCode()
            java.lang.String r4 = r8.href
            int r4 = r4.hashCode()
            java.lang.String r5 = r8.iconUri
            int r5 = r5.hashCode()
            o.showWithGravityAndOffset r6 = r8.type
            r7 = 39
            int r7 = r7 / r2
            if (r6 != 0) goto L4c
            goto L59
        L2f:
            java.lang.String r1 = r8.id
            int r1 = r1.hashCode()
            java.lang.String r3 = r8.title
            int r3 = r3.hashCode()
            java.lang.String r4 = r8.href
            int r4 = r4.hashCode()
            java.lang.String r5 = r8.iconUri
            int r5 = r5.hashCode()
            o.showWithGravityAndOffset r6 = r8.type
            if (r6 != 0) goto L4c
            goto L59
        L4c:
            int r2 = r6.hashCode()
            int r6 = o.NativeVibrationSpec.onWarmupCompleted
            int r6 = r6 + 71
            int r7 = r6 % 128
            o.NativeVibrationSpec.onNavigationEvent = r7
            int r6 = r6 % r0
        L59:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r5
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            o.vibrateByPattern r0 = r8.style
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r8.value
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r8.trackEvent
            int r0 = java.lang.Boolean.hashCode(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r8.sectionItemId
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.NativeVibrationSpec.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Link(id=" + this.id + ", title=" + this.title + ", href=" + this.href + ", iconUri=" + this.iconUri + ", type=" + this.type + ", style=" + this.style + ", value=" + this.value + ", trackEvent=" + this.trackEvent + ", sectionItemId=" + this.sectionItemId + ")";
        int i2 = onWarmupCompleted + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 21;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.href);
        parcel.writeString(this.iconUri);
        showWithGravityAndOffset showwithgravityandoffset = this.type;
        if (showwithgravityandoffset == null) {
            int i5 = onNavigationEvent + 67;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            parcel.writeString(showwithgravityandoffset.name());
            int i6 = onWarmupCompleted + 49;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        this.style.writeToParcel(parcel, i);
        parcel.writeString(this.value);
        parcel.writeInt(this.trackEvent ? 1 : 0);
        parcel.writeString(this.sectionItemId);
    }

    public NativeVibrationSpec(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable showWithGravityAndOffset showwithgravityandoffset, @NotNull vibrateByPattern vibratebypattern, @NotNull String str5, boolean z, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(vibratebypattern, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.id = str;
        this.title = str2;
        this.href = str3;
        this.iconUri = str4;
        this.type = showwithgravityandoffset;
        this.style = vibratebypattern;
        this.value = str5;
        this.trackEvent = z;
        this.sectionItemId = str6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeVibrationSpec(String str, String str2, String str3, String str4, showWithGravityAndOffset showwithgravityandoffset, vibrateByPattern vibratebypattern, String str5, boolean z, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8;
        boolean z2;
        String str9 = "";
        String str10 = (i & 1) != 0 ? "" : str;
        String str11 = (i & 2) != 0 ? "" : str2;
        String str12 = (i & 4) != 0 ? "" : str3;
        if ((i & 8) != 0) {
            int i2 = onNavigationEvent + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str7 = "";
        } else {
            str7 = str4;
        }
        showWithGravityAndOffset showwithgravityandoffset2 = (i & 16) != 0 ? showWithGravityAndOffset.NONE : showwithgravityandoffset;
        vibrateByPattern vibratebypattern2 = (i & 32) != 0 ? new vibrateByPattern(null, 1, null) : vibratebypattern;
        if ((i & 64) != 0) {
            int i5 = 2 % 2;
            str8 = "";
        } else {
            str8 = str5;
        }
        if ((i & 128) != 0) {
            int i6 = onWarmupCompleted + 119;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 256) != 0) {
            int i8 = onNavigationEvent + 109;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 36 / 0;
            }
        } else {
            str9 = str6;
        }
        this(str10, str11, str12, str7, showwithgravityandoffset2, vibratebypattern2, str8, z2, str9);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.id;
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 125;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 95;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.href;
        int i5 = i2 + 79;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.iconUri;
        int i5 = i3 + 61;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final showWithGravityAndOffset asInterface() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        showWithGravityAndOffset showwithgravityandoffset = this.type;
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        return showwithgravityandoffset;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        NativeVibrationSpec nativeVibrationSpec = (NativeVibrationSpec) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        vibrateByPattern vibratebypattern = nativeVibrationSpec.style;
        if (i4 != 0) {
            int i5 = 26 / 0;
        }
        int i6 = i3 + 49;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return vibratebypattern;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 51;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 59;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 121;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.trackEvent;
        int i4 = i2 + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        this.trackEvent = z;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        NativeVibrationSpec nativeVibrationSpec = (NativeVibrationSpec) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = nativeVibrationSpec.sectionItemId;
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return str;
    }

    public final void IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.sectionItemId = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.sectionItemId = str;
            throw null;
        }
    }

    public final String onExtraCallbackWithResult() {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (String) IAuthTabCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, new Object[]{this}, iIAuthTabCallback3, 2128801435, -2128801435, iIAuthTabCallback2);
    }

    public final vibrateByPattern IAuthTabCallback() {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (vibrateByPattern) IAuthTabCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, new Object[]{this}, iIAuthTabCallback3, 43907215, -43907214, iIAuthTabCallback2);
    }
}
