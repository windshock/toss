package o;

import androidx.media3.common.ParserException;
import com.google.android.exoplayer2.audio.OpusUtil;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DrawerKtExternalSyntheticLambda23 {
    private static final int[] onNavigationEvent = {96000, 88200, 64000, OpusUtil.SAMPLE_RATE, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] onExtraCallbackWithResult = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static final class onWarmupCompleted {
        public final int IAuthTabCallback;
        public final int onExtraCallback;
        public final String onExtraCallbackWithResult;

        private onWarmupCompleted(int i2, int i3, String str) {
            this.IAuthTabCallback = i2;
            this.onExtraCallback = i3;
            this.onExtraCallbackWithResult = str;
        }
    }

    public static onWarmupCompleted IAuthTabCallback(byte[] bArr) throws ParserException {
        return onExtraCallback(new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(bArr), false);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static onWarmupCompleted onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21, boolean z) throws ParserException {
        int iOnWarmupCompleted = onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda21);
        int iIAuthTabCallback = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21);
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4);
        String str = "mp4a.40." + iOnWarmupCompleted;
        if (iOnWarmupCompleted == 5 || iOnWarmupCompleted == 29) {
            iIAuthTabCallback = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21);
            iOnWarmupCompleted = onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda21);
            if (iOnWarmupCompleted == 22) {
                iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4);
            }
        }
        if (z) {
            if (iOnWarmupCompleted != 1 && iOnWarmupCompleted != 2 && iOnWarmupCompleted != 3 && iOnWarmupCompleted != 4 && iOnWarmupCompleted != 6 && iOnWarmupCompleted != 7 && iOnWarmupCompleted != 17) {
                switch (iOnWarmupCompleted) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.onExtraCallback("Unsupported audio object type: " + iOnWarmupCompleted);
                }
            }
            onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda21, iOnWarmupCompleted, iOnNavigationEvent);
            switch (iOnWarmupCompleted) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
                    if (iOnNavigationEvent2 == 2 || iOnNavigationEvent2 == 3) {
                        throw ParserException.onExtraCallback("Unsupported epConfig: " + iOnNavigationEvent2);
                    }
            }
        }
        int i2 = onExtraCallbackWithResult[iOnNavigationEvent];
        if (i2 == -1) {
            throw ParserException.onNavigationEvent((String) null, (Throwable) null);
        }
        return new onWarmupCompleted(iIAuthTabCallback, i2, str);
    }

    public static byte[] onWarmupCompleted(int i2, int i3, int i4) {
        return new byte[]{(byte) (((i2 << 3) & 248) | ((i3 >> 1) & 7)), (byte) (((i3 << 7) & 128) | ((i4 << 3) & 120))};
    }

    private static int onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) {
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(5);
        return iOnNavigationEvent == 31 ? textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(6) + 32 : iOnNavigationEvent;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private static int IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) throws ParserException {
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4);
        if (iOnNavigationEvent == 15) {
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback() < 24) {
                throw ParserException.onNavigationEvent("AAC header insufficient data", (Throwable) null);
            }
            return textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(24);
        }
        if (iOnNavigationEvent < 13) {
            return onNavigationEvent[iOnNavigationEvent];
        }
        throw ParserException.onNavigationEvent("AAC header wrong Sampling Frequency Index", (Throwable) null);
    }

    private static void onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21, int i2, int i3) {
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(14);
        }
        boolean zOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
        if (i3 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i2 == 6 || i2 == 20) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(3);
        }
        if (zOnWarmupCompleted) {
            if (i2 == 22) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(16);
            }
            if (i2 == 17 || i2 == 19 || i2 == 20 || i2 == 23) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(3);
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(1);
        }
    }
}
