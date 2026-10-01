package o;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.Intrinsics;
import o.addChangePayload;
import o.isAdapterPositionUnknown;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isInvalid extends addChangePayload {
    private float IAuthTabCallbackStub;
    private float asBinder;
    private double asInterface;
    private isAdapterPositionUnknown onNavigationEvent;
    private double onWarmupCompleted;
    private float onExtraCallback = Float.NaN;
    private float onExtraCallbackWithResult = Float.NaN;
    private final isAdapterPositionUnknown.onNavigationEvent IAuthTabCallback = new onExtraCallback();

    public final double receiveFile() {
        return this.onWarmupCompleted;
    }

    public final double prefetchWithMultipleUrls() {
        return this.asInterface;
    }

    public final float newSession() {
        return this.onExtraCallback;
    }

    public final float postMessage() {
        return this.onExtraCallbackWithResult;
    }

    public static final class onExtraCallback implements isAdapterPositionUnknown.onNavigationEvent {
        @Override // o.isAdapterPositionUnknown.onNavigationEvent
        public void onExtraCallback(isAdapterPositionUnknown isadapterpositionunknown) {
            Intrinsics.checkNotNullParameter(isadapterpositionunknown, "");
        }

        onExtraCallback() {
        }

        @Override // o.isAdapterPositionUnknown.onNavigationEvent
        public boolean onWarmupCompleted(isAdapterPositionUnknown isadapterpositionunknown) {
            Intrinsics.checkNotNullParameter(isadapterpositionunknown, "");
            double dReceiveFile = isInvalid.this.receiveFile();
            isInvalid isinvalid = isInvalid.this;
            isinvalid.onWarmupCompleted = isinvalid.receiveFile() * isadapterpositionunknown.onNavigationEvent();
            double dAsBinder = isadapterpositionunknown.asBinder();
            if (dAsBinder > 0.0d) {
                isInvalid isinvalid2 = isInvalid.this;
                isinvalid2.asInterface = (isinvalid2.receiveFile() - dReceiveFile) / dAsBinder;
            }
            if (Math.abs(isInvalid.this.asBinder - isadapterpositionunknown.onExtraCallback()) < isInvalid.this.IAuthTabCallbackStub || isInvalid.this.onRelationshipValidationResult() != 2) {
                return true;
            }
            isInvalid.this.asInterface();
            return true;
        }

        @Override // o.isAdapterPositionUnknown.onNavigationEvent
        public boolean onNavigationEvent(isAdapterPositionUnknown isadapterpositionunknown) {
            Intrinsics.checkNotNullParameter(isadapterpositionunknown, "");
            isInvalid.this.asBinder = isadapterpositionunknown.onExtraCallback();
            return true;
        }
    }

    @Override // o.addChangePayload
    protected void onExtraCallbackWithResult(@NotNull MotionEvent motionEvent, @NotNull MotionEvent motionEvent2) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        Intrinsics.checkNotNullParameter(motionEvent2, "");
        if (onRelationshipValidationResult() == 0) {
            View viewICustomTabsCallbackStub = ICustomTabsCallbackStub();
            Intrinsics.checkNotNull(viewICustomTabsCallbackStub);
            Context context = viewICustomTabsCallbackStub.getContext();
            newSessionWithExtras();
            this.onNavigationEvent = new isAdapterPositionUnknown(context, this.IAuthTabCallback);
            this.IAuthTabCallbackStub = ViewConfiguration.get(context).getScaledTouchSlop();
            this.onExtraCallback = motionEvent.getX();
            this.onExtraCallbackWithResult = motionEvent.getY();
            IAuthTabCallbackStub();
        }
        isAdapterPositionUnknown isadapterpositionunknown = this.onNavigationEvent;
        if (isadapterpositionunknown != null) {
            isadapterpositionunknown.IAuthTabCallback(motionEvent2);
        }
        isAdapterPositionUnknown isadapterpositionunknown2 = this.onNavigationEvent;
        if (isadapterpositionunknown2 != null) {
            PointF pointFIAuthTabCallback = IAuthTabCallback(new PointF(isadapterpositionunknown2.IAuthTabCallback(), isadapterpositionunknown2.onExtraCallbackWithResult()));
            this.onExtraCallback = pointFIAuthTabCallback.x;
            this.onExtraCallbackWithResult = pointFIAuthTabCallback.y;
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
    protected void onNavigationEvent() {
        this.onNavigationEvent = null;
        this.onExtraCallback = Float.NaN;
        this.onExtraCallbackWithResult = Float.NaN;
        newSessionWithExtras();
    }

    @Override // o.addChangePayload
    public void newSessionWithExtras() {
        this.asInterface = 0.0d;
        this.onWarmupCompleted = 1.0d;
    }

    public static final class onExtraCallbackWithResult extends addChangePayload.IAuthTabCallback<isInvalid> {
        private final Class<isInvalid> onExtraCallback = isInvalid.class;
        private final String IAuthTabCallback = "PinchGestureHandler";

        @Override // o.addChangePayload.IAuthTabCallback
        public Class<isInvalid> onWarmupCompleted() {
            return this.onExtraCallback;
        }

        @Override // o.addChangePayload.IAuthTabCallback
        public String IAuthTabCallback() {
            return this.IAuthTabCallback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.addChangePayload.IAuthTabCallback
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public isInvalid IAuthTabCallback(@Nullable Context context) {
            return new isInvalid();
        }

        @Override // o.addChangePayload.IAuthTabCallback
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public setFlags onExtraCallback(@NotNull isInvalid isinvalid) {
            Intrinsics.checkNotNullParameter(isinvalid, "");
            return new setFlags(isinvalid);
        }
    }
}
