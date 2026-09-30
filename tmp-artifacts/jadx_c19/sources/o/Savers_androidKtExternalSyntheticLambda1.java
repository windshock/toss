package o;

import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.Resource;
import o.forceLayout;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class Savers_androidKtExternalSyntheticLambda1<Z> implements Resource<Z>, forceLayout.onNavigationEvent {
    private static final Pools.onExtraCallback<Savers_androidKtExternalSyntheticLambda1<?>> onExtraCallback = forceLayout.onNavigationEvent(20, new forceLayout.onExtraCallbackWithResult<Savers_androidKtExternalSyntheticLambda1<?>>() { // from class: o.Savers_androidKtExternalSyntheticLambda1.5
        @Override // o.forceLayout.onExtraCallbackWithResult
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public Savers_androidKtExternalSyntheticLambda1<?> IAuthTabCallback() {
            return new Savers_androidKtExternalSyntheticLambda1<>();
        }
    });
    private final dispatchDraw IAuthTabCallback = dispatchDraw.onWarmupCompleted();
    private Resource<Z> onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private boolean onWarmupCompleted;

    static <Z> Savers_androidKtExternalSyntheticLambda1<Z> onNavigationEvent(Resource<Z> resource) {
        Savers_androidKtExternalSyntheticLambda1<Z> savers_androidKtExternalSyntheticLambda1 = (Savers_androidKtExternalSyntheticLambda1) markHierarchyDirty.onExtraCallbackWithResult((Savers_androidKtExternalSyntheticLambda1) onExtraCallback.onNavigationEvent());
        savers_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult(resource);
        return savers_androidKtExternalSyntheticLambda1;
    }

    Savers_androidKtExternalSyntheticLambda1() {
    }

    private void onExtraCallbackWithResult(Resource<Z> resource) {
        this.onWarmupCompleted = false;
        this.onNavigationEvent = true;
        this.onExtraCallbackWithResult = resource;
    }

    private void onNavigationEvent() {
        this.onExtraCallbackWithResult = null;
        onExtraCallback.onWarmupCompleted(this);
    }

    void onWarmupCompleted() {
        synchronized (this) {
            this.IAuthTabCallback.onExtraCallback();
            if (!this.onNavigationEvent) {
                throw new IllegalStateException("Already unlocked");
            }
            this.onNavigationEvent = false;
            if (this.onWarmupCompleted) {
                asBinder();
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public Class<Z> onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult.onExtraCallbackWithResult();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public Z IAuthTabCallback() {
        return this.onExtraCallbackWithResult.IAuthTabCallback();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int onExtraCallback() {
        return this.onExtraCallbackWithResult.onExtraCallback();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public void asBinder() {
        synchronized (this) {
            this.IAuthTabCallback.onExtraCallback();
            this.onWarmupCompleted = true;
            if (!this.onNavigationEvent) {
                this.onExtraCallbackWithResult.asBinder();
                onNavigationEvent();
            }
        }
    }

    @Override // o.forceLayout.onNavigationEvent
    public dispatchDraw ah_() {
        return this.IAuthTabCallback;
    }
}
