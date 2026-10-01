package o;

import com.bumptech.glide.load.engine.Resource;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SaversKtExternalSyntheticLambda60<Z> implements Resource<Z> {
    private int IAuthTabCallback;
    private final IAuthTabCallback IAuthTabCallbackDefault;
    private final Resource<Z> asInterface;
    private boolean onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final SaversKtExternalSyntheticLambda26 onWarmupCompleted;

    interface IAuthTabCallback {
        void onExtraCallbackWithResult(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, SaversKtExternalSyntheticLambda60<?> saversKtExternalSyntheticLambda60);
    }

    SaversKtExternalSyntheticLambda60(Resource<Z> resource, boolean z, boolean z2, SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, IAuthTabCallback iAuthTabCallback) {
        this.asInterface = (Resource) markHierarchyDirty.onExtraCallbackWithResult(resource);
        this.onExtraCallbackWithResult = z;
        this.onNavigationEvent = z2;
        this.onWarmupCompleted = saversKtExternalSyntheticLambda26;
        this.IAuthTabCallbackDefault = (IAuthTabCallback) markHierarchyDirty.onExtraCallbackWithResult(iAuthTabCallback);
    }

    Resource<Z> onNavigationEvent() {
        return this.asInterface;
    }

    boolean asInterface() {
        return this.onExtraCallbackWithResult;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public Class<Z> onExtraCallbackWithResult() {
        return this.asInterface.onExtraCallbackWithResult();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public Z IAuthTabCallback() {
        return this.asInterface.IAuthTabCallback();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int onExtraCallback() {
        return this.asInterface.onExtraCallback();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public void asBinder() {
        synchronized (this) {
            if (this.IAuthTabCallback > 0) {
                throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
            }
            if (this.onExtraCallback) {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
            this.onExtraCallback = true;
            if (this.onNavigationEvent) {
                this.asInterface.asBinder();
            }
        }
    }

    void onWarmupCompleted() {
        synchronized (this) {
            if (this.onExtraCallback) {
                throw new IllegalStateException("Cannot acquire a recycled resource");
            }
            this.IAuthTabCallback++;
        }
    }

    void onTransact() {
        boolean z;
        synchronized (this) {
            int i2 = this.IAuthTabCallback;
            if (i2 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            int i3 = i2 - 1;
            this.IAuthTabCallback = i3;
            z = i3 == 0;
        }
        if (z) {
            this.IAuthTabCallbackDefault.onExtraCallbackWithResult(this.onWarmupCompleted, this);
        }
    }

    public String toString() {
        String str;
        synchronized (this) {
            str = "EngineResource{isMemoryCacheable=" + this.onExtraCallbackWithResult + ", listener=" + this.IAuthTabCallbackDefault + ", key=" + this.onWarmupCompleted + ", acquired=" + this.IAuthTabCallback + ", isRecycled=" + this.onExtraCallback + ", resource=" + this.asInterface + '}';
        }
        return str;
    }
}
