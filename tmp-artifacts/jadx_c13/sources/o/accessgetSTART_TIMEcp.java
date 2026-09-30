package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface accessgetSTART_TIMEcp {
    public static final onNavigationEvent Companion = onNavigationEvent.onExtraCallbackWithResult;

    public static final class onExtraCallbackWithResult implements accessgetSTART_TIMEcp {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();

        static {
            int i = onNavigationEvent + 111;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                int i2 = 28 / 0;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                int i5 = i3 + 39;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 70 / 0;
                }
                return true;
            }
            if (obj instanceof onExtraCallbackWithResult) {
                return true;
            }
            int i7 = i3 + 5;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 67;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 11;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 68 / 0;
            }
            return 1379749649;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 97;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return "BackPress";
        }

        private onExtraCallbackWithResult() {
        }
    }

    public static final class onExtraCallback implements accessgetSTART_TIMEcp {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        public static final onExtraCallback onNavigationEvent = new onExtraCallback();
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallback + 69;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 31;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i4 = onWarmupCompleted + 93;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = onWarmupCompleted + 115;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 54 / 0;
            }
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 41;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return 1814864133;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 59;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 109;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return "OutsideTouch";
        }

        private onExtraCallback() {
        }
    }

    public static final class onWarmupCompleted implements accessgetSTART_TIMEcp {
        public static final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallbackWithResult + 53;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj || !(!(obj instanceof onWarmupCompleted))) {
                return true;
            }
            int i4 = i3 + 111;
            int i5 = i4 % 128;
            onWarmupCompleted = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 73;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 85 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 25;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return -651497313;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 119;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 74 / 0;
            }
            int i5 = i2 + 123;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 86 / 0;
            }
            return "Drag";
        }

        private onWarmupCompleted() {
        }
    }

    public static final class IAuthTabCallback<T> implements accessgetSTART_TIMEcp {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private final T IAuthTabCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i2 = onNavigationEvent + 13;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            if (Intrinsics.areEqual(this.IAuthTabCallback, ((IAuthTabCallback) obj).IAuthTabCallback)) {
                int i3 = onExtraCallbackWithResult + 97;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
            int i5 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.IAuthTabCallback.hashCode();
            int i4 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "UserDefined(payloads=" + this.IAuthTabCallback + ")";
            int i2 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public IAuthTabCallback(@NotNull T t) {
            Intrinsics.checkNotNullParameter(t, "");
            this.IAuthTabCallback = t;
        }
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        static final /* synthetic */ onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();
        private static final IAuthTabCallback<Unit> onWarmupCompleted = new IAuthTabCallback<>(Unit.INSTANCE);

        private onNavigationEvent() {
        }

        static {
            int i = onExtraCallback + 57;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public final IAuthTabCallback<Unit> onExtraCallback() {
            IAuthTabCallback<Unit> iAuthTabCallback;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 43;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                iAuthTabCallback = onWarmupCompleted;
                int i4 = 2 / 0;
            } else {
                iAuthTabCallback = onWarmupCompleted;
            }
            int i5 = i2 + 51;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return iAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
