package viva.republica.toss.network.model.loan;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.AutomobileInputAdvantages$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AutomobileInputAdvantages {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final int approvalRate;
    private final int completeNumber;
    private final long limitAmount;

    static {
        int i = IAuthTabCallback + 111;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 24 / 0;
        }
    }

    public AutomobileInputAdvantages() {
        this(0, 0L, 0, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 95;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutomobileInputAdvantages)) {
            return false;
        }
        AutomobileInputAdvantages automobileInputAdvantages = (AutomobileInputAdvantages) obj;
        if (this.completeNumber != automobileInputAdvantages.completeNumber) {
            return false;
        }
        if (this.limitAmount == automobileInputAdvantages.limitAmount) {
            return this.approvalRate == automobileInputAdvantages.approvalRate;
        }
        int i4 = i2 + 53;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onExtraCallback = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((Integer.hashCode(this.completeNumber) >> 42) >> Long.hashCode(this.limitAmount)) << 60) >>> Integer.hashCode(this.approvalRate) : (((Integer.hashCode(this.completeNumber) * 31) + Long.hashCode(this.limitAmount)) * 31) + Integer.hashCode(this.approvalRate);
        int i3 = onExtraCallback + 97;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AutomobileInputAdvantages(completeNumber=" + this.completeNumber + ", limitAmount=" + this.limitAmount + ", approvalRate=" + this.approvalRate + ")";
        int i2 = onExtraCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AutomobileInputAdvantages> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AutomobileInputAdvantages$.serializer serializerVar = AutomobileInputAdvantages$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 71;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ AutomobileInputAdvantages(int i, int i2, long j, int i3, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.completeNumber = 0;
            int i4 = 2 % 2;
        } else {
            this.completeNumber = i2;
        }
        if ((i & 2) == 0) {
            int i5 = onExtraCallbackWithResult + 27;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            this.limitAmount = 0L;
        } else {
            this.limitAmount = j;
            int i7 = 2 % 2;
        }
        if ((i & 4) != 0) {
            this.approvalRate = i3;
            return;
        }
        int i8 = onExtraCallbackWithResult + 85;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            this.approvalRate = 1;
        } else {
            this.approvalRate = 0;
        }
    }

    public AutomobileInputAdvantages(int i, long j, int i2) {
        this.completeNumber = i;
        this.limitAmount = j;
        this.approvalRate = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.loan.AutomobileInputAdvantages r7, o.vyl r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r8.onWarmupCompleted(r9, r1)
            if (r2 != 0) goto Le
            int r2 = r7.completeNumber
            if (r2 == 0) goto L13
        Le:
            int r2 = r7.completeNumber
            r8.onExtraCallback(r9, r1, r2)
        L13:
            r2 = 1
            boolean r3 = r8.onWarmupCompleted(r9, r2)
            if (r3 != 0) goto L2b
            int r3 = viva.republica.toss.network.model.loan.AutomobileInputAdvantages.onExtraCallbackWithResult
            int r3 = r3 + 41
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.AutomobileInputAdvantages.onExtraCallback = r4
            int r3 = r3 % r0
            long r3 = r7.limitAmount
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L30
        L2b:
            long r3 = r7.limitAmount
            r8.onExtraCallback(r9, r2, r3)
        L30:
            boolean r2 = r8.onWarmupCompleted(r9, r0)
            if (r2 != 0) goto L3a
            int r2 = r7.approvalRate
            if (r2 == 0) goto L3f
        L3a:
            int r7 = r7.approvalRate
            r8.onExtraCallback(r9, r0, r7)
        L3f:
            int r7 = viva.republica.toss.network.model.loan.AutomobileInputAdvantages.onExtraCallbackWithResult
            int r7 = r7 + 101
            int r8 = r7 % 128
            viva.republica.toss.network.model.loan.AutomobileInputAdvantages.onExtraCallback = r8
            int r7 = r7 % r0
            if (r7 != 0) goto L4d
            r7 = 82
            int r7 = r7 / r1
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.AutomobileInputAdvantages.IAuthTabCallback(viva.republica.toss.network.model.loan.AutomobileInputAdvantages, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AutomobileInputAdvantages(int i, long j, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 1) != 0) {
            int i4 = onExtraCallback + 73;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            i = 0;
        }
        if ((i3 & 2) != 0) {
            int i7 = onExtraCallback + 7;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            j = 0;
        }
        if ((i3 & 4) != 0) {
            int i9 = onExtraCallbackWithResult + 79;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            i2 = 0;
        }
        this(i, j, i2);
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = this.completeNumber;
        int i6 = i3 + 103;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onNavigationEvent() {
        long j;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 77;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            j = this.limitAmount;
            int i4 = 3 / 0;
        } else {
            j = this.limitAmount;
        }
        int i5 = i2 + 73;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = this.approvalRate;
        int i6 = i3 + 3;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r1 = r1 + 73;
        viva.republica.toss.network.model.loan.AutomobileInputAdvantages.onExtraCallbackWithResult = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r6.approvalRate > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r6.approvalRate > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r3 = r3 + 1;
        viva.republica.toss.network.model.loan.AutomobileInputAdvantages.onExtraCallback = r3 % 128;
        r3 = r3 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean IAuthTabCallback() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.AutomobileInputAdvantages.onExtraCallback
            int r2 = r1 + 81
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.AutomobileInputAdvantages.onExtraCallbackWithResult = r3
            int r2 = r2 % r0
            r4 = 0
            if (r2 == 0) goto L17
            int r2 = r6.approvalRate
            r5 = 63
            int r5 = r5 / r4
            if (r2 <= 0) goto L23
            goto L1b
        L17:
            int r2 = r6.approvalRate
            if (r2 <= 0) goto L23
        L1b:
            r1 = 1
            int r3 = r3 + r1
            int r2 = r3 % 128
            viva.republica.toss.network.model.loan.AutomobileInputAdvantages.onExtraCallback = r2
            int r3 = r3 % r0
            return r1
        L23:
            int r1 = r1 + 73
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.AutomobileInputAdvantages.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.AutomobileInputAdvantages.IAuthTabCallback():boolean");
    }
}
