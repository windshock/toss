package im.toss.features.mobileid.impl.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import im.toss.base.BaseFragment;
import o.JSONPathMultiPropertySegment;
import o.PathMotion;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_MobileIdIssueVcNfcFragment extends BaseFragment implements captureEndValues {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private volatile captureHierarchy IAuthTabCallback;
    private boolean onExtraCallback;
    private ContextWrapper onExtraCallbackWithResult;
    private final Object onNavigationEvent;
    private boolean onWarmupCompleted;

    Hilt_MobileIdIssueVcNfcFragment() {
        this.onNavigationEvent = new Object();
        this.onWarmupCompleted = false;
    }

    Hilt_MobileIdIssueVcNfcFragment(int i) {
        super(i);
        this.onNavigationEvent = new Object();
        this.onWarmupCompleted = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(context);
        asInterface();
        IAuthTabCallbackDefault();
        int i4 = IAuthTabCallbackDefault + 53;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onExtraCallbackWithResult;
        if (contextWrapper != null) {
            int i4 = IAuthTabCallbackStub + 35;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 84 / 0;
                if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                    int i6 = IAuthTabCallbackDefault + 63;
                    IAuthTabCallbackStub = i6 % 128;
                    int i7 = i6 % 2;
                    z = false;
                } else {
                    int i8 = IAuthTabCallbackDefault + 37;
                    IAuthTabCallbackStub = i8 % 128;
                    int i9 = i8 % 2;
                    z = true;
                }
            } else if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        asInterface();
        IAuthTabCallbackDefault();
    }

    private void asInterface() {
        int i = 2 % 2;
        if (this.onExtraCallbackWithResult == null) {
            int i2 = IAuthTabCallbackStub + 65;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
                this.onExtraCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
                int i3 = 58 / 0;
            } else {
                this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
                this.onExtraCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
            }
            int i4 = IAuthTabCallbackDefault + 75;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null) {
            int i2 = IAuthTabCallbackStub + 1;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            if (!this.onExtraCallback) {
                int i5 = i3 + 35;
                int i6 = i5 % 128;
                IAuthTabCallbackStub = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 29;
                IAuthTabCallbackDefault = i8 % 128;
                if (i8 % 2 == 0) {
                    return null;
                }
                throw null;
            }
        }
        asInterface();
        return this.onExtraCallbackWithResult;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = IAuthTabCallbackStub + 117;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return layoutInflaterCloneInContext;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = onExtraCallbackWithResult().generatedComponent();
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        return objGeneratedComponent;
    }

    protected captureHierarchy onWarmupCompleted() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = IAuthTabCallbackDefault + 1;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return capturehierarchy;
    }

    public final captureHierarchy onExtraCallbackWithResult() {
        if (this.IAuthTabCallback == null) {
            synchronized (this.onNavigationEvent) {
                if (this.IAuthTabCallback == null) {
                    this.IAuthTabCallback = onWarmupCompleted();
                }
            }
        }
        return this.IAuthTabCallback;
    }

    protected void IAuthTabCallbackDefault() {
        JSONPathMultiPropertySegment jSONPathMultiPropertySegment;
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 51;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 26 / 0;
            if (this.onWarmupCompleted) {
                return;
            }
        } else if (this.onWarmupCompleted) {
            return;
        }
        int i5 = i2 + 111;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            this.onWarmupCompleted = false;
            jSONPathMultiPropertySegment = (JSONPathMultiPropertySegment) generatedComponent();
            objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
        } else {
            this.onWarmupCompleted = true;
            jSONPathMultiPropertySegment = (JSONPathMultiPropertySegment) generatedComponent();
            objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
        }
        jSONPathMultiPropertySegment.onExtraCallback((MobileIdIssueVcNfcFragment) objOnExtraCallbackWithResult);
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i3 = IAuthTabCallbackDefault + 91;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return onwarmupcompletedOnNavigationEvent;
    }
}
