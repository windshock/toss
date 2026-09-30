package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import okhttp3.internal.ws.RealWebSocket;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setSelinuxLabel extends setSignalInfo {

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[setRevision.values().length];
            try {
                iArr[setRevision.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setRevision.HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[setRevision.MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[setRevision.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[setRevision.MILLISECONDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[setRevision.NANOSECONDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[setRevision.MICROSECONDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            IAuthTabCallback = iArr;
        }
    }

    public static final long onExtraCallbackWithResult(long j, @NotNull setRevision setrevision) {
        Intrinsics.checkNotNullParameter(setrevision, "");
        return onExtraCallbackWithResult(j, onExtraCallback(setrevision));
    }

    private static final long onExtraCallbackWithResult(long j, long j2) {
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            return RangesKt___RangesKt.coerceAtMost(j2, 4611686018427387903L);
        }
        if (j2 == 1) {
            return RangesKt___RangesKt.coerceAtMost(j, 4611686018427387903L);
        }
        int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
        if (iNumberOfLeadingZeros < 63) {
            return j * j2;
        }
        if (iNumberOfLeadingZeros > 63) {
            return 4611686018427387903L;
        }
        return RangesKt___RangesKt.coerceAtMost(j * j2, 4611686018427387903L);
    }

    private static final long onExtraCallback(setRevision setrevision) {
        int i = onNavigationEvent.IAuthTabCallback[setrevision.ordinal()];
        if (i == 1) {
            return 86400000L;
        }
        if (i == 2) {
            return 3600000L;
        }
        if (i == 3) {
            return RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
        }
        if (i == 4) {
            return 1000L;
        }
        if (i == 5) {
            return 1L;
        }
        throw new IllegalStateException(("Wrong unit for millisMultiplier: " + setrevision).toString());
    }

    public static final String onWarmupCompleted(@NotNull setRevision setrevision) {
        Intrinsics.checkNotNullParameter(setrevision, "");
        switch (onNavigationEvent.IAuthTabCallback[setrevision.ordinal()]) {
            case 1:
                return "d";
            case 2:
                return "h";
            case 3:
                return "m";
            case 4:
                return "s";
            case 5:
                return "ms";
            case 6:
                return "ns";
            case 7:
                return "us";
            default:
                throw new IllegalStateException(("Unknown unit: " + setrevision).toString());
        }
    }
}
