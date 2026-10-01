package com.reactnativecommunity.webview;

import android.telephony.cdma.CdmaCellLocation;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNCWebViewManagerDelegate;
import com.facebook.react.viewmanagers.RNCWebViewManagerInterface;
import com.google.android.gms.internal.firebase-auth-api.zzmr;
import java.lang.reflect.Method;
import java.util.Map;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.RopeByteString;
import o.r8lambdaXf3l0PkPKOo1rTArgwmrPM3pKtc;
import o.r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ;
import org.json.JSONException;
import org.json.JSONObject;

@ReactModule(IAuthTabCallback = "RNCWebView")
/* loaded from: /tmp/toss_alldex/classes16.dex */
public class RNCWebViewManager extends ViewGroupManager<RNCWebViewWrapper> implements RNCWebViewManagerInterface<RNCWebViewWrapper> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static long onNavigationEvent = 3790339339496626651L;
    private final r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<RNCWebViewWrapper> mDelegate = new RNCWebViewManagerDelegate(this);
    private final RNCWebViewManagerImpl mRNCWebViewManagerImpl = new RNCWebViewManagerImpl(true);

    public void setAllowingReadAccessToURL(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setAllowsAirPlayForMediaPlayback(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setAllowsBackForwardNavigationGestures(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setAllowsInlineMediaPlayback(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setAllowsLinkPreview(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 81 / 0;
        }
    }

    public void setAllowsPictureInPictureMediaPlayback(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setAutoManageStatusBarEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setAutomaticallyAdjustContentInsets(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setBounces(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setContentInset(RNCWebViewWrapper rNCWebViewWrapper, @Nullable ReadableMap readableMap) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setContentInsetAdjustmentBehavior(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void setContentMode(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setDataDetectorTypes(RNCWebViewWrapper rNCWebViewWrapper, @Nullable ReadableArray readableArray) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 38 / 0;
        }
    }

    public void setDecelerationRate(RNCWebViewWrapper rNCWebViewWrapper, double d) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setDirectionalLockEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setEnableApplePay(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void setFraudulentWebsiteWarningEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setHasOnFileDownload(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void setHideKeyboardAccessoryView(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 85 / 0;
        }
    }

    public void setIndicatorStyle(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setKeyboardDisplayRequiresUserAction(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public void setLimitsNavigationsToAppBoundDomains(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
        }
    }

    public void setMediaCapturePermissionGrantType(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
    }

    public void setPagingEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setPullToRefreshEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setRefreshControlLightMode(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 12 / 0;
        }
    }

    public void setScrollEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setSharedCookiesEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 34 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "suppressMenuItems")
    public void setSuppressMenuItems(RNCWebViewWrapper rNCWebViewWrapper, @Nullable ReadableArray readableArray) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setTextInteractionEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public void setUseSharedProcessPool(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public /* bridge */ /* synthetic */ void addEventEmitters(@NonNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        addEventEmitters(credentialProviderGetSignInIntentControllerhandleResponse2, (RNCWebViewWrapper) view);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 29;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void clearCache(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        clearCache((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void clearFormData(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        clearFormData((RNCWebViewWrapper) view);
        int i4 = onExtraCallbackWithResult + 21;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void clearHistory(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        clearHistory((RNCWebViewWrapper) view);
        int i4 = onExtraCallback + 47;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ View createViewInstance(@NonNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        RNCWebViewWrapper rNCWebViewWrapperM2createViewInstance = m2createViewInstance(credentialProviderGetSignInIntentControllerhandleResponse2);
        int i4 = onExtraCallbackWithResult + 57;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return rNCWebViewWrapperM2createViewInstance;
    }

    public /* bridge */ /* synthetic */ void goBack(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        goBack((RNCWebViewWrapper) view);
        int i4 = onExtraCallbackWithResult + 111;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void goForward(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        goForward((RNCWebViewWrapper) view);
        int i4 = onExtraCallback + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void injectJavaScript(View view, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        injectJavaScript((RNCWebViewWrapper) view, str);
        int i4 = onExtraCallback + 43;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void loadUrl(View view, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        loadUrl((RNCWebViewWrapper) view, str);
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        int i5 = onExtraCallbackWithResult + 25;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(@NonNull View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onAfterUpdateTransaction((RNCWebViewWrapper) view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallback + 67;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void onDropViewInstance(@NonNull View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onDropViewInstance((RNCWebViewWrapper) view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void postMessage(View view, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        postMessage((RNCWebViewWrapper) view, str);
        int i4 = onExtraCallback + 35;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void receiveCommand(@NonNull View view, String str, @Nullable ReadableArray readableArray) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        receiveCommand((RNCWebViewWrapper) view, str, readableArray);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void reload(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        reload((RNCWebViewWrapper) view);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 61;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void requestFocus(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        requestFocus((RNCWebViewWrapper) view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @ReactProp(IAuthTabCallbackStub = "allowFileAccess")
    public /* bridge */ /* synthetic */ void setAllowFileAccess(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setAllowFileAccess((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallbackWithResult + 61;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "allowFileAccessFromFileURLs")
    public /* bridge */ /* synthetic */ void setAllowFileAccessFromFileURLs(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setAllowFileAccessFromFileURLs((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallbackWithResult + 95;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "allowUniversalAccessFromFileURLs")
    public /* bridge */ /* synthetic */ void setAllowUniversalAccessFromFileURLs(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setAllowUniversalAccessFromFileURLs((RNCWebViewWrapper) view, z);
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        int i5 = onExtraCallback + 47;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ /* synthetic */ void setAllowingReadAccessToURL(View view, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setAllowingReadAccessToURL((RNCWebViewWrapper) view, str);
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        int i5 = onExtraCallback + 55;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ /* synthetic */ void setAllowsAirPlayForMediaPlayback(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setAllowsAirPlayForMediaPlayback((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallbackWithResult + 23;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setAllowsBackForwardNavigationGestures(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setAllowsBackForwardNavigationGestures((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallback + 69;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "allowsFullscreenVideo")
    public /* bridge */ /* synthetic */ void setAllowsFullscreenVideo(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setAllowsFullscreenVideo((RNCWebViewWrapper) view, z);
        if (i3 == 0) {
            int i4 = 62 / 0;
        }
        int i5 = onExtraCallbackWithResult + 123;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 45 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setAllowsInlineMediaPlayback(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setAllowsInlineMediaPlayback((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallbackWithResult + 69;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setAllowsLinkPreview(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setAllowsLinkPreview((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallback + 111;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setAllowsPictureInPictureMediaPlayback(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setAllowsPictureInPictureMediaPlayback((RNCWebViewWrapper) view, z);
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        int i5 = onExtraCallbackWithResult + 69;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "allowsProtectedMedia")
    public /* bridge */ /* synthetic */ void setAllowsProtectedMedia(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setAllowsProtectedMedia((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallback + 29;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @ReactProp(IAuthTabCallbackStub = "androidLayerType")
    public /* bridge */ /* synthetic */ void setAndroidLayerType(View view, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setAndroidLayerType((RNCWebViewWrapper) view, str);
        int i4 = onExtraCallback + 49;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "applicationNameForUserAgent")
    public /* bridge */ /* synthetic */ void setApplicationNameForUserAgent(View view, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setApplicationNameForUserAgent((RNCWebViewWrapper) view, str);
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
        int i5 = onExtraCallback + 103;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setAutoManageStatusBarEnabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setAutoManageStatusBarEnabled((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setAutomaticallyAdjustContentInsets(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setAutomaticallyAdjustContentInsets((RNCWebViewWrapper) view, z);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 17;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "basicAuthCredential")
    public /* bridge */ /* synthetic */ void setBasicAuthCredential(View view, @Nullable ReadableMap readableMap) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setBasicAuthCredential((RNCWebViewWrapper) view, readableMap);
        int i4 = onExtraCallbackWithResult + 23;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setBounces(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setBounces((RNCWebViewWrapper) view, z);
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "cacheEnabled")
    public /* bridge */ /* synthetic */ void setCacheEnabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setCacheEnabled((RNCWebViewWrapper) view, z);
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "cacheMode")
    public /* bridge */ /* synthetic */ void setCacheMode(View view, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setCacheMode((RNCWebViewWrapper) view, str);
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        int i5 = onExtraCallbackWithResult + 81;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setContentInset(View view, @Nullable ReadableMap readableMap) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setContentInset((RNCWebViewWrapper) view, readableMap);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setContentInsetAdjustmentBehavior(View view, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setContentInsetAdjustmentBehavior((RNCWebViewWrapper) view, str);
        int i4 = onExtraCallback + 75;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setContentMode(View view, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setContentMode((RNCWebViewWrapper) view, str);
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setDataDetectorTypes(View view, @Nullable ReadableArray readableArray) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setDataDetectorTypes((RNCWebViewWrapper) view, readableArray);
        int i4 = onExtraCallbackWithResult + 113;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setDecelerationRate(View view, double d) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setDecelerationRate((RNCWebViewWrapper) view, d);
        int i4 = onExtraCallbackWithResult + 99;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setDirectionalLockEnabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setDirectionalLockEnabled((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallbackWithResult + 43;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @ReactProp(IAuthTabCallbackStub = "domStorageEnabled")
    public /* bridge */ /* synthetic */ void setDomStorageEnabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setDomStorageEnabled((RNCWebViewWrapper) view, z);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 49;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "downloadingMessage")
    public /* bridge */ /* synthetic */ void setDownloadingMessage(View view, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setDownloadingMessage((RNCWebViewWrapper) view, str);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 43;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setEnableApplePay(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setEnableApplePay((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallbackWithResult + 83;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "forceDarkOn")
    public /* bridge */ /* synthetic */ void setForceDarkOn(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setForceDarkOn((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallbackWithResult + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setFraudulentWebsiteWarningEnabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setFraudulentWebsiteWarningEnabled((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallback + 89;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "geolocationEnabled")
    public /* bridge */ /* synthetic */ void setGeolocationEnabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setGeolocationEnabled((RNCWebViewWrapper) view, z);
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setHasOnFileDownload(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setHasOnFileDownload((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallbackWithResult + 7;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "hasOnOpenWindowEvent")
    public /* bridge */ /* synthetic */ void setHasOnOpenWindowEvent(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setHasOnOpenWindowEvent((RNCWebViewWrapper) view, z);
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        int i5 = onExtraCallback + 107;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "hasOnScroll")
    public /* bridge */ /* synthetic */ void setHasOnScroll(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setHasOnScroll((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallbackWithResult + 25;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setHideKeyboardAccessoryView(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setHideKeyboardAccessoryView((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallbackWithResult + 57;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "incognito")
    public /* bridge */ /* synthetic */ void setIncognito(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setIncognito((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallback + 7;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setIndicatorStyle(View view, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setIndicatorStyle((RNCWebViewWrapper) view, str);
        int i4 = onExtraCallbackWithResult + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "injectedJavaScript")
    public /* bridge */ /* synthetic */ void setInjectedJavaScript(View view, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setInjectedJavaScript((RNCWebViewWrapper) view, str);
        int i4 = onExtraCallbackWithResult + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "injectedJavaScriptBeforeContentLoaded")
    public /* bridge */ /* synthetic */ void setInjectedJavaScriptBeforeContentLoaded(View view, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setInjectedJavaScriptBeforeContentLoaded((RNCWebViewWrapper) view, str);
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        int i5 = onExtraCallbackWithResult + 1;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "injectedJavaScriptBeforeContentLoadedForMainFrameOnly")
    public /* bridge */ /* synthetic */ void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallbackWithResult + 61;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "injectedJavaScriptForMainFrameOnly")
    public /* bridge */ /* synthetic */ void setInjectedJavaScriptForMainFrameOnly(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setInjectedJavaScriptForMainFrameOnly((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallback + 75;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "injectedJavaScriptObject")
    public /* bridge */ /* synthetic */ void setInjectedJavaScriptObject(View view, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setInjectedJavaScriptObject((RNCWebViewWrapper) view, str);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @ReactProp(IAuthTabCallbackStub = "javaScriptCanOpenWindowsAutomatically")
    public /* bridge */ /* synthetic */ void setJavaScriptCanOpenWindowsAutomatically(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setJavaScriptCanOpenWindowsAutomatically((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallbackWithResult + 73;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "javaScriptEnabled")
    public /* bridge */ /* synthetic */ void setJavaScriptEnabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setJavaScriptEnabled((RNCWebViewWrapper) view, z);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setKeyboardDisplayRequiresUserAction(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setKeyboardDisplayRequiresUserAction((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallback + 85;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "lackPermissionToDownloadMessage")
    public /* bridge */ /* synthetic */ void setLackPermissionToDownloadMessage(View view, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setLackPermissionToDownloadMessage((RNCWebViewWrapper) view, str);
        int i4 = onExtraCallbackWithResult + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setLimitsNavigationsToAppBoundDomains(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setLimitsNavigationsToAppBoundDomains((RNCWebViewWrapper) view, z);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void setMediaCapturePermissionGrantType(View view, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setMediaCapturePermissionGrantType((RNCWebViewWrapper) view, str);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @ReactProp(IAuthTabCallbackStub = "mediaPlaybackRequiresUserAction")
    public /* bridge */ /* synthetic */ void setMediaPlaybackRequiresUserAction(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setMediaPlaybackRequiresUserAction((RNCWebViewWrapper) view, z);
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "menuItems")
    public /* bridge */ /* synthetic */ void setMenuItems(View view, @Nullable ReadableArray readableArray) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setMenuItems((RNCWebViewWrapper) view, readableArray);
        int i4 = onExtraCallbackWithResult + 17;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "messagingEnabled")
    public /* bridge */ /* synthetic */ void setMessagingEnabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setMessagingEnabled((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallbackWithResult + 73;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "messagingModuleName")
    public /* bridge */ /* synthetic */ void setMessagingModuleName(View view, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setMessagingModuleName((RNCWebViewWrapper) view, str);
        int i4 = onExtraCallbackWithResult + 109;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @ReactProp(IAuthTabCallbackStub = "minimumFontSize")
    public /* bridge */ /* synthetic */ void setMinimumFontSize(View view, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 51;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        setMinimumFontSize((RNCWebViewWrapper) view, i);
        int i5 = onExtraCallback + 91;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "mixedContentMode")
    public /* bridge */ /* synthetic */ void setMixedContentMode(View view, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setMixedContentMode((RNCWebViewWrapper) view, str);
        if (i3 == 0) {
            int i4 = 21 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "nestedScrollEnabled")
    public /* bridge */ /* synthetic */ void setNestedScrollEnabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setNestedScrollEnabled((RNCWebViewWrapper) view, z);
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        int i5 = onExtraCallback + 67;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "newSource")
    public /* bridge */ /* synthetic */ void setNewSource(View view, @Nullable ReadableMap readableMap) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setNewSource((RNCWebViewWrapper) view, readableMap);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallback + 39;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "overScrollMode")
    public /* bridge */ /* synthetic */ void setOverScrollMode(View view, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setOverScrollMode((RNCWebViewWrapper) view, str);
        int i4 = onExtraCallbackWithResult + 61;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setPagingEnabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setPagingEnabled((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallback + 9;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @ReactProp(IAuthTabCallbackStub = "paymentRequestEnabled")
    public /* bridge */ /* synthetic */ void setPaymentRequestEnabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setPaymentRequestEnabled((RNCWebViewWrapper) view, z);
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void setPullToRefreshEnabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setPullToRefreshEnabled((RNCWebViewWrapper) view, z);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 119;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setRefreshControlLightMode(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setRefreshControlLightMode((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallbackWithResult + 39;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "saveFormDataDisabled")
    public /* bridge */ /* synthetic */ void setSaveFormDataDisabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        setSaveFormDataDisabled((RNCWebViewWrapper) view, z);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallback + 19;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @ReactProp(IAuthTabCallbackStub = "scalesPageToFit")
    public /* bridge */ /* synthetic */ void setScalesPageToFit(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setScalesPageToFit((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallbackWithResult + 125;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setScrollEnabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setScrollEnabled((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallback + 15;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @ReactProp(IAuthTabCallbackStub = "setBuiltInZoomControls")
    public /* bridge */ /* synthetic */ void setSetBuiltInZoomControls(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setSetBuiltInZoomControls((RNCWebViewWrapper) view, z);
        if (i3 == 0) {
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "setDisplayZoomControls")
    public /* bridge */ /* synthetic */ void setSetDisplayZoomControls(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setSetDisplayZoomControls((RNCWebViewWrapper) view, z);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 35;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "setSupportMultipleWindows")
    public /* bridge */ /* synthetic */ void setSetSupportMultipleWindows(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setSetSupportMultipleWindows((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallbackWithResult + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setSharedCookiesEnabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setSharedCookiesEnabled((RNCWebViewWrapper) view, z);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallback + 91;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "showsHorizontalScrollIndicator")
    public /* bridge */ /* synthetic */ void setShowsHorizontalScrollIndicator(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setShowsHorizontalScrollIndicator((RNCWebViewWrapper) view, z);
        if (i3 == 0) {
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "showsVerticalScrollIndicator")
    public /* bridge */ /* synthetic */ void setShowsVerticalScrollIndicator(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setShowsVerticalScrollIndicator((RNCWebViewWrapper) view, z);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallback + 65;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "suppressMenuItems")
    public /* bridge */ /* synthetic */ void setSuppressMenuItems(View view, @Nullable ReadableArray readableArray) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setSuppressMenuItems((RNCWebViewWrapper) view, readableArray);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 3;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setTextInteractionEnabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setTextInteractionEnabled((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallbackWithResult + 43;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "textZoom")
    public /* bridge */ /* synthetic */ void setTextZoom(View view, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 9;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        setTextZoom((RNCWebViewWrapper) view, i);
        int i5 = onExtraCallbackWithResult + 19;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "thirdPartyCookiesEnabled")
    public /* bridge */ /* synthetic */ void setThirdPartyCookiesEnabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setThirdPartyCookiesEnabled((RNCWebViewWrapper) view, z);
        int i4 = onExtraCallback + 21;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void setUseSharedProcessPool(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        setUseSharedProcessPool((RNCWebViewWrapper) view, z);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 111;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "userAgent")
    public /* bridge */ /* synthetic */ void setUserAgent(View view, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setUserAgent((RNCWebViewWrapper) view, str);
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        int i5 = onExtraCallback + 115;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "webviewDebuggingEnabled")
    public /* bridge */ /* synthetic */ void setWebviewDebuggingEnabled(View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setWebviewDebuggingEnabled((RNCWebViewWrapper) view, z);
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        int i5 = onExtraCallback + 23;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void stopLoading(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        stopLoading((RNCWebViewWrapper) view);
        int i4 = onExtraCallback + 37;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
    }

    public r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<RNCWebViewWrapper> getDelegate() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<RNCWebViewWrapper> r8lambdafabcsqiuodz2nkxqdax2sri9ddq = this.mDelegate;
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        return r8lambdafabcsqiuodz2nkxqdax2sri9ddq;
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 125;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 45;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
        return "RNCWebView";
    }

    /* renamed from: createViewInstance, reason: collision with other method in class */
    protected RNCWebViewWrapper m2createViewInstance(@NonNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.mRNCWebViewManagerImpl.onExtraCallbackWithResult(credentialProviderGetSignInIntentControllerhandleResponse2);
            throw null;
        }
        RNCWebViewWrapper rNCWebViewWrapperOnExtraCallbackWithResult = this.mRNCWebViewManagerImpl.onExtraCallbackWithResult(credentialProviderGetSignInIntentControllerhandleResponse2);
        int i3 = onExtraCallbackWithResult + 37;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return rNCWebViewWrapperOnExtraCallbackWithResult;
        }
        throw null;
    }

    @ReactProp(IAuthTabCallbackStub = "allowFileAccess")
    public void setAllowFileAccess(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.IAuthTabCallback(rNCWebViewWrapper, z);
        int i4 = onExtraCallback + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "allowFileAccessFromFileURLs")
    public void setAllowFileAccessFromFileURLs(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.onExtraCallbackWithResult(rNCWebViewWrapper, z);
        int i4 = onExtraCallback + 69;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 105;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), (ViewConfiguration.getJumpTapTimeout() >> 16) + 24, ExpandableListView.getPackedPositionChild(0L) + 19628, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onNavigationEvent ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 59, (ViewConfiguration.getJumpTapTimeout() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 59, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        String str = new String(cArr2);
        int i6 = $11 + 113;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    @ReactProp(IAuthTabCallbackStub = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.mRNCWebViewManagerImpl, rNCWebViewWrapper, Boolean.valueOf(z)};
        RNCWebViewManagerImpl.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 534493803, -534493800, zzmr.onExtraCallbackWithResult(), objArr, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
        int i4 = onExtraCallbackWithResult + 49;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "allowsFullscreenVideo")
    public void setAllowsFullscreenVideo(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.onExtraCallback(rNCWebViewWrapper, z);
        int i4 = onExtraCallback + 67;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @ReactProp(IAuthTabCallbackStub = "allowsProtectedMedia")
    public void setAllowsProtectedMedia(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        RNCWebViewManagerImpl.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1977005492, 1977005494, zzmr.onExtraCallbackWithResult(), new Object[]{this.mRNCWebViewManagerImpl, rNCWebViewWrapper, Boolean.valueOf(z)}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
        int i4 = onExtraCallbackWithResult + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "androidLayerType")
    public void setAndroidLayerType(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.mRNCWebViewManagerImpl.IAuthTabCallback(rNCWebViewWrapper, str);
            int i3 = 21 / 0;
        } else {
            this.mRNCWebViewManagerImpl.IAuthTabCallback(rNCWebViewWrapper, str);
        }
        int i4 = onExtraCallback + 115;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "applicationNameForUserAgent")
    public void setApplicationNameForUserAgent(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.onWarmupCompleted(rNCWebViewWrapper, str);
        int i4 = onExtraCallback + 65;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "basicAuthCredential")
    public void setBasicAuthCredential(RNCWebViewWrapper rNCWebViewWrapper, @Nullable ReadableMap readableMap) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            this.mRNCWebViewManagerImpl.onExtraCallbackWithResult(rNCWebViewWrapper, readableMap);
            throw null;
        }
        this.mRNCWebViewManagerImpl.onExtraCallbackWithResult(rNCWebViewWrapper, readableMap);
        int i3 = onExtraCallbackWithResult + 63;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "cacheEnabled")
    public void setCacheEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.IAuthTabCallbackStub(rNCWebViewWrapper, z);
        int i4 = onExtraCallbackWithResult + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "cacheMode")
    public void setCacheMode(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.onNavigationEvent(rNCWebViewWrapper, str);
        int i4 = onExtraCallback + 21;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "domStorageEnabled")
    public void setDomStorageEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.asBinder(rNCWebViewWrapper, z);
        int i4 = onExtraCallbackWithResult + 21;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "downloadingMessage")
    public void setDownloadingMessage(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.onExtraCallback(str);
        int i4 = onExtraCallbackWithResult + 5;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "forceDarkOn")
    public void setForceDarkOn(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.mRNCWebViewManagerImpl, rNCWebViewWrapper, Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        if (i3 == 0) {
            RNCWebViewManagerImpl.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 1418289766, -1418289758, iOnExtraCallbackWithResult, objArr, iOnExtraCallbackWithResult2, zzmr.onExtraCallbackWithResult());
            return;
        }
        RNCWebViewManagerImpl.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 1418289766, -1418289758, iOnExtraCallbackWithResult, objArr, iOnExtraCallbackWithResult2, zzmr.onExtraCallbackWithResult());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @ReactProp(IAuthTabCallbackStub = "geolocationEnabled")
    public void setGeolocationEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.IAuthTabCallbackDefault(rNCWebViewWrapper, z);
        int i4 = onExtraCallbackWithResult + 65;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "hasOnScroll")
    public void setHasOnScroll(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.mRNCWebViewManagerImpl, rNCWebViewWrapper, Boolean.valueOf(z)};
        RNCWebViewManagerImpl.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -637053112, 637053118, zzmr.onExtraCallbackWithResult(), objArr, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
        int i4 = onExtraCallbackWithResult + 71;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "incognito")
    public void setIncognito(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.mRNCWebViewManagerImpl.access100(rNCWebViewWrapper, z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.mRNCWebViewManagerImpl.access100(rNCWebViewWrapper, z);
        int i3 = onExtraCallback + 7;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "injectedJavaScript")
    public void setInjectedJavaScript(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            this.mRNCWebViewManagerImpl.onExtraCallbackWithResult(rNCWebViewWrapper, str);
            int i3 = 21 / 0;
        } else {
            this.mRNCWebViewManagerImpl.onExtraCallbackWithResult(rNCWebViewWrapper, str);
        }
        int i4 = onExtraCallback + 35;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "injectedJavaScriptBeforeContentLoaded")
    public void setInjectedJavaScriptBeforeContentLoaded(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.onExtraCallback(rNCWebViewWrapper, str);
        int i4 = onExtraCallback + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "injectedJavaScriptForMainFrameOnly")
    public void setInjectedJavaScriptForMainFrameOnly(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.mRNCWebViewManagerImpl.access000(rNCWebViewWrapper, z);
            throw null;
        }
        this.mRNCWebViewManagerImpl.access000(rNCWebViewWrapper, z);
        int i3 = onExtraCallback + 27;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @ReactProp(IAuthTabCallbackStub = "injectedJavaScriptBeforeContentLoadedForMainFrameOnly")
    public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.IAuthTabCallback_Parcel(rNCWebViewWrapper, z);
        int i4 = onExtraCallbackWithResult + 83;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "injectedJavaScriptObject")
    public void setInjectedJavaScriptObject(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.IAuthTabCallbackDefault(rNCWebViewWrapper, str);
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "javaScriptCanOpenWindowsAutomatically")
    public void setJavaScriptCanOpenWindowsAutomatically(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.mRNCWebViewManagerImpl, rNCWebViewWrapper, Boolean.valueOf(z)};
        RNCWebViewManagerImpl.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 1137870636, -1137870635, zzmr.onExtraCallbackWithResult(), objArr, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
        int i4 = onExtraCallbackWithResult + 9;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "javaScriptEnabled")
    public void setJavaScriptEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.ICustomTabsCallback(rNCWebViewWrapper, z);
        int i4 = onExtraCallbackWithResult + 123;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @ReactProp(IAuthTabCallbackStub = "lackPermissionToDownloadMessage")
    public void setLackPermissionToDownloadMessage(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            this.mRNCWebViewManagerImpl.IAuthTabCallback(str);
            throw null;
        }
        this.mRNCWebViewManagerImpl.IAuthTabCallback(str);
        int i3 = onExtraCallbackWithResult + 61;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "hasOnOpenWindowEvent")
    public void setHasOnOpenWindowEvent(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.onTransact(rNCWebViewWrapper, z);
        int i4 = onExtraCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @ReactProp(IAuthTabCallbackStub = "mediaPlaybackRequiresUserAction")
    public void setMediaPlaybackRequiresUserAction(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.extraCallback(rNCWebViewWrapper, z);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @ReactProp(IAuthTabCallbackStub = "menuItems")
    public void setMenuItems(RNCWebViewWrapper rNCWebViewWrapper, @Nullable ReadableArray readableArray) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.onExtraCallback(rNCWebViewWrapper, readableArray);
        int i4 = onExtraCallbackWithResult + 93;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "messagingEnabled")
    public void setMessagingEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.writeTypedObject(rNCWebViewWrapper, z);
        int i4 = onExtraCallback + 73;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "messagingModuleName")
    public void setMessagingModuleName(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.onTransact(rNCWebViewWrapper, str);
        if (i3 == 0) {
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "minimumFontSize")
    public void setMinimumFontSize(RNCWebViewWrapper rNCWebViewWrapper, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 35;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        RNCWebViewManagerImpl.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 1925054186, -1925054186, zzmr.onExtraCallbackWithResult(), new Object[]{this.mRNCWebViewManagerImpl, rNCWebViewWrapper, Integer.valueOf(i)}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
        int i5 = onExtraCallbackWithResult + 19;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "mixedContentMode")
    public void setMixedContentMode(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.asBinder(rNCWebViewWrapper, str);
        int i4 = onExtraCallbackWithResult + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "nestedScrollEnabled")
    public void setNestedScrollEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.readTypedObject(rNCWebViewWrapper, z);
        int i4 = onExtraCallback + 29;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "overScrollMode")
    public void setOverScrollMode(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.IAuthTabCallbackStub(rNCWebViewWrapper, str);
        int i4 = onExtraCallback + 13;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.onMinimized(rNCWebViewWrapper, z);
        int i4 = onExtraCallback + 67;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "scalesPageToFit")
    public void setScalesPageToFit(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.onMessageChannelReady(rNCWebViewWrapper, z);
        if (i3 != 0) {
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "setBuiltInZoomControls")
    public void setSetBuiltInZoomControls(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.onActivityLayout(rNCWebViewWrapper, z);
        int i4 = onExtraCallbackWithResult + 103;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "setDisplayZoomControls")
    public void setSetDisplayZoomControls(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            this.mRNCWebViewManagerImpl.onPostMessage(rNCWebViewWrapper, z);
            int i3 = 63 / 0;
        } else {
            this.mRNCWebViewManagerImpl.onPostMessage(rNCWebViewWrapper, z);
        }
        int i4 = onExtraCallback + 67;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "setSupportMultipleWindows")
    public void setSetSupportMultipleWindows(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.onActivityResized(rNCWebViewWrapper, z);
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            this.mRNCWebViewManagerImpl.onUnminimized(rNCWebViewWrapper, z);
            int i3 = 22 / 0;
        } else {
            this.mRNCWebViewManagerImpl.onUnminimized(rNCWebViewWrapper, z);
        }
        int i4 = onExtraCallbackWithResult + 69;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.onRelationshipValidationResult(rNCWebViewWrapper, z);
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "newSource")
    public void setNewSource(RNCWebViewWrapper rNCWebViewWrapper, @Nullable ReadableMap readableMap) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.mRNCWebViewManagerImpl, rNCWebViewWrapper, readableMap};
        RNCWebViewManagerImpl.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -2062603818, 2062603829, zzmr.onExtraCallbackWithResult(), objArr, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
        int i4 = onExtraCallback + 91;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactProp(IAuthTabCallbackStub = "textZoom")
    public void setTextZoom(RNCWebViewWrapper rNCWebViewWrapper, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 43;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        this.mRNCWebViewManagerImpl.onNavigationEvent(rNCWebViewWrapper, i);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @ReactProp(IAuthTabCallbackStub = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.mRNCWebViewManagerImpl.ICustomTabsCallbackStub(rNCWebViewWrapper, z);
            int i3 = 45 / 0;
        } else {
            this.mRNCWebViewManagerImpl.ICustomTabsCallbackStub(rNCWebViewWrapper, z);
        }
        int i4 = onExtraCallbackWithResult + 121;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @ReactProp(IAuthTabCallbackStub = "webviewDebuggingEnabled")
    public void setWebviewDebuggingEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.mRNCWebViewManagerImpl.ICustomTabsCallbackStubProxy(rNCWebViewWrapper, z);
        int i4 = onExtraCallbackWithResult + 1;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @ReactProp(IAuthTabCallbackStub = "paymentRequestEnabled")
    public void setPaymentRequestEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.mRNCWebViewManagerImpl, rNCWebViewWrapper, Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        if (i3 != 0) {
            RNCWebViewManagerImpl.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 2108923536, -2108923532, iOnExtraCallbackWithResult, objArr, iOnExtraCallbackWithResult2, zzmr.onExtraCallbackWithResult());
            return;
        }
        RNCWebViewManagerImpl.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 2108923536, -2108923532, iOnExtraCallbackWithResult, objArr, iOnExtraCallbackWithResult2, zzmr.onExtraCallbackWithResult());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @ReactProp(IAuthTabCallbackStub = "userAgent")
    public void setUserAgent(RNCWebViewWrapper rNCWebViewWrapper, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.mRNCWebViewManagerImpl, rNCWebViewWrapper, str};
        if (i3 != 0) {
            RNCWebViewManagerImpl.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 1292086470, -1292086465, zzmr.onExtraCallbackWithResult(), objArr, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
        } else {
            RNCWebViewManagerImpl.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 1292086470, -1292086465, zzmr.onExtraCallbackWithResult(), objArr, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
            int i4 = 10 / 0;
        }
    }

    public void goBack(RNCWebViewWrapper rNCWebViewWrapper) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        rNCWebViewWrapper.onExtraCallback().goBack();
        int i4 = onExtraCallback + 51;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void goForward(RNCWebViewWrapper rNCWebViewWrapper) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        rNCWebViewWrapper.onExtraCallback().goForward();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 93;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public void reload(RNCWebViewWrapper rNCWebViewWrapper) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        rNCWebViewWrapper.onExtraCallback().reload();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 107;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void stopLoading(RNCWebViewWrapper rNCWebViewWrapper) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        rNCWebViewWrapper.onExtraCallback().stopLoading();
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        int i5 = onExtraCallback + 35;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public void injectJavaScript(RNCWebViewWrapper rNCWebViewWrapper, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        rNCWebViewWrapper.onExtraCallback().onNavigationEvent(str);
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
    }

    public void requestFocus(RNCWebViewWrapper rNCWebViewWrapper) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        rNCWebViewWrapper.requestFocus();
        if (i3 != 0) {
            throw null;
        }
    }

    public void postMessage(RNCWebViewWrapper rNCWebViewWrapper, String str) throws Throwable {
        int i = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject();
            Object[] objArr = new Object[1];
            b(new char[]{7304, 3540, 15914, 10374}, View.resolveSize(0, 0) + 4441, objArr);
            jSONObject.put(((String) objArr[0]).intern(), str);
            rNCWebViewWrapper.onExtraCallback().onNavigationEvent("(function () {var event;var data = " + jSONObject.toString() + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
            int i2 = onExtraCallbackWithResult + 75;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public void loadUrl(RNCWebViewWrapper rNCWebViewWrapper, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        rNCWebViewWrapper.onExtraCallback().loadUrl(str);
        if (i3 == 0) {
            throw null;
        }
    }

    public void clearFormData(RNCWebViewWrapper rNCWebViewWrapper) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        rNCWebViewWrapper.onExtraCallback().clearFormData();
        int i4 = onExtraCallbackWithResult + 109;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public void clearCache(RNCWebViewWrapper rNCWebViewWrapper, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        rNCWebViewWrapper.onExtraCallback().clearCache(z);
        int i4 = onExtraCallback + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public void clearHistory(RNCWebViewWrapper rNCWebViewWrapper) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        rNCWebViewWrapper.onExtraCallback().clearHistory();
        int i4 = onExtraCallback + 101;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    protected void addEventEmitters(@NonNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2, RNCWebViewWrapper rNCWebViewWrapper) {
        int i = 2 % 2;
        rNCWebViewWrapper.onExtraCallback().setWebViewClient(new RNCWebViewClient());
        int i2 = onExtraCallbackWithResult + 109;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() throws Throwable {
        int i = 2 % 2;
        Map<String, Object> exportedCustomDirectEventTypeConstants = super/*com.facebook.react.uimanager.BaseViewManager*/.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            int i2 = onExtraCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                exportedCustomDirectEventTypeConstants = r8lambdaXf3l0PkPKOo1rTArgwmrPM3pKtc.onWarmupCompleted();
                int i3 = 9 / 0;
            } else {
                exportedCustomDirectEventTypeConstants = r8lambdaXf3l0PkPKOo1rTArgwmrPM3pKtc.onWarmupCompleted();
            }
        }
        exportedCustomDirectEventTypeConstants.put("topLoadingStart", r8lambdaXf3l0PkPKOo1rTArgwmrPM3pKtc.onWarmupCompleted("registrationName", "onLoadingStart"));
        exportedCustomDirectEventTypeConstants.put("topLoadingFinish", r8lambdaXf3l0PkPKOo1rTArgwmrPM3pKtc.onWarmupCompleted("registrationName", "onLoadingFinish"));
        exportedCustomDirectEventTypeConstants.put("topLoadingError", r8lambdaXf3l0PkPKOo1rTArgwmrPM3pKtc.onWarmupCompleted("registrationName", "onLoadingError"));
        exportedCustomDirectEventTypeConstants.put("topLoadingSubResourceError", r8lambdaXf3l0PkPKOo1rTArgwmrPM3pKtc.onWarmupCompleted("registrationName", "onLoadingSubResourceError"));
        Object[] objArr = new Object[1];
        b(new char[]{7299, 35849, 15799, 44328, 24243, 52776, 32719, 61254, 39121}, 37004 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
        exportedCustomDirectEventTypeConstants.put("topMessage", r8lambdaXf3l0PkPKOo1rTArgwmrPM3pKtc.onWarmupCompleted("registrationName", ((String) objArr[0]).intern()));
        exportedCustomDirectEventTypeConstants.put("topLoadingProgress", r8lambdaXf3l0PkPKOo1rTArgwmrPM3pKtc.onWarmupCompleted("registrationName", "onLoadingProgress"));
        exportedCustomDirectEventTypeConstants.put("topShouldStartLoadWithRequest", r8lambdaXf3l0PkPKOo1rTArgwmrPM3pKtc.onWarmupCompleted("registrationName", "onShouldStartLoadWithRequest"));
        exportedCustomDirectEventTypeConstants.put(RopeByteString.getJSEventName(RopeByteString.SCROLL), r8lambdaXf3l0PkPKOo1rTArgwmrPM3pKtc.onWarmupCompleted("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.put("topHttpError", r8lambdaXf3l0PkPKOo1rTArgwmrPM3pKtc.onWarmupCompleted("registrationName", "onHttpError"));
        exportedCustomDirectEventTypeConstants.put("topRenderProcessGone", r8lambdaXf3l0PkPKOo1rTArgwmrPM3pKtc.onWarmupCompleted("registrationName", "onRenderProcessGone"));
        exportedCustomDirectEventTypeConstants.put("topCustomMenuSelection", r8lambdaXf3l0PkPKOo1rTArgwmrPM3pKtc.onWarmupCompleted("registrationName", "onCustomMenuSelection"));
        exportedCustomDirectEventTypeConstants.put("topOpenWindow", r8lambdaXf3l0PkPKOo1rTArgwmrPM3pKtc.onWarmupCompleted("registrationName", "onOpenWindow"));
        int i4 = onExtraCallback + 15;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return exportedCustomDirectEventTypeConstants;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Map<String, Integer> getCommandsMap() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Integer> mapOnExtraCallbackWithResult = this.mRNCWebViewManagerImpl.onExtraCallbackWithResult();
        int i4 = onExtraCallbackWithResult + 69;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return mapOnExtraCallbackWithResult;
        }
        throw null;
    }

    public void receiveCommand(@NonNull RNCWebViewWrapper rNCWebViewWrapper, String str, @Nullable ReadableArray readableArray) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super/*com.facebook.react.uimanager.ViewManager*/.receiveCommand(rNCWebViewWrapper, str, readableArray);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onAfterUpdateTransaction(@NonNull RNCWebViewWrapper rNCWebViewWrapper) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            super/*com.facebook.react.uimanager.BaseViewManager*/.onAfterUpdateTransaction(rNCWebViewWrapper);
            this.mRNCWebViewManagerImpl.onNavigationEvent(rNCWebViewWrapper);
        } else {
            super/*com.facebook.react.uimanager.BaseViewManager*/.onAfterUpdateTransaction(rNCWebViewWrapper);
            this.mRNCWebViewManagerImpl.onNavigationEvent(rNCWebViewWrapper);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void onDropViewInstance(@NonNull RNCWebViewWrapper rNCWebViewWrapper) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.mRNCWebViewManagerImpl, rNCWebViewWrapper};
            RNCWebViewManagerImpl.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1228847648, 1228847658, zzmr.onExtraCallbackWithResult(), objArr, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
            super/*com.facebook.react.uimanager.BaseViewManager*/.onDropViewInstance(rNCWebViewWrapper);
            int i3 = 39 / 0;
            return;
        }
        Object[] objArr2 = {this.mRNCWebViewManagerImpl, rNCWebViewWrapper};
        RNCWebViewManagerImpl.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1228847648, 1228847658, zzmr.onExtraCallbackWithResult(), objArr2, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
        super/*com.facebook.react.uimanager.BaseViewManager*/.onDropViewInstance(rNCWebViewWrapper);
    }
}
