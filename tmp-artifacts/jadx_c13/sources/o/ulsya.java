package o;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ulsya<Output> {
    private final List<ulsya<Output>> onExtraCallback;
    private final List<setTextLocales<Output>> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public ulsya(@NotNull List<? extends setTextLocales<? super Output>> list, @NotNull List<? extends ulsya<? super Output>> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.onNavigationEvent = list;
        this.onExtraCallback = list2;
    }

    public final List<setTextLocales<Output>> onExtraCallback() {
        return this.onNavigationEvent;
    }

    public final List<ulsya<Output>> onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(this.onNavigationEvent, ", ", null, null, 0, null, null, 62, null) + '(' + CollectionsKt___CollectionsKt.joinToString$default(this.onExtraCallback, ";", null, null, 0, null, null, 62, null) + ')';
    }
}
