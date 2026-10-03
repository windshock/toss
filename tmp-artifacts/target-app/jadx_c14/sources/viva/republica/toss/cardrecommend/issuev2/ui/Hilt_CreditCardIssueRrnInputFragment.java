package viva.republica.toss.cardrecommend.issuev2.ui;

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
import o.getCommitmentTypeQualifier;
import o.getEncryptedData;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_CreditCardIssueRrnInputFragment<L extends getEncryptedData> extends CardIssueBaseFragment<L> implements captureEndValues {
    private boolean IAuthTabCallback;
    private boolean onExtraCallback;
    private final Object onExtraCallbackWithResult;
    private volatile captureHierarchy onNavigationEvent;
    private ContextWrapper onWarmupCompleted;

    Hilt_CreditCardIssueRrnInputFragment() {
        this.onExtraCallbackWithResult = new Object();
        this.IAuthTabCallback = false;
    }

    Hilt_CreditCardIssueRrnInputFragment(int i) {
        super(i);
        this.onExtraCallbackWithResult = new Object();
        this.IAuthTabCallback = false;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        onExtraCallbackWithResult();
        IAuthTabCallbackDefault();
    }

    public void onAttach(Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onWarmupCompleted;
        runAnimator.IAuthTabCallback(contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallbackWithResult();
        IAuthTabCallbackDefault();
    }

    private void onExtraCallbackWithResult() {
        if (this.onWarmupCompleted == null) {
            this.onWarmupCompleted = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onExtraCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public Context getContext() {
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.onExtraCallback) {
            return null;
        }
        onExtraCallbackWithResult();
        return this.onWarmupCompleted;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
    }

    public final Object generatedComponent() {
        return onNavigationEvent().generatedComponent();
    }

    protected captureHierarchy IAuthTabCallback() {
        return new captureHierarchy(this);
    }

    public final captureHierarchy onNavigationEvent() {
        if (this.onNavigationEvent == null) {
            synchronized (this.onExtraCallbackWithResult) {
                if (this.onNavigationEvent == null) {
                    this.onNavigationEvent = IAuthTabCallback();
                }
            }
        }
        return this.onNavigationEvent;
    }

    protected void IAuthTabCallbackDefault() {
        if (this.IAuthTabCallback) {
            return;
        }
        this.IAuthTabCallback = true;
        ((getCommitmentTypeQualifier) generatedComponent()).onExtraCallback((CreditCardIssueRrnInputFragment) animate.onExtraCallbackWithResult(this));
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        return PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
    }
}
