package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getLayoutWidth {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static final AppSetIdAndScope1 onNavigationEvent = ea10.onExtraCallbackWithResult("CipherCache");
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ AppSetIdAndScope1 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 21;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = onNavigationEvent;
        int i5 = i2 + 99;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
        return appSetIdAndScope1;
    }

    static {
        int i = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(String str, int i, String str2, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 95;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        if ((i2 & 2) != 0) {
            str2 = "…";
        }
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str, i, str2);
        int i6 = onExtraCallback + 67;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return strOnExtraCallbackWithResult;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final String onExtraCallbackWithResult(@Nullable String str, int i, @NotNull String str2) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 11;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str2, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str2, "");
        if (str == null) {
            return str;
        }
        int i4 = onExtraCallback + 121;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        if (str.length() == 0 || str.length() <= i) {
            return str;
        }
        String strSubstring = str.substring(0, i - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring + str2;
    }
}
