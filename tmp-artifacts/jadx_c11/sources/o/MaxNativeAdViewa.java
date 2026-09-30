package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface MaxNativeAdViewa {

    public static final class onExtraCallbackWithResult implements MaxNativeAdViewa {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        public static final onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();

        static {
            int i = onExtraCallback + 109;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                int i2 = 27 / 0;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                int i2 = onNavigationEvent + 19;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = IAuthTabCallback + 37;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 89;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 43;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return -507852815;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return "X";
            }
            throw null;
        }

        private onExtraCallbackWithResult() {
        }
    }

    public static final class IAuthTabCallback implements MaxNativeAdViewa {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = IAuthTabCallback + 41;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this == obj || !(!(obj instanceof IAuthTabCallback))) {
                return true;
            }
            int i4 = i3 + 89;
            int i5 = i4 % 128;
            onNavigationEvent = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 5;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 62 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return -507852814;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 105;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return "Y";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallback() {
        }
    }
}
