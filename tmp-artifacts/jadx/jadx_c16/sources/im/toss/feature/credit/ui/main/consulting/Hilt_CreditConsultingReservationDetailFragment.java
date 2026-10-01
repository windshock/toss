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
import o.coreThreadPriorityOpt;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_CreditConsultingReservationDetailFragment extends BaseFragment implements captureEndValues {
    private static int IAuthTabCallbackDefault = 1;
    private static int onTransact;
    private volatile captureHierarchy IAuthTabCallback;
    private boolean onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final Object onNavigationEvent;
    private ContextWrapper onWarmupCompleted;

    Hilt_CreditConsultingReservationDetailFragment() {
        this.onNavigationEvent = new Object();
        this.onExtraCallback = false;
    }

    Hilt_CreditConsultingReservationDetailFragment(int i) {
        super(i);
        this.onNavigationEvent = new Object();
        this.onExtraCallback = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(context);
        onExtraCallbackWithResult();
        onTransact();
        int i4 = onTransact + 79;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = onTransact + 87;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onWarmupCompleted;
        if (contextWrapper != null) {
            int i4 = onTransact + 29;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                captureHierarchy.onWarmupCompleted(contextWrapper);
                throw null;
            }
            z = captureHierarchy.onWarmupCompleted(contextWrapper) == activity;
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallbackWithResult();
        onTransact();
        int i5 = IAuthTabCallbackDefault + 113;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    private void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        if (this.onWarmupCompleted == null) {
            int i5 = i3 + 89;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                this.onWarmupCompleted = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
                this.onExtraCallbackWithResult = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
                throw null;
            }
            this.onWarmupCompleted = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onExtraCallbackWithResult = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
        int i6 = onTransact + 115;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.onExtraCallbackWithResult) {
            return null;
        }
        onExtraCallbackWithResult();
        ContextWrapper contextWrapper = this.onWarmupCompleted;
        int i4 = onTransact + 39;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return contextWrapper;
        }
        obj.hashCode();
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = IAuthTabCallbackDefault + 101;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
        return layoutInflaterCloneInContext;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            asBinder().generatedComponent();
            throw null;
        }
        Object objGeneratedComponent = asBinder().generatedComponent();
        int i3 = onTransact + 49;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 67 / 0;
        }
        return objGeneratedComponent;
    }

    protected captureHierarchy IAuthTabCallbackDefault() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = IAuthTabCallbackDefault + 115;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return capturehierarchy;
        }
        throw null;
    }

    public final captureHierarchy asBinder() {
        if (this.IAuthTabCallback == null) {
            synchronized (this.onNavigationEvent) {
                if (this.IAuthTabCallback == null) {
                    this.IAuthTabCallback = IAuthTabCallbackDefault();
                }
            }
        }
        return this.IAuthTabCallback;
    }

    protected void onTransact() {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (!this.onExtraCallback) {
            this.onExtraCallback = true;
            ((coreThreadPriorityOpt) generatedComponent()).onExtraCallback((CreditConsultingReservationDetailFragment) animate.onExtraCallbackWithResult(this));
        }
        int i4 = IAuthTabCallbackDefault + 117;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i4 = IAuthTabCallbackDefault + 47;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedOnNavigationEvent;
    }
}
