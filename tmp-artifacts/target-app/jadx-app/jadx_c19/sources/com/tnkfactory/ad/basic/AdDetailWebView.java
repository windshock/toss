package com.tnkfactory.ad.basic;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdAnalytics;
import com.tnkfactory.ad.basic.AdDetailWebView;
import com.tnkfactory.ad.rwd.common.TAlertDialog;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdDetailWebView extends DialogFragment {
    public static final Companion Companion;
    private static int onExtraCallback;
    private static int onNavigationEvent;
    public WebView a;
    public ConstraintLayout b;
    public Function0 c;
    public Dialog d;
    private static final byte[] $$a = {80, -19, -87, -22};
    private static final int $$b = 151;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private static int onExtraCallbackWithResult = 0;

    public final class AdWebViewClient extends WebViewClient {
        public AdWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@NotNull WebView webView, @Nullable String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            AdDetailWebView.this.loadDlg(false);
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
            WebView webViewAccess$getWebView$p = AdDetailWebView.access$getWebView$p(AdDetailWebView.this);
            if (webViewAccess$getWebView$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                webViewAccess$getWebView$p = null;
            }
            webViewAccess$getWebView$p.setVisibility(0);
            LinearLayout linearLayoutAccess$getNetworkErrorLayout = AdDetailWebView.access$getNetworkErrorLayout(AdDetailWebView.this);
            if (linearLayoutAccess$getNetworkErrorLayout != null) {
                linearLayoutAccess$getNetworkErrorLayout.setVisibility(8);
            }
            AdDetailWebView.this.loadDlg(true);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@NotNull WebView webView, @NotNull String str) throws Throwable {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (StringsKt.startsWith$default(str, "tnkscheme://", false, 2, (Object) null)) {
                AdDetailWebView adDetailWebView = AdDetailWebView.this;
                Uri uri = Uri.parse(str);
                Intrinsics.checkNotNullExpressionValue(uri, "");
                adDetailWebView.appScheme(uri);
                return true;
            }
            if (!StringsKt.startsWith$default(str, "http", false, 2, (Object) null)) {
                if (!StringsKt.startsWith$default(str, "intent", false, 2, (Object) null)) {
                    PackageManager packageManager = AdDetailWebView.this.requireActivity().getPackageManager();
                    Intrinsics.checkNotNullExpressionValue(packageManager, "");
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(str));
                    if (packageManager.queryIntentActivities(intent, 0).size() > 0) {
                        AdDetailWebView.this.startActivity(intent);
                    }
                    return true;
                }
                try {
                    Intent uri2 = Intent.parseUri(str, 1);
                    try {
                        AdDetailWebView.this.startActivity(uri2);
                        return true;
                    } catch (ActivityNotFoundException unused) {
                        String str2 = uri2.getPackage();
                        if (str2 != null) {
                            AdDetailWebView.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str2)));
                            return true;
                        }
                    }
                } catch (URISyntaxException unused2) {
                    return false;
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@Nullable WebView webView, int i2, @Nullable String str, @Nullable String str2) {
            super.onReceivedError(webView, i2, str, str2);
            AdDetailWebView.this.loadDlg(false);
            if (i2 < 0) {
                WebView webViewAccess$getWebView$p = AdDetailWebView.access$getWebView$p(AdDetailWebView.this);
                if (webViewAccess$getWebView$p == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    webViewAccess$getWebView$p = null;
                }
                webViewAccess$getWebView$p.setVisibility(8);
                LinearLayout linearLayoutAccess$getNetworkErrorLayout = AdDetailWebView.access$getNetworkErrorLayout(AdDetailWebView.this);
                if (linearLayoutAccess$getNetworkErrorLayout != null) {
                    linearLayoutAccess$getNetworkErrorLayout.setVisibility(0);
                }
                TextView textViewAccess$getTvErrorMessage = AdDetailWebView.access$getTvErrorMessage(AdDetailWebView.this);
                if (textViewAccess$getTvErrorMessage != null) {
                    textViewAccess$getTvErrorMessage.setText("네트워크 장애나 알 수 없는 문제로\n페이지를 표시할 수 없습니다.\n새로고침 또는 닫기 후 재진입 부탁드립니다.\ncode : " + i2 + ", message : " + str);
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public class WebChromeClientClass extends WebChromeClient {
        public WebChromeClientClass() {
        }

        public static final Unit a(JsResult jsResult) {
            jsResult.confirm();
            return Unit.INSTANCE;
        }

        public static final Unit b(JsResult jsResult) {
            jsResult.confirm();
            return Unit.INSTANCE;
        }

        public static final Unit c(JsResult jsResult) {
            jsResult.cancel();
            return Unit.INSTANCE;
        }

        @Override // android.webkit.WebChromeClient
        public void onCloseWindow(@NotNull WebView webView) {
            Intrinsics.checkNotNullParameter(webView, "");
            webView.setVisibility(8);
            webView.destroy();
            super.onCloseWindow(webView);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(@NotNull WebView webView, boolean z, boolean z2, @NotNull Message message) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(message, "");
            final WebView webView2 = new WebView(webView.getContext());
            WebSettings settings = webView2.getSettings();
            Intrinsics.checkNotNullExpressionValue(settings, "");
            settings.setJavaScriptEnabled(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setSupportMultipleWindows(true);
            final Dialog dialog = new Dialog(webView.getContext(), R.style.tnk_full_screen_dialog);
            dialog.setContentView(webView2);
            dialog.show();
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.tnkfactory.ad.basic.AdDetailWebView$WebChromeClientClass$$ExternalSyntheticLambda3
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                    return AdDetailWebView.WebChromeClientClass.a(webView2, dialogInterface, i2, keyEvent);
                }
            });
            webView2.setWebViewClient(AdDetailWebView.this.new AdWebViewClient());
            final AdDetailWebView adDetailWebView = AdDetailWebView.this;
            webView2.setWebChromeClient(new WebChromeClientClass(adDetailWebView) { // from class: com.tnkfactory.ad.basic.AdDetailWebView$WebChromeClientClass$onCreateWindow$2
                @Override // com.tnkfactory.ad.basic.AdDetailWebView.WebChromeClientClass, android.webkit.WebChromeClient
                public void onCloseWindow(WebView webView3) {
                    Intrinsics.checkNotNullParameter(webView3, "");
                    dialog.dismiss();
                }
            });
            Object obj = message.obj;
            Intrinsics.checkNotNull(obj, "");
            ((WebView.WebViewTransport) obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(@NotNull WebView webView, @NotNull String str, @NotNull String str2, @NotNull final JsResult jsResult) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(jsResult, "");
            TAlertDialog.Companion companion = TAlertDialog.Companion;
            Context context = webView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            companion.show(context, str2, new Function0() { // from class: com.tnkfactory.ad.basic.AdDetailWebView$WebChromeClientClass$$ExternalSyntheticLambda2
                public final Object invoke() {
                    return AdDetailWebView.WebChromeClientClass.a(jsResult);
                }
            }, null);
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(@NotNull WebView webView, @NotNull String str, @NotNull String str2, @NotNull final JsResult jsResult) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(jsResult, "");
            TAlertDialog.Companion companion = TAlertDialog.Companion;
            Context context = webView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            companion.show(context, str2, new Function0() { // from class: com.tnkfactory.ad.basic.AdDetailWebView$WebChromeClientClass$$ExternalSyntheticLambda0
                public final Object invoke() {
                    return AdDetailWebView.WebChromeClientClass.b(jsResult);
                }
            }, new Function0() { // from class: com.tnkfactory.ad.basic.AdDetailWebView$WebChromeClientClass$$ExternalSyntheticLambda1
                public final Object invoke() {
                    return AdDetailWebView.WebChromeClientClass.c(jsResult);
                }
            });
            return true;
        }

        public static final boolean a(WebView webView, DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
            if (i2 != 4) {
                return false;
            }
            if (webView.canGoBack()) {
                webView.goBack();
                return true;
            }
            dialogInterface.dismiss();
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, byte b2) {
        int i2;
        int i3;
        ?? r8 = 105 - (b2 * 3);
        int i4 = 3 - (b * 3);
        int i5 = s * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            byte b3 = r8;
            i2 = 0;
            int i6 = i4;
            int i7 = i6;
            i3 = i4 + (-b3);
            i4 = i7;
            int i8 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            i2++;
            b3 = bArr[i8];
            int i9 = i3;
            i6 = i8;
            i4 = i9;
            int i72 = i6;
            i3 = i4 + (-b3);
            i4 = i72;
            int i82 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            i3 = r8;
            int i822 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    static {
        onExtraCallback = 1;
        onWarmupCompleted();
        Companion = new Companion(null);
        int i2 = onExtraCallbackWithResult + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final /* synthetic */ WebView access$getWebView$p(AdDetailWebView adDetailWebView) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 125;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        WebView webView = adDetailWebView.a;
        int i6 = i4 + 117;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return webView;
    }

    public final Dialog getDlg() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Dialog dialog = this.d;
        int i6 = i3 + 9;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return dialog;
    }

    public final Function0<Unit> getOnDismissCallback() {
        Function0<Unit> function0;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 15;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 == 0) {
            function0 = this.c;
            int i5 = 50 / 0;
        } else {
            function0 = this.c;
        }
        int i6 = i4 + 21;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 52 / 0;
        }
        return function0;
    }

    public final void setDlg(@Nullable Dialog dialog) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 65;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        this.d = dialog;
        int i6 = i3 + 23;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void setOnDismissCallback(@Nullable Function0<Unit> function0) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 121;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.c = function0;
        int i6 = i3 + 43;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void showBackButton() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 119;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final LinearLayout access$getNetworkErrorLayout(AdDetailWebView adDetailWebView) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 57;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        View view = adDetailWebView.b;
        Object obj = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        View viewFindViewById = view.findViewById(R.id.com_tnk_off_network_error);
        if (!(viewFindViewById instanceof LinearLayout)) {
            int i5 = IAuthTabCallback + 61;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        int i6 = IAuthTabCallback + 53;
        onWarmupCompleted = i6 % 128;
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        if (i6 % 2 != 0) {
            return linearLayout;
        }
        obj.hashCode();
        throw null;
    }

    public static final TextView access$getTvErrorMessage(AdDetailWebView adDetailWebView) {
        int i2 = 2 % 2;
        View view = adDetailWebView.b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = IAuthTabCallback + 13;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            view = null;
        }
        View viewFindViewById = view.findViewById(R.id.com_tnk_off_error_script);
        if (!(viewFindViewById instanceof TextView)) {
            return null;
        }
        int i5 = onWarmupCompleted;
        int i6 = i5 + 53;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        TextView textView = (TextView) viewFindViewById;
        int i8 = i5 + 17;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return textView;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(AdDetailWebView adDetailWebView, View view) {
        WebView webView;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 113;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            adDetailWebView.loadDlg(true);
            webView = adDetailWebView.a;
            if (webView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = onWarmupCompleted + 85;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 5;
                }
                webView = null;
            }
        } else {
            adDetailWebView.loadDlg(true);
            webView = adDetailWebView.a;
            if (webView == null) {
            }
        }
        webView.reload();
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 93;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        super.onCreate(bundle);
        setStyle(1, R.style.tnk_full_screen_dialog);
        int i5 = IAuthTabCallback + 125;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        int i2 = 2 % 2;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "");
        dialogOnCreateDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.tnkfactory.ad.basic.AdDetailWebView$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                return AdDetailWebView.a(this.f$0, dialogInterface, i3, keyEvent);
            }
        });
        int i3 = IAuthTabCallback + 47;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return dialogOnCreateDialog;
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 83;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(R.layout.com_tnk_offerwall_cps_detail_webview, viewGroup);
            Intrinsics.checkNotNull(constraintLayoutInflate, "");
            ConstraintLayout constraintLayout = constraintLayoutInflate;
            this.b = constraintLayout;
            int i4 = 5 / 0;
            if (constraintLayout != null) {
                return constraintLayout;
            }
        } else {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            ConstraintLayout constraintLayoutInflate2 = layoutInflater.inflate(R.layout.com_tnk_offerwall_cps_detail_webview, viewGroup);
            Intrinsics.checkNotNull(constraintLayoutInflate2, "");
            ConstraintLayout constraintLayout2 = constraintLayoutInflate2;
            this.b = constraintLayout2;
            if (constraintLayout2 != null) {
                return constraintLayout2;
            }
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i5 = onWarmupCompleted + 61;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final void a(AdDetailWebView adDetailWebView, View view) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 111;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        adDetailWebView.dismiss();
        Function0 function0 = adDetailWebView.c;
        if (function0 != null) {
            function0.invoke();
            int i5 = onWarmupCompleted + 23;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public void onDestroy() {
        int i2 = 2 % 2;
        WebView webView = this.a;
        WebView webView2 = null;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView = null;
        }
        ViewParent parent = webView.getParent();
        Intrinsics.checkNotNull(parent, "");
        ViewGroup viewGroup = (ViewGroup) parent;
        WebView webView3 = this.a;
        if (webView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView3 = null;
        }
        viewGroup.removeView(webView3);
        WebView webView4 = this.a;
        if (webView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = onWarmupCompleted + 25;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        } else {
            webView2 = webView4;
        }
        webView2.destroy();
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        int i5 = IAuthTabCallback + 103;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void b(AdDetailWebView adDetailWebView) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 67;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object systemService = adDetailWebView.requireActivity().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        WebView webView = adDetailWebView.a;
        if (webView == null) {
            int i5 = IAuthTabCallback + 81;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView = null;
        }
        inputMethodManager.hideSoftInputFromWindow(webView.getWindowToken(), 0);
    }

    public static final class Companion {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static char[] onExtraCallbackWithResult = {64963, 64978, 65018, 64983};
        private static char onWarmupCompleted = 51243;

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final AdDetailWebView newInstance(@NotNull String str, @NotNull String str2, @NotNull String str3) throws Throwable {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Bundle bundle = new Bundle();
            bundle.putString("targetUrl", str);
            Object[] objArr = new Object[1];
            a(new char[]{0, 1, 2, 0, 13937}, (byte) (Color.argb(0, 0, 0, 0) + 115), TextUtils.getTrimmedLength("") + 5, objArr);
            bundle.putString(((String) objArr[0]).intern(), str2);
            bundle.putString("appName", str3);
            AdDetailWebView adDetailWebView = new AdDetailWebView();
            adDetailWebView.setArguments(bundle);
            int i3 = onExtraCallback + 103;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 86 / 0;
            }
            return adDetailWebView;
        }

        private static void a(char[] cArr, byte b, int i2, Object[] objArr) throws Throwable {
            int i3;
            Object obj;
            int i4 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onExtraCallbackWithResult;
            long j = 0;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 27, 23139 - Color.green(0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i5++;
                        j = 0;
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
            Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (ViewConfiguration.getScrollBarSize() >> 8) + 26, 23140 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i2];
            if (i2 % 2 != 0) {
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr[i3] - b);
                int i6 = $11 + 109;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } else {
                i3 = i2;
            }
            if (i3 > 1) {
                int i8 = $10 + 77;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i3) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        int i10 = $11 + 11;
                        $10 = i10 % 128;
                        if (i10 % 2 != 0) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback + b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback >>> b);
                        } else {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        }
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24825), KeyEvent.getDeadChar(0, 0) + 74, 8088 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i11 = $11 + 27;
                            $10 = i11 % 128;
                            int i12 = i11 % 2;
                            try {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 30 - Color.red(0), 19488 - TextUtils.getCapsMode("", 0, 0), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            obj = null;
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
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            for (int i18 = 0; i18 < i2; i18++) {
                cArr4[i18] = (char) (cArr4[i18] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }
    }

    public final void loadDlg(boolean z) {
        int i2 = 2 % 2;
        Object obj = null;
        if (!z) {
            Dialog dialog = this.d;
            if (dialog != null) {
                int i3 = IAuthTabCallback + 21;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                dialog.dismiss();
                if (i4 == 0) {
                    throw null;
                }
                return;
            }
            return;
        }
        int i5 = onWarmupCompleted + 37;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        if (this.d == null) {
            FragmentActivity activity = getActivity();
            Intrinsics.checkNotNull(activity);
            this.d = new TnkLoadingDialog(activity, R.style.TnkRwdLoadingDialog);
        }
        Dialog dialog2 = this.d;
        if (dialog2 != null) {
            int i7 = IAuthTabCallback + 87;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            dialog2.show();
            int i9 = onWarmupCompleted + 53;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public final void appScheme(@NotNull Uri uri) throws Throwable {
        String host;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 7;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(uri, "");
            host = uri.getHost();
            int i4 = 88 / 0;
            if (host == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(uri, "");
            host = uri.getHost();
            if (host == null) {
                return;
            }
        }
        int iHashCode = host.hashCode();
        if (iHashCode == -2061496180) {
            if (host.equals("close_view")) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tnkfactory.ad.basic.AdDetailWebView$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdDetailWebView.a(this.f$0);
                    }
                });
            }
        } else if (iHashCode == -1564059516) {
            int i5 = IAuthTabCallback + 13;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            if (host.equals("open_new_window")) {
                Object[] objArr = new Object[1];
                e(3 - View.MeasureSpec.getSize(0), -TextUtils.indexOf((CharSequence) "", '0'), new char[]{65531, 4, 1}, false, TextUtils.getCapsMode("", 0, 0) + 132, objArr);
                final String queryParameter = uri.getQueryParameter(((String) objArr[0]).intern());
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tnkfactory.ad.basic.AdDetailWebView$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdDetailWebView.a(this.f$0, queryParameter);
                    }
                });
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDismiss(@NotNull DialogInterface dialogInterface) throws Throwable {
        String string;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 125;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function0 function0 = this.c;
        if (function0 != null) {
            int i5 = onWarmupCompleted + 31;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                function0.invoke();
                int i6 = 9 / 0;
            } else {
                function0.invoke();
            }
        }
        TnkAdAnalytics tnkAdAnalytics = TnkAdAnalytics.INSTANCE;
        HashMap<String, String> map = new HashMap<>();
        Bundle arguments = getArguments();
        if (arguments != null) {
            Object[] objArr = new Object[1];
            e(4 - TextUtils.lastIndexOf("", '0'), -TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{2, 65535, 14, 14, 65511}, false, 117 - TextUtils.getTrimmedLength(""), objArr);
            string = arguments.getString(((String) objArr[0]).intern(), "");
            if (string == null) {
                string = "";
            }
        }
        map.put("item_id", string);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            String string2 = arguments2.getString("appName", "");
            if (string2 == null) {
                int i7 = onWarmupCompleted + 97;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            } else {
                str = string2;
            }
        }
        map.put("item_name", str);
        Unit unit = Unit.INSTANCE;
        tnkAdAnalytics.logEvent("ad_detail_close", map);
    }

    public static final boolean a(final AdDetailWebView adDetailWebView, DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = i4 + 1;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0 ? i2 == 84 : i2 == 13) {
            new Handler().postDelayed(new Runnable() { // from class: com.tnkfactory.ad.basic.AdDetailWebView$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    AdDetailWebView.b(this.f$0);
                }
            }, 200L);
            return false;
        }
        if (i2 != 4) {
            return false;
        }
        int i6 = i4 + 21;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        if (keyEvent.getAction() != 1) {
            return false;
        }
        WebView webView = adDetailWebView.a;
        WebView webView2 = null;
        if (webView == null) {
            int i8 = onWarmupCompleted + 109;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView = null;
        }
        if (webView.canGoBack()) {
            WebView webView3 = adDetailWebView.a;
            if (webView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                webView2 = webView3;
            }
            webView2.goBack();
        } else {
            adDetailWebView.dismiss();
        }
        int i10 = IAuthTabCallback + 45;
        onWarmupCompleted = i10 % 128;
        int i11 = i10 % 2;
        return true;
    }

    public static final void a(AdDetailWebView adDetailWebView) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 27;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        adDetailWebView.dismiss();
        int i5 = IAuthTabCallback + 39;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void a(AdDetailWebView adDetailWebView, String str) {
        int i2 = 2 % 2;
        PackageManager packageManager = adDetailWebView.requireActivity().getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "");
        if (listQueryIntentActivities.size() > 0) {
            int i3 = onWarmupCompleted + 5;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            adDetailWebView.startActivity(intent);
            int i5 = IAuthTabCallback + 101;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = IAuthTabCallback + 111;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        String string;
        LinearLayout linearLayout;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        View view2 = this.b;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view2 = null;
        }
        this.a = (WebView) view2.findViewById(R.id.com_tnk_off_detail_webview);
        View view3 = this.b;
        if (view3 == null) {
            int i3 = IAuthTabCallback + 3;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                linearLayout.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            view3 = null;
        }
        View viewFindViewById = view3.findViewById(R.id.com_tnk_off_iv_detail_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.AdDetailWebView$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                AdDetailWebView.a(this.f$0, view4);
            }
        });
        setCancelable(false);
        WebView webView = this.a;
        if (webView == null) {
            int i4 = onWarmupCompleted + 47;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = 38 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            webView = null;
        }
        webView.setWebChromeClient(new WebChromeClientClass());
        WebView webView2 = this.a;
        if (webView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView2 = null;
        }
        webView2.setNetworkAvailable(true);
        WebView webView3 = this.a;
        if (webView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView3 = null;
        }
        webView3.getSettings().setJavaScriptEnabled(true);
        WebView webView4 = this.a;
        if (webView4 == null) {
            int i6 = IAuthTabCallback + 47;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView4 = null;
        }
        webView4.getSettings().setDomStorageEnabled(true);
        WebView webView5 = this.a;
        if (webView5 == null) {
            int i8 = onWarmupCompleted + 11;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i9 = 87 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            webView5 = null;
        }
        webView5.getSettings().setTextZoom(100);
        WebView webView6 = this.a;
        if (webView6 == null) {
            int i10 = onWarmupCompleted + 79;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView6 = null;
        }
        webView6.getSettings().setMixedContentMode(0);
        WebView webView7 = this.a;
        if (webView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView7 = null;
        }
        webView7.setScrollBarStyle(0);
        WebView webView8 = this.a;
        if (webView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView8 = null;
        }
        webView8.setWebViewClient(new AdWebViewClient());
        WebView webView9 = this.a;
        if (webView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView9 = null;
        }
        webView9.requestFocus();
        WebView webView10 = this.a;
        if (webView10 == null) {
            int i12 = onWarmupCompleted + 39;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView10 = null;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            string = "";
        } else {
            string = arguments.getString("targetUrl", "");
            if (string == null) {
                int i14 = IAuthTabCallback + 17;
                onWarmupCompleted = i14 % 128;
                if (i14 % 2 == 0) {
                    linearLayout.hashCode();
                    throw null;
                }
                string = "";
            }
        }
        webView10.loadUrl(string);
        View view4 = this.b;
        if (view4 == null) {
            int i15 = IAuthTabCallback + 63;
            onWarmupCompleted = i15 % 128;
            int i16 = i15 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            view4 = null;
        }
        View viewFindViewById2 = view4.findViewById(R.id.com_tnk_off_network_error);
        LinearLayout linearLayout2 = viewFindViewById2 instanceof LinearLayout ? (LinearLayout) viewFindViewById2 : null;
        if (linearLayout2 != null) {
            int i17 = IAuthTabCallback + 35;
            onWarmupCompleted = i17 % 128;
            int i18 = i17 % 2;
            linearLayout = (LinearLayout) linearLayout2.findViewById(R.id.com_tnk_off_error_reload);
        } else {
            linearLayout = null;
        }
        linearLayout = linearLayout != null ? linearLayout : null;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.AdDetailWebView$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    AdDetailWebView.b(this.f$0, view5);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(int i2, int i3, char[] cArr, boolean z, int i4, Object[] objArr) throws Throwable {
        int i5;
        Throwable cause;
        int i6 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i5 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            int i7 = $10 + 63;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i4 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i9 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (ViewConfiguration.getLongPressTimeout() >> 16) + 23, Color.argb(0, 0, 0, 0) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12843), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 55, (ViewConfiguration.getPressedStateDuration() >> 16) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            int i10 = $11 + 55;
            $10 = i10 % 128;
            int i11 = i10 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i12 = $11 + 11;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 12843), (ViewConfiguration.getScrollBarSize() >> 8) + 55, (ViewConfiguration.getJumpTapTimeout() >> 16) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i5 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onWarmupCompleted() {
        onNavigationEvent = 478308922;
    }
}
