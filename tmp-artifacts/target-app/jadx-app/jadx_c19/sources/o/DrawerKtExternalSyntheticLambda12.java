package o;

import android.util.Range;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class DrawerKtExternalSyntheticLambda12 {
    private double IAuthTabCallback;
    private long onExtraCallback;
    private Range<Double> onNavigationEvent;
    private long onWarmupCompleted;

    public DrawerKtExternalSyntheticLambda12(float f) {
        RecordingInputConnection_androidKt.onNavigationEvent(f > 0.0f);
        Range<Double> range = new Range<>(Double.valueOf(0.0d), Double.valueOf(1.0d / f));
        this.onNavigationEvent = range;
        this.IAuthTabCallback = ((Double) range.getUpper()).doubleValue();
        this.onWarmupCompleted = -9223372036854775807L;
        this.onExtraCallback = -9223372036854775807L;
    }

    public void onExtraCallback(long j, long j2) {
        RecordingInputConnection_androidKt.onNavigationEvent(j != -9223372036854775807L);
        RecordingInputConnection_androidKt.onNavigationEvent(j2 != -9223372036854775807L);
        onExtraCallbackWithResult(((Double) this.onNavigationEvent.clamp(Double.valueOf(onExtraCallbackWithResult(j, j2)))).doubleValue());
        this.onWarmupCompleted = j;
        this.onExtraCallback = j2;
    }

    public long IAuthTabCallback(long j) {
        if (this.onWarmupCompleted == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (this.onExtraCallback + ((j - r0) * this.IAuthTabCallback));
    }

    public void onWarmupCompleted(float f) {
        RecordingInputConnection_androidKt.onNavigationEvent(f > 0.0f);
        this.onNavigationEvent = new Range<>(Double.valueOf(0.0d), Double.valueOf(1.0d / f));
        onExtraCallbackWithResult();
    }

    public void onExtraCallbackWithResult() {
        this.IAuthTabCallback = ((Double) this.onNavigationEvent.getUpper()).doubleValue();
        this.onWarmupCompleted = -9223372036854775807L;
        this.onExtraCallback = -9223372036854775807L;
    }

    private double onExtraCallbackWithResult(long j, long j2) {
        long j3 = this.onWarmupCompleted;
        if (j3 != -9223372036854775807L) {
            if (this.onExtraCallback != -9223372036854775807L && j != j3) {
                return (j2 - r4) / (j - j3);
            }
        }
        return ((Double) this.onNavigationEvent.getUpper()).doubleValue();
    }

    private void onExtraCallbackWithResult(double d) {
        this.IAuthTabCallback = (this.IAuthTabCallback * 0.800000011920929d) + (d * 0.20000000298023224d);
    }
}
