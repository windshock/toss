package im.toss.features.loan.refinancing.funnel.account;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelBaseFragment;
import o.TraceDataBean;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanRefinancingKcbAccountFragment extends LoanRefinancingFunnelBaseFragment {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private ContextWrapper onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private boolean onNavigationEvent = false;

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(context);
        onExtraCallback();
        IAuthTabCallback();
        int i4 = onWarmupCompleted + 1;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(activity);
            ContextWrapper contextWrapper = this.onExtraCallback;
            if (contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity) {
                int i3 = onWarmupCompleted + 33;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
            runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
            onExtraCallback();
            IAuthTabCallback();
            return;
        }
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(activity);
        throw null;
    }

    private void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 27 / 0;
            if (this.onExtraCallback != null) {
                return;
            }
        } else if (this.onExtraCallback != null) {
            return;
        }
        this.onExtraCallback = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext(), this);
        this.onExtraCallbackWithResult = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext());
        int i4 = IAuthTabCallback + 51;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public Context getContext() {
        int i = 2 % 2;
        if (super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext() != null || !(!this.onExtraCallbackWithResult)) {
            onExtraCallback();
            ContextWrapper contextWrapper = this.onExtraCallback;
            int i2 = onWarmupCompleted + 67;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return contextWrapper;
        }
        int i4 = onWarmupCompleted + 59;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = onWarmupCompleted + 115;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return layoutInflaterCloneInContext;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void IAuthTabCallback() {
        int i = 2 % 2;
        if (this.onNavigationEvent) {
            return;
        }
        int i2 = onWarmupCompleted + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent = true;
        ((TraceDataBean) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallback((LoanRefinancingKcbAccountFragment) animate.onExtraCallbackWithResult(this));
        int i4 = IAuthTabCallback + 119;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
