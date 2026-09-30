package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hasVaryAll {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public static final Activity IAuthTabCallback(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            return onExtraCallback(context);
        }
        Intrinsics.checkNotNullParameter(context, "");
        onExtraCallback(context);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final Activity onExtraCallback(@Nullable Context context) {
        int i = 2 % 2;
        while (context instanceof ContextWrapper) {
            int i2 = onExtraCallback + 111;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                int i4 = 6 / 0;
                if (context instanceof Activity) {
                    int i5 = i3 + 83;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return (Activity) context;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                if (context instanceof Activity) {
                    int i52 = i3 + 83;
                    onExtraCallback = i52 % 128;
                    int i62 = i52 % 2;
                    return (Activity) context;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        int i7 = onExtraCallback + 21;
        onWarmupCompleted = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }
}
