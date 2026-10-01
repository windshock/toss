package im.toss.features.launcher;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import im.toss.base.BaseFragment;
import o.OnlineResourceFetcher1;
import o.PathMotion;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_HomeLauncherFragment extends BaseFragment implements captureEndValues {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private ContextWrapper IAuthTabCallback;
    private boolean onExtraCallback;
    private volatile captureHierarchy onExtraCallbackWithResult;
    private final Object onNavigationEvent;
    private boolean onWarmupCompleted;

    Hilt_HomeLauncherFragment() {
        this.onNavigationEvent = new Object();
        this.onExtraCallback = false;
    }

    Hilt_HomeLauncherFragment(int i) {
        super(i);
        this.onNavigationEvent = new Object();
        this.onExtraCallback = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(context);
        onWarmupCompleted();
        onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackDefault + 107;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            super/*androidx.fragment.app.Fragment*/.onAttach(activity);
            ContextWrapper contextWrapper = this.IAuthTabCallback;
            if (contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity) {
                z = true;
            } else {
                int i3 = asBinder;
                int i4 = i3 + 79;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 107;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            }
            runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
            onWarmupCompleted();
            onExtraCallbackWithResult();
            return;
        }
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            int i4 = 16 / 0;
            if (this.IAuthTabCallback != null) {
                return;
            }
        } else if (this.IAuthTabCallback != null) {
            return;
        }
        int i5 = i3 + 119;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            this.IAuthTabCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onWarmupCompleted = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        } else {
            this.IAuthTabCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onWarmupCompleted = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
            throw null;
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() != null || this.onWarmupCompleted) {
            onWarmupCompleted();
            ContextWrapper contextWrapper = this.IAuthTabCallback;
            int i4 = IAuthTabCallbackDefault + 91;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return contextWrapper;
        }
        int i6 = IAuthTabCallbackDefault + 67;
        asBinder = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = asBinder + 115;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return layoutInflaterCloneInContext;
        }
        throw null;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        captureHierarchy capturehierarchyOnNavigationEvent = onNavigationEvent();
        if (i3 == 0) {
            return capturehierarchyOnNavigationEvent.generatedComponent();
        }
        capturehierarchyOnNavigationEvent.generatedComponent();
        throw null;
    }

    protected captureHierarchy IAuthTabCallback() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = asBinder + 73;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return capturehierarchy;
    }

    public final captureHierarchy onNavigationEvent() {
        if (this.onExtraCallbackWithResult == null) {
            synchronized (this.onNavigationEvent) {
                if (this.onExtraCallbackWithResult == null) {
                    this.onExtraCallbackWithResult = IAuthTabCallback();
                }
            }
        }
        return this.onExtraCallbackWithResult;
    }

    protected void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        if (this.onExtraCallback) {
            return;
        }
        int i5 = i3 + 103;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        this.onExtraCallback = true;
        ((OnlineResourceFetcher1) generatedComponent()).onWarmupCompleted((HomeLauncherFragment) animate.onExtraCallbackWithResult(this));
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i4 = asBinder + 115;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedOnNavigationEvent;
    }
}
