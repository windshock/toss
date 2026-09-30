package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hExternalSyntheticLambda6 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int[] onWarmupCompleted = {882532050, -1299882437, 521807539, -530463250, -552875370, 993526080, -1593791676, 2066391466, 436930680, -857072985, 1638351073, -694720659, -1090473638, 553603340, -833851031, 98750099, -1838970091, -140544474};

    public static final /* synthetic */ PublicKey onExtraCallbackWithResult(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        PublicKey publicKeyOnNavigationEvent = onNavigationEvent(str);
        int i4 = IAuthTabCallback + 61;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return publicKeyOnNavigationEvent;
    }

    private static final PublicKey onNavigationEvent(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TTBaseLandingPageActivity tTBaseLandingPageActivityOnExtraCallback = TTBaseLandingPageActivity.Companion.onExtraCallback(str);
        byte[] bArrAccess000 = tTBaseLandingPageActivityOnExtraCallback != null ? tTBaseLandingPageActivityOnExtraCallback.access000() : null;
        Object[] objArr = new Object[1];
        a(new int[]{1043078633, 17795062}, Color.blue(0) + 3, objArr);
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(((String) objArr[0]).intern()).generatePublic(new X509EncodedKeySpec(bArrAccess000));
        Intrinsics.checkNotNullExpressionValue(publicKeyGeneratePublic, "");
        int i4 = IAuthTabCallback + 75;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return publicKeyGeneratePublic;
        }
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onWarmupCompleted;
        long j = -1;
        int i3 = -1469660336;
        int i4 = 0;
        if (iArr2 != null) {
            int i5 = $11 + 29;
            int i6 = i5 % 128;
            $10 = i6;
            int i7 = i5 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = i6 + 23;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i10])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 72 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (SystemClock.currentThreadTimeMillis() > j ? 1 : (SystemClock.currentThreadTimeMillis() == j ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i10] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i10++;
                    j = -1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i11 = $10 + 5;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 3 % 2;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onWarmupCompleted;
        int i13 = 3;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i14 = 0;
            while (i14 < length3) {
                int i15 = $11 + i13;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                Object[] objArr3 = new Object[1];
                objArr3[i4] = Integer.valueOf(iArr5[i14]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 71 - TextUtils.lastIndexOf("", '0', i4, i4), ImageFormat.getBitsPerPixel(i4) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i14] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i14++;
                i13 = 3;
                i3 = -1469660336;
                i4 = 0;
            }
            iArr5 = iArr6;
        }
        int i17 = i4;
        System.arraycopy(iArr5, i17, iArr4, i17, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i17;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i18 = $10 + 75;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i20 = 0;
            for (int i21 = 16; i20 < i21; i21 = 16) {
                int i22 = $10 + 83;
                $11 = i22 % 128;
                if (i22 % 2 == 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i20];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 22252), (-16777177) - Color.rgb(0, 0, 0), Process.getGidForName("") + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i20 += 28;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i20];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 22252), (ViewConfiguration.getScrollBarSize() >> 8) + 39, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i20++;
                }
            }
            int i23 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i23;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i24 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i25 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4034 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 78 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 7397, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
