package o;

import j$.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static final boolean onExtraCallback(@NotNull ZonedDateTime zonedDateTime, @Nullable ZonedDateTime zonedDateTime2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(zonedDateTime, "");
        if (zonedDateTime2 != null) {
            int i2 = onWarmupCompleted + 11;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                boolean zOnExtraCallbackWithResult = isCivilized.onWarmupCompleted.onExtraCallbackWithResult(zonedDateTime, zonedDateTime2);
                int i3 = 8 / 0;
                if (zOnExtraCallbackWithResult) {
                    return true;
                }
            } else if (isCivilized.onWarmupCompleted.onExtraCallbackWithResult(zonedDateTime, zonedDateTime2)) {
                return true;
            }
        }
        int i4 = onWarmupCompleted + 117;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final boolean IAuthTabCallback(@NotNull ZonedDateTime zonedDateTime, @Nullable ZonedDateTime zonedDateTime2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(zonedDateTime, "");
        if (zonedDateTime2 != null) {
            int i4 = onWarmupCompleted + 79;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (zonedDateTime.isBefore(zonedDateTime2)) {
                return true;
            }
        }
        int i6 = onExtraCallback + 21;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
