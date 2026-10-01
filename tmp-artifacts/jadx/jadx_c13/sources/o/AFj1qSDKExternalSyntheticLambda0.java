package o;

import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface AFj1qSDKExternalSyntheticLambda0 {
    public static final onNavigationEvent Companion = onNavigationEvent.IAuthTabCallback;

    default boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        return false;
    }

    default boolean onNavigationEvent() {
        int i = 2 % 2;
        return false;
    }

    default isDoNotSellSet onExtraCallback() {
        int i = 2 % 2;
        return isDoNotSellSet.Companion.onExtraCallbackWithResult();
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallbackDefault = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        static final /* synthetic */ onNavigationEvent IAuthTabCallback = new onNavigationEvent();
        private static final AFj1qSDKExternalSyntheticLambda0 onExtraCallbackWithResult = new onWarmupCompleted();

        public static final class onWarmupCompleted implements AFj1qSDKExternalSyntheticLambda0 {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            onWarmupCompleted() {
            }

            @Override // o.AFj1qSDKExternalSyntheticLambda0
            public /* bridge */ isDoNotSellSet onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 87;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                isDoNotSellSet isdonotsellsetOnExtraCallback = super.onExtraCallback();
                int i4 = IAuthTabCallback + 119;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return isdonotsellsetOnExtraCallback;
                }
                throw null;
            }

            @Override // o.AFj1qSDKExternalSyntheticLambda0
            public /* bridge */ boolean onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 59;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    super.onExtraCallbackWithResult();
                    throw null;
                }
                boolean zOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
                int i3 = onExtraCallback + 51;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return zOnExtraCallbackWithResult;
            }

            @Override // o.AFj1qSDKExternalSyntheticLambda0
            public /* bridge */ boolean onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 125;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                boolean zOnNavigationEvent = super.onNavigationEvent();
                if (i3 != 0) {
                    int i4 = 52 / 0;
                }
                return zOnNavigationEvent;
            }
        }

        private onNavigationEvent() {
        }

        static {
            int i = onWarmupCompleted + 113;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public final AFj1qSDKExternalSyntheticLambda0 onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGBA_YVYU;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            AFj1qSDKExternalSyntheticLambda0 aFj1qSDKExternalSyntheticLambda0 = onExtraCallbackWithResult;
            int i5 = i3 + 111;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                return aFj1qSDKExternalSyntheticLambda0;
            }
            throw null;
        }
    }
}
