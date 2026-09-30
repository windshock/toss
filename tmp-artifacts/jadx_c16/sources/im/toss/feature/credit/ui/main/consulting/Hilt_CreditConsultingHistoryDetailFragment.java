package im.toss.feature.credit.ui.main.consulting;

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
import o.tinyStaringFlag;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_CreditConsultingHistoryDetailFragment extends BaseFragment implements captureEndValues {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub;
    private ContextWrapper IAuthTabCallback;
    private boolean onExtraCallback;
    private final Object onExtraCallbackWithResult;
    private volatile captureHierarchy onNavigationEvent;
    private boolean onWarmupCompleted;

    Hilt_CreditConsultingHistoryDetailFragment() {
        this.onExtraCallbackWithResult = new Object();
        this.onWarmupCompleted = false;
    }

    Hilt_CreditConsultingHistoryDetailFragment(int i) {
        super(i);
        this.onExtraCallbackWithResult = new Object();
        this.onWarmupCompleted = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            super.onAttach(context);
            onExtraCallbackWithResult();
            IAuthTabCallbackDefault();
            int i3 = 97 / 0;
            return;
        }
        super.onAttach(context);
        onExtraCallbackWithResult();
        IAuthTabCallbackDefault();
    }

    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            super/*androidx.fragment.app.Fragment*/.onAttach(activity);
            ContextWrapper contextWrapper = this.IAuthTabCallback;
            if (contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity) {
                z = true;
            } else {
                int i3 = IAuthTabCallbackStub + 107;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                z = false;
            }
            runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
            onExtraCallbackWithResult();
            IAuthTabCallbackDefault();
            return;
        }
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void onExtraCallbackWithResult() {
        int i = 2 % 2;
        if (this.IAuthTabCallback == null) {
            this.IAuthTabCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onExtraCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
            int i2 = IAuthTabCallbackStub + 85;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = IAuthTabCallbackDefault + 39;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            if (super/*androidx.fragment.app.Fragment*/.getContext() != null || this.onExtraCallback) {
                onExtraCallbackWithResult();
                return this.IAuthTabCallback;
            }
            int i3 = IAuthTabCallbackDefault + 11;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 76 / 0;
            }
            return null;
        }
        super/*androidx.fragment.app.Fragment*/.getContext();
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = IAuthTabCallbackStub + 43;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return layoutInflaterCloneInContext;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        captureHierarchy capturehierarchyAsInterface = asInterface();
        if (i3 != 0) {
            return capturehierarchyAsInterface.generatedComponent();
        }
        capturehierarchyAsInterface.generatedComponent();
        throw null;
    }

    protected captureHierarchy asBinder() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = IAuthTabCallbackStub + 31;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return capturehierarchy;
    }

    public final captureHierarchy asInterface() {
        if (this.onNavigationEvent == null) {
            synchronized (this.onExtraCallbackWithResult) {
                if (this.onNavigationEvent == null) {
                    this.onNavigationEvent = asBinder();
                }
            }
        }
        return this.onNavigationEvent;
    }

    protected void IAuthTabCallbackDefault() {
        tinyStaringFlag tinystaringflag;
        int i = 2 % 2;
        if (!(!this.onWarmupCompleted)) {
            return;
        }
        int i2 = IAuthTabCallbackStub + 7;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            this.onWarmupCompleted = false;
            tinystaringflag = (tinyStaringFlag) generatedComponent();
        } else {
            this.onWarmupCompleted = true;
            tinystaringflag = (tinyStaringFlag) generatedComponent();
        }
        tinystaringflag.onExtraCallbackWithResult((CreditConsultingHistoryDetailFragment) animate.onExtraCallbackWithResult(this));
        int i3 = IAuthTabCallbackDefault + 83;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return onwarmupcompletedOnNavigationEvent;
    }
}
