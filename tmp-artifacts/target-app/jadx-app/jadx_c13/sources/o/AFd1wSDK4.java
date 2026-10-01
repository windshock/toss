package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.tosssecurities.network.domain.SecuritiesApiError;
import java.lang.reflect.Method;
import java.util.Map;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFd1wSDK4 {
    private static final byte[] $$a = {79, -25, -14, 102};
    private static final int $$b = 112;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 478308913;

    private static String $$c(short s, short s2, byte b) {
        int i = 105 - (b * 3);
        byte[] bArr = $$a;
        int i2 = s2 * 4;
        int i3 = (s * 3) + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i = i3 + (-i);
            i3++;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            if (i4 == i2) {
                return new String(bArr2, 0);
            }
            int i5 = i;
            int i6 = i3 + 1;
            i = i5 + (-bArr[i3]);
            i3 = i6;
        }
    }

    public static final Map<String, Object> onNavigationEvent(@Nullable Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            str.hashCode();
            throw null;
        }
        if (th == null) {
            return access8000.IAuthTabCallback();
        }
        Map mapOnExtraCallbackWithResult = access8200.onExtraCallbackWithResult();
        String message = th.getMessage();
        if (message == null) {
            Throwable cause = th.getCause();
            if (cause != null) {
                int i3 = onExtraCallback + 99;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                message = cause.getMessage();
            } else {
                int i5 = onExtraCallback + 115;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 3 / 2;
                }
                message = null;
            }
        }
        Object[] objArr = new Object[1];
        a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3, new char[]{'\n', 65532, 4, 65532, 65534, 65528, '\n'}, true, Color.rgb(0, 0, 0) + 16777345, objArr);
        mapOnExtraCallbackWithResult.put(((String) objArr[0]).intern(), message);
        mapOnExtraCallbackWithResult.put("error_name", mapOnExtraCallbackWithResult.getClass().getName());
        mapOnExtraCallbackWithResult.put("stackTrace", RawQueries.onNavigationEvent(th, 0, 0, 3, (Object) null));
        if (th instanceof SecuritiesApiError) {
            int i7 = IAuthTabCallback + 103;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            SecuritiesApiError securitiesApiError = (SecuritiesApiError) th;
            SecuritiesApiError.Data dataIAuthTabCallback = securitiesApiError.IAuthTabCallback();
            String strAsInterface = dataIAuthTabCallback != null ? dataIAuthTabCallback.asInterface() : null;
            Object[] objArr2 = new Object[1];
            a(5 - View.MeasureSpec.getSize(0), 1 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0), new char[]{7, 65528, 65535, 7, 65532}, true, 132 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0), objArr2);
            mapOnExtraCallbackWithResult.put(((String) objArr2[0]).intern(), strAsInterface);
            SecuritiesApiError.Data dataIAuthTabCallback2 = securitiesApiError.IAuthTabCallback();
            mapOnExtraCallbackWithResult.put("bodyMessage", dataIAuthTabCallback2 != null ? dataIAuthTabCallback2.onWarmupCompleted() : null);
            SecuritiesApiError.Data dataIAuthTabCallback3 = securitiesApiError.IAuthTabCallback();
            mapOnExtraCallbackWithResult.put("requestUrl", dataIAuthTabCallback3 != null ? dataIAuthTabCallback3.onExtraCallback() : null);
            int i9 = onExtraCallback + 95;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
        }
        return access8200.asBinder(mapOnExtraCallbackWithResult);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (ViewConfiguration.getPressedStateDuration() >> 16) + 23, 10278 - Color.argb(0, 0, 0, 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 12843), 54 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0), Gravity.getAbsoluteGravity(0, 0) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i7 = $11 + 71;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i9 = $10 + 115;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 12843), Color.blue(0) + 55, Drawable.resolveOpacity(0, 0) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i11 = $10 + Imgproc.COLOR_YUV2RGBA_YVYU;
        $11 = i11 % 128;
        int i12 = i11 % 2;
        objArr[0] = str;
    }
}
