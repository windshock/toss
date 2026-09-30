package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface setDark {

    public static final class onNavigationEvent implements setDark {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = IAuthTabCallback + 105;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                int i2 = 80 / 0;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 93;
                onExtraCallback = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            int i3 = onExtraCallback + 69;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 45;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return 1996157733;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 79;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return "NavigateToResult";
        }

        private onNavigationEvent() {
        }
    }
}
