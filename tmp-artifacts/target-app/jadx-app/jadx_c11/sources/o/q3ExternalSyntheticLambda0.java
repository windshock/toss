package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q3ExternalSyntheticLambda0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final int IAuthTabCallback;
    private final int onExtraCallback;
    private final int onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof q3ExternalSyntheticLambda0)) {
            return false;
        }
        q3ExternalSyntheticLambda0 q3externalsyntheticlambda0 = (q3ExternalSyntheticLambda0) obj;
        if (this.onNavigationEvent != q3externalsyntheticlambda0.onNavigationEvent) {
            int i4 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.onExtraCallback != q3externalsyntheticlambda0.onExtraCallback) {
            return false;
        }
        if (this.IAuthTabCallback == q3externalsyntheticlambda0.IAuthTabCallback) {
            return true;
        }
        int i6 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Integer.hashCode(this.onNavigationEvent) * 31) + Integer.hashCode(this.onExtraCallback)) * 31) + Integer.hashCode(this.IAuthTabCallback);
        int i4 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MonitoringEventDispatchQueueConfig(capacity=" + this.onNavigationEvent + ", maxBatchSize=" + this.onExtraCallback + ", dropReportInterval=" + this.IAuthTabCallback + ")";
        int i2 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 9 / 0;
        }
        return str;
    }

    public q3ExternalSyntheticLambda0(int i, int i2, int i3) {
        this.onNavigationEvent = i;
        this.onExtraCallback = i2;
        this.IAuthTabCallback = i3;
        if (i <= 0) {
            throw new IllegalArgumentException("capacity must be positive");
        }
        if (i2 > 0) {
            int i4 = onExtraCallbackWithResult + 113;
            int i5 = i4 % 128;
            onWarmupCompleted = i5;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (i3 <= 0) {
                throw new IllegalArgumentException("dropReportInterval must be positive");
            }
            int i6 = i5 + 53;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        throw new IllegalArgumentException("maxBatchSize must be positive");
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.onExtraCallback;
        if (i3 != 0) {
            int i5 = 88 / 0;
        }
        return i4;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 13;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.IAuthTabCallback;
        int i6 = i2 + 91;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
