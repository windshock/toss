package im.toss.features.home.ui.dst.view.asset.summary;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import im.toss.features.home.core.ui.base.dst.BaseHomeDstFragment;
import kotlin.jvm.functions.Function1;
import o.NativePermissionRequire;
import o.PathMotion;
import o.RVManifestIProxyManifest;
import o.SearchBarKtExternalSyntheticLambda5;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.isAutoInstall;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_AssetSummaryFragment<B extends SearchBarKtExternalSyntheticLambda5, VM extends NativePermissionRequire, LM extends RVManifestIProxyManifest> extends BaseHomeDstFragment<B, VM, LM> implements captureEndValues {
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private final Object IAuthTabCallback;
    private boolean IAuthTabCallbackStub;
    private boolean asBinder;
    private volatile captureHierarchy onExtraCallback;
    private ContextWrapper onExtraCallbackWithResult;

    Hilt_AssetSummaryFragment(int i, Function1<? super View, ? extends B> function1) {
        super(i, function1);
        this.IAuthTabCallback = new Object();
        this.asBinder = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.base.BaseFragment*/.onAttach(context);
        onNavigationEvent();
        ICustomTabsCallback_Parcel();
        int i4 = asInterface + 43;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            super/*androidx.fragment.app.Fragment*/.onAttach(activity);
            ContextWrapper contextWrapper = this.onExtraCallbackWithResult;
            if (contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity) {
                int i3 = IAuthTabCallbackDefault + 71;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                int i5 = asInterface + 49;
                int i6 = i5 % 128;
                IAuthTabCallbackDefault = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 11;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
                z = false;
            }
            runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
            onNavigationEvent();
            ICustomTabsCallback_Parcel();
            return;
        }
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        throw null;
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        if (this.onExtraCallbackWithResult == null) {
            int i2 = IAuthTabCallbackDefault + 35;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
                this.IAuthTabCallbackStub = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
                throw null;
            }
            this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.IAuthTabCallbackStub = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
            int i3 = asInterface + 55;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() != null || !(!this.IAuthTabCallbackStub)) {
            onNavigationEvent();
            return this.onExtraCallbackWithResult;
        }
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 11;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 117;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = IAuthTabCallbackDefault + 69;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return layoutInflaterCloneInContext;
        }
        throw null;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = extraCallback().generatedComponent();
        int i4 = IAuthTabCallbackDefault + 85;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return objGeneratedComponent;
    }

    protected captureHierarchy ICustomTabsCallbackStub() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = asInterface + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return capturehierarchy;
    }

    public final captureHierarchy extraCallback() {
        if (this.onExtraCallback == null) {
            synchronized (this.IAuthTabCallback) {
                if (this.onExtraCallback == null) {
                    this.onExtraCallback = ICustomTabsCallbackStub();
                }
            }
        }
        return this.onExtraCallback;
    }

    protected void ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (this.asBinder) {
            return;
        }
        this.asBinder = true;
        ((isAutoInstall) generatedComponent()).onExtraCallbackWithResult((AssetSummaryFragment) animate.onExtraCallbackWithResult(this));
        int i4 = asInterface + 1;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i4 = IAuthTabCallbackDefault + 107;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedOnNavigationEvent;
    }
}
