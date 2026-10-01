package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.gesturehandler.core.PanGestureHandler$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.addChangePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class hasAnyOfTheFlags extends addChangePayload {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private final float IAuthTabCallbackDefault;
    private Handler IAuthTabCallback_Parcel;
    private float ICustomTabsCallbackDefault;
    private VelocityTracker ICustomTabsCallbackStub;
    private float access000;
    private boolean asBinder;
    private float getInterfaceDescriptor;
    private float onActivityLayout;
    private float onActivityResized;
    private float onMessageChannelReady;
    private float onPostMessage;
    private float onUnminimized;
    private long onWarmupCompleted;
    private float writeTypedObject;
    private float onNavigationEvent = Float.MAX_VALUE;
    private float IAuthTabCallback = Float.MIN_VALUE;
    private float IAuthTabCallbackStub = Float.MIN_VALUE;
    private float onTransact = Float.MAX_VALUE;
    private float asInterface = Float.MAX_VALUE;
    private float onExtraCallback = Float.MIN_VALUE;
    private float access100 = Float.MIN_VALUE;
    private float IAuthTabCallbackStubProxy = Float.MAX_VALUE;
    private float readTypedObject = Float.MAX_VALUE;
    private float onMinimized = Float.MAX_VALUE;
    private float ICustomTabsCallback = Float.MAX_VALUE;
    private int extraCallback = 1;
    private int extraCallbackWithResult = 10;
    private final Runnable onExtraCallbackWithResult = new PanGestureHandler$.ExternalSyntheticLambda0(this);
    private isAttachedToTransitionOverlay ICustomTabsCallbackStubProxy = new isAttachedToTransitionOverlay(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);

    public hasAnyOfTheFlags(@Nullable Context context) {
        this.writeTypedObject = Float.MIN_VALUE;
        Intrinsics.checkNotNull(context);
        float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.IAuthTabCallbackDefault = scaledTouchSlop;
        this.writeTypedObject = scaledTouchSlop;
    }

    public final float prefetchWithMultipleUrls() {
        return this.onUnminimized;
    }

    public final float requestPostMessageChannelWithExtras() {
        return this.ICustomTabsCallbackDefault;
    }

    public final float postMessage() {
        return (this.access000 - this.onPostMessage) + this.onActivityLayout;
    }

    public final float receiveFile() {
        return (this.getInterfaceDescriptor - this.onActivityResized) + this.onMessageChannelReady;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(hasAnyOfTheFlags hasanyoftheflags) {
        hasanyoftheflags.asInterface();
    }

    public final isAttachedToTransitionOverlay newSession() {
        return this.ICustomTabsCallbackStubProxy;
    }

    @Override // o.addChangePayload
    public void onExtraCallbackWithResult() {
        super.onExtraCallbackWithResult();
        this.onNavigationEvent = Float.MAX_VALUE;
        this.IAuthTabCallback = Float.MIN_VALUE;
        this.IAuthTabCallbackStub = Float.MIN_VALUE;
        this.onTransact = Float.MAX_VALUE;
        this.asInterface = Float.MAX_VALUE;
        this.onExtraCallback = Float.MIN_VALUE;
        this.access100 = Float.MIN_VALUE;
        this.IAuthTabCallbackStubProxy = Float.MAX_VALUE;
        this.readTypedObject = Float.MAX_VALUE;
        this.onMinimized = Float.MAX_VALUE;
        this.ICustomTabsCallback = Float.MAX_VALUE;
        this.writeTypedObject = this.IAuthTabCallbackDefault;
        this.extraCallback = 1;
        this.extraCallbackWithResult = 10;
        this.onWarmupCompleted = 0L;
        this.asBinder = false;
    }

    private final boolean setEngagementSignalsCallback() {
        float f = (this.access000 - this.onPostMessage) + this.onActivityLayout;
        float f2 = this.onNavigationEvent;
        if (f2 != Float.MAX_VALUE && f < f2) {
            return true;
        }
        float f3 = this.IAuthTabCallback;
        if (f3 != Float.MIN_VALUE && f > f3) {
            return true;
        }
        float f4 = (this.getInterfaceDescriptor - this.onActivityResized) + this.onMessageChannelReady;
        float f5 = this.asInterface;
        if (f5 != Float.MAX_VALUE && f4 < f5) {
            return true;
        }
        float f6 = this.onExtraCallback;
        if (f6 != Float.MIN_VALUE && f4 > f6) {
            return true;
        }
        float f7 = this.writeTypedObject;
        if (f7 != Float.MAX_VALUE && (f * f) + (f4 * f4) >= f7 * f7) {
            return true;
        }
        float f8 = this.onUnminimized;
        float f9 = this.readTypedObject;
        if (f9 != Float.MAX_VALUE && ((f9 < 0.0f && f8 <= f9) || (0.0f <= f9 && f9 <= f8))) {
            return true;
        }
        float f10 = this.ICustomTabsCallbackDefault;
        float f11 = this.onMinimized;
        if (f11 != Float.MAX_VALUE && ((f11 < 0.0f && f8 <= f11) || (0.0f <= f11 && f11 <= f8))) {
            return true;
        }
        float f12 = this.ICustomTabsCallback;
        return f12 != Float.MAX_VALUE && (f8 * f8) + (f10 * f10) >= f12 * f12;
    }

    private final boolean requestPostMessageChannel() {
        float f = (this.access000 - this.onPostMessage) + this.onActivityLayout;
        float f2 = (this.getInterfaceDescriptor - this.onActivityResized) + this.onMessageChannelReady;
        if (this.onWarmupCompleted > 0) {
            float f3 = this.IAuthTabCallbackDefault;
            if ((f * f) + (f2 * f2) > f3 * f3) {
                Handler handler = this.IAuthTabCallback_Parcel;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                return true;
            }
        }
        float f4 = this.IAuthTabCallbackStub;
        if (f4 != Float.MIN_VALUE && f < f4) {
            return true;
        }
        float f5 = this.onTransact;
        if (f5 != Float.MAX_VALUE && f > f5) {
            return true;
        }
        float f6 = this.access100;
        if (f6 != Float.MIN_VALUE && f2 < f6) {
            return true;
        }
        float f7 = this.IAuthTabCallbackStubProxy;
        return f7 != Float.MAX_VALUE && f2 > f7;
    }

    @Override // o.addChangePayload
    protected void onExtraCallbackWithResult(@NotNull MotionEvent motionEvent, @NotNull MotionEvent motionEvent2) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        Intrinsics.checkNotNullParameter(motionEvent2, "");
        if (onWarmupCompleted(motionEvent2)) {
            if (motionEvent.getToolType(0) == 2) {
                this.ICustomTabsCallbackStubProxy = isAttachedToTransitionOverlay.Companion.onNavigationEvent(motionEvent);
            }
            int iOnRelationshipValidationResult = onRelationshipValidationResult();
            int actionMasked = motionEvent2.getActionMasked();
            if (actionMasked == 5 || actionMasked == 6) {
                this.onActivityLayout += this.access000 - this.onPostMessage;
                this.onMessageChannelReady += this.getInterfaceDescriptor - this.onActivityResized;
                clearReturnedFromScrapFlag clearreturnedfromscrapflag = clearReturnedFromScrapFlag.onExtraCallbackWithResult;
                this.access000 = clearreturnedfromscrapflag.onExtraCallback(motionEvent2, this.asBinder);
                float fOnNavigationEvent = clearreturnedfromscrapflag.onNavigationEvent(motionEvent2, this.asBinder);
                this.getInterfaceDescriptor = fOnNavigationEvent;
                this.onPostMessage = this.access000;
                this.onActivityResized = fOnNavigationEvent;
            } else {
                clearReturnedFromScrapFlag clearreturnedfromscrapflag2 = clearReturnedFromScrapFlag.onExtraCallbackWithResult;
                this.access000 = clearreturnedfromscrapflag2.onExtraCallback(motionEvent2, this.asBinder);
                this.getInterfaceDescriptor = clearreturnedfromscrapflag2.onNavigationEvent(motionEvent2, this.asBinder);
            }
            if (iOnRelationshipValidationResult == 0 && motionEvent2.getPointerCount() >= this.extraCallback) {
                newSessionWithExtras();
                this.onActivityLayout = 0.0f;
                this.onMessageChannelReady = 0.0f;
                this.onUnminimized = 0.0f;
                this.ICustomTabsCallbackDefault = 0.0f;
                VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
                this.ICustomTabsCallbackStub = velocityTrackerObtain;
                Companion.IAuthTabCallback(velocityTrackerObtain, motionEvent2);
                IAuthTabCallbackStub();
                if (this.onWarmupCompleted > 0) {
                    if (this.IAuthTabCallback_Parcel == null) {
                        this.IAuthTabCallback_Parcel = new Handler(Looper.getMainLooper());
                    }
                    Handler handler = this.IAuthTabCallback_Parcel;
                    Intrinsics.checkNotNull(handler);
                    handler.postDelayed(this.onExtraCallbackWithResult, this.onWarmupCompleted);
                }
            } else {
                VelocityTracker velocityTracker = this.ICustomTabsCallbackStub;
                if (velocityTracker != null) {
                    Companion.IAuthTabCallback(velocityTracker, motionEvent2);
                    VelocityTracker velocityTracker2 = this.ICustomTabsCallbackStub;
                    Intrinsics.checkNotNull(velocityTracker2);
                    velocityTracker2.computeCurrentVelocity(1000);
                    VelocityTracker velocityTracker3 = this.ICustomTabsCallbackStub;
                    Intrinsics.checkNotNull(velocityTracker3);
                    this.onUnminimized = velocityTracker3.getXVelocity();
                    VelocityTracker velocityTracker4 = this.ICustomTabsCallbackStub;
                    Intrinsics.checkNotNull(velocityTracker4);
                    this.ICustomTabsCallbackDefault = velocityTracker4.getYVelocity();
                }
            }
            if (actionMasked == 1 || actionMasked == 12) {
                if (iOnRelationshipValidationResult == 4) {
                    getInterfaceDescriptor();
                    return;
                } else {
                    access000();
                    return;
                }
            }
            if (actionMasked == 5 && motionEvent2.getPointerCount() > this.extraCallbackWithResult) {
                if (iOnRelationshipValidationResult == 4) {
                    onTransact();
                    return;
                } else {
                    access000();
                    return;
                }
            }
            if (actionMasked == 6 && iOnRelationshipValidationResult == 4 && motionEvent2.getPointerCount() < this.extraCallback) {
                access000();
                return;
            }
            if (iOnRelationshipValidationResult == 2) {
                if (requestPostMessageChannel()) {
                    access000();
                } else if (setEngagementSignalsCallback()) {
                    asInterface();
                }
            }
        }
    }

    @Override // o.addChangePayload
    public void onExtraCallback(boolean z) {
        if (onRelationshipValidationResult() != 4) {
            newSessionWithExtras();
        }
        super.onExtraCallback(z);
    }

    @Override // o.addChangePayload
    protected void onWarmupCompleted() {
        Handler handler = this.IAuthTabCallback_Parcel;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // o.addChangePayload
    protected void onNavigationEvent() {
        Handler handler = this.IAuthTabCallback_Parcel;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        VelocityTracker velocityTracker = this.ICustomTabsCallbackStub;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ICustomTabsCallbackStub = null;
        }
        this.ICustomTabsCallbackStubProxy = new isAttachedToTransitionOverlay(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }

    @Override // o.addChangePayload
    public void newSessionWithExtras() {
        this.onPostMessage = this.access000;
        this.onActivityResized = this.getInterfaceDescriptor;
    }

    public static final class onExtraCallback extends addChangePayload.IAuthTabCallback<hasAnyOfTheFlags> {
        public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
        private final Class<hasAnyOfTheFlags> onNavigationEvent = hasAnyOfTheFlags.class;
        private final String onExtraCallback = "PanGestureHandler";

        @Override // o.addChangePayload.IAuthTabCallback
        public Class<hasAnyOfTheFlags> onWarmupCompleted() {
            return this.onNavigationEvent;
        }

        @Override // o.addChangePayload.IAuthTabCallback
        public String IAuthTabCallback() {
            return this.onExtraCallback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.addChangePayload.IAuthTabCallback
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public hasAnyOfTheFlags IAuthTabCallback(@Nullable Context context) {
            return new hasAnyOfTheFlags(context);
        }

        @Override // o.addChangePayload.IAuthTabCallback
        public void onNavigationEvent(@NotNull hasAnyOfTheFlags hasanyoftheflags, @NotNull ReadableMap readableMap) {
            boolean z;
            Intrinsics.checkNotNullParameter(hasanyoftheflags, "");
            Intrinsics.checkNotNullParameter(readableMap, "");
            super.onNavigationEvent((onExtraCallback) hasanyoftheflags, readableMap);
            boolean z2 = true;
            if (readableMap.hasKey("activeOffsetXStart")) {
                hasanyoftheflags.onNavigationEvent = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(readableMap.getDouble("activeOffsetXStart"));
                z = true;
            } else {
                z = false;
            }
            if (readableMap.hasKey("activeOffsetXEnd")) {
                hasanyoftheflags.IAuthTabCallback = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(readableMap.getDouble("activeOffsetXEnd"));
                z = true;
            }
            if (readableMap.hasKey("failOffsetXStart")) {
                hasanyoftheflags.IAuthTabCallbackStub = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(readableMap.getDouble("failOffsetXStart"));
                z = true;
            }
            if (readableMap.hasKey("failOffsetXEnd")) {
                hasanyoftheflags.onTransact = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(readableMap.getDouble("failOffsetXEnd"));
                z = true;
            }
            if (readableMap.hasKey("activeOffsetYStart")) {
                hasanyoftheflags.asInterface = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(readableMap.getDouble("activeOffsetYStart"));
                z = true;
            }
            if (readableMap.hasKey("activeOffsetYEnd")) {
                hasanyoftheflags.onExtraCallback = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(readableMap.getDouble("activeOffsetYEnd"));
                z = true;
            }
            if (readableMap.hasKey("failOffsetYStart")) {
                hasanyoftheflags.access100 = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(readableMap.getDouble("failOffsetYStart"));
                z = true;
            }
            if (readableMap.hasKey("failOffsetYEnd")) {
                hasanyoftheflags.IAuthTabCallbackStubProxy = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(readableMap.getDouble("failOffsetYEnd"));
                z = true;
            }
            if (readableMap.hasKey("minVelocity")) {
                hasanyoftheflags.ICustomTabsCallback = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(readableMap.getDouble("minVelocity"));
                z = true;
            }
            if (readableMap.hasKey("minVelocityX")) {
                hasanyoftheflags.readTypedObject = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(readableMap.getDouble("minVelocityX"));
                z = true;
            }
            if (readableMap.hasKey("minVelocityY")) {
                hasanyoftheflags.onMinimized = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(readableMap.getDouble("minVelocityY"));
            } else {
                z2 = z;
            }
            if (readableMap.hasKey("minDist")) {
                hasanyoftheflags.writeTypedObject = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(readableMap.getDouble("minDist"));
            } else if (z2) {
                hasanyoftheflags.writeTypedObject = Float.MAX_VALUE;
            }
            if (readableMap.hasKey("minPointers")) {
                hasanyoftheflags.extraCallback = readableMap.getInt("minPointers");
            }
            if (readableMap.hasKey("maxPointers")) {
                hasanyoftheflags.extraCallbackWithResult = readableMap.getInt("maxPointers");
            }
            if (readableMap.hasKey("avgTouches")) {
                hasanyoftheflags.asBinder = readableMap.getBoolean("avgTouches");
            }
            if (readableMap.hasKey("activateAfterLongPress")) {
                hasanyoftheflags.onWarmupCompleted = readableMap.getInt("activateAfterLongPress");
            }
        }

        @Override // o.addChangePayload.IAuthTabCallback
        public resetInternal onExtraCallback(@NotNull hasAnyOfTheFlags hasanyoftheflags) {
            Intrinsics.checkNotNullParameter(hasanyoftheflags, "");
            return new resetInternal(hasanyoftheflags);
        }

        public static final class onWarmupCompleted {
            public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onWarmupCompleted() {
            }
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void IAuthTabCallback(VelocityTracker velocityTracker, MotionEvent motionEvent) {
            float rawX = motionEvent.getRawX() - motionEvent.getX();
            float rawY = motionEvent.getRawY() - motionEvent.getY();
            motionEvent.offsetLocation(rawX, rawY);
            Intrinsics.checkNotNull(velocityTracker);
            velocityTracker.addMovement(motionEvent);
            motionEvent.offsetLocation(-rawX, -rawY);
        }
    }
}
