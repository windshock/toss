package im.toss.features.credit.ui.legacy.detail.tips;

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
import o.encodeHex;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_CreditTipListFragment extends BaseFragment implements captureEndValues {
    private static int asInterface = 0;
    private static int onTransact = 1;
    private boolean IAuthTabCallback;
    private final Object onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private ContextWrapper onNavigationEvent;
    private volatile captureHierarchy onWarmupCompleted;

    Hilt_CreditTipListFragment() {
        this.onExtraCallback = new Object();
        this.onExtraCallbackWithResult = false;
    }

    Hilt_CreditTipListFragment(int i) {
        super(i);
        this.onExtraCallback = new Object();
        this.onExtraCallbackWithResult = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            super.onAttach(context);
            onExtraCallback();
            onWarmupCompleted();
            int i3 = 11 / 0;
        } else {
            super.onAttach(context);
            onExtraCallback();
            onWarmupCompleted();
        }
        int i4 = onTransact + 39;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onNavigationEvent;
        if (contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity) {
            int i2 = asInterface + 73;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            int i4 = asInterface + 19;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallback();
        onWarmupCompleted();
    }

    private void onExtraCallback() {
        int i = 2 % 2;
        if (this.onNavigationEvent == null) {
            int i2 = asInterface + 17;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.IAuthTabCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
        int i4 = onTransact + 119;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            if (super/*androidx.fragment.app.Fragment*/.getContext() != null || this.IAuthTabCallback) {
                onExtraCallback();
                return this.onNavigationEvent;
            }
            int i3 = onTransact + 71;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        super/*androidx.fragment.app.Fragment*/.getContext();
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
            int i3 = 83 / 0;
            return layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater2 = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater2.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater2, this));
    }

    public final Object generatedComponent() {
        Object objGeneratedComponent;
        int i = 2 % 2;
        int i2 = asInterface + 105;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            objGeneratedComponent = onNavigationEvent().generatedComponent();
            int i3 = 81 / 0;
        } else {
            objGeneratedComponent = onNavigationEvent().generatedComponent();
        }
        int i4 = asInterface + 39;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return objGeneratedComponent;
    }

    protected captureHierarchy IAuthTabCallback() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = asInterface + 113;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return capturehierarchy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final captureHierarchy onNavigationEvent() {
        if (this.onWarmupCompleted == null) {
            synchronized (this.onExtraCallback) {
                if (this.onWarmupCompleted == null) {
                    this.onWarmupCompleted = IAuthTabCallback();
                }
            }
        }
        return this.onWarmupCompleted;
    }

    protected void onWarmupCompleted() {
        int i = 2 % 2;
        if (!this.onExtraCallbackWithResult) {
            int i2 = asInterface + 83;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult = true;
            ((encodeHex) generatedComponent()).onNavigationEvent((CreditTipListFragment) animate.onExtraCallbackWithResult(this));
        }
        int i4 = asInterface + 57;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
            throw null;
        }
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i3 = asInterface + 41;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return onwarmupcompletedOnNavigationEvent;
    }
}
