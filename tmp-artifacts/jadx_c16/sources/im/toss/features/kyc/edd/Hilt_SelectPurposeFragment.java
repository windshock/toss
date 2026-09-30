package im.toss.features.kyc.edd;

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
import o.getIgnorePermissionCheck;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_SelectPurposeFragment extends BaseFragment implements captureEndValues {
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface;
    private boolean IAuthTabCallback;
    private boolean onExtraCallback;
    private ContextWrapper onExtraCallbackWithResult;
    private volatile captureHierarchy onNavigationEvent;
    private final Object onWarmupCompleted;

    Hilt_SelectPurposeFragment() {
        this.onWarmupCompleted = new Object();
        this.onExtraCallback = false;
    }

    Hilt_SelectPurposeFragment(int i) {
        super(i);
        this.onWarmupCompleted = new Object();
        this.onExtraCallback = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(context);
        onExtraCallback();
        onWarmupCompleted();
        int i4 = IAuthTabCallbackDefault + 73;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
    }

    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallbackWithResult;
        if (contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity) {
            int i4 = IAuthTabCallbackDefault + 43;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            int i6 = IAuthTabCallbackDefault + 73;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallback();
        onWarmupCompleted();
        int i8 = IAuthTabCallbackDefault + 73;
        asInterface = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.onExtraCallbackWithResult == null) {
            this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.IAuthTabCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
        int i3 = IAuthTabCallbackDefault + 17;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() != null || this.IAuthTabCallback) {
            onExtraCallback();
            return this.onExtraCallbackWithResult;
        }
        int i4 = asInterface + 119;
        IAuthTabCallbackDefault = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = IAuthTabCallbackDefault + 83;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return layoutInflaterCloneInContext;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = IAuthTabCallback().generatedComponent();
        int i4 = asInterface + 41;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return objGeneratedComponent;
    }

    protected captureHierarchy onNavigationEvent() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = IAuthTabCallbackDefault + 57;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 44 / 0;
        }
        return capturehierarchy;
    }

    public final captureHierarchy IAuthTabCallback() {
        if (this.onNavigationEvent == null) {
            synchronized (this.onWarmupCompleted) {
                if (this.onNavigationEvent == null) {
                    this.onNavigationEvent = onNavigationEvent();
                }
            }
        }
        return this.onNavigationEvent;
    }

    protected void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 69 / 0;
            if (this.onExtraCallback) {
                return;
            }
        } else if (this.onExtraCallback) {
            return;
        }
        this.onExtraCallback = true;
        ((getIgnorePermissionCheck) generatedComponent()).onWarmupCompleted((SelectPurposeFragment) animate.onExtraCallbackWithResult(this));
        int i4 = IAuthTabCallbackDefault + 67;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i4 = IAuthTabCallbackDefault + 53;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return onwarmupcompletedOnNavigationEvent;
    }
}
