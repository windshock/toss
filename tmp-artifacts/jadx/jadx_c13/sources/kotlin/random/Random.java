package kotlin.random;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.access15700;
import o.getPacEnabledKeys;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class Random {
    public static final Default onNavigationEvent = new Default(null);
    private static final Random onExtraCallback = access15700.onExtraCallbackWithResult.IAuthTabCallback();

    public abstract int onExtraCallback(int i);

    public int onNavigationEvent() {
        return onExtraCallback(32);
    }

    public int onExtraCallbackWithResult(int i) {
        return onExtraCallback(0, i);
    }

    public int onExtraCallback(int i, int i2) {
        int iOnNavigationEvent;
        int i3;
        int iOnExtraCallback;
        RandomKt.onExtraCallbackWithResult(i, i2);
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iOnExtraCallback = onExtraCallback(RandomKt.onNavigationEvent(i4));
            } else {
                do {
                    iOnNavigationEvent = onNavigationEvent() >>> 1;
                    i3 = iOnNavigationEvent % i4;
                } while ((iOnNavigationEvent - i3) + (i4 - 1) < 0);
                iOnExtraCallback = i3;
            }
            return i + iOnExtraCallback;
        }
        while (true) {
            int iOnNavigationEvent2 = onNavigationEvent();
            if (i <= iOnNavigationEvent2 && iOnNavigationEvent2 < i2) {
                return iOnNavigationEvent2;
            }
        }
    }

    public long IAuthTabCallbackDefault() {
        return (onNavigationEvent() << 32) + onNavigationEvent();
    }

    public long onExtraCallback(long j, long j2) {
        long jIAuthTabCallbackDefault;
        long j3;
        long jOnExtraCallback;
        int iOnNavigationEvent;
        RandomKt.onWarmupCompleted(j, j2);
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    iOnNavigationEvent = onExtraCallback(RandomKt.onNavigationEvent(i));
                } else if (i2 == 1) {
                    iOnNavigationEvent = onNavigationEvent();
                } else {
                    jOnExtraCallback = (onExtraCallback(RandomKt.onNavigationEvent(i2)) << 32) + (onNavigationEvent() & 4294967295L);
                }
                jOnExtraCallback = iOnNavigationEvent & 4294967295L;
            } else {
                do {
                    jIAuthTabCallbackDefault = IAuthTabCallbackDefault() >>> 1;
                    j3 = jIAuthTabCallbackDefault % j4;
                } while ((jIAuthTabCallbackDefault - j3) + (j4 - 1) < 0);
                jOnExtraCallback = j3;
            }
            return j + jOnExtraCallback;
        }
        while (true) {
            long jIAuthTabCallbackDefault2 = IAuthTabCallbackDefault();
            if (j <= jIAuthTabCallbackDefault2 && jIAuthTabCallbackDefault2 < j2) {
                return jIAuthTabCallbackDefault2;
            }
        }
    }

    public boolean onExtraCallback() {
        return onExtraCallback(1) != 0;
    }

    public double IAuthTabCallback() {
        return getPacEnabledKeys.onWarmupCompleted(onExtraCallback(26), onExtraCallback(27));
    }

    public double onExtraCallbackWithResult(double d, double d2) {
        double dIAuthTabCallback;
        RandomKt.onWarmupCompleted(d, d2);
        double d3 = d2 - d;
        if (Double.isInfinite(d3) && Math.abs(d) <= Double.MAX_VALUE && Math.abs(d2) <= Double.MAX_VALUE) {
            double dIAuthTabCallback2 = IAuthTabCallback() * ((d2 / 2.0d) - (d / 2.0d));
            dIAuthTabCallback = d + dIAuthTabCallback2 + dIAuthTabCallback2;
        } else {
            dIAuthTabCallback = d + (IAuthTabCallback() * d3);
        }
        return dIAuthTabCallback >= d2 ? Math.nextAfter(d2, Double.NEGATIVE_INFINITY) : dIAuthTabCallback;
    }

    public float onExtraCallbackWithResult() {
        return onExtraCallback(24) / 1.6777216E7f;
    }

    public byte[] onExtraCallbackWithResult(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        if (i < 0 || i > bArr.length || i2 < 0 || i2 > bArr.length) {
            throw new IllegalArgumentException(("fromIndex (" + i + ") or toIndex (" + i2 + ") are out of range: 0.." + bArr.length + '.').toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(("fromIndex (" + i + ") must be not greater than toIndex (" + i2 + ").").toString());
        }
        int i3 = (i2 - i) / 4;
        for (int i4 = 0; i4 < i3; i4++) {
            int iOnNavigationEvent = onNavigationEvent();
            bArr[i] = (byte) iOnNavigationEvent;
            bArr[i + 1] = (byte) (iOnNavigationEvent >>> 8);
            bArr[i + 2] = (byte) (iOnNavigationEvent >>> 16);
            bArr[i + 3] = (byte) (iOnNavigationEvent >>> 24);
            i += 4;
        }
        int i5 = i2 - i;
        int iOnExtraCallback = onExtraCallback(i5 << 3);
        for (int i6 = 0; i6 < i5; i6++) {
            bArr[i + i6] = (byte) (iOnExtraCallback >>> (i6 << 3));
        }
        return bArr;
    }

    public byte[] onExtraCallbackWithResult(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return onExtraCallbackWithResult(bArr, 0, bArr.length);
    }

    public byte[] onNavigationEvent(int i) {
        return onExtraCallbackWithResult(new byte[i]);
    }

    public static final class Default extends Random implements Serializable {
        public /* synthetic */ Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Default() {
        }

        private final Object writeReplace() {
            return Serialized.onExtraCallback;
        }

        private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        @Override // kotlin.random.Random
        public int onExtraCallback(int i) {
            return Random.onExtraCallback.onExtraCallback(i);
        }

        @Override // kotlin.random.Random
        public int onNavigationEvent() {
            return Random.onExtraCallback.onNavigationEvent();
        }

        @Override // kotlin.random.Random
        public int onExtraCallbackWithResult(int i) {
            return Random.onExtraCallback.onExtraCallbackWithResult(i);
        }

        @Override // kotlin.random.Random
        public int onExtraCallback(int i, int i2) {
            return Random.onExtraCallback.onExtraCallback(i, i2);
        }

        @Override // kotlin.random.Random
        public long IAuthTabCallbackDefault() {
            return Random.onExtraCallback.IAuthTabCallbackDefault();
        }

        @Override // kotlin.random.Random
        public long onExtraCallback(long j, long j2) {
            return Random.onExtraCallback.onExtraCallback(j, j2);
        }

        @Override // kotlin.random.Random
        public boolean onExtraCallback() {
            return Random.onExtraCallback.onExtraCallback();
        }

        @Override // kotlin.random.Random
        public double IAuthTabCallback() {
            return Random.onExtraCallback.IAuthTabCallback();
        }

        @Override // kotlin.random.Random
        public double onExtraCallbackWithResult(double d, double d2) {
            return Random.onExtraCallback.onExtraCallbackWithResult(d, d2);
        }

        @Override // kotlin.random.Random
        public float onExtraCallbackWithResult() {
            return Random.onExtraCallback.onExtraCallbackWithResult();
        }

        @Override // kotlin.random.Random
        public byte[] onExtraCallbackWithResult(@NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "");
            return Random.onExtraCallback.onExtraCallbackWithResult(bArr);
        }

        @Override // kotlin.random.Random
        public byte[] onNavigationEvent(int i) {
            return Random.onExtraCallback.onNavigationEvent(i);
        }

        @Override // kotlin.random.Random
        public byte[] onExtraCallbackWithResult(@NotNull byte[] bArr, int i, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "");
            return Random.onExtraCallback.onExtraCallbackWithResult(bArr, i, i2);
        }
    }
}
