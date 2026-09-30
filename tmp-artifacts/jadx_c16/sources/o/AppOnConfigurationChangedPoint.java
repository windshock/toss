package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class AppOnConfigurationChangedPoint {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String onExtraCallbackWithResult;

    public /* synthetic */ AppOnConfigurationChangedPoint(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private AppOnConfigurationChangedPoint(String str) {
        this.onExtraCallbackWithResult = str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    public static final class onExtraCallbackWithResult extends AppOnConfigurationChangedPoint {
        private static int onExtraCallback = 1;
        public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 53;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 79 / 0;
            }
        }

        private onExtraCallbackWithResult() {
            super("question", null);
        }
    }

    public static final class onWarmupCompleted extends AppOnConfigurationChangedPoint {
        public static final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted();
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        static {
            int i = onExtraCallback + 13;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        private onWarmupCompleted() {
            super("answer", null);
        }
    }

    public static final class IAuthTabCallback extends AppOnConfigurationChangedPoint {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        public static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

        static {
            int i = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        private IAuthTabCallback() {
            super("empty", null);
        }
    }
}
