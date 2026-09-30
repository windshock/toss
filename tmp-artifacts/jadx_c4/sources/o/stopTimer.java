package o;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.core.webkit.bridge.AccessibilityEventHandler$;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class stopTimer implements ALCFaceResult {
    private static final byte[] $$a = {20, 103, 109, 52};
    private static final int $$b = 234;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int IAuthTabCallback = 1;
    private static char[] onWarmupCompleted = {60838, 25419, 61521, 16719, 54873, 10053, 46204, 1347, 39527, 60285, 30837, 51481, 24095, 44815, 15386, 36123, 536, 37671, 57396, 28963, 50714, 22329, 42187, 13783, 35543};
    private static long onExtraCallbackWithResult = -4447498937613196498L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, byte b2) {
        int i2;
        int i3 = (b * 4) + 97;
        int i4 = b2 * 4;
        byte[] bArr = $$a;
        int i5 = 4 - (i * 2);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i5++;
            i3 += i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i2++;
            i6 = bArr[i5];
            i5++;
            i3 += i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    public static /* synthetic */ void IAuthTabCallback(TossCoreWebView tossCoreWebView, setTopGuideBackgroundColor settopguidebackgroundcolor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(tossCoreWebView, settopguidebackgroundcolor);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ALCFaceResult
    @Deprecated
    public /* bridge */ void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallbackWithResult(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, bundle, uri);
        int i6 = IAuthTabCallback + 19;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return super.onExtraCallbackWithResult();
        }
        super.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ALCFaceResult
    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 75;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        if (i5 != 0) {
            throw null;
        }
        int i6 = onNavigationEvent + 11;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 86 / 0;
        }
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super.onNavigationEvent();
        int i4 = IAuthTabCallback + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return zOnNavigationEvent;
    }

    @Override // o.drawTextBox
    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super.onWarmupCompleted(str);
        int i4 = IAuthTabCallback + 111;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    @Override // o.drawTextBox
    public onOutOfMemory onExtraCallback() {
        onOutOfMemory.onNavigationEvent onnavigationevent;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onnavigationevent = onOutOfMemory.onNavigationEvent.onExtraCallbackWithResult;
            int i3 = 87 / 0;
        } else {
            onnavigationevent = onOutOfMemory.onNavigationEvent.onExtraCallbackWithResult;
        }
        int i4 = onNavigationEvent + 1;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationevent;
    }

    @Override // o.ALCFaceResult
    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        Object[] objArr = new Object[1];
        a(TextUtils.getOffsetAfter("", 0), (Process.myPid() >> 22) + 25, (char) TextUtils.indexOf("", "", 0), objArr);
        if (!Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
            return;
        }
        int i4 = IAuthTabCallback + 7;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        TossCoreWebView webView = webViewContentOwner.getWebView();
        if (webView != null) {
            webView.postDelayed(new AccessibilityEventHandler$.ExternalSyntheticLambda0(webView, settopguidebackgroundcolor), 500L);
        }
    }

    private static final void onExtraCallback(TossCoreWebView tossCoreWebView, setTopGuideBackgroundColor settopguidebackgroundcolor) {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 85;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            tossCoreWebView.performAccessibilityAction(41, null);
            i = 0;
        } else {
            tossCoreWebView.performAccessibilityAction(64, null);
            i = 1;
        }
        setOnOutOfMemeryErrorCallback.onExtraCallback(settopguidebackgroundcolor, null, i, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3;
        Throwable cause;
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            i3 = -1401950695;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i5 = $11 + 115;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i7])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16, 10972 - TextUtils.indexOf((CharSequence) "", '0', 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 46133), 30 - Process.getGidForName(""), 20220 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.getOffsetAfter("", 0)), Color.blue(0) + 44, Process.getGidForName("") + 1495, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause2 = th.getCause();
                        if (cause2 == null) {
                            throw th;
                        }
                        throw cause2;
                    }
                } catch (Throwable th2) {
                    Throwable cause3 = th2.getCause();
                    if (cause3 == null) {
                        throw th2;
                    }
                    throw cause3;
                }
            } catch (Throwable th3) {
                Throwable cause4 = th3.getCause();
                if (cause4 == null) {
                    throw th3;
                }
                throw cause4;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i8 = $10 + 29;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49124), 44 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1495 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                if (objOnExtraCallback5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 49123), 44 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1494 - KeyEvent.getDeadChar(0, 0), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                i3 = -1401950695;
            } catch (Throwable th4) {
                cause = th4.getCause();
                if (cause != null) {
                }
            }
            cause = th4.getCause();
            if (cause != null) {
                throw th4;
            }
            throw cause;
        }
        String str = new String(cArr);
        int i9 = $11 + 37;
        $10 = i9 % 128;
        if (i9 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i10 = 77 / 0;
            objArr[0] = str;
        }
    }
}
