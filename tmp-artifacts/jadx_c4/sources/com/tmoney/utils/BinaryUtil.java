package com.tmoney.utils;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class BinaryUtil {
    private static short[] onExtraCallbackWithResult;
    private static final byte[] $$a = {5, -4, -80, 1};
    private static final int $$b = 203;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 939811034;
    private static int onNavigationEvent = -1538795482;
    private static int IAuthTabCallback = 507794982;
    private static byte[] onWarmupCompleted = {-37};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, short s2) {
        int i2;
        byte[] bArr = $$a;
        int i3 = s * 3;
        int i4 = 4 - (i * 3);
        int i5 = 115 - (s2 * 3);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i4++;
            i5 = (-i5) + i6;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            int i8 = i2 + 1;
            i6 = i5;
            i5 = bArr[i4];
            i7 = i8;
            i4++;
            i5 = (-i5) + i6;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
            }
        }
    }

    public static String binaryToDateTime(String str) throws Throwable {
        String string;
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a((short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (byte) (View.resolveSize(0, 0) + 4), 1673283374 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (Process.myPid() >> 22) + 1174172162, (-47) - TextUtils.getOffsetBefore("", 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        String strHexStringToBinaryString = hexStringToBinaryString(str);
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.parseInt(strHexStringToBinaryString.substring(0, 7), 2) + 2000);
        String string2 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.parseInt(strHexStringToBinaryString.substring(7, 11), 2));
        String string3 = sb2.toString();
        while (string3.length() % 2 != 0) {
            string3 = strIntern + string3;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Integer.parseInt(strHexStringToBinaryString.substring(11, 16), 2));
        String string4 = sb3.toString();
        while (string4.length() % 2 != 0) {
            string4 = strIntern + string4;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(Integer.parseInt(strHexStringToBinaryString.substring(16, 21), 2));
        String string5 = sb4.toString();
        while (string5.length() % 2 != 0) {
            string5 = strIntern + string5;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(Integer.parseInt(strHexStringToBinaryString.substring(21, 27), 2));
        String string6 = sb5.toString();
        while (string6.length() % 2 != 0) {
            string6 = strIntern + string6;
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(Integer.parseInt(strHexStringToBinaryString.substring(27, 33), 2));
        while (true) {
            string = sb6.toString();
            if (string.length() % 2 == 0) {
                break;
            }
            sb6 = new StringBuilder(strIntern);
            sb6.append(string);
            int i2 = asBinder + 17;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
        }
        String str2 = string2 + string3 + string4 + string5 + string6 + string;
        int i4 = asBinder + 91;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return str2;
        }
        throw null;
    }

    public static String hexStringToBinaryString(String str) throws Throwable {
        String binaryString;
        int i = 2 % 2;
        String str2 = "";
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            int i4 = asBinder + 125;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                binaryString = Integer.toBinaryString(hexStringToInt(str.substring(i2, i2)));
            } else {
                int i5 = i2 + 1;
                binaryString = Integer.toBinaryString(hexStringToInt(str.substring(i2, i5)));
                i2 = i5;
            }
            int i6 = IAuthTabCallbackStub + 119;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            while (binaryString.length() % 4 != 0) {
                Object[] objArr = new Object[1];
                a((short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 5), 1673283374 - Color.red(0), 1174172162 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-47) - View.MeasureSpec.getSize(0), objArr);
                binaryString = ((String) objArr[0]).intern() + binaryString;
            }
            str2 = str2 + binaryString;
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int hexStringToInt(String str) {
        int i = 2 % 2;
        byte[] bArr = new byte[str.length()];
        int i2 = 0;
        int length = 0;
        while (i2 < str.length()) {
            int i3 = IAuthTabCallbackStub + 87;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 1;
            if (!str.substring(i2, i5).equals("A")) {
                int i6 = IAuthTabCallbackStub + 71;
                asBinder = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 54 / 0;
                    if (str.substring(i2, i5).equals("a")) {
                        bArr[i2] = 10;
                    } else if (!str.substring(i2, i5).equals(LiveCheckConstants.LOAD_PHONE_LOST_ACK)) {
                        int i8 = asBinder + 21;
                        IAuthTabCallbackStub = i8 % 128;
                        if (i8 % 2 == 0) {
                            str.substring(i2, i5).equals("b");
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (str.substring(i2, i5).equals("b")) {
                            bArr[i2] = 11;
                        } else if (!(!str.substring(i2, i5).equals("C")) || !(!str.substring(i2, i5).equals("c"))) {
                            bArr[i2] = 12;
                        } else if (str.substring(i2, i5).equals("D") || str.substring(i2, i5).equals("d")) {
                            bArr[i2] = 13;
                            int i9 = IAuthTabCallbackStub + 73;
                            asBinder = i9 % 128;
                            int i10 = i9 % 2;
                        } else if (!str.substring(i2, i5).equals("E")) {
                            int i11 = asBinder + 51;
                            IAuthTabCallbackStub = i11 % 128;
                            int i12 = i11 % 2;
                            if (str.substring(i2, i5).equals("e")) {
                                bArr[i2] = 14;
                            } else if (str.substring(i2, i5).equals("F") || str.substring(i2, i5).equals("f")) {
                                bArr[i2] = 15;
                            } else {
                                int i13 = asBinder + 1;
                                IAuthTabCallbackStub = i13 % 128;
                                if (i13 % 2 == 0) {
                                    bArr[i2] = (byte) (Integer.parseInt(str.substring(i2, i5)) & 32);
                                } else {
                                    bArr[i2] = (byte) (Integer.parseInt(str.substring(i2, i5)) & 15);
                                }
                            }
                        }
                    }
                } else if (!str.substring(i2, i5).equals("a")) {
                }
            }
            length += bArr[i2] << ((str.length() - i5) << 2);
            i2 = i5;
        }
        return length;
    }

    public static byte[] parseBinary(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 13;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = 0;
        byte[] bArr = i3 % 2 == 0 ? new byte[2] : new byte[4];
        while (i4 < 4) {
            int i5 = asBinder;
            int i6 = i5 + 41;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            bArr[i4] = (byte) (i >>> ((3 - i4) << 3));
            i4++;
            int i8 = i5 + 13;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
        }
        return bArr;
    }

    public static int parseInt(byte[] bArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        for (int i5 = 0; i5 < 4; i5++) {
            int i6 = asBinder + 125;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            i4 = (i4 << 8) + (bArr[i5] & 255);
        }
        int i8 = asBinder + 89;
        IAuthTabCallbackStub = i8 % 128;
        if (i8 % 2 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String toBinaryString(byte b) {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String hexString = Integer.toHexString(b & 255);
        int i4 = asBinder + 27;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return hexString;
    }

    public static String toBinaryString(byte[] bArr) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            int i4 = asBinder + 99;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            String binaryString = toBinaryString(b);
            if (binaryString.length() == 1) {
                Object[] objArr = new Object[1];
                a((short) Color.green(0), (byte) (4 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 1673283374 - (ViewConfiguration.getTapTimeout() >> 16), 1174172162 - TextUtils.indexOf("", ""), (-47) - Drawable.resolveOpacity(0, 0), objArr);
                stringBuffer.append(((String) objArr[0]).intern());
            }
            stringBuffer.append(binaryString);
        }
        String string = stringBuffer.toString();
        int i6 = IAuthTabCallbackStub + 123;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return string;
    }

    public static String toBinaryStringtoUp(byte[] bArr) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 59;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (bArr != null) {
            return toBinaryString(bArr).toUpperCase();
        }
        int i5 = i2 + 61;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
        return "";
    }

    public static String toHexString(byte b) {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String hexString = toHexString(new byte[]{b});
        int i4 = asBinder + 41;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return hexString;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String toHexString(byte[] bArr) {
        int i;
        int i2 = 2 % 2;
        if (bArr == null) {
            int i3 = IAuthTabCallbackStub + 89;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 43 / 0;
            }
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i5 = IAuthTabCallbackStub + 3;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        for (int i7 = 0; i7 < bArr.length; i7++) {
            int i8 = (bArr[i7] >> 4) & 15;
            if (i8 <= 9) {
                stringBuffer.append(i8);
            } else {
                stringBuffer.append((char) (i8 + 55));
            }
            int i9 = bArr[i7] & 15;
            if (i9 <= 9) {
                stringBuffer.append(i9);
                i = asBinder + 71;
                IAuthTabCallbackStub = i % 128;
            } else {
                stringBuffer.append((char) (i9 + 55));
                i = IAuthTabCallbackStub + 71;
                asBinder = i % 128;
            }
            int i10 = i % 2;
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01b7 A[PHI: r3
      0x01b7: PHI (r3v9 int) = (r3v8 int), (r3v48 int) binds: [B:40:0x01b5, B:37:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b9 A[PHI: r3
      0x01b9: PHI (r3v45 int) = (r3v8 int), (r3v48 int) binds: [B:40:0x01b5, B:37:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getEdgeSlop() >> 16)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 41, 22439 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            char c = 3;
            float f = 0.0f;
            if (z2) {
                byte[] bArr = onWarmupCompleted;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = $11 + 99;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = 0;
                    while (i10 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) ($$a[c] - 1);
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Color.red(0)), (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)) + 55, View.MeasureSpec.getSize(0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i10++;
                        c = 3;
                        f = 0.0f;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onWarmupCompleted;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 42, 22439 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    i4 = 2;
                } else {
                    iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    int i11 = $10 + 35;
                    $11 = i11 % 128;
                    i4 = 2;
                    int i12 = i11 % 2;
                }
            } else {
                i4 = 2;
            }
            if (iIntValue > 0) {
                int i13 = $10;
                int i14 = i13 + 43;
                $11 = i14 % 128;
                if (i14 % i4 == 0) {
                    i5 = ((i * iIntValue) + 5) / ((int) (onExtraCallback | (-4629411779493505016L)));
                    if (z2) {
                        i6 = 1;
                    } else {
                        int i15 = i13 + 39;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        i6 = 0;
                    }
                } else {
                    i5 = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ (-4629411779493505016L)));
                    if (z2) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i5 + i6;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 86, 9566 - MotionEvent.axisFromString(""), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onWarmupCompleted;
                if (bArr4 != null) {
                    int i17 = $11 + 83;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    loop1: while (true) {
                        int i19 = 0;
                        while (i19 < length2) {
                            int i20 = $10 + 109;
                            $11 = i20 % 128;
                            if (i20 % 2 == 0) {
                                break;
                            }
                            bArr5[i19] = (byte) (bArr4[i19] ^ (-4629411779493505016L));
                            i19++;
                        }
                        bArr5[i19] = (byte) (bArr4[i19] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i21 = $10 + 77;
                    $11 = i21 % 128;
                    int i22 = i21 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
