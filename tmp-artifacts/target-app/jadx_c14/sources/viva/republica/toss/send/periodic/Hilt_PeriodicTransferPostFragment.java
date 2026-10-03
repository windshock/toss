package viva.republica.toss.send.periodic;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import im.toss.base.BaseFragment;
import o.ModuleSpec;
import o.PathMotion;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_PeriodicTransferPostFragment extends BaseFragment implements captureEndValues {
    private volatile captureHierarchy IAuthTabCallback;
    private ContextWrapper onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private final Object onWarmupCompleted;

    Hilt_PeriodicTransferPostFragment() {
        this.onWarmupCompleted = new Object();
        this.onNavigationEvent = false;
    }

    Hilt_PeriodicTransferPostFragment(int i) {
        super(i);
        this.onWarmupCompleted = new Object();
        this.onNavigationEvent = false;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        onExtraCallbackWithResult();
        onExtraCallback();
    }

    public void onAttach(Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallback;
        runAnimator.IAuthTabCallback(contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallbackWithResult();
        onExtraCallback();
    }

    private void onExtraCallbackWithResult() {
        if (this.onExtraCallback == null) {
            this.onExtraCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onExtraCallbackWithResult = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public Context getContext() {
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.onExtraCallbackWithResult) {
            return null;
        }
        onExtraCallbackWithResult();
        return this.onExtraCallback;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
    }

    public final Object generatedComponent() {
        return IAuthTabCallback().generatedComponent();
    }

    protected captureHierarchy onWarmupCompleted() {
        return new captureHierarchy(this);
    }

    public final captureHierarchy IAuthTabCallback() {
        if (this.IAuthTabCallback == null) {
            synchronized (this.onWarmupCompleted) {
                if (this.IAuthTabCallback == null) {
                    this.IAuthTabCallback = onWarmupCompleted();
                }
            }
        }
        return this.IAuthTabCallback;
    }

    protected void onExtraCallback() {
        if (this.onNavigationEvent) {
            return;
        }
        this.onNavigationEvent = true;
        ((ModuleSpec) generatedComponent()).onExtraCallbackWithResult((PeriodicTransferPostFragment) animate.onExtraCallbackWithResult(this));
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        return PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
    }
}
