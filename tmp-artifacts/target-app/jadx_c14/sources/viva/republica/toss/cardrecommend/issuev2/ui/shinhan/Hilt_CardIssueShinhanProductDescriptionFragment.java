package viva.republica.toss.cardrecommend.issuev2.ui.shinhan;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import o.ICAOObjectIdentifiers;
import o.PathMotion;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.getEncryptedData;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_CardIssueShinhanProductDescriptionFragment<L extends getEncryptedData> extends CardIssueBaseFragment<L> implements captureEndValues {
    private volatile captureHierarchy IAuthTabCallback;
    private ContextWrapper onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private final Object onWarmupCompleted;

    Hilt_CardIssueShinhanProductDescriptionFragment() {
        this.onWarmupCompleted = new Object();
        this.onNavigationEvent = false;
    }

    Hilt_CardIssueShinhanProductDescriptionFragment(int i) {
        super(i);
        this.onWarmupCompleted = new Object();
        this.onNavigationEvent = false;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        onExtraCallback();
        onNavigationEvent();
    }

    public void onAttach(Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallback;
        runAnimator.IAuthTabCallback(contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallback();
        onNavigationEvent();
    }

    private void onExtraCallback() {
        if (this.onExtraCallback == null) {
            this.onExtraCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onExtraCallbackWithResult = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public Context getContext() {
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.onExtraCallbackWithResult) {
            return null;
        }
        onExtraCallback();
        return this.onExtraCallback;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
    }

    public final Object generatedComponent() {
        return onWarmupCompleted().generatedComponent();
    }

    protected captureHierarchy IAuthTabCallback() {
        return new captureHierarchy(this);
    }

    public final captureHierarchy onWarmupCompleted() {
        if (this.IAuthTabCallback == null) {
            synchronized (this.onWarmupCompleted) {
                if (this.IAuthTabCallback == null) {
                    this.IAuthTabCallback = IAuthTabCallback();
                }
            }
        }
        return this.IAuthTabCallback;
    }

    protected void onNavigationEvent() {
        if (this.onNavigationEvent) {
            return;
        }
        this.onNavigationEvent = true;
        ((ICAOObjectIdentifiers) generatedComponent()).IAuthTabCallback((CardIssueShinhanProductDescriptionFragment) animate.onExtraCallbackWithResult(this));
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        return PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
    }
}
