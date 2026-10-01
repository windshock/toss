package im.toss.features.benefit.ui;

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
import o.checkPermission;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_KoreaBenefitTabFragment extends BaseFragment implements captureEndValues {
    private static int asInterface = 0;
    private static int onTransact = 1;
    private ContextWrapper IAuthTabCallback;
    private final Object onExtraCallback;
    private volatile captureHierarchy onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private boolean onWarmupCompleted;

    Hilt_KoreaBenefitTabFragment() {
        this.onExtraCallback = new Object();
        this.onNavigationEvent = false;
    }

    Hilt_KoreaBenefitTabFragment(int i) {
        super(i);
        this.onExtraCallback = new Object();
        this.onNavigationEvent = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(context);
        onExtraCallbackWithResult();
        IAuthTabCallback();
        int i4 = onTransact + 27;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = asInterface + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.IAuthTabCallback;
        if (contextWrapper != null) {
            int i4 = asInterface + 121;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                captureHierarchy.onWarmupCompleted(contextWrapper);
                throw null;
            }
            z = captureHierarchy.onWarmupCompleted(contextWrapper) == activity;
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallbackWithResult();
        IAuthTabCallback();
    }

    private void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (this.IAuthTabCallback == null) {
            this.IAuthTabCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onWarmupCompleted = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
            int i4 = asInterface + 85;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null) {
            int i4 = onTransact + 113;
            int i5 = i4 % 128;
            asInterface = i5;
            int i6 = i4 % 2;
            if (!this.onWarmupCompleted) {
                int i7 = i5 + 89;
                onTransact = i7 % 128;
                Object obj = null;
                if (i7 % 2 != 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
        }
        onExtraCallbackWithResult();
        return this.IAuthTabCallback;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = asInterface + 123;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return layoutInflaterCloneInContext;
        }
        throw null;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = onExtraCallback().generatedComponent();
        int i4 = onTransact + 59;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return objGeneratedComponent;
    }

    protected captureHierarchy onWarmupCompleted() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = onTransact + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return capturehierarchy;
    }

    public final captureHierarchy onExtraCallback() {
        if (this.onExtraCallbackWithResult == null) {
            synchronized (this.onExtraCallback) {
                if (this.onExtraCallbackWithResult == null) {
                    this.onExtraCallbackWithResult = onWarmupCompleted();
                }
            }
        }
        return this.onExtraCallbackWithResult;
    }

    protected void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 101;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            if (this.onNavigationEvent) {
                return;
            }
            int i4 = i2 + 35;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            this.onNavigationEvent = true;
            ((checkPermission) generatedComponent()).onWarmupCompleted((KoreaBenefitTabFragment) animate.onExtraCallbackWithResult(this));
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory();
        if (i3 != 0) {
            return PathMotion.onNavigationEvent(this, defaultViewModelProviderFactory);
        }
        PathMotion.onNavigationEvent(this, defaultViewModelProviderFactory);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
