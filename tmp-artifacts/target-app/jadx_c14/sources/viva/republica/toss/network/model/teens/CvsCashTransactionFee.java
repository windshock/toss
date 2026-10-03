package viva.republica.toss.network.model.teens;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.teens.CvsCashTransactionFee$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CvsCashTransactionFee {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final long deposit;
    private final long withdraw;

    static {
        int i = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof CvsCashTransactionFee)) {
            int i4 = onWarmupCompleted + 79;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        }
        CvsCashTransactionFee cvsCashTransactionFee = (CvsCashTransactionFee) obj;
        if (this.deposit != cvsCashTransactionFee.deposit) {
            return false;
        }
        if (this.withdraw == cvsCashTransactionFee.withdraw) {
            return true;
        }
        int i5 = onNavigationEvent + 79;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onWarmupCompleted = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (Long.hashCode(this.deposit) + 60) * Long.hashCode(this.withdraw) : (Long.hashCode(this.deposit) * 31) + Long.hashCode(this.withdraw);
        int i3 = onNavigationEvent + 89;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CvsCashTransactionFee(deposit=" + this.deposit + ", withdraw=" + this.withdraw + ")";
        int i2 = onNavigationEvent + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CvsCashTransactionFee> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            CvsCashTransactionFee$.serializer serializerVar = CvsCashTransactionFee$.serializer.INSTANCE;
            if (i3 == 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ CvsCashTransactionFee(int i, long j, long j2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onNavigationEvent + 95;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                htf31.onExtraCallbackWithResult(i, 2, CvsCashTransactionFee$.serializer.INSTANCE.getDescriptor());
            } else {
                htf31.onExtraCallbackWithResult(i, 3, CvsCashTransactionFee$.serializer.INSTANCE.getDescriptor());
            }
            int i3 = onWarmupCompleted + 105;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        this.deposit = j;
        this.withdraw = j2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(CvsCashTransactionFee cvsCashTransactionFee, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, cvsCashTransactionFee.deposit);
        vylVar.onExtraCallback(serialDescriptor, 1, cvsCashTransactionFee.withdraw);
        int i4 = onNavigationEvent + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.deposit;
        }
        int i3 = 73 / 0;
        return this.deposit;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.withdraw;
        }
        throw null;
    }
}
