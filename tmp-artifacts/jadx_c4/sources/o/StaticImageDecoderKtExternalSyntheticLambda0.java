package o;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import javax.crypto.spec.IvParameterSpec;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.setProgressColor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class StaticImageDecoderKtExternalSyntheticLambda0 implements getMax {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] onExtraCallback = {1254382212, -2140420664, 1329528344, -1401515367, -220092628, -1610803656, 726231979, 1123866156, -1211203486, 1761897871, -355287072, -1547618111, -1283218001, -22730305, 1961810997, 1673991788, -242371996, -1433090943};
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final ConstraintsSizeResolverExternalSyntheticLambda0 onExtraCallbackWithResult;

    @Inject
    public StaticImageDecoderKtExternalSyntheticLambda0(@NotNull ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(constraintsSizeResolverExternalSyntheticLambda0, "");
        this.onExtraCallbackWithResult = constraintsSizeResolverExternalSyntheticLambda0;
    }

    @Override // o.getMax
    public String onNavigationEvent(@NotNull String str, @NotNull String str2) {
        String strOnExtraCallback;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            try {
                strOnExtraCallback = setup.onExtraCallback(setProgressColor.onNavigationEvent.onExtraCallbackWithResult(setProgressColor.Companion, this.onExtraCallbackWithResult.IAuthTabCallbackDefault(), (IvParameterSpec) null, 2, (Object) null), str, 0);
            } catch (BaseRoundCornerProgressBarSavedState e) {
                Object[] objArr = new Object[1];
                a(new int[]{2118733438, 48850855}, View.MeasureSpec.getSize(0) + 3, objArr);
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("tossValueCipher::encode", "key:" + str2, e, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str2)));
                strOnExtraCallback = "";
            }
        }
        return strOnExtraCallback;
    }

    @Override // o.getMax
    public String IAuthTabCallback(@NotNull String str, @NotNull String str2) {
        String strOnWarmupCompleted;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            try {
                strOnWarmupCompleted = setup.onWarmupCompleted(setProgressColor.onNavigationEvent.onWarmupCompleted(setProgressColor.Companion, this.onExtraCallbackWithResult.IAuthTabCallbackDefault(), null, 2, null), str, 0);
            } catch (onProgressChanged e) {
                Object[] objArr = new Object[1];
                a(new int[]{2118733438, 48850855}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3, objArr);
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("tossValueCipher::decode", "key:" + str2, e, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str2), getWrite.IAuthTabCallback("encrypted", str)}));
                strOnWarmupCompleted = "";
            }
        }
        return strOnWarmupCompleted;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 53;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return "tossValueCipher";
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallback;
        int i3 = -1469660336;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 99;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 72 - Color.red(0), 8848 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i4] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i4++;
                    i3 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallback;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = $10 + 33;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            for (int i9 = 0; i9 < length3; i9++) {
                int i10 = $10 + 13;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                Object[] objArr3 = {Integer.valueOf(iArr5[i9])};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), 72 - (ViewConfiguration.getTouchSlop() >> 8), 8848 - (ViewConfiguration.getScrollBarSize() >> 8), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
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
            int i12 = $11 + 75;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 0;
            while (i14 < 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 22252), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 39, 10301 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i14++;
                int i15 = $11 + 77;
                $10 = i15 % 128;
                int i16 = i15 % 2;
            }
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 4033), Color.argb(0, 0, 0, 0) + 78, 7398 - View.resolveSize(0, 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
