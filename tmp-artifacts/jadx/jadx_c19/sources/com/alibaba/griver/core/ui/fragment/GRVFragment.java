package com.alibaba.griver.core.ui.fragment;

import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ui.fragment.RVFragment;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.griver.dark.resource.R;
import com.alibaba.griver.uimode.DayNightResUtil;
import com.alibaba.griver.uimode.GriverThemeManager;
import com.alibaba.griver.uimode.api.UiMode;
import com.alibaba.griver.uimode.callback.ConfigurationCallback;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class GRVFragment extends RVFragment implements ConfigurationCallback {
    private static final byte[] $$a = {13, 38, -109, 117};
    private static final int $$b = 60;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 478309045;

    private static String $$c(byte b, byte b2, short s) {
        int i2 = (b * 2) + 4;
        int i3 = s * 2;
        byte[] bArr = $$a;
        int i4 = 105 - (b2 * 3);
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2++;
            i4 += i2;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i2];
            i2++;
            i4 += b3;
        }
    }

    public static /* synthetic */ int b() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = R.color.griver_container_background_color_night;
        int i6 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ int c() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = R.color.griver_container_background_color_night;
        if (i4 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onConfigurationChanged(Configuration configuration, UiMode uiMode) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        d();
        if (i4 == 0) {
            int i5 = 24 / 0;
        }
        int i6 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 74 / 0;
        }
    }

    @Override // com.alibaba.ariver.app.api.ui.fragment.RVFragment
    public void onCreate(@Nullable Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        super.onCreate(bundle);
        GriverThemeManager.getThemeManager().addConfigurationCallback(this);
        int i5 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.alibaba.ariver.app.api.ui.fragment.RVFragment
    public void onDestroy() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        super.onDestroy();
        GriverThemeManager.getThemeManager().removeConfigurationCallback(this);
        int i5 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.alibaba.ariver.app.api.ui.fragment.RVFragment
    public void setPage(Page page) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        super.setPage(page);
        a();
        int i5 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
    }

    public final void d() throws Throwable {
        boolean z;
        int i2;
        boolean z2;
        int i3 = 2 % 2;
        int color = 0;
        if (getPage() == null || getPage().getApp() == null) {
            int i4 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            z = false;
            i2 = 0;
            z2 = false;
        } else {
            int i6 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            Bundle startParams = getPage().getApp().getStartParams();
            Object[] objArr = new Object[1];
            f(9 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 11 - Drawable.resolveOpacity(0, 0), new char[]{1, 6, 3, 65524, 5, 65528, 1, 7, 7, 5, 65524}, 265 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), false, objArr);
            z = BundleUtils.getBoolean(startParams, ((String) objArr[0]).intern(), false);
            i2 = BundleUtils.getInt(getPage().getApp().getStartParams(), "containerBackgroundColor");
            z2 = BundleUtils.getBoolean(getPage().getApp().getStartParams(), "darkMode", false);
        }
        if (z || getRootView() == null) {
            return;
        }
        if (z2) {
            color = DayNightResUtil.getColor(getContext(), com.alibaba.griver.base.R.color.griver_container_background_color, DayNightResUtil.getNightColor(new DayNightResUtil.NightColorCallback() { // from class: com.alibaba.griver.core.ui.fragment.GRVFragment$$ExternalSyntheticLambda1
                public final int onNightColor() {
                    return GRVFragment.c();
                }
            }));
            int i8 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
        }
        if (i2 != 0) {
            getRootView().setBackgroundColor(getResources().getColor(com.alibaba.griver.base.R.color.griver_transparent));
        } else if (color != 0) {
            int i10 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            getRootView().setBackgroundColor(color);
        }
        if (getActivity() != null) {
            int i12 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            if (getActivity().getWindow() == null || !z2) {
                return;
            }
            DayNightResUtil.setNavIconColor(getActivity().getWindow(), !UiMode.isNight(GriverThemeManager.getMode()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() throws Throwable {
        boolean z;
        int i2;
        boolean z2;
        int i3 = 2 % 2;
        int color = 0;
        if (getPage() == null || getPage().getApp() == null) {
            z = false;
            i2 = 0;
            z2 = false;
        } else {
            Bundle startParams = getPage().getApp().getStartParams();
            Object[] objArr = new Object[1];
            f(Color.red(0) + 8, KeyEvent.normalizeMetaState(0) + 11, new char[]{1, 6, 3, 65524, 5, 65528, 1, 7, 7, 5, 65524}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 264, false, objArr);
            z = BundleUtils.getBoolean(startParams, ((String) objArr[0]).intern(), false);
            i2 = BundleUtils.getInt(getPage().getApp().getStartParams(), "containerBackgroundColor");
            z2 = BundleUtils.getBoolean(getPage().getApp().getStartParams(), "darkMode", false);
            int i4 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        if (z || getRootView() == null) {
            return;
        }
        int i6 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            color = z2 ? DayNightResUtil.getColor(getContext(), com.alibaba.griver.base.R.color.griver_container_background_color, DayNightResUtil.getNightColor(new DayNightResUtil.NightColorCallback() { // from class: com.alibaba.griver.core.ui.fragment.GRVFragment$$ExternalSyntheticLambda0
                public final int onNightColor() {
                    return GRVFragment.b();
                }
            })) : 1;
        } else if (z2) {
        }
        if (i2 != 0) {
            getRootView().setBackgroundColor(getResources().getColor(com.alibaba.griver.base.R.color.griver_transparent));
        } else if (color != 0) {
            int i7 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                getRootView().setBackgroundColor(color);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getRootView().setBackgroundColor(color);
        }
        if (getActivity() == null || getActivity().getWindow() == null) {
            return;
        }
        if (z2) {
            DayNightResUtil.setNavIconColor(getActivity().getWindow(), !UiMode.isNight(GriverThemeManager.getMode()));
            return;
        }
        Window window = getActivity().getWindow();
        FragmentActivity activity = getActivity();
        int i8 = com.alibaba.griver.base.R.color.griver_container_background_color;
        DayNightResUtil.setWindowBackgroundColor(window, ContextCompat.getColor(activity, i8));
        DayNightResUtil.setNavBarColorAndIcon(getActivity().getWindow(), ContextCompat.getColor(getActivity(), i8));
        DayNightResUtil.setNavIconColor(getActivity().getWindow(), true);
    }

    private static void f(int i2, int i3, char[] cArr, int i4, boolean z, Object[] objArr) throws Throwable {
        int i5;
        int i6 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i3];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i5 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i3) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i4 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0, 0) + 35125), 23 - (ViewConfiguration.getEdgeSlop() >> 16), 10278 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 12843), (Process.myTid() >> 22) + 55, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i3 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i8 = $11 + 105;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i3];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i10 = $10 + 25;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i3) {
                int i12 = $11 + 9;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i3 >> simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) << 1];
                    try {
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                        if (objOnExtraCallback3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 12844), 55 - View.getDefaultSize(0, 0), (Process.myPid() >> 22) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i3 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 12843), 55 - (ViewConfiguration.getEdgeSlop() >> 16), 2167 - (ViewConfiguration.getLongPressTimeout() >> 16), 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                i5 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
