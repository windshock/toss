package im.toss.features.alltab.feature.total_service.feature.total_service;

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
import o.getTabbarModel;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_TotalServiceFragment extends BaseFragment implements captureEndValues {
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private final Object IAuthTabCallback;
    private boolean onExtraCallback;
    private ContextWrapper onExtraCallbackWithResult;
    private volatile captureHierarchy onNavigationEvent;
    private boolean onWarmupCompleted;

    Hilt_TotalServiceFragment() {
        this.IAuthTabCallback = new Object();
        this.onExtraCallback = false;
    }

    Hilt_TotalServiceFragment(int i) {
        super(i);
        this.IAuthTabCallback = new Object();
        this.onExtraCallback = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(context);
        onExtraCallback();
        IAuthTabCallback();
        int i4 = IAuthTabCallbackStub + 89;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallbackWithResult;
        if (contextWrapper != null) {
            int i2 = IAuthTabCallbackStub + 33;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                captureHierarchy.onWarmupCompleted(contextWrapper);
                throw null;
            }
            if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                z = false;
            } else {
                int i3 = asInterface + 99;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallback();
        IAuthTabCallback();
    }

    private void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (this.onExtraCallbackWithResult == null) {
            this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onWarmupCompleted = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
        int i4 = IAuthTabCallbackStub + 77;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null) {
            int i4 = IAuthTabCallbackStub + 29;
            int i5 = i4 % 128;
            asInterface = i5;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (!this.onWarmupCompleted) {
                int i6 = i5 + 33;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 == 0) {
                    return null;
                }
                throw null;
            }
        }
        onExtraCallback();
        return this.onExtraCallbackWithResult;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        IAuthTabCallbackStub = i2 % 128;
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
        int i2 = asInterface + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = onNavigationEvent().generatedComponent();
        int i4 = asInterface + 45;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return objGeneratedComponent;
    }

    protected captureHierarchy onExtraCallbackWithResult() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = IAuthTabCallbackStub + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return capturehierarchy;
    }

    public final captureHierarchy onNavigationEvent() {
        if (this.onNavigationEvent == null) {
            synchronized (this.IAuthTabCallback) {
                if (this.onNavigationEvent == null) {
                    this.onNavigationEvent = onExtraCallbackWithResult();
                }
            }
        }
        return this.onNavigationEvent;
    }

    protected void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        int i3 = i2 % 128;
        asInterface = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (!this.onExtraCallback) {
                int i4 = i3 + 113;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                this.onExtraCallback = true;
                ((getTabbarModel) generatedComponent()).onExtraCallbackWithResult((TotalServiceFragment) animate.onExtraCallbackWithResult(this));
            }
            int i6 = IAuthTabCallbackStub + 27;
            asInterface = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        obj.hashCode();
        throw null;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i4 = IAuthTabCallbackStub + 91;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return onwarmupcompletedOnNavigationEvent;
    }
}
