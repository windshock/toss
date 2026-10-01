package im.toss.features.home.feature.asset_home.fragment.home;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import o.NativePermissionRequire;
import o.PathMotion;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.putString;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
abstract class Hilt_AssetInvestmentMiniHomeFragment<VM extends NativePermissionRequire> extends AssetInvestmentFragment<VM> implements captureEndValues {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub;
    private ContextWrapper IAuthTabCallback;
    private boolean asInterface;
    private volatile captureHierarchy onExtraCallback;
    private final Object onTransact = new Object();
    private boolean asBinder = false;

    Hilt_AssetInvestmentMiniHomeFragment() {
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            super/*im.toss.base.BaseFragment*/.onAttach(context);
            onNavigationEvent();
            extraCommand();
        } else {
            super/*im.toss.base.BaseFragment*/.onAttach(context);
            onNavigationEvent();
            extraCommand();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.IAuthTabCallback;
        if (contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity) {
            z = true;
        } else {
            int i4 = IAuthTabCallbackDefault + 119;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onNavigationEvent();
        extraCommand();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
            if (this.IAuthTabCallback != null) {
                return;
            }
        } else if (this.IAuthTabCallback != null) {
            return;
        }
        this.IAuthTabCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
        this.asInterface = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        int i4 = IAuthTabCallbackStub + 113;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (super/*androidx.fragment.app.Fragment*/.getContext() != null || this.asInterface) {
                onNavigationEvent();
                return this.IAuthTabCallback;
            }
            int i3 = IAuthTabCallbackStub + 69;
            int i4 = i3 % 128;
            IAuthTabCallbackDefault = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 57;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 28 / 0;
            }
            return null;
        }
        super/*androidx.fragment.app.Fragment*/.getContext();
        obj.hashCode();
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = IAuthTabCallbackStub + 59;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return layoutInflaterCloneInContext;
        }
        throw null;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        captureHierarchy capturehierarchyExtraCallback = extraCallback();
        if (i3 == 0) {
            return capturehierarchyExtraCallback.generatedComponent();
        }
        capturehierarchyExtraCallback.generatedComponent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected captureHierarchy ICustomTabsCallbackStub() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = IAuthTabCallbackDefault + 35;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 0;
        }
        return capturehierarchy;
    }

    public final captureHierarchy extraCallback() {
        if (this.onExtraCallback == null) {
            synchronized (this.onTransact) {
                if (this.onExtraCallback == null) {
                    this.onExtraCallback = ICustomTabsCallbackStub();
                }
            }
        }
        return this.onExtraCallback;
    }

    protected void extraCommand() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.asBinder) {
                return;
            }
            this.asBinder = true;
            ((putString) generatedComponent()).onExtraCallback((AssetInvestmentMiniHomeFragment) animate.onExtraCallbackWithResult(this));
            int i3 = IAuthTabCallbackDefault + 37;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i4 = IAuthTabCallbackDefault + 115;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return onwarmupcompletedOnNavigationEvent;
    }
}
