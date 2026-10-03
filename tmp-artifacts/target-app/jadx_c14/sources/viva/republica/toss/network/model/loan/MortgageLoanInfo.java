package viva.republica.toss.network.model.loan;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.MortgageLoanInfo$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class MortgageLoanInfo {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final int companyCount;
    private final int jeonseCompanyCount;
    private final float jeonseMinInterestRate;
    private final float minInterestRate;

    static {
        int i = onWarmupCompleted + 97;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public MortgageLoanInfo() {
        this(0.0f, 0, 0.0f, 0, 15, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof MortgageLoanInfo)) {
            return false;
        }
        MortgageLoanInfo mortgageLoanInfo = (MortgageLoanInfo) obj;
        if (Float.compare(this.minInterestRate, mortgageLoanInfo.minInterestRate) != 0) {
            return false;
        }
        if (this.companyCount == mortgageLoanInfo.companyCount) {
            return Float.compare(this.jeonseMinInterestRate, mortgageLoanInfo.jeonseMinInterestRate) == 0 && this.jeonseCompanyCount == mortgageLoanInfo.jeonseCompanyCount;
        }
        int i4 = onNavigationEvent + 125;
        IAuthTabCallback = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onNavigationEvent = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((((Float.hashCode(this.minInterestRate) - 12) % Integer.hashCode(this.companyCount)) + 75) + Float.hashCode(this.jeonseMinInterestRate)) << 125) * Integer.hashCode(this.jeonseCompanyCount) : (((((Float.hashCode(this.minInterestRate) * 31) + Integer.hashCode(this.companyCount)) * 31) + Float.hashCode(this.jeonseMinInterestRate)) * 31) + Integer.hashCode(this.jeonseCompanyCount);
        int i3 = onNavigationEvent + 93;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 61 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MortgageLoanInfo(minInterestRate=" + this.minInterestRate + ", companyCount=" + this.companyCount + ", jeonseMinInterestRate=" + this.jeonseMinInterestRate + ", jeonseCompanyCount=" + this.jeonseCompanyCount + ")";
        int i2 = IAuthTabCallback + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MortgageLoanInfo> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            MortgageLoanInfo$.serializer serializerVar = MortgageLoanInfo$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 93;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public MortgageLoanInfo(float f, int i, float f2, int i2) {
        this.minInterestRate = f;
        this.companyCount = i;
        this.jeonseMinInterestRate = f2;
        this.jeonseCompanyCount = i2;
    }

    public /* synthetic */ MortgageLoanInfo(int i, float f, int i2, float f2, int i3, okycx okycxVar) {
        int i4;
        this.minInterestRate = (i & 1) == 0 ? 3.43f : f;
        if ((i & 2) == 0) {
            this.companyCount = 10;
            i4 = IAuthTabCallback + 73;
            onNavigationEvent = i4 % 128;
        } else {
            this.companyCount = i2;
            i4 = IAuthTabCallback + 65;
            onNavigationEvent = i4 % 128;
        }
        int i5 = i4 % 2;
        int i6 = 2 % 2;
        if ((i & 4) == 0) {
            this.jeonseMinInterestRate = 0.0f;
        } else {
            this.jeonseMinInterestRate = f2;
        }
        if ((i & 8) != 0) {
            this.jeonseCompanyCount = i3;
            return;
        }
        int i7 = onNavigationEvent + 47;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        this.jeonseCompanyCount = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.loan.MortgageLoanInfo r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            if (r2 != 0) goto L1e
            int r2 = viva.republica.toss.network.model.loan.MortgageLoanInfo.IAuthTabCallback
            int r2 = r2 + 19
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.MortgageLoanInfo.onNavigationEvent = r3
            int r2 = r2 % r0
            float r2 = r5.minInterestRate
            r3 = 1079739679(0x405b851f, float:3.43)
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 == 0) goto L23
        L1e:
            float r2 = r5.minInterestRate
            r6.onExtraCallback(r7, r1, r2)
        L23:
            r2 = 1
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L39
            int r3 = viva.republica.toss.network.model.loan.MortgageLoanInfo.IAuthTabCallback
            int r3 = r3 + 17
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.MortgageLoanInfo.onNavigationEvent = r4
            int r3 = r3 % r0
            int r3 = r5.companyCount
            r4 = 10
            if (r3 == r4) goto L3e
        L39:
            int r3 = r5.companyCount
            r6.onExtraCallback(r7, r2, r3)
        L3e:
            boolean r2 = r6.onWarmupCompleted(r7, r0)
            if (r2 != 0) goto L63
            int r2 = viva.republica.toss.network.model.loan.MortgageLoanInfo.onNavigationEvent
            int r2 = r2 + 35
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.MortgageLoanInfo.IAuthTabCallback = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L5a
            float r2 = r5.jeonseMinInterestRate
            r3 = 1073741824(0x40000000, float:2.0)
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 == 0) goto L71
            goto L63
        L5a:
            float r2 = r5.jeonseMinInterestRate
            r3 = 0
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 == 0) goto L71
        L63:
            float r2 = r5.jeonseMinInterestRate
            r6.onExtraCallback(r7, r0, r2)
            int r2 = viva.republica.toss.network.model.loan.MortgageLoanInfo.IAuthTabCallback
            int r2 = r2 + 115
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.MortgageLoanInfo.onNavigationEvent = r3
            int r2 = r2 % r0
        L71:
            r2 = 3
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L8d
            int r3 = viva.republica.toss.network.model.loan.MortgageLoanInfo.IAuthTabCallback
            int r3 = r3 + 115
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.MortgageLoanInfo.onNavigationEvent = r4
            int r3 = r3 % r0
            int r0 = r5.jeonseCompanyCount
            if (r3 == 0) goto L8b
            r3 = 80
            int r3 = r3 / r1
            if (r0 == 0) goto L92
            goto L8d
        L8b:
            if (r0 == 0) goto L92
        L8d:
            int r5 = r5.jeonseCompanyCount
            r6.onExtraCallback(r7, r2, r5)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.MortgageLoanInfo.onExtraCallbackWithResult(viva.republica.toss.network.model.loan.MortgageLoanInfo, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MortgageLoanInfo(float f, int i, float f2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 1) != 0) {
            int i4 = IAuthTabCallback + 103;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            f = 3.43f;
        }
        if ((i3 & 2) != 0) {
            int i6 = onNavigationEvent + 19;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 / 4;
            } else {
                int i8 = 2 % 2;
            }
            i = 10;
        }
        if ((i3 & 4) != 0) {
            int i9 = onNavigationEvent + 97;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            f2 = 0.0f;
        }
        if ((i3 & 8) != 0) {
            int i11 = 2 % 2;
            i2 = 0;
        }
        this(f, i, f2, i2);
    }
}
