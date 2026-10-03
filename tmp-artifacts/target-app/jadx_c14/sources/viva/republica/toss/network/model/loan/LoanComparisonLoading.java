package viva.republica.toss.network.model.loan;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanComparisonLoading$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanComparisonLoading {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final LoanComparisonLoadingGroup items;
    private final boolean preScreenComplete;
    private final int preScreenDoneBankCount;
    private final long preScreenElapsedMilliSeconds;
    private final int totalBankCount;

    static {
        int i = onNavigationEvent + 49;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public LoanComparisonLoading() {
        this(false, 0L, 0, 0, (LoanComparisonLoadingGroup) null, 31, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanComparisonLoading)) {
            int i2 = onExtraCallback + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        LoanComparisonLoading loanComparisonLoading = (LoanComparisonLoading) obj;
        if (this.preScreenComplete != loanComparisonLoading.preScreenComplete) {
            return false;
        }
        if (this.preScreenElapsedMilliSeconds != loanComparisonLoading.preScreenElapsedMilliSeconds) {
            int i4 = onWarmupCompleted + 95;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.totalBankCount != loanComparisonLoading.totalBankCount || this.preScreenDoneBankCount != loanComparisonLoading.preScreenDoneBankCount) {
            return false;
        }
        if (Intrinsics.areEqual(this.items, loanComparisonLoading.items)) {
            return true;
        }
        int i6 = onExtraCallback + 19;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((Boolean.hashCode(this.preScreenComplete) * 31) + Long.hashCode(this.preScreenElapsedMilliSeconds)) * 31) + Integer.hashCode(this.totalBankCount)) * 31) + Integer.hashCode(this.preScreenDoneBankCount)) * 31) + this.items.hashCode();
        int i4 = onWarmupCompleted + 99;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonLoading(preScreenComplete=" + this.preScreenComplete + ", preScreenElapsedMilliSeconds=" + this.preScreenElapsedMilliSeconds + ", totalBankCount=" + this.totalBankCount + ", preScreenDoneBankCount=" + this.preScreenDoneBankCount + ", items=" + this.items + ")";
        int i2 = onExtraCallback + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanComparisonLoading> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            LoanComparisonLoading$.serializer serializerVar = LoanComparisonLoading$.serializer.INSTANCE;
            int i4 = onExtraCallback + 61;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ LoanComparisonLoading(int r3, boolean r4, long r5, int r7, int r8, viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup r9, o.okycx r10) {
        /*
            r2 = this;
            r2.<init>()
            r10 = r3 & 1
            r0 = 0
            r1 = 2
            if (r10 != 0) goto L1a
            r2.preScreenComplete = r0
            int r4 = viva.republica.toss.network.model.loan.LoanComparisonLoading.onExtraCallback
            int r4 = r4 + 29
            int r10 = r4 % 128
            viva.republica.toss.network.model.loan.LoanComparisonLoading.onWarmupCompleted = r10
            int r4 = r4 % r1
            if (r4 == 0) goto L1c
            r4 = 3
            int r4 = r4 / 4
            goto L1e
        L1a:
            r2.preScreenComplete = r4
        L1c:
            int r4 = r1 % r1
        L1e:
            r4 = r3 & 2
            if (r4 != 0) goto L30
            int r4 = viva.republica.toss.network.model.loan.LoanComparisonLoading.onExtraCallback
            int r4 = r4 + 89
            int r5 = r4 % 128
            viva.republica.toss.network.model.loan.LoanComparisonLoading.onWarmupCompleted = r5
            int r4 = r4 % r1
            r4 = 0
            r2.preScreenElapsedMilliSeconds = r4
            goto L34
        L30:
            r2.preScreenElapsedMilliSeconds = r5
            int r4 = r1 % r1
        L34:
            r4 = r3 & 4
            if (r4 != 0) goto L46
            int r4 = viva.republica.toss.network.model.loan.LoanComparisonLoading.onExtraCallback
            int r4 = r4 + 27
            int r5 = r4 % 128
            viva.republica.toss.network.model.loan.LoanComparisonLoading.onWarmupCompleted = r5
            int r4 = r4 % r1
            r2.totalBankCount = r0
            int r4 = r1 % r1
            goto L48
        L46:
            r2.totalBankCount = r7
        L48:
            r4 = r3 & 8
            if (r4 != 0) goto L50
            r2.preScreenDoneBankCount = r0
            int r1 = r1 % r1
            goto L52
        L50:
            r2.preScreenDoneBankCount = r8
        L52:
            r3 = r3 & 16
            if (r3 != 0) goto L64
            viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup r3 = new viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 7
            r9 = 0
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            r2.items = r3
            return
        L64:
            r2.items = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonLoading.<init>(int, boolean, long, int, int, viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup, o.okycx):void");
    }

    public LoanComparisonLoading(boolean z, long j, int i, int i2, @NotNull LoanComparisonLoadingGroup loanComparisonLoadingGroup) {
        Intrinsics.checkNotNullParameter(loanComparisonLoadingGroup, "");
        this.preScreenComplete = z;
        this.preScreenElapsedMilliSeconds = j;
        this.totalBankCount = i;
        this.preScreenDoneBankCount = i2;
        this.items = loanComparisonLoadingGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.loan.LoanComparisonLoading r11, o.vyl r12, kotlinx.serialization.descriptors.SerialDescriptor r13) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.LoanComparisonLoading.onExtraCallback
            int r1 = r1 + 113
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanComparisonLoading.onWarmupCompleted = r2
            int r1 = r1 % r0
            r1 = 0
            boolean r2 = r12.onWarmupCompleted(r13, r1)
            r3 = 1
            if (r2 != 0) goto L19
            boolean r2 = r11.preScreenComplete
            r2 = r2 ^ r3
            if (r2 == r3) goto L1e
        L19:
            boolean r2 = r11.preScreenComplete
            r12.onNavigationEvent(r13, r1, r2)
        L1e:
            boolean r2 = r12.onWarmupCompleted(r13, r3)
            if (r2 != 0) goto L2c
            long r4 = r11.preScreenElapsedMilliSeconds
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L31
        L2c:
            long r4 = r11.preScreenElapsedMilliSeconds
            r12.onExtraCallback(r13, r3, r4)
        L31:
            boolean r2 = r12.onWarmupCompleted(r13, r0)
            if (r2 != 0) goto L3b
            int r2 = r11.totalBankCount
            if (r2 == 0) goto L49
        L3b:
            int r2 = r11.totalBankCount
            r12.onExtraCallback(r13, r0, r2)
            int r2 = viva.republica.toss.network.model.loan.LoanComparisonLoading.onWarmupCompleted
            int r2 = r2 + 73
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanComparisonLoading.onExtraCallback = r3
            int r2 = r2 % r0
        L49:
            r2 = 3
            boolean r3 = r12.onWarmupCompleted(r13, r2)
            if (r3 != 0) goto L67
            int r3 = viva.republica.toss.network.model.loan.LoanComparisonLoading.onExtraCallback
            int r3 = r3 + 63
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.LoanComparisonLoading.onWarmupCompleted = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L63
            int r3 = r11.preScreenDoneBankCount
            r4 = 55
            int r4 = r4 / r1
            if (r3 == 0) goto L6c
            goto L67
        L63:
            int r3 = r11.preScreenDoneBankCount
            if (r3 == 0) goto L6c
        L67:
            int r3 = r11.preScreenDoneBankCount
            r12.onExtraCallback(r13, r2, r3)
        L6c:
            r2 = 4
            boolean r3 = r12.onWarmupCompleted(r13, r2)
            if (r3 != 0) goto L86
            viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup r3 = r11.items
            viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup r10 = new viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 7
            r9 = 0
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r10)
            if (r3 != 0) goto L8d
        L86:
            viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup$$serializer r3 = viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup$.serializer.INSTANCE
            viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup r11 = r11.items
            r12.onNavigationEvent(r13, r2, r3, r11)
        L8d:
            int r11 = viva.republica.toss.network.model.loan.LoanComparisonLoading.onExtraCallback
            int r11 = r11 + 47
            int r12 = r11 % 128
            viva.republica.toss.network.model.loan.LoanComparisonLoading.onWarmupCompleted = r12
            int r11 = r11 % r0
            if (r11 == 0) goto L9b
            r11 = 43
            int r11 = r11 / r1
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonLoading.onExtraCallback(viva.republica.toss.network.model.loan.LoanComparisonLoading, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public /* synthetic */ LoanComparisonLoading(boolean z, long j, int i, int i2, LoanComparisonLoadingGroup loanComparisonLoadingGroup, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        int i4;
        LoanComparisonLoadingGroup loanComparisonLoadingGroup2;
        int i5 = 0;
        boolean z2 = (i3 & 1) != 0 ? false : z;
        if ((i3 & 2) != 0) {
            int i6 = onWarmupCompleted + 29;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            j = 0;
        }
        long j2 = j;
        if ((i3 & 4) != 0) {
            int i8 = 2 % 2;
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i3 & 8) != 0) {
            int i9 = onWarmupCompleted + 51;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
        } else {
            i5 = i2;
        }
        if ((i3 & 16) != 0) {
            int i12 = 2 % 2;
            loanComparisonLoadingGroup2 = new LoanComparisonLoadingGroup((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
        } else {
            loanComparisonLoadingGroup2 = loanComparisonLoadingGroup;
        }
        this(z2, j2, i4, i5, loanComparisonLoadingGroup2);
    }

    public final boolean IAuthTabCallback() {
        boolean z;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 125;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.preScreenComplete;
            int i4 = 56 / 0;
        } else {
            z = this.preScreenComplete;
        }
        int i5 = i2 + 63;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
        return z;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 93;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = this.preScreenElapsedMilliSeconds;
        int i4 = i2 + 79;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = this.totalBankCount;
        int i6 = i3 + 47;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.preScreenDoneBankCount;
        int i5 = i3 + 39;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final LoanComparisonLoadingGroup onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        LoanComparisonLoadingGroup loanComparisonLoadingGroup = this.items;
        int i5 = i3 + 97;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return loanComparisonLoadingGroup;
        }
        throw null;
    }
}
