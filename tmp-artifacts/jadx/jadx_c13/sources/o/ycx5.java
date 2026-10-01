package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import o.ycx5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class ycx5<S extends ycx5<S>> extends getJustifyContent<S> implements UpdatePackagePackage {
    private static final /* synthetic */ AtomicIntegerFieldUpdater onExtraCallbackWithResult = AtomicIntegerFieldUpdater.newUpdater(ycx5.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long onExtraCallback;

    public abstract int IAuthTabCallback();

    public abstract void onNavigationEvent(int i, @Nullable Throwable th, @NotNull CoroutineContext coroutineContext);

    public ycx5(long j, @Nullable S s, int i) {
        super(s);
        this.onExtraCallback = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // o.getJustifyContent
    public boolean asInterface() {
        return onExtraCallbackWithResult.get(this) == IAuthTabCallback() && !asBinder();
    }

    public final boolean IAuthTabCallbackDefault() {
        return onExtraCallbackWithResult.addAndGet(this, -65536) == IAuthTabCallback() && !asBinder();
    }

    public final void access100() {
        if (onExtraCallbackWithResult.incrementAndGet(this) == IAuthTabCallback()) {
            IAuthTabCallbackStub();
        }
    }

    public final boolean IAuthTabCallback_Parcel() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = onExtraCallbackWithResult;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i == IAuthTabCallback() && !asBinder()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, Imgproc.FLOODFILL_FIXED_RANGE + i));
        return true;
    }
}
