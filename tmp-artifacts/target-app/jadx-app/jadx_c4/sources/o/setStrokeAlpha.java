package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface setStrokeAlpha {

    public static final class onNavigationEvent implements setStrokeAlpha {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private final setFillAlpha onExtraCallback;
        private final boolean onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i2 = IAuthTabCallback + 9;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (!Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback)) {
                return false;
            }
            if (this.onWarmupCompleted == onnavigationevent.onWarmupCompleted) {
                return true;
            }
            int i4 = IAuthTabCallback + 59;
            onNavigationEvent = i4 % 128;
            return i4 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.onExtraCallback.hashCode() * 31) + Boolean.hashCode(this.onWarmupCompleted);
            int i4 = onNavigationEvent + 69;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 89 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Success(state=" + this.onExtraCallback + ", formShown=" + this.onWarmupCompleted + ")";
            int i2 = onNavigationEvent + 25;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onNavigationEvent(@NotNull setFillAlpha setfillalpha, boolean z) {
            Intrinsics.checkNotNullParameter(setfillalpha, "");
            this.onExtraCallback = setfillalpha;
            this.onWarmupCompleted = z;
        }

        public final setFillAlpha onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onWarmupCompleted;
            }
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements setStrokeAlpha {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private final String onExtraCallback;
        private final String onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (!Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent)) {
                int i4 = onWarmupCompleted + 45;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback)) {
                return true;
            }
            int i6 = IAuthTabCallback + 53;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.onNavigationEvent.hashCode() * 31) + this.onExtraCallback.hashCode();
            int i4 = onWarmupCompleted + 75;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Failure(code=" + this.onNavigationEvent + ", message=" + this.onExtraCallback + ")";
            int i2 = onWarmupCompleted + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallbackWithResult(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onNavigationEvent = str;
            this.onExtraCallback = str2;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 57;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.onNavigationEvent;
            int i4 = i2 + 109;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 15;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallback;
            int i5 = i2 + 109;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }
}
