package o;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static /* synthetic */ float onExtraCallback(float f, float f2, float f3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 99;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 29;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            f3 = 1.35f;
        }
        return onNavigationEvent(f, f2, f3);
    }

    public static final float onNavigationEvent(float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i2 % 128;
        return i2 % 2 == 0 ? f - RangesKt.coerceIn(f2, 0.0f, f3) : f * RangesKt.coerceIn(f2, 1.0f, f3);
    }

    public static final float onExtraCallback(@NotNull Context context, int i) {
        float fOnExtraCallback;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            fOnExtraCallback = onExtraCallback(context.getResources().getDimension(i) / context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale, 2.0f, 4, null);
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            fOnExtraCallback = onExtraCallback(context.getResources().getDimension(i) / context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale, 0.0f, 2, null);
        }
        int i4 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return fOnExtraCallback;
    }

    public static final boolean IAuthTabCallback(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            float f = context.getResources().getConfiguration().fontScale;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        if (context.getResources().getConfiguration().fontScale >= 1.2f) {
            return true;
        }
        int i3 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
