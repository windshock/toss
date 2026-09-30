package o;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class emitEventForModule {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static final boolean onExtraCallback(@NotNull getRegisteredModules getregisteredmodules) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getregisteredmodules, "");
        if (getregisteredmodules.getFullLogoResId() == 0 && getregisteredmodules.getFullLogoNightResId() == 0) {
            int i2 = IAuthTabCallback + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = IAuthTabCallback + 99;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return true;
    }

    public static final int onExtraCallback(@NotNull View view, @NotNull getRegisteredModules getregisteredmodules) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(getregisteredmodules, "");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Intrinsics.checkNotNullExpressionValue(resources.getConfiguration(), "");
        if (!readIntokhttp.onExtraCallback(r2)) {
            return getregisteredmodules.getFullLogoResId();
        }
        int i2 = IAuthTabCallback + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int fullLogoNightResId = getregisteredmodules.getFullLogoNightResId();
        int i4 = onWarmupCompleted + 35;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return fullLogoNightResId;
    }
}
