package o;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.core.content.ContextCompat;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$onExtraCallback;
import im.toss.devtool.action.quickaction.Hilt_QuickActionBottomSheetActivity$4;
import im.toss.security.impl.screenrecording.ScreenRecordingMonitorImpl$;
import java.util.Map;
import java.util.function.Consumer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.bindContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s8 implements s8ExternalSyntheticLambda3 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onExtraCallback;
    private static int[] onNavigationEvent;
    private final Context IAuthTabCallback;
    private long onExtraCallbackWithResult;
    private final Consumer<Integer> onWarmupCompleted;

    static {
        onWarmupCompleted();
        Companion = new onExtraCallbackWithResult(null);
        int i = asBinder + 73;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 28 / 0;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(s8 s8Var, Integer num) {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(s8Var, num);
        if (i3 != 0) {
            throw null;
        }
        int i4 = asInterface + 121;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public s8(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback = context;
        this.onWarmupCompleted = new ScreenRecordingMonitorImpl$.ExternalSyntheticLambda0(this);
    }

    private static final void onNavigationEvent(s8 s8Var, Integer num) {
        int i = 2 % 2;
        if (num == null || num.intValue() != 1) {
            s8Var.onExtraCallbackWithResult = SystemClock.elapsedRealtime();
            int i2 = asInterface + 19;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (SystemClock.elapsedRealtime() - s8Var.onExtraCallbackWithResult >= 2000) {
            int i3 = asInterface + 33;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(new int[]{192281996, 454520780, 1077352108, -1693661498, -1663440234, -1800739412, -1724554903, -1159126247, -320156281, -332482257, -1026162669, 1457714668, 769404236, 2077878979}, 26 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
            ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, ((String) objArr[0]).intern(), null, null, null, false, null, 62, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            int i5 = onExtraCallback + 27;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // o.s8ExternalSyntheticLambda3
    public void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        asInterface = i2 % 128;
        if (i2 % 2 != 0 ? Build.VERSION.SDK_INT < 35 : Build.VERSION.SDK_INT < 121) {
            int i3 = onExtraCallback + 55;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        try {
            Object systemService = ContextCompat.getSystemService(this.IAuthTabCallback, WindowManager.class);
            Intrinsics.checkNotNull(systemService);
            this.onWarmupCompleted.accept(Integer.valueOf(((WindowManager) systemService).addScreenRecordingCallback(this.IAuthTabCallback.getMainExecutor(), this.onWarmupCompleted)));
        } catch (Throwable th) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(new int[]{-523687666, 760625693, 1732792115, 726168693, -1605996587, -448021431, -58324040, 737785045, -1263458271, -1999486195, -1421802619, -2110227842}, 22 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new int[]{-948266800, 1879508775, -1984863209, -392248856, 307650479, -319137171, -508686661, -2080072312, 1255499656, -200061698, -2109407966, -1266933078, -2039917138, 1461810931, -1605996587, -448021431, 1194083150, 911005577, 753524400, -1340929990, 110909070, -944377922}, 44 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr2[0]).intern(), th, (Map) null, 8, (Object) null);
        }
    }

    static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onNavigationEvent;
        if (iArr3 != null) {
            int i3 = $11 + 119;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            for (int i4 = 0; i4 < length; i4++) {
                iArr2[i4] = Hilt_QuickActionBottomSheetActivity$4.h(iArr3[i4]);
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onNavigationEvent;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i5 = $10 + 7;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            for (int i7 = 0; i7 < length3; i7++) {
                int i8 = $10 + 53;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                iArr6[i7] = Hilt_QuickActionBottomSheetActivity$4.h(iArr5[i7]);
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i10 = $10 + 45;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            for (int i12 = 0; i12 < 16; i12++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                int iJ = bindContext.IAuthTabCallbackStubProxy.j(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iJ;
            }
            int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i13;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
            int i16 = $11 + 9;
            $10 = i16 % 128;
            int i17 = i16 % 2;
        }
        String str = new String(cArr2, 0, i);
        int i18 = $11 + 11;
        $10 = i18 % 128;
        if (i18 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        objArr[0] = str;
    }

    static void onWarmupCompleted() {
        onNavigationEvent = new int[]{994809506, 674683708, 1997660503, 1625558652, -900767457, 287819982, 713550132, -372911236, -2018427994, -1001712535, -1105375001, -518784597, 510764072, 907761752, -2078871437, 685618403, 704249183, -587471238};
    }
}
