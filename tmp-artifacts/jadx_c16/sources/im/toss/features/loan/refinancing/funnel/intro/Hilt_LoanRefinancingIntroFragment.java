package im.toss.features.loan.refinancing.funnel.intro;

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
import o.sendTraceMessage;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanRefinancingIntroFragment extends LoanRefinancingFunnelBaseFragment {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private boolean IAuthTabCallback = false;
    private boolean onExtraCallback;
    private ContextWrapper onExtraCallbackWithResult;

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(context);
        onExtraCallback();
        IAuthTabCallback();
        int i4 = onNavigationEvent + 25;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallbackWithResult;
        if (contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity) {
            int i4 = onNavigationEvent + 9;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallback();
        IAuthTabCallback();
    }

    private void onExtraCallback() {
        int i = 2 % 2;
        if (this.onExtraCallbackWithResult == null) {
            int i2 = onNavigationEvent + 61;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext(), this);
                this.onExtraCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext());
                throw null;
            }
            this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext(), this);
            this.onExtraCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext());
            int i3 = onNavigationEvent + 89;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            if (super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext() != null || this.onExtraCallback) {
                onExtraCallback();
                return this.onExtraCallbackWithResult;
            }
            int i3 = onNavigationEvent + 123;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext();
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = onWarmupCompleted + 41;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return layoutInflaterCloneInContext;
    }

    public void IAuthTabCallback() {
        sendTraceMessage sendtracemessage;
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 75;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this.IAuthTabCallback) {
            return;
        }
        int i4 = i2 + 1;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            this.IAuthTabCallback = false;
            sendtracemessage = (sendTraceMessage) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent();
            objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
        } else {
            this.IAuthTabCallback = true;
            sendtracemessage = (sendTraceMessage) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent();
            objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
        }
        sendtracemessage.onWarmupCompleted((LoanRefinancingIntroFragment) objOnExtraCallbackWithResult);
        int i5 = onWarmupCompleted + 31;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }
}
