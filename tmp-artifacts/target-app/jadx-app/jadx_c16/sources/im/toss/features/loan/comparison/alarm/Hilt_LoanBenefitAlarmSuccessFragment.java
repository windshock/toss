package im.toss.features.loan.comparison.alarm;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import im.toss.base.BaseFragment;
import o.PathMotion;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;
import o.setUserName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanBenefitAlarmSuccessFragment extends BaseFragment implements captureEndValues {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder;
    private boolean IAuthTabCallback;
    private volatile captureHierarchy onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final Object onNavigationEvent;
    private ContextWrapper onWarmupCompleted;

    Hilt_LoanBenefitAlarmSuccessFragment() {
        this.onNavigationEvent = new Object();
        this.onExtraCallbackWithResult = false;
    }

    Hilt_LoanBenefitAlarmSuccessFragment(int i) {
        super(i);
        this.onNavigationEvent = new Object();
        this.onExtraCallbackWithResult = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            super.onAttach(context);
            onExtraCallbackWithResult();
            onNavigationEvent();
        } else {
            super.onAttach(context);
            onExtraCallbackWithResult();
            onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            super/*androidx.fragment.app.Fragment*/.onAttach(activity);
            ContextWrapper contextWrapper = this.onWarmupCompleted;
            if (contextWrapper != null) {
                int i3 = asBinder + 13;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 == 0) {
                    Context contextOnWarmupCompleted = captureHierarchy.onWarmupCompleted(contextWrapper);
                    int i4 = 96 / 0;
                    z = contextOnWarmupCompleted == activity;
                } else if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                }
            }
            runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
            onExtraCallbackWithResult();
            onNavigationEvent();
            return;
        }
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        throw null;
    }

    private void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (this.onWarmupCompleted == null) {
            this.onWarmupCompleted = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.IAuthTabCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
        int i4 = IAuthTabCallbackDefault + 113;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Context getContext() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 52 / 0;
            if (super/*androidx.fragment.app.Fragment*/.getContext() == null) {
                if (!this.IAuthTabCallback) {
                    int i4 = asBinder + 107;
                    IAuthTabCallbackDefault = i4 % 128;
                    int i5 = i4 % 2;
                    return null;
                }
            }
        } else if (super/*androidx.fragment.app.Fragment*/.getContext() == null) {
        }
        onExtraCallbackWithResult();
        return this.onWarmupCompleted;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = asBinder + 31;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return layoutInflaterCloneInContext;
    }

    public final Object generatedComponent() {
        Object objGeneratedComponent;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            objGeneratedComponent = onWarmupCompleted().generatedComponent();
            int i3 = 49 / 0;
        } else {
            objGeneratedComponent = onWarmupCompleted().generatedComponent();
        }
        int i4 = asBinder + 9;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return objGeneratedComponent;
        }
        throw null;
    }

    protected captureHierarchy IAuthTabCallback() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = IAuthTabCallbackDefault + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return capturehierarchy;
    }

    public final captureHierarchy onWarmupCompleted() {
        if (this.onExtraCallback == null) {
            synchronized (this.onNavigationEvent) {
                if (this.onExtraCallback == null) {
                    this.onExtraCallback = IAuthTabCallback();
                }
            }
        }
        return this.onExtraCallback;
    }

    protected void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            if (!this.onExtraCallbackWithResult) {
                this.onExtraCallbackWithResult = true;
                ((setUserName) generatedComponent()).onExtraCallbackWithResult((LoanBenefitAlarmSuccessFragment) animate.onExtraCallbackWithResult(this));
            }
            int i3 = IAuthTabCallbackDefault + 57;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 32 / 0;
                return;
            }
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i4 = IAuthTabCallbackDefault + 73;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedOnNavigationEvent;
    }
}
