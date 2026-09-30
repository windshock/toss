package im.toss.features.edoc.wallet.pkg;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import im.toss.base.BaseFragment;
import o.FileBridgeExtension21;
import o.PathMotion;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_PackageIssueFragment extends BaseFragment implements captureEndValues {
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    private boolean IAuthTabCallback;
    private final Object onExtraCallback;
    private ContextWrapper onExtraCallbackWithResult;
    private volatile captureHierarchy onNavigationEvent;
    private boolean onWarmupCompleted;

    Hilt_PackageIssueFragment() {
        this.onExtraCallback = new Object();
        this.onWarmupCompleted = false;
    }

    Hilt_PackageIssueFragment(int i) {
        super(i);
        this.onExtraCallback = new Object();
        this.onWarmupCompleted = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(context);
        onExtraCallback();
        onWarmupCompleted();
        int i4 = IAuthTabCallbackDefault + 15;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
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
        int i2 = onTransact + 123;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            super/*androidx.fragment.app.Fragment*/.onAttach(activity);
            contextWrapper = this.onExtraCallbackWithResult;
            int i3 = 68 / 0;
            if (contextWrapper != null) {
                if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                    int i4 = IAuthTabCallbackDefault + 31;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                    z = false;
                } else {
                    z = true;
                }
            }
        } else {
            super/*androidx.fragment.app.Fragment*/.onAttach(activity);
            contextWrapper = this.onExtraCallbackWithResult;
            if (contextWrapper != null) {
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallback();
        onWarmupCompleted();
    }

    private void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 113;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.onExtraCallbackWithResult == null) {
            int i4 = i2 + 7;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.IAuthTabCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
            int i6 = IAuthTabCallbackDefault + 9;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 83;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() != null || this.IAuthTabCallback) {
            onExtraCallback();
            return this.onExtraCallbackWithResult;
        }
        int i4 = onTransact + 65;
        IAuthTabCallbackDefault = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
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
        int i2 = onTransact + 89;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        captureHierarchy capturehierarchyIAuthTabCallback = IAuthTabCallback();
        if (i3 == 0) {
            return capturehierarchyIAuthTabCallback.generatedComponent();
        }
        capturehierarchyIAuthTabCallback.generatedComponent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected captureHierarchy onExtraCallbackWithResult() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = onTransact + 93;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return capturehierarchy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final captureHierarchy IAuthTabCallback() {
        if (this.onNavigationEvent == null) {
            synchronized (this.onExtraCallback) {
                if (this.onNavigationEvent == null) {
                    this.onNavigationEvent = onExtraCallbackWithResult();
                }
            }
        }
        return this.onNavigationEvent;
    }

    protected void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 83;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (this.onWarmupCompleted) {
            return;
        }
        int i5 = i2 + 11;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        this.onWarmupCompleted = true;
        ((FileBridgeExtension21) generatedComponent()).onNavigationEvent((PackageIssueFragment) animate.onExtraCallbackWithResult(this));
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i4 = IAuthTabCallbackDefault + 79;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return onwarmupcompletedOnNavigationEvent;
        }
        throw null;
    }
}
