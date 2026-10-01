package o;

import android.content.pm.PackageInfo;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Cookies_getFromResponse {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static final long onNavigationEvent(@NotNull PackageInfo packageInfo) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(packageInfo, "");
        Object obj = null;
        if (Build.VERSION.SDK_INT >= 28) {
            int i4 = onNavigationEvent + 97;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return packageInfo.getLongVersionCode();
            }
            packageInfo.getLongVersionCode();
            throw null;
        }
        long j = packageInfo.versionCode;
        int i5 = onExtraCallback + 25;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }
}
