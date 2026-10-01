package im.toss.rn.toss.core;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactInstanceEventListener;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactPackage;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.onExtraCallback;
import com.facebook.react.runtime.ReactSurfaceView;
import com.google.android.gms.internal.ads.zzaq;
import com.google.android.gms.internal.ads.zzgc;
import com.google.android.gms.internal.ads.zziea;
import com.google.gson.JsonElement;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.deeplink.annotation.PrivateDeepLink;
import im.toss.deeplink.annotation.RootActivity;
import im.toss.observability.lcp.RnNavigationTypeProvider;
import im.toss.rn.granite.android.video.TossExoPlayerProvider;
import im.toss.rn.spec.base.ReactNativeContentOwner;
import im.toss.rn.spec.bundle.TossReactBundleMeta;
import im.toss.rn.toss.core.ReactNavBar;
import im.toss.rn.toss.core.ReactSchemeActivity;
import im.toss.rn.toss.core.ReactSchemeActivity$;
import im.toss.rn.toss.core.common.handler.ReactBackPressHandler;
import im.toss.rn.toss.core.common.process.RnProcessRuntime;
import im.toss.rn.toss.core.common.util.ReactHostUnexpectedDestroyDetector;
import im.toss.rn.toss.core.common.util.ReactHostVisibleStateObserver;
import im.toss.rn.toss.core.common.util.TossReactLifecycleEventEmitter;
import im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner;
import im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleLoaderV2;
import im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleRepository;
import im.toss.rn.toss.core.observability.ReactNativeRouteLcpSessionManager;
import im.toss.rn.toss.core.observability.ReactNativeScreenServiceHost;
import im.toss.rn.toss.core.observability.RnPhaseObserver;
import im.toss.rn.toss.core.observability.RnTrackableScreenNameKt;
import im.toss.rn.toss.core.util.RnAppVersion;
import im.toss.rn.toss.core.webview.TossAppServiceWebViewProvider;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$$ExternalSyntheticLambda3;
import im.toss.tds.view.R;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.TdsSkeletonV1View;
import im.toss.utils.RxUtils;
import im.toss.webview.TossWebView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraControllerExternalSyntheticLambda0;
import o.CertToolkitMgrRevokeReason;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConstraintsSizeResolverExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.DERSet;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.IPostMessageServiceStubProxy;
import o.ITrustedWebActivityCallbackStubProxy;
import o.IdGeneratorExternalSyntheticLambda1;
import o.JsonReaderUnknownNumberParsing;
import o.MaxAdViewImplb;
import o.MaxFullscreenAdImpl;
import o.MaxFullscreenAdImplExternalSyntheticLambda2;
import o.MaxFullscreenAdImplExternalSyntheticLambda6;
import o.MaxFullscreenAdImplExternalSyntheticLambda7;
import o.MaxFullscreenAdImplExternalSyntheticLambda9;
import o.MaxFullscreenAdImplb;
import o.MaxNativeAdLoaderImplb;
import o.RawQueries;
import o.RenderInTransitionOverlayNodeElement;
import o.RepeatableSpec;
import o.ResourceResolutionException;
import o.Response;
import o.Role;
import o.SearchBarKtExternalSyntheticLambda5;
import o.SessionTrackerb;
import o.SuspendAnimationKtExternalSyntheticLambda0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.UserChoiceBillingListener;
import o.WrappedCompositionsetContent1ExternalSyntheticLambda0;
import o.access13800;
import o.access8100;
import o.auth;
import o.calculateMaxTextSize;
import o.convertStacktracebugsnag_android_core_release;
import o.convertToPlayAuthPasskeyJsonRequest;
import o.createAdListenerWrapper;
import o.d0a;
import o.d1a;
import o.d1aa;
import o.decryptForPrivateKey;
import o.deserializeUriCollection;
import o.ebExternalSyntheticLambda0;
import o.extraCallbackWithResult;
import o.getAdValue;
import o.getBillingPeriod;
import o.getByteBuffer;
import o.getIconPaddingLeft;
import o.getJSON_KEY_CHALLENGEcredentials_play_services_auth_release;
import o.getSignForPKCS7AppCertAndVIDR;
import o.getSignForPKCS7NoContents;
import o.getStartTimeMillis;
import o.getWrite;
import o.hExternalSyntheticLambda15;
import o.hExternalSyntheticLambda4;
import o.isLoading;
import o.isValidCertNum;
import o.logicVerifyID;
import o.maybeUpdateAnimatable;
import o.mergeParams;
import o.nSetPosition;
import o.o5;
import o.onJsBridgeReady;
import o.onNativeAdLoaded;
import o.processTransparent;
import o.putChannelInfo;
import o.r8lambda1aZO4d0JI_OxlnkfFVIWwLUUFgo;
import o.r8lambda3VLBDMfcFBq3y6wAYf87R7p92xc;
import o.r8lambda4EHrnZ9SU_UFWvZy_trwQUIGDEE;
import o.r8lambdaCZNtgwoBwteGhg33zHpfNgJw0GI;
import o.r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos;
import o.r8lambdaFIcUTNe3dsoUoki0GlLmaYSc;
import o.r8lambdaHDAe14RP_YfkbgNStt68qt10Iow;
import o.r8lambdaHMNJeel4W_tBmaYEYabnCYaHtU;
import o.r8lambdaMJagQRgiktUHA9Hgao4BKiMwco;
import o.r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE;
import o.r8lambdaZ6S5ynORse1Hp60pzEkVw4aqyw4;
import o.r8lambdah5OEwEF3Xe9UqZ9SUNPyMkBEo1U;
import o.r8lambdamcqktAFDi57MiJ6JrSi643BXOs;
import o.r8lambdaypXGS8DWeWXzbqeVeqKYlXwASo;
import o.readFileToByteArray;
import o.removeUIManagerEventListener;
import o.resumeForClick;
import o.setCampaign;
import o.setMessageBytes;
import o.setPanelSlideListener;
import o.setRandomHost;
import o.setShadowDrawableRight;
import o.startApp;
import o.transExportCert;
import o.transFinalize;
import o.transGenerateCertNum;
import o.transImportCert;
import o.transV2ExportCert;
import o.zzad;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import run.granite.DefaultErrorView;
import run.granite.DefaultLoadingView;

@PrivateDeepLink
@RootActivity
/* loaded from: /tmp/toss_alldex/classes11.dex */
public class ReactSchemeActivity extends Hilt_ReactSchemeActivity implements RnNavigationTypeProvider, TossReactWebViewContentOwner, convertToPlayAuthPasskeyJsonRequest, WrappedCompositionsetContent1ExternalSyntheticLambda0, transFinalize, ReactNativeScreenServiceHost {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static int ICustomTabsServiceStub = 1;
    private static int prefetchWithMultipleUrls = 1;
    private static long requestPostMessageChannelWithExtras;
    private static int setEngagementSignalsCallback;
    private static int updateVisuals;
    private DefaultLifecycleObserver ICustomTabsCallbackDefault;
    private ReactInstanceEventListener ICustomTabsCallbackStub;
    private boolean ICustomTabsCallbackStubProxy;
    private hExternalSyntheticLambda15 access000;
    private ReactInstanceManager access100;
    private r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos asBinder;

    @Inject
    public r8lambdaHDAe14RP_YfkbgNStt68qt10Iow distributionGroupManager;

    @Inject
    public zzad environment;

    @Inject
    public zzad environments;
    private volatile boolean extraCallback;
    private ReactBundleLoaderV2 extraCommand;
    private r8lambdaZ6S5ynORse1Hp60pzEkVw4aqyw4 isEngagementSignalsApiAvailable;

    @Inject
    public getStartTimeMillis localeManager;
    private WeakReference<TossReactWebViewContentOwner> mayLaunchUrl;
    private MaxFullscreenAdImplExternalSyntheticLambda9 newAuthTabSession;
    private TossModule newSession;
    private ReactRootView newSessionWithExtras;
    private TossReactLifecycleEventEmitter onMinimized;
    private boolean onPostMessage;
    private ReactBackPressHandler onRelationshipValidationResult;
    private r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos onTransact;
    private String onUnminimized;
    private boolean prefetch;

    @Inject
    public ReactBundleLoaderV2.Factory reactBundleLoaderV2Factory;

    @Inject
    public calculateMaxTextSize reactMessageHandlerPoolSet;

    @Inject
    public ReactNativeRouteLcpSessionManager reactNativeRouteLcpSessions;
    private GraniteBrownfieldModule readTypedObject;
    private r8lambdaMJagQRgiktUHA9Hgao4BKiMwco receiveFile;

    @Inject
    public RnPhaseObserver rnPhaseObserver;

    @Inject
    public ebExternalSyntheticLambda0 tossReactDebug;

    @Inject
    public r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE tossReactMessageHandlerManager;

    @Inject
    public getBillingPeriod tossRegionManager;

    @Inject
    public ConstraintsSizeResolverExternalSyntheticLambda0 unique;
    private Integer writeTypedObject;
    private final Lazy asInterface = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new Function0<r8lambdah5OEwEF3Xe9UqZ9SUNPyMkBEo1U>() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$special$$inlined$viewBinding$1
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5IAuthTabCallback = IAuthTabCallback();
            int i4 = onWarmupCompleted + 119;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return searchBarKtExternalSyntheticLambda5IAuthTabCallback;
        }

        public final r8lambdah5OEwEF3Xe9UqZ9SUNPyMkBEo1U IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            LayoutInflater layoutInflater = this.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            r8lambdah5OEwEF3Xe9UqZ9SUNPyMkBEo1U r8lambdah5oewef3xe9uqz9sunpymkbeo1uOnWarmupCompleted = r8lambdah5OEwEF3Xe9UqZ9SUNPyMkBEo1U.onWarmupCompleted(layoutInflater);
            int i4 = onNavigationEvent + 39;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return r8lambdah5oewef3xe9uqz9sunpymkbeo1uOnWarmupCompleted;
            }
            throw null;
        }
    });
    private final Lazy ICustomTabsCallback_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda17
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ReactBundleRepository reactBundleRepositoryICustomTabsServiceDefault = ReactSchemeActivity.ICustomTabsServiceDefault();
            int i4 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 40 / 0;
            }
            return reactBundleRepositoryICustomTabsServiceDefault;
        }
    });
    private final ReactHostUnexpectedDestroyDetector ICustomTabsCallback = new ReactHostUnexpectedDestroyDetector(new Function0() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda18
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ReactSchemeActivity reactSchemeActivity = this.f$0;
            if (i3 == 0) {
                return ReactSchemeActivity.onExtraCallbackWithResult(reactSchemeActivity);
            }
            ReactSchemeActivity.onExtraCallbackWithResult(reactSchemeActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });
    private final Lazy ICustomTabsService = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda19
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            ReactHostVisibleStateObserver reactHostVisibleStateObserverOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                reactHostVisibleStateObserverOnNavigationEvent = ReactSchemeActivity.onNavigationEvent(this.f$0);
                int i3 = 9 / 0;
            } else {
                reactHostVisibleStateObserverOnNavigationEvent = ReactSchemeActivity.onNavigationEvent(this.f$0);
            }
            int i4 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 48 / 0;
            }
            return reactHostVisibleStateObserverOnNavigationEvent;
        }
    });
    private final long IAuthTabCallback_Parcel = SystemClock.uptimeMillis();
    private final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda20
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iOnNavigationEvent = zzaq.onNavigationEvent();
            int iOnNavigationEvent2 = zzaq.onNavigationEvent();
            deserializeUriCollection deserializeuricollection = (deserializeUriCollection) ReactSchemeActivity.IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), 1755775081, -1755775072, iOnNavigationEvent2, new Object[0], zzaq.onNavigationEvent());
            int i4 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 51 / 0;
            }
            return deserializeuricollection;
        }
    });
    private ArrayList<getJSON_KEY_CHALLENGEcredentials_play_services_auth_release> onActivityLayout = new ArrayList<>();
    private final Lazy onActivityResized = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda21
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final Object invoke() throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ReactSchemeActivity.IntentParams intentParamsOnWarmupCompleted = ReactSchemeActivity.onWarmupCompleted(this.f$0);
            int i4 = onNavigationEvent + 57;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return intentParamsOnWarmupCompleted;
        }
    });
    private final Lazy getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda22
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallback = ReactSchemeActivity.onExtraCallback(this.f$0);
            int i4 = onWarmupCompleted + 121;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return strOnExtraCallback;
        }
    });
    private final ResourceResolutionException onMessageChannelReady = new ResourceResolutionException();
    private final transExportCert extraCallbackWithResult = new transExportCert();
    private final List<WeakReference<startApp>> requestPostMessageChannel = new ArrayList();
    private final boolean IAuthTabCallbackStub = true;
    private final boolean IAuthTabCallbackStubProxy = true;
    private final String postMessage = "hard";

    public static final /* synthetic */ class WhenMappings {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[ReactNavBar.values().length];
            try {
                iArr[ReactNavBar.SOLID.ordinal()] = 1;
                int i = onNavigationEvent + 111;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            onWarmupCompleted = iArr;
            int i4 = IAuthTabCallback + 45;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static {
        IPostMessageServiceStubProxy();
        Companion = new Companion(null);
        int i = updateVisuals + 103;
        ICustomTabsServiceStub = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.content.Context, im.toss.rn.toss.core.ReactSchemeActivity] */
    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        int i7 = (~((~i4) | i3)) | (~(i4 | i));
        int i8 = ~i3;
        int i9 = (~(i8 | i)) | i4;
        int i10 = (~(i | i3)) | (~(i8 | (~i))) | i4;
        int i11 = i3 + i4 + i5 + ((-737137436) * i2) + ((-1840598144) * i6);
        int i12 = i11 * i11;
        int i13 = (((-699670985) * i3) - 818937856) + (24099949 * i4) + (723770934 * i7) + ((-1447541868) * i9) + ((-723770934) * i10) + ((-1423441920) * i5) + (1335885824 * i2) + ((-1946157056) * i6) + ((-1593638912) * i12);
        int i14 = (i3 * 1252406331) + 1981669868 + (i4 * 1252405337) + (i7 * (-994)) + (i9 * 1988) + (i10 * 994) + (i5 * 1252407325) + (i2 * (-1820396076)) + (i6 * 1320834432) + (i12 * (-447283200));
        switch (i13 + (i14 * i14 * 1511325696)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                ?? r7 = (ReactSchemeActivity) objArr[0];
                Bundle bundle = (Bundle) objArr[1];
                int i15 = 2 % 2;
                int i16 = prefetchWithMultipleUrls + 3;
                setEngagementSignalsCallback = i16 % 128;
                int i17 = i16 % 2;
                Object[] objArr2 = new Object[1];
                a(new char[]{25040, 15818, 12155, 24995, 49073, 59748, 11043, 28489, 27101, 47063}, TextUtils.indexOf((CharSequence) "", '0', 0) + 1, objArr2);
                bundle.putString(((String) objArr2[0]).intern(), r7.ITrustedWebActivityServiceDefault().IAuthTabCallbackStub());
                bundle.putString("appVersion", RnAppVersion.onExtraCallback.onWarmupCompleted(r7, r7.ICustomTabsService_Parcel()));
                int i18 = prefetchWithMultipleUrls + 97;
                setEngagementSignalsCallback = i18 % 128;
                int i19 = i18 % 2;
                return null;
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                int i20 = 2 % 2;
                r8lambda4EHrnZ9SU_UFWvZy_trwQUIGDEE r8lambda4ehrnz9su_ufwvzy_trwquigdee = new r8lambda4EHrnZ9SU_UFWvZy_trwQUIGDEE();
                int i21 = prefetchWithMultipleUrls + 109;
                setEngagementSignalsCallback = i21 % 128;
                int i22 = i21 % 2;
                return r8lambda4ehrnz9su_ufwvzy_trwquigdee;
            case 7:
                return asBinder(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                return asInterface(objArr);
            case 12:
                return access100(objArr);
            case 13:
                return IAuthTabCallbackStubProxy(objArr);
            case 14:
                ReactSchemeActivity reactSchemeActivity = (ReactSchemeActivity) objArr[0];
                int i23 = 2 % 2;
                int i24 = prefetchWithMultipleUrls;
                int i25 = i24 + 11;
                setEngagementSignalsCallback = i25 % 128;
                int i26 = i25 % 2;
                DefaultLifecycleObserver defaultLifecycleObserver = reactSchemeActivity.ICustomTabsCallbackDefault;
                int i27 = i24 + 51;
                setEngagementSignalsCallback = i27 % 128;
                int i28 = i27 % 2;
                return defaultLifecycleObserver;
            case 15:
                return access000(objArr);
            case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                return IAuthTabCallback_Parcel(objArr);
            case R.styleable.TdsListRowV1View_centerType /* 17 */:
                return getInterfaceDescriptor(objArr);
            case R.styleable.TdsListRowV1View_disabledType /* 18 */:
                return ICustomTabsCallback(objArr);
            case R.styleable.TdsListRowV1View_leftDate /* 19 */:
                return readTypedObject(objArr);
            case R.styleable.TdsListRowV1View_leftImage /* 20 */:
                return extraCallback(objArr);
            case R.styleable.TdsListRowV1View_leftImageColor /* 21 */:
                return extraCallbackWithResult(objArr);
            case R.styleable.TdsListRowV1View_leftImageHeight /* 22 */:
                return writeTypedObject(objArr);
            case R.styleable.TdsListRowV1View_leftImageType /* 23 */:
                return onActivityResized(objArr);
            case R.styleable.TdsListRowV1View_leftImageUrl /* 24 */:
                return onMessageChannelReady(objArr);
            case R.styleable.TdsListRowV1View_leftImageWidth /* 25 */:
                ReactSchemeActivity reactSchemeActivity2 = (ReactSchemeActivity) objArr[0];
                int i29 = 2 % 2;
                int i30 = prefetchWithMultipleUrls + 23;
                setEngagementSignalsCallback = i30 % 128;
                int i31 = i30 % 2;
                Unit unitOnActivityLayout = onActivityLayout(reactSchemeActivity2);
                int i32 = setEngagementSignalsCallback + 33;
                prefetchWithMultipleUrls = i32 % 128;
                int i33 = i32 % 2;
                return unitOnActivityLayout;
            case R.styleable.TdsListRowV1View_leftLottie /* 26 */:
                return onPostMessage(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 9;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(th);
        int i4 = setEngagementSignalsCallback + 123;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(ReactSchemeActivity reactSchemeActivity) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 9;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return ICustomTabsCallbackDefault(reactSchemeActivity);
        }
        ICustomTabsCallbackDefault(reactSchemeActivity);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(ReactSchemeActivity reactSchemeActivity, MaxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent onnavigationevent) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 113;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(reactSchemeActivity, onnavigationevent);
        int i4 = setEngagementSignalsCallback + 33;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(WeakReference weakReference, String str) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 3;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(weakReference, str);
        }
        onWarmupCompleted(weakReference, str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(ReactSchemeActivity reactSchemeActivity, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 29;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(reactSchemeActivity, th);
        if (i3 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        ReactSchemeActivity reactSchemeActivity = (ReactSchemeActivity) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 81;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(reactSchemeActivity, th);
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 73;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        deserializeUriCollection deserializeuricollectionITrustedWebActivityService = ITrustedWebActivityService();
        int i4 = setEngagementSignalsCallback + 15;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return deserializeuricollectionITrustedWebActivityService;
    }

    public static /* synthetic */ ReactBundleRepository ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 11;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        ReactBundleRepository reactBundleRepositoryAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        int i4 = prefetchWithMultipleUrls + 79;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return reactBundleRepositoryAudioAttributesImplApi26Parcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getSignForPKCS7NoContents ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 113;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        getSignForPKCS7NoContents getsignforpkcs7nocontentsMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        return getsignforpkcs7nocontentsMediaBrowserCompatMediaItem;
    }

    public static /* synthetic */ Unit asBinder(ReactSchemeActivity reactSchemeActivity) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 75;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), -550762446, 550762449, iOnNavigationEvent2, new Object[]{reactSchemeActivity}, zzaq.onNavigationEvent());
        int i4 = prefetchWithMultipleUrls + 121;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        String str = (String) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 77;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = zzaq.onNavigationEvent();
            int iOnNavigationEvent2 = zzaq.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        int iOnNavigationEvent4 = zzaq.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(iOnNavigationEvent3, zzaq.onNavigationEvent(), -1964098233, 1964098251, iOnNavigationEvent4, new Object[]{str, commonModule_setLeftEdgeTouchEnabled}, zzaq.onNavigationEvent());
        int i3 = setEngagementSignalsCallback + 15;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        ReactSchemeActivity reactSchemeActivity = (ReactSchemeActivity) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 45;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = zzaq.onNavigationEvent();
            int iOnNavigationEvent2 = zzaq.onNavigationEvent();
            return (Unit) IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), -1213235002, 1213235009, iOnNavigationEvent2, new Object[]{reactSchemeActivity, commonModule_setLeftEdgeTouchEnabled}, zzaq.onNavigationEvent());
        }
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        int iOnNavigationEvent4 = zzaq.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(iOnNavigationEvent3, zzaq.onNavigationEvent(), -1213235002, 1213235009, iOnNavigationEvent4, new Object[]{reactSchemeActivity, commonModule_setLeftEdgeTouchEnabled}, zzaq.onNavigationEvent());
        int i3 = 71 / 0;
        return unit;
    }

    public static /* synthetic */ String onExtraCallback(ReactSchemeActivity reactSchemeActivity) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 33;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onActivityResized(reactSchemeActivity);
        }
        onActivityResized(reactSchemeActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(ReactSchemeActivity reactSchemeActivity, ReactSurfaceView reactSurfaceView) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 57;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(reactSchemeActivity, reactSurfaceView);
        int i4 = setEngagementSignalsCallback + 71;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(ReactSchemeActivity reactSchemeActivity, getAdValue getadvalue) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 83;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(reactSchemeActivity, getadvalue);
        }
        IAuthTabCallback(reactSchemeActivity, getadvalue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(WeakReference weakReference, String str) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 95;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(weakReference, str);
        int i4 = prefetchWithMultipleUrls + 91;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ WindowInsetsCompat onExtraCallbackWithResult(ReactSchemeActivity reactSchemeActivity, View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 41;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        WindowInsetsCompat windowInsetsCompatOnNavigationEvent = onNavigationEvent(reactSchemeActivity, view, windowInsetsCompat);
        int i4 = prefetchWithMultipleUrls + 63;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return windowInsetsCompatOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ReactSchemeActivity reactSchemeActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 21;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnPostMessage = onPostMessage(reactSchemeActivity);
        int i4 = prefetchWithMultipleUrls + 83;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnPostMessage;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ReactSchemeActivity reactSchemeActivity, String str) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 117;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), -501488371, 501488390, iOnNavigationEvent2, new Object[]{reactSchemeActivity, str}, zzaq.onNavigationEvent());
        int i4 = prefetchWithMultipleUrls + 43;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ convertStacktracebugsnag_android_core_release onExtraCallbackWithResult(TossReactWebViewContentOwner tossReactWebViewContentOwner, TossWebView tossWebView) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 105;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        convertStacktracebugsnag_android_core_release convertstacktracebugsnag_android_core_releaseOnNavigationEvent = onNavigationEvent(tossReactWebViewContentOwner, tossWebView);
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        return convertstacktracebugsnag_android_core_releaseOnNavigationEvent;
    }

    public static /* synthetic */ ReactHostVisibleStateObserver onNavigationEvent(ReactSchemeActivity reactSchemeActivity) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 105;
        setEngagementSignalsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ICustomTabsCallbackStub(reactSchemeActivity);
            obj.hashCode();
            throw null;
        }
        ReactHostVisibleStateObserver reactHostVisibleStateObserverICustomTabsCallbackStub = ICustomTabsCallbackStub(reactSchemeActivity);
        int i3 = setEngagementSignalsCallback + 89;
        prefetchWithMultipleUrls = i3 % 128;
        if (i3 % 2 != 0) {
            return reactHostVisibleStateObserverICustomTabsCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ readFileToByteArray onNavigationEvent(Context context) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 91;
        setEngagementSignalsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(context);
            obj.hashCode();
            throw null;
        }
        readFileToByteArray readfiletobytearrayOnExtraCallbackWithResult = onExtraCallbackWithResult(context);
        int i3 = setEngagementSignalsCallback + 57;
        prefetchWithMultipleUrls = i3 % 128;
        if (i3 % 2 != 0) {
            return readfiletobytearrayOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(ReactSchemeActivity reactSchemeActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 121;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        IAuthTabCallback(reactSchemeActivity, dialogInterface);
        if (i3 == 0) {
            throw null;
        }
        int i4 = setEngagementSignalsCallback + 67;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onTransact(ReactSchemeActivity reactSchemeActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 41;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onUnminimized(reactSchemeActivity);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = prefetchWithMultipleUrls + 107;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ IntentParams onWarmupCompleted(ReactSchemeActivity reactSchemeActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 119;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        IntentParams intentParamsOnMinimized = onMinimized(reactSchemeActivity);
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        int i5 = prefetchWithMultipleUrls + 117;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return intentParamsOnMinimized;
    }

    public static /* synthetic */ Unit onWarmupCompleted(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 39;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(dialogInterface);
        int i4 = setEngagementSignalsCallback + 53;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ convertStacktracebugsnag_android_core_release onWarmupCompleted(TossReactWebViewContentOwner tossReactWebViewContentOwner, TossWebView tossWebView) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 71;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        convertStacktracebugsnag_android_core_release convertstacktracebugsnag_android_core_releaseIAuthTabCallback = IAuthTabCallback(tossReactWebViewContentOwner, tossWebView);
        int i4 = prefetchWithMultipleUrls + 23;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return convertstacktracebugsnag_android_core_releaseIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ transV2ExportCert validateRelationship() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 99;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        transV2ExportCert transv2exportcert = (transV2ExportCert) IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), -1287450706, 1287450712, iOnNavigationEvent2, new Object[0], zzaq.onNavigationEvent());
        int i4 = setEngagementSignalsCallback + 65;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return transv2exportcert;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        ReactSchemeActivity reactSchemeActivity = (ReactSchemeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 71;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnMessageChannelReady = onMessageChannelReady(reactSchemeActivity);
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        int i5 = setEngagementSignalsCallback + 91;
        prefetchWithMultipleUrls = i5 % 128;
        int i6 = i5 % 2;
        return unitOnMessageChannelReady;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 3;
        int i3 = i2 % 128;
        prefetchWithMultipleUrls = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 113;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(requestPostMessageChannelWithExtras ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 125;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 67;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(requestPostMessageChannelWithExtras)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 45812), View.MeasureSpec.getSize(0) + 84, 21233 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 14185), 19 - View.getDefaultSize(0, 0), 8808 - (ViewConfiguration.getFadingEdgeLength() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class IntentParams {
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallbackStubProxy = 0;
        private static int IAuthTabCallback_Parcel = 1;
        private static int getInterfaceDescriptor = 0;
        private static int writeTypedObject = 1;
        private final String IAuthTabCallback;
        private final String IAuthTabCallbackDefault;
        private final Date IAuthTabCallbackStub;
        private final TdsSkeletonV1View.IAuthTabCallback access000;
        private final String access100;
        private final String asBinder;
        private final ReactNavBar asInterface;
        private final String onExtraCallback;
        private final long onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final boolean onTransact;
        private final boolean onWarmupCompleted;

        static {
            int i = getInterfaceDescriptor + 25;
            IAuthTabCallback_Parcel = i % 128;
            int i2 = i % 2;
        }

        public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
            int i7 = ~i;
            int i8 = ~((~i6) | i7 | i4);
            int i9 = (~i4) | i7;
            int i10 = i8 | (~(i9 | i6)) | (~(i | i6 | i4));
            int i11 = ~i9;
            int i12 = (~(i4 | i)) | i6 | i11;
            int i13 = (~(i7 | i6)) | i11;
            int i14 = i + i6 + i3 + (933655473 * i5) + ((-1037598838) * i2);
            int i15 = i14 * i14;
            int i16 = (((-1556109539) * i) - 925892608) + (470833381 * i6) + (i10 * (-1134012188)) + (1134012188 * i12) + ((-1134012188) * i13) + (1604845568 * i3) + ((-1691877376) * i5) + ((-393216000) * i2) + ((-1633878016) * i15);
            int i17 = ((i * (-727610197)) - 1081761860) + (i6 * (-727608285)) + (i10 * 956) + (i12 * (-956)) + (i13 * 956) + (i3 * (-727609241)) + (i5 * 1532828727) + (i2 * (-747900794)) + (i15 * 556466176);
            if (i16 + (i17 * i17 * (-1911357440)) != 1) {
                return onExtraCallback(objArr);
            }
            IntentParams intentParams = (IntentParams) objArr[0];
            int i18 = 2 % 2;
            int i19 = writeTypedObject;
            int i20 = i19 + 91;
            IAuthTabCallbackStubProxy = i20 % 128;
            int i21 = i20 % 2;
            TdsSkeletonV1View.IAuthTabCallback iAuthTabCallback = intentParams.access000;
            int i22 = i19 + 83;
            IAuthTabCallbackStubProxy = i22 % 128;
            int i23 = i22 % 2;
            return iAuthTabCallback;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IntentParams)) {
                int i2 = writeTypedObject + 89;
                IAuthTabCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            IntentParams intentParams = (IntentParams) obj;
            if ((!Intrinsics.areEqual(this.IAuthTabCallback, intentParams.IAuthTabCallback)) || this.onWarmupCompleted != intentParams.onWarmupCompleted || !Intrinsics.areEqual(this.onNavigationEvent, intentParams.onNavigationEvent) || (!Intrinsics.areEqual(this.asBinder, intentParams.asBinder))) {
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, intentParams.IAuthTabCallbackStub)) {
                int i4 = writeTypedObject + 35;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, intentParams.IAuthTabCallbackDefault)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallback, intentParams.onExtraCallback)) {
                int i6 = writeTypedObject + 47;
                IAuthTabCallbackStubProxy = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (this.onExtraCallbackWithResult != intentParams.onExtraCallbackWithResult) {
                int i8 = writeTypedObject + 35;
                IAuthTabCallbackStubProxy = i8 % 128;
                return i8 % 2 != 0;
            }
            if (this.asInterface != intentParams.asInterface) {
                return false;
            }
            if (!Intrinsics.areEqual(this.access100, intentParams.access100)) {
                int i9 = IAuthTabCallbackStubProxy + 1;
                writeTypedObject = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.access000, intentParams.access000)) {
                return this.onTransact == intentParams.onTransact;
            }
            int i11 = writeTypedObject + 41;
            IAuthTabCallbackStubProxy = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = writeTypedObject + 9;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.IAuthTabCallback.hashCode();
            int iHashCode3 = Boolean.hashCode(this.onWarmupCompleted);
            int iHashCode4 = this.onNavigationEvent.hashCode();
            int iHashCode5 = this.asBinder.hashCode();
            Date date = this.IAuthTabCallbackStub;
            int iHashCode6 = 0;
            if (date == null) {
                int i4 = IAuthTabCallbackStubProxy + 19;
                writeTypedObject = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = date.hashCode();
            }
            int iHashCode7 = this.IAuthTabCallbackDefault.hashCode();
            String str = this.onExtraCallback;
            if (str != null) {
                int i6 = writeTypedObject + 5;
                IAuthTabCallbackStubProxy = i6 % 128;
                int i7 = i6 % 2;
                iHashCode6 = str.hashCode();
            }
            return (((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode7) * 31) + iHashCode6) * 31) + Long.hashCode(this.onExtraCallbackWithResult)) * 31) + this.asInterface.hashCode()) * 31) + this.access100.hashCode()) * 31) + this.access000.hashCode()) * 31) + Boolean.hashCode(this.onTransact);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "IntentParams(bundlePath=" + this.IAuthTabCallback + ", isBetaWebViewDebuggable=" + this.onWarmupCompleted + ", company=" + this.onNavigationEvent + ", sharedModuleName=" + this.asBinder + ", minDeployedDate=" + this.IAuthTabCallbackStub + ", originScheme=" + this.IAuthTabCallbackDefault + ", distributionGroup=" + this.onExtraCallback + ", maxAge=" + this.onExtraCallbackWithResult + ", navBar=" + this.asInterface + ", theme=" + this.access100 + ", skeletonType=" + this.access000 + ", shouldZeroSafeAreaInsets=" + this.onTransact + ")";
            int i2 = IAuthTabCallbackStubProxy + 19;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int $10 = 0;
            private static int $11 = 1;
            private static char IAuthTabCallback = 4067;
            private static int asBinder = 1;
            private static char onExtraCallback = 23897;
            private static char onExtraCallbackWithResult = 20644;
            private static char onNavigationEvent = 29244;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
                char[] cArr2 = new char[cArr.length];
                int i3 = 0;
                defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
                char[] cArr3 = new char[2];
                while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                    cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                    int i4 = 58224;
                    int i5 = i3;
                    while (i5 < 16) {
                        char c = cArr3[1];
                        char c2 = cArr3[i3];
                        int i6 = (c2 + i4) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                        int i7 = c2 >>> 5;
                        try {
                            Object[] objArr2 = new Object[4];
                            objArr2[3] = Integer.valueOf(onNavigationEvent);
                            objArr2[2] = Integer.valueOf(i7);
                            objArr2[1] = Integer.valueOf(i6);
                            objArr2[i3] = Integer.valueOf(c);
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                            if (objOnExtraCallback == null) {
                                char cMyPid = (char) (Process.myPid() >> 22);
                                int iMyTid = (Process.myTid() >> 22) + 10;
                                int threadPriority = ((Process.getThreadPriority(i3) + 20) >> 6) + 12434;
                                Class[] clsArr = new Class[4];
                                clsArr[i3] = Integer.TYPE;
                                clsArr[1] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMyPid, iMyTid, threadPriority, -787580090, false, "C", clsArr);
                            }
                            char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            char[] cArr4 = cArr3;
                            Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), View.MeasureSpec.makeMeasureSpec(0, 0) + 10, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            i4 -= 40503;
                            i5++;
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
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16014), Color.argb(0, 0, 0, 0) + 14, 19900 - TextUtils.indexOf((CharSequence) "", '0'), -1250968944, false, "B", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i8 = $11 + 123;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr3 = cArr5;
                    i3 = 0;
                }
                String str = new String(cArr2, 0, i);
                int i10 = $11 + 93;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                objArr[0] = str;
            }

            private Companion() {
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002d A[PHI: r2
              0x002d: PHI (r2v50 java.lang.String) = (r2v4 java.lang.String), (r2v51 java.lang.String) binds: [B:8:0x0029, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00ed  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final IntentParams onExtraCallback(@NotNull Intent intent) throws Throwable {
                String stringExtra;
                String str;
                String str2;
                boolean zBooleanValue;
                long savedStateRegistryControllerannotations;
                Boolean booleanStrictOrNull;
                Long longOrNull;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 95;
                asBinder = i2 % 128;
                String str3 = "";
                boolean zBooleanValue2 = false;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(intent, "");
                    stringExtra = intent.getStringExtra("bundlePath");
                    int i3 = 28 / 0;
                    str = stringExtra == null ? "" : stringExtra;
                } else {
                    Intrinsics.checkNotNullParameter(intent, "");
                    stringExtra = intent.getStringExtra("bundlePath");
                    if (stringExtra == null) {
                    }
                }
                boolean booleanExtra = intent.getBooleanExtra("isBetaWebViewDebuggable", false);
                String stringExtra2 = intent.getStringExtra("_company");
                if (stringExtra2 == null) {
                    Object[] objArr = new Object[1];
                    a(new char[]{56286, 61405, 34006, 20799}, 4 - KeyEvent.normalizeMetaState(0), objArr);
                    stringExtra2 = ((String) objArr[0]).intern();
                }
                String str4 = stringExtra2;
                String stringExtra3 = intent.getStringExtra("sharedModuleName");
                if (stringExtra3 == null) {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{15650, 39143, 59061, 33797, 23612, 17570}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 6, objArr2);
                    stringExtra3 = ((String) objArr2[0]).intern();
                }
                String str5 = stringExtra3;
                String stringExtra4 = intent.getStringExtra("_minDeployedAt");
                if (stringExtra4 == null) {
                    int i4 = onWarmupCompleted + 103;
                    asBinder = i4 % 128;
                    int i5 = i4 % 2;
                    stringExtra4 = "00000000000000";
                }
                Locale locale = Locale.US;
                Intrinsics.checkNotNullExpressionValue(locale, "");
                Object[] objArr3 = new Object[1];
                a(new char[]{57762, 16569, 57762, 16569, 60419, 8032, 34587, 64844, 51781, 27308, 46243, 20138, 40872, 25616}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 13, objArr3);
                Date dateOnWarmupCompleted = setCampaign.onWarmupCompleted(new IdGeneratorExternalSyntheticLambda1(((String) objArr3[0]).intern(), locale), stringExtra4);
                String stringExtra5 = intent.getStringExtra("__originScheme");
                if (stringExtra5 == null) {
                    int i6 = asBinder + 71;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    str2 = "";
                } else {
                    str2 = stringExtra5;
                }
                String stringExtra6 = intent.getStringExtra("_distributionGroup");
                String stringExtra7 = intent.getStringExtra("_remote");
                if (stringExtra7 != null) {
                    int i8 = asBinder + 53;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    Boolean booleanStrictOrNull2 = StringsKt.toBooleanStrictOrNull(stringExtra7);
                    zBooleanValue = booleanStrictOrNull2 != null ? booleanStrictOrNull2.booleanValue() : false;
                }
                String stringExtra8 = intent.getStringExtra("_maxAge");
                if (stringExtra8 != null && (longOrNull = StringsKt.toLongOrNull(stringExtra8)) != null) {
                    savedStateRegistryControllerannotations = longOrNull.longValue();
                } else if (zBooleanValue) {
                    int i10 = onWarmupCompleted + 101;
                    asBinder = i10 % 128;
                    int i11 = i10 % 2;
                    savedStateRegistryControllerannotations = 0;
                } else {
                    savedStateRegistryControllerannotations = DERSet.onExtraCallback.getSavedStateRegistryControllerannotations();
                }
                long j = savedStateRegistryControllerannotations;
                ReactNavBar.Companion companion = ReactNavBar.Companion;
                String stringExtra9 = intent.getStringExtra("_navBar");
                if (stringExtra9 != null) {
                    int i12 = onWarmupCompleted + 33;
                    asBinder = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 54 / 0;
                    }
                    str3 = stringExtra9;
                }
                ReactNavBar reactNavBarOnNavigationEvent = companion.onNavigationEvent(str3);
                String stringExtra10 = intent.getStringExtra("_theme");
                if (stringExtra10 == null) {
                    stringExtra10 = "adaptive";
                }
                String str6 = stringExtra10;
                TdsSkeletonV1View.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = o5.onNavigationEvent(intent.getStringExtra("_skeletonType"));
                String stringExtra11 = intent.getStringExtra("_zeroSafeAreaInsets");
                if (stringExtra11 != null && (booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(stringExtra11)) != null) {
                    zBooleanValue2 = booleanStrictOrNull.booleanValue();
                }
                return new IntentParams(str, booleanExtra, str4, str5, dateOnWarmupCompleted, str2, stringExtra6, j, reactNavBarOnNavigationEvent, str6, iAuthTabCallbackOnNavigationEvent, zBooleanValue2);
            }
        }

        public IntentParams(@NotNull String str, boolean z, @NotNull String str2, @NotNull String str3, @Nullable Date date, @NotNull String str4, @Nullable String str5, long j, @NotNull ReactNavBar reactNavBar, @NotNull String str6, @NotNull TdsSkeletonV1View.IAuthTabCallback iAuthTabCallback, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(reactNavBar, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            this.IAuthTabCallback = str;
            this.onWarmupCompleted = z;
            this.onNavigationEvent = str2;
            this.asBinder = str3;
            this.IAuthTabCallbackStub = date;
            this.IAuthTabCallbackDefault = str4;
            this.onExtraCallback = str5;
            this.onExtraCallbackWithResult = j;
            this.asInterface = reactNavBar;
            this.access100 = str6;
            this.access000 = iAuthTabCallback;
            this.onTransact = z2;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            IntentParams intentParams = (IntentParams) objArr[0];
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 9;
            int i3 = i2 % 128;
            writeTypedObject = i3;
            int i4 = i2 % 2;
            Object obj = null;
            String str = intentParams.IAuthTabCallback;
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 97;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        public final boolean IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = writeTypedObject;
            int i3 = i2 + 11;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.onWarmupCompleted;
            int i5 = i2 + 79;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 97;
            int i3 = i2 % 128;
            writeTypedObject = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.onNavigationEvent;
            int i4 = i3 + 55;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String onTransact() {
            int i = 2 % 2;
            int i2 = writeTypedObject;
            int i3 = i2 + 91;
            IAuthTabCallbackStubProxy = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.asBinder;
            int i4 = i2 + 105;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        public final Date onExtraCallback() {
            int i = 2 % 2;
            int i2 = writeTypedObject;
            int i3 = i2 + 109;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            Date date = this.IAuthTabCallbackStub;
            int i5 = i2 + 39;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                return date;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = writeTypedObject;
            int i3 = i2 + 31;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallbackDefault;
            int i5 = i2 + 53;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 39;
            writeTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final long IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 61;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            long j = this.onExtraCallbackWithResult;
            int i5 = i2 + 57;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            return j;
        }

        public final ReactNavBar asBinder() {
            int i = 2 % 2;
            int i2 = writeTypedObject;
            int i3 = i2 + 25;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            ReactNavBar reactNavBar = this.asInterface;
            int i5 = i2 + 81;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                return reactNavBar;
            }
            throw null;
        }

        public final String getInterfaceDescriptor() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 45;
            writeTypedObject = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            String str = this.access100;
            int i4 = i2 + 55;
            writeTypedObject = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        public final boolean IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = writeTypedObject + 3;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            int i4 = i2 % 2;
            boolean z = this.onTransact;
            int i5 = i3 + 15;
            writeTypedObject = i5 % 128;
            if (i5 % 2 != 0) {
                return z;
            }
            throw null;
        }

        public final String onExtraCallbackWithResult() {
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            int iIAuthTabCallback2 = zziea.IAuthTabCallback();
            int iIAuthTabCallback3 = zziea.IAuthTabCallback();
            return (String) IAuthTabCallback(-1609524478, zziea.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this}, iIAuthTabCallback, iIAuthTabCallback3, 1609524478);
        }

        public final TdsSkeletonV1View.IAuthTabCallback asInterface() {
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            int iIAuthTabCallback2 = zziea.IAuthTabCallback();
            int iIAuthTabCallback3 = zziea.IAuthTabCallback();
            return (TdsSkeletonV1View.IAuthTabCallback) IAuthTabCallback(1655834121, zziea.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this}, iIAuthTabCallback, iIAuthTabCallback3, -1655834120);
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(ReactSchemeActivity reactSchemeActivity, DefaultLifecycleObserver defaultLifecycleObserver) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 105;
        int i3 = i2 % 128;
        setEngagementSignalsCallback = i3;
        int i4 = i2 % 2;
        reactSchemeActivity.ICustomTabsCallbackDefault = defaultLifecycleObserver;
        int i5 = i3 + 69;
        prefetchWithMultipleUrls = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ r8lambdah5OEwEF3Xe9UqZ9SUNPyMkBEo1U IAuthTabCallbackDefault(ReactSchemeActivity reactSchemeActivity) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 31;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambdah5OEwEF3Xe9UqZ9SUNPyMkBEo1U r8lambdah5oewef3xe9uqz9sunpymkbeo1uAreNotificationsEnabled = reactSchemeActivity.areNotificationsEnabled();
        int i4 = setEngagementSignalsCallback + 69;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            return r8lambdah5oewef3xe9uqz9sunpymkbeo1uAreNotificationsEnabled;
        }
        throw null;
    }

    public static final /* synthetic */ String IAuthTabCallbackStubProxy(ReactSchemeActivity reactSchemeActivity) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 113;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        String smallIconBitmap = reactSchemeActivity.getSmallIconBitmap();
        int i4 = prefetchWithMultipleUrls + 55;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return smallIconBitmap;
    }

    public static final /* synthetic */ Function1 ICustomTabsCallback(ReactSchemeActivity reactSchemeActivity) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 7;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Function1<String, Unit> function1ResultReceiverMyResultReceiver = reactSchemeActivity.ResultReceiverMyResultReceiver();
        int i4 = prefetchWithMultipleUrls + 109;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return function1ResultReceiverMyResultReceiver;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        ReactSchemeActivity reactSchemeActivity = (ReactSchemeActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls;
        int i3 = i2 + 119;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        reactSchemeActivity.ICustomTabsCallbackStubProxy = zBooleanValue;
        int i5 = i2 + 13;
        setEngagementSignalsCallback = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ hExternalSyntheticLambda15 access000(ReactSchemeActivity reactSchemeActivity) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 75;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        hExternalSyntheticLambda15 hexternalsyntheticlambda15 = reactSchemeActivity.access000;
        int i5 = i2 + 17;
        prefetchWithMultipleUrls = i5 % 128;
        if (i5 % 2 != 0) {
            return hexternalsyntheticlambda15;
        }
        throw null;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        ReactSchemeActivity reactSchemeActivity = (ReactSchemeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 37;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        IntentParams intentParamsITrustedWebActivityServiceDefault = reactSchemeActivity.ITrustedWebActivityServiceDefault();
        int i4 = setEngagementSignalsCallback + 29;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        return intentParamsITrustedWebActivityServiceDefault;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) throws Throwable {
        ReactSchemeActivity reactSchemeActivity = (ReactSchemeActivity) objArr[0];
        hExternalSyntheticLambda15 hexternalsyntheticlambda15 = (hExternalSyntheticLambda15) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 119;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        reactSchemeActivity.IAuthTabCallback(hexternalsyntheticlambda15, zBooleanValue);
        int i4 = prefetchWithMultipleUrls + 89;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ r8lambdaZ6S5ynORse1Hp60pzEkVw4aqyw4 getInterfaceDescriptor(ReactSchemeActivity reactSchemeActivity) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 101;
        int i3 = i2 % 128;
        prefetchWithMultipleUrls = i3;
        int i4 = i2 % 2;
        r8lambdaZ6S5ynORse1Hp60pzEkVw4aqyw4 r8lambdaz6s5ynorse1hp60pzekvw4aqyw4 = reactSchemeActivity.isEngagementSignalsApiAvailable;
        int i5 = i3 + 115;
        setEngagementSignalsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 64 / 0;
        }
        return r8lambdaz6s5ynorse1hp60pzekvw4aqyw4;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(ReactSchemeActivity reactSchemeActivity, hExternalSyntheticLambda15 hexternalsyntheticlambda15) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 21;
        int i3 = i2 % 128;
        prefetchWithMultipleUrls = i3;
        int i4 = i2 % 2;
        reactSchemeActivity.access000 = hexternalsyntheticlambda15;
        int i5 = i3 + 121;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        ReactSchemeActivity reactSchemeActivity = (ReactSchemeActivity) objArr[0];
        ReactBundleLoaderV2 reactBundleLoaderV2 = (ReactBundleLoaderV2) objArr[1];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 95;
        int i3 = i2 % 128;
        setEngagementSignalsCallback = i3;
        int i4 = i2 % 2;
        reactSchemeActivity.extraCommand = reactBundleLoaderV2;
        int i5 = i3 + 63;
        prefetchWithMultipleUrls = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ReactSchemeActivity reactSchemeActivity = (ReactSchemeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 69;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        reactSchemeActivity.ResultReceiverMyRunnable();
        if (i3 == 0) {
            throw null;
        }
        int i4 = prefetchWithMultipleUrls + 71;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ void onNavigationEvent(ReactSchemeActivity reactSchemeActivity, ReactContext reactContext) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 125;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = zzaq.onNavigationEvent();
            int iOnNavigationEvent2 = zzaq.onNavigationEvent();
            IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), 224124945, -224124937, iOnNavigationEvent2, new Object[]{reactSchemeActivity, reactContext}, zzaq.onNavigationEvent());
            return;
        }
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        int iOnNavigationEvent4 = zzaq.onNavigationEvent();
        IAuthTabCallback(iOnNavigationEvent3, zzaq.onNavigationEvent(), 224124945, -224124937, iOnNavigationEvent4, new Object[]{reactSchemeActivity, reactContext}, zzaq.onNavigationEvent());
        int i3 = 5 / 0;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        ReactSchemeActivity reactSchemeActivity = (ReactSchemeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 59;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Function1<String, Unit> function1ComponentActivity = reactSchemeActivity.ComponentActivity();
        int i4 = prefetchWithMultipleUrls + 13;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return function1ComponentActivity;
    }

    public static final /* synthetic */ void onWarmupCompleted(ReactSchemeActivity reactSchemeActivity, ReactInstanceEventListener reactInstanceEventListener) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 73;
        int i3 = i2 % 128;
        setEngagementSignalsCallback = i3;
        int i4 = i2 % 2;
        reactSchemeActivity.ICustomTabsCallbackStub = reactInstanceEventListener;
        int i5 = i3 + 105;
        prefetchWithMultipleUrls = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void readTypedObject(ReactSchemeActivity reactSchemeActivity) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 77;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        reactSchemeActivity.ResultReceiver1();
        int i4 = setEngagementSignalsCallback + 85;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
    }

    public static final /* synthetic */ ReactBundleLoaderV2 writeTypedObject(ReactSchemeActivity reactSchemeActivity) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls;
        int i3 = i2 + 31;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        ReactBundleLoaderV2 reactBundleLoaderV2 = reactSchemeActivity.extraCommand;
        int i5 = i2 + 29;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return reactBundleLoaderV2;
    }

    @Override // im.toss.rn.toss.core.common.wrapper.TossReactContentOwner
    public /* bridge */ void IAuthTabCallback(@NotNull String str, @NotNull JsonElement jsonElement) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 99;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.IAuthTabCallback(str, jsonElement);
        int i4 = setEngagementSignalsCallback + 57;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ boolean closeWebView(@Nullable String str, boolean z) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 15;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 != 0) {
            return super.closeWebView(str, z);
        }
        super.closeWebView(str, z);
        throw null;
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public /* bridge */ ViewGroup getCaWebViewContainer() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 39;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        ViewGroup caWebViewContainer = super.getCaWebViewContainer();
        int i4 = prefetchWithMultipleUrls + 91;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return caWebViewContainer;
    }

    public /* bridge */ Boolean getShouldWebViewPauseOnInvisible() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 25;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Boolean shouldWebViewPauseOnInvisible = super.getShouldWebViewPauseOnInvisible();
        int i4 = setEngagementSignalsCallback + 79;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return shouldWebViewPauseOnInvisible;
    }

    public /* bridge */ Intent getSourceIntent() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 107;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Intent sourceIntent = super.getSourceIntent();
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        return sourceIntent;
    }

    public /* bridge */ String getSwipeRefreshCallback() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 67;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        String swipeRefreshCallback = super.getSwipeRefreshCallback();
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        return swipeRefreshCallback;
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public /* bridge */ TossCoreWebView getWebView() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 95;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            super.getWebView();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TossCoreWebView webView = super.getWebView();
        int i3 = prefetchWithMultipleUrls + 45;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        return webView;
    }

    public /* bridge */ boolean handleCaWebViewBackPress(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 25;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        boolean zHandleCaWebViewBackPress = super/*o.startApp*/.handleCaWebViewBackPress(function0);
        int i4 = setEngagementSignalsCallback + 89;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return zHandleCaWebViewBackPress;
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public /* bridge */ boolean isSwipeRefreshEnabled() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 115;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsSwipeRefreshEnabled = super.isSwipeRefreshEnabled();
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        return zIsSwipeRefreshEnabled;
    }

    public /* bridge */ void onExtraCallback(@NotNull AppCompatActivity appCompatActivity) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 23;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        super.onExtraCallback(appCompatActivity);
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        int i5 = prefetchWithMultipleUrls + 3;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ void onExtraCallbackWithResult(@NotNull AppCompatActivity appCompatActivity) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 79;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onExtraCallbackWithResult(appCompatActivity);
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public /* bridge */ void onHistoryCleared() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 111;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        super.onHistoryCleared();
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ void onNavigationEvent(@NotNull AppCompatActivity appCompatActivity) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 89;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        super.onNavigationEvent(appCompatActivity);
        int i4 = setEngagementSignalsCallback + 13;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public /* bridge */ void onPageReady() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 47;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        super.onPageReady();
        int i4 = prefetchWithMultipleUrls + 95;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* synthetic */ transGenerateCertNum onPostMessage() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 35;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        transExportCert transexportcertOnVerticalScrollEvent = onVerticalScrollEvent();
        int i4 = setEngagementSignalsCallback + 21;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            return transexportcertOnVerticalScrollEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onSwipeToRefresh(@Nullable SwipeRefreshLayout swipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 5;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.startApp*/.onSwipeToRefresh(swipeRefreshLayout);
        int i4 = setEngagementSignalsCallback + 19;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public /* bridge */ void onUpdateWebHistoryState() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 109;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        super.onUpdateWebHistoryState();
        int i4 = prefetchWithMultipleUrls + 49;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull AppCompatActivity appCompatActivity, @Nullable Bundle bundle, @NotNull Bundle bundle2) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 89;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onWarmupCompleted(appCompatActivity, bundle, bundle2);
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        int i5 = prefetchWithMultipleUrls + 83;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ ReactHost prefetch() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 1;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        ReactHost reactHostPrefetch = super.prefetch();
        int i4 = prefetchWithMultipleUrls + 123;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return reactHostPrefetch;
        }
        throw null;
    }

    public /* bridge */ logicVerifyID readTypedObject() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 5;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        logicVerifyID typedObject = super.readTypedObject();
        int i4 = setEngagementSignalsCallback + 55;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return typedObject;
    }

    public /* bridge */ void setFullScreenEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 63;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        super.setFullScreenEnabled(z);
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
    }

    public /* bridge */ void setShouldWebViewPauseOnInvisible(@Nullable Boolean bool) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 61;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.setShouldWebViewPauseOnInvisible(bool);
        int i4 = setEngagementSignalsCallback + 11;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setSwipeRefreshCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 109;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        super.setSwipeRefreshCallback(str);
        int i4 = setEngagementSignalsCallback + 111;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public /* bridge */ void setSwipeRefreshEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 85;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.setSwipeRefreshEnabled(z);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.rn.toss.core.observability.ReactNativeScreenServiceHost
    public /* bridge */ boolean updateVisuals() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 61;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zUpdateVisuals = super.updateVisuals();
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        return zUpdateVisuals;
    }

    private final r8lambdah5OEwEF3Xe9UqZ9SUNPyMkBEo1U areNotificationsEnabled() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 21;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        r8lambdah5OEwEF3Xe9UqZ9SUNPyMkBEo1U r8lambdah5oewef3xe9uqz9sunpymkbeo1u = (r8lambdah5OEwEF3Xe9UqZ9SUNPyMkBEo1U) this.asInterface.getValue();
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        return r8lambdah5oewef3xe9uqz9sunpymkbeo1u;
    }

    @Override // im.toss.rn.toss.core.common.wrapper.TossReactContentOwner
    public TossModule IPostMessageServiceStub() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls;
        int i3 = i2 + 35;
        int i4 = i3 % 128;
        setEngagementSignalsCallback = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        TossModule tossModule = this.newSession;
        if (tossModule == null) {
            int i5 = i4 + 115;
            prefetchWithMultipleUrls = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        if (tossModule != null) {
            return tossModule;
        }
        int i7 = i2 + 99;
        setEngagementSignalsCallback = i7 % 128;
        int i8 = i7 % 2;
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final zzad writeTypedList() {
        int i = 2 % 2;
        zzad zzadVar = this.environment;
        if (zzadVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = setEngagementSignalsCallback + 17;
        int i3 = i2 % 128;
        prefetchWithMultipleUrls = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 31;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return zzadVar;
    }

    public final r8lambdaHDAe14RP_YfkbgNStt68qt10Iow ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 95;
        prefetchWithMultipleUrls = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        r8lambdaHDAe14RP_YfkbgNStt68qt10Iow r8lambdahdae14rp_yfkbgnstt68qt10iow = this.distributionGroupManager;
        if (r8lambdahdae14rp_yfkbgnstt68qt10iow != null) {
            return r8lambdahdae14rp_yfkbgnstt68qt10iow;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = prefetchWithMultipleUrls + 23;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE IPostMessageServiceDefault() {
        int i = 2 % 2;
        r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE r8lambdausr520ceu4yijcrtwho1uywjge = this.tossReactMessageHandlerManager;
        if (r8lambdausr520ceu4yijcrtwho1uywjge != null) {
            int i2 = setEngagementSignalsCallback + 51;
            prefetchWithMultipleUrls = i2 % 128;
            int i3 = i2 % 2;
            return r8lambdausr520ceu4yijcrtwho1uywjge;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = setEngagementSignalsCallback + 3;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return null;
    }

    private static final ReactBundleRepository AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 11;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        ReactBundleRepository reactBundleRepositoryComponentActivityExternalSyntheticLambda1 = ((ReactBundleRepository.EntryPoint) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), ReactBundleRepository.EntryPoint.class)).ComponentActivityExternalSyntheticLambda1();
        int i4 = setEngagementSignalsCallback + 29;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return reactBundleRepositoryComponentActivityExternalSyntheticLambda1;
    }

    private static final Unit onPostMessage(ReactSchemeActivity reactSchemeActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 117;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        reactSchemeActivity.RemoteActionCompatParcelizer();
        Unit unit = Unit.INSTANCE;
        int i4 = setEngagementSignalsCallback + 15;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final ReactBundleLoaderV2.Factory onSessionEnded() {
        int i = 2 % 2;
        ReactBundleLoaderV2.Factory factory = this.reactBundleLoaderV2Factory;
        if (factory == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 33;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 27;
        prefetchWithMultipleUrls = i5 % 128;
        int i6 = i5 % 2;
        return factory;
    }

    public final calculateMaxTextSize IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 9;
        int i3 = i2 % 128;
        setEngagementSignalsCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        calculateMaxTextSize calculatemaxtextsize = this.reactMessageHandlerPoolSet;
        if (calculatemaxtextsize == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 49;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return calculatemaxtextsize;
    }

    public final getBillingPeriod ITrustedWebActivityCallbackStub() {
        int i = 2 % 2;
        getBillingPeriod getbillingperiod = this.tossRegionManager;
        if (getbillingperiod == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 5;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 93;
        prefetchWithMultipleUrls = i5 % 128;
        if (i5 % 2 != 0) {
            return getbillingperiod;
        }
        throw null;
    }

    public final RnPhaseObserver IPostMessageService() {
        int i = 2 % 2;
        RnPhaseObserver rnPhaseObserver = this.rnPhaseObserver;
        if (rnPhaseObserver != null) {
            int i2 = prefetchWithMultipleUrls + 83;
            setEngagementSignalsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return rnPhaseObserver;
            }
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = setEngagementSignalsCallback + 23;
        prefetchWithMultipleUrls = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final getStartTimeMillis onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 87;
        int i3 = i2 % 128;
        prefetchWithMultipleUrls = i3;
        int i4 = i2 % 2;
        getStartTimeMillis getstarttimemillis = this.localeManager;
        if (getstarttimemillis == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 17;
        int i6 = i5 % 128;
        setEngagementSignalsCallback = i6;
        if (i5 % 2 != 0) {
            int i7 = 71 / 0;
        }
        int i8 = i6 + 81;
        prefetchWithMultipleUrls = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 64 / 0;
        }
        return getstarttimemillis;
    }

    public final zzad ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 101;
        prefetchWithMultipleUrls = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        zzad zzadVar = this.environments;
        if (zzadVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 1;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return zzadVar;
    }

    public final ConstraintsSizeResolverExternalSyntheticLambda0 ITrustedWebActivityCallback() {
        int i = 2 % 2;
        ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0 = this.unique;
        if (constraintsSizeResolverExternalSyntheticLambda0 != null) {
            int i2 = prefetchWithMultipleUrls + 59;
            setEngagementSignalsCallback = i2 % 128;
            int i3 = i2 % 2;
            return constraintsSizeResolverExternalSyntheticLambda0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = setEngagementSignalsCallback + 79;
        prefetchWithMultipleUrls = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final ebExternalSyntheticLambda0 IEngagementSignalsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 23;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ebExternalSyntheticLambda0 ebexternalsyntheticlambda0 = this.tossReactDebug;
        if (ebexternalsyntheticlambda0 != null) {
            return ebexternalsyntheticlambda0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = setEngagementSignalsCallback + 65;
        prefetchWithMultipleUrls = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 18 / 0;
        }
        return null;
    }

    public final ReactNativeRouteLcpSessionManager IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 87;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        ReactNativeRouteLcpSessionManager reactNativeRouteLcpSessionManager = this.reactNativeRouteLcpSessions;
        if (reactNativeRouteLcpSessionManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 45;
        prefetchWithMultipleUrls = i5 % 128;
        int i6 = i5 % 2;
        return reactNativeRouteLcpSessionManager;
    }

    private static final ReactHostVisibleStateObserver ICustomTabsCallbackStub(ReactSchemeActivity reactSchemeActivity) {
        int i = 2 % 2;
        ReactHostVisibleStateObserver reactHostVisibleStateObserver = new ReactHostVisibleStateObserver(reactSchemeActivity);
        int i2 = setEngagementSignalsCallback + 5;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 != 0) {
            return reactHostVisibleStateObserver;
        }
        throw null;
    }

    private final ReactHostVisibleStateObserver ITrustedWebActivityServiceStub() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 23;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        ReactHostVisibleStateObserver reactHostVisibleStateObserver = (ReactHostVisibleStateObserver) this.ICustomTabsService.getValue();
        if (i3 == 0) {
            return reactHostVisibleStateObserver;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final deserializeUriCollection cancelNotification() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 5;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        deserializeUriCollection deserializeuricollection = (deserializeUriCollection) this.IAuthTabCallbackDefault.getValue();
        int i4 = setEngagementSignalsCallback + 37;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return deserializeuricollection;
    }

    private static final deserializeUriCollection ITrustedWebActivityService() {
        int i = 2 % 2;
        deserializeUriCollection deserializeuricollection = new deserializeUriCollection();
        int i2 = setEngagementSignalsCallback + 47;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        return deserializeuricollection;
    }

    public final void onNavigationEvent(@Nullable r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 49;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        this.onTransact = r8lambdadtqrzfihm2ghoddvkfg5vm2yos;
        int i5 = i2 + 19;
        prefetchWithMultipleUrls = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallbackWithResult(@Nullable r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 71;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        this.asBinder = r8lambdadtqrzfihm2ghoddvkfg5vm2yos;
        int i5 = i2 + 83;
        prefetchWithMultipleUrls = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
    }

    private final IntentParams ITrustedWebActivityServiceDefault() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 69;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        IntentParams intentParams = (IntentParams) this.onActivityResized.getValue();
        int i3 = prefetchWithMultipleUrls + 95;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        return intentParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final IntentParams onMinimized(ReactSchemeActivity reactSchemeActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 123;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IntentParams.Companion companion = IntentParams.Companion;
            Intent intent = reactSchemeActivity.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "");
            return companion.onExtraCallback(intent);
        }
        IntentParams.Companion companion2 = IntentParams.Companion;
        Intent intent2 = reactSchemeActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "");
        companion2.onExtraCallback(intent2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String notifyNotificationWithChannel() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 65;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.getInterfaceDescriptor.getValue();
        if (i3 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String onActivityResized(ReactSchemeActivity reactSchemeActivity) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 73;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Uri data = reactSchemeActivity.getIntent().getData();
        if (data == null) {
            int i4 = setEngagementSignalsCallback + 37;
            prefetchWithMultipleUrls = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        int i6 = prefetchWithMultipleUrls + 67;
        setEngagementSignalsCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return data.getQueryParameter("fallbackUrl");
        }
        data.getQueryParameter("fallbackUrl");
        throw null;
    }

    private final boolean ITrustedWebActivityServiceStubProxy() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 25;
        setEngagementSignalsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ITrustedWebActivityServiceDefault().onWarmupCompleted();
            throw null;
        }
        if (ITrustedWebActivityServiceDefault().onWarmupCompleted() == null) {
            return false;
        }
        int i3 = prefetchWithMultipleUrls + 15;
        setEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            ICustomTabsService_Parcel().RemoteActionCompatParcelizer();
            obj.hashCode();
            throw null;
        }
        if (!ICustomTabsService_Parcel().RemoteActionCompatParcelizer()) {
            return false;
        }
        int i4 = setEngagementSignalsCallback + 53;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private final String getSmallIconBitmap() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 13;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        if (ITrustedWebActivityServiceStubProxy()) {
            int i4 = setEngagementSignalsCallback + 89;
            prefetchWithMultipleUrls = i4 % 128;
            int i5 = i4 % 2;
            return ITrustedWebActivityServiceDefault().onWarmupCompleted();
        }
        return ICustomTabsServiceStubProxy().onWarmupCompleted();
    }

    private final String getSmallIconId() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 109;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        String code = ITrustedWebActivityCallbackStub().onExtraCallbackWithResult().getCode();
        if (code == null) {
            code = "kr";
        }
        int i4 = prefetchWithMultipleUrls + 23;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return code;
    }

    public ResourceResolutionException onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls;
        int i3 = i2 + 121;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        ResourceResolutionException resourceResolutionException = this.onMessageChannelReady;
        int i5 = i2 + 111;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return resourceResolutionException;
    }

    public transExportCert onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls;
        int i3 = i2 + 31;
        setEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        transExportCert transexportcert = this.extraCallbackWithResult;
        int i4 = i2 + 105;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return transexportcert;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<ReactPackage> requestPostMessageChannelWithExtras() {
        int i = 2 % 2;
        ArrayList arrayListOnExtraCallbackWithResult = new onExtraCallback(getApplication()).onExtraCallbackWithResult();
        arrayListOnExtraCallbackWithResult.add(0, new d0a(this.onMessageChannelReady));
        arrayListOnExtraCallbackWithResult.add(new setPanelSlideListener());
        Intrinsics.checkNotNullExpressionValue(arrayListOnExtraCallbackWithResult, "");
        int i2 = setEngagementSignalsCallback + 53;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        return arrayListOnExtraCallbackWithResult;
    }

    private final ReactHost getActiveNotifications() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 1;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        ReactHost reactHostOnExtraCallback = onVerticalScrollEvent().onExtraCallback();
        int i4 = prefetchWithMultipleUrls + 55;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return reactHostOnExtraCallback;
    }

    public BaseActivity.onNavigationEvent onExtraCallback(@Nullable Uri uri) {
        int i = 2 % 2;
        if (uri == null || !(!Intrinsics.areEqual(uri, Uri.EMPTY))) {
            return super/*im.toss.base.BaseActivity*/.onExtraCallback(uri);
        }
        int i2 = setEngagementSignalsCallback + 99;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 != 0) {
            BaseActivity.onNavigationEvent onnavigationevent = BaseActivity.onNavigationEvent.NO_REDIRECT;
            int i3 = setEngagementSignalsCallback + 15;
            prefetchWithMultipleUrls = i3 % 128;
            int i4 = i3 % 2;
            return onnavigationevent;
        }
        BaseActivity.onNavigationEvent onnavigationevent2 = BaseActivity.onNavigationEvent.NO_REDIRECT;
        throw null;
    }

    private static final convertStacktracebugsnag_android_core_release IAuthTabCallback(final TossReactWebViewContentOwner tossReactWebViewContentOwner, final TossWebView tossWebView) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tossReactWebViewContentOwner, "");
        Intrinsics.checkNotNullParameter(tossWebView, "");
        convertStacktracebugsnag_android_core_release convertstacktracebugsnag_android_core_release = new convertStacktracebugsnag_android_core_release(tossReactWebViewContentOwner, tossWebView) { // from class: im.toss.rn.toss.core.ReactSchemeActivity$onCreate$1$1
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ TossWebView onExtraCallbackWithResult;

            {
                this.onExtraCallbackWithResult = tossWebView;
            }

            public String onWarmupCompleted(String str, boolean z, String str2, boolean z2) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 33;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return (String) removeUIManagerEventListener.onWarmupCompleted(ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{removeUIManagerEventListener.onExtraCallbackWithResult, str, Boolean.valueOf(z), str2, this.onExtraCallbackWithResult, Boolean.valueOf(z2)}, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), 967756226, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), -967756226);
                }
                Intrinsics.checkNotNullParameter(str, "");
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String onExtraCallback(String str, String str2) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 65;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    removeUIManagerEventListener.onExtraCallbackWithResult.onWarmupCompleted(str, str2, this.onExtraCallbackWithResult);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                String strOnWarmupCompleted = removeUIManagerEventListener.onExtraCallbackWithResult.onWarmupCompleted(str, str2, this.onExtraCallbackWithResult);
                int i4 = IAuthTabCallback + 81;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return strOnWarmupCompleted;
            }
        };
        int i2 = setEngagementSignalsCallback + 45;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        return convertstacktracebugsnag_android_core_release;
    }

    private static final convertStacktracebugsnag_android_core_release onNavigationEvent(final TossReactWebViewContentOwner tossReactWebViewContentOwner, final TossWebView tossWebView) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tossReactWebViewContentOwner, "");
        Intrinsics.checkNotNullParameter(tossWebView, "");
        convertStacktracebugsnag_android_core_release convertstacktracebugsnag_android_core_release = new convertStacktracebugsnag_android_core_release(tossReactWebViewContentOwner, tossWebView) { // from class: im.toss.rn.toss.core.ReactSchemeActivity$onCreate$2$1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ TossWebView onWarmupCompleted;

            {
                this.onWarmupCompleted = tossWebView;
            }

            public String onWarmupCompleted(String str, boolean z, String str2, boolean z2) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 125;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return (String) removeUIManagerEventListener.onWarmupCompleted(ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{removeUIManagerEventListener.onExtraCallbackWithResult, str, Boolean.valueOf(z), str2, this.onWarmupCompleted, Boolean.valueOf(z2)}, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), 967756226, ItemPreset$$ExternalSyntheticLambda3.IAuthTabCallback(), -967756226);
                }
                Intrinsics.checkNotNullParameter(str, "");
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String onExtraCallback(String str, String str2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 51;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                String strOnWarmupCompleted = removeUIManagerEventListener.onExtraCallbackWithResult.onWarmupCompleted(str, str2, this.onWarmupCompleted);
                int i5 = IAuthTabCallback + 11;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return strOnWarmupCompleted;
                }
                throw null;
            }
        };
        int i2 = setEngagementSignalsCallback + 101;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        return convertstacktracebugsnag_android_core_release;
    }

    private static final Unit onMessageChannelReady(ReactSchemeActivity reactSchemeActivity) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 77;
        prefetchWithMultipleUrls = i2 % 128;
        reactSchemeActivity.onExtraCallback(i2 % 2 != 0);
        Unit unit = Unit.INSTANCE;
        int i3 = prefetchWithMultipleUrls + 115;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit ICustomTabsCallbackDefault(ReactSchemeActivity reactSchemeActivity) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 85;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        reactSchemeActivity.onBackPressed();
        Unit unit = Unit.INSTANCE;
        int i4 = prefetchWithMultipleUrls + 119;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        WeakReference<TossReactWebViewContentOwner> weakReference;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 19;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(bundle);
        super/*im.toss.base.BaseActivity*/.onCreate(r8lambdaHMNJeel4W_tBmaYEYabnCYaHtU.Companion.IAuthTabCallback(bundle));
        RnPhaseObserver.IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{IPostMessageService()}, 1183770401, -1183770401, ICustomTabsCallbackStubProxy.onExtraCallback());
        RnPhaseObserver.IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{IPostMessageService(), this, false, 2, null}, -27226709, 27226716, ICustomTabsCallbackStubProxy.onExtraCallback());
        ReactNativeRouteLcpSessionManager.onWarmupCompleted(-546862392, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{IEngagementSignalsCallbackStub(), this}, zzgc.onExtraCallbackWithResult(), 546862392, zzgc.onExtraCallbackWithResult());
        if (ITrustedWebActivityServiceDefault().onExtraCallback() == null) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(new char[]{25040, 15818, 12155, 24995, 49073, 59748, 11043, 28489, 27101, 47063}, TextUtils.indexOf("", ""), objArr);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), ITrustedWebActivityServiceDefault().IAuthTabCallbackStub());
            Object[] objArr2 = new Object[1];
            a(new char[]{52534, 16606, 2077, 52548, 49827, 48349, 3148, 15078, 50489, 51912}, 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "IncorrectMinVerRN", (String) null, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), "minVerRN_invalid")}), (String) null, false, (String) null, 58, (Object) null);
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("groupId", getSmallIconBitmap());
            Object[] objArr3 = new Object[1];
            a(new char[]{25040, 15818, 12155, 24995, 49073, 59748, 11043, 28489, 27101, 47063}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(16) - 111, objArr3);
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "BundleLoadError", (String) null, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), ITrustedWebActivityServiceDefault().IAuthTabCallbackStub()), getWrite.IAuthTabCallback("cause", "intentParams.minDeployedDate == null")}), (String) null, false, (String) null, 58, (Object) null);
            IAuthTabCallback(this, "minDeployedDateNull", null, 2, null);
            return;
        }
        ITrustedWebActivityServiceStub().IAuthTabCallback(this);
        Objects.toString(onVerticalScrollEvent());
        WeakReference<TossReactWebViewContentOwner> weakReference2 = new WeakReference<>(this);
        this.mayLaunchUrl = weakReference2;
        this.receiveFile = new r8lambdaMJagQRgiktUHA9Hgao4BKiMwco(weakReference2, getActivityResultRegistry(), this, new ReactSchemeActivity$.ExternalSyntheticLambda12());
        Uri uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{ITrustedWebActivityServiceDefault().IAuthTabCallbackStub()});
        if (uri == null) {
            uri = Uri.EMPTY;
            int i4 = setEngagementSignalsCallback + 121;
            prefetchWithMultipleUrls = i4 % 128;
            int i5 = i4 % 2;
        }
        Uri uri2 = uri;
        Intrinsics.checkNotNull(uri2);
        WeakReference<TossReactWebViewContentOwner> weakReference3 = this.mayLaunchUrl;
        if (weakReference3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            weakReference = null;
        } else {
            weakReference = weakReference3;
        }
        WeakReference<TossReactWebViewContentOwner> weakReference4 = this.mayLaunchUrl;
        if (weakReference4 == null) {
            int i6 = prefetchWithMultipleUrls + 107;
            setEngagementSignalsCallback = i6 % 128;
            if (i6 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i7 = 30 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            weakReference4 = null;
        }
        this.isEngagementSignalsApiAvailable = new r8lambdaZ6S5ynORse1Hp60pzEkVw4aqyw4(uri2, weakReference, new r8lambdaMJagQRgiktUHA9Hgao4BKiMwco(weakReference4, getActivityResultRegistry(), this, new ReactSchemeActivity$.ExternalSyntheticLambda13()), IEngagementSignalsCallbackDefault(), new ReactSchemeActivity$.ExternalSyntheticLambda14(this));
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onCreate.4(this, (access13800) null), 3, (Object) null);
        this.onRelationshipValidationResult = new ReactBackPressHandler(new ReactSchemeActivity$.ExternalSyntheticLambda15(this));
        Window window = getWindow();
        if (window != null) {
            onWarmupCompleted(window);
        }
        MediaSessionCompatToken();
        IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), 646384624, -646384611, zzaq.onNavigationEvent(), new Object[]{this}, zzaq.onNavigationEvent());
        IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -815221310, 815221322, zzaq.onNavigationEvent(), new Object[]{this}, zzaq.onNavigationEvent());
        this.onMessageChannelReady.onWarmupCompleted(ITrustedWebActivityCallback_Parcel());
        AudioAttributesCompatParcelizer();
        onWarmupCompleted(this, bundle, onWarmupCompleted(getSmallIconId()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 45;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            createAdListenerWrapper.IAuthTabCallback(this, ITrustedWebActivityCallback_Parcel().IAuthTabCallbackStubProxy(), "ReactSchemeActivity");
            return;
        }
        createAdListenerWrapper.IAuthTabCallback(this, ITrustedWebActivityCallback_Parcel().IAuthTabCallbackStubProxy(), "ReactSchemeActivity");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final MaxFullscreenAdImplExternalSyntheticLambda9 ITrustedWebActivityCallback_Parcel() {
        String str;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls;
        int i3 = i2 + 31;
        int i4 = i3 % 128;
        setEngagementSignalsCallback = i4;
        int i5 = i3 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda9 maxFullscreenAdImplExternalSyntheticLambda9 = this.newAuthTabSession;
        if (maxFullscreenAdImplExternalSyntheticLambda9 != null) {
            int i6 = i2 + 77;
            setEngagementSignalsCallback = i6 % 128;
            int i7 = i6 % 2;
            return maxFullscreenAdImplExternalSyntheticLambda9;
        }
        int i8 = i4 + 51;
        prefetchWithMultipleUrls = i8 % 128;
        if (i8 % 2 != 0) {
            String strOnWarmupCompleted = RnAppVersion.onExtraCallback.onWarmupCompleted(this, ICustomTabsService_Parcel());
            String strOnExtraCallback = onGreatestScrollPercentageIncreased().onExtraCallback();
            String strOnNavigationEvent = ITrustedWebActivityCallback().onNavigationEvent();
            String smallIconBitmap = getSmallIconBitmap();
            if (smallIconBitmap == null) {
                int i9 = setEngagementSignalsCallback + 9;
                prefetchWithMultipleUrls = i9 % 128;
                int i10 = i9 % 2;
                str = "";
            } else {
                str = smallIconBitmap;
            }
            boolean zITrustedWebActivityServiceStubProxy = ICustomTabsService_Parcel().ITrustedWebActivityServiceStubProxy();
            String upperCase = getSmallIconId().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            String strIAuthTabCallbackStub = ITrustedWebActivityServiceDefault().IAuthTabCallbackStub();
            Object[] objArr = {ITrustedWebActivityServiceDefault()};
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            MaxFullscreenAdImplExternalSyntheticLambda9 maxFullscreenAdImplExternalSyntheticLambda92 = new MaxFullscreenAdImplExternalSyntheticLambda9(strOnWarmupCompleted, strOnExtraCallback, strOnNavigationEvent, str, zITrustedWebActivityServiceStubProxy, upperCase, strIAuthTabCallbackStub, (String) IntentParams.IAuthTabCallback(-1609524478, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), objArr, iIAuthTabCallback, zziea.IAuthTabCallback(), 1609524478));
            this.newAuthTabSession = maxFullscreenAdImplExternalSyntheticLambda92;
            return maxFullscreenAdImplExternalSyntheticLambda92;
        }
        RnAppVersion.onExtraCallback.onWarmupCompleted(this, ICustomTabsService_Parcel());
        onGreatestScrollPercentageIncreased().onExtraCallback();
        ITrustedWebActivityCallback().onNavigationEvent();
        getSmallIconBitmap();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final WindowInsetsCompat onNavigationEvent(ReactSchemeActivity reactSchemeActivity, View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 23;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        int iAsBinder = WindowInsetsCompat.onTransact.asBinder() | WindowInsetsCompat.onTransact.onExtraCallbackWithResult();
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompat.onWarmupCompleted(iAsBinder);
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
        view.setPadding(cameraControllerExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback, 0, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallbackWithResult, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback);
        if (!reactSchemeActivity.ITrustedWebActivityServiceDefault().IAuthTabCallbackDefault()) {
            return windowInsetsCompat;
        }
        WindowInsetsCompat windowInsetsCompatOnWarmupCompleted = reactSchemeActivity.onWarmupCompleted(windowInsetsCompat, iAsBinder);
        int i4 = setEngagementSignalsCallback + 47;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return windowInsetsCompatOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        final ReactSchemeActivity reactSchemeActivity = (ReactSchemeActivity) objArr[0];
        int i = 2 % 2;
        reactSchemeActivity.setContentView(reactSchemeActivity.areNotificationsEnabled().onExtraCallback());
        reactSchemeActivity.newSessionWithExtras = reactSchemeActivity.areNotificationsEnabled().IAuthTabCallback;
        ViewCompat.onWarmupCompleted(reactSchemeActivity.areNotificationsEnabled().onExtraCallback(), new RenderInTransitionOverlayNodeElement() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda11
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 63;
                onNavigationEvent = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    ReactSchemeActivity.onExtraCallbackWithResult(this.f$0, view, windowInsetsCompat);
                    throw null;
                }
                WindowInsetsCompat windowInsetsCompatOnExtraCallbackWithResult = ReactSchemeActivity.onExtraCallbackWithResult(this.f$0, view, windowInsetsCompat);
                int i4 = IAuthTabCallback + 109;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return windowInsetsCompatOnExtraCallbackWithResult;
                }
                obj.hashCode();
                throw null;
            }
        });
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), -1083169233, 1083169234, iOnNavigationEvent2, new Object[]{reactSchemeActivity}, zzaq.onNavigationEvent());
        reactSchemeActivity.MediaDescriptionCompat();
        Unit unit = Unit.INSTANCE;
        int i2 = setEngagementSignalsCallback + 97;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onUnminimized(ReactSchemeActivity reactSchemeActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 93;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        reactSchemeActivity.ITrustedWebActivityService_Parcel();
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
    }

    private static final Unit onNavigationEvent(final ReactSchemeActivity reactSchemeActivity, ReactSurfaceView reactSurfaceView) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 51;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(reactSurfaceView, "");
            reactSchemeActivity.areNotificationsEnabled().onExtraCallback.onExtraCallbackWithResult();
            ReactRootView reactRootView = reactSchemeActivity.newSessionWithExtras;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(reactSurfaceView, "");
        reactSchemeActivity.areNotificationsEnabled().onExtraCallback.onExtraCallbackWithResult();
        ReactRootView reactRootView2 = reactSchemeActivity.newSessionWithExtras;
        if (reactRootView2 == null) {
            reactRootView2 = reactSchemeActivity.areNotificationsEnabled().IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(reactRootView2, "");
        }
        int iIndexOfChild = reactSchemeActivity.areNotificationsEnabled().onWarmupCompleted.indexOfChild(reactRootView2);
        reactSchemeActivity.areNotificationsEnabled().onWarmupCompleted.removeView(reactRootView2);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = new ConstraintLayout.onExtraCallbackWithResult(-1, -1);
        onextracallbackwithresult.ITrustedWebActivityCallbackDefault = reactSchemeActivity.areNotificationsEnabled().onExtraCallbackWithResult.getId();
        onextracallbackwithresult.IAuthTabCallback = 0;
        onextracallbackwithresult.ITrustedWebActivityCallback = 0;
        onextracallbackwithresult.ICustomTabsCallback = 0;
        reactSurfaceView.setLayoutParams(onextracallbackwithresult);
        reactSchemeActivity.areNotificationsEnabled().onWarmupCompleted.addView(reactSurfaceView, iIndexOfChild);
        reactSchemeActivity.newSessionWithExtras = reactSurfaceView;
        reactSurfaceView.post(new Runnable() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda29
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 21;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                ReactSchemeActivity.onTransact(this.f$0);
                int i6 = onExtraCallback + 35;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i3 = setEngagementSignalsCallback + 13;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        final ReactSchemeActivity reactSchemeActivity = (ReactSchemeActivity) objArr[0];
        int i = 2 % 2;
        reactSchemeActivity.onVerticalScrollEvent().onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 3;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    ReactSchemeActivity.asBinder(this.f$0);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Unit unitAsBinder = ReactSchemeActivity.asBinder(this.f$0);
                int i4 = IAuthTabCallback + 125;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unitAsBinder;
            }
        });
        reactSchemeActivity.onVerticalScrollEvent().onWarmupCompleted(new Function1() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda9
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 71;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = ReactSchemeActivity.onExtraCallback(this.f$0, (ReactSurfaceView) obj);
                int i5 = onWarmupCompleted + 21;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 72 / 0;
                }
                return unitOnExtraCallback;
            }
        });
        reactSchemeActivity.onVerticalScrollEvent().onExtraCallback(new Function1() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 107;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr2 = {this.f$0, (Throwable) obj};
                Unit unit = (Unit) ReactSchemeActivity.IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -1813870027, 1813870037, zzaq.onNavigationEvent(), objArr2, zzaq.onNavigationEvent());
                int i5 = IAuthTabCallback + 87;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        });
        int i2 = setEngagementSignalsCallback + 15;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(ReactSchemeActivity reactSchemeActivity, Throwable th) throws Throwable {
        TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallbackIAuthTabCallback;
        MaxFullscreenAdImplExternalSyntheticLambda7 maxFullscreenAdImplExternalSyntheticLambda7;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 77;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        boolean zAreEqual = Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
        Object obj = null;
        if (zAreEqual) {
            int i4 = setEngagementSignalsCallback + 45;
            prefetchWithMultipleUrls = i4 % 128;
            if (i4 % 2 == 0) {
                reactSchemeActivity.getLifecycle().IAuthTabCallback();
                throw null;
            }
            onextracallbackIAuthTabCallback = reactSchemeActivity.getLifecycle().IAuthTabCallback();
        } else {
            onextracallbackIAuthTabCallback = null;
        }
        if (onextracallbackIAuthTabCallback == TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.DESTROYED) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "GraniteBadTokenGuard", "skip error consumer; activity destroyed", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("guardKind", "consumer.reactScheme"), getWrite.IAuthTabCallback("lifecycleState", onextracallbackIAuthTabCallback.name()), getWrite.IAuthTabCallback("isFinishing", String.valueOf(reactSchemeActivity.isFinishing())), getWrite.IAuthTabCallback("isDestroyed", String.valueOf(reactSchemeActivity.isDestroyed())), getWrite.IAuthTabCallback("isMainThread", String.valueOf(zAreEqual)), getWrite.IAuthTabCallback("errorType", th.getClass().getSimpleName()), getWrite.IAuthTabCallback("service", (String) IntentParams.IAuthTabCallback(-1609524478, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{reactSchemeActivity.ITrustedWebActivityServiceDefault()}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 1609524478))}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            return Unit.INSTANCE;
        }
        reactSchemeActivity.areNotificationsEnabled().onExtraCallback.onExtraCallbackWithResult();
        MaxFullscreenAdImplExternalSyntheticLambda7 typedObject = reactSchemeActivity.readTypedObject();
        if (!(typedObject instanceof MaxFullscreenAdImplExternalSyntheticLambda7)) {
            int i5 = prefetchWithMultipleUrls + 75;
            setEngagementSignalsCallback = i5 % 128;
            int i6 = i5 % 2;
            maxFullscreenAdImplExternalSyntheticLambda7 = null;
        } else {
            int i7 = setEngagementSignalsCallback + 55;
            prefetchWithMultipleUrls = i7 % 128;
            if (i7 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            maxFullscreenAdImplExternalSyntheticLambda7 = typedObject;
        }
        if (maxFullscreenAdImplExternalSyntheticLambda7 != null) {
            maxFullscreenAdImplExternalSyntheticLambda7.onExtraCallback((String) IntentParams.IAuthTabCallback(-1609524478, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{reactSchemeActivity.ITrustedWebActivityServiceDefault()}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 1609524478), ReactSchemeActivityKt.onExtraCallback(th, "bundleLoadFailed"));
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        String strOnNavigationEvent = reactSchemeActivity.ITrustedWebActivityServiceDefault().onNavigationEvent();
        Map mapOnExtraCallback = access8100.onExtraCallback();
        StringBuilder sb = new StringBuilder();
        Throwable[] suppressed = th.getSuppressed();
        Intrinsics.checkNotNullExpressionValue(suppressed, "");
        Throwable th2 = (Throwable) ArraysKt.firstOrNull(suppressed);
        if (th2 != null) {
            sb.append(th2.getClass().getSimpleName() + ": " + th2.getMessage());
            sb.append(" | ");
        }
        sb.append(th.getMessage());
        Unit unit = Unit.INSTANCE;
        mapOnExtraCallback.put("cause", sb.toString());
        mapOnExtraCallback.put("groupId", reactSchemeActivity.getSmallIconBitmap());
        mapOnExtraCallback.put("stackTrace", RawQueries.onNavigationEvent(th, 0, 0, 3, (Object) null));
        Object[] objArr = new Object[1];
        a(new char[]{25040, 15818, 12155, 24995, 49073, 59748, 11043, 28489, 27101, 47063}, Color.red(0), objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), reactSchemeActivity.ITrustedWebActivityServiceDefault().IAuthTabCallbackStub());
        mapOnExtraCallback.putAll(MaxNativeAdLoaderImplb.onNavigationEvent.onNavigationEvent(reactSchemeActivity, th));
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "BundleLoadError", (String) null, access8100.onExtraCallbackWithResult(mapOnExtraCallback), (String) null, false, strOnNavigationEvent, 26, (Object) null);
        reactSchemeActivity.onExtraCallbackWithResult("bundleLoadFailed", th);
        return unit;
    }

    public void IAuthTabCallback(@NotNull ReactContext reactContext) throws Throwable {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 81;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(reactContext, "");
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), 224124945, -224124937, iOnNavigationEvent2, new Object[]{this, reactContext}, zzaq.onNavigationEvent());
        int i4 = prefetchWithMultipleUrls + 55;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void ITrustedWebActivityService_Parcel() throws Throwable {
        int i = 2 % 2;
        final ReactHost reactHostOnExtraCallback = onVerticalScrollEvent().onExtraCallback();
        if (reactHostOnExtraCallback != null) {
            this.ICustomTabsCallback.onExtraCallbackWithResult(reactHostOnExtraCallback);
            ReactInstanceEventListener reactInstanceEventListener = new ReactInstanceEventListener() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$preStartReactHostOrFallback$listener$1
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public void onNavigationEvent(ReactContext reactContext) throws Throwable {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 65;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(reactContext, "");
                        reactHostOnExtraCallback.onExtraCallbackWithResult(this);
                        ReactSchemeActivity.onWarmupCompleted(this, (ReactInstanceEventListener) null);
                        this.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED);
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(reactContext, "");
                    reactHostOnExtraCallback.onExtraCallbackWithResult(this);
                    ReactSchemeActivity.onWarmupCompleted(this, (ReactInstanceEventListener) null);
                    if (this.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED)) {
                        ReactSchemeActivity.onNavigationEvent(this, reactContext);
                        ReactSchemeActivity.readTypedObject(this);
                    } else {
                        int i4 = onNavigationEvent + 35;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                    }
                }
            };
            this.ICustomTabsCallbackStub = reactInstanceEventListener;
            reactHostOnExtraCallback.onExtraCallback(reactInstanceEventListener);
            reactHostOnExtraCallback.onNavigationEvent();
            int i2 = setEngagementSignalsCallback + 89;
            prefetchWithMultipleUrls = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = setEngagementSignalsCallback + 13;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("host", "scheme_activity");
        Object[] objArr = new Object[1];
        a(new char[]{52534, 16606, 2077, 52548, 49827, 48349, 3148, 15078, 50489, 51912}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 19, objArr);
        ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, "TossRnHostMilestone", "pre_start_react_host_fallback", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "react_host_null")}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        ResultReceiver1();
    }

    private final void ResultReceiver1() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 85;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this.onPostMessage) {
            this.ICustomTabsCallbackStubProxy = false;
            MediaMetadataCompat();
            return;
        }
        TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallbackIAuthTabCallback = getLifecycle().IAuthTabCallback();
        Object obj = null;
        if (onextracallbackIAuthTabCallback == TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.DESTROYED) {
            int i4 = setEngagementSignalsCallback + 79;
            int i5 = i4 % 128;
            prefetchWithMultipleUrls = i5;
            int i6 = i4 % 2;
            this.ICustomTabsCallbackStubProxy = false;
            int i7 = i5 + 23;
            setEngagementSignalsCallback = i7 % 128;
            if (i7 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (!onextracallbackIAuthTabCallback.isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED)) {
            int i8 = setEngagementSignalsCallback + 1;
            prefetchWithMultipleUrls = i8 % 128;
            int i9 = i8 % 2;
            this.ICustomTabsCallbackStubProxy = true;
            read();
            return;
        }
        onVerticalScrollEvent().onNavigationEvent();
        this.onPostMessage = true;
        this.ICustomTabsCallbackStubProxy = false;
        MediaMetadataCompat();
        int i10 = setEngagementSignalsCallback + 121;
        prefetchWithMultipleUrls = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void ResultReceiverMyRunnable() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 81;
        int i3 = i2 % 128;
        prefetchWithMultipleUrls = i3;
        int i4 = i2 % 2;
        if (!this.ICustomTabsCallbackStubProxy) {
            int i5 = i3 + 31;
            setEngagementSignalsCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            ResultReceiver1();
            int i7 = prefetchWithMultipleUrls + 55;
            setEngagementSignalsCallback = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
        }
    }

    private final void read() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 125;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        if (this.ICustomTabsCallbackDefault == null) {
            ReactSchemeActivity$observeReactSurfaceStartOnResume$observer$1 reactSchemeActivity$observeReactSurfaceStartOnResume$observer$1 = new ReactSchemeActivity$observeReactSurfaceStartOnResume$observer$1(this);
            this.ICustomTabsCallbackDefault = reactSchemeActivity$observeReactSurfaceStartOnResume$observer$1;
            getLifecycle().IAuthTabCallback(reactSchemeActivity$observeReactSurfaceStartOnResume$observer$1);
        } else {
            int i5 = i2 + 13;
            prefetchWithMultipleUrls = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(Bundle bundle) {
        boolean z;
        Intent intent;
        String stringExtra;
        int i = 2 % 2;
        if (bundle != null) {
            int i2 = setEngagementSignalsCallback + 73;
            prefetchWithMultipleUrls = i2 % 128;
            if (i2 % 2 == 0) {
                z = bundle.getBoolean("redirectHandled");
                int i3 = 60 / 0;
            } else {
                z = bundle.getBoolean("redirectHandled");
            }
            int i4 = prefetchWithMultipleUrls + 37;
            setEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            z = false;
        }
        this.prefetch = z;
        if (z) {
            int i6 = setEngagementSignalsCallback + 107;
            prefetchWithMultipleUrls = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        if ((bundle == null || (stringExtra = bundle.getString("pendingRedirectUrl")) == null) && ((intent = getIntent()) == null || (stringExtra = intent.getStringExtra("redirect")) == null || StringsKt.isBlank(stringExtra))) {
            int i8 = setEngagementSignalsCallback + 119;
            prefetchWithMultipleUrls = i8 % 128;
            int i9 = i8 % 2;
            stringExtra = null;
        }
        this.onUnminimized = stringExtra;
        int i10 = setEngagementSignalsCallback + 121;
        prefetchWithMultipleUrls = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 62 / 0;
        }
    }

    private final void onWarmupCompleted(Intent intent) {
        String stringExtra;
        int i = 2 % 2;
        String str = null;
        if (intent != null && (stringExtra = intent.getStringExtra("redirect")) != null) {
            int i2 = setEngagementSignalsCallback + 115;
            prefetchWithMultipleUrls = i2 % 128;
            if (i2 % 2 == 0) {
                StringsKt.isBlank(stringExtra);
                throw null;
            }
            if (!StringsKt.isBlank(stringExtra)) {
                int i3 = setEngagementSignalsCallback + 105;
                prefetchWithMultipleUrls = i3 % 128;
                int i4 = i3 % 2;
                str = stringExtra;
            }
        }
        this.onUnminimized = str;
        if (str != null) {
            this.prefetch = false;
        }
        int i5 = setEngagementSignalsCallback + 17;
        prefetchWithMultipleUrls = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void MediaMetadataCompat() {
        int i = 2 % 2;
        String str = this.onUnminimized;
        if (str != null) {
            int i2 = setEngagementSignalsCallback + 69;
            int i3 = i2 % 128;
            prefetchWithMultipleUrls = i3;
            if (i2 % 2 == 0) {
                int i4 = 15 / 0;
                if (this.prefetch) {
                    return;
                }
            } else if (!(!this.prefetch)) {
                return;
            }
            if (this.onPostMessage) {
                int i5 = i3 + 73;
                setEngagementSignalsCallback = i5 % 128;
                int i6 = i5 % 2;
                if (getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED)) {
                    this.prefetch = true;
                    this.onUnminimized = null;
                    Intent intent = getIntent();
                    if (intent != null) {
                        int i7 = setEngagementSignalsCallback + 43;
                        prefetchWithMultipleUrls = i7 % 128;
                        int i8 = i7 % 2;
                        intent.removeExtra("redirect");
                    }
                    SessionTrackerb.IAuthTabCallback((SessionTrackerb) resumeForClick.asBinder, (Activity) this, str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                }
            }
        }
    }

    private static final Unit IAuthTabCallback(ReactSchemeActivity reactSchemeActivity, getAdValue getadvalue) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 93;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            TossModule tossModule = reactSchemeActivity.newSession;
            throw null;
        }
        TossModule tossModule2 = reactSchemeActivity.newSession;
        if (tossModule2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            tossModule2 = null;
        }
        tossModule2.onExtraCallback(getadvalue.onExtraCallbackWithResult(), getadvalue.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i3 = prefetchWithMultipleUrls + 103;
        setEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asInterface(Throwable th) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 59;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(th, "");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        ReactSchemeActivity reactSchemeActivity = (ReactSchemeActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        TossModule tossModule = reactSchemeActivity.newSession;
        if (tossModule == null) {
            int i2 = prefetchWithMultipleUrls + 85;
            setEngagementSignalsCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            tossModule = null;
        }
        tossModule.onWarmupCompleted(str);
        Unit unit = Unit.INSTANCE;
        int i4 = prefetchWithMultipleUrls + 59;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r4 r5
      0x0030: PHI (r4v5 int) = (r4v4 int), (r4v17 int) binds: [B:8:0x002e, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r5v2 java.lang.Integer) = (r5v1 java.lang.Integer), (r5v7 java.lang.Integer) binds: [B:8:0x002e, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int iHashCode;
        Integer num;
        final TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (ReactSchemeActivity) objArr[0];
        ReactContext reactContext = (ReactContext) objArr[1];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 61;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            iHashCode = reactContext.hashCode();
            num = ((ReactSchemeActivity) textFieldScrollKtExternalSyntheticLambda0).writeTypedObject;
            int i3 = 28 / 0;
            if (num != null) {
                if (num.intValue() == iHashCode) {
                    return null;
                }
            }
        } else {
            iHashCode = reactContext.hashCode();
            num = ((ReactSchemeActivity) textFieldScrollKtExternalSyntheticLambda0).writeTypedObject;
            if (num != null) {
            }
        }
        textFieldScrollKtExternalSyntheticLambda0.ITrustedWebActivityCallbackStubProxy();
        ((ReactSchemeActivity) textFieldScrollKtExternalSyntheticLambda0).writeTypedObject = Integer.valueOf(iHashCode);
        MaxFullscreenAdImplExternalSyntheticLambda9 maxFullscreenAdImplExternalSyntheticLambda9ITrustedWebActivityCallback_Parcel = textFieldScrollKtExternalSyntheticLambda0.ITrustedWebActivityCallback_Parcel();
        ((ReactSchemeActivity) textFieldScrollKtExternalSyntheticLambda0).newSession = new TossModule(reactContext, textFieldScrollKtExternalSyntheticLambda0.IEngagementSignalsCallbackDefault(), new WeakReference(textFieldScrollKtExternalSyntheticLambda0), maxFullscreenAdImplExternalSyntheticLambda9ITrustedWebActivityCallback_Parcel.IAuthTabCallbackStub(), maxFullscreenAdImplExternalSyntheticLambda9ITrustedWebActivityCallback_Parcel.onTransact(), maxFullscreenAdImplExternalSyntheticLambda9ITrustedWebActivityCallback_Parcel.IAuthTabCallback(), maxFullscreenAdImplExternalSyntheticLambda9ITrustedWebActivityCallback_Parcel.onExtraCallback(), maxFullscreenAdImplExternalSyntheticLambda9ITrustedWebActivityCallback_Parcel.onWarmupCompleted(), maxFullscreenAdImplExternalSyntheticLambda9ITrustedWebActivityCallback_Parcel.onExtraCallbackWithResult(), maxFullscreenAdImplExternalSyntheticLambda9ITrustedWebActivityCallback_Parcel.IAuthTabCallback_Parcel(), maxFullscreenAdImplExternalSyntheticLambda9ITrustedWebActivityCallback_Parcel.asInterface(), null, 2048, null);
        ((ReactSchemeActivity) textFieldScrollKtExternalSyntheticLambda0).readTypedObject = new GraniteBrownfieldModule(reactContext, new WeakReference(textFieldScrollKtExternalSyntheticLambda0), new WeakReference(textFieldScrollKtExternalSyntheticLambda0), textFieldScrollKtExternalSyntheticLambda0.ITrustedWebActivityServiceDefault().IAuthTabCallbackStub(), (Function0) null, false, (Function0) null, 112, (DefaultConstructorMarker) null);
        ResourceResolutionException resourceResolutionException = ((ReactSchemeActivity) textFieldScrollKtExternalSyntheticLambda0).onMessageChannelReady;
        MaxFullscreenAdImplExternalSyntheticLambda2 maxFullscreenAdImplExternalSyntheticLambda2 = new MaxFullscreenAdImplExternalSyntheticLambda2(reactContext, new WeakReference(textFieldScrollKtExternalSyntheticLambda0), null, 4, null);
        GraniteBrownfieldModule graniteBrownfieldModule = ((ReactSchemeActivity) textFieldScrollKtExternalSyntheticLambda0).readTypedObject;
        if (graniteBrownfieldModule == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            graniteBrownfieldModule = null;
        }
        TossModule tossModule = ((ReactSchemeActivity) textFieldScrollKtExternalSyntheticLambda0).newSession;
        if (tossModule == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            tossModule = null;
        }
        resourceResolutionException.onWarmupCompleted(CollectionsKt.listOf(new Role[]{maxFullscreenAdImplExternalSyntheticLambda2, graniteBrownfieldModule, tossModule, new transImportCert(reactContext)}));
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle = textFieldScrollKtExternalSyntheticLambda0.getLifecycle();
        TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 = ((ReactSchemeActivity) textFieldScrollKtExternalSyntheticLambda0).readTypedObject;
        if (textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 == null) {
            int i4 = setEngagementSignalsCallback + 37;
            prefetchWithMultipleUrls = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = 92 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 = null;
        }
        lifecycle.IAuthTabCallback(textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0);
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle2 = textFieldScrollKtExternalSyntheticLambda0.getLifecycle();
        TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda02 = ((ReactSchemeActivity) textFieldScrollKtExternalSyntheticLambda0).newSession;
        if (textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda02 == null) {
            int i6 = setEngagementSignalsCallback + 125;
            prefetchWithMultipleUrls = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda02 = null;
        }
        lifecycle2.IAuthTabCallback(textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda02);
        TossModule tossModule2 = ((ReactSchemeActivity) textFieldScrollKtExternalSyntheticLambda0).newSession;
        if (tossModule2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            tossModule2 = null;
        }
        tossModule2.onActivityLayout();
        GraniteBrownfieldModule graniteBrownfieldModule2 = ((ReactSchemeActivity) textFieldScrollKtExternalSyntheticLambda0).readTypedObject;
        if (graniteBrownfieldModule2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            graniteBrownfieldModule2 = null;
        }
        graniteBrownfieldModule2.onExtraCallbackWithResult();
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback = getIconPaddingLeft.IAuthTabCallback.onWarmupCompleted().onExtraCallback(getAdValue.class);
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnExtraCallback, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = jsonReaderUnknownNumberParsingOnExtraCallback.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        textFieldScrollKtExternalSyntheticLambda0.cancelNotification().onNavigationEvent(setMessageBytes.onNavigationEvent(jsonReaderUnknownNumberParsingOnWarmupCompleted, new Function1() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda26
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = onExtraCallbackWithResult + 35;
                onWarmupCompleted = i9 % 128;
                Throwable th = (Throwable) obj;
                if (i9 % 2 == 0) {
                    int iOnNavigationEvent = zzaq.onNavigationEvent();
                    int iOnNavigationEvent2 = zzaq.onNavigationEvent();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int iOnNavigationEvent3 = zzaq.onNavigationEvent();
                int iOnNavigationEvent4 = zzaq.onNavigationEvent();
                Unit unit = (Unit) ReactSchemeActivity.IAuthTabCallback(iOnNavigationEvent3, zzaq.onNavigationEvent(), 580810741, -580810737, iOnNavigationEvent4, new Object[]{th}, zzaq.onNavigationEvent());
                int i10 = onExtraCallbackWithResult + 49;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 43 / 0;
                }
                return unit;
            }
        }, (Function0) null, new Function1() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda27
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = onNavigationEvent + 101;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                Unit unitOnExtraCallback = ReactSchemeActivity.onExtraCallback(this.f$0, (getAdValue) obj);
                int i11 = IAuthTabCallback + 101;
                onNavigationEvent = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 10 / 0;
                }
                return unitOnExtraCallback;
            }
        }, 2, (Object) null));
        TossReactLifecycleEventEmitter tossReactLifecycleEventEmitter = new TossReactLifecycleEventEmitter(new Function1() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda28
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = onExtraCallbackWithResult + 115;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                Unit unitOnExtraCallbackWithResult = ReactSchemeActivity.onExtraCallbackWithResult(this.f$0, (String) obj);
                int i11 = onWarmupCompleted + 67;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 63 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        });
        ((ReactSchemeActivity) textFieldScrollKtExternalSyntheticLambda0).onMinimized = tossReactLifecycleEventEmitter;
        TossReactLifecycleEventEmitter.Companion.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0, tossReactLifecycleEventEmitter);
        return null;
    }

    private final void ITrustedWebActivityCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 113;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        if (this.newSession != null) {
            TextFieldKeyInputExternalSyntheticLambda9 lifecycle = getLifecycle();
            TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 = this.newSession;
            if (textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 == null) {
                int i4 = setEngagementSignalsCallback + 17;
                prefetchWithMultipleUrls = i4 % 128;
                if (i4 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i5 = 45 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 = null;
            }
            lifecycle.onExtraCallbackWithResult(textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0);
            TossModule tossModule = this.newSession;
            if (tossModule == null) {
                int i6 = setEngagementSignalsCallback + 79;
                prefetchWithMultipleUrls = i6 % 128;
                if (i6 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                tossModule = null;
            }
            TossModule.onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1769724583, new Object[]{tossModule}, -1769724580, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        }
        if (this.readTypedObject != null) {
            TextFieldKeyInputExternalSyntheticLambda9 lifecycle2 = getLifecycle();
            TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda02 = this.readTypedObject;
            if (textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda02 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i7 = setEngagementSignalsCallback + 33;
                prefetchWithMultipleUrls = i7 % 128;
                int i8 = i7 % 2;
                textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda02 = null;
            }
            lifecycle2.onExtraCallbackWithResult(textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda02);
        }
        TossReactLifecycleEventEmitter tossReactLifecycleEventEmitter = this.onMinimized;
        if (tossReactLifecycleEventEmitter != null) {
            getLifecycle().onExtraCallbackWithResult(tossReactLifecycleEventEmitter);
        }
        this.onMinimized = null;
        cancelNotification().onExtraCallbackWithResult();
    }

    private final void MediaSessionCompatToken() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 33;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        ITrustedWebActivityCallbackStubProxy delegate = getDelegate();
        String interfaceDescriptor = ITrustedWebActivityServiceDefault().getInterfaceDescriptor();
        int i4 = 1;
        if (Intrinsics.areEqual(interfaceDescriptor, "dark")) {
            int i5 = setEngagementSignalsCallback + 61;
            prefetchWithMultipleUrls = i5 % 128;
            int i6 = i5 % 2;
            i4 = 2;
        } else if (Intrinsics.areEqual(interfaceDescriptor, "light")) {
            int i7 = setEngagementSignalsCallback + 105;
            prefetchWithMultipleUrls = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i4 = -100;
        }
        delegate.onNavigationEvent(i4);
        int i9 = setEngagementSignalsCallback + 35;
        prefetchWithMultipleUrls = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ReactSchemeActivity reactSchemeActivity = (ReactSchemeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 79;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            if (WhenMappings.onWarmupCompleted[reactSchemeActivity.ITrustedWebActivityServiceDefault().asBinder().ordinal()] != 0) {
                return null;
            }
        } else {
            if (WhenMappings.onWarmupCompleted[reactSchemeActivity.ITrustedWebActivityServiceDefault().asBinder().ordinal()] != 1) {
                return null;
            }
        }
        AppBarLayout appBarLayout = reactSchemeActivity.areNotificationsEnabled().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(appBarLayout, "");
        appBarLayout.setVisibility(0);
        reactSchemeActivity.setSupportActionBar(reactSchemeActivity.areNotificationsEnabled().onNavigationEvent);
        IPostMessageServiceStubProxy supportActionBar = reactSchemeActivity.getSupportActionBar();
        if (supportActionBar == null) {
            return null;
        }
        int i3 = prefetchWithMultipleUrls + 11;
        setEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            supportActionBar.onNavigationEvent(false);
            return null;
        }
        supportActionBar.onNavigationEvent(true);
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(hExternalSyntheticLambda15 hexternalsyntheticlambda15, boolean z) throws Throwable {
        Object obj;
        ReactInstanceManager reactInstanceManagerOnNavigationEvent;
        Object obj2;
        Object obj3;
        Bundle bundleIAuthTabCallback;
        TossReactBundleMeta tossReactBundleMetaOnExtraCallbackWithResult;
        int i = 2 % 2;
        Bundle bundleIAuthTabCallback2 = null;
        if (hexternalsyntheticlambda15 instanceof hExternalSyntheticLambda15.onExtraCallbackWithResult) {
            hExternalSyntheticLambda15.onExtraCallbackWithResult onextracallbackwithresult = (hExternalSyntheticLambda15.onExtraCallbackWithResult) hexternalsyntheticlambda15;
            String url = onextracallbackwithresult.onNavigationEvent().getUrl();
            MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted();
            String strIAuthTabCallback = (onextracallbackwithresultOnWarmupCompleted == null || (tossReactBundleMetaOnExtraCallbackWithResult = onextracallbackwithresultOnWarmupCompleted.onExtraCallbackWithResult()) == null) ? null : tossReactBundleMetaOnExtraCallbackWithResult.IAuthTabCallback();
            if (strIAuthTabCallback == null) {
                int i2 = setEngagementSignalsCallback + 61;
                prefetchWithMultipleUrls = i2 % 128;
                int i3 = i2 % 2;
                strIAuthTabCallback = "";
            }
            r8lambdaFIcUTNe3dsoUoki0GlLmaYSc.IAuthTabCallback(url, strIAuthTabCallback);
            r8lambda3VLBDMfcFBq3y6wAYf87R7p92xc r8lambda3vlbdmfcfbq3y6wayf87r7p92xc = r8lambda3VLBDMfcFBq3y6wAYf87R7p92xc.onExtraCallbackWithResult;
            String code = ITrustedWebActivityCallbackStub().onExtraCallbackWithResult().getCode();
            String smallIconBitmap = getSmallIconBitmap();
            Bundle bundleOnNavigationEvent = r8lambda3vlbdmfcfbq3y6wayf87r7p92xc.onNavigationEvent(this, code, smallIconBitmap != null ? smallIconBitmap : "");
            try {
                Result.Companion companion = Result.Companion;
                Uri data = getIntent().getData();
                if (data != null) {
                    int i4 = prefetchWithMultipleUrls + 49;
                    setEngagementSignalsCallback = i4 % 128;
                    int i5 = i4 % 2;
                    bundleIAuthTabCallback = processTransparent.IAuthTabCallback(data);
                } else {
                    bundleIAuthTabCallback = null;
                }
                obj3 = Result.constructor-impl(bundleIAuthTabCallback);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj3 = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Bundle bundle = new Bundle();
            if (Result.onExtraCallback(obj3)) {
                obj3 = bundle;
            }
            bundleOnNavigationEvent.putAll((Bundle) obj3);
            IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -1237742244, 1237742255, zzaq.onNavigationEvent(), new Object[]{this, bundleOnNavigationEvent}, zzaq.onNavigationEvent());
            IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), 1709011508, -1709011506, zzaq.onNavigationEvent(), new Object[]{this, bundleOnNavigationEvent}, zzaq.onNavigationEvent());
            this.access100 = onextracallbackwithresult.onExtraCallback();
            ReactRootView reactRootView = this.newSessionWithExtras;
            if (reactRootView != null) {
                int i6 = setEngagementSignalsCallback + 69;
                prefetchWithMultipleUrls = i6 % 128;
                if (i6 % 2 == 0) {
                    reactRootView.IAuthTabCallback(onextracallbackwithresult.onExtraCallback(), onextracallbackwithresult.onNavigationEvent().onExtraCallbackWithResult(), bundleOnNavigationEvent);
                    bundleIAuthTabCallback2.hashCode();
                    throw null;
                }
                reactRootView.IAuthTabCallback(onextracallbackwithresult.onExtraCallback(), onextracallbackwithresult.onNavigationEvent().onExtraCallbackWithResult(), bundleOnNavigationEvent);
            }
            areNotificationsEnabled().onExtraCallback.onExtraCallbackWithResult();
            return;
        }
        if (hexternalsyntheticlambda15 instanceof hExternalSyntheticLambda15.onExtraCallback) {
            if (!z) {
                onExtraCallback(true);
                return;
            }
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            hExternalSyntheticLambda15.onExtraCallback onextracallback = (hExternalSyntheticLambda15.onExtraCallback) hexternalsyntheticlambda15;
            convertFloatArrayToByteArray.IAuthTabCallback("BundleLoadStateError", onextracallback.onWarmupCompleted());
            Map mapOnExtraCallback = access8100.onExtraCallback();
            mapOnExtraCallback.put("groupId", getSmallIconBitmap());
            Object[] objArr = new Object[1];
            a(new char[]{25040, 15818, 12155, 24995, 49073, 59748, 11043, 28489, 27101, 47063}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
            mapOnExtraCallback.put(((String) objArr[0]).intern(), ITrustedWebActivityServiceDefault().IAuthTabCallbackStub());
            Throwable cause = onextracallback.onWarmupCompleted().getCause();
            mapOnExtraCallback.put("cause", cause != null ? cause.getMessage() : null);
            mapOnExtraCallback.put("stacktrace", RawQueries.onNavigationEvent(onextracallback.onWarmupCompleted(), 0, 0, 3, (Object) null));
            mapOnExtraCallback.putAll(MaxNativeAdLoaderImplb.onNavigationEvent.onNavigationEvent(this, onextracallback.onWarmupCompleted()));
            Unit unit = Unit.INSTANCE;
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "BundleLoadError", (String) null, access8100.onExtraCallbackWithResult(mapOnExtraCallback), (String) null, false, (String) null, 58, (Object) null);
            onExtraCallbackWithResult("bundleLoadStateError", onextracallback.onWarmupCompleted());
            return;
        }
        if (!(hexternalsyntheticlambda15 instanceof hExternalSyntheticLambda15.onNavigationEvent)) {
            if (!(hexternalsyntheticlambda15 instanceof hExternalSyntheticLambda15.onWarmupCompleted)) {
                throw new NoWhenBranchMatchedException();
            }
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr2 = new Object[1];
            a(new char[]{25040, 15818, 12155, 24995, 49073, 59748, 11043, 28489, 27101, 47063}, KeyEvent.normalizeMetaState(0), objArr2);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), ITrustedWebActivityServiceDefault().IAuthTabCallbackStub());
            hExternalSyntheticLambda15.onWarmupCompleted onwarmupcompleted = (hExternalSyntheticLambda15.onWarmupCompleted) hexternalsyntheticlambda15;
            Object[] objArr3 = new Object[1];
            a(new char[]{52534, 16606, 2077, 52548, 49827, 48349, 3148, 15078, 50489, 51912}, ViewConfiguration.getDoubleTapTimeout() >> 16, objArr3);
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray2, "IncorrectMinVerRN", (String) null, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), onwarmupcompleted.onExtraCallback())}), (String) null, false, (String) null, 58, (Object) null);
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("groupId", getSmallIconBitmap());
            Object[] objArr4 = new Object[1];
            a(new char[]{25040, 15818, 12155, 24995, 49073, 59748, 11043, 28489, 27101, 47063}, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr4);
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray2, "BundleLoadError", (String) null, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), ITrustedWebActivityServiceDefault().IAuthTabCallbackStub()), getWrite.IAuthTabCallback("cause", "IncorrectVersion reason: " + onwarmupcompleted.onExtraCallback())}), (String) null, false, (String) null, 58, (Object) null);
            IAuthTabCallback(this, "incorrectVersion", null, 2, null);
            return;
        }
        r8lambda3VLBDMfcFBq3y6wAYf87R7p92xc r8lambda3vlbdmfcfbq3y6wayf87r7p92xc2 = r8lambda3VLBDMfcFBq3y6wAYf87R7p92xc.onExtraCallbackWithResult;
        String code2 = ITrustedWebActivityCallbackStub().onExtraCallbackWithResult().getCode();
        String smallIconBitmap2 = getSmallIconBitmap();
        Bundle bundleOnNavigationEvent2 = r8lambda3vlbdmfcfbq3y6wayf87r7p92xc2.onNavigationEvent(this, code2, smallIconBitmap2 != null ? smallIconBitmap2 : "");
        try {
            Result.Companion companion3 = Result.Companion;
            Uri data2 = getIntent().getData();
            if (data2 != null) {
                int i7 = prefetchWithMultipleUrls + 15;
                setEngagementSignalsCallback = i7 % 128;
                int i8 = i7 % 2;
                bundleIAuthTabCallback2 = processTransparent.IAuthTabCallback(data2);
            }
            obj = Result.constructor-impl(bundleIAuthTabCallback2);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th2));
        }
        Bundle bundle2 = new Bundle();
        if (Result.onExtraCallback(obj)) {
            obj = bundle2;
        }
        bundleOnNavigationEvent2.putAll((Bundle) obj);
        IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -1237742244, 1237742255, zzaq.onNavigationEvent(), new Object[]{this, bundleOnNavigationEvent2}, zzaq.onNavigationEvent());
        IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), 1709011508, -1709011506, zzaq.onNavigationEvent(), new Object[]{this, bundleOnNavigationEvent2}, zzaq.onNavigationEvent());
        hExternalSyntheticLambda15.onNavigationEvent onnavigationevent = (hExternalSyntheticLambda15.onNavigationEvent) hexternalsyntheticlambda15;
        this.access100 = onnavigationevent.onNavigationEvent();
        ReactRootView reactRootView2 = this.newSessionWithExtras;
        if (reactRootView2 != null) {
            int i9 = prefetchWithMultipleUrls + 125;
            setEngagementSignalsCallback = i9 % 128;
            if (i9 % 2 != 0) {
                reactInstanceManagerOnNavigationEvent = onnavigationevent.onNavigationEvent();
                Object[] objArr5 = new Object[1];
                a(new char[]{60972, 60116, 50135, 61023, 26788, 40287, 51078, 7013, 58921, 24776}, Color.alpha(1), objArr5);
                obj2 = objArr5[0];
            } else {
                reactInstanceManagerOnNavigationEvent = onnavigationevent.onNavigationEvent();
                Object[] objArr6 = new Object[1];
                a(new char[]{60972, 60116, 50135, 61023, 26788, 40287, 51078, 7013, 58921, 24776}, Color.alpha(0), objArr6);
                obj2 = objArr6[0];
            }
            reactRootView2.IAuthTabCallback(reactInstanceManagerOnNavigationEvent, ((String) obj2).intern(), bundleOnNavigationEvent2);
        }
        areNotificationsEnabled().onExtraCallback.onExtraCallbackWithResult();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Bundle onWarmupCompleted(String str) throws Throwable {
        int i = 2 % 2;
        r8lambda3VLBDMfcFBq3y6wAYf87R7p92xc r8lambda3vlbdmfcfbq3y6wayf87r7p92xc = r8lambda3VLBDMfcFBq3y6wAYf87R7p92xc.onExtraCallbackWithResult;
        String smallIconBitmap = getSmallIconBitmap();
        if (smallIconBitmap == null) {
            int i2 = prefetchWithMultipleUrls + 93;
            setEngagementSignalsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            smallIconBitmap = "";
        }
        Bundle bundleOnNavigationEvent = r8lambda3vlbdmfcfbq3y6wayf87r7p92xc.onNavigationEvent(this, str, smallIconBitmap);
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), -1237742244, 1237742255, iOnNavigationEvent2, new Object[]{this, bundleOnNavigationEvent}, zzaq.onNavigationEvent());
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        int iOnNavigationEvent4 = zzaq.onNavigationEvent();
        IAuthTabCallback(iOnNavigationEvent3, zzaq.onNavigationEvent(), 1709011508, -1709011506, iOnNavigationEvent4, new Object[]{this, bundleOnNavigationEvent}, zzaq.onNavigationEvent());
        int i3 = prefetchWithMultipleUrls + 29;
        setEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 32 / 0;
        }
        return bundleOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r1
      0x003d: PHI (r1v5 o.onNativeAdLoaded) = (r1v4 o.onNativeAdLoaded), (r1v8 o.onNativeAdLoaded) binds: [B:8:0x003b, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asInterface(Object[] objArr) {
        onNativeAdLoaded onnativeadloadedOnExtraCallbackWithResult;
        ReactNativeContentOwner reactNativeContentOwner = (ReactSchemeActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 61;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            onnativeadloadedOnExtraCallbackWithResult = onNativeAdLoaded.Companion.onExtraCallbackWithResult(reactNativeContentOwner.getIntent().getExtras());
            int i3 = 91 / 0;
            if (onnativeadloadedOnExtraCallbackWithResult != null) {
                int i4 = prefetchWithMultipleUrls + 59;
                setEngagementSignalsCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    bundle.putBundle("miniApp", onnativeadloadedOnExtraCallbackWithResult.onExtraCallbackWithResult());
                    throw null;
                }
                bundle.putBundle("miniApp", onnativeadloadedOnExtraCallbackWithResult.onExtraCallbackWithResult());
            }
        } else {
            onnativeadloadedOnExtraCallbackWithResult = onNativeAdLoaded.Companion.onExtraCallbackWithResult(reactNativeContentOwner.getIntent().getExtras());
            if (onnativeadloadedOnExtraCallbackWithResult != null) {
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onExtraCallback(boolean z) {
        Integer numValueOf;
        Integer numValueOf2;
        ReactContext reactContextIAuthTabCallbackDefault;
        ReactContext reactContextIAuthTabCallbackDefault2;
        int i = 2 % 2;
        ReactSchemeActivity$loadBundle$$inlined$CoroutineExceptionHandler$1 reactSchemeActivity$loadBundle$$inlined$CoroutineExceptionHandler$1 = new ReactSchemeActivity$loadBundle$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.extraCallbackWithResult);
        String smallIconId = getSmallIconId();
        Object obj = null;
        if (z) {
            ReactRootView reactRootView = this.newSessionWithExtras;
            if (reactRootView != null) {
                int i2 = prefetchWithMultipleUrls + 29;
                setEngagementSignalsCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    reactRootView.extraCallback();
                    obj.hashCode();
                    throw null;
                }
                reactRootView.extraCallback();
            }
            cancelNotification().onExtraCallbackWithResult();
            auth authVar = auth.onNavigationEvent;
            ReactInstanceManager reactInstanceManager = this.access100;
            if (reactInstanceManager == null || (reactContextIAuthTabCallbackDefault2 = reactInstanceManager.IAuthTabCallbackDefault()) == null) {
                numValueOf = null;
            } else {
                int i3 = prefetchWithMultipleUrls + 59;
                setEngagementSignalsCallback = i3 % 128;
                int i4 = i3 % 2;
                numValueOf = Integer.valueOf(reactContextIAuthTabCallbackDefault2.hashCode());
            }
            auth.IAuthTabCallback(authVar, "ReactInstanceManager destroy reactContext when retry: " + numValueOf, (Map) null, (auth.onExtraCallbackWithResult) null, 6, (Object) null);
            if (writeTypedList().ITrustedWebActivityService_Parcel()) {
                int i5 = prefetchWithMultipleUrls + 43;
                setEngagementSignalsCallback = i5 % 128;
                int i6 = i5 % 2;
                ReactInstanceManager reactInstanceManager2 = this.access100;
                if (reactInstanceManager2 == null || (reactContextIAuthTabCallbackDefault = reactInstanceManager2.IAuthTabCallbackDefault()) == null) {
                    numValueOf2 = null;
                } else {
                    int i7 = prefetchWithMultipleUrls + 67;
                    setEngagementSignalsCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        numValueOf2 = Integer.valueOf(reactContextIAuthTabCallbackDefault.hashCode());
                        int i8 = 51 / 0;
                    } else {
                        numValueOf2 = Integer.valueOf(reactContextIAuthTabCallbackDefault.hashCode());
                    }
                }
                Objects.toString(numValueOf2);
            }
            ReactInstanceManager reactInstanceManager3 = this.access100;
            if (reactInstanceManager3 != null) {
                int i9 = setEngagementSignalsCallback + 67;
                prefetchWithMultipleUrls = i9 % 128;
                if (i9 % 2 == 0) {
                    reactInstanceManager3.onNavigationEvent(this);
                    obj.hashCode();
                    throw null;
                }
                reactInstanceManager3.onNavigationEvent(this);
            }
            ReactInstanceManager reactInstanceManager4 = this.access100;
            if (reactInstanceManager4 != null) {
                r8lambda1aZO4d0JI_OxlnkfFVIWwLUUFgo.onExtraCallbackWithResult(reactInstanceManager4);
                int i10 = prefetchWithMultipleUrls + 61;
                setEngagementSignalsCallback = i10 % 128;
                int i11 = i10 % 2;
            }
            this.access100 = null;
            this.access000 = null;
            this.extraCommand = null;
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), putChannelInfo.IAuthTabCallback().plus(reactSchemeActivity$loadBundle$$inlined$CoroutineExceptionHandler$1), (setRandomHost) null, new ReactSchemeActivity$loadBundle$1(this, smallIconId, z, null), 2, (Object) null);
    }

    public void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 41;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(true);
    }

    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 57;
        setEngagementSignalsCallback = i2 % 128;
        GraniteBrownfieldModule graniteBrownfieldModule = null;
        if (i2 % 2 != 0) {
            super/*im.toss.base.BaseActivity*/.onResume();
            onExtraCallbackWithResult((AppCompatActivity) this);
            IEngagementSignalsCallback();
            throw null;
        }
        super/*im.toss.base.BaseActivity*/.onResume();
        onExtraCallbackWithResult((AppCompatActivity) this);
        ReactContext reactContextIEngagementSignalsCallback = IEngagementSignalsCallback();
        if (reactContextIEngagementSignalsCallback != null) {
            int i3 = setEngagementSignalsCallback + 39;
            prefetchWithMultipleUrls = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), 224124945, -224124937, zzaq.onNavigationEvent(), new Object[]{this, reactContextIEngagementSignalsCallback}, zzaq.onNavigationEvent());
            int i5 = prefetchWithMultipleUrls + 81;
            setEngagementSignalsCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        TossModule tossModule = this.newSession;
        if (tossModule != null) {
            if (tossModule == null) {
                int i7 = setEngagementSignalsCallback + 59;
                prefetchWithMultipleUrls = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                tossModule = null;
            }
            tossModule.onActivityLayout();
        }
        GraniteBrownfieldModule graniteBrownfieldModule2 = this.readTypedObject;
        if (graniteBrownfieldModule2 != null) {
            if (graniteBrownfieldModule2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                graniteBrownfieldModule = graniteBrownfieldModule2;
            }
            graniteBrownfieldModule.onExtraCallbackWithResult();
        }
        MediaMetadataCompat();
    }

    public void onNewIntent(@NotNull Intent intent) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 7;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        super/*im.toss.base.BaseActivity*/.onNewIntent(intent);
        onWarmupCompleted(intent);
        MediaMetadataCompat();
        int i4 = setEngagementSignalsCallback + 111;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r1
      0x0023: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v10 java.lang.String) binds: [B:8:0x0021, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSaveInstanceState(@NotNull Bundle bundle) {
        String str;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 53;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bundle, "");
            str = this.onUnminimized;
            int i3 = 63 / 0;
            if (str != null) {
                bundle.putString("pendingRedirectUrl", str);
                int i4 = setEngagementSignalsCallback + 3;
                prefetchWithMultipleUrls = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(bundle, "");
            str = this.onUnminimized;
            if (str != null) {
            }
        }
        bundle.putBoolean("redirectHandled", this.prefetch);
        super/*im.toss.base.BaseActivity*/.onSaveInstanceState(bundle);
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 71;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback((AppCompatActivity) this);
            super/*im.toss.base.BaseActivity*/.onPause();
        } else {
            onExtraCallback((AppCompatActivity) this);
            super/*im.toss.base.BaseActivity*/.onPause();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean newSessionWithExtras() throws Throwable {
        String queryParameter;
        int i = 2 % 2;
        Uri data = getIntent().getData();
        if (data != null) {
            int i2 = prefetchWithMultipleUrls + 35;
            setEngagementSignalsCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{2158, 38722, 53944, 2077, 5425, 13574, 55009, 45886, 'B', 7509, 56907, 48069, 6397, 1529, 50746, 41579, 4395, 3092}, ViewConfiguration.getScrollDefaultDelay() >> 16, objArr);
            queryParameter = data.getQueryParameter(((String) objArr[0]).intern());
            if (queryParameter == null) {
                int i4 = setEngagementSignalsCallback + 3;
                prefetchWithMultipleUrls = i4 % 128;
                int i5 = i4 % 2;
                queryParameter = "false";
            }
        }
        return Boolean.parseBoolean(queryParameter);
    }

    public void invokeDefaultOnBackPressed() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 43;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        ReactBackPressHandler reactBackPressHandler = this.onRelationshipValidationResult;
        if (reactBackPressHandler != null) {
            reactBackPressHandler.onWarmupCompleted();
            int i4 = prefetchWithMultipleUrls + 113;
            setEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void onActivityResult(int i, int i2, @Nullable Intent intent) throws Throwable {
        int i3 = 2 % 2;
        int i4 = prefetchWithMultipleUrls + 95;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        super/*im.toss.base.BaseActivity*/.onActivityResult(i, i2, intent);
        IPostMessageServiceDefault().IAuthTabCallback(this, i, i2, intent);
        ReactHost activeNotifications = getActiveNotifications();
        if (activeNotifications != null) {
            int i6 = setEngagementSignalsCallback + 41;
            prefetchWithMultipleUrls = i6 % 128;
            int i7 = i6 % 2;
            activeNotifications.IAuthTabCallback(this, i, i2, intent);
        }
    }

    public void onDestroy() throws Throwable {
        MaxFullscreenAdImplExternalSyntheticLambda7 maxFullscreenAdImplExternalSyntheticLambda7;
        int i = 2 % 2;
        IconCompatParcelizer();
        IPostMessageService().IAuthTabCallback(this);
        this.ICustomTabsCallback.onWarmupCompleted();
        this.ICustomTabsCallback.onNavigationEvent();
        ReactInstanceEventListener reactInstanceEventListener = this.ICustomTabsCallbackStub;
        if (reactInstanceEventListener != null) {
            int i2 = prefetchWithMultipleUrls + 121;
            setEngagementSignalsCallback = i2 % 128;
            int i3 = i2 % 2;
            ReactHost reactHostOnExtraCallback = onVerticalScrollEvent().onExtraCallback();
            if (reactHostOnExtraCallback != null) {
                int i4 = setEngagementSignalsCallback + 37;
                prefetchWithMultipleUrls = i4 % 128;
                int i5 = i4 % 2;
                reactHostOnExtraCallback.onExtraCallbackWithResult(reactInstanceEventListener);
            }
            this.ICustomTabsCallbackStub = null;
        }
        DefaultLifecycleObserver defaultLifecycleObserver = this.ICustomTabsCallbackDefault;
        if (defaultLifecycleObserver != null) {
            getLifecycle().onExtraCallbackWithResult(defaultLifecycleObserver);
            this.ICustomTabsCallbackDefault = null;
        }
        MaxFullscreenAdImplExternalSyntheticLambda7 typedObject = readTypedObject();
        MaxFullscreenAdImplExternalSyntheticLambda7 maxFullscreenAdImplExternalSyntheticLambda72 = typedObject instanceof MaxFullscreenAdImplExternalSyntheticLambda7 ? typedObject : null;
        if (maxFullscreenAdImplExternalSyntheticLambda72 != null) {
            maxFullscreenAdImplExternalSyntheticLambda72.onExtraCallback((String) IntentParams.IAuthTabCallback(-1609524478, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{ITrustedWebActivityServiceDefault()}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 1609524478));
        }
        MaxFullscreenAdImplExternalSyntheticLambda7 typedObject2 = readTypedObject();
        if (typedObject2 instanceof MaxFullscreenAdImplExternalSyntheticLambda7) {
            maxFullscreenAdImplExternalSyntheticLambda7 = typedObject2;
            int i6 = setEngagementSignalsCallback + 119;
            prefetchWithMultipleUrls = i6 % 128;
            int i7 = i6 % 2;
        } else {
            maxFullscreenAdImplExternalSyntheticLambda7 = null;
        }
        if (maxFullscreenAdImplExternalSyntheticLambda7 != null) {
            int i8 = prefetchWithMultipleUrls + 107;
            setEngagementSignalsCallback = i8 % 128;
            if (i8 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(new char[]{60972, 60116, 50135, 61023, 26788, 40287, 51078, 7013, 58921, 24776}, TextUtils.getOffsetAfter("", 0), objArr);
                maxFullscreenAdImplExternalSyntheticLambda7.onExtraCallback(((String) objArr[0]).intern());
            } else {
                Object[] objArr2 = new Object[1];
                a(new char[]{60972, 60116, 50135, 61023, 26788, 40287, 51078, 7013, 58921, 24776}, TextUtils.getOffsetAfter("", 0), objArr2);
                maxFullscreenAdImplExternalSyntheticLambda7.onExtraCallback(((String) objArr2[0]).intern());
            }
        }
        TossModule tossModule = this.newSession;
        if (tossModule != null) {
            int i9 = prefetchWithMultipleUrls + 7;
            int i10 = i9 % 128;
            setEngagementSignalsCallback = i10;
            int i11 = i9 % 2;
            if (tossModule == null) {
                int i12 = i10 + 77;
                prefetchWithMultipleUrls = i12 % 128;
                int i13 = i12 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                tossModule = null;
            }
            tossModule.readTypedObject();
        }
        ITrustedWebActivityCallbackStubProxy();
        this.onMessageChannelReady.onExtraCallback();
        IPostMessageService_Parcel().clear();
        this.access100 = null;
        this.access000 = null;
        this.extraCommand = null;
        this.onRelationshipValidationResult = null;
        this.ICustomTabsCallbackStubProxy = false;
        r8lambdaypXGS8DWeWXzbqeVeqKYlXwASo.onExtraCallbackWithResult.IAuthTabCallback();
        super/*im.toss.base.BaseActivity*/.onDestroy();
        onExtraCallbackWithResult(this.onPostMessage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        r8lambdamcqktAFDi57MiJ6JrSi643BXOs.onNavigationEvent.onWarmupCompleted(onVerticalScrollEvent().onExtraCallback(), this, z, new ReactSchemeActivity$.ExternalSyntheticLambda25(this));
        int i2 = prefetchWithMultipleUrls + 11;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 22 / 0;
        }
    }

    private static final Unit onActivityLayout(ReactSchemeActivity reactSchemeActivity) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 89;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        reactSchemeActivity.onNavigationEvent((AppCompatActivity) reactSchemeActivity);
        Unit unit = Unit.INSTANCE;
        int i4 = prefetchWithMultipleUrls + 63;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean bg_() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 119;
        int i3 = i2 % 128;
        prefetchWithMultipleUrls = i3;
        if (i2 % 2 != 0) {
            ReactBackPressHandler reactBackPressHandler = this.onRelationshipValidationResult;
            if (reactBackPressHandler != null) {
                int i4 = i3 + 71;
                setEngagementSignalsCallback = i4 % 128;
                int i5 = i4 % 2;
                if (reactBackPressHandler.onWarmupCompleted(getActiveNotifications())) {
                    int i6 = prefetchWithMultipleUrls + 29;
                    setEngagementSignalsCallback = i6 % 128;
                    return i6 % 2 == 0;
                }
            }
            return super/*im.toss.base.BaseActivity*/.bg_();
        }
        throw null;
    }

    private final Function1<String, Unit> ComponentActivity() {
        int i = 2 % 2;
        final WeakReference weakReference = new WeakReference(this);
        Function1<String, Unit> function1 = new Function1() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 91;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = ReactSchemeActivity.IAuthTabCallback(weakReference, (String) obj);
                int i5 = onExtraCallback + 59;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 58 / 0;
                }
                return unitIAuthTabCallback;
            }
        };
        int i2 = prefetchWithMultipleUrls + 101;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return function1;
        }
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        String str = (String) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 19;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
            commonModule_setLeftEdgeTouchEnabled.onExtraCallback("React Native Error");
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str);
            Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, (Function1) null, 0, (Object) null)};
            int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        } else {
            Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
            commonModule_setLeftEdgeTouchEnabled.onExtraCallback("React Native Error");
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str);
            Object[] objArr3 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, (Function1) null, 1, (Object) null)};
            int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr3, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(WeakReference weakReference, final String str) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 125;
        setEngagementSignalsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ReactNativeContentOwner reactNativeContentOwner = (ReactSchemeActivity) weakReference.get();
        if (reactNativeContentOwner != null && (!reactNativeContentOwner.isFinishing())) {
            int i3 = prefetchWithMultipleUrls + 31;
            setEngagementSignalsCallback = i3 % 128;
            if (i3 % 2 != 0) {
                reactNativeContentOwner.isDestroyed();
                throw null;
            }
            if (!reactNativeContentOwner.isDestroyed()) {
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(reactNativeContentOwner, new Function1() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda23
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj2) {
                        int i4 = 2 % 2;
                        int i5 = IAuthTabCallback + 87;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        Object[] objArr = {str, (CommonModule_setLeftEdgeTouchEnabled) obj2};
                        if (i6 == 0) {
                            return (Unit) ReactSchemeActivity.IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), 516482077, -516482060, zzaq.onNavigationEvent(), objArr, zzaq.onNavigationEvent());
                        }
                        throw null;
                    }
                });
            }
        }
        Unit unit = Unit.INSTANCE;
        int i4 = prefetchWithMultipleUrls + 13;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final Function1<String, Unit> ResultReceiverMyResultReceiver() {
        int i = 2 % 2;
        final WeakReference weakReference = new WeakReference(this);
        Function1<String, Unit> function1 = new Function1() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda24
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 45;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = ReactSchemeActivity.onExtraCallback(weakReference, (String) obj);
                int i5 = onExtraCallbackWithResult + 119;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnExtraCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        };
        int i2 = prefetchWithMultipleUrls + 37;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        return function1;
    }

    private static final Unit onNavigationEvent(WeakReference weakReference, String str) {
        int i = 2 % 2;
        ReactNativeContentOwner reactNativeContentOwner = (ReactSchemeActivity) weakReference.get();
        if (reactNativeContentOwner != null && !reactNativeContentOwner.isFinishing()) {
            int i2 = setEngagementSignalsCallback + 51;
            prefetchWithMultipleUrls = i2 % 128;
            if (i2 % 2 == 0) {
                reactNativeContentOwner.isDestroyed();
                throw null;
            }
            if (!reactNativeContentOwner.isDestroyed()) {
                int i3 = prefetchWithMultipleUrls + 11;
                setEngagementSignalsCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    onJsBridgeReady.onExtraCallbackWithResult(reactNativeContentOwner, str);
                    throw null;
                }
                onJsBridgeReady.onExtraCallbackWithResult(reactNativeContentOwner, str);
            }
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ void IAuthTabCallback(ReactSchemeActivity reactSchemeActivity, String str, Throwable th, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = setEngagementSignalsCallback + 79;
        int i4 = i3 % 128;
        prefetchWithMultipleUrls = i4;
        int i5 = i3 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showErrorDialog");
        }
        int i6 = i4 + 71;
        setEngagementSignalsCallback = i6 % 128;
        int i7 = i6 % 2;
        if ((i & 1) != 0) {
            Object[] objArr = new Object[1];
            a(new char[]{7704, 24596, 29857, 7789, 57954, 48728, 28922, 14462, 5655, 59931, 30815}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            str = ((String) objArr[0]).intern();
        }
        if ((i & 2) != 0) {
            int i8 = setEngagementSignalsCallback + 79;
            prefetchWithMultipleUrls = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
            th = null;
        }
        reactSchemeActivity.onExtraCallbackWithResult(str, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(String str, Throwable th) throws Throwable {
        int i = 2 % 2;
        Object obj = null;
        if (((Boolean) IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -1300210493, 1300210493, zzaq.onNavigationEvent(), new Object[]{this, str, th}, zzaq.onNavigationEvent())).booleanValue()) {
            int i2 = setEngagementSignalsCallback + 13;
            prefetchWithMultipleUrls = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Map mapOnExtraCallback = access8100.onExtraCallback();
        Object[] objArr = new Object[1];
        a(new char[]{52534, 16606, 2077, 52548, 49827, 48349, 3148, 15078, 50489, 51912}, TextUtils.indexOf("", ""), objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        a(new char[]{25040, 15818, 12155, 24995, 49073, 59748, 11043, 28489, 27101, 47063}, (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
        mapOnExtraCallback.put(((String) objArr2[0]).intern(), ITrustedWebActivityServiceDefault().IAuthTabCallbackStub());
        mapOnExtraCallback.put("service", (String) IntentParams.IAuthTabCallback(-1609524478, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{ITrustedWebActivityServiceDefault()}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 1609524478));
        mapOnExtraCallback.put("groupId", getSmallIconBitmap());
        if (th != null) {
            int i3 = prefetchWithMultipleUrls + 115;
            setEngagementSignalsCallback = i3 % 128;
            mapOnExtraCallback.put("stackTrace", i3 % 2 != 0 ? RawQueries.onNavigationEvent(th, 0, 0, 2, (Object) null) : RawQueries.onNavigationEvent(th, 0, 0, 3, (Object) null));
        }
        Unit unit = Unit.INSTANCE;
        convertFloatArrayToByteArray.onExtraCallbackWithResult("ReactNativeErrorDialogShown", "react native error dialog shown to user", th, access8100.onExtraCallbackWithResult(mapOnExtraCallback));
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new Function1() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda16
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj2) {
                int i4 = 2 % 2;
                int i5 = IAuthTabCallback + 77;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    Object[] objArr3 = {this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj2};
                    throw null;
                }
                Object[] objArr4 = {this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj2};
                Unit unit2 = (Unit) ReactSchemeActivity.IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), 2000676165, -2000676142, zzaq.onNavigationEvent(), objArr4, zzaq.onNavigationEvent());
                int i6 = IAuthTabCallback + 99;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return unit2;
            }
        });
    }

    private static final Unit onExtraCallbackWithResult(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 41;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            dialogInterface.dismiss();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit2 = Unit.INSTANCE;
        int i3 = prefetchWithMultipleUrls + 105;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final void IAuthTabCallback(ReactSchemeActivity reactSchemeActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 75;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        reactSchemeActivity.finish();
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        int i5 = prefetchWithMultipleUrls + 33;
        setEngagementSignalsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, im.toss.rn.toss.core.ReactSchemeActivity] */
    private static /* synthetic */ Object asBinder(Object[] objArr) {
        final ?? r0 = (ReactSchemeActivity) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(r0.getString(R.string.rn___473c448391));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(r0.getString(R.string.rn___9aeaa96689));
        String string = r0.getString(im.toss.uikit.R.string.uikit_confirm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda3
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 21;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = ReactSchemeActivity.onWarmupCompleted((DialogInterface) obj);
                int i5 = onExtraCallbackWithResult + 21;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnWarmupCompleted;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onNavigationEvent(new DialogInterface.OnDismissListener() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 63;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                ReactSchemeActivity.onNavigationEvent(this.f$0, dialogInterface);
                int i5 = onExtraCallbackWithResult + 25;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = prefetchWithMultipleUrls + 49;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        String strIAuthTabCallback;
        String str;
        String strOnNavigationEvent;
        BaseActivity baseActivity = (ReactSchemeActivity) objArr[0];
        String str2 = (String) objArr[1];
        Throwable th = (Throwable) objArr[2];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 85;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        if (baseActivity.isFinishing() || baseActivity.isDestroyed() || (strIAuthTabCallback = r8lambdaCZNtgwoBwteGhg33zHpfNgJw0GI.IAuthTabCallback(baseActivity.notifyNotificationWithChannel())) == null) {
            return false;
        }
        try {
            baseActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(strIAuthTabCallback)));
            SessionTrackerb.onExtraCallbackWithResult(resumeForClick.asBinder, strIAuthTabCallback, SessionTrackerb.onExtraCallbackWithResult.WEB_FALLBACK, (String) null, baseActivity.ITrustedWebActivityServiceDefault().IAuthTabCallbackStub(), 4, (Object) null);
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Map mapOnExtraCallback = access8100.onExtraCallback();
            Object[] objArr2 = new Object[1];
            a(new char[]{52534, 16606, 2077, 52548, 49827, 48349, 3148, 15078, 50489, 51912}, KeyEvent.getMaxKeyCode() >> 16, objArr2);
            mapOnExtraCallback.put(((String) objArr2[0]).intern(), str2);
            Object[] objArr3 = new Object[1];
            a(new char[]{25040, 15818, 12155, 24995, 49073, 59748, 11043, 28489, 27101, 47063}, 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
            mapOnExtraCallback.put(((String) objArr3[0]).intern(), baseActivity.ITrustedWebActivityServiceDefault().IAuthTabCallbackStub());
            mapOnExtraCallback.put("service", (String) IntentParams.IAuthTabCallback(-1609524478, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{baseActivity.ITrustedWebActivityServiceDefault()}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 1609524478));
            mapOnExtraCallback.put("groupId", baseActivity.getSmallIconBitmap());
            if (th != null) {
                int i4 = prefetchWithMultipleUrls + 69;
                setEngagementSignalsCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    str = "stackTrace";
                    strOnNavigationEvent = RawQueries.onNavigationEvent(th, 0, 1, 3, (Object) null);
                } else {
                    str = "stackTrace";
                    strOnNavigationEvent = RawQueries.onNavigationEvent(th, 0, 0, 3, (Object) null);
                }
                mapOnExtraCallback.put(str, strOnNavigationEvent);
            }
            Unit unit = Unit.INSTANCE;
            ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, "rn_scheme_web_fallback", "react native error dialog replaced with web fallback", access8100.onExtraCallbackWithResult(mapOnExtraCallback), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            baseActivity.finish();
            return true;
        } catch (Exception e) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr4 = new Object[1];
            a(new char[]{52534, 16606, 2077, 52548, 49827, 48349, 3148, 15078, 50489, 51912}, ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr4);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), str2);
            Object[] objArr5 = new Object[1];
            a(new char[]{25040, 15818, 12155, 24995, 49073, 59748, 11043, 28489, 27101, 47063}, Color.argb(0, 0, 0, 0), objArr5);
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray2, "rn_scheme_web_fallback", "web fallback startActivity failed; falling back to error dialog", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), baseActivity.ITrustedWebActivityServiceDefault().IAuthTabCallbackStub()), getWrite.IAuthTabCallback("service", (String) IntentParams.IAuthTabCallback(-1609524478, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{baseActivity.ITrustedWebActivityServiceDefault()}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 1609524478)), getWrite.IAuthTabCallback("cause", RawQueries.onNavigationEvent(e, 0, 0, 3, (Object) null))}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            return false;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) throws Throwable {
        ReactSchemeActivity reactSchemeActivity = (ReactSchemeActivity) objArr[0];
        String str = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        Object obj = objArr[3];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 103;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createImportLazyBundleLoadErrorContext");
        }
        if ((iIntValue & 1) != 0) {
            str = null;
        }
        Map<String, Object> mapOnExtraCallbackWithResult = reactSchemeActivity.onExtraCallbackWithResult(str);
        int i3 = setEngagementSignalsCallback + 99;
        prefetchWithMultipleUrls = i3 % 128;
        if (i3 % 2 != 0) {
            return mapOnExtraCallbackWithResult;
        }
        throw null;
    }

    public final Map<String, Object> onExtraCallbackWithResult(@Nullable String str) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 57;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Map mapOnExtraCallback = access8100.onExtraCallback();
        mapOnExtraCallback.put("groupId", getSmallIconBitmap());
        Object[] objArr = new Object[1];
        a(new char[]{25040, 15818, 12155, 24995, 49073, 59748, 11043, 28489, 27101, 47063}, Process.myTid() >> 22, objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), ITrustedWebActivityServiceDefault().IAuthTabCallbackStub());
        if (str == null) {
            Object[] objArr2 = {ITrustedWebActivityServiceDefault()};
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            str = (String) IntentParams.IAuthTabCallback(-1609524478, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), objArr2, iIAuthTabCallback, zziea.IAuthTabCallback(), 1609524478);
            int i4 = setEngagementSignalsCallback + 93;
            prefetchWithMultipleUrls = i4 % 128;
            int i5 = i4 % 2;
        }
        mapOnExtraCallback.put("failedBundleName", str);
        return access8100.onExtraCallbackWithResult(mapOnExtraCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void IAuthTabCallbackStub(@Nullable Throwable th) {
        int i = 2 % 2;
        runOnUiThread(new ReactSchemeActivity$.ExternalSyntheticLambda1(this, th));
        int i2 = setEngagementSignalsCallback + 85;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onWarmupCompleted(ReactSchemeActivity reactSchemeActivity, Throwable th) throws Throwable {
        int i = 2 % 2;
        if (reactSchemeActivity.getLifecycle().IAuthTabCallback() != TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.DESTROYED && !reactSchemeActivity.isFinishing()) {
            int i2 = prefetchWithMultipleUrls + 25;
            setEngagementSignalsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                reactSchemeActivity.isDestroyed();
                throw null;
            }
            if (!reactSchemeActivity.isDestroyed()) {
                reactSchemeActivity.areNotificationsEnabled().onExtraCallback.onExtraCallbackWithResult();
                logicVerifyID typedObject = reactSchemeActivity.readTypedObject();
                MaxFullscreenAdImplExternalSyntheticLambda7 maxFullscreenAdImplExternalSyntheticLambda7 = typedObject instanceof MaxFullscreenAdImplExternalSyntheticLambda7 ? (MaxFullscreenAdImplExternalSyntheticLambda7) typedObject : null;
                if (maxFullscreenAdImplExternalSyntheticLambda7 != null) {
                    maxFullscreenAdImplExternalSyntheticLambda7.onNavigationEvent((String) IntentParams.IAuthTabCallback(-1609524478, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{reactSchemeActivity.ITrustedWebActivityServiceDefault()}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 1609524478), ReactSchemeActivityKt.onExtraCallback(th, "importLazyFailed"));
                }
                reactSchemeActivity.onExtraCallbackWithResult("importLazy", th);
                return;
            }
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "GraniteBadTokenGuard", "skip importLazy error dialog; activity destroyed", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("guardKind", "importLazy.reactScheme"), getWrite.IAuthTabCallback("lifecycleState", reactSchemeActivity.getLifecycle().IAuthTabCallback().name()), getWrite.IAuthTabCallback("isFinishing", String.valueOf(reactSchemeActivity.isFinishing())), getWrite.IAuthTabCallback("isDestroyed", String.valueOf(reactSchemeActivity.isDestroyed())), getWrite.IAuthTabCallback("service", (String) IntentParams.IAuthTabCallback(-1609524478, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{reactSchemeActivity.ITrustedWebActivityServiceDefault()}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 1609524478))}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        int i3 = prefetchWithMultipleUrls + 11;
        setEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void RemoteActionCompatParcelizer() throws Throwable {
        MaxFullscreenAdImplExternalSyntheticLambda7 maxFullscreenAdImplExternalSyntheticLambda7;
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 59;
        prefetchWithMultipleUrls = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getLifecycle().IAuthTabCallback();
            TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.DESTROYED;
            obj.hashCode();
            throw null;
        }
        if (getLifecycle().IAuthTabCallback() != TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.DESTROYED) {
            int i3 = setEngagementSignalsCallback + 19;
            prefetchWithMultipleUrls = i3 % 128;
            int i4 = i3 % 2;
            if (!isFinishing() && !isDestroyed()) {
                int i5 = prefetchWithMultipleUrls + 49;
                setEngagementSignalsCallback = i5 % 128;
                int i6 = i5 % 2;
                if (RnProcessRuntime.onWarmupCompleted.IAuthTabCallback()) {
                    int i7 = setEngagementSignalsCallback + 23;
                    prefetchWithMultipleUrls = i7 % 128;
                    int i8 = i7 % 2;
                    areNotificationsEnabled().onExtraCallback.onExtraCallbackWithResult();
                    IAuthTabCallback(this, "reactHostUnexpectedDestroy.remote", null, 2, null);
                    return;
                }
                MaxFullscreenAdImplExternalSyntheticLambda7 typedObject = readTypedObject();
                if (typedObject instanceof MaxFullscreenAdImplExternalSyntheticLambda7) {
                    int i9 = prefetchWithMultipleUrls + 77;
                    setEngagementSignalsCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        maxFullscreenAdImplExternalSyntheticLambda7 = typedObject;
                        int i10 = 72 / 0;
                    } else {
                        maxFullscreenAdImplExternalSyntheticLambda7 = typedObject;
                    }
                } else {
                    maxFullscreenAdImplExternalSyntheticLambda7 = null;
                }
                if (maxFullscreenAdImplExternalSyntheticLambda7 != null) {
                    maxFullscreenAdImplExternalSyntheticLambda7.onNavigationEvent((String) IntentParams.IAuthTabCallback(-1609524478, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{ITrustedWebActivityServiceDefault()}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 1609524478), "reactHostUnexpectedlyDestroyed");
                }
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr = new Object[1];
                a(new char[]{25040, 15818, 12155, 24995, 49073, 59748, 11043, 28489, 27101, 47063}, ViewConfiguration.getScrollDefaultDelay() >> 16, objArr);
                ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, "ReactHostUnexpectedDestroy", "react host destroyed unexpectedly (fatal JS exception suspected)", (Throwable) null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), ITrustedWebActivityServiceDefault().IAuthTabCallbackStub()), getWrite.IAuthTabCallback("service", (String) IntentParams.IAuthTabCallback(-1609524478, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{ITrustedWebActivityServiceDefault()}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 1609524478)), getWrite.IAuthTabCallback("groupId", getSmallIconBitmap())}), 4, (Object) null);
                areNotificationsEnabled().onExtraCallback.onExtraCallbackWithResult();
                IAuthTabCallback(this, "reactHostUnexpectedDestroy", null, 2, null);
                return;
            }
        }
        if (RnProcessRuntime.onWarmupCompleted.IAuthTabCallback()) {
            return;
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "GraniteBadTokenGuard", "skip react host unexpected destroy; activity destroyed", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("guardKind", "unexpectedDestroy.reactScheme"), getWrite.IAuthTabCallback("lifecycleState", getLifecycle().IAuthTabCallback().name()), getWrite.IAuthTabCallback("isFinishing", String.valueOf(isFinishing())), getWrite.IAuthTabCallback("isDestroyed", String.valueOf(isDestroyed())), getWrite.IAuthTabCallback("service", (String) IntentParams.IAuthTabCallback(-1609524478, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{ITrustedWebActivityServiceDefault()}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 1609524478))}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        int i11 = setEngagementSignalsCallback + 87;
        prefetchWithMultipleUrls = i11 % 128;
        if (i11 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public List<WeakReference<startApp>> IPostMessageService_Parcel() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 21;
        prefetchWithMultipleUrls = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        List<WeakReference<startApp>> list = this.requestPostMessageChannel;
        int i4 = i2 + 81;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (r3 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        r1 = im.toss.rn.toss.core.ReactSchemeActivity.setEngagementSignalsCallback + 107;
        im.toss.rn.toss.core.ReactSchemeActivity.prefetchWithMultipleUrls = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r3 = im.toss.rn.toss.core.ReactSchemeActivity.prefetchWithMultipleUrls + 115;
        im.toss.rn.toss.core.ReactSchemeActivity.setEngagementSignalsCallback = r3 % 128;
        r3 = r3 % 2;
        r0 = (o.startApp) r1.get();
     */
    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public startApp access200() {
        WeakReference weakReference;
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 29;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            weakReference = (WeakReference) CollectionsKt.lastOrNull(IPostMessageService_Parcel());
            int i3 = 93 / 0;
        } else {
            weakReference = (WeakReference) CollectionsKt.lastOrNull(IPostMessageService_Parcel());
        }
    }

    @Override // im.toss.rn.toss.core.common.wrapper.TossReactContentOwner
    public ReactContext IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 105;
        prefetchWithMultipleUrls = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onVerticalScrollEvent().onExtraCallback();
            obj.hashCode();
            throw null;
        }
        ReactHost reactHostOnExtraCallback = onVerticalScrollEvent().onExtraCallback();
        if (reactHostOnExtraCallback != null) {
            return reactHostOnExtraCallback.onExtraCallbackWithResult();
        }
        int i3 = setEngagementSignalsCallback + 83;
        prefetchWithMultipleUrls = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public getByteBuffer<Boolean> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 113;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        getByteBuffer<Boolean> getbytebufferIAuthTabCallback = ITrustedWebActivityServiceStub().IAuthTabCallback();
        int i4 = setEngagementSignalsCallback + 25;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return getbytebufferIAuthTabCallback;
    }

    public MaxFullscreenAdImpl access100() {
        MaxFullscreenAdImplb maxFullscreenAdImplb;
        MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 33;
        setEngagementSignalsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            hExternalSyntheticLambda15 hexternalsyntheticlambda15 = this.access000;
            hExternalSyntheticLambda15.onExtraCallbackWithResult onextracallbackwithresult = hexternalsyntheticlambda15 instanceof hExternalSyntheticLambda15.onExtraCallbackWithResult ? (hExternalSyntheticLambda15.onExtraCallbackWithResult) hexternalsyntheticlambda15 : null;
            if (onextracallbackwithresult != null && (onextracallbackwithresultOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted()) != null) {
                int i3 = prefetchWithMultipleUrls + 49;
                setEngagementSignalsCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return onextracallbackwithresultOnWarmupCompleted;
                }
                obj.hashCode();
                throw null;
            }
            MaxFullscreenAdImplb typedObject = readTypedObject();
            if (typedObject instanceof MaxFullscreenAdImplb) {
                int i4 = setEngagementSignalsCallback + 61;
                prefetchWithMultipleUrls = i4 % 128;
                maxFullscreenAdImplb = typedObject;
                if (i4 % 2 == 0) {
                    throw null;
                }
            } else {
                maxFullscreenAdImplb = null;
            }
            if (maxFullscreenAdImplb != null) {
                return maxFullscreenAdImplb.onWarmupCompleted();
            }
            return null;
        }
        boolean z = this.access000 instanceof hExternalSyntheticLambda15.onExtraCallbackWithResult;
        throw null;
    }

    public r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos IAuthTabCallbackDefault() {
        hExternalSyntheticLambda15.onNavigationEvent onnavigationevent;
        int i = 2 % 2;
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnNavigationEvent = this.onTransact;
        if (r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnNavigationEvent == null) {
            hExternalSyntheticLambda15 hexternalsyntheticlambda15 = this.access000;
            hExternalSyntheticLambda15.onExtraCallbackWithResult onextracallbackwithresult = hexternalsyntheticlambda15 instanceof hExternalSyntheticLambda15.onExtraCallbackWithResult ? (hExternalSyntheticLambda15.onExtraCallbackWithResult) hexternalsyntheticlambda15 : null;
            if (onextracallbackwithresult != null) {
                int i2 = prefetchWithMultipleUrls + 7;
                setEngagementSignalsCallback = i2 % 128;
                int i3 = i2 % 2;
                r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnNavigationEvent = onextracallbackwithresult.onNavigationEvent();
            } else {
                int i4 = prefetchWithMultipleUrls + 25;
                setEngagementSignalsCallback = i4 % 128;
                int i5 = i4 % 2;
                r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnNavigationEvent = null;
            }
            if (r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnNavigationEvent == null) {
                int i6 = setEngagementSignalsCallback + 77;
                int i7 = i6 % 128;
                prefetchWithMultipleUrls = i7;
                if (i6 % 2 == 0) {
                    boolean z = this.access000 instanceof hExternalSyntheticLambda15.onNavigationEvent;
                    throw null;
                }
                hExternalSyntheticLambda15 hexternalsyntheticlambda152 = this.access000;
                if (hexternalsyntheticlambda152 instanceof hExternalSyntheticLambda15.onNavigationEvent) {
                    int i8 = i7 + 49;
                    setEngagementSignalsCallback = i8 % 128;
                    int i9 = i8 % 2;
                    onnavigationevent = (hExternalSyntheticLambda15.onNavigationEvent) hexternalsyntheticlambda152;
                } else {
                    onnavigationevent = null;
                }
                if (onnavigationevent == null) {
                    return null;
                }
                int i10 = i7 + 77;
                setEngagementSignalsCallback = i10 % 128;
                int i11 = i10 % 2;
                return MaxAdViewImplb.Companion.onNavigationEvent(ITrustedWebActivityServiceDefault().onTransact(), ITrustedWebActivityServiceDefault().onNavigationEvent());
            }
        }
        return r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnNavigationEvent;
    }

    public MaxFullscreenAdImpl asInterface() {
        MaxFullscreenAdImplb maxFullscreenAdImplb;
        int i = 2 % 2;
        hExternalSyntheticLambda15 hexternalsyntheticlambda15 = this.access000;
        Object obj = null;
        hExternalSyntheticLambda15.onExtraCallbackWithResult onextracallbackwithresult = hexternalsyntheticlambda15 instanceof hExternalSyntheticLambda15.onExtraCallbackWithResult ? (hExternalSyntheticLambda15.onExtraCallbackWithResult) hexternalsyntheticlambda15 : null;
        if (onextracallbackwithresult != null) {
            int i2 = setEngagementSignalsCallback + 55;
            prefetchWithMultipleUrls = i2 % 128;
            if (i2 % 2 != 0) {
                MaxFullscreenAdImpl.onExtraCallbackWithResult onExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult();
                if (onExtraCallbackWithResult != null) {
                    return onExtraCallbackWithResult;
                }
            } else {
                onextracallbackwithresult.onExtraCallbackWithResult();
                obj.hashCode();
                throw null;
            }
        }
        MaxFullscreenAdImplb typedObject = readTypedObject();
        if (!(!(typedObject instanceof MaxFullscreenAdImplb))) {
            maxFullscreenAdImplb = typedObject;
            int i3 = prefetchWithMultipleUrls + 69;
            setEngagementSignalsCallback = i3 % 128;
            int i4 = i3 % 2;
        } else {
            maxFullscreenAdImplb = null;
        }
        if (maxFullscreenAdImplb == null) {
            return null;
        }
        int i5 = prefetchWithMultipleUrls + 123;
        setEngagementSignalsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return maxFullscreenAdImplb.IAuthTabCallbackStub();
        }
        maxFullscreenAdImplb.IAuthTabCallbackStub();
        obj.hashCode();
        throw null;
    }

    public r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos onTransact() {
        int i = 2 % 2;
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yosIAuthTabCallback = this.asBinder;
        if (r8lambdadtqrzfihm2ghoddvkfg5vm2yosIAuthTabCallback == null) {
            int i2 = setEngagementSignalsCallback + 13;
            int i3 = i2 % 128;
            prefetchWithMultipleUrls = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                boolean z = this.access000 instanceof hExternalSyntheticLambda15.onExtraCallbackWithResult;
                obj.hashCode();
                throw null;
            }
            hExternalSyntheticLambda15 hexternalsyntheticlambda15 = this.access000;
            hExternalSyntheticLambda15.onExtraCallbackWithResult onextracallbackwithresult = hexternalsyntheticlambda15 instanceof hExternalSyntheticLambda15.onExtraCallbackWithResult ? (hExternalSyntheticLambda15.onExtraCallbackWithResult) hexternalsyntheticlambda15 : null;
            if (onextracallbackwithresult != null) {
                int i4 = i3 + 33;
                setEngagementSignalsCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    onextracallbackwithresult.IAuthTabCallback();
                    obj.hashCode();
                    throw null;
                }
                r8lambdadtqrzfihm2ghoddvkfg5vm2yosIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            } else {
                r8lambdadtqrzfihm2ghoddvkfg5vm2yosIAuthTabCallback = null;
            }
            if (r8lambdadtqrzfihm2ghoddvkfg5vm2yosIAuthTabCallback == null) {
                int i5 = prefetchWithMultipleUrls;
                int i6 = i5 + 61;
                setEngagementSignalsCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    boolean z2 = this.access000 instanceof hExternalSyntheticLambda15.onNavigationEvent;
                    throw null;
                }
                hExternalSyntheticLambda15 hexternalsyntheticlambda152 = this.access000;
                hExternalSyntheticLambda15.onNavigationEvent onnavigationevent = hexternalsyntheticlambda152 instanceof hExternalSyntheticLambda15.onNavigationEvent ? (hExternalSyntheticLambda15.onNavigationEvent) hexternalsyntheticlambda152 : null;
                if (onnavigationevent == null) {
                    return null;
                }
                int i7 = i5 + 17;
                setEngagementSignalsCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    return onnavigationevent.IAuthTabCallback();
                }
                int i8 = 15 / 0;
                return onnavigationevent.IAuthTabCallback();
            }
        }
        return r8lambdadtqrzfihm2ghoddvkfg5vm2yosIAuthTabCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onExtraCallbackWithResult(@NotNull String[] strArr, int i, @Nullable getJSON_KEY_CHALLENGEcredentials_play_services_auth_release getjson_key_challengecredentials_play_services_auth_release) {
        int i2 = 2 % 2;
        int i3 = prefetchWithMultipleUrls + 47;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(strArr, "");
        if (getjson_key_challengecredentials_play_services_auth_release != null) {
            this.onActivityLayout.add(getjson_key_challengecredentials_play_services_auth_release);
            super/*android.app.Activity*/.requestPermissions(strArr, i);
        } else {
            int i5 = setEngagementSignalsCallback + 125;
            prefetchWithMultipleUrls = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }
    }

    public void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        int i2 = 2 % 2;
        int i3 = setEngagementSignalsCallback + 117;
        prefetchWithMultipleUrls = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(strArr, "");
            Intrinsics.checkNotNullParameter(iArr, "");
            super/*im.toss.base.BaseActivity*/.onRequestPermissionsResult(i, strArr, iArr);
            this.onActivityLayout.iterator();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        super/*im.toss.base.BaseActivity*/.onRequestPermissionsResult(i, strArr, iArr);
        Iterator<T> it = this.onActivityLayout.iterator();
        while (!(!it.hasNext())) {
            ((getJSON_KEY_CHALLENGEcredentials_play_services_auth_release) it.next()).onRequestPermissionsResult(i, strArr, iArr);
            int i4 = setEngagementSignalsCallback + 109;
            prefetchWithMultipleUrls = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 2;
            }
        }
        this.onActivityLayout = new ArrayList<>();
    }

    public boolean getAllowTraversingChildFragment() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 25;
        int i3 = i2 % 128;
        setEngagementSignalsCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.IAuthTabCallbackStub;
        int i5 = i3 + 83;
        prefetchWithMultipleUrls = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean getDiscoversCandidatesOnDraw() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls;
        int i3 = i2 + 19;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.IAuthTabCallbackStubProxy;
        int i5 = i2 + 89;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls;
        int i3 = i2 + 97;
        setEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.postMessage;
            int i4 = 94 / 0;
        } else {
            str = this.postMessage;
        }
        int i5 = i2 + 117;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public Map<String, Object> getScreenMetaData() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 117;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("screenName", RnTrackableScreenNameKt.onNavigationEvent(ITrustedWebActivityServiceDefault().IAuthTabCallbackStub())), getWrite.IAuthTabCallback("company", ITrustedWebActivityServiceDefault().onNavigationEvent())});
        }
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("screenName", RnTrackableScreenNameKt.onNavigationEvent(ITrustedWebActivityServiceDefault().IAuthTabCallbackStub()));
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("company", ITrustedWebActivityServiceDefault().onNavigationEvent());
        Pair[] pairArr = new Pair[4];
        pairArr[0] = pairIAuthTabCallback;
        pairArr[1] = pairIAuthTabCallback2;
        return access8100.onWarmupCompleted(pairArr);
    }

    @Override // im.toss.rn.toss.core.observability.ReactNativeScreenServiceHost
    public String IEngagementSignalsCallbackStubProxy() {
        int i = 2 % 2;
        Object[] objArr = {ITrustedWebActivityServiceDefault()};
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        String str = (String) IntentParams.IAuthTabCallback(-1609524478, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), objArr, iIAuthTabCallback, zziea.IAuthTabCallback(), 1609524478);
        if (str.length() <= 0) {
            return null;
        }
        int i2 = prefetchWithMultipleUrls;
        int i3 = i2 + 1;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 35;
        setEngagementSignalsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 81 / 0;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View asBinder() {
        int i = 2 % 2;
        DefaultLoadingView defaultLoadingView = new DefaultLoadingView(this);
        int i2 = prefetchWithMultipleUrls + 43;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return defaultLoadingView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onExtraCallback(@NotNull Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        DefaultErrorView defaultErrorView = new DefaultErrorView(this, th);
        int i2 = setEngagementSignalsCallback + 65;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        return defaultErrorView;
    }

    private static final getSignForPKCS7NoContents MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        TossExoPlayerProvider tossExoPlayerProvider = new TossExoPlayerProvider();
        int i2 = setEngagementSignalsCallback + 51;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        return tossExoPlayerProvider;
    }

    private static final readFileToByteArray onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        d1aa d1aaVar = new d1aa(context);
        int i2 = setEngagementSignalsCallback + 37;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 85 / 0;
        }
        return d1aaVar;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        ReactNativeContentOwner reactNativeContentOwner = (ReactSchemeActivity) objArr[0];
        int i = 2 % 2;
        CertToolkitMgrRevokeReason certToolkitMgrRevokeReason = CertToolkitMgrRevokeReason.onExtraCallback;
        if (certToolkitMgrRevokeReason.IAuthTabCallback() == null) {
            certToolkitMgrRevokeReason.onExtraCallbackWithResult(new d1a(reactNativeContentOwner.getApplicationContext()));
        }
        isValidCertNum isvalidcertnum = isValidCertNum.onExtraCallbackWithResult;
        if (!isvalidcertnum.onExtraCallback().contains("toss")) {
            isvalidcertnum.onExtraCallback("toss", new Function0() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 63;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    transV2ExportCert transv2exportcertValidateRelationship = ReactSchemeActivity.validateRelationship();
                    int i5 = onWarmupCompleted + 89;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        return transv2exportcertValidateRelationship;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
            isvalidcertnum.onExtraCallback("toss");
            int i2 = setEngagementSignalsCallback + 95;
            prefetchWithMultipleUrls = i2 % 128;
            int i3 = i2 % 2;
        }
        getSignForPKCS7AppCertAndVIDR getsignforpkcs7appcertandvidr = getSignForPKCS7AppCertAndVIDR.onExtraCallbackWithResult;
        if (!getsignforpkcs7appcertandvidr.onExtraCallbackWithResult().contains("toss-exoplayer")) {
            getsignforpkcs7appcertandvidr.IAuthTabCallback("toss-exoplayer", new Function0() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda6
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = IAuthTabCallback + 19;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    getSignForPKCS7NoContents getsignforpkcs7nocontentsICustomTabsServiceStub = ReactSchemeActivity.ICustomTabsServiceStub();
                    if (i6 != 0) {
                        int i7 = 8 / 0;
                    }
                    return getsignforpkcs7nocontentsICustomTabsServiceStub;
                }
            });
            getsignforpkcs7appcertandvidr.onNavigationEvent("toss-exoplayer");
        }
        decryptForPrivateKey decryptforprivatekey = decryptForPrivateKey.onNavigationEvent;
        if (!decryptforprivatekey.IAuthTabCallback()) {
            decryptforprivatekey.onExtraCallbackWithResult(new Function1() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda7
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = IAuthTabCallback + 105;
                    onExtraCallback = i5 % 128;
                    Context context = (Context) obj;
                    if (i5 % 2 == 0) {
                        return ReactSchemeActivity.onNavigationEvent(context);
                    }
                    ReactSchemeActivity.onNavigationEvent(context);
                    throw null;
                }
            });
        }
        setShadowDrawableRight setshadowdrawableright = setShadowDrawableRight.onExtraCallbackWithResult;
        if (setshadowdrawableright.onWarmupCompleted() != null) {
            return null;
        }
        int i4 = setEngagementSignalsCallback + 97;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            setshadowdrawableright.onExtraCallback(TossAppServiceWebViewProvider.Companion.onNavigationEvent());
            return null;
        }
        setshadowdrawableright.onExtraCallback(TossAppServiceWebViewProvider.Companion.onNavigationEvent());
        int i5 = 45 / 0;
        return null;
    }

    public logicVerifyID IAuthTabCallbackStub() throws Throwable {
        int i = 2 % 2;
        String baseUrl = hExternalSyntheticLambda4.Companion.IAuthTabCallback(ITrustedWebActivityCallbackStub().onExtraCallbackWithResult().getCode(), ITrustedWebActivityServiceDefault().onNavigationEvent()).getBaseUrl();
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos.onWarmupCompleted onwarmupcompleted = r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos.Companion;
        String strOnNavigationEvent = ITrustedWebActivityServiceDefault().onNavigationEvent();
        Object[] objArr = new Object[1];
        a(new char[]{60972, 60116, 50135, 61023, 26788, 40287, 51078, 7013, 58921, 24776}, TextUtils.indexOf("", "", 0, 0), objArr);
        this.onTransact = r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos.onWarmupCompleted.onExtraCallback(onwarmupcompleted, ((String) objArr[0]).intern(), baseUrl, strOnNavigationEvent, (String) null, 8, (Object) null);
        Object[] objArr2 = {ITrustedWebActivityServiceDefault()};
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        this.asBinder = r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos.onWarmupCompleted.onExtraCallback(onwarmupcompleted, (String) IntentParams.IAuthTabCallback(-1609524478, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), objArr2, iIAuthTabCallback, zziea.IAuthTabCallback(), 1609524478), baseUrl, ITrustedWebActivityServiceDefault().onNavigationEvent(), (String) null, 8, (Object) null);
        MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6IAuthTabCallback = MaxFullscreenAdImplExternalSyntheticLambda6.Companion.IAuthTabCallback(new Function1() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 87;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                ReactSchemeActivity reactSchemeActivity = this.f$0;
                MaxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent onnavigationevent = (MaxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent) obj;
                if (i4 == 0) {
                    return ReactSchemeActivity.IAuthTabCallback(reactSchemeActivity, onnavigationevent);
                }
                ReactSchemeActivity.IAuthTabCallback(reactSchemeActivity, onnavigationevent);
                throw null;
            }
        });
        int i2 = setEngagementSignalsCallback + 89;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        return maxFullscreenAdImplExternalSyntheticLambda6IAuthTabCallback;
    }

    private static final Unit onWarmupCompleted(ReactSchemeActivity reactSchemeActivity, MaxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent onnavigationevent) throws Throwable {
        boolean z;
        int i = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        onnavigationevent.IAuthTabCallbackDefault((String) IntentParams.IAuthTabCallback(-1609524478, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{reactSchemeActivity.ITrustedWebActivityServiceDefault()}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 1609524478));
        Object[] objArr = new Object[1];
        a(new char[]{60972, 60116, 50135, 61023, 26788, 40287, 51078, 7013, 58921, 24776}, ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr);
        onnavigationevent.onExtraCallback(reactSchemeActivity.ITrustedWebActivityServiceDefault().onNavigationEvent());
        onnavigationevent.onWarmupCompleted(reactSchemeActivity.ITrustedWebActivityServiceDefault().onExtraCallback());
        onnavigationevent.IAuthTabCallback(Long.valueOf(reactSchemeActivity.ITrustedWebActivityServiceDefault().IAuthTabCallback()));
        if (reactSchemeActivity.ITrustedWebActivityServiceDefault().IAuthTabCallback() == 0) {
            int i2 = prefetchWithMultipleUrls + 45;
            setEngagementSignalsCallback = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        onnavigationevent.onWarmupCompleted(z);
        onnavigationevent.onExtraCallbackWithResult(reactSchemeActivity.IEngagementSignalsCallback_Parcel().IAuthTabCallbackStub());
        isLoading.onExtraCallback onextracallback = isLoading.Companion;
        isLoading.onNavigationEvent onnavigationeventOnExtraCallback = onextracallback.onExtraCallback().onExtraCallback(reactSchemeActivity.ICustomTabsService_Parcel().updateVisuals());
        String smallIconBitmap = reactSchemeActivity.getSmallIconBitmap();
        if (smallIconBitmap == null) {
            int i4 = prefetchWithMultipleUrls + 9;
            setEngagementSignalsCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 98 / 0;
            }
            smallIconBitmap = "";
        }
        onnavigationevent.asBinder(onnavigationeventOnExtraCallback.onNavigationEvent(smallIconBitmap).IAuthTabCallback(reactSchemeActivity.getSmallIconId()).onWarmupCompleted(reactSchemeActivity.ITrustedWebActivityServiceDefault().onNavigationEvent()).onExtraCallbackWithResult("rn84").onWarmupCompleted().IAuthTabCallback((String) IntentParams.IAuthTabCallback(-1609524478, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{reactSchemeActivity.ITrustedWebActivityServiceDefault()}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 1609524478)).onExtraCallbackWithResult());
        isLoading.onNavigationEvent onnavigationeventOnExtraCallback2 = onextracallback.onExtraCallback().onExtraCallback(reactSchemeActivity.ICustomTabsService_Parcel().updateVisuals());
        String smallIconBitmap2 = reactSchemeActivity.getSmallIconBitmap();
        if (smallIconBitmap2 == null) {
            int i6 = prefetchWithMultipleUrls + 45;
            setEngagementSignalsCallback = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str = smallIconBitmap2;
        }
        isLoading isloadingOnWarmupCompleted = onnavigationeventOnExtraCallback2.onNavigationEvent(str).IAuthTabCallback(reactSchemeActivity.getSmallIconId()).onWarmupCompleted(reactSchemeActivity.ITrustedWebActivityServiceDefault().onNavigationEvent()).onExtraCallbackWithResult("rn84").onWarmupCompleted();
        Object[] objArr2 = new Object[1];
        a(new char[]{60972, 60116, 50135, 61023, 26788, 40287, 51078, 7013, 58921, 24776}, ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr2);
        onnavigationevent.onWarmupCompleted(isloadingOnWarmupCompleted.IAuthTabCallback(((String) objArr2[0]).intern()).onExtraCallbackWithResult());
        onnavigationevent.IAuthTabCallback(reactSchemeActivity.ITrustedWebActivityServiceStubProxy());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[PHI: r9
      0x0077: PHI (r9v2 android.view.WindowManager$LayoutParams) = (r9v1 android.view.WindowManager$LayoutParams), (r9v4 android.view.WindowManager$LayoutParams) binds: [B:20:0x0075, B:17:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(Window window) {
        boolean z;
        WindowManager.LayoutParams attributes;
        int i = 2 % 2;
        RepeatableSpec.onExtraCallbackWithResult(window, false);
        int i2 = 1;
        if ((getResources().getConfiguration().uiMode & 48) == 32) {
            z = true;
        } else {
            int i3 = prefetchWithMultipleUrls + 45;
            setEngagementSignalsCallback = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            int i6 = setEngagementSignalsCallback + 47;
            prefetchWithMultipleUrls = i6 % 128;
            int i7 = i6 % 2;
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(true);
        }
        window.setStatusBarColor(0);
        window.setNavigationBarColor(i5 < 29 ? Color.argb(128, 27, 27, 27) : 0);
        SuspendAnimationKtExternalSyntheticLambda0 suspendAnimationKtExternalSyntheticLambda0 = new SuspendAnimationKtExternalSyntheticLambda0(window, window.getDecorView());
        boolean z2 = !z;
        suspendAnimationKtExternalSyntheticLambda0.onNavigationEvent(z2);
        suspendAnimationKtExternalSyntheticLambda0.IAuthTabCallback(z2);
        if (i5 >= 28) {
            int i8 = prefetchWithMultipleUrls + 101;
            setEngagementSignalsCallback = i8 % 128;
            if (i8 % 2 != 0) {
                attributes = window.getAttributes();
                if (i5 >= 28) {
                    i2 = 3;
                }
            } else {
                attributes = window.getAttributes();
                if (i5 >= 30) {
                }
            }
            extraCallbackWithResult.onExtraCallbackWithResult(attributes, i2);
        }
    }

    public final void ITrustedWebActivityCallbackDefault() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 115;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        this.extraCallback = true;
        int i4 = setEngagementSignalsCallback + 69;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IconCompatParcelizer() throws NoWhenBranchMatchedException {
        boolean z;
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 51;
        prefetchWithMultipleUrls = i2 % 128;
        ReactContext reactContextOnExtraCallbackWithResult = null;
        if (i2 % 2 == 0) {
            reactContextOnExtraCallbackWithResult.hashCode();
            throw null;
        }
        if (this.extraCallback) {
            return;
        }
        ReactHost reactHostOnExtraCallback = onVerticalScrollEvent().onExtraCallback();
        RnImportLazyOutcomeTrace rnImportLazyOutcomeTrace = RnImportLazyOutcomeTrace.onExtraCallback;
        String strResultReceiver = ResultReceiver();
        boolean z2 = reactHostOnExtraCallback != null;
        if (reactHostOnExtraCallback != null) {
            reactContextOnExtraCallbackWithResult = reactHostOnExtraCallback.onExtraCallbackWithResult();
            int i3 = prefetchWithMultipleUrls + 35;
            setEngagementSignalsCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        if (reactContextOnExtraCallbackWithResult == null) {
            int i5 = setEngagementSignalsCallback + 101;
            prefetchWithMultipleUrls = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        } else {
            z = true;
        }
        rnImportLazyOutcomeTrace.onExtraCallbackWithResult("scheme_activity", strResultReceiver, z2, z, this.onMessageChannelReady, this.extraCallback, null, SystemClock.uptimeMillis() - this.IAuthTabCallback_Parcel);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final String ResultReceiver() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        hExternalSyntheticLambda15 hexternalsyntheticlambda15 = this.access000;
        if (hexternalsyntheticlambda15 == null) {
            return "not_loaded";
        }
        if (!(!(hexternalsyntheticlambda15 instanceof hExternalSyntheticLambda15.onExtraCallbackWithResult))) {
            return "fetched";
        }
        if (hexternalsyntheticlambda15 instanceof hExternalSyntheticLambda15.onNavigationEvent) {
            int i2 = prefetchWithMultipleUrls + 3;
            setEngagementSignalsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return "metro_connected";
            }
            throw null;
        }
        if (!(hexternalsyntheticlambda15 instanceof hExternalSyntheticLambda15.onExtraCallback)) {
            if (!(hexternalsyntheticlambda15 instanceof hExternalSyntheticLambda15.onWarmupCompleted)) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = prefetchWithMultipleUrls + 39;
            setEngagementSignalsCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return "incorrect_version";
            }
            throw null;
        }
        int i4 = prefetchWithMultipleUrls + 117;
        int i5 = i4 % 128;
        setEngagementSignalsCallback = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 11;
        prefetchWithMultipleUrls = i7 % 128;
        int i8 = i7 % 2;
        return "error";
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final void MediaDescriptionCompat() {
        int i = 2 % 2;
        Object[] objArr = {ITrustedWebActivityServiceDefault()};
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        if (Intrinsics.areEqual((TdsSkeletonV1View.IAuthTabCallback) IntentParams.IAuthTabCallback(1655834121, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), objArr, iIAuthTabCallback, zziea.IAuthTabCallback(), -1655834120), TdsSkeletonV1View.IAuthTabCallback.IAuthTabCallbackStub.onWarmupCompleted)) {
            return;
        }
        int i2 = prefetchWithMultipleUrls + 55;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        TdsSkeletonV1View tdsSkeletonV1View = areNotificationsEnabled().onExtraCallback;
        Object[] objArr2 = {ITrustedWebActivityServiceDefault()};
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        tdsSkeletonV1View.setSkeletonType((TdsSkeletonV1View.IAuthTabCallback) IntentParams.IAuthTabCallback(1655834121, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), objArr2, iIAuthTabCallback2, zziea.IAuthTabCallback(), -1655834120));
        TdsSkeletonV1View tdsSkeletonV1View2 = areNotificationsEnabled().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsSkeletonV1View2, "");
        tdsSkeletonV1View2.setVisibility(0);
        int i4 = prefetchWithMultipleUrls + 65;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 3;
        }
    }

    private final WindowInsetsCompat onWarmupCompleted(WindowInsetsCompat windowInsetsCompat, int i) {
        int i2 = 2 % 2;
        WindowInsetsCompat.onWarmupCompleted onwarmupcompleted = new WindowInsetsCompat.onWarmupCompleted(windowInsetsCompat);
        int i3 = prefetchWithMultipleUrls + 97;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        while (i != 0) {
            int i5 = setEngagementSignalsCallback + 23;
            prefetchWithMultipleUrls = i5 % 128;
            int i6 = i5 % 2;
            int i7 = (-i) & i;
            CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompat.onWarmupCompleted(i7);
            Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
            CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnNavigationEvent = CameraControllerExternalSyntheticLambda0.onNavigationEvent(0, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted, 0, 0);
            Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnNavigationEvent, "");
            onwarmupcompleted.onNavigationEvent(i7, cameraControllerExternalSyntheticLambda0OnNavigationEvent);
            i ^= i7;
        }
        WindowInsetsCompat windowInsetsCompatOnExtraCallbackWithResult = onwarmupcompleted.onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatOnExtraCallbackWithResult, "");
        return windowInsetsCompatOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return (Unit) IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), 516482077, -516482060, iOnNavigationEvent2, new Object[]{str, commonModule_setLeftEdgeTouchEnabled}, zzaq.onNavigationEvent());
    }

    public static /* synthetic */ deserializeUriCollection setEngagementSignalsCallback() {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return (deserializeUriCollection) IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), 1755775081, -1755775072, iOnNavigationEvent2, new Object[0], zzaq.onNavigationEvent());
    }

    public static /* synthetic */ Unit asInterface(ReactSchemeActivity reactSchemeActivity) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return (Unit) IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), 1518309752, -1518309730, iOnNavigationEvent2, new Object[]{reactSchemeActivity}, zzaq.onNavigationEvent());
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(ReactSchemeActivity reactSchemeActivity) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return (Unit) IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), 1995778109, -1995778084, iOnNavigationEvent2, new Object[]{reactSchemeActivity}, zzaq.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallback(ReactSchemeActivity reactSchemeActivity, Throwable th) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return (Unit) IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), -1813870027, 1813870037, iOnNavigationEvent2, new Object[]{reactSchemeActivity, th}, zzaq.onNavigationEvent());
    }

    public static /* synthetic */ Unit IAuthTabCallback(ReactSchemeActivity reactSchemeActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return (Unit) IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), 2000676165, -2000676142, iOnNavigationEvent2, new Object[]{reactSchemeActivity, commonModule_setLeftEdgeTouchEnabled}, zzaq.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return (Unit) IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), 580810741, -580810737, iOnNavigationEvent2, new Object[]{th}, zzaq.onNavigationEvent());
    }

    public static final /* synthetic */ void onNavigationEvent(ReactSchemeActivity reactSchemeActivity, hExternalSyntheticLambda15 hexternalsyntheticlambda15, boolean z) throws Throwable {
        Object[] objArr = {reactSchemeActivity, hexternalsyntheticlambda15, Boolean.valueOf(z)};
        IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -1087241799, 1087241820, zzaq.onNavigationEvent(), objArr, zzaq.onNavigationEvent());
    }

    public static final /* synthetic */ IntentParams access100(ReactSchemeActivity reactSchemeActivity) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return (IntentParams) IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), -596671277, 596671297, iOnNavigationEvent2, new Object[]{reactSchemeActivity}, zzaq.onNavigationEvent());
    }

    public static final /* synthetic */ DefaultLifecycleObserver IAuthTabCallback_Parcel(ReactSchemeActivity reactSchemeActivity) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return (DefaultLifecycleObserver) IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), 983171110, -983171096, iOnNavigationEvent2, new Object[]{reactSchemeActivity}, zzaq.onNavigationEvent());
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(ReactSchemeActivity reactSchemeActivity, boolean z) throws Throwable {
        Object[] objArr = {reactSchemeActivity, Boolean.valueOf(z)};
        IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -812057808, 812057823, zzaq.onNavigationEvent(), objArr, zzaq.onNavigationEvent());
    }

    public static final /* synthetic */ void IAuthTabCallback(ReactSchemeActivity reactSchemeActivity, ReactBundleLoaderV2 reactBundleLoaderV2) throws Throwable {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), 1826116504, -1826116480, iOnNavigationEvent2, new Object[]{reactSchemeActivity, reactBundleLoaderV2}, zzaq.onNavigationEvent());
    }

    public static final /* synthetic */ Function1 extraCallbackWithResult(ReactSchemeActivity reactSchemeActivity) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return (Function1) IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), 2016493034, -2016493008, iOnNavigationEvent2, new Object[]{reactSchemeActivity}, zzaq.onNavigationEvent());
    }

    public static final /* synthetic */ void extraCallback(ReactSchemeActivity reactSchemeActivity) throws Throwable {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), 2055730810, -2055730805, iOnNavigationEvent2, new Object[]{reactSchemeActivity}, zzaq.onNavigationEvent());
    }

    public static /* synthetic */ Map onExtraCallback(ReactSchemeActivity reactSchemeActivity, String str, int i, Object obj) {
        Object[] objArr = {reactSchemeActivity, str, Integer.valueOf(i), obj};
        return (Map) IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), 1321755818, -1321755802, zzaq.onNavigationEvent(), objArr, zzaq.onNavigationEvent());
    }

    private final boolean onExtraCallback(String str, Throwable th) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return ((Boolean) IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), -1300210493, 1300210493, iOnNavigationEvent2, new Object[]{this, str, th}, zzaq.onNavigationEvent())).booleanValue();
    }

    private final void onExtraCallback(Bundle bundle) throws Throwable {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), 1709011508, -1709011506, iOnNavigationEvent2, new Object[]{this, bundle}, zzaq.onNavigationEvent());
    }

    private final void onWarmupCompleted(Bundle bundle) throws Throwable {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), -1237742244, 1237742255, iOnNavigationEvent2, new Object[]{this, bundle}, zzaq.onNavigationEvent());
    }

    private final void AudioAttributesImplApi21Parcelizer() throws Throwable {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), -815221310, 815221322, iOnNavigationEvent2, new Object[]{this}, zzaq.onNavigationEvent());
    }

    private static final transV2ExportCert write() {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return (transV2ExportCert) IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), -1287450706, 1287450712, iOnNavigationEvent2, new Object[0], zzaq.onNavigationEvent());
    }

    private final void AudioAttributesImplBaseParcelizer() throws Throwable {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), -1083169233, 1083169234, iOnNavigationEvent2, new Object[]{this}, zzaq.onNavigationEvent());
    }

    private final void PlaybackStateCompatCustomAction() throws Throwable {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), 646384624, -646384611, iOnNavigationEvent2, new Object[]{this}, zzaq.onNavigationEvent());
    }

    private static final Unit ICustomTabsCallbackStubProxy(ReactSchemeActivity reactSchemeActivity) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return (Unit) IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), -550762446, 550762449, iOnNavigationEvent2, new Object[]{reactSchemeActivity}, zzaq.onNavigationEvent());
    }

    private final void onExtraCallback(ReactContext reactContext) throws Throwable {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), 224124945, -224124937, iOnNavigationEvent2, new Object[]{this, reactContext}, zzaq.onNavigationEvent());
    }

    private static final Unit IAuthTabCallback(ReactSchemeActivity reactSchemeActivity, String str) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return (Unit) IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), -501488371, 501488390, iOnNavigationEvent2, new Object[]{reactSchemeActivity, str}, zzaq.onNavigationEvent());
    }

    private static final Unit onWarmupCompleted(String str, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return (Unit) IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), -1964098233, 1964098251, iOnNavigationEvent2, new Object[]{str, commonModule_setLeftEdgeTouchEnabled}, zzaq.onNavigationEvent());
    }

    private static final Unit onExtraCallbackWithResult(ReactSchemeActivity reactSchemeActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return (Unit) IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), -1213235002, 1213235009, iOnNavigationEvent2, new Object[]{reactSchemeActivity, commonModule_setLeftEdgeTouchEnabled}, zzaq.onNavigationEvent());
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 23;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = setEngagementSignalsCallback + 3;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 7;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = prefetchWithMultipleUrls + 73;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
    }

    static void IPostMessageServiceStubProxy() {
        requestPostMessageChannelWithExtras = -5388194796036753132L;
    }
}
