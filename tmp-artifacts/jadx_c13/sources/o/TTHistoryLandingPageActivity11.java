package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTHistoryLandingPageActivity11 {
    public static final int onExtraCallbackWithResult(@NotNull int[] iArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else {
                if (i6 <= i) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    public static final int onExtraCallback(@NotNull TTHistoryActivity51 tTHistoryActivity51, int i) {
        Intrinsics.checkNotNullParameter(tTHistoryActivity51, "");
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(tTHistoryActivity51.extraCallback(), i + 1, 0, tTHistoryActivity51.ICustomTabsCallback().length);
        return iOnExtraCallbackWithResult >= 0 ? iOnExtraCallbackWithResult : ~iOnExtraCallbackWithResult;
    }
}
