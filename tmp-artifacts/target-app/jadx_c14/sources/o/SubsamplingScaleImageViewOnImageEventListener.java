package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SubsamplingScaleImageViewOnImageEventListener {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String IAuthTabCallback(String str) {
        String strReplace$default;
        if (str == null || (strReplace$default = StringsKt.replace$default(str, "\n", " ", false, 4, (Object) null)) == null) {
            return null;
        }
        return StringsKt.trim(strReplace$default).toString();
    }

    public static /* synthetic */ String onNavigationEvent(long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return onWarmupCompleted(j, str);
    }

    public static final String onWarmupCompleted(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            String str2 = CommonModule_closeView.onWarmupCompleted.onTransact().format(Long.valueOf(j));
            if (str2 == null || StringsKt.isBlank(str2)) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "LoanComparisonDateFormatting", str, (Throwable) null, access8100.onNavigationEvent(getWrite.IAuthTabCallback("origin", Long.valueOf(j))), 4, (Object) null);
            }
            Intrinsics.checkNotNull(str2);
            return str2;
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("LoanComparisonDateFormatting", str, e, access8100.onNavigationEvent(getWrite.IAuthTabCallback("origin", Long.valueOf(j))));
            return "";
        }
    }
}
