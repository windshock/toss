package com.tnkfactory.ad.rwd;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tnkfactory.ad.rwd.Resources;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.TimelineExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class q implements Resources.FormatCurrency {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {4, -66, -36, 8, -4, -26, 7, 14, -8, 5, -8, -48, 41, -5, 0, -7, -10, 12, -18, -4, -11, 49, -4, -15, -23, 10, -2, -34, 27, 8, -3, -13, -4, -1, 5};
    private static final int $$b = 126;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static char[] onExtraCallback = {32431, 32440, 32430, 32425, 32412, 32436, 32428, 32437, 32429, 32426, 32414, 32447, 32446, 32438, 32633, 32433, 32444, 32445, 32619, 32413, 32434, 32400, 32427, 32435, 32615, 32432, 32419, 32394};
    private static int onNavigationEvent = -1184333991;
    private static boolean IAuthTabCallback = true;
    private static boolean onWarmupCompleted = true;
    private static long onExtraCallbackWithResult = 221426273051903972L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i2, short s, short s2, Object[] objArr) {
        int i3;
        int i4 = (s2 * 16) + 4;
        int i5 = 111 - (s * 38);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[17 - i2];
        int i6 = 16 - i2;
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i5 = i5 + i7 + 3;
            i4++;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            i8 = i3 + 1;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i4];
            i5 = i5 + i7 + 3;
            i4++;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r10 < 100000000) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        return new java.text.DecimalFormat("#.#").format((r10 / 1.0E8d) - 0.05d) + "億";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (r10 < 1000000) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        return new java.text.DecimalFormat("#").format((r10 / 10000.0d) - 0.5d) + "万";
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r10 < 10000) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
    
        return new java.text.DecimalFormat("#.#").format((r10 / 10000.0d) - 0.05d) + "万";
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
    
        return java.lang.String.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        r10 = java.lang.String.valueOf(r10);
        r11 = com.tnkfactory.ad.rwd.q.IAuthTabCallbackDefault + 119;
        com.tnkfactory.ad.rwd.q.asInterface = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        if ((r11 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
    
        r11 = 12 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (com.tnkfactory.ad.TnkStyle.enableCurrencyFormat != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (com.tnkfactory.ad.TnkStyle.enableCurrencyFormat != false) goto L9;
     */
    @Override // com.tnkfactory.ad.rwd.Resources.FormatCurrency
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String formatCurrency(long j) {
        int i2 = 2 % 2;
        int i3 = asInterface + 23;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 90 / 0;
        }
    }

    private static void c(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i4 = $10 + 105;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i6 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 84, MotionEvent.axisFromString("") + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (Process.myPid() >> 22)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 19, TextUtils.indexOf("", "", 0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i7 = $11 + 117;
                $10 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    private static void b(char[] cArr, int[] iArr, byte[] bArr, int i2, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i3;
        int length;
        char[] cArr3;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr4 = onExtraCallback;
        if (cArr4 != null) {
            int i5 = $11 + 119;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr4.length;
                cArr3 = new char[length];
            } else {
                length = cArr4.length;
                cArr3 = new char[length];
            }
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 78 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 75, 16037 - View.resolveSizeAndState(0, 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (onWarmupCompleted) {
            int i7 = $11 + 5;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                i3 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                i3 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
            }
            char[] cArr5 = new char[i3];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $11 + 109;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] * i2] / iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.indexOf("", "", 0) + 63, (ViewConfiguration.getFadingEdgeLength() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i2] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 63 - (ViewConfiguration.getJumpTapTimeout() >> 16), 12214 - TextUtils.indexOf("", ""), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i9 = $11 + 95;
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        }
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (Process.myPid() >> 22) + 63, View.resolveSize(0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    public static void onExtraCallback(long j, long j2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 21;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        long j3 = j ^ (j2 << 32);
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2073082972);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 24 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 22415 - KeyEvent.normalizeMetaState(0), 1255162572, false, "Companion", (Class[]) null);
        }
        ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(35210743);
            if (objOnExtraCallback2 == null) {
                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 25;
                int i5 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22414;
                byte b = $$a[14];
                byte b2 = b;
                Object[] objArr = new Object[1];
                a(b, b2, b2, objArr);
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cResolveSizeAndState, iIndexOf, i5, 861518695, false, (String) objArr[0], new Class[0]);
            }
            if (((Boolean) ((Method) objOnExtraCallback2).invoke(null, null)).booleanValue()) {
                int i6 = IAuthTabCallbackDefault + 97;
                int i7 = i6 % 128;
                asInterface = i7;
                int i8 = i6 % 2;
                int i9 = i7 + 111;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Constructor declaredConstructor = StringBuilder.class.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    Object[] objArr2 = new Object[1];
                    b(null, null, new byte[]{-113, -103, -113, -118, -104, -105, -106, -107, -121, -116, -111, -108, -113, -109, -110, -111, -119, -115, -111, -119, -111, -110, -113, -119, -126, -111, -127, -112, -119, -113, -114, -115, -126, -116, -120, -120, -126, -117, -127, -118, -119, -126, -120, -121, -122, -123, -124, -125, -126, -127}, 127 - View.MeasureSpec.getSize(0), objArr2);
                    Object[] objArr3 = {(String) objArr2[0]};
                    Object[] objArr4 = new Object[1];
                    c(new char[]{23402, 30599, 32760, 23307, 1432, 35615, 34392, 62277, 43172, 34667}, (-1) - TextUtils.indexOf((CharSequence) "", '0'), objArr4);
                    Method method = StringBuilder.class.getMethod((String) objArr4[0], String.class);
                    method.setAccessible(true);
                    method.invoke(objNewInstance, objArr3);
                    Object[] objArr5 = {Long.valueOf(j3)};
                    Object[] objArr6 = new Object[1];
                    c(new char[]{23402, 30599, 32760, 23307, 1432, 35615, 34392, 62277, 43172, 34667}, (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), objArr6);
                    Method method2 = StringBuilder.class.getMethod((String) objArr6[0], Long.TYPE);
                    method2.setAccessible(true);
                    method2.invoke(objNewInstance, objArr5);
                    Object[] objArr7 = new Object[1];
                    c(new char[]{58626, 49963, 2037, 58724, 21322, 16295, 65110, 42413, 5830, 13254, 60135, 47463, 549}, ViewConfiguration.getDoubleTapTimeout() >> 16, objArr7);
                    String strIntern = ((String) objArr7[0]).intern();
                    Object[] objArr8 = new Object[1];
                    c(new char[]{40082, 3271, 24271, 40166, 47057, 61504, 42828, 16669, 28480, 64550, 46033, 24046}, ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr8);
                    Method method3 = StringBuilder.class.getMethod((String) objArr8[0], null);
                    method3.setAccessible(true);
                    Object[] objArr9 = {strIntern, method3.invoke(objNewInstance, null)};
                    Object[] objArr10 = new Object[1];
                    b(null, null, new byte[]{-102}, 127 - (Process.myPid() >> 22), objArr10);
                    Method method4 = Log.class.getMethod((String) objArr10[0], String.class, String.class);
                    method4.setAccessible(true);
                    int i11 = IAuthTabCallbackDefault + 81;
                    asInterface = i11 % 128;
                    int i12 = i11 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            Object obj = ConvertFloatArrayToByteArray.class.getField("onExtraCallbackWithResult").get(null);
            Object[] objArr11 = new Object[1];
            b(null, null, new byte[]{-118, -104, -105, -106, -107, -121, -116, -111, -110}, 127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr11);
            String str = (String) objArr11[0];
            Object[] objArr12 = {Long.valueOf(j3)};
            Object[] objArr13 = new Object[1];
            b(null, null, new byte[]{-104, -100, -111, -121, -120, -126, -101}, 127 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr13);
            Method method5 = Long.class.getMethod((String) objArr13[0], Long.TYPE);
            method5.setAccessible(true);
            Object[] objArr14 = {str, method5.invoke(null, objArr12)};
            Method method6 = getWrite.class.getMethod("IAuthTabCallback", Object.class, Object.class);
            method6.setAccessible(true);
            Object[] objArr15 = {method6.invoke(null, objArr14)};
            Method method7 = access8100.class.getMethod("onNavigationEvent", Pair.class);
            method7.setAccessible(true);
            Object objInvoke = method7.invoke(null, objArr15);
            Object[] objArr16 = new Object[1];
            c(new char[]{58626, 49963, 2037, 58724, 21322, 16295, 65110, 42413, 5830, 13254, 60135, 47463, 549}, ViewConfiguration.getTapTimeout() >> 16, objArr16);
            String strIntern2 = ((String) objArr16[0]).intern();
            Object[] objArr17 = new Object[1];
            c(new char[]{6322, 40798, 32819, 6336, 8429, 25559, 31120, 54821, 60247, 28603, 27958, 51929, 65427, 31490, 24908, 64871, 49681, 18679, 21743, 61721, 54864, 21591, 18432, 58814, 55986, 8242, 15270, 38977, 44311, 11669, 12247, 36080, 45494}, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr17);
            Object[] objArr18 = {obj, strIntern2, (String) objArr17[0], objInvoke, null, false, null, 56, null};
            Method method8 = ConvertFloatArrayToByteArray.class.getMethod("onExtraCallback", ConvertFloatArrayToByteArray.class, String.class, String.class, Map.class, String.class, Boolean.TYPE, String.class, Integer.TYPE, Object.class);
            method8.setAccessible(true);
            method8.invoke(null, objArr18);
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(532091266);
            if (objOnExtraCallback3 == null) {
                char cRed = (char) Color.red(0);
                int i13 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25;
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 22416;
                byte b3 = (byte) (-$$a[33]);
                byte b4 = b3;
                Object[] objArr19 = new Object[1];
                a(b3, b4, b4, objArr19);
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cRed, i13, iLastIndexOf, 788000530, false, (String) objArr19[0], new Class[0]);
            }
            Object objInvoke2 = ((Method) objOnExtraCallback3).invoke(null, null);
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1574198638);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (40569 - TextUtils.lastIndexOf("", '0')), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, 22021 - View.MeasureSpec.getMode(0), 1821680638, false, "onExtraCallback", new Class[0]);
            }
            Object[] objArr20 = {((Method) objOnExtraCallback4).invoke(null, null)};
            Object[] objArr21 = new Object[1];
            c(new char[]{59870, 65238, 20571, 59839, 65226, 602, 43503}, ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr21);
            Method method9 = Set.class.getMethod((String) objArr21[0], Object.class);
            method9.setAccessible(true);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }
}
