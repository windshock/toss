package o;

import j$.time.Instant;
import j$.time.TimeConversions;
import java.nio.file.attribute.FileTime;
import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class PAGNativeAdLoadCallback {
    static final long onNavigationEvent = TimeUnit.MILLISECONDS.toNanos(1) / 100;
    static final long onExtraCallback = TimeUnit.SECONDS.toNanos(1) / 100;

    public static boolean onExtraCallbackWithResult(long j) {
        return -2147483648L <= j && j <= 2147483647L;
    }

    public static boolean tE_(FileTime fileTime) {
        if (fileTime == null) {
            return true;
        }
        return onExtraCallbackWithResult(tH_(fileTime));
    }

    public static FileTime tF_(long j) {
        long jAddExact = Math.addExact(j, -116444736000000000L);
        long j2 = onExtraCallback;
        return FileTime.from(TimeConversions.convert(Instant.ofEpochSecond(Math.floorDiv(jAddExact, j2), Math.floorMod(jAddExact, j2) * 100)));
    }

    public static long tG_(FileTime fileTime) {
        return Math.subtractExact((TimeConversions.convert(fileTime.toInstant()).getEpochSecond() * onExtraCallback) + (r6.getNano() / 100), -116444736000000000L);
    }

    public static long tH_(FileTime fileTime) {
        return fileTime.to(TimeUnit.SECONDS);
    }

    public static FileTime tI_(long j) {
        return FileTime.from(j, TimeUnit.SECONDS);
    }
}
