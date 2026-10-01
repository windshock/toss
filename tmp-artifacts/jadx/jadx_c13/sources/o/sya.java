package o;

import com.google.common.util.concurrent.Striped$SmallLazyStriped$;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class sya<E> extends ycx5<sya<E>> {
    private final nLockFile<E> onExtraCallbackWithResult;
    private final /* synthetic */ AtomicReferenceArray onNavigationEvent;

    private final /* synthetic */ AtomicReferenceArray access000() {
        return this.onNavigationEvent;
    }

    public sya(long j, @Nullable sya<E> syaVar, @Nullable nLockFile<E> nlockfile, int i) {
        super(j, syaVar, i);
        this.onExtraCallbackWithResult = nlockfile;
        this.onNavigationEvent = new AtomicReferenceArray(nTryLock.onNavigationEvent << 1);
    }

    public final nLockFile<E> onExtraCallback() {
        nLockFile<E> nlockfile = this.onExtraCallbackWithResult;
        Intrinsics.checkNotNull(nlockfile);
        return nlockfile;
    }

    @Override // o.ycx5
    public int IAuthTabCallback() {
        return nTryLock.onNavigationEvent;
    }

    public final void onWarmupCompleted(int i, E e) {
        IAuthTabCallback(i, e);
    }

    public final E onNavigationEvent(int i) {
        return (E) access000().get(i << 1);
    }

    public final E IAuthTabCallback(int i) {
        E eOnNavigationEvent = onNavigationEvent(i);
        onWarmupCompleted(i);
        return eOnNavigationEvent;
    }

    public final void onWarmupCompleted(int i) {
        IAuthTabCallback(i, null);
    }

    private final void IAuthTabCallback(int i, Object obj) {
        access000().set(i << 1, obj);
    }

    public final Object onExtraCallback(int i) {
        return access000().get((i << 1) + 1);
    }

    public final void onNavigationEvent(int i, @Nullable Object obj) {
        access000().set((i << 1) + 1, obj);
    }

    public final boolean onExtraCallback(int i, @Nullable Object obj, @Nullable Object obj2) {
        return Striped$SmallLazyStriped$.ExternalSyntheticBackportWithForwarding0.onExtraCallbackWithResult(access000(), (i << 1) + 1, obj, obj2);
    }

    public final Object onExtraCallbackWithResult(int i, @Nullable Object obj) {
        return access000().getAndSet((i << 1) + 1, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
    
        onWarmupCompleted(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        if (r0 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        r4 = onExtraCallback().IAuthTabCallback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r4 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        o.ycx7.onExtraCallback(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
    
        return;
     */
    @Override // o.ycx5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNavigationEvent(int i, @Nullable Throwable th, @NotNull CoroutineContext coroutineContext) {
        Function1<E, Unit> function1;
        int i2 = nTryLock.onNavigationEvent;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        E eOnNavigationEvent = onNavigationEvent(i);
        while (true) {
            Object objOnExtraCallback = onExtraCallback(i);
            if (!(objOnExtraCallback instanceof syncDoGet) && !(objOnExtraCallback instanceof thx)) {
                if (objOnExtraCallback == nTryLock.onTransact || objOnExtraCallback == nTryLock.IAuthTabCallbackStub) {
                    break;
                }
                if (objOnExtraCallback != nTryLock.extraCallback && objOnExtraCallback != nTryLock.writeTypedObject) {
                    if (objOnExtraCallback == nTryLock.asInterface || objOnExtraCallback == nTryLock.onExtraCallbackWithResult || objOnExtraCallback == nTryLock.extraCallback()) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objOnExtraCallback).toString());
                }
            } else {
                if (onExtraCallback(i, objOnExtraCallback, z ? nTryLock.onTransact : nTryLock.IAuthTabCallbackStub)) {
                    onWarmupCompleted(i);
                    onWarmupCompleted(i, !z);
                    if (!z || (function1 = onExtraCallback().IAuthTabCallback) == null) {
                        return;
                    }
                    ycx7.onExtraCallback(function1, eOnNavigationEvent, coroutineContext);
                    return;
                }
            }
        }
    }

    public final void onWarmupCompleted(int i, boolean z) {
        if (z) {
            onExtraCallback().onExtraCallback((this.onExtraCallback * nTryLock.onNavigationEvent) + i);
        }
        access100();
    }
}
