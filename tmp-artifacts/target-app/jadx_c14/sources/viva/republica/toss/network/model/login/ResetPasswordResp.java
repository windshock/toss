package viva.republica.toss.network.model.login;

import com.google.gson.annotations.SerializedName;
import im.toss.network.model.BaseApiResponse;
import o.nativeReadByte;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ResetPasswordResp extends BaseApiResponse<Success> {

    public static final class Success {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        @SerializedName("cert")
        private final String cert;

        @SerializedName("currentPasswordFormat")
        private final nativeReadByte currentPasswordFormat;

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 75;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.cert;
            int i5 = i2 + 9;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final nativeReadByte onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            nativeReadByte nativereadbyte = this.currentPasswordFormat;
            int i4 = i3 + 61;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return nativereadbyte;
            }
            obj.hashCode();
            throw null;
        }
    }
}
