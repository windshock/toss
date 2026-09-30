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
abstract class Hilt_VerifyForeignerCertIntroFragment extends BaseFragment implements captureEndValues {
    private boolean IAuthTabCallback;
    private volatile captureHierarchy onExtraCallback;
    private ContextWrapper onExtraCallbackWithResult;
    private final Object onNavigationEvent;
    private boolean onWarmupCompleted;

    Hilt_VerifyForeignerCertIntroFragment() {
        this.onNavigationEvent = new Object();
        this.IAuthTabCallback = false;
    }

    Hilt_VerifyForeignerCertIntroFragment(int i) {
        super(i);
        this.onNavigationEvent = new Object();
        this.IAuthTabCallback = false;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        onExtraCallback();
        IAuthTabCallback();
    }

    public void onAttach(Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallbackWithResult;
        runAnimator.IAuthTabCallback(contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallback();
        IAuthTabCallback();
    }

    private void onExtraCallback() {
        if (this.onExtraCallbackWithResult == null) {
            this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onWarmupCompleted = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public Context getContext() {
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.onWarmupCompleted) {
            return null;
        }
        onExtraCallback();
        return this.onExtraCallbackWithResult;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
    }

    public final Object generatedComponent() {
        return onNavigationEvent().generatedComponent();
    }

    protected captureHierarchy onWarmupCompleted() {
        return new captureHierarchy(this);
    }

    public final captureHierarchy onNavigationEvent() {
        if (this.onExtraCallback == null) {
            synchronized (this.onNavigationEvent) {
                if (this.onExtraCallback == null) {
                    this.onExtraCallback = onWarmupCompleted();
                }
            }
        }
        return this.onExtraCallback;
    }

    protected void IAuthTabCallback() {
        if (this.IAuthTabCallback) {
            return;
        }
        this.IAuthTabCallback = true;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        return PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
    }
}
