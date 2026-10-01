package o;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SnackbarKtExternalSyntheticLambda1 {
    private boolean IAuthTabCallback;
    private final int asBinder;
    private boolean onExtraCallbackWithResult;
    private boolean onWarmupCompleted;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda24 asInterface = new TextFieldDecoratorModifierNodeExternalSyntheticLambda24(0);
    private long onExtraCallback = -9223372036854775807L;
    private long IAuthTabCallbackStub = -9223372036854775807L;
    private long onNavigationEvent = -9223372036854775807L;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 IAuthTabCallbackDefault = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();

    SnackbarKtExternalSyntheticLambda1(int i2) {
        this.asBinder = i2;
    }

    public boolean onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public int onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3, int i2) throws IOException {
        if (i2 <= 0) {
            return onExtraCallback(drawerKtExternalSyntheticLambda9);
        }
        if (!this.onWarmupCompleted) {
            return onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, exposedDropdownMenuDefaultsExternalSyntheticLambda3, i2);
        }
        if (this.IAuthTabCallbackStub == -9223372036854775807L) {
            return onExtraCallback(drawerKtExternalSyntheticLambda9);
        }
        if (!this.onExtraCallbackWithResult) {
            return onExtraCallback(drawerKtExternalSyntheticLambda9, exposedDropdownMenuDefaultsExternalSyntheticLambda3, i2);
        }
        long j = this.onExtraCallback;
        if (j == -9223372036854775807L) {
            return onExtraCallback(drawerKtExternalSyntheticLambda9);
        }
        this.onNavigationEvent = this.asInterface.asInterface(this.IAuthTabCallbackStub) - this.asInterface.IAuthTabCallback(j);
        return onExtraCallback(drawerKtExternalSyntheticLambda9);
    }

    public long IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public TextFieldDecoratorModifierNodeExternalSyntheticLambda24 onExtraCallback() {
        return this.asInterface;
    }

    private int onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) {
        this.IAuthTabCallbackDefault.onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted);
        this.IAuthTabCallback = true;
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        return 0;
    }

    private int onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3, int i2) throws IOException {
        int iMin = (int) Math.min(this.asBinder, drawerKtExternalSyntheticLambda9.onExtraCallback());
        if (drawerKtExternalSyntheticLambda9.IAuthTabCallback() != 0) {
            exposedDropdownMenuDefaultsExternalSyntheticLambda3.onWarmupCompleted = 0L;
            return 1;
        }
        this.IAuthTabCallbackDefault.onExtraCallback(iMin);
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.IAuthTabCallbackDefault.onExtraCallback(), 0, iMin);
        this.onExtraCallback = onWarmupCompleted(this.IAuthTabCallbackDefault, i2);
        this.onExtraCallbackWithResult = true;
        return 0;
    }

    private long onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        int iOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult();
        for (int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(); iOnWarmupCompleted < iOnExtraCallbackWithResult; iOnWarmupCompleted++) {
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback()[iOnWarmupCompleted] == 71) {
                long jOnExtraCallback = SnackbarKtExternalSyntheticLambda2.onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnWarmupCompleted, i2);
                if (jOnExtraCallback != -9223372036854775807L) {
                    return jOnExtraCallback;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3, int i2) throws IOException {
        long jOnExtraCallback = drawerKtExternalSyntheticLambda9.onExtraCallback();
        int iMin = (int) Math.min(this.asBinder, jOnExtraCallback);
        long j = jOnExtraCallback - iMin;
        if (drawerKtExternalSyntheticLambda9.IAuthTabCallback() != j) {
            exposedDropdownMenuDefaultsExternalSyntheticLambda3.onWarmupCompleted = j;
            return 1;
        }
        this.IAuthTabCallbackDefault.onExtraCallback(iMin);
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.IAuthTabCallbackDefault.onExtraCallback(), 0, iMin);
        this.IAuthTabCallbackStub = onNavigationEvent(this.IAuthTabCallbackDefault, i2);
        this.onWarmupCompleted = true;
        return 0;
    }

    private long onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        int iOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult();
        for (int i3 = iOnExtraCallbackWithResult - 188; i3 >= iOnWarmupCompleted; i3--) {
            if (SnackbarKtExternalSyntheticLambda2.onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), iOnWarmupCompleted, iOnExtraCallbackWithResult, i3)) {
                long jOnExtraCallback = SnackbarKtExternalSyntheticLambda2.onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, i3, i2);
                if (jOnExtraCallback != -9223372036854775807L) {
                    return jOnExtraCallback;
                }
            }
        }
        return -9223372036854775807L;
    }
}
