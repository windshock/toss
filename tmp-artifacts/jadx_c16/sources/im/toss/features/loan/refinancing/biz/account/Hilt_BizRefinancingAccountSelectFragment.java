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
import o.getBaseTime;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_BizRefinancingAccountSelectFragment extends LoanRefinancingFunnelBaseFragment {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private boolean onExtraCallback = false;
    private ContextWrapper onExtraCallbackWithResult;
    private boolean onWarmupCompleted;

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(context);
            onTransact();
            IAuthTabCallback();
            int i3 = IAuthTabCallback + 5;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(context);
        onTransact();
        IAuthTabCallback();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallbackWithResult;
        if (contextWrapper != null) {
            int i4 = onNavigationEvent + 81;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                int i6 = IAuthTabCallback + 49;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            } else {
                z = true;
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onTransact();
        IAuthTabCallback();
    }

    private void onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            if (this.onExtraCallbackWithResult == null) {
                this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext(), this);
                this.onWarmupCompleted = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext());
                int i3 = onNavigationEvent + 93;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 / 5;
                    return;
                }
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
            int i2 = IAuthTabCallback + 75;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (!this.onWarmupCompleted) {
                return null;
            }
        }
        onTransact();
        ContextWrapper contextWrapper = this.onExtraCallbackWithResult;
        int i3 = onNavigationEvent + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return contextWrapper;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onGetLayoutInflater(bundle);
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
            int i3 = IAuthTabCallback + 77;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return layoutInflaterCloneInContext;
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater2 = super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onGetLayoutInflater(bundle);
        layoutInflaterOnGetLayoutInflater2.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater2, this));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void IAuthTabCallback() {
        int i = 2 % 2;
        if (!this.onExtraCallback) {
            int i2 = onNavigationEvent + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback = true;
            ((getBaseTime) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((BizRefinancingAccountSelectFragment) animate.onExtraCallbackWithResult(this));
            int i4 = onNavigationEvent + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = IAuthTabCallback + 21;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }
}
