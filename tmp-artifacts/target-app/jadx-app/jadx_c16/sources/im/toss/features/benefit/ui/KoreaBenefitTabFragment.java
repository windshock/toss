package im.toss.features.benefit.ui;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ViewAnimator;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.semantics.Role;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.gms.internal.ads.zzgc;
import com.horcrux.svg.SvgPackage;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeLogger;
import com.otaliastudios.cameraview.R$styleable;
import gatewayprotocol.v1.AdResponseKtKt;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.ui.view.NativeAdsView;
import im.toss.core.workerservice.WorkerService$Companion$;
import im.toss.features.benefit.R;
import im.toss.features.benefit.R$string;
import im.toss.features.benefit.dto.AdContentType;
import im.toss.features.benefit.dto.AdsInfo;
import im.toss.features.benefit.dto.Cards;
import im.toss.features.benefit.dto.CardsV2;
import im.toss.features.benefit.log.BenefitTabImpressionHandler;
import im.toss.features.benefit.ui.KoreaBenefitTabFragment$;
import im.toss.features.benefit.ui.KoreaBenefitTabFragment$setupViewModel$2$1$;
import im.toss.features.benefit.ui.KoreaBenefitTabFragment$videoCallback$1$;
import im.toss.features.benefit.ui.KoreaBenefitTabViewModel;
import im.toss.features.benefit.ui.component.BenefitTabLinearLayoutManager;
import im.toss.features.benefit.ui.component.ThumbnailAdMobController;
import im.toss.features.benefit.ui.component.VideoAdsController;
import im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.inventory_sdk.InventoryAdManager;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.widget.TdsRecyclerView;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import im.toss.uikit.widget.TdsResultV0View;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import im.toss.utils.RxUtils;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
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
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.ACPayResult;
import o.AddPhoneContactView;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppLovinAdImpl;
import o.AppLovinNativeAdImplc;
import o.AppLovinPostbackService;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.AppSetIdAndScope1;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BasicSystemInfoExtension2;
import o.ByteOrderedDataOutputStream;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraControllerExternalSyntheticLambda0;
import o.CameraProviderInitRetryPolicy1;
import o.ChoosePhoneContactBridgeExtension1;
import o.ContactAccount;
import o.ConvertFloatArrayToByteArray;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.DERString;
import o.DeviceOrientationBridgeExtension;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.ExoPlayerImplExternalSyntheticLambda31;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.FocusMeteringControlExternalSyntheticLambda3;
import o.ForwardingCameraControl;
import o.FragmentStateAdapterFragmentMaxLifecycleEnforcer3;
import o.GeckoHubImp;
import o.HighSpeedResolverExternalSyntheticLambda1;
import o.ICustomTabsCallback_Parcel;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageService_Parcel;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.ImageCapturePixelHDRPlusQuirk;
import o.JsonReaderUnknownNumberParsing;
import o.LifecyclesKtawaitStarted21;
import o.MaxAdViewAdapterListener;
import o.MaxAdapterListener;
import o.MaxAppOpenAdapterListener;
import o.MaxRewardedInterstitialAdapter;
import o.PageRenderReadyListener;
import o.ParamImpl;
import o.ParamUtils;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RVWebSocketManagerHolder;
import o.RotationVectorAbility;
import o.RotationVectorAbility1;
import o.SensorBridgeExtension2;
import o.SensorBridgeExtension3;
import o.SensorServiceManager;
import o.SessionTrackera;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.ShakeMonitorBridgeExtension;
import o.SpannedDataExternalSyntheticLambda0;
import o.TelephonyInfoBridgeExtension1;
import o.TelephonyInfoBridgeExtension1$onWarmupCompleted;
import o.TextFieldKeyInputExternalSyntheticLambda6;
import o.TextFieldKeyInputExternalSyntheticLambda7;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextLinkScopeExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.TimeoutCompanionNONE1;
import o.TinyAppHostApduService1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.UtilsKtExternalSyntheticLambda17;
import o.ViewPager2LinearLayoutManagerImpl;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.WebSocketResultEnum;
import o.WorkflowUnit;
import o.ZslRingBuffer;
import o.access13800;
import o.access14300;
import o.access15400;
import o.access8100;
import o.accessgetProtocolp;
import o.addAllCommandLine;
import o.addNewItem;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.clearWrite;
import o.component5;
import o.configureReward;
import o.deserializeUriNullableCollection;
import o.ea10;
import o.enableRotationVector;
import o.exitAllPages;
import o.filterCreatePageParams;
import o.findResAndMsg;
import o.forceInnerPermissionCheck;
import o.formatMsgs;
import o.getAdService;
import o.getAwbState;
import o.getBacktraceNote;
import o.getCachingExecutorService;
import o.getConfiguration;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getDeviceBaseInfo;
import o.getDummyAd;
import o.getErrMsg;
import o.getIconPaddingLeft;
import o.getLongName;
import o.getNameByImsi;
import o.getNameByOperatorName;
import o.getNameBySim;
import o.getOperatorName;
import o.getOriginalFullResponse;
import o.getPricingPhaseList;
import o.getScreenBrightnessInner;
import o.getSpecialFeatureOptInStatus;
import o.getWrite;
import o.immediateFailedFuture;
import o.isRepeatingEnabled;
import o.maybeUpdateAnimatable;
import o.onAdViewAdDisplayFailed;
import o.onNext;
import o.preFillDefault;
import o.putChannelInfo;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambdaDml5dirzRCENiZicd2_b5Xg5o;
import o.readIntokhttp;
import o.registerBatteryReceiver;
import o.registerDefault;
import o.registerShakeListener;
import o.removeTaskIdOnSocketError;
import o.resolveQuirkNames;
import o.setAdVideoPlaybackListener;
import o.setAutoCaptured;
import o.setBaseDeeplink;
import o.setHasShown;
import o.setNode;
import o.setRandomHost;
import o.setResultAccount;
import o.setRubIn;
import o.startDeviceShakeListener;
import o.stopDeviceMotionListening;
import o.toPreviewOnlyRange;
import o.varyMatches;
import o.y3ExternalSyntheticLambda0;
import o.ycxycx;
import o.zzag;
import o.zzdt;
import o.zzm;
import o.zzo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;
import viva.republica.toss.main.StatusManager;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

@DERString
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class KoreaBenefitTabFragment extends Hilt_KoreaBenefitTabFragment implements StatusManager.onExtraCallback, zzo, FragmentStateAdapterFragmentMaxLifecycleEnforcer3 {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    public static final int IAuthTabCallback;
    private static long extraCommand = 0;
    private static int isEngagementSignalsApiAvailable = 0;
    private static int mayLaunchUrl = 1;
    private static int newSession = 0;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback;
    private static final String onNavigationEvent;
    private static int postMessage = 1;
    private boolean IAuthTabCallbackDefault;
    private final Lazy IAuthTabCallbackStub;
    private Long IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private getNameByOperatorName ICustomTabsCallback;
    private final ICustomTabsService ICustomTabsCallbackDefault;
    private final SessionTrackera ICustomTabsCallbackStub;
    private final Rect ICustomTabsCallbackStubProxy;
    private final Lazy ICustomTabsCallback_Parcel;
    private TextFieldScrollKtExternalSyntheticLambda0 ICustomTabsService;
    private BenefitTabImpressionHandler access000;
    private boolean access100;
    private boolean asBinder;
    private final getOperatorName asInterface;
    private long extraCallback;
    private final AtomicBoolean extraCallbackWithResult;
    private Integer getInterfaceDescriptor;

    @Inject
    public InventoryAdManager inventoryAdManager;

    @Inject
    public NativeAdsManager nativeAdsManager;
    private boolean onActivityLayout;
    private final Lazy onActivityResized;
    private WorkflowUnit onExtraCallbackWithResult;
    private final Lazy onMessageChannelReady;
    private Integer onMinimized;
    private KoreaBenefitTabViewModel.IAuthTabCallback onPostMessage;
    private KoreaBenefitTabViewModel.IAuthTabCallback onRelationshipValidationResult;
    private final PageRenderReadyListener onTransact;
    private final AccessibilityManager.TouchExplorationStateChangeListener onUnminimized;
    private AccessibilityManager onWarmupCompleted;
    private final AppSetIdAndScope1 readTypedObject;

    @Inject
    public SessionTrackerb router;

    @Inject
    public getDummyAd standardTermsV2Intent;

    @Inject
    public zzag tossClock;
    private final IEngagementSignalsCallback_Parcel<Intent> writeTypedObject;

    static final /* synthetic */ class extraCallbackWithResult implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private final /* synthetic */ Function1 IAuthTabCallback;

        extraCallbackWithResult(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 3;
            onNavigationEvent = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                boolean z = obj instanceof TextLinkScopeExternalSyntheticLambda0;
                throw null;
            }
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                int i4 = i2 + 115;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            int i6 = i2 + 27;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.IAuthTabCallback;
            int i5 = i3 + 71;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            if (i3 != 0) {
                return functionDelegate.hashCode();
            }
            functionDelegate.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                this.IAuthTabCallback.invoke(obj);
                int i3 = 4 / 0;
            } else {
                this.IAuthTabCallback.invoke(obj);
            }
            int i4 = onNavigationEvent + 43;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static {
        IAuthTabCallbackStub();
        Object[] objArr = new Object[1];
        a(new char[]{48745, 48455, 37725, 58386, 48641, 22508, 18071, 9471, 5478, 11046, 4680, 34852, 59618, 64740, 49034, 62451, 48244, 20599, 19265, 10103, 5110, 9723, 4224, 35505, 59244, 63841, 48216, 65138, 47842, 21231, 18837, 8676, 3618, 9844, 5393, 38260, 58790, 64460, 41659, 63552, 47452, 20255, 20008, 9093, 3228, 8320, 7076, 38670, 57427, 62464, 42850, 64128, 47056, 18842, 19632, 11795, 2880, 7490, 6183, 37269, 57030}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        onExtraCallback = new addAllCommandLine[]{new PropertyReference1Impl<>(KoreaBenefitTabFragment.class, "binding", "getBinding()Lim/toss/features/benefit/databinding/BenefitPillarFragmentBinding;", 0)};
        Companion = new onExtraCallbackWithResult((DefaultConstructorMarker) null);
        IAuthTabCallback = 8;
        int i = newSession + 93;
        postMessage = i % 128;
        if (i % 2 == 0) {
            int i2 = 40 / 0;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardsV2.BenefitMissionInfo benefitMissionInfo, SensorServiceManager sensorServiceManager, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 29;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(benefitMissionInfo, sensorServiceManager, setDetectableSize);
        }
        onExtraCallback(benefitMissionInfo, sensorServiceManager, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, long j, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = isEngagementSignalsApiAvailable + 45;
        mayLaunchUrl = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(koreaBenefitTabFragment, j, function0, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = isEngagementSignalsApiAvailable + 67;
        mayLaunchUrl = i7 % 128;
        int i8 = i7 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, CardsV2.PointBackInfo.ChanceExhaustedSheet chanceExhaustedSheet) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 85;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(koreaBenefitTabFragment, chanceExhaustedSheet);
        int i4 = isEngagementSignalsApiAvailable + 93;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, ContactAccount.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 27;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(koreaBenefitTabFragment, onextracallbackwithresult);
        int i4 = mayLaunchUrl + 27;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, ShakeMonitorBridgeExtension shakeMonitorBridgeExtension, CardsV2.PointBackInfo.BankCardCashBackBanner bankCardCashBackBanner) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 119;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(koreaBenefitTabFragment, shakeMonitorBridgeExtension, bankCardCashBackBanner);
        if (i3 == 0) {
            int i4 = 62 / 0;
        }
        int i5 = mayLaunchUrl + 125;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(KoreaBenefitTabViewModel.IAuthTabCallback iAuthTabCallback, KoreaBenefitTabFragment koreaBenefitTabFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 27;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(iIAuthTabCallback2, -1086365549, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{iAuthTabCallback, koreaBenefitTabFragment, setDetectableSize}, 1086365550, iIAuthTabCallback);
        int i4 = isEngagementSignalsApiAvailable + 65;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(RotationVectorAbility1 rotationVectorAbility1, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 3;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(rotationVectorAbility1, setDetectableSize);
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ AddPhoneContactView IAuthTabCallback(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 1;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsServiceDefault(koreaBenefitTabFragment);
            throw null;
        }
        AddPhoneContactView addPhoneContactViewICustomTabsServiceDefault = ICustomTabsServiceDefault(koreaBenefitTabFragment);
        int i3 = mayLaunchUrl + 97;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 12 / 0;
        }
        return addPhoneContactViewICustomTabsServiceDefault;
    }

    public static /* synthetic */ AddPhoneContactView IAuthTabCallbackDefault(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 115;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            writeTypedList(koreaBenefitTabFragment);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AddPhoneContactView addPhoneContactViewWriteTypedList = writeTypedList(koreaBenefitTabFragment);
        int i3 = isEngagementSignalsApiAvailable + 69;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
        return addPhoneContactViewWriteTypedList;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 13;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        onVerticalScrollEvent(koreaBenefitTabFragment);
        int i4 = isEngagementSignalsApiAvailable + 1;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        RVWebSocketManagerHolder rVWebSocketManagerHolder = (RVWebSocketManagerHolder) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 51;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(rVWebSocketManagerHolder);
        int i4 = mayLaunchUrl + 49;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zOnNavigationEvent);
        }
        int i5 = 71 / 0;
        return Boolean.valueOf(zOnNavigationEvent);
    }

    public static /* synthetic */ setResultAccount IAuthTabCallbackStubProxy(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 33;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            newAuthTabSession(koreaBenefitTabFragment);
            throw null;
        }
        setResultAccount setresultaccountNewAuthTabSession = newAuthTabSession(koreaBenefitTabFragment);
        int i3 = mayLaunchUrl + 11;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        return setresultaccountNewAuthTabSession;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 1;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        boolean zUpdateVisuals = updateVisuals(koreaBenefitTabFragment);
        int i4 = isEngagementSignalsApiAvailable + 119;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zUpdateVisuals);
        }
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStub(Object[] objArr) {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 21;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(koreaBenefitTabFragment, view);
        int i4 = isEngagementSignalsApiAvailable + 1;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) throws Throwable {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 83;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback2, -1110576657, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{function1, obj}, 1110576689, iIAuthTabCallback);
        int i4 = mayLaunchUrl + 121;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit asBinder(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 7;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIEngagementSignalsCallbackDefault = IEngagementSignalsCallbackDefault(koreaBenefitTabFragment);
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
        return unitIEngagementSignalsCallbackDefault;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Integer num = (Integer) objArr[2];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 13;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(koreaBenefitTabFragment, zBooleanValue, num);
        }
        onExtraCallback(koreaBenefitTabFragment, zBooleanValue, num);
        throw null;
    }

    public static /* synthetic */ DeviceOrientationBridgeExtension.onExtraCallback extraCallback(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 75;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        DeviceOrientationBridgeExtension.onExtraCallback onextracallbackPrefetchWithMultipleUrls = prefetchWithMultipleUrls(koreaBenefitTabFragment);
        int i4 = isEngagementSignalsApiAvailable + 107;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return onextracallbackPrefetchWithMultipleUrls;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 113;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsServiceStubProxy = ICustomTabsServiceStubProxy(koreaBenefitTabFragment);
        int i4 = mayLaunchUrl + 79;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsServiceStubProxy;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 33;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        getScreenBrightnessInner getscreenbrightnessinnerRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(koreaBenefitTabFragment);
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return getscreenbrightnessinnerRequestPostMessageChannelWithExtras;
    }

    public static /* synthetic */ RecyclerView onExtraCallback(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 29;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsService_Parcel(koreaBenefitTabFragment);
            throw null;
        }
        RecyclerView recyclerViewICustomTabsService_Parcel = ICustomTabsService_Parcel(koreaBenefitTabFragment);
        int i3 = mayLaunchUrl + 125;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        return recyclerViewICustomTabsService_Parcel;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = (~(i8 | i6)) | i7;
        int i10 = ~i6;
        int i11 = ~(i8 | i10 | i5);
        int i12 = (~(i6 | i7)) | i8 | (~(i10 | i5));
        int i13 = i5 + i2 + i + (325770565 * i4) + ((-1284996642) * i3);
        int i14 = i13 * i13;
        int i15 = (i5 * (-1991011123)) + 595473426 + (i2 * (-1991009311)) + (i9 * (-906)) + (i11 * (-906)) + (i12 * 906) + ((-1991010217) * i) + ((-1223611789) * i4) + ((-291900814) * i3) + (i14 * (-1931083776));
        String string = null;
        switch (((789042555 * i5) - 1205338112) + ((-1364710777) * i2) + (i9 * 1076876666) + (1076876666 * i11) + ((-1076876666) * i12) + ((-287834112) * i) + ((-667418624) * i4) + ((-145752064) * i3) + (1116340224 * i14) + (i15 * i15 * (-1558839296))) {
            case 1:
                KoreaBenefitTabViewModel.IAuthTabCallback iAuthTabCallback = (KoreaBenefitTabViewModel.IAuthTabCallback) objArr[0];
                KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[1];
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
                int i16 = 2 % 2;
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                setDetectableSize.onExtraCallback("total_card_cnt", Integer.valueOf(iAuthTabCallback.IAuthTabCallback_Parcel()));
                setDetectableSize.onExtraCallback("point_amount", Long.valueOf(((Long) KoreaBenefitTabViewModel.IAuthTabCallback.onWarmupCompleted(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1248978358, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{iAuthTabCallback}, -1248978356, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).longValue()));
                Bundle arguments = koreaBenefitTabFragment.getArguments();
                if (arguments != null) {
                    int i17 = isEngagementSignalsApiAvailable + 47;
                    mayLaunchUrl = i17 % 128;
                    if (i17 % 2 == 0) {
                        Color.alpha(1);
                        Object[] objArr2 = new Object[1];
                        a(new char[]{57184, 3303, 25440, 27218, 57106, 58973, 46776, 43690, 29806, 39630, 57919, 1593}, 0, objArr2);
                        string = arguments.getString(((String) objArr2[0]).intern());
                    } else {
                        Object[] objArr3 = new Object[1];
                        a(new char[]{57184, 3303, 25440, 27218, 57106, 58973, 46776, 43690, 29806, 39630, 57919, 1593}, 1 - Color.alpha(0), objArr3);
                        string = arguments.getString(((String) objArr3[0]).intern());
                    }
                } else {
                    int i18 = mayLaunchUrl + 105;
                    isEngagementSignalsApiAvailable = i18 % 128;
                    int i19 = i18 % 2;
                }
                Object[] objArr4 = new Object[1];
                a(new char[]{57184, 3303, 25440, 27218, 57106, 58973, 46776, 43690, 29806, 39630, 57919, 1593}, -TextUtils.indexOf((CharSequence) "", '0', 0), objArr4);
                setDetectableSize.onExtraCallback(((String) objArr4[0]).intern(), string);
                return Unit.INSTANCE;
            case 2:
                long jLongValue = ((Number) objArr[0]).longValue();
                KoreaBenefitTabFragment koreaBenefitTabFragment2 = (KoreaBenefitTabFragment) objArr[1];
                SetDetectableSize setDetectableSize2 = (SetDetectableSize) objArr[2];
                int i20 = 2 % 2;
                int i21 = mayLaunchUrl + 57;
                isEngagementSignalsApiAvailable = i21 % 128;
                int i22 = i21 % 2;
                Unit unit = (Unit) onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -761046741, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{Long.valueOf(jLongValue), koreaBenefitTabFragment2, setDetectableSize2}, 761046764, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
                int i23 = isEngagementSignalsApiAvailable + 45;
                mayLaunchUrl = i23 % 128;
                int i24 = i23 % 2;
                return unit;
            case 3:
                KoreaBenefitTabFragment koreaBenefitTabFragment3 = (KoreaBenefitTabFragment) objArr[0];
                AdsInfo adsInfo = (AdsInfo) objArr[1];
                int i25 = 2 % 2;
                int i26 = isEngagementSignalsApiAvailable + 19;
                mayLaunchUrl = i26 % 128;
                int i27 = i26 % 2;
                koreaBenefitTabFragment3.onNavigationEvent(adsInfo);
                int i28 = mayLaunchUrl + 61;
                isEngagementSignalsApiAvailable = i28 % 128;
                int i29 = i28 % 2;
                return null;
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                KoreaBenefitTabFragment koreaBenefitTabFragment4 = (KoreaBenefitTabFragment) objArr[0];
                int i30 = 2 % 2;
                int i31 = isEngagementSignalsApiAvailable + 115;
                mayLaunchUrl = i31 % 128;
                int i32 = i31 % 2;
                int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                Map map = (Map) onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1614165593, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{koreaBenefitTabFragment4}, 1614165621, iIAuthTabCallback);
                int i33 = mayLaunchUrl + 85;
                isEngagementSignalsApiAvailable = i33 % 128;
                int i34 = i33 % 2;
                return map;
            case 7:
                KoreaBenefitTabFragment koreaBenefitTabFragment5 = (KoreaBenefitTabFragment) objArr[0];
                IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
                int i35 = 2 % 2;
                int i36 = mayLaunchUrl + 79;
                isEngagementSignalsApiAvailable = i36 % 128;
                if (i36 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
                } else {
                    Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
                }
                koreaBenefitTabFragment5.onMessageChannelReady().onWarmupCompleted(true);
                return null;
            case 8:
                return onWarmupCompleted(objArr);
            case 9:
                return onNavigationEvent(objArr);
            case 10:
                return onTransact(objArr);
            case 11:
                return asInterface(objArr);
            case 12:
                return IAuthTabCallbackDefault(objArr);
            case 13:
                return IAuthTabCallbackStub(objArr);
            case 14:
                return asBinder(objArr);
            case 15:
                return IAuthTabCallback_Parcel(objArr);
            case 16:
                KoreaBenefitTabFragment koreaBenefitTabFragment6 = (KoreaBenefitTabFragment) objArr[0];
                int i37 = 2 % 2;
                int i38 = mayLaunchUrl + 35;
                isEngagementSignalsApiAvailable = i38 % 128;
                int i39 = i38 % 2;
                Unit unitWarmup = warmup(koreaBenefitTabFragment6);
                int i40 = mayLaunchUrl + 35;
                isEngagementSignalsApiAvailable = i40 % 128;
                int i41 = i40 % 2;
                return unitWarmup;
            case 17:
                return access000(objArr);
            case 18:
                return getInterfaceDescriptor(objArr);
            case 19:
                return IAuthTabCallbackStubProxy(objArr);
            case 20:
                return access100(objArr);
            case 21:
                return readTypedObject(objArr);
            case 22:
                return writeTypedObject(objArr);
            case 23:
                long jLongValue2 = ((Number) objArr[0]).longValue();
                KoreaBenefitTabFragment koreaBenefitTabFragment7 = (KoreaBenefitTabFragment) objArr[1];
                SetDetectableSize setDetectableSize3 = (SetDetectableSize) objArr[2];
                int i42 = 2 % 2;
                int i43 = isEngagementSignalsApiAvailable + 13;
                mayLaunchUrl = i43 % 128;
                if (i43 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(setDetectableSize3, "");
                } else {
                    Intrinsics.checkNotNullParameter(setDetectableSize3, "");
                }
                setDetectableSize3.onExtraCallback("stay_time", Long.valueOf(jLongValue2 - koreaBenefitTabFragment7.extraCallback));
                setDetectableSize3.onExtraCallback("exit_time", Long.valueOf(jLongValue2));
                Unit unit2 = Unit.INSTANCE;
                int i44 = isEngagementSignalsApiAvailable + 53;
                mayLaunchUrl = i44 % 128;
                int i45 = i44 % 2;
                return unit2;
            case 24:
                return ICustomTabsCallback(objArr);
            case 25:
                return extraCallback(objArr);
            case R$styleable.CameraView_cameraPictureMetering /* 26 */:
                return extraCallbackWithResult(objArr);
            case 27:
                return onMinimized(objArr);
            case 28:
                return onPostMessage(objArr);
            case 29:
                return onActivityResized(objArr);
            case 30:
                return onActivityLayout(objArr);
            case 31:
                return onMessageChannelReady(objArr);
            case 32:
                return onRelationshipValidationResult(objArr);
            case 33:
                return ICustomTabsCallbackDefault(objArr);
            case 34:
                return ICustomTabsCallbackStub(objArr);
            case 35:
                return onUnminimized(objArr);
            case R$styleable.CameraView_cameraPictureSnapshotMetering /* 36 */:
                return ICustomTabsCallbackStubProxy(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(long j, int i, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 69;
        mayLaunchUrl = i3 % 128;
        if (i3 % 2 != 0) {
            return onNavigationEvent(j, i, setDetectableSize);
        }
        onNavigationEvent(j, i, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 123;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(koreaBenefitTabFragment, str);
        int i4 = mayLaunchUrl + 79;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, MaxAppOpenAdapterListener maxAppOpenAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = mayLaunchUrl + 77;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(koreaBenefitTabFragment, maxAppOpenAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = isEngagementSignalsApiAvailable + 51;
        mayLaunchUrl = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, SensorServiceManager sensorServiceManager) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 67;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(koreaBenefitTabFragment, sensorServiceManager);
        }
        IAuthTabCallback(koreaBenefitTabFragment, sensorServiceManager);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Bundle onExtraCallbackWithResult(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 41;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            return (Bundle) onExtraCallback(iIAuthTabCallback2, -620982180, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment}, 620982197, iIAuthTabCallback);
        }
        int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback5 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback6 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ WindowInsetsCompat onExtraCallbackWithResult(KoreaBenefitTabFragment koreaBenefitTabFragment, View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 89;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(koreaBenefitTabFragment, view, windowInsetsCompat);
            obj.hashCode();
            throw null;
        }
        WindowInsetsCompat windowInsetsCompatOnExtraCallback = onExtraCallback(koreaBenefitTabFragment, view, windowInsetsCompat);
        int i3 = isEngagementSignalsApiAvailable + 87;
        mayLaunchUrl = i3 % 128;
        if (i3 % 2 != 0) {
            return windowInsetsCompatOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(KoreaBenefitTabFragment koreaBenefitTabFragment, long j) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 35;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(koreaBenefitTabFragment, j);
        int i4 = mayLaunchUrl + 75;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(KoreaBenefitTabFragment koreaBenefitTabFragment, KoreaBenefitTabViewModel.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 81;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(koreaBenefitTabFragment, iAuthTabCallback);
        int i4 = isEngagementSignalsApiAvailable + 105;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(KoreaBenefitTabFragment koreaBenefitTabFragment, String str) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 125;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(koreaBenefitTabFragment, str);
        int i4 = isEngagementSignalsApiAvailable + 1;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(KoreaBenefitTabFragment koreaBenefitTabFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = mayLaunchUrl + 103;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(koreaBenefitTabFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 92 / 0;
        }
        int i6 = isEngagementSignalsApiAvailable + 75;
        mayLaunchUrl = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(KoreaBenefitTabFragment koreaBenefitTabFragment, RVWebSocketManagerHolder rVWebSocketManagerHolder) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 55;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {koreaBenefitTabFragment, rVWebSocketManagerHolder};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(iIAuthTabCallback2, 340804957, iIAuthTabCallback4, iIAuthTabCallback3, objArr, -340804922, iIAuthTabCallback);
        int i4 = isEngagementSignalsApiAvailable + 125;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(KoreaBenefitTabFragment koreaBenefitTabFragment, RotationVectorAbility1 rotationVectorAbility1) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 17;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(iIAuthTabCallback2, -627596443, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment, rotationVectorAbility1}, 627596468, iIAuthTabCallback);
        int i4 = mayLaunchUrl + 63;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(KoreaBenefitTabFragment koreaBenefitTabFragment, SensorServiceManager sensorServiceManager) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 63;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(koreaBenefitTabFragment, sensorServiceManager);
        }
        onWarmupCompleted(koreaBenefitTabFragment, sensorServiceManager);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(KoreaBenefitTabFragment koreaBenefitTabFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 55;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(koreaBenefitTabFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        }
        onWarmupCompleted(koreaBenefitTabFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 117;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        onWarmupCompleted(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = mayLaunchUrl + 89;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 29;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnGreatestScrollPercentageIncreased = onGreatestScrollPercentageIncreased(koreaBenefitTabFragment);
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        int i5 = mayLaunchUrl + 9;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnGreatestScrollPercentageIncreased;
        }
        throw null;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 29;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        boolean zBooleanValue = ((Boolean) onExtraCallback(iIAuthTabCallback2, 1396649354, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{function1, obj}, -1396649340, iIAuthTabCallback)).booleanValue();
        int i4 = isEngagementSignalsApiAvailable + 47;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    public static /* synthetic */ Unit onNavigationEvent(CardsV2.BenefitMissionInfo benefitMissionInfo, SensorServiceManager sensorServiceManager, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 9;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(benefitMissionInfo, sensorServiceManager, setDetectableSize);
        int i4 = isEngagementSignalsApiAvailable + 107;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(KoreaBenefitTabFragment koreaBenefitTabFragment, float f, float f2, int i, String str) {
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 7;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(koreaBenefitTabFragment, f, f2, i, str);
        int i5 = isEngagementSignalsApiAvailable + 99;
        mayLaunchUrl = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(KoreaBenefitTabFragment koreaBenefitTabFragment, RotationVectorAbility1.onExtraCallback onextracallback, String str) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 61;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(koreaBenefitTabFragment, onextracallback, str);
        int i4 = mayLaunchUrl + 97;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ getNameByOperatorName onNavigationEvent(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 71;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        getNameByOperatorName getnamebyoperatornameValidateRelationship = validateRelationship(koreaBenefitTabFragment);
        int i4 = mayLaunchUrl + 11;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return getnamebyoperatornameValidateRelationship;
    }

    public static /* synthetic */ void onNavigationEvent(KoreaBenefitTabFragment koreaBenefitTabFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 23;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            onExtraCallback(iIAuthTabCallback2, -1409575120, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment, iEngagementSignalsCallbackDefault}, 1409575127, iIAuthTabCallback);
            return;
        }
        int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback5 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback6 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback5, -1409575120, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback6, new Object[]{koreaBenefitTabFragment, iEngagementSignalsCallbackDefault}, 1409575127, iIAuthTabCallback4);
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(KoreaBenefitTabFragment koreaBenefitTabFragment, boolean z) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 5;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(koreaBenefitTabFragment, z);
        int i4 = isEngagementSignalsApiAvailable + 125;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ int onTransact(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 75;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        int iReceiveFile = receiveFile(koreaBenefitTabFragment);
        int i4 = mayLaunchUrl + 27;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return iReceiveFile;
    }

    private static final Unit onWarmupCompleted(KoreaBenefitTabFragment koreaBenefitTabFragment, long j, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = isEngagementSignalsApiAvailable + 111;
        mayLaunchUrl = i5 % 128;
        int i6 = i5 % 2;
        koreaBenefitTabFragment.onWarmupCompleted(j, function0, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = mayLaunchUrl + 31;
        isEngagementSignalsApiAvailable = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(KoreaBenefitTabFragment koreaBenefitTabFragment, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 53;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 != 0) {
            return onTransact(koreaBenefitTabFragment, str);
        }
        onTransact(koreaBenefitTabFragment, str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(KoreaBenefitTabFragment koreaBenefitTabFragment, RotationVectorAbility1 rotationVectorAbility1) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 3;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(koreaBenefitTabFragment, rotationVectorAbility1);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(koreaBenefitTabFragment, rotationVectorAbility1);
        int i3 = mayLaunchUrl + 67;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(KoreaBenefitTabFragment koreaBenefitTabFragment, getErrMsg geterrmsg) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 71;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(koreaBenefitTabFragment, geterrmsg);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(koreaBenefitTabFragment, geterrmsg);
        int i3 = isEngagementSignalsApiAvailable + 65;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onWarmupCompleted(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 105;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        onSessionEnded(koreaBenefitTabFragment);
        int i4 = mayLaunchUrl + 117;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean readTypedObject(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 69;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess200 = access200(koreaBenefitTabFragment);
        int i4 = isEngagementSignalsApiAvailable + 123;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return zAccess200;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 113;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return IEngagementSignalsCallback(koreaBenefitTabFragment);
        }
        IEngagementSignalsCallback(koreaBenefitTabFragment);
        throw null;
    }

    public static /* synthetic */ boolean writeTypedObject(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 5;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return setEngagementSignalsCallback(koreaBenefitTabFragment);
        }
        setEngagementSignalsCallback(koreaBenefitTabFragment);
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 99;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 != 0) {
            return -1L;
        }
        int i3 = 95 / 0;
        return -1L;
    }

    public static final class isEngagementSignalsApiAvailable implements View.OnLayoutChangeListener {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public isEngagementSignalsApiAvailable() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Throwable {
            int i9 = 2 % 2;
            int i10 = onExtraCallback + 99;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 != 0) {
                view.removeOnLayoutChangeListener(this);
                Object[] objArr = {KoreaBenefitTabFragment.this};
                int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                KoreaBenefitTabFragment.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -793573870, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, 793573900, iIAuthTabCallback);
                int i11 = onNavigationEvent + 65;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                return;
            }
            view.removeOnLayoutChangeListener(this);
            Object[] objArr2 = {KoreaBenefitTabFragment.this};
            int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            KoreaBenefitTabFragment.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -793573870, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr2, 793573900, iIAuthTabCallback2);
            throw null;
        }
    }

    public static final class onTransact implements View.OnLayoutChangeListener {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public onTransact() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = onWarmupCompleted + 81;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            KoreaBenefitTabFragment.postMessage(KoreaBenefitTabFragment.this);
            int i12 = onExtraCallback + 57;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(extraCommand ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 29;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(extraCommand)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - View.MeasureSpec.getSize(0)), 84 - Color.blue(0), 21233 - ExpandableListView.getPackedPositionType(0L), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14184), 20 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 8808 - View.MeasureSpec.getSize(0), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        int i6 = $10 + 87;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    public static final class ICustomTabsCallbackDefault extends Lambda implements Function0<Fragment> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ICustomTabsCallbackDefault(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Fragment fragmentOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = onExtraCallback + 103;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return fragmentOnExtraCallbackWithResult;
        }

        public final Fragment onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Fragment fragment = this.$this_viewModels;
            int i5 = i3 + 53;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return fragment;
        }
    }

    public static final class onRelationshipValidationResult extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onRelationshipValidationResult(Function0 function0) {
            super(0);
            this.$ownerProducer = function0;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnWarmupCompleted = onWarmupCompleted();
            int i4 = onExtraCallback + 35;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0 = (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) this.$ownerProducer.invoke();
            int i4 = onExtraCallback + 37;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda0;
        }
    }

    public static final class ICustomTabsCallbackStub extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ICustomTabsCallbackStub(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallback = onExtraCallback();
            int i4 = onExtraCallback + 115;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 77 / 0;
            }
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallback;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onExtraCallback() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                viewModelStore = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
                int i3 = 14 / 0;
            } else {
                viewModelStore = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
            }
            int i4 = onExtraCallback + 5;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return viewModelStore;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class extraCommand extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public extraCommand(Fragment fragment, Lazy lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallback = onExtraCallback();
            int i3 = onNavigationEvent + 75;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return onwarmupcompletedOnExtraCallback;
        }

        public final ViewModelProvider.onWarmupCompleted onExtraCallback() {
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            Object obj = null;
            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
            } else {
                int i4 = onWarmupCompleted + 93;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                textFieldKeyInputExternalSyntheticLambda6 = null;
            }
            if (textFieldKeyInputExternalSyntheticLambda6 != null) {
                int i6 = onWarmupCompleted + 91;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory();
                    if (defaultViewModelProviderFactory != null) {
                        return defaultViewModelProviderFactory;
                    }
                } else {
                    textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory();
                    obj.hashCode();
                    throw null;
                }
            }
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
            return defaultViewModelProviderFactory2;
        }
    }

    public static final class mayLaunchUrl extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public mayLaunchUrl(Function0 function0, Lazy lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallback();
                throw null;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback = onExtraCallback();
            int i3 = onNavigationEvent + 63;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            if (r1 != null) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
        
            if (r1 != null) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallback() {
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            int i = 2 % 2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null) {
                int i2 = onExtraCallback + 27;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                    int i3 = 53 / 0;
                } else {
                    androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                }
            }
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                int i4 = onNavigationEvent + 57;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
            } else {
                textFieldKeyInputExternalSyntheticLambda6 = null;
            }
            return textFieldKeyInputExternalSyntheticLambda6 != null ? textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 101;
        mayLaunchUrl = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            koreaBenefitTabFragment.onTransact();
            obj.hashCode();
            throw null;
        }
        setResultAccount setresultaccountOnTransact = koreaBenefitTabFragment.onTransact();
        int i3 = mayLaunchUrl + 17;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 == 0) {
            return setresultaccountOnTransact;
        }
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, KoreaBenefitTabViewModel.IAuthTabCallback iAuthTabCallback) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 5;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        koreaBenefitTabFragment.onNavigationEvent(iAuthTabCallback);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, String str) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 39;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        koreaBenefitTabFragment.onWarmupCompleted(str);
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
        int i5 = mayLaunchUrl + 17;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, List list, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 55;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {koreaBenefitTabFragment, list, Boolean.valueOf(z)};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1509774173, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, 1509774209, iIAuthTabCallback);
        int i4 = isEngagementSignalsApiAvailable + 35;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object ICustomTabsCallbackDefault(Object[] objArr) {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 37;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback_Parcel = koreaBenefitTabFragment.IAuthTabCallback_Parcel();
        int i4 = isEngagementSignalsApiAvailable + 57;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback_Parcel;
    }

    public static final /* synthetic */ getNameByOperatorName ICustomTabsCallbackStub(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 31;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
        getNameByOperatorName getnamebyoperatorname = koreaBenefitTabFragment.ICustomTabsCallback;
        if (i4 == 0) {
            int i5 = 22 / 0;
        }
        int i6 = i2 + 17;
        mayLaunchUrl = i6 % 128;
        int i7 = i6 % 2;
        return getnamebyoperatorname;
    }

    public static final /* synthetic */ getScreenBrightnessInner ICustomTabsCallbackStubProxy(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 37;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        getScreenBrightnessInner getscreenbrightnessinnerIAuthTabCallbackStubProxy = koreaBenefitTabFragment.IAuthTabCallbackStubProxy();
        int i4 = isEngagementSignalsApiAvailable + 71;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return getscreenbrightnessinnerIAuthTabCallbackStubProxy;
    }

    public static final /* synthetic */ Rect ICustomTabsCallback_Parcel(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 59;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Rect rectExtraCallbackWithResult = koreaBenefitTabFragment.extraCallbackWithResult();
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        int i5 = mayLaunchUrl + 29;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return rectExtraCallbackWithResult;
    }

    public static final /* synthetic */ BasicSystemInfoExtension2 ICustomTabsService(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 41;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        BasicSystemInfoExtension2 basicSystemInfoExtension2WriteTypedObject = koreaBenefitTabFragment.writeTypedObject();
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        int i5 = isEngagementSignalsApiAvailable + 35;
        mayLaunchUrl = i5 % 128;
        int i6 = i5 % 2;
        return basicSystemInfoExtension2WriteTypedObject;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) throws Throwable {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 17;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        koreaBenefitTabFragment.ICustomTabsCallback_Parcel();
        int i4 = mayLaunchUrl + 63;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return null;
    }

    public static final /* synthetic */ String extraCommand(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 95;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {koreaBenefitTabFragment};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = (String) onExtraCallback(iIAuthTabCallback2, -2031980241, iIAuthTabCallback4, iIAuthTabCallback3, objArr, 2031980241, iIAuthTabCallback);
        int i4 = isEngagementSignalsApiAvailable + 119;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static final /* synthetic */ SessionTrackera isEngagementSignalsApiAvailable(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl;
        int i3 = i2 + 81;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        SessionTrackera sessionTrackera = koreaBenefitTabFragment.ICustomTabsCallbackStub;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 29;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return sessionTrackera;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 81;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        koreaBenefitTabFragment.mayLaunchUrl();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = isEngagementSignalsApiAvailable + 33;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ WorkflowUnit onActivityLayout(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 31;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        WorkflowUnit workflowUnit = koreaBenefitTabFragment.onExtraCallbackWithResult;
        if (i3 == 0) {
            return workflowUnit;
        }
        throw null;
    }

    public static final /* synthetic */ getOperatorName onActivityResized(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 109;
        int i3 = i2 % 128;
        mayLaunchUrl = i3;
        int i4 = i2 % 2;
        getOperatorName getoperatorname = koreaBenefitTabFragment.asInterface;
        if (i4 == 0) {
            int i5 = 52 / 0;
        }
        int i6 = i3 + 41;
        isEngagementSignalsApiAvailable = i6 % 128;
        int i7 = i6 % 2;
        return getoperatorname;
    }

    public static final /* synthetic */ void onExtraCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, KoreaBenefitTabViewModel.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl;
        int i3 = i2 + 105;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        koreaBenefitTabFragment.onPostMessage = iAuthTabCallback;
        int i5 = i2 + 87;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 67;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        KoreaBenefitTabViewModel koreaBenefitTabViewModelOnMessageChannelReady = koreaBenefitTabFragment.onMessageChannelReady();
        int i4 = mayLaunchUrl + 37;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return koreaBenefitTabViewModelOnMessageChannelReady;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(KoreaBenefitTabFragment koreaBenefitTabFragment, BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, startDeviceShakeListener startdeviceshakelistener) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 107;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            onExtraCallback(iIAuthTabCallback2, 1710221732, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment, benefitPremiumAdCollapsedView, startdeviceshakelistener}, -1710221717, iIAuthTabCallback);
            int i3 = 66 / 0;
        } else {
            int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback5 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback6 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            onExtraCallback(iIAuthTabCallback5, 1710221732, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback6, new Object[]{koreaBenefitTabFragment, benefitPremiumAdCollapsedView, startdeviceshakelistener}, -1710221717, iIAuthTabCallback4);
        }
        int i4 = isEngagementSignalsApiAvailable + 25;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ AddPhoneContactView onMessageChannelReady(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 89;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault = koreaBenefitTabFragment.IAuthTabCallbackDefault();
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return addPhoneContactViewIAuthTabCallbackDefault;
    }

    public static final /* synthetic */ void onNavigationEvent(KoreaBenefitTabFragment koreaBenefitTabFragment, KoreaBenefitTabViewModel.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 87;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
        koreaBenefitTabFragment.onRelationshipValidationResult = iAuthTabCallback;
        if (i4 == 0) {
            int i5 = 9 / 0;
        }
        int i6 = i2 + 89;
        mayLaunchUrl = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(KoreaBenefitTabFragment koreaBenefitTabFragment, String str) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 111;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        koreaBenefitTabFragment.onExtraCallback(str);
        int i4 = isEngagementSignalsApiAvailable + 123;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ BenefitTabImpressionHandler onRelationshipValidationResult(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl;
        int i3 = i2 + 5;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        BenefitTabImpressionHandler benefitTabImpressionHandler = koreaBenefitTabFragment.access000;
        int i5 = i2 + 37;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            return benefitTabImpressionHandler;
        }
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 109;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        boolean zAsInterface = koreaBenefitTabFragment.asInterface();
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        return Boolean.valueOf(zAsInterface);
    }

    public static final /* synthetic */ VideoAdsController onUnminimized(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 91;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            koreaBenefitTabFragment.access100();
            throw null;
        }
        VideoAdsController videoAdsControllerAccess100 = koreaBenefitTabFragment.access100();
        int i3 = isEngagementSignalsApiAvailable + 97;
        mayLaunchUrl = i3 % 128;
        if (i3 % 2 != 0) {
            return videoAdsControllerAccess100;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(KoreaBenefitTabFragment koreaBenefitTabFragment, KoreaBenefitTabViewModel.IAuthTabCallback iAuthTabCallback) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 121;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback2, 450848413, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment, iAuthTabCallback}, -450848392, iIAuthTabCallback);
        int i4 = isEngagementSignalsApiAvailable + 111;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
    }

    public static final /* synthetic */ boolean onWarmupCompleted(KoreaBenefitTabFragment koreaBenefitTabFragment, SensorBridgeExtension3 sensorBridgeExtension3, String str) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 53;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = koreaBenefitTabFragment.onWarmupCompleted(sensorBridgeExtension3, str);
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        return zOnWarmupCompleted;
    }

    public static final /* synthetic */ void postMessage(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 121;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        koreaBenefitTabFragment.postMessage();
        int i4 = mayLaunchUrl + 85;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void prefetch(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 77;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        koreaBenefitTabFragment.extraCommand();
        int i4 = isEngagementSignalsApiAvailable + 37;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public KoreaBenefitTabFragment() {
        super(R.layout.benefit_pillar_fragment);
        this.readTypedObject = ea10.onExtraCallbackWithResult("BenefitTab");
        this.onTransact = preFillDefault.IAuthTabCallback(this, onNavigationEvent.onExtraCallback);
        Lazy lazyOnNavigationEvent = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onRelationshipValidationResult(new ICustomTabsCallbackDefault(this)));
        this.ICustomTabsCallback_Parcel = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(KoreaBenefitTabViewModel.class), new ICustomTabsCallbackStub(lazyOnNavigationEvent), new mayLaunchUrl(null, lazyOnNavigationEvent), new extraCommand(this, lazyOnNavigationEvent));
        this.asInterface = new getOperatorName();
        this.ICustomTabsCallbackStubProxy = new Rect();
        this.onUnminimized = new KoreaBenefitTabFragment$.ExternalSyntheticLambda46(this);
        this.IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new KoreaBenefitTabFragment$.ExternalSyntheticLambda47(this));
        this.onMessageChannelReady = LazyKt.onExtraCallbackWithResult(new KoreaBenefitTabFragment$.ExternalSyntheticLambda48(this));
        this.onActivityResized = LazyKt.onExtraCallbackWithResult(new KoreaBenefitTabFragment$.ExternalSyntheticLambda49(this));
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_ParcelRegisterForActivityResult = registerForActivityResult(new IPostMessageService_Parcel.asInterface(), new KoreaBenefitTabFragment$.ExternalSyntheticLambda50(this));
        Intrinsics.checkNotNullExpressionValue(iEngagementSignalsCallback_ParcelRegisterForActivityResult, "");
        this.writeTypedObject = iEngagementSignalsCallback_ParcelRegisterForActivityResult;
        this.ICustomTabsCallbackStub = AppLovinAdImpl.IAuthTabCallback(this, new KoreaBenefitTabFragment$.ExternalSyntheticLambda51(this));
        this.ICustomTabsCallbackDefault = new ICustomTabsService();
        this.extraCallbackWithResult = new AtomicBoolean(true);
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function1<View, AddPhoneContactView> {
        private static int IAuthTabCallback = 0;
        public static final onNavigationEvent onExtraCallback = new onNavigationEvent();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        onNavigationEvent() {
            super(1, AddPhoneContactView.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/benefit/databinding/BenefitPillarFragmentBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AddPhoneContactView addPhoneContactViewOnExtraCallback = onExtraCallback((View) obj);
            int i4 = IAuthTabCallback + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return addPhoneContactViewOnExtraCallback;
        }

        public final AddPhoneContactView onExtraCallback(View view) {
            AddPhoneContactView addPhoneContactViewOnNavigationEvent;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(view, "");
                addPhoneContactViewOnNavigationEvent = AddPhoneContactView.onNavigationEvent(view);
                int i3 = 79 / 0;
            } else {
                Intrinsics.checkNotNullParameter(view, "");
                addPhoneContactViewOnNavigationEvent = AddPhoneContactView.onNavigationEvent(view);
            }
            int i4 = IAuthTabCallback + 41;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return addPhoneContactViewOnNavigationEvent;
            }
            throw null;
        }
    }

    private final AddPhoneContactView IAuthTabCallbackDefault() {
        PageRenderReadyListener pageRenderReadyListener;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 31;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            pageRenderReadyListener = this.onTransact;
            addallcommandline = onExtraCallback[0];
        } else {
            pageRenderReadyListener = this.onTransact;
            addallcommandline = onExtraCallback[0];
        }
        return pageRenderReadyListener.onNavigationEvent(this, addallcommandline);
    }

    private final KoreaBenefitTabViewModel onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 25;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        KoreaBenefitTabViewModel koreaBenefitTabViewModel = (KoreaBenefitTabViewModel) this.ICustomTabsCallback_Parcel.getValue();
        if (i3 != 0) {
            return koreaBenefitTabViewModel;
        }
        throw null;
    }

    private static final void IAuthTabCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, boolean z) {
        int i = 2 % 2;
        if (!(!z)) {
            koreaBenefitTabFragment.onMessageChannelReady().postMessage();
            int i2 = mayLaunchUrl + 39;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = mayLaunchUrl + 83;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    public InventoryAdManager updateVisuals() {
        int i = 2 % 2;
        InventoryAdManager inventoryAdManager = this.inventoryAdManager;
        if (inventoryAdManager != null) {
            int i2 = mayLaunchUrl + 23;
            int i3 = i2 % 128;
            isEngagementSignalsApiAvailable = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 61;
            mayLaunchUrl = i5 % 128;
            int i6 = i5 % 2;
            return inventoryAdManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = mayLaunchUrl + 123;
        isEngagementSignalsApiAvailable = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = im.toss.features.benefit.ui.KoreaBenefitTabFragment.isEngagementSignalsApiAvailable + 29;
        im.toss.features.benefit.ui.KoreaBenefitTabFragment.mayLaunchUrl = r1 % 128;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        throw null;
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
    public NativeAdsManager onNavigationEvent() {
        NativeAdsManager nativeAdsManager;
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 21;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            nativeAdsManager = this.nativeAdsManager;
            int i3 = 26 / 0;
        } else {
            nativeAdsManager = this.nativeAdsManager;
        }
    }

    public final SessionTrackerb onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 45;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.router;
        if (sessionTrackerb != null) {
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = mayLaunchUrl + 5;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return null;
    }

    public final getDummyAd asBinder() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 25;
        mayLaunchUrl = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        getDummyAd getdummyad = this.standardTermsV2Intent;
        if (getdummyad == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 103;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return getdummyad;
    }

    private final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 23;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            getArguments();
            throw null;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        String string = arguments.getString("highlightServiceType");
        int i3 = isEngagementSignalsApiAvailable + 65;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        Bundle arguments = ((KoreaBenefitTabFragment) objArr[0]).getArguments();
        if (arguments != null) {
            int i2 = isEngagementSignalsApiAvailable + 23;
            mayLaunchUrl = i2 % 128;
            int i3 = i2 % 2;
            return arguments.getString("scrollToSection");
        }
        int i4 = mayLaunchUrl + 125;
        isEngagementSignalsApiAvailable = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r1
      0x001f: PHI (r1v5 android.os.Bundle) = (r1v4 android.os.Bundle), (r1v10 android.os.Bundle) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean asInterface() {
        Bundle arguments;
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 63;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            arguments = getArguments();
            int i3 = 43 / 0;
            if (arguments != null) {
                if (arguments.getBoolean("from_home_launcher")) {
                    int i4 = mayLaunchUrl + 29;
                    isEngagementSignalsApiAvailable = i4 % 128;
                    return i4 % 2 == 0;
                }
            }
        } else {
            arguments = getArguments();
            if (arguments != null) {
            }
        }
        return false;
    }

    private final setResultAccount onTransact() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 119;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        setResultAccount setresultaccount = (setResultAccount) this.IAuthTabCallbackStub.getValue();
        int i4 = mayLaunchUrl + 49;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return setresultaccount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final setResultAccount newAuthTabSession(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        setResultAccount setresultaccount = new setResultAccount(new KoreaBenefitTabFragment$.ExternalSyntheticLambda28(koreaBenefitTabFragment), new KoreaBenefitTabFragment$.ExternalSyntheticLambda29(koreaBenefitTabFragment), new KoreaBenefitTabFragment$.ExternalSyntheticLambda30(koreaBenefitTabFragment));
        int i2 = isEngagementSignalsApiAvailable + 81;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 18 / 0;
        }
        return setresultaccount;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 117;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {koreaBenefitTabFragment.onMessageChannelReady()};
        Map map = (Map) ((setRubIn) KoreaBenefitTabViewModel.IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr2, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1189219495, -1189219490)).IAuthTabCallback();
        int i4 = isEngagementSignalsApiAvailable + 63;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
        return map;
    }

    private static final DeviceOrientationBridgeExtension.onExtraCallback prefetchWithMultipleUrls(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 27;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        DeviceOrientationBridgeExtension.onExtraCallback onextracallback = (DeviceOrientationBridgeExtension.onExtraCallback) koreaBenefitTabFragment.onMessageChannelReady().IAuthTabCallback_Parcel().IAuthTabCallback();
        int i4 = mayLaunchUrl + 25;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return onextracallback;
        }
        throw null;
    }

    private static final boolean setEngagementSignalsCallback(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 9;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        boolean zNewAuthTabSession = koreaBenefitTabFragment.onMessageChannelReady().newAuthTabSession();
        int i4 = mayLaunchUrl + 7;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return zNewAuthTabSession;
    }

    private final BasicSystemInfoExtension2 writeTypedObject() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 57;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        BasicSystemInfoExtension2 basicSystemInfoExtension2 = (BasicSystemInfoExtension2) this.onMessageChannelReady.getValue();
        int i3 = isEngagementSignalsApiAvailable + 123;
        mayLaunchUrl = i3 % 128;
        if (i3 % 2 != 0) {
            return basicSystemInfoExtension2;
        }
        obj.hashCode();
        throw null;
    }

    private static final BasicSystemInfoExtension2 IEngagementSignalsCallback(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        KoreaBenefitTabFragment$.ExternalSyntheticLambda42 externalSyntheticLambda42 = new KoreaBenefitTabFragment$.ExternalSyntheticLambda42(koreaBenefitTabFragment);
        SessionTrackerb sessionTrackerbOnExtraCallbackWithResult = koreaBenefitTabFragment.onExtraCallbackWithResult();
        KoreaBenefitTabFragment$.ExternalSyntheticLambda43 externalSyntheticLambda43 = new KoreaBenefitTabFragment$.ExternalSyntheticLambda43(koreaBenefitTabFragment);
        KoreaBenefitTabFragment$.ExternalSyntheticLambda44 externalSyntheticLambda44 = new KoreaBenefitTabFragment$.ExternalSyntheticLambda44(koreaBenefitTabFragment);
        KoreaBenefitTabFragment$.ExternalSyntheticLambda45 externalSyntheticLambda45 = new KoreaBenefitTabFragment$.ExternalSyntheticLambda45(koreaBenefitTabFragment);
        extraCallback extracallback = new extraCallback(koreaBenefitTabFragment.onMessageChannelReady());
        readTypedObject readtypedobject = new readTypedObject(koreaBenefitTabFragment.onMessageChannelReady());
        Object[] objArr = {koreaBenefitTabFragment.onMessageChannelReady()};
        BasicSystemInfoExtension2 basicSystemInfoExtension2 = new BasicSystemInfoExtension2(koreaBenefitTabFragment, externalSyntheticLambda42, sessionTrackerbOnExtraCallbackWithResult, externalSyntheticLambda43, externalSyntheticLambda44, externalSyntheticLambda45, (Function0) null, extracallback, readtypedobject, (registerBatteryReceiver) KoreaBenefitTabViewModel.IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -2074279075, 2074279093), 64, (DefaultConstructorMarker) null);
        int i2 = mayLaunchUrl + 99;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return basicSystemInfoExtension2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final AddPhoneContactView writeTypedList(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 53;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault = koreaBenefitTabFragment.IAuthTabCallbackDefault();
        int i4 = isEngagementSignalsApiAvailable + 91;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            return addPhoneContactViewIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final RecyclerView ICustomTabsService_Parcel(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 37;
        mayLaunchUrl = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            koreaBenefitTabFragment.IAuthTabCallbackDefault();
            obj.hashCode();
            throw null;
        }
        AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault = koreaBenefitTabFragment.IAuthTabCallbackDefault();
        if (addPhoneContactViewIAuthTabCallbackDefault == null) {
            return null;
        }
        int i3 = isEngagementSignalsApiAvailable + 85;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
        TdsRecyclerView tdsRecyclerView = addPhoneContactViewIAuthTabCallbackDefault.onActivityLayout;
        if (i4 != 0) {
            return tdsRecyclerView;
        }
        obj.hashCode();
        throw null;
    }

    private static final boolean access200(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 55;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        boolean zAsInterface = koreaBenefitTabFragment.asInterface();
        int i4 = isEngagementSignalsApiAvailable + 83;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            return zAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final /* synthetic */ class extraCallback extends FunctionReferenceImpl implements Function1<String, Boolean> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        extraCallback(Object obj) {
            super(1, obj, KoreaBenefitTabViewModel.class, "isPremiumAdHeaderExpanded", "isPremiumAdHeaderExpanded(Ljava/lang/String;)Z", 0);
        }

        public final Boolean IAuthTabCallback(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                return Boolean.valueOf(((KoreaBenefitTabViewModel) ((CallableReference) this).receiver).onNavigationEvent(str));
            }
            Intrinsics.checkNotNullParameter(str, "");
            Boolean.valueOf(((KoreaBenefitTabViewModel) ((CallableReference) this).receiver).onNavigationEvent(str));
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolIAuthTabCallback = IAuthTabCallback((String) obj);
            int i4 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return boolIAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    private static final Unit onExtraCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, boolean z, Integer num) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 105;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (!z) {
            num = null;
        }
        koreaBenefitTabFragment.getInterfaceDescriptor = num;
        koreaBenefitTabFragment.newAuthTabSession();
        koreaBenefitTabFragment.prefetch();
        koreaBenefitTabFragment.mayLaunchUrl();
        Unit unit = Unit.INSTANCE;
        int i3 = isEngagementSignalsApiAvailable + 103;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    static final /* synthetic */ class readTypedObject extends FunctionReferenceImpl implements Function2<String, Boolean, Unit> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        readTypedObject(Object obj) {
            super(2, obj, KoreaBenefitTabViewModel.class, "updatePremiumAdHeaderExpandedState", "updatePremiumAdHeaderExpandedState(Ljava/lang/String;Z)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((String) obj, ((Boolean) obj2).booleanValue());
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 68 / 0;
            }
            return unit;
        }

        public final void onExtraCallback(String str, boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ((KoreaBenefitTabViewModel) ((CallableReference) this).receiver).onWarmupCompleted(str, z);
            int i4 = onExtraCallback + 63;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 1 / 0;
            }
        }
    }

    private final getScreenBrightnessInner IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 49;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        getScreenBrightnessInner getscreenbrightnessinner = (getScreenBrightnessInner) this.onActivityResized.getValue();
        int i4 = mayLaunchUrl + 17;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return getscreenbrightnessinner;
    }

    private static final getScreenBrightnessInner requestPostMessageChannelWithExtras(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        getScreenBrightnessInner getscreenbrightnessinner = new getScreenBrightnessInner(koreaBenefitTabFragment, koreaBenefitTabFragment.onExtraCallbackWithResult(), new KoreaBenefitTabFragment$.ExternalSyntheticLambda16(koreaBenefitTabFragment), new KoreaBenefitTabFragment$.ExternalSyntheticLambda17(koreaBenefitTabFragment), new KoreaBenefitTabFragment$.ExternalSyntheticLambda18(koreaBenefitTabFragment), new KoreaBenefitTabFragment$.ExternalSyntheticLambda19(koreaBenefitTabFragment), new KoreaBenefitTabFragment$.ExternalSyntheticLambda20(koreaBenefitTabFragment), new KoreaBenefitTabFragment$.ExternalSyntheticLambda21(koreaBenefitTabFragment));
        int i2 = mayLaunchUrl + 31;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 41 / 0;
        }
        return getscreenbrightnessinner;
    }

    private static final AddPhoneContactView ICustomTabsServiceDefault(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 123;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            koreaBenefitTabFragment.IAuthTabCallbackDefault();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault = koreaBenefitTabFragment.IAuthTabCallbackDefault();
        int i3 = isEngagementSignalsApiAvailable + 7;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
        return addPhoneContactViewIAuthTabCallbackDefault;
    }

    private static final getNameByOperatorName validateRelationship(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 107;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        getNameByOperatorName getnamebyoperatorname = koreaBenefitTabFragment.ICustomTabsCallback;
        if (i3 == 0) {
            int i4 = 62 / 0;
            if (getnamebyoperatorname != null) {
                return getnamebyoperatorname;
            }
        } else if (getnamebyoperatorname != null) {
            return getnamebyoperatorname;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i5 = isEngagementSignalsApiAvailable + 105;
        mayLaunchUrl = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static final boolean updateVisuals(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 101;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        boolean zAsInterface = koreaBenefitTabFragment.asInterface();
        int i4 = isEngagementSignalsApiAvailable + 99;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            return zAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 105;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            koreaBenefitTabFragment.getArguments();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Bundle arguments = koreaBenefitTabFragment.getArguments();
        int i3 = isEngagementSignalsApiAvailable + 77;
        mayLaunchUrl = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 94 / 0;
        }
        return arguments;
    }

    private static final Unit warmup(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        Unit unit;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 113;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        koreaBenefitTabFragment.onMessageChannelReady().IAuthTabCallbackStubProxy();
        if (i3 == 0) {
            unit = Unit.INSTANCE;
            int i4 = 82 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i5 = mayLaunchUrl + 19;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit ICustomTabsServiceStubProxy(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 55;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        koreaBenefitTabFragment.onMessageChannelReady().onExtraCallbackWithResult(KoreaBenefitTabViewModel$onTransact.ALARM_OFF);
        Unit unit = Unit.INSTANCE;
        int i4 = mayLaunchUrl + 67;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return unit;
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                int i2 = IAuthTabCallback + 59;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onWarmupCompleted + 7;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    private static final Unit onWarmupCompleted(KoreaBenefitTabFragment koreaBenefitTabFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()) {
            int i2 = mayLaunchUrl + 71;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onWarmupCompleted() == r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent.AGREED) {
                FragmentActivity fragmentActivityRequireActivity = koreaBenefitTabFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                String string = koreaBenefitTabFragment.getString(R$string.benefit_agree_notification);
                Intrinsics.checkNotNullExpressionValue(string, "");
                TdsToastV1.onNavigationEvent onNavigationEvent2 = TdsToastV1.onNavigationEvent.onNavigationEvent(new TdsToastV1.onNavigationEvent(fragmentActivityRequireActivity, string), viva.republica.toss.R.drawable.icn_success_color, 0, 2, (Object) null);
                Context contextRequireContext = koreaBenefitTabFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                onNavigationEvent2.onExtraCallback(varyMatches.IAuthTabCallback(20, contextRequireContext)).onExtraCallback();
                int i4 = isEngagementSignalsApiAvailable + 7;
                mayLaunchUrl = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        Object[] objArr = {koreaBenefitTabFragment.onMessageChannelReady()};
        KoreaBenefitTabViewModel.IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 937834570, -937834564);
        return Unit.INSTANCE;
    }

    private final String ICustomTabsCallback() throws Throwable {
        int i = 2 % 2;
        Bundle arguments = getArguments();
        if (arguments == null) {
            return "";
        }
        Object[] objArr = new Object[1];
        a(new char[]{57184, 3303, 25440, 27218, 57106, 58973, 46776, 43690, 29806, 39630, 57919, 1593}, 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        String string = arguments.getString(((String) objArr[0]).intern());
        if (string == null) {
            return "";
        }
        int i2 = isEngagementSignalsApiAvailable + 47;
        int i3 = i2 % 128;
        mayLaunchUrl = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 113;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    private static final Unit onNavigationEvent(long j, int i, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = mayLaunchUrl + 95;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("point_amount", Long.valueOf(j));
        setDetectableSize.onExtraCallback("total_card_cnt", Integer.valueOf(i));
        Unit unit = Unit.INSTANCE;
        int i5 = mayLaunchUrl + 125;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private final void onExtraCallbackWithResult(long j, int i) throws Throwable {
        int i2 = 2 % 2;
        TinyAppHostApduService1.onWarmupCompleted(TinyAppHostApduService1.onNavigationEvent, 1008137L, (Map) null, false, new KoreaBenefitTabFragment$.ExternalSyntheticLambda26(j, i), 6, (Object) null);
        SessionTrackerb sessionTrackerbOnExtraCallbackWithResult = onExtraCallbackWithResult();
        Context contextRequireContext = requireContext();
        Object[] objArr = new Object[1];
        a(new char[]{47592, 30315, 30447, 51718, 47515, 40145, 41763, 2797, 4861, 57427, 63408, 42603, 61311, 14287, 23082, 56745, 48051, 39703, 44735, 2418, 5238, 61121, 62759, 42210, 57584, 12813, 22961, 53358, 48482, 39299, 44068, 4090, 2465, 60760, 61602, 47982, 57958, 12448, 18254, 54793, 48849, 33846, 43920, 3469, 2882, 60345, 65035, 47438, 59336, 16185, 17055, 54440, 45146, 33441, 43279, 14, 3266, 54825, 64913}, (ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr);
        SessionTrackerb.onExtraCallbackWithResult(sessionTrackerbOnExtraCallbackWithResult, contextRequireContext, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i3 = isEngagementSignalsApiAvailable + 39;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[1];
        startDeviceShakeListener startdeviceshakelistener = (startDeviceShakeListener) objArr[2];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 81;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        koreaBenefitTabFragment.writeTypedObject().onNavigationEvent(benefitPremiumAdCollapsedView, startdeviceshakelistener);
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Rect readTypedObject() {
        View view;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 11;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        Rect rect = null;
        if (addPhoneContactViewIAuthTabCallbackDefault != null && (view = addPhoneContactViewIAuthTabCallbackDefault.onPostMessage) != null) {
            if (view.getVisibility() == 0) {
                int i4 = mayLaunchUrl + 69;
                isEngagementSignalsApiAvailable = i4 % 128;
                int i5 = i4 % 2;
                if (view.getHeight() <= 0) {
                    view = null;
                }
                if (view != null) {
                    int i6 = mayLaunchUrl + 71;
                    isEngagementSignalsApiAvailable = i6 % 128;
                    int i7 = i6 % 2;
                    if (!(!view.getGlobalVisibleRect(this.ICustomTabsCallbackStubProxy))) {
                        int i8 = isEngagementSignalsApiAvailable;
                        int i9 = i8 + 25;
                        mayLaunchUrl = i9 % 128;
                        int i10 = i9 % 2;
                        rect = this.ICustomTabsCallbackStubProxy;
                        int i11 = i8 + 55;
                        mayLaunchUrl = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i12 = 8 / 0;
                        }
                    }
                }
            }
        }
        return rect;
    }

    private final Rect extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 121;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Rect typedObject = readTypedObject();
        int i4 = mayLaunchUrl + 9;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return typedObject;
        }
        throw null;
    }

    private final void mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 33;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (addPhoneContactViewIAuthTabCallbackDefault != null) {
            int i4 = isEngagementSignalsApiAvailable + 125;
            mayLaunchUrl = i4 % 128;
            int i5 = i4 % 2;
            TdsRecyclerView tdsRecyclerView = addPhoneContactViewIAuthTabCallbackDefault.onActivityLayout;
            if (tdsRecyclerView != null) {
                tdsRecyclerView.post(new KoreaBenefitTabFragment$.ExternalSyntheticLambda25(this));
            }
        }
    }

    private static final void onVerticalScrollEvent(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 119;
        mayLaunchUrl = i2 % 128;
        BenefitTabImpressionHandler benefitTabImpressionHandler = null;
        if (i2 % 2 != 0) {
            koreaBenefitTabFragment.postMessage();
            BenefitTabImpressionHandler benefitTabImpressionHandler2 = koreaBenefitTabFragment.access000;
            if (benefitTabImpressionHandler2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                benefitTabImpressionHandler2 = null;
            }
            int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            BenefitTabImpressionHandler.onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1316068765, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1316068759, iIAuthTabCallback, new Object[]{benefitTabImpressionHandler2});
            BenefitTabImpressionHandler benefitTabImpressionHandler3 = koreaBenefitTabFragment.access000;
            if (benefitTabImpressionHandler3 == null) {
                int i3 = mayLaunchUrl + 45;
                isEngagementSignalsApiAvailable = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                benefitTabImpressionHandler = benefitTabImpressionHandler3;
            }
            benefitTabImpressionHandler.IAuthTabCallback("topOverlayVisibilityChanged");
            koreaBenefitTabFragment.onNavigationEvent().onTransact();
            koreaBenefitTabFragment.updateVisuals().IAuthTabCallback_Parcel();
            return;
        }
        koreaBenefitTabFragment.postMessage();
        BenefitTabImpressionHandler benefitTabImpressionHandler4 = koreaBenefitTabFragment.access000;
        benefitTabImpressionHandler.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051 A[PHI: r4
      0x0051: PHI (r4v6 android.graphics.Rect) = (r4v5 android.graphics.Rect), (r4v10 android.graphics.Rect) binds: [B:20:0x004f, B:16:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void postMessage() {
        TdsRecyclerView tdsRecyclerView;
        Rect rectExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 37;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (addPhoneContactViewIAuthTabCallbackDefault != null) {
            int i4 = isEngagementSignalsApiAvailable + 65;
            mayLaunchUrl = i4 % 128;
            int iCoerceAtLeast = 0;
            if (i4 % 2 == 0) {
                tdsRecyclerView = addPhoneContactViewIAuthTabCallbackDefault.onActivityLayout;
                int i5 = 39 / 0;
                if (tdsRecyclerView == null) {
                    return;
                }
            } else {
                tdsRecyclerView = addPhoneContactViewIAuthTabCallbackDefault.onActivityLayout;
                if (tdsRecyclerView == null) {
                    return;
                }
            }
            Rect rect = new Rect();
            if (!(!tdsRecyclerView.getGlobalVisibleRect(rect))) {
                int i6 = isEngagementSignalsApiAvailable + 85;
                mayLaunchUrl = i6 % 128;
                if (i6 % 2 == 0) {
                    rectExtraCallbackWithResult = extraCallbackWithResult();
                    if (rectExtraCallbackWithResult != null) {
                        iCoerceAtLeast = RangesKt.coerceAtLeast(rectExtraCallbackWithResult.bottom - rect.top, 0);
                        int i7 = isEngagementSignalsApiAvailable + 115;
                        mayLaunchUrl = i7 % 128;
                        int i8 = i7 % 2;
                    } else {
                        iCoerceAtLeast = 1;
                    }
                } else {
                    rectExtraCallbackWithResult = extraCallbackWithResult();
                    if (rectExtraCallbackWithResult != null) {
                    }
                }
                tdsRecyclerView.setTopCoverHeightForImpression(iCoerceAtLeast);
            }
        }
    }

    public final void onWarmupCompleted(@NotNull ShakeMonitorBridgeExtension shakeMonitorBridgeExtension, @NotNull CardsV2.PointBackInfo.BankCardCashBackBanner bankCardCashBackBanner) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(shakeMonitorBridgeExtension, "");
        Intrinsics.checkNotNullParameter(bankCardCashBackBanner, "");
        TinyAppHostApduService1.onWarmupCompleted(TinyAppHostApduService1.onNavigationEvent, 5182446L, ChoosePhoneContactBridgeExtension1.onExtraCallbackWithResult.onNavigationEvent(shakeMonitorBridgeExtension, bankCardCashBackBanner), false, (Function1) null, 12, (Object) null);
        String strOnExtraCallbackWithResult = bankCardCashBackBanner.onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult != null) {
            int i2 = isEngagementSignalsApiAvailable + 53;
            mayLaunchUrl = i2 % 128;
            if (i2 % 2 == 0) {
                StringsKt.isBlank(strOnExtraCallbackWithResult);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!StringsKt.isBlank(strOnExtraCallbackWithResult)) {
                SessionTrackerb.onExtraCallbackWithResult(onExtraCallbackWithResult(), requireContext(), strOnExtraCallbackWithResult, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            }
        }
        int i3 = isEngagementSignalsApiAvailable + 9;
        mayLaunchUrl = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 66 / 0;
        }
    }

    public void onRetry() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 49;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(false);
        } else {
            onWarmupCompleted(true);
        }
        int i3 = isEngagementSignalsApiAvailable + 91;
        mayLaunchUrl = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 34 / 0;
        }
    }

    public static final class ICustomTabsService implements VideoAdsController.onExtraCallback {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public static /* synthetic */ Unit onExtraCallback(String str, Throwable th) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(str, th);
            int i4 = onExtraCallback + 87;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return unitIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit onWarmupCompleted(String str, Throwable th) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(str, th);
            }
            onExtraCallbackWithResult(str, th);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.features.benefit.ui.component.VideoAdsController.onExtraCallback
        public void IAuthTabCallback(VideoAdsController.asBinder asbinder, long j) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(asbinder, "");
            int i4 = onExtraCallbackWithResult + 67;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // im.toss.features.benefit.ui.component.VideoAdsController.onExtraCallback
        public void onExtraCallback(VideoAdsController.onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            int i4 = onExtraCallbackWithResult + 95;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        @Override // im.toss.features.benefit.ui.component.VideoAdsController.onExtraCallback
        public void onExtraCallbackWithResult(VideoAdsController.asBinder asbinder) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(asbinder, "");
            int i4 = onExtraCallbackWithResult + 7;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        ICustomTabsService() {
        }

        @Override // im.toss.features.benefit.ui.component.VideoAdsController.onExtraCallback
        public void onExtraCallback() {
            AdsInfo adsInfoOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KoreaBenefitTabViewModel.onExtraCallback onextracallback = (KoreaBenefitTabViewModel.onExtraCallback) ((setRubIn) KoreaBenefitTabViewModel.IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{(KoreaBenefitTabViewModel) KoreaBenefitTabFragment.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 493663387, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{KoreaBenefitTabFragment.this}, -493663383, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback())}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1984849363, 1984849382)).IAuthTabCallback();
            if (onextracallback != null && (adsInfoOnWarmupCompleted = onextracallback.onWarmupCompleted()) != null) {
                ((KoreaBenefitTabViewModel) KoreaBenefitTabFragment.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 493663387, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{KoreaBenefitTabFragment.this}, -493663383, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback())).onExtraCallbackWithResult(adsInfoOnWarmupCompleted);
                int i3 = onExtraCallbackWithResult + 57;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            int i5 = onExtraCallbackWithResult + 13;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 59 / 0;
            }
        }

        @Override // im.toss.features.benefit.ui.component.VideoAdsController.onExtraCallback
        public void onWarmupCompleted() {
            AdsInfo adsInfoOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                KoreaBenefitTabViewModel.onExtraCallback onextracallback = (KoreaBenefitTabViewModel.onExtraCallback) ((setRubIn) KoreaBenefitTabViewModel.IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{(KoreaBenefitTabViewModel) KoreaBenefitTabFragment.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 493663387, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{KoreaBenefitTabFragment.this}, -493663383, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback())}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1984849363, 1984849382)).IAuthTabCallback();
                if (onextracallback == null || (adsInfoOnWarmupCompleted = onextracallback.onWarmupCompleted()) == null) {
                    return;
                }
                ((KoreaBenefitTabViewModel) KoreaBenefitTabFragment.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 493663387, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{KoreaBenefitTabFragment.this}, -493663383, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback())).onNavigationEvent(adsInfoOnWarmupCompleted);
                String str = (String) AdsInfo.onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{adsInfoOnWarmupCompleted}, 1447979238, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1447979237);
                KoreaBenefitTabViewModel koreaBenefitTabViewModel = (KoreaBenefitTabViewModel) KoreaBenefitTabFragment.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 493663387, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{KoreaBenefitTabFragment.this}, -493663383, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
                Context contextRequireContext = KoreaBenefitTabFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                KoreaBenefitTabViewModel.onExtraCallbackWithResult(koreaBenefitTabViewModel, contextRequireContext, str, false, new KoreaBenefitTabFragment$videoCallback$1$.ExternalSyntheticLambda1(str), 4, (Object) null);
                int i3 = onExtraCallbackWithResult + 9;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            throw null;
        }

        private static final Unit IAuthTabCallback(String str, Throwable th) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "BenefitTab", "onMoreClick route:" + str, th, (Map) null, 8, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i2 = onExtraCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00c4 A[PHI: r2
          0x00c4: PHI (r2v13 im.toss.features.benefit.dto.AdsInfo) = (r2v12 im.toss.features.benefit.dto.AdsInfo), (r2v22 im.toss.features.benefit.dto.AdsInfo) binds: [B:15:0x00c2, B:12:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00a9 A[PHI: r2
          0x00a9: PHI (r2v11 im.toss.features.benefit.ui.KoreaBenefitTabViewModel$onExtraCallback) = 
          (r2v10 im.toss.features.benefit.ui.KoreaBenefitTabViewModel$onExtraCallback)
          (r2v32 im.toss.features.benefit.ui.KoreaBenefitTabViewModel$onExtraCallback)
         binds: [B:8:0x00a7, B:5:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // im.toss.features.benefit.ui.component.VideoAdsController.onExtraCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onExtraCallbackWithResult() {
            KoreaBenefitTabViewModel.onExtraCallback onextracallback;
            AdsInfo adsInfoOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr = {KoreaBenefitTabFragment.this};
                int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                Object[] objArr2 = {(KoreaBenefitTabViewModel) KoreaBenefitTabFragment.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 493663387, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, -493663383, iIAuthTabCallback)};
                onextracallback = (KoreaBenefitTabViewModel.onExtraCallback) ((setRubIn) KoreaBenefitTabViewModel.IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr2, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1984849363, 1984849382)).IAuthTabCallback();
                int i3 = 51 / 0;
                if (onextracallback != null) {
                    int i4 = onExtraCallback + 15;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        adsInfoOnWarmupCompleted = onextracallback.onWarmupCompleted();
                        int i5 = 2 / 0;
                        if (adsInfoOnWarmupCompleted != null) {
                            Object[] objArr3 = {KoreaBenefitTabFragment.this};
                            int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                            ((KoreaBenefitTabViewModel) KoreaBenefitTabFragment.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 493663387, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr3, -493663383, iIAuthTabCallback2)).onNavigationEvent(adsInfoOnWarmupCompleted);
                            int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                            String str = (String) AdsInfo.onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{adsInfoOnWarmupCompleted}, 1447979238, iOnWarmupCompleted, -1447979237);
                            Object[] objArr4 = {KoreaBenefitTabFragment.this};
                            int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                            KoreaBenefitTabViewModel koreaBenefitTabViewModel = (KoreaBenefitTabViewModel) KoreaBenefitTabFragment.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 493663387, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr4, -493663383, iIAuthTabCallback3);
                            Context contextRequireContext = KoreaBenefitTabFragment.this.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                            KoreaBenefitTabViewModel.onExtraCallbackWithResult(koreaBenefitTabViewModel, contextRequireContext, str, false, new KoreaBenefitTabFragment$videoCallback$1$.ExternalSyntheticLambda0(str), 4, (Object) null);
                            int i6 = onExtraCallback + 31;
                            onExtraCallbackWithResult = i6 % 128;
                            int i7 = i6 % 2;
                        }
                    } else {
                        adsInfoOnWarmupCompleted = onextracallback.onWarmupCompleted();
                        if (adsInfoOnWarmupCompleted != null) {
                        }
                    }
                }
            } else {
                Object[] objArr5 = {KoreaBenefitTabFragment.this};
                int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                Object[] objArr6 = {(KoreaBenefitTabViewModel) KoreaBenefitTabFragment.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 493663387, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr5, -493663383, iIAuthTabCallback4)};
                onextracallback = (KoreaBenefitTabViewModel.onExtraCallback) ((setRubIn) KoreaBenefitTabViewModel.IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr6, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1984849363, 1984849382)).IAuthTabCallback();
                if (onextracallback != null) {
                }
            }
            int i8 = onExtraCallbackWithResult + 105;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 8 / 0;
            }
        }

        private static final Unit onExtraCallbackWithResult(String str, Throwable th) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "BenefitTab", "onLandingClick route:" + str, th, (Map) null, 8, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i2 = onExtraCallback + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return unit;
        }

        @Override // im.toss.features.benefit.ui.component.VideoAdsController.onExtraCallback
        public void onNavigationEvent(int i) {
            int i2 = 2 % 2;
            Object[] objArr = {KoreaBenefitTabFragment.this};
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            Object[] objArr2 = {(KoreaBenefitTabViewModel) KoreaBenefitTabFragment.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 493663387, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, -493663383, iIAuthTabCallback)};
            KoreaBenefitTabViewModel.onExtraCallback onextracallback = (KoreaBenefitTabViewModel.onExtraCallback) ((setRubIn) KoreaBenefitTabViewModel.IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr2, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1984849363, 1984849382)).IAuthTabCallback();
            if (onextracallback != null) {
                int i3 = onExtraCallback + 119;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                AdsInfo adsInfoOnWarmupCompleted = onextracallback.onWarmupCompleted();
                if (adsInfoOnWarmupCompleted != null) {
                    int i5 = onExtraCallbackWithResult + 37;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        adsInfoOnWarmupCompleted.onWarmupCompleted();
                        AdContentType adContentType = AdContentType.VIDEO;
                        throw null;
                    }
                    if (adsInfoOnWarmupCompleted.onWarmupCompleted() == AdContentType.VIDEO) {
                        Object[] objArr3 = {KoreaBenefitTabFragment.this};
                        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                        ((KoreaBenefitTabViewModel) KoreaBenefitTabFragment.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 493663387, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr3, -493663383, iIAuthTabCallback2)).onExtraCallback(i);
                    }
                }
            }
            int i6 = onExtraCallback + 57;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // im.toss.features.benefit.ui.component.VideoAdsController.onExtraCallback
        public void onNavigationEvent(long j) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {KoreaBenefitTabFragment.this};
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            if (i3 == 0) {
                ((KoreaBenefitTabViewModel) KoreaBenefitTabFragment.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 493663387, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, -493663383, iIAuthTabCallback)).onExtraCallbackWithResult(j);
            } else {
                ((KoreaBenefitTabViewModel) KoreaBenefitTabFragment.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 493663387, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, -493663383, iIAuthTabCallback)).onExtraCallbackWithResult(j);
                throw null;
            }
        }
    }

    private static final int receiveFile(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 17;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = ((WebSocketResultEnum) koreaBenefitTabFragment.onMessageChannelReady().ICustomTabsCallback().IAuthTabCallback()).IAuthTabCallback();
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
        return iIAuthTabCallback;
    }

    static final /* synthetic */ class access000 extends FunctionReferenceImpl implements Function0<Rect> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        access000(Object obj) {
            super(0, obj, KoreaBenefitTabFragment.class, "getTopOverlayOcclusionRect", "getTopOverlayOcclusionRect()Landroid/graphics/Rect;", 0);
        }

        public final Rect IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) ((CallableReference) this).receiver;
            if (i3 != 0) {
                return KoreaBenefitTabFragment.ICustomTabsCallback_Parcel(koreaBenefitTabFragment);
            }
            KoreaBenefitTabFragment.ICustomTabsCallback_Parcel(koreaBenefitTabFragment);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Rect rectIAuthTabCallback = IAuthTabCallback();
            int i4 = onExtraCallback + 41;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return rectIAuthTabCallback;
            }
            throw null;
        }
    }

    private static final Unit IAuthTabCallbackStub(KoreaBenefitTabFragment koreaBenefitTabFragment, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        FragmentActivity fragmentActivityRequireActivity = koreaBenefitTabFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        new TdsToastV1.onNavigationEvent(fragmentActivityRequireActivity, str).onNavigationEvent();
        Unit unit = Unit.INSTANCE;
        int i2 = mayLaunchUrl + 59;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asInterface(KoreaBenefitTabFragment koreaBenefitTabFragment, String str) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 49;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        if (str == null || StringsKt.isBlank(str)) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "BenefitTab", "onClickAdChoicesView url is null or blank", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        } else {
            try {
                Result.Companion companion = Result.Companion;
                koreaBenefitTabFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                int i4 = isEngagementSignalsApiAvailable + 23;
                mayLaunchUrl = i4 % 128;
                int i5 = i4 % 2;
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr = new Object[1];
                a(new char[]{62399, 52725, 40225, 42632, 62410, 10072, 18675}, Color.argb(0, 0, 0, 0) + 1, objArr);
                ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, "BenefitTab", "onClickAdChoicesView error", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str), getWrite.IAuthTabCallback(ApiDowngradeLogger.EXT_KEY_ERROR_CODE, th2.getMessage())}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            }
            Result.IAuthTabCallback(obj);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        RotationVectorAbility1 rotationVectorAbility1 = (RotationVectorAbility1) objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 111;
        mayLaunchUrl = i2 % 128;
        String strName = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rotationVectorAbility1, "");
            koreaBenefitTabFragment.onMessageChannelReady().onWarmupCompleted(rotationVectorAbility1);
            TinyAppHostApduService1 tinyAppHostApduService1 = TinyAppHostApduService1.onNavigationEvent;
            rotationVectorAbility1.onExtraCallbackWithResult().onWarmupCompleted(((WebSocketResultEnum) koreaBenefitTabFragment.onMessageChannelReady().ICustomTabsCallback().IAuthTabCallback()).IAuthTabCallback());
            strName.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(rotationVectorAbility1, "");
        koreaBenefitTabFragment.onMessageChannelReady().onWarmupCompleted(rotationVectorAbility1);
        TinyAppHostApduService1 tinyAppHostApduService12 = TinyAppHostApduService1.onNavigationEvent;
        Cards.onNavigationEvent onnavigationeventOnWarmupCompleted = rotationVectorAbility1.onExtraCallbackWithResult().onWarmupCompleted(((WebSocketResultEnum) koreaBenefitTabFragment.onMessageChannelReady().ICustomTabsCallback().IAuthTabCallback()).IAuthTabCallback());
        if (onnavigationeventOnWarmupCompleted != null) {
            strName = onnavigationeventOnWarmupCompleted.name();
            int i3 = mayLaunchUrl + 73;
            isEngagementSignalsApiAvailable = i3 % 128;
            int i4 = i3 % 2;
        }
        tinyAppHostApduService12.IAuthTabCallback(rotationVectorAbility1, strName);
        SessionTrackerb sessionTrackerbOnExtraCallbackWithResult = koreaBenefitTabFragment.onExtraCallbackWithResult();
        Context contextRequireContext = koreaBenefitTabFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = koreaBenefitTabFragment.writeTypedObject;
        Object[] objArr2 = {rotationVectorAbility1.onExtraCallbackWithResult()};
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        SessionTrackerb.onNavigationEvent(sessionTrackerbOnExtraCallbackWithResult, contextRequireContext, ((Cards.Card.CardExteriorInfo) Cards.Card.onNavigationEvent(setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr2, setAutoCaptured.onExtraCallbackWithResult(), -1488865171, 1488865172, setAutoCaptured.onExtraCallbackWithResult())).onWarmupCompleted(), iEngagementSignalsCallback_Parcel, (Bundle) null, 8, (Object) null);
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(RotationVectorAbility1 rotationVectorAbility1, SetDetectableSize setDetectableSize) throws Throwable {
        String strOnExtraCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("service", rotationVectorAbility1.onExtraCallbackWithResult().IAuthTabCallbackDefault());
        Object[] objArr = {rotationVectorAbility1.onExtraCallbackWithResult()};
        Cards.Card.CardExtraInfo cardExtraInfo = (Cards.Card.CardExtraInfo) Cards.Card.onNavigationEvent(setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), objArr, setAutoCaptured.onExtraCallbackWithResult(), -809120608, 809120608, setAutoCaptured.onExtraCallbackWithResult());
        if (cardExtraInfo != null) {
            int i2 = mayLaunchUrl + 87;
            isEngagementSignalsApiAvailable = i2 % 128;
            if (i2 % 2 != 0) {
                strOnExtraCallback = cardExtraInfo.onExtraCallback();
                int i3 = 6 / 0;
            } else {
                strOnExtraCallback = cardExtraInfo.onExtraCallback();
            }
        } else {
            strOnExtraCallback = null;
        }
        setDetectableSize.onExtraCallback("cta_title", strOnExtraCallback);
        Object[] objArr2 = new Object[1];
        a(new char[]{59335, 64593, 60090, 63246, 59315, 5863, 16240, 14335, 19678}, -ExpandableListView.getPackedPositionChild(0L), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = {rotationVectorAbility1.onExtraCallbackWithResult()};
        setDetectableSize.onExtraCallback(strIntern, ((Cards.Card.CardExteriorInfo) Cards.Card.onNavigationEvent(setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), objArr3, setAutoCaptured.onExtraCallbackWithResult(), -1488865171, 1488865172, setAutoCaptured.onExtraCallbackWithResult())).IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 45;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, RotationVectorAbility1 rotationVectorAbility1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rotationVectorAbility1, "");
        TinyAppHostApduService1.onWarmupCompleted(TinyAppHostApduService1.onNavigationEvent, 1288993L, (Map) null, false, new KoreaBenefitTabFragment$.ExternalSyntheticLambda23(rotationVectorAbility1), 6, (Object) null);
        SessionTrackerb sessionTrackerbOnExtraCallbackWithResult = koreaBenefitTabFragment.onExtraCallbackWithResult();
        Context contextRequireContext = koreaBenefitTabFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = koreaBenefitTabFragment.writeTypedObject;
        Object[] objArr = {rotationVectorAbility1.onExtraCallbackWithResult()};
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        SessionTrackerb.onNavigationEvent(sessionTrackerbOnExtraCallbackWithResult, contextRequireContext, ((Cards.Card.CardExteriorInfo) Cards.Card.onNavigationEvent(setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, setAutoCaptured.onExtraCallbackWithResult(), -1488865171, 1488865172, setAutoCaptured.onExtraCallbackWithResult())).onWarmupCompleted(), iEngagementSignalsCallback_Parcel, (Bundle) null, 8, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = isEngagementSignalsApiAvailable + 87;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, RotationVectorAbility1.onExtraCallback onextracallback, String str) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 53;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Object[] objArr = {koreaBenefitTabFragment.onMessageChannelReady(), onextracallback};
        KoreaBenefitTabViewModel.IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1443151916, -1443151893);
        Object[] objArr2 = {TinyAppHostApduService1.onNavigationEvent, onextracallback, str};
        TinyAppHostApduService1.IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1536955840, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1536955840, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr2, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
        SessionTrackerb sessionTrackerbOnExtraCallbackWithResult = koreaBenefitTabFragment.onExtraCallbackWithResult();
        Context contextRequireContext = koreaBenefitTabFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = koreaBenefitTabFragment.writeTypedObject;
        Object[] objArr3 = {onextracallback.onExtraCallbackWithResult()};
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        SessionTrackerb.onNavigationEvent(sessionTrackerbOnExtraCallbackWithResult, contextRequireContext, ((Cards.Card.CardExteriorInfo) Cards.Card.onNavigationEvent(setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr3, setAutoCaptured.onExtraCallbackWithResult(), -1488865171, 1488865172, setAutoCaptured.onExtraCallbackWithResult())).onWarmupCompleted(), iEngagementSignalsCallback_Parcel, (Bundle) null, 8, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 29;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(CardsV2.BenefitMissionInfo benefitMissionInfo, SensorServiceManager sensorServiceManager, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 15;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{45280, 59140, 31743, 257, 45186, 3502, 44597, 49640, 7155, 28977, 64154, 28012, 58993, 42663, 22309, 5873}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), benefitMissionInfo.asBinder());
        setDetectableSize.onExtraCallback("section_order", Integer.valueOf(sensorServiceManager.asInterface()));
        Unit unit = Unit.INSTANCE;
        int i4 = mayLaunchUrl + 101;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, SensorServiceManager sensorServiceManager) throws Throwable {
        String strIAuthTabCallbackStubProxy;
        Uri uri;
        String strIAuthTabCallbackStubProxy2;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 61;
        mayLaunchUrl = i2 % 128;
        Uri uriOnWarmupCompleted = null;
        String str = "";
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sensorServiceManager, "");
            sensorServiceManager.onExtraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(sensorServiceManager, "");
        CardsV2.BenefitMissionInfo benefitMissionInfoOnExtraCallbackWithResult = sensorServiceManager.onExtraCallbackWithResult();
        if (benefitMissionInfoOnExtraCallbackWithResult == null) {
            Unit unit = Unit.INSTANCE;
            int i3 = mayLaunchUrl + 7;
            isEngagementSignalsApiAvailable = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        TinyAppHostApduService1 tinyAppHostApduService1 = TinyAppHostApduService1.onNavigationEvent;
        TinyAppHostApduService1.onWarmupCompleted(tinyAppHostApduService1, 1565537L, (Map) null, false, new KoreaBenefitTabFragment$.ExternalSyntheticLambda39(benefitMissionInfoOnExtraCallbackWithResult, sensorServiceManager), 6, (Object) null);
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        CardsV2.CustomParameter customParameter = (CardsV2.CustomParameter) CardsV2.BenefitMissionInfo.onNavigationEvent(MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), new Object[]{benefitMissionInfoOnExtraCallbackWithResult}, MaxNativeAdListener.onExtraCallbackWithResult(), 803572547, iOnExtraCallbackWithResult, -803572547);
        if (customParameter == null || (strIAuthTabCallbackStubProxy2 = customParameter.IAuthTabCallbackStubProxy()) == null) {
            int i5 = isEngagementSignalsApiAvailable + 119;
            mayLaunchUrl = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str = strIAuthTabCallbackStubProxy2;
        }
        if (StringsKt.isBlank(str)) {
            koreaBenefitTabFragment.onNavigationEvent(benefitMissionInfoOnExtraCallbackWithResult.IAuthTabCallbackDefault());
        } else {
            SessionTrackerb sessionTrackerbOnExtraCallbackWithResult = koreaBenefitTabFragment.onExtraCallbackWithResult();
            FragmentActivity fragmentActivityRequireActivity = koreaBenefitTabFragment.requireActivity();
            int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
            CardsV2.CustomParameter customParameter2 = (CardsV2.CustomParameter) CardsV2.BenefitMissionInfo.onNavigationEvent(MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), new Object[]{benefitMissionInfoOnExtraCallbackWithResult}, MaxNativeAdListener.onExtraCallbackWithResult(), 803572547, iOnExtraCallbackWithResult2, -803572547);
            if (customParameter2 != null && (strIAuthTabCallbackStubProxy = customParameter2.IAuthTabCallbackStubProxy()) != null && (uri = Uri.parse(strIAuthTabCallbackStubProxy)) != null) {
                Object[] objArr = new Object[1];
                a(new char[]{57184, 3303, 25440, 27218, 57106, 58973, 46776, 43690, 29806, 39630, 57919, 1593}, (KeyEvent.getMaxKeyCode() >> 16) + 1, objArr);
                uriOnWarmupCompleted = filterCreatePageParams.onWarmupCompleted(uri, ((String) objArr[0]).intern(), tinyAppHostApduService1.onWarmupCompleted());
            }
            SessionTrackerb.IAuthTabCallback(sessionTrackerbOnExtraCallbackWithResult, fragmentActivityRequireActivity, String.valueOf(uriOnWarmupCompleted), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(CardsV2.BenefitMissionInfo benefitMissionInfo, SensorServiceManager sensorServiceManager, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 29;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
        Object[] objArr = {(CardsV2.CustomParameter) CardsV2.BenefitMissionInfo.onNavigationEvent(MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), new Object[]{benefitMissionInfo}, iOnExtraCallbackWithResult2, 803572547, iOnExtraCallbackWithResult, -803572547)};
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        setDetectableSize.onExtraCallback("streak_day_cnt", (Integer) CardsV2.CustomParameter.IAuthTabCallback(-214511220, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), objArr, iIAuthTabCallback, iIAuthTabCallback2, 214511221));
        setDetectableSize.onExtraCallback("section_order", Integer.valueOf(sensorServiceManager.asInterface()));
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 31;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(KoreaBenefitTabFragment koreaBenefitTabFragment, SensorServiceManager sensorServiceManager) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sensorServiceManager, "");
        CardsV2.BenefitMissionInfo benefitMissionInfoOnExtraCallbackWithResult = sensorServiceManager.onExtraCallbackWithResult();
        if (benefitMissionInfoOnExtraCallbackWithResult == null) {
            int i2 = isEngagementSignalsApiAvailable + 103;
            mayLaunchUrl = i2 % 128;
            int i3 = i2 % 2;
            return Unit.INSTANCE;
        }
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
        if (((CardsV2.CustomParameter) CardsV2.BenefitMissionInfo.onNavigationEvent(MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), new Object[]{benefitMissionInfoOnExtraCallbackWithResult}, iOnExtraCallbackWithResult2, 803572547, iOnExtraCallbackWithResult, -803572547)) == null) {
            int i4 = mayLaunchUrl + 45;
            isEngagementSignalsApiAvailable = i4 % 128;
            if (i4 % 2 == 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TinyAppHostApduService1 tinyAppHostApduService1 = TinyAppHostApduService1.onNavigationEvent;
        TinyAppHostApduService1.onWarmupCompleted(tinyAppHostApduService1, 1869044L, (Map) null, false, new KoreaBenefitTabFragment$.ExternalSyntheticLambda1(benefitMissionInfoOnExtraCallbackWithResult, sensorServiceManager), 6, (Object) null);
        SessionTrackerb sessionTrackerbOnExtraCallbackWithResult = koreaBenefitTabFragment.onExtraCallbackWithResult();
        FragmentActivity fragmentActivityRequireActivity = koreaBenefitTabFragment.requireActivity();
        int iOnExtraCallbackWithResult3 = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = MaxNativeAdListener.onExtraCallbackWithResult();
        Object[] objArr = {(CardsV2.CustomParameter) CardsV2.BenefitMissionInfo.onNavigationEvent(MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), new Object[]{benefitMissionInfoOnExtraCallbackWithResult}, iOnExtraCallbackWithResult4, 803572547, iOnExtraCallbackWithResult3, -803572547)};
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        Uri uri = Uri.parse((String) CardsV2.CustomParameter.IAuthTabCallback(1013680064, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), objArr, iIAuthTabCallback, iIAuthTabCallback2, -1013680062));
        Object[] objArr2 = new Object[1];
        a(new char[]{57184, 3303, 25440, 27218, 57106, 58973, 46776, 43690, 29806, 39630, 57919, 1593}, View.MeasureSpec.makeMeasureSpec(0, 0) + 1, objArr2);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbOnExtraCallbackWithResult, fragmentActivityRequireActivity, filterCreatePageParams.onWarmupCompleted(uri, ((String) objArr2[0]).intern(), tinyAppHostApduService1.onWarmupCompleted()).toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit2 = Unit.INSTANCE;
        int i5 = mayLaunchUrl + 33;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 29 / 0;
        }
        return unit2;
    }

    private static final Unit onExtraCallbackWithResult(KoreaBenefitTabFragment koreaBenefitTabFragment, CardsV2.PointBackInfo.ChanceExhaustedSheet chanceExhaustedSheet) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 31;
        mayLaunchUrl = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getScreenBrightnessInner.onExtraCallbackWithResult(-762440369, ACPayResult.onWarmupCompleted(), new Object[]{koreaBenefitTabFragment.IAuthTabCallbackStubProxy(), chanceExhaustedSheet}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 762440373, ACPayResult.onWarmupCompleted());
            Unit unit = Unit.INSTANCE;
            int i3 = mayLaunchUrl + 37;
            isEngagementSignalsApiAvailable = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        getScreenBrightnessInner.onExtraCallbackWithResult(-762440369, ACPayResult.onWarmupCompleted(), new Object[]{koreaBenefitTabFragment.IAuthTabCallbackStubProxy(), chanceExhaustedSheet}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 762440373, ACPayResult.onWarmupCompleted());
        Unit unit2 = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(KoreaBenefitTabFragment koreaBenefitTabFragment, ShakeMonitorBridgeExtension shakeMonitorBridgeExtension, CardsV2.PointBackInfo.BankCardCashBackBanner bankCardCashBackBanner) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 17;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(shakeMonitorBridgeExtension, "");
        Intrinsics.checkNotNullParameter(bankCardCashBackBanner, "");
        koreaBenefitTabFragment.onWarmupCompleted(shakeMonitorBridgeExtension, bankCardCashBackBanner);
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 111;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, float f, float f2, int i, String str) {
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 45;
        mayLaunchUrl = i3 % 128;
        if (i3 % 2 != 0) {
            getScreenBrightnessInner.onExtraCallbackWithResult(-232420154, ACPayResult.onWarmupCompleted(), new Object[]{koreaBenefitTabFragment.IAuthTabCallbackStubProxy(), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), str}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 232420155, ACPayResult.onWarmupCompleted());
            return Unit.INSTANCE;
        }
        getScreenBrightnessInner.onExtraCallbackWithResult(-232420154, ACPayResult.onWarmupCompleted(), new Object[]{koreaBenefitTabFragment.IAuthTabCallbackStubProxy(), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), str}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 232420155, ACPayResult.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    static final /* synthetic */ class ICustomTabsCallback extends FunctionReferenceImpl implements Function2<BenefitPremiumAdCollapsedView, startDeviceShakeListener, Unit> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        ICustomTabsCallback(Object obj) {
            super(2, obj, KoreaBenefitTabFragment.class, "onPremiumAdHeaderBound", "onPremiumAdHeaderBound(Lim/toss/features/benefit/ui/premium/BenefitPremiumAdCollapsedView;Lim/toss/features/benefit/ui/data/PremiumAdHeaderItem;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            onWarmupCompleted = i2 % 128;
            Object obj3 = null;
            BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) obj;
            startDeviceShakeListener startdeviceshakelistener = (startDeviceShakeListener) obj2;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(benefitPremiumAdCollapsedView, startdeviceshakelistener);
                Unit unit = Unit.INSTANCE;
                obj3.hashCode();
                throw null;
            }
            onExtraCallbackWithResult(benefitPremiumAdCollapsedView, startdeviceshakelistener);
            Unit unit2 = Unit.INSTANCE;
            int i3 = onWarmupCompleted + 87;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return unit2;
            }
            obj3.hashCode();
            throw null;
        }

        public final void onExtraCallbackWithResult(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, startDeviceShakeListener startdeviceshakelistener) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(benefitPremiumAdCollapsedView, "");
            Intrinsics.checkNotNullParameter(startdeviceshakelistener, "");
            KoreaBenefitTabFragment.onExtraCallbackWithResult((KoreaBenefitTabFragment) ((CallableReference) this).receiver, benefitPremiumAdCollapsedView, startdeviceshakelistener);
            int i4 = onExtraCallback + 71;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit onTransact(KoreaBenefitTabFragment koreaBenefitTabFragment, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 53;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        KoreaBenefitTabViewModel koreaBenefitTabViewModelOnMessageChannelReady = koreaBenefitTabFragment.onMessageChannelReady();
        Context contextRequireContext = koreaBenefitTabFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        Uri uri = Uri.parse(str);
        Object[] objArr = new Object[1];
        a(new char[]{57184, 3303, 25440, 27218, 57106, 58973, 46776, 43690, 29806, 39630, 57919, 1593}, 1 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        KoreaBenefitTabViewModel.onExtraCallbackWithResult(koreaBenefitTabViewModelOnMessageChannelReady, contextRequireContext, filterCreatePageParams.onWarmupCompleted(uri, ((String) objArr[0]).intern(), "tab_benefit").toString(), false, (Function1) null, 12, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = mayLaunchUrl + 99;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public void onCreate(@Nullable Bundle bundle) {
        BenefitTabImpressionHandler benefitTabImpressionHandler;
        int i = 2 % 2;
        super.onCreate(bundle);
        getNameBySim getnamebysim = getNameBySim.onExtraCallbackWithResult;
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        getnamebysim.onNavigationEvent(applicationContext);
        TinyAppHostApduService1 tinyAppHostApduService1 = TinyAppHostApduService1.onNavigationEvent;
        tinyAppHostApduService1.onExtraCallbackWithResult();
        ICustomTabsCallbackStubProxy();
        tinyAppHostApduService1.onExtraCallbackWithResult(ICustomTabsCallback());
        KoreaBenefitTabViewModel koreaBenefitTabViewModelOnMessageChannelReady = onMessageChannelReady();
        getPricingPhaseList getpricingphaselist = getPricingPhaseList.KR;
        BenefitTabImpressionHandler benefitTabImpressionHandler2 = new BenefitTabImpressionHandler(koreaBenefitTabViewModelOnMessageChannelReady, getpricingphaselist, 0.1f, new KoreaBenefitTabFragment$.ExternalSyntheticLambda2(this));
        benefitTabImpressionHandler2.onExtraCallbackWithResult(new access000(this));
        this.access000 = benefitTabImpressionHandler2;
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        this.onExtraCallbackWithResult = new WorkflowUnit(lifecycle, onMessageChannelReady(), getpricingphaselist, (Function0) null, (Function1) null, new KoreaBenefitTabFragment$.ExternalSyntheticLambda5(this), 24, (DefaultConstructorMarker) null);
        SessionTrackerb sessionTrackerbOnExtraCallbackWithResult = onExtraCallbackWithResult();
        BenefitTabImpressionHandler benefitTabImpressionHandler3 = this.access000;
        if (benefitTabImpressionHandler3 == null) {
            int i2 = mayLaunchUrl + 101;
            isEngagementSignalsApiAvailable = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            benefitTabImpressionHandler = null;
        } else {
            benefitTabImpressionHandler = benefitTabImpressionHandler3;
        }
        this.ICustomTabsCallback = new getNameByOperatorName(sessionTrackerbOnExtraCallbackWithResult, benefitTabImpressionHandler, this.ICustomTabsCallbackDefault, onMessageChannelReady(), new KoreaBenefitTabFragment$.ExternalSyntheticLambda6(this), new KoreaBenefitTabFragment$.ExternalSyntheticLambda7(this), new KoreaBenefitTabFragment$.ExternalSyntheticLambda8(this), new KoreaBenefitTabFragment$.ExternalSyntheticLambda9(this), new KoreaBenefitTabFragment$.ExternalSyntheticLambda10(this), new KoreaBenefitTabFragment$.ExternalSyntheticLambda11(this), new KoreaBenefitTabFragment$.ExternalSyntheticLambda12(this), new KoreaBenefitTabFragment$.ExternalSyntheticLambda13(this), new KoreaBenefitTabFragment$.ExternalSyntheticLambda3(this), new KoreaBenefitTabFragment$.ExternalSyntheticLambda4(this), new ICustomTabsCallback(this));
        KoreaBenefitTabViewModel koreaBenefitTabViewModelOnMessageChannelReady2 = onMessageChannelReady();
        getNameByOperatorName getnamebyoperatorname = this.ICustomTabsCallback;
        if (getnamebyoperatorname == null) {
            int i3 = mayLaunchUrl + 3;
            isEngagementSignalsApiAvailable = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            getnamebyoperatorname = null;
        }
        KoreaBenefitTabViewModel.IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{koreaBenefitTabViewModelOnMessageChannelReady2, getnamebyoperatorname}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 894934361, -894934361);
        onActivityResized();
        int i5 = mayLaunchUrl + 107;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void ICustomTabsCallbackDefault() {
        AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 125;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            addPhoneContactViewIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            int i3 = 5 / 0;
            if (addPhoneContactViewIAuthTabCallbackDefault == null) {
                return;
            }
        } else {
            addPhoneContactViewIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            if (addPhoneContactViewIAuthTabCallbackDefault == null) {
                return;
            }
        }
        FrameLayout frameLayoutIAuthTabCallback = addPhoneContactViewIAuthTabCallbackDefault.IAuthTabCallback();
        if (frameLayoutIAuthTabCallback != null) {
            ViewCompat.onWarmupCompleted(frameLayoutIAuthTabCallback, new KoreaBenefitTabFragment$.ExternalSyntheticLambda24(this));
            int i4 = isEngagementSignalsApiAvailable + 71;
            mayLaunchUrl = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final WindowInsetsCompat onExtraCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        int iOnNavigationEvent = forceInnerPermissionCheck.onExtraCallbackWithResult.onNavigationEvent();
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompat.onWarmupCompleted(iOnNavigationEvent);
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
        view.setPadding(cameraControllerExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallbackWithResult, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback);
        AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault = koreaBenefitTabFragment.IAuthTabCallbackDefault();
        if (addPhoneContactViewIAuthTabCallbackDefault != null) {
            int i2 = isEngagementSignalsApiAvailable + 27;
            mayLaunchUrl = i2 % 128;
            int i3 = i2 % 2;
            View view2 = addPhoneContactViewIAuthTabCallbackDefault.onActivityResized;
            if (view2 != null) {
                int i4 = isEngagementSignalsApiAvailable + 77;
                mayLaunchUrl = i4 % 128;
                int i5 = i4 % 2;
                int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                view2.setBackgroundColor(((Integer) onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -627628129, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{koreaBenefitTabFragment}, 627628137, iIAuthTabCallback)).intValue());
                view2.setVisibility(0);
                view2.setTranslationY(-cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted);
                view2.setElevation(0.0f);
                view2.setTranslationZ(0.0f);
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.height = cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted;
                view2.setLayoutParams(layoutParams2);
                int i6 = mayLaunchUrl + 7;
                isEngagementSignalsApiAvailable = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return new WindowInsetsCompat.onWarmupCompleted(windowInsetsCompat).onNavigationEvent(iOnNavigationEvent, CameraControllerExternalSyntheticLambda0.onNavigationEvent).onExtraCallbackWithResult();
    }

    public static final class IAuthTabCallbackDefault implements Animator.AnimatorListener {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            int i4 = onWarmupCompleted + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        IAuthTabCallbackDefault() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            AddPhoneContactView addPhoneContactViewOnMessageChannelReady = KoreaBenefitTabFragment.onMessageChannelReady(KoreaBenefitTabFragment.this);
            if (addPhoneContactViewOnMessageChannelReady != null) {
                int i2 = onWarmupCompleted + 109;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    LottieAnimationView lottieAnimationView = addPhoneContactViewOnMessageChannelReady.IAuthTabCallback;
                    throw null;
                }
                LottieAnimationView lottieAnimationView2 = addPhoneContactViewOnMessageChannelReady.IAuthTabCallback;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setVisibility(0);
                }
            }
            int i3 = onExtraCallback + 119;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(animator, "");
                KoreaBenefitTabFragment.onMessageChannelReady(KoreaBenefitTabFragment.this);
                throw null;
            }
            Intrinsics.checkNotNullParameter(animator, "");
            AddPhoneContactView addPhoneContactViewOnMessageChannelReady = KoreaBenefitTabFragment.onMessageChannelReady(KoreaBenefitTabFragment.this);
            if (addPhoneContactViewOnMessageChannelReady != null) {
                int i3 = onExtraCallback + 77;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    LottieAnimationView lottieAnimationView = addPhoneContactViewOnMessageChannelReady.IAuthTabCallback;
                    obj.hashCode();
                    throw null;
                }
                LottieAnimationView lottieAnimationView2 = addPhoneContactViewOnMessageChannelReady.IAuthTabCallback;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setVisibility(8);
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            LottieAnimationView lottieAnimationView;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            AddPhoneContactView addPhoneContactViewOnMessageChannelReady = KoreaBenefitTabFragment.onMessageChannelReady(KoreaBenefitTabFragment.this);
            if (addPhoneContactViewOnMessageChannelReady != null && (lottieAnimationView = addPhoneContactViewOnMessageChannelReady.IAuthTabCallback) != null) {
                int i2 = onWarmupCompleted + 15;
                onExtraCallback = i2 % 128;
                lottieAnimationView.setVisibility(i2 % 2 != 0 ? 20 : 8);
            }
            int i3 = onExtraCallback + 31;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 15;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i4 = mayLaunchUrl + 117;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r3 = im.toss.features.benefit.ui.KoreaBenefitTabFragment.mayLaunchUrl + 105;
        im.toss.features.benefit.ui.KoreaBenefitTabFragment.isEngagementSignalsApiAvailable = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if ((r3 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r3 = null;
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r3.onWarmupCompleted() == 47) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r3.onWarmupCompleted() == 17) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r3 = im.toss.features.benefit.ui.KoreaBenefitTabFragment.isEngagementSignalsApiAvailable;
        r1 = r3 + 33;
        im.toss.features.benefit.ui.KoreaBenefitTabFragment.mayLaunchUrl = r1 % 128;
        r1 = r1 % 2;
        r3 = r3 + 63;
        im.toss.features.benefit.ui.KoreaBenefitTabFragment.mayLaunchUrl = r3 % 128;
        r3 = r3 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean onNavigationEvent(RVWebSocketManagerHolder rVWebSocketManagerHolder) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 63;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rVWebSocketManagerHolder, "");
        } else {
            Intrinsics.checkNotNullParameter(rVWebSocketManagerHolder, "");
        }
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 105;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = mayLaunchUrl + 95;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onRelationshipValidationResult() {
        AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault;
        ViewAnimator viewAnimator;
        DisplayMetrics displayMetrics;
        int i;
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 39;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
        if (asInterface() && (addPhoneContactViewIAuthTabCallbackDefault = IAuthTabCallbackDefault()) != null && (viewAnimator = addPhoneContactViewIAuthTabCallbackDefault.onRelationshipValidationResult) != null) {
            int i5 = mayLaunchUrl + 121;
            isEngagementSignalsApiAvailable = i5 % 128;
            if (i5 % 2 != 0) {
                displayMetrics = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                i = 11;
            } else {
                displayMetrics = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                i = 56;
            }
            viewAnimator.setPadding(viewAnimator.getPaddingLeft(), varyMatches.onNavigationEvent(Integer.valueOf(i), displayMetrics), viewAnimator.getPaddingRight(), 0);
        }
        AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault2 = IAuthTabCallbackDefault();
        if (addPhoneContactViewIAuthTabCallbackDefault2 != null) {
            int i6 = isEngagementSignalsApiAvailable + 5;
            mayLaunchUrl = i6 % 128;
            int i7 = i6 % 2;
            LottieAnimationView lottieAnimationView = addPhoneContactViewIAuthTabCallbackDefault2.IAuthTabCallback;
            if (i7 == 0) {
                int i8 = 34 / 0;
                if (lottieAnimationView != null) {
                    lottieAnimationView.addAnimatorListener(new IAuthTabCallbackDefault());
                }
            } else if (lottieAnimationView != null) {
            }
        }
        getNameByOperatorName getnamebyoperatorname = this.ICustomTabsCallback;
        Object obj = null;
        if (getnamebyoperatorname == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            getnamebyoperatorname = null;
        }
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        getnamebyoperatorname.IAuthTabCallback(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner));
        AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault3 = IAuthTabCallbackDefault();
        if (addPhoneContactViewIAuthTabCallbackDefault3 != null) {
            int i9 = mayLaunchUrl + 29;
            isEngagementSignalsApiAvailable = i9 % 128;
            if (i9 % 2 != 0) {
                TdsRecyclerView tdsRecyclerView = addPhoneContactViewIAuthTabCallbackDefault3.onActivityLayout;
                obj.hashCode();
                throw null;
            }
            TdsRecyclerView tdsRecyclerView2 = addPhoneContactViewIAuthTabCallbackDefault3.onActivityLayout;
            if (tdsRecyclerView2 != null) {
                tdsRecyclerView2.setLayoutManager(new BenefitTabLinearLayoutManager(requireContext(), 0.0f, 2, (DefaultConstructorMarker) null));
                RecyclerView.Adapter adapter = this.ICustomTabsCallback;
                if (adapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    adapter = null;
                }
                tdsRecyclerView2.setAdapter(adapter);
                tdsRecyclerView2.setItemViewCacheSize(25);
                tdsRecyclerView2.setOverScrollMode(2);
                tdsRecyclerView2.setClipChildren(false);
                tdsRecyclerView2.setClipToPadding(false);
                tdsRecyclerView2.setPadding(tdsRecyclerView2.getPaddingLeft(), tdsRecyclerView2.getPaddingTop(), tdsRecyclerView2.getPaddingRight(), (int) tdsRecyclerView2.getResources().getDimension(im.toss.tds.view.R.dimen.list_row_padding_bottom_24));
                ExoPlayerImplExternalSyntheticLambda31 exoPlayerImplExternalSyntheticLambda31 = this.ICustomTabsCallback;
                if (exoPlayerImplExternalSyntheticLambda31 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    exoPlayerImplExternalSyntheticLambda31 = null;
                }
                exoPlayerImplExternalSyntheticLambda31.onNavigationEvent(CollectionsKt.listOf(SensorBridgeExtension2.IAuthTabCallback));
                BenefitTabImpressionHandler benefitTabImpressionHandler = this.access000;
                if (benefitTabImpressionHandler == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    benefitTabImpressionHandler = null;
                }
                TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = this.ICustomTabsService;
                if (textFieldScrollKtExternalSyntheticLambda0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i10 = isEngagementSignalsApiAvailable + 67;
                    mayLaunchUrl = i10 % 128;
                    int i11 = i10 % 2;
                    textFieldScrollKtExternalSyntheticLambda0 = null;
                }
                AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault4 = IAuthTabCallbackDefault();
                benefitTabImpressionHandler.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0, (RecyclerView) (addPhoneContactViewIAuthTabCallbackDefault4 != null ? addPhoneContactViewIAuthTabCallbackDefault4.onActivityLayout : null));
                updateVisuals().onNavigationEvent(tdsRecyclerView2);
                if (!tdsRecyclerView2.isLaidOut() || tdsRecyclerView2.isLayoutRequested()) {
                    tdsRecyclerView2.addOnLayoutChangeListener(new onTransact());
                } else {
                    int i12 = mayLaunchUrl + 53;
                    isEngagementSignalsApiAvailable = i12 % 128;
                    int i13 = i12 % 2;
                    postMessage(this);
                }
            }
        }
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = getIconPaddingLeft.IAuthTabCallback.onWarmupCompleted().onExtraCallback(RVWebSocketManagerHolder.class).onWarmupCompleted(new KoreaBenefitTabFragment$.ExternalSyntheticLambda34(new KoreaBenefitTabFragment$.ExternalSyntheticLambda33()));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted2 = jsonReaderUnknownNumberParsingOnWarmupCompleted.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted2, "");
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = jsonReaderUnknownNumberParsingOnWarmupCompleted2.IAuthTabCallback(new KoreaBenefitTabFragment$.ExternalSyntheticLambda36(new KoreaBenefitTabFragment$.ExternalSyntheticLambda35(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        autoDisposable(deserializeurinullablecollectionIAuthTabCallback);
    }

    private static /* synthetic */ Object onUnminimized(Object[] objArr) {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        int i = 2 % 2;
        AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault = koreaBenefitTabFragment.IAuthTabCallbackDefault();
        if (addPhoneContactViewIAuthTabCallbackDefault != null) {
            int i2 = mayLaunchUrl + 13;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            TdsRecyclerView tdsRecyclerView = addPhoneContactViewIAuthTabCallbackDefault.onActivityLayout;
            if (tdsRecyclerView != null) {
                int i4 = isEngagementSignalsApiAvailable + 101;
                mayLaunchUrl = i4 % 128;
                if (i4 % 2 == 0) {
                    tdsRecyclerView.smoothScrollToPosition(0);
                } else {
                    tdsRecyclerView.smoothScrollToPosition(0);
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final void onNavigationEvent(AdsInfo adsInfo) {
        VideoAdsController videoAdsControllerAccess100;
        int i;
        int i2 = 2 % 2;
        StyledPlayerView styledPlayerViewAccess000 = access000();
        if (styledPlayerViewAccess000 != null) {
            if (adsInfo != null) {
                int i3 = isEngagementSignalsApiAvailable + 39;
                int i4 = i3 % 128;
                mayLaunchUrl = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 93;
                isEngagementSignalsApiAvailable = i6 % 128;
                int i7 = i6 % 2;
                i = 0;
            } else {
                i = 8;
            }
            styledPlayerViewAccess000.setVisibility(i);
        }
        if (adsInfo == null) {
            int i8 = isEngagementSignalsApiAvailable + 5;
            mayLaunchUrl = i8 % 128;
            int i9 = i8 % 2;
            VideoAdsController videoAdsControllerAccess1002 = access100();
            if (videoAdsControllerAccess1002 != null) {
                videoAdsControllerAccess1002.onWarmupCompleted("initVideoMode - null videoAdsInfo:" + adsInfo);
                videoAdsControllerAccess1002.onWarmupCompleted();
                return;
            }
            return;
        }
        StyledPlayerView styledPlayerViewAccess0002 = access000();
        if (styledPlayerViewAccess0002 != null && (videoAdsControllerAccess100 = access100()) != null) {
            int i10 = isEngagementSignalsApiAvailable + 51;
            mayLaunchUrl = i10 % 128;
            if (i10 % 2 == 0) {
                int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
                VideoAdsController.onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{videoAdsControllerAccess100, styledPlayerViewAccess0002, adsInfo}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1903258308, 1903258314, iOnWarmupCompleted);
                int i11 = 62 / 0;
            } else {
                VideoAdsController.onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{videoAdsControllerAccess100, styledPlayerViewAccess0002, adsInfo}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1903258308, 1903258314, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            }
        }
        VideoAdsController videoAdsControllerAccess1003 = access100();
        if (videoAdsControllerAccess1003 != null) {
            int i12 = mayLaunchUrl + 29;
            isEngagementSignalsApiAvailable = i12 % 128;
            if (i12 % 2 == 0) {
                videoAdsControllerAccess1003.onWarmupCompleted();
                videoAdsControllerAccess1003.onNavigationEvent(this.ICustomTabsCallbackDefault);
            } else {
                videoAdsControllerAccess1003.onWarmupCompleted();
                videoAdsControllerAccess1003.onNavigationEvent(this.ICustomTabsCallbackDefault);
                int i13 = 15 / 0;
            }
        }
    }

    private final void onActivityResized() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new IAuthTabCallback(null), 2, (Object) null);
        int i2 = mayLaunchUrl + 23;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        Object L$0;
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = KoreaBenefitTabFragment.this.new IAuthTabCallback(access13800Var);
            int i2 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 41;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x00fa, code lost:
        
            if (r12.IAuthTabCallback(r4, r21) == r2) goto L29;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            WorkflowUnit workflowUnit;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
                this.label = 1;
                objOnExtraCallback = LifecyclesKtawaitStarted21.onExtraCallback(new Object[]{lifecyclesKtawaitStarted21, "benefit.benefitTab.admob.excludeKeywords", "", this}, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
                if (objOnExtraCallback != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = IAuthTabCallback + 7;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                ResultKt.onNavigationEvent(obj);
                int i5 = IAuthTabCallback + 45;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj);
            objOnExtraCallback = obj;
            String str = (String) objOnExtraCallback;
            WorkflowUnit workflowUnitOnActivityLayout = KoreaBenefitTabFragment.onActivityLayout(KoreaBenefitTabFragment.this);
            WorkflowUnit workflowUnit2 = null;
            if (workflowUnitOnActivityLayout == null) {
                int i7 = IAuthTabCallback + 51;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                workflowUnit = null;
            } else {
                workflowUnit = workflowUnitOnActivityLayout;
            }
            List listSplit$default = StringsKt.split$default(str, new String[]{","}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(StringsKt.trim((String) it.next()).toString());
            }
            int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            WorkflowUnit.onWarmupCompleted(-547861173, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{workflowUnit, arrayList}, 547861176);
            WorkflowUnit workflowUnitOnActivityLayout2 = KoreaBenefitTabFragment.onActivityLayout(KoreaBenefitTabFragment.this);
            if (workflowUnitOnActivityLayout2 == null) {
                int i9 = onExtraCallbackWithResult + 119;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i11 = IAuthTabCallback + 25;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
            } else {
                workflowUnit2 = workflowUnitOnActivityLayout2;
            }
            FragmentActivity fragmentActivityRequireActivity = KoreaBenefitTabFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            this.L$0 = access15400.onNavigationEvent(str);
            this.label = 2;
        }
    }

    private final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        onMessageChannelReady().onWarmupCompleted(z, IAuthTabCallback_Parcel(), IAuthTabCallbackStubProxy().onExtraCallbackWithResult(), asInterface());
        int i2 = isEngagementSignalsApiAvailable + 115;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 79;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        ICustomTabsCallbackDefault();
        onRelationshipValidationResult();
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback2, 979241426, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{this}, -979241408, iIAuthTabCallback);
        Object[] objArr = {writeTypedObject()};
        BasicSystemInfoExtension2.onWarmupCompleted(-1674681311, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1674681326);
        onActivityLayout();
        onPostMessage();
        int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback5 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback6 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback5, -725578424, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback6, new Object[]{this}, 725578436, iIAuthTabCallback4);
        ICustomTabsCallbackStub();
        int iIAuthTabCallback7 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback8 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback9 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int i4 = mayLaunchUrl + 29;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void ICustomTabsCallbackStub() {
        int i = 2 % 2;
        Object systemService = requireContext().getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.onWarmupCompleted = accessibilityManager;
        if (accessibilityManager != null) {
            int i2 = mayLaunchUrl + 71;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            accessibilityManager.addTouchExplorationStateChangeListener(this.onUnminimized);
            int i4 = mayLaunchUrl + 63;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
        }
        onMessageChannelReady().postMessage();
    }

    private static /* synthetic */ Object onRelationshipValidationResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 103;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(KoreaBenefitTabFragment koreaBenefitTabFragment, getErrMsg geterrmsg) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 67;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0 ? geterrmsg.onWarmupCompleted() != 17 : geterrmsg.onWarmupCompleted() != 27) {
            koreaBenefitTabFragment.IAuthTabCallbackStubProxy().IAuthTabCallback();
            koreaBenefitTabFragment.extraCommand();
        } else {
            koreaBenefitTabFragment.ICustomTabsCallback_Parcel();
            int i3 = isEngagementSignalsApiAvailable + 29;
            mayLaunchUrl = i3 % 128;
            int i4 = i3 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i5 = mayLaunchUrl + 47;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 17 / 0;
        }
        return unit;
    }

    private final void ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingAsInterface = getIconPaddingLeft.IAuthTabCallback.onWarmupCompleted().onExtraCallback(getErrMsg.class).asInterface();
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingAsInterface, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = jsonReaderUnknownNumberParsingAsInterface.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = jsonReaderUnknownNumberParsingOnWarmupCompleted.IAuthTabCallback(new KoreaBenefitTabFragment$.ExternalSyntheticLambda41(new KoreaBenefitTabFragment$.ExternalSyntheticLambda40(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        autoDisposable(deserializeurinullablecollectionIAuthTabCallback);
        removeTaskIdOnSocketError parentFragment = getParentFragment();
        Intrinsics.checkNotNull(parentFragment, "");
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnNavigationEvent = parentFragment.onNavigationEvent(this, 17);
        textFieldScrollKtExternalSyntheticLambda0OnNavigationEvent.getLifecycle().IAuthTabCallback(new DefaultLifecycleObserver() { // from class: im.toss.features.benefit.ui.KoreaBenefitTabFragment$initLifecycle$2$1
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 41;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
                int i5 = onNavigationEvent + 3;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }

            public /* bridge */ void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 25;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                super.onDestroy(textFieldScrollKtExternalSyntheticLambda0);
                if (i4 != 0) {
                    int i5 = 20 / 0;
                }
                int i6 = onWarmupCompleted + 17;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 66 / 0;
                }
            }

            public void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                VideoAdsController videoAdsControllerOnUnminimized = KoreaBenefitTabFragment.onUnminimized(this.onExtraCallbackWithResult);
                if (videoAdsControllerOnUnminimized != null) {
                    int i3 = onNavigationEvent + 5;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    videoAdsControllerOnUnminimized.setOnPlayerViewVisible(false);
                    int i5 = onNavigationEvent + 77;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                }
                getNameByOperatorName getnamebyoperatornameICustomTabsCallbackStub = KoreaBenefitTabFragment.ICustomTabsCallbackStub(this.onExtraCallbackWithResult);
                Object obj = null;
                if (getnamebyoperatornameICustomTabsCallbackStub == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    getnamebyoperatornameICustomTabsCallbackStub = null;
                }
                int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
                NativeAdsView nativeAdsView = (NativeAdsView) getNameByOperatorName.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), new Object[]{getnamebyoperatornameICustomTabsCallbackStub}, 1724566273, -1724566258, iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult());
                if (nativeAdsView != null) {
                    int i7 = onNavigationEvent + 85;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    nativeAdsView.onNavigationEvent();
                    if (i8 == 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[PHI: r10
              0x002a: PHI (r10v3 im.toss.features.benefit.ui.component.VideoAdsController) = 
              (r10v2 im.toss.features.benefit.ui.component.VideoAdsController)
              (r10v22 im.toss.features.benefit.ui.component.VideoAdsController)
             binds: [B:8:0x0028, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                VideoAdsController videoAdsControllerOnUnminimized;
                VideoAdsController videoAdsControllerOnUnminimized2;
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 41;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    videoAdsControllerOnUnminimized = KoreaBenefitTabFragment.onUnminimized(this.onExtraCallbackWithResult);
                    int i4 = 6 / 0;
                    if (videoAdsControllerOnUnminimized != null) {
                        if (videoAdsControllerOnUnminimized.onNavigationEvent() && (videoAdsControllerOnUnminimized2 = KoreaBenefitTabFragment.onUnminimized(this.onExtraCallbackWithResult)) != null) {
                            videoAdsControllerOnUnminimized2.setOnPlayerViewVisible(true);
                        }
                    }
                } else {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    videoAdsControllerOnUnminimized = KoreaBenefitTabFragment.onUnminimized(this.onExtraCallbackWithResult);
                    if (videoAdsControllerOnUnminimized != null) {
                    }
                }
                getNameByOperatorName getnamebyoperatornameICustomTabsCallbackStub = KoreaBenefitTabFragment.ICustomTabsCallbackStub(this.onExtraCallbackWithResult);
                Object obj = null;
                if (getnamebyoperatornameICustomTabsCallbackStub == null) {
                    int i5 = onWarmupCompleted + 51;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    getnamebyoperatornameICustomTabsCallbackStub = null;
                }
                NativeAdsView nativeAdsView = (NativeAdsView) getNameByOperatorName.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), new Object[]{getnamebyoperatornameICustomTabsCallbackStub}, 1724566273, -1724566258, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
                if (nativeAdsView != null) {
                    int i6 = onWarmupCompleted + 17;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        nativeAdsView.asBinder();
                        obj.hashCode();
                        throw null;
                    }
                    nativeAdsView.asBinder();
                }
                BasicSystemInfoExtension2.onWarmupCompleted(-1395182388, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{KoreaBenefitTabFragment.ICustomTabsService(this.onExtraCallbackWithResult)}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1395182408);
                int i7 = onWarmupCompleted + 25;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            }

            public void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 51;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                Object[] objArr = {this.onExtraCallbackWithResult};
                int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                KoreaBenefitTabFragment.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 57756851, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, -57756825, iIAuthTabCallback);
                int i5 = onWarmupCompleted + 85;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 30 / 0;
                }
            }

            public void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 121;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                KoreaBenefitTabFragment.prefetch(this.onExtraCallbackWithResult);
                int i5 = onNavigationEvent + 71;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnNavigationEvent), (CoroutineContext) null, (setRandomHost) null, new asInterface(textFieldScrollKtExternalSyntheticLambda0OnNavigationEvent, this, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnNavigationEvent), (CoroutineContext) null, (setRandomHost) null, new asBinder(textFieldScrollKtExternalSyntheticLambda0OnNavigationEvent, this, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnNavigationEvent), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(textFieldScrollKtExternalSyntheticLambda0OnNavigationEvent, this, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnNavigationEvent), (CoroutineContext) null, (setRandomHost) null, new access100(textFieldScrollKtExternalSyntheticLambda0OnNavigationEvent, this, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnNavigationEvent), (CoroutineContext) null, (setRandomHost) null, new getInterfaceDescriptor(textFieldScrollKtExternalSyntheticLambda0OnNavigationEvent, this, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnNavigationEvent), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback_Parcel(textFieldScrollKtExternalSyntheticLambda0OnNavigationEvent, this, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnNavigationEvent), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStubProxy(textFieldScrollKtExternalSyntheticLambda0OnNavigationEvent, this, (access13800) null), 3, (Object) null);
        this.ICustomTabsService = textFieldScrollKtExternalSyntheticLambda0OnNavigationEvent;
        int i2 = mayLaunchUrl + 123;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public boolean onBackPressed() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 67;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            super.onBackPressed();
            throw null;
        }
        boolean zOnBackPressed = super.onBackPressed();
        int i3 = mayLaunchUrl + 81;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 == 0) {
            return zOnBackPressed;
        }
        throw null;
    }

    private final void ICustomTabsCallback_Parcel() throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 95;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        this.IAuthTabCallbackDefault = true;
        this.asBinder = false;
        prefetch();
        newAuthTabSession();
        IAuthTabCallbackStubProxy().onWarmupCompleted();
        writeTypedObject().onTransact();
        BenefitTabImpressionHandler benefitTabImpressionHandler = this.access000;
        if (benefitTabImpressionHandler != null) {
            int i4 = isEngagementSignalsApiAvailable + 93;
            mayLaunchUrl = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (benefitTabImpressionHandler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                benefitTabImpressionHandler = null;
            }
            benefitTabImpressionHandler.onNavigationEvent();
        }
        this.extraCallback = System.currentTimeMillis();
        TinyAppHostApduService1.onNavigationEvent.onExtraCallbackWithResult(ICustomTabsCallback());
        onWarmupCompleted(this.extraCallbackWithResult.getAndSet(false));
    }

    private final void ICustomTabsService() {
        TdsRecyclerView tdsRecyclerView;
        int i = 2 % 2;
        AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (addPhoneContactViewIAuthTabCallbackDefault != null && (tdsRecyclerView = addPhoneContactViewIAuthTabCallbackDefault.onActivityLayout) != null) {
            Iterator it = CollectionsKt.listOf(new Long[]{0L, 100L, 300L}).iterator();
            while (it.hasNext()) {
                tdsRecyclerView.postDelayed(new KoreaBenefitTabFragment$.ExternalSyntheticLambda31(this), ((Number) it.next()).longValue());
                int i2 = isEngagementSignalsApiAvailable + 123;
                mayLaunchUrl = i2 % 128;
                int i3 = i2 % 2;
            }
        }
        int i4 = isEngagementSignalsApiAvailable + 65;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final void onSessionEnded(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        if (koreaBenefitTabFragment.getView() != null) {
            int i2 = mayLaunchUrl + 73;
            isEngagementSignalsApiAvailable = i2 % 128;
            BenefitTabImpressionHandler benefitTabImpressionHandler = null;
            if (i2 % 2 == 0) {
                if (koreaBenefitTabFragment.getViewLifecycleOwner().getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED)) {
                    BenefitTabImpressionHandler benefitTabImpressionHandler2 = koreaBenefitTabFragment.access000;
                    if (benefitTabImpressionHandler2 == null) {
                        int i3 = mayLaunchUrl + 109;
                        isEngagementSignalsApiAvailable = i3 % 128;
                        int i4 = i3 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        if (i4 != 0) {
                            int i5 = 53 / 0;
                        }
                    } else {
                        benefitTabImpressionHandler = benefitTabImpressionHandler2;
                    }
                    int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
                    int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
                    BenefitTabImpressionHandler.onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback2, -449811503, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 449811518, iIAuthTabCallback, new Object[]{benefitTabImpressionHandler, "trackScreenFlowReady"});
                    int i6 = isEngagementSignalsApiAvailable + 7;
                    mayLaunchUrl = i6 % 128;
                    int i7 = i6 % 2;
                    return;
                }
                return;
            }
            koreaBenefitTabFragment.getViewLifecycleOwner().getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED);
            benefitTabImpressionHandler.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        KoreaBenefitTabViewModel.IAuthTabCallback iAuthTabCallback = (KoreaBenefitTabViewModel.IAuthTabCallback) objArr[1];
        int i = 2 % 2;
        if (koreaBenefitTabFragment.onPostMessage == iAuthTabCallback) {
            int i2 = isEngagementSignalsApiAvailable + 59;
            mayLaunchUrl = i2 % 128;
            int i3 = i2 % 2;
            if (koreaBenefitTabFragment.onRelationshipValidationResult == iAuthTabCallback) {
                koreaBenefitTabFragment.onPostMessage = null;
                koreaBenefitTabFragment.onActivityLayout = false;
                TinyAppHostApduService1 tinyAppHostApduService1 = TinyAppHostApduService1.onNavigationEvent;
                tinyAppHostApduService1.IAuthTabCallbackStub();
                koreaBenefitTabFragment.ICustomTabsService();
                TinyAppHostApduService1.IAuthTabCallback(tinyAppHostApduService1, 1008135L, (Map) null, false, new KoreaBenefitTabFragment$.ExternalSyntheticLambda37(iAuthTabCallback, koreaBenefitTabFragment), 6, (Object) null);
                int i4 = isEngagementSignalsApiAvailable + 7;
                mayLaunchUrl = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        return null;
    }

    private final void extraCommand() {
        Object next;
        getDeviceBaseInfo getdevicebaseinfo;
        int i = 2 % 2;
        Object obj = null;
        if (!this.asBinder) {
            this.asBinder = true;
            this.IAuthTabCallbackDefault = false;
            getScreenBrightnessInner.onExtraCallbackWithResult(861355313, ACPayResult.onWarmupCompleted(), new Object[]{IAuthTabCallbackStubProxy()}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -861355305, ACPayResult.onWarmupCompleted());
            writeTypedObject().IAuthTabCallbackDefault();
            BenefitTabImpressionHandler benefitTabImpressionHandler = this.access000;
            if (benefitTabImpressionHandler != null) {
                if (benefitTabImpressionHandler == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    benefitTabImpressionHandler = null;
                }
                int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
                BenefitTabImpressionHandler.onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -547360297, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 547360298, iIAuthTabCallback, new Object[]{benefitTabImpressionHandler});
            }
            isEngagementSignalsApiAvailable();
            VideoAdsController videoAdsControllerAccess100 = access100();
            if (videoAdsControllerAccess100 != null) {
                int i2 = isEngagementSignalsApiAvailable + 113;
                mayLaunchUrl = i2 % 128;
                if (i2 % 2 == 0) {
                    videoAdsControllerAccess100.IAuthTabCallback();
                    throw null;
                }
                videoAdsControllerAccess100.IAuthTabCallback();
            }
            getNameByImsi getnamebyimsi = this.ICustomTabsCallback;
            if (getnamebyimsi == null) {
                int i3 = isEngagementSignalsApiAvailable + 25;
                mayLaunchUrl = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                getnamebyimsi = null;
            }
            ThumbnailAdMobController thumbnailAdMobControllerOnNavigationEvent = getnamebyimsi.onNavigationEvent();
            if (thumbnailAdMobControllerOnNavigationEvent != null) {
                thumbnailAdMobControllerOnNavigationEvent.IAuthTabCallback();
            }
            AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            if (addPhoneContactViewIAuthTabCallbackDefault != null) {
                int i5 = mayLaunchUrl + 61;
                isEngagementSignalsApiAvailable = i5 % 128;
                int i6 = i5 % 2;
                LottieAnimationView lottieAnimationView = addPhoneContactViewIAuthTabCallbackDefault.IAuthTabCallback;
                if (lottieAnimationView != null) {
                    lottieAnimationView.cancelAnimation();
                }
            }
            onMessageChannelReady().access000();
            onNext.IAuthTabCallback.onExtraCallbackWithResult();
            BenefitTabImpressionHandler benefitTabImpressionHandler2 = this.access000;
            if (benefitTabImpressionHandler2 == null) {
                int i7 = isEngagementSignalsApiAvailable + 39;
                mayLaunchUrl = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                benefitTabImpressionHandler2 = null;
            }
            if (benefitTabImpressionHandler2.onExtraCallback()) {
                TinyAppHostApduService1.IAuthTabCallback(TinyAppHostApduService1.onNavigationEvent, 1272199L, (Map) null, true, new KoreaBenefitTabFragment$.ExternalSyntheticLambda22(System.currentTimeMillis(), this), 2, (Object) null);
            }
            TinyAppHostApduService1.onNavigationEvent.onExtraCallback();
            exitAllPages exitallpages = this.ICustomTabsCallback;
            if (exitallpages == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                exitallpages = null;
            }
            Iterator it = exitallpages.onExtraCallbackWithResult().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                int i9 = mayLaunchUrl + 33;
                isEngagementSignalsApiAvailable = i9 % 128;
                int i10 = i9 % 2;
                next = it.next();
                if (((SensorBridgeExtension3) next) instanceof getDeviceBaseInfo) {
                    int i11 = mayLaunchUrl + 7;
                    isEngagementSignalsApiAvailable = i11 % 128;
                    int i12 = i11 % 2;
                    break;
                }
            }
            if (next instanceof getDeviceBaseInfo) {
                int i13 = mayLaunchUrl + 63;
                isEngagementSignalsApiAvailable = i13 % 128;
                getdevicebaseinfo = (getDeviceBaseInfo) next;
                if (i13 % 2 != 0) {
                    throw null;
                }
            } else {
                getdevicebaseinfo = null;
            }
            if (getdevicebaseinfo != null) {
                int i14 = isEngagementSignalsApiAvailable + 101;
                mayLaunchUrl = i14 % 128;
                if (i14 % 2 == 0) {
                    getdevicebaseinfo.onExtraCallbackWithResult();
                    obj.hashCode();
                    throw null;
                }
                AdsInfo adsInfoOnExtraCallbackWithResult = getdevicebaseinfo.onExtraCallbackWithResult();
                if (adsInfoOnExtraCallbackWithResult != null) {
                    adsInfoOnExtraCallbackWithResult.IAuthTabCallback(true);
                }
            }
        }
        int i15 = isEngagementSignalsApiAvailable + 99;
        mayLaunchUrl = i15 % 128;
        if (i15 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int i3 = mayLaunchUrl + 95;
            isEngagementSignalsApiAvailable = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                activity.getWindow();
                obj.hashCode();
                throw null;
            }
            Window window = activity.getWindow();
            if (window != null) {
                int i4 = mayLaunchUrl + 5;
                int i5 = i4 % 128;
                isEngagementSignalsApiAvailable = i5;
                if (i4 % 2 != 0) {
                    throw null;
                }
                if (this.onMinimized == null) {
                    int i6 = i5 + 83;
                    mayLaunchUrl = i6 % 128;
                    if (i6 % 2 == 0) {
                        this.onMinimized = Integer.valueOf(window.getStatusBarColor());
                        int i7 = 53 / 0;
                    } else {
                        this.onMinimized = Integer.valueOf(window.getStatusBarColor());
                    }
                }
                window.setStatusBarColor(i);
                int i8 = mayLaunchUrl + 17;
                isEngagementSignalsApiAvailable = i8 % 128;
                int i9 = i8 % 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r1 r2
      0x002b: PHI (r1v3 int) = (r1v2 int), (r1v4 int) binds: [B:10:0x0029, B:7:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r2v4 androidx.fragment.app.FragmentActivity) = (r2v3 androidx.fragment.app.FragmentActivity), (r2v6 androidx.fragment.app.FragmentActivity) binds: [B:10:0x0029, B:7:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void isEngagementSignalsApiAvailable() {
        int iIntValue;
        FragmentActivity activity;
        int i = 2 % 2;
        Integer num = this.onMinimized;
        if (num != null) {
            int i2 = isEngagementSignalsApiAvailable + 37;
            mayLaunchUrl = i2 % 128;
            if (i2 % 2 == 0) {
                iIntValue = num.intValue();
                activity = getActivity();
                int i3 = 53 / 0;
                if (activity != null) {
                    Window window = activity.getWindow();
                    if (window != null) {
                        int i4 = mayLaunchUrl + 101;
                        isEngagementSignalsApiAvailable = i4 % 128;
                        int i5 = i4 % 2;
                        window.setStatusBarColor(iIntValue);
                    }
                }
            } else {
                iIntValue = num.intValue();
                activity = getActivity();
                if (activity != null) {
                }
            }
            this.onMinimized = null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit onExtraCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, ContactAccount.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        ViewAnimator viewAnimator;
        ViewAnimator viewAnimator2;
        int i = 2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = koreaBenefitTabFragment.readTypedObject;
        Objects.toString(onextracallbackwithresult);
        int i2 = onextracallbackwithresult == null ? -1 : onExtraCallback.onWarmupCompleted[onextracallbackwithresult.ordinal()];
        getNameByOperatorName getnamebyoperatorname = null;
        if (i2 == 1) {
            VideoAdsController videoAdsControllerAccess100 = koreaBenefitTabFragment.access100();
            if (videoAdsControllerAccess100 != null) {
                videoAdsControllerAccess100.setContentLoadState(true);
            }
            getNameByImsi getnamebyimsi = koreaBenefitTabFragment.ICustomTabsCallback;
            if (getnamebyimsi == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                getnamebyimsi = null;
            }
            ThumbnailAdMobController thumbnailAdMobControllerOnNavigationEvent = getnamebyimsi.onNavigationEvent();
            if (thumbnailAdMobControllerOnNavigationEvent != null) {
                thumbnailAdMobControllerOnNavigationEvent.setContentLoadState(true);
            }
            getNameByOperatorName getnamebyoperatorname2 = koreaBenefitTabFragment.ICustomTabsCallback;
            if (getnamebyoperatorname2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                getnamebyoperatorname = getnamebyoperatorname2;
            }
            NativeAdsView nativeAdsView = (NativeAdsView) getNameByOperatorName.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), new Object[]{getnamebyoperatorname}, 1724566273, -1724566258, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
            if (nativeAdsView != null) {
                int i3 = mayLaunchUrl + 37;
                isEngagementSignalsApiAvailable = i3 % 128;
                int i4 = i3 % 2;
                nativeAdsView.setThumbnailBannerContentLoadState(true);
            }
        } else if (i2 != 2) {
            int i5 = mayLaunchUrl;
            int i6 = i5 + 39;
            isEngagementSignalsApiAvailable = i6 % 128;
            if (i6 % 2 == 0 ? i2 == 3 : i2 == 4) {
                VideoAdsController videoAdsControllerAccess1002 = koreaBenefitTabFragment.access100();
                if (videoAdsControllerAccess1002 != null) {
                    videoAdsControllerAccess1002.setContentLoadState(false);
                }
                getNameByImsi getnamebyimsi2 = koreaBenefitTabFragment.ICustomTabsCallback;
                if (getnamebyimsi2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    getnamebyimsi2 = null;
                }
                ThumbnailAdMobController thumbnailAdMobControllerOnNavigationEvent2 = getnamebyimsi2.onNavigationEvent();
                if (thumbnailAdMobControllerOnNavigationEvent2 != null) {
                    thumbnailAdMobControllerOnNavigationEvent2.setContentLoadState(false);
                }
                getNameByOperatorName getnamebyoperatorname3 = koreaBenefitTabFragment.ICustomTabsCallback;
                if (getnamebyoperatorname3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    getnamebyoperatorname = getnamebyoperatorname3;
                }
                NativeAdsView nativeAdsView2 = (NativeAdsView) getNameByOperatorName.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), new Object[]{getnamebyoperatorname}, 1724566273, -1724566258, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
                if (nativeAdsView2 != null) {
                    int i7 = isEngagementSignalsApiAvailable + 93;
                    mayLaunchUrl = i7 % 128;
                    if (i7 % 2 == 0) {
                        nativeAdsView2.setThumbnailBannerContentLoadState(true);
                    } else {
                        nativeAdsView2.setThumbnailBannerContentLoadState(false);
                    }
                }
                koreaBenefitTabFragment.access100 = true;
                koreaBenefitTabFragment.newAuthTabSession();
                koreaBenefitTabFragment.prefetch();
                AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault = koreaBenefitTabFragment.IAuthTabCallbackDefault();
                if (addPhoneContactViewIAuthTabCallbackDefault != null && (viewAnimator2 = addPhoneContactViewIAuthTabCallbackDefault.onRelationshipValidationResult) != null) {
                    viewAnimator2.setDisplayedChild(0);
                }
            } else if (i2 == 4) {
                VideoAdsController videoAdsControllerAccess1003 = koreaBenefitTabFragment.access100();
                if (videoAdsControllerAccess1003 != null) {
                    videoAdsControllerAccess1003.onWarmupCompleted();
                }
                VideoAdsController videoAdsControllerAccess1004 = koreaBenefitTabFragment.access100();
                if (videoAdsControllerAccess1004 != null) {
                    int i8 = mayLaunchUrl + 101;
                    isEngagementSignalsApiAvailable = i8 % 128;
                    if (i8 % 2 != 0) {
                        videoAdsControllerAccess1004.setContentLoadState(false);
                    } else {
                        videoAdsControllerAccess1004.setContentLoadState(false);
                    }
                }
                getNameByImsi getnamebyimsi3 = koreaBenefitTabFragment.ICustomTabsCallback;
                if (getnamebyimsi3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    getnamebyimsi3 = null;
                }
                ThumbnailAdMobController thumbnailAdMobControllerOnNavigationEvent3 = getnamebyimsi3.onNavigationEvent();
                if (thumbnailAdMobControllerOnNavigationEvent3 != null) {
                    thumbnailAdMobControllerOnNavigationEvent3.setContentLoadState(false);
                }
                getNameByOperatorName getnamebyoperatorname4 = koreaBenefitTabFragment.ICustomTabsCallback;
                if (getnamebyoperatorname4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    getnamebyoperatorname4 = null;
                }
                NativeAdsView nativeAdsView3 = (NativeAdsView) getNameByOperatorName.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), new Object[]{getnamebyoperatorname4}, 1724566273, -1724566258, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
                if (nativeAdsView3 != null) {
                    nativeAdsView3.setThumbnailBannerContentLoadState(false);
                }
                koreaBenefitTabFragment.access100 = false;
                koreaBenefitTabFragment.IAuthTabCallbackStubProxy = null;
                koreaBenefitTabFragment.getInterfaceDescriptor = null;
                koreaBenefitTabFragment.newAuthTabSession();
                koreaBenefitTabFragment.prefetch();
                AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault2 = koreaBenefitTabFragment.IAuthTabCallbackDefault();
                if (addPhoneContactViewIAuthTabCallbackDefault2 != null && (viewAnimator = addPhoneContactViewIAuthTabCallbackDefault2.onRelationshipValidationResult) != null) {
                    int i9 = mayLaunchUrl + 103;
                    isEngagementSignalsApiAvailable = i9 % 128;
                    if (i9 % 2 != 0) {
                        viewAnimator.setDisplayedChild(0);
                    } else {
                        viewAnimator.setDisplayedChild(1);
                    }
                }
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                int i10 = i5 + 109;
                isEngagementSignalsApiAvailable = i10 % 128;
                int i11 = i10 % 2;
                VideoAdsController videoAdsControllerAccess1005 = koreaBenefitTabFragment.access100();
                if (videoAdsControllerAccess1005 != null) {
                    videoAdsControllerAccess1005.onWarmupCompleted();
                }
                VideoAdsController videoAdsControllerAccess1006 = koreaBenefitTabFragment.access100();
                if (videoAdsControllerAccess1006 != null) {
                    int i12 = mayLaunchUrl + 87;
                    isEngagementSignalsApiAvailable = i12 % 128;
                    int i13 = i12 % 2;
                    videoAdsControllerAccess1006.setContentLoadState(false);
                }
                getNameByImsi getnamebyimsi4 = koreaBenefitTabFragment.ICustomTabsCallback;
                if (getnamebyimsi4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    getnamebyimsi4 = null;
                }
                ThumbnailAdMobController thumbnailAdMobControllerOnNavigationEvent4 = getnamebyimsi4.onNavigationEvent();
                if (thumbnailAdMobControllerOnNavigationEvent4 != null) {
                    thumbnailAdMobControllerOnNavigationEvent4.setContentLoadState(false);
                }
                getNameByOperatorName getnamebyoperatorname5 = koreaBenefitTabFragment.ICustomTabsCallback;
                if (getnamebyoperatorname5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    getnamebyoperatorname = getnamebyoperatorname5;
                }
                NativeAdsView nativeAdsView4 = (NativeAdsView) getNameByOperatorName.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), new Object[]{getnamebyoperatorname}, 1724566273, -1724566258, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
                if (nativeAdsView4 != null) {
                    int i14 = isEngagementSignalsApiAvailable + 115;
                    mayLaunchUrl = i14 % 128;
                    if (i14 % 2 == 0) {
                        nativeAdsView4.setThumbnailBannerContentLoadState(true);
                    } else {
                        nativeAdsView4.setThumbnailBannerContentLoadState(false);
                    }
                }
            }
        } else {
            VideoAdsController videoAdsControllerAccess1007 = koreaBenefitTabFragment.access100();
            if (videoAdsControllerAccess1007 != null) {
                int i15 = mayLaunchUrl + 87;
                isEngagementSignalsApiAvailable = i15 % 128;
                int i16 = i15 % 2;
                videoAdsControllerAccess1007.setContentLoadState(true);
            }
            getNameByImsi getnamebyimsi5 = koreaBenefitTabFragment.ICustomTabsCallback;
            if (getnamebyimsi5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                getnamebyimsi5 = null;
            }
            ThumbnailAdMobController thumbnailAdMobControllerOnNavigationEvent5 = getnamebyimsi5.onNavigationEvent();
            if (thumbnailAdMobControllerOnNavigationEvent5 != null) {
                thumbnailAdMobControllerOnNavigationEvent5.setContentLoadState(true);
            }
            getNameByOperatorName getnamebyoperatorname6 = koreaBenefitTabFragment.ICustomTabsCallback;
            if (getnamebyoperatorname6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                getnamebyoperatorname6 = null;
            }
            NativeAdsView nativeAdsView5 = (NativeAdsView) getNameByOperatorName.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), new Object[]{getnamebyoperatorname6}, 1724566273, -1724566258, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
            if (nativeAdsView5 != null) {
                nativeAdsView5.setThumbnailBannerContentLoadState(true);
            }
            koreaBenefitTabFragment.access100 = false;
            koreaBenefitTabFragment.getInterfaceDescriptor = null;
            koreaBenefitTabFragment.newAuthTabSession();
            koreaBenefitTabFragment.prefetch();
            AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault3 = koreaBenefitTabFragment.IAuthTabCallbackDefault();
            if (addPhoneContactViewIAuthTabCallbackDefault3 != null) {
                int i17 = mayLaunchUrl + 7;
                isEngagementSignalsApiAvailable = i17 % 128;
                int i18 = i17 % 2;
                ViewAnimator viewAnimator3 = addPhoneContactViewIAuthTabCallbackDefault3.onRelationshipValidationResult;
                if (viewAnimator3 != null) {
                    viewAnimator3.setDisplayedChild(2);
                }
            }
        }
        return Unit.INSTANCE;
    }

    static final class onPostMessage extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ KoreaBenefitTabViewModel.IAuthTabCallback $content;
        final /* synthetic */ KoreaBenefitTabViewModel.onExtraCallback $videoAds;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onPostMessage(KoreaBenefitTabViewModel.IAuthTabCallback iAuthTabCallback, KoreaBenefitTabViewModel.onExtraCallback onextracallback, access13800<? super onPostMessage> access13800Var) {
            super(2, access13800Var);
            this.$content = iAuthTabCallback;
            this.$videoAds = onextracallback;
        }

        public static /* synthetic */ void onExtraCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, KoreaBenefitTabViewModel.onExtraCallback onextracallback) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(koreaBenefitTabFragment, onextracallback);
            if (i3 != 0) {
                int i4 = 2 / 0;
            }
            int i5 = onWarmupCompleted + 75;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        public static /* synthetic */ void onExtraCallbackWithResult(KoreaBenefitTabFragment koreaBenefitTabFragment) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(koreaBenefitTabFragment);
            if (i3 == 0) {
                int i4 = 83 / 0;
            }
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 2 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onPostMessage onpostmessage = KoreaBenefitTabFragment.this.new onPostMessage(this.$content, this.$videoAds, access13800Var);
            int i2 = onWarmupCompleted + 59;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 15 / 0;
            }
            return onpostmessage;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            Object objIAuthTabCallback;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
                int i3 = 64 / 0;
            } else {
                objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            }
            int i4 = onWarmupCompleted + 43;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            TdsRecyclerView tdsRecyclerView;
            FrameLayout frameLayoutIAuthTabCallback;
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            setResultAccount setresultaccount = (setResultAccount) KoreaBenefitTabFragment.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1621414546, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{KoreaBenefitTabFragment.this}, -1621414541, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
            KoreaBenefitTabViewModel.IAuthTabCallback iAuthTabCallback = this.$content;
            Intrinsics.checkNotNull(iAuthTabCallback);
            List listOnWarmupCompleted = setresultaccount.onWarmupCompleted(iAuthTabCallback, ((Boolean) KoreaBenefitTabFragment.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 548731946, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{KoreaBenefitTabFragment.this}, -548731936, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback())).booleanValue());
            if (((KoreaBenefitTabViewModel) KoreaBenefitTabFragment.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 493663387, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{KoreaBenefitTabFragment.this}, -493663383, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback())).onActivityLayout().IAuthTabCallback() != this.$content) {
                return Unit.INSTANCE;
            }
            AddPhoneContactView addPhoneContactViewOnMessageChannelReady = KoreaBenefitTabFragment.onMessageChannelReady(KoreaBenefitTabFragment.this);
            if (addPhoneContactViewOnMessageChannelReady != null && (frameLayoutIAuthTabCallback = addPhoneContactViewOnMessageChannelReady.IAuthTabCallback()) != null) {
                int i2 = onWarmupCompleted + 79;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    frameLayoutIAuthTabCallback.setBackgroundColor(accessgetProtocolp.onNavigationEvent(KoreaBenefitTabFragment.this).onExtraCallbackWithResult());
                    int i3 = 74 / 0;
                } else {
                    frameLayoutIAuthTabCallback.setBackgroundColor(accessgetProtocolp.onNavigationEvent(KoreaBenefitTabFragment.this).onExtraCallbackWithResult());
                }
                int i4 = IAuthTabCallback + 101;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
            getOperatorName getoperatornameOnActivityResized = KoreaBenefitTabFragment.onActivityResized(KoreaBenefitTabFragment.this);
            FragmentActivity fragmentActivityRequireActivity = KoreaBenefitTabFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            Context contextRequireContext = KoreaBenefitTabFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            KoreaBenefitTabViewModel.IAuthTabCallback iAuthTabCallback2 = this.$content;
            Intrinsics.checkNotNull(iAuthTabCallback2);
            getoperatornameOnActivityResized.onExtraCallback(fragmentActivityRequireActivity, contextRequireContext, iAuthTabCallback2);
            BasicSystemInfoExtension2 basicSystemInfoExtension2ICustomTabsService = KoreaBenefitTabFragment.ICustomTabsService(KoreaBenefitTabFragment.this);
            TelephonyInfoBridgeExtension1 telephonyInfoBridgeExtension1Access100 = this.$content.access100();
            Object obj2 = null;
            TelephonyInfoBridgeExtension1$onWarmupCompleted telephonyInfoBridgeExtension1$onWarmupCompleted = telephonyInfoBridgeExtension1Access100 instanceof TelephonyInfoBridgeExtension1$onWarmupCompleted ? (TelephonyInfoBridgeExtension1$onWarmupCompleted) telephonyInfoBridgeExtension1Access100 : null;
            basicSystemInfoExtension2ICustomTabsService.IAuthTabCallback(telephonyInfoBridgeExtension1$onWarmupCompleted != null ? telephonyInfoBridgeExtension1$onWarmupCompleted.onNavigationEvent() : null);
            KoreaBenefitTabFragment koreaBenefitTabFragment = KoreaBenefitTabFragment.this;
            KoreaBenefitTabViewModel.IAuthTabCallback iAuthTabCallback3 = this.$content;
            Intrinsics.checkNotNull(iAuthTabCallback3);
            KoreaBenefitTabFragment.IAuthTabCallback(koreaBenefitTabFragment, iAuthTabCallback3);
            KoreaBenefitTabFragment.IAuthTabCallback(KoreaBenefitTabFragment.this, listOnWarmupCompleted, true);
            KoreaBenefitTabFragment.onNavigationEvent(KoreaBenefitTabFragment.this, this.$content);
            KoreaBenefitTabFragment koreaBenefitTabFragment2 = KoreaBenefitTabFragment.this;
            KoreaBenefitTabViewModel.IAuthTabCallback iAuthTabCallback4 = this.$content;
            Intrinsics.checkNotNull(iAuthTabCallback4);
            KoreaBenefitTabFragment.onWarmupCompleted(koreaBenefitTabFragment2, iAuthTabCallback4);
            if (this.$content.readTypedObject()) {
                return Unit.INSTANCE;
            }
            if (((KoreaBenefitTabViewModel) KoreaBenefitTabFragment.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 493663387, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{KoreaBenefitTabFragment.this}, -493663383, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback())).newAuthTabSession()) {
                int i6 = onWarmupCompleted + 29;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                AddPhoneContactView addPhoneContactViewOnMessageChannelReady2 = KoreaBenefitTabFragment.onMessageChannelReady(KoreaBenefitTabFragment.this);
                if (addPhoneContactViewOnMessageChannelReady2 != null && (tdsRecyclerView = addPhoneContactViewOnMessageChannelReady2.onActivityLayout) != null) {
                    tdsRecyclerView.post(new KoreaBenefitTabFragment$setupViewModel$2$1$.ExternalSyntheticLambda0(KoreaBenefitTabFragment.this));
                }
            } else {
                KoreaBenefitTabViewModel.onExtraCallback onextracallback = this.$videoAds;
                KoreaBenefitTabViewModel.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback = onextracallback != null ? onextracallback.IAuthTabCallback() : null;
                int i8 = onextracallbackwithresultIAuthTabCallback == null ? -1 : onNavigationEvent.onNavigationEvent[onextracallbackwithresultIAuthTabCallback.ordinal()];
                if (i8 == 1) {
                    AddPhoneContactView addPhoneContactViewOnMessageChannelReady3 = KoreaBenefitTabFragment.onMessageChannelReady(KoreaBenefitTabFragment.this);
                    if (addPhoneContactViewOnMessageChannelReady3 != null) {
                        int i9 = IAuthTabCallback + 99;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                        TdsRecyclerView tdsRecyclerView2 = addPhoneContactViewOnMessageChannelReady3.onActivityLayout;
                        if (tdsRecyclerView2 != null) {
                            tdsRecyclerView2.post(new KoreaBenefitTabFragment$setupViewModel$2$1$.ExternalSyntheticLambda1(KoreaBenefitTabFragment.this, this.$videoAds));
                        }
                    }
                } else if (i8 != 2) {
                    KoreaBenefitTabFragment.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1906131761, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{KoreaBenefitTabFragment.this, null}, 1906131764, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
                }
            }
            KoreaBenefitTabFragment.ICustomTabsCallbackStubProxy(KoreaBenefitTabFragment.this).IAuthTabCallback(listOnWarmupCompleted);
            KoreaBenefitTabFragment.ICustomTabsService(KoreaBenefitTabFragment.this).onNavigationEvent(listOnWarmupCompleted);
            String strExtraCommand = KoreaBenefitTabFragment.extraCommand(KoreaBenefitTabFragment.this);
            if (strExtraCommand != null) {
                KoreaBenefitTabFragment koreaBenefitTabFragment3 = KoreaBenefitTabFragment.this;
                KoreaBenefitTabFragment.IAuthTabCallback(koreaBenefitTabFragment3, strExtraCommand);
                Bundle arguments = koreaBenefitTabFragment3.getArguments();
                if (arguments != null) {
                    arguments.remove("scrollToSection");
                }
            }
            String strOnTransact = (String) KoreaBenefitTabFragment.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 905180817, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{KoreaBenefitTabFragment.this}, -905180784, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
            if (strOnTransact == null) {
                strOnTransact = this.$content.onTransact();
                int i11 = onWarmupCompleted + 59;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
            }
            if (strOnTransact != null) {
                KoreaBenefitTabFragment koreaBenefitTabFragment4 = KoreaBenefitTabFragment.this;
                KoreaBenefitTabFragment.onNavigationEvent(koreaBenefitTabFragment4, strOnTransact);
                Bundle arguments2 = koreaBenefitTabFragment4.getArguments();
                if (arguments2 != null) {
                    int i13 = onWarmupCompleted + 77;
                    IAuthTabCallback = i13 % 128;
                    if (i13 % 2 != 0) {
                        arguments2.remove("highlightServiceType");
                        obj2.hashCode();
                        throw null;
                    }
                    arguments2.remove("highlightServiceType");
                }
            }
            return Unit.INSTANCE;
        }

        private static final void IAuthTabCallback(KoreaBenefitTabFragment koreaBenefitTabFragment) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            Object[] objArr = {koreaBenefitTabFragment, null};
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            if (i3 != 0) {
                KoreaBenefitTabFragment.onExtraCallback(iIAuthTabCallback2, -1906131761, iIAuthTabCallback4, iIAuthTabCallback3, objArr, 1906131764, iIAuthTabCallback);
                obj.hashCode();
                throw null;
            }
            KoreaBenefitTabFragment.onExtraCallback(iIAuthTabCallback2, -1906131761, iIAuthTabCallback4, iIAuthTabCallback3, objArr, 1906131764, iIAuthTabCallback);
            int i4 = IAuthTabCallback + 25;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 53 / 0;
            }
        }

        private static final void onWarmupCompleted(KoreaBenefitTabFragment koreaBenefitTabFragment, KoreaBenefitTabViewModel.onExtraCallback onextracallback) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {koreaBenefitTabFragment, onextracallback.onWarmupCompleted()};
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            KoreaBenefitTabFragment.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1906131761, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, 1906131764, iIAuthTabCallback);
            VideoAdsController videoAdsControllerOnUnminimized = KoreaBenefitTabFragment.onUnminimized(koreaBenefitTabFragment);
            if (videoAdsControllerOnUnminimized != null && videoAdsControllerOnUnminimized.onNavigationEvent()) {
                int i4 = onWarmupCompleted + 103;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                VideoAdsController videoAdsControllerOnUnminimized2 = KoreaBenefitTabFragment.onUnminimized(koreaBenefitTabFragment);
                if (videoAdsControllerOnUnminimized2 != null) {
                    int i6 = onWarmupCompleted + 95;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    videoAdsControllerOnUnminimized2.setOnPlayerViewVisible(true);
                }
            }
            int i8 = IAuthTabCallback + 73;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    private static final Unit asBinder(KoreaBenefitTabFragment koreaBenefitTabFragment, KoreaBenefitTabViewModel.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        KoreaBenefitTabViewModel.onExtraCallback onextracallbackWriteTypedObject = iAuthTabCallback.writeTypedObject();
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = koreaBenefitTabFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, koreaBenefitTabFragment.new onPostMessage(iAuthTabCallback, onextracallbackWriteTypedObject, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = isEngagementSignalsApiAvailable + 45;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 69 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        int i = 2 % 2;
        TextFieldKeyInputExternalSyntheticLambda7.onExtraCallback(koreaBenefitTabFragment.onMessageChannelReady().onExtraCallbackWithResult(), (CoroutineContext) null, 0L, 3, (Object) null).observe(koreaBenefitTabFragment.getViewLifecycleOwner(), new extraCallbackWithResult(new KoreaBenefitTabFragment$.ExternalSyntheticLambda14(koreaBenefitTabFragment)));
        TextFieldKeyInputExternalSyntheticLambda7.onExtraCallback(ycxycx.onExtraCallbackWithResult(koreaBenefitTabFragment.onMessageChannelReady().onActivityResized()), (CoroutineContext) null, 0L, 3, (Object) null).observe(koreaBenefitTabFragment.getViewLifecycleOwner(), new extraCallbackWithResult(new KoreaBenefitTabFragment$.ExternalSyntheticLambda15(koreaBenefitTabFragment)));
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(koreaBenefitTabFragment), (CoroutineContext) null, (setRandomHost) null, new onMinimized(koreaBenefitTabFragment, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(koreaBenefitTabFragment), (CoroutineContext) null, (setRandomHost) null, new onMessageChannelReady(koreaBenefitTabFragment, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(koreaBenefitTabFragment), (CoroutineContext) null, (setRandomHost) null, new onActivityLayout(koreaBenefitTabFragment, (access13800) null), 3, (Object) null);
        setBaseDeeplink.onNavigationEvent(koreaBenefitTabFragment, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, new onActivityResized(koreaBenefitTabFragment, (access13800) null), 1, (Object) null);
        int i2 = isEngagementSignalsApiAvailable + 61;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        List list = (List) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        exitAllPages exitallpages = koreaBenefitTabFragment.ICustomTabsCallback;
        Object obj = null;
        if (exitallpages == null) {
            int i2 = isEngagementSignalsApiAvailable + 29;
            mayLaunchUrl = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            exitallpages = null;
        }
        exitallpages.onExtraCallbackWithResult(list, zBooleanValue);
        int i4 = mayLaunchUrl + 71;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) throws Throwable {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        int i = 2 % 2;
        AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault = koreaBenefitTabFragment.IAuthTabCallbackDefault();
        if (addPhoneContactViewIAuthTabCallbackDefault != null) {
            int i2 = isEngagementSignalsApiAvailable + 83;
            mayLaunchUrl = i2 % 128;
            int i3 = i2 % 2;
            ComposeView composeView = addPhoneContactViewIAuthTabCallbackDefault.asInterface;
            if (composeView != null) {
                int i4 = mayLaunchUrl + 85;
                isEngagementSignalsApiAvailable = i4 % 128;
                if (i4 % 2 != 0) {
                    composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
                    int i5 = 88 / 0;
                } else {
                    composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
                }
            }
        }
        koreaBenefitTabFragment.newAuthTabSession();
        return null;
    }

    private final void onNavigationEvent(KoreaBenefitTabViewModel.IAuthTabCallback iAuthTabCallback) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 101;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            this.IAuthTabCallbackStubProxy = Long.valueOf(((Long) KoreaBenefitTabViewModel.IAuthTabCallback.onWarmupCompleted(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1248978358, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{iAuthTabCallback}, -1248978356, iOnExtraCallbackWithResult2)).longValue());
            this.IAuthTabCallback_Parcel = iAuthTabCallback.IAuthTabCallback_Parcel();
            newAuthTabSession();
            return;
        }
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        this.IAuthTabCallbackStubProxy = Long.valueOf(((Long) KoreaBenefitTabViewModel.IAuthTabCallback.onWarmupCompleted(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1248978358, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{iAuthTabCallback}, -1248978356, iOnExtraCallbackWithResult4)).longValue());
        this.IAuthTabCallback_Parcel = iAuthTabCallback.IAuthTabCallback_Parcel();
        newAuthTabSession();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View, androidx.compose.ui.platform.ComposeView] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    private final void newAuthTabSession() throws Throwable {
        ?? r1;
        boolean zAsInterface;
        boolean z;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 85;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (addPhoneContactViewIAuthTabCallbackDefault == null || (r1 = addPhoneContactViewIAuthTabCallbackDefault.asInterface) == 0) {
            return;
        }
        int i4 = mayLaunchUrl + 7;
        isEngagementSignalsApiAvailable = i4 % 128;
        boolean z2 = false;
        if (i4 % 2 != 0) {
            zAsInterface = asInterface();
            if (r1.getVisibility() == 0) {
                z2 = true;
                z = z2;
                z2 = true;
            } else {
                z = true;
            }
        } else {
            zAsInterface = asInterface();
            if (r1.getVisibility() == 0) {
                z = z2;
                z2 = true;
            } else {
                z = false;
            }
        }
        if (z2 != zAsInterface) {
            ?? r5 = z;
            if (!zAsInterface) {
                r5 = 8;
            }
            r1.setVisibility(r5);
            if (zAsInterface) {
                int i5 = mayLaunchUrl + 7;
                isEngagementSignalsApiAvailable = i5 % 128;
                int i6 = i5 % 2;
                if (!r1.isLaidOut() || r1.isLayoutRequested()) {
                    r1.addOnLayoutChangeListener(new isEngagementSignalsApiAvailable());
                } else {
                    int i7 = isEngagementSignalsApiAvailable + 35;
                    mayLaunchUrl = i7 % 128;
                    int i8 = i7 % 2;
                    onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -793573870, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this}, 793573900, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
                }
            } else {
                mayLaunchUrl();
            }
        }
        if (zAsInterface) {
            r1.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(695053305, true, new KoreaBenefitTabFragment$.ExternalSyntheticLambda0(this))));
        }
    }

    private static final Unit onGreatestScrollPercentageIncreased(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 101;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallback_Parcel onBackPressedDispatcher = koreaBenefitTabFragment.requireActivity().getOnBackPressedDispatcher();
        if (i3 == 0) {
            onBackPressedDispatcher.onExtraCallbackWithResult();
            return Unit.INSTANCE;
        }
        onBackPressedDispatcher.onExtraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit IEngagementSignalsCallbackDefault(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 111;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallback_Parcel onBackPressedDispatcher = koreaBenefitTabFragment.requireActivity().getOnBackPressedDispatcher();
        if (i3 != 0) {
            onBackPressedDispatcher.onExtraCallbackWithResult();
            return Unit.INSTANCE;
        }
        onBackPressedDispatcher.onExtraCallbackWithResult();
        int i4 = 84 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, long j) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 97;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        koreaBenefitTabFragment.onExtraCallbackWithResult(j, koreaBenefitTabFragment.IAuthTabCallback_Parcel);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, MaxAppOpenAdapterListener maxAppOpenAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 83;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(maxAppOpenAdapterListener, "");
        if ((i & 17) != 16) {
            int i5 = isEngagementSignalsApiAvailable + 61;
            mayLaunchUrl = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = isEngagementSignalsApiAvailable + 55;
            mayLaunchUrl = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = isEngagementSignalsApiAvailable + 77;
                mayLaunchUrl = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-486373225, i, -1, "im.toss.features.benefit.ui.KoreaBenefitTabFragment.updateHomeLauncherNavigation.<anonymous>.<anonymous> (KoreaBenefitTabFragment.kt:1058)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-486373225, i, -1, "im.toss.features.benefit.ui.KoreaBenefitTabFragment.updateHomeLauncherNavigation.<anonymous>.<anonymous> (KoreaBenefitTabFragment.kt:1058)");
                int i10 = mayLaunchUrl + 119;
                isEngagementSignalsApiAvailable = i10 % 128;
                int i11 = i10 % 2;
            }
            Long l = koreaBenefitTabFragment.IAuthTabCallbackStubProxy;
            if (l == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1674971614);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i12 = isEngagementSignalsApiAvailable + 89;
                mayLaunchUrl = i12 % 128;
                int i13 = i12 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1674971615);
                long jLongValue = l.longValue();
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(koreaBenefitTabFragment);
                boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(jLongValue);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback | zOnWarmupCompleted)) {
                    int i14 = isEngagementSignalsApiAvailable + 5;
                    mayLaunchUrl = i14 % 128;
                    int i15 = i14 % 2;
                    Object obj2 = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Object externalSyntheticLambda38 = new KoreaBenefitTabFragment$.ExternalSyntheticLambda38(koreaBenefitTabFragment, jLongValue);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda38);
                        obj2 = externalSyntheticLambda38;
                    }
                    koreaBenefitTabFragment.onWarmupCompleted(jLongValue, (Function0) obj2, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 4);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(KoreaBenefitTabFragment koreaBenefitTabFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = mayLaunchUrl + 25;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 2) != 4, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = isEngagementSignalsApiAvailable + 93;
                mayLaunchUrl = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(695053305, i, -1, "im.toss.features.benefit.ui.KoreaBenefitTabFragment.updateHomeLauncherNavigation.<anonymous> (KoreaBenefitTabFragment.kt:1042)");
            }
            if (koreaBenefitTabFragment.getInterfaceDescriptor != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(295757484);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
                MaxAdapterListener maxAdapterListener = MaxAdapterListener.onExtraCallbackWithResult;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent, maxAdapterListener.onExtraCallback(), 0.0f, 0.0f, 0.0f, 14, (Object) null);
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.asInterface(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    int i6 = mayLaunchUrl + 117;
                    isEngagementSignalsApiAvailable = i6 % 128;
                    int i7 = i6 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(koreaBenefitTabFragment);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback) {
                    int i8 = mayLaunchUrl + 39;
                    isEngagementSignalsApiAvailable = i8 % 128;
                    int i9 = i8 % 2;
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        KoreaBenefitTabFragment$.ExternalSyntheticLambda52 externalSyntheticLambda52 = new KoreaBenefitTabFragment$.ExternalSyntheticLambda52(koreaBenefitTabFragment);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda52);
                        obj = externalSyntheticLambda52;
                    }
                    maxAdapterListener.onExtraCallbackWithResult((Function0) obj, (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 3072, 6);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(296241890);
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(koreaBenefitTabFragment);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback2) {
                    Object obj2 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        KoreaBenefitTabFragment$.ExternalSyntheticLambda53 externalSyntheticLambda53 = new KoreaBenefitTabFragment$.ExternalSyntheticLambda53(koreaBenefitTabFragment);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda53);
                        obj2 = externalSyntheticLambda53;
                    }
                    int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                    MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj2, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, ByteOrderedDataOutputStream.onExtraCallback(((Integer) onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -627628129, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{koreaBenefitTabFragment}, 627628137, iIAuthTabCallback)).intValue()), (DeviceQuirksExternalSyntheticLambda0) null, ForwardingCameraControl.onExtraCallback(-486373225, true, new KoreaBenefitTabFragment$.ExternalSyntheticLambda54(koreaBenefitTabFragment), cameraCaptureResultEmptyCameraCaptureResult, 54), (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, 1572864, 174);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        int i = 2 % 2;
        if (!koreaBenefitTabFragment.access100) {
            return Integer.valueOf(accessgetProtocolp.onNavigationEvent(koreaBenefitTabFragment).onWarmupCompleted());
        }
        int i2 = mayLaunchUrl;
        int i3 = i2 + 101;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        Integer num = koreaBenefitTabFragment.getInterfaceDescriptor;
        if (num == null) {
            return Integer.valueOf(accessgetProtocolp.onNavigationEvent(koreaBenefitTabFragment).onExtraCallbackWithResult());
        }
        int i5 = i2 + 91;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        int iIntValue = num.intValue();
        int i7 = isEngagementSignalsApiAvailable + 107;
        mayLaunchUrl = i7 % 128;
        int i8 = i7 % 2;
        return Integer.valueOf(iIntValue);
    }

    private final void prefetch() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 67;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (addPhoneContactViewIAuthTabCallbackDefault != null) {
            int i4 = isEngagementSignalsApiAvailable + 29;
            mayLaunchUrl = i4 % 128;
            if (i4 % 2 != 0) {
                View view = addPhoneContactViewIAuthTabCallbackDefault.onActivityResized;
                if (view != null) {
                    int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                    int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                    int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                    view.setBackgroundColor(((Integer) onExtraCallback(iIAuthTabCallback2, -627628129, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{this}, 627628137, iIAuthTabCallback)).intValue());
                }
            } else {
                View view2 = addPhoneContactViewIAuthTabCallbackDefault.onActivityResized;
                throw null;
            }
        }
        int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback5 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback6 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onWarmupCompleted(((Integer) onExtraCallback(iIAuthTabCallback5, -627628129, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback6, new Object[]{this}, 627628137, iIAuthTabCallback4)).intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(long j, Function0<Unit> function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws Throwable {
        int i3;
        int i4;
        int i5;
        int i6;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        int i7 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(154718201);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) {
                int i8 = isEngagementSignalsApiAvailable + 89;
                mayLaunchUrl = i8 % 128;
                i6 = i8 % 2 == 0 ? 3 : 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i9 = mayLaunchUrl + 51;
                isEngagementSignalsApiAvailable = i9 % 128;
                i5 = i9 % 2 != 0 ? 110 : 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            int i11 = mayLaunchUrl + 47;
            isEngagementSignalsApiAvailable = i11 % 128;
            int i12 = i11 % 2;
            i3 |= 384;
        } else if ((i & 384) == 0) {
            int i13 = isEngagementSignalsApiAvailable + 5;
            mayLaunchUrl = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 44 / 0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i15 = mayLaunchUrl + 29;
                    isEngagementSignalsApiAvailable = i15 % 128;
                    i4 = i15 % 2 != 0 ? 3932 : 256;
                } else {
                    i4 = 128;
                }
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
            }
            i3 |= i4;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
            if (i10 != 0) {
                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(154718201, i3, -1, "im.toss.features.benefit.ui.KoreaBenefitTabFragment.HomeLauncherPointAction (KoreaBenefitTabFragment.kt:1087)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(configureReward.onExtraCallback(quirksExternalSyntheticBackport02, (getConfiguration) null, (getCachingExecutorService) null, false, false, false, false, (String) null, (Role) null, function0, 255, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), QuirkSettingsLoader.Companion.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f));
            Object[] objArr = new Object[1];
            a(new char[]{48745, 48455, 37725, 58386, 48641, 22508, 18071, 9471, 5478, 11046, 4680, 34852, 59618, 64740, 49034, 62451, 48244, 20599, 19265, 10103, 5110, 9723, 4224, 35505, 59244, 63841, 48216, 65138, 47842, 21231, 18837, 8676, 3618, 9844, 5393, 38260, 58790, 64460, 41659, 63552, 47452, 20255, 20008, 9093, 3228, 8320, 7076, 38670, 57427, 62464, 42850, 64128, 47056, 18842, 19632, 11795, 2880, 7490, 6183, 37269, 57030}, ExpandableListView.getPackedPositionGroup(0L) + 1, objArr);
            AppLovinNativeAdImplc.onExtraCallbackWithResult(((String) objArr[0]).intern(), quirksExternalSyntheticBackport0IAuthTabCallbackDefault, 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54, 508);
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{getLongName.onNavigationEvent(j, (ParamImpl) null, 1, (Object) null), null, AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor(), Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i16 = mayLaunchUrl + 29;
            isEngagementSignalsApiAvailable = i16 % 128;
            int i17 = i16 % 2;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new KoreaBenefitTabFragment$.ExternalSyntheticLambda32(this, j, function0, quirksExternalSyntheticBackport03, i, i2));
        }
    }

    private final void onActivityLayout() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 11;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            if (addPhoneContactViewIAuthTabCallbackDefault != null) {
                int i3 = mayLaunchUrl + 99;
                isEngagementSignalsApiAvailable = i3 % 128;
                if (i3 % 2 != 0) {
                    TdsResultV0View tdsResultV0View = addPhoneContactViewIAuthTabCallbackDefault.onWarmupCompleted;
                    obj.hashCode();
                    throw null;
                }
                TdsResultV0View tdsResultV0View2 = addPhoneContactViewIAuthTabCallbackDefault.onWarmupCompleted;
                if (tdsResultV0View2 != null) {
                    Context context = tdsResultV0View2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    Resources resources = context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "");
                    Configuration configuration = resources.getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration, "");
                    tdsResultV0View2.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new onWarmupCompleted(configuration)).onWarmupCompleted());
                    tdsResultV0View2.setLottieImageFromAsset("lottie/spot-error.json");
                    tdsResultV0View2.setTitle(getString(viva.republica.toss.R.string.app_main___fa83af2314));
                    tdsResultV0View2.setSubtitle("");
                    TdsButtonV1View tdsButtonV1ViewAsInterface = tdsResultV0View2.asInterface();
                    tdsButtonV1ViewAsInterface.setVisibility(0);
                    tdsButtonV1ViewAsInterface.setText(tdsButtonV1ViewAsInterface.getContext().getString(viva.republica.toss.R.string.app_main___ad8db664ed));
                    Object[] objArr = {tdsButtonV1ViewAsInterface, ParamUtils.LONG, new KoreaBenefitTabFragment$.ExternalSyntheticLambda27(this)};
                    int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
                    int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
                }
            }
            int i4 = mayLaunchUrl + 53;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        IAuthTabCallbackDefault();
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, View view) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 41;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        koreaBenefitTabFragment.onRetry();
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 43;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final Unit onPostMessage() {
        InventoryAdManager inventoryAdManagerUpdateVisuals;
        zzdt zzdtVar;
        zzm zzmVar;
        TdsRecyclerView tdsRecyclerView;
        InventoryAdManager.IAuthTabCallback iAuthTabCallback;
        Map map;
        InventoryAdManager.onExtraCallbackWithResult onextracallbackwithresult;
        int i;
        int i2 = 2 % 2;
        int i3 = mayLaunchUrl + 87;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 != 0) {
            IAuthTabCallbackDefault();
            throw null;
        }
        AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (addPhoneContactViewIAuthTabCallbackDefault == null) {
            return null;
        }
        int i4 = mayLaunchUrl + 23;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            Object[] objArr = {onMessageChannelReady(), updateVisuals()};
            KoreaBenefitTabViewModel.IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 936401052, -936401037);
            inventoryAdManagerUpdateVisuals = updateVisuals();
            zzdtVar = zzdt.BENEFIT;
            zzmVar = zzm.INVENTORY_BENEFIT_CARDS;
            tdsRecyclerView = addPhoneContactViewIAuthTabCallbackDefault.onActivityLayout;
            iAuthTabCallback = null;
            map = null;
            onextracallbackwithresult = null;
            i = 33;
        } else {
            Object[] objArr2 = {onMessageChannelReady(), updateVisuals()};
            KoreaBenefitTabViewModel.IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr2, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 936401052, -936401037);
            inventoryAdManagerUpdateVisuals = updateVisuals();
            zzdtVar = zzdt.BENEFIT;
            zzmVar = zzm.INVENTORY_BENEFIT_CARDS;
            tdsRecyclerView = addPhoneContactViewIAuthTabCallbackDefault.onActivityLayout;
            iAuthTabCallback = null;
            map = null;
            onextracallbackwithresult = null;
            i = 88;
        }
        InventoryAdManager.onWarmupCompleted(inventoryAdManagerUpdateVisuals, this, zzdtVar, zzmVar, iAuthTabCallback, map, tdsRecyclerView, onextracallbackwithresult, i, (Object) null);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        KoreaBenefitTabFragment koreaBenefitTabFragment = (KoreaBenefitTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 105;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            koreaBenefitTabFragment.IAuthTabCallbackDefault();
            obj.hashCode();
            throw null;
        }
        AddPhoneContactView addPhoneContactViewIAuthTabCallbackDefault = koreaBenefitTabFragment.IAuthTabCallbackDefault();
        if (addPhoneContactViewIAuthTabCallbackDefault == null) {
            return null;
        }
        int i3 = mayLaunchUrl + 101;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        koreaBenefitTabFragment.onMessageChannelReady().onExtraCallback(koreaBenefitTabFragment.onNavigationEvent());
        NativeAdsManager nativeAdsManagerOnNavigationEvent = koreaBenefitTabFragment.onNavigationEvent();
        TdsRecyclerView tdsRecyclerView = addPhoneContactViewIAuthTabCallbackDefault.onActivityLayout;
        Object[] objArr2 = new Object[1];
        a(new char[]{38109, 30113, 46864, 45376, 38124}, Color.blue(0) + 1, objArr2);
        NativeAdsManager.onWarmupCompleted(nativeAdsManagerOnNavigationEvent, koreaBenefitTabFragment, ((String) objArr2[0]).intern(), (Set) null, tdsRecyclerView, (addNewItem) null, (ViewPager2LinearLayoutManagerImpl) null, 52, (Object) null);
        koreaBenefitTabFragment.onMessageChannelReady().mayLaunchUrl();
        Unit unit = Unit.INSTANCE;
        int i5 = mayLaunchUrl + 113;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private final VideoAdsController access100() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl;
        int i3 = i2 + 39;
        isEngagementSignalsApiAvailable = i3 % 128;
        getNameByOperatorName getnamebyoperatorname = null;
        if (i3 % 2 != 0) {
            getnamebyoperatorname.hashCode();
            throw null;
        }
        getNameByOperatorName getnamebyoperatorname2 = this.ICustomTabsCallback;
        if (getnamebyoperatorname2 == null) {
            int i4 = i2 + 87;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 != 0) {
                throw null;
            }
        } else {
            getnamebyoperatorname = getnamebyoperatorname2;
        }
        VideoAdsController videoAdsControllerIAuthTabCallback = getnamebyoperatorname.IAuthTabCallback();
        int i6 = mayLaunchUrl + 91;
        isEngagementSignalsApiAvailable = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 10 / 0;
        }
        return videoAdsControllerIAuthTabCallback;
    }

    private final StyledPlayerView access000() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 45;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        getNameByOperatorName getnamebyoperatorname = this.ICustomTabsCallback;
        Object obj = null;
        if (getnamebyoperatorname == null) {
            int i5 = i3 + 89;
            mayLaunchUrl = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i6 == 0) {
                obj.hashCode();
                throw null;
            }
            getnamebyoperatorname = null;
        }
        StyledPlayerView styledPlayerViewIAuthTabCallbackStub = getnamebyoperatorname.IAuthTabCallbackStub();
        int i7 = mayLaunchUrl + 91;
        isEngagementSignalsApiAvailable = i7 % 128;
        if (i7 % 2 == 0) {
            return styledPlayerViewIAuthTabCallbackStub;
        }
        throw null;
    }

    public void onDestroyView() {
        int i = 2 % 2;
        TinyAppHostApduService1.onNavigationEvent.onNavigationEvent();
        AccessibilityManager accessibilityManager = this.onWarmupCompleted;
        if (accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(this.onUnminimized);
            int i2 = isEngagementSignalsApiAvailable + 51;
            mayLaunchUrl = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 / 2;
            }
        }
        WorkflowUnit workflowUnit = null;
        this.onWarmupCompleted = null;
        VideoAdsController videoAdsControllerAccess100 = access100();
        if (videoAdsControllerAccess100 != null) {
            int i4 = isEngagementSignalsApiAvailable + 125;
            mayLaunchUrl = i4 % 128;
            if (i4 % 2 != 0) {
                videoAdsControllerAccess100.onWarmupCompleted("onDestroyView");
            } else {
                videoAdsControllerAccess100.onWarmupCompleted("onDestroyView");
                int i5 = 77 / 0;
            }
        }
        writeTypedObject().onNavigationEvent();
        isEngagementSignalsApiAvailable();
        WorkflowUnit workflowUnit2 = this.onExtraCallbackWithResult;
        if (workflowUnit2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            workflowUnit = workflowUnit2;
        }
        workflowUnit.asBinder();
        super.onDestroyView();
    }

    private final void onWarmupCompleted(String str) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new writeTypedObject(str, null), 3, (Object) null);
        int i2 = isEngagementSignalsApiAvailable + 125;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class writeTypedObject extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ String $sectionType;
        int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        writeTypedObject(String str, access13800<? super writeTypedObject> access13800Var) {
            super(2, access13800Var);
            this.$sectionType = str;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 45;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            writeTypedObject writetypedobject = KoreaBenefitTabFragment.this.new writeTypedObject(this.$sectionType, access13800Var);
            int i2 = onExtraCallbackWithResult + 93;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return writetypedobject;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 109;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i;
            int i2;
            TdsRecyclerView tdsRecyclerView;
            BenefitTabLinearLayoutManager benefitTabLinearLayoutManager;
            int i3 = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                exitAllPages exitallpagesICustomTabsCallbackStub = KoreaBenefitTabFragment.ICustomTabsCallbackStub(KoreaBenefitTabFragment.this);
                if (exitallpagesICustomTabsCallbackStub == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    exitallpagesICustomTabsCallbackStub = null;
                }
                List listOnExtraCallbackWithResult = exitallpagesICustomTabsCallbackStub.onExtraCallbackWithResult();
                KoreaBenefitTabFragment koreaBenefitTabFragment = KoreaBenefitTabFragment.this;
                String str = this.$sectionType;
                Iterator it = listOnExtraCallbackWithResult.iterator();
                int i5 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    int i6 = onExtraCallback + 15;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    if (KoreaBenefitTabFragment.onWarmupCompleted(koreaBenefitTabFragment, (SensorBridgeExtension3) it.next(), str)) {
                        i = i5;
                        break;
                    }
                    i5++;
                }
                if (i < 0) {
                    int i8 = onExtraCallbackWithResult + 121;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        return Unit.INSTANCE;
                    }
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }
                this.I$0 = i;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(300L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                i2 = i;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = onExtraCallbackWithResult + 45;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                i2 = this.I$0;
                ResultKt.onNavigationEvent(obj);
            }
            AddPhoneContactView addPhoneContactViewOnMessageChannelReady = KoreaBenefitTabFragment.onMessageChannelReady(KoreaBenefitTabFragment.this);
            if (addPhoneContactViewOnMessageChannelReady == null || (tdsRecyclerView = addPhoneContactViewOnMessageChannelReady.onActivityLayout) == null) {
                return Unit.INSTANCE;
            }
            BenefitTabLinearLayoutManager layoutManager = tdsRecyclerView.getLayoutManager();
            if (layoutManager instanceof BenefitTabLinearLayoutManager) {
                benefitTabLinearLayoutManager = layoutManager;
                int i11 = onExtraCallback + 35;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
            } else {
                benefitTabLinearLayoutManager = null;
            }
            if (benefitTabLinearLayoutManager == null) {
                int i13 = onExtraCallbackWithResult + 53;
                onExtraCallback = i13 % 128;
                int i14 = i13 % 2;
                return Unit.INSTANCE;
            }
            benefitTabLinearLayoutManager.onWarmupCompleted(tdsRecyclerView, i2);
            Unit unit2 = Unit.INSTANCE;
            int i15 = onExtraCallbackWithResult + 51;
            onExtraCallback = i15 % 128;
            if (i15 % 2 == 0) {
                return unit2;
            }
            throw null;
        }
    }

    private final boolean onWarmupCompleted(SensorBridgeExtension3 sensorBridgeExtension3, String str) {
        int i = 2 % 2;
        if (StringsKt.isBlank(str)) {
            int i2 = isEngagementSignalsApiAvailable + 121;
            mayLaunchUrl = i2 % 128;
            return i2 % 2 == 0;
        }
        if ((sensorBridgeExtension3 instanceof stopDeviceMotionListening) || (sensorBridgeExtension3 instanceof setNode) || (sensorBridgeExtension3 instanceof enableRotationVector)) {
            return StringsKt.equals(str, "ACTIVATION_INTELLIGENCE", true);
        }
        if (sensorBridgeExtension3 instanceof RotationVectorAbility) {
            boolean zEquals = StringsKt.equals(str, "BENEFIT_MISSION", true);
            int i3 = isEngagementSignalsApiAvailable + 67;
            mayLaunchUrl = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 75 / 0;
            }
            return zEquals;
        }
        if (!(sensorBridgeExtension3 instanceof registerShakeListener)) {
            if (!(sensorBridgeExtension3 instanceof ShakeMonitorBridgeExtension)) {
                if (sensorBridgeExtension3 instanceof DeviceOrientationBridgeExtension) {
                    return StringsKt.equals(str, "TOSSBANK_CARD_CASHBACK", true);
                }
                return false;
            }
            int i5 = isEngagementSignalsApiAvailable + 99;
            mayLaunchUrl = i5 % 128;
            int i6 = i5 % 2;
            return StringsKt.equals(str, "POINT_BACK", true);
        }
        int i7 = mayLaunchUrl + 61;
        isEngagementSignalsApiAvailable = i7 % 128;
        int i8 = i7 % 2;
        boolean zEquals2 = StringsKt.equals(((registerShakeListener) sensorBridgeExtension3).onExtraCallbackWithResult(), str, true);
        int i9 = mayLaunchUrl + 19;
        isEngagementSignalsApiAvailable = i9 % 128;
        if (i9 % 2 == 0) {
            return zEquals2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallback(String str) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onUnminimized(str, null), 3, (Object) null);
        int i2 = mayLaunchUrl + 37;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class onUnminimized extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ String $serviceType;
        int I$0;
        int I$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onUnminimized(String str, access13800<? super onUnminimized> access13800Var) {
            super(2, access13800Var);
            this.$serviceType = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onUnminimized onunminimized = KoreaBenefitTabFragment.this.new onUnminimized(this.$serviceType, access13800Var);
            int i2 = IAuthTabCallback + 101;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onunminimized;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 65;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 38 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 67;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 27 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:106:0x028c  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00af A[PHI: r10
          0x00af: PHI (r10v8 java.util.List) = (r10v7 java.util.List), (r10v17 java.util.List) binds: [B:35:0x00ad, B:32:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b9 A[PHI: r10
          0x00b9: PHI (r10v9 java.util.List) = (r10v7 java.util.List), (r10v8 java.util.List), (r10v17 java.util.List) binds: [B:35:0x00ad, B:37:0x00b6, B:32:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01a2  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01bf  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            boolean zAreEqual;
            List listOnExtraCallbackWithResult;
            RecyclerView.LayoutManager layoutManager;
            BenefitTabLinearLayoutManager benefitTabLinearLayoutManager;
            int i2;
            TdsRecyclerView tdsRecyclerView;
            TdsRecyclerView tdsRecyclerView2;
            FrameLayout frameLayoutIAuthTabCallback;
            exitAllPages exitallpagesICustomTabsCallbackStub;
            RotationVectorAbility1.onExtraCallback onextracallback;
            RotationVectorAbility1.onExtraCallback onextracallbackOnExtraCallbackWithResult;
            Cards.Card card;
            int i3;
            registerDefault.onNavigationEvent onnavigationevent;
            boolean z;
            boolean z2;
            String str;
            String str2;
            int iOnNavigationEvent;
            int i4;
            int i5;
            int i6 = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i7 = this.label;
            exitAllPages exitallpages = null;
            if (i7 == 0) {
                ResultKt.onNavigationEvent(obj);
                exitAllPages exitallpagesICustomTabsCallbackStub2 = KoreaBenefitTabFragment.ICustomTabsCallbackStub(KoreaBenefitTabFragment.this);
                if (exitallpagesICustomTabsCallbackStub2 == null) {
                    int i8 = onNavigationEvent + 93;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    exitallpagesICustomTabsCallbackStub2 = null;
                }
                List listOnExtraCallbackWithResult2 = exitallpagesICustomTabsCallbackStub2.onExtraCallbackWithResult();
                String str3 = this.$serviceType;
                Iterator it = listOnExtraCallbackWithResult2.iterator();
                int i9 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i9 = -1;
                        break;
                    }
                    RotationVectorAbility1 rotationVectorAbility1 = (SensorBridgeExtension3) it.next();
                    if (!(rotationVectorAbility1 instanceof RotationVectorAbility1)) {
                        if (rotationVectorAbility1 instanceof RotationVectorAbility) {
                            int i10 = IAuthTabCallback + 65;
                            onNavigationEvent = i10 % 128;
                            if (i10 % 2 != 0) {
                                listOnExtraCallbackWithResult = ((RotationVectorAbility) rotationVectorAbility1).onExtraCallbackWithResult();
                                int i11 = 47 / 0;
                                if (listOnExtraCallbackWithResult instanceof Collection) {
                                    if (listOnExtraCallbackWithResult.isEmpty()) {
                                        zAreEqual = false;
                                    } else {
                                        Iterator it2 = listOnExtraCallbackWithResult.iterator();
                                        while (it2.hasNext()) {
                                            if (Intrinsics.areEqual(((RotationVectorAbility1.onExtraCallback) it2.next()).onExtraCallbackWithResult().IAuthTabCallbackDefault(), str3)) {
                                                int i12 = onNavigationEvent + 97;
                                                IAuthTabCallback = i12 % 128;
                                                int i13 = i12 % 2;
                                                zAreEqual = true;
                                                break;
                                            }
                                        }
                                        zAreEqual = false;
                                    }
                                }
                            } else {
                                listOnExtraCallbackWithResult = ((RotationVectorAbility) rotationVectorAbility1).onExtraCallbackWithResult();
                                if (listOnExtraCallbackWithResult instanceof Collection) {
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    zAreEqual = Intrinsics.areEqual(rotationVectorAbility1.onExtraCallbackWithResult().IAuthTabCallbackDefault(), str3);
                    if (zAreEqual) {
                        break;
                    }
                    i9++;
                }
                if (i9 >= 0) {
                    this.I$0 = i9;
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(300L, this) != objOnWarmupCompleted) {
                        i = i9;
                    }
                    return objOnWarmupCompleted;
                }
                return Unit.INSTANCE;
            }
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i14 = IAuthTabCallback + 95;
                onNavigationEvent = i14 % 128;
                if (i14 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                i2 = this.I$0;
                ResultKt.onNavigationEvent(obj);
                exitallpagesICustomTabsCallbackStub = KoreaBenefitTabFragment.ICustomTabsCallbackStub(KoreaBenefitTabFragment.this);
                if (exitallpagesICustomTabsCallbackStub == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    exitallpagesICustomTabsCallbackStub = null;
                }
                onextracallback = (SensorBridgeExtension3) exitallpagesICustomTabsCallbackStub.onExtraCallbackWithResult().get(i2);
                if (!(onextracallback instanceof RotationVectorAbility1.onExtraCallback)) {
                    RotationVectorAbility1.onExtraCallback onextracallback2 = onextracallback;
                    onextracallbackOnExtraCallbackWithResult = RotationVectorAbility1.onExtraCallback.onExtraCallback(onextracallback2, (Cards.Card) null, 0, (registerDefault.onNavigationEvent) null, false, false, (String) null, (String) null, onextracallback2.onNavigationEvent() + 1, 0, 383, (Object) null);
                } else if (onextracallback instanceof RotationVectorAbility1.IAuthTabCallback) {
                    RotationVectorAbility1.IAuthTabCallback iAuthTabCallback = (RotationVectorAbility1.IAuthTabCallback) onextracallback;
                    onextracallbackOnExtraCallbackWithResult = RotationVectorAbility1.IAuthTabCallback.onExtraCallbackWithResult(iAuthTabCallback, (Cards.Card) null, 0, (registerDefault.onNavigationEvent) null, false, false, (String) null, iAuthTabCallback.onNavigationEvent() + 1, (String) null, (String) null, 447, (Object) null);
                } else if (onextracallback instanceof RotationVectorAbility) {
                    RotationVectorAbility rotationVectorAbility = (RotationVectorAbility) onextracallback;
                    List<RotationVectorAbility1.onExtraCallback> listOnExtraCallbackWithResult3 = rotationVectorAbility.onExtraCallbackWithResult();
                    String str4 = this.$serviceType;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnExtraCallbackWithResult3, 10));
                    for (RotationVectorAbility1.onExtraCallback onExtraCallback : listOnExtraCallbackWithResult3) {
                        if (Intrinsics.areEqual(onExtraCallback.onExtraCallbackWithResult().IAuthTabCallbackDefault(), str4)) {
                            int i15 = onNavigationEvent + 113;
                            IAuthTabCallback = i15 % 128;
                            if (i15 % 2 == 0) {
                                card = null;
                                i3 = 0;
                                onnavigationevent = null;
                                z = true;
                                z2 = true;
                                str = null;
                                str2 = null;
                                iOnNavigationEvent = onExtraCallback.onNavigationEvent();
                                i4 = 0;
                                i5 = 16803;
                            } else {
                                card = null;
                                i3 = 0;
                                onnavigationevent = null;
                                z = false;
                                z2 = false;
                                str = null;
                                str2 = null;
                                iOnNavigationEvent = onExtraCallback.onNavigationEvent() + 1;
                                i4 = 0;
                                i5 = 383;
                            }
                            onExtraCallback = RotationVectorAbility1.onExtraCallback.onExtraCallback(onExtraCallback, card, i3, onnavigationevent, z, z2, str, str2, iOnNavigationEvent, i4, i5, (Object) null);
                        }
                        arrayList.add(onExtraCallback);
                    }
                    onextracallbackOnExtraCallbackWithResult = (RotationVectorAbility) RotationVectorAbility.onNavigationEvent(811864654, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -811864653, new Object[]{rotationVectorAbility, null, null, arrayList, false, null, 27, null}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted());
                } else {
                    onextracallbackOnExtraCallbackWithResult = onextracallback;
                }
                if (onextracallbackOnExtraCallbackWithResult != onextracallback) {
                    int i16 = onNavigationEvent + 79;
                    IAuthTabCallback = i16 % 128;
                    if (i16 % 2 == 0) {
                        KoreaBenefitTabFragment.ICustomTabsCallbackStub(KoreaBenefitTabFragment.this);
                        exitallpages.hashCode();
                        throw null;
                    }
                    exitAllPages exitallpagesICustomTabsCallbackStub3 = KoreaBenefitTabFragment.ICustomTabsCallbackStub(KoreaBenefitTabFragment.this);
                    if (exitallpagesICustomTabsCallbackStub3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        exitallpagesICustomTabsCallbackStub3 = null;
                    }
                    List mutableList = CollectionsKt.toMutableList(exitallpagesICustomTabsCallbackStub3.onExtraCallbackWithResult());
                    mutableList.set(i2, onextracallbackOnExtraCallbackWithResult);
                    exitAllPages exitallpagesICustomTabsCallbackStub4 = KoreaBenefitTabFragment.ICustomTabsCallbackStub(KoreaBenefitTabFragment.this);
                    if (exitallpagesICustomTabsCallbackStub4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        exitallpages = exitallpagesICustomTabsCallbackStub4;
                    }
                    exitallpages.onExtraCallbackWithResult(mutableList, true);
                }
                return Unit.INSTANCE;
            }
            i = this.I$0;
            ResultKt.onNavigationEvent(obj);
            AddPhoneContactView addPhoneContactViewOnMessageChannelReady = KoreaBenefitTabFragment.onMessageChannelReady(KoreaBenefitTabFragment.this);
            int height = ((addPhoneContactViewOnMessageChannelReady == null || (frameLayoutIAuthTabCallback = addPhoneContactViewOnMessageChannelReady.IAuthTabCallback()) == null) ? 0 : frameLayoutIAuthTabCallback.getHeight()) / 3;
            AddPhoneContactView addPhoneContactViewOnMessageChannelReady2 = KoreaBenefitTabFragment.onMessageChannelReady(KoreaBenefitTabFragment.this);
            if (addPhoneContactViewOnMessageChannelReady2 == null || (tdsRecyclerView2 = addPhoneContactViewOnMessageChannelReady2.onActivityLayout) == null) {
                layoutManager = null;
            } else {
                int i17 = onNavigationEvent + 59;
                IAuthTabCallback = i17 % 128;
                int i18 = i17 % 2;
                layoutManager = tdsRecyclerView2.getLayoutManager();
            }
            if (layoutManager instanceof BenefitTabLinearLayoutManager) {
                int i19 = onNavigationEvent + 65;
                IAuthTabCallback = i19 % 128;
                int i20 = i19 % 2;
                benefitTabLinearLayoutManager = (BenefitTabLinearLayoutManager) layoutManager;
            } else {
                benefitTabLinearLayoutManager = null;
            }
            if (benefitTabLinearLayoutManager != null) {
                BenefitTabLinearLayoutManager.onExtraCallbackWithResult(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), new Object[]{benefitTabLinearLayoutManager, Integer.valueOf(height)}, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -840914409, 840914409, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult());
                int i21 = IAuthTabCallback + 83;
                onNavigationEvent = i21 % 128;
                int i22 = i21 % 2;
            }
            AddPhoneContactView addPhoneContactViewOnMessageChannelReady3 = KoreaBenefitTabFragment.onMessageChannelReady(KoreaBenefitTabFragment.this);
            if (addPhoneContactViewOnMessageChannelReady3 != null && (tdsRecyclerView = addPhoneContactViewOnMessageChannelReady3.onActivityLayout) != null) {
                tdsRecyclerView.smoothScrollToPosition(i);
            }
            this.I$0 = i;
            this.I$1 = height;
            this.label = 2;
            if (formatMsgs.onWarmupCompleted(100L, this) != objOnWarmupCompleted) {
                i2 = i;
                exitallpagesICustomTabsCallbackStub = KoreaBenefitTabFragment.ICustomTabsCallbackStub(KoreaBenefitTabFragment.this);
                if (exitallpagesICustomTabsCallbackStub == null) {
                }
                onextracallback = (SensorBridgeExtension3) exitallpagesICustomTabsCallbackStub.onExtraCallbackWithResult().get(i2);
                if (!(onextracallback instanceof RotationVectorAbility1.onExtraCallback)) {
                }
                if (onextracallbackOnExtraCallbackWithResult != onextracallback) {
                }
                return Unit.INSTANCE;
            }
            return objOnWarmupCompleted;
        }
    }

    private final void onNavigationEvent(String str) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new ICustomTabsCallbackStubProxy(str, null), 3, (Object) null);
        int i2 = isEngagementSignalsApiAvailable + 67;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 24 / 0;
        }
    }

    static final class ICustomTabsCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ String $subMissionCode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ICustomTabsCallbackStubProxy(String str, access13800<? super ICustomTabsCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
            this.$subMissionCode = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsCallbackStubProxy iCustomTabsCallbackStubProxy = KoreaBenefitTabFragment.this.new ICustomTabsCallbackStubProxy(this.$subMissionCode, access13800Var);
            int i2 = onExtraCallbackWithResult + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iCustomTabsCallbackStubProxy;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = onExtraCallbackWithResult + 53;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 81 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 107;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            long j;
            Object objOnExtraCallback;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                getDummyAd getdummyadAsBinder = KoreaBenefitTabFragment.this.asBinder();
                Context contextRequireContext = KoreaBenefitTabFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                String str = this.$subMissionCode;
                if (Intrinsics.areEqual(str, "STICKINESS_TABVISIT_TOMORROW")) {
                    j = 6057;
                } else if (Intrinsics.areEqual(str, "FREQUENCY_TABVISIT_2_30")) {
                    int i3 = onExtraCallbackWithResult + 89;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    j = 6056;
                } else {
                    j = -1;
                }
                long j2 = j;
                this.label = 1;
                objOnExtraCallback = getDummyAd.onExtraCallback(getdummyadAsBinder, contextRequireContext, "STD_10188_BENEFIT_MISSION_NO_REWARD", (String) null, (String) null, j2, (Map) null, (setHasShown) null, false, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, this, 8388588, (Object) null);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onExtraCallback + 97;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = obj;
            }
            KoreaBenefitTabFragment.isEngagementSignalsApiAvailable(KoreaBenefitTabFragment.this).onNavigationEvent((Intent) objOnExtraCallback);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) throws Throwable {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback2, -1312926083, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{function1, obj}, 1312926103, iIAuthTabCallback);
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(iIAuthTabCallback2, 880605162, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment}, -880605146, iIAuthTabCallback);
    }

    public static /* synthetic */ void asInterface(KoreaBenefitTabFragment koreaBenefitTabFragment) throws Throwable {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback2, 67045568, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment}, -67045555, iIAuthTabCallback);
    }

    public static /* synthetic */ boolean IAuthTabCallback(RVWebSocketManagerHolder rVWebSocketManagerHolder) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return ((Boolean) onExtraCallback(iIAuthTabCallback2, -954049559, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{rVWebSocketManagerHolder}, 954049578, iIAuthTabCallback)).booleanValue();
    }

    public static /* synthetic */ Map access100(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Map) onExtraCallback(iIAuthTabCallback2, -550531005, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment}, 550531011, iIAuthTabCallback);
    }

    public static /* synthetic */ Unit IAuthTabCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, boolean z, Integer num) {
        Object[] objArr = {koreaBenefitTabFragment, Boolean.valueOf(z), num};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 490542950, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, -490542939, iIAuthTabCallback);
    }

    public static /* synthetic */ Unit access000(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(iIAuthTabCallback2, -434770787, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment}, 434770818, iIAuthTabCallback);
    }

    public static /* synthetic */ Unit onExtraCallback(long j, KoreaBenefitTabFragment koreaBenefitTabFragment, SetDetectableSize setDetectableSize) {
        Object[] objArr = {Long.valueOf(j), koreaBenefitTabFragment, setDetectableSize};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -125499217, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, 125499219, iIAuthTabCallback);
    }

    public static /* synthetic */ BasicSystemInfoExtension2 IAuthTabCallback_Parcel(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (BasicSystemInfoExtension2) onExtraCallback(iIAuthTabCallback2, 922465023, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment}, -922465001, iIAuthTabCallback);
    }

    public static /* synthetic */ getScreenBrightnessInner ICustomTabsCallback(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (getScreenBrightnessInner) onExtraCallback(iIAuthTabCallback2, 730007441, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment}, -730007412, iIAuthTabCallback);
    }

    public static /* synthetic */ Unit onWarmupCompleted(KoreaBenefitTabFragment koreaBenefitTabFragment, View view) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(iIAuthTabCallback2, -1038284956, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment, view}, 1038284990, iIAuthTabCallback);
    }

    public static /* synthetic */ boolean onExtraCallback(Function1 function1, Object obj) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return ((Boolean) onExtraCallback(iIAuthTabCallback2, 1670182794, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{function1, obj}, -1670182767, iIAuthTabCallback)).booleanValue();
    }

    public static /* synthetic */ boolean extraCallbackWithResult(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return ((Boolean) onExtraCallback(iIAuthTabCallback2, 181791818, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment}, -181791794, iIAuthTabCallback)).booleanValue();
    }

    public static final /* synthetic */ setResultAccount onMinimized(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (setResultAccount) onExtraCallback(iIAuthTabCallback2, 1621414546, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment}, -1621414541, iIAuthTabCallback);
    }

    public static final /* synthetic */ boolean onPostMessage(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return ((Boolean) onExtraCallback(iIAuthTabCallback2, 548731946, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment}, -548731936, iIAuthTabCallback)).booleanValue();
    }

    public static final /* synthetic */ String ICustomTabsCallbackDefault(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (String) onExtraCallback(iIAuthTabCallback2, 905180817, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment}, -905180784, iIAuthTabCallback);
    }

    public static final /* synthetic */ KoreaBenefitTabViewModel mayLaunchUrl(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (KoreaBenefitTabViewModel) onExtraCallback(iIAuthTabCallback2, 493663387, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment}, -493663383, iIAuthTabCallback);
    }

    public static final /* synthetic */ void IAuthTabCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, AdsInfo adsInfo) throws Throwable {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback2, -1906131761, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment, adsInfo}, 1906131764, iIAuthTabCallback);
    }

    public static final /* synthetic */ void newSessionWithExtras(KoreaBenefitTabFragment koreaBenefitTabFragment) throws Throwable {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback2, 57756851, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment}, -57756825, iIAuthTabCallback);
    }

    public static final /* synthetic */ void newSession(KoreaBenefitTabFragment koreaBenefitTabFragment) throws Throwable {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback2, -793573870, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment}, 793573900, iIAuthTabCallback);
    }

    private static final Map requestPostMessageChannel(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Map) onExtraCallback(iIAuthTabCallback2, -1614165593, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment}, 1614165621, iIAuthTabCallback);
    }

    private final int getInterfaceDescriptor() {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return ((Integer) onExtraCallback(iIAuthTabCallback2, -627628129, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{this}, 627628137, iIAuthTabCallback)).intValue();
    }

    private final String extraCallback() {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (String) onExtraCallback(iIAuthTabCallback2, -2031980241, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{this}, 2031980241, iIAuthTabCallback);
    }

    private final void onMinimized() throws Throwable {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback2, 979241426, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{this}, -979241408, iIAuthTabCallback);
    }

    private static final boolean onNavigationEvent(Function1 function1, Object obj) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return ((Boolean) onExtraCallback(iIAuthTabCallback2, 1396649354, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{function1, obj}, -1396649340, iIAuthTabCallback)).booleanValue();
    }

    private static final Unit IAuthTabCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, RVWebSocketManagerHolder rVWebSocketManagerHolder) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(iIAuthTabCallback2, 340804957, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment, rVWebSocketManagerHolder}, -340804922, iIAuthTabCallback);
    }

    private static final void onTransact(Function1 function1, Object obj) throws Throwable {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback2, -1110576657, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{function1, obj}, 1110576689, iIAuthTabCallback);
    }

    private final Unit onUnminimized() {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(iIAuthTabCallback2, 1563368148, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{this}, -1563368139, iIAuthTabCallback);
    }

    private static final void onWarmupCompleted(KoreaBenefitTabFragment koreaBenefitTabFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback2, -1409575120, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment, iEngagementSignalsCallbackDefault}, 1409575127, iIAuthTabCallback);
    }

    private static final Unit IAuthTabCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, RotationVectorAbility1 rotationVectorAbility1) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(iIAuthTabCallback2, -627596443, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment, rotationVectorAbility1}, 627596468, iIAuthTabCallback);
    }

    private final void onExtraCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, startDeviceShakeListener startdeviceshakelistener) throws Throwable {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback2, 1710221732, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{this, benefitPremiumAdCollapsedView, startdeviceshakelistener}, -1710221717, iIAuthTabCallback);
    }

    private static final Unit onExtraCallbackWithResult(long j, KoreaBenefitTabFragment koreaBenefitTabFragment, SetDetectableSize setDetectableSize) {
        Object[] objArr = {Long.valueOf(j), koreaBenefitTabFragment, setDetectableSize};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -761046741, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, 761046764, iIAuthTabCallback);
    }

    private static final Bundle ICustomTabsServiceStub(KoreaBenefitTabFragment koreaBenefitTabFragment) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Bundle) onExtraCallback(iIAuthTabCallback2, -620982180, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{koreaBenefitTabFragment}, 620982197, iIAuthTabCallback);
    }

    private final void onExtraCallback(List<? extends SensorBridgeExtension3> list, boolean z) throws Throwable {
        Object[] objArr = {this, list, Boolean.valueOf(z)};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1509774173, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, 1509774209, iIAuthTabCallback);
    }

    private final void newSession() throws Throwable {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback2, -725578424, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{this}, 725578436, iIAuthTabCallback);
    }

    private final void onWarmupCompleted(KoreaBenefitTabViewModel.IAuthTabCallback iAuthTabCallback) throws Throwable {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback2, 450848413, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{this, iAuthTabCallback}, -450848392, iIAuthTabCallback);
    }

    private static final Unit onExtraCallback(KoreaBenefitTabViewModel.IAuthTabCallback iAuthTabCallback, KoreaBenefitTabFragment koreaBenefitTabFragment, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(iIAuthTabCallback2, -1086365549, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{iAuthTabCallback, koreaBenefitTabFragment, setDetectableSize}, 1086365550, iIAuthTabCallback);
    }

    static void IAuthTabCallbackStub() {
        extraCommand = -4149999086327721517L;
    }
}
