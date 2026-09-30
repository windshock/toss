package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaCZNtgwoBwteGhg33zHpfNgJw0GI {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int[] onNavigationEvent = {-896394860, 420290354, -1898074488, 1046068966, 20241109, -1899349479, 102444341, -1356456331, 1296088866, 1985739820, -1890487041, -1937359689, -52123767, 625845289, 1383980326, 485036610, 1981787152, -814885371};
    private static int onWarmupCompleted = 1;

    public static final String IAuthTabCallback(@Nullable String str) throws Throwable {
        Object obj;
        String lowerCase;
        String host;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str != null && !StringsKt.isBlank(str) && (!StringsKt.contains$default(str, '\\', false, 2, (Object) null))) {
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl(Uri.parse(str));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (!(!Result.onExtraCallback(obj))) {
                int i3 = onWarmupCompleted + 95;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                obj = null;
            }
            Uri uri = (Uri) obj;
            if (uri == null) {
                return null;
            }
            String scheme = uri.getScheme();
            if (scheme != null) {
                lowerCase = scheme.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            } else {
                lowerCase = null;
            }
            if (!Intrinsics.areEqual(lowerCase, "https")) {
                return null;
            }
            if (uri.getUserInfo() != null) {
                int i5 = onExtraCallback + 23;
                int i6 = i5 % 128;
                onWarmupCompleted = i6;
                if (i5 % 2 == 0) {
                    int i7 = 29 / 0;
                }
                int i8 = i6 + 101;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                return null;
            }
            String encodedAuthority = uri.getEncodedAuthority();
            if ((encodedAuthority == null || !StringsKt.contains$default(encodedAuthority, '%', false, 2, (Object) null)) && (host = uri.getHost()) != null) {
                int i10 = onWarmupCompleted + 65;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                String lowerCase2 = host.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                if (lowerCase2 != null) {
                    if (Intrinsics.areEqual(lowerCase2, "toss.im")) {
                        return str;
                    }
                    Object[] objArr = new Object[1];
                    a(new int[]{-2000771548, -236334673, -504259325, -344016197}, ImageFormat.getBitsPerPixel(0) + 9, objArr);
                    if (StringsKt.endsWith$default(lowerCase2, ((String) objArr[0]).intern(), false, 2, (Object) null)) {
                        return str;
                    }
                    return null;
                }
            }
        }
        return null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onNavigationEvent;
        int i5 = -1469660336;
        int i6 = 16;
        int i7 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 43;
                $11 = i9 % 128;
                if (i9 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 72 - (ViewConfiguration.getTapTimeout() >> 16), (-16768368) - Color.rgb(0, 0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i3 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr2[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 71, 8848 - (ViewConfiguration.getKeyRepeatTimeout() >> i6), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i8++;
                        i3 = 2;
                        i6 = 16;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onNavigationEvent;
        if (iArr5 != null) {
            int i10 = $11;
            int i11 = i10 + 51;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = i10 + 91;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 0;
            while (i15 < length3) {
                Object[] objArr4 = new Object[1];
                objArr4[i7] = Integer.valueOf(iArr5[i15]);
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), TextUtils.lastIndexOf("", '0', i7, i7) + 73, KeyEvent.getDeadChar(i7, i7) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i15] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                i15++;
                int i16 = $10 + 93;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                i5 = -1469660336;
                i7 = 0;
            }
            i2 = i7;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i18 = $11 + 119;
            $10 = i18 % 128;
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
                int i22 = $10 + 123;
                $11 = i22 % 128;
                int i23 = i22 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i20];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - MotionEvent.axisFromString("")), View.resolveSizeAndState(0, 0, 0) + 39, View.combineMeasuredStates(0, 0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i20++;
            }
            int i24 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i24;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i25 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i26 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 4033), (ViewConfiguration.getPressedStateDuration() >> 16) + 78, (-16769818) - Color.rgb(0, 0, 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
