package o;

import java.util.Arrays;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DrawerKtExternalSyntheticLambda29 implements ExposedDropdownMenu_androidKtExternalSyntheticLambda4 {
    public final long[] IAuthTabCallback;
    public final long[] onExtraCallback;
    public final int[] onExtraCallbackWithResult;
    public final int onNavigationEvent;
    private final long onTransact;
    public final long[] onWarmupCompleted;

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public boolean onNavigationEvent() {
        return true;
    }

    public DrawerKtExternalSyntheticLambda29(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.onExtraCallbackWithResult = iArr;
        this.onWarmupCompleted = jArr;
        this.IAuthTabCallback = jArr2;
        this.onExtraCallback = jArr3;
        int length = iArr.length;
        this.onNavigationEvent = length;
        if (length > 0) {
            int i2 = length - 1;
            this.onTransact = jArr2[i2] + jArr3[i2];
        } else {
            this.onTransact = 0L;
        }
    }

    public int onWarmupCompleted(long j) {
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(this.onExtraCallback, j, true, true);
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public long onExtraCallback() {
        return this.onTransact;
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent onExtraCallback(long j) {
        int iOnWarmupCompleted = onWarmupCompleted(j);
        ExposedDropdownMenu_androidKtExternalSyntheticLambda3 exposedDropdownMenu_androidKtExternalSyntheticLambda3 = new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(this.onExtraCallback[iOnWarmupCompleted], this.onWarmupCompleted[iOnWarmupCompleted]);
        if (exposedDropdownMenu_androidKtExternalSyntheticLambda3.onExtraCallbackWithResult >= j || iOnWarmupCompleted == this.onNavigationEvent - 1) {
            return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(exposedDropdownMenu_androidKtExternalSyntheticLambda3);
        }
        int i2 = iOnWarmupCompleted + 1;
        return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(exposedDropdownMenu_androidKtExternalSyntheticLambda3, new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(this.onExtraCallback[i2], this.onWarmupCompleted[i2]));
    }

    public String toString() {
        return "ChunkIndex(length=" + this.onNavigationEvent + ", sizes=" + Arrays.toString(this.onExtraCallbackWithResult) + ", offsets=" + Arrays.toString(this.onWarmupCompleted) + ", timeUs=" + Arrays.toString(this.onExtraCallback) + ", durationsUs=" + Arrays.toString(this.IAuthTabCallback) + ")";
    }
}
