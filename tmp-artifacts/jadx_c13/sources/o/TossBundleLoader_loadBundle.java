package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface TossBundleLoader_loadBundle {

    public static final class onExtraCallbackWithResult implements TossBundleLoader_loadBundle {
        private static int IAuthTabCallback = 0;
        public static final onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 33;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 31;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            if (this != obj) {
                if (!(!(obj instanceof onExtraCallbackWithResult))) {
                    return true;
                }
                int i6 = i2 + 45;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            int i8 = i4 + 57;
            int i9 = i8 % 128;
            IAuthTabCallback = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 13;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 37;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return 832991919;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return "Override";
            }
            int i3 = 95 / 0;
            return "Override";
        }

        private onExtraCallbackWithResult() {
        }
    }

    public static final class onWarmupCompleted implements TossBundleLoader_loadBundle {
        public static final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 77;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                int i2 = 51 / 0;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 69;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == obj || (obj instanceof onWarmupCompleted)) {
                return true;
            }
            int i4 = i2 + 95;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return 1497031950;
            }
            int i3 = 55 / 0;
            return 1497031950;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 3;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return "Queue";
        }

        private onWarmupCompleted() {
        }
    }
}
