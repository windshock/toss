package im.toss.features.loan.comparison.funnel;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import o.DownloadStep5;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanComparisonPhoneVerificationFragment extends LoanComparisonFunnelBaseFragment {
    private static int asBinder = 1;
    private static int onExtraCallback;
    private ContextWrapper onExtraCallbackWithResult;
    private boolean onNavigationEvent = false;
    private boolean onWarmupCompleted;

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.onAttach(context);
        IAuthTabCallbackDefault();
        onNavigationEvent();
        int i4 = asBinder + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r1
      0x0022: PHI (r1v5 android.content.ContextWrapper) = (r1v4 android.content.ContextWrapper), (r1v8 android.content.ContextWrapper) binds: [B:8:0x0020, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        ContextWrapper contextWrapper;
        int i = 2 % 2;
        int i2 = asBinder + 45;
        onExtraCallback = i2 % 128;
        boolean z = true;
        if (i2 % 2 != 0) {
            super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.onAttach(activity);
            contextWrapper = this.onExtraCallbackWithResult;
            int i3 = 78 / 0;
            if (contextWrapper != null) {
                if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                    int i4 = onExtraCallback + 29;
                    asBinder = i4 % 128;
                    if (i4 % 2 != 0) {
                        z = false;
                    }
                }
            }
        } else {
            super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.onAttach(activity);
            contextWrapper = this.onExtraCallbackWithResult;
            if (contextWrapper != null) {
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        IAuthTabCallbackDefault();
        onNavigationEvent();
    }

    private void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        if (this.onExtraCallbackWithResult == null) {
            int i5 = i3 + 53;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.getContext(), this);
                this.onWarmupCompleted = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.getContext());
            } else {
                this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.getContext(), this);
                this.onWarmupCompleted = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.getContext());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.getContext() == null && !this.onWarmupCompleted) {
            return null;
        }
        IAuthTabCallbackDefault();
        ContextWrapper contextWrapper = this.onExtraCallbackWithResult;
        int i4 = asBinder + 23;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return contextWrapper;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = onExtraCallback + 29;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return layoutInflaterCloneInContext;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void onNavigationEvent() {
        int i = 2 % 2;
        if (!this.onNavigationEvent) {
            int i2 = onExtraCallback + 99;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent = true;
            ((DownloadStep5) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((LoanComparisonPhoneVerificationFragment) animate.onExtraCallbackWithResult(this));
            int i4 = asBinder + 27;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
