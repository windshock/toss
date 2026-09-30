package im.toss.features.benefit.ui;

import im.toss.features.benefit.dto.BenefitTabPremiumAdResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
interface KoreaBenefitTabViewModel$asBinder {

    public static final class IAuthTabCallback implements KoreaBenefitTabViewModel$asBinder {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private final BenefitTabPremiumAdResponse onExtraCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 83;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i4 = onExtraCallbackWithResult + 55;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallback, ((IAuthTabCallback) obj).onExtraCallback)) {
                return true;
            }
            int i6 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i6 % 128;
            return i6 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 63;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            BenefitTabPremiumAdResponse benefitTabPremiumAdResponse = this.onExtraCallback;
            if (benefitTabPremiumAdResponse != null) {
                int iHashCode = benefitTabPremiumAdResponse.hashCode();
                int i5 = onExtraCallbackWithResult + 29;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 24 / 0;
                }
                return iHashCode;
            }
            int i7 = i2 + 99;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                return 0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Success(premiumAd=" + this.onExtraCallback + ")";
            int i2 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public IAuthTabCallback(@Nullable BenefitTabPremiumAdResponse benefitTabPremiumAdResponse) {
            this.onExtraCallback = benefitTabPremiumAdResponse;
        }

        public final BenefitTabPremiumAdResponse onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            BenefitTabPremiumAdResponse benefitTabPremiumAdResponse = this.onExtraCallback;
            int i4 = i3 + 11;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return benefitTabPremiumAdResponse;
            }
            throw null;
        }
    }

    public static final class onExtraCallback implements KoreaBenefitTabViewModel$asBinder {
        public static final onExtraCallback IAuthTabCallback = new onExtraCallback();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        static {
            int i = onExtraCallbackWithResult + 77;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 60 / 0;
            }
        }

        private onExtraCallback() {
        }
    }
}
