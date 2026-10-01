package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class pxToDp {
    public /* synthetic */ pxToDp(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private pxToDp() {
    }

    public static final class onWarmupCompleted extends pxToDp {
        public static final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallback + 23;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (obj instanceof onWarmupCompleted) {
                int i2 = onExtraCallbackWithResult + 1;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = onNavigationEvent;
            int i5 = i4 + 93;
            onExtraCallbackWithResult = i5 % 128;
            boolean z = i5 % 2 != 0;
            int i6 = i4 + 19;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return z;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return -629806099;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return "Serial";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onWarmupCompleted() {
            super(null);
        }
    }

    public static final class IAuthTabCallback extends pxToDp {
        private static int IAuthTabCallback = 1;
        public static final IAuthTabCallback onExtraCallback = new IAuthTabCallback();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 51;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 17 / 0;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        
            if ((r6 instanceof o.pxToDp.IAuthTabCallback) != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        
            r6 = r3 + 89;
            o.pxToDp.IAuthTabCallback.onExtraCallbackWithResult = r6 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        
            if ((r6 % 2) == 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        
            r2 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
        
            r3 = r3 + 23;
            o.pxToDp.IAuthTabCallback.onExtraCallbackWithResult = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        
            r3 = r3 + 125;
            o.pxToDp.IAuthTabCallback.onExtraCallbackWithResult = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            boolean z = true;
            int i2 = onExtraCallbackWithResult + 1;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                int i4 = 87 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 67;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 77;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return 151159232;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 1;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 47;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return "Parallel";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallback() {
            super(null);
        }
    }

    public static final class onNavigationEvent extends pxToDp {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        private final int onExtraCallbackWithResult;

        public onNavigationEvent() {
            this(0, 1, null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 17;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            if (this.onExtraCallbackWithResult == ((onNavigationEvent) obj).onExtraCallbackWithResult) {
                return true;
            }
            int i4 = i2 + 3;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Integer.hashCode(this.onExtraCallbackWithResult);
            int i4 = IAuthTabCallback + 69;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Stagger(staggerDelay=" + this.onExtraCallbackWithResult + ")";
            int i2 = onWarmupCompleted + 19;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 37 / 0;
            }
            return str;
        }

        public onNavigationEvent(int i) {
            super(null);
            this.onExtraCallbackWithResult = i;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onNavigationEvent(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 1) != 0) {
                int i3 = IAuthTabCallback + 107;
                int i4 = i3 % 128;
                onWarmupCompleted = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 95;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
                i = 80;
            }
            this(i);
        }

        public final int onNavigationEvent() {
            int i;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 53;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            if (i3 % 2 == 0) {
                i = this.onExtraCallbackWithResult;
                int i5 = 10 / 0;
            } else {
                i = this.onExtraCallbackWithResult;
            }
            int i6 = i4 + 123;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return i;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
