package im.toss.features.home.ui.dst.view.analysis.contents.asset.categorized.loan;

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
import o.StateViewController7;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_HomeDstAnalysisAssetLoanPaybackFragment<B extends SearchBarKtExternalSyntheticLambda5, VM extends NativePermissionRequire, LM extends RVManifestIProxyManifest> extends BaseHomeDstFragment<B, VM, LM> implements captureEndValues {
    private static int IAuthTabCallbackStub = 1;
    private static int onTransact;
    private ContextWrapper IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private boolean asBinder;
    private volatile captureHierarchy onExtraCallback;
    private final Object onExtraCallbackWithResult;

    Hilt_HomeDstAnalysisAssetLoanPaybackFragment(int i, Function1<? super View, ? extends B> function1) {
        super(i, function1);
        this.onExtraCallbackWithResult = new Object();
        this.IAuthTabCallbackDefault = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.base.BaseFragment*/.onAttach(context);
        mayLaunchUrl();
        ICustomTabsCallbackStub();
        int i4 = onTransact + 3;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.IAuthTabCallback;
        if (contextWrapper != null) {
            int i2 = IAuthTabCallbackStub + 9;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                int i4 = IAuthTabCallbackStub + 61;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 / 4;
                }
                z = false;
            } else {
                z = true;
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        mayLaunchUrl();
        ICustomTabsCallbackStub();
    }

    private void mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 45;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (this.IAuthTabCallback == null) {
            int i5 = i2 + 85;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            this.IAuthTabCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.asBinder = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null) {
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 3;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            if (!this.asBinder) {
                int i5 = i2 + 57;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return null;
            }
        }
        mayLaunchUrl();
        return this.IAuthTabCallback;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
            return layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater2 = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        layoutInflaterOnGetLayoutInflater2.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater2, this));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = onNavigationEvent().generatedComponent();
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        return objGeneratedComponent;
    }

    protected captureHierarchy extraCallback() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = IAuthTabCallbackStub + 39;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return capturehierarchy;
        }
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
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 47;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (!(!this.IAuthTabCallbackDefault)) {
            return;
        }
        int i5 = i2 + 115;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        this.IAuthTabCallbackDefault = true;
        ((StateViewController7) generatedComponent()).onExtraCallbackWithResult((HomeDstAnalysisAssetLoanPaybackFragment) animate.onExtraCallbackWithResult(this));
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i4 = onTransact + 103;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedOnNavigationEvent;
    }
}
