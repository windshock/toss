package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onPageScrolled {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final OkHttpClient.Builder IAuthTabCallback(@NotNull OkHttpClient.Builder builder, @NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(builder, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        int i5 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return builder;
    }
}
