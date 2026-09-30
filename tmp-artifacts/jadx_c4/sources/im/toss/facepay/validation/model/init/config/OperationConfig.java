package im.toss.facepay.validation.model.init.config;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class OperationConfig {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 44 / 0;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(OperationConfig operationConfig, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OperationConfig> serializer() {
            OperationConfig$$serializer operationConfig$$serializer;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                operationConfig$$serializer = OperationConfig$$serializer.INSTANCE;
                int i3 = 78 / 0;
            } else {
                operationConfig$$serializer = OperationConfig$$serializer.INSTANCE;
            }
            int i4 = onExtraCallbackWithResult + 125;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return operationConfig$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public OperationConfig() {
    }

    public /* synthetic */ OperationConfig(int i, okycx okycxVar) {
    }
}
