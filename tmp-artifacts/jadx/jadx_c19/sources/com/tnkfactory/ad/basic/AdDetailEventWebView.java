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
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
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
import com.tnkfactory.ad.basic.AdDetailEventWebView;
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
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdDetailEventWebView extends DialogFragment {
    public static final Companion Companion;
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    private static short[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static byte[] onNavigationEvent;
    private static int onWarmupCompleted;
    public WebView a;
    public ConstraintLayout b;
    public Function0 c;
    public Dialog d;
    private static final byte[] $$a = {69, 81, 99, -123};
    private static final int $$b = 111;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asBinder = 1;
    private static int IAuthTabCallbackStub = 0;

    public final class AdWebViewClient extends WebViewClient {
        public AdWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@NotNull WebView webView, @Nullable String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            AdDetailEventWebView.this.loadDlg(false);
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
            WebView webViewAccess$getWebView$p = AdDetailEventWebView.access$getWebView$p(AdDetailEventWebView.this);
            if (webViewAccess$getWebView$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                webViewAccess$getWebView$p = null;
            }
            webViewAccess$getWebView$p.setVisibility(0);
            LinearLayout linearLayoutAccess$getNetworkErrorLayout = AdDetailEventWebView.access$getNetworkErrorLayout(AdDetailEventWebView.this);
            if (linearLayoutAccess$getNetworkErrorLayout != null) {
                linearLayoutAccess$getNetworkErrorLayout.setVisibility(8);
            }
            AdDetailEventWebView.this.loadDlg(true);
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
                AdDetailEventWebView adDetailEventWebView = AdDetailEventWebView.this;
                Uri uri = Uri.parse(str);
                Intrinsics.checkNotNullExpressionValue(uri, "");
                adDetailEventWebView.appScheme(uri);
                return true;
            }
            if (StringsKt.startsWith$default(str, "http", false, 2, (Object) null)) {
                if (!StringsKt.contains$default(str, "offevt.event.main", false, 2, (Object) null)) {
                    try {
                        AdDetailEventWebView.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        return true;
                    } catch (Exception unused) {
                        return false;
                    }
                }
            } else {
                if (!StringsKt.startsWith$default(str, "intent", false, 2, (Object) null)) {
                    PackageManager packageManager = AdDetailEventWebView.this.requireActivity().getPackageManager();
                    Intrinsics.checkNotNullExpressionValue(packageManager, "");
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(str));
                    if (packageManager.queryIntentActivities(intent, 0).size() > 0) {
                        AdDetailEventWebView.this.startActivity(intent);
                    }
                    return true;
                }
                try {
                    Intent uri2 = Intent.parseUri(str, 1);
                    try {
                        AdDetailEventWebView.this.startActivity(uri2);
                        return true;
                    } catch (ActivityNotFoundException unused2) {
                        String str2 = uri2.getPackage();
                        if (str2 != null) {
                            AdDetailEventWebView.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str2)));
                            return true;
                        }
                    }
                } catch (URISyntaxException unused3) {
                    return false;
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@Nullable WebView webView, int i2, @Nullable String str, @Nullable String str2) {
            super.onReceivedError(webView, i2, str, str2);
            AdDetailEventWebView.this.loadDlg(false);
            if (i2 < 0) {
                WebView webViewAccess$getWebView$p = AdDetailEventWebView.access$getWebView$p(AdDetailEventWebView.this);
                if (webViewAccess$getWebView$p == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    webViewAccess$getWebView$p = null;
                }
                webViewAccess$getWebView$p.setVisibility(8);
                LinearLayout linearLayoutAccess$getNetworkErrorLayout = AdDetailEventWebView.access$getNetworkErrorLayout(AdDetailEventWebView.this);
                if (linearLayoutAccess$getNetworkErrorLayout != null) {
                    linearLayoutAccess$getNetworkErrorLayout.setVisibility(0);
                }
                TextView textViewAccess$getTvErrorMessage = AdDetailEventWebView.access$getTvErrorMessage(AdDetailEventWebView.this);
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
            try {
                AdDetailEventWebView.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(webView.getUrl())));
                return true;
            } catch (Exception unused) {
                return false;
            }
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
            companion.show(context, str2, new Function0() { // from class: com.tnkfactory.ad.basic.AdDetailEventWebView$WebChromeClientClass$$ExternalSyntheticLambda2
                public final Object invoke() {
                    return AdDetailEventWebView.WebChromeClientClass.a(jsResult);
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
            companion.show(context, str2, new Function0() { // from class: com.tnkfactory.ad.basic.AdDetailEventWebView$WebChromeClientClass$$ExternalSyntheticLambda0
                public final Object invoke() {
                    return AdDetailEventWebView.WebChromeClientClass.b(jsResult);
                }
            }, new Function0() { // from class: com.tnkfactory.ad.basic.AdDetailEventWebView$WebChromeClientClass$$ExternalSyntheticLambda1
                public final Object invoke() {
                    return AdDetailEventWebView.WebChromeClientClass.c(jsResult);
                }
            });
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i2, int i3) {
        int i4;
        int i5 = 3 - (b * 4);
        int i6 = (i2 * 4) + 115;
        int i7 = i3 * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i7 + 1];
        if (bArr == null) {
            int i8 = i6;
            int i9 = 0;
            int i10 = i5;
            int i11 = i5 + i8;
            i4 = i9;
            int i12 = i10;
            i6 = i11;
            i5 = i12;
            bArr2[i4] = (byte) i6;
            int i13 = i5 + 1;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
            int i14 = i6;
            i10 = i13;
            i5 = bArr[i13];
            i9 = i4 + 1;
            i8 = i14;
            int i112 = i5 + i8;
            i4 = i9;
            int i122 = i10;
            i6 = i112;
            i5 = i122;
            bArr2[i4] = (byte) i6;
            int i132 = i5 + 1;
            if (i4 == i7) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i6;
            int i1322 = i5 + 1;
            if (i4 == i7) {
            }
        }
    }

    static {
        IAuthTabCallbackDefault = 1;
        onWarmupCompleted();
        Object obj = null;
        Companion = new Companion(null);
        int i2 = IAuthTabCallbackStub + 5;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ WebView access$getWebView$p(AdDetailEventWebView adDetailEventWebView) {
        int i2 = 2 % 2;
        int i3 = asBinder + 29;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        WebView webView = adDetailEventWebView.a;
        int i6 = i4 + 63;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return webView;
        }
        throw null;
    }

    public final Dialog getDlg() {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 45;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Dialog dialog = this.d;
        int i6 = i3 + 85;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return dialog;
        }
        throw null;
    }

    public final Function0<Unit> getOnDismissCallback() {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 17;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Function0<Unit> function0 = this.c;
        int i6 = i3 + 109;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return function0;
    }

    public final void setDlg(@Nullable Dialog dialog) {
        int i2 = 2 % 2;
        int i3 = asBinder + 107;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        this.d = dialog;
        int i6 = i4 + 41;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 48 / 0;
        }
    }

    public final void setOnDismissCallback(@Nullable Function0<Unit> function0) {
        int i2 = 2 % 2;
        int i3 = asBinder + 125;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        this.c = function0;
        if (i4 != 0) {
            throw null;
        }
    }

    public static final LinearLayout access$getNetworkErrorLayout(AdDetailEventWebView adDetailEventWebView) {
        int i2 = 2 % 2;
        int i3 = onTransact + 105;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        View view = adDetailEventWebView.b;
        if (view == null) {
            int i6 = i4 + 121;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        View viewFindViewById = view.findViewById(R.id.com_tnk_off_network_error);
        if (!(viewFindViewById instanceof LinearLayout)) {
            return null;
        }
        int i8 = onTransact + 83;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
        return (LinearLayout) viewFindViewById;
    }

    public static final TextView access$getTvErrorMessage(AdDetailEventWebView adDetailEventWebView) {
        int i2 = 2 % 2;
        View view = adDetailEventWebView.b;
        Object obj = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        View viewFindViewById = view.findViewById(R.id.com_tnk_off_error_script);
        if (!(viewFindViewById instanceof TextView)) {
            int i3 = asBinder + 73;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        int i5 = onTransact + 101;
        int i6 = i5 % 128;
        asBinder = i6;
        TextView textView = (TextView) viewFindViewById;
        if (i5 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i7 = i6 + 77;
        onTransact = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 30 / 0;
        }
        return textView;
    }

    public static final void b(AdDetailEventWebView adDetailEventWebView, View view) {
        int i2 = 2 % 2;
        int i3 = onTransact + 79;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        adDetailEventWebView.loadDlg(true);
        WebView webView = adDetailEventWebView.a;
        if (webView == null) {
            int i5 = asBinder + 59;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i6 != 0) {
                throw null;
            }
            webView = null;
        }
        webView.reload();
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = asBinder + 47;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        super.onCreate(bundle);
        setStyle(1, R.style.tnk_full_screen_dialog);
        int i5 = onTransact + 27;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        int i2 = 2 % 2;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "");
        dialogOnCreateDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.tnkfactory.ad.basic.AdDetailEventWebView$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                return AdDetailEventWebView.a(this.f$0, dialogInterface, i3, keyEvent);
            }
        });
        int i3 = onTransact + 63;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 62 / 0;
        }
        return dialogOnCreateDialog;
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = asBinder + 7;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(R.layout.com_tnk_offerwall_cps_detail_webview, viewGroup);
            Intrinsics.checkNotNull(constraintLayoutInflate, "");
            this.b = constraintLayoutInflate;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        ConstraintLayout constraintLayoutInflate2 = layoutInflater.inflate(R.layout.com_tnk_offerwall_cps_detail_webview, viewGroup);
        Intrinsics.checkNotNull(constraintLayoutInflate2, "");
        ConstraintLayout constraintLayout = constraintLayoutInflate2;
        this.b = constraintLayout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        int i4 = onTransact + 43;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.throwUninitializedPropertyAccessException("");
        if (i5 != 0) {
            return null;
        }
        throw null;
    }

    public static final void a(AdDetailEventWebView adDetailEventWebView, View view) {
        int i2 = 2 % 2;
        int i3 = onTransact + 37;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        adDetailEventWebView.dismiss();
        Function0 function0 = adDetailEventWebView.c;
        if (function0 != null) {
            int i5 = asBinder + 77;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            function0.invoke();
        }
        int i7 = onTransact + 107;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
    }

    public void onDestroy() {
        int i2 = 2 % 2;
        int i3 = onTransact + 79;
        asBinder = i3 % 128;
        WebView webView = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        WebView webView2 = this.a;
        if (webView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView2 = null;
        }
        ViewParent parent = webView2.getParent();
        Intrinsics.checkNotNull(parent, "");
        ViewGroup viewGroup = (ViewGroup) parent;
        WebView webView3 = this.a;
        if (webView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = asBinder + 45;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            webView3 = null;
        }
        viewGroup.removeView(webView3);
        WebView webView4 = this.a;
        if (webView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            webView = webView4;
        }
        webView.destroy();
        super/*androidx.fragment.app.Fragment*/.onDestroy();
    }

    public static final void b(AdDetailEventWebView adDetailEventWebView) {
        int i2 = 2 % 2;
        int i3 = onTransact + 99;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Object systemService = adDetailEventWebView.requireActivity().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        WebView webView = adDetailEventWebView.a;
        if (webView == null) {
            int i5 = onTransact + 85;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i6 == 0) {
                int i7 = 50 / 0;
            }
            webView = null;
        }
        inputMethodManager.hideSoftInputFromWindow(webView.getWindowToken(), 0);
    }

    public static final class Companion {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 9442;
        private static int asBinder = 1;
        private static char onExtraCallback = 49072;
        private static char onExtraCallbackWithResult = 18622;
        private static int onNavigationEvent = 0;
        private static char onWarmupCompleted = 13061;

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final AdDetailEventWebView newInstance(@NotNull String str, @NotNull String str2, @NotNull String str3) throws Throwable {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Bundle bundle = new Bundle();
            bundle.putString("targetUrl", str);
            Object[] objArr = new Object[1];
            a(new char[]{14103, 13207, 3411, 47750, 15222, 56459}, 5 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
            bundle.putString(((String) objArr[0]).intern(), str2);
            bundle.putString("appName", str3);
            AdDetailEventWebView adDetailEventWebView = new AdDetailEventWebView();
            adDetailEventWebView.setArguments(bundle);
            int i3 = onNavigationEvent + 47;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return adDetailEventWebView;
        }

        private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
            int i3;
            int i4 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i5 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i6 = $11 + 83;
                $10 = i6 % 128;
                int i7 = 58224;
                if (i6 % 2 != 0) {
                    cArr3[i5] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    i3 = 1;
                } else {
                    cArr3[i5] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                    i3 = i5;
                }
                while (i3 < 16) {
                    char c = cArr3[1];
                    char c2 = cArr3[i5];
                    int i8 = (c2 + i7) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                    int i9 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onWarmupCompleted);
                        objArr2[2] = Integer.valueOf(i9);
                        objArr2[1] = Integer.valueOf(i8);
                        objArr2[i5] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char c3 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                            int defaultSize = View.getDefaultSize(i5, i5) + 10;
                            int i10 = (ExpandableListView.getPackedPositionForChild(i5, i5) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i5, i5) == 0L ? 0 : -1)) + 12435;
                            Class[] clsArr = new Class[4];
                            clsArr[i5] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, defaultSize, i10, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 10 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getLongPressTimeout() >> 16) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i7 -= 40503;
                        i3++;
                        cArr3 = cArr4;
                        i5 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr5 = cArr3;
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - TextUtils.indexOf("", "")), (ViewConfiguration.getLongPressTimeout() >> 16) + 14, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 19900, -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i5 = 0;
            }
            String str = new String(cArr2, 0, i2);
            int i11 = $10 + 55;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void loadDlg(boolean z) {
        int i2 = 2 % 2;
        int i3 = onTransact + 55;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 31 / 0;
            if (z) {
                if (this.d == null) {
                    FragmentActivity fragmentActivityRequireActivity = requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    this.d = new TnkLoadingDialog(fragmentActivityRequireActivity, R.style.TnkRwdLoadingDialog);
                }
                Dialog dialog = this.d;
                if (dialog != null) {
                    int i5 = onTransact + 75;
                    asBinder = i5 % 128;
                    int i6 = i5 % 2;
                    dialog.show();
                    return;
                }
            } else {
                Dialog dialog2 = this.d;
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
            }
        } else if (z) {
        }
        int i7 = onTransact + 61;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void appScheme(@NotNull Uri uri) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        String host = uri.getHost();
        Object obj = null;
        if (host != null) {
            int i3 = onTransact + 121;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                host.hashCode();
                obj.hashCode();
                throw null;
            }
            int iHashCode = host.hashCode();
            if (iHashCode != -2061496180) {
                int i4 = onTransact + 77;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 39 / 0;
                    if (iHashCode == -1564059516) {
                        if (host.equals("open_new_window")) {
                            Object[] objArr = new Object[1];
                            e((short) (117 - TextUtils.indexOf("", "")), (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) - 114), AndroidCharacter.getMirror('0') - 58855, 1565299422 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (-58) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
                            final String queryParameter = uri.getQueryParameter(((String) objArr[0]).intern());
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tnkfactory.ad.basic.AdDetailEventWebView$$ExternalSyntheticLambda4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AdDetailEventWebView.a(this.f$0, queryParameter);
                                }
                            });
                            return;
                        }
                    }
                } else if (iHashCode == -1564059516) {
                }
            } else if (host.equals("close_view")) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tnkfactory.ad.basic.AdDetailEventWebView$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdDetailEventWebView.a(this.f$0);
                    }
                });
            }
        }
        int i6 = asBinder + 1;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDismiss(@NotNull DialogInterface dialogInterface) throws Throwable {
        String string;
        int i2 = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function0 function0 = this.c;
        if (function0 != null) {
            int i3 = onTransact + 29;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                function0.invoke();
                throw null;
            }
            function0.invoke();
        }
        TnkAdAnalytics tnkAdAnalytics = TnkAdAnalytics.INSTANCE;
        HashMap<String, String> map = new HashMap<>();
        Bundle arguments = getArguments();
        if (arguments != null) {
            Object[] objArr = new Object[1];
            e((short) ((-103) - (ViewConfiguration.getWindowTouchSlop() >> 8)), (byte) ((-88) - TextUtils.indexOf("", "")), (-1284498868) + (ViewConfiguration.getEdgeSlop() >> 16), 1565299401 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getJumpTapTimeout() >> 16) - 58, objArr);
            string = arguments.getString(((String) objArr[0]).intern(), "");
            if (string == null) {
                int i4 = onTransact + 49;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 / 3;
                }
                string = "";
            }
        }
        map.put("item_id", string);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            String string2 = arguments2.getString("appName", "");
            if (string2 == null) {
                int i6 = asBinder + 77;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
            } else {
                str = string2;
            }
        }
        map.put("item_name", str);
        Unit unit = Unit.INSTANCE;
        tnkAdAnalytics.logEvent("ad_detail_close", map);
    }

    public static final boolean a(final AdDetailEventWebView adDetailEventWebView, DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        int i3 = 2 % 2;
        if (i2 == 84) {
            new Handler().postDelayed(new Runnable() { // from class: com.tnkfactory.ad.basic.AdDetailEventWebView$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AdDetailEventWebView.b(this.f$0);
                }
            }, 200L);
            return false;
        }
        if (i2 != 4) {
            return false;
        }
        int i4 = onTransact + 1;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        if (keyEvent.getAction() != 1) {
            return false;
        }
        WebView webView = adDetailEventWebView.a;
        WebView webView2 = null;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView = null;
        }
        if (!(!webView.canGoBack())) {
            WebView webView3 = adDetailEventWebView.a;
            if (webView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                webView2 = webView3;
            }
            webView2.goBack();
        } else {
            adDetailEventWebView.dismiss();
            int i6 = asBinder + 53;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
        }
        return true;
    }

    public static final void a(AdDetailEventWebView adDetailEventWebView) {
        int i2 = 2 % 2;
        int i3 = asBinder + 9;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        adDetailEventWebView.dismiss();
        int i5 = asBinder + 73;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final void a(AdDetailEventWebView adDetailEventWebView, String str) {
        int i2 = 2 % 2;
        PackageManager packageManager = adDetailEventWebView.requireActivity().getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "");
        if (listQueryIntentActivities.size() > 0) {
            int i3 = onTransact + 3;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            adDetailEventWebView.startActivity(intent);
            int i5 = onTransact + 59;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        String string;
        LinearLayout linearLayout;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        View view2 = this.b;
        LinearLayout linearLayout2 = null;
        if (view2 == null) {
            int i3 = onTransact + 53;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = 54 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            view2 = null;
        }
        this.a = (WebView) view2.findViewById(R.id.com_tnk_off_detail_webview);
        View view3 = this.b;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view3 = null;
        }
        View viewFindViewById = view3.findViewById(R.id.com_tnk_off_iv_detail_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.AdDetailEventWebView$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                AdDetailEventWebView.a(this.f$0, view4);
            }
        });
        setCancelable(false);
        WebView webView = this.a;
        if (webView == null) {
            int i5 = asBinder + 83;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
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
            int i7 = asBinder + 59;
            onTransact = i7 % 128;
            if (i7 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i8 = 22 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            webView3 = null;
        }
        webView3.getSettings().setJavaScriptEnabled(true);
        WebView webView4 = this.a;
        if (webView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView4 = null;
        }
        webView4.getSettings().setDomStorageEnabled(true);
        WebView webView5 = this.a;
        if (webView5 == null) {
            int i9 = onTransact + 29;
            asBinder = i9 % 128;
            if (i9 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                linearLayout2.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView5 = null;
        }
        webView5.getSettings().setTextZoom(100);
        WebView webView6 = this.a;
        if (webView6 == null) {
            int i10 = asBinder + 31;
            onTransact = i10 % 128;
            if (i10 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i11 = 69 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
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
            int i12 = onTransact + 1;
            asBinder = i12 % 128;
            if (i12 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i13 = 31 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            webView9 = null;
        }
        webView9.requestFocus();
        WebView webView10 = this.a;
        if (webView10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i14 = onTransact + 115;
            asBinder = i14 % 128;
            int i15 = i14 % 2;
            webView10 = null;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            string = "";
        } else {
            string = arguments.getString("targetUrl", "");
            if (string == null) {
                int i16 = asBinder + 11;
                onTransact = i16 % 128;
                int i17 = i16 % 2;
                string = "";
            }
        }
        webView10.loadUrl(string);
        View view4 = this.b;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view4 = null;
        }
        View viewFindViewById2 = view4.findViewById(R.id.com_tnk_off_network_error);
        if (viewFindViewById2 instanceof LinearLayout) {
            int i18 = asBinder + 93;
            onTransact = i18 % 128;
            if (i18 % 2 != 0) {
                linearLayout2.hashCode();
                throw null;
            }
            linearLayout = (LinearLayout) viewFindViewById2;
        } else {
            linearLayout = null;
        }
        LinearLayout linearLayout3 = linearLayout != null ? (LinearLayout) linearLayout.findViewById(R.id.com_tnk_off_error_reload) : null;
        if (linearLayout3 != null) {
            int i19 = asBinder + 13;
            onTransact = i19 % 128;
            if (i19 % 2 != 0) {
                throw null;
            }
            linearLayout2 = linearLayout3;
        }
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.AdDetailEventWebView$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    AdDetailEventWebView.b(this.f$0, view5);
                }
            });
        }
    }

    private static void e(short s, byte b, int i2, int i3, int i4, Object[] objArr) throws Throwable {
        int i5;
        boolean z;
        int i6 = 2;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43424), 41 - MotionEvent.axisFromString(""), 22439 - (ViewConfiguration.getEdgeSlop() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (!(!z2)) {
                byte[] bArr = onNavigationEvent;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $11 + 103;
                        $10 = i9 % 128;
                        if (i9 % i6 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 12844), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 55, TextUtils.getTrimmedLength("") + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i8 <<= 1;
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i8])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12843), Color.red(0) + 55, 2166 - TextUtils.lastIndexOf("", '0', 0), -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                            i8++;
                        }
                        i6 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i10 = $11 + 115;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    byte[] bArr3 = onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 43424), 42 - (ViewConfiguration.getTouchSlop() >> 8), 22439 - (ViewConfiguration.getTouchSlop() >> 8), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onExtraCallback[i2 + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i12 = ((i2 + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)));
                if (z2) {
                    int i13 = $10 + 67;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i12 + i5;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), (Process.myPid() >> 22) + 86, 9567 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onNavigationEvent;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i15 = 0; i15 < length2; i15++) {
                        bArr5[i15] = (byte) (bArr4[i15] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i16 = $11 + 71;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        int i18 = $11 + 59;
                        $10 = i18 % 128;
                        int i19 = i18 % 2;
                    } else {
                        short[] sArr = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = -389530177;
        IAuthTabCallback = -1538795471;
        onWarmupCompleted = 116700560;
        onNavigationEvent = new byte[]{-62, -9, -10, -60, 18, -48, 7, 6};
    }
}
