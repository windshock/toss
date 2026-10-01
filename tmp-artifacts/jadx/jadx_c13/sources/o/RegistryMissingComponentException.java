package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class RegistryMissingComponentException<K, V, T> implements Iterator<T>, KMappedMarker {
    private boolean IAuthTabCallback;
    private int onNavigationEvent;
    private final rewind<K, V, T>[] onWarmupCompleted;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public RegistryMissingComponentException(@NotNull ResourceEncoder<K, V> resourceEncoder, @NotNull rewind<K, V, T>[] rewindVarArr) {
        Intrinsics.checkNotNullParameter(resourceEncoder, "");
        Intrinsics.checkNotNullParameter(rewindVarArr, "");
        this.onWarmupCompleted = rewindVarArr;
        this.IAuthTabCallback = true;
        rewindVarArr[0].onWarmupCompleted(resourceEncoder.onExtraCallbackWithResult(), resourceEncoder.IAuthTabCallback() << 1);
        this.onNavigationEvent = 0;
        onExtraCallback();
    }

    protected final rewind<K, V, T>[] IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    protected final void IAuthTabCallback(int i) {
        this.onNavigationEvent = i;
    }

    private final int onNavigationEvent(int i) {
        if (this.onWarmupCompleted[i].onWarmupCompleted()) {
            return i;
        }
        if (!this.onWarmupCompleted[i].asBinder()) {
            return -1;
        }
        ResourceEncoder<? extends K, ? extends V> resourceEncoderOnExtraCallbackWithResult = this.onWarmupCompleted[i].onExtraCallbackWithResult();
        if (i == 6) {
            this.onWarmupCompleted[i + 1].onWarmupCompleted(resourceEncoderOnExtraCallbackWithResult.onExtraCallbackWithResult(), resourceEncoderOnExtraCallbackWithResult.onExtraCallbackWithResult().length);
        } else {
            this.onWarmupCompleted[i + 1].onWarmupCompleted(resourceEncoderOnExtraCallbackWithResult.onExtraCallbackWithResult(), resourceEncoderOnExtraCallbackWithResult.IAuthTabCallback() << 1);
        }
        return onNavigationEvent(i + 1);
    }

    private final void onExtraCallback() {
        if (this.onWarmupCompleted[this.onNavigationEvent].onWarmupCompleted()) {
            return;
        }
        for (int i = this.onNavigationEvent; i >= 0; i--) {
            int iOnNavigationEvent = onNavigationEvent(i);
            if (iOnNavigationEvent == -1 && this.onWarmupCompleted[i].asBinder()) {
                this.onWarmupCompleted[i].IAuthTabCallbackDefault();
                iOnNavigationEvent = onNavigationEvent(i);
            }
            if (iOnNavigationEvent != -1) {
                this.onNavigationEvent = iOnNavigationEvent;
                return;
            }
            if (i > 0) {
                this.onWarmupCompleted[i - 1].IAuthTabCallbackDefault();
            }
            this.onWarmupCompleted[i].onWarmupCompleted(ResourceEncoder.Companion.onExtraCallback().onExtraCallbackWithResult(), 0);
        }
        this.IAuthTabCallback = false;
    }

    protected final K onWarmupCompleted() {
        onExtraCallbackWithResult();
        return this.onWarmupCompleted[this.onNavigationEvent].onExtraCallback();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.IAuthTabCallback;
    }

    @Override // java.util.Iterator
    public T next() {
        onExtraCallbackWithResult();
        T next = this.onWarmupCompleted[this.onNavigationEvent].next();
        onExtraCallback();
        return next;
    }

    private final void onExtraCallbackWithResult() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }
}
