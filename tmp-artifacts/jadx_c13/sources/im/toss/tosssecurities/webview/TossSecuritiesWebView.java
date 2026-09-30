package im.toss.tosssecurities.webview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import com.google.android.gms.internal.ads.zziea;
import im.toss.core.webkit.TossBridgeWebView;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.tosssecurities.webview.TossSecuritiesWebView$;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$$ExternalSyntheticLambda10;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.AFd1mSDK;
import o.AFh1zSDK;
import o.AFi1aSDK;
import o.AFi1lSDK;
import o.AFi1pSDKAFa1ySDK;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.AppManagerImpl;
import o.AppSetIdAndScope1;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.PermissionUtil;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14100;
import o.access14200;
import o.access14600;
import o.access15300;
import o.access15400;
import o.access8000;
import o.doGet;
import o.ea10;
import o.findRes;
import o.findResAndMsg;
import o.formatMsgs;
import o.getOptimalPreviewSize;
import o.getPackageType;
import o.getSupportedHighSpeedResolutionsFor;
import o.getWrite;
import o.lambdaonInstallReferrerSetupFinished0;
import o.maybeRemoveAttachStateListener;
import o.newChunkedSink;
import o.onIconClick;
import o.onLoadStarted;
import o.putChannelInfo;
import o.r8lambdaGeF1OpgRxhfJiXGWbs9OMNOxg;
import o.setResourceInternal;
import o.setTopGuideFontStyle;
import o.zzbc;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class TossSecuritiesWebView extends TossCoreWebView {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static int ICustomTabsCallbackDefault = 0;
    private static long onActivityResized = 0;
    private static final AppSetIdAndScope1 onExtraCallback;
    private static int onPostMessage = 0;
    private static int onRelationshipValidationResult = 1;
    private static int onUnminimized = 1;
    private getPackageType IAuthTabCallback;
    private String IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private getPackageType IAuthTabCallbackStubProxy;
    private Function1<? super TossSecuritiesWebView, Unit> IAuthTabCallback_Parcel;
    private long ICustomTabsCallback;
    private AFi1pSDKAFa1ySDK access000;
    private access13800<? super Boolean> access100;
    private Long asBinder;
    private final CoroutineContext asInterface;
    private Function0<Unit> extraCallback;
    private final getSupportedHighSpeedResolutionsFor extraCallbackWithResult;
    private getPackageType getInterfaceDescriptor;
    private lambdaonInstallReferrerSetupFinished0 onActivityLayout;
    private final getSupportedHighSpeedResolutionsFor<Uri> onExtraCallbackWithResult;
    private onExtraCallback onMessageChannelReady;
    private String onMinimized;
    private final getSupportedHighSpeedResolutionsFor<AFh1zSDK> onNavigationEvent;
    private String onTransact;
    private final getSupportedHighSpeedResolutionsFor<Boolean> onWarmupCompleted;
    private onWarmupCompleted readTypedObject;
    private boolean writeTypedObject;

    static final class IAuthTabCallbackStubProxy extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackStubProxy(access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object[] objArr = {TossSecuritiesWebView.this, null, null, this};
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            int iIAuthTabCallback2 = zziea.IAuthTabCallback();
            int iIAuthTabCallback3 = zziea.IAuthTabCallback();
            int iIAuthTabCallback4 = zziea.IAuthTabCallback();
            if (i3 == 0) {
                return TossSecuritiesWebView.onNavigationEvent(iIAuthTabCallback, 944475558, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback4, objArr, -944475551);
            }
            TossSecuritiesWebView.onNavigationEvent(iIAuthTabCallback, 944475558, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback4, objArr, -944475551);
            obj2.hashCode();
            throw null;
        }
    }

    static final class access100 extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        access100(access13800<? super access100> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = TossSecuritiesWebView.onNavigationEvent(TossSecuritiesWebView.this, null, null, this);
            int i4 = onExtraCallback + 97;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }
    }

    public interface onExtraCallback {
        void IAuthTabCallback();

        void onExtraCallback();
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i2);
        int i9 = (~(i6 | i)) | i8;
        int i10 = (~(i | (~i2))) | (~((~i6) | i7)) | i8;
        int i11 = i7 | i6 | i2;
        int i12 = i6 + i2 + i4 + (1050315579 * i3) + (2086215248 * i5);
        int i13 = i12 * i12;
        int i14 = (i6 * (-1156115713)) + 1671168000 + ((-1156115713) * i2) + ((-1856302338) * i9) + (i10 * 1856302338) + (1856302338 * i11) + (700186624 * i4) + ((-1303117824) * i3) + (314572800 * i5) + (431423488 * i13);
        int i15 = ((i6 * (-961373039)) - 1316831794) + (i2 * (-961373039)) + (i9 * (-990)) + (i10 * 990) + (i11 * 990) + (i4 * (-961372049)) + (i3 * 755842709) + (i5 * (-1858722640)) + (i13 * (-2040987648));
        switch (i14 + (i15 * i15 * 1361641472)) {
            case 1:
                TossSecuritiesWebView tossSecuritiesWebView = (TossSecuritiesWebView) objArr[0];
                boolean z = true;
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int iIntValue = ((Number) objArr[2]).intValue();
                Object obj = objArr[3];
                int i16 = 2 % 2;
                int i17 = onPostMessage;
                int i18 = i17 + 87;
                onUnminimized = i18 % 128;
                int i19 = i18 % 2;
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderManually");
                }
                if ((iIntValue & 1) != 0) {
                    int i20 = i17 + 105;
                    onUnminimized = i20 % 128;
                    int i21 = i20 % 2;
                } else {
                    z = zBooleanValue;
                }
                tossSecuritiesWebView.asBinder(z);
                return null;
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return asBinder(objArr);
            case 9:
                return onTransact(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ void onNavigationEvent(TossSecuritiesWebView tossSecuritiesWebView) {
        int i = 2 % 2;
        int i2 = onPostMessage + 67;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(tossSecuritiesWebView);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onPostMessage + 9;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(TossSecuritiesWebView tossSecuritiesWebView, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onUnminimized + 39;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(tossSecuritiesWebView, str);
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        int i5 = onPostMessage + 53;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ boolean onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = onUnminimized + 37;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(str);
        }
        onNavigationEvent(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallbackStub extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static long onWarmupCompleted = 4691809506190632174L;
        final /* synthetic */ TossSecuritiesWebView onExtraCallbackWithResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, TossSecuritiesWebView tossSecuritiesWebView) {
            super(onwarmupcompleted);
            this.onExtraCallbackWithResult = tossSecuritiesWebView;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            TossSecuritiesWebView.onWarmupCompleted();
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("content", "coroutine scope error");
            Object[] objArr = new Object[1];
            a(new char[]{30031, 30010, 55170, 62976, 33937, 34834, 18856}, ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr);
            AFd1mSDK.onExtraCallbackWithResult("WebView", th, access8000.IAuthTabCallbackStub(pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), this.onExtraCallbackWithResult.getUrl())), false, (Function1) null, 24, (Object) null);
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnExtraCallbackWithResult = TossSecuritiesWebView.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
            String message = th.getMessage();
            if (message == null) {
                int i4 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                message = "Unknown Error";
            }
            String url = this.onExtraCallbackWithResult.getUrl();
            if (url == null) {
                url = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            getsupportedhighspeedresolutionsforOnExtraCallbackWithResult.IAuthTabCallback(new AFh1zSDK.onExtraCallbackWithResult(-1, message, url));
            int i6 = IAuthTabCallback + 125;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (true) {
                obj = null;
                if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                    break;
                }
                int i3 = $10 + 83;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 45812), 84 - Gravity.getAbsoluteGravity(0, 0), KeyEvent.normalizeMetaState(0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14185), 19 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
            String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
            int i6 = $10 + 51;
            $11 = i6 % 128;
            if (i6 % 2 != 0) {
                objArr[0] = str;
            } else {
                obj.hashCode();
                throw null;
            }
        }
    }

    public static final class asInterface extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] IAuthTabCallback = {64966, 64961, 64985, 64991};
        private static char onExtraCallbackWithResult = 51243;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ TossSecuritiesWebView onExtraCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asInterface(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, TossSecuritiesWebView tossSecuritiesWebView) {
            super(onwarmupcompleted);
            this.onExtraCallback = tossSecuritiesWebView;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) throws Throwable {
            int i = 2 % 2;
            TossSecuritiesWebView.onWarmupCompleted();
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("content", "coroutine scope error");
            byte b = (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24);
            String str = _UrlKt.FRAGMENT_ENCODE_SET;
            Object[] objArr = new Object[1];
            a(new char[]{1, 0, 13838}, b, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) + 3, objArr);
            AFd1mSDK.onExtraCallbackWithResult("WebView", th, access8000.IAuthTabCallbackStub(pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), this.onExtraCallback.getUrl())), false, (Function1) null, 24, (Object) null);
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnExtraCallbackWithResult = TossSecuritiesWebView.onExtraCallbackWithResult(this.onExtraCallback);
            String message = th.getMessage();
            if (message == null) {
                int i2 = onWarmupCompleted + 75;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                message = "Unknown Error";
            }
            String url = this.onExtraCallback.getUrl();
            if (url != null) {
                str = url;
            }
            getsupportedhighspeedresolutionsforOnExtraCallbackWithResult.IAuthTabCallback(new AFh1zSDK.onExtraCallbackWithResult(-1, message, str));
            int i4 = onNavigationEvent + 25;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 93 / 0;
            }
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = IAuthTabCallback;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i4 = 0; i4 < length; i4++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 26 - TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
            try {
                Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 26 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET), (ViewConfiguration.getFadingEdgeLength() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                    int i5 = $11 + 67;
                    $10 = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 3 / 2;
                    }
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                        int i7 = $11 + 99;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            int i9 = $11 + 47;
                            $10 = i9 % 128;
                            int i10 = i9 % 2;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            obj = obj2;
                        } else {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 24824), (ViewConfiguration.getEdgeSlop() >> 16) + 74, 8088 - KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                int i11 = $10 + 41;
                                $11 = i11 % 128;
                                int i12 = i11 % 2;
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 30 - Color.alpha(0), TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    int i14 = $11 + 91;
                                    $10 = i14 % 128;
                                    int i15 = i14 % 2;
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i16];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                                } else {
                                    int i18 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i19 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i18];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i19];
                                }
                            }
                        }
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                        obj2 = obj;
                    }
                }
                int i20 = $10 + 35;
                $11 = i20 % 128;
                int i21 = i20 % 2;
                for (int i22 = 0; i22 < i; i22++) {
                    cArr4[i22] = (char) (cArr4[i22] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
    }

    public static final class onTransact extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int[] onExtraCallback = {-331232890, 139717277, 1233872449, -1969026513, -2118550007, 1373973204, -100183824, 880172567, 1542469384, 1576918815, 1918513017, -443522727, -496740712, -818770823, 960305151, -838514391, 699099006, 1307678883};
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ TossSecuritiesWebView IAuthTabCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, TossSecuritiesWebView tossSecuritiesWebView) {
            super(onwarmupcompleted);
            this.IAuthTabCallback = tossSecuritiesWebView;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) throws Throwable {
            int i = 2 % 2;
            TossSecuritiesWebView.onWarmupCompleted();
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("content", "coroutine scope error");
            Object[] objArr = new Object[1];
            a(new int[]{-1460732781, -459652121}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3, objArr);
            AFd1mSDK.onExtraCallbackWithResult("WebView", th, access8000.IAuthTabCallbackStub(pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), this.IAuthTabCallback.getUrl())), false, (Function1) null, 24, (Object) null);
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnExtraCallbackWithResult = TossSecuritiesWebView.onExtraCallbackWithResult(this.IAuthTabCallback);
            String message = th.getMessage();
            if (message == null) {
                int i2 = onWarmupCompleted + 97;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 0 / 0;
                }
                message = "Unknown Error";
            }
            String url = this.IAuthTabCallback.getUrl();
            if (url == null) {
                int i4 = onExtraCallbackWithResult + 91;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                url = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            getsupportedhighspeedresolutionsforOnExtraCallbackWithResult.IAuthTabCallback(new AFh1zSDK.onExtraCallbackWithResult(-1, message, url));
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int length;
            int[] iArr2;
            int i3;
            int i4 = 2;
            int i5 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = onExtraCallback;
            float f = 0.0f;
            int i6 = -1469660336;
            int i7 = 0;
            if (iArr3 != null) {
                int i8 = $10 + 57;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i3 = 1;
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i3 = 0;
                }
                while (i3 < length) {
                    int i9 = $10 + 13;
                    $11 = i9 % 128;
                    if (i9 % i4 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr3[i3])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 71, 8849 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr2[i3] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                            i3 >>>= 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(iArr3[i3])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0') + 73, 8848 - (ViewConfiguration.getScrollBarSize() >> 8), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i3] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i3++;
                    }
                    i4 = 2;
                    f = 0.0f;
                }
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onExtraCallback;
            if (iArr5 != null) {
                int i10 = $10 + 99;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i12 = 0;
                while (i12 < length3) {
                    Object[] objArr4 = new Object[1];
                    objArr4[i7] = Integer.valueOf(iArr5[i12]);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(i7, i7), 72 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 8848 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i12++;
                    i6 = -1469660336;
                    i7 = 0;
                }
                int i13 = $10 + 31;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                iArr5 = iArr6;
                i2 = 0;
            } else {
                i2 = 0;
            }
            System.arraycopy(iArr5, i2, iArr4, i2, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i15 = 0;
                for (int i16 = 16; i15 < i16; i16 = 16) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0')), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 39, 10301 - KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i15++;
                    int i17 = $10 + 119;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                }
                int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i19;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 78 - Drawable.resolveOpacity(0, 0), Color.rgb(0, 0, 0) + 16784614, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                i2 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(TossSecuritiesWebView tossSecuritiesWebView, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 7;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        tossSecuritiesWebView.access100 = access13800Var;
        int i5 = i2 + 5;
        onUnminimized = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 46 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Exception {
        TossSecuritiesWebView tossSecuritiesWebView = (TossSecuritiesWebView) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        access13800<? super String> access13800Var = (access13800) objArr[3];
        int i = 2 % 2;
        int i2 = onPostMessage + 123;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = tossSecuritiesWebView.IAuthTabCallback(str, str2, access13800Var);
        int i4 = onUnminimized + 69;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult(TossSecuritiesWebView tossSecuritiesWebView) {
        int i = 2 % 2;
        int i2 = onUnminimized + 27;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        getSupportedHighSpeedResolutionsFor<AFh1zSDK> getsupportedhighspeedresolutionsfor = tossSecuritiesWebView.onNavigationEvent;
        int i5 = i3 + 67;
        onUnminimized = i5 % 128;
        if (i5 % 2 != 0) {
            return getsupportedhighspeedresolutionsfor;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(TossSecuritiesWebView tossSecuritiesWebView, Uri uri) throws Throwable {
        int i = 2 % 2;
        int i2 = onUnminimized + 21;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        tossSecuritiesWebView.onWarmupCompleted(uri);
        int i4 = onUnminimized + 69;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
    }

    public static final /* synthetic */ Object onNavigationEvent(TossSecuritiesWebView tossSecuritiesWebView, String str, String str2, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onPostMessage + 113;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {tossSecuritiesWebView, str, str2, access13800Var};
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        int iIAuthTabCallback4 = zziea.IAuthTabCallback();
        if (i3 == 0) {
            onNavigationEvent(iIAuthTabCallback, 771496448, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback4, objArr, -771496440);
            throw null;
        }
        Object objOnNavigationEvent = onNavigationEvent(iIAuthTabCallback, 771496448, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback4, objArr, -771496440);
        int i4 = onPostMessage + 31;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnNavigationEvent;
        }
        throw null;
    }

    public static final /* synthetic */ AppSetIdAndScope1 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onPostMessage + 25;
        int i3 = i2 % 128;
        onUnminimized = i3;
        int i4 = i2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = onExtraCallback;
        int i5 = i3 + 49;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return appSetIdAndScope1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TossSecuritiesWebView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.asInterface = putChannelInfo.onExtraCallback().onExtraCallback().plus(new IAuthTabCallbackStub(CoroutineExceptionHandler.extraCallbackWithResult, this));
        Boolean bool = Boolean.FALSE;
        this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(AFh1zSDK.onExtraCallback.onExtraCallbackWithResult, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.readTypedObject = onWarmupCompleted.FINTECH;
        this.onActivityLayout = lambdaonInstallReferrerSetupFinished0.onNavigationEvent.onNavigationEvent;
        this.extraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.ICustomTabsCallback = -1L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TossSecuritiesWebView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.asInterface = putChannelInfo.onExtraCallback().onExtraCallback().plus(new onTransact(CoroutineExceptionHandler.extraCallbackWithResult, this));
        Boolean bool = Boolean.FALSE;
        this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(AFh1zSDK.onExtraCallback.onExtraCallbackWithResult, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.readTypedObject = onWarmupCompleted.FINTECH;
        this.onActivityLayout = lambdaonInstallReferrerSetupFinished0.onNavigationEvent.onNavigationEvent;
        this.extraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.ICustomTabsCallback = -1L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TossSecuritiesWebView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.asInterface = putChannelInfo.onExtraCallback().onExtraCallback().plus(new asInterface(CoroutineExceptionHandler.extraCallbackWithResult, this));
        Boolean bool = Boolean.FALSE;
        this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(AFh1zSDK.onExtraCallback.onExtraCallbackWithResult, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.readTypedObject = onWarmupCompleted.FINTECH;
        this.onActivityLayout = lambdaonInstallReferrerSetupFinished0.onNavigationEvent.onNavigationEvent;
        this.extraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.ICustomTabsCallback = -1L;
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onActivityResized ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + Imgproc.COLOR_YUV2RGB_YVYU;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onActivityResized)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 84 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14184 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0)), 19 - View.MeasureSpec.getMode(0), 8808 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 43;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final findResAndMsg validateRelationship() {
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
        int i = 2 % 2;
        int i2 = onPostMessage + 55;
        onUnminimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
            obj.hashCode();
            throw null;
        }
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult == null || (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult)) == null) {
            return findRes.onWarmupCompleted(putChannelInfo.onExtraCallback().onExtraCallback());
        }
        int i3 = onPostMessage;
        int i4 = i3 + 79;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 97;
        onUnminimized = i5 % 128;
        if (i5 % 2 != 0) {
            return textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
        }
        throw null;
    }

    public final void setOnRenderGone(@Nullable Function1<? super TossSecuritiesWebView, Unit> function1) {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 107;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallback_Parcel = function1;
        if (i4 != 0) {
            int i5 = 62 / 0;
        }
        int i6 = i2 + 73;
        onPostMessage = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public static final class IAuthTabCallbackDefault implements View.OnAttachStateChangeListener {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ View onExtraCallback;
        final /* synthetic */ TossSecuritiesWebView onExtraCallbackWithResult;
        final /* synthetic */ boolean onWarmupCompleted;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }

        public IAuthTabCallbackDefault(View view, boolean z, TossSecuritiesWebView tossSecuritiesWebView) {
            this.onExtraCallback = view;
            this.onWarmupCompleted = z;
            this.onExtraCallbackWithResult = tossSecuritiesWebView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                this.onExtraCallback.removeOnAttachStateChangeListener(this);
                throw null;
            }
            this.onExtraCallback.removeOnAttachStateChangeListener(this);
            if (this.onWarmupCompleted) {
                int i3 = IAuthTabCallback + 39;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    this.onExtraCallbackWithResult.onResume();
                    int i4 = 64 / 0;
                } else {
                    this.onExtraCallbackWithResult.onResume();
                }
            }
            this.onExtraCallbackWithResult.scrollBy(0, 1);
        }
    }

    public final CameraPresenceProviderExternalSyntheticLambda6<Boolean> ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onUnminimized + 19;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor = this.onWarmupCompleted;
        int i5 = i3 + 59;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        return getsupportedhighspeedresolutionsfor;
    }

    public final CameraPresenceProviderExternalSyntheticLambda6<AFh1zSDK> newSession() {
        int i = 2 % 2;
        int i2 = onPostMessage + 1;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor<AFh1zSDK> getsupportedhighspeedresolutionsfor = this.onNavigationEvent;
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        return getsupportedhighspeedresolutionsfor;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 55935;
        private static int IAuthTabCallbackStub = 1;
        private static char onExtraCallback = 59711;
        private static char onExtraCallbackWithResult = 54090;
        private static int onNavigationEvent = 0;
        private static char onWarmupCompleted = 48189;
        final /* synthetic */ String $url;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(String str, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$url = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = TossSecuritiesWebView.this.new onExtraCallbackWithResult(this.$url, access13800Var);
            int i2 = onNavigationEvent + 105;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            IAuthTabCallbackStub = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(findresandmsg2, access13800Var2);
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg2, access13800Var2);
            int i3 = onNavigationEvent + 99;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onExtraCallbackWithResult) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallbackStub + 29;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            int i4 = $11 + 119;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i6 = $10 + 71;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i8 = 58224;
                int i9 = i3;
                while (i9 < 16) {
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i10 = (c2 + i8) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                    int i11 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onWarmupCompleted);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[1] = Integer.valueOf(i10);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            int offsetBefore = TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, i3) + 10;
                            int iIndexOf = 12433 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', i3);
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), offsetBefore, iIndexOf, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), ':' - AndroidCharacter.getMirror('0'), 12435 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i8 -= 40503;
                        i9++;
                        cArr3 = cArr4;
                        i3 = 0;
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16013), Color.argb(0, 0, 0, 0) + 14, TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0') + 19902, -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        /* renamed from: im.toss.tosssecurities.webview.TossSecuritiesWebView$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        static final class C0000onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;
            int I$0;
            Object L$0;
            int label;
            final /* synthetic */ TossSecuritiesWebView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0000onExtraCallbackWithResult(TossSecuritiesWebView tossSecuritiesWebView, access13800<? super C0000onExtraCallbackWithResult> access13800Var) {
                super(2, access13800Var);
                this.this$0 = tossSecuritiesWebView;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                C0000onExtraCallbackWithResult c0000onExtraCallbackWithResult = new C0000onExtraCallbackWithResult(this.this$0, access13800Var);
                int i2 = onWarmupCompleted + 61;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return c0000onExtraCallbackWithResult;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super String> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 97;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
                int i4 = onWarmupCompleted + 21;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return objOnNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super String> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 81;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((C0000onExtraCallbackWithResult) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 17;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 54 / 0;
                }
                return objInvokeSuspend;
            }

            /* renamed from: im.toss.tosssecurities.webview.TossSecuritiesWebView$onExtraCallbackWithResult$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
            static final class C0001onExtraCallbackWithResult<T> implements ValueCallback {
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;
                final /* synthetic */ maybeRemoveAttachStateListener<String> IAuthTabCallback;

                /* JADX WARN: Multi-variable type inference failed */
                C0001onExtraCallbackWithResult(maybeRemoveAttachStateListener<? super String> mayberemoveattachstatelistener) {
                    this.IAuthTabCallback = mayberemoveattachstatelistener;
                }

                @Override // android.webkit.ValueCallback
                public /* synthetic */ void onReceiveValue(Object obj) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 59;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    Object obj2 = null;
                    onNavigationEvent((String) obj);
                    if (i3 == 0) {
                        obj2.hashCode();
                        throw null;
                    }
                    int i4 = onWarmupCompleted + 95;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                }

                public final void onNavigationEvent(String str) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 109;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    maybeRemoveAttachStateListener<String> mayberemoveattachstatelistener = this.IAuthTabCallback;
                    Result.Companion companion = Result.Companion;
                    mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(str));
                    int i4 = onExtraCallbackWithResult + 41;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onExtraCallback + 97;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    return obj;
                }
                ResultKt.onNavigationEvent(obj);
                TossSecuritiesWebView tossSecuritiesWebView = this.this$0;
                this.L$0 = tossSecuritiesWebView;
                this.I$0 = 0;
                this.label = 1;
                setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(this), 1);
                setresourceinternal.onTransact();
                tossSecuritiesWebView.evaluateJavascript("(function() { return true; })()", new C0001onExtraCallbackWithResult(setresourceinternal));
                Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
                if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
                    access14600.IAuthTabCallback(this);
                    int i4 = onExtraCallback + 59;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                }
                if (objIAuthTabCallbackDefault != objOnExtraCallback) {
                    return objIAuthTabCallbackDefault;
                }
                int i6 = onWarmupCompleted + 125;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return objOnExtraCallback;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Long lOnExtraCallback;
            Long l;
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            String str = null;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDKMayLaunchUrl = TossSecuritiesWebView.this.mayLaunchUrl();
                if (aFi1pSDKAFa1ySDKMayLaunchUrl != null) {
                    int i3 = onNavigationEvent + 69;
                    IAuthTabCallbackStub = i3 % 128;
                    int i4 = i3 % 2;
                    lOnExtraCallback = aFi1pSDKAFa1ySDKMayLaunchUrl.onExtraCallback();
                } else {
                    int i5 = onNavigationEvent + 49;
                    IAuthTabCallbackStub = i5 % 128;
                    int i6 = i5 % 2;
                    lOnExtraCallback = null;
                }
                try {
                    C0000onExtraCallbackWithResult c0000onExtraCallbackWithResult = new C0000onExtraCallbackWithResult(TossSecuritiesWebView.this, null);
                    this.L$0 = lOnExtraCallback;
                    this.label = 1;
                    Object objOnNavigationEvent = doGet.onNavigationEvent(1000L, c0000onExtraCallbackWithResult, this);
                    if (objOnNavigationEvent == objOnExtraCallback) {
                        int i7 = IAuthTabCallbackStub + 95;
                        onNavigationEvent = i7 % 128;
                        if (i7 % 2 == 0) {
                            return objOnExtraCallback;
                        }
                        str.hashCode();
                        throw null;
                    }
                    l = lOnExtraCallback;
                    obj = objOnNavigationEvent;
                } catch (WebResourceResponseModel unused) {
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = IAuthTabCallbackStub + 35;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                l = (Long) this.L$0;
                try {
                    ResultKt.onNavigationEvent(obj);
                } catch (WebResourceResponseModel unused2) {
                }
            }
            str = (String) obj;
            lOnExtraCallback = l;
            String strIAuthTabCallback = AFi1lSDK.onExtraCallback.IAuthTabCallback(str);
            boolean zAreEqual = Intrinsics.areEqual(strIAuthTabCallback, "healthy");
            AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDKMayLaunchUrl2 = TossSecuritiesWebView.this.mayLaunchUrl();
            if (aFi1pSDKAFa1ySDKMayLaunchUrl2 != null) {
                int i10 = onNavigationEvent + 53;
                IAuthTabCallbackStub = i10 % 128;
                int i11 = i10 % 2;
                AFi1pSDKAFa1ySDK.onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{aFi1pSDKAFa1ySDKMayLaunchUrl2, TossSecuritiesWebView.this.postMessage(), this.$url, strIAuthTabCallback, lOnExtraCallback}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -154486527, 154486531, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted());
            }
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("content", "JS health check");
            Object[] objArr = new Object[1];
            a(new char[]{50610, 43675, 64296, 25751, 9444, 35541}, ImageFormat.getBitsPerPixel(0) + 7, objArr);
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), strIAuthTabCallback);
            Object[] objArr2 = new Object[1];
            a(new char[]{32875, 34194, 37104, 38059}, TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) + 3, objArr2);
            Map mapIAuthTabCallbackStub = access8000.IAuthTabCallbackStub(pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), this.$url), getWrite.IAuthTabCallback("_webview_id", (String) TossBridgeWebView.onWarmupCompleted(WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), new Object[]{TossSecuritiesWebView.this}, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), -157751857, 157751867, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback())));
            if (zAreEqual) {
                AFd1mSDK.onWarmupCompleted("WebView", mapIAuthTabCallbackStub, false, (Function1) null, 12, (Object) null);
            } else {
                AFd1mSDK.onExtraCallbackWithResult("WebView", (Throwable) null, mapIAuthTabCallbackStub, false, (Function1) null, 24, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    public final boolean ICustomTabsService() {
        int i = 2 % 2;
        int i2 = onUnminimized + 111;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        boolean z = this.IAuthTabCallbackStub;
        int i5 = i3 + 13;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final AFi1pSDKAFa1ySDK mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 97;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK = this.access000;
        int i5 = i2 + 41;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return aFi1pSDKAFa1ySDK;
    }

    public final void setMonitoringTracker$TossSecuritiesNativeWebview_release(@Nullable AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK) {
        int i = 2 % 2;
        int i2 = onUnminimized + 11;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        this.access000 = aFi1pSDKAFa1ySDK;
        int i5 = i3 + 109;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallbackWithResult(@NotNull String str) {
        Long lOnExtraCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (!this.IAuthTabCallbackStub) {
            this.onTransact = str;
            AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK = this.access000;
            if (aFi1pSDKAFa1ySDK != null) {
                lOnExtraCallback = aFi1pSDKAFa1ySDK.onExtraCallback();
                int i2 = onPostMessage + 19;
                onUnminimized = i2 % 128;
                int i3 = i2 % 2;
            } else {
                int i4 = onPostMessage + 65;
                onUnminimized = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 / 4;
                }
                lOnExtraCallback = null;
            }
            this.asBinder = lOnExtraCallback;
            int i6 = onPostMessage + 57;
            onUnminimized = i6 % 128;
            int i7 = i6 % 2;
        }
        this.IAuthTabCallbackStub = true;
    }

    private final void ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = onPostMessage + 83;
        onUnminimized = i2 % 128;
        this.IAuthTabCallbackStub = i2 % 2 == 0;
        this.onTransact = null;
        this.asBinder = null;
    }

    public final onWarmupCompleted postMessage() {
        int i = 2 % 2;
        int i2 = onUnminimized + Imgproc.COLOR_YUV2RGB_YVYU;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        onWarmupCompleted onwarmupcompleted = this.readTypedObject;
        int i5 = i3 + 13;
        onUnminimized = i5 % 128;
        if (i5 % 2 != 0) {
            return onwarmupcompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setType(@NotNull onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onUnminimized + 57;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.readTypedObject = onwarmupcompleted;
        int i4 = onPostMessage + 95;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final lambdaonInstallReferrerSetupFinished0 newAuthTabSession() {
        lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0;
        int i = 2 % 2;
        int i2 = onPostMessage + 107;
        int i3 = i2 % 128;
        onUnminimized = i3;
        if (i2 % 2 == 0) {
            lambdaoninstallreferrersetupfinished0 = this.onActivityLayout;
            int i4 = 6 / 0;
        } else {
            lambdaoninstallreferrersetupfinished0 = this.onActivityLayout;
        }
        int i5 = i3 + 31;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return lambdaoninstallreferrersetupfinished0;
    }

    public final void setWebId(@NotNull lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0) {
        int i = 2 % 2;
        int i2 = onPostMessage + 87;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(lambdaoninstallreferrersetupfinished0, "");
            this.onActivityLayout = lambdaoninstallreferrersetupfinished0;
        } else {
            Intrinsics.checkNotNullParameter(lambdaoninstallreferrersetupfinished0, "");
            this.onActivityLayout = lambdaoninstallreferrersetupfinished0;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        TossSecuritiesWebView tossSecuritiesWebView = (TossSecuritiesWebView) objArr[0];
        int i = 2 % 2;
        int i2 = onUnminimized + 99;
        int i3 = i2 % 128;
        onPostMessage = i3;
        if (i2 % 2 != 0) {
            long j = tossSecuritiesWebView.ICustomTabsCallback;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = tossSecuritiesWebView.ICustomTabsCallback;
        int i4 = i3 + 35;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            return Long.valueOf(j2);
        }
        int i5 = 55 / 0;
        return Long.valueOf(j2);
    }

    public String extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 69;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onMinimized;
        int i5 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setWebBridgeBackPressHandler(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onPostMessage + 47;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            this.onMinimized = str;
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            int iIAuthTabCallback2 = zziea.IAuthTabCallback();
            onNavigationEvent(iIAuthTabCallback, 116648509, zziea.IAuthTabCallback(), iIAuthTabCallback2, zziea.IAuthTabCallback(), new Object[]{this}, -116648504);
            return;
        }
        this.onMinimized = str;
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        int iIAuthTabCallback4 = zziea.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback3, 116648509, zziea.IAuthTabCallback(), iIAuthTabCallback4, zziea.IAuthTabCallback(), new Object[]{this}, -116648504);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<setTopGuideFontStyle> onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        listCreateListBuilder.addAll(super/*im.toss.core.webkit.TossBridgeWebView*/.onNavigationEvent());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        listCreateListBuilder.add(new setTopGuideFontStyle.IAuthTabCallback(onIconClick.onExtraCallback(context), (String) null, "Web", 2, (DefaultConstructorMarker) null));
        setTopGuideFontStyle settopguidefontstyleOnNavigationEvent = r8lambdaGeF1OpgRxhfJiXGWbs9OMNOxg.Companion.onNavigationEvent(false);
        if (settopguidefontstyleOnNavigationEvent != null) {
            int i2 = onUnminimized + 55;
            onPostMessage = i2 % 128;
            if (i2 % 2 != 0) {
                listCreateListBuilder.add(settopguidefontstyleOnNavigationEvent);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            listCreateListBuilder.add(settopguidefontstyleOnNavigationEvent);
        }
        listCreateListBuilder.add(new setTopGuideFontStyle.IAuthTabCallbackDefault(0, 0, 0, 0));
        listCreateListBuilder.add(new setTopGuideFontStyle.onTransact(0, 0));
        Object[] objArr = new Object[1];
        d(new char[]{51954, 54606, 60202, 51846, 32600, 63924, 45659, 64174, 30881, 2966, 57467, 18578, 44759, 17896, 22030}, ViewConfiguration.getKeyRepeatDelay() >> 16, objArr);
        listCreateListBuilder.add(new setTopGuideFontStyle.asBinder(((String) objArr[0]).intern()));
        List<setTopGuideFontStyle> listBuild = CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder);
        int i3 = onPostMessage + 89;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        return listBuild;
    }

    public List<AppManagerImpl> onRelationshipValidationResult() {
        int i = 2 % 2;
        List<AppManagerImpl> listListOf = CollectionsKt__CollectionsJVMKt.listOf(new AppManagerImpl(this, "TossSecWebView"));
        int i2 = onPostMessage + 111;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 45 / 0;
        }
        return listListOf;
    }

    public final void prefetch() {
        int i = 2 % 2;
        int i2 = onPostMessage + 75;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            Uri.parse(AFi1aSDK.onExtraCallback(this.readTypedObject, newChunkedSink.onExtraCallbackWithResult())).buildUpon().encodedPath(this.onActivityLayout.onExtraCallbackWithResult());
            this.onActivityLayout.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Uri.Builder builderEncodedPath = Uri.parse(AFi1aSDK.onExtraCallback(this.readTypedObject, newChunkedSink.onExtraCallbackWithResult())).buildUpon().encodedPath(this.onActivityLayout.onExtraCallbackWithResult());
        String strOnNavigationEvent = this.onActivityLayout.onNavigationEvent();
        if (strOnNavigationEvent == null) {
            int i3 = onUnminimized + Imgproc.COLOR_YUV2RGB_YVYU;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            strOnNavigationEvent = "/stocks/[stockCode]";
        }
        builderEncodedPath.encodedQuery("prefetchUrls=" + strOnNavigationEvent);
        String string = builderEncodedPath.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        loadUrl(string);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TossSecuritiesWebView tossSecuritiesWebView, String str, boolean z, boolean z2, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onUnminimized + 67;
        int i4 = i3 % 128;
        onPostMessage = i4;
        int i5 = i3 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            int i6 = i4 + 39;
            onUnminimized = i6 % 128;
            int i7 = i6 % 2;
            z2 = false;
        }
        tossSecuritiesWebView.onNavigationEvent(str, z, z2);
    }

    public final void onNavigationEvent(@NotNull String str, boolean z, boolean z2) throws Throwable {
        Uri uri;
        String host;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ICustomTabsServiceDefault();
        Uri uri2 = Uri.parse(str);
        String url = getUrl();
        String str2 = null;
        if (url != null) {
            uri = Uri.parse(url);
        } else {
            int i2 = onUnminimized + 47;
            onPostMessage = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 / 4;
            }
            uri = null;
        }
        this.onNavigationEvent.IAuthTabCallback(AFh1zSDK.onExtraCallback.onExtraCallbackWithResult);
        this.IAuthTabCallbackDefault = str;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("content", "navigate 시도");
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("warmUp", Boolean.valueOf(getUrl() == null));
        Object[] objArr = new Object[1];
        d(new char[]{53827, 51506, 35530, 53814, 136, 58824, 54198}, 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
        AFd1mSDK.onWarmupCompleted("WebView", access8000.IAuthTabCallbackStub(pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str)), false, (Function1) null, 12, (Object) null);
        if (!(!uri2.isRelative())) {
            if (z) {
                int i4 = onUnminimized + 63;
                onPostMessage = i4 % 128;
                int i5 = i4 % 2;
                str2 = "{ replace: true, shallow: true }";
            }
            onNavigationEvent(zziea.IAuthTabCallback(), 1472733121, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{this, uri2, str2}, -1472733119);
            return;
        }
        if (!z2) {
            if (uri != null) {
                int i6 = onUnminimized + 83;
                onPostMessage = i6 % 128;
                int i7 = i6 % 2;
                host = uri.getHost();
                int i8 = onPostMessage + 9;
                onUnminimized = i8 % 128;
                int i9 = i8 % 2;
            } else {
                host = null;
            }
            if (Intrinsics.areEqual(host, uri2.getHost())) {
                StringBuilder sb = new StringBuilder();
                sb.append(uri2.getEncodedPath());
                if (uri2.getEncodedQuery() != null) {
                    sb.append("?");
                    sb.append(uri2.getEncodedQuery());
                }
                onNavigationEvent(zziea.IAuthTabCallback(), -1476364332, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{this, Uri.parse(sb.toString()), null, 2, null}, 1476364335);
                return;
            }
        }
        loadUrl(str);
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static char[] onNavigationEvent = {27150, 27185, 27189};
        private static int onWarmupCompleted = 1;
        final /* synthetic */ String $option;
        final /* synthetic */ Uri $relativeUri;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(String str, Uri uri, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$option = str;
            this.$relativeUri = uri;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return iAuthTabCallback.invokeSuspend(Unit.INSTANCE);
            }
            iAuthTabCallback.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = TossSecuritiesWebView.this.new IAuthTabCallback(this.$option, this.$relativeUri, access13800Var);
            int i2 = IAuthTabCallback + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg2, access13800Var2);
            }
            IAuthTabCallback(findresandmsg2, access13800Var2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            char[] cArr;
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr2 = onNavigationEvent;
            char c = '0';
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 35283), 35 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, c) + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i6++;
                        c = '0';
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
            char[] cArr4 = new char[i3];
            System.arraycopy(cArr2, i2, cArr4, 0, i3);
            if (bArr != null) {
                char[] cArr5 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c2 = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i7 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - ImageFormat.getBitsPerPixel(0)), 65 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0), 16718 - (ViewConfiguration.getLongPressTimeout() >> 16), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        int i8 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) + 29, 17656 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0'), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i8] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                    c2 = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 70 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 12486 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr4 = cArr5;
            }
            if (i5 > 0) {
                char[] cArr6 = new char[i3];
                System.arraycopy(cArr4, 0, cArr6, 0, i3);
                int i9 = i3 - i5;
                System.arraycopy(cArr6, 0, cArr4, i9, i5);
                System.arraycopy(cArr6, i5, cArr4, 0, i9);
            }
            if (z) {
                int i10 = $10 + 37;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr = new char[i3];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                } else {
                    cArr = new char[i3];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                }
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i11 = $10 + 87;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr4 = cArr;
            }
            if (i4 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0139  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            Boolean bool;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            IAuthTabCallback = i2 % 128;
            String strValueOf = null;
            if (i2 % 2 != 0) {
                access14100.onExtraCallback();
                strValueOf.hashCode();
                throw null;
            }
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                TossSecuritiesWebView tossSecuritiesWebView = TossSecuritiesWebView.this;
                String url = tossSecuritiesWebView.getUrl();
                this.label = 1;
                obj = TossSecuritiesWebView.onNavigationEvent(zziea.IAuthTabCallback(), 944475558, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{tossSecuritiesWebView, "window.__canNavigate", url, this}, -944475551);
                if (obj != objOnExtraCallback) {
                }
                return objOnExtraCallback;
            }
            if (i3 != 1) {
                int i4 = IAuthTabCallback + 49;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0 ? i3 != 2 : i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                ResultKt.onNavigationEvent(obj);
                bool = (Boolean) obj;
                if (Intrinsics.areEqual(bool, access14000.onNavigationEvent(true))) {
                    TossSecuritiesWebView.onExtraCallbackWithResult(TossSecuritiesWebView.this, this.$relativeUri);
                } else {
                    int i5 = IAuthTabCallback + 19;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        TossSecuritiesWebView.onExtraCallbackWithResult(TossSecuritiesWebView.this).IAuthTabCallback(AFh1zSDK.onNavigationEvent.onExtraCallbackWithResult);
                        strValueOf.hashCode();
                        throw null;
                    }
                    TossSecuritiesWebView.onExtraCallbackWithResult(TossSecuritiesWebView.this).IAuthTabCallback(AFh1zSDK.onNavigationEvent.onExtraCallbackWithResult);
                }
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("content", "navigate 완료");
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("success", access14000.onNavigationEvent(Intrinsics.areEqual(bool, access14000.onNavigationEvent(true))));
                Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("canNavigate", str);
                if (bool != null) {
                    int i6 = IAuthTabCallback + 25;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 == 0) {
                        String.valueOf(bool.booleanValue());
                        strValueOf.hashCode();
                        throw null;
                    }
                    strValueOf = String.valueOf(bool.booleanValue());
                }
                Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("navigateResult", strValueOf);
                Object[] objArr = new Object[1];
                a(new int[]{0, 3, 12, 0}, false, new byte[]{1, 1, 0}, objArr);
                AFd1mSDK.onWarmupCompleted("WebView", access8000.IAuthTabCallbackStub(pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), this.$relativeUri.toString())), false, (Function1) null, 12, (Object) null);
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj);
            String str2 = (String) obj;
            if (!Boolean.parseBoolean(str2)) {
                TossSecuritiesWebView.onExtraCallbackWithResult(TossSecuritiesWebView.this, this.$relativeUri);
                str = str2;
                bool = null;
                Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("content", "navigate 완료");
                Pair pairIAuthTabCallback22 = getWrite.IAuthTabCallback("success", access14000.onNavigationEvent(Intrinsics.areEqual(bool, access14000.onNavigationEvent(true))));
                Pair pairIAuthTabCallback32 = getWrite.IAuthTabCallback("canNavigate", str);
                if (bool != null) {
                }
                Pair pairIAuthTabCallback42 = getWrite.IAuthTabCallback("navigateResult", strValueOf);
                Object[] objArr2 = new Object[1];
                a(new int[]{0, 3, 12, 0}, false, new byte[]{1, 1, 0}, objArr2);
                AFd1mSDK.onWarmupCompleted("WebView", access8000.IAuthTabCallbackStub(pairIAuthTabCallback5, pairIAuthTabCallback22, pairIAuthTabCallback32, pairIAuthTabCallback42, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), this.$relativeUri.toString())), false, (Function1) null, 12, (Object) null);
                return Unit.INSTANCE;
            }
            String str3 = this.$option;
            if (str3 != null) {
                String str4 = "window.__navigate('" + this.$relativeUri + "', " + str3 + ")";
                if (str4 == null) {
                    str4 = "window.__initNavigate('" + this.$relativeUri + "')";
                }
                TossSecuritiesWebView tossSecuritiesWebView2 = TossSecuritiesWebView.this;
                String url2 = tossSecuritiesWebView2.getUrl();
                this.L$0 = str2;
                this.L$1 = access15400.onNavigationEvent(str4);
                this.label = 2;
                Object objOnNavigationEvent = TossSecuritiesWebView.onNavigationEvent(tossSecuritiesWebView2, str4, url2, this);
                if (objOnNavigationEvent != objOnExtraCallback) {
                    str = str2;
                    obj = objOnNavigationEvent;
                    bool = (Boolean) obj;
                    if (Intrinsics.areEqual(bool, access14000.onNavigationEvent(true))) {
                    }
                }
                return objOnExtraCallback;
            }
            Pair pairIAuthTabCallback52 = getWrite.IAuthTabCallback("content", "navigate 완료");
            Pair pairIAuthTabCallback222 = getWrite.IAuthTabCallback("success", access14000.onNavigationEvent(Intrinsics.areEqual(bool, access14000.onNavigationEvent(true))));
            Pair pairIAuthTabCallback322 = getWrite.IAuthTabCallback("canNavigate", str);
            if (bool != null) {
            }
            Pair pairIAuthTabCallback422 = getWrite.IAuthTabCallback("navigateResult", strValueOf);
            Object[] objArr22 = new Object[1];
            a(new int[]{0, 3, 12, 0}, false, new byte[]{1, 1, 0}, objArr22);
            AFd1mSDK.onWarmupCompleted("WebView", access8000.IAuthTabCallbackStub(pairIAuthTabCallback52, pairIAuthTabCallback222, pairIAuthTabCallback322, pairIAuthTabCallback422, getWrite.IAuthTabCallback(((String) objArr22[0]).intern(), this.$relativeUri.toString())), false, (Function1) null, 12, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
      0x0020: PHI (r1v5 o.getPackageType) = (r1v4 o.getPackageType), (r1v6 o.getPackageType) binds: [B:8:0x001e, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void ICustomTabsServiceDefault() {
        getPackageType getpackagetype;
        int i = 2 % 2;
        int i2 = onPostMessage + 49;
        int i3 = i2 % 128;
        onUnminimized = i3;
        if (i2 % 2 == 0) {
            this.onMessageChannelReady = null;
            getpackagetype = this.IAuthTabCallback;
            int i4 = 23 / 0;
            if (getpackagetype != null) {
                int i5 = i3 + 125;
                onPostMessage = i5 % 128;
                int i6 = i5 % 2;
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, null, 1, null);
            }
        } else {
            this.onMessageChannelReady = null;
            getpackagetype = this.IAuthTabCallback;
            if (getpackagetype != null) {
            }
        }
        this.IAuthTabCallback = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        r7 = r7 + 105;
        im.toss.tosssecurities.webview.TossSecuritiesWebView.onUnminimized = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if ((r7 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        onNavigationEvent(com.google.android.gms.internal.ads.zziea.IAuthTabCallback(), 1472733121, com.google.android.gms.internal.ads.zziea.IAuthTabCallback(), com.google.android.gms.internal.ads.zziea.IAuthTabCallback(), com.google.android.gms.internal.ads.zziea.IAuthTabCallback(), new java.lang.Object[]{r1, r2, r4}, -1472733119);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateInternal");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        if (r12 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        if (r12 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if ((r5 & 2) == 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TossSecuritiesWebView tossSecuritiesWebView = (TossSecuritiesWebView) objArr[0];
        Uri uri = (Uri) objArr[1];
        String str = (String) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        int i2 = onUnminimized + 51;
        int i3 = i2 % 128;
        onPostMessage = i3;
        if (i2 % 2 != 0) {
            int i4 = 33 / 0;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        TossSecuritiesWebView tossSecuritiesWebView = (TossSecuritiesWebView) objArr[0];
        Uri uri = (Uri) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = onUnminimized + 7;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        getPackageType getpackagetype = tossSecuritiesWebView.IAuthTabCallbackStubProxy;
        if (getpackagetype != null && getpackagetype.onExtraCallback()) {
            int i4 = onPostMessage + 93;
            onUnminimized = i4 % 128;
            int i5 = i4 % 2;
            getPackageType getpackagetype2 = tossSecuritiesWebView.IAuthTabCallbackStubProxy;
            if (getpackagetype2 != null) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype2, null, 1, null);
            }
            tossSecuritiesWebView.access100 = null;
        }
        if (!tossSecuritiesWebView.IAuthTabCallbackStub) {
            tossSecuritiesWebView.IAuthTabCallbackStubProxy = onLoadStarted.onExtraCallback(tossSecuritiesWebView.validateRelationship(), tossSecuritiesWebView.asInterface, null, tossSecuritiesWebView.new IAuthTabCallback(str, uri, null), 2, null);
            return null;
        }
        int i6 = onPostMessage + 105;
        onUnminimized = i6 % 128;
        int i7 = i6 % 2;
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        String strOnExtraCallback = tossSecuritiesWebView.onExtraCallback(string);
        tossSecuritiesWebView.onWarmupCompleted("dirty_fallback", strOnExtraCallback);
        tossSecuritiesWebView.loadUrl(strOnExtraCallback);
        return null;
    }

    private final void onWarmupCompleted(Uri uri) throws Throwable {
        int i = 2 % 2;
        int i2 = onUnminimized + 125;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        String strOnExtraCallback = onExtraCallback(string);
        onWarmupCompleted("navigate_fallback", strOnExtraCallback);
        loadUrl(strOnExtraCallback);
        int i4 = onPostMessage + 27;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onWarmupCompleted(String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = onPostMessage + 43;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.IAuthTabCallbackStub) {
                String str3 = this.onTransact;
                if (str3 == null) {
                    str3 = "js_timeout";
                }
                AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK = this.access000;
                if (aFi1pSDKAFa1ySDK != null) {
                    aFi1pSDKAFa1ySDK.onExtraCallbackWithResult(this.readTypedObject, str2, str, str3, this.asBinder);
                    int i3 = onUnminimized + 29;
                    onPostMessage = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 4 / 3;
                    }
                }
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("content", "jsFallback");
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("event", str);
                Object[] objArr = new Object[1];
                d(new char[]{45815, 47898, 62484, 45701, 59912, 38903, 44389, 28643, 184, 26076}, ViewConfiguration.getJumpTapTimeout() >> 16, objArr);
                Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str3);
                Object[] objArr2 = new Object[1];
                d(new char[]{53827, 51506, 35530, 53814, 136, 58824, 54198}, ViewConfiguration.getFadingEdgeLength() >> 16, objArr2);
                AFd1mSDK.onWarmupCompleted("WebView", access8000.IAuthTabCallbackStub(pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str2), getWrite.IAuthTabCallback("_webview_id", readTypedObject())), false, (Function1) null, 12, (Object) null);
                return;
            }
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void loadUrl(@NotNull String str, @NotNull Map<String, String> map) {
        int i = 2 % 2;
        int i2 = onPostMessage + 67;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
        }
        super.loadUrl(str, map);
        this.writeTypedObject = true;
        int i3 = onUnminimized + 33;
        onPostMessage = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 1 / 0;
        }
    }

    private final String onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = onPostMessage + 9;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            String string = Uri.parse(AFi1aSDK.onExtraCallback(this.readTypedObject, newChunkedSink.onExtraCallbackWithResult())).buildUpon().encodedPath(str).build().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i3 = onPostMessage + 43;
            onUnminimized = i3 % 128;
            if (i3 % 2 != 0) {
                return string;
            }
            throw null;
        }
        Intrinsics.checkNotNullExpressionValue(Uri.parse(AFi1aSDK.onExtraCallback(this.readTypedObject, newChunkedSink.onExtraCallbackWithResult())).buildUpon().encodedPath(str).build().toString(), "");
        throw null;
    }

    public final boolean newSessionWithExtras() {
        Uri uri;
        String path;
        String strRemoveSuffix;
        int i = 2 % 2;
        int i2 = onPostMessage + 55;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            getUrl();
            throw null;
        }
        String url = getUrl();
        if (url == null || (uri = Uri.parse(url)) == null || (path = uri.getPath()) == null || (strRemoveSuffix = StringsKt__StringsKt.removeSuffix(path, (CharSequence) "/")) == null) {
            return false;
        }
        if (Intrinsics.areEqual(strRemoveSuffix, "/warm-up") || Intrinsics.areEqual(strRemoveSuffix, this.onActivityLayout.onExtraCallbackWithResult())) {
            return true;
        }
        int i3 = onUnminimized + 9;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExtraCallback(TossSecuritiesWebView tossSecuritiesWebView, ValueCallback valueCallback, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 29;
        int i4 = i3 % 128;
        onUnminimized = i4;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetWarmUp");
        }
        int i5 = i4 + 49;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            valueCallback = null;
        }
        tossSecuritiesWebView.onNavigationEvent((ValueCallback<String>) valueCallback);
        int i6 = onPostMessage + 5;
        onUnminimized = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void onNavigationEvent(@Nullable ValueCallback<String> valueCallback) {
        String str;
        int i = 2 % 2;
        int i2 = onPostMessage + 73;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackDefault = null;
        setPullToRefreshEnabled(false);
        if (newSessionWithExtras()) {
            return;
        }
        if (!Intrinsics.areEqual(this.onActivityLayout.onExtraCallbackWithResult(), "/warm-up")) {
            str = "window.__initNavigate('" + this.onActivityLayout.onExtraCallbackWithResult() + "')";
        } else {
            int i4 = onUnminimized;
            int i5 = i4 + 47;
            onPostMessage = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 39;
            onPostMessage = i7 % 128;
            int i8 = i7 % 2;
            str = "window.__initWarmUp()";
        }
        evaluateJavascript(str, valueCallback);
    }

    public final void setWarmUpCallback$TossSecuritiesNativeWebview_release(@NotNull onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onUnminimized + 77;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            this.onMessageChannelReady = onextracallback;
            int i3 = 41 / 0;
        } else {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            this.onMessageChannelReady = onextracallback;
        }
        int i4 = onPostMessage + 61;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = TossSecuritiesWebView.this.new asBinder(access13800Var);
            int i2 = onWarmupCompleted + 113;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return asbinder;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 == 0) {
                return onExtraCallback(findresandmsg2, access13800Var2);
            }
            onExtraCallback(findresandmsg2, access13800Var2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            asBinder asbinder = (asBinder) create(findresandmsg, access13800Var);
            if (i3 == 0) {
                asbinder.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = asbinder.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 29;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 123;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                access14100.onExtraCallback();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(1500L, this) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i4 = onWarmupCompleted + 75;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            TossSecuritiesWebView.this.setEngagementSignalsCallback();
            Unit unit = Unit.INSTANCE;
            int i6 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void prefetchWithMultipleUrls() {
        int i = 2 % 2;
        int i2 = onUnminimized + 39;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackDefault = getUrl();
        onExtraCallback onextracallback = this.onMessageChannelReady;
        if (onextracallback != null) {
            onextracallback.onExtraCallback();
            int i4 = onPostMessage + 31;
            onUnminimized = i4 % 128;
            int i5 = i4 % 2;
        }
        getPackageType getpackagetype = this.IAuthTabCallback;
        Object obj = null;
        if (getpackagetype != null) {
            int i6 = onPostMessage + 85;
            onUnminimized = i6 % 128;
            int i7 = i6 % 2;
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, null, 1, null);
        }
        if (this.onMessageChannelReady != null) {
            this.IAuthTabCallback = onLoadStarted.onExtraCallback(validateRelationship(), null, null, new asBinder(null), 3, null);
        }
        if (!this.writeTypedObject) {
            int i8 = onUnminimized + 123;
            onPostMessage = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            if (this.IAuthTabCallbackStub) {
                this.writeTypedObject = false;
                ICustomTabsServiceStub();
                clearHistory();
            }
        }
        if (newSession().onExtraCallbackWithResult() instanceof AFh1zSDK.onExtraCallbackWithResult) {
            return;
        }
        int i9 = onUnminimized + 75;
        onPostMessage = i9 % 128;
        int i10 = i9 % 2;
        getSupportedHighSpeedResolutionsFor<AFh1zSDK> getsupportedhighspeedresolutionsfor = this.onNavigationEvent;
        if (i10 == 0) {
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(AFh1zSDK.onNavigationEvent.onExtraCallbackWithResult);
        } else {
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(AFh1zSDK.onNavigationEvent.onExtraCallbackWithResult);
            obj.hashCode();
            throw null;
        }
    }

    public final void setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = onUnminimized + 41;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        getPackageType getpackagetype = this.IAuthTabCallback;
        if (getpackagetype != null) {
            int i5 = i3 + 25;
            onUnminimized = i5 % 128;
            int i6 = i5 % 2;
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, null, 1, null);
        }
        this.IAuthTabCallback = null;
        onExtraCallback onextracallback = this.onMessageChannelReady;
        if (onextracallback != null) {
            int i7 = onPostMessage + 67;
            onUnminimized = i7 % 128;
            if (i7 % 2 == 0) {
                onextracallback.IAuthTabCallback();
                int i8 = 60 / 0;
            } else {
                onextracallback.IAuthTabCallback();
            }
            int i9 = onPostMessage + 45;
            onUnminimized = i9 % 128;
            int i10 = i9 % 2;
        }
        this.onMessageChannelReady = null;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [android.webkit.WebView, im.toss.tosssecurities.webview.TossSecuritiesWebView] */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ?? r5 = (TossSecuritiesWebView) objArr[0];
        int i = 2 % 2;
        int i2 = onUnminimized + 47;
        onPostMessage = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor = ((TossSecuritiesWebView) r5).onWarmupCompleted;
            r5.extraCallbackWithResult();
            throw null;
        }
        ((TossSecuritiesWebView) r5).onWarmupCompleted.IAuthTabCallback(Boolean.valueOf(r5.extraCallbackWithResult() != null || getOptimalPreviewSize.IAuthTabCallback((WebView) r5)));
        int i3 = onUnminimized + 113;
        onPostMessage = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void setVisitedHistoryListener$TossSecuritiesNativeWebview_release(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 13;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        this.extraCallback = function0;
        int i5 = i2 + 87;
        onUnminimized = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void onExtraCallbackWithResult(@Nullable String str, boolean z) {
        int i = 2 % 2;
        this.IAuthTabCallbackDefault = str;
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, 116648509, zziea.IAuthTabCallback(), iIAuthTabCallback2, zziea.IAuthTabCallback(), new Object[]{this}, -116648504);
        Function0<Unit> function0 = this.extraCallback;
        if (function0 != null) {
            int i2 = onUnminimized + 1;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            function0.invoke();
            int i4 = onUnminimized + 31;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String getUrl() {
        Uri uri;
        int i = 2 % 2;
        int i2 = onUnminimized + 85;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        String url = super/*android.webkit.WebView*/.getUrl();
        getSupportedHighSpeedResolutionsFor<Uri> getsupportedhighspeedresolutionsfor = this.onExtraCallbackWithResult;
        if (url != null) {
            int i4 = onUnminimized + 37;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            uri = Uri.parse(url);
            int i6 = onUnminimized + 125;
            onPostMessage = i6 % 128;
            int i7 = i6 % 2;
        } else {
            uri = null;
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(uri);
        int i8 = onUnminimized + 3;
        onPostMessage = i8 % 128;
        int i9 = i8 % 2;
        return url;
    }

    static final class getInterfaceDescriptor extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ String $script;
        int I$0;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        getInterfaceDescriptor(String str, access13800<? super getInterfaceDescriptor> access13800Var) {
            super(2, access13800Var);
            this.$script = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            getInterfaceDescriptor getinterfacedescriptor = TossSecuritiesWebView.this.new getInterfaceDescriptor(this.$script, access13800Var);
            int i2 = IAuthTabCallback + 45;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return getinterfacedescriptor;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super String> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i4 = IAuthTabCallback + 31;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super String> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((getInterfaceDescriptor) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 55;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        static final class IAuthTabCallback<T> implements ValueCallback {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            final /* synthetic */ maybeRemoveAttachStateListener<String> onExtraCallback;

            /* JADX WARN: Multi-variable type inference failed */
            IAuthTabCallback(maybeRemoveAttachStateListener<? super String> mayberemoveattachstatelistener) {
                this.onExtraCallback = mayberemoveattachstatelistener;
            }

            @Override // android.webkit.ValueCallback
            public /* synthetic */ void onReceiveValue(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 83;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback((String) obj);
                if (i3 != 0) {
                    throw null;
                }
                int i4 = onNavigationEvent + 67;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }

            public final void IAuthTabCallback(String str) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 1;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    maybeRemoveAttachStateListener<String> mayberemoveattachstatelistener = this.onExtraCallback;
                    Result.Companion companion = Result.Companion;
                    mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(str));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                maybeRemoveAttachStateListener<String> mayberemoveattachstatelistener2 = this.onExtraCallback;
                Result.Companion companion2 = Result.Companion;
                mayberemoveattachstatelistener2.resumeWith(Result.m31constructorimpl(str));
                int i3 = onNavigationEvent + 85;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 66 / 0;
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = onExtraCallback + 89;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            TossSecuritiesWebView tossSecuritiesWebView = TossSecuritiesWebView.this;
            String str = this.$script;
            this.L$0 = tossSecuritiesWebView;
            this.L$1 = str;
            this.I$0 = 0;
            this.label = 1;
            setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(this), 1);
            setresourceinternal.onTransact();
            tossSecuritiesWebView.evaluateJavascript(str, new IAuthTabCallback(setresourceinternal));
            Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
            if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
                int i5 = onExtraCallback + 7;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                access14600.IAuthTabCallback(this);
                if (i6 == 0) {
                    int i7 = 15 / 0;
                }
            }
            if (objIAuthTabCallbackDefault == objOnExtraCallback) {
                int i8 = IAuthTabCallback + 55;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 69 / 0;
                }
                return objOnExtraCallback;
            }
            int i10 = onExtraCallback + 83;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 != 0) {
                return objIAuthTabCallbackDefault;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(String str, String str2, access13800<? super String> access13800Var) throws Exception {
        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy;
        int i = 2 % 2;
        int i2 = onUnminimized + 47;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        if (access13800Var instanceof IAuthTabCallbackStubProxy) {
            int i5 = i3 + 103;
            onUnminimized = i5 % 128;
            int i6 = i5 % 2;
            iAuthTabCallbackStubProxy = (IAuthTabCallbackStubProxy) access13800Var;
            int i7 = iAuthTabCallbackStubProxy.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallbackStubProxy.label = i7 - 2147483648;
            } else {
                iAuthTabCallbackStubProxy = new IAuthTabCallbackStubProxy(access13800Var);
            }
        }
        Object objOnNavigationEvent = iAuthTabCallbackStubProxy.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i8 = iAuthTabCallbackStubProxy.label;
        try {
            if (i8 == 0) {
                ResultKt.onNavigationEvent(objOnNavigationEvent);
                getInterfaceDescriptor getinterfacedescriptor = new getInterfaceDescriptor(str, null);
                iAuthTabCallbackStubProxy.L$0 = str;
                iAuthTabCallbackStubProxy.L$1 = str2;
                iAuthTabCallbackStubProxy.label = 1;
                objOnNavigationEvent = doGet.onNavigationEvent(3000L, getinterfacedescriptor, iAuthTabCallbackStubProxy);
                if (objOnNavigationEvent == objOnExtraCallback) {
                    int i9 = onUnminimized + 79;
                    onPostMessage = i9 % 128;
                    int i10 = i9 % 2;
                    return objOnExtraCallback;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = onUnminimized + 123;
                onPostMessage = i11 % 128;
                if (i11 % 2 != 0) {
                    str2 = (String) iAuthTabCallbackStubProxy.L$1;
                    str = (String) iAuthTabCallbackStubProxy.L$0;
                    ResultKt.onNavigationEvent(objOnNavigationEvent);
                    int i12 = 68 / 0;
                } else {
                    str2 = (String) iAuthTabCallbackStubProxy.L$1;
                    str = (String) iAuthTabCallbackStubProxy.L$0;
                    ResultKt.onNavigationEvent(objOnNavigationEvent);
                }
            }
            return (String) objOnNavigationEvent;
        } catch (Exception e) {
            onExtraCallback(e, str, str2);
            return null;
        }
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ String $promiseScript;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ TossSecuritiesWebView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback_Parcel(String str, TossSecuritiesWebView tossSecuritiesWebView, access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(2, access13800Var);
            this.$promiseScript = str;
            this.this$0 = tossSecuritiesWebView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = new IAuthTabCallback_Parcel(this.$promiseScript, this.this$0, access13800Var);
            int i2 = onWarmupCompleted + 79;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback_Parcel;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i4 = onWarmupCompleted + 55;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = (IAuthTabCallback_Parcel) create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return iAuthTabCallback_Parcel.invokeSuspend(unit);
            }
            iAuthTabCallback_Parcel.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static final class onExtraCallbackWithResult implements Function1<Throwable, Unit> {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ TossSecuritiesWebView IAuthTabCallback;

            onExtraCallbackWithResult(TossSecuritiesWebView tossSecuritiesWebView) {
                this.IAuthTabCallback = tossSecuritiesWebView;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(Throwable th) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 25;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted(th);
                if (i3 != 0) {
                    return Unit.INSTANCE;
                }
                Unit unit = Unit.INSTANCE;
                throw null;
            }

            public final void onWarmupCompleted(Throwable th) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 45;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    TossSecuritiesWebView.IAuthTabCallback(this.IAuthTabCallback, null);
                } else {
                    TossSecuritiesWebView.IAuthTabCallback(this.IAuthTabCallback, null);
                    throw null;
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = onWarmupCompleted + 81;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            String str = this.$promiseScript;
            TossSecuritiesWebView tossSecuritiesWebView = this.this$0;
            this.L$0 = str;
            this.L$1 = tossSecuritiesWebView;
            this.I$0 = 0;
            this.label = 1;
            setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(this), 1);
            setresourceinternal.onTransact();
            String strTrimIndent = StringsKt__IndentKt.trimIndent("\n                    " + str + ".then(\n                        () => {\n                            TossSecWebView.onResolved();\n                        }\n                    ).catch(\n                        (e) => {\n                            TossSecWebView.onRejected(e ? e.message || String(e) : 'Unknown error');\n                        }\n                    )\n                    ");
            TossSecuritiesWebView.Companion.onWarmupCompleted();
            TossSecuritiesWebView.IAuthTabCallback(tossSecuritiesWebView, setresourceinternal);
            tossSecuritiesWebView.evaluateJavascript(strTrimIndent, (ValueCallback) null);
            setresourceinternal.IAuthTabCallback((Function1<? super Throwable, Unit>) new onExtraCallbackWithResult(tossSecuritiesWebView));
            Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
            if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
                access14600.IAuthTabCallback(this);
            }
            if (objIAuthTabCallbackDefault != objOnExtraCallback) {
                return objIAuthTabCallbackDefault;
            }
            int i5 = onWarmupCompleted + 69;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return objOnExtraCallback;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asBinder(Object[] objArr) {
        access100 access100Var;
        TossSecuritiesWebView tossSecuritiesWebView = (TossSecuritiesWebView) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        access13800 access13800Var = (access13800) objArr[3];
        int i = 2 % 2;
        int i2 = onPostMessage + 105;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof access100) {
            access100Var = (access100) access13800Var;
            int i4 = access100Var.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = onPostMessage + 95;
                onUnminimized = i5 % 128;
                if (i5 % 2 == 0) {
                    access100Var.label = i4 / Integer.MIN_VALUE;
                } else {
                    access100Var.label = i4 - 2147483648;
                }
                int i6 = onUnminimized + 43;
                onPostMessage = i6 % 128;
                int i7 = i6 % 2;
            } else {
                access100Var = tossSecuritiesWebView.new access100(access13800Var);
            }
        }
        Object objOnNavigationEvent = access100Var.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i8 = access100Var.label;
        try {
            if (i8 != 0) {
                int i9 = onPostMessage + 11;
                onUnminimized = i9 % 128;
                if (i9 % 2 != 0 ? i8 != 1 : i8 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) access100Var.L$1;
                str = (String) access100Var.L$0;
                ResultKt.onNavigationEvent(objOnNavigationEvent);
            } else {
                ResultKt.onNavigationEvent(objOnNavigationEvent);
                Object obj = null;
                IAuthTabCallback_Parcel iAuthTabCallback_Parcel = new IAuthTabCallback_Parcel(str, tossSecuritiesWebView, null);
                access100Var.L$0 = str;
                access100Var.L$1 = str2;
                access100Var.label = 1;
                objOnNavigationEvent = doGet.onNavigationEvent(3000L, iAuthTabCallback_Parcel, access100Var);
                if (objOnNavigationEvent == objOnExtraCallback) {
                    int i10 = onPostMessage + 41;
                    onUnminimized = i10 % 128;
                    if (i10 % 2 != 0) {
                        return objOnExtraCallback;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
            return (Boolean) objOnNavigationEvent;
        } catch (Exception e) {
            return access14000.onNavigationEvent(tossSecuritiesWebView.onExtraCallback(e, str, str2));
        }
    }

    private final boolean onExtraCallback(Exception exc, String str, String str2) throws Exception {
        int i = 2 % 2;
        int i2 = onUnminimized + 101;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        exc.getMessage();
        boolean z = exc instanceof WebResourceResponseModel;
        if (!z && (exc instanceof CancellationException)) {
            this.IAuthTabCallbackDefault = str2;
            throw exc;
        }
        if (z) {
            onExtraCallbackWithResult("js_timeout");
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            int iIAuthTabCallback2 = zziea.IAuthTabCallback();
            onNavigationEvent(iIAuthTabCallback, -604472806, zziea.IAuthTabCallback(), iIAuthTabCallback2, zziea.IAuthTabCallback(), new Object[]{this, str, str2}, 604472806);
        }
        AFd1mSDK.onExtraCallbackWithResult("WebView", exc, access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("content", "Navigate no responded"), getWrite.IAuthTabCallback("promise", str), getWrite.IAuthTabCallback("_webview_id", readTypedObject())), false, (Function1) null, 24, (Object) null);
        int i4 = onPostMessage + 111;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TossSecuritiesWebView tossSecuritiesWebView = (TossSecuritiesWebView) objArr[0];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 31;
        onUnminimized = i3 % 128;
        if (i3 % 2 != 0) {
            getPackageType getpackagetype = tossSecuritiesWebView.getInterfaceDescriptor;
            if (getpackagetype != null) {
                int i4 = i2 + 37;
                onUnminimized = i4 % 128;
                int i5 = i4 % 2;
                if (getpackagetype.onExtraCallback()) {
                    return null;
                }
            }
            tossSecuritiesWebView.getInterfaceDescriptor = onLoadStarted.onExtraCallback(tossSecuritiesWebView.validateRelationship(), tossSecuritiesWebView.asInterface, null, tossSecuritiesWebView.new onExtraCallbackWithResult(str, null), 2, null);
            return null;
        }
        getPackageType getpackagetype2 = tossSecuritiesWebView.getInterfaceDescriptor;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public void onResolved() {
        int i = 2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        zzbc.IAuthTabCallback(context).runOnUiThread(new TossSecuritiesWebView$.ExternalSyntheticLambda0(this));
        int i2 = onUnminimized + 43;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onWarmupCompleted(TossSecuritiesWebView tossSecuritiesWebView) {
        int i = 2 % 2;
        tossSecuritiesWebView.getUrl();
        access13800<? super Boolean> access13800Var = tossSecuritiesWebView.access100;
        if (access13800Var != null) {
            int i2 = onUnminimized + 125;
            onPostMessage = i2 % 128;
            if (i2 % 2 != 0) {
                Result.Companion companion = Result.Companion;
                access13800Var.resumeWith(Result.m31constructorimpl(Boolean.TRUE));
                int i3 = 32 / 0;
            } else {
                Result.Companion companion2 = Result.Companion;
                access13800Var.resumeWith(Result.m31constructorimpl(Boolean.TRUE));
            }
            int i4 = onPostMessage + 31;
            onUnminimized = i4 % 128;
            int i5 = i4 % 2;
        }
        tossSecuritiesWebView.access100 = null;
        PermissionUtil.IAuthTabCallback(tossSecuritiesWebView, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public void onRejected(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        zzbc.IAuthTabCallback(context).runOnUiThread(new TossSecuritiesWebView$.ExternalSyntheticLambda1(this, str));
        int i2 = onUnminimized + 113;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallbackWithResult(TossSecuritiesWebView tossSecuritiesWebView, String str) throws Throwable {
        int i = 2 % 2;
        tossSecuritiesWebView.getUrl();
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("content", "Navigate rejected");
        Object[] objArr = new Object[1];
        d(new char[]{53827, 51506, 35530, 53814, 136, 58824, 54198}, Color.rgb(0, 0, 0) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, objArr);
        AFd1mSDK.onExtraCallbackWithResult("WebView", (Throwable) null, access8000.IAuthTabCallbackStub(pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), tossSecuritiesWebView.getUrl()), getWrite.IAuthTabCallback("error", str)), false, (Function1) null, 24, (Object) null);
        access13800<? super Boolean> access13800Var = tossSecuritiesWebView.access100;
        if (access13800Var != null) {
            int i2 = onUnminimized + 15;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            Result.Companion companion = Result.Companion;
            access13800Var.resumeWith(Result.m31constructorimpl(Boolean.FALSE));
            int i4 = onUnminimized + 91;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
        }
        tossSecuritiesWebView.access100 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void receiveFile() {
        int i = 2 % 2;
        int i2 = onPostMessage + 83;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.IAuthTabCallback(AFh1zSDK.onExtraCallback.onExtraCallbackWithResult);
        reload();
        int i4 = onUnminimized + 13;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final boolean onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = onUnminimized + 101;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"service.tossinvest.com", "service-alpha.tossinvest.com", "mts.tossinvest.com", "mts-alpha.tossinvest.com"});
        if ((listListOf instanceof Collection) && listListOf.isEmpty()) {
            return false;
        }
        Iterator it = listListOf.iterator();
        int i4 = onPostMessage + 11;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            int i6 = onPostMessage + 109;
            onUnminimized = i6 % 128;
            if (i6 % 2 == 0) {
                if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) it.next(), true, 4, (Object) null)) {
                    return true;
                }
            } else if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) it.next(), false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TossSecuritiesWebView tossSecuritiesWebView = (TossSecuritiesWebView) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!((Boolean) new Function1() { // from class: im.toss.tosssecurities.webview.TossSecuritiesWebView$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 33;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                boolean zOnWarmupCompleted = TossSecuritiesWebView.onWarmupCompleted((String) obj);
                if (i4 == 0) {
                    Boolean.valueOf(zOnWarmupCompleted);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Boolean boolValueOf = Boolean.valueOf(zOnWarmupCompleted);
                int i5 = IAuthTabCallback + 51;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return boolValueOf;
            }
        }.invoke(str2)).booleanValue()) {
            int i2 = onUnminimized + 29;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (iIntValue != -12 && iIntValue != -11 && iIntValue != -9) {
            int i4 = onPostMessage + 119;
            onUnminimized = i4 % 128;
            int i5 = i4 % 2;
            if (iIntValue != -8 && iIntValue != -6 && iIntValue != -2) {
                return false;
            }
        }
        tossSecuritiesWebView.onNavigationEvent.IAuthTabCallback(new AFh1zSDK.onExtraCallbackWithResult(iIntValue, str, str2));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onExtraCallback(@NotNull WebResourceRequest webResourceRequest, @NotNull WebResourceResponse webResourceResponse) {
        int i = 2 % 2;
        int i2 = onUnminimized + 29;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(webResourceRequest, "");
            Intrinsics.checkNotNullParameter(webResourceResponse, "");
            int i3 = 40 / 0;
            if (webResourceRequest.isForMainFrame()) {
                int statusCode = webResourceResponse.getStatusCode();
                if ((500 <= statusCode && statusCode < 600) || !Intrinsics.areEqual(webResourceResponse.getMimeType(), "text/html")) {
                    getSupportedHighSpeedResolutionsFor<AFh1zSDK> getsupportedhighspeedresolutionsfor = this.onNavigationEvent;
                    int statusCode2 = webResourceResponse.getStatusCode();
                    String reasonPhrase = webResourceResponse.getReasonPhrase();
                    Intrinsics.checkNotNullExpressionValue(reasonPhrase, "");
                    String string = webResourceRequest.getUrl().toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    getsupportedhighspeedresolutionsfor.IAuthTabCallback(new AFh1zSDK.onExtraCallbackWithResult(statusCode2, reasonPhrase, string));
                    int i4 = onPostMessage + 97;
                    onUnminimized = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(webResourceRequest, "");
            Intrinsics.checkNotNullParameter(webResourceResponse, "");
            if (webResourceRequest.isForMainFrame()) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, im.toss.tosssecurities.webview.TossSecuritiesWebView, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onTransact(Object[] objArr) {
        ?? r2 = (TossSecuritiesWebView) objArr[0];
        ViewGroup viewGroup = (ViewGroup) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = onPostMessage + 15;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            int i3 = 75 / 0;
            if (r2.getParent() == null) {
                viewGroup.addView((View) r2, r2.updateVisuals());
                if (zBooleanValue) {
                    int iIAuthTabCallback = zziea.IAuthTabCallback();
                    int iIAuthTabCallback2 = zziea.IAuthTabCallback();
                    onNavigationEvent(iIAuthTabCallback, -1855222746, zziea.IAuthTabCallback(), iIAuthTabCallback2, zziea.IAuthTabCallback(), new Object[]{r2, false, 1, null}, 1855222747);
                    return null;
                }
            } else if (!Intrinsics.areEqual(r2.getParent(), viewGroup)) {
                ViewParent parent = r2.getParent();
                Intrinsics.checkNotNull(parent, "");
                ((ViewGroup) parent).removeView(r2);
                viewGroup.addView((View) r2, r2.updateVisuals());
                if (!(true ^ zBooleanValue)) {
                    int i4 = onUnminimized + 37;
                    onPostMessage = i4 % 128;
                    int i5 = i4 % 2;
                    int iIAuthTabCallback3 = zziea.IAuthTabCallback();
                    int iIAuthTabCallback4 = zziea.IAuthTabCallback();
                    onNavigationEvent(iIAuthTabCallback3, -1855222746, zziea.IAuthTabCallback(), iIAuthTabCallback4, zziea.IAuthTabCallback(), new Object[]{r2, false, 1, null}, 1855222747);
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            if (r2.getParent() == null) {
            }
        }
        int i6 = onPostMessage + 113;
        onUnminimized = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 39 / 0;
        }
        return null;
    }

    public final void requestPostMessageChannelWithExtras() {
        int i = 2 % 2;
        int i2 = onPostMessage + 107;
        onUnminimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.ICustomTabsCallback = System.currentTimeMillis();
            obj.hashCode();
            throw null;
        }
        this.ICustomTabsCallback = System.currentTimeMillis();
        int i3 = onPostMessage + 3;
        onUnminimized = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private final ViewGroup.LayoutParams updateVisuals() {
        int i = 2 % 2;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        int i2 = onPostMessage + 35;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        return layoutParams;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        public static final IAuthTabCallback Companion;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final onWarmupCompleted FINTECH = new onWarmupCompleted("FINTECH", 0);
        public static final onWarmupCompleted MICRO_MTS = new onWarmupCompleted("MICRO_MTS", 1);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = {FINTECH, MICRO_MTS};
            int i5 = i3 + 5;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 38 / 0;
            }
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i4 = i3 + 87;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            if (i3 != 0) {
                throw null;
            }
            int i4 = onExtraCallbackWithResult + 69;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 95;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onwarmupcompletedArr;
            }
            throw null;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            Companion = new IAuthTabCallback(null);
            int i = IAuthTabCallback + 27;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public static final class IAuthTabCallback {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private IAuthTabCallback() {
            }

            public final onWarmupCompleted onExtraCallbackWithResult(@NotNull String str) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                String lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (Intrinsics.areEqual(lowerCase, "service")) {
                    int i2 = onWarmupCompleted + 29;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        return onWarmupCompleted.FINTECH;
                    }
                    onWarmupCompleted onwarmupcompleted = onWarmupCompleted.FINTECH;
                    throw null;
                }
                if (Intrinsics.areEqual(lowerCase, "mts")) {
                    return onWarmupCompleted.MICRO_MTS;
                }
                int i3 = onWarmupCompleted + 19;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 96 / 0;
                }
                return null;
            }
        }
    }

    public static final class onNavigationEvent {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final AppSetIdAndScope1 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AppSetIdAndScope1 appSetIdAndScope1OnWarmupCompleted = TossSecuritiesWebView.onWarmupCompleted();
            int i4 = onExtraCallback + 103;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 0;
            }
            return appSetIdAndScope1OnWarmupCompleted;
        }
    }

    static {
        requestPostMessageChannel();
        Companion = new onNavigationEvent(null);
        onExtraCallback = ea10.onExtraCallbackWithResult("TossSecWebView");
        int i = ICustomTabsCallbackDefault + 67;
        onRelationshipValidationResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final boolean extraCommand() {
        int i = 2 % 2;
        int i2 = onUnminimized + 77;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.extraCallbackWithResult.onExtraCallbackWithResult()).booleanValue();
        int i4 = onUnminimized + 13;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return zBooleanValue;
    }

    public final void setPullToRefreshEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = onPostMessage + 123;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            this.extraCallbackWithResult.IAuthTabCallback(Boolean.valueOf(z));
            int i3 = onUnminimized + 75;
            onPostMessage = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 28 / 0;
                return;
            }
            return;
        }
        this.extraCallbackWithResult.IAuthTabCallback(Boolean.valueOf(z));
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void asBinder(boolean z) {
        int i = 2 % 2;
        int i2 = onUnminimized + 93;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        if (!isAttachedToWindow()) {
            addOnAttachStateChangeListener(new IAuthTabCallbackDefault(this, z, this));
            int i4 = onUnminimized + 43;
            onPostMessage = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 13 / 0;
                return;
            }
            return;
        }
        if (z) {
            int i6 = onUnminimized + 91;
            onPostMessage = i6 % 128;
            if (i6 % 2 == 0) {
                onResume();
            } else {
                onResume();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        scrollBy(0, 1);
    }

    public static final /* synthetic */ Object onExtraCallback(TossSecuritiesWebView tossSecuritiesWebView, String str, String str2, access13800 access13800Var) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        return onNavigationEvent(iIAuthTabCallback, 944475558, zziea.IAuthTabCallback(), iIAuthTabCallback2, zziea.IAuthTabCallback(), new Object[]{tossSecuritiesWebView, str, str2, access13800Var}, -944475551);
    }

    private final void onExtraCallbackWithResult(String str, String str2) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, -604472806, zziea.IAuthTabCallback(), iIAuthTabCallback2, zziea.IAuthTabCallback(), new Object[]{this, str, str2}, 604472806);
    }

    private final void onExtraCallbackWithResult(Uri uri, String str) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, 1472733121, zziea.IAuthTabCallback(), iIAuthTabCallback2, zziea.IAuthTabCallback(), new Object[]{this, uri, str}, -1472733119);
    }

    static /* synthetic */ void onExtraCallback(TossSecuritiesWebView tossSecuritiesWebView, Uri uri, String str, int i, Object obj) {
        Object[] objArr = {tossSecuritiesWebView, uri, str, Integer.valueOf(i), obj};
        onNavigationEvent(zziea.IAuthTabCallback(), -1476364332, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), objArr, 1476364335);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TossSecuritiesWebView tossSecuritiesWebView, boolean z, int i, Object obj) {
        Object[] objArr = {tossSecuritiesWebView, Boolean.valueOf(z), Integer.valueOf(i), obj};
        onNavigationEvent(zziea.IAuthTabCallback(), -1855222746, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), objArr, 1855222747);
    }

    private final Object onExtraCallbackWithResult(String str, String str2, access13800<? super Boolean> access13800Var) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        return onNavigationEvent(iIAuthTabCallback, 771496448, zziea.IAuthTabCallback(), iIAuthTabCallback2, zziea.IAuthTabCallback(), new Object[]{this, str, str2, access13800Var}, -771496440);
    }

    public final void onExtraCallback(@NotNull ViewGroup viewGroup, boolean z) {
        Object[] objArr = {this, viewGroup, Boolean.valueOf(z)};
        onNavigationEvent(zziea.IAuthTabCallback(), -416369150, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), objArr, 416369159);
    }

    public final void ICustomTabsCallbackStubProxy() {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, 116648509, zziea.IAuthTabCallback(), iIAuthTabCallback2, zziea.IAuthTabCallback(), new Object[]{this}, -116648504);
    }

    public final long isEngagementSignalsApiAvailable() {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        return ((Long) onNavigationEvent(iIAuthTabCallback, -774193604, zziea.IAuthTabCallback(), iIAuthTabCallback2, zziea.IAuthTabCallback(), new Object[]{this}, 774193610)).longValue();
    }

    public final boolean onWarmupCompleted(int i, @NotNull String str, @NotNull String str2) {
        Object[] objArr = {this, Integer.valueOf(i), str, str2};
        return ((Boolean) onNavigationEvent(zziea.IAuthTabCallback(), -1671939869, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), objArr, 1671939873)).booleanValue();
    }

    static void requestPostMessageChannel() {
        onActivityResized = -7235838091864221820L;
    }
}
