package org.bouncycastle.crypto.params;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.math.BigInteger;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class RSABlindingParameters implements CipherParameters {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int[] onWarmupCompleted = {-14997038, -1269272028, 412983423, 77743341, -217826180, 879461807, -1783096968, -1927691757, -1524294093, -792625627, 1666127530, 1315833223, -239350664, -1211577326, 6162385, 2015342335, -1853959216, -576974262};
    private BigInteger blindingFactor;
    private RSAKeyParameters publicKey;

    public RSABlindingParameters(RSAKeyParameters rSAKeyParameters, BigInteger bigInteger) throws Throwable {
        if (rSAKeyParameters instanceof RSAPrivateCrtKeyParameters) {
            Object[] objArr = new Object[1];
            a(new int[]{1939889344, -1310736641, 676526075, -502414905, 1746542551, -316188757, 346577337, -1442907190, 1836379816, 2037166022, -821586096, 1596365892, -2115311465, -1519662907, -2109199481, -1052060010, -974025673, 1321533490, 1917700216, -719309550, -316591867, -815830673}, 41 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
            throw new IllegalArgumentException(((String) objArr[0]).intern());
        }
        this.publicKey = rSAKeyParameters;
        this.blindingFactor = bigInteger;
        int i = onExtraCallbackWithResult + 109;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public BigInteger getBlindingFactor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        BigInteger bigInteger = this.blindingFactor;
        int i5 = i3 + 59;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return bigInteger;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RSAKeyParameters getPublicKey() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 31;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RSAKeyParameters rSAKeyParameters = this.publicKey;
        int i4 = i2 + 71;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return rSAKeyParameters;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onWarmupCompleted;
        int i5 = -1469660336;
        int i6 = 16;
        int i7 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = $11 + 45;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < length) {
                int i11 = $11 + 53;
                $10 = i11 % 128;
                if (i11 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i10])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> i6), 72 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), Color.alpha(0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i10] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i10 >>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i10])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 72, KeyEvent.getDeadChar(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i10] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i10++;
                }
                i3 = 2;
                i6 = 16;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onWarmupCompleted;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                int i13 = $11 + 89;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    Object[] objArr4 = new Object[1];
                    objArr4[i7] = Integer.valueOf(iArr5[i12]);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (TypedValue.complexToFloat(i7) > 0.0f ? 1 : (TypedValue.complexToFloat(i7) == 0.0f ? 0 : -1)) + 72, TextUtils.getOffsetBefore(BuildConfig.FLAVOR, i7) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i12 <<= 1;
                } else {
                    Object[] objArr5 = {Integer.valueOf(iArr5[i12])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (ViewConfiguration.getPressedStateDuration() >> 16) + 72, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    i12++;
                }
                i5 = -1469660336;
                i7 = 0;
            }
            int i14 = $11 + 113;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            iArr5 = iArr6;
            i2 = 0;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i16];
                try {
                    Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22251), (ViewConfiguration.getPressedStateDuration() >> 16) + 39, (Process.myTid() >> 22) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i16++;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (Process.myTid() >> 22)), 77 - ExpandableListView.getPackedPositionChild(0L), Color.argb(0, 0, 0, 0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
            int i21 = $11 + 35;
            $10 = i21 % 128;
            int i22 = i21 % 2;
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
