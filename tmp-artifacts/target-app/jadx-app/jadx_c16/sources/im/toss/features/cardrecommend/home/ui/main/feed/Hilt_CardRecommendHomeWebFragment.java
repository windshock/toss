package im.toss.features.cardrecommend.home.ui.main.feed;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import o.PathMotion;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;
import viva.republica.toss.service.LabFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_CardRecommendHomeWebFragment extends LabFragment implements captureEndValues {
    private static int asBinder = 0;
    private static int asInterface = 1;
    private ContextWrapper IAuthTabCallback;
    private volatile captureHierarchy onExtraCallback;
    private boolean onNavigationEvent;
    private final Object onExtraCallbackWithResult = new Object();
    private boolean onWarmupCompleted = false;

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super/*im.toss.base.BaseFragment*/.onAttach(context);
            onExtraCallback();
            onWarmupCompleted();
            int i3 = asInterface + 117;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        super/*im.toss.base.BaseFragment*/.onAttach(context);
        onExtraCallback();
        onWarmupCompleted();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = asInterface + 123;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.IAuthTabCallback;
        if (contextWrapper != null) {
            int i4 = asInterface + 113;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                captureHierarchy.onWarmupCompleted(contextWrapper);
                throw null;
            }
            if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                int i5 = asBinder + 99;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                z = false;
            } else {
                z = true;
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallback();
        onWarmupCompleted();
        int i7 = asBinder + 121;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
    }

    private void onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (this.IAuthTabCallback == null) {
            this.IAuthTabCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onNavigationEvent = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
        int i4 = asBinder + 115;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public Context getContext() {
        int i = 2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() != null || this.onNavigationEvent) {
            onExtraCallback();
            ContextWrapper contextWrapper = this.IAuthTabCallback;
            int i2 = asBinder + 113;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return contextWrapper;
            }
            throw null;
        }
        int i3 = asBinder + 67;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = asInterface + 9;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return layoutInflaterCloneInContext;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback().generatedComponent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objGeneratedComponent = IAuthTabCallback().generatedComponent();
        int i3 = asInterface + 29;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return objGeneratedComponent;
    }

    protected captureHierarchy onExtraCallbackWithResult() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = asBinder + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return capturehierarchy;
    }

    public final captureHierarchy IAuthTabCallback() {
        if (this.onExtraCallback == null) {
            synchronized (this.onExtraCallbackWithResult) {
                if (this.onExtraCallback == null) {
                    this.onExtraCallback = onExtraCallbackWithResult();
                }
            }
        }
        return this.onExtraCallback;
    }

    protected void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (!this.onWarmupCompleted) {
            this.onWarmupCompleted = true;
            int i4 = asBinder + 51;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = asBinder + 45;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i4 = asBinder + 83;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return onwarmupcompletedOnNavigationEvent;
        }
        throw null;
    }
}
