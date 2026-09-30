package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface LottieCompositionFactoryExternalSyntheticLambda7 {

    public static final class onWarmupCompleted implements LottieCompositionFactoryExternalSyntheticLambda7 {
        private static int IAuthTabCallback = 1;
        private static int IAuthTabCallbackStub = 1;
        public static final onWarmupCompleted onExtraCallback = new onWarmupCompleted();
        public static final int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 115;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallbackStub + 13;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (obj instanceof onWarmupCompleted) {
                return true;
            }
            int i4 = IAuthTabCallbackStub + 111;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return -1132002482;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 71;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return "FullScreen";
            }
            throw null;
        }

        private onWarmupCompleted() {
        }
    }

    public static final class onExtraCallback implements LottieCompositionFactoryExternalSyntheticLambda7 {
        private static int IAuthTabCallback = 1;
        public static final onExtraCallback onExtraCallback = new onExtraCallback();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int i = IAuthTabCallback + 47;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == obj || (obj instanceof onExtraCallback)) {
                return true;
            }
            int i4 = i3 + 47;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 7;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 85;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return 489383442;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 33;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 10 / 0;
            }
            return "BottomCta";
        }

        private onExtraCallback() {
        }
    }
}
