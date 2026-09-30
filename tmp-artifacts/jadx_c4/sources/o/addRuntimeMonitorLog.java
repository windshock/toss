package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class addRuntimeMonitorLog extends Throwable {
    public /* synthetic */ addRuntimeMonitorLog(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private addRuntimeMonitorLog(String str) {
        super(str);
    }

    public static final class IAuthTabCallback extends addRuntimeMonitorLog {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        /* JADX WARN: Illegal instructions before constructor call */
        public IAuthTabCallback() {
            String str = null;
            this(str, 1, str);
        }

        public IAuthTabCallback(@Nullable String str) {
            super(str, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IAuthTabCallback(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 63;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 11;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
                str = null;
            }
            this(str);
        }
    }

    public static final class onNavigationEvent extends Throwable {
        private static int onExtraCallbackWithResult = 1;
        public static final onNavigationEvent onNavigationEvent = new onNavigationEvent();
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        private onNavigationEvent() {
        }
    }

    public static final class onExtraCallback extends Throwable {
        public static final onExtraCallback IAuthTabCallback = new onExtraCallback();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        static {
            int i = onExtraCallbackWithResult + 97;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 57 / 0;
            }
        }

        private onExtraCallback() {
        }
    }
}
