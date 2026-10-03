package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import java.text.ParseException;
import java.util.Date;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o._string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class KitKatPurgeableDecoder implements Parcelable, getOther, KEKIdentifier {
    public static final int $stable = 0;
    public static final Parcelable.Creator<KitKatPurgeableDecoder> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    @SerializedName("affiliatedStoreNum")
    private final String affiliatedStoreNum;

    @SerializedName("amount")
    private final long amount;

    @SerializedName("amountText")
    private final String amountText;

    @SerializedName("approveAmount")
    private final Long approveAmount;

    @SerializedName("approveNum")
    private final String approveNum;

    @SerializedName("approveTs")
    private final String approveTs;

    @SerializedName("cancelAmount")
    private final Long cancelAmount;

    @SerializedName("canceled")
    private final boolean canceled;

    @SerializedName("cardId")
    private final long cardId;

    @SerializedName("cashbackAmount")
    private final long cashbackAmount;

    @SerializedName("cashbackType")
    private final String cashbackType;

    @SerializedName("diffAmount")
    private final Long diffAmount;

    @SerializedName("foreignApprove")
    private final boolean foreignApprove;

    @SerializedName("id")
    private final long id;

    @SerializedName("oneRowType")
    private final String oneRowType;

    @SerializedName("paymentMethod")
    private final String paymentMethod;

    @SerializedName("subTitle")
    private final String subTitle;

    @SerializedName("summary")
    private final String summary;

    @SerializedName("transactionStatus")
    private final String transactionStatus;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<KitKatPurgeableDecoder> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final KitKatPurgeableDecoder IAuthTabCallback(Parcel parcel) {
            boolean z;
            boolean z2;
            Long lValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i2 = onExtraCallbackWithResult + 39;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                z = true;
            } else {
                z = false;
            }
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = onNavigationEvent + 83;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                z2 = false;
            } else {
                z2 = true;
            }
            long j4 = parcel.readLong();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                int i6 = onNavigationEvent + 67;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                lValueOf = Long.valueOf(parcel.readLong());
            } else {
                lValueOf = null;
            }
            return new KitKatPurgeableDecoder(j, string, string2, string3, z, j2, j3, string4, z2, j4, string5, string6, string7, string8, lValueOf2, lValueOf3, lValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ KitKatPurgeableDecoder createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KitKatPurgeableDecoder kitKatPurgeableDecoderIAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return kitKatPurgeableDecoderIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ KitKatPurgeableDecoder[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            KitKatPurgeableDecoder[] kitKatPurgeableDecoderArrOnExtraCallback = onExtraCallback(i);
            int i5 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return kitKatPurgeableDecoderArrOnExtraCallback;
            }
            throw null;
        }

        public final KitKatPurgeableDecoder[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 85;
            onNavigationEvent = i4 % 128;
            KitKatPurgeableDecoder[] kitKatPurgeableDecoderArr = new KitKatPurgeableDecoder[i];
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = i3 + 13;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 10 / 0;
            }
            return kitKatPurgeableDecoderArr;
        }
    }

    static {
        int i = onExtraCallback + 101;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public KitKatPurgeableDecoder() {
        this(0L, null, null, null, false, 0L, 0L, null, false, 0L, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~(i | i4 | i2);
        int i8 = ~i4;
        int i9 = (~(i8 | i2)) | (~((~i2) | i));
        int i10 = (~(i2 | (~i))) | i8;
        int i11 = i + i4 + i3 + ((-2044576983) * i6) + (1743660113 * i5);
        int i12 = i11 * i11;
        int i13 = ((1047202342 * i) - 713031680) + (164951516 * i4) + (i7 * 441125413) + (441125413 * i9) + ((-441125413) * i10) + (606076928 * i3) + (689963008 * i6) + ((-299892736) * i5) + ((-1081737216) * i12);
        int i14 = ((i * 2048727874) - 782056376) + (i4 * 2048728756) + (i7 * (-441)) + (i9 * (-441)) + (i10 * 441) + (i3 * 2048728315) + (i6 * 2142076211) + (i5 * (-1448904853)) + (i12 * 1885470720);
        int i15 = i13 + (i14 * i14 * (-1618345984));
        return i15 != 1 ? i15 != 2 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onNavigationEvent = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KitKatPurgeableDecoder)) {
            return false;
        }
        KitKatPurgeableDecoder kitKatPurgeableDecoder = (KitKatPurgeableDecoder) obj;
        if (this.amount != kitKatPurgeableDecoder.amount) {
            int i2 = onNavigationEvent + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.amountText, kitKatPurgeableDecoder.amountText) || !Intrinsics.areEqual(this.approveNum, kitKatPurgeableDecoder.approveNum) || !Intrinsics.areEqual(this.approveTs, kitKatPurgeableDecoder.approveTs)) {
            return false;
        }
        if (this.canceled != kitKatPurgeableDecoder.canceled) {
            int i4 = IAuthTabCallback + 49;
            onNavigationEvent = i4 % 128;
            return i4 % 2 == 0;
        }
        if (this.cardId != kitKatPurgeableDecoder.cardId || this.cashbackAmount != kitKatPurgeableDecoder.cashbackAmount || !Intrinsics.areEqual(this.cashbackType, kitKatPurgeableDecoder.cashbackType) || this.foreignApprove != kitKatPurgeableDecoder.foreignApprove) {
            return false;
        }
        if (this.id != kitKatPurgeableDecoder.id) {
            int i5 = IAuthTabCallback + 23;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.oneRowType, kitKatPurgeableDecoder.oneRowType)) {
            int i7 = onNavigationEvent + 93;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.subTitle, kitKatPurgeableDecoder.subTitle) || !Intrinsics.areEqual(this.summary, kitKatPurgeableDecoder.summary) || !Intrinsics.areEqual(this.affiliatedStoreNum, kitKatPurgeableDecoder.affiliatedStoreNum) || !Intrinsics.areEqual(this.approveAmount, kitKatPurgeableDecoder.approveAmount) || !Intrinsics.areEqual(this.cancelAmount, kitKatPurgeableDecoder.cancelAmount) || !Intrinsics.areEqual(this.diffAmount, kitKatPurgeableDecoder.diffAmount)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.transactionStatus, kitKatPurgeableDecoder.transactionStatus)) {
            int i9 = IAuthTabCallback + 73;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.paymentMethod, kitKatPurgeableDecoder.paymentMethod)) {
            return false;
        }
        int i11 = IAuthTabCallback + 73;
        onNavigationEvent = i11 % 128;
        if (i11 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i;
        int iHashCode2;
        int i2;
        int iHashCode3;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int iHashCode4 = Long.hashCode(this.amount);
        int iHashCode5 = this.amountText.hashCode();
        int iHashCode6 = this.approveNum.hashCode();
        int iHashCode7 = this.approveTs.hashCode();
        int iHashCode8 = Boolean.hashCode(this.canceled);
        int iHashCode9 = Long.hashCode(this.cardId);
        int iHashCode10 = Long.hashCode(this.cashbackAmount);
        String str = this.cashbackType;
        int iHashCode11 = str == null ? 0 : str.hashCode();
        int iHashCode12 = Boolean.hashCode(this.foreignApprove);
        int iHashCode13 = Long.hashCode(this.id);
        int iHashCode14 = this.oneRowType.hashCode();
        String str2 = this.subTitle;
        if (str2 == null) {
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
            int i6 = onNavigationEvent + 103;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        int iHashCode15 = this.summary.hashCode();
        String str3 = this.affiliatedStoreNum;
        if (str3 == null) {
            int i8 = IAuthTabCallback + 113;
            i = iHashCode15;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            iHashCode2 = 0;
        } else {
            i = iHashCode15;
            iHashCode2 = str3.hashCode();
        }
        Long l = this.approveAmount;
        if (l == null) {
            int i10 = onNavigationEvent + 25;
            i2 = iHashCode2;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            iHashCode3 = 0;
        } else {
            i2 = iHashCode2;
            iHashCode3 = l.hashCode();
        }
        Long l2 = this.cancelAmount;
        int iHashCode16 = l2 == null ? 0 : l2.hashCode();
        Long l3 = this.diffAmount;
        if (l3 != null) {
            int i12 = onNavigationEvent + 111;
            i3 = iHashCode16;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            int iHashCode17 = l3.hashCode();
            int i14 = IAuthTabCallback + 17;
            i4 = iHashCode17;
            onNavigationEvent = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 2 % 3;
            }
        } else {
            i3 = iHashCode16;
            i4 = 0;
        }
        return (((((((((((((((((((((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode) * 31) + i) * 31) + i2) * 31) + iHashCode3) * 31) + i3) * 31) + i4) * 31) + this.transactionStatus.hashCode()) * 31) + this.paymentMethod.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccCardTransaction(amount=" + this.amount + ", amountText=" + this.amountText + ", approveNum=" + this.approveNum + ", approveTs=" + this.approveTs + ", canceled=" + this.canceled + ", cardId=" + this.cardId + ", cashbackAmount=" + this.cashbackAmount + ", cashbackType=" + this.cashbackType + ", foreignApprove=" + this.foreignApprove + ", id=" + this.id + ", oneRowType=" + this.oneRowType + ", subTitle=" + this.subTitle + ", summary=" + this.summary + ", affiliatedStoreNum=" + this.affiliatedStoreNum + ", approveAmount=" + this.approveAmount + ", cancelAmount=" + this.cancelAmount + ", diffAmount=" + this.diffAmount + ", transactionStatus=" + this.transactionStatus + ", paymentMethod=" + this.paymentMethod + ")";
        int i2 = IAuthTabCallback + 91;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 32 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.amount);
        parcel.writeString(this.amountText);
        parcel.writeString(this.approveNum);
        parcel.writeString(this.approveTs);
        parcel.writeInt(this.canceled ? 1 : 0);
        parcel.writeLong(this.cardId);
        parcel.writeLong(this.cashbackAmount);
        parcel.writeString(this.cashbackType);
        parcel.writeInt(this.foreignApprove ? 1 : 0);
        parcel.writeLong(this.id);
        parcel.writeString(this.oneRowType);
        parcel.writeString(this.subTitle);
        parcel.writeString(this.summary);
        parcel.writeString(this.affiliatedStoreNum);
        Long l = this.approveAmount;
        if (l == null) {
            int i3 = onNavigationEvent + 7;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
            int i4 = onNavigationEvent + 49;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        Long l2 = this.cancelAmount;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.diffAmount;
        if (l3 == null) {
            int i6 = onNavigationEvent + 17;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
            int i7 = IAuthTabCallback + 113;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        }
        parcel.writeString(this.transactionStatus);
        parcel.writeString(this.paymentMethod);
    }

    public KitKatPurgeableDecoder(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, long j2, long j3, @Nullable String str4, boolean z2, long j4, @NotNull String str5, @Nullable String str6, @NotNull String str7, @Nullable String str8, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.amount = j;
        this.amountText = str;
        this.approveNum = str2;
        this.approveTs = str3;
        this.canceled = z;
        this.cardId = j2;
        this.cashbackAmount = j3;
        this.cashbackType = str4;
        this.foreignApprove = z2;
        this.id = j4;
        this.oneRowType = str5;
        this.subTitle = str6;
        this.summary = str7;
        this.affiliatedStoreNum = str8;
        this.approveAmount = l;
        this.cancelAmount = l2;
        this.diffAmount = l3;
        this.transactionStatus = str9;
        this.paymentMethod = str10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KitKatPurgeableDecoder(long j, String str, String str2, String str3, boolean z, long j2, long j3, String str4, boolean z2, long j4, String str5, String str6, String str7, String str8, Long l, Long l2, Long l3, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str11;
        boolean z3;
        String str12;
        boolean z4;
        String str13;
        String str14;
        String str15;
        String str16;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        Long l8;
        int i2;
        String str17;
        String str18;
        long j5 = (i & 1) != 0 ? 0L : j;
        String str19 = (i & 2) != 0 ? "" : str;
        Object obj = null;
        if ((i & 4) != 0) {
            int i3 = onNavigationEvent + 35;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str11 = "";
        } else {
            str11 = str2;
        }
        String str20 = (i & 8) != 0 ? "" : str3;
        if ((i & 16) != 0) {
            int i4 = onNavigationEvent + 73;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            z3 = false;
        } else {
            z3 = z;
        }
        long j6 = (i & 32) != 0 ? -1L : j2;
        long j7 = (i & 64) == 0 ? j3 : 0L;
        if ((i & 128) != 0) {
            int i7 = 2 % 2;
            str12 = null;
        } else {
            str12 = str4;
        }
        if ((i & 256) != 0) {
            int i8 = 2 % 2;
            z4 = false;
        } else {
            z4 = z2;
        }
        long j8 = (i & 512) != 0 ? -1L : j4;
        if ((i & 1024) != 0) {
            int i9 = onNavigationEvent + 123;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            str13 = "";
        } else {
            str13 = str5;
        }
        String str21 = (i & 2048) != 0 ? null : str6;
        String str22 = (i & 4096) != 0 ? "" : str7;
        if ((i & 8192) != 0) {
            int i10 = onNavigationEvent + 53;
            str14 = "";
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 95 / 0;
            }
            str15 = null;
        } else {
            str14 = "";
            str15 = str8;
        }
        if ((i & 16384) != 0) {
            int i12 = IAuthTabCallback + 33;
            str16 = str15;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 5 / 0;
            }
            l4 = null;
        } else {
            str16 = str15;
            l4 = l;
        }
        Long l9 = (32768 & i) != 0 ? null : l2;
        if ((i & 65536) != 0) {
            l6 = l9;
            int i14 = IAuthTabCallback + 67;
            l5 = l4;
            onNavigationEvent = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
            int i15 = 2 % 2;
            l7 = null;
        } else {
            l5 = l4;
            l6 = l9;
            l7 = l3;
        }
        if ((131072 & i) != 0) {
            int i16 = IAuthTabCallback + 57;
            l8 = l7;
            onNavigationEvent = i16 % 128;
            i2 = 2;
            int i17 = i16 % 2;
            str17 = str14;
        } else {
            l8 = l7;
            i2 = 2;
            str17 = str9;
        }
        if ((i & 262144) != 0) {
            int i18 = i2 % i2;
            str18 = str14;
        } else {
            str18 = str10;
        }
        this(j5, str19, str11, str20, z3, j6, j7, str12, z4, j8, str13, str21, str22, str16, l5, l6, l8, str17, str18);
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 25;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        long j = this.amount;
        int i5 = i2 + 67;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        KitKatPurgeableDecoder kitKatPurgeableDecoder = (KitKatPurgeableDecoder) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = kitKatPurgeableDecoder.amountText;
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            str = this.approveNum;
            int i4 = 51 / 0;
        } else {
            str = this.approveNum;
        }
        int i5 = i3 + 15;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 82 / 0;
        }
        return str;
    }

    public final boolean asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 101;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.canceled;
        int i5 = i2 + 107;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final long getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.cashbackAmount;
        int i4 = i3 + 121;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final boolean IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.foreignApprove;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        KitKatPurgeableDecoder kitKatPurgeableDecoder = (KitKatPurgeableDecoder) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = kitKatPurgeableDecoder.summary;
        int i5 = i3 + 77;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.affiliatedStoreNum;
        int i5 = i3 + 19;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Long l = this.approveAmount;
        int i5 = i3 + 53;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    public final Long asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Long l = this.cancelAmount;
        int i5 = i3 + 95;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return l;
        }
        throw null;
    }

    public final Long access100() {
        Long l;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 89;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            l = this.diffAmount;
            int i4 = 6 / 0;
        } else {
            l = this.diffAmount;
        }
        int i5 = i2 + 123;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        KitKatPurgeableDecoder kitKatPurgeableDecoder = (KitKatPurgeableDecoder) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = kitKatPurgeableDecoder.transactionStatus;
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    public final String access000() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            str = this.paymentMethod;
            int i4 = 60 / 0;
        } else {
            str = this.paymentMethod;
        }
        int i5 = i3 + 21;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Date onNavigationEvent() {
        Object date;
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            Object[] objArr = {CommonModule_closeView.onWarmupCompleted};
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            date = Result.constructor-impl(((IdGeneratorExternalSyntheticLambda1) CommonModule_closeView.onExtraCallbackWithResult(1967451170, _string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, -1967451168, _string.onNavigationEvent.IAuthTabCallback(), objArr, _string.onNavigationEvent.IAuthTabCallback())).parse(this.approveTs));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            date = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.exceptionOrNull-impl(date) != null) {
            date = new Date();
            int i2 = onNavigationEvent + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        Date date2 = (Date) date;
        int i4 = onNavigationEvent + 47;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return date2;
    }

    @Override // o.getOther
    public toASN1EncodableVector onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        toASN1EncodableVector toasn1encodablevector = toASN1EncodableVector.PLCC_CARD_TRANSACTION;
        if (i3 == 0) {
            return toasn1encodablevector;
        }
        throw null;
    }

    public CharSequence readTypedObject() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.summary;
        int i5 = i3 + 83;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String onMinimized() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.KitKatPurgeableDecoder.onNavigationEvent
            int r1 = r1 + 91
            int r2 = r1 % 128
            o.KitKatPurgeableDecoder.IAuthTabCallback = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1c
            java.lang.String r1 = r5.amountText
            int r3 = r1.length()
            r4 = 50
            int r4 = r4 / 0
            if (r3 > 0) goto L25
            goto L24
        L1c:
            java.lang.String r1 = r5.amountText
            int r3 = r1.length()
            if (r3 > 0) goto L25
        L24:
            r1 = r2
        L25:
            if (r1 != 0) goto L2e
            long r3 = r5.amount
            r1 = 1
            java.lang.String r1 = o.getLongName.onNavigationEvent(r3, r2, r1, r2)
        L2e:
            int r3 = o.KitKatPurgeableDecoder.onNavigationEvent
            int r3 = r3 + 83
            int r4 = r3 % 128
            o.KitKatPurgeableDecoder.IAuthTabCallback = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L3a
            return r1
        L3a:
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.KitKatPurgeableDecoder.onMinimized():java.lang.String");
    }

    public String extraCallbackWithResult() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(new IdGeneratorExternalSyntheticLambda1("HH:mm").format(onNavigationEvent()));
        String str = this.subTitle;
        if (str != null) {
            int i2 = IAuthTabCallback + 49;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0 ? (!StringsKt.isBlank(str)) : StringsKt.isBlank(str)) {
                sb.append(" ・ " + this.subTitle);
            }
        }
        String string = sb.toString();
        int i3 = onNavigationEvent + 13;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public String extraCallback() {
        int i = 2 % 2;
        long j = this.cashbackAmount;
        if (j <= 0) {
            int i2 = IAuthTabCallback + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return " ";
        }
        String str = "캐시백 " + getLongName.onNavigationEvent(j, (ParamImpl) null, 1, (Object) null);
        int i4 = onNavigationEvent + 1;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    @Override // o.KEKIdentifier
    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        String str = new IdGeneratorExternalSyntheticLambda1("yyyyMMdd").format(onNavigationEvent());
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i2 = onNavigationEvent + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        try {
            String str = new IdGeneratorExternalSyntheticLambda1("d").format(zzaj.onWarmupCompleted().onNavigationEvent(onNavigationEvent().getTime()).getTime()) + ". " + UserChoiceBillingListener.onExtraCallback.onExtraCallback().getResources().getStringArray(R.array.week_days_short)[r1.get(7) - 1];
            int i2 = onNavigationEvent + 63;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        } catch (ParseException unused) {
            return "";
        }
    }

    public final String onExtraCallbackWithResult() {
        return (String) onExtraCallbackWithResult(1068234498, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1068234498, new Object[]{this}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
    }

    public final String writeTypedObject() {
        return (String) onExtraCallbackWithResult(-55003368, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 55003370, new Object[]{this}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
    }

    public final String ICustomTabsCallback() {
        return (String) onExtraCallbackWithResult(1695089993, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1695089992, new Object[]{this}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
    }
}
