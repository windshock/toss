package im.toss.features.home.ui.dst.view.analysis.contents.asset.categorized.deposit;

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
import o.nativeRegisterWithPerfetto;
import o.runAnimator;
import o.setContext;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_HomeDstAnalysisAssetDepositTransactionFragment<B extends SearchBarKtExternalSyntheticLambda5, VM extends NativePermissionRequire, LM extends RVManifestIProxyManifest> extends BaseHomeDstFragment<B, VM, LM> implements captureEndValues {
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    private ContextWrapper IAuthTabCallback;
    private boolean IAuthTabCallbackStub;
    private boolean asBinder;
    private volatile captureHierarchy onExtraCallback;
    private final Object onExtraCallbackWithResult;

    Hilt_HomeDstAnalysisAssetDepositTransactionFragment(int i, Function1<? super View, ? extends B> function1) {
        super(i, function1);
        this.onExtraCallbackWithResult = new Object();
        this.IAuthTabCallbackStub = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.base.BaseFragment*/.onAttach(context);
        isEngagementSignalsApiAvailable();
        ICustomTabsCallbackStub();
        int i4 = IAuthTabCallbackDefault + 115;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.IAuthTabCallback;
        if (contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity) {
            z = true;
        } else {
            int i2 = IAuthTabCallbackDefault + 21;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        isEngagementSignalsApiAvailable();
        ICustomTabsCallbackStub();
        int i4 = onTransact + 73;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private void isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 27;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (this.IAuthTabCallback == null) {
            int i5 = i2 + 121;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            this.IAuthTabCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.asBinder = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            super/*androidx.fragment.app.Fragment*/.getContext();
            throw null;
        }
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.asBinder) {
            return null;
        }
        isEngagementSignalsApiAvailable();
        ContextWrapper contextWrapper = this.IAuthTabCallback;
        int i3 = IAuthTabCallbackDefault + 41;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return contextWrapper;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
            return layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater2 = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        layoutInflaterOnGetLayoutInflater2.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater2, this));
        throw null;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = onNavigationEvent().generatedComponent();
        int i4 = onTransact + 11;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return objGeneratedComponent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected captureHierarchy extraCallback() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = IAuthTabCallbackDefault + 101;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return capturehierarchy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final captureHierarchy onNavigationEvent() {
        if (this.onExtraCallback == null) {
            synchronized (this.onExtraCallbackWithResult) {
                if (this.onExtraCallback == null) {
                    this.onExtraCallback = extraCallback();
                }
            }
        }
        return this.onExtraCallback;
    }

    protected void ICustomTabsCallbackStub() {
        int i = 2 % 2;
        if (this.IAuthTabCallbackStub) {
            return;
        }
        int i2 = onTransact + 85;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStub = true;
        ((setContext) generatedComponent()).onExtraCallback((HomeDstAnalysisAssetDepositTransactionFragment) animate.onExtraCallbackWithResult(this));
        int i4 = IAuthTabCallbackDefault + 65;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
            throw null;
        }
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i3 = IAuthTabCallbackDefault + 13;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return onwarmupcompletedOnNavigationEvent;
    }
}
