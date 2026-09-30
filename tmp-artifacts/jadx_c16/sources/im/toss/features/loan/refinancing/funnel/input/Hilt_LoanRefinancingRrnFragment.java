package im.toss.features.loan.refinancing.funnel.input;

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
import o.packageTraceDebugProtocol;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanRefinancingRrnFragment extends LoanRefinancingFunnelBaseFragment {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private ContextWrapper IAuthTabCallback;
    private boolean onExtraCallbackWithResult = false;
    private boolean onNavigationEvent;

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(context);
        onExtraCallback();
        IAuthTabCallback();
        int i4 = onWarmupCompleted + 71;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onAttach(Activity activity) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.IAuthTabCallback;
        boolean z = true;
        if (contextWrapper != null && captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
            int i4 = onExtraCallback + 75;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                z = false;
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallback();
        IAuthTabCallback();
        int i5 = onExtraCallback + 17;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    private void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 69;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            if (this.IAuthTabCallback == null) {
                int i4 = i2 + 95;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                this.IAuthTabCallback = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext(), this);
                this.onNavigationEvent = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext());
                return;
            }
            return;
        }
        throw null;
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            if (super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext() != null || this.onNavigationEvent) {
                onExtraCallback();
                return this.IAuthTabCallback;
            }
            int i3 = onWarmupCompleted;
            int i4 = i3 + 107;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 5;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext();
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterCloneInContext;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onGetLayoutInflater(bundle);
            layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
            int i3 = 53 / 0;
        } else {
            LayoutInflater layoutInflaterOnGetLayoutInflater2 = super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onGetLayoutInflater(bundle);
            layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater2.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater2, this));
        }
        int i4 = onExtraCallback + 85;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return layoutInflaterCloneInContext;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this.onExtraCallbackWithResult) {
            return;
        }
        this.onExtraCallbackWithResult = true;
        ((packageTraceDebugProtocol) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallback((LoanRefinancingRrnFragment) animate.onExtraCallbackWithResult(this));
        int i4 = onWarmupCompleted + 31;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
