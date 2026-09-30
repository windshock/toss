package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class isFeatureFlagEnabled {
    public /* synthetic */ isFeatureFlagEnabled(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String onExtraCallback();

    private isFeatureFlagEnabled() {
    }

    public static final class IAuthTabCallback extends isFeatureFlagEnabled {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private final String onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 75;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i4 = IAuthTabCallback + 37;
                onNavigationEvent = i4 % 128;
                return i4 % 2 == 0;
            }
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, ((IAuthTabCallback) obj).onExtraCallbackWithResult)) {
                return true;
            }
            int i5 = IAuthTabCallback + 87;
            onNavigationEvent = i5 % 128;
            return i5 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onExtraCallbackWithResult.hashCode();
            if (i3 == 0) {
                int i4 = 28 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Number(text=" + this.onExtraCallbackWithResult + ")";
            int i2 = IAuthTabCallback + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult = str;
        }

        @Override // o.isFeatureFlagEnabled
        public String onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String str = this.onExtraCallbackWithResult;
            if (i3 == 0) {
                int i4 = 5 / 0;
            }
            return str;
        }
    }

    public static final class onExtraCallback extends isFeatureFlagEnabled {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 65;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (obj instanceof onExtraCallback) {
                return Intrinsics.areEqual(this.onWarmupCompleted, ((onExtraCallback) obj).onWarmupCompleted);
            }
            int i4 = IAuthTabCallback + 109;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onWarmupCompleted.hashCode();
            int i4 = IAuthTabCallback + 77;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Space(text=" + this.onWarmupCompleted + ")";
            int i2 = onExtraCallback + 45;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 78 / 0;
            }
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted = str;
        }

        @Override // o.isFeatureFlagEnabled
        public String onExtraCallback() {
            String str;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                str = this.onWarmupCompleted;
                int i4 = 39 / 0;
            } else {
                str = this.onWarmupCompleted;
            }
            int i5 = i3 + 67;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    public static final class onWarmupCompleted extends isFeatureFlagEnabled {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final String onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 69;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this != obj) {
                return (obj instanceof onWarmupCompleted) && Intrinsics.areEqual(this.onNavigationEvent, ((onWarmupCompleted) obj).onNavigationEvent);
            }
            int i4 = i2 + 89;
            onWarmupCompleted = i4 % 128;
            return i4 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                this.onNavigationEvent.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = this.onNavigationEvent.hashCode();
            int i3 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Delete(text=" + this.onNavigationEvent + ")";
            int i2 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 31 / 0;
            }
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.onNavigationEvent = str;
        }

        @Override // o.isFeatureFlagEnabled
        public String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            String str = this.onNavigationEvent;
            int i5 = i3 + 79;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }
    }
}
