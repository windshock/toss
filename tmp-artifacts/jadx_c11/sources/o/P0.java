package o;

import android.content.Context;
import android.provider.Settings;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class P0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public static final boolean IAuthTabCallback(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        try {
            if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
                int i2 = onExtraCallback + 105;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
        } catch (Exception unused) {
        }
        int i4 = IAuthTabCallback + 103;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
