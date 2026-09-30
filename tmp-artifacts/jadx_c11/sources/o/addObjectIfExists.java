package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface addObjectIfExists {

    public static final class onExtraCallback implements addObjectIfExists {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        public static final onExtraCallback onWarmupCompleted = new onExtraCallback();

        static {
            int i = onExtraCallback + 43;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 19;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (this != obj) {
                if (obj instanceof onExtraCallback) {
                    return true;
                }
                int i5 = i2 + 43;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            int i7 = i2 + 125;
            int i8 = i7 % 128;
            onNavigationEvent = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 63;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 == 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 17;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 101;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return -2023787320;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 51;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 75;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return "None";
        }

        private onExtraCallback() {
        }
    }

    public static final class onExtraCallbackWithResult implements addObjectIfExists {
        private static int IAuthTabCallback = 0;
        public static final onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = IAuthTabCallback + 61;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
        
            if ((r6 instanceof o.addObjectIfExists.onExtraCallbackWithResult) == true) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
        
            r2 = r2 + 123;
            o.addObjectIfExists.onExtraCallbackWithResult.onNavigationEvent = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        
            if ((r2 % 2) == 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            r6 = 81 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                int i4 = 2 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 45;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 3;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return 1676726648;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 121;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return "Check";
        }

        private onExtraCallbackWithResult() {
        }
    }

    public static final class onNavigationEvent implements addObjectIfExists {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        public static final onNavigationEvent onNavigationEvent = new onNavigationEvent();
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 27;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 85;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                int i6 = i4 + 77;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 43 / 0;
                }
                return true;
            }
            if (obj instanceof onNavigationEvent) {
                return true;
            }
            int i8 = i2 + 77;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 5;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return -2004955719;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 115;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return "Dot";
            }
            throw null;
        }

        private onNavigationEvent() {
        }
    }

    public static final class IAuthTabCallback implements addObjectIfExists {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 47;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 121;
                IAuthTabCallback = i2 % 128;
                return i2 % 2 != 0;
            }
            if (obj instanceof IAuthTabCallback) {
                return true;
            }
            int i3 = IAuthTabCallback + 79;
            onNavigationEvent = i3 % 128;
            return i3 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 75;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 5;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return 780000877;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 23;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return "ForceCheck";
        }

        private IAuthTabCallback() {
        }
    }
}
