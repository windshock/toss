package com.iap.android.mppclient.container.presenter;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import com.iap.android.mppclient.R;
import com.iap.android.mppclient.container.ACContainer;
import com.iap.android.mppclient.container.ACContainerManager;
import com.iap.android.mppclient.container.activity.ACContainerActivity;
import com.iap.android.mppclient.container.cache.ResourceCacheManager;
import com.iap.android.mppclient.container.event.ContainerEvent;
import com.iap.android.mppclient.container.event.ContainerPerformanceListener;
import com.iap.android.mppclient.container.js.ACJSBridge;
import com.iap.android.mppclient.container.model.CacheRecord;
import com.iap.android.mppclient.container.provider.ReceivedSslErrorHandler;
import com.iap.android.mppclient.container.utils.IOUtils;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ACWebViewClient extends WebViewClient {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String TAG = "ACWebViewClient";
    private static long onExtraCallback = -7043092652453159806L;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private String bizCode;
    private ACContainerPresenter containerPresenter;
    private ACContainerActivity mContext;
    private WebView mWebView;
    private String originalUrl;
    Map<String, Long> pageStartTime = new HashMap();
    private HttpRequestRecord httpRequestRecord = new HttpRequestRecord();

    static /* synthetic */ ACContainerActivity access$000(ACWebViewClient aCWebViewClient) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 53;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        ACContainerActivity aCContainerActivity = aCWebViewClient.mContext;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 37;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 36 / 0;
        }
        return aCContainerActivity;
    }

    static /* synthetic */ WebView access$100(ACWebViewClient aCWebViewClient) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        WebView webView = aCWebViewClient.mWebView;
        if (i4 == 0) {
            return webView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ String access$200(ACWebViewClient aCWebViewClient) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 9;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        String str = aCWebViewClient.bizCode;
        int i6 = i4 + 125;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ String access$300(ACWebViewClient aCWebViewClient) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 119;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        String str = aCWebViewClient.originalUrl;
        int i6 = i4 + 53;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ACWebViewClient(ACContainerActivity aCContainerActivity, WebView webView, ACContainerPresenter aCContainerPresenter, String str, String str2) {
        this.mContext = aCContainerActivity;
        this.mWebView = webView;
        this.containerPresenter = aCContainerPresenter;
        this.bizCode = str;
        this.originalUrl = str2;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i4 = $11 + 79;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i6 = $10 + 71;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i8 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45811 - ExpandableListView.getPackedPositionChild(0L)), 84 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21232, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 14185), (ViewConfiguration.getTouchSlop() >> 8) + 19, (KeyEvent.getMaxKeyCode() >> 16) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    private boolean isPreInjectJSBridge() {
        Bundle extras;
        int i2 = 2 % 2;
        ACContainerActivity aCContainerActivity = this.mContext;
        boolean z = false;
        if (aCContainerActivity != null) {
            int i3 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (aCContainerActivity.getIntent() != null) {
                int i5 = onExtraCallbackWithResult + 29;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    extras = this.mContext.getIntent().getExtras();
                    z = true;
                } else {
                    extras = this.mContext.getIntent().getExtras();
                }
                return extras.getBoolean("preInjectJSBridge", z);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r1 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r2.getIntent() != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r1 = r5.mContext.getIntent().getExtras().getBoolean("enableLocalCache", false);
        r2 = r5.httpRequestRecord;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r2 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        r2.enabled = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r2 = com.iap.android.mppclient.container.presenter.ACWebViewClient.onNavigationEvent + 45;
        com.iap.android.mppclient.container.presenter.ACWebViewClient.onExtraCallbackWithResult = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if ((r2 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r2
      0x001b: PHI (r2v3 com.iap.android.mppclient.container.activity.ACContainerActivity) = 
      (r2v2 com.iap.android.mppclient.container.activity.ACContainerActivity)
      (r2v11 com.iap.android.mppclient.container.activity.ACContainerActivity)
     binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean isLocalCacheEnable() {
        ACContainerActivity aCContainerActivity;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            aCContainerActivity = this.mContext;
            int i5 = 69 / 0;
            if (aCContainerActivity != null) {
                int i6 = i3 + 71;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    Intent intent = aCContainerActivity.getIntent();
                    int i7 = 9 / 0;
                }
            }
        } else {
            aCContainerActivity = this.mContext;
            if (aCContainerActivity != null) {
            }
        }
        return false;
    }

    private String getErrorPageUrl() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 73;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        ACContainerActivity aCContainerActivity = this.mContext;
        if (aCContainerActivity == null) {
            return null;
        }
        int i6 = i3 + 59;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        if (aCContainerActivity.getIntent() == null) {
            return null;
        }
        String string = this.mContext.getIntent().getExtras().getString("h5ErrorPageURL");
        int i8 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return string;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        int i2 = 2 % 2;
        if (webView != null) {
            isPreInjectJSBridge();
            if (isPreInjectJSBridge()) {
                try {
                    ACJSBridge.getInstance(this.bizCode).loadJavascript(R.raw.h5_bridge, this.mContext, this.mWebView);
                    int i3 = onExtraCallbackWithResult + 31;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                } catch (Exception unused) {
                }
            }
            String url = webView.getUrl();
            ACContainerPresenter aCContainerPresenter = this.containerPresenter;
            if (aCContainerPresenter != null) {
                aCContainerPresenter.onPageStarted(url);
                int i5 = onExtraCallbackWithResult + 35;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
            this.pageStartTime.put(url, Long.valueOf(System.currentTimeMillis()));
            if (!onPageEvent(url, "h5PageStarted")) {
                int i7 = onExtraCallbackWithResult + 85;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    super.onPageStarted(webView, url, bitmap);
                    throw null;
                }
                super.onPageStarted(webView, url, bitmap);
            }
            HttpRequestRecord httpRequestRecord = this.httpRequestRecord;
            if (httpRequestRecord != null) {
                httpRequestRecord.startRecord(url);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        int i2 = 2 % 2;
        if (webView != null) {
            String url = webView.getUrl();
            ACContainerPresenter aCContainerPresenter = this.containerPresenter;
            Object obj = null;
            if (aCContainerPresenter != null) {
                int i3 = onNavigationEvent + 53;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    aCContainerPresenter.onPageFinished(url);
                } else {
                    aCContainerPresenter.onPageFinished(url);
                    obj.hashCode();
                    throw null;
                }
            }
            if (!isPreInjectJSBridge()) {
                try {
                    ACJSBridge.getInstance(this.bizCode).loadJavascript(R.raw.h5_bridge, this.mContext, this.mWebView);
                } catch (Exception unused) {
                }
            }
            if (!onPageEvent(url, "h5PageFinished")) {
                int i4 = onNavigationEvent + 125;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    super.onPageFinished(webView, url);
                } else {
                    super.onPageFinished(webView, url);
                    throw null;
                }
            }
            HttpRequestRecord httpRequestRecord = this.httpRequestRecord;
            if (httpRequestRecord != null) {
                int i5 = onNavigationEvent + 5;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    httpRequestRecord.finishRecord(url);
                    throw null;
                }
                httpRequestRecord.finishRecord(url);
                int i6 = onExtraCallbackWithResult + 91;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        int i8 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) throws Throwable {
        int i2 = 2 % 2;
        if (webResourceRequest != null) {
            int i3 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (webResourceRequest.getUrl() != null) {
                boolean zShouldOverrideUrlLoading = shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
                int i5 = onNavigationEvent + 77;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 44 / 0;
                }
                return zShouldOverrideUrlLoading;
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) throws Throwable {
        int i2 = 2 % 2;
        if (webView == null) {
            int i3 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!TextUtils.isEmpty(str))) {
            return false;
        }
        if (onPageEvent(str, "h5PageShouldLoadUrl")) {
            return true;
        }
        int i4 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        try {
            if (!str.startsWith("http://")) {
                Object[] objArr = new Object[1];
                a(new char[]{48076, 48036, 9626, 51856, 49760, 1528, 11761, 39723, 9607, 18332, 26755, 31036}, ViewConfiguration.getLongPressTimeout() >> 16, objArr);
                if (!str.startsWith(((String) objArr[0]).intern())) {
                    int i6 = onExtraCallbackWithResult + 71;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    if (!str.startsWith("file:///android_asset/")) {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                        ACContainerActivity aCContainerActivity = this.mContext;
                        if (aCContainerActivity != null) {
                            aCContainerActivity.startActivity(intent);
                        }
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (!handleSslError(webView, sslErrorHandler, sslError)) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            int i5 = onExtraCallbackWithResult + 83;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i2, String str, String str2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        loadErrorPage(str2, i2);
        int i6 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) throws Throwable {
        String string;
        int statusCode;
        int i2 = 2 % 2;
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            string = null;
        } else {
            int i3 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                webResourceRequest.getUrl().toString();
                throw null;
            }
            string = webResourceRequest.getUrl().toString();
        }
        if (!TextUtils.equals(string, this.originalUrl)) {
            int i4 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (webResourceResponse != null) {
            int i5 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            statusCode = webResourceResponse.getStatusCode();
        } else {
            statusCode = 0;
        }
        loadErrorPage(string, statusCode);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String string;
        int i2 = 2 % 2;
        HttpRequestRecord httpRequestRecord = this.httpRequestRecord;
        if (httpRequestRecord != null) {
            int i3 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            httpRequestRecord.addRequestNumber(webResourceRequest.getUrl().toString());
        }
        if (webResourceRequest != null) {
            int i5 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            string = webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : "";
        }
        WebResourceResponse webResourceResponse = getWebResourceResponse(string);
        if (webResourceResponse == null) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        int i7 = onNavigationEvent;
        int i8 = i7 + 43;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i7 + 27;
        onExtraCallbackWithResult = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 34 / 0;
        }
        return webResourceResponse;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 25;
        onExtraCallbackWithResult = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            HttpRequestRecord httpRequestRecord = this.httpRequestRecord;
            if (httpRequestRecord != null) {
                int i5 = i3 + 19;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                httpRequestRecord.addRequestNumber(str);
            }
            WebResourceResponse webResourceResponse = getWebResourceResponse(str);
            if (webResourceResponse != null) {
                int i7 = onExtraCallbackWithResult + 43;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    return webResourceResponse;
                }
                throw null;
            }
            return super.shouldInterceptRequest(webView, str);
        }
        obj.hashCode();
        throw null;
    }

    private WebResourceResponse getWebResourceResponse(String str) {
        WebResourceResponse cachedWebResourceResponse;
        int i2 = 2 % 2;
        if (isLocalCacheEnable() && !(!ResourceCacheManager.isResourceManagerExist())) {
            int i3 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (!TextUtils.isEmpty(str) && (cachedWebResourceResponse = ResourceCacheManager.getCachedWebResourceResponse(str)) != null) {
                int i5 = onExtraCallbackWithResult + 87;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    HttpRequestRecord httpRequestRecord = this.httpRequestRecord;
                    if (httpRequestRecord != null) {
                        httpRequestRecord.addCacheNumber(str);
                    }
                    return cachedWebResourceResponse;
                }
                throw null;
            }
        }
        int i6 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        r5 = com.iap.android.mppclient.container.presenter.ACWebViewClient.onNavigationEvent + 13;
        com.iap.android.mppclient.container.presenter.ACWebViewClient.onExtraCallbackWithResult = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if ((r5 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        r1.onReceivedSslError(new com.iap.android.mppclient.container.presenter.ACWebView(r5), new com.iap.android.mppclient.container.presenter.ACSslErrorHandler(r6), r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean handleSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        ReceivedSslErrorHandler receivedSslErrorHandler;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            receivedSslErrorHandler = (ReceivedSslErrorHandler) ACContainer.INSTANCE.getProvider(ReceivedSslErrorHandler.class.getName());
            int i4 = 50 / 0;
        } else {
            receivedSslErrorHandler = (ReceivedSslErrorHandler) ACContainer.INSTANCE.getProvider(ReceivedSslErrorHandler.class.getName());
        }
    }

    private boolean onPageEvent(String str, String str2) throws Throwable {
        int i2 = 2 % 2;
        ContainerEvent containerEvent = new ContainerEvent(str2, this.containerPresenter);
        JSONObject jSONObject = new JSONObject();
        try {
            Object[] objArr = new Object[1];
            a(new char[]{22447, 22490, 37473, 6991, 30109, 54335, 31161}, Process.myPid() >> 22, objArr);
            jSONObject.put(((String) objArr[0]).intern(), str);
            int i3 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        } catch (JSONException unused) {
        }
        containerEvent.params = jSONObject;
        if (!ACContainer.INSTANCE.handleContainerEvent(containerEvent) && (!r8.interceptContainerEvent(containerEvent))) {
            return false;
        }
        int i5 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private void loadErrorPage(String str, int i2) throws Throwable {
        int i3 = 2 % 2;
        String errorPageUrl = getErrorPageUrl();
        if (!TextUtils.equals(str, errorPageUrl)) {
            if (!TextUtils.isEmpty(errorPageUrl)) {
                Uri.Builder builderBuildUpon = Uri.parse(errorPageUrl).buildUpon();
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                builderBuildUpon.appendQueryParameter("errorCode", sb.toString());
                Object[] objArr = new Object[1];
                a(new char[]{22447, 22490, 37473, 6991, 30109, 54335, 31161}, ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr);
                builderBuildUpon.appendQueryParameter(((String) objArr[0]).intern(), str);
                String string = builderBuildUpon.build().toString();
                String asset = IOUtils.readAsset(this.mContext.getResources(), "containererrorpage/griver_custom_h5_page_error.html");
                if (asset != null) {
                    int i4 = onExtraCallbackWithResult + 73;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    this.mWebView.loadDataWithBaseURL(str, asset.replace("&&&&", string), "text/html", "utf-8", str);
                    return;
                }
            } else {
                String asset2 = IOUtils.readAsset(this.mContext.getResources(), "containererrorpage/griver_page_error.html");
                if (asset2 != null) {
                    String strReplace = asset2.replace("&&&&", errorPageUrl);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i2);
                    this.mWebView.loadDataWithBaseURL(str, strReplace.replace("!!!!", sb2.toString()), "text/html", "utf-8", str);
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.iap.android.mppclient.container.presenter.ACWebViewClient.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                ACJSBridge.getInstance(ACWebViewClient.access$200(ACWebViewClient.this)).loadJavascript(R.raw.h5_bridge, ACWebViewClient.access$000(ACWebViewClient.this), ACWebViewClient.access$100(ACWebViewClient.this));
                            } catch (IOException e) {
                                e.getMessage();
                            }
                        }
                    }, 300L);
                    return;
                }
            }
        }
        int i6 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    public class HttpRequestRecord {
        public int cacheNumber;
        public boolean enabled;
        private boolean pageFinished;
        private boolean pageStarted;
        public int requestNumber;
        public long startTime;

        public HttpRequestRecord() {
        }

        public void startRecord(String str) {
            if (this.pageStarted) {
                return;
            }
            this.pageStarted = true;
            this.startTime = System.currentTimeMillis();
            Iterator<ContainerPerformanceListener> it = getContainerPerformanceListeners().iterator();
            while (it.hasNext()) {
                ContainerPerformanceListener next = it.next();
                if (next != null) {
                    next.onPageStart(ACWebViewClient.access$300(ACWebViewClient.this));
                }
            }
        }

        public void addRequestNumber(String str) {
            if (this.pageFinished) {
                return;
            }
            this.requestNumber++;
        }

        public void addCacheNumber(String str) {
            if (this.pageFinished) {
                return;
            }
            this.cacheNumber++;
        }

        public void finishRecord(String str) {
            if (this.pageFinished) {
                return;
            }
            this.pageFinished = true;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.startTime;
            CopyOnWriteArrayList<ContainerPerformanceListener> containerPerformanceListeners = getContainerPerformanceListeners();
            CacheRecord cacheRecord = new CacheRecord();
            cacheRecord.requestNumber = this.requestNumber;
            cacheRecord.cacheNumber = this.cacheNumber;
            cacheRecord.enabled = this.enabled;
            Iterator<ContainerPerformanceListener> it = containerPerformanceListeners.iterator();
            while (it.hasNext()) {
                ContainerPerformanceListener next = it.next();
                if (next != null) {
                    next.onPageLoaded(ACWebViewClient.access$300(ACWebViewClient.this), cacheRecord, Long.valueOf(jCurrentTimeMillis - j));
                }
            }
        }

        private CopyOnWriteArrayList<ContainerPerformanceListener> getContainerPerformanceListeners() {
            CopyOnWriteArrayList<ContainerPerformanceListener> copyOnWriteArrayListPerformanceListeners = ACContainerManager.getInstance().performanceListeners();
            return copyOnWriteArrayListPerformanceListeners == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayListPerformanceListeners;
        }
    }
}
