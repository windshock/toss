package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class S2SRewardedVideoAdExtendedListener implements Parcelable {
    public static final Parcelable.Creator<S2SRewardedVideoAdExtendedListener> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("ciCheck")
    private final boolean bankCiCheckNeeded;

    @SerializedName("bankCode")
    private final int bankCode;
    private transient String ci;

    @SerializedName("ciRequired")
    private final boolean ciRequired;

    @SerializedName("publicKey")
    private final String publicKey;

    @SerializedName("standardTermsCode")
    private final String standardTermsCode;

    @SerializedName("webUrl")
    private final String webUrl;

    public static final class IAuthTabCallback implements Parcelable.Creator<S2SRewardedVideoAdExtendedListener> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ S2SRewardedVideoAdExtendedListener createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListenerOnExtraCallback = onExtraCallback(parcel);
            int i4 = onExtraCallback + 101;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return s2SRewardedVideoAdExtendedListenerOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ S2SRewardedVideoAdExtendedListener[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 5;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return onWarmupCompleted(i);
            }
            onWarmupCompleted(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final o.S2SRewardedVideoAdExtendedListener onExtraCallback(android.os.Parcel r14) {
            /*
                r13 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = o.S2SRewardedVideoAdExtendedListener.IAuthTabCallback.onExtraCallback
                int r1 = r1 + 35
                int r2 = r1 % 128
                o.S2SRewardedVideoAdExtendedListener.IAuthTabCallback.onWarmupCompleted = r2
                int r1 = r1 % r0
                r2 = 0
                java.lang.String r3 = ""
                r4 = 1
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r3)
                if (r1 != 0) goto L20
                int r1 = r14.readInt()
                int r3 = r14.readInt()
            L1d:
                r6 = r1
                r7 = r4
                goto L2d
            L20:
                int r1 = r14.readInt()
                int r3 = r14.readInt()
                if (r3 == 0) goto L2b
                goto L1d
            L2b:
                r6 = r1
                r7 = r2
            L2d:
                java.lang.String r8 = r14.readString()
                java.lang.String r9 = r14.readString()
                int r1 = r14.readInt()
                if (r1 != 0) goto L46
                int r1 = o.S2SRewardedVideoAdExtendedListener.IAuthTabCallback.onExtraCallback
                int r1 = r1 + 107
                int r3 = r1 % 128
                o.S2SRewardedVideoAdExtendedListener.IAuthTabCallback.onWarmupCompleted = r3
                int r1 = r1 % r0
                r10 = r2
                goto L47
            L46:
                r10 = r4
            L47:
                o.S2SRewardedVideoAdExtendedListener r0 = new o.S2SRewardedVideoAdExtendedListener
                java.lang.String r11 = r14.readString()
                java.lang.String r12 = r14.readString()
                r5 = r0
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.S2SRewardedVideoAdExtendedListener.IAuthTabCallback.onExtraCallback(android.os.Parcel):o.S2SRewardedVideoAdExtendedListener");
        }

        public final S2SRewardedVideoAdExtendedListener[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 47;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            S2SRewardedVideoAdExtendedListener[] s2SRewardedVideoAdExtendedListenerArr = new S2SRewardedVideoAdExtendedListener[i];
            int i6 = i3 + 39;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return s2SRewardedVideoAdExtendedListenerArr;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public S2SRewardedVideoAdExtendedListener() {
        this(0, false, null, null, false, null, null, 127, null);
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = i3 | i7;
        int i9 = ~i6;
        int i10 = ~((~i3) | i7);
        int i11 = i4 + i6 + i5 + (1977613057 * i) + (454551927 * i2);
        int i12 = i11 * i11;
        int i13 = (1378041352 * i4) + 473956352 + (953991674 * i6) + (212024839 * i8) + (i9 * (-212024839)) + ((-212024839) * i10) + (1166016512 * i5) + ((-981467136) * i) + ((-830472192) * i2) + ((-499122176) * i12);
        int i14 = (i4 * (-1131120504)) + 246467939 + (i6 * (-1131119078)) + (i8 * (-713)) + (i9 * 713) + (i10 * 713) + (i5 * (-1131119791)) + (i * (-1039407535)) + (i2 * 1820920743) + (i12 * 1447034880);
        return i13 + ((i14 * i14) * 1170210816) != 1 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener = (S2SRewardedVideoAdExtendedListener) objArr[0];
        Parcel parcel = (Parcel) objArr[1];
        ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(s2SRewardedVideoAdExtendedListener.bankCode);
        parcel.writeInt(s2SRewardedVideoAdExtendedListener.ciRequired ? 1 : 0);
        parcel.writeString(s2SRewardedVideoAdExtendedListener.webUrl);
        parcel.writeString(s2SRewardedVideoAdExtendedListener.publicKey);
        parcel.writeInt(s2SRewardedVideoAdExtendedListener.bankCiCheckNeeded ? 1 : 0);
        parcel.writeString(s2SRewardedVideoAdExtendedListener.standardTermsCode);
        parcel.writeString(s2SRewardedVideoAdExtendedListener.ci);
        int i4 = IAuthTabCallback + 103;
        onExtraCallback = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 91;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 123;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof S2SRewardedVideoAdExtendedListener)) {
            return false;
        }
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener = (S2SRewardedVideoAdExtendedListener) obj;
        if (this.bankCode != s2SRewardedVideoAdExtendedListener.bankCode) {
            int i4 = onExtraCallback + 13;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (this.ciRequired != s2SRewardedVideoAdExtendedListener.ciRequired) {
            int i5 = onExtraCallback + 23;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.webUrl, s2SRewardedVideoAdExtendedListener.webUrl)) {
            int i7 = IAuthTabCallback + 111;
            onExtraCallback = i7 % 128;
            return i7 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.publicKey, s2SRewardedVideoAdExtendedListener.publicKey)) {
            return this.bankCiCheckNeeded == s2SRewardedVideoAdExtendedListener.bankCiCheckNeeded && Intrinsics.areEqual(this.standardTermsCode, s2SRewardedVideoAdExtendedListener.standardTermsCode) && Intrinsics.areEqual(this.ci, s2SRewardedVideoAdExtendedListener.ci);
        }
        int i8 = onExtraCallback + 19;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = Integer.hashCode(this.bankCode);
        int iHashCode4 = Boolean.hashCode(this.ciRequired);
        String str = this.webUrl;
        if (str == null) {
            int i2 = IAuthTabCallback + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.publicKey;
        if (str2 == null) {
            int i4 = onExtraCallback + 23;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i6 = onExtraCallback + 63;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        int iHashCode5 = Boolean.hashCode(this.bankCiCheckNeeded);
        String str3 = this.standardTermsCode;
        int iHashCode6 = (((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.ci.hashCode();
        int i8 = onExtraCallback + 25;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 2 / 0;
        }
        return iHashCode6;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountNotificationInfo(bankCode=" + this.bankCode + ", ciRequired=" + this.ciRequired + ", webUrl=" + this.webUrl + ", publicKey=" + this.publicKey + ", bankCiCheckNeeded=" + this.bankCiCheckNeeded + ", standardTermsCode=" + this.standardTermsCode + ", ci=" + this.ci + ")";
        int i2 = IAuthTabCallback + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 50 / 0;
        }
        return str;
    }

    public S2SRewardedVideoAdExtendedListener(int i, boolean z, @Nullable String str, @Nullable String str2, boolean z2, @Nullable String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str4, "");
        this.bankCode = i;
        this.ciRequired = z;
        this.webUrl = str;
        this.publicKey = str2;
        this.bankCiCheckNeeded = z2;
        this.standardTermsCode = str3;
        this.ci = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ S2SRewardedVideoAdExtendedListener(int i, boolean z, String str, String str2, boolean z2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3;
        boolean z4 = false;
        if ((i2 & 1) != 0) {
            int i3 = 2 % 2;
            i = 0;
        }
        if ((i2 & 2) != 0) {
            int i4 = IAuthTabCallback + 7;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            z3 = false;
        } else {
            z3 = z;
        }
        String str5 = null;
        String str6 = (i2 & 4) != 0 ? null : str;
        String str7 = (i2 & 8) != 0 ? null : str2;
        if ((i2 & 16) != 0) {
            int i7 = onExtraCallback + 69;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        } else {
            z4 = z2;
        }
        if ((i2 & 32) != 0) {
            int i9 = IAuthTabCallback + 49;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                str5.hashCode();
                throw null;
            }
        } else {
            str5 = str3;
        }
        this(i, z3, str6, str7, z4, str5, (i2 & 64) != 0 ? "" : str4);
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 87;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.bankCode;
        int i6 = i2 + 121;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 37;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.ciRequired;
        int i5 = i2 + 67;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener = (S2SRewardedVideoAdExtendedListener) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = s2SRewardedVideoAdExtendedListener.webUrl;
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.publicKey;
        int i5 = i3 + 83;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 91;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.bankCiCheckNeeded;
        int i4 = i2 + 51;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.standardTermsCode;
        int i5 = i3 + 91;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.ci;
        int i4 = i3 + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.ci = str;
            int i3 = 98 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.ci = str;
        }
        int i4 = IAuthTabCallback + 87;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this.ci.length() <= 0) {
            return false;
        }
        int i4 = IAuthTabCallback + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public final String onTransact() {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return (String) onExtraCallbackWithResult(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, -1068057786, iOnExtraCallback2, 1068057787, new Object[]{this});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Object[] objArr = {this, parcel, Integer.valueOf(i)};
        onExtraCallbackWithResult(getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 1651877224, getKekid.onExtraCallback(), -1651877224, objArr);
    }
}
