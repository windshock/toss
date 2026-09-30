package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setViewableVideo50Requests implements immediateFailedFuture {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final float onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof setViewableVideo50Requests) {
            if (Float.compare(this.onWarmupCompleted, ((setViewableVideo50Requests) obj).onWarmupCompleted) == 0) {
                return true;
            }
            int i2 = onExtraCallbackWithResult + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = onExtraCallbackWithResult + 97;
        int i5 = i4 % 128;
        onExtraCallback = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 107;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Float.hashCode(this.onWarmupCompleted);
        int i4 = onExtraCallbackWithResult + 105;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ScaledCrop(factor=" + this.onWarmupCompleted + ")";
        int i2 = onExtraCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 19 / 0;
        }
        return str;
    }

    public setViewableVideo50Requests(float f) {
        this.onWarmupCompleted = f;
    }

    public long onExtraCallback(long j, long j2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            hasRawImageCapture.onExtraCallbackWithResult(immediateFailedFuture.Companion.onWarmupCompleted().onExtraCallback(j, j2), this.onWarmupCompleted);
            throw null;
        }
        long jOnExtraCallbackWithResult = hasRawImageCapture.onExtraCallbackWithResult(immediateFailedFuture.Companion.onWarmupCompleted().onExtraCallback(j, j2), this.onWarmupCompleted);
        int i3 = onExtraCallbackWithResult + 91;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return jOnExtraCallbackWithResult;
    }
}
