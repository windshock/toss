package viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen;

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
import o.getA;
import o.nativeRegisterWithPerfetto;
import o.r8lambdap2AUa7LEnrxhmLLPyD8tYwKakeE;
import o.runAnimator;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_CardIssueIdCardNotHaveDialogFragment extends r8lambdap2AUa7LEnrxhmLLPyD8tYwKakeE implements captureEndValues {
    private volatile captureHierarchy IAuthTabCallback;
    private ContextWrapper onExtraCallback;
    private boolean onNavigationEvent;
    private final Object onExtraCallbackWithResult = new Object();
    private boolean asBinder = false;

    public void onAttach(Context context) {
        super/*androidx.fragment.app.DialogFragment*/.onAttach(context);
        onExtraCallbackWithResult();
        onWarmupCompleted();
    }

    public void onAttach(Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallback;
        runAnimator.IAuthTabCallback(contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onExtraCallbackWithResult();
        onWarmupCompleted();
    }

    private void onExtraCallbackWithResult() {
        if (this.onExtraCallback == null) {
            this.onExtraCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onNavigationEvent = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public Context getContext() {
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.onNavigationEvent) {
            return null;
        }
        onExtraCallbackWithResult();
        return this.onExtraCallback;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.DialogFragment*/.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
    }

    public final Object generatedComponent() {
        return onExtraCallback().generatedComponent();
    }

    protected captureHierarchy onNavigationEvent() {
        return new captureHierarchy(this);
    }

    public final captureHierarchy onExtraCallback() {
        if (this.IAuthTabCallback == null) {
            synchronized (this.onExtraCallbackWithResult) {
                if (this.IAuthTabCallback == null) {
                    this.IAuthTabCallback = onNavigationEvent();
                }
            }
        }
        return this.IAuthTabCallback;
    }

    protected void onWarmupCompleted() {
        if (this.asBinder) {
            return;
        }
        this.asBinder = true;
        ((getA) generatedComponent()).onExtraCallback((CardIssueIdCardNotHaveDialogFragment) animate.onExtraCallbackWithResult(this));
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        return PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
    }
}
