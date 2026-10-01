package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import im.toss.features.applock.impl.view.WarningChangeLowSecurityLevelDialogFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class getInternalMemorySize extends BottomSheetDialogFragment implements captureEndValues {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private boolean IAuthTabCallback;
    private boolean onExtraCallback;
    private volatile captureHierarchy onExtraCallbackWithResult;
    private final Object onNavigationEvent;
    private ContextWrapper onWarmupCompleted;

    public getInternalMemorySize() {
        this.onNavigationEvent = new Object();
        this.IAuthTabCallback = false;
    }

    getInternalMemorySize(int i) {
        super(i);
        this.onNavigationEvent = new Object();
        this.IAuthTabCallback = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super/*androidx.fragment.app.DialogFragment*/.onAttach(context);
        IAuthTabCallback();
        onWarmupCompleted();
        int i4 = IAuthTabCallbackStub + 19;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(Activity activity) {
        boolean z;
        int i = 2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onWarmupCompleted;
        if (contextWrapper != null) {
            int i2 = IAuthTabCallbackStub + 59;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                captureHierarchy.onWarmupCompleted(contextWrapper);
                throw null;
            }
            if (captureHierarchy.onWarmupCompleted(contextWrapper) != activity) {
                int i3 = IAuthTabCallbackStub + 111;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                z = false;
            } else {
                z = true;
            }
        }
        runAnimator.IAuthTabCallback(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        IAuthTabCallback();
        onWarmupCompleted();
    }

    private void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        if (this.onWarmupCompleted == null) {
            int i5 = i3 + 111;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                this.onWarmupCompleted = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
                this.onExtraCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
            } else {
                this.onWarmupCompleted = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
                this.onExtraCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r5.onExtraCallback != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r5.onExtraCallback == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Context getContext() {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super/*androidx.fragment.app.Fragment*/.getContext();
            obj.hashCode();
            throw null;
        }
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null) {
            int i3 = IAuthTabCallbackStub + 121;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 92 / 0;
            }
        }
        IAuthTabCallback();
        ContextWrapper contextWrapper = this.onWarmupCompleted;
        int i5 = onTransact + 17;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return contextWrapper;
        }
        obj.hashCode();
        throw null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.DialogFragment*/.onGetLayoutInflater(bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        int i4 = onTransact + 123;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return layoutInflaterCloneInContext;
        }
        throw null;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = onExtraCallback().generatedComponent();
        int i4 = IAuthTabCallbackStub + 31;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return objGeneratedComponent;
    }

    protected captureHierarchy onExtraCallbackWithResult() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = onTransact + 5;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 62 / 0;
        }
        return capturehierarchy;
    }

    public final captureHierarchy onExtraCallback() {
        if (this.onExtraCallbackWithResult == null) {
            synchronized (this.onNavigationEvent) {
                if (this.onExtraCallbackWithResult == null) {
                    this.onExtraCallbackWithResult = onExtraCallbackWithResult();
                }
            }
        }
        return this.onExtraCallbackWithResult;
    }

    protected void onWarmupCompleted() {
        getSystemInfo getsysteminfo;
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        if (!this.IAuthTabCallback) {
            int i2 = IAuthTabCallbackStub + 49;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                this.IAuthTabCallback = false;
                getsysteminfo = (getSystemInfo) generatedComponent();
                objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
            } else {
                this.IAuthTabCallback = true;
                getsysteminfo = (getSystemInfo) generatedComponent();
                objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
            }
            getsysteminfo.onExtraCallbackWithResult((WarningChangeLowSecurityLevelDialogFragment) objOnExtraCallbackWithResult);
        }
        int i3 = IAuthTabCallbackStub + 29;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i3 = onTransact + 11;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return onwarmupcompletedOnNavigationEvent;
    }
}
