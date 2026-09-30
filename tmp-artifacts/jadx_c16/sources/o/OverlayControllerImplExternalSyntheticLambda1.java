package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface OverlayControllerImplExternalSyntheticLambda1 {

    public static final class onExtraCallback implements OverlayControllerImplExternalSyntheticLambda1 {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, ((onExtraCallback) obj).onWarmupCompleted)) {
                int i2 = onExtraCallback + 117;
                IAuthTabCallback = i2 % 128;
                return i2 % 2 == 0;
            }
            int i3 = onExtraCallback + 125;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                this.onWarmupCompleted.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = this.onWarmupCompleted.hashCode();
            int i3 = IAuthTabCallback + 91;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Success(key=" + this.onWarmupCompleted + ")";
            int i2 = IAuthTabCallback + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallback(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted = str;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 23;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i2 + 65;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }

    public static final class IAuthTabCallback implements OverlayControllerImplExternalSyntheticLambda1 {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final String onExtraCallback;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i2 = onNavigationEvent + 123;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (!Intrinsics.areEqual(this.onWarmupCompleted, iAuthTabCallback.onWarmupCompleted)) {
                int i4 = onNavigationEvent + 9;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallback, iAuthTabCallback.onExtraCallback)) {
                return true;
            }
            int i6 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i6 % 128;
            return i6 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.onWarmupCompleted.hashCode() * 31) + this.onExtraCallback.hashCode();
            int i4 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 76 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Error(code=" + this.onWarmupCompleted + ", message=" + this.onExtraCallback + ")";
            int i2 = onExtraCallbackWithResult + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public IAuthTabCallback(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onWarmupCompleted = str;
            this.onExtraCallback = str2;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 71;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallback;
            int i5 = i2 + 79;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 121;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i2 + 97;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }
    }

    public static final class onWarmupCompleted implements OverlayControllerImplExternalSyntheticLambda1 {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

        static {
            int i = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                int i2 = 32 / 0;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 7;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            int i4 = onNavigationEvent + 33;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 45;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return -913300030;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return "Unknown";
            }
            throw null;
        }

        private onWarmupCompleted() {
        }
    }
}
