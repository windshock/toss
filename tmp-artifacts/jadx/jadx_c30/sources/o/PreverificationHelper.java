package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PreverificationHelper implements Parcelable {
    public static final Parcelable.Creator<PreverificationHelper> CREATOR = new onExtraCallback();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("ars")
    private Boolean ars;

    @SerializedName("arsId")
    private String arsId;

    @SerializedName("bcKeyNo")
    private Long bcKeyNo;

    @SerializedName("bcPassword")
    private String bcPassword;

    @SerializedName("keyNo")
    private Long keyNo;

    @SerializedName("password")
    private String password;

    @SerializedName("smallTransfer")
    private Boolean smallTransfer;

    @SerializedName("smallTransferAccountNumber")
    private String smallTransferAccountNumber;

    @SerializedName("smallTransferBankCode")
    private String smallTransferBankCode;

    public static final class onExtraCallback implements Parcelable.Creator<PreverificationHelper> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ PreverificationHelper createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            PreverificationHelper preverificationHelperOnExtraCallback = onExtraCallback(parcel);
            int i4 = onExtraCallback + 109;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return preverificationHelperOnExtraCallback;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ PreverificationHelper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 27;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            PreverificationHelper[] preverificationHelperArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onNavigationEvent + 109;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 94 / 0;
            }
            return preverificationHelperArrOnExtraCallbackWithResult;
        }

        public final PreverificationHelper onExtraCallback(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Long l;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            String string = parcel.readString();
            String string2 = parcel.readString();
            Object obj = null;
            if (parcel.readInt() == 0) {
                int i2 = onNavigationEvent + 67;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 27;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                int i7 = onExtraCallback + 107;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                l = null;
            } else {
                Long lValueOf2 = Long.valueOf(parcel.readLong());
                int i9 = onNavigationEvent + 119;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                l = lValueOf2;
            }
            PreverificationHelper preverificationHelper = new PreverificationHelper(string, string2, boolValueOf, boolValueOf2, string3, string4, lValueOf, string5, l);
            int i11 = onExtraCallback + 7;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 == 0) {
                return preverificationHelper;
            }
            obj.hashCode();
            throw null;
        }

        public final PreverificationHelper[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 117;
            onNavigationEvent = i3 % 128;
            PreverificationHelper[] preverificationHelperArr = new PreverificationHelper[i];
            if (i3 % 2 == 0) {
                return preverificationHelperArr;
            }
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 43;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public PreverificationHelper() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 81;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof PreverificationHelper)) {
            return false;
        }
        PreverificationHelper preverificationHelper = (PreverificationHelper) obj;
        if (!Intrinsics.areEqual(this.smallTransferBankCode, preverificationHelper.smallTransferBankCode) || (!Intrinsics.areEqual(this.smallTransferAccountNumber, preverificationHelper.smallTransferAccountNumber))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.smallTransfer, preverificationHelper.smallTransfer)) {
            int i4 = onWarmupCompleted + 109;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ars, preverificationHelper.ars)) {
            int i6 = onWarmupCompleted + 107;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.arsId, preverificationHelper.arsId) || !Intrinsics.areEqual(this.password, preverificationHelper.password)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.keyNo, preverificationHelper.keyNo))) {
            return Intrinsics.areEqual(this.bcPassword, preverificationHelper.bcPassword) && Intrinsics.areEqual(this.bcKeyNo, preverificationHelper.bcKeyNo);
        }
        int i7 = onWarmupCompleted + 9;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.smallTransferBankCode;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.smallTransferAccountNumber;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.smallTransfer;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.ars;
        int iHashCode7 = bool2 == null ? 0 : bool2.hashCode();
        String str3 = this.arsId;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.password;
        if (str4 == null) {
            int i2 = onWarmupCompleted + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str4.hashCode();
        }
        Long l = this.keyNo;
        if (l == null) {
            int i4 = onNavigationEvent + 9;
            onWarmupCompleted = i4 % 128;
            iHashCode2 = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = l.hashCode();
        }
        String str5 = this.bcPassword;
        if (str5 == null) {
            iHashCode3 = 0;
        } else {
            iHashCode3 = str5.hashCode();
            int i5 = onWarmupCompleted + 53;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        Long l2 = this.bcKeyNo;
        return (((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccIssueReq(smallTransferBankCode=" + this.smallTransferBankCode + ", smallTransferAccountNumber=" + this.smallTransferAccountNumber + ", smallTransfer=" + this.smallTransfer + ", ars=" + this.ars + ", arsId=" + this.arsId + ", password=" + this.password + ", keyNo=" + this.keyNo + ", bcPassword=" + this.bcPassword + ", bcKeyNo=" + this.bcKeyNo + ")";
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 81;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeString(this.smallTransferBankCode);
        parcel.writeString(this.smallTransferAccountNumber);
        Boolean bool = this.smallTransfer;
        if (bool == null) {
            int i5 = onNavigationEvent + 123;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.ars;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.arsId);
        parcel.writeString(this.password);
        Long l = this.keyNo;
        if (l == null) {
            int i7 = onWarmupCompleted + 27;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.bcPassword);
        Long l2 = this.bcKeyNo;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
    }

    public PreverificationHelper(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str3, @Nullable String str4, @Nullable Long l, @Nullable String str5, @Nullable Long l2) {
        this.smallTransferBankCode = str;
        this.smallTransferAccountNumber = str2;
        this.smallTransfer = bool;
        this.ars = bool2;
        this.arsId = str3;
        this.password = str4;
        this.keyNo = l;
        this.bcPassword = str5;
        this.bcKeyNo = l2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PreverificationHelper(String str, String str2, Boolean bool, Boolean bool2, String str3, String str4, Long l, String str5, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        Boolean bool3;
        Boolean bool4;
        String str8;
        String str9;
        Long l3 = null;
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 107;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 % 4;
            } else {
                int i4 = 2 % 2;
            }
            str6 = null;
        } else {
            str6 = str;
        }
        if ((i & 2) != 0) {
            int i5 = 2 % 2;
            str7 = null;
        } else {
            str7 = str2;
        }
        if ((i & 4) != 0) {
            int i6 = 2 % 2;
            bool3 = null;
        } else {
            bool3 = bool;
        }
        if ((i & 8) != 0) {
            int i7 = onWarmupCompleted + 93;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            bool4 = null;
        } else {
            bool4 = bool2;
        }
        if ((i & 16) != 0) {
            int i9 = onWarmupCompleted + 3;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            str8 = null;
        } else {
            str8 = str3;
        }
        if ((i & 32) != 0) {
            int i11 = 2 % 2;
            str9 = null;
        } else {
            str9 = str4;
        }
        Long l4 = (i & 64) != 0 ? null : l;
        String str10 = (i & 128) != 0 ? null : str5;
        if ((i & 256) != 0) {
            int i12 = 2 % 2;
        } else {
            l3 = l2;
        }
        this(str6, str7, bool3, bool4, str8, str9, l4, str10, l3);
    }
}
