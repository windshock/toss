package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.faceauth.impl.test.FaceAuthTestActivity;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesFaceAuthImplKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int[] onNavigationEvent = null;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Class $r8$lambda$w7Yk6srHP0Qak3NFOcfp5W9Wib0() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = onExtraCallback + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$0;
        }
        throw null;
    }

    static {
        onWarmupCompleted();
        int i = IAuthTabCallback + 63;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeaturesFaceAuthImplKspDeepLinkRegistry() throws Throwable {
        Object[] objArr = new Object[1];
        a(new int[]{1496979253, -1105774688, 1706966447, 2092056357, 487311696, -719403849, 1050408902, 1698907357, 842880874, -1870707241, -1224358246, -1484933992, 1805117910, 1501787919, -1648007720, -1906233709, -446142960, -374601622, -1592021781, 105825112}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 40, objArr);
        super(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesFaceAuthImplKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 99;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$w7Yk6srHP0Qak3NFOcfp5W9Wib0 = FeaturesFaceAuthImplKspDeepLinkRegistry.$r8$lambda$w7Yk6srHP0Qak3NFOcfp5W9Wib0();
                int i4 = onWarmupCompleted + 27;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 59 / 0;
                }
                return cls$r8$lambda$w7Yk6srHP0Qak3NFOcfp5W9Wib0;
            }
        }, CollectionsKt.listOf(TargetRegion.KR)))));
    }

    private static final Class _init_$lambda$0() {
        Class<FaceAuthTestActivity> cls;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 21;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            cls = FaceAuthTestActivity.class;
            int i4 = 24 / 0;
        } else {
            cls = FaceAuthTestActivity.class;
        }
        int i5 = i2 + 21;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return cls;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onNavigationEvent;
        long j = 0;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $10 + 51;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), (-16777144) - Color.rgb(0, 0, 0), 8849 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i3++;
                    j = 0;
                    i5 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onNavigationEvent;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                try {
                    Object[] objArr3 = new Object[1];
                    objArr3[i6] = Integer.valueOf(iArr5[i8]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 72 - Color.argb(i6, i6, i6, i6), 8848 - TextUtils.getCapsMode("", i6, i6), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i8++;
                    i6 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i9 = $11 + 13;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            iArr5 = iArr6;
            i2 = 0;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i11 = $11 + 87;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            for (int i13 = 0; i13 < 16; i13++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - ExpandableListView.getPackedPositionGroup(0L)), TextUtils.indexOf("", "", 0) + 39, (KeyEvent.getMaxKeyCode() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4032 - Process.getGidForName("")), TextUtils.indexOf("", "", 0) + 78, Color.blue(0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr2, 0, i);
        int i17 = $10 + 69;
        $11 = i17 % 128;
        if (i17 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static void onWarmupCompleted() {
        onNavigationEvent = new int[]{1064717098, -1685493903, -1576009885, -1314601315, -369753455, -1003994204, -599066177, 1288306788, 2124655028, 2112563274, -1281499457, -1997860986, 1498616777, 166447031, 1991670127, -601286265, 802531129, 1456427806};
    }
}
