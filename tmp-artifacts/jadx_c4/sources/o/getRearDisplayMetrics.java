package o;

import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.ViewPager2OnPageChangeCallback;
import o.getRearDisplayMetrics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getRearDisplayMetrics {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public static /* synthetic */ Unit IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback();
        int i4 = onExtraCallback + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        throw null;
    }

    public static final Function0<Unit> onWarmupCompleted(@NotNull ViewGroup viewGroup, @NotNull Map<View, String> map) {
        Function0<Unit> function0IAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(map, "");
        ViewPager2OnPageChangeCallback.IAuthTabCallback iAuthTabCallbackOnExtraCallback = ViewPager2OnPageChangeCallback.onExtraCallbackWithResult.onExtraCallback();
        if (iAuthTabCallbackOnExtraCallback == null || (function0IAuthTabCallback = iAuthTabCallbackOnExtraCallback.IAuthTabCallback(viewGroup, map)) == null) {
            return new Function0() { // from class: im.toss.ads_sdk.ui.view.NativeAdsSlotDebugOverlayKt$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke() {
                    Unit unitIAuthTabCallback;
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 89;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 != 0) {
                        unitIAuthTabCallback = getRearDisplayMetrics.IAuthTabCallback();
                        int i4 = 24 / 0;
                    } else {
                        unitIAuthTabCallback = getRearDisplayMetrics.IAuthTabCallback();
                    }
                    int i5 = onWarmupCompleted + 33;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        return unitIAuthTabCallback;
                    }
                    throw null;
                }
            };
        }
        int i2 = IAuthTabCallback;
        int i3 = i2 + 35;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 41;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return function0IAuthTabCallback;
    }
}
