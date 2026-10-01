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
import o.nativeRegisterWithPerfetto;
import o.readLongValue;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_MobileIdIssueNoIcNationalFragment extends BaseFragment implements captureEndValues {
    private static int asBinder = 1;
    private static int asInterface;
    private ContextWrapper IAuthTabCallback;
    private boolean onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final Object onNavigationEvent;
    private volatile captureHierarchy onWarmupCompleted;

    Hilt_MobileIdIssueNoIcNationalFragment() {
        this.onNavigationEvent = new Object();
        this.onExtraCallback = false;
    }

    Hilt_MobileIdIssueNoIcNationalFragment(int i) {
        super(i);
        this.onNavigationEvent = new Object();
        this.onExtraCallback = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(context);
        onExtraCallbackWithResult();
        onWarmupCompleted();
        int i4 = asInterface + 85;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = asBinder + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.IAuthTabCallback;
        if (contextWrapper != null) {
            int i4 = asInterface + 95;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                captureHierarchy.onWarmupCompleted(contextWrapper);
                throw null;
            }
            if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                int i5 = asInterface + 49;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                z = false;
            } else {
                z = true;
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallbackWithResult();
        onWarmupCompleted();
    }

    private void onExtraCallbackWithResult() {
        int i = 2 % 2;
        if (this.IAuthTabCallback == null) {
            int i2 = asInterface + 99;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                this.IAuthTabCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
                this.onExtraCallbackWithResult = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
                throw null;
            }
            this.IAuthTabCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onExtraCallbackWithResult = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
        int i3 = asInterface + 41;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 / 0;
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() != null || this.onExtraCallbackWithResult) {
            onExtraCallbackWithResult();
            return this.IAuthTabCallback;
        }
        int i4 = asBinder + 5;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = asInterface + 55;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return layoutInflaterCloneInContext;
    }

    public final Object generatedComponent() {
        Object objGeneratedComponent;
        int i = 2 % 2;
        int i2 = asBinder + 99;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            objGeneratedComponent = onNavigationEvent().generatedComponent();
            int i3 = 28 / 0;
        } else {
            objGeneratedComponent = onNavigationEvent().generatedComponent();
        }
        int i4 = asInterface + 87;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return objGeneratedComponent;
    }

    protected captureHierarchy IAuthTabCallback() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = asBinder + 117;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return capturehierarchy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final captureHierarchy onNavigationEvent() {
        if (this.onWarmupCompleted == null) {
            synchronized (this.onNavigationEvent) {
                if (this.onWarmupCompleted == null) {
                    this.onWarmupCompleted = IAuthTabCallback();
                }
            }
        }
        return this.onWarmupCompleted;
    }

    protected void onWarmupCompleted() {
        readLongValue readlongvalue;
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 3;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (this.onExtraCallback) {
            return;
        }
        int i5 = i2 + 87;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            this.onExtraCallback = true;
            readlongvalue = (readLongValue) generatedComponent();
            objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
        } else {
            this.onExtraCallback = true;
            readlongvalue = (readLongValue) generatedComponent();
            objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
        }
        readlongvalue.onExtraCallback((MobileIdIssueNoIcNationalFragment) objOnExtraCallbackWithResult);
        int i6 = asBinder + 73;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        asBinder = i2 % 128;
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
