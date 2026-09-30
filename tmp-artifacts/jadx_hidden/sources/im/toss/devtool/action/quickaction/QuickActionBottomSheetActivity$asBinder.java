package im.toss.devtool.action.quickaction;

import android.os.Process;
import android.view.View;
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
final /* synthetic */ class QuickActionBottomSheetActivity$asBinder extends FunctionReferenceImpl implements Function1<String, Unit> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int[] onNavigationEvent = {-666644823, 2115694556, 1516120436, 582555668, 10896032, -1474846279, 1890013895, -706946936, -1874772120, 855963946, 18285215, 1179240036, 1488438714, -1715664379, -1467628348, -2082671939, -1584247513, 481509983};
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Illegal instructions before constructor call */
    public QuickActionBottomSheetActivity$asBinder(Object obj) {
        Object[] objArr = new Object[1];
        a(new int[]{649012514, 188519958, 1942102554, -1770514669}, 6 - View.MeasureSpec.getSize(0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new int[]{649012514, 188519958, 1067229230, -1924429792, -1625820023, 43710715, 1032999217, 1956439125, -1445366461, 1389269536, -1777546240, 1301104801, 1787381065, 847273100}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 26, objArr2);
        super(1, obj, DevToolActionListViewModel.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    public /* synthetic */ Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult((String) obj);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            ((DevToolActionListViewModel) ((CallableReference) this).receiver).onNavigationEvent(str);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            ((DevToolActionListViewModel) ((CallableReference) this).receiver).onNavigationEvent(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onNavigationEvent;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                int i4 = $11 + 87;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                iArr3[i3] = Hilt_QuickActionBottomSheetActivity$4.h(iArr2[i3]);
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onNavigationEvent;
        if (iArr5 != null) {
            int i6 = $11 + 35;
            $10 = i6 % 128;
            int i7 = i6 % 2;
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
            int i9 = $11 + 57;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            for (int i11 = 0; i11 < 16; i11++) {
                int i12 = $11 + 121;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i11];
                int iJ = bindContext.IAuthTabCallbackStubProxy.j(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iJ;
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
            DevToolActionListViewModel$onExtraCallback.f(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
