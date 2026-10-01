package o;

import com.google.gson.annotations.SerializedName;
import im.toss.features.account.impl.model.TossAccount;
import im.toss.network.model.BaseApiResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ErrorView extends BaseApiResponse<onExtraCallbackWithResult> {

    public static final class onExtraCallbackWithResult implements TitleBarCloseBtnClickInterceptPointCloseButtonClickCallback {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        @SerializedName("tossAccountInfo")
        private final List<TossAccount> tossAccounts;

        /* JADX WARN: Illegal instructions before constructor call */
        public onExtraCallbackWithResult() {
            List list = null;
            this(list, 1, list);
        }

        public onExtraCallbackWithResult(@Nullable List<? extends TossAccount> list) {
            this.tossAccounts = list;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallbackWithResult(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onExtraCallback + 17;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 63;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
                list = null;
            }
            this(list);
        }

        public List<TossAccount> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            List<TossAccount> list = this.tossAccounts;
            if (i3 == 0) {
                int i4 = 26 / 0;
            }
            return list;
        }
    }
}
