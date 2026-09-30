package com.iap.android.mppclient.container.presenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.iap.android.mppclient.R;
import com.iap.android.mppclient.container.ACContainer;
import com.iap.android.mppclient.container.IContainerPresenter;
import com.iap.android.mppclient.container.activity.ACContainerActivity;
import com.iap.android.mppclient.container.activity.H5NetworkCheckActivity;
import com.iap.android.mppclient.container.provider.ContainerUaProvider;
import com.iap.android.mppclient.container.utils.ContainerUtils;
import com.iap.android.mppclient.container.utils.ResourceUtils;
import com.iap.android.mppclient.container.view.IContainerView;
import java.lang.reflect.Method;
import java.util.Map;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class ACContainerPresenter implements IContainerPresenter {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static final String TAG = "ContainerPresenter";
    private static int onExtraCallbackWithResult = 1;
    private static int[] onWarmupCompleted = {-33953300, 2093620730, 2073973248, -966099708, -529234349, -504847009, -416446794, -1803276561, 756176732, -494351340, -1070145132, -2011067201, -989118500, -203345498, -1298933731, -18556988, -800624525, 644573168};
    private String bizCode;
    private IContainerView containerView;
    private ACContainerActivity mContext;
    private WebView mWebView;
    private String originalUrl;

    static /* synthetic */ WebView access$000(ACContainerPresenter aCContainerPresenter) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 29;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        WebView webView = aCContainerPresenter.mWebView;
        int i5 = i2 + 113;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 77 / 0;
        }
        return webView;
    }

    static /* synthetic */ ACContainerActivity access$100(ACContainerPresenter aCContainerPresenter) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ACContainerActivity aCContainerActivity = aCContainerPresenter.mContext;
        if (i3 != 0) {
            return aCContainerActivity;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void access$200(ACContainerPresenter aCContainerPresenter, String str, int i, String str2) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        aCContainerPresenter.showDefaultErrorPage(str, i, str2);
        int i5 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public ACContainerPresenter(ACContainerActivity aCContainerActivity, IContainerView iContainerView, String str, String str2) {
        this.mContext = aCContainerActivity;
        this.containerView = iContainerView;
        this.bizCode = str;
        this.originalUrl = str2;
    }

    @Override // com.iap.android.mppclient.container.IContainerPresenter
    public void setTitle(String str) {
        IContainerView iContainerView;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (!TextUtils.isEmpty(str) && (iContainerView = this.containerView) != null) {
            iContainerView.setTitle(str);
        }
        int i4 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.iap.android.mppclient.container.IContainerPresenter
    public void reloadPage() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 71;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            WebView webView = this.mWebView;
            if (webView != null) {
                webView.reload();
                return;
            }
            int i4 = i2 + 5;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        throw null;
    }

    @Override // com.iap.android.mppclient.container.IContainerPresenter
    public void loadUrl(final String str) {
        ACContainerActivity aCContainerActivity;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.mWebView == null || (aCContainerActivity = this.mContext) == null || !ContainerUtils.isActivityRunning(aCContainerActivity)) {
                return;
            }
            int i3 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                if (!TextUtils.isEmpty(str)) {
                    this.mContext.runOnUiThread(new Runnable() { // from class: com.iap.android.mppclient.container.presenter.ACContainerPresenter.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ACContainerPresenter.access$000(ACContainerPresenter.this).loadUrl(str);
                        }
                    });
                    return;
                } else {
                    this.mContext.runOnUiThread(new Runnable() { // from class: com.iap.android.mppclient.container.presenter.ACContainerPresenter.2
                        @Override // java.lang.Runnable
                        public void run() throws Resources.NotFoundException {
                            ACContainerPresenter aCContainerPresenter = ACContainerPresenter.this;
                            ACContainerPresenter.access$200(aCContainerPresenter, str, -12, ACContainerPresenter.access$100(aCContainerPresenter).getResources().getString(R.string.h5_url_error));
                        }
                    });
                    return;
                }
            }
            TextUtils.isEmpty(str);
            throw null;
        }
        throw null;
    }

    private void showDefaultErrorPage(String str, int i, String str2) throws Resources.NotFoundException {
        String string;
        String string2;
        String string3;
        String string4;
        String strReplace;
        int i2 = 2 % 2;
        ACContainerActivity aCContainerActivity = this.mContext;
        if (aCContainerActivity == null || this.mWebView == null) {
            return;
        }
        int i3 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            aCContainerActivity.getResources();
            throw null;
        }
        Resources resources = aCContainerActivity.getResources();
        if (resources != null) {
            string = resources.getString(R.string.h5_loading_failed);
            string2 = resources.getString(R.string.h5_menu_refresh);
            string3 = resources.getString(R.string.h5_network_check);
            string4 = resources.getString(R.string.h5_close);
        } else {
            string = "";
            string2 = string;
            string3 = string2;
            string4 = string3;
        }
        String rawFromResource = ResourceUtils.readRawFromResource(R.raw.h5_page_error, resources);
        if (TextUtils.isEmpty(rawFromResource)) {
            return;
        }
        if (!ACContainer.DEBUG) {
            rawFromResource = removeDebugStub(rawFromResource);
        }
        String strReplace2 = rawFromResource.replace("####", string2).replace("****", string3).replaceAll("&&&&", i + ": " + str2).replace("!!!!", string);
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        String strReplace3 = strReplace2.replace("$$$$", sb.toString()).replace("^^^^", string4);
        if (TextUtils.isEmpty(str)) {
            strReplace = strReplace3.replace("%%%%", "");
            int i4 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        } else {
            strReplace = strReplace3.replace("%%%%", str);
        }
        this.mWebView.loadDataWithBaseURL(str, strReplace.replace("@@@@", "showNetWorkCheckActivity"), "text/html", "utf-8", str);
    }

    private String removeDebugStub(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String strReplace = str.replace("id=\"networkCheck\"", "id=\"networkCheck\" style=\"display: none\" ");
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        return strReplace;
    }

    @Override // com.iap.android.mppclient.container.IContainerPresenter
    public void postUrl(String str, byte[] bArr) throws Resources.NotFoundException {
        int i = 2 % 2;
        if (this.mWebView == null) {
            int i2 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 14 / 0;
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.mWebView.postUrl(str, bArr);
            return;
        }
        showDefaultErrorPage(str, -12, this.mContext.getResources().getString(R.string.h5_url_error));
        int i4 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onWarmupCompleted;
        long j = 0;
        int i3 = -1469660336;
        if (iArr2 != null) {
            int i4 = $10 + 1;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 55;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 73 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 8849 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr2[i6])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 72 - ExpandableListView.getPackedPositionType(0L), 8848 - View.resolveSizeAndState(0, 0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i6] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i6++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                j = 0;
                i3 = -1469660336;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onWarmupCompleted;
        if (iArr5 != null) {
            int i8 = $11 + 29;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i10 = 0; i10 < length3; i10++) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), KeyEvent.normalizeMetaState(0) + 72, ((Process.getThreadPriority(0) + 20) >> 6) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i11 = 0;
            while (i11 < 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i11];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 22252), ((byte) KeyEvent.getModifierMetaStateMask()) + 40, TextUtils.indexOf("", "", 0, 0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i11++;
                int i12 = $10 + 119;
                $11 = i12 % 128;
                int i13 = i12 % 2;
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4032), Process.getGidForName("") + 79, ((byte) KeyEvent.getModifierMetaStateMask()) + 7399, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // com.iap.android.mppclient.container.IContainerPresenter
    public void closeWebview() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 5;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        ACContainerActivity aCContainerActivity = this.mContext;
        if (aCContainerActivity != null) {
            int i5 = i2 + 119;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            aCContainerActivity.finish();
            if (i6 != 0) {
                int i7 = 31 / 0;
            }
        }
    }

    @Override // com.iap.android.mppclient.container.IContainerPresenter
    public void showNetWorkCheckActivity(Map<String, String> map) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 59 / 0;
            if (map == null) {
                return;
            }
        } else if (map == null) {
            return;
        }
        if (!map.isEmpty()) {
            int i4 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                if (this.mContext != null) {
                    String str = map.get("error_code");
                    Object[] objArr = new Object[1];
                    a(new int[]{-1288373988, 1390463826}, View.resolveSizeAndState(0, 0, 0) + 3, objArr);
                    String str2 = map.get(((String) objArr[0]).intern());
                    Object[] objArr2 = new Object[1];
                    a(new int[]{-2058333172, -1770352513, 179798976, 1279921198}, 5 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
                    String str3 = map.get(((String) objArr2[0]).intern());
                    Intent intent = new Intent((Context) this.mContext, (Class<?>) H5NetworkCheckActivity.class);
                    intent.putExtra("error_code", str);
                    Object[] objArr3 = new Object[1];
                    a(new int[]{-1288373988, 1390463826}, 3 - ExpandableListView.getPackedPositionGroup(0L), objArr3);
                    intent.putExtra(((String) objArr3[0]).intern(), str2);
                    Object[] objArr4 = new Object[1];
                    a(new int[]{-2058333172, -1770352513, 179798976, 1279921198}, 7 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr4);
                    intent.putExtra(((String) objArr4[0]).intern(), str3);
                    this.mContext.startActivity(intent);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    @Override // com.iap.android.mppclient.container.IContainerPresenter
    public Context getContext() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 3;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        ACContainerActivity aCContainerActivity = this.mContext;
        int i4 = i2 + 91;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return aCContainerActivity;
    }

    @Override // com.iap.android.mppclient.container.IContainerPresenter
    public Activity getActivity() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        ACContainerActivity aCContainerActivity = this.mContext;
        int i5 = i3 + 89;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return aCContainerActivity;
    }

    public void onProgressChanged(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        IContainerView iContainerView = this.containerView;
        if (iContainerView != null) {
            iContainerView.onProgressChanged(i);
            int i4 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public void setWebView(WebView webView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.mWebView = webView;
        setWebView();
        int i4 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
    }

    private void setWebView() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        WebView webView = this.mWebView;
        if (webView == null) {
            return;
        }
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setSupportZoom(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setAllowFileAccess(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        try {
            ContainerUaProvider containerUaProvider = (ContainerUaProvider) ACContainer.INSTANCE.getProvider(ContainerUaProvider.class.getName());
            if (containerUaProvider != null) {
                settings.setUserAgentString(containerUaProvider.getUa(settings.getUserAgentString()) + " MPPContainer");
            }
        } catch (ClassCastException unused) {
        }
        this.mWebView.setWebViewClient(new ACWebViewClient(this.mContext, this.mWebView, this, this.bizCode, this.originalUrl));
        this.mWebView.setWebChromeClient(new ACWebChromeClient(this.mWebView, this, this.bizCode));
        int i3 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public void onPageFinished(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            IContainerView iContainerView = this.containerView;
            if (iContainerView != null) {
                int i4 = i3 + 91;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                iContainerView.onPageFinished(str);
                return;
            }
            return;
        }
        throw null;
    }

    public void onPageStarted(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        IContainerView iContainerView = this.containerView;
        if (iContainerView != null) {
            int i5 = i3 + 105;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            iContainerView.onPageStarted(str);
        }
        int i7 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
    }
}
