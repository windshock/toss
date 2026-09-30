package im.toss.features.loan.refinancing.biz.account;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelBaseFragment;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.getAppxVersion;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_BizRefinancingNoAccountFragment extends LoanRefinancingFunnelBaseFragment {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private boolean onNavigationEvent = false;
    private ContextWrapper onWarmupCompleted;

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(context);
        onExtraCallback();
        IAuthTabCallback();
        int i4 = onExtraCallback + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onWarmupCompleted;
        if (contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity) {
            z = true;
        } else {
            int i4 = onExtraCallback + 89;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallback();
        IAuthTabCallback();
    }

    private void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.onWarmupCompleted == null) {
            this.onWarmupCompleted = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext(), this);
            this.onExtraCallbackWithResult = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext());
            int i3 = onExtraCallback + 101;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext() != null || this.onExtraCallbackWithResult) {
            onExtraCallback();
            ContextWrapper contextWrapper = this.onWarmupCompleted;
            int i4 = onExtraCallback + 63;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return contextWrapper;
            }
            obj.hashCode();
            throw null;
        }
        int i5 = IAuthTabCallback + 17;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = IAuthTabCallback + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return layoutInflaterCloneInContext;
    }

    public void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!this.onNavigationEvent) {
            this.onNavigationEvent = true;
            ((getAppxVersion) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallback((BizRefinancingNoAccountFragment) animate.onExtraCallbackWithResult(this));
        }
        int i4 = IAuthTabCallback + 97;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
