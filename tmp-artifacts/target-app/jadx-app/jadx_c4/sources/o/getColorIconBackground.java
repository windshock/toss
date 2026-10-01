package o;

import android.os.SystemClock;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getColorIconBackground<T> implements JsonEncodingException<T> {
    private long IAuthTabCallback = Long.MAX_VALUE;
    private T onExtraCallback;
    private Long onExtraCallbackWithResult;

    @Override // o.JsonEncodingException
    public void onExtraCallback(@Nullable T t) {
        synchronized (this) {
            this.onExtraCallback = t;
            this.onExtraCallbackWithResult = Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    @Override // o.JsonEncodingException
    public T onNavigationEvent() {
        synchronized (this) {
            if (this.IAuthTabCallback <= 0) {
                return null;
            }
            Long l = this.onExtraCallbackWithResult;
            if (l == null) {
                return null;
            }
            long jLongValue = l.longValue();
            T t = this.onExtraCallback;
            if (t == null) {
                return null;
            }
            return SystemClock.elapsedRealtime() - jLongValue <= this.IAuthTabCallback ? t : null;
        }
    }

    @Override // o.JsonEncodingException
    public void onExtraCallbackWithResult(long j) {
        synchronized (this) {
            this.IAuthTabCallback = j;
            if (this.onExtraCallback != null && this.onExtraCallbackWithResult == null) {
                this.onExtraCallbackWithResult = Long.valueOf(SystemClock.elapsedRealtime());
            }
        }
    }

    @Override // o.JsonEncodingException
    public void onWarmupCompleted() {
        synchronized (this) {
            this.onExtraCallback = null;
            this.onExtraCallbackWithResult = null;
        }
    }
}
