package com.alibaba.griver.core.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class NavigationBarUtil {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static String g = null;
    private static char onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onTransact = 1;
    private static char[] onWarmupCompleted;
    public boolean a = true;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public final int e;
    public final boolean f;

    public interface OnNavigationStateListener {
        void onNavigationState(boolean z, int i2);
    }

    public NavigationBarUtil(Activity activity) throws Throwable {
        boolean z = true;
        if (activity.getResources().getConfiguration().orientation != 1) {
            int i2 = IAuthTabCallback + 33;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            z = false;
        }
        this.f = z;
        this.e = a(activity);
        a(activity, new OnNavigationStateListener() { // from class: com.alibaba.griver.core.utils.NavigationBarUtil.1
            @Override // com.alibaba.griver.core.utils.NavigationBarUtil.OnNavigationStateListener
            public void onNavigationState(boolean z2, int i4) {
                NavigationBarUtil.access$002(NavigationBarUtil.this, z2);
                NavigationBarUtil.access$102(NavigationBarUtil.this, i4);
            }
        });
        int i4 = onTransact + 121;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean access$002(NavigationBarUtil navigationBarUtil, boolean z) {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 3;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        navigationBarUtil.a = z;
        int i6 = i3 + 11;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public static /* synthetic */ int access$102(NavigationBarUtil navigationBarUtil, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact;
        int i5 = i4 + 5;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        navigationBarUtil.b = i2;
        int i7 = i4 + 23;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return i2;
    }

    public static /* synthetic */ int access$200(NavigationBarUtil navigationBarUtil) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 89;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        int i6 = navigationBarUtil.c;
        int i7 = i3 + 55;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public static /* synthetic */ int access$202(NavigationBarUtil navigationBarUtil, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 93;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        navigationBarUtil.c = i2;
        if (i5 == 0) {
            int i6 = 41 / 0;
        }
        return i2;
    }

    public static /* synthetic */ int access$302(NavigationBarUtil navigationBarUtil, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback;
        int i5 = i4 + 97;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        navigationBarUtil.d = i2;
        if (i6 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i7 = i4 + 85;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return i2;
    }

    public int getBottomInsect() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 69;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i5 = this.b;
        int i6 = i3 + 57;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public int getLeftInsect() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 83;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return this.d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getNavigationBarHeight() {
        int i2 = 2 % 2;
        int i3 = onTransact + 57;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.e;
        if (i4 != 0) {
            int i6 = 62 / 0;
        }
        return i5;
    }

    public int getRightInsect() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 119;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.c;
        if (i4 == 0) {
            int i6 = 95 / 0;
        }
        return i5;
    }

    public boolean hasNavigationBar() {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 115;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        boolean z = this.a;
        int i6 = i3 + 31;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onNavigationEvent();
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
            declaredMethod.setAccessible(true);
            g = (String) declaredMethod.invoke(null, "qemu.hw.mainkeys");
            int i2 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (Throwable unused) {
            g = null;
        }
    }

    public final int a(Context context) throws Throwable {
        String str;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 69;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            context.getResources();
            b(context);
            throw null;
        }
        Resources resources = context.getResources();
        if (!b(context)) {
            return 0;
        }
        if (this.f) {
            int i4 = onTransact + 49;
            IAuthTabCallback = i4 % 128;
            str = "navigation_bar_height";
            if (i4 % 2 != 0) {
                int i5 = 58 / 0;
            }
        } else {
            str = "navigation_bar_height_landscape";
        }
        int iA = a(resources, str);
        int i6 = onTransact + 115;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return iA;
    }

    public final boolean b(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 49;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        if (identifier == 0) {
            return !ViewConfiguration.get(context).hasPermanentMenuKey();
        }
        int i5 = IAuthTabCallback + 109;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            resources.getBoolean(identifier);
            throw null;
        }
        boolean z = resources.getBoolean(identifier);
        if (!z) {
            z = !ViewConfiguration.get(context).hasPermanentMenuKey();
        }
        Object[] objArr = new Object[1];
        h(new char[]{13799}, (byte) (View.resolveSizeAndState(0, 0, 0) + 60), 1 - View.getDefaultSize(0, 0), objArr);
        if (((String) objArr[0]).intern().equals(g)) {
            return false;
        }
        Object[] objArr2 = new Object[1];
        h(new char[]{13846}, (byte) (AndroidCharacter.getMirror('0') + '<'), -TextUtils.indexOf((CharSequence) "", '0'), objArr2);
        if (!((String) objArr2[0]).intern().equals(g)) {
            return z;
        }
        int i6 = IAuthTabCallback + 27;
        onTransact = i6 % 128;
        return i6 % 2 != 0;
    }

    public final void a(Activity activity, final OnNavigationStateListener onNavigationStateListener) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 89;
        onTransact = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (activity != null) {
            final View decorView = activity.getWindow().getDecorView();
            final int iA = a(activity);
            decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.alibaba.griver.core.utils.NavigationBarUtil.2
                @Override // android.view.View.OnApplyWindowInsetsListener
                public WindowInsets onApplyWindowInsets(@NonNull View view, @NonNull WindowInsets windowInsets) {
                    int systemWindowInsetBottom;
                    WindowInsetsController windowInsetsController;
                    boolean z = false;
                    if (windowInsets != null) {
                        systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
                        NavigationBarUtil.access$202(NavigationBarUtil.this, windowInsets.getSystemWindowInsetRight());
                        NavigationBarUtil.access$302(NavigationBarUtil.this, windowInsets.getSystemWindowInsetLeft());
                        if (Build.VERSION.SDK_INT < 35 || view.getResources().getConfiguration().orientation != 2 ? systemWindowInsetBottom == iA : NavigationBarUtil.access$200(NavigationBarUtil.this) == iA) {
                            z = true;
                        }
                    } else {
                        systemWindowInsetBottom = -1;
                    }
                    OnNavigationStateListener onNavigationStateListener2 = onNavigationStateListener;
                    if (onNavigationStateListener2 != null) {
                        onNavigationStateListener2.onNavigationState(z, systemWindowInsetBottom);
                    }
                    if (z && Build.VERSION.SDK_INT >= 35 && (windowInsetsController = decorView.getWindowInsetsController()) != null) {
                        windowInsetsController.setSystemBarsAppearance(16, 16);
                    }
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
        } else {
            int i5 = i3 + 93;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }
    }

    public final int a(Resources resources, String str) {
        int i2 = 2 % 2;
        int i3 = onTransact + 105;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int identifier = resources.getIdentifier(str, "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        int i5 = IAuthTabCallback + 79;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return 0;
    }

    private static void h(char[] cArr, byte b, int i2, Object[] objArr) throws Throwable {
        int i3;
        Object obj;
        long j;
        int i4 = 2;
        int i5 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onWarmupCompleted;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 101;
                $10 = i7 % 128;
                int i8 = i7 % i4;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 26 - Color.red(0), 23139 - TextUtils.getOffsetBefore("", 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    i4 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            long j2 = 0;
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23138, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i2];
            if (i2 % 2 != 0) {
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr[i3] - b);
                int i9 = $11 + 61;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            } else {
                i3 = i2;
            }
            if (i3 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i3) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        int i11 = $10 + 45;
                        $11 = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i12 = 5 % 3;
                        }
                        j = j2;
                        obj = obj2;
                    } else {
                        try {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - ExpandableListView.getPackedPositionGroup(j2)), MotionEvent.axisFromString("") + 75, 8088 - (ViewConfiguration.getLongPressTimeout() >> 16), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    j = 0;
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 31 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 19489 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                } else {
                                    j = 0;
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                            } else {
                                obj = null;
                                j = 0;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                                } else {
                                    int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i16];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                                }
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                    j2 = j;
                }
            }
            for (int i18 = 0; i18 < i2; i18++) {
                cArr4[i18] = (char) (cArr4[i18] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static void onNavigationEvent() {
        onWarmupCompleted = new char[]{64899, 64898, 64901, 64900};
        onExtraCallback = (char) 51243;
    }
}
