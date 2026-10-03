package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.htf31;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanRefinancingStatus$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanRefinancingStatus implements Parcelable {
    public static final Parcelable.Creator<LoanRefinancingStatus> CREATOR = new onWarmupCompleted();
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final long groupId;
    private final String status;

    public static final class onWarmupCompleted implements Parcelable.Creator<LoanRefinancingStatus> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanRefinancingStatus createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallback(parcel);
            }
            onExtraCallback(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanRefinancingStatus[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 113;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            LoanRefinancingStatus[] loanRefinancingStatusArrOnWarmupCompleted = onWarmupCompleted(i);
            if (i4 == 0) {
                int i5 = 53 / 0;
            }
            return loanRefinancingStatusArrOnWarmupCompleted;
        }

        public final LoanRefinancingStatus onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            LoanRefinancingStatus loanRefinancingStatus = new LoanRefinancingStatus(parcel.readLong(), parcel.readString());
            int i2 = onExtraCallback + 47;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return loanRefinancingStatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final LoanRefinancingStatus[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 103;
            onExtraCallbackWithResult = i4 % 128;
            LoanRefinancingStatus[] loanRefinancingStatusArr = new LoanRefinancingStatus[i];
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 21;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return loanRefinancingStatusArr;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onNavigationEvent + 101;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof LoanRefinancingStatus)) {
            int i4 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        LoanRefinancingStatus loanRefinancingStatus = (LoanRefinancingStatus) obj;
        if (this.groupId != loanRefinancingStatus.groupId) {
            return false;
        }
        if (Intrinsics.areEqual(this.status, loanRefinancingStatus.status)) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Long.hashCode(this.groupId) * 31) + this.status.hashCode();
        int i4 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanRefinancingStatus(groupId=" + this.groupId + ", status=" + this.status + ")";
        int i2 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 == 0) {
            parcel.writeLong(this.groupId);
            parcel.writeString(this.status);
        } else {
            parcel.writeLong(this.groupId);
            parcel.writeString(this.status);
            throw null;
        }
    }

    public static final class Companion {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanRefinancingStatus> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            LoanRefinancingStatus$.serializer serializerVar = LoanRefinancingStatus$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 31;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ LoanRefinancingStatus(int i, long j, String str, okycx okycxVar) {
        if (2 != (i & 2)) {
            htf31.onExtraCallbackWithResult(i, 2, LoanRefinancingStatus$.serializer.INSTANCE.getDescriptor());
            int i2 = 2 % 2;
        }
        if ((i & 1) == 0) {
            this.groupId = 0L;
            int i3 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } else {
            this.groupId = j;
        }
        this.status = str;
        int i6 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 11 / 0;
        }
    }

    public LoanRefinancingStatus(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.groupId = j;
        this.status = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.loan.LoanRefinancingStatus r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.LoanRefinancingStatus.IAuthTabCallback
            int r1 = r1 + 39
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingStatus.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r1 = 0
            boolean r2 = r7.onWarmupCompleted(r8, r1)
            if (r2 != 0) goto L24
            int r2 = viva.republica.toss.network.model.loan.LoanRefinancingStatus.IAuthTabCallback
            int r2 = r2 + 39
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingStatus.onExtraCallbackWithResult = r3
            int r2 = r2 % r0
            long r2 = r6.groupId
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L29
        L24:
            long r2 = r6.groupId
            r7.onExtraCallback(r8, r1, r2)
        L29:
            r1 = 1
            java.lang.String r6 = r6.status
            r7.onExtraCallback(r8, r1, r6)
            int r6 = viva.republica.toss.network.model.loan.LoanRefinancingStatus.onExtraCallbackWithResult
            int r6 = r6 + 21
            int r7 = r6 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingStatus.IAuthTabCallback = r7
            int r6 = r6 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanRefinancingStatus.IAuthTabCallback(viva.republica.toss.network.model.loan.LoanRefinancingStatus, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.groupId;
        int i5 = i2 + 73;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final RefinancingStatus onExtraCallback() {
        int i = 2 % 2;
        String str = this.status;
        switch (str.hashCode()) {
            case -1922596236:
                if (str.equals("REFINANCING_CHECK_DONE")) {
                    return RefinancingStatus.REFINANCING_CHECK_DONE;
                }
                break;
            case -975821154:
                if (str.equals("REFINANCING_PRE_SCREEN_DONE")) {
                    RefinancingStatus refinancingStatus = RefinancingStatus.REFINANCING_PRE_SCREEN_DONE;
                    int i2 = IAuthTabCallback + 29;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    return refinancingStatus;
                }
                break;
            case -901713595:
                if (str.equals("REFINANCING_CHECK_PENDING")) {
                    return RefinancingStatus.REFINANCING_CHECK_PENDING;
                }
                break;
            case -617373622:
                if (!(!str.equals("REFINANCING_SYSTEM_IMPOSSIBLE"))) {
                    int i4 = onExtraCallbackWithResult + 41;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        return RefinancingStatus.REFINANCING_SYSTEM_IMPOSSIBLE;
                    }
                    RefinancingStatus refinancingStatus2 = RefinancingStatus.REFINANCING_SYSTEM_IMPOSSIBLE;
                    throw null;
                }
                break;
            case 443759744:
                if (str.equals("REFINANCING_PRE_SCREEN_LOADING")) {
                    int i5 = onExtraCallbackWithResult + 121;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        return RefinancingStatus.REFINANCING_PRE_SCREEN_LOADING;
                    }
                    RefinancingStatus refinancingStatus3 = RefinancingStatus.REFINANCING_PRE_SCREEN_LOADING;
                    throw null;
                }
                break;
        }
        RefinancingStatus refinancingStatus4 = RefinancingStatus.INIT;
        int i6 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 11 / 0;
        }
        return refinancingStatus4;
    }
}
