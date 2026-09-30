package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface OverlayControllerImplExternalSyntheticLambda0 {

    public static final class IAuthTabCallback implements OverlayControllerImplExternalSyntheticLambda0 {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final JsonObject onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                int i4 = i3 + 47;
                onWarmupCompleted = i4 % 128;
                return i4 % 2 == 0;
            }
            if (obj instanceof IAuthTabCallback) {
                return Intrinsics.areEqual(this.onNavigationEvent, ((IAuthTabCallback) obj).onNavigationEvent);
            }
            int i5 = i3 + 109;
            onWarmupCompleted = i5 % 128;
            boolean z = i5 % 2 != 0;
            int i6 = i3 + 7;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return z;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                this.onNavigationEvent.hashCode();
                throw null;
            }
            int iHashCode = this.onNavigationEvent.hashCode();
            int i3 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Success(json=" + this.onNavigationEvent + ")";
            int i2 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public IAuthTabCallback(@NotNull JsonObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "");
            this.onNavigationEvent = jsonObject;
        }

        public final JsonObject onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            JsonObject jsonObject = this.onNavigationEvent;
            int i5 = i3 + 123;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return jsonObject;
        }
    }

    public static final class onExtraCallback implements OverlayControllerImplExternalSyntheticLambda0 {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final String IAuthTabCallback;
        private final String onExtraCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                int i5 = i3 + 69;
                onExtraCallbackWithResult = i5 % 128;
                return i5 % 2 == 0;
            }
            if (obj instanceof onExtraCallback) {
                onExtraCallback onextracallback = (onExtraCallback) obj;
                if (!(!Intrinsics.areEqual(this.IAuthTabCallback, onextracallback.IAuthTabCallback))) {
                    if (Intrinsics.areEqual(this.onExtraCallback, onextracallback.onExtraCallback)) {
                        return true;
                    }
                    int i6 = onExtraCallbackWithResult + 49;
                    int i7 = i6 % 128;
                    onWarmupCompleted = i7;
                    int i8 = i6 % 2;
                    int i9 = i7 + 19;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    return false;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (this.IAuthTabCallback.hashCode() % 13) % this.onExtraCallback.hashCode() : (this.IAuthTabCallback.hashCode() * 31) + this.onExtraCallback.hashCode();
            int i3 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Error(code=" + this.IAuthTabCallback + ", message=" + this.onExtraCallback + ")";
            int i2 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallback(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.IAuthTabCallback = str;
            this.onExtraCallback = str2;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 25;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i2 + 5;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallback;
            }
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements OverlayControllerImplExternalSyntheticLambda0 {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        public static final onExtraCallbackWithResult onNavigationEvent = new onExtraCallbackWithResult();
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            int i4 = i3 + 107;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 65;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 55;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return 916047029;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return "Unknown";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onExtraCallbackWithResult() {
        }
    }
}
