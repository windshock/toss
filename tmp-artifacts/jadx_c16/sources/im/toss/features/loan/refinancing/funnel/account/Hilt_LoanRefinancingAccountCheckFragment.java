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
import o.setClientVersion;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanRefinancingAccountCheckFragment extends LoanRefinancingFunnelBaseFragment {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private boolean IAuthTabCallback;
    private boolean onNavigationEvent = false;
    private ContextWrapper onWarmupCompleted;

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(context);
            onExtraCallback();
            IAuthTabCallback();
            int i3 = 16 / 0;
        } else {
            super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(context);
            onExtraCallback();
            IAuthTabCallback();
        }
        int i4 = onExtraCallbackWithResult + 29;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onWarmupCompleted;
        if (contextWrapper != null) {
            int i2 = onExtraCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            z = captureHierarchy.onWarmupCompleted(contextWrapper) == activity;
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallback();
        IAuthTabCallback();
        int i4 = onExtraCallbackWithResult + 29;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (this.onWarmupCompleted == null) {
            int i5 = i3 + 17;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            this.onWarmupCompleted = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext(), this);
            this.IAuthTabCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext());
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        if (super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext() == null) {
            int i2 = onExtraCallback + 111;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (!this.IAuthTabCallback) {
                int i5 = i3 + 119;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return null;
            }
        }
        onExtraCallback();
        ContextWrapper contextWrapper = this.onWarmupCompleted;
        int i7 = onExtraCallbackWithResult + 85;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return contextWrapper;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = onExtraCallback + 37;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return layoutInflaterCloneInContext;
    }

    public void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.onNavigationEvent) {
            this.onNavigationEvent = true;
            ((setClientVersion) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallbackWithResult((LoanRefinancingAccountCheckFragment) animate.onExtraCallbackWithResult(this));
        }
        int i3 = onExtraCallbackWithResult + 75;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 40 / 0;
        }
    }
}
