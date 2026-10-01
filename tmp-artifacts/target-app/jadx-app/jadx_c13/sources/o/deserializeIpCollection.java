package o;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class deserializeIpCollection implements deserializeUriNullableCollection {
    private final AtomicBoolean onNavigationEvent = new AtomicBoolean();

    protected abstract void IAuthTabCallback();

    @Override // o.deserializeUriNullableCollection
    public final boolean isDisposed() {
        return this.onNavigationEvent.get();
    }

    @Override // o.deserializeUriNullableCollection
    public final void dispose() {
        if (this.onNavigationEvent.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                IAuthTabCallback();
            } else {
                NetConverter3.onExtraCallback().onExtraCallback(new Runnable() { // from class: o.deserializeIpCollection.2
                    @Override // java.lang.Runnable
                    public void run() {
                        deserializeIpCollection.this.IAuthTabCallback();
                    }
                });
            }
        }
    }
}
