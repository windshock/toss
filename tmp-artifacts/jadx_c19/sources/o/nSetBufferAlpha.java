package o;

import java.io.Serializable;
import java.lang.annotation.Annotation;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class nSetBufferAlpha {
    protected static final RememberLifecycleOwnerKtExternalSyntheticLambda0 onExtraCallback = new IAuthTabCallback();
    protected final Object onWarmupCompleted;

    public abstract nSetBufferAlpha onExtraCallbackWithResult(Annotation annotation);

    public abstract nIsHwuiUsingVulkanRenderer onNavigationEvent();

    public abstract RememberLifecycleOwnerKtExternalSyntheticLambda0 onWarmupCompleted();

    public abstract boolean onWarmupCompleted(Annotation annotation);

    protected nSetBufferAlpha(Object obj) {
        this.onWarmupCompleted = obj;
    }

    public static RememberLifecycleOwnerKtExternalSyntheticLambda0 IAuthTabCallback() {
        return onExtraCallback;
    }

    public static nSetBufferAlpha onExtraCallback() {
        return onExtraCallback.onExtraCallbackWithResult;
    }

    public static class IAuthTabCallback implements RememberLifecycleOwnerKtExternalSyntheticLambda0, Serializable {
        private static final long serialVersionUID = 1;

        @Override // o.RememberLifecycleOwnerKtExternalSyntheticLambda0
        public boolean IAuthTabCallback(Class<?> cls) {
            return false;
        }

        @Override // o.RememberLifecycleOwnerKtExternalSyntheticLambda0
        public <A extends Annotation> A onExtraCallbackWithResult(Class<A> cls) {
            return null;
        }

        @Override // o.RememberLifecycleOwnerKtExternalSyntheticLambda0
        public int onWarmupCompleted() {
            return 0;
        }

        @Override // o.RememberLifecycleOwnerKtExternalSyntheticLambda0
        public boolean onWarmupCompleted(Class<? extends Annotation>[] clsArr) {
            return false;
        }

        IAuthTabCallback() {
        }
    }
}
