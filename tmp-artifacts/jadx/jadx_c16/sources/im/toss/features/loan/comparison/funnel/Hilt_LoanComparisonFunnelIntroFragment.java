package im.toss.features.loan.comparison.funnel;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;
import o.unlockAndMoveToNext;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanComparisonFunnelIntroFragment extends LoanComparisonFunnelBaseFragment {
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult;
    private boolean onExtraCallback = false;
    private boolean onNavigationEvent;
    private ContextWrapper onWarmupCompleted;

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.onAttach(context);
            asBinder();
            onNavigationEvent();
        } else {
            super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.onAttach(context);
            asBinder();
            onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.onAttach(activity);
            ContextWrapper contextWrapper = this.onWarmupCompleted;
            if (contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity) {
                int i3 = IAuthTabCallbackStub + 21;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                int i5 = onExtraCallbackWithResult + 109;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 3 % 5;
                }
                z = false;
            }
            runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
            asBinder();
            onNavigationEvent();
            return;
        }
        super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.onAttach(activity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void asBinder() {
        int i = 2 % 2;
        if (this.onWarmupCompleted == null) {
            int i2 = onExtraCallbackWithResult + 5;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.getContext(), this);
            this.onNavigationEvent = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.getContext());
            int i4 = IAuthTabCallbackStub + 77;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 2;
            }
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        if (super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.getContext() != null || this.onNavigationEvent) {
            asBinder();
            ContextWrapper contextWrapper = this.onWarmupCompleted;
            int i2 = onExtraCallbackWithResult + 69;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return contextWrapper;
        }
        int i4 = IAuthTabCallbackStub + 51;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
        return null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 3;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.onGetLayoutInflater(bundle);
            return layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater2 = super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.onGetLayoutInflater(bundle);
        layoutInflaterOnGetLayoutInflater2.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater2, this));
        throw null;
    }

    protected void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.onExtraCallback) {
            return;
        }
        this.onExtraCallback = true;
        ((unlockAndMoveToNext) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onNavigationEvent((LoanComparisonFunnelIntroFragment) animate.onExtraCallbackWithResult(this));
        int i3 = IAuthTabCallbackStub + 51;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }
}
