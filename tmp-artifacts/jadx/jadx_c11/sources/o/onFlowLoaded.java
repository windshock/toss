package o;

import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onFlowLoaded {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public static final ZonedDateTime onNavigationEvent(@Nullable String str, @Nullable LocalDate localDate) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (str == null || localDate == null) {
            return null;
        }
        int i5 = i2 + 117;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        isCivilized iscivilized = isCivilized.onWarmupCompleted;
        LocalDateTime localDateTimeAtDate = LocalTime.parse(str).atDate(localDate);
        Intrinsics.checkNotNullExpressionValue(localDateTimeAtDate, "");
        ZonedDateTime zonedDateTimeOnExtraCallbackWithResult = iscivilized.onExtraCallbackWithResult(localDateTimeAtDate);
        int i7 = IAuthTabCallback + 71;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return zonedDateTimeOnExtraCallbackWithResult;
    }

    public static final ZonedDateTime onExtraCallbackWithResult(@NotNull ZonedDateTime zonedDateTime, @Nullable ZonedDateTime zonedDateTime2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(zonedDateTime, "");
        if (zonedDateTime2 == null) {
            return zonedDateTime;
        }
        int i4 = onWarmupCompleted + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        if (!zonedDateTime.isBefore(zonedDateTime2)) {
            return zonedDateTime;
        }
        ZonedDateTime zonedDateTimePlusDays = zonedDateTime.plusDays(1L);
        Intrinsics.checkNotNullExpressionValue(zonedDateTimePlusDays, "");
        return zonedDateTimePlusDays;
    }
}
