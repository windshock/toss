package o;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.JsonObject;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.rn.spec.base.ReactNativeContentOwner;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getKeyInfo implements ALCFaceResult, r8lambda_TGyvW_ZWE2FNGas5LTboepDiQ {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 0;
    private static boolean onExtraCallback = false;
    private static char[] onExtraCallbackWithResult = null;
    private static final String onNavigationEvent;
    private static int onTransact = 1;
    private static int onWarmupCompleted;

    static {
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-121, -115, -126, -127, -116, -126, -117, -118, -119, -120, -121, -124, -122, -123, -124, -125, -126, -127}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        Companion = new onExtraCallbackWithResult(null);
        int i = onTransact + 87;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        onOutOfMemory onoutofmemoryOnExtraCallback;
        int i = 2 % 2;
        int i2 = asInterface + 27;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
            int i3 = 12 / 0;
        } else {
            onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        }
        int i4 = asInterface + 49;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return onoutofmemoryOnExtraCallback;
    }

    @Deprecated
    public /* bridge */ void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = asInterface + 27;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallbackWithResult(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, bundle, uri);
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackDefault + 49;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 43;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        int i6 = IAuthTabCallbackDefault + 31;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ void onNavigationEvent(@NotNull ReactNativeContentOwner reactNativeContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = asInterface + 43;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(reactNativeContentOwner, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 == 0) {
            int i6 = 36 / 0;
        }
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onNavigationEvent();
        }
        super/*o.drawTextBox*/.onNavigationEvent();
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.drawTextBox*/.onWarmupCompleted(str);
        }
        super/*o.drawTextBox*/.onWarmupCompleted(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        if (!(!zzaj.onNavigationEvent().RemoteActionCompatParcelizer())) {
            ALCFaceBox.onWarmupCompleted(settopguidebackgroundcolor, IAuthTabCallback());
            return;
        }
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-121, -127, -108, -112, -124, -125, -111, -116, -113, -105, -108, -116, -111, -109, -112, -111, -126, -108, -125, -116, -108, -112, -116, -106, -116, -111, -107, -108, -109, -119, -111, -121, -112, -111, -126, -115, -124, -120, -116, -126, -110, -111, -121, -112, -113, -114}, (ViewConfiguration.getScrollBarSize() >> 8) + 127, objArr);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, ((String) objArr[0]).intern(), (String) null, (Map) null, 6, (Object) null);
        int i4 = asInterface + 5;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public void IAuthTabCallback(@NotNull ReactNativeContentOwner reactNativeContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(reactNativeContentOwner, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
            zzaj.onNavigationEvent().RemoteActionCompatParcelizer();
            throw null;
        }
        Intrinsics.checkNotNullParameter(reactNativeContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        if (zzaj.onNavigationEvent().RemoteActionCompatParcelizer()) {
            ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, IAuthTabCallback());
            return;
        }
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-121, -127, -108, -112, -124, -125, -111, -116, -113, -105, -108, -116, -111, -109, -112, -111, -126, -108, -125, -116, -108, -112, -116, -106, -116, -111, -107, -108, -109, -119, -111, -121, -112, -111, -126, -115, -124, -120, -116, -126, -110, -111, -121, -112, -113, -114}, View.MeasureSpec.getMode(0) + 127, objArr);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, ((String) objArr[0]).intern(), (String) null, (Map) null, 6, (Object) null);
        int i3 = asInterface + 43;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    private final JsonObject IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        JsonObject jsonObject = new JsonObject();
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1708383416);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getTrimmedLength("") + 15, 10990 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1418928680, false, "Companion", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1363112936);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 32 - MotionEvent.axisFromString(""), 11004 - TextUtils.lastIndexOf("", '0'), 1618972024, false, "onExtraCallbackWithResult", new Class[0]);
            }
            Object objInvoke = ((Method) objOnExtraCallback2).invoke(obj, null);
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1203654317);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Color.blue(0) + 15, (Process.myTid() >> 22) + 10990, -1996402749, false, "onWarmupCompleted", new Class[0]);
            }
            Iterator it = ((Map) ((Method) objOnExtraCallback3).invoke(objInvoke, null)).entrySet().iterator();
            int i2 = IAuthTabCallbackDefault + 57;
            while (true) {
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                if (!it.hasNext()) {
                    JsonObject jsonObject2 = new JsonObject();
                    Object[] objArr = new Object[1];
                    a(null, null, new byte[]{-121, -115, -126, -127, -116, -126, -117, -118, -119, -120, -121, -124, -122, -123, -124, -125, -126, -127}, KeyEvent.getDeadChar(0, 0) + 127, objArr);
                    jsonObject2.add(((String) objArr[0]).intern(), jsonObject);
                    return jsonObject2;
                }
                int i4 = IAuthTabCallbackDefault + 7;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                Map.Entry entry = (Map.Entry) it.next();
                jsonObject.addProperty((String) entry.getKey(), (String) entry.getValue());
                i2 = IAuthTabCallbackDefault + 83;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallbackWithResult;
        float f = 0.0f;
        if (cArr2 != null) {
            int i4 = $11 + 115;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 115;
                $10 = i7 % 128;
                if (i7 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)), 77 - (ViewConfiguration.getEdgeSlop() >> 16), 20952 - Color.red(0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i6 >>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 78, 20952 - TextUtils.getOffsetBefore("", 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6++;
                }
                i2 = 2;
                f = 0.0f;
            }
            int i8 = $10 + 43;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getEdgeSlop() >> 16) + 75, 16037 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (onExtraCallback) {
            int i10 = $11 + 55;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 62, 12214 - (Process.myPid() >> 22), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i12 = $11 + 85;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i14 = $11 + 83;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 63 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 12215 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        String str = new String(cArr6);
        int i16 = $11 + 105;
        $10 = i16 % 128;
        int i17 = i16 % 2;
        objArr[0] = str;
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = new char[]{32635, 32634, 32581, 32618, 32632, 32548, 32628, 32619, 32624, 32626, 32607, 32582, 32629, 32587, 32639, 32638, 32519, 32633, 32625, 32627, 32622, 32617, 32631};
        onWarmupCompleted = -1184333849;
        IAuthTabCallback = true;
        onExtraCallback = true;
    }
}
