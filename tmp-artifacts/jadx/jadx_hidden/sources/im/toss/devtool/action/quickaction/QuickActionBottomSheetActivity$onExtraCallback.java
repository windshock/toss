package im.toss.devtool.action.quickaction;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import im.toss.devtool.action.presentation.DevToolActionListViewModel;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$onExtraCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.bindContext;

/* loaded from: classes.dex */
final /* synthetic */ class QuickActionBottomSheetActivity$onExtraCallback extends FunctionReferenceImpl implements Function1<String, Unit> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] onExtraCallbackWithResult = {-1993187403, -1258073022, -1786754549, -310058418, 15790265, 877226953, 1772008763, -1038280212, 108305015, -243532436, 1973215116, -1485281548, -1558153884, 901110738, -1394639854, 1905791358, 744939607, 1348121404};
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    /* JADX WARN: Illegal instructions before constructor call */
    public QuickActionBottomSheetActivity$onExtraCallback(Object obj) {
        Object[] objArr = new Object[1];
        a(new int[]{1962293253, -80360053, 430932231, -1401998893, 313593686, 1847468509, -1960039301, 82997470}, TextUtils.lastIndexOf("", '0', 0) + 17, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new int[]{1962293253, -80360053, 430932231, -1401998893, 313593686, 1847468509, -1960039301, 82997470, 450652222, 1661041945, 774816952, -393666553, -240304666, 390227471, -1517621074, -1889831327, -1869645438, 755178771, 1678467710, -1020763238}, (ViewConfiguration.getPressedStateDuration() >> 16) + 37, objArr2);
        super(1, obj, DevToolActionListViewModel.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    public final void IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            ((DevToolActionListViewModel) ((CallableReference) this).receiver).IAuthTabCallback(str);
            int i3 = 20 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            ((DevToolActionListViewModel) ((CallableReference) this).receiver).IAuthTabCallback(str);
        }
        int i4 = onNavigationEvent + 121;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
    }

    public /* synthetic */ Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback((String) obj);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        int i5 = onWarmupCompleted + 3;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return unit;
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallbackWithResult;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr3[i3] = Hilt_QuickActionBottomSheetActivity$4.h(iArr2[i3]);
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallbackWithResult;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i4 = 0; i4 < length3; i4++) {
                iArr6[i4] = Hilt_QuickActionBottomSheetActivity$4.h(iArr5[i4]);
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
            for (int i5 = 0; i5 < 16; i5++) {
                int i6 = $11 + 15;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i5];
                int iJ = bindContext.IAuthTabCallbackStubProxy.j(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iJ;
            }
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i8;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i9 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i10 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
            int i11 = $10 + 37;
            $11 = i11 % 128;
            int i12 = i11 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
