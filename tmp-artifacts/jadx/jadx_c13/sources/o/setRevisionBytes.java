package o;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setRevisionBytes implements Comparable<setRevisionBytes>, Serializable {
    private final long epochSeconds;
    private final int nanosecondsOfSecond;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static final setRevisionBytes onWarmupCompleted = new setRevisionBytes(-31557014167219200L, 0);
    private static final setRevisionBytes onExtraCallbackWithResult = new setRevisionBytes(31556889864403199L, 999999999);

    public setRevisionBytes(long j, int i) {
        this.epochSeconds = j;
        this.nanosecondsOfSecond = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    public final long onExtraCallback() {
        return this.epochSeconds;
    }

    public final int onNavigationEvent() {
        return this.nanosecondsOfSecond;
    }

    public final long onExtraCallbackWithResult() {
        long j = this.epochSeconds;
        long j2 = 1000;
        if (j >= 0) {
            if (j != 1) {
                if (j != 0) {
                    long j3 = j * 1000;
                    if (j3 / 1000 != j) {
                        return LongCompanionObject.MAX_VALUE;
                    }
                    j2 = j3;
                } else {
                    j2 = 0;
                }
            }
            long j4 = this.nanosecondsOfSecond / 1000000;
            long j5 = j2 + j4;
            return ((j2 ^ j5) >= 0 || (j4 ^ j2) < 0) ? j5 : LongCompanionObject.MAX_VALUE;
        }
        long j6 = j + 1;
        if (j6 != 1) {
            if (j6 != 0) {
                long j7 = j6 * 1000;
                if (j7 / 1000 != j6) {
                    return Long.MIN_VALUE;
                }
                j2 = j7;
            } else {
                j2 = 0;
            }
        }
        long j8 = (this.nanosecondsOfSecond / 1000000) - 1000;
        long j9 = j2 + j8;
        if ((j2 ^ j9) >= 0 || (j8 ^ j2) < 0) {
            return j9;
        }
        return Long.MIN_VALUE;
    }

    @Override // java.lang.Comparable
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull setRevisionBytes setrevisionbytes) {
        Intrinsics.checkNotNullParameter(setrevisionbytes, "");
        int iCompare = Intrinsics.compare(this.epochSeconds, setrevisionbytes.epochSeconds);
        return iCompare != 0 ? iCompare : Intrinsics.compare(this.nanosecondsOfSecond, setrevisionbytes.nanosecondsOfSecond);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setRevisionBytes)) {
            return false;
        }
        setRevisionBytes setrevisionbytes = (setRevisionBytes) obj;
        return this.epochSeconds == setrevisionbytes.epochSeconds && this.nanosecondsOfSecond == setrevisionbytes.nanosecondsOfSecond;
    }

    public int hashCode() {
        return Long.hashCode(this.epochSeconds) + (this.nanosecondsOfSecond * 51);
    }

    public String toString() {
        return containsThreads.onWarmupCompleted(this);
    }

    private final Object writeReplace() {
        return setUid.onWarmupCompleted(this);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final setRevisionBytes onExtraCallback(long j) {
            long j2 = j / 1000;
            if ((j ^ 1000) < 0 && j2 * 1000 != j) {
                j2--;
            }
            long j3 = j % 1000;
            int i = (int) ((j3 + (1000 & (((j3 ^ 1000) & ((-j3) | j3)) >> 63))) * 1000000);
            if (j2 < -31557014167219200L) {
                return onWarmupCompleted();
            }
            if (j2 > 31556889864403199L) {
                return IAuthTabCallback();
            }
            return IAuthTabCallback(j2, i);
        }

        public final setRevisionBytes onExtraCallbackWithResult(long j, long j2) {
            long j3 = j2 / 1000000000;
            if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
                j3--;
            }
            long j4 = j + j3;
            if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
                return j > 0 ? setRevisionBytes.Companion.IAuthTabCallback() : setRevisionBytes.Companion.onWarmupCompleted();
            }
            if (j4 < -31557014167219200L) {
                return onWarmupCompleted();
            }
            if (j4 > 31556889864403199L) {
                return IAuthTabCallback();
            }
            long j5 = j2 % 1000000000;
            return new setRevisionBytes(j4, (int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)));
        }

        public final setRevisionBytes IAuthTabCallback(long j, int i) {
            return onExtraCallbackWithResult(j, i);
        }

        public final setRevisionBytes onExtraCallback() {
            return IAuthTabCallback(-3217862419201L, 999999999);
        }

        public final setRevisionBytes onWarmupCompleted() {
            return setRevisionBytes.onWarmupCompleted;
        }

        public final setRevisionBytes IAuthTabCallback() {
            return setRevisionBytes.onExtraCallbackWithResult;
        }
    }
}
