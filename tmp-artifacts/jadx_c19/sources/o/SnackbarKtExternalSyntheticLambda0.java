package o;

import java.io.IOException;
import o.DrawerKtExternalSyntheticLambda28;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SnackbarKtExternalSyntheticLambda0 extends DrawerKtExternalSyntheticLambda28 {
    public SnackbarKtExternalSyntheticLambda0(TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24, long j, long j2, int i2, int i3) {
        super(new DrawerKtExternalSyntheticLambda28.onNavigationEvent(), new onWarmupCompleted(i2, textFieldDecoratorModifierNodeExternalSyntheticLambda24, i3), j, 0L, j + 1, 0L, j2, 188L, 940);
    }

    static final class onWarmupCompleted implements DrawerKtExternalSyntheticLambda28.onTransact {
        private final TextFieldDecoratorModifierNodeExternalSyntheticLambda24 IAuthTabCallback;
        private final int onExtraCallback;
        private final int onExtraCallbackWithResult;
        private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onNavigationEvent = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();

        public onWarmupCompleted(int i2, TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24, int i3) {
            this.onExtraCallbackWithResult = i2;
            this.IAuthTabCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda24;
            this.onExtraCallback = i3;
        }

        @Override // o.DrawerKtExternalSyntheticLambda28.onTransact
        public DrawerKtExternalSyntheticLambda28.onExtraCallbackWithResult onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, long j) throws IOException {
            long jIAuthTabCallback = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
            int iMin = (int) Math.min(this.onExtraCallback, drawerKtExternalSyntheticLambda9.onExtraCallback() - jIAuthTabCallback);
            this.onNavigationEvent.onExtraCallback(iMin);
            drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.onNavigationEvent.onExtraCallback(), 0, iMin);
            return onNavigationEvent(this.onNavigationEvent, j, jIAuthTabCallback);
        }

        private DrawerKtExternalSyntheticLambda28.onExtraCallbackWithResult onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, long j, long j2) {
            int iOnExtraCallbackWithResult;
            int iOnExtraCallbackWithResult2;
            int iOnExtraCallbackWithResult3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() >= 188 && (iOnExtraCallbackWithResult2 = (iOnExtraCallbackWithResult = SnackbarKtExternalSyntheticLambda2.onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(), iOnExtraCallbackWithResult3)) + 188) <= iOnExtraCallbackWithResult3) {
                long jOnExtraCallback = SnackbarKtExternalSyntheticLambda2.onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnExtraCallbackWithResult, this.onExtraCallbackWithResult);
                if (jOnExtraCallback != -9223372036854775807L) {
                    long jIAuthTabCallback = this.IAuthTabCallback.IAuthTabCallback(jOnExtraCallback);
                    if (jIAuthTabCallback > j) {
                        if (j5 == -9223372036854775807L) {
                            return DrawerKtExternalSyntheticLambda28.onExtraCallbackWithResult.onWarmupCompleted(jIAuthTabCallback, j2);
                        }
                        return DrawerKtExternalSyntheticLambda28.onExtraCallbackWithResult.onWarmupCompleted(j2 + j4);
                    }
                    if (100000 + jIAuthTabCallback > j) {
                        return DrawerKtExternalSyntheticLambda28.onExtraCallbackWithResult.onWarmupCompleted(j2 + iOnExtraCallbackWithResult);
                    }
                    j4 = iOnExtraCallbackWithResult;
                    j5 = jIAuthTabCallback;
                }
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnExtraCallbackWithResult2);
                j3 = iOnExtraCallbackWithResult2;
            }
            if (j5 != -9223372036854775807L) {
                return DrawerKtExternalSyntheticLambda28.onExtraCallbackWithResult.onExtraCallbackWithResult(j5, j2 + j3);
            }
            return DrawerKtExternalSyntheticLambda28.onExtraCallbackWithResult.onExtraCallbackWithResult;
        }

        @Override // o.DrawerKtExternalSyntheticLambda28.onTransact
        public void onExtraCallbackWithResult() {
            this.onNavigationEvent.onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted);
        }
    }
}
