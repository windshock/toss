package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class AppManagerImpl1 {
    public /* synthetic */ AppManagerImpl1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class onNavigationEvent extends AppManagerImpl1 {
        public static final onNavigationEvent onExtraCallback = new onNavigationEvent();
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                int i2 = 34 / 0;
            }
        }

        private onNavigationEvent() {
            super(null);
        }
    }

    private AppManagerImpl1() {
    }

    public static final class IAuthTabCallback extends AppManagerImpl1 {
        private static int IAuthTabCallback = 1;
        public static final IAuthTabCallback onExtraCallback = new IAuthTabCallback();
        private static int onNavigationEvent;

        static {
            int i = onNavigationEvent + 37;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        private IAuthTabCallback() {
            super(null);
        }
    }
}
