package o;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class forceLayout {
    private static final onExtraCallback<Object> onExtraCallbackWithResult = new onExtraCallback<Object>() { // from class: o.forceLayout.3
        @Override // o.forceLayout.onExtraCallback
        public void onExtraCallbackWithResult(@NonNull Object obj) {
        }
    };

    public interface onExtraCallback<T> {
        void onExtraCallbackWithResult(@NonNull T t);
    }

    public interface onExtraCallbackWithResult<T> {
        T IAuthTabCallback();
    }

    public interface onNavigationEvent {
        dispatchDraw ah_();
    }

    public static <T extends onNavigationEvent> Pools.onExtraCallback<T> onNavigationEvent(int i2, @NonNull onExtraCallbackWithResult<T> onextracallbackwithresult) {
        return onNavigationEvent((Pools.onExtraCallback) new Pools.onExtraCallbackWithResult(i2), (onExtraCallbackWithResult) onextracallbackwithresult);
    }

    public static <T> Pools.onExtraCallback<List<T>> IAuthTabCallback() {
        return onNavigationEvent(20);
    }

    public static <T> Pools.onExtraCallback<List<T>> onNavigationEvent(int i2) {
        return onExtraCallback(new Pools.onExtraCallbackWithResult(i2), new onExtraCallbackWithResult<List<T>>() { // from class: o.forceLayout.4
            @Override // o.forceLayout.onExtraCallbackWithResult
            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public List<T> IAuthTabCallback() {
                return new ArrayList();
            }
        }, new onExtraCallback<List<T>>() { // from class: o.forceLayout.5
            @Override // o.forceLayout.onExtraCallback
            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public void onExtraCallbackWithResult(@NonNull List<T> list) {
                list.clear();
            }
        });
    }

    private static <T extends onNavigationEvent> Pools.onExtraCallback<T> onNavigationEvent(@NonNull Pools.onExtraCallback<T> onextracallback, @NonNull onExtraCallbackWithResult<T> onextracallbackwithresult) {
        return onExtraCallback(onextracallback, onextracallbackwithresult, onWarmupCompleted());
    }

    private static <T> Pools.onExtraCallback<T> onExtraCallback(@NonNull Pools.onExtraCallback<T> onextracallback, @NonNull onExtraCallbackWithResult<T> onextracallbackwithresult, @NonNull onExtraCallback<T> onextracallback2) {
        return new onWarmupCompleted(onextracallback, onextracallbackwithresult, onextracallback2);
    }

    private static <T> onExtraCallback<T> onWarmupCompleted() {
        return (onExtraCallback<T>) onExtraCallbackWithResult;
    }

    static final class onWarmupCompleted<T> implements Pools.onExtraCallback<T> {
        private final Pools.onExtraCallback<T> IAuthTabCallback;
        private final onExtraCallbackWithResult<T> onExtraCallback;
        private final onExtraCallback<T> onNavigationEvent;

        onWarmupCompleted(@NonNull Pools.onExtraCallback<T> onextracallback, @NonNull onExtraCallbackWithResult<T> onextracallbackwithresult, @NonNull onExtraCallback<T> onextracallback2) {
            this.IAuthTabCallback = onextracallback;
            this.onExtraCallback = onextracallbackwithresult;
            this.onNavigationEvent = onextracallback2;
        }

        public T onNavigationEvent() {
            T tIAuthTabCallback = (T) this.IAuthTabCallback.onNavigationEvent();
            if (tIAuthTabCallback == null) {
                tIAuthTabCallback = this.onExtraCallback.IAuthTabCallback();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Objects.toString(tIAuthTabCallback.getClass());
                }
            }
            if (tIAuthTabCallback instanceof onNavigationEvent) {
                tIAuthTabCallback.ah_().onNavigationEvent(false);
            }
            return (T) tIAuthTabCallback;
        }

        public boolean onWarmupCompleted(@NonNull T t) {
            if (t instanceof onNavigationEvent) {
                ((onNavigationEvent) t).ah_().onNavigationEvent(true);
            }
            this.onNavigationEvent.onExtraCallbackWithResult(t);
            return this.IAuthTabCallback.onWarmupCompleted(t);
        }
    }
}
