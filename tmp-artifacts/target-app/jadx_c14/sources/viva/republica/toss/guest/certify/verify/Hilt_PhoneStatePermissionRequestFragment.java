package viva.republica.toss.guest.certify.verify;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import o.PathMotion;
import o.animate;
import o.animateCenter;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;
import viva.republica.toss.guest.certify.fragment.GuestBaseFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_PhoneStatePermissionRequestFragment extends GuestBaseFragment implements captureEndValues {
    private volatile captureHierarchy IAuthTabCallback;
    private final Object onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private ContextWrapper onNavigationEvent;
    private boolean onWarmupCompleted;

    Hilt_PhoneStatePermissionRequestFragment() {
        this.onExtraCallback = new Object();
        this.onExtraCallbackWithResult = false;
    }

    Hilt_PhoneStatePermissionRequestFragment(int i) {
        super(i);
        this.onExtraCallback = new Object();
        this.onExtraCallbackWithResult = false;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        onNavigationEvent();
        onWarmupCompleted();
    }

    public void onAttach(Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onNavigationEvent;
        runAnimator.IAuthTabCallback(contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onNavigationEvent();
        onWarmupCompleted();
    }

    private void onNavigationEvent() {
        if (this.onNavigationEvent == null) {
            this.onNavigationEvent = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onWarmupCompleted = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public Context getContext() {
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.onWarmupCompleted) {
            return null;
        }
        onNavigationEvent();
        return this.onNavigationEvent;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
    }

    public final Object generatedComponent() {
        return onExtraCallbackWithResult().generatedComponent();
    }

    protected captureHierarchy IAuthTabCallback() {
        return new captureHierarchy(this);
    }

    public final captureHierarchy onExtraCallbackWithResult() {
        if (this.IAuthTabCallback == null) {
            synchronized (this.onExtraCallback) {
                if (this.IAuthTabCallback == null) {
                    this.IAuthTabCallback = IAuthTabCallback();
                }
            }
        }
        return this.IAuthTabCallback;
    }

    protected void onWarmupCompleted() {
        if (this.onExtraCallbackWithResult) {
            return;
        }
        this.onExtraCallbackWithResult = true;
        ((animateCenter) generatedComponent()).onWarmupCompleted((PhoneStatePermissionRequestFragment) animate.onExtraCallbackWithResult(this));
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        return PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
    }
}
