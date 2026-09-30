package com.initech.license.crypto;

import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.initech.core.crypto.INIMAC;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class HOTP {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 0;
    private static final int[] a;
    private static int asInterface = 1;
    private static final int[] b;
    private static boolean onExtraCallback = false;
    private static boolean onExtraCallbackWithResult = false;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char[] onWarmupCompleted;

    static {
        onExtraCallback();
        a = new int[]{0, 2, 4, 6, 8, 1, 3, 5, 7, 9};
        b = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000};
        int i = asInterface + 63;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[PHI: r1 r9
      0x002d: PHI (r1v9 int) = (r1v7 int), (r1v11 int) binds: [B:12:0x002b, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x002d: PHI (r9v9 long) = (r9v7 long), (r9v10 long) binds: [B:12:0x002b, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int checkSum(long j, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 1;
        onTransact = i4 % 128;
        int i5 = 0;
        boolean z = i4 % 2 != 0;
        while (i > 0) {
            int i6 = onTransact + 3;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                i2 = (int) (j / 10);
                j *= 10;
                if (z) {
                    i2 = a[i2];
                }
            } else {
                i2 = (int) (j % 10);
                j /= 10;
                if (z) {
                }
            }
            i5 += i2;
            z = !z;
            i--;
        }
        int i7 = i5 % 10;
        if (i7 > 0) {
            return 10 - i7;
        }
        int i8 = onTransact + 5;
        IAuthTabCallbackStub = i8 % 128;
        if (i8 % 2 == 0) {
            return i7;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String generateOTP(byte[] bArr, long j, int i, boolean z, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = z ? i + 1 : i;
        byte[] bArr2 = new byte[8];
        for (int i5 = 7; i5 >= 0; i5--) {
            bArr2[i5] = (byte) (255 & j);
            j >>= 8;
        }
        byte[] bArrHmacSHA1 = hmacSHA1(bArr, bArr2);
        byte b2 = bArrHmacSHA1[bArrHmacSHA1.length - 1];
        if (i2 >= 0) {
            int i6 = IAuthTabCallbackStub + 19;
            onTransact = i6 % 128;
            if (i6 % 2 != 0 ? i2 >= bArrHmacSHA1.length - 4 : i2 >= bArrHmacSHA1.length - 4) {
                i2 = b2 & 15;
            }
        }
        int iCheckSum = ((bArrHmacSHA1[i2 + 3] & 255) | ((((bArrHmacSHA1[i2] & Byte.MAX_VALUE) << 24) | ((bArrHmacSHA1[i2 + 1] & 255) << 16)) | ((bArrHmacSHA1[i2 + 2] & 255) << 8))) % b[i];
        if (z) {
            int i7 = IAuthTabCallbackStub + 41;
            onTransact = i7 % 128;
            long j2 = iCheckSum;
            iCheckSum = i7 % 2 == 0 ? checkSum(j2, i) % (iCheckSum >> 53) : checkSum(j2, i) + (iCheckSum * 10);
        }
        String string = Integer.toString(iCheckSum);
        while (string.length() < i4) {
            Object[] objArr = new Object[1];
            c(null, null, new byte[]{-127}, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
            string = ((String) objArr[0]).intern() + string;
        }
        return string;
    }

    public byte[] hmacSHA1(byte[] bArr, byte[] bArr2) {
        int i = 2 % 2;
        try {
            byte[] bArrDoMac = new INIMAC().doMac(bArr2, "HMACwithSHA1", bArr);
            int i2 = IAuthTabCallbackStub + 55;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 80 / 0;
            }
            return bArrDoMac;
        } catch (Exception unused) {
            return null;
        }
    }

    private static void c(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onWarmupCompleted;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                int i4 = $11 + 105;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 76, 20952 - View.MeasureSpec.makeMeasureSpec(0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    int i6 = $10 + 73;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 75, 16037 - ExpandableListView.getPackedPositionType(0L), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (onExtraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 63, AndroidCharacter.getMirror('0') + 12166, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onExtraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i8 = $11 + 11;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        int i10 = $10 + 111;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i12 = $11 + 25;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), 63 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    static void onExtraCallback() {
        onWarmupCompleted = new char[]{32403};
        onNavigationEvent = -1184334013;
        onExtraCallback = true;
        onExtraCallbackWithResult = true;
    }
}
