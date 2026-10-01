package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setShowDivider extends GeckoHubImp implements BufferOutputStream {
    private static final /* synthetic */ AtomicIntegerFieldUpdater onNavigationEvent = AtomicIntegerFieldUpdater.newUpdater(setShowDivider.class, "runningWorkers$volatile");
    private final GeckoHubImp IAuthTabCallback;
    private final ycx3<Runnable> IAuthTabCallbackDefault;
    private final int IAuthTabCallbackStub;
    private final String asBinder;
    private final Object asInterface;
    private final /* synthetic */ BufferOutputStream onExtraCallback;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater IAuthTabCallback() {
        return onNavigationEvent;
    }

    @Override // o.BufferOutputStream
    public setDeployments onWarmupCompleted(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return this.onExtraCallback.onWarmupCompleted(j, runnable, coroutineContext);
    }

    @Override // o.BufferOutputStream
    public void onWarmupCompleted(long j, @NotNull maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener) {
        this.onExtraCallback.onWarmupCompleted(j, mayberemoveattachstatelistener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setShowDivider(@NotNull GeckoHubImp geckoHubImp, int i, @Nullable String str) {
        BufferOutputStream bufferOutputStream = geckoHubImp instanceof BufferOutputStream ? (BufferOutputStream) geckoHubImp : null;
        this.onExtraCallback = bufferOutputStream == null ? releaseGeckoResLoader.onExtraCallback() : bufferOutputStream;
        this.IAuthTabCallback = geckoHubImp;
        this.IAuthTabCallbackStub = i;
        this.asBinder = str;
        this.IAuthTabCallbackDefault = new ycx3<>(false);
        this.asInterface = new Object();
    }

    @Override // o.GeckoHubImp
    public GeckoHubImp onWarmupCompleted(int i, @Nullable String str) {
        setShowDividerHorizontal.onNavigationEvent(i);
        return i >= this.IAuthTabCallbackStub ? setShowDividerHorizontal.onExtraCallback(this, str) : super.onWarmupCompleted(i, str);
    }

    private final boolean onExtraCallbackWithResult() {
        synchronized (this.asInterface) {
            if (onNavigationEvent.get(this) >= this.IAuthTabCallbackStub) {
                return false;
            }
            onNavigationEvent.incrementAndGet(this);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable onWarmupCompleted() {
        while (true) {
            Runnable runnableOnNavigationEvent = this.IAuthTabCallbackDefault.onNavigationEvent();
            if (runnableOnNavigationEvent != null) {
                return runnableOnNavigationEvent;
            }
            synchronized (this.asInterface) {
                onNavigationEvent.decrementAndGet(this);
                if (this.IAuthTabCallbackDefault.onExtraCallbackWithResult() == 0) {
                    return null;
                }
                onNavigationEvent.incrementAndGet(this);
            }
        }
    }

    @Override // o.GeckoHubImp
    public String toString() {
        String str = this.asBinder;
        if (str != null) {
            return str;
        }
        return this.IAuthTabCallback + ".limitedParallelism(" + this.IAuthTabCallbackStub + ')';
    }

    final class onExtraCallbackWithResult implements Runnable {
        private Runnable onExtraCallbackWithResult;

        public onExtraCallbackWithResult(@NotNull Runnable runnable) {
            this.onExtraCallbackWithResult = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            while (true) {
                try {
                    this.onExtraCallbackWithResult.run();
                } catch (Throwable th) {
                    inst.onNavigationEvent(access13600.IAuthTabCallback, th);
                }
                Runnable runnableOnWarmupCompleted = setShowDivider.this.onWarmupCompleted();
                if (runnableOnWarmupCompleted == null) {
                    return;
                }
                try {
                    this.onExtraCallbackWithResult = runnableOnWarmupCompleted;
                    i++;
                    if (i >= 16 && setMaxLine.onWarmupCompleted(setShowDivider.this.IAuthTabCallback, setShowDivider.this)) {
                        setMaxLine.IAuthTabCallback(setShowDivider.this.IAuthTabCallback, setShowDivider.this, this);
                        return;
                    }
                } catch (Throwable th2) {
                    Object obj = setShowDivider.this.asInterface;
                    setShowDivider setshowdivider = setShowDivider.this;
                    synchronized (obj) {
                        setShowDivider.IAuthTabCallback().decrementAndGet(setshowdivider);
                        throw th2;
                    }
                }
            }
        }
    }

    @Override // o.GeckoHubImp
    public void onWarmupCompleted(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        Runnable runnableOnWarmupCompleted;
        this.IAuthTabCallbackDefault.onNavigationEvent(runnable);
        if (onNavigationEvent.get(this) >= this.IAuthTabCallbackStub || !onExtraCallbackWithResult() || (runnableOnWarmupCompleted = onWarmupCompleted()) == null) {
            return;
        }
        try {
            setMaxLine.IAuthTabCallback(this.IAuthTabCallback, this, new onExtraCallbackWithResult(runnableOnWarmupCompleted));
        } catch (Throwable th) {
            onNavigationEvent.decrementAndGet(this);
            throw th;
        }
    }

    @Override // o.GeckoHubImp
    public void onExtraCallback(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        Runnable runnableOnWarmupCompleted;
        this.IAuthTabCallbackDefault.onNavigationEvent(runnable);
        if (onNavigationEvent.get(this) >= this.IAuthTabCallbackStub || !onExtraCallbackWithResult() || (runnableOnWarmupCompleted = onWarmupCompleted()) == null) {
            return;
        }
        try {
            this.IAuthTabCallback.onExtraCallback(this, new onExtraCallbackWithResult(runnableOnWarmupCompleted));
        } catch (Throwable th) {
            onNavigationEvent.decrementAndGet(this);
            throw th;
        }
    }
}
