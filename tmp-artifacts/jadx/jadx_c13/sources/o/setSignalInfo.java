package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class setSignalInfo {
    public static final double onWarmupCompleted(double d, @NotNull setRevision setrevision, @NotNull setRevision setrevision2) {
        Intrinsics.checkNotNullParameter(setrevision, "");
        Intrinsics.checkNotNullParameter(setrevision2, "");
        long jConvert = setrevision2.getTimeUnit$kotlin_stdlib().convert(1L, setrevision.getTimeUnit$kotlin_stdlib());
        return jConvert > 0 ? d * jConvert : d / setrevision.getTimeUnit$kotlin_stdlib().convert(1L, setrevision2.getTimeUnit$kotlin_stdlib());
    }

    public static final long onExtraCallbackWithResult(long j, @NotNull setRevision setrevision, @NotNull setRevision setrevision2) {
        Intrinsics.checkNotNullParameter(setrevision, "");
        Intrinsics.checkNotNullParameter(setrevision2, "");
        return setrevision2.getTimeUnit$kotlin_stdlib().convert(j, setrevision.getTimeUnit$kotlin_stdlib());
    }

    public static final long onWarmupCompleted(long j, @NotNull setRevision setrevision, @NotNull setRevision setrevision2) {
        Intrinsics.checkNotNullParameter(setrevision, "");
        Intrinsics.checkNotNullParameter(setrevision2, "");
        return setrevision2.getTimeUnit$kotlin_stdlib().convert(j, setrevision.getTimeUnit$kotlin_stdlib());
    }
}
