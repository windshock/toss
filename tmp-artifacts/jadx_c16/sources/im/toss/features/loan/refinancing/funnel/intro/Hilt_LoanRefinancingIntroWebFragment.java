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
import o.clearWebViewCache;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanRefinancingIntroWebFragment extends LoanRefinancingFunnelBaseFragment {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private boolean IAuthTabCallback = false;
    private boolean onExtraCallback;
    private ContextWrapper onExtraCallbackWithResult;

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(context);
        onExtraCallback();
        IAuthTabCallback();
        int i4 = onWarmupCompleted + 75;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallbackWithResult;
        if (contextWrapper != null) {
            int i4 = onNavigationEvent + 79;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 96 / 0;
                if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                    z = false;
                } else {
                    int i6 = onNavigationEvent + 77;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    z = true;
                }
            } else if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallback();
        IAuthTabCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 71 / 0;
            if (this.onExtraCallbackWithResult == null) {
                this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext(), this);
                this.onExtraCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext());
            }
        } else if (this.onExtraCallbackWithResult == null) {
        }
        int i4 = onNavigationEvent + 47;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext() != null || this.onExtraCallback) {
                onExtraCallback();
                return this.onExtraCallbackWithResult;
            }
            int i3 = onWarmupCompleted + 71;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            throw null;
        }
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext();
        obj.hashCode();
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = onWarmupCompleted + 93;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return layoutInflaterCloneInContext;
    }

    public void IAuthTabCallback() {
        int i = 2 % 2;
        if (!this.IAuthTabCallback) {
            int i2 = onNavigationEvent + 91;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback = true;
            ((clearWebViewCache) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallback((LoanRefinancingIntroWebFragment) animate.onExtraCallbackWithResult(this));
        }
        int i4 = onWarmupCompleted + 73;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
