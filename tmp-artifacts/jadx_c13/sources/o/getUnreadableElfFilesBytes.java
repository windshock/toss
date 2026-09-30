package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getUnreadableElfFilesBytes implements getUnreadableElfFilesList<Float> {
    private final float onExtraCallback;
    private final float onExtraCallbackWithResult;

    public boolean onNavigationEvent(float f, float f2) {
        return f <= f2;
    }

    public getUnreadableElfFilesBytes(float f, float f2) {
        this.onExtraCallback = f;
        this.onExtraCallbackWithResult = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getUnreadableElfFilesList
    public /* synthetic */ boolean IAuthTabCallback(Comparable comparable, Comparable comparable2) {
        return onNavigationEvent(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getUnreadableElfFilesList, o.getUnreadableElfFilesCount, o.access4700
    public /* synthetic */ boolean contains(Comparable comparable) {
        return onExtraCallbackWithResult(((Number) comparable).floatValue());
    }

    @Override // o.getUnreadableElfFilesCount, o.access4700
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public Float getStart() {
        return Float.valueOf(this.onExtraCallback);
    }

    @Override // o.getUnreadableElfFilesCount
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public Float getEndInclusive() {
        return Float.valueOf(this.onExtraCallbackWithResult);
    }

    public boolean onExtraCallbackWithResult(float f) {
        return f >= this.onExtraCallback && f <= this.onExtraCallbackWithResult;
    }

    @Override // o.getUnreadableElfFilesList, o.getUnreadableElfFilesCount
    public boolean isEmpty() {
        return this.onExtraCallback > this.onExtraCallbackWithResult;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof getUnreadableElfFilesBytes)) {
            return false;
        }
        if (isEmpty() && ((getUnreadableElfFilesBytes) obj).isEmpty()) {
            return true;
        }
        getUnreadableElfFilesBytes getunreadableelffilesbytes = (getUnreadableElfFilesBytes) obj;
        return this.onExtraCallback == getunreadableelffilesbytes.onExtraCallback && this.onExtraCallbackWithResult == getunreadableelffilesbytes.onExtraCallbackWithResult;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.onExtraCallback) * 31) + Float.hashCode(this.onExtraCallbackWithResult);
    }

    public String toString() {
        return this.onExtraCallback + ".." + this.onExtraCallbackWithResult;
    }
}
