package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class addPackage extends Fragment implements captureEndValues {
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    private boolean IAuthTabCallback;
    private volatile captureHierarchy onExtraCallback;
    private final Object onExtraCallbackWithResult;
    private ContextWrapper onNavigationEvent;
    private boolean onWarmupCompleted;

    addPackage() {
        this.onExtraCallbackWithResult = new Object();
        this.IAuthTabCallback = false;
    }

    addPackage(int i) {
        super(i);
        this.onExtraCallbackWithResult = new Object();
        this.IAuthTabCallback = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(context);
        IAuthTabCallback();
        onExtraCallbackWithResult();
        int i4 = asInterface + 115;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            super.onAttach(activity);
            ContextWrapper contextWrapper = this.onNavigationEvent;
            if (contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity) {
                z = true;
            } else {
                int i3 = asInterface + 43;
                int i4 = i3 % 128;
                IAuthTabCallbackStub = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 69;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            }
            runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
            IAuthTabCallback();
            onExtraCallbackWithResult();
            return;
        }
        super.onAttach(activity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (this.onNavigationEvent == null) {
            this.onNavigationEvent = captureHierarchy.onWarmupCompleted(super.getContext(), this);
            this.onWarmupCompleted = nativeRegisterWithPerfetto.onWarmupCompleted(super.getContext());
        }
        int i4 = asInterface + 121;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            if (super.getContext() != null || this.onWarmupCompleted) {
                IAuthTabCallback();
                ContextWrapper contextWrapper = this.onNavigationEvent;
                int i3 = IAuthTabCallbackStub + 103;
                asInterface = i3 % 128;
                if (i3 % 2 == 0) {
                    return contextWrapper;
                }
                throw null;
            }
            int i4 = IAuthTabCallbackStub + 3;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        super.getContext();
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterCloneInContext;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
            layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
            int i3 = 57 / 0;
        } else {
            LayoutInflater layoutInflaterOnGetLayoutInflater2 = super.onGetLayoutInflater(bundle);
            layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater2.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater2, this));
        }
        int i4 = asInterface + 21;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return layoutInflaterCloneInContext;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = onNavigationEvent().generatedComponent();
        int i4 = asInterface + 95;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return objGeneratedComponent;
    }

    protected captureHierarchy onWarmupCompleted() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = IAuthTabCallbackStub + 37;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 71 / 0;
        }
        return capturehierarchy;
    }

    public final captureHierarchy onNavigationEvent() {
        if (this.onExtraCallback == null) {
            synchronized (this.onExtraCallbackWithResult) {
                if (this.onExtraCallback == null) {
                    this.onExtraCallback = onWarmupCompleted();
                }
            }
        }
        return this.onExtraCallback;
    }

    protected void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (!this.IAuthTabCallback) {
            this.IAuthTabCallback = true;
        }
        int i3 = asInterface + 79;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super.getDefaultViewModelProviderFactory());
        int i4 = asInterface + 99;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedOnNavigationEvent;
    }
}
