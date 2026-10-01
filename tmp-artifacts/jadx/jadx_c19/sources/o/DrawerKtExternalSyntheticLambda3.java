package o;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import com.google.android.exoplayer2.audio.OpusUtil;
import java.nio.ByteBuffer;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DrawerKtExternalSyntheticLambda3 {
    private static final int[] onExtraCallbackWithResult = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    private static int onExtraCallback(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
            case 7:
            case 9:
                return 7;
            case 6:
            case 8:
            case 10:
                return 8;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 24;
            default:
                return -1;
        }
    }

    public static final class onExtraCallback {
        public final int IAuthTabCallback;
        public final int onExtraCallback;
        public final int onExtraCallbackWithResult;
        public final int onNavigationEvent;
        public final int onWarmupCompleted;

        private onExtraCallback(int i2, int i3, int i4, int i5, int i6) {
            this.onExtraCallback = i2;
            this.onNavigationEvent = i3;
            this.onExtraCallbackWithResult = i4;
            this.IAuthTabCallback = i5;
            this.onWarmupCompleted = i6;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BasicTextContextMenuProviderKtExternalSyntheticLambda4 onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, String str, @Nullable String str2, @Nullable BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0) throws ParserException {
        int i2;
        int i3;
        int iOnExtraCallback;
        boolean zOnWarmupCompleted;
        int iOnNavigationEvent;
        int iOnNavigationEvent2;
        int iOnExtraCallback2;
        int iOnNavigationEvent3;
        boolean z;
        int i4;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21();
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        int iOnExtraCallback3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback();
        int iOnNavigationEvent4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(3);
        if (iOnNavigationEvent4 > 1) {
            throw ParserException.onExtraCallback("Unsupported AC-4 DSI version: " + iOnNavigationEvent4);
        }
        int iOnNavigationEvent5 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(7);
        int i5 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted() ? OpusUtil.SAMPLE_RATE : 44100;
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
        int iOnNavigationEvent6 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(9);
        if (iOnNavigationEvent5 > 1) {
            if (iOnNavigationEvent4 == 0) {
                throw ParserException.onExtraCallback("Invalid AC-4 DSI version: " + iOnNavigationEvent4);
            }
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(16);
                if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(128);
                }
            }
        }
        if (iOnNavigationEvent4 == 1) {
            if (!onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda21)) {
                throw ParserException.onExtraCallback("Invalid AC-4 DSI bitrate.");
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback();
        }
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted();
        for (int i6 = 0; i6 < iOnNavigationEvent6; i6++) {
            if (iOnNavigationEvent4 == 0) {
                zOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
                iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(5);
                iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(5);
                iOnExtraCallback2 = 0;
                iOnNavigationEvent3 = 0;
                z = false;
            } else {
                int iOnNavigationEvent7 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
                iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
                if (iOnNavigationEvent3 == 255) {
                    iOnNavigationEvent3 += textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(16);
                }
                if (iOnNavigationEvent7 > 2) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(iOnNavigationEvent3 << 3);
                } else {
                    iOnExtraCallback2 = (iOnExtraCallback3 - textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback()) / 8;
                    int iOnNavigationEvent8 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(5);
                    z = iOnNavigationEvent8 == 31;
                    iOnNavigationEvent2 = iOnNavigationEvent7;
                    iOnNavigationEvent = iOnNavigationEvent8;
                    zOnWarmupCompleted = false;
                }
            }
            onwarmupcompleted.IAuthTabCallbackDefault = iOnNavigationEvent2;
            if (zOnWarmupCompleted || z || iOnNavigationEvent != 6) {
                onwarmupcompleted.onNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(3);
                if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(5);
                }
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(2);
                int i7 = 1;
                if (iOnNavigationEvent4 == 1 && (iOnNavigationEvent2 == 1 || iOnNavigationEvent2 == 2)) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(2);
                }
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(5);
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(10);
                if (iOnNavigationEvent4 == 1) {
                    if (iOnNavigationEvent2 > 0) {
                        onwarmupcompleted.onExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
                    }
                    if (!onwarmupcompleted.onExtraCallbackWithResult) {
                        i4 = 2;
                    } else if (iOnNavigationEvent2 != 1) {
                        i4 = 2;
                        if (iOnNavigationEvent2 == 2) {
                            int iOnNavigationEvent9 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(5);
                            if (iOnNavigationEvent9 >= 0 && iOnNavigationEvent9 <= 15) {
                                onwarmupcompleted.onExtraCallback = iOnNavigationEvent9;
                            }
                            if (iOnNavigationEvent9 < 11 || iOnNavigationEvent9 > 14) {
                                i4 = 2;
                            } else {
                                onwarmupcompleted.onWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
                                i4 = 2;
                                onwarmupcompleted.onTransact = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
                            }
                        }
                        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(24);
                        i7 = 1;
                    }
                    if (iOnNavigationEvent2 == i7 || iOnNavigationEvent2 == i4) {
                        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted() && textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(i4);
                        }
                        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
                            int i8 = 8;
                            int iOnNavigationEvent10 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
                            int i9 = 0;
                            while (i9 < iOnNavigationEvent10) {
                                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(i8);
                                i9++;
                                i8 = 8;
                            }
                        }
                    }
                }
                if (!zOnWarmupCompleted && !z) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
                    if (iOnNavigationEvent == 0 || iOnNavigationEvent == 1 || iOnNavigationEvent == 2) {
                        if (iOnNavigationEvent2 == 0) {
                            for (int i10 = 0; i10 < 2; i10++) {
                                onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda21, onwarmupcompleted);
                            }
                        } else {
                            int i11 = 0;
                            for (int i12 = 2; i11 < i12; i12 = 2) {
                                IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21, onwarmupcompleted);
                                i11++;
                            }
                        }
                    } else if (iOnNavigationEvent == 3 || iOnNavigationEvent == 4) {
                        if (iOnNavigationEvent2 == 0) {
                            for (int i13 = 0; i13 < 3; i13++) {
                                onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda21, onwarmupcompleted);
                            }
                        } else {
                            int i14 = 0;
                            for (int i15 = 3; i14 < i15; i15 = 3) {
                                IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21, onwarmupcompleted);
                                i14++;
                            }
                        }
                    } else if (iOnNavigationEvent != 5) {
                        int iOnNavigationEvent11 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(7);
                        for (int i16 = 0; i16 < iOnNavigationEvent11; i16++) {
                            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(8);
                        }
                    } else if (iOnNavigationEvent2 == 0) {
                        onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda21, onwarmupcompleted);
                    } else {
                        int iOnNavigationEvent12 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(3);
                        for (int i17 = 0; i17 < iOnNavigationEvent12 + 2; i17++) {
                            IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21, onwarmupcompleted);
                        }
                    }
                } else if (iOnNavigationEvent2 == 0) {
                    onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda21, onwarmupcompleted);
                } else {
                    IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21, onwarmupcompleted);
                }
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
                if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                    int iOnNavigationEvent13 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(7);
                    for (int i18 = 0; i18 < iOnNavigationEvent13; i18++) {
                        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(15);
                    }
                }
                if (iOnNavigationEvent2 > 0) {
                    if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted() && !onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda21)) {
                        throw ParserException.onExtraCallback("Can't parse bitrate DSI.");
                    }
                    if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback();
                        textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(16));
                        int iOnNavigationEvent14 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(5);
                        for (int i19 = 0; i19 < iOnNavigationEvent14; i19++) {
                            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(3);
                            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(8);
                        }
                    }
                }
                i2 = 8;
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback();
                if (iOnNavigationEvent4 == 1) {
                    int iOnExtraCallback4 = ((iOnExtraCallback3 - textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback()) / 8) - iOnExtraCallback2;
                    if (iOnNavigationEvent3 < iOnExtraCallback4) {
                        throw ParserException.onExtraCallback("pres_bytes is smaller than presentation bytes read.");
                    }
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallbackWithResult(iOnNavigationEvent3 - iOnExtraCallback4);
                }
                if (onwarmupcompleted.onExtraCallbackWithResult && onwarmupcompleted.onExtraCallback == -1) {
                    throw ParserException.onExtraCallback("Can't determine channel mode of presentation " + i6);
                }
            }
            if (!onwarmupcompleted.onExtraCallbackWithResult) {
                iOnExtraCallback = onExtraCallback(onwarmupcompleted.onExtraCallback, onwarmupcompleted.onWarmupCompleted, onwarmupcompleted.onTransact);
            } else {
                int i20 = onwarmupcompleted.IAuthTabCallback;
                if (i20 > 0) {
                    int i21 = i20 + 1;
                    if (onwarmupcompleted.onNavigationEvent == 4 && i21 == 17) {
                        i21 = 21;
                    }
                    iOnExtraCallback = i21;
                } else {
                    int i22 = onwarmupcompleted.onNavigationEvent;
                    if (i22 == 0) {
                        i3 = 2;
                    } else if (i22 != 1) {
                        i3 = 2;
                        if (i22 == 2) {
                            iOnExtraCallback = i2;
                        } else if (i22 == 3) {
                            iOnExtraCallback = 10;
                        } else if (i22 != 4) {
                            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("Ac4Util", "AC-4 level " + onwarmupcompleted.onNavigationEvent + " has not been defined.");
                        } else {
                            iOnExtraCallback = 12;
                        }
                    } else {
                        iOnExtraCallback = 6;
                    }
                    iOnExtraCallback = i3;
                }
            }
            if (iOnExtraCallback > 0) {
                throw ParserException.onExtraCallback("Cannot determine channel count of presentation.");
            }
            return new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult(str).IAuthTabCallbackDefault("audio/ac4").onExtraCallback(iOnExtraCallback).extraCallbackWithResult(i5).onNavigationEvent(basicTextContextMenuProviderExternalSyntheticLambda0).onWarmupCompleted(str2).onExtraCallback(onExtraCallbackWithResult(iOnNavigationEvent5, onwarmupcompleted.IAuthTabCallbackDefault, onwarmupcompleted.onNavigationEvent)).onNavigationEvent();
        }
        i2 = 8;
        if (!onwarmupcompleted.onExtraCallbackWithResult) {
        }
        if (iOnExtraCallback > 0) {
        }
    }

    private static void onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21, onWarmupCompleted onwarmupcompleted) throws ParserException {
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(5);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(2);
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(5);
        }
        if (iOnNavigationEvent >= 7 && iOnNavigationEvent <= 10) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
        }
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
            int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(3);
            if (onwarmupcompleted.onExtraCallback == -1 && iOnNavigationEvent >= 0 && iOnNavigationEvent <= 15 && (iOnNavigationEvent2 == 0 || iOnNavigationEvent2 == 1)) {
                onwarmupcompleted.onExtraCallback = iOnNavigationEvent;
            }
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21);
            }
        }
    }

    private static void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21, onWarmupCompleted onwarmupcompleted) throws ParserException {
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(2);
        boolean zOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
        for (int i2 = 0; i2 < iOnNavigationEvent; i2++) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(2);
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(5);
            }
            if (zOnWarmupCompleted) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(24);
            } else {
                if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                    if (!textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
                    }
                    onwarmupcompleted.IAuthTabCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(6) + 1;
                }
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
            }
        }
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(3);
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private static void onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) throws ParserException {
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(6);
        if (iOnNavigationEvent < 2 || iOnNavigationEvent > 42) {
            throw ParserException.onExtraCallback(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iOnNavigationEvent)));
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(iOnNavigationEvent << 3);
    }

    private static boolean onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) {
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback() < 66) {
            return false;
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(66);
        return true;
    }

    private static int onExtraCallback(int i2, boolean z, int i3) {
        int iOnExtraCallback = onExtraCallback(i2);
        if (i2 != 11 && i2 != 12 && i2 != 13 && i2 != 14) {
            return iOnExtraCallback;
        }
        if (!z) {
            iOnExtraCallback -= 2;
        }
        return i3 != 0 ? i3 != 1 ? iOnExtraCallback : iOnExtraCallback - 2 : iOnExtraCallback - 4;
    }

    private static String onExtraCallbackWithResult(int i2, int i3, int i4) {
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted("ac-4.%02d.%02d.%02d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static onExtraCallback onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) {
        int i2;
        int i3;
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(16);
        int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(16);
        if (iOnNavigationEvent2 == 65535) {
            iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(24);
            i2 = 7;
        } else {
            i2 = 4;
        }
        int i4 = iOnNavigationEvent2 + i2;
        if (iOnNavigationEvent == 44097) {
            i4 += 2;
        }
        int i5 = i4;
        int iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
        if (iOnNavigationEvent3 == 3) {
            iOnNavigationEvent3 += onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda21, 2);
        }
        int i6 = iOnNavigationEvent3;
        int iOnNavigationEvent4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(10);
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted() && textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(3) > 0) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(2);
        }
        int i7 = !textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted() ? 44100 : 48000;
        int iOnNavigationEvent5 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4);
        if (i7 == 44100 && iOnNavigationEvent5 == 13) {
            i3 = onExtraCallbackWithResult[iOnNavigationEvent5];
        } else if (i7 == 48000) {
            int[] iArr = onExtraCallbackWithResult;
            if (iOnNavigationEvent5 < iArr.length) {
                int i8 = iArr[iOnNavigationEvent5];
                int i9 = iOnNavigationEvent4 % 5;
                if (i9 == 1) {
                    if (iOnNavigationEvent5 == 3 || iOnNavigationEvent5 == 8) {
                        i8++;
                    }
                    i3 = i8;
                } else if (i9 == 2) {
                    if (iOnNavigationEvent5 == 8 || iOnNavigationEvent5 == 11) {
                    }
                    i3 = i8;
                } else if (i9 != 3) {
                    if (i9 == 4 && (iOnNavigationEvent5 == 3 || iOnNavigationEvent5 == 8 || iOnNavigationEvent5 == 11)) {
                    }
                    i3 = i8;
                }
            } else {
                i3 = 0;
            }
        }
        return new onExtraCallback(i6, 2, i7, i5, i3);
    }

    public static int onExtraCallbackWithResult(byte[] bArr, int i2) {
        int i3 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i4 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i4 == 65535) {
            i4 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i3 = 4;
        }
        if (i2 == 44097) {
            i3 += 2;
        }
        return i4 + i3;
    }

    public static int onExtraCallbackWithResult(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return onWarmupCompleted(new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(bArr)).onWarmupCompleted;
    }

    public static void onExtraCallbackWithResult(int i2, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(7);
        byte[] bArrOnExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback();
        bArrOnExtraCallback[0] = -84;
        bArrOnExtraCallback[1] = 64;
        bArrOnExtraCallback[2] = -1;
        bArrOnExtraCallback[3] = -1;
        bArrOnExtraCallback[4] = (byte) (i2 >> 16);
        bArrOnExtraCallback[5] = (byte) (i2 >> 8);
        bArrOnExtraCallback[6] = (byte) i2;
    }

    private static int onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21, int i2) {
        int i3 = 0;
        while (true) {
            int iOnNavigationEvent = i3 + textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(i2);
            if (!textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                return iOnNavigationEvent;
            }
            i3 = (iOnNavigationEvent + 1) << i2;
        }
    }

    static final class onWarmupCompleted {
        public int IAuthTabCallback;
        public int IAuthTabCallbackDefault;
        public int onExtraCallback;
        public boolean onExtraCallbackWithResult;
        public int onNavigationEvent;
        public int onTransact;
        public boolean onWarmupCompleted;

        private onWarmupCompleted() {
            this.onExtraCallbackWithResult = true;
            this.onExtraCallback = -1;
            this.IAuthTabCallback = -1;
            this.onWarmupCompleted = true;
            this.onTransact = 2;
            this.IAuthTabCallbackDefault = 1;
            this.onNavigationEvent = 0;
        }
    }
}
