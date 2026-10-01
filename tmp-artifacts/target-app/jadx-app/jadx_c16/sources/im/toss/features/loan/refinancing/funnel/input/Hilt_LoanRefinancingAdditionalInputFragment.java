package im.toss.features.loan.refinancing.funnel.input;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelBaseFragment;
import o.FpsCollector2;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanRefinancingAdditionalInputFragment extends LoanRefinancingFunnelBaseFragment {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private boolean onExtraCallback = false;
    private ContextWrapper onExtraCallbackWithResult;
    private boolean onNavigationEvent;

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(context);
        onExtraCallback();
        IAuthTabCallback();
        int i4 = IAuthTabCallback + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallbackWithResult;
        if (contextWrapper != null) {
            int i2 = IAuthTabCallback + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            z = captureHierarchy.onWarmupCompleted(contextWrapper) == activity;
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallback();
        IAuthTabCallback();
        int i4 = onWarmupCompleted + 33;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        if (this.onExtraCallbackWithResult == null) {
            int i5 = i3 + 117;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext(), this);
                this.onNavigationEvent = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext());
                throw null;
            }
            this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext(), this);
            this.onNavigationEvent = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext());
            int i6 = IAuthTabCallback + 83;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext() != null || !(!this.onNavigationEvent)) {
                onExtraCallback();
                return this.onExtraCallbackWithResult;
            }
            int i3 = onWarmupCompleted;
            int i4 = i3 + 85;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 22 / 0;
            }
            int i6 = i3 + 17;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext();
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = IAuthTabCallback + 121;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return layoutInflaterCloneInContext;
        }
        throw null;
    }

    public void IAuthTabCallback() {
        int i = 2 % 2;
        if (!this.onExtraCallback) {
            this.onExtraCallback = true;
            ((FpsCollector2) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((LoanRefinancingAdditionalInputFragment) animate.onExtraCallbackWithResult(this));
            int i2 = onWarmupCompleted + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = IAuthTabCallback + 75;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
