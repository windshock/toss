package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface isColdStartup {

    public static final class onWarmupCompleted implements isColdStartup {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        public static final onWarmupCompleted onNavigationEvent = new onWarmupCompleted();
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallback + 67;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 75;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (obj instanceof onWarmupCompleted) {
                return true;
            }
            int i4 = IAuthTabCallback;
            int i5 = i4 + 27;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 53;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return 1153989638;
            }
            int i3 = 40 / 0;
            return 1153989638;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 51;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 113;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return "Loading";
            }
            throw null;
        }

        private onWarmupCompleted() {
        }
    }

    public static final class onExtraCallbackWithResult implements isColdStartup {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final String IAuthTabCallback;
        private final setHeaders onExtraCallback;
        private final int onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 1;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (this.onWarmupCompleted != onextracallbackwithresult.onWarmupCompleted) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback)) {
                int i4 = onExtraCallbackWithResult + 67;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback)) {
                return true;
            }
            int i6 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = Integer.hashCode(this.onWarmupCompleted);
            int iHashCode3 = this.onExtraCallback.hashCode();
            String str = this.IAuthTabCallback;
            if (str == null) {
                int i2 = onNavigationEvent;
                int i3 = i2 + 67;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 15;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ShowLoanNeeds(kcbScore=" + this.onWarmupCompleted + ", loanNeedsInfo=" + this.onExtraCallback + ", livingStabilizationScheme=" + this.IAuthTabCallback + ")";
            int i2 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public onExtraCallbackWithResult(int i, @NotNull setHeaders setheaders, @Nullable String str) {
            Intrinsics.checkNotNullParameter(setheaders, "");
            this.onWarmupCompleted = i;
            this.onExtraCallback = setheaders;
            this.IAuthTabCallback = str;
        }

        public final int IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = this.onWarmupCompleted;
            if (i3 == 0) {
                int i5 = 88 / 0;
            }
            return i4;
        }

        public final setHeaders onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 103;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            setHeaders setheaders = this.onExtraCallback;
            int i5 = i2 + 103;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 75 / 0;
            }
            return setheaders;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return this.IAuthTabCallback;
            }
            throw null;
        }
    }
}
