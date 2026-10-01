package im.toss.feature.credit.ui.main.consulting;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import im.toss.base.BaseFragment;
import o.PathMotion;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_CreditConsultingSelectCategoryFragment extends BaseFragment implements captureEndValues {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private boolean IAuthTabCallback;
    private volatile captureHierarchy onExtraCallback;
    private final Object onExtraCallbackWithResult;
    private ContextWrapper onNavigationEvent;
    private boolean onWarmupCompleted;

    Hilt_CreditConsultingSelectCategoryFragment() {
        this.onExtraCallbackWithResult = new Object();
        this.onWarmupCompleted = false;
    }

    Hilt_CreditConsultingSelectCategoryFragment(int i) {
        super(i);
        this.onExtraCallbackWithResult = new Object();
        this.onWarmupCompleted = false;
    }

    @Override // im.toss.base.BaseFragment
    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            super.onAttach(context);
            onWarmupCompleted();
            asBinder();
            int i3 = asBinder + 73;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 53 / 0;
                return;
            }
            return;
        }
        super.onAttach(context);
        onWarmupCompleted();
        asBinder();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onNavigationEvent;
        if (contextWrapper != null) {
            int i2 = IAuthTabCallbackStub + 11;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                captureHierarchy.onWarmupCompleted(contextWrapper);
                throw null;
            }
            if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                z = false;
            } else {
                int i3 = asBinder + 97;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onWarmupCompleted();
        asBinder();
    }

    private void onWarmupCompleted() {
        int i = 2 % 2;
        if (this.onNavigationEvent == null) {
            int i2 = asBinder + 21;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.IAuthTabCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
            int i4 = asBinder + 7;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (super/*androidx.fragment.app.Fragment*/.getContext() == null) {
                int i3 = IAuthTabCallbackStub;
                int i4 = i3 + 119;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                if (!this.IAuthTabCallback) {
                    int i6 = i3 + 15;
                    asBinder = i6 % 128;
                    if (i6 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
            }
            onWarmupCompleted();
            return this.onNavigationEvent;
        }
        super/*androidx.fragment.app.Fragment*/.getContext();
        obj.hashCode();
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
            int i3 = asBinder + 95;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return layoutInflaterCloneInContext;
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater2 = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        layoutInflaterOnGetLayoutInflater2.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater2, this));
        throw null;
    }

    @Override // o.matchNames
    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = IAuthTabCallbackDefault().generatedComponent();
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        return objGeneratedComponent;
    }

    protected captureHierarchy IAuthTabCallbackStub() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = asBinder + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return capturehierarchy;
    }

    public final captureHierarchy IAuthTabCallbackDefault() {
        if (this.onExtraCallback == null) {
            synchronized (this.onExtraCallbackWithResult) {
                if (this.onExtraCallback == null) {
                    this.onExtraCallback = IAuthTabCallbackStub();
                }
            }
        }
        return this.onExtraCallback;
    }

    protected void asBinder() {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            if (!this.onWarmupCompleted) {
                this.onWarmupCompleted = true;
                int i3 = asBinder + 21;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
            }
            int i5 = IAuthTabCallbackStub + 11;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        throw null;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i3 = IAuthTabCallbackStub + 13;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return onwarmupcompletedOnNavigationEvent;
    }
}
