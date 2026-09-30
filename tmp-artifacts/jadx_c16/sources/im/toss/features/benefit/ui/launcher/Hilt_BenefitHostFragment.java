package im.toss.features.benefit.ui.launcher;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import im.toss.base.BaseFragment;
import o.PathMotion;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_BenefitHostFragment extends BaseFragment implements captureEndValues {
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private boolean IAuthTabCallback;
    private final Object onExtraCallback;
    private ContextWrapper onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private volatile captureHierarchy onWarmupCompleted;

    Hilt_BenefitHostFragment() {
        this.onExtraCallback = new Object();
        this.onNavigationEvent = false;
    }

    Hilt_BenefitHostFragment(int i) {
        super(i);
        this.onExtraCallback = new Object();
        this.onNavigationEvent = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onAttach(context);
            onExtraCallback();
            onWarmupCompleted();
            int i3 = IAuthTabCallbackStub + 119;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        super.onAttach(context);
        onExtraCallback();
        onWarmupCompleted();
        obj.hashCode();
        throw null;
    }

    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallbackWithResult;
        if (contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity) {
            z = true;
        } else {
            int i2 = asInterface + 105;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallback();
        onWarmupCompleted();
        int i4 = asInterface + 113;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 23 / 0;
            if (this.onExtraCallbackWithResult != null) {
                return;
            }
        } else if (this.onExtraCallbackWithResult != null) {
            return;
        }
        this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
        this.IAuthTabCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        int i4 = asInterface + 97;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public Context getContext() {
        int i = 2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() != null || this.IAuthTabCallback) {
            onExtraCallback();
            return this.onExtraCallbackWithResult;
        }
        int i2 = asInterface;
        int i3 = i2 + 109;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 121;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = asInterface + 103;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return layoutInflaterCloneInContext;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback().generatedComponent();
            throw null;
        }
        Object objGeneratedComponent = IAuthTabCallback().generatedComponent();
        int i3 = asInterface + 15;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return objGeneratedComponent;
        }
        obj.hashCode();
        throw null;
    }

    protected captureHierarchy onNavigationEvent() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = IAuthTabCallbackStub + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return capturehierarchy;
    }

    public final captureHierarchy IAuthTabCallback() {
        if (this.onWarmupCompleted == null) {
            synchronized (this.onExtraCallback) {
                if (this.onWarmupCompleted == null) {
                    this.onWarmupCompleted = onNavigationEvent();
                }
            }
        }
        return this.onWarmupCompleted;
    }

    protected void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (!this.onNavigationEvent) {
            this.onNavigationEvent = true;
        }
        int i4 = asInterface + 25;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory();
        if (i3 != 0) {
            return PathMotion.onNavigationEvent(this, defaultViewModelProviderFactory);
        }
        PathMotion.onNavigationEvent(this, defaultViewModelProviderFactory);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
