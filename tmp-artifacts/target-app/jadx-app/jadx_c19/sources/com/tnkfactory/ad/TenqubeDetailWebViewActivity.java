package com.tnkfactory.ad;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.ariver.kernel.RVParams;
import com.tnkfactory.ad.TenqubeDetailWebViewActivity$;
import com.tnkfactory.ad.TenqubeDetailWebViewActivity$NativeBridge$;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.IAuthTabCallbackStubProxy;
import o.ICustomTabsService;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageService_Parcel;
import o.SegmentedButtonKtExternalSyntheticLambda1;
import o.SegmentedButtonKtExternalSyntheticLambda5;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.clearFaultAdjacentMetadata;
import o.onSessionEnded;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TenqubeDetailWebViewActivity extends AppCompatActivity {
    public static final Companion Companion;
    private static final String EXTRA_INITIAL_URL = "initialUrl";
    private static int IAuthTabCallbackStub;
    private static int asBinder;
    private final Set<String> allowedDomains = clearFaultAdjacentMetadata.onExtraCallback("reward.tenqube.com");
    private boolean backButtonListenerRegistered;
    private boolean backKeyListenerRegistered;
    private boolean clearHistory;
    private IEngagementSignalsCallback_Parcel<Intent> fileChooserLauncher;
    private ValueCallback<Uri[]> filePathCallback;
    private WebView webView;
    private static final byte[] $$a = {77, -67, -125, 9};
    private static final int $$b = RVParams.WEBVIEW_FONT_SIZE_LARGEST;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackDefault = 1;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ void start$default(Companion companion, Context context, String str, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                str = null;
            }
            companion.start(context, str);
        }

        public final void start(@NotNull Context context, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) TenqubeDetailWebViewActivity.class);
            if (str != null) {
                intent.putExtra(TenqubeDetailWebViewActivity.EXTRA_INITIAL_URL, str);
            }
            context.startActivity(intent);
        }
    }

    public final class NativeBridge {
        private static final byte[] $$a = {44, 39, 61, 29};
        private static final int $$b = 64;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int IAuthTabCallback = 1;
        private static long onNavigationEvent = 7798559133331975163L;
        private static int onWarmupCompleted = -1776194565;
        private static char onExtraCallback = 60824;

        private static String $$c(byte b, int i2, int i3) {
            int i4 = i2 + 109;
            int i5 = i3 * 3;
            int i6 = (b * 3) + 4;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i5 + 1];
            int i7 = -1;
            if (bArr == null) {
                i7 = -1;
                i4 = i6 + i5;
                i6++;
            }
            while (true) {
                int i8 = i7 + 1;
                bArr2[i8] = (byte) i4;
                if (i8 == i5) {
                    return new String(bArr2, 0);
                }
                int i9 = i4;
                i7 = i8;
                i4 = bArr[i6] + i9;
                i6++;
            }
        }

        public NativeBridge() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void a(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            tenqubeDetailWebViewActivity.finish();
            int i5 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 98 / 0;
            }
        }

        @JavascriptInterface
        public final void onPageLoaded() {
            int i2 = 2 % 2;
            new Handler(Looper.getMainLooper()).post(new TenqubeDetailWebViewActivity$NativeBridge$.ExternalSyntheticLambda0(TenqubeDetailWebViewActivity.this));
            int i3 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }

        @JavascriptInterface
        public final void openExternalBrowser(@NotNull String str) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            new Handler(Looper.getMainLooper()).post(new TenqubeDetailWebViewActivity$NativeBridge$.ExternalSyntheticLambda5(str, TenqubeDetailWebViewActivity.this));
            int i3 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }

        @JavascriptInterface
        public final void openInternalBrowser(@NotNull String str) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            new Handler(Looper.getMainLooper()).post(new TenqubeDetailWebViewActivity$NativeBridge$.ExternalSyntheticLambda1(TenqubeDetailWebViewActivity.this, str));
            int i3 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        @JavascriptInterface
        public final void pushUrl(@NotNull String str) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            new Handler(Looper.getMainLooper()).post(new TenqubeDetailWebViewActivity$NativeBridge$.ExternalSyntheticLambda6(str, TenqubeDetailWebViewActivity.this));
            int i3 = onExtraCallbackWithResult + 85;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }

        @JavascriptInterface
        public final void registerBackButtonListener() {
            int i2 = 2 % 2;
            new Handler(Looper.getMainLooper()).post(new TenqubeDetailWebViewActivity$NativeBridge$.ExternalSyntheticLambda3(TenqubeDetailWebViewActivity.this));
            int i3 = onExtraCallbackWithResult + 85;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        @JavascriptInterface
        public final void registerBackKeyListener() {
            int i2 = 2 % 2;
            new Handler(Looper.getMainLooper()).post(new TenqubeDetailWebViewActivity$NativeBridge$.ExternalSyntheticLambda4(TenqubeDetailWebViewActivity.this));
            int i3 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }

        @JavascriptInterface
        public final void setTitle(@NotNull String str) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            new Handler(Looper.getMainLooper()).post(new TenqubeDetailWebViewActivity$NativeBridge$.ExternalSyntheticLambda7(TenqubeDetailWebViewActivity.this, str));
            int i3 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @JavascriptInterface
        public final void finish() {
            int i2 = 2 % 2;
            new Handler(Looper.getMainLooper()).post(new TenqubeDetailWebViewActivity$NativeBridge$.ExternalSyntheticLambda2(TenqubeDetailWebViewActivity.this));
            int i3 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final void a(String str, TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Uri uri = Uri.parse(str);
                Intrinsics.checkNotNull(uri);
                TenqubeDetailWebViewActivity.access$openExternally(tenqubeDetailWebViewActivity, uri);
                throw null;
            }
            Uri uri2 = Uri.parse(str);
            Intrinsics.checkNotNull(uri2);
            TenqubeDetailWebViewActivity.access$openExternally(tenqubeDetailWebViewActivity, uri2);
            int i4 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public static final void d(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity) throws Throwable {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            TenqubeDetailWebViewActivity.access$setBackKeyListenerRegistered$p(tenqubeDetailWebViewActivity, true);
            Object[] objArr = new Object[1];
            e((char) (AndroidCharacter.getMirror('0') + 17964), TextUtils.indexOf("", "", 0, 0) - 701546554, new char[]{21477}, new char[]{0, 0, 0, 0}, new char[]{50821, 12095, 23766, 23878}, objArr);
            TenqubeDetailWebViewActivity.access$callJavaScriptCallback(tenqubeDetailWebViewActivity, "registerBackKeyListener", ((String) objArr[0]).intern());
            int i5 = IAuthTabCallback + 49;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void b(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity) throws Throwable {
            String strIntern;
            int i2 = 2 % 2;
            if (TenqubeDetailWebViewActivity.access$getWebView$p(tenqubeDetailWebViewActivity) == null) {
                Object[] objArr = new Object[1];
                e((char) (65056 - KeyEvent.normalizeMetaState(0)), (-223603546) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{33682}, new char[]{0, 0, 0, 0}, new char[]{42520, 44052, 8434, 37374}, objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                WebView webViewAccess$getWebView$p = TenqubeDetailWebViewActivity.access$getWebView$p(tenqubeDetailWebViewActivity);
                if (webViewAccess$getWebView$p == null) {
                    int i3 = IAuthTabCallback + 29;
                    onExtraCallbackWithResult = i3 % 128;
                    Object obj = null;
                    if (i3 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        obj.hashCode();
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    webViewAccess$getWebView$p = null;
                }
                if (webViewAccess$getWebView$p.getUrl() != null) {
                    int i4 = onExtraCallbackWithResult + 101;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    Object[] objArr2 = new Object[1];
                    e((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 18013), (-701546553) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{21477}, new char[]{0, 0, 0, 0}, new char[]{50821, 12095, 23766, 23878}, objArr2);
                    strIntern = ((String) objArr2[0]).intern();
                }
            }
            TenqubeDetailWebViewActivity.access$callJavaScriptCallback(tenqubeDetailWebViewActivity, "onPageLoaded", strIntern);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void c(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity) throws Throwable {
            int i2 = 2 % 2;
            TenqubeDetailWebViewActivity.access$setBackButtonListenerRegistered$p(tenqubeDetailWebViewActivity, true);
            ImageView imageView = (ImageView) tenqubeDetailWebViewActivity.findViewById(R.id.tnk_rwd_iv_back);
            if (imageView != null) {
                int i3 = onExtraCallbackWithResult + 105;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                imageView.setVisibility(0);
                int i5 = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 5 / 4;
                }
            }
            Object[] objArr = new Object[1];
            e((char) ((-16759204) - Color.rgb(0, 0, 0)), ((byte) KeyEvent.getModifierMetaStateMask()) - 701546553, new char[]{21477}, new char[]{0, 0, 0, 0}, new char[]{50821, 12095, 23766, 23878}, objArr);
            TenqubeDetailWebViewActivity.access$callJavaScriptCallback(tenqubeDetailWebViewActivity, "registerBackButtonListener", ((String) objArr[0]).intern());
        }

        @JavascriptInterface
        public final void onBackKeyPress() {
            int i2 = 2 % 2;
            if (TenqubeDetailWebViewActivity.access$getWebView$p(TenqubeDetailWebViewActivity.this) != null) {
                WebView webViewAccess$getWebView$p = TenqubeDetailWebViewActivity.access$getWebView$p(TenqubeDetailWebViewActivity.this);
                WebView webView = null;
                if (webViewAccess$getWebView$p == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i3 = onExtraCallbackWithResult + 53;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    webViewAccess$getWebView$p = null;
                }
                if (webViewAccess$getWebView$p.canGoBack()) {
                    WebView webViewAccess$getWebView$p2 = TenqubeDetailWebViewActivity.access$getWebView$p(TenqubeDetailWebViewActivity.this);
                    if (webViewAccess$getWebView$p2 == null) {
                        int i5 = IAuthTabCallback + 113;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 != 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            webView.hashCode();
                            throw null;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        webView = webViewAccess$getWebView$p2;
                    }
                    webView.goBack();
                    int i6 = onExtraCallbackWithResult + 97;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return;
                }
            }
            TenqubeDetailWebViewActivity.this.getOnBackPressedDispatcher().onExtraCallbackWithResult();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void a(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity, String str) {
            int i2 = 2 % 2;
            Intent intent = new Intent((Context) tenqubeDetailWebViewActivity, (Class<?>) TenqubeDetailWebViewActivity.class);
            intent.putExtra(TenqubeDetailWebViewActivity.EXTRA_INITIAL_URL, str);
            tenqubeDetailWebViewActivity.startActivity(intent);
            int i3 = IAuthTabCallback + 41;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final void b(String str, TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity) throws Throwable {
            int i2 = 2 % 2;
            try {
                JSONObject jSONObject = new JSONObject(str);
                Object[] objArr = new Object[1];
                e((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 5680), (-910184426) - (ViewConfiguration.getTouchSlop() >> 8), new char[]{8317, 51496, 22974}, new char[]{0, 0, 0, 0}, new char[]{5635, 49072, 12745, 49174}, objArr);
                String strOptString = jSONObject.optString(((String) objArr[0]).intern(), "");
                Object[] objArr2 = new Object[1];
                e((char) (MotionEvent.axisFromString("") + 1), Color.red(0) + 317213079, new char[]{26832, 6414, 57767, 20344, 833, 61392, 23741}, new char[]{0, 0, 0, 0}, new char[]{38864, 59465, 35602, 4781}, objArr2);
                boolean zOptBoolean = jSONObject.optBoolean(((String) objArr2[0]).intern(), false);
                Intrinsics.checkNotNull(strOptString);
                if (strOptString.length() > 0) {
                    WebView webView = null;
                    if (zOptBoolean) {
                        WebView webViewAccess$getWebView$p = TenqubeDetailWebViewActivity.access$getWebView$p(tenqubeDetailWebViewActivity);
                        if (webViewAccess$getWebView$p == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            int i3 = onExtraCallbackWithResult + 3;
                            IAuthTabCallback = i3 % 128;
                            int i4 = i3 % 2;
                        } else {
                            webView = webViewAccess$getWebView$p;
                        }
                        webView.loadUrl(strOptString);
                        tenqubeDetailWebViewActivity.setClearHistory(true);
                        return;
                    }
                    WebView webViewAccess$getWebView$p2 = TenqubeDetailWebViewActivity.access$getWebView$p(tenqubeDetailWebViewActivity);
                    if (webViewAccess$getWebView$p2 == null) {
                        int i5 = IAuthTabCallback + 65;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        webView = webViewAccess$getWebView$p2;
                    }
                    webView.loadUrl(strOptString);
                }
                int i7 = IAuthTabCallback + 27;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
            } catch (Exception unused) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void b(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity, String str) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            TextView textView = (TextView) tenqubeDetailWebViewActivity.findViewById(R.id.com_tnk_tv_title);
            if (textView != null) {
                int i4 = IAuthTabCallback + 83;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                textView.setText(str);
                if (i5 != 0) {
                    throw null;
                }
            }
            int i6 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }

        private static void e(char c, int i2, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
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
                int i4 = $10 + 97;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b + 1);
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 43, 1451 - (ViewConfiguration.getJumpTapTimeout() >> 16), 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                        if (objOnExtraCallback2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 44, (ViewConfiguration.getPressedStateDuration() >> 16) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        try {
                            Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 23972), Drawable.resolveOpacity(0, 0) + 50, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22938, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            try {
                                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 28 - TextUtils.indexOf((CharSequence) "", '0', 0), AndroidCharacter.getMirror('0') + 12529, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (onWarmupCompleted ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
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
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            String str = new String(cArr6);
            int i6 = $11 + 25;
            $10 = i6 % 128;
            if (i6 % 2 == 0) {
                objArr[0] = str;
            } else {
                int i7 = 55 / 0;
                objArr[0] = str;
            }
        }
    }

    private static String $$c(int i2, short s, int i3) {
        int i4 = (i3 * 4) + 105;
        int i5 = i2 + 4;
        int i6 = s * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        int i8 = -1;
        if (bArr == null) {
            i4 = i5 + (-i4);
            i5 = i5;
        }
        while (true) {
            i8++;
            bArr2[i8] = (byte) i4;
            if (i8 == i7) {
                return new String(bArr2, 0);
            }
            int i9 = i5 + 1;
            i4 += -bArr[i9];
            i5 = i9;
        }
    }

    public static /* synthetic */ void $r8$lambda$KE6Wu840k_IoVSenwOiReZe3sCA(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity, View view) {
        int i2 = 2 % 2;
        int i3 = onTransact + 87;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        onCreate$lambda$3(tenqubeDetailWebViewActivity, view);
        int i5 = IAuthTabCallbackDefault + 17;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void $r8$lambda$Q3EPeADvXBkeOfo2ZwjmA92h2oQ(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity, View view) {
        int i2 = 2 % 2;
        int i3 = onTransact + 5;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        onCreate$lambda$4(tenqubeDetailWebViewActivity, view);
        int i5 = IAuthTabCallbackDefault + 73;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void $r8$lambda$Sx3J0QlruKiZRI0JRKWp9iSrWyk(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 79;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        onCreate$lambda$2(tenqubeDetailWebViewActivity, iEngagementSignalsCallbackDefault);
        int i5 = onTransact + 25;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void $r8$lambda$_q7rXNdpcV4E_6RjrcA2rTZpW20(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity, String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 35;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        callJavaScriptCallback$lambda$6(tenqubeDetailWebViewActivity, str);
        if (i4 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void $r8$lambda$pQGcJ9ekOs2bN0tNRxSJQgXKN1Q(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity, String str) {
        int i2 = 2 % 2;
        int i3 = onTransact + 39;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        callJavaScriptCallback$lambda$7(tenqubeDetailWebViewActivity, str);
        if (i4 == 0) {
            int i5 = 49 / 0;
        }
        int i6 = onTransact + 47;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ CharSequence $r8$lambda$x77E7QnsO9Rx7_sQKfSfLRUdmIE(String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 41;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return callJavaScriptCallback$lambda$5(str);
        }
        callJavaScriptCallback$lambda$5(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallbackStub = 0;
        onExtraCallback();
        Companion = new Companion(null);
        int i2 = asInterface + 79;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access$callJavaScriptCallback(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity, String str) {
        int i2 = 2 % 2;
        int i3 = onTransact + 35;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        tenqubeDetailWebViewActivity.callJavaScriptCallback(str);
        int i5 = IAuthTabCallbackDefault + 105;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ boolean access$getBackKeyListenerRegistered$p(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 77;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        boolean z = tenqubeDetailWebViewActivity.backKeyListenerRegistered;
        int i6 = i4 + 47;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public static final /* synthetic */ IEngagementSignalsCallback_Parcel access$getFileChooserLauncher$p(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity) {
        int i2 = 2 % 2;
        int i3 = onTransact + 35;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        int i5 = i3 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = tenqubeDetailWebViewActivity.fileChooserLauncher;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 117;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return iEngagementSignalsCallback_Parcel;
        }
        throw null;
    }

    public static final /* synthetic */ WebView access$getWebView$p(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity) {
        int i2 = 2 % 2;
        int i3 = onTransact + 5;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        WebView webView = tenqubeDetailWebViewActivity.webView;
        if (i4 != 0) {
            return webView;
        }
        throw null;
    }

    public static final /* synthetic */ void access$openExternally(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity, Uri uri) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 39;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        tenqubeDetailWebViewActivity.openExternally(uri);
        int i5 = IAuthTabCallbackDefault + 73;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$setBackButtonListenerRegistered$p(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity, boolean z) {
        int i2 = 2 % 2;
        int i3 = onTransact + 19;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        int i5 = i3 % 2;
        tenqubeDetailWebViewActivity.backButtonListenerRegistered = z;
        int i6 = i4 + 49;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 9 / 0;
        }
    }

    public static final /* synthetic */ void access$setBackKeyListenerRegistered$p(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity, boolean z) {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 69;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        tenqubeDetailWebViewActivity.backKeyListenerRegistered = z;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i3 + 5;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 77 / 0;
        }
    }

    public static final /* synthetic */ void access$setFilePathCallback$p(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity, ValueCallback valueCallback) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 97;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        tenqubeDetailWebViewActivity.filePathCallback = valueCallback;
        int i6 = i4 + 17;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ boolean access$shouldOpenExternally(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity, Uri uri) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 43;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        boolean zShouldOpenExternally = tenqubeDetailWebViewActivity.shouldOpenExternally(uri);
        int i5 = IAuthTabCallbackDefault + 97;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return zShouldOpenExternally;
    }

    public static final /* synthetic */ boolean access$tryHandleSpecialSchemes(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity, Uri uri) throws URISyntaxException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 43;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        boolean zTryHandleSpecialSchemes = tenqubeDetailWebViewActivity.tryHandleSpecialSchemes(uri);
        if (i4 != 0) {
            int i5 = 54 / 0;
        }
        return zTryHandleSpecialSchemes;
    }

    private static final CharSequence callJavaScriptCallback$lambda$5(String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = "'" + str + "'";
        int i3 = onTransact + 119;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return str2;
    }

    private static final void callJavaScriptCallback$lambda$6(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity, String str) {
        int i2 = 2 % 2;
        WebView webView = tenqubeDetailWebViewActivity.webView;
        if (webView == null) {
            int i3 = IAuthTabCallbackDefault + 27;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = onTransact + 81;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            webView = null;
        }
        webView.evaluateJavascript(str, null);
        int i7 = onTransact + 123;
        IAuthTabCallbackDefault = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private static final void callJavaScriptCallback$lambda$7(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity, String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 59;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        WebView webView = tenqubeDetailWebViewActivity.webView;
        if (webView == null) {
            int i6 = i4 + 81;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i7 == 0) {
                throw null;
            }
            webView = null;
        }
        webView.evaluateJavascript(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onCreate$lambda$4(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity, View view) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 95;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        tenqubeDetailWebViewActivity.finish();
        if (i4 != 0) {
            int i5 = 27 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void openExternally(Uri uri) {
        int i2 = 2 % 2;
        try {
            startActivity(new Intent("android.intent.action.VIEW", uri));
            int i3 = onTransact + 23;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (ActivityNotFoundException unused) {
        }
    }

    public final boolean getClearHistory() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 33;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.clearHistory;
        if (i4 != 0) {
            int i5 = 61 / 0;
        }
        return z;
    }

    public final void setClearHistory(boolean z) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 113;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        this.clearHistory = z;
        if (i5 != 0) {
            int i6 = 19 / 0;
        }
        int i7 = i4 + 25;
        IAuthTabCallbackDefault = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 26 / 0;
        }
    }

    public static final /* synthetic */ void access$callJavaScriptCallback(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity, String str, String... strArr) {
        int i2 = 2 % 2;
        int i3 = onTransact + 83;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        tenqubeDetailWebViewActivity.callJavaScriptCallback(str, strArr);
        int i5 = onTransact + 51;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, "https") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, "https") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        r7 = com.tnkfactory.ad.TenqubeDetailWebViewActivity.IAuthTabCallbackDefault + 25;
        com.tnkfactory.ad.TenqubeDetailWebViewActivity.onTransact = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
      0x0020: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v11 java.lang.String) binds: [B:8:0x001e, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean shouldOpenExternally(Uri uri) {
        String scheme;
        int i2 = 2 % 2;
        int i3 = onTransact + 121;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            scheme = uri.getScheme();
            int i4 = 72 / 0;
            if (scheme != null) {
                String lowerCase = scheme.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (lowerCase != null) {
                    int i5 = IAuthTabCallbackDefault + 11;
                    onTransact = i5 % 128;
                    int i6 = i5 % 2;
                    if (!Intrinsics.areEqual(lowerCase, "http")) {
                        int i7 = onTransact + 43;
                        IAuthTabCallbackDefault = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i8 = 16 / 0;
                        }
                    }
                    if (!(!isAllowedDomain(uri.getHost()))) {
                        int i9 = IAuthTabCallbackDefault + 117;
                        onTransact = i9 % 128;
                        int i10 = i9 % 2;
                        return false;
                    }
                }
            }
        } else {
            scheme = uri.getScheme();
            if (scheme != null) {
            }
        }
        return true;
    }

    public void onDestroy() {
        ViewGroup viewGroup;
        int i2 = 2 % 2;
        WebView webView = this.webView;
        if (webView != null) {
            ViewParent parent = webView.getParent();
            WebView webView2 = null;
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            } else {
                int i3 = IAuthTabCallbackDefault + 75;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                viewGroup = null;
            }
            if (viewGroup != null) {
                int i5 = onTransact + 51;
                int i6 = i5 % 128;
                IAuthTabCallbackDefault = i6;
                int i7 = i5 % 2;
                WebView webView3 = this.webView;
                if (webView3 == null) {
                    int i8 = i6 + 5;
                    onTransact = i8 % 128;
                    if (i8 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i9 = 97 / 0;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    webView3 = null;
                }
                viewGroup.removeView(webView3);
            }
            WebView webView4 = this.webView;
            if (webView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                webView2 = webView4;
            }
            webView2.destroy();
        }
        super.onDestroy();
    }

    private final void callJavaScriptCallback(String str, String... strArr) {
        int i2 = 2 % 2;
        new Handler(Looper.getMainLooper()).post(new TenqubeDetailWebViewActivity$.ExternalSyntheticLambda1(this, StringsKt.trimIndent("\n            if (window.nativeCallback && typeof window.nativeCallback." + str + " === 'function') {\n                window.nativeCallback." + str + "(" + ArraysKt.joinToString$default(strArr, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new TenqubeDetailWebViewActivity$.ExternalSyntheticLambda0(), 30, (Object) null) + ");\n            }\n        ")));
        int i3 = onTransact + 87;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final void onCreate$lambda$2(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i2 = 2 % 2;
        int i3 = onTransact + 85;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        ValueCallback<Uri[]> valueCallback = tenqubeDetailWebViewActivity.filePathCallback;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(iEngagementSignalsCallbackDefault.onNavigationEvent(), iEngagementSignalsCallbackDefault.onExtraCallbackWithResult()));
        }
        tenqubeDetailWebViewActivity.filePathCallback = null;
        int i5 = onTransact + 1;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onCreate$lambda$3(TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity, View view) {
        int i2 = 2 % 2;
        if (tenqubeDetailWebViewActivity.backButtonListenerRegistered) {
            int i3 = IAuthTabCallbackDefault + 43;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            tenqubeDetailWebViewActivity.callJavaScriptCallback("onBackKeyPress");
            int i5 = IAuthTabCallbackDefault + 107;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        WebView webView = tenqubeDetailWebViewActivity.webView;
        if (webView == null || !webView.canGoBack()) {
            tenqubeDetailWebViewActivity.finish();
            return;
        }
        int i7 = IAuthTabCallbackDefault + 107;
        onTransact = i7 % 128;
        WebView webView2 = null;
        if (i7 % 2 != 0) {
            WebView webView3 = tenqubeDetailWebViewActivity.webView;
            throw null;
        }
        WebView webView4 = tenqubeDetailWebViewActivity.webView;
        if (webView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            webView2 = webView4;
        }
        webView2.goBack();
        int i8 = onTransact + 55;
        IAuthTabCallbackDefault = i8 % 128;
        int i9 = i8 % 2;
    }

    private final void callJavaScriptCallback(String str) {
        int i2 = 2 % 2;
        final String strTrimIndent = StringsKt.trimIndent("\n            if (window.nativeCallback && typeof window.nativeCallback." + str + " === 'function') {\n                window.nativeCallback." + str + "();\n            }\n        ");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tnkfactory.ad.TenqubeDetailWebViewActivity$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                TenqubeDetailWebViewActivity.$r8$lambda$pQGcJ9ekOs2bN0tNRxSJQgXKN1Q(this.f$0, strTrimIndent);
            }
        });
        int i3 = IAuthTabCallbackDefault + 25;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean tryHandleSpecialSchemes(Uri uri) throws URISyntaxException {
        int i2 = 2 % 2;
        int i3 = onTransact + 29;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        String scheme = uri.getScheme();
        if (scheme == null) {
            scheme = "";
        }
        String lowerCase = scheme.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (!Intrinsics.areEqual(lowerCase, "intent")) {
            if (!Intrinsics.areEqual(lowerCase, "market")) {
                return false;
            }
            int i5 = onTransact + 7;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            openExternally(uri);
            return true;
        }
        int i7 = onTransact + 63;
        IAuthTabCallbackDefault = i7 % 128;
        int i8 = i7 % 2;
        try {
            Intent uri2 = Intent.parseUri(uri.toString(), 1);
            try {
                startActivity(uri2);
                return true;
            } catch (ActivityNotFoundException unused) {
                String str = uri2.getPackage();
                if (str != null) {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
                    int i9 = onTransact + 91;
                    IAuthTabCallbackDefault = i9 % 128;
                    int i10 = i9 % 2;
                }
                return true;
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i2, int i3, char[] cArr, boolean z, int i4, Object[] objArr) throws Throwable {
        int i5;
        int i6;
        Throwable cause;
        int i7 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i5 = -1;
            i6 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i4 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(asBinder)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 22 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getLongPressTimeout() >> 16) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 12843), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 55, TextUtils.getCapsMode("", 0, 0) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            int i9 = $11 + 19;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i11 = $10 + 45;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) i5;
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 12843), 55 - Color.red(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i5 = -1;
                i6 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i2 = 2 % 2;
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        WebView webView = null;
        IAuthTabCallbackStubProxy.onWarmupCompleted(this, (ICustomTabsService) null, (ICustomTabsService) null, 3, (Object) null);
        setContentView(R.layout.com_tnk_offerwall_tenqube_webview);
        this.fileChooserLauncher = registerForActivityResult(new IPostMessageService_Parcel.asInterface(), new onSessionEnded() { // from class: com.tnkfactory.ad.TenqubeDetailWebViewActivity$$ExternalSyntheticLambda3
            public final void onActivityResult(Object obj) {
                TenqubeDetailWebViewActivity.$r8$lambda$Sx3J0QlruKiZRI0JRKWp9iSrWyk(this.f$0, (IEngagementSignalsCallbackDefault) obj);
            }
        });
        this.webView = (WebView) findViewById(R.id.com_tnk_off_detail_webview);
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager cookieManager = CookieManager.getInstance();
        WebView webView2 = this.webView;
        if (webView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView2 = null;
        }
        cookieManager.setAcceptThirdPartyCookies(webView2, true);
        WebView webView3 = this.webView;
        if (webView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView3 = null;
        }
        final WebSettings settings = webView3.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "");
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setUserAgentString(settings.getUserAgentString() + " AllowedDomainWebView/1.0");
        settings.setMixedContentMode(0);
        if (SegmentedButtonKtExternalSyntheticLambda5.IAuthTabCallback("FORCE_DARK")) {
            SegmentedButtonKtExternalSyntheticLambda1.onExtraCallbackWithResult(settings, 1);
        }
        WebView webView4 = this.webView;
        if (webView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView4 = null;
        }
        webView4.setWebViewClient(new WebViewClient() { // from class: com.tnkfactory.ad.TenqubeDetailWebViewActivity.onCreate.2
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView5, String str) {
                super.onPageFinished(webView5, str);
                if (TenqubeDetailWebViewActivity.this.getClearHistory()) {
                    WebView webViewAccess$getWebView$p = TenqubeDetailWebViewActivity.access$getWebView$p(TenqubeDetailWebViewActivity.this);
                    if (webViewAccess$getWebView$p == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        webViewAccess$getWebView$p = null;
                    }
                    webViewAccess$getWebView$p.clearHistory();
                    TenqubeDetailWebViewActivity.this.setClearHistory(false);
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView5, WebResourceRequest webResourceRequest) {
                Uri url;
                if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
                    return false;
                }
                if (TenqubeDetailWebViewActivity.access$tryHandleSpecialSchemes(TenqubeDetailWebViewActivity.this, url)) {
                    return true;
                }
                if (!TenqubeDetailWebViewActivity.access$shouldOpenExternally(TenqubeDetailWebViewActivity.this, url)) {
                    return false;
                }
                TenqubeDetailWebViewActivity.access$openExternally(TenqubeDetailWebViewActivity.this, url);
                return true;
            }
        });
        WebView webView5 = this.webView;
        if (webView5 == null) {
            int i3 = onTransact + 1;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView5 = null;
        }
        webView5.setWebChromeClient(new WebChromeClient() { // from class: com.tnkfactory.ad.TenqubeDetailWebViewActivity.onCreate.3
            @Override // android.webkit.WebChromeClient
            public void onCloseWindow(WebView webView6) {
                if (webView6 != null) {
                    try {
                        webView6.destroy();
                    } catch (Throwable unused) {
                    }
                }
                super.onCloseWindow(webView6);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView webView6, boolean z, boolean z2, Message message) {
                WebView webView7 = new WebView(TenqubeDetailWebViewActivity.this);
                WebSettings webSettings = settings;
                final TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity = TenqubeDetailWebViewActivity.this;
                webSettings.setJavaScriptEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setSupportMultipleWindows(true);
                webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
                webView7.setWebViewClient(new WebViewClient() { // from class: com.tnkfactory.ad.TenqubeDetailWebViewActivity$onCreate$3$onCreateWindow$temp$1$1
                    @Override // android.webkit.WebViewClient
                    public void onPageStarted(WebView webView8, String str, Bitmap bitmap) {
                        if (str == null) {
                            str = "about:blank";
                        }
                        Uri uri = Uri.parse(str);
                        TenqubeDetailWebViewActivity tenqubeDetailWebViewActivity2 = tenqubeDetailWebViewActivity;
                        Intrinsics.checkNotNull(uri);
                        try {
                            if (TenqubeDetailWebViewActivity.access$tryHandleSpecialSchemes(tenqubeDetailWebViewActivity2, uri)) {
                                if (webView8 != null) {
                                    webView8.destroy();
                                    return;
                                }
                                return;
                            }
                            if (TenqubeDetailWebViewActivity.access$shouldOpenExternally(tenqubeDetailWebViewActivity, uri)) {
                                TenqubeDetailWebViewActivity.access$openExternally(tenqubeDetailWebViewActivity, uri);
                            } else {
                                WebView webViewAccess$getWebView$p = TenqubeDetailWebViewActivity.access$getWebView$p(tenqubeDetailWebViewActivity);
                                if (webViewAccess$getWebView$p == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                    webViewAccess$getWebView$p = null;
                                }
                                webViewAccess$getWebView$p.loadUrl(str);
                            }
                            if (webView8 != null) {
                                webView8.destroy();
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
                Object obj = message != null ? message.obj : null;
                WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
                if (webViewTransport == null) {
                    return false;
                }
                webViewTransport.setWebView(webView7);
                message.sendToTarget();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView6, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                Intent intent;
                TenqubeDetailWebViewActivity.access$setFilePathCallback$p(TenqubeDetailWebViewActivity.this, valueCallback);
                if (fileChooserParams == null || (intent = fileChooserParams.createIntent()) == null) {
                    intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.addCategory("android.intent.category.OPENABLE");
                    intent.setType("*/*");
                }
                try {
                    IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_ParcelAccess$getFileChooserLauncher$p = TenqubeDetailWebViewActivity.access$getFileChooserLauncher$p(TenqubeDetailWebViewActivity.this);
                    if (iEngagementSignalsCallback_ParcelAccess$getFileChooserLauncher$p == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        iEngagementSignalsCallback_ParcelAccess$getFileChooserLauncher$p = null;
                    }
                    iEngagementSignalsCallback_ParcelAccess$getFileChooserLauncher$p.onNavigationEvent(intent);
                    return true;
                } catch (Exception unused) {
                    TenqubeDetailWebViewActivity.access$setFilePathCallback$p(TenqubeDetailWebViewActivity.this, null);
                    return false;
                }
            }
        });
        WebView webView6 = this.webView;
        if (webView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView6 = null;
        }
        webView6.addJavascriptInterface(new NativeBridge(), "nativeBridge");
        getOnBackPressedDispatcher().onExtraCallbackWithResult(this, new OnBackPressedCallback() { // from class: com.tnkfactory.ad.TenqubeDetailWebViewActivity.onCreate.4
            {
                super(true);
            }

            public void handleOnBackPressed() {
                if (TenqubeDetailWebViewActivity.access$getBackKeyListenerRegistered$p(TenqubeDetailWebViewActivity.this)) {
                    TenqubeDetailWebViewActivity.access$callJavaScriptCallback(TenqubeDetailWebViewActivity.this, "onBackKeyPress");
                    return;
                }
                if (TenqubeDetailWebViewActivity.access$getWebView$p(TenqubeDetailWebViewActivity.this) != null) {
                    WebView webViewAccess$getWebView$p = TenqubeDetailWebViewActivity.access$getWebView$p(TenqubeDetailWebViewActivity.this);
                    WebView webView7 = null;
                    if (webViewAccess$getWebView$p == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        webViewAccess$getWebView$p = null;
                    }
                    if (webViewAccess$getWebView$p.canGoBack()) {
                        WebView webViewAccess$getWebView$p2 = TenqubeDetailWebViewActivity.access$getWebView$p(TenqubeDetailWebViewActivity.this);
                        if (webViewAccess$getWebView$p2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        } else {
                            webView7 = webViewAccess$getWebView$p2;
                        }
                        webView7.goBack();
                        return;
                    }
                }
                setEnabled(false);
                TenqubeDetailWebViewActivity.this.getOnBackPressedDispatcher().onExtraCallbackWithResult();
            }
        });
        ImageView imageView = (ImageView) findViewById(R.id.tnk_rwd_iv_back);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.TenqubeDetailWebViewActivity$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TenqubeDetailWebViewActivity.$r8$lambda$KE6Wu840k_IoVSenwOiReZe3sCA(this.f$0, view);
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.com_tnk_off_iv_detail_close);
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.TenqubeDetailWebViewActivity$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TenqubeDetailWebViewActivity.$r8$lambda$Q3EPeADvXBkeOfo2ZwjmA92h2oQ(this.f$0, view);
                }
            });
            int i5 = IAuthTabCallbackDefault + 123;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
        String stringExtra = getIntent().getStringExtra(EXTRA_INITIAL_URL);
        if (stringExtra == null) {
            Object[] objArr = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132020933).substring(0, 2).codePointAt(1) + 22, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 53, new char[]{'!', 19, ' ', '$', 23, 17, 19, 65501, 65517, '#', '!', 19, ' ', 65527, 18, 65515, '#', 23, 18, 65492, 17, 26, 23, 19, 28, '\"', 1, 19, '!', '!', 23, 29, 28, 65527, 18, 65515, 65502, 65502, 65502, 65502, 65502, 65502, 65502, 65502, 65499, 65502, 65502, 65502, 65502, 65499, 65502, 65502, 65502, 65502, 65499, 65502, 65502, 65502, 65502, 65499, 65502, 65502, 65502, 65502, 65502, 65502, 65502, 65502, 65502, 65502, 65502, 65502, 22, '\"', '\"', 30, '!', 65512, 65501, 65501, ' ', 19, '%', 15, ' ', 18, 65499, 17, 22, 15, 28, 28, 19, 26, 65499, '%', 19, 16, '$', 23, 19, '%', 65500, ' ', 19, '%', 15, ' ', 18, 65500, '\"', 19, 28, 31, '#', 16, 19, 65500, 17, 29, 27, 65501}, false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132020933).substring(0, 2).length() + 248, objArr);
            stringExtra = ((String) objArr[0]).intern();
            int i7 = onTransact + 47;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 / 5;
            }
        }
        WebView webView7 = this.webView;
        if (webView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            webView = webView7;
        }
        webView.loadUrl(stringExtra);
    }

    private final boolean isAllowedDomain(String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 37;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (lowerCase != null) {
                Set<String> set = this.allowedDomains;
                if (set instanceof Collection) {
                    int i5 = IAuthTabCallbackDefault + 73;
                    onTransact = i5 % 128;
                    int i6 = i5 % 2;
                    if (set.isEmpty()) {
                        int i7 = onTransact + 9;
                        IAuthTabCallbackDefault = i7 % 128;
                        int i8 = i7 % 2;
                        return false;
                    }
                }
                for (String str2 : set) {
                    if (!Intrinsics.areEqual(lowerCase, str2)) {
                        if (StringsKt.endsWith$default(lowerCase, "." + str2, false, 2, (Object) null)) {
                        }
                    }
                    int i9 = IAuthTabCallbackDefault + 63;
                    onTransact = i9 % 128;
                    int i10 = i9 % 2;
                    return true;
                }
            }
        }
        return false;
    }

    public void onStart() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 71;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        super.onStart();
        int i5 = IAuthTabCallbackDefault + 81;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
    }

    public void onResume() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 79;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        super.onResume();
        int i5 = onTransact + 111;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public void onPause() {
        int i2 = 2 % 2;
        int i3 = onTransact + 105;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        super.onPause();
        int i5 = IAuthTabCallbackDefault + 25;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void attachBaseContext(Context context) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 37;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        super.attachBaseContext(context);
        if (i4 != 0) {
            throw null;
        }
        int i5 = onTransact + 49;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static void onExtraCallback() {
        asBinder = 478308993;
    }
}
