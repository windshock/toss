package o;

import j$.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getBuildFingerprintBytes {
    public static final Instant onExtraCallbackWithResult(@NotNull setRevisionBytes setrevisionbytes) {
        Intrinsics.checkNotNullParameter(setrevisionbytes, "");
        Instant instantOfEpochSecond = Instant.ofEpochSecond(setrevisionbytes.onExtraCallback(), setrevisionbytes.onNavigationEvent());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "");
        return instantOfEpochSecond;
    }

    public static final setRevisionBytes onExtraCallback(@NotNull Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "");
        return setRevisionBytes.Companion.IAuthTabCallback(instant.getEpochSecond(), instant.getNano());
    }
}
