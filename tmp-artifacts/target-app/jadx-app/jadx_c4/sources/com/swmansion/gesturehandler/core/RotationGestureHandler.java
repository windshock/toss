package com.swmansion.gesturehandler.core;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.swmansion.gesturehandler.core.RotationGestureDetector;
import com.swmansion.gesturehandler.react.eventbuilders.RotationGestureHandlerEventDataBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.addChangePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RotationGestureHandler extends addChangePayload {
    public static final Companion Companion = new Companion(null);
    private RotationGestureDetector onExtraCallback;
    private double onTransact;
    private double onWarmupCompleted;
    private float onNavigationEvent = Float.NaN;
    private float IAuthTabCallback = Float.NaN;
    private final RotationGestureDetector.OnRotationGestureListener onExtraCallbackWithResult = new RotationGestureDetector.OnRotationGestureListener() { // from class: com.swmansion.gesturehandler.core.RotationGestureHandler$gestureListener$1
        @Override // com.swmansion.gesturehandler.core.RotationGestureDetector.OnRotationGestureListener
        public boolean onExtraCallbackWithResult(RotationGestureDetector rotationGestureDetector) {
            Intrinsics.checkNotNullParameter(rotationGestureDetector, "");
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.RotationGestureDetector.OnRotationGestureListener
        public boolean onNavigationEvent(RotationGestureDetector rotationGestureDetector) {
            Intrinsics.checkNotNullParameter(rotationGestureDetector, "");
            double dReceiveFile = this.onWarmupCompleted.receiveFile();
            RotationGestureHandler rotationGestureHandler = this.onWarmupCompleted;
            rotationGestureHandler.onWarmupCompleted = rotationGestureHandler.receiveFile() + rotationGestureDetector.onExtraCallbackWithResult();
            long jIAuthTabCallback = rotationGestureDetector.IAuthTabCallback();
            if (jIAuthTabCallback > 0) {
                RotationGestureHandler rotationGestureHandler2 = this.onWarmupCompleted;
                rotationGestureHandler2.onTransact = (rotationGestureHandler2.receiveFile() - dReceiveFile) / jIAuthTabCallback;
            }
            if (Math.abs(this.onWarmupCompleted.receiveFile()) < 0.08726646259971647d || this.onWarmupCompleted.onRelationshipValidationResult() != 2) {
                return true;
            }
            this.onWarmupCompleted.asInterface();
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.RotationGestureDetector.OnRotationGestureListener
        public void IAuthTabCallback(RotationGestureDetector rotationGestureDetector) {
            Intrinsics.checkNotNullParameter(rotationGestureDetector, "");
            this.onWarmupCompleted.getInterfaceDescriptor();
        }
    };

    public final double receiveFile() {
        return this.onWarmupCompleted;
    }

    public final double requestPostMessageChannel() {
        return this.onTransact;
    }

    public final float newSession() {
        return this.onNavigationEvent;
    }

    public final float postMessage() {
        return this.IAuthTabCallback;
    }

    @Override // o.addChangePayload
    public void onExtraCallbackWithResult(@NotNull MotionEvent motionEvent, @NotNull MotionEvent motionEvent2) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        Intrinsics.checkNotNullParameter(motionEvent2, "");
        if (onRelationshipValidationResult() == 0) {
            newSessionWithExtras();
            this.onExtraCallback = new RotationGestureDetector(this.onExtraCallbackWithResult);
            this.onNavigationEvent = motionEvent.getX();
            this.IAuthTabCallback = motionEvent.getY();
            IAuthTabCallbackStub();
        }
        RotationGestureDetector rotationGestureDetector = this.onExtraCallback;
        if (rotationGestureDetector != null) {
            rotationGestureDetector.onNavigationEvent(motionEvent2);
        }
        RotationGestureDetector rotationGestureDetector2 = this.onExtraCallback;
        if (rotationGestureDetector2 != null) {
            PointF pointFIAuthTabCallback = IAuthTabCallback(new PointF(rotationGestureDetector2.onWarmupCompleted(), rotationGestureDetector2.onExtraCallback()));
            this.onNavigationEvent = pointFIAuthTabCallback.x;
            this.IAuthTabCallback = pointFIAuthTabCallback.y;
        }
        if (motionEvent2.getActionMasked() == 1) {
            if (onRelationshipValidationResult() == 4) {
                getInterfaceDescriptor();
            } else {
                access000();
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
    public void onNavigationEvent() {
        this.onExtraCallback = null;
        this.onNavigationEvent = Float.NaN;
        this.IAuthTabCallback = Float.NaN;
        newSessionWithExtras();
    }

    @Override // o.addChangePayload
    public void newSessionWithExtras() {
        this.onTransact = 0.0d;
        this.onWarmupCompleted = 0.0d;
    }

    public static final class Factory extends addChangePayload.IAuthTabCallback<RotationGestureHandler> {
        private final Class<RotationGestureHandler> onExtraCallback = RotationGestureHandler.class;
        private final String onExtraCallbackWithResult = "RotationGestureHandler";

        @Override // o.addChangePayload.IAuthTabCallback
        public Class<RotationGestureHandler> onWarmupCompleted() {
            return this.onExtraCallback;
        }

        @Override // o.addChangePayload.IAuthTabCallback
        public String IAuthTabCallback() {
            return this.onExtraCallbackWithResult;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.addChangePayload.IAuthTabCallback
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public RotationGestureHandler IAuthTabCallback(@Nullable Context context) {
            return new RotationGestureHandler();
        }

        @Override // o.addChangePayload.IAuthTabCallback
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public RotationGestureHandlerEventDataBuilder onExtraCallback(@NotNull RotationGestureHandler rotationGestureHandler) {
            Intrinsics.checkNotNullParameter(rotationGestureHandler, "");
            return new RotationGestureHandlerEventDataBuilder(rotationGestureHandler);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
