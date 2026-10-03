package viva.republica.toss.network.model.teens;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.teens.CvsCashTransactionFee$;
import viva.republica.toss.network.model.teens.CvsCashTransactionFeeResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CvsCashTransactionFeeResponse {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final CvsCashTransactionFee fee;

    static {
        int i = onNavigationEvent + 1;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 5 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof CvsCashTransactionFeeResponse)) {
            int i3 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.fee, ((CvsCashTransactionFeeResponse) obj).fee)) {
            int i5 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = IAuthTabCallback + 105;
        int i8 = i7 % 128;
        onExtraCallbackWithResult = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 53;
        IAuthTabCallback = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            iHashCode = this.fee.hashCode();
            int i3 = 45 / 0;
        } else {
            iHashCode = this.fee.hashCode();
        }
        int i4 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CvsCashTransactionFeeResponse(fee=" + this.fee + ")";
        int i2 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CvsCashTransactionFeeResponse> serializer() {
            CvsCashTransactionFeeResponse$.serializer serializerVar;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                serializerVar = CvsCashTransactionFeeResponse$.serializer.INSTANCE;
                int i3 = 94 / 0;
            } else {
                serializerVar = CvsCashTransactionFeeResponse$.serializer.INSTANCE;
            }
            int i4 = onExtraCallback + 111;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 47 / 0;
            }
            return serializerVar;
        }
    }

    public /* synthetic */ CvsCashTransactionFeeResponse(int i, CvsCashTransactionFee cvsCashTransactionFee, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, CvsCashTransactionFeeResponse$.serializer.INSTANCE.getDescriptor());
            int i4 = 2 % 2;
        }
        this.fee = cvsCashTransactionFee;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(CvsCashTransactionFeeResponse cvsCashTransactionFeeResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, CvsCashTransactionFee$.serializer.INSTANCE, cvsCashTransactionFeeResponse.fee);
        int i4 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
    }

    public final CvsCashTransactionFee onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        CvsCashTransactionFee cvsCashTransactionFee = this.fee;
        int i5 = i3 + 97;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return cvsCashTransactionFee;
    }
}
