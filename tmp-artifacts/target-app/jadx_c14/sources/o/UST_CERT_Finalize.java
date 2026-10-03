package o;

import com.ssenstone.libotac_sdk.OtacManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CERT_Finalize {
    public static final String onWarmupCompleted(@NotNull OtacManager otacManager) {
        Intrinsics.checkNotNullParameter(otacManager, "");
        String strSSRegisterDATA = otacManager.SSRegisterDATA("", "", UST_CERT_DecryptPrikey.Card.getTypeCode(), "");
        Intrinsics.checkNotNullExpressionValue(strSSRegisterDATA, "");
        return strSSRegisterDATA;
    }

    public static final String IAuthTabCallback(@NotNull OtacManager otacManager, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(otacManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        String strSSRegisterDATA = otacManager.SSRegisterDATA(str, str2, UST_CERT_DecryptPrikey.Pin.getTypeCode(), str3);
        Intrinsics.checkNotNullExpressionValue(strSSRegisterDATA, "");
        return strSSRegisterDATA;
    }

    public static final String onNavigationEvent(@NotNull OtacManager otacManager, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(otacManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String strSSInitializeOTAC = otacManager.SSInitializeOTAC("", "", UST_CERT_DecryptPrikey.Card.getTypeCode(), str, str2);
        Intrinsics.checkNotNullExpressionValue(strSSInitializeOTAC, "");
        return strSSInitializeOTAC;
    }

    public static final String onWarmupCompleted(@NotNull OtacManager otacManager, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(otacManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        String strSSInitializeOTAC = otacManager.SSInitializeOTAC(str, str2, UST_CERT_DecryptPrikey.Pin.getTypeCode(), str3, str4);
        Intrinsics.checkNotNullExpressionValue(strSSInitializeOTAC, "");
        return strSSInitializeOTAC;
    }

    public static final String IAuthTabCallback(@NotNull OtacManager otacManager, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(otacManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        String strSSGenerateOTAC = otacManager.SSGenerateOTAC("", "", UST_CERT_DecryptPrikey.Card.getTypeCode(), str, "", str2, str3, str4, str5, str6);
        Intrinsics.checkNotNullExpressionValue(strSSGenerateOTAC, "");
        return strSSGenerateOTAC;
    }

    public static final String onExtraCallbackWithResult(@NotNull OtacManager otacManager, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(otacManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        String strSSGenerateOTAC = otacManager.SSGenerateOTAC(str, str2, UST_CERT_DecryptPrikey.Pin.getTypeCode(), str3, str4, "", str5, str6, str7, str8);
        Intrinsics.checkNotNullExpressionValue(strSSGenerateOTAC, "");
        return strSSGenerateOTAC;
    }
}
