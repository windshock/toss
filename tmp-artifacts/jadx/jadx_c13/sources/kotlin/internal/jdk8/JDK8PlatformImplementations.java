package kotlin.internal.jdk8;

import j$.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import o.access15600;
import o.getBuildFingerprintBytes;
import o.getRegistersList;
import o.setProcessUptime;
import o.setRevisionBytes;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class JDK8PlatformImplementations extends access15600 {

    static final class ReflectSdkVersion {
        public static final ReflectSdkVersion onExtraCallback = new ReflectSdkVersion();
        public static final Integer onExtraCallbackWithResult;

        private ReflectSdkVersion() {
        }

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            onExtraCallbackWithResult = num;
        }
    }

    private final boolean IAuthTabCallback(int i) {
        Integer num = ReflectSdkVersion.onExtraCallbackWithResult;
        return num == null || num.intValue() >= i;
    }

    @Override // o.access15900
    public Random IAuthTabCallback() {
        return IAuthTabCallback(34) ? new getRegistersList() : super.IAuthTabCallback();
    }

    public static final class onExtraCallbackWithResult implements setProcessUptime {
        onExtraCallbackWithResult() {
        }

        @Override // o.setProcessUptime
        public setRevisionBytes onNavigationEvent() {
            Instant instantNow = Instant.now();
            Intrinsics.checkNotNullExpressionValue(instantNow, "");
            return getBuildFingerprintBytes.onExtraCallback(instantNow);
        }
    }

    @Override // o.access15900
    public setProcessUptime onExtraCallback() {
        return IAuthTabCallback(26) ? new onExtraCallbackWithResult() : new onWarmupCompleted();
    }

    public static final class onWarmupCompleted implements setProcessUptime {
        onWarmupCompleted() {
        }

        @Override // o.setProcessUptime
        public setRevisionBytes onNavigationEvent() {
            return setRevisionBytes.Companion.onExtraCallback(System.currentTimeMillis());
        }
    }
}
