package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearOffset<T, R> {
    private final getBacktraceNote<setLoadBias<T, R>, T, access13800<? super R>, Object> onExtraCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public clearOffset(@NotNull getBacktraceNote<? super setLoadBias<T, R>, ? super T, ? super access13800<? super R>, ? extends Object> getbacktracenote) {
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        this.onExtraCallback = getbacktracenote;
    }

    public final getBacktraceNote<setLoadBias<T, R>, T, access13800<? super R>, Object> onWarmupCompleted() {
        return this.onExtraCallback;
    }
}
