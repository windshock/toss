package im.toss.features.mobileid.impl.view;

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
import o.skipWhitespace;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_MobileIdIssueOtherVcFragment extends BaseFragment implements captureEndValues {
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    private boolean IAuthTabCallback;
    private boolean onExtraCallback;
    private ContextWrapper onExtraCallbackWithResult;
    private volatile captureHierarchy onNavigationEvent;
    private final Object onWarmupCompleted;

    Hilt_MobileIdIssueOtherVcFragment() {
        this.onWarmupCompleted = new Object();
        this.IAuthTabCallback = false;
    }

    Hilt_MobileIdIssueOtherVcFragment(int i) {
        super(i);
        this.onWarmupCompleted = new Object();
        this.IAuthTabCallback = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(context);
        IAuthTabCallbackDefault();
        asInterface();
        int i4 = IAuthTabCallbackDefault + 27;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            super/*androidx.fragment.app.Fragment*/.onAttach(activity);
            ContextWrapper contextWrapper = this.onExtraCallbackWithResult;
            if (contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity) {
                z = true;
            } else {
                int i3 = IAuthTabCallbackDefault + 71;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                z = false;
            }
            runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
            IAuthTabCallbackDefault();
            asInterface();
            return;
        }
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        if (this.onExtraCallbackWithResult == null) {
            int i5 = i3 + 79;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
                this.onExtraCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
            } else {
                this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
                this.onExtraCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() != null || !(!this.onExtraCallback)) {
            IAuthTabCallbackDefault();
            ContextWrapper contextWrapper = this.onExtraCallbackWithResult;
            int i2 = onTransact + 39;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return contextWrapper;
        }
        int i4 = onTransact + 11;
        IAuthTabCallbackDefault = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterCloneInContext;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
            layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
            int i3 = 72 / 0;
        } else {
            LayoutInflater layoutInflaterOnGetLayoutInflater2 = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
            layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater2.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater2, this));
        }
        int i4 = IAuthTabCallbackDefault + 69;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return layoutInflaterCloneInContext;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted().generatedComponent();
            throw null;
        }
        Object objGeneratedComponent = onWarmupCompleted().generatedComponent();
        int i3 = onTransact + 125;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return objGeneratedComponent;
    }

    protected captureHierarchy onExtraCallbackWithResult() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = IAuthTabCallbackDefault + 93;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 24 / 0;
        }
        return capturehierarchy;
    }

    public final captureHierarchy onWarmupCompleted() {
        if (this.onNavigationEvent == null) {
            synchronized (this.onWarmupCompleted) {
                if (this.onNavigationEvent == null) {
                    this.onNavigationEvent = onExtraCallbackWithResult();
                }
            }
        }
        return this.onNavigationEvent;
    }

    protected void asInterface() {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            if (this.IAuthTabCallback) {
                return;
            }
            this.IAuthTabCallback = true;
            ((skipWhitespace) generatedComponent()).onNavigationEvent((MobileIdIssueOtherVcFragment) animate.onExtraCallbackWithResult(this));
            int i3 = IAuthTabCallbackDefault + 3;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        throw null;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory();
        if (i3 == 0) {
            return PathMotion.onNavigationEvent(this, defaultViewModelProviderFactory);
        }
        PathMotion.onNavigationEvent(this, defaultViewModelProviderFactory);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
