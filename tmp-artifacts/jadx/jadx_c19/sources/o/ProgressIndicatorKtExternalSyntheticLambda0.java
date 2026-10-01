package o;

import o.HandwritingHandlerNodeExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ProgressIndicatorKtExternalSyntheticLambda0 {
    public static HandwritingHandlerNodeExternalSyntheticLambda0 onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(12);
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() < i2) {
            int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
            int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() == 1935766900) {
                if (iAsBinder < 16) {
                    return null;
                }
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
                int i3 = -1;
                int i4 = 0;
                for (int i5 = 0; i5 < 2; i5++) {
                    int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                    int iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                    if (iOnMinimized == 0) {
                        i3 = iOnMinimized2;
                    } else if (iOnMinimized == 1) {
                        i4 = iOnMinimized2;
                    }
                }
                int iOnExtraCallbackWithResult = onExtraCallbackWithResult(i3, textFieldDecoratorModifierNodeExternalSyntheticLambda20, i2);
                if (iOnExtraCallbackWithResult == -2147483647) {
                    return null;
                }
                return new HandwritingHandlerNodeExternalSyntheticLambda0(new HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback[]{new ModalBottomSheetStateCompanionExternalSyntheticLambda1(iOnExtraCallbackWithResult, i4)});
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted + iAsBinder);
        }
        return null;
    }

    private static int onExtraCallbackWithResult(int i2, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i3) {
        if (i2 == 12) {
            return 240;
        }
        if (i2 == 13) {
            return 120;
        }
        if (i2 == 21 && textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() >= 8 && textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() + 8 <= i3) {
            int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            int iAsBinder2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            if (iAsBinder >= 12 && iAsBinder2 == 1936877170) {
                return textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityLayout();
            }
        }
        return -2147483647;
    }
}
