package im.toss.features.loan.comparison.funnel;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import o.DownloadStepMyPackageDownloadCallback;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanComparisonFunnelJobInputFragment extends LoanComparisonFunnelBaseFragment {
    private static int asBinder = 1;
    private static int onWarmupCompleted;
    private boolean onExtraCallback;
    private boolean onExtraCallbackWithResult = false;
    private ContextWrapper onNavigationEvent;

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.onAttach(context);
        IAuthTabCallbackStub();
        onNavigationEvent();
        int i4 = asBinder + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onNavigationEvent;
        if (contextWrapper != null) {
            int i2 = asBinder + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                int i4 = asBinder + 91;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            } else {
                z = true;
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        IAuthTabCallbackStub();
        onNavigationEvent();
        int i6 = asBinder + 75;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 73 / 0;
        }
    }

    private void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.onNavigationEvent == null) {
                this.onNavigationEvent = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.getContext(), this);
                this.onExtraCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.getContext());
                int i3 = asBinder + 117;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        throw null;
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.getContext() != null || this.onExtraCallback) {
            IAuthTabCallbackStub();
            return this.onNavigationEvent;
        }
        int i4 = asBinder + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = onWarmupCompleted + 119;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return layoutInflaterCloneInContext;
    }

    protected void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 83;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (this.onExtraCallbackWithResult) {
            return;
        }
        int i5 = i2 + 117;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        this.onExtraCallbackWithResult = true;
        ((DownloadStepMyPackageDownloadCallback) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onNavigationEvent((LoanComparisonFunnelJobInputFragment) animate.onExtraCallbackWithResult(this));
    }
}
