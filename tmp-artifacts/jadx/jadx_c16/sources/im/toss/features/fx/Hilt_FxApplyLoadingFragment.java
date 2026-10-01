package im.toss.features.fx;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import im.toss.base.BaseFragment;
import o.PathMotion;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_FxApplyLoadingFragment extends BaseFragment implements captureEndValues {
    private static int asInterface = 0;
    private static int onTransact = 1;
    private boolean IAuthTabCallback;
    private final Object onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private ContextWrapper onNavigationEvent;
    private volatile captureHierarchy onWarmupCompleted;

    Hilt_FxApplyLoadingFragment() {
        this.onExtraCallback = new Object();
        this.IAuthTabCallback = false;
    }

    Hilt_FxApplyLoadingFragment(int i) {
        super(i);
        this.onExtraCallback = new Object();
        this.IAuthTabCallback = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(context);
        onNavigationEvent();
        onWarmupCompleted();
        int i4 = onTransact + 27;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r1
      0x0021: PHI (r1v5 android.content.ContextWrapper) = (r1v4 android.content.ContextWrapper), (r1v9 android.content.ContextWrapper) binds: [B:8:0x001f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        ContextWrapper contextWrapper;
        boolean z;
        int i = 2 % 2;
        int i2 = asInterface + 15;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            super/*androidx.fragment.app.Fragment*/.onAttach(activity);
            contextWrapper = this.onNavigationEvent;
            int i3 = 81 / 0;
            if (contextWrapper != null) {
                if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                    int i4 = onTransact + 9;
                    asInterface = i4 % 128;
                    int i5 = i4 % 2;
                    z = false;
                } else {
                    z = true;
                }
            }
        } else {
            super/*androidx.fragment.app.Fragment*/.onAttach(activity);
            contextWrapper = this.onNavigationEvent;
            if (contextWrapper != null) {
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onNavigationEvent();
        onWarmupCompleted();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (this.onNavigationEvent == null) {
            this.onNavigationEvent = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onExtraCallbackWithResult = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
            int i4 = onTransact + 107;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null) {
            int i2 = onTransact + 45;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            if (!this.onExtraCallbackWithResult) {
                int i5 = i3 + 115;
                int i6 = i5 % 128;
                onTransact = i6;
                Object obj = null;
                if (i5 % 2 == 0) {
                    throw null;
                }
                int i7 = i6 + 59;
                asInterface = i7 % 128;
                if (i7 % 2 == 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
        }
        onNavigationEvent();
        return this.onNavigationEvent;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
            int i3 = asInterface + 79;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return layoutInflaterCloneInContext;
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater2 = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        layoutInflaterOnGetLayoutInflater2.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater2, this));
        throw null;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback().generatedComponent();
            throw null;
        }
        Object objGeneratedComponent = IAuthTabCallback().generatedComponent();
        int i3 = onTransact + 77;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return objGeneratedComponent;
    }

    protected captureHierarchy onExtraCallbackWithResult() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = onTransact + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return capturehierarchy;
    }

    public final captureHierarchy IAuthTabCallback() {
        if (this.onWarmupCompleted == null) {
            synchronized (this.onExtraCallback) {
                if (this.onWarmupCompleted == null) {
                    this.onWarmupCompleted = onExtraCallbackWithResult();
                }
            }
        }
        return this.onWarmupCompleted;
    }

    protected void onWarmupCompleted() {
        int i = 2 % 2;
        if (!this.IAuthTabCallback) {
            int i2 = onTransact + 109;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback = true;
        }
        int i4 = onTransact + 7;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i4 = asInterface + 117;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return onwarmupcompletedOnNavigationEvent;
        }
        throw null;
    }
}
