package com.google.zxing.pdf417.encoder;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.ECIInput;
import com.google.zxing.common.MinimalECIInput;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class PDF417HighLevelEncoder {
    private static int $10 = 0;
    private static int $11 = 1;
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int BYTE_COMPACTION = 1;
    private static final Charset DEFAULT_ENCODING;
    private static final int ECI_CHARSET = 927;
    private static final int ECI_GENERAL_PURPOSE = 926;
    private static final int ECI_USER_DEFINED = 925;
    private static int IAuthTabCallback = 1;
    private static final int LATCH_TO_BYTE = 924;
    private static final int LATCH_TO_BYTE_PADDED = 901;
    private static final int LATCH_TO_NUMERIC = 902;
    private static final int LATCH_TO_TEXT = 900;
    private static final byte[] MIXED;
    private static final int NUMERIC_COMPACTION = 2;
    private static final byte[] PUNCTUATION;
    private static final int SHIFT_TO_BYTE = 913;
    private static final int SUBMODE_ALPHA = 0;
    private static final int SUBMODE_LOWER = 1;
    private static final int SUBMODE_MIXED = 2;
    private static final int SUBMODE_PUNCTUATION = 3;
    private static final int TEXT_COMPACTION = 0;
    private static final byte[] TEXT_MIXED_RAW;
    private static final byte[] TEXT_PUNCTUATION_RAW;
    private static int onExtraCallback = 0;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    private static boolean isAlphaLower(char c) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 53;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if (c == ' ') {
            return true;
        }
        int i6 = i4 + 119;
        int i7 = i6 % 128;
        onWarmupCompleted = i7;
        if (i6 % 2 != 0) {
            if (c < 'A') {
                return false;
            }
        } else if (c < 'a') {
            return false;
        }
        int i8 = i7 + 111;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return c <= 'z';
    }

    private static boolean isAlphaUpper(char c) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 123;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 != 0) {
            if (c == '@') {
                return true;
            }
        } else if (c == ' ') {
            return true;
        }
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        int i5 = i4 + 49;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    private static boolean isDigit(char c) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 63;
        int i5 = i4 % 128;
        IAuthTabCallback = i5;
        if (i4 % 2 != 0 ? c >= '0' : c >= 24) {
            if (c <= '9') {
                int i6 = i3 + 65;
                IAuthTabCallback = i6 % 128;
                return i6 % 2 != 0;
            }
        }
        int i7 = i5 + 83;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    private static boolean isText(char c) {
        int i2 = 2 % 2;
        if (c != '\t') {
            int i3 = IAuthTabCallback;
            int i4 = i3 + 45;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (c != '\n') {
                int i6 = i3 + 51;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0 ? c != '\r' : c != 1) {
                    if (c < ' ') {
                        return false;
                    }
                    int i7 = i3 + 57;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    if (c > '~') {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i4 = $11 + 11;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i6 = $11 + 7;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i8 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45811 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 83, 21233 - Color.green(0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - TextUtils.indexOf("", "", 0, 0)), 19 - View.resolveSizeAndState(0, 0, 0), 8808 - (ViewConfiguration.getTouchSlop() >> 8), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i9 = $11 + 41;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static {
        onNavigationEvent();
        TEXT_MIXED_RAW = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};
        TEXT_PUNCTUATION_RAW = new byte[]{59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};
        byte[] bArr = new byte[128];
        MIXED = bArr;
        PUNCTUATION = new byte[128];
        DEFAULT_ENCODING = StandardCharsets.ISO_8859_1;
        Arrays.fill(bArr, (byte) -1);
        int i2 = 2 % 2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            byte[] bArr2 = TEXT_MIXED_RAW;
            if (i4 >= bArr2.length) {
                break;
            }
            byte b = bArr2[i4];
            if (b > 0) {
                MIXED[b] = (byte) i4;
            }
            i4++;
        }
        Arrays.fill(PUNCTUATION, (byte) -1);
        int i5 = onExtraCallback + 99;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        while (true) {
            byte[] bArr3 = TEXT_PUNCTUATION_RAW;
            if (i3 >= bArr3.length) {
                int i7 = onNavigationEvent + 49;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
            int i9 = onExtraCallback;
            int i10 = i9 + 19;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            byte b2 = bArr3[i3];
            if (b2 > 0) {
                PUNCTUATION[b2] = (byte) i3;
                int i12 = i9 + 101;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
            }
            i3++;
        }
    }

    private PDF417HighLevelEncoder() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.zxing.WriterException */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static String encodeHighLevel(String str, Compaction compaction, Charset charset, boolean z) throws Throwable {
        ECIInput noECIInput;
        CharacterSetECI characterSetECI;
        byte[] bytes;
        Charset charset2 = charset;
        int i2 = 2 % 2;
        if (str.isEmpty()) {
            throw new WriterException("Empty message not allowed");
        }
        int i3 = onWarmupCompleted + 87;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (charset2 == null && !z) {
            for (int i5 = 0; i5 < str.length(); i5++) {
                if (str.charAt(i5) > 255) {
                    throw new WriterException("Non-encodable character detected: " + str.charAt(i5) + " (Unicode: " + ((int) str.charAt(i5)) + "). Consider specifying EncodeHintType.PDF417_AUTO_ECI and/or EncodeTypeHint.CHARACTER_SET.");
                }
            }
        }
        StringBuilder sb = new StringBuilder(str.length());
        AnonymousClass1 anonymousClass1 = null;
        if (z) {
            noECIInput = new MinimalECIInput(str, charset2, -1);
        } else {
            noECIInput = new NoECIInput(str, anonymousClass1);
            if (charset2 == null) {
                charset2 = DEFAULT_ENCODING;
            } else if (!DEFAULT_ENCODING.equals(charset2) && (characterSetECI = CharacterSetECI.getCharacterSetECI(charset)) != null) {
                int i6 = onWarmupCompleted + 27;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    encodingECI(characterSetECI.getValue(), sb);
                    int i7 = 2 / 0;
                } else {
                    encodingECI(characterSetECI.getValue(), sb);
                }
            }
        }
        int length = noECIInput.length();
        int i8 = AnonymousClass1.$SwitchMap$com$google$zxing$pdf417$encoder$Compaction[compaction.ordinal()];
        if (i8 == 1) {
            encodeText(noECIInput, 0, length, sb, 0);
            int i9 = onWarmupCompleted + 11;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
        } else if (i8 != 2) {
            if (i8 != 3) {
                int i11 = 0;
                int iEncodeText = 0;
                int i12 = 0;
                while (i11 < length) {
                    while (i11 < length && noECIInput.isECI(i11)) {
                        encodingECI(noECIInput.getECIValue(i11), sb);
                        i11++;
                        int i13 = IAuthTabCallback + 29;
                        onWarmupCompleted = i13 % 128;
                        int i14 = i13 % 2;
                    }
                    if (i11 >= length) {
                        break;
                    }
                    int iDetermineConsecutiveDigitCount = determineConsecutiveDigitCount(noECIInput, i11);
                    if (iDetermineConsecutiveDigitCount >= 13) {
                        sb.append((char) 902);
                        encodeNumeric(noECIInput, i11, iDetermineConsecutiveDigitCount, sb);
                        i11 += iDetermineConsecutiveDigitCount;
                        i12 = 2;
                        iEncodeText = 0;
                    } else {
                        int iDetermineConsecutiveTextCount = determineConsecutiveTextCount(noECIInput, i11);
                        if (iDetermineConsecutiveTextCount < 5) {
                            int i15 = IAuthTabCallback + 29;
                            onWarmupCompleted = i15 % 128;
                            if (i15 % 2 != 0) {
                                int i16 = 44 / 0;
                                if (iDetermineConsecutiveDigitCount != length) {
                                    int iDetermineConsecutiveBinaryCount = determineConsecutiveBinaryCount(noECIInput, i11, z ? null : charset2);
                                    if (iDetermineConsecutiveBinaryCount == 0) {
                                        iDetermineConsecutiveBinaryCount = 1;
                                    }
                                    if (!z) {
                                        bytes = noECIInput.subSequence(i11, i11 + iDetermineConsecutiveBinaryCount).toString().getBytes(charset2);
                                    } else {
                                        int i17 = onWarmupCompleted + 105;
                                        IAuthTabCallback = i17 % 128;
                                        int i18 = i17 % 2;
                                        bytes = null;
                                    }
                                    if ((!(bytes == null && iDetermineConsecutiveBinaryCount == 1) && (bytes == null || bytes.length != 1)) || i12 != 0) {
                                        if (z) {
                                            int i19 = IAuthTabCallback + 123;
                                            onWarmupCompleted = i19 % 128;
                                            encodeMultiECIBinary(noECIInput, i11, i19 % 2 != 0 ? i11 % iDetermineConsecutiveBinaryCount : i11 + iDetermineConsecutiveBinaryCount, i12, sb);
                                        } else {
                                            encodeBinary(bytes, 0, bytes.length, i12, sb);
                                        }
                                        iEncodeText = 0;
                                        i12 = 1;
                                    } else {
                                        int i20 = IAuthTabCallback + 119;
                                        onWarmupCompleted = i20 % 128;
                                        if (i20 % 2 != 0) {
                                            int i21 = 30 / 0;
                                            if (z) {
                                                encodeMultiECIBinary(noECIInput, i11, 1, 0, sb);
                                            } else {
                                                encodeBinary(bytes, 0, 1, 0, sb);
                                            }
                                        } else if (z) {
                                        }
                                    }
                                    i11 += iDetermineConsecutiveBinaryCount;
                                } else {
                                    if (i12 != 0) {
                                        int i22 = IAuthTabCallback + 67;
                                        onWarmupCompleted = i22 % 128;
                                        sb.append(i22 % 2 != 0 ? (char) 1127 : (char) 900);
                                        iEncodeText = 0;
                                        i12 = 0;
                                    }
                                    iEncodeText = encodeText(noECIInput, i11, iDetermineConsecutiveTextCount, sb, iEncodeText);
                                    i11 += iDetermineConsecutiveTextCount;
                                }
                            } else if (iDetermineConsecutiveDigitCount != length) {
                            }
                        }
                    }
                }
            } else {
                sb.append((char) 902);
                encodeNumeric(noECIInput, 0, length, sb);
            }
        } else if (z) {
            encodeMultiECIBinary(noECIInput, 0, noECIInput.length(), 0, sb);
        } else {
            byte[] bytes2 = noECIInput.toString().getBytes(charset2);
            encodeBinary(bytes2, 0, bytes2.length, 1, sb);
        }
        return sb.toString();
    }

    /* renamed from: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$pdf417$encoder$Compaction;

        static {
            int[] iArr = new int[Compaction.values().length];
            $SwitchMap$com$google$zxing$pdf417$encoder$Compaction = iArr;
            try {
                iArr[Compaction.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$encoder$Compaction[Compaction.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$encoder$Compaction[Compaction.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0165 A[EDGE_INSN: B:88:0x0165->B:68:0x0165 BREAK  A[LOOP:0: B:3:0x0012->B:107:0x0012], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0073 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int encodeText(ECIInput eCIInput, int i2, int i3, StringBuilder sb, int i4) throws WriterException {
        int i5 = 2 % 2;
        StringBuilder sb2 = new StringBuilder(i3);
        int i6 = i4;
        int i7 = 0;
        while (true) {
            int i8 = i2 + i7;
            if (eCIInput.isECI(i8)) {
                int i9 = onWarmupCompleted + 45;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                encodingECI(eCIInput.getECIValue(i8), sb);
                i7++;
            } else {
                char cCharAt = eCIInput.charAt(i8);
                if (i6 != 0) {
                    if (i6 != 1) {
                        int i11 = onWarmupCompleted + 69;
                        IAuthTabCallback = i11 % 128;
                        if (i11 % 2 == 0) {
                            if (i6 != 2) {
                                if (isPunctuation(cCharAt)) {
                                    sb2.append((char) 29);
                                    i6 = 0;
                                } else {
                                    sb2.append((char) PUNCTUATION[cCharAt]);
                                    int i12 = onWarmupCompleted + 5;
                                    IAuthTabCallback = i12 % 128;
                                    int i13 = i12 % 2;
                                }
                            }
                            if (!isMixed(cCharAt)) {
                                int i14 = IAuthTabCallback + 11;
                                onWarmupCompleted = i14 % 128;
                                int i15 = i14 % 2;
                                sb2.append((char) MIXED[cCharAt]);
                            } else if (isAlphaUpper(cCharAt)) {
                                sb2.append((char) 28);
                                i6 = 0;
                            } else if (isAlphaLower(cCharAt)) {
                                sb2.append((char) 27);
                                i6 = 1;
                            } else {
                                int i16 = i8 + 1;
                                if (i16 >= i3 || eCIInput.isECI(i16) || !isPunctuation(eCIInput.charAt(i16))) {
                                    sb2.append((char) 29);
                                    sb2.append((char) PUNCTUATION[cCharAt]);
                                } else {
                                    sb2.append((char) 25);
                                    i6 = 3;
                                }
                            }
                        } else {
                            if (i6 != 2) {
                                if (isPunctuation(cCharAt)) {
                                }
                            }
                            if (!isMixed(cCharAt)) {
                            }
                        }
                    } else if (isAlphaLower(cCharAt)) {
                        if (cCharAt == ' ') {
                            int i17 = IAuthTabCallback + 101;
                            onWarmupCompleted = i17 % 128;
                            int i18 = i17 % 2;
                            sb2.append((char) 26);
                        } else {
                            sb2.append((char) (cCharAt - 'a'));
                        }
                    } else if (isAlphaUpper(cCharAt)) {
                        sb2.append((char) 27);
                        sb2.append((char) (cCharAt - 'A'));
                    } else if (isMixed(cCharAt)) {
                        sb2.append((char) 28);
                        i6 = 2;
                    } else {
                        sb2.append((char) 29);
                        sb2.append((char) PUNCTUATION[cCharAt]);
                    }
                    i7++;
                    if (i7 < i3) {
                        break;
                    }
                } else {
                    if (isAlphaUpper(cCharAt)) {
                        int i19 = onWarmupCompleted + 95;
                        int i20 = i19 % 128;
                        IAuthTabCallback = i20;
                        int i21 = i19 % 2;
                        if (cCharAt == ' ') {
                            int i22 = i20 + 79;
                            onWarmupCompleted = i22 % 128;
                            int i23 = i22 % 2;
                            sb2.append((char) 26);
                        } else {
                            sb2.append((char) (cCharAt - 'A'));
                        }
                    } else if (isAlphaLower(cCharAt)) {
                        sb2.append((char) 27);
                        i6 = 1;
                    } else if (isMixed(cCharAt)) {
                        int i24 = IAuthTabCallback + 121;
                        onWarmupCompleted = i24 % 128;
                        if (i24 % 2 != 0) {
                            sb2.append('&');
                        } else {
                            sb2.append((char) 28);
                        }
                        i6 = 2;
                    } else {
                        sb2.append((char) 29);
                        sb2.append((char) PUNCTUATION[cCharAt]);
                    }
                    i7++;
                    if (i7 < i3) {
                    }
                }
            }
        }
        int length = sb2.length();
        char cCharAt2 = 0;
        for (int i25 = 0; i25 < length; i25++) {
            if (i25 % 2 != 0) {
                cCharAt2 = (char) ((cCharAt2 * 30) + sb2.charAt(i25));
                sb.append(cCharAt2);
            } else {
                cCharAt2 = sb2.charAt(i25);
            }
        }
        if (length % 2 != 0) {
            sb.append((char) ((cCharAt2 * 30) + 29));
        }
        return i6;
    }

    private static void encodeMultiECIBinary(ECIInput eCIInput, int i2, int i3, int i4, StringBuilder sb) throws WriterException {
        int i5;
        int i6 = 2 % 2;
        int iMin = Math.min(i3 + i2, eCIInput.length());
        int i7 = i2;
        while (true) {
            if (i7 < iMin) {
                int i8 = IAuthTabCallback + 33;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 != 0) {
                    eCIInput.isECI(i7);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (eCIInput.isECI(i7)) {
                    int i9 = IAuthTabCallback + 81;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    encodingECI(eCIInput.getECIValue(i7), sb);
                    i7++;
                }
            }
            int i11 = i7;
            while (i11 < iMin) {
                int i12 = IAuthTabCallback + 57;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                if (eCIInput.isECI(i11)) {
                    break;
                } else {
                    i11++;
                }
            }
            int i14 = i11 - i7;
            if (i14 <= 0) {
                return;
            }
            byte[] bArrSubBytes = subBytes(eCIInput, i7, i11);
            if (i7 == i2) {
                i5 = i4;
            } else {
                int i15 = IAuthTabCallback + 41;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                i5 = 1;
            }
            encodeBinary(bArrSubBytes, 0, i14, i5, sb);
            i7 = i11;
        }
    }

    static byte[] subBytes(ECIInput eCIInput, int i2, int i3) {
        int i4 = 2 % 2;
        byte[] bArr = new byte[i3 - i2];
        for (int i5 = i2; i5 < i3; i5++) {
            int i6 = IAuthTabCallback + 31;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            bArr[i5 - i2] = (byte) eCIInput.charAt(i5);
        }
        int i8 = IAuthTabCallback + 79;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            return bArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void encodeBinary(byte[] bArr, int i2, int i3, int i4, StringBuilder sb) {
        int i5;
        int i6 = 2 % 2;
        if (i3 == 1) {
            int i7 = IAuthTabCallback + 15;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            if (i4 == 0) {
                sb.append((char) 913);
            } else if (i3 % 6 == 0) {
                sb.append((char) 924);
                int i9 = onWarmupCompleted + 121;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
            } else {
                sb.append((char) 901);
            }
        }
        if (i3 >= 6) {
            int i11 = onWarmupCompleted + 41;
            IAuthTabCallback = i11 % 128;
            char[] cArr = i11 % 2 == 0 ? new char[2] : new char[5];
            i5 = i2;
            while ((i2 + i3) - i5 >= 6) {
                long j = 0;
                for (int i12 = 0; i12 < 6; i12++) {
                    int i13 = onWarmupCompleted + 103;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    j = (j << 8) + (bArr[i5 + i12] & 255);
                }
                for (int i15 = 0; i15 < 5; i15++) {
                    cArr[i15] = (char) (j % 900);
                    j /= 900;
                }
                for (int i16 = 4; i16 >= 0; i16--) {
                    sb.append(cArr[i16]);
                }
                i5 += 6;
            }
        } else {
            int i17 = onWarmupCompleted + 125;
            IAuthTabCallback = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 4 / 3;
            }
            i5 = i2;
        }
        while (i5 < i2 + i3) {
            sb.append((char) (bArr[i5] & 255));
            i5++;
        }
    }

    private static void encodeNumeric(ECIInput eCIInput, int i2, int i3, StringBuilder sb) throws Throwable {
        int i4 = 2 % 2;
        StringBuilder sb2 = new StringBuilder((i3 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i5 = onWarmupCompleted + 89;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        while (i7 < i3) {
            sb2.setLength(0);
            int iMin = Math.min(44, i3 - i7);
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{19287, 19302, 51427, 54361, 31136}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
            sb3.append(((String) objArr[0]).intern());
            int i8 = i2 + i7;
            sb3.append((Object) eCIInput.subSequence(i8, i8 + iMin));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                bigInteger = bigInteger.divide(bigIntegerValueOf);
            } while (!bigInteger.equals(bigIntegerValueOf2));
            int i9 = onWarmupCompleted + 109;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            for (int length = sb2.length() - 1; length >= 0; length--) {
                int i11 = IAuthTabCallback + 103;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                sb.append(sb2.charAt(length));
            }
            i7 += iMin;
        }
    }

    private static boolean isMixed(char c) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if (MIXED[c] == -1) {
            return false;
        }
        int i6 = i3 + 47;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private static boolean isPunctuation(char c) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 57;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        if (PUNCTUATION[c] != -1) {
            int i7 = i3 + 19;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        int i9 = i5 + 49;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    private static int determineConsecutiveDigitCount(ECIInput eCIInput, int i2) {
        int i3 = 2 % 2;
        int length = eCIInput.length();
        int i4 = 0;
        if (i2 < length) {
            int i5 = onWarmupCompleted + 11;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            while (i2 < length) {
                int i7 = IAuthTabCallback + 69;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                if (eCIInput.isECI(i2) || (!isDigit(eCIInput.charAt(i2)))) {
                    break;
                }
                int i9 = onWarmupCompleted + 75;
                int i10 = i9 % 128;
                IAuthTabCallback = i10;
                int i11 = i9 % 2;
                i4++;
                i2++;
                int i12 = i10 + 105;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
            }
        }
        return i4;
    }

    private static int determineConsecutiveTextCount(ECIInput eCIInput, int i2) {
        int i3 = 2 % 2;
        int length = eCIInput.length();
        int i4 = i2;
        while (true) {
            if (i4 >= length) {
                break;
            }
            int i5 = onWarmupCompleted + 13;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2 == 0 ? 1 : 0;
            while (i6 < 13 && i4 < length && !eCIInput.isECI(i4) && isDigit(eCIInput.charAt(i4))) {
                i6++;
                i4++;
            }
            if (i6 >= 13) {
                return (i4 - i2) - i6;
            }
            if (i6 <= 0) {
                if (eCIInput.isECI(i4)) {
                    break;
                }
                if (!isText(eCIInput.charAt(i4))) {
                    int i7 = onWarmupCompleted + 125;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    break;
                }
                i4++;
            }
        }
        return i4 - i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.zxing.WriterException */
    private static int determineConsecutiveBinaryCount(ECIInput eCIInput, int i2, Charset charset) throws WriterException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 113;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        CharsetEncoder charsetEncoderNewEncoder = charset == null ? null : charset.newEncoder();
        int length = eCIInput.length();
        int i6 = i2;
        while (i6 < length) {
            int i7 = IAuthTabCallback + 61;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            int i10 = i6;
            while (i9 < 13 && !eCIInput.isECI(i10)) {
                int i11 = IAuthTabCallback + 97;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                if (!isDigit(eCIInput.charAt(i10))) {
                    break;
                }
                int i13 = IAuthTabCallback + 23;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
                i9++;
                i10 = i6 + i9;
                if (i10 >= length) {
                    break;
                }
            }
            if (i9 >= 13) {
                return i6 - i2;
            }
            if (charsetEncoderNewEncoder != null && !charsetEncoderNewEncoder.canEncode(eCIInput.charAt(i6))) {
                char cCharAt = eCIInput.charAt(i6);
                throw new WriterException("Non-encodable character detected: " + cCharAt + " (Unicode: " + ((int) cCharAt) + ')');
            }
            i6++;
        }
        return i6 - i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.zxing.WriterException */
    private static void encodingECI(int i2, StringBuilder sb) throws WriterException {
        int i3 = 2 % 2;
        if (i2 >= 0) {
            int i4 = IAuthTabCallback + 69;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0 ? i2 < LATCH_TO_TEXT : i2 < 816) {
                sb.append((char) 927);
                sb.append((char) i2);
                return;
            }
        }
        if (i2 >= 810900) {
            if (i2 < 811800) {
                sb.append((char) 925);
                sb.append((char) (810900 - i2));
                return;
            } else {
                throw new WriterException("ECI number not in valid range from 0..811799, but was " + i2);
            }
        }
        int i5 = IAuthTabCallback + 113;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            sb.append((char) 3480);
            sb.append((char) ((i2 >> 27947) >>> 1));
            sb.append((char) (i2 >> 15783));
        } else {
            sb.append((char) 926);
            sb.append((char) ((i2 / LATCH_TO_TEXT) - 1));
            sb.append((char) (i2 % LATCH_TO_TEXT));
        }
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = 2310184544361384593L;
    }

    static final class NoECIInput implements ECIInput {
        String input;

        @Override // com.google.zxing.common.ECIInput
        public int getECIValue(int i2) {
            return -1;
        }

        @Override // com.google.zxing.common.ECIInput
        public boolean isECI(int i2) {
            return false;
        }

        /* synthetic */ NoECIInput(String str, AnonymousClass1 anonymousClass1) {
            this(str);
        }

        private NoECIInput(String str) {
            this.input = str;
        }

        @Override // com.google.zxing.common.ECIInput
        public int length() {
            return this.input.length();
        }

        @Override // com.google.zxing.common.ECIInput
        public char charAt(int i2) {
            return this.input.charAt(i2);
        }

        @Override // com.google.zxing.common.ECIInput
        public boolean haveNCharacters(int i2, int i3) {
            return i2 + i3 <= this.input.length();
        }

        @Override // com.google.zxing.common.ECIInput
        public CharSequence subSequence(int i2, int i3) {
            return this.input.subSequence(i2, i3);
        }

        public String toString() {
            return this.input;
        }
    }
}
