package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.addChangePayload;
import o.isRecyclable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isRecyclable extends addChangePayload {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private float IAuthTabCallback;
    private float access000;
    private float access100;
    private int extraCallbackWithResult;
    private float getInterfaceDescriptor;
    private Handler onExtraCallbackWithResult;
    private float onNavigationEvent;
    private float readTypedObject;
    private float IAuthTabCallbackStub = Float.MIN_VALUE;
    private float onTransact = Float.MIN_VALUE;
    private float asBinder = Float.MIN_VALUE;
    private long asInterface = 500;
    private long IAuthTabCallbackDefault = 200;
    private int IAuthTabCallbackStubProxy = 1;
    private int IAuthTabCallback_Parcel = 1;
    private int onExtraCallback = 1;
    private final Runnable onWarmupCompleted = new Runnable() { // from class: com.swmansion.gesturehandler.core.TapGestureHandler$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            isRecyclable.onWarmupCompleted(this.f$0);
        }
    };

    public isRecyclable() {
        onExtraCallbackWithResult(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(isRecyclable isrecyclable) {
        isrecyclable.access000();
    }

    @Override // o.addChangePayload
    public void onExtraCallbackWithResult() {
        super.onExtraCallbackWithResult();
        this.IAuthTabCallbackStub = Float.MIN_VALUE;
        this.onTransact = Float.MIN_VALUE;
        this.asBinder = Float.MIN_VALUE;
        this.asInterface = 500L;
        this.IAuthTabCallbackDefault = 200L;
        this.IAuthTabCallbackStubProxy = 1;
        this.IAuthTabCallback_Parcel = 1;
        onExtraCallbackWithResult(true);
    }

    private final void setEngagementSignalsCallback() {
        Handler handler = this.onExtraCallbackWithResult;
        if (handler == null) {
            this.onExtraCallbackWithResult = new Handler(Looper.getMainLooper());
        } else {
            Intrinsics.checkNotNull(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.onExtraCallbackWithResult;
        Intrinsics.checkNotNull(handler2);
        handler2.postDelayed(this.onWarmupCompleted, this.asInterface);
    }

    private final void postMessage() {
        Handler handler = this.onExtraCallbackWithResult;
        if (handler == null) {
            this.onExtraCallbackWithResult = new Handler(Looper.getMainLooper());
        } else {
            Intrinsics.checkNotNull(handler);
            handler.removeCallbacksAndMessages(null);
        }
        int i = this.extraCallbackWithResult + 1;
        this.extraCallbackWithResult = i;
        if (i == this.IAuthTabCallbackStubProxy && this.onExtraCallback >= this.IAuthTabCallback_Parcel) {
            asInterface();
            return;
        }
        Handler handler2 = this.onExtraCallbackWithResult;
        Intrinsics.checkNotNull(handler2);
        handler2.postDelayed(this.onWarmupCompleted, this.IAuthTabCallbackDefault);
    }

    private final boolean newSession() {
        float f = (this.onNavigationEvent - this.getInterfaceDescriptor) + this.access000;
        if (this.IAuthTabCallbackStub != Float.MIN_VALUE && Math.abs(f) > this.IAuthTabCallbackStub) {
            return true;
        }
        float f2 = (this.IAuthTabCallback - this.readTypedObject) + this.access100;
        if (this.onTransact != Float.MIN_VALUE && Math.abs(f2) > this.onTransact) {
            return true;
        }
        float f3 = this.asBinder;
        return f3 != Float.MIN_VALUE && (f2 * f2) + (f * f) > f3 * f3;
    }

    @Override // o.addChangePayload
    protected void onExtraCallbackWithResult(@NotNull MotionEvent motionEvent, @NotNull MotionEvent motionEvent2) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        Intrinsics.checkNotNullParameter(motionEvent2, "");
        if (onWarmupCompleted(motionEvent2)) {
            int iOnRelationshipValidationResult = onRelationshipValidationResult();
            int actionMasked = motionEvent2.getActionMasked();
            if (iOnRelationshipValidationResult == 0) {
                this.access000 = 0.0f;
                this.access100 = 0.0f;
                clearReturnedFromScrapFlag clearreturnedfromscrapflag = clearReturnedFromScrapFlag.onExtraCallbackWithResult;
                this.getInterfaceDescriptor = clearreturnedfromscrapflag.onExtraCallback(motionEvent2, true);
                this.readTypedObject = clearreturnedfromscrapflag.onNavigationEvent(motionEvent2, true);
            }
            if (actionMasked == 5 || actionMasked == 6) {
                this.access000 += this.onNavigationEvent - this.getInterfaceDescriptor;
                this.access100 += this.IAuthTabCallback - this.readTypedObject;
                clearReturnedFromScrapFlag clearreturnedfromscrapflag2 = clearReturnedFromScrapFlag.onExtraCallbackWithResult;
                this.onNavigationEvent = clearreturnedfromscrapflag2.onExtraCallback(motionEvent2, true);
                float fOnNavigationEvent = clearreturnedfromscrapflag2.onNavigationEvent(motionEvent2, true);
                this.IAuthTabCallback = fOnNavigationEvent;
                this.getInterfaceDescriptor = this.onNavigationEvent;
                this.readTypedObject = fOnNavigationEvent;
            } else {
                clearReturnedFromScrapFlag clearreturnedfromscrapflag3 = clearReturnedFromScrapFlag.onExtraCallbackWithResult;
                this.onNavigationEvent = clearreturnedfromscrapflag3.onExtraCallback(motionEvent2, true);
                this.IAuthTabCallback = clearreturnedfromscrapflag3.onNavigationEvent(motionEvent2, true);
            }
            if (this.onExtraCallback < motionEvent2.getPointerCount()) {
                this.onExtraCallback = motionEvent2.getPointerCount();
            }
            if (newSession()) {
                access000();
                return;
            }
            if (iOnRelationshipValidationResult == 0) {
                if (actionMasked == 0 || actionMasked == 11) {
                    IAuthTabCallbackStub();
                }
                setEngagementSignalsCallback();
                return;
            }
            if (iOnRelationshipValidationResult == 2) {
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 11) {
                            if (actionMasked != 12) {
                                return;
                            }
                        }
                    }
                    postMessage();
                    return;
                }
                setEngagementSignalsCallback();
            }
        }
    }

    @Override // o.addChangePayload
    public void onExtraCallback(boolean z) {
        super.onExtraCallback(z);
        getInterfaceDescriptor();
    }

    @Override // o.addChangePayload
    protected void onWarmupCompleted() {
        Handler handler = this.onExtraCallbackWithResult;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // o.addChangePayload
    protected void onNavigationEvent() {
        this.extraCallbackWithResult = 0;
        this.onExtraCallback = 0;
        Handler handler = this.onExtraCallbackWithResult;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public static final class onExtraCallbackWithResult extends addChangePayload.IAuthTabCallback<isRecyclable> {
        public static final onExtraCallback Companion = new onExtraCallback(null);
        private final Class<isRecyclable> onExtraCallbackWithResult = isRecyclable.class;
        private final String onWarmupCompleted = "TapGestureHandler";

        @Override // o.addChangePayload.IAuthTabCallback
        public Class<isRecyclable> onWarmupCompleted() {
            return this.onExtraCallbackWithResult;
        }

        @Override // o.addChangePayload.IAuthTabCallback
        public String IAuthTabCallback() {
            return this.onWarmupCompleted;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.addChangePayload.IAuthTabCallback
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public isRecyclable IAuthTabCallback(@Nullable Context context) {
            return new isRecyclable();
        }

        @Override // o.addChangePayload.IAuthTabCallback
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public void onNavigationEvent(@NotNull isRecyclable isrecyclable, @NotNull ReadableMap readableMap) {
            Intrinsics.checkNotNullParameter(isrecyclable, "");
            Intrinsics.checkNotNullParameter(readableMap, "");
            super.onNavigationEvent(isrecyclable, readableMap);
            if (readableMap.hasKey("numberOfTaps")) {
                isrecyclable.IAuthTabCallbackStubProxy = readableMap.getInt("numberOfTaps");
            }
            if (readableMap.hasKey("maxDurationMs")) {
                isrecyclable.asInterface = readableMap.getInt("maxDurationMs");
            }
            if (readableMap.hasKey("maxDelayMs")) {
                isrecyclable.IAuthTabCallbackDefault = readableMap.getInt("maxDelayMs");
            }
            if (readableMap.hasKey("maxDeltaX")) {
                isrecyclable.IAuthTabCallbackStub = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(readableMap.getDouble("maxDeltaX"));
            }
            if (readableMap.hasKey("maxDeltaY")) {
                isrecyclable.onTransact = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(readableMap.getDouble("maxDeltaY"));
            }
            if (readableMap.hasKey("maxDist")) {
                isrecyclable.asBinder = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(readableMap.getDouble("maxDist"));
            }
            if (readableMap.hasKey("minPointers")) {
                isrecyclable.IAuthTabCallback_Parcel = readableMap.getInt("minPointers");
            }
        }

        @Override // o.addChangePayload.IAuthTabCallback
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public setScrapContainer onExtraCallback(@NotNull isRecyclable isrecyclable) {
            Intrinsics.checkNotNullParameter(isrecyclable, "");
            return new setScrapContainer(isrecyclable);
        }

        public static final class onExtraCallback {
            public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onExtraCallback() {
            }
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }
}
