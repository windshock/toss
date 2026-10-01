package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class excludeChildren {
    private float onExtraCallback;
    private float onExtraCallbackWithResult;

    /* JADX WARN: Illegal instructions before constructor call */
    public excludeChildren() {
        float f = 0.0f;
        this(f, f, 3, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof excludeChildren)) {
            return false;
        }
        excludeChildren excludechildren = (excludeChildren) obj;
        return Float.compare(this.onExtraCallbackWithResult, excludechildren.onExtraCallbackWithResult) == 0 && Float.compare(this.onExtraCallback, excludechildren.onExtraCallback) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.onExtraCallbackWithResult) * 31) + Float.hashCode(this.onExtraCallback);
    }

    public String toString() {
        return "Float2(x=" + this.onExtraCallbackWithResult + ", y=" + this.onExtraCallback + ')';
    }

    public excludeChildren(float f, float f2) {
        this.onExtraCallbackWithResult = f;
        this.onExtraCallback = f2;
    }

    public /* synthetic */ excludeChildren(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }

    public final float IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public final float onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }
}
