package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class getFrameworkThreadPoolOptSwitch {
    public /* synthetic */ getFrameworkThreadPoolOptSwitch(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private getFrameworkThreadPoolOptSwitch() {
    }

    public static final class IAuthTabCallback extends getFrameworkThreadPoolOptSwitch {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        public static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

        static {
            int i = IAuthTabCallback + 101;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this != obj) {
                if (!(obj instanceof IAuthTabCallback)) {
                    return false;
                }
                int i2 = onExtraCallbackWithResult + 53;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = onExtraCallbackWithResult + 93;
            int i5 = i4 % 128;
            onNavigationEvent = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 95;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return 594541388;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 43;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 93;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return "ShowCreditProtectionTermBottomSheet";
            }
            throw null;
        }

        private IAuthTabCallback() {
            super(null);
        }
    }
}
