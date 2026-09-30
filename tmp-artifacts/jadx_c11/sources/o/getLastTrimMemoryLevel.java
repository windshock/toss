package o;

import android.app.Activity;
import android.content.Context;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface getLastTrimMemoryLevel {
    public static final onNavigationEvent Companion = onNavigationEvent.onExtraCallback;

    void IAuthTabCallback(int i, @NotNull String[] strArr, @NotNull int[] iArr);

    boolean IAuthTabCallback();

    void onExtraCallback(@NotNull Activity activity, @NotNull String str, @NotNull Runnable runnable);

    boolean onExtraCallbackWithResult();

    boolean onWarmupCompleted();

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        static final /* synthetic */ onNavigationEvent onExtraCallback = new onNavigationEvent();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 21;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        private onNavigationEvent() {
        }

        public final String onExtraCallbackWithResult(@NotNull Context context, @NotNull String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (ContextCompat.checkSelfPermission(context, str) != 0) {
                int i2 = IAuthTabCallback + 17;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 44 / 0;
                }
                return "denied";
            }
            int i4 = onExtraCallbackWithResult + 87;
            int i5 = i4 % 128;
            IAuthTabCallback = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 27;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 41 / 0;
            }
            return "authorized";
        }

        public final getLastTrimMemoryLevel onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Response response = Response.onNavigationEvent;
            getLastTrimMemoryLevel message = ((getTotalBackgroundDurationMillis) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), getTotalBackgroundDurationMillis.class)).setMessage();
            int i4 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return message;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallback {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final String onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i5 = i3 + 103;
                onWarmupCompleted = i5 % 128;
                return i5 % 2 == 0;
            }
            if (Intrinsics.areEqual(this.onNavigationEvent, ((onExtraCallback) obj).onNavigationEvent)) {
                return true;
            }
            int i6 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onNavigationEvent.hashCode();
            int i4 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 0;
            }
            return iHashCode;
        }

        public onExtraCallback(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onNavigationEvent = str;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 5;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onNavigationEvent;
            int i5 = i2 + 109;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "[PermissionDenied " + Integer.toHexString(System.identityHashCode(this)) + "] (permission = " + this.onNavigationEvent + ")";
            int i2 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final boolean onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            if (this.onNavigationEvent != ((IAuthTabCallback) obj).onNavigationEvent) {
                int i2 = onExtraCallbackWithResult + 85;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Boolean.hashCode(this.onNavigationEvent);
            int i4 = onExtraCallbackWithResult + 43;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public IAuthTabCallback(boolean z) {
            this.onNavigationEvent = z;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "[PermissionUpdated " + Integer.toHexString(System.identityHashCode(this)) + "] (hasReadPhoneStatePermission = " + this.onNavigationEvent + ")";
            int i2 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
