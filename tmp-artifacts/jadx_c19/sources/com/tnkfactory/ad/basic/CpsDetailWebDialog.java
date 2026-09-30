package com.tnkfactory.ad.basic;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkContext;
import com.tnkfactory.ad.TnkSession;
import com.tnkfactory.ad.b.l;
import com.tnkfactory.ad.basic.CpsDetailWebDialog;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.TnkCore;
import com.tnkfactory.ad.rwd.common.TAlertDialog;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda0;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class CpsDetailWebDialog extends Dialog {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long onExtraCallbackWithResult = 1141629575355851464L;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final String a;
    public final TnkContext b;
    public WebView c;
    public Function0 d;
    public Dialog e;

    public final class AdWebViewClient extends WebViewClient {
        public AdWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@NotNull WebView webView, @Nullable String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            try {
                CpsDetailWebDialog.this.loadDlg(false);
            } catch (Exception unused) {
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
            WebView webViewAccess$getWebView$p = CpsDetailWebDialog.access$getWebView$p(CpsDetailWebDialog.this);
            if (webViewAccess$getWebView$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                webViewAccess$getWebView$p = null;
            }
            webViewAccess$getWebView$p.setVisibility(0);
            LinearLayout linearLayoutAccess$getNetworkErrorLayout = CpsDetailWebDialog.access$getNetworkErrorLayout(CpsDetailWebDialog.this);
            if (linearLayoutAccess$getNetworkErrorLayout != null) {
                linearLayoutAccess$getNetworkErrorLayout.setVisibility(8);
            }
            CpsDetailWebDialog.this.loadDlg(true);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@NotNull WebView webView, @Nullable String str) throws Throwable {
            Intrinsics.checkNotNullParameter(webView, "");
            if (str != null) {
                try {
                    CpsDetailWebDialog cpsDetailWebDialog = CpsDetailWebDialog.this;
                    if (StringsKt.startsWith$default(str, "tnkscheme://", false, 2, (Object) null)) {
                        Uri uri = Uri.parse(str);
                        Intrinsics.checkNotNullExpressionValue(uri, "");
                        cpsDetailWebDialog.appScheme(uri);
                        return true;
                    }
                    if (StringsKt.startsWith$default(str, "market:", false, 2, (Object) null)) {
                        Intent uri2 = Intent.parseUri(str, 1);
                        if (uri2 != null) {
                            cpsDetailWebDialog.getContext().startActivity(uri2);
                        }
                        return true;
                    }
                    if (StringsKt.startsWith$default(str, "intent:", false, 2, (Object) null)) {
                        Intent uri3 = Intent.parseUri(str, 1);
                        String str2 = uri3.getPackage();
                        if ((str2 != null ? cpsDetailWebDialog.getContext().getPackageManager().getLaunchIntentForPackage(str2) : null) != null) {
                            cpsDetailWebDialog.getContext().startActivity(uri3);
                        } else {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse("market://details?id=" + uri3.getPackage()));
                            cpsDetailWebDialog.getContext().startActivity(intent);
                        }
                        return true;
                    }
                    if (!StringsKt.startsWith$default(str, "http", false, 2, (Object) null) && StringsKt.contains$default(str, "://", false, 2, (Object) null)) {
                        Intent uri4 = Intent.parseUri(str, 1);
                        String str3 = uri4.getPackage();
                        if ((str3 != null ? cpsDetailWebDialog.getContext().getPackageManager().getLaunchIntentForPackage(str3) : null) != null) {
                            cpsDetailWebDialog.getContext().startActivity(uri4);
                            return true;
                        }
                        PackageManager packageManager = cpsDetailWebDialog.getContext().getPackageManager();
                        Intrinsics.checkNotNullExpressionValue(packageManager, "");
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setData(Uri.parse(str));
                        if (packageManager.queryIntentActivities(intent2, 0).size() > 0) {
                            cpsDetailWebDialog.getContext().startActivity(intent2);
                        }
                        return true;
                    }
                } catch (Exception unused) {
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@Nullable WebView webView, int i2, @Nullable String str, @Nullable String str2) {
            super.onReceivedError(webView, i2, str, str2);
            CpsDetailWebDialog.this.loadDlg(false);
            if (i2 < 0) {
                WebView webViewAccess$getWebView$p = CpsDetailWebDialog.access$getWebView$p(CpsDetailWebDialog.this);
                if (webViewAccess$getWebView$p == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    webViewAccess$getWebView$p = null;
                }
                webViewAccess$getWebView$p.setVisibility(8);
                LinearLayout linearLayoutAccess$getNetworkErrorLayout = CpsDetailWebDialog.access$getNetworkErrorLayout(CpsDetailWebDialog.this);
                if (linearLayoutAccess$getNetworkErrorLayout != null) {
                    linearLayoutAccess$getNetworkErrorLayout.setVisibility(0);
                }
                TextView textViewAccess$getTvErrorMessage = CpsDetailWebDialog.access$getTvErrorMessage(CpsDetailWebDialog.this);
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
            final Dialog dialog = new Dialog(webView.getContext());
            dialog.setContentView(webView2);
            dialog.show();
            CpsDetailWebDialog.access$getTvClose(CpsDetailWebDialog.this).setVisibility(8);
            final CpsDetailWebDialog cpsDetailWebDialog = CpsDetailWebDialog.this;
            dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.tnkfactory.ad.basic.CpsDetailWebDialog$WebChromeClientClass$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    CpsDetailWebDialog.WebChromeClientClass.a(cpsDetailWebDialog, dialogInterface);
                }
            });
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.tnkfactory.ad.basic.CpsDetailWebDialog$WebChromeClientClass$$ExternalSyntheticLambda1
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                    return CpsDetailWebDialog.WebChromeClientClass.a(webView2, dialogInterface, i2, keyEvent);
                }
            });
            webView2.setWebViewClient(CpsDetailWebDialog.this.new AdWebViewClient());
            final CpsDetailWebDialog cpsDetailWebDialog2 = CpsDetailWebDialog.this;
            webView2.setWebChromeClient(new WebChromeClientClass(cpsDetailWebDialog2) { // from class: com.tnkfactory.ad.basic.CpsDetailWebDialog$WebChromeClientClass$onCreateWindow$3
                @Override // com.tnkfactory.ad.basic.CpsDetailWebDialog.WebChromeClientClass, android.webkit.WebChromeClient
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
            companion.show(context, str2, new Function0() { // from class: com.tnkfactory.ad.basic.CpsDetailWebDialog$WebChromeClientClass$$ExternalSyntheticLambda4
                public final Object invoke() {
                    return CpsDetailWebDialog.WebChromeClientClass.a(jsResult);
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
            companion.show(context, str2, new Function0() { // from class: com.tnkfactory.ad.basic.CpsDetailWebDialog$WebChromeClientClass$$ExternalSyntheticLambda2
                public final Object invoke() {
                    return CpsDetailWebDialog.WebChromeClientClass.b(jsResult);
                }
            }, new Function0() { // from class: com.tnkfactory.ad.basic.CpsDetailWebDialog$WebChromeClientClass$$ExternalSyntheticLambda3
                public final Object invoke() {
                    return CpsDetailWebDialog.WebChromeClientClass.c(jsResult);
                }
            });
            return true;
        }

        public static final void a(CpsDetailWebDialog cpsDetailWebDialog, DialogInterface dialogInterface) {
            CpsDetailWebDialog.access$getTvClose(cpsDetailWebDialog).setVisibility(0);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CpsDetailWebDialog(@NotNull Context context, @NotNull String str) {
        super(context, R.style.tnk_full_screen_dialog);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.a = str;
        this.b = new TnkContext((FragmentActivity) context);
    }

    public static final /* synthetic */ ImageView access$getTvClose(CpsDetailWebDialog cpsDetailWebDialog) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 63;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        ImageView imageViewA = cpsDetailWebDialog.a();
        int i5 = onNavigationEvent + 105;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return imageViewA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ WebView access$getWebView$p(CpsDetailWebDialog cpsDetailWebDialog) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 61;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        WebView webView = cpsDetailWebDialog.c;
        if (i4 != 0) {
            return webView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final Unit c(CpsDetailWebDialog cpsDetailWebDialog) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 113;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        cpsDetailWebDialog.dismiss();
        Unit unit = Unit.INSTANCE;
        if (i4 == 0) {
            int i5 = 49 / 0;
        }
        int i6 = onNavigationEvent + 25;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static final Unit e(CpsDetailWebDialog cpsDetailWebDialog) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 43;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        cpsDetailWebDialog.dismiss();
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 107;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
        return unit;
    }

    public final ImageView a() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 111;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            View viewFindViewById = findViewById(R.id.com_tnk_off_iv_detail_close);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        View viewFindViewById2 = findViewById(R.id.com_tnk_off_iv_detail_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        ImageView imageView = (ImageView) viewFindViewById2;
        int i4 = onNavigationEvent + 19;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return imageView;
    }

    public final Dialog getDlg() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 55;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        Dialog dialog = this.e;
        int i6 = i4 + 29;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 10 / 0;
        }
        return dialog;
    }

    public int getLayoutId() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 89;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = R.layout.com_tnk_offerwall_cps_detail_webview;
        int i6 = onNavigationEvent + 85;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final Function0<Unit> getOnDismissCallback() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 67;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        Function0<Unit> function0 = this.d;
        int i5 = i4 + 29;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return function0;
    }

    public final String getTargetUrl() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 47;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        String str = this.a;
        int i6 = i3 + 51;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final TnkContext getTnkContext() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 97;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        TnkContext tnkContext = this.b;
        if (i4 != 0) {
            int i5 = 97 / 0;
        }
        return tnkContext;
    }

    public void initView() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 35;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        int i2 = 2 % 2;
        a(new Function0() { // from class: com.tnkfactory.ad.basic.CpsDetailWebDialog$$ExternalSyntheticLambda10
            public final Object invoke() {
                return CpsDetailWebDialog.b(this.f$0);
            }
        });
        int i3 = onNavigationEvent + 107;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setDlg(@Nullable Dialog dialog) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 125;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        this.e = dialog;
        int i6 = i4 + 35;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public final void setOnDismissCallback(@Nullable Function0<Unit> function0) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.d = function0;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 75;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final void a(final CpsDetailWebDialog cpsDetailWebDialog, View view) {
        int i2 = 2 % 2;
        cpsDetailWebDialog.a(new Function0() { // from class: com.tnkfactory.ad.basic.CpsDetailWebDialog$$ExternalSyntheticLambda12
            public final Object invoke() {
                return CpsDetailWebDialog.c(this.f$0);
            }
        });
        int i3 = onWarmupCompleted + 31;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final void b(CpsDetailWebDialog cpsDetailWebDialog, View view) {
        int i2 = 2 % 2;
        cpsDetailWebDialog.loadDlg(true);
        WebView webView = cpsDetailWebDialog.c;
        Object obj = null;
        if (webView == null) {
            int i3 = onNavigationEvent + 51;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = onWarmupCompleted + 31;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            webView = null;
        }
        webView.reload();
        int i7 = onWarmupCompleted + 95;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void customGoBack() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 53;
        onWarmupCompleted = i3 % 128;
        WebView webView = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        WebView webView2 = this.c;
        if (webView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView2 = null;
        }
        if (webView2.canGoBack()) {
            WebView webView3 = this.c;
            if (webView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = onWarmupCompleted + 123;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            } else {
                webView = webView3;
            }
            webView.goBack();
        }
    }

    public final void loadDlg(boolean z) {
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 13;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            getOwnerActivity();
            obj.hashCode();
            throw null;
        }
        if (getOwnerActivity() != null) {
            int i4 = onWarmupCompleted + 121;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            TextFieldScrollKtExternalSyntheticLambda0 ownerActivity = getOwnerActivity();
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = !(ownerActivity instanceof FragmentActivity) ? null : (FragmentActivity) ownerActivity;
            if (textFieldScrollKtExternalSyntheticLambda0 == null || (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0)) == null) {
                return;
            }
            maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, putChannelInfo.onExtraCallback(), (setRandomHost) null, new l(z, this, null), 2, (Object) null);
        }
    }

    public static final LinearLayout access$getNetworkErrorLayout(CpsDetailWebDialog cpsDetailWebDialog) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 115;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        View viewFindViewById = cpsDetailWebDialog.findViewById(R.id.com_tnk_off_network_error);
        if (!(viewFindViewById instanceof LinearLayout)) {
            return null;
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        int i5 = onWarmupCompleted + 99;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return linearLayout;
    }

    public static final TextView access$getTvErrorMessage(CpsDetailWebDialog cpsDetailWebDialog) {
        int i2 = 2 % 2;
        View viewFindViewById = cpsDetailWebDialog.findViewById(R.id.com_tnk_off_error_script);
        if (!(viewFindViewById instanceof TextView)) {
            int i3 = onWarmupCompleted + 71;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i4 = onWarmupCompleted + 47;
        onNavigationEvent = i4 % 128;
        TextView textView = (TextView) viewFindViewById;
        if (i4 % 2 != 0) {
            return textView;
        }
        throw null;
    }

    public static final boolean a(final CpsDetailWebDialog cpsDetailWebDialog, DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 29;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if (i2 != 84) {
            return false;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.tnkfactory.ad.basic.CpsDetailWebDialog$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                CpsDetailWebDialog.d(this.f$0);
            }
        }, 200L);
        int i6 = onWarmupCompleted + 115;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public static final void d(CpsDetailWebDialog cpsDetailWebDialog) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 71;
        onNavigationEvent = i3 % 128;
        WebView webView = null;
        try {
            if (i3 % 2 == 0) {
                boolean z = cpsDetailWebDialog.getContext().getSystemService("input_method") instanceof InputMethodManager;
                webView.hashCode();
                throw null;
            }
            Object systemService = cpsDetailWebDialog.getContext().getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                int i4 = onNavigationEvent + 31;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    WebView webView2 = cpsDetailWebDialog.c;
                    throw null;
                }
                WebView webView3 = cpsDetailWebDialog.c;
                if (webView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    webView = webView3;
                }
                inputMethodManager.hideSoftInputFromWindow(webView.getWindowToken(), 0);
            }
        } catch (Exception unused) {
        }
    }

    public static final void a(CpsDetailWebDialog cpsDetailWebDialog, DialogInterface dialogInterface) {
        ViewGroup viewGroup;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 105;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        WebView webView = cpsDetailWebDialog.c;
        WebView webView2 = null;
        if (webView == null) {
            int i6 = i4 + 61;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                webView2.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView = null;
        }
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            int i7 = onWarmupCompleted + 55;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            WebView webView3 = cpsDetailWebDialog.c;
            if (webView3 == null) {
                int i9 = onNavigationEvent + 29;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                webView3 = null;
            }
            viewGroup.removeView(webView3);
        }
        WebView webView4 = cpsDetailWebDialog.c;
        if (webView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            webView2 = webView4;
        }
        webView2.destroy();
    }

    public final void a(final Function0 function0) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 29;
        onWarmupCompleted = i4 % 128;
        WebView webView = null;
        if (i4 % 2 != 0) {
            webView.hashCode();
            throw null;
        }
        WebView webView2 = this.c;
        if (webView2 == null) {
            int i5 = i3 + 1;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i6 != 0) {
                webView.hashCode();
                throw null;
            }
        } else {
            webView = webView2;
        }
        webView.evaluateJavascript("javascript:native_close('aos')", new ValueCallback() { // from class: com.tnkfactory.ad.basic.CpsDetailWebDialog$$ExternalSyntheticLambda11
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) throws Throwable {
                CpsDetailWebDialog.a(this.f$0, function0, (String) obj);
            }
        });
    }

    public static final Unit b(CpsDetailWebDialog cpsDetailWebDialog) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        WebView webView = cpsDetailWebDialog.c;
        if (webView != null && webView.canGoBack()) {
            WebView webView2 = cpsDetailWebDialog.c;
            if (webView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                webView2 = null;
            }
            webView2.goBack();
            i2 = onNavigationEvent + 73;
        } else {
            cpsDetailWebDialog.dismiss();
            i2 = onNavigationEvent + 105;
        }
        onWarmupCompleted = i2 % 128;
        int i6 = i2 % 2;
        return Unit.INSTANCE;
    }

    public static final Unit b() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 75;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 89;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static final void a(final CpsDetailWebDialog cpsDetailWebDialog, Function0 function0, String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 43;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            cpsDetailWebDialog.isShowing();
            throw null;
        }
        if (cpsDetailWebDialog.isShowing()) {
            Object[] objArr = new Object[1];
            l(new char[]{58289, 23502, 58240, 7657, 25589}, View.resolveSize(0, 0), objArr);
            if (str.equals(((String) objArr[0]).intern())) {
                return;
            }
            int i4 = onNavigationEvent + 81;
            int i5 = i4 % 128;
            onWarmupCompleted = i5;
            int i6 = i4 % 2;
            WebView webView = cpsDetailWebDialog.c;
            if (webView == null) {
                int i7 = i5 + 99;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                webView = null;
            }
            String url = webView.getUrl();
            if (url == null) {
                cpsDetailWebDialog.dismiss();
                return;
            }
            if (!(!StringsKt.contains$default(url, "ofr.cps.usr?action=order_", false, 2, (Object) null)) || !StringsKt.contains$default(url, "ofr.cps.usr?action=order", false, 2, (Object) null)) {
                function0.invoke();
                return;
            }
            TAlertDialog.Companion companion = TAlertDialog.Companion;
            Context context = cpsDetailWebDialog.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            companion.show(context, "페이지를 닫으시면\n진행하시던 결제가 취소됩니다\n페이지를 닫을까요?", "네 닫을게요", "아니요 결제할게요", new Function0() { // from class: com.tnkfactory.ad.basic.CpsDetailWebDialog$$ExternalSyntheticLambda0
                public final Object invoke() {
                    return CpsDetailWebDialog.e(this.f$0);
                }
            }, new Function0() { // from class: com.tnkfactory.ad.basic.CpsDetailWebDialog$$ExternalSyntheticLambda1
                public final Object invoke() {
                    return CpsDetailWebDialog.b();
                }
            });
        }
    }

    public static final void a(AdListVo adListVo) {
        String str;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 25;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Context applicationContext = TnkCore.INSTANCE.getServiceTask().getApplicationContext();
            if (!Intrinsics.areEqual(adListVo.getLike_yn(), "Y")) {
                str = "관심상품에서 삭제되었어요.";
            } else {
                int i4 = onNavigationEvent + 47;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                str = "등록된 관심상품은 MY에서 확인 할 수 있어요.";
            }
            Toast.makeText(applicationContext, str, 0).show();
            return;
        }
        TnkCore.INSTANCE.getServiceTask().getApplicationContext();
        Intrinsics.areEqual(adListVo.getLike_yn(), "Y");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void a(CpsDetailWebDialog cpsDetailWebDialog) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 61;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        cpsDetailWebDialog.dismiss();
        if (i4 == 0) {
            int i5 = 48 / 0;
        }
    }

    public static final void a(CpsDetailWebDialog cpsDetailWebDialog, String str) {
        int i2 = 2 % 2;
        PackageManager packageManager = cpsDetailWebDialog.getContext().getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "");
        if (listQueryIntentActivities.size() > 0) {
            int i3 = onWarmupCompleted + 53;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            cpsDetailWebDialog.getContext().startActivity(intent);
            int i5 = onWarmupCompleted + 37;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        LinearLayout linearLayout;
        int i2 = 2 % 2;
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(getLayoutId(), (ViewGroup) null));
        this.c = (WebView) findViewById(R.id.com_tnk_off_detail_webview);
        a().setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.CpsDetailWebDialog$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CpsDetailWebDialog.a(this.f$0, view);
            }
        });
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.tnkfactory.ad.basic.CpsDetailWebDialog$$ExternalSyntheticLambda7
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                return CpsDetailWebDialog.a(this.f$0, dialogInterface, i3, keyEvent);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.tnkfactory.ad.basic.CpsDetailWebDialog$$ExternalSyntheticLambda8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CpsDetailWebDialog.a(this.f$0, dialogInterface);
            }
        });
        WebView webView = this.c;
        if (webView == null) {
            int i3 = onWarmupCompleted + 21;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView = null;
        }
        webView.setWebChromeClient(new WebChromeClientClass());
        WebView webView2 = this.c;
        if (webView2 == null) {
            int i5 = onWarmupCompleted + 67;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = 35 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            webView2 = null;
        }
        webView2.setNetworkAvailable(true);
        WebView webView3 = this.c;
        if (webView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView3 = null;
        }
        webView3.getSettings().setJavaScriptEnabled(true);
        WebView webView4 = this.c;
        if (webView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView4 = null;
        }
        webView4.getSettings().setDomStorageEnabled(true);
        WebView webView5 = this.c;
        if (webView5 == null) {
            int i7 = onNavigationEvent + 13;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView5 = null;
        }
        webView5.getSettings().setTextZoom(100);
        WebView webView6 = this.c;
        if (webView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView6 = null;
        }
        webView6.getSettings().setMixedContentMode(0);
        WebView webView7 = this.c;
        if (webView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView7 = null;
        }
        webView7.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        WebView webView8 = this.c;
        if (webView8 == null) {
            int i9 = onNavigationEvent + 1;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView8 = null;
        }
        webView8.getSettings().setSupportMultipleWindows(true);
        WebView webView9 = this.c;
        if (webView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView9 = null;
        }
        webView9.setScrollBarStyle(0);
        WebView webView10 = this.c;
        if (webView10 == null) {
            int i10 = onWarmupCompleted + 47;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                linearLayout.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView10 = null;
        }
        webView10.setWebViewClient(new AdWebViewClient());
        WebView webView11 = this.c;
        if (webView11 == null) {
            int i11 = onWarmupCompleted + 51;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                linearLayout.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView11 = null;
        }
        webView11.requestFocus();
        WebView webView12 = this.c;
        if (webView12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView12 = null;
        }
        webView12.loadUrl(this.a);
        View viewFindViewById = findViewById(R.id.com_tnk_off_network_error);
        if (!(viewFindViewById instanceof LinearLayout)) {
            linearLayout = null;
        } else {
            int i12 = onNavigationEvent + 43;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            linearLayout = (LinearLayout) viewFindViewById;
        }
        LinearLayout linearLayout2 = linearLayout != null ? (LinearLayout) linearLayout.findViewById(R.id.com_tnk_off_error_reload) : null;
        linearLayout = linearLayout2 != null ? linearLayout2 : null;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.CpsDetailWebDialog$$ExternalSyntheticLambda9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CpsDetailWebDialog.b(this.f$0, view);
                }
            });
        }
        initView();
    }

    private static void l(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i4 = $11 + 53;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i6 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 45812), (Process.myTid() >> 22) + 84, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14184 - Process.getGidForName("")), (ViewConfiguration.getFadingEdgeLength() >> 16) + 19, 8808 - (ViewConfiguration.getScrollBarSize() >> 8), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i7 = $11 + 103;
                $10 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i9 = $11 + 29;
        $10 = i9 % 128;
        if (i9 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i10 = 82 / 0;
            objArr[0] = str;
        }
    }

    public final void appScheme(@NotNull Uri uri) throws Throwable {
        String queryParameter;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        String host = uri.getHost();
        if (host != null) {
            switch (host.hashCode()) {
                case -2061496180:
                    if (host.equals("close_view")) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tnkfactory.ad.basic.CpsDetailWebDialog$$ExternalSyntheticLambda5
                            @Override // java.lang.Runnable
                            public final void run() {
                                CpsDetailWebDialog.a(this.f$0);
                            }
                        });
                        return;
                    }
                    return;
                case -1903871767:
                    if (!host.equals("show_back")) {
                        return;
                    }
                    a().setVisibility(0);
                    return;
                case -1903688893:
                    if (host.equals("show_help")) {
                        this.b.getNavi().moveToMyMenu(3);
                        return;
                    }
                    return;
                case -1564059516:
                    if (host.equals("open_new_window")) {
                        Object[] objArr = new Object[1];
                        l(new char[]{5283, 49073, 5334, 21778, 5611, 42503, 26358}, TextUtils.indexOf("", "", 0), objArr);
                        final String queryParameter2 = uri.getQueryParameter(((String) objArr[0]).intern());
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tnkfactory.ad.basic.CpsDetailWebDialog$$ExternalSyntheticLambda4
                            @Override // java.lang.Runnable
                            public final void run() {
                                CpsDetailWebDialog.a(this.f$0, queryParameter2);
                            }
                        });
                        return;
                    }
                    return;
                case -1131311528:
                    if (host.equals("gone_close")) {
                        a().setVisibility(8);
                        int i3 = onNavigationEvent + 45;
                        onWarmupCompleted = i3 % 128;
                        if (i3 % 2 != 0) {
                            int i4 = 9 / 0;
                            return;
                        }
                        return;
                    }
                    return;
                case 516289557:
                    if (host.equals("cps_favorite")) {
                        int i5 = onWarmupCompleted + 37;
                        onNavigationEvent = i5 % 128;
                        Object obj = null;
                        if (i5 % 2 == 0) {
                            uri.getQueryParameter("app_id");
                            obj.hashCode();
                            throw null;
                        }
                        String queryParameter3 = uri.getQueryParameter("app_id");
                        if (queryParameter3 != null) {
                            Iterator<T> it = TnkCore.INSTANCE.getOffRepository().getAdList().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (((AdListVo) next).getAppId() == Long.parseLong(queryParameter3)) {
                                        obj = next;
                                    }
                                }
                            }
                            final AdListVo adListVo = (AdListVo) obj;
                            if (adListVo == null || (queryParameter = uri.getQueryParameter("favorite")) == null) {
                                return;
                            }
                            adListVo.setLike_yn(queryParameter);
                            TnkSession.INSTANCE.runOnMainThread(new Runnable() { // from class: com.tnkfactory.ad.basic.CpsDetailWebDialog$$ExternalSyntheticLambda3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    CpsDetailWebDialog.a(adListVo);
                                }
                            });
                            TnkCore.INSTANCE.getOffRepository().getDataChanged().postValue(Boolean.TRUE);
                            return;
                        }
                        return;
                    }
                    return;
                case 517654663:
                    if (host.equals("gone_back")) {
                        int i6 = onWarmupCompleted + 43;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        a().setVisibility(0);
                        return;
                    }
                    return;
                case 1110780470:
                    if (host.equals("show_close")) {
                        int i8 = onWarmupCompleted + 115;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        a().setVisibility(0);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
