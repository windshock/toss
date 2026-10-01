package viva.republica.toss.guest.certify.guardian;

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
import viva.republica.toss.guest.certify.fragment.GuestBaseFragment;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class Hilt_GuardianInfoFragment extends GuestBaseFragment implements captureEndValues {
    private volatile captureHierarchy IAuthTabCallback;
    private boolean onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private ContextWrapper onNavigationEvent;
    private final Object onWarmupCompleted;

    Hilt_GuardianInfoFragment() {
        this.onWarmupCompleted = new Object();
        this.onExtraCallbackWithResult = false;
    }

    Hilt_GuardianInfoFragment(int i) {
        super(i);
        this.onWarmupCompleted = new Object();
        this.onExtraCallbackWithResult = false;
    }

    public void onAttach(Context context) {
        super/*im.toss.base.BaseFragment*/.onAttach(context);
        IAuthTabCallback();
        onNavigationEvent();
    }

    public void onAttach(Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onNavigationEvent;
        runAnimator.IAuthTabCallback(contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        IAuthTabCallback();
        onNavigationEvent();
    }

    private void IAuthTabCallback() {
        if (this.onNavigationEvent == null) {
            this.onNavigationEvent = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onExtraCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public Context getContext() {
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.onExtraCallback) {
            return null;
        }
        IAuthTabCallback();
        return this.onNavigationEvent;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
    }

    public final Object generatedComponent() {
        return onWarmupCompleted().generatedComponent();
    }

    protected captureHierarchy onExtraCallbackWithResult() {
        return new captureHierarchy(this);
    }

    public final captureHierarchy onWarmupCompleted() {
        if (this.IAuthTabCallback == null) {
            synchronized (this.onWarmupCompleted) {
                if (this.IAuthTabCallback == null) {
                    this.IAuthTabCallback = onExtraCallbackWithResult();
                }
            }
        }
        return this.IAuthTabCallback;
    }

    protected void onNavigationEvent() {
        if (this.onExtraCallbackWithResult) {
            return;
        }
        this.onExtraCallbackWithResult = true;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        return PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
    }
}
