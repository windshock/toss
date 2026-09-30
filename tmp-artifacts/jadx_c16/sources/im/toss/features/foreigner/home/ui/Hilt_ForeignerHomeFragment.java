package im.toss.features.foreigner.home.ui;

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
import o.sendNoRigHtToInvoke4NewJSAPIPermission;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_ForeignerHomeFragment extends BaseFragment implements captureEndValues {
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private final Object IAuthTabCallback;
    private ContextWrapper onExtraCallback;
    private volatile captureHierarchy onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private boolean onWarmupCompleted;

    Hilt_ForeignerHomeFragment() {
        this.IAuthTabCallback = new Object();
        this.onWarmupCompleted = false;
    }

    Hilt_ForeignerHomeFragment(int i) {
        super(i);
        this.IAuthTabCallback = new Object();
        this.onWarmupCompleted = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            super.onAttach(context);
            onExtraCallback();
            onActivityResized();
            int i3 = 60 / 0;
        } else {
            super.onAttach(context);
            onExtraCallback();
            onActivityResized();
        }
        int i4 = IAuthTabCallbackDefault + 103;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onAttach(Activity activity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallback;
        runAnimator.IAuthTabCallback(contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallback();
        onActivityResized();
        int i4 = IAuthTabCallbackDefault + 83;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
    }

    private void onExtraCallback() {
        int i = 2 % 2;
        if (this.onExtraCallback == null) {
            int i2 = IAuthTabCallbackDefault + 37;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                this.onExtraCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
                this.onNavigationEvent = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
                int i3 = 38 / 0;
            } else {
                this.onExtraCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
                this.onNavigationEvent = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
            }
        }
        int i4 = asInterface + 53;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null) {
            int i4 = IAuthTabCallbackDefault + 53;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 98 / 0;
                if (!this.onNavigationEvent) {
                    return null;
                }
            } else if (!this.onNavigationEvent) {
                return null;
            }
        }
        onExtraCallback();
        return this.onExtraCallback;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
            int i3 = IAuthTabCallbackDefault + 35;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                return layoutInflaterCloneInContext;
            }
            obj.hashCode();
            throw null;
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater2 = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        layoutInflaterOnGetLayoutInflater2.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater2, this));
        obj.hashCode();
        throw null;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = onActivityLayout().generatedComponent();
        int i4 = IAuthTabCallbackDefault + 67;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return objGeneratedComponent;
    }

    protected captureHierarchy onPostMessage() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = asInterface + 35;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return capturehierarchy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final captureHierarchy onActivityLayout() {
        if (this.onExtraCallbackWithResult == null) {
            synchronized (this.IAuthTabCallback) {
                if (this.onExtraCallbackWithResult == null) {
                    this.onExtraCallbackWithResult = onPostMessage();
                }
            }
        }
        return this.onExtraCallbackWithResult;
    }

    protected void onActivityResized() {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (this.onWarmupCompleted) {
            return;
        }
        this.onWarmupCompleted = true;
        ((sendNoRigHtToInvoke4NewJSAPIPermission) generatedComponent()).onNavigationEvent((ForeignerHomeFragment) animate.onExtraCallbackWithResult(this));
        int i4 = asInterface + 111;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
            int i3 = 81 / 0;
        } else {
            onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        }
        int i4 = IAuthTabCallbackDefault + 37;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return onwarmupcompletedOnNavigationEvent;
        }
        throw null;
    }
}
