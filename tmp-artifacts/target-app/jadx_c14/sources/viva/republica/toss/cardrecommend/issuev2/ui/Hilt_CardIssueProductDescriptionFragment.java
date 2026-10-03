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
import o.getEncryptedData;
import o.getOID;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_CardIssueProductDescriptionFragment<L extends getEncryptedData> extends CardIssueBaseFragment<L> implements captureEndValues {
    private boolean IAuthTabCallback;
    private volatile captureHierarchy onExtraCallback;
    private ContextWrapper onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private final Object onWarmupCompleted;

    Hilt_CardIssueProductDescriptionFragment() {
        this.onWarmupCompleted = new Object();
        this.onNavigationEvent = false;
    }

    Hilt_CardIssueProductDescriptionFragment(int i) {
        super(i);
        this.onWarmupCompleted = new Object();
        this.onNavigationEvent = false;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        onExtraCallbackWithResult();
        onNavigationEvent();
    }

    public void onAttach(Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallbackWithResult;
        runAnimator.IAuthTabCallback(contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallbackWithResult();
        onNavigationEvent();
    }

    private void onExtraCallbackWithResult() {
        if (this.onExtraCallbackWithResult == null) {
            this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.IAuthTabCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public Context getContext() {
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.IAuthTabCallback) {
            return null;
        }
        onExtraCallbackWithResult();
        return this.onExtraCallbackWithResult;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
    }

    public final Object generatedComponent() {
        return onWarmupCompleted().generatedComponent();
    }

    protected captureHierarchy onExtraCallback() {
        return new captureHierarchy(this);
    }

    public final captureHierarchy onWarmupCompleted() {
        if (this.onExtraCallback == null) {
            synchronized (this.onWarmupCompleted) {
                if (this.onExtraCallback == null) {
                    this.onExtraCallback = onExtraCallback();
                }
            }
        }
        return this.onExtraCallback;
    }

    protected void onNavigationEvent() {
        if (this.onNavigationEvent) {
            return;
        }
        this.onNavigationEvent = true;
        ((getOID) generatedComponent()).onExtraCallbackWithResult((CardIssueProductDescriptionFragment) animate.onExtraCallbackWithResult(this));
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        return PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
    }
}
