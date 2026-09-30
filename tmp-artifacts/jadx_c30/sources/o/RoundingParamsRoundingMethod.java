package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RoundingParamsRoundingMethod {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    @SerializedName("cvc")
    private String cvc;

    @SerializedName("newPassword")
    private String newPassword;

    /* JADX WARN: Illegal instructions before constructor call */
    public RoundingParamsRoundingMethod() {
        String str = null;
        this(str, str, 3, str);
    }

    public RoundingParamsRoundingMethod(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        this.cvc = str;
        this.newPassword = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RoundingParamsRoundingMethod(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 74 / 0;
            }
            str = BuildConfig.FLAVOR;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallback + 43;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str2 = BuildConfig.FLAVOR;
        }
        this(str, str2);
    }
}
