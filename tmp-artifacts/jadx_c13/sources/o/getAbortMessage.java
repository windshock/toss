package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getAbortMessage {
    private final long IAuthTabCallback;
    private final long asInterface;
    private final long onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static final getAbortMessage onWarmupCompleted = new getAbortMessage(4611686018427387903L, true);
    private static final getAbortMessage onNavigationEvent = new getAbortMessage(LongCompanionObject.MAX_VALUE, false);

    private getAbortMessage(long j, boolean z) {
        this.IAuthTabCallback = j;
        this.onExtraCallbackWithResult = z;
        this.asInterface = j / 10;
        this.onExtraCallback = j % 10;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final getAbortMessage onNavigationEvent() {
            return getAbortMessage.onWarmupCompleted;
        }

        public final getAbortMessage onWarmupCompleted() {
            return getAbortMessage.onNavigationEvent;
        }
    }
}
