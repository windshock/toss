package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setWidgetBaseline {
    private Class<?> IAuthTabCallback;
    private Class<?> onNavigationEvent;
    private Class<?> onWarmupCompleted;

    public setWidgetBaseline() {
    }

    public setWidgetBaseline(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        IAuthTabCallback(cls, cls2, cls3);
    }

    public void IAuthTabCallback(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.onWarmupCompleted = cls;
        this.onNavigationEvent = cls2;
        this.IAuthTabCallback = cls3;
    }

    public String toString() {
        return "MultiClassKey{first=" + this.onWarmupCompleted + ", second=" + this.onNavigationEvent + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setWidgetBaseline setwidgetbaseline = (setWidgetBaseline) obj;
        return this.onWarmupCompleted.equals(setwidgetbaseline.onWarmupCompleted) && this.onNavigationEvent.equals(setwidgetbaseline.onNavigationEvent) && applyConstraintsFromLayoutParams.onExtraCallback(this.IAuthTabCallback, setwidgetbaseline.IAuthTabCallback);
    }

    public int hashCode() {
        int iHashCode = this.onWarmupCompleted.hashCode();
        int iHashCode2 = this.onNavigationEvent.hashCode();
        Class<?> cls = this.IAuthTabCallback;
        return (((iHashCode * 31) + iHashCode2) * 31) + (cls != null ? cls.hashCode() : 0);
    }
}
