package io.realm.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import o.access21700;
import o.access22100;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NativeObjectReference extends PhantomReference<access22100> {
    private static onNavigationEvent onExtraCallback = new onNavigationEvent();
    private final access21700 IAuthTabCallback;
    private NativeObjectReference asBinder;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private NativeObjectReference onWarmupCompleted;

    static native void nativeCleanUp(long j, long j2);

    static class onNavigationEvent {
        NativeObjectReference onExtraCallbackWithResult;

        private onNavigationEvent() {
        }

        void onExtraCallbackWithResult(NativeObjectReference nativeObjectReference) {
            synchronized (this) {
                nativeObjectReference.asBinder = null;
                nativeObjectReference.onWarmupCompleted = this.onExtraCallbackWithResult;
                NativeObjectReference nativeObjectReference2 = this.onExtraCallbackWithResult;
                if (nativeObjectReference2 != null) {
                    nativeObjectReference2.asBinder = nativeObjectReference;
                }
                this.onExtraCallbackWithResult = nativeObjectReference;
            }
        }

        void onExtraCallback(NativeObjectReference nativeObjectReference) {
            synchronized (this) {
                NativeObjectReference nativeObjectReference2 = nativeObjectReference.onWarmupCompleted;
                NativeObjectReference nativeObjectReference3 = nativeObjectReference.asBinder;
                nativeObjectReference.onWarmupCompleted = null;
                nativeObjectReference.asBinder = null;
                if (nativeObjectReference3 != null) {
                    nativeObjectReference3.onWarmupCompleted = nativeObjectReference2;
                } else {
                    this.onExtraCallbackWithResult = nativeObjectReference2;
                }
                if (nativeObjectReference2 != null) {
                    nativeObjectReference2.asBinder = nativeObjectReference3;
                }
            }
        }
    }

    public NativeObjectReference(access21700 access21700Var, access22100 access22100Var, ReferenceQueue<? super access22100> referenceQueue) {
        super(access22100Var, referenceQueue);
        this.onNavigationEvent = access22100Var.getNativePtr();
        this.onExtraCallbackWithResult = access22100Var.getNativeFinalizerPtr();
        this.IAuthTabCallback = access21700Var;
        onExtraCallback.onExtraCallbackWithResult(this);
    }

    public void onWarmupCompleted() {
        synchronized (this.IAuthTabCallback) {
            nativeCleanUp(this.onExtraCallbackWithResult, this.onNavigationEvent);
        }
        onExtraCallback.onExtraCallback(this);
    }
}
