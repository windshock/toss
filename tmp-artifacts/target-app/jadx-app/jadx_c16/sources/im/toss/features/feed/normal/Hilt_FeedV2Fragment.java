package im.toss.features.feed.normal;

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
import o.nativeRegisterWithPerfetto;
import o.runAnimator;
import o.unRegisterWorker;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_FeedV2Fragment extends BaseFragment implements captureEndValues {
    private static int asInterface = 0;
    private static int onTransact = 1;
    private final Object IAuthTabCallback;
    private ContextWrapper onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private volatile captureHierarchy onWarmupCompleted;

    Hilt_FeedV2Fragment() {
        this.IAuthTabCallback = new Object();
        this.onExtraCallbackWithResult = false;
    }

    Hilt_FeedV2Fragment(int i) {
        super(i);
        this.IAuthTabCallback = new Object();
        this.onExtraCallbackWithResult = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(context);
        onExtraCallbackWithResult();
        access100();
        int i4 = asInterface + 123;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = onTransact + 35;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            super/*androidx.fragment.app.Fragment*/.onAttach(activity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallback;
        if (contextWrapper != null) {
            int i3 = asInterface + 57;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 25 / 0;
                if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                    int i5 = onTransact + 83;
                    asInterface = i5 % 128;
                    int i6 = i5 % 2;
                    z = false;
                } else {
                    int i7 = onTransact + 117;
                    asInterface = i7 % 128;
                    int i8 = i7 % 2;
                    z = true;
                }
            } else if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallbackWithResult();
        access100();
    }

    private void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        if (this.onExtraCallback == null) {
            int i5 = i3 + 59;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            this.onExtraCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onNavigationEvent = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() != null || this.onNavigationEvent) {
            onExtraCallbackWithResult();
            ContextWrapper contextWrapper = this.onExtraCallback;
            int i2 = asInterface + 5;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return contextWrapper;
        }
        int i4 = asInterface + 5;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
            int i3 = asInterface + 85;
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
        int i2 = asInterface + 21;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = IAuthTabCallbackStubProxy().generatedComponent();
        int i4 = onTransact + 47;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return objGeneratedComponent;
    }

    protected captureHierarchy getInterfaceDescriptor() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = onTransact + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return capturehierarchy;
    }

    public final captureHierarchy IAuthTabCallbackStubProxy() {
        if (this.onWarmupCompleted == null) {
            synchronized (this.IAuthTabCallback) {
                if (this.onWarmupCompleted == null) {
                    this.onWarmupCompleted = getInterfaceDescriptor();
                }
            }
        }
        return this.onWarmupCompleted;
    }

    protected void access100() {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (this.onExtraCallbackWithResult) {
            return;
        }
        this.onExtraCallbackWithResult = true;
        ((unRegisterWorker) generatedComponent()).IAuthTabCallback((FeedV2Fragment) animate.onExtraCallbackWithResult(this));
        int i4 = asInterface + 97;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        return onwarmupcompletedOnNavigationEvent;
    }
}
