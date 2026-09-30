package o;

import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class isTestModeEnabled {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public static final boolean IAuthTabCallback(@Nullable Intent intent) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 87;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (intent != null) {
            int i4 = i2 + 77;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (intent.getBooleanExtra("from_push", false)) {
                return true;
            }
        }
        int i6 = IAuthTabCallback + 45;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public static final Intent onExtraCallbackWithResult(@NotNull Intent intent, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(intent, "");
            Intrinsics.checkNotNullExpressionValue(intent.putExtra("from_push", z), "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(intent, "");
        Intent intentPutExtra = intent.putExtra("from_push", z);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
        int i3 = IAuthTabCallback + 117;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return intentPutExtra;
    }

    public static final Bundle onExtraCallback(@NotNull Bundle bundle, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        bundle.putBoolean("from_push", z);
        int i4 = IAuthTabCallback + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return bundle;
    }
}
