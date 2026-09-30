package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SnackbarKtExternalSyntheticLambda2 {
    public static boolean onExtraCallbackWithResult(byte[] bArr, int i2, int i3, int i4) {
        int i5 = 0;
        for (int i6 = -4; i6 <= 4; i6++) {
            int i7 = (i6 * 188) + i4;
            if (i7 < i2 || i7 >= i3 || bArr[i7] != 71) {
                i5 = 0;
            } else {
                i5++;
                if (i5 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int onExtraCallbackWithResult(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] != 71) {
            i2++;
        }
        return i2;
    }

    public static long onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, int i3) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i2);
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() < 5) {
            return -9223372036854775807L;
        }
        int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        if ((8388608 & iAsBinder) != 0 || ((2096896 & iAsBinder) >> 8) != i3 || (iAsBinder & 32) == 0 || textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() < 7 || textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() < 7 || (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, 6);
        return onExtraCallback(bArr);
    }

    private static long onExtraCallback(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
