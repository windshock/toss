package viva.republica.toss.cardrecommend.issuev2.ui.select;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import o.PathMotion;
import o.captureEndValues;
import o.captureHierarchy;
import o.getEncryptedData;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_CardIssueSelectOptionStepFragment<L extends getEncryptedData> extends CardIssueBaseFragment<L> implements captureEndValues {
    private final Object IAuthTabCallback;
    private boolean onExtraCallback;
    private ContextWrapper onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private volatile captureHierarchy onWarmupCompleted;

    Hilt_CardIssueSelectOptionStepFragment() {
        this.IAuthTabCallback = new Object();
        this.onExtraCallback = false;
    }

    Hilt_CardIssueSelectOptionStepFragment(int i) {
        super(i);
        this.IAuthTabCallback = new Object();
        this.onExtraCallback = false;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        onExtraCallback();
        onWarmupCompleted();
    }

    public void onAttach(Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallbackWithResult;
        runAnimator.IAuthTabCallback(contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallback();
        onWarmupCompleted();
    }

    private void onExtraCallback() {
        if (this.onExtraCallbackWithResult == null) {
            this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onNavigationEvent = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public Context getContext() {
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.onNavigationEvent) {
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
        return onExtraCallbackWithResult().generatedComponent();
    }

    protected captureHierarchy onNavigationEvent() {
        return new captureHierarchy(this);
    }

    public final captureHierarchy onExtraCallbackWithResult() {
        if (this.onWarmupCompleted == null) {
            synchronized (this.IAuthTabCallback) {
                if (this.onWarmupCompleted == null) {
                    this.onWarmupCompleted = onNavigationEvent();
                }
            }
        }
        return this.onWarmupCompleted;
    }

    protected void onWarmupCompleted() {
        if (this.onExtraCallback) {
            return;
        }
        this.onExtraCallback = true;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        return PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
    }
}
