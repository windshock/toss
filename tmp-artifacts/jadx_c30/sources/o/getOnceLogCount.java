package o;

import android.view.View;
import mozilla.components.support.base.feature.LifecycleAwareFeature;
import mozilla.components.support.base.feature.LifecycleBinding;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getOnceLogCount<T extends LifecycleAwareFeature> {
    private LifecycleBinding<T> IAuthTabCallback;
    private View onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private T onNavigationEvent;
    private ApmHelperycx<T> onTransact;
    private TextFieldScrollKtExternalSyntheticLambda0 onWarmupCompleted;

    public final void onNavigationEvent() {
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0;
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle;
        T t;
        synchronized (this) {
            if (this.onExtraCallbackWithResult && (t = this.onNavigationEvent) != null) {
                t.stop();
            }
            this.onNavigationEvent = null;
            View view = this.onExtraCallback;
            if (view != null) {
                view.removeOnAttachStateChangeListener(this.onTransact);
            }
            this.onExtraCallback = null;
            this.onTransact = null;
            LifecycleBinding<T> lifecycleBinding = this.IAuthTabCallback;
            if (lifecycleBinding != null && (textFieldScrollKtExternalSyntheticLambda0 = this.onWarmupCompleted) != null && (lifecycle = textFieldScrollKtExternalSyntheticLambda0.getLifecycle()) != null) {
                lifecycle.onExtraCallbackWithResult(lifecycleBinding);
            }
            this.onWarmupCompleted = null;
            this.IAuthTabCallback = null;
        }
    }

    public final void onWarmupCompleted() {
        synchronized (this) {
            T t = this.onNavigationEvent;
            if (t != null) {
                t.start();
            }
            this.onExtraCallbackWithResult = true;
        }
    }

    public final void onExtraCallback() {
        synchronized (this) {
            T t = this.onNavigationEvent;
            if (t != null) {
                t.stop();
            }
            this.onExtraCallbackWithResult = false;
        }
    }
}
