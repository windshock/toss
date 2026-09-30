package o;

import kotlin.jvm.internal.Intrinsics;
import o.AFf1aSDK;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface AFe1wSDK {

    public static final class onExtraCallback implements AFe1wSDK {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final AFf1aSDK.onWarmupCompleted onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 55;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i4 = onExtraCallbackWithResult + 113;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onNavigationEvent, ((onExtraCallback) obj).onNavigationEvent)) {
                return true;
            }
            int i6 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                this.onNavigationEvent.hashCode();
                throw null;
            }
            int iHashCode = this.onNavigationEvent.hashCode();
            int i3 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Alignment(value=" + this.onNavigationEvent + ")";
            int i2 = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallback(@NotNull AFf1aSDK.onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            this.onNavigationEvent = onwarmupcompleted;
        }

        public final AFf1aSDK.onWarmupCompleted onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 113;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            AFf1aSDK.onWarmupCompleted onwarmupcompleted = this.onNavigationEvent;
            int i4 = i2 + 45;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 18 / 0;
            }
            return onwarmupcompleted;
        }
    }

    public static final class onExtraCallbackWithResult implements AFe1wSDK {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private final int onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 49;
                onExtraCallbackWithResult = i2 % 128;
                return i2 % 2 != 0;
            }
            if (obj instanceof onExtraCallbackWithResult) {
                return this.onWarmupCompleted == ((onExtraCallbackWithResult) obj).onWarmupCompleted;
            }
            int i3 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i3 % 128;
            return i3 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = this.onWarmupCompleted;
            if (i3 == 0) {
                return Integer.hashCode(i4);
            }
            Integer.hashCode(i4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "CenterX(value=" + this.onWarmupCompleted + ")";
            int i2 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public onExtraCallbackWithResult(int i) {
            this.onWarmupCompleted = i;
        }

        public final int onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = this.onWarmupCompleted;
            if (i3 != 0) {
                int i5 = 90 / 0;
            }
            return i4;
        }
    }
}
