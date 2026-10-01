package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ResourceIntMapper extends RealStrongMemoryCacheInternalValue {
    private final int from;
    private final String prefs;
    private final int to;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourceIntMapper(@NotNull String str, int i, int i2) {
        super("Upgrade cipher generation : '" + str + "'(from=" + i + ", to=" + i2 + ")");
        Intrinsics.checkNotNullParameter(str, "");
        this.prefs = str;
        this.from = i;
        this.to = i2;
    }
}
