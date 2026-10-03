package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanComparisonDetailScreeningInfo$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanComparisonDetailScreeningInfo implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final long amount;
    private final String createdAt;
    private final float interestRate;
    private final Long refinancedAmount;
    private final Float refinancedInterestRate;
    private final long remainSeconds;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LoanComparisonDetailScreeningInfo> CREATOR = new onExtraCallbackWithResult();

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<LoanComparisonDetailScreeningInfo> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanComparisonDetailScreeningInfo createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(parcel);
            }
            onWarmupCompleted(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanComparisonDetailScreeningInfo[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 107;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            LoanComparisonDetailScreeningInfo[] loanComparisonDetailScreeningInfoArrOnNavigationEvent = onNavigationEvent(i);
            int i5 = onExtraCallback + 17;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return loanComparisonDetailScreeningInfoArrOnNavigationEvent;
            }
            throw null;
        }

        public final LoanComparisonDetailScreeningInfo[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 17;
            onNavigationEvent = i3 % 128;
            LoanComparisonDetailScreeningInfo[] loanComparisonDetailScreeningInfoArr = new LoanComparisonDetailScreeningInfo[i];
            if (i3 % 2 != 0) {
                return loanComparisonDetailScreeningInfoArr;
            }
            throw null;
        }

        public final LoanComparisonDetailScreeningInfo onWarmupCompleted(Parcel parcel) {
            Long l;
            Float f;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            float f2 = parcel.readFloat();
            long j = parcel.readLong();
            if (parcel.readInt() == 0) {
                int i2 = onNavigationEvent + 25;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                l = null;
            } else {
                Long lValueOf = Long.valueOf(parcel.readLong());
                int i4 = onExtraCallback + 121;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                l = lValueOf;
            }
            if (parcel.readInt() != 0) {
                Float fValueOf = Float.valueOf(parcel.readFloat());
                int i6 = onExtraCallback + 49;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                f = fValueOf;
            } else {
                f = null;
            }
            return new LoanComparisonDetailScreeningInfo(f2, j, l, f, parcel.readLong(), parcel.readString());
        }
    }

    static {
        int i = onExtraCallback + 111;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public LoanComparisonDetailScreeningInfo() {
        this(0.0f, 0L, (Long) null, (Float) null, 0L, (String) null, 63, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof LoanComparisonDetailScreeningInfo)) {
            return false;
        }
        LoanComparisonDetailScreeningInfo loanComparisonDetailScreeningInfo = (LoanComparisonDetailScreeningInfo) obj;
        if (Float.compare(this.interestRate, loanComparisonDetailScreeningInfo.interestRate) != 0) {
            return false;
        }
        if (this.amount != loanComparisonDetailScreeningInfo.amount) {
            int i3 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i3 % 128;
            return i3 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.refinancedAmount, loanComparisonDetailScreeningInfo.refinancedAmount)) {
            int i4 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.refinancedInterestRate, loanComparisonDetailScreeningInfo.refinancedInterestRate)) {
            int i6 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.remainSeconds == loanComparisonDetailScreeningInfo.remainSeconds) {
            return !(Intrinsics.areEqual(this.createdAt, loanComparisonDetailScreeningInfo.createdAt) ^ true);
        }
        int i8 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Float.hashCode(this.interestRate);
        int iHashCode3 = Long.hashCode(this.amount);
        Long l = this.refinancedAmount;
        int iHashCode4 = 0;
        if (l == null) {
            int i2 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
        }
        Float f = this.refinancedInterestRate;
        if (f != null) {
            int i4 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            iHashCode4 = f.hashCode();
        }
        return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode4) * 31) + Long.hashCode(this.remainSeconds)) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonDetailScreeningInfo(interestRate=" + this.interestRate + ", amount=" + this.amount + ", refinancedAmount=" + this.refinancedAmount + ", refinancedInterestRate=" + this.refinancedInterestRate + ", remainSeconds=" + this.remainSeconds + ", createdAt=" + this.createdAt + ")";
        int i2 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 34 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeFloat(this.interestRate);
        parcel.writeLong(this.amount);
        Long l = this.refinancedAmount;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Float f = this.refinancedInterestRate;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
            int i5 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }
        parcel.writeLong(this.remainSeconds);
        parcel.writeString(this.createdAt);
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanComparisonDetailScreeningInfo> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                LoanComparisonDetailScreeningInfo$.serializer serializerVar = LoanComparisonDetailScreeningInfo$.serializer.INSTANCE;
                throw null;
            }
            LoanComparisonDetailScreeningInfo$.serializer serializerVar2 = LoanComparisonDetailScreeningInfo$.serializer.INSTANCE;
            int i3 = onExtraCallbackWithResult + 29;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return serializerVar2;
            }
            obj.hashCode();
            throw null;
        }
    }

    public LoanComparisonDetailScreeningInfo(float f, long j, @Nullable Long l, @Nullable Float f2, long j2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.interestRate = f;
        this.amount = j;
        this.refinancedAmount = l;
        this.refinancedInterestRate = f2;
        this.remainSeconds = j2;
        this.createdAt = str;
    }

    public /* synthetic */ LoanComparisonDetailScreeningInfo(int i, float f, long j, Long l, Float f2, long j2, String str, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i2 = 2 % 2;
            f = 0.0f;
        }
        this.interestRate = f;
        if ((i & 2) == 0) {
            int i3 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            this.amount = 0L;
        } else {
            this.amount = j;
            int i5 = 2 % 2;
        }
        if ((i & 4) == 0) {
            this.refinancedAmount = null;
        } else {
            this.refinancedAmount = l;
            int i6 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        }
        if ((i & 8) == 0) {
            this.refinancedInterestRate = null;
        } else {
            this.refinancedInterestRate = f2;
        }
        if ((i & 16) == 0) {
            int i9 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            this.remainSeconds = 0L;
        } else {
            this.remainSeconds = j2;
        }
        if ((i & 32) != 0) {
            this.createdAt = str;
            return;
        }
        this.createdAt = "";
        int i11 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.loan.LoanComparisonDetailScreeningInfo r7, o.vyl r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.LoanComparisonDetailScreeningInfo.IAuthTabCallback
            int r1 = r1 + 87
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanComparisonDetailScreeningInfo.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r1 = 0
            boolean r2 = r8.onWarmupCompleted(r9, r1)
            if (r2 != 0) goto L1c
            float r2 = r7.interestRate
            r3 = 0
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 == 0) goto L21
        L1c:
            float r2 = r7.interestRate
            r8.onExtraCallback(r9, r1, r2)
        L21:
            r1 = 1
            boolean r2 = r8.onWarmupCompleted(r9, r1)
            r3 = 0
            if (r2 != 0) goto L30
            long r5 = r7.amount
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L3e
        L30:
            long r5 = r7.amount
            r8.onExtraCallback(r9, r1, r5)
            int r1 = viva.republica.toss.network.model.loan.LoanComparisonDetailScreeningInfo.onExtraCallbackWithResult
            int r1 = r1 + 31
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanComparisonDetailScreeningInfo.IAuthTabCallback = r2
            int r1 = r1 % r0
        L3e:
            boolean r1 = r8.onWarmupCompleted(r9, r0)
            if (r1 != 0) goto L48
            java.lang.Long r1 = r7.refinancedAmount
            if (r1 == 0) goto L4f
        L48:
            o.oty1 r1 = o.oty1.onExtraCallback
            java.lang.Long r2 = r7.refinancedAmount
            r8.onExtraCallbackWithResult(r9, r0, r1, r2)
        L4f:
            r1 = 3
            boolean r2 = r8.onWarmupCompleted(r9, r1)
            if (r2 != 0) goto L5a
            java.lang.Float r2 = r7.refinancedInterestRate
            if (r2 == 0) goto L61
        L5a:
            o.dj3 r2 = o.dj3.onWarmupCompleted
            java.lang.Float r5 = r7.refinancedInterestRate
            r8.onExtraCallbackWithResult(r9, r1, r2, r5)
        L61:
            r1 = 4
            boolean r2 = r8.onWarmupCompleted(r9, r1)
            if (r2 != 0) goto L77
            int r2 = viva.republica.toss.network.model.loan.LoanComparisonDetailScreeningInfo.onExtraCallbackWithResult
            int r2 = r2 + 17
            int r5 = r2 % 128
            viva.republica.toss.network.model.loan.LoanComparisonDetailScreeningInfo.IAuthTabCallback = r5
            int r2 = r2 % r0
            long r5 = r7.remainSeconds
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L7c
        L77:
            long r2 = r7.remainSeconds
            r8.onExtraCallback(r9, r1, r2)
        L7c:
            r0 = 5
            boolean r1 = r8.onWarmupCompleted(r9, r0)
            if (r1 != 0) goto L8d
            java.lang.String r1 = r7.createdAt
            java.lang.String r2 = ""
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L92
        L8d:
            java.lang.String r7 = r7.createdAt
            r8.onExtraCallback(r9, r0, r7)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonDetailScreeningInfo.onNavigationEvent(viva.republica.toss.network.model.loan.LoanComparisonDetailScreeningInfo, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanComparisonDetailScreeningInfo(float f, long j, Long l, Float f2, long j2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        float f3;
        long j3;
        Long l2;
        String str2;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            f3 = 0.0f;
        } else {
            f3 = f;
        }
        long j4 = 0;
        if ((i & 2) != 0) {
            int i3 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            j3 = 0;
        } else {
            j3 = j;
        }
        Float f4 = null;
        if ((i & 4) != 0) {
            int i5 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            l2 = null;
        } else {
            l2 = l;
        }
        if ((i & 8) != 0) {
            int i7 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 95 / 0;
            }
            int i9 = 2 % 2;
        } else {
            f4 = f2;
        }
        if ((i & 16) != 0) {
            int i10 = IAuthTabCallback + 61;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
        } else {
            j4 = j2;
        }
        if ((i & 32) != 0) {
            int i12 = 2 % 2;
            str2 = "";
        } else {
            str2 = str;
        }
        this(f3, j3, l2, f4, j4, str2);
    }

    public final float onExtraCallback() {
        float f;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            f = this.interestRate;
            int i4 = 54 / 0;
        } else {
            f = this.interestRate;
        }
        int i5 = i3 + 27;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.amount;
        }
        int i3 = 1 / 0;
        return this.amount;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        String str = new DecimalFormat("#.####", DecimalFormatSymbols.getInstance(Locale.ENGLISH)).format(Float.valueOf(this.interestRate)) + " %";
        int i2 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
