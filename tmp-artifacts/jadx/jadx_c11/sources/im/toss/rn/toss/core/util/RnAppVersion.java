package im.toss.rn.toss.core.util;

import android.content.Context;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.zzad;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RnAppVersion {
    private static int IAuthTabCallback = 0;
    public static final RnAppVersion onExtraCallback = new RnAppVersion();
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private RnAppVersion() {
    }

    public final String onWarmupCompleted(@NotNull Context context, @NotNull zzad zzadVar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        String strIAuthTabCallback = IAuthTabCallback(zzadVar.getSmallIconBitmap());
        if (strIAuthTabCallback != null) {
            int i2 = onWarmupCompleted + 123;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 101;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return strIAuthTabCallback;
        }
        String strIAuthTabCallback2 = IAuthTabCallback(onWarmupCompleted(context));
        return strIAuthTabCallback2 == null ? "0.0.0" : strIAuthTabCallback2;
    }

    private final String IAuthTabCallback(String str) {
        String string;
        String strSubstringBefore$default;
        int i = 2 % 2;
        if (str == null || (string = StringsKt.trim(str).toString()) == null || (strSubstringBefore$default = StringsKt.substringBefore$default(string, '-', (String) null, 2, (Object) null)) == null || StringsKt.isBlank(strSubstringBefore$default)) {
            int i2 = onNavigationEvent + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = onWarmupCompleted + 35;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 39;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return strSubstringBefore$default;
    }

    private final String onWarmupCompleted(Context context) {
        Object obj;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        String str = (String) obj;
        int i4 = onNavigationEvent + 93;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return str;
    }
}
