package im.toss.features.benefit.ui;

import kotlin.jvm.internal.Intrinsics;
import o.TelephonyInfoBridgeExtension1;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
interface KoreaBenefitTabViewModel$IAuthTabCallbackStub {

    public static final class onNavigationEvent implements KoreaBenefitTabViewModel$IAuthTabCallbackStub {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private final TelephonyInfoBridgeExtension1 onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 41;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i4 = onExtraCallbackWithResult + 19;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.onWarmupCompleted, ((onNavigationEvent) obj).onWarmupCompleted))) {
                return true;
            }
            int i6 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            TelephonyInfoBridgeExtension1 telephonyInfoBridgeExtension1 = this.onWarmupCompleted;
            if (telephonyInfoBridgeExtension1 != null) {
                return telephonyInfoBridgeExtension1.hashCode();
            }
            int i5 = i3 + 57;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return 0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Success(topAd=" + this.onWarmupCompleted + ")";
            int i2 = onNavigationEvent + 5;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public onNavigationEvent(@Nullable TelephonyInfoBridgeExtension1 telephonyInfoBridgeExtension1) {
            this.onWarmupCompleted = telephonyInfoBridgeExtension1;
        }

        public final TelephonyInfoBridgeExtension1 onWarmupCompleted() {
            TelephonyInfoBridgeExtension1 telephonyInfoBridgeExtension1;
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 55;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                telephonyInfoBridgeExtension1 = this.onWarmupCompleted;
                int i4 = 75 / 0;
            } else {
                telephonyInfoBridgeExtension1 = this.onWarmupCompleted;
            }
            int i5 = i2 + 19;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return telephonyInfoBridgeExtension1;
            }
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements KoreaBenefitTabViewModel$IAuthTabCallbackStub {
        public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        static {
            int i = onExtraCallbackWithResult + 41;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 75 / 0;
            }
        }

        private onExtraCallbackWithResult() {
        }
    }
}
