package o;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class rewind<K, V, T> implements Iterator<T>, KMappedMarker {
    private Object[] IAuthTabCallback = ResourceEncoder.Companion.onExtraCallback().onExtraCallbackWithResult();
    private int onExtraCallback;
    private int onExtraCallbackWithResult;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    protected final Object[] IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    protected final void onExtraCallbackWithResult(int i) {
        this.onExtraCallback = i;
    }

    protected final int onNavigationEvent() {
        return this.onExtraCallback;
    }

    public final void IAuthTabCallback(@NotNull Object[] objArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(objArr, "");
        this.IAuthTabCallback = objArr;
        this.onExtraCallbackWithResult = i;
        this.onExtraCallback = i2;
    }

    public final void onWarmupCompleted(@NotNull Object[] objArr, int i) {
        Intrinsics.checkNotNullParameter(objArr, "");
        IAuthTabCallback(objArr, i, 0);
    }

    public final boolean onWarmupCompleted() {
        return this.onExtraCallback < this.onExtraCallbackWithResult;
    }

    public final K onExtraCallback() {
        onWarmupCompleted();
        return (K) this.IAuthTabCallback[this.onExtraCallback];
    }

    public final void asInterface() {
        onWarmupCompleted();
        this.onExtraCallback += 2;
    }

    public final boolean asBinder() {
        return this.onExtraCallback < this.IAuthTabCallback.length;
    }

    public final ResourceEncoder<? extends K, ? extends V> onExtraCallbackWithResult() {
        asBinder();
        Object obj = this.IAuthTabCallback[this.onExtraCallback];
        Intrinsics.checkNotNull(obj, "");
        return (ResourceEncoder) obj;
    }

    public final void IAuthTabCallbackDefault() {
        asBinder();
        this.onExtraCallback++;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return onWarmupCompleted();
    }
}
