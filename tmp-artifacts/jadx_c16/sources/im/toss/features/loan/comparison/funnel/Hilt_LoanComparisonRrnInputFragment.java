package im.toss.features.loan.comparison.funnel;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import o.SetupStep;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanComparisonRrnInputFragment extends LoanComparisonFunnelBaseFragment {
    private static int IAuthTabCallbackDefault = 1;
    private static int onNavigationEvent;
    private boolean onExtraCallback = false;
    private boolean onExtraCallbackWithResult;
    private ContextWrapper onWarmupCompleted;

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.onAttach(context);
        IAuthTabCallbackStub();
        onNavigationEvent();
        int i4 = IAuthTabCallbackDefault + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
    }

    public void onAttach(Activity activity) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onWarmupCompleted;
        boolean z = true;
        if (contextWrapper != null && captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
            int i4 = IAuthTabCallbackDefault + 73;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                z = false;
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        IAuthTabCallbackStub();
        onNavigationEvent();
        int i5 = onNavigationEvent + 115;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    private void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.onWarmupCompleted == null) {
                this.onWarmupCompleted = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.getContext(), this);
                this.onExtraCallbackWithResult = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.getContext());
                int i3 = onNavigationEvent + 7;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        throw null;
    }

    public Context getContext() {
        int i = 2 % 2;
        if (super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.getContext() != null || this.onExtraCallbackWithResult) {
            IAuthTabCallbackStub();
            ContextWrapper contextWrapper = this.onWarmupCompleted;
            int i2 = IAuthTabCallbackDefault + 47;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 66 / 0;
            }
            return contextWrapper;
        }
        int i4 = IAuthTabCallbackDefault + 19;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i5 + 29;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.onGetLayoutInflater(bundle);
            int i3 = 12 / 0;
            return layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater2 = super/*im.toss.features.loan.comparison.funnel.Hilt_LoanComparisonFunnelBaseFragment*/.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater2.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater2, this));
    }

    protected void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (!this.onExtraCallback) {
            this.onExtraCallback = true;
            ((SetupStep) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onNavigationEvent((LoanComparisonRrnInputFragment) animate.onExtraCallbackWithResult(this));
        }
        int i3 = onNavigationEvent + 33;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
