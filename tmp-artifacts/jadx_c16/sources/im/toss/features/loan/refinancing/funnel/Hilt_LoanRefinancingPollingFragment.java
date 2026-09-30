package im.toss.features.loan.refinancing.funnel;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelBaseFragment;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;
import o.setClientName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanRefinancingPollingFragment extends LoanRefinancingFunnelBaseFragment {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private boolean IAuthTabCallback;
    private boolean onExtraCallbackWithResult = false;
    private ContextWrapper onWarmupCompleted;

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(context);
        onExtraCallback();
        IAuthTabCallback();
        int i4 = onExtraCallback + 95;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onWarmupCompleted;
        if (contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity) {
            z = true;
        } else {
            int i4 = onExtraCallback + 9;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallback();
        IAuthTabCallback();
    }

    private void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            if (this.onWarmupCompleted == null) {
                this.onWarmupCompleted = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext(), this);
                this.IAuthTabCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext());
            }
            int i3 = onExtraCallback + 17;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 89 / 0;
                return;
            }
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Context getContext() {
        int i = 2 % 2;
        if (super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext() == null) {
            int i2 = onNavigationEvent + 51;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (!this.IAuthTabCallback) {
                int i5 = i3 + 109;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return null;
                }
                throw null;
            }
        }
        onExtraCallback();
        return this.onWarmupCompleted;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onGetLayoutInflater(bundle);
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
            int i3 = onExtraCallback + 49;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return layoutInflaterCloneInContext;
            }
            throw null;
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater2 = super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onGetLayoutInflater(bundle);
        layoutInflaterOnGetLayoutInflater2.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater2, this));
        throw null;
    }

    public void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (!this.onExtraCallbackWithResult) {
            int i5 = i2 + 63;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            this.onExtraCallbackWithResult = true;
            ((setClientName) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((LoanRefinancingPollingFragment) animate.onExtraCallbackWithResult(this));
        }
        int i7 = onExtraCallback + 29;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
