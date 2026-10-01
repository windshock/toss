package im.toss.features.home.feature.asset_home.fragment.home;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import o.NativePermissionRequire;
import o.PathMotion;
import o.RVScheduleType;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
abstract class Hilt_AssetInvestmentCategoryHomeFragment<VM extends NativePermissionRequire> extends AssetInvestmentFragment<VM> implements captureEndValues {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private volatile captureHierarchy IAuthTabCallback;
    private final Object IAuthTabCallbackDefault = new Object();
    private boolean asBinder = false;
    private boolean asInterface;
    private ContextWrapper onExtraCallback;

    Hilt_AssetInvestmentCategoryHomeFragment() {
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.base.BaseFragment*/.onAttach(context);
        onNavigationEvent();
        ICustomTabsCallback_Parcel();
        int i4 = IAuthTabCallbackStub + 121;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onAttach(Activity activity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallback;
        boolean z = true;
        if (contextWrapper != null && captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
            int i4 = onTransact + 61;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                z = false;
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onNavigationEvent();
        ICustomTabsCallback_Parcel();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        if (this.onExtraCallback == null) {
            int i2 = IAuthTabCallbackStub + 19;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                this.onExtraCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
                this.asInterface = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
                throw null;
            }
            this.onExtraCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.asInterface = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
        int i3 = IAuthTabCallbackStub + 93;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null) {
            int i4 = IAuthTabCallbackStub + 13;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (!this.asInterface) {
                return null;
            }
        }
        onNavigationEvent();
        return this.onExtraCallback;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = IAuthTabCallbackStub + 105;
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
        int i2 = IAuthTabCallbackStub + 89;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = extraCallback().generatedComponent();
        int i4 = onTransact + 41;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return objGeneratedComponent;
    }

    protected captureHierarchy ICustomTabsCallbackStub() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = IAuthTabCallbackStub + 83;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return capturehierarchy;
    }

    public final captureHierarchy extraCallback() {
        if (this.IAuthTabCallback == null) {
            synchronized (this.IAuthTabCallbackDefault) {
                if (this.IAuthTabCallback == null) {
                    this.IAuthTabCallback = ICustomTabsCallbackStub();
                }
            }
        }
        return this.IAuthTabCallback;
    }

    protected void ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.asBinder) {
            this.asBinder = true;
            ((RVScheduleType) generatedComponent()).onExtraCallbackWithResult((AssetInvestmentCategoryHomeFragment) animate.onExtraCallbackWithResult(this));
        }
        int i3 = onTransact + 71;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        IAuthTabCallbackStub = i2 % 128;
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
