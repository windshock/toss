package im.toss.features.home.ui.dst.view.account.loan;

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
import o.setStateConnected;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_HomeDstLoanAccountFragment<B extends SearchBarKtExternalSyntheticLambda5, VM extends NativePermissionRequire, LM extends RVManifestIProxyManifest> extends BaseHomeDstFragment<B, VM, LM> implements captureEndValues {
    private static int asBinder = 1;
    private static int onTransact;
    private final Object IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private ContextWrapper onExtraCallback;
    private volatile captureHierarchy onExtraCallbackWithResult;

    Hilt_HomeDstLoanAccountFragment(int i, Function1<? super View, ? extends B> function1) {
        super(i, function1);
        this.IAuthTabCallback = new Object();
        this.IAuthTabCallbackStub = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.base.BaseFragment*/.onAttach(context);
        ICustomTabsCallback_Parcel();
        ICustomTabsCallbackStub();
        int i4 = asBinder + 9;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallback;
        if (contextWrapper != null) {
            int i2 = onTransact + 73;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 37 / 0;
                if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                    int i4 = onTransact + 91;
                    asBinder = i4 % 128;
                    int i5 = i4 % 2;
                    z = false;
                } else {
                    z = true;
                }
            } else if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        ICustomTabsCallback_Parcel();
        ICustomTabsCallbackStub();
    }

    private void ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 10 / 0;
            if (this.onExtraCallback != null) {
                return;
            }
        } else if (this.onExtraCallback != null) {
            return;
        }
        this.onExtraCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
        this.IAuthTabCallbackDefault = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        int i4 = onTransact + 3;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public Context getContext() {
        int i = 2 % 2;
        Object obj = null;
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null) {
            int i2 = asBinder + 119;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (!this.IAuthTabCallbackDefault) {
                return null;
            }
        }
        ICustomTabsCallback_Parcel();
        ContextWrapper contextWrapper = this.onExtraCallback;
        int i3 = asBinder + 73;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return contextWrapper;
        }
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = asBinder + 97;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return layoutInflaterCloneInContext;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object generatedComponent() {
        Object objGeneratedComponent;
        int i = 2 % 2;
        int i2 = onTransact + 71;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            objGeneratedComponent = onNavigationEvent().generatedComponent();
            int i3 = 14 / 0;
        } else {
            objGeneratedComponent = onNavigationEvent().generatedComponent();
        }
        int i4 = onTransact + 101;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return objGeneratedComponent;
    }

    protected captureHierarchy extraCallback() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = onTransact + 113;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 72 / 0;
        }
        return capturehierarchy;
    }

    public final captureHierarchy onNavigationEvent() {
        if (this.onExtraCallbackWithResult == null) {
            synchronized (this.IAuthTabCallback) {
                if (this.onExtraCallbackWithResult == null) {
                    this.onExtraCallbackWithResult = extraCallback();
                }
            }
        }
        return this.onExtraCallbackWithResult;
    }

    protected void ICustomTabsCallbackStub() {
        int i = 2 % 2;
        if (!this.IAuthTabCallbackStub) {
            int i2 = asBinder + 91;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallbackStub = true;
            ((setStateConnected) generatedComponent()).onWarmupCompleted((HomeDstLoanAccountFragment) animate.onExtraCallbackWithResult(this));
            int i4 = onTransact + 69;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i3 = onTransact + 33;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return onwarmupcompletedOnNavigationEvent;
    }
}
