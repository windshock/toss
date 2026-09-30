package o;

import android.view.animation.Interpolator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class leaveBreadcrumb {
    public /* synthetic */ leaveBreadcrumb(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Interpolator IAuthTabCallback();

    private leaveBreadcrumb() {
    }

    public static final class onExtraCallback extends leaveBreadcrumb {
        private static int asBinder = 0;
        private static int asInterface = 1;
        private final float IAuthTabCallback;
        private final float IAuthTabCallbackStub;
        private final float onExtraCallback;
        private final float onExtraCallbackWithResult;
        private final Interpolator onNavigationEvent;
        private final Float onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (!Intrinsics.areEqual(this.onNavigationEvent, onextracallback.onNavigationEvent)) {
                int i2 = asBinder + 47;
                asInterface = i2 % 128;
                if (i2 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            if (Float.compare(this.onExtraCallbackWithResult, onextracallback.onExtraCallbackWithResult) != 0 || Float.compare(this.IAuthTabCallbackStub, onextracallback.IAuthTabCallbackStub) != 0) {
                return false;
            }
            if (Float.compare(this.IAuthTabCallback, onextracallback.IAuthTabCallback) != 0) {
                int i3 = asInterface + 113;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (Float.compare(this.onExtraCallback, onextracallback.onExtraCallback) != 0 || !Intrinsics.areEqual((Object) this.onWarmupCompleted, (Object) onextracallback.onWarmupCompleted)) {
                return false;
            }
            int i5 = asInterface + 53;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = asInterface + 33;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.onNavigationEvent.hashCode();
            int iHashCode3 = Float.hashCode(this.onExtraCallbackWithResult);
            int iHashCode4 = Float.hashCode(this.IAuthTabCallbackStub);
            int iHashCode5 = Float.hashCode(this.IAuthTabCallback);
            int iHashCode6 = Float.hashCode(this.onExtraCallback);
            Float f = this.onWarmupCompleted;
            if (f == null) {
                int i4 = asInterface + 59;
                asBinder = i4 % 128;
                iHashCode = i4 % 2 != 0 ? 1 : 0;
            } else {
                iHashCode = f.hashCode();
            }
            return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Linear(interpolator=" + this.onNavigationEvent + ", startX=" + this.onExtraCallbackWithResult + ", startY=" + this.IAuthTabCallbackStub + ", endX=" + this.IAuthTabCallback + ", endY=" + this.onExtraCallback + ", angle=" + this.onWarmupCompleted + ")";
            int i2 = asInterface + 47;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull Interpolator interpolator, float f, float f2, float f3, float f4, @Nullable Float f5) {
            super(null);
            Intrinsics.checkNotNullParameter(interpolator, "");
            this.onNavigationEvent = interpolator;
            this.onExtraCallbackWithResult = f;
            this.IAuthTabCallbackStub = f2;
            this.IAuthTabCallback = f3;
            this.onExtraCallback = f4;
            this.onWarmupCompleted = f5;
        }

        @Override // o.leaveBreadcrumb
        public Interpolator IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 27;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            Interpolator interpolator = this.onNavigationEvent;
            int i5 = i2 + 123;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return interpolator;
        }

        public final float onExtraCallback() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 3;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            float f = this.onExtraCallbackWithResult;
            int i5 = i2 + 37;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 79;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            float f = this.IAuthTabCallbackStub;
            int i5 = i2 + 9;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 65 / 0;
            }
            return f;
        }

        public final float onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 9;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            float f = this.IAuthTabCallback;
            int i5 = i2 + 111;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asBinder + 41;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            float f = this.onExtraCallback;
            int i5 = i3 + 87;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }
    }

    public static final class onWarmupCompleted extends leaveBreadcrumb {
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackStub = 1;
        private final Interpolator onExtraCallback;
        private final float onExtraCallbackWithResult;
        private final float onNavigationEvent;
        private final float onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!Intrinsics.areEqual(this.onExtraCallback, onwarmupcompleted.onExtraCallback)) {
                int i2 = IAuthTabCallbackStub + 61;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (Float.compare(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent) == 0) {
                return Float.compare(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted) == 0 && Float.compare(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult) == 0;
            }
            int i4 = IAuthTabCallback + 9;
            IAuthTabCallbackStub = i4 % 128;
            return i4 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((this.onExtraCallback.hashCode() * 31) + Float.hashCode(this.onNavigationEvent)) * 31) + Float.hashCode(this.onWarmupCompleted)) * 31) + Float.hashCode(this.onExtraCallbackWithResult);
            int i4 = IAuthTabCallback + 77;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 45 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Radial(interpolator=" + this.onExtraCallback + ", centerX=" + this.onNavigationEvent + ", centerY=" + this.onWarmupCompleted + ", radius=" + this.onExtraCallbackWithResult + ")";
            int i2 = IAuthTabCallback + 103;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull Interpolator interpolator, float f, float f2, float f3) {
            super(null);
            Intrinsics.checkNotNullParameter(interpolator, "");
            this.onExtraCallback = interpolator;
            this.onNavigationEvent = f;
            this.onWarmupCompleted = f2;
            this.onExtraCallbackWithResult = f3;
        }

        @Override // o.leaveBreadcrumb
        public Interpolator IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 19;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Interpolator interpolator = this.onExtraCallback;
            int i5 = i3 + 5;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return interpolator;
        }

        public final float onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 59;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            float f = this.onNavigationEvent;
            int i5 = i2 + 59;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                return f;
            }
            throw null;
        }

        public final float onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 9;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            float f = this.onWarmupCompleted;
            int i4 = i3 + 45;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                return f;
            }
            obj.hashCode();
            throw null;
        }

        public final float onNavigationEvent() {
            float f;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                f = this.onExtraCallbackWithResult;
                int i4 = 80 / 0;
            } else {
                f = this.onExtraCallbackWithResult;
            }
            int i5 = i2 + 61;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }
    }
}
