package okhttp3.internal.idn;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class IdnaMappingTableKt {
    public static final int read14BitInt(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return (str.charAt(i) << 7) + str.charAt(i + 1);
    }

    public static final int binarySearch(int i, int i2, @NotNull Function1<? super Integer, Integer> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) / 2;
            int iIntValue = function1.invoke(Integer.valueOf(i4)).intValue();
            if (iIntValue < 0) {
                i3 = i4 - 1;
            } else {
                if (iIntValue <= 0) {
                    return i4;
                }
                i = i4 + 1;
            }
        }
        return (-i) - 1;
    }
}
