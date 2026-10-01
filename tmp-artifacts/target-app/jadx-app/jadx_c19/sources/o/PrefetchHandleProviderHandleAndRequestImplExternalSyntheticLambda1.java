package o;

import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda1 {
    private LazyLayoutKtExternalSyntheticLambda3 IAuthTabCallback;
    private volatile LazyLayoutKtExternalSyntheticLambda3 onExtraCallback;
    private LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 onExtraCallbackWithResult;
    protected volatile LazyStaggeredGridMeasureKtExternalSyntheticLambda1 onNavigationEvent;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda1)) {
            return false;
        }
        PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda1 prefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda1 = (PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda1) obj;
        LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda1 = this.onNavigationEvent;
        LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda12 = prefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda1.onNavigationEvent;
        if (lazyStaggeredGridMeasureKtExternalSyntheticLambda1 == null && lazyStaggeredGridMeasureKtExternalSyntheticLambda12 == null) {
            return onExtraCallbackWithResult().equals(prefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda1.onExtraCallbackWithResult());
        }
        if (lazyStaggeredGridMeasureKtExternalSyntheticLambda1 != null && lazyStaggeredGridMeasureKtExternalSyntheticLambda12 != null) {
            return lazyStaggeredGridMeasureKtExternalSyntheticLambda1.equals(lazyStaggeredGridMeasureKtExternalSyntheticLambda12);
        }
        if (lazyStaggeredGridMeasureKtExternalSyntheticLambda1 != null) {
            return lazyStaggeredGridMeasureKtExternalSyntheticLambda1.equals(prefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda1.onExtraCallbackWithResult(lazyStaggeredGridMeasureKtExternalSyntheticLambda1.readTypedObject()));
        }
        return onExtraCallbackWithResult(lazyStaggeredGridMeasureKtExternalSyntheticLambda12.readTypedObject()).equals(lazyStaggeredGridMeasureKtExternalSyntheticLambda12);
    }

    public LazyStaggeredGridMeasureKtExternalSyntheticLambda1 onExtraCallbackWithResult(LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda1) {
        IAuthTabCallback(lazyStaggeredGridMeasureKtExternalSyntheticLambda1);
        return this.onNavigationEvent;
    }

    public LazyStaggeredGridMeasureKtExternalSyntheticLambda1 onNavigationEvent(LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda1) {
        LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda12 = this.onNavigationEvent;
        this.IAuthTabCallback = null;
        this.onExtraCallback = null;
        this.onNavigationEvent = lazyStaggeredGridMeasureKtExternalSyntheticLambda1;
        return lazyStaggeredGridMeasureKtExternalSyntheticLambda12;
    }

    public int onWarmupCompleted() {
        if (this.onExtraCallback != null) {
            return this.onExtraCallback.onTransact();
        }
        LazyLayoutKtExternalSyntheticLambda3 lazyLayoutKtExternalSyntheticLambda3 = this.IAuthTabCallback;
        if (lazyLayoutKtExternalSyntheticLambda3 != null) {
            return lazyLayoutKtExternalSyntheticLambda3.onTransact();
        }
        if (this.onNavigationEvent != null) {
            return this.onNavigationEvent.ICustomTabsCallback();
        }
        return 0;
    }

    public LazyLayoutKtExternalSyntheticLambda3 onExtraCallbackWithResult() {
        if (this.onExtraCallback != null) {
            return this.onExtraCallback;
        }
        LazyLayoutKtExternalSyntheticLambda3 lazyLayoutKtExternalSyntheticLambda3 = this.IAuthTabCallback;
        if (lazyLayoutKtExternalSyntheticLambda3 != null) {
            return lazyLayoutKtExternalSyntheticLambda3;
        }
        synchronized (this) {
            if (this.onExtraCallback != null) {
                return this.onExtraCallback;
            }
            if (this.onNavigationEvent == null) {
                this.onExtraCallback = LazyLayoutKtExternalSyntheticLambda3.onExtraCallbackWithResult;
            } else {
                this.onExtraCallback = this.onNavigationEvent.asBinder();
            }
            return this.onExtraCallback;
        }
    }

    protected void IAuthTabCallback(LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda1) {
        if (this.onNavigationEvent == null) {
            synchronized (this) {
                if (this.onNavigationEvent != null) {
                    return;
                }
                try {
                    if (this.IAuthTabCallback != null) {
                        this.onNavigationEvent = lazyStaggeredGridMeasureKtExternalSyntheticLambda1.writeTypedObject().onNavigationEvent(this.IAuthTabCallback, this.onExtraCallbackWithResult);
                        this.onExtraCallback = this.IAuthTabCallback;
                    } else {
                        this.onNavigationEvent = lazyStaggeredGridMeasureKtExternalSyntheticLambda1;
                        this.onExtraCallback = LazyLayoutKtExternalSyntheticLambda3.onExtraCallbackWithResult;
                    }
                } catch (InvalidProtocolBufferException unused) {
                    this.onNavigationEvent = lazyStaggeredGridMeasureKtExternalSyntheticLambda1;
                    this.onExtraCallback = LazyLayoutKtExternalSyntheticLambda3.onExtraCallbackWithResult;
                }
            }
        }
    }
}
