package o;

import androidx.annotation.Nullable;
import o.ExposedDropdownMenuDefaultsExternalSyntheticLambda2;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class OutlinedTextFieldKtExternalSyntheticLambda8 implements OutlinedTextFieldKtExternalSyntheticLambda12 {
    private final int IAuthTabCallback;
    private final int IAuthTabCallbackStub;
    private final long[] asBinder;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final long onWarmupCompleted;

    public static OutlinedTextFieldKtExternalSyntheticLambda8 onWarmupCompleted(OutlinedTextFieldKtExternalSyntheticLambda4 outlinedTextFieldKtExternalSyntheticLambda4, long j) {
        long jOnExtraCallback = outlinedTextFieldKtExternalSyntheticLambda4.onExtraCallback();
        if (jOnExtraCallback == -9223372036854775807L) {
            return null;
        }
        ExposedDropdownMenuDefaultsExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback = outlinedTextFieldKtExternalSyntheticLambda4.onWarmupCompleted;
        return new OutlinedTextFieldKtExternalSyntheticLambda8(j, iAuthTabCallback.onExtraCallback, jOnExtraCallback, iAuthTabCallback.onExtraCallbackWithResult, outlinedTextFieldKtExternalSyntheticLambda4.onExtraCallbackWithResult, outlinedTextFieldKtExternalSyntheticLambda4.asInterface);
    }

    private OutlinedTextFieldKtExternalSyntheticLambda8(long j, int i2, long j2, int i3, long j3, @Nullable long[] jArr) {
        this.onWarmupCompleted = j;
        this.IAuthTabCallbackStub = i2;
        this.onExtraCallback = j2;
        this.IAuthTabCallback = i3;
        this.onExtraCallbackWithResult = j3;
        this.asBinder = jArr;
        this.onNavigationEvent = j3 != -1 ? j + j3 : -1L;
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public boolean onNavigationEvent() {
        return this.asBinder != null;
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent onExtraCallback(long j) {
        if (!onNavigationEvent()) {
            return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(0L, this.onWarmupCompleted + this.IAuthTabCallbackStub));
        }
        long jOnWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(j, 0L, this.onExtraCallback);
        double d = (jOnWarmupCompleted * 100.0d) / this.onExtraCallback;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i2 = (int) d;
                double d3 = ((long[]) RecordingInputConnection_androidKt.onWarmupCompleted(this.asBinder))[i2];
                d2 = d3 + ((d - i2) * ((i2 == 99 ? 256.0d : r3[i2 + 1]) - d3));
            }
        }
        return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(jOnWarmupCompleted, this.onWarmupCompleted + TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(Math.round((d2 / 256.0d) * this.onExtraCallbackWithResult), this.IAuthTabCallbackStub, this.onExtraCallbackWithResult - 1)));
    }

    @Override // o.OutlinedTextFieldKtExternalSyntheticLambda12
    public long onExtraCallbackWithResult(long j) {
        long j2 = j - this.onWarmupCompleted;
        if (!onNavigationEvent() || j2 <= this.IAuthTabCallbackStub) {
            return 0L;
        }
        long[] jArr = (long[]) RecordingInputConnection_androidKt.onWarmupCompleted(this.asBinder);
        double d = (j2 * 256.0d) / this.onExtraCallbackWithResult;
        int iOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(jArr, (long) d, true, true);
        long jOnNavigationEvent = onNavigationEvent(iOnExtraCallback);
        long j3 = jArr[iOnExtraCallback];
        int i2 = iOnExtraCallback + 1;
        long jOnNavigationEvent2 = onNavigationEvent(i2);
        return jOnNavigationEvent + Math.round((j3 == (iOnExtraCallback == 99 ? 256L : jArr[i2]) ? 0.0d : (d - j3) / (r0 - j3)) * (jOnNavigationEvent2 - jOnNavigationEvent));
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public long onExtraCallback() {
        return this.onExtraCallback;
    }

    @Override // o.OutlinedTextFieldKtExternalSyntheticLambda12
    public long onExtraCallbackWithResult() {
        return this.onWarmupCompleted + this.IAuthTabCallbackStub;
    }

    @Override // o.OutlinedTextFieldKtExternalSyntheticLambda12
    public long onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    @Override // o.OutlinedTextFieldKtExternalSyntheticLambda12
    public int IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    private long onNavigationEvent(int i2) {
        return (this.onExtraCallback * i2) / 100;
    }
}
