package viva.republica.toss.verify;

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

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class Hilt_SelectVerificationMethodFragment extends BaseFragment implements captureEndValues {
    private final Object IAuthTabCallback;
    private boolean onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private ContextWrapper onNavigationEvent;
    private volatile captureHierarchy onWarmupCompleted;

    Hilt_SelectVerificationMethodFragment() {
        this.IAuthTabCallback = new Object();
        this.onExtraCallbackWithResult = false;
    }

    Hilt_SelectVerificationMethodFragment(int i) {
        super(i);
        this.IAuthTabCallback = new Object();
        this.onExtraCallbackWithResult = false;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        onExtraCallback();
        onNavigationEvent();
    }

    public void onAttach(Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onNavigationEvent;
        runAnimator.IAuthTabCallback(contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallback();
        onNavigationEvent();
    }

    private void onExtraCallback() {
        if (this.onNavigationEvent == null) {
            this.onNavigationEvent = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onExtraCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public Context getContext() {
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.onExtraCallback) {
            return null;
        }
        onExtraCallback();
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
        if (this.onWarmupCompleted == null) {
            synchronized (this.IAuthTabCallback) {
                if (this.onWarmupCompleted == null) {
                    this.onWarmupCompleted = IAuthTabCallback();
                }
            }
        }
        return this.onWarmupCompleted;
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
