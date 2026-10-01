package o;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.android.material.button.MaterialButton;
import com.google.common.math.IntMath;
import com.google.common.math.LongMath;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SliderKtsliderTapModifier211ExternalSyntheticLambda0 {

    public static class IAuthTabCallback {
        public int onExtraCallback;
        public long onNavigationEvent;
        public int onWarmupCompleted;
    }

    public static boolean onWarmupCompleted(int i2) {
        return (i2 & 16777215) == 12583333;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static boolean onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21, IAuthTabCallback iAuthTabCallback) throws ParserException {
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent();
        int iOnNavigationEvent = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21, 3, 8, 8);
        iAuthTabCallback.onExtraCallback = iOnNavigationEvent;
        if (iOnNavigationEvent == -1) {
            return false;
        }
        long jOnWarmupCompleted = onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda21, 2, 8, 32);
        iAuthTabCallback.onNavigationEvent = jOnWarmupCompleted;
        if (jOnWarmupCompleted == -1) {
            return false;
        }
        if (jOnWarmupCompleted > 16) {
            throw ParserException.onExtraCallback("Contains sub-stream with an invalid packet label " + iAuthTabCallback.onNavigationEvent);
        }
        if (jOnWarmupCompleted == 0) {
            int i2 = iAuthTabCallback.onExtraCallback;
            if (i2 == 1) {
                throw ParserException.onNavigationEvent("Mpegh3daConfig packet with invalid packet label 0", (Throwable) null);
            }
            if (i2 == 2) {
                throw ParserException.onNavigationEvent("Mpegh3daFrame packet with invalid packet label 0", (Throwable) null);
            }
            if (i2 == 17) {
                throw ParserException.onNavigationEvent("AudioTruncation packet with invalid packet label 0", (Throwable) null);
            }
        }
        int iOnNavigationEvent2 = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21, 11, 24, 24);
        iAuthTabCallback.onWarmupCompleted = iOnNavigationEvent2;
        return iOnNavigationEvent2 != -1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private static int onNavigationEvent(int i2) throws ParserException {
        if (i2 == 0) {
            return 768;
        }
        if (i2 == 1) {
            return 1024;
        }
        if (i2 == 2 || i2 == 3) {
            return 2048;
        }
        if (i2 == 4) {
            return 4096;
        }
        throw ParserException.onExtraCallback("Unsupported coreSbrFrameLengthIndex " + i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private static int onExtraCallbackWithResult(int i2) throws ParserException {
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        int i3 = 2;
        if (i2 != 2) {
            i3 = 3;
            if (i2 != 3) {
                if (i2 == 4) {
                    return 1;
                }
                throw ParserException.onExtraCallback("Unsupported coreSbrFrameLengthIndex " + i2);
            }
        }
        return i3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private static double onExtraCallback(int i2) throws ParserException {
        switch (i2) {
            case 14700:
            case 16000:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case 44100:
            case OpusUtil.SAMPLE_RATE /* 48000 */:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw ParserException.onExtraCallback("Unsupported sampling rate " + i2);
        }
    }

    public static onWarmupCompleted onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) throws ParserException {
        int iIAuthTabCallback;
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
        int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(5);
        if (iOnNavigationEvent2 == 31) {
            iIAuthTabCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(24);
        } else {
            iIAuthTabCallback = IAuthTabCallback(iOnNavigationEvent2);
        }
        int iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(3);
        int iOnNavigationEvent4 = onNavigationEvent(iOnNavigationEvent3);
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(iOnNavigationEvent3);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(2);
        IAuthTabCallbackStub(textFieldDecoratorModifierNodeExternalSyntheticLambda21);
        onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda21, onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21), iOnExtraCallbackWithResult);
        byte[] bArr = null;
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
            int iOnNavigationEvent5 = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21, 2, 4, 8);
            for (int i2 = 0; i2 < iOnNavigationEvent5 + 1; i2++) {
                int iOnNavigationEvent6 = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21, 4, 8, 16);
                int iOnNavigationEvent7 = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21, 4, 8, 16);
                if (iOnNavigationEvent6 == 7) {
                    int iOnNavigationEvent8 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4) + 1;
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
                    byte[] bArr2 = new byte[iOnNavigationEvent8];
                    for (int i3 = 0; i3 < iOnNavigationEvent8; i3++) {
                        bArr2[i3] = (byte) textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
                    }
                    bArr = bArr2;
                } else {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(iOnNavigationEvent7 << 3);
                }
            }
        }
        double dOnExtraCallback = onExtraCallback(iIAuthTabCallback);
        return new onWarmupCompleted(iOnNavigationEvent, (int) (iIAuthTabCallback * dOnExtraCallback), (int) (iOnNavigationEvent4 * dOnExtraCallback), bArr);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private static int IAuthTabCallback(int i2) throws ParserException {
        switch (i2) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return OpusUtil.SAMPLE_RATE;
            case 4:
                return 44100;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return 16000;
            case 9:
                return 12000;
            case 10:
                return 11025;
            case 11:
                return 8000;
            case 12:
                return 7350;
            case 13:
            case 14:
            default:
                throw ParserException.onExtraCallback("Unsupported sampling rate index " + i2);
            case 15:
                return 57600;
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                return 51200;
            case 17:
                return 40000;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case 20:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return 20000;
            case 23:
                return 19200;
            case 24:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                return 9600;
        }
    }

    public static int onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) {
        if (!textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
            return 0;
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(2);
        return textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(13);
    }

    private static void IAuthTabCallbackStub(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) {
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
        if (iOnNavigationEvent == 0) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(6);
            return;
        }
        int iOnNavigationEvent2 = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21, 5, 8, 16) + 1;
        if (iOnNavigationEvent == 1) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(iOnNavigationEvent2 * 7);
        } else if (iOnNavigationEvent == 2) {
            onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21, iOnNavigationEvent2);
        }
    }

    private static void onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21, int i2) {
        int iOnNavigationEvent;
        boolean zOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
        int i3 = zOnWarmupCompleted ? 1 : 5;
        int i4 = zOnWarmupCompleted ? 7 : 5;
        int i5 = zOnWarmupCompleted ? 8 : 6;
        int i6 = 0;
        while (i6 < i2) {
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(7);
                iOnNavigationEvent = 0;
            } else {
                if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2) == 3 && textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(i4) * i3 != 0) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
                }
                iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(i5) * i3;
                if (iOnNavigationEvent != 0 && iOnNavigationEvent != 180) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
                }
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
            }
            if (iOnNavigationEvent != 0 && iOnNavigationEvent != 180 && textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                i6++;
            }
            i6++;
        }
    }

    private static int onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) {
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(5);
        int iOnNavigationEvent2 = 0;
        for (int i2 = 0; i2 < iOnNavigationEvent + 1; i2++) {
            int iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(3);
            iOnNavigationEvent2 += onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21, 5, 8, 16) + 1;
            if ((iOnNavigationEvent3 == 0 || iOnNavigationEvent3 == 2) && textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                IAuthTabCallbackStub(textFieldDecoratorModifierNodeExternalSyntheticLambda21);
            }
        }
        return iOnNavigationEvent2;
    }

    private static void onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21, int i2, int i3) {
        int iOnNavigationEvent;
        int iOnNavigationEvent2 = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21, 4, 8, 16);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
        for (int i4 = 0; i4 < iOnNavigationEvent2 + 1; i4++) {
            int iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
            if (iOnNavigationEvent3 == 0) {
                onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda21);
                if (i3 > 0) {
                    IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21);
                }
            } else if (iOnNavigationEvent3 == 1) {
                if (onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda21)) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
                }
                if (i3 > 0) {
                    IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21);
                    iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
                } else {
                    iOnNavigationEvent = 0;
                }
                if (iOnNavigationEvent > 0) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(6);
                    int iOnNavigationEvent4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
                    if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(5);
                    }
                    if (iOnNavigationEvent == 2 || iOnNavigationEvent == 3) {
                        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(6);
                    }
                    if (iOnNavigationEvent4 == 2) {
                        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
                    }
                }
                int iFloor = ((int) Math.floor(Math.log(i2 - 1) / Math.log(2.0d))) + 1;
                int iOnNavigationEvent5 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
                if (iOnNavigationEvent5 > 0 && textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(iFloor);
                }
                if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(iFloor);
                }
                if (i3 == 0 && iOnNavigationEvent5 == 0) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
                }
            } else if (iOnNavigationEvent3 == 3) {
                onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21, 4, 8, 16);
                int iOnNavigationEvent6 = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21, 4, 8, 16);
                if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                    onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21, 8, 16, 0);
                }
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
                if (iOnNavigationEvent6 > 0) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(iOnNavigationEvent6 << 3);
                }
            }
        }
    }

    private static boolean onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(3);
        boolean zOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
        if (zOnWarmupCompleted) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(13);
        }
        return zOnWarmupCompleted;
    }

    private static void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(3);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(8);
        boolean zOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
        boolean zOnWarmupCompleted2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
        if (zOnWarmupCompleted) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(5);
        }
        if (zOnWarmupCompleted2) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(6);
        }
    }

    private static int onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21, int i2, int i3, int i4) {
        RecordingInputConnection_androidKt.onNavigationEvent(Math.max(Math.max(i2, i3), i4) <= 31);
        int i5 = (1 << i2) - 1;
        int i6 = (1 << i3) - 1;
        IntMath.checkedAdd(IntMath.checkedAdd(i5, i6), 1 << i4);
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback() < i2) {
            return -1;
        }
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(i2);
        if (iOnNavigationEvent != i5) {
            return iOnNavigationEvent;
        }
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback() < i3) {
            return -1;
        }
        int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(i3);
        int i7 = iOnNavigationEvent + iOnNavigationEvent2;
        if (iOnNavigationEvent2 != i6) {
            return i7;
        }
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback() < i4) {
            return -1;
        }
        return i7 + textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(i4);
    }

    private static long onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21, int i2, int i3, int i4) {
        RecordingInputConnection_androidKt.onNavigationEvent(Math.max(Math.max(i2, i3), i4) <= 63);
        long j = (1 << i2) - 1;
        long j2 = (1 << i3) - 1;
        LongMath.checkedAdd(LongMath.checkedAdd(j, j2), 1 << i4);
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback() < i2) {
            return -1L;
        }
        long jOnExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback(i2);
        if (jOnExtraCallback != j) {
            return jOnExtraCallback;
        }
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback() < i3) {
            return -1L;
        }
        long jOnExtraCallback2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback(i3);
        long j3 = jOnExtraCallback + jOnExtraCallback2;
        if (jOnExtraCallback2 != j2) {
            return j3;
        }
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback() < i4) {
            return -1L;
        }
        return j3 + textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback(i4);
    }

    public static class onWarmupCompleted {
        public final int IAuthTabCallback;
        public final int onExtraCallback;
        public final int onExtraCallbackWithResult;
        public final byte[] onNavigationEvent;

        private onWarmupCompleted(int i2, int i3, int i4, @Nullable byte[] bArr) {
            this.IAuthTabCallback = i2;
            this.onExtraCallbackWithResult = i3;
            this.onExtraCallback = i4;
            this.onNavigationEvent = bArr;
        }
    }
}
