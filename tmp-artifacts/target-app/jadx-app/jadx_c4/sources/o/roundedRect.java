package o;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Process;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.webkit.ClientCertRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import im.toss.core.webkit.TossBridgeWebView;
import im.toss.core.webkit.TossWebViewClient$;
import im.toss.features.loan.comparison.result.view.LoanComparisonResultWarningNoticeView;
import im.toss.splittarget.impl.fsm.AppStateImpl$;
import java.lang.reflect.Method;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.r8lambda0grt42NLozkvlz2kicXj5Z0ej8U;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class roundedRect extends ALCFocusCircle {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static final r8lambda0grt42NLozkvlz2kicXj5Z0ej8U onExtraCallbackWithResult;
    private static int onTransact;
    private final boolean onExtraCallback;
    private final surfaceCreated onNavigationEvent;
    private final boolean onWarmupCompleted;

    /* JADX WARN: Illegal instructions before constructor call */
    public roundedRect() {
        IconRoundCornerProgressBar1 iconRoundCornerProgressBar1 = null;
        this(iconRoundCornerProgressBar1, 1, iconRoundCornerProgressBar1);
    }

    public static /* synthetic */ void IAuthTabCallback(WebView webView, roundedRect roundedrect, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(webView, roundedrect, str);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = asInterface + 93;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    protected String onExtraCallback(@NotNull WebView webView) {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        int i4 = IAuthTabCallbackStub + 119;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return null;
    }

    protected boolean onNavigationEvent(@NotNull WebView webView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        int i4 = IAuthTabCallbackStub + 111;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    protected boolean rA_(@NotNull WebView webView, @Nullable RenderProcessGoneDetail renderProcessGoneDetail, @NotNull r8lambda0grt42NLozkvlz2kicXj5Z0ej8U.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        return i3 != 0;
    }

    protected boolean rB_(@NotNull WebView webView, @Nullable RenderProcessGoneDetail renderProcessGoneDetail, @NotNull r8lambda0grt42NLozkvlz2kicXj5Z0ej8U.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        int i4 = IAuthTabCallbackStub + 111;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public roundedRect(@NotNull IconRoundCornerProgressBar1 iconRoundCornerProgressBar1) {
        super(iconRoundCornerProgressBar1);
        Intrinsics.checkNotNullParameter(iconRoundCornerProgressBar1, "");
        this.onNavigationEvent = new surfaceCreated();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ roundedRect(IconRoundCornerProgressBar1 iconRoundCornerProgressBar1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallbackStub + 43;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                iconRoundCornerProgressBar1 = drawTopText.Companion.IAuthTabCallback();
                int i3 = asInterface + 35;
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            } else {
                drawTopText.Companion.IAuthTabCallback();
                throw null;
            }
        }
        this(iconRoundCornerProgressBar1);
    }

    public boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        boolean z = this.onWarmupCompleted;
        int i5 = i3 + 95;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final surfaceCreated onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(WebView webView, roundedRect roundedrect, String str) {
        int i;
        int i2 = 2 % 2;
        int textZoom = webView.getSettings().getTextZoom();
        if (str != null) {
            int i3 = IAuthTabCallbackStub + 97;
            asInterface = i3 % 128;
            i = (i3 % 2 != 0 ? Boolean.parseBoolean(str) : Boolean.parseBoolean(str)) ? 100 : (int) (webView.getResources().getConfiguration().fontScale * 100.0f);
        }
        if (textZoom != i) {
            int i4 = asInterface + 57;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                boolean z = roundedrect.onExtraCallback;
                int i5 = 28 / 0;
            } else {
                boolean z2 = roundedrect.onExtraCallback;
            }
            webView.getSettings().setTextZoom(i);
        }
    }

    private final void onWarmupCompleted(WebView webView) {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            if (IAuthTabCallback()) {
                webView.evaluateJavascript(onNavigationEvent("toss:support-font-scale", "on"), new TossWebViewClient$.ExternalSyntheticLambda0(webView, this));
                return;
            }
            webView.getSettings().setTextZoom(100);
            int i3 = asInterface + 121;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        IAuthTabCallback();
        throw null;
    }

    @Override // o.setFaceBox, o.setTopGuideSpacing, android.webkit.WebViewClient
    public void onPageStarted(@NotNull WebView webView, @NotNull String str, @Nullable Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            super.onPageStarted(webView, str, bitmap);
            this.onNavigationEvent.onExtraCallbackWithResult(webView, str);
            onWarmupCompleted(webView);
            IAuthTabCallback(webView);
            return;
        }
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(str, "");
        super.onPageStarted(webView, str, bitmap);
        this.onNavigationEvent.onExtraCallbackWithResult(webView, str);
        onWarmupCompleted(webView);
        IAuthTabCallback(webView);
        int i3 = 22 / 0;
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(@NotNull WebView webView, @NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(str, "");
        super.onPageCommitVisible(webView, str);
        onWarmupCompleted(webView);
        int i4 = asInterface + 43;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceivedSslError(@NotNull WebView webView, @NotNull SslErrorHandler sslErrorHandler, @NotNull SslError sslError) {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(sslErrorHandler, "");
            Intrinsics.checkNotNullParameter(sslError, "");
            int i3 = 37 / 0;
            if (this.onExtraCallback) {
                Objects.toString(sslError);
                int i4 = asInterface + 51;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(sslErrorHandler, "");
            Intrinsics.checkNotNullParameter(sslError, "");
            if (this.onExtraCallback) {
            }
        }
        this.onNavigationEvent.onWarmupCompleted(webView, sslError);
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(@NotNull WebView webView, @NotNull WebResourceRequest webResourceRequest, @NotNull WebResourceError webResourceError) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(webResourceRequest, "");
        Intrinsics.checkNotNullParameter(webResourceError, "");
        surfaceCreated surfacecreated = this.onNavigationEvent;
        Uri url = webResourceRequest.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "");
        surfacecreated.IAuthTabCallback(webView, url, webResourceError);
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        int i4 = asInterface + 37;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(@NotNull WebView webView, @NotNull WebResourceRequest webResourceRequest, @NotNull WebResourceResponse webResourceResponse) {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(webResourceRequest, "");
        Intrinsics.checkNotNullParameter(webResourceResponse, "");
        surfaceCreated surfacecreated = this.onNavigationEvent;
        Uri url = webResourceRequest.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "");
        surfacecreated.onNavigationEvent(webView, url, webResourceResponse);
        drawTopText.Companion.onExtraCallback().onExtraCallbackWithResult(webView, webResourceRequest, webResourceResponse);
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        int i4 = IAuthTabCallbackStub + 85;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(@NotNull WebView webView, @NotNull ClientCertRequest clientCertRequest) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(clientCertRequest, "");
        if (drawTopText.Companion.onExtraCallback().onNavigationEvent(webView, clientCertRequest)) {
            return;
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
        int i4 = asInterface + 31;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.setFaceBox, android.webkit.WebViewClient
    public void onPageFinished(@NotNull WebView webView, @NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(str, "");
        super.onPageFinished(webView, str);
        onWarmupCompleted(webView);
        Object[] objArr = {this.onNavigationEvent, webView, str};
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        surfaceCreated.onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 647608958, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, -647608955, iOnWarmupCompleted, objArr);
        drawTopText.Companion.onExtraCallback().onNavigationEvent(webView, str);
        int i4 = IAuthTabCallbackStub + 69;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onRenderProcessGone(@NotNull WebView webView, @Nullable RenderProcessGoneDetail renderProcessGoneDetail) throws Throwable {
        boolean zDidCrash;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(webView, "");
            int i3 = 8 / 0;
            if (renderProcessGoneDetail != null) {
                zDidCrash = renderProcessGoneDetail.didCrash();
                int i4 = asInterface + 81;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
            } else {
                zDidCrash = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(webView, "");
            if (renderProcessGoneDetail != null) {
            }
        }
        if (this.onExtraCallback) {
            webView.getClass().getSimpleName();
        }
        this.onNavigationEvent.qG_(webView, renderProcessGoneDetail);
        if (!onExtraCallbackWithResult(webView)) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            b(true, new byte[]{1, 0, 0, 1, 0, 0}, new int[]{0, 6, 0, 4}, objArr);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "disabled");
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("didCrash", String.valueOf(zDidCrash));
            Object[] objArr2 = new Object[1];
            b(false, new byte[]{1, 1, 0}, new int[]{6, 3, 0, 0}, objArr2);
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "TossWebViewClient", "renderProcessGone", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), Companion.onExtraCallbackWithResult(webView.getUrl())), getWrite.IAuthTabCallback("webView", webView.getClass().getSimpleName())}), (String) null, false, (String) null, 56, (Object) null);
            return qD_(webView, renderProcessGoneDetail);
        }
        r8lambda0grt42NLozkvlz2kicXj5Z0ej8U.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = onExtraCallbackWithResult.onNavigationEvent(webView, zDidCrash, onNavigationEvent(webView), onExtraCallback(webView));
        if (this.onExtraCallback) {
            iAuthTabCallbackOnNavigationEvent.onExtraCallbackWithResult();
            iAuthTabCallbackOnNavigationEvent.onExtraCallback();
        }
        if (!iAuthTabCallbackOnNavigationEvent.onExtraCallbackWithResult()) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr3 = new Object[1];
            b(true, new byte[]{1, 0, 0, 1, 0, 0}, new int[]{0, 6, 0, 4}, objArr3);
            Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), "unrecoverable");
            Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("didCrash", String.valueOf(zDidCrash));
            Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("crashCount", String.valueOf(iAuthTabCallbackOnNavigationEvent.onExtraCallback()));
            Object[] objArr4 = new Object[1];
            b(false, new byte[]{1, 1, 0}, new int[]{6, 3, 0, 0}, objArr4);
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray2, "TossWebViewClient", "renderProcessGone", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), Companion.onExtraCallbackWithResult(webView.getUrl())), getWrite.IAuthTabCallback("webView", webView.getClass().getSimpleName())}), (String) null, false, (String) null, 56, (Object) null);
            return rB_(webView, renderProcessGoneDetail, iAuthTabCallbackOnNavigationEvent);
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray3 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr5 = new Object[1];
        b(true, new byte[]{1, 0, 0, 1, 0, 0}, new int[]{0, 6, 0, 4}, objArr5);
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), "recoverable");
        Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback("didCrash", String.valueOf(zDidCrash));
        Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback("crashCount", String.valueOf(iAuthTabCallbackOnNavigationEvent.onExtraCallback()));
        Object[] objArr6 = new Object[1];
        b(false, new byte[]{1, 1, 0}, new int[]{6, 3, 0, 0}, objArr6);
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray3, "TossWebViewClient", "renderProcessGone", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback6, pairIAuthTabCallback7, pairIAuthTabCallback8, getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), Companion.onExtraCallbackWithResult(webView.getUrl())), getWrite.IAuthTabCallback("webView", webView.getClass().getSimpleName())}), (String) null, false, (String) null, 56, (Object) null);
        this.onNavigationEvent.onWarmupCompleted(webView);
        if (rA_(webView, renderProcessGoneDetail, iAuthTabCallbackOnNavigationEvent)) {
            return true;
        }
        int i6 = asInterface + 95;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return qC_(webView, renderProcessGoneDetail);
    }

    private final boolean qC_(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        TossBridgeWebView tossBridgeWebView;
        int i = 2 % 2;
        if (webView instanceof TossBridgeWebView) {
            tossBridgeWebView = (TossBridgeWebView) webView;
        } else {
            int i2 = IAuthTabCallbackStub + 59;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            tossBridgeWebView = null;
        }
        if (tossBridgeWebView != null) {
            return tossBridgeWebView.qB_(renderProcessGoneDetail);
        }
        int i4 = IAuthTabCallbackStub + 7;
        asInterface = i4 % 128;
        return i4 % 2 == 0;
    }

    protected boolean onExtraCallbackWithResult(@NotNull WebView webView) {
        TossBridgeWebView tossBridgeWebView;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        if (webView instanceof TossBridgeWebView) {
            tossBridgeWebView = (TossBridgeWebView) webView;
            int i2 = IAuthTabCallbackStub + 115;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
        } else {
            tossBridgeWebView = null;
        }
        if (tossBridgeWebView == null) {
            int i4 = IAuthTabCallbackStub;
            int i5 = i4 + 55;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 107;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (tossBridgeWebView.ICustomTabsCallback()) {
            return ((Boolean) TossBridgeWebView.Companion.onExtraCallbackWithResult().invoke()).booleanValue();
        }
        int i9 = asInterface;
        int i10 = i9 + 125;
        IAuthTabCallbackStub = i10 % 128;
        int i11 = i10 % 2;
        int i12 = i9 + 69;
        IAuthTabCallbackStub = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i;
        Throwable cause;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = IAuthTabCallback;
        Object obj = null;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = $11 + 107;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 35283), Color.alpha(0) + 35, 14239 - (ViewConfiguration.getWindowTouchSlop() >> 8), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause2 = th.getCause();
                    if (cause2 == null) {
                        throw th;
                    }
                    throw cause2;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), 30 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), Color.alpha(0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = $10 + 33;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 10935), (ViewConfiguration.getJumpTapTimeout() >> 16) + 65, KeyEvent.keyCodeFromString("") + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        obj.hashCode();
                        throw null;
                    }
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16788151), 65 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 16718 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    } catch (Throwable th2) {
                        cause = th2.getCause();
                        if (cause != null) {
                        }
                    }
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 49468), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 69, 12486 - Gravity.getAbsoluteGravity(0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            int i14 = $10 + 53;
            $11 = i14 % 128;
            i = 2;
            int i15 = i14 % 2;
            cArr3 = cArr4;
        } else {
            i = 2;
        }
        if (i6 > 0) {
            int i16 = $11 + 43;
            $10 = i16 % 128;
            int i17 = i16 % i;
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i18 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i18, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i18);
        }
        if (!(!z)) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    protected final boolean qD_(@NotNull WebView webView, @Nullable RenderProcessGoneDetail renderProcessGoneDetail) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(webView, "");
            super.onRenderProcessGone(webView, renderProcessGoneDetail);
            throw null;
        }
        Intrinsics.checkNotNullParameter(webView, "");
        boolean zOnRenderProcessGone = super.onRenderProcessGone(webView, renderProcessGoneDetail);
        int i3 = IAuthTabCallbackStub + 55;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return zOnRenderProcessGone;
        }
        obj.hashCode();
        throw null;
    }

    private final String onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        String strTrimIndent = StringsKt.trimIndent("(function() {\n            var metas = document.getElementsByTagName('meta');\n            for (var i=0; i<metas.length; i++) {\n                if (metas[i].getAttribute(\"name\") == \"" + str + "\") {\n                    return metas[i].getAttribute(\"content\").includes(\"" + str2 + "\");\n                }\n            }\n            return false;\n        })();");
        int i2 = asInterface + 37;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 65 / 0;
        }
        return strTrimIndent;
    }

    public final String onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strTrimIndent = StringsKt.trimIndent("(function() {\n            var meta = document.querySelector('meta[name=\"" + str + "\"]');\n            if (meta != null && meta.content != null) {\n                return meta.content;\n            }\n            return \"\";\n        })();");
        int i2 = IAuthTabCallbackStub + 105;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 25 / 0;
        }
        return strTrimIndent;
    }

    private final void IAuthTabCallback(WebView webView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {TimerCounter.onExtraCallbackWithResult, webView};
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        TimerCallBack timerCallBack = (TimerCallBack) TimerCounter.onWarmupCompleted(809095719, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -809095716, objArr);
        if (timerCallBack != null) {
            int i4 = IAuthTabCallbackStub + 65;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            timerCallBack.aS_();
            int i6 = asInterface + 29;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public static final class onWarmupCompleted {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final String onExtraCallbackWithResult(@Nullable String str) {
            String host;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (str == null) {
                return null;
            }
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (scheme == null || (host = uri.getHost()) == null) {
                return str;
            }
            String path = uri.getPath();
            if (path == null) {
                int i3 = onWarmupCompleted + 55;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 69 / 0;
                }
                path = "";
            }
            return scheme + "://" + host + path;
        }
    }

    static {
        IAuthTabCallbackStub();
        Companion = new onWarmupCompleted(null);
        onExtraCallbackWithResult = new r8lambda0grt42NLozkvlz2kicXj5Z0ej8U();
        int i = onTransact + 23;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    static void IAuthTabCallbackStub() {
        IAuthTabCallback = new char[]{27252, 27194, 27170, 27173, 27197, 27198, 27252, 27197, 27169};
    }
}
