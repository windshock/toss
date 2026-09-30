package im.toss.features.loan.refinancing.funnel.result;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelBaseFragment;
import o.TraceDataReporter2;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanRefinancingSummaryFailedFragment extends LoanRefinancingFunnelBaseFragment {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private ContextWrapper onExtraCallback;
    private boolean onNavigationEvent = false;
    private boolean onWarmupCompleted;

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(context);
            onExtraCallback();
            IAuthTabCallback();
            int i3 = 72 / 0;
            return;
        }
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(context);
        onExtraCallback();
        IAuthTabCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(activity);
            obj.hashCode();
            throw null;
        }
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallback;
        if (contextWrapper != null) {
            int i3 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                captureHierarchy.onWarmupCompleted(contextWrapper);
                obj.hashCode();
                throw null;
            }
            if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                int i4 = IAuthTabCallback;
                int i5 = i4 + 41;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 109;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                z = false;
            } else {
                z = true;
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallback();
        IAuthTabCallback();
    }

    private void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.onExtraCallback == null) {
            this.onExtraCallback = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext(), this);
            this.onWarmupCompleted = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext());
        }
        int i3 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Context getContext() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 9 / 0;
            if (super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext() == null) {
                if (!this.onWarmupCompleted) {
                    int i4 = onExtraCallbackWithResult + 125;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return null;
                }
            }
        } else if (super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext() == null) {
        }
        onExtraCallback();
        return this.onExtraCallback;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return layoutInflaterCloneInContext;
    }

    public void IAuthTabCallback() {
        int i = 2 % 2;
        if (this.onNavigationEvent) {
            return;
        }
        int i2 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent = true;
        ((TraceDataReporter2) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((LoanRefinancingSummaryFailedFragment) animate.onExtraCallbackWithResult(this));
        int i4 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
