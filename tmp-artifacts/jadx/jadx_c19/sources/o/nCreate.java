package o;

import im.toss.features.benefit.ui.BenefitItemAdapter$;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class nCreate extends internalPathIteratorPeek implements Serializable {
    private static final long serialVersionUID = 1;
    protected final transient nIsHwuiUsingVulkanRenderer IAuthTabCallback;
    protected final transient onTransactionCommitted onWarmupCompleted;

    public abstract internalPathIteratorPeek IAuthTabCallback(nIsHwuiUsingVulkanRenderer nishwuiusingvulkanrenderer);

    public abstract Member IAuthTabCallbackStub();

    public abstract void onNavigationEvent(Object obj, Object obj2) throws UnsupportedOperationException, IllegalArgumentException;

    public abstract Class<?> onTransact();

    public abstract Object onWarmupCompleted(Object obj) throws UnsupportedOperationException, IllegalArgumentException;

    protected nCreate(onTransactionCommitted ontransactioncommitted, nIsHwuiUsingVulkanRenderer nishwuiusingvulkanrenderer) {
        this.onWarmupCompleted = ontransactioncommitted;
        this.IAuthTabCallback = nishwuiusingvulkanrenderer;
    }

    public String access000() {
        return onTransact().getName() + "#" + onExtraCallback();
    }

    @Override // o.internalPathIteratorPeek
    public final <A extends Annotation> A onWarmupCompleted(Class<A> cls) {
        nIsHwuiUsingVulkanRenderer nishwuiusingvulkanrenderer = this.IAuthTabCallback;
        if (nishwuiusingvulkanrenderer == null) {
            return null;
        }
        return (A) nishwuiusingvulkanrenderer.onExtraCallbackWithResult(cls);
    }

    @Override // o.internalPathIteratorPeek
    public final boolean onExtraCallbackWithResult(Class<?> cls) {
        nIsHwuiUsingVulkanRenderer nishwuiusingvulkanrenderer = this.IAuthTabCallback;
        if (nishwuiusingvulkanrenderer == null) {
            return false;
        }
        return nishwuiusingvulkanrenderer.IAuthTabCallback(cls);
    }

    @Override // o.internalPathIteratorPeek
    public boolean onExtraCallbackWithResult(Class<? extends Annotation>[] clsArr) {
        nIsHwuiUsingVulkanRenderer nishwuiusingvulkanrenderer = this.IAuthTabCallback;
        if (nishwuiusingvulkanrenderer == null) {
            return false;
        }
        return nishwuiusingvulkanrenderer.onWarmupCompleted(clsArr);
    }

    public nIsHwuiUsingVulkanRenderer IAuthTabCallbackStubProxy() {
        return this.IAuthTabCallback;
    }

    public final void onExtraCallback(boolean z) {
        Member memberIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (memberIAuthTabCallbackStub != null) {
            SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(1769484191, new Object[]{memberIAuthTabCallbackStub, Boolean.valueOf(z)}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -1769484188, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
        }
    }
}
