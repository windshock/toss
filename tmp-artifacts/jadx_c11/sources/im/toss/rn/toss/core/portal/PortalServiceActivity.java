package im.toss.rn.toss.core.portal;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactInstanceEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.internal.ads.zzgc;
import com.google.gson.JsonElement;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import com.teleport.host.PortalHostView;
import com.teleport.host.PortalReactRootView;
import im.toss.base.BaseActivity;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.features.transfer.home.model.TransferShareSummary;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import im.toss.observability.lcp.RnNavigationTypeProvider;
import im.toss.observability.lcp.RnRuntimeVariantProvider;
import im.toss.rn.toss.core.R;
import im.toss.rn.toss.core.ReactSchemeActivity;
import im.toss.rn.toss.core.TossModule;
import im.toss.rn.toss.core.common.handler.ReactBackPressHandler;
import im.toss.rn.toss.core.common.util.ReactHostVisibleStateObserver;
import im.toss.rn.toss.core.common.util.TossReactLifecycleEventEmitter;
import im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner;
import im.toss.rn.toss.core.observability.ReactNativeRouteLcpSessionManager;
import im.toss.rn.toss.core.observability.ReactNativeScreenServiceHost;
import im.toss.rn.toss.core.observability.RnPhaseObserver;
import im.toss.rn.toss.core.observability.RnTrackableScreenNameKt;
import im.toss.rn.toss.core.portal.PortalServiceActivity$;
import im.toss.rn.toss.core.util.RnAppVersion;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.TdsSkeletonV1View;
import im.toss.utils.RxUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraControllerExternalSyntheticLambda0;
import o.ConstraintsSizeResolverExternalSyntheticLambda0;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.IPostMessageServiceStubProxy;
import o.ITrustedWebActivityCallbackStubProxy;
import o.JsonReaderUnknownNumberParsing;
import o.MaxAdViewImplb;
import o.MaxFullscreenAdImpl;
import o.MaxFullscreenAdImplExternalSyntheticLambda9;
import o.RepeatableSpec;
import o.ResourceResolutionException;
import o.SessionTrackerb;
import o.SuspendAnimationKtExternalSyntheticLambda0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.WrappedCompositionsetContent1ExternalSyntheticLambda0;
import o.access13800;
import o.access8100;
import o.calculateMaxTextSize;
import o.convertToPlayAuthPasskeyJsonRequest;
import o.deserializeUriCollection;
import o.extraCallbackWithResult;
import o.getAdValue;
import o.getBillingPeriod;
import o.getByteBuffer;
import o.getIconPaddingLeft;
import o.getItemDelegate;
import o.getJSON_KEY_ATTESTATIONcredentials_play_services_auth_release;
import o.getJSON_KEY_CHALLENGEcredentials_play_services_auth_release;
import o.getStartTimeMillis;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.onAdViewAdCollapsed;
import o.onAppOpenAdDisplayFailed;
import o.onAppOpenAdHidden;
import o.onAppOpenAdLoadFailed;
import o.onInterstitialAdDisplayFailed;
import o.r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos;
import o.r8lambdaHDAe14RP_YfkbgNStt68qt10Iow;
import o.r8lambdaHMNJeel4W_tBmaYEYabnCYaHtU;
import o.r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE;
import o.r8lambdaWpgOHjJLRzNufWqCTifVD_hSjV8;
import o.r8lambdarKY_76dijV4LvyApAwXzgCxxoY;
import o.r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs;
import o.r8lambdayDPuBF8wSyjklQIWh1vEa1fyo;
import o.resumeForClick;
import o.setMessageBytes;
import o.setRandomHost;
import o.startApp;
import o.zzad;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class PortalServiceActivity extends Hilt_PortalServiceActivity implements getJSON_KEY_ATTESTATIONcredentials_play_services_auth_release, convertToPlayAuthPasskeyJsonRequest, WrappedCompositionsetContent1ExternalSyntheticLambda0, TossReactWebViewContentOwner, ReactNativeScreenServiceHost, RnNavigationTypeProvider, RnRuntimeVariantProvider {
    public static final onExtraCallback Companion;
    private static long prefetchWithMultipleUrls;
    private static char[] requestPostMessageChannelWithExtras;
    private static int validateRelationship;
    private Integer IAuthTabCallbackDefault;
    private Integer IAuthTabCallbackStub;
    private String ICustomTabsCallbackDefault;
    private boolean ICustomTabsCallbackStubProxy;
    private onAppOpenAdHidden ICustomTabsCallback_Parcel;
    private String ICustomTabsService;
    private boolean access000;
    private int access100;

    @Inject
    public r8lambdaHDAe14RP_YfkbgNStt68qt10Iow distributionGroupManager;

    @Inject
    public zzad environments;
    private boolean extraCommand;
    private ViewTreeObserver.OnPreDrawListener getInterfaceDescriptor;
    private boolean isEngagementSignalsApiAvailable;

    @Inject
    public getStartTimeMillis localeManager;
    private String mayLaunchUrl;
    private TossModule newAuthTabSession;
    private boolean newSession;
    private Integer newSessionWithExtras;
    private ReactBackPressHandler onActivityLayout;
    private PortalReactRootView onPostMessage;
    private boolean onUnminimized;

    @Inject
    public onInterstitialAdDisplayFailed portalRuntime;
    private MaxFullscreenAdImplExternalSyntheticLambda9 prefetch;

    @Inject
    public calculateMaxTextSize reactMessageHandlerPoolSet;

    @Inject
    public ReactNativeRouteLcpSessionManager reactNativeRouteLcpSessions;
    private TossReactLifecycleEventEmitter readTypedObject;

    @Inject
    public RnPhaseObserver rnPhaseObserver;

    @Inject
    public r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE tossReactMessageHandlerManager;

    @Inject
    public getBillingPeriod tossRegionManager;

    @Inject
    public ConstraintsSizeResolverExternalSyntheticLambda0 unique;
    private PortalHostView writeTypedObject;
    private static final byte[] $$a = {32, 13, -54, -47};
    private static final int $$b = 155;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsServiceStub = 1;
    private static int setEngagementSignalsCallback = 0;
    private static int requestPostMessageChannel = 1;
    private final long IAuthTabCallback_Parcel = SystemClock.elapsedRealtime();
    private final deserializeUriCollection asInterface = new deserializeUriCollection();
    private final Lazy onTransact = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new asInterface(this));
    private final Runnable postMessage = new Runnable() { // from class: im.toss.rn.toss.core.portal.PortalServiceActivity$$ExternalSyntheticLambda1
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            PortalServiceActivity.onExtraCallbackWithResult(this.f$0);
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private final Lazy extraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.portal.PortalServiceActivity$$ExternalSyntheticLambda2
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke() {
            onAppOpenAdDisplayFailed onappopenaddisplayfailed;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = {this.f$0};
                int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
                onappopenaddisplayfailed = (onAppOpenAdDisplayFailed) PortalServiceActivity.onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1006136401, objArr, -1006136387, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
                int i3 = 56 / 0;
            } else {
                Object[] objArr2 = {this.f$0};
                int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
                onappopenaddisplayfailed = (onAppOpenAdDisplayFailed) PortalServiceActivity.onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1006136401, objArr2, -1006136387, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
            }
            int i4 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onappopenaddisplayfailed;
        }
    });
    private final onAdViewAdCollapsed ICustomTabsCallback = new onAdViewAdCollapsed();
    private final Lazy onActivityResized = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.portal.PortalServiceActivity$$ExternalSyntheticLambda3
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = {this.f$0};
                int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
                throw null;
            }
            Object[] objArr2 = {this.f$0};
            int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            ReactHostVisibleStateObserver reactHostVisibleStateObserver = (ReactHostVisibleStateObserver) PortalServiceActivity.onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -8243766, objArr2, 8243779, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
            int i3 = onExtraCallbackWithResult + 113;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 6 / 0;
            }
            return reactHostVisibleStateObserver;
        }
    });
    private ArrayList<getJSON_KEY_CHALLENGEcredentials_play_services_auth_release> extraCallbackWithResult = new ArrayList<>();
    private final List<WeakReference<startApp>> receiveFile = new ArrayList();
    private final Lazy onMessageChannelReady = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.portal.PortalServiceActivity$$ExternalSyntheticLambda4
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnExtraCallback = PortalServiceActivity.onExtraCallback(this.f$0);
            int i4 = onNavigationEvent + 125;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnExtraCallback;
        }
    });
    private final IAuthTabCallback onMinimized = new IAuthTabCallback();
    private final boolean asBinder = true;
    private final boolean IAuthTabCallbackStubProxy = true;
    private final String onRelationshipValidationResult = "hard";
    private final String ICustomTabsCallbackStub = "mono";

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, short s) {
        int i;
        int i2 = b + 4;
        int i3 = (s * 4) + 97;
        byte[] bArr = $$a;
        int i4 = b2 * 3;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i5 = i2;
            int i6 = i4;
            int i7 = 0;
            int i8 = (-i2) + i6;
            i = i7;
            int i9 = i5;
            i3 = i8;
            i2 = i9;
            bArr2[i] = (byte) i3;
            int i10 = i2 + 1;
            if (i == i4) {
                return new String(bArr2, 0);
            }
            int i11 = i3;
            i5 = i10;
            i2 = bArr[i10];
            i7 = i + 1;
            i6 = i11;
            int i82 = (-i2) + i6;
            i = i7;
            int i92 = i5;
            i3 = i82;
            i2 = i92;
            bArr2[i] = (byte) i3;
            int i102 = i2 + 1;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            int i1022 = i2 + 1;
            if (i == i4) {
            }
        }
    }

    static {
        validateRelationship = 0;
        onSessionEnded();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        int i = ICustomTabsServiceStub + 61;
        validateRelationship = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        TossModule tossModule = (TossModule) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 107;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(tossModule, str);
        int i4 = requestPostMessageChannel + 83;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) throws Throwable {
        PortalServiceActivity portalServiceActivity = (PortalServiceActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 65;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            return (onAppOpenAdDisplayFailed) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1698031115, new Object[]{portalServiceActivity}, -1698031109, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
        }
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) throws Throwable {
        ReactHostVisibleStateObserver reactHostVisibleStateObserver;
        PortalServiceActivity portalServiceActivity = (PortalServiceActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 39;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {portalServiceActivity};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        if (i3 == 0) {
            reactHostVisibleStateObserver = (ReactHostVisibleStateObserver) onNavigationEvent(iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, 91163668, objArr2, -91163659, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
            int i4 = 95 / 0;
        } else {
            reactHostVisibleStateObserver = (ReactHostVisibleStateObserver) onNavigationEvent(iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, 91163668, objArr2, -91163659, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
        }
        int i5 = setEngagementSignalsCallback + 99;
        requestPostMessageChannel = i5 % 128;
        int i6 = i5 % 2;
        return reactHostVisibleStateObserver;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 41;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(th);
        int i4 = requestPostMessageChannel + 103;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PortalServiceActivity portalServiceActivity = (PortalServiceActivity) objArr[0];
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 73;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            readTypedObject(portalServiceActivity);
            throw null;
        }
        boolean typedObject = readTypedObject(portalServiceActivity);
        int i3 = setEngagementSignalsCallback + 65;
        requestPostMessageChannel = i3 % 128;
        if (i3 % 2 != 0) {
            return Boolean.valueOf(typedObject);
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(TossModule tossModule, getAdValue getadvalue) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 83;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(tossModule, getadvalue);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(tossModule, getadvalue);
        int i3 = setEngagementSignalsCallback + 33;
        requestPostMessageChannel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 58 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos onExtraCallback(PortalServiceActivity portalServiceActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 121;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onActivityLayout(portalServiceActivity);
        }
        onActivityLayout(portalServiceActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(PortalServiceActivity portalServiceActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 23;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        onMinimized(portalServiceActivity);
        int i4 = requestPostMessageChannel + 29;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ WindowInsetsCompat onNavigationEvent(PortalServiceActivity portalServiceActivity, View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 57;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        WindowInsetsCompat windowInsetsCompatOnWarmupCompleted = onWarmupCompleted(portalServiceActivity, view, windowInsetsCompat);
        int i4 = requestPostMessageChannel + 113;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return windowInsetsCompatOnWarmupCompleted;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = i3 | i7 | i8;
        int i10 = (~(i7 | i6)) | (~(i8 | i3));
        int i11 = (~(i6 | i3)) | (~(i7 | (~i3) | i8));
        int i12 = i3 + i4 + i5 + ((-160716491) * i) + (1883135422 * i2);
        int i13 = i12 * i12;
        int i14 = (((-1835184368) * i3) - 666828800) + ((-962678542) * i4) + ((-1711230735) * i9) + (i10 * 1711230735) + (1711230735 * i11) + (748552192 * i5) + ((-1967783936) * i) + ((-2092695552) * i2) + ((-870252544) * i13);
        int i15 = (i3 * 1975847376) + 750996803 + (i4 * 1975845642) + (i9 * (-867)) + (i10 * 867) + (i11 * 867) + (i5 * 1975846509) + (i * (-526956143)) + (i2 * 972447206) + (i13 * (-1341325312));
        switch (i14 + (i15 * i15 * 1929838592)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                PortalServiceActivity portalServiceActivity = (PortalServiceActivity) objArr[0];
                int i16 = 2 % 2;
                int i17 = requestPostMessageChannel;
                int i18 = i17 + 123;
                setEngagementSignalsCallback = i18 % 128;
                int i19 = i18 % 2;
                String str = portalServiceActivity.ICustomTabsService;
                int i20 = i17 + 107;
                setEngagementSignalsCallback = i20 % 128;
                int i21 = i20 % 2;
                return str;
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return asInterface(objArr);
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                return access100(objArr);
            case 12:
                return getInterfaceDescriptor(objArr);
            case 13:
                return IAuthTabCallback_Parcel(objArr);
            case 14:
                return IAuthTabCallbackStubProxy(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(PortalServiceActivity portalServiceActivity) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 103;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWriteTypedObject = writeTypedObject(portalServiceActivity);
        int i4 = requestPostMessageChannel + 91;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitWriteTypedObject;
    }

    public static /* synthetic */ void onWarmupCompleted(PortalServiceActivity portalServiceActivity, Ref.BooleanRef booleanRef, PortalHostView portalHostView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = requestPostMessageChannel + 61;
        setEngagementSignalsCallback = i10 % 128;
        int i11 = i10 % 2;
        onNavigationEvent(portalServiceActivity, booleanRef, portalHostView, view, i, i2, i3, i4, i5, i6, i7, i8);
        int i12 = requestPostMessageChannel + 61;
        setEngagementSignalsCallback = i12 % 128;
        if (i12 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel;
        int i3 = i2 + 85;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 31;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public static final class asInterface implements Function0<r8lambdaWpgOHjJLRzNufWqCTifVD_hSjV8> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Activity onExtraCallbackWithResult;

        public asInterface(Activity activity) {
            this.onExtraCallbackWithResult = activity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult();
            }
            onExtraCallbackWithResult();
            throw null;
        }

        public final r8lambdaWpgOHjJLRzNufWqCTifVD_hSjV8 onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            LayoutInflater layoutInflater = this.onExtraCallbackWithResult.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            r8lambdaWpgOHjJLRzNufWqCTifVD_hSjV8 r8lambdawpgohjjlrznufwqctifvd_hsjv8IAuthTabCallback = r8lambdaWpgOHjJLRzNufWqCTifVD_hSjV8.IAuthTabCallback(layoutInflater);
            int i4 = onNavigationEvent + 65;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return r8lambdawpgohjjlrznufwqctifvd_hsjv8IAuthTabCallback;
        }
    }

    public static final /* synthetic */ PortalHostView IAuthTabCallbackDefault(PortalServiceActivity portalServiceActivity) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 91;
        int i3 = i2 % 128;
        setEngagementSignalsCallback = i3;
        int i4 = i2 % 2;
        PortalHostView portalHostView = portalServiceActivity.writeTypedObject;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 103;
        requestPostMessageChannel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 0 / 0;
        }
        return portalHostView;
    }

    public static final /* synthetic */ boolean IAuthTabCallbackStubProxy(PortalServiceActivity portalServiceActivity) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 5;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        boolean z = portalServiceActivity.isEngagementSignalsApiAvailable;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 73;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public static final /* synthetic */ String IAuthTabCallback_Parcel(PortalServiceActivity portalServiceActivity) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel;
        int i3 = i2 + 97;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = portalServiceActivity.ICustomTabsCallbackDefault;
        int i5 = i2 + 107;
        setEngagementSignalsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ IAuthTabCallback access100(PortalServiceActivity portalServiceActivity) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 29;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback iAuthTabCallback = portalServiceActivity.onMinimized;
        int i5 = i2 + 11;
        requestPostMessageChannel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
        return iAuthTabCallback;
    }

    public static final /* synthetic */ String asBinder(PortalServiceActivity portalServiceActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 109;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 != 0) {
            return portalServiceActivity.IEngagementSignalsCallback_Parcel();
        }
        portalServiceActivity.IEngagementSignalsCallback_Parcel();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ long asInterface(PortalServiceActivity portalServiceActivity) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel;
        int i3 = i2 + 85;
        setEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            long j = portalServiceActivity.IAuthTabCallback_Parcel;
            throw null;
        }
        long j2 = portalServiceActivity.IAuthTabCallback_Parcel;
        int i4 = i2 + 117;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return j2;
    }

    public static final /* synthetic */ void extraCallback(PortalServiceActivity portalServiceActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 33;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        portalServiceActivity.ITrustedWebActivityCallback_Parcel();
        int i4 = setEngagementSignalsCallback + 73;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void extraCallbackWithResult(PortalServiceActivity portalServiceActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 51;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), TransferShareSummary.Companion.IAuthTabCallback(), 2005138004, new Object[]{portalServiceActivity}, -2005137993, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 774480072, iOnExtraCallbackWithResult);
        int i4 = setEngagementSignalsCallback + 95;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ onAppOpenAdHidden getInterfaceDescriptor(PortalServiceActivity portalServiceActivity) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 101;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        onAppOpenAdHidden onappopenadhidden = portalServiceActivity.ICustomTabsCallback_Parcel;
        int i5 = i3 + 59;
        setEngagementSignalsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return onappopenadhidden;
    }

    public static final /* synthetic */ void onExtraCallback(PortalServiceActivity portalServiceActivity, int i) {
        int i2 = 2 % 2;
        int i3 = requestPostMessageChannel + 117;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        portalServiceActivity.access100 = i;
        if (i4 != 0) {
            int i5 = 54 / 0;
        }
    }

    public static final /* synthetic */ void onExtraCallback(PortalServiceActivity portalServiceActivity, Integer num) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 57;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        portalServiceActivity.IAuthTabCallbackDefault = num;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 15;
        requestPostMessageChannel = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(PortalServiceActivity portalServiceActivity, String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 1;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        portalServiceActivity.onExtraCallbackWithResult(str, str2, str3);
        if (i3 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        PortalServiceActivity portalServiceActivity = (PortalServiceActivity) objArr[0];
        ReactContext reactContext = (ReactContext) objArr[1];
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 7;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        portalServiceActivity.IAuthTabCallback(reactContext);
        int i4 = setEngagementSignalsCallback + 59;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(PortalServiceActivity portalServiceActivity, boolean z) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 103;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        portalServiceActivity.isEngagementSignalsApiAvailable = z;
        int i5 = i2 + 15;
        requestPostMessageChannel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 46 / 0;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(PortalServiceActivity portalServiceActivity, boolean z) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 35;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        portalServiceActivity.extraCommand = z;
        int i5 = i2 + 55;
        requestPostMessageChannel = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ int onTransact(PortalServiceActivity portalServiceActivity) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 97;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        int i5 = portalServiceActivity.access100;
        int i6 = i3 + 7;
        setEngagementSignalsCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public static final /* synthetic */ void onWarmupCompleted(PortalServiceActivity portalServiceActivity, String str) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 33;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        portalServiceActivity.ICustomTabsService = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 113;
        requestPostMessageChannel = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(PortalServiceActivity portalServiceActivity, boolean z) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 5;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        portalServiceActivity.ICustomTabsCallbackStubProxy = z;
        int i5 = i2 + 117;
        requestPostMessageChannel = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // im.toss.rn.toss.core.common.wrapper.TossReactContentOwner
    public /* bridge */ void IAuthTabCallback(@NotNull String str, @NotNull JsonElement jsonElement) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 49;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        super.IAuthTabCallback(str, jsonElement);
        int i4 = requestPostMessageChannel + 93;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ boolean closeWebView(@Nullable String str, boolean z) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 121;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        boolean zCloseWebView = super.closeWebView(str, z);
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        return zCloseWebView;
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public /* bridge */ ViewGroup getCaWebViewContainer() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 65;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        ViewGroup caWebViewContainer = super.getCaWebViewContainer();
        int i4 = setEngagementSignalsCallback + 37;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 != 0) {
            return caWebViewContainer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Boolean getShouldWebViewPauseOnInvisible() {
        Boolean shouldWebViewPauseOnInvisible;
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 5;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            shouldWebViewPauseOnInvisible = super.getShouldWebViewPauseOnInvisible();
            int i3 = 63 / 0;
        } else {
            shouldWebViewPauseOnInvisible = super.getShouldWebViewPauseOnInvisible();
        }
        int i4 = setEngagementSignalsCallback + 91;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
        return shouldWebViewPauseOnInvisible;
    }

    public /* bridge */ Intent getSourceIntent() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 105;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        Intent sourceIntent = super.getSourceIntent();
        int i4 = requestPostMessageChannel + 81;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
        return sourceIntent;
    }

    public /* bridge */ String getSwipeRefreshCallback() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 13;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        String swipeRefreshCallback = super.getSwipeRefreshCallback();
        int i4 = setEngagementSignalsCallback + 119;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return swipeRefreshCallback;
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public /* bridge */ TossCoreWebView getWebView() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 119;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 != 0) {
            return super.getWebView();
        }
        super.getWebView();
        throw null;
    }

    public /* bridge */ boolean handleCaWebViewBackPress(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 11;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zHandleCaWebViewBackPress = super/*o.startApp*/.handleCaWebViewBackPress(function0);
        int i4 = setEngagementSignalsCallback + 5;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return zHandleCaWebViewBackPress;
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public /* bridge */ boolean isSwipeRefreshEnabled() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 47;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 != 0) {
            return super.isSwipeRefreshEnabled();
        }
        super.isSwipeRefreshEnabled();
        throw null;
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public /* bridge */ void onHistoryCleared() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 81;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onHistoryCleared();
        int i4 = requestPostMessageChannel + 3;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public /* bridge */ void onPageReady() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 37;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        super.onPageReady();
        int i4 = setEngagementSignalsCallback + 23;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onSwipeToRefresh(@Nullable SwipeRefreshLayout swipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 91;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        super/*o.startApp*/.onSwipeToRefresh(swipeRefreshLayout);
        int i4 = requestPostMessageChannel + 27;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public /* bridge */ void onUpdateWebHistoryState() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 57;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onUpdateWebHistoryState();
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ void setFullScreenEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 37;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.setFullScreenEnabled(z);
        int i4 = setEngagementSignalsCallback + 7;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setShouldWebViewPauseOnInvisible(@Nullable Boolean bool) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 57;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        super.setShouldWebViewPauseOnInvisible(bool);
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
    }

    public /* bridge */ void setSwipeRefreshCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 23;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.setSwipeRefreshCallback(str);
        int i4 = requestPostMessageChannel + 59;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public /* bridge */ void setSwipeRefreshEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 11;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        super.setSwipeRefreshEnabled(z);
        int i4 = setEngagementSignalsCallback + 105;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
    }

    @Override // im.toss.rn.toss.core.observability.ReactNativeScreenServiceHost
    public /* bridge */ boolean updateVisuals() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 1;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 != 0) {
            return super.updateVisuals();
        }
        super.updateVisuals();
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 81;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(requestPostMessageChannelWithExtras[i / i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 59697), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 17, 10973 - ((Process.getThreadPriority(0) + 20) >> 6), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(prefetchWithMultipleUrls), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - ExpandableListView.getPackedPositionGroup(0L)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31, KeyEvent.keyCodeFromString("") + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - ((Process.getThreadPriority(0) + 20) >> 6)), TextUtils.indexOf((CharSequence) "", '0') + 45, TextUtils.indexOf("", "") + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(requestPostMessageChannelWithExtras[i + i6])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 59697), (ViewConfiguration.getFadingEdgeLength() >> 16) + 17, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10972, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(prefetchWithMultipleUrls), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 46086), 31 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 20219 - TextUtils.lastIndexOf("", '0'), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 49123), View.resolveSize(0, 0) + 44, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i7 = $11 + 11;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) (-1);
                byte b6 = (byte) (b5 + 1);
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 49123), 44 - KeyEvent.keyCodeFromString(""), 1493 - ExpandableListView.getPackedPositionChild(0L), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
        }
        String str = new String(cArr);
        int i9 = $11 + 39;
        $10 = i9 % 128;
        if (i9 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final onInterstitialAdDisplayFailed ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 81;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = this.portalRuntime;
        Object obj = null;
        if (oninterstitialaddisplayfailed == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 5;
        setEngagementSignalsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return oninterstitialaddisplayfailed;
        }
        obj.hashCode();
        throw null;
    }

    public final RnPhaseObserver writeTypedList() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 51;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        RnPhaseObserver rnPhaseObserver = this.rnPhaseObserver;
        if (rnPhaseObserver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 51;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return rnPhaseObserver;
    }

    public final ReactNativeRouteLcpSessionManager ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 107;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        ReactNativeRouteLcpSessionManager reactNativeRouteLcpSessionManager = this.reactNativeRouteLcpSessions;
        Object obj = null;
        if (reactNativeRouteLcpSessionManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 61;
        int i6 = i5 % 128;
        requestPostMessageChannel = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 1;
        setEngagementSignalsCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return reactNativeRouteLcpSessionManager;
        }
        obj.hashCode();
        throw null;
    }

    public final r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 35;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE r8lambdausr520ceu4yijcrtwho1uywjge = this.tossReactMessageHandlerManager;
        if (r8lambdausr520ceu4yijcrtwho1uywjge == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 111;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return r8lambdausr520ceu4yijcrtwho1uywjge;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r2;
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
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r1 = r1 + 1;
        im.toss.rn.toss.core.portal.PortalServiceActivity.setEngagementSignalsCallback = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final calculateMaxTextSize ICustomTabsService_Parcel() {
        calculateMaxTextSize calculatemaxtextsize;
        int i = 2 % 2;
        int i2 = requestPostMessageChannel;
        int i3 = i2 + 109;
        setEngagementSignalsCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            calculatemaxtextsize = this.reactMessageHandlerPoolSet;
            int i4 = 56 / 0;
        } else {
            calculatemaxtextsize = this.reactMessageHandlerPoolSet;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i = 2 % 2;
        zzad zzadVar = ((PortalServiceActivity) objArr[0]).environments;
        if (zzadVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = setEngagementSignalsCallback + 81;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 85;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return zzadVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = im.toss.rn.toss.core.portal.PortalServiceActivity.requestPostMessageChannel + 117;
        im.toss.rn.toss.core.portal.PortalServiceActivity.setEngagementSignalsCallback = r1 % 128;
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
    public final getStartTimeMillis validateRelationship() {
        getStartTimeMillis getstarttimemillis;
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 119;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            getstarttimemillis = this.localeManager;
            int i3 = 40 / 0;
        } else {
            getstarttimemillis = this.localeManager;
        }
    }

    public final getBillingPeriod onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 39;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        getBillingPeriod getbillingperiod = this.tossRegionManager;
        if (getbillingperiod != null) {
            return getbillingperiod;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = setEngagementSignalsCallback + 11;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final ConstraintsSizeResolverExternalSyntheticLambda0 IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0 = this.unique;
        if (constraintsSizeResolverExternalSyntheticLambda0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = setEngagementSignalsCallback + 27;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 107;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return constraintsSizeResolverExternalSyntheticLambda0;
    }

    public final r8lambdaHDAe14RP_YfkbgNStt68qt10Iow setEngagementSignalsCallback() {
        int i = 2 % 2;
        r8lambdaHDAe14RP_YfkbgNStt68qt10Iow r8lambdahdae14rp_yfkbgnstt68qt10iow = this.distributionGroupManager;
        if (r8lambdahdae14rp_yfkbgnstt68qt10iow != null) {
            int i2 = requestPostMessageChannel + 113;
            setEngagementSignalsCallback = i2 % 128;
            int i3 = i2 % 2;
            return r8lambdahdae14rp_yfkbgnstt68qt10iow;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = requestPostMessageChannel + 47;
        setEngagementSignalsCallback = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final String ITrustedWebActivityCallback() {
        int i = 2 % 2;
        if (!this.extraCommand) {
            return this.ICustomTabsCallbackDefault;
        }
        int i2 = setEngagementSignalsCallback + 37;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.ICustomTabsService;
        if (str != null) {
            return str;
        }
        int i4 = i3 + 91;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.throwUninitializedPropertyAccessException("");
        if (i5 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
      0x0024: PHI (r3v5 java.lang.Integer) = (r3v4 java.lang.Integer), (r3v8 java.lang.Integer) binds: [B:8:0x0022, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Integer num;
        PortalServiceActivity portalServiceActivity = (PortalServiceActivity) objArr[0];
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 25;
        int i3 = i2 % 128;
        setEngagementSignalsCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            num = portalServiceActivity.IAuthTabCallbackDefault;
            int i4 = 89 / 0;
            if (num != null) {
                int i5 = i3 + 15;
                requestPostMessageChannel = i5 % 128;
                if (i5 % 2 == 0) {
                    num.intValue();
                    portalServiceActivity.ICustomTabsServiceDefault().access000();
                    obj.hashCode();
                    throw null;
                }
                int iIntValue = num.intValue();
                if (portalServiceActivity.ICustomTabsServiceDefault().access000() && iIntValue == portalServiceActivity.ICustomTabsServiceDefault().asBinder()) {
                    int i6 = setEngagementSignalsCallback + 67;
                    requestPostMessageChannel = i6 % 128;
                    return i6 % 2 != 0;
                }
            }
        } else {
            num = portalServiceActivity.IAuthTabCallbackDefault;
            if (num != null) {
            }
        }
        int i7 = setEngagementSignalsCallback + 5;
        requestPostMessageChannel = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    private final r8lambdaWpgOHjJLRzNufWqCTifVD_hSjV8 IPostMessageService() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 103;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaWpgOHjJLRzNufWqCTifVD_hSjV8 r8lambdawpgohjjlrznufwqctifvd_hsjv8 = (r8lambdaWpgOHjJLRzNufWqCTifVD_hSjV8) this.onTransact.getValue();
        int i4 = requestPostMessageChannel + 71;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdawpgohjjlrznufwqctifvd_hsjv8;
    }

    private final FrameLayout IPostMessageServiceStubProxy() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 123;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            FrameLayout frameLayout = IPostMessageService().onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            return frameLayout;
        }
        Intrinsics.checkNotNullExpressionValue(IPostMessageService().onExtraCallbackWithResult, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onMinimized(PortalServiceActivity portalServiceActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 5;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        portalServiceActivity.areNotificationsEnabled();
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), TransferShareSummary.Companion.IAuthTabCallback(), 2005138004, new Object[]{portalServiceActivity}, -2005137993, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 774480072, iOnExtraCallbackWithResult);
        int i4 = requestPostMessageChannel + 89;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Throwable {
        convertToPlayAuthPasskeyJsonRequest converttoplayauthpasskeyjsonrequest = (PortalServiceActivity) objArr[0];
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 109;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        onAppOpenAdDisplayFailed.onExtraCallbackWithResult onextracallbackwithresult = onAppOpenAdDisplayFailed.Companion;
        Intent intent = converttoplayauthpasskeyjsonrequest.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        onAppOpenAdDisplayFailed onappopenaddisplayfailedOnExtraCallback = onextracallbackwithresult.onExtraCallback(intent);
        int i4 = setEngagementSignalsCallback + 63;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return onappopenaddisplayfailedOnExtraCallback;
    }

    private final onAppOpenAdDisplayFailed ITrustedWebActivityCallbackStub() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 61;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        onAppOpenAdDisplayFailed onappopenaddisplayfailed = (onAppOpenAdDisplayFailed) this.extraCallback.getValue();
        int i4 = setEngagementSignalsCallback + 23;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
        return onappopenaddisplayfailed;
    }

    private final ReactHostVisibleStateObserver ITrustedWebActivityCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 59;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        ReactHostVisibleStateObserver reactHostVisibleStateObserver = (ReactHostVisibleStateObserver) this.onActivityResized.getValue();
        int i4 = setEngagementSignalsCallback + 57;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return reactHostVisibleStateObserver;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i = 2 % 2;
        ReactHostVisibleStateObserver reactHostVisibleStateObserver = new ReactHostVisibleStateObserver((PortalServiceActivity) objArr[0]);
        int i2 = requestPostMessageChannel + 119;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return reactHostVisibleStateObserver;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public List<WeakReference<startApp>> IPostMessageService_Parcel() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 107;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 != 0) {
            return this.receiveFile;
        }
        throw null;
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public startApp access200() {
        int i = 2 % 2;
        WeakReference weakReference = (WeakReference) CollectionsKt.lastOrNull(IPostMessageService_Parcel());
        if (weakReference == null) {
            int i2 = setEngagementSignalsCallback + 105;
            requestPostMessageChannel = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = setEngagementSignalsCallback + 15;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
        startApp startapp = (startApp) weakReference.get();
        if (i5 == 0) {
            int i6 = 87 / 0;
        }
        return startapp;
    }

    private final r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos ITrustedWebActivityCallbackDefault() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 95;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos = (r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos) this.onMessageChannelReady.getValue();
        int i4 = requestPostMessageChannel + 51;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return r8lambdadtqrzfihm2ghoddvkfg5vm2yos;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos onActivityLayout(PortalServiceActivity portalServiceActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 33;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos.onWarmupCompleted onwarmupcompleted = r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos.Companion;
        onAppOpenAdHidden onappopenadhidden = portalServiceActivity.ICustomTabsCallback_Parcel;
        if (onappopenadhidden == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = requestPostMessageChannel + 85;
            setEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
            onappopenadhidden = null;
        }
        String strIAuthTabCallback = onappopenadhidden.IAuthTabCallback();
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        String strWarmup = ((zzad) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 2000011400, new Object[]{portalServiceActivity}, -2000011392, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).warmup();
        String strOnExtraCallbackWithResult = portalServiceActivity.ICustomTabsServiceDefault().onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a(TextUtils.getCapsMode("", 0, 0) + 27, MotionEvent.axisFromString("") + 5, (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        return onwarmupcompleted.onExtraCallback(strIAuthTabCallback, strWarmup, ((String) objArr[0]).intern(), strOnExtraCallbackWithResult);
    }

    public static final class IAuthTabCallback implements ReactInstanceEventListener {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        IAuthTabCallback() {
        }

        public void onNavigationEvent(ReactContext reactContext) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(reactContext, "");
                Object[] objArr = {PortalServiceActivity.this, reactContext};
                int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
                PortalServiceActivity.onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 693781343, objArr, -693781343, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(reactContext, "");
            Object[] objArr2 = {PortalServiceActivity.this, reactContext};
            int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            PortalServiceActivity.onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 693781343, objArr2, -693781343, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
            int i3 = onNavigationEvent + 67;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    private static final Unit writeTypedObject(PortalServiceActivity portalServiceActivity) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 1;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        portalServiceActivity.onBackPressed();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        throw null;
    }

    private static final WindowInsetsCompat onWarmupCompleted(PortalServiceActivity portalServiceActivity, View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 55;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        int iAsBinder = WindowInsetsCompat.onTransact.asBinder() | WindowInsetsCompat.onTransact.onExtraCallbackWithResult();
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompat.onWarmupCompleted(iAsBinder);
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
        view.setPadding(cameraControllerExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback, 0, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallbackWithResult, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback);
        if (!(!portalServiceActivity.ITrustedWebActivityCallbackStub().onTransact())) {
            return portalServiceActivity.onWarmupCompleted(windowInsetsCompat, iAsBinder);
        }
        int i4 = setEngagementSignalsCallback + 61;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
        return windowInsetsCompat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.rn.toss.core.portal.Hilt_PortalServiceActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        boolean z;
        int i = 2 % 2;
        this.ICustomTabsCallback.onNavigationEvent(bundle != null ? bundle.getString("portalPendingRedirectUrl") : null, bundle != null ? bundle.getBoolean("portalRedirectHandled") : false, ITrustedWebActivityCallbackStub().onExtraCallbackWithResult());
        this.ICustomTabsCallbackDefault = bundle != null ? bundle.getString("portalServiceSessionIdentifier") : null;
        super.onCreate(r8lambdaHMNJeel4W_tBmaYEYabnCYaHtU.Companion.IAuthTabCallback(bundle));
        if (isFinishing()) {
            return;
        }
        ReactNativeRouteLcpSessionManager.onWarmupCompleted(-546862392, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{ICustomTabsServiceStubProxy(), this}, zzgc.onExtraCallbackWithResult(), 546862392, zzgc.onExtraCallbackWithResult());
        Window window = getWindow();
        if (window != null) {
            onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1522245971, new Object[]{this, window}, 1522245975, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        }
        if (bundle != null) {
            int i2 = setEngagementSignalsCallback;
            int i3 = i2 + 15;
            requestPostMessageChannel = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 53;
            requestPostMessageChannel = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 % 2;
            }
            z = true;
        } else {
            z = false;
        }
        this.onUnminimized = z;
        onAppOpenAdHidden.onWarmupCompleted onwarmupcompleted = onAppOpenAdHidden.Companion;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        onAppOpenAdHidden onappopenadhiddenOnWarmupCompleted = onAppOpenAdHidden.onWarmupCompleted.onWarmupCompleted(onwarmupcompleted, intent, 0L, 2, null);
        if (onappopenadhiddenOnWarmupCompleted != null) {
            this.ICustomTabsCallback_Parcel = onappopenadhiddenOnWarmupCompleted;
            RnPhaseObserver.IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{writeTypedList()}, 1183770401, -1183770401, ICustomTabsCallbackStubProxy.onExtraCallback());
            RnPhaseObserver.IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{writeTypedList(), this, false, 2, null}, -27226709, 27226716, ICustomTabsCallbackStubProxy.onExtraCallback());
            this.onActivityLayout = new ReactBackPressHandler(new PortalServiceActivity$.ExternalSyntheticLambda9(this));
            ITrustedWebActivityCallbackStubProxy().IAuthTabCallback(this);
            read();
            ViewCompat.onWarmupCompleted(IPostMessageService().IAuthTabCallback(), new PortalServiceActivity$.ExternalSyntheticLambda10(this));
            setContentView(IPostMessageService().IAuthTabCallback());
            this.access000 = true;
            ITrustedWebActivityServiceDefault();
            onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1834298170, new Object[]{this}, 1834298171, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            r8lambdarKY_76dijV4LvyApAwXzgCxxoY r8lambdarky_76dijv4lvyapawxzgcxxoy = r8lambdarKY_76dijV4LvyApAwXzgCxxoY.onExtraCallbackWithResult;
            onAppOpenAdHidden onappopenadhidden = this.ICustomTabsCallback_Parcel;
            if (onappopenadhidden == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                onappopenadhidden = null;
            }
            String strIAuthTabCallback = onappopenadhidden.IAuthTabCallback();
            onAppOpenAdHidden onappopenadhidden2 = this.ICustomTabsCallback_Parcel;
            if (onappopenadhidden2 == null) {
                int i7 = setEngagementSignalsCallback + 123;
                requestPostMessageChannel = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                onappopenadhidden2 = null;
            }
            r8lambdarKY_76dijV4LvyApAwXzgCxxoY.onExtraCallbackWithResult onExtraCallbackWithResult = r8lambdarKY_76dijV4LvyApAwXzgCxxoY.onExtraCallbackWithResult(r8lambdarky_76dijv4lvyapawxzgcxxoy, strIAuthTabCallback, onappopenadhidden2.onNavigationEvent(), getIntent().getStringExtra("_distributionGroup"), setEngagementSignalsCallback().onNavigationEvent(), ((zzad) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 2000011400, new Object[]{this}, -2000011392, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())).RemoteActionCompatParcelizer(), true, false, null, 192, null);
            if (onExtraCallbackWithResult instanceof r8lambdarKY_76dijV4LvyApAwXzgCxxoY.onExtraCallbackWithResult.onWarmupCompleted) {
                r8lambdarKY_76dijV4LvyApAwXzgCxxoY.onExtraCallbackWithResult.onWarmupCompleted onwarmupcompleted2 = (r8lambdarKY_76dijV4LvyApAwXzgCxxoY.onExtraCallbackWithResult.onWarmupCompleted) onExtraCallbackWithResult;
                onExtraCallbackWithResult(onwarmupcompleted2.onWarmupCompleted().getValue(), "decide", onwarmupcompleted2.onExtraCallbackWithResult());
                return;
            } else {
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(this, (access13800) null), 3, (Object) null);
                return;
            }
        }
        int i9 = setEngagementSignalsCallback + 113;
        requestPostMessageChannel = i9 % 128;
        if (i9 % 2 == 0) {
            onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1638039613, new Object[]{this, "no_route", "decide", null, 5, null}, 1638039625, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        } else {
            onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1638039613, new Object[]{this, "no_route", "decide", null, 4, null}, 1638039625, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        }
    }

    private final String IEngagementSignalsCallback_Parcel() throws Throwable {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 73;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        if (this.onUnminimized) {
            int i5 = i3 + 105;
            setEngagementSignalsCallback = i5 % 128;
            int i6 = i5 % 2;
            return "restore";
        }
        Object[] objArr = new Object[1];
        a(6 - (ViewConfiguration.getEdgeSlop() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6, (char) TextUtils.getOffsetBefore("", 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i7 = setEngagementSignalsCallback + 95;
        requestPostMessageChannel = i7 % 128;
        if (i7 % 2 != 0) {
            return strIntern;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        PortalServiceActivity portalServiceActivity = (PortalServiceActivity) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj = objArr[5];
        int i = 2 % 2;
        int i2 = requestPostMessageChannel;
        int i3 = i2 + 69;
        setEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 == 0 ? (4 & iIntValue) != 0 : (iIntValue & 2) != 0) {
            int i4 = i2 + 87;
            setEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
            str3 = null;
        }
        portalServiceActivity.onExtraCallbackWithResult(str, str2, str3);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(String str, String str2, String str3) {
        Object obj;
        int i;
        int i2 = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs r8lambdaxc7xafnircae5ge7mvkfmdsqbs = r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onWarmupCompleted;
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("reasonDetail", str3);
            onAppOpenAdHidden onappopenadhidden = this.ICustomTabsCallback_Parcel;
            String strIAuthTabCallback = null;
            if (onappopenadhidden != null) {
                if (onappopenadhidden == null) {
                    int i3 = setEngagementSignalsCallback + 37;
                    requestPostMessageChannel = i3 % 128;
                    int i4 = i3 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    onappopenadhidden = null;
                }
                strIAuthTabCallback = onappopenadhidden.IAuthTabCallback();
            }
            r8lambdaxc7xafnircae5ge7mvkfmdsqbs.onWarmupCompleted(str, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback("serviceName", strIAuthTabCallback), getWrite.IAuthTabCallback("stage", str2), getWrite.IAuthTabCallback("entryPoint", IEngagementSignalsCallback_Parcel()), getWrite.IAuthTabCallback("runtimeState", ICustomTabsServiceDefault().asInterface()), getWrite.IAuthTabCallback("runtimeDowngraded", Boolean.valueOf(ICustomTabsServiceDefault().IAuthTabCallback_Parcel())), getWrite.IAuthTabCallback("elapsedMs", Long.valueOf(SystemClock.elapsedRealtime() - this.IAuthTabCallback_Parcel))}));
            obj = Result.constructor-impl(Unit.INSTANCE);
            i = setEngagementSignalsCallback + 103;
            requestPostMessageChannel = i % 128;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
            i = requestPostMessageChannel + 49;
            setEngagementSignalsCallback = i % 128;
        }
        int i5 = i % 2;
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            int i6 = setEngagementSignalsCallback + 31;
            requestPostMessageChannel = i6 % 128;
            if (i6 % 2 == 0) {
                r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onWarmupCompleted.onWarmupCompleted("mono_hermes_fallback", th2);
                int i7 = 35 / 0;
            } else {
                r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onWarmupCompleted.onWarmupCompleted("mono_hermes_fallback", th2);
            }
        }
        Intent intent = new Intent(getIntent());
        intent.setClass(this, ReactSchemeActivity.class);
        startActivity(intent);
        finish();
        overridePendingTransition(0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4, android.net.Uri.EMPTY) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r4 = im.toss.base.BaseActivity.onNavigationEvent.NO_REDIRECT;
        r1 = im.toss.rn.toss.core.portal.PortalServiceActivity.setEngagementSignalsCallback + 39;
        im.toss.rn.toss.core.portal.PortalServiceActivity.requestPostMessageChannel = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4, android.net.Uri.EMPTY) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BaseActivity.onNavigationEvent onExtraCallback(@Nullable Uri uri) {
        int i = 2 % 2;
        if (uri != null) {
            int i2 = setEngagementSignalsCallback + 7;
            requestPostMessageChannel = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 1 / 0;
            }
        }
        return super.onExtraCallback(uri);
    }

    public void onNewIntent(@NotNull Intent intent) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 121;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(intent, "");
            super.onNewIntent(intent);
            this.ICustomTabsCallback.onNavigationEvent(onAppOpenAdDisplayFailed.Companion.onExtraCallback(intent).onExtraCallbackWithResult());
            getActiveNotifications();
            return;
        }
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        this.ICustomTabsCallback.onNavigationEvent(onAppOpenAdDisplayFailed.Companion.onExtraCallback(intent).onExtraCallbackWithResult());
        getActiveNotifications();
        int i3 = 7 / 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getActiveNotifications() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 113;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            String strOnExtraCallbackWithResult = this.ICustomTabsCallback.onExtraCallbackWithResult(this.writeTypedObject != null, getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED));
            if (strOnExtraCallbackWithResult == null) {
                return;
            }
            Intent intent = getIntent();
            if (intent != null) {
                int i3 = setEngagementSignalsCallback + 59;
                requestPostMessageChannel = i3 % 128;
                int i4 = i3 % 2;
                intent.removeExtra("redirect");
            }
            SessionTrackerb.IAuthTabCallback((SessionTrackerb) resumeForClick.asBinder, (Activity) this, strOnExtraCallbackWithResult, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            return;
        }
        throw null;
    }

    @Override // im.toss.rn.toss.core.portal.Hilt_PortalServiceActivity
    public void onStart() {
        int i = 2 % 2;
        super.onStart();
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Object obj = null;
        if (((Boolean) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1105728117, new Object[]{this}, 1105728120, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult)).booleanValue()) {
            onInterstitialAdDisplayFailed oninterstitialaddisplayfailedICustomTabsServiceDefault = ICustomTabsServiceDefault();
            String str = this.ICustomTabsService;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i2 = setEngagementSignalsCallback + 53;
                requestPostMessageChannel = i2 % 128;
                int i3 = i2 % 2;
                str = null;
            }
            oninterstitialaddisplayfailedICustomTabsServiceDefault.onWarmupCompleted(str);
        }
        int i4 = requestPostMessageChannel + 121;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.rn.toss.core.portal.Hilt_PortalServiceActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 7;
        setEngagementSignalsCallback = i2 % 128;
        String str = null;
        if (i2 % 2 == 0) {
            super.onResume();
            int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            if (((Boolean) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1105728117, new Object[]{this}, 1105728120, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).booleanValue()) {
                onInterstitialAdDisplayFailed oninterstitialaddisplayfailedICustomTabsServiceDefault = ICustomTabsServiceDefault();
                String str2 = this.ICustomTabsService;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    str = str2;
                }
                onInterstitialAdDisplayFailed.IAuthTabCallback(1109194018, new Object[]{oninterstitialaddisplayfailedICustomTabsServiceDefault, this, str}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1109194008);
            }
            getActiveNotifications();
            int i3 = setEngagementSignalsCallback + 125;
            requestPostMessageChannel = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 25 / 0;
                return;
            }
            return;
        }
        super.onResume();
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        ((Boolean) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1105728117, new Object[]{this}, 1105728120, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3)).booleanValue();
        str.hashCode();
        throw null;
    }

    @Override // im.toss.rn.toss.core.portal.Hilt_PortalServiceActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 121;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            if (((Boolean) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1105728117, new Object[]{this}, 1105728120, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).booleanValue()) {
                ICustomTabsServiceDefault().onNavigationEvent(this);
                int i3 = setEngagementSignalsCallback + 47;
                requestPostMessageChannel = i3 % 128;
                int i4 = i3 % 2;
            }
            super.onPause();
            return;
        }
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        ((Boolean) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1105728117, new Object[]{this}, 1105728120, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3)).booleanValue();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onStop() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 105;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            int i3 = 70 / 0;
            if (((Boolean) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1105728117, new Object[]{this}, 1105728120, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).booleanValue()) {
                onInterstitialAdDisplayFailed oninterstitialaddisplayfailedICustomTabsServiceDefault = ICustomTabsServiceDefault();
                String str = this.ICustomTabsService;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str = null;
                }
                oninterstitialaddisplayfailedICustomTabsServiceDefault.onExtraCallback(str);
                int i4 = requestPostMessageChannel + 37;
                setEngagementSignalsCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            if (((Boolean) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1105728117, new Object[]{this}, 1105728120, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3)).booleanValue()) {
            }
        }
        super.onStop();
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 71;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        String strITrustedWebActivityCallback = ITrustedWebActivityCallback();
        this.mayLaunchUrl = strITrustedWebActivityCallback;
        if (strITrustedWebActivityCallback != null) {
            bundle.putString("portalServiceSessionIdentifier", strITrustedWebActivityCallback);
        }
        String strOnWarmupCompleted = this.ICustomTabsCallback.onWarmupCompleted();
        if (strOnWarmupCompleted != null) {
            bundle.putString("portalPendingRedirectUrl", strOnWarmupCompleted);
            int i4 = setEngagementSignalsCallback + 29;
            requestPostMessageChannel = i4 % 128;
            int i5 = i4 % 2;
        }
        bundle.putBoolean("portalRedirectHandled", this.ICustomTabsCallback.onExtraCallback());
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 121;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        writeTypedList().IAuthTabCallback(this);
        boolean z = true;
        if (!(!this.ICustomTabsCallbackStubProxy)) {
            this.ICustomTabsCallbackStubProxy = false;
            ICustomTabsServiceDefault().IAuthTabCallbackStub().onExtraCallbackWithResult(this.onMinimized);
        }
        PortalHostView portalHostView = this.writeTypedObject;
        if (portalHostView != null) {
            portalHostView.setName((String) null);
        }
        PortalReactRootView portalReactRootView = this.onPostMessage;
        if (portalReactRootView != null) {
            portalReactRootView.removeAllViews();
        }
        if (this.access000) {
            int i4 = requestPostMessageChannel + 21;
            setEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
            IPostMessageServiceStubProxy().removeCallbacks(this.postMessage);
            notifyNotificationWithChannel();
            IPostMessageServiceStubProxy().removeAllViews();
            int i6 = setEngagementSignalsCallback + 91;
            requestPostMessageChannel = i6 % 128;
            int i7 = i6 % 2;
        }
        TossModule tossModule = this.newAuthTabSession;
        if (tossModule != null) {
            int i8 = setEngagementSignalsCallback + 123;
            requestPostMessageChannel = i8 % 128;
            if (i8 % 2 == 0) {
                tossModule.readTypedObject();
                int i9 = 31 / 0;
            } else {
                tossModule.readTypedObject();
            }
        }
        IPostMessageServiceDefault();
        this.newAuthTabSession = null;
        IPostMessageService_Parcel().clear();
        this.writeTypedObject = null;
        this.onPostMessage = null;
        String strITrustedWebActivityCallback = ITrustedWebActivityCallback();
        if (strITrustedWebActivityCallback != null) {
            onInterstitialAdDisplayFailed oninterstitialaddisplayfailedICustomTabsServiceDefault = ICustomTabsServiceDefault();
            if ((!isChangingConfigurations()) || !Intrinsics.areEqual(this.mayLaunchUrl, strITrustedWebActivityCallback)) {
                z = false;
            } else {
                int i10 = requestPostMessageChannel + 59;
                setEngagementSignalsCallback = i10 % 128;
                int i11 = i10 % 2;
            }
            onInterstitialAdDisplayFailed.IAuthTabCallback(753585459, new Object[]{oninterstitialaddisplayfailedICustomTabsServiceDefault, strITrustedWebActivityCallback, Boolean.valueOf(z)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -753585427);
        }
        this.onActivityLayout = null;
        super.onDestroy();
    }

    public boolean newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 111;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackStub = ITrustedWebActivityCallbackStub().IAuthTabCallbackStub();
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        return zIAuthTabCallbackStub;
    }

    public void invokeDefaultOnBackPressed() {
        int i = 2 % 2;
        ReactBackPressHandler reactBackPressHandler = this.onActivityLayout;
        if (reactBackPressHandler != null) {
            int i2 = requestPostMessageChannel + 17;
            setEngagementSignalsCallback = i2 % 128;
            int i3 = i2 % 2;
            reactBackPressHandler.onWarmupCompleted();
            int i4 = setEngagementSignalsCallback + 95;
            requestPostMessageChannel = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = setEngagementSignalsCallback + 85;
        requestPostMessageChannel = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void onActivityResult(int i, int i2, @Nullable Intent intent) throws Throwable {
        int i3 = 2 % 2;
        int i4 = requestPostMessageChannel + 125;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onActivityResult(i, i2, intent);
        onGreatestScrollPercentageIncreased().IAuthTabCallback(this, i, i2, intent);
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        if (((Boolean) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1105728117, new Object[]{this}, 1105728120, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).booleanValue()) {
            ICustomTabsServiceDefault().IAuthTabCallbackStub().IAuthTabCallback(this, i, i2, intent);
            int i6 = requestPostMessageChannel + 51;
            setEngagementSignalsCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onExtraCallbackWithResult(@NotNull String[] strArr, int i, @Nullable getJSON_KEY_CHALLENGEcredentials_play_services_auth_release getjson_key_challengecredentials_play_services_auth_release) {
        int i2 = 2 % 2;
        int i3 = requestPostMessageChannel + 109;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(strArr, "");
        if (getjson_key_challengecredentials_play_services_auth_release == null) {
            return;
        }
        this.extraCallbackWithResult.add(getjson_key_challengecredentials_play_services_auth_release);
        super/*android.app.Activity*/.requestPermissions(strArr, i);
        int i5 = requestPostMessageChannel + 109;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        int i2 = 2 % 2;
        int i3 = requestPostMessageChannel + 17;
        setEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(strArr, "");
            Intrinsics.checkNotNullParameter(iArr, "");
            super.onRequestPermissionsResult(i, strArr, iArr);
            this.extraCallbackWithResult.iterator();
            throw null;
        }
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        super.onRequestPermissionsResult(i, strArr, iArr);
        Iterator<T> it = this.extraCallbackWithResult.iterator();
        while (it.hasNext()) {
            ((getJSON_KEY_CHALLENGEcredentials_play_services_auth_release) it.next()).onRequestPermissionsResult(i, strArr, iArr);
            int i4 = requestPostMessageChannel + 9;
            setEngagementSignalsCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 2;
            }
        }
        this.extraCallbackWithResult = new ArrayList<>();
    }

    public boolean getAllowTraversingChildFragment() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 7;
        int i3 = i2 % 128;
        setEngagementSignalsCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.asBinder;
        int i5 = i3 + 43;
        requestPostMessageChannel = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public boolean getDiscoversCandidatesOnDraw() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 111;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        boolean z = this.IAuthTabCallbackStubProxy;
        int i5 = i3 + 83;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel;
        int i3 = i2 + 91;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onRelationshipValidationResult;
        int i5 = i2 + 111;
        setEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 117;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ICustomTabsCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Map<String, Object> getScreenMetaData() {
        Map<String, Object> mapOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 73;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 != 0) {
            mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("screenName", RnTrackableScreenNameKt.onNavigationEvent(ITrustedWebActivityCallbackStub().onExtraCallback())), getWrite.IAuthTabCallback("company", ITrustedWebActivityCallbackStub().IAuthTabCallback())});
        } else {
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("screenName", RnTrackableScreenNameKt.onNavigationEvent(ITrustedWebActivityCallbackStub().onExtraCallback()));
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("company", ITrustedWebActivityCallbackStub().IAuthTabCallback());
            Pair[] pairArr = new Pair[4];
            pairArr[1] = pairIAuthTabCallback;
            pairArr[0] = pairIAuthTabCallback2;
            mapOnWarmupCompleted = access8100.onWarmupCompleted(pairArr);
        }
        int i3 = setEngagementSignalsCallback + 117;
        requestPostMessageChannel = i3 % 128;
        if (i3 % 2 != 0) {
            return mapOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.rn.toss.core.observability.ReactNativeScreenServiceHost
    public String IEngagementSignalsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 43;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = ITrustedWebActivityCallbackStub().onNavigationEvent();
        Object obj = null;
        if (strOnNavigationEvent.length() <= 0) {
            return null;
        }
        int i4 = setEngagementSignalsCallback + 81;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public boolean bg_() {
        int i = 2 % 2;
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        if (((Boolean) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1105728117, new Object[]{this}, 1105728120, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).booleanValue()) {
            ReactBackPressHandler reactBackPressHandler = this.onActivityLayout;
            if (reactBackPressHandler != null) {
                int i2 = setEngagementSignalsCallback + 55;
                requestPostMessageChannel = i2 % 128;
                int i3 = i2 % 2;
                if (reactBackPressHandler.onWarmupCompleted(ICustomTabsServiceDefault().IAuthTabCallbackStub())) {
                    return true;
                }
            }
            boolean zBg_ = super.bg_();
            int i4 = setEngagementSignalsCallback + 115;
            requestPostMessageChannel = i4 % 128;
            int i5 = i4 % 2;
            return zBg_;
        }
        int i6 = requestPostMessageChannel + 81;
        setEngagementSignalsCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return super.bg_();
        }
        super.bg_();
        throw null;
    }

    public ResourceResolutionException onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 107;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {ICustomTabsServiceDefault()};
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted4 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        if (i3 == 0) {
            return (ResourceResolutionException) onInterstitialAdDisplayFailed.IAuthTabCallback(-1875942894, objArr, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted4, iOnWarmupCompleted3, 1875942916);
        }
        int i4 = 37 / 0;
        return (ResourceResolutionException) onInterstitialAdDisplayFailed.IAuthTabCallback(-1875942894, objArr, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted4, iOnWarmupCompleted3, 1875942916);
    }

    @Override // im.toss.rn.toss.core.common.wrapper.TossReactContentOwner
    public TossModule IPostMessageServiceStub() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 47;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        TossModule tossModule = this.newAuthTabSession;
        int i5 = i2 + 35;
        requestPostMessageChannel = i5 % 128;
        int i6 = i5 % 2;
        return tossModule;
    }

    @Override // im.toss.rn.toss.core.common.wrapper.TossReactContentOwner
    public ReactContext IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 53;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        if (i3 != 0) {
            return oninterstitialaddisplayfailedICustomTabsServiceDefault.onExtraCallback();
        }
        oninterstitialaddisplayfailedICustomTabsServiceDefault.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 87;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        recreate();
        int i4 = setEngagementSignalsCallback + 123;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public MaxFullscreenAdImpl access100() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 97;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        MaxFullscreenAdImpl maxFullscreenAdImplOnTransact = ICustomTabsServiceDefault().onTransact();
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        return maxFullscreenAdImplOnTransact;
    }

    public r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 9;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        MaxAdViewImplb maxAdViewImplb = MaxAdViewImplb.Shared;
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        return maxAdViewImplb;
    }

    public MaxFullscreenAdImpl asInterface() {
        int i = 2 % 2;
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        onAppOpenAdHidden onappopenadhidden = this.ICustomTabsCallback_Parcel;
        Object obj = null;
        if (onappopenadhidden == null) {
            int i2 = requestPostMessageChannel + 17;
            setEngagementSignalsCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 != 0) {
                obj.hashCode();
                throw null;
            }
            onappopenadhidden = null;
        }
        MaxFullscreenAdImpl maxFullscreenAdImplOnExtraCallbackWithResult = oninterstitialaddisplayfailedICustomTabsServiceDefault.onExtraCallbackWithResult(onappopenadhidden.IAuthTabCallback());
        int i4 = requestPostMessageChannel + 5;
        setEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return maxFullscreenAdImplOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos onTransact() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 71;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yosITrustedWebActivityCallbackDefault = ITrustedWebActivityCallbackDefault();
        int i4 = setEngagementSignalsCallback + 7;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 != 0) {
            return r8lambdadtqrzfihm2ghoddvkfg5vm2yosITrustedWebActivityCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getByteBuffer<Boolean> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 67;
        setEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            ITrustedWebActivityCallbackStubProxy().IAuthTabCallback();
            throw null;
        }
        getByteBuffer<Boolean> getbytebufferIAuthTabCallback = ITrustedWebActivityCallbackStubProxy().IAuthTabCallback();
        int i3 = requestPostMessageChannel + 83;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        return getbytebufferIAuthTabCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MaxFullscreenAdImplExternalSyntheticLambda9 IEngagementSignalsCallbackStub() throws Throwable {
        int i = 2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda9 maxFullscreenAdImplExternalSyntheticLambda9 = this.prefetch;
        if (maxFullscreenAdImplExternalSyntheticLambda9 != null) {
            return maxFullscreenAdImplExternalSyntheticLambda9;
        }
        int i2 = setEngagementSignalsCallback + 97;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        RnAppVersion rnAppVersion = RnAppVersion.onExtraCallback;
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        String strOnWarmupCompleted = rnAppVersion.onWarmupCompleted(this, (zzad) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 2000011400, new Object[]{this}, -2000011392, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult));
        String strOnExtraCallback = validateRelationship().onExtraCallback();
        String strOnNavigationEvent = IEngagementSignalsCallbackDefault().onNavigationEvent();
        String strOnExtraCallbackWithResult = ICustomTabsServiceDefault().onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        boolean zITrustedWebActivityServiceStubProxy = ((zzad) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 2000011400, new Object[]{this}, -2000011392, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2)).ITrustedWebActivityServiceStubProxy();
        String code = onVerticalScrollEvent().onExtraCallbackWithResult().getCode();
        if (code == null) {
            int i4 = setEngagementSignalsCallback + 53;
            requestPostMessageChannel = i4 % 128;
            int i5 = i4 % 2;
            code = "kr";
        }
        String upperCase = code.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        onAppOpenAdHidden onappopenadhidden = this.ICustomTabsCallback_Parcel;
        onAppOpenAdHidden onappopenadhidden2 = null;
        if (onappopenadhidden == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onappopenadhidden = null;
        }
        String strOnWarmupCompleted2 = onappopenadhidden.onWarmupCompleted();
        onAppOpenAdHidden onappopenadhidden3 = this.ICustomTabsCallback_Parcel;
        if (onappopenadhidden3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i6 = setEngagementSignalsCallback + 61;
            requestPostMessageChannel = i6 % 128;
            int i7 = i6 % 2;
        } else {
            onappopenadhidden2 = onappopenadhidden3;
        }
        MaxFullscreenAdImplExternalSyntheticLambda9 maxFullscreenAdImplExternalSyntheticLambda92 = new MaxFullscreenAdImplExternalSyntheticLambda9(strOnWarmupCompleted, strOnExtraCallback, strOnNavigationEvent, strOnExtraCallbackWithResult, zITrustedWebActivityServiceStubProxy, upperCase, strOnWarmupCompleted2, onappopenadhidden2.IAuthTabCallback());
        this.prefetch = maxFullscreenAdImplExternalSyntheticLambda92;
        return maxFullscreenAdImplExternalSyntheticLambda92;
    }

    private static final boolean readTypedObject(PortalServiceActivity portalServiceActivity) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 107;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        portalServiceActivity.finish();
        return true;
    }

    private static final Unit onWarmupCompleted(TossModule tossModule, getAdValue getadvalue) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 103;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        tossModule.onExtraCallback(getadvalue.onExtraCallbackWithResult(), getadvalue.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = setEngagementSignalsCallback + 5;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(Throwable th) {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 85;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(th, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(TossModule tossModule, String str) {
        Unit unit;
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 113;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            tossModule.onWarmupCompleted(str);
            unit = Unit.INSTANCE;
            int i3 = 58 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            tossModule.onWarmupCompleted(str);
            unit = Unit.INSTANCE;
        }
        int i4 = setEngagementSignalsCallback + 113;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public final void onNavigationEvent(@NotNull ReactApplicationContext reactApplicationContext, @NotNull String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        Intrinsics.checkNotNullParameter(str, "");
        int iIdentityHashCode = System.identityHashCode(reactApplicationContext);
        Integer num = this.newSessionWithExtras;
        if (num != null && num.intValue() == iIdentityHashCode) {
            int i2 = requestPostMessageChannel + 45;
            setEngagementSignalsCallback = i2 % 128;
            int i3 = i2 % 2;
            TossModule tossModule = this.newAuthTabSession;
            if (tossModule != null) {
                ICustomTabsServiceDefault().onNavigationEvent(str, tossModule);
                int i4 = setEngagementSignalsCallback + 67;
                requestPostMessageChannel = i4 % 128;
                int i5 = i4 % 2;
            }
            int i6 = setEngagementSignalsCallback + 59;
            requestPostMessageChannel = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        IPostMessageServiceDefault();
        MaxFullscreenAdImplExternalSyntheticLambda9 maxFullscreenAdImplExternalSyntheticLambda9IEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub();
        final TossModule tossModule2 = new TossModule(reactApplicationContext, ICustomTabsService_Parcel(), new WeakReference(this), maxFullscreenAdImplExternalSyntheticLambda9IEngagementSignalsCallbackStub.IAuthTabCallbackStub(), maxFullscreenAdImplExternalSyntheticLambda9IEngagementSignalsCallbackStub.onTransact(), maxFullscreenAdImplExternalSyntheticLambda9IEngagementSignalsCallbackStub.IAuthTabCallback(), maxFullscreenAdImplExternalSyntheticLambda9IEngagementSignalsCallbackStub.onExtraCallback(), maxFullscreenAdImplExternalSyntheticLambda9IEngagementSignalsCallbackStub.onWarmupCompleted(), maxFullscreenAdImplExternalSyntheticLambda9IEngagementSignalsCallbackStub.onExtraCallbackWithResult(), maxFullscreenAdImplExternalSyntheticLambda9IEngagementSignalsCallbackStub.IAuthTabCallback_Parcel(), maxFullscreenAdImplExternalSyntheticLambda9IEngagementSignalsCallbackStub.asInterface(), new Function0() { // from class: im.toss.rn.toss.core.portal.PortalServiceActivity$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i8 = 2 % 2;
                int i9 = onWarmupCompleted + 5;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                Object[] objArr = {this.f$0};
                int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
                Boolean boolValueOf = Boolean.valueOf(((Boolean) PortalServiceActivity.onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1933251268, objArr, 1933251270, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult)).booleanValue());
                int i11 = IAuthTabCallback + 49;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                return boolValueOf;
            }
        });
        this.newSessionWithExtras = Integer.valueOf(iIdentityHashCode);
        this.newAuthTabSession = tossModule2;
        getLifecycle().IAuthTabCallback(tossModule2);
        tossModule2.onActivityLayout();
        ICustomTabsServiceDefault().onNavigationEvent(str, tossModule2);
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback = getIconPaddingLeft.IAuthTabCallback.onWarmupCompleted().onExtraCallback(getAdValue.class);
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnExtraCallback, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = jsonReaderUnknownNumberParsingOnExtraCallback.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        this.asInterface.onNavigationEvent(setMessageBytes.onNavigationEvent(jsonReaderUnknownNumberParsingOnWarmupCompleted, new Function1() { // from class: im.toss.rn.toss.core.portal.PortalServiceActivity$$ExternalSyntheticLambda6
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = onExtraCallback + 87;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
                Unit unit = (Unit) PortalServiceActivity.onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 462739652, new Object[]{(Throwable) obj}, -462739645, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
                int i11 = onExtraCallback + 113;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 39 / 0;
                }
                return unit;
            }
        }, (Function0) null, new Function1() { // from class: im.toss.rn.toss.core.portal.PortalServiceActivity$$ExternalSyntheticLambda7
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = onExtraCallbackWithResult + 115;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                Unit unitOnExtraCallback = PortalServiceActivity.onExtraCallback(tossModule2, (getAdValue) obj);
                int i11 = onWarmupCompleted + 53;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 == 0) {
                    return unitOnExtraCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 2, (Object) null));
        TossReactLifecycleEventEmitter tossReactLifecycleEventEmitter = new TossReactLifecycleEventEmitter(new Function1() { // from class: im.toss.rn.toss.core.portal.PortalServiceActivity$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = onWarmupCompleted + 103;
                IAuthTabCallback = i9 % 128;
                Object obj2 = null;
                if (i9 % 2 != 0) {
                    Object[] objArr = {tossModule2, (String) obj};
                    int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
                    obj2.hashCode();
                    throw null;
                }
                Object[] objArr2 = {tossModule2, (String) obj};
                int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
                Unit unit = (Unit) PortalServiceActivity.onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 246273781, objArr2, -246273771, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
                int i10 = IAuthTabCallback + 21;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 != 0) {
                    return unit;
                }
                obj2.hashCode();
                throw null;
            }
        });
        this.readTypedObject = tossReactLifecycleEventEmitter;
        TossReactLifecycleEventEmitter.Companion.onExtraCallback(this, tossReactLifecycleEventEmitter);
    }

    private final void IPostMessageServiceDefault() {
        int i = 2 % 2;
        TossModule tossModule = this.newAuthTabSession;
        if (tossModule != null) {
            int i2 = setEngagementSignalsCallback + 71;
            requestPostMessageChannel = i2 % 128;
            int i3 = i2 % 2;
            getLifecycle().onExtraCallbackWithResult(tossModule);
            TossModule.onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1769724583, new Object[]{tossModule}, -1769724580, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        }
        TossReactLifecycleEventEmitter tossReactLifecycleEventEmitter = this.readTypedObject;
        if (tossReactLifecycleEventEmitter != null) {
            int i4 = setEngagementSignalsCallback + 105;
            requestPostMessageChannel = i4 % 128;
            int i5 = i4 % 2;
            getLifecycle().onExtraCallbackWithResult(tossReactLifecycleEventEmitter);
        }
        this.readTypedObject = null;
        this.asInterface.onExtraCallbackWithResult();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(ReactContext reactContext) throws Throwable {
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 61;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        if (reactContext.hasActiveReactInstance()) {
            Integer numOnWarmupCompleted = ICustomTabsServiceDefault().onWarmupCompleted();
            if (numOnWarmupCompleted == null) {
                return;
            }
            ReactApplicationContext reactApplicationContext = reactContext instanceof ReactApplicationContext ? (ReactApplicationContext) reactContext : null;
            if (reactApplicationContext == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String str = this.ICustomTabsService;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str = null;
            }
            onNavigationEvent(reactApplicationContext, str);
            int iIdentityHashCode = System.identityHashCode(reactContext);
            Integer num = this.IAuthTabCallbackStub;
            if (num == null || num.intValue() != iIdentityHashCode) {
                PortalHostView portalHostView = this.writeTypedObject;
                if (portalHostView != null) {
                    portalHostView.setName((String) null);
                }
                PortalReactRootView portalReactRootView = this.onPostMessage;
                if (portalReactRootView != null) {
                    portalReactRootView.removeAllViews();
                    int i4 = setEngagementSignalsCallback + 125;
                    requestPostMessageChannel = i4 % 128;
                    int i5 = i4 % 2;
                }
                IPostMessageServiceStubProxy().removeAllViews();
                int iIntValue = numOnWarmupCompleted.intValue();
                Object[] objArr = new Object[1];
                a(TextUtils.getOffsetBefore("", 0), TextUtils.indexOf("", "", 0) + 6, (char) (40528 - (Process.myTid() >> 22)), objArr);
                CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2 = new CredentialProviderGetSignInIntentControllerhandleResponse2(reactApplicationContext, this, ((String) objArr[0]).intern(), iIntValue);
                ReactHost reactHostIAuthTabCallbackStub = ICustomTabsServiceDefault().IAuthTabCallbackStub();
                int iIntValue2 = numOnWarmupCompleted.intValue();
                Object[] objArr2 = new Object[1];
                a(ViewConfiguration.getLongPressTimeout() >> 16, TextUtils.indexOf("", "", 0, 0) + 6, (char) (40528 - (ViewConfiguration.getWindowTouchSlop() >> 8)), objArr2);
                PortalReactRootView portalReactRootView2 = new PortalReactRootView(credentialProviderGetSignInIntentControllerhandleResponse2, reactHostIAuthTabCallbackStub, iIntValue2, ((String) objArr2[0]).intern());
                IPostMessageServiceStubProxy().addView((View) portalReactRootView2, (ViewGroup.LayoutParams) new FrameLayout.LayoutParams(-1, -1));
                final PortalHostView portalHostView2 = new PortalHostView(credentialProviderGetSignInIntentControllerhandleResponse2);
                portalHostView2.setId(R.id.portal_host_view);
                portalReactRootView2.addView(portalHostView2, new FrameLayout.LayoutParams(-1, -1));
                this.IAuthTabCallbackStub = Integer.valueOf(iIdentityHashCode);
                this.onPostMessage = portalReactRootView2;
                this.writeTypedObject = portalHostView2;
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                portalReactRootView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: im.toss.rn.toss.core.portal.PortalServiceActivity$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                        int i14 = 2 % 2;
                        int i15 = onNavigationEvent + 61;
                        onExtraCallbackWithResult = i15 % 128;
                        int i16 = i15 % 2;
                        PortalServiceActivity.onWarmupCompleted(this.f$0, booleanRef, portalHostView2, view, i6, i7, i8, i9, i10, i11, i12, i13);
                        int i17 = onNavigationEvent + 51;
                        onExtraCallbackWithResult = i17 % 128;
                        int i18 = i17 % 2;
                    }
                });
                getActiveNotifications();
                return;
            }
        }
        int i6 = setEngagementSignalsCallback + 123;
        requestPostMessageChannel = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 46 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(PortalServiceActivity portalServiceActivity, Ref.BooleanRef booleanRef, PortalHostView portalHostView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        String str;
        int i9 = 2 % 2;
        int i10 = i3 - i;
        int i11 = i4 - i2;
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailedICustomTabsServiceDefault = portalServiceActivity.ICustomTabsServiceDefault();
        String str2 = portalServiceActivity.ICustomTabsService;
        String str3 = null;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str2 = null;
        }
        oninterstitialaddisplayfailedICustomTabsServiceDefault.onExtraCallbackWithResult(str2, i10, i11);
        if (!booleanRef.element && portalHostView.isAttachedToWindow() && i10 > 0 && i11 > 0) {
            int i12 = requestPostMessageChannel + 53;
            setEngagementSignalsCallback = i12 % 128;
            if (i12 % 2 != 0) {
                booleanRef.element = false;
                str = portalServiceActivity.ICustomTabsService;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i13 = setEngagementSignalsCallback + 31;
                    requestPostMessageChannel = i13 % 128;
                    int i14 = i13 % 2;
                    str = null;
                }
                portalHostView.setName(str);
            } else {
                booleanRef.element = true;
                str = portalServiceActivity.ICustomTabsService;
                if (str == null) {
                }
                portalHostView.setName(str);
            }
        }
        if (booleanRef.element) {
            getItemDelegate getitemdelegate = getItemDelegate.onExtraCallbackWithResult;
            String str4 = portalServiceActivity.ICustomTabsService;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                str3 = str4;
            }
            getitemdelegate.onNavigationEvent(str3);
        }
    }

    private final void read() {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = requestPostMessageChannel + 5;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        ITrustedWebActivityCallbackStubProxy delegate = getDelegate();
        String strAsInterface = ITrustedWebActivityCallbackStub().asInterface();
        if (Intrinsics.areEqual(strAsInterface, "dark")) {
            int i5 = requestPostMessageChannel + 67;
            setEngagementSignalsCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            i = Intrinsics.areEqual(strAsInterface, "light") ? 1 : -100;
        }
        delegate.onNavigationEvent(i);
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        PortalServiceActivity portalServiceActivity = (PortalServiceActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback;
        int i3 = i2 + 39;
        requestPostMessageChannel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 80 / 0;
            if (portalServiceActivity.newSession) {
                return null;
            }
        } else if (portalServiceActivity.newSession) {
            return null;
        }
        if (!portalServiceActivity.access000) {
            return null;
        }
        int i5 = i2 + 89;
        requestPostMessageChannel = i5 % 128;
        int i6 = i5 % 2;
        portalServiceActivity.newSession = true;
        portalServiceActivity.IPostMessageServiceStubProxy().removeCallbacks(portalServiceActivity.postMessage);
        portalServiceActivity.notifyNotificationWithChannel();
        portalServiceActivity.IPostMessageService().onNavigationEvent.onExtraCallbackWithResult();
        return null;
    }

    private final void ITrustedWebActivityCallback_Parcel() throws Throwable {
        int i = 2 % 2;
        if (!this.newSession) {
            onAppOpenAdLoadFailed.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onAppOpenAdLoadFailed.onWarmupCompleted.onExtraCallbackWithResult(this.writeTypedObject, this.access100);
            onwarmupcompletedOnExtraCallbackWithResult.onWarmupCompleted();
            SystemClock.elapsedRealtime();
            onwarmupcompletedOnExtraCallbackWithResult.onExtraCallbackWithResult();
            int i2 = setEngagementSignalsCallback + 63;
            requestPostMessageChannel = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = requestPostMessageChannel + 61;
        setEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void areNotificationsEnabled() {
        Object obj;
        String strIAuthTabCallback;
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 67;
        requestPostMessageChannel = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (!this.newSession) {
            try {
                Result.Companion companion = Result.Companion;
                onAppOpenAdLoadFailed.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onAppOpenAdLoadFailed.onWarmupCompleted.onExtraCallbackWithResult(this.writeTypedObject, this.access100);
                r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs r8lambdaxc7xafnircae5ge7mvkfmdsqbs = r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onWarmupCompleted;
                Object[] objArr = new Object[1];
                a(View.MeasureSpec.makeMeasureSpec(0, 0) + 12, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022795).substring(0, 6).codePointAt(2) - 93, (char) KeyEvent.getDeadChar(0, 0), objArr);
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), onwarmupcompletedOnExtraCallbackWithResult.onNavigationEvent());
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("reasonDetail", onwarmupcompletedOnExtraCallbackWithResult.onExtraCallbackWithResult());
                onAppOpenAdHidden onappopenadhidden = this.ICustomTabsCallback_Parcel;
                if (onappopenadhidden != null) {
                    if (onappopenadhidden == null) {
                        int i3 = setEngagementSignalsCallback + 113;
                        requestPostMessageChannel = i3 % 128;
                        int i4 = i3 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        onappopenadhidden = null;
                    }
                    strIAuthTabCallback = onappopenadhidden.IAuthTabCallback();
                } else {
                    strIAuthTabCallback = null;
                }
                Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("serviceName", strIAuthTabCallback);
                String str = this.ICustomTabsService;
                if (str == null) {
                    str = null;
                    Object[] objArr2 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019673).substring(0, 92).length() - 74, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr2);
                    r8lambdaxc7xafnircae5ge7mvkfmdsqbs.IAuthTabCallback("mono_hermes_skeleton_timeout", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str), getWrite.IAuthTabCallback("entryPoint", IEngagementSignalsCallback_Parcel()), getWrite.IAuthTabCallback("runtimeState", ICustomTabsServiceDefault().asInterface()), getWrite.IAuthTabCallback("elapsedMs", Long.valueOf(SystemClock.elapsedRealtime() - this.IAuthTabCallback_Parcel))}));
                    obj = Result.constructor-impl(Unit.INSTANCE);
                } else {
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str = null;
                    }
                    Object[] objArr22 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019673).substring(0, 92).length() - 74, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr22);
                    r8lambdaxc7xafnircae5ge7mvkfmdsqbs.IAuthTabCallback("mono_hermes_skeleton_timeout", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback(((String) objArr22[0]).intern(), str), getWrite.IAuthTabCallback("entryPoint", IEngagementSignalsCallback_Parcel()), getWrite.IAuthTabCallback("runtimeState", ICustomTabsServiceDefault().asInterface()), getWrite.IAuthTabCallback("elapsedMs", Long.valueOf(SystemClock.elapsedRealtime() - this.IAuthTabCallback_Parcel))}));
                    obj = Result.constructor-impl(Unit.INSTANCE);
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onWarmupCompleted.onWarmupCompleted("mono_hermes_skeleton_timeout", th2);
            }
        }
    }

    public static final class onWarmupCompleted implements ViewTreeObserver.OnPreDrawListener {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        onWarmupCompleted() {
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0043  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onPreDraw() throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                PortalServiceActivity.onTransact(PortalServiceActivity.this);
                PortalServiceActivity.onExtraCallback(PortalServiceActivity.this, 0);
                if (r8lambdayDPuBF8wSyjklQIWh1vEa1fyo.IAuthTabCallback.IAuthTabCallback((ViewGroup) PortalServiceActivity.IAuthTabCallbackDefault(PortalServiceActivity.this))) {
                    PortalServiceActivity.extraCallback(PortalServiceActivity.this);
                    PortalServiceActivity.extraCallbackWithResult(PortalServiceActivity.this);
                    int i3 = onExtraCallbackWithResult + 17;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 4 / 5;
                    }
                }
            } else {
                PortalServiceActivity.onExtraCallback(PortalServiceActivity.this, PortalServiceActivity.onTransact(PortalServiceActivity.this) + 1);
                if (r8lambdayDPuBF8wSyjklQIWh1vEa1fyo.IAuthTabCallback.IAuthTabCallback((ViewGroup) PortalServiceActivity.IAuthTabCallbackDefault(PortalServiceActivity.this))) {
                }
            }
            return true;
        }
    }

    private final void getSmallIconId() {
        int i = 2 % 2;
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted();
        this.getInterfaceDescriptor = onwarmupcompleted;
        IPostMessageServiceStubProxy().getViewTreeObserver().addOnPreDrawListener(onwarmupcompleted);
        int i2 = requestPostMessageChannel + 31;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void notifyNotificationWithChannel() {
        int i = 2 % 2;
        if (this.access000) {
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.getInterfaceDescriptor;
            if (onPreDrawListener != null) {
                int i2 = setEngagementSignalsCallback + 17;
                requestPostMessageChannel = i2 % 128;
                int i3 = i2 % 2;
                if (IPostMessageServiceStubProxy().getViewTreeObserver().isAlive()) {
                    IPostMessageServiceStubProxy().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
                }
            }
            this.getInterfaceDescriptor = null;
            int i4 = requestPostMessageChannel + 69;
            setEngagementSignalsCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 28 / 0;
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        PortalServiceActivity portalServiceActivity = (PortalServiceActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setEngagementSignalsCallback + 19;
        requestPostMessageChannel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.areEqual(portalServiceActivity.ITrustedWebActivityCallbackStub().asBinder(), TdsSkeletonV1View.IAuthTabCallback.IAuthTabCallbackStub.onWarmupCompleted);
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(portalServiceActivity.ITrustedWebActivityCallbackStub().asBinder(), TdsSkeletonV1View.IAuthTabCallback.IAuthTabCallbackStub.onWarmupCompleted)) {
            portalServiceActivity.IPostMessageService().onNavigationEvent.setSkeletonType(portalServiceActivity.ITrustedWebActivityCallbackStub().asBinder());
            TdsSkeletonV1View tdsSkeletonV1View = portalServiceActivity.IPostMessageService().onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsSkeletonV1View, "");
            tdsSkeletonV1View.setVisibility(0);
            portalServiceActivity.getSmallIconId();
            portalServiceActivity.IPostMessageServiceStubProxy().postDelayed(portalServiceActivity.postMessage, 10000L);
            int i3 = setEngagementSignalsCallback + 11;
            requestPostMessageChannel = i3 % 128;
            int i4 = i3 % 2;
        }
        return null;
    }

    private final void ITrustedWebActivityServiceDefault() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 75;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        if (onExtraCallbackWithResult.onExtraCallbackWithResult[ITrustedWebActivityCallbackStub().onWarmupCompleted().ordinal()] == 1) {
            int i4 = requestPostMessageChannel + 97;
            setEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
            AppBarLayout appBarLayout = IPostMessageService().onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(appBarLayout, "");
            appBarLayout.setVisibility(0);
            setSupportActionBar(IPostMessageService().onExtraCallback);
            IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                int i6 = setEngagementSignalsCallback + 117;
                requestPostMessageChannel = i6 % 128;
                int i7 = i6 % 2;
                supportActionBar.onNavigationEvent(true);
            }
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int iArgb;
        PortalServiceActivity portalServiceActivity = (PortalServiceActivity) objArr[0];
        Window window = (Window) objArr[1];
        int i = 2 % 2;
        RepeatableSpec.onExtraCallbackWithResult(window, false);
        boolean z = (portalServiceActivity.getResources().getConfiguration().uiMode & 48) == 32;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            int i3 = requestPostMessageChannel + 11;
            setEngagementSignalsCallback = i3 % 128;
            int i4 = i3 % 2;
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(true);
        }
        window.setStatusBarColor(0);
        if (i2 < 29) {
            int i5 = setEngagementSignalsCallback + 73;
            requestPostMessageChannel = i5 % 128;
            int i6 = i5 % 2;
            iArgb = Color.argb(128, 27, 27, 27);
        } else {
            iArgb = 0;
        }
        window.setNavigationBarColor(iArgb);
        SuspendAnimationKtExternalSyntheticLambda0 suspendAnimationKtExternalSyntheticLambda0 = new SuspendAnimationKtExternalSyntheticLambda0(window, window.getDecorView());
        boolean z2 = !z;
        suspendAnimationKtExternalSyntheticLambda0.onNavigationEvent(z2);
        suspendAnimationKtExternalSyntheticLambda0.IAuthTabCallback(z2);
        if (i2 >= 28) {
            extraCallbackWithResult.onExtraCallbackWithResult(window.getAttributes(), i2 >= 30 ? 3 : 1);
            int i7 = requestPostMessageChannel + 37;
            setEngagementSignalsCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = setEngagementSignalsCallback + 59;
        requestPostMessageChannel = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 89 / 0;
        }
        return null;
    }

    public static final class onExtraCallback {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final void onExtraCallbackWithResult(@NotNull Context context, @NotNull Intent intent) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(intent, "");
            intent.setComponent(new ComponentName(context, (Class<?>) PortalServiceActivity.class));
            int i2 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    private final WindowInsetsCompat onWarmupCompleted(WindowInsetsCompat windowInsetsCompat, int i) {
        int i2 = 2 % 2;
        WindowInsetsCompat.onWarmupCompleted onwarmupcompleted = new WindowInsetsCompat.onWarmupCompleted(windowInsetsCompat);
        int i3 = requestPostMessageChannel + 105;
        setEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        while (i != 0) {
            int i5 = requestPostMessageChannel + 27;
            setEngagementSignalsCallback = i5 % 128;
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

    public static /* synthetic */ ReactHostVisibleStateObserver IAuthTabCallback(PortalServiceActivity portalServiceActivity) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (ReactHostVisibleStateObserver) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -8243766, new Object[]{portalServiceActivity}, 8243779, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TossModule tossModule, String str) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 246273781, new Object[]{tossModule, str}, -246273771, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ boolean onNavigationEvent(PortalServiceActivity portalServiceActivity) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return ((Boolean) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1933251268, new Object[]{portalServiceActivity}, 1933251270, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).booleanValue();
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 462739652, new Object[]{th}, -462739645, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ onAppOpenAdDisplayFailed IAuthTabCallbackStub(PortalServiceActivity portalServiceActivity) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (onAppOpenAdDisplayFailed) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1006136401, new Object[]{portalServiceActivity}, -1006136387, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ void onExtraCallback(PortalServiceActivity portalServiceActivity, ReactContext reactContext) throws Throwable {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 693781343, new Object[]{portalServiceActivity, reactContext}, -693781343, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ String access000(PortalServiceActivity portalServiceActivity) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (String) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1683970628, new Object[]{portalServiceActivity}, 1683970633, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    private final void onWarmupCompleted(Window window) throws Throwable {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1522245971, new Object[]{this, window}, 1522245975, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    static /* synthetic */ void onExtraCallbackWithResult(PortalServiceActivity portalServiceActivity, String str, String str2, String str3, int i, Object obj) throws Throwable {
        Object[] objArr = {portalServiceActivity, str, str2, str3, Integer.valueOf(i), obj};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1638039613, objArr, 1638039625, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private final boolean cancelNotification() {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return ((Boolean) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1105728117, new Object[]{this}, 1105728120, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).booleanValue();
    }

    private final void ITrustedWebActivityService() throws Throwable {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 774480072;
        onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), TransferShareSummary.Companion.IAuthTabCallback(), 2005138004, new Object[]{this}, -2005137993, iCodePointAt, iOnExtraCallbackWithResult);
    }

    private static final onAppOpenAdDisplayFailed ICustomTabsCallback(PortalServiceActivity portalServiceActivity) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (onAppOpenAdDisplayFailed) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1698031115, new Object[]{portalServiceActivity}, -1698031109, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    private static final ReactHostVisibleStateObserver onMessageChannelReady(PortalServiceActivity portalServiceActivity) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (ReactHostVisibleStateObserver) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 91163668, new Object[]{portalServiceActivity}, -91163659, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    private final void getSmallIconBitmap() throws Throwable {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1834298170, new Object[]{this}, 1834298171, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    public final zzad ICustomTabsServiceStub() {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (zzad) onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 2000011400, new Object[]{this}, -2000011392, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    @Override // im.toss.rn.toss.core.portal.Hilt_PortalServiceActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 49;
        setEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = setEngagementSignalsCallback + 93;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void onSessionEnded() {
        requestPostMessageChannelWithExtras = new char[]{29687, 31933, 27975, 24069, 20133, 16245, 60839, 58086, 62238, 49218, 53501, 41252, 60838, 58080, 62231, 49236, 53503, 41263, 60839, 58080, 62213, 49236, 53497, 41262, 46684, 34474, 38712, 60855, 58090, 62212, 49218};
        prefetchWithMultipleUrls = 1896932080836207237L;
    }
}
