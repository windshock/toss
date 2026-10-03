package viva.republica.toss.cardrecommend.issuev2.ui.addressinfo;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import o.ESFAttributes;
import o.PathMotion;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.getEncryptedData;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_CreditCardIssueHomeAddressFragment<L extends getEncryptedData> extends CardIssueBaseFragment<L> implements captureEndValues {
    private boolean IAuthTabCallback;
    private final Object onExtraCallback;
    private volatile captureHierarchy onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private ContextWrapper onWarmupCompleted;

    Hilt_CreditCardIssueHomeAddressFragment() {
        this.onExtraCallback = new Object();
        this.onNavigationEvent = false;
    }

    Hilt_CreditCardIssueHomeAddressFragment(int i) {
        super(i);
        this.onExtraCallback = new Object();
        this.onNavigationEvent = false;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        onWarmupCompleted();
        onExtraCallbackWithResult();
    }

    public void onAttach(Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onWarmupCompleted;
        runAnimator.IAuthTabCallback(contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onWarmupCompleted();
        onExtraCallbackWithResult();
    }

    private void onWarmupCompleted() {
        if (this.onWarmupCompleted == null) {
            this.onWarmupCompleted = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.IAuthTabCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public Context getContext() {
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.IAuthTabCallback) {
            return null;
        }
        onWarmupCompleted();
        return this.onWarmupCompleted;
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

    protected void onExtraCallbackWithResult() {
        if (this.onNavigationEvent) {
            return;
        }
        this.onNavigationEvent = true;
        ((ESFAttributes) generatedComponent()).IAuthTabCallback((CreditCardIssueHomeAddressFragment) animate.onExtraCallbackWithResult(this));
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        return PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
    }
}
