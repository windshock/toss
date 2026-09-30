package im.toss.features.home.feature.cashflow;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface CashflowSelectCategoryViewModel$onExtraCallbackWithResult {

    public static final class onExtraCallback implements CashflowSelectCategoryViewModel$onExtraCallbackWithResult {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        public static final onExtraCallback onNavigationEvent = new onExtraCallback();
        private static int onWarmupCompleted;

        static {
            int i = IAuthTabCallback + 23;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                int i4 = i3 + 89;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i6 = i3 + 49;
                onWarmupCompleted = i6 % 128;
                return i6 % 2 != 0;
            }
            int i7 = i3 + 51;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 109;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return 830600666;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 97;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 89;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return "Finish";
        }

        private onExtraCallback() {
        }
    }
}
