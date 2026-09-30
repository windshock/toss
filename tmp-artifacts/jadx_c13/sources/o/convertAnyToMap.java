package o;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class convertAnyToMap {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String IAuthTabCallback(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if ((!StringsKt__StringsKt.isBlank(str2)) && str3 != null) {
            int i4 = IAuthTabCallback + 15;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 0 / 0;
                if (!StringsKt__StringsKt.isBlank(str3)) {
                    Uri uri = Uri.parse(str);
                    if (uri.getQueryParameter(str2) == null) {
                        String string = uri.buildUpon().appendQueryParameter(str2, str3).build().toString();
                        Intrinsics.checkNotNull(string);
                        return string;
                    }
                    str = uri.toString();
                    Intrinsics.checkNotNull(str);
                }
            } else if (!StringsKt__StringsKt.isBlank(str3)) {
            }
        }
        int i6 = onWarmupCompleted + 43;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public static final String onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        String strOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            strOnExtraCallback = filterCreatePageParams.onExtraCallback(Uri.parse(str), str2, str3);
            int i3 = 88 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            strOnExtraCallback = filterCreatePageParams.onExtraCallback(Uri.parse(str), str2, str3);
        }
        int i4 = IAuthTabCallback + 71;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallback;
    }

    public static final String onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strReplace = new Regex("\\d").replace(str, "$0 ");
        int i2 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 0;
        }
        return strReplace;
    }

    public static final String onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return StringsKt__StringsJVMKt.replace$default(str, " ", " ", false, 3, (Object) null);
        }
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsJVMKt.replace$default(str, " ", " ", false, 4, (Object) null);
    }
}
