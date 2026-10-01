package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface putIntArray {

    public static final class onNavigationEvent implements putIntArray {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        public static final onNavigationEvent onNavigationEvent = new onNavigationEvent();
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (this == obj || !(!(obj instanceof onNavigationEvent))) {
                return true;
            }
            int i5 = i3 + 29;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 79;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 69 / 0;
            }
            int i5 = i2 + 85;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return -1548331388;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 43;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return "Up";
            }
            obj.hashCode();
            throw null;
        }

        private onNavigationEvent() {
        }
    }

    public static final class onWarmupCompleted implements putIntArray {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        public static final onWarmupCompleted onNavigationEvent = new onWarmupCompleted();
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 3;
            onExtraCallback = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i4 = i2 + 63;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = i2 + 45;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 39;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return -1888283061;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 111;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return "Down";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onWarmupCompleted() {
        }
    }
}
