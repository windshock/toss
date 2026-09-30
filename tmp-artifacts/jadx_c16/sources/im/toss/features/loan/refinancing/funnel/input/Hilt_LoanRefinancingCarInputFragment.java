package im.toss.features.loan.refinancing.funnel.input;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelBaseFragment;
import o.FpsCollector3;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanRefinancingCarInputFragment extends LoanRefinancingFunnelBaseFragment {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private ContextWrapper onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private boolean onNavigationEvent = false;

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(context);
            onExtraCallback();
            IAuthTabCallback();
            int i3 = 65 / 0;
            return;
        }
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(context);
        onExtraCallback();
        IAuthTabCallback();
    }

    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(activity);
            ContextWrapper contextWrapper = this.onExtraCallback;
            if (contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity) {
                z = true;
            } else {
                int i3 = onWarmupCompleted + 19;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                z = false;
            }
            runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
            onExtraCallback();
            IAuthTabCallback();
            int i5 = onWarmupCompleted + 107;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onAttach(activity);
        throw null;
    }

    private void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 13;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.onExtraCallback == null) {
            int i4 = i2 + 69;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                this.onExtraCallback = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext(), this);
                this.onExtraCallbackWithResult = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext());
                obj.hashCode();
                throw null;
            }
            this.onExtraCallback = captureHierarchy.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext(), this);
            this.onExtraCallbackWithResult = nativeRegisterWithPerfetto.onWarmupCompleted(super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext());
        }
        int i5 = onWarmupCompleted + 19;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if ((!r5.onExtraCallbackWithResult) != true) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        r3 = r3 + 3;
        im.toss.features.loan.refinancing.funnel.input.Hilt_LoanRefinancingCarInputFragment.IAuthTabCallback = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r5.onExtraCallbackWithResult != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Context getContext() {
        int i = 2 % 2;
        Object obj = null;
        if (super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.getContext() == null) {
            int i2 = IAuthTabCallback + 61;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                int i4 = 4 / 0;
            }
        }
        onExtraCallback();
        ContextWrapper contextWrapper = this.onExtraCallback;
        int i5 = IAuthTabCallback + 65;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return contextWrapper;
        }
        obj.hashCode();
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*im.toss.features.loan.refinancing.funnel.common.Hilt_LoanRefinancingFunnelBaseFragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = onWarmupCompleted + 27;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
        return layoutInflaterCloneInContext;
    }

    public void IAuthTabCallback() {
        FpsCollector3 fpsCollector3;
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        if (!this.onNavigationEvent) {
            int i2 = IAuthTabCallback + 65;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                this.onNavigationEvent = true;
                fpsCollector3 = (FpsCollector3) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent();
                objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
            } else {
                this.onNavigationEvent = true;
                fpsCollector3 = (FpsCollector3) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent();
                objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
            }
            fpsCollector3.onWarmupCompleted((LoanRefinancingCarInputFragment) objOnExtraCallbackWithResult);
        }
        int i3 = IAuthTabCallback + 53;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }
}
