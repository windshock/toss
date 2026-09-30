package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DrawerKtExternalSyntheticLambda27 {
    public static void onNavigationEvent(long j, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, ExposedDropdownMenu_androidKtExternalSyntheticLambda5[] exposedDropdownMenu_androidKtExternalSyntheticLambda5Arr) {
        while (true) {
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() <= 1) {
                return;
            }
            int iOnWarmupCompleted = onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            int iOnWarmupCompleted2 = onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            int iOnWarmupCompleted3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() + iOnWarmupCompleted2;
            if (iOnWarmupCompleted2 == -1 || iOnWarmupCompleted2 > textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent()) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iOnWarmupCompleted3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult();
            } else if (iOnWarmupCompleted == 4 && iOnWarmupCompleted2 >= 8) {
                int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                int iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
                int iAsBinder = iOnUnminimized == 49 ? textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() : 0;
                int iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                if (iOnUnminimized == 47) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(1);
                }
                boolean z = iOnMinimized == 181 && (iOnUnminimized == 49 || iOnUnminimized == 47) && iOnMinimized2 == 3;
                if (iOnUnminimized == 49) {
                    z &= iAsBinder == 1195456820;
                }
                if (z) {
                    onWarmupCompleted(j, textFieldDecoratorModifierNodeExternalSyntheticLambda20, exposedDropdownMenu_androidKtExternalSyntheticLambda5Arr);
                }
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted3);
        }
    }

    public static void onWarmupCompleted(long j, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, ExposedDropdownMenu_androidKtExternalSyntheticLambda5[] exposedDropdownMenu_androidKtExternalSyntheticLambda5Arr) {
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        if ((iOnMinimized & 64) != 0) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(1);
            int i2 = (iOnMinimized & 31) * 3;
            int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
            for (ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5 : exposedDropdownMenu_androidKtExternalSyntheticLambda5Arr) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
                exposedDropdownMenu_androidKtExternalSyntheticLambda5.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, i2);
                RecordingInputConnection_androidKt.onExtraCallbackWithResult(j != -9223372036854775807L);
                exposedDropdownMenu_androidKtExternalSyntheticLambda5.onExtraCallback(j, 1, i2, 0, null);
            }
        }
    }

    private static int onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int i2 = 0;
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() != 0) {
            int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            i2 += iOnMinimized;
            if (iOnMinimized != 255) {
                return i2;
            }
        }
        return -1;
    }
}
