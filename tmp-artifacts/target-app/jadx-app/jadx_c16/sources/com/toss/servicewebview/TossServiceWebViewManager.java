package com.toss.servicewebview;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.RadioGroupBindingAdapter1;
import o.RatingBarBindingAdapter;
import o.SavedStateConfiguration_androidKtExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;
import o.r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ;
import o.setShadowDrawable;
import o.setShadowDrawableRight;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(IAuthTabCallback = TossServiceWebViewManager.NAME)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class TossServiceWebViewManager extends SimpleViewManager<TossServiceWebView> implements RadioGroupBindingAdapter1<TossServiceWebView> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallback = 1;
    public static final String NAME = "TossServiceWebView";
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<TossServiceWebView> mDelegate = new RatingBarBindingAdapter(this);

    static {
        onExtraCallback();
        Companion = new onExtraCallbackWithResult((DefaultConstructorMarker) null);
        int i = IAuthTabCallback + 49;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public /* bridge */ /* synthetic */ View createViewInstance(CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TossServiceWebView tossServiceWebViewM30createViewInstance = m30createViewInstance(credentialProviderGetSignInIntentControllerhandleResponse2);
        int i4 = onNavigationEvent + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return tossServiceWebViewM30createViewInstance;
    }

    public /* bridge */ /* synthetic */ void goBack(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        goBack((TossServiceWebView) view);
        int i4 = onWarmupCompleted + 27;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void goForward(View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        goForward((TossServiceWebView) view);
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void injectJavaScript(View view, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        injectJavaScript((TossServiceWebView) view, str);
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onDropViewInstance((TossServiceWebView) view);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 69;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void receiveCommand(View view, String str, ReadableArray readableArray) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        receiveCommand((TossServiceWebView) view, str, readableArray);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 119;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void reload(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        reload((TossServiceWebView) view);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 33;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setContentInset(View view, ReadableMap readableMap) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        setContentInset((TossServiceWebView) view, readableMap);
        int i4 = onNavigationEvent + 33;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setInjectedJavaScript(View view, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        setInjectedJavaScript((TossServiceWebView) view, str);
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setNavigationBar(View view, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        setNavigationBar((TossServiceWebView) view, str);
        int i4 = onWarmupCompleted + 21;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setSwipeRefresh(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        setSwipeRefresh((TossServiceWebView) view, z);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 31;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setUrl(View view, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        setUrl((TossServiceWebView) view, str);
        int i4 = onNavigationEvent + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setUserAgent(View view, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        setUserAgent((TossServiceWebView) view, str);
        int i4 = onNavigationEvent + 5;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<TossServiceWebView> getDelegate() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 47;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<TossServiceWebView> r8lambdafabcsqiuodz2nkxqdax2sri9ddq = this.mDelegate;
        int i5 = i2 + 25;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
        return r8lambdafabcsqiuodz2nkxqdax2sri9ddq;
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 93;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 95;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return NAME;
    }

    /* renamed from: createViewInstance, reason: collision with other method in class */
    protected TossServiceWebView m30createViewInstance(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        TossServiceWebView tossServiceWebView = new TossServiceWebView(credentialProviderGetSignInIntentControllerhandleResponse2);
        int i2 = onNavigationEvent + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return tossServiceWebView;
    }

    public void onDropViewInstance(@NotNull TossServiceWebView tossServiceWebView) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tossServiceWebView, "");
        super/*com.facebook.react.uimanager.BaseViewManager*/.onDropViewInstance(tossServiceWebView);
        View viewOnWarmupCompleted = tossServiceWebView.onWarmupCompleted();
        if (viewOnWarmupCompleted != null) {
            int i2 = onNavigationEvent + 31;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                setShadowDrawableRight.onExtraCallbackWithResult.onWarmupCompleted();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            setShadowDrawableRight setshadowdrawableright = setShadowDrawableRight.onExtraCallbackWithResult;
            setShadowDrawable setshadowdrawableOnWarmupCompleted = setshadowdrawableright.onWarmupCompleted();
            if (setshadowdrawableOnWarmupCompleted != null) {
                setshadowdrawableOnWarmupCompleted.onWarmupCompleted(viewOnWarmupCompleted);
            }
            setshadowdrawableright.onExtraCallbackWithResult(viewOnWarmupCompleted);
        }
        int i3 = onNavigationEvent + 67;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 94 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "url")
    public void setUrl(@NotNull TossServiceWebView tossServiceWebView, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tossServiceWebView, "");
            tossServiceWebView.setUrl(str);
        } else {
            Intrinsics.checkNotNullParameter(tossServiceWebView, "");
            tossServiceWebView.setUrl(str);
            int i3 = 42 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "injectedJavaScript")
    public void setInjectedJavaScript(@NotNull TossServiceWebView tossServiceWebView, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tossServiceWebView, "");
        tossServiceWebView.setInjectedJavaScript(str);
        int i4 = onWarmupCompleted + 93;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "userAgent")
    public void setUserAgent(@NotNull TossServiceWebView tossServiceWebView, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tossServiceWebView, "");
            tossServiceWebView.setUserAgent(str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(tossServiceWebView, "");
        tossServiceWebView.setUserAgent(str);
        int i3 = onNavigationEvent + 71;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "contentInset")
    public void setContentInset(@NotNull TossServiceWebView tossServiceWebView, @Nullable ReadableMap readableMap) {
        float f;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onWarmupCompleted = i2 % 128;
        SavedStateConfiguration_androidKtExternalSyntheticLambda0 savedStateConfiguration_androidKtExternalSyntheticLambda0 = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tossServiceWebView, "");
            savedStateConfiguration_androidKtExternalSyntheticLambda0.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(tossServiceWebView, "");
        if (readableMap != null) {
            float f2 = 0.0f;
            float f3 = readableMap.hasKey("top") ? (float) readableMap.getDouble("top") : 0.0f;
            if (readableMap.hasKey("left")) {
                int i3 = onWarmupCompleted + 21;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                f = (float) readableMap.getDouble("left");
            } else {
                f = 0.0f;
            }
            float f4 = readableMap.hasKey("bottom") ? (float) readableMap.getDouble("bottom") : 0.0f;
            if (readableMap.hasKey("right")) {
                int i5 = onNavigationEvent + 5;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    readableMap.getDouble("right");
                    savedStateConfiguration_androidKtExternalSyntheticLambda0.hashCode();
                    throw null;
                }
                f2 = (float) readableMap.getDouble("right");
            }
            savedStateConfiguration_androidKtExternalSyntheticLambda0 = new SavedStateConfiguration_androidKtExternalSyntheticLambda0(f3, f, f4, f2);
            int i6 = onNavigationEvent + 81;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
        tossServiceWebView.setContentInset(savedStateConfiguration_androidKtExternalSyntheticLambda0);
    }

    @ReactProp(IAuthTabCallbackStub = "navigationBar")
    public void setNavigationBar(@NotNull TossServiceWebView tossServiceWebView, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tossServiceWebView, "");
        tossServiceWebView.setNavigationBar(str);
        int i4 = onWarmupCompleted + 49;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "swipeRefresh", onExtraCallbackWithResult = false)
    public void setSwipeRefresh(@NotNull TossServiceWebView tossServiceWebView, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tossServiceWebView, "");
        tossServiceWebView.setSwipeRefresh(z);
        int i4 = onNavigationEvent + 1;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public void injectJavaScript(@NotNull TossServiceWebView tossServiceWebView, @NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tossServiceWebView, "");
        Intrinsics.checkNotNullParameter(str, "");
        tossServiceWebView.IAuthTabCallback(str);
        int i4 = onNavigationEvent + 41;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public void goBack(@NotNull TossServiceWebView tossServiceWebView) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tossServiceWebView, "");
        tossServiceWebView.IAuthTabCallback();
        int i4 = onWarmupCompleted + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void goForward(@NotNull TossServiceWebView tossServiceWebView) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tossServiceWebView, "");
            tossServiceWebView.onNavigationEvent();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(tossServiceWebView, "");
        tossServiceWebView.onNavigationEvent();
        int i3 = onWarmupCompleted + 63;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public void reload(@NotNull TossServiceWebView tossServiceWebView) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tossServiceWebView, "");
        tossServiceWebView.onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 107;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void receiveCommand(@NotNull TossServiceWebView tossServiceWebView, @NotNull String str, @Nullable ReadableArray readableArray) {
        String string;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tossServiceWebView, "");
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1241591313:
                if (str.equals("goBack")) {
                    tossServiceWebView.IAuthTabCallback();
                    return;
                }
                break;
            case -934641255:
                if (str.equals("reload")) {
                    tossServiceWebView.onExtraCallbackWithResult();
                    return;
                }
                break;
            case -318289731:
                if (str.equals("goForward")) {
                    tossServiceWebView.onNavigationEvent();
                    int i2 = onNavigationEvent + 63;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    return;
                }
                break;
            case 2104576510:
                if (str.equals("injectJavaScript")) {
                    if (readableArray != null) {
                        int i4 = onNavigationEvent + 121;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        string = readableArray.getString(0);
                    } else {
                        string = null;
                    }
                    if (string != null) {
                        int i6 = onWarmupCompleted + 21;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        tossServiceWebView.IAuthTabCallback(string);
                        return;
                    }
                    return;
                }
                break;
        }
        super/*com.facebook.react.uimanager.ViewManager*/.receiveCommand(tossServiceWebView, str, readableArray);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() throws Throwable {
        Map<String, Object> exportedCustomDirectEventTypeConstants;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            exportedCustomDirectEventTypeConstants = super/*com.facebook.react.uimanager.BaseViewManager*/.getExportedCustomDirectEventTypeConstants();
            int i3 = 19 / 0;
            if (exportedCustomDirectEventTypeConstants == null) {
                exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
                int i4 = onWarmupCompleted + 7;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 / 3;
                }
            }
        } else {
            exportedCustomDirectEventTypeConstants = super/*com.facebook.react.uimanager.BaseViewManager*/.getExportedCustomDirectEventTypeConstants();
            if (exportedCustomDirectEventTypeConstants == null) {
            }
        }
        Object[] objArr = new Object[1];
        b(false, new byte[]{0, 0, 0, 1, 1, 0, 0, 0, 0}, new int[]{0, 9, 183, 2}, objArr);
        exportedCustomDirectEventTypeConstants.put("topMessage", access8100.onNavigationEvent(getWrite.IAuthTabCallback("registrationName", ((String) objArr[0]).intern())));
        exportedCustomDirectEventTypeConstants.put("topCanGoBackChange", access8100.onNavigationEvent(getWrite.IAuthTabCallback("registrationName", "onCanGoBackChange")));
        exportedCustomDirectEventTypeConstants.put("topLoad", access8100.onNavigationEvent(getWrite.IAuthTabCallback("registrationName", "onLoad")));
        return exportedCustomDirectEventTypeConstants;
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = onExtraCallbackWithResult;
        if (cArr2 != null) {
            int i6 = $11 + 73;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getScrollBarSize() >> 8) + 35, (Process.myTid() >> 22) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        char[] cArr4 = new char[i3];
        System.arraycopy(cArr2, i2, cArr4, 0, i3);
        if (bArr != null) {
            char[] cArr5 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = $11 + 19;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - TextUtils.getCapsMode("", 0, 0)), 64 - TextUtils.lastIndexOf("", '0'), Color.argb(0, 0, 0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 28 - ((byte) KeyEvent.getModifierMetaStateMask()), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49468 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 70 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr4 = cArr5;
        }
        if (i5 > 0) {
            char[] cArr6 = new char[i3];
            System.arraycopy(cArr4, 0, cArr6, 0, i3);
            int i13 = i3 - i5;
            System.arraycopy(cArr6, 0, cArr4, i13, i5);
            System.arraycopy(cArr6, i5, cArr4, 0, i13);
        }
        if (z) {
            int i14 = $11 + 87;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            int i15 = $10 + 21;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr4 = cArr;
        }
        if (i4 > 0) {
            int i17 = $11 + 47;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = new char[]{27329, 27475, 27503, 27499, 27482, 27486, 27501, 27492, 27503};
    }
}
