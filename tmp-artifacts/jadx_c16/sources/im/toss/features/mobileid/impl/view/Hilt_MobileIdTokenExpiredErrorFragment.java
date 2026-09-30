package im.toss.features.mobileid.impl.view;

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
import o.endObject;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_MobileIdTokenExpiredErrorFragment extends BaseFragment implements captureEndValues {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder;
    private volatile captureHierarchy IAuthTabCallback;
    private ContextWrapper onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final Object onNavigationEvent;
    private boolean onWarmupCompleted;

    Hilt_MobileIdTokenExpiredErrorFragment() {
        this.onNavigationEvent = new Object();
        this.onWarmupCompleted = false;
    }

    Hilt_MobileIdTokenExpiredErrorFragment(int i) {
        super(i);
        this.onNavigationEvent = new Object();
        this.onWarmupCompleted = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 33;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(context);
        onNavigationEvent();
        onWarmupCompleted();
        int i4 = IAuthTabCallbackDefault + 29;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            super/*androidx.fragment.app.Fragment*/.onAttach(activity);
            ContextWrapper contextWrapper = this.onExtraCallback;
            if (contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity) {
                z = true;
            } else {
                int i3 = IAuthTabCallbackDefault;
                int i4 = i3 + 93;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 115;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            }
            runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
            onNavigationEvent();
            onWarmupCompleted();
            return;
        }
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        throw null;
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 71;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            if (this.onExtraCallback == null) {
                int i4 = i2 + 63;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                this.onExtraCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
                this.onExtraCallbackWithResult = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
                int i6 = IAuthTabCallbackDefault + 95;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r5.onExtraCallbackWithResult != true) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r2 = r2 + 113;
        im.toss.features.mobileid.impl.view.Hilt_MobileIdTokenExpiredErrorFragment.asBinder = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r5.onExtraCallbackWithResult != true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Context getContext() {
        int i = 2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null) {
            int i2 = asBinder + 91;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            if (i2 % 2 == 0) {
                int i4 = 35 / 0;
            }
        }
        onNavigationEvent();
        return this.onExtraCallback;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = asBinder + 81;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return layoutInflaterCloneInContext;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        captureHierarchy capturehierarchyOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (i3 == 0) {
            return capturehierarchyOnExtraCallbackWithResult.generatedComponent();
        }
        capturehierarchyOnExtraCallbackWithResult.generatedComponent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected captureHierarchy IAuthTabCallback() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = asBinder + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return capturehierarchy;
    }

    public final captureHierarchy onExtraCallbackWithResult() {
        if (this.IAuthTabCallback == null) {
            synchronized (this.onNavigationEvent) {
                if (this.IAuthTabCallback == null) {
                    this.IAuthTabCallback = IAuthTabCallback();
                }
            }
        }
        return this.IAuthTabCallback;
    }

    protected void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (!this.onWarmupCompleted) {
            this.onWarmupCompleted = true;
            ((endObject) generatedComponent()).onWarmupCompleted((MobileIdTokenExpiredErrorFragment) animate.onExtraCallbackWithResult(this));
            int i4 = asBinder + 11;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i4 = asBinder + 79;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return onwarmupcompletedOnNavigationEvent;
        }
        throw null;
    }
}
