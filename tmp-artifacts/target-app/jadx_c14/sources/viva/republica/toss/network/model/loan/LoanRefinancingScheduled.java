package viva.republica.toss.network.model.loan;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanRefinancingScheduled$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanRefinancingScheduled {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private final String message;
    private final boolean scheduled;

    static {
        int i = onNavigationEvent + 121;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 54 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LoanRefinancingScheduled() {
        String str = null;
        this(false, str, 3, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 39;
            onExtraCallbackWithResult = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!(obj instanceof LoanRefinancingScheduled)) {
            return false;
        }
        LoanRefinancingScheduled loanRefinancingScheduled = (LoanRefinancingScheduled) obj;
        if (this.scheduled != loanRefinancingScheduled.scheduled) {
            return false;
        }
        if (Intrinsics.areEqual(this.message, loanRefinancingScheduled.message)) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 121;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onExtraCallback = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (Boolean.hashCode(this.scheduled) + 90) << this.message.hashCode() : (Boolean.hashCode(this.scheduled) * 31) + this.message.hashCode();
        int i3 = onExtraCallbackWithResult + 121;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 2 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanRefinancingScheduled(scheduled=" + this.scheduled + ", message=" + this.message + ")";
        int i2 = onExtraCallbackWithResult + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanRefinancingScheduled> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            LoanRefinancingScheduled$.serializer serializerVar = LoanRefinancingScheduled$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 91;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ LoanRefinancingScheduled(int i, boolean z, String str, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i2 = onExtraCallback + 23;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            z = false;
        }
        this.scheduled = z;
        if ((i & 2) != 0) {
            this.message = str;
            return;
        }
        int i4 = onExtraCallback + 119;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        this.message = "";
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LoanRefinancingScheduled(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.scheduled = z;
        this.message = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.loan.LoanRefinancingScheduled r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.LoanRefinancingScheduled.onExtraCallback
            int r1 = r1 + 43
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingScheduled.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L17
            boolean r1 = r5.onWarmupCompleted(r6, r3)
            if (r1 != 0) goto L22
            goto L1d
        L17:
            boolean r1 = r5.onWarmupCompleted(r6, r2)
            if (r1 != 0) goto L22
        L1d:
            boolean r1 = r4.scheduled
            r1 = r1 ^ r3
            if (r1 == r3) goto L30
        L22:
            boolean r1 = r4.scheduled
            r5.onNavigationEvent(r6, r2, r1)
            int r1 = viva.republica.toss.network.model.loan.LoanRefinancingScheduled.onExtraCallbackWithResult
            int r1 = r1 + 125
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingScheduled.onExtraCallback = r2
            int r1 = r1 % r0
        L30:
            boolean r1 = r5.onWarmupCompleted(r6, r3)
            if (r1 != 0) goto L4a
            int r1 = viva.republica.toss.network.model.loan.LoanRefinancingScheduled.onExtraCallbackWithResult
            int r1 = r1 + 25
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingScheduled.onExtraCallback = r2
            int r1 = r1 % r0
            java.lang.String r0 = r4.message
            java.lang.String r1 = ""
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L4a
            goto L4f
        L4a:
            java.lang.String r4 = r4.message
            r5.onExtraCallback(r6, r3, r4)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanRefinancingScheduled.onExtraCallbackWithResult(viva.republica.toss.network.model.loan.LoanRefinancingScheduled, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanRefinancingScheduled(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 39;
            onExtraCallbackWithResult = i2 % 128;
            z = i2 % 2 == 0;
            int i3 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallback + 103;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            str = "";
        }
        this(z, str);
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 61;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.scheduled;
        int i5 = i2 + 113;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.message;
        int i5 = i3 + 97;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
