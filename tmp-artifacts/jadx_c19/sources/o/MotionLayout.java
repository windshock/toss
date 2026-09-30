package o;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class MotionLayout {
    private final AtomicReference<setWidgetBaseline> onExtraCallbackWithResult = new AtomicReference<>();
    private final onMeasure<setWidgetBaseline, List<Class<?>>> onWarmupCompleted = new onMeasure<>();

    public List<Class<?>> IAuthTabCallback(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3) {
        List<Class<?>> list;
        setWidgetBaseline andSet = this.onExtraCallbackWithResult.getAndSet(null);
        if (andSet == null) {
            andSet = new setWidgetBaseline(cls, cls2, cls3);
        } else {
            andSet.IAuthTabCallback(cls, cls2, cls3);
        }
        synchronized (this.onWarmupCompleted) {
            list = (List) this.onWarmupCompleted.get(andSet);
        }
        this.onExtraCallbackWithResult.set(andSet);
        return list;
    }

    public void onWarmupCompleted(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3, @NonNull List<Class<?>> list) {
        synchronized (this.onWarmupCompleted) {
            this.onWarmupCompleted.put(new setWidgetBaseline(cls, cls2, cls3), list);
        }
    }
}
