package im.toss.features.home.ui.dst.view.analysis.contents.asset.categorized.loan;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import im.toss.features.home.core.ui.base.dst.BaseHomeDstActivityFragment;
import kotlin.jvm.functions.Function1;
import o.PathMotion;
import o.RVManifestIProxyManifest;
import o.Remote;
import o.SearchBarKtExternalSyntheticLambda5;
import o.StateViewController5;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_HomeDstAnalysisAssetLoanAccountFragment<B extends SearchBarKtExternalSyntheticLambda5, VM extends Remote, LM extends RVManifestIProxyManifest> extends BaseHomeDstActivityFragment<B, VM, LM> implements captureEndValues {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub;
    private final Object IAuthTabCallback;
    private boolean asInterface;
    private ContextWrapper onExtraCallback;
    private volatile captureHierarchy onExtraCallbackWithResult;
    private boolean onTransact;

    Hilt_HomeDstAnalysisAssetLoanAccountFragment(int i, Function1<? super View, ? extends B> function1) {
        super(i, function1);
        this.IAuthTabCallback = new Object();
        this.onTransact = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            super/*im.toss.base.BaseFragment*/.onAttach(context);
            extraCommand();
            ICustomTabsCallback_Parcel();
        } else {
            super/*im.toss.base.BaseFragment*/.onAttach(context);
            extraCommand();
            ICustomTabsCallback_Parcel();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r1
      0x0021: PHI (r1v5 android.content.ContextWrapper) = (r1v4 android.content.ContextWrapper), (r1v7 android.content.ContextWrapper) binds: [B:8:0x001f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        ContextWrapper contextWrapper;
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            super/*androidx.fragment.app.Fragment*/.onAttach(activity);
            contextWrapper = this.onExtraCallback;
            int i3 = 33 / 0;
            if (contextWrapper != null) {
                int i4 = IAuthTabCallbackDefault + 41;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                z = captureHierarchy.onWarmupCompleted(contextWrapper) == activity;
            }
        } else {
            super/*androidx.fragment.app.Fragment*/.onAttach(activity);
            contextWrapper = this.onExtraCallback;
            if (contextWrapper != null) {
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        extraCommand();
        ICustomTabsCallback_Parcel();
    }

    private void extraCommand() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (this.onExtraCallback == null) {
            this.onExtraCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.asInterface = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
        int i4 = IAuthTabCallbackStub + 49;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (super/*androidx.fragment.app.Fragment*/.getContext() != null || this.asInterface) {
                extraCommand();
                return this.onExtraCallback;
            }
            int i3 = IAuthTabCallbackStub + 105;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            throw null;
        }
        super/*androidx.fragment.app.Fragment*/.getContext();
        obj.hashCode();
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = IAuthTabCallbackStub + 17;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return layoutInflaterCloneInContext;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = ICustomTabsCallbackStub().generatedComponent();
        int i4 = IAuthTabCallbackStub + 111;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return objGeneratedComponent;
    }

    protected captureHierarchy mayLaunchUrl() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = IAuthTabCallbackDefault + 57;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return capturehierarchy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final captureHierarchy ICustomTabsCallbackStub() {
        if (this.onExtraCallbackWithResult == null) {
            synchronized (this.IAuthTabCallback) {
                if (this.onExtraCallbackWithResult == null) {
                    this.onExtraCallbackWithResult = mayLaunchUrl();
                }
            }
        }
        return this.onExtraCallbackWithResult;
    }

    protected void ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (!this.onTransact) {
            this.onTransact = true;
            ((StateViewController5) generatedComponent()).onNavigationEvent((HomeDstAnalysisAssetLoanAccountFragment) animate.onExtraCallbackWithResult(this));
            int i4 = IAuthTabCallbackStub + 79;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory();
        if (i3 != 0) {
            return PathMotion.onNavigationEvent(this, defaultViewModelProviderFactory);
        }
        PathMotion.onNavigationEvent(this, defaultViewModelProviderFactory);
        throw null;
    }
}
