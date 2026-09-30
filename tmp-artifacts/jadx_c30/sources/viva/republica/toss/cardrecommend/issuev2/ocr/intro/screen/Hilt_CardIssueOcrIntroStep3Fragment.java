package viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen;

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
public abstract class Hilt_CardIssueOcrIntroStep3Fragment extends BaseFragment implements captureEndValues {
    private volatile captureHierarchy IAuthTabCallback;
    private boolean onExtraCallback;
    private ContextWrapper onExtraCallbackWithResult;
    private final Object onNavigationEvent;
    private boolean onWarmupCompleted;

    Hilt_CardIssueOcrIntroStep3Fragment() {
        this.onNavigationEvent = new Object();
        this.onExtraCallback = false;
    }

    Hilt_CardIssueOcrIntroStep3Fragment(int i) {
        super(i);
        this.onNavigationEvent = new Object();
        this.onExtraCallback = false;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        onWarmupCompleted();
        onExtraCallback();
    }

    public void onAttach(Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallbackWithResult;
        runAnimator.IAuthTabCallback(contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onWarmupCompleted();
        onExtraCallback();
    }

    private void onWarmupCompleted() {
        if (this.onExtraCallbackWithResult == null) {
            this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onWarmupCompleted = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public Context getContext() {
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.onWarmupCompleted) {
            return null;
        }
        onWarmupCompleted();
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
        if (this.IAuthTabCallback == null) {
            synchronized (this.onNavigationEvent) {
                if (this.IAuthTabCallback == null) {
                    this.IAuthTabCallback = onNavigationEvent();
                }
            }
        }
        return this.IAuthTabCallback;
    }

    protected void onExtraCallback() {
        if (this.onExtraCallback) {
            return;
        }
        this.onExtraCallback = true;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        return PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
    }
}
