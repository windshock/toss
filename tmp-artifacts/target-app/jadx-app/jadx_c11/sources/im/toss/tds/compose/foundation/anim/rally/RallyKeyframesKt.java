package im.toss.tds.compose.foundation.anim.rally;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.setOnQueryTextListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RallyKeyframesKt {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static final <T> RallyKeyframesSpec<T> onExtraCallbackWithResult(@Nullable Integer num, @Nullable setOnQueryTextListener setonquerytextlistener, @Nullable T t, @NotNull Function1<? super RallyKeyframes<T>, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        RallyKeyframes rallyKeyframes = new RallyKeyframes(num, t, setonquerytextlistener);
        function1.invoke(rallyKeyframes);
        RallyKeyframesSpec<T> rallyKeyframesSpec = new RallyKeyframesSpec<>(rallyKeyframes.onExtraCallback(), rallyKeyframes.onExtraCallbackWithResult());
        int i2 = onNavigationEvent + 91;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 0;
        }
        return rallyKeyframesSpec;
    }
}
