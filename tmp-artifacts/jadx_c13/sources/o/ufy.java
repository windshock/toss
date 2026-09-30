package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class ufy extends vbt {
    public /* synthetic */ ufy(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ufy() {
        super(null);
    }

    public static final class onWarmupCompleted extends ufy {
        public static final onWarmupCompleted onNavigationEvent = new onWarmupCompleted();

        private onWarmupCompleted() {
            super(null);
        }
    }

    public static final class onNavigationEvent extends ufy {
        public static final onNavigationEvent onExtraCallback = new onNavigationEvent();

        private onNavigationEvent() {
            super(null);
        }
    }
}
