package o;

import java.util.List;
import o.RippleKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RangeSliderLogic {
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void onNavigationEvent(RadioButtonKt radioButtonKt, RippleKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent, TextFieldDecoratorModifierNodeExternalSyntheticLambda10<RadioButtonDefaults> textFieldDecoratorModifierNodeExternalSyntheticLambda10) {
        boolean z;
        int iOnExtraCallback = onExtraCallback(radioButtonKt, onnavigationevent.IAuthTabCallback);
        if (onnavigationevent.IAuthTabCallback == -9223372036854775807L || iOnExtraCallback >= radioButtonKt.onExtraCallbackWithResult()) {
            z = false;
        } else {
            List<ImeEditCommand_androidKtExternalSyntheticLambda1> listOnExtraCallbackWithResult = radioButtonKt.onExtraCallbackWithResult(onnavigationevent.IAuthTabCallback);
            long jIAuthTabCallback = radioButtonKt.IAuthTabCallback(iOnExtraCallback);
            if (!listOnExtraCallbackWithResult.isEmpty()) {
                long j = onnavigationevent.IAuthTabCallback;
                if (j < jIAuthTabCallback) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda10.accept(new RadioButtonDefaults(listOnExtraCallbackWithResult, j, jIAuthTabCallback - j));
                    z = true;
                }
            }
        }
        for (int i2 = iOnExtraCallback; i2 < radioButtonKt.onExtraCallbackWithResult(); i2++) {
            onExtraCallbackWithResult(radioButtonKt, i2, textFieldDecoratorModifierNodeExternalSyntheticLambda10);
        }
        if (onnavigationevent.onNavigationEvent) {
            if (z) {
                iOnExtraCallback--;
            }
            for (int i3 = 0; i3 < iOnExtraCallback; i3++) {
                onExtraCallbackWithResult(radioButtonKt, i3, textFieldDecoratorModifierNodeExternalSyntheticLambda10);
            }
            if (z) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda10.accept(new RadioButtonDefaults(radioButtonKt.onExtraCallbackWithResult(onnavigationevent.IAuthTabCallback), radioButtonKt.IAuthTabCallback(iOnExtraCallback), onnavigationevent.IAuthTabCallback - radioButtonKt.IAuthTabCallback(iOnExtraCallback)));
            }
        }
    }

    private static int onExtraCallback(RadioButtonKt radioButtonKt, long j) {
        if (j == -9223372036854775807L) {
            return 0;
        }
        int iOnWarmupCompleted = radioButtonKt.onWarmupCompleted(j);
        if (iOnWarmupCompleted == -1) {
            iOnWarmupCompleted = radioButtonKt.onExtraCallbackWithResult();
        }
        if (iOnWarmupCompleted <= 0) {
            return iOnWarmupCompleted;
        }
        int i2 = iOnWarmupCompleted - 1;
        return radioButtonKt.IAuthTabCallback(i2) == j ? i2 : iOnWarmupCompleted;
    }

    private static void onExtraCallbackWithResult(RadioButtonKt radioButtonKt, int i2, TextFieldDecoratorModifierNodeExternalSyntheticLambda10<RadioButtonDefaults> textFieldDecoratorModifierNodeExternalSyntheticLambda10) {
        long jIAuthTabCallback = radioButtonKt.IAuthTabCallback(i2);
        List<ImeEditCommand_androidKtExternalSyntheticLambda1> listOnExtraCallbackWithResult = radioButtonKt.onExtraCallbackWithResult(jIAuthTabCallback);
        if (listOnExtraCallbackWithResult.isEmpty()) {
            return;
        }
        if (i2 == radioButtonKt.onExtraCallbackWithResult() - 1) {
            throw new IllegalStateException();
        }
        long jIAuthTabCallback2 = radioButtonKt.IAuthTabCallback(i2 + 1) - radioButtonKt.IAuthTabCallback(i2);
        if (jIAuthTabCallback2 > 0) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda10.accept(new RadioButtonDefaults(listOnExtraCallbackWithResult, jIAuthTabCallback, jIAuthTabCallback2));
        }
    }
}
