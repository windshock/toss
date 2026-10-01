package im.toss.features.loan.comparison.funnel;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import o.DownloadStep1;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanComparisonFunnelJobDetailFragment extends LoanComparisonFunnelBaseFragment {
    private static int IAuthTabCallbackStub = 1;
    private static int onWarmupCompleted;
    private boolean onExtraCallback = false;
    private ContextWrapper onExtraCallbackWithResult;
    private boolean onNavigationEvent;

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.onAttach(context);
            IAuthTabCallbackDefault();
            onNavigationEvent();
            int i3 = onWarmupCompleted + 95;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.onAttach(context);
        IAuthTabCallbackDefault();
        onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallbackWithResult;
        if (contextWrapper != null) {
            int i2 = onWarmupCompleted + 63;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                int i4 = onWarmupCompleted + 111;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            } else {
                int i6 = IAuthTabCallbackStub + 105;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        IAuthTabCallbackDefault();
        onNavigationEvent();
    }

    private void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (this.onExtraCallbackWithResult == null) {
            this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.getContext(), this);
            this.onNavigationEvent = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.getContext());
            int i4 = onWarmupCompleted + 121;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 4;
            }
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        if (super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.getContext() == null) {
            int i2 = IAuthTabCallbackStub + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!this.onNavigationEvent) {
                return null;
            }
        }
        IAuthTabCallbackDefault();
        ContextWrapper contextWrapper = this.onExtraCallbackWithResult;
        int i4 = IAuthTabCallbackStub + 43;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return contextWrapper;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.onGetLayoutInflater(bundle);
            return layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater2 = super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.onGetLayoutInflater(bundle);
        layoutInflaterOnGetLayoutInflater2.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater2, this));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void onNavigationEvent() {
        DownloadStep1 downloadStep1;
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        if (this.onExtraCallback) {
            return;
        }
        int i5 = i3 + 25;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            this.onExtraCallback = true;
            downloadStep1 = (DownloadStep1) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent();
            objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
        } else {
            this.onExtraCallback = true;
            downloadStep1 = (DownloadStep1) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent();
            objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
        }
        downloadStep1.onWarmupCompleted((LoanComparisonFunnelJobDetailFragment) objOnExtraCallbackWithResult);
    }
}
