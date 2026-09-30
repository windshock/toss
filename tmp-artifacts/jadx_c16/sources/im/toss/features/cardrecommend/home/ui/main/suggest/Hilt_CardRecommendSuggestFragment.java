package im.toss.features.cardrecommend.home.ui.main.suggest;

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
import o.unregisterWifiReceiver;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_CardRecommendSuggestFragment extends BaseFragment implements captureEndValues {
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private final Object IAuthTabCallback;
    private volatile captureHierarchy onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private ContextWrapper onNavigationEvent;
    private boolean onWarmupCompleted;

    Hilt_CardRecommendSuggestFragment() {
        this.IAuthTabCallback = new Object();
        this.onExtraCallbackWithResult = false;
    }

    Hilt_CardRecommendSuggestFragment(int i) {
        super(i);
        this.IAuthTabCallback = new Object();
        this.onExtraCallbackWithResult = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(context);
        IAuthTabCallback();
        asInterface();
        int i4 = asBinder + 35;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            super/*androidx.fragment.app.Fragment*/.onAttach(activity);
            throw null;
        }
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onNavigationEvent;
        if (contextWrapper != null) {
            int i3 = IAuthTabCallbackStub + 123;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                captureHierarchy.onWarmupCompleted(contextWrapper);
                throw null;
            }
            z = captureHierarchy.onWarmupCompleted(contextWrapper) == activity;
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        IAuthTabCallback();
        asInterface();
    }

    private void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 != 0) {
            if (this.onNavigationEvent == null) {
                int i4 = i3 + 69;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                this.onNavigationEvent = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
                this.onWarmupCompleted = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
                return;
            }
            return;
        }
        throw null;
    }

    public Context getContext() {
        int i = 2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() != null || !(!this.onWarmupCompleted)) {
            IAuthTabCallback();
            return this.onNavigationEvent;
        }
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 77;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 65;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = IAuthTabCallbackStub + 93;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return layoutInflaterCloneInContext;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = IAuthTabCallbackStub().generatedComponent();
        int i4 = asBinder + 79;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return objGeneratedComponent;
        }
        throw null;
    }

    protected captureHierarchy IAuthTabCallbackDefault() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = asBinder + 53;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 1 / 0;
        }
        return capturehierarchy;
    }

    public final captureHierarchy IAuthTabCallbackStub() {
        if (this.onExtraCallback == null) {
            synchronized (this.IAuthTabCallback) {
                if (this.onExtraCallback == null) {
                    this.onExtraCallback = IAuthTabCallbackDefault();
                }
            }
        }
        return this.onExtraCallback;
    }

    protected void asInterface() {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        if (!(!this.onExtraCallbackWithResult)) {
            return;
        }
        int i5 = i3 + 29;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            this.onExtraCallbackWithResult = false;
        } else {
            this.onExtraCallbackWithResult = true;
        }
        ((unregisterWifiReceiver) generatedComponent()).onExtraCallback((CardRecommendSuggestFragment) animate.onExtraCallbackWithResult(this));
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i4 = IAuthTabCallbackStub + 31;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return onwarmupcompletedOnNavigationEvent;
    }
}
