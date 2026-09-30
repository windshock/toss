package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface row extends nq {
    <T> T onExtraCallback(@NotNull jp<? extends T> jpVar, @NotNull String str);

    <T> String onWarmupCompleted(@NotNull py<? super T> pyVar, T t);
}
