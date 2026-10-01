package o;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.source.rtsp.RtpPacket;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DrawerKtBottomDrawerScrimdismissModifier11ExternalSyntheticLambda0 {
    private static final int[] IAuthTabCallback = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] onWarmupCompleted = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, OpusUtil.SAMPLE_RATE, -1, -1};
    private static final int[] onExtraCallbackWithResult = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] onExtraCallback = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, OpusUtil.SAMPLE_RATE, 96000, 192000, 384000};
    private static final int[] asBinder = {5, 8, 10, 12};
    private static final int[] IAuthTabCallbackStub = {6, 9, 12, 15};
    private static final int[] onNavigationEvent = {2, 4, 6, 8};
    private static final int[] IAuthTabCallbackDefault = {9, 11, 13, 16};
    private static final int[] onTransact = {5, 8, 10, 12};

    public static int onExtraCallbackWithResult(int i2) {
        if (i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368) {
            return 1;
        }
        if (i2 == 1683496997 || i2 == 622876772) {
            return 2;
        }
        if (i2 == 1078008818 || i2 == -233094848) {
            return 3;
        }
        return (i2 == 1908687592 || i2 == -398277519) ? 4 : 0;
    }

    public static final class onExtraCallback {
        public final long IAuthTabCallback;
        public final int asInterface;
        public final int onExtraCallback;
        public final int onExtraCallbackWithResult;
        public final String onNavigationEvent;
        public final int onWarmupCompleted;

        private onExtraCallback(String str, int i2, int i3, int i4, long j, int i5) {
            this.onNavigationEvent = str;
            this.onExtraCallback = i2;
            this.asInterface = i3;
            this.onWarmupCompleted = i4;
            this.IAuthTabCallback = j;
            this.onExtraCallbackWithResult = i5;
        }
    }

    public static BasicTextContextMenuProviderKtExternalSyntheticLambda4 onExtraCallback(byte[] bArr, @Nullable String str, @Nullable String str2, int i2, String str3, @Nullable BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0) {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder = asBinder(bArr);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.IAuthTabCallback(60);
        int i3 = IAuthTabCallback[textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onNavigationEvent(6)];
        int i4 = onWarmupCompleted[textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onNavigationEvent(4)];
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onNavigationEvent(5);
        int[] iArr = onExtraCallbackWithResult;
        int i5 = iOnNavigationEvent >= iArr.length ? -1 : (iArr[iOnNavigationEvent] * 1000) / 2;
        textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.IAuthTabCallback(10);
        return new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult(str).onNavigationEvent(str3).IAuthTabCallbackDefault("audio/vnd.dts").onNavigationEvent(i5).onExtraCallback(i3 + (textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onNavigationEvent(2) > 0 ? 1 : 0)).extraCallbackWithResult(i4).onNavigationEvent(basicTextContextMenuProviderExternalSyntheticLambda0).onWarmupCompleted(str2).readTypedObject(i2).onNavigationEvent();
    }

    public static int onWarmupCompleted(byte[] bArr) {
        int i2;
        byte b;
        int i3;
        byte b2;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 == -1) {
                i2 = (bArr[4] & 7) << 4;
                b2 = bArr[7];
            } else if (b3 == 31) {
                i2 = (bArr[5] & 7) << 4;
                b2 = bArr[6];
            } else {
                i2 = (bArr[4] & 1) << 6;
                b = bArr[5];
            }
            i3 = b2 & 60;
            return (((i3 >> 2) | i2) + 1) << 5;
        }
        i2 = (bArr[5] & 1) << 6;
        b = bArr[4];
        i3 = b & 252;
        return (((i3 >> 2) | i2) + 1) << 5;
    }

    public static int IAuthTabCallback(ByteBuffer byteBuffer) {
        int i2;
        byte b;
        int i3;
        byte b2;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b3 = byteBuffer.get(iPosition);
        if (b3 != -2) {
            if (b3 == -1) {
                i2 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b2 = byteBuffer.get(iPosition + 7);
            } else if (b3 == 31) {
                i2 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b2 = byteBuffer.get(iPosition + 6);
            } else {
                i2 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b = byteBuffer.get(iPosition + 5);
            }
            i3 = b2 & 60;
            return (((i3 >> 2) | i2) + 1) << 5;
        }
        i2 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b = byteBuffer.get(iPosition + 4);
        i3 = b & 252;
        return (((i3 >> 2) | i2) + 1) << 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int onExtraCallbackWithResult(byte[] bArr) {
        int i2;
        byte b;
        int i3;
        int i4;
        byte b2;
        boolean z = false;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 == -1) {
                i4 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b2 = bArr[9];
            } else if (b3 == 31) {
                i4 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b2 = bArr[8];
            } else {
                i2 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b = bArr[7];
            }
            i3 = (((b2 & 60) >> 2) | i4) + 1;
            z = true;
            return !z ? (i3 << 4) / 14 : i3;
        }
        i2 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b = bArr[6];
        i3 = (((b & 240) >> 4) | i2) + 1;
        if (!z) {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static onExtraCallback IAuthTabCallback(byte[] bArr) throws ParserException {
        int i2;
        int i3;
        int iOnNavigationEvent;
        int i4;
        long jIAuthTabCallback;
        int i5;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder = asBinder(bArr);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.IAuthTabCallback(40);
        int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onNavigationEvent(2);
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onWarmupCompleted()) {
            i2 = 20;
            i3 = 12;
        } else {
            i2 = 16;
            i3 = 8;
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.IAuthTabCallback(i3);
        int iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onNavigationEvent(i2);
        boolean zOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onWarmupCompleted();
        int iOnNavigationEvent4 = -1;
        int i6 = 0;
        if (zOnWarmupCompleted) {
            iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onNavigationEvent(2);
            int iOnNavigationEvent5 = textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onNavigationEvent(3);
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onWarmupCompleted()) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.IAuthTabCallback(36);
            }
            int iOnNavigationEvent6 = textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onNavigationEvent(3);
            int iOnNavigationEvent7 = textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onNavigationEvent(3);
            if (iOnNavigationEvent6 + 1 != 1 || iOnNavigationEvent7 + 1 != 1) {
                throw ParserException.onExtraCallback("Multiple audio presentations or assets not supported");
            }
            int i7 = iOnNavigationEvent2 + 1;
            int iOnNavigationEvent8 = textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onNavigationEvent(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                if (((iOnNavigationEvent8 >> i8) & 1) == 1) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.IAuthTabCallback(8);
                }
            }
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onWarmupCompleted()) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.IAuthTabCallback(2);
                int iOnNavigationEvent9 = textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onNavigationEvent(2);
                int iOnNavigationEvent10 = textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onNavigationEvent(2);
                while (i6 < iOnNavigationEvent10 + 1) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.IAuthTabCallback((iOnNavigationEvent9 + 1) << 2);
                    i6++;
                }
            }
            i6 = (iOnNavigationEvent5 + 1) << 9;
        } else {
            iOnNavigationEvent = -1;
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.IAuthTabCallback(i2);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.IAuthTabCallback(12);
        if (zOnWarmupCompleted) {
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onWarmupCompleted()) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.IAuthTabCallback(4);
            }
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onWarmupCompleted()) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.IAuthTabCallback(24);
            }
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onWarmupCompleted()) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onNavigationEvent(10) + 1);
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.IAuthTabCallback(5);
            i4 = onExtraCallback[textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onNavigationEvent(4)];
            iOnNavigationEvent4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onNavigationEvent(8) + 1;
        } else {
            i4 = -2147483647;
        }
        int i9 = i4;
        int i10 = iOnNavigationEvent4;
        if (zOnWarmupCompleted) {
            if (iOnNavigationEvent == 0) {
                i5 = 32000;
            } else if (iOnNavigationEvent == 1) {
                i5 = 44100;
            } else {
                if (iOnNavigationEvent != 2) {
                    throw ParserException.onNavigationEvent("Unsupported reference clock code in DTS HD header: " + iOnNavigationEvent, (Throwable) null);
                }
                i5 = OpusUtil.SAMPLE_RATE;
            }
            jIAuthTabCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(i6, 1000000L, i5);
        } else {
            jIAuthTabCallback = -9223372036854775807L;
        }
        return new onExtraCallback("audio/vnd.dts.hd;profile=lbr", i10, i9, iOnNavigationEvent3 + 1, jIAuthTabCallback, 0);
    }

    public static int onNavigationEvent(byte[] bArr) {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder = asBinder(bArr);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.IAuthTabCallback(42);
        return textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onWarmupCompleted() ? 12 : 8) + 1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static onExtraCallback onExtraCallbackWithResult(byte[] bArr, AtomicInteger atomicInteger) throws ParserException {
        int iOnNavigationEvent;
        long jIAuthTabCallback;
        int i2;
        int i3;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder = asBinder(bArr);
        int i4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onNavigationEvent(32) == 1078008818 ? 1 : 0;
        int iOnExtraCallback = onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder, asBinder, true) + 1;
        if (i4 == 0) {
            iOnNavigationEvent = -2147483647;
            jIAuthTabCallback = -9223372036854775807L;
        } else {
            if (!textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onWarmupCompleted()) {
                throw ParserException.onExtraCallback("Only supports full channel mask-based audio presentation");
            }
            onExtraCallbackWithResult(bArr, iOnExtraCallback);
            int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onNavigationEvent(2);
            if (iOnNavigationEvent2 == 0) {
                i2 = 512;
            } else if (iOnNavigationEvent2 == 1) {
                i2 = 480;
            } else {
                if (iOnNavigationEvent2 != 2) {
                    throw ParserException.onNavigationEvent("Unsupported base duration index in DTS UHD header: " + iOnNavigationEvent2, (Throwable) null);
                }
                i2 = 384;
            }
            int iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onNavigationEvent(3);
            int iOnNavigationEvent4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onNavigationEvent(2);
            if (iOnNavigationEvent4 == 0) {
                i3 = 32000;
            } else if (iOnNavigationEvent4 == 1) {
                i3 = 44100;
            } else {
                if (iOnNavigationEvent4 != 2) {
                    throw ParserException.onNavigationEvent("Unsupported clock rate index in DTS UHD header: " + iOnNavigationEvent4, (Throwable) null);
                }
                i3 = OpusUtil.SAMPLE_RATE;
            }
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onWarmupCompleted()) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.IAuthTabCallback(36);
            }
            iOnNavigationEvent = (1 << textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.onNavigationEvent(2)) * i3;
            jIAuthTabCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(i2 * (iOnNavigationEvent3 + 1), 1000000L, i3);
        }
        int i5 = iOnNavigationEvent;
        long j = jIAuthTabCallback;
        int iOnExtraCallback2 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            iOnExtraCallback2 += onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder, IAuthTabCallbackStub, true);
        }
        if (i4 != 0) {
            atomicInteger.set(onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder, onNavigationEvent, true));
        }
        return new onExtraCallback("audio/vnd.dts.uhd;profile=p2", 2, i5, iOnExtraCallback + iOnExtraCallback2 + (atomicInteger.get() != 0 ? onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder, IAuthTabCallbackDefault, true) : 0), j, 0);
    }

    public static int onExtraCallback(byte[] bArr) {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder = asBinder(bArr);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder.IAuthTabCallback(32);
        return onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21AsBinder, onTransact, true) + 1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private static void onExtraCallbackWithResult(byte[] bArr, int i2) throws ParserException {
        int i3 = i2 - 2;
        if (((bArr[i2 - 1] & 255) | ((bArr[i3] << 8) & RtpPacket.MAX_SEQUENCE_NUMBER)) != TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(bArr, 0, i3, RtpPacket.MAX_SEQUENCE_NUMBER)) {
            throw ParserException.onNavigationEvent("CRC check failed", (Throwable) null);
        }
    }

    private static int onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21, int[] iArr, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 3 && textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted(); i4++) {
            i3++;
        }
        if (z) {
            int i5 = 0;
            while (i2 < i3) {
                i5 += 1 << iArr[i2];
                i2++;
            }
            i2 = i5;
        }
        return i2 + textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(iArr[i3]);
    }

    private static TextFieldDecoratorModifierNodeExternalSyntheticLambda21 asBinder(byte[] bArr) {
        byte b = bArr[0];
        if (b == Byte.MAX_VALUE || b == 100 || b == 64 || b == 113) {
            return new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (asInterface(bArrCopyOf)) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b2 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b2;
            }
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda212 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(bArrCopyOf);
            while (textFieldDecoratorModifierNodeExternalSyntheticLambda212.onExtraCallback() >= 16) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda212.IAuthTabCallback(2);
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda212.onNavigationEvent(14), 14);
            }
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback(bArrCopyOf);
        return textFieldDecoratorModifierNodeExternalSyntheticLambda21;
    }

    private static boolean asInterface(byte[] bArr) {
        byte b = bArr[0];
        return b == -2 || b == -1 || b == 37 || b == -14 || b == -24;
    }
}
