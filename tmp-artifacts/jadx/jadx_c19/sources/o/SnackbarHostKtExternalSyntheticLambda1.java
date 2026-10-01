package o;

import java.io.IOException;
import o.DrawerKtExternalSyntheticLambda28;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SnackbarHostKtExternalSyntheticLambda1 extends DrawerKtExternalSyntheticLambda28 {
    public SnackbarHostKtExternalSyntheticLambda1(TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24, long j, long j2) {
        super(new DrawerKtExternalSyntheticLambda28.onNavigationEvent(), new IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda24), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    static final class IAuthTabCallback implements DrawerKtExternalSyntheticLambda28.onTransact {
        private final TextFieldDecoratorModifierNodeExternalSyntheticLambda24 onExtraCallback;
        private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onExtraCallbackWithResult;

        private IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24) {
            this.onExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda24;
            this.onExtraCallbackWithResult = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
        }

        @Override // o.DrawerKtExternalSyntheticLambda28.onTransact
        public DrawerKtExternalSyntheticLambda28.onExtraCallbackWithResult onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, long j) throws IOException {
            long jIAuthTabCallback = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
            int iMin = (int) Math.min(20000L, drawerKtExternalSyntheticLambda9.onExtraCallback() - jIAuthTabCallback);
            this.onExtraCallbackWithResult.onExtraCallback(iMin);
            drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.onExtraCallbackWithResult.onExtraCallback(), 0, iMin);
            return onExtraCallbackWithResult(this.onExtraCallbackWithResult, j, jIAuthTabCallback);
        }

        @Override // o.DrawerKtExternalSyntheticLambda28.onTransact
        public void onExtraCallbackWithResult() {
            this.onExtraCallbackWithResult.onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted);
        }

        private DrawerKtExternalSyntheticLambda28.onExtraCallbackWithResult onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, long j, long j2) {
            int iOnWarmupCompleted = -1;
            int iOnWarmupCompleted2 = -1;
            long j3 = -9223372036854775807L;
            while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() >= 4) {
                if (SnackbarHostKtExternalSyntheticLambda1.onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted()) != 442) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(1);
                } else {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
                    long jIAuthTabCallback = SnackbarHostKtExternalSyntheticLambda3.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                    if (jIAuthTabCallback != -9223372036854775807L) {
                        long jIAuthTabCallback2 = this.onExtraCallback.IAuthTabCallback(jIAuthTabCallback);
                        if (jIAuthTabCallback2 > j) {
                            if (j3 == -9223372036854775807L) {
                                return DrawerKtExternalSyntheticLambda28.onExtraCallbackWithResult.onWarmupCompleted(jIAuthTabCallback2, j2);
                            }
                            return DrawerKtExternalSyntheticLambda28.onExtraCallbackWithResult.onWarmupCompleted(j2 + iOnWarmupCompleted2);
                        }
                        if (100000 + jIAuthTabCallback2 > j) {
                            return DrawerKtExternalSyntheticLambda28.onExtraCallbackWithResult.onWarmupCompleted(j2 + textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted());
                        }
                        iOnWarmupCompleted2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
                        j3 = jIAuthTabCallback2;
                    }
                    onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                    iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
                }
            }
            if (j3 != -9223372036854775807L) {
                return DrawerKtExternalSyntheticLambda28.onExtraCallbackWithResult.onExtraCallbackWithResult(j3, j2 + iOnWarmupCompleted);
            }
            return DrawerKtExternalSyntheticLambda28.onExtraCallbackWithResult.onExtraCallbackWithResult;
        }

        private static void onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
            int iOnExtraCallback;
            int iOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult();
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() < 10) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnExtraCallbackWithResult);
                return;
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(9);
            int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() & 7;
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() < iOnMinimized) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnExtraCallbackWithResult);
                return;
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(iOnMinimized);
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() >= 4) {
                if (SnackbarHostKtExternalSyntheticLambda1.onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted()) == 443) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
                    int iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
                    if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() < iOnUnminimized) {
                        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnExtraCallbackWithResult);
                        return;
                    }
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(iOnUnminimized);
                }
                while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() >= 4 && (iOnExtraCallback = SnackbarHostKtExternalSyntheticLambda1.onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted())) != 442 && iOnExtraCallback != 441 && (iOnExtraCallback >>> 8) == 1) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
                    if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() < 2) {
                        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnExtraCallbackWithResult);
                        return;
                    }
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(Math.min(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() + textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized()));
                }
                return;
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnExtraCallbackWithResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int onExtraCallback(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }
}
