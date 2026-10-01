package o;

import kotlin.jvm.internal.Intrinsics;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class TTDelegateActivity1 {
    public static final TTAppOpenAdTransActivity onNavigationEvent(@NotNull TTHistoryActivity42 tTHistoryActivity42) {
        Intrinsics.checkNotNullParameter(tTHistoryActivity42, "");
        return new RealBufferedSource(tTHistoryActivity42);
    }

    public static final TTAppOpenAdActivity9 onWarmupCompleted(@NotNull TTHistoryActivity41 tTHistoryActivity41) {
        Intrinsics.checkNotNullParameter(tTHistoryActivity41, "");
        return new RealBufferedSink(tTHistoryActivity41);
    }

    public static final TTHistoryActivity41 onExtraCallbackWithResult() {
        return new TTBaseActivityycx();
    }
}
