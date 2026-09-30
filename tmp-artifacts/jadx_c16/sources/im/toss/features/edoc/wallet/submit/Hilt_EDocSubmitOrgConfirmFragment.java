package im.toss.features.edoc.wallet.submit;

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
import o.getDownloadDir;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_EDocSubmitOrgConfirmFragment extends BaseFragment implements captureEndValues {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub;
    private volatile captureHierarchy IAuthTabCallback;
    private final Object onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private ContextWrapper onNavigationEvent;
    private boolean onWarmupCompleted;

    Hilt_EDocSubmitOrgConfirmFragment() {
        this.onExtraCallback = new Object();
        this.onExtraCallbackWithResult = false;
    }

    Hilt_EDocSubmitOrgConfirmFragment(int i) {
        super(i);
        this.onExtraCallback = new Object();
        this.onExtraCallbackWithResult = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            super.onAttach(context);
            onNavigationEvent();
            onWarmupCompleted();
            int i3 = 44 / 0;
        } else {
            super.onAttach(context);
            onNavigationEvent();
            onWarmupCompleted();
        }
        int i4 = IAuthTabCallbackDefault + 125;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onNavigationEvent;
        if (contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity) {
            int i4 = IAuthTabCallbackDefault + 65;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            int i6 = IAuthTabCallbackStub + 9;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onNavigationEvent();
        onWarmupCompleted();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.onNavigationEvent == null) {
            this.onNavigationEvent = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onWarmupCompleted = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
        int i3 = IAuthTabCallbackDefault + 95;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (super/*androidx.fragment.app.Fragment*/.getContext() != null || this.onWarmupCompleted) {
                onNavigationEvent();
                return this.onNavigationEvent;
            }
            int i3 = IAuthTabCallbackStub + 29;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        super/*androidx.fragment.app.Fragment*/.getContext();
        obj.hashCode();
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
            return layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater2 = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        layoutInflaterOnGetLayoutInflater2.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater2, this));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback().generatedComponent();
            throw null;
        }
        Object objGeneratedComponent = IAuthTabCallback().generatedComponent();
        int i3 = IAuthTabCallbackStub + 13;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return objGeneratedComponent;
    }

    protected captureHierarchy onExtraCallback() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = IAuthTabCallbackDefault + 103;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return capturehierarchy;
        }
        throw null;
    }

    public final captureHierarchy IAuthTabCallback() {
        if (this.IAuthTabCallback == null) {
            synchronized (this.onExtraCallback) {
                if (this.IAuthTabCallback == null) {
                    this.IAuthTabCallback = onExtraCallback();
                }
            }
        }
        return this.IAuthTabCallback;
    }

    protected void onWarmupCompleted() {
        getDownloadDir getdownloaddir;
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        if (!this.onExtraCallbackWithResult) {
            int i2 = IAuthTabCallbackDefault + 77;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                this.onExtraCallbackWithResult = false;
                getdownloaddir = (getDownloadDir) generatedComponent();
                objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
            } else {
                this.onExtraCallbackWithResult = true;
                getdownloaddir = (getDownloadDir) generatedComponent();
                objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
            }
            getdownloaddir.onExtraCallbackWithResult((EDocSubmitOrgConfirmFragment) objOnExtraCallbackWithResult);
        }
        int i3 = IAuthTabCallbackDefault + 17;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i4 = IAuthTabCallbackStub + 85;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return onwarmupcompletedOnNavigationEvent;
        }
        throw null;
    }
}
