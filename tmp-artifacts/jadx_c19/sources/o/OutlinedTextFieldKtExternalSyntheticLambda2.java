package o;

import android.util.Pair;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class OutlinedTextFieldKtExternalSyntheticLambda2 implements OutlinedTextFieldKtExternalSyntheticLambda12 {
    private final long[] onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long[] onNavigationEvent;

    @Override // o.OutlinedTextFieldKtExternalSyntheticLambda12
    public int IAuthTabCallback() {
        return -2147483647;
    }

    @Override // o.OutlinedTextFieldKtExternalSyntheticLambda12
    public long onExtraCallbackWithResult() {
        return 0L;
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public boolean onNavigationEvent() {
        return true;
    }

    @Override // o.OutlinedTextFieldKtExternalSyntheticLambda12
    public long onWarmupCompleted() {
        return -1L;
    }

    public static OutlinedTextFieldKtExternalSyntheticLambda2 onExtraCallbackWithResult(long j, ModalBottomSheetKtExternalSyntheticLambda8 modalBottomSheetKtExternalSyntheticLambda8, long j2) {
        int length = modalBottomSheetKtExternalSyntheticLambda8.onExtraCallbackWithResult.length;
        int i2 = length + 1;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i3 = 1; i3 <= length; i3++) {
            int i4 = i3 - 1;
            j += modalBottomSheetKtExternalSyntheticLambda8.onWarmupCompleted + modalBottomSheetKtExternalSyntheticLambda8.onExtraCallbackWithResult[i4];
            j3 += modalBottomSheetKtExternalSyntheticLambda8.IAuthTabCallback + modalBottomSheetKtExternalSyntheticLambda8.onNavigationEvent[i4];
            jArr[i3] = j;
            jArr2[i3] = j3;
        }
        return new OutlinedTextFieldKtExternalSyntheticLambda2(jArr, jArr2, j2);
    }

    private OutlinedTextFieldKtExternalSyntheticLambda2(long[] jArr, long[] jArr2, long j) {
        this.onNavigationEvent = jArr;
        this.onExtraCallback = jArr2;
        this.onExtraCallbackWithResult = j == -9223372036854775807L ? TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(jArr2[jArr2.length - 1]) : j;
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent onExtraCallback(long j) {
        Pair<Long, Long> pairIAuthTabCallback = IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(j, 0L, this.onExtraCallbackWithResult)), this.onExtraCallback, this.onNavigationEvent);
        return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(((Long) pairIAuthTabCallback.first).longValue()), ((Long) pairIAuthTabCallback.second).longValue()));
    }

    @Override // o.OutlinedTextFieldKtExternalSyntheticLambda12
    public long onExtraCallbackWithResult(long j) {
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(((Long) IAuthTabCallback(j, this.onNavigationEvent, this.onExtraCallback).second).longValue());
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public long onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    private static Pair<Long, Long> IAuthTabCallback(long j, long[] jArr, long[] jArr2) {
        int iOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(jArr, j, true, true);
        long j2 = jArr[iOnExtraCallback];
        long j3 = jArr2[iOnExtraCallback];
        int i2 = iOnExtraCallback + 1;
        if (i2 == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i2] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i2] - j3))) + j3));
    }
}
