package im.toss.rn.toss.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactInstanceEventListener;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.runtime.ReactSurfaceView;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.gms.internal.ads.zzgc;
import com.google.gson.JsonElement;
import com.swmansion.rnscreens.fragment.restoration.RNScreensFragmentFactory;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import im.toss.features.tosscert.ui.R;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.rn.granite.android.video.TossExoPlayerProvider;
import im.toss.rn.spec.bundle.TossReactBundleMeta;
import im.toss.rn.spec.log.ReactLogKt;
import im.toss.rn.toss.core.TossReactNativeFragment$;
import im.toss.rn.toss.core.common.handler.ReactBackPressHandler;
import im.toss.rn.toss.core.common.util.ReactHostUnexpectedDestroyDetector;
import im.toss.rn.toss.core.common.util.TossReactLifecycleEventEmitter;
import im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner;
import im.toss.rn.toss.core.observability.ReactNativeRouteKey;
import im.toss.rn.toss.core.observability.ReactNativeRouteLcpSessionManager;
import im.toss.rn.toss.core.observability.ReactNativeScreenServiceHost;
import im.toss.rn.toss.core.observability.RnPhaseObserver;
import im.toss.rn.toss.core.util.RnAppVersion;
import im.toss.rn.toss.core.webview.TossAppServiceWebViewProvider;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda18;
import im.toss.tds.view.R;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import im.toss.utils.RxUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import o.AnnotatedStringKtExternalSyntheticLambda2;
import o.AnnotatedStringKtExternalSyntheticLambda3;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BeginGetCredentialUtilCompanionExternalSyntheticLambda13;
import o.CameraControllerExternalSyntheticLambda0;
import o.CertToolkitMgrRevokeReason;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.JsonReaderUnknownNumberParsing;
import o.JvmAnnotatedString_jvmAndAndroidKtExternalSyntheticLambda0;
import o.MaxFullscreenAdImpl;
import o.MaxFullscreenAdImplExternalSyntheticLambda4;
import o.MaxFullscreenAdImplExternalSyntheticLambda8;
import o.MaxFullscreenAdImplExternalSyntheticLambda9;
import o.MaxFullscreenAdImpla;
import o.MaxNativeAdImpl;
import o.RawQueries;
import o.RenderInTransitionOverlayNodeElement;
import o.ResourceResolutionException;
import o.Response;
import o.Role;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.UserChoiceBillingListener;
import o.WebSocketFactory;
import o.WrappedCompositionsetContent1ExternalSyntheticLambda0;
import o._string;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access14600;
import o.access15400;
import o.access8100;
import o.calculateMaxTextSize;
import o.createAdListenerWrapper;
import o.d0a;
import o.d1a;
import o.d1aa;
import o.decryptForPrivateKey;
import o.deserializeUriCollection;
import o.doGet;
import o.findResAndMsg;
import o.getAdValue;
import o.getAdViewTracker;
import o.getByteBuffer;
import o.getClickableViews;
import o.getIconPaddingLeft;
import o.getPackageType;
import o.getResRootDir;
import o.getSignForPKCS7AppCertAndVIDR;
import o.getSignForPKCS7NoContents;
import o.getTitleResource;
import o.getWrite;
import o.hExternalSyntheticLambda4;
import o.hbExternalSyntheticLambda0;
import o.hbExternalSyntheticLambda1;
import o.hbExternalSyntheticLambda11;
import o.hbExternalSyntheticLambda13;
import o.hbExternalSyntheticLambda14;
import o.hbExternalSyntheticLambda2;
import o.hbExternalSyntheticLambda4;
import o.hbExternalSyntheticLambda6;
import o.hbExternalSyntheticLambda8;
import o.hbExternalSyntheticLambda9;
import o.hcExternalSyntheticLambda0;
import o.hd;
import o.isValidCertNum;
import o.logicVerifyID;
import o.maybeRemoveAttachStateListener;
import o.maybeReportErrorFromResultReceiver;
import o.n0a;
import o.n0b;
import o.n0c;
import o.n1;
import o.n1a;
import o.n2;
import o.n3;
import o.n5;
import o.n6;
import o.n6a;
import o.n6b;
import o.n7;
import o.o0a;
import o.o3;
import o.o4;
import o.onAdExpired;
import o.onRewardedAdDisplayFailed;
import o.onRewardedAdLoaded;
import o.pauseMyRequest;
import o.pkcs5PBKDF2;
import o.r8lambda3VLBDMfcFBq3y6wAYf87R7p92xc;
import o.r8lambda3Y0aFlZwA9jpnWeqrtfX4xUpOIo;
import o.r8lambda4EHrnZ9SU_UFWvZy_trwQUIGDEE;
import o.r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI;
import o.r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos;
import o.r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs;
import o.r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE;
import o.r8lambdamcqktAFDi57MiJ6JrSi643BXOs;
import o.r8lambdaoYv_xINqzW0mQQBhO2XztvZdhxY;
import o.r8lambdazEE87_eOcM6r8CSxRypzeFrfpxs;
import o.r8lambdazHtRG_L3e9EUlKNiS_FUXM65OBo;
import o.readFileToByteArray;
import o.setMessageBytes;
import o.setPanelSlideListener;
import o.setResourceInternal;
import o.setShadowDrawableRight;
import o.setTid;
import o.setTimestampBytes;
import o.showAd;
import o.startApp;
import o.transExportCert;
import o.transFinalize;
import o.transGenerateCertNum;
import o.transGetKmCert;
import o.transImportCert;
import o.transV2ExportCert;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import run.granite.DefaultLoadingView;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TossReactNativeFragment extends Hilt_TossReactNativeFragment implements TossReactWebViewContentOwner, WrappedCompositionsetContent1ExternalSyntheticLambda0, transFinalize, ReactNativeScreenServiceHost {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static int ICustomTabsServiceStubProxy = 0;
    private static int ICustomTabsService_Parcel = 1;
    private static long IEngagementSignalsCallback = 0;
    private static int access200 = 0;
    private static final List<String> onExtraCallbackWithResult;
    private static int writeTypedList = 1;
    private WeakReference<TossReactWebViewContentOwner> IAuthTabCallback;
    private final long IAuthTabCallbackDefault;
    private Function1<? super Throwable, Boolean> IAuthTabCallbackStub;
    private volatile boolean IAuthTabCallback_Parcel;
    private boolean ICustomTabsCallback;
    private DefaultLifecycleObserver ICustomTabsCallbackDefault;
    private Function1<? super hbExternalSyntheticLambda4, Unit> ICustomTabsCallbackStub;
    private Function0<Unit> ICustomTabsCallback_Parcel;
    private ReactInstanceEventListener ICustomTabsService;
    private final List<WeakReference<startApp>> ICustomTabsServiceDefault;
    private volatile String access000;
    private Integer access100;
    private boolean asBinder;
    private GraniteBrownfieldModule asInterface;
    private final ReactHostUnexpectedDestroyDetector extraCallback;
    private TossReactLifecycleEventEmitter extraCallbackWithResult;
    private boolean getInterfaceDescriptor;
    private Function0<Boolean> mayLaunchUrl;
    private FrameLayout newAuthTabSession;
    private boolean onActivityResized;
    private final Lazy onExtraCallback;
    private onNavigationEvent onMinimized;
    private Function0<Unit> onRelationshipValidationResult;
    private Function1<? super hbExternalSyntheticLambda2, Unit> onUnminimized;
    private final boolean onWarmupCompleted;
    private hbExternalSyntheticLambda8 postMessage;
    private final setTimestampBytes<Boolean> prefetch;
    private Function0<? extends ReactHost> prefetchWithMultipleUrls;

    @Inject
    public ReactNativeRouteLcpSessionManager reactNativeRouteLcpSessions;
    private final boolean readTypedObject;
    private onExtraCallback requestPostMessageChannel;
    private MaxFullscreenAdImplExternalSyntheticLambda4 requestPostMessageChannelWithExtras;

    @Inject
    public RnPhaseObserver rnPhaseObserver;
    private MaxFullscreenAdImplExternalSyntheticLambda9 setEngagementSignalsCallback;

    @Inject
    public r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE tossReactMessageHandlerManager;
    private boolean updateVisuals;
    private pauseMyRequest<Unit> validateRelationship;
    private TossModule warmup;
    private boolean writeTypedObject;
    private ReactBackPressHandler extraCommand = new ReactBackPressHandler(new IAuthTabCallback_Parcel(this));
    private final AtomicBoolean isEngagementSignalsApiAvailable = new AtomicBoolean(false);
    private final r8lambdazEE87_eOcM6r8CSxRypzeFrfpxs ICustomTabsServiceStub = new r8lambdazEE87_eOcM6r8CSxRypzeFrfpxs();
    private final AtomicBoolean receiveFile = new AtomicBoolean(false);
    private final Object onPostMessage = new Object();
    private final AtomicBoolean ICustomTabsCallbackStubProxy = new AtomicBoolean(false);
    private final hbExternalSyntheticLambda14 onActivityLayout = new hbExternalSyntheticLambda14(new Function0() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda49
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            WindowManager windowManagerOnTransact = TossReactNativeFragment.onTransact(this.f$0);
            int i4 = onNavigationEvent + 105;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return windowManagerOnTransact;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });
    private final ResourceResolutionException onMessageChannelReady = new ResourceResolutionException();
    private final transExportCert onTransact = new transExportCert();
    private final deserializeUriCollection onNavigationEvent = new deserializeUriCollection();
    private SparseArray<Parcelable> IAuthTabCallbackStubProxy = new SparseArray<>();
    private final Object newSessionWithExtras = new Object();
    private volatile MaxFullscreenAdImplExternalSyntheticLambda8 newSession = new MaxFullscreenAdImplExternalSyntheticLambda8(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 4194303, null);

    static final class IAuthTabCallbackDefault extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        long J$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = TossReactNativeFragment.this.onNavigationEvent(0L, (access13800<? super Boolean>) this);
            int i4 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }
    }

    static final class access000 extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        access000(access13800<? super access000> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            TossReactNativeFragment tossReactNativeFragment = TossReactNativeFragment.this;
            if (i3 == 0) {
                return tossReactNativeFragment.onNavigationEvent((n3) null, (hcExternalSyntheticLambda0) null, (access13800<? super Boolean>) this);
            }
            tossReactNativeFragment.onNavigationEvent((n3) null, (hcExternalSyntheticLambda0) null, (access13800<? super Boolean>) this);
            throw null;
        }
    }

    public static final /* synthetic */ class asInterface {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallbackWithResult = 1;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[o0a.values().length];
            try {
                iArr[o0a.Service.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o0a.Shared.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
            int[] iArr2 = new int[n0a.values().length];
            try {
                iArr2[n0a.NotRequested.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[n0a.Loading.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[n0a.Loaded.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[n0a.Failed.ordinal()] = 4;
                int i = onWarmupCompleted + 59;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            IAuthTabCallback = iArr2;
            int i4 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ WindowInsetsCompat IAuthTabCallback(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = writeTypedList + 9;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        WindowInsetsCompat windowInsetsCompatOnExtraCallbackWithResult = onExtraCallbackWithResult(view, windowInsetsCompat);
        int i4 = access200 + 101;
        writeTypedList = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return windowInsetsCompatOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TossReactNativeFragment tossReactNativeFragment, FrameLayout frameLayout) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedList + 47;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(tossReactNativeFragment, frameLayout);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(tossReactNativeFragment, frameLayout);
        int i3 = writeTypedList + 85;
        access200 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 28 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8 IAuthTabCallback(MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = writeTypedList + 45;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8OnTransact = onTransact(maxFullscreenAdImplExternalSyntheticLambda8);
        int i4 = access200 + 99;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return maxFullscreenAdImplExternalSyntheticLambda8OnTransact;
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8 IAuthTabCallback(hbExternalSyntheticLambda2 hbexternalsyntheticlambda2, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = access200 + 1;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8OnExtraCallback = onExtraCallback(hbexternalsyntheticlambda2, maxFullscreenAdImplExternalSyntheticLambda8);
        int i4 = access200 + 117;
        writeTypedList = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return maxFullscreenAdImplExternalSyntheticLambda8OnExtraCallback;
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8 IAuthTabCallback(n0c n0cVar, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = access200 + 89;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8OnNavigationEvent = onNavigationEvent(n0cVar, maxFullscreenAdImplExternalSyntheticLambda8);
        int i4 = writeTypedList + 81;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        return maxFullscreenAdImplExternalSyntheticLambda8OnNavigationEvent;
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8 IAuthTabCallback(r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs r8lambdakxm8vml8ayvtemvtk3wjevwfnzs, TossReactNativeFragment tossReactNativeFragment, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = writeTypedList + 123;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8OnExtraCallbackWithResult = onExtraCallbackWithResult(r8lambdakxm8vml8ayvtemvtk3wjevwfnzs, tossReactNativeFragment, maxFullscreenAdImplExternalSyntheticLambda8);
        int i4 = writeTypedList + 71;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        return maxFullscreenAdImplExternalSyntheticLambda8OnExtraCallbackWithResult;
    }

    public static /* synthetic */ n5 IAuthTabCallback(n5 n5Var) {
        int i = 2 % 2;
        int i2 = access200 + 125;
        writeTypedList = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder(n5Var);
        }
        asBinder(n5Var);
        throw null;
    }

    public static /* synthetic */ n5 IAuthTabCallback(n5 n5Var, n5 n5Var2) {
        int i = 2 % 2;
        int i2 = access200 + 69;
        writeTypedList = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(n5Var, n5Var2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        n5 n5VarOnExtraCallback = onExtraCallback(n5Var, n5Var2);
        int i3 = writeTypedList + 61;
        access200 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 46 / 0;
        }
        return n5VarOnExtraCallback;
    }

    public static /* synthetic */ boolean IAuthTabCallback(TossReactNativeFragment tossReactNativeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedList + 125;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        boolean zICustomTabsCallbackDefault = ICustomTabsCallbackDefault(tossReactNativeFragment);
        int i4 = access200 + 91;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return zICustomTabsCallbackDefault;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        int i = 2 % 2;
        int i2 = access200 + 67;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        getSignForPKCS7NoContents getsignforpkcs7nocontentsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        int i4 = access200 + 13;
        writeTypedList = i4 % 128;
        if (i4 % 2 != 0) {
            return getsignforpkcs7nocontentsRemoteActionCompatParcelizer;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(TossReactNativeFragment tossReactNativeFragment) {
        int i = 2 % 2;
        int i2 = access200 + 81;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {tossReactNativeFragment};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult4, objArr, -1177664865, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1177664876);
        int i4 = writeTypedList + 17;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ onAdExpired IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = access200 + 11;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        onAdExpired onadexpiredOnVerticalScrollEvent = onVerticalScrollEvent();
        int i4 = access200 + 115;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return onadexpiredOnVerticalScrollEvent;
    }

    private static /* synthetic */ Object ICustomTabsCallbackDefault(Object[] objArr) {
        Context context = (Context) objArr[0];
        int i = 2 % 2;
        int i2 = access200 + 37;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {context};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        if (i3 == 0) {
            throw null;
        }
        readFileToByteArray readfiletobytearray = (readFileToByteArray) onExtraCallback(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult4, objArr2, -1743637927, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1743637957);
        int i4 = writeTypedList + 57;
        access200 = i4 % 128;
        if (i4 % 2 == 0) {
            return readfiletobytearray;
        }
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback_Parcel(Object[] objArr) {
        MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult = (MaxFullscreenAdImpl.onExtraCallbackWithResult) objArr[0];
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos = (r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos) objArr[1];
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos2 = (r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos) objArr[2];
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8 = (MaxFullscreenAdImplExternalSyntheticLambda8) objArr[3];
        int i = 2 % 2;
        int i2 = writeTypedList + 57;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8OnNavigationEvent = onNavigationEvent(onextracallbackwithresult, r8lambdadtqrzfihm2ghoddvkfg5vm2yos, r8lambdadtqrzfihm2ghoddvkfg5vm2yos2, maxFullscreenAdImplExternalSyntheticLambda8);
        int i4 = writeTypedList + 7;
        access200 = i4 % 128;
        if (i4 % 2 == 0) {
            return maxFullscreenAdImplExternalSyntheticLambda8OnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ transV2ExportCert access000() {
        int i = 2 % 2;
        int i2 = writeTypedList + 117;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        transV2ExportCert transv2exportcert = (transV2ExportCert) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[0], 2083037319, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -2083037271);
        int i4 = access200 + 41;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return transv2exportcert;
    }

    public static /* synthetic */ void access000(TossReactNativeFragment tossReactNativeFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = access200 + 69;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallbackStub(tossReactNativeFragment);
        int i4 = writeTypedList + 35;
        access200 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
    }

    public static /* synthetic */ ReactHost access100(TossReactNativeFragment tossReactNativeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedList + 51;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        ReactHost reactHostOnActivityLayout = onActivityLayout(tossReactNativeFragment);
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        return reactHostOnActivityLayout;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        hbExternalSyntheticLambda4 hbexternalsyntheticlambda4 = (hbExternalSyntheticLambda4) objArr[0];
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8 = (MaxFullscreenAdImplExternalSyntheticLambda8) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedList + 17;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda82 = (MaxFullscreenAdImplExternalSyntheticLambda8) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{hbexternalsyntheticlambda4, maxFullscreenAdImplExternalSyntheticLambda8}, -804124388, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 804124408);
        int i4 = access200 + 43;
        writeTypedList = i4 % 128;
        if (i4 % 2 != 0) {
            return maxFullscreenAdImplExternalSyntheticLambda82;
        }
        throw null;
    }

    public static /* synthetic */ Unit asBinder(TossReactNativeFragment tossReactNativeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedList + 89;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsCallbackStubProxy(tossReactNativeFragment);
            throw null;
        }
        Unit unitICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(tossReactNativeFragment);
        int i3 = writeTypedList + 87;
        access200 = i3 % 128;
        int i4 = i3 % 2;
        return unitICustomTabsCallbackStubProxy;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedList + 1;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnPostMessage = onPostMessage(tossReactNativeFragment);
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        return unitOnPostMessage;
    }

    private static /* synthetic */ Object extraCommand(Object[] objArr) {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedList + 109;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        ReactHost reactHostICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel(tossReactNativeFragment);
        int i4 = access200 + 121;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return reactHostICustomTabsCallback_Parcel;
    }

    private static /* synthetic */ Object newAuthTabSession(Object[] objArr) {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedList + 95;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            onUnminimized(tossReactNativeFragment);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnUnminimized = onUnminimized(tossReactNativeFragment);
        int i3 = access200 + 83;
        writeTypedList = i3 % 128;
        int i4 = i3 % 2;
        return Boolean.valueOf(zOnUnminimized);
    }

    public static /* synthetic */ ReactHost onExtraCallback(ReactHost reactHost) {
        int i = 2 % 2;
        int i2 = writeTypedList + 45;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {reactHost};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        if (i3 != 0) {
            throw null;
        }
        ReactHost reactHost2 = (ReactHost) onExtraCallback(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult4, objArr, -1336324309, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1336324359);
        int i4 = writeTypedList + 61;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        return reactHost2;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        Unit unitOnNavigationEvent;
        Object objOnNavigationEvent;
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~i3;
        int i11 = i9 | (~(i10 | i));
        int i12 = (~(i | i7)) | (~(i8 | i10));
        int i13 = ~(i6 | i3);
        int i14 = i12 | i13;
        int i15 = i13 | i11;
        int i16 = i6 + i3 + i5 + ((-1585779005) * i4) + (640148872 * i2);
        int i17 = i16 * i16;
        int i18 = (i6 * (-1291220770)) + 263398195 + (i3 * (-1291220770)) + (i11 * (-1802)) + (i14 * (-901)) + (i15 * 901) + ((-1291221671) * i5) + ((-1079815989) * i4) + (669414472 * i2) + (i17 * 145489920);
        switch ((i6 * 308833806) + 153878528 + (308833806 * i3) + ((-448846874) * i11) + ((-224423437) * i14) + (224423437 * i15) + (84410368 * i5) + (1159200768 * i4) + ((-734003200) * i2) + (2089549824 * i17) + (i18 * i18 * (-1699479552))) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return asBinder(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return access100(objArr);
            case 11:
                return access000(objArr);
            case 12:
                return getInterfaceDescriptor(objArr);
            case 13:
                return IAuthTabCallbackStubProxy(objArr);
            case 14:
                getAdViewTracker getadviewtracker = (getAdViewTracker) objArr[0];
                MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8 = (MaxFullscreenAdImplExternalSyntheticLambda8) objArr[1];
                int i19 = 2 % 2;
                int i20 = access200 + 123;
                writeTypedList = i20 % 128;
                int i21 = i20 % 2;
                Object[] objArr2 = {getadviewtracker, maxFullscreenAdImplExternalSyntheticLambda8};
                unitOnNavigationEvent = (MaxFullscreenAdImplExternalSyntheticLambda8) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr2, -1456683886, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1456683898);
                int i22 = access200 + 39;
                writeTypedList = i22 % 128;
                int i23 = i22 % 2;
                break;
            case 15:
                return IAuthTabCallback_Parcel(objArr);
            case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda82 = (MaxFullscreenAdImplExternalSyntheticLambda8) objArr[0];
                int i24 = 2 % 2;
                int i25 = access200 + 27;
                writeTypedList = i25 % 128;
                int i26 = i25 % 2;
                Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda82, "");
                unitOnNavigationEvent = (MaxFullscreenAdImplExternalSyntheticLambda8) MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, R.drawable.IAuthTabCallback(), new Object[]{maxFullscreenAdImplExternalSyntheticLambda82, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 3080191, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1651567374);
                int i27 = writeTypedList + 101;
                access200 = i27 % 128;
                int i28 = i27 % 2;
                break;
            case im.toss.tds.view.R.styleable.TdsListRowV1View_centerType /* 17 */:
                return readTypedObject(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_disabledType /* 18 */:
                TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
                ReactSurfaceView reactSurfaceView = (ReactSurfaceView) objArr[1];
                int i29 = 2 % 2;
                int i30 = writeTypedList + 115;
                access200 = i30 % 128;
                int i31 = i30 % 2;
                unitOnNavigationEvent = onNavigationEvent(tossReactNativeFragment, reactSurfaceView);
                int i32 = writeTypedList + 9;
                access200 = i32 % 128;
                int i33 = i32 % 2;
                break;
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftDate /* 19 */:
                return writeTypedObject(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftImage /* 20 */:
                hbExternalSyntheticLambda4 hbexternalsyntheticlambda4 = (hbExternalSyntheticLambda4) objArr[0];
                MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda83 = (MaxFullscreenAdImplExternalSyntheticLambda8) objArr[1];
                int i34 = 2 % 2;
                int i35 = writeTypedList + 113;
                access200 = i35 % 128;
                int i36 = i35 % 2;
                Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda83, "");
                unitOnNavigationEvent = (MaxFullscreenAdImplExternalSyntheticLambda8) MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, R.drawable.IAuthTabCallback(), new Object[]{maxFullscreenAdImplExternalSyntheticLambda83, null, null, null, null, null, null, null, null, null, null, null, null, hbexternalsyntheticlambda4, null, null, null, null, null, null, null, null, false, 4190207, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1651567374);
                int i37 = writeTypedList + 109;
                access200 = i37 % 128;
                int i38 = i37 % 2;
                break;
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftImageColor /* 21 */:
                return ICustomTabsCallback(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftImageHeight /* 22 */:
                return extraCallback(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftImageType /* 23 */:
                return extraCallbackWithResult(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftImageUrl /* 24 */:
                return onActivityResized(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftImageWidth /* 25 */:
                return onPostMessage(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftLottie /* 26 */:
                return onMinimized(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftLottieHeight /* 27 */:
                return onMessageChannelReady(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftLottieRepeatCount /* 28 */:
                TossReactNativeFragment tossReactNativeFragment2 = (TossReactNativeFragment) objArr[0];
                n3 n3Var = (n3) objArr[1];
                int i39 = 2 % 2;
                Intrinsics.checkNotNullParameter(n3Var, "");
                tossReactNativeFragment2.onNavigationEvent("mark_search_entry_fallback_on_warmup_timeout_start", new Pair[0]);
                if (tossReactNativeFragment2.newAuthTabSession().onWarmupCompleted() != hbExternalSyntheticLambda1.Fallback) {
                    if (tossReactNativeFragment2.onTransact(n3Var) == hbExternalSyntheticLambda1.Waiting) {
                        Object[] objArr3 = {tossReactNativeFragment2, new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda37
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            public final Object invoke(Object obj) {
                                int i40 = 2 % 2;
                                int i41 = onExtraCallbackWithResult + 101;
                                IAuthTabCallback = i41 % 128;
                                int i42 = i41 % 2;
                                n5 n5VarIAuthTabCallback = TossReactNativeFragment.IAuthTabCallback((n5) obj);
                                if (i42 != 0) {
                                    int i43 = 45 / 0;
                                }
                                return n5VarIAuthTabCallback;
                            }
                        }};
                        onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr3, -761972630, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 761972649);
                        tossReactNativeFragment2.onNavigationEvent("mark_search_entry_fallback_on_warmup_timeout_success", new Pair[0]);
                        unitOnNavigationEvent = true;
                        break;
                    } else {
                        int i40 = access200 + 33;
                        writeTypedList = i40 % 128;
                        if (i40 % 2 == 0) {
                            Object[] objArr4 = new Object[1];
                            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41491 >> AndroidCharacter.getMirror('+'), objArr4);
                            Pair<String, String>[] pairArr = new Pair[1];
                            pairArr[1] = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), "not_waiting");
                            tossReactNativeFragment2.onNavigationEvent("mark_search_entry_fallback_on_warmup_timeout_skip", pairArr);
                        } else {
                            Object[] objArr5 = new Object[1];
                            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, AndroidCharacter.getMirror('0') + 41491, objArr5);
                            tossReactNativeFragment2.onNavigationEvent("mark_search_entry_fallback_on_warmup_timeout_skip", getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), "not_waiting"));
                        }
                    }
                } else {
                    int i41 = access200 + 43;
                    writeTypedList = i41 % 128;
                    if (i41 % 2 == 0) {
                        Object[] objArr6 = new Object[1];
                        a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41539 / (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr6);
                        Pair<String, String>[] pairArr2 = new Pair[1];
                        pairArr2[1] = getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), "already_fallback");
                        tossReactNativeFragment2.onNavigationEvent("mark_search_entry_fallback_on_warmup_timeout_skip", pairArr2);
                    } else {
                        Object[] objArr7 = new Object[1];
                        a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 41539, objArr7);
                        tossReactNativeFragment2.onNavigationEvent("mark_search_entry_fallback_on_warmup_timeout_skip", getWrite.IAuthTabCallback(((String) objArr7[0]).intern(), "already_fallback"));
                    }
                }
                return false;
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftLottieUrl /* 29 */:
                return onActivityLayout(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftLottieWidth /* 30 */:
                return ICustomTabsCallbackStubProxy(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftRank /* 31 */:
                return ICustomTabsCallbackDefault(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftType /* 32 */:
                return ICustomTabsCallbackStub(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightArrow /* 33 */:
                View view = (View) objArr[1];
                int i42 = 2 % 2;
                TypedValue typedValue = new TypedValue();
                view.getContext().getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                int i43 = typedValue.data;
                int i44 = access200 + 5;
                writeTypedList = i44 % 128;
                int i45 = i44 % 2;
                return Integer.valueOf(i43);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightBadgeText /* 34 */:
                final TossReactNativeFragment tossReactNativeFragment3 = (TossReactNativeFragment) objArr[0];
                final FrameLayout frameLayout = (FrameLayout) objArr[1];
                final n6 n6Var = (n6) objArr[2];
                final n0c.onExtraCallbackWithResult onextracallbackwithresult = (n0c.onExtraCallbackWithResult) objArr[3];
                int i46 = 2 % 2;
                tossReactNativeFragment3.writeTypedObject().onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda53
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke() throws Throwable {
                        int i47 = 2 % 2;
                        int i48 = onExtraCallback + 5;
                        IAuthTabCallback = i48 % 128;
                        int i49 = i48 % 2;
                        Unit unitIAuthTabCallback = TossReactNativeFragment.IAuthTabCallback(this.f$0, frameLayout);
                        int i50 = onExtraCallback + 91;
                        IAuthTabCallback = i50 % 128;
                        int i51 = i50 % 2;
                        return unitIAuthTabCallback;
                    }
                });
                tossReactNativeFragment3.writeTypedObject().onWarmupCompleted(new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda54
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i47 = 2 % 2;
                        int i48 = onExtraCallback + 97;
                        onWarmupCompleted = i48 % 128;
                        int i49 = i48 % 2;
                        Object[] objArr8 = {this.f$0, frameLayout, n6Var, onextracallbackwithresult, (ReactSurfaceView) obj};
                        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                        Unit unit = (Unit) TossReactNativeFragment.onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr8, -238345554, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 238345598);
                        int i50 = onExtraCallback + 75;
                        onWarmupCompleted = i50 % 128;
                        if (i50 % 2 == 0) {
                            int i51 = 22 / 0;
                        }
                        return unit;
                    }
                });
                tossReactNativeFragment3.writeTypedObject().onExtraCallback(new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda55
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) throws Throwable {
                        int i47 = 2 % 2;
                        int i48 = IAuthTabCallback + 71;
                        onNavigationEvent = i48 % 128;
                        int i49 = i48 % 2;
                        TossReactNativeFragment tossReactNativeFragment4 = this.f$0;
                        if (i49 != 0) {
                            return TossReactNativeFragment.onNavigationEvent(tossReactNativeFragment4, frameLayout, n6Var, (Throwable) obj);
                        }
                        TossReactNativeFragment.onNavigationEvent(tossReactNativeFragment4, frameLayout, n6Var, (Throwable) obj);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                });
                int i47 = access200 + 99;
                writeTypedList = i47 % 128;
                int i48 = i47 % 2;
                return null;
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightBreakEnabled /* 35 */:
                return onRelationshipValidationResult(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightButtonDisplay /* 36 */:
                hbExternalSyntheticLambda1 hbexternalsyntheticlambda1 = (hbExternalSyntheticLambda1) objArr[0];
                n5 n5Var = (n5) objArr[1];
                int i49 = 2 % 2;
                int i50 = writeTypedList + 39;
                access200 = i50 % 128;
                int i51 = i50 % 2;
                Intrinsics.checkNotNullParameter(n5Var, "");
                n5 n5VarOnNavigationEvent = n5.onNavigationEvent(n5Var, null, null, null, false, false, hbexternalsyntheticlambda1, 31, null);
                int i52 = writeTypedList + 29;
                access200 = i52 % 128;
                int i53 = i52 % 2;
                return n5VarOnNavigationEvent;
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightButtonLabel /* 37 */:
                return onUnminimized(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightButtonSize /* 38 */:
                return ICustomTabsCallback_Parcel(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightButtonStyle /* 39 */:
                return isEngagementSignalsApiAvailable(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightButtonType /* 40 */:
                return extraCommand(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightCheckBoxChecked /* 41 */:
                return ICustomTabsService(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightCheckBoxType /* 42 */:
                return mayLaunchUrl(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightIcon /* 43 */:
                TossReactNativeFragment tossReactNativeFragment4 = (TossReactNativeFragment) objArr[0];
                int i54 = 2 % 2;
                int i55 = writeTypedList + 69;
                access200 = i55 % 128;
                int i56 = i55 % 2;
                View view2 = tossReactNativeFragment4.getView();
                if (view2 != null) {
                    view2.clearAnimation();
                    int i57 = access200 + 53;
                    writeTypedList = i57 % 128;
                    int i58 = i57 % 2;
                }
                FrameLayout frameLayout2 = tossReactNativeFragment4.newAuthTabSession;
                if (frameLayout2 == null) {
                    return null;
                }
                frameLayout2.clearAnimation();
                return null;
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightIconButtonIconColor /* 44 */:
                return postMessage(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightIconButtonIconUrl /* 45 */:
                TossReactNativeFragment tossReactNativeFragment5 = (TossReactNativeFragment) objArr[0];
                n1a n1aVar = (n1a) objArr[1];
                int i59 = 2 % 2;
                int i60 = access200 + 73;
                writeTypedList = i60 % 128;
                int i61 = i60 % 2;
                if (tossReactNativeFragment5.isAdded()) {
                    tossReactNativeFragment5.onNavigationEvent("publish_warmup_fragment_result", getWrite.IAuthTabCallback("event", n1aVar.toString()));
                    tossReactNativeFragment5.getParentFragmentManager().onExtraCallbackWithResult("shopping_tab_rn_warmup_lifecycle_event", n1aVar.onTransact());
                    return null;
                }
                int i62 = access200 + 113;
                writeTypedList = i62 % 128;
                int i63 = i62 % 2;
                Object[] objArr8 = new Object[1];
                a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41539 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr8);
                tossReactNativeFragment5.onNavigationEvent("publish_warmup_fragment_result_skip", getWrite.IAuthTabCallback(((String) objArr8[0]).intern(), "not_added"), getWrite.IAuthTabCallback("event", n1aVar.toString()));
                return null;
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightIconButtonSize /* 46 */:
                return newAuthTabSession(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightIconColor /* 47 */:
                return prefetch(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightIconHeight /* 48 */:
                return newSessionWithExtras(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightIconWidth /* 49 */:
                return newSession(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightOnButtonClick /* 50 */:
                return receiveFile(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightOnIconButtonClick /* 51 */:
                MaxNativeAdImpl maxNativeAdImpl = (MaxNativeAdImpl) objArr[0];
                MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda84 = (MaxFullscreenAdImplExternalSyntheticLambda8) objArr[1];
                int i64 = 2 % 2;
                int i65 = writeTypedList + 33;
                access200 = i65 % 128;
                if (i65 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda84, "");
                    objOnNavigationEvent = MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, R.drawable.IAuthTabCallback(), new Object[]{maxFullscreenAdImplExternalSyntheticLambda84, null, null, null, null, null, null, maxNativeAdImpl, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 4194111, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1651567374);
                } else {
                    Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda84, "");
                    objOnNavigationEvent = MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, R.drawable.IAuthTabCallback(), new Object[]{maxFullscreenAdImplExternalSyntheticLambda84, null, null, null, null, null, null, maxNativeAdImpl, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 4194111, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1651567374);
                }
                unitOnNavigationEvent = (MaxFullscreenAdImplExternalSyntheticLambda8) objOnNavigationEvent;
                break;
            default:
                return onExtraCallback(objArr);
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(TossReactNativeFragment tossReactNativeFragment) {
        int i = 2 % 2;
        int i2 = access200 + 39;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnActivityResized = onActivityResized(tossReactNativeFragment);
        int i4 = access200 + 17;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return unitOnActivityResized;
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8 onExtraCallback(MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = access200 + 73;
        writeTypedList = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback_Parcel(maxFullscreenAdImplExternalSyntheticLambda8);
            throw null;
        }
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8IAuthTabCallback_Parcel = IAuthTabCallback_Parcel(maxFullscreenAdImplExternalSyntheticLambda8);
        int i3 = access200 + 7;
        writeTypedList = i3 % 128;
        if (i3 % 2 != 0) {
            return maxFullscreenAdImplExternalSyntheticLambda8IAuthTabCallback_Parcel;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8 onExtraCallback(getAdViewTracker getadviewtracker, hcExternalSyntheticLambda0 hcexternalsyntheticlambda0, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = writeTypedList + 95;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8OnExtraCallbackWithResult = onExtraCallbackWithResult(getadviewtracker, hcexternalsyntheticlambda0, maxFullscreenAdImplExternalSyntheticLambda8);
        int i4 = access200 + 25;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return maxFullscreenAdImplExternalSyntheticLambda8OnExtraCallbackWithResult;
    }

    public static /* synthetic */ n5 onExtraCallback(n5 n5Var) {
        int i = 2 % 2;
        int i2 = writeTypedList + 27;
        access200 = i2 % 128;
        if (i2 % 2 == 0) {
            return onTransact(n5Var);
        }
        onTransact(n5Var);
        throw null;
    }

    public static /* synthetic */ ReactHost onExtraCallbackWithResult(TossReactNativeFragment tossReactNativeFragment) {
        int i = 2 % 2;
        int i2 = access200 + 99;
        writeTypedList = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onRelationshipValidationResult(tossReactNativeFragment);
            throw null;
        }
        ReactHost reactHostOnRelationshipValidationResult = onRelationshipValidationResult(tossReactNativeFragment);
        int i3 = writeTypedList + 79;
        access200 = i3 % 128;
        if (i3 % 2 == 0) {
            return reactHostOnRelationshipValidationResult;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(onExtraCallback onextracallback, getAdValue getadvalue) {
        int i = 2 % 2;
        int i2 = access200 + 25;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(onextracallback, getadvalue);
        int i4 = writeTypedList + 67;
        access200 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TossReactNativeFragment tossReactNativeFragment, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = access200 + 113;
        writeTypedList = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(tossReactNativeFragment, th);
        }
        IAuthTabCallback(tossReactNativeFragment, th);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8 onExtraCallbackWithResult(MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = access200 + 47;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8AsInterface = asInterface(maxFullscreenAdImplExternalSyntheticLambda8);
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        int i5 = writeTypedList + 21;
        access200 = i5 % 128;
        if (i5 % 2 == 0) {
            return maxFullscreenAdImplExternalSyntheticLambda8AsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8 onExtraCallbackWithResult(hcExternalSyntheticLambda0 hcexternalsyntheticlambda0, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = writeTypedList + 119;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda82 = (MaxFullscreenAdImplExternalSyntheticLambda8) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{hcexternalsyntheticlambda0, maxFullscreenAdImplExternalSyntheticLambda8}, -1621207192, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1621207241);
        int i4 = writeTypedList + 121;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        return maxFullscreenAdImplExternalSyntheticLambda82;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        int i = 2 % 2;
        int i2 = access200 + 1;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        boolean zMayLaunchUrl = mayLaunchUrl(tossReactNativeFragment);
        int i4 = access200 + 75;
        writeTypedList = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zMayLaunchUrl);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TossReactNativeFragment tossReactNativeFragment, FrameLayout frameLayout, n6 n6Var, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedList + 71;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(tossReactNativeFragment, frameLayout, n6Var, th);
        int i4 = access200 + 81;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(TossReactNativeFragment tossReactNativeFragment, n6 n6Var, n0c.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        int i = 2 % 2;
        int i2 = access200 + 111;
        writeTypedList = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(tossReactNativeFragment, n6Var, onextracallbackwithresult);
        }
        onExtraCallback(tossReactNativeFragment, n6Var, onextracallbackwithresult);
        throw null;
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8 onNavigationEvent(String str, Map map, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = writeTypedList + 43;
        access200 = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(str, map, maxFullscreenAdImplExternalSyntheticLambda8);
        }
        onExtraCallbackWithResult(str, map, maxFullscreenAdImplExternalSyntheticLambda8);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8 onNavigationEvent(Throwable th, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = access200 + 25;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8OnExtraCallback = onExtraCallback(th, maxFullscreenAdImplExternalSyntheticLambda8);
        int i4 = writeTypedList + 123;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        return maxFullscreenAdImplExternalSyntheticLambda8OnExtraCallback;
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8 onNavigationEvent(Function1 function1, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = access200 + 55;
        writeTypedList = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            return (MaxFullscreenAdImplExternalSyntheticLambda8) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{function1, maxFullscreenAdImplExternalSyntheticLambda8}, -1445020682, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1445020695);
        }
        int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        throw null;
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8 onNavigationEvent(MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = writeTypedList + 3;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8IAuthTabCallbackDefault = IAuthTabCallbackDefault(maxFullscreenAdImplExternalSyntheticLambda8);
        int i4 = access200 + 13;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return maxFullscreenAdImplExternalSyntheticLambda8IAuthTabCallbackDefault;
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8 onNavigationEvent(n0c.onExtraCallbackWithResult onextracallbackwithresult, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = access200 + 105;
        writeTypedList = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(onextracallbackwithresult, maxFullscreenAdImplExternalSyntheticLambda8);
            throw null;
        }
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8OnWarmupCompleted = onWarmupCompleted(onextracallbackwithresult, maxFullscreenAdImplExternalSyntheticLambda8);
        int i3 = access200 + 21;
        writeTypedList = i3 % 128;
        int i4 = i3 % 2;
        return maxFullscreenAdImplExternalSyntheticLambda8OnWarmupCompleted;
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8 onNavigationEvent(n1 n1Var, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = writeTypedList + 109;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(n1Var, maxFullscreenAdImplExternalSyntheticLambda8);
            throw null;
        }
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8OnExtraCallback = onExtraCallback(n1Var, maxFullscreenAdImplExternalSyntheticLambda8);
        int i3 = writeTypedList + 63;
        access200 = i3 % 128;
        int i4 = i3 % 2;
        return maxFullscreenAdImplExternalSyntheticLambda8OnExtraCallback;
    }

    public static /* synthetic */ n5 onNavigationEvent(hbExternalSyntheticLambda1 hbexternalsyntheticlambda1, n5 n5Var) {
        int i = 2 % 2;
        int i2 = access200 + 11;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        n5 n5Var2 = (n5) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{hbexternalsyntheticlambda1, n5Var}, -229566195, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 229566231);
        int i4 = access200 + 75;
        writeTypedList = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return n5Var2;
    }

    public static /* synthetic */ n5 onNavigationEvent(n5 n5Var) {
        int i = 2 % 2;
        int i2 = writeTypedList + 91;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        n5 n5VarIAuthTabCallbackDefault = IAuthTabCallbackDefault(n5Var);
        int i4 = writeTypedList + 83;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        return n5VarIAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = access200 + 29;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {th};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult4, objArr2, -382920135, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 382920172);
        int i4 = access200 + 93;
        writeTypedList = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onRelationshipValidationResult(Object[] objArr) throws Throwable {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        int i = 2 % 2;
        int i2 = access200 + 73;
        writeTypedList = i2 % 128;
        if (i2 % 2 == 0) {
            extraCommand(tossReactNativeFragment);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitExtraCommand = extraCommand(tossReactNativeFragment);
        int i3 = access200 + 91;
        writeTypedList = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 91 / 0;
        }
        return unitExtraCommand;
    }

    public static /* synthetic */ WindowManager onTransact(TossReactNativeFragment tossReactNativeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedList + 47;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            onMinimized(tossReactNativeFragment);
            throw null;
        }
        WindowManager windowManagerOnMinimized = onMinimized(tossReactNativeFragment);
        int i3 = access200 + 63;
        writeTypedList = i3 % 128;
        int i4 = i3 % 2;
        return windowManagerOnMinimized;
    }

    public static /* synthetic */ Unit onWarmupCompleted(onExtraCallback onextracallback, String str) {
        int i = 2 % 2;
        int i2 = writeTypedList + 29;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(onextracallback, str);
        int i4 = access200 + 117;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TossReactNativeFragment tossReactNativeFragment, AppCompatActivity appCompatActivity) {
        int i = 2 % 2;
        int i2 = writeTypedList + 71;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(tossReactNativeFragment, appCompatActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(tossReactNativeFragment, appCompatActivity);
        int i3 = writeTypedList + 51;
        access200 = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TossReactNativeFragment tossReactNativeFragment, onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = access200 + 21;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(tossReactNativeFragment, onnavigationevent);
        int i4 = access200 + 83;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TossReactNativeFragment tossReactNativeFragment, String str) {
        int i = 2 % 2;
        int i2 = writeTypedList + 33;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{tossReactNativeFragment, str}, -1373881612, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1373881612);
        int i4 = writeTypedList + 49;
        access200 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return unit;
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8 onWarmupCompleted(MaxNativeAdImpl maxNativeAdImpl, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = access200 + 47;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda82 = (MaxFullscreenAdImplExternalSyntheticLambda8) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{maxNativeAdImpl, maxFullscreenAdImplExternalSyntheticLambda8}, -227074729, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 227074780);
        int i4 = writeTypedList + 53;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        return maxFullscreenAdImplExternalSyntheticLambda82;
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8 onWarmupCompleted(hcExternalSyntheticLambda0 hcexternalsyntheticlambda0, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = writeTypedList + 37;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8OnNavigationEvent = onNavigationEvent(hcexternalsyntheticlambda0, maxFullscreenAdImplExternalSyntheticLambda8);
        int i4 = access200 + 115;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return maxFullscreenAdImplExternalSyntheticLambda8OnNavigationEvent;
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8 onWarmupCompleted(n1 n1Var, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = access200 + 53;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8IAuthTabCallback = IAuthTabCallback(n1Var, maxFullscreenAdImplExternalSyntheticLambda8);
        int i4 = access200 + 39;
        writeTypedList = i4 % 128;
        if (i4 % 2 != 0) {
            return maxFullscreenAdImplExternalSyntheticLambda8IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8 onWarmupCompleted(n1a n1aVar, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = writeTypedList + 87;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8OnExtraCallbackWithResult = onExtraCallbackWithResult(n1aVar, maxFullscreenAdImplExternalSyntheticLambda8);
        int i4 = writeTypedList + 65;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        return maxFullscreenAdImplExternalSyntheticLambda8OnExtraCallbackWithResult;
    }

    public static /* synthetic */ n5 onWarmupCompleted(n5 n5Var) {
        int i = 2 % 2;
        int i2 = access200 + 17;
        writeTypedList = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(n5Var);
            throw null;
        }
        n5 n5VarOnExtraCallbackWithResult = onExtraCallbackWithResult(n5Var);
        int i3 = access200 + 95;
        writeTypedList = i3 % 128;
        if (i3 % 2 != 0) {
            return n5VarOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object postMessage(Object[] objArr) {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        FrameLayout frameLayout = (FrameLayout) objArr[1];
        n6 n6Var = (n6) objArr[2];
        n0c.onExtraCallbackWithResult onextracallbackwithresult = (n0c.onExtraCallbackWithResult) objArr[3];
        ReactSurfaceView reactSurfaceView = (ReactSurfaceView) objArr[4];
        int i = 2 % 2;
        int i2 = writeTypedList + 115;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(tossReactNativeFragment, frameLayout, n6Var, onextracallbackwithresult, reactSurfaceView);
        int i4 = access200 + 83;
        writeTypedList = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object prefetch(Object[] objArr) {
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8 = (MaxFullscreenAdImplExternalSyntheticLambda8) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedList + 77;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda82 = (MaxFullscreenAdImplExternalSyntheticLambda8) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{maxFullscreenAdImplExternalSyntheticLambda8}, 1387600631, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -1387600615);
        int i4 = writeTypedList + 91;
        access200 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return maxFullscreenAdImplExternalSyntheticLambda82;
    }

    private static /* synthetic */ Object receiveFile(Object[] objArr) {
        ReactHost reactHost = (ReactHost) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedList + 123;
        access200 = i2 % 128;
        if (i2 % 2 == 0) {
            return reactHost;
        }
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = writeTypedList + 99;
        int i3 = i2 % 128;
        access200 = i3;
        if (i2 % 2 != 0) {
            int i4 = 74 / 0;
        }
        int i5 = i3 + 43;
        writeTypedList = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 125;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 24, 19628 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IEngagementSignalsCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 60 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 6382 - TextUtils.lastIndexOf("", '0', 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
            int i6 = $10 + 27;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                try {
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 59 - View.combineMeasuredStates(0, 0), 6383 - TextUtils.indexOf("", ""), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), Drawable.resolveOpacity(0, 0) + 59, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    public static final class IAuthTabCallbackStub implements ReactInstanceEventListener {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 0;
        private static int onTransact = 1;
        final /* synthetic */ ReactHost IAuthTabCallback;
        final /* synthetic */ TossReactNativeFragment onExtraCallback;
        final /* synthetic */ n6 onExtraCallbackWithResult;
        final /* synthetic */ n0c.onExtraCallbackWithResult onWarmupCompleted;
        private static char[] onNavigationEvent = {32444, 32385, 32397, 32435, 32447, 32440};
        private static int IAuthTabCallbackStub = -1184334034;
        private static boolean asBinder = true;
        private static boolean asInterface = true;

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            char[] cArr2;
            int i2 = 2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr3 = onNavigationEvent;
            char c = '0';
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    int i5 = $10 + 117;
                    $11 = i5 % 128;
                    int i6 = i5 % i2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 76 - TextUtils.indexOf("", c, 0, 0), 20953 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr4[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i4++;
                        i2 = 2;
                        c = '0';
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i7 = $11 + 31;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr3 = cArr4;
            }
            Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackStub)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), Drawable.resolveOpacity(0, 0) + 75, TextUtils.lastIndexOf("", '0', 0) + 16038, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i9 = 1052772399;
            if (asInterface) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i10 = $11 + 81;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback / 0) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] << i] * iIntValue);
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getJumpTapTimeout() >> 16) + 63, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } else {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), Color.rgb(0, 0, 0) + 16777279, (ViewConfiguration.getLongPressTimeout() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (!asBinder) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr6);
                return;
            }
            int i11 = $10 + 45;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i9);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 62 - ((byte) KeyEvent.getModifierMetaStateMask()), 12214 - TextUtils.getTrimmedLength(""), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                i9 = 1052772399;
            }
            objArr[0] = new String(cArr2);
        }

        IAuthTabCallbackStub(ReactHost reactHost, TossReactNativeFragment tossReactNativeFragment, n6 n6Var, n0c.onExtraCallbackWithResult onextracallbackwithresult) {
            this.IAuthTabCallback = reactHost;
            this.onExtraCallback = tossReactNativeFragment;
            this.onExtraCallbackWithResult = n6Var;
            this.onWarmupCompleted = onextracallbackwithresult;
        }

        public void onNavigationEvent(ReactContext reactContext) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(reactContext, "");
            this.IAuthTabCallback.onExtraCallbackWithResult(this);
            Object[] objArr = {this.onExtraCallback, null};
            TossReactNativeFragment.onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr, 2116854540, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -2116854516);
            TossReactNativeFragment.onExtraCallback(this.onExtraCallback, "pre_start_internal_react_host_context_initialized", getWrite.IAuthTabCallback("react_context_hash", String.valueOf(reactContext.hashCode())));
            if (this.onExtraCallback.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED)) {
                TossReactNativeFragment.onNavigationEvent(this.onExtraCallback, reactContext, "pre_start_internal_host_context_initialized");
                Object[] objArr2 = {this.onExtraCallback, this.onExtraCallbackWithResult, this.onWarmupCompleted};
                TossReactNativeFragment.onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr2, 1288088686, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1288088671);
                return;
            }
            int i2 = IAuthTabCallbackDefault + 75;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            TossReactNativeFragment tossReactNativeFragment = this.onExtraCallback;
            Object[] objArr3 = new Object[1];
            a(null, null, new byte[]{-122, -123, -124, -125, -126, -127}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, objArr3);
            TossReactNativeFragment.onExtraCallback(tossReactNativeFragment, "pre_start_internal_react_host_context_ignored", getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), "lifecycle_not_created"));
            int i4 = onTransact + 97;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 0 / 0;
            }
        }
    }

    public TossReactNativeFragment() {
        setTimestampBytes<Boolean> settimestampbytesOnMinimized = setTid.onNavigationEvent().onMinimized();
        Intrinsics.checkNotNullExpressionValue(settimestampbytesOnMinimized, "");
        this.prefetch = settimestampbytesOnMinimized;
        this.validateRelationship = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
        this.IAuthTabCallbackDefault = SystemClock.uptimeMillis();
        this.extraCallback = new ReactHostUnexpectedDestroyDetector(new Function0() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda50
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 99;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallbackDefault = TossReactNativeFragment.IAuthTabCallbackDefault(this.f$0);
                int i4 = onNavigationEvent + 35;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitIAuthTabCallbackDefault;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.ICustomTabsServiceDefault = new ArrayList();
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda51
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 31;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                onAdExpired onadexpiredIAuthTabCallbackStubProxy = TossReactNativeFragment.IAuthTabCallbackStubProxy();
                if (i3 == 0) {
                    int i4 = 91 / 0;
                }
                return onadexpiredIAuthTabCallbackStubProxy;
            }
        });
    }

    public static final /* synthetic */ void IAuthTabCallback(TossReactNativeFragment tossReactNativeFragment, DefaultLifecycleObserver defaultLifecycleObserver) {
        int i = 2 % 2;
        int i2 = writeTypedList + 71;
        int i3 = i2 % 128;
        access200 = i3;
        int i4 = i2 % 2;
        tossReactNativeFragment.ICustomTabsCallbackDefault = defaultLifecycleObserver;
        if (i4 != 0) {
            int i5 = 3 / 0;
        }
        int i6 = i3 + 113;
        writeTypedList = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void IAuthTabCallback(TossReactNativeFragment tossReactNativeFragment, String str, Pair... pairArr) {
        int i = 2 % 2;
        int i2 = writeTypedList + 9;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        tossReactNativeFragment.onWarmupCompleted(str, (Pair<String, String>[]) pairArr);
        int i4 = writeTypedList + 37;
        access200 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ boolean IAuthTabCallback(TossReactNativeFragment tossReactNativeFragment, String str) {
        int i = 2 % 2;
        int i2 = writeTypedList + 47;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{tossReactNativeFragment, str}, -824080768, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 824080794)).booleanValue();
        int i4 = writeTypedList + 93;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static final /* synthetic */ DefaultLifecycleObserver IAuthTabCallbackStubProxy(TossReactNativeFragment tossReactNativeFragment) {
        int i = 2 % 2;
        int i2 = access200;
        int i3 = i2 + 81;
        writeTypedList = i3 % 128;
        int i4 = i3 % 2;
        DefaultLifecycleObserver defaultLifecycleObserver = tossReactNativeFragment.ICustomTabsCallbackDefault;
        int i5 = i2 + 81;
        writeTypedList = i5 % 128;
        int i6 = i5 % 2;
        return defaultLifecycleObserver;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        n6 n6Var = (n6) objArr[1];
        n0c.onExtraCallbackWithResult onextracallbackwithresult = (n0c.onExtraCallbackWithResult) objArr[2];
        int i = 2 % 2;
        int i2 = access200 + 83;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        tossReactNativeFragment.IAuthTabCallback(n6Var, onextracallbackwithresult);
        int i4 = writeTypedList + 11;
        access200 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return null;
    }

    public static final /* synthetic */ n3 IAuthTabCallback_Parcel(TossReactNativeFragment tossReactNativeFragment) {
        int i = 2 % 2;
        int i2 = access200 + 105;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        n3 n3VarIEngagementSignalsCallback_Parcel = tossReactNativeFragment.IEngagementSignalsCallback_Parcel();
        int i4 = access200 + 99;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return n3VarIEngagementSignalsCallback_Parcel;
    }

    public static final /* synthetic */ FrameLayout ICustomTabsCallback(TossReactNativeFragment tossReactNativeFragment) {
        int i = 2 % 2;
        int i2 = access200 + 23;
        int i3 = i2 % 128;
        writeTypedList = i3;
        int i4 = i2 % 2;
        FrameLayout frameLayout = tossReactNativeFragment.newAuthTabSession;
        int i5 = i3 + 45;
        access200 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 36 / 0;
        }
        return frameLayout;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = access200 + 85;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        tossReactNativeFragment.IAuthTabCallback_Parcel = zBooleanValue;
        int i4 = writeTypedList + 93;
        access200 = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ void extraCallback(TossReactNativeFragment tossReactNativeFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = access200 + 85;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        tossReactNativeFragment.write();
        int i4 = writeTypedList + 109;
        access200 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ boolean extraCallbackWithResult(TossReactNativeFragment tossReactNativeFragment) {
        int i = 2 % 2;
        int i2 = access200 + 77;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        boolean zITrustedWebActivityCallback = tossReactNativeFragment.ITrustedWebActivityCallback();
        int i4 = writeTypedList + 51;
        access200 = i4 % 128;
        if (i4 % 2 == 0) {
            return zITrustedWebActivityCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        ReactInstanceEventListener reactInstanceEventListener = (ReactInstanceEventListener) objArr[1];
        int i = 2 % 2;
        int i2 = access200 + 65;
        int i3 = i2 % 128;
        writeTypedList = i3;
        int i4 = i2 % 2;
        tossReactNativeFragment.ICustomTabsService = reactInstanceEventListener;
        int i5 = i3 + 49;
        access200 = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(TossReactNativeFragment tossReactNativeFragment, String str) {
        int i = 2 % 2;
        int i2 = writeTypedList + 49;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        tossReactNativeFragment.access000 = str;
        int i4 = writeTypedList + 21;
        access200 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onExtraCallback(TossReactNativeFragment tossReactNativeFragment, String str, Pair... pairArr) {
        int i = 2 % 2;
        int i2 = writeTypedList + 11;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        tossReactNativeFragment.onNavigationEvent(str, (Pair<String, String>[]) pairArr);
        int i4 = writeTypedList + 121;
        access200 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(TossReactNativeFragment tossReactNativeFragment, ReactContext reactContext, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedList + 23;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        tossReactNativeFragment.onWarmupCompleted(reactContext, str);
        int i4 = access200 + 19;
        writeTypedList = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(TossReactNativeFragment tossReactNativeFragment, boolean z) {
        int i = 2 % 2;
        int i2 = writeTypedList + 49;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        tossReactNativeFragment.onActivityResized = z;
        if (i3 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void readTypedObject(TossReactNativeFragment tossReactNativeFragment) {
        int i = 2 % 2;
        int i2 = access200 + 33;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        tossReactNativeFragment.IPostMessageServiceStubProxy();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String writeTypedObject(TossReactNativeFragment tossReactNativeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedList + 87;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        String strITrustedWebActivityServiceStubProxy = tossReactNativeFragment.ITrustedWebActivityServiceStubProxy();
        int i4 = writeTypedList + 7;
        access200 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return strITrustedWebActivityServiceStubProxy;
    }

    @Override // im.toss.rn.toss.core.common.wrapper.TossReactContentOwner
    public /* bridge */ void IAuthTabCallback(@NotNull String str, @NotNull JsonElement jsonElement) {
        int i = 2 % 2;
        int i2 = writeTypedList + 11;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        super.IAuthTabCallback(str, jsonElement);
        int i4 = access200 + 79;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ boolean closeWebView(@Nullable String str, boolean z) {
        int i = 2 % 2;
        int i2 = writeTypedList + 55;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        boolean zCloseWebView = super.closeWebView(str, z);
        int i4 = access200 + 113;
        writeTypedList = i4 % 128;
        if (i4 % 2 != 0) {
            return zCloseWebView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public /* bridge */ ViewGroup getCaWebViewContainer() {
        int i = 2 % 2;
        int i2 = access200 + 115;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        ViewGroup caWebViewContainer = super.getCaWebViewContainer();
        int i4 = writeTypedList + 89;
        access200 = i4 % 128;
        if (i4 % 2 == 0) {
            return caWebViewContainer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Boolean getShouldWebViewPauseOnInvisible() {
        int i = 2 % 2;
        int i2 = access200 + 61;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        Boolean shouldWebViewPauseOnInvisible = super.getShouldWebViewPauseOnInvisible();
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        return shouldWebViewPauseOnInvisible;
    }

    public /* bridge */ Intent getSourceIntent() {
        int i = 2 % 2;
        int i2 = writeTypedList + 63;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        Intent sourceIntent = super.getSourceIntent();
        int i4 = writeTypedList + 99;
        access200 = i4 % 128;
        if (i4 % 2 == 0) {
            return sourceIntent;
        }
        throw null;
    }

    public /* bridge */ String getSwipeRefreshCallback() {
        int i = 2 % 2;
        int i2 = writeTypedList + 71;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            super.getSwipeRefreshCallback();
            throw null;
        }
        String swipeRefreshCallback = super.getSwipeRefreshCallback();
        int i3 = writeTypedList + 73;
        access200 = i3 % 128;
        int i4 = i3 % 2;
        return swipeRefreshCallback;
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public /* bridge */ TossCoreWebView getWebView() {
        int i = 2 % 2;
        int i2 = writeTypedList + 97;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            super.getWebView();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TossCoreWebView webView = super.getWebView();
        int i3 = access200 + 77;
        writeTypedList = i3 % 128;
        int i4 = i3 % 2;
        return webView;
    }

    public /* bridge */ boolean handleCaWebViewBackPress(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = access200 + 87;
        writeTypedList = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.startApp*/.handleCaWebViewBackPress(function0);
        }
        super/*o.startApp*/.handleCaWebViewBackPress(function0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public /* bridge */ boolean isSwipeRefreshEnabled() {
        int i = 2 % 2;
        int i2 = access200 + 105;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsSwipeRefreshEnabled = super.isSwipeRefreshEnabled();
        int i4 = access200 + 39;
        writeTypedList = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
        return zIsSwipeRefreshEnabled;
    }

    public /* bridge */ void onExtraCallback(@NotNull AppCompatActivity appCompatActivity) {
        int i = 2 % 2;
        int i2 = writeTypedList + 101;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        super.onExtraCallback(appCompatActivity);
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
    }

    public /* bridge */ void onExtraCallbackWithResult(@NotNull AppCompatActivity appCompatActivity) {
        int i = 2 % 2;
        int i2 = writeTypedList + 91;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        super.onExtraCallbackWithResult(appCompatActivity);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public /* bridge */ void onHistoryCleared() {
        int i = 2 % 2;
        int i2 = access200 + 23;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        super.onHistoryCleared();
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        int i5 = writeTypedList + 35;
        access200 = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ void onNavigationEvent(@NotNull AppCompatActivity appCompatActivity) {
        int i = 2 % 2;
        int i2 = writeTypedList + 31;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        super.onNavigationEvent(appCompatActivity);
        int i4 = access200 + 1;
        writeTypedList = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public /* bridge */ void onPageReady() {
        int i = 2 % 2;
        int i2 = access200 + 95;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        super.onPageReady();
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
    }

    public /* synthetic */ transGenerateCertNum onPostMessage() {
        int i = 2 % 2;
        int i2 = access200 + 63;
        writeTypedList = i2 % 128;
        if (i2 % 2 == 0) {
            writeTypedObject();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        transExportCert transexportcertWriteTypedObject = writeTypedObject();
        int i3 = writeTypedList + 13;
        access200 = i3 % 128;
        int i4 = i3 % 2;
        return transexportcertWriteTypedObject;
    }

    public /* bridge */ void onSwipeToRefresh(@Nullable SwipeRefreshLayout swipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = writeTypedList + 53;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.startApp*/.onSwipeToRefresh(swipeRefreshLayout);
        if (i3 != 0) {
            throw null;
        }
        int i4 = access200 + 121;
        writeTypedList = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public /* bridge */ void onUpdateWebHistoryState() {
        int i = 2 % 2;
        int i2 = access200 + 59;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        super.onUpdateWebHistoryState();
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
        int i5 = access200 + 43;
        writeTypedList = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull AppCompatActivity appCompatActivity, @Nullable Bundle bundle, @NotNull Bundle bundle2) {
        int i = 2 % 2;
        int i2 = writeTypedList + 119;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        super.onWarmupCompleted(appCompatActivity, bundle, bundle2);
        int i4 = access200 + 83;
        writeTypedList = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ ReactHost prefetch() {
        int i = 2 % 2;
        int i2 = access200 + 17;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        ReactHost reactHostPrefetch = super.prefetch();
        int i4 = access200 + 117;
        writeTypedList = i4 % 128;
        if (i4 % 2 != 0) {
            return reactHostPrefetch;
        }
        throw null;
    }

    public /* bridge */ logicVerifyID readTypedObject() {
        int i = 2 % 2;
        int i2 = access200 + 117;
        writeTypedList = i2 % 128;
        if (i2 % 2 == 0) {
            super.readTypedObject();
            throw null;
        }
        logicVerifyID typedObject = super.readTypedObject();
        int i3 = writeTypedList + 17;
        access200 = i3 % 128;
        if (i3 % 2 == 0) {
            return typedObject;
        }
        throw null;
    }

    public /* bridge */ void setFullScreenEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = writeTypedList + 125;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        super.setFullScreenEnabled(z);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ void setShouldWebViewPauseOnInvisible(@Nullable Boolean bool) {
        int i = 2 % 2;
        int i2 = writeTypedList + 17;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        super.setShouldWebViewPauseOnInvisible(bool);
        int i4 = writeTypedList + 53;
        access200 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ void setSwipeRefreshCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = writeTypedList + 113;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        super.setSwipeRefreshCallback(str);
        int i4 = access200 + 91;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public /* bridge */ void setSwipeRefreshEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = access200 + 107;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        super.setSwipeRefreshEnabled(z);
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
    }

    public final String onActivityResized() {
        int i = 2 % 2;
        int i2 = access200 + 103;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        String string = requireArguments().getString("origin_scheme");
        if (string != null) {
            return string;
        }
        int i4 = writeTypedList + 115;
        access200 = i4 % 128;
        if (i4 % 2 == 0) {
            return "";
        }
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStub(Object[] objArr) throws Throwable {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedList + 33;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        String string = tossReactNativeFragment.requireArguments().getString("shared_bundle_name");
        if (string == null) {
            Object[] objArr2 = new Object[1];
            a(new char[]{27221, 15847, 50453, 27823, 13543, 56335}, 22442 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
            string = ((String) objArr2[0]).intern();
        }
        int i4 = writeTypedList + 97;
        access200 = i4 % 128;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public final getClickableViews ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        getClickableViews getclickableviews = new getClickableViews(ITrustedWebActivityCallbackStub());
        int i2 = access200 + 89;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        return getclickableviews;
    }

    public final String onUnminimized() {
        int i = 2 % 2;
        int i2 = writeTypedList + 109;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsCallbackStubProxy().onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strOnNavigationEvent = ICustomTabsCallbackStubProxy().onNavigationEvent();
        int i3 = writeTypedList + 99;
        access200 = i3 % 128;
        int i4 = i3 % 2;
        return strOnNavigationEvent;
    }

    @Override // im.toss.rn.toss.core.observability.ReactNativeScreenServiceHost
    public String IEngagementSignalsCallbackStubProxy() {
        Object obj;
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(onUnminimized());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i2 = access200 + 27;
            writeTypedList = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            obj = null;
        }
        String str = (String) obj;
        if (str == null || str.length() <= 0) {
            return null;
        }
        int i3 = writeTypedList + 69;
        access200 = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    @Override // im.toss.rn.toss.core.observability.ReactNativeScreenServiceHost
    public boolean updateVisuals() {
        int i = 2 % 2;
        int i2 = writeTypedList;
        int i3 = i2 + 11;
        access200 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onWarmupCompleted;
        int i5 = i2 + 41;
        access200 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isLcpTrackable() {
        boolean z;
        int i = 2 % 2;
        int i2 = access200 + 15;
        int i3 = i2 % 128;
        writeTypedList = i3;
        if (i2 % 2 == 0) {
            z = this.readTypedObject;
            int i4 = 6 / 0;
        } else {
            z = this.readTypedObject;
        }
        int i5 = i3 + 49;
        access200 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public Map<String, Object> getScreenMetaData() {
        int i = 2 % 2;
        int i2 = access200 + 43;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        String strIAuthTabCallback = ReactNativeRouteKey.onExtraCallbackWithResult.IAuthTabCallback(IEngagementSignalsCallbackStubProxy(), null);
        if (strIAuthTabCallback == null) {
            int i4 = access200 + 121;
            writeTypedList = i4 % 128;
            if (i4 % 2 != 0) {
                return super/*im.toss.base.BaseFragment*/.getScreenMetaData();
            }
            super/*im.toss.base.BaseFragment*/.getScreenMetaData();
            obj.hashCode();
            throw null;
        }
        Map<String, Object> mapOnNavigationEvent = access8100.onNavigationEvent(getWrite.IAuthTabCallback("screenName", strIAuthTabCallback));
        int i5 = access200 + 13;
        writeTypedList = i5 % 128;
        int i6 = i5 % 2;
        return mapOnNavigationEvent;
    }

    private final String ITrustedWebActivityCallbackDefault() {
        int i = 2 % 2;
        String strOnActivityResized = onActivityResized();
        if (StringsKt.isBlank(strOnActivityResized)) {
            int i2 = access200 + 39;
            writeTypedList = i2 % 128;
            int i3 = i2 % 2;
            getClickableViews getclickableviewsICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy();
            n3 n3VarIEngagementSignalsCallback_Parcel = IEngagementSignalsCallback_Parcel();
            if (n3VarIEngagementSignalsCallback_Parcel == null) {
                n3VarIEngagementSignalsCallback_Parcel = n3.Companion.onWarmupCompleted();
            }
            strOnActivityResized = getclickableviewsICustomTabsCallbackStubProxy.onWarmupCompleted(n3VarIEngagementSignalsCallback_Parcel).onNavigationEvent();
        }
        int i4 = access200 + 33;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return strOnActivityResized;
    }

    private final String ITrustedWebActivityCallbackStub() {
        int i = 2 % 2;
        String string = requireArguments().getString("service_bundle_import_lazy_service_bundle_name");
        Object obj = null;
        if (string == null && (string = requireArguments().getString("search_entry_service_bundle_name")) == null && (string = requireArguments().getString("service_bundle_name")) == null) {
            int i2 = writeTypedList + 59;
            access200 = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            string = "shopping";
        }
        int i3 = writeTypedList + 35;
        access200 = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public final String onActivityLayout() {
        int i = 2 % 2;
        int i2 = writeTypedList + 99;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8 = this.newSession;
        if (i3 == 0) {
            return maxFullscreenAdImplExternalSyntheticLambda8.IAuthTabCallbackDefault();
        }
        maxFullscreenAdImplExternalSyntheticLambda8.IAuthTabCallbackDefault();
        throw null;
    }

    public final hcExternalSyntheticLambda0 ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = access200 + 69;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        hcExternalSyntheticLambda0 hcexternalsyntheticlambda0AsInterface = this.newSession.asInterface();
        int i4 = access200 + 9;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return hcexternalsyntheticlambda0AsInterface;
    }

    public final String ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = writeTypedList + 85;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = this.newSession.onExtraCallbackWithResult();
        int i4 = access200 + 27;
        writeTypedList = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnExtraCallbackWithResult;
        }
        throw null;
    }

    public final getAdViewTracker ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = access200 + 123;
        writeTypedList = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.newSession.IAuthTabCallbackStub();
            obj.hashCode();
            throw null;
        }
        getAdViewTracker getadviewtrackerIAuthTabCallbackStub = this.newSession.IAuthTabCallbackStub();
        int i3 = access200 + 97;
        writeTypedList = i3 % 128;
        if (i3 % 2 != 0) {
            return getadviewtrackerIAuthTabCallbackStub;
        }
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        int i = 2 % 2;
        int i2 = access200 + 105;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        n6 n6VarICustomTabsCallback = tossReactNativeFragment.newSession.ICustomTabsCallback();
        int i4 = writeTypedList + 87;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        return n6VarICustomTabsCallback;
    }

    public final MaxNativeAdImpl mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = access200 + 113;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        MaxNativeAdImpl maxNativeAdImplIAuthTabCallbackStubProxy = this.newSession.IAuthTabCallbackStubProxy();
        int i4 = writeTypedList + 87;
        access200 = i4 % 128;
        if (i4 % 2 == 0) {
            return maxNativeAdImplIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    public final n0c ICustomTabsService() {
        int i = 2 % 2;
        int i2 = access200 + 17;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.newSession};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        if (i3 != 0) {
            return (n0c) MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -2125379858, iIAuthTabCallback, objArr, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), 2125379859);
        }
        int i4 = 29 / 0;
        return (n0c) MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -2125379858, iIAuthTabCallback, objArr, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), 2125379859);
    }

    public final Throwable onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = writeTypedList + 73;
        access200 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.newSession.asBinder();
            obj.hashCode();
            throw null;
        }
        Throwable thAsBinder = this.newSession.asBinder();
        int i3 = writeTypedList + 33;
        access200 = i3 % 128;
        if (i3 % 2 == 0) {
            return thAsBinder;
        }
        throw null;
    }

    public final n1a extraCallback() {
        int i = 2 % 2;
        int i2 = writeTypedList + 41;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        n1a n1aVarIAuthTabCallback = this.newSession.IAuthTabCallback();
        int i4 = writeTypedList + 7;
        access200 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return n1aVarIAuthTabCallback;
    }

    public final n1 newSession() {
        int i = 2 % 2;
        int i2 = writeTypedList + 47;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        n1 n1VarExtraCallbackWithResult = this.newSession.extraCallbackWithResult();
        int i4 = access200 + 73;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return n1VarExtraCallbackWithResult;
    }

    public final n5 newAuthTabSession() {
        int i = 2 % 2;
        int i2 = writeTypedList + 67;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8 = this.newSession;
        if (i3 == 0) {
            return maxFullscreenAdImplExternalSyntheticLambda8.readTypedObject();
        }
        maxFullscreenAdImplExternalSyntheticLambda8.readTypedObject();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean extraCommand() {
        int i = 2 % 2;
        int i2 = access200 + 77;
        writeTypedList = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 39 / 0;
            if (!isRemoving()) {
                if (newAuthTabSession().IAuthTabCallbackDefault() != n6a.Left && newAuthTabSession().onExtraCallback() != onRewardedAdLoaded.Removed && newAuthTabSession().onExtraCallback() != onRewardedAdLoaded.Destroyed) {
                    return false;
                }
            }
        } else if (!isRemoving()) {
        }
        int i4 = writeTypedList + 9;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    static final /* synthetic */ class IAuthTabCallback_Parcel extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        IAuthTabCallback_Parcel(Object obj) {
            super(0, obj, TossReactNativeFragment.class, "handleReactDefaultBackPressed", "handleReactDefaultBackPressed()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            TossReactNativeFragment.readTypedObject((TossReactNativeFragment) ((CallableReference) this).receiver);
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final WindowManager onMinimized(TossReactNativeFragment tossReactNativeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedList + 63;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        FragmentActivity activity = tossReactNativeFragment.getActivity();
        if (activity == null) {
            return null;
        }
        int i4 = access200 + 1;
        writeTypedList = i4 % 128;
        if (i4 % 2 == 0) {
            activity.getWindowManager();
            throw null;
        }
        WindowManager windowManager = activity.getWindowManager();
        int i5 = writeTypedList + 47;
        access200 = i5 % 128;
        if (i5 % 2 == 0) {
            return windowManager;
        }
        throw null;
    }

    public transExportCert writeTypedObject() {
        int i = 2 % 2;
        int i2 = access200;
        int i3 = i2 + 21;
        writeTypedList = i3 % 128;
        int i4 = i3 % 2;
        transExportCert transexportcert = this.onTransact;
        int i5 = i2 + 9;
        writeTypedList = i5 % 128;
        int i6 = i5 % 2;
        return transexportcert;
    }

    @Override // im.toss.rn.toss.core.common.wrapper.TossReactContentOwner
    public TossModule IPostMessageServiceStub() {
        int i = 2 % 2;
        int i2 = writeTypedList + 9;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        TossModule tossModule = this.warmup;
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
        return tossModule;
    }

    public final r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = access200 + 101;
        int i3 = i2 % 128;
        writeTypedList = i3;
        int i4 = i2 % 2;
        r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE r8lambdausr520ceu4yijcrtwho1uywjge = this.tossReactMessageHandlerManager;
        if (r8lambdausr520ceu4yijcrtwho1uywjge == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 125;
        access200 = i5 % 128;
        int i6 = i5 % 2;
        return r8lambdausr520ceu4yijcrtwho1uywjge;
    }

    public final ReactNativeRouteLcpSessionManager onMinimized() {
        int i = 2 % 2;
        int i2 = writeTypedList + 11;
        int i3 = i2 % 128;
        access200 = i3;
        int i4 = i2 % 2;
        ReactNativeRouteLcpSessionManager reactNativeRouteLcpSessionManager = this.reactNativeRouteLcpSessions;
        if (reactNativeRouteLcpSessionManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 77;
        writeTypedList = i5 % 128;
        int i6 = i5 % 2;
        return reactNativeRouteLcpSessionManager;
    }

    public final RnPhaseObserver onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = access200 + 27;
        int i3 = i2 % 128;
        writeTypedList = i3;
        int i4 = i2 % 2;
        RnPhaseObserver rnPhaseObserver = this.rnPhaseObserver;
        if (rnPhaseObserver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 39;
        access200 = i5 % 128;
        int i6 = i5 % 2;
        return rnPhaseObserver;
    }

    private static /* synthetic */ Object access000(Object[] objArr) throws Throwable {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        int i = 2 % 2;
        int i2 = access200 + 51;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        tossReactNativeFragment.ITrustedWebActivityCallbackStubProxy();
        Unit unit = Unit.INSTANCE;
        int i4 = access200 + 21;
        writeTypedList = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return unit;
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public List<WeakReference<startApp>> IPostMessageService_Parcel() {
        int i = 2 % 2;
        int i2 = writeTypedList;
        int i3 = i2 + 51;
        access200 = i3 % 128;
        int i4 = i3 % 2;
        List<WeakReference<startApp>> list = this.ICustomTabsServiceDefault;
        int i5 = i2 + 13;
        access200 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    @Override // im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner
    public startApp access200() {
        int i = 2 % 2;
        int i2 = writeTypedList + 47;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        WeakReference weakReference = (WeakReference) CollectionsKt.lastOrNull(IPostMessageService_Parcel());
        Object obj = null;
        if (weakReference == null) {
            return null;
        }
        int i4 = writeTypedList + 17;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        startApp startapp = (startApp) weakReference.get();
        if (i5 == 0) {
            return startapp;
        }
        obj.hashCode();
        throw null;
    }

    public EventDispatcher extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = writeTypedList + 87;
        access200 = i2 % 128;
        if (i2 % 2 == 0) {
            ReactContext reactContextIEngagementSignalsCallback = IEngagementSignalsCallback();
            if (reactContextIEngagementSignalsCallback == null) {
                int i3 = access200 + 77;
                int i4 = i3 % 128;
                writeTypedList = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 55;
                access200 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 67 / 0;
                }
                return null;
            }
            return r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallbackWithResult(reactContextIEngagementSignalsCallback, r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onWarmupCompleted(reactContextIEngagementSignalsCallback));
        }
        IEngagementSignalsCallback();
        throw null;
    }

    private final onAdExpired IPostMessageService() {
        int i = 2 % 2;
        int i2 = writeTypedList + 103;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        onAdExpired onadexpired = (onAdExpired) this.onExtraCallback.getValue();
        if (i3 == 0) {
            return onadexpired;
        }
        throw null;
    }

    private static final onAdExpired onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = access200 + 121;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        onAdExpired onadexpired = (onAdExpired) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), onAdExpired.class);
        int i4 = access200 + 29;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return onadexpired;
    }

    private final String IPostMessageServiceDefault() {
        int i = 2 % 2;
        int i2 = writeTypedList + 49;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        String code = IPostMessageService().removeOnPictureInPictureModeChangedListener().onExtraCallbackWithResult().getCode();
        if (code != null) {
            return code;
        }
        int i4 = access200 + 107;
        writeTypedList = i4 % 128;
        if (i4 % 2 != 0) {
            return "kr";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onCreate(@Nullable Bundle bundle) {
        boolean z;
        int i = 2 % 2;
        getChildFragmentManager().onNavigationEvent(new RNScreensFragmentFactory());
        super/*im.toss.base.BaseFragment*/.onCreate(bundle);
        RnPhaseObserver.IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{onRelationshipValidationResult()}, 1183770401, -1183770401, ICustomTabsCallbackStubProxy.onExtraCallback());
        onRelationshipValidationResult().onExtraCallback((Object) this, true);
        onMinimized().onExtraCallbackWithResult(this);
        if (bundle == null) {
            int i2 = access200 + 101;
            writeTypedList = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        } else {
            z = true;
        }
        onNavigationEvent("on_create", getWrite.IAuthTabCallback("has_saved_state", String.valueOf(z)));
        if (bundle != null) {
            int i4 = writeTypedList + 57;
            access200 = i4 % 128;
            int i5 = i4 % 2;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("shopping_tab_rn_fragment_instance_state_data");
            if (sparseParcelableArray == null) {
                sparseParcelableArray = new SparseArray<>();
                int i6 = writeTypedList + 91;
                access200 = i6 % 128;
                int i7 = i6 % 2;
            }
            this.IAuthTabCallbackStubProxy = sparseParcelableArray;
        }
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        onWarmupCompleted("fragment_on_create_view", new Pair[0]);
        onNavigationEvent("on_create_view", new Pair[0]);
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.newAuthTabSession = frameLayout;
        IAuthTabCallback(frameLayout);
        onWarmupCompleted("root_container_created", getWrite.IAuthTabCallback("root_hash", String.valueOf(frameLayout.hashCode())), getWrite.IAuthTabCallback("child_count", String.valueOf(frameLayout.getChildCount())));
        int i2 = writeTypedList + 107;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        return frameLayout;
    }

    private final void IAuthTabCallback(FrameLayout frameLayout) {
        int i = 2 % 2;
        ViewCompat.onWarmupCompleted(frameLayout, new RenderInTransitionOverlayNodeElement() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda52
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 69;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return TossReactNativeFragment.IAuthTabCallback(view, windowInsetsCompat);
                }
                TossReactNativeFragment.IAuthTabCallback(view, windowInsetsCompat);
                throw null;
            }
        });
        ViewCompat.extraCommand(frameLayout);
        int i2 = writeTypedList + 59;
        access200 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        int i = 2 % 2;
        int i2 = writeTypedList + 81;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        bundle.putSparseParcelableArray("shopping_tab_rn_fragment_instance_state_data", this.IAuthTabCallbackStubProxy);
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onSaveInstanceState(bundle);
        int i4 = access200 + 15;
        writeTypedList = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Deprecated
    public void onActivityResult(int i, int i2, @Nullable Intent intent) throws Throwable {
        int i3 = 2 % 2;
        int i4 = writeTypedList + 37;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onActivityResult(i, i2, intent);
        isEngagementSignalsApiAvailable().IAuthTabCallback(this, i, i2, intent);
        if (getActivity() != null) {
            int i6 = writeTypedList + 21;
            access200 = i6 % 128;
            int i7 = i6 % 2;
            ReactHost reactHostPrefetch = prefetch();
            if (reactHostPrefetch != null) {
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                reactHostPrefetch.IAuthTabCallback(fragmentActivityRequireActivity, i, i2, intent);
            }
        }
    }

    public void onStart() throws Throwable {
        int i = 2 % 2;
        int i2 = access200 + 93;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.base.BaseFragment*/.onStart();
        onNavigationEvent("on_start", new Pair[0]);
        this.asBinder = true;
        getSmallIconBitmap();
        int i4 = writeTypedList + 71;
        access200 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onResume() throws Throwable {
        int i = 2 % 2;
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onResume();
        onNavigationEvent("on_resume_start", new Pair[0]);
        ReactContext reactContextIEngagementSignalsCallback = IEngagementSignalsCallback();
        if (reactContextIEngagementSignalsCallback != null) {
            int i2 = writeTypedList + 33;
            access200 = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(reactContextIEngagementSignalsCallback, "on_resume");
        }
        TossModule tossModule = this.warmup;
        if (tossModule != null) {
            tossModule.onActivityLayout();
        }
        GraniteBrownfieldModule graniteBrownfieldModule = this.asInterface;
        if (graniteBrownfieldModule != null) {
            int i4 = access200 + 107;
            writeTypedList = i4 % 128;
            int i5 = i4 % 2;
            graniteBrownfieldModule.onExtraCallbackWithResult();
        }
        AudioAttributesCompatParcelizer();
        read();
        getSmallIconBitmap();
        onNavigationEvent("on_resume_end", new Pair[0]);
    }

    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = access200 + 101;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent("on_pause_start", new Pair[0]);
        cancelNotification();
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onPause();
        getSmallIconBitmap();
        onNavigationEvent("on_pause_end", new Pair[0]);
        int i4 = writeTypedList + 61;
        access200 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onStop() throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedList + 19;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent("on_stop", new Pair[0]);
        this.asBinder = false;
        super/*im.toss.base.BaseFragment*/.onStop();
        getSmallIconBitmap();
        int i4 = writeTypedList + 39;
        access200 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onHiddenChanged(boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = access200 + 47;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        super/*androidx.fragment.app.Fragment*/.onHiddenChanged(z);
        onWarmupCompleted("on_hidden_changed", getWrite.IAuthTabCallback("hidden", String.valueOf(z)));
        getSmallIconBitmap();
        if (z) {
            int i4 = access200 + 49;
            writeTypedList = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            Function0<Unit> function0 = this.onRelationshipValidationResult;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    private static final n5 IAuthTabCallbackDefault(n5 n5Var) {
        int i = 2 % 2;
        int i2 = writeTypedList + 7;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(n5Var, "");
        n5 n5VarOnNavigationEvent = n5.onNavigationEvent(n5Var, null, onRewardedAdLoaded.Destroyed, null, false, false, null, 61, null);
        int i4 = writeTypedList + 115;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        return n5VarOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004a A[PHI: r1
      0x004a: PHI (r1v8 o.n3) = (r1v7 o.n3), (r1v18 o.n3) binds: [B:8:0x0048, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDestroy() throws Throwable {
        n3 n3VarIEngagementSignalsCallback_Parcel;
        hbExternalSyntheticLambda13 hbexternalsyntheticlambda13AsInterface;
        int i = 2 % 2;
        int i2 = writeTypedList + 21;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent("on_destroy_start", new Pair[0]);
            getSmallIconId();
            onRelationshipValidationResult().IAuthTabCallback(this);
            this.prefetch.onExtraCallback(Boolean.FALSE);
            n3VarIEngagementSignalsCallback_Parcel = IEngagementSignalsCallback_Parcel();
            if (n3VarIEngagementSignalsCallback_Parcel != null) {
                hbexternalsyntheticlambda13AsInterface = n3VarIEngagementSignalsCallback_Parcel.asInterface();
                if (hbexternalsyntheticlambda13AsInterface == null) {
                    hbexternalsyntheticlambda13AsInterface = n3.Companion.onWarmupCompleted().asInterface();
                    int i3 = access200 + 47;
                    writeTypedList = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
        } else {
            onNavigationEvent("on_destroy_start", new Pair[0]);
            getSmallIconId();
            onRelationshipValidationResult().IAuthTabCallback(this);
            this.prefetch.onExtraCallback(Boolean.FALSE);
            n3VarIEngagementSignalsCallback_Parcel = IEngagementSignalsCallback_Parcel();
            if (n3VarIEngagementSignalsCallback_Parcel != null) {
            }
        }
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onWarmupCompleted(hbexternalsyntheticlambda13AsInterface, (onRewardedAdDisplayFailed) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -639144808, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 639144810));
        IEngagementSignalsCallbackDefault();
        this.onNavigationEvent.onExtraCallbackWithResult();
        IPostMessageService_Parcel().clear();
        Object[] objArr = {this, new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda35
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i5 = 2 % 2;
                int i6 = onWarmupCompleted + 35;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                n5 n5VarOnNavigationEvent = TossReactNativeFragment.onNavigationEvent((n5) obj);
                int i8 = onWarmupCompleted + 27;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                return n5VarOnNavigationEvent;
            }
        }};
        int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onExtraCallback(iOnExtraCallbackWithResult4, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr, -761972630, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult5, 761972649);
        this.prefetch.onExtraCallback();
        super/*im.toss.base.BaseFragment*/.onDestroy();
        onNavigationEvent("on_destroy_end", new Pair[0]);
    }

    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = access200 + 37;
        writeTypedList = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent("on_destroy_view_start", new Pair[0]);
            this.newAuthTabSession = null;
            super/*im.toss.base.BaseFragment*/.onDestroyView();
            onNavigationEvent("on_destroy_view_end", new Pair[1]);
            return;
        }
        onNavigationEvent("on_destroy_view_start", new Pair[0]);
        this.newAuthTabSession = null;
        super/*im.toss.base.BaseFragment*/.onDestroyView();
        onNavigationEvent("on_destroy_view_end", new Pair[0]);
    }

    public ResourceResolutionException onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access200 + 69;
        writeTypedList = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onMessageChannelReady;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final n3 IEngagementSignalsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = access200 + 57;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        n3 n3VarOnWarmupCompleted = this.newSession.onWarmupCompleted();
        int i4 = access200 + 53;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return n3VarOnWarmupCompleted;
    }

    private final void onExtraCallback(Function1<? super MaxFullscreenAdImplExternalSyntheticLambda8, MaxFullscreenAdImplExternalSyntheticLambda8> function1) {
        synchronized (this.newSessionWithExtras) {
            this.newSession = (MaxFullscreenAdImplExternalSyntheticLambda8) function1.invoke(this.newSession);
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void IAuthTabCallbackStub(MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        synchronized (this.newSessionWithExtras) {
            this.newSession = maxFullscreenAdImplExternalSyntheticLambda8;
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void onWarmupCompleted(String str, Pair<String, String>... pairArr) {
        int i = 2 % 2;
        int i2 = writeTypedList + 109;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        MaxFullscreenAdImplExternalSyntheticLambda4 maxFullscreenAdImplExternalSyntheticLambda4 = this.requestPostMessageChannelWithExtras;
        if (maxFullscreenAdImplExternalSyntheticLambda4 != null) {
            maxFullscreenAdImplExternalSyntheticLambda4.onWarmupCompleted(str, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            int i3 = writeTypedList + 87;
            access200 = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private final void onNavigationEvent(String str, Pair<String, String>... pairArr) {
        n2 n2VarOnExtraCallback;
        ReactContext reactContextOnExtraCallbackWithResult;
        int i = 2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8 = this.newSession;
        n5 typedObject = maxFullscreenAdImplExternalSyntheticLambda8.readTypedObject();
        ReactHost reactHostOnExtraCallback = writeTypedObject().onExtraCallback();
        hashCode();
        Objects.toString(getLifecycle().IAuthTabCallback());
        isAdded();
        isHidden();
        isRemoving();
        if (getView() != null) {
            int i2 = writeTypedList + 105;
            access200 = i2 % 128;
            int i3 = i2 % 2;
        }
        if (this.newAuthTabSession != null) {
            int i4 = writeTypedList + 71;
            access200 = i4 % 128;
            int i5 = i4 % 2;
        }
        maxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent();
        if (reactHostOnExtraCallback != null) {
            String.valueOf(reactHostOnExtraCallback.hashCode());
        }
        if (reactHostOnExtraCallback != null && (reactContextOnExtraCallbackWithResult = reactHostOnExtraCallback.onExtraCallbackWithResult()) != null) {
            String.valueOf(reactContextOnExtraCallbackWithResult.hashCode());
        }
        Integer num = this.access100;
        if (num != null) {
            int i6 = access200 + 21;
            writeTypedList = i6 % 128;
            int i7 = i6 % 2;
            String.valueOf(num.intValue());
        }
        Objects.toString(typedObject.IAuthTabCallbackDefault());
        Objects.toString(typedObject.onExtraCallback());
        Objects.toString(typedObject.IAuthTabCallback());
        typedObject.onNavigationEvent();
        typedObject.onExtraCallbackWithResult();
        Objects.toString(typedObject.onWarmupCompleted());
        hcExternalSyntheticLambda0 hcexternalsyntheticlambda0AsInterface = maxFullscreenAdImplExternalSyntheticLambda8.asInterface();
        if (hcexternalsyntheticlambda0AsInterface != null) {
            hcexternalsyntheticlambda0AsInterface.IAuthTabCallback();
        }
        if (maxFullscreenAdImplExternalSyntheticLambda8.IAuthTabCallbackDefault() == null) {
            int i8 = writeTypedList + 97;
            access200 = i8 % 128;
            int i9 = i8 % 2;
        }
        n3 n3VarOnWarmupCompleted = maxFullscreenAdImplExternalSyntheticLambda8.onWarmupCompleted();
        if (n3VarOnWarmupCompleted != null) {
            n3VarOnWarmupCompleted.getInterfaceDescriptor();
        }
        n1 n1VarExtraCallbackWithResult = maxFullscreenAdImplExternalSyntheticLambda8.extraCallbackWithResult();
        if (n1VarExtraCallbackWithResult != null && (n2VarOnExtraCallback = n1VarExtraCallbackWithResult.onExtraCallback()) != null && n2VarOnExtraCallback.toString() == null) {
            int i10 = access200 + 109;
            writeTypedList = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 54 / 0;
            }
        }
        for (Pair<String, String> pair : pairArr) {
        }
    }

    private final void onExtraCallback(String str, Pair<String, String>... pairArr) {
        String strValueOf;
        int i = 2 % 2;
        onNavigationEvent(str, (Pair<String, String>[]) Arrays.copyOf(pairArr, pairArr.length));
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8 = this.newSession;
        ReactHost reactHostOnExtraCallback = writeTypedObject().onExtraCallback();
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Map mapOnExtraCallback = access8100.onExtraCallback();
        int i2 = access200 + 81;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        for (Pair<String, String> pair : pairArr) {
            int i4 = access200 + 47;
            writeTypedList = i4 % 128;
            int i5 = i4 % 2;
            mapOnExtraCallback.put((String) pair.onExtraCallbackWithResult(), (String) pair.IAuthTabCallback());
        }
        mapOnExtraCallback.put("host", "shopping_tab_fragment");
        mapOnExtraCallback.put("use_internal_host", String.valueOf(this.updateVisuals));
        mapOnExtraCallback.put("internal_host_created", String.valueOf(this.getInterfaceDescriptor));
        mapOnExtraCallback.put("internal_surface_started", String.valueOf(maxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent()));
        r8lambdaoYv_xINqzW0mQQBhO2XztvZdhxY r8lambdaoyv_xinqzw0mqqbho2xztvzdhxy = r8lambdaoYv_xINqzW0mQQBhO2XztvZdhxY.onExtraCallbackWithResult;
        mapOnExtraCallback.put("react_host_hash", r8lambdaoyv_xinqzw0mqqbho2xztvzdhxy.onExtraCallbackWithResult(reactHostOnExtraCallback));
        mapOnExtraCallback.put("react_context_hash", r8lambdaoyv_xinqzw0mqqbho2xztvzdhxy.onExtraCallbackWithResult(reactHostOnExtraCallback != null ? reactHostOnExtraCallback.onExtraCallbackWithResult() : null));
        Integer num = this.access100;
        if (num == null || (strValueOf = String.valueOf(num.intValue())) == null) {
            strValueOf = "null";
        }
        mapOnExtraCallback.put("initialized_context_hash", strValueOf);
        Unit unit = Unit.INSTANCE;
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "TossRnHostMilestone", str, access8100.onExtraCallbackWithResult(mapOnExtraCallback), (String) null, false, (String) null, 56, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getSmallIconId() {
        boolean z;
        ReactContext reactContextOnExtraCallbackWithResult;
        boolean z2;
        int i = 2 % 2;
        if (ICustomTabsCallbackDefault() != null) {
            int i2 = access200 + 51;
            writeTypedList = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        ReactHost reactHostOnExtraCallback = writeTypedObject().onExtraCallback();
        RnImportLazyOutcomeTrace rnImportLazyOutcomeTrace = RnImportLazyOutcomeTrace.onExtraCallback;
        String strName = newAuthTabSession().IAuthTabCallback().name();
        if (reactHostOnExtraCallback == null) {
            int i4 = writeTypedList + 23;
            access200 = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        } else {
            z = true;
        }
        if (reactHostOnExtraCallback != null) {
            reactContextOnExtraCallbackWithResult = reactHostOnExtraCallback.onExtraCallbackWithResult();
            int i6 = writeTypedList + 97;
            access200 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            reactContextOnExtraCallbackWithResult = null;
        }
        if (reactContextOnExtraCallbackWithResult == null) {
            int i8 = access200 + 67;
            writeTypedList = i8 % 128;
            z2 = i8 % 2 == 0;
        }
        rnImportLazyOutcomeTrace.onExtraCallbackWithResult("shopping_tab_fragment", strName, z, z2, this.onMessageChannelReady, this.IAuthTabCallback_Parcel, this.access000, SystemClock.uptimeMillis() - this.IAuthTabCallbackDefault);
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        String str = (String) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        int i = 2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda4 maxFullscreenAdImplExternalSyntheticLambda4 = tossReactNativeFragment.requestPostMessageChannelWithExtras;
        if (maxFullscreenAdImplExternalSyntheticLambda4 != null) {
            int i2 = access200 + 109;
            writeTypedList = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = maxFullscreenAdImplExternalSyntheticLambda4.onExtraCallback(str, (Function0<? extends Object>) function0);
            if (objOnExtraCallback != null) {
                int i4 = access200 + 105;
                writeTypedList = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallback;
            }
        }
        return function0.invoke();
    }

    private final void onExtraCallbackWithResult(String str, int i) {
        int i2 = 2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda4 maxFullscreenAdImplExternalSyntheticLambda4 = this.requestPostMessageChannelWithExtras;
        Object obj = null;
        if (maxFullscreenAdImplExternalSyntheticLambda4 != null) {
            int i3 = writeTypedList + 17;
            access200 = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr = {maxFullscreenAdImplExternalSyntheticLambda4, str, Integer.valueOf(i)};
                MaxFullscreenAdImplExternalSyntheticLambda4.onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1498906936, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 1498906937, objArr);
                obj.hashCode();
                throw null;
            }
            Object[] objArr2 = {maxFullscreenAdImplExternalSyntheticLambda4, str, Integer.valueOf(i)};
            MaxFullscreenAdImplExternalSyntheticLambda4.onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1498906936, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 1498906937, objArr2);
        }
        int i4 = access200 + 85;
        writeTypedList = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void onWarmupCompleted(String str, int i, Pair<String, String>... pairArr) {
        int i2 = 2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda4 maxFullscreenAdImplExternalSyntheticLambda4 = this.requestPostMessageChannelWithExtras;
        if (maxFullscreenAdImplExternalSyntheticLambda4 != null) {
            int i3 = writeTypedList + 117;
            access200 = i3 % 128;
            int i4 = i3 % 2;
            maxFullscreenAdImplExternalSyntheticLambda4.onExtraCallback(str, i, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
        int i5 = writeTypedList + 55;
        access200 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        final Function1 function1 = (Function1) objArr[1];
        int i = 2 % 2;
        tossReactNativeFragment.onExtraCallback(new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda46
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 31;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8OnNavigationEvent = TossReactNativeFragment.onNavigationEvent(function1, (MaxFullscreenAdImplExternalSyntheticLambda8) obj);
                int i5 = onWarmupCompleted + 121;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return maxFullscreenAdImplExternalSyntheticLambda8OnNavigationEvent;
            }
        });
        int i2 = access200 + 43;
        writeTypedList = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8 = (MaxFullscreenAdImplExternalSyntheticLambda8) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedList + 37;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
        Object[] objArr2 = {maxFullscreenAdImplExternalSyntheticLambda8, null, null, null, null, null, null, null, null, null, null, null, null, null, (n5) function1.invoke(maxFullscreenAdImplExternalSyntheticLambda8.readTypedObject()), null, null, null, null, null, null, null, false, 4186111, null};
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda82 = (MaxFullscreenAdImplExternalSyntheticLambda8) MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, R.drawable.IAuthTabCallback(), objArr2, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1651567374);
        int i4 = access200 + 79;
        writeTypedList = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return maxFullscreenAdImplExternalSyntheticLambda82;
    }

    public List<ReactPackage> requestPostMessageChannelWithExtras() {
        int i = 2 % 2;
        int i2 = writeTypedList + 115;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        List<ReactPackage> list = (List) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -772030870, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 772030911);
        int i4 = access200 + 47;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public logicVerifyID IAuthTabCallbackStub() {
        int i = 2 % 2;
        n0c.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = this.newSession.onExtraCallback();
        if (onextracallbackwithresultOnExtraCallback == null) {
            int i2 = access200 + 53;
            writeTypedList = i2 % 128;
            int i3 = i2 % 2;
            n0c n0cVarICustomTabsService = ICustomTabsService();
            if (!(!(n0cVarICustomTabsService instanceof n0c.onExtraCallbackWithResult))) {
                int i4 = writeTypedList + 29;
                access200 = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                onextracallbackwithresultOnExtraCallback = (n0c.onExtraCallbackWithResult) n0cVarICustomTabsService;
            } else {
                onextracallbackwithresultOnExtraCallback = null;
            }
            if (onextracallbackwithresultOnExtraCallback == null) {
                throw new IllegalStateException("Loaded shared bundle is not available for shopping tab RN warm-up");
            }
        }
        return new onWarmupCompleted(onextracallbackwithresultOnExtraCallback, onRelationshipValidationResult());
    }

    public View asBinder() {
        int i = 2 % 2;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        DefaultLoadingView defaultLoadingView = new DefaultLoadingView(contextRequireContext);
        int i2 = access200 + 99;
        writeTypedList = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 88 / 0;
        }
        return defaultLoadingView;
    }

    public View onExtraCallback(@NotNull Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        TossReactErrorView tossReactErrorView = new TossReactErrorView(contextRequireContext, th);
        int i2 = access200 + 69;
        writeTypedList = i2 % 128;
        if (i2 % 2 != 0) {
            return tossReactErrorView;
        }
        throw null;
    }

    public void IAuthTabCallback(@NotNull ReactContext reactContext) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedList + 7;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(reactContext, "");
        onWarmupCompleted(reactContext, "on_react_context_initialized");
        int i4 = access200 + 51;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
    }

    public void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = access200 + 55;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
    }

    public MaxFullscreenAdImpl access100() {
        MaxFullscreenAdImpl maxFullscreenAdImplWriteTypedObject;
        int i = 2 % 2;
        int i2 = writeTypedList + 89;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            maxFullscreenAdImplWriteTypedObject = this.newSession.writeTypedObject();
            int i3 = 31 / 0;
        } else {
            maxFullscreenAdImplWriteTypedObject = this.newSession.writeTypedObject();
        }
        int i4 = access200 + 7;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return maxFullscreenAdImplWriteTypedObject;
    }

    public r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access200 + 49;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yosAccess100 = this.newSession.access100();
        int i4 = access200 + 75;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdadtqrzfihm2ghoddvkfg5vm2yosAccess100;
    }

    public MaxFullscreenAdImpl asInterface() {
        int i = 2 % 2;
        int i2 = writeTypedList + 57;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.newSession};
        if (i3 == 0) {
            return (MaxFullscreenAdImpl) MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), 1619884573, R.drawable.IAuthTabCallback(), objArr, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1619884570);
        }
        throw null;
    }

    public r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos onTransact() {
        int i = 2 % 2;
        int i2 = access200 + 101;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yosIAuthTabCallback_Parcel = this.newSession.IAuthTabCallback_Parcel();
        int i4 = writeTypedList + 9;
        access200 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
        return r8lambdadtqrzfihm2ghoddvkfg5vm2yosIAuthTabCallback_Parcel;
    }

    public getByteBuffer<Boolean> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = writeTypedList + 51;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            getByteBuffer<Boolean> getbytebufferAsBinder = this.prefetch.onNavigationEvent(Boolean.valueOf(ITrustedWebActivityServiceStub())).asBinder();
            Intrinsics.checkNotNullExpressionValue(getbytebufferAsBinder, "");
            int i3 = 40 / 0;
            return getbytebufferAsBinder;
        }
        getByteBuffer<Boolean> getbytebufferAsBinder2 = this.prefetch.onNavigationEvent(Boolean.valueOf(ITrustedWebActivityServiceStub())).asBinder();
        Intrinsics.checkNotNullExpressionValue(getbytebufferAsBinder2, "");
        return getbytebufferAsBinder2;
    }

    @Override // im.toss.rn.toss.core.common.wrapper.TossReactContentOwner
    public ReactContext IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = access200 + 85;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        ReactHost reactHostOnExtraCallback = writeTypedObject().onExtraCallback();
        if (reactHostOnExtraCallback == null) {
            return null;
        }
        ReactContext reactContextOnExtraCallbackWithResult = reactHostOnExtraCallback.onExtraCallbackWithResult();
        int i4 = writeTypedList + 47;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        return reactContextOnExtraCallbackWithResult;
    }

    public final boolean receiveFile() {
        int i = 2 % 2;
        int i2 = access200 + 125;
        writeTypedList = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = true;
            if (!(!this.getInterfaceDescriptor) || newAuthTabSession().onNavigationEvent()) {
                int i3 = writeTypedList + 31;
                access200 = i3 % 128;
                int i4 = i3 % 2;
            } else {
                z = false;
            }
            return MaxFullscreenAdImpla.onWarmupCompleted(z, writeTypedObject().onExtraCallback(), this.ICustomTabsCallback);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean ITrustedWebActivityServiceStub() {
        boolean z;
        int i = 2 % 2;
        if (!isVisible()) {
            z = false;
        } else {
            int i2 = writeTypedList + 123;
            access200 = i2 % 128;
            int i3 = i2 % 2;
            if (!isHidden()) {
                int i4 = writeTypedList + 39;
                access200 = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            }
        }
        return MaxFullscreenAdImpla.onExtraCallbackWithResult(z, this.asBinder, this.updateVisuals, newAuthTabSession().onExtraCallback() == onRewardedAdLoaded.Shown);
    }

    private final void getSmallIconBitmap() throws Throwable {
        int i = 2 % 2;
        Object[] objArr = {this, "visible_state_publish", new Function0() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda26
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 13;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr2 = {this.f$0};
                if (i4 != 0) {
                    int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    return (Unit) TossReactNativeFragment.onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr2, -800368641, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 800368663);
                }
                int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                throw null;
            }
        }};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr, -678580714, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 678580731);
        int i2 = access200 + 93;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onPostMessage(TossReactNativeFragment tossReactNativeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedList + 69;
        access200 = i2 % 128;
        if (i2 % 2 == 0) {
            tossReactNativeFragment.prefetch.onExtraCallback(Boolean.valueOf(tossReactNativeFragment.ITrustedWebActivityServiceStub()));
            return Unit.INSTANCE;
        }
        tossReactNativeFragment.prefetch.onExtraCallback(Boolean.valueOf(tossReactNativeFragment.ITrustedWebActivityServiceStub()));
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public void invokeDefaultOnBackPressed() {
        int i = 2 % 2;
        int i2 = writeTypedList + 77;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        postMessage();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = writeTypedList + 111;
        access200 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean asInterface(@NotNull n3 n3Var) throws Throwable {
        onRewardedAdLoaded onrewardedadloaded;
        int i = 2 % 2;
        int i2 = writeTypedList + 41;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(n3Var, "");
        onNavigationEvent("start_warmup_on_tab_enter_start", getWrite.IAuthTabCallback("policy_enabled", String.valueOf(n3Var.onExtraCallbackWithResult())), getWrite.IAuthTabCallback("policy_shared_bundle", n3Var.access000()), getWrite.IAuthTabCallback("policy_service_bundle", n3Var.getInterfaceDescriptor()));
        if (n3Var.onExtraCallbackWithResult()) {
            int i4 = access200 + 53;
            writeTypedList = i4 % 128;
            int i5 = i4 % 2;
            if (n3Var.onTransact().onExtraCallback()) {
                int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                if (!Intrinsics.areEqual((String) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -762434377, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 762434409), n3Var.access000())) {
                    Object[] objArr = new Object[1];
                    a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, View.combineMeasuredStates(0, 0) + 41539, objArr);
                    Pair<String, String> pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "shared_bundle_mismatch");
                    int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    onNavigationEvent("start_warmup_on_tab_enter_skip", pairIAuthTabCallback, getWrite.IAuthTabCallback("fragment_shared_bundle", (String) onExtraCallback(iOnExtraCallbackWithResult3, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -762434377, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, 762434409)));
                    return false;
                }
                if (!Intrinsics.areEqual(onUnminimized(), n3Var.getInterfaceDescriptor())) {
                    int i6 = writeTypedList + 109;
                    access200 = i6 % 128;
                    int i7 = i6 % 2;
                    Object[] objArr2 = new Object[1];
                    a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41539 - View.MeasureSpec.getMode(0), objArr2);
                    onNavigationEvent("start_warmup_on_tab_enter_skip", getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), "service_bundle_mismatch"), getWrite.IAuthTabCallback("fragment_service_bundle", onUnminimized()));
                    return false;
                }
                int iOnExtraCallbackWithResult5 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult6 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                if (((n6) onExtraCallback(iOnExtraCallbackWithResult5, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -1098765882, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult6, 1098765903)) != null) {
                    int i8 = access200 + 23;
                    writeTypedList = i8 % 128;
                    int i9 = i8 % 2;
                    Object[] objArr3 = new Object[1];
                    a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41540 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr3);
                    onNavigationEvent("start_warmup_on_tab_enter_skip", getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), "warmup_request_exists"));
                    int i10 = writeTypedList + 49;
                    access200 = i10 % 128;
                    int i11 = i10 % 2;
                    return false;
                }
                this.validateRelationship = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
                this.extraCommand = new ReactBackPressHandler(new readTypedObject(this));
                this.isEngagementSignalsApiAvailable.set(false);
                this.ICustomTabsServiceStub.onExtraCallback();
                this.receiveFile.set(false);
                this.ICustomTabsCallbackStubProxy.set(false);
                this.onActivityLayout.onNavigationEvent();
                n6 n6VarOnExtraCallback = n6.Companion.onExtraCallback(n3Var);
                n5 n5VarAsBinder = n3Var.asBinder();
                n6a n6aVar = n6a.Entered;
                if (isHidden()) {
                    int i12 = writeTypedList + 3;
                    access200 = i12 % 128;
                    if (i12 % 2 != 0) {
                        onrewardedadloaded = onRewardedAdLoaded.Hidden;
                        int i13 = 55 / 0;
                    } else {
                        onrewardedadloaded = onRewardedAdLoaded.Hidden;
                    }
                } else {
                    onrewardedadloaded = onRewardedAdLoaded.Created;
                }
                IAuthTabCallbackStub(new MaxFullscreenAdImplExternalSyntheticLambda8(null, null, null, null, null, n6VarOnExtraCallback, null, null, null, null, null, null, null, n5VarAsBinder.IAuthTabCallback(n6aVar, onrewardedadloaded, n0a.Loading, false, false, hbExternalSyntheticLambda1.Ready), n3Var, null, null, null, null, null, null, false, 4169695, null));
                onNavigationEvent("start_warmup_on_tab_enter_success", new Pair[0]);
                return true;
            }
        }
        Object[] objArr4 = new Object[1];
        a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, Color.rgb(0, 0, 0) + 16818755, objArr4);
        onNavigationEvent("start_warmup_on_tab_enter_skip", getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), "policy_disabled_or_fragment_not_created"));
        return false;
    }

    static final /* synthetic */ class readTypedObject extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        readTypedObject(Object obj) {
            super(0, obj, TossReactNativeFragment.class, "handleReactDefaultBackPressed", "handleReactDefaultBackPressed()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 5;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            TossReactNativeFragment.readTypedObject((TossReactNativeFragment) ((CallableReference) this).receiver);
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final ReactHost onRelationshipValidationResult(TossReactNativeFragment tossReactNativeFragment) {
        int i = 2 % 2;
        int i2 = access200 + 111;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        ReactHost reactHostOnExtraCallback = tossReactNativeFragment.writeTypedObject().onExtraCallback();
        int i4 = access200 + 101;
        writeTypedList = i4 % 128;
        if (i4 % 2 != 0) {
            return reactHostOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = access200 + 5;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        this.updateVisuals = z;
        if (z) {
            this.prefetchWithMultipleUrls = new Function0() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda22
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = IAuthTabCallback + 75;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    ReactHost reactHostOnExtraCallbackWithResult = TossReactNativeFragment.onExtraCallbackWithResult(this.f$0);
                    int i7 = IAuthTabCallback + 5;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        return reactHostOnExtraCallbackWithResult;
                    }
                    throw null;
                }
            };
            int i4 = writeTypedList + 123;
            access200 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.requestPostMessageChannelWithExtras = new MaxFullscreenAdImplExternalSyntheticLambda4(str, str2, str3, 0L, 8, null);
        onWarmupCompleted("fragment_perf_context_set", getWrite.IAuthTabCallback("fragment_hash", String.valueOf(hashCode())));
        int i2 = writeTypedList + 67;
        access200 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        r4 = kotlin.Unit.INSTANCE;
        r1 = im.toss.rn.toss.core.TossReactNativeFragment.access200 + 17;
        im.toss.rn.toss.core.TossReactNativeFragment.writeTypedList = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r4 == o.access14300.onWarmupCompleted()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r4 == o.access14300.onWarmupCompleted()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(@NotNull access13800<? super Unit> access13800Var) {
        Object objIAuthTabCallback;
        int i = 2 % 2;
        int i2 = writeTypedList + 111;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            objIAuthTabCallback = this.validateRelationship.IAuthTabCallback(access13800Var);
            int i3 = 42 / 0;
        } else {
            objIAuthTabCallback = this.validateRelationship.IAuthTabCallback(access13800Var);
        }
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = TossReactNativeFragment.this.new asBinder(access13800Var);
            int i2 = onNavigationEvent + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 39;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 75;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        static final class onWarmupCompleted implements BeginGetCredentialUtilCompanionExternalSyntheticLambda13 {
            private static int IAuthTabCallback = 0;
            private static int IAuthTabCallbackDefault = 1;
            final /* synthetic */ maybeRemoveAttachStateListener<Boolean> onExtraCallback;
            final /* synthetic */ EventDispatcher onExtraCallbackWithResult;
            final /* synthetic */ TossReactNativeFragment onNavigationEvent;
            final /* synthetic */ Ref.ObjectRef<BeginGetCredentialUtilCompanionExternalSyntheticLambda13> onWarmupCompleted;

            /* JADX WARN: Multi-variable type inference failed */
            onWarmupCompleted(EventDispatcher eventDispatcher, Ref.ObjectRef<BeginGetCredentialUtilCompanionExternalSyntheticLambda13> objectRef, TossReactNativeFragment tossReactNativeFragment, maybeRemoveAttachStateListener<? super Boolean> mayberemoveattachstatelistener) {
                this.onExtraCallbackWithResult = eventDispatcher;
                this.onWarmupCompleted = objectRef;
                this.onNavigationEvent = tossReactNativeFragment;
                this.onExtraCallback = mayberemoveattachstatelistener;
            }

            public final void onEventDispatch(Event<?> event) {
                BeginGetCredentialUtilCompanionExternalSyntheticLambda13 beginGetCredentialUtilCompanionExternalSyntheticLambda13;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(event, "");
                Object obj = null;
                if (!(!(event instanceof maybeReportErrorFromResultReceiver))) {
                    EventDispatcher eventDispatcher = this.onExtraCallbackWithResult;
                    Object obj2 = this.onWarmupCompleted.element;
                    if (obj2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        beginGetCredentialUtilCompanionExternalSyntheticLambda13 = null;
                    } else {
                        beginGetCredentialUtilCompanionExternalSyntheticLambda13 = (BeginGetCredentialUtilCompanionExternalSyntheticLambda13) obj2;
                    }
                    eventDispatcher.IAuthTabCallback(beginGetCredentialUtilCompanionExternalSyntheticLambda13);
                    maybeReportErrorFromResultReceiver maybereporterrorfromresultreceiver = (maybeReportErrorFromResultReceiver) event;
                    TossReactNativeFragment.IAuthTabCallback(this.onNavigationEvent, "shopping_tab_route_layout_ready", getWrite.IAuthTabCallback("event_name", maybereporterrorfromresultreceiver.internal_getEventNameCompat()), getWrite.IAuthTabCallback("view_tag", String.valueOf(maybereporterrorfromresultreceiver.getViewTag())));
                    if (this.onExtraCallback.onNavigationEvent()) {
                        maybeRemoveAttachStateListener<Boolean> mayberemoveattachstatelistener = this.onExtraCallback;
                        Result.Companion companion = Result.Companion;
                        mayberemoveattachstatelistener.resumeWith(Result.constructor-impl(Boolean.TRUE));
                        int i2 = IAuthTabCallback + 19;
                        IAuthTabCallbackDefault = i2 % 128;
                        int i3 = i2 % 2;
                    }
                }
                int i4 = IAuthTabCallback + 7;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }

        static final class onNavigationEvent implements Function1<Throwable, Unit> {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            final /* synthetic */ Ref.ObjectRef<BeginGetCredentialUtilCompanionExternalSyntheticLambda13> IAuthTabCallback;
            final /* synthetic */ EventDispatcher onWarmupCompleted;

            onNavigationEvent(EventDispatcher eventDispatcher, Ref.ObjectRef<BeginGetCredentialUtilCompanionExternalSyntheticLambda13> objectRef) {
                this.onWarmupCompleted = eventDispatcher;
                this.IAuthTabCallback = objectRef;
            }

            public /* synthetic */ Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 63;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                onNavigationEvent((Throwable) obj);
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    return unit;
                }
                throw null;
            }

            public final void onNavigationEvent(Throwable th) {
                BeginGetCredentialUtilCompanionExternalSyntheticLambda13 beginGetCredentialUtilCompanionExternalSyntheticLambda13;
                int i = 2 % 2;
                int i2 = onExtraCallback + 11;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                EventDispatcher eventDispatcher = this.onWarmupCompleted;
                Object obj = this.IAuthTabCallback.element;
                if (obj == null) {
                    int i4 = onExtraCallbackWithResult + 35;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    beginGetCredentialUtilCompanionExternalSyntheticLambda13 = null;
                } else {
                    beginGetCredentialUtilCompanionExternalSyntheticLambda13 = (BeginGetCredentialUtilCompanionExternalSyntheticLambda13) obj;
                }
                eventDispatcher.IAuthTabCallback(beginGetCredentialUtilCompanionExternalSyntheticLambda13);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(16, r7) != r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(16, r7) != r1) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0076 -> B:22:0x0087). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0085 -> B:22:0x0087). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EventDispatcher eventDispatcherExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                eventDispatcherExtraCallbackWithResult = TossReactNativeFragment.this.extraCallbackWithResult();
                if (eventDispatcherExtraCallbackWithResult == null) {
                }
                return objOnWarmupCompleted;
            }
            int i5 = onNavigationEvent;
            int i6 = i5 + 103;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i5 + 1;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                ResultKt.onNavigationEvent(obj);
                int i10 = IAuthTabCallback + 125;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            eventDispatcherExtraCallbackWithResult = TossReactNativeFragment.this.extraCallbackWithResult();
            if (eventDispatcherExtraCallbackWithResult == null) {
                int i12 = onNavigationEvent + 19;
                IAuthTabCallback = i12 % 128;
                if (i12 % 2 == 0) {
                    this.L$0 = access15400.onNavigationEvent(eventDispatcherExtraCallbackWithResult);
                    this.label = 0;
                } else {
                    this.L$0 = access15400.onNavigationEvent(eventDispatcherExtraCallbackWithResult);
                    this.label = 1;
                }
                if (eventDispatcherExtraCallbackWithResult == null) {
                    TossReactNativeFragment tossReactNativeFragment = TossReactNativeFragment.this;
                    this.L$0 = access15400.onNavigationEvent(eventDispatcherExtraCallbackWithResult);
                    this.L$1 = eventDispatcherExtraCallbackWithResult;
                    this.L$2 = tossReactNativeFragment;
                    this.I$0 = 0;
                    this.label = 2;
                    setResourceInternal setresourceinternal = new setResourceInternal(access14300.onWarmupCompleted(this), 1);
                    setresourceinternal.onTransact();
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(eventDispatcherExtraCallbackWithResult, objectRef, tossReactNativeFragment, setresourceinternal);
                    objectRef.element = onwarmupcompleted;
                    eventDispatcherExtraCallbackWithResult.onWarmupCompleted(onwarmupcompleted);
                    setresourceinternal.IAuthTabCallback(new onNavigationEvent(eventDispatcherExtraCallbackWithResult, objectRef));
                    Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
                    if (objIAuthTabCallbackDefault == access14300.onWarmupCompleted()) {
                        int i13 = IAuthTabCallback + 17;
                        onNavigationEvent = i13 % 128;
                        int i14 = i13 % 2;
                        access14600.IAuthTabCallback(this);
                        if (i14 != 0) {
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    }
                    if (objIAuthTabCallbackDefault != objOnWarmupCompleted) {
                        return objIAuthTabCallbackDefault;
                    }
                }
            }
            return objOnWarmupCompleted;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(long j, @NotNull access13800<? super Boolean> access13800Var) {
        IAuthTabCallbackDefault iAuthTabCallbackDefault;
        int i = 2 % 2;
        int i2 = writeTypedList + 107;
        int i3 = i2 % 128;
        access200 = i3;
        int i4 = i2 % 2;
        if (access13800Var instanceof IAuthTabCallbackDefault) {
            int i5 = i3 + 119;
            writeTypedList = i5 % 128;
            int i6 = i5 % 2;
            iAuthTabCallbackDefault = (IAuthTabCallbackDefault) access13800Var;
            int i7 = iAuthTabCallbackDefault.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                int i8 = writeTypedList + 47;
                access200 = i8 % 128;
                if (i8 % 2 != 0) {
                    iAuthTabCallbackDefault.label = i7 >> Integer.MIN_VALUE;
                } else {
                    iAuthTabCallbackDefault.label = i7 - 2147483648;
                }
            } else {
                iAuthTabCallbackDefault = new IAuthTabCallbackDefault(access13800Var);
            }
        }
        Object objOnWarmupCompleted = iAuthTabCallbackDefault.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i9 = iAuthTabCallbackDefault.label;
        if (i9 == 0) {
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
            asBinder asbinder = new asBinder(null);
            iAuthTabCallbackDefault.J$0 = j;
            iAuthTabCallbackDefault.label = 1;
            objOnWarmupCompleted = doGet.onWarmupCompleted(j, asbinder, iAuthTabCallbackDefault);
            if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                int i10 = writeTypedList + 45;
                access200 = i10 % 128;
                if (i10 % 2 == 0) {
                    return objOnWarmupCompleted2;
                }
                throw null;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
        }
        Boolean bool = (Boolean) objOnWarmupCompleted;
        return access14000.onNavigationEvent(bool != null ? bool.booleanValue() : false);
    }

    public final void onWarmupCompleted(@NotNull hbExternalSyntheticLambda8 hbexternalsyntheticlambda8) {
        int i = 2 % 2;
        int i2 = access200 + 7;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(hbexternalsyntheticlambda8, "");
        this.postMessage = hbexternalsyntheticlambda8;
        int i4 = access200 + 37;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallbackWithResult(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = access200 + 55;
        writeTypedList = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function0, "");
            this.ICustomTabsCallback_Parcel = function0;
        } else {
            Intrinsics.checkNotNullParameter(function0, "");
            this.ICustomTabsCallback_Parcel = function0;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void IAuthTabCallback(@NotNull Function0<Boolean> function0) {
        int i = 2 % 2;
        int i2 = access200 + 35;
        writeTypedList = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function0, "");
            this.mayLaunchUrl = function0;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function0, "");
        this.mayLaunchUrl = function0;
        int i3 = access200 + 63;
        writeTypedList = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void onWarmupCompleted(@Nullable Function1<? super Throwable, Boolean> function1) {
        int i = 2 % 2;
        int i2 = access200 + 19;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStub = function1;
        if (i3 == 0) {
            throw null;
        }
    }

    public final void onExtraCallbackWithResult(@Nullable Function1<? super hbExternalSyntheticLambda2, Unit> function1) {
        int i = 2 % 2;
        int i2 = writeTypedList + 95;
        int i3 = i2 % 128;
        access200 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.onUnminimized = function1;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 101;
        writeTypedList = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = writeTypedList + 103;
        int i3 = i2 % 128;
        access200 = i3;
        int i4 = i2 % 2;
        this.onRelationshipValidationResult = function0;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 49;
        writeTypedList = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onNavigationEvent(@Nullable Function1<? super hbExternalSyntheticLambda4, Unit> function1) {
        int i = 2 % 2;
        int i2 = access200;
        int i3 = i2 + 31;
        writeTypedList = i3 % 128;
        int i4 = i3 % 2;
        this.ICustomTabsCallbackStub = function1;
        int i5 = i2 + 71;
        writeTypedList = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void prefetchWithMultipleUrls() {
        String strValueOf;
        int i = 2 % 2;
        View view = getView();
        String str = "null";
        if (view == null || (strValueOf = String.valueOf(view.hashCode())) == null) {
            strValueOf = "null";
        }
        Pair<String, String> pairIAuthTabCallback = getWrite.IAuthTabCallback("view_hash", strValueOf);
        FrameLayout frameLayout = this.newAuthTabSession;
        if (frameLayout != null) {
            int i2 = writeTypedList + 23;
            access200 = i2 % 128;
            if (i2 % 2 != 0) {
                String.valueOf(frameLayout.hashCode());
                throw null;
            }
            String strValueOf2 = String.valueOf(frameLayout.hashCode());
            if (strValueOf2 == null) {
                int i3 = writeTypedList + 55;
                access200 = i3 % 128;
                int i4 = i3 % 2;
            } else {
                str = strValueOf2;
            }
        }
        onWarmupCompleted("fragment_prepare_for_slide_in", pairIAuthTabCallback, getWrite.IAuthTabCallback("root_hash", str));
        View view2 = getView();
        if (view2 != null) {
            view2.clearAnimation();
            view2.setAlpha(1.0f);
            view2.setTranslationX(0.0f);
            view2.setBackgroundColor(((Integer) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, view2}, -1579584123, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1579584156)).intValue());
        }
        FrameLayout frameLayout2 = this.newAuthTabSession;
        if (frameLayout2 != null) {
            int i5 = writeTypedList + 107;
            access200 = i5 % 128;
            int i6 = i5 % 2;
            frameLayout2.clearAnimation();
            frameLayout2.setAlpha(1.0f);
            frameLayout2.setTranslationX(0.0f);
            frameLayout2.setBackgroundColor(((Integer) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, frameLayout2}, -1579584123, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1579584156)).intValue());
            int i7 = access200 + 65;
            writeTypedList = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private static final MaxFullscreenAdImplExternalSyntheticLambda8 onExtraCallbackWithResult(String str, Map map, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = access200 + 5;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda82 = (MaxFullscreenAdImplExternalSyntheticLambda8) MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, iIAuthTabCallback, new Object[]{maxFullscreenAdImplExternalSyntheticLambda8, null, null, str, map, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 4194291, null}, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), 1651567374);
        int i4 = writeTypedList + 91;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        return maxFullscreenAdImplExternalSyntheticLambda82;
    }

    public final void onExtraCallback(@NotNull final String str, @NotNull final Map<String, String> map) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a(new char[]{27219, 55039, 4892}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 48298, objArr);
        onNavigationEvent("send_embedded_rn_present", getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str), getWrite.IAuthTabCallback("route_parameter_count", String.valueOf(map.size())), getWrite.IAuthTabCallback("route_parameter_keys", CollectionsKt.joinToString$default(map.keySet(), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)));
        onExtraCallback(new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda17
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 119;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    TossReactNativeFragment.onNavigationEvent(str, map, (MaxFullscreenAdImplExternalSyntheticLambda8) obj);
                    throw null;
                }
                MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8OnNavigationEvent = TossReactNativeFragment.onNavigationEvent(str, map, (MaxFullscreenAdImplExternalSyntheticLambda8) obj);
                int i4 = IAuthTabCallback + 93;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return maxFullscreenAdImplExternalSyntheticLambda8OnNavigationEvent;
            }
        });
        if (!onWarmupCompleted(str)) {
            Object[] objArr2 = {this, "embedded_present_emit_fragment", new Function0() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda18
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke() {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 31;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unitOnWarmupCompleted = TossReactNativeFragment.onWarmupCompleted(this.f$0, str);
                    int i5 = IAuthTabCallback + 59;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        return unitOnWarmupCompleted;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }};
            onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr2, -678580714, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 678580731);
            return;
        }
        int i2 = access200 + 51;
        writeTypedList = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 63 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedList + 113;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            TossModule tossModule = tossReactNativeFragment.warmup;
            throw null;
        }
        TossModule tossModule2 = tossReactNativeFragment.warmup;
        if (tossModule2 == null) {
            return null;
        }
        TossModule.onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1911196623, new Object[]{tossModule2, str}, -1911196621, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i3 = writeTypedList + 125;
        access200 = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private final boolean onWarmupCompleted(String str) throws Throwable {
        String strOnNavigationEvent;
        n3 n3VarIEngagementSignalsCallback_Parcel = IEngagementSignalsCallback_Parcel();
        if (n3VarIEngagementSignalsCallback_Parcel == null) {
            n3VarIEngagementSignalsCallback_Parcel = n3.Companion.onWarmupCompleted();
        }
        boolean z = false;
        if (!n3VarIEngagementSignalsCallback_Parcel.IAuthTabCallback_Parcel()) {
            return false;
        }
        hcExternalSyntheticLambda0 hcexternalsyntheticlambda0ICustomTabsCallbackStub = ICustomTabsCallbackStub();
        if (hcexternalsyntheticlambda0ICustomTabsCallbackStub == null || (strOnNavigationEvent = hcexternalsyntheticlambda0ICustomTabsCallbackStub.IAuthTabCallback()) == null) {
            strOnNavigationEvent = ICustomTabsCallbackStubProxy().onNavigationEvent();
        }
        synchronized (this.onPostMessage) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (((Boolean) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, strOnNavigationEvent}, -824080768, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 824080794)).booleanValue()) {
                this.onMinimized = null;
                return false;
            }
            this.onMinimized = new onNavigationEvent(str, z, 2, defaultConstructorMarker);
            Unit unit = Unit.INSTANCE;
            Object[] objArr = new Object[1];
            a(new char[]{27219, 55039, 4892}, TextUtils.getOffsetAfter("", 0) + 48299, objArr);
            onNavigationEvent("send_embedded_rn_present_deferred", getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str), getWrite.IAuthTabCallback("service_bundle_name", strOnNavigationEvent));
            onWarmupCompleted("embedded_present_deferred_until_import_lazy", getWrite.IAuthTabCallback("service_bundle_name", strOnNavigationEvent));
            if (((Boolean) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, strOnNavigationEvent}, -824080768, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 824080794)).booleanValue()) {
                IAuthTabCallback("import_completed_concurrently");
            }
            return true;
        }
    }

    private final void IAuthTabCallback(String str) throws Throwable {
        final onNavigationEvent onnavigationevent;
        synchronized (this.onPostMessage) {
            onnavigationevent = this.onMinimized;
            this.onMinimized = null;
        }
        if (onnavigationevent != null) {
            Object[] objArr = new Object[1];
            a(new char[]{27219, 55039, 4892}, 48300 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
            Pair<String, String> pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), onnavigationevent.onExtraCallback());
            Object[] objArr2 = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41540 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
            onNavigationEvent("flush_pending_embedded_rn_present", pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str), getWrite.IAuthTabCallback("transition_end_requested", String.valueOf(onnavigationevent.onNavigationEvent())));
            Object[] objArr3 = {this, "embedded_present_emit_after_import_lazy", new Function0() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda24
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 33;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    Unit unitOnWarmupCompleted = TossReactNativeFragment.onWarmupCompleted(this.f$0, onnavigationevent);
                    int i4 = onExtraCallbackWithResult + 79;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        return unitOnWarmupCompleted;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }};
            onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr3, -678580714, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 678580731);
            if (onnavigationevent.onNavigationEvent()) {
                Object[] objArr4 = {this, "embedded_present_transition_end_emit_fragment", new Function0() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda25
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke() {
                        int i = 2 % 2;
                        int i2 = onExtraCallback + 111;
                        onExtraCallbackWithResult = i2 % 128;
                        int i3 = i2 % 2;
                        TossReactNativeFragment tossReactNativeFragment = this.f$0;
                        if (i3 == 0) {
                            return TossReactNativeFragment.onExtraCallback(tossReactNativeFragment);
                        }
                        TossReactNativeFragment.onExtraCallback(tossReactNativeFragment);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }};
                onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr4, -678580714, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 678580731);
            }
        }
    }

    private static final Unit onNavigationEvent(TossReactNativeFragment tossReactNativeFragment, onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = writeTypedList + 117;
        int i3 = i2 % 128;
        access200 = i3;
        int i4 = i2 % 2;
        TossModule tossModule = tossReactNativeFragment.warmup;
        if (tossModule == null) {
            return null;
        }
        int i5 = i3 + 117;
        writeTypedList = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {tossModule, onnavigationevent.onExtraCallback()};
        TossModule.onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1911196623, objArr, -1911196621, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    private static final Unit onActivityResized(TossReactNativeFragment tossReactNativeFragment) {
        int i = 2 % 2;
        int i2 = access200 + 17;
        int i3 = i2 % 128;
        writeTypedList = i3;
        int i4 = i2 % 2;
        TossModule tossModule = tossReactNativeFragment.warmup;
        if (i4 == 0) {
            int i5 = 32 / 0;
            if (tossModule == null) {
                return null;
            }
        } else if (tossModule == null) {
            return null;
        }
        int i6 = i3 + 77;
        access200 = i6 % 128;
        int i7 = i6 % 2;
        tossModule.ICustomTabsCallback();
        return Unit.INSTANCE;
    }

    private final void onExtraCallback(String str) throws Throwable {
        onNavigationEvent onnavigationevent;
        synchronized (this.onPostMessage) {
            onnavigationevent = this.onMinimized;
            this.onMinimized = null;
        }
        if (onnavigationevent != null) {
            Object[] objArr = new Object[1];
            a(new char[]{27219, 55039, 4892}, 48299 - Gravity.getAbsoluteGravity(0, 0), objArr);
            Pair<String, String> pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), onnavigationevent.onExtraCallback());
            Object[] objArr2 = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 41539, objArr2);
            onNavigationEvent("clear_pending_embedded_rn_present", pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str));
        }
    }

    public final void validateRelationship() throws Throwable {
        boolean z;
        onNavigationEvent("send_embedded_rn_present_transition_end", new Pair[0]);
        synchronized (this.onPostMessage) {
            onNavigationEvent onnavigationevent = this.onMinimized;
            if (onnavigationevent != null) {
                z = true;
                this.onMinimized = onNavigationEvent.onExtraCallbackWithResult(onnavigationevent, null, true, 1, null);
            } else {
                z = false;
            }
        }
        if (z) {
            onNavigationEvent("send_embedded_rn_present_transition_end_deferred", new Pair[0]);
            return;
        }
        Object[] objArr = {this, "embedded_present_transition_end_emit_fragment", new Function0() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda5
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 37;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitAsBinder = TossReactNativeFragment.asBinder(this.f$0);
                int i4 = onExtraCallback + 107;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitAsBinder;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }};
        onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr, -678580714, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 678580731);
    }

    private static final Unit ICustomTabsCallbackStubProxy(TossReactNativeFragment tossReactNativeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedList + 103;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        TossModule tossModule = tossReactNativeFragment.warmup;
        if (i3 != 0) {
            int i4 = 48 / 0;
            if (tossModule == null) {
                return null;
            }
        } else if (tossModule == null) {
            return null;
        }
        tossModule.ICustomTabsCallback();
        Unit unit = Unit.INSTANCE;
        int i5 = writeTypedList + 39;
        access200 = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final MaxFullscreenAdImplExternalSyntheticLambda8 asInterface(MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        Object objOnNavigationEvent;
        int i = 2 % 2;
        int i2 = access200 + 125;
        writeTypedList = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
            Object[] objArr = {maxFullscreenAdImplExternalSyntheticLambda8, null, null, null, access8100.onNavigationEvent(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 4194291, null};
            objOnNavigationEvent = MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, R.drawable.IAuthTabCallback(), objArr, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1651567374);
        } else {
            Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
            Object[] objArr2 = {maxFullscreenAdImplExternalSyntheticLambda8, null, null, null, access8100.onNavigationEvent(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 4194291, null};
            objOnNavigationEvent = MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, R.drawable.IAuthTabCallback(), objArr2, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1651567374);
        }
        return (MaxFullscreenAdImplExternalSyntheticLambda8) objOnNavigationEvent;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        int i = 2 % 2;
        tossReactNativeFragment.onNavigationEvent("send_embedded_rn_dismiss", new Pair[0]);
        tossReactNativeFragment.onExtraCallback("dismiss");
        tossReactNativeFragment.onExtraCallback(new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda21
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 69;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8OnExtraCallbackWithResult = TossReactNativeFragment.onExtraCallbackWithResult((MaxFullscreenAdImplExternalSyntheticLambda8) obj);
                int i5 = onWarmupCompleted + 79;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return maxFullscreenAdImplExternalSyntheticLambda8OnExtraCallbackWithResult;
            }
        });
        TossModule tossModule = tossReactNativeFragment.warmup;
        if (tossModule != null) {
            int i2 = writeTypedList + 25;
            access200 = i2 % 128;
            int i3 = i2 % 2;
            tossModule.extraCallbackWithResult();
        }
        int i4 = writeTypedList + 15;
        access200 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return null;
    }

    public final boolean onExtraCallbackWithResult(@NotNull final MaxNativeAdImpl maxNativeAdImpl) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(maxNativeAdImpl, "");
        onNavigationEvent("request_shared_bundle_load_on_warmup_start", getWrite.IAuthTabCallback("bundle_name", maxNativeAdImpl.onExtraCallbackWithResult()));
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        n6 n6Var = (n6) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -1098765882, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1098765903);
        if (n6Var == null) {
            int i2 = writeTypedList + 29;
            access200 = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, TextUtils.getOffsetAfter("", 0) + 41539, objArr);
            onNavigationEvent("request_shared_bundle_load_on_warmup_skip", getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "warmup_request_null"));
            return false;
        }
        if (!Intrinsics.areEqual(n6Var.IAuthTabCallback(), maxNativeAdImpl.onExtraCallbackWithResult())) {
            int i4 = access200 + 73;
            writeTypedList = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr2 = new Object[1];
                a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41540 >>> (Process.getElapsedCpuTime() > 1L ? 1 : (Process.getElapsedCpuTime() == 1L ? 0 : -1)), objArr2);
                onNavigationEvent("request_shared_bundle_load_on_warmup_skip", getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), "bundle_mismatch"));
                return true;
            }
            Object[] objArr3 = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41540 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
            onNavigationEvent("request_shared_bundle_load_on_warmup_skip", getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), "bundle_mismatch"));
            return false;
        }
        if (newAuthTabSession().IAuthTabCallback() == n0a.Loading) {
            if (!areNotificationsEnabled()) {
                onExtraCallback(new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda43
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i5 = 2 % 2;
                        int i6 = onNavigationEvent + 75;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8OnWarmupCompleted = TossReactNativeFragment.onWarmupCompleted(maxNativeAdImpl, (MaxFullscreenAdImplExternalSyntheticLambda8) obj);
                        int i8 = onWarmupCompleted + 71;
                        onNavigationEvent = i8 % 128;
                        if (i8 % 2 != 0) {
                            return maxFullscreenAdImplExternalSyntheticLambda8OnWarmupCompleted;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                });
                onNavigationEvent("request_shared_bundle_load_on_warmup_success", getWrite.IAuthTabCallback("bundle_name", maxNativeAdImpl.onExtraCallbackWithResult()));
                return true;
            }
            Object[] objArr4 = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, Drawable.resolveOpacity(0, 0) + 41539, objArr4);
            onNavigationEvent("request_shared_bundle_load_on_warmup_skip", getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), "already_requested_or_completed"));
            return false;
        }
        int i5 = writeTypedList + 5;
        access200 = i5 % 128;
        if (i5 % 2 != 0) {
            Object[] objArr5 = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41539 >>> KeyEvent.keyCodeFromString(""), objArr5);
            Pair<String, String>[] pairArr = new Pair[1];
            pairArr[1] = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), "shared_bundle_not_loading");
            onNavigationEvent("request_shared_bundle_load_on_warmup_skip", pairArr);
        } else {
            Object[] objArr6 = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41539 - KeyEvent.keyCodeFromString(""), objArr6);
            onNavigationEvent("request_shared_bundle_load_on_warmup_skip", getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), "shared_bundle_not_loading"));
        }
        return false;
    }

    public final boolean onExtraCallbackWithResult(@NotNull o3 o3Var) {
        int i = 2 % 2;
        int i2 = access200 + 85;
        writeTypedList = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(o3Var, "");
            return onExtraCallbackWithResult(r8lambdazHtRG_L3e9EUlKNiS_FUXM65OBo.onWarmupCompleted(o3Var.IAuthTabCallback()));
        }
        Intrinsics.checkNotNullParameter(o3Var, "");
        int i3 = 79 / 0;
        return onExtraCallbackWithResult(r8lambdazHtRG_L3e9EUlKNiS_FUXM65OBo.onWarmupCompleted(o3Var.IAuthTabCallback()));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082 A[PHI: r2 r4
      0x0082: PHI (r2v6 int) = (r2v5 int), (r2v10 int) binds: [B:17:0x0080, B:14:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r4v8 o.n0c$onWarmupCompleted) = (r4v7 o.n0c$onWarmupCompleted), (r4v11 o.n0c$onWarmupCompleted) binds: [B:17:0x0080, B:14:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b A[PHI: r4
      0x009b: PHI (r4v10 o.n0c$onWarmupCompleted) = (r4v7 o.n0c$onWarmupCompleted), (r4v11 o.n0c$onWarmupCompleted) binds: [B:17:0x0080, B:14:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        n0c.onWarmupCompleted onwarmupcompletedIAuthTabCallback;
        int i;
        n2 n2Var;
        final TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        final r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs r8lambdakxm8vml8ayvtemvtk3wjevwfnzs = (r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs) objArr[1];
        ReactHost reactHost = (ReactHost) objArr[2];
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakxm8vml8ayvtemvtk3wjevwfnzs, "");
        if (r8lambdakxm8vml8ayvtemvtk3wjevwfnzs instanceof r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.onWarmupCompleted) {
            tossReactNativeFragment.onExtraCallback(new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda6
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj) {
                    int i3 = 2 % 2;
                    int i4 = onExtraCallbackWithResult + 25;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        TossReactNativeFragment.IAuthTabCallback(r8lambdakxm8vml8ayvtemvtk3wjevwfnzs, tossReactNativeFragment, (MaxFullscreenAdImplExternalSyntheticLambda8) obj);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8IAuthTabCallback = TossReactNativeFragment.IAuthTabCallback(r8lambdakxm8vml8ayvtemvtk3wjevwfnzs, tossReactNativeFragment, (MaxFullscreenAdImplExternalSyntheticLambda8) obj);
                    int i5 = onExtraCallback + 99;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return maxFullscreenAdImplExternalSyntheticLambda8IAuthTabCallback;
                }
            });
            boolean zOnWarmupCompleted = onWarmupCompleted(tossReactNativeFragment, r8lambdazHtRG_L3e9EUlKNiS_FUXM65OBo.onWarmupCompleted(((r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.onWarmupCompleted) r8lambdakxm8vml8ayvtemvtk3wjevwfnzs).onWarmupCompleted()), reactHost, null, 4, null);
            if (!zOnWarmupCompleted) {
                tossReactNativeFragment.onExtraCallback(new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda7
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj) {
                        int i3 = 2 % 2;
                        int i4 = onExtraCallbackWithResult + 25;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8 = (MaxFullscreenAdImplExternalSyntheticLambda8) TossReactNativeFragment.onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{(MaxFullscreenAdImplExternalSyntheticLambda8) obj}, 755378419, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -755378372);
                        int i6 = onExtraCallbackWithResult + 61;
                        IAuthTabCallback = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 17 / 0;
                        }
                        return maxFullscreenAdImplExternalSyntheticLambda8;
                    }
                });
            }
            return Boolean.valueOf(zOnWarmupCompleted);
        }
        if (!(r8lambdakxm8vml8ayvtemvtk3wjevwfnzs instanceof r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.IAuthTabCallback)) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = access200 + 17;
        writeTypedList = i3 % 128;
        if (i3 % 2 == 0) {
            r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.IAuthTabCallback iAuthTabCallback = (r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.IAuthTabCallback) r8lambdakxm8vml8ayvtemvtk3wjevwfnzs;
            tossReactNativeFragment.onExtraCallbackWithResult(iAuthTabCallback);
            onwarmupcompletedIAuthTabCallback = r8lambdazHtRG_L3e9EUlKNiS_FUXM65OBo.IAuthTabCallback(iAuthTabCallback);
            i = asInterface.onNavigationEvent[iAuthTabCallback.onNavigationEvent().ordinal()];
            if (i != 1) {
                int i4 = access200 + 59;
                writeTypedList = i4 % 128;
                if (i4 % 2 != 0 ? i != 2 : i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                n2Var = n2.SharedBundleLoadFailed;
            } else {
                n2Var = n2.ServiceBundleLoadFailed;
            }
        } else {
            r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.IAuthTabCallback iAuthTabCallback2 = (r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.IAuthTabCallback) r8lambdakxm8vml8ayvtemvtk3wjevwfnzs;
            tossReactNativeFragment.onExtraCallbackWithResult(iAuthTabCallback2);
            onwarmupcompletedIAuthTabCallback = r8lambdazHtRG_L3e9EUlKNiS_FUXM65OBo.IAuthTabCallback(iAuthTabCallback2);
            i = asInterface.onNavigationEvent[iAuthTabCallback2.onNavigationEvent().ordinal()];
            if (i != 1) {
            }
        }
        return Boolean.valueOf(tossReactNativeFragment.onExtraCallback(onwarmupcompletedIAuthTabCallback, reactHost, n2Var));
    }

    public static /* synthetic */ boolean IAuthTabCallback(TossReactNativeFragment tossReactNativeFragment, r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs r8lambdakxm8vml8ayvtemvtk3wjevwfnzs, ReactHost reactHost, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = writeTypedList;
        int i4 = i3 + 113;
        access200 = i4 % 128;
        if (i4 % 2 == 0 ? (i & 2) != 0 : (i & 5) != 0) {
            int i5 = i3 + 59;
            access200 = i5 % 128;
            int i6 = i5 % 2;
            reactHost = null;
        }
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{tossReactNativeFragment, r8lambdakxm8vml8ayvtemvtk3wjevwfnzs, reactHost}, -530029191, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 530029194)).booleanValue();
    }

    private static final MaxFullscreenAdImplExternalSyntheticLambda8 onExtraCallbackWithResult(r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs r8lambdakxm8vml8ayvtemvtk3wjevwfnzs, TossReactNativeFragment tossReactNativeFragment, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = writeTypedList + 107;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
        r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.onWarmupCompleted onwarmupcompleted = (r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.onWarmupCompleted) r8lambdakxm8vml8ayvtemvtk3wjevwfnzs;
        Object[] objArr = {maxFullscreenAdImplExternalSyntheticLambda8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, tossReactNativeFragment.onWarmupCompleted(onwarmupcompleted.onNavigationEvent()), null, null, null, onwarmupcompleted.onNavigationEvent(), false, 3080191, null};
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda82 = (MaxFullscreenAdImplExternalSyntheticLambda8) MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, R.drawable.IAuthTabCallback(), objArr, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1651567374);
        int i4 = writeTypedList + 115;
        access200 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
        return maxFullscreenAdImplExternalSyntheticLambda82;
    }

    public static /* synthetic */ boolean onWarmupCompleted(TossReactNativeFragment tossReactNativeFragment, n0c n0cVar, ReactHost reactHost, n2 n2Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = access200 + 37;
        int i4 = i3 % 128;
        writeTypedList = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 25;
            access200 = i6 % 128;
            int i7 = i6 % 2;
            reactHost = null;
        }
        if ((i & 4) != 0) {
            n2Var = n2.SharedBundleLoadFailed;
        }
        return tossReactNativeFragment.onExtraCallback(n0cVar, reactHost, n2Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final MaxFullscreenAdImplExternalSyntheticLambda8 onNavigationEvent(n0c n0cVar, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) throws NoWhenBranchMatchedException {
        n0a n0aVar;
        int i = 2 % 2;
        int i2 = writeTypedList + 53;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
        n5 typedObject = maxFullscreenAdImplExternalSyntheticLambda8.readTypedObject();
        if (n0cVar instanceof n0c.onExtraCallbackWithResult) {
            n0aVar = n0a.Loaded;
        } else {
            if (!(n0cVar instanceof n0c.onWarmupCompleted)) {
                throw new NoWhenBranchMatchedException();
            }
            int i4 = writeTypedList + 77;
            access200 = i4 % 128;
            int i5 = i4 % 2;
            n0aVar = n0a.Failed;
        }
        Object[] objArr = {maxFullscreenAdImplExternalSyntheticLambda8, null, null, null, null, null, null, null, n0cVar, null, null, null, null, null, n5.onNavigationEvent(typedObject, null, null, n0aVar, false, false, null, 59, null), null, null, null, null, null, null, null, false, 4185983, null};
        return (MaxFullscreenAdImplExternalSyntheticLambda8) MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, R.drawable.IAuthTabCallback(), objArr, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1651567374);
    }

    public final boolean onExtraCallback(@NotNull final n0c n0cVar, @Nullable ReactHost reactHost, @NotNull n2 n2Var) throws Throwable {
        String strValueOf;
        ReactHost reactHost2;
        String strValueOf2;
        int i = 2 % 2;
        int i2 = writeTypedList + 37;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(n0cVar, "");
        Intrinsics.checkNotNullParameter(n2Var, "");
        Object[] objArr = new Object[1];
        a(new char[]{27220, 41988, 63195, 134, 21334, 27953}, 52807 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
        Pair<String, String> pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), n0cVar.getClass().getSimpleName());
        Pair<String, String> pairIAuthTabCallback2 = getWrite.IAuthTabCallback("bundle_name", n0cVar.onExtraCallbackWithResult().onExtraCallbackWithResult());
        String str = "null";
        if (reactHost == null || (strValueOf = String.valueOf(reactHost.hashCode())) == null) {
            strValueOf = "null";
        }
        onNavigationEvent("apply_shared_bundle_load_result_start", pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("target_react_host_hash", strValueOf));
        n6 n6Var = (n6) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -1098765882, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1098765903);
        if (n6Var == null) {
            int i4 = access200 + 45;
            writeTypedList = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr2 = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41539 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
            onNavigationEvent("apply_shared_bundle_load_result_skip", getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), "warmup_request_null"));
            return false;
        }
        if (!Intrinsics.areEqual(mayLaunchUrl(), n0cVar.onExtraCallbackWithResult())) {
            Object[] objArr3 = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41539 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr3);
            onNavigationEvent("apply_shared_bundle_load_result_skip", getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), "request_mismatch"));
            return false;
        }
        if (ICustomTabsService() != null) {
            Object[] objArr4 = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41538 - TextUtils.indexOf((CharSequence) "", '0'), objArr4);
            onNavigationEvent("apply_shared_bundle_load_result_skip", getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), "result_already_applied"));
            return false;
        }
        if (newAuthTabSession().IAuthTabCallback() != n0a.Loading) {
            Object[] objArr5 = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 41539, objArr5);
            onNavigationEvent("apply_shared_bundle_load_result_skip", getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), "shared_bundle_not_loading"));
            return false;
        }
        onExtraCallback(new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda45
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                int i6 = 2 % 2;
                int i7 = onNavigationEvent + 57;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8IAuthTabCallback = TossReactNativeFragment.IAuthTabCallback(n0cVar, (MaxFullscreenAdImplExternalSyntheticLambda8) obj);
                int i9 = onNavigationEvent + 33;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                return maxFullscreenAdImplExternalSyntheticLambda8IAuthTabCallback;
            }
        });
        if (!(!(n0cVar instanceof n0c.onExtraCallbackWithResult))) {
            int i6 = access200 + 75;
            writeTypedList = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (reactHost == null) {
                Function0<? extends ReactHost> function0 = this.prefetchWithMultipleUrls;
                reactHost2 = function0 != null ? (ReactHost) function0.invoke() : null;
            } else {
                reactHost2 = reactHost;
            }
            if (reactHost2 != null && (strValueOf2 = String.valueOf(reactHost2.hashCode())) != null) {
                str = strValueOf2;
            }
            onNavigationEvent("apply_shared_bundle_load_result_loaded", getWrite.IAuthTabCallback("resolved_react_host_hash", str));
            if (reactHost2 != null) {
                int i7 = access200 + 85;
                writeTypedList = i7 % 128;
                int i8 = i7 % 2;
                onNavigationEvent(reactHost2);
            } else if (this.updateVisuals) {
                ((Boolean) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, n6Var, (n0c.onExtraCallbackWithResult) n0cVar}, -336328580, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 336328590)).booleanValue();
            } else {
                onNavigationEvent((ReactHost) null);
            }
        } else if (n0cVar instanceof n0c.onWarmupCompleted) {
            n0c.onWarmupCompleted onwarmupcompleted = (n0c.onWarmupCompleted) n0cVar;
            Throwable thOnNavigationEvent = onwarmupcompleted.onNavigationEvent();
            if (thOnNavigationEvent != null) {
                int i9 = writeTypedList + 111;
                access200 = i9 % 128;
                int i10 = i9 % 2;
                String string = thOnNavigationEvent.toString();
                if (string == null) {
                    int i11 = writeTypedList + 15;
                    access200 = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    str = string;
                }
            }
            onNavigationEvent("apply_shared_bundle_load_result_failed", getWrite.IAuthTabCallback("throwable", str));
            onExtraCallbackWithResult(n6Var.onWarmupCompleted().IAuthTabCallback(n6Var.IAuthTabCallback(), n6Var.onExtraCallbackWithResult(), onExtraCallbackWithResult(n6Var, n2Var, onwarmupcompleted.onNavigationEvent()).IAuthTabCallback(), n2Var, onwarmupcompleted.onNavigationEvent()));
        }
        return true;
    }

    private static final MaxFullscreenAdImplExternalSyntheticLambda8 IAuthTabCallback_Parcel(MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = access200 + 45;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
        Object[] objArr = {maxFullscreenAdImplExternalSyntheticLambda8, null, null, null, null, null, null, null, null, null, null, null, null, null, n5.onNavigationEvent(maxFullscreenAdImplExternalSyntheticLambda8.readTypedObject(), n6a.Staying, null, null, true, false, hbExternalSyntheticLambda1.Ready, 6, null), null, null, null, null, null, null, null, false, 4184831, null};
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda82 = (MaxFullscreenAdImplExternalSyntheticLambda8) MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, R.drawable.IAuthTabCallback(), objArr, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1651567374);
        int i4 = access200 + 69;
        writeTypedList = i4 % 128;
        if (i4 % 2 != 0) {
            return maxFullscreenAdImplExternalSyntheticLambda82;
        }
        throw null;
    }

    public final boolean onNavigationEvent(@Nullable final ReactHost reactHost) throws Throwable {
        Object obj;
        int i = 2 % 2;
        boolean z = true;
        Object[] objArr = new Object[1];
        a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, View.combineMeasuredStates(0, 0) + 41539, objArr);
        String strIntern = ((String) objArr[0]).intern();
        onNavigationEvent("start_target_react_host_on_warmup_start", new Pair[0]);
        n6 n6Var = (n6) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -1098765882, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1098765903);
        if (n6Var == null) {
            int i2 = access200 + 61;
            writeTypedList = i2 % 128;
            if (i2 % 2 == 0) {
                onNavigationEvent("start_target_react_host_on_warmup_skip", getWrite.IAuthTabCallback(strIntern, "warmup_request_null"));
                return true;
            }
            onNavigationEvent("start_target_react_host_on_warmup_skip", getWrite.IAuthTabCallback(strIntern, "warmup_request_null"));
            return false;
        }
        if (!n6Var.onExtraCallback()) {
            onNavigationEvent("start_target_react_host_on_warmup_skip", getWrite.IAuthTabCallback(strIntern, "start_react_host_false"));
            return false;
        }
        if (newAuthTabSession().IAuthTabCallback() != n0a.Loaded) {
            int i3 = access200 + 69;
            writeTypedList = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent("start_target_react_host_on_warmup_skip", getWrite.IAuthTabCallback(strIntern, "shared_bundle_not_loaded"));
            int i5 = access200 + 11;
            writeTypedList = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 7 / 0;
            }
            return false;
        }
        if (newAuthTabSession().onNavigationEvent()) {
            onNavigationEvent("start_target_react_host_on_warmup_skip", getWrite.IAuthTabCallback(strIntern, "react_host_already_started"));
            return false;
        }
        if (this.ICustomTabsServiceStub.IAuthTabCallback()) {
            onNavigationEvent("start_target_react_host_on_warmup_skip", getWrite.IAuthTabCallback(strIntern, "warmup_terminal_published"));
            return false;
        }
        n0c n0cVarICustomTabsService = ICustomTabsService();
        n0c.onExtraCallbackWithResult onextracallbackwithresult = n0cVarICustomTabsService instanceof n0c.onExtraCallbackWithResult ? (n0c.onExtraCallbackWithResult) n0cVarICustomTabsService : null;
        if (onextracallbackwithresult == null) {
            return false;
        }
        if (reactHost == null) {
            return ((Boolean) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, n6Var, new IllegalStateException("ReactHost is not available for shopping tab RN warm-up")}, 979231155, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -979231126)).booleanValue();
        }
        this.prefetchWithMultipleUrls = new Function0() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda56
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i7 = 2 % 2;
                int i8 = onExtraCallback + 29;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                ReactHost reactHost2 = reactHost;
                if (i9 == 0) {
                    return TossReactNativeFragment.onExtraCallback(reactHost2);
                }
                TossReactNativeFragment.onExtraCallback(reactHost2);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        };
        if (!this.isEngagementSignalsApiAvailable.compareAndSet(false, true)) {
            onNavigationEvent("start_target_react_host_on_warmup_skip", getWrite.IAuthTabCallback(strIntern, "start_in_progress"));
            return false;
        }
        try {
            Result.Companion companion = Result.Companion;
            onNavigationEvent("start_target_react_host_on_warmup_host_start", getWrite.IAuthTabCallback("react_host_hash", String.valueOf(reactHost.hashCode())));
            obj = Result.constructor-impl(reactHost.onNavigationEvent());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 == null) {
            onExtraCallback(new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda57
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = onWarmupCompleted + 119;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8OnExtraCallback = TossReactNativeFragment.onExtraCallback((MaxFullscreenAdImplExternalSyntheticLambda8) obj2);
                    int i10 = onExtraCallbackWithResult + 97;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 != 0) {
                        return maxFullscreenAdImplExternalSyntheticLambda8OnExtraCallback;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
            onExtraCallbackWithResult(n6Var.onWarmupCompleted().IAuthTabCallback(n6Var.IAuthTabCallback(), n6Var.onExtraCallbackWithResult(), newAuthTabSession(), onextracallbackwithresult));
            onNavigationEvent("start_target_react_host_on_warmup_success", new Pair[0]);
        } else {
            onNavigationEvent("start_target_react_host_on_warmup_failure", getWrite.IAuthTabCallback("throwable", th2.toString()));
            ((Boolean) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, n6Var, th2}, 979231155, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -979231126)).booleanValue();
            z = false;
        }
        this.isEngagementSignalsApiAvailable.set(false);
        return z;
    }

    private static /* synthetic */ Object access100(Object[] objArr) throws Throwable {
        Object obj;
        Object obj2;
        AppCompatActivity appCompatActivity;
        boolean z;
        final TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        n6 n6Var = (n6) objArr[1];
        n0c.onExtraCallbackWithResult onextracallbackwithresult = (n0c.onExtraCallbackWithResult) objArr[2];
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, ExpandableListView.getPackedPositionType(0L) + 41539, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        tossReactNativeFragment.onNavigationEvent("start_internal_granite_react_host_on_warmup_start", new Pair[0]);
        if (!n6Var.onExtraCallback()) {
            int i2 = writeTypedList + 61;
            access200 = i2 % 128;
            if (i2 % 2 != 0) {
                tossReactNativeFragment.onNavigationEvent("start_internal_granite_react_host_on_warmup_skip", getWrite.IAuthTabCallback(strIntern, "start_react_host_false"));
            } else {
                tossReactNativeFragment.onNavigationEvent("start_internal_granite_react_host_on_warmup_skip", getWrite.IAuthTabCallback(strIntern, "start_react_host_false"));
            }
            return false;
        }
        if (tossReactNativeFragment.newAuthTabSession().IAuthTabCallback() != n0a.Loaded) {
            int i3 = writeTypedList + 21;
            access200 = i3 % 128;
            int i4 = i3 % 2;
            tossReactNativeFragment.onNavigationEvent("start_internal_granite_react_host_on_warmup_skip", getWrite.IAuthTabCallback(strIntern, "shared_bundle_not_loaded"));
            return false;
        }
        if (tossReactNativeFragment.newAuthTabSession().onNavigationEvent()) {
            int i5 = writeTypedList + 125;
            access200 = i5 % 128;
            int i6 = i5 % 2;
            tossReactNativeFragment.onNavigationEvent("start_internal_granite_react_host_on_warmup_skip", getWrite.IAuthTabCallback(strIntern, "react_host_already_started"));
            return false;
        }
        if (tossReactNativeFragment.ICustomTabsServiceStub.IAuthTabCallback()) {
            tossReactNativeFragment.onNavigationEvent("start_internal_granite_react_host_on_warmup_skip", getWrite.IAuthTabCallback(strIntern, "warmup_terminal_published"));
            return false;
        }
        if (!tossReactNativeFragment.isEngagementSignalsApiAvailable.compareAndSet(false, true)) {
            int i7 = writeTypedList + 43;
            access200 = i7 % 128;
            if (i7 % 2 == 0) {
                tossReactNativeFragment.onNavigationEvent("start_internal_granite_react_host_on_warmup_skip", getWrite.IAuthTabCallback(strIntern, "start_in_progress"));
                return false;
            }
            Pair<String, String>[] pairArr = new Pair[0];
            pairArr[0] = getWrite.IAuthTabCallback(strIntern, "start_in_progress");
            tossReactNativeFragment.onNavigationEvent("start_internal_granite_react_host_on_warmup_skip", pairArr);
            return true;
        }
        try {
            Result.Companion companion = Result.Companion;
            FragmentActivity fragmentActivityRequireActivity = tossReactNativeFragment.requireActivity();
            obj2 = null;
            appCompatActivity = fragmentActivityRequireActivity instanceof AppCompatActivity ? (AppCompatActivity) fragmentActivityRequireActivity : null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (appCompatActivity == null) {
            throw new IllegalStateException("Shopping tab RN Fragment requires AppCompatActivity host");
        }
        int i8 = writeTypedList;
        int i9 = i8 + 39;
        access200 = i9 % 128;
        int i10 = i9 % 2;
        FrameLayout frameLayout = tossReactNativeFragment.newAuthTabSession;
        if (frameLayout == null) {
            throw new IllegalStateException("React root container is not ready for shopping tab RN warm-up");
        }
        int i11 = i8 + 95;
        access200 = i11 % 128;
        if (i11 % 2 != 0) {
            tossReactNativeFragment.onNavigationEvent(onextracallbackwithresult);
            tossReactNativeFragment.notifyNotificationWithChannel();
            onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{tossReactNativeFragment, frameLayout, n6Var, onextracallbackwithresult}, 337806815, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -337806781);
            tossReactNativeFragment.isAdded();
            obj2.hashCode();
            throw null;
        }
        tossReactNativeFragment.onNavigationEvent(onextracallbackwithresult);
        tossReactNativeFragment.notifyNotificationWithChannel();
        onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{tossReactNativeFragment, frameLayout, n6Var, onextracallbackwithresult}, 337806815, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -337806781);
        if (!tossReactNativeFragment.isAdded() || tossReactNativeFragment.isRemoving()) {
            tossReactNativeFragment.onNavigationEvent("start_internal_granite_react_host_on_warmup_skip", getWrite.IAuthTabCallback(strIntern, "fragment_leaving"), getWrite.IAuthTabCallback("is_added", String.valueOf(tossReactNativeFragment.isAdded())), getWrite.IAuthTabCallback("is_removing", String.valueOf(tossReactNativeFragment.isRemoving())));
            tossReactNativeFragment.isEngagementSignalsApiAvailable.set(false);
            z = false;
        } else {
            tossReactNativeFragment.IAuthTabCallback(appCompatActivity, onextracallbackwithresult);
            tossReactNativeFragment.getInterfaceDescriptor = true;
            tossReactNativeFragment.prefetchWithMultipleUrls = new Function0() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda41
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke() {
                    int i12 = 2 % 2;
                    int i13 = onWarmupCompleted + 31;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    Object[] objArr3 = {this.f$0};
                    int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    ReactHost reactHost = (ReactHost) TossReactNativeFragment.onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr3, -152502573, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 152502613);
                    int i15 = IAuthTabCallback + 121;
                    onWarmupCompleted = i15 % 128;
                    if (i15 % 2 != 0) {
                        int i16 = 44 / 0;
                    }
                    return reactHost;
                }
            };
            tossReactNativeFragment.onNavigationEvent("start_internal_granite_react_host_on_warmup_success", new Pair[0]);
            z = true;
        }
        obj = Result.constructor-impl(Boolean.valueOf(z));
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            tossReactNativeFragment.isEngagementSignalsApiAvailable.set(false);
            tossReactNativeFragment.onNavigationEvent("start_internal_granite_react_host_on_warmup_failure", getWrite.IAuthTabCallback("throwable", th2.toString()));
            ((Boolean) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{tossReactNativeFragment, n6Var, th2}, 979231155, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -979231126)).booleanValue();
            obj = Boolean.FALSE;
        }
        return Boolean.valueOf(((Boolean) obj).booleanValue());
    }

    private static final ReactHost ICustomTabsCallback_Parcel(TossReactNativeFragment tossReactNativeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedList + 23;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        transExportCert transexportcertWriteTypedObject = tossReactNativeFragment.writeTypedObject();
        if (i3 == 0) {
            return transexportcertWriteTypedObject.onExtraCallback();
        }
        transexportcertWriteTypedObject.onExtraCallback();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(TossReactNativeFragment tossReactNativeFragment, FrameLayout frameLayout) throws Throwable {
        int i = 2 % 2;
        int i2 = access200 + 25;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        tossReactNativeFragment.onNavigationEvent("internal_granite_loading_view_consumer", new Pair[0]);
        Object[] objArr = new Object[1];
        a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41539 - Gravity.getAbsoluteGravity(0, 0), objArr);
        tossReactNativeFragment.onWarmupCompleted("root_container_remove_all_views", getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "loading_view_consumer"), getWrite.IAuthTabCallback("root_child_count_before", String.valueOf(frameLayout.getChildCount())));
        frameLayout.removeAllViews();
        Unit unit = Unit.INSTANCE;
        int i4 = access200 + 13;
        writeTypedList = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static final class IAuthTabCallbackStubProxy implements ViewTreeObserver.OnPreDrawListener {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ TossReactNativeFragment IAuthTabCallback;
        final /* synthetic */ ReactSurfaceView onNavigationEvent;

        IAuthTabCallbackStubProxy(ReactSurfaceView reactSurfaceView, TossReactNativeFragment tossReactNativeFragment) {
            this.onNavigationEvent = reactSurfaceView;
            this.IAuthTabCallback = tossReactNativeFragment;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            int i = 2 % 2;
            if (this.onNavigationEvent.getViewTreeObserver().isAlive()) {
                int i2 = onWarmupCompleted + 39;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    this.onNavigationEvent.getViewTreeObserver().removeOnPreDrawListener(this);
                    int i3 = 94 / 0;
                } else {
                    this.onNavigationEvent.getViewTreeObserver().removeOnPreDrawListener(this);
                }
            }
            TossReactNativeFragment.IAuthTabCallback(this.IAuthTabCallback, "react_surface_view_first_pre_draw", getWrite.IAuthTabCallback("surface_hash", String.valueOf(this.onNavigationEvent.hashCode())));
            int i4 = onExtraCallback + 43;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final boolean onUnminimized(TossReactNativeFragment tossReactNativeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedList;
        int i3 = i2 + 61;
        access200 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = tossReactNativeFragment.getInterfaceDescriptor;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 115;
        access200 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    private static final boolean ICustomTabsCallbackDefault(TossReactNativeFragment tossReactNativeFragment) {
        int i = 2 % 2;
        int i2 = writeTypedList + 87;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = tossReactNativeFragment.isEngagementSignalsApiAvailable.get();
        int i4 = writeTypedList + 123;
        access200 = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(TossReactNativeFragment tossReactNativeFragment, ReactSurfaceView reactSurfaceView) {
        int i = 2 % 2;
        int i2 = access200 + 9;
        writeTypedList = i2 % 128;
        if (i2 % 2 != 0) {
            tossReactNativeFragment.onWarmupCompleted("react_surface_view_first_draw", getWrite.IAuthTabCallback("surface_hash", String.valueOf(reactSurfaceView.hashCode())));
        } else {
            Pair<String, String>[] pairArr = new Pair[0];
            pairArr[0] = getWrite.IAuthTabCallback("surface_hash", String.valueOf(reactSurfaceView.hashCode()));
            tossReactNativeFragment.onWarmupCompleted("react_surface_view_first_draw", pairArr);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = writeTypedList + 35;
        access200 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 98 / 0;
        }
        return unit;
    }

    private static final Unit extraCommand(TossReactNativeFragment tossReactNativeFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = access200 + 57;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, TextUtils.indexOf("", "", 0) + 41539, objArr);
        tossReactNativeFragment.onNavigationEvent("internal_granite_pre_start_skip", getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "host_not_ready"));
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedList + 99;
        access200 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(TossReactNativeFragment tossReactNativeFragment, n6 n6Var, n0c.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedList + 5;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            tossReactNativeFragment.onNavigationEvent("internal_granite_surface_view_post_pre_start", new Pair[1]);
        } else {
            tossReactNativeFragment.onNavigationEvent("internal_granite_surface_view_post_pre_start", new Pair[0]);
        }
        tossReactNativeFragment.onWarmupCompleted(n6Var, onextracallbackwithresult);
        Unit unit = Unit.INSTANCE;
        int i3 = writeTypedList + 73;
        access200 = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(final TossReactNativeFragment tossReactNativeFragment, FrameLayout frameLayout, final n6 n6Var, final n0c.onExtraCallbackWithResult onextracallbackwithresult, final ReactSurfaceView reactSurfaceView) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(reactSurfaceView, "");
        tossReactNativeFragment.onNavigationEvent("internal_granite_surface_view_consumer", getWrite.IAuthTabCallback("surface_hash", String.valueOf(reactSurfaceView.hashCode())));
        tossReactNativeFragment.onWarmupCompleted("surface_view_consumer_called", getWrite.IAuthTabCallback("surface_hash", String.valueOf(reactSurfaceView.hashCode())), getWrite.IAuthTabCallback("root_child_count_before", String.valueOf(frameLayout.getChildCount())));
        frameLayout.removeAllViews();
        reactSurfaceView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(reactSurfaceView);
        tossReactNativeFragment.onWarmupCompleted("root_container_add_surface_view", getWrite.IAuthTabCallback("surface_hash", String.valueOf(reactSurfaceView.hashCode())), getWrite.IAuthTabCallback("root_child_count_after", String.valueOf(frameLayout.getChildCount())));
        reactSurfaceView.getViewTreeObserver().addOnPreDrawListener(new IAuthTabCallbackStubProxy(reactSurfaceView, tossReactNativeFragment));
        showAd.onNavigationEvent.onWarmupCompleted(reactSurfaceView, TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(tossReactNativeFragment), new Function0() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda27
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 115;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {this.f$0};
                if (i4 == 0) {
                    int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    return Boolean.valueOf(((Boolean) TossReactNativeFragment.onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr, 1204814391, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1204814345)).booleanValue());
                }
                int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                Boolean.valueOf(((Boolean) TossReactNativeFragment.onExtraCallback(iOnExtraCallbackWithResult3, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr, 1204814391, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, -1204814345)).booleanValue());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, new Function0() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda28
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 101;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolValueOf = Boolean.valueOf(TossReactNativeFragment.IAuthTabCallback(this.f$0));
                int i5 = onExtraCallbackWithResult + 79;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return boolValueOf;
                }
                throw null;
            }
        }, new Function0() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda29
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                Unit unit;
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 111;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    Object[] objArr = {this.f$0, reactSurfaceView};
                    int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    unit = (Unit) TossReactNativeFragment.onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr, 1155608975, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1155608957);
                    int i4 = 37 / 0;
                } else {
                    Object[] objArr2 = {this.f$0, reactSurfaceView};
                    int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    unit = (Unit) TossReactNativeFragment.onExtraCallback(iOnExtraCallbackWithResult3, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr2, 1155608975, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, -1155608957);
                }
                int i5 = onExtraCallbackWithResult + 43;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        }, new Function0() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda30
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 23;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {this.f$0};
                if (i4 == 0) {
                    int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    return (Unit) TossReactNativeFragment.onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr, -1985461483, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1985461518);
                }
                int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                throw null;
            }
        }, new Function0() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda31
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 33;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    TossReactNativeFragment.onNavigationEvent(this.f$0, n6Var, onextracallbackwithresult);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Unit unitOnNavigationEvent = TossReactNativeFragment.onNavigationEvent(this.f$0, n6Var, onextracallbackwithresult);
                int i4 = onExtraCallback + 77;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 / 0;
                }
                return unitOnNavigationEvent;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = writeTypedList + 81;
        access200 = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(TossReactNativeFragment tossReactNativeFragment, FrameLayout frameLayout, n6 n6Var, Throwable th) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        tossReactNativeFragment.onNavigationEvent("internal_granite_error_view_consumer", getWrite.IAuthTabCallback("error", th.toString()));
        Function1<? super Throwable, Boolean> function1 = tossReactNativeFragment.IAuthTabCallbackStub;
        if (function1 != null && ((Boolean) function1.invoke(th)).booleanValue()) {
            tossReactNativeFragment.onNavigationEvent("internal_granite_error_view_consumer_handled_by_host", getWrite.IAuthTabCallback("error", th.toString()));
            tossReactNativeFragment.onWarmupCompleted("embedded_rn_runtime_failure_handled_by_host", getWrite.IAuthTabCallback("error_type", th.getClass().getSimpleName()));
            tossReactNativeFragment.isEngagementSignalsApiAvailable.set(false);
            Unit unit = Unit.INSTANCE;
            int i2 = access200 + 73;
            writeTypedList = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 83 / 0;
            }
            return unit;
        }
        Object[] objArr = new Object[1];
        a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41539 - Color.alpha(0), objArr);
        tossReactNativeFragment.onWarmupCompleted("root_container_remove_all_views", getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "error_view_consumer"), getWrite.IAuthTabCallback("root_child_count_before", String.valueOf(frameLayout.getChildCount())));
        frameLayout.removeAllViews();
        frameLayout.addView(tossReactNativeFragment.onWarmupCompleted(th), new FrameLayout.LayoutParams(-1, -1));
        tossReactNativeFragment.isEngagementSignalsApiAvailable.set(false);
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        ((Boolean) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{tossReactNativeFragment, n6Var, th}, 979231155, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -979231126)).booleanValue();
        Unit unit2 = Unit.INSTANCE;
        int i4 = writeTypedList + 41;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        return unit2;
    }

    private static final MaxFullscreenAdImplExternalSyntheticLambda8 onWarmupCompleted(n0c.onExtraCallbackWithResult onextracallbackwithresult, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        Object objOnNavigationEvent;
        int i = 2 % 2;
        int i2 = access200 + 37;
        writeTypedList = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
            objOnNavigationEvent = MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, iIAuthTabCallback, new Object[]{maxFullscreenAdImplExternalSyntheticLambda8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, onextracallbackwithresult, null, true, 3670015, null}, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), 1651567374);
        } else {
            Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
            int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
            objOnNavigationEvent = MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, iIAuthTabCallback3, new Object[]{maxFullscreenAdImplExternalSyntheticLambda8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, onextracallbackwithresult, null, false, 3670015, null}, iIAuthTabCallback4, R.drawable.IAuthTabCallback(), 1651567374);
        }
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda82 = (MaxFullscreenAdImplExternalSyntheticLambda8) objOnNavigationEvent;
        int i3 = writeTypedList + 17;
        access200 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 60 / 0;
        }
        return maxFullscreenAdImplExternalSyntheticLambda82;
    }

    private final void IAuthTabCallback(AppCompatActivity appCompatActivity, final n0c.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        int i = 2 % 2;
        int i2 = access200 + 67;
        writeTypedList = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Pair<String, String> pairIAuthTabCallback = getWrite.IAuthTabCallback("shared_bundle_name", onextracallbackwithresult.onExtraCallbackWithResult().onExtraCallbackWithResult());
            String strIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (strIAuthTabCallback == null) {
                int i3 = writeTypedList + 61;
                access200 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 4 % 2;
                }
                strIAuthTabCallback = "";
            }
            onNavigationEvent("setup_internal_granite_host_start", pairIAuthTabCallback, getWrite.IAuthTabCallback("deployment_id", strIAuthTabCallback));
            String strITrustedWebActivityCallbackDefault = ITrustedWebActivityCallbackDefault();
            Bundle bundleOnNavigationEvent = r8lambda3VLBDMfcFBq3y6wAYf87R7p92xc.onExtraCallbackWithResult.onNavigationEvent(appCompatActivity, IPostMessageServiceDefault(), IPostMessageService().removeOnMultiWindowModeChangedListener().onWarmupCompleted());
            Object[] objArr = new Object[1];
            a(new char[]{27221, 37254, 40392, 39178, 34119, 32908}, 64450 - ExpandableListView.getPackedPositionChild(0L), objArr);
            bundleOnNavigationEvent.putString(((String) objArr[0]).intern(), strITrustedWebActivityCallbackDefault);
            bundleOnNavigationEvent.putStringArrayList("preloadedRemoteNames", CollectionsKt.arrayListOf(new String[]{"shopping"}));
            onExtraCallback(new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda20
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = onWarmupCompleted + 115;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    n0c.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
                    MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8 = (MaxFullscreenAdImplExternalSyntheticLambda8) obj2;
                    if (i7 == 0) {
                        return TossReactNativeFragment.onNavigationEvent(onextracallbackwithresult2, maxFullscreenAdImplExternalSyntheticLambda8);
                    }
                    TossReactNativeFragment.onNavigationEvent(onextracallbackwithresult2, maxFullscreenAdImplExternalSyntheticLambda8);
                    throw null;
                }
            });
            this.onMessageChannelReady.onWarmupCompleted(onWarmupCompleted((Activity) appCompatActivity));
            onWarmupCompleted(appCompatActivity);
            onWarmupCompleted(appCompatActivity, (Bundle) null, bundleOnNavigationEvent);
            onNavigationEvent("setup_internal_granite_host_done", new Pair[0]);
            return;
        }
        getWrite.IAuthTabCallback("shared_bundle_name", onextracallbackwithresult.onExtraCallbackWithResult().onExtraCallbackWithResult());
        onextracallbackwithresult.IAuthTabCallback();
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(AppCompatActivity appCompatActivity) {
        int i = 2 % 2;
        int i2 = access200 + 65;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        createAdListenerWrapper.IAuthTabCallback(appCompatActivity, onWarmupCompleted((Activity) appCompatActivity).IAuthTabCallbackStubProxy(), "TossReactNativeFragment");
        int i4 = access200 + 69;
        writeTypedList = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final MaxFullscreenAdImplExternalSyntheticLambda9 onWarmupCompleted(Activity activity) {
        int i = 2 % 2;
        int i2 = access200 + 23;
        writeTypedList = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        MaxFullscreenAdImplExternalSyntheticLambda9 maxFullscreenAdImplExternalSyntheticLambda9 = this.setEngagementSignalsCallback;
        if (maxFullscreenAdImplExternalSyntheticLambda9 != null) {
            return maxFullscreenAdImplExternalSyntheticLambda9;
        }
        String strOnWarmupCompleted = RnAppVersion.onExtraCallback.onWarmupCompleted(activity, IPostMessageService().getDefaultViewModelCreationExtras());
        String strOnExtraCallback = IPostMessageService().removeOnUserLeaveHintListener().onExtraCallback();
        String strOnNavigationEvent = IPostMessageService().startActivityForResult().onNavigationEvent();
        String strOnWarmupCompleted2 = IPostMessageService().removeOnMultiWindowModeChangedListener().onWarmupCompleted();
        boolean zITrustedWebActivityServiceStubProxy = IPostMessageService().getDefaultViewModelCreationExtras().ITrustedWebActivityServiceStubProxy();
        String upperCase = IPostMessageServiceDefault().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        MaxFullscreenAdImplExternalSyntheticLambda9 maxFullscreenAdImplExternalSyntheticLambda92 = new MaxFullscreenAdImplExternalSyntheticLambda9(strOnWarmupCompleted, strOnExtraCallback, strOnNavigationEvent, strOnWarmupCompleted2, zITrustedWebActivityServiceStubProxy, upperCase, ITrustedWebActivityCallbackDefault(), onUnminimized());
        this.setEngagementSignalsCallback = maxFullscreenAdImplExternalSyntheticLambda92;
        int i3 = writeTypedList + 97;
        access200 = i3 % 128;
        int i4 = i3 % 2;
        return maxFullscreenAdImplExternalSyntheticLambda92;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x008f, code lost:
    
        r13.ICustomTabsCallback = false;
        r13.extraCallback.onExtraCallbackWithResult(r1);
        r3 = r1.onExtraCallbackWithResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x009a, code lost:
    
        if (r3 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009c, code lost:
    
        onNavigationEvent("pre_start_internal_react_host_context_already_ready", o.getWrite.IAuthTabCallback("react_context_hash", java.lang.String.valueOf(r3.hashCode())));
        onWarmupCompleted(r3, "pre_start_internal_host_context_already_ready");
        IAuthTabCallback(r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00bb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bc, code lost:
    
        r3 = new im.toss.rn.toss.core.TossReactNativeFragment.IAuthTabCallbackStub(r1, r13, r14, r15);
        r13.ICustomTabsService = r3;
        r1.onExtraCallback(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c6, code lost:
    
        r15 = kotlin.Result.Companion;
        onNavigationEvent("pre_start_internal_react_host_host_start", o.getWrite.IAuthTabCallback("react_host_hash", java.lang.String.valueOf(r1.hashCode())));
        r15 = kotlin.Result.constructor-impl(r1.onNavigationEvent());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e7, code lost:
    
        r6 = im.toss.rn.toss.core.TossReactNativeFragment.writeTypedList + 31;
        im.toss.rn.toss.core.TossReactNativeFragment.access200 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f1, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f2, code lost:
    
        r0 = kotlin.Result.Companion;
        r15 = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        r1 = new java.lang.Object[1];
        a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 41540, r1);
        onNavigationEvent("pre_start_internal_react_host_failure", o.getWrite.IAuthTabCallback(((java.lang.String) r1[0]).intern(), "react_host_null"));
        r13.isEngagementSignalsApiAvailable.set(false);
        r3 = new java.lang.Object[]{r13, r14, new java.lang.IllegalStateException("ReactHost is not available for shopping tab RN warm-up")};
        ((java.lang.Boolean) onExtraCallback(im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), r3, 979231155, im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -979231126)).booleanValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(n6 n6Var, n0c.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        ReactHost reactHostOnExtraCallback;
        IAuthTabCallbackStub iAuthTabCallbackStub;
        Object obj;
        int i = 2 % 2;
        int i2 = writeTypedList + 21;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent("pre_start_internal_react_host_start", new Pair[0]);
            reactHostOnExtraCallback = writeTypedObject().onExtraCallback();
        } else {
            onNavigationEvent("pre_start_internal_react_host_start", new Pair[0]);
            reactHostOnExtraCallback = writeTypedObject().onExtraCallback();
        }
        Throwable th = Result.exceptionOrNull-impl(obj);
        if (th != null) {
            reactHostOnExtraCallback.onExtraCallbackWithResult(iAuthTabCallbackStub);
            this.ICustomTabsService = null;
            this.isEngagementSignalsApiAvailable.set(false);
            onNavigationEvent("pre_start_internal_react_host_failure", getWrite.IAuthTabCallback("throwable", th.toString()));
            int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            ((Boolean) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, n6Var, th}, 979231155, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -979231126)).booleanValue();
        }
    }

    private static final ReactHost onActivityLayout(TossReactNativeFragment tossReactNativeFragment) {
        int i = 2 % 2;
        int i2 = access200 + 27;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        ReactHost reactHostOnExtraCallback = tossReactNativeFragment.writeTypedObject().onExtraCallback();
        int i4 = access200 + 57;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return reactHostOnExtraCallback;
    }

    private static final MaxFullscreenAdImplExternalSyntheticLambda8 onTransact(MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = writeTypedList + 57;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
        Object[] objArr = {maxFullscreenAdImplExternalSyntheticLambda8, null, null, null, null, null, null, null, null, null, null, null, null, null, n5.onNavigationEvent(maxFullscreenAdImplExternalSyntheticLambda8.readTypedObject(), n6a.Staying, null, null, true, false, hbExternalSyntheticLambda1.Ready, 6, null), null, null, null, null, null, null, null, false, 4184831, null};
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda82 = (MaxFullscreenAdImplExternalSyntheticLambda8) MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, R.drawable.IAuthTabCallback(), objArr, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1651567374);
        int i4 = writeTypedList + 43;
        access200 = i4 % 128;
        if (i4 % 2 == 0) {
            return maxFullscreenAdImplExternalSyntheticLambda82;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(n6 n6Var, n0c.onExtraCallbackWithResult onextracallbackwithresult) {
        Object obj;
        int i = 2 % 2;
        onNavigationEvent("complete_internal_react_host_warmup_start", new Pair[0]);
        Pair<String, String> pairIAuthTabCallback = getWrite.IAuthTabCallback("shared_bundle_name", n6Var.IAuthTabCallback());
        Pair<String, String> pairIAuthTabCallback2 = getWrite.IAuthTabCallback("service_bundle_name", n6Var.onExtraCallbackWithResult());
        Pair<String, String> pairIAuthTabCallback3 = getWrite.IAuthTabCallback("internal_react_surface_started", String.valueOf(this.newSession.onNavigationEvent()));
        Pair<String, String> pairIAuthTabCallback4 = getWrite.IAuthTabCallback("service_bundle_loaded", String.valueOf(newAuthTabSession().onExtraCallbackWithResult()));
        String strIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
        if (strIAuthTabCallback == null) {
            int i2 = access200 + 25;
            writeTypedList = i2 % 128;
            int i3 = i2 % 2;
            strIAuthTabCallback = "";
        }
        onWarmupCompleted("complete_internal_react_host_warmup", pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback("shared_deployment_id", strIAuthTabCallback), getWrite.IAuthTabCallback("shared_is_from_cache", String.valueOf(((Boolean) n0c.onExtraCallbackWithResult.IAuthTabCallback(-1841722383, new Object[]{onextracallbackwithresult}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1841722383)).booleanValue())));
        try {
            Result.Companion companion = Result.Companion;
            onSessionEnded();
            this.prefetchWithMultipleUrls = new Function0() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda3
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallback + 115;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    TossReactNativeFragment tossReactNativeFragment = this.f$0;
                    if (i6 == 0) {
                        return TossReactNativeFragment.access100(tossReactNativeFragment);
                    }
                    TossReactNativeFragment.access100(tossReactNativeFragment);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            };
            onExtraCallback(new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 73;
                    IAuthTabCallback = i5 % 128;
                    MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8 = (MaxFullscreenAdImplExternalSyntheticLambda8) obj2;
                    if (i5 % 2 == 0) {
                        TossReactNativeFragment.IAuthTabCallback(maxFullscreenAdImplExternalSyntheticLambda8);
                        throw null;
                    }
                    MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8IAuthTabCallback = TossReactNativeFragment.IAuthTabCallback(maxFullscreenAdImplExternalSyntheticLambda8);
                    int i6 = onExtraCallbackWithResult + 17;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return maxFullscreenAdImplExternalSyntheticLambda8IAuthTabCallback;
                }
            });
            AudioAttributesCompatParcelizer();
            onExtraCallbackWithResult(n6Var.onWarmupCompleted().IAuthTabCallback(n6Var.IAuthTabCallback(), n6Var.onExtraCallbackWithResult(), newAuthTabSession(), onextracallbackwithresult));
            n3 n3VarIEngagementSignalsCallback_Parcel = IEngagementSignalsCallback_Parcel();
            if (n3VarIEngagementSignalsCallback_Parcel == null) {
                n3VarIEngagementSignalsCallback_Parcel = n3.Companion.onWarmupCompleted();
            }
            if (n3VarIEngagementSignalsCallback_Parcel.extraCallbackWithResult()) {
                ICustomTabsServiceDefault();
            }
            onNavigationEvent("complete_internal_react_host_warmup_success", new Pair[0]);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            int i4 = access200 + 113;
            writeTypedList = i4 % 128;
            int i5 = i4 % 2;
            onNavigationEvent("complete_internal_react_host_warmup_failure", getWrite.IAuthTabCallback("throwable", th2.toString()));
            int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            ((Boolean) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, n6Var, th2}, 979231155, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -979231126)).booleanValue();
        }
        this.isEngagementSignalsApiAvailable.set(false);
    }

    public final boolean ICustomTabsServiceDefault() throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedList + 31;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent("start_internal_react_surface_for_service_bundle_preload", new Pair[0]);
        boolean zAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        int i4 = writeTypedList + 75;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        return zAudioAttributesImplApi21Parcelizer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r2 = r5.onActivityResized;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if ((!r2) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        r3 = im.toss.rn.toss.core.TossReactNativeFragment.access200 + 91;
        im.toss.rn.toss.core.TossReactNativeFragment.writeTypedList = r3 % 128;
        r3 = r3 % 2;
        r5.onNavigationEvent("start_internal_react_surface_on_embedded_rn_prepare_pending", new kotlin.Pair[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        return java.lang.Boolean.valueOf(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r5.AudioAttributesImplApi21Parcelizer() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r5.AudioAttributesImplApi21Parcelizer() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedList + 3;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            tossReactNativeFragment.onNavigationEvent("start_internal_react_surface_on_embedded_rn_prepare", new Pair[0]);
        } else {
            tossReactNativeFragment.onNavigationEvent("start_internal_react_surface_on_embedded_rn_prepare", new Pair[0]);
        }
    }

    private final boolean AudioAttributesImplApi21Parcelizer() throws Throwable {
        int i = 2 % 2;
        onNavigationEvent("start_internal_react_surface_if_ready_start", new Pair[0]);
        if (!this.updateVisuals) {
            this.onActivityResized = false;
            Object[] objArr = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41539 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
            onNavigationEvent("start_internal_react_surface_if_ready_skip", getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "not_using_internal_host"));
            return true;
        }
        if (this.newSession.onNavigationEvent()) {
            this.onActivityResized = false;
            Object[] objArr2 = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41539 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
            onNavigationEvent("start_internal_react_surface_if_ready_skip", getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), "surface_already_started"));
            return true;
        }
        if (!newAuthTabSession().onNavigationEvent()) {
            Object[] objArr3 = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, MotionEvent.axisFromString("") + 41540, objArr3);
            onNavigationEvent("start_internal_react_surface_if_ready_skip", getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), "react_host_not_started"));
            int i2 = access200 + 123;
            writeTypedList = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!writeTypedObject().IAuthTabCallback()) {
            Object[] objArr4 = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41539 - View.getDefaultSize(0, 0), objArr4);
            onNavigationEvent("start_internal_react_surface_if_ready_skip", getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), "granite_delegate_not_ready"));
            int i4 = access200 + 99;
            writeTypedList = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallbackIAuthTabCallback = getLifecycle().IAuthTabCallback();
        if (onextracallbackIAuthTabCallback == TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.DESTROYED) {
            int i5 = writeTypedList + 9;
            access200 = i5 % 128;
            int i6 = i5 % 2;
            this.onActivityResized = false;
            return false;
        }
        if (onextracallbackIAuthTabCallback.isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED)) {
            Object[] objArr5 = {this, "start_internal_react_surface", new Function0() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda32
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i7 = 2 % 2;
                    int i8 = onNavigationEvent + 9;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    Object[] objArr6 = {this.f$0};
                    if (i9 == 0) {
                        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                        return Boolean.valueOf(((Boolean) TossReactNativeFragment.onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr6, -1847344450, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1847344477)).booleanValue());
                    }
                    int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    Boolean.valueOf(((Boolean) TossReactNativeFragment.onExtraCallback(iOnExtraCallbackWithResult3, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr6, -1847344450, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, 1847344477)).booleanValue());
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }};
            return ((Boolean) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr5, -678580714, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 678580731)).booleanValue();
        }
        int i7 = writeTypedList + 99;
        access200 = i7 % 128;
        if (i7 % 2 != 0) {
            this.onActivityResized = false;
        } else {
            this.onActivityResized = true;
        }
        ITrustedWebActivityService();
        return false;
    }

    private static final MaxFullscreenAdImplExternalSyntheticLambda8 IAuthTabCallbackDefault(MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        Object objOnNavigationEvent;
        int i = 2 % 2;
        int i2 = access200 + 1;
        writeTypedList = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
            objOnNavigationEvent = MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, iIAuthTabCallback, new Object[]{maxFullscreenAdImplExternalSyntheticLambda8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 2097151, null}, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), 1651567374);
        } else {
            Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
            int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
            objOnNavigationEvent = MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, iIAuthTabCallback3, new Object[]{maxFullscreenAdImplExternalSyntheticLambda8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, 2097151, null}, iIAuthTabCallback4, R.drawable.IAuthTabCallback(), 1651567374);
        }
        return (MaxFullscreenAdImplExternalSyntheticLambda8) objOnNavigationEvent;
    }

    private static final boolean mayLaunchUrl(TossReactNativeFragment tossReactNativeFragment) {
        Object obj;
        int i = 2 % 2;
        boolean z = false;
        try {
            Result.Companion companion = Result.Companion;
            tossReactNativeFragment.onSessionEnded();
            tossReactNativeFragment.writeTypedObject().onNavigationEvent();
            tossReactNativeFragment.onActivityResized = false;
            tossReactNativeFragment.onExtraCallback(new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda15
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 49;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8OnNavigationEvent = TossReactNativeFragment.onNavigationEvent((MaxFullscreenAdImplExternalSyntheticLambda8) obj2);
                    if (i4 == 0) {
                        int i5 = 82 / 0;
                    }
                    int i6 = onNavigationEvent + 23;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 0 / 0;
                    }
                    return maxFullscreenAdImplExternalSyntheticLambda8OnNavigationEvent;
                }
            });
            tossReactNativeFragment.AudioAttributesCompatParcelizer();
            obj = Result.constructor-impl(Boolean.TRUE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 == null) {
            tossReactNativeFragment.onNavigationEvent("start_internal_react_surface_if_ready_success", new Pair[0]);
            int i2 = access200 + 75;
            writeTypedList = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            tossReactNativeFragment.onNavigationEvent("start_internal_react_surface_if_ready_failure", getWrite.IAuthTabCallback("throwable", th2.toString()));
        }
        int i4 = access200 + 77;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    private final void write() throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedList + 1;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        if (this.onActivityResized) {
            AudioAttributesImplApi21Parcelizer();
            int i4 = writeTypedList + 95;
            access200 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final void ITrustedWebActivityService() {
        int i = 2 % 2;
        int i2 = writeTypedList + 43;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 21 / 0;
            if (this.ICustomTabsCallbackDefault != null) {
                return;
            }
        } else if (this.ICustomTabsCallbackDefault != null) {
            return;
        }
        TossReactNativeFragment$observeInternalReactSurfaceStartOnResume$observer$1 tossReactNativeFragment$observeInternalReactSurfaceStartOnResume$observer$1 = new TossReactNativeFragment$observeInternalReactSurfaceStartOnResume$observer$1(this);
        this.ICustomTabsCallbackDefault = tossReactNativeFragment$observeInternalReactSurfaceStartOnResume$observer$1;
        getLifecycle().IAuthTabCallback(tossReactNativeFragment$observeInternalReactSurfaceStartOnResume$observer$1);
        int i4 = access200 + 87;
        writeTypedList = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
    }

    private final void AudioAttributesCompatParcelizer() throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedList + 123;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41539 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        String strIntern = ((String) objArr[0]).intern();
        onNavigationEvent("resume_internal_react_host_if_needed_start", new Pair[0]);
        if (!this.updateVisuals) {
            int i4 = access200 + 87;
            writeTypedList = i4 % 128;
            if (i4 % 2 != 0) {
                onNavigationEvent("resume_internal_react_host_if_needed_skip", getWrite.IAuthTabCallback(strIntern, "not_using_internal_host"));
                return;
            }
            Pair<String, String>[] pairArr = new Pair[0];
            pairArr[0] = getWrite.IAuthTabCallback(strIntern, "not_using_internal_host");
            onNavigationEvent("resume_internal_react_host_if_needed_skip", pairArr);
            return;
        }
        if (this.writeTypedObject) {
            onNavigationEvent("resume_internal_react_host_if_needed_skip", getWrite.IAuthTabCallback(strIntern, "already_resumed"));
            return;
        }
        if (!getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED)) {
            onNavigationEvent("resume_internal_react_host_if_needed_skip", getWrite.IAuthTabCallback(strIntern, "lifecycle_not_resumed"));
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            onNavigationEvent("resume_internal_react_host_if_needed_skip", getWrite.IAuthTabCallback(strIntern, "activity_null"));
            return;
        }
        ReactHost reactHostOnExtraCallback = writeTypedObject().onExtraCallback();
        if (reactHostOnExtraCallback == null) {
            onNavigationEvent("resume_internal_react_host_if_needed_skip", getWrite.IAuthTabCallback(strIntern, "react_host_null"));
            return;
        }
        onNavigationEvent("resume_internal_react_host_if_needed_call", getWrite.IAuthTabCallback("react_host_hash", String.valueOf(reactHostOnExtraCallback.hashCode())));
        reactHostOnExtraCallback.onExtraCallbackWithResult(activity, this);
        this.writeTypedObject = true;
        onNavigationEvent("resume_internal_react_host_if_needed_done", new Pair[0]);
    }

    private final void read() {
        int i = 2 % 2;
        int i2 = writeTypedList;
        int i3 = i2 + 87;
        access200 = i3 % 128;
        int i4 = i3 % 2;
        if (!(!this.updateVisuals)) {
            int i5 = i2 + 99;
            access200 = i5 % 128;
            int i6 = i5 % 2;
            if (!this.writeTypedObject) {
                FrameLayout frameLayout = this.newAuthTabSession;
                if (frameLayout != null) {
                    frameLayout.post(new Runnable() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda44
                        private static int onNavigationEvent = 0;
                        private static int onWarmupCompleted = 1;

                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            int i7 = 2 % 2;
                            int i8 = onNavigationEvent + 99;
                            onWarmupCompleted = i8 % 128;
                            int i9 = i8 % 2;
                            TossReactNativeFragment.access000(this.f$0);
                            int i10 = onNavigationEvent + 119;
                            onWarmupCompleted = i10 % 128;
                            if (i10 % 2 != 0) {
                                return;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    });
                    return;
                }
                return;
            }
        }
        onNavigationEvent("resume_internal_react_host_after_fragment_resumed_skip", new Pair[0]);
    }

    private static final void ICustomTabsCallbackStub(TossReactNativeFragment tossReactNativeFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = access200 + 39;
        writeTypedList = i2 % 128;
        if (i2 % 2 == 0) {
            tossReactNativeFragment.onNavigationEvent("resume_internal_react_host_after_fragment_resumed_posted", new Pair[1]);
        } else {
            tossReactNativeFragment.onNavigationEvent("resume_internal_react_host_after_fragment_resumed_posted", new Pair[0]);
        }
        tossReactNativeFragment.AudioAttributesCompatParcelizer();
    }

    private final void cancelNotification() throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedList + 39;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent("pause_internal_react_host_if_needed_start", new Pair[0]);
        if (this.updateVisuals) {
            if (!this.writeTypedObject) {
                Object[] objArr = new Object[1];
                a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, View.getDefaultSize(0, 0) + 41539, objArr);
                onNavigationEvent("pause_internal_react_host_if_needed_skip", getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "not_resumed"));
                return;
            }
            FragmentActivity activity = getActivity();
            if (activity == null) {
                Object[] objArr2 = new Object[1];
                a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41539 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
                onNavigationEvent("pause_internal_react_host_if_needed_skip", getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), "activity_null"));
                return;
            }
            ReactHost reactHostOnExtraCallback = writeTypedObject().onExtraCallback();
            if (reactHostOnExtraCallback == null) {
                Object[] objArr3 = new Object[1];
                a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 41539, objArr3);
                onNavigationEvent("pause_internal_react_host_if_needed_skip", getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), "react_host_null"));
            }
            if (reactHostOnExtraCallback != null) {
                reactHostOnExtraCallback.onExtraCallback(activity);
            }
            this.writeTypedObject = false;
            onNavigationEvent("pause_internal_react_host_if_needed_done", new Pair[0]);
            return;
        }
        int i4 = access200 + 93;
        writeTypedList = i4 % 128;
        if (i4 % 2 != 0) {
            Object[] objArr4 = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, TextUtils.indexOf("", "", 0) + 41539, objArr4);
            onNavigationEvent("pause_internal_react_host_if_needed_skip", getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), "not_using_internal_host"));
        } else {
            Object[] objArr5 = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41539 << TextUtils.indexOf("", "", 1), objArr5);
            Pair<String, String>[] pairArr = new Pair[0];
            pairArr[0] = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), "not_using_internal_host");
            onNavigationEvent("pause_internal_react_host_if_needed_skip", pairArr);
        }
    }

    private static final Unit onExtraCallback(TossReactNativeFragment tossReactNativeFragment, AppCompatActivity appCompatActivity) {
        transExportCert transexportcertWriteTypedObject;
        int i = 2 % 2;
        int i2 = writeTypedList + 29;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            tossReactNativeFragment.onNavigationEvent("destroy_internal_granite_react_host_delegate_on_destroy", new Pair[0]);
            transexportcertWriteTypedObject = tossReactNativeFragment.writeTypedObject();
        } else {
            tossReactNativeFragment.onNavigationEvent("destroy_internal_granite_react_host_delegate_on_destroy", new Pair[0]);
            transexportcertWriteTypedObject = tossReactNativeFragment.writeTypedObject();
        }
        transexportcertWriteTypedObject.IAuthTabCallback(appCompatActivity);
        return Unit.INSTANCE;
    }

    private final void IEngagementSignalsCallbackDefault() throws Throwable {
        final AppCompatActivity appCompatActivity;
        int i = 2 % 2;
        int i2 = writeTypedList + 31;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent("destroy_internal_granite_react_host_start", new Pair[0]);
        this.extraCallback.onWarmupCompleted();
        this.extraCallback.onNavigationEvent();
        writeTypedObject().onWarmupCompleted();
        if (!this.getInterfaceDescriptor) {
            Object[] objArr = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, View.combineMeasuredStates(0, 0) + 41539, objArr);
            onNavigationEvent("destroy_internal_granite_react_host_skip", getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "internal_host_not_created"));
            this.validateRelationship.IAuthTabCallback(Unit.INSTANCE);
            return;
        }
        cancelNotification();
        ReactInstanceEventListener reactInstanceEventListener = this.ICustomTabsService;
        Object obj = null;
        if (reactInstanceEventListener != null) {
            ReactHost reactHostOnExtraCallback = writeTypedObject().onExtraCallback();
            if (reactHostOnExtraCallback != null) {
                int i4 = writeTypedList + 39;
                access200 = i4 % 128;
                int i5 = i4 % 2;
                reactHostOnExtraCallback.onExtraCallbackWithResult(reactInstanceEventListener);
            }
            this.ICustomTabsService = null;
        }
        DefaultLifecycleObserver defaultLifecycleObserver = this.ICustomTabsCallbackDefault;
        if (defaultLifecycleObserver != null) {
            int i6 = writeTypedList + 73;
            access200 = i6 % 128;
            if (i6 % 2 != 0) {
                getLifecycle().onExtraCallbackWithResult(defaultLifecycleObserver);
                this.ICustomTabsCallbackDefault = null;
                obj.hashCode();
                throw null;
            }
            getLifecycle().onExtraCallbackWithResult(defaultLifecycleObserver);
            this.ICustomTabsCallbackDefault = null;
        }
        TossModule tossModule = this.warmup;
        if (tossModule != null) {
            int i7 = writeTypedList + 41;
            access200 = i7 % 128;
            int i8 = i7 % 2;
            tossModule.readTypedObject();
            getLifecycle().onExtraCallbackWithResult(tossModule);
            TossModule.onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1769724583, new Object[]{tossModule}, -1769724580, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        }
        GraniteBrownfieldModule graniteBrownfieldModule = this.asInterface;
        if (graniteBrownfieldModule != null) {
            TextFieldKeyInputExternalSyntheticLambda9 lifecycle = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "");
            lifecycle.onExtraCallbackWithResult(graniteBrownfieldModule);
        }
        TossReactLifecycleEventEmitter tossReactLifecycleEventEmitter = this.extraCallbackWithResult;
        if (tossReactLifecycleEventEmitter != null) {
            TextFieldKeyInputExternalSyntheticLambda9 lifecycle2 = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle2, "");
            lifecycle2.onExtraCallbackWithResult(tossReactLifecycleEventEmitter);
        }
        this.extraCallbackWithResult = null;
        this.requestPostMessageChannel = null;
        this.warmup = null;
        this.asInterface = null;
        this.onMessageChannelReady.onExtraCallback();
        AppCompatActivity activity = getActivity();
        if (activity instanceof AppCompatActivity) {
            appCompatActivity = activity;
            int i9 = access200 + 53;
            writeTypedList = i9 % 128;
            int i10 = i9 % 2;
        } else {
            appCompatActivity = null;
        }
        if (appCompatActivity != null && r8lambdamcqktAFDi57MiJ6JrSi643BXOs.onNavigationEvent.onWarmupCompleted(writeTypedObject().onExtraCallback(), appCompatActivity, this.newSession.onNavigationEvent(), new Function0() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda40
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i11 = 2 % 2;
                int i12 = onWarmupCompleted + 35;
                IAuthTabCallback = i12 % 128;
                if (i12 % 2 != 0) {
                    TossReactNativeFragment.onWarmupCompleted(this.f$0, appCompatActivity);
                    throw null;
                }
                Unit unitOnWarmupCompleted = TossReactNativeFragment.onWarmupCompleted(this.f$0, appCompatActivity);
                int i13 = onWarmupCompleted + 15;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                return unitOnWarmupCompleted;
            }
        })) {
            onNavigationEvent("destroy_internal_granite_react_host_expected_teardown", new Pair[0]);
        }
        this.onActivityResized = false;
        this.access100 = null;
        this.getInterfaceDescriptor = false;
        this.isEngagementSignalsApiAvailable.set(false);
        this.validateRelationship.IAuthTabCallback(Unit.INSTANCE);
        onNavigationEvent("destroy_internal_granite_react_host_done", new Pair[0]);
    }

    private final void ITrustedWebActivityCallbackStubProxy() throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedList + 113;
        access200 = i2 % 128;
        String strValueOf = null;
        if (i2 % 2 != 0) {
            isAdded();
            strValueOf.hashCode();
            throw null;
        }
        if (!isAdded() || getLifecycle().IAuthTabCallback() == TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.DESTROYED) {
            Object[] objArr = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, (ViewConfiguration.getScrollBarSize() >> 8) + 41539, objArr);
            onNavigationEvent("internal_granite_host_unexpected_destroy_skip", getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "fragment_not_active"));
            int i3 = writeTypedList + 5;
            access200 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i4 = writeTypedList + 7;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        boolean zOnNavigationEvent = this.newSession.onNavigationEvent();
        onNavigationEvent("internal_granite_host_unexpected_destroy", getWrite.IAuthTabCallback("surface_started", String.valueOf(zOnNavigationEvent)));
        this.isEngagementSignalsApiAvailable.set(false);
        this.ICustomTabsCallback = true;
        if (!zOnNavigationEvent) {
            onNavigationEvent("internal_granite_host_unexpected_destroy_benign_fast_exit", new Pair[0]);
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            int iHashCode = hashCode();
            ReactHost reactHostOnExtraCallback = writeTypedObject().onExtraCallback();
            if (reactHostOnExtraCallback != null) {
                int i6 = access200 + 81;
                writeTypedList = i6 % 128;
                if (i6 % 2 == 0) {
                    String.valueOf(reactHostOnExtraCallback.hashCode());
                    strValueOf.hashCode();
                    throw null;
                }
                strValueOf = String.valueOf(reactHostOnExtraCallback.hashCode());
            }
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, "ReactHostPreSurfaceDestroy", "shopping tab internal react host destroyed before surface start", MaxFullscreenAdImpla.IAuthTabCallback(String.valueOf(iHashCode), strValueOf, newAuthTabSession().onNavigationEvent(), this.getInterfaceDescriptor), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Shopping tab RN ReactHost was destroyed unexpectedly (fatal JS exception suspected)");
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("ReactHostUnexpectedDestroy", "shopping tab internal react host destroyed unexpectedly", illegalStateException, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "TossReactNativeFragment"), getWrite.IAuthTabCallback("fragment_hash", String.valueOf(hashCode()))}));
        Function1<? super Throwable, Boolean> function1 = this.IAuthTabCallbackStub;
        if (function1 != null) {
            int i7 = writeTypedList + 39;
            access200 = i7 % 128;
            if (i7 % 2 == 0 ? ((Boolean) function1.invoke(illegalStateException)).booleanValue() : ((Boolean) function1.invoke(illegalStateException)).booleanValue()) {
                int i8 = access200 + 49;
                writeTypedList = i8 % 128;
                int i9 = i8 % 2;
                onNavigationEvent("internal_granite_host_unexpected_destroy_handled_by_host", new Pair[0]);
                return;
            }
        }
        FrameLayout frameLayout = this.newAuthTabSession;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            frameLayout.addView(onWarmupCompleted(illegalStateException), new FrameLayout.LayoutParams(-1, -1));
        }
        int i10 = writeTypedList + 21;
        access200 = i10 % 128;
        int i11 = i10 % 2;
    }

    private final View onWarmupCompleted(final Throwable th) {
        int i = 2 % 2;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        TossReactErrorView tossReactErrorView = new TossReactErrorView(contextRequireContext, th);
        tossReactErrorView.setOnRetry(new Function0() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda38
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 57;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    TossReactNativeFragment.onExtraCallbackWithResult(this.f$0, th);
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = TossReactNativeFragment.onExtraCallbackWithResult(this.f$0, th);
                int i4 = onExtraCallbackWithResult + 113;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallbackWithResult;
            }
        });
        int i2 = writeTypedList + 67;
        access200 = i2 % 128;
        if (i2 % 2 == 0) {
            return tossReactErrorView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(TossReactNativeFragment tossReactNativeFragment, Throwable th) throws Throwable {
        boolean z;
        int i = 2 % 2;
        int i2 = access200 + 41;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        tossReactNativeFragment.onNavigationEvent("internal_granite_error_view_retry", getWrite.IAuthTabCallback("error", th.toString()));
        Function1<? super Throwable, Boolean> function1 = tossReactNativeFragment.IAuthTabCallbackStub;
        if (function1 == null || !((Boolean) function1.invoke(th)).booleanValue()) {
            z = false;
        } else {
            int i4 = writeTypedList + 115;
            access200 = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        }
        Object[] objArr = new Object[1];
        a(new char[]{27214, 16910, 15066, 4761, 52078, 41774, 39924}, View.MeasureSpec.getMode(0) + 10313, objArr);
        tossReactNativeFragment.onNavigationEvent("internal_granite_error_view_retry_result", getWrite.IAuthTabCallback(((String) objArr[0]).intern(), String.valueOf(z)));
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object newSessionWithExtras(Object[] objArr) {
        int i = 2 % 2;
        r8lambda4EHrnZ9SU_UFWvZy_trwQUIGDEE r8lambda4ehrnz9su_ufwvzy_trwquigdee = new r8lambda4EHrnZ9SU_UFWvZy_trwQUIGDEE();
        int i2 = access200 + 55;
        writeTypedList = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 13 / 0;
        }
        return r8lambda4ehrnz9su_ufwvzy_trwquigdee;
    }

    private static final getSignForPKCS7NoContents RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        TossExoPlayerProvider tossExoPlayerProvider = new TossExoPlayerProvider();
        int i2 = writeTypedList + 33;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        return tossExoPlayerProvider;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) {
        Context context = (Context) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        d1aa d1aaVar = new d1aa(context);
        int i2 = access200 + 79;
        writeTypedList = i2 % 128;
        if (i2 % 2 != 0) {
            return d1aaVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void notifyNotificationWithChannel() {
        int i = 2 % 2;
        int i2 = access200 + 17;
        writeTypedList = i2 % 128;
        if (i2 % 2 != 0) {
            CertToolkitMgrRevokeReason certToolkitMgrRevokeReason = CertToolkitMgrRevokeReason.onExtraCallback;
            if (certToolkitMgrRevokeReason.IAuthTabCallback() == null) {
                certToolkitMgrRevokeReason.onExtraCallbackWithResult(new d1a(requireContext().getApplicationContext()));
            }
            isValidCertNum isvalidcertnum = isValidCertNum.onExtraCallbackWithResult;
            if (!isvalidcertnum.onExtraCallback().contains("toss")) {
                isvalidcertnum.onExtraCallback("toss", new Function0() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke() {
                        int i3 = 2 % 2;
                        int i4 = onExtraCallback + 35;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        transV2ExportCert transv2exportcertAccess000 = TossReactNativeFragment.access000();
                        if (i5 == 0) {
                            int i6 = 94 / 0;
                        }
                        return transv2exportcertAccess000;
                    }
                });
                isvalidcertnum.onExtraCallback("toss");
            }
            getSignForPKCS7AppCertAndVIDR getsignforpkcs7appcertandvidr = getSignForPKCS7AppCertAndVIDR.onExtraCallbackWithResult;
            if (!getsignforpkcs7appcertandvidr.onExtraCallbackWithResult().contains("toss-exoplayer")) {
                getsignforpkcs7appcertandvidr.IAuthTabCallback("toss-exoplayer", new Function0() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke() {
                        int i3 = 2 % 2;
                        int i4 = onExtraCallback + 115;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                        getSignForPKCS7NoContents getsignforpkcs7nocontents = (getSignForPKCS7NoContents) TossReactNativeFragment.onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[0], 1300838458, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -1300838449);
                        int i6 = onExtraCallback + 119;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        return getsignforpkcs7nocontents;
                    }
                });
                getsignforpkcs7appcertandvidr.onNavigationEvent("toss-exoplayer");
                int i3 = access200 + 69;
                writeTypedList = i3 % 128;
                int i4 = i3 % 2;
            }
            decryptForPrivateKey decryptforprivatekey = decryptForPrivateKey.onNavigationEvent;
            if (!decryptforprivatekey.IAuthTabCallback()) {
                decryptforprivatekey.onExtraCallbackWithResult(new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda2
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i5 = 2 % 2;
                        int i6 = onExtraCallbackWithResult + 93;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                        readFileToByteArray readfiletobytearray = (readFileToByteArray) TossReactNativeFragment.onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{(Context) obj}, -2030707354, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 2030707385);
                        int i8 = onExtraCallbackWithResult + 1;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        return readfiletobytearray;
                    }
                });
            }
            setShadowDrawableRight setshadowdrawableright = setShadowDrawableRight.onExtraCallbackWithResult;
            if (setshadowdrawableright.onWarmupCompleted() == null) {
                int i5 = access200 + 97;
                writeTypedList = i5 % 128;
                int i6 = i5 % 2;
                setshadowdrawableright.onExtraCallback(TossAppServiceWebViewProvider.Companion.onNavigationEvent());
                int i7 = writeTypedList + 95;
                access200 = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
            return;
        }
        CertToolkitMgrRevokeReason.onExtraCallback.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsService(Object[] objArr) {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        int i = 2 % 2;
        ArrayList arrayListOnExtraCallbackWithResult = new com.facebook.react.onExtraCallback(tossReactNativeFragment.requireActivity().getApplication()).onExtraCallbackWithResult();
        arrayListOnExtraCallbackWithResult.add(0, new d0a(tossReactNativeFragment.onMessageChannelReady));
        arrayListOnExtraCallbackWithResult.add(new setPanelSlideListener());
        Intrinsics.checkNotNullExpressionValue(arrayListOnExtraCallbackWithResult, "");
        int i2 = access200 + 81;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        return arrayListOnExtraCallbackWithResult;
    }

    static final /* synthetic */ class getInterfaceDescriptor extends FunctionReferenceImpl implements Function0<String> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        getInterfaceDescriptor(Object obj) {
            super(0, obj, TossReactNativeFragment.class, "resolveGraniteBrownfieldModuleSchemeUri", "resolveGraniteBrownfieldModuleSchemeUri()Ljava/lang/String;", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallback();
            }
            onExtraCallback();
            throw null;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) ((CallableReference) this).receiver;
            if (i3 == 0) {
                return TossReactNativeFragment.writeTypedObject(tossReactNativeFragment);
            }
            TossReactNativeFragment.writeTypedObject(tossReactNativeFragment);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static final /* synthetic */ class writeTypedObject extends FunctionReferenceImpl implements Function0<Boolean> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        writeTypedObject(Object obj) {
            super(0, obj, TossReactNativeFragment.class, "handleReactCloseView", "handleReactCloseView()Z", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return boolOnExtraCallbackWithResult;
        }

        public final Boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolValueOf = Boolean.valueOf(TossReactNativeFragment.extraCallbackWithResult((TossReactNativeFragment) ((CallableReference) this).receiver));
            int i4 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 38 / 0;
            }
            return boolValueOf;
        }
    }

    static final /* synthetic */ class extraCallbackWithResult extends FunctionReferenceImpl implements Function0<Boolean> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        extraCallbackWithResult(Object obj) {
            super(0, obj, TossReactNativeFragment.class, "handleReactCloseView", "handleReactCloseView()Z", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolOnExtraCallback = onExtraCallback();
            int i4 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return boolOnExtraCallback;
        }

        public final Boolean onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolValueOf = Boolean.valueOf(TossReactNativeFragment.extraCallbackWithResult((TossReactNativeFragment) ((CallableReference) this).receiver));
            int i4 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return boolValueOf;
        }
    }

    private static final Unit onExtraCallback(onExtraCallback onextracallback, getAdValue getadvalue) {
        int i = 2 % 2;
        int i2 = access200 + 17;
        writeTypedList = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onextracallback.IAuthTabCallback().onExtraCallback(getadvalue.onExtraCallbackWithResult(), getadvalue.onExtraCallback());
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        onextracallback.IAuthTabCallback().onExtraCallback(getadvalue.onExtraCallbackWithResult(), getadvalue.onExtraCallback());
        Unit unit2 = Unit.INSTANCE;
        int i3 = writeTypedList + 31;
        access200 = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onUnminimized(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedList + 21;
        access200 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(th, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(onExtraCallback onextracallback, String str) {
        int i = 2 % 2;
        int i2 = access200 + 101;
        writeTypedList = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onextracallback.IAuthTabCallback().onWarmupCompleted(str);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(str, "");
        onextracallback.IAuthTabCallback().onWarmupCompleted(str);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(ReactContext reactContext, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedList + 99;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = reactContext.hashCode();
        onNavigationEvent("setup_react_context_if_needed_start", getWrite.IAuthTabCallback("trigger", str), getWrite.IAuthTabCallback("target_react_context_hash", String.valueOf(iHashCode)));
        Integer num = this.access100;
        Object obj = null;
        if (num != null && num.intValue() == iHashCode) {
            int i4 = access200 + 79;
            writeTypedList = i4 % 128;
            if (i4 % 2 == 0) {
                ICustomTabsServiceStubProxy();
                obj.hashCode();
                throw null;
            }
            if (ICustomTabsServiceStubProxy()) {
                Object[] objArr = new Object[1];
                a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, Color.green(0) + 41539, objArr);
                onNavigationEvent("setup_react_context_if_needed_skip", getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "already_initialized"));
                return;
            }
        }
        WeakReference<TossReactWebViewContentOwner> weakReference = this.IAuthTabCallback;
        if (weakReference == null) {
            weakReference = new WeakReference<>(this);
            this.IAuthTabCallback = weakReference;
            int i5 = writeTypedList + 21;
            access200 = i5 % 128;
            int i6 = i5 % 2;
        }
        WeakReference<TossReactWebViewContentOwner> weakReference2 = weakReference;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        calculateMaxTextSize calculatemaxtextsizeRemoveOnTrimMemoryListener = IPostMessageService().removeOnTrimMemoryListener();
        MaxFullscreenAdImplExternalSyntheticLambda9 maxFullscreenAdImplExternalSyntheticLambda9OnWarmupCompleted = onWarmupCompleted((Activity) fragmentActivityRequireActivity);
        final onExtraCallback onextracallback = new onExtraCallback(new IAuthTabCallback(reactContext, new WeakReference(this)), new GraniteBrownfieldModule(reactContext, new WeakReference(fragmentActivityRequireActivity), weakReference2, ITrustedWebActivityCallbackDefault(), new getInterfaceDescriptor(this), false, new writeTypedObject(this)), new TossModule(reactContext, calculatemaxtextsizeRemoveOnTrimMemoryListener, weakReference2, maxFullscreenAdImplExternalSyntheticLambda9OnWarmupCompleted.IAuthTabCallbackStub(), maxFullscreenAdImplExternalSyntheticLambda9OnWarmupCompleted.onTransact(), maxFullscreenAdImplExternalSyntheticLambda9OnWarmupCompleted.IAuthTabCallback(), maxFullscreenAdImplExternalSyntheticLambda9OnWarmupCompleted.onExtraCallback(), maxFullscreenAdImplExternalSyntheticLambda9OnWarmupCompleted.onWarmupCompleted(), maxFullscreenAdImplExternalSyntheticLambda9OnWarmupCompleted.onExtraCallbackWithResult(), maxFullscreenAdImplExternalSyntheticLambda9OnWarmupCompleted.IAuthTabCallback_Parcel(), maxFullscreenAdImplExternalSyntheticLambda9OnWarmupCompleted.asInterface(), new extraCallbackWithResult(this)), new transImportCert(reactContext));
        onWarmupCompleted(onextracallback);
        this.access100 = Integer.valueOf(iHashCode);
        getLifecycle().IAuthTabCallback(onextracallback.onWarmupCompleted());
        getLifecycle().IAuthTabCallback(onextracallback.IAuthTabCallback());
        onextracallback.IAuthTabCallback().onActivityLayout();
        onextracallback.onWarmupCompleted().onExtraCallbackWithResult();
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback = getIconPaddingLeft.IAuthTabCallback.onWarmupCompleted().onExtraCallback(getAdValue.class);
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnExtraCallback, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = jsonReaderUnknownNumberParsingOnExtraCallback.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        this.onNavigationEvent.onNavigationEvent(setMessageBytes.onNavigationEvent(jsonReaderUnknownNumberParsingOnWarmupCompleted, new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj2) {
                int i7 = 2 % 2;
                int i8 = onWarmupCompleted + 39;
                IAuthTabCallback = i8 % 128;
                Object[] objArr2 = {(Throwable) obj2};
                if (i8 % 2 != 0) {
                    int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    return (Unit) TossReactNativeFragment.onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr2, -1095899176, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1095899201);
                }
                int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        }, (Function0) null, new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda9
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj2) {
                int i7 = 2 % 2;
                int i8 = onWarmupCompleted + 123;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                Unit unitOnExtraCallbackWithResult = TossReactNativeFragment.onExtraCallbackWithResult(onextracallback, (getAdValue) obj2);
                int i10 = onWarmupCompleted + 123;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, 2, (Object) null));
        TossReactLifecycleEventEmitter tossReactLifecycleEventEmitter = new TossReactLifecycleEventEmitter(new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj2) {
                int i7 = 2 % 2;
                int i8 = onExtraCallbackWithResult + 119;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                Unit unitOnWarmupCompleted = TossReactNativeFragment.onWarmupCompleted(onextracallback, (String) obj2);
                int i10 = IAuthTabCallback + 123;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 == 0) {
                    return unitOnWarmupCompleted;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        this.extraCallbackWithResult = tossReactLifecycleEventEmitter;
        TossReactLifecycleEventEmitter.Companion.onExtraCallback(this, tossReactLifecycleEventEmitter);
        onNavigationEvent("setup_react_context_if_needed_done", getWrite.IAuthTabCallback("trigger", str), getWrite.IAuthTabCallback("target_react_context_hash", String.valueOf(iHashCode)));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[PHI: r1
      0x0025: PHI (r1v6 im.toss.rn.toss.core.TossModule) = (r1v5 im.toss.rn.toss.core.TossModule), (r1v15 im.toss.rn.toss.core.TossModule) binds: [B:8:0x0023, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(onExtraCallback onextracallback) {
        TossModule tossModule;
        int i = 2 % 2;
        int i2 = access200 + 27;
        writeTypedList = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent("replace_registered_brick_modules_start", new Pair[1]);
            tossModule = this.warmup;
            if (tossModule != null) {
                getLifecycle().onExtraCallbackWithResult(tossModule);
                TossModule.onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1769724583, new Object[]{tossModule}, -1769724580, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
            }
        } else {
            onNavigationEvent("replace_registered_brick_modules_start", new Pair[0]);
            tossModule = this.warmup;
            if (tossModule != null) {
            }
        }
        GraniteBrownfieldModule graniteBrownfieldModule = this.asInterface;
        if (graniteBrownfieldModule != null) {
            TextFieldKeyInputExternalSyntheticLambda9 lifecycle = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "");
            lifecycle.onExtraCallbackWithResult(graniteBrownfieldModule);
        }
        TossReactLifecycleEventEmitter tossReactLifecycleEventEmitter = this.extraCallbackWithResult;
        if (tossReactLifecycleEventEmitter != null) {
            TextFieldKeyInputExternalSyntheticLambda9 lifecycle2 = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle2, "");
            lifecycle2.onExtraCallbackWithResult(tossReactLifecycleEventEmitter);
        }
        this.extraCallbackWithResult = null;
        this.onNavigationEvent.onExtraCallbackWithResult();
        List<getTitleResource> listOnExtraCallback = onextracallback.onExtraCallback();
        ResourceResolutionException resourceResolutionException = this.onMessageChannelReady;
        Iterator<T> it = listOnExtraCallback.iterator();
        while (it.hasNext()) {
            resourceResolutionException.onWarmupCompleted((getTitleResource) it.next());
            int i3 = writeTypedList + 95;
            access200 = i3 % 128;
            int i4 = i3 % 2;
        }
        this.requestPostMessageChannel = onextracallback;
        this.warmup = onextracallback.IAuthTabCallback();
        this.asInterface = onextracallback.onWarmupCompleted();
        IEngagementSignalsCallbackStub();
        onNavigationEvent("replace_registered_brick_modules_done", new Pair[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[PHI: r1
      0x0029: PHI (r1v11 com.facebook.react.bridge.ReactContext) = (r1v10 com.facebook.react.bridge.ReactContext), (r1v14 com.facebook.react.bridge.ReactContext) binds: [B:10:0x0027, B:7:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onSessionEnded() {
        Integer numValueOf;
        ReactContext reactContextOnExtraCallbackWithResult;
        int i = 2 % 2;
        ReactHost reactHostOnExtraCallback = writeTypedObject().onExtraCallback();
        if (reactHostOnExtraCallback != null) {
            int i2 = access200 + 9;
            writeTypedList = i2 % 128;
            if (i2 % 2 == 0) {
                reactContextOnExtraCallbackWithResult = reactHostOnExtraCallback.onExtraCallbackWithResult();
                int i3 = 73 / 0;
                numValueOf = reactContextOnExtraCallbackWithResult != null ? Integer.valueOf(reactContextOnExtraCallbackWithResult.hashCode()) : null;
            } else {
                reactContextOnExtraCallbackWithResult = reactHostOnExtraCallback.onExtraCallbackWithResult();
                if (reactContextOnExtraCallbackWithResult != null) {
                }
            }
        }
        if (numValueOf != null) {
            Integer num = this.access100;
            int iIntValue = numValueOf.intValue();
            if (num == null || num.intValue() != iIntValue) {
                throw new IllegalStateException("Shopping tab RN BrickModules are not registered for the current ReactContext before surface start");
            }
        }
        IEngagementSignalsCallbackStub();
        int i4 = writeTypedList + 19;
        access200 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        List<String> list = onExtraCallbackWithResult;
        Set set = CollectionsKt.toSet(this.onMessageChannelReady.onWarmupCompleted());
        ArrayList arrayList = new ArrayList();
        int i2 = writeTypedList + 67;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        for (Object obj : list) {
            int i4 = access200 + 73;
            writeTypedList = i4 % 128;
            int i5 = i4 % 2;
            if (!set.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        throw new IllegalStateException("Shopping tab RN BrickModules are not registered before surface start: " + CollectionsKt.joinToString$default(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
    }

    private final boolean ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        Set set = CollectionsKt.toSet(this.onMessageChannelReady.onWarmupCompleted());
        List<String> list = onExtraCallbackWithResult;
        if (list instanceof Collection) {
            int i2 = access200 + 79;
            writeTypedList = i2 % 128;
            int i3 = i2 % 2;
            if (list.isEmpty()) {
                int i4 = access200 + 89;
                writeTypedList = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((String) it.next())) {
                int i6 = access200 + 63;
                writeTypedList = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
        }
        return true;
    }

    private final void onNavigationEvent(n0c.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        String str;
        long jLongValue;
        int i = 2 % 2;
        String strIPostMessageServiceDefault = IPostMessageServiceDefault();
        hExternalSyntheticLambda4.onExtraCallback onextracallback = hExternalSyntheticLambda4.Companion;
        String lowerCase = strIPostMessageServiceDefault.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        Object[] objArr = new Object[1];
        a(new char[]{27205, 49062, 49546, 60302}, 54767 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
        String baseUrl = onextracallback.IAuthTabCallback(lowerCase, ((String) objArr[0]).intern()).getBaseUrl();
        String strOnWarmupCompleted = IPostMessageService().removeOnMultiWindowModeChangedListener().onWarmupCompleted();
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos.onWarmupCompleted onwarmupcompleted = r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos.Companion;
        String str2 = (String) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -762434377, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 762434409);
        long jLongValue2 = 0;
        Object[] objArr2 = new Object[1];
        a(new char[]{27205, 49062, 49546, 60302}, 54768 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
        final r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnExtraCallback = onwarmupcompleted.onExtraCallback(str2, baseUrl, ((String) objArr2[0]).intern(), strOnWarmupCompleted);
        String strOnUnminimized = onUnminimized();
        Object[] objArr3 = new Object[1];
        a(new char[]{27205, 49062, 49546, 60302}, 54767 - (Process.myTid() >> 22), objArr3);
        final r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnExtraCallback2 = onwarmupcompleted.onExtraCallback(strOnUnminimized, baseUrl, ((String) objArr3[0]).intern(), strOnWarmupCompleted);
        String strOnWarmupCompleted2 = onextracallbackwithresult.onWarmupCompleted();
        if (strOnWarmupCompleted2 == null) {
            return;
        }
        String strOnWarmupCompleted3 = onextracallbackwithresult.onExtraCallbackWithResult().onWarmupCompleted();
        String strAsBinder = onextracallbackwithresult.asBinder();
        String strIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
        String str3 = strIAuthTabCallback == null ? "" : strIAuthTabCallback;
        String strOnNavigationEvent = onextracallbackwithresult.onNavigationEvent();
        if (StringsKt.isBlank(strOnNavigationEvent)) {
            int i2 = writeTypedList + 89;
            access200 = i2 % 128;
            int i3 = i2 % 2;
            str = "00000000000000";
        } else {
            str = strOnNavigationEvent;
        }
        String str4 = (String) n0c.onExtraCallbackWithResult.IAuthTabCallback(-13494833, new Object[]{onextracallbackwithresult}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 13494834);
        String str5 = str4 == null ? "00000000000000" : str4;
        Long lIAuthTabCallbackStub = onextracallbackwithresult.IAuthTabCallbackStub();
        if (lIAuthTabCallbackStub != null) {
            jLongValue = lIAuthTabCallbackStub.longValue();
        } else {
            int i4 = access200 + 81;
            writeTypedList = i4 % 128;
            int i5 = i4 % 2;
            jLongValue = 0;
        }
        Long lAccess100 = onextracallbackwithresult.access100();
        if (lAccess100 != null) {
            int i6 = access200 + 103;
            writeTypedList = i6 % 128;
            if (i6 % 2 == 0) {
                lAccess100.longValue();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            jLongValue2 = lAccess100.longValue();
        }
        final MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult2 = new MaxFullscreenAdImpl.onExtraCallbackWithResult(strOnWarmupCompleted3, strOnWarmupCompleted2, new TossReactBundleMeta(strAsBinder, str3, str, str5, jLongValue, jLongValue2, (String) null, 64, (DefaultConstructorMarker) null), ((Boolean) n0c.onExtraCallbackWithResult.IAuthTabCallback(-1841722383, new Object[]{onextracallbackwithresult}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1841722383)).booleanValue());
        onExtraCallback(new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda19
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj2) {
                MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8;
                int i7 = 2 % 2;
                int i8 = onWarmupCompleted + 41;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    Object[] objArr4 = {onextracallbackwithresult2, r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnExtraCallback, r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnExtraCallback2, (MaxFullscreenAdImplExternalSyntheticLambda8) obj2};
                    int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    maxFullscreenAdImplExternalSyntheticLambda8 = (MaxFullscreenAdImplExternalSyntheticLambda8) TossReactNativeFragment.onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr4, 852762685, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -852762647);
                    int i9 = 42 / 0;
                } else {
                    Object[] objArr5 = {onextracallbackwithresult2, r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnExtraCallback, r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnExtraCallback2, (MaxFullscreenAdImplExternalSyntheticLambda8) obj2};
                    int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    maxFullscreenAdImplExternalSyntheticLambda8 = (MaxFullscreenAdImplExternalSyntheticLambda8) TossReactNativeFragment.onExtraCallback(iOnExtraCallbackWithResult3, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr5, 852762685, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, -852762647);
                }
                int i10 = IAuthTabCallback + 95;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                return maxFullscreenAdImplExternalSyntheticLambda8;
            }
        });
    }

    private static final MaxFullscreenAdImplExternalSyntheticLambda8 onNavigationEvent(MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult, r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos, r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos2, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = access200 + 41;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda82 = (MaxFullscreenAdImplExternalSyntheticLambda8) MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, iIAuthTabCallback, new Object[]{maxFullscreenAdImplExternalSyntheticLambda8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, onextracallbackwithresult, null, r8lambdadtqrzfihm2ghoddvkfg5vm2yos, r8lambdadtqrzfihm2ghoddvkfg5vm2yos2, null, null, false, 3768319, null}, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), 1651567374);
        int i4 = access200 + 21;
        writeTypedList = i4 % 128;
        if (i4 % 2 != 0) {
            return maxFullscreenAdImplExternalSyntheticLambda82;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final MaxFullscreenAdImpl onWarmupCompleted(o4 o4Var) {
        String str;
        String str2;
        long jLongValue;
        long j;
        long jLongValue2;
        int i = 2 % 2;
        Object obj = null;
        if (o4Var.asBinder() != n6b.LocalOrRemoteBundle) {
            int i2 = access200 + 121;
            writeTypedList = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        String strIAuthTabCallback = o4Var.IAuthTabCallback();
        if (strIAuthTabCallback == null) {
            int i3 = access200 + 93;
            writeTypedList = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            throw null;
        }
        String str3 = (String) n7.IAuthTabCallback(new Object[]{o4Var.IAuthTabCallbackDefault()}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 706361440, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -706361440);
        String strIAuthTabCallbackStub = o4Var.IAuthTabCallbackStub();
        String str4 = (String) o4.onWarmupCompleted(-1806201270, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 1806201271, new Object[]{o4Var}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback());
        if (str4 == null) {
            int i4 = writeTypedList + 73;
            access200 = i4 % 128;
            str = "";
            if (i4 % 2 != 0) {
                int i5 = 14 / 0;
            }
        } else {
            str = str4;
        }
        String str5 = (String) o4.onWarmupCompleted(1338810367, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1338810367, new Object[]{o4Var}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback());
        if (StringsKt.isBlank(str5)) {
            int i6 = access200 + 7;
            writeTypedList = i6 % 128;
            int i7 = i6 % 2;
            str2 = "00000000000000";
        } else {
            str2 = str5;
        }
        String strAsInterface = o4Var.asInterface();
        String str6 = strAsInterface != null ? strAsInterface : "00000000000000";
        Long lOnTransact = o4Var.onTransact();
        if (lOnTransact != null) {
            int i8 = access200 + 49;
            writeTypedList = i8 % 128;
            if (i8 % 2 == 0) {
                lOnTransact.longValue();
                obj.hashCode();
                throw null;
            }
            jLongValue = lOnTransact.longValue();
        } else {
            jLongValue = 0;
        }
        Long lAccess000 = o4Var.access000();
        if (lAccess000 != null) {
            int i9 = access200 + 111;
            writeTypedList = i9 % 128;
            if (i9 % 2 == 0) {
                jLongValue2 = lAccess000.longValue();
                int i10 = 53 / 0;
            } else {
                jLongValue2 = lAccess000.longValue();
            }
            j = jLongValue2;
        } else {
            j = 0;
        }
        MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult = new MaxFullscreenAdImpl.onExtraCallbackWithResult(str3, strIAuthTabCallback, new TossReactBundleMeta(strIAuthTabCallbackStub, str, str2, str6, jLongValue, j, (String) null, 64, (DefaultConstructorMarker) null), o4Var.access100());
        int i11 = writeTypedList + 3;
        access200 = i11 % 128;
        int i12 = i11 % 2;
        return onextracallbackwithresult;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onExtraCallbackWithResult(r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.IAuthTabCallback iAuthTabCallback) throws Throwable {
        n7 n7VarOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = asInterface.onNavigationEvent[iAuthTabCallback.onNavigationEvent().ordinal()];
        if (i2 == 1) {
            n7VarOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted().onWarmupCompleted();
            int i3 = writeTypedList + 113;
            access200 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = access200 + 59;
            writeTypedList = i5 % 128;
            if (i5 % 2 == 0) {
                n7VarOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted().IAuthTabCallback();
                int i6 = 38 / 0;
            } else {
                n7VarOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted().IAuthTabCallback();
            }
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("groupId", n7VarOnWarmupCompleted.onWarmupCompleted());
        Object[] objArr = new Object[1];
        a(new char[]{27221, 37254, 40392, 39178, 34119, 32908}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 64451, objArr);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), onActivityResized());
        String message = iAuthTabCallback.onExtraCallback().getMessage();
        if (message == null) {
            int i7 = access200 + 61;
            writeTypedList = i7 % 128;
            if (i7 % 2 == 0) {
                message = iAuthTabCallback.onExtraCallback().toString();
                int i8 = 62 / 0;
            } else {
                message = iAuthTabCallback.onExtraCallback().toString();
            }
        }
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "BundleLoadError", (String) null, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("cause", message), getWrite.IAuthTabCallback("stackTrace", RawQueries.onNavigationEvent(iAuthTabCallback.onExtraCallback(), 0, 0, 3, (Object) null)), getWrite.IAuthTabCallback("failedBundleName", n7VarOnWarmupCompleted.IAuthTabCallback())}), (String) null, false, (String) null, 58, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(hcExternalSyntheticLambda0 hcexternalsyntheticlambda0, getAdViewTracker.IAuthTabCallback iAuthTabCallback) {
        MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult;
        String str;
        String strOnExtraCallback;
        String str2;
        String strIAuthTabCallback;
        TossReactBundleMeta tossReactBundleMetaOnExtraCallbackWithResult;
        int i = 2 % 2;
        MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult2 = (MaxFullscreenAdImpl) MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), 1619884573, R.drawable.IAuthTabCallback(), new Object[]{this.newSession}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1619884570);
        Object obj = null;
        if (onextracallbackwithresult2 instanceof MaxFullscreenAdImpl.onExtraCallbackWithResult) {
            onextracallbackwithresult = onextracallbackwithresult2;
            int i2 = writeTypedList + 47;
            access200 = i2 % 128;
            int i3 = i2 % 2;
        } else {
            onextracallbackwithresult = null;
        }
        MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresultWriteTypedObject = this.newSession.writeTypedObject();
        MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult3 = onextracallbackwithresultWriteTypedObject instanceof MaxFullscreenAdImpl.onExtraCallbackWithResult ? onextracallbackwithresultWriteTypedObject : null;
        String strIAuthTabCallback2 = hcexternalsyntheticlambda0.IAuthTabCallback();
        if (onextracallbackwithresult != null) {
            int i4 = writeTypedList + 105;
            access200 = i4 % 128;
            if (i4 % 2 != 0) {
                onextracallbackwithresult.onExtraCallbackWithResult();
                throw null;
            }
            TossReactBundleMeta tossReactBundleMetaOnExtraCallbackWithResult2 = onextracallbackwithresult.onExtraCallbackWithResult();
            str = tossReactBundleMetaOnExtraCallbackWithResult2 != null ? (String) TossReactBundleMeta.onWarmupCompleted(new Object[]{tossReactBundleMetaOnExtraCallbackWithResult2}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1379106844, 1379106845, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback()) : null;
        }
        if (str == null) {
            int i5 = access200 + 65;
            writeTypedList = i5 % 128;
            int i6 = i5 % 2;
            str = "";
        }
        if (onextracallbackwithresult != null) {
            int i7 = access200 + 39;
            writeTypedList = i7 % 128;
            int i8 = i7 % 2;
            TossReactBundleMeta tossReactBundleMetaOnExtraCallbackWithResult3 = onextracallbackwithresult.onExtraCallbackWithResult();
            if (tossReactBundleMetaOnExtraCallbackWithResult3 == null || (strOnExtraCallback = tossReactBundleMetaOnExtraCallbackWithResult3.IAuthTabCallback()) == null) {
                strOnExtraCallback = iAuthTabCallback.onExtraCallback();
                if (strOnExtraCallback == null) {
                    int i9 = writeTypedList + 89;
                    access200 = i9 % 128;
                    int i10 = i9 % 2;
                    strOnExtraCallback = "";
                }
            }
        }
        if (onextracallbackwithresult3 != null) {
            int i11 = access200 + 65;
            writeTypedList = i11 % 128;
            if (i11 % 2 == 0) {
                onextracallbackwithresult3.onExtraCallbackWithResult();
                throw null;
            }
            TossReactBundleMeta tossReactBundleMetaOnExtraCallbackWithResult4 = onextracallbackwithresult3.onExtraCallbackWithResult();
            str2 = tossReactBundleMetaOnExtraCallbackWithResult4 != null ? (String) TossReactBundleMeta.onWarmupCompleted(new Object[]{tossReactBundleMetaOnExtraCallbackWithResult4}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1379106844, 1379106845, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback()) : null;
        }
        if (str2 == null) {
            str2 = "";
        }
        boolean zOnNavigationEvent = false;
        if (onextracallbackwithresult3 == null || (tossReactBundleMetaOnExtraCallbackWithResult = onextracallbackwithresult3.onExtraCallbackWithResult()) == null) {
            strIAuthTabCallback = null;
        } else {
            int i12 = writeTypedList + 31;
            access200 = i12 % 128;
            if (i12 % 2 != 0) {
                strIAuthTabCallback = tossReactBundleMetaOnExtraCallbackWithResult.IAuthTabCallback();
                int i13 = 96 / 0;
            } else {
                strIAuthTabCallback = tossReactBundleMetaOnExtraCallbackWithResult.IAuthTabCallback();
            }
        }
        if (strIAuthTabCallback == null) {
            strIAuthTabCallback = "";
        }
        if (onextracallbackwithresult != null) {
            int i14 = access200 + 9;
            writeTypedList = i14 % 128;
            if (i14 % 2 == 0) {
                onextracallbackwithresult.onNavigationEvent();
                obj.hashCode();
                throw null;
            }
            zOnNavigationEvent = onextracallbackwithresult.onNavigationEvent();
        }
        ReactLogKt.onWarmupCompleted(strIAuthTabCallback2, str, strOnExtraCallback, str2, strIAuthTabCallback, zOnNavigationEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(hcExternalSyntheticLambda0 hcexternalsyntheticlambda0, Throwable th) throws Throwable {
        MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult;
        String str;
        String strIAuthTabCallback;
        String strIAuthTabCallback2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray;
        String str2;
        String strIntern;
        TossReactBundleMeta tossReactBundleMetaOnExtraCallbackWithResult;
        TossReactBundleMeta tossReactBundleMetaOnExtraCallbackWithResult2;
        TossReactBundleMeta tossReactBundleMetaOnExtraCallbackWithResult3;
        int i = 2 % 2;
        MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult2 = (MaxFullscreenAdImpl) MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), 1619884573, R.drawable.IAuthTabCallback(), new Object[]{this.newSession}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1619884570);
        Activity currentActivity = null;
        MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult3 = onextracallbackwithresult2 instanceof MaxFullscreenAdImpl.onExtraCallbackWithResult ? onextracallbackwithresult2 : null;
        MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresultWriteTypedObject = this.newSession.writeTypedObject();
        if (onextracallbackwithresultWriteTypedObject instanceof MaxFullscreenAdImpl.onExtraCallbackWithResult) {
            int i2 = writeTypedList + 53;
            access200 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            onextracallbackwithresult = onextracallbackwithresultWriteTypedObject;
        } else {
            onextracallbackwithresult = null;
        }
        ReactHost reactHostOnExtraCallback = writeTypedObject().onExtraCallback();
        ReactContext reactContextOnExtraCallbackWithResult = reactHostOnExtraCallback != null ? reactHostOnExtraCallback.onExtraCallbackWithResult() : null;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("serviceBundleName", hcexternalsyntheticlambda0.IAuthTabCallback());
        if (onextracallbackwithresult3 == null || (tossReactBundleMetaOnExtraCallbackWithResult3 = onextracallbackwithresult3.onExtraCallbackWithResult()) == null) {
            int i3 = writeTypedList + 63;
            access200 = i3 % 128;
            int i4 = i3 % 2;
            str = null;
        } else {
            str = (String) TossReactBundleMeta.onWarmupCompleted(new Object[]{tossReactBundleMetaOnExtraCallbackWithResult3}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1379106844, 1379106845, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback());
        }
        if (str == null) {
            str = "";
        }
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("serviceDeployedAt", str);
        if (onextracallbackwithresult3 == null || (tossReactBundleMetaOnExtraCallbackWithResult2 = onextracallbackwithresult3.onExtraCallbackWithResult()) == null) {
            strIAuthTabCallback = null;
        } else {
            int i5 = access200 + 39;
            writeTypedList = i5 % 128;
            if (i5 % 2 == 0) {
                tossReactBundleMetaOnExtraCallbackWithResult2.IAuthTabCallback();
                throw null;
            }
            strIAuthTabCallback = tossReactBundleMetaOnExtraCallbackWithResult2.IAuthTabCallback();
        }
        if (strIAuthTabCallback == null) {
            int i6 = access200 + 55;
            writeTypedList = i6 % 128;
            if (i6 % 2 == 0) {
                currentActivity.hashCode();
                throw null;
            }
            strIAuthTabCallback = "";
        }
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("serviceDeploymentId", strIAuthTabCallback);
        String str3 = (onextracallbackwithresult == null || (tossReactBundleMetaOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult()) == null) ? null : (String) TossReactBundleMeta.onWarmupCompleted(new Object[]{tossReactBundleMetaOnExtraCallbackWithResult}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1379106844, 1379106845, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback());
        if (str3 == null) {
            str3 = "";
        }
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("sharedDeployedAt", str3);
        if (onextracallbackwithresult != null) {
            int i7 = access200 + 121;
            writeTypedList = i7 % 128;
            int i8 = i7 % 2;
            TossReactBundleMeta tossReactBundleMetaOnExtraCallbackWithResult4 = onextracallbackwithresult.onExtraCallbackWithResult();
            strIAuthTabCallback2 = tossReactBundleMetaOnExtraCallbackWithResult4 != null ? tossReactBundleMetaOnExtraCallbackWithResult4.IAuthTabCallback() : null;
        }
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("sharedDeploymentId", strIAuthTabCallback2 != null ? strIAuthTabCallback2 : "");
        String message = th.getMessage();
        if (message == null) {
            message = th.toString();
        }
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback("cause", message);
        r8lambdaoYv_xINqzW0mQQBhO2XztvZdhxY r8lambdaoyv_xinqzw0mqqbho2xztvzdhxy = r8lambdaoYv_xINqzW0mQQBhO2XztvZdhxY.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback("registryId", r8lambdaoyv_xinqzw0mqqbho2xztvzdhxy.onExtraCallback(this.onMessageChannelReady));
        Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback("registeredModules", r8lambdaoyv_xinqzw0mqqbho2xztvzdhxy.onExtraCallbackWithResult(this.onMessageChannelReady));
        Pair pairIAuthTabCallback9 = getWrite.IAuthTabCallback("reactContextHash", r8lambdaoyv_xinqzw0mqqbho2xztvzdhxy.onExtraCallbackWithResult(reactContextOnExtraCallbackWithResult));
        Integer num = this.access100;
        if (num != null) {
            int i9 = writeTypedList + 105;
            convertFloatArrayToByteArray = convertFloatArrayToByteArray2;
            access200 = i9 % 128;
            if (i9 % 2 != 0) {
                String.valueOf(num.intValue());
                throw null;
            }
            String strValueOf = String.valueOf(num.intValue());
            if (strValueOf != null) {
                str2 = strValueOf;
                currentActivity = null;
                Pair pairIAuthTabCallback10 = getWrite.IAuthTabCallback("initializedContextHash", str2);
                if (reactContextOnExtraCallbackWithResult != null) {
                    currentActivity = reactContextOnExtraCallbackWithResult.getCurrentActivity();
                }
                Pair pairIAuthTabCallback11 = getWrite.IAuthTabCallback("currentActivity", r8lambdaoyv_xinqzw0mqqbho2xztvzdhxy.onExtraCallback(currentActivity));
                if (this.updateVisuals) {
                    Object[] objArr = new Object[1];
                    a(new char[]{27221, 15847, 50453, 27823, 13543, 56335}, 22441 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
                    strIntern = ((String) objArr[0]).intern();
                } else {
                    strIntern = "internal";
                }
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "CaptureBundleException", (String) null, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, pairIAuthTabCallback8, pairIAuthTabCallback9, pairIAuthTabCallback10, pairIAuthTabCallback11, getWrite.IAuthTabCallback("hostKind", strIntern)}), (String) null, false, (String) null, 58, (Object) null);
            }
            currentActivity = null;
        } else {
            convertFloatArrayToByteArray = convertFloatArrayToByteArray2;
        }
        str2 = "null";
        Pair pairIAuthTabCallback102 = getWrite.IAuthTabCallback("initializedContextHash", str2);
        if (reactContextOnExtraCallbackWithResult != null) {
        }
        Pair pairIAuthTabCallback112 = getWrite.IAuthTabCallback("currentActivity", r8lambdaoyv_xinqzw0mqqbho2xztvzdhxy.onExtraCallback(currentActivity));
        if (this.updateVisuals) {
        }
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "CaptureBundleException", (String) null, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, pairIAuthTabCallback8, pairIAuthTabCallback9, pairIAuthTabCallback102, pairIAuthTabCallback112, getWrite.IAuthTabCallback("hostKind", strIntern)}), (String) null, false, (String) null, 58, (Object) null);
    }

    private static final MaxFullscreenAdImplExternalSyntheticLambda8 onExtraCallback(Throwable th, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = writeTypedList + 29;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda82 = (MaxFullscreenAdImplExternalSyntheticLambda8) MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, iIAuthTabCallback, new Object[]{maxFullscreenAdImplExternalSyntheticLambda8, null, null, null, null, null, null, null, null, th, null, null, null, null, null, null, null, null, null, null, null, null, false, 4194047, null}, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), 1651567374);
        int i4 = writeTypedList + 89;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        return maxFullscreenAdImplExternalSyntheticLambda82;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) throws Throwable {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        n6 n6Var = (n6) objArr[1];
        final Throwable th = (Throwable) objArr[2];
        int i = 2 % 2;
        tossReactNativeFragment.onNavigationEvent("publish_react_host_start_failed", getWrite.IAuthTabCallback("throwable", th.toString()));
        tossReactNativeFragment.onExtraCallback(new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda58
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 5;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Throwable th2 = th;
                MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8 = (MaxFullscreenAdImplExternalSyntheticLambda8) obj;
                if (i4 == 0) {
                    return TossReactNativeFragment.onNavigationEvent(th2, maxFullscreenAdImplExternalSyntheticLambda8);
                }
                TossReactNativeFragment.onNavigationEvent(th2, maxFullscreenAdImplExternalSyntheticLambda8);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        n2 n2Var = n2.ReactHostStartFailed;
        tossReactNativeFragment.onExtraCallbackWithResult(n6Var.onWarmupCompleted().IAuthTabCallback(n6Var.IAuthTabCallback(), n6Var.onExtraCallbackWithResult(), tossReactNativeFragment.onExtraCallbackWithResult(n6Var, n2Var, th).IAuthTabCallback(), n2Var, th));
        int i2 = writeTypedList + 63;
        access200 = i2 % 128;
        if (i2 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071 A[PHI: r1
      0x0071: PHI (r1v12 kotlin.Pair<java.lang.String, java.lang.String>) = 
      (r1v8 kotlin.Pair<java.lang.String, java.lang.String>)
      (r1v9 kotlin.Pair<java.lang.String, java.lang.String>)
      (r1v17 kotlin.Pair<java.lang.String, java.lang.String>)
     binds: [B:8:0x0055, B:12:0x0066, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057 A[PHI: r1
      0x0057: PHI (r1v9 kotlin.Pair<java.lang.String, java.lang.String>) = (r1v8 kotlin.Pair<java.lang.String, java.lang.String>), (r1v17 kotlin.Pair<java.lang.String, java.lang.String>) binds: [B:8:0x0055, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final n1 onExtraCallbackWithResult(n6 n6Var, n2 n2Var, Throwable th) throws Throwable {
        Pair<String, String> pairIAuthTabCallback;
        String string;
        int i = 2 % 2;
        int i2 = access200 + 49;
        writeTypedList = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41539 << View.resolveSize(0, 0), objArr);
            pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), n2Var.toString());
            if (th != null) {
                int i3 = access200 + 69;
                writeTypedList = i3 % 128;
                if (i3 % 2 == 0) {
                    th.toString();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                string = th.toString();
                if (string == null) {
                    int i4 = access200 + 83;
                    writeTypedList = i4 % 128;
                    int i5 = i4 % 2;
                    string = "null";
                }
            }
        } else {
            Object[] objArr2 = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, View.resolveSize(0, 0) + 41539, objArr2);
            pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), n2Var.toString());
            if (th != null) {
            }
        }
        onNavigationEvent("record_warmup_failure", pairIAuthTabCallback, getWrite.IAuthTabCallback("throwable", string));
        final n1 n1VarIAuthTabCallback = n1.Companion.IAuthTabCallback(n6Var.IAuthTabCallback(), n6Var.onExtraCallbackWithResult(), newAuthTabSession(), n2Var, th);
        onExtraCallback(new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda36
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj2) {
                int i6 = 2 % 2;
                int i7 = onWarmupCompleted + 29;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8OnWarmupCompleted = TossReactNativeFragment.onWarmupCompleted(n1VarIAuthTabCallback, (MaxFullscreenAdImplExternalSyntheticLambda8) obj2);
                int i9 = onExtraCallbackWithResult + 73;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 == 0) {
                    return maxFullscreenAdImplExternalSyntheticLambda8OnWarmupCompleted;
                }
                throw null;
            }
        });
        return n1VarIAuthTabCallback;
    }

    private static final MaxFullscreenAdImplExternalSyntheticLambda8 IAuthTabCallback(n1 n1Var, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = writeTypedList + 53;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda82 = (MaxFullscreenAdImplExternalSyntheticLambda8) MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, iIAuthTabCallback, new Object[]{maxFullscreenAdImplExternalSyntheticLambda8, null, null, null, null, null, null, null, null, null, null, n1Var, null, null, null, null, null, null, null, null, null, null, false, 4193279, null}, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), 1651567374);
        int i4 = access200 + 27;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return maxFullscreenAdImplExternalSyntheticLambda82;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        final n1 n1VarOnWarmupCompleted;
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedList + 79;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        n1 n1VarNewSession = tossReactNativeFragment.newSession();
        Object obj = null;
        if (n1VarNewSession == null || (n1VarOnWarmupCompleted = n1.onWarmupCompleted(n1VarNewSession, null, null, tossReactNativeFragment.newAuthTabSession(), null, null, null, 59, null)) == null) {
            return null;
        }
        tossReactNativeFragment.onExtraCallback(new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda23
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj2) {
                int i4 = 2 % 2;
                int i5 = onExtraCallbackWithResult + 31;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8OnNavigationEvent = TossReactNativeFragment.onNavigationEvent(n1VarOnWarmupCompleted, (MaxFullscreenAdImplExternalSyntheticLambda8) obj2);
                int i7 = onExtraCallback + 41;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                return maxFullscreenAdImplExternalSyntheticLambda8OnNavigationEvent;
            }
        });
        int i4 = writeTypedList + 11;
        access200 = i4 % 128;
        if (i4 % 2 == 0) {
            return n1VarOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    private static final MaxFullscreenAdImplExternalSyntheticLambda8 onExtraCallback(n1 n1Var, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        Object objOnNavigationEvent;
        int i = 2 % 2;
        int i2 = writeTypedList + 121;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
            objOnNavigationEvent = MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, iIAuthTabCallback, new Object[]{maxFullscreenAdImplExternalSyntheticLambda8, null, null, null, null, null, null, null, null, null, null, n1Var, null, null, null, null, null, null, null, null, null, null, false, 4193279, null}, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), 1651567374);
        } else {
            Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
            int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
            objOnNavigationEvent = MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, iIAuthTabCallback3, new Object[]{maxFullscreenAdImplExternalSyntheticLambda8, null, null, null, null, null, null, null, null, null, null, n1Var, null, null, null, null, null, null, null, null, null, null, false, 4193279, null}, iIAuthTabCallback4, R.drawable.IAuthTabCallback(), 1651567374);
        }
        return (MaxFullscreenAdImplExternalSyntheticLambda8) objOnNavigationEvent;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final boolean areNotificationsEnabled() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = asInterface.IAuthTabCallback[newAuthTabSession().IAuthTabCallback().ordinal()];
        if (i2 != 1) {
            int i3 = writeTypedList + 97;
            int i4 = i3 % 128;
            access200 = i4;
            if (i3 % 2 == 0 ? i2 != 2 : i2 != 4) {
                if (i2 != 3) {
                    int i5 = i4 + 87;
                    writeTypedList = i5 % 128;
                    int i6 = i5 % 2;
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if (ICustomTabsService() != null) {
                    return true;
                }
                int i7 = access200 + 11;
                writeTypedList = i7 % 128;
                if (i7 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            if (mayLaunchUrl() != null) {
                return true;
            }
        }
        return false;
    }

    private static final MaxFullscreenAdImplExternalSyntheticLambda8 onExtraCallbackWithResult(n1a n1aVar, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = writeTypedList + 37;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda82 = (MaxFullscreenAdImplExternalSyntheticLambda8) MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, iIAuthTabCallback, new Object[]{maxFullscreenAdImplExternalSyntheticLambda8, null, null, null, null, null, null, null, null, null, n1aVar, null, null, null, null, null, null, null, null, null, null, null, false, 4193791, null}, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), 1651567374);
        int i4 = writeTypedList + 39;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        return maxFullscreenAdImplExternalSyntheticLambda82;
    }

    private final void onExtraCallbackWithResult(final n1a n1aVar) throws Throwable {
        int i = 2 % 2;
        int i2 = access200 + 25;
        int i3 = i2 % 128;
        writeTypedList = i3;
        int i4 = i2 % 2;
        if (n1aVar != null) {
            if (!this.ICustomTabsServiceStub.onExtraCallbackWithResult()) {
                int i5 = access200 + 15;
                writeTypedList = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr = new Object[1];
                a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 41538, objArr);
                onNavigationEvent("publish_warmup_event_skip", getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "already_published"), getWrite.IAuthTabCallback("event", n1aVar.toString()));
                return;
            }
            onNavigationEvent("publish_warmup_event", getWrite.IAuthTabCallback("event", n1aVar.toString()));
            onExtraCallback(new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda48
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8OnWarmupCompleted;
                    int i7 = 2 % 2;
                    int i8 = onNavigationEvent + 93;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 == 0) {
                        maxFullscreenAdImplExternalSyntheticLambda8OnWarmupCompleted = TossReactNativeFragment.onWarmupCompleted(n1aVar, (MaxFullscreenAdImplExternalSyntheticLambda8) obj);
                        int i9 = 44 / 0;
                    } else {
                        maxFullscreenAdImplExternalSyntheticLambda8OnWarmupCompleted = TossReactNativeFragment.onWarmupCompleted(n1aVar, (MaxFullscreenAdImplExternalSyntheticLambda8) obj);
                    }
                    int i10 = onWarmupCompleted + 59;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    return maxFullscreenAdImplExternalSyntheticLambda8OnWarmupCompleted;
                }
            });
            int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, n1aVar}, 1422979761, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1422979716);
            this.validateRelationship.IAuthTabCallback(Unit.INSTANCE);
            return;
        }
        int i7 = i3 + 49;
        access200 = i7 % 128;
        if (i7 % 2 == 0) {
            Object[] objArr2 = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41540 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
            onNavigationEvent("publish_warmup_event_skip", getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), "event_null"));
        } else {
            Object[] objArr3 = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41540 >>> (ViewConfiguration.getGlobalActionKeyTimeout() > 1L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 1L ? 0 : -1)), objArr3);
            Pair<String, String>[] pairArr = new Pair[0];
            pairArr[0] = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), "event_null");
            onNavigationEvent("publish_warmup_event_skip", pairArr);
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Throwable {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        n3 n3Var = (n3) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedList + 49;
        access200 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(n3Var, "");
            if (tossReactNativeFragment.onTransact(n3Var) != hbExternalSyntheticLambda1.Ready) {
                return false;
            }
            int i3 = writeTypedList + 65;
            access200 = i3 % 128;
            return i3 % 2 == 0;
        }
        Intrinsics.checkNotNullParameter(n3Var, "");
        tossReactNativeFragment.onTransact(n3Var);
        hbExternalSyntheticLambda1 hbexternalsyntheticlambda1 = hbExternalSyntheticLambda1.Ready;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final MaxFullscreenAdImplExternalSyntheticLambda8 onNavigationEvent(hcExternalSyntheticLambda0 hcexternalsyntheticlambda0, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = access200 + 77;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
        Object[] objArr = {maxFullscreenAdImplExternalSyntheticLambda8, null, hcexternalsyntheticlambda0, null, null, null, null, null, null, null, null, null, null, null, n5.onNavigationEvent(maxFullscreenAdImplExternalSyntheticLambda8.readTypedObject(), n6a.Staying, null, null, false, false, hbExternalSyntheticLambda1.Ready, 30, null), null, null, null, null, null, null, null, false, 4186109, null};
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda82 = (MaxFullscreenAdImplExternalSyntheticLambda8) MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, R.drawable.IAuthTabCallback(), objArr, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1651567374);
        int i4 = writeTypedList + 115;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        return maxFullscreenAdImplExternalSyntheticLambda82;
    }

    public final boolean onNavigationEvent(@NotNull n3 n3Var, @NotNull final hcExternalSyntheticLambda0 hcexternalsyntheticlambda0) throws Throwable {
        int i = 2 % 2;
        int i2 = access200 + 45;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(n3Var, "");
        Intrinsics.checkNotNullParameter(hcexternalsyntheticlambda0, "");
        onNavigationEvent("prepare_service_bundle_import_lazy_start", getWrite.IAuthTabCallback("service_bundle_name", hcexternalsyntheticlambda0.IAuthTabCallback()), getWrite.IAuthTabCallback("fallback_route", hcexternalsyntheticlambda0.onNavigationEvent()), getWrite.IAuthTabCallback("route_parameter_keys", CollectionsKt.joinToString$default(hcexternalsyntheticlambda0.onExtraCallback().keySet(), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)));
        onWarmupCompleted("prepare_service_import_lazy", getWrite.IAuthTabCallback("service_bundle_name", hcexternalsyntheticlambda0.IAuthTabCallback()), getWrite.IAuthTabCallback("fallback_route", hcexternalsyntheticlambda0.onNavigationEvent()));
        hbExternalSyntheticLambda1 hbexternalsyntheticlambda1AsBinder = asBinder(n3Var);
        if (hbexternalsyntheticlambda1AsBinder != hbExternalSyntheticLambda1.Ready) {
            int i4 = writeTypedList + 7;
            access200 = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41540 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
            onNavigationEvent("prepare_service_bundle_import_lazy_skip", getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "entry_not_ready"), getWrite.IAuthTabCallback("entry_request_state", hbexternalsyntheticlambda1AsBinder.toString()));
            return false;
        }
        onExtraCallback(new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda34
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 85;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8OnWarmupCompleted = TossReactNativeFragment.onWarmupCompleted(hcexternalsyntheticlambda0, (MaxFullscreenAdImplExternalSyntheticLambda8) obj);
                int i9 = onExtraCallbackWithResult + 29;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                return maxFullscreenAdImplExternalSyntheticLambda8OnWarmupCompleted;
            }
        });
        onNavigationEvent("prepare_service_bundle_import_lazy_route_state", getWrite.IAuthTabCallback("requested_fallback_route", hcexternalsyntheticlambda0.onNavigationEvent()), getWrite.IAuthTabCallback("requested_fallback_route_with_event", hcexternalsyntheticlambda0.onExtraCallbackWithResult()), getWrite.IAuthTabCallback("route_parameter_keys", CollectionsKt.joinToString$default(hcexternalsyntheticlambda0.onExtraCallback().keySet(), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)));
        onNavigationEvent("prepare_service_bundle_import_lazy_success", new Pair[0]);
        int i6 = access200 + 47;
        writeTypedList = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }

    private static /* synthetic */ Object newSession(Object[] objArr) {
        hcExternalSyntheticLambda0 hcexternalsyntheticlambda0 = (hcExternalSyntheticLambda0) objArr[0];
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8 = (MaxFullscreenAdImplExternalSyntheticLambda8) objArr[1];
        int i = 2 % 2;
        int i2 = access200 + 49;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
        Object[] objArr2 = {maxFullscreenAdImplExternalSyntheticLambda8, null, hcexternalsyntheticlambda0, null, null, null, null, null, null, null, null, null, null, null, n5.onNavigationEvent(maxFullscreenAdImplExternalSyntheticLambda8.readTypedObject(), n6a.Staying, null, null, false, false, hbExternalSyntheticLambda1.Ready, 30, null), null, null, null, null, null, null, null, false, 4186109, null};
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda82 = (MaxFullscreenAdImplExternalSyntheticLambda8) MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, R.drawable.IAuthTabCallback(), objArr2, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1651567374);
        int i4 = writeTypedList + 59;
        access200 = i4 % 128;
        if (i4 % 2 == 0) {
            return maxFullscreenAdImplExternalSyntheticLambda82;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final MaxFullscreenAdImplExternalSyntheticLambda8 onExtraCallbackWithResult(getAdViewTracker getadviewtracker, hcExternalSyntheticLambda0 hcexternalsyntheticlambda0, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        hcExternalSyntheticLambda0 hcexternalsyntheticlambda02;
        int i = 2 % 2;
        int i2 = access200 + 5;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
        getAdViewTracker.IAuthTabCallback iAuthTabCallback = (getAdViewTracker.IAuthTabCallback) getadviewtracker;
        hcExternalSyntheticLambda0 hcexternalsyntheticlambda0AsInterface = maxFullscreenAdImplExternalSyntheticLambda8.asInterface();
        if (hcexternalsyntheticlambda0AsInterface == null) {
            int i4 = access200 + 21;
            writeTypedList = i4 % 128;
            int i5 = i4 % 2;
            hcexternalsyntheticlambda02 = hcexternalsyntheticlambda0;
        } else {
            hcexternalsyntheticlambda02 = hcexternalsyntheticlambda0AsInterface;
        }
        Object[] objArr = {maxFullscreenAdImplExternalSyntheticLambda8, hcexternalsyntheticlambda0.IAuthTabCallback(), hcexternalsyntheticlambda02, null, null, iAuthTabCallback, null, null, null, null, null, null, null, null, n5.onNavigationEvent(maxFullscreenAdImplExternalSyntheticLambda8.readTypedObject(), n6a.Staying, null, null, false, true, hbExternalSyntheticLambda1.Ready, 14, null), null, null, null, null, null, null, null, false, 4186092, null};
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda82 = (MaxFullscreenAdImplExternalSyntheticLambda8) MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, R.drawable.IAuthTabCallback(), objArr, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1651567374);
        int i6 = access200 + 5;
        writeTypedList = i6 % 128;
        int i7 = i6 % 2;
        return maxFullscreenAdImplExternalSyntheticLambda82;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        getAdViewTracker getadviewtracker = (getAdViewTracker) objArr[0];
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8 = (MaxFullscreenAdImplExternalSyntheticLambda8) objArr[1];
        int i = 2 % 2;
        int i2 = access200 + 39;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
        Object[] objArr2 = {maxFullscreenAdImplExternalSyntheticLambda8, null, null, null, null, getadviewtracker, null, null, null, null, null, null, null, null, n5.onNavigationEvent(maxFullscreenAdImplExternalSyntheticLambda8.readTypedObject(), null, null, null, false, false, hbExternalSyntheticLambda1.Fallback, 31, null), null, null, null, null, null, null, null, false, 4186095, null};
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda82 = (MaxFullscreenAdImplExternalSyntheticLambda8) MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, R.drawable.IAuthTabCallback(), objArr2, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1651567374);
        int i4 = access200 + 91;
        writeTypedList = i4 % 128;
        if (i4 % 2 != 0) {
            return maxFullscreenAdImplExternalSyntheticLambda82;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(@NotNull n3 n3Var, @NotNull hcExternalSyntheticLambda0 hcexternalsyntheticlambda0, @NotNull access13800<? super Boolean> access13800Var) throws Throwable {
        access000 access000Var;
        ReactHost reactHost;
        long j;
        hcExternalSyntheticLambda0 hcexternalsyntheticlambda02;
        int i;
        getAdViewTracker getadviewtracker;
        boolean z;
        int i2;
        int i3 = 2 % 2;
        int i4 = access200 + 73;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        if (access13800Var instanceof access000) {
            access000Var = (access000) access13800Var;
            int i6 = access000Var.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                int i7 = access200 + 107;
                writeTypedList = i7 % 128;
                int i8 = i7 % 2;
                access000Var.label = i6 - 2147483648;
            } else {
                access000Var = new access000(access13800Var);
            }
        }
        Object objIAuthTabCallback = access000Var.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i9 = access000Var.label;
        String str = "";
        try {
            if (i9 == 0) {
                ResultKt.onNavigationEvent(objIAuthTabCallback);
                onNavigationEvent("request_service_bundle_import_lazy_start", getWrite.IAuthTabCallback("service_bundle_name", hcexternalsyntheticlambda0.IAuthTabCallback()));
                hbExternalSyntheticLambda1 hbexternalsyntheticlambda1AsBinder = asBinder(n3Var);
                if (hbexternalsyntheticlambda1AsBinder != hbExternalSyntheticLambda1.Ready) {
                    int i10 = access200 + 113;
                    writeTypedList = i10 % 128;
                    int i11 = i10 % 2;
                    Object[] objArr = new Object[1];
                    a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, ImageFormat.getBitsPerPixel(0) + 41540, objArr);
                    onNavigationEvent("request_service_bundle_import_lazy_skip", getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "entry_not_ready"), getWrite.IAuthTabCallback("entry_request_state", hbexternalsyntheticlambda1AsBinder.toString()));
                    return access14000.onNavigationEvent(false);
                }
                if (((Boolean) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, hcexternalsyntheticlambda0.IAuthTabCallback()}, -824080768, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 824080794)).booleanValue()) {
                    onWarmupCompleted("service_import_lazy_already_imported", getWrite.IAuthTabCallback("service_bundle_name", hcexternalsyntheticlambda0.IAuthTabCallback()));
                    Object[] objArr2 = new Object[1];
                    a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41539 - TextUtils.getTrimmedLength(""), objArr2);
                    onNavigationEvent("request_service_bundle_import_lazy_skip", getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), "already_imported"));
                    onExtraCallback((Function1<? super MaxFullscreenAdImplExternalSyntheticLambda8, MaxFullscreenAdImplExternalSyntheticLambda8>) new TossReactNativeFragment$.ExternalSyntheticLambda12(hcexternalsyntheticlambda0));
                    IAuthTabCallback("already_imported");
                    return access14000.onNavigationEvent(true);
                }
                hbExternalSyntheticLambda8 hbexternalsyntheticlambda8 = this.postMessage;
                if (hbexternalsyntheticlambda8 == null) {
                    int i12 = access200 + 17;
                    writeTypedList = i12 % 128;
                    int i13 = i12 % 2;
                    Object[] objArr3 = new Object[1];
                    a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41538 - TextUtils.lastIndexOf("", '0', 0), objArr3);
                    onNavigationEvent("request_service_bundle_import_lazy_skip", getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), "executor_null"));
                    return access14000.onNavigationEvent(false);
                }
                if (!this.receiveFile.compareAndSet(false, true)) {
                    Object[] objArr4 = new Object[1];
                    a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41539 - (KeyEvent.getMaxKeyCode() >> 16), objArr4);
                    onNavigationEvent("request_service_bundle_import_lazy_skip", getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), "import_lazy_in_progress"));
                    return access14000.onNavigationEvent(false);
                }
                int iHashCode = hcexternalsyntheticlambda0.IAuthTabCallback().hashCode();
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                onExtraCallbackWithResult("service_import_lazy", iHashCode);
                o4 o4Var = (o4) MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1940463639, R.drawable.IAuthTabCallback(), new Object[]{this.newSession}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1940463639);
                if (o4Var == null || !Intrinsics.areEqual(o4Var.IAuthTabCallbackDefault().IAuthTabCallback(), hcexternalsyntheticlambda0.IAuthTabCallback())) {
                    o4Var = null;
                }
                if (o4Var == null || !(hbexternalsyntheticlambda8 instanceof hbExternalSyntheticLambda6)) {
                    Function0<? extends ReactHost> function0 = this.prefetchWithMultipleUrls;
                    reactHost = function0 != null ? (ReactHost) function0.invoke() : null;
                    access000Var.L$0 = access15400.onNavigationEvent(n3Var);
                    access000Var.L$1 = hcexternalsyntheticlambda0;
                    access000Var.L$2 = access15400.onNavigationEvent(hbexternalsyntheticlambda1AsBinder);
                    access000Var.L$3 = access15400.onNavigationEvent(hbexternalsyntheticlambda8);
                    access000Var.L$4 = access15400.onNavigationEvent(o4Var);
                    access000Var.I$0 = iHashCode;
                    access000Var.J$0 = jElapsedRealtimeNanos;
                    access000Var.label = 2;
                    objIAuthTabCallback = hbexternalsyntheticlambda8.IAuthTabCallback(hcexternalsyntheticlambda0, reactHost, access000Var);
                    if (objIAuthTabCallback != objOnWarmupCompleted) {
                        j = jElapsedRealtimeNanos;
                        hcexternalsyntheticlambda02 = hcexternalsyntheticlambda0;
                        i = iHashCode;
                        getadviewtracker = (getAdViewTracker) objIAuthTabCallback;
                    }
                } else {
                    int i14 = access200 + 89;
                    writeTypedList = i14 % 128;
                    int i15 = i14 % 2;
                    hbExternalSyntheticLambda6 hbexternalsyntheticlambda6 = (hbExternalSyntheticLambda6) hbexternalsyntheticlambda8;
                    Function0<? extends ReactHost> function02 = this.prefetchWithMultipleUrls;
                    reactHost = function02 != null ? (ReactHost) function02.invoke() : null;
                    access000Var.L$0 = access15400.onNavigationEvent(n3Var);
                    access000Var.L$1 = hcexternalsyntheticlambda0;
                    access000Var.L$2 = access15400.onNavigationEvent(hbexternalsyntheticlambda1AsBinder);
                    access000Var.L$3 = access15400.onNavigationEvent(hbexternalsyntheticlambda8);
                    access000Var.L$4 = access15400.onNavigationEvent(o4Var);
                    access000Var.I$0 = iHashCode;
                    access000Var.J$0 = jElapsedRealtimeNanos;
                    access000Var.label = 1;
                    objIAuthTabCallback = hbexternalsyntheticlambda6.IAuthTabCallback(hcexternalsyntheticlambda0, reactHost, o4Var, access000Var);
                    if (objIAuthTabCallback != objOnWarmupCompleted) {
                        j = jElapsedRealtimeNanos;
                        hcexternalsyntheticlambda02 = hcexternalsyntheticlambda0;
                        i = iHashCode;
                        getadviewtracker = (getAdViewTracker) objIAuthTabCallback;
                    }
                }
                return objOnWarmupCompleted;
            }
            int i16 = writeTypedList + 95;
            access200 = i16 % 128;
            if (i16 % 2 == 0 ? i9 == 1 : i9 == 0) {
                j = access000Var.J$0;
                i = access000Var.I$0;
                hcexternalsyntheticlambda02 = (hcExternalSyntheticLambda0) access000Var.L$1;
                ResultKt.onNavigationEvent(objIAuthTabCallback);
                getadviewtracker = (getAdViewTracker) objIAuthTabCallback;
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = access000Var.J$0;
                i = access000Var.I$0;
                hcexternalsyntheticlambda02 = (hcExternalSyntheticLambda0) access000Var.L$1;
                ResultKt.onNavigationEvent(objIAuthTabCallback);
                getadviewtracker = (getAdViewTracker) objIAuthTabCallback;
            }
            if (getadviewtracker instanceof getAdViewTracker.IAuthTabCallback) {
                Pair<String, String> pairIAuthTabCallback = getWrite.IAuthTabCallback("duration_ms", String.valueOf(MaxFullscreenAdImpla.onExtraCallbackWithResult(j)));
                Pair<String, String> pairIAuthTabCallback2 = getWrite.IAuthTabCallback("service_bundle_name", hcexternalsyntheticlambda02.IAuthTabCallback());
                Object[] objArr5 = new Object[1];
                a(new char[]{27220, 41988, 63195, 134, 21334, 27953}, TextUtils.indexOf("", "", 0) + 52807, objArr5);
                Pair<String, String> pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), "imported");
                String strOnExtraCallback = ((getAdViewTracker.IAuthTabCallback) getadviewtracker).onExtraCallback();
                if (strOnExtraCallback == null) {
                    strOnExtraCallback = "";
                }
                onWarmupCompleted("service_import_lazy", i, pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback("deployment_id", strOnExtraCallback));
                Pair<String, String> pairIAuthTabCallback4 = getWrite.IAuthTabCallback("service_bundle_name", hcexternalsyntheticlambda02.IAuthTabCallback());
                String strOnExtraCallback2 = ((getAdViewTracker.IAuthTabCallback) getadviewtracker).onExtraCallback();
                if (strOnExtraCallback2 == null) {
                    int i17 = access200 + 45;
                    writeTypedList = i17 % 128;
                    i2 = 2;
                    int i18 = i17 % 2;
                } else {
                    i2 = 2;
                    str = strOnExtraCallback2;
                }
                Pair<String, String> pairIAuthTabCallback5 = getWrite.IAuthTabCallback("deployment_id", str);
                Pair<String, String>[] pairArr = new Pair[i2];
                pairArr[0] = pairIAuthTabCallback4;
                pairArr[1] = pairIAuthTabCallback5;
                onNavigationEvent("request_service_bundle_import_lazy_imported", pairArr);
                onWarmupCompleted(hcexternalsyntheticlambda02, (getAdViewTracker.IAuthTabCallback) getadviewtracker);
                onExtraCallback((Function1<? super MaxFullscreenAdImplExternalSyntheticLambda8, MaxFullscreenAdImplExternalSyntheticLambda8>) new TossReactNativeFragment$.ExternalSyntheticLambda13(getadviewtracker, hcexternalsyntheticlambda02));
                IAuthTabCallback("import_lazy_imported");
                z = true;
            } else {
                if (!(getadviewtracker instanceof getAdViewTracker.onNavigationEvent)) {
                    throw new NoWhenBranchMatchedException();
                }
                Pair<String, String> pairIAuthTabCallback6 = getWrite.IAuthTabCallback("duration_ms", String.valueOf(MaxFullscreenAdImpla.onExtraCallbackWithResult(j)));
                Pair<String, String> pairIAuthTabCallback7 = getWrite.IAuthTabCallback("service_bundle_name", hcexternalsyntheticlambda02.IAuthTabCallback());
                Object[] objArr6 = new Object[1];
                a(new char[]{27220, 41988, 63195, 134, 21334, 27953}, (KeyEvent.getMaxKeyCode() >> 16) + 52807, objArr6);
                onWarmupCompleted("service_import_lazy", i, pairIAuthTabCallback6, pairIAuthTabCallback7, getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), "failed"));
                onExtraCallback("request_service_bundle_import_lazy_failed", getWrite.IAuthTabCallback("service_bundle_name", hcexternalsyntheticlambda02.IAuthTabCallback()), getWrite.IAuthTabCallback("throwable", ((getAdViewTracker.onNavigationEvent) getadviewtracker).onNavigationEvent().toString()));
                onExtraCallbackWithResult(hcexternalsyntheticlambda02, ((getAdViewTracker.onNavigationEvent) getadviewtracker).onNavigationEvent());
                onExtraCallback((Function1<? super MaxFullscreenAdImplExternalSyntheticLambda8, MaxFullscreenAdImplExternalSyntheticLambda8>) new TossReactNativeFragment$.ExternalSyntheticLambda14(getadviewtracker));
                onExtraCallback("import_lazy_failed");
                z = false;
            }
            this.receiveFile.set(false);
            return access14000.onNavigationEvent(z);
        } catch (Throwable th) {
            this.receiveFile.set(false);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = access200 + 31;
        writeTypedList = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 19 / 0;
            if (!(!tossReactNativeFragment.newAuthTabSession().onExtraCallbackWithResult())) {
                if (Intrinsics.areEqual(tossReactNativeFragment.onActivityLayout(), str)) {
                    int i4 = access200 + 71;
                    writeTypedList = i4 % 128;
                    return i4 % 2 != 0;
                }
            }
        } else if (tossReactNativeFragment.newAuthTabSession().onExtraCallbackWithResult()) {
        }
        int i5 = access200 + 21;
        writeTypedList = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    private final String ITrustedWebActivityServiceStubProxy() {
        String str;
        int i = 2 % 2;
        int i2 = access200 + 69;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = this.newSession.onExtraCallbackWithResult();
        hcExternalSyntheticLambda0 hcexternalsyntheticlambda0ICustomTabsCallbackStub = ICustomTabsCallbackStub();
        String strOnExtraCallbackWithResult2 = hcexternalsyntheticlambda0ICustomTabsCallbackStub != null ? hcexternalsyntheticlambda0ICustomTabsCallbackStub.onExtraCallbackWithResult() : null;
        getClickableViews getclickableviewsICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy();
        n3 n3VarIEngagementSignalsCallback_Parcel = IEngagementSignalsCallback_Parcel();
        if (n3VarIEngagementSignalsCallback_Parcel == null) {
            n3VarIEngagementSignalsCallback_Parcel = n3.Companion.onWarmupCompleted();
        }
        String strOnNavigationEvent = getclickableviewsICustomTabsCallbackStubProxy.onWarmupCompleted(n3VarIEngagementSignalsCallback_Parcel).onNavigationEvent();
        String str2 = strOnExtraCallbackWithResult == null ? strOnExtraCallbackWithResult2 == null ? strOnNavigationEvent : strOnExtraCallbackWithResult2 : strOnExtraCallbackWithResult;
        if (strOnExtraCallbackWithResult != null) {
            str = "embedded_present_url";
        } else if (strOnExtraCallbackWithResult2 != null) {
            str = "requested_search_entry";
        } else {
            str = "default_search_entry";
        }
        Pair<String, String> pairIAuthTabCallback = getWrite.IAuthTabCallback("source", str);
        Pair<String, String> pairIAuthTabCallback2 = getWrite.IAuthTabCallback("scheme_uri", str2);
        if (strOnExtraCallbackWithResult == null) {
            int i4 = access200 + 21;
            writeTypedList = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            strOnExtraCallbackWithResult = "null";
        }
        Pair<String, String> pairIAuthTabCallback3 = getWrite.IAuthTabCallback("embedded_present_url", strOnExtraCallbackWithResult);
        if (strOnExtraCallbackWithResult2 == null) {
            strOnExtraCallbackWithResult2 = "null";
        }
        onNavigationEvent("resolve_granite_brownfield_scheme_uri", pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback("requested_route", strOnExtraCallbackWithResult2), getWrite.IAuthTabCallback("default_route", strOnNavigationEvent));
        return str2;
    }

    public final hbExternalSyntheticLambda1 asBinder(@NotNull n3 n3Var) {
        int i = 2 % 2;
        int i2 = access200 + 13;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(n3Var, "");
        hbExternalSyntheticLambda1 hbexternalsyntheticlambda1OnExtraCallbackWithResult = IAuthTabCallbackStub(n3Var).onExtraCallbackWithResult();
        int i4 = access200 + 31;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return hbexternalsyntheticlambda1OnExtraCallbackWithResult;
    }

    public final r8lambda3Y0aFlZwA9jpnWeqrtfX4xUpOIo IAuthTabCallbackStub(@NotNull n3 n3Var) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(n3Var, "");
        final hbExternalSyntheticLambda1 hbexternalsyntheticlambda1OnTransact = onTransact(n3Var);
        onNavigationEvent("update_search_entry_warmup_state", getWrite.IAuthTabCallback("entry_request_state", hbexternalsyntheticlambda1OnTransact.toString()));
        Object[] objArr = {this, new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda16
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 105;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    TossReactNativeFragment.onNavigationEvent(hbexternalsyntheticlambda1OnTransact, (n5) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                n5 n5VarOnNavigationEvent = TossReactNativeFragment.onNavigationEvent(hbexternalsyntheticlambda1OnTransact, (n5) obj);
                int i4 = IAuthTabCallback + 101;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 88 / 0;
                }
                return n5VarOnNavigationEvent;
            }
        }};
        onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr, -761972630, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 761972649);
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        r8lambda3Y0aFlZwA9jpnWeqrtfX4xUpOIo r8lambda3y0aflzwa9jpnweqrtfx4xupoio = new r8lambda3Y0aFlZwA9jpnWeqrtfX4xUpOIo(hbexternalsyntheticlambda1OnTransact, (n1) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -1172700435, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1172700439));
        int i2 = access200 + 101;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        return r8lambda3y0aflzwa9jpnweqrtfx4xupoio;
    }

    private static final n5 asBinder(n5 n5Var) {
        n5 n5VarOnNavigationEvent;
        int i = 2 % 2;
        int i2 = writeTypedList + 61;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(n5Var, "");
            n5VarOnNavigationEvent = n5.onNavigationEvent(n5Var, null, null, null, false, true, hbExternalSyntheticLambda1.Fallback, 88, null);
        } else {
            Intrinsics.checkNotNullParameter(n5Var, "");
            n5VarOnNavigationEvent = n5.onNavigationEvent(n5Var, null, null, null, false, false, hbExternalSyntheticLambda1.Fallback, 31, null);
        }
        int i3 = access200 + 31;
        writeTypedList = i3 % 128;
        int i4 = i3 % 2;
        return n5VarOnNavigationEvent;
    }

    public final hbExternalSyntheticLambda9 onExtraCallbackWithResult(@NotNull n3 n3Var, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(n3Var, "");
        Intrinsics.checkNotNullParameter(str, "");
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        n6 n6Var = (n6) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -1098765882, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1098765903);
        Object obj = null;
        if (n6Var == null) {
            int i2 = access200 + 91;
            writeTypedList = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 79 / 0;
            }
            return null;
        }
        if (Intrinsics.areEqual(n6Var.IAuthTabCallback(), n3Var.access000())) {
            if (Intrinsics.areEqual(n6Var.onExtraCallbackWithResult(), n3Var.getInterfaceDescriptor()) && newAuthTabSession().onWarmupCompleted() == hbExternalSyntheticLambda1.Fallback) {
                return n3Var.IAuthTabCallbackStub().onNavigationEvent(str, n6Var.IAuthTabCallback(), n6Var.onExtraCallbackWithResult(), newAuthTabSession(), n6Var.onNavigationEvent());
            }
            return null;
        }
        int i4 = access200;
        int i5 = i4 + 105;
        writeTypedList = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 15;
        writeTypedList = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final hbExternalSyntheticLambda1 onTransact(@NotNull n3 n3Var) throws Throwable {
        int i = 2 % 2;
        int i2 = access200 + 33;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, ExpandableListView.getPackedPositionGroup(0L) + 41539, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Intrinsics.checkNotNullParameter(n3Var, "");
        n6 n6Var = (n6) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -1098765882, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1098765903);
        if (n6Var == null) {
            hbExternalSyntheticLambda1 hbexternalsyntheticlambda1 = hbExternalSyntheticLambda1.Fallback;
            onNavigationEvent("resolve_search_entry_request_state", getWrite.IAuthTabCallback("state", hbexternalsyntheticlambda1.toString()), getWrite.IAuthTabCallback(strIntern, "warmup_request_null"));
            return hbexternalsyntheticlambda1;
        }
        if (!n3Var.IAuthTabCallback_Parcel()) {
            hbExternalSyntheticLambda1 hbexternalsyntheticlambda12 = hbExternalSyntheticLambda1.Fallback;
            onNavigationEvent("resolve_search_entry_request_state", getWrite.IAuthTabCallback("state", hbexternalsyntheticlambda12.toString()), getWrite.IAuthTabCallback(strIntern, "import_lazy_disabled"));
            return hbexternalsyntheticlambda12;
        }
        if (!n3Var.onTransact().IAuthTabCallbackDefault()) {
            hbExternalSyntheticLambda1 hbexternalsyntheticlambda13 = hbExternalSyntheticLambda1.Fallback;
            onNavigationEvent("resolve_search_entry_request_state", getWrite.IAuthTabCallback("state", hbexternalsyntheticlambda13.toString()), getWrite.IAuthTabCallback(strIntern, "show_existing_disabled"));
            return hbexternalsyntheticlambda13;
        }
        if (!Intrinsics.areEqual((String) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -762434377, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 762434409), n3Var.access000())) {
            hbExternalSyntheticLambda1 hbexternalsyntheticlambda14 = hbExternalSyntheticLambda1.Fallback;
            onNavigationEvent("resolve_search_entry_request_state", getWrite.IAuthTabCallback("state", hbexternalsyntheticlambda14.toString()), getWrite.IAuthTabCallback(strIntern, "fragment_shared_bundle_mismatch"));
            return hbexternalsyntheticlambda14;
        }
        if (!Intrinsics.areEqual(onUnminimized(), n3Var.getInterfaceDescriptor())) {
            hbExternalSyntheticLambda1 hbexternalsyntheticlambda15 = hbExternalSyntheticLambda1.Fallback;
            onNavigationEvent("resolve_search_entry_request_state", getWrite.IAuthTabCallback("state", hbexternalsyntheticlambda15.toString()), getWrite.IAuthTabCallback(strIntern, "fragment_service_bundle_mismatch"));
            return hbexternalsyntheticlambda15;
        }
        if (!Intrinsics.areEqual(n6Var.IAuthTabCallback(), n3Var.access000())) {
            hbExternalSyntheticLambda1 hbexternalsyntheticlambda16 = hbExternalSyntheticLambda1.Fallback;
            onNavigationEvent("resolve_search_entry_request_state", getWrite.IAuthTabCallback("state", hbexternalsyntheticlambda16.toString()), getWrite.IAuthTabCallback(strIntern, "request_shared_bundle_mismatch"));
            return hbexternalsyntheticlambda16;
        }
        if (!Intrinsics.areEqual(n6Var.onExtraCallbackWithResult(), n3Var.getInterfaceDescriptor())) {
            int i4 = writeTypedList + 85;
            access200 = i4 % 128;
            int i5 = i4 % 2;
            hbExternalSyntheticLambda1 hbexternalsyntheticlambda17 = hbExternalSyntheticLambda1.Fallback;
            onNavigationEvent("resolve_search_entry_request_state", getWrite.IAuthTabCallback("state", hbexternalsyntheticlambda17.toString()), getWrite.IAuthTabCallback(strIntern, "request_service_bundle_mismatch"));
            return hbexternalsyntheticlambda17;
        }
        if (newAuthTabSession().onExtraCallback() == onRewardedAdLoaded.Removed) {
            hbExternalSyntheticLambda1 hbexternalsyntheticlambda18 = hbExternalSyntheticLambda1.Fallback;
            onNavigationEvent("resolve_search_entry_request_state", getWrite.IAuthTabCallback("state", hbexternalsyntheticlambda18.toString()), getWrite.IAuthTabCallback(strIntern, "fragment_removed"));
            return hbexternalsyntheticlambda18;
        }
        if (newAuthTabSession().onExtraCallback() == onRewardedAdLoaded.Destroyed) {
            int i6 = access200 + 17;
            writeTypedList = i6 % 128;
            int i7 = i6 % 2;
            hbExternalSyntheticLambda1 hbexternalsyntheticlambda19 = hbExternalSyntheticLambda1.Fallback;
            onNavigationEvent("resolve_search_entry_request_state", getWrite.IAuthTabCallback("state", hbexternalsyntheticlambda19.toString()), getWrite.IAuthTabCallback(strIntern, "fragment_destroyed"));
            return hbexternalsyntheticlambda19;
        }
        hbExternalSyntheticLambda1 hbexternalsyntheticlambda1OnWarmupCompleted = newAuthTabSession().onWarmupCompleted();
        hbExternalSyntheticLambda1 hbexternalsyntheticlambda110 = hbExternalSyntheticLambda1.Fallback;
        if (hbexternalsyntheticlambda1OnWarmupCompleted == hbexternalsyntheticlambda110) {
            onNavigationEvent("resolve_search_entry_request_state", getWrite.IAuthTabCallback("state", hbexternalsyntheticlambda110.toString()), getWrite.IAuthTabCallback(strIntern, "already_fallback"));
            return hbexternalsyntheticlambda110;
        }
        if (newSession() != null) {
            int i8 = access200 + 49;
            writeTypedList = i8 % 128;
            int i9 = i8 % 2;
            onNavigationEvent("resolve_search_entry_request_state", getWrite.IAuthTabCallback("state", hbexternalsyntheticlambda110.toString()), getWrite.IAuthTabCallback(strIntern, "warmup_failure"));
            int i10 = access200 + 71;
            writeTypedList = i10 % 128;
            if (i10 % 2 != 0) {
                return hbexternalsyntheticlambda110;
            }
            throw null;
        }
        if (newAuthTabSession().IAuthTabCallback() == n0a.Loaded && newAuthTabSession().onNavigationEvent()) {
            hbExternalSyntheticLambda1 hbexternalsyntheticlambda111 = hbExternalSyntheticLambda1.Ready;
            onNavigationEvent("resolve_search_entry_request_state", getWrite.IAuthTabCallback("state", hbexternalsyntheticlambda111.toString()), getWrite.IAuthTabCallback(strIntern, "loaded_and_started"));
            return hbexternalsyntheticlambda111;
        }
        if (!ITrustedWebActivityCallback_Parcel()) {
            onNavigationEvent("resolve_search_entry_request_state", getWrite.IAuthTabCallback("state", hbexternalsyntheticlambda110.toString()), getWrite.IAuthTabCallback(strIntern, "not_loading_or_started"));
            return hbexternalsyntheticlambda110;
        }
        int i11 = writeTypedList + 105;
        access200 = i11 % 128;
        int i12 = i11 % 2;
        hbExternalSyntheticLambda1 hbexternalsyntheticlambda112 = hbExternalSyntheticLambda1.Waiting;
        onNavigationEvent("resolve_search_entry_request_state", getWrite.IAuthTabCallback("state", hbexternalsyntheticlambda112.toString()), getWrite.IAuthTabCallback(strIntern, "warmup_in_progress"));
        return hbexternalsyntheticlambda112;
    }

    private static final n5 onExtraCallback(n5 n5Var, n5 n5Var2) {
        int i = 2 % 2;
        int i2 = access200 + 19;
        writeTypedList = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(n5Var2, "");
            return n5.onNavigationEvent(n5Var, null, onRewardedAdLoaded.Shown, null, false, true, null, 126, null);
        }
        Intrinsics.checkNotNullParameter(n5Var2, "");
        return n5.onNavigationEvent(n5Var, null, onRewardedAdLoaded.Shown, null, false, false, null, 61, null);
    }

    static final /* synthetic */ class onTransact extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        onTransact(Object obj) {
            super(0, obj, TossReactNativeFragment.class, "handleReactDefaultBackPressed", "handleReactDefaultBackPressed()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult();
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            TossReactNativeFragment.readTypedObject((TossReactNativeFragment) ((CallableReference) this).receiver);
            int i4 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    public final boolean onWarmupCompleted(@NotNull n3 n3Var) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(n3Var, "");
        onNavigationEvent("mark_shown_on_shopping_search_entry_start", new Pair[0]);
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        if (!((Boolean) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, n3Var}, 568447579, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -568447574)).booleanValue()) {
            int i2 = writeTypedList + 51;
            access200 = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41538 - (SystemClock.uptimeMillis() > 1L ? 1 : (SystemClock.uptimeMillis() == 1L ? 0 : -1)), objArr);
                Pair<String, String>[] pairArr = new Pair[1];
                pairArr[1] = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "cannot_show_immediately");
                onNavigationEvent("mark_shown_on_shopping_search_entry_skip", pairArr);
            } else {
                Object[] objArr2 = new Object[1];
                a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 41538, objArr2);
                onNavigationEvent("mark_shown_on_shopping_search_entry_skip", getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), "cannot_show_immediately"));
            }
            return false;
        }
        if (newAuthTabSession().onExtraCallback() == onRewardedAdLoaded.Shown) {
            int i3 = access200 + 39;
            writeTypedList = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr3 = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, (ViewConfiguration.getScrollBarSize() >> 8) + 41539, objArr3);
            onNavigationEvent("mark_shown_on_shopping_search_entry_skip", getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), "already_shown"));
            return true;
        }
        final n5 n5VarNewAuthTabSession = newAuthTabSession();
        Object[] objArr4 = {this, new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda47
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i5 = 2 % 2;
                int i6 = onExtraCallback + 117;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    TossReactNativeFragment.IAuthTabCallback(n5VarNewAuthTabSession, (n5) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                n5 n5VarIAuthTabCallback = TossReactNativeFragment.IAuthTabCallback(n5VarNewAuthTabSession, (n5) obj);
                int i7 = onExtraCallback + 55;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 41 / 0;
                }
                return n5VarIAuthTabCallback;
            }
        }};
        onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr4, -761972630, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 761972649);
        getSmallIconBitmap();
        this.extraCommand = new ReactBackPressHandler(new onTransact(this));
        onNavigationEvent(n3Var, n5VarNewAuthTabSession);
        onNavigationEvent("mark_shown_on_shopping_search_entry_success", new Pair[0]);
        return true;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        n3 n3Var = (n3) objArr[1];
        ReactHost reactHost = (ReactHost) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        if ((iIntValue & 2) != 0) {
            int i2 = writeTypedList + 99;
            int i3 = i2 % 128;
            access200 = i3;
            if (i2 % 2 != 0) {
                Function0<? extends ReactHost> function0 = tossReactNativeFragment.prefetchWithMultipleUrls;
                throw null;
            }
            Function0<? extends ReactHost> function02 = tossReactNativeFragment.prefetchWithMultipleUrls;
            if (function02 != null) {
                reactHost = (ReactHost) function02.invoke();
            } else {
                int i4 = i3 + 85;
                writeTypedList = i4 % 128;
                int i5 = i4 % 2;
                reactHost = null;
            }
        }
        return Boolean.valueOf(tossReactNativeFragment.onExtraCallbackWithResult(n3Var, reactHost));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r5 = r4.extraCommand.onWarmupCompleted(r6);
        r6 = im.toss.rn.toss.core.TossReactNativeFragment.writeTypedList + 17;
        im.toss.rn.toss.core.TossReactNativeFragment.access200 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if ((r6 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r6 = 80 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (IAuthTabCallbackDefault(r5) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (IAuthTabCallbackDefault(r5) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r5 = im.toss.rn.toss.core.TossReactNativeFragment.writeTypedList + 67;
        im.toss.rn.toss.core.TossReactNativeFragment.access200 = r5 % 128;
        r5 = r5 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onExtraCallbackWithResult(@NotNull n3 n3Var, @Nullable ReactHost reactHost) {
        int i = 2 % 2;
        int i2 = access200 + 97;
        writeTypedList = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(n3Var, "");
            int i3 = 89 / 0;
        } else {
            Intrinsics.checkNotNullParameter(n3Var, "");
        }
    }

    public final void postMessage() {
        int i = 2 % 2;
        int i2 = writeTypedList + 25;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        this.extraCommand.onWarmupCompleted();
        if (i3 != 0) {
            throw null;
        }
    }

    private static final n5 onTransact(n5 n5Var) {
        int i = 2 % 2;
        int i2 = writeTypedList + 97;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(n5Var, "");
        n5 n5VarOnNavigationEvent = n5.onNavigationEvent(n5Var, n6a.Staying, onRewardedAdLoaded.Hidden, null, false, false, hbExternalSyntheticLambda1.Ready, 28, null);
        int i4 = writeTypedList + 113;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        return n5VarOnNavigationEvent;
    }

    static final /* synthetic */ class access100 extends FunctionReferenceImpl implements Function0<Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        access100(Object obj) {
            super(0, obj, TossReactNativeFragment.class, "handleReactDefaultBackPressed", "handleReactDefaultBackPressed()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback();
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                TossReactNativeFragment.readTypedObject((TossReactNativeFragment) ((CallableReference) this).receiver);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            TossReactNativeFragment.readTypedObject((TossReactNativeFragment) ((CallableReference) this).receiver);
            int i3 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 48 / 0;
            }
        }
    }

    private static /* synthetic */ Object isEngagementSignalsApiAvailable(Object[] objArr) throws Throwable {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        n3 n3Var = (n3) objArr[1];
        int i = 2 % 2;
        int i2 = access200 + 51;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(n3Var, "");
        tossReactNativeFragment.onNavigationEvent("prepare_to_hide_when_react_cannot_go_back_start", new Pair[0]);
        if (tossReactNativeFragment.IAuthTabCallbackStubProxy(n3Var)) {
            Object[] objArr2 = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 41538, objArr2);
            tossReactNativeFragment.onNavigationEvent("prepare_to_hide_when_react_cannot_go_back_skip", getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), "empty_hide_transition"));
            return true;
        }
        if (!tossReactNativeFragment.ICustomTabsCallbackStubProxy.compareAndSet(false, true)) {
            Object[] objArr3 = new Object[1];
            a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41539 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr3);
            tossReactNativeFragment.onNavigationEvent("prepare_to_hide_when_react_cannot_go_back_skip", getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), "pre_hide_in_progress"));
            return false;
        }
        try {
            if (!tossReactNativeFragment.onNavigationEvent(n3Var)) {
                int i4 = access200 + 49;
                writeTypedList = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr4 = new Object[1];
                a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, 41587 - AndroidCharacter.getMirror('0'), objArr4);
                tossReactNativeFragment.onNavigationEvent("prepare_to_hide_when_react_cannot_go_back_skip", getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), "cannot_hide"));
            } else {
                tossReactNativeFragment.IAuthTabCallback_Parcel(n3Var);
                if (tossReactNativeFragment.newAuthTabSession().onExtraCallback() != onRewardedAdLoaded.Removed) {
                    int i6 = access200 + 27;
                    writeTypedList = i6 % 128;
                    if (i6 % 2 == 0) {
                        tossReactNativeFragment.newAuthTabSession().onExtraCallback();
                        onRewardedAdLoaded onrewardedadloaded = onRewardedAdLoaded.Destroyed;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (tossReactNativeFragment.newAuthTabSession().onExtraCallback() != onRewardedAdLoaded.Destroyed) {
                        onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{tossReactNativeFragment, new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda39
                            private static int onExtraCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj2) {
                                int i7 = 2 % 2;
                                int i8 = onExtraCallback + 111;
                                onWarmupCompleted = i8 % 128;
                                int i9 = i8 % 2;
                                n5 n5VarOnExtraCallback = TossReactNativeFragment.onExtraCallback((n5) obj2);
                                int i10 = onWarmupCompleted + 83;
                                onExtraCallback = i10 % 128;
                                if (i10 % 2 == 0) {
                                    return n5VarOnExtraCallback;
                                }
                                throw null;
                            }
                        }}, -761972630, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 761972649);
                        tossReactNativeFragment.getSmallIconBitmap();
                        tossReactNativeFragment.extraCommand = new ReactBackPressHandler(new access100(tossReactNativeFragment));
                        tossReactNativeFragment.onNavigationEvent("prepare_to_hide_when_react_cannot_go_back_success", new Pair[0]);
                        return true;
                    }
                }
                Object[] objArr5 = new Object[1];
                a(new char[]{27220, 51200, 11969, 35996, 58181, 16647}, (ViewConfiguration.getTapTimeout() >> 16) + 41539, objArr5);
                tossReactNativeFragment.onNavigationEvent("prepare_to_hide_when_react_cannot_go_back_skip", getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), "removed_or_destroyed"));
            }
            return false;
        } finally {
            tossReactNativeFragment.ICustomTabsCallbackStubProxy.set(false);
        }
    }

    private static final n5 onExtraCallbackWithResult(n5 n5Var) {
        int i = 2 % 2;
        int i2 = writeTypedList + 25;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(n5Var, "");
        n5 n5VarOnNavigationEvent = n5.onNavigationEvent(n5Var, n6a.Left, onRewardedAdLoaded.Removed, null, false, false, hbExternalSyntheticLambda1.Fallback, 28, null);
        int i4 = writeTypedList + 25;
        access200 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return n5VarOnNavigationEvent;
    }

    private static /* synthetic */ Object mayLaunchUrl(Object[] objArr) throws Throwable {
        TossReactNativeFragment tossReactNativeFragment = (TossReactNativeFragment) objArr[0];
        int i = 2 % 2;
        tossReactNativeFragment.onNavigationEvent("mark_removed_from_shopping_tab", new Pair[0]);
        Object[] objArr2 = {tossReactNativeFragment, new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda42
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 111;
                onWarmupCompleted = i3 % 128;
                n5 n5Var = (n5) obj;
                if (i3 % 2 == 0) {
                    return TossReactNativeFragment.onWarmupCompleted(n5Var);
                }
                TossReactNativeFragment.onWarmupCompleted(n5Var);
                throw null;
            }
        }};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr2, -761972630, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 761972649);
        tossReactNativeFragment.getSmallIconBitmap();
        int i2 = access200 + 7;
        writeTypedList = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final boolean IAuthTabCallbackDefault(n3 n3Var) {
        int i = 2 % 2;
        n6 n6Var = (n6) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -1098765882, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1098765903);
        if (n6Var == null) {
            int i2 = writeTypedList + 91;
            access200 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (n3Var.onExtraCallbackWithResult() && n3Var.IAuthTabCallback().IAuthTabCallback()) {
            int i4 = writeTypedList + 125;
            access200 = i4 % 128;
            int i5 = i4 % 2;
            if (!Intrinsics.areEqual(n6Var.IAuthTabCallback(), n3Var.access000())) {
                int i6 = access200;
                int i7 = i6 + 15;
                writeTypedList = i7 % 128;
                int i8 = i7 % 2;
                int i9 = i6 + 37;
                writeTypedList = i9 % 128;
                int i10 = i9 % 2;
            } else {
                if (!Intrinsics.areEqual(n6Var.onExtraCallbackWithResult(), n3Var.getInterfaceDescriptor())) {
                    int i11 = access200 + 35;
                    writeTypedList = i11 % 128;
                    return i11 % 2 == 0;
                }
                if (!Intrinsics.areEqual((String) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -762434377, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 762434409), n3Var.access000())) {
                    int i12 = access200 + 25;
                    writeTypedList = i12 % 128;
                    return i12 % 2 == 0;
                }
                if (Intrinsics.areEqual(onUnminimized(), n3Var.getInterfaceDescriptor()) && !isHidden() && newAuthTabSession().onExtraCallback() == onRewardedAdLoaded.Shown && newAuthTabSession().onNavigationEvent()) {
                    int i13 = access200 + 81;
                    writeTypedList = i13 % 128;
                    int i14 = i13 % 2;
                    if (newAuthTabSession().onExtraCallbackWithResult() && newAuthTabSession().onWarmupCompleted() == hbExternalSyntheticLambda1.Ready) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final boolean IAuthTabCallbackStubProxy(n3 n3Var) {
        int i = 2 % 2;
        n6 n6Var = (n6) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -1098765882, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1098765903);
        if (n6Var == null) {
            int i2 = writeTypedList + 5;
            access200 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (n3Var.onExtraCallbackWithResult() && n3Var.IAuthTabCallback().onExtraCallbackWithResult()) {
            if (!Intrinsics.areEqual(n6Var.IAuthTabCallback(), n3Var.access000()) || (!Intrinsics.areEqual(n6Var.onExtraCallbackWithResult(), n3Var.getInterfaceDescriptor()))) {
                return false;
            }
            if (!Intrinsics.areEqual((String) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -762434377, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 762434409), n3Var.access000())) {
                int i4 = access200 + 3;
                writeTypedList = i4 % 128;
                return i4 % 2 == 0;
            }
            if (!Intrinsics.areEqual(onUnminimized(), n3Var.getInterfaceDescriptor()) || newAuthTabSession().onExtraCallback() != onRewardedAdLoaded.Hidden) {
                return false;
            }
            if (newAuthTabSession().onNavigationEvent() && !(!newAuthTabSession().onExtraCallbackWithResult()) && newAuthTabSession().onWarmupCompleted() == hbExternalSyntheticLambda1.Ready) {
                int i5 = writeTypedList + 63;
                access200 = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
        }
        int i7 = writeTypedList + 111;
        access200 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public final boolean onNavigationEvent(@NotNull n3 n3Var) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(n3Var, "");
        n6 n6Var = (n6) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -1098765882, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1098765903);
        if (n6Var == null || !n3Var.onExtraCallbackWithResult() || (!n3Var.IAuthTabCallback().onExtraCallbackWithResult()) || !Intrinsics.areEqual(n6Var.IAuthTabCallback(), n3Var.access000())) {
            return false;
        }
        if (!Intrinsics.areEqual(n6Var.onExtraCallbackWithResult(), n3Var.getInterfaceDescriptor())) {
            int i2 = access200 + 41;
            writeTypedList = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!Intrinsics.areEqual((String) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -762434377, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 762434409), n3Var.access000())) {
            return false;
        }
        if (!Intrinsics.areEqual(onUnminimized(), n3Var.getInterfaceDescriptor())) {
            int i3 = access200 + 123;
            writeTypedList = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!isHidden()) {
            int i5 = access200 + 105;
            writeTypedList = i5 % 128;
            if (i5 % 2 == 0) {
                newAuthTabSession().onExtraCallback();
                onRewardedAdLoaded onrewardedadloaded = onRewardedAdLoaded.Shown;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (newAuthTabSession().onExtraCallback() == onRewardedAdLoaded.Shown && newAuthTabSession().onNavigationEvent()) {
                int i6 = writeTypedList + 113;
                access200 = i6 % 128;
                int i7 = i6 % 2;
                if (newAuthTabSession().onExtraCallbackWithResult() && newAuthTabSession().onWarmupCompleted() == hbExternalSyntheticLambda1.Ready) {
                    int i8 = writeTypedList + 7;
                    access200 = i8 % 128;
                    return i8 % 2 == 0;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r1v4 kotlin.jvm.functions.Function0<kotlin.Unit>), (r1v9 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IPostMessageServiceStubProxy() {
        Function0<Unit> function0;
        int i = 2 % 2;
        int i2 = writeTypedList + 57;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            function0 = this.ICustomTabsCallback_Parcel;
            int i3 = 58 / 0;
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            function0 = this.ICustomTabsCallback_Parcel;
            if (function0 != null) {
            }
        }
        int i4 = access200 + 95;
        writeTypedList = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean ITrustedWebActivityCallback() {
        int i = 2 % 2;
        int i2 = writeTypedList + 37;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        Function0<Boolean> function0 = this.mayLaunchUrl;
        if (function0 == null || !((Boolean) function0.invoke()).booleanValue()) {
            return false;
        }
        int i4 = access200 + 47;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private static final MaxFullscreenAdImplExternalSyntheticLambda8 onExtraCallback(hbExternalSyntheticLambda2 hbexternalsyntheticlambda2, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        Object objOnNavigationEvent;
        int i = 2 % 2;
        int i2 = writeTypedList + 115;
        access200 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
            objOnNavigationEvent = MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, iIAuthTabCallback, new Object[]{maxFullscreenAdImplExternalSyntheticLambda8, null, null, null, null, null, null, null, null, null, null, null, hbexternalsyntheticlambda2, null, null, null, null, null, null, null, null, null, false, 4192255, null}, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), 1651567374);
        } else {
            Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda8, "");
            int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
            objOnNavigationEvent = MaxFullscreenAdImplExternalSyntheticLambda8.onNavigationEvent(R.drawable.IAuthTabCallback(), -1651567372, iIAuthTabCallback3, new Object[]{maxFullscreenAdImplExternalSyntheticLambda8, null, null, null, null, null, null, null, null, null, null, null, hbexternalsyntheticlambda2, null, null, null, null, null, null, null, null, null, false, 4192255, null}, iIAuthTabCallback4, R.drawable.IAuthTabCallback(), 1651567374);
        }
        MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda82 = (MaxFullscreenAdImplExternalSyntheticLambda8) objOnNavigationEvent;
        int i3 = writeTypedList + 65;
        access200 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 12 / 0;
        }
        return maxFullscreenAdImplExternalSyntheticLambda82;
    }

    private final void IAuthTabCallback_Parcel(n3 n3Var) {
        int i = 2 % 2;
        n5 n5VarNewAuthTabSession = newAuthTabSession();
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onRewardedAdDisplayFailed onrewardedaddisplayfailed = (onRewardedAdDisplayFailed) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -639144808, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 639144810);
        hbExternalSyntheticLambda11 hbexternalsyntheticlambda11OnWarmupCompleted = onWarmupCompleted(n3Var.asInterface(), onrewardedaddisplayfailed);
        int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        final hbExternalSyntheticLambda2 hbexternalsyntheticlambda2 = new hbExternalSyntheticLambda2((String) onExtraCallback(iOnExtraCallbackWithResult4, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -762434377, iOnExtraCallbackWithResult6, iOnExtraCallbackWithResult5, 762434409), onUnminimized(), n5VarNewAuthTabSession, n3Var.asInterface(), onrewardedaddisplayfailed, hbexternalsyntheticlambda11OnWarmupCompleted);
        onExtraCallback(new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda11
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 95;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                hbExternalSyntheticLambda2 hbexternalsyntheticlambda22 = hbexternalsyntheticlambda2;
                MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8 = (MaxFullscreenAdImplExternalSyntheticLambda8) obj;
                if (i4 != 0) {
                    return TossReactNativeFragment.IAuthTabCallback(hbexternalsyntheticlambda22, maxFullscreenAdImplExternalSyntheticLambda8);
                }
                TossReactNativeFragment.IAuthTabCallback(hbexternalsyntheticlambda22, maxFullscreenAdImplExternalSyntheticLambda8);
                throw null;
            }
        });
        Function1<? super hbExternalSyntheticLambda2, Unit> function1 = this.onUnminimized;
        if (function1 != null) {
            int i2 = access200 + 15;
            writeTypedList = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(hbexternalsyntheticlambda2);
            if (i3 == 0) {
                throw null;
            }
        }
    }

    private final void onNavigationEvent(n3 n3Var, n5 n5Var) {
        int i = 2 % 2;
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        final hbExternalSyntheticLambda4 hbexternalsyntheticlambda4 = new hbExternalSyntheticLambda4((String) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -762434377, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 762434409), onUnminimized(), n5Var, newAuthTabSession(), n3Var.asInterface());
        onExtraCallback(new Function1() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$$ExternalSyntheticLambda33
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 37;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                hbExternalSyntheticLambda4 hbexternalsyntheticlambda42 = hbexternalsyntheticlambda4;
                MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8 = (MaxFullscreenAdImplExternalSyntheticLambda8) obj;
                if (i4 != 0) {
                    int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult5 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult6 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    return (MaxFullscreenAdImplExternalSyntheticLambda8) TossReactNativeFragment.onExtraCallback(iOnExtraCallbackWithResult4, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{hbexternalsyntheticlambda42, maxFullscreenAdImplExternalSyntheticLambda8}, 716952552, iOnExtraCallbackWithResult6, iOnExtraCallbackWithResult5, -716952544);
                }
                int iOnExtraCallbackWithResult7 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult8 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult9 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda82 = (MaxFullscreenAdImplExternalSyntheticLambda8) TossReactNativeFragment.onExtraCallback(iOnExtraCallbackWithResult7, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{hbexternalsyntheticlambda42, maxFullscreenAdImplExternalSyntheticLambda8}, 716952552, iOnExtraCallbackWithResult9, iOnExtraCallbackWithResult8, -716952544);
                int i5 = 24 / 0;
                return maxFullscreenAdImplExternalSyntheticLambda82;
            }
        });
        Function1<? super hbExternalSyntheticLambda4, Unit> function1 = this.ICustomTabsCallbackStub;
        if (function1 != null) {
            int i2 = writeTypedList + 23;
            access200 = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(hbexternalsyntheticlambda4);
        }
        int i4 = writeTypedList + 77;
        access200 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final hbExternalSyntheticLambda11 onWarmupCompleted(hbExternalSyntheticLambda13 hbexternalsyntheticlambda13, onRewardedAdDisplayFailed onrewardedaddisplayfailed) {
        int i = 2 % 2;
        int i2 = writeTypedList + 29;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        hbExternalSyntheticLambda11 hbexternalsyntheticlambda11OnNavigationEvent = this.onActivityLayout.onNavigationEvent(hbexternalsyntheticlambda13, onrewardedaddisplayfailed);
        int i4 = writeTypedList + 25;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        return hbexternalsyntheticlambda11OnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Object obj;
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        boolean z;
        View decorView;
        int i2 = 2 % 2;
        FragmentActivity activity = ((TossReactNativeFragment) objArr[0]).getActivity();
        if (activity == null) {
            return onRewardedAdDisplayFailed.Companion.onExtraCallback();
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(activity.getWindow());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (!(!Result.onExtraCallback(obj))) {
            obj = null;
        }
        Window window = (Window) obj;
        try {
            Result.Companion companion3 = Result.Companion;
            if (window != null) {
                int i3 = writeTypedList + 77;
                access200 = i3 % 128;
                if (i3 % 2 != 0) {
                    window.getDecorView();
                    throw null;
                }
                decorView = window.getDecorView();
            } else {
                decorView = null;
            }
            obj2 = Result.constructor-impl(decorView);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
        }
        if (Result.onExtraCallback(obj2)) {
            int i4 = writeTypedList + 119;
            access200 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            obj2 = null;
        }
        View view = (View) obj2;
        boolean zIsFinishing = activity.isFinishing();
        boolean zIsDestroyed = activity.isDestroyed();
        boolean z2 = window != null;
        try {
            Result.Companion companion5 = Result.Companion;
            if (view != null) {
                int i5 = access200 + 33;
                writeTypedList = i5 % 128;
                int i6 = i5 % 2;
                if (view.isAttachedToWindow()) {
                    int i7 = writeTypedList + 21;
                    int i8 = i7 % 128;
                    access200 = i8;
                    int i9 = i7 % 2;
                    int i10 = i8 + 79;
                    writeTypedList = i10 % 128;
                    int i11 = i10 % 2;
                    z = true;
                } else {
                    z = false;
                }
                obj3 = Result.constructor-impl(Boolean.valueOf(z));
                i = access200 + 37;
            }
        } catch (Throwable th3) {
            Result.Companion companion6 = Result.Companion;
            obj3 = Result.constructor-impl(ResultKt.createFailure(th3));
            i = access200 + 11;
        }
        writeTypedList = i % 128;
        int i12 = i % 2;
        Boolean bool = Boolean.FALSE;
        if (Result.onExtraCallback(obj3)) {
            obj3 = bool;
        }
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        try {
            Result.Companion companion7 = Result.Companion;
            obj4 = Result.constructor-impl(Boolean.valueOf((view != null ? view.getWindowToken() : null) != null));
        } catch (Throwable th4) {
            Result.Companion companion8 = Result.Companion;
            obj4 = Result.constructor-impl(ResultKt.createFailure(th4));
        }
        Boolean bool2 = Boolean.FALSE;
        if (Result.onExtraCallback(obj4)) {
            obj4 = bool2;
        }
        return new onRewardedAdDisplayFailed(true, zIsFinishing, zIsDestroyed, z2, zBooleanValue, ((Boolean) obj4).booleanValue());
    }

    private final boolean ITrustedWebActivityCallback_Parcel() {
        int i = 2 % 2;
        int i2 = writeTypedList + 33;
        access200 = i2 % 128;
        int i3 = i2 % 2;
        if (newAuthTabSession().IAuthTabCallback() != n0a.Loading) {
            if (this.isEngagementSignalsApiAvailable.get()) {
                return true;
            }
            if (newAuthTabSession().IAuthTabCallback() == n0a.Loaded && !newAuthTabSession().onNavigationEvent() && onMessageChannelReady() == null && !(extraCallback() instanceof n1a.onNavigationEvent)) {
                int i4 = access200 + 45;
                writeTypedList = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            int i6 = access200 + 3;
            writeTypedList = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 61 / 0;
            }
            return false;
        }
        int i8 = access200 + 121;
        writeTypedList = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    static final class onWarmupCompleted implements logicVerifyID {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private final RnPhaseObserver onExtraCallback;
        private final n0c.onExtraCallbackWithResult onWarmupCompleted;

        static final class IAuthTabCallback extends ContinuationImpl {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;
            int label;
            /* synthetic */ Object result;

            IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
                super(access13800Var);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 39;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                Object objOnWarmupCompleted = onWarmupCompleted.this.onWarmupCompleted(this);
                int i4 = onWarmupCompleted + 65;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }
        }

        public static final /* synthetic */ class onExtraCallbackWithResult {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            public static final /* synthetic */ int[] onWarmupCompleted;

            static {
                int[] iArr = new int[n0b.values().length];
                try {
                    iArr[n0b.LocalOrRemoteBundle.ordinal()] = 1;
                    int i = onNavigationEvent + 97;
                    IAuthTabCallback = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[n0b.Metro.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                onWarmupCompleted = iArr;
                int i3 = onNavigationEvent + 47;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
        }

        public onWarmupCompleted(@NotNull n0c.onExtraCallbackWithResult onextracallbackwithresult, @NotNull RnPhaseObserver rnPhaseObserver) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            Intrinsics.checkNotNullParameter(rnPhaseObserver, "");
            this.onWarmupCompleted = onextracallbackwithresult;
            this.onExtraCallback = rnPhaseObserver;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object onWarmupCompleted(@NotNull access13800<? super transGetKmCert> access13800Var) {
            IAuthTabCallback iAuthTabCallback;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (access13800Var instanceof IAuthTabCallback) {
                iAuthTabCallback = (IAuthTabCallback) access13800Var;
                int i4 = iAuthTabCallback.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    iAuthTabCallback.label = i4 - 2147483648;
                } else {
                    iAuthTabCallback = new IAuthTabCallback(access13800Var);
                    int i5 = IAuthTabCallback + 107;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
            Object obj = iAuthTabCallback.result;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i7 = iAuthTabCallback.label;
            if (i7 != 0) {
                int i8 = onExtraCallbackWithResult + 3;
                int i9 = i8 % 128;
                IAuthTabCallback = i9;
                int i10 = i8 % 2;
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = i9 + 125;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                RnPhaseObserver rnPhaseObserver = this.onExtraCallback;
                iAuthTabCallback.label = 1;
                if (rnPhaseObserver.onWarmupCompleted((access13800<? super Unit>) iAuthTabCallback) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return IAuthTabCallback();
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        private final transGetKmCert IAuthTabCallback() throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult.onWarmupCompleted[this.onWarmupCompleted.IAuthTabCallbackDefault().ordinal()];
            if (i2 == 1) {
                String strOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted();
                if (strOnWarmupCompleted != null) {
                    return new transGetKmCert.onWarmupCompleted(new pkcs5PBKDF2.onExtraCallbackWithResult(strOnWarmupCompleted), this.onWarmupCompleted.onExtraCallbackWithResult().onExtraCallbackWithResult());
                }
                throw new IllegalArgumentException("Shared bundle filePath is null for shopping tab RN warm-up");
            }
            int i3 = IAuthTabCallback;
            int i4 = i3 + 125;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i6 = i3 + 101;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                this.onWarmupCompleted.onExtraCallback();
                throw null;
            }
            String strOnExtraCallback = this.onWarmupCompleted.onExtraCallback();
            if (strOnExtraCallback == null) {
                strOnExtraCallback = "localhost";
            }
            Integer numOnTransact = this.onWarmupCompleted.onTransact();
            transGetKmCert.onNavigationEvent onnavigationevent = new transGetKmCert.onNavigationEvent(strOnExtraCallback, numOnTransact != null ? numOnTransact.intValue() : 8081, this.onWarmupCompleted.onExtraCallbackWithResult().onExtraCallbackWithResult());
            int i7 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return onnavigationevent;
        }
    }

    static final class IAuthTabCallback extends Role implements AnnotatedStringKtExternalSyntheticLambda2 {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private final WeakReference<TossReactNativeFragment> onExtraCallbackWithResult;
        private final String onWarmupCompleted;

        static final class onWarmupCompleted extends ContinuationImpl {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            /* synthetic */ Object result;

            onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
                super(access13800Var);
            }

            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 121;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                IAuthTabCallback iAuthTabCallback = IAuthTabCallback.this;
                if (i3 != 0) {
                    return iAuthTabCallback.onExtraCallbackWithResult(this);
                }
                iAuthTabCallback.onExtraCallbackWithResult(this);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull ReactContext reactContext, @NotNull WeakReference<TossReactNativeFragment> weakReference) {
            super(reactContext);
            Intrinsics.checkNotNullParameter(reactContext, "");
            Intrinsics.checkNotNullParameter(weakReference, "");
            this.onExtraCallbackWithResult = weakReference;
            this.onWarmupCompleted = "TossBundleLoader";
        }

        public String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 103;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i2 + 11;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 26 / 0;
            }
            return str;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object onExtraCallbackWithResult(@NotNull access13800<? super Unit> access13800Var) throws Throwable {
            onWarmupCompleted onwarmupcompleted;
            n3 n3VarIAuthTabCallback_Parcel;
            hcExternalSyntheticLambda0 hcexternalsyntheticlambda0;
            TossReactNativeFragment tossReactNativeFragment;
            getAdViewTracker.onNavigationEvent onnavigationevent;
            int i = 2 % 2;
            if (access13800Var instanceof onWarmupCompleted) {
                onwarmupcompleted = (onWarmupCompleted) access13800Var;
                int i2 = onwarmupcompleted.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    int i3 = onExtraCallback + 51;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 != 0) {
                        onwarmupcompleted.label = i2 * Integer.MIN_VALUE;
                    } else {
                        onwarmupcompleted.label = i2 - 2147483648;
                    }
                } else {
                    onwarmupcompleted = new onWarmupCompleted(access13800Var);
                }
            }
            Object obj = onwarmupcompleted.result;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = onwarmupcompleted.label;
            Throwable thOnNavigationEvent = null;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                TossReactNativeFragment tossReactNativeFragment2 = this.onExtraCallbackWithResult.get();
                if (tossReactNativeFragment2 == null) {
                    throw new IllegalStateException("Shopping tab RN Fragment is not available for importLazy");
                }
                int i5 = onExtraCallback + 39;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    TossReactNativeFragment.onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{tossReactNativeFragment2, true}, -360051808, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 360051815);
                    n3VarIAuthTabCallback_Parcel = TossReactNativeFragment.IAuthTabCallback_Parcel(tossReactNativeFragment2);
                    if (n3VarIAuthTabCallback_Parcel == null) {
                        n3VarIAuthTabCallback_Parcel = n3.Companion.onWarmupCompleted();
                    }
                    if (n3VarIAuthTabCallback_Parcel.IAuthTabCallback_Parcel()) {
                        int i6 = onNavigationEvent + 1;
                        onExtraCallback = i6 % 128;
                        if (i6 % 2 != 0) {
                            TossReactNativeFragment.onExtraCallback(tossReactNativeFragment2, "policy_disabled");
                            return Unit.INSTANCE;
                        }
                        TossReactNativeFragment.onExtraCallback(tossReactNativeFragment2, "policy_disabled");
                        Unit unit = Unit.INSTANCE;
                        throw null;
                    }
                    hcExternalSyntheticLambda0 hcexternalsyntheticlambda0ICustomTabsCallbackStub = tossReactNativeFragment2.ICustomTabsCallbackStub();
                    if (hcexternalsyntheticlambda0ICustomTabsCallbackStub == null) {
                        hcexternalsyntheticlambda0ICustomTabsCallbackStub = tossReactNativeFragment2.ICustomTabsCallbackStubProxy().onWarmupCompleted(n3VarIAuthTabCallback_Parcel);
                    }
                    if (TossReactNativeFragment.IAuthTabCallback(tossReactNativeFragment2, hcexternalsyntheticlambda0ICustomTabsCallbackStub.IAuthTabCallback())) {
                        TossReactNativeFragment.onExtraCallback(tossReactNativeFragment2, "already_imported");
                        return Unit.INSTANCE;
                    }
                    onwarmupcompleted.L$0 = tossReactNativeFragment2;
                    onwarmupcompleted.L$1 = access15400.onNavigationEvent(n3VarIAuthTabCallback_Parcel);
                    onwarmupcompleted.L$2 = hcexternalsyntheticlambda0ICustomTabsCallbackStub;
                    onwarmupcompleted.label = 1;
                    Object objOnNavigationEvent = tossReactNativeFragment2.onNavigationEvent(n3VarIAuthTabCallback_Parcel, hcexternalsyntheticlambda0ICustomTabsCallbackStub, (access13800<? super Boolean>) onwarmupcompleted);
                    if (objOnNavigationEvent == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                    hcexternalsyntheticlambda0 = hcexternalsyntheticlambda0ICustomTabsCallbackStub;
                    tossReactNativeFragment = tossReactNativeFragment2;
                    obj = objOnNavigationEvent;
                } else {
                    int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    TossReactNativeFragment.onExtraCallback(iOnExtraCallbackWithResult3, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{tossReactNativeFragment2, true}, -360051808, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, 360051815);
                    n3VarIAuthTabCallback_Parcel = TossReactNativeFragment.IAuthTabCallback_Parcel(tossReactNativeFragment2);
                    if (n3VarIAuthTabCallback_Parcel == null) {
                    }
                    if (n3VarIAuthTabCallback_Parcel.IAuthTabCallback_Parcel()) {
                    }
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hcexternalsyntheticlambda0 = (hcExternalSyntheticLambda0) onwarmupcompleted.L$2;
                tossReactNativeFragment = (TossReactNativeFragment) onwarmupcompleted.L$0;
                ResultKt.onNavigationEvent(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                int i7 = onNavigationEvent + 41;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return Unit.INSTANCE;
            }
            getAdViewTracker.onNavigationEvent onnavigationeventICustomTabsCallbackDefault = tossReactNativeFragment.ICustomTabsCallbackDefault();
            if (!(onnavigationeventICustomTabsCallbackDefault instanceof getAdViewTracker.onNavigationEvent)) {
                onnavigationevent = null;
            } else {
                int i9 = onExtraCallback + 101;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                onnavigationevent = onnavigationeventICustomTabsCallbackDefault;
            }
            String str = "Failed to load shopping tab RN service bundle: " + hcexternalsyntheticlambda0.IAuthTabCallback();
            if (onnavigationevent != null) {
                int i11 = onExtraCallback + 95;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                thOnNavigationEvent = onnavigationevent.onNavigationEvent();
            }
            throw new IllegalStateException(str, thOnNavigationEvent);
        }

        public Object IAuthTabCallback(@NotNull String str, @NotNull access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            throw new UnsupportedOperationException("Portal service bundles require the Application-owned TossBundleLoader");
        }

        public Object onExtraCallback(@NotNull AnnotatedStringKtExternalSyntheticLambda3 annotatedStringKtExternalSyntheticLambda3, @NotNull access13800<? super JvmAnnotatedString_jvmAndAndroidKtExternalSyntheticLambda0> access13800Var) {
            int i = 2 % 2;
            throw new UnsupportedOperationException("Portal service bundles require the Application-owned TossBundleLoader");
        }

        public Object onNavigationEvent(@NotNull String str, @NotNull access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            throw new UnsupportedOperationException("Portal service Activities require the Application-owned TossBundleLoader");
        }

        public Object onExtraCallback(@NotNull access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            throw new UnsupportedOperationException("Portal service sessions require the Application-owned TossBundleLoader");
        }
    }

    static final class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private final String onExtraCallback;
        private final boolean onExtraCallbackWithResult;

        public static /* synthetic */ onNavigationEvent onExtraCallbackWithResult(onNavigationEvent onnavigationevent, String str, boolean z, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 65;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 1) != 0) {
                int i6 = i3 + 73;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                str = onnavigationevent.onExtraCallback;
                if (i7 != 0) {
                    int i8 = 77 / 0;
                }
            }
            if ((i & 2) != 0) {
                z = onnavigationevent.onExtraCallbackWithResult;
            }
            onNavigationEvent onnavigationeventOnExtraCallback = onnavigationevent.onExtraCallback(str, z);
            int i9 = IAuthTabCallback + 115;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 50 / 0;
            }
            return onnavigationeventOnExtraCallback;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i2 = onNavigationEvent + 71;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (!Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback)) {
                return false;
            }
            if (this.onExtraCallbackWithResult == onnavigationevent.onExtraCallbackWithResult) {
                return true;
            }
            int i4 = IAuthTabCallback + 83;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.onExtraCallback.hashCode() * 31) + Boolean.hashCode(this.onExtraCallbackWithResult);
            int i4 = onNavigationEvent + 99;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final onNavigationEvent onExtraCallback(@NotNull String str, boolean z) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            onNavigationEvent onnavigationevent = new onNavigationEvent(str, z);
            int i2 = onNavigationEvent + 53;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 59 / 0;
            }
            return onnavigationevent;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "PendingEmbeddedRnPresent(url=" + this.onExtraCallback + ", transitionEndRequested=" + this.onExtraCallbackWithResult + ")";
            int i2 = onNavigationEvent + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onNavigationEvent(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallback = str;
            this.onExtraCallbackWithResult = z;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onNavigationEvent(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = IAuthTabCallback + 15;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 121;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
                z = false;
            }
            this(str, z);
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 73;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallback;
            int i5 = i2 + 91;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 43 / 0;
            }
            return str;
        }

        public final boolean onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 51;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.onExtraCallbackWithResult;
            int i5 = i2 + 21;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }
    }

    static final class onExtraCallback {
        private static int IAuthTabCallbackDefault = 1;
        private static int asInterface;
        private final TossModule IAuthTabCallback;
        private final GraniteBrownfieldModule onExtraCallback;
        private final List<getTitleResource> onExtraCallbackWithResult;
        private final IAuthTabCallback onNavigationEvent;
        private final transImportCert onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallbackDefault;
                int i3 = i2 + 85;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 13;
                asInterface = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 9 / 0;
                }
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if ((!Intrinsics.areEqual(this.onNavigationEvent, onextracallback.onNavigationEvent)) || !Intrinsics.areEqual(this.onExtraCallback, onextracallback.onExtraCallback) || !Intrinsics.areEqual(this.IAuthTabCallback, onextracallback.IAuthTabCallback) || !Intrinsics.areEqual(this.onWarmupCompleted, onextracallback.onWarmupCompleted)) {
                return false;
            }
            int i7 = IAuthTabCallbackDefault + 109;
            asInterface = i7 % 128;
            if (i7 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 93;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((this.onNavigationEvent.hashCode() * 31) + this.onExtraCallback.hashCode()) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onWarmupCompleted.hashCode();
            int i4 = asInterface + 41;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 10 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ShoppingTabBrickModules(bundleLoaderModule=" + this.onNavigationEvent + ", graniteBrownfieldModule=" + this.onExtraCallback + ", tossModule=" + this.IAuthTabCallback + ", cookiesModule=" + this.onWarmupCompleted + ")";
            int i2 = IAuthTabCallbackDefault + 61;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public onExtraCallback(@NotNull IAuthTabCallback iAuthTabCallback, @NotNull GraniteBrownfieldModule graniteBrownfieldModule, @NotNull TossModule tossModule, @NotNull transImportCert transimportcert) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intrinsics.checkNotNullParameter(graniteBrownfieldModule, "");
            Intrinsics.checkNotNullParameter(tossModule, "");
            Intrinsics.checkNotNullParameter(transimportcert, "");
            this.onNavigationEvent = iAuthTabCallback;
            this.onExtraCallback = graniteBrownfieldModule;
            this.IAuthTabCallback = tossModule;
            this.onWarmupCompleted = transimportcert;
            this.onExtraCallbackWithResult = CollectionsKt.listOf(new Role[]{iAuthTabCallback, graniteBrownfieldModule, tossModule, transimportcert});
        }

        public final GraniteBrownfieldModule onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 103;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            GraniteBrownfieldModule graniteBrownfieldModule = this.onExtraCallback;
            int i5 = i2 + 15;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 23 / 0;
            }
            return graniteBrownfieldModule;
        }

        public final TossModule IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 37;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            TossModule tossModule = this.IAuthTabCallback;
            int i5 = i2 + 31;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 8 / 0;
            }
            return tossModule;
        }

        public final List<getTitleResource> onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 17;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public static final /* synthetic */ class IAuthTabCallback {
            private static int IAuthTabCallback = 1;
            public static final /* synthetic */ int[] onExtraCallback;
            private static int onNavigationEvent;

            static {
                int[] iArr = new int[hbExternalSyntheticLambda0.values().length];
                try {
                    iArr[hbExternalSyntheticLambda0.None.ordinal()] = 1;
                    int i = onNavigationEvent + 27;
                    IAuthTabCallback = i % 128;
                    int i2 = i % 2;
                    int i3 = 2 % 2;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[hbExternalSyntheticLambda0.GraniteDefaultLoadingView.ordinal()] = 2;
                    int i4 = IAuthTabCallback + 39;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 3 / 5;
                    } else {
                        int i6 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused2) {
                }
                onExtraCallback = iArr;
            }
        }

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final TossReactNativeFragment onWarmupCompleted(@NotNull hd hdVar) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(hdVar, "");
            TossReactNativeFragment tossReactNativeFragment = new TossReactNativeFragment();
            Bundle bundle = new Bundle();
            bundle.putString("origin_scheme", hdVar.onWarmupCompleted());
            bundle.putString("shared_bundle_name", hdVar.onExtraCallbackWithResult());
            bundle.putString("service_bundle_import_lazy_service_bundle_name", hdVar.onNavigationEvent());
            bundle.putString("search_entry_service_bundle_name", hdVar.onNavigationEvent());
            bundle.putString("service_bundle_name", hdVar.onNavigationEvent());
            tossReactNativeFragment.setArguments(bundle);
            int i2 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 38 / 0;
            }
            return tossReactNativeFragment;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final View onExtraCallbackWithResult(@NotNull Context context, @NotNull n3 n3Var) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(n3Var, "");
            int i2 = IAuthTabCallback.onExtraCallback[((hbExternalSyntheticLambda0) n3.IAuthTabCallback(new Object[]{n3Var}, -443132950, 443132951, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult())).ordinal()];
            if (i2 == 1) {
                return null;
            }
            int i3 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0 ? i2 != 2 : i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            DefaultLoadingView defaultLoadingView = new DefaultLoadingView(context);
            int i4 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return defaultLoadingView;
        }
    }

    static {
        writeTypedList();
        Companion = new onExtraCallbackWithResult(null);
        onExtraCallbackWithResult = CollectionsKt.listOf(new String[]{"TossBundleLoader", "GraniteBrownfieldModule", "TossModule", "Cookies"});
        int i = ICustomTabsService_Parcel + 87;
        ICustomTabsServiceStubProxy = i % 128;
        int i2 = i % 2;
    }

    private static final WindowInsetsCompat onExtraCallbackWithResult(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        int iAsBinder = WindowInsetsCompat.onTransact.asBinder() | WindowInsetsCompat.onTransact.onExtraCallbackWithResult();
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompat.onWarmupCompleted(iAsBinder);
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
        view.setPadding(cameraControllerExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback, 0, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallbackWithResult, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback);
        WindowInsetsCompat.onWarmupCompleted onwarmupcompleted = new WindowInsetsCompat.onWarmupCompleted(windowInsetsCompat);
        int i2 = access200 + 101;
        writeTypedList = i2 % 128;
        int i3 = i2 % 2;
        while (iAsBinder != 0) {
            int i4 = writeTypedList + 75;
            access200 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = (-iAsBinder) & iAsBinder;
            CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted2 = windowInsetsCompat.onWarmupCompleted(i6);
            Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted2, "");
            CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnNavigationEvent = CameraControllerExternalSyntheticLambda0.onNavigationEvent(0, cameraControllerExternalSyntheticLambda0OnWarmupCompleted2.onWarmupCompleted, 0, 0);
            Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnNavigationEvent, "");
            onwarmupcompleted.onNavigationEvent(i6, cameraControllerExternalSyntheticLambda0OnNavigationEvent);
            iAsBinder ^= i6;
        }
        WindowInsetsCompat windowInsetsCompatOnExtraCallbackWithResult = onwarmupcompleted.onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatOnExtraCallbackWithResult, "");
        int i7 = access200 + 125;
        writeTypedList = i7 % 128;
        if (i7 % 2 != 0) {
            return windowInsetsCompatOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8 onWarmupCompleted(getAdViewTracker getadviewtracker, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (MaxFullscreenAdImplExternalSyntheticLambda8) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{getadviewtracker, maxFullscreenAdImplExternalSyntheticLambda8}, -566427128, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 566427142);
    }

    public static /* synthetic */ Unit onNavigationEvent(TossReactNativeFragment tossReactNativeFragment) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{tossReactNativeFragment}, -1985461483, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1985461518);
    }

    public static /* synthetic */ ReactHost onWarmupCompleted(TossReactNativeFragment tossReactNativeFragment) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (ReactHost) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{tossReactNativeFragment}, -152502573, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 152502613);
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(TossReactNativeFragment tossReactNativeFragment) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{tossReactNativeFragment}, -800368641, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 800368663);
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8 IAuthTabCallback(hbExternalSyntheticLambda4 hbexternalsyntheticlambda4, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (MaxFullscreenAdImplExternalSyntheticLambda8) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{hbexternalsyntheticlambda4, maxFullscreenAdImplExternalSyntheticLambda8}, 716952552, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -716952544);
    }

    public static /* synthetic */ getSignForPKCS7NoContents getInterfaceDescriptor() {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (getSignForPKCS7NoContents) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[0], 1300838458, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -1300838449);
    }

    public static /* synthetic */ Unit onNavigationEvent(TossReactNativeFragment tossReactNativeFragment, FrameLayout frameLayout, n6 n6Var, n0c.onExtraCallbackWithResult onextracallbackwithresult, ReactSurfaceView reactSurfaceView) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{tossReactNativeFragment, frameLayout, n6Var, onextracallbackwithresult, reactSurfaceView}, -238345554, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 238345598);
    }

    public static /* synthetic */ boolean asInterface(TossReactNativeFragment tossReactNativeFragment) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{tossReactNativeFragment}, 1204814391, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -1204814345)).booleanValue();
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8 onWarmupCompleted(MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (MaxFullscreenAdImplExternalSyntheticLambda8) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{maxFullscreenAdImplExternalSyntheticLambda8}, 755378419, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -755378372);
    }

    public static /* synthetic */ Unit IAuthTabCallback(TossReactNativeFragment tossReactNativeFragment, ReactSurfaceView reactSurfaceView) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{tossReactNativeFragment, reactSurfaceView}, 1155608975, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -1155608957);
    }

    public static /* synthetic */ readFileToByteArray onExtraCallback(Context context) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (readFileToByteArray) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{context}, -2030707354, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 2030707385);
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda8 IAuthTabCallback(MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult, r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos, r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos2, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (MaxFullscreenAdImplExternalSyntheticLambda8) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{onextracallbackwithresult, r8lambdadtqrzfihm2ghoddvkfg5vm2yos, r8lambdadtqrzfihm2ghoddvkfg5vm2yos2, maxFullscreenAdImplExternalSyntheticLambda8}, 852762685, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -852762647);
    }

    public static /* synthetic */ boolean getInterfaceDescriptor(TossReactNativeFragment tossReactNativeFragment) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{tossReactNativeFragment}, -1847344450, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1847344477)).booleanValue();
    }

    public static /* synthetic */ Unit IAuthTabCallback(Throwable th) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{th}, -1095899176, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1095899201);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(TossReactNativeFragment tossReactNativeFragment, n6 n6Var, n0c.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{tossReactNativeFragment, n6Var, onextracallbackwithresult}, 1288088686, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -1288088671);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(TossReactNativeFragment tossReactNativeFragment, boolean z) throws Throwable {
        Object[] objArr = {tossReactNativeFragment, Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr, -360051808, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 360051815);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(TossReactNativeFragment tossReactNativeFragment, ReactInstanceEventListener reactInstanceEventListener) throws Throwable {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{tossReactNativeFragment, reactInstanceEventListener}, 2116854540, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -2116854516);
    }

    private static final MaxFullscreenAdImplExternalSyntheticLambda8 asBinder(MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (MaxFullscreenAdImplExternalSyntheticLambda8) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{maxFullscreenAdImplExternalSyntheticLambda8}, 1387600631, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -1387600615);
    }

    private final List<ReactPackage> onGreatestScrollPercentageIncreased() {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (List) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -772030870, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 772030911);
    }

    private static final MaxFullscreenAdImplExternalSyntheticLambda8 onNavigationEvent(hbExternalSyntheticLambda4 hbexternalsyntheticlambda4, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (MaxFullscreenAdImplExternalSyntheticLambda8) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{hbexternalsyntheticlambda4, maxFullscreenAdImplExternalSyntheticLambda8}, -804124388, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 804124408);
    }

    public static /* synthetic */ boolean IAuthTabCallback(TossReactNativeFragment tossReactNativeFragment, n3 n3Var, ReactHost reactHost, int i, Object obj) {
        Object[] objArr = {tossReactNativeFragment, n3Var, reactHost, Integer.valueOf(i), obj};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr, -21731093, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 21731116)).booleanValue();
    }

    private static final Unit onMessageChannelReady(TossReactNativeFragment tossReactNativeFragment) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{tossReactNativeFragment}, -1177664865, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1177664876);
    }

    private final boolean onNavigationEvent(String str) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, str}, -824080768, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 824080794)).booleanValue();
    }

    private final boolean IAuthTabCallback(n6 n6Var, Throwable th) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, n6Var, th}, 979231155, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -979231126)).booleanValue();
    }

    private final void onNavigationEvent(n1a n1aVar) throws Throwable {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, n1aVar}, 1422979761, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -1422979716);
    }

    private final n1 getActiveNotifications() {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (n1) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -1172700435, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1172700439);
    }

    private static final transV2ExportCert ITrustedWebActivityServiceDefault() {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (transV2ExportCert) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[0], 2083037319, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -2083037271);
    }

    private static final readFileToByteArray onWarmupCompleted(Context context) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (readFileToByteArray) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{context}, -1743637927, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1743637957);
    }

    private static final MaxFullscreenAdImplExternalSyntheticLambda8 onExtraCallback(hcExternalSyntheticLambda0 hcexternalsyntheticlambda0, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (MaxFullscreenAdImplExternalSyntheticLambda8) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{hcexternalsyntheticlambda0, maxFullscreenAdImplExternalSyntheticLambda8}, -1621207192, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1621207241);
    }

    private static final MaxFullscreenAdImplExternalSyntheticLambda8 onNavigationEvent(getAdViewTracker getadviewtracker, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (MaxFullscreenAdImplExternalSyntheticLambda8) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{getadviewtracker, maxFullscreenAdImplExternalSyntheticLambda8}, -1456683886, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1456683898);
    }

    private static final MaxFullscreenAdImplExternalSyntheticLambda8 onExtraCallbackWithResult(MaxNativeAdImpl maxNativeAdImpl, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (MaxFullscreenAdImplExternalSyntheticLambda8) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{maxNativeAdImpl, maxFullscreenAdImplExternalSyntheticLambda8}, -227074729, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 227074780);
    }

    private final onRewardedAdDisplayFailed ITrustedWebActivityService_Parcel() {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (onRewardedAdDisplayFailed) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -639144808, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 639144810);
    }

    private static final Unit onExtraCallbackWithResult(TossReactNativeFragment tossReactNativeFragment, String str) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{tossReactNativeFragment, str}, -1373881612, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1373881612);
    }

    private final void onExtraCallback(FrameLayout frameLayout, n6 n6Var, n0c.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, frameLayout, n6Var, onextracallbackwithresult}, 337806815, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -337806781);
    }

    private static final Unit onExtraCallbackWithResult(Throwable th) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{th}, -382920135, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 382920172);
    }

    private final int onExtraCallbackWithResult(View view) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return ((Integer) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, view}, -1579584123, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1579584156)).intValue();
    }

    private final boolean onExtraCallback(n6 n6Var, n0c.onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, n6Var, onextracallbackwithresult}, -336328580, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 336328590)).booleanValue();
    }

    private static final ReactHost onExtraCallbackWithResult(ReactHost reactHost) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (ReactHost) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{reactHost}, -1336324309, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1336324359);
    }

    private final <T> T IAuthTabCallback(String str, Function0<? extends T> function0) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (T) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, str, function0}, -678580714, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 678580731);
    }

    private static final n5 onExtraCallback(hbExternalSyntheticLambda1 hbexternalsyntheticlambda1, n5 n5Var) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (n5) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{hbexternalsyntheticlambda1, n5Var}, -229566195, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 229566231);
    }

    private final void IAuthTabCallback(Function1<? super n5, n5> function1) throws Throwable {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, function1}, -761972630, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 761972649);
    }

    private static final MaxFullscreenAdImplExternalSyntheticLambda8 onWarmupCompleted(Function1 function1, MaxFullscreenAdImplExternalSyntheticLambda8 maxFullscreenAdImplExternalSyntheticLambda8) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (MaxFullscreenAdImplExternalSyntheticLambda8) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{function1, maxFullscreenAdImplExternalSyntheticLambda8}, -1445020682, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1445020695);
    }

    public final boolean IAuthTabCallback(@NotNull r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs r8lambdakxm8vml8ayvtemvtk3wjevwfnzs, @Nullable ReactHost reactHost) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, r8lambdakxm8vml8ayvtemvtk3wjevwfnzs, reactHost}, -530029191, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 530029194)).booleanValue();
    }

    public final boolean IAuthTabCallback(@NotNull n3 n3Var) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, n3Var}, 568447579, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -568447574)).booleanValue();
    }

    public final String ICustomTabsCallback_Parcel() {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (String) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -762434377, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 762434409);
    }

    public final n6 newSessionWithExtras() {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (n6) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -1098765882, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1098765903);
    }

    public final void setEngagementSignalsCallback() throws Throwable {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -175434431, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 175434473);
    }

    public final boolean onExtraCallback(@NotNull n3 n3Var) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, n3Var}, 723802931, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -723802903)).booleanValue();
    }

    public final void requestPostMessageChannel() throws Throwable {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, 1151264880, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -1151264837);
    }

    public final boolean onExtraCallbackWithResult(@NotNull n3 n3Var) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, n3Var}, -1078647555, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1078647594)).booleanValue();
    }

    public final void warmup() throws Throwable {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -1374557537, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1374557543);
    }

    public final boolean ICustomTabsServiceStub() {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, 88603106, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -88603105)).booleanValue();
    }

    static void writeTypedList() {
        IEngagementSignalsCallback = -4976167988456526063L;
    }
}
