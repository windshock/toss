package im.toss.features.loan.refinancing.funnel.schedule;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelBaseFragment;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.initialTraceDebug;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanRefinancingScheduleResultFragment extends LoanRefinancingFunnelBaseFragment {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private ContextWrapper IAuthTabCallback;
    private boolean onExtraCallback = false;
    private boolean onWarmupCompleted;

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(context);
        onExtraCallback();
        IAuthTabCallback();
        int i4 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(activity);
            ContextWrapper contextWrapper = this.IAuthTabCallback;
            if (contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity) {
                z = true;
            } else {
                int i3 = onNavigationEvent + 87;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
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
        int i2 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            if (this.IAuthTabCallback == null) {
                this.IAuthTabCallback = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext(), this);
                this.onWarmupCompleted = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext());
                int i3 = onNavigationEvent + 79;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
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
        int i2 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            if (super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext() == null) {
                int i3 = onExtraCallbackWithResult + 43;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                if (!this.onWarmupCompleted) {
                    return null;
                }
            }
            onExtraCallback();
            ContextWrapper contextWrapper = this.IAuthTabCallback;
            int i5 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return contextWrapper;
        }
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext();
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return layoutInflaterCloneInContext;
    }

    public void IAuthTabCallback() {
        initialTraceDebug initialtracedebug;
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        if (this.onExtraCallback) {
            return;
        }
        int i2 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallback = false;
            initialtracedebug = (initialTraceDebug) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent();
            objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
        } else {
            this.onExtraCallback = true;
            initialtracedebug = (initialTraceDebug) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent();
            objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
        }
        initialtracedebug.onNavigationEvent((LoanRefinancingScheduleResultFragment) objOnExtraCallbackWithResult);
        int i3 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }
}
