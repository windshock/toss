package viva.republica.toss.network.model.loan;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.CreditInfo$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CreditInfo {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final int approveRatio;
    private final int score;

    static {
        int i = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CreditInfo() {
        int i = 0;
        this(i, i, 3, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof CreditInfo)) {
            return false;
        }
        CreditInfo creditInfo = (CreditInfo) obj;
        if (this.score != creditInfo.score) {
            return false;
        }
        if (this.approveRatio != creditInfo.approveRatio) {
            int i4 = onWarmupCompleted + 91;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = onNavigationEvent + 123;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Integer.hashCode(this.score) * 31) + Integer.hashCode(this.approveRatio);
        int i4 = onNavigationEvent + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditInfo(score=" + this.score + ", approveRatio=" + this.approveRatio + ")";
        int i2 = onWarmupCompleted + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CreditInfo> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            CreditInfo$.serializer serializerVar = CreditInfo$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public CreditInfo(int i, int i2) {
        this.score = i;
        this.approveRatio = i2;
    }

    public /* synthetic */ CreditInfo(int i, int i2, int i3, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.score = -1;
        } else {
            this.score = i2;
        }
        if ((i & 2) != 0) {
            this.approveRatio = i3;
            return;
        }
        int i4 = onWarmupCompleted + 1;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        this.approveRatio = -1;
        int i7 = i5 + 53;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.loan.CreditInfo r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.CreditInfo.onNavigationEvent
            int r1 = r1 + 109
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.CreditInfo.onWarmupCompleted = r2
            int r1 = r1 % r0
            r2 = -1
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L18
            boolean r1 = r6.onWarmupCompleted(r7, r4)
            if (r1 != 0) goto L22
            goto L1e
        L18:
            boolean r1 = r6.onWarmupCompleted(r7, r3)
            if (r1 != 0) goto L22
        L1e:
            int r1 = r5.score
            if (r1 == r2) goto L35
        L22:
            int r1 = r5.score
            r6.onExtraCallback(r7, r3, r1)
            int r1 = viva.republica.toss.network.model.loan.CreditInfo.onWarmupCompleted
            int r1 = r1 + 107
            int r3 = r1 % 128
            viva.republica.toss.network.model.loan.CreditInfo.onNavigationEvent = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L35
            r1 = 5
            int r1 = r1 / 3
        L35:
            boolean r1 = r6.onWarmupCompleted(r7, r4)
            if (r1 != 0) goto L48
            int r1 = viva.republica.toss.network.model.loan.CreditInfo.onWarmupCompleted
            int r1 = r1 + 111
            int r3 = r1 % 128
            viva.republica.toss.network.model.loan.CreditInfo.onNavigationEvent = r3
            int r1 = r1 % r0
            int r1 = r5.approveRatio
            if (r1 == r2) goto L4d
        L48:
            int r5 = r5.approveRatio
            r6.onExtraCallback(r7, r4, r5)
        L4d:
            int r5 = viva.republica.toss.network.model.loan.CreditInfo.onNavigationEvent
            int r5 = r5 + 85
            int r6 = r5 % 128
            viva.republica.toss.network.model.loan.CreditInfo.onWarmupCompleted = r6
            int r5 = r5 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.CreditInfo.onWarmupCompleted(viva.republica.toss.network.model.loan.CreditInfo, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreditInfo(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 1) != 0) {
            int i4 = onNavigationEvent + 37;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            i = -1;
        }
        if ((i3 & 2) != 0) {
            int i7 = onNavigationEvent + 43;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            i2 = -1;
        }
        this(i, i2);
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = this.approveRatio;
        int i6 = i3 + 79;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }
}
