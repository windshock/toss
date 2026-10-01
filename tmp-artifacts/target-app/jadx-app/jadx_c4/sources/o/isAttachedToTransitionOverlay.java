package o;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isAttachedToTransitionOverlay {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private final double IAuthTabCallback;
    private final double onExtraCallback;
    private final double onExtraCallbackWithResult;
    private final double onNavigationEvent;
    private final double onWarmupCompleted;

    public isAttachedToTransitionOverlay() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isAttachedToTransitionOverlay)) {
            return false;
        }
        isAttachedToTransitionOverlay isattachedtotransitionoverlay = (isAttachedToTransitionOverlay) obj;
        return Double.compare(this.onExtraCallback, isattachedtotransitionoverlay.onExtraCallback) == 0 && Double.compare(this.onExtraCallbackWithResult, isattachedtotransitionoverlay.onExtraCallbackWithResult) == 0 && Double.compare(this.onWarmupCompleted, isattachedtotransitionoverlay.onWarmupCompleted) == 0 && Double.compare(this.IAuthTabCallback, isattachedtotransitionoverlay.IAuthTabCallback) == 0 && Double.compare(this.onNavigationEvent, isattachedtotransitionoverlay.onNavigationEvent) == 0;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.onExtraCallback) * 31) + Double.hashCode(this.onExtraCallbackWithResult)) * 31) + Double.hashCode(this.onWarmupCompleted)) * 31) + Double.hashCode(this.IAuthTabCallback)) * 31) + Double.hashCode(this.onNavigationEvent);
    }

    public String toString() {
        return "StylusData(tiltX=" + this.onExtraCallback + ", tiltY=" + this.onExtraCallbackWithResult + ", altitudeAngle=" + this.onWarmupCompleted + ", azimuthAngle=" + this.IAuthTabCallback + ", pressure=" + this.onNavigationEvent + ")";
    }

    public isAttachedToTransitionOverlay(double d, double d2, double d3, double d4, double d5) {
        this.onExtraCallback = d;
        this.onExtraCallbackWithResult = d2;
        this.onWarmupCompleted = d3;
        this.IAuthTabCallback = d4;
        this.onNavigationEvent = d5;
    }

    public /* synthetic */ isAttachedToTransitionOverlay(double d, double d2, double d3, double d4, double d5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) == 0 ? d4 : 0.0d, (i & 16) != 0 ? -1.0d : d5);
    }

    public final double onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public final ReadableMap IAuthTabCallback() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("tiltX", this.onExtraCallback);
        writableMapCreateMap.putDouble("tiltY", this.onExtraCallbackWithResult);
        writableMapCreateMap.putDouble("altitudeAngle", this.onWarmupCompleted);
        writableMapCreateMap.putDouble("azimuthAngle", this.IAuthTabCallback);
        writableMapCreateMap.putDouble("pressure", this.onNavigationEvent);
        return writableMapCreateMap;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        private final Pair<Double, Double> onWarmupCompleted(double d, double d2) {
            double dAtan;
            double dAtan2;
            if (d < 1.0E-9d) {
                dAtan = 1.5707963267948966d;
                double d3 = (d2 < 1.0E-9d || Math.abs(d2 - 6.283185307179586d) < 1.0E-9d) ? 1.5707963267948966d : 0.0d;
                double d4 = d2 - 1.5707963267948966d;
                double d5 = Math.abs(d4) < 1.0E-9d ? 1.5707963267948966d : 0.0d;
                double d6 = d2 - 3.141592653589793d;
                dAtan2 = -1.5707963267948966d;
                if (Math.abs(d6) < 1.0E-9d) {
                    d3 = -1.5707963267948966d;
                }
                double d7 = d2 - 4.71238898038469d;
                if (Math.abs(d7) < 1.0E-9d) {
                    d5 = -1.5707963267948966d;
                }
                if (d2 > 1.0E-9d && Math.abs(d4) < 1.0E-9d) {
                    d5 = 1.5707963267948966d;
                    d3 = 1.5707963267948966d;
                }
                if (Math.abs(d4) > 1.0E-9d && Math.abs(d6) < 1.0E-9d) {
                    d5 = 1.5707963267948966d;
                    d3 = -1.5707963267948966d;
                }
                if (Math.abs(d6) > 1.0E-9d && Math.abs(d7) < 1.0E-9d) {
                    d5 = -1.5707963267948966d;
                    d3 = -1.5707963267948966d;
                }
                if (Math.abs(d7) <= 1.0E-9d || Math.abs(d2 - 6.283185307179586d) >= 1.0E-9d) {
                    dAtan2 = d5;
                    dAtan = d3;
                }
            } else {
                double dTan = Math.tan(d);
                dAtan = Math.atan(Math.cos(d2) / dTan);
                dAtan2 = Math.atan(Math.sin(d2) / dTan);
            }
            return new Pair<>(Double.valueOf(Math.rint(dAtan * 57.29577951308232d)), Double.valueOf(Math.rint(dAtan2 * 57.29577951308232d)));
        }

        public final isAttachedToTransitionOverlay onNavigationEvent(@NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            double axisValue = 1.5707963267948966d - motionEvent.getAxisValue(25);
            double pressure = motionEvent.getPressure(0);
            double orientation = (motionEvent.getOrientation(0) + 1.5707963267948966d) % 6.283185307179586d;
            if (orientation != 0.0d && Math.signum(orientation) != Math.signum(6.283185307179586d)) {
                orientation += 6.283185307179586d;
            }
            double d = orientation;
            Pair<Double, Double> pairOnWarmupCompleted = onWarmupCompleted(axisValue, d);
            return new isAttachedToTransitionOverlay(((Number) pairOnWarmupCompleted.getFirst()).doubleValue(), ((Number) pairOnWarmupCompleted.getSecond()).doubleValue(), axisValue, d, pressure);
        }
    }
}
