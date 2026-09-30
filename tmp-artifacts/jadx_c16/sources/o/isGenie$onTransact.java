package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isGenie$onTransact implements isGenie {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final onExtraCallback onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 101;
            onExtraCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof isGenie$onTransact)) {
            int i3 = onExtraCallback + 59;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, ((isGenie$onTransact) obj).onExtraCallbackWithResult)) {
            return true;
        }
        int i5 = onExtraCallback + 73;
        IAuthTabCallback = i5 % 128;
        return i5 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        int i4 = onExtraCallback + 51;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OtherAsset(startDestination=" + this.onExtraCallbackWithResult + ")";
        int i2 = onExtraCallback + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public isGenie$onTransact(@NotNull onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.onExtraCallbackWithResult = onextracallback;
    }

    public onExtraCallback onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        onExtraCallback onextracallback = this.onExtraCallbackWithResult;
        int i4 = i3 + 35;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return onextracallback;
        }
        throw null;
    }

    public interface onExtraCallback extends getPhoneModel {

        public static final class onExtraCallbackWithResult implements onExtraCallback {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onTransact = 1;
            private static int onWarmupCompleted;
            public static final onExtraCallbackWithResult onNavigationEvent = new onExtraCallbackWithResult();
            private static final String onExtraCallbackWithResult = "hide";

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onTransact;
                int i3 = i2 + 21;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (this == obj || (obj instanceof onExtraCallbackWithResult)) {
                    return true;
                }
                int i5 = i2 + 51;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 37;
                int i3 = i2 % 128;
                onTransact = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 37;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return -396772417;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onTransact + 35;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 83;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return "Hide";
            }

            private onExtraCallbackWithResult() {
            }

            static {
                int i = onExtraCallback + 97;
                IAuthTabCallback = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 31;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                String str = onExtraCallbackWithResult;
                if (i3 == 0) {
                    int i4 = 53 / 0;
                }
                return str;
            }
        }

        public static final class IAuthTabCallback implements onExtraCallback {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 0;
            private static int onTransact = 1;
            private static int onWarmupCompleted = 1;
            public static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback();
            private static final String onNavigationEvent = "delete";

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onTransact;
                int i3 = i2 + 17;
                int i4 = i3 % 128;
                onExtraCallbackWithResult = i4;
                int i5 = i3 % 2;
                if (this == obj) {
                    int i6 = i4 + 31;
                    onTransact = i6 % 128;
                    if (i6 % 2 != 0) {
                        return true;
                    }
                    throw null;
                }
                if (obj instanceof IAuthTabCallback) {
                    return true;
                }
                int i7 = i2 + 63;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onTransact + 71;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return 835827944;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 115;
                int i3 = i2 % 128;
                onTransact = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 73;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return "Delete";
            }

            private IAuthTabCallback() {
            }

            static {
                int i = onExtraCallback + 41;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onTransact + 37;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                String str = onNavigationEvent;
                if (i3 != 0) {
                    int i4 = 53 / 0;
                }
                return str;
            }
        }
    }
}
