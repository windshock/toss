package im.toss.uikit.base;

import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface MainBottomNavBarVisibility {
    int IAuthTabCallback();

    @JvmInline
    public static final class Visible implements MainBottomNavBarVisibility {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        private final int onNavigationEvent;

        public static int IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 1;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 49;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return i;
            }
            throw null;
        }

        public static String onExtraCallback(int i) {
            int i2 = 2 % 2;
            String str = "Visible(height=" + i + ")";
            int i3 = IAuthTabCallback + 13;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }

        public static boolean onExtraCallbackWithResult(int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 55;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                boolean z = obj instanceof Visible;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof Visible)) {
                return false;
            }
            if (i == ((Visible) obj).onExtraCallbackWithResult()) {
                return true;
            }
            int i4 = onExtraCallback + 113;
            IAuthTabCallback = i4 % 128;
            return i4 % 2 == 0;
        }

        public static int onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 41;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = Integer.hashCode(i);
            if (i4 == 0) {
                int i5 = 64 / 0;
            }
            int i6 = IAuthTabCallback + 85;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 25 / 0;
            }
            return iHashCode;
        }

        public static final /* synthetic */ Visible onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            Visible visible = new Visible(i);
            int i3 = onExtraCallback + 9;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return visible;
        }

        public boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(this.onNavigationEvent, obj);
                throw null;
            }
            boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(this.onNavigationEvent, obj);
            int i3 = onExtraCallback + 63;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return zOnExtraCallbackWithResult;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iOnNavigationEvent = onNavigationEvent(this.onNavigationEvent);
            int i4 = onExtraCallback + 55;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iOnNavigationEvent;
        }

        public final /* synthetic */ int onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = this.onNavigationEvent;
            int i6 = i3 + 27;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 59 / 0;
            }
            return i5;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallback = onExtraCallback(this.onNavigationEvent);
            int i4 = IAuthTabCallback + 65;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return strOnExtraCallback;
            }
            throw null;
        }

        private /* synthetic */ Visible(int i) {
            this.onNavigationEvent = i;
        }

        @Override // im.toss.uikit.base.MainBottomNavBarVisibility
        public int IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 93;
            IAuthTabCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = this.onNavigationEvent;
            int i5 = i2 + 57;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return i4;
            }
            throw null;
        }
    }

    public static final class Gone implements MainBottomNavBarVisibility {
        private static int IAuthTabCallback = 0;
        public static final Gone onExtraCallback = new Gone();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.uikit.base.MainBottomNavBarVisibility
        public int IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 41;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Gone)) {
                int i2 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
                onNavigationEvent = i2 % 128;
                return i2 % 2 == 0;
            }
            int i3 = IAuthTabCallback + 29;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 101;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 60 / 0;
            }
            return 891295103;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 49;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = i2 + 93;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return "Gone";
        }

        private Gone() {
        }
    }
}
