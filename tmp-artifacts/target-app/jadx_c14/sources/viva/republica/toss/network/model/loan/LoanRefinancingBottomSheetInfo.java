package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanRefinancingBottomSheetInfo implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String body;
    private final String header;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LoanRefinancingBottomSheetInfo> CREATOR = new IAuthTabCallback();

    public static final class IAuthTabCallback implements Parcelable.Creator<LoanRefinancingBottomSheetInfo> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final LoanRefinancingBottomSheetInfo[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 107;
            onWarmupCompleted = i3 % 128;
            LoanRefinancingBottomSheetInfo[] loanRefinancingBottomSheetInfoArr = new LoanRefinancingBottomSheetInfo[i];
            if (i3 % 2 == 0) {
                return loanRefinancingBottomSheetInfoArr;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanRefinancingBottomSheetInfo createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(parcel);
            }
            onExtraCallbackWithResult(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanRefinancingBottomSheetInfo[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 11;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            LoanRefinancingBottomSheetInfo[] loanRefinancingBottomSheetInfoArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onNavigationEvent + 79;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return loanRefinancingBottomSheetInfoArrIAuthTabCallback;
        }

        public final LoanRefinancingBottomSheetInfo onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            LoanRefinancingBottomSheetInfo loanRefinancingBottomSheetInfo = new LoanRefinancingBottomSheetInfo(parcel.readString(), parcel.readString());
            int i2 = onNavigationEvent + 77;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return loanRefinancingBottomSheetInfo;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LoanRefinancingBottomSheetInfo() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 57;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof LoanRefinancingBottomSheetInfo)) {
            return false;
        }
        LoanRefinancingBottomSheetInfo loanRefinancingBottomSheetInfo = (LoanRefinancingBottomSheetInfo) obj;
        if (!Intrinsics.areEqual(this.header, loanRefinancingBottomSheetInfo.header)) {
            return false;
        }
        if (Intrinsics.areEqual(this.body, loanRefinancingBottomSheetInfo.body)) {
            return true;
        }
        int i3 = onWarmupCompleted + 81;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.header.hashCode() / 124) >>> this.body.hashCode() : (this.header.hashCode() * 31) + this.body.hashCode();
        int i3 = onNavigationEvent + 123;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanRefinancingBottomSheetInfo(header=" + this.header + ", body=" + this.body + ")";
        int i2 = onWarmupCompleted + 69;
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
        int i3 = onWarmupCompleted + 119;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.header);
        parcel.writeString(this.body);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanRefinancingBottomSheetInfo> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            LoanRefinancingBottomSheetInfo$$serializer loanRefinancingBottomSheetInfo$$serializer = LoanRefinancingBottomSheetInfo$$serializer.INSTANCE;
            int i4 = onExtraCallback + 113;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return loanRefinancingBottomSheetInfo$$serializer;
        }
    }

    public /* synthetic */ LoanRefinancingBottomSheetInfo(int i, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.header = "";
        } else {
            this.header = str;
            int i2 = 2 % 2;
        }
        if ((i & 2) == 0) {
            int i3 = onWarmupCompleted + 55;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            this.body = "";
            return;
        }
        this.body = str2;
        int i5 = onWarmupCompleted + 81;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public LoanRefinancingBottomSheetInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.header = str;
        this.body = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r7.onWarmupCompleted(r8, r1)
            java.lang.String r3 = ""
            if (r2 != 0) goto L14
            java.lang.String r2 = r6.header
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L19
        L14:
            java.lang.String r2 = r6.header
            r7.onExtraCallback(r8, r1, r2)
        L19:
            r2 = 1
            boolean r4 = r7.onWarmupCompleted(r8, r2)
            if (r4 != 0) goto L32
            int r4 = viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo.onWarmupCompleted
            int r4 = r4 + 55
            int r5 = r4 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo.onNavigationEvent = r5
            int r4 = r4 % r0
            java.lang.String r4 = r6.body
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r3)
            if (r3 == 0) goto L32
            goto L37
        L32:
            java.lang.String r6 = r6.body
            r7.onExtraCallback(r8, r2, r6)
        L37:
            int r6 = viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo.onWarmupCompleted
            int r6 = r6 + 69
            int r7 = r6 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo.onNavigationEvent = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L45
            r6 = 94
            int r6 = r6 / r1
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo.onWarmupCompleted(viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanRefinancingBottomSheetInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 61;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 33 / 0;
            }
            int i5 = i2 + 31;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i7 = onNavigationEvent + 21;
            int i8 = i7 % 128;
            onWarmupCompleted = i8;
            if (i7 % 2 == 0) {
                throw null;
            }
            int i9 = i8 + 85;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            str2 = "";
        }
        this(str, str2);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 35;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.header;
        int i5 = i2 + 81;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 35 / 0;
        }
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.body;
        int i5 = i3 + 5;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
