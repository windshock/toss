package o;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.RangesKt___RangesKt;
import o.CheckRequestBodyModelGroup;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class GeckoHubImpa extends CheckRequestBodyModelGroup implements Runnable {
    private static final long IAuthTabCallback;
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final GeckoHubImpa onExtraCallback;

    private GeckoHubImpa() {
    }

    static {
        Long l;
        GeckoHubImpa geckoHubImpa = new GeckoHubImpa();
        onExtraCallback = geckoHubImpa;
        CheckRequestBodyModelLocalChannel.onNavigationEvent(geckoHubImpa, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        IAuthTabCallback = timeUnit.toNanos(l.longValue());
    }

    @Override // o.CheckRequestBodyModelChannels
    protected Thread onExtraCallbackWithResult() {
        Thread thread = _thread;
        return thread == null ? IAuthTabCallback_Parcel() : thread;
    }

    private final boolean access000() {
        return debugStatus == 4;
    }

    private final boolean getInterfaceDescriptor() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    @Override // o.CheckRequestBodyModelGroup
    public void onExtraCallbackWithResult(@NotNull Runnable runnable) {
        if (access000()) {
            ICustomTabsCallback();
        }
        super.onExtraCallbackWithResult(runnable);
    }

    @Override // o.CheckRequestBodyModelChannels
    protected void onExtraCallbackWithResult(long j, @NotNull CheckRequestBodyModelGroup.onExtraCallback onextracallback) {
        ICustomTabsCallback();
    }

    private final void ICustomTabsCallback() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // o.CheckRequestBodyModelGroup, o.CheckRequestBodyModelLocalChannel
    public void onExtraCallback() {
        debugStatus = 4;
        super.onExtraCallback();
    }

    @Override // o.CheckRequestBodyModelGroup, o.BufferOutputStream
    public setDeployments onWarmupCompleted(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return onExtraCallbackWithResult(j, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zOnNavigationEvent;
        isDeleteIfFail.onExtraCallbackWithResult.onNavigationEvent(this);
        try {
            if (!writeTypedObject()) {
                if (zOnNavigationEvent) {
                    return;
                } else {
                    return;
                }
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jAsBinder = asBinder();
                if (jAsBinder == LongCompanionObject.MAX_VALUE) {
                    ResourceDecoderRegistryEntry resourceDecoderRegistryEntry = ResourceEncoderRegistryEntry.IAuthTabCallback;
                    long jOnNavigationEvent = resourceDecoderRegistryEntry != null ? resourceDecoderRegistryEntry.onNavigationEvent() : System.nanoTime();
                    if (j == LongCompanionObject.MAX_VALUE) {
                        j = IAuthTabCallback + jOnNavigationEvent;
                    }
                    long j2 = j - jOnNavigationEvent;
                    if (j2 <= 0) {
                        _thread = null;
                        IAuthTabCallbackStubProxy();
                        if (onNavigationEvent()) {
                            return;
                        }
                        onExtraCallbackWithResult();
                        return;
                    }
                    jAsBinder = RangesKt___RangesKt.coerceAtMost(jAsBinder, j2);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (jAsBinder > 0) {
                    if (getInterfaceDescriptor()) {
                        _thread = null;
                        IAuthTabCallbackStubProxy();
                        if (onNavigationEvent()) {
                            return;
                        }
                        onExtraCallbackWithResult();
                        return;
                    }
                    if (ResourceEncoderRegistryEntry.IAuthTabCallback == null) {
                        LockSupport.parkNanos(this, jAsBinder);
                    }
                }
            }
        } finally {
            _thread = null;
            IAuthTabCallbackStubProxy();
            if (!onNavigationEvent()) {
                onExtraCallbackWithResult();
            }
        }
    }

    private final Thread IAuthTabCallback_Parcel() {
        Thread thread;
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(onExtraCallback.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    private final boolean writeTypedObject() {
        synchronized (this) {
            if (getInterfaceDescriptor()) {
                return false;
            }
            debugStatus = 1;
            Intrinsics.checkNotNull(this, "");
            notifyAll();
            return true;
        }
    }

    private final void IAuthTabCallbackStubProxy() {
        synchronized (this) {
            if (getInterfaceDescriptor()) {
                debugStatus = 3;
                IAuthTabCallbackStub();
                Intrinsics.checkNotNull(this, "");
                notifyAll();
            }
        }
    }

    @Override // o.GeckoHubImp
    public String toString() {
        return "DefaultExecutor";
    }
}
