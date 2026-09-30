package o;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Page {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ String onExtraCallbackWithResult(byte[] bArr, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 21;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
            i = 2;
        }
        String strOnNavigationEvent = onNavigationEvent(bArr, i);
        int i5 = onWarmupCompleted + 79;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return strOnNavigationEvent;
    }

    public static final String onNavigationEvent(@NotNull byte[] bArr, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 59;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
            String strEncodeToString = Base64.encodeToString(bArr, i);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
            return strEncodeToString;
        }
        Intrinsics.checkNotNullParameter(bArr, "");
        String strEncodeToString2 = Base64.encodeToString(bArr, i);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString2, "");
        int i4 = 63 / 0;
        return strEncodeToString2;
    }

    public static final byte[] onNavigationEvent(@NotNull String str, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bArrDecode = Base64.decode(str, i);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
        int i5 = onExtraCallback + 79;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 64 / 0;
        }
        return bArrDecode;
    }

    public static /* synthetic */ byte[] onNavigationEvent(String str, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 41;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        if (i4 % 2 != 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
            int i6 = i5 + 67;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            i = 2;
        }
        return onNavigationEvent(str, i);
    }
}
