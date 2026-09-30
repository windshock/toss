package com.alibaba.griver.core.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.ExpandableListView;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.DensityUtil;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class H5StatusBarUtils {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    public static int a = 0;
    private static int asInterface = 1;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;

    static {
        onExtraCallbackWithResult();
        int i2 = IAuthTabCallbackDefault + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }

    public static boolean isSupport() {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 5;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 121;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean isConfigSupport() throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 93;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        String config = GriverConfig.getConfig("TSBS");
        Object[] objArr = new Object[1];
        b(new char[]{26360, 23885}, 1 - KeyEvent.normalizeMetaState(0), objArr);
        if (TextUtils.equals(config, ((String) objArr[0]).intern())) {
            return false;
        }
        String config2 = GriverConfig.getConfig("TSBSOFF");
        String str = Build.MODEL;
        if (TextUtils.isEmpty(config2) || !config2.contains(str)) {
            return true;
        }
        int i5 = asInterface;
        int i6 = i5 + 77;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 47;
        onTransact = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void setTransparentColor(Activity activity, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 9;
        onTransact = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            isSupport();
            throw null;
        }
        if (isSupport() && activity != null) {
            Window window = activity.getWindow();
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.getDecorView().setSystemUiVisibility(1280);
            window.setStatusBarColor(i2);
        }
        int i5 = onTransact + 125;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static int getStatusBarHeight(Context context) {
        int i2 = 2 % 2;
        int i3 = asInterface + 41;
        onTransact = i3 % 128;
        if (i3 % 2 == 0 ? a < 3 : a < 5) {
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                int i4 = asInterface + 113;
                onTransact = i4 % 128;
                try {
                    if (i4 % 2 != 0) {
                        a = context.getResources().getDimensionPixelSize(identifier);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    a = context.getResources().getDimensionPixelSize(identifier);
                } catch (Throwable th) {
                    GriverLogger.e("H5StatusBarUtils", "getStatusBarHeight...e=", th);
                }
            }
            if (a < 3 && (context instanceof Activity)) {
                try {
                    Rect rect = new Rect();
                    ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                    a = rect.top;
                    GriverLogger.d("H5StatusBarUtils", " status bar height rect height = " + a);
                } catch (Throwable th2) {
                    GriverLogger.e("H5StatusBarUtils", "getStatusBarHeight...e=", th2);
                }
            }
            if (a < 3) {
                return DensityUtil.dip2px(context, 48.0f);
            }
        }
        int i5 = a;
        int i6 = asInterface + 89;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private static void b(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $11 + 25;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i7 = 58224;
            int i8 = i4;
            while (i8 < 16) {
                int i9 = $11 + 95;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i11 = (c2 + i7) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i12 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallback);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int i13 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9;
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, i4) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maxKeyCode, i13, iMakeMeasureSpec, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), Color.blue(0) + 10, 12434 - (KeyEvent.getMaxKeyCode() >> 16), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    cArr3 = cArr4;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 16014), ExpandableListView.getPackedPositionType(0L) + 14, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = (char) 28033;
        IAuthTabCallback = (char) 5475;
        onNavigationEvent = (char) 42116;
        onExtraCallback = (char) 58023;
    }
}
