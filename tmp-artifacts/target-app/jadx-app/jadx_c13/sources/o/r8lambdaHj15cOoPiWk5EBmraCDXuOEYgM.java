package o;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class r8lambdaHj15cOoPiWk5EBmraCDXuOEYgM {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ float onNavigationEvent(Context context, float f, float f2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 87;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            f = 17.0f;
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 63;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            f2 = Float.MAX_VALUE;
        }
        return onExtraCallback(context, f, f2);
    }

    public static final float onExtraCallback(@NotNull Context context, float f, float f2) {
        DisplayMetrics displayMetrics;
        float fApplyDimension;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            displayMetrics = context.getResources().getDisplayMetrics();
            fApplyDimension = TypedValue.applyDimension(4, Math.min(f, f2), displayMetrics);
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            displayMetrics = context.getResources().getDisplayMetrics();
            fApplyDimension = TypedValue.applyDimension(2, Math.min(f, f2), displayMetrics);
        }
        float fApplyDimension2 = fApplyDimension / TypedValue.applyDimension(1, f, displayMetrics);
        int i3 = onWarmupCompleted + 11;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return fApplyDimension2;
    }

    public static final boolean onExtraCallbackWithResult(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            if (displayMetrics.widthPixels * displayMetrics.density < 600.0f) {
                return false;
            }
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            if (displayMetrics2.widthPixels / displayMetrics2.density < 600.0f) {
                return false;
            }
        }
        int i3 = IAuthTabCallback + 39;
        onWarmupCompleted = i3 % 128;
        return i3 % 2 != 0;
    }
}
