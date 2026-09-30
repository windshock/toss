package o;

import android.view.View;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$onExtraCallback;
import im.toss.devtool.action.quickaction.Hilt_QuickActionBottomSheetActivity$4;
import im.toss.devtool.sharedpref.presentation.SharedPrefStoreViewModel;
import o.bindContext;

/* loaded from: classes.dex */
public final class showBottomAuthTips {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] IAuthTabCallback = null;
    static SharedPrefStoreViewModel keepFieldType = null;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static String onWarmupCompleted;

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new int[]{-1809265204, -1832559506, -1659704199, -1287913720, -1156443893, -541634930, 142230383, 1577435944, 401002867, 1527199074, -5437177, 224429038, 1911400992, 1332651369, 876058342, 933954948, 1753135090, -949935654, -2031548117, -1038493120, -1205667654, -694671971, -963247752, 905233187, -387493835, -916761418, -1464737291, -1009502898, -1094000655, -406148318, 1047922385, 1225014060}, View.getDefaultSize(0, 0) + 64, objArr);
        onWarmupCompleted = ((String) objArr[0]).intern();
        int i = onExtraCallbackWithResult + 21;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallback;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i3 = 0;
            while (i3 < length) {
                int i4 = $10 + 101;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                iArr3[i3] = Hilt_QuickActionBottomSheetActivity$4.h(iArr2[i3]);
                i3++;
                int i6 = $11 + 89;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallback;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i8 = 0; i8 < length3; i8++) {
                iArr6[i8] = Hilt_QuickActionBottomSheetActivity$4.h(iArr5[i8]);
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            for (int i9 = 0; i9 < 16; i9++) {
                int i10 = $11 + 61;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i9];
                int iJ = bindContext.IAuthTabCallbackStubProxy.j(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iJ;
            }
            int i12 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i12;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            DevToolActionListViewModel$onExtraCallback.f(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = new int[]{2042699213, 1666835127, -1359279109, 573340521, -736712031, 1736187980, 974963331, 1179245062, -767933407, -916969246, -1319004936, -2115657317, 18785005, -943521876, -184500938, -1018503801, -853907058, 756712922};
    }
}
