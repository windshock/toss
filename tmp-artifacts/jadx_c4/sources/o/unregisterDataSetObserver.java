package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface unregisterDataSetObserver {

    public static final class onExtraCallbackWithResult implements unregisterDataSetObserver {
        private static int IAuthTabCallback = 0;
        public static final onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 117;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this != obj) {
                return obj instanceof onExtraCallbackWithResult;
            }
            int i2 = onNavigationEvent + 65;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 61;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 115;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 65;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return -1580883586;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 17;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 75;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return "Success";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onExtraCallbackWithResult() {
        }
    }

    public static final class onWarmupCompleted implements unregisterDataSetObserver {
        public static final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 75;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof o.unregisterDataSetObserver.onWarmupCompleted) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r2 = r2 + 7;
            o.unregisterDataSetObserver.onWarmupCompleted.onExtraCallback = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                int i4 = 24 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 55;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 61 / 0;
            }
            return 1550981446;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 115;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 105;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return "NetworkFailed";
        }

        private onWarmupCompleted() {
        }
    }

    public static final class IAuthTabCallback implements unregisterDataSetObserver {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        public static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback();
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallbackWithResult + 83;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 95;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj || (obj instanceof IAuthTabCallback)) {
                return true;
            }
            int i4 = i2 + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 85;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 21;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return -880261947;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return "ServerFailed";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallback() {
        }
    }

    public static final class onExtraCallback implements unregisterDataSetObserver {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private final int IAuthTabCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 119;
                onWarmupCompleted = i2 % 128;
                return i2 % 2 == 0;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i3 = onWarmupCompleted + 87;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (this.IAuthTabCallback == ((onExtraCallback) obj).IAuthTabCallback) {
                return true;
            }
            int i5 = onExtraCallback + 29;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Integer.hashCode(this.IAuthTabCallback);
            int i4 = onExtraCallback + 75;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "TerminalFailed(code=" + this.IAuthTabCallback + ")";
            int i2 = onWarmupCompleted + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallback(int i) {
            this.IAuthTabCallback = i;
        }

        public final int onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 83;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.IAuthTabCallback;
            int i6 = i2 + 117;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            throw null;
        }
    }
}
