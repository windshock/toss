package viva.republica.toss.main;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import im.toss.base.BaseActivity;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.webview.TossWebView;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.IPostMessageServiceStubProxy;
import o.IconRoundCornerProgressBar1;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TimerCallBack;
import o.TrackGroupExternalSyntheticLambda0;
import o.enableIOSViewClipToPaddingBox;
import o.extractFaceStatus;
import o.filterCreatePageParams;
import o.getTextProgressSize;
import o.roundedRect;
import o.setCircleStrokeWidth;
import o.setVariables;
import o.zzaj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class WebViewActivity extends BaseActivity implements TimerCallBack, WebViewContentOwner {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static int IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 1;
    private static int extraCallback = 0;
    private static char[] getInterfaceDescriptor = null;
    public static final int onTransact;
    private static int readTypedObject = 1;
    private boolean IAuthTabCallbackDefault;
    private View IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private String access000;
    private boolean access100;
    private extractFaceStatus asBinder;
    private TossWebView asInterface;

    static {
        IEngagementSignalsCallback();
        Companion = new onExtraCallback(null);
        onTransact = 8;
        int i = readTypedObject + 69;
        IAuthTabCallback_Parcel = i % 128;
        if (i % 2 != 0) {
            int i2 = 94 / 0;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 75;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 73 / 0;
        }
        int i5 = i2 + 55;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public static final /* synthetic */ boolean onWarmupCompleted(WebViewActivity webViewActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 5;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zWriteTypedList = webViewActivity.writeTypedList();
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        return zWriteTypedList;
    }

    public /* bridge */ boolean closeWebView(@Nullable String str, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 33;
        extraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.closeWebView(str, z);
            obj.hashCode();
            throw null;
        }
        boolean zCloseWebView = super.closeWebView(str, z);
        int i3 = ICustomTabsCallback + 75;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return zCloseWebView;
        }
        throw null;
    }

    public /* bridge */ ViewGroup getCaWebViewContainer() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 57;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        ViewGroup caWebViewContainer = super.getCaWebViewContainer();
        int i4 = extraCallback + 25;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return caWebViewContainer;
    }

    public /* bridge */ Boolean getShouldWebViewPauseOnInvisible() {
        int i = 2 % 2;
        int i2 = extraCallback + 95;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean shouldWebViewPauseOnInvisible = super.getShouldWebViewPauseOnInvisible();
        int i4 = ICustomTabsCallback + 35;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return shouldWebViewPauseOnInvisible;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Intent getSourceIntent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 25;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intent sourceIntent = super.getSourceIntent();
        int i4 = ICustomTabsCallback + 109;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return sourceIntent;
    }

    public /* bridge */ String getSwipeRefreshCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 31;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        String swipeRefreshCallback = super.getSwipeRefreshCallback();
        int i4 = ICustomTabsCallback + 61;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return swipeRefreshCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ TossCoreWebView getWebView() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 13;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        TossWebView tossWebViewICustomTabsService_Parcel = ICustomTabsService_Parcel();
        int i4 = ICustomTabsCallback + 83;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return tossWebViewICustomTabsService_Parcel;
    }

    public /* bridge */ boolean handleCaWebViewBackPress(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = extraCallback + 11;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zHandleCaWebViewBackPress = super/*o.startApp*/.handleCaWebViewBackPress(function0);
        int i4 = ICustomTabsCallback + 7;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zHandleCaWebViewBackPress;
        }
        throw null;
    }

    public /* bridge */ boolean isSwipeRefreshEnabled() {
        boolean zIsSwipeRefreshEnabled;
        int i = 2 % 2;
        int i2 = extraCallback + 63;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            zIsSwipeRefreshEnabled = super.isSwipeRefreshEnabled();
            int i3 = 93 / 0;
        } else {
            zIsSwipeRefreshEnabled = super.isSwipeRefreshEnabled();
        }
        int i4 = extraCallback + 91;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return zIsSwipeRefreshEnabled;
    }

    public /* bridge */ void onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        int i = 2 % 2;
        int i2 = extraCallback + 7;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onExtraCallbackWithResult(str, str2, str3, str4, onMenuItemClickListener);
        int i4 = extraCallback + 47;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onHistoryCleared() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 97;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onHistoryCleared();
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ void onPageReady() {
        int i = 2 % 2;
        int i2 = extraCallback + 105;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPageReady();
        int i4 = ICustomTabsCallback + 9;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
    }

    public /* bridge */ void onSwipeToRefresh(@Nullable SwipeRefreshLayout swipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = extraCallback + 63;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.startApp*/.onSwipeToRefresh(swipeRefreshLayout);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ void setFullScreenEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = extraCallback + 45;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.setFullScreenEnabled(z);
        int i4 = extraCallback + 83;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setShouldWebViewPauseOnInvisible(@Nullable Boolean bool) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 31;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.setShouldWebViewPauseOnInvisible(bool);
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
    }

    public /* bridge */ void setSwipeRefreshCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = extraCallback + 43;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.setSwipeRefreshCallback(str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = extraCallback + 113;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setSwipeRefreshEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 21;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.setSwipeRefreshEnabled(z);
        int i4 = ICustomTabsCallback + 31;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final TossWebView updateVisuals() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 73;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        TossWebView tossWebView = this.asInterface;
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return tossWebView;
    }

    public final View ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = extraCallback + 51;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        View view = this.IAuthTabCallbackStub;
        int i5 = i3 + 19;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    public void onUpdateWebHistoryState() {
        int i = 2 % 2;
        int i2 = extraCallback + 109;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        TossWebView tossWebView = this.asInterface;
        Intrinsics.checkNotNull(tossWebView);
        setTitle(tossWebView.getTitle());
        int i4 = extraCallback + 19;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
    }

    public TossWebView ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = extraCallback + 27;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        TossWebView tossWebView = this.asInterface;
        Intrinsics.checkNotNull(tossWebView);
        if (i3 != 0) {
            return tossWebView;
        }
        throw null;
    }

    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        super.onCreate(bundle);
        setContentView(ICustomTabsServiceStub());
        validateRelationship();
        access200();
        setSupportActionBar(findViewById(R.id.toolbar));
        if (this.IAuthTabCallbackStubProxy) {
            int i2 = ICustomTabsCallback + 17;
            extraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                getSupportActionBar();
                throw null;
            }
            IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.onNavigationEvent(true);
                int i3 = ICustomTabsCallback + 39;
                extraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 4 % 3;
                }
            }
        }
        TossWebView tossWebView = this.asInterface;
        if (tossWebView != null) {
            tossWebView.setTossJavascriptInterface(new setCircleStrokeWidth(this, tossWebView, (setVariables) null, (getTextProgressSize) null, 8, (DefaultConstructorMarker) null));
            int i5 = ICustomTabsCallback + 33;
            extraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 2;
            }
        }
        int i7 = ICustomTabsCallback + 73;
        extraCallback = i7 % 128;
        int i8 = i7 % 2;
    }

    public boolean newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 53;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.access100;
        int i4 = i2 + 69;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    protected int ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 57;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_web_view;
        if (i3 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void access200() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.R.id.progress_circle
            android.view.View r1 = r6.findViewById(r1)
            r6.IAuthTabCallbackStub = r1
            int r1 = viva.republica.toss.R.id.webview_webview
            android.view.View r1 = r6.findViewById(r1)
            im.toss.webview.TossWebView r1 = (im.toss.webview.TossWebView) r1
            r6.asInterface = r1
            o.extractFaceStatus r1 = new o.extractFaceStatus
            r2 = 0
            r1.<init>(r6, r2)
            r6.asBinder = r1
            im.toss.webview.TossWebView r1 = r6.asInterface
            if (r1 == 0) goto Lb3
            int r3 = viva.republica.toss.main.WebViewActivity.ICustomTabsCallback
            int r3 = r3 + 23
            int r4 = r3 % 128
            viva.republica.toss.main.WebViewActivity.extraCallback = r4
            int r3 = r3 % r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            android.webkit.WebSettings r1 = r1.getSettings()
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            r3 = 1
            r1.setJavaScriptEnabled(r3)
            r6.onExtraCallback(r1)
            r4 = -1
            r1.setCacheMode(r4)
            im.toss.webview.TossWebView r1 = r6.asInterface
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            android.webkit.WebViewClient r4 = r6.setEngagementSignalsCallback()
            r1.setWebViewClient(r4)
            im.toss.webview.TossWebView r1 = r6.asInterface
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            android.webkit.WebChromeClient r4 = r6.IAuthTabCallback()
            r1.setWebChromeClient(r4)
            java.lang.String r1 = r6.access000
            boolean r1 = o.GraniteModule_onEventListenerRemoved.onExtraCallback(r1)
            r1 = r1 ^ r3
            if (r1 == 0) goto L63
            goto Lb3
        L63:
            int r1 = viva.republica.toss.main.WebViewActivity.extraCallback
            int r1 = r1 + r3
            int r3 = r1 % 128
            viva.republica.toss.main.WebViewActivity.ICustomTabsCallback = r3
            int r1 = r1 % r0
            r3 = 0
            java.lang.String r4 = ".pdf"
            if (r1 != 0) goto L7d
            java.lang.String r1 = r6.access000
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r5 = 3
            boolean r1 = kotlin.text.StringsKt.contains$default(r1, r4, r2, r5, r3)
            if (r1 == 0) goto L9d
            goto L88
        L7d:
            java.lang.String r1 = r6.access000
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            boolean r1 = kotlin.text.StringsKt.contains$default(r1, r4, r2, r0, r3)
            if (r1 == 0) goto L9d
        L88:
            java.lang.String r1 = r6.access000
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "http://docs.google.com/gview?embedded=true&url="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r6.access000 = r1
        L9d:
            im.toss.webview.TossWebView r1 = r6.asInterface
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.String r2 = r6.access000
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r1.loadUrl(r2)
            int r1 = viva.republica.toss.main.WebViewActivity.ICustomTabsCallback
            int r1 = r1 + 49
            int r2 = r1 % 128
            viva.republica.toss.main.WebViewActivity.extraCallback = r2
            int r1 = r1 % r0
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.WebViewActivity.access200():void");
    }

    protected void onExtraCallback(@NotNull WebSettings webSettings) {
        int i = 2 % 2;
        int i2 = extraCallback + 87;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webSettings, "");
        webSettings.setCacheMode(-1);
        int i4 = extraCallback + 79;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final class onWarmupCompleted extends roundedRect {
        private int onExtraCallbackWithResult;
        private final int onWarmupCompleted;
        private static final byte[] $$d = {119, -40, 16, 123};
        private static final int $$e = 31;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int onNavigationEvent = 478309000;

        private static String $$f(short s, byte b, int i) {
            byte[] bArr = $$d;
            int i2 = b * 2;
            int i3 = (s * 3) + 105;
            int i4 = (i * 2) + 4;
            byte[] bArr2 = new byte[i2 + 1];
            int i5 = -1;
            if (bArr == null) {
                i3 = i2 + i3;
                i4++;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i3;
                if (i5 == i2) {
                    return new String(bArr2, 0);
                }
                i3 += bArr[i4];
                i4++;
            }
        }

        onWarmupCompleted() {
            super((IconRoundCornerProgressBar1) null, 1, (DefaultConstructorMarker) null);
            this.onWarmupCompleted = 20;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(webResourceRequest, "");
            if (onNavigationEvent(webResourceRequest.getUrl().toString()) || super/*o.ALCFocusCircle*/.shouldOverrideUrlLoading(webView, webResourceRequest)) {
                int i4 = onExtraCallback + 11;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 96 / 0;
                }
                return true;
            }
            int i6 = onExtraCallback + 67;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            super.onPageStarted(webView, str, bitmap);
            WebViewActivity.this.ICustomTabsService_Parcel().getSettings().setSupportMultipleWindows(WebViewActivity.onWarmupCompleted(WebViewActivity.this));
            int i4 = IAuthTabCallbackDefault + 109;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0171  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void c(char[] r21, int r22, boolean r23, int r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 379
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.WebViewActivity.onWarmupCompleted.c(char[], int, boolean, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        
            if (r6.length() == 0) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onPageFinished(android.webkit.WebView r5, java.lang.String r6) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                java.lang.String r1 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
                super.onPageFinished(r5, r6)
                int r1 = r4.onExtraCallbackWithResult
                int r2 = r4.onWarmupCompleted
                r3 = 0
                if (r1 >= r2) goto L56
                int r1 = viva.republica.toss.main.WebViewActivity.onWarmupCompleted.IAuthTabCallbackDefault
                int r1 = r1 + 85
                int r2 = r1 % 128
                viva.republica.toss.main.WebViewActivity.onWarmupCompleted.onExtraCallback = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L29
                boolean r6 = r4.onExtraCallback(r6)
                r1 = 4
                int r1 = r1 / r3
                if (r6 == 0) goto L56
                goto L2f
            L29:
                boolean r6 = r4.onExtraCallback(r6)
                if (r6 == 0) goto L56
            L2f:
                java.lang.String r6 = r5.getTitle()
                if (r6 == 0) goto L4c
                int r1 = viva.republica.toss.main.WebViewActivity.onWarmupCompleted.IAuthTabCallbackDefault
                int r1 = r1 + 111
                int r2 = r1 % 128
                viva.republica.toss.main.WebViewActivity.onWarmupCompleted.onExtraCallback = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L47
                int r6 = r6.length()
                if (r6 != 0) goto L56
                goto L4c
            L47:
                r6.length()
                r5 = 0
                throw r5
            L4c:
                int r6 = r4.onExtraCallbackWithResult
                int r6 = r6 + 1
                r4.onExtraCallbackWithResult = r6
                r5.reload()
                return
            L56:
                r4.onExtraCallbackWithResult = r3
                viva.republica.toss.main.WebViewActivity r5 = viva.republica.toss.main.WebViewActivity.this
                android.view.View r5 = r5.ICustomTabsServiceDefault()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
                int r5 = r5.getVisibility()
                if (r5 != 0) goto L87
                int r5 = viva.republica.toss.main.WebViewActivity.onWarmupCompleted.onExtraCallback
                int r5 = r5 + 89
                int r6 = r5 % 128
                viva.republica.toss.main.WebViewActivity.onWarmupCompleted.IAuthTabCallbackDefault = r6
                int r5 = r5 % r0
                viva.republica.toss.main.WebViewActivity r5 = viva.republica.toss.main.WebViewActivity.this
                android.view.View r5 = r5.ICustomTabsServiceDefault()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
                r6 = 8
                r5.setVisibility(r6)
                int r5 = viva.republica.toss.main.WebViewActivity.onWarmupCompleted.IAuthTabCallbackDefault
                int r5 = r5 + 119
                int r6 = r5 % 128
                viva.republica.toss.main.WebViewActivity.onWarmupCompleted.onExtraCallback = r6
                int r5 = r5 % r0
            L87:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.WebViewActivity.onWarmupCompleted.onPageFinished(android.webkit.WebView, java.lang.String):void");
        }

        private final boolean onNavigationEvent(String str) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            if (str == null || (!StringsKt.endsWith$default(str, ".pdf", false, 2, (Object) null)) || onExtraCallback(str)) {
                int i4 = IAuthTabCallbackDefault + 107;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return false;
                }
                obj.hashCode();
                throw null;
            }
            TossWebView tossWebViewUpdateVisuals = WebViewActivity.this.updateVisuals();
            Intrinsics.checkNotNull(tossWebViewUpdateVisuals);
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            c(new char[]{'\r', '\b', 16, 16, '\b', 65487, 20, 4, 16, 5, 65488, 65488, 65499, 20, 17, 21, 21, '\t', 65502, '\r', 19, 22, 65479, 6, 22, 19, 21, 65502, 5, 6, 5, 5, 6, 3, 14, 6, 65504, 24, 6, '\n', 23, '\b', 65488, 14, 16, 4, 65487, 6}, 18 - (ViewConfiguration.getTouchSlop() >> 8), true, 49 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 256, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            tossWebViewUpdateVisuals.loadUrl(sb.toString());
            return true;
        }

        private final boolean onExtraCallback(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            boolean zContains$default = StringsKt.contains$default(str, "docs.google.com/gview?embedded=true", false, 2, (Object) null);
            int i4 = onExtraCallback + 41;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                return zContains$default;
            }
            obj.hashCode();
            throw null;
        }
    }

    protected WebViewClient setEngagementSignalsCallback() {
        int i = 2 % 2;
        roundedRect onwarmupcompleted = new onWarmupCompleted();
        int i2 = ICustomTabsCallback + 15;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        return onwarmupcompleted;
    }

    public static final class onExtraCallback {
        private static final byte[] $$a = {51, -39, 98, -44};
        private static final int $$b = 141;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 0;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 478309103;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r6, byte r7, int r8) {
            /*
                int r8 = r8 * 4
                int r8 = 3 - r8
                int r7 = r7 * 4
                int r7 = 105 - r7
                int r6 = r6 * 4
                int r6 = r6 + 1
                byte[] r0 = viva.republica.toss.main.WebViewActivity.onExtraCallback.$$a
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r7
                r4 = r2
                r7 = r6
                goto L29
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                int r8 = r8 + 1
                if (r4 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L27:
                r3 = r0[r8]
            L29:
                int r7 = r7 + r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.WebViewActivity.onExtraCallback.$$c(short, byte, int):java.lang.String");
        }

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
            int i4;
            int i5 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (true) {
                i4 = 2083011369;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                    break;
                }
                int i6 = $11 + 95;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getTouchSlop() >> 8)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23, 10277 - Process.getGidForName(""), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12843), 55 - TextUtils.indexOf("", ""), TextUtils.indexOf((CharSequence) "", '0') + 2168, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            if (i2 > 0) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (!(!z)) {
                int i9 = $10 + 81;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    try {
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12842), Color.alpha(0) + 55, 2166 - ImageFormat.getBitsPerPixel(0), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        int i11 = $10 + 83;
                        $11 = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i12 = 4 % 4;
                        }
                        i4 = 2083011369;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        private onExtraCallback() {
        }

        public static /* synthetic */ Intent onExtraCallback(onExtraCallback onextracallback, Context context, String str, boolean z, boolean z2, int i, Object obj) throws Throwable {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 79;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0 && (i & 8) != 0) {
                z2 = false;
            }
            Intent intentOnExtraCallback = onextracallback.onExtraCallback(context, str, z, z2);
            int i4 = IAuthTabCallback + 101;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 46 / 0;
            }
            return intentOnExtraCallback;
        }

        public final Intent onExtraCallback(@Nullable Context context, @Nullable String str, boolean z, boolean z2) throws Throwable {
            int i = 2 % 2;
            Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
            Object[] objArr = new Object[1];
            a(Color.rgb(0, 0, 0) + 16777219, TextUtils.indexOf("", "", 0) + 2, new char[]{1, 65531, 4}, false, 311 - Color.alpha(0), objArr);
            intent.putExtra(((String) objArr[0]).intern(), str);
            intent.putExtra("showCloseButton", z);
            Object[] objArr2 = new Object[1];
            a(13 - MotionEvent.axisFromString(""), ImageFormat.getBitsPerPixel(0) + 5, new char[]{'\n', 3, 5, '\r', '\b', 65535, 65535, '\f', 65533, 65517, 5, 65533, '\t', 65510}, true, Color.red(0) + 300, objArr2);
            intent.putExtra(((String) objArr2[0]).intern(), z2);
            int i2 = IAuthTabCallback + 71;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 31 / 0;
            }
            return intent;
        }

        @JvmStatic
        public final Intent onExtraCallbackWithResult(@Nullable Context context, @Nullable String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            IAuthTabCallback = i2 % 128;
            boolean z = i2 % 2 == 0;
            return onExtraCallback(context, str, z, z);
        }
    }

    public static final class onExtraCallbackWithResult extends WebChromeClient {
        onExtraCallbackWithResult() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            Intrinsics.checkNotNullParameter(webView, "");
            View viewICustomTabsServiceDefault = WebViewActivity.this.ICustomTabsServiceDefault();
            Intrinsics.checkNotNull(viewICustomTabsServiceDefault);
            if (viewICustomTabsServiceDefault.getVisibility() == 0 && enableIOSViewClipToPaddingBox.IAuthTabCallback.IAuthTabCallback(zzaj.onWarmupCompleted().IAuthTabCallbackDefault(), i)) {
                View viewICustomTabsServiceDefault2 = WebViewActivity.this.ICustomTabsServiceDefault();
                Intrinsics.checkNotNull(viewICustomTabsServiceDefault2);
                viewICustomTabsServiceDefault2.setVisibility(8);
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(message, "");
            Object obj = message.obj;
            WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
            if (webViewTransport == null) {
                return false;
            }
            WebView webView2 = new WebView(webView.getContext());
            webView2.getSettings().setJavaScriptEnabled(true);
            webViewTransport.setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    protected WebChromeClient IAuthTabCallback() {
        int i = 2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
        int i2 = extraCallback + 65;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onextracallbackwithresult;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void validateRelationship() throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 5;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        Object[] objArr = new Object[1];
        a(new int[]{0, 3, 40, 3}, false, new byte[]{1, 1, 0}, objArr);
        this.access000 = intent.getStringExtra(((String) objArr[0]).intern());
        this.IAuthTabCallbackStubProxy = intent.getBooleanExtra("showCloseButton", false);
        Object[] objArr2 = new Object[1];
        a(new int[]{3, 14, 0, 3}, false, new byte[]{1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1}, objArr2);
        this.access100 = intent.getBooleanExtra(((String) objArr2[0]).intern(), false);
        this.IAuthTabCallbackDefault = intent.getBooleanExtra("preventHistoryBack", false);
        int i4 = extraCallback + 61;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
    }

    private final boolean writeTypedList() {
        int i = 2 % 2;
        String strOnExtraCallbackWithResult = ICustomTabsService_Parcel().onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult != null) {
            if (strOnExtraCallbackWithResult.length() <= 0) {
                int i2 = ICustomTabsCallback + 9;
                extraCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                strOnExtraCallbackWithResult = null;
            }
            if (strOnExtraCallbackWithResult != null) {
                Uri uri = Uri.parse(strOnExtraCallbackWithResult);
                Intrinsics.checkNotNullExpressionValue(uri, "");
                return filterCreatePageParams.onTransact(uri);
            }
        }
        int i3 = ICustomTabsCallback + 123;
        extraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 88 / 0;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        return super/*androidx.appcompat.app.AppCompatActivity*\/.onKeyDown(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r5 == 4) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r5 == 4) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        ICustomTabsServiceStubProxy();
        r5 = viva.republica.toss.main.WebViewActivity.ICustomTabsCallback + 91;
        viva.republica.toss.main.WebViewActivity.extraCallback = r5 % 128;
        r5 = r5 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r5, @org.jetbrains.annotations.NotNull android.view.KeyEvent r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.main.WebViewActivity.extraCallback
            int r1 = r1 + 3
            int r2 = r1 % 128
            viva.republica.toss.main.WebViewActivity.ICustomTabsCallback = r2
            int r1 = r1 % r0
            r2 = 4
            java.lang.String r3 = ""
            if (r1 != 0) goto L17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            if (r5 != r2) goto L2a
            goto L1c
        L17:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            if (r5 != r2) goto L2a
        L1c:
            r4.ICustomTabsServiceStubProxy()
            int r5 = viva.republica.toss.main.WebViewActivity.ICustomTabsCallback
            int r5 = r5 + 91
            int r6 = r5 % 128
            viva.republica.toss.main.WebViewActivity.extraCallback = r6
            int r5 = r5 % r0
            r5 = 1
            return r5
        L2a:
            boolean r5 = super/*androidx.appcompat.app.AppCompatActivity*/.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.WebViewActivity.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public boolean bg_() {
        int i = 2 % 2;
        int i2 = extraCallback + 23;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsServiceStubProxy();
        int i4 = extraCallback + 1;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private final void ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 5;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 23 / 0;
            if (this.IAuthTabCallbackDefault) {
                return;
            }
        } else if (this.IAuthTabCallbackDefault) {
            return;
        }
        TossWebView tossWebView = this.asInterface;
        Intrinsics.checkNotNull(tossWebView);
        if (tossWebView.canGoBack()) {
            int i4 = ICustomTabsCallback + 25;
            extraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                TossWebView tossWebView2 = this.asInterface;
                Intrinsics.checkNotNull(tossWebView2);
                tossWebView2.goBack();
                return;
            } else {
                TossWebView tossWebView3 = this.asInterface;
                Intrinsics.checkNotNull(tossWebView3);
                tossWebView3.goBack();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        finish();
    }

    public void onExtraCallback(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        int i = 2 % 2;
        int i2 = extraCallback + 63;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        extractFaceStatus extractfacestatus = this.asBinder;
        Intrinsics.checkNotNull(extractfacestatus);
        extractfacestatus.onExtraCallback(str, str2, str3, str4, onMenuItemClickListener);
        int i4 = ICustomTabsCallback + 111;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @Nullable MenuItem.OnMenuItemClickListener onMenuItemClickListener, @Nullable MenuItem.OnMenuItemClickListener onMenuItemClickListener2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 17;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        extractFaceStatus extractfacestatus = this.asBinder;
        Intrinsics.checkNotNull(extractfacestatus);
        extractfacestatus.onWarmupCompleted(str, str2, str3, str4, str5, onMenuItemClickListener, onMenuItemClickListener2);
        int i4 = extraCallback + 91;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c;
        char c2;
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = getInterfaceDescriptor;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 67;
                $10 = i8 % 128;
                if (i8 % i != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 35283), View.MeasureSpec.getSize(0) + 35, (-16762977) - Color.rgb(0, 0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getEdgeSlop() >> 16)), 35 - (ViewConfiguration.getKeyRepeatDelay() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7++;
                }
                int i9 = $10 + 123;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    c2 = 3;
                    int i10 = 2 / 3;
                } else {
                    c2 = 3;
                }
                i = 2;
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i11 = $11 + 73;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 1;
            } else {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10936 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 65 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 29 - Drawable.resolveOpacity(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 17658, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i13] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getWindowTouchSlop() >> 8)), ((Process.getThreadPriority(0) + 20) >> 6) + 70, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr4, 0, cArr5, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr4, i14, i6);
            System.arraycopy(cArr5, i6, cArr4, 0, i14);
        }
        if (z) {
            int i15 = $10 + 73;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i17 = $10 + 31;
                $11 = i17 % 128;
                int i18 = i17 % 2;
            }
            cArr4 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    public void aS_() {
        int i = 2 % 2;
        int i2 = extraCallback + 7;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            extractFaceStatus extractfacestatus = this.asBinder;
            Intrinsics.checkNotNull(extractfacestatus);
            extractfacestatus.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        extractFaceStatus extractfacestatus2 = this.asBinder;
        Intrinsics.checkNotNull(extractfacestatus2);
        extractfacestatus2.onExtraCallback();
        int i3 = ICustomTabsCallback + 107;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 97;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(menu, "");
        extractFaceStatus extractfacestatus = this.asBinder;
        Intrinsics.checkNotNull(extractfacestatus);
        MenuInflater menuInflater = getMenuInflater();
        Intrinsics.checkNotNullExpressionValue(menuInflater, "");
        extractfacestatus.IAuthTabCallback(menuInflater, menu);
        int i4 = extraCallback + 89;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 91;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 31;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return "";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 57;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = extraCallback + 97;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 5;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = extraCallback + 107;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = extraCallback + 5;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallback + 69;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = extraCallback + 41;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = extraCallback + 45;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
    }

    static void IEngagementSignalsCallback() {
        getInterfaceDescriptor = new char[]{27136, 27349, 27353, 27260, 27179, 27175, 27198, 27169, 27172, 27170, 27152, 27155, 27175, 27177, 27153, 27157, 27172};
    }
}
