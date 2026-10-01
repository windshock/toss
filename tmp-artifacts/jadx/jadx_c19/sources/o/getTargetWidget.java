package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class getTargetWidget<T, Y> {
    private long IAuthTabCallback;
    private long onExtraCallback;
    private final long onNavigationEvent;
    private final Map<T, IAuthTabCallback<Y>> onWarmupCompleted = new LinkedHashMap(100, 0.75f, true);

    protected void IAuthTabCallback(@NonNull T t, @Nullable Y y) {
    }

    public int onWarmupCompleted(@Nullable Y y) {
        return 1;
    }

    public getTargetWidget(long j) {
        this.onNavigationEvent = j;
        this.onExtraCallback = j;
    }

    public long onNavigationEvent() {
        long j;
        synchronized (this) {
            j = this.onExtraCallback;
        }
        return j;
    }

    public Y IAuthTabCallback(@NonNull T t) {
        Y y;
        synchronized (this) {
            IAuthTabCallback<Y> iAuthTabCallback = this.onWarmupCompleted.get(t);
            y = iAuthTabCallback != null ? iAuthTabCallback.onWarmupCompleted : null;
        }
        return y;
    }

    public Y onNavigationEvent(@NonNull T t, @Nullable Y y) {
        synchronized (this) {
            int iOnWarmupCompleted = onWarmupCompleted(y);
            long j = iOnWarmupCompleted;
            if (j >= this.onExtraCallback) {
                IAuthTabCallback(t, y);
                return null;
            }
            if (y != null) {
                this.IAuthTabCallback += j;
            }
            IAuthTabCallback<Y> iAuthTabCallbackPut = this.onWarmupCompleted.put(t, y == null ? null : new IAuthTabCallback<>(y, iOnWarmupCompleted));
            if (iAuthTabCallbackPut != null) {
                this.IAuthTabCallback -= iAuthTabCallbackPut.onExtraCallbackWithResult;
                if (!iAuthTabCallbackPut.onWarmupCompleted.equals(y)) {
                    IAuthTabCallback(t, iAuthTabCallbackPut.onWarmupCompleted);
                }
            }
            onExtraCallback();
            return iAuthTabCallbackPut != null ? iAuthTabCallbackPut.onWarmupCompleted : null;
        }
    }

    public Y onNavigationEvent(@NonNull T t) {
        synchronized (this) {
            IAuthTabCallback<Y> iAuthTabCallbackRemove = this.onWarmupCompleted.remove(t);
            if (iAuthTabCallbackRemove == null) {
                return null;
            }
            this.IAuthTabCallback -= iAuthTabCallbackRemove.onExtraCallbackWithResult;
            return iAuthTabCallbackRemove.onWarmupCompleted;
        }
    }

    public void onWarmupCompleted() {
        onNavigationEvent(0L);
    }

    public void onNavigationEvent(long j) {
        synchronized (this) {
            while (this.IAuthTabCallback > j) {
                Iterator<Map.Entry<T, IAuthTabCallback<Y>>> it = this.onWarmupCompleted.entrySet().iterator();
                Map.Entry<T, IAuthTabCallback<Y>> next = it.next();
                IAuthTabCallback<Y> value = next.getValue();
                this.IAuthTabCallback -= value.onExtraCallbackWithResult;
                T key = next.getKey();
                it.remove();
                IAuthTabCallback(key, value.onWarmupCompleted);
            }
        }
    }

    private void onExtraCallback() {
        onNavigationEvent(this.onExtraCallback);
    }

    static final class IAuthTabCallback<Y> {
        final int onExtraCallbackWithResult;
        final Y onWarmupCompleted;

        IAuthTabCallback(Y y, int i2) {
            this.onWarmupCompleted = y;
            this.onExtraCallbackWithResult = i2;
        }
    }
}
