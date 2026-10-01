package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
final class RecyclerViewAccessibilityDelegate {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static final RecyclerViewAccessibilityDelegate onNavigationEvent = new RecyclerViewAccessibilityDelegate(0.0d, 0.0d, 0.0d, 0.0d);
    private final double IAuthTabCallback;
    private final double onExtraCallback;
    private final double onExtraCallbackWithResult;
    private final double onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecyclerViewAccessibilityDelegate)) {
            return false;
        }
        RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = (RecyclerViewAccessibilityDelegate) obj;
        return Double.compare(this.IAuthTabCallback, recyclerViewAccessibilityDelegate.IAuthTabCallback) == 0 && Double.compare(this.onWarmupCompleted, recyclerViewAccessibilityDelegate.onWarmupCompleted) == 0 && Double.compare(this.onExtraCallbackWithResult, recyclerViewAccessibilityDelegate.onExtraCallbackWithResult) == 0 && Double.compare(this.onExtraCallback, recyclerViewAccessibilityDelegate.onExtraCallback) == 0;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.IAuthTabCallback) * 31) + Double.hashCode(this.onWarmupCompleted)) * 31) + Double.hashCode(this.onExtraCallbackWithResult)) * 31) + Double.hashCode(this.onExtraCallback);
    }

    public String toString() {
        return "PortalLayoutState(hostWidth=" + this.IAuthTabCallback + ", hostHeight=" + this.onWarmupCompleted + ", offsetX=" + this.onExtraCallbackWithResult + ", offsetY=" + this.onExtraCallback + ")";
    }

    public RecyclerViewAccessibilityDelegate(double d, double d2, double d3, double d4) {
        this.IAuthTabCallback = d;
        this.onWarmupCompleted = d2;
        this.onExtraCallbackWithResult = d3;
        this.onExtraCallback = d4;
    }

    public final WritableMap onNavigationEvent() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("hostWidth", this.IAuthTabCallback);
        writableMapCreateMap.putDouble("hostHeight", this.onWarmupCompleted);
        writableMapCreateMap.putDouble("offsetX", this.onExtraCallbackWithResult);
        writableMapCreateMap.putDouble("offsetY", this.onExtraCallback);
        return writableMapCreateMap;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final RecyclerViewAccessibilityDelegate onNavigationEvent() {
            return RecyclerViewAccessibilityDelegate.onNavigationEvent;
        }
    }
}
