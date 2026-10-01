package im.toss.features.edoc.wallet.issue;

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
import o.detectFileType;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_DocumentWalletIssueInputFragment extends BaseFragment implements captureEndValues {
    private static int asBinder = 1;
    private static int onTransact;
    private final Object IAuthTabCallback;
    private ContextWrapper onExtraCallback;
    private volatile captureHierarchy onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private boolean onWarmupCompleted;

    Hilt_DocumentWalletIssueInputFragment() {
        this.IAuthTabCallback = new Object();
        this.onWarmupCompleted = false;
    }

    Hilt_DocumentWalletIssueInputFragment(int i) {
        super(i);
        this.IAuthTabCallback = new Object();
        this.onWarmupCompleted = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            super.onAttach(context);
            onWarmupCompleted();
            asBinder();
            int i3 = 69 / 0;
            return;
        }
        super.onAttach(context);
        onWarmupCompleted();
        asBinder();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallback;
        if (contextWrapper != null) {
            int i2 = onTransact + 75;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                int i4 = onTransact + 113;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            } else {
                int i6 = onTransact + 25;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onWarmupCompleted();
        asBinder();
        int i8 = asBinder + 79;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
    }

    private void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 25;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (this.onExtraCallback == null) {
            int i5 = i2 + 7;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            this.onExtraCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onNavigationEvent = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
        int i7 = asBinder + 45;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() != null || this.onNavigationEvent) {
            onWarmupCompleted();
            return this.onExtraCallback;
        }
        int i4 = onTransact + 117;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterCloneInContext;
        int i = 2 % 2;
        int i2 = asBinder + 91;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
            layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
            int i3 = 20 / 0;
        } else {
            LayoutInflater layoutInflaterOnGetLayoutInflater2 = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
            layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater2.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater2, this));
        }
        int i4 = asBinder + 1;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return layoutInflaterCloneInContext;
    }

    public final Object generatedComponent() {
        Object objGeneratedComponent;
        int i = 2 % 2;
        int i2 = asBinder + 121;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            objGeneratedComponent = onExtraCallbackWithResult().generatedComponent();
            int i3 = 55 / 0;
        } else {
            objGeneratedComponent = onExtraCallbackWithResult().generatedComponent();
        }
        int i4 = onTransact + 15;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return objGeneratedComponent;
    }

    protected captureHierarchy onNavigationEvent() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = onTransact + 125;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 58 / 0;
        }
        return capturehierarchy;
    }

    public final captureHierarchy onExtraCallbackWithResult() {
        if (this.onExtraCallbackWithResult == null) {
            synchronized (this.IAuthTabCallback) {
                if (this.onExtraCallbackWithResult == null) {
                    this.onExtraCallbackWithResult = onNavigationEvent();
                }
            }
        }
        return this.onExtraCallbackWithResult;
    }

    protected void asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (!this.onWarmupCompleted) {
            this.onWarmupCompleted = true;
            ((detectFileType) generatedComponent()).onExtraCallback((DocumentWalletIssueInputFragment) animate.onExtraCallbackWithResult(this));
        }
        int i4 = onTransact + 75;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i4 = asBinder + 21;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedOnNavigationEvent;
    }
}
