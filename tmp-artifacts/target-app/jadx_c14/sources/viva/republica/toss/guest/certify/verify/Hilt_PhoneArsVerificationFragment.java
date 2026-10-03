package viva.republica.toss.guest.certify.verify;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import o.PathMotion;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;
import viva.republica.toss.guest.certify.fragment.GuestBaseFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_PhoneArsVerificationFragment extends GuestBaseFragment implements captureEndValues {
    private final Object IAuthTabCallback;
    private volatile captureHierarchy onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private ContextWrapper onNavigationEvent;
    private boolean onWarmupCompleted;

    Hilt_PhoneArsVerificationFragment() {
        this.IAuthTabCallback = new Object();
        this.onWarmupCompleted = false;
    }

    Hilt_PhoneArsVerificationFragment(int i) {
        super(i);
        this.IAuthTabCallback = new Object();
        this.onWarmupCompleted = false;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        asInterface();
        access100();
    }

    public void onAttach(Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onNavigationEvent;
        runAnimator.IAuthTabCallback(contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        asInterface();
        access100();
    }

    private void asInterface() {
        if (this.onNavigationEvent == null) {
            this.onNavigationEvent = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onExtraCallbackWithResult = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public Context getContext() {
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.onExtraCallbackWithResult) {
            return null;
        }
        asInterface();
        return this.onNavigationEvent;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
    }

    public final Object generatedComponent() {
        return onTransact().generatedComponent();
    }

    protected captureHierarchy asBinder() {
        return new captureHierarchy(this);
    }

    public final captureHierarchy onTransact() {
        if (this.onExtraCallback == null) {
            synchronized (this.IAuthTabCallback) {
                if (this.onExtraCallback == null) {
                    this.onExtraCallback = asBinder();
                }
            }
        }
        return this.onExtraCallback;
    }

    protected void access100() {
        if (this.onWarmupCompleted) {
            return;
        }
        this.onWarmupCompleted = true;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        return PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
    }
}
