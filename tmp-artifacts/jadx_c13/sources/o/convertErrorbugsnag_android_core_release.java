package o;

import im.toss.websocket.network.model.TossWebSocketMessageDto;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class convertErrorbugsnag_android_core_release {
    public /* synthetic */ convertErrorbugsnag_android_core_release(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class onExtraCallbackWithResult extends convertErrorbugsnag_android_core_release {
        public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        static {
            int i = onNavigationEvent + 27;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        private onExtraCallbackWithResult() {
            super(null);
        }
    }

    private convertErrorbugsnag_android_core_release() {
    }

    public static final class onExtraCallback extends convertErrorbugsnag_android_core_release {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final String onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (this != obj) {
                return (obj instanceof onExtraCallback) && Intrinsics.areEqual(this.onNavigationEvent, ((onExtraCallback) obj).onNavigationEvent);
            }
            int i5 = i3 + 75;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onNavigationEvent.hashCode();
            int i4 = onExtraCallback + 89;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Closing(code=" + this.onNavigationEvent + ")";
            int i2 = onExtraCallback + 5;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.onNavigationEvent = str;
        }

        public final String onExtraCallback() {
            String str;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 49;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                str = this.onNavigationEvent;
                int i4 = 13 / 0;
            } else {
                str = this.onNavigationEvent;
            }
            int i5 = i2 + 55;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 43 / 0;
            }
            return str;
        }
    }

    public static final class onNavigationEvent extends convertErrorbugsnag_android_core_release {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private final Throwable IAuthTabCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i2 = onExtraCallback + 45;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.IAuthTabCallback, ((onNavigationEvent) obj).IAuthTabCallback)) {
                return true;
            }
            int i4 = onExtraCallback + 23;
            onNavigationEvent = i4 % 128;
            return i4 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.IAuthTabCallback.hashCode();
            int i4 = onNavigationEvent + 23;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Failure(throwable=" + this.IAuthTabCallback + ")";
            int i2 = onNavigationEvent + 25;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(@NotNull Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.IAuthTabCallback = th;
        }

        public final Throwable onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.IAuthTabCallback;
            }
            throw null;
        }
    }

    public static final class IAuthTabCallback extends convertErrorbugsnag_android_core_release {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final TossWebSocketMessageDto onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onNavigationEvent, ((IAuthTabCallback) obj).onNavigationEvent)) {
                return true;
            }
            int i4 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                this.onNavigationEvent.hashCode();
                throw null;
            }
            int iHashCode = this.onNavigationEvent.hashCode();
            int i3 = onExtraCallbackWithResult + 35;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Message(message=" + this.onNavigationEvent + ")";
            int i2 = IAuthTabCallback + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull TossWebSocketMessageDto tossWebSocketMessageDto) {
            super(null);
            Intrinsics.checkNotNullParameter(tossWebSocketMessageDto, "");
            this.onNavigationEvent = tossWebSocketMessageDto;
        }

        public final TossWebSocketMessageDto onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            TossWebSocketMessageDto tossWebSocketMessageDto = this.onNavigationEvent;
            int i5 = i2 + 41;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return tossWebSocketMessageDto;
            }
            throw null;
        }
    }
}
