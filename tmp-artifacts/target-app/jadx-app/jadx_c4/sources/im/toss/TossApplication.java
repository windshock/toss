package im.toss;

import android.app.Activity;
import android.app.Application;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Display;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.airbnb.lottie.LottieAnimationView;
import com.bugsnag.android.BugsnagExitInfoPlugin;
import com.bugsnag.android.Configuration;
import com.bugsnag.android.Event;
import com.bugsnag.android.ExitInfoPluginConfiguration;
import com.bugsnag.android.OnErrorCallback;
import com.google.android.gms.internal.ads.zzgc;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.skt.usp.UCPApiConstants;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import dagger.Lazy;
import gatewayprotocol.v1.AdResponseKtKt;
import im.toss.TossApplication;
import im.toss.TossApplication$onPostInitMainProcess$1$1$;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0;
import im.toss.core.tracker.RemoteProcessLogIngressStore;
import im.toss.core.tracker.payload.DomainLogPayload;
import im.toss.core.webkit.TossBridgeWebView;
import im.toss.deeplink.annotation.DeepLinkRoot;
import im.toss.features.leave.ui.remainingbalance.selectaccount.ComposableSingletons$SelectAccountScreenKt$;
import im.toss.features.teens.transportation.tmoney.mobile.MobileTmoneyService;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.infra.foundation.api.ktx.ResultsKt;
import im.toss.network.throwable.TossApiCallException;
import im.toss.realmdb.RealmDbManager;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.rn.toss.core.common.process.RnProcessRuntime;
import im.toss.rn.toss.core.common.process.RnRemoteProcessWebViewDataDirectory;
import im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleFileManager;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;
import io.reactivex.android.plugins.RxAndroidPlugins;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.File;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import javax.inject.Inject;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AFj1mSDKExternalSyntheticLambda1;
import o.AFj1qSDKExternalSyntheticLambda0;
import o.AFj1rSDK;
import o.ALCAntiSpoofingFaceQuality;
import o.ALCFaceSDK4ExternalSyntheticLambda1;
import o.ALCFaceSDKExternalSyntheticLambda5;
import o.AsyncImagePainterExternalSyntheticLambda0;
import o.AttributeCertificate;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CacheControlBuilder;
import o.CloseableUtils;
import o.CommonModule_setSecureScreen;
import o.ComputeDistance;
import o.ComputeDistances;
import o.ConstraintsSizeResolverExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.Cookies_set;
import o.DERSet;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.DetectClosedEyes;
import o.DetectFaceInSingleImage;
import o.EncodedDataImplExternalSyntheticLambda0;
import o.GeckoHubImp1;
import o.GetFeatureExtension;
import o.GetInputImageFromPathAsGrayScale;
import o.GetInputImageFromPathAsUnchanged;
import o.GriverDecodeUrl21;
import o.GriverEmbedWebViewJsApiPermissionProxyImpl1;
import o.GuardedAsyncTask;
import o.GyrShakeHelper;
import o.ITrustedWebActivityCallbackStubProxy;
import o.InstallReferrerClientBuilder;
import o.InterfaceC0059deInitialize;
import o.JSApplicationIllegalArgumentException;
import o.LongPressTextDragObserverKtExternalSyntheticLambda0;
import o.ManagedRetainedValuesStoreKtExternalSyntheticLambda0;
import o.MapConverter;
import o.MaxAdViewImplExternalSyntheticLambda3;
import o.MessageQueueThreadImplCompanionExternalSyntheticLambda0;
import o.NameOrPseudonym;
import o.NetConverter3;
import o.PageExitListener;
import o.PlayerErrorCode;
import o.ProductDetailsPricingPhase;
import o.Q0;
import o.RealDrawScopeSizeResolversizeinlinedmapNotNull121;
import o.RememberLottieCompositionKtloadFontsFromAssets2;
import o.ResourceResolutionException;
import o.Response;
import o.RetrofitService;
import o.RootForTestUncaughtExceptionHandler;
import o.RxDownloaderDownloadStatusReceiver;
import o.SessionTrackerb;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextLinkScopeExternalSyntheticLambda3;
import o.TextRoundCornerProgressBarSavedState1;
import o.TooltipKtExternalSyntheticLambda1;
import o.TopAppBarStateExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.UST_CERT_GetSubjectDN;
import o.UST_CERT_GetSubjectKeyIdentifier;
import o.UST_CERT_GetVIDRandomWithPrikey;
import o.UST_CERT_PKCS8PrikeyInfo;
import o.UST_CERT_SetTrustRootCACert;
import o.UserChoiceBillingListener;
import o.UtilsKtExternalSyntheticLambda11;
import o.WebResourceResponseModel;
import o.WrappedCompositionsetContent1ExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access3802;
import o.access3902;
import o.access8100;
import o.addMetadata;
import o.addPolicy;
import o.alignTextProgressInsideProgress;
import o.applyTransparentTitle;
import o.auth;
import o.bd;
import o.calculateMaxTextSize;
import o.castToShort;
import o.checkValidPitchUnder;
import o.clearFaultAdjacentMetadata;
import o.clearTid;
import o.copyFile;
import o.deprecated_priorResponse;
import o.deserializeFloat;
import o.deserializeIntNullableCollection;
import o.deserializeUriNullableCollection;
import o.drawTextProgressColor;
import o.enableAndroidLinearText;
import o.enableDoubleMeasurementFixAndroid;
import o.enableEagerRootViewAttachment;
import o.enableImagePrefetchingAndroid;
import o.endDrag;
import o.findRes;
import o.findResAndMsg;
import o.finishFromSdk;
import o.generateLink;
import o.getAdSizeApi;
import o.getAppEnteredForegroundTimeMillis;
import o.getAssetInfo;
import o.getBizCode;
import o.getBorderRadius;
import o.getBreadcrumbs;
import o.getClientWidth;
import o.getIconPaddingTop;
import o.getNativeModulesQueueThreadSpec;
import o.getPackageType;
import o.getPivotX;
import o.getPluginName;
import o.getPricingPhaseList;
import o.getSeverityReasonbugsnag_android_core_release;
import o.getShine;
import o.getTextProgressSize;
import o.getTrimPathOffset;
import o.getTrimPathStart;
import o.getUnhandled;
import o.getWrite;
import o.getWriteSuccessCountokhttp;
import o.initLayout;
import o.initView;
import o.isBlockMonitorEnable;
import o.isBluetoothEnabled;
import o.isDoNotSellSet;
import o.isJacksonCreator;
import o.isNeedUnzip;
import o.ka;
import o.maybeUpdateAnimatable;
import o.newCall;
import o.onAccuracyChanged;
import o.onDisappear;
import o.onInterstitialAdDisplayFailed;
import o.onNativeCrash;
import o.onResponse;
import o.onTextViewSizeChanged;
import o.onTraceStopped;
import o.onViewDraw;
import o.putChannelInfo;
import o.r8lambdaF7l2UkPdwiCLhfrtCKGQ5JqM;
import o.r8lambdaHDAe14RP_YfkbgNStt68qt10Iow;
import o.r8lambdaJvNhqeMSZnDqkobDnvayz6SKORQ;
import o.r8lambdatmbWHEMtRtNT1964wjUkbDe9TEQ;
import o.r8lambdau761TBYkUBsjAjCwmNCBjUIxcpI;
import o.r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs;
import o.registerStatusListener;
import o.setAdUnitIds;
import o.setCommandLine;
import o.setCommonNetworkProxy;
import o.setFillAlpha;
import o.setFillColor;
import o.setJSBundleLoader;
import o.setJSExceptionHandler;
import o.setJSExecutor;
import o.setLargePhotoHeight;
import o.setLayoutConstraintsNative;
import o.setLogBuffers;
import o.setRandomHost;
import o.setRevision;
import o.setSegmentCollection;
import o.setStrokeAlpha;
import o.setTextProgressColor;
import o.setTopGuideFontStyle;
import o.setTopGuideText;
import o.setUsed;
import o.trackCheckout;
import o.wie2;
import o.y1f;
import o.zzad;
import o.zzag;
import o.zzao;
import o.zzat;
import o.zzav;
import o.zzax;
import o.zzbk;
import o.zzdd;
import okhttp3.OkHttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.ads.RedirectionLogFlushEntryPoint;
import viva.republica.toss.ads.RedirectionLogFlushScheduler;
import viva.republica.toss.core.AppStateManager;
import viva.republica.toss.main.more.DisplaySettingActivity;
import viva.republica.toss.pedometer.PedometerService;

@DeepLinkRoot
/* loaded from: /tmp/toss_alldex/classes4.dex */
public class TossApplication extends RememberLottieCompositionKtloadFontsFromAssets2 implements TooltipKtExternalSyntheticLambda1.onNavigationEvent, zzax, WrappedCompositionsetContent1ExternalSyntheticLambda0 {
    private int IAuthTabCallback;
    private final ITrustedWebActivityCallbackDefault IAuthTabCallbackDefault;
    private final ITrustedWebActivityCallback IAuthTabCallbackStub;

    @Inject
    public Object appGuard;

    @Inject
    public Lazy<drawTextProgressColor> appLaunchTracer;

    @Inject
    public Lazy<bd> appLaunchTtidLogger;

    @Inject
    public Lazy<isBluetoothEnabled> appLockChecker;

    @Inject
    public Lazy<setUsed> appWidgetProvider;

    @Inject
    public Lazy<copyFile> appsFlyerManager;

    @Inject
    public Lazy<Application.ActivityLifecycleCallbacks> appsInTossLifecycleCallback;
    private final findResAndMsg asBinder;
    private Locale asInterface;

    @Inject
    public Lazy<isJacksonCreator> authUiConfig;

    @Inject
    public Lazy<onAccuracyChanged> badNotificationCrashRecorder;

    @Inject
    public Lazy<Object> debugOverlayStarter;

    @Inject
    public Lazy<ALCFaceSDK4ExternalSyntheticLambda1> debugTubaVarsV1Source;

    @Inject
    public zzad environments;

    @Inject
    public wie2 json;

    @Inject
    public Lazy<setLargePhotoHeight> kakaoLoginInterface;

    @Inject
    public Lazy<ALCFaceSDK4ExternalSyntheticLambda1> localTubaVarsV1Source;

    @Inject
    public Lazy<GetInputImageFromPathAsGrayScale> logCentreFetcher;

    @Inject
    public Lazy<Map<String, ComputeDistances>> logStoreProviders;

    @Inject
    public Lazy<setAdUnitIds> loginStatus;

    @Inject
    public Lazy<getBizCode> loginTokenShortcutRepository;

    @Inject
    public Lazy<setCommonNetworkProxy> loginTokenStore;

    @Inject
    public Lazy<setSegmentCollection> loginUtil;

    @Inject
    public Lazy<r8lambdau761TBYkUBsjAjCwmNCBjUIxcpI> monoHermesFlagSessionObserver;

    @Inject
    public Lazy<ProductDetailsPricingPhase> multiLanguageResourceManager;

    @Inject
    public Lazy<trackCheckout> notificationHelper;
    private final boolean onExtraCallback;
    private volatile boolean onNavigationEvent;
    private final getBorderRadius<Activity> onTransact;
    private final ResourceResolutionException onWarmupCompleted;

    @Inject
    public Lazy<TextRoundCornerProgressBarSavedState1> oneClickLoginPrefs;

    @Inject
    public Lazy<registerStatusListener> overseasPaymentNotificationManager;

    @Inject
    public Lazy<DetectFaceInSingleImage> paramMapBuilder;

    @Inject
    public Lazy<onInterstitialAdDisplayFailed> portalRuntime;

    @Inject
    public Lazy<ReactBundleFileManager> reactBundleFileManager;

    @Inject
    public Lazy<MaxAdViewImplExternalSyntheticLambda3> reactInitializer;

    @Inject
    public Lazy<RealmDbManager> realmDbManager;

    @Inject
    public Lazy<initLayout> sdkConsentGate;

    @Inject
    public Lazy<initView> sdkConsentGatekeeper;

    @Inject
    public Lazy<AFj1mSDKExternalSyntheticLambda1> sdkConsentServerSync;

    @Inject
    public Lazy<AsyncImagePainterExternalSyntheticLambda0> seedKey;

    @Inject
    public Lazy<GriverDecodeUrl21> serviceGator;

    @Inject
    public Lazy<Q0> sessionStateManager;

    @Inject
    public Lazy<GriverEmbedWebViewJsApiPermissionProxyImpl1> tmoneyConf;

    @Inject
    public Lazy<GyrShakeHelper> tossBankLoggingPolicy;

    @Inject
    public Lazy<ComputeDistance> tossBankTracker;

    @Inject
    public Lazy<zzag> tossClock;

    @Inject
    public Lazy<applyTransparentTitle> tossDynamicFeatureManager;

    @Inject
    public Lazy<InstallReferrerClientBuilder> tossLeakCanaryConfig;

    @Inject
    public Lazy<RealDrawScopeSizeResolversizeinlinedmapNotNull121> tossLib;

    @Inject
    public Lazy<calculateMaxTextSize> tossMessageHandlerPoolSet;

    @Inject
    public Lazy<getTextProgressSize> tossObservability;

    @Inject
    public Lazy<setTextProgressColor> tossObservabilityTraceContextCookieInjector;

    @Inject
    public Lazy<r8lambdaF7l2UkPdwiCLhfrtCKGQ5JqM> tossPushInitializer;

    @Inject
    public Lazy<r8lambdaHDAe14RP_YfkbgNStt68qt10Iow> tossReactDistributionGroupManager;

    @Inject
    public Lazy<getPricingPhaseList> tossRegion;

    @Inject
    public Lazy<SessionTrackerb> tossRouter;

    @Inject
    public Lazy<ComputeDistance> tossSecTracker;

    @Inject
    public Lazy<MessageQueueThreadImplCompanionExternalSyntheticLambda0> tossShakeManager;

    @Inject
    public Lazy<UST_CERT_SetTrustRootCACert> tossShortcutManager;

    @Inject
    public Lazy<RetrofitService> tossTracker;

    @Inject
    public Lazy<addMetadata> tossWebKitInitializer;

    @Inject
    public Lazy<getBreadcrumbs> tossWebSocket;

    @Inject
    public Lazy<TextRoundCornerProgressBarSavedState1> tubaVarsOrigin;

    @Inject
    public Lazy<ConstraintsSizeResolverExternalSyntheticLambda0> unique;

    @Inject
    public Lazy<LongPressTextDragObserverKtExternalSyntheticLambda0> workerFactory;
    private static final byte[] $$a = {115, 102, 60, 8};
    private static final int $$b = 83;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallback = 0;
    private static int extraCallback = 1;
    private static long getInterfaceDescriptor = 7798559133331975163L;
    private static int IAuthTabCallbackStubProxy = -1776194565;
    private static char access000 = 31432;
    private static char[] IAuthTabCallback_Parcel = {51247, 64967, 64986, 64960, 64987, 51242, 64988, 64961, 64978, 64991, 64989, 51243, 51244, 64976, 64982, 51240, 64980, 64983, 51246, 65004, 64966, 51245, 64963, 64977, 51233};
    private static char access100 = 51244;

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        static {
            int[] iArr = new int[DisplaySettingActivity.Companion.DisplaySetting.values().length];
            try {
                iArr[DisplaySettingActivity.Companion.DisplaySetting.LIGHT.ordinal()] = 1;
                int i = onExtraCallbackWithResult + 3;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplaySettingActivity.Companion.DisplaySetting.DARK.ordinal()] = 2;
                int i4 = onExtraCallbackWithResult + 1;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisplaySettingActivity.Companion.DisplaySetting.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IAuthTabCallback = iArr;
            int i6 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = TossApplication.onExtraCallback(TossApplication.this, (access13800) this);
            int i4 = onWarmupCompleted + 97;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, short s) {
        int i3;
        byte[] bArr = $$a;
        int i4 = i * 3;
        int i5 = 110 - s;
        int i6 = 3 - (i2 * 2);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i7 = i4;
            int i8 = i6;
            i3 = 0;
            int i9 = i8;
            i5 = i6 + i7;
            i6 = i9;
            bArr2[i3] = (byte) i5;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            int i10 = i6 + 1;
            i3++;
            i7 = bArr[i10];
            int i11 = i5;
            i8 = i10;
            i6 = i11;
            int i92 = i8;
            i5 = i6 + i7;
            i6 = i92;
            bArr2[i3] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    public static /* synthetic */ String IAuthTabCallback(InterfaceC0059deInitialize interfaceC0059deInitialize) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 41;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            return (String) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{interfaceC0059deInitialize}, iOnWarmupCompleted, -269222356, 269222383);
        }
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 47;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return AudioAttributesImplBaseParcelizer();
        }
        AudioAttributesImplBaseParcelizer();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean IAuthTabCallbackStub(TossApplication tossApplication) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 53;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onUnminimized(tossApplication);
        }
        onUnminimized(tossApplication);
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 19;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {tossApplication};
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted4 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(iOnWarmupCompleted2, iOnWarmupCompleted3, iOnWarmupCompleted4, objArr2, iOnWarmupCompleted, 1305324550, -1305324531);
        int i4 = extraCallback + 57;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object ICustomTabsCallbackDefault(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 29;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(function0);
        if (i3 != 0) {
            throw null;
        }
        int i4 = extraCallback + 35;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 19;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return isEngagementSignalsApiAvailable(tossApplication);
        }
        isEngagementSignalsApiAvailable(tossApplication);
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 43;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        int i4 = ICustomTabsCallback + 21;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zAudioAttributesImplApi26Parcelizer);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean asBinder(TossApplication tossApplication) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 67;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zExtraCommand = extraCommand(tossApplication);
        int i4 = extraCallback + 47;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return zExtraCommand;
    }

    public static /* synthetic */ void asInterface(TossApplication tossApplication) {
        int i = 2 % 2;
        int i2 = extraCallback + 69;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsService(tossApplication);
        int i4 = extraCallback + 29;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        enableAndroidLinearText enableandroidlineartext = (enableAndroidLinearText) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 93;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(tossApplication, enableandroidlineartext);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(tossApplication, enableandroidlineartext);
        int i3 = extraCallback + 101;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ String onExtraCallback(InterfaceC0059deInitialize interfaceC0059deInitialize) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 65;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStub(interfaceC0059deInitialize);
        }
        IAuthTabCallbackStub(interfaceC0059deInitialize);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(TossApplication tossApplication, TossApplication tossApplication2, enableAndroidLinearText enableandroidlineartext) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 15;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(tossApplication, tossApplication2, enableandroidlineartext);
        int i4 = ICustomTabsCallback + 29;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    private static final MapConverter onExtraCallback(MapConverter mapConverter, MapConverter mapConverter2) {
        int i = 2 % 2;
        int i2 = extraCallback + 73;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(mapConverter2, "");
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        int i5 = extraCallback + 81;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return mapConverter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(TossApplication tossApplication, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 39;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onExtraCallbackWithResult(tossApplication, uncaughtExceptionHandler, thread, th);
        if (i3 != 0) {
            throw null;
        }
        int i4 = ICustomTabsCallback + 15;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i6);
        int i9 = ~i6;
        int i10 = ~(i9 | i5);
        int i11 = ~((~i4) | i6);
        int i12 = i10 | i11;
        int i13 = i11 | (~(i7 | i9));
        int i14 = i6 + i5 + i + ((-1232316077) * i2) + ((-263306238) * i3);
        int i15 = i14 * i14;
        int i16 = (((-69115011) * i6) - 1785593856) + (933837065 * i5) + (763021048 * i8) + (1765973124 * i12) + ((-1765973124) * i13) + (1696858112 * i) + (1319895040 * i2) + (1514668032 * i3) + (1334968320 * i15);
        int i17 = ((i6 * (-2046307327)) - 1888090795) + (i5 * (-2046308995)) + (i8 * 1112) + (i12 * (-556)) + (i13 * 556) + (i * (-2046307883)) + (i2 * 1526207759) + (i3 * (-1095616598)) + (i15 * 1719271424);
        switch (i16 + (i17 * i17 * 2111700992)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return onTransact(objArr);
            case 10:
                return access100(objArr);
            case 11:
                return IAuthTabCallback_Parcel(objArr);
            case LiveCheckConstants.SVC_U1 /* 12 */:
                return access000(objArr);
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                return getInterfaceDescriptor(objArr);
            case 14:
                return IAuthTabCallbackStubProxy(objArr);
            case 15:
                TossApplication tossApplication = (TossApplication) objArr[0];
                TossApplication tossApplication2 = (TossApplication) objArr[1];
                enableAndroidLinearText enableandroidlineartext = (enableAndroidLinearText) objArr[2];
                int i18 = 2 % 2;
                int i19 = ICustomTabsCallback + 45;
                extraCallback = i19 % 128;
                int i20 = i19 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(tossApplication, tossApplication2, enableandroidlineartext);
                int i21 = extraCallback + 77;
                ICustomTabsCallback = i21 % 128;
                int i22 = i21 % 2;
                return unitOnExtraCallbackWithResult;
            case 16:
                return ICustomTabsCallback(objArr);
            case 17:
                return writeTypedObject(objArr);
            case UCPApiConstants.MULTI_UICC_MIN_SEIOAGENT_VERSION_CODE /* 18 */:
                return extraCallbackWithResult(objArr);
            case 19:
                return readTypedObject(objArr);
            case 20:
                return extraCallback(objArr);
            case 21:
                return onPostMessage(objArr);
            case 22:
                int i23 = 2 % 2;
                Lazy<setTextProgressColor> lazy = ((TossApplication) objArr[0]).tossObservabilityTraceContextCookieInjector;
                if (lazy == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    return null;
                }
                int i24 = ICustomTabsCallback;
                int i25 = i24 + 125;
                extraCallback = i25 % 128;
                int i26 = i25 % 2;
                int i27 = i24 + 109;
                extraCallback = i27 % 128;
                int i28 = i27 % 2;
                return lazy;
            case 23:
                return onMinimized(objArr);
            case 24:
                String str = (String) objArr[1];
                int i29 = 2 % 2;
                int i30 = ICustomTabsCallback + 13;
                int i31 = i30 % 128;
                extraCallback = i31;
                int i32 = i30 % 2;
                if (str != null) {
                    return Boolean.valueOf(StringsKt.contains$default(str, ":org.chromium.content.app.", false, 2, (Object) null));
                }
                int i33 = i31 + 15;
                ICustomTabsCallback = i33 % 128;
                int i34 = i33 % 2;
                return false;
            case 25:
                return onActivityLayout(objArr);
            case 26:
                return onMessageChannelReady(objArr);
            case 27:
                return onActivityResized(objArr);
            case 28:
                return ICustomTabsCallbackStub(objArr);
            case 29:
                return onUnminimized(objArr);
            case 30:
                return ICustomTabsCallbackDefault(objArr);
            case 31:
                return onRelationshipValidationResult(objArr);
            case 32:
                return ICustomTabsCallbackStubProxy(objArr);
            case 33:
                return ICustomTabsCallback_Parcel(objArr);
            case 34:
                return isEngagementSignalsApiAvailable(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ String onExtraCallbackWithResult(TossApplication tossApplication) {
        int i = 2 % 2;
        int i2 = extraCallback + 103;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return ICustomTabsCallbackStub(tossApplication);
        }
        ICustomTabsCallbackStub(tossApplication);
        throw null;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(InterfaceC0059deInitialize interfaceC0059deInitialize) {
        int i = 2 % 2;
        int i2 = extraCallback + 61;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        String str = (String) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{interfaceC0059deInitialize}, iOnWarmupCompleted, -567280918, 567280926);
        int i4 = extraCallback + 9;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TossApplication tossApplication, TossApplication tossApplication2, GeckoHubImp1 geckoHubImp1, enableAndroidLinearText enableandroidlineartext) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 43;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(tossApplication, tossApplication2, geckoHubImp1, enableandroidlineartext);
        int i4 = extraCallback + 87;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 109;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(function1, obj);
        int i4 = extraCallback + 63;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        MapConverter mapConverter = (MapConverter) objArr[0];
        Callable callable = (Callable) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallback + 47;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(callable, "");
        int i4 = extraCallback + 3;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return mapConverter;
    }

    public static /* synthetic */ String onNavigationEvent(InterfaceC0059deInitialize interfaceC0059deInitialize) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 95;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnTransact = onTransact(interfaceC0059deInitialize);
        int i4 = extraCallback + 37;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return strOnTransact;
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 29;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return MediaMetadataCompat();
        }
        MediaMetadataCompat();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TossApplication tossApplication, TossApplication tossApplication2, GeckoHubImp1 geckoHubImp1, GeckoHubImp1 geckoHubImp12, enableAndroidLinearText enableandroidlineartext) {
        int i = 2 % 2;
        int i2 = extraCallback + 69;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            return (Unit) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{tossApplication, tossApplication2, geckoHubImp1, geckoHubImp12, enableandroidlineartext}, iOnWarmupCompleted, 2139931358, -2139931329);
        }
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = extraCallback + 39;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(th);
        int i4 = extraCallback + 77;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(setTopGuideFontStyle.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy, TossApplication tossApplication, Context context) {
        int i = 2 % 2;
        int i2 = extraCallback + 47;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(iAuthTabCallbackStubProxy, tossApplication, context);
        int i4 = extraCallback + 117;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ ALCFaceSDK4ExternalSyntheticLambda1 onNavigationEvent(TossApplication tossApplication) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 29;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1OnRelationshipValidationResult = onRelationshipValidationResult(tossApplication);
        int i4 = ICustomTabsCallback + 47;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return aLCFaceSDK4ExternalSyntheticLambda1OnRelationshipValidationResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ MapConverter onNavigationEvent(MapConverter mapConverter, MapConverter mapConverter2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 113;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        MapConverter mapConverterOnExtraCallback = onExtraCallback(mapConverter, mapConverter2);
        int i4 = extraCallback + 21;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return mapConverterOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(TossApplication tossApplication, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 123;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(tossApplication, th);
        int i4 = extraCallback + 67;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onNavigationEvent(TossApplication tossApplication, Event event) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 27;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(tossApplication, event);
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return zOnExtraCallback;
    }

    public static /* synthetic */ String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 19;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        String strIconCompatParcelizer = IconCompatParcelizer();
        int i4 = ICustomTabsCallback + 97;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return strIconCompatParcelizer;
    }

    public static /* synthetic */ String onWarmupCompleted(InterfaceC0059deInitialize interfaceC0059deInitialize) {
        int i = 2 % 2;
        int i2 = extraCallback + 37;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        String str = (String) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{interfaceC0059deInitialize}, iOnWarmupCompleted, 158774793, -158774762);
        int i4 = ICustomTabsCallback + 83;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TossApplication tossApplication, TossApplication tossApplication2, enableAndroidLinearText enableandroidlineartext) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 81;
        extraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent(tossApplication, tossApplication2, enableandroidlineartext);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(tossApplication, tossApplication2, enableandroidlineartext);
        int i3 = extraCallback + 91;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(GeckoHubImp1 geckoHubImp1, GeckoHubImp1 geckoHubImp12, GeckoHubImp1 geckoHubImp13, enableAndroidLinearText enableandroidlineartext) {
        int i = 2 % 2;
        int i2 = extraCallback + 111;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            return (Unit) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{geckoHubImp1, geckoHubImp12, geckoHubImp13, enableandroidlineartext}, iOnWarmupCompleted, -462404191, 462404207);
        }
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        throw null;
    }

    public static /* synthetic */ MapConverter onWarmupCompleted(MapConverter mapConverter, Callable callable) {
        MapConverter mapConverter2;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 11;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            mapConverter2 = (MapConverter) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{mapConverter, callable}, iOnWarmupCompleted, 196337534, -196337533);
            int i3 = 6 / 0;
        } else {
            int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            mapConverter2 = (MapConverter) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{mapConverter, callable}, iOnWarmupCompleted2, 196337534, -196337533);
        }
        int i4 = ICustomTabsCallback + 73;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return mapConverter2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onWarmupCompleted(TossApplication tossApplication) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 113;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zICustomTabsCallbackDefault = ICustomTabsCallbackDefault(tossApplication);
        if (i3 == 0) {
            int i4 = 2 / 0;
        }
        int i5 = ICustomTabsCallback + 43;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return zICustomTabsCallbackDefault;
    }

    static final class receiveFile extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long IAuthTabCallback = -1459162921431378260L;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ TossApplication $appContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        receiveFile(TossApplication tossApplication, access13800<? super receiveFile> access13800Var) {
            super(1, access13800Var);
            this.$appContext = tossApplication;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            receiveFile receivefile = TossApplication.this.new receiveFile(this.$appContext, access13800Var);
            int i2 = onNavigationEvent + 75;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return receivefile;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            onNavigationEvent = i2 % 128;
            access13800<? super Unit> access13800Var = (access13800) obj;
            if (i2 % 2 != 0) {
                onExtraCallback(access13800Var);
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(access13800Var);
            int i3 = onWarmupCompleted + 77;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(access13800<? super Unit> access13800Var) throws Throwable {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            receiveFile receivefileCreate = create(access13800Var);
            if (i3 == 0) {
                objInvokeSuspend = receivefileCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 9 / 0;
            } else {
                objInvokeSuspend = receivefileCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onWarmupCompleted + 23;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $11 + 119;
                $10 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 1), 24 - View.combineMeasuredStates(0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() & (IAuthTabCallback % 5407414049857832247L);
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getTapTimeout() >> 16) + 59, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 24 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 19627 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (5407414049857832247L ^ IAuthTabCallback);
                        Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 59 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i6 = $10 + 3;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 % 3;
            }
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i8 = $11 + 3;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), 59 - Color.alpha(0), 6383 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onWarmupCompleted + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            Object objOnTransact$128544c1 = TossApplication.this.onTransact$128544c1();
            TossApplication tossApplication = this.$appContext;
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
            a(new char[]{54219, 20986, 55224, 21828, 56068, 22843, 57063, 23739, 49734, 16404, 50746, 19449, 51639, 20291, 52486, 29497, 61674, 30376, 62557, 31245, 63540, 32247, 58296, 24896, 59148, 25895, 60128, 26803, 61003, 27673}, 33331 - (KeyEvent.getMaxKeyCode() >> 16), new Object[1]);
            try {
                Object[] objArr = {tossApplication, Boolean.valueOf(!textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onExtraCallback(((String) r7[0]).intern(), false))};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-383236931);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), TextUtils.getOffsetBefore("", 0) + 18, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6567, -664225235, false, "onExtraCallbackWithResult", new Class[]{Context.class, Boolean.TYPE});
                }
                ((Method) objOnExtraCallback).invoke(objOnTransact$128544c1, objArr);
                Unit unit = Unit.INSTANCE;
                int i4 = onNavigationEvent + 87;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    public static final class onNavigationEvent implements AFj1qSDKExternalSyntheticLambda0 {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 58378;
        private static int IAuthTabCallbackStub = 1;
        private static char onExtraCallback = 59762;
        private static char onExtraCallbackWithResult = 21847;
        private static char onNavigationEvent = 64193;
        private static int onTransact;
        private final onExtraCallbackWithResult onWarmupCompleted;

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i4 = $11 + 59;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i6 = $11 + 85;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 58224;
                int i9 = i3;
                while (i9 < 16) {
                    int i10 = $10 + 71;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                    int i13 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                        objArr2[2] = Integer.valueOf(i13);
                        objArr2[1] = Integer.valueOf(i12);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char defaultSize = (char) View.getDefaultSize(i3, i3);
                            int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0');
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 12434;
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(defaultSize, iLastIndexOf, jumpTapTimeout, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), 10 - KeyEvent.keyCodeFromString(""), 12434 - Color.blue(0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - Drawable.resolveOpacity(0, 0)), TextUtils.indexOf("", "", 0, 0) + 14, 19901 - Color.red(0), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        onNavigationEvent(TossApplication tossApplication, boolean z) {
            this.onWarmupCompleted = new onExtraCallbackWithResult(tossApplication, z);
        }

        public /* synthetic */ isDoNotSellSet onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 1;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return onWarmupCompleted();
            }
            onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean onExtraCallbackWithResult() throws Throwable {
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback;
            Object obj;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 117;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback = addPolicy.ITrustedWebActivityCallback();
                Object[] objArr = new Object[1];
                a(new char[]{62328, 37751, 9280, 7716, 54337, 53357, 7050, 2616, 58171, 27503, 20889, 61182, 32215, 34660, 60202, 26444, 48372, 31197, 54339, 25921, 1145, 9483, 35902, 55618, 60218, 8620, 37549, 23508, 20388, 2545}, 118 >> ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
                obj = objArr[0];
            } else {
                textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback = addPolicy.ITrustedWebActivityCallback();
                Object[] objArr2 = new Object[1];
                a(new char[]{62328, 37751, 9280, 7716, 54337, 53357, 7050, 2616, 58171, 27503, 20889, 61182, 32215, 34660, 60202, 26444, 48372, 31197, 54339, 25921, 1145, 9483, 35902, 55618, 60218, 8620, 37549, 23508, 20388, 2545}, ((byte) KeyEvent.getModifierMetaStateMask()) + 31, objArr2);
                obj = objArr2[0];
            }
            boolean zOnExtraCallback = textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback.onExtraCallback(((String) obj).intern(), false);
            int i3 = onTransact + 109;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                return zOnExtraCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public static final class onExtraCallbackWithResult implements isDoNotSellSet {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;
            private final boolean onExtraCallback;
            private final boolean onExtraCallbackWithResult;

            /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            onExtraCallbackWithResult(TossApplication tossApplication, boolean z) {
                boolean z2;
                if (tossApplication.extraCallback().onActivityLayout()) {
                    z2 = true;
                    if (!tossApplication.extraCallback().MediaBrowserCompatMediaItem()) {
                        int i = IAuthTabCallback + 7;
                        onWarmupCompleted = i % 128;
                        int i2 = i % 2;
                        int i3 = 2 % 2;
                    } else {
                        int i4 = onWarmupCompleted + 19;
                        IAuthTabCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 2 % 2;
                        }
                        z2 = false;
                    }
                }
                this.onExtraCallbackWithResult = z2;
                this.onExtraCallback = z;
                int i6 = IAuthTabCallback + 103;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }

            public boolean onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 95;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                boolean z = this.onExtraCallbackWithResult;
                if (i3 != 0) {
                    int i4 = 22 / 0;
                }
                return z;
            }

            public boolean onExtraCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 119;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                boolean z = this.onExtraCallback;
                int i5 = i3 + 109;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return z;
            }
        }

        public boolean onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 89;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                DERSet.onExtraCallback.access100();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean zAccess100 = DERSet.onExtraCallback.access100();
            int i3 = onTransact + 109;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return zAccess100;
        }

        public onExtraCallbackWithResult onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 21;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = this.onWarmupCompleted;
            int i5 = i3 + 81;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackwithresult;
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $10 + 117;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 43, 1451 - (ViewConfiguration.getFadingEdgeLength() >> 16), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 49123), 44 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1494 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 50 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16823064), TextUtils.lastIndexOf("", '0', 0) + 30, ImageFormat.getBitsPerPixel(0) + 12578, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (getInterfaceDescriptor ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackStubProxy ^ 7798559133331975163L))) ^ ((char) (access000 ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $11 + 103;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public TossApplication() {
        UserChoiceBillingListener.onExtraCallback.IAuthTabCallback(this);
        this.onWarmupCompleted = new ResourceResolutionException();
        this.asBinder = findRes.onWarmupCompleted(putChannelInfo.onExtraCallback().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null)));
        this.onTransact = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.IAuthTabCallbackDefault = new ITrustedWebActivityCallbackDefault(this);
        this.IAuthTabCallbackStub = new ITrustedWebActivityCallback();
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 87;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        tossApplication.IAuthTabCallback = iIntValue;
        if (i3 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(TossApplication tossApplication, Locale locale) {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 39;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        tossApplication.asInterface = locale;
        if (i4 != 0) {
            int i5 = 58 / 0;
        }
        int i6 = i2 + 81;
        ICustomTabsCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ int IAuthTabCallbackDefault(TossApplication tossApplication) {
        int i = 2 % 2;
        int i2 = extraCallback + 125;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        int i5 = tossApplication.IAuthTabCallback;
        int i6 = i3 + 123;
        extraCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public static final /* synthetic */ Locale IAuthTabCallbackStubProxy(TossApplication tossApplication) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 77;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        Locale locale = tossApplication.asInterface;
        if (i4 == 0) {
            int i5 = 4 / 0;
        }
        int i6 = i3 + 103;
        ICustomTabsCallback = i6 % 128;
        int i7 = i6 % 2;
        return locale;
    }

    public static final /* synthetic */ findResAndMsg IAuthTabCallback_Parcel(TossApplication tossApplication) {
        int i = 2 % 2;
        int i2 = extraCallback + 51;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        findResAndMsg findresandmsg = tossApplication.asBinder;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 105;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
        return findresandmsg;
    }

    public static final /* synthetic */ void ICustomTabsCallback(TossApplication tossApplication) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 9;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.read();
        int i4 = extraCallback + 25;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
    }

    public static final /* synthetic */ getBorderRadius access000(TossApplication tossApplication) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 13;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        getBorderRadius<Activity> getborderradius = tossApplication.onTransact;
        if (i4 == 0) {
            int i5 = 2 / 0;
        }
        int i6 = i2 + 77;
        extraCallback = i6 % 128;
        int i7 = i6 % 2;
        return getborderradius;
    }

    private static /* synthetic */ Object access100(Object[] objArr) throws Throwable {
        TossApplication tossApplication = (TossApplication) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 29;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.MediaSessionCompatToken();
        if (i3 != 0) {
            return null;
        }
        int i4 = 64 / 0;
        return null;
    }

    public static final /* synthetic */ void access100(TossApplication tossApplication) {
        int i = 2 % 2;
        int i2 = extraCallback + 31;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.notifyNotificationWithChannel();
        int i4 = extraCallback + 15;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 33;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.MediaDescriptionCompat();
        if (i3 != 0) {
            throw null;
        }
        int i4 = ICustomTabsCallback + 39;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ void extraCallback(TossApplication tossApplication) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 15;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.getActiveNotifications();
        int i4 = extraCallback + 7;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void extraCallbackWithResult(TossApplication tossApplication) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 87;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.getSmallIconBitmap();
        if (i3 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ boolean getInterfaceDescriptor(TossApplication tossApplication) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 89;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        Object obj = null;
        boolean z = tossApplication.onExtraCallback;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 75;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public static final /* synthetic */ void onActivityLayout(TossApplication tossApplication) {
        int i = 2 % 2;
        int i2 = extraCallback + 5;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        tossApplication.ITrustedWebActivityServiceStub();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallback + 7;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onActivityResized(TossApplication tossApplication) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 93;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.RemoteActionCompatParcelizer();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onExtraCallback(TossApplication tossApplication, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 59;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{tossApplication, access13800Var}, iOnWarmupCompleted, -888978334, 888978347);
        int i4 = extraCallback + 111;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static final /* synthetic */ void onMessageChannelReady(TossApplication tossApplication) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 95;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{tossApplication}, iOnWarmupCompleted, -1990444538, 1990444566);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{tossApplication}, iOnWarmupCompleted2, -1990444538, 1990444566);
        int i3 = ICustomTabsCallback + 59;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final /* synthetic */ Object onNavigationEvent(TossApplication tossApplication, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 105;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = tossApplication.onExtraCallbackWithResult((access13800<? super Unit>) access13800Var);
        int i4 = extraCallback + 81;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ void onPostMessage(TossApplication tossApplication) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 115;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.RatingCompatStyle();
        int i4 = ICustomTabsCallback + 115;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onTransact(TossApplication tossApplication) {
        int i = 2 % 2;
        int i2 = extraCallback + 79;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{tossApplication}, iOnWarmupCompleted, -1348194823, 1348194848);
        int i4 = extraCallback + 111;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void readTypedObject(TossApplication tossApplication) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 43;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.ITrustedWebActivityService_Parcel();
        int i4 = extraCallback + 61;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
    }

    public static final /* synthetic */ void writeTypedObject(TossApplication tossApplication) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 39;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.ITrustedWebActivityServiceDefault();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallback + 11;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
    }

    public ResourceResolutionException onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallback + 27;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        ResourceResolutionException resourceResolutionException = this.onWarmupCompleted;
        int i5 = i3 + 13;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return resourceResolutionException;
    }

    @Override // o.RememberLottieCompositionKtloadFontsFromAssets2
    public Object onTransact$128544c1() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 121;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        Object obj = this.appGuard;
        if (obj != null) {
            return obj;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = extraCallback + 37;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // o.RememberLottieCompositionKtloadFontsFromAssets2
    public wie2 ICustomTabsCallback() {
        int i = 2 % 2;
        wie2 wie2Var = this.json;
        if (wie2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = ICustomTabsCallback + 5;
            extraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        int i3 = ICustomTabsCallback;
        int i4 = i3 + 15;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 101;
        extraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 9 / 0;
        }
        return wie2Var;
    }

    private static void b(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = IAuthTabCallback_Parcel;
        char c = '0';
        Object obj2 = null;
        if (cArr3 != null) {
            int i4 = $11 + 77;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 55;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), Color.rgb(0, 0, 0) + 16777242, 23138 - TextUtils.indexOf("", c, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i8 = $10 + 29;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(access100)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), Gravity.getAbsoluteGravity(0, 0) + 26, 23139 - View.MeasureSpec.makeMeasureSpec(0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i10 = $11 + 19;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                }
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 'z' - AndroidCharacter.getMirror('0'), 8089 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0')), TextUtils.lastIndexOf("", '0') + 31, 19488 - TextUtils.indexOf("", ""), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i11];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i12];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i13];
                            } else {
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i14];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i15];
                                int i16 = $11 + 55;
                                $10 = i16 % 128;
                                if (i16 % 2 != 0) {
                                    int i17 = 2 / 2;
                                }
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            int i18 = 0;
            while (i18 < i) {
                int i19 = $10 + 5;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    cArr4[i18] = (char) (cArr4[i18] ^ 16410);
                    i18 += 80;
                } else {
                    cArr4[i18] = (char) (cArr4[i18] ^ 13722);
                    i18++;
                }
            }
            String str = new String(cArr4);
            int i20 = $10 + 39;
            $11 = i20 % 128;
            if (i20 % 2 != 0) {
                objArr[0] = str;
            } else {
                int i21 = 7 / 0;
                objArr[0] = str;
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public final zzad extraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 15;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        zzad zzadVar = this.environments;
        if (zzadVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 103;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zzadVar;
        }
        throw null;
    }

    public final Lazy<RealDrawScopeSizeResolversizeinlinedmapNotNull121> setEngagementSignalsCallback() {
        int i = 2 % 2;
        Lazy<RealDrawScopeSizeResolversizeinlinedmapNotNull121> lazy = this.tossLib;
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = extraCallback + 75;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = extraCallback + 13;
        int i5 = i4 % 128;
        ICustomTabsCallback = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 97;
        extraCallback = i7 % 128;
        int i8 = i7 % 2;
        return lazy;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 3;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<AsyncImagePainterExternalSyntheticLambda0> lazy = tossApplication.seedKey;
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 39;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 91;
        extraCallback = i7 % 128;
        int i8 = i7 % 2;
        return lazy;
    }

    public final Lazy<ConstraintsSizeResolverExternalSyntheticLambda0> onVerticalScrollEvent() {
        int i = 2 % 2;
        Lazy<ConstraintsSizeResolverExternalSyntheticLambda0> lazy = this.unique;
        Object obj = null;
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = ICustomTabsCallback + 27;
        int i3 = i2 % 128;
        extraCallback = i3;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 21;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return lazy;
    }

    public final Lazy<RealmDbManager> mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 53;
        ICustomTabsCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        Lazy<RealmDbManager> lazy = this.realmDbManager;
        if (lazy != null) {
            int i4 = i2 + 83;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return lazy;
            }
            obj.hashCode();
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i5 = extraCallback + 115;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final Lazy<ALCFaceSDK4ExternalSyntheticLambda1> readTypedObject() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 13;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<ALCFaceSDK4ExternalSyntheticLambda1> lazy = this.localTubaVarsV1Source;
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 61;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 59;
        ICustomTabsCallback = i7 % 128;
        int i8 = i7 % 2;
        return lazy;
    }

    public final Lazy<ALCFaceSDK4ExternalSyntheticLambda1> writeTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 53;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<ALCFaceSDK4ExternalSyntheticLambda1> lazy = this.debugTubaVarsV1Source;
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 109;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 111;
        extraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 53 / 0;
        }
        return lazy;
    }

    public final Lazy<Object> access000() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 115;
        extraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Lazy<Object> lazy = this.debugOverlayStarter;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = ICustomTabsCallback + 81;
        extraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final Lazy<TextRoundCornerProgressBarSavedState1> onSessionEnded() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 21;
        ICustomTabsCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Lazy<TextRoundCornerProgressBarSavedState1> lazy = this.tubaVarsOrigin;
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 49;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return lazy;
        }
        throw null;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 83;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        Lazy<isBluetoothEnabled> lazy = tossApplication.appLockChecker;
        if (i4 != 0) {
            throw null;
        }
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 109;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return lazy;
        }
        throw null;
    }

    public final Lazy<GetInputImageFromPathAsGrayScale> onActivityLayout() {
        int i = 2 % 2;
        int i2 = extraCallback + 27;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Lazy<GetInputImageFromPathAsGrayScale> lazy = this.logCentreFetcher;
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 119;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
        return lazy;
    }

    public final Lazy<r8lambdaHDAe14RP_YfkbgNStt68qt10Iow> ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 113;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Lazy<r8lambdaHDAe14RP_YfkbgNStt68qt10Iow> lazy = this.tossReactDistributionGroupManager;
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 119;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return lazy;
    }

    public final Lazy<getBreadcrumbs> IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCallback + 69;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<getBreadcrumbs> lazy = this.tossWebSocket;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = ICustomTabsCallback + 21;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r2 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r2 = r2 + 15;
        im.toss.TossApplication.extraCallback = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Lazy<MessageQueueThreadImplCompanionExternalSyntheticLambda0> IEngagementSignalsCallback() {
        Lazy<MessageQueueThreadImplCompanionExternalSyntheticLambda0> lazy;
        int i = 2 % 2;
        int i2 = extraCallback + 49;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        if (i2 % 2 != 0) {
            lazy = this.tossShakeManager;
            int i4 = 20 / 0;
        } else {
            lazy = this.tossShakeManager;
        }
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 39;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Lazy<onAccuracyChanged> lazy = tossApplication.badNotificationCrashRecorder;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 9;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return lazy;
        }
        throw null;
    }

    public final Lazy<trackCheckout> ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 95;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<trackCheckout> lazy = this.notificationHelper;
        if (lazy != null) {
            int i5 = i2 + 9;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 92 / 0;
            }
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = extraCallback + 91;
        ICustomTabsCallback = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = im.toss.TossApplication.ICustomTabsCallback + 17;
        im.toss.TossApplication.extraCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Lazy<LongPressTextDragObserverKtExternalSyntheticLambda0> IEngagementSignalsCallbackDefault() {
        Lazy<LongPressTextDragObserverKtExternalSyntheticLambda0> lazy;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 97;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            lazy = this.workerFactory;
            int i3 = 29 / 0;
        } else {
            lazy = this.workerFactory;
        }
    }

    public final Lazy<initView> ICustomTabsService() {
        int i = 2 % 2;
        int i2 = extraCallback + 19;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Lazy<initView> lazy = this.sdkConsentGatekeeper;
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 39;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return lazy;
    }

    public final Lazy<initLayout> ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = extraCallback + 101;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        Lazy<initLayout> lazy = this.sdkConsentGate;
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 59;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
        return lazy;
    }

    public final Lazy<AFj1mSDKExternalSyntheticLambda1> extraCommand() {
        int i = 2 % 2;
        int i2 = extraCallback + 125;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        Lazy<AFj1mSDKExternalSyntheticLambda1> lazy = this.sdkConsentServerSync;
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 107;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = im.toss.TossApplication.extraCallback + 103;
        im.toss.TossApplication.ICustomTabsCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Lazy<RetrofitService> access200() {
        Lazy<RetrofitService> lazy;
        int i = 2 % 2;
        int i2 = extraCallback + 101;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            lazy = this.tossTracker;
            int i3 = 40 / 0;
        } else {
            lazy = this.tossTracker;
        }
    }

    public final Lazy<ComputeDistance> newSession() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 103;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        Lazy<ComputeDistance> lazy = this.tossBankTracker;
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = ICustomTabsCallback + 21;
            extraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 27 / 0;
            }
            return null;
        }
        int i7 = i3 + 107;
        int i8 = i7 % 128;
        ICustomTabsCallback = i8;
        if (i7 % 2 != 0) {
            throw null;
        }
        int i9 = i8 + 43;
        extraCallback = i9 % 128;
        int i10 = i9 % 2;
        return lazy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r0 = 51 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = im.toss.TossApplication.ICustomTabsCallback + 81;
        im.toss.TossApplication.extraCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if ((r1 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r1 = 85 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 11;
        im.toss.TossApplication.ICustomTabsCallback = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Lazy<ComputeDistance> ICustomTabsServiceStubProxy() {
        Lazy<ComputeDistance> lazy;
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 39;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            lazy = this.tossSecTracker;
            int i4 = 36 / 0;
        } else {
            lazy = this.tossSecTracker;
        }
    }

    public final Lazy<DetectFaceInSingleImage> ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 87;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Lazy<DetectFaceInSingleImage> lazy = this.paramMapBuilder;
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 121;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return lazy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r2 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r2 = r2 + 71;
        im.toss.TossApplication.ICustomTabsCallback = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Lazy<Map<String, ComputeDistances>> onActivityResized() {
        Lazy<Map<String, ComputeDistances>> lazy;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 111;
        int i3 = i2 % 128;
        extraCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            lazy = this.logStoreProviders;
            int i4 = 54 / 0;
        } else {
            lazy = this.logStoreProviders;
        }
    }

    public final Lazy<zzag> prefetchWithMultipleUrls() {
        int i = 2 % 2;
        Lazy<zzag> lazy = this.tossClock;
        if (lazy != null) {
            int i2 = extraCallback + 29;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 43 / 0;
            }
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = ICustomTabsCallback + 63;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return null;
    }

    public final Lazy<setSegmentCollection> onPostMessage() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 83;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<setSegmentCollection> lazy = this.loginUtil;
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 43;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return lazy;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 81;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        Object obj = null;
        Lazy<setAdUnitIds> lazy = tossApplication.loginStatus;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        if (lazy != null) {
            int i5 = i3 + 89;
            extraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return lazy;
            }
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i6 = ICustomTabsCallback + 35;
        extraCallback = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    public final Lazy<Q0> postMessage() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 13;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<Q0> lazy = this.sessionStateManager;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = ICustomTabsCallback + 33;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final Lazy<MaxAdViewImplExternalSyntheticLambda3> isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 61;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        Lazy<MaxAdViewImplExternalSyntheticLambda3> lazy = this.reactInitializer;
        if (lazy != null) {
            int i5 = i3 + 99;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 15 / 0;
            }
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = extraCallback + 73;
        ICustomTabsCallback = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = im.toss.TossApplication.extraCallback + 27;
        im.toss.TossApplication.ICustomTabsCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r1 = 15 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = r2 + 43;
        im.toss.TossApplication.extraCallback = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Lazy<onInterstitialAdDisplayFailed> onRelationshipValidationResult() {
        Lazy<onInterstitialAdDisplayFailed> lazy;
        int i = 2 % 2;
        int i2 = extraCallback + 71;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        if (i2 % 2 != 0) {
            lazy = this.portalRuntime;
            int i4 = 40 / 0;
        } else {
            lazy = this.portalRuntime;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        r2 = r2 + 79;
        im.toss.TossApplication.ICustomTabsCallback = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if ((r2 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 45;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<r8lambdau761TBYkUBsjAjCwmNCBjUIxcpI> lazy = tossApplication.monoHermesFlagSessionObserver;
        if (i4 != 0) {
            int i5 = 24 / 0;
        }
    }

    public final Lazy<calculateMaxTextSize> receiveFile() {
        int i = 2 % 2;
        int i2 = extraCallback + 41;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        Lazy<calculateMaxTextSize> lazy = this.tossMessageHandlerPoolSet;
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 5;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return lazy;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 41;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<getBizCode> lazy = tossApplication.loginTokenShortcutRepository;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = ICustomTabsCallback + 65;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final Lazy<registerStatusListener> onUnminimized() {
        int i = 2 % 2;
        Lazy<registerStatusListener> lazy = this.overseasPaymentNotificationManager;
        if (lazy != null) {
            int i2 = extraCallback + 103;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return lazy;
            }
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = extraCallback + 107;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final Lazy<setLargePhotoHeight> extraCallbackWithResult() {
        int i = 2 % 2;
        Lazy<setLargePhotoHeight> lazy = this.kakaoLoginInterface;
        if (lazy != null) {
            int i2 = ICustomTabsCallback + 63;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = extraCallback + 11;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 87;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<SessionTrackerb> lazy = tossApplication.tossRouter;
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 117;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return lazy;
        }
        throw null;
    }

    private static /* synthetic */ Object isEngagementSignalsApiAvailable(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 79;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        Lazy<addMetadata> lazy = tossApplication.tossWebKitInitializer;
        if (lazy != null) {
            int i5 = i3 + 87;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = extraCallback + 23;
        ICustomTabsCallback = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = r2 + 5;
        im.toss.TossApplication.ICustomTabsCallback = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Lazy<GyrShakeHelper> newAuthTabSession() {
        Lazy<GyrShakeHelper> lazy;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 99;
        int i3 = i2 % 128;
        extraCallback = i3;
        if (i2 % 2 == 0) {
            lazy = this.tossBankLoggingPolicy;
            int i4 = 69 / 0;
        } else {
            lazy = this.tossBankLoggingPolicy;
        }
    }

    public final Lazy<Application.ActivityLifecycleCallbacks> IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 65;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        Lazy<Application.ActivityLifecycleCallbacks> lazy = this.appsInTossLifecycleCallback;
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 125;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return lazy;
        }
        throw null;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 11;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        Lazy<drawTextProgressColor> lazy = tossApplication.appLaunchTracer;
        Object obj = null;
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 51;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return lazy;
        }
        obj.hashCode();
        throw null;
    }

    public final Lazy<getTextProgressSize> updateVisuals() {
        int i = 2 % 2;
        Lazy<getTextProgressSize> lazy = this.tossObservability;
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = ICustomTabsCallback + 21;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 11;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazy;
    }

    public final Lazy<applyTransparentTitle> requestPostMessageChannelWithExtras() {
        int i = 2 % 2;
        int i2 = extraCallback + 31;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        Lazy<applyTransparentTitle> lazy = this.tossDynamicFeatureManager;
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 51;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazy;
    }

    public final Lazy<UST_CERT_SetTrustRootCACert> writeTypedList() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 37;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        Lazy<UST_CERT_SetTrustRootCACert> lazy = this.tossShortcutManager;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = extraCallback + 81;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final Lazy<setUsed> IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 41;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        Lazy<setUsed> lazy = this.appWidgetProvider;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = extraCallback + 87;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final Lazy<getPricingPhaseList> ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = extraCallback + 67;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        Lazy<getPricingPhaseList> lazy = this.tossRegion;
        if (lazy != null) {
            int i5 = i3 + 73;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = ICustomTabsCallback + 11;
        extraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 37 / 0;
        }
        return null;
    }

    public final Lazy<bd> asInterface() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 25;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        Lazy<bd> lazy = this.appLaunchTtidLogger;
        if (lazy != null) {
            int i5 = i3 + 71;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = ICustomTabsCallback + 3;
        extraCallback = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    public final Lazy<InstallReferrerClientBuilder> requestPostMessageChannel() {
        int i = 2 % 2;
        Lazy<InstallReferrerClientBuilder> lazy = this.tossLeakCanaryConfig;
        if (lazy != null) {
            int i2 = ICustomTabsCallback + 85;
            extraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 / 0;
            }
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = ICustomTabsCallback + 3;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return null;
    }

    public final Lazy<GriverEmbedWebViewJsApiPermissionProxyImpl1> newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 81;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<GriverEmbedWebViewJsApiPermissionProxyImpl1> lazy = this.tmoneyConf;
        if (lazy != null) {
            int i5 = i2 + 51;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = extraCallback + 77;
        ICustomTabsCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final Lazy<r8lambdaF7l2UkPdwiCLhfrtCKGQ5JqM> warmup() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 7;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<r8lambdaF7l2UkPdwiCLhfrtCKGQ5JqM> lazy = this.tossPushInitializer;
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 19;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return lazy;
        }
        throw null;
    }

    public final Lazy<isJacksonCreator> getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = extraCallback + 89;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        Lazy<isJacksonCreator> lazy = this.authUiConfig;
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 39;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return lazy;
        }
        throw null;
    }

    public static final class ITrustedWebActivityCallback implements zzao {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        ITrustedWebActivityCallback() {
        }

        public /* bridge */ void onActivityCreated(Activity activity, Bundle bundle) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onActivityCreated(activity, bundle);
            int i4 = IAuthTabCallback + 105;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public /* bridge */ void onActivityDestroyed(Activity activity) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onActivityDestroyed(activity);
            if (i3 != 0) {
                throw null;
            }
        }

        public /* bridge */ void onActivityPaused(Activity activity) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onActivityPaused(activity);
            if (i3 != 0) {
                throw null;
            }
        }

        public /* bridge */ void onActivityResumed(Activity activity) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onActivityResumed(activity);
            int i4 = IAuthTabCallback + 125;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* bridge */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onActivitySaveInstanceState(activity, bundle);
            if (i3 == 0) {
                int i4 = 53 / 0;
            }
            int i5 = IAuthTabCallback + 29;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 65 / 0;
            }
        }

        public /* bridge */ void onActivityStarted(Activity activity) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onActivityStarted(activity);
            if (i3 != 0) {
                int i4 = 15 / 0;
            }
        }

        public /* bridge */ void onActivityStopped(Activity activity) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onActivityStopped(activity);
            if (i3 == 0) {
                throw null;
            }
            int i4 = IAuthTabCallback + 101;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(activity, "");
                super/*android.app.Application.ActivityLifecycleCallbacks*/.onActivityPreCreated(activity, bundle);
                Intrinsics.areEqual(activity.getClass().getName(), "com.google.android.gms.ads.AdActivity");
                throw null;
            }
            Intrinsics.checkNotNullParameter(activity, "");
            super/*android.app.Application.ActivityLifecycleCallbacks*/.onActivityPreCreated(activity, bundle);
            if (!Intrinsics.areEqual(activity.getClass().getName(), "com.google.android.gms.ads.AdActivity")) {
                activity.getTheme().applyStyle(im.toss.uikit.R.style.OptOutEdgeToEdgeEnforcement, false);
            }
            int i3 = IAuthTabCallback + 1;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public TooltipKtExternalSyntheticLambda1 onExtraCallback() {
        int i = 2 % 2;
        TooltipKtExternalSyntheticLambda1 tooltipKtExternalSyntheticLambda1OnNavigationEvent = new TooltipKtExternalSyntheticLambda1.onExtraCallbackWithResult().IAuthTabCallback(4).onExtraCallback(Executors.newCachedThreadPool()).onExtraCallback(IEngagementSignalsCallbackDefault().get()).onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(tooltipKtExternalSyntheticLambda1OnNavigationEvent, "");
        int i2 = extraCallback + 79;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return tooltipKtExternalSyntheticLambda1OnNavigationEvent;
    }

    @Override // o.RememberLottieCompositionKtloadFontsFromAssets2, android.app.Application
    public void onCreate() throws Throwable {
        int i = 2 % 2;
        bd.onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), new Object[]{asInterface().get()}, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1196314501, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1196314505, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback());
        RnProcessRuntime rnProcessRuntime = RnProcessRuntime.onWarmupCompleted;
        String packageName = getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        rnProcessRuntime.onWarmupCompleted(packageName);
        String str = (String) RememberLottieCompositionKtloadFontsFromAssets2.onExtraCallbackWithResult(-1556913437, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1556913438, new Object[]{this}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
        if (((Boolean) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, str}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -656613511, 656613535)).booleanValue()) {
            if (this.onExtraCallback) {
                int i2 = extraCallback + 91;
                ICustomTabsCallback = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            return;
        }
        if (!zzdd.onNavigationEvent(str)) {
            if (!onExtraCallback(str)) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                String str2 = str + " (" + Process.myPid() + ")";
                setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
                long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                setRevision setrevision = setRevision.MILLISECONDS;
                ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, "process_created", str2, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("currentThreadTime", setLogBuffers.onPostMessage(setCommandLine.IAuthTabCallback(jCurrentThreadTimeMillis, setrevision))), getWrite.IAuthTabCallback("uptime", setLogBuffers.onPostMessage(setCommandLine.IAuthTabCallback(SystemClock.uptimeMillis(), setrevision))), getWrite.IAuthTabCallback("elapsedRealtime", setLogBuffers.onPostMessage(setCommandLine.IAuthTabCallback(SystemClock.elapsedRealtime(), setrevision))), getWrite.IAuthTabCallback("processName", str), getWrite.IAuthTabCallback("isMainProcess", Boolean.valueOf(ITrustedWebActivityCallbackStub()))}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            } else {
                int i4 = extraCallback + 3;
                ICustomTabsCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }
            OkHttp okHttp = OkHttp.INSTANCE;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            okHttp.initialize(applicationContext);
            super.onCreate();
            UserChoiceBillingListener.onExtraCallback.IAuthTabCallback();
            if (Build.VERSION.SDK_INT >= 35 && !UtilsKtExternalSyntheticLambda11.IAuthTabCallback(UtilsKtExternalSyntheticLambda11.IAuthTabCallback, "platform.android.edgeToEdge.enforce", false, null, 6, null)) {
                int i5 = extraCallback + 47;
                ICustomTabsCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    registerActivityLifecycleCallbacks(this.IAuthTabCallbackStub);
                } else {
                    registerActivityLifecycleCallbacks(this.IAuthTabCallbackStub);
                    throw null;
                }
            }
            if (ITrustedWebActivityCallbackStub()) {
                AudioAttributesImplApi21Parcelizer();
            }
            asInterface().get().onNavigationEvent();
            return;
        }
        int i6 = ICustomTabsCallback + 83;
        extraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // o.RememberLottieCompositionKtloadFontsFromAssets2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IPostMessageServiceStub() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = extraCallback + 1;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super.IPostMessageServiceStub();
            int i3 = 69 / 0;
            if (!UserChoiceBillingListener.onExtraCallback.onExtraCallbackWithResult()) {
                int i4 = extraCallback + 19;
                ICustomTabsCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    auth.onExtraCallback(auth.onNavigationEvent, "ApplicationContext does not initialized.", null, null, 75, null);
                } else {
                    auth.onExtraCallback(auth.onNavigationEvent, "ApplicationContext does not initialized.", null, null, 6, null);
                }
            }
        } else {
            super.IPostMessageServiceStub();
            if (!UserChoiceBillingListener.onExtraCallback.onExtraCallbackWithResult()) {
            }
        }
        this.asInterface = PageExitListener.IAuthTabCallback(this);
        this.IAuthTabCallback = getResources().getConfiguration().uiMode & 48;
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        TextLinkScopeExternalSyntheticLambda3.Companion.onExtraCallbackWithResult().getLifecycle().IAuthTabCallback(new observeNativeAdsTrackingFlush.1(this));
        int i2 = ICustomTabsCallback + 51;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 87 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Throwable {
        Object obj;
        String strSubstringBefore$default;
        String strSubstringBefore$default2;
        InterfaceC0059deInitialize interfaceC0059deInitialize = (InterfaceC0059deInitialize) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(interfaceC0059deInitialize, "");
        Map<String, Object> mapExtraCallbackWithResult = interfaceC0059deInitialize.extraCallbackWithResult();
        if (mapExtraCallbackWithResult != null) {
            int i2 = extraCallback + 19;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                a((char) (((byte) KeyEvent.getModifierMetaStateMask()) * 53889), ExpandableListView.getPackedPositionChild(0L) - 1, new char[]{35572, 50324, 44328, 33010}, new char[]{0, 0, 0, 0}, new char[]{10436, 22018, 32770, 61138}, objArr2);
                obj = mapExtraCallbackWithResult.get(((String) objArr2[0]).intern());
                if (obj == null) {
                    int i3 = ICustomTabsCallback + 49;
                    extraCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 4 / 2;
                    }
                    obj = "no_name";
                }
            } else {
                Object[] objArr3 = new Object[1];
                a((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 53889), (-1) - ExpandableListView.getPackedPositionChild(0L), new char[]{35572, 50324, 44328, 33010}, new char[]{0, 0, 0, 0}, new char[]{10436, 22018, 32770, 61138}, objArr3);
                obj = mapExtraCallbackWithResult.get(((String) objArr3[0]).intern());
                if (obj == null) {
                }
            }
        }
        Map<String, Object> mapExtraCallbackWithResult2 = interfaceC0059deInitialize.extraCallbackWithResult();
        if (mapExtraCallbackWithResult2 != null) {
            Object[] objArr4 = new Object[1];
            a((char) (63053 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 807621027 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{51006, 63090, 11497}, new char[]{0, 0, 0, 0}, new char[]{41841, 9041, 19760, 30454}, objArr4);
            Object obj2 = mapExtraCallbackWithResult2.get(((String) objArr4[0]).intern());
            if (obj2 != null) {
                int i5 = ICustomTabsCallback + 91;
                extraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    obj2.toString();
                    throw null;
                }
                String string = obj2.toString();
                if (string == null || (strSubstringBefore$default2 = StringsKt.substringBefore$default(string, '?', (String) null, 2, (Object) null)) == null) {
                    strSubstringBefore$default = "no_url";
                } else {
                    int i6 = extraCallback + 111;
                    ICustomTabsCallback = i6 % 128;
                    int i7 = i6 % 2;
                    strSubstringBefore$default = StringsKt.substringBefore$default(strSubstringBefore$default2, '#', (String) null, 2, (Object) null);
                    if (strSubstringBefore$default == null) {
                    }
                }
            }
        }
        return checkValidPitchUnder.IAuthTabCallback(interfaceC0059deInitialize) + ":" + interfaceC0059deInitialize.IAuthTabCallbackStubProxy() + ":" + obj + ":" + strSubstringBefore$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r2
      0x002d: PHI (r2v5 java.util.Map<java.lang.String, java.lang.Object>) = (r2v4 java.util.Map<java.lang.String, java.lang.Object>), (r2v15 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:8:0x002b, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onRelationshipValidationResult(Object[] objArr) throws Throwable {
        Map<String, Object> mapExtraCallbackWithResult;
        Object objIntern;
        InterfaceC0059deInitialize interfaceC0059deInitialize = (InterfaceC0059deInitialize) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 95;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(interfaceC0059deInitialize, "");
            mapExtraCallbackWithResult = interfaceC0059deInitialize.extraCallbackWithResult();
            int i3 = 86 / 0;
            if (mapExtraCallbackWithResult != null) {
                Object[] objArr2 = new Object[1];
                b((byte) (114 - TextUtils.lastIndexOf("", '0', 0)), TextUtils.indexOf((CharSequence) "", '0') + 4, new char[]{22, 5, 13926}, objArr2);
                objIntern = mapExtraCallbackWithResult.get(((String) objArr2[0]).intern());
            } else {
                objIntern = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(interfaceC0059deInitialize, "");
            mapExtraCallbackWithResult = interfaceC0059deInitialize.extraCallbackWithResult();
            if (mapExtraCallbackWithResult != null) {
            }
        }
        String strIAuthTabCallback = checkValidPitchUnder.IAuthTabCallback(interfaceC0059deInitialize);
        if (objIntern == null) {
            Object[] objArr3 = new Object[1];
            a((char) KeyEvent.normalizeMetaState(0), 1871534888 - KeyEvent.keyCodeFromString(""), new char[]{32436, 36425, 641, 45164, 34756, 61485, 46351}, new char[]{0, 0, 0, 0}, new char[]{10484, 36187, 45679, 59627}, objArr3);
            objIntern = ((String) objArr3[0]).intern();
            int i4 = ICustomTabsCallback + 87;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return strIAuthTabCallback + ":ExoPlayerError:" + objIntern;
    }

    private static final String onTransact(InterfaceC0059deInitialize interfaceC0059deInitialize) throws Throwable {
        Object objIntern;
        Object obj;
        int i = 2 % 2;
        int i2 = extraCallback + 19;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(interfaceC0059deInitialize, "");
        Map<String, Object> mapExtraCallbackWithResult = interfaceC0059deInitialize.extraCallbackWithResult();
        if (mapExtraCallbackWithResult != null) {
            int i4 = ICustomTabsCallback + 125;
            extraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr = new Object[1];
                a((char) (31478 / TextUtils.indexOf((CharSequence) "", 'N', 0)), (-265288075) << TextUtils.getOffsetBefore("", 1), new char[]{23917, 57491, 20044}, new char[]{0, 0, 0, 0}, new char[]{30018, 12294, 28912, 30238}, objArr);
                objIntern = mapExtraCallbackWithResult.get(((String) objArr[0]).intern());
            } else {
                Object[] objArr2 = new Object[1];
                a((char) (7791 - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.getOffsetBefore("", 0) - 265288075, new char[]{23917, 57491, 20044}, new char[]{0, 0, 0, 0}, new char[]{30018, 12294, 28912, 30238}, objArr2);
                objIntern = mapExtraCallbackWithResult.get(((String) objArr2[0]).intern());
            }
        } else {
            objIntern = null;
        }
        String strIAuthTabCallback = checkValidPitchUnder.IAuthTabCallback(interfaceC0059deInitialize);
        if (objIntern == null) {
            int i5 = extraCallback + 97;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 != 0) {
                Process.getElapsedCpuTime();
                Object[] objArr3 = new Object[1];
                a((char) 0, (AudioTrack.getMaxVolume() > 1.0f ? 1 : (AudioTrack.getMaxVolume() == 1.0f ? 0 : -1)) * 1871534889, new char[]{32436, 36425, 641, 45164, 34756, 61485, 46351}, new char[]{0, 0, 0, 0}, new char[]{10484, 36187, 45679, 59627}, objArr3);
                obj = objArr3[0];
            } else {
                Object[] objArr4 = new Object[1];
                a((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 1871534889 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new char[]{32436, 36425, 641, 45164, 34756, 61485, 46351}, new char[]{0, 0, 0, 0}, new char[]{10484, 36187, 45679, 59627}, objArr4);
                obj = objArr4[0];
            }
            objIntern = ((String) obj).intern();
        }
        return strIAuthTabCallback + ":read_tuba_variable:" + objIntern;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onActivityResized(Object[] objArr) throws Throwable {
        Object obj;
        Object obj2;
        InterfaceC0059deInitialize interfaceC0059deInitialize = (InterfaceC0059deInitialize) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(interfaceC0059deInitialize, "");
        Map<String, Object> mapExtraCallbackWithResult = interfaceC0059deInitialize.extraCallbackWithResult();
        if (mapExtraCallbackWithResult != null) {
            int i2 = extraCallback + 57;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                mapExtraCallbackWithResult.get("serviceName");
                throw null;
            }
            obj = mapExtraCallbackWithResult.get("serviceName");
            if (obj == null) {
                int i3 = extraCallback + 95;
                ICustomTabsCallback = i3 % 128;
                int i4 = i3 % 2;
                obj = "no_service";
            }
        }
        Map<String, Object> mapExtraCallbackWithResult2 = interfaceC0059deInitialize.extraCallbackWithResult();
        if (mapExtraCallbackWithResult2 != null) {
            Object[] objArr2 = new Object[1];
            a((char) (View.resolveSize(0, 0) + 53888), (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{35572, 50324, 44328, 33010}, new char[]{0, 0, 0, 0}, new char[]{10436, 22018, 32770, 61138}, objArr2);
            obj2 = mapExtraCallbackWithResult2.get(((String) objArr2[0]).intern());
            if (obj2 == null) {
                obj2 = "no_method";
            }
        }
        String str = checkValidPitchUnder.IAuthTabCallback(interfaceC0059deInitialize) + ":" + interfaceC0059deInitialize.IAuthTabCallbackStubProxy() + ":" + obj + ":" + obj2;
        int i5 = extraCallback + 47;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private final void ITrustedWebActivityServiceDefault() throws Throwable {
        int i = 2 % 2;
        GetFeatureExtension getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
        getFeatureExtension.onNavigationEvent(new GetInputImageFromPathAsUnchanged.IAuthTabCallback(0L, DERSet.onExtraCallback.MediaSessionCompatQueueItem(), 0L, 5, null));
        Function1 function1 = new Function1() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda18
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 29;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                String strOnExtraCallbackWithResult = TossApplication.onExtraCallbackWithResult((InterfaceC0059deInitialize) obj);
                int i5 = onNavigationEvent + 83;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return strOnExtraCallbackWithResult;
            }
        };
        Object[] objArr = new Object[1];
        b((byte) (View.getDefaultSize(0, 0) + 123), ExpandableListView.getPackedPositionGroup(0L) + 16, new char[]{7, 23, 23, 24, '\f', 7, 18, 17, 19, 24, 3, '\t', '\f', 15, 14, 19}, objArr);
        GetFeatureExtension.IAuthTabCallback(getFeatureExtension, ((String) objArr[0]).intern(), function1, null, 4, null);
        GetFeatureExtension.IAuthTabCallback(getFeatureExtension, "ExoPlayerError", new Function1() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda19
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 87;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                String strOnWarmupCompleted = TossApplication.onWarmupCompleted((InterfaceC0059deInitialize) obj);
                if (i4 != 0) {
                    int i5 = 12 / 0;
                }
                int i6 = IAuthTabCallback + 59;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    return strOnWarmupCompleted;
                }
                throw null;
            }
        }, null, 4, null);
        GetFeatureExtension.IAuthTabCallback(getFeatureExtension, "read_tuba_variable", new Function1() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda20
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 49;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                String strOnNavigationEvent = TossApplication.onNavigationEvent((InterfaceC0059deInitialize) obj);
                int i5 = onWarmupCompleted + 21;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return strOnNavigationEvent;
            }
        }, null, 4, null);
        Object[] objArr2 = new Object[1];
        b((byte) (102 - KeyEvent.getDeadChar(0, 0)), 29 - (ViewConfiguration.getJumpTapTimeout() >> 16), new char[]{7, 23, 23, 2, 17, 4, 14, 15, 6, 11, 13903, 13903, 18, '\t', 13904, 13904, 22, '\b', 7, 22, 19, 11, 18, 14, '\t', 5, 14, 19, 13924}, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b((byte) (16 - ExpandableListView.getPackedPositionType(0L)), 28 - (ViewConfiguration.getTapTimeout() >> 16), new char[]{7, 23, 23, 2, 17, 4, 14, 15, 6, 11, 13817, 13817, 18, '\t', 13818, 13818, 22, '\b', 7, 22, 19, 11, 24, 19, 13816, 13816, 7, '\b'}, objArr3);
        Iterator it = CollectionsKt.listOf(new String[]{strIntern, ((String) objArr3[0]).intern()}).iterator();
        int i2 = extraCallback + 31;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            GetFeatureExtension.IAuthTabCallback(GetFeatureExtension.onWarmupCompleted, (String) it.next(), new Function1() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda21
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 113;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    String strIAuthTabCallback = TossApplication.IAuthTabCallback((InterfaceC0059deInitialize) obj);
                    int i7 = onWarmupCompleted + 123;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        return strIAuthTabCallback;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }, null, 4, null);
        }
        GetFeatureExtension.onWarmupCompleted.onExtraCallback(new Function1() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda22
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 117;
                IAuthTabCallback = i5 % 128;
                InterfaceC0059deInitialize interfaceC0059deInitialize = (InterfaceC0059deInitialize) obj;
                if (i5 % 2 == 0) {
                    return TossApplication.onExtraCallback(interfaceC0059deInitialize);
                }
                TossApplication.onExtraCallback(interfaceC0059deInitialize);
                throw null;
            }
        }, new GetInputImageFromPathAsUnchanged.IAuthTabCallback(0L, 2000, 0L, 5, null));
    }

    private static final String IAuthTabCallbackStub(InterfaceC0059deInitialize interfaceC0059deInitialize) {
        DomainLogPayload domainLogPayload;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 51;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(interfaceC0059deInitialize, "");
        if (!(interfaceC0059deInitialize instanceof DomainLogPayload)) {
            int i4 = extraCallback + 27;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            domainLogPayload = null;
        } else {
            int i6 = ICustomTabsCallback + 39;
            extraCallback = i6 % 128;
            domainLogPayload = (DomainLogPayload) interfaceC0059deInitialize;
            if (i6 % 2 == 0) {
                int i7 = 97 / 0;
            }
        }
        if (domainLogPayload == null) {
            return null;
        }
        return checkValidPitchUnder.IAuthTabCallback(domainLogPayload) + ":domain:" + domainLogPayload.onExtraCallback();
    }

    private final void ITrustedWebActivityService_Parcel() {
        int i = 2 % 2;
        onResponse onresponse = onResponse.onWarmupCompleted;
        DERSet dERSet = DERSet.onExtraCallback;
        ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1 = readTypedObject().get();
        Intrinsics.checkNotNullExpressionValue(aLCFaceSDK4ExternalSyntheticLambda1, "");
        onresponse.onExtraCallbackWithResult(dERSet, aLCFaceSDK4ExternalSyntheticLambda1, new Function0() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda8
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 5;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                TossApplication tossApplication = this.f$0;
                if (i4 == 0) {
                    return TossApplication.onNavigationEvent(tossApplication);
                }
                TossApplication.onNavigationEvent(tossApplication);
                throw null;
            }
        });
        int i2 = ICustomTabsCallback + 23;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (o.onResponse.onWarmupCompleted.onExtraCallback() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if ((!o.onResponse.onWarmupCompleted.onExtraCallback()) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r3 = r3.writeTypedObject().get();
        r1 = im.toss.TossApplication.ICustomTabsCallback + 121;
        im.toss.TossApplication.extraCallback = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final ALCFaceSDK4ExternalSyntheticLambda1 onRelationshipValidationResult(TossApplication tossApplication) {
        int i = 2 % 2;
        int i2 = extraCallback + 117;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 52 / 0;
        }
    }

    private static /* synthetic */ Object ICustomTabsCallbackStub(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 107;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            setTopGuideText settopguidetext = setTopGuideText.onWarmupCompleted;
            calculateMaxTextSize calculatemaxtextsize = tossApplication.receiveFile().get();
            Intrinsics.checkNotNullExpressionValue(calculatemaxtextsize, "");
            settopguidetext.onWarmupCompleted(calculatemaxtextsize);
            int i3 = 65 / 0;
            return null;
        }
        setTopGuideText settopguidetext2 = setTopGuideText.onWarmupCompleted;
        calculateMaxTextSize calculatemaxtextsize2 = tossApplication.receiveFile().get();
        Intrinsics.checkNotNullExpressionValue(calculatemaxtextsize2, "");
        settopguidetext2.onWarmupCompleted(calculatemaxtextsize2);
        return null;
    }

    private static final String ICustomTabsCallbackStub(TossApplication tossApplication) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 29;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        getPricingPhaseList getpricingphaselist = tossApplication.ICustomTabsServiceStub().get();
        if (i3 != 0) {
            return getpricingphaselist.getCode();
        }
        getpricingphaselist.getCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class readTypedObject extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        int label;

        readTypedObject(access13800<? super readTypedObject> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            readTypedObject readtypedobject = TossApplication.this.new readTypedObject(access13800Var);
            int i2 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 18 / 0;
            }
            return readtypedobject;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            TossApplication.this.setEngagementSignalsCallback().get().onExtraCallbackWithResult();
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    static final class extraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        int label;

        extraCallback(access13800<? super extraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            extraCallback extracallback = TossApplication.this.new extraCallback(access13800Var);
            int i2 = IAuthTabCallback + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return extracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = 47 / 0;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 51;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                RealmDbManager realmDbManager = TossApplication.this.mayLaunchUrl().get();
                this.label = 1;
                if (realmDbManager.onWarmupCompleted(this) == objOnWarmupCompleted) {
                    int i3 = onNavigationEvent + 111;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = IAuthTabCallback + 95;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends Unit>>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private /* synthetic */ Object L$0;
        int label;

        access000(access13800<? super access000> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access000 access000Var = TossApplication.this.new access000(access13800Var);
            access000Var.L$0 = obj;
            int i2 = onExtraCallback + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return access000Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Result<Unit>> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Result<Unit>> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 29;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = i3 + 87;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.onNavigationEvent(obj);
            onDisappear.onWarmupCompleted(TossApplication.this);
            TossApplication tossApplication = TossApplication.this;
            try {
                Result.Companion companion = Result.Companion;
                r8lambdaJvNhqeMSZnDqkobDnvayz6SKORQ.onExtraCallback.onExtraCallbackWithResult(tossApplication);
                obj2 = Result.constructor-impl(Unit.INSTANCE);
                int i6 = onExtraCallbackWithResult + 115;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(th));
            }
            return Result.IAuthTabCallback(obj2);
        }
    }

    static final class asBinder extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ GeckoHubImp1<Result<Unit>> $deferredLazyReactNativeInit;
        final /* synthetic */ GeckoHubImp1<Unit> $deferredLazyRealmInit;
        final /* synthetic */ GeckoHubImp1<Unit> $deferredTossLibInit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(GeckoHubImp1<Unit> geckoHubImp1, GeckoHubImp1<Result<Unit>> geckoHubImp12, GeckoHubImp1<Unit> geckoHubImp13, access13800<? super asBinder> access13800Var) {
            super(1, access13800Var);
            this.$deferredLazyRealmInit = geckoHubImp1;
            this.$deferredLazyReactNativeInit = geckoHubImp12;
            this.$deferredTossLibInit = geckoHubImp13;
        }

        public final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = new asBinder(this.$deferredLazyRealmInit, this.$deferredLazyReactNativeInit, this.$deferredTossLibInit, access13800Var);
            int i2 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((access13800) obj);
            int i4 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 93;
                int i4 = i3 % 128;
                onWarmupCompleted = i4;
                int i5 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i4 + 113;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.$deferredLazyRealmInit.IAuthTabCallback_Parcel();
                this.$deferredLazyReactNativeInit.IAuthTabCallback_Parcel();
                GeckoHubImp1<Unit> geckoHubImp1 = this.$deferredTossLibInit;
                this.label = 1;
                if (geckoHubImp1.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    int i7 = onExtraCallbackWithResult + 111;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 58 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        GeckoHubImp1 geckoHubImp1 = (GeckoHubImp1) objArr[0];
        GeckoHubImp1 geckoHubImp12 = (GeckoHubImp1) objArr[1];
        GeckoHubImp1 geckoHubImp13 = (GeckoHubImp1) objArr[2];
        enableAndroidLinearText enableandroidlineartext = (enableAndroidLinearText) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(enableandroidlineartext, "");
        enableandroidlineartext.onNavigationEvent("preloadNativeLibs", new asBinder(geckoHubImp1, geckoHubImp12, geckoHubImp13, null));
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallback + 45;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends Unit>>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private /* synthetic */ Object L$0;
        int label;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = TossApplication.this.new onTransact(access13800Var);
            ontransact.L$0 = obj;
            int i2 = onExtraCallback + 31;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return ontransact;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Result<Unit>> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Result<Unit>> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 31;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            TossApplication tossApplication = TossApplication.this;
            try {
                Result.Companion companion = Result.Companion;
                tossApplication.IPostMessageServiceDefault();
                obj2 = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj2);
            if (th2 != null) {
                int i3 = IAuthTabCallback + 71;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossApplication", "Failed to init AbnormalLogger", th2, (Map) null, 8, (Object) null);
            }
            Result resultIAuthTabCallback = Result.IAuthTabCallback(obj2);
            int i5 = IAuthTabCallback + 43;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return resultIAuthTabCallback;
        }
    }

    static final class asInterface extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int label;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(1, access13800Var);
        }

        public final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            asInterface asinterfaceCreate = create(access13800Var);
            if (i3 != 0) {
                return asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
            }
            asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = TossApplication.this.new asInterface(access13800Var);
            int i2 = onExtraCallback + 19;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return asinterface;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((access13800) obj);
            int i4 = IAuthTabCallback + 97;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = IAuthTabCallback + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            TossApplication.this.requestPostMessageChannel().get();
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 113;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 21 / 0;
            }
            return unit;
        }
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        int label;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(1, access13800Var);
        }

        public final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefaultCreate = create(access13800Var);
            if (i3 == 0) {
                return iAuthTabCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
            }
            iAuthTabCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = TossApplication.this.new IAuthTabCallbackDefault(access13800Var);
            int i2 = onWarmupCompleted + 37;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallbackDefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onWarmupCompleted = i2 % 128;
            access13800<? super Unit> access13800Var = (access13800) obj;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(access13800Var);
            }
            IAuthTabCallback(access13800Var);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            UST_CERT_GetSubjectKeyIdentifier.onExtraCallback.onExtraCallbackWithResult(TossApplication.this);
            Unit unit = Unit.INSTANCE;
            int i3 = onWarmupCompleted + 113;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 77 / 0;
            }
            return unit;
        }
    }

    private static final Unit onExtraCallbackWithResult(TossApplication tossApplication, TossApplication tossApplication2, enableAndroidLinearText enableandroidlineartext) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(enableandroidlineartext, "");
        enableandroidlineartext.onExtraCallbackWithResult("leakCanary", tossApplication.new asInterface(null));
        enableandroidlineartext.onNavigationEvent("FlipperHelper.init", tossApplication2.new IAuthTabCallbackDefault(null));
        Unit unit = Unit.INSTANCE;
        int i2 = extraCallback + 109;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    static final class ICustomTabsCallback extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        int label;

        ICustomTabsCallback(access13800<? super ICustomTabsCallback> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsCallback iCustomTabsCallback = TossApplication.this.new ICustomTabsCallback(access13800Var);
            int i2 = IAuthTabCallback + 113;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 56 / 0;
            }
            return iCustomTabsCallback;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((access13800) obj);
            int i4 = onExtraCallback + 79;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 19;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            TossApplication.this.prefetchWithMultipleUrls().get().onTransact();
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 49;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static final class extraCallbackWithResult extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int label;

        extraCallbackWithResult(access13800<? super extraCallbackWithResult> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            extraCallbackWithResult extracallbackwithresult = TossApplication.this.new extraCallbackWithResult(access13800Var);
            int i2 = onWarmupCompleted + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return extracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            onExtraCallback = i2 % 128;
            access13800<? super Unit> access13800Var = (access13800) obj;
            if (i2 % 2 == 0) {
                return onNavigationEvent(access13800Var);
            }
            onNavigationEvent(access13800Var);
            throw null;
        }

        public final Object onNavigationEvent(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 105;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 75;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i6 == 0) {
                DetectClosedEyes.onWarmupCompleted.IAuthTabCallback(((AsyncImagePainterExternalSyntheticLambda0) ((Lazy) TossApplication.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{TossApplication.this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 757524558, -757524544)).get()).onWarmupCompleted());
                return Unit.INSTANCE;
            }
            DetectClosedEyes.onWarmupCompleted.IAuthTabCallback(((AsyncImagePainterExternalSyntheticLambda0) ((Lazy) TossApplication.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{TossApplication.this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 757524558, -757524544)).get()).onWarmupCompleted());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
    }

    static final class writeTypedObject extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int label;

        writeTypedObject(access13800<? super writeTypedObject> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            writeTypedObject writetypedobject = TossApplication.this.new writeTypedObject(access13800Var);
            int i2 = onExtraCallback + 33;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 39 / 0;
            }
            return writetypedobject;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((access13800) obj);
            int i4 = onExtraCallback + 121;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 111;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 111;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            TossApplication.extraCallbackWithResult(TossApplication.this);
            return Unit.INSTANCE;
        }
    }

    static final class onActivityLayout extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ TossApplication $appContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onActivityLayout(TossApplication tossApplication, access13800<? super onActivityLayout> access13800Var) {
            super(1, access13800Var);
            this.$appContext = tossApplication;
        }

        public final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 31;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onActivityLayout onactivitylayout = TossApplication.this.new onActivityLayout(this.$appContext, access13800Var);
            int i2 = onWarmupCompleted + 99;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onactivitylayout;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((access13800) obj);
            int i4 = IAuthTabCallback + 1;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onWarmupCompleted + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            TossApplication.readTypedObject(TossApplication.this);
            ALCAntiSpoofingFaceQuality aLCAntiSpoofingFaceQuality = ALCAntiSpoofingFaceQuality.onExtraCallback;
            TossApplication tossApplication = this.$appContext;
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = TossApplication.this.onSessionEnded().get();
            Intrinsics.checkNotNullExpressionValue(textRoundCornerProgressBarSavedState1, "");
            int iOnExtraCallback = onSessionEnded.onExtraCallback();
            int iOnExtraCallback2 = onSessionEnded.onExtraCallback();
            int iOnExtraCallback3 = onSessionEnded.onExtraCallback();
            ALCAntiSpoofingFaceQuality.IAuthTabCallback(onSessionEnded.onExtraCallback(), iOnExtraCallback2, -1562967437, 1562967437, iOnExtraCallback3, new Object[]{aLCAntiSpoofingFaceQuality, tossApplication, textRoundCornerProgressBarSavedState1}, iOnExtraCallback);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 107;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 58 / 0;
            }
            return unit;
        }
    }

    private static final Unit onNavigationEvent(TossApplication tossApplication, TossApplication tossApplication2, enableAndroidLinearText enableandroidlineartext) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(enableandroidlineartext, "");
        enableandroidlineartext.onNavigationEvent("initTossClock", tossApplication.new ICustomTabsCallback(null));
        enableandroidlineartext.IAuthTabCallback("AesCipher", tossApplication.new extraCallbackWithResult(null));
        enableandroidlineartext.onExtraCallbackWithResult("RxAndroidPlugins", tossApplication.new writeTypedObject(null));
        enableandroidlineartext.onNavigationEvent("initTubaVarsV1", tossApplication.new onActivityLayout(tossApplication2, null));
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallback + 79;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 94 / 0;
        }
        return unit;
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        int label;

        IAuthTabCallback_Parcel(access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = TossApplication.this.new IAuthTabCallback_Parcel(access13800Var);
            int i2 = onNavigationEvent + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback_Parcel;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 99;
            onNavigationEvent = i2 % 128;
            access13800<? super Unit> access13800Var = (access13800) obj;
            if (i2 % 2 != 0) {
                onNavigationEvent(access13800Var);
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(access13800Var);
            int i3 = onWarmupCompleted + 113;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 79 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 123;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            TossApplication.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{TossApplication.this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -294392397, 294392407);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 67;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 21 / 0;
            }
            return unit;
        }
    }

    static final class access100 extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ enableAndroidLinearText $this_parallelLoad;
        int label;
        final /* synthetic */ TossApplication this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access100(enableAndroidLinearText enableandroidlineartext, TossApplication tossApplication, access13800<? super access100> access13800Var) {
            super(1, access13800Var);
            this.$this_parallelLoad = enableandroidlineartext;
            this.this$0 = tossApplication;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            access100 access100Var = new access100(this.$this_parallelLoad, this.this$0, access13800Var);
            int i2 = onWarmupCompleted + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return access100Var;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((access13800) obj);
            int i4 = onNavigationEvent + 81;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 89;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            maybeUpdateAnimatable.onNavigationEvent(this.$this_parallelLoad, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass4(this.this$0, null), 3, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 21;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        /* renamed from: im.toss.TossApplication$access100$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            int label;
            final /* synthetic */ TossApplication this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(TossApplication tossApplication, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.this$0 = tossApplication;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, access13800Var);
                int i2 = onExtraCallbackWithResult + 29;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass4;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 59;
                onExtraCallback = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    return onExtraCallback(findresandmsg, access13800Var);
                }
                onExtraCallback(findresandmsg, access13800Var);
                throw null;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 81;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass4 anonymousClass4Create = create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    return anonymousClass4Create.invokeSuspend(unit);
                }
                anonymousClass4Create.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 93;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                this.this$0.getInterfaceDescriptor().get().IAuthTabCallback();
                Unit unit = Unit.INSTANCE;
                int i4 = onExtraCallback + 37;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        }
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        int label;

        IAuthTabCallbackStubProxy(access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(1, access13800Var);
        }

        public final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 105;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 69 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = TossApplication.this.new IAuthTabCallbackStubProxy(access13800Var);
            int i2 = onExtraCallback + 117;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallbackStubProxy;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onExtraCallback = i2 % 128;
            access13800<? super Unit> access13800Var = (access13800) obj;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(access13800Var);
            }
            IAuthTabCallback(access13800Var);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 71;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 105;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            isBlockMonitorEnable.IAuthTabCallback(-326400643, new Object[]{isBlockMonitorEnable.onExtraCallback, TossApplication.this}, 326400647, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback());
            return Unit.INSTANCE;
        }
    }

    static final class getInterfaceDescriptor extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        int label;

        getInterfaceDescriptor(access13800<? super getInterfaceDescriptor> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            getInterfaceDescriptor getinterfacedescriptor = TossApplication.this.new getInterfaceDescriptor(access13800Var);
            int i2 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return getinterfacedescriptor;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            Object obj2 = null;
            access13800<? super Unit> access13800Var = (access13800) obj;
            if (i2 % 2 != 0) {
                onWarmupCompleted(access13800Var);
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(access13800Var);
            int i3 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            obj2.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getInterfaceDescriptor getinterfacedescriptorCreate = create(access13800Var);
            if (i3 != 0) {
                return getinterfacedescriptorCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 86 / 0;
            return getinterfacedescriptorCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 91;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = i2 + 71;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.onNavigationEvent(obj);
            ((Lazy) TossApplication.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{TossApplication.this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 483119486, -483119468)).get();
            return Unit.INSTANCE;
        }
    }

    private static final Unit onNavigationEvent(TossApplication tossApplication, enableAndroidLinearText enableandroidlineartext) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(enableandroidlineartext, "");
        Object obj = null;
        enableandroidlineartext.onNavigationEvent("trackSeedGeneratedEvent", tossApplication.new IAuthTabCallback_Parcel(null));
        enableandroidlineartext.onNavigationEvent("initPinUiType", new access100(enableandroidlineartext, tossApplication, null));
        enableandroidlineartext.onExtraCallbackWithResult("MemoryAnomalyMonitor.install", tossApplication.new IAuthTabCallbackStubProxy(null));
        enableandroidlineartext.onNavigationEvent("appLockChecker.warmup", tossApplication.new getInterfaceDescriptor(null));
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallback + 61;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    static final class onMinimized extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        int label;

        onMinimized(access13800<? super onMinimized> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onMinimized onminimized = TossApplication.this.new onMinimized(access13800Var);
            int i2 = onWarmupCompleted + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onminimized;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((access13800) obj);
            int i4 = onWarmupCompleted + 55;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onMinimized onminimizedCreate = create(access13800Var);
            if (i3 == 0) {
                return onminimizedCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 12 / 0;
            return onminimizedCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 57;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 121;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i6 == 0) {
                TossApplication.onMessageChannelReady(TossApplication.this);
                return Unit.INSTANCE;
            }
            TossApplication.onMessageChannelReady(TossApplication.this);
            Unit unit = Unit.INSTANCE;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static final class onPostMessage extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        int label;

        onPostMessage(access13800<? super onPostMessage> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onPostMessage onpostmessage = TossApplication.this.new onPostMessage(access13800Var);
            int i2 = IAuthTabCallback + 109;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 9 / 0;
            }
            return onpostmessage;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            IAuthTabCallback = i2 % 128;
            access13800<? super Unit> access13800Var = (access13800) obj;
            if (i2 % 2 != 0) {
                onExtraCallback(access13800Var);
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(access13800Var);
            int i3 = IAuthTabCallback + 33;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 81;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            AppStateManager.onExtraCallbackWithResult.onNavigationEvent(TossApplication.this);
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallback + 77;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    static final class onMessageChannelReady extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ TossApplication $appContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onMessageChannelReady(TossApplication tossApplication, access13800<? super onMessageChannelReady> access13800Var) {
            super(1, access13800Var);
            this.$appContext = tossApplication;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onMessageChannelReady onmessagechannelready = TossApplication.this.new onMessageChannelReady(this.$appContext, access13800Var);
            int i2 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onmessagechannelready;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((access13800) obj);
            if (i3 == 0) {
                int i4 = 97 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 81 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 115;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            TossApplication.this.postMessage().get().onWarmupCompleted(this.$appContext);
            Unit unit = Unit.INSTANCE;
            int i7 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    static final class ICustomTabsCallbackDefault extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int label;

        ICustomTabsCallbackDefault(access13800<? super ICustomTabsCallbackDefault> access13800Var) {
            super(1, access13800Var);
        }

        public final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 85;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 75 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsCallbackDefault iCustomTabsCallbackDefault = TossApplication.this.new ICustomTabsCallbackDefault(access13800Var);
            int i2 = onExtraCallback + 29;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return iCustomTabsCallbackDefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((access13800) obj);
            if (i3 == 0) {
                int i4 = 92 / 0;
            }
            int i5 = IAuthTabCallback + 101;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 18 / 0;
            }
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 11;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i6 != 0) {
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = TossApplication.this.IAuthTabCallback_Parcel().get();
                Intrinsics.checkNotNullExpressionValue(activityLifecycleCallbacks, "");
                TossApplication.this.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                return Unit.INSTANCE;
            }
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = TossApplication.this.IAuthTabCallback_Parcel().get();
            Intrinsics.checkNotNullExpressionValue(activityLifecycleCallbacks2, "");
            TossApplication.this.registerActivityLifecycleCallbacks(activityLifecycleCallbacks2);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(TossApplication tossApplication, TossApplication tossApplication2, GeckoHubImp1 geckoHubImp1, enableAndroidLinearText enableandroidlineartext) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(enableandroidlineartext, "");
        Object[] objArr = new Object[1];
        a((char) (3643 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (-553867414) - (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{49560, 51498, 36655, 12592, 54212, 21817, 46154, 47540, 50129, 59021, 61088, 35383, 63145}, new char[]{0, 0, 0, 0}, new char[]{27192, 64679, 15326, 26126}, objArr);
        enableandroidlineartext.onNavigationEvent(((String) objArr[0]).intern(), tossApplication.new onMinimized(null));
        enableandroidlineartext.onNavigationEvent("AppState.onAppCreate", tossApplication2.new onPostMessage(null));
        enableandroidlineartext.onNavigationEvent("SessionState.onAppCreate", tossApplication.new onMessageChannelReady(tossApplication2, null));
        enableandroidlineartext.onNavigationEvent("AppStateHandler.init", new onActivityResized(tossApplication, (access13800) null));
        enableandroidlineartext.onNavigationEvent("AppsInTossLifecycleCallbacks.init", tossApplication.new ICustomTabsCallbackDefault(null));
        enableandroidlineartext.onNavigationEvent("TossTracker.init", new ICustomTabsCallbackStub(tossApplication, geckoHubImp1, tossApplication2, (access13800) null));
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallback + 67;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    static final class ICustomTabsCallbackStubProxy extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int label;

        ICustomTabsCallbackStubProxy(access13800<? super ICustomTabsCallbackStubProxy> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsCallbackStubProxy iCustomTabsCallbackStubProxy = TossApplication.this.new ICustomTabsCallbackStubProxy(access13800Var);
            int i2 = onExtraCallbackWithResult + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iCustomTabsCallbackStubProxy;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((access13800) obj);
            int i4 = onExtraCallback + 19;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 65 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 23;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            GetFeatureExtension.onWarmupCompleted.onExtraCallback(TossApplication.this, new UST_CERT_GetSubjectDN());
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 73;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    static final class extraCommand extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        int label;

        extraCommand(access13800<? super extraCommand> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            extraCommand extracommand = TossApplication.this.new extraCommand(access13800Var);
            int i2 = onExtraCallback + 5;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return extracommand;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            onExtraCallback = i2 % 128;
            Object obj2 = null;
            access13800<? super Unit> access13800Var = (access13800) obj;
            if (i2 % 2 != 0) {
                onExtraCallback(access13800Var);
                obj2.hashCode();
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(access13800Var);
            int i3 = onExtraCallback + 67;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnExtraCallback;
            }
            obj2.hashCode();
            throw null;
        }

        public final Object onExtraCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 45;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onNavigationEvent + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            TossApplication.this.newAuthTabSession().get().onNavigationEvent();
            GetFeatureExtension getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
            ComputeDistance computeDistance = TossApplication.this.ICustomTabsServiceStubProxy().get();
            Intrinsics.checkNotNullExpressionValue(computeDistance, "");
            getFeatureExtension.onExtraCallbackWithResult(computeDistance);
            ComputeDistance computeDistance2 = TossApplication.this.newSession().get();
            Intrinsics.checkNotNullExpressionValue(computeDistance2, "");
            getFeatureExtension.onExtraCallbackWithResult(computeDistance2);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 5;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    static final class ICustomTabsService extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ enableAndroidLinearText $this_parallelLoad;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ICustomTabsService(enableAndroidLinearText enableandroidlineartext, access13800<? super ICustomTabsService> access13800Var) {
            super(1, access13800Var);
            this.$this_parallelLoad = enableandroidlineartext;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsService iCustomTabsService = TossApplication.this.new ICustomTabsService(this.$this_parallelLoad, access13800Var);
            int i2 = onNavigationEvent + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iCustomTabsService;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((access13800) obj);
            if (i3 == 0) {
                int i4 = 92 / 0;
            }
            int i5 = IAuthTabCallback + 111;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 11 / 0;
            }
            return objInvokeSuspend;
        }

        /* renamed from: im.toss.TossApplication$ICustomTabsService$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            int label;
            final /* synthetic */ TossApplication this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TossApplication tossApplication, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.this$0 = tossApplication;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, access13800Var);
                int i2 = onExtraCallbackWithResult + 71;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass1;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                Object objOnWarmupCompleted;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 55;
                onExtraCallbackWithResult = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
                    int i3 = 58 / 0;
                } else {
                    objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
                }
                int i4 = onExtraCallbackWithResult + 27;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 101;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 79;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 65;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 != 0) {
                    int i5 = onWarmupCompleted + 41;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0 ? i4 != 1 : i4 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    CacheControlBuilder cacheControlBuilder = CacheControlBuilder.onExtraCallbackWithResult;
                    TossApplication tossApplication = this.this$0;
                    this.label = 1;
                    if (cacheControlBuilder.onExtraCallback(tossApplication, this) == objOnWarmupCompleted) {
                        int i6 = onExtraCallbackWithResult + 77;
                        onWarmupCompleted = i6 % 128;
                        if (i6 % 2 == 0) {
                            return objOnWarmupCompleted;
                        }
                        throw null;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback + 33;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i4 = onNavigationEvent + 91;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                TossApplication tossApplication = TossApplication.this;
                this.label = 1;
                if (TossApplication.onNavigationEvent(tossApplication, (access13800) this) == objOnWarmupCompleted) {
                    int i6 = IAuthTabCallback + 81;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 80 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            }
            maybeUpdateAnimatable.onNavigationEvent(this.$this_parallelLoad, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass1(TossApplication.this, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    static final class ICustomTabsCallback_Parcel extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int label;

        ICustomTabsCallback_Parcel(access13800<? super ICustomTabsCallback_Parcel> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsCallback_Parcel iCustomTabsCallback_Parcel = TossApplication.this.new ICustomTabsCallback_Parcel(access13800Var);
            int i2 = onNavigationEvent + 51;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return iCustomTabsCallback_Parcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((access13800) obj);
            int i4 = onNavigationEvent + 105;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 91;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 45 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onExtraCallback + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            TossApplication.onActivityLayout(TossApplication.this);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 43;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    static final class isEngagementSignalsApiAvailable extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        int label;

        isEngagementSignalsApiAvailable(access13800<? super isEngagementSignalsApiAvailable> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            isEngagementSignalsApiAvailable isengagementsignalsapiavailable = TossApplication.this.new isEngagementSignalsApiAvailable(access13800Var);
            int i2 = IAuthTabCallback + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return isengagementsignalsapiavailable;
        }

        public /* synthetic */ Object invoke(Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onWarmupCompleted = i2 % 128;
            access13800<? super Unit> access13800Var = (access13800) obj;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(access13800Var);
            }
            onWarmupCompleted(access13800Var);
            throw null;
        }

        public final Object onWarmupCompleted(access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            isEngagementSignalsApiAvailable isengagementsignalsapiavailableCreate = create(access13800Var);
            if (i3 != 0) {
                isengagementsignalsapiavailableCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = isengagementsignalsapiavailableCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 57;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 35;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 35;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            TossApplication.onPostMessage(TossApplication.this);
            Unit unit = Unit.INSTANCE;
            int i7 = onWarmupCompleted + 29;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    static final class mayLaunchUrl extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int label;

        mayLaunchUrl(access13800<? super mayLaunchUrl> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            mayLaunchUrl maylaunchurl = TossApplication.this.new mayLaunchUrl(access13800Var);
            int i2 = onExtraCallback + 87;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return maylaunchurl;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onWarmupCompleted = i2 % 128;
            access13800<? super Unit> access13800Var = (access13800) obj;
            if (i2 % 2 == 0) {
                onNavigationEvent(access13800Var);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(access13800Var);
            int i3 = onExtraCallback + 65;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 13 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 119;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            TossApplication.onActivityResized(TossApplication.this);
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallback + 61;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
    }

    static final class newAuthTabSession extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ GeckoHubImp1<Unit> $deferredLazyRealmInit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        newAuthTabSession(GeckoHubImp1<Unit> geckoHubImp1, access13800<? super newAuthTabSession> access13800Var) {
            super(1, access13800Var);
            this.$deferredLazyRealmInit = geckoHubImp1;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            newAuthTabSession newauthtabsession = new newAuthTabSession(this.$deferredLazyRealmInit, access13800Var);
            int i2 = onNavigationEvent + 25;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 8 / 0;
            }
            return newauthtabsession;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((access13800) obj);
            if (i3 == 0) {
                int i4 = 70 / 0;
            }
            int i5 = onWarmupCompleted + 21;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            newAuthTabSession newauthtabsessionCreate = create(access13800Var);
            if (i3 == 0) {
                newauthtabsessionCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = newauthtabsessionCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 13;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                GeckoHubImp1<Unit> geckoHubImp1 = this.$deferredLazyRealmInit;
                this.label = 1;
                if (geckoHubImp1.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    int i3 = onWarmupCompleted + 63;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 67;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    static final class newSessionWithExtras extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ TossApplication $appContext;
        final /* synthetic */ GeckoHubImp1<Result<Unit>> $deferredLazyReactNativeInit;
        int label;
        final /* synthetic */ TossApplication this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        newSessionWithExtras(GeckoHubImp1<Result<Unit>> geckoHubImp1, TossApplication tossApplication, TossApplication tossApplication2, access13800<? super newSessionWithExtras> access13800Var) {
            super(1, access13800Var);
            this.$deferredLazyReactNativeInit = geckoHubImp1;
            this.this$0 = tossApplication;
            this.$appContext = tossApplication2;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            newSessionWithExtras newsessionwithextras = new newSessionWithExtras(this.$deferredLazyReactNativeInit, this.this$0, this.$appContext, access13800Var);
            int i2 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 37 / 0;
            }
            return newsessionwithextras;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((access13800) obj);
            int i4 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 31 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[PHI: r1
          0x0040: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
          0x0024: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 40 / 0;
                if (i != 0) {
                    int i5 = IAuthTabCallback + 107;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0 ? i != 1 : i != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    GeckoHubImp1<Result<Unit>> geckoHubImp1 = this.$deferredLazyReactNativeInit;
                    this.label = 1;
                    if (geckoHubImp1.IAuthTabCallback(this) == objOnWarmupCompleted) {
                        int i6 = onExtraCallbackWithResult + 57;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        return objOnWarmupCompleted;
                    }
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            this.this$0.isEngagementSignalsApiAvailable().get().onExtraCallbackWithResult(this.$appContext);
            return Unit.INSTANCE;
        }
    }

    static final class newSession extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ TossApplication $appContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        newSession(TossApplication tossApplication, access13800<? super newSession> access13800Var) {
            super(1, access13800Var);
            this.$appContext = tossApplication;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            newSession newsession = TossApplication.this.new newSession(this.$appContext, access13800Var);
            int i2 = onExtraCallback + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return newsession;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((access13800) obj);
            int i4 = onExtraCallback + 13;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            newSession newsessionCreate = create(access13800Var);
            if (i3 == 0) {
                newsessionCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = newsessionCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 67;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onNavigationEvent + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            TossApplication.this.onUnminimized().get().onNavigationEvent(this.$appContext);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 121;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    static final class onUnminimized extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ TossApplication $appContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onUnminimized(TossApplication tossApplication, access13800<? super onUnminimized> access13800Var) {
            super(1, access13800Var);
            this.$appContext = tossApplication;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onUnminimized onunminimized = TossApplication.this.new onUnminimized(this.$appContext, access13800Var);
            int i2 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onunminimized;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i2 % 128;
            access13800<? super Unit> access13800Var = (access13800) obj;
            if (i2 % 2 == 0) {
                onWarmupCompleted(access13800Var);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(access13800Var);
            int i3 = onExtraCallbackWithResult + 33;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
        
            if ((r1 % 2) == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        
            r4 = null;
            r4.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r3.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r3.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r4);
            r3.this$0.warmup().get().onExtraCallbackWithResult(r3.$appContext);
            r4 = kotlin.Unit.INSTANCE;
            r1 = im.toss.TossApplication.onUnminimized.onExtraCallbackWithResult + 79;
            im.toss.TossApplication.onUnminimized.onWarmupCompleted = r1 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 65 / 0;
            }
        }
    }

    static final class onRelationshipValidationResult extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        int label;

        onRelationshipValidationResult(access13800<? super onRelationshipValidationResult> access13800Var) {
            super(1, access13800Var);
        }

        public final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 113;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onRelationshipValidationResult onrelationshipvalidationresult = TossApplication.this.new onRelationshipValidationResult(access13800Var);
            int i2 = onWarmupCompleted + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onrelationshipvalidationresult;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((access13800) obj);
            int i4 = onWarmupCompleted + 41;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 69;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            ((addMetadata) ((Lazy) TossApplication.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{TossApplication.this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1733094178, 1733094212)).get()).onExtraCallbackWithResult();
            Unit unit = Unit.INSTANCE;
            int i7 = onWarmupCompleted + 95;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    private static /* synthetic */ Object onUnminimized(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        TossApplication tossApplication2 = (TossApplication) objArr[1];
        GeckoHubImp1 geckoHubImp1 = (GeckoHubImp1) objArr[2];
        GeckoHubImp1 geckoHubImp12 = (GeckoHubImp1) objArr[3];
        enableAndroidLinearText enableandroidlineartext = (enableAndroidLinearText) objArr[4];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(enableandroidlineartext, "");
        enableandroidlineartext.onExtraCallbackWithResult("TossTracker.Lifecycle", tossApplication2.new ICustomTabsCallbackStubProxy(null));
        if (tossApplication.extraCallback().AudioAttributesImplApi21Parcelizer()) {
            enableandroidlineartext.onExtraCallbackWithResult("AffiliateLogTracker", tossApplication.new extraCommand(null));
            int i2 = extraCallback + 75;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 % 5;
            }
        }
        enableandroidlineartext.onNavigationEvent("UIKit.initialize", tossApplication.new ICustomTabsService(enableandroidlineartext, null));
        enableandroidlineartext.onNavigationEvent("initWebView", tossApplication.new ICustomTabsCallback_Parcel(null));
        enableandroidlineartext.onNavigationEvent("setDefaultNightMode", tossApplication.new isEngagementSignalsApiAvailable(null));
        enableandroidlineartext.onNavigationEvent("initUncaughtExceptionHandler", tossApplication.new mayLaunchUrl(null));
        enableandroidlineartext.onNavigationEvent("deferredLazyRealmInit", new newAuthTabSession(geckoHubImp1, null));
        enableandroidlineartext.onNavigationEvent("ReactInitializer", new newSessionWithExtras(geckoHubImp12, tossApplication, tossApplication2, null));
        if (tossApplication.extraCallback().AudioAttributesImplApi21Parcelizer()) {
            enableandroidlineartext.onNavigationEvent("OverseasPaymentNotificationManager.init", tossApplication.new newSession(tossApplication2, null));
        }
        enableandroidlineartext.onExtraCallbackWithResult("initTossPush", tossApplication.new onUnminimized(tossApplication2, null));
        enableandroidlineartext.onExtraCallbackWithResult("initTossWebKit", tossApplication.new onRelationshipValidationResult(null));
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 27;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return unit;
    }

    private static final void ICustomTabsService(final TossApplication tossApplication) {
        int i = 2 % 2;
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda30
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() throws Throwable {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 31;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                boolean zAsBinder = TossApplication.asBinder(this.f$0);
                int i5 = IAuthTabCallback + 69;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return zAsBinder;
            }
        });
        int i2 = ICustomTabsCallback + 43;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final boolean extraCommand(TossApplication tossApplication) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 11;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.AudioAttributesCompatParcelizer();
        int i4 = extraCallback + 115;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0090 A[PHI: r1
      0x0090: PHI (r1v27 o.getSeverityReasonbugsnag_android_core_release) = (r1v26 o.getSeverityReasonbugsnag_android_core_release), (r1v29 o.getSeverityReasonbugsnag_android_core_release) binds: [B:10:0x008e, B:7:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v7 */
    @Override // o.RememberLottieCompositionKtloadFontsFromAssets2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IPostMessageService() {
        final GeckoHubImp1 geckoHubImp1;
        final GeckoHubImp1 geckoHubImp12;
        char c;
        final GeckoHubImp1 geckoHubImp13;
        ?? r14;
        getSeverityReasonbugsnag_android_core_release getseverityreasonbugsnag_android_core_releaseOnExtraCallback;
        int i = 2 % 2;
        MediaSessionCompatResultReceiverWrapper();
        System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");
        findResAndMsg findresandmsgOnWarmupCompleted = findRes.onWarmupCompleted(putChannelInfo.IAuthTabCallback().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null)));
        ((drawTextProgressColor) ((Lazy) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -866222907, 866222930)).get()).onWarmupCompleted();
        getUnhandled getunhandledOnExtraCallback = ((drawTextProgressColor) ((Lazy) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -866222907, 866222930)).get()).onExtraCallback();
        if (getunhandledOnExtraCallback != null) {
            int i2 = extraCallback + 103;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                getseverityreasonbugsnag_android_core_releaseOnExtraCallback = getunhandledOnExtraCallback.onExtraCallback();
                int i3 = 79 / 0;
                if (getseverityreasonbugsnag_android_core_releaseOnExtraCallback != null) {
                    IPostMessageService_Parcel().onNavigationEvent(getseverityreasonbugsnag_android_core_releaseOnExtraCallback.onExtraCallbackWithResult());
                }
            } else {
                getseverityreasonbugsnag_android_core_releaseOnExtraCallback = getunhandledOnExtraCallback.onExtraCallback();
                if (getseverityreasonbugsnag_android_core_releaseOnExtraCallback != null) {
                }
            }
        }
        asInterface().get().IAuthTabCallback(new Function0() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda9
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i4 = 2 % 2;
                int i5 = onExtraCallbackWithResult + 37;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                TossApplication tossApplication = this.f$0;
                if (i6 == 0) {
                    return TossApplication.onExtraCallbackWithResult(tossApplication);
                }
                TossApplication.onExtraCallbackWithResult(tossApplication);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        setRandomHost setrandomhost = setRandomHost.LAZY;
        final GeckoHubImp1 geckoHubImp1OnExtraCallback = maybeUpdateAnimatable.onExtraCallback(findresandmsgOnWarmupCompleted, (CoroutineContext) null, setrandomhost, new readTypedObject(null), 1, (Object) null);
        onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), (-1998714684) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132028169).substring(0, 4).codePointAt(0), new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 26968718, -26968714);
        final GeckoHubImp1 geckoHubImp1OnExtraCallback2 = maybeUpdateAnimatable.onExtraCallback(findresandmsgOnWarmupCompleted, (CoroutineContext) null, setrandomhost, new extraCallback(null), 1, (Object) null);
        final GeckoHubImp1 geckoHubImp1OnExtraCallback3 = maybeUpdateAnimatable.onExtraCallback(findresandmsgOnWarmupCompleted, (CoroutineContext) null, setrandomhost, new access000(null), 1, (Object) null);
        onExtraCallback("preload", false, (Function1<? super enableAndroidLinearText, Unit>) new Function1() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda10
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = onExtraCallback + 11;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                GeckoHubImp1 geckoHubImp14 = geckoHubImp1OnExtraCallback2;
                if (i6 == 0) {
                    return TossApplication.onWarmupCompleted(geckoHubImp14, geckoHubImp1OnExtraCallback3, geckoHubImp1OnExtraCallback, (enableAndroidLinearText) obj);
                }
                TossApplication.onWarmupCompleted(geckoHubImp14, geckoHubImp1OnExtraCallback3, geckoHubImp1OnExtraCallback, (enableAndroidLinearText) obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        maybeUpdateAnimatable.onExtraCallback(findresandmsgOnWarmupCompleted, (CoroutineContext) null, setRandomHost.DEFAULT, new onTransact(null), 1, (Object) null);
        if (this.onExtraCallback) {
            geckoHubImp1 = geckoHubImp1OnExtraCallback3;
            geckoHubImp12 = geckoHubImp1OnExtraCallback2;
            c = 4;
            geckoHubImp13 = geckoHubImp1OnExtraCallback;
            r14 = 0;
            int i4 = ICustomTabsCallback + 55;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            geckoHubImp1 = geckoHubImp1OnExtraCallback3;
            geckoHubImp12 = geckoHubImp1OnExtraCallback2;
            c = 4;
            geckoHubImp13 = geckoHubImp1OnExtraCallback;
            r14 = 0;
        }
        Function1 function1 = new Function1() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda12
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i6 = 2 % 2;
                int i7 = onExtraCallback + 109;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                TossApplication tossApplication = this.f$0;
                if (i8 != 0) {
                    return TossApplication.onWarmupCompleted(tossApplication, this, (enableAndroidLinearText) obj);
                }
                TossApplication.onWarmupCompleted(tossApplication, this, (enableAndroidLinearText) obj);
                throw null;
            }
        };
        Object[] objArr = new Object[6];
        objArr[r14] = this;
        objArr[1] = "phase1";
        objArr[2] = Boolean.valueOf((boolean) r14);
        objArr[3] = function1;
        objArr[c] = 2;
        objArr[5] = null;
        enableAndroidLinearText enableandroidlineartext = (enableAndroidLinearText) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1205204852, 1205204861);
        onExtraCallback("phase.async", (boolean) r14, (Function1<? super enableAndroidLinearText, Unit>) new Function1() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda13
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i6 = 2 % 2;
                int i7 = onWarmupCompleted + 23;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                Unit unit = (Unit) TossApplication.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this.f$0, (enableAndroidLinearText) obj}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1104005707, 1104005709);
                int i9 = onWarmupCompleted + 99;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    return unit;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        Function1 function12 = new Function1() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda14
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i6 = 2 % 2;
                int i7 = onExtraCallback + 91;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                Unit unitOnExtraCallbackWithResult = TossApplication.onExtraCallbackWithResult(this.f$0, this, geckoHubImp13, (enableAndroidLinearText) obj);
                int i9 = onExtraCallback + 79;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 47 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        };
        Object[] objArr2 = new Object[6];
        objArr2[r14] = this;
        objArr2[1] = "phase2";
        objArr2[2] = Boolean.valueOf((boolean) r14);
        objArr2[3] = function12;
        objArr2[c] = 2;
        objArr2[5] = null;
        IPostMessageService_Parcel().IAuthTabCallback().put("startup_task_count", Integer.valueOf(enableandroidlineartext.onWarmupCompleted() + ((enableAndroidLinearText) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr2, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1205204852, 1205204861)).onWarmupCompleted() + ((enableAndroidLinearText) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, "phase3", Boolean.valueOf((boolean) r14), new Function1() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda15
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i6 = 2 % 2;
                int i7 = onExtraCallbackWithResult + 125;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    TossApplication.onNavigationEvent(this.f$0, this, geckoHubImp12, geckoHubImp1, (enableAndroidLinearText) obj);
                    throw null;
                }
                Unit unitOnNavigationEvent = TossApplication.onNavigationEvent(this.f$0, this, geckoHubImp12, geckoHubImp1, (enableAndroidLinearText) obj);
                int i8 = onExtraCallbackWithResult + 7;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 == 0) {
                    return unitOnNavigationEvent;
                }
                throw null;
            }
        }, 2, null}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1205204852, 1205204861)).onWarmupCompleted()));
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda16
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i6 = 2 % 2;
                int i7 = onNavigationEvent + 89;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    TossApplication.asInterface(this.f$0);
                    throw null;
                }
                TossApplication.asInterface(this.f$0);
                int i8 = onExtraCallbackWithResult + 77;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            }
        });
        RatingCompat();
    }

    private static final Unit MediaMetadataCompat() {
        Unit unit;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 17;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            UST_CERT_PKCS8PrikeyInfo.onExtraCallback.IAuthTabCallback();
            unit = Unit.INSTANCE;
            int i3 = 89 / 0;
        } else {
            UST_CERT_PKCS8PrikeyInfo.onExtraCallback.IAuthTabCallback();
            unit = Unit.INSTANCE;
        }
        int i4 = extraCallback + 125;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final class postMessage extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        Object L$0;
        Object L$1;
        int label;

        postMessage(access13800<? super postMessage> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            postMessage postmessageCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                postmessageCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = postmessageCreate.invokeSuspend(unit);
            int i4 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 78 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            postMessage postmessage = TossApplication.this.new postMessage(access13800Var);
            int i2 = onWarmupCompleted + 121;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return postmessage;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
        
            if (r12 == r1) goto L40;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            setFillAlpha setfillalphaOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                onnavigationevent.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                getTrimPathOffset gettrimpathoffset = getTrimPathOffset.onWarmupCompleted;
                TossApplication tossApplication = TossApplication.this;
                this.label = 1;
                obj = gettrimpathoffset.onExtraCallbackWithResult(tossApplication, this);
                if (obj != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                setStrokeAlpha setstrokealpha = (setStrokeAlpha) obj;
                onnavigationevent = setstrokealpha instanceof setStrokeAlpha.onNavigationEvent ? (setStrokeAlpha.onNavigationEvent) setstrokealpha : null;
                if (onnavigationevent != null && (setfillalphaOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult()) != null && setfillalphaOnExtraCallbackWithResult.onNavigationEvent()) {
                    int i4 = onWarmupCompleted + 107;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    getPivotX.onExtraCallback.onWarmupCompleted(TossApplication.this);
                    int i6 = onExtraCallbackWithResult + 31;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                }
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj);
            setFillColor setfillcolor = (setFillColor) obj;
            if (!setfillcolor.getCanUseAdMob()) {
                return Unit.INSTANCE;
            }
            Activity typedObject = AppStateManager.onExtraCallbackWithResult.readTypedObject();
            if (typedObject == null) {
                int i8 = onWarmupCompleted + 67;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    return Unit.INSTANCE;
                }
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            getTrimPathStart gettrimpathstart = getTrimPathStart.onExtraCallbackWithResult;
            this.L$0 = access15400.onNavigationEvent(setfillcolor);
            this.L$1 = access15400.onNavigationEvent(typedObject);
            this.label = 2;
            obj = getTrimPathStart.onExtraCallbackWithResult(gettrimpathstart, typedObject, false, this, 2, null);
        }
    }

    static final class prefetch extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        int label;

        prefetch(access13800<? super prefetch> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            prefetch prefetchVar = TossApplication.this.new prefetch(access13800Var);
            int i2 = onExtraCallback + 95;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return prefetchVar;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 89;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            prefetch prefetchVarCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                prefetchVarCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = prefetchVarCreate.invokeSuspend(unit);
            int i4 = onNavigationEvent + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                TossApplication tossApplication = TossApplication.this;
                this.label = 1;
                if (TossApplication.onExtraCallback(tossApplication, (access13800) this) == objOnWarmupCompleted) {
                    int i3 = onNavigationEvent + 95;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = onNavigationEvent + 17;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    int i5 = 30 / 0;
                } else {
                    ResultKt.onNavigationEvent(obj);
                }
                int i6 = onNavigationEvent + 19;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    static final class prefetchWithMultipleUrls extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        int label;

        prefetchWithMultipleUrls(access13800<? super prefetchWithMultipleUrls> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            prefetchWithMultipleUrls prefetchwithmultipleurls = TossApplication.this.new prefetchWithMultipleUrls(access13800Var);
            int i2 = onWarmupCompleted + 75;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 49 / 0;
            }
            return prefetchwithmultipleurls;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 41;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 15 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (TossApplication.this.onPostMessage().get().onExtraCallbackWithResult()) {
                    access3902 access3902Var = access3902.onWarmupCompleted;
                    this.label = 1;
                    if (access3902Var.onWarmupCompleted(this) == objOnWarmupCompleted) {
                        int i3 = onWarmupCompleted + 105;
                        onExtraCallback = i3 % 128;
                        if (i3 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        throw null;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = onExtraCallback + 111;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 75;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        if (GuardedAsyncTask.IAuthTabCallback.IAuthTabCallbackDefault(tossApplication)) {
            int i4 = ICustomTabsCallback + 109;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            PedometerService.onExtraCallbackWithResult.onWarmupCompleted(PedometerService.Companion, tossApplication, "TossApplication", (String) null, false, 12, (Object) null);
            JSApplicationIllegalArgumentException.onExtraCallbackWithResult.onExtraCallback(tossApplication);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = ICustomTabsCallback + 59;
        extraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 64 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void AudioAttributesCompatParcelizer() throws Throwable {
        Object obj;
        Object obj2;
        boolean z;
        Object obj3;
        int i = 2 % 2;
        finishFromSdk.Companion.IAuthTabCallback(false);
        try {
            Result.Companion companion = Result.Companion;
            ((r8lambdau761TBYkUBsjAjCwmNCBjUIxcpI) ((Lazy) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 192256487 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022886).substring(0, 9).length(), new Object[]{this}, ComposableSingletons$SelectAccountScreenKt$.ExternalSyntheticLambda2.onExtraCallback(), 1664181387, -1664181381)).get()).IAuthTabCallback();
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            int i2 = ICustomTabsCallback + 71;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossApplication", "Failed to start MonoHermesFlagSessionObserver", th2, (Map) null, 8, (Object) null);
        }
        if (((Boolean) r8lambdatmbWHEMtRtNT1964wjUkbDe9TEQ.onExtraCallback(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -390108594, new Object[]{r8lambdatmbWHEMtRtNT1964wjUkbDe9TEQ.onExtraCallbackWithResult}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 390108594, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).booleanValue()) {
            try {
                Result.Companion companion3 = Result.Companion;
                onRelationshipValidationResult().get().access100();
                obj2 = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(th3));
            }
            Throwable th4 = Result.exceptionOrNull-impl(obj2);
            if (th4 != null) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossApplication", "Failed to init TossPortalRuntime", th4, (Map) null, 8, (Object) null);
            }
            if (!Result.onNavigationEvent(obj2)) {
                z = false;
            } else {
                int i4 = ICustomTabsCallback + 9;
                extraCallback = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            }
        }
        try {
            Result.Companion companion5 = Result.Companion;
            r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1053925019, -1053925018, new Object[]{r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onWarmupCompleted, "mono_hermes_flag_snapshot", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("tubaValue", Boolean.valueOf(((Boolean) r8lambdatmbWHEMtRtNT1964wjUkbDe9TEQ.onExtraCallback(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1721166331, new Object[]{r8lambdatmbWHEMtRtNT1964wjUkbDe9TEQ.onExtraCallbackWithResult}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1721166330, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).booleanValue())), getWrite.IAuthTabCallback("bootPreheated", Boolean.valueOf(z))})}, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
            obj3 = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th5) {
            Result.Companion companion6 = Result.Companion;
            obj3 = Result.constructor-impl(ResultKt.createFailure(th5));
        }
        Throwable th6 = Result.exceptionOrNull-impl(obj3);
        if (th6 != null) {
            r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onWarmupCompleted.onWarmupCompleted("mono_hermes_flag_snapshot", th6);
        }
        getPricingPhaseList getpricingphaselist = ICustomTabsServiceStub().get();
        Intrinsics.checkNotNullExpressionValue(getpricingphaselist, "");
        if (getpricingphaselist == getPricingPhaseList.EU) {
            maybeUpdateAnimatable.onNavigationEvent(findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null)), (CoroutineContext) null, (setRandomHost) null, new postMessage(null), 3, (Object) null);
        } else {
            getPivotX.onExtraCallback.onWarmupCompleted(this);
            int i6 = ICustomTabsCallback + 45;
            extraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        maybeUpdateAnimatable.onNavigationEvent(findRes.onWarmupCompleted(putChannelInfo.IAuthTabCallback().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null))), (CoroutineContext) null, (setRandomHost) null, new prefetch(null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(findRes.onWarmupCompleted(putChannelInfo.IAuthTabCallback().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null))), (CoroutineContext) null, (setRandomHost) null, new prefetchWithMultipleUrls(null), 3, (Object) null);
        access3802.onExtraCallbackWithResult.IAuthTabCallback();
    }

    private static final Unit AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = extraCallback + 107;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        getNativeModulesQueueThreadSpec.onExtraCallback.onExtraCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 85;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return unit;
    }

    static final class requestPostMessageChannel extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ TossApplication $appContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        requestPostMessageChannel(TossApplication tossApplication, access13800<? super requestPostMessageChannel> access13800Var) {
            super(1, access13800Var);
            this.$appContext = tossApplication;
        }

        public static /* synthetic */ void onNavigationEvent(TossApplication tossApplication, Set set) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(tossApplication, set);
            int i4 = onExtraCallbackWithResult + 43;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            requestPostMessageChannel requestpostmessagechannel = TossApplication.this.new requestPostMessageChannel(this.$appContext, access13800Var);
            int i2 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return requestpostmessagechannel;
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((access13800) obj);
            int i4 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 79 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(access13800<? super Unit> access13800Var) throws Throwable {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            requestPostMessageChannel requestpostmessagechannelCreate = create(access13800Var);
            if (i3 == 0) {
                objInvokeSuspend = requestpostmessagechannelCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 19 / 0;
            } else {
                objInvokeSuspend = requestpostmessagechannelCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 5;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 29;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            Set<String> setOnExtraCallback = ALCFaceSDKExternalSyntheticLambda5.Companion.onExtraCallback();
            if (!setOnExtraCallback.isEmpty()) {
                IllegalStateException illegalStateException = new IllegalStateException("TubaVarV1Delegate accessed before init: keys=" + setOnExtraCallback);
                if (TossApplication.getInterfaceDescriptor(TossApplication.this)) {
                    illegalStateException.getMessage();
                    new Handler(Looper.getMainLooper()).post(new TossApplication$onPostInitMainProcess$1$1$.ExternalSyntheticLambda0(this.$appContext, setOnExtraCallback));
                }
                ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TubaVarV1Delegate", "accessed before init", access8100.onNavigationEvent(getWrite.IAuthTabCallback("keys", setOnExtraCallback.toString())), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            }
            Unit unit = Unit.INSTANCE;
            int i7 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        private static final void onExtraCallback(TossApplication tossApplication, Set set) {
            int i = 2 % 2;
            Toast.makeText(tossApplication, "TubaVarV1 accessed before init: " + set, 1).show();
            int i2 = IAuthTabCallback + 35;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void RatingCompat() {
        int i = 2 % 2;
        onExtraCallback("postInit", false, new Function1() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda31
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 81;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = TossApplication.onExtraCallback(this.f$0, this, (enableAndroidLinearText) obj);
                int i5 = onExtraCallbackWithResult + 93;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallback;
            }
        });
        int i2 = extraCallback + 5;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static final class IEngagementSignalsCallback extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ TossApplication $appContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IEngagementSignalsCallback(TossApplication tossApplication, access13800<? super IEngagementSignalsCallback> access13800Var) {
            super(1, access13800Var);
            this.$appContext = tossApplication;
        }

        public final Object IAuthTabCallback(access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IEngagementSignalsCallback iEngagementSignalsCallbackCreate = create(access13800Var);
            if (i3 != 0) {
                return iEngagementSignalsCallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            iEngagementSignalsCallbackCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            IEngagementSignalsCallback iEngagementSignalsCallback = TossApplication.this.new IEngagementSignalsCallback(this.$appContext, access13800Var);
            int i2 = onExtraCallbackWithResult + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iEngagementSignalsCallback;
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((access13800) obj);
            int i4 = onExtraCallbackWithResult + 11;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            Object obj2 = TossApplication.this.access000().get();
            try {
                Object[] objArr = {this.$appContext};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2117705210);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), 16777234 + Color.rgb(0, 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 11054, -1333355370, false, "onExtraCallback", new Class[]{Context.class});
                }
                ((Method) objOnExtraCallback).invoke(obj2, objArr);
                if (TossApplication.this.extraCallback().onActivityLayout() || TossApplication.this.extraCallback().MediaMetadataCompat() || UtilsKtExternalSyntheticLambda11.IAuthTabCallback(UtilsKtExternalSyntheticLambda11.IAuthTabCallback, "android.platform.logLowMemory", false, null, 6, null)) {
                    isBlockMonitorEnable.IAuthTabCallback(-1660920405, new Object[]{isBlockMonitorEnable.onExtraCallback, TossApplication.this}, 1660920406, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback());
                    int i2 = onExtraCallback + 11;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 5 / 2;
                    }
                } else {
                    int i4 = onExtraCallback + 105;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        isBlockMonitorEnable.onExtraCallback.onExtraCallback(TossApplication.this);
                        int i5 = 85 / 0;
                    } else {
                        isBlockMonitorEnable.onExtraCallback.onExtraCallback(TossApplication.this);
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i6 = onExtraCallback + 83;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    return unit;
                }
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    static final class IPostMessageServiceDefault extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        int label;

        IPostMessageServiceDefault(access13800<? super IPostMessageServiceDefault> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            IPostMessageServiceDefault iPostMessageServiceDefault = TossApplication.this.new IPostMessageServiceDefault(access13800Var);
            int i2 = IAuthTabCallback + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return iPostMessageServiceDefault;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((access13800) obj);
            if (i3 == 0) {
                int i4 = 91 / 0;
            }
            int i5 = IAuthTabCallback + 85;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 77;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 14 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 99;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            setJSBundleLoader.onNavigationEvent.onExtraCallback();
            setJSExceptionHandler.onWarmupCompleted.onWarmupCompleted();
            onTraceStopped.onExtraCallbackWithResult.onNavigationEvent(TossApplication.this);
            setJSExecutor.onExtraCallback.onWarmupCompleted();
            Unit unit = Unit.INSTANCE;
            int i7 = IAuthTabCallback + 29;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 10 / 0;
            }
            return unit;
        }
    }

    static final class IPostMessageServiceStub extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        int label;

        IPostMessageServiceStub(access13800<? super IPostMessageServiceStub> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            IPostMessageServiceStub iPostMessageServiceStub = TossApplication.this.new IPostMessageServiceStub(access13800Var);
            int i2 = onExtraCallback + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return iPostMessageServiceStub;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((access13800) obj);
            int i4 = onExtraCallback + 121;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IPostMessageServiceStub iPostMessageServiceStubCreate = create(access13800Var);
            if (i3 != 0) {
                return iPostMessageServiceStubCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 47 / 0;
            return iPostMessageServiceStubCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            onTextViewSizeChanged.onExtraCallbackWithResult.IAuthTabCallbackStub(TossApplication.this);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 11;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    static final class IEngagementSignalsCallbackStubProxy extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        int label;

        IEngagementSignalsCallbackStubProxy(access13800<? super IEngagementSignalsCallbackStubProxy> access13800Var) {
            super(1, access13800Var);
        }

        public final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 41 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            IEngagementSignalsCallbackStubProxy iEngagementSignalsCallbackStubProxy = TossApplication.this.new IEngagementSignalsCallbackStubProxy(access13800Var);
            int i2 = onNavigationEvent + 43;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return iEngagementSignalsCallbackStubProxy;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((access13800) obj);
            if (i3 != 0) {
                int i4 = 68 / 0;
            }
            return objIAuthTabCallback;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
        
            if ((r1 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
        
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r8.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r8.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r9);
            im.toss.TossApplication.onExtraCallbackWithResult(im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new java.lang.Object[]{r8.this$0}, im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -965645975, 965645980);
            r9 = kotlin.Unit.INSTANCE;
            r1 = im.toss.TossApplication.IEngagementSignalsCallbackStubProxy.onNavigationEvent + 43;
            im.toss.TossApplication.IEngagementSignalsCallbackStubProxy.IAuthTabCallback = r1 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 27;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 11 / 0;
            }
        }
    }

    static final class IPostMessageService extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int label;

        IPostMessageService(access13800<? super IPostMessageService> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            IPostMessageService iPostMessageService = TossApplication.this.new IPostMessageService(access13800Var);
            int i2 = IAuthTabCallback + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iPostMessageService;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((access13800) obj);
            int i4 = IAuthTabCallback + 19;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IPostMessageService iPostMessageServiceCreate = create(access13800Var);
            if (i3 != 0) {
                objInvokeSuspend = iPostMessageServiceCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 10 / 0;
            } else {
                objInvokeSuspend = iPostMessageServiceCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = IAuthTabCallback + 115;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onExtraCallback = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            TossApplication.onTransact(TossApplication.this);
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallback + 23;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    static final class ITrustedWebActivityCallbackStub extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ TossApplication $appContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ITrustedWebActivityCallbackStub(TossApplication tossApplication, access13800<? super ITrustedWebActivityCallbackStub> access13800Var) {
            super(1, access13800Var);
            this.$appContext = tossApplication;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            ITrustedWebActivityCallbackStub iTrustedWebActivityCallbackStub = TossApplication.this.new ITrustedWebActivityCallbackStub(this.$appContext, access13800Var);
            int i2 = onWarmupCompleted + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iTrustedWebActivityCallbackStub;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((access13800) obj);
            if (i3 == 0) {
                int i4 = 44 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 87;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                GriverEmbedWebViewJsApiPermissionProxyImpl1 griverEmbedWebViewJsApiPermissionProxyImpl1 = TossApplication.this.newSessionWithExtras().get();
                this.label = 1;
                obj = griverEmbedWebViewJsApiPermissionProxyImpl1.onExtraCallbackWithResult(this);
                if (obj == objOnWarmupCompleted) {
                    int i5 = IAuthTabCallback + 105;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            if (!(!((Boolean) obj).booleanValue())) {
                MobileTmoneyService.Companion.onWarmupCompleted(this.$appContext, "TossApplication#onInitializeMainProcess");
            }
            return Unit.INSTANCE;
        }
    }

    static final class IPostMessageService_Parcel extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        int label;

        IPostMessageService_Parcel(access13800<? super IPostMessageService_Parcel> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            IPostMessageService_Parcel iPostMessageService_Parcel = TossApplication.this.new IPostMessageService_Parcel(access13800Var);
            int i2 = onNavigationEvent + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iPostMessageService_Parcel;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((access13800) obj);
            int i4 = onNavigationEvent + 97;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 13 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 77;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 29;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            TossApplication.this.IEngagementSignalsCallbackStub().get().onExtraCallback();
            return Unit.INSTANCE;
        }
    }

    static final class setEngagementSignalsCallback extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        int label;

        setEngagementSignalsCallback(access13800<? super setEngagementSignalsCallback> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            setEngagementSignalsCallback setengagementsignalscallback = new setEngagementSignalsCallback(access13800Var);
            int i2 = onExtraCallbackWithResult + 113;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 58 / 0;
            }
            return setengagementsignalscallback;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i2 % 128;
            access13800<? super Unit> access13800Var = (access13800) obj;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(access13800Var);
            }
            onExtraCallbackWithResult(access13800Var);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Unit unit;
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i3 != 0) {
                UST_CERT_PKCS8PrikeyInfo.onExtraCallback.onExtraCallbackWithResult();
                unit = Unit.INSTANCE;
                int i4 = 2 / 0;
            } else {
                UST_CERT_PKCS8PrikeyInfo.onExtraCallback.onExtraCallbackWithResult();
                unit = Unit.INSTANCE;
            }
            int i5 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }
    }

    static final class requestPostMessageChannelWithExtras extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ TossApplication $appContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        requestPostMessageChannelWithExtras(TossApplication tossApplication, access13800<? super requestPostMessageChannelWithExtras> access13800Var) {
            super(1, access13800Var);
            this.$appContext = tossApplication;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            requestPostMessageChannelWithExtras requestpostmessagechannelwithextras = TossApplication.this.new requestPostMessageChannelWithExtras(this.$appContext, access13800Var);
            int i2 = onExtraCallback + 41;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 33 / 0;
            }
            return requestpostmessagechannelwithextras;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((access13800) obj);
            int i4 = onWarmupCompleted + 71;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            requestPostMessageChannelWithExtras requestpostmessagechannelwithextrasCreate = create(access13800Var);
            if (i3 != 0) {
                objInvokeSuspend = requestpostmessagechannelwithextrasCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 25 / 0;
            } else {
                objInvokeSuspend = requestpostmessagechannelwithextrasCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onExtraCallback + 109;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            Object obj3 = ((Lazy) TossApplication.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{TossApplication.this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 483119486, -483119468)).get();
            Intrinsics.checkNotNullExpressionValue(obj3, "");
            ((isBluetoothEnabled) obj3).IAuthTabCallback(this.$appContext);
            Unit unit = Unit.INSTANCE;
            int i3 = onWarmupCompleted + 29;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
    }

    static final class validateRelationship extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ TossApplication $appContext;
        final /* synthetic */ enableAndroidLinearText $this_parallelLoad;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        validateRelationship(enableAndroidLinearText enableandroidlineartext, TossApplication tossApplication, access13800<? super validateRelationship> access13800Var) {
            super(1, access13800Var);
            this.$this_parallelLoad = enableandroidlineartext;
            this.$appContext = tossApplication;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            validateRelationship validaterelationship = new validateRelationship(this.$this_parallelLoad, this.$appContext, access13800Var);
            int i2 = onExtraCallbackWithResult + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return validaterelationship;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onExtraCallbackWithResult = i2 % 128;
            access13800<? super Unit> access13800Var = (access13800) obj;
            if (i2 % 2 == 0) {
                return onExtraCallback(access13800Var);
            }
            onExtraCallback(access13800Var);
            throw null;
        }

        public final Object onExtraCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            validateRelationship validaterelationshipCreate = create(access13800Var);
            if (i3 == 0) {
                validaterelationshipCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = validaterelationshipCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 103;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            TossApplication tossApplication = this.$appContext;
            try {
                Result.Companion companion = Result.Companion;
                Result.constructor-impl(access14000.onNavigationEvent(FilesKt.deleteRecursively(new File(tossApplication.getCacheDir(), "web_resource_cache"))));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(th));
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 83 / 0;
            }
            return unit;
        }
    }

    static final class ICustomTabsServiceDefault extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        int label;

        ICustomTabsServiceDefault(access13800<? super ICustomTabsServiceDefault> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsServiceDefault iCustomTabsServiceDefault = TossApplication.this.new ICustomTabsServiceDefault(access13800Var);
            int i2 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return iCustomTabsServiceDefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((access13800) obj);
            int i4 = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            ICustomTabsServiceDefault iCustomTabsServiceDefaultCreate = create(access13800Var);
            if (i3 == 0) {
                iCustomTabsServiceDefaultCreate.invokeSuspend(Unit.INSTANCE);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = iCustomTabsServiceDefaultCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 117;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            TossApplication.this.IEngagementSignalsCallback().get().onExtraCallback();
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
    }

    static final class ICustomTabsServiceStub extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ TossApplication $appContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ICustomTabsServiceStub(TossApplication tossApplication, access13800<? super ICustomTabsServiceStub> access13800Var) {
            super(1, access13800Var);
            this.$appContext = tossApplication;
        }

        public final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 97;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 89 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsServiceStub iCustomTabsServiceStub = TossApplication.this.new ICustomTabsServiceStub(this.$appContext, access13800Var);
            int i2 = onExtraCallback + 125;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 89 / 0;
            }
            return iCustomTabsServiceStub;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((access13800) obj);
            int i4 = onNavigationEvent + 117;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (TossApplication.this.ICustomTabsServiceStub().get() != getPricingPhaseList.EU) {
                int i2 = onNavigationEvent + 33;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                castToShort.IAuthTabCallback.onExtraCallback(this.$appContext);
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 103;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    static final class warmup extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ TossApplication $appContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        warmup(TossApplication tossApplication, access13800<? super warmup> access13800Var) {
            super(1, access13800Var);
            this.$appContext = tossApplication;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            warmup warmupVar = TossApplication.this.new warmup(this.$appContext, access13800Var);
            int i2 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return warmupVar;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((access13800) obj);
            int i4 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            warmup warmupVarCreate = create(access13800Var);
            if (i3 == 0) {
                warmupVarCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = warmupVarCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object obj3;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 27;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            TossApplication tossApplication = TossApplication.this;
            TossApplication tossApplication2 = this.$appContext;
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (i6 == 0) {
                Result.Companion companion2 = Result.Companion;
                tossApplication.ICustomTabsService().get().onWarmupCompleted(tossApplication2);
                Result.constructor-impl(Unit.INSTANCE);
                throw null;
            }
            Result.Companion companion3 = Result.Companion;
            tossApplication.ICustomTabsService().get().onWarmupCompleted(tossApplication2);
            obj2 = Result.constructor-impl(Unit.INSTANCE);
            ResultsKt.onExtraCallback(obj2, "sdkConsent", "gatekeeper");
            TossApplication tossApplication3 = TossApplication.this;
            try {
                Result.Companion companion4 = Result.Companion;
                tossApplication3.extraCommand().get().IAuthTabCallback();
                obj3 = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion5 = Result.Companion;
                obj3 = Result.constructor-impl(ResultKt.createFailure(th2));
            }
            ResultsKt.onExtraCallback(obj3, "sdkConsent", "serverSync");
            Unit unit = Unit.INSTANCE;
            int i7 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    static final class updateVisuals extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ TossApplication $appContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        updateVisuals(TossApplication tossApplication, access13800<? super updateVisuals> access13800Var) {
            super(1, access13800Var);
            this.$appContext = tossApplication;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            updateVisuals updatevisuals = TossApplication.this.new updateVisuals(this.$appContext, access13800Var);
            int i2 = onExtraCallback + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return updatevisuals;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((access13800) obj);
            int i4 = onExtraCallback + 79;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 113;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 89;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = i2 + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.onNavigationEvent(obj);
            TossApplication.this.ICustomTabsCallbackDefault().get().IAuthTabCallback(this.$appContext);
            Unit unit = Unit.INSTANCE;
            int i6 = onWarmupCompleted + 27;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }
    }

    static final class access200 extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        int label;

        access200(access13800<? super access200> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            access200 access200Var = TossApplication.this.new access200(access13800Var);
            int i2 = IAuthTabCallback + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return access200Var;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onWarmupCompleted = i2 % 128;
            Object obj2 = null;
            access13800<? super Unit> access13800Var = (access13800) obj;
            if (i2 % 2 == 0) {
                onNavigationEvent(access13800Var);
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(access13800Var);
            int i3 = IAuthTabCallback + 53;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnNavigationEvent;
            }
            obj2.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            access200 access200VarCreate = create(access13800Var);
            if (i3 != 0) {
                return access200VarCreate.invokeSuspend(Unit.INSTANCE);
            }
            access200VarCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onWarmupCompleted + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i3 == 0) {
                TossApplication.extraCallback(TossApplication.this);
                Unit unit = Unit.INSTANCE;
                int i4 = onWarmupCompleted + 9;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 21 / 0;
                }
                return unit;
            }
            TossApplication.extraCallback(TossApplication.this);
            Unit unit2 = Unit.INSTANCE;
            throw null;
        }
    }

    static final class writeTypedList extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        int label;

        writeTypedList(access13800<? super writeTypedList> access13800Var) {
            super(1, access13800Var);
        }

        public final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            writeTypedList writetypedlistCreate = create(access13800Var);
            if (i3 != 0) {
                writetypedlistCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = writetypedlistCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 111;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            writeTypedList writetypedlist = TossApplication.this.new writeTypedList(access13800Var);
            int i2 = onExtraCallback + 85;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return writetypedlist;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((access13800) obj);
            int i4 = onExtraCallback + 73;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objIAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            TossApplication.this.ICustomTabsServiceDefault().get().asBinder();
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 101;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 22 / 0;
            }
            return unit;
        }
    }

    static final class ICustomTabsService_Parcel extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int label;

        ICustomTabsService_Parcel(access13800<? super ICustomTabsService_Parcel> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsService_Parcel iCustomTabsService_Parcel = TossApplication.this.new ICustomTabsService_Parcel(access13800Var);
            int i2 = onNavigationEvent + 33;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return iCustomTabsService_Parcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onExtraCallback = i2 % 128;
            access13800<? super Unit> access13800Var = (access13800) obj;
            if (i2 % 2 == 0) {
                onExtraCallback(access13800Var);
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(access13800Var);
            int i3 = onNavigationEvent + 111;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 93;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            UST_CERT_GetVIDRandomWithPrikey.onWarmupCompleted.onNavigationEvent(TossApplication.this);
            Unit unit = Unit.INSTANCE;
            int i3 = onNavigationEvent + 51;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
    }

    static final class ICustomTabsServiceStubProxy extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        int label;

        ICustomTabsServiceStubProxy(access13800<? super ICustomTabsServiceStubProxy> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsServiceStubProxy iCustomTabsServiceStubProxy = TossApplication.this.new ICustomTabsServiceStubProxy(access13800Var);
            int i2 = onWarmupCompleted + 45;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 75 / 0;
            }
            return iCustomTabsServiceStubProxy;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((access13800) obj);
            if (i3 != 0) {
                int i4 = 0 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            ICustomTabsServiceStubProxy iCustomTabsServiceStubProxyCreate = create(access13800Var);
            if (i3 != 0) {
                iCustomTabsServiceStubProxyCreate.invokeSuspend(Unit.INSTANCE);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = iCustomTabsServiceStubProxyCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 121;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = IAuthTabCallback + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            ResultKt.onNavigationEvent(obj);
            if (i3 != 0) {
                TossApplication.access100(TossApplication.this);
                Unit unit = Unit.INSTANCE;
                int i4 = onWarmupCompleted + 61;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                throw null;
            }
            TossApplication.access100(TossApplication.this);
            Unit unit2 = Unit.INSTANCE;
            obj2.hashCode();
            throw null;
        }
    }

    static final class IEngagementSignalsCallbackDefault extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ TossApplication $appContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IEngagementSignalsCallbackDefault(TossApplication tossApplication, access13800<? super IEngagementSignalsCallbackDefault> access13800Var) {
            super(1, access13800Var);
            this.$appContext = tossApplication;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = TossApplication.this.new IEngagementSignalsCallbackDefault(this.$appContext, access13800Var);
            int i2 = onExtraCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return iEngagementSignalsCallbackDefault;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            onExtraCallback = i2 % 128;
            access13800<? super Unit> access13800Var = (access13800) obj;
            if (i2 % 2 == 0) {
                return onNavigationEvent(access13800Var);
            }
            onNavigationEvent(access13800Var);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 53;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 66 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            TossApplication.ICustomTabsCallback(TossApplication.this);
            enableEagerRootViewAttachment enableeagerrootviewattachment = enableEagerRootViewAttachment.onNavigationEvent;
            enableeagerrootviewattachment.onWarmupCompleted(this.$appContext);
            enableeagerrootviewattachment.onExtraCallback(this.$appContext);
            ((getBizCode) ((Lazy) TossApplication.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{TossApplication.this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 305981589, -305981569)).get()).onWarmupCompleted(this.$appContext);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 51;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    public static final class onSessionEnded extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        public static int onNavigationEvent;
        public static int onWarmupCompleted;
        int label;

        onSessionEnded(access13800<? super onSessionEnded> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onSessionEnded onsessionended = TossApplication.this.new onSessionEnded(access13800Var);
            int i2 = onExtraCallback + 1;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 96 / 0;
            }
            return onsessionended;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            IAuthTabCallback = i2 % 128;
            access13800<? super Unit> access13800Var = (access13800) obj;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(access13800Var);
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(access13800Var);
            int i3 = IAuthTabCallback + 81;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final Object onExtraCallbackWithResult(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 57;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 0 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            if ((!r4.onExtraCallbackWithResult()) == true) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        
            if (r4.IAuthTabCallbackStub() != false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        
            r4.onTransact();
            r4 = im.toss.TossApplication.onSessionEnded.onExtraCallback + 117;
            im.toss.TossApplication.onSessionEnded.IAuthTabCallback = r4 % 128;
            r4 = r4 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r3.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r3.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r4);
            r4 = r3.this$0.onPostMessage().get();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 97 / 0;
            }
        }

        public static int onExtraCallback() {
            int i = onWarmupCompleted;
            int i2 = i % 5862785;
            onWarmupCompleted = i + 1;
            if (i2 != 0) {
                return onNavigationEvent;
            }
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            onNavigationEvent = iFreeMemory;
            return iFreeMemory;
        }
    }

    static final class onVerticalScrollEvent extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ TossApplication $appContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onVerticalScrollEvent(TossApplication tossApplication, access13800<? super onVerticalScrollEvent> access13800Var) {
            super(1, access13800Var);
            this.$appContext = tossApplication;
        }

        public final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onVerticalScrollEvent onverticalscrolleventCreate = create(access13800Var);
            if (i3 == 0) {
                onverticalscrolleventCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onverticalscrolleventCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onVerticalScrollEvent onverticalscrollevent = TossApplication.this.new onVerticalScrollEvent(this.$appContext, access13800Var);
            int i2 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 19 / 0;
            }
            return onverticalscrollevent;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i2 % 128;
            Object obj2 = null;
            access13800<? super Unit> access13800Var = (access13800) obj;
            if (i2 % 2 == 0) {
                IAuthTabCallback(access13800Var);
                obj2.hashCode();
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(access13800Var);
            int i3 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return objIAuthTabCallback;
            }
            obj2.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 67;
            onWarmupCompleted = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = i2 + 121;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i5 == 0) {
                TossApplication.this.extraCallbackWithResult().get().onExtraCallback(this.$appContext);
                return Unit.INSTANCE;
            }
            TossApplication.this.extraCallbackWithResult().get().onExtraCallback(this.$appContext);
            Unit unit = Unit.INSTANCE;
            obj2.hashCode();
            throw null;
        }
    }

    static final class onGreatestScrollPercentageIncreased extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int label;

        onGreatestScrollPercentageIncreased(access13800<? super onGreatestScrollPercentageIncreased> access13800Var) {
            super(1, access13800Var);
        }

        public final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 5;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onGreatestScrollPercentageIncreased ongreatestscrollpercentageincreased = TossApplication.this.new onGreatestScrollPercentageIncreased(access13800Var);
            int i2 = onNavigationEvent + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return ongreatestscrollpercentageincreased;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((access13800) obj);
            int i4 = onExtraCallback + 29;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            if ((r1 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r3.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r3.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r4);
            o.ClipboardBridgeExtension3.onExtraCallbackWithResult.onNavigationEvent(r3.$appContext);
            r4 = kotlin.Unit.INSTANCE;
            r1 = im.toss.TossApplication.onGreatestScrollPercentageIncreased.onExtraCallback + 31;
            im.toss.TossApplication.onGreatestScrollPercentageIncreased.onNavigationEvent = r1 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 48 / 0;
            }
        }
    }

    static final class IEngagementSignalsCallbackStub extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int label;

        IEngagementSignalsCallbackStub(access13800<? super IEngagementSignalsCallbackStub> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            IEngagementSignalsCallbackStub iEngagementSignalsCallbackStub = TossApplication.this.new IEngagementSignalsCallbackStub(access13800Var);
            int i2 = onExtraCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return iEngagementSignalsCallbackStub;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((access13800) obj);
            if (i3 == 0) {
                int i4 = 51 / 0;
            }
            int i5 = onExtraCallback + 19;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 89;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            Unit unit;
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onExtraCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i3 == 0) {
                Context applicationContext = TossApplication.this.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                generateLink.asInterface(applicationContext);
                unit = Unit.INSTANCE;
                int i4 = 45 / 0;
            } else {
                Context applicationContext2 = TossApplication.this.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
                generateLink.asInterface(applicationContext2);
                unit = Unit.INSTANCE;
            }
            int i5 = onExtraCallbackWithResult + 77;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 21 / 0;
            }
            return unit;
        }
    }

    private static final Unit IAuthTabCallbackDefault(TossApplication tossApplication, TossApplication tossApplication2, enableAndroidLinearText enableandroidlineartext) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(enableandroidlineartext, "");
        enableandroidlineartext.onNavigationEvent("reportTubaAccessBeforeInit", tossApplication.new requestPostMessageChannel(tossApplication2, null));
        enableandroidlineartext.onNavigationEvent("LowMemoryMonitor.init", tossApplication.new IEngagementSignalsCallback(tossApplication2, null));
        enableandroidlineartext.onNavigationEvent("NetworkUsageMonitor.init", tossApplication2.new IPostMessageServiceDefault(null));
        enableandroidlineartext.onNavigationEvent("NetworkMonitor.start", tossApplication2.new IPostMessageServiceStub(null));
        enableandroidlineartext.onNavigationEvent("replaceLottieDefaultFailureListener", tossApplication.new IEngagementSignalsCallbackStubProxy(null));
        enableandroidlineartext.onNavigationEvent("tossObservabilityTtaCookieRefresh", new IEngagementSignalsCallback_Parcel(tossApplication, (access13800) null));
        enableandroidlineartext.onNavigationEvent("clearLottieInternalNetworkCache", tossApplication.new IPostMessageService(null));
        if (tossApplication.extraCallback().AudioAttributesImplApi21Parcelizer()) {
            enableandroidlineartext.onNavigationEvent("Tmoney.check", tossApplication.new ITrustedWebActivityCallbackStub(tossApplication2, null));
            enableandroidlineartext.onNavigationEvent("tossWebSocket.init", tossApplication.new IPostMessageService_Parcel(null));
            int i2 = ICustomTabsCallback + 53;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        enableandroidlineartext.onNavigationEvent("appGuard.start", tossApplication.new receiveFile(tossApplication2, null));
        enableandroidlineartext.onNavigationEvent("PerformanceMetricHelper.init", new setEngagementSignalsCallback(null));
        enableandroidlineartext.onExtraCallbackWithResult("appLockChecker.init", tossApplication.new requestPostMessageChannelWithExtras(tossApplication2, null));
        enableandroidlineartext.onNavigationEvent("legacyWebResourceCacheCleanup", new validateRelationship(enableandroidlineartext, tossApplication2, null));
        enableandroidlineartext.onNavigationEvent("tossShakeManager.init", tossApplication.new ICustomTabsServiceDefault(null));
        enableandroidlineartext.onNavigationEvent("TnkFactoryOfferwall.init", tossApplication.new ICustomTabsServiceStub(tossApplication2, null));
        enableandroidlineartext.onNavigationEvent("sdkConsentGatekeeper", tossApplication.new warmup(tossApplication2, null));
        enableandroidlineartext.onNavigationEvent("initPushNotificationChannelsIfNeed", tossApplication.new updateVisuals(tossApplication2, null));
        enableandroidlineartext.onNavigationEvent("initExoPlayer", tossApplication.new access200(null));
        enableandroidlineartext.onNavigationEvent("tossReactDistributionGroupManager.Initialize", tossApplication.new writeTypedList(null));
        enableandroidlineartext.onNavigationEvent("MinbuggerHelper.init", tossApplication2.new ICustomTabsService_Parcel(null));
        enableandroidlineartext.onNavigationEvent("initAppWidgets", tossApplication.new ICustomTabsServiceStubProxy(null));
        enableandroidlineartext.onNavigationEvent("shortcuts", tossApplication.new IEngagementSignalsCallbackDefault(tossApplication2, null));
        enableandroidlineartext.onNavigationEvent("LoginUtil.instance.registerScheduledLoginNudge", tossApplication.new onSessionEnded(null));
        enableandroidlineartext.onNavigationEvent("init KakaoLoginInterface", tossApplication.new onVerticalScrollEvent(tossApplication2, null));
        enableandroidlineartext.onNavigationEvent("initBenefitAds", tossApplication2.new onGreatestScrollPercentageIncreased(null));
        enableandroidlineartext.onNavigationEvent("init Device Performance If Needed", tossApplication.new IEngagementSignalsCallbackStub(null));
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(TextLinkScopeExternalSyntheticLambda3.Companion.onExtraCallbackWithResult()), (CoroutineContext) null, (setRandomHost) null, tossApplication.new IPostMessageServiceStubProxy(null), 3, (Object) null);
        int i2 = extraCallback + 117;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static final class IPostMessageServiceStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        IPostMessageServiceStubProxy(access13800<? super IPostMessageServiceStubProxy> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IPostMessageServiceStubProxy iPostMessageServiceStubProxy = TossApplication.this.new IPostMessageServiceStubProxy(access13800Var);
            int i2 = onExtraCallback + 85;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return iPostMessageServiceStubProxy;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IPostMessageServiceStubProxy iPostMessageServiceStubProxyCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return iPostMessageServiceStubProxyCreate.invokeSuspend(Unit.INSTANCE);
            }
            iPostMessageServiceStubProxyCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            try {
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    TossApplication tossApplication = TossApplication.this;
                    Result.Companion companion = Result.Companion;
                    List listListOf = (tossApplication.ICustomTabsServiceStub().get() == getPricingPhaseList.EU || tossApplication.ICustomTabsServiceStub().get() == getPricingPhaseList.AU) ? CollectionsKt.listOf(new String[]{"sumsubsdk", "incodesdk"}) : CollectionsKt.listOf("ocrengine");
                    applyTransparentTitle applytransparenttitle = tossApplication.requestPostMessageChannelWithExtras().get();
                    Intrinsics.checkNotNullExpressionValue(applytransparenttitle, "");
                    applyTransparentTitle applytransparenttitle2 = applytransparenttitle;
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.L$1 = access15400.onNavigationEvent(listListOf);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    if (applyTransparentTitle.onNavigationEvent(applytransparenttitle2, listListOf, null, this, 2, null) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                obj2 = Result.constructor-impl(Unit.INSTANCE);
            } catch (WebResourceResponseModel e) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            TossApplication tossApplication2 = TossApplication.this;
            if (Result.onNavigationEvent(obj2)) {
                int i5 = onNavigationEvent + 57;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                SplitCompat.install(tossApplication2);
            }
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                int i7 = onNavigationEvent + 21;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossApplication", "Failed to install dfm modules", th, (Map) null, 8, (Object) null);
                int i9 = onExtraCallback + 15;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.RememberLottieCompositionKtloadFontsFromAssets2, android.content.ContextWrapper
    public void attachBaseContext(@Nullable Context context) {
        int i = 2 % 2;
        int i2 = extraCallback + 35;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback3 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        String str = (String) RememberLottieCompositionKtloadFontsFromAssets2.onExtraCallbackWithResult(-1556913437, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), iIAuthTabCallback2, 1556913438, new Object[]{this}, iIAuthTabCallback3, iIAuthTabCallback);
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, str}, iOnWarmupCompleted, -2043799415, 2043799427);
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        if (((Boolean) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, str}, iOnWarmupCompleted2, -656613511, 656613535)).booleanValue()) {
            return;
        }
        SplitCompat.install(this);
        int i4 = extraCallback + 107;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 35;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            RnRemoteProcessWebViewDataDirectory rnRemoteProcessWebViewDataDirectory = RnRemoteProcessWebViewDataDirectory.onExtraCallbackWithResult;
            String packageName = tossApplication.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            rnRemoteProcessWebViewDataDirectory.onExtraCallbackWithResult(str, packageName, tossApplication.onExtraCallback);
            int i3 = ICustomTabsCallback + 107;
            extraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            throw null;
        }
        RnRemoteProcessWebViewDataDirectory rnRemoteProcessWebViewDataDirectory2 = RnRemoteProcessWebViewDataDirectory.onExtraCallbackWithResult;
        String packageName2 = tossApplication.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName2, "");
        rnRemoteProcessWebViewDataDirectory2.onExtraCallbackWithResult(str, packageName2, tossApplication.onExtraCallback);
        throw null;
    }

    private static final Unit isEngagementSignalsApiAvailable(TossApplication tossApplication) {
        Unit unit;
        int i = 2 % 2;
        int i2 = extraCallback + 81;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            tossApplication.RatingCompat1();
            unit = Unit.INSTANCE;
            int i3 = 87 / 0;
        } else {
            tossApplication.RatingCompat1();
            unit = Unit.INSTANCE;
        }
        int i4 = extraCallback + 37;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // o.RememberLottieCompositionKtloadFontsFromAssets2
    public void onWarmupCompleted(@Nullable String str) throws Throwable {
        int i = 2 % 2;
        if (str != null) {
            if (!StringsKt.endsWith$default(str, "scraper", false, 2, (Object) null)) {
                if (!StringsKt.endsWith$default(str, "pedometer", false, 2, (Object) null)) {
                    if (!StringsKt.endsWith$default(str, "backup", false, 2, (Object) null)) {
                        if (onExtraCallback(str)) {
                            getSmallIconId();
                            return;
                        }
                        return;
                    }
                    ITrustedWebActivityService_Parcel();
                    GetFeatureExtension getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
                    RetrofitService retrofitService = access200().get();
                    Intrinsics.checkNotNullExpressionValue(retrofitService, "");
                    RetrofitService retrofitService2 = retrofitService;
                    DetectFaceInSingleImage detectFaceInSingleImage = ICustomTabsCallbackStubProxy().get();
                    Intrinsics.checkNotNullExpressionValue(detectFaceInSingleImage, "");
                    DetectFaceInSingleImage detectFaceInSingleImage2 = detectFaceInSingleImage;
                    Map<String, ComputeDistances> map = onActivityResized().get();
                    Intrinsics.checkNotNullExpressionValue(map, "");
                    GetFeatureExtension.onNavigationEvent(getFeatureExtension, this, null, retrofitService2, detectFaceInSingleImage2, map, 0, null, null, null, null, 994, null);
                    return;
                }
                DetectClosedEyes detectClosedEyes = DetectClosedEyes.onWarmupCompleted;
                int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                detectClosedEyes.IAuthTabCallback(((AsyncImagePainterExternalSyntheticLambda0) ((Lazy) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, 757524558, -757524544)).get()).onWarmupCompleted());
                setEngagementSignalsCallback().get().onExtraCallbackWithResult();
                ITrustedWebActivityService_Parcel();
                GetFeatureExtension getFeatureExtension2 = GetFeatureExtension.onWarmupCompleted;
                RetrofitService retrofitService3 = access200().get();
                Intrinsics.checkNotNullExpressionValue(retrofitService3, "");
                RetrofitService retrofitService4 = retrofitService3;
                DetectFaceInSingleImage detectFaceInSingleImage3 = ICustomTabsCallbackStubProxy().get();
                Intrinsics.checkNotNullExpressionValue(detectFaceInSingleImage3, "");
                DetectFaceInSingleImage detectFaceInSingleImage4 = detectFaceInSingleImage3;
                Map<String, ComputeDistances> map2 = onActivityResized().get();
                Intrinsics.checkNotNullExpressionValue(map2, "");
                GetFeatureExtension.onNavigationEvent(getFeatureExtension2, this, null, retrofitService4, detectFaceInSingleImage4, map2, 0, null, null, null, null, 994, null);
                return;
            }
            getSmallIconBitmap();
            if (ICustomTabsServiceStub().get() != getPricingPhaseList.EU) {
                int i2 = extraCallback + 59;
                ICustomTabsCallback = i2 % 128;
                int i3 = i2 % 2;
                auth authVar = auth.onNavigationEvent;
                int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                auth.IAuthTabCallback(-573604731, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{authVar, (auth.onExtraCallback) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, false}, iOnWarmupCompleted2, 860080214, -860080181)}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 573604734, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
                authVar.onWarmupCompleted("USER", "tossDeviceId", onVerticalScrollEvent().get().onNavigationEvent());
                int i4 = extraCallback + 113;
                ICustomTabsCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            DetectClosedEyes detectClosedEyes2 = DetectClosedEyes.onWarmupCompleted;
            int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            detectClosedEyes2.IAuthTabCallback(((AsyncImagePainterExternalSyntheticLambda0) ((Lazy) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted3, 757524558, -757524544)).get()).onWarmupCompleted());
            write();
            MediaSessionCompatResultReceiverWrapper();
            System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");
            ITrustedWebActivityService_Parcel();
            GetFeatureExtension getFeatureExtension3 = GetFeatureExtension.onWarmupCompleted;
            RetrofitService retrofitService5 = access200().get();
            Intrinsics.checkNotNullExpressionValue(retrofitService5, "");
            RetrofitService retrofitService6 = retrofitService5;
            DetectFaceInSingleImage detectFaceInSingleImage5 = ICustomTabsCallbackStubProxy().get();
            Intrinsics.checkNotNullExpressionValue(detectFaceInSingleImage5, "");
            DetectFaceInSingleImage detectFaceInSingleImage6 = detectFaceInSingleImage5;
            Map<String, ComputeDistances> map3 = onActivityResized().get();
            Intrinsics.checkNotNullExpressionValue(map3, "");
            GetFeatureExtension.onNavigationEvent(getFeatureExtension3, this, null, retrofitService6, detectFaceInSingleImage6, map3, 0, null, null, null, null, 994, null);
            int i6 = ICustomTabsCallback + 37;
            extraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 81 / 0;
            }
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return iAuthTabCallbackCreate.invokeSuspend(unit);
            }
            iAuthTabCallbackCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = TossApplication.this.new IAuthTabCallback(access13800Var);
            int i2 = onExtraCallbackWithResult + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 23;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                TossApplication tossApplication = TossApplication.this;
                this.label = 1;
                if (TossApplication.onNavigationEvent(tossApplication, (access13800) this) == objOnWarmupCompleted) {
                    int i3 = onExtraCallback + 81;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = onExtraCallback + 93;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final void getSmallIconId() throws Throwable {
        int i = 2 % 2;
        getSmallIconBitmap();
        Object obj = null;
        if (ICustomTabsServiceStub().get() != getPricingPhaseList.EU) {
            int i2 = extraCallback + 43;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                auth authVar = auth.onNavigationEvent;
                auth.IAuthTabCallback(-573604731, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{authVar, ITrustedWebActivityCallbackStubProxy()}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 573604734, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
                authVar.onWarmupCompleted("USER", "tossDeviceId", onVerticalScrollEvent().get().onNavigationEvent());
                RatingCompatApi19Impl();
            } else {
                auth authVar2 = auth.onNavigationEvent;
                auth.IAuthTabCallback(-573604731, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{authVar2, ITrustedWebActivityCallbackStubProxy()}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 573604734, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
                authVar2.onWarmupCompleted("USER", "tossDeviceId", onVerticalScrollEvent().get().onNavigationEvent());
                RatingCompatApi19Impl();
                obj.hashCode();
                throw null;
            }
        }
        DetectClosedEyes detectClosedEyes = DetectClosedEyes.onWarmupCompleted;
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        detectClosedEyes.IAuthTabCallback(((AsyncImagePainterExternalSyntheticLambda0) ((Lazy) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, 757524558, -757524544)).get()).onWarmupCompleted());
        write();
        MediaSessionCompatResultReceiverWrapper();
        ITrustedWebActivityService_Parcel();
        ALCAntiSpoofingFaceQuality aLCAntiSpoofingFaceQuality = ALCAntiSpoofingFaceQuality.onExtraCallback;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = onSessionEnded().get();
        Intrinsics.checkNotNullExpressionValue(textRoundCornerProgressBarSavedState1, "");
        int iOnExtraCallback = onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = onSessionEnded.onExtraCallback();
        ALCAntiSpoofingFaceQuality.IAuthTabCallback(onSessionEnded.onExtraCallback(), iOnExtraCallback2, -1562967437, 1562967437, iOnExtraCallback3, new Object[]{aLCAntiSpoofingFaceQuality, this, textRoundCornerProgressBarSavedState1}, iOnExtraCallback);
        maybeUpdateAnimatable.onWarmupCompleted((CoroutineContext) null, new IAuthTabCallback(null), 1, (Object) null);
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        ((addMetadata) ((Lazy) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted2, -1733094178, 1733094212)).get()).onExtraCallbackWithResult();
        setTopGuideText.onWarmupCompleted.onWarmupCompleted(NameOrPseudonym.onExtraCallbackWithResult.onNavigationEvent());
        onDisappear.onWarmupCompleted(this);
        try {
            Result.Companion companion = Result.Companion;
            r8lambdaJvNhqeMSZnDqkobDnvayz6SKORQ.onExtraCallback.onExtraCallbackWithResult(this);
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
        GetFeatureExtension getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
        getAssetInfo getassetinfo = new getAssetInfo();
        DetectFaceInSingleImage detectFaceInSingleImage = ICustomTabsCallbackStubProxy().get();
        Intrinsics.checkNotNullExpressionValue(detectFaceInSingleImage, "");
        GetFeatureExtension.onWarmupCompleted(getFeatureExtension, this, (String) null, getassetinfo, detectFaceInSingleImage, RemoteProcessLogIngressStore.Companion.onWarmupCompleted(this), 2, (Object) null);
        int i3 = ICustomTabsCallback + 105;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    private final auth.onExtraCallback ITrustedWebActivityCallbackStubProxy() throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 19;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        String strAreNotificationsEnabled = areNotificationsEnabled();
        auth.onExtraCallback onextracallback = (auth.onExtraCallback) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, false}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 860080214, -860080181);
        Configuration configurationOnNavigationEvent = onextracallback.onNavigationEvent();
        Object[] objArr = new Object[1];
        a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132023906).substring(0, 12).length() + 53876), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 112, new char[]{35572, 50324, 44328, 33010}, new char[]{0, 0, 0, 0}, new char[]{10436, 22018, 32770, 61138}, objArr);
        configurationOnNavigationEvent.addMetadata("PROCESS", ((String) objArr[0]).intern(), strAreNotificationsEnabled);
        onextracallback.onNavigationEvent().addMetadata("PROCESS", "mainProcess", Boolean.FALSE);
        onextracallback.onNavigationEvent().addMetadata("RN", "remoteProcess", Boolean.TRUE);
        int i4 = ICustomTabsCallback + 113;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return onextracallback;
        }
        throw null;
    }

    private final void RatingCompatApi19Impl() throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 1;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        String strAreNotificationsEnabled = areNotificationsEnabled();
        auth authVar = auth.onNavigationEvent;
        Object[] objArr = new Object[1];
        a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 53770), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 19, new char[]{35572, 50324, 44328, 33010}, new char[]{0, 0, 0, 0}, new char[]{10436, 22018, 32770, 61138}, objArr);
        authVar.onWarmupCompleted("PROCESS", ((String) objArr[0]).intern(), strAreNotificationsEnabled);
        authVar.onWarmupCompleted("PROCESS", "mainProcess", Boolean.FALSE);
        authVar.onWarmupCompleted("RN", "remoteProcess", Boolean.TRUE);
        int i4 = extraCallback + 51;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String areNotificationsEnabled() {
        String str;
        int i = 2 % 2;
        int i2 = extraCallback + 73;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
            str = (String) RememberLottieCompositionKtloadFontsFromAssets2.onExtraCallbackWithResult(-1556913437, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1556913438, new Object[]{this}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), iIAuthTabCallback);
            int i3 = 13 / 0;
            if (str == null) {
                str = getPackageName() + ":rn_remote";
            }
        } else {
            int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
            str = (String) RememberLottieCompositionKtloadFontsFromAssets2.onExtraCallbackWithResult(-1556913437, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1556913438, new Object[]{this}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), iIAuthTabCallback2);
            if (str == null) {
            }
        }
        int i4 = extraCallback + 41;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private final boolean onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 73;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        RnProcessRuntime rnProcessRuntime = RnProcessRuntime.onWarmupCompleted;
        String packageName = getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        boolean zOnWarmupCompleted = rnProcessRuntime.onWarmupCompleted(str, packageName);
        int i4 = extraCallback + 125;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
        return zOnWarmupCompleted;
    }

    public void IEngagementSignalsCallback_Parcel() {
        int i = 2 % 2;
        write();
        maybeUpdateAnimatable.onNavigationEvent(findRes.onExtraCallbackWithResult(), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(null), 3, (Object) null);
        int i2 = extraCallback + 65;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        int label;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 75;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = TossApplication.this.new IAuthTabCallbackStub(access13800Var);
            int i2 = onWarmupCompleted + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackStub;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 73;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[PHI: r1
          0x0045: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
          0x0024: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 119;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 60 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    RealmDbManager realmDbManager = TossApplication.this.mayLaunchUrl().get();
                    this.label = 1;
                    if (realmDbManager.onExtraCallbackWithResult(this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = onWarmupCompleted + 61;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj);
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    public void onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 27;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        EncodedDataImplExternalSyntheticLambda0.onNavigationEvent(this).onExtraCallback();
        TopAppBarStateExternalSyntheticLambda1.onNavigationEvent(this).onExtraCallback();
        getAdSizeApi.IAuthTabCallback.IAuthTabCallback();
        PedometerService.Companion.IAuthTabCallback(this, str);
        MobileTmoneyService.Companion.onExtraCallbackWithResult(this, str);
        int i4 = ICustomTabsCallback + 27;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void RatingCompat1() {
        int i = 2 % 2;
        int i2 = extraCallback + 61;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        auth authVar = auth.onNavigationEvent;
        Cookies_set cookies_set = Cookies_set.onNavigationEvent;
        authVar.onWarmupCompleted("USER", "webViewVersion", cookies_set.onWarmupCompleted(this));
        authVar.onWarmupCompleted("USER", "inhouse", Boolean.valueOf(extraCallback().AudioAttributesCompatParcelizer()));
        authVar.onWarmupCompleted("USER", "packageDebuggable", Boolean.valueOf(extraCallback().onActivityLayout()));
        authVar.onWarmupCompleted("USER", "installerPackage", cookies_set.onNavigationEvent(this));
        authVar.onWarmupCompleted("USER", "pedometerEnabled", Boolean.valueOf(GuardedAsyncTask.IAuthTabCallback.IAuthTabCallbackDefault(this)));
        int i4 = ICustomTabsCallback + 1;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void RatingCompatStyle() throws NoWhenBranchMatchedException {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = onExtraCallback.IAuthTabCallback[DisplaySettingActivity.Companion.DisplaySetting.Companion.onExtraCallback().ordinal()];
        if (i3 == 1) {
            i = 1;
        } else if (i3 != 2) {
            int i4 = extraCallback;
            int i5 = i4 + 49;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 == 0 ? i3 != 3 : i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            int i6 = i4 + 91;
            ICustomTabsCallback = i6 % 128;
            i = -1;
            if (i6 % 2 != 0) {
                int i7 = 20 / 0;
            }
        }
        ITrustedWebActivityCallbackStubProxy.onWarmupCompleted(i);
    }

    private static final boolean ICustomTabsCallbackDefault(TossApplication tossApplication) {
        int i = 2 % 2;
        int i2 = extraCallback + 109;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {onTextViewSizeChanged.onExtraCallbackWithResult, tossApplication};
        boolean zIsWifi = ((alignTextProgressInsideProgress) onTextViewSizeChanged.IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1136607599, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1136607596)).isWifi();
        int i4 = extraCallback + 59;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return zIsWifi;
    }

    private static final boolean onUnminimized(TossApplication tossApplication) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 29;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {tossApplication};
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setAdUnitIds setadunitids = (setAdUnitIds) ((Lazy) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, iOnWarmupCompleted, -2093486642, 2093486642)).get();
        if (setadunitids == null || setadunitids.IAuthTabCallback()) {
            return false;
        }
        int i4 = extraCallback + 17;
        ICustomTabsCallback = i4 % 128;
        return i4 % 2 == 0;
    }

    public static final class onExtraCallbackWithResult implements y1f.onNavigationEvent {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private final kotlin.Lazy onNavigationEvent;

        public static /* synthetic */ SessionTrackerb onExtraCallbackWithResult(TossApplication tossApplication) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            SessionTrackerb sessionTrackerbOnWarmupCompleted = onWarmupCompleted(tossApplication);
            int i4 = onWarmupCompleted + 111;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return sessionTrackerbOnWarmupCompleted;
            }
            throw null;
        }

        onExtraCallbackWithResult(final TossApplication tossApplication) {
            this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.TossApplication$initTds$4$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke() {
                    SessionTrackerb sessionTrackerbOnExtraCallbackWithResult;
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 41;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        sessionTrackerbOnExtraCallbackWithResult = TossApplication.onExtraCallbackWithResult.onExtraCallbackWithResult(tossApplication);
                        int i3 = 1 / 0;
                    } else {
                        sessionTrackerbOnExtraCallbackWithResult = TossApplication.onExtraCallbackWithResult.onExtraCallbackWithResult(tossApplication);
                    }
                    int i4 = onExtraCallbackWithResult + 51;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        return sessionTrackerbOnExtraCallbackWithResult;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
        }

        private static final SessionTrackerb onWarmupCompleted(TossApplication tossApplication) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            SessionTrackerb sessionTrackerb = (SessionTrackerb) ((Lazy) TossApplication.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{tossApplication}, iOnWarmupCompleted, 1871728842, -1871728816)).get();
            int i4 = onExtraCallback + 39;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 74 / 0;
            }
            return sessionTrackerb;
        }
    }

    private final Object onExtraCallbackWithResult(access13800<? super Unit> access13800Var) {
        Locale locale;
        int i = 2 % 2;
        Function0 function0 = new Function0() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda3
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                Boolean boolValueOf;
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 29;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    boolValueOf = Boolean.valueOf(TossApplication.onWarmupCompleted(this.f$0));
                    int i4 = 64 / 0;
                } else {
                    boolValueOf = Boolean.valueOf(TossApplication.onWarmupCompleted(this.f$0));
                }
                int i5 = onNavigationEvent + 119;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return boolValueOf;
            }
        };
        boolean zIAuthTabCallback = UtilsKtExternalSyntheticLambda11.IAuthTabCallback(UtilsKtExternalSyntheticLambda11.IAuthTabCallback, "tds.keyboardAccessory.useKeyboardCTAButton", false, null, 6, null);
        AFj1rSDK aFj1rSDK = AFj1rSDK.onExtraCallback;
        Locale locale2 = this.asInterface;
        if (locale2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = ICustomTabsCallback + 79;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            locale = null;
        } else {
            locale = locale2;
        }
        Locale locale3 = locale;
        AFj1rSDK.onNavigationEvent(aFj1rSDK, this, locale3, RxDownloaderDownloadStatusReceiver.onWarmupCompleted().onExtraCallback().onNavigationEvent(), RxDownloaderDownloadStatusReceiver.onWarmupCompleted().IAuthTabCallback().onNavigationEvent(), function0, new Function0() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda4
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i4 = 2 % 2;
                int i5 = onNavigationEvent + 55;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                boolean zIAuthTabCallbackStub = TossApplication.IAuthTabCallbackStub(this.f$0);
                if (i6 == 0) {
                    return Boolean.valueOf(zIAuthTabCallbackStub);
                }
                Boolean.valueOf(zIAuthTabCallbackStub);
                throw null;
            }
        }, new onNavigationEvent(this, zIAuthTabCallback), (getWriteSuccessCountokhttp) null, new newCall(access14000.onNavigationEvent(10), (Function1) null, 2, (DefaultConstructorMarker) null), 128, (Object) null);
        y1f.onExtraCallbackWithResult.onNavigationEvent(new onExtraCallbackWithResult(this));
        deprecated_priorResponse.onNavigationEvent.onExtraCallback(getAppEnteredForegroundTimeMillis.onWarmupCompleted.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 57;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void getActiveNotifications() {
        int i = 2 % 2;
        final setTopGuideFontStyle.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = new setTopGuideFontStyle.IAuthTabCallbackStubProxy(onVerticalScrollEvent().get().onExtraCallback());
        CommonModule_setSecureScreen.onWarmupCompleted.IAuthTabCallback(new Function1() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda23
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 105;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                setTopGuideFontStyle.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy2 = iAuthTabCallbackStubProxy;
                if (i4 != 0) {
                    return TossApplication.onNavigationEvent(iAuthTabCallbackStubProxy2, this, (Context) obj);
                }
                Unit unitOnNavigationEvent = TossApplication.onNavigationEvent(iAuthTabCallbackStubProxy2, this, (Context) obj);
                int i5 = 36 / 0;
                return unitOnNavigationEvent;
            }
        });
        int i2 = ICustomTabsCallback + 31;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 45 / 0;
        }
    }

    private static final Unit onExtraCallbackWithResult(setTopGuideFontStyle.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy, TossApplication tossApplication, Context context) {
        int i = 2 % 2;
        int i2 = extraCallback + 27;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            CommonModule_setSecureScreen commonModule_setSecureScreen = CommonModule_setSecureScreen.onWarmupCompleted;
            commonModule_setSecureScreen.onExtraCallback(iAuthTabCallbackStubProxy.toString());
            commonModule_setSecureScreen.onExtraCallback(tossApplication.extraCallback().access100());
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        CommonModule_setSecureScreen commonModule_setSecureScreen2 = CommonModule_setSecureScreen.onWarmupCompleted;
        commonModule_setSecureScreen2.onExtraCallback(iAuthTabCallbackStubProxy.toString());
        commonModule_setSecureScreen2.onExtraCallback(tossApplication.extraCallback().access100());
        Unit unit2 = Unit.INSTANCE;
        int i3 = ICustomTabsCallback + 91;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 45;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        DERSet dERSet = DERSet.onExtraCallback;
        if (i3 != 0) {
            return dERSet.ComponentActivityExternalSyntheticLambda5();
        }
        dERSet.ComponentActivityExternalSyntheticLambda5();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = extraCallback + 121;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zComponentActivityExternalSyntheticLambda6 = DERSet.onExtraCallback.ComponentActivityExternalSyntheticLambda6();
        int i4 = extraCallback + 69;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return zComponentActivityExternalSyntheticLambda6;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[PHI: r3
      0x0044: PHI (r3v4 boolean) = (r3v1 boolean), (r3v5 boolean) binds: [B:14:0x0041, B:22:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[PHI: r3
      0x0046: PHI (r3v5 boolean) = (r3v0 boolean), (r3v6 boolean) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[PHI: r3
      0x0026: PHI (r3v1 boolean) = (r3v0 boolean), (r3v6 boolean) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void ITrustedWebActivityServiceStub() {
        boolean z;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 21;
        extraCallback = i2 % 128;
        boolean z2 = true;
        if (i2 % 2 == 0) {
            z = true;
            if (extraCallback().AudioAttributesCompatParcelizer()) {
                if ((!extraCallback().MediaDescriptionCompat() || (!DERSet.onExtraCallback.onRequestPermissionsResult())) && !extraCallback().RemoteActionCompatParcelizer()) {
                    z2 = z;
                } else {
                    int i3 = extraCallback + 111;
                    ICustomTabsCallback = i3 % 128;
                    int i4 = i3 % 2;
                }
            } else {
                if (!extraCallback().onActivityLayout()) {
                    int i5 = ICustomTabsCallback + 69;
                    extraCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        extraCallback().MediaSessionCompatQueueItem();
                        throw null;
                    }
                    if (!extraCallback().MediaSessionCompatQueueItem()) {
                    }
                }
                int i32 = extraCallback + 111;
                ICustomTabsCallback = i32 % 128;
                int i42 = i32 % 2;
            }
        } else {
            z = false;
            if (extraCallback().AudioAttributesCompatParcelizer()) {
            }
        }
        setLayoutConstraintsNative.onNavigationEvent.onExtraCallback(extraCallback().AudioAttributesImplBaseParcelizer(), new Function0() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda28
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 13;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                String strOnWarmupCompleted = TossApplication.onWarmupCompleted();
                if (i8 == 0) {
                    int i9 = 26 / 0;
                }
                return strOnWarmupCompleted;
            }
        }, z2);
        TossBridgeWebView.Companion.onWarmupCompleted(new Function0() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda29
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 67;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                Boolean boolValueOf = Boolean.valueOf(((Boolean) TossApplication.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[0], iOnWarmupCompleted, -1590477919, 1590477926)).booleanValue());
                int i9 = onWarmupCompleted + 27;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    return boolValueOf;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
    }

    private final void MediaSessionCompatToken() throws Throwable {
        int i = 2 % 2;
        if (onVerticalScrollEvent().get().IAuthTabCallbackStub()) {
            int i2 = extraCallback + 97;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "seed_generated", null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("base_size", Long.valueOf(addPolicy.onSessionEnded().IAuthTabCallback())), getWrite.IAuthTabCallback("base_keys", CollectionsKt.joinToString$default(addPolicy.onSessionEnded().onWarmupCompleted(), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)), getWrite.IAuthTabCallback("ga_no", PlayerErrorCode.onActivityLayout())}), null, false, null, 58, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        }
        int i4 = ICustomTabsCallback + 17;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void getSmallIconBitmap() {
        int i = 2 % 2;
        final MapConverter mapConverterOnExtraCallbackWithResult = NetConverter3.onExtraCallbackWithResult(Looper.getMainLooper(), true);
        RxAndroidPlugins.onExtraCallback(new deserializeIntNullableCollection() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object apply(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 13;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                MapConverter mapConverterOnWarmupCompleted = TossApplication.onWarmupCompleted(mapConverterOnExtraCallbackWithResult, (Callable) obj);
                int i5 = IAuthTabCallback + 105;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return mapConverterOnWarmupCompleted;
            }
        });
        RxAndroidPlugins.IAuthTabCallback(new deserializeIntNullableCollection() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object apply(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 109;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                MapConverter mapConverterOnNavigationEvent = TossApplication.onNavigationEvent(mapConverterOnExtraCallbackWithResult, (MapConverter) obj);
                int i5 = onNavigationEvent + 9;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return mapConverterOnNavigationEvent;
            }
        });
        int i2 = ICustomTabsCallback + 25;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda17
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 65;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    TossApplication.onExtraCallback(this.f$0, defaultUncaughtExceptionHandler, thread, th);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                TossApplication.onExtraCallback(this.f$0, defaultUncaughtExceptionHandler, thread, th);
                int i4 = onExtraCallbackWithResult + 101;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = ICustomTabsCallback + 29;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void onExtraCallbackWithResult(TossApplication tossApplication, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) throws Throwable {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNull(th);
        if (tossApplication.onWarmupCompleted(th)) {
            auth.IAuthTabCallback(492574823, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{auth.onNavigationEvent, th, access8100.onNavigationEvent(getWrite.IAuthTabCallback("workaround", "SEAND-3293"))}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -492574818, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
            int i3 = extraCallback + 77;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        ((onAccuracyChanged) ((Lazy) onExtraCallbackWithResult(896147137 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132025704).substring(0, 5).codePointAt(3), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1686738356, ComposableSingletons$SelectAccountScreenKt$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{tossApplication}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -184288873, 184288894)).get()).onNavigationEvent(th);
        if (ka.onWarmupCompleted.onExtraCallback()) {
            i = 0;
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, th, null, tossApplication.cancelNotification(), false, 10, null);
        } else {
            i = 0;
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, th, null, null, false, 14, null);
            int i5 = extraCallback + 3;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        TextRoundCornerProgressBarSavedState1 smallIconBitmap = addPolicy.getSmallIconBitmap();
        Object[] objArr = new Object[1];
        a((char) (51866 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 28598102 - (TypedValue.complexToFloat(i) > 0.0f ? 1 : (TypedValue.complexToFloat(i) == 0.0f ? 0 : -1)), new char[]{6327, 61979, 5698, 32489, 52089, 47963, 51298, 18134, 51020, 64043, 30915, 5302, 46945, 37330, 50143, 33994, 15217, 3933, 49670}, new char[]{0, 0, 0, 0}, new char[]{22138, 46175, 39425, 34762}, objArr);
        smallIconBitmap.onTransact(((String) objArr[i]).intern());
        if (uncaughtExceptionHandler != null) {
            int i7 = ICustomTabsCallback + 97;
            extraCallback = i7 % 128;
            int i8 = i7 % 2;
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[PHI: r5
      0x007a: PHI (r5v6 java.lang.StackTraceElement) = (r5v5 java.lang.StackTraceElement), (r5v9 java.lang.StackTraceElement) binds: [B:28:0x0078, B:25:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onWarmupCompleted(Throwable th) {
        StackTraceElement stackTraceElement;
        int i = 2 % 2;
        if (!(th instanceof IndexOutOfBoundsException)) {
            return false;
        }
        String message = th.getMessage();
        if (message == null) {
            int i2 = ICustomTabsCallback + 103;
            extraCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!StringsKt.contains$default(message, "getChildDrawingOrder()", false, 2, (Object) null)) {
            int i3 = ICustomTabsCallback + 117;
            extraCallback = i3 % 128;
            return i3 % 2 == 0;
        }
        StackTraceElement[] stackTrace = ((IndexOutOfBoundsException) th).getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        int length = stackTrace.length;
        int i4 = ICustomTabsCallback + 107;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 3;
        }
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = ICustomTabsCallback + 25;
            extraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                stackTraceElement = stackTrace[i6];
                int i8 = 70 / 0;
                if (!Intrinsics.areEqual(stackTraceElement.getMethodName(), "getAndVerifyPreorderedIndex")) {
                    continue;
                } else if (Intrinsics.areEqual(stackTraceElement.getFileName(), "ViewGroup.java")) {
                    int i9 = extraCallback + 85;
                    ICustomTabsCallback = i9 % 128;
                    return i9 % 2 == 0;
                }
            } else {
                stackTraceElement = stackTrace[i6];
                if (!Intrinsics.areEqual(stackTraceElement.getMethodName(), "getAndVerifyPreorderedIndex")) {
                    continue;
                }
            }
        }
        return false;
    }

    private final Map<String, String> cancelNotification() throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 73;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((char) (53888 - View.resolveSizeAndState(0, 0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(12) - 99, new char[]{35572, 50324, 44328, 33010}, new char[]{0, 0, 0, 0}, new char[]{10436, 22018, 32770, 61138}, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "mini_app_crash");
        ka kaVar = ka.onWarmupCompleted;
        Map<String, String> mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback("appName", kaVar.IAuthTabCallback()), getWrite.IAuthTabCallback("deploymentId", kaVar.onExtraCallbackWithResult())});
        int i4 = ICustomTabsCallback + 83;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return mapOnWarmupCompleted;
    }

    private static final void onExtraCallbackWithResult(TossApplication tossApplication, Throwable th) {
        int i = 2 % 2;
        if (th == null) {
            return;
        }
        if (!RootForTestUncaughtExceptionHandler.onExtraCallbackWithResult(th)) {
            if (tossApplication.extraCallback().onActivityLayout()) {
                int i2 = extraCallback + 15;
                ICustomTabsCallback = i2 % 128;
                int i3 = i2 % 2;
                if (tossApplication.extraCallback().ICustomTabsCallback_Parcel()) {
                    throw new IllegalStateException("Unable to parse composition", th);
                }
                return;
            }
            return;
        }
        int i4 = extraCallback + 27;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void MediaDescriptionCompat() {
        int i = 2 % 2;
        try {
            Field declaredField = LottieAnimationView.class.getDeclaredField("DEFAULT_FAILURE_LISTENER");
            Intrinsics.checkNotNullExpressionValue(declaredField, "");
            declaredField.setAccessible(true);
            declaredField.set(null, new ManagedRetainedValuesStoreKtExternalSyntheticLambda0() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda24
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final void onResult(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 71;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    TossApplication.onNavigationEvent(this.f$0, (Throwable) obj);
                    if (i4 == 0) {
                        int i5 = 64 / 0;
                    }
                }
            });
            int i2 = ICustomTabsCallback + 113;
            extraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        Unit unit;
        TossApplication tossApplication = (TossApplication) objArr[0];
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            File file = new File(tossApplication.getCacheDir(), "lottie_network_cache");
            if (!file.exists()) {
                int i2 = ICustomTabsCallback + 9;
                extraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                file = null;
            }
            if (file != null) {
                int i3 = extraCallback + 87;
                ICustomTabsCallback = i3 % 128;
                int i4 = i3 % 2;
                zzbk.onNavigationEvent(file, (Set) null, 1, (Object) null);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.constructor-impl(unit);
            return null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
            return null;
        }
    }

    private final void MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        final Function1 function1 = new Function1() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda26
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 15;
                onExtraCallback = i3 % 128;
                Throwable th = (Throwable) obj;
                if (i3 % 2 == 0) {
                    TossApplication.onNavigationEvent(th);
                    throw null;
                }
                Unit unitOnNavigationEvent = TossApplication.onNavigationEvent(th);
                int i4 = onExtraCallback + 19;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitOnNavigationEvent;
                }
                throw null;
            }
        };
        RxJavaPlugins.onWarmupCompleted(new deserializeFloat() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda27
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final void accept(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 113;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                TossApplication.onExtraCallbackWithResult(function1, obj);
                if (i4 != 0) {
                    throw null;
                }
            }
        });
        int i2 = extraCallback + 125;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 99;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallback + 95;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 117;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            zzav zzavVarOnExtraCallback = zzat.onExtraCallback();
            Intrinsics.checkNotNull(th);
            zzav.IAuthTabCallback(zzavVarOnExtraCallback, th, "RxJavaErrorHandler", true, 3, (Object) null);
        } else {
            zzav zzavVarOnExtraCallback2 = zzat.onExtraCallback();
            Intrinsics.checkNotNull(th);
            zzav.IAuthTabCallback(zzavVarOnExtraCallback2, th, "RxJavaErrorHandler", false, 4, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private final void write() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 79;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        MediaSessionCompatQueueItem();
        RatingCompatStarStyle();
        int i4 = extraCallback + 123;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
    }

    private final void RatingCompatStarStyle() {
        int i = 2 % 2;
        int i2 = extraCallback + 35;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            String strAsBinder = PlayerErrorCode.asBinder();
            if (TextUtils.isEmpty(strAsBinder)) {
                return;
            }
            auth.onNavigationEvent.onWarmupCompleted("USER", "deletedId", "ga#" + strAsBinder);
            int i3 = extraCallback + 107;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        TextUtils.isEmpty(PlayerErrorCode.asBinder());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IPostMessageServiceDefault() {
        synchronized (this) {
            auth.onExtraCallback onextracallback = (auth.onExtraCallback) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, true}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 860080214, -860080181);
            if (this.onNavigationEvent) {
                auth.onNavigationEvent.onWarmupCompleted(onextracallback.onExtraCallbackWithResult());
                if (onextracallback.onExtraCallbackWithResult()) {
                    MediaSessionCompatQueueItem();
                    RatingCompatStarStyle();
                }
                return;
            }
            if (onextracallback.onExtraCallbackWithResult()) {
                auth authVar = auth.onNavigationEvent;
                auth.IAuthTabCallback(-573604731, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{authVar, onextracallback}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 573604734, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
                this.onNavigationEvent = true;
                authVar.onWarmupCompleted("USER", "tossDeviceId", onVerticalScrollEvent().get().onNavigationEvent());
                MediaSessionCompatQueueItem();
                RatingCompatStarStyle();
                RatingCompat1();
            }
        }
    }

    public final void IEngagementSignalsCallbackStubProxy() {
        synchronized (this) {
            if (this.onNavigationEvent) {
                auth.onNavigationEvent.onWarmupCompleted(false);
            }
        }
    }

    private final void MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        if (PlayerErrorCode.onActivityLayout().length() <= 0) {
            auth.onNavigationEvent.onNavigationEvent();
            int i2 = extraCallback + 121;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = ICustomTabsCallback + 91;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        auth.onNavigationEvent.onNavigationEvent(PlayerErrorCode.onActivityLayout());
        int i6 = ICustomTabsCallback + 119;
        extraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object ICustomTabsCallback_Parcel(Object[] objArr) {
        boolean z = false;
        final TossApplication tossApplication = (TossApplication) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        getPricingPhaseList getpricingphaselist = tossApplication.ICustomTabsServiceStub().get();
        Intrinsics.checkNotNullExpressionValue(getpricingphaselist, "");
        getPricingPhaseList getpricingphaselist2 = getpricingphaselist;
        if (tossApplication.ICustomTabsCallback_Parcel().get().IAuthTabCallback(onViewDraw.Analytics) == getIconPaddingTop.Start && (zBooleanValue || getpricingphaselist2 != getPricingPhaseList.EU)) {
            int i2 = ICustomTabsCallback + 65;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        }
        boolean zOnActivityLayout = tossApplication.extraCallback().onActivityLayout();
        String smallIconBitmap = tossApplication.extraCallback().getSmallIconBitmap();
        String upperCase = getpricingphaselist2.getCode().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        Configuration configurationLoad = Configuration.load(tossApplication);
        configurationLoad.setProjectPackages(clearFaultAdjacentMetadata.onExtraCallback(new String[]{"im.toss", "viva.republica"}));
        if (getpricingphaselist2 != getPricingPhaseList.EU) {
            int i4 = extraCallback + 53;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 == 0 ? Build.VERSION.SDK_INT >= 30 : Build.VERSION.SDK_INT >= 111) {
                configurationLoad.addPlugin(new BugsnagExitInfoPlugin((ExitInfoPluginConfiguration) null, 1, (DefaultConstructorMarker) null));
            }
        }
        configurationLoad.addMetadata("APP", "rcNumber", tossApplication.extraCallback().postMessage());
        configurationLoad.addMetadata("APP", "commitHash", tossApplication.extraCallback().onPostMessage());
        configurationLoad.addOnError(new OnErrorCallback() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final boolean onError(Event event) {
                int i5 = 2 % 2;
                int i6 = onWarmupCompleted + 47;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                boolean zOnNavigationEvent = TossApplication.onNavigationEvent(this.f$0, event);
                if (i7 == 0) {
                    int i8 = 42 / 0;
                }
                return zOnNavigationEvent;
            }
        });
        Unit unit = Unit.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(configurationLoad, "");
        return new auth.onExtraCallback(z, zOnActivityLayout, tossApplication, smallIconBitmap, upperCase, zBooleanValue, configurationLoad, null, 128, null);
    }

    private static final boolean onExtraCallback(TossApplication tossApplication, Event event) {
        Throwable originalError;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 65;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(event, "");
            event.getApp().setId(tossApplication.extraCallback().getInterfaceDescriptor());
            originalError = event.getOriginalError();
            int i3 = 43 / 0;
            if (!(originalError instanceof TossApiCallException)) {
                return true;
            }
        } else {
            Intrinsics.checkNotNullParameter(event, "");
            event.getApp().setId(tossApplication.extraCallback().getInterfaceDescriptor());
            originalError = event.getOriginalError();
            if (!(originalError instanceof TossApiCallException)) {
                return true;
            }
        }
        int i4 = ICustomTabsCallback + 103;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        Map mapIAuthTabCallback = onNativeCrash.IAuthTabCallback((TossApiCallException) originalError);
        if (i5 == 0) {
            event.addMetadata("TossApiCall", mapIAuthTabCallback);
            int i6 = 90 / 0;
        } else {
            event.addMetadata("TossApiCall", mapIAuthTabCallback);
        }
        int i7 = ICustomTabsCallback + 121;
        extraCallback = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivity(@Nullable Intent intent) {
        int i = 2 % 2;
        int i2 = extraCallback + 29;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            AttributeCertificate.onWarmupCompleted.onNavigationEvent(this, intent);
            super.startActivity(intent);
            int i3 = extraCallback + 125;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        AttributeCertificate.onWarmupCompleted.onNavigationEvent(this, intent);
        super.startActivity(intent);
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivity(@Nullable Intent intent, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 107;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        AttributeCertificate.onWarmupCompleted.onNavigationEvent(this, intent);
        super.startActivity(intent, bundle);
        int i4 = extraCallback + 97;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 105;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        final Function0 function0 = (Function0) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallback = clearTid.onExtraCallback().onExtraCallback(new Runnable() { // from class: im.toss.TossApplication$$ExternalSyntheticLambda32
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 7;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                TossApplication.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{function0}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -2103530217, 2103530247);
                int i5 = onWarmupCompleted + 25;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnExtraCallback, "");
        int i2 = extraCallback + 55;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return deserializeurinullablecollectionOnExtraCallback;
        }
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context createWindowContext(@NotNull Display display, int i, @Nullable Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 83;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(display, "");
        getPluginName getpluginname = getPluginName.onExtraCallback;
        Context contextCreateWindowContext = super.createWindowContext(display, i, bundle);
        Intrinsics.checkNotNullExpressionValue(contextCreateWindowContext, "");
        Context contextIAuthTabCallback = getpluginname.IAuthTabCallback(contextCreateWindowContext);
        int i5 = extraCallback + 121;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return contextIAuthTabCallback;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        boolean z = true;
        String str = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        Function1<? super enableAndroidLinearText, Unit> function1 = (Function1) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj = objArr[5];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 93;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parallelLoad");
        }
        if ((iIntValue & 2) != 0) {
            int i5 = i3 + 87;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            z = zBooleanValue;
        }
        return tossApplication.onExtraCallback(str, z, function1);
    }

    private final enableAndroidLinearText onExtraCallback(String str, boolean z, Function1<? super enableAndroidLinearText, Unit> function1) {
        enableDoubleMeasurementFixAndroid enableimageprefetchingandroid;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 51;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        getTextProgressSize gettextprogresssize = updateVisuals().get();
        Intrinsics.checkNotNullExpressionValue(gettextprogresssize, "");
        getTextProgressSize gettextprogresssize2 = gettextprogresssize;
        getUnhandled getunhandledOnExtraCallback = ((drawTextProgressColor) ((Lazy) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -866222907, 866222930)).get()).onExtraCallback();
        if (gettextprogresssize2.IAuthTabCallbackStub() || gettextprogresssize2.onExtraCallbackWithResult() || extraCallback().onActivityLayout()) {
            enableimageprefetchingandroid = new enableImagePrefetchingAndroid(str, gettextprogresssize2, getunhandledOnExtraCallback);
        } else {
            enableimageprefetchingandroid = new enableDoubleMeasurementFixAndroid(str);
            int i4 = ICustomTabsCallback + 33;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        function1.invoke(enableimageprefetchingandroid);
        if (!z) {
            enableimageprefetchingandroid.onNavigationEvent();
            return enableimageprefetchingandroid;
        }
        int i6 = extraCallback + 29;
        ICustomTabsCallback = i6 % 128;
        int i7 = i6 % 2;
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean z2 = Build.VERSION.SDK_INT >= 29 && Trace.isEnabled();
        if (z2) {
            Trace.beginSection("init:" + str);
        }
        try {
            enableimageprefetchingandroid.onExtraCallbackWithResult();
            Unit unit = Unit.INSTANCE;
            bd.onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), new Object[]{asInterface().get(), str, Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis)}, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1569279588, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1569279589, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback());
            return enableimageprefetchingandroid;
        } finally {
            if (z2) {
                Trace.endSection();
            }
        }
    }

    private final void read() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 113;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT >= 30) {
            int i4 = extraCallback + 103;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            writeTypedList().get().onNavigationEvent(this);
        }
        int i6 = extraCallback + 87;
        ICustomTabsCallback = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private final void notifyNotificationWithChannel() {
        int i = 2 % 2;
        setUsed setused = IAuthTabCallbackStubProxy().get();
        List<ComponentName> listOnExtraCallback = setused.onExtraCallback(this);
        Set set = CollectionsKt.toSet(setused.onWarmupCompleted(this));
        boolean zIsEmpty = set.isEmpty();
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this);
        Iterator<T> it = listOnExtraCallback.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                return;
            }
            ComponentName componentName = (ComponentName) it.next();
            Intrinsics.checkNotNull(appWidgetManager);
            if (zIsEmpty || !set.contains(componentName)) {
                z = false;
            } else {
                int i2 = extraCallback;
                int i3 = i2 + 87;
                ICustomTabsCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 91;
                ICustomTabsCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            setused.IAuthTabCallback(this, appWidgetManager, componentName, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00da, code lost:
    
        if (r9.onExtraCallback(r4) == r5) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        onWarmupCompleted onwarmupcompleted;
        TossApplication tossApplication = (TossApplication) objArr[0];
        onWarmupCompleted onwarmupcompleted2 = (access13800) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallback + 29;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = onwarmupcompleted2 instanceof onWarmupCompleted;
            throw null;
        }
        if (onwarmupcompleted2 instanceof onWarmupCompleted) {
            onwarmupcompleted = onwarmupcompleted2;
            int i3 = onwarmupcompleted.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = extraCallback + 121;
                ICustomTabsCallback = i4 % 128;
                int i5 = i4 % 2;
                onwarmupcompleted.label = i3 - 2147483648;
            } else {
                onwarmupcompleted = tossApplication.new onWarmupCompleted(onwarmupcompleted2);
                int i6 = extraCallback + 27;
                ICustomTabsCallback = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i8 = onwarmupcompleted.label;
        try {
            try {
            } catch (Exception e) {
                Result.Companion companion = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(e));
            } catch (WebResourceResponseModel e2) {
                Result.Companion companion2 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(e2));
                int i9 = extraCallback + 99;
                ICustomTabsCallback = i9 % 128;
                int i10 = i9 % 2;
            } catch (CancellationException e3) {
                throw e3;
            }
        } catch (Exception e4) {
            Result.Companion companion3 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(e4));
        } catch (WebResourceResponseModel e5) {
            Result.Companion companion4 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(e5));
        } catch (CancellationException e6) {
            throw e6;
        }
        if (i8 != 0) {
            int i11 = extraCallback + 111;
            ICustomTabsCallback = i11 % 128;
            if (i11 % 2 == 0 ? i8 != 1 : i8 != 1) {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                Result.constructor-impl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj);
        } else {
            ResultKt.onNavigationEvent(obj);
            Result.Companion companion5 = Result.Companion;
            Response response = Response.onNavigationEvent;
            endDrag enddragIAuthTabCallback = ((getClientWidth) Response.onExtraCallback(tossApplication, getClientWidth.class)).IAuthTabCallback();
            onwarmupcompleted.L$0 = access15400.onNavigationEvent(onwarmupcompleted);
            onwarmupcompleted.I$0 = 0;
            onwarmupcompleted.I$1 = 0;
            onwarmupcompleted.label = 1;
            if (enddragIAuthTabCallback.IAuthTabCallback(onwarmupcompleted) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        Result.constructor-impl(Unit.INSTANCE);
        Result.Companion companion6 = Result.Companion;
        Response response2 = Response.onNavigationEvent;
        RedirectionLogFlushScheduler neutralButtonIcon = ((RedirectionLogFlushEntryPoint) Response.onExtraCallback(tossApplication, RedirectionLogFlushEntryPoint.class)).setNeutralButtonIcon();
        onwarmupcompleted.L$0 = access15400.onNavigationEvent(onwarmupcompleted);
        onwarmupcompleted.I$0 = 0;
        onwarmupcompleted.I$1 = 0;
        onwarmupcompleted.label = 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TossApplication tossApplication, enableAndroidLinearText enableandroidlineartext) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{tossApplication, enableandroidlineartext}, iOnWarmupCompleted, -1104005707, 1104005709);
    }

    public static /* synthetic */ Unit IAuthTabCallback(TossApplication tossApplication) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{tossApplication}, iOnWarmupCompleted, -755836151, 755836183);
    }

    public static /* synthetic */ Unit IAuthTabCallback(TossApplication tossApplication, TossApplication tossApplication2, enableAndroidLinearText enableandroidlineartext) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{tossApplication, tossApplication2, enableandroidlineartext}, iOnWarmupCompleted, 1455300895, -1455300880);
    }

    public static /* synthetic */ void IAuthTabCallback(Function0 function0) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{function0}, iOnWarmupCompleted, -2103530217, 2103530247);
    }

    public static /* synthetic */ Unit onExtraCallback(TossApplication tossApplication) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{tossApplication}, iOnWarmupCompleted, 1441288417, -1441288406);
    }

    public static /* synthetic */ boolean IAuthTabCallbackStub() {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Boolean) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[0], iOnWarmupCompleted, -1590477919, 1590477926)).booleanValue();
    }

    public static final /* synthetic */ void onMinimized(TossApplication tossApplication) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{tossApplication}, iOnWarmupCompleted, -965645975, 965645980);
    }

    public static final /* synthetic */ void ICustomTabsCallbackStubProxy(TossApplication tossApplication) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{tossApplication}, iOnWarmupCompleted, -294392397, 294392407);
    }

    private final void ITrustedWebActivityCallback_Parcel() {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, -1348194823, 1348194848);
    }

    private final void IAuthTabCallback(String str) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, str}, iOnWarmupCompleted, -2043799415, 2043799427);
    }

    private final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, access13800Var}, iOnWarmupCompleted, -888978334, 888978347);
    }

    private final auth.onExtraCallback IAuthTabCallback(boolean z) {
        return (auth.onExtraCallback) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, Boolean.valueOf(z)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 860080214, -860080181);
    }

    private static final String asBinder(InterfaceC0059deInitialize interfaceC0059deInitialize) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (String) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{interfaceC0059deInitialize}, iOnWarmupCompleted, -567280918, 567280926);
    }

    private static final String asInterface(InterfaceC0059deInitialize interfaceC0059deInitialize) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (String) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{interfaceC0059deInitialize}, iOnWarmupCompleted, 158774793, -158774762);
    }

    private static final String IAuthTabCallbackDefault(InterfaceC0059deInitialize interfaceC0059deInitialize) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (String) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{interfaceC0059deInitialize}, iOnWarmupCompleted, -269222356, 269222383);
    }

    private static final MapConverter IAuthTabCallback(MapConverter mapConverter, Callable callable) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (MapConverter) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{mapConverter, callable}, iOnWarmupCompleted, 196337534, -196337533);
    }

    private final void ITrustedWebActivityServiceStubProxy() {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, -1990444538, 1990444566);
    }

    private final boolean onNavigationEvent(String str) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Boolean) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, str}, iOnWarmupCompleted, -656613511, 656613535)).booleanValue();
    }

    private static final Unit IAuthTabCallback(GeckoHubImp1 geckoHubImp1, GeckoHubImp1 geckoHubImp12, GeckoHubImp1 geckoHubImp13, enableAndroidLinearText enableandroidlineartext) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{geckoHubImp1, geckoHubImp12, geckoHubImp13, enableandroidlineartext}, iOnWarmupCompleted, -462404191, 462404207);
    }

    private static final Unit onExtraCallbackWithResult(TossApplication tossApplication, TossApplication tossApplication2, GeckoHubImp1 geckoHubImp1, GeckoHubImp1 geckoHubImp12, enableAndroidLinearText enableandroidlineartext) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{tossApplication, tossApplication2, geckoHubImp1, geckoHubImp12, enableandroidlineartext}, iOnWarmupCompleted, 2139931358, -2139931329);
    }

    private static final Unit mayLaunchUrl(TossApplication tossApplication) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{tossApplication}, iOnWarmupCompleted, 1305324550, -1305324531);
    }

    static /* synthetic */ enableAndroidLinearText onNavigationEvent(TossApplication tossApplication, String str, boolean z, Function1 function1, int i, Object obj) {
        return (enableAndroidLinearText) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{tossApplication, str, Boolean.valueOf(z), function1, Integer.valueOf(i), obj}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1205204852, 1205204861);
    }

    private final void MediaBrowserCompatMediaItem() {
        onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132028169).substring(0, 4).codePointAt(0) - 1998714684, new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 26968718, -26968714);
    }

    public final Lazy<drawTextProgressColor> IAuthTabCallbackDefault() {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Lazy) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, -866222907, 866222930);
    }

    public final Lazy<isBluetoothEnabled> asBinder() {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Lazy) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, 483119486, -483119468);
    }

    public final Lazy<onAccuracyChanged> access100() {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Lazy) onExtraCallbackWithResult(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132025704).substring(0, 5).codePointAt(3) + 896147137, 1686738356 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), ComposableSingletons$SelectAccountScreenKt$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{this}, iOnWarmupCompleted, -184288873, 184288894);
    }

    public final Lazy<setAdUnitIds> onMessageChannelReady() {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Lazy) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, -2093486642, 2093486642);
    }

    public final Lazy<getBizCode> onMinimized() {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Lazy) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, 305981589, -305981569);
    }

    public final Lazy<r8lambdau761TBYkUBsjAjCwmNCBjUIxcpI> ICustomTabsCallbackStub() {
        int iOnExtraCallback = ComposableSingletons$SelectAccountScreenKt$.ExternalSyntheticLambda2.onExtraCallback();
        return (Lazy) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022886).substring(0, 9).length() + 192256487, new Object[]{this}, iOnExtraCallback, 1664181387, -1664181381);
    }

    public final Lazy<AsyncImagePainterExternalSyntheticLambda0> prefetch() {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Lazy) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, 757524558, -757524544);
    }

    public final Lazy<setTextProgressColor> validateRelationship() {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Lazy) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, 1734275450, -1734275428);
    }

    public final Lazy<SessionTrackerb> ICustomTabsService_Parcel() {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Lazy) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, 1871728842, -1871728816);
    }

    public final Lazy<addMetadata> onGreatestScrollPercentageIncreased() {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Lazy) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, -1733094178, 1733094212);
    }

    protected final deserializeUriNullableCollection onExtraCallbackWithResult(@NotNull Function0<Unit> function0) {
        int iOnExtraCallback = ComposableSingletons$SelectAccountScreenKt$.ExternalSyntheticLambda2.onExtraCallback();
        return (deserializeUriNullableCollection) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), ComposableSingletons$SelectAccountScreenKt$.ExternalSyntheticLambda2.onExtraCallback(), ComposableSingletons$SelectAccountScreenKt$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{this, function0}, iOnExtraCallback, -909596774, 909596791);
    }
}
