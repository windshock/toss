package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class removeAllListeners<T> implements ltlud<T> {
    private final int onExtraCallbackWithResult;
    private final ltlud<T> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public removeAllListeners(@NotNull ltlud<? super T> ltludVar, int i) {
        Intrinsics.checkNotNullParameter(ltludVar, "");
        this.onNavigationEvent = ltludVar;
        this.onExtraCallbackWithResult = i;
    }
}
