package viva.republica.toss.guest.certify.guardian;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import o.PathMotion;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;
import o.sHeight;
import viva.republica.toss.guest.certify.fragment.GuestBaseFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_GuardianPendingCertifyFragment extends GuestBaseFragment implements captureEndValues {
    private ContextWrapper IAuthTabCallback;
    private volatile captureHierarchy onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private final Object onWarmupCompleted;

    Hilt_GuardianPendingCertifyFragment() {
        this.onWarmupCompleted = new Object();
        this.onNavigationEvent = false;
    }

    Hilt_GuardianPendingCertifyFragment(int i) {
        super(i);
        this.onWarmupCompleted = new Object();
        this.onNavigationEvent = false;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        onNavigationEvent();
        IAuthTabCallbackDefault();
    }

    public void onAttach(Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.IAuthTabCallback;
        runAnimator.IAuthTabCallback(contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onNavigationEvent();
        IAuthTabCallbackDefault();
    }

    private void onNavigationEvent() {
        if (this.IAuthTabCallback == null) {
            this.IAuthTabCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onExtraCallbackWithResult = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public Context getContext() {
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.onExtraCallbackWithResult) {
            return null;
        }
        onNavigationEvent();
        return this.IAuthTabCallback;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
    }

    public final Object generatedComponent() {
        return IAuthTabCallback().generatedComponent();
    }

    protected captureHierarchy onExtraCallbackWithResult() {
        return new captureHierarchy(this);
    }

    public final captureHierarchy IAuthTabCallback() {
        if (this.onExtraCallback == null) {
            synchronized (this.onWarmupCompleted) {
                if (this.onExtraCallback == null) {
                    this.onExtraCallback = onExtraCallbackWithResult();
                }
            }
        }
        return this.onExtraCallback;
    }

    protected void IAuthTabCallbackDefault() {
        if (this.onNavigationEvent) {
            return;
        }
        this.onNavigationEvent = true;
        ((sHeight) generatedComponent()).onWarmupCompleted((GuardianPendingCertifyFragment) animate.onExtraCallbackWithResult(this));
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        return PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
    }
}
