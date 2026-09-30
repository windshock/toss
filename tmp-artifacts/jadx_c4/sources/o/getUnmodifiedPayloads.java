package o;

import android.content.Context;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;
import o.addChangePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getUnmodifiedPayloads extends addChangePayload {
    @Override // o.addChangePayload
    protected void onExtraCallbackWithResult(@NotNull MotionEvent motionEvent, @NotNull MotionEvent motionEvent2) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        Intrinsics.checkNotNullParameter(motionEvent2, "");
        if (onRelationshipValidationResult() == 0) {
            IAuthTabCallbackStub();
        }
    }

    public static final class onExtraCallback extends addChangePayload.IAuthTabCallback<getUnmodifiedPayloads> {
        private final Class<getUnmodifiedPayloads> onExtraCallbackWithResult = getUnmodifiedPayloads.class;
        private final String onExtraCallback = "ManualGestureHandler";

        @Override // o.addChangePayload.IAuthTabCallback
        public Class<getUnmodifiedPayloads> onWarmupCompleted() {
            return this.onExtraCallbackWithResult;
        }

        @Override // o.addChangePayload.IAuthTabCallback
        public String IAuthTabCallback() {
            return this.onExtraCallback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.addChangePayload.IAuthTabCallback
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public getUnmodifiedPayloads IAuthTabCallback(@Nullable Context context) {
            return new getUnmodifiedPayloads();
        }

        @Override // o.addChangePayload.IAuthTabCallback
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public offsetPosition onExtraCallback(@NotNull getUnmodifiedPayloads getunmodifiedpayloads) {
            Intrinsics.checkNotNullParameter(getunmodifiedpayloads, "");
            return new offsetPosition(getunmodifiedpayloads);
        }
    }
}
