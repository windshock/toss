package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class createSeekController {
    private float onExtraCallback;
    private float onExtraCallbackWithResult;
    private float onNavigationEvent;
    private float onWarmupCompleted;

    public createSeekController() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createSeekController)) {
            return false;
        }
        createSeekController createseekcontroller = (createSeekController) obj;
        return Float.compare(this.onExtraCallbackWithResult, createseekcontroller.onExtraCallbackWithResult) == 0 && Float.compare(this.onNavigationEvent, createseekcontroller.onNavigationEvent) == 0 && Float.compare(this.onExtraCallback, createseekcontroller.onExtraCallback) == 0 && Float.compare(this.onWarmupCompleted, createseekcontroller.onWarmupCompleted) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.onExtraCallbackWithResult) * 31) + Float.hashCode(this.onNavigationEvent)) * 31) + Float.hashCode(this.onExtraCallback)) * 31) + Float.hashCode(this.onWarmupCompleted);
    }

    public String toString() {
        return "Float4(x=" + this.onExtraCallbackWithResult + ", y=" + this.onNavigationEvent + ", z=" + this.onExtraCallback + ", w=" + this.onWarmupCompleted + ')';
    }

    public createSeekController(float f, float f2, float f3, float f4) {
        this.onExtraCallbackWithResult = f;
        this.onNavigationEvent = f2;
        this.onExtraCallback = f3;
        this.onWarmupCompleted = f4;
    }

    public /* synthetic */ createSeekController(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }

    public final float onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public final float onExtraCallback() {
        return this.onNavigationEvent;
    }

    public final float onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public final float onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public createSeekController(float f) {
        this(f, f, f, f);
    }
}
