package o;

import javax.inject.Inject;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class computeScroll$onExtraCallbackWithResult {
    public static final int onExtraCallback = 8;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final dataSetChanged onNavigationEvent;

    @Inject
    public computeScroll$onExtraCallbackWithResult(@NotNull fakeDragBy fakedragby) {
        Intrinsics.checkNotNullParameter(fakedragby, "");
        this.onNavigationEvent = new dataSetChanged(fakedragby);
    }

    public static /* synthetic */ computeScroll onNavigationEvent(computeScroll$onExtraCallbackWithResult computescroll_onextracallbackwithresult, getPageMargin getpagemargin, executeKeyEvent executekeyevent, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 4) != 0) {
            executekeyevent = new distanceInfluenceForSnapDuration();
        }
        computeScroll computescrollOnExtraCallback = computescroll_onextracallbackwithresult.onExtraCallback(getpagemargin, executekeyevent);
        int i4 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return computescrollOnExtraCallback;
    }

    public final computeScroll onExtraCallback(@NotNull getPageMargin getpagemargin, @NotNull executeKeyEvent executekeyevent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getpagemargin, "");
        Intrinsics.checkNotNullParameter(executekeyevent, "");
        computeScroll computescroll = new computeScroll(getpagemargin, this.onNavigationEvent, executekeyevent, new clearOnPageChangeListeners(0L, (Function0) null, 3, (DefaultConstructorMarker) null));
        int i2 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 50 / 0;
        }
        return computescroll;
    }
}
