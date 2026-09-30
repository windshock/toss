package o;

import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.o7b;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class o7b {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static final Lazy onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.securities.core.chart.domain.util.ZonedDateTimesKt$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ZoneId zoneIdOnNavigationEvent = o7b.onNavigationEvent();
            int i4 = IAuthTabCallback + 95;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return zoneIdOnNavigationEvent;
        }
    });

    public static /* synthetic */ ZoneId onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ZoneId zoneIdOnWarmupCompleted = onWarmupCompleted();
        int i4 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return zoneIdOnWarmupCompleted;
    }

    static {
        int i = onExtraCallback + 59;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public static final ZoneId onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ZoneId zoneId = (ZoneId) onWarmupCompleted.getValue();
        int i4 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return zoneId;
        }
        throw null;
    }

    private static final ZoneId onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ZoneId zoneIdIAuthTabCallback = isCivilized.onWarmupCompleted.IAuthTabCallback();
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        return zoneIdIAuthTabCallback;
    }

    public static final int onWarmupCompleted(@NotNull String str, int i, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int i4 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        int iCharAt = 0;
        while (i < i2) {
            iCharAt = (iCharAt * 10) + (str.charAt(i) - '0');
            i++;
            int i6 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        return iCharAt;
    }

    public static final ZonedDateTime onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                return IAuthTabCallback(str);
            }
            Intrinsics.checkNotNullParameter(str, "");
            IAuthTabCallback(str);
            throw null;
        } catch (Exception e) {
            AFd1mSDK.onExtraCallbackWithResult("parseCandleDtToKst", e, access8100.onNavigationEvent(getWrite.IAuthTabCallback("dt", str)), false, (Function1) null, 24, (Object) null);
            return onExtraCallback(str);
        }
    }

    public static final ZonedDateTime IAuthTabCallback(@NotNull String str) {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int iOnWarmupCompleted = 0;
        LocalDateTime localDateTimeOf = LocalDateTime.of(onWarmupCompleted(str, 0, 4), onWarmupCompleted(str, 5, 7), onWarmupCompleted(str, 8, 10), onWarmupCompleted(str, 11, 13), onWarmupCompleted(str, 14, 16), onWarmupCompleted(str, 17, 19));
        if (str.charAt(19) != 'Z') {
            char cCharAt = str.charAt(19);
            if (cCharAt == '+') {
                int i5 = onExtraCallbackWithResult + 103;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                i = 1;
            } else {
                if (cCharAt != '-') {
                    throw new IllegalArgumentException("Invalid offset sign: " + str.charAt(19));
                }
                i = -1;
            }
            iOnWarmupCompleted = i * ((onWarmupCompleted(str, 20, 22) * 3600) + (onWarmupCompleted(str, 23, 25) * 60));
        }
        ZonedDateTime zonedDateTimeWithZoneSameInstant = localDateTimeOf.atZone(ZoneOffset.ofTotalSeconds(iOnWarmupCompleted)).withZoneSameInstant(onExtraCallback());
        Intrinsics.checkNotNull(zonedDateTimeWithZoneSameInstant);
        int i7 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return zonedDateTimeWithZoneSameInstant;
        }
        throw null;
    }

    public static final ZonedDateTime onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNull(ZonedDateTime.parse(str).withZoneSameInstant(onExtraCallback()));
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        ZonedDateTime zonedDateTimeWithZoneSameInstant = ZonedDateTime.parse(str).withZoneSameInstant(onExtraCallback());
        Intrinsics.checkNotNull(zonedDateTimeWithZoneSameInstant);
        int i3 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return zonedDateTimeWithZoneSameInstant;
    }
}
