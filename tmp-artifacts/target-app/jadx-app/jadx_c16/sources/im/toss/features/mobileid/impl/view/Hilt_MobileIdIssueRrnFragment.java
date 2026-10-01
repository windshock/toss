package im.toss.features.mobileid.impl.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import im.toss.base.BaseFragment;
import o.JSONPathMinSegment;
import o.PathMotion;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_MobileIdIssueRrnFragment extends BaseFragment implements captureEndValues {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private boolean IAuthTabCallback;
    private final Object onExtraCallback;
    private volatile captureHierarchy onExtraCallbackWithResult;
    private ContextWrapper onNavigationEvent;
    private boolean onWarmupCompleted;

    Hilt_MobileIdIssueRrnFragment() {
        this.onExtraCallback = new Object();
        this.onWarmupCompleted = false;
    }

    Hilt_MobileIdIssueRrnFragment(int i) {
        super(i);
        this.onExtraCallback = new Object();
        this.onWarmupCompleted = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            super.onAttach(context);
            IAuthTabCallbackStub();
            onTransact();
        } else {
            super.onAttach(context);
            IAuthTabCallbackStub();
            onTransact();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void onAttach(Activity activity) {
        int i = 2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onNavigationEvent;
        boolean z = true;
        if (contextWrapper != null) {
            int i2 = asBinder + 113;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                int i4 = IAuthTabCallbackStub + 85;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    z = false;
                }
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        IAuthTabCallbackStub();
        onTransact();
        int i5 = IAuthTabCallbackStub + 59;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 49 / 0;
        }
    }

    private void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 81;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (this.onNavigationEvent == null) {
            int i5 = i2 + 3;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                this.onNavigationEvent = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
                this.IAuthTabCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
            } else {
                this.onNavigationEvent = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
                this.IAuthTabCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
                throw null;
            }
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            super/*androidx.fragment.app.Fragment*/.getContext();
            throw null;
        }
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null) {
            int i3 = IAuthTabCallbackStub + 87;
            int i4 = i3 % 128;
            asBinder = i4;
            int i5 = i3 % 2;
            if (!this.IAuthTabCallback) {
                int i6 = i4 + 97;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                return null;
            }
        }
        IAuthTabCallbackStub();
        return this.onNavigationEvent;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = IAuthTabCallbackStub + 11;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return layoutInflaterCloneInContext;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = onWarmupCompleted().generatedComponent();
        int i4 = IAuthTabCallbackStub + 121;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return objGeneratedComponent;
    }

    protected captureHierarchy onExtraCallbackWithResult() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = IAuthTabCallbackStub + 75;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 94 / 0;
        }
        return capturehierarchy;
    }

    public final captureHierarchy onWarmupCompleted() {
        if (this.onExtraCallbackWithResult == null) {
            synchronized (this.onExtraCallback) {
                if (this.onExtraCallbackWithResult == null) {
                    this.onExtraCallbackWithResult = onExtraCallbackWithResult();
                }
            }
        }
        return this.onExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onTransact() {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            int i4 = 88 / 0;
            if (!this.onWarmupCompleted) {
                int i5 = i3 + 47;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                this.onWarmupCompleted = true;
                ((JSONPathMinSegment) generatedComponent()).IAuthTabCallback((MobileIdIssueRrnFragment) animate.onExtraCallbackWithResult(this));
            }
        } else if (!this.onWarmupCompleted) {
        }
        int i7 = asBinder + 113;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i4 = IAuthTabCallbackStub + 121;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedOnNavigationEvent;
    }
}
