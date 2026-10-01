package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinNativeAdImplb implements immediateFailedFuture {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final float onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof AppLovinNativeAdImplb) || Float.compare(this.onWarmupCompleted, ((AppLovinNativeAdImplb) obj).onWarmupCompleted) != 0) {
            return false;
        }
        int i4 = onExtraCallbackWithResult + 117;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        float f = this.onWarmupCompleted;
        if (i3 == 0) {
            return Float.hashCode(f);
        }
        Float.hashCode(f);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ScaledFit(factor=" + this.onWarmupCompleted + ")";
        int i2 = onExtraCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public AppLovinNativeAdImplb(float f) {
        this.onWarmupCompleted = f;
    }

    public long onExtraCallback(long j, long j2) {
        long jOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            jOnExtraCallbackWithResult = hasRawImageCapture.onExtraCallbackWithResult(immediateFailedFuture.Companion.IAuthTabCallback().onExtraCallback(j, j2), this.onWarmupCompleted);
            int i3 = 16 / 0;
        } else {
            jOnExtraCallbackWithResult = hasRawImageCapture.onExtraCallbackWithResult(immediateFailedFuture.Companion.IAuthTabCallback().onExtraCallback(j, j2), this.onWarmupCompleted);
        }
        int i4 = onExtraCallback + 89;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return jOnExtraCallbackWithResult;
    }
}
