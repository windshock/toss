package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class r8lambda0grt42NLozkvlz2kicXj5Z0ej8U$onExtraCallbackWithResult {
    public /* synthetic */ r8lambda0grt42NLozkvlz2kicXj5Z0ej8U$onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private r8lambda0grt42NLozkvlz2kicXj5Z0ej8U$onExtraCallbackWithResult() {
    }

    public static final class onNavigationEvent extends r8lambda0grt42NLozkvlz2kicXj5Z0ej8U$onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 77;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 22 / 0;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            if (this != obj) {
                return obj instanceof onNavigationEvent;
            }
            int i5 = i3 + 69;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 39;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 99 / 0;
            }
            return -402091649;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 117;
            IAuthTabCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 73;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return "Default";
            }
            obj.hashCode();
            throw null;
        }

        private onNavigationEvent() {
            super(null);
        }
    }
}
