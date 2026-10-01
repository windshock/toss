package im.toss.core.webkit;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.CookieManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzgc;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import com.google.gson.JsonObject;
import com.tmoney.LiveCheckConstants;
import im.toss.core.utils.RandomKeyGenerator;
import im.toss.core.webkit.TossBridgeWebView;
import im.toss.core.webkit.TossBridgeWebView$;
import im.toss.define.TossAffiliate;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.Cookies_getFromResponse;
import o.Cookies_set;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.LinkGenerator1;
import o.RotationProvider1;
import o.SegmentedButtonKtExternalSyntheticLambda4;
import o.SegmentedButtonKtExternalSyntheticLambda5;
import o.SegmentedButtonKtExternalSyntheticLambda6;
import o.SegmentedButtonKtExternalSyntheticLambda7;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldPressGestureFilterKttapPressTextFieldModifier121ExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TransitionKtExternalSyntheticLambda2;
import o.access13800;
import o.access14300;
import o.access14600;
import o.access8100;
import o.doGet;
import o.drawFocusCircle;
import o.filterCreatePageParams;
import o.findRes;
import o.findResAndMsg;
import o.flipCamera;
import o.formatMsgs;
import o.getAdService;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getFullPackage;
import o.getPackageType;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.hasVaryAll;
import o.isNeedUnzip;
import o.maybeRemoveAttachStateListener;
import o.maybeUpdateAnimatable;
import o.mergeParams;
import o.nSetPosition;
import o.putChannelInfo;
import o.readIntokhttp;
import o.setCircleColor;
import o.setCommandLine;
import o.setDeployments;
import o.setLogBuffers;
import o.setPreviewSize;
import o.setRandomHost;
import o.setResourceInternal;
import o.setRevision;
import o.setTopGuideFontSize;
import o.setTopGuideFontStyle;
import o.setTopGuideSpacing;
import o.setVariables;
import o.startRunning;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class TossBridgeWebView extends WebView implements setVariables, flipCamera {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static boolean IAuthTabCallback = false;
    private static boolean ICustomTabsCallbackDefault = false;
    private static char[] ICustomTabsCallbackStub = null;
    private static int ICustomTabsCallback_Parcel = 1;
    private static int ICustomTabsService = 1;
    private static boolean extraCommand;
    private static int isEngagementSignalsApiAvailable;
    private static int mayLaunchUrl;
    private static boolean onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    private static int onRelationshipValidationResult;
    private static volatile Function0<Boolean> onWarmupCompleted;
    private boolean IAuthTabCallbackDefault;
    private getPackageType IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private drawFocusCircle IAuthTabCallback_Parcel;
    private ArrayList<onExtraCallback> ICustomTabsCallback;
    private setTopGuideSpacing ICustomTabsCallbackStubProxy;
    private final List<String> access000;
    private final findResAndMsg access100;
    private String asBinder;
    private boolean asInterface;
    private final HashMap<String, setVariables> extraCallback;
    private final HashMap<String, String> extraCallbackWithResult;
    private String getInterfaceDescriptor;
    private String onActivityLayout;
    private String onActivityResized;
    private WebChromeClient onMessageChannelReady;
    private final Map<String, setTopGuideFontStyle> onMinimized;
    private boolean onPostMessage;
    private final boolean onTransact;
    private final Lazy onUnminimized;
    private final Paint readTypedObject;
    private volatile onExtraCallbackWithResult writeTypedObject;

    public interface onExtraCallback {
        void onWarmupCompleted(int i, int i2, int i3, int i4, boolean z);
    }

    public interface onExtraCallbackWithResult {
        boolean onRenderProcessGone(@NotNull TossBridgeWebView tossBridgeWebView, @Nullable RenderProcessGoneDetail renderProcessGoneDetail);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TossBridgeWebView tossBridgeWebView = (TossBridgeWebView) objArr[0];
        String str = (String) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 111;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(tossBridgeWebView, str, function1);
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ String asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 23;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            onUnminimized();
            throw null;
        }
        String strOnUnminimized = onUnminimized();
        int i3 = isEngagementSignalsApiAvailable + 15;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return strOnUnminimized;
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 27;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnPostMessage = onPostMessage();
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        return Boolean.valueOf(zOnPostMessage);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 9;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(startrunning);
        int i4 = ICustomTabsCallback_Parcel + 107;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TossBridgeWebView tossBridgeWebView, Function1 function1, String str) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 95;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(tossBridgeWebView, function1, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = isEngagementSignalsApiAvailable + 75;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 39;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function1, str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = ICustomTabsCallback_Parcel + 51;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TossBridgeWebView tossBridgeWebView = (TossBridgeWebView) objArr[0];
        String str = (String) objArr[1];
        Map map = (Map) objArr[2];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 17;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(tossBridgeWebView, str, map);
        int i4 = isEngagementSignalsApiAvailable + 93;
        ICustomTabsCallback_Parcel = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TossBridgeWebView tossBridgeWebView, String str, Function1 function1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 77;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{tossBridgeWebView, str, function1}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1190117993, -1190117985, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2);
        int i3 = isEngagementSignalsApiAvailable + 33;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 51;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(z);
        int i3 = ICustomTabsCallback_Parcel + 113;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 30 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, String str) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 33;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{function1, str}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -659557012, 659557023, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback);
        int i4 = isEngagementSignalsApiAvailable + 45;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final boolean onPostMessage() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 41;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 19;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = (~(i7 | i8)) | i4;
        int i10 = i8 | i4;
        int i11 = (~((~i4) | i3)) | (~i10);
        int i12 = (~(i6 | i7 | i4)) | (~(i10 | i3));
        int i13 = i4 + i3 + i + (528639218 * i2) + ((-532493036) * i5);
        int i14 = i13 * i13;
        int i15 = ((i4 * 873666089) - 1460666368) + (873666089 * i3) + ((-875965520) * i9) + (437982760 * i11) + ((-437982760) * i12) + (435683328 * i) + (1819279360 * i2) + ((-1621098496) * i5) + (586088448 * i14);
        int i16 = (i4 * (-1573143961)) + 2078511484 + (i3 * (-1573143961)) + (i9 * 1872) + (i11 * (-936)) + (i12 * 936) + (i * (-1573143025)) + (i2 * 123045422) + (i5 * (-1548035028)) + (i14 * 1845559296);
        switch (i15 + (i16 * i16 * 1848705024)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                TossBridgeWebView tossBridgeWebView = (TossBridgeWebView) objArr[0];
                WebView webView = (WebView) objArr[1];
                access13800<? super Integer> access13800Var = (access13800) objArr[2];
                int i17 = 2 % 2;
                int i18 = isEngagementSignalsApiAvailable + 75;
                ICustomTabsCallback_Parcel = i18 % 128;
                int i19 = i18 % 2;
                Object objIAuthTabCallback = tossBridgeWebView.IAuthTabCallback(webView, access13800Var);
                int i20 = ICustomTabsCallback_Parcel + 23;
                isEngagementSignalsApiAvailable = i20 % 128;
                int i21 = i20 % 2;
                return objIAuthTabCallback;
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                int i22 = 2 % 2;
                String strOnExtraCallbackWithResult = ((TossBridgeWebView) objArr[0]).onExtraCallbackWithResult();
                if (strOnExtraCallbackWithResult != null) {
                    Uri uri = Uri.parse(strOnExtraCallbackWithResult);
                    Intrinsics.checkNotNullExpressionValue(uri, "");
                    return Boolean.valueOf(filterCreatePageParams.IAuthTabCallback(uri));
                }
                int i23 = ICustomTabsCallback_Parcel + 95;
                int i24 = i23 % 128;
                isEngagementSignalsApiAvailable = i24;
                int i25 = i23 % 2;
                int i26 = i24 + 39;
                ICustomTabsCallback_Parcel = i26 % 128;
                int i27 = i26 % 2;
                return false;
            case 7:
                return asInterface(objArr);
            case 8:
                TossBridgeWebView tossBridgeWebView2 = (TossBridgeWebView) objArr[0];
                String str = (String) objArr[1];
                final Function1 function1 = (Function1) objArr[2];
                int i28 = 2 % 2;
                Intrinsics.checkNotNullParameter(function1, "");
                tossBridgeWebView2.evaluateJavascript(str, new ValueCallback() { // from class: im.toss.core.webkit.TossBridgeWebView$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        int i29 = 2 % 2;
                        int i30 = onExtraCallback + 71;
                        IAuthTabCallback = i30 % 128;
                        int i31 = i30 % 2;
                        Function1 function12 = function1;
                        String str2 = (String) obj;
                        if (i31 == 0) {
                            TossBridgeWebView.onExtraCallbackWithResult(function12, str2);
                        } else {
                            TossBridgeWebView.onExtraCallbackWithResult(function12, str2);
                            int i32 = 43 / 0;
                        }
                    }
                });
                Unit unit = Unit.INSTANCE;
                int i29 = isEngagementSignalsApiAvailable + 39;
                ICustomTabsCallback_Parcel = i29 % 128;
                int i30 = i29 % 2;
                return unit;
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                TossBridgeWebView tossBridgeWebView3 = (TossBridgeWebView) objArr[0];
                int i31 = 2 % 2;
                int i32 = isEngagementSignalsApiAvailable + 47;
                ICustomTabsCallback_Parcel = i32 % 128;
                int i33 = i32 % 2;
                String str2 = (String) tossBridgeWebView3.onUnminimized.getValue();
                int i34 = isEngagementSignalsApiAvailable + 3;
                ICustomTabsCallback_Parcel = i34 % 128;
                int i35 = i34 % 2;
                return str2;
            case 11:
                Function1 function12 = (Function1) objArr[0];
                String str3 = (String) objArr[1];
                int i36 = 2 % 2;
                int i37 = isEngagementSignalsApiAvailable + 51;
                ICustomTabsCallback_Parcel = i37 % 128;
                int i38 = i37 % 2;
                function12.invoke(str3);
                int i39 = isEngagementSignalsApiAvailable + 29;
                ICustomTabsCallback_Parcel = i39 % 128;
                int i40 = i39 % 2;
                return null;
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 91;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {startrunning};
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback4 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(iOnExtraCallback2, objArr, iOnExtraCallback3, -706625105, 706625109, iOnExtraCallback4, iOnExtraCallback);
        int i4 = isEngagementSignalsApiAvailable + 73;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ boolean onWarmupCompleted(onExtraCallback onextracallback, onExtraCallback onextracallback2) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 45;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(onextracallback, onextracallback2);
            throw null;
        }
        boolean zIAuthTabCallback = IAuthTabCallback(onextracallback, onextracallback2);
        int i3 = isEngagementSignalsApiAvailable + 19;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 5 / 0;
        }
        return zIAuthTabCallback;
    }

    public static final class IAuthTabCallbackStubProxy implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallbackStubProxy(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onExtraCallback + 89;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            throw null;
        }
    }

    public static final class IAuthTabCallback_Parcel implements getAdService {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallback_Parcel(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Dark;
            r2 = im.toss.core.webkit.TossBridgeWebView.IAuthTabCallback_Parcel.onExtraCallbackWithResult + 49;
            im.toss.core.webkit.TossBridgeWebView.IAuthTabCallback_Parcel.onExtraCallback = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        
            if ((r2 % 2) == 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        
            r0 = null;
            r0.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.IAuthTabCallback) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.IAuthTabCallback) != true) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 37 / 0;
            }
        }
    }

    public static final class access000 implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public access000(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                if (!(!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult))) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onNavigationEvent + 11;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class access100 implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public access100(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i4 = onExtraCallbackWithResult + 75;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            int i5 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i7 = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            throw null;
        }
    }

    public static final class getInterfaceDescriptor implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public getInterfaceDescriptor(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!(!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult))) {
                int i4 = onExtraCallback + 1;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i6 = onNavigationEvent + 49;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onTransact implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onTransact(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i3 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return getspecialfeatureoptinstatus2;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(TossBridgeWebView tossBridgeWebView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 83;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final /* synthetic */ void IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 7;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted = function0;
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        int i5 = isEngagementSignalsApiAvailable + 87;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 25;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback = z;
        int i5 = i2 + 27;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 67;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = IAuthTabCallback;
        int i4 = i2 + 121;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public static final /* synthetic */ Function0 access000() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 111;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Function0<Boolean> function0 = onWarmupCompleted;
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        return function0;
    }

    public static final /* synthetic */ boolean asInterface() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 93;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        boolean z = onExtraCallbackWithResult;
        int i5 = i3 + 31;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public static final /* synthetic */ long getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 19;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = onNavigationEvent;
        int i4 = i2 + 85;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return j;
    }

    public static final /* synthetic */ void onExtraCallback(TossBridgeWebView tossBridgeWebView, long j) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 47;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        tossBridgeWebView.onNavigationEvent(j);
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
    }

    public static final /* synthetic */ void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 69;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback = z;
        if (i4 != 0) {
            int i5 = 21 / 0;
        }
        int i6 = i2 + 83;
        isEngagementSignalsApiAvailable = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ findResAndMsg onExtraCallbackWithResult(TossBridgeWebView tossBridgeWebView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 103;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        findResAndMsg findresandmsg = tossBridgeWebView.access100;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 27;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
        return findresandmsg;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(TossBridgeWebView tossBridgeWebView, long j) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 75;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        tossBridgeWebView.IAuthTabCallback(j);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 61;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult = z;
        if (i3 != 0) {
            throw null;
        }
    }

    static final class IAuthTabCallbackStub implements Function1<Throwable, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ maybeRemoveAttachStateListener<T> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallbackStub(maybeRemoveAttachStateListener<? super T> mayberemoveattachstatelistener) {
            this.onWarmupCompleted = mayberemoveattachstatelistener;
        }

        public /* synthetic */ Object invoke(Object obj) {
            Unit unit;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((Throwable) obj);
            if (i3 != 0) {
                unit = Unit.INSTANCE;
                int i4 = 81 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i5 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onNavigationEvent(Throwable th) {
            int i = 2 % 2;
            this.onWarmupCompleted.onExtraCallback(new CancellationException("WebView destroyed"));
            int i2 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static final class onNavigationEvent implements Function1<Throwable, Unit> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ setDeployments onExtraCallback;

        onNavigationEvent(setDeployments setdeployments) {
            this.onExtraCallback = setdeployments;
        }

        public final void IAuthTabCallback(Throwable th) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            setDeployments setdeployments = this.onExtraCallback;
            if (setdeployments != null) {
                setdeployments.dispose();
                int i4 = onNavigationEvent + 97;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((Throwable) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 14 / 0;
            }
            return unit;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class asInterface<T> implements Function1<T, Unit> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ maybeRemoveAttachStateListener<T> onExtraCallbackWithResult;
        final /* synthetic */ setDeployments onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        asInterface(setDeployments setdeployments, maybeRemoveAttachStateListener<? super T> mayberemoveattachstatelistener) {
            this.onWarmupCompleted = setdeployments;
            this.onExtraCallbackWithResult = mayberemoveattachstatelistener;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i4 = onNavigationEvent + 111;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onWarmupCompleted(T t) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            setDeployments setdeployments = this.onWarmupCompleted;
            if (setdeployments != null) {
                setdeployments.dispose();
                int i4 = onExtraCallback + 35;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
            maybeRemoveAttachStateListener<T> mayberemoveattachstatelistener = this.onExtraCallbackWithResult;
            Result.Companion companion = Result.Companion;
            mayberemoveattachstatelistener.resumeWith(Result.constructor-impl(t));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object IAuthTabCallback(TossBridgeWebView tossBridgeWebView, String str, Function1 function1, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 11;
        int i4 = i3 % 128;
        ICustomTabsCallback_Parcel = i4;
        int i5 = i3 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeJsFuncAwait");
        }
        int i6 = i4 + 37;
        isEngagementSignalsApiAvailable = i6 % 128;
        int i7 = i6 % 2;
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: im.toss.core.webkit.TossBridgeWebView$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2) {
                    int i8 = 2 % 2;
                    int i9 = IAuthTabCallback + 119;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitOnWarmupCompleted = TossBridgeWebView.onWarmupCompleted((startRunning) obj2);
                    int i11 = IAuthTabCallback + 53;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    return unitOnWarmupCompleted;
                }
            };
        }
        return tossBridgeWebView.onExtraCallbackWithResult(str, (Function1<? super startRunning, Unit>) function1, (access13800<? super String>) access13800Var);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        startRunning startrunning = (startRunning) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 29;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback_Parcel + 1;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(TossBridgeWebView tossBridgeWebView, String str, final Function1 function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        tossBridgeWebView.evaluateJavascript(str, new ValueCallback() { // from class: im.toss.core.webkit.TossBridgeWebView$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 33;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    TossBridgeWebView.onNavigationEvent(function1, (String) obj);
                    int i4 = 27 / 0;
                } else {
                    TossBridgeWebView.onNavigationEvent(function1, (String) obj);
                }
                int i5 = IAuthTabCallback + 33;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallback_Parcel + 115;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public final Object onExtraCallbackWithResult(@NotNull String str, @NotNull Function1<? super startRunning, Unit> function1, @NotNull access13800<? super String> access13800Var) {
        int i = 2 % 2;
        startRunning startrunning = new startRunning();
        function1.invoke(startrunning);
        Object[] objArr = {str, startrunning.onExtraCallback(), null, 4, null};
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        final String str2 = (String) setTopGuideFontSize.IAuthTabCallback(objArr, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 659773750, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, -659773747);
        Object objOnNavigationEvent = onNavigationEvent(new Function1() { // from class: im.toss.core.webkit.TossBridgeWebView$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 23;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unit = (Unit) TossBridgeWebView.onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this.f$0, str2, (Function1) obj}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1996039328, -1996039327, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                int i5 = onWarmupCompleted + 113;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        }, access13800Var);
        int i2 = isEngagementSignalsApiAvailable + 103;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return objOnNavigationEvent;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 105;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(startrunning, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(startrunning, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = ICustomTabsCallback_Parcel + 57;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final void onExtraCallback(Function1 function1, String str) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 93;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(str);
        int i4 = ICustomTabsCallback_Parcel + 21;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull Function1<? super startRunning, Unit> function1, @NotNull access13800<? super String> access13800Var) throws Throwable {
        String lowerCase;
        int i = 2 % 2;
        Uri uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{str2});
        if (uri != null) {
            int i2 = isEngagementSignalsApiAvailable + 15;
            ICustomTabsCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            String host = uri.getHost();
            if (host != null) {
                lowerCase = host.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            } else {
                int i4 = ICustomTabsCallback_Parcel + 51;
                isEngagementSignalsApiAvailable = i4 % 128;
                int i5 = i4 % 2;
                lowerCase = null;
            }
        }
        if (lowerCase != null) {
            startRunning startrunning = new startRunning();
            function1.invoke(startrunning);
            return onNavigationEvent((Function1) new TossBridgeWebView$.ExternalSyntheticLambda11(this, setTopGuideFontSize.onExtraCallback(str, startrunning.onExtraCallback(), lowerCase)), (access13800) access13800Var);
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossBridgeWebView", "invokeJsFuncForStrictOriginAwait: invalid targetOrigin=" + str2, null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        return null;
    }

    public String extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 103;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        String str = this.onActivityLayout;
        int i5 = i3 + 1;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setWebBridgeBackPressHandler(@Nullable String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 71;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        this.onActivityLayout = str;
        int i5 = i3 + 99;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean extraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 95;
        isEngagementSignalsApiAvailable = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.onPostMessage;
        int i4 = i2 + 1;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final void setSupportFontScale(boolean z) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 95;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.onPostMessage = z;
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
    }

    public final void setEnableFirstTextPaintTracking(boolean z) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 35;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        this.asInterface = z;
        int i5 = i3 + 69;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final String onUnminimized() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 43;
        ICustomTabsCallback_Parcel = i2 % 128;
        return RandomKeyGenerator.onExtraCallbackWithResult.IAuthTabCallback(i2 % 2 == 0 ? 16 : 10);
    }

    public List<String> onTransact() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 81;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        List<String> list = this.access000;
        int i5 = i3 + 39;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TossBridgeWebView(@NotNull Context context) {
        int iIEngagementSignalsCallback;
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.access100 = findRes.onWarmupCompleted(putChannelInfo.onExtraCallback().onExtraCallback().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null)));
        this.extraCallbackWithResult = new HashMap<>();
        this.extraCallback = new HashMap<>();
        this.onPostMessage = true;
        this.asBinder = "";
        this.onMinimized = new LinkedHashMap();
        this.onUnminimized = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.core.webkit.TossBridgeWebView$$ExternalSyntheticLambda6
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 7;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return TossBridgeWebView.asBinder();
                }
                TossBridgeWebView.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.access000 = CollectionsKt.listOf(new String[]{"TossApp", "Android", "TossNativeBridge"});
        Paint paint = new Paint();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Resources resources = context2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (!readIntokhttp.onExtraCallback(configuration)) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration2 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            iIEngagementSignalsCallback = new getUrlokhttp(new IAuthTabCallbackStubProxy(configuration2)).requestPostMessageChannel().IEngagementSignalsCallback();
            int i = isEngagementSignalsApiAvailable + 5;
            ICustomTabsCallback_Parcel = i % 128;
            if (i % 2 != 0) {
            }
            paint.setColorFilter(new PorterDuffColorFilter(iIEngagementSignalsCallback, PorterDuff.Mode.OVERLAY));
            this.readTypedObject = paint;
            writeTypedObject();
        }
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        Configuration configuration3 = context4.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        iIEngagementSignalsCallback = new getUrlokhttp(new onTransact(configuration3)).getInterfaceDescriptor().ICustomTabsService_Parcel();
        int i2 = ICustomTabsCallback_Parcel + 15;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 2 % 2;
        paint.setColorFilter(new PorterDuffColorFilter(iIEngagementSignalsCallback, PorterDuff.Mode.OVERLAY));
        this.readTypedObject = paint;
        writeTypedObject();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TossBridgeWebView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        int iIEngagementSignalsCallback;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.access100 = findRes.onWarmupCompleted(putChannelInfo.onExtraCallback().onExtraCallback().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null)));
        this.extraCallbackWithResult = new HashMap<>();
        this.extraCallback = new HashMap<>();
        this.onPostMessage = true;
        this.asBinder = "";
        this.onMinimized = new LinkedHashMap();
        this.onUnminimized = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.core.webkit.TossBridgeWebView$$ExternalSyntheticLambda6
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 7;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return TossBridgeWebView.asBinder();
                }
                TossBridgeWebView.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.access000 = CollectionsKt.listOf(new String[]{"TossApp", "Android", "TossNativeBridge"});
        Paint paint = new Paint();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Resources resources = context2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (readIntokhttp.onExtraCallback(configuration)) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration2 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            iIEngagementSignalsCallback = new getUrlokhttp(new IAuthTabCallback_Parcel(configuration2)).getInterfaceDescriptor().ICustomTabsService_Parcel();
            int i = isEngagementSignalsApiAvailable + 77;
            ICustomTabsCallback_Parcel = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } else {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            Configuration configuration3 = context4.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            iIEngagementSignalsCallback = new getUrlokhttp(new getInterfaceDescriptor(configuration3)).requestPostMessageChannel().IEngagementSignalsCallback();
        }
        paint.setColorFilter(new PorterDuffColorFilter(iIEngagementSignalsCallback, PorterDuff.Mode.OVERLAY));
        this.readTypedObject = paint;
        writeTypedObject();
        int i3 = isEngagementSignalsApiAvailable + 123;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TossBridgeWebView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int iIEngagementSignalsCallback;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Object obj = null;
        this.access100 = findRes.onWarmupCompleted(putChannelInfo.onExtraCallback().onExtraCallback().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null)));
        this.extraCallbackWithResult = new HashMap<>();
        this.extraCallback = new HashMap<>();
        this.onPostMessage = true;
        this.asBinder = "";
        this.onMinimized = new LinkedHashMap();
        this.onUnminimized = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.core.webkit.TossBridgeWebView$$ExternalSyntheticLambda6
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i22 = onExtraCallbackWithResult + 7;
                onExtraCallback = i22 % 128;
                if (i22 % 2 == 0) {
                    return TossBridgeWebView.asBinder();
                }
                TossBridgeWebView.asBinder();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        this.access000 = CollectionsKt.listOf(new String[]{"TossApp", "Android", "TossNativeBridge"});
        Paint paint = new Paint();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Resources resources = context2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (readIntokhttp.onExtraCallback(configuration)) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration2 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            iIEngagementSignalsCallback = new getUrlokhttp(new access100(configuration2)).getInterfaceDescriptor().ICustomTabsService_Parcel();
        } else {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            Configuration configuration3 = context4.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            iIEngagementSignalsCallback = new getUrlokhttp(new access000(configuration3)).requestPostMessageChannel().IEngagementSignalsCallback();
            int i2 = ICustomTabsCallback_Parcel + 125;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        paint.setColorFilter(new PorterDuffColorFilter(iIEngagementSignalsCallback, PorterDuff.Mode.OVERLAY));
        this.readTypedObject = paint;
        writeTypedObject();
        int i5 = ICustomTabsCallback_Parcel + 99;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 7;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback_Parcel + 101;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean onWarmupCompleted(TossBridgeWebView tossBridgeWebView, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback_Parcel + 25;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performBackPress");
        }
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: im.toss.core.webkit.TossBridgeWebView$$ExternalSyntheticLambda9
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallback + 109;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    Object obj3 = null;
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    if (i6 == 0) {
                        TossBridgeWebView.onNavigationEvent(zBooleanValue);
                        obj3.hashCode();
                        throw null;
                    }
                    Unit unitOnNavigationEvent = TossBridgeWebView.onNavigationEvent(zBooleanValue);
                    int i7 = onExtraCallback + 25;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        return unitOnNavigationEvent;
                    }
                    obj3.hashCode();
                    throw null;
                }
            };
        }
        boolean zOnExtraCallbackWithResult = tossBridgeWebView.onExtraCallbackWithResult((Function1<? super Boolean, Unit>) function1);
        int i4 = isEngagementSignalsApiAvailable + 71;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        char[] cArr2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = ICustomTabsCallbackStub;
        float f = 0.0f;
        if (cArr3 != null) {
            int i6 = $11 + 103;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                int i7 = $10 + 11;
                $11 = i7 % 128;
                if (i7 % i4 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 77 - (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr2[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i3 %= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 77 - (KeyEvent.getMaxKeyCode() >> 16), 20953 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i3] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i3++;
                }
                i4 = 2;
                f = 0.0f;
            }
            cArr3 = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(onRelationshipValidationResult)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 74, (ViewConfiguration.getTouchSlop() >> 8) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (extraCommand) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 63, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!ICustomTabsCallbackDefault) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $10 + 91;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback + defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] * i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i9 = $10 + 65;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) % defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] + iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), TextUtils.getOffsetAfter("", 0) + 63, Process.getGidForName("") + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                try {
                    Object[] objArr7 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback6 == null) {
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 63, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }
        String str = new String(cArr6);
        int i10 = $11 + 63;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    private static final void onNavigationEvent(TossBridgeWebView tossBridgeWebView, Function1 function1, String str) {
        int i = 2 % 2;
        if (tossBridgeWebView.onTransact) {
            int i2 = ICustomTabsCallback_Parcel + 73;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
        }
        if (str != null && !Boolean.parseBoolean(str)) {
            if (tossBridgeWebView.canGoBack()) {
                int i4 = isEngagementSignalsApiAvailable + 123;
                ICustomTabsCallback_Parcel = i4 % 128;
                if (i4 % 2 == 0) {
                    tossBridgeWebView.goBack();
                    int i5 = 37 / 0;
                } else {
                    tossBridgeWebView.goBack();
                }
            } else {
                Activity activityOnNavigationEvent = LinkGenerator1.onNavigationEvent(tossBridgeWebView);
                if (activityOnNavigationEvent != null) {
                    int i6 = isEngagementSignalsApiAvailable + 101;
                    ICustomTabsCallback_Parcel = i6 % 128;
                    int i7 = i6 % 2;
                    if (!activityOnNavigationEvent.isDestroyed()) {
                        int i8 = ICustomTabsCallback_Parcel + 123;
                        isEngagementSignalsApiAvailable = i8 % 128;
                        int i9 = i8 % 2;
                        activityOnNavigationEvent.onBackPressed();
                    }
                }
            }
        }
        function1.invoke(Boolean.valueOf(Boolean.parseBoolean(str)));
        tossBridgeWebView.IAuthTabCallbackStubProxy = false;
    }

    public final boolean onExtraCallbackWithResult(@NotNull final Function1<? super Boolean, Unit> function1) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 63;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        if (!(!this.IAuthTabCallbackStubProxy)) {
            return false;
        }
        this.IAuthTabCallbackStubProxy = true;
        if (extraCallbackWithResult() == null) {
            this.IAuthTabCallbackStubProxy = false;
            int i3 = isEngagementSignalsApiAvailable + 93;
            ICustomTabsCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        evaluateJavascript(extraCallbackWithResult() + "()", new ValueCallback() { // from class: im.toss.core.webkit.TossBridgeWebView$$ExternalSyntheticLambda7
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj2) {
                int i5 = 2 % 2;
                int i6 = onWarmupCompleted + 13;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                TossBridgeWebView.onExtraCallbackWithResult(this.f$0, function1, (String) obj2);
                int i8 = onNavigationEvent + 17;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
            }
        });
        return true;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TossBridgeWebView tossBridgeWebView = (TossBridgeWebView) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 89;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            tossBridgeWebView.extraCallbackWithResult.put(str, str2);
            return null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        tossBridgeWebView.extraCallbackWithResult.put(str, str2);
        throw null;
    }

    public final void onWarmupCompleted(@NotNull onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 101;
        ICustomTabsCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallback, "");
        if (this.ICustomTabsCallback == null) {
            this.ICustomTabsCallback = new ArrayList<>();
        }
        ArrayList<onExtraCallback> arrayList = this.ICustomTabsCallback;
        if (arrayList != null) {
            int i3 = isEngagementSignalsApiAvailable + 5;
            ICustomTabsCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            arrayList.add(onextracallback);
        }
        int i5 = isEngagementSignalsApiAvailable + 29;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final boolean IAuthTabCallback(onExtraCallback onextracallback, onExtraCallback onextracallback2) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 53;
        ICustomTabsCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallback2, "");
            Intrinsics.areEqual(onextracallback2, onextracallback);
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallback2, "");
        boolean zAreEqual = Intrinsics.areEqual(onextracallback2, onextracallback);
        int i3 = isEngagementSignalsApiAvailable + 59;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return zAreEqual;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r1
      0x0023: PHI (r1v5 java.util.ArrayList<im.toss.core.webkit.TossBridgeWebView$onExtraCallback>) = 
      (r1v4 java.util.ArrayList<im.toss.core.webkit.TossBridgeWebView$onExtraCallback>)
      (r1v7 java.util.ArrayList<im.toss.core.webkit.TossBridgeWebView$onExtraCallback>)
     binds: [B:8:0x0021, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull final onExtraCallback onextracallback) {
        ArrayList<onExtraCallback> arrayList;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 105;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            arrayList = this.ICustomTabsCallback;
            int i3 = 46 / 0;
            if (arrayList != null) {
                CollectionsKt.removeAll(arrayList, new Function1() { // from class: im.toss.core.webkit.TossBridgeWebView$$ExternalSyntheticLambda2
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        int i4 = 2 % 2;
                        int i5 = IAuthTabCallback + 7;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        Boolean boolValueOf = Boolean.valueOf(TossBridgeWebView.onWarmupCompleted(onextracallback, (TossBridgeWebView.onExtraCallback) obj));
                        int i7 = onNavigationEvent + 55;
                        IAuthTabCallback = i7 % 128;
                        if (i7 % 2 != 0) {
                            return boolValueOf;
                        }
                        throw null;
                    }
                });
            }
        } else {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            arrayList = this.ICustomTabsCallback;
            if (arrayList != null) {
            }
        }
        int i4 = isEngagementSignalsApiAvailable + 117;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 115;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        super.onDetachedFromWindow();
        ArrayList<onExtraCallback> arrayList = this.ICustomTabsCallback;
        if (arrayList != null) {
            arrayList.clear();
            int i4 = ICustomTabsCallback_Parcel + 47;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class asBinder implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public asBinder(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.core.webkit.TossBridgeWebView.asBinder.onWarmupCompleted + 51;
            im.toss.core.webkit.TossBridgeWebView.asBinder.onNavigationEvent = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        
            if ((r2 % 2) == 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            r0 = 73 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r1 = im.toss.core.webkit.TossBridgeWebView.asBinder.onWarmupCompleted + 81;
            im.toss.core.webkit.TossBridgeWebView.asBinder.onNavigationEvent = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 58 / 0;
            }
        }
    }

    @Override // android.webkit.WebView
    public void onPause() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 79;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = isEngagementSignalsApiAvailable + 99;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebView
    public void onResume() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 77;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = isEngagementSignalsApiAvailable + 71;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
    }

    @Override // android.webkit.WebView
    public void pauseTimers() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 17;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.pauseTimers();
        int i4 = isEngagementSignalsApiAvailable + 73;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebView
    public void resumeTimers() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 61;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        super.resumeTimers();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebView
    public void destroy() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 7;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        findRes.onExtraCallbackWithResult(this.access100, (CancellationException) null, 1, (Object) null);
        super.destroy();
        int i4 = ICustomTabsCallback_Parcel + 121;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 75;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        String str = this.getInterfaceDescriptor;
        int i5 = i3 + 41;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // o.flipCamera
    public String onExtraCallbackWithResult() {
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 37;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        setTopGuideSpacing settopguidespacing = this.ICustomTabsCallbackStubProxy;
        if (settopguidespacing != null && (strOnExtraCallbackWithResult = settopguidespacing.onExtraCallbackWithResult()) != null) {
            int i3 = ICustomTabsCallback_Parcel + 79;
            isEngagementSignalsApiAvailable = i3 % 128;
            if (i3 % 2 == 0) {
                return strOnExtraCallbackWithResult;
            }
            obj.hashCode();
            throw null;
        }
        String str = this.onActivityResized;
        if (str == null) {
            str = this.getInterfaceDescriptor;
            int i4 = ICustomTabsCallback_Parcel + 53;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = ICustomTabsCallback_Parcel + 97;
        isEngagementSignalsApiAvailable = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 28 / 0;
        }
        return str;
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(@NotNull String str, @Nullable ValueCallback<String> valueCallback) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 27;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        super.evaluateJavascript(str, valueCallback);
        int i4 = isEngagementSignalsApiAvailable + 37;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(@Nullable String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        if (this.onTransact) {
            Objects.toString(this.extraCallbackWithResult);
            int i2 = ICustomTabsCallback_Parcel + 17;
            isEngagementSignalsApiAvailable = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 / 5;
            }
        }
        if (URLUtil.isNetworkUrl(str)) {
            if (this.getInterfaceDescriptor == null) {
                int i4 = ICustomTabsCallback_Parcel + 47;
                isEngagementSignalsApiAvailable = i4 % 128;
                int i5 = i4 % 2;
                this.getInterfaceDescriptor = str;
            }
            this.onActivityResized = str;
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public void loadUrl(@NotNull String str, @NotNull Map<String, String> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (onExtraCallback) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            Uri uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), -846257502, iOnExtraCallbackWithResult2, 846257509, new Object[]{str});
            if (uri != null && filterCreatePageParams.onNavigationEvent(uri)) {
                return;
            }
        }
        if (this.asInterface) {
            int i2 = isEngagementSignalsApiAvailable + 49;
            ICustomTabsCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                onNavigationEvent(str);
                throw null;
            }
            onNavigationEvent(str);
            int i3 = isEngagementSignalsApiAvailable + 103;
            ICustomTabsCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        }
        if (URLUtil.isNetworkUrl(str)) {
            if (this.getInterfaceDescriptor == null) {
                this.getInterfaceDescriptor = str;
                int i5 = isEngagementSignalsApiAvailable + 95;
                ICustomTabsCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
            }
            this.onActivityResized = str;
        }
        HashMap map2 = new HashMap();
        map2.putAll(this.extraCallbackWithResult);
        map2.putAll(map);
        if (this.onTransact) {
            Objects.toString(map);
        }
        onExtraCallback(str, map2);
        onExtraCallbackWithResult(this, 0L, 1, null);
    }

    private final void onExtraCallback(final String str, final Map<String, String> map) {
        Looper mainLooper;
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT < 28) {
            mainLooper = Looper.getMainLooper();
        } else {
            int i2 = isEngagementSignalsApiAvailable + 71;
            ICustomTabsCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            mainLooper = getWebViewLooper();
        }
        if (Intrinsics.areEqual(Looper.myLooper(), mainLooper)) {
            int i4 = isEngagementSignalsApiAvailable + 107;
            ICustomTabsCallback_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                super.loadUrl(str, map);
                return;
            }
            super.loadUrl(str, map);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        new Handler(mainLooper).post(new Runnable() { // from class: im.toss.core.webkit.TossBridgeWebView$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // java.lang.Runnable
            public final void run() {
                int i5 = 2 % 2;
                int i6 = onExtraCallbackWithResult + 55;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                TossBridgeWebView.onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this.f$0, str, map}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 391851184, -391851181, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                int i8 = onExtraCallbackWithResult + 45;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
            }
        });
    }

    private static final void onNavigationEvent(TossBridgeWebView tossBridgeWebView, String str, Map map) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 87;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        super.loadUrl(str, map);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(long j) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 47;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.onTransact) {
                int i3 = isEngagementSignalsApiAvailable + 31;
                ICustomTabsCallback_Parcel = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 5 % 4;
                }
            }
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-124, -125, -126, -127}, 128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "frontend_stats");
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-121, -122, -123}, TextUtils.lastIndexOf("", '0') + 128, objArr2);
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), getUrl());
            Object[] objArr3 = new Object[1];
            a(null, null, new byte[]{-124, -123, -121, -119, -120}, TextUtils.lastIndexOf("", '0', 0) + 128, objArr3);
            ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, "FTP", "", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), Long.valueOf(j))}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            return;
        }
        throw null;
    }

    static final class writeTypedObject extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Integer>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ WebView $webView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        writeTypedObject(WebView webView, access13800<? super writeTypedObject> access13800Var) {
            super(2, access13800Var);
            this.$webView = webView;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Integer> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 17;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            writeTypedObject writetypedobject = new writeTypedObject(this.$webView, access13800Var);
            int i2 = onExtraCallback + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return writetypedobject;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onExtraCallback = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Integer> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                IAuthTabCallback(findresandmsg, access13800Var);
                obj3.hashCode();
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 39;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onWarmupCompleted + 93;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            long interfaceDescriptor = TossBridgeWebView.getInterfaceDescriptor();
            Object obj2 = null;
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$webView, null);
            this.label = 1;
            Object objOnNavigationEvent = doGet.onNavigationEvent(interfaceDescriptor, anonymousClass5, this);
            if (objOnNavigationEvent == objOnWarmupCompleted) {
                int i5 = onWarmupCompleted + 123;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return objOnWarmupCompleted;
                }
                throw null;
            }
            int i6 = onWarmupCompleted + 93;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return objOnNavigationEvent;
            }
            obj2.hashCode();
            throw null;
        }

        /* renamed from: im.toss.core.webkit.TossBridgeWebView$writeTypedObject$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Integer>, Object> {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ WebView $webView;
            int I$0;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(WebView webView, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.$webView = webView;
            }

            public static final /* synthetic */ void onNavigationEvent(WebView webView, maybeRemoveAttachStateListener mayberemoveattachstatelistener) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 15;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult(webView, (maybeRemoveAttachStateListener<? super Integer>) mayberemoveattachstatelistener);
                int i4 = onExtraCallback + 83;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 93 / 0;
                }
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$webView, access13800Var);
                int i2 = onExtraCallback + 83;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass5;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 93;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800<? super Integer>) obj2);
                int i4 = onExtraCallback + 81;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 13 / 0;
                }
                return objOnExtraCallbackWithResult;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Integer> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 1;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallback + 7;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 25 / 0;
                }
                return objInvokeSuspend;
            }

            /* renamed from: im.toss.core.webkit.TossBridgeWebView$writeTypedObject$5$onWarmupCompleted */
            static final class onWarmupCompleted<T> implements ValueCallback {
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;
                final /* synthetic */ maybeRemoveAttachStateListener<Integer> onExtraCallbackWithResult;
                final /* synthetic */ WebView onNavigationEvent;

                /* JADX WARN: Multi-variable type inference failed */
                onWarmupCompleted(maybeRemoveAttachStateListener<? super Integer> mayberemoveattachstatelistener, WebView webView) {
                    this.onExtraCallbackWithResult = mayberemoveattachstatelistener;
                    this.onNavigationEvent = webView;
                }

                @Override // android.webkit.ValueCallback
                public /* synthetic */ void onReceiveValue(Object obj) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 117;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    IAuthTabCallback((String) obj);
                    int i4 = onWarmupCompleted + 125;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x002b A[PHI: r1
                  0x002b: PHI (r1v13 int) = (r1v4 int), (r1v6 int), (r1v14 int) binds: [B:12:0x002a, B:10:0x001a, B:5:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[PHI: r7
                  0x0049: PHI (r7v3 java.lang.Integer) = (r7v2 java.lang.Integer), (r7v10 java.lang.Integer) binds: [B:21:0x0047, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void IAuthTabCallback(String str) {
                    int iIntValue;
                    Integer intOrNull;
                    int iIntValue2;
                    Integer intOrNull2;
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 55;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        iIntValue = 1;
                        if (str != null) {
                            intOrNull = StringsKt.toIntOrNull(str);
                            if (intOrNull == null) {
                                int i3 = onWarmupCompleted + 115;
                                IAuthTabCallback = i3 % 128;
                                int i4 = i3 % 2;
                                iIntValue2 = intOrNull.intValue();
                            } else {
                                iIntValue2 = 0;
                            }
                        }
                    } else if (str != null) {
                        iIntValue = 0;
                        intOrNull = StringsKt.toIntOrNull(str);
                        if (intOrNull == null) {
                        }
                    } else {
                        iIntValue = 0;
                        iIntValue2 = 0;
                    }
                    if (str != null) {
                        int i5 = IAuthTabCallback + 125;
                        onWarmupCompleted = i5 % 128;
                        if (i5 % 2 != 0) {
                            intOrNull2 = StringsKt.toIntOrNull(str);
                            int i6 = 56 / 0;
                            if (intOrNull2 != null) {
                                iIntValue = intOrNull2.intValue();
                            }
                            if (iIntValue > 0) {
                                int i7 = onWarmupCompleted + 55;
                                IAuthTabCallback = i7 % 128;
                                if (i7 % 2 != 0) {
                                    maybeRemoveAttachStateListener<Integer> mayberemoveattachstatelistener = this.onExtraCallbackWithResult;
                                    Result.Companion companion = Result.Companion;
                                    mayberemoveattachstatelistener.resumeWith(Result.constructor-impl(Integer.valueOf(iIntValue2)));
                                    return;
                                } else {
                                    maybeRemoveAttachStateListener<Integer> mayberemoveattachstatelistener2 = this.onExtraCallbackWithResult;
                                    Result.Companion companion2 = Result.Companion;
                                    mayberemoveattachstatelistener2.resumeWith(Result.constructor-impl(Integer.valueOf(iIntValue2)));
                                    throw null;
                                }
                            }
                        } else {
                            intOrNull2 = StringsKt.toIntOrNull(str);
                            if (intOrNull2 != null) {
                            }
                            if (iIntValue > 0) {
                            }
                        }
                    }
                    final WebView webView = this.onNavigationEvent;
                    final maybeRemoveAttachStateListener<Integer> mayberemoveattachstatelistener3 = this.onExtraCallbackWithResult;
                    webView.postDelayed(new Runnable() { // from class: im.toss.core.webkit.TossBridgeWebView.writeTypedObject.5.onWarmupCompleted.1
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallback;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i8 = 2 % 2;
                            int i9 = IAuthTabCallback + 81;
                            onExtraCallback = i9 % 128;
                            if (i9 % 2 == 0) {
                                if (!mayberemoveattachstatelistener3.onWarmupCompleted()) {
                                    int i10 = onExtraCallback + 55;
                                    IAuthTabCallback = i10 % 128;
                                    int i11 = i10 % 2;
                                    WebView webView2 = webView;
                                    if (i11 != 0) {
                                        AnonymousClass5.onNavigationEvent(webView2, mayberemoveattachstatelistener3);
                                        return;
                                    } else {
                                        AnonymousClass5.onNavigationEvent(webView2, mayberemoveattachstatelistener3);
                                        int i12 = 74 / 0;
                                        return;
                                    }
                                }
                                return;
                            }
                            mayberemoveattachstatelistener3.onWarmupCompleted();
                            throw null;
                        }
                    }, 100L);
                }
            }

            private static final void onExtraCallbackWithResult(WebView webView, maybeRemoveAttachStateListener<? super Integer> mayberemoveattachstatelistener) {
                int i = 2 % 2;
                webView.evaluateJavascript("(function() { return document.body.innerText.length; })();", new onWarmupCompleted(mayberemoveattachstatelistener, webView));
                int i2 = onExtraCallback + 15;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
            
                r1 = im.toss.core.webkit.TossBridgeWebView.writeTypedObject.AnonymousClass5.onExtraCallback + 71;
                im.toss.core.webkit.TossBridgeWebView.writeTypedObject.AnonymousClass5.onWarmupCompleted = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
            
                if ((r1 % 2) != 0) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
            
                r1 = (android.webkit.WebView) r6.L$0;
                kotlin.ResultKt.onNavigationEvent(r7);
                r1 = 0 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
            
                r1 = (android.webkit.WebView) r6.L$0;
                kotlin.ResultKt.onNavigationEvent(r7);
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
            
                r1 = im.toss.core.webkit.TossBridgeWebView.writeTypedObject.AnonymousClass5.onExtraCallback + 97;
                im.toss.core.webkit.TossBridgeWebView.writeTypedObject.AnonymousClass5.onWarmupCompleted = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
            
                if ((r1 % 2) != 0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
            
                r0 = 30 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
            
                return r7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
            
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
            
                kotlin.ResultKt.onNavigationEvent(r7);
                r7 = r6.$webView;
                r6.L$0 = r7;
                r6.I$0 = 0;
                r6.label = 1;
                r0 = new o.setResourceInternal(o.access14300.onWarmupCompleted(r6), 1);
                r0.onTransact();
                onNavigationEvent(r7, r0);
                r7 = r0.IAuthTabCallbackDefault();
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
            
                if (r7 != o.access14300.onWarmupCompleted()) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
            
                o.access14600.IAuthTabCallback(r6);
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
            
                if (r7 != r1) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
            
                return r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
            
                return r7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
            
                if (r4 != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
            
                if (r4 != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
            
                if (r4 != 1) goto L18;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objOnWarmupCompleted;
                int i;
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 87;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    objOnWarmupCompleted = access14300.onWarmupCompleted();
                    i = this.label;
                    int i4 = 67 / 0;
                } else {
                    objOnWarmupCompleted = access14300.onWarmupCompleted();
                    i = this.label;
                }
            }
        }
    }

    private final Object IAuthTabCallback(WebView webView, access13800<? super Integer> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onExtraCallback(), new writeTypedObject(webView, null), access13800Var);
        int i2 = ICustomTabsCallback_Parcel + 45;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(String str) {
        getPackageType getpackagetypeOnNavigationEvent;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 95;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        getPackageType getpackagetype = this.IAuthTabCallbackStub;
        Object obj = null;
        if (getpackagetype != null) {
            getFullPackage.IAuthTabCallback(getpackagetype, "url:" + str, (Throwable) null, 2, (Object) null);
        }
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
            int i4 = ICustomTabsCallback_Parcel + 23;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
            getpackagetypeOnNavigationEvent = textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null ? maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new ICustomTabsCallback(null), 3, (Object) null) : null;
        }
        this.IAuthTabCallbackStub = getpackagetypeOnNavigationEvent;
        int i6 = isEngagementSignalsApiAvailable + 75;
        ICustomTabsCallback_Parcel = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class ICustomTabsCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        long J$0;
        int label;

        ICustomTabsCallback(access13800<? super ICustomTabsCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsCallback iCustomTabsCallback = TossBridgeWebView.this.new ICustomTabsCallback(access13800Var);
            int i2 = onWarmupCompleted + 67;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return iCustomTabsCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 79;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ICustomTabsCallback iCustomTabsCallbackCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                objInvokeSuspend = iCustomTabsCallbackCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 89 / 0;
            } else {
                objInvokeSuspend = iCustomTabsCallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onWarmupCompleted + 79;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            long j;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            onWarmupCompleted = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            try {
                if (i3 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    TossBridgeWebView tossBridgeWebView = TossBridgeWebView.this;
                    this.J$0 = jCurrentTimeMillis;
                    this.label = 1;
                    int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
                    Object objOnWarmupCompleted2 = TossBridgeWebView.onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{tossBridgeWebView, tossBridgeWebView, this}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 687583061, -687583059, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback);
                    Object obj3 = objOnWarmupCompleted2;
                    if (objOnWarmupCompleted2 == objOnWarmupCompleted) {
                        int i4 = onWarmupCompleted + 45;
                        onNavigationEvent = i4 % 128;
                        if (i4 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                    j = jCurrentTimeMillis;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = this.J$0;
                    ResultKt.onNavigationEvent(obj);
                }
                TossBridgeWebView.onExtraCallback(TossBridgeWebView.this, System.currentTimeMillis() - j);
            } catch (Exception unused) {
                TossBridgeWebView.IAuthTabCallback(TossBridgeWebView.this);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(@NotNull String str) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 65;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        loadUrl(str, access8100.onNavigationEvent());
        int i4 = ICustomTabsCallback_Parcel + 19;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(@NotNull WebViewClient webViewClient) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 107;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webViewClient, "");
        if (!(webViewClient instanceof setTopGuideSpacing)) {
            throw new IllegalStateException("Check failed.");
        }
        super.setWebViewClient(webViewClient);
        this.ICustomTabsCallbackStubProxy = (setTopGuideSpacing) webViewClient;
        int i4 = ICustomTabsCallback_Parcel + 65;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(@Nullable WebChromeClient webChromeClient) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 37;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.setWebChromeClient(webChromeClient);
        if (webChromeClient instanceof setCircleColor) {
            int i4 = isEngagementSignalsApiAvailable + 111;
            ICustomTabsCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            ((setCircleColor) webChromeClient).onExtraCallbackWithResult(this);
            int i6 = isEngagementSignalsApiAvailable + 35;
            ICustomTabsCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
        }
        this.onMessageChannelReady = webChromeClient;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 115;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossBridgeWebView", "onSaveInstanceState", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("initialHttpUrl", this.getInterfaceDescriptor), getWrite.IAuthTabCallback("requestedHttpUrl", this.onActivityResized), getWrite.IAuthTabCallback("_webview_id", (String) onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -157751857, 157751867, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback()))}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-124, -127, -119, -127, -117, -122, -124, -125, -123, -118}, Color.rgb(0, 0, 0) + 16777343, objArr);
        Bundle bundleOnNavigationEvent = RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), super.onSaveInstanceState()), getWrite.IAuthTabCallback("initialHttpUrl", this.getInterfaceDescriptor), getWrite.IAuthTabCallback("requestedHttpUrl", this.onActivityResized)});
        int i4 = isEngagementSignalsApiAvailable + 55;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return bundleOnNavigationEvent;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(@Nullable Parcelable parcelable) throws Throwable {
        Parcelable parcelable2;
        String string;
        Object obj;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 119;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        if (bundle != null) {
            int i5 = i3 + 61;
            isEngagementSignalsApiAvailable = i5 % 128;
            if (i5 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-124, -127, -119, -127, -117, -122, -124, -125, -123, -118}, 60 - View.MeasureSpec.getSize(0), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a(null, null, new byte[]{-124, -127, -119, -127, -117, -122, -124, -125, -123, -118}, View.MeasureSpec.getSize(0) + 127, objArr2);
                obj = objArr2[0];
            }
            parcelable2 = bundle.getParcelable(((String) obj).intern());
        } else {
            int i6 = i3 + 95;
            isEngagementSignalsApiAvailable = i6 % 128;
            int i7 = i6 % 2;
            parcelable2 = null;
        }
        super.onRestoreInstanceState(parcelable2);
        if (bundle != null) {
            int i8 = ICustomTabsCallback_Parcel + 99;
            isEngagementSignalsApiAvailable = i8 % 128;
            int i9 = i8 % 2;
            string = bundle.getString("initialHttpUrl");
        } else {
            string = null;
        }
        this.getInterfaceDescriptor = string;
        this.onActivityResized = bundle != null ? bundle.getString("requestedHttpUrl") : null;
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossBridgeWebView", "onRestoreInstanceState", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("initialHttpUrl", this.getInterfaceDescriptor), getWrite.IAuthTabCallback("requestedHttpUrl", this.onActivityResized), getWrite.IAuthTabCallback("_webview_id", (String) onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -157751857, 157751867, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback()))}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
    }

    @Override // android.webkit.WebView
    public WebBackForwardList saveState(@NotNull Bundle bundle) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        bundle.putLong("savedTime", SystemClock.elapsedRealtime());
        WebBackForwardList webBackForwardListSaveState = super.saveState(bundle);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("initialHttpUrl", this.getInterfaceDescriptor);
        linkedHashMap.put("requestedHttpUrl", this.onActivityResized);
        linkedHashMap.put("_webview_id", (String) onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -157751857, 157751867, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback()));
        if (webBackForwardListSaveState != null) {
            int i2 = ICustomTabsCallback_Parcel + 125;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            int size = webBackForwardListSaveState.getSize();
            int i4 = 0;
            while (i4 < size) {
                linkedHashMap.put("hist[" + i4 + "]", webBackForwardListSaveState.getItemAtIndex(i4).getUrl());
                i4++;
                int i5 = isEngagementSignalsApiAvailable + 33;
                ICustomTabsCallback_Parcel = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 4 / 3;
                }
            }
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossBridgeWebView", "saveWebViewState", linkedHashMap, null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        return webBackForwardListSaveState;
    }

    @Override // android.webkit.WebView
    public WebBackForwardList restoreState(@NotNull Bundle bundle) throws Throwable {
        int size;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        long j = bundle.getLong("savedTime");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        WebBackForwardList webBackForwardListRestoreState = super.restoreState(bundle);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("initialHttpUrl", this.getInterfaceDescriptor);
        linkedHashMap.put("requestedHttpUrl", this.onActivityResized);
        linkedHashMap.put("savedDuration", Long.valueOf(jElapsedRealtime - j));
        if (webBackForwardListRestoreState != null) {
            int i3 = isEngagementSignalsApiAvailable + 115;
            ICustomTabsCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                size = webBackForwardListRestoreState.getSize();
                i = 1;
            } else {
                size = webBackForwardListRestoreState.getSize();
                i = 0;
            }
            while (i < size) {
                linkedHashMap.put("hist[" + i + "]", webBackForwardListRestoreState.getItemAtIndex(i).getUrl());
                i++;
                int i4 = isEngagementSignalsApiAvailable + 7;
                ICustomTabsCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossBridgeWebView", "restoreWebViewState", linkedHashMap, null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        return webBackForwardListRestoreState;
    }

    public final void setNativeBridgeMessageHandler(@NotNull String str, @NotNull setVariables setvariables) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 103;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(setvariables, "");
        this.extraCallback.put(str, setvariables);
        int i4 = isEngagementSignalsApiAvailable + 121;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setTossJavascriptInterface(@NotNull drawFocusCircle drawfocuscircle) {
        Iterator it;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 105;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(drawfocuscircle, "");
            it = onTransact().iterator();
            int i3 = 80 / 0;
        } else {
            Intrinsics.checkNotNullParameter(drawfocuscircle, "");
            it = onTransact().iterator();
        }
        while (it.hasNext()) {
            addJavascriptInterface(drawfocuscircle, (String) it.next());
        }
        this.IAuthTabCallback_Parcel = drawfocuscircle;
        int i4 = isEngagementSignalsApiAvailable + 75;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    protected void writeTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 47;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Companion.onExtraCallback();
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        access100();
        drawFocusCircle drawfocuscircleOnExtraCallback = onExtraCallback();
        if (drawfocuscircleOnExtraCallback != null) {
            setTossJavascriptInterface(drawfocuscircleOnExtraCallback);
        }
        setHapticFeedbackEnabled(false);
        onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 250126354, -250126345, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new asBinder(configuration)).onWarmupCompleted());
        if (!SegmentedButtonKtExternalSyntheticLambda5.IAuthTabCallback("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE")) {
            return;
        }
        int i4 = isEngagementSignalsApiAvailable + 119;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        SegmentedButtonKtExternalSyntheticLambda6.onExtraCallbackWithResult(this, onWarmupCompleted.onNavigationEvent);
    }

    protected void access100() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 53;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setSupportMultipleWindows(true);
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(-1);
        int i4 = ICustomTabsCallback_Parcel + 115;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        TossBridgeWebView tossBridgeWebView = (TossBridgeWebView) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 7;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String userAgentString = tossBridgeWebView.getSettings().getUserAgentString();
        if (userAgentString == null) {
            userAgentString = "";
        }
        tossBridgeWebView.asBinder = userAgentString;
        tossBridgeWebView.onMinimized.clear();
        Iterator<T> it = tossBridgeWebView.onNavigationEvent().iterator();
        while (!(!it.hasNext())) {
            tossBridgeWebView.onExtraCallbackWithResult((setTopGuideFontStyle) it.next());
        }
        int i4 = isEngagementSignalsApiAvailable + 47;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public List<setTopGuideFontStyle> onNavigationEvent() {
        int i = 2 % 2;
        List<setTopGuideFontStyle> listListOf = CollectionsKt.listOf(new setTopGuideFontStyle[]{new setTopGuideFontStyle.onWarmupCompleted(IAuthTabCallback()), new setTopGuideFontStyle.onExtraCallbackWithResult(onActivityResized())});
        int i2 = ICustomTabsCallback_Parcel + 29;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return listListOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    @Override // android.webkit.WebView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getTitle() throws Throwable {
        boolean z;
        boolean zContains$default;
        String str;
        int i;
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 29;
        ICustomTabsCallback_Parcel = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 == 0) {
                super.getTitle();
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-468743058);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 34, 7094 - Color.alpha(0), -716213506, false, "getEntries", new Class[0]);
                }
                obj.hashCode();
                throw null;
            }
            String title = super.getTitle();
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-468743058);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), View.MeasureSpec.getSize(0) + 34, 7094 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -716213506, false, "getEntries", new Class[0]);
            }
            Collection collection = (Collection) ((Method) objOnExtraCallback2).invoke(null, null);
            if (collection == null || !collection.isEmpty()) {
                for (Object obj2 : collection) {
                    int i4 = ICustomTabsCallback_Parcel + 81;
                    isEngagementSignalsApiAvailable = i4 % 128;
                    int i5 = i4 % 2;
                    String str2 = title == null ? "" : title;
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1365158677);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), TextUtils.lastIndexOf("", '0') + 35, (-16770122) - Color.rgb(0, 0, 0), 1612600709, false, "getDomainName", new Class[0]);
                    }
                    if (StringsKt.contains$default(str2, (CharSequence) ((Method) objOnExtraCallback3).invoke(obj2, null), false, 2, (Object) null)) {
                        z = true;
                        break;
                    }
                }
                i = isEngagementSignalsApiAvailable + 103;
                ICustomTabsCallback_Parcel = i % 128;
                if (i % 2 == 0) {
                    int i6 = 2 % 5;
                }
                z = false;
            } else {
                i = isEngagementSignalsApiAvailable + 103;
                ICustomTabsCallback_Parcel = i % 128;
                if (i % 2 == 0) {
                }
                z = false;
            }
            String strOnExtraCallbackWithResult = onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult != null) {
                int i7 = ICustomTabsCallback_Parcel + 81;
                isEngagementSignalsApiAvailable = i7 % 128;
                if (i7 % 2 != 0) {
                    Uri.parse(strOnExtraCallbackWithResult).getHost();
                    obj.hashCode();
                    throw null;
                }
                String host = Uri.parse(strOnExtraCallbackWithResult).getHost();
                if (host != null) {
                    if (title == null) {
                        int i8 = ICustomTabsCallback_Parcel + 113;
                        isEngagementSignalsApiAvailable = i8 % 128;
                        if (i8 % 2 != 0) {
                            throw null;
                        }
                        str = "";
                    } else {
                        str = title;
                    }
                    zContains$default = StringsKt.contains$default(str, host, false, 2, (Object) null);
                    int i9 = isEngagementSignalsApiAvailable + 13;
                    ICustomTabsCallback_Parcel = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 5 % 2;
                    }
                } else {
                    zContains$default = false;
                }
            }
            boolean zStartsWith$default = StringsKt.startsWith$default(StringsKt.trimStart(title != null ? title : "").toString(), "http", false, 2, (Object) null);
            if (z || zContains$default || zStartsWith$default) {
                return null;
            }
            return title;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // o.setVariables
    public boolean onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 107;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        HashMap<String, setVariables> map = this.extraCallback;
        if (map.isEmpty()) {
            int i4 = isEngagementSignalsApiAvailable + 37;
            ICustomTabsCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        Iterator<Map.Entry<String, setVariables>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            int i6 = isEngagementSignalsApiAvailable + 17;
            ICustomTabsCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            if (it.next().getValue().onExtraCallbackWithResult(webViewContentOwner, str, jsonObject)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        super.onScrollChanged(i, i2, i3, i4);
        ArrayList<onExtraCallback> arrayList = this.ICustomTabsCallback;
        if (arrayList != null) {
            int i6 = isEngagementSignalsApiAvailable + 39;
            ICustomTabsCallback_Parcel = i6 % 128;
            if (i6 % 2 != 0) {
                for (onExtraCallback onextracallback : arrayList) {
                    boolean z = false;
                    if (computeVerticalScrollRange() <= computeVerticalScrollExtent() + i2) {
                        int i7 = ICustomTabsCallback_Parcel + 85;
                        isEngagementSignalsApiAvailable = i7 % 128;
                        if (i7 % 2 == 0) {
                            z = true;
                        }
                    }
                    onextracallback.onWarmupCompleted(i, i2, i3, i4, z);
                }
                return;
            }
            arrayList.iterator();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 9;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "scrollY", getScrollY(), 0);
        objectAnimatorOfInt.setInterpolator(TransitionKtExternalSyntheticLambda2.IAuthTabCallback(0.215f, 0.61f, 0.355f, 1.0f));
        objectAnimatorOfInt.setDuration(500L).start();
        int i4 = isEngagementSignalsApiAvailable + 123;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallbackWithResult(@NotNull setTopGuideFontStyle settopguidefontstyle) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 43;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(settopguidefontstyle, "");
            this.onMinimized.put(settopguidefontstyle.onExtraCallbackWithResult(), settopguidefontstyle);
            onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(settopguidefontstyle, "");
        this.onMinimized.put(settopguidefontstyle.onExtraCallbackWithResult(), settopguidefontstyle);
        onWarmupCompleted();
        int i3 = ICustomTabsCallback_Parcel + 63;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 113;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        String strJoinToString$default = CollectionsKt.joinToString$default(this.onMinimized.values(), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        if (strJoinToString$default.length() > 0) {
            str = this.asBinder + " " + strJoinToString$default;
        } else {
            str = this.asBinder;
        }
        getSettings().setUserAgentString(str);
        int i4 = isEngagementSignalsApiAvailable + 27;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public drawFocusCircle onExtraCallback() {
        int i = 2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
        Intrinsics.checkNotNull(activityIAuthTabCallback);
        drawFocusCircle drawfocuscircle = new drawFocusCircle(activityIAuthTabCallback, this, null, 4, null);
        int i2 = ICustomTabsCallback_Parcel + 51;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        return drawfocuscircle;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    protected String IAuthTabCallback() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        boolean zOnExtraCallback = readIntokhttp.onExtraCallback(configuration);
        if (!zOnExtraCallback) {
            if (!(!zOnExtraCallback)) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = isEngagementSignalsApiAvailable + 41;
            ICustomTabsCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 67 / 0;
            }
            return "light";
        }
        int i4 = isEngagementSignalsApiAvailable + 49;
        int i5 = i4 % 128;
        ICustomTabsCallback_Parcel = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 59;
        isEngagementSignalsApiAvailable = i7 % 128;
        if (i7 % 2 == 0) {
            return "dark";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TossBridgeWebView tossBridgeWebView = (TossBridgeWebView) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 41;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Resources resources = tossBridgeWebView.getContext().getResources();
        int i4 = (int) (i3 != 0 ? resources.getConfiguration().fontScale % 100.0f : resources.getConfiguration().fontScale * 100.0f);
        int i5 = isEngagementSignalsApiAvailable + 69;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return Integer.valueOf(i4);
    }

    static /* synthetic */ void onExtraCallbackWithResult(TossBridgeWebView tossBridgeWebView, long j, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback_Parcel + 53;
        int i4 = i3 % 128;
        isEngagementSignalsApiAvailable = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkWebViewHealthIfNeeded-LRDsOJo");
        }
        int i5 = i4 + 11;
        int i6 = i5 % 128;
        ICustomTabsCallback_Parcel = i6;
        int i7 = i5 % 2;
        if ((i & 1) != 0) {
            int i8 = i6 + 73;
            isEngagementSignalsApiAvailable = i8 % 128;
            int i9 = i8 % 2;
            setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
            j = setCommandLine.onWarmupCompleted(1, setRevision.SECONDS);
        }
        tossBridgeWebView.IAuthTabCallback(j);
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ long $delay;
        final /* synthetic */ TextFieldKeyInputExternalSyntheticLambda9 $lifecycle;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackDefault(long j, TextFieldKeyInputExternalSyntheticLambda9 textFieldKeyInputExternalSyntheticLambda9, access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
            this.$delay = j;
            this.$lifecycle = textFieldKeyInputExternalSyntheticLambda9;
        }

        public static /* synthetic */ void onExtraCallbackWithResult(getPackageType getpackagetype, String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent(getpackagetype, str);
            int i4 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 46 / 0;
            }
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = TossBridgeWebView.this.new IAuthTabCallbackDefault(this.$delay, this.$lifecycle, access13800Var);
            iAuthTabCallbackDefault.L$0 = obj;
            int i2 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackDefault;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0050, code lost:
        
            return r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (r9.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (r9.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r10);
            r10 = o.maybeUpdateAnimatable.onNavigationEvent(r1, (kotlin.coroutines.CoroutineContext) null, (o.setRandomHost) null, new im.toss.core.webkit.TossBridgeWebView.IAuthTabCallbackDefault.onExtraCallback(r9.$delay, r9.$lifecycle, null), 3, (java.lang.Object) null);
            r9.this$0.evaluateJavascript("javascript: (function() { return true; })();", new im.toss.core.webkit.TossBridgeWebView$checkWebViewHealthIfNeeded$1$$ExternalSyntheticLambda0(r10));
            r10 = kotlin.Unit.INSTANCE;
            r1 = im.toss.core.webkit.TossBridgeWebView.IAuthTabCallbackDefault.onNavigationEvent + 125;
            im.toss.core.webkit.TossBridgeWebView.IAuthTabCallbackDefault.onExtraCallbackWithResult = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            findResAndMsg findresandmsg;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                findresandmsg = (findResAndMsg) this.L$0;
                int i3 = 81 / 0;
            } else {
                findresandmsg = (findResAndMsg) this.L$0;
            }
        }

        static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            final /* synthetic */ long $delay;
            final /* synthetic */ TextFieldKeyInputExternalSyntheticLambda9 $lifecycle;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallback(long j, TextFieldKeyInputExternalSyntheticLambda9 textFieldKeyInputExternalSyntheticLambda9, access13800<? super onExtraCallback> access13800Var) {
                super(2, access13800Var);
                this.$delay = j;
                this.$lifecycle = textFieldKeyInputExternalSyntheticLambda9;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallback onextracallback = new onExtraCallback(this.$delay, this.$lifecycle, access13800Var);
                int i2 = onExtraCallbackWithResult + 123;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return onextracallback;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 7;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallbackWithResult + 125;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return objOnNavigationEvent;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 77;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object obj = null;
                onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    onextracallbackCreate.invokeSuspend(unit);
                    obj.hashCode();
                    throw null;
                }
                Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(unit);
                int i4 = onExtraCallbackWithResult + 113;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                obj.hashCode();
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 75;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 != 0) {
                    int i5 = onExtraCallbackWithResult + 87;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    long j = this.$delay;
                    this.label = 1;
                    if (formatMsgs.IAuthTabCallback(j, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                if (this.$lifecycle.IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED)) {
                    int i7 = onExtraCallbackWithResult + 55;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    setPreviewSize.IAuthTabCallback.onExtraCallbackWithResult(true);
                }
                return Unit.INSTANCE;
            }
        }

        private static final void onNavigationEvent(getPackageType getpackagetype, String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                setPreviewSize.IAuthTabCallback.onExtraCallbackWithResult(false);
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 0, (Object) null);
            } else {
                setPreviewSize.IAuthTabCallback.onExtraCallbackWithResult(false);
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            }
            int i3 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r1
      0x0023: PHI (r1v5 o.setPreviewSize) = (r1v4 o.setPreviewSize), (r1v12 o.setPreviewSize) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(long j) {
        setPreviewSize setpreviewsize;
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 35;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            setpreviewsize = setPreviewSize.IAuthTabCallback;
            int i3 = 75 / 0;
            if (!setpreviewsize.onWarmupCompleted()) {
                if (!setpreviewsize.onNavigationEvent()) {
                    return;
                }
            }
        } else {
            setpreviewsize = setPreviewSize.IAuthTabCallback;
            if (!setpreviewsize.onWarmupCompleted()) {
            }
        }
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
            int i4 = ICustomTabsCallback_Parcel + 107;
            isEngagementSignalsApiAvailable = i4 % 128;
            if (i4 % 2 != 0) {
                lifecycle = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult.getLifecycle();
                int i5 = 50 / 0;
                if (lifecycle == null) {
                    return;
                }
            } else {
                lifecycle = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult.getLifecycle();
                if (lifecycle == null) {
                    return;
                }
            }
            TextFieldKeyInputExternalSyntheticLambda9 textFieldKeyInputExternalSyntheticLambda9 = lifecycle;
            maybeUpdateAnimatable.onNavigationEvent(TextFieldPressGestureFilterKttapPressTextFieldModifier121ExternalSyntheticLambda0.onNavigationEvent(textFieldKeyInputExternalSyntheticLambda9), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(j, textFieldKeyInputExternalSyntheticLambda9, null), 3, (Object) null);
            int i6 = isEngagementSignalsApiAvailable + 111;
            ICustomTabsCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public final void setOnRenderProcessGoneListener(@Nullable onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 63;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.writeTypedObject = onextracallbackwithresult;
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        int i5 = ICustomTabsCallback_Parcel + 91;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
    }

    public final void setRenderProcessRecoveryEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 49;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallbackDefault = z;
        int i5 = i3 + 71;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 69;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.IAuthTabCallbackDefault;
        int i4 = i3 + 51;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final boolean qB_(@Nullable RenderProcessGoneDetail renderProcessGoneDetail) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 121;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = this.writeTypedObject;
        if (onextracallbackwithresult == null) {
            int i4 = ICustomTabsCallback_Parcel + 67;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = ICustomTabsCallback_Parcel + 75;
        isEngagementSignalsApiAvailable = i6 % 128;
        if (i6 % 2 == 0) {
            return onextracallbackwithresult.onRenderProcessGone(this, renderProcessGoneDetail);
        }
        onextracallbackwithresult.onRenderProcessGone(this, renderProcessGoneDetail);
        throw null;
    }

    static final class onWarmupCompleted extends SegmentedButtonKtExternalSyntheticLambda7 {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        public static final onWarmupCompleted onNavigationEvent = new onWarmupCompleted();
        private static int onWarmupCompleted = 1;

        static {
            int i = IAuthTabCallback + 73;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        private onWarmupCompleted() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01aa  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void IAuthTabCallback(@NotNull WebView webView, @Nullable SegmentedButtonKtExternalSyntheticLambda4 segmentedButtonKtExternalSyntheticLambda4) throws Throwable {
            TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallbackIAuthTabCallback;
            flipCamera flipcamera;
            String str;
            int i;
            TossBridgeWebView tossBridgeWebView;
            Object obj;
            String strOnExtraCallbackWithResult;
            Object obj2;
            String str2;
            String str3;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(webView, "");
            boolean z = webView instanceof flipCamera;
            flipCamera flipcamera2 = z ? (flipCamera) webView : null;
            String strOnExtraCallbackWithResult2 = flipcamera2 != null ? flipcamera2.onExtraCallbackWithResult() : null;
            Cookies_set cookies_set = Cookies_set.onNavigationEvent;
            Context context = webView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            PackageInfo packageInfoIAuthTabCallback = cookies_set.IAuthTabCallback(context);
            Objects.toString(webView);
            Objects.toString(segmentedButtonKtExternalSyntheticLambda4);
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(webView);
            TextFieldKeyInputExternalSyntheticLambda9 lifecycle = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null ? textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult.getLifecycle() : null;
            if (lifecycle == null || (onextracallbackIAuthTabCallback = lifecycle.IAuthTabCallback()) == null || !onextracallbackIAuthTabCallback.isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED)) {
                return;
            }
            int i5 = onWarmupCompleted + 121;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            setPreviewSize.IAuthTabCallback.IAuthTabCallback(true);
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            if (z) {
                int i7 = onExtraCallbackWithResult + 41;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                flipcamera = (flipCamera) webView;
            } else {
                flipcamera = null;
            }
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("currentUrl", flipcamera != null ? flipcamera.onExtraCallbackWithResult() : null);
            if (packageInfoIAuthTabCallback != null) {
                str = packageInfoIAuthTabCallback.packageName;
            } else {
                int i9 = onExtraCallbackWithResult + 17;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                str = null;
            }
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "WebViewRenderProcessClient", "onRenderProcessUnresponsive", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback("webViewPackage", str), getWrite.IAuthTabCallback("webViewVersion", packageInfoIAuthTabCallback != null ? packageInfoIAuthTabCallback.versionName : null), getWrite.IAuthTabCallback("webViewVersionCode", packageInfoIAuthTabCallback != null ? Long.valueOf(Cookies_getFromResponse.onNavigationEvent(packageInfoIAuthTabCallback)) : null)}), (String) null, false, (String) null, 56, (Object) null);
            Uri uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{strOnExtraCallbackWithResult2});
            if (uri != null) {
                int i11 = onWarmupCompleted + 95;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                if (filterCreatePageParams.IAuthTabCallbackStub(uri)) {
                    String lowerCaseName = TossAffiliate.SECURITIES.getLowerCaseName();
                    flipCamera flipcamera3 = z ? (flipCamera) webView : null;
                    if (flipcamera3 != null) {
                        int i13 = onWarmupCompleted + 107;
                        onExtraCallbackWithResult = i13 % 128;
                        if (i13 % 2 != 0) {
                            strOnExtraCallbackWithResult = flipcamera3.onExtraCallbackWithResult();
                            int i14 = 62 / 0;
                        } else {
                            strOnExtraCallbackWithResult = flipcamera3.onExtraCallbackWithResult();
                        }
                        obj = "currentUrl";
                    } else {
                        obj = "currentUrl";
                        strOnExtraCallbackWithResult = null;
                    }
                    Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(obj, strOnExtraCallbackWithResult);
                    if (packageInfoIAuthTabCallback != null) {
                        str2 = packageInfoIAuthTabCallback.packageName;
                        obj2 = "webViewPackage";
                    } else {
                        obj2 = "webViewPackage";
                        str2 = null;
                    }
                    Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(obj2, str2);
                    if (packageInfoIAuthTabCallback != null) {
                        int i15 = onExtraCallbackWithResult + 79;
                        onWarmupCompleted = i15 % 128;
                        if (i15 % 2 == 0) {
                            String str4 = packageInfoIAuthTabCallback.versionName;
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        str3 = packageInfoIAuthTabCallback.versionName;
                    } else {
                        str3 = null;
                    }
                    i = 3;
                    ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "WebViewRenderProcessClient", "onRenderProcessUnresponsive", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback("webViewVersion", str3), getWrite.IAuthTabCallback("webViewVersionCode", packageInfoIAuthTabCallback != null ? Long.valueOf(Cookies_getFromResponse.onNavigationEvent(packageInfoIAuthTabCallback)) : null)}), (String) null, false, lowerCaseName, 24, (Object) null);
                } else {
                    i = 3;
                }
            }
            boolean z2 = webView instanceof TossBridgeWebView;
            if (z2) {
                setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
                TossBridgeWebView.onExtraCallbackWithResult((TossBridgeWebView) webView, setCommandLine.onWarmupCompleted(i, setRevision.SECONDS));
            }
            if (z2) {
                int i16 = onWarmupCompleted + 41;
                onExtraCallbackWithResult = i16 % 128;
                if (i16 % 2 != 0) {
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                tossBridgeWebView = (TossBridgeWebView) webView;
            } else {
                tossBridgeWebView = null;
            }
            if (tossBridgeWebView == null || !tossBridgeWebView.ICustomTabsCallback()) {
                return;
            }
            int i17 = onExtraCallbackWithResult + i;
            onWarmupCompleted = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 18 / 0;
                if (!((Boolean) TossBridgeWebView.Companion.onExtraCallbackWithResult().invoke()).booleanValue()) {
                    return;
                }
            } else if (!((Boolean) TossBridgeWebView.Companion.onExtraCallbackWithResult().invoke()).booleanValue()) {
                return;
            }
            if (segmentedButtonKtExternalSyntheticLambda4 != null) {
                int i19 = onWarmupCompleted + 77;
                onExtraCallbackWithResult = i19 % 128;
                if (i19 % 2 == 0) {
                    segmentedButtonKtExternalSyntheticLambda4.IAuthTabCallback();
                    return;
                }
                segmentedButtonKtExternalSyntheticLambda4.IAuthTabCallback();
                Object obj5 = null;
                obj5.hashCode();
                throw null;
            }
        }

        public void onExtraCallback(@NotNull WebView webView, @Nullable SegmentedButtonKtExternalSyntheticLambda4 segmentedButtonKtExternalSyntheticLambda4) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(webView, "");
            Objects.toString(webView);
            Objects.toString(segmentedButtonKtExternalSyntheticLambda4);
            int i2 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 21 / 0;
            }
        }
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            boolean zAsInterface = TossBridgeWebView.asInterface();
            int i4 = onExtraCallback + 45;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return zAsInterface;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onWarmupCompleted(boolean z) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            TossBridgeWebView.onExtraCallbackWithResult(z);
            TossBridgeWebView.onExtraCallback(false);
            int i4 = onExtraCallback + 93;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        public final void onExtraCallback() {
            int i = 2 % 2;
            if (!TossBridgeWebView.IAuthTabCallbackDefault()) {
                int i2 = onExtraCallback + 5;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    TossBridgeWebView.onExtraCallback(true);
                } else {
                    TossBridgeWebView.onExtraCallback(true);
                }
                WebView.setWebContentsDebuggingEnabled(IAuthTabCallback());
            }
            int i3 = onNavigationEvent + 81;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 / 0;
            }
        }

        public final void IAuthTabCallback(boolean z) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            TossBridgeWebView.IAuthTabCallback(z);
            if (i3 != 0) {
                int i4 = 93 / 0;
            }
        }

        public final Function0<Boolean> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Function0<Boolean> function0Access000 = TossBridgeWebView.access000();
            int i4 = onExtraCallback + 37;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 60 / 0;
            }
            return function0Access000;
        }

        public final void onWarmupCompleted(@NotNull Function0<Boolean> function0) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(function0, "");
            TossBridgeWebView.IAuthTabCallback(function0);
            int i4 = onNavigationEvent + 123;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        onActivityLayout();
        Companion = new IAuthTabCallback(null);
        onNavigationEvent = TimeUnit.SECONDS.toMillis(30L);
        onWarmupCompleted = new Function0() { // from class: im.toss.core.webkit.TossBridgeWebView$$ExternalSyntheticLambda4
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 37;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
                    return Boolean.valueOf(((Boolean) TossBridgeWebView.onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[0], WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1141785603, -1141785596, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback)).booleanValue());
                }
                int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
                Boolean.valueOf(((Boolean) TossBridgeWebView.onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[0], WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1141785603, -1141785596, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2)).booleanValue());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        int i = ICustomTabsService + 29;
        mayLaunchUrl = i % 128;
        if (i % 2 != 0) {
            int i2 = 67 / 0;
        }
    }

    private final <T> Object onNavigationEvent(Function1<? super Function1<? super T, Unit>, Unit> function1, access13800<? super T> access13800Var) {
        setDeployments setdeploymentsOnExtraCallback;
        int i = 2 % 2;
        setResourceInternal setresourceinternal = new setResourceInternal(access14300.onWarmupCompleted(access13800Var), 1);
        setresourceinternal.onTransact();
        getPackageType getpackagetype = onExtraCallbackWithResult(this).getCoroutineContext().get(getPackageType.onNavigationEvent);
        if (getpackagetype != null) {
            setdeploymentsOnExtraCallback = getpackagetype.onExtraCallback(new IAuthTabCallbackStub(setresourceinternal));
            int i2 = ICustomTabsCallback_Parcel + 119;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
        } else {
            setdeploymentsOnExtraCallback = null;
        }
        setresourceinternal.IAuthTabCallback(new onNavigationEvent(setdeploymentsOnExtraCallback));
        function1.invoke(new asInterface(setdeploymentsOnExtraCallback, setresourceinternal));
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14300.onWarmupCompleted()) {
            int i4 = ICustomTabsCallback_Parcel + 109;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            access14600.IAuthTabCallback(access13800Var);
            int i6 = isEngagementSignalsApiAvailable + 113;
            ICustomTabsCallback_Parcel = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 % 4;
            }
        }
        return objIAuthTabCallbackDefault;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TossBridgeWebView tossBridgeWebView, String str, Map map) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{tossBridgeWebView, str, map}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 391851184, -391851181, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback);
    }

    public static /* synthetic */ boolean IAuthTabCallbackStub() {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return ((Boolean) onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[0], WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1141785603, -1141785596, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback)).booleanValue();
    }

    public static /* synthetic */ Unit IAuthTabCallback(TossBridgeWebView tossBridgeWebView, String str, Function1 function1) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (Unit) onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{tossBridgeWebView, str, function1}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1996039328, -1996039327, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback);
    }

    public static final /* synthetic */ Object onWarmupCompleted(TossBridgeWebView tossBridgeWebView, WebView webView, access13800 access13800Var) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{tossBridgeWebView, webView, access13800Var}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 687583061, -687583059, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback);
    }

    private final int onActivityResized() {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return ((Integer) onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -60130322, 60130322, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback)).intValue();
    }

    private static final Unit onExtraCallback(startRunning startrunning) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (Unit) onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -706625105, 706625109, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback);
    }

    private static final void IAuthTabCallback(Function1 function1, String str) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{function1, str}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -659557012, 659557023, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback);
    }

    private static final Unit onExtraCallbackWithResult(TossBridgeWebView tossBridgeWebView, String str, Function1 function1) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (Unit) onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{tossBridgeWebView, str, function1}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1190117993, -1190117985, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback);
    }

    private final void onMinimized() {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 250126354, -250126345, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback);
    }

    public final void IAuthTabCallback(@NotNull String str, @NotNull String str2) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this, str, str2}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1210589485, -1210589480, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback);
    }

    public final boolean IAuthTabCallback_Parcel() {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return ((Boolean) onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1411769593, -1411769587, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback)).booleanValue();
    }

    public final String readTypedObject() {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (String) onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -157751857, 157751867, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback);
    }

    static void onActivityLayout() {
        ICustomTabsCallbackStub = new char[]{32737, 32740, 32749, 32752, 32736, 32739, 32745, 32743, 32764, 32738, 32706};
        onRelationshipValidationResult = -1184333923;
        ICustomTabsCallbackDefault = true;
        extraCommand = true;
    }
}
