package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface closePage {

    public static final class IAuthTabCallback implements closePage {
        public static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallback + 103;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 47;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 73;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (obj instanceof IAuthTabCallback) {
                return true;
            }
            int i7 = i2 + 53;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 55;
            onExtraCallbackWithResult = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 19;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return -1809351417;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return "NotResumed";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallback() {
        }
    }

    public static final class onExtraCallback implements closePage {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        private final RVAppFactory onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 99;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, ((onExtraCallback) obj).onExtraCallbackWithResult)) {
                return true;
            }
            int i4 = onExtraCallback + 3;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            r1 = r1.hashCode();
            r2 = o.closePage.onExtraCallback.IAuthTabCallback + 119;
            o.closePage.onExtraCallback.onExtraCallback = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            if ((r2 % 2) != 0) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        
            r0 = null;
            r0.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r1 == null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            if (r1 == null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
        
            return 0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int hashCode() {
            RVAppFactory rVAppFactory;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                rVAppFactory = this.onExtraCallbackWithResult;
                int i3 = 3 / 0;
            } else {
                rVAppFactory = this.onExtraCallbackWithResult;
            }
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Resumed(exhaustedTarget=" + this.onExtraCallbackWithResult + ")";
            int i2 = onExtraCallback + 107;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public onExtraCallback(@Nullable RVAppFactory rVAppFactory) {
            this.onExtraCallbackWithResult = rVAppFactory;
        }

        public final RVAppFactory onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            RVAppFactory rVAppFactory = this.onExtraCallbackWithResult;
            int i5 = i3 + 123;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return rVAppFactory;
        }
    }
}
