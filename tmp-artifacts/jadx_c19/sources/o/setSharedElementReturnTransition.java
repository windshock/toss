package o;

import com.alibaba.ariver.kernel.RVParams;
import com.fasterxml.jackson.core.util.RecyclerPool;
import com.google.android.gms.wearable.WearableStatusCodes;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setSharedElementReturnTransition implements RecyclerPool.WithPool<setSharedElementReturnTransition> {
    protected final AtomicReferenceArray<byte[]> onExtraCallbackWithResult;
    protected final AtomicReferenceArray<char[]> onNavigationEvent;
    private RecyclerPool<setSharedElementReturnTransition> onWarmupCompleted;
    private static final int[] onExtraCallback = {8000, 8000, 2000, 2000};
    private static final int[] IAuthTabCallback = {WearableStatusCodes.TARGET_NODE_NOT_CONNECTED, WearableStatusCodes.TARGET_NODE_NOT_CONNECTED, RVParams.WEBVIEW_FONT_SIZE_LARGEST, RVParams.WEBVIEW_FONT_SIZE_LARGEST};

    public interface IAuthTabCallback {
        setSharedElementReturnTransition onWarmupCompleted();
    }

    @Override // com.fasterxml.jackson.core.util.RecyclerPool.WithPool
    public /* synthetic */ RecyclerPool.WithPool onExtraCallbackWithResult(RecyclerPool recyclerPool) {
        return onWarmupCompleted((RecyclerPool<setSharedElementReturnTransition>) recyclerPool);
    }

    public setSharedElementReturnTransition() {
        this(4, 4);
    }

    protected setSharedElementReturnTransition(int i2, int i3) {
        this.onExtraCallbackWithResult = new AtomicReferenceArray<>(i2);
        this.onNavigationEvent = new AtomicReferenceArray<>(i3);
    }

    public final byte[] onExtraCallbackWithResult(int i2) {
        return onNavigationEvent(i2, 0);
    }

    public byte[] onNavigationEvent(int i2, int i3) {
        int iOnNavigationEvent = onNavigationEvent(i2);
        if (i3 < iOnNavigationEvent) {
            i3 = iOnNavigationEvent;
        }
        byte[] andSet = this.onExtraCallbackWithResult.getAndSet(i2, null);
        return (andSet == null || andSet.length < i3) ? onWarmupCompleted(i3) : andSet;
    }

    public void onNavigationEvent(int i2, byte[] bArr) {
        byte[] bArr2 = this.onExtraCallbackWithResult.get(i2);
        if (bArr2 == null || bArr.length > bArr2.length) {
            this.onExtraCallbackWithResult.set(i2, bArr);
        }
    }

    public final char[] IAuthTabCallback(int i2) {
        return IAuthTabCallback(i2, 0);
    }

    public char[] IAuthTabCallback(int i2, int i3) {
        int iAsBinder = asBinder(i2);
        if (i3 < iAsBinder) {
            i3 = iAsBinder;
        }
        char[] andSet = this.onNavigationEvent.getAndSet(i2, null);
        return (andSet == null || andSet.length < i3) ? onExtraCallback(i3) : andSet;
    }

    public void IAuthTabCallback(int i2, char[] cArr) {
        char[] cArr2 = this.onNavigationEvent.get(i2);
        if (cArr2 == null || cArr.length > cArr2.length) {
            this.onNavigationEvent.set(i2, cArr);
        }
    }

    protected int onNavigationEvent(int i2) {
        return onExtraCallback[i2];
    }

    protected int asBinder(int i2) {
        return IAuthTabCallback[i2];
    }

    protected byte[] onWarmupCompleted(int i2) {
        return new byte[i2];
    }

    protected char[] onExtraCallback(int i2) {
        return new char[i2];
    }

    public setSharedElementReturnTransition onWarmupCompleted(RecyclerPool<setSharedElementReturnTransition> recyclerPool) {
        if (this.onWarmupCompleted != null) {
            throw new IllegalStateException("BufferRecycler already linked to pool: " + recyclerPool);
        }
        Objects.requireNonNull(recyclerPool);
        this.onWarmupCompleted = recyclerPool;
        return this;
    }

    public void onNavigationEvent() {
        RecyclerPool<setSharedElementReturnTransition> recyclerPool = this.onWarmupCompleted;
        if (recyclerPool != null) {
            this.onWarmupCompleted = null;
            recyclerPool.onExtraCallback(this);
        }
    }
}
