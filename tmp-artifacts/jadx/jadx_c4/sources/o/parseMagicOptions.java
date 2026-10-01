package o;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class parseMagicOptions {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static final String onNavigationEvent(@NotNull String str) throws UnsupportedEncodingException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strEncode = URLEncoder.encode(str, "UTF-8");
        Intrinsics.checkNotNullExpressionValue(strEncode, "");
        int i4 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return strEncode;
    }

    public static final String onExtraCallback(@NotNull String str) throws UnsupportedEncodingException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strDecode = URLDecoder.decode(str, "UTF-8");
        Intrinsics.checkNotNullExpressionValue(strDecode, "");
        int i4 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return strDecode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
