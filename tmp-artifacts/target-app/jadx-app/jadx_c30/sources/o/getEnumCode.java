package o;

import com.google.gson.annotations.SerializedName;
import im.toss.network.model.BaseApiResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getEnumCode extends BaseApiResponse<onWarmupCompleted> {

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        @SerializedName("mappedError")
        private final String mappedError;

        /* JADX WARN: Illegal instructions before constructor call */
        public onWarmupCompleted() {
            String str = null;
            this(str, 1, str);
        }

        public onWarmupCompleted(@Nullable String str) {
            this.mappedError = str;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onWarmupCompleted(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onExtraCallback + 19;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 7;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                str = null;
            }
            this(str);
        }
    }
}
