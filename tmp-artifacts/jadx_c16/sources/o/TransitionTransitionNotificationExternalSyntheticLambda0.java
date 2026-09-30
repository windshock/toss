package o;

import android.app.Application;
import dagger.Lazy;
import im.toss.TossApplication;
import im.toss.features.teens.cvscash.CvsCashTransactionActivity$;
import im.toss.realmdb.RealmDbManager;
import im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleFileManager;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class TransitionTransitionNotificationExternalSyntheticLambda0 implements setSize<TossApplication> {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = ~((~i3) | i8);
        int i10 = i3 | i8;
        int i11 = i2 + i5 + i4 + ((-189913888) * i6) + ((-1809372279) * i);
        int i12 = i11 * i11;
        int i13 = (((-554582804) * i2) - 1671495680) + (10634006 * i5) + (i7 * 282608405) + (282608405 * i9) + ((-282608405) * i10) + ((-271974400) * i4) + (952107008 * i6) + (1092222976 * i) + ((-70844416) * i12);
        int i14 = (i2 * 986545540) + 223666697 + (i5 * 986543778) + (i7 * (-881)) + (i9 * (-881)) + (i10 * 881) + (i4 * 986544659) + (i6 * 1843362976) + (i * (-1872984789)) + (i12 * (-2050686976));
        switch (i13 + (i14 * i14 * 1179713536)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                TossApplication tossApplication = (TossApplication) objArr[0];
                Lazy lazy = (Lazy) objArr[1];
                int i15 = 2 % 2;
                int i16 = onExtraCallback + 11;
                onNavigationEvent = i16 % 128;
                int i17 = i16 % 2;
                tossApplication.debugOverlayStarter = lazy;
                int i18 = onExtraCallback + 85;
                onNavigationEvent = i18 % 128;
                int i19 = i18 % 2;
                return null;
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return asInterface(objArr);
            case 11:
                return IAuthTabCallbackStubProxy(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static void onNavigationEvent$cbf5a00(TossApplication tossApplication, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.appGuard = obj;
        int i4 = onNavigationEvent + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static void onWarmupCompleted(TossApplication tossApplication, wie2 wie2Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.json = wie2Var;
        int i4 = onNavigationEvent + 67;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
    }

    public static void onWarmupCompleted(TossApplication tossApplication, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.environments = zzadVar;
        int i4 = onNavigationEvent + 65;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void requestPostMessageChannel(TossApplication tossApplication, Lazy<RealDrawScopeSizeResolversizeinlinedmapNotNull121> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.tossLib = lazy;
        int i4 = onExtraCallback + 41;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        Lazy lazy = (Lazy) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.seedKey = lazy;
        int i4 = onNavigationEvent + 71;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static void onGreatestScrollPercentageIncreased(TossApplication tossApplication, Lazy<ConstraintsSizeResolverExternalSyntheticLambda0> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.unique = lazy;
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
    }

    public static void onRelationshipValidationResult(TossApplication tossApplication, Lazy<RealmDbManager> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.realmDbManager = lazy;
        int i4 = onNavigationEvent + 117;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void IAuthTabCallbackStubProxy(TossApplication tossApplication, Lazy<ALCFaceSDK4ExternalSyntheticLambda1> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        tossApplication.localTubaVarsV1Source = lazy;
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 69;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static void IAuthTabCallbackDefault(TossApplication tossApplication, Lazy<ALCFaceSDK4ExternalSyntheticLambda1> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.debugTubaVarsV1Source = lazy;
        if (i3 == 0) {
            throw null;
        }
    }

    public static void ICustomTabsService_Parcel(TossApplication tossApplication, Lazy<TextRoundCornerProgressBarSavedState1> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.tubaVarsOrigin = lazy;
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        Lazy lazy = (Lazy) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.appLockChecker = lazy;
        if (i3 == 0) {
            return null;
        }
        int i4 = 2 / 0;
        return null;
    }

    public static void getInterfaceDescriptor(TossApplication tossApplication, Lazy<GetInputImageFromPathAsGrayScale> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.logCentreFetcher = lazy;
        int i4 = onExtraCallback + 101;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void ICustomTabsServiceStub(TossApplication tossApplication, Lazy<r8lambdaHDAe14RP_YfkbgNStt68qt10Iow> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.tossReactDistributionGroupManager = lazy;
        int i4 = onNavigationEvent + 45;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static void ICustomTabsServiceStubProxy(TossApplication tossApplication, Lazy<getBreadcrumbs> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.tossWebSocket = lazy;
        int i4 = onExtraCallback + 111;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void warmup(TossApplication tossApplication, Lazy<MessageQueueThreadImplCompanionExternalSyntheticLambda0> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.tossShakeManager = lazy;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 49;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void IAuthTabCallbackStub(TossApplication tossApplication, Lazy<onAccuracyChanged> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.badNotificationCrashRecorder = lazy;
        if (i3 == 0) {
            throw null;
        }
    }

    public static void onMinimized(TossApplication tossApplication, Lazy<trackCheckout> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.notificationHelper = lazy;
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
    }

    public static void onSessionEnded(TossApplication tossApplication, Lazy<LongPressTextDragObserverKtExternalSyntheticLambda0> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        tossApplication.workerFactory = lazy;
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 59;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static void onWarmupCompleted(TossApplication tossApplication, Lazy<copyFile> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.appsFlyerManager = lazy;
        int i4 = onNavigationEvent + 61;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void ICustomTabsCallbackStub(TossApplication tossApplication, Lazy<initView> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.sdkConsentGatekeeper = lazy;
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        int i5 = onExtraCallback + 85;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static void onUnminimized(TossApplication tossApplication, Lazy<initLayout> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.sdkConsentGate = lazy;
        int i4 = onExtraCallback + 53;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void mayLaunchUrl(TossApplication tossApplication, Lazy<AFj1mSDKExternalSyntheticLambda1> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.sdkConsentServerSync = lazy;
        int i4 = onNavigationEvent + 79;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        Lazy lazy = (Lazy) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.tossTracker = lazy;
        if (i3 != 0) {
            return null;
        }
        int i4 = 42 / 0;
        return null;
    }

    public static void newSessionWithExtras(TossApplication tossApplication, Lazy<ComputeDistance> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.tossBankTracker = lazy;
        int i4 = onNavigationEvent + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void validateRelationship(TossApplication tossApplication, Lazy<ComputeDistance> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.tossSecTracker = lazy;
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
    }

    public static void onActivityResized(TossApplication tossApplication, Lazy<DetectFaceInSingleImage> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.paramMapBuilder = lazy;
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void IAuthTabCallback_Parcel(TossApplication tossApplication, Lazy<Map<String, ComputeDistances>> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.logStoreProviders = lazy;
        if (i3 != 0) {
            throw null;
        }
    }

    public static void newAuthTabSession(TossApplication tossApplication, Lazy<zzag> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        tossApplication.tossClock = lazy;
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallback + 93;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static void extraCallback(TossApplication tossApplication, Lazy<setSegmentCollection> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.loginUtil = lazy;
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void access000(TossApplication tossApplication, Lazy<setAdUnitIds> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.loginStatus = lazy;
        if (i3 == 0) {
            throw null;
        }
    }

    public static void extraCommand(TossApplication tossApplication, Lazy<Q0> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.sessionStateManager = lazy;
        if (i3 != 0) {
            throw null;
        }
    }

    public static void ICustomTabsCallbackDefault(TossApplication tossApplication, Lazy<MaxAdViewImplExternalSyntheticLambda3> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.reactInitializer = lazy;
        if (i3 == 0) {
            throw null;
        }
    }

    public static void onActivityLayout(TossApplication tossApplication, Lazy<onInterstitialAdDisplayFailed> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.portalRuntime = lazy;
        if (i3 == 0) {
            throw null;
        }
    }

    public static void writeTypedObject(TossApplication tossApplication, Lazy<r8lambdau761TBYkUBsjAjCwmNCBjUIxcpI> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.monoHermesFlagSessionObserver = lazy;
        if (i3 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        Lazy lazy = (Lazy) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.tossMessageHandlerPoolSet = lazy;
        if (i3 == 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 57;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static void onPostMessage(TossApplication tossApplication, Lazy<TextRoundCornerProgressBarSavedState1> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.oneClickLoginPrefs = lazy;
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
    }

    public static void ICustomTabsCallback(TossApplication tossApplication, Lazy<setCommonNetworkProxy> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.loginTokenStore = lazy;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void extraCallbackWithResult(TossApplication tossApplication, Lazy<getBizCode> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.loginTokenShortcutRepository = lazy;
        if (i3 == 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        Lazy lazy = (Lazy) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        tossApplication.overseasPaymentNotificationManager = lazy;
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 101;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static void access100(TossApplication tossApplication, Lazy<setLargePhotoHeight> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.kakaoLoginInterface = lazy;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        Lazy lazy = (Lazy) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        tossApplication.tossRouter = lazy;
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        Lazy lazy = (Lazy) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        tossApplication.tossWebKitInitializer = lazy;
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 71;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static void postMessage(TossApplication tossApplication, Lazy<GyrShakeHelper> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.tossBankLoggingPolicy = lazy;
        int i4 = onExtraCallback + 27;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
    }

    public static void onTransact(TossApplication tossApplication, Lazy<Application.ActivityLifecycleCallbacks> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.appsInTossLifecycleCallback = lazy;
        if (i3 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        Lazy lazy = (Lazy) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.multiLanguageResourceManager = lazy;
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    public static void onExtraCallbackWithResult(TossApplication tossApplication, Lazy<drawTextProgressColor> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.appLaunchTracer = lazy;
        int i4 = onNavigationEvent + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void prefetchWithMultipleUrls(TossApplication tossApplication, Lazy<getTextProgressSize> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.tossObservability = lazy;
        int i4 = onExtraCallback + 35;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
    }

    public static void requestPostMessageChannelWithExtras(TossApplication tossApplication, Lazy<setTextProgressColor> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        tossApplication.tossObservabilityTraceContextCookieInjector = lazy;
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static void prefetch(TossApplication tossApplication, Lazy<applyTransparentTitle> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.tossDynamicFeatureManager = lazy;
        int i4 = onExtraCallback + 61;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        Lazy lazy = (Lazy) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.tossShortcutManager = lazy;
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallback + 95;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static void onNavigationEvent(TossApplication tossApplication, Lazy<setUsed> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.appWidgetProvider = lazy;
        int i4 = onExtraCallback + 5;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void ICustomTabsServiceDefault(TossApplication tossApplication, Lazy<getPricingPhaseList> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.tossRegion = lazy;
        int i4 = onExtraCallback + 21;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void IAuthTabCallback(TossApplication tossApplication, Lazy<bd> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.appLaunchTtidLogger = lazy;
        if (i3 != 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 95;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
    }

    public static void ICustomTabsCallbackStubProxy(TossApplication tossApplication, Lazy<ReactBundleFileManager> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.reactBundleFileManager = lazy;
        int i4 = onExtraCallback + 89;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        Lazy lazy = (Lazy) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.serviceGator = lazy;
        int i4 = onNavigationEvent + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static void newSession(TossApplication tossApplication, Lazy<InstallReferrerClientBuilder> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.tossLeakCanaryConfig = lazy;
        int i4 = onExtraCallback + 27;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        TossApplication tossApplication = (TossApplication) objArr[0];
        Lazy lazy = (Lazy) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.tmoneyConf = lazy;
        int i4 = onNavigationEvent + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static void setEngagementSignalsCallback(TossApplication tossApplication, Lazy<r8lambdaF7l2UkPdwiCLhfrtCKGQ5JqM> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.tossPushInitializer = lazy;
        int i4 = onExtraCallback + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void asBinder(TossApplication tossApplication, Lazy<isJacksonCreator> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tossApplication.authUiConfig = lazy;
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        int i5 = onExtraCallback + 5;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void onExtraCallback(TossApplication tossApplication, Lazy<isBluetoothEnabled> lazy) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        onExtraCallbackWithResult(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 81431041, iOnWarmupCompleted, iOnWarmupCompleted2, -81431035, new Object[]{tossApplication, lazy}, iOnWarmupCompleted3);
    }

    public static void asInterface(TossApplication tossApplication, Lazy<Object> lazy) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        onExtraCallbackWithResult(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 2054902125, iOnWarmupCompleted, iOnWarmupCompleted2, -2054902118, new Object[]{tossApplication, lazy}, iOnWarmupCompleted3);
    }

    public static void readTypedObject(TossApplication tossApplication, Lazy<ProductDetailsPricingPhase> lazy) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        onExtraCallbackWithResult(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -854299405, iOnWarmupCompleted, iOnWarmupCompleted2, 854299405, new Object[]{tossApplication, lazy}, iOnWarmupCompleted3);
    }

    public static void onMessageChannelReady(TossApplication tossApplication, Lazy<registerStatusListener> lazy) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        onExtraCallbackWithResult(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 831539475, iOnWarmupCompleted, iOnWarmupCompleted2, -831539471, new Object[]{tossApplication, lazy}, iOnWarmupCompleted3);
    }

    public static void ICustomTabsCallback_Parcel(TossApplication tossApplication, Lazy<AsyncImagePainterExternalSyntheticLambda0> lazy) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        onExtraCallbackWithResult(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -955565311, iOnWarmupCompleted, iOnWarmupCompleted2, 955565316, new Object[]{tossApplication, lazy}, iOnWarmupCompleted3);
    }

    public static void isEngagementSignalsApiAvailable(TossApplication tossApplication, Lazy<GriverDecodeUrl21> lazy) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        onExtraCallbackWithResult(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -1698404540, iOnWarmupCompleted, iOnWarmupCompleted2, 1698404543, new Object[]{tossApplication, lazy}, iOnWarmupCompleted3);
    }

    public static void ICustomTabsService(TossApplication tossApplication, Lazy<GriverEmbedWebViewJsApiPermissionProxyImpl1> lazy) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        onExtraCallbackWithResult(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -1278294198, iOnWarmupCompleted, iOnWarmupCompleted2, 1278294209, new Object[]{tossApplication, lazy}, iOnWarmupCompleted3);
    }

    public static void receiveFile(TossApplication tossApplication, Lazy<calculateMaxTextSize> lazy) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        onExtraCallbackWithResult(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -1000329814, iOnWarmupCompleted, iOnWarmupCompleted2, 1000329823, new Object[]{tossApplication, lazy}, iOnWarmupCompleted3);
    }

    public static void updateVisuals(TossApplication tossApplication, Lazy<SessionTrackerb> lazy) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        onExtraCallbackWithResult(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -1611977963, iOnWarmupCompleted, iOnWarmupCompleted2, 1611977964, new Object[]{tossApplication, lazy}, iOnWarmupCompleted3);
    }

    public static void IEngagementSignalsCallback(TossApplication tossApplication, Lazy<UST_CERT_SetTrustRootCACert> lazy) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        onExtraCallbackWithResult(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 1316301658, iOnWarmupCompleted, iOnWarmupCompleted2, -1316301650, new Object[]{tossApplication, lazy}, iOnWarmupCompleted3);
    }

    public static void writeTypedList(TossApplication tossApplication, Lazy<RetrofitService> lazy) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        onExtraCallbackWithResult(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 806805052, iOnWarmupCompleted, iOnWarmupCompleted2, -806805050, new Object[]{tossApplication, lazy}, iOnWarmupCompleted3);
    }

    public static void access200(TossApplication tossApplication, Lazy<addMetadata> lazy) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        onExtraCallbackWithResult(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 682762518, iOnWarmupCompleted, iOnWarmupCompleted2, -682762508, new Object[]{tossApplication, lazy}, iOnWarmupCompleted3);
    }
}
