package im.toss.features.benefit.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import im.toss.base.BaseFragment;
import o.ContactUtils;
import o.PathMotion;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_GlobalBenefitTabFragment extends BaseFragment implements captureEndValues {
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    private boolean IAuthTabCallback;
    private final Object onExtraCallback;
    private volatile captureHierarchy onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private ContextWrapper onWarmupCompleted;

    Hilt_GlobalBenefitTabFragment() {
        this.onExtraCallback = new Object();
        this.onNavigationEvent = false;
    }

    Hilt_GlobalBenefitTabFragment(int i) {
        super(i);
        this.onExtraCallback = new Object();
        this.onNavigationEvent = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            super.onAttach(context);
            onWarmupCompleted();
            onTransact();
            int i3 = 83 / 0;
        } else {
            super.onAttach(context);
            onWarmupCompleted();
            onTransact();
        }
        int i4 = IAuthTabCallbackDefault + 93;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onWarmupCompleted;
        if (contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity) {
            z = true;
        } else {
            int i4 = IAuthTabCallbackDefault + 119;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onWarmupCompleted();
        onTransact();
        int i6 = onTransact + 75;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
    }

    private void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (this.onWarmupCompleted == null) {
            this.onWarmupCompleted = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.IAuthTabCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
        int i4 = onTransact + 95;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public Context getContext() {
        int i = 2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() != null || !(!this.IAuthTabCallback)) {
            onWarmupCompleted();
            return this.onWarmupCompleted;
        }
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 73;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 75;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = IAuthTabCallbackDefault + 1;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return layoutInflaterCloneInContext;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = onExtraCallbackWithResult().generatedComponent();
        int i4 = IAuthTabCallbackDefault + 75;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return objGeneratedComponent;
    }

    protected captureHierarchy onExtraCallback() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = onTransact + 93;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 96 / 0;
        }
        return capturehierarchy;
    }

    public final captureHierarchy onExtraCallbackWithResult() {
        if (this.onExtraCallbackWithResult == null) {
            synchronized (this.onExtraCallback) {
                if (this.onExtraCallbackWithResult == null) {
                    this.onExtraCallbackWithResult = onExtraCallback();
                }
            }
        }
        return this.onExtraCallbackWithResult;
    }

    protected void onTransact() {
        ContactUtils contactUtils;
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        if (!this.onNavigationEvent) {
            int i2 = onTransact + 89;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                this.onNavigationEvent = false;
                contactUtils = (ContactUtils) generatedComponent();
                objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
            } else {
                this.onNavigationEvent = true;
                contactUtils = (ContactUtils) generatedComponent();
                objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
            }
            contactUtils.onExtraCallbackWithResult((GlobalBenefitTabFragment) objOnExtraCallbackWithResult);
        }
        int i3 = onTransact + 47;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory();
        if (i3 != 0) {
            return PathMotion.onNavigationEvent(this, defaultViewModelProviderFactory);
        }
        PathMotion.onNavigationEvent(this, defaultViewModelProviderFactory);
        throw null;
    }
}
