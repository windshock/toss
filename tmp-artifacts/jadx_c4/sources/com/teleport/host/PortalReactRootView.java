package com.teleport.host;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderController;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.maybeReportErrorResultCodeCreate;
import o.r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PortalReactRootView extends ReactRootView {
    private final maybeReportErrorResultCodeCreate IAuthTabCallback;
    private final CredentialProviderController onExtraCallback;
    private final String onNavigationEvent;
    private final ReactHost onWarmupCompleted;

    public int asInterface() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PortalReactRootView(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2, @NotNull ReactHost reactHost, int i, @NotNull String str) {
        super(credentialProviderGetSignInIntentControllerhandleResponse2);
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        Intrinsics.checkNotNullParameter(reactHost, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = reactHost;
        this.onNavigationEvent = str;
        this.IAuthTabCallback = new maybeReportErrorResultCodeCreate(this);
        this.onExtraCallback = ReactFeatureFlags.dispatchPointerEvents ? new CredentialProviderController(this) : null;
        setIsFabric(true);
        setRootViewTag(i);
    }

    private final EventDispatcher readTypedObject() {
        ReactContext reactContextOnExtraCallbackWithResult = this.onWarmupCompleted.onExtraCallbackWithResult();
        if (reactContextOnExtraCallbackWithResult != null) {
            return r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onNavigationEvent(reactContextOnExtraCallbackWithResult, 2);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public void onChildStartedNativeGesture(@Nullable View view, @NotNull MotionEvent motionEvent) {
        CredentialProviderController credentialProviderController;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        EventDispatcher typedObject = readTypedObject();
        if (typedObject != null) {
            this.IAuthTabCallback.onExtraCallbackWithResult(motionEvent, typedObject);
            if (view == null || (credentialProviderController = this.onExtraCallback) == null) {
                return;
            }
            credentialProviderController.onExtraCallbackWithResult(view, motionEvent, typedObject);
        }
    }

    public void onChildEndedNativeGesture(@NotNull View view, @NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(motionEvent, "");
        EventDispatcher typedObject = readTypedObject();
        if (typedObject != null) {
            this.IAuthTabCallback.onWarmupCompleted(motionEvent, typedObject);
            CredentialProviderController credentialProviderController = this.onExtraCallback;
            if (credentialProviderController != null) {
                credentialProviderController.onNavigationEvent();
            }
        }
    }

    public void IAuthTabCallback(@NotNull Throwable th) throws Exception {
        Intrinsics.checkNotNullParameter(th, "");
        Exception runtimeException = th instanceof Exception ? (Exception) th : new RuntimeException(th);
        ReactContext reactContextOnNavigationEvent = onNavigationEvent();
        if (reactContextOnNavigationEvent == null) {
            throw runtimeException;
        }
        reactContextOnNavigationEvent.handleException(runtimeException);
    }

    public String onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public void onWarmupCompleted(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        EventDispatcher typedObject = readTypedObject();
        if (typedObject == null) {
            return;
        }
        this.IAuthTabCallback.onExtraCallback(motionEvent, typedObject, onNavigationEvent());
    }

    public void IAuthTabCallback(@NotNull MotionEvent motionEvent, boolean z) {
        CredentialProviderController credentialProviderController;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        EventDispatcher typedObject = readTypedObject();
        if (typedObject == null || (credentialProviderController = this.onExtraCallback) == null) {
            return;
        }
        credentialProviderController.onNavigationEvent(motionEvent, typedObject, z);
    }

    public boolean access100() {
        ReactContext reactContextOnNavigationEvent = onNavigationEvent();
        return reactContextOnNavigationEvent != null && reactContextOnNavigationEvent.hasActiveReactInstance();
    }

    public boolean IAuthTabCallbackStubProxy() {
        return access100();
    }

    public ReactContext onNavigationEvent() {
        return this.onWarmupCompleted.onExtraCallbackWithResult();
    }

    public boolean getInterfaceDescriptor() {
        return access100();
    }
}
