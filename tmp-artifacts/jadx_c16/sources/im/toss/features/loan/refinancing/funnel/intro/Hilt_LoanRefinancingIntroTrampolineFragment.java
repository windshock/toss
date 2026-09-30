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
import o.setChannel;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanRefinancingIntroTrampolineFragment extends LoanRefinancingFunnelBaseFragment {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private boolean IAuthTabCallback = false;
    private boolean onExtraCallbackWithResult;
    private ContextWrapper onNavigationEvent;

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(context);
            onExtraCallback();
            IAuthTabCallback();
        } else {
            super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(context);
            onExtraCallback();
            IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onNavigationEvent;
        if (contextWrapper != null) {
            int i4 = onWarmupCompleted + 7;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            z = captureHierarchy.onWarmupCompleted(contextWrapper) == activity;
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallback();
        IAuthTabCallback();
    }

    private void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (this.onNavigationEvent == null) {
            int i5 = i3 + 1;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                this.onNavigationEvent = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext(), this);
                this.onExtraCallbackWithResult = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext());
            } else {
                this.onNavigationEvent = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext(), this);
                this.onExtraCallbackWithResult = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext());
                throw null;
            }
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        if (super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext() == null) {
            int i2 = onWarmupCompleted + 69;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (!this.onExtraCallbackWithResult) {
                int i4 = i3 + 105;
                int i5 = i4 % 128;
                onWarmupCompleted = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 15;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
        }
        onExtraCallback();
        return this.onNavigationEvent;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = onWarmupCompleted + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return layoutInflaterCloneInContext;
    }

    public void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 13;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (!this.IAuthTabCallback) {
            int i5 = i2 + 11;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            this.IAuthTabCallback = true;
            ((setChannel) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((LoanRefinancingIntroTrampolineFragment) animate.onExtraCallbackWithResult(this));
        }
    }
}
