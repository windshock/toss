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
import o.sendFPS;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanRefinancingGuideFragment extends LoanRefinancingFunnelBaseFragment {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private boolean IAuthTabCallback = false;
    private ContextWrapper onExtraCallbackWithResult;
    private boolean onNavigationEvent;

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
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

    public void onAttach(Activity activity) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallbackWithResult;
        boolean z = true;
        Object obj = null;
        if (contextWrapper != null) {
            int i4 = onWarmupCompleted + 3;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                captureHierarchy.onWarmupCompleted(contextWrapper);
                throw null;
            }
            if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                int i5 = onWarmupCompleted + 63;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    z = false;
                }
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallback();
        IAuthTabCallback();
        int i6 = onExtraCallback + 51;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.onExtraCallbackWithResult == null) {
            this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext(), this);
            this.onNavigationEvent = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext());
        }
        int i3 = onWarmupCompleted + 47;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext() != null || this.onNavigationEvent) {
            onExtraCallback();
            return this.onExtraCallbackWithResult;
        }
        int i4 = onExtraCallback + 77;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = onExtraCallback + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return layoutInflaterCloneInContext;
    }

    public void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 19;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            if (this.IAuthTabCallback) {
                return;
            }
            int i4 = i2 + 11;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            this.IAuthTabCallback = true;
            ((sendFPS) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallback((LoanRefinancingGuideFragment) animate.onExtraCallbackWithResult(this));
            return;
        }
        throw null;
    }
}
