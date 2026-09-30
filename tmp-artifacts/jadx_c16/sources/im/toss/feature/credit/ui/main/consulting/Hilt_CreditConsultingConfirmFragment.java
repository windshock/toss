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
import o.mainThreadPriority;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_CreditConsultingConfirmFragment extends BaseFragment implements captureEndValues {
    private static int asBinder = 1;
    private static int asInterface;
    private ContextWrapper IAuthTabCallback;
    private boolean onExtraCallback;
    private volatile captureHierarchy onExtraCallbackWithResult;
    private final Object onNavigationEvent;
    private boolean onWarmupCompleted;

    Hilt_CreditConsultingConfirmFragment() {
        this.onNavigationEvent = new Object();
        this.onWarmupCompleted = false;
    }

    Hilt_CreditConsultingConfirmFragment(int i) {
        super(i);
        this.onNavigationEvent = new Object();
        this.onWarmupCompleted = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            super.onAttach(context);
            onExtraCallbackWithResult();
            IAuthTabCallbackStub();
            int i3 = 67 / 0;
        } else {
            super.onAttach(context);
            onExtraCallbackWithResult();
            IAuthTabCallbackStub();
        }
        int i4 = asBinder + 87;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = asBinder + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.IAuthTabCallback;
        if (contextWrapper != null) {
            int i4 = asInterface + 87;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            z = captureHierarchy.onWarmupCompleted(contextWrapper) == activity;
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallbackWithResult();
        IAuthTabCallbackStub();
    }

    private void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        if (this.IAuthTabCallback == null) {
            int i5 = i3 + 3;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            this.IAuthTabCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onExtraCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r4.onExtraCallback == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r4.onExtraCallback == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Context getContext() {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            if (super/*androidx.fragment.app.Fragment*/.getContext() == null) {
                int i3 = asInterface + 71;
                asBinder = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 33 / 0;
                }
            }
            onExtraCallbackWithResult();
            return this.IAuthTabCallback;
        }
        super/*androidx.fragment.app.Fragment*/.getContext();
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = asInterface + 105;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return layoutInflaterCloneInContext;
        }
        throw null;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = IAuthTabCallbackDefault().generatedComponent();
        int i4 = asInterface + 21;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return objGeneratedComponent;
    }

    protected captureHierarchy asInterface() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = asInterface + 1;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return capturehierarchy;
        }
        throw null;
    }

    public final captureHierarchy IAuthTabCallbackDefault() {
        if (this.onExtraCallbackWithResult == null) {
            synchronized (this.onNavigationEvent) {
                if (this.onExtraCallbackWithResult == null) {
                    this.onExtraCallbackWithResult = asInterface();
                }
            }
        }
        return this.onExtraCallbackWithResult;
    }

    protected void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (this.onWarmupCompleted) {
            return;
        }
        this.onWarmupCompleted = true;
        ((mainThreadPriority) generatedComponent()).onWarmupCompleted((CreditConsultingConfirmFragment) animate.onExtraCallbackWithResult(this));
        int i4 = asInterface + 45;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i3 = asBinder + 65;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return onwarmupcompletedOnNavigationEvent;
    }
}
