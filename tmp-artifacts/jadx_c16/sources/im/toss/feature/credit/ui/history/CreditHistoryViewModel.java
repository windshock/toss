package im.toss.feature.credit.ui.history;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.ViewModel;
import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import gatewayprotocol.v1.AdResponseKtKt;
import im.toss.feature.credit.ui.history.CreditHistoryViewModel$trackQuizImpression$1$;
import im.toss.features.credit.data.entity.RequestBannerType;
import im.toss.features.credit.data.request.CreditAdsBannerRequest;
import im.toss.features.credit.data.response.CreditAdsBannerResponse;
import im.toss.features.credit.data.response.CreditHistoryContentsResponse;
import im.toss.features.credit.data.response.CreditHistoryResponse;
import im.toss.features.credit.data.response.CreditLoanNeedsResponse;
import im.toss.features.credit.data.response.DisclaimerV2;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.splittarget.impl.fsm.AppStateImpl$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CloseableUtils;
import o.CommonModule_closeView;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.GeckoHubImp;
import o.LifeCycleBlockOptimizeEventTracker2;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.SetDetectableSize;
import o.TextLinkScopeExternalSyntheticLambda7;
import o.TextRoundCornerProgressBarSavedState1;
import o.WebResourceResponseModel;
import o.WifiConnectorExternalSyntheticApiModelOutline0;
import o.WifiConnectorExternalSyntheticApiModelOutline1;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.addPolicy;
import o.enableAudioDjangoExecutorOpt;
import o.enableGetInstalledPackageInIOThread;
import o.enableNebulaServiceInitOpt;
import o.enableOrientationOpt;
import o.enableSwitch;
import o.findResAndMsg;
import o.formatMsgs;
import o.getAppAlias;
import o.getBorderRadius;
import o.getCornerRadius;
import o.getFrameworkThreadPoolOptSwitch;
import o.getQuinoxOptAsynctask;
import o.getShine;
import o.getSupportedHighSpeedResolutionsFor;
import o.getTileModeX;
import o.maybeUpdateAnimatable;
import o.networkInfoOpt;
import o.onAvailable;
import o.onUnavailable;
import o.optimizeEventThreadOpt;
import o.putChannelInfo;
import o.setRandomHost;
import o.setRubIn;
import o.setShine;
import o.supportH5PreCache;
import o.ycxycx;
import o.zzad;
import o.zzag;
import o.zzaz;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditHistoryViewModel extends ViewModel {
    public static final onNavigationEvent Companion = new onNavigationEvent((DefaultConstructorMarker) null);
    public static final int IAuthTabCallback = 8;
    private static int ICustomTabsService = 0;
    private static int extraCommand = 0;
    private static int mayLaunchUrl = 1;
    private static int newSession = 1;
    private Integer IAuthTabCallbackDefault;
    private final getTileModeX<getQuinoxOptAsynctask> IAuthTabCallbackStub;
    private final setRubIn<LifeCycleBlockOptimizeEventTracker2> IAuthTabCallbackStubProxy;
    private final getAppAlias IAuthTabCallback_Parcel;
    private final TextLinkScopeExternalSyntheticLambda7 ICustomTabsCallback;
    private final enableOrientationOpt ICustomTabsCallbackDefault;
    private CreditLoanNeedsResponse ICustomTabsCallbackStub;
    private onExtraCallbackWithResult ICustomTabsCallbackStubProxy;
    private final zzag ICustomTabsCallback_Parcel;
    private final enableGetInstalledPackageInIOThread access000;
    private final getTileModeX<getFrameworkThreadPoolOptSwitch> access100;
    private List<onAvailable> asBinder;
    private String asInterface;
    private boolean extraCallback;
    private final zzad extraCallbackWithResult;
    private final enableNebulaServiceInitOpt getInterfaceDescriptor;
    private DisclaimerV2 isEngagementSignalsApiAvailable;
    private final boolean onActivityLayout;
    private final boolean onActivityResized;
    private final getBorderRadius<getFrameworkThreadPoolOptSwitch> onExtraCallback;
    private final getCornerRadius<LifeCycleBlockOptimizeEventTracker2> onExtraCallbackWithResult;
    private enableAudioDjangoExecutorOpt onMessageChannelReady;
    private boolean onMinimized;
    private final getSupportedHighSpeedResolutionsFor<Boolean> onNavigationEvent;
    private boolean onPostMessage;
    private String onRelationshipValidationResult;
    private final getSupportedHighSpeedResolutionsFor<Boolean> onTransact;
    private List<onAvailable> onUnminimized;
    private final getBorderRadius<getQuinoxOptAsynctask> onWarmupCompleted;
    private DisclaimerV2 readTypedObject;
    private int writeTypedObject;

    static final class IAuthTabCallbackStub extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = CreditHistoryViewModel.onWarmupCompleted(CreditHistoryViewModel.this, (access13800) this);
            if (i3 != 0) {
                int i4 = 82 / 0;
            }
            return objOnWarmupCompleted;
        }
    }

    static final class asBinder extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objOnWarmupCompleted = CreditHistoryViewModel.onWarmupCompleted(CreditHistoryViewModel.this, null, this);
            int i4 = onWarmupCompleted + 7;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static final class onTransact extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = CreditHistoryViewModel.onExtraCallbackWithResult(CreditHistoryViewModel.this, (access13800) this);
            if (objOnExtraCallbackWithResult != access14300.onWarmupCompleted()) {
                return Result.IAuthTabCallback(objOnExtraCallbackWithResult);
            }
            int i2 = IAuthTabCallback;
            int i3 = i2 + 99;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i4 = i2 + 103;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    static {
        int i = mayLaunchUrl + 15;
        extraCommand = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = (~((~i2) | i8)) | i9;
        int i11 = i6 | i3;
        int i12 = (~(i2 | i8)) | i9;
        int i13 = i6 + i3 + i5 + (1258674323 * i) + ((-126594725) * i4);
        int i14 = i13 * i13;
        int i15 = ((-1449289074) * i6) + 1954676736 + ((-212912869) * i3) + (i10 * (-1236376205)) + (i11 * (-1236376205)) + ((-1236376205) * i12) + (1609302016 * i5) + (881065984 * i) + ((-991690752) * i4) + ((-541982720) * i14);
        int i16 = ((i6 * (-1656160718)) - 817430035) + (i3 * (-1656161339)) + (i10 * 621) + (i11 * 621) + (i12 * 621) + (i5 * (-1656160097)) + (i * (-2121497779)) + (i4 * 1378977669) + (i14 * (-275906560));
        switch (i15 + (i16 * i16 * (-372375552))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                CreditHistoryViewModel creditHistoryViewModel = (CreditHistoryViewModel) objArr[0];
                enableAudioDjangoExecutorOpt enableaudiodjangoexecutoropt = (enableAudioDjangoExecutorOpt) objArr[1];
                int i17 = 2 % 2;
                int i18 = ICustomTabsService + 37;
                int i19 = i18 % 128;
                newSession = i19;
                int i20 = i18 % 2;
                creditHistoryViewModel.onMessageChannelReady = enableaudiodjangoexecutoropt;
                int i21 = i19 + 75;
                ICustomTabsService = i21 % 128;
                int i22 = i21 % 2;
                return null;
            case 6:
                return asBinder(objArr);
            case 7:
                CreditHistoryViewModel creditHistoryViewModel2 = (CreditHistoryViewModel) objArr[0];
                int i23 = 2 % 2;
                int i24 = ICustomTabsService;
                int i25 = i24 + 79;
                newSession = i25 % 128;
                int i26 = i25 % 2;
                enableNebulaServiceInitOpt enablenebulaserviceinitopt = creditHistoryViewModel2.getInterfaceDescriptor;
                int i27 = i24 + 25;
                newSession = i27 % 128;
                int i28 = i27 % 2;
                return enablenebulaserviceinitopt;
            case 8:
                return asInterface(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                return onTransact(objArr);
            case 12:
                return access100(objArr);
            case 13:
                return getInterfaceDescriptor(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public CreditHistoryViewModel(@NotNull enableNebulaServiceInitOpt enablenebulaserviceinitopt, boolean z, boolean z2, @NotNull TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7, @NotNull getAppAlias getappalias, @NotNull enableGetInstalledPackageInIOThread enablegetinstalledpackageiniothread, @NotNull enableOrientationOpt enableorientationopt, @NotNull zzag zzagVar, @NotNull zzad zzadVar) {
        Intrinsics.checkNotNullParameter(enablenebulaserviceinitopt, "");
        Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
        Intrinsics.checkNotNullParameter(getappalias, "");
        Intrinsics.checkNotNullParameter(enablegetinstalledpackageiniothread, "");
        Intrinsics.checkNotNullParameter(enableorientationopt, "");
        Intrinsics.checkNotNullParameter(zzagVar, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        this.getInterfaceDescriptor = enablenebulaserviceinitopt;
        this.onActivityResized = z;
        this.onActivityLayout = z2;
        this.ICustomTabsCallback = textLinkScopeExternalSyntheticLambda7;
        this.IAuthTabCallback_Parcel = getappalias;
        this.access000 = enablegetinstalledpackageiniothread;
        this.ICustomTabsCallbackDefault = enableorientationopt;
        this.ICustomTabsCallback_Parcel = zzagVar;
        this.extraCallbackWithResult = zzadVar;
        getCornerRadius<LifeCycleBlockOptimizeEventTracker2> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent((Object) null);
        this.onExtraCallbackWithResult = getcornerradiusOnNavigationEvent;
        this.IAuthTabCallbackStubProxy = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent);
        getBorderRadius<getFrameworkThreadPoolOptSwitch> getborderradiusOnWarmupCompleted = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.onExtraCallback = getborderradiusOnWarmupCompleted;
        this.access100 = ycxycx.onExtraCallbackWithResult(getborderradiusOnWarmupCompleted);
        this.asBinder = CollectionsKt.emptyList();
        this.onRelationshipValidationResult = "";
        this.onUnminimized = CollectionsKt.emptyList();
        getBorderRadius<getQuinoxOptAsynctask> getborderradiusOnWarmupCompleted2 = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.onWarmupCompleted = getborderradiusOnWarmupCompleted2;
        this.IAuthTabCallbackStub = ycxycx.onExtraCallbackWithResult(getborderradiusOnWarmupCompleted2);
        Boolean bool = Boolean.FALSE;
        this.onTransact = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        ICustomTabsCallback_Parcel();
        this.onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CreditHistoryViewModel creditHistoryViewModel = (CreditHistoryViewModel) objArr[0];
        DisclaimerV2 disclaimerV2 = (DisclaimerV2) objArr[1];
        int i = 2 % 2;
        int i2 = newSession + 3;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        creditHistoryViewModel.readTypedObject = disclaimerV2;
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ List IAuthTabCallback(CreditHistoryViewModel creditHistoryViewModel, WifiConnectorExternalSyntheticApiModelOutline0 wifiConnectorExternalSyntheticApiModelOutline0) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 119;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        List<onAvailable> listOnNavigationEvent = creditHistoryViewModel.onNavigationEvent(wifiConnectorExternalSyntheticApiModelOutline0);
        int i4 = ICustomTabsService + 31;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            return listOnNavigationEvent;
        }
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(CreditHistoryViewModel creditHistoryViewModel, List list) {
        int i = 2 % 2;
        int i2 = newSession + 13;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        creditHistoryViewModel.asBinder = list;
        int i5 = i3 + 93;
        newSession = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ getBorderRadius IAuthTabCallbackStub(CreditHistoryViewModel creditHistoryViewModel) {
        int i = 2 % 2;
        int i2 = newSession + 21;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        getBorderRadius<getQuinoxOptAsynctask> getborderradius = creditHistoryViewModel.onWarmupCompleted;
        if (i3 == 0) {
            return getborderradius;
        }
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        CreditHistoryViewModel creditHistoryViewModel = (CreditHistoryViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 69;
        int i3 = i2 % 128;
        newSession = i3;
        int i4 = i2 % 2;
        enableGetInstalledPackageInIOThread enablegetinstalledpackageiniothread = creditHistoryViewModel.access000;
        if (i4 == 0) {
            int i5 = 1 / 0;
        }
        int i6 = i3 + 81;
        ICustomTabsService = i6 % 128;
        if (i6 % 2 == 0) {
            return enablegetinstalledpackageiniothread;
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        CreditHistoryViewModel creditHistoryViewModel = (CreditHistoryViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 23;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        creditHistoryViewModel.ICustomTabsCallbackDefault();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsService + 13;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ getCornerRadius asInterface(CreditHistoryViewModel creditHistoryViewModel) {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 9;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<LifeCycleBlockOptimizeEventTracker2> getcornerradius = creditHistoryViewModel.onExtraCallbackWithResult;
        if (i4 != 0) {
            int i5 = 83 / 0;
        }
        int i6 = i2 + 29;
        ICustomTabsService = i6 % 128;
        if (i6 % 2 == 0) {
            return getcornerradius;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        CreditHistoryViewModel creditHistoryViewModel = (CreditHistoryViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 41;
        int i3 = i2 % 128;
        newSession = i3;
        int i4 = i2 % 2;
        boolean z = creditHistoryViewModel.onActivityResized;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 111;
        ICustomTabsService = i5 % 128;
        if (i5 % 2 == 0) {
            return Boolean.valueOf(z);
        }
        int i6 = 75 / 0;
        return Boolean.valueOf(z);
    }

    public static final /* synthetic */ TextLinkScopeExternalSyntheticLambda7 onExtraCallback(CreditHistoryViewModel creditHistoryViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 81;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7 = creditHistoryViewModel.ICustomTabsCallback;
        if (i4 == 0) {
            int i5 = 93 / 0;
        }
        int i6 = i2 + 117;
        newSession = i6 % 128;
        if (i6 % 2 != 0) {
            return textLinkScopeExternalSyntheticLambda7;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(CreditHistoryViewModel creditHistoryViewModel, int i) {
        int i2 = 2 % 2;
        int i3 = newSession + 73;
        int i4 = i3 % 128;
        ICustomTabsService = i4;
        int i5 = i3 % 2;
        creditHistoryViewModel.writeTypedObject = i;
        int i6 = i4 + 67;
        newSession = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void onExtraCallback(CreditHistoryViewModel creditHistoryViewModel, Integer num) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 9;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        creditHistoryViewModel.IAuthTabCallbackDefault = num;
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(CreditHistoryViewModel creditHistoryViewModel, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = newSession + 59;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        Object objIAuthTabCallback = IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{creditHistoryViewModel, access13800Var}, iOnWarmupCompleted, 129242954, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, -129242950);
        int i4 = ICustomTabsService + 55;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ List onExtraCallbackWithResult(CreditHistoryViewModel creditHistoryViewModel, WifiConnectorExternalSyntheticApiModelOutline0 wifiConnectorExternalSyntheticApiModelOutline0) {
        int i = 2 % 2;
        int i2 = newSession + 21;
        ICustomTabsService = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            creditHistoryViewModel.onExtraCallbackWithResult(wifiConnectorExternalSyntheticApiModelOutline0);
            throw null;
        }
        List<onAvailable> listOnExtraCallbackWithResult = creditHistoryViewModel.onExtraCallbackWithResult(wifiConnectorExternalSyntheticApiModelOutline0);
        int i3 = ICustomTabsService + 117;
        newSession = i3 % 128;
        if (i3 % 2 != 0) {
            return listOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ zzad onExtraCallbackWithResult(CreditHistoryViewModel creditHistoryViewModel) {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 19;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        zzad zzadVar = creditHistoryViewModel.extraCallbackWithResult;
        int i5 = i2 + 25;
        ICustomTabsService = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 33 / 0;
        }
        return zzadVar;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(CreditHistoryViewModel creditHistoryViewModel, String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 75;
        int i3 = i2 % 128;
        newSession = i3;
        int i4 = i2 % 2;
        Object obj = null;
        creditHistoryViewModel.asInterface = str;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 5;
        ICustomTabsService = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        CreditHistoryViewModel creditHistoryViewModel = (CreditHistoryViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = newSession + 77;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        String strOnUnminimized = creditHistoryViewModel.onUnminimized();
        if (i3 != 0) {
            int i4 = 9 / 0;
        }
        int i5 = newSession + 23;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
        return strOnUnminimized;
    }

    public static final /* synthetic */ getAppAlias onNavigationEvent(CreditHistoryViewModel creditHistoryViewModel) {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 75;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        getAppAlias getappalias = creditHistoryViewModel.IAuthTabCallback_Parcel;
        int i5 = i2 + 65;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
        return getappalias;
    }

    public static final /* synthetic */ void onNavigationEvent(CreditHistoryViewModel creditHistoryViewModel, List list) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 69;
        int i3 = i2 % 128;
        newSession = i3;
        int i4 = i2 % 2;
        creditHistoryViewModel.onUnminimized = list;
        if (i4 == 0) {
            int i5 = 65 / 0;
        }
        int i6 = i3 + 9;
        ICustomTabsService = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        CreditHistoryViewModel creditHistoryViewModel = (CreditHistoryViewModel) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = ICustomTabsService + 21;
        int i3 = i2 % 128;
        newSession = i3;
        int i4 = i2 % 2;
        Object obj = null;
        creditHistoryViewModel.onMinimized = zBooleanValue;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 39;
        ICustomTabsService = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ getBorderRadius onTransact(CreditHistoryViewModel creditHistoryViewModel) {
        int i = 2 % 2;
        int i2 = newSession + 17;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        getBorderRadius<getFrameworkThreadPoolOptSwitch> getborderradius = creditHistoryViewModel.onExtraCallback;
        if (i4 != 0) {
            int i5 = 63 / 0;
        }
        int i6 = i3 + 95;
        newSession = i6 % 128;
        int i7 = i6 % 2;
        return getborderradius;
    }

    public static final /* synthetic */ Object onWarmupCompleted(CreditHistoryViewModel creditHistoryViewModel, WifiConnectorExternalSyntheticApiModelOutline0 wifiConnectorExternalSyntheticApiModelOutline0, access13800 access13800Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = newSession + 93;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = creditHistoryViewModel.onExtraCallback(wifiConnectorExternalSyntheticApiModelOutline0, (access13800<? super onUnavailable>) access13800Var);
        int i4 = ICustomTabsService + 21;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    public static final /* synthetic */ Object onWarmupCompleted(CreditHistoryViewModel creditHistoryViewModel, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 55;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = creditHistoryViewModel.onExtraCallbackWithResult((access13800<? super CreditHistoryContentsResponse>) access13800Var);
        int i4 = newSession + 15;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreditHistoryViewModel creditHistoryViewModel = (CreditHistoryViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = newSession + 43;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsEngagementSignalsApiAvailable = creditHistoryViewModel.isEngagementSignalsApiAvailable();
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        int i5 = newSession + 69;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
        return Boolean.valueOf(zIsEngagementSignalsApiAvailable);
    }

    public static final /* synthetic */ List onWarmupCompleted(CreditHistoryViewModel creditHistoryViewModel, List list) {
        int i = 2 % 2;
        int i2 = newSession + 57;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        List<onAvailable> listOnWarmupCompleted = creditHistoryViewModel.onWarmupCompleted((List<onAvailable>) list);
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
        int i5 = ICustomTabsService + 65;
        newSession = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return listOnWarmupCompleted;
    }

    public static final /* synthetic */ enableAudioDjangoExecutorOpt onWarmupCompleted(CreditHistoryViewModel creditHistoryViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 85;
        int i3 = i2 % 128;
        newSession = i3;
        int i4 = i2 % 2;
        enableAudioDjangoExecutorOpt enableaudiodjangoexecutoropt = creditHistoryViewModel.onMessageChannelReady;
        int i5 = i3 + 33;
        ICustomTabsService = i5 % 128;
        if (i5 % 2 == 0) {
            return enableaudiodjangoexecutoropt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(CreditHistoryViewModel creditHistoryViewModel, onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = newSession + 27;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        creditHistoryViewModel.ICustomTabsCallbackStubProxy = onextracallbackwithresult;
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(CreditHistoryViewModel creditHistoryViewModel, DisclaimerV2 disclaimerV2) {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 59;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        creditHistoryViewModel.isEngagementSignalsApiAvailable = disclaimerV2;
        int i5 = i2 + 27;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(CreditHistoryViewModel creditHistoryViewModel, String str) {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 121;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        creditHistoryViewModel.onRelationshipValidationResult = str;
        int i5 = i2 + 7;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(CreditHistoryViewModel creditHistoryViewModel, boolean z) {
        int i = 2 % 2;
        int i2 = newSession + 103;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        creditHistoryViewModel.onPostMessage = z;
        if (i3 != 0) {
            throw null;
        }
    }

    public final boolean extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 57;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onActivityLayout;
        int i5 = i2 + 13;
        newSession = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final CreditLoanNeedsResponse access100() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 77;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        CreditLoanNeedsResponse creditLoanNeedsResponse = this.ICustomTabsCallbackStub;
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        return creditLoanNeedsResponse;
    }

    public final void onExtraCallback(@Nullable CreditLoanNeedsResponse creditLoanNeedsResponse) {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 109;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.ICustomTabsCallbackStub = creditLoanNeedsResponse;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 93;
        ICustomTabsService = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final setRubIn<LifeCycleBlockOptimizeEventTracker2> asInterface() {
        int i = 2 % 2;
        int i2 = newSession + 107;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackStubProxy;
        }
        throw null;
    }

    public final getTileModeX<getFrameworkThreadPoolOptSwitch> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = newSession + 59;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            return this.access100;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int asBinder() {
        int i;
        int i2 = 2 % 2;
        int i3 = newSession + 67;
        int i4 = i3 % 128;
        ICustomTabsService = i4;
        if (i3 % 2 != 0) {
            i = this.writeTypedObject;
            int i5 = 70 / 0;
        } else {
            i = this.writeTypedObject;
        }
        int i6 = i4 + 87;
        newSession = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final boolean ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 87;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onMinimized;
        int i5 = i2 + 35;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 105;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        String str = this.asInterface;
        int i5 = i2 + 83;
        newSession = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        CreditHistoryViewModel creditHistoryViewModel = (CreditHistoryViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 7;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        List<onAvailable> list = creditHistoryViewModel.asBinder;
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        return list;
    }

    public final Integer onExtraCallback() {
        int i = 2 % 2;
        int i2 = newSession + 73;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        Integer num = this.IAuthTabCallbackDefault;
        int i5 = i3 + 125;
        newSession = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean writeTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 109;
        int i3 = i2 % 128;
        newSession = i3;
        int i4 = i2 % 2;
        boolean z = this.onPostMessage;
        int i5 = i3 + 9;
        ICustomTabsService = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = newSession + 69;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        String str = this.onRelationshipValidationResult;
        int i5 = i3 + 121;
        newSession = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return str;
    }

    public final DisclaimerV2 extraCallback() {
        DisclaimerV2 disclaimerV2;
        int i = 2 % 2;
        int i2 = newSession + 9;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        if (i2 % 2 != 0) {
            disclaimerV2 = this.isEngagementSignalsApiAvailable;
            int i4 = 37 / 0;
        } else {
            disclaimerV2 = this.isEngagementSignalsApiAvailable;
        }
        int i5 = i3 + 95;
        newSession = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 34 / 0;
        }
        return disclaimerV2;
    }

    public final DisclaimerV2 IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = newSession + 93;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        DisclaimerV2 disclaimerV2 = this.readTypedObject;
        int i5 = i3 + 67;
        newSession = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return disclaimerV2;
    }

    public final getTileModeX<getQuinoxOptAsynctask> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 81;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        getTileModeX<getQuinoxOptAsynctask> gettilemodex = this.IAuthTabCallbackStub;
        int i5 = i2 + 119;
        newSession = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return gettilemodex;
    }

    public final boolean access000() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 69;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.onTransact.onExtraCallbackWithResult()).booleanValue();
        int i4 = newSession + 5;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return zBooleanValue;
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 53557;
        private static int asInterface = 1;
        private static char onExtraCallback = 19487;
        private static char onExtraCallbackWithResult = 37695;
        private static char onNavigationEvent = 7279;
        private static int onWarmupCompleted;
        int label;

        IAuthTabCallbackStubProxy(access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
        }

        public static /* synthetic */ Unit onWarmupCompleted(CreditHistoryViewModel creditHistoryViewModel, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(creditHistoryViewModel, setDetectableSize);
            if (i3 != 0) {
                int i4 = 9 / 0;
            }
            int i5 = onWarmupCompleted + 33;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return unitOnNavigationEvent;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = asInterface + 51;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = CreditHistoryViewModel.this.new IAuthTabCallbackStubProxy(access13800Var);
            int i2 = asInterface + 67;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallbackStubProxy;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = asInterface + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = asInterface + 103;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
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
                    int i6 = $10 + 63;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i8 = i5;
                    int i9 = (c2 + i4) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                    int i10 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                        objArr2[2] = Integer.valueOf(i10);
                        objArr2[1] = Integer.valueOf(i9);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 10;
                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12434;
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(keyRepeatDelay, packedPositionGroup, scrollDefaultDelay, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 12434 - (ViewConfiguration.getFadingEdgeLength() >> 16), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i4 -= 40503;
                        i5 = i8 + 1;
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 16014), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14, 19901 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i11 = $11 + 63;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr3 = cArr5;
                i3 = 0;
            }
            String str = new String(cArr2, 0, i);
            int i13 = $10 + 99;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = asInterface + 11;
            onWarmupCompleted = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (CreditHistoryViewModel.onWarmupCompleted(CreditHistoryViewModel.this) != null) {
                ConvertByteArrayToFloatArray.onExtraCallback(1266243L, false, (String) null, (Map) null, new CreditHistoryViewModel$trackQuizImpression$1$.ExternalSyntheticLambda0(CreditHistoryViewModel.this), 14, (Object) null);
                CreditHistoryViewModel.IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{CreditHistoryViewModel.this, null}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 586903991, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -586903986);
                int i3 = onWarmupCompleted + 15;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
            }
            return Unit.INSTANCE;
        }

        private static final Unit onNavigationEvent(CreditHistoryViewModel creditHistoryViewModel, SetDetectableSize setDetectableSize) throws Throwable {
            List listOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{45449, 24744, 23880, 14207, 14226, 4974, 21639, 8575}, 8 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7OnExtraCallback = CreditHistoryViewModel.onExtraCallback(creditHistoryViewModel);
            Object[] objArr2 = new Object[1];
            a(new char[]{45449, 24744, 23880, 14207, 14226, 4974, 21639, 8575}, ((Process.getThreadPriority(0) + 20) >> 6) + 8, objArr2);
            setDetectableSize.onExtraCallback(strIntern, textLinkScopeExternalSyntheticLambda7OnExtraCallback.onExtraCallback(((String) objArr2[0]).intern()));
            enableAudioDjangoExecutorOpt enableaudiodjangoexecutoroptOnWarmupCompleted = CreditHistoryViewModel.onWarmupCompleted(creditHistoryViewModel);
            Integer numValueOf = null;
            setDetectableSize.onExtraCallback("available_yn", enableaudiodjangoexecutoroptOnWarmupCompleted != null ? zzaz.onExtraCallbackWithResult(enableaudiodjangoexecutoroptOnWarmupCompleted.onNavigationEvent()) : null);
            enableAudioDjangoExecutorOpt enableaudiodjangoexecutoroptOnWarmupCompleted2 = CreditHistoryViewModel.onWarmupCompleted(creditHistoryViewModel);
            if (enableaudiodjangoexecutoroptOnWarmupCompleted2 != null && (listOnExtraCallbackWithResult = enableaudiodjangoexecutoroptOnWarmupCompleted2.onExtraCallbackWithResult()) != null) {
                int i4 = asInterface + 123;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    Integer.valueOf(listOnExtraCallbackWithResult.size());
                    throw null;
                }
                numValueOf = Integer.valueOf(listOnExtraCallbackWithResult.size());
            }
            setDetectableSize.onExtraCallback("remain_quiz_cnt", numValueOf);
            Unit unit = Unit.INSTANCE;
            int i5 = onWarmupCompleted + 13;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }
    }

    public final void onActivityLayout() {
        int i = 2 % 2;
        int i2 = newSession + 87;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        this.ICustomTabsCallbackStubProxy = onExtraCallbackWithResult.RETRY_SUCCESS;
        ICustomTabsCallback_Parcel();
        int i4 = newSession + 77;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean onWarmupCompleted(@NotNull onExtraCallbackWithResult onextracallbackwithresult) {
        boolean z;
        int i = 2 % 2;
        int i2 = newSession + 79;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (this.ICustomTabsCallbackStubProxy == onextracallbackwithresult) {
            int i4 = newSession + 113;
            ICustomTabsService = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i6 = newSession + 119;
            ICustomTabsService = i6 % 128;
            int i7 = i6 % 2;
            this.ICustomTabsCallbackStubProxy = null;
        }
        int i8 = newSession + 107;
        ICustomTabsService = i8 % 128;
        int i9 = i8 % 2;
        return z;
    }

    private final void ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new getInterfaceDescriptor(this, (access13800) null), 3, (Object) null);
        int i2 = newSession + 99;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends CreditAdsBannerResponse>>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ CreditAdsBannerRequest $request$inlined;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ CreditHistoryViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(access13800 access13800Var, CreditHistoryViewModel creditHistoryViewModel, CreditAdsBannerRequest creditAdsBannerRequest) {
            super(2, access13800Var);
            this.this$0 = creditHistoryViewModel;
            this.$request$inlined = creditAdsBannerRequest;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(access13800Var, this.this$0, this.$request$inlined);
            int i2 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 11 / 0;
            }
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 52 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super List<? extends CreditAdsBannerResponse>> access13800Var) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                getAppAlias getappaliasOnNavigationEvent = CreditHistoryViewModel.onNavigationEvent(this.this$0);
                CreditAdsBannerRequest creditAdsBannerRequest = this.$request$inlined;
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.label = 1;
                obj = getappaliasOnNavigationEvent.IAuthTabCallback(creditAdsBannerRequest, this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = onExtraCallbackWithResult + 73;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
            try {
                Object objOnTransact = baseApiResponse.onTransact();
                if (objOnTransact != null) {
                    return (List) objOnTransact;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<im.toss.features.credit.data.response.CreditAdsBannerResponse>");
            } catch (NullPointerException e) {
                if (Intrinsics.areEqual(List.class, Object.class) || Intrinsics.areEqual(List.class, Unit.class)) {
                    List list = Unit.INSTANCE;
                    int i4 = onExtraCallbackWithResult + 101;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return list;
                }
                int i6 = onExtraCallbackWithResult + 97;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                throw apiErrorOnExtraCallbackWithResult;
            }
        }
    }

    public static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super CreditHistoryResponse>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ CreditHistoryViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackDefault(access13800 access13800Var, CreditHistoryViewModel creditHistoryViewModel) {
            super(2, access13800Var);
            this.this$0 = creditHistoryViewModel;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(access13800Var, this.this$0);
            int i2 = onExtraCallback + 53;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallbackDefault;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException, TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super CreditHistoryResponse> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = 31 / 0;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super CreditHistoryResponse> access13800Var) throws NoWhenBranchMatchedException, TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefaultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                iAuthTabCallbackDefaultCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallbackDefaultCreate.invokeSuspend(unit);
            int i4 = IAuthTabCallback + 19;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0089, code lost:
        
            if (r13 == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a6, code lost:
        
            if (r13 == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
        
            r13 = im.toss.feature.credit.ui.history.CreditHistoryViewModel.IAuthTabCallbackDefault.onExtraCallback + 85;
            im.toss.feature.credit.ui.history.CreditHistoryViewModel.IAuthTabCallbackDefault.IAuthTabCallback = r13 % 128;
            r13 = r13 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0115, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(im.toss.features.credit.data.response.CreditHistoryResponse.class, kotlin.Unit.class) != false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0120, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(im.toss.features.credit.data.response.CreditHistoryResponse.class, kotlin.Unit.class) != false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0123, code lost:
        
            r0 = im.toss.network.throwable.TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(r1);
            r0.onWarmupCompleted(r13.IAuthTabCallback_Parcel());
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0130, code lost:
        
            throw r0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException, TossApiCallException.ApiError {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    int i3 = IAuthTabCallback + 1;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = IAuthTabCallback + 77;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                int i7 = onWarmupCompleted.IAuthTabCallback[((enableNebulaServiceInitOpt) CreditHistoryViewModel.IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this.this$0}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 757489537, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -757489530)).ordinal()];
                if (i7 != 1) {
                    int i8 = IAuthTabCallback + 101;
                    int i9 = i8 % 128;
                    onExtraCallback = i9;
                    int i10 = i8 % 2;
                    if (i7 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i11 = i9 + 21;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                    getAppAlias getappaliasOnNavigationEvent = CreditHistoryViewModel.onNavigationEvent(this.this$0);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 2;
                    obj = getappaliasOnNavigationEvent.onActivityResized(this);
                } else {
                    getAppAlias getappaliasOnNavigationEvent2 = CreditHistoryViewModel.onNavigationEvent(this.this$0);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = getappaliasOnNavigationEvent2.getInterfaceDescriptor(this);
                }
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
            try {
                Object objOnTransact = baseApiResponse.onTransact();
                if (objOnTransact == null) {
                    throw new NullPointerException("null cannot be cast to non-null type im.toss.features.credit.data.response.CreditHistoryResponse");
                }
                int i13 = onExtraCallback + 15;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                return (CreditHistoryResponse) objOnTransact;
            } catch (NullPointerException e) {
                if (!Intrinsics.areEqual(CreditHistoryResponse.class, Object.class)) {
                    int i15 = onExtraCallback + 49;
                    IAuthTabCallback = i15 % 128;
                    if (i15 % 2 != 0) {
                        int i16 = 65 / 0;
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    public static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super CreditHistoryContentsResponse>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ CreditHistoryViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asInterface(access13800 access13800Var, CreditHistoryViewModel creditHistoryViewModel) {
            super(2, access13800Var);
            this.this$0 = creditHistoryViewModel;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = new asInterface(access13800Var, this.this$0);
            int i2 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return asinterface;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException, TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super CreditHistoryContentsResponse> access13800Var) throws NoWhenBranchMatchedException, TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 86 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
        
            if (r12 == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
        
            if (r12 == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
        
            return r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException, TossApiCallException.ApiError {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 77;
                int i4 = i3 % 128;
                onNavigationEvent = i4;
                int i5 = i3 % 2;
                if (i2 != 1) {
                    int i6 = i4 + 57;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                int i8 = onWarmupCompleted.IAuthTabCallback[((enableNebulaServiceInitOpt) CreditHistoryViewModel.IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this.this$0}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 757489537, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -757489530)).ordinal()];
                if (i8 == 1) {
                    getAppAlias getappaliasOnNavigationEvent = CreditHistoryViewModel.onNavigationEvent(this.this$0);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = getappaliasOnNavigationEvent.extraCallbackWithResult(this);
                } else {
                    if (i8 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    getAppAlias getappaliasOnNavigationEvent2 = CreditHistoryViewModel.onNavigationEvent(this.this$0);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 2;
                    obj = getappaliasOnNavigationEvent2.onPostMessage(this);
                }
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
            Object obj2 = null;
            try {
                Object objOnTransact = baseApiResponse.onTransact();
                if (objOnTransact == null) {
                    throw new NullPointerException("null cannot be cast to non-null type im.toss.features.credit.data.response.CreditHistoryContentsResponse");
                }
                int i9 = onExtraCallbackWithResult + 55;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 == 0) {
                    return (CreditHistoryContentsResponse) objOnTransact;
                }
                obj2.hashCode();
                throw null;
            } catch (NullPointerException e) {
                if (!Intrinsics.areEqual(CreditHistoryContentsResponse.class, Object.class)) {
                    int i10 = onExtraCallbackWithResult + 93;
                    onNavigationEvent = i10 % 128;
                    if (i10 % 2 != 0) {
                        Intrinsics.areEqual(CreditHistoryContentsResponse.class, Unit.class);
                        obj2.hashCode();
                        throw null;
                    }
                    if (!Intrinsics.areEqual(CreditHistoryContentsResponse.class, Unit.class)) {
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    private final void ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new access000(null), 3, (Object) null);
        int i2 = newSession + 5;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        int label;

        access000(access13800<? super access000> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access000 access000Var = CreditHistoryViewModel.this.new access000(access13800Var);
            int i2 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return access000Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            access000 access000VarCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return access000VarCreate.invokeSuspend(Unit.INSTANCE);
            }
            access000VarCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
        
            if (r7.emit(r2, r6) == r1) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
        
            if (r7.emit(r2, r6) == r1) goto L28;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(200L, this) != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            int i3 = onExtraCallbackWithResult + 37;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = i4 + 15;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                int i7 = onNavigationEvent + 101;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj);
            if (enableSwitch.IAuthTabCallback.onExtraCallbackWithResult()) {
                int i9 = onNavigationEvent + 45;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                    getBorderRadius getborderradiusOnTransact = CreditHistoryViewModel.onTransact(CreditHistoryViewModel.this);
                    getFrameworkThreadPoolOptSwitch.IAuthTabCallback iAuthTabCallback = getFrameworkThreadPoolOptSwitch.IAuthTabCallback.onWarmupCompleted;
                    this.label = 2;
                } else {
                    getBorderRadius getborderradiusOnTransact2 = CreditHistoryViewModel.onTransact(CreditHistoryViewModel.this);
                    getFrameworkThreadPoolOptSwitch.IAuthTabCallback iAuthTabCallback2 = getFrameworkThreadPoolOptSwitch.IAuthTabCallback.onWarmupCompleted;
                    this.label = 2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void onPostMessage() {
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new access100(this, (access13800) null), 3, (Object) null);
        int i2 = newSession + 51;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void onRelationshipValidationResult() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStubProxy(null), 3, (Object) null);
        int i2 = ICustomTabsService + 13;
        newSession = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallback(WifiConnectorExternalSyntheticApiModelOutline0 wifiConnectorExternalSyntheticApiModelOutline0, access13800<? super onUnavailable> access13800Var) throws NoWhenBranchMatchedException {
        asBinder asbinder;
        Object obj;
        CreditAdsBannerResponse creditAdsBannerResponse;
        RequestBannerType requestBannerType;
        int i = 2 % 2;
        if (access13800Var instanceof asBinder) {
            asbinder = (asBinder) access13800Var;
            int i2 = asbinder.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                asbinder.label = i2 - 2147483648;
            } else {
                asbinder = new asBinder(access13800Var);
            }
        }
        Object objOnExtraCallback = asbinder.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = asbinder.label;
        onUnavailable onunavailableOnExtraCallback = null;
        try {
            if (i3 == 0) {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                int i4 = onWarmupCompleted.IAuthTabCallback[this.getInterfaceDescriptor.ordinal()];
                if (i4 == 1) {
                    requestBannerType = RequestBannerType.CHANGE_MAIN_KCB;
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    requestBannerType = RequestBannerType.CHANGE_MAIN_NICE;
                }
                CreditAdsBannerRequest creditAdsBannerRequest = new CreditAdsBannerRequest(requestBannerType.name(), access14000.onNavigationEvent(wifiConnectorExternalSyntheticApiModelOutline0.onTransact()), (Integer) null, 4, (DefaultConstructorMarker) null);
                Result.Companion companion = Result.Companion;
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(null, this, creditAdsBannerRequest);
                asbinder.L$0 = access15400.onNavigationEvent(wifiConnectorExternalSyntheticApiModelOutline0);
                asbinder.L$1 = access15400.onNavigationEvent(requestBannerType);
                asbinder.L$2 = access15400.onNavigationEvent(creditAdsBannerRequest);
                asbinder.L$3 = access15400.onNavigationEvent(asbinder);
                asbinder.I$0 = 0;
                asbinder.I$1 = 0;
                asbinder.I$2 = 0;
                asbinder.label = 1;
                objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, iAuthTabCallback, asbinder);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = newSession + 23;
                ICustomTabsService = i5 % 128;
                if (i5 % 2 != 0) {
                    ResultKt.onNavigationEvent(objOnExtraCallback);
                    int i6 = 12 / 0;
                } else {
                    ResultKt.onNavigationEvent(objOnExtraCallback);
                }
            }
            obj = Result.constructor-impl(objOnExtraCallback);
            int i7 = ICustomTabsService + 97;
            newSession = i7 % 128;
            int i8 = i7 % 2;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (WebResourceResponseModel e3) {
            Result.Companion companion3 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(e3));
        }
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null && (creditAdsBannerResponse = (CreditAdsBannerResponse) CollectionsKt.firstOrNull(list)) != null) {
            int i9 = newSession + 81;
            ICustomTabsService = i9 % 128;
            int i10 = i9 % 2;
            onunavailableOnExtraCallback = supportH5PreCache.onExtraCallback(creditAdsBannerResponse);
            if (i10 != 0) {
                int i11 = 41 / 0;
            }
        }
        int i12 = ICustomTabsService + 9;
        newSession = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 43 / 0;
        }
        return onunavailableOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        String strIAuthTabCallback = addPolicy.MediaBrowserCompatMediaItem().IAuthTabCallback("@@credit/ACCESS_NOTICE_BANNER_KEY");
        if (strIAuthTabCallback != null) {
            int i2 = newSession + 53;
            ICustomTabsService = i2 % 128;
            int i3 = i2 % 2;
            Integer intOrNull = StringsKt.toIntOrNull(strIAuthTabCallback);
            if (intOrNull != null) {
                int i4 = newSession + 75;
                ICustomTabsService = i4 % 128;
                int i5 = i4 % 2;
                return Integer.valueOf(intOrNull.intValue());
            }
        }
        return 0;
    }

    public final void onWarmupCompleted(boolean z) {
        int iIntValue;
        int i = 2 % 2;
        if (z) {
            int i2 = ICustomTabsService + 85;
            newSession = i2 % 128;
            int i3 = i2 % 2;
            iIntValue = 4;
        } else {
            iIntValue = ((Integer) IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1911348897, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1911348899)).intValue() + 1;
        }
        addPolicy.MediaBrowserCompatMediaItem().IAuthTabCallback("@@credit/ACCESS_NOTICE_BANNER_KEY", String.valueOf(Math.min(iIntValue, 4)));
        int i4 = ICustomTabsService + 21;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 37;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted4 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        if (i3 == 0) {
            if (((Integer) IAuthTabCallback(iOnWarmupCompleted3, objArr, iOnWarmupCompleted, -1911348897, iOnWarmupCompleted4, iOnWarmupCompleted2, 1911348899)).intValue() >= 2) {
                return false;
            }
        } else if (((Integer) IAuthTabCallback(iOnWarmupCompleted3, objArr, iOnWarmupCompleted, -1911348897, iOnWarmupCompleted4, iOnWarmupCompleted2, 1911348899)).intValue() >= 4) {
            return false;
        }
        int i4 = ICustomTabsService + 81;
        newSession = i4 % 128;
        return i4 % 2 != 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final String onUnminimized() throws NoWhenBranchMatchedException {
        String str;
        int i = 2 % 2;
        if (this.extraCallbackWithResult.onActivityLayout() || this.extraCallbackWithResult.MediaBrowserCompatMediaItem() || this.extraCallbackWithResult.RemoteActionCompatParcelizer()) {
            int i2 = onWarmupCompleted.IAuthTabCallback[this.getInterfaceDescriptor.ordinal()];
            if (i2 == 1) {
                str = "KEY_CREDIT_TEST_HISTORY_FORCE_KCB";
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "KEY_CREDIT_TEST_HISTORY_FORCE_NICE";
            }
            String strOnExtraCallbackWithResult = addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallbackWithResult(str, "");
            int i3 = ICustomTabsService + 99;
            newSession = i3 % 128;
            if (i3 % 2 != 0) {
                return strOnExtraCallbackWithResult;
            }
            throw null;
        }
        int i4 = newSession + 121;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallbackWithResult(access13800<? super CreditHistoryContentsResponse> access13800Var) {
        IAuthTabCallbackStub iAuthTabCallbackStub;
        Object obj;
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallbackStub) {
            int i2 = newSession + 43;
            ICustomTabsService = i2 % 128;
            int i3 = i2 % 2;
            iAuthTabCallbackStub = (IAuthTabCallbackStub) access13800Var;
            int i4 = iAuthTabCallbackStub.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallbackStub.label = i4 - 2147483648;
                int i5 = ICustomTabsService + 19;
                newSession = i5 % 128;
                int i6 = i5 % 2;
            } else {
                iAuthTabCallbackStub = new IAuthTabCallbackStub(access13800Var);
            }
        }
        Object objOnExtraCallback = iAuthTabCallbackStub.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = iAuthTabCallbackStub.label;
        Object obj2 = null;
        try {
            if (i7 == 0) {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                Result.Companion companion = Result.Companion;
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                asInterface asinterface = new asInterface(null, this);
                iAuthTabCallbackStub.L$0 = access15400.onNavigationEvent(iAuthTabCallbackStub);
                iAuthTabCallbackStub.I$0 = 0;
                iAuthTabCallbackStub.I$1 = 0;
                iAuthTabCallbackStub.I$2 = 0;
                iAuthTabCallbackStub.label = 1;
                objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, asinterface, iAuthTabCallbackStub);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = ICustomTabsService + 121;
                newSession = i8 % 128;
                if (i8 % 2 == 0) {
                    ResultKt.onNavigationEvent(objOnExtraCallback);
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(objOnExtraCallback);
            }
            obj = Result.constructor-impl(objOnExtraCallback);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (WebResourceResponseModel e3) {
            Result.Companion companion3 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(e3));
        }
        if (Result.onExtraCallback(obj)) {
            return null;
        }
        return obj;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = newSession + 3;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Integer numIAuthTabCallback = this.ICustomTabsCallbackDefault.IAuthTabCallback(this.getInterfaceDescriptor);
        if (numIAuthTabCallback == null) {
            return 0;
        }
        int i4 = newSession + 97;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        int iIntValue = numIAuthTabCallback.intValue();
        int i6 = ICustomTabsService + 15;
        newSession = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 95 / 0;
        }
        return iIntValue;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        CreditHistoryViewModel creditHistoryViewModel = (CreditHistoryViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 71;
        newSession = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            creditHistoryViewModel.ICustomTabsCallbackDefault.IAuthTabCallback(Integer.valueOf(creditHistoryViewModel.writeTypedObject), creditHistoryViewModel.getInterfaceDescriptor);
            obj.hashCode();
            throw null;
        }
        creditHistoryViewModel.ICustomTabsCallbackDefault.IAuthTabCallback(Integer.valueOf(creditHistoryViewModel.writeTypedObject), creditHistoryViewModel.getInterfaceDescriptor);
        int i3 = newSession + 5;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final boolean IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 53;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            return this.extraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onMinimized() {
        int i = 2 % 2;
        int i2 = newSession + 109;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        this.extraCallback = true;
        int i5 = i3 + 99;
        newSession = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        int i2 = newSession + 21;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.onNavigationEvent.onExtraCallbackWithResult()).booleanValue();
        int i4 = ICustomTabsService + 105;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        CreditHistoryViewModel creditHistoryViewModel = (CreditHistoryViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 35;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        creditHistoryViewModel.onNavigationEvent.IAuthTabCallback(Boolean.TRUE);
        int i4 = newSession + 17;
        ICustomTabsService = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = newSession + 9;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        this.onTransact.IAuthTabCallback(Boolean.TRUE);
        String str = CommonModule_closeView.onWarmupCompleted.access000().format(this.ICustomTabsCallback_Parcel.asBinder());
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityCallbackDefault = addPolicy.ITrustedWebActivityCallbackDefault();
        Intrinsics.checkNotNull(str);
        textRoundCornerProgressBarSavedState1ITrustedWebActivityCallbackDefault.onNavigationEvent("KEY_CREDIT_HISTORY_LOAN_NUDGE_DATE", str);
        int i4 = newSession + 97;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean readTypedObject() {
        int i = 2 % 2;
        int i2 = newSession + 103;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            return Intrinsics.areEqual(addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallbackWithResult("KEY_CREDIT_HISTORY_LOAN_NUDGE_DATE", ""), CommonModule_closeView.onWarmupCompleted.access000().format(this.ICustomTabsCallback_Parcel.asBinder()));
        }
        Intrinsics.areEqual(addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallbackWithResult("KEY_CREDIT_HISTORY_LOAN_NUDGE_DATE", ""), CommonModule_closeView.onWarmupCompleted.access000().format(this.ICustomTabsCallback_Parcel.asBinder()));
        throw null;
    }

    public final void IAuthTabCallback(@NotNull getQuinoxOptAsynctask getquinoxoptasynctask) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getquinoxoptasynctask, "");
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback_Parcel(getquinoxoptasynctask, null), 3, (Object) null);
        int i2 = ICustomTabsService + 23;
        newSession = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ getQuinoxOptAsynctask $clickEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback_Parcel(getQuinoxOptAsynctask getquinoxoptasynctask, access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(2, access13800Var);
            this.$clickEvent = getquinoxoptasynctask;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 84 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = CreditHistoryViewModel.this.new IAuthTabCallback_Parcel(this.$clickEvent, access13800Var);
            int i2 = onExtraCallbackWithResult + 59;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 83 / 0;
            }
            return iAuthTabCallback_Parcel;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 37;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallback + 29;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                getBorderRadius getborderradiusIAuthTabCallbackStub = CreditHistoryViewModel.IAuthTabCallbackStub(CreditHistoryViewModel.this);
                getQuinoxOptAsynctask getquinoxoptasynctask = this.$clickEvent;
                this.label = 1;
                if (getborderradiusIAuthTabCallbackStub.emit(getquinoxoptasynctask, this) == objOnWarmupCompleted) {
                    int i4 = onExtraCallbackWithResult + 59;
                    int i5 = i4 % 128;
                    onExtraCallback = i5;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    int i6 = i5 + 47;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final List<onAvailable> onExtraCallbackWithResult(WifiConnectorExternalSyntheticApiModelOutline0 wifiConnectorExternalSyntheticApiModelOutline0) {
        Object next;
        int i = 2 % 2;
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        List list = (List) WifiConnectorExternalSyntheticApiModelOutline0.onWarmupCompleted(1872080127, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1872080126, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{wifiConnectorExternalSyntheticApiModelOutline0});
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i2 = newSession + 63;
        ICustomTabsService = i2 % 128;
        while (true) {
            int i3 = i2 % 2;
            while (it.hasNext()) {
                next = it.next();
                if (((onAvailable) next).readTypedObject() != WifiConnectorExternalSyntheticApiModelOutline1.SCORE) {
                    break;
                }
            }
            return arrayList;
            int i4 = ICustomTabsService + 63;
            newSession = i4 % 128;
            int i5 = i4 % 2;
            arrayList.add(next);
            i2 = ICustomTabsService + 7;
            newSession = i2 % 128;
        }
    }

    private final List<onAvailable> onNavigationEvent(WifiConnectorExternalSyntheticApiModelOutline0 wifiConnectorExternalSyntheticApiModelOutline0) {
        int i = 2 % 2;
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        List list = (List) WifiConnectorExternalSyntheticApiModelOutline0.onWarmupCompleted(1872080127, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1872080126, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{wifiConnectorExternalSyntheticApiModelOutline0});
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int i2 = ICustomTabsService + 55;
            newSession = i2 % 128;
            int i3 = i2 % 2;
            onAvailable onavailable = (onAvailable) obj;
            if (onavailable.readTypedObject() == WifiConnectorExternalSyntheticApiModelOutline1.SCORE) {
                int i4 = newSession + 73;
                ICustomTabsService = i4 % 128;
                if (i4 % 2 != 0) {
                    optimizeEventThreadOpt.IAuthTabCallback(onavailable);
                    networkInfoOpt networkinfoopt = networkInfoOpt.SAME;
                    throw null;
                }
                if (optimizeEventThreadOpt.IAuthTabCallback(onavailable) != networkInfoOpt.SAME) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0096 A[PHI: r6 r7
      0x0096: PHI (r6v8 o.onAvailable) = (r6v7 o.onAvailable), (r6v20 o.onAvailable) binds: [B:11:0x0094, B:8:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x0096: PHI (r7v5 java.lang.Integer) = (r7v4 java.lang.Integer), (r7v13 java.lang.Integer) binds: [B:11:0x0094, B:8:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a5 A[PHI: r6
      0x00a5: PHI (r6v18 o.onAvailable) = (r6v7 o.onAvailable), (r6v20 o.onAvailable) binds: [B:11:0x0094, B:8:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<onAvailable> onWarmupCompleted(List<onAvailable> list) {
        onAvailable onavailable;
        Integer intOrNull;
        int iIntValue;
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = this.ICustomTabsCallback_Parcel.onNavigationEvent().get(1);
        List<onAvailable> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            int i3 = newSession + 87;
            ICustomTabsService = i3 % 128;
            if (i3 % 2 != 0) {
                onavailable = (onAvailable) it.next();
                int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
                int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
                int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
                intOrNull = StringsKt.toIntOrNull((String) onAvailable.onExtraCallback(AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, 2117324819, iIAuthTabCallback2, new Object[]{onavailable}, iIAuthTabCallback, -2117324818));
                int i4 = 37 / 0;
                if (intOrNull != null) {
                    int i5 = newSession + 105;
                    ICustomTabsService = i5 % 128;
                    int i6 = i5 % 2;
                    iIntValue = intOrNull.intValue();
                } else {
                    iIntValue = -1;
                }
            } else {
                onavailable = (onAvailable) it.next();
                int iIAuthTabCallback4 = AdResponseKtKt.IAuthTabCallback();
                int iIAuthTabCallback5 = AdResponseKtKt.IAuthTabCallback();
                int iIAuthTabCallback6 = AdResponseKtKt.IAuthTabCallback();
                intOrNull = StringsKt.toIntOrNull((String) onAvailable.onExtraCallback(AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback6, 2117324819, iIAuthTabCallback5, new Object[]{onavailable}, iIAuthTabCallback4, -2117324818));
                if (intOrNull != null) {
                }
            }
            onAvailable onavailable2 = onavailable;
            Integer numValueOf = null;
            if (iIntValue >= 0) {
                int i7 = newSession + 87;
                int i8 = i7 % 128;
                ICustomTabsService = i8;
                if (i7 % 2 != 0) {
                    throw null;
                }
                if (iIntValue < i2) {
                    int i9 = i8 + 113;
                    newSession = i9 % 128;
                    if (i9 % 2 == 0) {
                        linkedHashMap.get(Integer.valueOf(iIntValue));
                        throw null;
                    }
                    if (linkedHashMap.get(Integer.valueOf(iIntValue)) == null) {
                        linkedHashMap.put(Integer.valueOf(iIntValue), Unit.INSTANCE);
                        numValueOf = Integer.valueOf(iIntValue);
                    }
                } else {
                    continue;
                }
            }
            arrayList.add(onAvailable.IAuthTabCallback(onavailable2, null, null, null, null, 0, null, null, numValueOf, null, null, null, null, null, null, 16255, null));
            int i10 = newSession + 7;
            ICustomTabsService = i10 % 128;
            int i11 = i10 % 2;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        onTransact ontransact;
        CreditHistoryViewModel creditHistoryViewModel = (CreditHistoryViewModel) objArr[0];
        onTransact ontransact2 = (access13800) objArr[1];
        int i = 2 % 2;
        if (ontransact2 instanceof onTransact) {
            ontransact = ontransact2;
            int i2 = ontransact.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = ICustomTabsService + 107;
                newSession = i3 % 128;
                if (i3 % 2 == 0) {
                    ontransact.label = i2 >> Integer.MIN_VALUE;
                } else {
                    ontransact.label = i2 - 2147483648;
                }
            } else {
                ontransact = creditHistoryViewModel.new onTransact(ontransact2);
            }
        }
        Object objOnExtraCallback = ontransact.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = ontransact.label;
        try {
            if (i4 == 0) {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                Object obj = null;
                if (Intrinsics.areEqual(creditHistoryViewModel.onUnminimized(), "ERROR")) {
                    Result.Companion companion = Result.Companion;
                    Object obj2 = Result.constructor-impl(ResultKt.createFailure(new IllegalStateException("credit-test forced error")));
                    int i5 = newSession + 73;
                    ICustomTabsService = i5 % 128;
                    if (i5 % 2 == 0) {
                        return obj2;
                    }
                    obj.hashCode();
                    throw null;
                }
                Result.Companion companion2 = Result.Companion;
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(null, creditHistoryViewModel);
                ontransact.L$0 = access15400.onNavigationEvent(ontransact);
                ontransact.I$0 = 0;
                ontransact.I$1 = 0;
                ontransact.I$2 = 0;
                ontransact.label = 1;
                objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, iAuthTabCallbackDefault, ontransact);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(objOnExtraCallback);
            }
            return Result.constructor-impl(objOnExtraCallback);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Result.Companion companion3 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (WebResourceResponseModel e3) {
            Result.Companion companion4 = Result.Companion;
            Object obj3 = Result.constructor-impl(ResultKt.createFailure(e3));
            int i6 = ICustomTabsService + 97;
            newSession = i6 % 128;
            int i7 = i6 % 2;
            return obj3;
        }
    }

    public static final /* synthetic */ enableGetInstalledPackageInIOThread IAuthTabCallback(CreditHistoryViewModel creditHistoryViewModel) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (enableGetInstalledPackageInIOThread) IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{creditHistoryViewModel}, iOnWarmupCompleted, -1461703076, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, 1461703088);
    }

    public static final /* synthetic */ String asBinder(CreditHistoryViewModel creditHistoryViewModel) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (String) IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{creditHistoryViewModel}, iOnWarmupCompleted, -1955003820, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, 1955003823);
    }

    public static final /* synthetic */ void IAuthTabCallbackDefault(CreditHistoryViewModel creditHistoryViewModel) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{creditHistoryViewModel}, iOnWarmupCompleted, -749085688, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, 749085696);
    }

    public static final /* synthetic */ boolean IAuthTabCallbackStubProxy(CreditHistoryViewModel creditHistoryViewModel) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return ((Boolean) IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{creditHistoryViewModel}, iOnWarmupCompleted, -136102569, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, 136102582)).booleanValue();
    }

    public static final /* synthetic */ boolean getInterfaceDescriptor(CreditHistoryViewModel creditHistoryViewModel) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return ((Boolean) IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{creditHistoryViewModel}, iOnWarmupCompleted, 1402708584, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, -1402708584)).booleanValue();
    }

    public static final /* synthetic */ void onExtraCallback(CreditHistoryViewModel creditHistoryViewModel, DisclaimerV2 disclaimerV2) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{creditHistoryViewModel, disclaimerV2}, iOnWarmupCompleted, -814337930, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, 814337931);
    }

    public static final /* synthetic */ void IAuthTabCallback(CreditHistoryViewModel creditHistoryViewModel, enableAudioDjangoExecutorOpt enableaudiodjangoexecutoropt) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{creditHistoryViewModel, enableaudiodjangoexecutoropt}, iOnWarmupCompleted, 586903991, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, -586903986);
    }

    private final Object IAuthTabCallback(access13800<? super Result<CreditHistoryResponse>> access13800Var) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this, access13800Var}, iOnWarmupCompleted, 129242954, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, -129242950);
    }

    private final int ICustomTabsCallbackStub() {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return ((Integer) IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, -1911348897, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, 1911348899)).intValue();
    }

    public final List<onAvailable> onExtraCallbackWithResult() {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (List) IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, 127330628, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, -127330618);
    }

    public final enableNebulaServiceInitOpt IAuthTabCallbackDefault() {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (enableNebulaServiceInitOpt) IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, 757489537, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, -757489530);
    }

    public final void onActivityResized() {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, 829466793, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, -829466787);
    }

    public final void ICustomTabsCallbackStubProxy() {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, 1668508702, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, -1668508693);
    }
}
