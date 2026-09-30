package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
import o.extractTombstoneThreads;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class extractTombstoneThreads {
    private static final extractTombstoneThreads onNavigationEvent = new extractTombstoneThreads().IAuthTabCallbackDefault();
    private static final extractTombstoneThreads onWarmupCompleted = new extractTombstoneThreads().onWarmupCompleted();

    @Nullable
    private Boolean onExtraCallback = null;

    @Nullable
    private Throwable onTransact = null;
    private final List<Runnable> IAuthTabCallback = new ArrayList();
    private final Object onExtraCallbackWithResult = new Object();

    public static extractTombstoneThreads IAuthTabCallback() {
        return onNavigationEvent;
    }

    public static extractTombstoneThreads onExtraCallbackWithResult() {
        return onWarmupCompleted;
    }

    public static extractTombstoneThreads IAuthTabCallback(Throwable th) {
        return new extractTombstoneThreads().onExtraCallbackWithResult(th);
    }

    public static extractTombstoneThreads onExtraCallback(Collection<extractTombstoneThreads> collection) {
        if (collection.isEmpty()) {
            return IAuthTabCallback();
        }
        final extractTombstoneThreads extracttombstonethreads = new extractTombstoneThreads();
        final AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final AtomicReference atomicReference = new AtomicReference();
        for (final extractTombstoneThreads extracttombstonethreads2 : collection) {
            extracttombstonethreads2.onExtraCallback(new Runnable() { // from class: io.opentelemetry.sdk.common.CompletableResultCode$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    extractTombstoneThreads.onExtraCallback(this.f$0, atomicBoolean, atomicReference, atomicInteger, extracttombstonethreads);
                }
            });
        }
        return extracttombstonethreads;
    }

    public static /* synthetic */ void onExtraCallback(extractTombstoneThreads extracttombstonethreads, AtomicBoolean atomicBoolean, AtomicReference atomicReference, AtomicInteger atomicInteger, extractTombstoneThreads extracttombstonethreads2) {
        if (!extracttombstonethreads.IAuthTabCallbackStub()) {
            atomicBoolean.set(true);
            Throwable thOnExtraCallback = extracttombstonethreads.onExtraCallback();
            if (thOnExtraCallback != null) {
                setSupportImageTintList.onNavigationEvent(atomicReference, (Object) null, thOnExtraCallback);
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            if (atomicBoolean.get()) {
                extracttombstonethreads2.onExtraCallback((Throwable) atomicReference.get());
            } else {
                extracttombstonethreads2.IAuthTabCallbackDefault();
            }
        }
    }

    public extractTombstoneThreads IAuthTabCallbackDefault() {
        synchronized (this.onExtraCallbackWithResult) {
            if (this.onExtraCallback == null) {
                this.onExtraCallback = Boolean.TRUE;
                Iterator<Runnable> it = this.IAuthTabCallback.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
            }
        }
        return this;
    }

    public extractTombstoneThreads onWarmupCompleted() {
        return onExtraCallback((Throwable) null);
    }

    public extractTombstoneThreads onExtraCallbackWithResult(@Nullable Throwable th) {
        return onExtraCallback(th);
    }

    private extractTombstoneThreads onExtraCallback(@Nullable Throwable th) {
        synchronized (this.onExtraCallbackWithResult) {
            if (this.onExtraCallback == null) {
                this.onExtraCallback = Boolean.FALSE;
                this.onTransact = th;
                Iterator<Runnable> it = this.IAuthTabCallback.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
            }
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean IAuthTabCallbackStub() {
        boolean z;
        synchronized (this.onExtraCallbackWithResult) {
            Boolean bool = this.onExtraCallback;
            if (bool != null) {
                z = bool.booleanValue();
            }
        }
        return z;
    }

    @Nullable
    public Throwable onExtraCallback() {
        Throwable th;
        synchronized (this.onExtraCallbackWithResult) {
            th = this.onTransact;
        }
        return th;
    }

    public extractTombstoneThreads onExtraCallback(Runnable runnable) {
        boolean z;
        synchronized (this.onExtraCallbackWithResult) {
            if (this.onExtraCallback != null) {
                z = true;
            } else {
                this.IAuthTabCallback.add(runnable);
                z = false;
            }
        }
        if (z) {
            runnable.run();
        }
        return this;
    }

    public boolean onNavigationEvent() {
        boolean z;
        synchronized (this.onExtraCallbackWithResult) {
            z = this.onExtraCallback != null;
        }
        return z;
    }

    public extractTombstoneThreads onNavigationEvent(long j, TimeUnit timeUnit) throws InterruptedException {
        if (onNavigationEvent()) {
            return this;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        onExtraCallback(new Runnable() { // from class: io.opentelemetry.sdk.common.CompletableResultCode$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(j, timeUnit);
            return this;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return this;
        }
    }
}
