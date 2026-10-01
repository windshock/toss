package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class uu extends vbt {
    public /* synthetic */ uu(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private uu() {
        super(null);
    }

    public static final class onExtraCallbackWithResult extends uu {
        public static final onExtraCallbackWithResult onNavigationEvent = new onExtraCallbackWithResult();

        private onExtraCallbackWithResult() {
            super(null);
        }
    }

    public static final class onNavigationEvent extends uu {
        public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();

        private onNavigationEvent() {
            super(null);
        }
    }

    public static final class onWarmupCompleted extends uu {
        public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

        private onWarmupCompleted() {
            super(null);
        }
    }

    public static final class onExtraCallback extends uu {
        public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();

        private onExtraCallback() {
            super(null);
        }
    }
}
