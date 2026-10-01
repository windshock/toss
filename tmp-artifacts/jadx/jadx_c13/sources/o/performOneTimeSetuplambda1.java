package o;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class performOneTimeSetuplambda1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public static final setUnwindFunction onWarmupCompleted(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        setUnwindFunction setunwindfunction = new setUnwindFunction(setUnwindFunction.Companion.onExtraCallbackWithResult(context));
        int i2 = onExtraCallback + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return setunwindfunction;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
