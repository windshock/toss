package im.toss.features.main.ui;

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
import o.interceptConnectSocket;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_MainTabFragment extends BaseFragment implements captureEndValues {
    private static int asInterface = 1;
    private static int onTransact;
    private final Object IAuthTabCallback;
    private boolean onExtraCallback;
    private ContextWrapper onExtraCallbackWithResult;
    private volatile captureHierarchy onNavigationEvent;
    private boolean onWarmupCompleted;

    Hilt_MainTabFragment() {
        this.IAuthTabCallback = new Object();
        this.onExtraCallback = false;
    }

    Hilt_MainTabFragment(int i) {
        super(i);
        this.IAuthTabCallback = new Object();
        this.onExtraCallback = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            super.onAttach(context);
            onExtraCallbackWithResult();
            IAuthTabCallbackDefault();
        } else {
            super.onAttach(context);
            onExtraCallbackWithResult();
            IAuthTabCallbackDefault();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r1
      0x0022: PHI (r1v5 android.content.ContextWrapper) = (r1v4 android.content.ContextWrapper), (r1v9 android.content.ContextWrapper) binds: [B:8:0x0020, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        ContextWrapper contextWrapper;
        int i = 2 % 2;
        int i2 = onTransact + 123;
        asInterface = i2 % 128;
        boolean z = true;
        if (i2 % 2 == 0) {
            super/*androidx.fragment.app.Fragment*/.onAttach(activity);
            contextWrapper = this.onExtraCallbackWithResult;
            int i3 = 32 / 0;
            if (contextWrapper != null) {
                int i4 = asInterface + 111;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                    int i6 = asInterface + 7;
                    onTransact = i6 % 128;
                    if (i6 % 2 == 0) {
                        z = false;
                    }
                } else {
                    int i7 = asInterface + 119;
                    onTransact = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
        } else {
            super/*androidx.fragment.app.Fragment*/.onAttach(activity);
            contextWrapper = this.onExtraCallbackWithResult;
            if (contextWrapper != null) {
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallbackWithResult();
        IAuthTabCallbackDefault();
    }

    private void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (this.onExtraCallbackWithResult == null) {
            this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onWarmupCompleted = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
        int i4 = asInterface + 27;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null) {
            int i4 = onTransact + 25;
            asInterface = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (!this.onWarmupCompleted) {
                return null;
            }
        }
        onExtraCallbackWithResult();
        return this.onExtraCallbackWithResult;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
            int i3 = asInterface + 67;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                return layoutInflaterCloneInContext;
            }
            obj.hashCode();
            throw null;
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater2 = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        layoutInflaterOnGetLayoutInflater2.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater2, this));
        throw null;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted().generatedComponent();
            throw null;
        }
        Object objGeneratedComponent = onWarmupCompleted().generatedComponent();
        int i3 = onTransact + 55;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return objGeneratedComponent;
    }

    protected captureHierarchy onNavigationEvent() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = asInterface + 121;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return capturehierarchy;
        }
        throw null;
    }

    public final captureHierarchy onWarmupCompleted() {
        if (this.onNavigationEvent == null) {
            synchronized (this.IAuthTabCallback) {
                if (this.onNavigationEvent == null) {
                    this.onNavigationEvent = onNavigationEvent();
                }
            }
        }
        return this.onNavigationEvent;
    }

    protected void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onTransact + 1;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            if (this.onExtraCallback) {
                return;
            }
            int i4 = i3 + 123;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            this.onExtraCallback = true;
            ((interceptConnectSocket) generatedComponent()).onExtraCallback((MainTabFragment) animate.onExtraCallbackWithResult(this));
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory();
        if (i3 == 0) {
            return PathMotion.onNavigationEvent(this, defaultViewModelProviderFactory);
        }
        PathMotion.onNavigationEvent(this, defaultViewModelProviderFactory);
        throw null;
    }
}
