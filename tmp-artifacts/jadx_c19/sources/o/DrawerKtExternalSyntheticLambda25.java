package o;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.OpusUtil;
import java.nio.ByteBuffer;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DrawerKtExternalSyntheticLambda25 {
    private static final int[] onExtraCallbackWithResult = {1, 2, 3, 6};
    private static final int[] onExtraCallback = {OpusUtil.SAMPLE_RATE, 44100, 32000};
    private static final int[] IAuthTabCallback = {24000, 22050, 16000};
    private static final int[] onNavigationEvent = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] onWarmupCompleted = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] asBinder = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class onExtraCallback {
        public final int IAuthTabCallback;
        public final int IAuthTabCallbackDefault;
        public final int asInterface;
        public final int onExtraCallback;
        public final int onExtraCallbackWithResult;
        public final int onNavigationEvent;
        public final String onWarmupCompleted;

        private onExtraCallback(@Nullable String str, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.onWarmupCompleted = str;
            this.asInterface = i2;
            this.onExtraCallbackWithResult = i3;
            this.IAuthTabCallbackDefault = i4;
            this.onNavigationEvent = i5;
            this.IAuthTabCallback = i6;
            this.onExtraCallback = i7;
        }
    }

    public static BasicTextContextMenuProviderKtExternalSyntheticLambda4 onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, String str, @Nullable String str2, @Nullable BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0) {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21();
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        int i2 = onExtraCallback[textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2)];
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(8);
        int i3 = onNavigationEvent[textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(3)];
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(1) != 0) {
            i3++;
        }
        int i4 = onWarmupCompleted[textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(5)] * 1000;
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent());
        return new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult(str).IAuthTabCallbackDefault("audio/ac3").onExtraCallback(i3).extraCallbackWithResult(i2).onNavigationEvent(basicTextContextMenuProviderExternalSyntheticLambda0).onWarmupCompleted(str2).onNavigationEvent(i4).extraCallback(i4).onNavigationEvent();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BasicTextContextMenuProviderKtExternalSyntheticLambda4 onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, String str, @Nullable String str2, @Nullable BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0) {
        String str3;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21();
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(13);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(3);
        int i2 = onExtraCallback[textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2)];
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(10);
        int i3 = onNavigationEvent[textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(3)];
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(1) != 0) {
            i3++;
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(3);
        int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(1);
        if (iOnNavigationEvent2 > 0) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(6);
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(1) != 0) {
                i3 += 2;
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(1);
        }
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback() > 7) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(7);
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent());
        return new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult(str).IAuthTabCallbackDefault(str3).onExtraCallback(i3).extraCallbackWithResult(i2).onNavigationEvent(basicTextContextMenuProviderExternalSyntheticLambda0).onWarmupCompleted(str2).extraCallback(iOnNavigationEvent * 1000).onNavigationEvent();
    }

    public static onExtraCallback onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) {
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        String str2;
        int iOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallbackWithResult();
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(40);
        boolean z = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(5) > 10;
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted(iOnExtraCallbackWithResult);
        int i11 = -1;
        if (z) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(16);
            int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
            if (iOnNavigationEvent == 0) {
                i11 = 0;
            } else if (iOnNavigationEvent == 1) {
                i11 = 1;
            } else if (iOnNavigationEvent == 2) {
                i11 = 2;
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(3);
            int iOnNavigationEvent2 = (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(11) + 1) << 1;
            int iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
            if (iOnNavigationEvent3 == 3) {
                i9 = IAuthTabCallback[textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2)];
                i10 = 6;
                i8 = 3;
            } else {
                int iOnNavigationEvent4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
                int i12 = onExtraCallbackWithResult[iOnNavigationEvent4];
                i8 = iOnNavigationEvent4;
                i9 = onExtraCallback[iOnNavigationEvent3];
                i10 = i12;
            }
            int i13 = i10 << 8;
            int iOnWarmupCompleted = onWarmupCompleted(iOnNavigationEvent2, i9, i10);
            int iOnNavigationEvent5 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(3);
            boolean zOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
            i2 = onNavigationEvent[iOnNavigationEvent5] + (zOnWarmupCompleted ? 1 : 0);
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(10);
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(8);
            }
            if (iOnNavigationEvent5 == 0) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(5);
                if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(8);
                }
            }
            if (i11 == 1 && textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(16);
            }
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                if (iOnNavigationEvent5 > 2) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(2);
                }
                if ((iOnNavigationEvent5 & 1) != 0 && iOnNavigationEvent5 > 2) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(6);
                }
                if ((iOnNavigationEvent5 & 4) != 0) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(6);
                }
                if (zOnWarmupCompleted && textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(5);
                }
                if (i11 == 0) {
                    if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(6);
                    }
                    if (iOnNavigationEvent5 == 0 && textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(6);
                    }
                    if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(6);
                    }
                    int iOnNavigationEvent6 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
                    if (iOnNavigationEvent6 == 1) {
                        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(5);
                    } else if (iOnNavigationEvent6 == 2) {
                        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(12);
                    } else if (iOnNavigationEvent6 == 3) {
                        int iOnNavigationEvent7 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(5);
                        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(5);
                            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
                            }
                            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
                            }
                            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
                            }
                            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
                            }
                            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
                            }
                            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
                            }
                            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
                            }
                            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                                if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
                                }
                                if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
                                }
                            }
                        }
                        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(5);
                            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(7);
                                if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(8);
                                }
                            }
                        }
                        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback((iOnNavigationEvent7 + 2) << 3);
                        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback();
                    }
                    if (iOnNavigationEvent5 < 2) {
                        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(14);
                        }
                        if (iOnNavigationEvent5 == 0 && textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(14);
                        }
                    }
                    if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                        if (i8 == 0) {
                            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(5);
                        } else {
                            for (int i14 = 0; i14 < i10; i14++) {
                                if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(5);
                                }
                            }
                        }
                    }
                }
            }
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(5);
                if (iOnNavigationEvent5 == 2) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
                }
                if (iOnNavigationEvent5 >= 6) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(2);
                }
                if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(8);
                }
                if (iOnNavigationEvent5 == 0 && textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(8);
                }
                if (iOnNavigationEvent3 < 3) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
                }
            }
            if (i11 == 0 && i8 != 3) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
            }
            if (i11 == 2 && (i8 == 3 || textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted())) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(6);
            }
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted() && textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(6) == 1 && textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8) == 1) {
                str2 = "audio/eac3-joc";
            } else {
                str2 = "audio/eac3";
            }
            str = str2;
            i4 = i11;
            i5 = iOnNavigationEvent2;
            i6 = i9;
            i7 = i13;
            i3 = iOnWarmupCompleted;
        } else {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(32);
            int iOnNavigationEvent8 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
            String str3 = iOnNavigationEvent8 == 3 ? null : "audio/ac3";
            int iOnNavigationEvent9 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(6);
            int i15 = onWarmupCompleted[iOnNavigationEvent9 / 2];
            int iOnExtraCallbackWithResult2 = onExtraCallbackWithResult(iOnNavigationEvent8, iOnNavigationEvent9);
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(8);
            int iOnNavigationEvent10 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(3);
            if ((iOnNavigationEvent10 & 1) != 0 && iOnNavigationEvent10 != 1) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(2);
            }
            if ((iOnNavigationEvent10 & 4) != 0) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(2);
            }
            if (iOnNavigationEvent10 == 2) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(2);
            }
            int[] iArr = onExtraCallback;
            int i16 = iOnNavigationEvent8 < iArr.length ? iArr[iOnNavigationEvent8] : -1;
            i2 = onNavigationEvent[iOnNavigationEvent10] + (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted() ? 1 : 0);
            i3 = i15 * 1000;
            i4 = -1;
            str = str3;
            i5 = iOnExtraCallbackWithResult2;
            i6 = i16;
            i7 = 1536;
        }
        return new onExtraCallback(str, i4, i2, i6, i5, i7, i3);
    }

    public static int onWarmupCompleted(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) << 1;
        }
        byte b = bArr[4];
        return onExtraCallbackWithResult((b & 192) >> 6, b & 63);
    }

    public static int onExtraCallback(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return onExtraCallbackWithResult[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] << 8;
        }
        return 1536;
    }

    public static int IAuthTabCallback(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        for (int i2 = iPosition; i2 <= iLimit - 10; i2++) {
            if ((TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(byteBuffer, i2 + 4) & (-2)) == -126718022) {
                return i2 - iPosition;
            }
        }
        return -1;
    }

    public static int onNavigationEvent(byte[] bArr) {
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111) {
            return 0;
        }
        byte b = bArr[7];
        if ((b & 254) == 186) {
            return 40 << ((bArr[(b & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }

    public static int onExtraCallback(ByteBuffer byteBuffer, int i2) {
        boolean z = (byteBuffer.get((byteBuffer.position() + i2) + 7) & 255) == 187;
        return 40 << ((byteBuffer.get((byteBuffer.position() + i2) + (z ? 9 : 8)) >> 4) & 7);
    }

    private static int onExtraCallbackWithResult(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0) {
            return -1;
        }
        int[] iArr = onExtraCallback;
        if (i2 >= iArr.length || i3 < 0) {
            return -1;
        }
        int[] iArr2 = asBinder;
        if (i4 >= iArr2.length) {
            return -1;
        }
        int i5 = iArr[i2];
        if (i5 == 44100) {
            return (iArr2[i4] + (i3 % 2)) << 1;
        }
        int i6 = onWarmupCompleted[i4];
        return i5 == 32000 ? i6 * 6 : i6 << 2;
    }

    private static int onWarmupCompleted(int i2, int i3, int i4) {
        return (i2 * i3) / (i4 << 5);
    }
}
