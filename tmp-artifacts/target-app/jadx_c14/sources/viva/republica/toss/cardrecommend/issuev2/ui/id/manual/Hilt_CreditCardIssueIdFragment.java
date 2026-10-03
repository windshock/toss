package viva.republica.toss.cardrecommend.issuev2.ui.id.manual;

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
import o.getEncryptedData;
import o.getIssuerSerial;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_CreditCardIssueIdFragment<L extends getEncryptedData> extends CardIssueBaseFragment<L> implements captureEndValues {
    private ContextWrapper IAuthTabCallback;
    private final Object onExtraCallback;
    private volatile captureHierarchy onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private boolean onWarmupCompleted;

    Hilt_CreditCardIssueIdFragment() {
        this.onExtraCallback = new Object();
        this.onWarmupCompleted = false;
    }

    Hilt_CreditCardIssueIdFragment(int i) {
        super(i);
        this.onExtraCallback = new Object();
        this.onWarmupCompleted = false;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        onExtraCallbackWithResult();
        onWarmupCompleted();
    }

    public void onAttach(Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.IAuthTabCallback;
        runAnimator.IAuthTabCallback(contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallbackWithResult();
        onWarmupCompleted();
    }

    private void onExtraCallbackWithResult() {
        if (this.IAuthTabCallback == null) {
            this.IAuthTabCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onNavigationEvent = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public Context getContext() {
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.onNavigationEvent) {
            return null;
        }
        onExtraCallbackWithResult();
        return this.IAuthTabCallback;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
    }

    public final Object generatedComponent() {
        return onExtraCallback().generatedComponent();
    }

    protected captureHierarchy IAuthTabCallback() {
        return new captureHierarchy(this);
    }

    public final captureHierarchy onExtraCallback() {
        if (this.onExtraCallbackWithResult == null) {
            synchronized (this.onExtraCallback) {
                if (this.onExtraCallbackWithResult == null) {
                    this.onExtraCallbackWithResult = IAuthTabCallback();
                }
            }
        }
        return this.onExtraCallbackWithResult;
    }

    protected void onWarmupCompleted() {
        if (this.onWarmupCompleted) {
            return;
        }
        this.onWarmupCompleted = true;
        ((getIssuerSerial) generatedComponent()).onExtraCallbackWithResult((CreditCardIssueIdFragment) animate.onExtraCallbackWithResult(this));
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        return PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
    }
}
