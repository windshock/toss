package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isGenie$onExtraCallbackWithResult implements isGenie {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final onExtraCallbackWithResult onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof isGenie$onExtraCallbackWithResult)) {
            int i4 = IAuthTabCallback + 61;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 76 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, ((isGenie$onExtraCallbackWithResult) obj).onWarmupCompleted)) {
            return false;
        }
        int i6 = IAuthTabCallback + 117;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onWarmupCompleted.hashCode();
        int i4 = onExtraCallback + 1;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Card(startDestination=" + this.onWarmupCompleted + ")";
        int i2 = IAuthTabCallback + 5;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
        }
        return str;
    }

    public isGenie$onExtraCallbackWithResult(@NotNull onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.onWarmupCompleted = onextracallbackwithresult;
    }

    public onExtraCallbackWithResult onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public interface onExtraCallbackWithResult extends getPhoneModel {

        public static final class IAuthTabCallback implements onExtraCallbackWithResult {
            private static int IAuthTabCallback = 1;
            private static int IAuthTabCallbackDefault = 1;
            private static int onExtraCallback;
            public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();
            private static final String onNavigationEvent = "hide";
            private static int onWarmupCompleted;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 45;
                int i3 = i2 % 128;
                IAuthTabCallbackDefault = i3;
                if (i2 % 2 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (this == obj || (obj instanceof IAuthTabCallback)) {
                    return true;
                }
                int i4 = i3 + 47;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 15;
                int i3 = i2 % 128;
                IAuthTabCallbackDefault = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                int i4 = i3 + 107;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return -553730545;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 95;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 79;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return "Hide";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private IAuthTabCallback() {
            }

            static {
                int i = onWarmupCompleted + 87;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 69;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                String str = onNavigationEvent;
                int i5 = i2 + 73;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 94 / 0;
                }
                return str;
            }
        }

        /* renamed from: o.isGenie$onExtraCallbackWithResult$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final class C0002onExtraCallbackWithResult implements onExtraCallbackWithResult {
            private static int IAuthTabCallback = 1;
            private static int IAuthTabCallbackDefault = 1;
            public static final C0002onExtraCallbackWithResult onExtraCallback = new C0002onExtraCallbackWithResult();
            private static final String onExtraCallbackWithResult = "delete";
            private static int onNavigationEvent;
            private static int onWarmupCompleted;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 113;
                int i3 = i2 % 128;
                IAuthTabCallbackDefault = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                if (this == obj || (obj instanceof C0002onExtraCallbackWithResult)) {
                    return true;
                }
                int i4 = i3 + 11;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 3;
                int i3 = i2 % 128;
                IAuthTabCallbackDefault = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 119;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return 322922296;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault;
                int i3 = i2 + 5;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 45 / 0;
                }
                int i5 = i2 + 17;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return "Delete";
            }

            private C0002onExtraCallbackWithResult() {
            }

            static {
                int i = onNavigationEvent + 25;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault;
                int i3 = i2 + 7;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                String str = onExtraCallbackWithResult;
                int i5 = i2 + 5;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }
}
