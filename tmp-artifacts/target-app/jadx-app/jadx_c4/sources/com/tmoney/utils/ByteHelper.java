package com.tmoney.utils;

import android.graphics.Color;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.skt.usp.UCPApiConstants;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ByteHelper {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String TAG = "ByteHelper";
    private static int onExtraCallback = 0;
    private static long onExtraCallbackWithResult = -5683828886274185323L;
    private static int onWarmupCompleted = 1;

    public static int BYTENCPY(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = 2 % 2;
        if (bArr2 != null) {
            int iMin = Math.min(bArr2.length, i3);
            System.arraycopy(bArr2, i2, bArr, i, iMin);
            return iMin;
        }
        int i5 = onExtraCallback + 13;
        int i6 = i5 % 128;
        onWarmupCompleted = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 85;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return 0;
    }

    public static byte[] CloneBytes(byte[] bArr, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 115;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        int i6 = onExtraCallback + 109;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return bArr2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void MEMSET(byte[] bArr, int i, byte b, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        for (int i6 = i; i6 < i2 + i; i6++) {
            int i7 = onWarmupCompleted + 13;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            bArr[i6] = b;
        }
    }

    public static String MakeKSC5601String(byte[] bArr, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = i + i2;
        int i5 = i;
        while (i5 < i4) {
            int i6 = onExtraCallback + 61;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                i5 = (bArr[i5] & 7668) < 2060 ? i5 + 1 : i5 + 2;
            } else if ((bArr[i5] & 255) < 128) {
            }
        }
        if (i5 > i4) {
            int i7 = onWarmupCompleted + 123;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                i2--;
            }
        }
        return new String(bArr, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r5 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int STRLEN(byte[] bArr, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 63;
        onWarmupCompleted = i3 % 128;
        int i4 = 0;
        if (i3 % 2 == 0) {
            if (bArr != null) {
                i4 = 1;
                int length = bArr.length;
                while (i4 < length - i) {
                    int i5 = onExtraCallback + 85;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        if (bArr[i + i4] == 0) {
                            break;
                        }
                        i4++;
                    } else {
                        if (bArr[i << i4] == 0) {
                            break;
                        }
                        i4++;
                    }
                }
                int i6 = onExtraCallback + 111;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    return i4;
                }
                throw null;
            }
            return 0;
        }
    }

    public static int STRNCPYToSpace(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = 2 % 2;
        try {
            int iMin = Math.min(i3, Math.min(STRLEN(bArr2, i2), i3));
            System.arraycopy(bArr2, i2, bArr, i, iMin);
            if (iMin == bArr.length - i) {
                int i5 = onExtraCallback + 31;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return iMin;
                }
                throw null;
            }
            while (iMin < i3) {
                bArr[i + iMin] = 32;
                iMin++;
                int i6 = onWarmupCompleted + 117;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            return i3;
        } catch (Exception e) {
            LogHelper.d(TAG, "STRNCPYToSpace::" + e.getMessage());
            return i3;
        }
    }

    public static String byteArrayToHexString(byte[] bArr) throws Throwable {
        int i = 2 % 2;
        if (bArr == null) {
            return null;
        }
        int i2 = onWarmupCompleted + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (bArr.length <= 0) {
            return null;
        }
        Object[] objArr = new Object[1];
        a(new char[]{41407, 41359, 35428, 11953, 5296}, 1 - Color.argb(0, 0, 0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{22088, 22137, 45143, 15005, 26988}, 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new char[]{1017, 971, 55694, 5972, 10318}, 1 - (ViewConfiguration.getTouchSlop() >> 8), objArr3);
        String[] strArr = {strIntern, strIntern2, ((String) objArr3[0]).intern(), "3", "4", "5", "6", "7", UCPApiConstants.ERR_CARD_DEVICES_RES_FAIL, "9", "A", LiveCheckConstants.LOAD_PHONE_LOST_ACK, "C", "D", "E", "F"};
        StringBuffer stringBuffer = new StringBuffer(bArr.length << 1);
        for (int i4 = 0; i4 < bArr.length; i4++) {
            int i5 = onWarmupCompleted + 3;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            stringBuffer.append(strArr[(byte) (((byte) (((byte) (bArr[i4] & 240)) >>> 4)) & 15)]);
            stringBuffer.append(strArr[(byte) (bArr[i4] & 15)]);
        }
        return new String(stringBuffer);
    }

    public static String format(String str, int i, char c, boolean z) {
        byte[] bytes;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 1;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        if (str != null) {
            bytes = str.getBytes();
            int i6 = onWarmupCompleted + 9;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        } else {
            int i8 = i3 + 109;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            bytes = null;
        }
        String str2 = format(bytes, i, c, z);
        int i10 = onExtraCallback + 123;
        onWarmupCompleted = i10 % 128;
        int i11 = i10 % 2;
        return str2;
    }

    public static String format(byte[] bArr, int i, char c, boolean z) {
        int i2 = 2 % 2;
        byte[] bArr2 = new byte[i];
        if (bArr == null) {
            int i3 = onExtraCallback + 43;
            onWarmupCompleted = i3 % 128;
            for (i = i3 % 2 == 0 ? 1 : 0; i < i; i++) {
                bArr2[i] = (byte) c;
            }
        } else if (z) {
            int i4 = 0;
            while (i < i) {
                if (i < bArr.length) {
                    bArr2[i] = bArr[i4];
                    i4++;
                } else {
                    bArr2[i] = (byte) c;
                }
                i++;
            }
        } else {
            int i5 = 0;
            while (i < i) {
                if (i < i - bArr.length) {
                    int i6 = onWarmupCompleted;
                    int i7 = i6 + 117;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        bArr2[i] = (byte) c;
                        throw null;
                    }
                    bArr2[i] = (byte) c;
                    int i8 = i6 + 47;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    bArr2[i] = bArr[i5];
                    i5++;
                }
                i++;
            }
        }
        return new String(bArr2);
    }

    public static byte[] hexStringToByteArray(String str) {
        int i = 2 % 2;
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        int i2 = 0;
        while (i2 < length) {
            int i3 = onExtraCallback + 21;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                bArr[i2 + 2] = (byte) ((Character.digit(str.charAt(i2), 73) >>> 5) - Character.digit(str.charAt(i2 + 1), 126));
                i2 += 83;
            } else {
                bArr[i2 / 2] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
                i2 += 2;
            }
            int i4 = onWarmupCompleted + 113;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return bArr;
    }

    public static String toHexString(byte[] bArr) {
        int i;
        int i2 = 2 % 2;
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < bArr.length; i3++) {
            int i4 = onExtraCallback + 87;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0 ? (i = (bArr[i3] >> 4) & 15) > 9 : (i = (bArr[i3] << 5) & 103) > 19) {
                stringBuffer.append((char) (i + 55));
            } else {
                stringBuffer.append(i);
            }
            int i5 = bArr[i3] & 15;
            if (i5 <= 9) {
                int i6 = onWarmupCompleted + 29;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                stringBuffer.append(i5);
                if (i7 != 0) {
                    int i8 = 3 / 0;
                }
            } else {
                stringBuffer.append((char) (i5 + 55));
                int i9 = onExtraCallback + 23;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        return stringBuffer.toString();
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 75;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45813 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 84 - (ViewConfiguration.getJumpTapTimeout() >> 16), 21233 - ExpandableListView.getPackedPositionType(0L), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 14186), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 19, 8809 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 121;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i7 = 89 / 0;
            objArr[0] = str;
        }
    }
}
