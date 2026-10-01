package im.toss.features.loan.home;

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
import o.prepareSubpackage;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_LoanRefinancingListFragment extends BaseFragment implements captureEndValues {
    private static int asBinder = 1;
    private static int onTransact;
    private volatile captureHierarchy IAuthTabCallback;
    private final Object onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private ContextWrapper onWarmupCompleted;

    Hilt_LoanRefinancingListFragment() {
        this.onExtraCallback = new Object();
        this.onExtraCallbackWithResult = false;
    }

    Hilt_LoanRefinancingListFragment(int i) {
        super(i);
        this.onExtraCallback = new Object();
        this.onExtraCallbackWithResult = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.onAttach(context);
            onWarmupCompleted();
            onExtraCallbackWithResult();
            int i3 = onTransact + 31;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        super.onAttach(context);
        onWarmupCompleted();
        onExtraCallbackWithResult();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        int i = 2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onWarmupCompleted;
        boolean z = true;
        if (contextWrapper != null) {
            int i2 = asBinder + 9;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 48 / 0;
                if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                    int i4 = onTransact + 55;
                    asBinder = i4 % 128;
                    if (i4 % 2 != 0) {
                        z = false;
                    }
                }
            } else if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onWarmupCompleted();
        onExtraCallbackWithResult();
    }

    private void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 45 / 0;
            if (this.onWarmupCompleted != null) {
                return;
            }
        } else if (this.onWarmupCompleted != null) {
            return;
        }
        this.onWarmupCompleted = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
        this.onNavigationEvent = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        int i4 = onTransact + 23;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Context getContext() {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 64 / 0;
            if (super/*androidx.fragment.app.Fragment*/.getContext() == null) {
                if (!this.onNavigationEvent) {
                    int i4 = asBinder + 89;
                    onTransact = i4 % 128;
                    if (i4 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
            }
        } else if (super/*androidx.fragment.app.Fragment*/.getContext() == null) {
        }
        onWarmupCompleted();
        return this.onWarmupCompleted;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterCloneInContext;
        int i = 2 % 2;
        int i2 = onTransact + 71;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
            layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
            int i3 = 19 / 0;
        } else {
            LayoutInflater layoutInflaterOnGetLayoutInflater2 = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
            layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater2.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater2, this));
        }
        int i4 = onTransact + 93;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return layoutInflaterCloneInContext;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = IAuthTabCallback().generatedComponent();
        int i4 = asBinder + 79;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return objGeneratedComponent;
    }

    protected captureHierarchy onExtraCallback() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = onTransact + 29;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 35 / 0;
        }
        return capturehierarchy;
    }

    public final captureHierarchy IAuthTabCallback() {
        if (this.IAuthTabCallback == null) {
            synchronized (this.onExtraCallback) {
                if (this.IAuthTabCallback == null) {
                    this.IAuthTabCallback = onExtraCallback();
                }
            }
        }
        return this.IAuthTabCallback;
    }

    protected void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (!this.onExtraCallbackWithResult) {
            this.onExtraCallbackWithResult = true;
            ((prepareSubpackage) generatedComponent()).onNavigationEvent((LoanRefinancingListFragment) animate.onExtraCallbackWithResult(this));
        }
        int i4 = asBinder + 115;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
            throw null;
        }
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i3 = onTransact + 95;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return onwarmupcompletedOnNavigationEvent;
    }
}
