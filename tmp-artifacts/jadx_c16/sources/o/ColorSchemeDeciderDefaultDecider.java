package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface ColorSchemeDeciderDefaultDecider {

    public static final class onWarmupCompleted implements ColorSchemeDeciderDefaultDecider {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

        static {
            int i = onNavigationEvent + 113;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 11;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                int i6 = i4 + 25;
                IAuthTabCallback = i6 % 128;
                return i6 % 2 == 0;
            }
            if (obj instanceof onWarmupCompleted) {
                return true;
            }
            int i7 = i2 + 69;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return -1861996206;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 19;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 119;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return "NavigateToStateResult";
        }

        private onWarmupCompleted() {
        }
    }

    public static final class IAuthTabCallback implements ColorSchemeDeciderDefaultDecider {
        public static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onNavigationEvent + 57;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 113;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i4 = onExtraCallbackWithResult + 57;
                onWarmupCompleted = i4 % 128;
                return i4 % 2 != 0;
            }
            int i5 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return -1094799324;
            }
            int i3 = 11 / 0;
            return -1094799324;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 83;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 99;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return "NavigateToTransferResult";
        }

        private IAuthTabCallback() {
        }
    }
}
