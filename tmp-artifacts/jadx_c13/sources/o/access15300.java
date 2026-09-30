package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access15300 {
    public static final <E extends Enum<E>> EnumEntries<E> onExtraCallbackWithResult(@NotNull E[] eArr) {
        Intrinsics.checkNotNullParameter(eArr, "");
        return new access15000(eArr);
    }
}
