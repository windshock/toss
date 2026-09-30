package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface JsonUtils {

    public static final class onExtraCallbackWithResult implements JsonUtils {
        private static int IAuthTabCallback = 1;
        public static final onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 17;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof onExtraCallbackWithResult) {
                int i4 = i2 + 91;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            int i6 = i2 + 65;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 105;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 87;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return 529522966;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return "SlideUp";
            }
            int i3 = 6 / 0;
            return "SlideUp";
        }

        private onExtraCallbackWithResult() {
        }
    }

    public static final class onWarmupCompleted implements JsonUtils {
        private static int IAuthTabCallback = 0;
        public static final onWarmupCompleted onExtraCallback = new onWarmupCompleted();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 51;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 111;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (obj instanceof onWarmupCompleted) {
                return true;
            }
            int i4 = onWarmupCompleted;
            int i5 = i4 + 87;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 111;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return 2064925789;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return "SlideDown";
            }
            int i3 = 85 / 0;
            return "SlideDown";
        }

        private onWarmupCompleted() {
        }
    }

    public static final class onExtraCallback implements JsonUtils {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = IAuthTabCallback + 51;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (this != obj) {
                return obj instanceof onExtraCallback;
            }
            int i5 = i3 + 11;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i3 + 95;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 113;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 105;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return -1949161842;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return "None";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onExtraCallback() {
        }
    }
}
