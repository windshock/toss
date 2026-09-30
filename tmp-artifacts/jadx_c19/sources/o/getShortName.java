package o;

import android.content.res.Resources;
import com.alibaba.ariver.kernel.RVParams;
import im.toss.core.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getShortName {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    private static final String onWarmupCompleted(int i2) {
        int i3 = 2 % 2;
        int i4 = i2 % 100;
        if (11 <= i4) {
            int i5 = onWarmupCompleted;
            int i6 = i5 + 35;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (i4 < 14) {
                int i8 = i5 + 125;
                int i9 = i8 % 128;
                onNavigationEvent = i9;
                if (i8 % 2 != 0) {
                    throw null;
                }
                int i10 = i9 + 63;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                return "th";
            }
        }
        int i12 = i2 % 10;
        if (i12 == 1) {
            return RVParams.SHOW_TITLEBAR;
        }
        if (i12 == 2) {
            return "nd";
        }
        int i13 = onNavigationEvent + 109;
        onWarmupCompleted = i13 % 128;
        if (i13 % 2 == 0) {
            if (i12 == 5) {
                return "rd";
            }
        } else if (i12 == 3) {
            return "rd";
        }
        return "th";
    }

    public static final String IAuthTabCallback(int i2, @NotNull Resources resources) throws Resources.NotFoundException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 67;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(resources, "");
        String string = resources.getString(R.string.rank_ordinal_format, Integer.valueOf(i2), onWarmupCompleted(i2));
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i6 = onWarmupCompleted + 93;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 77 / 0;
        }
        return string;
    }
}
