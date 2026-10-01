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
public abstract class Hilt_CardIssueOcrIntroStep4Fragment extends BaseFragment implements captureEndValues {
    private volatile captureHierarchy IAuthTabCallback;
    private ContextWrapper onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private final Object onWarmupCompleted;

    Hilt_CardIssueOcrIntroStep4Fragment() {
        this.onWarmupCompleted = new Object();
        this.onExtraCallbackWithResult = false;
    }

    Hilt_CardIssueOcrIntroStep4Fragment(int i) {
        super(i);
        this.onWarmupCompleted = new Object();
        this.onExtraCallbackWithResult = false;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        onNavigationEvent();
        onWarmupCompleted();
    }

    public void onAttach(Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallback;
        runAnimator.IAuthTabCallback(contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        onNavigationEvent();
        onWarmupCompleted();
    }

    private void onNavigationEvent() {
        if (this.onExtraCallback == null) {
            this.onExtraCallback = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onNavigationEvent = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public Context getContext() {
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.onNavigationEvent) {
            return null;
        }
        onNavigationEvent();
        return this.onExtraCallback;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
    }

    public final Object generatedComponent() {
        return IAuthTabCallback().generatedComponent();
    }

    protected captureHierarchy onExtraCallback() {
        return new captureHierarchy(this);
    }

    public final captureHierarchy IAuthTabCallback() {
        if (this.IAuthTabCallback == null) {
            synchronized (this.onWarmupCompleted) {
                if (this.IAuthTabCallback == null) {
                    this.IAuthTabCallback = onExtraCallback();
                }
            }
        }
        return this.IAuthTabCallback;
    }

    protected void onWarmupCompleted() {
        if (this.onExtraCallbackWithResult) {
            return;
        }
        this.onExtraCallbackWithResult = true;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        return PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
    }
}
