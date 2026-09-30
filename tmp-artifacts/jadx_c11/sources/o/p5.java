package o;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.p5;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class p5 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ Unit onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted();
        int i4 = onNavigationEvent + 59;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, readBomAsCharset readbomascharset, Map map, Function0 function0, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 61;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            map = access8100.onNavigationEvent();
        }
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: im.toss.securities.core.exposure.TrackImpressionModifierKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke() {
                    int i8 = 2 % 2;
                    int i9 = IAuthTabCallback + 15;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitOnExtraCallback = p5.onExtraCallback();
                    int i11 = IAuthTabCallback + 103;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    return unitOnExtraCallback;
                }
            };
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, readbomascharset, map, function0);
        int i8 = IAuthTabCallback + 25;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    private static final Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        return unit;
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull readBomAsCharset readbomascharset, @NotNull Map<String, ? extends Object> map, @NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(readbomascharset, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function0, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(new o7e(readbomascharset, map, function0));
        int i2 = IAuthTabCallback + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }
}
