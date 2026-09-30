package o;

import com.google.gson.annotations.SerializedName;
import im.toss.network.model.BaseApiResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setAutoplayOnMobile extends BaseApiResponse<onWarmupCompleted> {

    public static final class onWarmupCompleted {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        @SerializedName("mainAccount")
        private final int mainAccount;

        @SerializedName("nickName")
        private final int nickName;

        /* JADX WARN: Illegal instructions before constructor call */
        public onWarmupCompleted() {
            int i = 0;
            this(i, i, 3, null);
        }

        public onWarmupCompleted(int i, int i2) {
            this.nickName = i;
            this.mainAccount = i2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onWarmupCompleted(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i3 & 1) != 0) {
                int i4 = onWarmupCompleted;
                int i5 = i4 + 105;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 77;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 2;
                }
                i = 0;
            }
            if ((i3 & 2) != 0) {
                int i9 = onWarmupCompleted + 41;
                onExtraCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 2 % 2;
                }
                i2 = 0;
            }
            this(i, i2);
        }
    }
}
