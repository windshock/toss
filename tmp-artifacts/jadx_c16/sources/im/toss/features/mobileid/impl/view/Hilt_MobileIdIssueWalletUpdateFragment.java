package im.toss.features.mobileid.impl.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import im.toss.base.BaseFragment;
import o.JSONPathPropertySegment;
import o.PathMotion;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_MobileIdIssueWalletUpdateFragment extends BaseFragment implements captureEndValues {
    private static int asBinder = 1;
    private static int onTransact;
    private ContextWrapper IAuthTabCallback;
    private final Object onExtraCallback;
    private volatile captureHierarchy onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private boolean onWarmupCompleted;

    Hilt_MobileIdIssueWalletUpdateFragment() {
        this.onExtraCallback = new Object();
        this.onWarmupCompleted = false;
    }

    Hilt_MobileIdIssueWalletUpdateFragment(int i) {
        super(i);
        this.onExtraCallback = new Object();
        this.onWarmupCompleted = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(context);
        onExtraCallbackWithResult();
        onWarmupCompleted();
        int i4 = onTransact + 83;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.IAuthTabCallback;
        if (contextWrapper != null) {
            int i2 = onTransact + 99;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                int i4 = onTransact + 113;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            } else {
                z = true;
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallbackWithResult();
        onWarmupCompleted();
        int i6 = asBinder + 39;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
    }

    private void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        if (this.IAuthTabCallback == null) {
            int i5 = i3 + 89;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            this.IAuthTabCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onNavigationEvent = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
        int i7 = onTransact + 37;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null) {
            int i4 = onTransact + 119;
            asBinder = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (!this.onNavigationEvent) {
                return null;
            }
        }
        onExtraCallbackWithResult();
        return this.IAuthTabCallback;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = asBinder + 85;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return layoutInflaterCloneInContext;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = IAuthTabCallback().generatedComponent();
        int i4 = asBinder + 29;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return objGeneratedComponent;
        }
        throw null;
    }

    protected captureHierarchy onNavigationEvent() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = onTransact + 1;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 19 / 0;
        }
        return capturehierarchy;
    }

    public final captureHierarchy IAuthTabCallback() {
        if (this.onExtraCallbackWithResult == null) {
            synchronized (this.onExtraCallback) {
                if (this.onExtraCallbackWithResult == null) {
                    this.onExtraCallbackWithResult = onNavigationEvent();
                }
            }
        }
        return this.onExtraCallbackWithResult;
    }

    protected void onWarmupCompleted() {
        JSONPathPropertySegment jSONPathPropertySegment;
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        if (!this.onWarmupCompleted) {
            int i2 = onTransact + 115;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                this.onWarmupCompleted = false;
                jSONPathPropertySegment = (JSONPathPropertySegment) generatedComponent();
                objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
            } else {
                this.onWarmupCompleted = true;
                jSONPathPropertySegment = (JSONPathPropertySegment) generatedComponent();
                objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
            }
            jSONPathPropertySegment.onWarmupCompleted((MobileIdIssueWalletUpdateFragment) objOnExtraCallbackWithResult);
        }
        int i3 = onTransact + 93;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 99 / 0;
        }
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = asBinder + 85;
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
