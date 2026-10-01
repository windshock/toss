package im.toss.features.benefit.ui;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
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
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.internal.ads.zzgc;
import com.google.common.collect.Synchronized;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeLogger;
import com.otaliastudios.cameraview.R$styleable;
import com.tmoney.a;
import gatewayprotocol.v1.AdResponseKtKt;
import im.toss.core.workerservice.WorkerService$Companion$;
import im.toss.features.benefit.R;
import im.toss.features.benefit.dto.AdMobFallback;
import im.toss.features.benefit.dto.Cards;
import im.toss.features.benefit.dto.CardsV2;
import im.toss.features.benefit.log.BenefitTabImpressionHandler;
import im.toss.features.benefit.ui.GlobalBenefitTabFragment$;
import im.toss.features.benefit.ui.GlobalBenefitTabViewModel;
import im.toss.features.benefit.ui.component.BenefitTabLinearLayoutManager;
import im.toss.features.benefit.ui.component.ThumbnailAdMobController;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsRecyclerView;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.widget.TdsResultV0View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import im.toss.utils.RxUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
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
import o.AddPhoneContactView;
import o.Address;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppLovinNativeAdImplc;
import o.AppLovinPostbackService;
import o.AppLovinSdkSettings;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.AppSetIdAndScope1;
import o.AttributeExtension;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BasicSystemInfoExtension;
import o.BrickModulesListExternalSyntheticLambda0;
import o.ByteOrderedDataOutputStream;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraControllerExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraProviderInitRetryPolicy1;
import o.ChoosePhoneContactBridgeExtension1;
import o.ContactAccount;
import o.ConvertFloatArrayToByteArray;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.DERString;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.ExoPlayerImplExternalSyntheticLambda31;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.ForwardingCameraControl;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.ImageCapturePixelHDRPlusQuirk;
import o.JsonReaderUnknownNumberParsing;
import o.MaxAdViewAdapterListener;
import o.MaxAppOpenAdapterListener;
import o.MaxRewardedInterstitialAdapter;
import o.PageRenderReadyListener;
import o.ParamUtils;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RVWebSocketManagerHolder;
import o.RotationVectorAbility;
import o.RotationVectorAbility1;
import o.RotationVectorAbility1$onWarmupCompleted;
import o.RotationVectorAbility2;
import o.SensorBridgeExtension2;
import o.SensorBridgeExtension3;
import o.SensorBridgeExtension4;
import o.SensorBridgeExtension5;
import o.SensorServiceManager;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.ShakeMonitorBridgeExtension;
import o.ShakeMonitorBridgeExtension$onExtraCallback;
import o.ShakeMonitorBridgeExtension1;
import o.TextFieldKeyInputExternalSyntheticLambda6;
import o.TextFieldKeyInputExternalSyntheticLambda7;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextLinkScopeExternalSyntheticLambda0;
import o.TinyAppHostApduService1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.WebSocketResultEnum;
import o.WorkflowUnit;
import o.ZslRingBuffer;
import o.access13800;
import o.access14300;
import o.access5300;
import o.access8100;
import o.accessgetProtocolp;
import o.addAllCommandLine;
import o.attachAppLovinSdk;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.clearWrite;
import o.component5;
import o.configureReward;
import o.deprecated_certificatePinner;
import o.deserializeUriNullableCollection;
import o.ea10;
import o.exitAllPages;
import o.filterCreatePageParams;
import o.findResAndMsg;
import o.forceInnerPermissionCheck;
import o.getAdService;
import o.getAppBaseInfo;
import o.getAwbState;
import o.getBacktraceNote;
import o.getCachingExecutorService;
import o.getConfiguration;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getExtraParameters;
import o.getIconPaddingLeft;
import o.getMaximumScreenBrightnessSetting;
import o.getNameByImsi;
import o.getPhoneNumber;
import o.getPreRenderJob;
import o.getPricingPhaseList;
import o.getSimOperator;
import o.getSpecialFeatureOptInStatus;
import o.getSupportedHighSpeedResolutionsFor;
import o.getTypedExportedConstants;
import o.getUrlokhttp;
import o.getWrite;
import o.handleNoThread;
import o.handleThread;
import o.immediateFailedFuture;
import o.initMiniApp;
import o.isFireOS;
import o.isHighSpeedSupported;
import o.isMuted;
import o.isOneShot;
import o.isRepeatingEnabled;
import o.logAndOpenStore;
import o.maybeUpdateAnimatable;
import o.noStore;
import o.onRenderReady;
import o.preFillDefault;
import o.putChannelInfo;
import o.pxToDp;
import o.readIntokhttp;
import o.registerInternal;
import o.registerShakeListener;
import o.removeCameraStateObserver;
import o.removeTaskIdOnSocketError;
import o.resolveQuirkNames;
import o.response;
import o.runOnUiThreadDelayed;
import o.setAdVideoPlaybackListener;
import o.setAutoCaptured;
import o.setProxySelectorokhttp;
import o.setRandomHost;
import o.setRubIn;
import o.setTaggedAddrCtrl;
import o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled;
import o.startDeviceMotionListening;
import o.stopDeviceShakeListener;
import o.toPreviewOnlyRange;
import o.unregisterInternal;
import o.varyMatches;
import o.y3ExternalSyntheticLambda0;
import o.ycxycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.StatusManager;

@DERString
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class GlobalBenefitTabFragment extends Hilt_GlobalBenefitTabFragment implements StatusManager.onExtraCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static char[] extraCallbackWithResult = null;
    private static int onActivityLayout = 1;
    private static char onActivityResized = 0;
    public static final String onExtraCallback;
    private static int onMessageChannelReady = 0;
    private static int onMinimized = 1;
    static final /* synthetic */ addAllCommandLine<Object>[] onNavigationEvent;
    private static int onPostMessage;
    public static final int onWarmupCompleted;
    private WorkflowUnit IAuthTabCallback;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallbackDefault;
    private final AtomicBoolean IAuthTabCallbackStub;
    private getSimOperator IAuthTabCallbackStubProxy;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallback_Parcel;
    private int ICustomTabsCallback;
    private String access000;
    private final getSupportedHighSpeedResolutionsFor access100;
    private BenefitTabImpressionHandler asBinder;
    private boolean asInterface;
    private final Lazy extraCallback;
    private final AppSetIdAndScope1 getInterfaceDescriptor;
    private final PageRenderReadyListener onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor onTransact;
    private final isHighSpeedSupported readTypedObject;

    @Inject
    public SessionTrackerb router;

    @Inject
    public getPricingPhaseList tossRegion;
    private TextFieldScrollKtExternalSyntheticLambda0 writeTypedObject;

    static final /* synthetic */ class IAuthTabCallback_Parcel implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final /* synthetic */ Function1 IAuthTabCallback;

        IAuthTabCallback_Parcel(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                int i2 = onExtraCallbackWithResult + 11;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                if (!(!(obj instanceof FunctionAdapter))) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            int i4 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 17;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Function1 function1 = this.IAuthTabCallback;
            int i4 = i2 + 13;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 86 / 0;
            }
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.invoke(obj);
            int i4 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 77 / 0;
            }
        }
    }

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new char[]{'\n', 24, 27, 4, 19, 31, 13855, 13855, 16, 25, '\n', 29, 21, 23, 4, 25, 25, '\f', 19, 7, 22, 14, 2, 26, 18, 28, 25, 14, '!', 2, 28, ' ', '!', '\"', 30, '!', 21, 23, 25, 27, 15, 2, 26, 18, 27, 29, 16, 20, 18, ' ', 20, 4, 19, 3, 2, 27, 13927}, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 107), 56 - Process.getGidForName(""), objArr);
        onExtraCallback = ((String) objArr[0]).intern();
        onNavigationEvent = new addAllCommandLine[]{new PropertyReference1Impl<>(GlobalBenefitTabFragment.class, "binding", "getBinding()Lim/toss/features/benefit/databinding/BenefitPillarFragmentBinding;", 0)};
        Companion = new IAuthTabCallback((DefaultConstructorMarker) null);
        onWarmupCompleted = 8;
        int i = onPostMessage + 57;
        onActivityLayout = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ int IAuthTabCallback(GlobalBenefitTabFragment globalBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 57;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        int iExtraCallbackWithResult = extraCallbackWithResult(globalBenefitTabFragment);
        int i4 = onMessageChannelReady + 111;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return iExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Map IAuthTabCallback(CardsV2.BenefitMissionInfo benefitMissionInfo) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 91;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(benefitMissionInfo);
        }
        onNavigationEvent(benefitMissionInfo);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(GlobalBenefitTabFragment globalBenefitTabFragment, View view) {
        int i = 2 % 2;
        int i2 = onMinimized + 83;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(globalBenefitTabFragment, view);
        int i4 = onMinimized + 19;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(GlobalBenefitTabFragment globalBenefitTabFragment, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 9;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(globalBenefitTabFragment, str);
        }
        onExtraCallbackWithResult(globalBenefitTabFragment, str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(GlobalBenefitTabFragment globalBenefitTabFragment, BasicSystemInfoExtension basicSystemInfoExtension) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 95;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            return (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{globalBenefitTabFragment, basicSystemInfoExtension}, 364375535, iOnNavigationEvent2, -364375525);
        }
        int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent4 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent3, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{globalBenefitTabFragment, basicSystemInfoExtension}, 364375535, iOnNavigationEvent4, -364375525);
        int i3 = 31 / 0;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(GlobalBenefitTabFragment globalBenefitTabFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onMessageChannelReady + 57;
        onMinimized = i3 % 128;
        if (i3 % 2 != 0) {
            return onWarmupCompleted(globalBenefitTabFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(globalBenefitTabFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(GlobalBenefitTabFragment globalBenefitTabFragment, SensorBridgeExtension4 sensorBridgeExtension4) {
        int i = 2 % 2;
        int i2 = onMinimized + 19;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(globalBenefitTabFragment, sensorBridgeExtension4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(globalBenefitTabFragment, sensorBridgeExtension4);
        int i3 = onMessageChannelReady + 49;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(GlobalBenefitTabFragment globalBenefitTabFragment, SensorServiceManager sensorServiceManager) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 111;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(globalBenefitTabFragment, sensorServiceManager);
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        int i5 = onMessageChannelReady + 53;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(RotationVectorAbility1 rotationVectorAbility1, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 103;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(rotationVectorAbility1, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(rotationVectorAbility1, setDetectableSize);
        int i3 = onMinimized + 89;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onMinimized + 85;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(attachapplovinsdk);
        int i4 = onMessageChannelReady + 71;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(stopDeviceShakeListener stopdeviceshakelistener, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMinimized + 43;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(stopdeviceshakelistener, setDetectableSize);
        int i4 = onMessageChannelReady + 33;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ boolean IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMinimized + 15;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(function1, obj);
        int i4 = onMinimized + 125;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 79;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface(attachapplovinsdk);
        }
        asInterface(attachapplovinsdk);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) {
        GlobalBenefitTabFragment globalBenefitTabFragment = (GlobalBenefitTabFragment) objArr[0];
        GlobalBenefitTabViewModel.onWarmupCompleted onwarmupcompleted = (GlobalBenefitTabViewModel.onWarmupCompleted) objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 53;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(globalBenefitTabFragment, onwarmupcompleted);
        int i4 = onMinimized + 119;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        GlobalBenefitTabFragment globalBenefitTabFragment = (GlobalBenefitTabFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 121;
        onMessageChannelReady = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onNavigationEvent(globalBenefitTabFragment, setDetectableSize);
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(globalBenefitTabFragment, setDetectableSize);
        int i3 = onMinimized + 119;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        GlobalBenefitTabFragment globalBenefitTabFragment = (GlobalBenefitTabFragment) objArr[0];
        MaxAppOpenAdapterListener maxAppOpenAdapterListener = (MaxAppOpenAdapterListener) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 3;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(globalBenefitTabFragment, maxAppOpenAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 == 0) {
            int i4 = 80 / 0;
        }
        int i5 = onMessageChannelReady + 51;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) throws Throwable {
        GlobalBenefitTabFragment globalBenefitTabFragment = (GlobalBenefitTabFragment) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onMinimized + 13;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(globalBenefitTabFragment, function0, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i4 = onMessageChannelReady + 119;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        GlobalBenefitTabFragment globalBenefitTabFragment = (GlobalBenefitTabFragment) objArr[0];
        View view = (View) objArr[1];
        WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) objArr[2];
        int i = 2 % 2;
        int i2 = onMinimized + 31;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        WindowInsetsCompat windowInsetsCompatOnWarmupCompleted = onWarmupCompleted(globalBenefitTabFragment, view, windowInsetsCompat);
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        return windowInsetsCompatOnWarmupCompleted;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        getTypedExportedConstants gettypedexportedconstants = (getTypedExportedConstants) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 49;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(gettypedexportedconstants, view);
        int i4 = onMinimized + 81;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ int onExtraCallback(GlobalBenefitTabFragment globalBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = onMinimized + 109;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        int iWriteTypedObject = writeTypedObject(globalBenefitTabFragment);
        int i4 = onMessageChannelReady + 107;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return iWriteTypedObject;
    }

    public static /* synthetic */ Unit onExtraCallback(ViewGroup viewGroup, View view) {
        int i = 2 % 2;
        int i2 = onMinimized + 9;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(viewGroup, view);
        int i4 = onMinimized + 65;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(GlobalBenefitTabFragment globalBenefitTabFragment, NativeAd nativeAd) {
        int i = 2 % 2;
        int i2 = onMinimized + 15;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(globalBenefitTabFragment, nativeAd);
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
        int i5 = onMinimized + 3;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(GlobalBenefitTabFragment globalBenefitTabFragment, String str) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 117;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{globalBenefitTabFragment, str}, -346085961, iOnNavigationEvent2, 346085984);
        int i4 = onMessageChannelReady + 57;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(GlobalBenefitTabFragment globalBenefitTabFragment, RVWebSocketManagerHolder rVWebSocketManagerHolder) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 21;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(globalBenefitTabFragment, rVWebSocketManagerHolder);
        int i4 = onMinimized + 117;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(GlobalBenefitTabFragment globalBenefitTabFragment, SensorServiceManager sensorServiceManager) throws Throwable {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 1;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(globalBenefitTabFragment, sensorServiceManager);
        int i4 = onMessageChannelReady + 97;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(GlobalBenefitTabFragment globalBenefitTabFragment, ShakeMonitorBridgeExtension shakeMonitorBridgeExtension, CardsV2.PointBackInfo.BankCardCashBackBanner bankCardCashBackBanner) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 53;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(globalBenefitTabFragment, shakeMonitorBridgeExtension, bankCardCashBackBanner);
        int i4 = onMessageChannelReady + 111;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(RotationVectorAbility1 rotationVectorAbility1, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 13;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(rotationVectorAbility1, setDetectableSize);
        int i4 = onMessageChannelReady + 41;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(SensorBridgeExtension4 sensorBridgeExtension4, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMinimized + 19;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(sensorBridgeExtension4, setDetectableSize);
        int i4 = onMinimized + 107;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onMinimized + 53;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{attachapplovinsdk}, -1733513622, iOnNavigationEvent2, 1733513640);
        int i4 = onMessageChannelReady + 39;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 65;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallback(RVWebSocketManagerHolder rVWebSocketManagerHolder) {
        int i = 2 % 2;
        int i2 = onMinimized + 59;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            return ((Boolean) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{rVWebSocketManagerHolder}, 85822237, iOnNavigationEvent2, -85822223)).booleanValue();
        }
        int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent4 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        ((Boolean) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent3, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{rVWebSocketManagerHolder}, 85822237, iOnNavigationEvent4, -85822223)).booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AdMobFallback adMobFallback, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 111;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(adMobFallback, setDetectableSize);
        int i4 = onMinimized + 11;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(GlobalBenefitTabFragment globalBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 101;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return access100(globalBenefitTabFragment);
        }
        access100(globalBenefitTabFragment);
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(GlobalBenefitTabFragment globalBenefitTabFragment, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onMessageChannelReady + 77;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            i |= 1;
        }
        globalBenefitTabFragment.IAuthTabCallback((Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        Unit unit = Unit.INSTANCE;
        int i5 = onMessageChannelReady + 15;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(GlobalBenefitTabFragment globalBenefitTabFragment, stopDeviceShakeListener stopdeviceshakelistener) throws Throwable {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 17;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(globalBenefitTabFragment, stopdeviceshakelistener);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(globalBenefitTabFragment, stopdeviceshakelistener);
        int i3 = onMessageChannelReady + 9;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SensorServiceManager sensorServiceManager, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 81;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(sensorServiceManager, setDetectableSize);
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        int i5 = onMessageChannelReady + 11;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 19;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(setDetectableSize);
        int i4 = onMinimized + 121;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(GlobalBenefitTabFragment globalBenefitTabFragment, ShakeMonitorBridgeExtension$onExtraCallback shakeMonitorBridgeExtension$onExtraCallback) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 29;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(globalBenefitTabFragment, shakeMonitorBridgeExtension$onExtraCallback);
        }
        IAuthTabCallback(globalBenefitTabFragment, shakeMonitorBridgeExtension$onExtraCallback);
        throw null;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        float fFloatValue = ((Number) objArr[0]).floatValue();
        float fFloatValue2 = ((Number) objArr[1]).floatValue();
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[2];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 47;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(fFloatValue, fFloatValue2, appLovinSdkSettings);
        }
        IAuthTabCallback(fFloatValue, fFloatValue2, appLovinSdkSettings);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Activity onNavigationEvent(GlobalBenefitTabFragment globalBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = onMinimized + 1;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Activity activityAccess000 = access000(globalBenefitTabFragment);
        int i4 = onMessageChannelReady + 35;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return activityAccess000;
    }

    public static /* synthetic */ Unit onNavigationEvent(GlobalBenefitTabFragment globalBenefitTabFragment, AdMobFallback adMobFallback) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 23;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(globalBenefitTabFragment, adMobFallback);
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(GlobalBenefitTabFragment globalBenefitTabFragment, RotationVectorAbility1.onExtraCallback onextracallback, String str) {
        int i = 2 % 2;
        int i2 = onMinimized + 5;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(globalBenefitTabFragment, onextracallback, str);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(globalBenefitTabFragment, onextracallback, str);
        int i3 = onMessageChannelReady + 53;
        onMinimized = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 38 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(GlobalBenefitTabFragment globalBenefitTabFragment, RotationVectorAbility1 rotationVectorAbility1) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onMinimized + 123;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            unit = (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{globalBenefitTabFragment, rotationVectorAbility1}, -1689824835, iOnNavigationEvent2, 1689824856);
            int i3 = 59 / 0;
        } else {
            int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            int iOnNavigationEvent4 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            unit = (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent3, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{globalBenefitTabFragment, rotationVectorAbility1}, -1689824835, iOnNavigationEvent4, 1689824856);
        }
        int i4 = onMessageChannelReady + 57;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        int i2 = onMinimized + 87;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(appLovinSdkSettings);
        int i4 = onMessageChannelReady + 21;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(RotationVectorAbility1.onExtraCallback onextracallback, String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 25;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{onextracallback, str, setDetectableSize}, 1244888050, iOnNavigationEvent2, -1244888035);
        int i4 = onMessageChannelReady + 61;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onMinimized + 73;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(attachapplovinsdk);
        int i4 = onMessageChannelReady + 11;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        CardsV2.CustomParameter customParameter = (CardsV2.CustomParameter) objArr[0];
        SensorServiceManager sensorServiceManager = (SensorServiceManager) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 61;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(customParameter, sensorServiceManager, setDetectableSize);
        int i4 = onMessageChannelReady + 57;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7;
        int i8 = ~i6;
        int i9 = ~(i8 | i4);
        int i10 = ~(i4 | i6);
        int i11 = i8 | (~i4);
        int i12 = i10 | (~(i11 | i2));
        int i13 = (~i2) | i11;
        int i14 = i4 + i6 + i5 + (1134938392 * i) + ((-1730424158) * i3);
        int i15 = i14 * i14;
        int i16 = (i4 * 1914917686) + 639827133 + (i6 * 1914918628) + (i9 * (-942)) + (i12 * (-471)) + (i13 * 471) + (1914918157 * i5) + ((-1451741640) * i) + ((-1338016710) * i3) + (i15 * (-1605042176));
        switch ((1345404558 * i4) + 1061748736 + ((-382549644) * i6) + (1727954202 * i9) + ((-1283506547) * i12) + (1283506547 * i13) + ((-1666056192) * i5) + (1924136960 * i) + (748945408 * i3) + (912850944 * i15) + (i16 * i16 * (-230752256))) {
            case 1:
                GlobalBenefitTabFragment globalBenefitTabFragment = (GlobalBenefitTabFragment) objArr[0];
                CardsV2.PointBackInfo.ChanceExhaustedSheet chanceExhaustedSheet = (CardsV2.PointBackInfo.ChanceExhaustedSheet) objArr[1];
                int i17 = 2 % 2;
                int i18 = onMinimized + 109;
                onMessageChannelReady = i18 % 128;
                int i19 = i18 % 2;
                globalBenefitTabFragment.onExtraCallbackWithResult(chanceExhaustedSheet);
                int i20 = onMessageChannelReady + 55;
                onMinimized = i20 % 128;
                int i21 = i20 % 2;
                return null;
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return asInterface(objArr);
            case 10:
                return asBinder(objArr);
            case 11:
                return access100(objArr);
            case 12:
                GlobalBenefitTabFragment globalBenefitTabFragment2 = (GlobalBenefitTabFragment) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i22 = 2 % 2;
                AppSetIdAndScope1 appSetIdAndScope1 = globalBenefitTabFragment2.getInterfaceDescriptor;
                globalBenefitTabFragment2.access000().IAuthTabCallback(zBooleanValue);
                int i23 = onMinimized + 101;
                onMessageChannelReady = i23 % 128;
                int i24 = i23 % 2;
                return null;
            case 13:
                return getInterfaceDescriptor(objArr);
            case 14:
                return IAuthTabCallbackStubProxy(objArr);
            case 15:
                return IAuthTabCallback_Parcel(objArr);
            case 16:
                return access000(objArr);
            case 17:
                return writeTypedObject(objArr);
            case 18:
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
                int i25 = 2 % 2;
                int i26 = onMessageChannelReady + 61;
                onMinimized = i26 % 128;
                if (i26 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.onExtraCallbackWithResult());
                    i7 = 15037;
                } else {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.onExtraCallbackWithResult());
                    i7 = 2000;
                }
                attachapplovinsdk.IAuthTabCallback(i7);
                return Unit.INSTANCE;
            case 19:
                return extraCallback(objArr);
            case 20:
                return ICustomTabsCallback(objArr);
            case 21:
                GlobalBenefitTabFragment globalBenefitTabFragment3 = (GlobalBenefitTabFragment) objArr[0];
                RotationVectorAbility1 rotationVectorAbility1 = (RotationVectorAbility1) objArr[1];
                int i27 = 2 % 2;
                Intrinsics.checkNotNullParameter(rotationVectorAbility1, "");
                TinyAppHostApduService1.onWarmupCompleted(TinyAppHostApduService1.onNavigationEvent, 1641112L, (Map) null, false, new GlobalBenefitTabFragment$.ExternalSyntheticLambda8(rotationVectorAbility1), 6, (Object) null);
                SessionTrackerb sessionTrackerbOnNavigationEvent = globalBenefitTabFragment3.onNavigationEvent();
                Context contextRequireContext = globalBenefitTabFragment3.requireContext();
                Object[] objArr2 = {rotationVectorAbility1.onExtraCallbackWithResult()};
                int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
                SessionTrackerb.onExtraCallbackWithResult(sessionTrackerbOnNavigationEvent, contextRequireContext, ((Cards.Card.CardExteriorInfo) Cards.Card.onNavigationEvent(setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr2, setAutoCaptured.onExtraCallbackWithResult(), -1488865171, 1488865172, setAutoCaptured.onExtraCallbackWithResult())).onWarmupCompleted(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                Unit unit = Unit.INSTANCE;
                int i28 = onMessageChannelReady + 55;
                onMinimized = i28 % 128;
                int i29 = i28 % 2;
                return unit;
            case 22:
                return extraCallbackWithResult(objArr);
            case 23:
                return readTypedObject(objArr);
            case 24:
                return onActivityLayout(objArr);
            case 25:
                return onMessageChannelReady(objArr);
            case R$styleable.CameraView_cameraPictureMetering /* 26 */:
                return onActivityResized(objArr);
            case 27:
                return onMinimized(objArr);
            case 28:
                return onPostMessage(objArr);
            case 29:
                return ICustomTabsCallbackStub(objArr);
            case 30:
                return ICustomTabsCallbackStubProxy(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(GlobalBenefitTabFragment globalBenefitTabFragment, String str) {
        int i = 2 % 2;
        int i2 = onMinimized + 77;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            throw null;
        }
        int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent4 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent3, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{globalBenefitTabFragment, str}, 1333402932, iOnNavigationEvent4, -1333402916);
        int i3 = onMessageChannelReady + 89;
        onMinimized = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 46 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(GlobalBenefitTabFragment globalBenefitTabFragment, ContactAccount.onExtraCallbackWithResult onextracallbackwithresult) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onMinimized + 95;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(globalBenefitTabFragment, onextracallbackwithresult);
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(GlobalBenefitTabFragment globalBenefitTabFragment, RotationVectorAbility1 rotationVectorAbility1) {
        int i = 2 % 2;
        int i2 = onMinimized + 123;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            return (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{globalBenefitTabFragment, rotationVectorAbility1}, -1064013371, iOnNavigationEvent2, 1064013398);
        }
        int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent4 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onMinimized + 115;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{attachapplovinsdk}, 708954982, iOnNavigationEvent2, -708954969);
        int i4 = onMinimized + 39;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 99;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 57;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public static final class readTypedObject implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final readTypedObject onWarmupCompleted = new readTypedObject();

        static {
            int i = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public final void onNavigationEvent(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            if (i3 != 0) {
                int i4 = 15 / 0;
            }
            int i5 = onNavigationEvent + 97;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((initMiniApp.onWarmupCompleted) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 36 / 0;
            }
            int i5 = onExtraCallback + 107;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }
    }

    public static final class extraCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Configuration onNavigationEvent;

        public extraCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                int i2 = IAuthTabCallback + 31;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = IAuthTabCallback + 115;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class extraCallbackWithResult implements getAdService {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public extraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            Object obj = null;
            if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                int i2 = onExtraCallback + 15;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                if (i3 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallback + 93;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return getspecialfeatureoptinstatus2;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static final class onMessageChannelReady extends Lambda implements Function0<Fragment> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onMessageChannelReady(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Fragment fragmentOnWarmupCompleted = onWarmupCompleted();
            int i4 = onWarmupCompleted + 97;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 35 / 0;
            }
            return fragmentOnWarmupCompleted;
        }

        public final Fragment onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Fragment fragment = this.$this_viewModels;
            int i5 = i3 + 29;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return fragment;
        }
    }

    public static final class onPostMessage extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onPostMessage(Function0 function0) {
            super(0);
            this.$ownerProducer = function0;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallback();
            }
            onExtraCallback();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0 = (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) this.$ownerProducer.invoke();
            int i4 = onWarmupCompleted + 113;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda0;
        }
    }

    public static final class onActivityLayout extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onActivityLayout(Fragment fragment, Lazy lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onExtraCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 36 / 0;
            }
            return onwarmupcompletedOnExtraCallbackWithResult;
        }

        public final ViewModelProvider.onWarmupCompleted onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6 = (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) ^ true ? null : textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
            if (textFieldKeyInputExternalSyntheticLambda6 != null) {
                int i4 = onExtraCallback + 23;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory();
                if (defaultViewModelProviderFactory != null) {
                    int i6 = onExtraCallbackWithResult + 31;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return defaultViewModelProviderFactory;
                }
            }
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
            return defaultViewModelProviderFactory2;
        }
    }

    public static final class onActivityResized extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onActivityResized(Function0 function0, Lazy lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                onWarmupCompleted();
                throw null;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnWarmupCompleted = onWarmupCompleted();
            int i3 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnWarmupCompleted;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onWarmupCompleted() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            int i = 2 % 2;
            Function0 function0 = this.$extrasProducer;
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6 = null;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                int i2 = onExtraCallbackWithResult + 75;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                }
                textFieldKeyInputExternalSyntheticLambda6.hashCode();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            if (androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                int i3 = onExtraCallbackWithResult + 67;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                textFieldKeyInputExternalSyntheticLambda6 = (TextFieldKeyInputExternalSyntheticLambda6) androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent;
            }
            return textFieldKeyInputExternalSyntheticLambda6 != null ? textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
        }
    }

    public static final class onMinimized extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onMinimized(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnNavigationEvent = onNavigationEvent();
            int i4 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnNavigationEvent;
            }
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
            int i4 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return viewModelStore;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(GlobalBenefitTabFragment globalBenefitTabFragment, List list, List list2) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 51;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{globalBenefitTabFragment, list, list2}, -169958757, iOnNavigationEvent2, 169958761);
        int i4 = onMinimized + 21;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        GlobalBenefitTabFragment globalBenefitTabFragment = (GlobalBenefitTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 89;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        getSimOperator getsimoperator = globalBenefitTabFragment.IAuthTabCallbackStubProxy;
        int i5 = i2 + 73;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            return getsimoperator;
        }
        throw null;
    }

    public static final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 IAuthTabCallbackDefault(GlobalBenefitTabFragment globalBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 59;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = globalBenefitTabFragment.writeTypedObject;
        int i5 = i2 + 41;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return textFieldScrollKtExternalSyntheticLambda0;
    }

    public static final /* synthetic */ String IAuthTabCallbackStub(GlobalBenefitTabFragment globalBenefitTabFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 69;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            globalBenefitTabFragment.access100();
            throw null;
        }
        String strAccess100 = globalBenefitTabFragment.access100();
        int i3 = onMessageChannelReady + 29;
        onMinimized = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 53 / 0;
        }
        return strAccess100;
    }

    public static final /* synthetic */ AtomicBoolean IAuthTabCallbackStubProxy(GlobalBenefitTabFragment globalBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 93;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        AtomicBoolean atomicBoolean = globalBenefitTabFragment.IAuthTabCallbackStub;
        int i5 = i3 + 25;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return atomicBoolean;
    }

    public static final /* synthetic */ GlobalBenefitTabViewModel IAuthTabCallback_Parcel(GlobalBenefitTabFragment globalBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 93;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return globalBenefitTabFragment.access000();
        }
        globalBenefitTabFragment.access000();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ AddPhoneContactView asBinder(GlobalBenefitTabFragment globalBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = onMinimized + 85;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        AddPhoneContactView addPhoneContactViewAsInterface = globalBenefitTabFragment.asInterface();
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        return addPhoneContactViewAsInterface;
    }

    public static final /* synthetic */ void getInterfaceDescriptor(GlobalBenefitTabFragment globalBenefitTabFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 57;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        globalBenefitTabFragment.onActivityLayout();
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        GlobalBenefitTabFragment globalBenefitTabFragment = (GlobalBenefitTabFragment) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 51;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        globalBenefitTabFragment.asInterface = zBooleanValue;
        int i5 = i2 + 57;
        onMinimized = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(GlobalBenefitTabFragment globalBenefitTabFragment, List list) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 15;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        globalBenefitTabFragment.onNavigationEvent((List<? extends SensorBridgeExtension3>) list);
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(GlobalBenefitTabFragment globalBenefitTabFragment, float f, float f2, int i, String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onMinimized + 79;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        globalBenefitTabFragment.IAuthTabCallback(f, f2, i, str);
        int i5 = onMinimized + 55;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(GlobalBenefitTabFragment globalBenefitTabFragment, boolean z) {
        int i = 2 % 2;
        int i2 = onMinimized + 121;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {globalBenefitTabFragment, Boolean.valueOf(z)};
        onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), objArr, 250555528, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -250555516);
        int i4 = onMessageChannelReady + 51;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ BenefitTabImpressionHandler onTransact(GlobalBenefitTabFragment globalBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 33;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        BenefitTabImpressionHandler benefitTabImpressionHandler = globalBenefitTabFragment.asBinder;
        int i5 = i2 + 67;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            return benefitTabImpressionHandler;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ WorkflowUnit onWarmupCompleted(GlobalBenefitTabFragment globalBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 39;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        WorkflowUnit workflowUnit = globalBenefitTabFragment.IAuthTabCallback;
        int i5 = i2 + 119;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return workflowUnit;
    }

    public static final /* synthetic */ void onWarmupCompleted(GlobalBenefitTabFragment globalBenefitTabFragment, long j, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = onMessageChannelReady + 25;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        globalBenefitTabFragment.onExtraCallbackWithResult(j, i, z);
        if (i4 == 0) {
            throw null;
        }
        int i5 = onMinimized + 123;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(GlobalBenefitTabFragment globalBenefitTabFragment, Cards cards, List list) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 37;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{globalBenefitTabFragment, cards, list}, -2081276669, iOnNavigationEvent2, 2081276674);
            throw null;
        }
        int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent4 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent3, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{globalBenefitTabFragment, cards, list}, -2081276669, iOnNavigationEvent4, 2081276674);
        int i3 = onMinimized + 33;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
    }

    public GlobalBenefitTabFragment() throws Throwable {
        super(R.layout.benefit_pillar_fragment);
        this.getInterfaceDescriptor = ea10.onExtraCallbackWithResult("GlobalBenefitTab");
        this.onExtraCallbackWithResult = preFillDefault.IAuthTabCallback(this, onExtraCallback.onExtraCallbackWithResult);
        Lazy lazyOnNavigationEvent = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onPostMessage(new onMessageChannelReady(this)));
        this.extraCallback = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(GlobalBenefitTabViewModel.class), new onMinimized(lazyOnNavigationEvent), new onActivityResized(null, lazyOnNavigationEvent), new onActivityLayout(this, lazyOnNavigationEvent));
        this.asInterface = true;
        this.readTypedObject = removeCameraStateObserver.IAuthTabCallback(0L);
        Object[] objArr = new Object[1];
        a(new char[]{13801}, (byte) (63 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 1, objArr);
        this.access000 = ((String) objArr[0]).intern();
        this.onTransact = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        Boolean bool = Boolean.FALSE;
        this.IAuthTabCallback_Parcel = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallbackDefault = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.access100 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallbackStub = new AtomicBoolean(true);
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, AddPhoneContactView> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 55;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        onExtraCallback() {
            super(1, AddPhoneContactView.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/benefit/databinding/BenefitPillarFragmentBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AddPhoneContactView addPhoneContactViewOnExtraCallbackWithResult = onExtraCallbackWithResult((View) obj);
            if (i3 == 0) {
                int i4 = 79 / 0;
            }
            int i5 = onWarmupCompleted + 87;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 79 / 0;
            }
            return addPhoneContactViewOnExtraCallbackWithResult;
        }

        public final AddPhoneContactView onExtraCallbackWithResult(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(view, "");
                return AddPhoneContactView.onNavigationEvent(view);
            }
            Intrinsics.checkNotNullParameter(view, "");
            AddPhoneContactView.onNavigationEvent(view);
            throw null;
        }
    }

    private final AddPhoneContactView asInterface() {
        PageRenderReadyListener pageRenderReadyListener;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = onMinimized + 25;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            pageRenderReadyListener = this.onExtraCallbackWithResult;
            addallcommandline = onNavigationEvent[0];
        } else {
            pageRenderReadyListener = this.onExtraCallbackWithResult;
            addallcommandline = onNavigationEvent[0];
        }
        return pageRenderReadyListener.onNavigationEvent(this, addallcommandline);
    }

    private final GlobalBenefitTabViewModel access000() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 77;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        GlobalBenefitTabViewModel globalBenefitTabViewModel = (GlobalBenefitTabViewModel) this.extraCallback.getValue();
        int i4 = onMessageChannelReady + 7;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return globalBenefitTabViewModel;
    }

    public final SessionTrackerb onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 43;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.router;
        if (sessionTrackerb != null) {
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = onMinimized + 65;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        GlobalBenefitTabFragment globalBenefitTabFragment = (GlobalBenefitTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 117;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        getPricingPhaseList getpricingphaselist = globalBenefitTabFragment.tossRegion;
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        if (getpricingphaselist != null) {
            return getpricingphaselist;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = onMessageChannelReady + 65;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final String access100() throws Throwable {
        int i = 2 % 2;
        Bundle arguments = getArguments();
        if (arguments == null) {
            return "";
        }
        int i2 = onMessageChannelReady + 21;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{'!', 18, 19, 22, 13869, 13869, 18, '!'}, (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 68), 8 - ExpandableListView.getPackedPositionType(0L), objArr);
        String string = arguments.getString(((String) objArr[0]).intern());
        if (string == null) {
            return "";
        }
        int i4 = onMinimized + 11;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        int i = 2 % 2;
        Bundle arguments = ((GlobalBenefitTabFragment) objArr[0]).getArguments();
        if (arguments != null) {
            int i2 = onMessageChannelReady + 25;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            if (arguments.getBoolean("from_home_launcher")) {
                return true;
            }
        }
        int i4 = onMinimized + 123;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public void onRetry() {
        int i = 2 % 2;
        int i2 = onMinimized + 71;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this, false}, 250555528, iOnNavigationEvent2, -250555516);
            return;
        }
        int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent4 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent3, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this, true}, 250555528, iOnNavigationEvent4, -250555516);
    }

    public void onNewArgument(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 31;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallbackDefault();
        int i4 = onMinimized + 11;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function1<access13800<? super List<? extends String>>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int label;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = GlobalBenefitTabFragment.this.new IAuthTabCallbackDefault(access13800Var);
            int i2 = onExtraCallbackWithResult + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackDefault;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((access13800) obj);
            if (i3 != 0) {
                int i4 = 11 / 0;
            }
            int i5 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final Object onExtraCallbackWithResult(access13800<? super List<String>> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefaultCreate = create(access13800Var);
            if (i3 != 0) {
                return iAuthTabCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
            }
            iAuthTabCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
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
                GlobalBenefitTabViewModel globalBenefitTabViewModelIAuthTabCallback_Parcel = GlobalBenefitTabFragment.IAuthTabCallback_Parcel(GlobalBenefitTabFragment.this);
                this.label = 1;
                Object objOnExtraCallbackWithResult = globalBenefitTabViewModelIAuthTabCallback_Parcel.onExtraCallbackWithResult(this);
                if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                int i3 = onExtraCallbackWithResult + 91;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return objOnExtraCallbackWithResult;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = IAuthTabCallback + 41;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i6 == 0) {
                throw null;
            }
            int i7 = IAuthTabCallback + 49;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return obj;
        }
    }

    private static final Activity access000(GlobalBenefitTabFragment globalBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 67;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            globalBenefitTabFragment.getActivity();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FragmentActivity activity = globalBenefitTabFragment.getActivity();
        int i3 = onMinimized + 13;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        return activity;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        GlobalBenefitTabFragment globalBenefitTabFragment = (GlobalBenefitTabFragment) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 53;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onRenderReady.onExtraCallbackWithResult(globalBenefitTabFragment, str);
        Unit unit = Unit.INSTANCE;
        int i4 = onMessageChannelReady + 35;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final int extraCallbackWithResult(GlobalBenefitTabFragment globalBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 65;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {globalBenefitTabFragment.access000()};
        int iIAuthTabCallback = ((WebSocketResultEnum) ((setRubIn) GlobalBenefitTabViewModel.onExtraCallbackWithResult(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 1200589368, a.3.onWarmupCompleted(), objArr, -1200589365, a.3.onWarmupCompleted())).IAuthTabCallback()).IAuthTabCallback();
        int i4 = onMinimized + 71;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return iIAuthTabCallback;
    }

    private static final int writeTypedObject(GlobalBenefitTabFragment globalBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = onMinimized + 77;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        GlobalBenefitTabViewModel globalBenefitTabViewModelAccess000 = globalBenefitTabFragment.access000();
        if (i3 != 0) {
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            ((WebSocketResultEnum) ((setRubIn) GlobalBenefitTabViewModel.onExtraCallbackWithResult(iOnWarmupCompleted, a.3.onWarmupCompleted(), 1200589368, iOnWarmupCompleted2, new Object[]{globalBenefitTabViewModelAccess000}, -1200589365, a.3.onWarmupCompleted())).IAuthTabCallback()).IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
        int iOnWarmupCompleted4 = a.3.onWarmupCompleted();
        int iIAuthTabCallback = ((WebSocketResultEnum) ((setRubIn) GlobalBenefitTabViewModel.onExtraCallbackWithResult(iOnWarmupCompleted3, a.3.onWarmupCompleted(), 1200589368, iOnWarmupCompleted4, new Object[]{globalBenefitTabViewModelAccess000}, -1200589365, a.3.onWarmupCompleted())).IAuthTabCallback()).IAuthTabCallback();
        int i4 = onMessageChannelReady + 37;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return iIAuthTabCallback;
    }

    private static /* synthetic */ Object access000(Object[] objArr) throws Throwable {
        Object obj;
        GlobalBenefitTabFragment globalBenefitTabFragment = (GlobalBenefitTabFragment) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        if (str == null || StringsKt.isBlank(str)) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "BenefitTab", "onClickAdChoicesView url is null or blank", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        } else {
            try {
                Result.Companion companion = Result.Companion;
                globalBenefitTabFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr2 = new Object[1];
                a(new char[]{'\f', '#', 13817}, (byte) (Color.blue(0) + 3), TextUtils.indexOf((CharSequence) "", '0') + 4, objArr2);
                ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, "BenefitTab", "onClickAdChoicesView error", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str), getWrite.IAuthTabCallback(ApiDowngradeLogger.EXT_KEY_ERROR_CODE, th2.getMessage())}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                int i2 = onMessageChannelReady + 31;
                onMinimized = i2 % 128;
                int i3 = i2 % 2;
            }
            Result.IAuthTabCallback(obj);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onMessageChannelReady + 95;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(RotationVectorAbility1 rotationVectorAbility1, SetDetectableSize setDetectableSize) throws Throwable {
        String strName;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("service", rotationVectorAbility1.onExtraCallbackWithResult().IAuthTabCallbackDefault());
        Object[] objArr = new Object[1];
        a(new char[]{26, 22, 26, 4, 13907}, (byte) (84 - (ViewConfiguration.getTapTimeout() >> 16)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = {rotationVectorAbility1.onExtraCallbackWithResult()};
        setDetectableSize.onExtraCallback(strIntern, ((Cards.Card.CardExteriorInfo) Cards.Card.onNavigationEvent(setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), objArr2, setAutoCaptured.onExtraCallbackWithResult(), -1488865171, 1488865172, setAutoCaptured.onExtraCallbackWithResult())).IAuthTabCallback());
        Cards.onNavigationEvent onnavigationeventAsBinder = rotationVectorAbility1.onExtraCallbackWithResult().asBinder();
        if (onnavigationeventAsBinder != null) {
            int i2 = onMessageChannelReady + 109;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            strName = onnavigationeventAsBinder.name();
        } else {
            strName = null;
        }
        setDetectableSize.onExtraCallback("activation", strName);
        setDetectableSize.onExtraCallback("order", Integer.valueOf(rotationVectorAbility1.onExtraCallback()));
        Unit unit = Unit.INSTANCE;
        int i4 = onMessageChannelReady + 3;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        GlobalBenefitTabFragment globalBenefitTabFragment = (GlobalBenefitTabFragment) objArr[0];
        RotationVectorAbility1 rotationVectorAbility1 = (RotationVectorAbility1) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rotationVectorAbility1, "");
        TinyAppHostApduService1.onWarmupCompleted(TinyAppHostApduService1.onNavigationEvent, 1641112L, (Map) null, false, new GlobalBenefitTabFragment$.ExternalSyntheticLambda18(rotationVectorAbility1), 6, (Object) null);
        SessionTrackerb sessionTrackerbOnNavigationEvent = globalBenefitTabFragment.onNavigationEvent();
        Context contextRequireContext = globalBenefitTabFragment.requireContext();
        Object[] objArr2 = {rotationVectorAbility1.onExtraCallbackWithResult()};
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        SessionTrackerb.onExtraCallbackWithResult(sessionTrackerbOnNavigationEvent, contextRequireContext, ((Cards.Card.CardExteriorInfo) Cards.Card.onNavigationEvent(setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr2, setAutoCaptured.onExtraCallbackWithResult(), -1488865171, 1488865172, setAutoCaptured.onExtraCallbackWithResult())).onWarmupCompleted(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onMessageChannelReady + 33;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onNavigationEvent + 37;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            throw null;
        }
    }

    private static final Unit onNavigationEvent(RotationVectorAbility1 rotationVectorAbility1, SetDetectableSize setDetectableSize) throws Throwable {
        String strName;
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 101;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("service", rotationVectorAbility1.onExtraCallbackWithResult().IAuthTabCallbackDefault());
        Object[] objArr = new Object[1];
        a(new char[]{26, 22, 26, 4, 13907}, (byte) (84 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), View.resolveSizeAndState(0, 0, 0) + 5, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = {rotationVectorAbility1.onExtraCallbackWithResult()};
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        setDetectableSize.onExtraCallback(strIntern, ((Cards.Card.CardExteriorInfo) Cards.Card.onNavigationEvent(setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr2, setAutoCaptured.onExtraCallbackWithResult(), -1488865171, 1488865172, setAutoCaptured.onExtraCallbackWithResult())).IAuthTabCallback());
        Cards.onNavigationEvent onnavigationeventAsBinder = rotationVectorAbility1.onExtraCallbackWithResult().asBinder();
        if (onnavigationeventAsBinder != null) {
            strName = onnavigationeventAsBinder.name();
        } else {
            int i4 = onMessageChannelReady + 87;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            strName = null;
        }
        setDetectableSize.onExtraCallback("activation", strName);
        setDetectableSize.onExtraCallback("order", Integer.valueOf(rotationVectorAbility1.onExtraCallback()));
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        RotationVectorAbility1.onExtraCallback onextracallback = (RotationVectorAbility1.onExtraCallback) objArr[0];
        String str = (String) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 15;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("cluster", onextracallback.IAuthTabCallback());
        setDetectableSize.onExtraCallback("section_order", onextracallback.IAuthTabCallbackDefault());
        setDetectableSize.onExtraCallback("service", onextracallback.onExtraCallbackWithResult().IAuthTabCallbackDefault());
        setDetectableSize.onExtraCallback("order", Integer.valueOf(onextracallback.onExtraCallback()));
        setDetectableSize.onExtraCallback("activation", str);
        Unit unit = Unit.INSTANCE;
        int i4 = onMessageChannelReady + 69;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(GlobalBenefitTabFragment globalBenefitTabFragment, RotationVectorAbility1.onExtraCallback onextracallback, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        globalBenefitTabFragment.access000().onExtraCallbackWithResult(onextracallback);
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 5211466L, false, (String) null, (Map) null, new GlobalBenefitTabFragment$.ExternalSyntheticLambda9(onextracallback, str), 14, (Object) null);
        SessionTrackerb sessionTrackerbOnNavigationEvent = globalBenefitTabFragment.onNavigationEvent();
        Context contextRequireContext = globalBenefitTabFragment.requireContext();
        Object[] objArr = {onextracallback.onExtraCallbackWithResult()};
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        SessionTrackerb.onExtraCallbackWithResult(sessionTrackerbOnNavigationEvent, contextRequireContext, ((Cards.Card.CardExteriorInfo) Cards.Card.onNavigationEvent(setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, setAutoCaptured.onExtraCallbackWithResult(), -1488865171, 1488865172, setAutoCaptured.onExtraCallbackWithResult())).onWarmupCompleted(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onMinimized + 7;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(SensorServiceManager sensorServiceManager, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 99;
        onMessageChannelReady = i2 % 128;
        String strAsBinder = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            sensorServiceManager.onExtraCallbackWithResult();
            strAsBinder.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        CardsV2.BenefitMissionInfo benefitMissionInfoOnExtraCallbackWithResult = sensorServiceManager.onExtraCallbackWithResult();
        if (benefitMissionInfoOnExtraCallbackWithResult != null) {
            strAsBinder = benefitMissionInfoOnExtraCallbackWithResult.asBinder();
            int i3 = onMessageChannelReady + 57;
            onMinimized = i3 % 128;
            int i4 = i3 % 2;
        }
        Object[] objArr = new Object[1];
        a(new char[]{11, 15, 13904, 13904, 25, 27, 4, 24, 22, 26, 3, 20}, (byte) (98 - View.combineMeasuredStates(0, 0)), 13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), strAsBinder);
        setDetectableSize.onExtraCallback("section_order", Integer.valueOf(sensorServiceManager.asInterface()));
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(GlobalBenefitTabFragment globalBenefitTabFragment, SensorServiceManager sensorServiceManager) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 63;
        onMessageChannelReady = i2 % 128;
        String str = "";
        String strIAuthTabCallbackStubProxy = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sensorServiceManager, "");
            sensorServiceManager.onExtraCallbackWithResult();
            strIAuthTabCallbackStubProxy.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(sensorServiceManager, "");
        CardsV2.BenefitMissionInfo benefitMissionInfoOnExtraCallbackWithResult = sensorServiceManager.onExtraCallbackWithResult();
        if (benefitMissionInfoOnExtraCallbackWithResult != null) {
            int i3 = onMinimized + 11;
            onMessageChannelReady = i3 % 128;
            if (i3 % 2 != 0) {
                int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
                throw null;
            }
            int iOnExtraCallbackWithResult3 = MaxNativeAdListener.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = MaxNativeAdListener.onExtraCallbackWithResult();
            CardsV2.CustomParameter customParameter = (CardsV2.CustomParameter) CardsV2.BenefitMissionInfo.onNavigationEvent(MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), new Object[]{benefitMissionInfoOnExtraCallbackWithResult}, iOnExtraCallbackWithResult4, 803572547, iOnExtraCallbackWithResult3, -803572547);
            if (customParameter != null) {
                strIAuthTabCallbackStubProxy = customParameter.IAuthTabCallbackStubProxy();
            }
        }
        if (strIAuthTabCallbackStubProxy == null) {
            int i4 = onMessageChannelReady + 65;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = strIAuthTabCallbackStubProxy;
        }
        if (!StringsKt.isBlank(str)) {
            TinyAppHostApduService1 tinyAppHostApduService1 = TinyAppHostApduService1.onNavigationEvent;
            TinyAppHostApduService1.onWarmupCompleted(tinyAppHostApduService1, 1565537L, (Map) null, false, new GlobalBenefitTabFragment$.ExternalSyntheticLambda12(sensorServiceManager), 6, (Object) null);
            SessionTrackerb sessionTrackerbOnNavigationEvent = globalBenefitTabFragment.onNavigationEvent();
            FragmentActivity fragmentActivityRequireActivity = globalBenefitTabFragment.requireActivity();
            Uri uri = Uri.parse(str);
            Object[] objArr = new Object[1];
            a(new char[]{'!', 18, 19, 22, 13869, 13869, 18, '!'}, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 68), Color.alpha(0) + 8, objArr);
            SessionTrackerb.IAuthTabCallback(sessionTrackerbOnNavigationEvent, fragmentActivityRequireActivity, filterCreatePageParams.onWarmupCompleted(uri, ((String) objArr[0]).intern(), tinyAppHostApduService1.onWarmupCompleted()).toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            int i6 = onMessageChannelReady + 1;
            onMinimized = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = extraCallbackWithResult;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 26 - Color.argb(0, 0, 0, 0), 23139 - Color.argb(0, 0, 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
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
        Object[] objArr3 = {Integer.valueOf(onActivityResized)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), ((byte) KeyEvent.getModifierMetaStateMask()) + 27, 23139 - (ViewConfiguration.getPressedStateDuration() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i5 = $11 + 47;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $10 + 57;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i9 = $11 + 49;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback * b);
                        int i10 = defaultGainProviderExternalSyntheticLambda0.onNavigationEvent;
                        cArr4[0] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback << b);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    }
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 24825), 74 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.indexOf("", "") + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), Process.getGidForName("") + 31, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                        } else {
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private static final Unit onExtraCallback(CardsV2.CustomParameter customParameter, SensorServiceManager sensorServiceManager, SetDetectableSize setDetectableSize) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 103;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
            int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
            int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
            setDetectableSize.onExtraCallback("streak_day_cnt", (Integer) CardsV2.CustomParameter.IAuthTabCallback(-214511220, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{customParameter}, iIAuthTabCallback, iIAuthTabCallback2, 214511221));
            setDetectableSize.onExtraCallback("section_order", Integer.valueOf(sensorServiceManager.asInterface()));
            unit = Unit.INSTANCE;
            int i3 = 92 / 0;
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            int iIAuthTabCallback4 = AdResponseKtKt.IAuthTabCallback();
            int iIAuthTabCallback5 = AdResponseKtKt.IAuthTabCallback();
            int iIAuthTabCallback6 = AdResponseKtKt.IAuthTabCallback();
            setDetectableSize.onExtraCallback("streak_day_cnt", (Integer) CardsV2.CustomParameter.IAuthTabCallback(-214511220, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback6, new Object[]{customParameter}, iIAuthTabCallback4, iIAuthTabCallback5, 214511221));
            setDetectableSize.onExtraCallback("section_order", Integer.valueOf(sensorServiceManager.asInterface()));
            unit = Unit.INSTANCE;
        }
        int i4 = onMinimized + 93;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(GlobalBenefitTabFragment globalBenefitTabFragment, SensorServiceManager sensorServiceManager) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 21;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sensorServiceManager, "");
        CardsV2.BenefitMissionInfo benefitMissionInfoOnExtraCallbackWithResult = sensorServiceManager.onExtraCallbackWithResult();
        if (benefitMissionInfoOnExtraCallbackWithResult == null) {
            int i4 = onMinimized + 23;
            onMessageChannelReady = i4 % 128;
            int i5 = i4 % 2;
            return Unit.INSTANCE;
        }
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        CardsV2.CustomParameter customParameter = (CardsV2.CustomParameter) CardsV2.BenefitMissionInfo.onNavigationEvent(MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), new Object[]{benefitMissionInfoOnExtraCallbackWithResult}, MaxNativeAdListener.onExtraCallbackWithResult(), 803572547, iOnExtraCallbackWithResult, -803572547);
        if (customParameter == null) {
            int i6 = onMinimized + 55;
            onMessageChannelReady = i6 % 128;
            int i7 = i6 % 2;
            return Unit.INSTANCE;
        }
        TinyAppHostApduService1 tinyAppHostApduService1 = TinyAppHostApduService1.onNavigationEvent;
        TinyAppHostApduService1.onWarmupCompleted(tinyAppHostApduService1, 1869044L, (Map) null, false, new GlobalBenefitTabFragment$.ExternalSyntheticLambda10(customParameter, sensorServiceManager), 6, (Object) null);
        SessionTrackerb sessionTrackerbOnNavigationEvent = globalBenefitTabFragment.onNavigationEvent();
        FragmentActivity fragmentActivityRequireActivity = globalBenefitTabFragment.requireActivity();
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        Uri uri = Uri.parse((String) CardsV2.CustomParameter.IAuthTabCallback(1013680064, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{customParameter}, iIAuthTabCallback, iIAuthTabCallback2, -1013680062));
        Object[] objArr = new Object[1];
        a(new char[]{'!', 18, 19, 22, 13869, 13869, 18, '!'}, (byte) (68 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 8 - Drawable.resolveOpacity(0, 0), objArr);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbOnNavigationEvent, fragmentActivityRequireActivity, filterCreatePageParams.onWarmupCompleted(uri, ((String) objArr[0]).intern(), tinyAppHostApduService1.onWarmupCompleted()).toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i8 = onMinimized + 3;
        onMessageChannelReady = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 87 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(SensorBridgeExtension4 sensorBridgeExtension4, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMinimized + 37;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("submission_code", sensorBridgeExtension4.onExtraCallbackWithResult());
            setDetectableSize.onExtraCallback("slot_code", sensorBridgeExtension4.onNavigationEvent().onNavigationEvent());
            setDetectableSize.onExtraCallback("section_order", Integer.valueOf(sensorBridgeExtension4.onExtraCallback()));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("submission_code", sensorBridgeExtension4.onExtraCallbackWithResult());
        setDetectableSize.onExtraCallback("slot_code", sensorBridgeExtension4.onNavigationEvent().onNavigationEvent());
        setDetectableSize.onExtraCallback("section_order", Integer.valueOf(sensorBridgeExtension4.onExtraCallback()));
        int i3 = 87 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(GlobalBenefitTabFragment globalBenefitTabFragment, SensorBridgeExtension4 sensorBridgeExtension4) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sensorBridgeExtension4, "");
        TinyAppHostApduService1.onWarmupCompleted(TinyAppHostApduService1.onNavigationEvent, 1982092L, (Map) null, false, new GlobalBenefitTabFragment$.ExternalSyntheticLambda47(sensorBridgeExtension4), 6, (Object) null);
        SessionTrackerb.onExtraCallbackWithResult(globalBenefitTabFragment.onNavigationEvent(), globalBenefitTabFragment.requireContext(), sensorBridgeExtension4.onNavigationEvent().onExtraCallback(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onMinimized + 49;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(stopDeviceShakeListener stopdeviceshakelistener, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 17;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("point_amount", Long.valueOf(stopdeviceshakelistener.onWarmupCompleted()));
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("point_amount", Long.valueOf(stopdeviceshakelistener.onWarmupCompleted()));
        Unit unit2 = Unit.INSTANCE;
        int i3 = onMessageChannelReady + 71;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit IAuthTabCallback(GlobalBenefitTabFragment globalBenefitTabFragment, stopDeviceShakeListener stopdeviceshakelistener) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(stopdeviceshakelistener, "");
        TinyAppHostApduService1.onWarmupCompleted(TinyAppHostApduService1.onNavigationEvent, 1008137L, (Map) null, false, new GlobalBenefitTabFragment$.ExternalSyntheticLambda42(stopdeviceshakelistener), 6, (Object) null);
        SessionTrackerb sessionTrackerbOnNavigationEvent = globalBenefitTabFragment.onNavigationEvent();
        Context contextRequireContext = globalBenefitTabFragment.requireContext();
        Object[] objArr = new Object[1];
        a(new char[]{14, '\f', '\t', 27, '\"', 24, 25, '\f', 19, 31, 13811, 13811, ' ', 4, 27, 6, '\b', 5, '!', '\b', 20, 27, 22, 19, 22, 26, 16, 26, 6, '\n', '\"', 14, 16, 15, 0, 27, 26, ' ', 29, 4, '!', 18, 19, 22, 13862, 13862, 18, '!', '\n', 25, 6, '\n', 3, 6, 20, 27, 22, 19, 22, 26}, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 63), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 60, objArr);
        SessionTrackerb.onExtraCallbackWithResult(sessionTrackerbOnNavigationEvent, contextRequireContext, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onMessageChannelReady + 31;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(AdMobFallback adMobFallback, SetDetectableSize setDetectableSize) {
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 115;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        if (adMobFallback != null) {
            int i4 = onMessageChannelReady + 83;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            strOnExtraCallbackWithResult = adMobFallback.onExtraCallbackWithResult();
        } else {
            strOnExtraCallbackWithResult = null;
        }
        setDetectableSize.onExtraCallback("service", strOnExtraCallbackWithResult);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(GlobalBenefitTabFragment globalBenefitTabFragment, AdMobFallback adMobFallback) {
        String strOnExtraCallback;
        int i = 2 % 2;
        TinyAppHostApduService1.onWarmupCompleted(TinyAppHostApduService1.onNavigationEvent, 1681664L, (Map) null, false, new GlobalBenefitTabFragment$.ExternalSyntheticLambda48(adMobFallback), 6, (Object) null);
        SessionTrackerb sessionTrackerbOnNavigationEvent = globalBenefitTabFragment.onNavigationEvent();
        Context contextRequireContext = globalBenefitTabFragment.requireContext();
        if (adMobFallback != null) {
            strOnExtraCallback = adMobFallback.onExtraCallback();
            int i2 = onMessageChannelReady + 87;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
        } else {
            strOnExtraCallback = null;
        }
        SessionTrackerb.onExtraCallbackWithResult(sessionTrackerbOnNavigationEvent, contextRequireContext, strOnExtraCallback, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onMessageChannelReady + 23;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final boolean IAuthTabCallback(GlobalBenefitTabFragment globalBenefitTabFragment, ShakeMonitorBridgeExtension$onExtraCallback shakeMonitorBridgeExtension$onExtraCallback) {
        int i = 2 % 2;
        int i2 = onMinimized + 85;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(shakeMonitorBridgeExtension$onExtraCallback, "");
        boolean zOnExtraCallback = globalBenefitTabFragment.access000().onExtraCallback(shakeMonitorBridgeExtension$onExtraCallback.asInterface(), shakeMonitorBridgeExtension$onExtraCallback.onExtraCallback());
        int i4 = onMessageChannelReady + 49;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return zOnExtraCallback;
    }

    static final /* synthetic */ class onTransact extends FunctionReferenceImpl implements Function1<CardsV2.PointBackInfo.ChanceExhaustedSheet, Unit> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        onTransact(Object obj) {
            super(1, obj, GlobalBenefitTabFragment.class, "showPointBackBottomSheet", "showPointBackBottomSheet(Lim/toss/features/benefit/dto/CardsV2$PointBackInfo$ChanceExhaustedSheet;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((CardsV2.PointBackInfo.ChanceExhaustedSheet) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onWarmupCompleted(CardsV2.PointBackInfo.ChanceExhaustedSheet chanceExhaustedSheet) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {(GlobalBenefitTabFragment) ((CallableReference) this).receiver, chanceExhaustedSheet};
            GlobalBenefitTabFragment.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), objArr, 772602672, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -772602671);
            int i4 = onExtraCallback + 99;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final /* synthetic */ class IAuthTabCallbackStub extends FunctionReferenceImpl implements setTaggedAddrCtrl<Float, Float, Integer, String, Unit> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        IAuthTabCallbackStub(Object obj) {
            super(4, obj, GlobalBenefitTabFragment.class, "showPointBackCoinAnimation", "showPointBackCoinAnimation(FFILjava/lang/String;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(((Number) obj).floatValue(), ((Number) obj2).floatValue(), ((Number) obj3).intValue(), (String) obj4);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            throw null;
        }

        public final void onExtraCallbackWithResult(float f, float f2, int i, String str) throws Throwable {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 15;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                GlobalBenefitTabFragment.onNavigationEvent((GlobalBenefitTabFragment) ((CallableReference) this).receiver, f, f2, i, str);
                throw null;
            }
            GlobalBenefitTabFragment.onNavigationEvent((GlobalBenefitTabFragment) ((CallableReference) this).receiver, f, f2, i, str);
            int i4 = onWarmupCompleted + 107;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit IAuthTabCallback(GlobalBenefitTabFragment globalBenefitTabFragment, ShakeMonitorBridgeExtension shakeMonitorBridgeExtension, CardsV2.PointBackInfo.BankCardCashBackBanner bankCardCashBackBanner) {
        int i = 2 % 2;
        int i2 = onMinimized + 27;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(shakeMonitorBridgeExtension, "");
        Intrinsics.checkNotNullParameter(bankCardCashBackBanner, "");
        TinyAppHostApduService1.onWarmupCompleted(TinyAppHostApduService1.onNavigationEvent, 5182446L, ChoosePhoneContactBridgeExtension1.onExtraCallbackWithResult.onNavigationEvent(shakeMonitorBridgeExtension, bankCardCashBackBanner), false, (Function1) null, 12, (Object) null);
        SessionTrackerb.onExtraCallbackWithResult(globalBenefitTabFragment.onNavigationEvent(), globalBenefitTabFragment.requireContext(), bankCardCashBackBanner.onExtraCallbackWithResult(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onMessageChannelReady + 15;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(GlobalBenefitTabFragment globalBenefitTabFragment, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 13;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        SessionTrackerb sessionTrackerbOnNavigationEvent = globalBenefitTabFragment.onNavigationEvent();
        Context contextRequireContext = globalBenefitTabFragment.requireContext();
        Uri uri = Uri.parse(str);
        Object[] objArr = new Object[1];
        a(new char[]{'!', 18, 19, 22, 13869, 13869, 18, '!'}, (byte) (69 - (ViewConfiguration.getPressedStateDuration() >> 16)), (Process.myPid() >> 22) + 8, objArr);
        SessionTrackerb.onExtraCallbackWithResult(sessionTrackerbOnNavigationEvent, contextRequireContext, filterCreatePageParams.onWarmupCompleted(uri, ((String) objArr[0]).intern(), "tab_benefit").toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onMessageChannelReady + 107;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        TinyAppHostApduService1 tinyAppHostApduService1 = TinyAppHostApduService1.onNavigationEvent;
        tinyAppHostApduService1.onExtraCallbackWithResult();
        extraCallback();
        tinyAppHostApduService1.onExtraCallbackWithResult(access100());
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        Object obj = null;
        this.IAuthTabCallback = new WorkflowUnit(lifecycle, access000(), (getPricingPhaseList) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this}, 960121980, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -960121960), new GlobalBenefitTabFragment$.ExternalSyntheticLambda22(this), new IAuthTabCallbackDefault(null), new GlobalBenefitTabFragment$.ExternalSyntheticLambda29(this));
        BenefitTabImpressionHandler benefitTabImpressionHandler = new BenefitTabImpressionHandler(access000(), (getPricingPhaseList) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this}, 960121980, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -960121960), 0.2f, new GlobalBenefitTabFragment$.ExternalSyntheticLambda30(this));
        this.asBinder = benefitTabImpressionHandler;
        this.IAuthTabCallbackStubProxy = new getSimOperator(benefitTabImpressionHandler, new GlobalBenefitTabFragment$.ExternalSyntheticLambda31(this), new GlobalBenefitTabFragment$.ExternalSyntheticLambda32(this), new GlobalBenefitTabFragment$.ExternalSyntheticLambda33(this), new GlobalBenefitTabFragment$.ExternalSyntheticLambda34(this), new GlobalBenefitTabFragment$.ExternalSyntheticLambda35(this), new GlobalBenefitTabFragment$.ExternalSyntheticLambda36(this), new GlobalBenefitTabFragment$.ExternalSyntheticLambda37(this), new GlobalBenefitTabFragment$.ExternalSyntheticLambda23(this), new GlobalBenefitTabFragment$.ExternalSyntheticLambda24(this), new GlobalBenefitTabFragment$.ExternalSyntheticLambda25(this), new GlobalBenefitTabFragment$.ExternalSyntheticLambda26(this), new onTransact(this), new GlobalBenefitTabFragment$.ExternalSyntheticLambda27(this), new IAuthTabCallbackStub(this), new GlobalBenefitTabFragment$.ExternalSyntheticLambda28(this));
        GlobalBenefitTabViewModel globalBenefitTabViewModelAccess000 = access000();
        getNameByImsi getnamebyimsi = this.IAuthTabCallbackStubProxy;
        if (getnamebyimsi == null) {
            int i2 = onMinimized + 1;
            onMessageChannelReady = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 != 0) {
                throw null;
            }
            getnamebyimsi = null;
        }
        globalBenefitTabViewModelAccess000.onExtraCallback(getnamebyimsi);
        int i4 = onMessageChannelReady + 93;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void ICustomTabsCallback() {
        FrameLayout frameLayoutIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onMinimized + 71;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            asInterface();
            throw null;
        }
        AddPhoneContactView addPhoneContactViewAsInterface = asInterface();
        if (addPhoneContactViewAsInterface == null || (frameLayoutIAuthTabCallback = addPhoneContactViewAsInterface.IAuthTabCallback()) == null) {
            return;
        }
        ViewCompat.onWarmupCompleted(frameLayoutIAuthTabCallback, new GlobalBenefitTabFragment$.ExternalSyntheticLambda0(this));
        int i3 = onMessageChannelReady + 99;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (r7 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
    
        if (r7 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0083, code lost:
    
        r7 = (android.widget.FrameLayout.LayoutParams) r7;
        r7.height = r3.onWarmupCompleted;
        r8.setLayoutParams(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0094, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final WindowInsetsCompat onWarmupCompleted(GlobalBenefitTabFragment globalBenefitTabFragment, View view, WindowInsetsCompat windowInsetsCompat) {
        ViewGroup.LayoutParams layoutParams;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        int iOnNavigationEvent = forceInnerPermissionCheck.onExtraCallbackWithResult.onNavigationEvent();
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompat.onWarmupCompleted(iOnNavigationEvent);
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
        view.setPadding(cameraControllerExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallbackWithResult, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback);
        AddPhoneContactView addPhoneContactViewAsInterface = globalBenefitTabFragment.asInterface();
        if (addPhoneContactViewAsInterface != null) {
            int i2 = onMinimized + 103;
            onMessageChannelReady = i2 % 128;
            if (i2 % 2 != 0) {
                View view2 = addPhoneContactViewAsInterface.onActivityResized;
                throw null;
            }
            View view3 = addPhoneContactViewAsInterface.onActivityResized;
            if (view3 != null) {
                int i3 = onMinimized + 1;
                onMessageChannelReady = i3 % 128;
                if (i3 % 2 != 0) {
                    view3.setBackgroundColor(globalBenefitTabFragment.asBinder());
                    view3.setVisibility(1);
                    view3.setTranslationY(-cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted);
                    view3.setElevation(0.0f);
                    view3.setTranslationZ(2.0f);
                    layoutParams = view3.getLayoutParams();
                } else {
                    view3.setBackgroundColor(globalBenefitTabFragment.asBinder());
                    view3.setVisibility(0);
                    view3.setTranslationY(-cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted);
                    view3.setElevation(0.0f);
                    view3.setTranslationZ(0.0f);
                    layoutParams = view3.getLayoutParams();
                }
            }
        }
        WindowInsetsCompat windowInsetsCompatOnExtraCallbackWithResult = new WindowInsetsCompat.onWarmupCompleted(windowInsetsCompat).onNavigationEvent(iOnNavigationEvent, CameraControllerExternalSyntheticLambda0.onNavigationEvent).onExtraCallbackWithResult();
        int i4 = onMessageChannelReady + 111;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return windowInsetsCompatOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        RVWebSocketManagerHolder rVWebSocketManagerHolder = (RVWebSocketManagerHolder) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rVWebSocketManagerHolder, "");
        if (rVWebSocketManagerHolder.onWarmupCompleted() != 103) {
            int i2 = onMinimized + 81;
            onMessageChannelReady = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = onMessageChannelReady + 47;
        int i5 = i4 % 128;
        onMinimized = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 113;
        onMessageChannelReady = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private static final boolean onNavigationEvent(Function1 function1, Object obj) {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 19;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
            int i3 = 84 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        }
        int i4 = onMinimized + 97;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 105;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onMessageChannelReady + 25;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Resources.NotFoundException {
        TdsRecyclerView tdsRecyclerView;
        TdsRecyclerView tdsRecyclerView2;
        GlobalBenefitTabFragment globalBenefitTabFragment = (GlobalBenefitTabFragment) objArr[0];
        int i = 2 % 2;
        AddPhoneContactView addPhoneContactViewAsInterface = globalBenefitTabFragment.asInterface();
        if (addPhoneContactViewAsInterface != null && (tdsRecyclerView = addPhoneContactViewAsInterface.onActivityLayout) != null) {
            tdsRecyclerView.setLayoutManager(new BenefitTabLinearLayoutManager(globalBenefitTabFragment.requireContext(), 0.0f, 2, (DefaultConstructorMarker) null));
            RecyclerView.Adapter adapter = globalBenefitTabFragment.IAuthTabCallbackStubProxy;
            if (adapter == null) {
                int i2 = onMinimized + 99;
                onMessageChannelReady = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i3 = 12 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                adapter = null;
            }
            tdsRecyclerView.setAdapter(adapter);
            tdsRecyclerView.setItemViewCacheSize(25);
            tdsRecyclerView.setPadding(tdsRecyclerView.getPaddingLeft(), (int) (tdsRecyclerView.getResources().getDisplayMetrics().density * 56.0f), tdsRecyclerView.getPaddingRight(), (int) tdsRecyclerView.getResources().getDimension(im.toss.tds.view.R.dimen.list_row_padding_bottom_24));
            ExoPlayerImplExternalSyntheticLambda31 exoPlayerImplExternalSyntheticLambda31 = globalBenefitTabFragment.IAuthTabCallbackStubProxy;
            if (exoPlayerImplExternalSyntheticLambda31 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                exoPlayerImplExternalSyntheticLambda31 = null;
            }
            exoPlayerImplExternalSyntheticLambda31.onNavigationEvent(CollectionsKt.listOf(SensorBridgeExtension2.IAuthTabCallback));
            BenefitTabImpressionHandler benefitTabImpressionHandler = globalBenefitTabFragment.asBinder;
            if (benefitTabImpressionHandler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                benefitTabImpressionHandler = null;
            }
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = globalBenefitTabFragment.writeTypedObject;
            if (textFieldScrollKtExternalSyntheticLambda0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                textFieldScrollKtExternalSyntheticLambda0 = null;
            }
            AddPhoneContactView addPhoneContactViewAsInterface2 = globalBenefitTabFragment.asInterface();
            if (addPhoneContactViewAsInterface2 != null) {
                tdsRecyclerView2 = addPhoneContactViewAsInterface2.onActivityLayout;
            } else {
                int i4 = onMinimized + 67;
                onMessageChannelReady = i4 % 128;
                int i5 = i4 % 2;
                tdsRecyclerView2 = null;
            }
            benefitTabImpressionHandler.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0, (RecyclerView) tdsRecyclerView2);
        }
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = getIconPaddingLeft.IAuthTabCallback.onWarmupCompleted().onExtraCallback(RVWebSocketManagerHolder.class).onWarmupCompleted(new GlobalBenefitTabFragment$.ExternalSyntheticLambda39(new GlobalBenefitTabFragment$.ExternalSyntheticLambda38()));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted2 = jsonReaderUnknownNumberParsingOnWarmupCompleted.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted2, "");
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = jsonReaderUnknownNumberParsingOnWarmupCompleted2.IAuthTabCallback(new GlobalBenefitTabFragment$.ExternalSyntheticLambda41(new GlobalBenefitTabFragment$.ExternalSyntheticLambda40(globalBenefitTabFragment)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        globalBenefitTabFragment.autoDisposable(deserializeurinullablecollectionIAuthTabCallback);
        int i6 = onMinimized + 101;
        onMessageChannelReady = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    private static final Unit onNavigationEvent(GlobalBenefitTabFragment globalBenefitTabFragment, RVWebSocketManagerHolder rVWebSocketManagerHolder) {
        int i = 2 % 2;
        AddPhoneContactView addPhoneContactViewAsInterface = globalBenefitTabFragment.asInterface();
        if (addPhoneContactViewAsInterface != null) {
            int i2 = onMessageChannelReady + 5;
            onMinimized = i2 % 128;
            if (i2 % 2 != 0) {
                TdsRecyclerView tdsRecyclerView = addPhoneContactViewAsInterface.onActivityLayout;
                if (tdsRecyclerView != null) {
                    tdsRecyclerView.smoothScrollToPosition(0);
                }
            } else {
                TdsRecyclerView tdsRecyclerView2 = addPhoneContactViewAsInterface.onActivityLayout;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onMessageChannelReady + 49;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = GlobalBenefitTabFragment.this.new onNavigationEvent(access13800Var);
            int i2 = onExtraCallback + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 39;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 41;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onExtraCallback + 37;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                WorkflowUnit workflowUnitOnWarmupCompleted = GlobalBenefitTabFragment.onWarmupCompleted(GlobalBenefitTabFragment.this);
                if (workflowUnitOnWarmupCompleted == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    workflowUnitOnWarmupCompleted = null;
                }
                FragmentActivity fragmentActivityRequireActivity = GlobalBenefitTabFragment.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                this.label = 1;
                if (workflowUnitOnWarmupCompleted.IAuthTabCallback(fragmentActivityRequireActivity, this) == objOnWarmupCompleted) {
                    int i7 = onExtraCallback + 21;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onExtraCallbackWithResult(GlobalBenefitTabFragment globalBenefitTabFragment, NativeAd nativeAd) {
        int i = 2 % 2;
        int i2 = onMinimized + 83;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            globalBenefitTabFragment.onUnminimized();
            int i3 = 75 / 0;
            return Unit.INSTANCE;
        }
        globalBenefitTabFragment.onUnminimized();
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new onNavigationEvent(null), 2, (Object) null);
        TextFieldKeyInputExternalSyntheticLambda7.onExtraCallback(access000().onNavigationEvent(), (CoroutineContext) null, 0L, 3, (Object) null).observe(getViewLifecycleOwner(), new IAuthTabCallback_Parcel(new GlobalBenefitTabFragment$.ExternalSyntheticLambda4(this)));
        TextFieldKeyInputExternalSyntheticLambda7.onExtraCallback(access000().onTransact(), (CoroutineContext) null, 0L, 3, (Object) null).observe(getViewLifecycleOwner(), new IAuthTabCallback_Parcel(new GlobalBenefitTabFragment$.ExternalSyntheticLambda5(this)));
        int i2 = onMessageChannelReady + 105;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        GlobalBenefitTabFragment globalBenefitTabFragment = (GlobalBenefitTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 57;
        onMinimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{globalBenefitTabFragment}, -919740304, iOnNavigationEvent2, 919740304);
            Unit unit = Unit.INSTANCE;
            int i3 = onMinimized + 113;
            onMessageChannelReady = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent4 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent3, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{globalBenefitTabFragment}, -919740304, iOnNavigationEvent4, 919740304);
        Unit unit2 = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onUnminimized() {
        boolean z;
        int size;
        int i = 2 % 2;
        GlobalBenefitTabViewModel.onWarmupCompleted onwarmupcompleted = (GlobalBenefitTabViewModel.onWarmupCompleted) access000().getInterfaceDescriptor().IAuthTabCallback();
        if (onwarmupcompleted == null) {
            return;
        }
        int i2 = 0;
        if (onwarmupcompleted.onExtraCallbackWithResult() != null) {
            int i3 = onMinimized + 5;
            onMessageChannelReady = i3 % 128;
            z = i3 % 2 == 0;
        }
        NativeAd nativeAd = (NativeAd) access000().onNavigationEvent().IAuthTabCallback();
        exitAllPages exitallpages = this.IAuthTabCallbackStubProxy;
        BenefitTabImpressionHandler benefitTabImpressionHandler = null;
        if (exitallpages == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            exitallpages = null;
        }
        List<? extends SensorBridgeExtension3> mutableList = CollectionsKt.toMutableList(exitallpages.onExtraCallbackWithResult());
        Iterator<? extends SensorBridgeExtension3> it = mutableList.iterator();
        int i4 = onMinimized + 123;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (!(!(it.next() instanceof startDeviceMotionListening))) {
                break;
            } else {
                i2++;
            }
        }
        if (nativeAd == null) {
            int i6 = onMinimized + 119;
            int i7 = i6 % 128;
            onMessageChannelReady = i7;
            int i8 = i6 % 2;
            if (i2 != -1) {
                int i9 = i7 + 101;
                onMinimized = i9 % 128;
                int i10 = i9 % 2;
                mutableList.remove(i2);
            }
            onNavigationEvent(mutableList);
            return;
        }
        if (i2 != -1) {
            int i11 = onMessageChannelReady + 3;
            onMinimized = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            size = i2;
        } else {
            size = mutableList.size();
        }
        startDeviceMotionListening startdevicemotionlistening = new startDeviceMotionListening(nativeAd, z);
        if (i2 != -1) {
            mutableList.set(i2, startdevicemotionlistening);
        } else {
            mutableList.add(size, startdevicemotionlistening);
        }
        onNavigationEvent(mutableList);
        BenefitTabImpressionHandler benefitTabImpressionHandler2 = this.asBinder;
        if (benefitTabImpressionHandler2 == null) {
            int i12 = onMessageChannelReady + 33;
            onMinimized = i12 % 128;
            int i13 = i12 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i13 == 0) {
                throw null;
            }
        } else {
            benefitTabImpressionHandler = benefitTabImpressionHandler2;
        }
        benefitTabImpressionHandler.IAuthTabCallback("thumbnail admob notify");
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 0;
        GlobalBenefitTabFragment globalBenefitTabFragment = (GlobalBenefitTabFragment) objArr[0];
        int i2 = 2 % 2;
        int i3 = onMessageChannelReady + 73;
        onMinimized = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            getSimOperator getsimoperator = globalBenefitTabFragment.IAuthTabCallbackStubProxy;
            obj.hashCode();
            throw null;
        }
        BasicSystemInfoExtension basicSystemInfoExtension = (BasicSystemInfoExtension) globalBenefitTabFragment.access000().onTransact().IAuthTabCallback();
        exitAllPages exitallpages = globalBenefitTabFragment.IAuthTabCallbackStubProxy;
        if (exitallpages == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            exitallpages = null;
        }
        List<? extends SensorBridgeExtension3> mutableList = CollectionsKt.toMutableList(exitallpages.onExtraCallbackWithResult());
        Iterator<? extends SensorBridgeExtension3> it = mutableList.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next() instanceof handleThread) {
                break;
            }
            int i4 = onMessageChannelReady + 99;
            onMinimized = i4 % 128;
            i = i4 % 2 == 0 ? i + 94 : i + 1;
        }
        if (i == -1) {
            return null;
        }
        mutableList.set(i, basicSystemInfoExtension == null ? getAppBaseInfo.onExtraCallbackWithResult : new BasicSystemInfoExtension(basicSystemInfoExtension.IAuthTabCallback(), basicSystemInfoExtension.onExtraCallbackWithResult()));
        globalBenefitTabFragment.onNavigationEvent(mutableList);
        BenefitTabImpressionHandler benefitTabImpressionHandler = globalBenefitTabFragment.asBinder;
        if (benefitTabImpressionHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = onMinimized + 51;
            onMessageChannelReady = i5 % 128;
            int i6 = i5 % 2;
            benefitTabImpressionHandler = null;
        }
        benefitTabImpressionHandler.IAuthTabCallback("list admob notify");
        int i7 = onMessageChannelReady + 95;
        onMinimized = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = onMinimized + 59;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            ICustomTabsCallback();
            extraCallbackWithResult();
            int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this}, -1366664912, iOnNavigationEvent2, 1366664915);
            writeTypedObject();
            onRelationshipValidationResult();
            IAuthTabCallbackStubProxy();
            return;
        }
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        ICustomTabsCallback();
        extraCallbackWithResult();
        int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent4 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent3, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this}, -1366664912, iOnNavigationEvent4, 1366664915);
        writeTypedObject();
        onRelationshipValidationResult();
        IAuthTabCallbackStubProxy();
        int i3 = 88 / 0;
    }

    private final void extraCallback() {
        int i = 2 % 2;
        removeTaskIdOnSocketError parentFragment = getParentFragment();
        Intrinsics.checkNotNull(parentFragment, "");
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnNavigationEvent = parentFragment.onNavigationEvent(this, 103);
        textFieldScrollKtExternalSyntheticLambda0OnNavigationEvent.getLifecycle().IAuthTabCallback(new DefaultLifecycleObserver() { // from class: im.toss.features.benefit.ui.GlobalBenefitTabFragment$initLifecycle$1$1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 105;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
                int i5 = onExtraCallback + 33;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }

            public /* bridge */ void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 61;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                super.onDestroy(textFieldScrollKtExternalSyntheticLambda0);
                int i5 = onExtraCallback + 123;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            public /* bridge */ void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 65;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                super.onPause(textFieldScrollKtExternalSyntheticLambda0);
                int i5 = IAuthTabCallback + 43;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            public /* bridge */ void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 85;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                super.onResume(textFieldScrollKtExternalSyntheticLambda0);
                if (i4 != 0) {
                    int i5 = 94 / 0;
                }
                int i6 = IAuthTabCallback + 11;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 25;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                TinyAppHostApduService1.onNavigationEvent.onExtraCallbackWithResult(GlobalBenefitTabFragment.IAuthTabCallbackStub(this.onExtraCallbackWithResult));
                GlobalBenefitTabFragment.IAuthTabCallback_Parcel(this.onExtraCallbackWithResult).onActivityResized();
                GlobalBenefitTabFragment globalBenefitTabFragment = this.onExtraCallbackWithResult;
                GlobalBenefitTabFragment.onNavigationEvent(globalBenefitTabFragment, GlobalBenefitTabFragment.IAuthTabCallbackStubProxy(globalBenefitTabFragment).getAndSet(false));
                int i5 = onExtraCallback + 123;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 39 / 0;
                }
            }

            public void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                NativeAd nativeAdIAuthTabCallback;
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 97;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                GlobalBenefitTabViewModel.onExtraCallbackWithResult(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 1563618186, a.3.onWarmupCompleted(), new Object[]{GlobalBenefitTabFragment.IAuthTabCallback_Parcel(this.onExtraCallbackWithResult)}, -1563618175, a.3.onWarmupCompleted());
                WorkflowUnit workflowUnitOnWarmupCompleted = GlobalBenefitTabFragment.onWarmupCompleted(this.onExtraCallbackWithResult);
                if (workflowUnitOnWarmupCompleted == null) {
                    int i5 = onExtraCallback + 7;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    workflowUnitOnWarmupCompleted = null;
                }
                workflowUnitOnWarmupCompleted.IAuthTabCallbackDefault();
                WorkflowUnit workflowUnitOnWarmupCompleted2 = GlobalBenefitTabFragment.onWarmupCompleted(this.onExtraCallbackWithResult);
                if (workflowUnitOnWarmupCompleted2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    workflowUnitOnWarmupCompleted2 = null;
                }
                workflowUnitOnWarmupCompleted2.asInterface();
                getNameByImsi getnamebyimsi = (getSimOperator) GlobalBenefitTabFragment.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this.onExtraCallbackWithResult}, 914143253, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -914143246);
                if (getnamebyimsi == null) {
                    int i6 = onExtraCallback + 125;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    getnamebyimsi = null;
                }
                ThumbnailAdMobController thumbnailAdMobControllerOnNavigationEvent = getnamebyimsi.onNavigationEvent();
                if (thumbnailAdMobControllerOnNavigationEvent != null) {
                    thumbnailAdMobControllerOnNavigationEvent.IAuthTabCallback();
                }
                NativeAd nativeAd = (NativeAd) GlobalBenefitTabFragment.IAuthTabCallback_Parcel(this.onExtraCallbackWithResult).onNavigationEvent().IAuthTabCallback();
                if (nativeAd != null) {
                    nativeAd.destroy();
                }
                GlobalBenefitTabFragment.IAuthTabCallback_Parcel(this.onExtraCallbackWithResult).onNavigationEvent().onWarmupCompleted((Object) null);
                BasicSystemInfoExtension basicSystemInfoExtension = (BasicSystemInfoExtension) GlobalBenefitTabFragment.IAuthTabCallback_Parcel(this.onExtraCallbackWithResult).onTransact().IAuthTabCallback();
                if (basicSystemInfoExtension != null && (nativeAdIAuthTabCallback = basicSystemInfoExtension.IAuthTabCallback()) != null) {
                    nativeAdIAuthTabCallback.destroy();
                    int i8 = IAuthTabCallback + 109;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                }
                GlobalBenefitTabFragment.IAuthTabCallback_Parcel(this.onExtraCallbackWithResult).onTransact().onWarmupCompleted((Object) null);
            }
        });
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnNavigationEvent), (CoroutineContext) null, (setRandomHost) null, new asInterface(textFieldScrollKtExternalSyntheticLambda0OnNavigationEvent, this, (access13800) null), 3, (Object) null);
        this.writeTypedObject = textFieldScrollKtExternalSyntheticLambda0OnNavigationEvent;
        int i2 = onMessageChannelReady + 3;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit IAuthTabCallback(GlobalBenefitTabFragment globalBenefitTabFragment, ContactAccount.onExtraCallbackWithResult onextracallbackwithresult) throws NoWhenBranchMatchedException {
        int i;
        int i2;
        int i3;
        ViewAnimator viewAnimator;
        ViewAnimator viewAnimator2;
        int i4 = 2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = globalBenefitTabFragment.getInterfaceDescriptor;
        Objects.toString(onextracallbackwithresult);
        if (onextracallbackwithresult == null) {
            int i5 = onMinimized + 89;
            onMessageChannelReady = i5 % 128;
            i = -1;
            if (i5 % 2 != 0) {
                int i6 = 83 / 0;
            }
        } else {
            i = onWarmupCompleted.onWarmupCompleted[onextracallbackwithresult.ordinal()];
        }
        getNameByImsi getnamebyimsi = null;
        if (i != 1) {
            int i7 = onMessageChannelReady;
            int i8 = i7 + 69;
            int i9 = i8 % 128;
            onMinimized = i9;
            int i10 = i8 % 2;
            if (i == 2) {
                getNameByImsi getnamebyimsi2 = globalBenefitTabFragment.IAuthTabCallbackStubProxy;
                if (getnamebyimsi2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    getnamebyimsi = getnamebyimsi2;
                }
                ThumbnailAdMobController thumbnailAdMobControllerOnNavigationEvent = getnamebyimsi.onNavigationEvent();
                if (thumbnailAdMobControllerOnNavigationEvent != null) {
                    int i11 = onMessageChannelReady + 21;
                    onMinimized = i11 % 128;
                    if (i11 % 2 == 0) {
                        thumbnailAdMobControllerOnNavigationEvent.setContentLoadState(false);
                    } else {
                        thumbnailAdMobControllerOnNavigationEvent.setContentLoadState(true);
                    }
                }
                globalBenefitTabFragment.onExtraCallbackWithResult(false);
                globalBenefitTabFragment.ICustomTabsCallbackStubProxy();
                AddPhoneContactView addPhoneContactViewAsInterface = globalBenefitTabFragment.asInterface();
                if (addPhoneContactViewAsInterface != null && (viewAnimator = addPhoneContactViewAsInterface.onRelationshipValidationResult) != null) {
                    viewAnimator.setDisplayedChild(2);
                }
            } else if (i == 3) {
                getNameByImsi getnamebyimsi3 = globalBenefitTabFragment.IAuthTabCallbackStubProxy;
                if (getnamebyimsi3 == null) {
                    int i12 = i7 + 75;
                    onMinimized = i12 % 128;
                    if (i12 % 2 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        getnamebyimsi.hashCode();
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    getnamebyimsi3 = null;
                }
                ThumbnailAdMobController thumbnailAdMobControllerOnNavigationEvent2 = getnamebyimsi3.onNavigationEvent();
                if (thumbnailAdMobControllerOnNavigationEvent2 != null) {
                    int i13 = onMinimized + 1;
                    onMessageChannelReady = i13 % 128;
                    int i14 = i13 % 2;
                    thumbnailAdMobControllerOnNavigationEvent2.setContentLoadState(false);
                }
                globalBenefitTabFragment.onExtraCallbackWithResult(true);
                globalBenefitTabFragment.ICustomTabsCallbackStubProxy();
                AddPhoneContactView addPhoneContactViewAsInterface2 = globalBenefitTabFragment.asInterface();
                if (addPhoneContactViewAsInterface2 != null) {
                    int i15 = onMessageChannelReady + 49;
                    onMinimized = i15 % 128;
                    if (i15 % 2 == 0) {
                        ViewAnimator viewAnimator3 = addPhoneContactViewAsInterface2.onRelationshipValidationResult;
                        throw null;
                    }
                    ViewAnimator viewAnimator4 = addPhoneContactViewAsInterface2.onRelationshipValidationResult;
                    if (viewAnimator4 != null) {
                        viewAnimator4.setDisplayedChild(0);
                    }
                }
            } else if (i == 4) {
                getNameByImsi getnamebyimsi4 = globalBenefitTabFragment.IAuthTabCallbackStubProxy;
                if (getnamebyimsi4 == null) {
                    int i16 = i9 + 115;
                    onMessageChannelReady = i16 % 128;
                    if (i16 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i17 = 63 / 0;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                } else {
                    getnamebyimsi = getnamebyimsi4;
                }
                ThumbnailAdMobController thumbnailAdMobControllerOnNavigationEvent3 = getnamebyimsi.onNavigationEvent();
                if (thumbnailAdMobControllerOnNavigationEvent3 != null) {
                    thumbnailAdMobControllerOnNavigationEvent3.setContentLoadState(false);
                }
                globalBenefitTabFragment.onExtraCallbackWithResult(false);
                onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{globalBenefitTabFragment, false}, 1623320298, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -1623320270);
                globalBenefitTabFragment.ICustomTabsCallbackStubProxy();
                AddPhoneContactView addPhoneContactViewAsInterface3 = globalBenefitTabFragment.asInterface();
                if (addPhoneContactViewAsInterface3 != null && (viewAnimator2 = addPhoneContactViewAsInterface3.onRelationshipValidationResult) != null) {
                    viewAnimator2.setDisplayedChild(1);
                    i2 = onMinimized + 99;
                    i3 = i2 % 128;
                    onMessageChannelReady = i3;
                    int i18 = i2 % 2;
                }
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                getNameByImsi getnamebyimsi5 = globalBenefitTabFragment.IAuthTabCallbackStubProxy;
                if (getnamebyimsi5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    getnamebyimsi = getnamebyimsi5;
                }
                ThumbnailAdMobController thumbnailAdMobControllerOnNavigationEvent4 = getnamebyimsi.onNavigationEvent();
                if (thumbnailAdMobControllerOnNavigationEvent4 != null) {
                    thumbnailAdMobControllerOnNavigationEvent4.setContentLoadState(false);
                }
            }
        } else {
            getNameByImsi getnamebyimsi6 = globalBenefitTabFragment.IAuthTabCallbackStubProxy;
            if (getnamebyimsi6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                getnamebyimsi = getnamebyimsi6;
            }
            ThumbnailAdMobController thumbnailAdMobControllerOnNavigationEvent5 = getnamebyimsi.onNavigationEvent();
            if (thumbnailAdMobControllerOnNavigationEvent5 != null) {
                int i19 = onMessageChannelReady + 33;
                onMinimized = i19 % 128;
                int i20 = i19 % 2;
                thumbnailAdMobControllerOnNavigationEvent5.setContentLoadState(true);
                i2 = onMinimized + 81;
                i3 = i2 % 128;
                onMessageChannelReady = i3;
                int i182 = i2 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Cards $cards;
        final /* synthetic */ GlobalBenefitTabViewModel.onWarmupCompleted $content;
        final /* synthetic */ GlobalBenefitTabViewModel.onExtraCallbackWithResult $videoAds;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access100(GlobalBenefitTabViewModel.onExtraCallbackWithResult onextracallbackwithresult, GlobalBenefitTabViewModel.onWarmupCompleted onwarmupcompleted, Cards cards, access13800<? super access100> access13800Var) {
            super(2, access13800Var);
            this.$videoAds = onextracallbackwithresult;
            this.$content = onwarmupcompleted;
            this.$cards = cards;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            access100 access100VarCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                access100VarCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = access100VarCreate.invokeSuspend(unit);
            int i4 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access100 access100Var = GlobalBenefitTabFragment.this.new access100(this.$videoAds, this.$content, this.$cards, access13800Var);
            int i2 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return access100Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            GlobalBenefitTabViewModel.onExtraCallbackWithResult.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted;
            FrameLayout frameLayoutIAuthTabCallback;
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            ArrayList arrayList = new ArrayList();
            AddPhoneContactView addPhoneContactViewAsBinder = GlobalBenefitTabFragment.asBinder(GlobalBenefitTabFragment.this);
            if (addPhoneContactViewAsBinder != null && (frameLayoutIAuthTabCallback = addPhoneContactViewAsBinder.IAuthTabCallback()) != null) {
                int i2 = onExtraCallbackWithResult + 61;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                frameLayoutIAuthTabCallback.setBackgroundColor(accessgetProtocolp.onNavigationEvent(GlobalBenefitTabFragment.this).onWarmupCompleted());
            }
            GlobalBenefitTabViewModel.onExtraCallbackWithResult onextracallbackwithresult = this.$videoAds;
            BenefitTabImpressionHandler benefitTabImpressionHandler = null;
            if (onextracallbackwithresult != null) {
                iAuthTabCallbackOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted();
                int i4 = onExtraCallbackWithResult + 25;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 3 % 4;
                }
            } else {
                iAuthTabCallbackOnWarmupCompleted = null;
            }
            int i6 = iAuthTabCallbackOnWarmupCompleted == null ? -1 : onExtraCallback.onExtraCallback[iAuthTabCallbackOnWarmupCompleted.ordinal()];
            if (i6 == 1) {
                arrayList.add(getAppBaseInfo.onExtraCallbackWithResult);
            } else if (i6 != 2) {
                if (i6 != 3) {
                    int i7 = onExtraCallbackWithResult + 67;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        benefitTabImpressionHandler.hashCode();
                        throw null;
                    }
                    BasicSystemInfoExtension basicSystemInfoExtension = (BasicSystemInfoExtension) GlobalBenefitTabFragment.IAuthTabCallback_Parcel(GlobalBenefitTabFragment.this).onTransact().IAuthTabCallback();
                    if (basicSystemInfoExtension != null) {
                        arrayList.add(new BasicSystemInfoExtension(basicSystemInfoExtension.IAuthTabCallback(), basicSystemInfoExtension.onExtraCallbackWithResult()));
                    } else {
                        arrayList.add(getAppBaseInfo.onExtraCallbackWithResult);
                        int i8 = onExtraCallbackWithResult + 89;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                    }
                } else {
                    NativeAd nativeAdOnExtraCallbackWithResult = this.$videoAds.onExtraCallbackWithResult();
                    if (nativeAdOnExtraCallbackWithResult != null) {
                        arrayList.add(new BasicSystemInfoExtension(nativeAdOnExtraCallbackWithResult, this.$videoAds.IAuthTabCallback()));
                    }
                }
            } else if (this.$content.asBinder()) {
                arrayList.add(getAppBaseInfo.onExtraCallbackWithResult);
            } else {
                arrayList.add(new handleNoThread(this.$content.onWarmupCompleted()));
            }
            unregisterInternal unregisterinternalOnExtraCallbackWithResult = this.$content.onExtraCallbackWithResult();
            arrayList.add(new SensorBridgeExtension5(10));
            if (unregisterinternalOnExtraCallbackWithResult != null) {
                GlobalBenefitTabFragment globalBenefitTabFragment = GlobalBenefitTabFragment.this;
                Long lOnNavigationEvent = this.$content.onNavigationEvent();
                GlobalBenefitTabFragment.onWarmupCompleted(globalBenefitTabFragment, lOnNavigationEvent != null ? lOnNavigationEvent.longValue() : 0L, unregisterinternalOnExtraCallbackWithResult.onExtraCallback(), false);
                GlobalBenefitTabFragment.IAuthTabCallback(GlobalBenefitTabFragment.this, arrayList, unregisterinternalOnExtraCallbackWithResult.onNavigationEvent());
            } else {
                GlobalBenefitTabFragment.onWarmupCompleted(GlobalBenefitTabFragment.this, this.$cards.IAuthTabCallbackStub(), ((List) Cards.onExtraCallbackWithResult(new Object[]{this.$cards}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1005988360, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1005988360)).size(), true);
                GlobalBenefitTabFragment.onWarmupCompleted(GlobalBenefitTabFragment.this, this.$cards, arrayList);
            }
            NativeAd nativeAd = (NativeAd) GlobalBenefitTabFragment.IAuthTabCallback_Parcel(GlobalBenefitTabFragment.this).onNavigationEvent().IAuthTabCallback();
            if (nativeAd != null) {
                arrayList.add(new startDeviceMotionListening(nativeAd, unregisterinternalOnExtraCallbackWithResult != null));
            }
            GlobalBenefitTabFragment.onExtraCallback(GlobalBenefitTabFragment.this, arrayList);
            BenefitTabImpressionHandler benefitTabImpressionHandlerOnTransact = GlobalBenefitTabFragment.onTransact(GlobalBenefitTabFragment.this);
            if (benefitTabImpressionHandlerOnTransact == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                benefitTabImpressionHandler = benefitTabImpressionHandlerOnTransact;
            }
            BenefitTabImpressionHandler.onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1131723474, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1131723464, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), new Object[]{benefitTabImpressionHandler, "listContentFlow"});
            GlobalBenefitTabFragment.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{GlobalBenefitTabFragment.this, false}, -1268675700, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 1268675702);
            return Unit.INSTANCE;
        }
    }

    private static final Unit onExtraCallback(GlobalBenefitTabFragment globalBenefitTabFragment, GlobalBenefitTabViewModel.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        Cards cardsIAuthTabCallback = onwarmupcompleted.IAuthTabCallback();
        GlobalBenefitTabViewModel.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = onwarmupcompleted.onExtraCallback();
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = globalBenefitTabFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, globalBenefitTabFragment.new access100(onextracallbackwithresultOnExtraCallback, onwarmupcompleted, cardsIAuthTabCallback, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onMessageChannelReady + 41;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private final void onRelationshipValidationResult() {
        int i = 2 % 2;
        TextFieldKeyInputExternalSyntheticLambda7.onExtraCallback(access000().onExtraCallbackWithResult(), (CoroutineContext) null, 0L, 3, (Object) null).observe(getViewLifecycleOwner(), new IAuthTabCallback_Parcel(new GlobalBenefitTabFragment$.ExternalSyntheticLambda6(this)));
        TextFieldKeyInputExternalSyntheticLambda7.onExtraCallback(ycxycx.onExtraCallbackWithResult(access000().access000()), (CoroutineContext) null, 0L, 3, (Object) null).observe(getViewLifecycleOwner(), new IAuthTabCallback_Parcel(new GlobalBenefitTabFragment$.ExternalSyntheticLambda7(this)));
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStubProxy(this, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new access000(this, (access13800) null), 3, (Object) null);
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new getInterfaceDescriptor(this, (access13800) null), 3, (Object) null);
        int i2 = onMessageChannelReady + 25;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 64 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Map onNavigationEvent(CardsV2.BenefitMissionInfo benefitMissionInfo) throws Throwable {
        String strIAuthTabCallbackDefault;
        Integer num;
        Integer numValueOf;
        int i = 2 % 2;
        Map mapOnExtraCallback = access8100.onExtraCallback();
        Integer numValueOf2 = null;
        if (benefitMissionInfo != null) {
            int i2 = onMinimized + 117;
            onMessageChannelReady = i2 % 128;
            int i3 = i2 % 2;
            strIAuthTabCallbackDefault = benefitMissionInfo.IAuthTabCallbackDefault();
        } else {
            strIAuthTabCallbackDefault = null;
        }
        mapOnExtraCallback.put("submission_code", strIAuthTabCallbackDefault);
        if (benefitMissionInfo != null) {
            int i4 = onMinimized + 1;
            onMessageChannelReady = i4 % 128;
            int i5 = i4 % 2;
            CardsV2.CustomParameter customParameter = (CardsV2.CustomParameter) CardsV2.BenefitMissionInfo.onNavigationEvent(MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), new Object[]{benefitMissionInfo}, MaxNativeAdListener.onExtraCallbackWithResult(), 803572547, MaxNativeAdListener.onExtraCallbackWithResult(), -803572547);
            if (customParameter != null) {
                int i6 = onMinimized + 49;
                onMessageChannelReady = i6 % 128;
                int i7 = i6 % 2;
                num = (Integer) CardsV2.CustomParameter.IAuthTabCallback(-214511220, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), new Object[]{customParameter}, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), 214511221);
            } else {
                int i8 = onMinimized + 111;
                onMessageChannelReady = i8 % 128;
                int i9 = i8 % 2;
                num = null;
            }
        }
        mapOnExtraCallback.put("streak_day_cnt", num);
        mapOnExtraCallback.put("cluster", benefitMissionInfo != null ? benefitMissionInfo.onExtraCallbackWithResult() : null);
        String strAsBinder = benefitMissionInfo != null ? benefitMissionInfo.asBinder() : null;
        Object[] objArr = new Object[1];
        a(new char[]{11, 15, 13904, 13904, 25, 27, 4, 24, 22, 26, 3, 20}, (byte) (Color.alpha(0) + 98), 12 - ExpandableListView.getPackedPositionGroup(0L), objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), strAsBinder);
        if ((benefitMissionInfo != null ? benefitMissionInfo.IAuthTabCallbackStubProxy() : null) == CardsV2.BenefitMissionInfo.onExtraCallbackWithResult.VISIT) {
            int i10 = onMessageChannelReady + 81;
            onMinimized = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            CardsV2.CustomParameter customParameter2 = (CardsV2.CustomParameter) CardsV2.BenefitMissionInfo.onNavigationEvent(MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), new Object[]{benefitMissionInfo}, MaxNativeAdListener.onExtraCallbackWithResult(), 803572547, MaxNativeAdListener.onExtraCallbackWithResult(), -803572547);
            if (customParameter2 != null) {
                int i11 = onMinimized + 35;
                onMessageChannelReady = i11 % 128;
                int i12 = i11 % 2;
                numValueOf = Integer.valueOf(((Integer) CardsV2.CustomParameter.IAuthTabCallback(-1696071477, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), new Object[]{customParameter2}, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), 1696071477)).intValue());
                int i13 = onMessageChannelReady + 27;
                onMinimized = i13 % 128;
                int i14 = i13 % 2;
            } else {
                numValueOf = null;
            }
            mapOnExtraCallback.put("target_cnt", numValueOf);
            CardsV2.CustomParameter customParameter3 = (CardsV2.CustomParameter) CardsV2.BenefitMissionInfo.onNavigationEvent(MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), new Object[]{benefitMissionInfo}, MaxNativeAdListener.onExtraCallbackWithResult(), 803572547, MaxNativeAdListener.onExtraCallbackWithResult(), -803572547);
            if (customParameter3 != null) {
                int i15 = onMinimized + 119;
                onMessageChannelReady = i15 % 128;
                if (i15 % 2 != 0) {
                    numValueOf2 = Integer.valueOf(customParameter3.onExtraCallbackWithResult());
                    int i16 = 51 / 0;
                } else {
                    numValueOf2 = Integer.valueOf(customParameter3.onExtraCallbackWithResult());
                }
            }
            mapOnExtraCallback.put("used_cnt", numValueOf2);
        }
        return access8100.onExtraCallbackWithResult(mapOnExtraCallback);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        SensorBridgeExtension4 sensorBridgeExtension4;
        String interfaceDescriptor;
        GlobalBenefitTabFragment globalBenefitTabFragment = (GlobalBenefitTabFragment) objArr[0];
        List list = (List) objArr[1];
        List list2 = (List) objArr[2];
        int i = 2 % 2;
        Iterator it = list2.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                return null;
            }
            Object next = it.next();
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            registerInternal.onNavigationEvent onnavigationevent = (registerInternal) next;
            if (!(!(onnavigationevent instanceof registerInternal.onExtraCallbackWithResult))) {
                registerInternal.onExtraCallbackWithResult onextracallbackwithresult = (registerInternal.onExtraCallbackWithResult) onnavigationevent;
                CardsV2.BenefitMissionInfo benefitMissionInfoOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallback().onExtraCallbackWithResult();
                CardsV2.Slot slotIAuthTabCallbackDefault = onextracallbackwithresult.onExtraCallback().IAuthTabCallbackDefault();
                if (slotIAuthTabCallbackDefault != null) {
                    int i3 = onMinimized + 49;
                    onMessageChannelReady = i3 % 128;
                    int i4 = i3 % 2;
                    if ((benefitMissionInfoOnExtraCallbackWithResult != null ? benefitMissionInfoOnExtraCallbackWithResult.IAuthTabCallbackStubProxy() : null) == CardsV2.BenefitMissionInfo.onExtraCallbackWithResult.TABVISIT_SLOT) {
                        interfaceDescriptor = benefitMissionInfoOnExtraCallbackWithResult.getInterfaceDescriptor();
                    } else {
                        interfaceDescriptor = benefitMissionInfoOnExtraCallbackWithResult != null ? benefitMissionInfoOnExtraCallbackWithResult.getInterfaceDescriptor() : null;
                        if (interfaceDescriptor == null) {
                            interfaceDescriptor = "";
                        }
                    }
                    sensorBridgeExtension4 = new SensorBridgeExtension4(slotIAuthTabCallbackDefault, interfaceDescriptor, benefitMissionInfoOnExtraCallbackWithResult != null ? benefitMissionInfoOnExtraCallbackWithResult.IAuthTabCallbackDefault() : null, slotIAuthTabCallbackDefault.onExtraCallbackWithResult(), onextracallbackwithresult.IAuthTabCallback(), onextracallbackwithresult.onExtraCallback().IAuthTabCallback(), new GlobalBenefitTabFragment$.ExternalSyntheticLambda13(benefitMissionInfoOnExtraCallbackWithResult));
                } else {
                    sensorBridgeExtension4 = null;
                }
                list.add(new RotationVectorAbility(SensorServiceManager.IAuthTabCallback(onextracallbackwithresult.onExtraCallback(), (String) null, (String) null, (CardsV2.BenefitMissionInfo) null, (String) null, (getMaximumScreenBrightnessSetting) null, true, (CardsV2.Slot) null, 0, (RotationVectorAbility2) null, 479, (Object) null), sensorBridgeExtension4, onextracallbackwithresult.onExtraCallbackWithResult(), true, (RotationVectorAbility2) null, 16, (DefaultConstructorMarker) null));
            } else if (onnavigationevent instanceof registerInternal.onNavigationEvent) {
                registerInternal.onNavigationEvent onnavigationevent2 = onnavigationevent;
                list.add(new registerShakeListener(onnavigationevent2.IAuthTabCallback(), onnavigationevent2.onExtraCallback(), null, false, 0, "FIXED", null, null, 204, null));
                list.addAll(onnavigationevent2.onExtraCallbackWithResult());
            } else if (onnavigationevent instanceof registerInternal.IAuthTabCallbackStub) {
                if (i2 > 0) {
                    list.add(new SensorBridgeExtension5(10));
                }
                ShakeMonitorBridgeExtension shakeMonitorBridgeExtensionOnExtraCallback = getPhoneNumber.onExtraCallback((registerInternal.IAuthTabCallbackStub) onnavigationevent, i2 == CollectionsKt.getLastIndex(list2), (Map) globalBenefitTabFragment.access000().access100().IAuthTabCallback());
                list.add(shakeMonitorBridgeExtensionOnExtraCallback);
                ShakeMonitorBridgeExtension1 shakeMonitorBridgeExtension1IAuthTabCallback = getPhoneNumber.IAuthTabCallback(shakeMonitorBridgeExtensionOnExtraCallback);
                if (shakeMonitorBridgeExtension1IAuthTabCallback != null) {
                    list.add(shakeMonitorBridgeExtension1IAuthTabCallback);
                    int i5 = onMinimized + 65;
                    onMessageChannelReady = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
            i2++;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 0;
        Cards cards = (Cards) objArr[1];
        List list = (List) objArr[2];
        int i2 = 2 % 2;
        Iterator it = ((List) Cards.onExtraCallbackWithResult(new Object[]{cards}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1005988360, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1005988360)).iterator();
        int i3 = onMessageChannelReady + 63;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            int i5 = i;
            if (!it.hasNext()) {
                int i6 = onMessageChannelReady + 125;
                onMinimized = i6 % 128;
                int i7 = i6 % 2;
                return null;
            }
            i = i5 + 1;
            list.add(new RotationVectorAbility1$onWarmupCompleted((Cards.Card) it.next(), i5, null, false, false, 0, null, 0, 220, null));
        }
    }

    private static final Unit access100(GlobalBenefitTabFragment globalBenefitTabFragment) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 27;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        globalBenefitTabFragment.requireActivity().getOnBackPressedDispatcher().onExtraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        int i4 = onMinimized + 109;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final /* synthetic */ class asBinder extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        asBinder(Object obj) {
            super(0, obj, GlobalBenefitTabFragment.class, "onPointNavigationClick", "onPointNavigationClick()V", 0);
        }

        public /* synthetic */ Object invoke() throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted();
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 79;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onWarmupCompleted() throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            GlobalBenefitTabFragment.getInterfaceDescriptor((GlobalBenefitTabFragment) ((CallableReference) this).receiver);
            int i4 = onWarmupCompleted + 101;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(GlobalBenefitTabFragment globalBenefitTabFragment, MaxAppOpenAdapterListener maxAppOpenAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onMinimized + 81;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(maxAppOpenAdapterListener, "");
            z = (i & 14) != 71;
        } else {
            Intrinsics.checkNotNullParameter(maxAppOpenAdapterListener, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2021441857, i, -1, "im.toss.features.benefit.ui.GlobalBenefitTabFragment.initNavigation.<anonymous>.<anonymous> (GlobalBenefitTabFragment.kt:754)");
            }
            if (globalBenefitTabFragment.onActivityResized()) {
                int i4 = onMinimized + 39;
                onMessageChannelReady = i4 % 128;
                if (i4 % 2 != 0) {
                    globalBenefitTabFragment.onMinimized();
                    throw null;
                }
                if (globalBenefitTabFragment.onMinimized()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1037828316);
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(globalBenefitTabFragment);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(!zOnExtraCallback) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new asBinder(globalBenefitTabFragment);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    globalBenefitTabFragment.IAuthTabCallback((Function0<Unit>) ((access5300) objOnMinimized), cameraCaptureResultEmptyCameraCaptureResult, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1037737021);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(GlobalBenefitTabFragment globalBenefitTabFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        Function0 function0;
        int i2 = 2 % 2;
        int i3 = onMinimized + 113;
        int i4 = i3 % 128;
        onMessageChannelReady = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            int i6 = i4 + 123;
            onMinimized = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onMinimized + 49;
                onMessageChannelReady = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-263173891, i, -1, "im.toss.features.benefit.ui.GlobalBenefitTabFragment.initNavigation.<anonymous> (GlobalBenefitTabFragment.kt:746)");
            }
            Object obj = null;
            if (globalBenefitTabFragment.onMessageChannelReady()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1897978176);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(globalBenefitTabFragment);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback) {
                    int i10 = onMessageChannelReady + 65;
                    onMinimized = i10 % 128;
                    if (i10 % 2 == 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        obj.hashCode();
                        throw null;
                    }
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new GlobalBenefitTabFragment$.ExternalSyntheticLambda16(globalBenefitTabFragment);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    function0 = (Function0) objOnMinimized;
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1897873799);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                function0 = null;
            }
            MaxAdViewAdapterListener.onWarmupCompleted(function0, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, ByteOrderedDataOutputStream.onExtraCallback(globalBenefitTabFragment.asBinder()), (DeviceQuirksExternalSyntheticLambda0) null, ForwardingCameraControl.onExtraCallback(-2021441857, true, new GlobalBenefitTabFragment$.ExternalSyntheticLambda17(globalBenefitTabFragment), cameraCaptureResultEmptyCameraCaptureResult, 54), (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, 1572864, 174);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onMessageChannelReady + 83;
                onMinimized = i11 % 128;
                if (i11 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private final void extraCallbackWithResult() {
        ComposeView composeView;
        int i = 2 % 2;
        AddPhoneContactView addPhoneContactViewAsInterface = asInterface();
        if (addPhoneContactViewAsInterface != null && (composeView = addPhoneContactViewAsInterface.IAuthTabCallbackDefault) != null) {
            composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
            int i2 = onMinimized + 29;
            onMessageChannelReady = i2 % 128;
            int i3 = i2 % 2;
        }
        AddPhoneContactView addPhoneContactViewAsInterface2 = asInterface();
        if (addPhoneContactViewAsInterface2 != null) {
            int i4 = onMessageChannelReady + 71;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            ComposeView composeView2 = addPhoneContactViewAsInterface2.IAuthTabCallbackDefault;
            if (composeView2 != null) {
                composeView2.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-263173891, true, new GlobalBenefitTabFragment$.ExternalSyntheticLambda49(this))));
            }
        }
        ICustomTabsCallbackDefault();
    }

    private final void onExtraCallbackWithResult(long j, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = onMessageChannelReady + 105;
        onMinimized = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this, Long.valueOf(j)};
            onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), objArr, 112477154, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -112477125);
            this.access000 = AttributeExtension.onWarmupCompleted.onExtraCallbackWithResult(j);
            this.ICustomTabsCallback = i;
            onNavigationEvent(z);
            int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this, false}, 1623320298, iOnNavigationEvent2, -1623320270);
        } else {
            Object[] objArr2 = {this, Long.valueOf(j)};
            onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), objArr2, 112477154, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -112477125);
            this.access000 = AttributeExtension.onWarmupCompleted.onExtraCallbackWithResult(j);
            this.ICustomTabsCallback = i;
            onNavigationEvent(z);
            int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            int iOnNavigationEvent4 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent3, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this, true}, 1623320298, iOnNavigationEvent4, -1623320270);
        }
        ICustomTabsCallbackStub();
        ICustomTabsCallbackDefault();
        int i4 = onMinimized + 87;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void ICustomTabsCallbackStub() {
        int i = 2 % 2;
        AddPhoneContactView addPhoneContactViewAsInterface = asInterface();
        if (addPhoneContactViewAsInterface != null) {
            int i2 = onMessageChannelReady + 53;
            onMinimized = i2 % 128;
            if (i2 % 2 == 0) {
                addPhoneContactViewAsInterface.IAuthTabCallback();
                throw null;
            }
            FrameLayout frameLayoutIAuthTabCallback = addPhoneContactViewAsInterface.IAuthTabCallback();
            if (frameLayoutIAuthTabCallback != null) {
                int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                frameLayoutIAuthTabCallback.setBackgroundColor(((Integer) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this}, 194922428, iOnNavigationEvent2, -194922406)).intValue());
            }
        }
        AddPhoneContactView addPhoneContactViewAsInterface2 = asInterface();
        if (addPhoneContactViewAsInterface2 != null) {
            int i3 = onMinimized + 1;
            onMessageChannelReady = i3 % 128;
            int i4 = i3 % 2;
            TdsRecyclerView tdsRecyclerView = addPhoneContactViewAsInterface2.onActivityLayout;
            if (tdsRecyclerView != null) {
                int i5 = onMessageChannelReady + 85;
                onMinimized = i5 % 128;
                int i6 = i5 % 2;
                int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                int iOnNavigationEvent4 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                tdsRecyclerView.setBackgroundColor(((Integer) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent3, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this}, 194922428, iOnNavigationEvent4, -194922406)).intValue());
            }
        }
        ICustomTabsCallbackStubProxy();
    }

    private final int asBinder() {
        int i = 2 % 2;
        if (onActivityResized()) {
            int i2 = onMinimized + 7;
            onMessageChannelReady = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                onPostMessage();
                obj.hashCode();
                throw null;
            }
            if (!onPostMessage()) {
                int iOnExtraCallbackWithResult = accessgetProtocolp.onNavigationEvent(this).onExtraCallbackWithResult();
                int i3 = onMinimized + 43;
                onMessageChannelReady = i3 % 128;
                if (i3 % 2 == 0) {
                    return iOnExtraCallbackWithResult;
                }
                throw null;
            }
        }
        return accessgetProtocolp.onNavigationEvent(this).onWarmupCompleted();
    }

    private final void ICustomTabsCallbackStubProxy() {
        View view;
        int i = 2 % 2;
        int i2 = onMinimized + 47;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        AddPhoneContactView addPhoneContactViewAsInterface = asInterface();
        if (addPhoneContactViewAsInterface == null || (view = addPhoneContactViewAsInterface.onActivityResized) == null) {
            return;
        }
        int i4 = onMinimized + 121;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        view.setBackgroundColor(asBinder());
        if (i5 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = onMinimized + 101;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent4 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        if (i3 != 0) {
            onWarmupCompleted(((Boolean) onWarmupCompleted(iOnNavigationEvent3, iOnNavigationEvent, iOnNavigationEvent4, objArr, 973045226, iOnNavigationEvent2, -973045209)).booleanValue());
            int i4 = 50 / 0;
        } else {
            onWarmupCompleted(((Boolean) onWarmupCompleted(iOnNavigationEvent3, iOnNavigationEvent, iOnNavigationEvent4, objArr, 973045226, iOnNavigationEvent2, -973045209)).booleanValue());
        }
        int i5 = onMessageChannelReady + 79;
        onMinimized = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private final void IAuthTabCallback(Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(454701661);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i5 = onMinimized + 123;
                int i6 = i5 % 128;
                onMessageChannelReady = i6;
                i3 = i5 % 2 != 0 ? 2 : 4;
                int i7 = i6 + 79;
                onMinimized = i7 % 128;
                int i8 = i7 % 2;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
            int i9 = onMessageChannelReady + 89;
            onMinimized = i9 % 128;
            int i10 = i9 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            int i11 = onMinimized + 79;
            onMessageChannelReady = i11 % 128;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(454701661, i2, -1, "im.toss.features.benefit.ui.GlobalBenefitTabFragment.PointNavigationAction (GlobalBenefitTabFragment.kt:795)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(configureReward.onExtraCallback(onextracallback, (getConfiguration) null, (getCachingExecutorService) null, false, false, false, false, (String) null, (Role) null, function0, 255, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), QuirkSettingsLoader.Companion.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResult2, 48);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnWarmupCompleted);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                int i13 = onMessageChannelReady + 93;
                onMinimized = i13 % 128;
                if (i13 % 2 == 0) {
                    getAwbState.onExtraCallback();
                    int i14 = 55 / 0;
                } else {
                    getAwbState.onExtraCallback();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f));
            Object[] objArr = new Object[1];
            a(new char[]{'\n', 24, 27, 4, 19, 31, 13855, 13855, 16, 25, '\n', 29, 21, 23, 4, 25, 25, '\f', 19, 7, 22, 14, 2, 26, 18, 28, 25, 14, '!', 2, 28, ' ', '!', '\"', 30, '!', 21, 23, 25, 27, 15, 2, 26, 18, 27, 29, 16, 20, 18, ' ', 20, 4, 19, 3, 2, 27, 13927}, (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 106), 56 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
            AppLovinNativeAdImplc.onExtraCallbackWithResult(((String) objArr[0]).intern(), quirksExternalSyntheticBackport0IAuthTabCallbackDefault, 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult2, 54, 508);
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f)), cameraCaptureResultEmptyCameraCaptureResult2, 6);
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{AttributeExtension.onNavigationEvent(AttributeExtension.onWarmupCompleted, IAuthTabCallback_Parcel(), getInterfaceDescriptor(), (Locale) null, 4, (Object) null), null, AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor(), Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).ICustomTabsService()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new GlobalBenefitTabFragment$.ExternalSyntheticLambda21(this, function0, i));
        }
    }

    private static final Unit onNavigationEvent(GlobalBenefitTabFragment globalBenefitTabFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMinimized + 5;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("point_amount", globalBenefitTabFragment.access000);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("point_amount", globalBenefitTabFragment.access000);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onMinimized + 101;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 14 / 0;
        }
        return unit2;
    }

    private final void onActivityLayout() throws Throwable {
        int i = 2 % 2;
        TinyAppHostApduService1.onWarmupCompleted(TinyAppHostApduService1.onNavigationEvent, 1641114L, (Map) null, false, new GlobalBenefitTabFragment$.ExternalSyntheticLambda1(this), 6, (Object) null);
        SessionTrackerb sessionTrackerbOnNavigationEvent = onNavigationEvent();
        Context contextRequireContext = requireContext();
        Object[] objArr = new Object[1];
        a(new char[]{14, '\f', '\t', 27, '\"', 24, 25, '\f', 19, 31, 13811, 13811, ' ', 4, 27, 6, '\b', 5, '!', '\b', 20, 27, 22, 19, 22, 26, 16, 26, 6, '\n', '\"', 14, 16, 15, 0, 27, 26, ' ', 29, 4, '!', 18, 19, 22, 13862, 13862, 18, '!', '\n', 25, 6, '\n', 3, 6, 20, 27, 22, 19, 22, 26}, (byte) (62 - TextUtils.indexOf("", "", 0)), 60 - KeyEvent.keyCodeFromString(""), objArr);
        SessionTrackerb.onExtraCallbackWithResult(sessionTrackerbOnNavigationEvent, contextRequireContext, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = onMessageChannelReady + 109;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final AttributeExtension.onNavigationEvent getInterfaceDescriptor() {
        int i = 2 % 2;
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        if (onWarmupCompleted.onExtraCallback[((getPricingPhaseList) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this}, 960121980, iOnNavigationEvent2, -960121960)).ordinal()] == 1) {
            int i2 = onMinimized + 41;
            onMessageChannelReady = i2 % 128;
            int i3 = i2 % 2;
            return AttributeExtension.onNavigationEvent.EUR;
        }
        AttributeExtension.onNavigationEvent onnavigationevent = AttributeExtension.onNavigationEvent.AUD;
        int i4 = onMinimized + 43;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return onnavigationevent;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        GlobalBenefitTabFragment globalBenefitTabFragment = (GlobalBenefitTabFragment) objArr[0];
        int i = 2 % 2;
        if (!globalBenefitTabFragment.onPostMessage()) {
            int iOnExtraCallbackWithResult = accessgetProtocolp.onNavigationEvent(globalBenefitTabFragment).onExtraCallbackWithResult();
            int i2 = onMinimized + 55;
            onMessageChannelReady = i2 % 128;
            if (i2 % 2 == 0) {
                return Integer.valueOf(iOnExtraCallbackWithResult);
            }
            throw null;
        }
        int i3 = onMinimized + 55;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        int iOnWarmupCompleted = accessgetProtocolp.onNavigationEvent(globalBenefitTabFragment).onWarmupCompleted();
        int i5 = onMinimized + 51;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 == 0) {
            return Integer.valueOf(iOnWarmupCompleted);
        }
        throw null;
    }

    private final void onNavigationEvent(List<? extends SensorBridgeExtension3> list) {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 65;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        exitAllPages exitallpages = this.IAuthTabCallbackStubProxy;
        if (exitallpages == null) {
            int i5 = i2 + 111;
            onMessageChannelReady = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            exitallpages = null;
        }
        exitallpages.onExtraCallbackWithResult(list, true);
    }

    private static final Unit IAuthTabCallback(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 17;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{'!', 18, 19, 22, 13869, 13869, 18, '!'}, (byte) (69 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 9 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), TinyAppHostApduService1.onNavigationEvent.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i4 = onMinimized + 111;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = onMinimized + 39;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            gettypedexportedconstants.dismiss();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(view, "");
        gettypedexportedconstants.dismiss();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private final void onExtraCallbackWithResult(CardsV2.PointBackInfo.ChanceExhaustedSheet chanceExhaustedSheet) {
        int i = 2 % 2;
        Object obj = null;
        if (chanceExhaustedSheet == null) {
            int i2 = onMessageChannelReady + 107;
            onMinimized = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        TinyAppHostApduService1.onWarmupCompleted(TinyAppHostApduService1.onNavigationEvent, 5213096L, (Map) null, false, new GlobalBenefitTabFragment$.ExternalSyntheticLambda14(), 6, (Object) null);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        readTypedObject readtypedobject = readTypedObject.onWarmupCompleted;
        logAndOpenStore.IAuthTabCallback(contextRequireContext, (Long) null);
        getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(contextRequireContext, 0, false, false, -1L, readtypedobject, 14, (DefaultConstructorMarker) null);
        Context context = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setShowCloseIcon(false);
        bottomSheetHeader.setTitle(chanceExhaustedSheet.asBinder());
        bottomSheetHeader.setDescription(chanceExhaustedSheet.onExtraCallbackWithResult());
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        LinearLayout linearLayout2 = new LinearLayout(context3);
        linearLayout2.setOrientation(1);
        for (CardsV2.PointBackInfo.ChanceExhaustedSheet.Item item : chanceExhaustedSheet.onExtraCallback()) {
            Context context4 = linearLayout2.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context4, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
            tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.CUSTOM);
            int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            LinearLayout linearLayout3 = (LinearLayout) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View}, 1391718, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1391704, iOnNavigationEvent, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
            if (linearLayout3 != null) {
                linearLayout3.removeAllViews();
                Context context5 = linearLayout3.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                TdsImageView tdsImageView = new TdsImageView(context5, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                Class cls = Integer.TYPE;
                ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) ViewGroup.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
                Intrinsics.checkNotNull(layoutParams);
                Context context6 = tdsImageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "");
                layoutParams.width = varyMatches.IAuthTabCallback(54, context6);
                Context context7 = tdsImageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "");
                layoutParams.height = varyMatches.IAuthTabCallback(54, context7);
                tdsImageView.setLayoutParams(layoutParams);
                TdsImageView.setImage$default(tdsImageView, item.onWarmupCompleted(), (Function1) null, (Function1) null, 6, (Object) null);
                linearLayout3.addView(tdsImageView);
            }
            tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2A);
            tdsListRowV1View.setCenterText1(item.IAuthTabCallback());
            BaseTextView baseTextViewICustomTabsCallbackDefault = tdsListRowV1View.ICustomTabsCallbackDefault();
            if (baseTextViewICustomTabsCallbackDefault != null) {
                Context context8 = baseTextViewICustomTabsCallbackDefault.getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "");
                Configuration configuration = context8.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                baseTextViewICustomTabsCallbackDefault.setTextColor(new getUrlokhttp(new extraCallback(configuration)).onRelationshipValidationResult());
                baseTextViewICustomTabsCallbackDefault.onNavigationEvent(response.Bold);
                int i3 = onMinimized + 75;
                onMessageChannelReady = i3 % 128;
                int i4 = i3 % 2;
            }
            tdsListRowV1View.setCenterText2(item.onExtraCallbackWithResult());
            BaseTextView baseTextViewICustomTabsCallbackStubProxy = tdsListRowV1View.ICustomTabsCallbackStubProxy();
            if (baseTextViewICustomTabsCallbackStubProxy != null) {
                Configuration configuration2 = tdsListRowV1View.getContext().getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                baseTextViewICustomTabsCallbackStubProxy.setTextColor(new getUrlokhttp(new extraCallbackWithResult(configuration2)).onPostMessage());
            }
            tdsListRowV1View.setVerticalPadding(TdsListRowV1View.IAuthTabCallbackDefault.L);
            tdsListRowV1View.setHorizontalPadding(TdsListRowV1View.onNavigationEvent.M);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, tdsListRowV1View);
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, linearLayout2);
        Context context9 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context9);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, chanceExhaustedSheet.IAuthTabCallback(), new GlobalBenefitTabFragment$.ExternalSyntheticLambda15(gettypedexportedconstants), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 111;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub());
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asInterface(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 41;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub());
        attachapplovinsdk.onExtraCallback(250);
        Unit unit = Unit.INSTANCE;
        int i4 = onMinimized + 21;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(float f, float f2, AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        isMuted.IAuthTabCallback_Parcel(appLovinSdkSettings, (Float) null, Float.valueOf(f), new GlobalBenefitTabFragment$.ExternalSyntheticLambda19(), 1, (Object) null);
        isMuted.IAuthTabCallback_Parcel(appLovinSdkSettings, (Float) null, Float.valueOf(f2), new GlobalBenefitTabFragment$.ExternalSyntheticLambda20(), 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onMinimized + 125;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 47 / 0;
        }
        return unit;
    }

    public static final class ICustomTabsCallback implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ TdsRoundLayout IAuthTabCallback;
        final /* synthetic */ View onExtraCallbackWithResult;

        ICustomTabsCallback(TdsRoundLayout tdsRoundLayout, View view) {
            this.IAuthTabCallback = tdsRoundLayout;
            this.onExtraCallbackWithResult = view;
        }

        public /* bridge */ void IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.IAuthTabCallback(f);
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* bridge */ void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallback(f);
            int i4 = onWarmupCompleted + 107;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* bridge */ void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(f);
            int i4 = onNavigationEvent + 71;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* bridge */ void onExtraCallbackWithResult(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(obj);
            if (i3 != 0) {
                int i4 = 36 / 0;
            }
        }

        public /* bridge */ void onWarmupCompleted(float f) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted(f);
            int i4 = onNavigationEvent + 45;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 0;
            }
        }

        public void onNavigationEvent(float f) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            TdsRoundLayout tdsRoundLayout = this.IAuthTabCallback;
            if (tdsRoundLayout != null) {
                int i5 = i3 + 65;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    tdsRoundLayout.setShadowAlpha(f);
                } else {
                    tdsRoundLayout.setShadowAlpha(f);
                    throw null;
                }
            }
            this.onExtraCallbackWithResult.setAlpha(f);
        }
    }

    private static final Unit IAuthTabCallbackStub(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 117;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent());
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent());
        Unit unit2 = Unit.INSTANCE;
        int i3 = onMessageChannelReady + 55;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit IAuthTabCallbackDefault(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 49;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.asBinder());
        attachapplovinsdk.onExtraCallback(370);
        Unit unit = Unit.INSTANCE;
        int i4 = onMinimized + 87;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Float fValueOf = Float.valueOf(0.0f);
        isMuted.onExtraCallback(appLovinSdkSettings, fValueOf, Float.valueOf(1.0f), new GlobalBenefitTabFragment$.ExternalSyntheticLambda2());
        isMuted.onNavigationEvent(appLovinSdkSettings, (Float) null, fValueOf, new GlobalBenefitTabFragment$.ExternalSyntheticLambda3(), 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onMessageChannelReady + 55;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static final class writeTypedObject implements Animator.AnimatorListener {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ ViewGroup IAuthTabCallback;
        final /* synthetic */ LottieAnimationView onExtraCallbackWithResult;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            int i4 = onNavigationEvent + 99;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        writeTypedObject(ViewGroup viewGroup, LottieAnimationView lottieAnimationView) {
            this.IAuthTabCallback = viewGroup;
            this.onExtraCallbackWithResult = lottieAnimationView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            this.IAuthTabCallback.removeView(this.onExtraCallbackWithResult);
            int i4 = onWarmupCompleted + 35;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 0;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 99;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(animator, "");
                this.IAuthTabCallback.removeView(this.onExtraCallbackWithResult);
                int i3 = 17 / 0;
            } else {
                Intrinsics.checkNotNullParameter(animator, "");
                this.IAuthTabCallback.removeView(this.onExtraCallbackWithResult);
            }
            int i4 = onWarmupCompleted + 123;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit onWarmupCompleted(ViewGroup viewGroup, View view) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 101;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            viewGroup.removeView(view);
            Unit unit = Unit.INSTANCE;
            int i3 = onMessageChannelReady + 5;
            onMinimized = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        viewGroup.removeView(view);
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(float f, float f2, int i, String str) throws Throwable {
        FrameLayout frameLayout;
        CharSequence charSequenceOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = onMessageChannelReady + 77;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        AddPhoneContactView addPhoneContactViewAsInterface = asInterface();
        FrameLayout frameLayoutIAuthTabCallback = addPhoneContactViewAsInterface != null ? addPhoneContactViewAsInterface.IAuthTabCallback() : null;
        if (frameLayoutIAuthTabCallback == null) {
            int i5 = onMessageChannelReady + 35;
            onMinimized = i5 % 128;
            int i6 = i5 % 2;
            frameLayout = null;
        } else {
            frameLayout = frameLayoutIAuthTabCallback;
        }
        if (frameLayout == null) {
            return;
        }
        frameLayout.getLocationInWindow(new int[2]);
        float f3 = f - r4[0];
        float f4 = f2 - r4[1];
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        int iIAuthTabCallback = varyMatches.IAuthTabCallback(200, contextRequireContext);
        isOneShot.onExtraCallbackWithResult(this, noStore.Companion.IAuthTabCallback());
        LottieAnimationView lottieAnimationView = new LottieAnimationView(requireContext());
        Object[] objArr = new Object[1];
        a(new char[]{'\n', 24, 27, 4, 19, 31, 13776, 13776, 16, 25, '\n', 29, 21, 23, 4, 25, 25, '\f', 19, 7, 22, 14, 2, '\b', 25, 29, 26, 22, 19, 15, '\"', 20, 25, 27, 19, 22, 13833, 13833, 26, 20, '\b', 3, 15, 23, 15, 14, 5, '\t', 28, ' ', 3, 20, 2, 5, '\f', 25, 13839}, (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 28), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 58, objArr);
        lottieAnimationView.setAnimationFromUrl(((String) objArr[0]).intern());
        lottieAnimationView.setRepeatCount(0);
        lottieAnimationView.setLayoutParams(new ViewGroup.LayoutParams(iIAuthTabCallback, iIAuthTabCallback));
        lottieAnimationView.setClickable(false);
        lottieAnimationView.setFocusable(false);
        lottieAnimationView.setAlpha(0.0f);
        View viewInflate = getLayoutInflater().inflate(R.layout.benefit_point_back_floating_text, (ViewGroup) frameLayout, false);
        TdsRoundLayout tdsRoundLayoutFindViewById = viewInflate.findViewById(R.id.floatingTextContainer);
        Typography5 typography5FindViewById = viewInflate.findViewById(R.id.floatingText);
        if (typography5FindViewById != null) {
            if (str != null) {
                int i7 = onMessageChannelReady + 59;
                onMinimized = i7 % 128;
                if (i7 % 2 != 0 ? (charSequenceOnNavigationEvent = BrickModulesListExternalSyntheticLambda0.onNavigationEvent(str, false, 1, (Object) null)) == null : (charSequenceOnNavigationEvent = BrickModulesListExternalSyntheticLambda0.onNavigationEvent(str, true, 1, (Object) null)) == null) {
                    charSequenceOnNavigationEvent = "+" + AttributeExtension.onNavigationEvent(AttributeExtension.onWarmupCompleted, i, getInterfaceDescriptor(), (Locale) null, 4, (Object) null);
                }
                typography5FindViewById.setText(charSequenceOnNavigationEvent);
            }
        }
        frameLayout.addView(lottieAnimationView);
        frameLayout.addView(viewInflate);
        lottieAnimationView.setX(f3 - (iIAuthTabCallback / 2));
        lottieAnimationView.setY(f4 - iIAuthTabCallback);
        viewInflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        float fCoerceAtLeast = RangesKt.coerceAtLeast(frameLayout.getWidth() - viewInflate.getMeasuredWidth(), 0);
        float fCoerceAtLeast2 = RangesKt.coerceAtLeast(frameLayout.getHeight() - viewInflate.getMeasuredHeight(), 0);
        float fCoerceIn = RangesKt.coerceIn(f3 - (viewInflate.getMeasuredWidth() / 2.0f), 0.0f, fCoerceAtLeast);
        Intrinsics.checkNotNullExpressionValue(requireContext(), "");
        float fCoerceIn2 = RangesKt.coerceIn((f4 - (viewInflate.getMeasuredHeight() / 2.0f)) - varyMatches.IAuthTabCallback(50, r13), 0.0f, fCoerceAtLeast2);
        viewInflate.setX(fCoerceIn);
        viewInflate.setY(fCoerceIn2);
        Intrinsics.checkNotNullExpressionValue(requireContext(), "");
        float fCoerceIn3 = RangesKt.coerceIn(fCoerceIn - varyMatches.IAuthTabCallback(20, r13), 0.0f, fCoerceAtLeast);
        Intrinsics.checkNotNullExpressionValue(requireContext(), "");
        float fCoerceIn4 = RangesKt.coerceIn(fCoerceIn + varyMatches.IAuthTabCallback(10, r14), 0.0f, fCoerceAtLeast);
        Intrinsics.checkNotNullExpressionValue(requireContext(), "");
        float fCoerceIn5 = RangesKt.coerceIn(fCoerceIn2 - varyMatches.IAuthTabCallback(60, r3), 0.0f, fCoerceAtLeast2);
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        Address address = Address.onNavigationEvent;
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{lottieAnimationView, isMuted.onNavigationEvent(RallysKt.onExtraCallback(address.asInterface(), 200), fValueOf2, fValueOf, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{lottieAnimationView, isMuted.onNavigationEvent(RallysKt.onExtraCallback(address.asInterface(), 200), fValueOf, fValueOf2, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 880, 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        Intrinsics.checkNotNull(viewInflate);
        isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rally, rally2, (Rally) RallysKt.onWarmupCompleted(new Object[]{viewInflate, isMuted.onExtraCallbackWithResult(isMuted.getInterfaceDescriptor(new AppLovinSdkSettings(), (Float) null, Float.valueOf(fCoerceIn5), new GlobalBenefitTabFragment$.ExternalSyntheticLambda43(), 1, (Object) null), new GlobalBenefitTabFragment$.ExternalSyntheticLambda44(fCoerceIn3, fCoerceIn4)), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), RallysKt.IAuthTabCallback(new ICustomTabsCallback(tdsRoundLayoutFindViewById, viewInflate), isMuted.onExtraCallback(new AppLovinSdkSettings(), new GlobalBenefitTabFragment$.ExternalSyntheticLambda45()), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), (Object) null, new GlobalBenefitTabFragment$.ExternalSyntheticLambda46(frameLayout, viewInflate), 1, (Object) null), false, 1, (Object) null);
        lottieAnimationView.addAnimatorListener(new writeTypedObject(frameLayout, lottieAnimationView));
        lottieAnimationView.playAnimation();
    }

    private final void writeTypedObject() {
        TdsResultV0View tdsResultV0View;
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 37;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            AddPhoneContactView addPhoneContactViewAsInterface = asInterface();
            if (addPhoneContactViewAsInterface == null || (tdsResultV0View = addPhoneContactViewAsInterface.onWarmupCompleted) == null) {
                return;
            }
            Context context = tdsResultV0View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsResultV0View.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new onExtraCallbackWithResult(configuration)).onWarmupCompleted());
            tdsResultV0View.setLottieImageFromAsset("lottie/spot-error.json");
            tdsResultV0View.setTitle(getString(viva.republica.toss.R.string.app_main___fa83af2314));
            tdsResultV0View.setSubtitle("");
            TdsButtonV1View tdsButtonV1ViewAsInterface = tdsResultV0View.asInterface();
            tdsButtonV1ViewAsInterface.setVisibility(0);
            tdsButtonV1ViewAsInterface.setText(tdsButtonV1ViewAsInterface.getContext().getString(viva.republica.toss.R.string.app_main___ad8db664ed));
            Object[] objArr = {tdsButtonV1ViewAsInterface, ParamUtils.LONG, new GlobalBenefitTabFragment$.ExternalSyntheticLambda11(this)};
            int i3 = onMessageChannelReady + 115;
            onMinimized = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        asInterface();
        throw null;
    }

    private static final Unit onExtraCallback(GlobalBenefitTabFragment globalBenefitTabFragment, View view) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 35;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        globalBenefitTabFragment.onRetry();
        Unit unit = Unit.INSTANCE;
        int i4 = onMessageChannelReady + 75;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return unit;
    }

    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 53;
        onMinimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            TinyAppHostApduService1.onNavigationEvent.onNavigationEvent();
            WorkflowUnit workflowUnit = this.IAuthTabCallback;
            if (workflowUnit == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                workflowUnit = null;
            }
            workflowUnit.asBinder();
            super.onDestroyView();
            int i3 = onMessageChannelReady + 39;
            onMinimized = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        TinyAppHostApduService1.onNavigationEvent.onNavigationEvent();
        throw null;
    }

    private final long IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 55;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        long jOnWarmupCompleted = this.readTypedObject.onWarmupCompleted();
        int i4 = onMessageChannelReady + 53;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return jOnWarmupCompleted;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStub(Object[] objArr) {
        GlobalBenefitTabFragment globalBenefitTabFragment = (GlobalBenefitTabFragment) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 87;
        onMinimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            globalBenefitTabFragment.readTypedObject.onNavigationEvent(jLongValue);
            return null;
        }
        globalBenefitTabFragment.readTypedObject.onNavigationEvent(jLongValue);
        obj.hashCode();
        throw null;
    }

    private final boolean onPostMessage() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 77;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.onTransact.onExtraCallbackWithResult()).booleanValue();
        int i4 = onMinimized + 75;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 117;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            this.onTransact.IAuthTabCallback(Boolean.valueOf(z));
            return;
        }
        this.onTransact.IAuthTabCallback(Boolean.valueOf(z));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = onMinimized + 87;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.IAuthTabCallback_Parcel.onExtraCallbackWithResult()).booleanValue();
        int i4 = onMessageChannelReady + 33;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return zBooleanValue;
    }

    private final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = onMinimized + 71;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback_Parcel.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onMinimized + 113;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
    }

    private final boolean onActivityResized() {
        int i = 2 % 2;
        int i2 = onMinimized + 125;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            return ((Boolean) this.IAuthTabCallbackDefault.onExtraCallbackWithResult()).booleanValue();
        }
        ((Boolean) this.IAuthTabCallbackDefault.onExtraCallbackWithResult()).booleanValue();
        throw null;
    }

    private final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = onMinimized + 57;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            this.IAuthTabCallbackDefault.IAuthTabCallback(Boolean.valueOf(z));
            int i3 = 61 / 0;
        } else {
            this.IAuthTabCallbackDefault.IAuthTabCallback(Boolean.valueOf(z));
        }
    }

    private final boolean onMinimized() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 79;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.access100.onExtraCallbackWithResult()).booleanValue();
        int i4 = onMinimized + 15;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        GlobalBenefitTabFragment globalBenefitTabFragment = (GlobalBenefitTabFragment) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 85;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            globalBenefitTabFragment.access100.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
            return null;
        }
        globalBenefitTabFragment.access100.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardsV2.CustomParameter customParameter, SensorServiceManager sensorServiceManager, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{customParameter, sensorServiceManager, setDetectableSize}, -1357978349, iOnNavigationEvent2, 1357978357);
    }

    public static /* synthetic */ Unit onNavigationEvent(getTypedExportedConstants gettypedexportedconstants, View view) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{gettypedexportedconstants, view}, -353804619, iOnNavigationEvent2, 353804645);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{attachapplovinsdk}, 668454106, iOnNavigationEvent2, -668454100);
    }

    public static /* synthetic */ Unit IAuthTabCallback(GlobalBenefitTabFragment globalBenefitTabFragment, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {globalBenefitTabFragment, function0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), objArr, 216312701, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -216312682);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(GlobalBenefitTabFragment globalBenefitTabFragment, GlobalBenefitTabViewModel.onWarmupCompleted onwarmupcompleted) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{globalBenefitTabFragment, onwarmupcompleted}, -1602379462, iOnNavigationEvent2, 1602379492);
    }

    public static /* synthetic */ Unit onExtraCallback(GlobalBenefitTabFragment globalBenefitTabFragment, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{globalBenefitTabFragment, setDetectableSize}, -1287255854, iOnNavigationEvent2, 1287255865);
    }

    public static /* synthetic */ Unit onWarmupCompleted(float f, float f2, AppLovinSdkSettings appLovinSdkSettings) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), appLovinSdkSettings};
        return (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), objArr, 909814238, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -909814213);
    }

    public static /* synthetic */ WindowInsetsCompat onExtraCallback(GlobalBenefitTabFragment globalBenefitTabFragment, View view, WindowInsetsCompat windowInsetsCompat) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (WindowInsetsCompat) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{globalBenefitTabFragment, view, windowInsetsCompat}, 883300495, iOnNavigationEvent2, -883300471);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(GlobalBenefitTabFragment globalBenefitTabFragment, MaxAppOpenAdapterListener maxAppOpenAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {globalBenefitTabFragment, maxAppOpenAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), objArr, 1472251746, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -1472251737);
    }

    public static final /* synthetic */ getSimOperator asInterface(GlobalBenefitTabFragment globalBenefitTabFragment) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (getSimOperator) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{globalBenefitTabFragment}, 914143253, iOnNavigationEvent2, -914143246);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(GlobalBenefitTabFragment globalBenefitTabFragment, boolean z) {
        Object[] objArr = {globalBenefitTabFragment, Boolean.valueOf(z)};
        onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), objArr, -1268675700, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 1268675702);
    }

    public static final /* synthetic */ void onNavigationEvent(GlobalBenefitTabFragment globalBenefitTabFragment, CardsV2.PointBackInfo.ChanceExhaustedSheet chanceExhaustedSheet) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{globalBenefitTabFragment, chanceExhaustedSheet}, 772602672, iOnNavigationEvent2, -772602671);
    }

    private final void onExtraCallback(Cards cards, List<SensorBridgeExtension3> list) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this, cards, list}, -2081276669, iOnNavigationEvent2, 2081276674);
    }

    private final void onWarmupCompleted(List<SensorBridgeExtension3> list, List<? extends registerInternal> list2) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this, list, list2}, -169958757, iOnNavigationEvent2, 169958761);
    }

    private final int IAuthTabCallbackDefault() {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return ((Integer) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this}, 194922428, iOnNavigationEvent2, -194922406)).intValue();
    }

    private final boolean IAuthTabCallbackStub() {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return ((Boolean) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this}, 973045226, iOnNavigationEvent2, -973045209)).booleanValue();
    }

    private static final Unit onWarmupCompleted(GlobalBenefitTabFragment globalBenefitTabFragment, BasicSystemInfoExtension basicSystemInfoExtension) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{globalBenefitTabFragment, basicSystemInfoExtension}, 364375535, iOnNavigationEvent2, -364375525);
    }

    private final void readTypedObject() {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this}, -1366664912, iOnNavigationEvent2, 1366664915);
    }

    private static final boolean IAuthTabCallback(RVWebSocketManagerHolder rVWebSocketManagerHolder) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return ((Boolean) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{rVWebSocketManagerHolder}, 85822237, iOnNavigationEvent2, -85822223)).booleanValue();
    }

    private static final Unit onNavigationEvent(GlobalBenefitTabFragment globalBenefitTabFragment, String str) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{globalBenefitTabFragment, str}, -346085961, iOnNavigationEvent2, 346085984);
    }

    private static final Unit asBinder(GlobalBenefitTabFragment globalBenefitTabFragment, String str) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{globalBenefitTabFragment, str}, 1333402932, iOnNavigationEvent2, -1333402916);
    }

    private static final Unit onExtraCallback(GlobalBenefitTabFragment globalBenefitTabFragment, RotationVectorAbility1 rotationVectorAbility1) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{globalBenefitTabFragment, rotationVectorAbility1}, -1064013371, iOnNavigationEvent2, 1064013398);
    }

    private static final Unit IAuthTabCallback(GlobalBenefitTabFragment globalBenefitTabFragment, RotationVectorAbility1 rotationVectorAbility1) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{globalBenefitTabFragment, rotationVectorAbility1}, -1689824835, iOnNavigationEvent2, 1689824856);
    }

    private static final Unit onExtraCallback(RotationVectorAbility1.onExtraCallback onextracallback, String str, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{onextracallback, str, setDetectableSize}, 1244888050, iOnNavigationEvent2, -1244888035);
    }

    private final void IAuthTabCallback(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), objArr, 250555528, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -250555516);
    }

    private final void onExtraCallback(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), objArr, 1623320298, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -1623320270);
    }

    private final void onExtraCallback(long j) {
        Object[] objArr = {this, Long.valueOf(j)};
        onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), objArr, 112477154, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -112477125);
    }

    private static final Unit onTransact(attachAppLovinSdk attachapplovinsdk) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{attachapplovinsdk}, -1733513622, iOnNavigationEvent2, 1733513640);
    }

    private static final Unit asBinder(attachAppLovinSdk attachapplovinsdk) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (Unit) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{attachapplovinsdk}, 708954982, iOnNavigationEvent2, -708954969);
    }

    private final void mayLaunchUrl() {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this}, -919740304, iOnNavigationEvent2, 919740304);
    }

    public final getPricingPhaseList onWarmupCompleted() {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (getPricingPhaseList) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this}, 960121980, iOnNavigationEvent2, -960121960);
    }

    static void IAuthTabCallback() {
        extraCallbackWithResult = new char[]{65004, 64925, 64991, 64963, 64985, 64908, 64987, 64910, 64992, 64977, 64993, 64978, 64899, 64960, 64926, 64970, 64990, 64966, 64981, 64995, 64986, 64982, 64976, 64997, 64988, 64905, 64989, 64994, 64967, 65006, 64961, 65007, 64924, 64903, 64980, 64971};
        onActivityResized = (char) 51247;
    }
}
