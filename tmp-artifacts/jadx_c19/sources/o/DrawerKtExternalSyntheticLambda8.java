package o;

import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class DrawerKtExternalSyntheticLambda8 implements ExposedDropdownMenu_androidKtExternalSyntheticLambda4 {
    private final boolean IAuthTabCallback;
    private final long IAuthTabCallbackStub;
    private final int asInterface;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final int onWarmupCompleted;

    public DrawerKtExternalSyntheticLambda8(long j, long j2, int i2, int i3, boolean z) {
        this.IAuthTabCallbackStub = j;
        this.onExtraCallbackWithResult = j2;
        this.asInterface = i3 == -1 ? 1 : i3;
        this.onWarmupCompleted = i2;
        this.IAuthTabCallback = z;
        if (j == -1) {
            this.onExtraCallback = -1L;
            this.onNavigationEvent = -9223372036854775807L;
        } else {
            this.onExtraCallback = j - j2;
            this.onNavigationEvent = onExtraCallbackWithResult(j, j2, i2);
        }
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public boolean onNavigationEvent() {
        return this.onExtraCallback != -1 || this.IAuthTabCallback;
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent onExtraCallback(long j) {
        if (this.onExtraCallback == -1 && !this.IAuthTabCallback) {
            return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(0L, this.onExtraCallbackWithResult));
        }
        long jIAuthTabCallback = IAuthTabCallback(j);
        long jOnWarmupCompleted = onWarmupCompleted(jIAuthTabCallback);
        ExposedDropdownMenu_androidKtExternalSyntheticLambda3 exposedDropdownMenu_androidKtExternalSyntheticLambda3 = new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(jOnWarmupCompleted, jIAuthTabCallback);
        if (this.onExtraCallback != -1 && jOnWarmupCompleted < j) {
            long j2 = this.asInterface + jIAuthTabCallback;
            if (j2 < this.IAuthTabCallbackStub) {
                return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(exposedDropdownMenu_androidKtExternalSyntheticLambda3, new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(onWarmupCompleted(j2), j2));
            }
        }
        return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(exposedDropdownMenu_androidKtExternalSyntheticLambda3);
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public long onExtraCallback() {
        return this.onNavigationEvent;
    }

    public long onWarmupCompleted(long j) {
        return onExtraCallbackWithResult(j, this.onExtraCallbackWithResult, this.onWarmupCompleted);
    }

    private static long onExtraCallbackWithResult(long j, long j2, int i2) {
        return (Math.max(0L, j - j2) * 8000000) / i2;
    }

    private long IAuthTabCallback(long j) {
        long j2 = this.asInterface;
        long jMin = (((j * this.onWarmupCompleted) / 8000000) / j2) * j2;
        long j3 = this.onExtraCallback;
        if (j3 != -1) {
            jMin = Math.min(jMin, j3 - j2);
        }
        return this.onExtraCallbackWithResult + Math.max(jMin, 0L);
    }
}
