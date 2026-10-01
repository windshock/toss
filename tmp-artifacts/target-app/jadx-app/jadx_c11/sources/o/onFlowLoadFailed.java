package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class onFlowLoadFailed {
    public /* synthetic */ onFlowLoadFailed(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class IAuthTabCallback extends onFlowLoadFailed {
        private static int IAuthTabCallback = 0;
        public static final IAuthTabCallback onExtraCallback = new IAuthTabCallback();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = IAuthTabCallback + 59;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 3;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj || (obj instanceof IAuthTabCallback)) {
                return true;
            }
            int i5 = i2 + 41;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i2 + 123;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 11;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 12 / 0;
            }
            int i5 = i2 + 9;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return -484927427;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return "Maintenance";
            }
            int i3 = 8 / 0;
            return "Maintenance";
        }

        private IAuthTabCallback() {
            super(null);
        }
    }

    private onFlowLoadFailed() {
    }

    public static final class onExtraCallback extends onFlowLoadFailed {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private final Throwable onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 39;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 75;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i7 = i2 + 19;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, ((onExtraCallback) obj).onExtraCallbackWithResult)) {
                return true;
            }
            int i9 = onNavigationEvent + 103;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onExtraCallbackWithResult.hashCode();
            int i4 = onExtraCallback + 103;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Network(cause=" + this.onExtraCallbackWithResult + ")";
            int i2 = onNavigationEvent + 13;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.onExtraCallbackWithResult = th;
        }
    }

    public static final class onWarmupCompleted extends onFlowLoadFailed {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private final Throwable onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 7;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onWarmupCompleted) || !Intrinsics.areEqual(this.onWarmupCompleted, ((onWarmupCompleted) obj).onWarmupCompleted)) {
                return false;
            }
            int i4 = onExtraCallback + 113;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                iHashCode = this.onWarmupCompleted.hashCode();
                int i3 = 85 / 0;
            } else {
                iHashCode = this.onWarmupCompleted.hashCode();
            }
            int i4 = onExtraCallback + 95;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Unknown(cause=" + this.onWarmupCompleted + ")";
            int i2 = onNavigationEvent + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.onWarmupCompleted = th;
        }
    }
}
