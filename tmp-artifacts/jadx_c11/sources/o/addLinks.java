package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface addLinks {

    public interface IAuthTabCallback {

        public static final class onExtraCallback implements IAuthTabCallback {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            public static final onExtraCallback onWarmupCompleted = new onExtraCallback();

            static {
                int i = onNavigationEvent + 85;
                onExtraCallback = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (obj instanceof onExtraCallback) {
                    int i2 = IAuthTabCallback + 11;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                int i4 = IAuthTabCallback + 53;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 13;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 83;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return -1053116123;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 117;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                int i4 = i2 + 71;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return "BottomSheet";
            }

            private onExtraCallback() {
            }
        }

        public static final class onNavigationEvent implements IAuthTabCallback {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            static {
                int i = IAuthTabCallback + 119;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 55;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (this != obj) {
                    return !((obj instanceof onNavigationEvent) ^ true);
                }
                int i5 = i2 + 99;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 81;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return -1091302355;
                }
                int i3 = 88 / 0;
                return -1091302355;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 61;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                int i4 = i2 + 33;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 53 / 0;
                }
                return "FullPage";
            }

            private onNavigationEvent() {
            }
        }

        /* renamed from: o.addLinks$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        public static final class C0010IAuthTabCallback implements IAuthTabCallback {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            public static final C0010IAuthTabCallback onExtraCallbackWithResult = new C0010IAuthTabCallback();
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = onExtraCallback + 25;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onWarmupCompleted + 105;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (obj instanceof C0010IAuthTabCallback) {
                    return true;
                }
                int i4 = onWarmupCompleted + 9;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 5;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = i3 + 121;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return 797750711;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 47;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 19;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return "Payment";
                }
                throw null;
            }

            private C0010IAuthTabCallback() {
            }
        }

        public static final class onWarmupCompleted implements IAuthTabCallback {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;
            private final long IAuthTabCallback;
            private final boolean onNavigationEvent;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 15;
                int i4 = i3 % 128;
                onExtraCallback = i4;
                if (i3 % 2 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (this == obj) {
                    int i5 = i4 + 67;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
                if (!(obj instanceof onWarmupCompleted)) {
                    int i7 = i2 + 67;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return false;
                }
                onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
                if (this.onNavigationEvent != onwarmupcompleted.onNavigationEvent) {
                    return false;
                }
                if (this.IAuthTabCallback == onwarmupcompleted.IAuthTabCallback) {
                    return true;
                }
                int i9 = i2 + 61;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 19;
                onWarmupCompleted = i2 % 128;
                int iHashCode = i2 % 2 == 0 ? (Boolean.hashCode(this.onNavigationEvent) % 34) % Long.hashCode(this.IAuthTabCallback) : (Boolean.hashCode(this.onNavigationEvent) * 31) + Long.hashCode(this.IAuthTabCallback);
                int i3 = onExtraCallback + 123;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    return iHashCode;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Overlay(cancelableOnTouchOutside=" + this.onNavigationEvent + ", delay=" + this.IAuthTabCallback + ")";
                int i2 = onWarmupCompleted + 103;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public onWarmupCompleted(boolean z, long j) {
                this.onNavigationEvent = z;
                this.IAuthTabCallback = j;
            }
        }
    }
}
