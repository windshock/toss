package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface setBodyTextViewId {

    public static final class onNavigationEvent implements setBodyTextViewId {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        public static final onNavigationEvent onNavigationEvent = new onNavigationEvent();
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 121;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 19;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            int i7 = i2 + 5;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return 156026347;
            }
            int i3 = 61 / 0;
            return 156026347;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 105;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 31;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return "Small";
        }

        private onNavigationEvent() {
        }
    }

    public static final class IAuthTabCallback implements setBodyTextViewId {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 85;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            if (this != obj) {
                return obj instanceof IAuthTabCallback;
            }
            int i5 = i3 + 95;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 1;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 0 / 0;
            }
            return 1264948964;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 125;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 115;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return "Big";
            }
            throw null;
        }

        private IAuthTabCallback() {
        }
    }
}
