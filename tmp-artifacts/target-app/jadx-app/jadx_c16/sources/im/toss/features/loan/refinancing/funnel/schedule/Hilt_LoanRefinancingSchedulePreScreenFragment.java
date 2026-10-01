package im.toss.features.loan.refinancing.funnel.schedule;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelBaseFragment;
import o.TraceDataReporter1;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanRefinancingSchedulePreScreenFragment extends LoanRefinancingFunnelBaseFragment {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private boolean onNavigationEvent = false;
    private ContextWrapper onWarmupCompleted;

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(context);
            onExtraCallback();
            IAuthTabCallback();
            int i3 = IAuthTabCallback + 119;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 18 / 0;
                return;
            }
            return;
        }
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(context);
        onExtraCallback();
        IAuthTabCallback();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onWarmupCompleted;
        if (contextWrapper != null) {
            int i2 = onExtraCallback + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                int i4 = IAuthTabCallback + 59;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            } else {
                int i6 = onExtraCallback + 31;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallback();
        IAuthTabCallback();
    }

    private void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this.onWarmupCompleted == null) {
            this.onWarmupCompleted = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext(), this);
            this.onExtraCallbackWithResult = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext());
            int i4 = onExtraCallback + 103;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext();
            obj.hashCode();
            throw null;
        }
        if (super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext() == null && !this.onExtraCallbackWithResult) {
            int i3 = IAuthTabCallback + 117;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        onExtraCallback();
        ContextWrapper contextWrapper = this.onWarmupCompleted;
        int i5 = IAuthTabCallback + 25;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return contextWrapper;
        }
        obj.hashCode();
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = IAuthTabCallback + 21;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return layoutInflaterCloneInContext;
    }

    public void IAuthTabCallback() {
        int i = 2 % 2;
        if (!this.onNavigationEvent) {
            this.onNavigationEvent = true;
            ((TraceDataReporter1) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onExtraCallback((LoanRefinancingSchedulePreScreenFragment) animate.onExtraCallbackWithResult(this));
            int i2 = IAuthTabCallback + 1;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = IAuthTabCallback + 87;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
