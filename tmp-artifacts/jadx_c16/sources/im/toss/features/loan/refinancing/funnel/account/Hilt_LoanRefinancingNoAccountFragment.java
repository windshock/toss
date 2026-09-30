package im.toss.features.loan.refinancing.funnel.account;

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
import o.setStartTime;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanRefinancingNoAccountFragment extends LoanRefinancingFunnelBaseFragment {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private boolean IAuthTabCallback = false;
    private boolean onExtraCallback;
    private ContextWrapper onNavigationEvent;

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(context);
        onExtraCallback();
        IAuthTabCallback();
        int i4 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onAttach(Activity activity) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(activity);
            ContextWrapper contextWrapper = this.onNavigationEvent;
            runAnimator.IAuthTabCallback(contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
            onExtraCallback();
            IAuthTabCallback();
            int i3 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(activity);
        obj.hashCode();
        throw null;
    }

    private void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.onNavigationEvent == null) {
            this.onNavigationEvent = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext(), this);
            this.onExtraCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext());
        }
        int i3 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    public Context getContext() {
        int i = 2 % 2;
        if (super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext() == null) {
            int i2 = onWarmupCompleted + 123;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (!this.onExtraCallback) {
                int i5 = i3 + 79;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 95 / 0;
                }
                return null;
            }
        }
        onExtraCallback();
        return this.onNavigationEvent;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onGetLayoutInflater(bundle);
            int i3 = 3 / 0;
            return layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater2 = super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater2.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater2, this));
    }

    public void IAuthTabCallback() {
        setStartTime setstarttime;
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 111;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.IAuthTabCallback) {
            int i4 = i2 + 97;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                this.IAuthTabCallback = false;
                setstarttime = (setStartTime) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent();
                objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
            } else {
                this.IAuthTabCallback = true;
                setstarttime = (setStartTime) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent();
                objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
            }
            setstarttime.onWarmupCompleted((LoanRefinancingNoAccountFragment) objOnExtraCallbackWithResult);
        }
    }
}
