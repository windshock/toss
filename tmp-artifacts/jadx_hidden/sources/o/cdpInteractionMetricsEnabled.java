package o;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class cdpInteractionMetricsEnabled {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    public static final cdpInteractionMetricsEnabled onExtraCallbackWithResult = new cdpInteractionMetricsEnabled();
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int i = IAuthTabCallback + 45;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 17 / 0;
        }
    }

    private cdpInteractionMetricsEnabled() {
    }

    public final String IAuthTabCallback(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = onNavigationEvent + 45;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return string;
    }

    public final String onExtraCallbackWithResult(@Nullable byte[] bArr) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (bArr != null) {
            return Base64.encodeToString(bArr, 0);
        }
        int i5 = i3 + 9;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final byte[] IAuthTabCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            return Base64.decode(str, 0);
        }
        int i4 = i3 + 39;
        int i5 = i4 % 128;
        onExtraCallback = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 57;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 51 / 0;
        }
        return null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        Intrinsics.checkNotNull(str2);
        Intrinsics.checkNotNull(str);
        if (!StringsKt.startsWith$default(str2, str, false, 2, (Object) null)) {
            return str + " " + str2;
        }
        int i2 = onExtraCallback;
        int i3 = i2 + 19;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 21;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
        return str2;
    }
}
