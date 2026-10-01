package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import o.setLogBuffers;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getArch {
    public static final long onWarmupCompleted(long j, @NotNull setRevision setrevision, long j2) {
        Intrinsics.checkNotNullParameter(setrevision, "");
        long jOnExtraCallbackWithResult = setLogBuffers.onExtraCallbackWithResult(j2, setrevision);
        if (((j - 1) | 1) == LongCompanionObject.MAX_VALUE) {
            return IAuthTabCallback(j, j2, jOnExtraCallbackWithResult);
        }
        if ((1 | (jOnExtraCallbackWithResult - 1)) == LongCompanionObject.MAX_VALUE) {
            return onExtraCallbackWithResult(j, setrevision, j2);
        }
        long j3 = j + jOnExtraCallbackWithResult;
        if (((j ^ j3) & (jOnExtraCallbackWithResult ^ j3)) >= 0) {
            return j3;
        }
        if (j < 0) {
            return Long.MIN_VALUE;
        }
        return LongCompanionObject.MAX_VALUE;
    }

    private static final long IAuthTabCallback(long j, long j2, long j3) {
        if (!setLogBuffers.ICustomTabsCallback(j2) || (j ^ j3) >= 0) {
            return j;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    private static final long onExtraCallbackWithResult(long j, setRevision setrevision, long j2) {
        long jOnWarmupCompleted = setLogBuffers.onWarmupCompleted(j2, 2);
        long jOnExtraCallbackWithResult = setLogBuffers.onExtraCallbackWithResult(jOnWarmupCompleted, setrevision);
        return (1 | (jOnExtraCallbackWithResult - 1)) == LongCompanionObject.MAX_VALUE ? jOnExtraCallbackWithResult : onWarmupCompleted(onWarmupCompleted(j, setrevision, jOnWarmupCompleted), setrevision, setLogBuffers.onWarmupCompleted(j2, jOnWarmupCompleted));
    }

    private static final long IAuthTabCallback(long j) {
        return j < 0 ? setLogBuffers.Companion.onNavigationEvent() : setLogBuffers.Companion.onExtraCallbackWithResult();
    }

    public static final long onExtraCallbackWithResult(long j, long j2, @NotNull setRevision setrevision) {
        Intrinsics.checkNotNullParameter(setrevision, "");
        if ((1 | (j2 - 1)) == LongCompanionObject.MAX_VALUE) {
            return setLogBuffers.onActivityLayout(IAuthTabCallback(j2));
        }
        return onExtraCallback(j, j2, setrevision);
    }

    public static final long onNavigationEvent(long j, long j2, @NotNull setRevision setrevision) {
        Intrinsics.checkNotNullParameter(setrevision, "");
        if (((j2 - 1) | 1) == LongCompanionObject.MAX_VALUE) {
            if (j == j2) {
                return setLogBuffers.Companion.onWarmupCompleted();
            }
            return setLogBuffers.onActivityLayout(IAuthTabCallback(j2));
        }
        if ((1 | (j - 1)) == LongCompanionObject.MAX_VALUE) {
            return IAuthTabCallback(j);
        }
        return onExtraCallback(j, j2, setrevision);
    }

    private static final long onExtraCallback(long j, long j2, setRevision setrevision) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) < 0) {
            setRevision setrevision2 = setRevision.MILLISECONDS;
            if (setrevision.compareTo(setrevision2) < 0) {
                long jOnWarmupCompleted = setSignalInfo.onWarmupCompleted(1L, setrevision2, setrevision);
                setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
                return setLogBuffers.onNavigationEvent(setCommandLine.IAuthTabCallback((j / jOnWarmupCompleted) - (j2 / jOnWarmupCompleted), setrevision2), setCommandLine.IAuthTabCallback((j % jOnWarmupCompleted) - (j2 % jOnWarmupCompleted), setrevision));
            }
            return setLogBuffers.onActivityLayout(IAuthTabCallback(j3));
        }
        return setCommandLine.IAuthTabCallback(j3, setrevision);
    }
}
