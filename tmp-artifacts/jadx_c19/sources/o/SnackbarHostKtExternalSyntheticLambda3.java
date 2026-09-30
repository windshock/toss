package o;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SnackbarHostKtExternalSyntheticLambda3 {
    private boolean IAuthTabCallback;
    private boolean onExtraCallbackWithResult;
    private boolean onWarmupCompleted;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda24 onTransact = new TextFieldDecoratorModifierNodeExternalSyntheticLambda24(0);
    private long onExtraCallback = -9223372036854775807L;
    private long asInterface = -9223372036854775807L;
    private long onNavigationEvent = -9223372036854775807L;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 IAuthTabCallbackStub = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();

    SnackbarHostKtExternalSyntheticLambda3() {
    }

    public boolean IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    public TextFieldDecoratorModifierNodeExternalSyntheticLambda24 onExtraCallbackWithResult() {
        return this.onTransact;
    }

    public int onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        if (!this.IAuthTabCallback) {
            return onWarmupCompleted(drawerKtExternalSyntheticLambda9, exposedDropdownMenuDefaultsExternalSyntheticLambda3);
        }
        if (this.asInterface == -9223372036854775807L) {
            return onNavigationEvent(drawerKtExternalSyntheticLambda9);
        }
        if (!this.onExtraCallbackWithResult) {
            return onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, exposedDropdownMenuDefaultsExternalSyntheticLambda3);
        }
        long j = this.onExtraCallback;
        if (j == -9223372036854775807L) {
            return onNavigationEvent(drawerKtExternalSyntheticLambda9);
        }
        this.onNavigationEvent = this.onTransact.asInterface(this.asInterface) - this.onTransact.IAuthTabCallback(j);
        return onNavigationEvent(drawerKtExternalSyntheticLambda9);
    }

    public long onExtraCallback() {
        return this.onNavigationEvent;
    }

    public static long IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, 9);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
        if (onNavigationEvent(bArr)) {
            return onWarmupCompleted(bArr);
        }
        return -9223372036854775807L;
    }

    private int onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) {
        this.IAuthTabCallbackStub.onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted);
        this.onWarmupCompleted = true;
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        return 0;
    }

    private int onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        int iMin = (int) Math.min(20000L, drawerKtExternalSyntheticLambda9.onExtraCallback());
        if (drawerKtExternalSyntheticLambda9.IAuthTabCallback() != 0) {
            exposedDropdownMenuDefaultsExternalSyntheticLambda3.onWarmupCompleted = 0L;
            return 1;
        }
        this.IAuthTabCallbackStub.onExtraCallback(iMin);
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.IAuthTabCallbackStub.onExtraCallback(), 0, iMin);
        this.onExtraCallback = onWarmupCompleted(this.IAuthTabCallbackStub);
        this.onExtraCallbackWithResult = true;
        return 0;
    }

    private long onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult();
        for (int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(); iOnWarmupCompleted < iOnExtraCallbackWithResult - 3; iOnWarmupCompleted++) {
            if (onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), iOnWarmupCompleted) == 442) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted + 4);
                long jIAuthTabCallback = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                if (jIAuthTabCallback != -9223372036854775807L) {
                    return jIAuthTabCallback;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        long jOnExtraCallback = drawerKtExternalSyntheticLambda9.onExtraCallback();
        int iMin = (int) Math.min(20000L, jOnExtraCallback);
        long j = jOnExtraCallback - iMin;
        if (drawerKtExternalSyntheticLambda9.IAuthTabCallback() != j) {
            exposedDropdownMenuDefaultsExternalSyntheticLambda3.onWarmupCompleted = j;
            return 1;
        }
        this.IAuthTabCallbackStub.onExtraCallback(iMin);
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.IAuthTabCallbackStub.onExtraCallback(), 0, iMin);
        this.asInterface = onExtraCallback(this.IAuthTabCallbackStub);
        this.IAuthTabCallback = true;
        return 0;
    }

    private long onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        for (int iOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult() - 4; iOnExtraCallbackWithResult >= iOnWarmupCompleted; iOnExtraCallbackWithResult--) {
            if (onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), iOnExtraCallbackWithResult) == 442) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnExtraCallbackWithResult + 4);
                long jIAuthTabCallback = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                if (jIAuthTabCallback != -9223372036854775807L) {
                    return jIAuthTabCallback;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int onWarmupCompleted(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }

    private static boolean onNavigationEvent(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private static long onWarmupCompleted(byte[] bArr) {
        long j = bArr[0];
        long j2 = ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20);
        long j3 = bArr[2];
        return j2 | (((j3 & 248) >> 3) << 15) | ((j3 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }
}
