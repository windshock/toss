package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isGenie$onExtraCallback implements isGenie {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final onExtraCallback IAuthTabCallback;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof isGenie$onExtraCallback)) {
            int i4 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, ((isGenie$onExtraCallback) obj).IAuthTabCallback)) {
            return true;
        }
        int i5 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback onextracallback = this.IAuthTabCallback;
        if (i3 == 0) {
            return onextracallback.hashCode();
        }
        onextracallback.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Loan(startDestination=" + this.IAuthTabCallback + ")";
        int i2 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public isGenie$onExtraCallback(@NotNull onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.IAuthTabCallback = onextracallback;
    }

    public onExtraCallback onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 121;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback onextracallback = this.IAuthTabCallback;
        int i5 = i2 + 101;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return onextracallback;
    }

    public interface onExtraCallback extends getPhoneModel {

        public static final class onNavigationEvent implements onExtraCallback {
            private static int IAuthTabCallback = 1;
            private static int asBinder = 1;
            public static final onNavigationEvent onExtraCallback = new onNavigationEvent();
            private static final String onExtraCallbackWithResult = "hide";
            private static int onNavigationEvent;
            private static int onWarmupCompleted;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onWarmupCompleted + 121;
                    asBinder = i2 % 128;
                    return i2 % 2 != 0;
                }
                if (obj instanceof onNavigationEvent) {
                    return true;
                }
                int i3 = onWarmupCompleted + 9;
                asBinder = i3 % 128;
                return i3 % 2 == 0;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 49;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    return 689450991;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 63;
                int i3 = i2 % 128;
                asBinder = i3;
                Object obj = null;
                if (i2 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i4 = i3 + 93;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return "Hide";
                }
                obj.hashCode();
                throw null;
            }

            private onNavigationEvent() {
            }

            static {
                int i = onNavigationEvent + 87;
                IAuthTabCallback = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 23;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                String str = onExtraCallbackWithResult;
                int i5 = i2 + 73;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }
        }

        public static final class onWarmupCompleted implements onExtraCallback {
            private static int IAuthTabCallback = 0;
            private static int IAuthTabCallbackStub = 1;
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();
            private static final String onExtraCallbackWithResult = "delete";

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 15;
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (this == obj || (obj instanceof onWarmupCompleted)) {
                    return true;
                }
                int i4 = i2 + 49;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 35;
                int i3 = i2 % 128;
                IAuthTabCallbackStub = i3;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = i3 + 97;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return 1019470104;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 47;
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i4 = i2 + 103;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 58 / 0;
                }
                return "Delete";
            }

            private onWarmupCompleted() {
            }

            static {
                int i = onNavigationEvent + 29;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 85;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                String str = onExtraCallbackWithResult;
                int i5 = i2 + 125;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 != 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }
}
