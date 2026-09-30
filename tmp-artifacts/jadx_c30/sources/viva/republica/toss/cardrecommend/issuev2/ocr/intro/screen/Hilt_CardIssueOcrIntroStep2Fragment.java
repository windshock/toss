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
public abstract class Hilt_CardIssueOcrIntroStep2Fragment extends BaseFragment implements captureEndValues {
    private ContextWrapper IAuthTabCallback;
    private boolean onExtraCallback;
    private final Object onExtraCallbackWithResult;
    private volatile captureHierarchy onNavigationEvent;
    private boolean onWarmupCompleted;

    Hilt_CardIssueOcrIntroStep2Fragment() {
        this.onExtraCallbackWithResult = new Object();
        this.onWarmupCompleted = false;
    }

    Hilt_CardIssueOcrIntroStep2Fragment(int i) {
        super(i);
        this.onExtraCallbackWithResult = new Object();
        this.onWarmupCompleted = false;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        onWarmupCompleted();
        onNavigationEvent();
    }

    public void onAttach(Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.IAuthTabCallback;
        runAnimator.IAuthTabCallback(contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onWarmupCompleted();
        onNavigationEvent();
    }

    private void onWarmupCompleted() {
        if (this.IAuthTabCallback == null) {
            this.IAuthTabCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onExtraCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public Context getContext() {
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.onExtraCallback) {
            return null;
        }
        onWarmupCompleted();
        return this.IAuthTabCallback;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
    }

    public final Object generatedComponent() {
        return onExtraCallbackWithResult().generatedComponent();
    }

    protected captureHierarchy IAuthTabCallback() {
        return new captureHierarchy(this);
    }

    public final captureHierarchy onExtraCallbackWithResult() {
        if (this.onNavigationEvent == null) {
            synchronized (this.onExtraCallbackWithResult) {
                if (this.onNavigationEvent == null) {
                    this.onNavigationEvent = IAuthTabCallback();
                }
            }
        }
        return this.onNavigationEvent;
    }

    protected void onNavigationEvent() {
        if (this.onWarmupCompleted) {
            return;
        }
        this.onWarmupCompleted = true;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        return PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
    }
}
