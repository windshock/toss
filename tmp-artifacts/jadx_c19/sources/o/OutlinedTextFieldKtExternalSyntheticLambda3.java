package o;

import o.ExposedDropdownMenuDefaultsExternalSyntheticLambda2;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class OutlinedTextFieldKtExternalSyntheticLambda3 implements OutlinedTextFieldKtExternalSyntheticLambda12 {
    private final long[] IAuthTabCallback;
    private final long[] IAuthTabCallbackStub;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final int onWarmupCompleted;

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public boolean onNavigationEvent() {
        return true;
    }

    public static OutlinedTextFieldKtExternalSyntheticLambda3 onWarmupCompleted(long j, long j2, ExposedDropdownMenuDefaultsExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        long jMax;
        int iOnMinimized;
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(6);
        long j3 = j2 + iAuthTabCallback.onExtraCallback;
        long jAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() + j3;
        int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        if (iAsBinder <= 0) {
            return null;
        }
        long jOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback((iAsBinder * iAuthTabCallback.IAuthTabCallbackStub) - 1, iAuthTabCallback.onNavigationEvent);
        int iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
        int iOnUnminimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
        int iOnUnminimized3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(2);
        long[] jArr = new long[iOnUnminimized];
        long[] jArr2 = new long[iOnUnminimized];
        long j4 = j2 + iAuthTabCallback.onExtraCallback;
        int i2 = 0;
        while (i2 < iOnUnminimized) {
            long j5 = j3;
            long j6 = jAsBinder;
            jArr[i2] = (i2 * jOnExtraCallback) / iOnUnminimized;
            jArr2[i2] = j4;
            if (iOnUnminimized3 == 1) {
                iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            } else if (iOnUnminimized3 == 2) {
                iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
            } else if (iOnUnminimized3 == 3) {
                iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMessageChannelReady();
            } else {
                if (iOnUnminimized3 != 4) {
                    return null;
                }
                iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
            }
            j4 += iOnMinimized * iOnUnminimized2;
            i2++;
            iOnUnminimized = iOnUnminimized;
            j3 = j5;
            jAsBinder = j6;
        }
        long j7 = jAsBinder;
        long j8 = j3;
        if (j == -1 || j == j7) {
            jMax = j7;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("VBRI data size mismatch: ");
            sb.append(j);
            sb.append(", ");
            jMax = j7;
            sb.append(jMax);
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("VbriSeeker", sb.toString());
        }
        if (jMax != j4) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + jMax + ", " + j4 + "\nSeeking will be inaccurate.");
            jMax = Math.max(jMax, j4);
        }
        return new OutlinedTextFieldKtExternalSyntheticLambda3(jArr, jArr2, jOnExtraCallback, j8, jMax, iAuthTabCallback.onExtraCallbackWithResult);
    }

    private OutlinedTextFieldKtExternalSyntheticLambda3(long[] jArr, long[] jArr2, long j, long j2, long j3, int i2) {
        this.IAuthTabCallbackStub = jArr;
        this.IAuthTabCallback = jArr2;
        this.onNavigationEvent = j;
        this.onExtraCallbackWithResult = j2;
        this.onExtraCallback = j3;
        this.onWarmupCompleted = i2;
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent onExtraCallback(long j) {
        int iOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(this.IAuthTabCallbackStub, j, true, true);
        ExposedDropdownMenu_androidKtExternalSyntheticLambda3 exposedDropdownMenu_androidKtExternalSyntheticLambda3 = new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(this.IAuthTabCallbackStub[iOnExtraCallback], this.IAuthTabCallback[iOnExtraCallback]);
        if (exposedDropdownMenu_androidKtExternalSyntheticLambda3.onExtraCallbackWithResult < j) {
            long[] jArr = this.IAuthTabCallbackStub;
            if (iOnExtraCallback != jArr.length - 1) {
                int i2 = iOnExtraCallback + 1;
                return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(exposedDropdownMenu_androidKtExternalSyntheticLambda3, new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(jArr[i2], this.IAuthTabCallback[i2]));
            }
        }
        return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(exposedDropdownMenu_androidKtExternalSyntheticLambda3);
    }

    @Override // o.OutlinedTextFieldKtExternalSyntheticLambda12
    public long onExtraCallbackWithResult(long j) {
        return this.IAuthTabCallbackStub[TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(this.IAuthTabCallback, j, true, true)];
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public long onExtraCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.OutlinedTextFieldKtExternalSyntheticLambda12
    public long onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.OutlinedTextFieldKtExternalSyntheticLambda12
    public long onWarmupCompleted() {
        return this.onExtraCallback;
    }

    @Override // o.OutlinedTextFieldKtExternalSyntheticLambda12
    public int IAuthTabCallback() {
        return this.onWarmupCompleted;
    }
}
