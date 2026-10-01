package o;

import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.webkit.JavascriptInterface;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.TossNativeBridge$;
import im.toss.core.webkit.WebViewContentOwner;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class setCircleStrokeWidth extends drawFocusCircle {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int access100 = 1;
    private static int asBinder;
    private static boolean asInterface;
    private static int getInterfaceDescriptor;
    private static boolean onTransact;
    private final setVariables onExtraCallback;
    private final WebViewContentOwner onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final getTextProgressSize onWarmupCompleted;

    static {
        onTransact();
        Companion = new onExtraCallbackWithResult(null);
        int i = getInterfaceDescriptor + 41;
        access100 = i % 128;
        if (i % 2 == 0) {
            int i2 = 12 / 0;
        }
    }

    public static /* synthetic */ void onNavigationEvent(setCircleStrokeWidth setcirclestrokewidth, String str, Exception exc) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(setcirclestrokewidth, str, exc);
        int i4 = IAuthTabCallbackDefault + 125;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setCircleStrokeWidth(WebViewContentOwner webViewContentOwner, TossCoreWebView tossCoreWebView, setVariables setvariables, getTextProgressSize gettextprogresssize, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 117;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 5;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            setvariables = null;
        }
        if ((i & 8) != 0) {
            int i8 = IAuthTabCallbackDefault + 37;
            IAuthTabCallbackStub = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
            gettextprogresssize = null;
        }
        this(webViewContentOwner, tossCoreWebView, setvariables, gettextprogresssize);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(setCircleStrokeWidth setcirclestrokewidth, String str, JsonObject jsonObject, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setcirclestrokewidth.onWarmupCompleted(str, jsonObject, str2);
        if (i3 == 0) {
            throw null;
        }
    }

    public final WebViewContentOwner onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public setCircleStrokeWidth(@NotNull WebViewContentOwner webViewContentOwner, @NotNull TossCoreWebView tossCoreWebView, @Nullable setVariables setvariables, @Nullable getTextProgressSize gettextprogresssize) {
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(tossCoreWebView, "");
        FragmentActivity activity = webViewContentOwner.getActivity();
        Intrinsics.checkNotNull(activity);
        super(activity, tossCoreWebView, null, 4, null);
        this.onExtraCallbackWithResult = webViewContentOwner;
        this.onExtraCallback = setvariables;
        this.onWarmupCompleted = gettextprogresssize;
    }

    @Override // o.drawFocusCircle
    @JavascriptInterface
    public void postMessage(@NotNull String str) throws Throwable {
        setUserImplbugsnag_android_core_release setuserimplbugsnag_android_core_releaseIAuthTabCallback;
        getUnhandled getunhandledIAuthTabCallback;
        accessgetDelegatep accessgetdelegatepAsBinder;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        if (this.onNavigationEvent) {
            int i3 = IAuthTabCallbackStub + 41;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 % 2;
            }
        }
        try {
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossNativeBridge", "postMessage failed - message:" + str, e, (Map) null, 8, (Object) null);
            int i5 = IAuthTabCallbackStub + 89;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
        }
        if (onExtraCallbackWithResult()) {
            JsonElement string = JsonParser.parseString(str);
            Intrinsics.checkNotNull(string, "");
            JsonObject jsonObject = (JsonObject) string;
            Object[] objArr = new Object[1];
            b(null, new byte[]{-124, -125, -126, -127}, null, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, objArr);
            String asString = jsonObject.get(((String) objArr[0]).intern()).getAsString();
            getTextProgressSize gettextprogresssize = this.onWarmupCompleted;
            if (gettextprogresssize == null || (setuserimplbugsnag_android_core_releaseIAuthTabCallback = gettextprogresssize.IAuthTabCallback("toss.webview")) == null) {
                Intrinsics.checkNotNull(asString);
                onWarmupCompleted(asString, jsonObject, str);
                return;
            }
            trimMetadataStringsTo trimmetadatastringstoOnWarmupCompleted = onWarmupCompleted(jsonObject);
            String str2 = "handle_app_bridge." + asString;
            if (trimmetadatastringstoOnWarmupCompleted == null) {
                getunhandledIAuthTabCallback = setuserimplbugsnag_android_core_releaseIAuthTabCallback.onNavigationEvent(str2).onExtraCallback(trimMetadataStringsTo.onExtraCallback()).IAuthTabCallback();
                accessgetdelegatepAsBinder = getunhandledIAuthTabCallback.asBinder();
                try {
                    try {
                        try {
                            Intrinsics.checkNotNull(getunhandledIAuthTabCallback);
                            Intrinsics.checkNotNull(asString);
                            onExtraCallbackWithResult(this, asString, jsonObject, str);
                            Unit unit = Unit.INSTANCE;
                            getunhandledIAuthTabCallback.onWarmupCompleted(normalizeStackframeErrorTypesbugsnag_android_core_release.OK);
                            ensureBacktraceNoteIsMutable.IAuthTabCallback(accessgetdelegatepAsBinder, (Throwable) null);
                            return;
                        } catch (Exception e2) {
                            normalizeStackframeErrorTypesbugsnag_android_core_release normalizestackframeerrortypesbugsnag_android_core_release = normalizeStackframeErrorTypesbugsnag_android_core_release.ERROR;
                            String message = e2.getMessage();
                            getunhandledIAuthTabCallback.onWarmupCompleted(normalizestackframeerrortypesbugsnag_android_core_release, message != null ? message : "Unknown error");
                            getunhandledIAuthTabCallback.onExtraCallback(e2);
                            throw e2;
                        }
                    } finally {
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            int i7 = IAuthTabCallbackStub + 7;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            getunhandledIAuthTabCallback = setuserimplbugsnag_android_core_releaseIAuthTabCallback.onNavigationEvent(str2).onExtraCallback(trimmetadatastringstoOnWarmupCompleted).IAuthTabCallback();
            accessgetdelegatepAsBinder = getunhandledIAuthTabCallback.asBinder();
            try {
                try {
                    try {
                        Intrinsics.checkNotNull(getunhandledIAuthTabCallback);
                        Intrinsics.checkNotNull(asString);
                        onExtraCallbackWithResult(this, asString, jsonObject, str);
                        Unit unit2 = Unit.INSTANCE;
                        getunhandledIAuthTabCallback.onWarmupCompleted(normalizeStackframeErrorTypesbugsnag_android_core_release.OK);
                        ensureBacktraceNoteIsMutable.IAuthTabCallback(accessgetdelegatepAsBinder, (Throwable) null);
                        return;
                    } finally {
                    }
                } catch (Exception e3) {
                    normalizeStackframeErrorTypesbugsnag_android_core_release normalizestackframeerrortypesbugsnag_android_core_release2 = normalizeStackframeErrorTypesbugsnag_android_core_release.ERROR;
                    String message2 = e3.getMessage();
                    getunhandledIAuthTabCallback.onWarmupCompleted(normalizestackframeerrortypesbugsnag_android_core_release2, message2 != null ? message2 : "Unknown error");
                    getunhandledIAuthTabCallback.onExtraCallback(e3);
                    throw e3;
                }
            } finally {
            }
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossNativeBridge", "postMessage failed - message:" + str, e, (Map) null, 8, (Object) null);
            int i52 = IAuthTabCallbackStub + 89;
            IAuthTabCallbackDefault = i52 % 128;
            int i62 = i52 % 2;
        }
    }

    private final void onWarmupCompleted(String str, JsonObject jsonObject, String str2) throws Throwable {
        int i = 2 % 2;
        if (setTopGuideText.onWarmupCompleted.onNavigationEvent(this.onExtraCallbackWithResult, str, jsonObject)) {
            return;
        }
        int i2 = IAuthTabCallbackDefault + 123;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        try {
            setVariables setvariables = this.onExtraCallback;
            if (setvariables == null || !setvariables.onExtraCallbackWithResult(this.onExtraCallbackWithResult, str, jsonObject)) {
                return;
            }
            int i3 = IAuthTabCallbackStub + 3;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            if (this.onNavigationEvent) {
                int i5 = IAuthTabCallbackStub + 11;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
            }
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossNativeBridge", e.getMessage(), e, (Map) null, 8, (Object) null);
            String strOnExtraCallback = new setText(jsonObject).onExtraCallback();
            if (strOnExtraCallback != null) {
                new Handler(Looper.getMainLooper()).post(new TossNativeBridge$.ExternalSyntheticLambda0(this, strOnExtraCallback, e));
                int i7 = IAuthTabCallbackStub + 27;
                IAuthTabCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
            }
        }
    }

    private static final void onExtraCallback(setCircleStrokeWidth setcirclestrokewidth, String str, Exception exc) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        TossCoreWebView webView = setcirclestrokewidth.onExtraCallbackWithResult.getWebView();
        if (webView != null) {
            setTopGuideFontSize.onExtraCallback(webView, str, exc.getMessage());
            int i4 = IAuthTabCallbackStub + 125;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final trimMetadataStringsTo onWarmupCompleted(JsonObject jsonObject) {
        JsonObject jsonObject2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z = jsonObject.get("trace") instanceof JsonObject;
            obj.hashCode();
            throw null;
        }
        JsonObject jsonObject3 = jsonObject.get("trace");
        if (jsonObject3 instanceof JsonObject) {
            jsonObject2 = jsonObject3;
            int i3 = IAuthTabCallbackStub + 73;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
        } else {
            jsonObject2 = null;
        }
        if (jsonObject2 == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set setEntrySet = jsonObject2.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            int i5 = IAuthTabCallbackDefault + 17;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), ((JsonElement) entry.getValue()).getAsString());
                throw null;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            linkedHashMap.put(entry2.getKey(), ((JsonElement) entry2.getValue()).getAsString());
        }
        getTextProgressSize gettextprogresssize = this.onWarmupCompleted;
        if (gettextprogresssize == null) {
            return null;
        }
        int i6 = IAuthTabCallbackStub + 35;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            return gettextprogresssize.onWarmupCompleted(linkedHashMap);
        }
        int i7 = 32 / 0;
        return gettextprogresssize.onWarmupCompleted(linkedHashMap);
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private static void b(int[] iArr, byte[] bArr, char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (Process.myTid() >> 22) + 77, TextUtils.indexOf("", "") + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i5 = $10 + 35;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(asBinder)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), KeyEvent.keyCodeFromString("") + 75, 16037 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i7 = 1052772399;
        if (onTransact) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i7);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16777216), TextUtils.getOffsetAfter("", 0) + 63, (ViewConfiguration.getScrollBarSize() >> 8) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i7 = 1052772399;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (asInterface) {
            int i8 = $10 + 29;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), Process.getGidForName("") + 64, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        int i10 = $11 + 91;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i12 = $10 + 75;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback + 1) >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] / i] - iIntValue);
                i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted % 1;
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
            }
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
        }
        objArr[0] = new String(cArr6);
    }

    static void onTransact() {
        IAuthTabCallback = new char[]{32556, 32561, 32557, 32565};
        asBinder = -1184333870;
        asInterface = true;
        onTransact = true;
    }
}
