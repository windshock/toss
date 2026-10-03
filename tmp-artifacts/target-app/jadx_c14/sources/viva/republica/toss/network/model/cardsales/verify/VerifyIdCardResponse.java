package viva.republica.toss.network.model.cardsales.verify;

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
import viva.republica.toss.network.model.cardsales.verify.VerifyIdCardDetail$;
import viva.republica.toss.network.model.cardsales.verify.VerifyIdCardResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class VerifyIdCardResponse {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final boolean bypassedDueToMaintenance;
    private final VerifyIdCardDetail detail;

    static {
        int i = IAuthTabCallback + 101;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyIdCardResponse)) {
            int i2 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        VerifyIdCardResponse verifyIdCardResponse = (VerifyIdCardResponse) obj;
        if (!Intrinsics.areEqual(this.detail, verifyIdCardResponse.detail)) {
            int i4 = onWarmupCompleted + 107;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.bypassedDueToMaintenance == verifyIdCardResponse.bypassedDueToMaintenance) {
            return true;
        }
        int i6 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        VerifyIdCardDetail verifyIdCardDetail = this.detail;
        if (verifyIdCardDetail == null) {
            int i2 = onExtraCallbackWithResult + 95;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 79;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = verifyIdCardDetail.hashCode();
        }
        return (iHashCode * 31) + Boolean.hashCode(this.bypassedDueToMaintenance);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifyIdCardResponse(detail=" + this.detail + ", bypassedDueToMaintenance=" + this.bypassedDueToMaintenance + ")";
        int i2 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i2 % 128;
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

        public final KSerializer<VerifyIdCardResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            VerifyIdCardResponse$.serializer serializerVar = VerifyIdCardResponse$.serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 107;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ VerifyIdCardResponse(int i, VerifyIdCardDetail verifyIdCardDetail, boolean z, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i2 % 128;
            htf31.onExtraCallbackWithResult(i, 3, (i2 % 2 == 0 ? VerifyIdCardResponse$.serializer.INSTANCE : VerifyIdCardResponse$.serializer.INSTANCE).getDescriptor());
            int i3 = 2 % 2;
        }
        this.detail = verifyIdCardDetail;
        this.bypassedDueToMaintenance = z;
    }

    public VerifyIdCardResponse(@Nullable VerifyIdCardDetail verifyIdCardDetail, boolean z) {
        this.detail = verifyIdCardDetail;
        this.bypassedDueToMaintenance = z;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(VerifyIdCardResponse verifyIdCardResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, VerifyIdCardDetail$.serializer.INSTANCE, verifyIdCardResponse.detail);
        vylVar.onNavigationEvent(serialDescriptor, 1, verifyIdCardResponse.bypassedDueToMaintenance);
        int i4 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VerifyIdCardDetail onExtraCallback() {
        VerifyIdCardDetail verifyIdCardDetail;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 37;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            verifyIdCardDetail = this.detail;
            int i4 = 16 / 0;
        } else {
            verifyIdCardDetail = this.detail;
        }
        int i5 = i2 + 75;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return verifyIdCardDetail;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 107;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.bypassedDueToMaintenance;
        int i5 = i2 + 53;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
