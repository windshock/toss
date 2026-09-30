package viva.republica.toss.network.model.verify;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class SmsMoBeginRequest extends VerifyBaseInfo {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int i = IAuthTabCallback + 91;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SmsMoBeginRequest> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                SmsMoBeginRequest$$serializer smsMoBeginRequest$$serializer = SmsMoBeginRequest$$serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SmsMoBeginRequest$$serializer smsMoBeginRequest$$serializer2 = SmsMoBeginRequest$$serializer.INSTANCE;
            int i3 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return smsMoBeginRequest$$serializer2;
        }
    }

    public SmsMoBeginRequest() {
    }

    public /* synthetic */ SmsMoBeginRequest(int i, String str, long j, String str2, String str3, okycx okycxVar) {
        super(i, str, j, str2, str3, okycxVar);
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(SmsMoBeginRequest smsMoBeginRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        VerifyBaseInfo.IAuthTabCallback(smsMoBeginRequest, vylVar, serialDescriptor);
        int i4 = onWarmupCompleted + 1;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
