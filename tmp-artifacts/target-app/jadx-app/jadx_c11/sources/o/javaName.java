package o;

import android.util.DisplayMetrics;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface javaName {
    float onWarmupCompleted(@NotNull DisplayMetrics displayMetrics);

    public static final class onWarmupCompleted implements javaName {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private final float onExtraCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 91;
                onNavigationEvent = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            if (Float.compare(this.onExtraCallback, ((onWarmupCompleted) obj).onExtraCallback) != 0) {
                int i3 = IAuthTabCallback + 47;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = IAuthTabCallback + 25;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Float.hashCode(this.onExtraCallback);
            int i4 = IAuthTabCallback + 35;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Scaled(dp=" + this.onExtraCallback + ")";
            int i2 = onNavigationEvent + 25;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public onWarmupCompleted(float f) {
            this.onExtraCallback = f;
        }

        public final float onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 41;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            float f = this.onExtraCallback;
            int i5 = i2 + 35;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        @Override // o.javaName
        public float onWarmupCompleted(@NotNull DisplayMetrics displayMetrics) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(displayMetrics, "");
            float f = this.onExtraCallback * displayMetrics.density;
            int i4 = IAuthTabCallback + 17;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return f;
        }
    }

    public static final class IAuthTabCallback implements javaName {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final int onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 109;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            if (this.onWarmupCompleted != ((IAuthTabCallback) obj).onWarmupCompleted) {
                int i4 = onExtraCallback + 79;
                onExtraCallbackWithResult = i4 % 128;
                return i4 % 2 == 0;
            }
            int i5 = onExtraCallback + 7;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Integer.hashCode(this.onWarmupCompleted);
            int i4 = onExtraCallback + 87;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 52 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "PhysicalPx(px=" + this.onWarmupCompleted + ")";
            int i2 = onExtraCallbackWithResult + 57;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public IAuthTabCallback(int i) {
            this.onWarmupCompleted = i;
        }

        public final int onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 81;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.onWarmupCompleted;
            int i6 = i2 + 27;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            throw null;
        }

        @Override // o.javaName
        public float onWarmupCompleted(@NotNull DisplayMetrics displayMetrics) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(displayMetrics, "");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(displayMetrics, "");
            float f = this.onWarmupCompleted;
            int i3 = onExtraCallbackWithResult + 37;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return f;
        }
    }
}
