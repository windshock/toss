package im.toss.features.home.ui.dst.view.home;

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
import o.getPackageBrief;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_HomeFragment<B extends SearchBarKtExternalSyntheticLambda5, VM extends NativePermissionRequire, LM extends RVManifestIProxyManifest> extends BaseHomeDstFragment<B, VM, LM> implements captureEndValues {
    private static int asBinder = 1;
    private static int asInterface;
    private final Object IAuthTabCallback;
    private boolean IAuthTabCallbackStub;
    private volatile captureHierarchy onExtraCallback;
    private ContextWrapper onExtraCallbackWithResult;
    private boolean onTransact;

    Hilt_HomeFragment(int i, Function1<? super View, ? extends B> function1) {
        super(i, function1);
        this.IAuthTabCallback = new Object();
        this.IAuthTabCallbackStub = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            super/*im.toss.base.BaseFragment*/.onAttach(context);
            onNavigationEvent();
            extraCommand();
            int i3 = asInterface + 83;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        super/*im.toss.base.BaseFragment*/.onAttach(context);
        onNavigationEvent();
        extraCommand();
        throw null;
    }

    public void onAttach(Activity activity) {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallbackWithResult;
        boolean z = true;
        if (contextWrapper != null && captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
            int i4 = asBinder + 5;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                z = false;
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onNavigationEvent();
        extraCommand();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        if (this.onExtraCallbackWithResult == null) {
            int i2 = asInterface + 103;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onTransact = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
            int i4 = asBinder + 95;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null) {
            int i2 = asInterface + 113;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 22 / 0;
                if (!this.onTransact) {
                    return null;
                }
            } else if (!this.onTransact) {
                return null;
            }
        }
        onNavigationEvent();
        ContextWrapper contextWrapper = this.onExtraCallbackWithResult;
        int i4 = asInterface + 93;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return contextWrapper;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
            int i3 = asInterface + 75;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return layoutInflaterCloneInContext;
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater2 = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        layoutInflaterOnGetLayoutInflater2.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater2, this));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = extraCallback().generatedComponent();
        int i4 = asInterface + 97;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return objGeneratedComponent;
    }

    protected captureHierarchy ICustomTabsCallbackStub() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = asBinder + 71;
        asInterface = i2 % 128;
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

    protected void extraCommand() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 41;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (this.IAuthTabCallbackStub) {
            return;
        }
        int i5 = i2 + 37;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        this.IAuthTabCallbackStub = true;
        ((getPackageBrief) generatedComponent()).onWarmupCompleted((HomeFragment) animate.onExtraCallbackWithResult(this));
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i4 = asBinder + 105;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return onwarmupcompletedOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
