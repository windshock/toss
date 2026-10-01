package com.bytedance.sdk.component.adexpress.dynamic.lud;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx {
    private static final byte[] $$a = {4, 8, -22, -73};
    private static final int $$b = 51;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int IAuthTabCallback = 1;
    private static long onNavigationEvent = 7798559133331975163L;
    private static int onExtraCallbackWithResult = -1776194565;
    private static char onWarmupCompleted = 62573;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, short s) {
        int i2;
        int i3 = b2 * 2;
        byte[] bArr = $$a;
        int i4 = 110 - s;
        int i5 = (b * 3) + 4;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            i2 = 0;
            int i9 = i7 + 1;
            i4 = i5 + (-i8);
            i5 = i9;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i2++;
            i8 = bArr[i5];
            int i10 = i4;
            i7 = i5;
            i5 = i10;
            int i92 = i7 + 1;
            i4 = i5 + (-i8);
            i5 = i92;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    public static String ycx(String str) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 103;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            a((char) (64015 / (ViewConfiguration.getMaximumDrawingCacheSize() * 45)), View.resolveSize(1, 1), new char[]{14088, 9185, 21888, 63026, 45780, 44524, 30963, 47025, 57998, 49763, 50213, 11407, 58438, 4877, 38684, 11228, 34204, 7992, 28689, 31394, 27809, 13778, 27704, 63263, 25371, 49206, 5034, 16257, 12913, 17801, 14362, 10800, 2981, 49548, 56120, 46908, 48221, 58349, 21265, 41549, 38392, 60785, 20791, 59766, 29366, 38238, 53575, 36581, 46967, 41138, 42392, 20872, 53977, 23257, 43829, 47369, 56373, 27987, 30879, 25200, 14872, 64740, 61060, 16579, 18752, 29318, 39105, 44229, 39433, 39122}, new char[]{0, 0, 0, 0}, new char[]{19659, 11036, 4059, 9210}, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 64015), View.resolveSize(0, 0), new char[]{14088, 9185, 21888, 63026, 45780, 44524, 30963, 47025, 57998, 49763, 50213, 11407, 58438, 4877, 38684, 11228, 34204, 7992, 28689, 31394, 27809, 13778, 27704, 63263, 25371, 49206, 5034, 16257, 12913, 17801, 14362, 10800, 2981, 49548, 56120, 46908, 48221, 58349, 21265, 41549, 38392, 60785, 20791, 59766, 29366, 38238, 53575, 36581, 46967, 41138, 42392, 20872, 53977, 23257, 43829, 47369, 56373, 27987, 30879, 25200, 14872, 64740, 61060, 16579, 18752, 29318, 39105, 44229, 39433, 39122}, new char[]{0, 0, 0, 0}, new char[]{19659, 11036, 4059, 9210}, objArr2);
            obj = objArr2[0];
        }
        String strConcat = ((String) obj).intern().concat(String.valueOf(str));
        int i4 = IAuthTabCallback + 57;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return strConcat;
    }

    private static void a(char c, int i2, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $11 + 29;
            $10 = i5 % 128;
            int i6 = i5 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43, ((Process.getThreadPriority(0) + 20) >> 6) + 1451, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.MeasureSpec.makeMeasureSpec(0, 0)), 44 - (ViewConfiguration.getWindowTouchSlop() >> 8), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1494, 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23973), 50 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 22940, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 45848), TextUtils.lastIndexOf("", '0') + 30, 12577 - KeyEvent.normalizeMetaState(0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i7 = $10 + 101;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }
}
