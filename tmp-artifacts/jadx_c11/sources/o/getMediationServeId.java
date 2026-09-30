package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface getMediationServeId {

    public static final class onExtraCallbackWithResult implements getMediationServeId {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 81;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 94 / 0;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 103;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (obj instanceof onExtraCallbackWithResult) {
                return true;
            }
            int i4 = onNavigationEvent + 43;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 65 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 79;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 13;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return -575656198;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 77;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 123;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return "OnInitialLoading";
            }
            throw null;
        }

        private onExtraCallbackWithResult() {
        }
    }

    public static final class onNavigationEvent implements getMediationServeId {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallback + 29;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof o.getMediationServeId.onNavigationEvent) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r2 = r2 + 3;
            o.getMediationServeId.onNavigationEvent.onWarmupCompleted = r2 % 128;
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
            int i2 = onWarmupCompleted + 23;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 != 0) {
                int i4 = 82 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 3;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 23 / 0;
            }
            int i5 = i2 + 31;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 1 / 0;
            }
            return 1868527049;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 97;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 105;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 62 / 0;
            }
            return "OnRefreshing";
        }

        private onNavigationEvent() {
        }
    }

    public static final class onWarmupCompleted implements getMediationServeId {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        public static final onWarmupCompleted onNavigationEvent = new onWarmupCompleted();
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallback + 105;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (this == obj || (obj instanceof onWarmupCompleted)) {
                return true;
            }
            int i5 = i3 + 35;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return 1592105915;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 101;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 89;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return "OnLoadFinish";
        }

        private onWarmupCompleted() {
        }
    }

    public static final class IAuthTabCallback implements getMediationServeId {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 113;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                int i6 = i2 + 89;
                onExtraCallbackWithResult = i6 % 128;
                return i6 % 2 != 0;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            if (this.onWarmupCompleted == ((IAuthTabCallback) obj).onWarmupCompleted) {
                return true;
            }
            int i7 = i4 + 45;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                iHashCode = this.onWarmupCompleted.hashCode();
                int i3 = 45 / 0;
            } else {
                iHashCode = this.onWarmupCompleted.hashCode();
            }
            int i4 = onExtraCallbackWithResult + 55;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnLoadError(reason=" + this.onWarmupCompleted + ")";
            int i2 = onExtraCallback + 99;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public IAuthTabCallback(@NotNull r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 r8lambdahekmogpxfnmskbbrjd3t2vn5d0) {
            Intrinsics.checkNotNullParameter(r8lambdahekmogpxfnmskbbrjd3t2vn5d0, "");
            this.onWarmupCompleted = r8lambdahekmogpxfnmskbbrjd3t2vn5d0;
        }
    }
}
