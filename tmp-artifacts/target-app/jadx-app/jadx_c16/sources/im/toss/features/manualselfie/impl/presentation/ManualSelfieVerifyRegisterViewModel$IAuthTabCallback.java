package im.toss.features.manualselfie.impl.presentation;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class ManualSelfieVerifyRegisterViewModel$IAuthTabCallback {
    public /* synthetic */ ManualSelfieVerifyRegisterViewModel$IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class onWarmupCompleted extends ManualSelfieVerifyRegisterViewModel$IAuthTabCallback {
        private static int onExtraCallback = 1;
        public static final onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted();
        private static int onNavigationEvent;

        static {
            int i = onNavigationEvent + 107;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        private onWarmupCompleted() {
            super(null);
        }
    }

    private ManualSelfieVerifyRegisterViewModel$IAuthTabCallback() {
    }

    public static final class onNavigationEvent extends ManualSelfieVerifyRegisterViewModel$IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private final String onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent) || !Intrinsics.areEqual(this.onNavigationEvent, ((onNavigationEvent) obj).onNavigationEvent)) {
                return false;
            }
            int i4 = onWarmupCompleted + 73;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onNavigationEvent.hashCode();
            int i4 = IAuthTabCallback + 111;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "NavigateErrorPage(videoCallUrl=" + this.onNavigationEvent + ")";
            int i2 = IAuthTabCallback + 97;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.onNavigationEvent = str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = this.onNavigationEvent;
            if (i3 != 0) {
                int i4 = 51 / 0;
            }
            return str;
        }
    }
}
