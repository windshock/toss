package viva.republica.toss.cardrecommend.issuev2.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import o.EACObjectIdentifiers;
import o.PathMotion;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.getEncryptedData;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_CardIssueSubmitFragment<L extends getEncryptedData> extends CardIssueBaseFragment<L> implements captureEndValues {
    private final Object IAuthTabCallback;
    private boolean onExtraCallback;
    private volatile captureHierarchy onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private ContextWrapper onWarmupCompleted;

    Hilt_CardIssueSubmitFragment() {
        this.IAuthTabCallback = new Object();
        this.onNavigationEvent = false;
    }

    Hilt_CardIssueSubmitFragment(int i) {
        super(i);
        this.IAuthTabCallback = new Object();
        this.onNavigationEvent = false;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        IAuthTabCallback();
        onExtraCallback();
    }

    public void onAttach(Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onWarmupCompleted;
        runAnimator.IAuthTabCallback(contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        IAuthTabCallback();
        onExtraCallback();
    }

    private void IAuthTabCallback() {
        if (this.onWarmupCompleted == null) {
            this.onWarmupCompleted = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onExtraCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public Context getContext() {
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.onExtraCallback) {
            return null;
        }
        IAuthTabCallback();
        return this.onWarmupCompleted;
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
        if (this.onExtraCallbackWithResult == null) {
            synchronized (this.IAuthTabCallback) {
                if (this.onExtraCallbackWithResult == null) {
                    this.onExtraCallbackWithResult = onWarmupCompleted();
                }
            }
        }
        return this.onExtraCallbackWithResult;
    }

    protected void onExtraCallback() {
        if (this.onNavigationEvent) {
            return;
        }
        this.onNavigationEvent = true;
        ((EACObjectIdentifiers) generatedComponent()).onExtraCallbackWithResult((CardIssueSubmitFragment) animate.onExtraCallbackWithResult(this));
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        return PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
    }
}
