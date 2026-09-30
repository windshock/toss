package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface AFh1zSDK {

    public static final class onExtraCallback implements AFh1zSDK {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onNavigationEvent + 91;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 103;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i4 = onWarmupCompleted + 87;
                onExtraCallback = i4 % 128;
                return i4 % 2 == 0;
            }
            int i5 = onExtraCallback + 61;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 93;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 73 / 0;
            }
            return -558493029;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return "Loading";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onExtraCallback() {
        }
    }

    public static final class onExtraCallbackWithResult implements AFh1zSDK {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final int IAuthTabCallback;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 87;
                onNavigationEvent = i2 % 128;
                return i2 % 2 == 0;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (this.IAuthTabCallback != onextracallbackwithresult.IAuthTabCallback) {
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback)) {
                return !(Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallbackwithresult.onExtraCallbackWithResult) ^ true);
            }
            int i3 = onNavigationEvent + 103;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((Integer.hashCode(this.IAuthTabCallback) * 31) + this.onExtraCallback.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode();
            int i4 = onNavigationEvent + 101;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Error(errorCode=" + this.IAuthTabCallback + ", description=" + this.onExtraCallback + ", failingUrl=" + this.onExtraCallbackWithResult + ")";
            int i2 = onNavigationEvent + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallbackWithResult(int i, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.IAuthTabCallback = i;
            this.onExtraCallback = str;
            this.onExtraCallbackWithResult = str2;
        }
    }

    public static final class onNavigationEvent implements AFh1zSDK {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 49;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 9;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj || (obj instanceof onNavigationEvent)) {
                return true;
            }
            int i5 = i2 + 93;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 67;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 47;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return 1532653922;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return "Success";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onNavigationEvent() {
        }
    }
}
