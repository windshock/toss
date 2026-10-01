package im.toss.rn.toss.core.webview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.rn.toss.core.webview.TossAppServiceWebViewProvider$;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$$ExternalSyntheticLambda3;
import im.toss.webview.TossWebView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.IconRoundCornerProgressBar1;
import o.SavedStateConfiguration_androidKtExternalSyntheticLambda0;
import o.convertStacktracebugsnag_android_core_release;
import o.drawFocusCircle;
import o.getKeyTemplate;
import o.getOptimalPreviewSize;
import o.getTextProgressSize;
import o.hasVaryAll;
import o.removeUIManagerEventListener;
import o.roundedRect;
import o.setCircleColor;
import o.setParallaxDistance;
import o.setShadowDrawable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TossAppServiceWebViewProvider implements setShadowDrawable {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int IAuthTabCallbackStub = 0;
    private static int access100 = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;
    private static volatile TossAppServiceWebViewProvider onWarmupCompleted;
    private final Map<View, String> IAuthTabCallback;
    private final Handler IAuthTabCallbackDefault;
    private final Map<View, View> asInterface;
    private final Map<View, Boolean> onExtraCallback;
    private final Map<View, WebViewContentOwner> onExtraCallbackWithResult;
    private final Map<View, TossWebView> onNavigationEvent;

    static {
        int i = access100 + 21;
        asBinder = i % 128;
        if (i % 2 != 0) {
            int i2 = 20 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = i7 | i;
        int i9 = (~i8) | (~(i7 | i6));
        int i10 = (~((~i6) | i7 | (~i))) | (~(i4 | i));
        int i11 = i4 + i + i2 + ((-540997959) * i5) + (162607451 * i3);
        int i12 = i11 * i11;
        int i13 = ((-612843245) * i4) + 1723858944 + (1667710703 * i) + (i9 * (-1007206674)) + (1007206674 * i8) + ((-1007206674) * i10) + ((-1620049920) * i2) + ((-672137216) * i5) + (483393536 * i3) + (377683968 * i12);
        int i14 = (i4 * 228155117) + 240245784 + (i * 228155665) + (i9 * 274) + (i8 * (-274)) + (i10 * 274) + (i2 * 228155391) + (i5 * (-329950905)) + (i3 * (-2026639707)) + (i12 * 159186944);
        int i15 = i13 + (i14 * i14 * (-1451425792));
        return i15 != 1 ? i15 != 2 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ void onExtraCallback(TossWebView tossWebView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(tossWebView);
        int i4 = onTransact + 93;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        WebView webView = (WebView) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(webView);
        }
        onWarmupCompleted(webView);
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function0);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onTransact + 93;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onExtraCallbackWithResult(@NotNull getKeyTemplate getkeytemplate, @NotNull View view) {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getkeytemplate, "");
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
    }

    public TossAppServiceWebViewProvider() {
        Map<View, String> mapSynchronizedMap = Collections.synchronizedMap(new WeakHashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "");
        this.IAuthTabCallback = mapSynchronizedMap;
        Map<View, WebViewContentOwner> mapSynchronizedMap2 = Collections.synchronizedMap(new WeakHashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap2, "");
        this.onExtraCallbackWithResult = mapSynchronizedMap2;
        Map<View, Boolean> mapSynchronizedMap3 = Collections.synchronizedMap(new WeakHashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap3, "");
        this.onExtraCallback = mapSynchronizedMap3;
        Map<View, TossWebView> mapSynchronizedMap4 = Collections.synchronizedMap(new WeakHashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap4, "");
        this.onNavigationEvent = mapSynchronizedMap4;
        Map<View, View> mapSynchronizedMap5 = Collections.synchronizedMap(new WeakHashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap5, "");
        this.asInterface = mapSynchronizedMap5;
        this.IAuthTabCallbackDefault = new Handler(Looper.getMainLooper());
    }

    public static final /* synthetic */ void IAuthTabCallback(TossAppServiceWebViewProvider tossAppServiceWebViewProvider) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted = tossAppServiceWebViewProvider;
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        int i5 = onTransact + 29;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Map onExtraCallback(TossAppServiceWebViewProvider tossAppServiceWebViewProvider) {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        Map<View, View> map = tossAppServiceWebViewProvider.asInterface;
        int i5 = i3 + 123;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        throw null;
    }

    public static final /* synthetic */ TossAppServiceWebViewProvider onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Map onNavigationEvent(TossAppServiceWebViewProvider tossAppServiceWebViewProvider) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 39;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Map<View, Boolean> map = tossAppServiceWebViewProvider.onExtraCallback;
        int i5 = i2 + 31;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return map;
    }

    public static final /* synthetic */ Map onWarmupCompleted(TossAppServiceWebViewProvider tossAppServiceWebViewProvider) {
        int i = 2 % 2;
        int i2 = onTransact + 99;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        Map<View, String> map = tossAppServiceWebViewProvider.IAuthTabCallback;
        int i5 = i3 + 17;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public static final class asBinder implements View.OnAttachStateChangeListener {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ View IAuthTabCallback;
        final /* synthetic */ TossWebView onExtraCallback;
        final /* synthetic */ View onWarmupCompleted;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }

        public asBinder(View view, TossWebView tossWebView, View view2) {
            this.IAuthTabCallback = view;
            this.onExtraCallback = tossWebView;
            this.onWarmupCompleted = view2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            this.IAuthTabCallback.removeOnAttachStateChangeListener(this);
            this.onExtraCallback.addJavascriptInterface(new onWarmupCompleted(this.onWarmupCompleted), "TossRNApp");
            int i2 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    private static final void onNavigationEvent(TossWebView tossWebView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        tossWebView.reload();
        int i4 = IAuthTabCallbackStub + 51;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public View onExtraCallbackWithResult(@NotNull final Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        TossWebView tossWebView = new TossWebView(context) { // from class: im.toss.rn.toss.core.webview.TossAppServiceWebViewProvider$createWebView$webView$1
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;
            final /* synthetic */ Context onExtraCallbackWithResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context);
                this.onExtraCallbackWithResult = context;
            }

            public drawFocusCircle onExtraCallback() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 119;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                if (hasVaryAll.IAuthTabCallback(this.onExtraCallbackWithResult) == null) {
                    return null;
                }
                drawFocusCircle drawfocuscircleOnExtraCallback = super/*im.toss.core.webkit.TossBridgeWebView*/.onExtraCallback();
                int i5 = onNavigationEvent + 103;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 98 / 0;
                }
                return drawfocuscircleOnExtraCallback;
            }
        };
        WebSettings settings = tossWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSupportMultipleWindows(true);
        tossWebView.setWebViewClient(onExtraCallbackWithResult((WebView) tossWebView));
        tossWebView.setWebChromeClient(onWarmupCompleted(context));
        SwipeRefreshLayout swipeRefreshLayout = new SwipeRefreshLayout(context);
        swipeRefreshLayout.addView(tossWebView, new ViewGroup.LayoutParams(-1, -1));
        swipeRefreshLayout.setEnabled(false);
        swipeRefreshLayout.setOnRefreshListener(new TossAppServiceWebViewProvider$.ExternalSyntheticLambda0(tossWebView));
        this.onNavigationEvent.put(swipeRefreshLayout, tossWebView);
        this.asInterface.put(tossWebView, swipeRefreshLayout);
        onWarmupCompleted(context, tossWebView, swipeRefreshLayout);
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onExtraCallback(1995703234, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1995703233, iOnExtraCallback3, new Object[]{this, context, tossWebView, swipeRefreshLayout}, iOnExtraCallback);
        int i2 = IAuthTabCallbackStub + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return swipeRefreshLayout;
    }

    public static final class IAuthTabCallback extends convertStacktracebugsnag_android_core_release {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ TossWebView onExtraCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(ServiceWebViewContentOwner serviceWebViewContentOwner, TossWebView tossWebView) {
            super(serviceWebViewContentOwner, tossWebView, (getTextProgressSize) null, 4, (DefaultConstructorMarker) null);
            this.onExtraCallback = tossWebView;
        }

        public String onWarmupCompleted(String str, boolean z, String str2, boolean z2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            String str3 = (String) removeUIManagerEventListener.onWarmupCompleted(ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{removeUIManagerEventListener.onExtraCallbackWithResult, str, Boolean.valueOf(z), str2, this.onExtraCallback, Boolean.valueOf(z2)}, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), 967756226, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), -967756226);
            int i3 = onWarmupCompleted + 59;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return str3;
        }

        public String onExtraCallback(String str, String str2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                removeUIManagerEventListener.onExtraCallbackWithResult.onWarmupCompleted(str, str2, this.onExtraCallback);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            String strOnWarmupCompleted = removeUIManagerEventListener.onExtraCallbackWithResult.onWarmupCompleted(str, str2, this.onExtraCallback);
            int i3 = onWarmupCompleted + 47;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return strOnWarmupCompleted;
        }
    }

    private final void onWarmupCompleted(Context context, TossWebView tossWebView, SwipeRefreshLayout swipeRefreshLayout) {
        int i = 2 % 2;
        WebViewContentOwner webViewContentOwner = null;
        if (context instanceof WebViewContentOwner) {
            int i2 = onTransact + 47;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                webViewContentOwner.hashCode();
                throw null;
            }
            webViewContentOwner = (WebViewContentOwner) context;
        } else if (context instanceof CredentialProviderGetSignInIntentControllerhandleResponse2) {
            int i3 = IAuthTabCallbackStub + 5;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                ((CredentialProviderGetSignInIntentControllerhandleResponse2) context).getCurrentActivity();
                webViewContentOwner.hashCode();
                throw null;
            }
            Activity currentActivity = ((CredentialProviderGetSignInIntentControllerhandleResponse2) context).getCurrentActivity();
            if (currentActivity != null) {
                WebViewContentOwner webViewContentOwner2 = (currentActivity instanceof WebViewContentOwner) ^ true ? null : (WebViewContentOwner) currentActivity;
                if (webViewContentOwner2 == null) {
                    currentActivity.getClass().getSimpleName();
                } else {
                    webViewContentOwner = webViewContentOwner2;
                }
            }
        } else {
            context.getClass().getSimpleName();
        }
        if (webViewContentOwner != null) {
            WebViewContentOwner serviceWebViewContentOwner = new ServiceWebViewContentOwner(webViewContentOwner, tossWebView, swipeRefreshLayout);
            this.onExtraCallbackWithResult.put(swipeRefreshLayout, serviceWebViewContentOwner);
            tossWebView.setTossJavascriptInterface(new IAuthTabCallback(serviceWebViewContentOwner, tossWebView));
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TossAppServiceWebViewProvider tossAppServiceWebViewProvider = (TossAppServiceWebViewProvider) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TossWebView tossWebView = tossAppServiceWebViewProvider.onNavigationEvent.get(view);
        if (tossWebView != null) {
            int i4 = onTransact + 31;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 38 / 0;
            }
            return tossWebView;
        }
        Object obj = null;
        if (!(view instanceof WebView)) {
            return null;
        }
        WebView webView = (WebView) view;
        int i6 = onTransact + 83;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return webView;
        }
        obj.hashCode();
        throw null;
    }

    public void IAuthTabCallback(@NotNull String str, @NotNull View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(view, "");
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(view, "");
        int iOnExtraCallback4 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback5 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback6 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        WebView webView = (WebView) onExtraCallback(703967123, iOnExtraCallback5, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -703967121, iOnExtraCallback6, new Object[]{this, view}, iOnExtraCallback4);
        if (webView != null) {
            int i3 = onTransact + 87;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            webView.loadUrl(str);
            int i5 = IAuthTabCallbackStub + 117;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = IAuthTabCallbackStub + 99;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 31 / 0;
        }
    }

    public void onExtraCallbackWithResult(@Nullable String str, @NotNull View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        WebView webView = (WebView) onExtraCallback(703967123, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -703967121, iOnExtraCallback3, new Object[]{this, view}, iOnExtraCallback);
        if (webView == null) {
            return;
        }
        if (str == null) {
            this.IAuthTabCallback.remove(webView);
            return;
        }
        int i4 = IAuthTabCallbackStub + 45;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            this.IAuthTabCallback.put(webView, str);
        } else {
            this.IAuthTabCallback.put(webView, str);
            int i5 = 76 / 0;
        }
    }

    public void onWarmupCompleted(@Nullable String str, @NotNull View view) {
        int i = 2 % 2;
        String str2 = "";
        Intrinsics.checkNotNullParameter(view, "");
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        WebView webView = (WebView) onExtraCallback(703967123, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -703967121, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, view}, iOnExtraCallback);
        if (webView != null) {
            int i2 = onTransact + 33;
            IAuthTabCallbackStub = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                webView.getSettings();
                obj.hashCode();
                throw null;
            }
            WebSettings settings = webView.getSettings();
            if (settings != null && str != null) {
                String userAgentString = settings.getUserAgentString();
                if (userAgentString == null) {
                    int i3 = onTransact + 53;
                    int i4 = i3 % 128;
                    IAuthTabCallbackStub = i4;
                    int i5 = i3 % 2;
                    int i6 = i4 + 107;
                    onTransact = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    str2 = userAgentString;
                }
                if (!StringsKt.contains$default(str2, str, false, 2, (Object) null)) {
                    settings.setUserAgentString(StringsKt.trim(str2 + " " + str).toString());
                    int i8 = onTransact + 121;
                    IAuthTabCallbackStub = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
        }
        int i10 = IAuthTabCallbackStub + 29;
        onTransact = i10 % 128;
        int i11 = i10 % 2;
    }

    public void onWarmupCompleted(@Nullable SavedStateConfiguration_androidKtExternalSyntheticLambda0 savedStateConfiguration_androidKtExternalSyntheticLambda0, @NotNull View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        WebView webView = (WebView) onExtraCallback(703967123, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -703967121, iOnExtraCallback3, new Object[]{this, view}, iOnExtraCallback);
        if (webView != null) {
            int i2 = onTransact + 7;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            if (savedStateConfiguration_androidKtExternalSyntheticLambda0 != null) {
                int i5 = i3 + 89;
                onTransact = i5 % 128;
                if (i5 % 2 == 0) {
                    webView.setPadding((int) savedStateConfiguration_androidKtExternalSyntheticLambda0.onExtraCallback(), (int) savedStateConfiguration_androidKtExternalSyntheticLambda0.onWarmupCompleted(), (int) savedStateConfiguration_androidKtExternalSyntheticLambda0.onExtraCallbackWithResult(), (int) savedStateConfiguration_androidKtExternalSyntheticLambda0.onNavigationEvent());
                    throw null;
                }
                webView.setPadding((int) savedStateConfiguration_androidKtExternalSyntheticLambda0.onExtraCallback(), (int) savedStateConfiguration_androidKtExternalSyntheticLambda0.onWarmupCompleted(), (int) savedStateConfiguration_androidKtExternalSyntheticLambda0.onExtraCallbackWithResult(), (int) savedStateConfiguration_androidKtExternalSyntheticLambda0.onNavigationEvent());
            }
        }
        int i6 = IAuthTabCallbackStub + 81;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
    }

    public void IAuthTabCallback(boolean z, @NotNull View view) {
        SwipeRefreshLayout swipeRefreshLayout;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (view instanceof SwipeRefreshLayout) {
            int i2 = onTransact + 69;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            swipeRefreshLayout = (SwipeRefreshLayout) view;
        } else {
            swipeRefreshLayout = null;
        }
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setEnabled(z);
            int i4 = IAuthTabCallbackStub + 73;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 4;
            }
        }
    }

    public void onExtraCallback(@NotNull String str, @NotNull View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(view, "");
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        WebView webView = (WebView) onExtraCallback(703967123, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -703967121, iOnExtraCallback3, new Object[]{this, view}, iOnExtraCallback);
        if (webView != null) {
            int i4 = onTransact + 83;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            webView.evaluateJavascript(str, null);
            int i6 = onTransact + 9;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = onTransact + 123;
        IAuthTabCallbackStub = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    public void onExtraCallback(@NotNull View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        WebView webView = (WebView) onExtraCallback(703967123, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -703967121, iOnExtraCallback3, new Object[]{this, view}, iOnExtraCallback);
        if (webView != null) {
            int i2 = IAuthTabCallbackStub + 35;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            webView.goBack();
            if (i3 == 0) {
                int i4 = 59 / 0;
            }
            int i5 = IAuthTabCallbackStub + 25;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 % 2;
            }
        }
    }

    public void onExtraCallbackWithResult(@NotNull View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        WebView webView = (WebView) onExtraCallback(703967123, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -703967121, iOnExtraCallback3, new Object[]{this, view}, iOnExtraCallback);
        if (webView != null) {
            webView.goForward();
            int i4 = IAuthTabCallbackStub + 103;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public void IAuthTabCallback(@NotNull View view) {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        int iOnExtraCallback4 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback5 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback6 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        WebView webView = (WebView) onExtraCallback(703967123, iOnExtraCallback5, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -703967121, iOnExtraCallback6, new Object[]{this, view}, iOnExtraCallback4);
        if (webView != null) {
            int i3 = IAuthTabCallbackStub + 39;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            webView.reload();
        }
        int i5 = IAuthTabCallbackStub + 121;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void onWarmupCompleted(@NotNull View view) {
        View view2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        WebView webView = (WebView) onExtraCallback(703967123, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -703967121, iOnExtraCallback3, new Object[]{this, view}, iOnExtraCallback);
        this.onNavigationEvent.remove(view);
        this.onExtraCallbackWithResult.remove(view);
        if (webView != null) {
            int i4 = onTransact + 41;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 23 / 0;
            }
            view2 = webView;
        } else {
            view2 = view;
        }
        this.IAuthTabCallback.remove(view2);
        this.onExtraCallback.remove(view2);
        this.asInterface.remove(view2);
        if (webView == null) {
            Objects.toString(view);
        }
        onWarmupCompleted((Function0<Unit>) new TossAppServiceWebViewProvider$.ExternalSyntheticLambda1(webView));
        int i6 = IAuthTabCallbackStub + 41;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final Unit onWarmupCompleted(WebView webView) {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (webView != null) {
            webView.stopLoading();
            webView.removeJavascriptInterface("TossApp");
            webView.removeJavascriptInterface("TossRNApp");
            webView.setWebChromeClient(null);
            webView.destroy();
            int i3 = onTransact + 11;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final void IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        int i4 = IAuthTabCallbackStub + 49;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onWarmupCompleted(Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            this.IAuthTabCallbackDefault.post(new TossAppServiceWebViewProvider$.ExternalSyntheticLambda2(function0));
            return;
        }
        function0.invoke();
        int i4 = onTransact + 45;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent extends roundedRect {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ WeakReference<TossAppServiceWebViewProvider> onExtraCallbackWithResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(WeakReference<TossAppServiceWebViewProvider> weakReference) {
            super((IconRoundCornerProgressBar1) null, 1, (DefaultConstructorMarker) null);
            this.onExtraCallbackWithResult = weakReference;
        }

        public boolean IAuthTabCallbackDefault(WebView webView, Uri uri) {
            Activity currentActivity;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(uri, "");
            CredentialProviderGetSignInIntentControllerhandleResponse2 context = webView.getContext();
            if (context instanceof Activity) {
                int i2 = IAuthTabCallback + 73;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                currentActivity = (Activity) context;
            } else if (context instanceof CredentialProviderGetSignInIntentControllerhandleResponse2) {
                int i3 = IAuthTabCallback + 51;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    context.getCurrentActivity();
                    throw null;
                }
                currentActivity = context.getCurrentActivity();
            } else {
                int i4 = onExtraCallback + 11;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                currentActivity = null;
            }
            if (currentActivity == null) {
                uri.getScheme();
                return false;
            }
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (!onExtraCallback().onExtraCallback(string)) {
                return false;
            }
            return onExtraCallback().onExtraCallbackWithResult(currentActivity, string, (Bundle) null);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(webResourceRequest, "");
            boolean zShouldOverrideUrlLoading = super/*o.ALCFocusCircle*/.shouldOverrideUrlLoading(webView, webResourceRequest);
            int i4 = IAuthTabCallback + 53;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return zShouldOverrideUrlLoading;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            super.onPageStarted(webView, str, bitmap);
            webView.getUrl();
            int i2 = IAuthTabCallback + 59;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        public void onPageFinished(WebView webView, String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            super.onPageFinished(webView, str);
            onExtraCallbackWithResult();
            TossAppServiceWebViewProvider tossAppServiceWebViewProvider = this.onExtraCallbackWithResult.get();
            if (tossAppServiceWebViewProvider == null) {
                return;
            }
            String str2 = (String) TossAppServiceWebViewProvider.onWarmupCompleted(tossAppServiceWebViewProvider).get(webView);
            SwipeRefreshLayout swipeRefreshLayout = null;
            if (str2 != null) {
                webView.evaluateJavascript(str2, null);
            }
            Object obj = TossAppServiceWebViewProvider.onExtraCallback(tossAppServiceWebViewProvider).get(webView);
            if (obj instanceof SwipeRefreshLayout) {
                int i2 = IAuthTabCallback + 13;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    swipeRefreshLayout = (SwipeRefreshLayout) obj;
                    int i3 = 2 / 0;
                } else {
                    swipeRefreshLayout = (SwipeRefreshLayout) obj;
                }
            }
            if (swipeRefreshLayout != null) {
                int i4 = IAuthTabCallback + 67;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    swipeRefreshLayout.setRefreshing(true);
                } else {
                    swipeRefreshLayout.setRefreshing(false);
                }
                int i5 = onExtraCallback + 43;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            View view = (View) TossAppServiceWebViewProvider.onExtraCallback(tossAppServiceWebViewProvider).get(webView);
            if (view == null) {
                view = webView;
            }
            setParallaxDistance.onWarmupCompleted(tossAppServiceWebViewProvider, view);
            onExtraCallback(webView, tossAppServiceWebViewProvider);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(webView, "");
            super/*android.webkit.WebViewClient*/.doUpdateVisitedHistory(webView, str, z);
            TossAppServiceWebViewProvider tossAppServiceWebViewProvider = this.onExtraCallbackWithResult.get();
            if (tossAppServiceWebViewProvider != null) {
                onExtraCallback(webView, tossAppServiceWebViewProvider);
                return;
            }
            int i4 = IAuthTabCallback + 109;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v9, types: [android.view.View] */
        private final void onExtraCallback(WebView webView, TossAppServiceWebViewProvider tossAppServiceWebViewProvider) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean zIAuthTabCallback = getOptimalPreviewSize.IAuthTabCallback(webView);
            Boolean bool = (Boolean) TossAppServiceWebViewProvider.onNavigationEvent(tossAppServiceWebViewProvider).get(webView);
            if (zIAuthTabCallback != (bool != null ? bool.booleanValue() : false)) {
                TossAppServiceWebViewProvider.onNavigationEvent(tossAppServiceWebViewProvider).put(webView, Boolean.valueOf(zIAuthTabCallback));
                ?? r2 = (View) TossAppServiceWebViewProvider.onExtraCallback(tossAppServiceWebViewProvider).get(webView);
                if (r2 != 0) {
                    int i4 = IAuthTabCallback + 5;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    webView = r2;
                }
                setParallaxDistance.onExtraCallback(tossAppServiceWebViewProvider, webView, zIAuthTabCallback);
            }
            int i6 = onExtraCallback + 79;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private final roundedRect onExtraCallbackWithResult(WebView webView) {
        int i = 2 % 2;
        onNavigationEvent onnavigationevent = new onNavigationEvent(new WeakReference(this));
        int i2 = onTransact + 23;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 26 / 0;
        }
        return onnavigationevent;
    }

    public static final class onExtraCallback extends setCircleColor {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        onExtraCallback(setCircleColor.onWarmupCompleted onwarmupcompleted) {
            super(onwarmupcompleted);
        }

        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(message, "");
            Object obj = message.obj;
            WebView.WebViewTransport webViewTransport = null;
            if (!(!(obj instanceof WebView.WebViewTransport))) {
                int i2 = onExtraCallbackWithResult + 19;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                webViewTransport = (WebView.WebViewTransport) obj;
            }
            if (webViewTransport == null) {
                return false;
            }
            WebView webView2 = new WebView(webView.getContext());
            webView2.getSettings().setJavaScriptEnabled(true);
            webViewTransport.setWebView(webView2);
            message.sendToTarget();
            int i3 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
    }

    private final setCircleColor onWarmupCompleted(Context context) {
        int i = 2 % 2;
        onExtraCallback onextracallback = new onExtraCallback(new setCircleColor.onExtraCallback(context, "rn-app-service").IAuthTabCallback());
        int i2 = onTransact + 83;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return onextracallback;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final TossAppServiceWebViewProvider onNavigationEvent() {
            TossAppServiceWebViewProvider tossAppServiceWebViewProviderOnNavigationEvent;
            TossAppServiceWebViewProvider tossAppServiceWebViewProviderOnNavigationEvent2 = TossAppServiceWebViewProvider.onNavigationEvent();
            if (tossAppServiceWebViewProviderOnNavigationEvent2 != null) {
                return tossAppServiceWebViewProviderOnNavigationEvent2;
            }
            synchronized (this) {
                tossAppServiceWebViewProviderOnNavigationEvent = TossAppServiceWebViewProvider.onNavigationEvent();
                if (tossAppServiceWebViewProviderOnNavigationEvent == null) {
                    tossAppServiceWebViewProviderOnNavigationEvent = new TossAppServiceWebViewProvider();
                    onExtraCallbackWithResult onextracallbackwithresult = TossAppServiceWebViewProvider.Companion;
                    TossAppServiceWebViewProvider.IAuthTabCallback(tossAppServiceWebViewProviderOnNavigationEvent);
                }
            }
            return tossAppServiceWebViewProviderOnNavigationEvent;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TossWebView tossWebView = (TossWebView) objArr[2];
        View view = (View) objArr[3];
        int i = 2 % 2;
        int i2 = onTransact + 45;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            tossWebView.isAttachedToWindow();
            obj.hashCode();
            throw null;
        }
        if (tossWebView.isAttachedToWindow()) {
            tossWebView.addJavascriptInterface(new onWarmupCompleted(view), "TossRNApp");
            int i3 = IAuthTabCallbackStub + 47;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        tossWebView.addOnAttachStateChangeListener(new asBinder(tossWebView, tossWebView, view));
        int i4 = onTransact + 53;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallback(WebView webView) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onExtraCallback(3214158, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -3214158, iOnExtraCallback3, new Object[]{webView}, iOnExtraCallback);
    }

    private final WebView onNavigationEvent(View view) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (WebView) onExtraCallback(703967123, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -703967121, iOnExtraCallback3, new Object[]{this, view}, iOnExtraCallback);
    }

    private final void onExtraCallback(Context context, TossWebView tossWebView, View view) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onExtraCallback(1995703234, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1995703233, iOnExtraCallback3, new Object[]{this, context, tossWebView, view}, iOnExtraCallback);
    }
}
