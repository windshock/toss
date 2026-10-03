package viva.republica.toss.network.model.transfer;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.DepositTarget;
import viva.republica.toss.network.model.transfer.DetectFraudRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DetectFraudRequest {
    public static final int $stable = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final DepositTarget depositTarget;
    private final String sessionKey;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.DetectFraudRequest$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallback = DetectFraudRequest.IAuthTabCallback();
            int i4 = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerIAuthTabCallback;
        }
    })};

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        DepositTarget.Companion companion = DepositTarget.Companion;
        if (i3 == 0) {
            return companion.serializer();
        }
        companion.serializer();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetectFraudRequest)) {
            int i4 = i3 + 99;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        DetectFraudRequest detectFraudRequest = (DetectFraudRequest) obj;
        if (Intrinsics.areEqual(this.sessionKey, detectFraudRequest.sessionKey)) {
            return Intrinsics.areEqual(this.depositTarget, detectFraudRequest.depositTarget);
        }
        int i6 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.sessionKey;
        if (str == null) {
            int i2 = onWarmupCompleted + 49;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 119;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode2 = (iHashCode * 31) + this.depositTarget.hashCode();
        int i7 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return iHashCode2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DetectFraudRequest(sessionKey=" + this.sessionKey + ", depositTarget=" + this.depositTarget + ")";
        int i2 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DetectFraudRequest> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            DetectFraudRequest$.serializer serializerVar = DetectFraudRequest$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 35;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ DetectFraudRequest(int i, String str, DepositTarget depositTarget, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, DetectFraudRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.sessionKey = str;
        this.depositTarget = depositTarget;
    }

    public DetectFraudRequest(@Nullable String str, @NotNull DepositTarget depositTarget) {
        Intrinsics.checkNotNullParameter(depositTarget, "");
        this.sessionKey = str;
        this.depositTarget = depositTarget;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(DetectFraudRequest detectFraudRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, detectFraudRequest.sessionKey);
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), detectFraudRequest.depositTarget);
        int i4 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        return lazyArr;
    }
}
