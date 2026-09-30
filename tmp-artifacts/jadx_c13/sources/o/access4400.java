package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access4400 implements access4700<Float> {
    private final float onExtraCallback;
    private final float onExtraCallbackWithResult;

    public access4400(float f, float f2) {
        this.onExtraCallback = f;
        this.onExtraCallbackWithResult = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.access4700
    public /* synthetic */ boolean contains(Comparable comparable) {
        return onWarmupCompleted(((Number) comparable).floatValue());
    }

    @Override // o.access4700
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public Float getStart() {
        return Float.valueOf(this.onExtraCallback);
    }

    @Override // o.access4700
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public Float getEndExclusive() {
        return Float.valueOf(this.onExtraCallbackWithResult);
    }

    public boolean onWarmupCompleted(float f) {
        return f >= this.onExtraCallback && f < this.onExtraCallbackWithResult;
    }

    public boolean onExtraCallbackWithResult() {
        return this.onExtraCallback >= this.onExtraCallbackWithResult;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof access4400)) {
            return false;
        }
        if (onExtraCallbackWithResult() && ((access4400) obj).onExtraCallbackWithResult()) {
            return true;
        }
        access4400 access4400Var = (access4400) obj;
        return this.onExtraCallback == access4400Var.onExtraCallback && this.onExtraCallbackWithResult == access4400Var.onExtraCallbackWithResult;
    }

    public int hashCode() {
        if (onExtraCallbackWithResult()) {
            return -1;
        }
        return (Float.hashCode(this.onExtraCallback) * 31) + Float.hashCode(this.onExtraCallbackWithResult);
    }

    public String toString() {
        return this.onExtraCallback + "..<" + this.onExtraCallbackWithResult;
    }
}
