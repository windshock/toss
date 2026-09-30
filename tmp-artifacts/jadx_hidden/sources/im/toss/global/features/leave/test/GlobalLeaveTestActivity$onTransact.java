package im.toss.global.features.leave.test;

import android.text.TextUtils;
import android.util.TypedValue;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$onExtraCallback;
import im.toss.devtool.action.quickaction.Hilt_QuickActionBottomSheetActivity$4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.bindContext;

/* loaded from: classes.dex */
final /* synthetic */ class GlobalLeaveTestActivity$onTransact extends FunctionReferenceImpl implements Function0<Unit> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int[] onExtraCallbackWithResult = {972870743, -22955664, -2107649531, 1430510084, 365850952, 1300346413, -172739637, -222743980, 122713498, -1516730953, -295173162, -848181284, 259020367, -1401895970, -1802936826, -2038454436, -1107566992, 1765941971};

    /* JADX WARN: Illegal instructions before constructor call */
    public GlobalLeaveTestActivity$onTransact(Object obj) {
        Object[] objArr = new Object[1];
        a(new int[]{-1498212168, 2082515853, -1126175117, -883893146, -923598361, -1682431930, -1452152177, -358389429, 1996247980, -550149105, -912444060, -34775977, -1483217930, -1695586515}, 24 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new int[]{-1498212168, 2082515853, -1126175117, -883893146, -923598361, -1682431930, -1452152177, -358389429, 1996247980, -550149105, -912444060, -34775977, 194043342, -1056840065}, 28 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
        super(0, obj, GlobalLeaveTestActivity.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    public /* synthetic */ Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback();
        if (i3 != 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 105;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit2;
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        GlobalLeaveTestActivity.onTransact((GlobalLeaveTestActivity) ((CallableReference) this).receiver);
        int i4 = onExtraCallback + 101;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallbackWithResult;
        if (iArr2 != null) {
            int i3 = $10 + 81;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i5 = 0; i5 < length; i5++) {
                int i6 = $10 + 95;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                iArr3[i5] = Hilt_QuickActionBottomSheetActivity$4.h(iArr2[i5]);
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallbackWithResult;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i8 = 0; i8 < length3; i8++) {
                int i9 = $11 + 17;
                $10 = i9 % 128;
                int i10 = i9 % 2;
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
            int i11 = 0;
            while (i11 < 16) {
                int i12 = $11 + 97;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i11];
                int iJ = bindContext.IAuthTabCallbackStubProxy.j(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iJ;
                i11++;
                int i14 = $11 + 121;
                $10 = i14 % 128;
                int i15 = i14 % 2;
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
}
