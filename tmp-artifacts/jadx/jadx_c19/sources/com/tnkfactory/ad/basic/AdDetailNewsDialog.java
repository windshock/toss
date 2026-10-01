package com.tnkfactory.ad.basic;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdAnalytics;
import com.tnkfactory.ad.basic.AdDetailNewsDialog;
import com.tnkfactory.ad.off.data.AdJoinInfoVo;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.common.TAlertDialog;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdDetailNewsDialog extends DialogFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int[] onNavigationEvent;
    private static int onWarmupCompleted;
    public WebView a;
    public ConstraintLayout b;
    public final ArrayList c;
    public Function1 d;
    public long e;
    public boolean f;
    public boolean g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f28i;
    public final TimeHandler j;
    public boolean k;

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
            if (AdDetailNewsDialog.access$getCheckUrl(AdDetailNewsDialog.this) == null || AdDetailNewsDialog.access$getCheckUrl(AdDetailNewsDialog.this).length() == 0) {
                WebView webView2 = new WebView(webView.getContext());
                Object obj = message.obj;
                Intrinsics.checkNotNull(obj, "");
                ((WebView.WebViewTransport) obj).setWebView(webView2);
                message.sendToTarget();
                final AdDetailNewsDialog adDetailNewsDialog = AdDetailNewsDialog.this;
                webView2.setWebViewClient(new WebViewClient() { // from class: com.tnkfactory.ad.basic.AdDetailNewsDialog$WebChromeClientClass$onCreateWindow$1
                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView3, String str) throws Throwable {
                        Intrinsics.checkNotNullParameter(webView3, "");
                        if (str != null) {
                            try {
                                AdDetailNewsDialog adDetailNewsDialog2 = adDetailNewsDialog;
                                if (StringsKt.startsWith$default(str, "tnkscheme:", false, 2, (Object) null)) {
                                    Uri uri = Uri.parse(str);
                                    Intrinsics.checkNotNullExpressionValue(uri, "");
                                    adDetailNewsDialog2.appScheme(uri);
                                    return true;
                                }
                                if (StringsKt.startsWith$default(str, "market:", false, 2, (Object) null)) {
                                    Intent uri2 = Intent.parseUri(str, 1);
                                    if (uri2 != null) {
                                        adDetailNewsDialog2.startActivity(uri2);
                                    }
                                    return true;
                                }
                                if (StringsKt.startsWith$default(str, "intent:", false, 2, (Object) null)) {
                                    Intent uri3 = Intent.parseUri(str, 1);
                                    String str2 = uri3.getPackage();
                                    if ((str2 != null ? adDetailNewsDialog2.requireActivity().getPackageManager().getLaunchIntentForPackage(str2) : null) != null) {
                                        adDetailNewsDialog2.startActivity(uri3);
                                    } else {
                                        Intent intent = new Intent("android.intent.action.VIEW");
                                        intent.setData(Uri.parse("market://details?id=" + uri3.getPackage()));
                                        adDetailNewsDialog2.startActivity(intent);
                                    }
                                    return true;
                                }
                                if (!StringsKt.startsWith$default(str, "http", false, 2, (Object) null) && StringsKt.contains$default(str, "://", false, 2, (Object) null)) {
                                    Intent uri4 = Intent.parseUri(str, 1);
                                    String str3 = uri4.getPackage();
                                    if ((str3 != null ? adDetailNewsDialog2.requireActivity().getPackageManager().getLaunchIntentForPackage(str3) : null) != null) {
                                        adDetailNewsDialog2.startActivity(uri4);
                                        return true;
                                    }
                                    PackageManager packageManager = adDetailNewsDialog2.requireActivity().getPackageManager();
                                    Intrinsics.checkNotNullExpressionValue(packageManager, "");
                                    Intent intent2 = new Intent("android.intent.action.VIEW");
                                    intent2.setData(Uri.parse(str));
                                    if (packageManager.queryIntentActivities(intent2, 0).size() > 0) {
                                        adDetailNewsDialog2.startActivity(intent2);
                                    }
                                    return true;
                                }
                                if (StringsKt.startsWith$default(str, "http", false, 2, (Object) null) && StringsKt.startsWith$default(str, "tnpick.com", false, 2, (Object) null) && !StringsKt.contains$default(str, "ofr.cps.usr?action=order", false, 2, (Object) null)) {
                                    adDetailNewsDialog2.showBackButton();
                                }
                            } catch (Exception unused) {
                            }
                        }
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(Uri.parse(str));
                        adDetailNewsDialog.startActivity(intent3);
                        return true;
                    }
                });
                return true;
            }
            WebView webView3 = new WebView(webView.getContext());
            AdDetailNewsDialog.access$getChildWebView$p(AdDetailNewsDialog.this).add(webView3);
            webView3.setId(View.generateViewId());
            WebSettings settings = webView3.getSettings();
            Intrinsics.checkNotNullExpressionValue(settings, "");
            settings.setJavaScriptEnabled(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setSupportMultipleWindows(true);
            ViewGroup viewGroupAccess$getRoot$p = AdDetailNewsDialog.access$getRoot$p(AdDetailNewsDialog.this);
            ConstraintLayout constraintLayout = null;
            if (viewGroupAccess$getRoot$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                viewGroupAccess$getRoot$p = null;
            }
            viewGroupAccess$getRoot$p.addView(webView3);
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk();
            AdDetailNewsDialog adDetailNewsDialog2 = AdDetailNewsDialog.this;
            ConstraintLayout constraintLayoutAccess$getRoot$p = AdDetailNewsDialog.access$getRoot$p(adDetailNewsDialog2);
            if (constraintLayoutAccess$getRoot$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                constraintLayoutAccess$getRoot$p = null;
            }
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(constraintLayoutAccess$getRoot$p);
            int id = webView3.getId();
            WebView webViewAccess$getWebView$p = AdDetailNewsDialog.access$getWebView$p(adDetailNewsDialog2);
            if (webViewAccess$getWebView$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                webViewAccess$getWebView$p = null;
            }
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(id, 3, webViewAccess$getWebView$p.getId(), 3);
            ConstraintLayout constraintLayoutAccess$getRoot$p2 = AdDetailNewsDialog.access$getRoot$p(adDetailNewsDialog2);
            if (constraintLayoutAccess$getRoot$p2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                constraintLayout = constraintLayoutAccess$getRoot$p2;
            }
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(constraintLayout);
            webView3.setWebViewClient(AdDetailNewsDialog.this.new AdWebViewClient());
            webView3.setWebChromeClient(AdDetailNewsDialog.this.new WebChromeClientClass());
            Object obj2 = message.obj;
            Intrinsics.checkNotNull(obj2, "");
            ((WebView.WebViewTransport) obj2).setWebView(webView3);
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
            companion.show(context, str2, new Function0() { // from class: com.tnkfactory.ad.basic.AdDetailNewsDialog$WebChromeClientClass$$ExternalSyntheticLambda0
                public final Object invoke() {
                    return AdDetailNewsDialog.WebChromeClientClass.a(jsResult);
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
            companion.show(context, str2, new Function0() { // from class: com.tnkfactory.ad.basic.AdDetailNewsDialog$WebChromeClientClass$$ExternalSyntheticLambda1
                public final Object invoke() {
                    return AdDetailNewsDialog.WebChromeClientClass.b(jsResult);
                }
            }, new Function0() { // from class: com.tnkfactory.ad.basic.AdDetailNewsDialog$WebChromeClientClass$$ExternalSyntheticLambda2
                public final Object invoke() {
                    return AdDetailNewsDialog.WebChromeClientClass.c(jsResult);
                }
            });
            return true;
        }
    }

    static {
        onExtraCallbackWithResult();
        Companion = new Companion(null);
        int i2 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 / 0;
        }
    }

    public AdDetailNewsDialog() {
        super(R.layout.com_tnk_offerwall_cps_detail_webview);
        this.c = new ArrayList();
        this.d = new Function1() { // from class: com.tnkfactory.ad.basic.AdDetailNewsDialog$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return AdDetailNewsDialog.a(((Boolean) obj).booleanValue());
            }
        };
        this.j = new TimeHandler();
    }

    public static final Unit a(boolean z) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 119;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallback + 5;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static final /* synthetic */ ArrayList access$getChildWebView$p(AdDetailNewsDialog adDetailNewsDialog) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 25;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        ArrayList arrayList = adDetailNewsDialog.c;
        if (i5 == 0) {
            int i6 = 91 / 0;
        }
        int i7 = i4 + 93;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return arrayList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ ConstraintLayout access$getRoot$p(AdDetailNewsDialog adDetailNewsDialog) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 105;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        ConstraintLayout constraintLayout = adDetailNewsDialog.b;
        int i6 = i3 + 53;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return constraintLayout;
    }

    public static final /* synthetic */ WebView access$getWebView$p(AdDetailNewsDialog adDetailNewsDialog) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 51;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        WebView webView = adDetailNewsDialog.a;
        if (i4 != 0) {
            int i5 = 1 / 0;
        }
        return webView;
    }

    public final Function1<Boolean, Unit> getOnRequestPayForClick() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 89;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Function1<Boolean, Unit> function1 = this.d;
        int i5 = i4 + 53;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return function1;
        }
        throw null;
    }

    public final ProgressBar getProgressCircular() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 71;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        View view = this.b;
        if (view == null) {
            int i6 = i4 + 21;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            view = null;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i7 != 0) {
                view.hashCode();
                throw null;
            }
            int i8 = onWarmupCompleted + 107;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        View viewFindViewById = view.findViewById(R.id.com_tnk_progress_circular);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        return (ProgressBar) viewFindViewById;
    }

    public final int getScroll() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 15;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        int i6 = this.h;
        int i7 = i4 + 115;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long getSkipCount() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        long j = this.e;
        int i6 = i3 + 107;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final TimeHandler getTimeHandler() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 49;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        TimeHandler timeHandler = this.j;
        int i6 = i4 + 49;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return timeHandler;
        }
        throw null;
    }

    public final int getTimer() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f28i;
        int i7 = i3 + 59;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final TextView getTvNewsResult() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 57;
        onExtraCallback = i3 % 128;
        View view = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        View view2 = this.b;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = onWarmupCompleted + 23;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 % 5;
            }
        } else {
            view = view2;
        }
        View viewFindViewById = view.findViewById(R.id.com_tnk_news_result);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        return (TextView) viewFindViewById;
    }

    public final TextView getTvTimer() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 77;
        onWarmupCompleted = i3 % 128;
        View view = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        View view2 = this.b;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            view = view2;
        }
        View viewFindViewById = view.findViewById(R.id.news_webview_timer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        TextView textView = (TextView) viewFindViewById;
        int i4 = onWarmupCompleted + 25;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return textView;
    }

    public final boolean isDismiss() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 67;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f;
        }
        throw null;
    }

    public final boolean isLoaded() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 113;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        boolean z = this.g;
        int i6 = i3 + 81;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public final boolean isPayed() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 83;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        boolean z = this.k;
        int i6 = i4 + 41;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public final void setDismiss(boolean z) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 25;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        this.f = z;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 69;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 25 / 0;
        }
    }

    public final void setLoaded(boolean z) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 1;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.g = z;
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setOnRequestPayForClick(@Nullable Function1<? super Boolean, Unit> function1) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 63;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        this.d = function1;
        int i6 = i4 + 39;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void setPayed(boolean z) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 123;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        this.k = z;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i3 + 53;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public final void setScroll(int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 57;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.h = i2;
        if (i5 != 0) {
            throw null;
        }
    }

    public final void setSkipCount(long j) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 9;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        this.e = j;
        int i6 = i4 + 85;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void setTimer(int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        this.f28i = i2;
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void showBackButton() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 25;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 55 / 0;
        }
    }

    public final class TimeHandler extends Handler {
        public TimeHandler() {
            super(Looper.getMainLooper());
        }

        public static final Unit a(AdDetailNewsDialog adDetailNewsDialog) {
            adDetailNewsDialog.requestPayForClick();
            return Unit.INSTANCE;
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message message) {
            Intrinsics.checkNotNullParameter(message, "");
            super.handleMessage(message);
            if (AdDetailNewsDialog.this.isDismiss() || AdDetailNewsDialog.access$getPay_yn(AdDetailNewsDialog.this)) {
                return;
            }
            int iCoerceAtMost = RangesKt.coerceAtMost(AdDetailNewsDialog.this.getScroll() / 60, 40);
            if (AdDetailNewsDialog.this.isLoaded()) {
                AdDetailNewsDialog adDetailNewsDialog = AdDetailNewsDialog.this;
                adDetailNewsDialog.setTimer(adDetailNewsDialog.getTimer() + 1);
            }
            if (AdDetailNewsDialog.this.getTimer() > AdDetailNewsDialog.this.getSkipCount()) {
                AdDetailNewsDialog adDetailNewsDialog2 = AdDetailNewsDialog.this;
                adDetailNewsDialog2.setTimer((int) adDetailNewsDialog2.getSkipCount());
            }
            float timer = ((AdDetailNewsDialog.this.getTimer() / AdDetailNewsDialog.this.getSkipCount()) * 50.0f) + (AdDetailNewsDialog.this.isLoaded() ? 10 : 0) + iCoerceAtMost;
            AdDetailNewsDialog.this.getProgressCircular().setProgress((int) timer);
            if (timer <= 99.0f) {
                AdDetailNewsDialog.this.getTimeHandler().sendEmptyMessageDelayed(0, 1000L);
                return;
            }
            ConstraintLayout prevention = AdDetailNewsDialog.this.getPrevention();
            final AdDetailNewsDialog adDetailNewsDialog3 = AdDetailNewsDialog.this;
            AdNewsPreventionView adNewsPreventionView = new AdNewsPreventionView(prevention, new Function0() { // from class: com.tnkfactory.ad.basic.AdDetailNewsDialog$TimeHandler$$ExternalSyntheticLambda0
                public final Object invoke() {
                    return AdDetailNewsDialog.TimeHandler.a(adDetailNewsDialog3);
                }
            });
            final AdDetailNewsDialog adDetailNewsDialog4 = AdDetailNewsDialog.this;
            adNewsPreventionView.setRndNum();
            View viewFindViewById = adDetailNewsDialog4.getPrevention().findViewById(R.id.com_tnk_off_news_prevention_close);
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.AdDetailNewsDialog$TimeHandler$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AdDetailNewsDialog.TimeHandler.a(adDetailNewsDialog4, view);
                    }
                });
            }
            AdDetailNewsDialog.this.getPrevention().setVisibility(0);
            AdDetailNewsDialog.this.getTimeHandler().removeMessages(0);
        }

        public static final void a(AdDetailNewsDialog adDetailNewsDialog, View view) {
            Toast.makeText((Context) adDetailNewsDialog.getActivity(), (CharSequence) "적립되지 않았습니다.", 0).show();
            adDetailNewsDialog.dismiss();
        }
    }

    public static final void a(AdDetailNewsDialog adDetailNewsDialog, View view) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        adDetailNewsDialog.dismiss();
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = onExtraCallback + 13;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final long access$getAppId(AdDetailNewsDialog adDetailNewsDialog) {
        Bundle arguments;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 33;
        onWarmupCompleted = i3 % 128;
        long j = 0;
        if (i3 % 2 == 0 ? (arguments = adDetailNewsDialog.getArguments()) != null : (arguments = adDetailNewsDialog.getArguments()) != null) {
            j = arguments.getLong("app_id", 0L);
        }
        int i4 = onExtraCallback + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public static final String access$getCheckUrl(AdDetailNewsDialog adDetailNewsDialog) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 51;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Bundle arguments = adDetailNewsDialog.getArguments();
        if (arguments != null) {
            int i5 = onWarmupCompleted + 47;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            String string = arguments.getString("check_url", "");
            if (string != null) {
                return string;
            }
        }
        int i7 = onWarmupCompleted + 93;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return "";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final int access$getCnts_type(AdDetailNewsDialog adDetailNewsDialog) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 45;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Bundle arguments = adDetailNewsDialog.getArguments();
        if (arguments == null) {
            return 0;
        }
        int i5 = onWarmupCompleted + 67;
        onExtraCallback = i5 % 128;
        int i6 = arguments.getInt("cnts_type", i5 % 2 == 0 ? 1 : 0);
        int i7 = onWarmupCompleted + 117;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r3 = r3.getBoolean("pay_yn", false);
        r1 = com.tnkfactory.ad.basic.AdDetailNewsDialog.onWarmupCompleted + 51;
        com.tnkfactory.ad.basic.AdDetailNewsDialog.onExtraCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean access$getPay_yn(AdDetailNewsDialog adDetailNewsDialog) {
        Bundle arguments;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 71;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            arguments = adDetailNewsDialog.getArguments();
            int i4 = 44 / 0;
        } else {
            arguments = adDetailNewsDialog.getArguments();
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 95;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        super.onCreate(bundle);
        setStyle(1, R.style.tnk_full_screen_dialog);
        int i5 = onWarmupCompleted + 19;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        int i2 = 2 % 2;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "");
        dialogOnCreateDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.tnkfactory.ad.basic.AdDetailNewsDialog$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                return AdDetailNewsDialog.a(this.f$0, dialogInterface, i3, keyEvent);
            }
        });
        int i3 = onExtraCallback + 83;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return dialogOnCreateDialog;
    }

    public void onPause() {
        TimeHandler timeHandler;
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 117;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            super/*androidx.fragment.app.Fragment*/.onPause();
            timeHandler = this.j;
            i2 = 1;
        } else {
            super/*androidx.fragment.app.Fragment*/.onPause();
            timeHandler = this.j;
            i2 = 0;
        }
        timeHandler.removeMessages(i2);
        int i5 = onExtraCallback + 25;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public void onDestroy() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 53;
        onWarmupCompleted = i3 % 128;
        WebView webView = null;
        if (i3 % 2 != 0) {
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
            int i4 = onExtraCallback + 103;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            webView3 = null;
        }
        viewGroup.removeView(webView3);
        WebView webView4 = this.a;
        if (webView4 == null) {
            int i6 = onExtraCallback + 45;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            webView = webView4;
        }
        webView.destroy();
        super/*androidx.fragment.app.Fragment*/.onDestroy();
    }

    public static final void a(AdDetailNewsDialog adDetailNewsDialog, View view, int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        int i7 = onExtraCallback + 79;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        if (adDetailNewsDialog.g) {
            adDetailNewsDialog.h = RangesKt.coerceAtLeast(i3, adDetailNewsDialog.h);
        }
        int i9 = onExtraCallback + 23;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
    }

    public final void requestPayForClick() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 57;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.k) {
            return;
        }
        this.k = true;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new com.tnkfactory.ad.b.d(this, null), 2, (Object) null);
        int i4 = onWarmupCompleted + 95;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026 A[PHI: r1
      0x0026: PHI (r1v5 android.os.Bundle) = (r1v4 android.os.Bundle), (r1v10 android.os.Bundle) binds: [B:9:0x0024, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onResume() {
        Bundle arguments;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 63;
        onWarmupCompleted = i3 % 128;
        long j = 0;
        if (i3 % 2 != 0) {
            super/*androidx.fragment.app.Fragment*/.onResume();
            arguments = getArguments();
            if (arguments != null) {
                j = arguments.getLong("cnts_skip", 0L);
                int i4 = onExtraCallback + 5;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            } else {
                j = 1;
            }
        } else {
            super/*androidx.fragment.app.Fragment*/.onResume();
            arguments = getArguments();
            if (arguments != null) {
            }
        }
        this.e = j;
        this.j.removeMessages(0);
        this.j.sendEmptyMessageDelayed(0, 1000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[PHI: r2
      0x0064: PHI (r2v16 android.view.View) = (r2v15 android.view.View), (r2v21 android.view.View) binds: [B:18:0x0062, B:15:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[PHI: r0 r2
      0x0071: PHI (r0v7 androidx.constraintlayout.widget.ConstraintLayout) = (r0v1 androidx.constraintlayout.widget.ConstraintLayout), (r0v8 androidx.constraintlayout.widget.ConstraintLayout) binds: [B:18:0x0062, B:15:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0071: PHI (r2v18 android.view.View) = (r2v15 android.view.View), (r2v21 android.view.View) binds: [B:18:0x0062, B:15:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ConstraintLayout getPrevention() {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 55;
        onExtraCallback = i3 % 128;
        ConstraintLayout constraintLayout3 = null;
        if (i3 % 2 == 0) {
            constraintLayout = this.b;
            int i4 = 16 / 0;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                constraintLayout = null;
            }
        } else {
            constraintLayout = this.b;
            if (constraintLayout == null) {
            }
        }
        View view = (ConstraintLayout) constraintLayout.findViewWithTag("prevention");
        if (view == null) {
            int i5 = onExtraCallback + 111;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                View viewInflate = getLayoutInflater().inflate(R.layout.com_tnk_offerwall_news_prevention, (ViewGroup) null, false);
                Intrinsics.checkNotNull(viewInflate, "");
                view = (ConstraintLayout) viewInflate;
                view.setTag("prevention");
                constraintLayout2 = this.b;
                if (constraintLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i6 = onWarmupCompleted + 11;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    constraintLayout3 = constraintLayout2;
                }
            } else {
                View viewInflate2 = getLayoutInflater().inflate(R.layout.com_tnk_offerwall_news_prevention, (ViewGroup) null, false);
                Intrinsics.checkNotNull(viewInflate2, "");
                view = (ConstraintLayout) viewInflate2;
                view.setTag("prevention");
                constraintLayout2 = this.b;
                if (constraintLayout2 == null) {
                }
            }
            constraintLayout3.addView(view, -1, -1);
            view.setVisibility(8);
        }
        return view;
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final AdDetailNewsDialog newInstance(@NotNull AdListVo adListVo) {
            Intrinsics.checkNotNullParameter(adListVo, "");
            Bundle bundle = new Bundle();
            bundle.putString("targetUrl", adListVo.getClickUrl());
            bundle.putLong("app_id", adListVo.getAppId());
            bundle.putInt("cnts_type", adListVo.getCnts_type());
            bundle.putLong("cnts_skip", adListVo.getCnts_skip());
            bundle.putBoolean("pay_yn", Intrinsics.areEqual(adListVo.getPayYn(), "Y"));
            AdDetailNewsDialog adDetailNewsDialog = new AdDetailNewsDialog();
            adDetailNewsDialog.setArguments(bundle);
            adDetailNewsDialog.setSkipCount(adListVo.getCnts_skip());
            return adDetailNewsDialog;
        }

        public final AdDetailNewsDialog newInstance(@NotNull AdListVo adListVo, @NotNull AdJoinInfoVo adJoinInfoVo) {
            Intrinsics.checkNotNullParameter(adListVo, "");
            Intrinsics.checkNotNullParameter(adJoinInfoVo, "");
            long cnts_skip = ((long) adJoinInfoVo.getCnts_skip()) >= 1 ? adJoinInfoVo.getCnts_skip() : 1L;
            Bundle bundle = new Bundle();
            bundle.putLong("app_id", adListVo.getAppId());
            bundle.putBoolean("pay_yn", Intrinsics.areEqual(adListVo.getPayYn(), "Y"));
            bundle.putString("targetUrl", adJoinInfoVo.getMkt_app_id());
            bundle.putInt("cnts_type", adJoinInfoVo.getCnts_type());
            bundle.putLong("cnts_skip", cnts_skip);
            bundle.putString("check_url", adJoinInfoVo.getCheck_url());
            AdDetailNewsDialog adDetailNewsDialog = new AdDetailNewsDialog();
            adDetailNewsDialog.setArguments(bundle);
            adDetailNewsDialog.setSkipCount(cnts_skip);
            return adDetailNewsDialog;
        }
    }

    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        this.f = true;
        TnkAdAnalytics tnkAdAnalytics = TnkAdAnalytics.INSTANCE;
        HashMap<String, String> map = new HashMap<>();
        Bundle arguments = getArguments();
        long j = 0;
        if (arguments != null) {
            int i3 = onExtraCallback + 79;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            j = arguments.getLong("app_id", 0L);
        }
        map.put("item_id", String.valueOf(j));
        map.put("item_name", "news_ad");
        Unit unit = Unit.INSTANCE;
        tnkAdAnalytics.logEvent("ad_detail_close", map);
        int i5 = onExtraCallback + 125;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
    }

    public final void appScheme(@NotNull Uri uri) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        String host = uri.getHost();
        Object obj = null;
        if (host != null) {
            int i3 = onExtraCallback + 105;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                host.hashCode();
                obj.hashCode();
                throw null;
            }
            int iHashCode = host.hashCode();
            if (iHashCode != -2061496180) {
                if (iHashCode == -1564059516) {
                    int i4 = onExtraCallback + 107;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        host.equals("open_new_window");
                        obj.hashCode();
                        throw null;
                    }
                    if (host.equals("open_new_window")) {
                        Object[] objArr = new Object[1];
                        l(new int[]{643545092, -394802042}, View.resolveSizeAndState(0, 0, 0) + 3, objArr);
                        final String queryParameter = uri.getQueryParameter(((String) objArr[0]).intern());
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tnkfactory.ad.basic.AdDetailNewsDialog$$ExternalSyntheticLambda4
                            @Override // java.lang.Runnable
                            public final void run() {
                                AdDetailNewsDialog.a(this.f$0, queryParameter);
                            }
                        });
                        return;
                    }
                }
            } else if (host.equals("close_view")) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tnkfactory.ad.basic.AdDetailNewsDialog$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdDetailNewsDialog.a(this.f$0);
                    }
                });
            }
        }
        int i5 = onWarmupCompleted + 5;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final boolean a(AdDetailNewsDialog adDetailNewsDialog, DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        int i3 = 2 % 2;
        if (i2 != 4) {
            return false;
        }
        int i4 = onExtraCallback + 39;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            if (keyEvent.getAction() != 1) {
                return false;
            }
        } else if (keyEvent.getAction() != 1) {
            return false;
        }
        WebView webView = null;
        if (adDetailNewsDialog.c.size() <= 0) {
            WebView webView2 = adDetailNewsDialog.a;
            if (webView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                webView2 = null;
            }
            if (!(!webView2.canGoBack())) {
                WebView webView3 = adDetailNewsDialog.a;
                if (webView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    webView = webView3;
                }
                webView.goBack();
            } else {
                adDetailNewsDialog.dismiss();
            }
            return true;
        }
        WebView webView4 = (WebView) CollectionsKt.last(adDetailNewsDialog.c);
        if (webView4.canGoBack()) {
            webView4.goBack();
        } else {
            adDetailNewsDialog.c.remove(webView4);
            WebView webView5 = adDetailNewsDialog.b;
            if (webView5 == null) {
                int i5 = onWarmupCompleted + 101;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i7 = onExtraCallback + 113;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
            } else {
                webView = webView5;
            }
            webView.removeView(webView4);
            webView4.destroy();
            int i9 = onExtraCallback + 125;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
        }
        return true;
    }

    public static final void a(AdDetailNewsDialog adDetailNewsDialog) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 61;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        adDetailNewsDialog.dismiss();
        if (i4 == 0) {
            int i5 = 80 / 0;
        }
        int i6 = onWarmupCompleted + 11;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 23 / 0;
        }
    }

    public static final void a(AdDetailNewsDialog adDetailNewsDialog, String str) {
        int i2 = 2 % 2;
        PackageManager packageManager = adDetailNewsDialog.requireActivity().getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "");
        if (listQueryIntentActivities.size() > 0) {
            int i3 = onWarmupCompleted + 67;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            adDetailNewsDialog.startActivity(intent);
            if (i4 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        String string;
        String string2;
        int i2 = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(view, "");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        View view2 = (ConstraintLayout) view;
        this.b = view2;
        WebView webView = null;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view2 = null;
        }
        this.a = (WebView) view2.findViewById(R.id.com_tnk_off_detail_webview);
        View view3 = this.b;
        if (view3 == null) {
            int i3 = onWarmupCompleted + 31;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            view3 = null;
        }
        View viewFindViewById = view3.findViewById(R.id.com_tnk_off_iv_detail_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.AdDetailNewsDialog$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                AdDetailNewsDialog.a(this.f$0, view4);
            }
        });
        getProgressCircular().setVisibility(0);
        getProgressCircular().setProgress(100);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("check_url", "")) == null) {
            string = "";
        }
        if (TextUtils.isEmpty(string)) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                int i5 = onExtraCallback + 109;
                onWarmupCompleted = i5 % 128;
                if (!(i5 % 2 != 0 ? arguments2.getBoolean("pay_yn", true) : arguments2.getBoolean("pay_yn", false))) {
                    getTvNewsResult().setText("기사를 끝까지 읽어주세요");
                } else {
                    int i6 = onExtraCallback + 85;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    getTvNewsResult().setText("적립이 완료된 기사입니다");
                    int i8 = onExtraCallback + 31;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
        } else {
            getTvNewsResult().setText("해당 페이지로 이동해주세요.");
        }
        WebView webView2 = this.a;
        if (webView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView2 = null;
        }
        webView2.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.tnkfactory.ad.basic.AdDetailNewsDialog$$ExternalSyntheticLambda3
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view4, int i10, int i11, int i12, int i13) {
                AdDetailNewsDialog.a(this.f$0, view4, i10, i11, i12, i13);
            }
        });
        Bundle arguments3 = getArguments();
        if (arguments3 != null && arguments3.getBoolean("pay_yn", false)) {
            getTvTimer().setText("");
        }
        setCancelable(false);
        WebView webView3 = this.a;
        if (webView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView3 = null;
        }
        webView3.setWebChromeClient(new WebChromeClientClass());
        WebView webView4 = this.a;
        if (webView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView4 = null;
        }
        webView4.setNetworkAvailable(true);
        WebView webView5 = this.a;
        if (webView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView5 = null;
        }
        webView5.getSettings().setJavaScriptEnabled(true);
        WebView webView6 = this.a;
        if (webView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView6 = null;
        }
        webView6.getSettings().setDomStorageEnabled(true);
        WebView webView7 = this.a;
        if (webView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView7 = null;
        }
        webView7.getSettings().setTextZoom(100);
        WebView webView8 = this.a;
        if (webView8 == null) {
            int i10 = onWarmupCompleted + 45;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i12 = onWarmupCompleted + 53;
            onExtraCallback = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 3 % 3;
            }
            webView8 = null;
        }
        webView8.getSettings().setMixedContentMode(0);
        WebView webView9 = this.a;
        if (webView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView9 = null;
        }
        webView9.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        WebView webView10 = this.a;
        if (webView10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView10 = null;
        }
        webView10.getSettings().setSupportMultipleWindows(true);
        WebView webView11 = this.a;
        if (webView11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView11 = null;
        }
        webView11.setScrollBarStyle(0);
        WebView webView12 = this.a;
        if (webView12 == null) {
            int i14 = onWarmupCompleted + 1;
            onExtraCallback = i14 % 128;
            int i15 = i14 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView12 = null;
        }
        webView12.setWebViewClient(new AdWebViewClient());
        WebView webView13 = this.a;
        if (webView13 == null) {
            int i16 = onExtraCallback + 107;
            onWarmupCompleted = i16 % 128;
            if (i16 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i17 = 85 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
        } else {
            webView = webView13;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null && (string2 = arguments4.getString("targetUrl", "")) != null) {
            str = string2;
        }
        webView.loadUrl(str);
    }

    public final class AdWebViewClient extends WebViewClient {
        public AdWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@NotNull WebView webView, @Nullable String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            if (AdDetailNewsDialog.access$getCheckUrl(AdDetailNewsDialog.this).length() == 0 || Intrinsics.areEqual(AdDetailNewsDialog.access$getCheckUrl(AdDetailNewsDialog.this), str)) {
                AdDetailNewsDialog.this.setLoaded(true);
            } else if (str != null) {
                AdDetailNewsDialog adDetailNewsDialog = AdDetailNewsDialog.this;
                if (StringsKt.contains$default(str, AdDetailNewsDialog.access$getCheckUrl(adDetailNewsDialog), false, 2, (Object) null)) {
                    adDetailNewsDialog.setLoaded(true);
                    adDetailNewsDialog.getTvNewsResult().setText(adDetailNewsDialog.getSkipCount() + "초 머물러주세요.");
                }
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@NotNull WebView webView, @Nullable String str) throws Throwable {
            Intrinsics.checkNotNullParameter(webView, "");
            if (str != null) {
                try {
                    AdDetailNewsDialog adDetailNewsDialog = AdDetailNewsDialog.this;
                    if (StringsKt.startsWith$default(str, "tnkscheme:", false, 2, (Object) null)) {
                        Uri uri = Uri.parse(str);
                        Intrinsics.checkNotNullExpressionValue(uri, "");
                        adDetailNewsDialog.appScheme(uri);
                        return true;
                    }
                    if (StringsKt.startsWith$default(str, "market:", false, 2, (Object) null)) {
                        Intent uri2 = Intent.parseUri(str, 1);
                        if (uri2 != null) {
                            adDetailNewsDialog.startActivity(uri2);
                        }
                        return true;
                    }
                    if (StringsKt.startsWith$default(str, "intent:", false, 2, (Object) null)) {
                        Intent uri3 = Intent.parseUri(str, 1);
                        String str2 = uri3.getPackage();
                        if ((str2 != null ? adDetailNewsDialog.requireActivity().getPackageManager().getLaunchIntentForPackage(str2) : null) != null) {
                            adDetailNewsDialog.startActivity(uri3);
                        } else {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse("market://details?id=" + uri3.getPackage()));
                            adDetailNewsDialog.startActivity(intent);
                        }
                        return true;
                    }
                    if (!StringsKt.startsWith$default(str, "http", false, 2, (Object) null) && StringsKt.contains$default(str, "://", false, 2, (Object) null)) {
                        Intent uri4 = Intent.parseUri(str, 1);
                        String str3 = uri4.getPackage();
                        if ((str3 != null ? adDetailNewsDialog.requireActivity().getPackageManager().getLaunchIntentForPackage(str3) : null) != null) {
                            adDetailNewsDialog.startActivity(uri4);
                            return true;
                        }
                        PackageManager packageManager = adDetailNewsDialog.requireActivity().getPackageManager();
                        Intrinsics.checkNotNullExpressionValue(packageManager, "");
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setData(Uri.parse(str));
                        if (packageManager.queryIntentActivities(intent2, 0).size() > 0) {
                            adDetailNewsDialog.startActivity(intent2);
                        }
                        return true;
                    }
                    if (StringsKt.startsWith$default(str, "http", false, 2, (Object) null) && StringsKt.startsWith$default(str, "tnpick.com", false, 2, (Object) null) && !StringsKt.contains$default(str, "ofr.cps.usr?action=order", false, 2, (Object) null)) {
                        adDetailNewsDialog.showBackButton();
                    }
                } catch (Exception unused) {
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    private static void l(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onNavigationEvent;
        char c = '0';
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i7 = 0;
            while (i7 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), 72 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 8847 - TextUtils.lastIndexOf("", c, 0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    c = '0';
                    i5 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = onNavigationEvent;
        int i8 = 17;
        if (iArr6 != null) {
            int i9 = $10 + 91;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                int i10 = $10 + i8;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i6] = Integer.valueOf(iArr6[i3]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(i6), TextUtils.lastIndexOf("", '0', i6) + 73, 8849 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr6[i3])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 72 - (ViewConfiguration.getTapTimeout() >> 16), 8848 - Drawable.resolveOpacity(0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i3++;
                }
                i8 = 17;
                i6 = 0;
            }
            iArr6 = iArr2;
        }
        int i11 = i6;
        System.arraycopy(iArr6, i11, iArr5, i11, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i11;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i11] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i12];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - ImageFormat.getBitsPerPixel(0)), KeyEvent.normalizeMetaState(0) + 39, 10301 - (ViewConfiguration.getTouchSlop() >> 8), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i12++;
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4032 - MotionEvent.axisFromString("")), View.combineMeasuredStates(0, 0) + 78, 7398 - Color.red(0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            i11 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = new int[]{1032638855, 1599214656, -1962224243, 2042277607, 50015766, 1617880023, 1321915781, -182012594, 1542185171, 78819206, 431443408, -879493949, 615252885, -1609442213, 205353863, 2003124801, 201067512, 1000690888};
    }
}
