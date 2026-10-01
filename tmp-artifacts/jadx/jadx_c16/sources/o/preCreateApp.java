package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class preCreateApp {
    public /* synthetic */ preCreateApp(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class onWarmupCompleted extends preCreateApp {
        public static final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        static {
            int i = onExtraCallbackWithResult + 93;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        private onWarmupCompleted() {
            super(null);
        }
    }

    private preCreateApp() {
    }

    public static final class onExtraCallbackWithResult extends preCreateApp {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        public static final onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();

        static {
            int i = onExtraCallback + 3;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        private onExtraCallbackWithResult() {
            super(null);
        }
    }
}
