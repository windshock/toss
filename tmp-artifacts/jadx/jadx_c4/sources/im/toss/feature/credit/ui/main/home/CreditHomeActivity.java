package im.toss.feature.credit.ui.main.home;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.UriMatcher;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.ViewModelProvider;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.sdk.openadsdk.wwx.lt;
import com.google.android.gms.internal.measurement.zzho;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import com.skt.usp.UCPApiConstants;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import im.toss.base.BaseActivity;
import im.toss.deeplink.annotation.RootActivity;
import im.toss.define.MobileCarrier;
import im.toss.feature.credit.ui.main.NiceDiErrorBottomSheetFragment;
import im.toss.feature.credit.ui.main.home.CreditDualViewModel;
import im.toss.feature.credit.ui.main.home.CreditHomeActivity;
import im.toss.feature.credit.ui.main.home.CreditHomeActivity$;
import im.toss.feature.credit.ui.main.home.RouteType;
import im.toss.feature.credit.ui.main.home.raise_edge_case.CreditPerfectScoreActivity;
import im.toss.feature.credit.ui.main.home.raise_edge_case.CreditScoreRaiseCoolTimeActivity;
import im.toss.features.credit.CreditBaseViewModel;
import im.toss.features.credit.data.response.CreditHomeHeaderResponse;
import im.toss.features.credit.data.response.ScoreDeltaInfo;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.tosscert.ui.R;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import im.toss.inventory_sdk.InventoryAdManager;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.anim.top.AnimateTop;
import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.SubTypography2;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.PillarSwipeRefreshLayout;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import im.toss.uikit.widget.gl.TdsGLBlurView;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o.Address;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppLovinAdImpl;
import o.AppLovinSdkSettings;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.AuthenticatorCompanion;
import o.AuthenticatorCompanionAuthenticatorNone;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BrickModulePackageExternalSyntheticLambda0;
import o.Cache;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraControllerExternalSyntheticLambda0;
import o.CameraProviderInitRetryPolicy1;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.DERSet;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.ForwardingCameraControl;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallbackStub;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageServiceStubProxy;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.ImageLoaderBuilderExternalSyntheticLambda6;
import o.LowLightBoostControlExternalSyntheticLambda0;
import o.LowLightBoostControlExternalSyntheticLambda1;
import o.M_;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RealImageLoaderexecute3;
import o.RightClickGesturesKtonRightClickDown2;
import o.Rmipmap;
import o.SearchBarKtExternalSyntheticLambda5;
import o.SessionTrackera;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.StackTraceInfo;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access700;
import o.auth;
import o.authenticate;
import o.checkDeviceBrand;
import o.checkInterval;
import o.component5;
import o.createWifiConfiguration;
import o.deprecated_certificatePinner;
import o.deprecated_directory;
import o.deprecated_dns;
import o.enableNebulaDestroyOpt;
import o.enableNebulaServiceInitOpt;
import o.enableOverridePendingTransitionNew;
import o.enablePreloadClassOpt;
import o.enableSwitch;
import o.findResAndMsg;
import o.forceInnerPermissionCheck;
import o.formatMsgs;
import o.generateLink;
import o.getAdService;
import o.getAwbState;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getDummyAd;
import o.getExtraParameters;
import o.getHostnameVerifierokhttp;
import o.getOriginalFullResponse;
import o.getParamImp;
import o.getPreRenderJob;
import o.getSpecialFeatureOptInStatus;
import o.getTime;
import o.getTypedExportedConstants;
import o.getUrlokhttp;
import o.getWrite;
import o.getWriteTimeoutokhttp;
import o.h5ScreenShotObserverOnChangeOpt;
import o.initMiniApp;
import o.isFireOS;
import o.isFreeze;
import o.isMuted;
import o.isPoolNetwork;
import o.isShowTransAnimate;
import o.isUcInitOpt;
import o.liteProcessHandlerThreadOpt;
import o.liteTrackWatchDogHandlerThreadOpt;
import o.logAndOpenStore;
import o.maybeUpdateAnimatable;
import o.minFresh;
import o.networkAvailableOpt;
import o.noStore;
import o.onJsBridgeReady;
import o.onPageExit;
import o.onUnavailable;
import o.overrideEventDispatcher;
import o.pxToDp;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambdaDml5dirzRCENiZicd2_b5Xg5o;
import o.r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0;
import o.readIntokhttp;
import o.readTimeout;
import o.resolveQuirkNames;
import o.response;
import o.runOnUiThreadDelayed;
import o.sampleInterval;
import o.setAdVideoPlaybackListener;
import o.setAuthenticatorokhttp;
import o.setBaseDeeplink;
import o.setFinalY;
import o.setHasShown;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProxySelectorokhttp;
import o.setRandomHost;
import o.setVisitUrl;
import o.switchJudgment;
import o.toFlameGraphLine;
import o.toPreviewOnlyRange;
import o.updateRuntimeShadowNodeReferencesOnCommit;
import o.varyFields;
import o.varyMatches;
import o.y1hExternalSyntheticLambda0;
import o.zzad;
import o.zzaj;
import o.zzdt;
import o.zzm;
import o.zzo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;
import viva.republica.toss.network.model.verify.SessionKnownType;

@RootActivity
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditHomeActivity extends Hilt_CreditHomeActivity implements zzo {
    public static final onExtraCallback Companion;
    public static final int IAuthTabCallbackDefault;
    private static int ICustomTabsServiceDefault;
    private static int receiveFile;
    private static long requestPostMessageChannelWithExtras;
    private boolean IAuthTabCallback_Parcel;

    @Inject
    public zzad injectedEnvironments;

    @Inject
    public InventoryAdManager inventoryAdManager;

    @Inject
    public getDummyAd standardTermsV2Intent;

    @Inject
    public SessionTrackerb tossRouter;

    @Inject
    public setFinalY tossploreManager;
    private static final byte[] $$a = {7, 80, 121, 38};
    private static final int $$b = 143;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int updateVisuals = 1;
    private static int ICustomTabsServiceStub = 0;
    private static int warmup = 1;
    private final Lazy IAuthTabCallbackStubProxy = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new isEngagementSignalsApiAvailable(this));
    private final Lazy prefetchWithMultipleUrls = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(CreditDualViewModel.class), new mayLaunchUrl(this), new extraCommand(this), new newSession(null, this));
    private final Lazy onMinimized = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(CreditHomeViewModel.class), new newAuthTabSession(this), new newSessionWithExtras(this), new postMessage(null, this));
    private final int newAuthTabSession = 200;
    private final ImageLoaderBuilderExternalSyntheticLambda6 postMessage = new ImageLoaderBuilderExternalSyntheticLambda6(0, 1, null);
    private final Lazy onPostMessage = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda19
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke() {
            String strIAuthTabCallback_Parcel;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                strIAuthTabCallback_Parcel = CreditHomeActivity.IAuthTabCallback_Parcel(this.f$0);
                int i3 = 17 / 0;
            } else {
                strIAuthTabCallback_Parcel = CreditHomeActivity.IAuthTabCallback_Parcel(this.f$0);
            }
            int i4 = onExtraCallback + 15;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return strIAuthTabCallback_Parcel;
        }
    });
    private final SessionTrackera readTypedObject = AppLovinAdImpl.IAuthTabCallback(this, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda30
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = CreditHomeActivity.onExtraCallbackWithResult(this.f$0, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj);
            if (i3 == 0) {
                int i4 = 64 / 0;
            }
            return unitOnExtraCallbackWithResult;
        }
    });
    private final SessionTrackera ICustomTabsCallbackDefault = AppLovinAdImpl.IAuthTabCallback(this, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda33
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = CreditHomeActivity.onNavigationEvent(this.f$0, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj);
            int i4 = IAuthTabCallback + 83;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> access000 = onPageExit.onNavigationEvent((IEngagementSignalsCallbackStub) this, (Function1<? super IEngagementSignalsCallbackDefault, Unit>) new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda34
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {this.f$0, (IEngagementSignalsCallbackDefault) obj};
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            if (i3 == 0) {
                return (Unit) CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -801049774, iOnWarmupCompleted, iOnWarmupCompleted2, objArr, iOnWarmupCompleted3, 801049808);
            }
            throw null;
        }
    });
    private final Lazy newSessionWithExtras = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda35
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnActivityResized = CreditHomeActivity.onActivityResized(this.f$0);
            if (i3 == 0) {
                return Boolean.valueOf(zOnActivityResized);
            }
            int i4 = 94 / 0;
            return Boolean.valueOf(zOnActivityResized);
        }
    });
    private final Lazy onMessageChannelReady = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda36
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr = {this.f$0};
                Boolean.valueOf(((Boolean) CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1789878684, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1789878677)).booleanValue());
                throw null;
            }
            Object[] objArr2 = {this.f$0};
            Boolean boolValueOf = Boolean.valueOf(((Boolean) CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1789878684, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr2, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1789878677)).booleanValue());
            int i3 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return boolValueOf;
            }
            throw null;
        }
    });
    private final Lazy onActivityLayout = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda37
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Boolean.valueOf(CreditHomeActivity.getInterfaceDescriptor(this.f$0));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Boolean boolValueOf = Boolean.valueOf(CreditHomeActivity.getInterfaceDescriptor(this.f$0));
            int i3 = onExtraCallbackWithResult + 45;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return boolValueOf;
        }
    });
    private final long setEngagementSignalsCallback = 300;
    private final long ICustomTabsService = 200;
    private final float prefetch = 1.8f;
    private final float access100 = 1.25f;
    private final float extraCallbackWithResult = 1.4f;
    private final int onRelationshipValidationResult = 600;
    private final Lazy extraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda38
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Integer.valueOf(CreditHomeActivity.onMinimized(this.f$0));
                throw null;
            }
            Integer numValueOf = Integer.valueOf(CreditHomeActivity.onMinimized(this.f$0));
            int i3 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 34 / 0;
            }
            return numValueOf;
        }
    });
    private final float writeTypedObject = 0.8f;
    private final float requestPostMessageChannel = 0.85f;
    private final IEngagementSignalsCallback_Parcel<Intent> onUnminimized = onPageExit.onNavigationEvent((IEngagementSignalsCallbackStub) this, (Function1<? super IEngagementSignalsCallbackDefault, Unit>) new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda39
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = {this.f$0, (IEngagementSignalsCallbackDefault) obj};
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object[] objArr2 = {this.f$0, (IEngagementSignalsCallbackDefault) obj};
            Unit unit = (Unit) CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1860208070, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr2, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1860208098);
            int i3 = onNavigationEvent + 1;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
    });
    private final Lazy onActivityResized = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda40
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() throws Resources.NotFoundException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String strWriteTypedObject = CreditHomeActivity.writeTypedObject(this.f$0);
            if (i3 != 0) {
                int i4 = 47 / 0;
            }
            return strWriteTypedObject;
        }
    });
    private final Lazy ICustomTabsCallback_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda20
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final Object invoke() throws Resources.NotFoundException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallbackWithResult = CreditHomeActivity.onExtraCallbackWithResult(this.f$0);
            if (i3 == 0) {
                int i4 = 55 / 0;
            }
            return strOnExtraCallbackWithResult;
        }
    });
    private final Lazy extraCommand = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda21
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String strAccess100 = CreditHomeActivity.access100(this.f$0);
            int i4 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return strAccess100;
        }
    });
    private final Lazy IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda22
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {this.f$0};
            Integer numValueOf = Integer.valueOf(((Integer) CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1776013329, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1776013284)).intValue());
            int i4 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return numValueOf;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda23
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Integer numValueOf = Integer.valueOf(CreditHomeActivity.onTransact(this.f$0));
            int i4 = onExtraCallback + 45;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return numValueOf;
        }
    });
    private final Lazy asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda24
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {this.f$0};
            Integer numValueOf = Integer.valueOf(((Integer) CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 782550647, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -782550609)).intValue());
            int i4 = onNavigationEvent + 125;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return numValueOf;
        }
    });
    private final Lazy getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda25
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final Object invoke() throws Resources.NotFoundException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iOnExtraCallback = CreditHomeActivity.onExtraCallback(this.f$0);
            if (i3 == 0) {
                return Integer.valueOf(iOnExtraCallback);
            }
            Integer.valueOf(iOnExtraCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda26
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            Integer numValueOf;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                numValueOf = Integer.valueOf(CreditHomeActivity.asBinder(this.f$0));
                int i3 = 0 / 0;
            } else {
                numValueOf = Integer.valueOf(CreditHomeActivity.asBinder(this.f$0));
            }
            int i4 = onNavigationEvent + 99;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return numValueOf;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });
    private final Lazy ICustomTabsCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda27
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            Integer numValueOf;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                numValueOf = Integer.valueOf(CreditHomeActivity.IAuthTabCallbackDefault(this.f$0));
                int i3 = 14 / 0;
            } else {
                numValueOf = Integer.valueOf(CreditHomeActivity.IAuthTabCallbackDefault(this.f$0));
            }
            int i4 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return numValueOf;
        }
    });
    private final Lazy isEngagementSignalsApiAvailable = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda28
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Integer numValueOf = Integer.valueOf(CreditHomeActivity.onWarmupCompleted(this.f$0));
            int i4 = onNavigationEvent + 33;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return numValueOf;
        }
    });
    private final Lazy mayLaunchUrl = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda29
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Integer numValueOf = Integer.valueOf(CreditHomeActivity.onNavigationEvent());
            int i4 = onExtraCallbackWithResult + 107;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return numValueOf;
        }
    });
    private final Lazy ICustomTabsCallbackStubProxy = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda31
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Integer numValueOf = Integer.valueOf(CreditHomeActivity.setEngagementSignalsCallback());
            if (i3 == 0) {
                int i4 = 82 / 0;
            }
            return numValueOf;
        }
    });
    private final Lazy ICustomTabsCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda32
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            Integer numValueOf;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                numValueOf = Integer.valueOf(CreditHomeActivity.readTypedObject(this.f$0));
                int i3 = 42 / 0;
            } else {
                numValueOf = Integer.valueOf(CreditHomeActivity.readTypedObject(this.f$0));
            }
            int i4 = onNavigationEvent + 41;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return numValueOf;
        }
    });
    private AtomicBoolean newSession = new AtomicBoolean(false);

    public static final /* synthetic */ class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[enablePreloadClassOpt.values().length];
            try {
                iArr[enablePreloadClassOpt.KCB.ordinal()] = 1;
                int i = IAuthTabCallback + 23;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[enablePreloadClassOpt.NICE.ordinal()] = 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[enablePreloadClassOpt.BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onWarmupCompleted = iArr;
            int[] iArr2 = new int[enableNebulaServiceInitOpt.values().length];
            try {
                iArr2[enableNebulaServiceInitOpt.KCB.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[enableNebulaServiceInitOpt.NICE.ordinal()] = 2;
                int i5 = IAuthTabCallback + 99;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            onExtraCallbackWithResult = iArr2;
        }
    }

    static final class ICustomTabsCallbackStub extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        ICustomTabsCallbackStub(access13800<? super ICustomTabsCallbackStub> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = CreditHomeActivity.onWarmupCompleted(CreditHomeActivity.this, (access13800) this);
            if (i3 != 0) {
                int i4 = 26 / 0;
            }
            return objOnWarmupCompleted;
        }
    }

    static final class onRelationshipValidationResult extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onRelationshipValidationResult(access13800<? super onRelationshipValidationResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = CreditHomeActivity.IAuthTabCallback(CreditHomeActivity.this, (access13800) this);
            if (i3 == 0) {
                int i4 = 13 / 0;
            }
            return objIAuthTabCallback;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, short s2) {
        int i;
        int i2;
        int i3 = (s * 4) + 1;
        byte[] bArr = $$a;
        int i4 = 4 - (s2 * 3);
        int i5 = 105 - (b * 2);
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            int i7 = i3;
            i5 = (-i5) + i7;
            i4 = i6 + 1;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            byte b2 = bArr[i4];
            int i8 = i4;
            i7 = i5;
            i5 = b2;
            i6 = i8;
            i5 = (-i5) + i7;
            i4 = i6 + 1;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i3) {
            }
        }
    }

    static {
        ICustomTabsServiceDefault = 0;
        ICustomTabsServiceStubProxy();
        Companion = new onExtraCallback(null);
        IAuthTabCallbackDefault = 8;
        int i = updateVisuals + 117;
        ICustomTabsServiceDefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 31;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitITrustedWebActivityServiceStubProxy = ITrustedWebActivityServiceStubProxy();
        int i4 = warmup + 31;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unitITrustedWebActivityServiceStubProxy;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 49;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitReceiveFile = receiveFile(creditHomeActivity);
        int i4 = ICustomTabsServiceStub + 35;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return unitReceiveFile;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditHomeActivity creditHomeActivity, Rally rally, Rally rally2, int i, enableNebulaServiceInitOpt enablenebulaserviceinitopt, int i2, enablePreloadClassOpt enablepreloadclassopt) {
        int i3 = 2 % 2;
        int i4 = ICustomTabsServiceStub + 33;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditHomeActivity, rally, rally2, i, enablenebulaserviceinitopt, i2, enablepreloadclassopt);
        int i6 = ICustomTabsServiceStub + 67;
        warmup = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 20 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditHomeActivity creditHomeActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 27;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditHomeActivity, setDetectableSize);
        int i4 = ICustomTabsServiceStub + 65;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditHomeActivity creditHomeActivity, liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = warmup + 97;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        Unit unit = (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 523720690, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity, litetrackwatchdoghandlerthreadopt, setDetectableSize}, iOnWarmupCompleted3, -523720648);
        int i4 = warmup + 37;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditHomeActivity creditHomeActivity, toFlameGraphLine toflamegraphline, enableOverridePendingTransitionNew enableoverridependingtransitionnew, LottieAnimationView lottieAnimationView, Function0 function0) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 47;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(creditHomeActivity, toflamegraphline, enableoverridependingtransitionnew, lottieAnimationView, function0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(creditHomeActivity, toflamegraphline, enableoverridependingtransitionnew, lottieAnimationView, function0);
        int i3 = ICustomTabsServiceStub + 67;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = warmup + 15;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(gettypedexportedconstants, view);
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
        int i5 = ICustomTabsServiceStub + 113;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(toFlameGraphLine toflamegraphline, CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew) {
        int i = 2 % 2;
        int i2 = warmup + 7;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(toflamegraphline, creditHomeActivity, enableoverridependingtransitionnew);
        int i4 = ICustomTabsServiceStub + 33;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(toFlameGraphLine toflamegraphline, enableOverridePendingTransitionNew enableoverridependingtransitionnew) {
        int i = 2 % 2;
        int i2 = warmup + 119;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(toflamegraphline, enableoverridependingtransitionnew);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(toflamegraphline, enableoverridependingtransitionnew);
        int i3 = warmup + 109;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void IAuthTabCallback(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 87;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onTransact(creditHomeActivity, enableoverridependingtransitionnew);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = warmup + 7;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ int IAuthTabCallbackDefault(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = warmup + 25;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int iPostMessage = postMessage(creditHomeActivity);
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        return iPostMessage;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        boolean zBooleanValue;
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 3;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {creditHomeActivity};
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted4 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        if (i3 != 0) {
            zBooleanValue = ((Boolean) onNavigationEvent(iOnWarmupCompleted4, -1797886763, iOnWarmupCompleted, iOnWarmupCompleted2, objArr2, iOnWarmupCompleted3, 1797886768)).booleanValue();
            int i4 = 45 / 0;
        } else {
            zBooleanValue = ((Boolean) onNavigationEvent(iOnWarmupCompleted4, -1797886763, iOnWarmupCompleted, iOnWarmupCompleted2, objArr2, iOnWarmupCompleted3, 1797886768)).booleanValue();
        }
        int i5 = warmup + 109;
        ICustomTabsServiceStub = i5 % 128;
        int i6 = i5 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 23;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(creditHomeActivity, enableoverridependingtransitionnew);
        int i4 = ICustomTabsServiceStub + 95;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ String IAuthTabCallback_Parcel(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 91;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            return newSession(creditHomeActivity);
        }
        newSession(creditHomeActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void ICustomTabsCallback(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = warmup + 115;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        updateVisuals(creditHomeActivity);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStub(Object[] objArr) {
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 5;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(creditHomeActivity, iEngagementSignalsCallbackDefault);
        }
        onWarmupCompleted(creditHomeActivity, iEngagementSignalsCallbackDefault);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) throws Throwable {
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        switchJudgment switchjudgment = (switchJudgment) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = warmup + 95;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(creditHomeActivity, switchjudgment, setDetectableSize);
        int i4 = ICustomTabsServiceStub + 109;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object ICustomTabsCallback_Parcel(Object[] objArr) {
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 121;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int iMayLaunchUrl = mayLaunchUrl(creditHomeActivity);
        int i4 = ICustomTabsServiceStub + 71;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return Integer.valueOf(iMayLaunchUrl);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 57;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {creditHomeActivity, Float.valueOf(fFloatValue)};
        Unit unit = (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -660509935, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr2, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 660509947);
        int i4 = warmup + 3;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void access000(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 19;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        newSessionWithExtras(creditHomeActivity);
        int i4 = warmup + 71;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ String access100(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = warmup + 123;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        String str = (String) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -193314290, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity}, iOnWarmupCompleted3, 193314298);
        int i4 = warmup + 69;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static /* synthetic */ int asBinder(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 7;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iIntValue = ((Integer) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1640834940, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity}, iOnWarmupCompleted3, 1640834984)).intValue();
        int i4 = warmup + 89;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return iIntValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void asInterface(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 11;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        access100(creditHomeActivity, enableoverridependingtransitionnew);
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
    }

    public static /* synthetic */ void extraCallbackWithResult(CreditHomeActivity creditHomeActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 105;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1642812398, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity}, iOnWarmupCompleted3, 1642812447);
            int i3 = 99 / 0;
        } else {
            int iOnWarmupCompleted4 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted5 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted6 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1642812398, iOnWarmupCompleted4, iOnWarmupCompleted5, new Object[]{creditHomeActivity}, iOnWarmupCompleted6, 1642812447);
        }
        int i4 = ICustomTabsServiceStub + 29;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object extraCommand(Object[] objArr) throws Throwable {
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        switchJudgment switchjudgment = (switchJudgment) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 29;
        warmup = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(creditHomeActivity, switchjudgment, setDetectableSize);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditHomeActivity, switchjudgment, setDetectableSize);
        int i3 = ICustomTabsServiceStub + 63;
        warmup = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ boolean getInterfaceDescriptor(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = warmup + 53;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            requestPostMessageChannel(creditHomeActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zRequestPostMessageChannel = requestPostMessageChannel(creditHomeActivity);
        int i3 = ICustomTabsServiceStub + 79;
        warmup = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 12 / 0;
        }
        return zRequestPostMessageChannel;
    }

    private static /* synthetic */ Object newSession(Object[] objArr) {
        int iIntValue;
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 113;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            iIntValue = ((Integer) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1188003075, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity}, iOnWarmupCompleted3, -1188003035)).intValue();
            int i3 = 60 / 0;
        } else {
            int iOnWarmupCompleted4 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted5 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted6 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            iIntValue = ((Integer) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1188003075, iOnWarmupCompleted4, iOnWarmupCompleted5, new Object[]{creditHomeActivity}, iOnWarmupCompleted6, -1188003035)).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static /* synthetic */ boolean onActivityResized(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = warmup + 83;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zValidateRelationship = validateRelationship(creditHomeActivity);
        int i4 = ICustomTabsServiceStub + 87;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return zValidateRelationship;
        }
        throw null;
    }

    public static /* synthetic */ int onExtraCallback(CreditHomeActivity creditHomeActivity) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = warmup + 63;
        ICustomTabsServiceStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            isEngagementSignalsApiAvailable(creditHomeActivity);
            obj.hashCode();
            throw null;
        }
        int iIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(creditHomeActivity);
        int i3 = warmup + 73;
        ICustomTabsServiceStub = i3 % 128;
        if (i3 % 2 == 0) {
            return iIsEngagementSignalsApiAvailable;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 73;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditHomeActivity, enableoverridependingtransitionnew, setDetectableSize);
        int i4 = warmup + 21;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditHomeActivity creditHomeActivity, switchJudgment switchjudgment, getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 55;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        Unit unit = (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1713273442, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity, switchjudgment, gettypedexportedconstants, view}, iOnWarmupCompleted3, 1713273459);
        int i4 = ICustomTabsServiceStub + 41;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditHomeActivity creditHomeActivity, toFlameGraphLine toflamegraphline, float f) {
        int i = 2 % 2;
        int i2 = warmup + 61;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(creditHomeActivity, toflamegraphline, f);
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(toFlameGraphLine toflamegraphline, CreditHomeActivity creditHomeActivity, enableNebulaServiceInitOpt enablenebulaserviceinitopt) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 7;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(toflamegraphline, creditHomeActivity, enablenebulaserviceinitopt);
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(toFlameGraphLine toflamegraphline, enableOverridePendingTransitionNew enableoverridependingtransitionnew) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 29;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(toflamegraphline, enableoverridependingtransitionnew);
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onExtraCallback(CreditHomeActivity creditHomeActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 75;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 772732079, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity, view}, iOnWarmupCompleted3, -772732073);
        int i4 = warmup + 1;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallback(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 21;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        asBinder(creditHomeActivity, enableoverridependingtransitionnew);
        int i4 = ICustomTabsServiceStub + 117;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ String onExtraCallbackWithResult(CreditHomeActivity creditHomeActivity) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = warmup + 3;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            return warmup(creditHomeActivity);
        }
        warmup(creditHomeActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditHomeActivity creditHomeActivity, float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 111;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(creditHomeActivity, f);
        }
        onNavigationEvent(creditHomeActivity, f);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew, enableNebulaServiceInitOpt enablenebulaserviceinitopt, View view) {
        int i = 2 % 2;
        int i2 = warmup + 103;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(creditHomeActivity, enableoverridependingtransitionnew, enablenebulaserviceinitopt, view);
        int i4 = warmup + 103;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew, enablePreloadClassOpt enablepreloadclassopt) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 41;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(creditHomeActivity, enableoverridependingtransitionnew, enablepreloadclassopt);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditHomeActivity, enableoverridependingtransitionnew, enablepreloadclassopt);
        int i3 = ICustomTabsServiceStub + 29;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditHomeActivity creditHomeActivity, enablePreloadClassOpt enablepreloadclassopt) {
        int i = 2 % 2;
        int i2 = warmup + 45;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(creditHomeActivity, enablepreloadclassopt);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(creditHomeActivity, enablepreloadclassopt);
        int i3 = ICustomTabsServiceStub + 73;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditHomeActivity creditHomeActivity, liteTrackWatchDogHandlerThreadOpt.access000 access000Var, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = warmup + 63;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(creditHomeActivity, access000Var, commonModule_setLeftEdgeTouchEnabled);
        int i4 = ICustomTabsServiceStub + 85;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditHomeActivity creditHomeActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 53;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(creditHomeActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(toFlameGraphLine toflamegraphline, float f) {
        int i = 2 % 2;
        int i2 = warmup + 5;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -902313627, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{toflamegraphline, Float.valueOf(f)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 902313629);
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(CreditHomeActivity creditHomeActivity, String str, Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 41;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1200932416, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity, str, bundle}, iOnWarmupCompleted3, -1200932383);
        int i4 = ICustomTabsServiceStub + 7;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 63;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        getInterfaceDescriptor(creditHomeActivity, enableoverridependingtransitionnew);
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
    }

    public static /* synthetic */ int onMinimized(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 77;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        int iICustomTabsService = ICustomTabsService(creditHomeActivity);
        int i4 = warmup + 111;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return iICustomTabsService;
    }

    public static /* synthetic */ int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 97;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        int i4 = ICustomTabsServiceStub + 31;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return iAudioAttributesCompatParcelizer;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [android.app.Activity, im.toss.feature.credit.ui.main.home.CreditHomeActivity] */
    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        String strIntern;
        boolean z;
        Function1 function1;
        Bundle bundle;
        boolean z2;
        int i7;
        int i8 = ~i6;
        int i9 = ~i2;
        int i10 = ~((~i3) | i9);
        int i11 = i3 | i9;
        int i12 = i2 + i6 + i4 + ((-189913888) * i5) + ((-1809372279) * i);
        int i13 = i12 * i12;
        int i14 = (((-554582804) * i2) - 1671495680) + (10634006 * i6) + (i8 * 282608405) + (282608405 * i10) + ((-282608405) * i11) + ((-271974400) * i4) + (952107008 * i5) + (1092222976 * i) + ((-70844416) * i13);
        int i15 = (i2 * 986545540) + 223666697 + (i6 * 986543778) + (i8 * (-881)) + (i10 * (-881)) + (i11 * 881) + (i4 * 986544659) + (i5 * 1843362976) + (i * (-1872984789)) + (i13 * (-2050686976));
        switch (i14 + (i15 * i15 * 1179713536)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                ?? r1 = (CreditHomeActivity) objArr[0];
                int i16 = 2 % 2;
                int i17 = ICustomTabsServiceStub + 119;
                warmup = i17 % 128;
                int i18 = i17 % 2;
                SessionTrackerb sessionTrackerbValidateRelationship = r1.validateRelationship();
                if (i18 == 0) {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{10030, 50049, 61055, 35523, 46475, 20580, 31940, 26545, 614, 11926, 51688, 62513, 37074, 48058, 42502, 17118, 28068, 2064, 13458, 57250, 64012, 59123, 33199, 44125, 18673, 29625, 7685, 15075, 9554}, 58537 - (ViewConfiguration.getMinimumFlingVelocity() + 15), objArr2);
                    strIntern = ((String) objArr2[0]).intern();
                    z = false;
                    function1 = null;
                    bundle = null;
                    z2 = true;
                    i7 = 29;
                } else {
                    Object[] objArr3 = new Object[1];
                    a(new char[]{10030, 50049, 61055, 35523, 46475, 20580, 31940, 26545, 614, 11926, 51688, 62513, 37074, 48058, 42502, 17118, 28068, 2064, 13458, 57250, 64012, 59123, 33199, 44125, 18673, 29625, 7685, 15075, 9554}, 58537 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr3);
                    strIntern = ((String) objArr3[0]).intern();
                    z = false;
                    function1 = null;
                    bundle = null;
                    z2 = false;
                    i7 = 60;
                }
                SessionTrackerb.IAuthTabCallback(sessionTrackerbValidateRelationship, (Activity) r1, strIntern, z, function1, bundle, z2, i7, (Object) null);
                return null;
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return onTransact(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return asInterface(objArr);
            case 10:
                CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
                enableOverridePendingTransitionNew enableoverridependingtransitionnew = (enableOverridePendingTransitionNew) objArr[1];
                int i19 = 2 % 2;
                int i20 = ICustomTabsServiceStub + 13;
                warmup = i20 % 128;
                int i21 = i20 % 2;
                access000(creditHomeActivity, enableoverridependingtransitionnew);
                int i22 = ICustomTabsServiceStub + 77;
                warmup = i22 % 128;
                int i23 = i22 % 2;
                return null;
            case 11:
                return IAuthTabCallbackStub(objArr);
            case LiveCheckConstants.SVC_U1 /* 12 */:
                return getInterfaceDescriptor(objArr);
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                return IAuthTabCallback_Parcel(objArr);
            case 14:
                return IAuthTabCallbackStubProxy(objArr);
            case 15:
                return access000(objArr);
            case 16:
                CreditHomeActivity creditHomeActivity2 = (CreditHomeActivity) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i24 = 2 % 2;
                int i25 = ICustomTabsServiceStub + 63;
                warmup = i25 % 128;
                int i26 = i25 % 2;
                if (zBooleanValue) {
                    creditHomeActivity2.IEngagementSignalsCallback_Parcel().access000.onExtraCallback().setVisibility(8);
                    creditHomeActivity2.IEngagementSignalsCallback_Parcel().readTypedObject.onExtraCallback().setVisibility(8);
                } else {
                    creditHomeActivity2.IEngagementSignalsCallback_Parcel().access000.onExtraCallback().setVisibility(0);
                    creditHomeActivity2.IEngagementSignalsCallback_Parcel().readTypedObject.onExtraCallback().setVisibility(0);
                    int i27 = warmup + 15;
                    ICustomTabsServiceStub = i27 % 128;
                    int i28 = i27 % 2;
                }
                creditHomeActivity2.IEngagementSignalsCallback_Parcel().getInterfaceDescriptor.onExtraCallback().setVisibility(8);
                creditHomeActivity2.IEngagementSignalsCallback_Parcel().access100.onExtraCallback().setVisibility(8);
                creditHomeActivity2.IEngagementSignalsCallback_Parcel().asBinder.setVisibility(8);
                creditHomeActivity2.IEngagementSignalsCallback_Parcel().onExtraCallbackWithResult.setVisibility(8);
                creditHomeActivity2.IEngagementSignalsCallback_Parcel().IAuthTabCallback.setVisibility(8);
                creditHomeActivity2.IEngagementSignalsCallback_Parcel().onNavigationEvent.setVisibility(8);
                creditHomeActivity2.IEngagementSignalsCallback_Parcel().extraCallbackWithResult.setVisibility(8);
                creditHomeActivity2.IEngagementSignalsCallback_Parcel().IAuthTabCallbackStubProxy.setVisibility(8);
                creditHomeActivity2.IEngagementSignalsCallback_Parcel().IAuthTabCallback_Parcel.setVisibility(8);
                creditHomeActivity2.IAuthTabCallback(false);
                creditHomeActivity2.ITrustedWebActivityService().ICustomTabsCallbackDefault();
                return null;
            case 17:
                return access100(objArr);
            case UCPApiConstants.MULTI_UICC_MIN_SEIOAGENT_VERSION_CODE /* 18 */:
                boolean zBooleanValue2 = ((Boolean) objArr[0]).booleanValue();
                ScoreDeltaInfo scoreDeltaInfo = (ScoreDeltaInfo) objArr[1];
                String str = (String) objArr[2];
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[3];
                int i29 = 2 % 2;
                int i30 = ICustomTabsServiceStub + 9;
                warmup = i30 % 128;
                int i31 = i30 % 2;
                Unit unitOnExtraCallback = onExtraCallback(zBooleanValue2, scoreDeltaInfo, str, setDetectableSize);
                int i32 = warmup + 1;
                ICustomTabsServiceStub = i32 % 128;
                int i33 = i32 % 2;
                return unitOnExtraCallback;
            case 19:
                final CreditHomeActivity creditHomeActivity3 = (CreditHomeActivity) objArr[0];
                final enableOverridePendingTransitionNew enableoverridependingtransitionnew2 = (enableOverridePendingTransitionNew) objArr[1];
                int i34 = 2 % 2;
                creditHomeActivity3.IEngagementSignalsCallback_Parcel().onWarmupCompleted().post(new Runnable() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        int i35 = 2 % 2;
                        int i36 = onNavigationEvent + 31;
                        onExtraCallbackWithResult = i36 % 128;
                        if (i36 % 2 == 0) {
                            CreditHomeActivity.IAuthTabCallback(this.f$0, enableoverridependingtransitionnew2);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        CreditHomeActivity.IAuthTabCallback(this.f$0, enableoverridependingtransitionnew2);
                        int i37 = onExtraCallbackWithResult + 21;
                        onNavigationEvent = i37 % 128;
                        int i38 = i37 % 2;
                    }
                });
                creditHomeActivity3.IEngagementSignalsCallback_Parcel().onWarmupCompleted().postDelayed(new Runnable() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i35 = 2 % 2;
                        int i36 = onWarmupCompleted + 61;
                        onExtraCallbackWithResult = i36 % 128;
                        Object obj = null;
                        if (i36 % 2 != 0) {
                            CreditHomeActivity.onExtraCallback(this.f$0, enableoverridependingtransitionnew2);
                            obj.hashCode();
                            throw null;
                        }
                        CreditHomeActivity.onExtraCallback(this.f$0, enableoverridependingtransitionnew2);
                        int i37 = onWarmupCompleted + 3;
                        onExtraCallbackWithResult = i37 % 128;
                        if (i37 % 2 != 0) {
                            throw null;
                        }
                    }
                }, creditHomeActivity3.setEngagementSignalsCallback);
                int i35 = warmup + 47;
                ICustomTabsServiceStub = i35 % 128;
                int i36 = i35 % 2;
                return null;
            case 20:
                return extraCallback(objArr);
            case 21:
                return writeTypedObject(objArr);
            case 22:
                return ICustomTabsCallback(objArr);
            case 23:
                return readTypedObject(objArr);
            case 24:
                return extraCallbackWithResult(objArr);
            case 25:
                return onActivityResized(objArr);
            case 26:
                return onMinimized(objArr);
            case 27:
                return onMessageChannelReady(objArr);
            case 28:
                return onPostMessage(objArr);
            case 29:
                return onActivityLayout(objArr);
            case 30:
                return onRelationshipValidationResult(objArr);
            case 31:
                return ICustomTabsCallbackDefault(objArr);
            case 32:
                return ICustomTabsCallbackStubProxy(objArr);
            case 33:
                return onUnminimized(objArr);
            case 34:
                return ICustomTabsCallbackStub(objArr);
            case 35:
                CreditHomeActivity creditHomeActivity4 = (CreditHomeActivity) objArr[0];
                int i37 = 2 % 2;
                int i38 = warmup + 55;
                ICustomTabsServiceStub = i38 % 128;
                int i39 = i38 % 2;
                CreditHomeViewModel creditHomeViewModelITrustedWebActivityService = creditHomeActivity4.ITrustedWebActivityService();
                int i40 = ICustomTabsServiceStub + 83;
                warmup = i40 % 128;
                int i41 = i40 % 2;
                return creditHomeViewModelITrustedWebActivityService;
            case 36:
                return extraCommand(objArr);
            case 37:
                return isEngagementSignalsApiAvailable(objArr);
            case 38:
                return ICustomTabsCallback_Parcel(objArr);
            case 39:
                return ICustomTabsService(objArr);
            case 40:
                return mayLaunchUrl(objArr);
            case 41:
                return prefetch(objArr);
            case 42:
                return postMessage(objArr);
            case 43:
                return newSessionWithExtras(objArr);
            case 44:
                return newAuthTabSession(objArr);
            case 45:
                return newSession(objArr);
            case 46:
                return prefetchWithMultipleUrls(objArr);
            case 47:
                return receiveFile(objArr);
            case 48:
                return setEngagementSignalsCallback(objArr);
            case 49:
                return requestPostMessageChannelWithExtras(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt = (liteTrackWatchDogHandlerThreadOpt) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 9;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(creditHomeActivity, litetrackwatchdoghandlerthreadopt, setDetectableSize);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(creditHomeActivity, litetrackwatchdoghandlerthreadopt, setDetectableSize);
        int i3 = warmup + 89;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditHomeActivity creditHomeActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 55;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(creditHomeActivity, setDetectableSize);
        }
        onExtraCallback(creditHomeActivity, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 11;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(creditHomeActivity, enableoverridependingtransitionnew, str, setDetectableSize);
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        int i5 = ICustomTabsServiceStub + 87;
        warmup = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew, enableNebulaServiceInitOpt enablenebulaserviceinitopt, View view) {
        int i = 2 % 2;
        int i2 = warmup + 57;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            return (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -286460562, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity, enableoverridependingtransitionnew, enablenebulaserviceinitopt, view}, iOnWarmupCompleted3, 286460582);
        }
        int iOnWarmupCompleted4 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted5 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted6 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditHomeActivity creditHomeActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 71;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(creditHomeActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditHomeActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        int i3 = ICustomTabsServiceStub + 109;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, ScoreDeltaInfo scoreDeltaInfo, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 11;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(z, scoreDeltaInfo, str, setDetectableSize);
        }
        IAuthTabCallback(z, scoreDeltaInfo, str, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(CreditHomeActivity creditHomeActivity, enableNebulaServiceInitOpt enablenebulaserviceinitopt, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 75;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(creditHomeActivity, enablenebulaserviceinitopt, view);
        int i4 = ICustomTabsServiceStub + 125;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onNavigationEvent(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew) {
        int i = 2 % 2;
        int i2 = warmup + 39;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        IAuthTabCallbackStubProxy(creditHomeActivity, enableoverridependingtransitionnew);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = warmup + 117;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 39;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            return (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 857349904, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity, iEngagementSignalsCallbackDefault}, iOnWarmupCompleted3, -857349878);
        }
        int iOnWarmupCompleted4 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted5 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted6 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        Unit unit = (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 857349904, iOnWarmupCompleted4, iOnWarmupCompleted5, new Object[]{creditHomeActivity, iEngagementSignalsCallbackDefault}, iOnWarmupCompleted6, -857349878);
        int i3 = 34 / 0;
        return unit;
    }

    private static /* synthetic */ Object onRelationshipValidationResult(Object[] objArr) {
        enableOverridePendingTransitionNew enableoverridependingtransitionnew = (enableOverridePendingTransitionNew) objArr[0];
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[1];
        enableNebulaServiceInitOpt enablenebulaserviceinitopt = (enableNebulaServiceInitOpt) objArr[2];
        View view = (View) objArr[3];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 13;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        Unit unit = (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1727907300, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{enableoverridependingtransitionnew, creditHomeActivity, enablenebulaserviceinitopt, view}, iOnWarmupCompleted3, 1727907346);
        int i4 = warmup + 75;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return unit;
    }

    public static /* synthetic */ int onTransact(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = warmup + 67;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            return extraCommand(creditHomeActivity);
        }
        extraCommand(creditHomeActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ int onWarmupCompleted(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = warmup + 23;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            return ICustomTabsServiceDefault(creditHomeActivity);
        }
        ICustomTabsServiceDefault(creditHomeActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 119;
        warmup = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            prefetchWithMultipleUrls(creditHomeActivity);
            obj.hashCode();
            throw null;
        }
        Unit unitPrefetchWithMultipleUrls = prefetchWithMultipleUrls(creditHomeActivity);
        int i3 = ICustomTabsServiceStub + 85;
        warmup = i3 % 128;
        if (i3 % 2 != 0) {
            return unitPrefetchWithMultipleUrls;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LottieAnimationView lottieAnimationView, CreditHomeActivity creditHomeActivity, toFlameGraphLine toflamegraphline) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 13;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(lottieAnimationView, creditHomeActivity, toflamegraphline);
        int i4 = warmup + 85;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ int readTypedObject(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = warmup + 113;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int iRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(creditHomeActivity);
        int i4 = warmup + 69;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return iRequestPostMessageChannelWithExtras;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int iIntValue3 = ((Number) objArr[3]).intValue();
        int iIntValue4 = ((Number) objArr[4]).intValue();
        int iIntValue5 = ((Number) objArr[5]).intValue();
        int iIntValue6 = ((Number) objArr[6]).intValue();
        View view = (View) objArr[7];
        WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) objArr[8];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 121;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(creditHomeActivity, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, view, windowInsetsCompat);
        }
        onWarmupCompleted(creditHomeActivity, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, view, windowInsetsCompat);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object receiveFile(Object[] objArr) throws Throwable {
        liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt = (liteTrackWatchDogHandlerThreadOpt) objArr[0];
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[1];
        DialogInterface dialogInterface = (DialogInterface) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 45;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(litetrackwatchdoghandlerthreadopt, creditHomeActivity, dialogInterface);
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ int setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = warmup + 85;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iIntValue = ((Integer) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 920321322, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[0], iOnWarmupCompleted3, -920321283)).intValue();
        int i4 = warmup + 55;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 111;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess200 = access200(creditHomeActivity);
        int i4 = warmup + 53;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAccess200;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String writeTypedObject(CreditHomeActivity creditHomeActivity) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = warmup + 17;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            newAuthTabSession(creditHomeActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strNewAuthTabSession = newAuthTabSession(creditHomeActivity);
        int i3 = warmup + 103;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        return strNewAuthTabSession;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = warmup + 75;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            return -1L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class isEngagementSignalsApiAvailable implements Function0<checkInterval> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Activity onNavigationEvent;

        public isEngagementSignalsApiAvailable(Activity activity) {
            this.onNavigationEvent = activity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnWarmupCompleted = onWarmupCompleted();
            int i4 = onExtraCallback + 27;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return searchBarKtExternalSyntheticLambda5OnWarmupCompleted;
        }

        public final checkInterval onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            LayoutInflater layoutInflater = this.onNavigationEvent.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            checkInterval checkintervalOnNavigationEvent = checkInterval.onNavigationEvent(layoutInflater);
            int i4 = IAuthTabCallback + 95;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return checkintervalOnNavigationEvent;
            }
            throw null;
        }
    }

    public static final class ICustomTabsCallbackStubProxy implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        private static int IAuthTabCallback = 1;
        public static final ICustomTabsCallbackStubProxy onExtraCallback = new ICustomTabsCallbackStubProxy();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public final void IAuthTabCallback(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            if (i3 != 0) {
                int i4 = 33 / 0;
            }
            int i5 = onNavigationEvent + 51;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((initMiniApp.onWarmupCompleted) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 43;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    public static final class IAuthTabCallbackDefault implements View.OnLayoutChangeListener {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ enablePreloadClassOpt IAuthTabCallback;

        public IAuthTabCallbackDefault(enablePreloadClassOpt enablepreloadclassopt) {
            this.IAuthTabCallback = enablepreloadclassopt;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Throwable {
            int i9 = 2 % 2;
            int i10 = onNavigationEvent + 67;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 != 0) {
                view.removeOnLayoutChangeListener(this);
                CreditHomeActivity.onWarmupCompleted(CreditHomeActivity.this, this.IAuthTabCallback);
                int i11 = 6 / 0;
            } else {
                view.removeOnLayoutChangeListener(this);
                CreditHomeActivity.onWarmupCompleted(CreditHomeActivity.this, this.IAuthTabCallback);
            }
        }
    }

    public static final class onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long IAuthTabCallback = -3976970439743345188L;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i3 = $11 + 89;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (Process.myTid() >> 22)), 84 - TextUtils.getCapsMode("", 0, 0), 21233 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - Color.red(0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 18, 8808 - (ViewConfiguration.getTouchSlop() >> 8), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
            int i6 = $11 + 123;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            objArr[0] = str;
        }

        private onExtraCallback() {
        }

        public final Intent onNavigationEvent(@NotNull Context context, @NotNull String str, int i, boolean z) throws Throwable {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) CreditHomeActivity.class);
            intent.setPackage(context.getPackageName());
            Object[] objArr = new Object[1];
            a(new char[]{15956, 16655, 61577, 38571, 15910, 22458, 56655, 53950, 25958, 13165, 30732, 2409}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, objArr);
            intent.putExtra(((String) objArr[0]).intern(), str);
            intent.putExtra("refresh", String.valueOf(z));
            intent.setFlags(i);
            int i3 = onNavigationEvent + 39;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return intent;
        }
    }

    public static final class IAuthTabCallbackStubProxy implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallbackStubProxy(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallbackWithResult + 29;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class IAuthTabCallback_Parcel implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallback_Parcel(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = onWarmupCompleted + 41;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                if (i4 == 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            throw null;
        }
    }

    public static final class ICustomTabsCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public ICustomTabsCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i4 = IAuthTabCallback + 93;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            int i5 = onWarmupCompleted + 63;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i6 == 0) {
                int i7 = 46 / 0;
            }
            return getspecialfeatureoptinstatus2;
        }
    }

    public static final class ICustomTabsCallback_Parcel implements getAdService {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration IAuthTabCallback;

        public ICustomTabsCallback_Parcel(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus;
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onExtraCallback + 87;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = 55 / 0;
            } else {
                getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            }
            int i4 = onWarmupCompleted + 101;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class ICustomTabsService implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public ICustomTabsService(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = IAuthTabCallback + 115;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i6 = IAuthTabCallback + 7;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class access000 implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public access000(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onWarmupCompleted + 123;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 == 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    public static final class access100 implements getAdService {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onNavigationEvent;

        public access100(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                int i4 = onExtraCallback + 57;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i6 = onWarmupCompleted + 45;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return getspecialfeatureoptinstatus;
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
            int i2 = onExtraCallback + 85;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = IAuthTabCallback + 123;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                if (i4 == 0) {
                    return getspecialfeatureoptinstatus;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onNavigationEvent);
            throw null;
        }
    }

    public static final class getInterfaceDescriptor implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onWarmupCompleted;

        public getInterfaceDescriptor(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallback + 87;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 == 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onActivityLayout implements getAdService {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onActivityLayout(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onExtraCallbackWithResult + 107;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i4 = onExtraCallbackWithResult + 93;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i6 = onExtraCallbackWithResult + 37;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            throw null;
        }
    }

    public static final class extraCommand implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public extraCommand(ComponentActivity componentActivity) {
            this.onWarmupCompleted = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallback = onExtraCallback();
            int i4 = onExtraCallbackWithResult + 113;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedOnExtraCallback;
        }

        public final ViewModelProvider.onWarmupCompleted onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.onWarmupCompleted.getDefaultViewModelProviderFactory();
            int i4 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return defaultViewModelProviderFactory;
        }
    }

    public static final class newSessionWithExtras implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public newSessionWithExtras(ComponentActivity componentActivity) {
            this.onWarmupCompleted = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallback = onExtraCallback();
            if (i3 == 0) {
                int i4 = 46 / 0;
            }
            return onwarmupcompletedOnExtraCallback;
        }

        public final ViewModelProvider.onWarmupCompleted onExtraCallback() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                defaultViewModelProviderFactory = this.onWarmupCompleted.getDefaultViewModelProviderFactory();
                int i3 = 56 / 0;
            } else {
                defaultViewModelProviderFactory = this.onWarmupCompleted.getDefaultViewModelProviderFactory();
            }
            int i4 = IAuthTabCallback + 61;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return defaultViewModelProviderFactory;
        }
    }

    public static final class mayLaunchUrl implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ ComponentActivity onExtraCallbackWithResult;

        public mayLaunchUrl(ComponentActivity componentActivity) {
            this.onExtraCallbackWithResult = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnNavigationEvent = onNavigationEvent();
            int i4 = onExtraCallback + 125;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ComponentActivity componentActivity = this.onExtraCallbackWithResult;
            if (i3 != 0) {
                return componentActivity.getViewModelStore();
            }
            componentActivity.getViewModelStore();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class newAuthTabSession implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ ComponentActivity onExtraCallbackWithResult;

        public newAuthTabSession(ComponentActivity componentActivity) {
            this.onExtraCallbackWithResult = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = onNavigationEvent + 49;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.onExtraCallbackWithResult.getViewModelStore();
            int i4 = onNavigationEvent + 21;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return viewModelStore;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), Gravity.getAbsoluteGravity(0, 0) + 24, 19626 - ExpandableListView.getPackedPositionChild(0L), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (requestPostMessageChannelWithExtras ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 59 - (Process.myPid() >> 22), 6382 - TextUtils.lastIndexOf("", '0', 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i4 = $10 + 83;
                $11 = i4 % 128;
                int i5 = i4 % 2;
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
            int i6 = $10 + 53;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 59 - (ViewConfiguration.getJumpTapTimeout() >> 16), (Process.myTid() >> 22) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 58 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getTapTimeout() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    public static final class newSession implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ ComponentActivity onExtraCallbackWithResult;
        final /* synthetic */ Function0 onWarmupCompleted;

        public newSession(Function0 function0, ComponentActivity componentActivity) {
            this.onWarmupCompleted = function0;
            this.onExtraCallbackWithResult = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                onExtraCallback();
                obj.hashCode();
                throw null;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback = onExtraCallback();
            int i3 = IAuthTabCallback + 13;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
          0x001b: PHI (r1v5 kotlin.jvm.functions.Function0) = (r1v4 kotlin.jvm.functions.Function0), (r1v8 kotlin.jvm.functions.Function0) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallback() {
            Function0 function0;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                function0 = this.onWarmupCompleted;
                int i3 = 18 / 0;
                if (function0 != null) {
                    AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                    if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                        int i4 = IAuthTabCallback + 103;
                        int i5 = i4 % 128;
                        onNavigationEvent = i5;
                        int i6 = i4 % 2;
                        int i7 = i5 + 53;
                        IAuthTabCallback = i7 % 128;
                        if (i7 % 2 != 0) {
                            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                        }
                        throw null;
                    }
                }
            } else {
                function0 = this.onWarmupCompleted;
                if (function0 != null) {
                }
            }
            return this.onExtraCallbackWithResult.getDefaultViewModelCreationExtras();
        }
    }

    public static final class postMessage implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ ComponentActivity onExtraCallback;
        final /* synthetic */ Function0 onWarmupCompleted;

        public postMessage(Function0 function0, ComponentActivity componentActivity) {
            this.onWarmupCompleted = function0;
            this.onExtraCallback = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = IAuthTabCallback + 5;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 81 / 0;
            }
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallbackWithResult() {
            int i = 2 % 2;
            Function0 function0 = this.onWarmupCompleted;
            if (function0 != null) {
                int i2 = onNavigationEvent + 89;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                    int i4 = onNavigationEvent + 121;
                    int i5 = i4 % 128;
                    IAuthTabCallback = i5;
                    if (i4 % 2 != 0) {
                        int i6 = 79 / 0;
                    }
                    int i7 = i5 + 85;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                }
            }
            return this.onExtraCallback.getDefaultViewModelCreationExtras();
        }
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 42195;
        private static int asInterface = 1;
        private static int onExtraCallback = 0;
        private static char onExtraCallbackWithResult = 53445;
        private static char onNavigationEvent = 47946;
        private static char onWarmupCompleted = 21621;
        final /* synthetic */ boolean $finishInit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(boolean z, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$finishInit = z;
        }

        public static /* synthetic */ Unit onExtraCallback(CreditHomeActivity creditHomeActivity, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(creditHomeActivity, setDetectableSize);
            int i4 = onExtraCallback + 27;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return unitIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
            onUnavailable onunavailable = (onUnavailable) objArr[1];
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = onWarmupCompleted(creditHomeActivity, onunavailable);
            if (i3 == 0) {
                int i4 = 8 / 0;
            }
            return unitOnWarmupCompleted;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(CreditHomeActivity creditHomeActivity, getTime gettime) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(creditHomeActivity, gettime);
            int i4 = onExtraCallback + 31;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return unitIAuthTabCallback;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            Unit unit;
            CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
            int i = 2 % 2;
            int i2 = asInterface + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr2 = {creditHomeActivity};
            int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = lt.40.onExtraCallbackWithResult();
            if (i3 != 0) {
                unit = (Unit) onWarmupCompleted(iOnExtraCallbackWithResult3, -2138050994, 2138050997, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, objArr2, iOnExtraCallbackWithResult4);
                int i4 = 79 / 0;
            } else {
                unit = (Unit) onWarmupCompleted(iOnExtraCallbackWithResult3, -2138050994, 2138050997, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, objArr2, iOnExtraCallbackWithResult4);
            }
            int i5 = onExtraCallback + 123;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        public static /* synthetic */ Unit onNavigationEvent(CreditHomeActivity creditHomeActivity) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(creditHomeActivity);
            int i4 = asInterface + 1;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unitIAuthTabCallback;
            }
            throw null;
        }

        public static /* synthetic */ Unit onNavigationEvent(CreditHomeActivity creditHomeActivity, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 3;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            Unit unitOnWarmupCompleted = onWarmupCompleted(creditHomeActivity, z, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i5 = onExtraCallback + 85;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return unitOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
            int i7 = ~i3;
            int i8 = ~i5;
            int i9 = ~(i7 | i8);
            int i10 = i2 | i9;
            int i11 = ~i2;
            int i12 = i9 | (~(i11 | i3));
            int i13 = (~(i5 | i7 | i2)) | (~(i8 | i11 | i7));
            int i14 = i3 + i2 + i4 + ((-619979367) * i) + (68302741 * i6);
            int i15 = i14 * i14;
            int i16 = (i3 * 561304900) + 382271488 + (561304900 * i2) + ((-1585293958) * i10) + (792646979 * i12) + ((-792646979) * i13) + ((-231342080) * i4) + (1615200256 * i) + ((-1821507584) * i6) + (428933120 * i15);
            int i17 = ((i3 * (-96142684)) - 56799437) + (i2 * (-96142684)) + (i10 * 1642) + (i12 * (-821)) + (i13 * 821) + (i4 * (-96141863)) + (i * (-1380774991)) + (i6 * (-1175232947)) + (i15 * (-118947840));
            int i18 = i16 + (i17 * i17 * (-1369505792));
            return i18 != 1 ? i18 != 2 ? i18 != 3 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
            CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
            int iIntValue = ((Number) objArr[3]).intValue();
            int i = 2 % 2;
            int i2 = asInterface + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(creditHomeActivity, zBooleanValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i4 = onExtraCallback + 53;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return unitIAuthTabCallback;
            }
            throw null;
        }

        public static /* synthetic */ Unit onWarmupCompleted(CreditHomeActivity creditHomeActivity, String str) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(creditHomeActivity, str);
            }
            IAuthTabCallback(creditHomeActivity, str);
            throw null;
        }

        public static /* synthetic */ Unit onWarmupCompleted(onUnavailable onunavailable, CreditHomeActivity creditHomeActivity, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(onunavailable, creditHomeActivity, setDetectableSize);
            int i4 = onExtraCallback + 5;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallbackWithResult;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = CreditHomeActivity.this.new asInterface(this.$finishInit, access13800Var);
            int i2 = onExtraCallback + 37;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return asinterface;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = asInterface + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800<? super Unit>) obj2);
            int i4 = asInterface + 105;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            asInterface asinterfaceCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                asinterfaceCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = asinterfaceCreate.invokeSuspend(unit);
            int i4 = onExtraCallback + 29;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 35 / 0;
            }
            return objInvokeSuspend;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (true) {
                Object obj = null;
                if (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent >= cArr.length) {
                    break;
                }
                int i4 = $10 + 83;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i6 = 58224;
                int i7 = i3;
                while (i7 < 16) {
                    int i8 = $11 + 83;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                    int i11 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[1] = Integer.valueOf(i10);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char cMyPid = (char) (Process.myPid() >> 22);
                            int i12 = 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(i3) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i3) == 0.0d ? 0 : -1));
                            int i13 = (TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12434;
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMyPid, i12, i13, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(obj, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), 10 - Color.blue(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7++;
                        cArr3 = cArr4;
                        i3 = 0;
                        obj = null;
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getPressedStateDuration() >> 16)), 14 - (Process.myPid() >> 22), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19900, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            String str = new String(cArr2, 0, i);
            int i14 = $10 + 35;
            $11 = i14 % 128;
            if (i14 % 2 != 0) {
                objArr[0] = str;
            } else {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = asInterface + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            ComposeView composeView = CreditHomeActivity.onPostMessage(CreditHomeActivity.this).IAuthTabCallbackStub;
            final CreditHomeActivity creditHomeActivity = CreditHomeActivity.this;
            final boolean z = this.$finishInit;
            composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-508162809, true, new Function2() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$initHomeScreen$1$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallback + 43;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    CreditHomeActivity creditHomeActivity2 = creditHomeActivity;
                    if (i6 != 0) {
                        return CreditHomeActivity.asInterface.onNavigationEvent(creditHomeActivity2, z, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    CreditHomeActivity.asInterface.onNavigationEvent(creditHomeActivity2, z, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    throw null;
                }
            })));
            CreditHomeActivity.ICustomTabsCallbackDefault(CreditHomeActivity.this).onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 17;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private static final Unit IAuthTabCallback(CreditHomeActivity creditHomeActivity, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{53710, 22721, 57245, 23853, 21537, 6455, 38495, 59829}, 7 - MotionEvent.axisFromString(""), objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), CreditHomeActivity.onMessageChannelReady(creditHomeActivity));
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 61;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final Unit IAuthTabCallback(CreditHomeActivity creditHomeActivity, getTime gettime) throws Throwable {
            Unit unit;
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -503942773, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity, gettime}, iOnWarmupCompleted3, 503942777);
                unit = Unit.INSTANCE;
                int i3 = 82 / 0;
            } else {
                int iOnWarmupCompleted4 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                int iOnWarmupCompleted5 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                int iOnWarmupCompleted6 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -503942773, iOnWarmupCompleted4, iOnWarmupCompleted5, new Object[]{creditHomeActivity, gettime}, iOnWarmupCompleted6, 503942777);
                unit = Unit.INSTANCE;
            }
            int i4 = asInterface + 39;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 74 / 0;
            }
            return unit;
        }

        private static final Unit IAuthTabCallback(CreditHomeActivity creditHomeActivity, String str) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            CreditHomeActivity.onNavigationEvent(creditHomeActivity, str);
            Unit unit = Unit.INSTANCE;
            int i4 = asInterface + 97;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            ((CreditHomeViewModel) CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -986076515, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity}, iOnWarmupCompleted3, 986076550)).IAuthTabCallback();
            Unit unit = Unit.INSTANCE;
            int i4 = asInterface + 101;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static final Unit IAuthTabCallback(CreditHomeActivity creditHomeActivity) {
            int i = 2 % 2;
            int i2 = asInterface + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            ((CreditHomeViewModel) CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -986076515, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity}, iOnWarmupCompleted3, 986076550)).onTransact();
            Unit unit = Unit.INSTANCE;
            int i4 = asInterface + 27;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final Unit onExtraCallbackWithResult(onUnavailable onunavailable, CreditHomeActivity creditHomeActivity, SetDetectableSize setDetectableSize) throws Throwable {
            String strAccess100;
            int i = 2 % 2;
            String strOnExtraCallbackWithResult = null;
            String strAsBinder = onunavailable != null ? onunavailable.asBinder() : null;
            Object[] objArr = new Object[1];
            a(new char[]{41264, 26131, 52991, 14819}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4, objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), strAsBinder);
            if (onunavailable != null) {
                int i2 = asInterface + 91;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                strAccess100 = onunavailable.access100();
            } else {
                strAccess100 = null;
            }
            Object[] objArr2 = new Object[1];
            a(new char[]{19421, 39601, 3867, 35932, 42027, 39107}, (Process.myPid() >> 22) + 5, objArr2);
            setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), strAccess100);
            if (onunavailable != null) {
                int i4 = onExtraCallback + 75;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                strOnExtraCallbackWithResult = onunavailable.onExtraCallbackWithResult();
            }
            setDetectableSize.onExtraCallback("sub_title", strOnExtraCallbackWithResult);
            Object[] objArr3 = new Object[1];
            a(new char[]{53710, 22721, 57245, 23853, 21537, 6455, 38495, 59829}, 9 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr3);
            setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), CreditHomeActivity.onMessageChannelReady(creditHomeActivity));
            Unit unit = Unit.INSTANCE;
            int i6 = onExtraCallback + 75;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        private static final Unit onWarmupCompleted(final CreditHomeActivity creditHomeActivity, final onUnavailable onunavailable) {
            String strAsBinder;
            int i = 2 % 2;
            CreditHomeViewModel creditHomeViewModel = (CreditHomeViewModel) CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -986076515, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{creditHomeActivity}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 986076550);
            Object obj = null;
            if (onunavailable != null) {
                int i2 = onExtraCallback + 11;
                asInterface = i2 % 128;
                if (i2 % 2 == 0) {
                    onunavailable.asBinder();
                    obj.hashCode();
                    throw null;
                }
                strAsBinder = onunavailable.asBinder();
            } else {
                int i3 = asInterface + 53;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                strAsBinder = null;
            }
            CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1330829L, strAsBinder, false, false, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$initHomeScreen$1$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2) throws Throwable {
                    Unit unitOnWarmupCompleted;
                    int i5 = 2 % 2;
                    int i6 = onNavigationEvent + 103;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        unitOnWarmupCompleted = CreditHomeActivity.asInterface.onWarmupCompleted(onunavailable, creditHomeActivity, (SetDetectableSize) obj2);
                        int i7 = 69 / 0;
                    } else {
                        unitOnWarmupCompleted = CreditHomeActivity.asInterface.onWarmupCompleted(onunavailable, creditHomeActivity, (SetDetectableSize) obj2);
                    }
                    int i8 = onNavigationEvent + 125;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        return unitOnWarmupCompleted;
                    }
                    throw null;
                }
            }, 12, (Object) null);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01a7  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01c4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit IAuthTabCallback(final CreditHomeActivity creditHomeActivity, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
            int i2 = 2 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1197270865, i, -1, "im.toss.feature.credit.ui.main.home.CreditHomeActivity.initHomeScreen.<anonymous>.<anonymous>.<anonymous> (CreditHomeActivity.kt:421)");
                }
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditHomeActivity);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                Object obj = null;
                if (!zOnExtraCallback) {
                    int i3 = asInterface + 89;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        obj.hashCode();
                        throw null;
                    }
                    Object obj2 = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function1 function1 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$initHomeScreen$1$$ExternalSyntheticLambda3
                            private static int onNavigationEvent = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj3) throws Throwable {
                                int i4 = 2 % 2;
                                int i5 = onWarmupCompleted + 111;
                                onNavigationEvent = i5 % 128;
                                int i6 = i5 % 2;
                                Unit unitOnExtraCallback = CreditHomeActivity.asInterface.onExtraCallback(creditHomeActivity, (SetDetectableSize) obj3);
                                int i7 = onWarmupCompleted + 13;
                                onNavigationEvent = i7 % 128;
                                int i8 = i7 % 2;
                                return unitOnExtraCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function1);
                        obj2 = function1;
                    }
                    RealImageLoaderexecute3.onNavigationEvent(1213863L, null, null, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResult, 6, 6);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
                    component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                    LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                    CreditHomeViewModel creditHomeViewModel = (CreditHomeViewModel) CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -986076515, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{creditHomeActivity}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 986076550);
                    boolean zICustomTabsCallbackStub = CreditHomeActivity.ICustomTabsCallbackStub(creditHomeActivity);
                    InventoryAdManager inventoryAdManagerUpdateVisuals = creditHomeActivity.updateVisuals();
                    String strOnMessageChannelReady = CreditHomeActivity.onMessageChannelReady(creditHomeActivity);
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditHomeActivity);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnExtraCallback2) {
                        Object obj3 = objOnMinimized2;
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            Function1 function12 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$initHomeScreen$1$$ExternalSyntheticLambda4
                                private static int onExtraCallbackWithResult = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj4) throws Throwable {
                                    int i4 = 2 % 2;
                                    int i5 = onWarmupCompleted + 31;
                                    onExtraCallbackWithResult = i5 % 128;
                                    int i6 = i5 % 2;
                                    CreditHomeActivity creditHomeActivity2 = creditHomeActivity;
                                    String str = (String) obj4;
                                    if (i6 == 0) {
                                        return CreditHomeActivity.asInterface.onWarmupCompleted(creditHomeActivity2, str);
                                    }
                                    CreditHomeActivity.asInterface.onWarmupCompleted(creditHomeActivity2, str);
                                    Object obj5 = null;
                                    obj5.hashCode();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function12);
                            int i4 = asInterface + 41;
                            onExtraCallback = i4 % 128;
                            obj3 = function12;
                            if (i4 % 2 != 0) {
                                int i5 = 2 / 3;
                                obj3 = function12;
                            }
                        }
                        Function1 function13 = (Function1) obj3;
                        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditHomeActivity);
                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!zOnExtraCallback3) {
                            int i6 = onExtraCallback + 21;
                            asInterface = i6 % 128;
                            if (i6 % 2 == 0) {
                                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                throw null;
                            }
                            Object obj4 = objOnMinimized3;
                            if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                Function1 function14 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$initHomeScreen$1$$ExternalSyntheticLambda5
                                    private static int IAuthTabCallback = 0;
                                    private static int onWarmupCompleted = 1;

                                    public final Object invoke(Object obj5) throws Throwable {
                                        int i7 = 2 % 2;
                                        int i8 = onWarmupCompleted + 79;
                                        IAuthTabCallback = i8 % 128;
                                        int i9 = i8 % 2;
                                        Unit unitOnExtraCallbackWithResult = CreditHomeActivity.asInterface.onExtraCallbackWithResult(creditHomeActivity, (getTime) obj5);
                                        int i10 = onWarmupCompleted + 121;
                                        IAuthTabCallback = i10 % 128;
                                        if (i10 % 2 == 0) {
                                            return unitOnExtraCallbackWithResult;
                                        }
                                        Object obj6 = null;
                                        obj6.hashCode();
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function14);
                                int i7 = asInterface + 117;
                                onExtraCallback = i7 % 128;
                                int i8 = i7 % 2;
                                obj4 = function14;
                            }
                            Function1 function15 = (Function1) obj4;
                            boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditHomeActivity);
                            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (!zOnExtraCallback4) {
                                Object obj5 = objOnMinimized4;
                                if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$initHomeScreen$1$$ExternalSyntheticLambda6
                                        private static int IAuthTabCallback = 0;
                                        private static int onNavigationEvent = 1;

                                        public final Object invoke() {
                                            Unit unit;
                                            int i9 = 2 % 2;
                                            int i10 = IAuthTabCallback + 7;
                                            onNavigationEvent = i10 % 128;
                                            if (i10 % 2 == 0) {
                                                Object[] objArr = {creditHomeActivity};
                                                int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
                                                unit = (Unit) CreditHomeActivity.asInterface.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 688726267, -688726267, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, lt.40.onExtraCallbackWithResult());
                                                int i11 = 48 / 0;
                                            } else {
                                                Object[] objArr2 = {creditHomeActivity};
                                                int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
                                                unit = (Unit) CreditHomeActivity.asInterface.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 688726267, -688726267, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr2, lt.40.onExtraCallbackWithResult());
                                            }
                                            int i12 = onNavigationEvent + 41;
                                            IAuthTabCallback = i12 % 128;
                                            if (i12 % 2 != 0) {
                                                int i13 = 94 / 0;
                                            }
                                            return unit;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                                    obj5 = function0;
                                }
                                Function0 function02 = (Function0) obj5;
                                boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditHomeActivity);
                                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!zOnExtraCallback5) {
                                    int i9 = onExtraCallback + 71;
                                    asInterface = i9 % 128;
                                    int i10 = i9 % 2;
                                    Object obj6 = objOnMinimized5;
                                    if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        Function0 function03 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$initHomeScreen$1$$ExternalSyntheticLambda7
                                            private static int onExtraCallbackWithResult = 1;
                                            private static int onNavigationEvent;

                                            public final Object invoke() {
                                                int i11 = 2 % 2;
                                                int i12 = onNavigationEvent + 3;
                                                onExtraCallbackWithResult = i12 % 128;
                                                Object obj7 = null;
                                                if (i12 % 2 == 0) {
                                                    CreditHomeActivity.asInterface.onNavigationEvent(creditHomeActivity);
                                                    obj7.hashCode();
                                                    throw null;
                                                }
                                                Unit unitOnNavigationEvent = CreditHomeActivity.asInterface.onNavigationEvent(creditHomeActivity);
                                                int i13 = onExtraCallbackWithResult + 17;
                                                onNavigationEvent = i13 % 128;
                                                if (i13 % 2 == 0) {
                                                    return unitOnNavigationEvent;
                                                }
                                                obj7.hashCode();
                                                throw null;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function03);
                                        obj6 = function03;
                                    }
                                    Function0 function04 = (Function0) obj6;
                                    boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditHomeActivity);
                                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (!zOnExtraCallback6) {
                                        Object obj7 = objOnMinimized6;
                                        if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            Function1 function16 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$initHomeScreen$1$$ExternalSyntheticLambda8
                                                private static int IAuthTabCallback = 0;
                                                private static int onExtraCallback = 1;

                                                public final Object invoke(Object obj8) {
                                                    int i11 = 2 % 2;
                                                    int i12 = onExtraCallback + 57;
                                                    IAuthTabCallback = i12 % 128;
                                                    Object obj9 = null;
                                                    if (i12 % 2 != 0) {
                                                        Object[] objArr = {creditHomeActivity, (onUnavailable) obj8};
                                                        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
                                                        throw null;
                                                    }
                                                    Object[] objArr2 = {creditHomeActivity, (onUnavailable) obj8};
                                                    int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
                                                    Unit unit = (Unit) CreditHomeActivity.asInterface.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 1444693731, -1444693729, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr2, lt.40.onExtraCallbackWithResult());
                                                    int i13 = onExtraCallback + 93;
                                                    IAuthTabCallback = i13 % 128;
                                                    if (i13 % 2 == 0) {
                                                        return unit;
                                                    }
                                                    obj9.hashCode();
                                                    throw null;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function16);
                                            obj7 = function16;
                                        }
                                        StackTraceInfo.onWarmupCompleted(-232540988, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{creditHomeViewModel, Boolean.valueOf(z), Boolean.valueOf(zICustomTabsCallbackStub), function13, function15, function02, function04, (Function1) obj7, inventoryAdManagerUpdateVisuals, strOnMessageChannelReady, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(InventoryAdManager.onExtraCallbackWithResult << 24)}, 232540994, R.drawable.IAuthTabCallback());
                                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            Unit unit = Unit.INSTANCE;
            int i11 = asInterface + 117;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            return unit;
        }

        private static final Unit onWarmupCompleted(final CreditHomeActivity creditHomeActivity, final boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            boolean z2;
            int i2 = 2 % 2;
            if ((i & 3) != 2) {
                int i3 = onExtraCallback + 47;
                int i4 = i3 % 128;
                asInterface = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 49;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 3 % 2;
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-508162809, i, -1, "im.toss.feature.credit.ui.main.home.CreditHomeActivity.initHomeScreen.<anonymous>.<anonymous> (CreditHomeActivity.kt:420)");
                }
                y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-1197270865, true, new Function2() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$initHomeScreen$1$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i8 = 2 % 2;
                        int i9 = onWarmupCompleted + 123;
                        onExtraCallbackWithResult = i9 % 128;
                        int i10 = i9 % 2;
                        CreditHomeActivity creditHomeActivity2 = creditHomeActivity;
                        boolean z3 = z;
                        int iIntValue = ((Integer) obj2).intValue();
                        Object[] objArr = {creditHomeActivity2, Boolean.valueOf(z3), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
                        Unit unit = (Unit) CreditHomeActivity.asInterface.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 646935972, -646935971, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, lt.40.onExtraCallbackWithResult());
                        int i11 = onExtraCallbackWithResult + 79;
                        onWarmupCompleted = i11 % 128;
                        if (i11 % 2 != 0) {
                            return unit;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i8 = asInterface + 97;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit onExtraCallback(CreditHomeActivity creditHomeActivity, onUnavailable onunavailable) {
            int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
            return (Unit) onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 1444693731, -1444693729, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{creditHomeActivity, onunavailable}, lt.40.onExtraCallbackWithResult());
        }

        public static /* synthetic */ Unit onExtraCallback(CreditHomeActivity creditHomeActivity, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            Object[] objArr = {creditHomeActivity, Boolean.valueOf(z), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
            int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
            return (Unit) onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 646935972, -646935971, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, lt.40.onExtraCallbackWithResult());
        }

        public static /* synthetic */ Unit onExtraCallback(CreditHomeActivity creditHomeActivity) {
            int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
            return (Unit) onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 688726267, -688726267, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{creditHomeActivity}, lt.40.onExtraCallbackWithResult());
        }

        private static final Unit onWarmupCompleted(CreditHomeActivity creditHomeActivity) {
            int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
            return (Unit) onWarmupCompleted(lt.40.onExtraCallbackWithResult(), -2138050994, 2138050997, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{creditHomeActivity}, lt.40.onExtraCallbackWithResult());
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 44899;
        private static int asInterface = 1;
        private static char onExtraCallback = 25148;
        private static char onExtraCallbackWithResult = 43272;
        private static int onNavigationEvent = 0;
        private static char onWarmupCompleted = 3668;
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public static /* synthetic */ Unit onExtraCallback(CreditHomeActivity creditHomeActivity, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 39;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(creditHomeActivity, setDetectableSize);
            }
            onExtraCallbackWithResult(creditHomeActivity, setDetectableSize);
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = CreditHomeActivity.this.new onExtraCallbackWithResult(access13800Var);
            int i2 = asInterface + 75;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 32 / 0;
            }
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800<? super Unit>) obj2);
            int i4 = asInterface + 53;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = asInterface + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = asInterface + 9;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            CharSequence charSequence;
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i4 = $11 + 125;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                char c = 1;
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i6 = 58224;
                int i7 = i3;
                while (i7 < 16) {
                    int i8 = $10 + 115;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    char c2 = cArr3[c];
                    char c3 = cArr3[i3];
                    int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                    int i11 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onExtraCallback);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[c] = Integer.valueOf(i10);
                        objArr2[i3] = Integer.valueOf(c2);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            charSequence = "";
                            char cIndexOf = (char) TextUtils.indexOf(charSequence, charSequence);
                            int iMakeMeasureSpec = 10 - View.MeasureSpec.makeMeasureSpec(i3, i3);
                            int iResolveSize = View.resolveSize(i3, i3) + 12434;
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[c] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, iMakeMeasureSpec, iResolveSize, -787580090, false, "C", clsArr);
                        } else {
                            charSequence = "";
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[c] = cCharValue;
                        int i12 = i7;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode(charSequence, 0, 0), TextUtils.lastIndexOf(charSequence, '0') + 11, 12434 - View.resolveSizeAndState(0, 0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7 = i12 + 1;
                        i3 = 0;
                        c = 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16761202) - Color.rgb(0, 0, 0)), 14 - KeyEvent.keyCodeFromString(""), 19901 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            final CreditHomeActivity creditHomeActivity = CreditHomeActivity.this;
            ConvertByteArrayToFloatArray.onExtraCallback(1275943L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$handleEvent$4$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj3) throws Throwable {
                    int i3 = 2 % 2;
                    int i4 = onExtraCallback + 97;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    Unit unitOnExtraCallback = CreditHomeActivity.onExtraCallbackWithResult.onExtraCallback(creditHomeActivity, (SetDetectableSize) obj3);
                    int i6 = onNavigationEvent + 27;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return unitOnExtraCallback;
                }
            }, 14, null);
            SessionTrackerb.IAuthTabCallback(CreditHomeActivity.this.validateRelationship(), CreditHomeActivity.this, h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.ICustomTabsCallbackDefault.IAuthTabCallback, false, "credit_main", false, null, 13, null), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i3 = asInterface + 19;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 75 / 0;
            }
            return unit;
        }

        private static final Unit onExtraCallbackWithResult(CreditHomeActivity creditHomeActivity, SetDetectableSize setDetectableSize) throws Throwable {
            Object obj;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr = new Object[1];
                a(new char[]{61772, 9889, 30934, 15111, 43496, 61350, 46994, 45165}, 115 >> (ViewConfiguration.getKeyRepeatDelay() >> 98), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a(new char[]{61772, 9889, 30934, 15111, 43496, 61350, 46994, 45165}, 8 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
                obj = objArr2[0];
            }
            setDetectableSize.onExtraCallback(((String) obj).intern(), CreditHomeActivity.onMessageChannelReady(creditHomeActivity));
            setDetectableSize.onExtraCallback("possible_yn", "Y");
            Unit unit = Unit.INSTANCE;
            int i3 = asInterface + 3;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 43372;
        private static int IAuthTabCallbackDefault = 1;
        private static char onExtraCallback = 26964;
        private static int onExtraCallbackWithResult = 0;
        private static char onNavigationEvent = 31940;
        private static char onWarmupCompleted = 44853;
        final /* synthetic */ liteTrackWatchDogHandlerThreadOpt $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$event = litetrackwatchdoghandlerthreadopt;
        }

        public static /* synthetic */ Unit onExtraCallback(CreditHomeActivity creditHomeActivity, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditHomeActivity, setDetectableSize);
            int i4 = IAuthTabCallbackDefault + 27;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallbackWithResult;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 97;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = CreditHomeActivity.this.new onNavigationEvent(this.$event, access13800Var);
            int i2 = IAuthTabCallbackDefault + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            IAuthTabCallbackDefault = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                IAuthTabCallback(findresandmsg, access13800Var);
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = onExtraCallbackWithResult + 21;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 64 / 0;
            }
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
                    int i6 = $10 + 87;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                    int i9 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onExtraCallback);
                        objArr2[2] = Integer.valueOf(i9);
                        objArr2[1] = Integer.valueOf(i8);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int size = 10 - View.MeasureSpec.getSize(i3);
                            int iGreen = 12434 - Color.green(i3);
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(jumpTapTimeout, size, iGreen, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 1), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9, (ViewConfiguration.getScrollBarSize() >> 8) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16013 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), View.combineMeasuredStates(0, 0) + 14, 19901 - Color.red(0), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i10 = $10 + 33;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            final CreditHomeActivity creditHomeActivity = CreditHomeActivity.this;
            ConvertByteArrayToFloatArray.onExtraCallback(1275943L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$handleEvent$5$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2) throws Throwable {
                    int i4 = 2 % 2;
                    int i5 = IAuthTabCallback + 31;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    CreditHomeActivity creditHomeActivity2 = creditHomeActivity;
                    SetDetectableSize setDetectableSize = (SetDetectableSize) obj2;
                    if (i6 != 0) {
                        return CreditHomeActivity.onNavigationEvent.onExtraCallback(creditHomeActivity2, setDetectableSize);
                    }
                    CreditHomeActivity.onNavigationEvent.onExtraCallback(creditHomeActivity2, setDetectableSize);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            }, 14, null);
            zzo zzoVar = CreditHomeActivity.this;
            zzoVar.startActivity(CreditScoreRaiseCoolTimeActivity.Companion.onExtraCallback(zzoVar, "credit_main", ((liteTrackWatchDogHandlerThreadOpt.IAuthTabCallback) this.$event).onWarmupCompleted()));
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallbackDefault + 39;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static final Unit onExtraCallbackWithResult(CreditHomeActivity creditHomeActivity, SetDetectableSize setDetectableSize) throws Throwable {
            Object obj;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 43;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(new char[]{50000, 38418, 13621, 64960, 15162, 7173, 2111, 27704}, 30 >>> Color.blue(1), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a(new char[]{50000, 38418, 13621, 64960, 15162, 7173, 2111, 27704}, 8 - Color.blue(0), objArr2);
                obj = objArr2[0];
            }
            setDetectableSize.onExtraCallback(((String) obj).intern(), CreditHomeActivity.onMessageChannelReady(creditHomeActivity));
            setDetectableSize.onExtraCallback("possible_yn", "N");
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(char[] cArr, int i, boolean z, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(receiveFile)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 35125), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10277, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12842), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 54, 2167 - ExpandableListView.getPackedPositionGroup(0L), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i > 0) {
            int i7 = $11 + 97;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i9 = $10 + 47;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 12843), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 55, 2167 - KeyEvent.normalizeMetaState(0), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i11 = $10 + 41;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public static final /* synthetic */ Object IAuthTabCallback(CreditHomeActivity creditHomeActivity, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 13;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = creditHomeActivity.onWarmupCompleted((access13800<? super Unit>) access13800Var);
        int i4 = warmup + 117;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return objOnWarmupCompleted;
    }

    public static final /* synthetic */ void IAuthTabCallback(CreditHomeActivity creditHomeActivity, int i, enableNebulaServiceInitOpt enablenebulaserviceinitopt) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ICustomTabsServiceStub + 41;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        creditHomeActivity.onExtraCallback(i, enablenebulaserviceinitopt);
        int i5 = ICustomTabsServiceStub + 67;
        warmup = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(CreditHomeActivity creditHomeActivity, int i, enablePreloadClassOpt enablepreloadclassopt) throws Throwable {
        int i2 = 2 % 2;
        int i3 = warmup + 91;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {creditHomeActivity, Integer.valueOf(i), enablepreloadclassopt};
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted4 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        if (i4 == 0) {
            onNavigationEvent(iOnWarmupCompleted4, 1681797648, iOnWarmupCompleted, iOnWarmupCompleted2, objArr, iOnWarmupCompleted3, -1681797624);
        } else {
            onNavigationEvent(iOnWarmupCompleted4, 1681797648, iOnWarmupCompleted, iOnWarmupCompleted2, objArr, iOnWarmupCompleted3, -1681797624);
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Throwable {
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt = (liteTrackWatchDogHandlerThreadOpt) objArr[1];
        int i = 2 % 2;
        int i2 = warmup + 121;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        creditHomeActivity.onExtraCallback(litetrackwatchdoghandlerthreadopt);
        int i4 = ICustomTabsServiceStub + 113;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ CreditDualViewModel ICustomTabsCallbackDefault(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 13;
        warmup = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            creditHomeActivity.read();
            throw null;
        }
        CreditDualViewModel creditDualViewModel = creditHomeActivity.read();
        int i3 = ICustomTabsServiceStub + 125;
        warmup = i3 % 128;
        if (i3 % 2 != 0) {
            return creditDualViewModel;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean ICustomTabsCallbackStub(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = warmup + 39;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            creditHomeActivity.write();
            throw null;
        }
        boolean zWrite = creditHomeActivity.write();
        int i3 = warmup + 23;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        return zWrite;
    }

    public static final /* synthetic */ void ICustomTabsCallbackStubProxy(CreditHomeActivity creditHomeActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 43;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        creditHomeActivity.MediaSessionCompatToken();
        int i4 = warmup + 121;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(CreditHomeActivity creditHomeActivity, enablePreloadClassOpt enablepreloadclassopt) {
        int i = 2 % 2;
        int i2 = warmup + 49;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        creditHomeActivity.onExtraCallback(enablepreloadclassopt);
        int i4 = warmup + 17;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        getTime gettime = (getTime) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 47;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        creditHomeActivity.onExtraCallback(gettime);
        if (i3 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String onMessageChannelReady(CreditHomeActivity creditHomeActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 41;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            creditHomeActivity.areNotificationsEnabled();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strAreNotificationsEnabled = creditHomeActivity.areNotificationsEnabled();
        int i3 = warmup + 13;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        return strAreNotificationsEnabled;
    }

    public static final /* synthetic */ void onNavigationEvent(CreditHomeActivity creditHomeActivity, CreditDualViewModel.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 77;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 495037728, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity, onextracallbackwithresult}, iOnWarmupCompleted3, -495037719);
            return;
        }
        int iOnWarmupCompleted4 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted5 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted6 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 495037728, iOnWarmupCompleted4, iOnWarmupCompleted5, new Object[]{creditHomeActivity, onextracallbackwithresult}, iOnWarmupCompleted6, -495037719);
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(CreditHomeActivity creditHomeActivity, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 15;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        creditHomeActivity.onExtraCallbackWithResult(str);
        int i4 = warmup + 41;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew, enableNebulaServiceInitOpt enablenebulaserviceinitopt, enablePreloadClassOpt enablepreloadclassopt) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 49;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        creditHomeActivity.onExtraCallbackWithResult(enableoverridependingtransitionnew, enablenebulaserviceinitopt, enablepreloadclassopt);
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        int i5 = ICustomTabsServiceStub + 121;
        warmup = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ checkInterval onPostMessage(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = warmup + 29;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        checkInterval checkintervalIEngagementSignalsCallback_Parcel = creditHomeActivity.IEngagementSignalsCallback_Parcel();
        int i4 = warmup + 39;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return checkintervalIEngagementSignalsCallback_Parcel;
    }

    public static final /* synthetic */ AtomicBoolean onUnminimized(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = warmup + 53;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        AtomicBoolean atomicBoolean = creditHomeActivity.newSession;
        if (i3 == 0) {
            return atomicBoolean;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onWarmupCompleted(CreditHomeActivity creditHomeActivity, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 7;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            return creditHomeActivity.onExtraCallbackWithResult((access13800<? super Unit>) access13800Var);
        }
        creditHomeActivity.onExtraCallbackWithResult((access13800<? super Unit>) access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(CreditHomeActivity creditHomeActivity, CreditDualViewModel.onNavigationEvent onnavigationevent) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 79;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        creditHomeActivity.onExtraCallback(onnavigationevent);
        int i4 = warmup + 55;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(CreditHomeActivity creditHomeActivity, enablePreloadClassOpt enablepreloadclassopt) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 55;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        creditHomeActivity.onExtraCallbackWithResult(enablepreloadclassopt);
        int i4 = ICustomTabsServiceStub + 69;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(CreditHomeActivity creditHomeActivity, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 41;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {creditHomeActivity, Boolean.valueOf(z)};
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted4 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        if (i3 == 0) {
            onNavigationEvent(iOnWarmupCompleted4, 1093073403, iOnWarmupCompleted, iOnWarmupCompleted2, objArr, iOnWarmupCompleted3, -1093073387);
        } else {
            onNavigationEvent(iOnWarmupCompleted4, 1093073403, iOnWarmupCompleted, iOnWarmupCompleted2, objArr, iOnWarmupCompleted3, -1093073387);
            int i4 = 12 / 0;
        }
    }

    public final SessionTrackerb validateRelationship() {
        int i = 2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        Object obj = null;
        if (sessionTrackerb != null) {
            int i2 = ICustomTabsServiceStub + 39;
            warmup = i2 % 128;
            if (i2 % 2 != 0) {
                return sessionTrackerb;
            }
            obj.hashCode();
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = ICustomTabsServiceStub + 125;
        warmup = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public InventoryAdManager updateVisuals() {
        int i = 2 % 2;
        int i2 = warmup + 45;
        int i3 = i2 % 128;
        ICustomTabsServiceStub = i3;
        int i4 = i2 % 2;
        InventoryAdManager inventoryAdManager = this.inventoryAdManager;
        if (inventoryAdManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 93;
        warmup = i5 % 128;
        if (i5 % 2 != 0) {
            return inventoryAdManager;
        }
        throw null;
    }

    private final checkInterval IEngagementSignalsCallback_Parcel() {
        checkInterval checkinterval;
        int i = 2 % 2;
        int i2 = warmup + 37;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            Object value = this.IAuthTabCallbackStubProxy.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            checkinterval = (checkInterval) value;
            int i3 = 71 / 0;
        } else {
            Object value2 = this.IAuthTabCallbackStubProxy.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            checkinterval = (checkInterval) value2;
        }
        int i4 = ICustomTabsServiceStub + 53;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return checkinterval;
    }

    private final CreditDualViewModel read() {
        CreditDualViewModel creditDualViewModel;
        int i = 2 % 2;
        int i2 = warmup + 63;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            creditDualViewModel = (CreditDualViewModel) this.prefetchWithMultipleUrls.getValue();
            int i3 = 97 / 0;
        } else {
            creditDualViewModel = (CreditDualViewModel) this.prefetchWithMultipleUrls.getValue();
        }
        int i4 = ICustomTabsServiceStub + 109;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return creditDualViewModel;
        }
        throw null;
    }

    private final CreditHomeViewModel ITrustedWebActivityService() {
        int i = 2 % 2;
        int i2 = warmup + 15;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        CreditHomeViewModel creditHomeViewModel = (CreditHomeViewModel) this.onMinimized.getValue();
        int i3 = warmup + 69;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        return creditHomeViewModel;
    }

    private final String areNotificationsEnabled() throws Throwable {
        String strOnTransact;
        int i = 2 % 2;
        int i2 = warmup + 101;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            strOnTransact = read().onTransact();
            int i3 = 47 / 0;
        } else {
            strOnTransact = read().onTransact();
        }
        int i4 = warmup + 107;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return strOnTransact;
    }

    private final String ITrustedWebActivityCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 95;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onPostMessage.getValue();
        if (i3 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String newSession(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 53;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            h5ScreenShotObserverOnChangeOpt.Companion.IAuthTabCallback(creditHomeActivity.getIntent());
            throw null;
        }
        String strIAuthTabCallback = h5ScreenShotObserverOnChangeOpt.Companion.IAuthTabCallback(creditHomeActivity.getIntent());
        int i3 = ICustomTabsServiceStub + 25;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        return strIAuthTabCallback;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 19;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        Object obj = null;
        setFinalY setfinaly = creditHomeActivity.tossploreManager;
        if (i4 == 0) {
            throw null;
        }
        if (setfinaly == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 71;
        ICustomTabsServiceStub = i5 % 128;
        if (i5 % 2 == 0) {
            return setfinaly;
        }
        obj.hashCode();
        throw null;
    }

    public final getDummyAd ICustomTabsServiceDefault() {
        int i = 2 % 2;
        getDummyAd getdummyad = this.standardTermsV2Intent;
        if (getdummyad != null) {
            int i2 = warmup + 83;
            ICustomTabsServiceStub = i2 % 128;
            int i3 = i2 % 2;
            return getdummyad;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = ICustomTabsServiceStub + 119;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final zzad ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = warmup + 73;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        zzad zzadVar = this.injectedEnvironments;
        if (zzadVar != null) {
            return zzadVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = warmup + 103;
        ICustomTabsServiceStub = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final zzad IPostMessageServiceDefault() {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 23;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        if (this.injectedEnvironments == null) {
            auth.IAuthTabCallback(auth.onNavigationEvent, new IllegalStateException("environments accessed before injection: CreditHomeActivity"), null, 2, null);
            return zzaj.onNavigationEvent();
        }
        int i5 = i2 + 87;
        ICustomTabsServiceStub = i5 % 128;
        int i6 = i5 % 2;
        return ICustomTabsServiceStub();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(CreditHomeActivity creditHomeActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 5;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult() == r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_COMPLETED_MESSAGE) {
            int i4 = ICustomTabsServiceStub + 79;
            warmup = i4 % 128;
            int i5 = i4 % 2;
            enableSwitch.IAuthTabCallback.onExtraCallback();
            TdsToastV1.onWarmupCompleted onwarmupcompleted = TdsToastV1.Companion;
            String string = creditHomeActivity.getString(im.toss.feature.credit.ui.history.R.string.agree_credit_protection_term);
            Intrinsics.checkNotNullExpressionValue(string, "");
            TdsToastV1.onNavigationEvent onnavigationeventOnWarmupCompleted = isShowTransAnimate.onWarmupCompleted(onwarmupcompleted, string);
            Object[] objArr = new Object[1];
            c(new char[]{7, 14, 5, 20, 11, 5, 65487, '\r', 5, 7, '\n', 5, 65487, 16, 17, 5, 11, 65489, 26, 65494, 65489, '\t', 16, 18, 65489, 21, 16, 17, 5, 11, 65489, 15, 11, 65488, 21, 21, 17, 22, 65488, 5, 11, 22, 3, 22, 21, 65489, 65489, 65500, 21, 18, 22, 22, '\n', '\t', 16, 18, 65488, 16, 7, 7, 20, '\t', 65487}, 53 - (Process.myTid() >> 22), true, (ViewConfiguration.getPressedStateDuration() >> 16) + 63, (ViewConfiguration.getLongPressTimeout() >> 16) + 287, objArr);
            BrickModulePackageExternalSyntheticLambda0.onExtraCallbackWithResult(TdsToastV1.onNavigationEvent.onExtraCallback(onnavigationeventOnWarmupCompleted, ((String) objArr[0]).intern(), 0, 2, (Object) null), 200, (Integer) null, 0, 6, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = ICustomTabsServiceStub + 19;
        warmup = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(CreditHomeActivity creditHomeActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        if (!r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()) {
            onJsBridgeReady.onNavigationEvent(creditHomeActivity, creditHomeActivity.getString(im.toss.features.credit.ui.R.string.credit_ui_main_nice_disagree_message), 0, 2, null);
            int i2 = ICustomTabsServiceStub + 13;
            warmup = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = warmup + 79;
            ICustomTabsServiceStub = i4 % 128;
            if (i4 % 2 != 0) {
                creditHomeActivity.ITrustedWebActivityService().extraCallbackWithResult();
                creditHomeActivity.read().IAuthTabCallbackDefault();
                throw null;
            }
            creditHomeActivity.ITrustedWebActivityService().extraCallbackWithResult();
            creditHomeActivity.read().IAuthTabCallbackDefault();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(CreditHomeActivity creditHomeActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        CreditHomeViewModel creditHomeViewModelITrustedWebActivityService;
        boolean z;
        int i = 2 % 2;
        int i2 = warmup + 123;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i4 = warmup + 57;
            ICustomTabsServiceStub = i4 % 128;
            if (i4 % 2 != 0) {
                creditHomeViewModelITrustedWebActivityService = creditHomeActivity.ITrustedWebActivityService();
                z = false;
            } else {
                creditHomeViewModelITrustedWebActivityService = creditHomeActivity.ITrustedWebActivityService();
                z = true;
            }
            creditHomeViewModelITrustedWebActivityService.onExtraCallbackWithResult(z);
            int i5 = ICustomTabsServiceStub + 77;
            warmup = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private final boolean notifyNotificationWithChannel() {
        int i = 2 % 2;
        int i2 = warmup + 7;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            ((Boolean) this.newSessionWithExtras.getValue()).booleanValue();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) this.newSessionWithExtras.getValue()).booleanValue();
        int i3 = ICustomTabsServiceStub + 3;
        warmup = i3 % 128;
        if (i3 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static final boolean validateRelationship(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        if (!creditHomeActivity.IPostMessageServiceDefault().onActivityLayout() && !creditHomeActivity.IPostMessageServiceDefault().RemoteActionCompatParcelizer()) {
            if (!creditHomeActivity.IPostMessageServiceDefault().MediaBrowserCompatMediaItem()) {
                return false;
            }
            int i2 = warmup + 13;
            ICustomTabsServiceStub = i2 % 128;
            int i3 = i2 % 2;
            zzad zzadVarIPostMessageServiceDefault = creditHomeActivity.IPostMessageServiceDefault();
            if (i3 != 0) {
                zzadVarIPostMessageServiceDefault.MediaMetadataCompat();
                throw null;
            }
            if (!zzadVarIPostMessageServiceDefault.MediaMetadataCompat()) {
                return false;
            }
        }
        int i4 = ICustomTabsServiceStub + 77;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        zzo zzoVar = (CreditHomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 121;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            return Boolean.valueOf(varyFields.onWarmupCompleted(zzoVar));
        }
        varyFields.onWarmupCompleted(zzoVar);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean write() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 87;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onMessageChannelReady.getValue();
        if (i3 != 0) {
            return ((Boolean) value).booleanValue();
        }
        ((Boolean) value).booleanValue();
        throw null;
    }

    private final boolean AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 9;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) this.onActivityLayout.getValue();
        if (i3 != 0) {
            return bool.booleanValue();
        }
        bool.booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class extraCallbackWithResult implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public extraCallbackWithResult(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r3.onWarmupCompleted) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r3.onWarmupCompleted)) != true) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        
            r1 = im.toss.feature.credit.ui.main.home.CreditHomeActivity.extraCallbackWithResult.onExtraCallback + 111;
            im.toss.feature.credit.ui.main.home.CreditHomeActivity.extraCallbackWithResult.onNavigationEvent = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 94 / 0;
            }
        }
    }

    public static final class onMessageChannelReady implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onMessageChannelReady(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onNavigationEvent + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onNavigationEvent + 15;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class writeTypedObject implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public writeTypedObject(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = IAuthTabCallback + 103;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    private static final boolean requestPostMessageChannel(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = warmup + 89;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        if (StringsKt.equals(creditHomeActivity.areNotificationsEnabled(), "tossplore", true)) {
            int i4 = warmup + 31;
            ICustomTabsServiceStub = i4 % 128;
            int i5 = i4 % 2;
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            if (!(!((setFinalY) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 602740871, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity}, iOnWarmupCompleted3, -602740846)).onWarmupCompleted())) {
                return true;
            }
        }
        int i6 = warmup + 99;
        ICustomTabsServiceStub = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    static final class onUnminimized extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        int label;
        private static char[] onExtraCallbackWithResult = {51233, 51243, 64960, 64905, 65013, 64966, 64980, 51232, 64898, 51244, 64961, 64988, 64896, 64924, 51247, 51240, 64986, 64987, 51246, 64903, 64985, 64967, 64926, 64925, 64976, 64983, 64990, 64991, 64984, 64989, 51242, 51235, 64963, 64982, 51245, 64978};
        private static char onExtraCallback = 51247;

        onUnminimized(access13800<? super onUnminimized> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onUnminimized onunminimized = CreditHomeActivity.this.new onUnminimized(access13800Var);
            int i2 = onNavigationEvent + 63;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onunminimized;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallback(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 5;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 77;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3;
            int i4 = 2;
            int i5 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onExtraCallbackWithResult;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $11 + 73;
                    $10 = i7 % 128;
                    if (i7 % i4 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), Color.green(0) + 26, 23139 - (ViewConfiguration.getLongPressTimeout() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
                            }
                            cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 26, TextUtils.getOffsetAfter("", 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6++;
                    }
                    i4 = 2;
                }
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), Process.getGidForName("") + 27, TextUtils.indexOf("", "", 0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i8 = $10 + 89;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        int i10 = $11 + 43;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        try {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getLongPressTimeout() >> 16) + 74, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8087, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback5 == null) {
                                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 30 - (ViewConfiguration.getTapTimeout() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 19488, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                                } else {
                                    int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                                    int i17 = $11 + 101;
                                    $10 = i17 % 128;
                                    i3 = 2;
                                    int i18 = i17 % 2;
                                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += i3;
                                    obj2 = obj;
                                }
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i3 = 2;
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += i3;
                    obj2 = obj;
                }
            }
            int i19 = 0;
            while (i19 < i) {
                int i20 = $11 + 45;
                $10 = i20 % 128;
                if (i20 % 2 != 0) {
                    cArr4[i19] = (char) (cArr4[i19] ^ 18702);
                    i19 += 30;
                } else {
                    cArr4[i19] = (char) (cArr4[i19] ^ 13722);
                    i19++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0082, code lost:
        
            if ((r1 % 2) == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0084, code lost:
        
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0085, code lost:
        
            r3.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0090, code lost:
        
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
            r9 = o.CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(r8.this$0);
            r6 = new java.lang.Object[1];
            a(new char[]{15, 23, 20, '!', 3, 4, 13829, 13829, 3, 20, '!', 23, '\f', 28, 18, 22, '\b', 5, 5, 20, 14, 28, 14, '\r', 28, 19, ' ', 27, '\b', 23, 14, 4, 17, 1, '\n', 2, 13822, 13822, '\n', 28, 30, '!', 24, 11, 20, '#', 24, 11}, (byte) (80 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 48, r6);
            r3 = null;
            o.LinkGenerator.onExtraCallback(r9, ((java.lang.String) r6[0]).intern(), (android.content.Context) null, 2, (java.lang.Object) null);
            r5 = new java.lang.Object[1];
            a(new char[]{15, 23, 20, '!', 3, 4, 13874, 13874, 3, 20, '!', 23, '\f', 28, 18, 22, '\b', 5, 5, 20, 14, 28, 14, '\r', 31, 19, 29, '\f', 30, 27, '\"', 28, '#', '\b', 17, 28, 22, 15, 24, 11, 28, 16, '\f', '\n', 15, 23, 20, '\n', 21, 28, 13938, 13938, '\"', 20, 30, '!', 24, 11, 20, '#', 24, 11}, (byte) (android.os.Process.getGidForName("") + 126), 61 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0), r5);
            o.LinkGenerator.onExtraCallback(r9, ((java.lang.String) r5[0]).intern(), (android.content.Context) null, 2, (java.lang.Object) null);
            r9 = kotlin.Unit.INSTANCE;
            r1 = im.toss.feature.credit.ui.main.home.CreditHomeActivity.onUnminimized.onWarmupCompleted + 51;
            im.toss.feature.credit.ui.main.home.CreditHomeActivity.onUnminimized.onNavigationEvent = r1 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 27 / 0;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, im.toss.feature.credit.ui.main.home.CreditHomeActivity] */
    private static /* synthetic */ Object onUnminimized(Object[] objArr) {
        ?? r0 = (CreditHomeActivity) objArr[0];
        String str = (String) objArr[1];
        Bundle bundle = (Bundle) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 113;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ((CreditHomeActivity) r0).access000.onNavigationEvent(overrideEventDispatcher.onExtraCallback(overrideEventDispatcher.onNavigationEvent, (Context) r0, SessionKnownType.UPDATE_USER_CERTIFICATION.name(), "SV-CRD", (checkDeviceBrand) null, (String) null, false, (String) null, (String) null, (MobileCarrier) null, (String) null, (String) null, false, false, false, r0.areNotificationsEnabled(), "credit", (String) null, false, (Boolean) null, false, (String) null, (String) null, (String) null, (String) null, false, false, false, (String) null, false, (updateRuntimeShadowNodeReferencesOnCommit) null, 0L, 0L, false, false, false, false, false, (String) null, (String) null, -49160, 127, (Object) null));
        int i4 = warmup + 21;
        ICustomTabsServiceStub = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.feature.credit.ui.main.home.Hilt_CreditHomeActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        super/*im.toss.base.BaseActivity*/.onCreate(bundle);
        ITrustedWebActivityService_Parcel();
        RemoteActionCompatParcelizer();
        ITrustedWebActivityServiceStub();
        getSupportFragmentManager().onNavigationEvent("NiceDiErrorBottomSheetFragment_RESULT_KEY", this, new CreditHomeActivity$.ExternalSyntheticLambda9(this));
        Uri data = getIntent().getData();
        if (data != null) {
            int i2 = ICustomTabsServiceStub + 29;
            warmup = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(data);
                int i3 = 64 / 0;
            } else {
                onExtraCallbackWithResult(data);
            }
        }
        Object[] objArr = {read()};
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        ((Rmipmap) CreditDualViewModel.IAuthTabCallback(846789094, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), objArr, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, -846789094)).observe(this, new BaseActivity.getInterfaceDescriptor(new onActivityResized()));
        read().IAuthTabCallbackStub().observe(this, new BaseActivity.getInterfaceDescriptor(new onMinimized()));
        IconCompatParcelizer();
        if (read().onWarmupCompleted()) {
            int i4 = ICustomTabsServiceStub + 23;
            warmup = i4 % 128;
            int i5 = i4 % 2;
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1093073403, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{this, true}, iOnWarmupCompleted3, -1093073387);
            onWarmupCompleted(read().onWarmupCompleted());
        }
        setBaseDeeplink.onNavigationEvent(this, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, new onPostMessage(this, (access13800) null), 1, (Object) null);
        if (Intrinsics.areEqual(ITrustedWebActivityCallback(), "benefit_tab")) {
            int i6 = warmup + 63;
            ICustomTabsServiceStub = i6 % 128;
            int i7 = i6 % 2;
            ITrustedWebActivityService().ICustomTabsCallbackStub();
        }
    }

    private final void ITrustedWebActivityServiceStub() {
        int i = 2 % 2;
        int i2 = warmup + 117;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        InventoryAdManager.onWarmupCompleted(updateVisuals(), this, zzdt.CREDIT_SCORE_MAIN_BOTTOM, zzm.INVENTORY_AD_BANNER, (InventoryAdManager.IAuthTabCallback) null, (Map) null, (ViewGroup) null, (InventoryAdManager.onExtraCallbackWithResult) null, UCPApiConstants.ARAM_TIME_OUT, (Object) null);
        ITrustedWebActivityService().IAuthTabCallback(updateVisuals());
        int i4 = ICustomTabsServiceStub + 65;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ITrustedWebActivityService_Parcel() throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 11;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            AudioAttributesImplApi26Parcelizer();
            throw null;
        }
        if (AudioAttributesImplApi26Parcelizer()) {
            String strOnNavigationEvent = h5ScreenShotObserverOnChangeOpt.IAuthTabCallbackDefault.onExtraCallback.onNavigationEvent(getIntent());
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            setFinalY.onNavigationEvent((setFinalY) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 602740871, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{this}, iOnWarmupCompleted3, -602740846), "CREDIT", false, 2, (Object) null);
            int iOnWarmupCompleted4 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted5 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted6 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            ((setFinalY) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 602740871, iOnWarmupCompleted4, iOnWarmupCompleted5, new Object[]{this}, iOnWarmupCompleted6, -602740846)).IAuthTabCallback(this, strOnNavigationEvent, "CREDIT");
            SessionTrackerb sessionTrackerbValidateRelationship = validateRelationship();
            Object[] objArr = new Object[1];
            c(new char[]{18, 16, 3, 14, 19, 17, '\f', 7, 65535, 11, 65485, 18, 7, 2, 3, 16, 1, 65485, 65485, 65496, 17, 17, '\r'}, (-16777210) - Color.rgb(0, 0, 0), true, 23 - (ViewConfiguration.getEdgeSlop() >> 16), 291 - KeyEvent.keyCodeFromString(""), objArr);
            SessionTrackerb.IAuthTabCallback(sessionTrackerbValidateRelationship, this, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            int i3 = ICustomTabsServiceStub + 95;
            warmup = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [android.app.Activity, android.content.Context, im.toss.feature.credit.ui.main.home.CreditHomeActivity] */
    private static /* synthetic */ Object requestPostMessageChannelWithExtras(Object[] objArr) {
        ?? r6 = (CreditHomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 107;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        int scrollY = r6.IEngagementSignalsCallback_Parcel().ICustomTabsCallback.getScrollY();
        r6.IEngagementSignalsCallback_Parcel().onActivityLayout.setAlpha(scrollY / ((CreditHomeActivity) r6).newAuthTabSession);
        if (!(!((CreditHomeActivity) r6).IAuthTabCallback_Parcel)) {
            if (scrollY < 70) {
                Window window = r6.getWindow();
                Configuration configuration = r6.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                window.setStatusBarColor(new getUrlokhttp(new onActivityLayout(configuration)).onExtraCallbackWithResult());
            } else {
                Window window2 = r6.getWindow();
                Resources resources = r6.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "");
                Configuration configuration2 = resources.getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                window2.setStatusBarColor(new getDEFAULT_CONNECTION_SPECSokhttp(new onMessageChannelReady(configuration2)).onExtraCallbackWithResult());
                int i4 = warmup + 41;
                ICustomTabsServiceStub = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (r6.IEngagementSignalsCallback_Parcel().ICustomTabsCallback.canScrollVertically(1)) {
            return null;
        }
        ((CreditHomeActivity) r6).postMessage.onWarmupCompleted(new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda5
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i6 = 2 % 2;
                int i7 = onExtraCallback + 79;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                Unit unitIAuthTabCallback = CreditHomeActivity.IAuthTabCallback();
                int i9 = onExtraCallbackWithResult + 69;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                return unitIAuthTabCallback;
            }
        });
        return null;
    }

    private static final Unit ITrustedWebActivityServiceStubProxy() {
        int i = 2 % 2;
        int i2 = warmup + 29;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1213883L, false, null, null, null, 30, null);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsServiceStub + 27;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final void newSessionWithExtras(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = warmup + 27;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        creditHomeActivity.ITrustedWebActivityService().onExtraCallbackWithResult(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void RemoteActionCompatParcelizer() throws Throwable {
        int i;
        int i2 = 2 % 2;
        setToolbar(IEngagementSignalsCallback_Parcel().onPostMessage);
        setContentView(IEngagementSignalsCallback_Parcel().onWarmupCompleted());
        access200();
        Window window = getWindow();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        window.setStatusBarColor(new getDEFAULT_CONNECTION_SPECSokhttp(new extraCallbackWithResult(configuration)).onExtraCallbackWithResult());
        Window window2 = getWindow();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        Configuration configuration2 = resources2.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        window2.setNavigationBarColor(new getDEFAULT_CONNECTION_SPECSokhttp(new writeTypedObject(configuration2)).onExtraCallbackWithResult());
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            int i3 = warmup + 53;
            ICustomTabsServiceStub = i3 % 128;
            if (i3 % 2 != 0) {
                supportActionBar.onNavigationEvent(false);
                supportActionBar.IAuthTabCallbackStub(true);
            } else {
                supportActionBar.onNavigationEvent(true);
                supportActionBar.IAuthTabCallbackStub(false);
            }
        }
        TdsImageView tdsImageView = IEngagementSignalsCallback_Parcel().onMinimized;
        if (!(!notifyNotificationWithChannel())) {
            int i4 = ICustomTabsServiceStub + 81;
            warmup = i4 % 128;
            int i5 = i4 % 2;
            i = 0;
        } else {
            i = 8;
        }
        tdsImageView.setVisibility(i);
        IEngagementSignalsCallback_Parcel().onMinimized.setOnClickListener(new CreditHomeActivity$.ExternalSyntheticLambda67(this));
        IEngagementSignalsCallback_Parcel().ICustomTabsCallback.getViewTreeObserver().addOnScrollChangedListener(new CreditHomeActivity$.ExternalSyntheticLambda68(this));
        IEngagementSignalsCallback_Parcel().writeTypedObject.setOnRefreshListener(new CreditHomeActivity$.ExternalSyntheticLambda69(this));
        ITrustedWebActivityService().IAuthTabCallback_Parcel().observe(this, new BaseActivity.getInterfaceDescriptor(new readTypedObject()));
        onExtraCallbackWithResult(this, false, 1, (Object) null);
        AudioAttributesImplBaseParcelizer();
        int i6 = ICustomTabsServiceStub + 119;
        warmup = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 50 / 0;
        }
    }

    private final void access200() {
        int i = 2 % 2;
        int paddingTop = IEngagementSignalsCallback_Parcel().extraCallback.getPaddingTop();
        int paddingTop2 = IEngagementSignalsCallback_Parcel().onExtraCallback.getPaddingTop();
        int i2 = IEngagementSignalsCallback_Parcel().onExtraCallback.getLayoutParams().height;
        int i3 = IEngagementSignalsCallback_Parcel().onActivityLayout.getLayoutParams().height;
        ViewGroup.LayoutParams layoutParams = IEngagementSignalsCallback_Parcel().onMinimized.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        ViewCompat.onWarmupCompleted(IEngagementSignalsCallback_Parcel().onWarmupCompleted(), new CreditHomeActivity$.ExternalSyntheticLambda16(this, paddingTop, paddingTop2, IEngagementSignalsCallback_Parcel().asBinder.getPaddingBottom(), i2, i3, i4));
        ViewCompat.extraCommand(IEngagementSignalsCallback_Parcel().onWarmupCompleted());
        int i5 = ICustomTabsServiceStub + 81;
        warmup = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ void onExtraCallbackWithResult(CreditHomeActivity creditHomeActivity, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = warmup;
        int i4 = i3 + 41;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            int i5 = i3 + 87;
            ICustomTabsServiceStub = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        creditHomeActivity.onExtraCallback(z);
    }

    private final void onExtraCallback(boolean z) {
        boolean z2;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 5;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout = IEngagementSignalsCallback_Parcel().writeTypedObject;
        PillarSwipeRefreshLayout pillarSwipeRefreshLayout2 = (pillarSwipeRefreshLayout instanceof PillarSwipeRefreshLayout) ^ true ? null : pillarSwipeRefreshLayout;
        if (pillarSwipeRefreshLayout2 != null) {
            if (DERSet.onExtraCallback.ITrustedWebActivityServiceDefault() && z) {
                int i4 = ICustomTabsServiceStub + 69;
                warmup = i4 % 128;
                int i5 = i4 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            pillarSwipeRefreshLayout2.setUseTdsPullToRefresh(z2);
            View view = IEngagementSignalsCallback_Parcel().onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(view, "");
            pillarSwipeRefreshLayout2.setCoordinateViews(new View[]{view});
            AppBarLayout appBarLayout = IEngagementSignalsCallback_Parcel().onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(appBarLayout, "");
            pillarSwipeRefreshLayout2.setTopOffsetView(appBarLayout, true);
            NestedScrollView nestedScrollView = IEngagementSignalsCallback_Parcel().ICustomTabsCallback;
            Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
            NestedScrollView nestedScrollView2 = IEngagementSignalsCallback_Parcel().ICustomTabsCallback;
            Intrinsics.checkNotNullExpressionValue(nestedScrollView2, "");
            pillarSwipeRefreshLayout2.setTargetView(nestedScrollView, nestedScrollView2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Activity, android.content.Context, im.toss.base.BaseActivity, im.toss.feature.credit.ui.main.home.CreditHomeActivity] */
    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        ?? r1 = (CreditHomeActivity) objArr[0];
        CreditDualViewModel.onExtraCallbackWithResult onextracallbackwithresult = (CreditDualViewModel.onExtraCallbackWithResult) objArr[1];
        int i = 2 % 2;
        Object obj = null;
        if (onextracallbackwithresult instanceof CreditDualViewModel.onExtraCallbackWithResult.asInterface) {
            getParamImp.onWarmupCompleted(((CreditDualViewModel.onExtraCallbackWithResult.asInterface) onextracallbackwithresult).IAuthTabCallback(), r1, false, null, null, null, 28, null);
            return null;
        }
        if (Intrinsics.areEqual(onextracallbackwithresult, CreditDualViewModel.onExtraCallbackWithResult.onWarmupCompleted.onExtraCallbackWithResult)) {
            r1.finish();
            int i2 = warmup + 119;
            ICustomTabsServiceStub = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        if (onextracallbackwithresult instanceof CreditDualViewModel.onExtraCallbackWithResult.IAuthTabCallback) {
            int i4 = warmup + 41;
            ICustomTabsServiceStub = i4 % 128;
            int i5 = i4 % 2;
            SessionTrackerb.IAuthTabCallback(r1.validateRelationship(), (Activity) r1, ((CreditDualViewModel.onExtraCallbackWithResult.IAuthTabCallback) onextracallbackwithresult).onExtraCallbackWithResult(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            r1.read().IAuthTabCallback();
            return null;
        }
        if (!Intrinsics.areEqual(onextracallbackwithresult, CreditDualViewModel.onExtraCallbackWithResult.onExtraCallback.onNavigationEvent)) {
            return null;
        }
        onNavigationEvent((CreditHomeActivity) r1, false, 1, (Object) null);
        int i6 = ICustomTabsServiceStub + 93;
        warmup = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void onNavigationEvent(CreditHomeActivity creditHomeActivity, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = warmup + 5;
        ICustomTabsServiceStub = i3 % 128;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            z = false;
        }
        creditHomeActivity.onWarmupCompleted(z);
        int i4 = warmup + 107;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new asInterface(z, null), 3, (Object) null);
        int i2 = warmup + 65;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 61;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        c(new char[]{15, 65494, 65494, 65505, 26, 23, 27, 27}, -((byte) KeyEvent.getModifierMetaStateMask()), true, 8 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 282 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        Object obj = null;
        if (!StringsKt.startsWith$default(str, ((String) objArr[0]).intern(), false, 2, (Object) null)) {
            SessionTrackerb.IAuthTabCallback(validateRelationship(), this, str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            return;
        }
        SessionTrackerb sessionTrackerbValidateRelationship = validateRelationship();
        String strEncode = URLEncoder.encode(str, "UTF-8");
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        a(new char[]{10030, 31371, 40043, 16337, 20899, 62214, 5856, 43099, 51766, 28124, 36652, 8563, 17550, 59007, 14805, 23535, 64792, 4348, 45639, 54393}, TextUtils.getOffsetBefore("", 0) + 23971, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(strEncode);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbValidateRelationship, this, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i4 = warmup + 65;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a8 A[PHI: r2 r7
      0x01a8: PHI (r2v17 o.createWifiConfiguration$onExtraCallbackWithResult) = 
      (r2v16 o.createWifiConfiguration$onExtraCallbackWithResult)
      (r2v30 o.createWifiConfiguration$onExtraCallbackWithResult)
     binds: [B:66:0x01a6, B:63:0x0193] A[DONT_GENERATE, DONT_INLINE]
      0x01a8: PHI (r7v8 o.liteProcessHandlerThreadOpt) = (r7v7 o.liteProcessHandlerThreadOpt), (r7v16 o.liteProcessHandlerThreadOpt) binds: [B:66:0x01a6, B:63:0x0193] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(final liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt) throws Throwable {
        createWifiConfiguration.onExtraCallbackWithResult onextracallbackwithresult;
        liteProcessHandlerThreadOpt liteprocesshandlerthreadopt;
        int i = 2 % 2;
        if (litetrackwatchdoghandlerthreadopt != null) {
            if (litetrackwatchdoghandlerthreadopt instanceof liteTrackWatchDogHandlerThreadOpt.onWarmupCompleted) {
                CreditBaseViewModel.onExtraCallback(ITrustedWebActivityService(), 1330831L, (String) null, false, false, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda42
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onWarmupCompleted + 43;
                        onExtraCallback = i3 % 128;
                        int i4 = i3 % 2;
                        Object[] objArr = {this.f$0, litetrackwatchdoghandlerthreadopt, (SetDetectableSize) obj};
                        Unit unit = (Unit) CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 122713429, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -122713429);
                        int i5 = onExtraCallback + 89;
                        onWarmupCompleted = i5 % 128;
                        if (i5 % 2 == 0) {
                            return unit;
                        }
                        throw null;
                    }
                }, 6, (Object) null);
                SessionTrackerb.IAuthTabCallback(validateRelationship(), this, ((liteTrackWatchDogHandlerThreadOpt.onWarmupCompleted) litetrackwatchdoghandlerthreadopt).onWarmupCompleted().onTransact(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                return;
            }
            if (litetrackwatchdoghandlerthreadopt instanceof liteTrackWatchDogHandlerThreadOpt.onExtraCallback) {
                CreditBaseViewModel.onExtraCallback(ITrustedWebActivityService(), 1330833L, (String) null, false, false, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda43
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onExtraCallback + 61;
                        onWarmupCompleted = i3 % 128;
                        int i4 = i3 % 2;
                        CreditHomeActivity creditHomeActivity = this.f$0;
                        if (i4 != 0) {
                            return CreditHomeActivity.IAuthTabCallback(creditHomeActivity, litetrackwatchdoghandlerthreadopt, (SetDetectableSize) obj);
                        }
                        Unit unitIAuthTabCallback = CreditHomeActivity.IAuthTabCallback(creditHomeActivity, litetrackwatchdoghandlerthreadopt, (SetDetectableSize) obj);
                        int i5 = 44 / 0;
                        return unitIAuthTabCallback;
                    }
                }, 6, (Object) null);
                return;
            }
            if (litetrackwatchdoghandlerthreadopt instanceof liteTrackWatchDogHandlerThreadOpt.onNavigationEvent) {
                ConvertByteArrayToFloatArray.onExtraCallback(1275943L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda44
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) throws Throwable {
                        int i2 = 2 % 2;
                        int i3 = IAuthTabCallback + 105;
                        onWarmupCompleted = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitIAuthTabCallback = CreditHomeActivity.IAuthTabCallback(this.f$0, (SetDetectableSize) obj);
                        int i5 = IAuthTabCallback + 31;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        return unitIAuthTabCallback;
                    }
                }, 14, null);
                startActivity(CreditPerfectScoreActivity.Companion.onExtraCallbackWithResult(this, "credit_main"));
                return;
            }
            Object obj = null;
            if (litetrackwatchdoghandlerthreadopt instanceof liteTrackWatchDogHandlerThreadOpt.onExtraCallbackWithResult) {
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(null), 3, (Object) null);
                return;
            }
            if (litetrackwatchdoghandlerthreadopt instanceof liteTrackWatchDogHandlerThreadOpt.IAuthTabCallback) {
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(litetrackwatchdoghandlerthreadopt, null), 3, (Object) null);
                return;
            }
            if (litetrackwatchdoghandlerthreadopt instanceof liteTrackWatchDogHandlerThreadOpt.IAuthTabCallbackStub) {
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new asBinder(null), 3, (Object) null);
                return;
            }
            if (litetrackwatchdoghandlerthreadopt instanceof liteTrackWatchDogHandlerThreadOpt.IAuthTabCallback_Parcel) {
                int i2 = warmup + 53;
                ICustomTabsServiceStub = i2 % 128;
                if (i2 % 2 == 0) {
                    IAuthTabCallback(((liteTrackWatchDogHandlerThreadOpt.IAuthTabCallback_Parcel) litetrackwatchdoghandlerthreadopt).onExtraCallback());
                    return;
                } else {
                    IAuthTabCallback(((liteTrackWatchDogHandlerThreadOpt.IAuthTabCallback_Parcel) litetrackwatchdoghandlerthreadopt).onExtraCallback());
                    obj.hashCode();
                    throw null;
                }
            }
            if (litetrackwatchdoghandlerthreadopt instanceof liteTrackWatchDogHandlerThreadOpt.onTransact) {
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onTransact(null), 3, (Object) null);
                return;
            }
            if (litetrackwatchdoghandlerthreadopt instanceof liteTrackWatchDogHandlerThreadOpt.asBinder) {
                liteTrackWatchDogHandlerThreadOpt.asBinder asbinder = (liteTrackWatchDogHandlerThreadOpt.asBinder) litetrackwatchdoghandlerthreadopt;
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("CreditHomeActivity", asbinder.onExtraCallback());
                getParamImp.onWarmupCompleted(asbinder.onExtraCallback(), this, true, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda45
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2) {
                        int i3 = 2 % 2;
                        int i4 = onNavigationEvent + 21;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt2 = litetrackwatchdoghandlerthreadopt;
                        if (i5 != 0) {
                            Object[] objArr = {litetrackwatchdoghandlerthreadopt2, this, (DialogInterface) obj2};
                            return (Unit) CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1372894344, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1372894297);
                        }
                        Object[] objArr2 = {litetrackwatchdoghandlerthreadopt2, this, (DialogInterface) obj2};
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                }, 12, null);
                return;
            }
            if (litetrackwatchdoghandlerthreadopt instanceof liteTrackWatchDogHandlerThreadOpt.IAuthTabCallbackDefault) {
                if (!((liteTrackWatchDogHandlerThreadOpt.IAuthTabCallbackDefault) litetrackwatchdoghandlerthreadopt).IAuthTabCallback()) {
                    dismissLoadingIndicator();
                    return;
                }
                getHostnameVerifierokhttp.onNavigationEvent(this, (String) null, 1, (Object) null);
                int i3 = ICustomTabsServiceStub + 41;
                warmup = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            String str = "";
            if (litetrackwatchdoghandlerthreadopt instanceof liteTrackWatchDogHandlerThreadOpt.asInterface) {
                TdsToastV1.onWarmupCompleted onwarmupcompleted = TdsToastV1.Companion;
                String string = getString(im.toss.feature.credit.ui.main.R.string.agree_nice_terms);
                Intrinsics.checkNotNullExpressionValue(string, "");
                BrickModulePackageExternalSyntheticLambda0.onExtraCallbackWithResult(TdsToastV1.onNavigationEvent.onNavigationEvent(isShowTransAnimate.onWarmupCompleted(onwarmupcompleted, string), viva.republica.toss.R.drawable.icn_success_color, 0, 2, (Object) null), 0, (Integer) null, 0, 7, (Object) null);
                return;
            }
            if (!(litetrackwatchdoghandlerthreadopt instanceof liteTrackWatchDogHandlerThreadOpt.access000)) {
                if (!(litetrackwatchdoghandlerthreadopt instanceof liteTrackWatchDogHandlerThreadOpt.access100)) {
                    if (!(litetrackwatchdoghandlerthreadopt instanceof liteTrackWatchDogHandlerThreadOpt.IAuthTabCallbackStubProxy)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                createWifiConfiguration.onExtraCallbackWithResult onextracallbackwithresult2 = createWifiConfiguration.onExtraCallbackWithResult.onExtraCallback;
                liteProcessHandlerThreadOpt liteprocesshandlerthreadopt2 = (liteProcessHandlerThreadOpt) ITrustedWebActivityService().access100().IAuthTabCallback();
                if (liteprocesshandlerthreadopt2 != null) {
                    String str2 = (String) liteProcessHandlerThreadOpt.onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 46942577, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -46942575, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{liteprocesshandlerthreadopt2});
                    if (str2 != null) {
                        str = str2;
                    }
                }
                if (onextracallbackwithresult2.IAuthTabCallback(str)) {
                    return;
                }
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(null), 3, (Object) null);
                return;
            }
            int i5 = warmup;
            int i6 = i5 + 109;
            ICustomTabsServiceStub = i6 % 128;
            int i7 = i6 % 2;
            if (this.IAuthTabCallback_Parcel) {
                return;
            }
            int i8 = i5 + 27;
            ICustomTabsServiceStub = i8 % 128;
            if (i8 % 2 != 0) {
                onextracallbackwithresult = createWifiConfiguration.onExtraCallbackWithResult.onExtraCallback;
                liteprocesshandlerthreadopt = (liteProcessHandlerThreadOpt) ITrustedWebActivityService().access100().IAuthTabCallback();
                int i9 = 54 / 0;
                if (liteprocesshandlerthreadopt != null) {
                    String str3 = (String) liteProcessHandlerThreadOpt.onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 46942577, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -46942575, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{liteprocesshandlerthreadopt});
                    if (str3 != null) {
                        str = str3;
                    }
                }
            } else {
                onextracallbackwithresult = createWifiConfiguration.onExtraCallbackWithResult.onExtraCallback;
                liteprocesshandlerthreadopt = (liteProcessHandlerThreadOpt) ITrustedWebActivityService().access100().IAuthTabCallback();
                if (liteprocesshandlerthreadopt != null) {
                }
            }
            if (!(!onextracallbackwithresult.IAuthTabCallback(str))) {
                return;
            }
            if (write()) {
                onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1315580029, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, (liteTrackWatchDogHandlerThreadOpt.access000) litetrackwatchdoghandlerthreadopt}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1315580066);
                return;
            }
            liteTrackWatchDogHandlerThreadOpt.access000 access000Var = (liteTrackWatchDogHandlerThreadOpt.access000) litetrackwatchdoghandlerthreadopt;
            int i10 = IAuthTabCallback.onWarmupCompleted[access000Var.onWarmupCompleted().getInterfaceDescriptor().ordinal()];
            if (i10 == 1) {
                onExtraCallbackWithResult(access000Var.onWarmupCompleted());
                int i11 = warmup + 95;
                ICustomTabsServiceStub = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 69 / 0;
                    return;
                }
                return;
            }
            int i13 = ICustomTabsServiceStub;
            int i14 = i13 + 69;
            warmup = i14 % 128;
            int i15 = i14 % 2;
            if (i10 == 2) {
                onExtraCallback(access000Var.onWarmupCompleted());
                return;
            }
            if (i10 == 3) {
                int i16 = i13 + 71;
                warmup = i16 % 128;
                if (i16 % 2 != 0) {
                    onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -276265100, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, access000Var.onWarmupCompleted()}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 276265119);
                    return;
                }
                onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -276265100, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, access000Var.onWarmupCompleted()}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 276265119);
                throw null;
            }
        }
    }

    private static final Unit onExtraCallback(CreditHomeActivity creditHomeActivity, liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 5;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{10031, 60701, 45937, 31063, 4027, 54678, 39910, 41004}, ImageFormat.getBitsPerPixel(0) + 51750, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), creditHomeActivity.areNotificationsEnabled());
        liteTrackWatchDogHandlerThreadOpt.onWarmupCompleted onwarmupcompleted = (liteTrackWatchDogHandlerThreadOpt.onWarmupCompleted) litetrackwatchdoghandlerthreadopt;
        Object[] objArr2 = new Object[1];
        a(new char[]{10025, 5907, 18243, 47005}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 12343, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), onwarmupcompleted.onWarmupCompleted().asBinder());
        Object[] objArr3 = new Object[1];
        c(new char[]{65532, 7, 65528, 65535, 7}, 2 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), true, 5 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getEdgeSlop() >> 16) + 302, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), onwarmupcompleted.onWarmupCompleted().access100());
        setDetectableSize.onExtraCallback("sub_title", onwarmupcompleted.onWarmupCompleted().onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 57;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object postMessage(Object[] objArr) throws Throwable {
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt = (liteTrackWatchDogHandlerThreadOpt) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = warmup + 25;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        a(new char[]{10031, 60701, 45937, 31063, 4027, 54678, 39910, 41004}, 51748 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), creditHomeActivity.areNotificationsEnabled());
        liteTrackWatchDogHandlerThreadOpt.onExtraCallback onextracallback = (liteTrackWatchDogHandlerThreadOpt.onExtraCallback) litetrackwatchdoghandlerthreadopt;
        Object[] objArr3 = new Object[1];
        a(new char[]{10025, 5907, 18243, 47005}, 12344 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), onextracallback.onExtraCallbackWithResult().asBinder());
        Object[] objArr4 = new Object[1];
        c(new char[]{65532, 7, 65528, 65535, 7}, 2 - Drawable.resolveOpacity(0, 0), true, 5 - (ViewConfiguration.getEdgeSlop() >> 16), 301 - Process.getGidForName(""), objArr4);
        setDetectableSize.onExtraCallback(((String) objArr4[0]).intern(), onextracallback.onExtraCallbackWithResult().access100());
        setDetectableSize.onExtraCallback("sub_title", onextracallback.onExtraCallbackWithResult().onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 123;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(CreditHomeActivity creditHomeActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 7;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{10031, 60701, 45937, 31063, 4027, 54678, 39910, 41004}, TextUtils.lastIndexOf("", '0') + 51750, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), creditHomeActivity.areNotificationsEnabled());
        setDetectableSize.onExtraCallback("possible_yn", "N");
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 15;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = CreditHomeActivity.this.new asBinder(access13800Var);
            int i2 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            asBinder asbinderCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                asbinderCreate.invokeSuspend(unit);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = asbinderCreate.invokeSuspend(unit);
            int i4 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                CreditHomeActivity creditHomeActivity = CreditHomeActivity.this;
                this.label = 1;
                if (CreditHomeActivity.IAuthTabCallback(creditHomeActivity, (access13800) this) == objOnWarmupCompleted) {
                    int i4 = onExtraCallbackWithResult + 77;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onExtraCallbackWithResult + 65;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        int label;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = CreditHomeActivity.this.new onTransact(access13800Var);
            int i2 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 65 / 0;
            }
            return ontransact;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onTransact ontransactCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return ontransactCreate.invokeSuspend(unit);
            }
            ontransactCreate.invokeSuspend(unit);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onWarmupCompleted + 125;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = onExtraCallbackWithResult + 31;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                CreditHomeActivity creditHomeActivity = CreditHomeActivity.this;
                this.label = 1;
                if (CreditHomeActivity.onWarmupCompleted(creditHomeActivity, (access13800) this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt, CreditHomeActivity creditHomeActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        if (((liteTrackWatchDogHandlerThreadOpt.asBinder) litetrackwatchdoghandlerthreadopt).IAuthTabCallback()) {
            int i2 = ICustomTabsServiceStub + 55;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            creditHomeActivity.finish();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsServiceStub + 63;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        int label;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = CreditHomeActivity.this.new IAuthTabCallbackStub(access13800Var);
            int i2 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallbackStub;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStubCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return iAuthTabCallbackStubCreate.invokeSuspend(unit);
            }
            iAuthTabCallbackStubCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        
            if ((r1 % 2) == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        
            r4 = null;
            r4.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        
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
            im.toss.feature.credit.ui.main.home.CreditHomeActivity.ICustomTabsCallbackStubProxy(r3.this$0);
            r4 = kotlin.Unit.INSTANCE;
            r1 = im.toss.feature.credit.ui.main.home.CreditHomeActivity.IAuthTabCallbackStub.onNavigationEvent + 77;
            im.toss.feature.credit.ui.main.home.CreditHomeActivity.IAuthTabCallbackStub.onExtraCallbackWithResult = r1 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 27 / 0;
            }
        }
    }

    private final void IconCompatParcelizer() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onUnminimized(null), 3, (Object) null);
        int i2 = warmup + 97;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, im.toss.feature.credit.ui.main.home.CreditHomeActivity] */
    private static /* synthetic */ Object isEngagementSignalsApiAvailable(Object[] objArr) {
        final ?? r0 = (CreditHomeActivity) objArr[0];
        final liteTrackWatchDogHandlerThreadOpt.access000 access000Var = (liteTrackWatchDogHandlerThreadOpt.access000) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 97;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (access000Var.onWarmupCompleted().getInterfaceDescriptor() != enablePreloadClassOpt.NO_CHANGE) {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult((Context) r0, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda49
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = IAuthTabCallback + 71;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    Unit unitOnExtraCallbackWithResult = CreditHomeActivity.onExtraCallbackWithResult(this.f$0, access000Var, (CommonModule_setLeftEdgeTouchEnabled) obj2);
                    int i7 = IAuthTabCallback + 97;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 != 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    throw null;
                }
            });
            return null;
        }
        int i4 = warmup + 83;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(CreditHomeActivity creditHomeActivity, liteTrackWatchDogHandlerThreadOpt.access000 access000Var, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (access000Var.onWarmupCompleted().IAuthTabCallbackStubProxy()) {
            String string = creditHomeActivity.getString(im.toss.features.credit.ui.R.string.credit_score_raise_dialog_title1);
            Intrinsics.checkNotNullExpressionValue(string, "");
            Object[] objArr = {access000Var.onWarmupCompleted()};
            String str = String.format(string, Arrays.copyOf(new Object[]{"KCB", (Integer) enableOverridePendingTransitionNew.onNavigationEvent(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -1984884629, 1984884629, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "");
            listCreateListBuilder.add(str);
            int i2 = warmup + 45;
            ICustomTabsServiceStub = i2 % 128;
            int i3 = i2 % 2;
        }
        if (access000Var.onWarmupCompleted().ICustomTabsCallback()) {
            int i4 = warmup + 49;
            ICustomTabsServiceStub = i4 % 128;
            int i5 = i4 % 2;
            String string2 = creditHomeActivity.getString(im.toss.features.credit.ui.R.string.credit_score_raise_dialog_title1);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String str2 = String.format(string2, Arrays.copyOf(new Object[]{"NICE", access000Var.onWarmupCompleted().IAuthTabCallbackStub()}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            listCreateListBuilder.add(str2);
            int i6 = ICustomTabsServiceStub + 111;
            warmup = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 % 2;
            }
        }
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(CollectionsKt.joinToString$default(CollectionsKt.build(listCreateListBuilder), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + " " + creditHomeActivity.getString(im.toss.features.credit.ui.R.string.credit_score_raise_dialog_title2));
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onWarmupCompleted(access13800<? super Unit> access13800Var) throws Throwable {
        onRelationshipValidationResult onrelationshipvalidationresult;
        SessionTrackera sessionTrackera;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 1;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        if (!(!(access13800Var instanceof onRelationshipValidationResult))) {
            onrelationshipvalidationresult = (onRelationshipValidationResult) access13800Var;
            int i4 = onrelationshipvalidationresult.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = warmup + 75;
                ICustomTabsServiceStub = i5 % 128;
                int i6 = i5 % 2;
                onrelationshipvalidationresult.label = i4 - 2147483648;
                int i7 = warmup + 79;
                ICustomTabsServiceStub = i7 % 128;
                int i8 = i7 % 2;
            } else {
                onrelationshipvalidationresult = new onRelationshipValidationResult(access13800Var);
            }
        }
        onRelationshipValidationResult onrelationshipvalidationresult2 = onrelationshipvalidationresult;
        Object objOnExtraCallback = onrelationshipvalidationresult2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i9 = onrelationshipvalidationresult2.label;
        if (i9 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            SessionTrackera sessionTrackera2 = this.ICustomTabsCallbackDefault;
            getDummyAd getdummyadICustomTabsServiceDefault = ICustomTabsServiceDefault();
            enableNebulaDestroyOpt.asBinder asbinder = enableNebulaDestroyOpt.asBinder.onExtraCallback;
            String strIAuthTabCallbackDefault = asbinder.IAuthTabCallbackDefault();
            long jOnExtraCallback = asbinder.onExtraCallback();
            String strAreNotificationsEnabled = areNotificationsEnabled();
            onrelationshipvalidationresult2.L$0 = sessionTrackera2;
            onrelationshipvalidationresult2.label = 1;
            objOnExtraCallback = getDummyAd.onExtraCallback(getdummyadICustomTabsServiceDefault, this, strIAuthTabCallbackDefault, strAreNotificationsEnabled, "credit_main", jOnExtraCallback, (Map) null, (setHasShown) null, false, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, onrelationshipvalidationresult2, 8388576, (Object) null);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            sessionTrackera = sessionTrackera2;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i10 = warmup + 45;
            ICustomTabsServiceStub = i10 % 128;
            int i11 = i10 % 2;
            sessionTrackera = (SessionTrackera) onrelationshipvalidationresult2.L$0;
            ResultKt.onNavigationEvent(objOnExtraCallback);
        }
        sessionTrackera.onNavigationEvent(objOnExtraCallback);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(CreditHomeActivity creditHomeActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 99;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{10031, 60701, 45937, 31063, 4027, 54678, 39910, 41004}, 51749 - TextUtils.getCapsMode("", 0, 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), creditHomeActivity.areNotificationsEnabled());
        isPoolNetwork ispoolnetwork = (isPoolNetwork) creditHomeActivity.ITrustedWebActivityService().access000().IAuthTabCallback();
        Integer numValueOf = null;
        if (ispoolnetwork != null) {
            int i4 = warmup + 33;
            ICustomTabsServiceStub = i4 % 128;
            if (i4 % 2 != 0) {
                Integer.valueOf(ispoolnetwork.onWarmupCompleted());
                numValueOf.hashCode();
                throw null;
            }
            numValueOf = Integer.valueOf(ispoolnetwork.onWarmupCompleted());
        }
        setDetectableSize.onExtraCallback("mission_cnt", numValueOf);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void MediaSessionCompatToken() throws Throwable {
        List listListOf;
        String strIntern;
        int i;
        int i2 = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1547677L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda52
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) throws Throwable {
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 47;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                CreditHomeActivity creditHomeActivity = this.f$0;
                SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
                if (i5 != 0) {
                    return CreditHomeActivity.onNavigationEvent(creditHomeActivity, setDetectableSize);
                }
                Unit unitOnNavigationEvent = CreditHomeActivity.onNavigationEvent(creditHomeActivity, setDetectableSize);
                int i6 = 34 / 0;
                return unitOnNavigationEvent;
            }
        }, 14, null);
        isPoolNetwork ispoolnetwork = (isPoolNetwork) ITrustedWebActivityService().access000().IAuthTabCallback();
        boolean zOnExtraCallback = ispoolnetwork != null ? ispoolnetwork.onExtraCallback() : false;
        if (!zOnExtraCallback) {
            listListOf = CollectionsKt.listOf(new String[]{getString(im.toss.feature.credit.ui.main.R.string.credit_home_first_check_confettie_title_1), getString(im.toss.feature.credit.ui.main.R.string.credit_home_first_check_confettie_title_2)});
        } else {
            int i3 = warmup + 7;
            ICustomTabsServiceStub = i3 % 128;
            int i4 = i3 % 2;
            listListOf = CollectionsKt.listOf(new String[]{getString(im.toss.feature.credit.ui.main.R.string.credit_home_all_check_confettie_title_1), getString(im.toss.feature.credit.ui.main.R.string.credit_home_all_check_confettie_title_2)});
        }
        List list = listListOf;
        if (zOnExtraCallback) {
            int i5 = ICustomTabsServiceStub + 71;
            warmup = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            c(new char[]{23, 65493, 14, 21, 23, '\b', 65492, 65517, 65499, 65499, 65517, 65496, 28, 65494, 26, 16, 17, 22, 20, '\f', 65492, 11, 65498, 65494, 20, 16, 65493, 26, 26, 22, 27, 65493, '\n', 16, 27, '\b', 27, 26, 65494, 65494, 65505, 26, 23, 27, 27, 15, 14, 21}, 46 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), true, 48 + Gravity.getAbsoluteGravity(0, 0), ExpandableListView.getPackedPositionType(0L) + 282, objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            Object[] objArr2 = new Object[1];
            a(new char[]{10037, 19670, 61655, 25808, 35026, 15516, 41096, 54411, 30934, 60638, 4298, 34012, 10432, 23757, 49281, 29912, 39106, 3265, 45248, 9374, 18648, 64731, 24728, 38023, 14545, 44181, 53464, 17616, 59612, 7389, 32980, 13457, 22733, 52461, 28906, 58606, 2293, 48367, 8425, 21731, 63656, 27896, 37090, 1263, 43233, 56570, 16546, 62653, 6304, 36094, 12540, 42239, 51425, 31931, 57590, 5348, 47355, 11517, 20661, 50408, 26871, 40185}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27647, objArr2);
            strIntern = ((String) objArr2[0]).intern();
        }
        String str = strIntern;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setGradientType(1);
        gradientDrawable.setGradientRadius(TypedValue.applyDimension(1, 235.0f, getResources().getDisplayMetrics()));
        Configuration configuration = getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iIAuthTabCallbackDefault = new getUrlokhttp(new ICustomTabsService(configuration)).IAuthTabCallbackDefault();
        Configuration configuration2 = getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        gradientDrawable.setColors(new int[]{iIAuthTabCallbackDefault, ((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new ICustomTabsCallback_Parcel(configuration2))}, 480532619, -480532619, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue(), 0});
        gradientDrawable.setGradientCenter(0.5f, 0.5f);
        isFreeze isfreeze = IEngagementSignalsCallback_Parcel().asInterface;
        TdsImageView tdsImageView = isfreeze.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        TdsImageView.setImage$default(tdsImageView, str, (Function1) null, (Function1) null, 6, (Object) null);
        AnimateText animateText = isfreeze.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(animateText, "");
        AnimateText.onWarmupCompleted(animateText, list, readTimeout.asInterface.onExtraCallback.onExtraCallbackWithResult, 0, 0, "infinite", AnimateText.onNavigationEvent.TOP_CENTER, false, (Function0) null, (Function0) null, (Function0) null, 0, (Integer) null, 4044, (Object) null);
        isfreeze.onNavigationEvent.setBackground(gradientDrawable);
        LottieAnimationView lottieAnimationView = isfreeze.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        if (zOnExtraCallback) {
            int i7 = ICustomTabsServiceStub + 79;
            warmup = i7 % 128;
            int i8 = i7 % 2;
            i = 0;
        } else {
            i = 8;
        }
        lottieAnimationView.setVisibility(i);
        isfreeze.onExtraCallbackWithResult.setVisibility(0);
        isfreeze.onExtraCallbackWithResult.postDelayed(new Runnable() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda53
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i9 = 2 % 2;
                int i10 = onExtraCallbackWithResult + 73;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 == 0) {
                    CreditHomeActivity.ICustomTabsCallback(this.f$0);
                    int i11 = 56 / 0;
                } else {
                    CreditHomeActivity.ICustomTabsCallback(this.f$0);
                }
                int i12 = onExtraCallbackWithResult + 97;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
            }
        }, 3500L);
    }

    private static final void updateVisuals(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = warmup + 75;
        ICustomTabsServiceStub = i2 % 128;
        creditHomeActivity.IEngagementSignalsCallback_Parcel().asInterface.onExtraCallbackWithResult.setVisibility(i2 % 2 != 0 ? 93 : 8);
    }

    private static final Unit onExtraCallbackWithResult(CreditHomeActivity creditHomeActivity, switchJudgment switchjudgment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 89;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{10031, 60701, 45937, 31063, 4027, 54678, 39910, 41004}, Color.argb(0, 0, 0, 0) + 51749, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), creditHomeActivity.areNotificationsEnabled());
        Object[] objArr2 = new Object[1];
        c(new char[]{65532, 7, 65528, 65535, 7}, KeyEvent.getDeadChar(0, 0) + 2, true, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 4, 301 - ImageFormat.getBitsPerPixel(0), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), switchjudgment.onWarmupCompleted());
        setDetectableSize.onExtraCallback("cta_title", switchjudgment.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 51;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(CreditHomeActivity creditHomeActivity, switchJudgment switchjudgment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 59;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{10031, 60701, 45937, 31063, 4027, 54678, 39910, 41004}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 51750, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), creditHomeActivity.areNotificationsEnabled());
        Object[] objArr2 = new Object[1];
        c(new char[]{65532, 7, 65528, 65535, 7}, 3 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), true, Drawable.resolveOpacity(0, 0) + 5, 302 - View.resolveSize(0, 0), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), switchjudgment.onWarmupCompleted());
        setDetectableSize.onExtraCallback("cta_title", switchjudgment.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 115;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return unit;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.app.Activity, im.toss.feature.credit.ui.main.home.CreditHomeActivity] */
    private static /* synthetic */ Object access100(Object[] objArr) {
        final ?? r2 = (CreditHomeActivity) objArr[0];
        final switchJudgment switchjudgment = (switchJudgment) objArr[1];
        getTypedExportedConstants gettypedexportedconstants = (getTypedExportedConstants) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[3], "");
        ConvertByteArrayToFloatArray.onExtraCallback(1340479L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda41
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 109;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                CreditHomeActivity creditHomeActivity = this.f$0;
                if (i4 == 0) {
                    Object[] objArr2 = {creditHomeActivity, switchjudgment, (SetDetectableSize) obj};
                    return (Unit) CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 119655966, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr2, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -119655934);
                }
                Object[] objArr3 = {creditHomeActivity, switchjudgment, (SetDetectableSize) obj};
                throw null;
            }
        }, 14, null);
        SessionTrackerb.IAuthTabCallback(r2.validateRelationship(), (Activity) r2, isUcInitOpt.onWarmupCompleted(switchjudgment.onExtraCallbackWithResult(), "credit__main.bottomsheet_overdue_history_delete"), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        gettypedexportedconstants.dismiss();
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsServiceStub + 79;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = warmup + 35;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        gettypedexportedconstants.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 105;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(final switchJudgment switchjudgment) {
        String str;
        String strOnNavigationEvent;
        int i = 2 % 2;
        ICustomTabsCallbackStubProxy iCustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy.onExtraCallback;
        logAndOpenStore.IAuthTabCallback(this, (Long) null);
        final getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(this, 0, false, false, -1L, iCustomTabsCallbackStubProxy, 14, (DefaultConstructorMarker) null);
        ConvertByteArrayToFloatArray.onExtraCallback(1340477L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda61
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 45;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {this.f$0, switchjudgment, (SetDetectableSize) obj};
                Unit unit = (Unit) CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 577584397, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -577584361);
                int i5 = onExtraCallbackWithResult + 23;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return unit;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 14, null);
        Context context = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setTitle(switchjudgment.onWarmupCompleted());
        bottomSheetHeader.setShowCloseIcon(false);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsImageView tdsImageView = new TdsImageView(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        DisplayMetrics displayMetrics = tdsImageView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        layoutParams2.height = varyMatches.onNavigationEvent(250, displayMetrics);
        tdsImageView.setLayoutParams(layoutParams);
        tdsImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        Context context4 = tdsImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        if (((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context4}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
            int i2 = ICustomTabsServiceStub + 103;
            warmup = i2 % 128;
            if (i2 % 2 == 0) {
                strOnNavigationEvent = switchjudgment.onNavigationEvent();
                int i3 = 57 / 0;
            } else {
                strOnNavigationEvent = switchjudgment.onNavigationEvent();
            }
            int i4 = warmup + 3;
            ICustomTabsServiceStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 3;
            }
            str = strOnNavigationEvent;
        } else {
            String strOnExtraCallback = switchjudgment.onExtraCallback();
            int i6 = warmup + 41;
            ICustomTabsServiceStub = i6 % 128;
            int i7 = i6 % 2;
            str = strOnExtraCallback;
        }
        TdsImageView.setImage$default(tdsImageView, str, (Function1) null, (Function1) null, 6, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsImageView);
        Context context5 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context5);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, switchjudgment.IAuthTabCallback(), new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda62
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = onExtraCallback + 25;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                Unit unitOnExtraCallback = CreditHomeActivity.onExtraCallback(this.f$0, switchjudgment, gettypedexportedconstants, (View) obj);
                int i11 = onWarmupCompleted + 101;
                onExtraCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 16 / 0;
                }
                return unitOnExtraCallback;
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        tdsBottomCtaV1View.setBottomButtonType(TdsTextButtonV0View.IAuthTabCallback.GREY);
        tdsBottomCtaV1View.setBottomButton(tdsBottomCtaV1View.getContext().getString(im.toss.feature.credit.ui.main.R.string.credit_ui_main_do_next), new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda63
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                Unit unitIAuthTabCallback;
                int i8 = 2 % 2;
                int i9 = IAuthTabCallback + 81;
                onExtraCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    unitIAuthTabCallback = CreditHomeActivity.IAuthTabCallback(gettypedexportedconstants, (View) obj);
                    int i10 = 75 / 0;
                } else {
                    unitIAuthTabCallback = CreditHomeActivity.IAuthTabCallback(gettypedexportedconstants, (View) obj);
                }
                int i11 = onExtraCallback + 61;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallbackWithResult(access13800<? super Unit> access13800Var) throws Throwable {
        ICustomTabsCallbackStub iCustomTabsCallbackStub;
        SessionTrackera sessionTrackera;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 47;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z = access13800Var instanceof ICustomTabsCallbackStub;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (access13800Var instanceof ICustomTabsCallbackStub) {
            iCustomTabsCallbackStub = (ICustomTabsCallbackStub) access13800Var;
            int i3 = iCustomTabsCallbackStub.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iCustomTabsCallbackStub.label = i3 - 2147483648;
            } else {
                iCustomTabsCallbackStub = new ICustomTabsCallbackStub(access13800Var);
            }
        }
        ICustomTabsCallbackStub iCustomTabsCallbackStub2 = iCustomTabsCallbackStub;
        Object objOnExtraCallback = iCustomTabsCallbackStub2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = iCustomTabsCallbackStub2.label;
        if (i4 != 0) {
            int i5 = ICustomTabsServiceStub + 39;
            warmup = i5 % 128;
            if (i5 % 2 != 0 ? i4 != 1 : i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sessionTrackera = (SessionTrackera) iCustomTabsCallbackStub2.L$0;
            ResultKt.onNavigationEvent(objOnExtraCallback);
        } else {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            SessionTrackera sessionTrackera2 = this.readTypedObject;
            getDummyAd getdummyadICustomTabsServiceDefault = ICustomTabsServiceDefault();
            String strAreNotificationsEnabled = areNotificationsEnabled();
            networkAvailableOpt networkavailableopt = new networkAvailableOpt();
            iCustomTabsCallbackStub2.L$0 = sessionTrackera2;
            iCustomTabsCallbackStub2.label = 1;
            objOnExtraCallback = getDummyAd.onExtraCallback(getdummyadICustomTabsServiceDefault, this, "STD_3_CREDIT_PROTECTION", strAreNotificationsEnabled, "credit_main", 319L, (Map) null, networkavailableopt, false, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, iCustomTabsCallbackStub2, 8388512, (Object) null);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                int i6 = warmup + 125;
                ICustomTabsServiceStub = i6 % 128;
                int i7 = i6 % 2;
                return objOnWarmupCompleted;
            }
            sessionTrackera = sessionTrackera2;
        }
        sessionTrackera.onNavigationEvent(objOnExtraCallback);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onExtraCallback(CreditDualViewModel.onNavigationEvent onnavigationevent) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 79;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        if (!(!(onnavigationevent instanceof CreditDualViewModel.onNavigationEvent.onExtraCallbackWithResult))) {
            int i5 = i2 + 105;
            ICustomTabsServiceStub = i5 % 128;
            int i6 = i5 % 2;
            ITrustedWebActivityService().onExtraCallbackWithResult(true);
            return;
        }
        if (onnavigationevent instanceof CreditDualViewModel.onNavigationEvent.IAuthTabCallback) {
            int i7 = i2 + 95;
            ICustomTabsServiceStub = i7 % 128;
            int i8 = i7 % 2;
            read().onExtraCallback(((CreditDualViewModel.onNavigationEvent.IAuthTabCallback) onnavigationevent).onExtraCallback());
            ITrustedWebActivityService().onNavigationEvent();
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.feature.credit.ui.main.home.Hilt_CreditHomeActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = warmup + 89;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.base.BaseActivity*/.onResume();
        ITrustedWebActivityService().onMessageChannelReady();
        Object[] objArr = {ITrustedWebActivityService()};
        CreditHomeViewModel.onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -144714933, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 144714943, objArr);
        ITrustedWebActivityService().writeTypedObject();
        ITrustedWebActivityService().onMinimized();
        ITrustedWebActivityService().onActivityLayout();
        ITrustedWebActivityService().onPostMessage();
        if (read().onExtraCallbackWithResult()) {
            int i4 = warmup + 95;
            ICustomTabsServiceStub = i4 % 128;
            int i5 = i4 % 2;
            onNavigationEvent(this, false, 1, (Object) null);
            Object[] objArr2 = {ITrustedWebActivityService()};
            CreditHomeViewModel.onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1530621493, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1530621499, objArr2);
        }
    }

    public void onStop() {
        int i = 2 % 2;
        int i2 = warmup + 51;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            super.onStop();
            ITrustedWebActivityService().isEngagementSignalsApiAvailable();
            int i3 = 35 / 0;
        } else {
            super.onStop();
            ITrustedWebActivityService().isEngagementSignalsApiAvailable();
        }
    }

    private static final Unit IAuthTabCallback(boolean z, ScoreDeltaInfo scoreDeltaInfo, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 63;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        if (!(!z) && scoreDeltaInfo != null) {
            int i4 = warmup + 93;
            ICustomTabsServiceStub = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{10025, 5907, 18243, 47005}, TextUtils.indexOf((CharSequence) "", '0') + 12344, objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), scoreDeltaInfo.onWarmupCompleted(str));
        }
        Unit unit = Unit.INSTANCE;
        int i6 = warmup + 3;
        ICustomTabsServiceStub = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 3 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(boolean z, ScoreDeltaInfo scoreDeltaInfo, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 31;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        if (z && scoreDeltaInfo != null) {
            int i4 = warmup + 75;
            ICustomTabsServiceStub = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{10025, 5907, 18243, 47005}, ((byte) KeyEvent.getModifierMetaStateMask()) + 12344, objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), scoreDeltaInfo.onWarmupCompleted(str));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(getTime gettime) throws Throwable {
        final ScoreDeltaInfo scoreDeltaInfoOnExtraCallbackWithResult;
        String str;
        CreditHomeHeaderResponse creditHomeHeaderResponseOnTransact;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 31;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        liteProcessHandlerThreadOpt liteprocesshandlerthreadopt = (liteProcessHandlerThreadOpt) ITrustedWebActivityService().access100().IAuthTabCallback();
        Object obj = null;
        if (liteprocesshandlerthreadopt == null || (creditHomeHeaderResponseOnTransact = liteprocesshandlerthreadopt.onTransact()) == null) {
            int i4 = ICustomTabsServiceStub + 7;
            warmup = i4 % 128;
            int i5 = i4 % 2;
            scoreDeltaInfoOnExtraCallbackWithResult = null;
        } else {
            scoreDeltaInfoOnExtraCallbackWithResult = creditHomeHeaderResponseOnTransact.onExtraCallbackWithResult();
        }
        createWifiConfiguration.onExtraCallbackWithResult onextracallbackwithresult = createWifiConfiguration.onExtraCallbackWithResult.onExtraCallback;
        liteProcessHandlerThreadOpt liteprocesshandlerthreadopt2 = (liteProcessHandlerThreadOpt) ITrustedWebActivityService().access100().IAuthTabCallback();
        if (liteprocesshandlerthreadopt2 != null) {
            int i6 = ICustomTabsServiceStub + 81;
            warmup = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            str = (String) liteProcessHandlerThreadOpt.onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 46942577, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -46942575, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{liteprocesshandlerthreadopt2});
            if (str == null) {
                str = "";
            }
        }
        final boolean zOnExtraCallback = onextracallbackwithresult.onExtraCallback(str);
        final String strName = gettime.IAuthTabCallback().name();
        int i7 = IAuthTabCallback.onExtraCallbackWithResult[gettime.IAuthTabCallback().ordinal()];
        if (i7 == 1) {
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1213871L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda65
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) throws Throwable {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallback + 61;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 == 0) {
                        CreditHomeActivity.onNavigationEvent(zOnExtraCallback, scoreDeltaInfoOnExtraCallbackWithResult, strName, (SetDetectableSize) obj2);
                        throw null;
                    }
                    Unit unitOnNavigationEvent = CreditHomeActivity.onNavigationEvent(zOnExtraCallback, scoreDeltaInfoOnExtraCallbackWithResult, strName, (SetDetectableSize) obj2);
                    int i10 = onWarmupCompleted + 113;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    return unitOnNavigationEvent;
                }
            }, 14, null);
        } else {
            if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1217805L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda66
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2) {
                    int i8 = 2 % 2;
                    int i9 = IAuthTabCallback + 103;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unit = (Unit) CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1351190312, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{Boolean.valueOf(zOnExtraCallback), scoreDeltaInfoOnExtraCallbackWithResult, strName, (SetDetectableSize) obj2}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1351190294);
                    int i11 = onNavigationEvent + 19;
                    IAuthTabCallback = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 25 / 0;
                    }
                    return unit;
                }
            }, 14, null);
        }
        if (gettime instanceof getTime.onNavigationEvent) {
            int i8 = warmup + 23;
            ICustomTabsServiceStub = i8 % 128;
            int i9 = i8 % 2;
            getTime.onNavigationEvent onnavigationevent = (getTime.onNavigationEvent) gettime;
            if (onnavigationevent.IAuthTabCallbackDefault()) {
                SessionTrackerb sessionTrackerbValidateRelationship = validateRelationship();
                h5ScreenShotObserverOnChangeOpt.IAuthTabCallbackStub iAuthTabCallbackStub = h5ScreenShotObserverOnChangeOpt.IAuthTabCallbackStub.onExtraCallback;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("bureau", onnavigationevent.IAuthTabCallback().name());
                Object[] objArr = new Object[1];
                a(new char[]{10031, 60701, 45937, 31063, 4027, 54678, 39910, 41004}, TextUtils.getTrimmedLength("") + 51749, objArr);
                SessionTrackerb.IAuthTabCallback(sessionTrackerbValidateRelationship, this, iAuthTabCallbackStub.onNavigationEvent(CollectionsKt.listOf(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "credit_main")})), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                return;
            }
            return;
        }
        if (gettime instanceof getTime.IAuthTabCallback) {
            NiceDiErrorBottomSheetFragment niceDiErrorBottomSheetFragment = new NiceDiErrorBottomSheetFragment();
            FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            niceDiErrorBottomSheetFragment.show(supportFragmentManager, "NiceDiErrorBottomSheetFragment");
            return;
        }
        if (!(gettime instanceof getTime.onWarmupCompleted)) {
            TdsToastV1.onWarmupCompleted onwarmupcompleted = TdsToastV1.Companion;
            String string = getString(im.toss.features.credit.ui.R.string.credit_ui_main___c6a78a0555);
            Intrinsics.checkNotNullExpressionValue(string, "");
            BrickModulePackageExternalSyntheticLambda0.onExtraCallbackWithResult(TdsToastV1.onNavigationEvent.onNavigationEvent(isShowTransAnimate.onWarmupCompleted(onwarmupcompleted, string), im.toss.core.R.drawable.icn_attention_color, 0, 2, (Object) null), 0, (Integer) null, 0, 7, (Object) null);
            return;
        }
        if (((getTime.onWarmupCompleted) gettime).IAuthTabCallback() == enableNebulaServiceInitOpt.NICE) {
            int i10 = warmup + 55;
            ICustomTabsServiceStub = i10 % 128;
            if (i10 % 2 == 0) {
                ITrustedWebActivityService().asBinder();
            } else {
                ITrustedWebActivityService().asBinder();
                obj.hashCode();
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(Uri uri) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 25;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            String strICustomTabsCallback = IPostMessageServiceDefault().ICustomTabsCallback();
            Object[] objArr = new Object[1];
            a(new char[]{10044, 60844, 45591, 30946, 3400}, 51821 - AndroidCharacter.getMirror('G'), objArr);
            if (!Intrinsics.areEqual(strICustomTabsCallback, ((String) objArr[0]).intern())) {
                return;
            }
        } else {
            String strICustomTabsCallback2 = IPostMessageServiceDefault().ICustomTabsCallback();
            Object[] objArr2 = new Object[1];
            a(new char[]{10044, 60844, 45591, 30946, 3400}, AndroidCharacter.getMirror('0') + 51821, objArr2);
            if (!Intrinsics.areEqual(strICustomTabsCallback2, ((String) objArr2[0]).intern())) {
                return;
            }
        }
        int i3 = ICustomTabsServiceStub + 99;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        if (IPostMessageServiceDefault().onActivityLayout()) {
            UriMatcher uriMatcher = new UriMatcher(-1);
            uriMatcher.addURI("dashboard", "credit", 1);
            uriMatcher.addURI("landing", "credit", 1);
            uriMatcher.addURI("credit", null, 1);
            if (uriMatcher.match(uri) == 1) {
                int i5 = im.toss.feature.credit.ui.main.R.string.credit_unsupported_scheme;
                Object[] objArr3 = new Object[1];
                c(new char[]{18, 16, 3, 14, 19, 17, '\f', 7, 65535, 11, 65485, 18, 7, 2, 3, 16, 1, 65485, 65485, 65496, 17, 17, '\r'}, (Process.myPid() >> 22) + 6, true, (ViewConfiguration.getFadingEdgeLength() >> 16) + 23, View.getDefaultSize(0, 0) + 291, objArr3);
                onJsBridgeReady.onNavigationEvent(this, getString(i5, ((String) objArr3[0]).intern()), 0, 2, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewIntent(@NotNull Intent intent) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        super/*im.toss.base.BaseActivity*/.onNewIntent(intent);
        CreditDualViewModel creditDualViewModel = read();
        h5ScreenShotObserverOnChangeOpt.onExtraCallback onextracallback = h5ScreenShotObserverOnChangeOpt.Companion;
        creditDualViewModel.onExtraCallback(onextracallback.onNavigationEvent(intent));
        h5ScreenShotObserverOnChangeOpt.IAuthTabCallbackDefault iAuthTabCallbackDefault = h5ScreenShotObserverOnChangeOpt.IAuthTabCallbackDefault.onExtraCallback;
        Object[] objArr = {read(), iAuthTabCallbackDefault.onNavigationEvent(intent), new RouteType.OnNewIntent(onextracallback.onNavigationEvent(intent))};
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        CreditDualViewModel.IAuthTabCallback(-564089911, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), objArr, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, 564089912);
        if (iAuthTabCallbackDefault.IAuthTabCallback(intent)) {
            int i2 = ICustomTabsServiceStub + 33;
            warmup = i2 % 128;
            if (i2 % 2 == 0) {
                ITrustedWebActivityService().onExtraCallbackWithResult(false);
            } else {
                ITrustedWebActivityService().onExtraCallbackWithResult(true);
            }
        }
        int i3 = ICustomTabsServiceStub + 73;
        warmup = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 68 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onRestart() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 7;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        super/*android.app.Activity*/.onRestart();
        read().onExtraCallback();
        ITrustedWebActivityService().ICustomTabsCallbackStubProxy();
        int i4 = warmup + 41;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean bg_() throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 41;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        if (AudioAttributesImplApi26Parcelizer()) {
            ((setFinalY) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 602740871, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -602740846)).onWarmupCompleted(this, "CREDIT");
            return true;
        }
        if (!(!isTaskRoot())) {
            finish();
            SessionTrackerb sessionTrackerbValidateRelationship = validateRelationship();
            Object[] objArr = new Object[1];
            a(new char[]{10030, 47807, 7171, 65533, 20851, 13530, 38584, 26639, 52118, 44328, 148, 57871, 17444, 10135, 47478, 7402}, 40343 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
            SessionTrackerb.IAuthTabCallback(sessionTrackerbValidateRelationship, this, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        }
        if (IEngagementSignalsCallback_Parcel().asBinder.asInterface().isEnabled()) {
            int i4 = warmup + 5;
            ICustomTabsServiceStub = i4 % 128;
            int i5 = i4 % 2;
            if (IEngagementSignalsCallback_Parcel().onExtraCallbackWithResult.isClickable()) {
                ICustomTabsService_Parcel();
                int i6 = warmup + 67;
                ICustomTabsServiceStub = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
        }
        return super/*im.toss.base.BaseActivity*/.bg_();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = warmup + 55;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            super/*im.toss.base.BaseActivity*/.onDestroy();
            ConvertByteArrayToFloatArray.onExtraCallback(1213885L, false, null, null, null, 74, null);
        } else {
            super/*im.toss.base.BaseActivity*/.onDestroy();
            ConvertByteArrayToFloatArray.onExtraCallback(1213885L, false, null, null, null, 30, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final int ICustomTabsService(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = warmup + 121;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        DisplayMetrics displayMetrics = creditHomeActivity.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(12, displayMetrics);
        int i4 = warmup + 9;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return iOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final int IPostMessageServiceStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 111;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) this.extraCallback.getValue();
        if (i3 != 0) {
            return number.intValue();
        }
        number.intValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = warmup + 45;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            creditHomeActivity.ICustomTabsService_Parcel();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        creditHomeActivity.ICustomTabsService_Parcel();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String newAuthTabSession(CreditHomeActivity creditHomeActivity) throws Resources.NotFoundException {
        String string;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 43;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Resources resources = creditHomeActivity.getResources();
        if (i3 == 0) {
            string = resources.getString(im.toss.feature.credit.ui.main.R.string.neo_animate_top_first_title_sample);
            int i4 = 94 / 0;
        } else {
            string = resources.getString(im.toss.feature.credit.ui.main.R.string.neo_animate_top_first_title_sample);
        }
        int i5 = warmup + 31;
        ICustomTabsServiceStub = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 1;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) creditHomeActivity.onActivityResized.getValue();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = warmup + 29;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private final String getSmallIconBitmap() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 23;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.ICustomTabsCallback_Parcel.getValue();
        if (i3 != 0) {
            return (String) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String warmup(CreditHomeActivity creditHomeActivity) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 113;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        String string = creditHomeActivity.getResources().getString(im.toss.feature.credit.ui.main.R.string.neo_animate_top_title);
        int i4 = ICustomTabsServiceStub + 119;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    private final String ITrustedWebActivityServiceDefault() {
        int i = 2 % 2;
        int i2 = warmup + 53;
        ICustomTabsServiceStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = (String) this.extraCommand.getValue();
        int i3 = warmup + 95;
        ICustomTabsServiceStub = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Resources.NotFoundException {
        zzo zzoVar = (CreditHomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 23;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Resources resources = zzoVar.getResources();
        if (i3 == 0) {
            resources.getString(im.toss.feature.credit.ui.main.R.string.neo_animate_top_subtitle);
            throw null;
        }
        String string = resources.getString(im.toss.feature.credit.ui.main.R.string.neo_animate_top_subtitle);
        int i4 = ICustomTabsServiceStub + 123;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    private final int onSessionEnded() {
        int iIntValue;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 115;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            iIntValue = ((Number) this.IAuthTabCallbackStub.getValue()).intValue();
            int i3 = 75 / 0;
        } else {
            iIntValue = ((Number) this.IAuthTabCallbackStub.getValue()).intValue();
        }
        int i4 = ICustomTabsServiceStub + 61;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, im.toss.feature.credit.ui.main.home.CreditHomeActivity, java.lang.Object] */
    private static /* synthetic */ Object mayLaunchUrl(Object[] objArr) {
        ?? r1 = (CreditHomeActivity) objArr[0];
        int i = 2 % 2;
        SubTypography2 subTypography2 = new SubTypography2((Context) r1, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        subTypography2.onNavigationEvent(response.Bold);
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        String str = (String) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1151292178, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{r1}, iOnWarmupCompleted3, 1151292207);
        int iOnWarmupCompleted4 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted5 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted6 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, ((String) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1151292178, iOnWarmupCompleted4, iOnWarmupCompleted5, new Object[]{r1}, iOnWarmupCompleted6, 1151292207)).length(), subTypography2.getPaint(), r1.cancelNotification()).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "");
        int height = staticLayoutBuild.getHeight();
        int i2 = warmup + 81;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        return Integer.valueOf(height);
    }

    private final int onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = warmup + 101;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.asInterface.getValue()).intValue();
        int i4 = ICustomTabsServiceStub + 59;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final int extraCommand(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        SubTypography2 subTypography2 = new SubTypography2(creditHomeActivity, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        subTypography2.onNavigationEvent(response.Bold);
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(creditHomeActivity.getSmallIconBitmap(), 0, creditHomeActivity.getSmallIconBitmap().length(), subTypography2.getPaint(), creditHomeActivity.cancelNotification()).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "");
        int height = staticLayoutBuild.getHeight();
        int i2 = warmup + 71;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            return height;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final int IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = warmup + 105;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) this.asBinder.getValue();
        if (i3 == 0) {
            return number.intValue();
        }
        number.intValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final int mayLaunchUrl(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(creditHomeActivity.ITrustedWebActivityServiceDefault(), 0, creditHomeActivity.ITrustedWebActivityServiceDefault().length(), new Typography5(creditHomeActivity, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null).getPaint(), creditHomeActivity.cancelNotification()).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "");
        int height = staticLayoutBuild.getHeight();
        int i2 = ICustomTabsServiceStub + 55;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        return height;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final int isEngagementSignalsApiAvailable(CreditHomeActivity creditHomeActivity) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 3;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Resources resources = creditHomeActivity.getResources();
        int i4 = im.toss.tds.view.R.dimen.animate_top_padding;
        if (i3 != 0) {
            return resources.getDimensionPixelSize(i4);
        }
        resources.getDimensionPixelSize(i4);
        throw null;
    }

    private final int onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 67;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            ((Number) this.getInterfaceDescriptor.getValue()).intValue();
            throw null;
        }
        int iIntValue = ((Number) this.getInterfaceDescriptor.getValue()).intValue();
        int i3 = ICustomTabsServiceStub + 21;
        warmup = i3 % 128;
        if (i3 % 2 != 0) {
            return iIntValue;
        }
        throw null;
    }

    private final int IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        int i2 = warmup + 125;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.onTransact.getValue()).intValue();
        int i4 = ICustomTabsServiceStub + 115;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return iIntValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object newAuthTabSession(Object[] objArr) throws Resources.NotFoundException {
        zzo zzoVar = (CreditHomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 77;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        int dimensionPixelSize = zzoVar.getResources().getDimensionPixelSize(im.toss.feature.credit.ui.main.R.dimen.credit_ui_main_neo_animate_top_inter_margin);
        int i4 = ICustomTabsServiceStub + 103;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return Integer.valueOf(dimensionPixelSize);
        }
        int i5 = 4 / 0;
        return Integer.valueOf(dimensionPixelSize);
    }

    private final int IPostMessageServiceStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 105;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.ICustomTabsCallback.getValue()).intValue();
        int i4 = ICustomTabsServiceStub + 115;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return iIntValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final int postMessage(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = warmup + 101;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnVerticalScrollEvent = creditHomeActivity.onVerticalScrollEvent();
        return i3 != 0 ? (iOnVerticalScrollEvent % 1) % creditHomeActivity.onSessionEnded() : (iOnVerticalScrollEvent << 1) + creditHomeActivity.onSessionEnded();
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 85;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) creditHomeActivity.isEngagementSignalsApiAvailable.getValue()).intValue();
        int i4 = warmup + 27;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return Integer.valueOf(iIntValue);
    }

    private static final int ICustomTabsServiceDefault(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 73;
        warmup = i2 % 128;
        int iOnVerticalScrollEvent = i2 % 2 == 0 ? (((creditHomeActivity.onVerticalScrollEvent() % 0) >>> creditHomeActivity.onGreatestScrollPercentageIncreased()) / creditHomeActivity.IEngagementSignalsCallbackStub()) % creditHomeActivity.IEngagementSignalsCallbackDefault() : (creditHomeActivity.onVerticalScrollEvent() << 1) + creditHomeActivity.onGreatestScrollPercentageIncreased() + creditHomeActivity.IEngagementSignalsCallbackStub() + creditHomeActivity.IEngagementSignalsCallbackDefault();
        int i3 = ICustomTabsServiceStub + 25;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        return iOnVerticalScrollEvent;
    }

    private static final int AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = warmup + 107;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int iAsInterface = M_.onExtraCallback.asInterface();
        int i4 = ICustomTabsServiceStub + 57;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return iAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final int cancelNotification() {
        int i = 2 % 2;
        int i2 = warmup + 41;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.mayLaunchUrl.getValue()).intValue();
        int i4 = warmup + 119;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return iIntValue;
        }
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsService(Object[] objArr) {
        int i = 2 % 2;
        int i2 = warmup + 17;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        M_ m_ = M_.onExtraCallback;
        if (i3 == 0) {
            return Integer.valueOf(m_.IAuthTabCallbackDefault());
        }
        m_.IAuthTabCallbackDefault();
        throw null;
    }

    private final int ITrustedWebActivityCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 89;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.ICustomTabsCallbackStubProxy.getValue()).intValue();
        int i4 = warmup + 121;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    private final int ITrustedWebActivityCallbackStubProxy() {
        int iIntValue;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 15;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            iIntValue = ((Number) this.ICustomTabsCallbackStub.getValue()).intValue();
            int i3 = 74 / 0;
        } else {
            iIntValue = ((Number) this.ICustomTabsCallbackStub.getValue()).intValue();
        }
        int i4 = ICustomTabsServiceStub + 25;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return iIntValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final int requestPostMessageChannelWithExtras(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        int i2 = warmup + 31;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int measuredWidth = creditHomeActivity.IEngagementSignalsCallback_Parcel().access100.onExtraCallback().getMeasuredWidth();
        int i4 = warmup + 99;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return measuredWidth;
    }

    private static final void getInterfaceDescriptor(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 125;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        creditHomeActivity.onNavigationEvent(enableoverridependingtransitionnew, enableNebulaServiceInitOpt.KCB, enablePreloadClassOpt.KCB);
        int i4 = warmup + 107;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static final class setEngagementSignalsCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ enableOverridePendingTransitionNew $this_startKcbOnlyInteraction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setEngagementSignalsCallback(enableOverridePendingTransitionNew enableoverridependingtransitionnew, access13800<? super setEngagementSignalsCallback> access13800Var) {
            super(2, access13800Var);
            this.$this_startKcbOnlyInteraction = enableoverridependingtransitionnew;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            setEngagementSignalsCallback setengagementsignalscallback = CreditHomeActivity.this.new setEngagementSignalsCallback(this.$this_startKcbOnlyInteraction, access13800Var);
            int i2 = IAuthTabCallback + 55;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return setengagementsignalscallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 91;
            IAuthTabCallback = i4 % 128;
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
            int i2 = onExtraCallback + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            ResultKt.onNavigationEvent(obj);
            if (i3 == 0) {
                CreditHomeActivity.onNavigationEvent(CreditHomeActivity.this, this.$this_startKcbOnlyInteraction, enableNebulaServiceInitOpt.KCB, enablePreloadClassOpt.KCB);
                Unit unit = Unit.INSTANCE;
                obj2.hashCode();
                throw null;
            }
            CreditHomeActivity.onNavigationEvent(CreditHomeActivity.this, this.$this_startKcbOnlyInteraction, enableNebulaServiceInitOpt.KCB, enablePreloadClassOpt.KCB);
            Unit unit2 = Unit.INSTANCE;
            int i4 = onExtraCallback + 91;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit2;
            }
            throw null;
        }
    }

    private final void onExtraCallbackWithResult(final enableOverridePendingTransitionNew enableoverridependingtransitionnew) {
        int i = 2 % 2;
        IEngagementSignalsCallback_Parcel().onWarmupCompleted().post(new Runnable() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda50
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 53;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    CreditHomeActivity.onExtraCallbackWithResult(this.f$0, enableoverridependingtransitionnew);
                    int i4 = 27 / 0;
                } else {
                    CreditHomeActivity.onExtraCallbackWithResult(this.f$0, enableoverridependingtransitionnew);
                }
                int i5 = onExtraCallback + 53;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        IEngagementSignalsCallback_Parcel().onWarmupCompleted().postDelayed(new Runnable() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda51
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 105;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                CreditHomeActivity.onNavigationEvent(this.f$0, enableoverridependingtransitionnew);
                int i5 = onExtraCallback + 109;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
        }, this.setEngagementSignalsCallback);
        int i2 = ICustomTabsServiceStub + 81;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 64 / 0;
        }
    }

    private static final void IAuthTabCallbackStubProxy(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(creditHomeActivity), (CoroutineContext) null, (setRandomHost) null, creditHomeActivity.new setEngagementSignalsCallback(enableoverridependingtransitionnew, null), 3, (Object) null);
        int i2 = ICustomTabsServiceStub + 21;
        warmup = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void access100(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 47;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            creditHomeActivity.onNavigationEvent(enableoverridependingtransitionnew, enableNebulaServiceInitOpt.NICE, enablePreloadClassOpt.NICE);
        } else {
            creditHomeActivity.onNavigationEvent(enableoverridependingtransitionnew, enableNebulaServiceInitOpt.NICE, enablePreloadClassOpt.NICE);
            throw null;
        }
    }

    static final class requestPostMessageChannel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ enableOverridePendingTransitionNew $this_startNiceOnlyInteraction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        requestPostMessageChannel(enableOverridePendingTransitionNew enableoverridependingtransitionnew, access13800<? super requestPostMessageChannel> access13800Var) {
            super(2, access13800Var);
            this.$this_startNiceOnlyInteraction = enableoverridependingtransitionnew;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            requestPostMessageChannel requestpostmessagechannelCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return requestpostmessagechannelCreate.invokeSuspend(unit);
            }
            requestpostmessagechannelCreate.invokeSuspend(unit);
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            requestPostMessageChannel requestpostmessagechannel = CreditHomeActivity.this.new requestPostMessageChannel(this.$this_startNiceOnlyInteraction, access13800Var);
            int i2 = onWarmupCompleted + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return requestpostmessagechannel;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 115;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            CreditHomeActivity.onNavigationEvent(CreditHomeActivity.this, this.$this_startNiceOnlyInteraction, enableNebulaServiceInitOpt.NICE, enablePreloadClassOpt.NICE);
            return Unit.INSTANCE;
        }
    }

    private final void onExtraCallback(final enableOverridePendingTransitionNew enableoverridependingtransitionnew) {
        int i = 2 % 2;
        IEngagementSignalsCallback_Parcel().onWarmupCompleted().post(new Runnable() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda57
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 13;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                CreditHomeActivity.asInterface(this.f$0, enableoverridependingtransitionnew);
                int i5 = IAuthTabCallback + 35;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 / 0;
                }
            }
        });
        IEngagementSignalsCallback_Parcel().onWarmupCompleted().postDelayed(new Runnable() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda58
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 117;
                onNavigationEvent = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    Object[] objArr = {this.f$0, enableoverridependingtransitionnew};
                    CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -23419719, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 23419729);
                    throw null;
                }
                Object[] objArr2 = {this.f$0, enableoverridependingtransitionnew};
                CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -23419719, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr2, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 23419729);
                int i4 = IAuthTabCallback + 87;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }, this.setEngagementSignalsCallback);
        int i2 = warmup + 59;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void access000(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(creditHomeActivity), (CoroutineContext) null, (setRandomHost) null, creditHomeActivity.new requestPostMessageChannel(enableoverridependingtransitionnew, null), 3, (Object) null);
        int i2 = warmup + 9;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void onTransact(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 27;
        warmup = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            creditHomeActivity.onNavigationEvent(enableoverridependingtransitionnew, (enableNebulaServiceInitOpt) null, enablePreloadClassOpt.BOTH);
        } else {
            creditHomeActivity.onNavigationEvent(enableoverridependingtransitionnew, (enableNebulaServiceInitOpt) null, enablePreloadClassOpt.BOTH);
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit IAuthTabCallbackDefault(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew) {
        int iIntValue;
        int iIntValue2;
        int i = 2 % 2;
        int i2 = warmup + 51;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        Integer num = (Integer) enableOverridePendingTransitionNew.onNavigationEvent(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -1984884629, 1984884629, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{enableoverridependingtransitionnew});
        int i3 = 0;
        int iIntValue3 = num != null ? num.intValue() : 0;
        Integer numIAuthTabCallback = enableoverridependingtransitionnew.IAuthTabCallback();
        creditHomeActivity.onWarmupCompleted(iIntValue3, numIAuthTabCallback != null ? numIAuthTabCallback.intValue() : 0, enableNebulaServiceInitOpt.KCB);
        Integer numIAuthTabCallbackStub = enableoverridependingtransitionnew.IAuthTabCallbackStub();
        if (numIAuthTabCallbackStub != null) {
            int i4 = ICustomTabsServiceStub + 125;
            warmup = i4 % 128;
            int i5 = i4 % 2;
            iIntValue = numIAuthTabCallbackStub.intValue();
        } else {
            int i6 = warmup + 19;
            ICustomTabsServiceStub = i6 % 128;
            int i7 = i6 % 2;
            iIntValue = 0;
        }
        Integer numIAuthTabCallbackDefault = enableoverridependingtransitionnew.IAuthTabCallbackDefault();
        if (numIAuthTabCallbackDefault != null) {
            int i8 = ICustomTabsServiceStub + 71;
            warmup = i8 % 128;
            if (i8 % 2 == 0) {
                iIntValue2 = numIAuthTabCallbackDefault.intValue();
                int i9 = 80 / 0;
            } else {
                iIntValue2 = numIAuthTabCallbackDefault.intValue();
            }
            i3 = iIntValue2;
        }
        creditHomeActivity.onWarmupCompleted(iIntValue, i3, enableNebulaServiceInitOpt.NICE);
        return Unit.INSTANCE;
    }

    static final class prefetch extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        int label;

        prefetch(access13800<? super prefetch> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            prefetch prefetchVar = CreditHomeActivity.this.new prefetch(access13800Var);
            int i2 = onNavigationEvent + 89;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return prefetchVar;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 119;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 89 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 34 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Object obj2 = null;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(1000L, this) == objOnWarmupCompleted) {
                    int i3 = onWarmupCompleted + 63;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = onWarmupCompleted + 123;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            if (CreditHomeActivity.onUnminimized(CreditHomeActivity.this).compareAndSet(false, true)) {
                int i5 = onWarmupCompleted + 13;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                CreditHomeActivity.onExtraCallback(CreditHomeActivity.this, enablePreloadClassOpt.BOTH);
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit access200(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(creditHomeActivity), (CoroutineContext) null, (setRandomHost) null, creditHomeActivity.new prefetch(null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = warmup + 77;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final void asBinder(final CreditHomeActivity creditHomeActivity, final enableOverridePendingTransitionNew enableoverridependingtransitionnew) {
        int iIntValue;
        int iIntValue2;
        int i = 2 % 2;
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        enableNebulaServiceInitOpt enablenebulaserviceinitopt = enableNebulaServiceInitOpt.KCB;
        runOnUiThreadDelayed runonuithreaddelayed = (runOnUiThreadDelayed) onNavigationEvent(zzho.onWarmupCompleted(), 864640163, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), zzho.onWarmupCompleted(), new Object[]{creditHomeActivity, enablenebulaserviceinitopt}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 18761494, -864640141);
        enableNebulaServiceInitOpt enablenebulaserviceinitopt2 = enableNebulaServiceInitOpt.NICE;
        runOnUiThreadDelayed runonuithreaddelayed2 = (runOnUiThreadDelayed) onNavigationEvent(zzho.onWarmupCompleted(), 864640163, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), zzho.onWarmupCompleted(), new Object[]{creditHomeActivity, enablenebulaserviceinitopt2}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 18761494, -864640141);
        runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallback = creditHomeActivity.IAuthTabCallback(1000);
        runOnUiThreadDelayed runonuithreaddelayedITrustedWebActivityCallbackStub = creditHomeActivity.ITrustedWebActivityCallbackStub();
        runOnUiThreadDelayed runonuithreaddelayed3 = (runOnUiThreadDelayed) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1017811729, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{creditHomeActivity, enablenebulaserviceinitopt}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1017811698);
        runOnUiThreadDelayed runonuithreaddelayed4 = (runOnUiThreadDelayed) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1017811729, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{creditHomeActivity, enablenebulaserviceinitopt2}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1017811698);
        enablePreloadClassOpt enablepreloadclassopt = enablePreloadClassOpt.BOTH;
        Integer numIAuthTabCallback = enableoverridependingtransitionnew.IAuthTabCallback();
        if (numIAuthTabCallback != null) {
            int i2 = warmup + 25;
            ICustomTabsServiceStub = i2 % 128;
            int i3 = i2 % 2;
            iIntValue = numIAuthTabCallback.intValue();
        } else {
            iIntValue = 0;
        }
        runOnUiThreadDelayed runonuithreaddelayed5 = (runOnUiThreadDelayed) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 896884779, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{creditHomeActivity, enablenebulaserviceinitopt, enablepreloadclassopt, Integer.valueOf(iIntValue)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -896884778);
        Integer numIAuthTabCallbackDefault = enableoverridependingtransitionnew.IAuthTabCallbackDefault();
        if (numIAuthTabCallbackDefault != null) {
            int i4 = warmup + 29;
            ICustomTabsServiceStub = i4 % 128;
            int i5 = i4 % 2;
            iIntValue2 = numIAuthTabCallbackDefault.intValue();
            int i6 = ICustomTabsServiceStub + 87;
            warmup = i6 % 128;
            int i7 = i6 % 2;
        } else {
            iIntValue2 = 0;
        }
        isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new runOnUiThreadDelayed[]{runonuithreaddelayed, runonuithreaddelayed2, runonuithreaddelayedIAuthTabCallback, runonuithreaddelayedITrustedWebActivityCallbackStub, runonuithreaddelayed3, runonuithreaddelayed4, runonuithreaddelayed5, (runOnUiThreadDelayed) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 896884779, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{creditHomeActivity, enablenebulaserviceinitopt2, enablepreloadclassopt, Integer.valueOf(iIntValue2)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -896884778)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), (Object) null, new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i8 = 2 % 2;
                int i9 = IAuthTabCallback + 49;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                Unit unitIAuthTabCallbackStub = CreditHomeActivity.IAuthTabCallbackStub(this.f$0, enableoverridependingtransitionnew);
                int i11 = onNavigationEvent + 69;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                return unitIAuthTabCallbackStub;
            }
        }, 1, (Object) null), (Object) null, new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda7
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i8 = 2 % 2;
                int i9 = onWarmupCompleted + 101;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                Object[] objArr = {this.f$0};
                Unit unit = (Unit) CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 2059010559, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -2059010538);
                int i11 = onWarmupCompleted + 107;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                return unit;
            }
        }, 1, (Object) null), false, 1, (Object) null);
    }

    private final runOnUiThreadDelayed IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        IEngagementSignalsCallback_Parcel().IAuthTabCallback.setVisibility(0);
        deprecated_dns deprecated_dnsVarOnExtraCallbackWithResult = deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult();
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        TdsGLBlurView tdsGLBlurView = IEngagementSignalsCallback_Parcel().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsGLBlurView, "");
        Address address = Address.onNavigationEvent;
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsGLBlurView, isMuted.onExtraCallbackWithResult(RallysKt.onExtraCallback(address.asBinder(), this.onRelationshipValidationResult), deprecated_directory.None, deprecated_directory.Medium, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        LottieAnimationView lottieAnimationView = IEngagementSignalsCallback_Parcel().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{lottieAnimationView, isMuted.onNavigationEvent(RallysKt.onExtraCallback(address.asBinder(), this.onRelationshipValidationResult), Float.valueOf(0.0f), Float.valueOf(1.0f), (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        LottieAnimationView lottieAnimationView2 = IEngagementSignalsCallback_Parcel().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rally, rally2, (Rally) RallysKt.onWarmupCompleted(new Object[]{lottieAnimationView2, (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{new AppLovinSdkSettings(), Float.valueOf(0.0f), Float.valueOf(i / 1000.0f), new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda11
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 123;
                onExtraCallback = i4 % 128;
                Object obj2 = null;
                if (i4 % 2 == 0) {
                    CreditHomeActivity.onExtraCallbackWithResult(this.f$0, ((Float) obj).floatValue());
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = CreditHomeActivity.onExtraCallbackWithResult(this.f$0, ((Float) obj).floatValue());
                int i5 = onExtraCallback + 87;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnExtraCallbackWithResult;
                }
                obj2.hashCode();
                throw null;
            }
        }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 500}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, deprecated_dnsVarOnExtraCallbackWithResult, (Integer) null, (Boolean) null, 0, 0L, false, 4025, (Object) null);
        int i3 = ICustomTabsServiceStub + 19;
        warmup = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 65 / 0;
        }
        return runonuithreaddelayedOnWarmupCompleted;
    }

    private static final Unit onNavigationEvent(CreditHomeActivity creditHomeActivity, float f) {
        int i = 2 % 2;
        int i2 = warmup + 89;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            creditHomeActivity.IEngagementSignalsCallback_Parcel().IAuthTabCallback.setProgress(f);
            int i3 = 59 / 0;
            return Unit.INSTANCE;
        }
        creditHomeActivity.IEngagementSignalsCallback_Parcel().IAuthTabCallback.setProgress(f);
        return Unit.INSTANCE;
    }

    static final class prefetchWithMultipleUrls extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ enableNebulaServiceInitOpt $creditBureauType;
        final /* synthetic */ int $diff;
        final /* synthetic */ Rally $firstRotate;
        final /* synthetic */ int $newScore;
        final /* synthetic */ enablePreloadClassOpt $scoreRaiseType;
        final /* synthetic */ Rally $secondRotate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        prefetchWithMultipleUrls(Rally rally, Rally rally2, int i, enableNebulaServiceInitOpt enablenebulaserviceinitopt, int i2, enablePreloadClassOpt enablepreloadclassopt, access13800<? super prefetchWithMultipleUrls> access13800Var) {
            super(2, access13800Var);
            this.$firstRotate = rally;
            this.$secondRotate = rally2;
            this.$newScore = i;
            this.$creditBureauType = enablenebulaserviceinitopt;
            this.$diff = i2;
            this.$scoreRaiseType = enablepreloadclassopt;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            prefetchWithMultipleUrls prefetchwithmultipleurls = CreditHomeActivity.this.new prefetchWithMultipleUrls(this.$firstRotate, this.$secondRotate, this.$newScore, this.$creditBureauType, this.$diff, this.$scoreRaiseType, access13800Var);
            int i2 = onExtraCallbackWithResult + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return prefetchwithmultipleurls;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(200, r12) != r1) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                minFresh.onNavigationEvent(CreditHomeActivity.this, noStore.Companion.IAuthTabCallbackDefault());
                isFireOS.onExtraCallbackWithResult(this.$firstRotate, false, 1, (Object) null);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(200L, this) != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            if (i2 == 1) {
                ResultKt.onNavigationEvent(obj);
            } else {
                if (i2 == 2) {
                    ResultKt.onNavigationEvent(obj);
                    this.$firstRotate.ICustomTabsServiceStub();
                    isFireOS.onExtraCallbackWithResult(this.$secondRotate, false, 1, (Object) null);
                    this.label = 3;
                    if (formatMsgs.onWarmupCompleted(200L, this) != objOnWarmupCompleted) {
                        CreditHomeActivity.IAuthTabCallback(CreditHomeActivity.this, this.$newScore, this.$creditBureauType);
                        this.label = 4;
                    }
                    return objOnWarmupCompleted;
                }
                int i3 = onExtraCallbackWithResult + 125;
                int i4 = i3 % 128;
                onNavigationEvent = i4;
                int i5 = i3 % 2;
                if (i2 != 3) {
                    int i6 = i4 + 113;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    CreditHomeActivity.IAuthTabCallback(CreditHomeActivity.this, this.$diff, this.$scoreRaiseType);
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                CreditHomeActivity.IAuthTabCallback(CreditHomeActivity.this, this.$newScore, this.$creditBureauType);
                this.label = 4;
            }
            minFresh.onNavigationEvent(CreditHomeActivity.this, noStore.Companion.IAuthTabCallback());
            CreditHomeActivity.onPostMessage(CreditHomeActivity.this).onWarmupCompleted.playAnimation();
            this.label = 2;
            if (formatMsgs.onWarmupCompleted(100L, this) != objOnWarmupCompleted) {
                this.$firstRotate.ICustomTabsServiceStub();
                isFireOS.onExtraCallbackWithResult(this.$secondRotate, false, 1, (Object) null);
                this.label = 3;
                if (formatMsgs.onWarmupCompleted(200L, this) != objOnWarmupCompleted) {
                }
            }
            return objOnWarmupCompleted;
        }
    }

    private static final Unit onWarmupCompleted(CreditHomeActivity creditHomeActivity, Rally rally, Rally rally2, int i, enableNebulaServiceInitOpt enablenebulaserviceinitopt, int i2, enablePreloadClassOpt enablepreloadclassopt) {
        int i3 = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(creditHomeActivity), (CoroutineContext) null, (setRandomHost) null, creditHomeActivity.new prefetchWithMultipleUrls(rally, rally2, i, enablenebulaserviceinitopt, i2, enablepreloadclassopt, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsServiceStub + 27;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class ICustomTabsServiceDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ enablePreloadClassOpt $scoreRaiseType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ICustomTabsServiceDefault(enablePreloadClassOpt enablepreloadclassopt, access13800<? super ICustomTabsServiceDefault> access13800Var) {
            super(2, access13800Var);
            this.$scoreRaiseType = enablepreloadclassopt;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsServiceDefault iCustomTabsServiceDefault = CreditHomeActivity.this.new ICustomTabsServiceDefault(this.$scoreRaiseType, access13800Var);
            int i2 = IAuthTabCallback + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iCustomTabsServiceDefault;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 9;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 70 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ICustomTabsServiceDefault iCustomTabsServiceDefaultCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return iCustomTabsServiceDefaultCreate.invokeSuspend(Unit.INSTANCE);
            }
            iCustomTabsServiceDefaultCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onExtraCallback + 119;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0 ? i4 != 1 : i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(1000L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            if (CreditHomeActivity.onUnminimized(CreditHomeActivity.this).compareAndSet(false, true)) {
                CreditHomeActivity.onExtraCallback(CreditHomeActivity.this, this.$scoreRaiseType);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070 A[PHI: r10
      0x0070: PHI (r10v1 java.lang.Integer) = (r10v0 java.lang.Integer), (r10v31 java.lang.Integer) binds: [B:15:0x006e, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(enableOverridePendingTransitionNew enableoverridependingtransitionnew, final enableNebulaServiceInitOpt enablenebulaserviceinitopt, final enablePreloadClassOpt enablepreloadclassopt) {
        sampleInterval sampleinterval;
        Integer numIAuthTabCallbackStub;
        int iIntValue;
        Integer numIAuthTabCallbackDefault;
        int iIntValue2;
        int i = 2 % 2;
        Float fValueOf = Float.valueOf(0.0f);
        enableNebulaServiceInitOpt enablenebulaserviceinitopt2 = enableNebulaServiceInitOpt.KCB;
        int i2 = enablenebulaserviceinitopt == enablenebulaserviceinitopt2 ? 1 : -1;
        if (enablenebulaserviceinitopt == enablenebulaserviceinitopt2) {
            int i3 = ICustomTabsServiceStub + 19;
            warmup = i3 % 128;
            int i4 = i3 % 2;
            sampleinterval = IEngagementSignalsCallback_Parcel().access100.readTypedObject;
        } else {
            sampleinterval = IEngagementSignalsCallback_Parcel().getInterfaceDescriptor.readTypedObject;
        }
        FrameLayout frameLayoutOnExtraCallbackWithResult = sampleinterval.onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(frameLayoutOnExtraCallbackWithResult, "");
        if (enablenebulaserviceinitopt == enablenebulaserviceinitopt2) {
            int i5 = warmup + 17;
            ICustomTabsServiceStub = i5 % 128;
            int i6 = i5 % 2;
            numIAuthTabCallbackStub = (Integer) enableOverridePendingTransitionNew.onNavigationEvent(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -1984884629, 1984884629, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{enableoverridependingtransitionnew});
            if (numIAuthTabCallbackStub != null) {
                iIntValue = numIAuthTabCallbackStub.intValue();
            } else {
                int i7 = warmup + 85;
                ICustomTabsServiceStub = i7 % 128;
                int i8 = i7 % 2;
                iIntValue = 0;
            }
        } else {
            numIAuthTabCallbackStub = enableoverridependingtransitionnew.IAuthTabCallbackStub();
            if (numIAuthTabCallbackStub != null) {
            }
        }
        if (enablenebulaserviceinitopt == enablenebulaserviceinitopt2) {
            numIAuthTabCallbackDefault = enableoverridependingtransitionnew.IAuthTabCallback();
            iIntValue2 = numIAuthTabCallbackDefault != null ? numIAuthTabCallbackDefault.intValue() : 0;
        } else {
            numIAuthTabCallbackDefault = enableoverridependingtransitionnew.IAuthTabCallbackDefault();
            if (numIAuthTabCallbackDefault != null) {
                int i9 = warmup + 47;
                ICustomTabsServiceStub = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        float f = i2;
        final Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayoutOnExtraCallbackWithResult, (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1818891848, new Object[]{isMuted.IAuthTabCallback(new AppLovinSdkSettings().onWarmupCompleted(Address.onNavigationEvent.asInterface()), (Float) null, Float.valueOf(120.0f * f), (Function1) null, 5, (Object) null), null, Float.valueOf(60.0f), null, 5, null}, 1818891874, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 400}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        final Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayoutOnExtraCallbackWithResult, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1818891848, new Object[]{isMuted.IAuthTabCallback(new AppLovinSdkSettings().onWarmupCompleted(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub()), Float.valueOf(90.0f), fValueOf, (Function1) null, 4, (Object) null), Float.valueOf(f * (-45.0f)), fValueOf, null, 4, null}, 1818891874, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        final int i11 = iIntValue2;
        final int i12 = iIntValue;
        isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt.listOf(new runOnUiThreadDelayed[]{onWarmupCompleted(enablenebulaserviceinitopt, !enableoverridependingtransitionnew.access000()), (runOnUiThreadDelayed) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1017811729, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, enablenebulaserviceinitopt}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1017811698), (runOnUiThreadDelayed) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 896884779, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, enablenebulaserviceinitopt, enablepreloadclassopt, Integer.valueOf(iIntValue2)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -896884778), IAuthTabCallback(iIntValue2), ITrustedWebActivityCallbackStub()}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), (Object) null, new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda46
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i13 = 2 % 2;
                int i14 = onNavigationEvent + 65;
                IAuthTabCallback = i14 % 128;
                if (i14 % 2 == 0) {
                    CreditHomeActivity.IAuthTabCallback(this.f$0, rally, rally2, i11, enablenebulaserviceinitopt, i12, enablepreloadclassopt);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Unit unitIAuthTabCallback = CreditHomeActivity.IAuthTabCallback(this.f$0, rally, rally2, i11, enablenebulaserviceinitopt, i12, enablepreloadclassopt);
                int i15 = onNavigationEvent + 69;
                IAuthTabCallback = i15 % 128;
                int i16 = i15 % 2;
                return unitIAuthTabCallback;
            }
        }, 1, (Object) null), (Object) null, new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda47
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i13 = 2 % 2;
                int i14 = onExtraCallback + 111;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
                Unit unitOnExtraCallbackWithResult = CreditHomeActivity.onExtraCallbackWithResult(this.f$0, enablepreloadclassopt);
                int i16 = onExtraCallbackWithResult + 67;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, 1, (Object) null), false, 1, (Object) null);
    }

    private static final Unit onNavigationEvent(CreditHomeActivity creditHomeActivity, enablePreloadClassOpt enablepreloadclassopt) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(creditHomeActivity), (CoroutineContext) null, (setRandomHost) null, creditHomeActivity.new ICustomTabsServiceDefault(enablepreloadclassopt, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsServiceStub + 47;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026 A[PHI: r1 r2
      0x0026: PHI (r1v11 java.lang.Float) = (r1v5 java.lang.Float), (r1v13 java.lang.Float) binds: [B:8:0x0022, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
      0x0026: PHI (r2v13 o.enableNebulaServiceInitOpt) = (r2v1 o.enableNebulaServiceInitOpt), (r2v14 o.enableNebulaServiceInitOpt) binds: [B:8:0x0022, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1 r2
      0x0024: PHI (r1v6 java.lang.Float) = (r1v5 java.lang.Float), (r1v13 java.lang.Float) binds: [B:8:0x0022, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
      0x0024: PHI (r2v2 o.enableNebulaServiceInitOpt) = (r2v1 o.enableNebulaServiceInitOpt), (r2v14 o.enableNebulaServiceInitOpt) binds: [B:8:0x0022, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(int i, int i2, enableNebulaServiceInitOpt enablenebulaserviceinitopt) {
        Float fValueOf;
        enableNebulaServiceInitOpt enablenebulaserviceinitopt2;
        int i3;
        sampleInterval sampleinterval;
        int i4 = 2 % 2;
        int i5 = ICustomTabsServiceStub + 87;
        warmup = i5 % 128;
        if (i5 % 2 == 0) {
            fValueOf = Float.valueOf(1.0f);
            enablenebulaserviceinitopt2 = enableNebulaServiceInitOpt.KCB;
            i3 = enablenebulaserviceinitopt == enablenebulaserviceinitopt2 ? 1 : -1;
        } else {
            fValueOf = Float.valueOf(0.0f);
            enablenebulaserviceinitopt2 = enableNebulaServiceInitOpt.KCB;
            if (enablenebulaserviceinitopt == enablenebulaserviceinitopt2) {
            }
        }
        if (enablenebulaserviceinitopt == enablenebulaserviceinitopt2) {
            sampleinterval = IEngagementSignalsCallback_Parcel().access100.readTypedObject;
        } else {
            sampleInterval sampleinterval2 = IEngagementSignalsCallback_Parcel().getInterfaceDescriptor.readTypedObject;
            int i6 = warmup + 119;
            ICustomTabsServiceStub = i6 % 128;
            int i7 = i6 % 2;
            sampleinterval = sampleinterval2;
        }
        FrameLayout frameLayoutOnExtraCallbackWithResult = sampleinterval.onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(frameLayoutOnExtraCallbackWithResult, "");
        float f = i3;
        Float f2 = fValueOf;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new receiveFile((Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayoutOnExtraCallbackWithResult, (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1818891848, new Object[]{isMuted.IAuthTabCallback(new AppLovinSdkSettings().onWarmupCompleted(Address.onNavigationEvent.asInterface()), (Float) null, Float.valueOf(120.0f * f), (Function1) null, 5, (Object) null), null, Float.valueOf(60.0f), null, 5, null}, 1818891874, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 400}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayoutOnExtraCallbackWithResult, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1818891848, new Object[]{isMuted.IAuthTabCallback(new AppLovinSdkSettings().onWarmupCompleted(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub()), Float.valueOf(90.0f), f2, (Function1) null, 4, (Object) null), Float.valueOf(f * (-45.0f)), f2, null, 4, null}, 1818891874, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), i2, enablenebulaserviceinitopt, i, null), 3, (Object) null);
    }

    static final class receiveFile extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ enableNebulaServiceInitOpt $creditBureauType;
        final /* synthetic */ Rally $firstRotate;
        final /* synthetic */ int $newScore;
        final /* synthetic */ int $scoreDiff;
        final /* synthetic */ Rally $secondRotate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        receiveFile(Rally rally, Rally rally2, int i, enableNebulaServiceInitOpt enablenebulaserviceinitopt, int i2, access13800<? super receiveFile> access13800Var) {
            super(2, access13800Var);
            this.$firstRotate = rally;
            this.$secondRotate = rally2;
            this.$newScore = i;
            this.$creditBureauType = enablenebulaserviceinitopt;
            this.$scoreDiff = i2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            receiveFile receivefile = CreditHomeActivity.this.new receiveFile(this.$firstRotate, this.$secondRotate, this.$newScore, this.$creditBureauType, this.$scoreDiff, access13800Var);
            int i2 = onExtraCallback + 61;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return receivefile;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 33;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 119;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 16 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00aa, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(200, r12) != r1) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                minFresh.onNavigationEvent(CreditHomeActivity.this, noStore.Companion.IAuthTabCallbackDefault());
                isFireOS.onExtraCallbackWithResult(this.$firstRotate, false, 1, (Object) null);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(200L, this) != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            if (i4 == 1) {
                ResultKt.onNavigationEvent(obj);
            } else {
                if (i4 == 2) {
                    ResultKt.onNavigationEvent(obj);
                    int i5 = onNavigationEvent + 95;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    this.$firstRotate.ICustomTabsServiceStub();
                    isFireOS.onExtraCallbackWithResult(this.$secondRotate, false, 1, (Object) null);
                    this.label = 3;
                    if (formatMsgs.onWarmupCompleted(200L, this) != objOnWarmupCompleted) {
                        CreditHomeActivity.IAuthTabCallback(CreditHomeActivity.this, this.$newScore, this.$creditBureauType);
                        this.label = 4;
                    }
                    return objOnWarmupCompleted;
                }
                if (i4 != 3) {
                    int i7 = onNavigationEvent + 111;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    if (i4 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    CreditHomeActivity.IAuthTabCallback(CreditHomeActivity.this, this.$scoreDiff, enablePreloadClassOpt.BOTH);
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                CreditHomeActivity.IAuthTabCallback(CreditHomeActivity.this, this.$newScore, this.$creditBureauType);
                this.label = 4;
            }
            minFresh.onNavigationEvent(CreditHomeActivity.this, noStore.Companion.IAuthTabCallback());
            CreditHomeActivity.onPostMessage(CreditHomeActivity.this).onWarmupCompleted.playAnimation();
            this.label = 2;
            if (formatMsgs.onWarmupCompleted(100L, this) != objOnWarmupCompleted) {
                this.$firstRotate.ICustomTabsServiceStub();
                isFireOS.onExtraCallbackWithResult(this.$secondRotate, false, 1, (Object) null);
                this.label = 3;
                if (formatMsgs.onWarmupCompleted(200L, this) != objOnWarmupCompleted) {
                }
            }
            return objOnWarmupCompleted;
        }
    }

    private final runOnUiThreadDelayed onWarmupCompleted(enableNebulaServiceInitOpt enablenebulaserviceinitopt, boolean z) {
        LottieAnimationView lottieAnimationView;
        int i = 2 % 2;
        int i2 = warmup + 35;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            Pair<Float, Float> activeNotifications = getActiveNotifications();
            ((Number) activeNotifications.onExtraCallbackWithResult()).floatValue();
            ((Number) activeNotifications.IAuthTabCallback()).floatValue();
            enableNebulaServiceInitOpt enablenebulaserviceinitopt2 = enableNebulaServiceInitOpt.KCB;
            IEngagementSignalsCallback_Parcel();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Pair<Float, Float> activeNotifications2 = getActiveNotifications();
        float fFloatValue = ((Number) activeNotifications2.onExtraCallbackWithResult()).floatValue();
        float fFloatValue2 = ((Number) activeNotifications2.IAuthTabCallback()).floatValue();
        enableNebulaServiceInitOpt enablenebulaserviceinitopt3 = enableNebulaServiceInitOpt.KCB;
        checkInterval checkintervalIEngagementSignalsCallback_Parcel = IEngagementSignalsCallback_Parcel();
        FrameLayout frameLayoutOnExtraCallback = (enablenebulaserviceinitopt == enablenebulaserviceinitopt3 ? checkintervalIEngagementSignalsCallback_Parcel.access100 : checkintervalIEngagementSignalsCallback_Parcel.getInterfaceDescriptor).onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(frameLayoutOnExtraCallback, "");
        if (enablenebulaserviceinitopt == enablenebulaserviceinitopt3) {
            lottieAnimationView = IEngagementSignalsCallback_Parcel().IAuthTabCallbackStubProxy;
        } else {
            lottieAnimationView = IEngagementSignalsCallback_Parcel().IAuthTabCallback_Parcel;
            int i3 = warmup + 85;
            ICustomTabsServiceStub = i3 % 128;
            int i4 = i3 % 2;
        }
        Intrinsics.checkNotNull(lottieAnimationView);
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        deprecated_dns deprecated_dnsVarOnExtraCallbackWithResult = deprecated_certificatepinner.onExtraCallbackWithResult();
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add((Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayoutOnExtraCallback, (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{isMuted.onExtraCallback((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.IAuthTabCallbackStub()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Integer) null, Integer.valueOf((int) ((fFloatValue2 - frameLayoutOnExtraCallback.getTop()) * this.requestPostMessageChannel)), (Function1) null, 5, (Object) null), 250}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
        if (z) {
            int i5 = ICustomTabsServiceStub + 109;
            warmup = i5 % 128;
            int i6 = i5 % 2;
            listCreateListBuilder.add((Rally) RallysKt.onWarmupCompleted(new Object[]{lottieAnimationView, (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{isMuted.onExtraCallback((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.IAuthTabCallbackStub()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Integer) null, Integer.valueOf((int) ((fFloatValue2 - frameLayoutOnExtraCallback.getTop()) * this.requestPostMessageChannel)), (Function1) null, 5, (Object) null), 250}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
        }
        listCreateListBuilder.add((Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayoutOnExtraCallback, (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{isMuted.IAuthTabCallback_Parcel(((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368)).onWarmupCompleted(deprecated_certificatepinner.IAuthTabCallbackStub()), (Float) null, Float.valueOf(fFloatValue - frameLayoutOnExtraCallback.getLeft()), (Function1) null, 5, (Object) null), 350}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
        return RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.build(listCreateListBuilder), 0, (getExtraParameters) null, 0, deprecated_dnsVarOnExtraCallbackWithResult, (Integer) null, (Boolean) null, 0, 0L, false, 4025, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [im.toss.base.BaseActivity, im.toss.feature.credit.ui.main.home.CreditHomeActivity] */
    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        toFlameGraphLine toflamegraphline;
        ?? r13 = (CreditHomeActivity) objArr[0];
        enableNebulaServiceInitOpt enablenebulaserviceinitopt = (enableNebulaServiceInitOpt) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 53;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Pair<Float, Float> activeNotifications = r13.getActiveNotifications();
        float fFloatValue = ((Number) activeNotifications.onExtraCallbackWithResult()).floatValue();
        float fFloatValue2 = ((Number) activeNotifications.IAuthTabCallback()).floatValue();
        enableNebulaServiceInitOpt enablenebulaserviceinitopt2 = enableNebulaServiceInitOpt.KCB;
        int i4 = enablenebulaserviceinitopt == enablenebulaserviceinitopt2 ? 1 : -1;
        if (enablenebulaserviceinitopt == enablenebulaserviceinitopt2) {
            int i5 = ICustomTabsServiceStub + 33;
            warmup = i5 % 128;
            if (i5 % 2 == 0) {
                toflamegraphline = r13.IEngagementSignalsCallback_Parcel().access100;
                int i6 = 5 / 0;
            } else {
                toflamegraphline = r13.IEngagementSignalsCallback_Parcel().access100;
            }
            int i7 = ICustomTabsServiceStub + 73;
            warmup = i7 % 128;
            int i8 = i7 % 2;
        } else {
            toflamegraphline = r13.IEngagementSignalsCallback_Parcel().getInterfaceDescriptor;
        }
        FrameLayout frameLayoutOnExtraCallback = toflamegraphline.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(frameLayoutOnExtraCallback, "");
        DisplayMetrics displayMetrics = r13.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(18, displayMetrics);
        DisplayMetrics displayMetrics2 = r13.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(Integer.valueOf(iOnNavigationEvent), displayMetrics2);
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayoutOnExtraCallback, (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{isMuted.onExtraCallback((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.IAuthTabCallbackStub()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Integer) null, Integer.valueOf(((int) ((fFloatValue2 - frameLayoutOnExtraCallback.getTop()) * ((CreditHomeActivity) r13).writeTypedObject)) + (iOnNavigationEvent2 * i4)), (Function1) null, 5, (Object) null), 250}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        DisplayMetrics displayMetrics3 = r13.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        int iOnNavigationEvent3 = varyMatches.onNavigationEvent(18, displayMetrics3);
        Intrinsics.checkNotNullExpressionValue(r13.getResources().getDisplayMetrics(), "");
        return RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt.listOf(new Rally[]{(Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayoutOnExtraCallback, (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{isMuted.IAuthTabCallback_Parcel(((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368)).onWarmupCompleted(deprecated_certificatepinner.IAuthTabCallbackStub()), (Float) null, Float.valueOf((fFloatValue - frameLayoutOnExtraCallback.getLeft()) + ((-varyMatches.onNavigationEvent(Integer.valueOf(iOnNavigationEvent3), r2)) * i4)), (Function1) null, 5, (Object) null), 350}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), rally}), 0, (getExtraParameters) null, 0, deprecated_certificatepinner.onExtraCallbackWithResult(), (Integer) null, (Boolean) null, 0, 0L, false, 4025, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(final enablePreloadClassOpt enablepreloadclassopt) {
        toFlameGraphLine toflamegraphline;
        String str;
        float f;
        float f2;
        float f3;
        int i = 2 % 2;
        final enableOverridePendingTransitionNew interfaceDescriptor = ITrustedWebActivityService().getInterfaceDescriptor();
        if (interfaceDescriptor == null) {
            return;
        }
        if (enablepreloadclassopt == enablePreloadClassOpt.KCB) {
            int i2 = warmup + 9;
            ICustomTabsServiceStub = i2 % 128;
            int i3 = i2 % 2;
            toflamegraphline = IEngagementSignalsCallback_Parcel().access100;
            str = "neoKcbView";
        } else {
            toflamegraphline = IEngagementSignalsCallback_Parcel().getInterfaceDescriptor;
            str = "neoNiceView";
        }
        Intrinsics.checkNotNullExpressionValue(toflamegraphline, str);
        float fWriteTypedList = writeTypedList();
        if (!interfaceDescriptor.access000()) {
            int i4 = warmup + 75;
            ICustomTabsServiceStub = i4 % 128;
            int i5 = i4 % 2;
            if (interfaceDescriptor.readTypedObject()) {
                int i6 = ICustomTabsServiceStub + 75;
                int i7 = i6 % 128;
                warmup = i7;
                int i8 = i6 % 2;
                int i9 = i7 + 19;
                ICustomTabsServiceStub = i9 % 128;
                int i10 = i9 % 2;
                f = 0.7f;
            } else {
                f = 1.0f;
            }
        }
        Object obj = null;
        if (!interfaceDescriptor.access000()) {
            int i11 = ICustomTabsServiceStub + 45;
            warmup = i11 % 128;
            if (i11 % 2 == 0) {
                interfaceDescriptor.readTypedObject();
                obj.hashCode();
                throw null;
            }
            f2 = interfaceDescriptor.readTypedObject() ? 0.9f : 1.0f;
        }
        float top = ((int) (fWriteTypedList - toflamegraphline.onExtraCallback().getTop())) / f;
        float translationY = ((toflamegraphline.onExtraCallback().getTranslationY() - top) * this.writeTypedObject) / f2;
        float translationY2 = ((IEngagementSignalsCallback_Parcel().onNavigationEvent.getTranslationY() - translationY) + IPostMessageServiceStub()) / f2;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(20, displayMetrics);
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(Integer.valueOf(iOnNavigationEvent), displayMetrics2);
        float translationY3 = IEngagementSignalsCallback_Parcel().onNavigationEvent.getTranslationY();
        float f4 = iOnNavigationEvent2;
        float fIPostMessageServiceStub = IPostMessageServiceStub();
        float translationY4 = IEngagementSignalsCallback_Parcel().IAuthTabCallback.getTranslationY() - f4;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        TdsBottomCtaV1View tdsBottomCtaV1View = IEngagementSignalsCallback_Parcel().asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        listCreateListBuilder.add((Rally) RallysKt.onWarmupCompleted(new Object[]{tdsBottomCtaV1View, isMuted.onNavigationEvent(AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, Cache.UP, (AuthenticatorCompanionAuthenticatorNone) null, false, (Function1) null, 28, (Object) null), Float.valueOf(0.0f), Float.valueOf(1.0f), (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 400, 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
        enablePreloadClassOpt enablepreloadclassopt2 = enablePreloadClassOpt.BOTH;
        if (enablepreloadclassopt == enablepreloadclassopt2) {
            float translationY5 = IEngagementSignalsCallback_Parcel().access100.onExtraCallback().getTranslationY();
            float translationY6 = IEngagementSignalsCallback_Parcel().getInterfaceDescriptor.onExtraCallback().getTranslationY();
            FrameLayout frameLayoutOnExtraCallback = IEngagementSignalsCallback_Parcel().access100.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(frameLayoutOnExtraCallback, "");
            deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
            listCreateListBuilder.add((Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayoutOnExtraCallback, isMuted.getInterfaceDescriptor((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(translationY5 - f4), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
            FrameLayout frameLayoutOnExtraCallback2 = IEngagementSignalsCallback_Parcel().getInterfaceDescriptor.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(frameLayoutOnExtraCallback2, "");
            listCreateListBuilder.add((Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayoutOnExtraCallback2, isMuted.getInterfaceDescriptor((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(translationY6 - f4), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
            int i12 = warmup + 67;
            ICustomTabsServiceStub = i12 % 128;
            int i13 = i12 % 2;
        } else {
            FrameLayout frameLayoutOnExtraCallback3 = toflamegraphline.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(frameLayoutOnExtraCallback3, "");
            listCreateListBuilder.add((Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayoutOnExtraCallback3, isMuted.getInterfaceDescriptor((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(top), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
        }
        AnimateTop animateTop = IEngagementSignalsCallback_Parcel().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(animateTop, "");
        deprecated_certificatePinner deprecated_certificatepinner2 = deprecated_certificatePinner.onExtraCallbackWithResult;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner2.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        if (enablepreloadclassopt == enablepreloadclassopt2) {
            translationY2 = (translationY3 - f4) + fIPostMessageServiceStub;
        }
        listCreateListBuilder.add((Rally) RallysKt.onWarmupCompleted(new Object[]{animateTop, isMuted.getInterfaceDescriptor(appLovinSdkSettings, (Float) null, Float.valueOf(translationY2), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
        LottieAnimationView lottieAnimationView = IEngagementSignalsCallback_Parcel().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner2.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        if (enablepreloadclassopt == enablepreloadclassopt2) {
            int i14 = ICustomTabsServiceStub + 25;
            warmup = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 35 / 0;
            }
            f3 = translationY4;
        } else {
            f3 = -translationY;
        }
        listCreateListBuilder.add((Rally) RallysKt.onWarmupCompleted(new Object[]{lottieAnimationView, isMuted.getInterfaceDescriptor(appLovinSdkSettings2, (Float) null, Float.valueOf(f3), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
        LottieAnimationView lottieAnimationView2 = IEngagementSignalsCallback_Parcel().extraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
        AppLovinSdkSettings appLovinSdkSettings3 = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner2.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        if (enablepreloadclassopt != enablepreloadclassopt2) {
            translationY4 = -translationY;
        }
        listCreateListBuilder.add((Rally) RallysKt.onWarmupCompleted(new Object[]{lottieAnimationView2, isMuted.getInterfaceDescriptor(appLovinSdkSettings3, (Float) null, Float.valueOf(translationY4), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
        isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt.build(listCreateListBuilder), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), (Object) null, new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda64
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() throws Throwable {
                int i16 = 2 % 2;
                int i17 = onNavigationEvent + 11;
                IAuthTabCallback = i17 % 128;
                int i18 = i17 % 2;
                CreditHomeActivity creditHomeActivity = this.f$0;
                if (i18 != 0) {
                    return CreditHomeActivity.onExtraCallbackWithResult(creditHomeActivity, interfaceDescriptor, enablepreloadclassopt);
                }
                CreditHomeActivity.onExtraCallbackWithResult(creditHomeActivity, interfaceDescriptor, enablepreloadclassopt);
                throw null;
            }
        }, 1, (Object) null), false, 1, (Object) null);
    }

    private static final Unit onWarmupCompleted(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew, enablePreloadClassOpt enablepreloadclassopt) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 5;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        creditHomeActivity.MediaMetadataCompat();
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -964744501, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity}, iOnWarmupCompleted3, 964744515);
        creditHomeActivity.IAuthTabCallback(enableoverridependingtransitionnew.onWarmupCompleted());
        creditHomeActivity.onWarmupCompleted(enableoverridependingtransitionnew, enablepreloadclassopt);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsServiceStub + 37;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final class onActivityResized implements Function1<CreditDualViewModel.onExtraCallbackWithResult, Unit> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public onActivityResized() {
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent(obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 91;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onNavigationEvent(CreditDualViewModel.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                CreditHomeActivity.onNavigationEvent(CreditHomeActivity.this, onextracallbackwithresult);
                int i3 = 95 / 0;
            } else {
                CreditHomeActivity.onNavigationEvent(CreditHomeActivity.this, onextracallbackwithresult);
            }
            int i4 = onWarmupCompleted + 67;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    public static final class onMinimized implements Function1<CreditDualViewModel.onNavigationEvent, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public onMinimized() {
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent(obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 75;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 54 / 0;
            }
            return unit;
        }

        public final void onNavigationEvent(CreditDualViewModel.onNavigationEvent onnavigationevent) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            CreditHomeActivity.onWarmupCompleted(CreditHomeActivity.this, onnavigationevent);
            int i4 = onNavigationEvent + 5;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class readTypedObject implements Function1<Boolean, Unit> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public readTypedObject() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            throw null;
        }

        public final void onExtraCallbackWithResult(Boolean bool) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                CreditHomeActivity.onPostMessage(CreditHomeActivity.this).writeTypedObject.setRefreshing(bool.booleanValue());
                int i3 = 23 / 0;
            } else {
                CreditHomeActivity.onPostMessage(CreditHomeActivity.this).writeTypedObject.setRefreshing(bool.booleanValue());
            }
            int i4 = onNavigationEvent + 13;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final class requestPostMessageChannelWithExtras extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getWriteTimeoutokhttp.onWarmupCompleted $titleParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        requestPostMessageChannelWithExtras(getWriteTimeoutokhttp.onWarmupCompleted onwarmupcompleted, access13800<? super requestPostMessageChannelWithExtras> access13800Var) {
            super(2, access13800Var);
            this.$titleParams = onwarmupcompleted;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 99;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            requestPostMessageChannelWithExtras requestpostmessagechannelwithextras = CreditHomeActivity.this.new requestPostMessageChannelWithExtras(this.$titleParams, access13800Var);
            int i2 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return requestpostmessagechannelwithextras;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            AnimateTop animateTop = CreditHomeActivity.onPostMessage(CreditHomeActivity.this).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(animateTop, "");
            AnimateTop.onExtraCallback(animateTop, (getWriteTimeoutokhttp) null, this.$titleParams, (getWriteTimeoutokhttp) null, false, false, 29, (Object) null);
            AnimateTop animateTop2 = CreditHomeActivity.onPostMessage(CreditHomeActivity.this).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(animateTop2, "");
            AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
            Integer numOnNavigationEvent = access14000.onNavigationEvent(100);
            Intrinsics.checkNotNullExpressionValue(CreditHomeActivity.this.getResources().getDisplayMetrics(), "");
            isFireOS.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{animateTop2, isMuted.getInterfaceDescriptor(appLovinSdkSettings, access14000.onExtraCallbackWithResult(varyMatches.onNavigationEvent(numOnNavigationEvent, r6)), access14000.onExtraCallbackWithResult(0.0f), (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), false, 1, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        enableNebulaServiceInitOpt enablenebulaserviceinitopt;
        String string;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (CreditHomeActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        enablePreloadClassOpt enablepreloadclassopt = (enablePreloadClassOpt) objArr[2];
        int i = 2 % 2;
        if (enablepreloadclassopt == enablePreloadClassOpt.KCB) {
            int i2 = ICustomTabsServiceStub + 99;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            enablenebulaserviceinitopt = enableNebulaServiceInitOpt.KCB;
        } else {
            enablenebulaserviceinitopt = enableNebulaServiceInitOpt.NICE;
        }
        if (enablepreloadclassopt == enablePreloadClassOpt.BOTH) {
            string = textFieldScrollKtExternalSyntheticLambda0.getString(im.toss.feature.credit.ui.main.R.string.credit_ui_score_raised_both);
        } else {
            string = textFieldScrollKtExternalSyntheticLambda0.getString(im.toss.feature.credit.ui.main.R.string.credit_ui_score_raised_one, enablenebulaserviceinitopt.name(), String.valueOf(iIntValue));
            int i4 = warmup + 73;
            ICustomTabsServiceStub = i4 % 128;
            int i5 = i4 % 2;
        }
        String str = string;
        Intrinsics.checkNotNull(str);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0), (CoroutineContext) null, (setRandomHost) null, new requestPostMessageChannelWithExtras(new getWriteTimeoutokhttp.onWarmupCompleted(str, readTimeout.onTransact.onNavigationEvent.onWarmupCompleted, 0, AnimateText.onNavigationEvent.CENTER, false, false, (Function0) null, (Function0) null, (Function0) null, 500, (DefaultConstructorMarker) null), null), 3, (Object) null);
        int i6 = warmup + 113;
        ICustomTabsServiceStub = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onExtraCallback(int i, enableNebulaServiceInitOpt enablenebulaserviceinitopt) throws NoWhenBranchMatchedException {
        toFlameGraphLine toflamegraphline;
        int i2 = 2 % 2;
        enableNebulaServiceInitOpt enablenebulaserviceinitopt2 = enableNebulaServiceInitOpt.KCB;
        checkInterval checkintervalIEngagementSignalsCallback_Parcel = IEngagementSignalsCallback_Parcel();
        Object obj = null;
        if (enablenebulaserviceinitopt == enablenebulaserviceinitopt2) {
            int i3 = ICustomTabsServiceStub + 51;
            warmup = i3 % 128;
            if (i3 % 2 == 0) {
                toFlameGraphLine toflamegraphline2 = checkintervalIEngagementSignalsCallback_Parcel.access100;
                obj.hashCode();
                throw null;
            }
            toflamegraphline = checkintervalIEngagementSignalsCallback_Parcel.access100;
        } else {
            toflamegraphline = checkintervalIEngagementSignalsCallback_Parcel.getInterfaceDescriptor;
        }
        toFlameGraphLine toflamegraphline3 = toflamegraphline;
        Intrinsics.checkNotNull(toflamegraphline3);
        TdsRollingNumberV1View tdsRollingNumberV1View = toflamegraphline3.access100;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View, "");
        TdsRollingNumberV1View.setNumber$default(tdsRollingNumberV1View, i, false, (TdsRollingNumberV1View.access000) null, true, 6, (Object) null);
        TdsRollingNumberV1View tdsRollingNumberV1View2 = toflamegraphline3.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View2, "");
        TdsRollingNumberV1View.setNumber$default(tdsRollingNumberV1View2, i, false, (TdsRollingNumberV1View.access000) null, true, 6, (Object) null);
        int i4 = IAuthTabCallback.onExtraCallbackWithResult[enablenebulaserviceinitopt.ordinal()];
        if (i4 == 1) {
            toFlameGraphLine toflamegraphline4 = IEngagementSignalsCallback_Parcel().access000;
            Intrinsics.checkNotNullExpressionValue(toflamegraphline4, "");
            IAuthTabCallback(toflamegraphline4, enablenebulaserviceinitopt2, i, true);
            int i5 = warmup + 73;
            ICustomTabsServiceStub = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i6 = warmup;
        int i7 = i6 + 35;
        ICustomTabsServiceStub = i7 % 128;
        int i8 = i7 % 2;
        if (i4 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i9 = i6 + 7;
        ICustomTabsServiceStub = i9 % 128;
        if (i9 % 2 != 0) {
            toFlameGraphLine toflamegraphline5 = IEngagementSignalsCallback_Parcel().readTypedObject;
            Intrinsics.checkNotNullExpressionValue(toflamegraphline5, "");
            IAuthTabCallback(toflamegraphline5, enableNebulaServiceInitOpt.NICE, i, false);
        } else {
            toFlameGraphLine toflamegraphline6 = IEngagementSignalsCallback_Parcel().readTypedObject;
            Intrinsics.checkNotNullExpressionValue(toflamegraphline6, "");
            IAuthTabCallback(toflamegraphline6, enableNebulaServiceInitOpt.NICE, i, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0062 A[PHI: r3 r4
      0x0062: PHI (r3v44 java.lang.Float) = (r3v7 java.lang.Float), (r3v45 java.lang.Float) binds: [B:8:0x004f, B:5:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r4v28 java.lang.Float) = (r4v1 java.lang.Float), (r4v29 java.lang.Float) binds: [B:8:0x004f, B:5:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051 A[PHI: r3 r4
      0x0051: PHI (r3v8 java.lang.Float) = (r3v7 java.lang.Float), (r3v45 java.lang.Float) binds: [B:8:0x004f, B:5:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r4v2 java.lang.Float) = (r4v1 java.lang.Float), (r4v29 java.lang.Float) binds: [B:8:0x004f, B:5:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Float fValueOf;
        Float fValueOf2;
        toFlameGraphLine toflamegraphline;
        final CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        enableNebulaServiceInitOpt enablenebulaserviceinitopt = (enableNebulaServiceInitOpt) objArr[1];
        enablePreloadClassOpt enablepreloadclassopt = (enablePreloadClassOpt) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = warmup + 17;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            fValueOf = Float.valueOf(0.0f);
            fValueOf2 = Float.valueOf(0.0f);
            if (enablenebulaserviceinitopt == enableNebulaServiceInitOpt.KCB) {
                int i3 = warmup + 5;
                ICustomTabsServiceStub = i3 % 128;
                int i4 = i3 % 2;
                toflamegraphline = creditHomeActivity.IEngagementSignalsCallback_Parcel().access100;
            } else {
                toflamegraphline = creditHomeActivity.IEngagementSignalsCallback_Parcel().getInterfaceDescriptor;
            }
        } else {
            fValueOf = Float.valueOf(1.0f);
            fValueOf2 = Float.valueOf(0.0f);
            if (enablenebulaserviceinitopt == enableNebulaServiceInitOpt.KCB) {
            }
        }
        final toFlameGraphLine toflamegraphline2 = toflamegraphline;
        Float f = fValueOf;
        Float f2 = fValueOf2;
        Intrinsics.checkNotNull(toflamegraphline2);
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        deprecated_dns deprecated_dnsVarOnExtraCallbackWithResult = deprecated_certificatepinner.onExtraCallbackWithResult();
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        FrameLayout frameLayoutOnExtraCallback = toflamegraphline2.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(frameLayoutOnExtraCallback, "");
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayoutOnExtraCallback, isMuted.asBinder((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(deprecated_certificatepinner.IAuthTabCallbackStub()), 250}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), (Float) null, Float.valueOf(enablepreloadclassopt == enablePreloadClassOpt.BOTH ? creditHomeActivity.extraCallbackWithResult : creditHomeActivity.prefetch), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        LottieAnimationView lottieAnimationView = toflamegraphline2.readTypedObject.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{lottieAnimationView, isMuted.onNavigationEvent(new AppLovinSdkSettings().onWarmupCompleted(deprecated_certificatepinner.asBinder()), (Float) null, f2, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        TdsImageView tdsImageView = toflamegraphline2.readTypedObject.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        Rally rally3 = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView, isMuted.onNavigationEvent(new AppLovinSdkSettings().onWarmupCompleted(deprecated_certificatepinner.asBinder()), (Float) null, f2, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        TdsImageView tdsImageView2 = toflamegraphline2.readTypedObject.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        Rally rally4 = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView2, isMuted.onNavigationEvent(new AppLovinSdkSettings().onWarmupCompleted(deprecated_certificatepinner.asBinder()), (Float) null, f2, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        TdsImageView tdsImageView3 = toflamegraphline2.readTypedObject.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
        Rally rally5 = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView3, (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{isMuted.onNavigationEvent(new AppLovinSdkSettings().onWarmupCompleted(deprecated_certificatepinner.asBinder()), (Float) null, f, (Function1) null, 5, (Object) null), 500}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        View view = toflamegraphline2.readTypedObject.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(view, "");
        Rally rally6 = (Rally) RallysKt.onWarmupCompleted(new Object[]{view, (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{isMuted.onNavigationEvent(new AppLovinSdkSettings().onWarmupCompleted(deprecated_certificatepinner.asBinder()), (Float) null, f, (Function1) null, 5, (Object) null), 300}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        LottieAnimationView lottieAnimationView2 = toflamegraphline2.readTypedObject.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
        return RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rally, rally2, rally3, rally4, rally5, rally6, (Rally) RallysKt.onWarmupCompleted(new Object[]{lottieAnimationView2, (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(iIntValue > 900 ? deprecated_certificatepinner.onExtraCallbackWithResult() : new deprecated_dns(70.0d, 9.8d)), Float.valueOf(0.0f), Float.valueOf(iIntValue / 1000.0f), new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda48
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i5 = 2 % 2;
                int i6 = onNavigationEvent + 1;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    CreditHomeActivity.onExtraCallback(this.f$0, toflamegraphline2, ((Float) obj).floatValue());
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnExtraCallback = CreditHomeActivity.onExtraCallback(this.f$0, toflamegraphline2, ((Float) obj).floatValue());
                int i7 = onExtraCallback + 65;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                return unitOnExtraCallback;
            }
        }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 500}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, deprecated_dnsVarOnExtraCallbackWithResult, (Integer) null, (Boolean) null, 0, 0L, false, 4025, (Object) null);
    }

    private static final Unit IAuthTabCallback(CreditHomeActivity creditHomeActivity, toFlameGraphLine toflamegraphline, float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 107;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            creditHomeActivity.IEngagementSignalsCallback_Parcel().IAuthTabCallback.setProgress(f);
            toflamegraphline.readTypedObject.onNavigationEvent.setProgress(f);
            Unit unit = Unit.INSTANCE;
            int i3 = warmup + 65;
            ICustomTabsServiceStub = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        creditHomeActivity.IEngagementSignalsCallback_Parcel().IAuthTabCallback.setProgress(f);
        toflamegraphline.readTypedObject.onNavigationEvent.setProgress(f);
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044 A[PHI: r2 r3 r4
      0x0044: PHI (r2v32 java.lang.Float) = (r2v4 java.lang.Float), (r2v33 java.lang.Float) binds: [B:8:0x003c, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r3v27 o.enableNebulaServiceInitOpt) = (r3v2 o.enableNebulaServiceInitOpt), (r3v28 o.enableNebulaServiceInitOpt) binds: [B:8:0x003c, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r4v19 o.checkInterval) = (r4v0 o.checkInterval), (r4v21 o.checkInterval) binds: [B:8:0x003c, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e A[PHI: r2 r3 r4
      0x003e: PHI (r2v5 java.lang.Float) = (r2v4 java.lang.Float), (r2v33 java.lang.Float) binds: [B:8:0x003c, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r3v3 o.enableNebulaServiceInitOpt) = (r3v2 o.enableNebulaServiceInitOpt), (r3v28 o.enableNebulaServiceInitOpt) binds: [B:8:0x003c, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r4v1 o.checkInterval) = (r4v0 o.checkInterval), (r4v21 o.checkInterval) binds: [B:8:0x003c, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v1, types: [android.content.Context, im.toss.base.BaseActivity, im.toss.feature.credit.ui.main.home.CreditHomeActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object ICustomTabsCallbackDefault(Object[] objArr) {
        Float fValueOf;
        enableNebulaServiceInitOpt enablenebulaserviceinitopt;
        checkInterval checkintervalIEngagementSignalsCallback_Parcel;
        toFlameGraphLine toflamegraphline;
        ?? r13 = (CreditHomeActivity) objArr[0];
        enableNebulaServiceInitOpt enablenebulaserviceinitopt2 = (enableNebulaServiceInitOpt) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 25;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            fValueOf = Float.valueOf(0.0f);
            enablenebulaserviceinitopt = enableNebulaServiceInitOpt.KCB;
            checkintervalIEngagementSignalsCallback_Parcel = r13.IEngagementSignalsCallback_Parcel();
            toflamegraphline = enablenebulaserviceinitopt2 == enablenebulaserviceinitopt ? checkintervalIEngagementSignalsCallback_Parcel.access100 : checkintervalIEngagementSignalsCallback_Parcel.getInterfaceDescriptor;
        } else {
            fValueOf = Float.valueOf(0.0f);
            enablenebulaserviceinitopt = enableNebulaServiceInitOpt.KCB;
            checkintervalIEngagementSignalsCallback_Parcel = r13.IEngagementSignalsCallback_Parcel();
            if (enablenebulaserviceinitopt2 == enablenebulaserviceinitopt) {
            }
        }
        Float f = fValueOf;
        toFlameGraphLine toflamegraphline2 = toflamegraphline;
        Intrinsics.checkNotNull(toflamegraphline2);
        access700 access700Var = (enablenebulaserviceinitopt2 == enablenebulaserviceinitopt ? r13.IEngagementSignalsCallback_Parcel().access100 : r13.IEngagementSignalsCallback_Parcel().getInterfaceDescriptor).onTransact;
        int i3 = warmup + 99;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNull(access700Var);
        int measuredHeight = access700Var.IAuthTabCallback().getMeasuredHeight();
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        deprecated_dns deprecated_dnsVarOnExtraCallbackWithResult = deprecated_certificatepinner.onExtraCallbackWithResult();
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        TdsImageView tdsImageView = toflamegraphline2.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView, isMuted.onNavigationEvent(new AppLovinSdkSettings().onWarmupCompleted(deprecated_certificatepinner.onNavigationEvent()), (Float) null, f, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        Typography5 typography5 = toflamegraphline2.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{typography5, isMuted.onExtraCallbackWithResult(new AppLovinSdkSettings().onWarmupCompleted(deprecated_certificatepinner.asBinder()), (Integer) null, Integer.valueOf(toflamegraphline2.onExtraCallback.getMeasuredWidth() / 2), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        LinearLayout linearLayout = toflamegraphline2.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        AppLovinSdkSettings appLovinSdkSettings = new AppLovinSdkSettings();
        float fOnExtraCallbackWithResult = varyMatches.onExtraCallbackWithResult((Context) r13, Integer.valueOf(toflamegraphline2.onNavigationEvent.getMeasuredHeight() + measuredHeight));
        Intrinsics.checkNotNullExpressionValue(r13.getResources().getDisplayMetrics(), "");
        Rally rally3 = (Rally) RallysKt.onWarmupCompleted(new Object[]{linearLayout, (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{isMuted.asBinder(isMuted.getInterfaceDescriptor(appLovinSdkSettings, (Float) null, Float.valueOf(-(fOnExtraCallbackWithResult + varyMatches.onNavigationEvent(4, r4))), (Function1) null, 5, (Object) null), (Float) null, Float.valueOf(0.6f), (Function1) null, 5, (Object) null), Integer.valueOf(((CreditHomeActivity) r13).onRelationshipValidationResult)}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        LinearLayout linearLayoutIAuthTabCallback = access700Var.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(linearLayoutIAuthTabCallback, "");
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{new AppLovinSdkSettings(), 680}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), f, Float.valueOf(1.0f), (Function1) null, 4, (Object) null);
        DisplayMetrics displayMetrics = r13.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        return RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rally, rally2, rally3, (Rally) RallysKt.onWarmupCompleted(new Object[]{linearLayoutIAuthTabCallback, isMuted.onExtraCallback(appLovinSdkSettingsOnNavigationEvent, (Integer) null, Integer.valueOf((-measuredHeight) - varyMatches.onNavigationEvent(2, displayMetrics)), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, deprecated_dnsVarOnExtraCallbackWithResult, (Integer) null, (Boolean) null, 0, 0L, false, 4025, (Object) null);
    }

    private final runOnUiThreadDelayed ITrustedWebActivityCallbackStub() {
        int i = 2 % 2;
        int i2 = warmup + 41;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        AnimateTop animateTop = IEngagementSignalsCallback_Parcel().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(animateTop, "");
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf((Rally) RallysKt.onWarmupCompleted(new Object[]{animateTop, isMuted.onExtraCallback((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Integer) null, 0, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, (int) this.ICustomTabsService, 0L, false, 3577, (Object) null);
        int i4 = ICustomTabsServiceStub + 67;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return runonuithreaddelayedOnWarmupCompleted;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.content.Context, im.toss.feature.credit.ui.main.home.CreditHomeActivity] */
    private static /* synthetic */ Object prefetchWithMultipleUrls(Object[] objArr) throws Throwable {
        enableOverridePendingTransitionNew enableoverridependingtransitionnew = (enableOverridePendingTransitionNew) objArr[0];
        ?? r1 = (CreditHomeActivity) objArr[1];
        enableNebulaServiceInitOpt enablenebulaserviceinitopt = (enableNebulaServiceInitOpt) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[3], "");
        if (enableoverridependingtransitionnew.readTypedObject()) {
            r1.IAuthTabCallback(enableoverridependingtransitionnew);
            Unit unit = Unit.INSTANCE;
            int i2 = ICustomTabsServiceStub + 77;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            return unit;
        }
        int i4 = ICustomTabsServiceStub + 119;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        String string = r1.getString(im.toss.uikit.R.string.uikit_confirm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        r1.onNavigationEvent(enableoverridependingtransitionnew, enablenebulaserviceinitopt, string);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, im.toss.feature.credit.ui.main.home.CreditHomeActivity] */
    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        ?? r0 = (CreditHomeActivity) objArr[0];
        enableOverridePendingTransitionNew enableoverridependingtransitionnew = (enableOverridePendingTransitionNew) objArr[1];
        enableNebulaServiceInitOpt enablenebulaserviceinitopt = (enableNebulaServiceInitOpt) objArr[2];
        View view = (View) objArr[3];
        int i = 2 % 2;
        int i2 = warmup + 57;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            String string = r0.getString(im.toss.feature.credit.ui.main.R.string.neo_close);
            Intrinsics.checkNotNullExpressionValue(string, "");
            r0.onNavigationEvent(enableoverridependingtransitionnew, enablenebulaserviceinitopt, string);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        String string2 = r0.getString(im.toss.feature.credit.ui.main.R.string.neo_close);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        r0.onNavigationEvent(enableoverridependingtransitionnew, enablenebulaserviceinitopt, string2);
        Unit unit2 = Unit.INSTANCE;
        int i3 = warmup + 21;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew, enableNebulaServiceInitOpt enablenebulaserviceinitopt, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 91;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        String string = creditHomeActivity.getString(im.toss.feature.credit.ui.main.R.string.neo_close);
        Intrinsics.checkNotNullExpressionValue(string, "");
        creditHomeActivity.onNavigationEvent(enableoverridependingtransitionnew, enablenebulaserviceinitopt, string);
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 33;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 87;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{10031, 60701, 45937, 31063, 4027, 54678, 39910, 41004}, 51749 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), creditHomeActivity.areNotificationsEnabled());
        setDetectableSize.onExtraCallback("credit_bureau_type", enableoverridependingtransitionnew.asBinder());
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        setDetectableSize.onExtraCallback("credit_score", (String) enableOverridePendingTransitionNew.onNavigationEvent(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, -612393359, 612393361, iIAuthTabCallback3, iIAuthTabCallback2, new Object[]{enableoverridependingtransitionnew}));
        setDetectableSize.onExtraCallback("credit_score_diff", enableoverridependingtransitionnew.IAuthTabCallback_Parcel());
        Object[] objArr2 = new Object[1];
        c(new char[]{65535, 65528, 65525, '\b', 7, 7, 2, 1, 65522, 7, 65532, 7}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2, false, 11 - ImageFormat.getBitsPerPixel(0), ((Process.getThreadPriority(0) + 20) >> 6) + 302, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), creditHomeActivity.getString(im.toss.feature.credit.ui.main.R.string.neo_cta));
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 57;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(final enableOverridePendingTransitionNew enableoverridependingtransitionnew) throws Throwable {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1261761L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda10
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 15;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = CreditHomeActivity.onExtraCallback(this.f$0, enableoverridependingtransitionnew, (SetDetectableSize) obj);
                int i5 = onNavigationEvent + 73;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallback;
            }
        }, 14, null);
        SessionTrackerb sessionTrackerbValidateRelationship = validateRelationship();
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = this.onUnminimized;
        Object[] objArr = new Object[1];
        c(new char[]{'\t', 7, '\n', 65531, '\f', 3, '\r', '\t', '\b', 65497, '\f', 65535, 0, 65535, '\f', '\f', 65535, '\f', 65495, 65533, '\f', 65535, 65534, 3, 14, 65529, '\r', 65533, '\t', '\f', 65535, 65529, '\f', 65531, 3, '\r', 65535, 65529, '\t', 16, 65535, '\f', 6, 65531, 19, '\r', 15, '\n', 65535, '\f', 14, '\t', '\r', '\r', 65492, 65481, 65481, 6, '\t', 65531, '\b', 65481, 65533}, 45 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), false, ExpandableListView.getPackedPositionChild(0L) + 64, ((byte) KeyEvent.getModifierMetaStateMask()) + 296, objArr);
        SessionTrackerb.onNavigationEvent(sessionTrackerbValidateRelationship, this, ((String) objArr[0]).intern(), iEngagementSignalsCallback_Parcel, (Bundle) null, 8, (Object) null);
        int i2 = ICustomTabsServiceStub + 43;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 94 / 0;
        }
    }

    private static final Unit onExtraCallback(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 105;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{10031, 60701, 45937, 31063, 4027, 54678, 39910, 41004}, 51749 - TextUtils.indexOf("", "", 0, 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), creditHomeActivity.areNotificationsEnabled());
        setDetectableSize.onExtraCallback("credit_bureau_type", enableoverridependingtransitionnew.asBinder());
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        setDetectableSize.onExtraCallback("credit_score", (String) enableOverridePendingTransitionNew.onNavigationEvent(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, -612393359, 612393361, iIAuthTabCallback3, iIAuthTabCallback2, new Object[]{enableoverridependingtransitionnew}));
        setDetectableSize.onExtraCallback("credit_score_diff", enableoverridependingtransitionnew.IAuthTabCallback_Parcel());
        Object[] objArr2 = new Object[1];
        c(new char[]{65535, 65528, 65525, '\b', 7, 7, 2, 1, 65522, 7, 65532, 7}, TextUtils.lastIndexOf("", '0', 0) + 3, false, TextUtils.getOffsetAfter("", 0) + 12, Color.blue(0) + 302, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsServiceStub + 1;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final void onNavigationEvent(final enableOverridePendingTransitionNew enableoverridependingtransitionnew, enableNebulaServiceInitOpt enablenebulaserviceinitopt, final String str) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1261761L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 65;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = CreditHomeActivity.onNavigationEvent(this.f$0, enableoverridependingtransitionnew, str, (SetDetectableSize) obj);
                int i5 = onExtraCallbackWithResult + 9;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 78 / 0;
                }
                return unitOnNavigationEvent;
            }
        }, 14, null);
        if (enablenebulaserviceinitopt != null) {
            IAuthTabCallbackStub(enablenebulaserviceinitopt);
            return;
        }
        int i2 = warmup + 79;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(enableNebulaServiceInitOpt.KCB);
        IAuthTabCallbackStub(enableNebulaServiceInitOpt.NICE);
        int i4 = ICustomTabsServiceStub + 59;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(enablePreloadClassOpt enablepreloadclassopt, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback.onWarmupCompleted[enablepreloadclassopt.ordinal()];
        if (i4 == 1) {
            IEngagementSignalsCallback_Parcel().readTypedObject.onExtraCallback().setVisibility(0);
            IEngagementSignalsCallback_Parcel().access100.onExtraCallback().setVisibility(0);
            IEngagementSignalsCallback_Parcel().getInterfaceDescriptor.onExtraCallback().setVisibility(8);
        } else {
            int i5 = ICustomTabsServiceStub;
            int i6 = i5 + 1;
            warmup = i6 % 128;
            if (i6 % 2 != 0 ? i4 == 2 : i4 == 3) {
                IEngagementSignalsCallback_Parcel().access000.onExtraCallback().setVisibility(0);
                IEngagementSignalsCallback_Parcel().getInterfaceDescriptor.onExtraCallback().setVisibility(0);
                IEngagementSignalsCallback_Parcel().access100.onExtraCallback().setVisibility(8);
            } else {
                int i7 = i5 + 89;
                warmup = i7 % 128;
                if (i7 % 2 == 0) {
                    IEngagementSignalsCallback_Parcel().access100.onExtraCallback().setVisibility(0);
                    IEngagementSignalsCallback_Parcel().getInterfaceDescriptor.onExtraCallback().setVisibility(1);
                } else {
                    IEngagementSignalsCallback_Parcel().access100.onExtraCallback().setVisibility(0);
                    IEngagementSignalsCallback_Parcel().getInterfaceDescriptor.onExtraCallback().setVisibility(0);
                }
            }
        }
        TdsRollingNumberV1View tdsRollingNumberV1View = IEngagementSignalsCallback_Parcel().access100.access100;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View, "");
        onExtraCallbackWithResult(tdsRollingNumberV1View, enablepreloadclassopt);
        TdsRollingNumberV1View tdsRollingNumberV1View2 = IEngagementSignalsCallback_Parcel().getInterfaceDescriptor.access100;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View2, "");
        onExtraCallbackWithResult(tdsRollingNumberV1View2, enablepreloadclassopt);
        onNavigationEvent(Integer.valueOf(i), Integer.valueOf(i2));
    }

    private final void onNavigationEvent(Integer num, Integer num2) {
        int i = 2 % 2;
        int i2 = warmup + 15;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        if (num != null) {
            toFlameGraphLine toflamegraphline = IEngagementSignalsCallback_Parcel().access100;
            Intrinsics.checkNotNullExpressionValue(toflamegraphline, "");
            enableNebulaServiceInitOpt enablenebulaserviceinitopt = enableNebulaServiceInitOpt.KCB;
            IAuthTabCallback(toflamegraphline, enablenebulaserviceinitopt, num.intValue(), true);
            toFlameGraphLine toflamegraphline2 = IEngagementSignalsCallback_Parcel().access000;
            Intrinsics.checkNotNullExpressionValue(toflamegraphline2, "");
            IAuthTabCallback(toflamegraphline2, enablenebulaserviceinitopt, num.intValue(), true);
        }
        if (num2 != null) {
            toFlameGraphLine toflamegraphline3 = IEngagementSignalsCallback_Parcel().getInterfaceDescriptor;
            Intrinsics.checkNotNullExpressionValue(toflamegraphline3, "");
            enableNebulaServiceInitOpt enablenebulaserviceinitopt2 = enableNebulaServiceInitOpt.NICE;
            IAuthTabCallback(toflamegraphline3, enablenebulaserviceinitopt2, num2.intValue(), true);
            toFlameGraphLine toflamegraphline4 = IEngagementSignalsCallback_Parcel().readTypedObject;
            Intrinsics.checkNotNullExpressionValue(toflamegraphline4, "");
            IAuthTabCallback(toflamegraphline4, enablenebulaserviceinitopt2, num2.intValue(), true);
        }
        int i4 = ICustomTabsServiceStub + 41;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onExtraCallbackWithResult(TdsRollingNumberV1View tdsRollingNumberV1View, enablePreloadClassOpt enablepreloadclassopt) {
        float f;
        int i;
        int i2 = 2 % 2;
        if (enablepreloadclassopt == enablePreloadClassOpt.BOTH) {
            f = this.extraCallbackWithResult;
            i = ICustomTabsServiceStub + 123;
            warmup = i % 128;
        } else {
            f = this.prefetch;
            i = warmup + 9;
            ICustomTabsServiceStub = i % 128;
        }
        int i3 = i % 2;
        float f2 = 1.0f / f;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View.getResources().getDisplayMetrics(), "");
        TdsRollingNumberV1View.setTextSizePx$default(tdsRollingNumberV1View, (int) (varyMatches.onNavigationEvent(24, r1) * f), false, false, 6, (Object) null);
        tdsRollingNumberV1View.setScaleX(f2);
        tdsRollingNumberV1View.setScaleY(f2);
    }

    private final void IAuthTabCallback(toFlameGraphLine toflamegraphline, final enableNebulaServiceInitOpt enablenebulaserviceinitopt, int i, boolean z) {
        int i2 = 2 % 2;
        toflamegraphline.IAuthTabCallbackDefault.setText(enablenebulaserviceinitopt.name());
        TdsRollingNumberV1View tdsRollingNumberV1View = toflamegraphline.access100;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View, "");
        TdsRollingNumberV1View.setNumber$default(tdsRollingNumberV1View, i, false, (TdsRollingNumberV1View.access000) null, true, 4, (Object) null);
        TdsRollingNumberV1View tdsRollingNumberV1View2 = toflamegraphline.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View2, "");
        TdsRollingNumberV1View.setNumber$default(tdsRollingNumberV1View2, i, false, (TdsRollingNumberV1View.access000) null, true, 4, (Object) null);
        Object obj = null;
        if (!z) {
            int i3 = ICustomTabsServiceStub + 97;
            warmup = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        toflamegraphline.readTypedObject.onExtraCallbackWithResult.setProgress(i / 1000.0f);
        toflamegraphline.onExtraCallback().setOnClickListener(new View.OnClickListener() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda12
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                int i4 = 2 % 2;
                int i5 = onNavigationEvent + 109;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    CreditHomeActivity.onNavigationEvent(this.f$0, enablenebulaserviceinitopt, view);
                    throw null;
                }
                CreditHomeActivity.onNavigationEvent(this.f$0, enablenebulaserviceinitopt, view);
                int i6 = onNavigationEvent + 67;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i4 = warmup + 75;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(CreditHomeActivity creditHomeActivity, enableNebulaServiceInitOpt enablenebulaserviceinitopt, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 5;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        liteProcessHandlerThreadOpt liteprocesshandlerthreadopt = (liteProcessHandlerThreadOpt) creditHomeActivity.ITrustedWebActivityService().access100().IAuthTabCallback();
        if (liteprocesshandlerthreadopt != null) {
            int i4 = warmup + 19;
            ICustomTabsServiceStub = i4 % 128;
            if (i4 % 2 == 0) {
                creditHomeActivity.onExtraCallback(enablenebulaserviceinitopt == enableNebulaServiceInitOpt.KCB ? liteprocesshandlerthreadopt.asBinder() : liteprocesshandlerthreadopt.IAuthTabCallbackStubProxy());
            } else {
                enableNebulaServiceInitOpt enablenebulaserviceinitopt2 = enableNebulaServiceInitOpt.KCB;
                throw null;
            }
        }
    }

    private final Pair<Float, Float> getActiveNotifications() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 5;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Float fValueOf = Float.valueOf(IPostMessageService());
        if (i3 != 0) {
            return getWrite.IAuthTabCallback(fValueOf, Float.valueOf(IEngagementSignalsCallbackStubProxy()));
        }
        int i4 = 17 / 0;
        return getWrite.IAuthTabCallback(fValueOf, Float.valueOf(IEngagementSignalsCallbackStubProxy()));
    }

    private final float IPostMessageService() {
        int i = 2 % 2;
        int i2 = warmup + 15;
        ICustomTabsServiceStub = i2 % 128;
        float fCancelNotification = i2 % 2 != 0 ? (cancelNotification() >>> ITrustedWebActivityCallbackStubProxy()) + 0.0f : (cancelNotification() - ITrustedWebActivityCallbackStubProxy()) / 2.0f;
        int i3 = ICustomTabsServiceStub + 1;
        warmup = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 52 / 0;
        }
        return fCancelNotification;
    }

    private final float IEngagementSignalsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 37;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        float fITrustedWebActivityCallback_Parcel = (ITrustedWebActivityCallback_Parcel() - (ITrustedWebActivityCallbackStubProxy() + IPostMessageServiceStubProxy())) / 2.0f;
        int i4 = ICustomTabsServiceStub + 111;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return fITrustedWebActivityCallback_Parcel;
        }
        throw null;
    }

    private final float writeTypedList() {
        int i = 2 % 2;
        int i2 = warmup + 103;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int measuredHeight = IEngagementSignalsCallback_Parcel().asBinder.getMeasuredHeight();
        int iOnTransact = IEngagementSignalsCallback_Parcel().asBinder.onTransact();
        int iITrustedWebActivityCallback_Parcel = ITrustedWebActivityCallback_Parcel();
        int iITrustedWebActivityCallbackStubProxy = ITrustedWebActivityCallbackStubProxy();
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        float fMax = Math.max((ITrustedWebActivityCallbackStubProxy() * (this.prefetch - 1.0f)) + IPostMessageServiceStub(), (iITrustedWebActivityCallback_Parcel - ((iITrustedWebActivityCallbackStubProxy + ((Integer) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1321291062, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{this}, iOnWarmupCompleted3, -1321291049)).intValue()) + (measuredHeight - iOnTransact))) / 2.0f);
        int i4 = ICustomTabsServiceStub + 109;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return fMax;
    }

    private final void onExtraCallbackWithResult(enablePreloadClassOpt enablepreloadclassopt) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 1;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        checkInterval checkintervalIEngagementSignalsCallback_Parcel = IEngagementSignalsCallback_Parcel();
        FrameLayout frameLayoutOnExtraCallback = checkintervalIEngagementSignalsCallback_Parcel.access100.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(frameLayoutOnExtraCallback, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(frameLayoutOnExtraCallback, (int) checkintervalIEngagementSignalsCallback_Parcel.access000.onExtraCallback().getX(), (int) checkintervalIEngagementSignalsCallback_Parcel.access000.onExtraCallback().getY(), 0, 0);
        LottieAnimationView lottieAnimationView = checkintervalIEngagementSignalsCallback_Parcel.IAuthTabCallbackStubProxy;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(lottieAnimationView, (int) checkintervalIEngagementSignalsCallback_Parcel.access000.onExtraCallback().getX(), (int) checkintervalIEngagementSignalsCallback_Parcel.access000.onExtraCallback().getY(), 0, 0);
        FrameLayout frameLayoutOnExtraCallback2 = checkintervalIEngagementSignalsCallback_Parcel.getInterfaceDescriptor.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(frameLayoutOnExtraCallback2, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(frameLayoutOnExtraCallback2, (int) checkintervalIEngagementSignalsCallback_Parcel.readTypedObject.onExtraCallback().getX(), (int) checkintervalIEngagementSignalsCallback_Parcel.readTypedObject.onExtraCallback().getY(), 0, 0);
        LottieAnimationView lottieAnimationView2 = checkintervalIEngagementSignalsCallback_Parcel.IAuthTabCallback_Parcel;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(lottieAnimationView2, (int) checkintervalIEngagementSignalsCallback_Parcel.readTypedObject.onExtraCallback().getX(), (int) checkintervalIEngagementSignalsCallback_Parcel.readTypedObject.onExtraCallback().getY(), 0, 0);
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        Object obj = null;
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 681384212;
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132017736).substring(0, 4).length() + 39720355, 684715009, iOnWarmupCompleted, length, new Object[]{this}, iOnWarmupCompleted2, -684714961);
        onNavigationEvent(enablepreloadclassopt);
        int i4 = warmup + 67;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object setEngagementSignalsCallback(Object[] objArr) {
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 57;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int iITrustedWebActivityCallback_Parcel = (int) (creditHomeActivity.ITrustedWebActivityCallback_Parcel() / 1.75d);
        AnimateTop animateTop = creditHomeActivity.IEngagementSignalsCallback_Parcel().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(animateTop, "");
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(animateTop, iITrustedWebActivityCallback_Parcel);
        int i4 = ICustomTabsServiceStub + 31;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final void AudioAttributesImplBaseParcelizer() throws Throwable {
        String strIntern;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 97;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(new char[]{10037, 14836, 6803, 31674, 23642, 48438, 40540, 65401, 53702, 13036, 5022, 29782, 21864, 46599, 38757, 59866, 51938, 11139, 3236, 27924, 20080, 44817, 33164, 58090, 50058, 9404, 1371, 26235, 18196, 22567, 47764, 39917, 64664, 56643, 15976, 7940, 28717, 21235, 46049, 38047, 62907, 54879, 14144, 2081, 27342, 19432, 44164, 36284, 61042, 53108, 8214, 296, 25554, 17586, 42409, 34389, 59242, 63494}, 10251 % KeyEvent.keyCodeFromString(""), objArr);
            strIntern = ((String) objArr[0]).intern();
            if (!((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{this}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
                return;
            }
        } else {
            Object[] objArr2 = new Object[1];
            a(new char[]{10037, 14836, 6803, 31674, 23642, 48438, 40540, 65401, 53702, 13036, 5022, 29782, 21864, 46599, 38757, 59866, 51938, 11139, 3236, 27924, 20080, 44817, 33164, 58090, 50058, 9404, 1371, 26235, 18196, 22567, 47764, 39917, 64664, 56643, 15976, 7940, 28717, 21235, 46049, 38047, 62907, 54879, 14144, 2081, 27342, 19432, 44164, 36284, 61042, 53108, 8214, 296, 25554, 17586, 42409, 34389, 59242, 63494}, 7901 - KeyEvent.keyCodeFromString(""), objArr2);
            strIntern = ((String) objArr2[0]).intern();
            if (!((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{this}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
                return;
            }
        }
        checkInterval checkintervalIEngagementSignalsCallback_Parcel = IEngagementSignalsCallback_Parcel();
        LottieAnimationView lottieAnimationView = checkintervalIEngagementSignalsCallback_Parcel.IAuthTabCallback;
        Object[] objArr3 = new Object[1];
        a(new char[]{10037, 53234, 63135, 40380, 33858, 43808, 21072, 31375, 25078, 2202, 16306, 9792, 52592, 62497, 40073, 33788, 43650, 20901, 30792, 28466, 5672, 16071, 9632, 52380, 62394, 39498, 33047, 43053, 20684, 18401, 28376, 5546, 15444, 8968, 51756, 62195, 39413, 32923, 47021, 24171, 17739, 27684, 5312, 15355, 8855}, 59611 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr3);
        lottieAnimationView.setAnimationFromUrl(((String) objArr3[0]).intern());
        TdsImageView tdsImageView = checkintervalIEngagementSignalsCallback_Parcel.access100.IAuthTabCallback_Parcel;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        Object[] objArr4 = new Object[1];
        a(new char[]{10037, 22928, 55899, 23302, 56778, 24314, 57124, 20605, 53990, 21416, 54278, 22234, 55192, 18523, 51565, 19454, 52386, 19815, 52780, 16584, 49472, 16925, 50324, 17835, 50793, 18208, 63970, 31405, 64277, 32219, 65244, 32600, 61466, 29387, 62399, 29815, 62778, 30601, 59487, 26891, 60391, 27797, 60777, 28201, 57550, 25020, 57858, 25816, 58758, 26138, 59151, 6632, 39598}, 32441 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4);
        TdsImageView.setImage$default(tdsImageView, ((String) objArr4[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
        TdsImageView tdsImageView2 = checkintervalIEngagementSignalsCallback_Parcel.getInterfaceDescriptor.IAuthTabCallback_Parcel;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        Object[] objArr5 = new Object[1];
        a(new char[]{10037, 22928, 55899, 23302, 56778, 24314, 57124, 20605, 53990, 21416, 54278, 22234, 55192, 18523, 51565, 19454, 52386, 19815, 52780, 16584, 49472, 16925, 50324, 17835, 50793, 18208, 63970, 31405, 64277, 32219, 65244, 32600, 61466, 29387, 62399, 29815, 62778, 30601, 59487, 26891, 60391, 27797, 60777, 28201, 57550, 25020, 57858, 25816, 58758, 26138, 59151, 6632, 39598}, 32441 - TextUtils.indexOf("", "", 0, 0), objArr5);
        TdsImageView.setImage$default(tdsImageView2, ((String) objArr5[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
        LinearLayout linearLayout = checkintervalIEngagementSignalsCallback_Parcel.access100.onTransact.onWarmupCompleted;
        int i3 = im.toss.feature.credit.ui.main.R.drawable.rect_radius_36_dark;
        linearLayout.setBackgroundResource(i3);
        checkintervalIEngagementSignalsCallback_Parcel.getInterfaceDescriptor.onTransact.onWarmupCompleted.setBackgroundResource(i3);
        sampleInterval sampleinterval = checkintervalIEngagementSignalsCallback_Parcel.access000.readTypedObject;
        Intrinsics.checkNotNullExpressionValue(sampleinterval, "");
        onNavigationEvent(sampleinterval);
        sampleInterval sampleinterval2 = checkintervalIEngagementSignalsCallback_Parcel.access100.readTypedObject;
        Intrinsics.checkNotNullExpressionValue(sampleinterval2, "");
        onNavigationEvent(sampleinterval2);
        sampleInterval sampleinterval3 = checkintervalIEngagementSignalsCallback_Parcel.readTypedObject.readTypedObject;
        Intrinsics.checkNotNullExpressionValue(sampleinterval3, "");
        onNavigationEvent(sampleinterval3);
        sampleInterval sampleinterval4 = checkintervalIEngagementSignalsCallback_Parcel.getInterfaceDescriptor.readTypedObject;
        Intrinsics.checkNotNullExpressionValue(sampleinterval4, "");
        onNavigationEvent(sampleinterval4);
        IEngagementSignalsCallback_Parcel().access100.access000.setAnimationFromUrl(strIntern);
        IEngagementSignalsCallback_Parcel().getInterfaceDescriptor.access000.setAnimationFromUrl(strIntern);
        IEngagementSignalsCallback_Parcel().extraCallbackWithResult.setAnimationFromUrl(strIntern);
        IEngagementSignalsCallback_Parcel().IAuthTabCallbackStubProxy.setAnimationFromUrl(strIntern);
        IEngagementSignalsCallback_Parcel().IAuthTabCallback_Parcel.setAnimationFromUrl(strIntern);
        int i4 = ICustomTabsServiceStub + 25;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(sampleInterval sampleinterval) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 113;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        LottieAnimationView lottieAnimationView = sampleinterval.onNavigationEvent;
        Object[] objArr = new Object[1];
        a(new char[]{10037, 53234, 63135, 40380, 33858, 43808, 21072, 31375, 25078, 2202, 16306, 9792, 52592, 62497, 40073, 33788, 43650, 20901, 30792, 28466, 5672, 16071, 9632, 52380, 62394, 39498, 33047, 43053, 20684, 18401, 28376, 5546, 15444, 8968, 51756, 62195, 39413, 32923, 47021, 24171, 17739, 27684, 5312, 15355, 8855}, 59611 - ExpandableListView.getPackedPositionType(0L), objArr);
        lottieAnimationView.setAnimationFromUrl(((String) objArr[0]).intern());
        LottieAnimationView lottieAnimationView2 = sampleinterval.onExtraCallbackWithResult;
        Object[] objArr2 = new Object[1];
        a(new char[]{10037, 21314, 53247, 31340, 63106, 24944, 40432, 2463, 33910, 12522, 43794, 10160, 21040, 52817, 31401, 62828, 24962, 39989, 2216, 33922, 16232, 44023, 9792, 21164, 52538, 31066, 62967, 24701, 40076, 5937, 33784, 16346, 43604, 9976, 20748, 52643, 30771, 62534, 24778, 39797, 6074, 33306, 16050, 43734, 9554, 20924, 52237, 30859, 62242, 28488}, View.resolveSizeAndState(0, 0, 0) + 29803, objArr2);
        lottieAnimationView2.setAnimationFromUrl(((String) objArr2[0]).intern());
        TdsImageView tdsImageView = sampleinterval.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        Object[] objArr3 = new Object[1];
        c(new char[]{19, '\b', 2, 65485, 19, 14, 18, 18, 65485, '\b', '\f', 65486, '\b', 11, 11, 20, 18, 19, 18, 65486, 1, 6, 65521, '\b', '\r', 6, 65534, 3, 0, 17, '\n', 65485, 15, '\r', 6, 7, 19, 19, 15, 18, 65497, 65486, 65486, 18, 19, 0}, 35 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), false, 46 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 289, objArr3);
        TdsImageView.setImage$default(tdsImageView, ((String) objArr3[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
        TdsImageView tdsImageView2 = sampleinterval.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        Object[] objArr4 = new Object[1];
        a(new char[]{10037, 22928, 55899, 23302, 56778, 24314, 57124, 20605, 53990, 21416, 54278, 22234, 55192, 18523, 51565, 19454, 52386, 19815, 52780, 16584, 49472, 16925, 50324, 17835, 50793, 18208, 63970, 31405, 64277, 32219, 65244, 32600, 61466, 29387, 62399, 29815, 62778, 30601, 59487, 26891, 60391, 27797, 60777, 28201, 57550, 25020, 57858, 25816, 58758, 26138, 59151, 6632, 39598}, View.MeasureSpec.makeMeasureSpec(0, 0) + 32441, objArr4);
        TdsImageView.setImage$default(tdsImageView2, ((String) objArr4[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
        sampleinterval.onWarmupCompleted.setBackgroundResource(im.toss.feature.credit.ui.main.R.drawable.credit_score_background_circle_dark);
        int i4 = warmup + 119;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class ICustomTabsCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        int label;

        ICustomTabsCallbackDefault(access13800<? super ICustomTabsCallbackDefault> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsCallbackDefault iCustomTabsCallbackDefault = CreditHomeActivity.this.new ICustomTabsCallbackDefault(access13800Var);
            int i2 = onExtraCallback + 97;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 42 / 0;
            }
            return iCustomTabsCallbackDefault;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 25;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 3;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            CreditHomeActivity.onWarmupCompleted(CreditHomeActivity.this, false);
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallback + 35;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    private static final Unit prefetchWithMultipleUrls(CreditHomeActivity creditHomeActivity) {
        Integer numIAuthTabCallback;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 105;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        enableOverridePendingTransitionNew interfaceDescriptor = creditHomeActivity.ITrustedWebActivityService().getInterfaceDescriptor();
        Integer numIAuthTabCallbackDefault = null;
        if (interfaceDescriptor != null) {
            int i4 = ICustomTabsServiceStub + 85;
            warmup = i4 % 128;
            if (i4 % 2 == 0) {
                interfaceDescriptor.IAuthTabCallback();
                numIAuthTabCallbackDefault.hashCode();
                throw null;
            }
            numIAuthTabCallback = interfaceDescriptor.IAuthTabCallback();
        } else {
            numIAuthTabCallback = null;
        }
        enableOverridePendingTransitionNew interfaceDescriptor2 = creditHomeActivity.ITrustedWebActivityService().getInterfaceDescriptor();
        if (interfaceDescriptor2 != null) {
            int i5 = ICustomTabsServiceStub + 105;
            warmup = i5 % 128;
            if (i5 % 2 == 0) {
                interfaceDescriptor2.IAuthTabCallbackDefault();
                numIAuthTabCallbackDefault.hashCode();
                throw null;
            }
            numIAuthTabCallbackDefault = interfaceDescriptor2.IAuthTabCallbackDefault();
            int i6 = ICustomTabsServiceStub + 67;
            warmup = i6 % 128;
            int i7 = i6 % 2;
        }
        creditHomeActivity.onNavigationEvent(numIAuthTabCallback, numIAuthTabCallbackDefault);
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallbackStub(enableNebulaServiceInitOpt enablenebulaserviceinitopt) {
        int i = 2 % 2;
        isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt.listOf(new runOnUiThreadDelayed[]{ITrustedWebActivityCallbackDefault(), onExtraCallback(enablenebulaserviceinitopt), (runOnUiThreadDelayed) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1375461190, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, enablenebulaserviceinitopt}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1375461149), onNavigationEvent(enablenebulaserviceinitopt)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), (Object) null, new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda59
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                Unit unit;
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 11;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    Object[] objArr = {this.f$0};
                    unit = (Unit) CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1767247365, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1767247362);
                    int i4 = 32 / 0;
                } else {
                    Object[] objArr2 = {this.f$0};
                    unit = (Unit) CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1767247365, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr2, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1767247362);
                }
                int i5 = onExtraCallback + 87;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        }, 1, (Object) null), (Object) null, new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda60
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 27;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                CreditHomeActivity creditHomeActivity = this.f$0;
                if (i4 == 0) {
                    return CreditHomeActivity.IAuthTabCallback(creditHomeActivity);
                }
                CreditHomeActivity.IAuthTabCallback(creditHomeActivity);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, 1, (Object) null), false, 1, (Object) null);
        int i2 = ICustomTabsServiceStub + 49;
        warmup = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit receiveFile(CreditHomeActivity creditHomeActivity) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(creditHomeActivity), (CoroutineContext) null, (setRandomHost) null, creditHomeActivity.new ICustomTabsCallbackDefault(null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = warmup + 105;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 1 / 0;
        }
        return unit;
    }

    private final runOnUiThreadDelayed ITrustedWebActivityCallbackDefault() {
        int i = 2 % 2;
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        deprecated_dns deprecated_dnsVarOnExtraCallbackWithResult = deprecated_certificatepinner.onExtraCallbackWithResult();
        LottieAnimationView lottieAnimationView = IEngagementSignalsCallback_Parcel().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        AppLovinSdkSettings appLovinSdkSettingsOnWarmupCompleted = new AppLovinSdkSettings().onWarmupCompleted(deprecated_certificatepinner.onNavigationEvent());
        Float fValueOf = Float.valueOf(0.0f);
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{lottieAnimationView, isMuted.onNavigationEvent(appLovinSdkSettingsOnWarmupCompleted, (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        TdsGLBlurView tdsGLBlurView = IEngagementSignalsCallback_Parcel().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsGLBlurView, "");
        Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsGLBlurView, isMuted.onExtraCallbackWithResult((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(Address.onNavigationEvent.asBinder()), Integer.valueOf(this.onRelationshipValidationResult + 400)}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), deprecated_directory.Medium, deprecated_directory.None, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        AnimateTop animateTop = IEngagementSignalsCallback_Parcel().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(animateTop, "");
        Rally rally3 = (Rally) RallysKt.onWarmupCompleted(new Object[]{animateTop, isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        TdsBottomCtaV1View tdsBottomCtaV1View = IEngagementSignalsCallback_Parcel().asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rally, rally2, rally3, (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsBottomCtaV1View, isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, deprecated_dnsVarOnExtraCallbackWithResult, (Integer) null, (Boolean) null, 0, 0L, false, 4025, (Object) null);
        int i2 = ICustomTabsServiceStub + 27;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        return runonuithreaddelayedOnWarmupCompleted;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r31.equals("A") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        r3 = getString(im.toss.feature.credit.ui.main.R.string.credit_ui_score_approval_rate_raised);
        r5 = im.toss.feature.credit.ui.main.home.CreditHomeActivity.ICustomTabsServiceStub + 35;
        im.toss.feature.credit.ui.main.home.CreditHomeActivity.warmup = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r31.equals("C") != false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(String str) {
        String smallIconBitmap;
        getWriteTimeoutokhttp getwritetimeoutokhttp;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case 65:
                break;
            case 66:
                if (!(!str.equals(LiveCheckConstants.LOAD_PHONE_LOST_ACK))) {
                    smallIconBitmap = getString(im.toss.feature.credit.ui.main.R.string.credit_ui_score_raised_and_interest_down);
                    int i2 = warmup + 105;
                    ICustomTabsServiceStub = i2 % 128;
                    int i3 = i2 % 2;
                    break;
                }
                smallIconBitmap = getSmallIconBitmap();
                break;
            case 67:
                break;
            default:
                smallIconBitmap = getSmallIconBitmap();
                break;
        }
        String str2 = smallIconBitmap;
        Intrinsics.checkNotNull(str2);
        AnimateTop animateTop = IEngagementSignalsCallback_Parcel().onNavigationEvent;
        AnimateTop animateTop2 = IEngagementSignalsCallback_Parcel().onNavigationEvent;
        DisplayMetrics displayMetrics = animateTop.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        animateTop2.setUpperGap(varyMatches.onNavigationEvent(2, displayMetrics));
        IEngagementSignalsCallback_Parcel().onNavigationEvent.setInterMargin(IEngagementSignalsCallbackStub());
        getWriteTimeoutokhttp.onWarmupCompleted onwarmupcompleted = new getWriteTimeoutokhttp.onWarmupCompleted(str2, readTimeout.IAuthTabCallbackStubProxy.onNavigationEvent.IAuthTabCallback, 0, AnimateText.onNavigationEvent.TOP_CENTER, false, false, (Function0) null, (Function0) null, (Function0) null, 500, (DefaultConstructorMarker) null);
        getWriteTimeoutokhttp onwarmupcompleted2 = new getWriteTimeoutokhttp.onWarmupCompleted(ITrustedWebActivityServiceDefault(), readTimeout.asInterface.onExtraCallback.onExtraCallbackWithResult, 200, AnimateText.onNavigationEvent.CENTER, false, false, (Function0) null, (Function0) null, (Function0) null, 496, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNull(animateTop);
        Object obj = null;
        if (StringsKt.equals(str, "Control", true)) {
            int i4 = ICustomTabsServiceStub + 81;
            warmup = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            getwritetimeoutokhttp = onwarmupcompleted2;
        } else {
            getwritetimeoutokhttp = null;
        }
        AnimateTop.onExtraCallback(animateTop, (getWriteTimeoutokhttp) null, onwarmupcompleted, getwritetimeoutokhttp, false, false, 24, (Object) null);
    }

    private static /* synthetic */ Object prefetch(Object[] objArr) {
        toFlameGraphLine toflamegraphline;
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        enableNebulaServiceInitOpt enablenebulaserviceinitopt = (enableNebulaServiceInitOpt) objArr[1];
        int i = 2 % 2;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        enableNebulaServiceInitOpt enablenebulaserviceinitopt2 = enableNebulaServiceInitOpt.KCB;
        checkInterval checkintervalIEngagementSignalsCallback_Parcel = creditHomeActivity.IEngagementSignalsCallback_Parcel();
        if (enablenebulaserviceinitopt == enablenebulaserviceinitopt2) {
            int i2 = ICustomTabsServiceStub + 33;
            warmup = i2 % 128;
            if (i2 % 2 == 0) {
                toflamegraphline = checkintervalIEngagementSignalsCallback_Parcel.access100;
                int i3 = 97 / 0;
            } else {
                toflamegraphline = checkintervalIEngagementSignalsCallback_Parcel.access100;
            }
        } else {
            toflamegraphline = checkintervalIEngagementSignalsCallback_Parcel.getInterfaceDescriptor;
        }
        toFlameGraphLine toflamegraphline2 = toflamegraphline;
        Intrinsics.checkNotNull(toflamegraphline2);
        access700 access700Var = (enablenebulaserviceinitopt == enablenebulaserviceinitopt2 ? creditHomeActivity.IEngagementSignalsCallback_Parcel().access100 : creditHomeActivity.IEngagementSignalsCallback_Parcel().getInterfaceDescriptor).onTransact;
        int i4 = warmup + 57;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNull(access700Var);
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        TdsImageView tdsImageView = toflamegraphline2.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView, isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, fValueOf2, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        Typography5 typography5 = toflamegraphline2.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{typography5, isMuted.onExtraCallbackWithResult(new AppLovinSdkSettings(), (Integer) null, 0, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        LinearLayout linearLayout = toflamegraphline2.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        Rally rally3 = (Rally) RallysKt.onWarmupCompleted(new Object[]{linearLayout, isMuted.asBinder(isMuted.onExtraCallback(new AppLovinSdkSettings().onWarmupCompleted(deprecated_certificatePinner.onExtraCallbackWithResult.asBinder()), (Integer) null, 0, (Function1) null, 5, (Object) null), (Float) null, fValueOf2, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        LinearLayout linearLayoutIAuthTabCallback = access700Var.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(linearLayoutIAuthTabCallback, "");
        return RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rally, rally2, rally3, (Rally) RallysKt.onWarmupCompleted(new Object[]{linearLayoutIAuthTabCallback, isMuted.getInterfaceDescriptor(isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, fValueOf, (Function1) null, 5, (Object) null), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 250, 0L, false, 3577, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[PHI: r2 r3
      0x0037: PHI (r2v32 java.lang.Float) = (r2v5 java.lang.Float), (r2v34 java.lang.Float) binds: [B:8:0x002c, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r3v13 java.lang.Float) = (r3v2 java.lang.Float), (r3v14 java.lang.Float) binds: [B:8:0x002c, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e A[PHI: r2 r3
      0x002e: PHI (r2v6 java.lang.Float) = (r2v5 java.lang.Float), (r2v34 java.lang.Float) binds: [B:8:0x002c, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x002e: PHI (r3v3 java.lang.Float) = (r3v2 java.lang.Float), (r3v14 java.lang.Float) binds: [B:8:0x002c, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final runOnUiThreadDelayed onExtraCallback(enableNebulaServiceInitOpt enablenebulaserviceinitopt) {
        Float fValueOf;
        Float fValueOf2;
        toFlameGraphLine toflamegraphline;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 109;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            fValueOf = Float.valueOf(2.0f);
            fValueOf2 = Float.valueOf(0.0f);
            if (enablenebulaserviceinitopt == enableNebulaServiceInitOpt.KCB) {
                toflamegraphline = IEngagementSignalsCallback_Parcel().access100;
            } else {
                toflamegraphline = IEngagementSignalsCallback_Parcel().getInterfaceDescriptor;
                int i3 = ICustomTabsServiceStub + 73;
                warmup = i3 % 128;
                int i4 = i3 % 2;
            }
        } else {
            fValueOf = Float.valueOf(1.0f);
            fValueOf2 = Float.valueOf(0.0f);
            if (enablenebulaserviceinitopt == enableNebulaServiceInitOpt.KCB) {
            }
        }
        Float f = fValueOf;
        Float f2 = fValueOf2;
        Intrinsics.checkNotNull(toflamegraphline);
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        deprecated_dns deprecated_dnsVarOnExtraCallbackWithResult = deprecated_certificatepinner.onExtraCallbackWithResult();
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        FrameLayout frameLayoutOnExtraCallback = toflamegraphline.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(frameLayoutOnExtraCallback, "");
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayoutOnExtraCallback, isMuted.IAuthTabCallback_Parcel(isMuted.asBinder(new AppLovinSdkSettings().onWarmupCompleted(deprecated_certificatepinner.onExtraCallback()), (Float) null, f, (Function1) null, 5, (Object) null), (Float) null, f2, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        FrameLayout frameLayoutOnExtraCallback2 = toflamegraphline.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(frameLayoutOnExtraCallback2, "");
        Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayoutOnExtraCallback2, (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{isMuted.getInterfaceDescriptor(new AppLovinSdkSettings().onWarmupCompleted(deprecated_certificatepinner.onExtraCallback()), (Float) null, f2, (Function1) null, 5, (Object) null), 150}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        View view = toflamegraphline.readTypedObject.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(view, "");
        Rally rally3 = (Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, f2, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        TdsImageView tdsImageView = toflamegraphline.readTypedObject.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        Rally rally4 = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView, isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, f, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        TdsImageView tdsImageView2 = toflamegraphline.readTypedObject.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        Rally rally5 = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView2, isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, f2, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        LottieAnimationView lottieAnimationView = toflamegraphline.readTypedObject.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        Rally rally6 = (Rally) RallysKt.onWarmupCompleted(new Object[]{lottieAnimationView, isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, f2, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        LottieAnimationView lottieAnimationView2 = toflamegraphline.readTypedObject.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
        return RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rally, rally2, rally3, rally4, rally5, rally6, (Rally) RallysKt.onWarmupCompleted(new Object[]{lottieAnimationView2, isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, f, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, deprecated_dnsVarOnExtraCallbackWithResult, (Integer) null, (Boolean) null, 250, 0L, false, 3513, (Object) null);
    }

    private final void ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 15;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(enableNebulaServiceInitOpt.KCB);
        IAuthTabCallbackStub(enableNebulaServiceInitOpt.NICE);
        IEngagementSignalsCallback_Parcel().writeTypedObject.setEnabled(false);
        int i4 = ICustomTabsServiceStub + 51;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void MediaMetadataCompat() {
        TdsBottomCtaV1View tdsBottomCtaV1View;
        int i;
        int i2 = 2 % 2;
        int i3 = warmup + 41;
        ICustomTabsServiceStub = i3 % 128;
        if (i3 % 2 != 0) {
            tdsBottomCtaV1View = IEngagementSignalsCallback_Parcel().asBinder;
            tdsBottomCtaV1View.setAlpha(2.0f);
            i = 1;
        } else {
            tdsBottomCtaV1View = IEngagementSignalsCallback_Parcel().asBinder;
            tdsBottomCtaV1View.setAlpha(0.0f);
            i = 0;
        }
        tdsBottomCtaV1View.setVisibility(i);
        int i4 = warmup + 91;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 9;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        creditHomeActivity.IEngagementSignalsCallback_Parcel().asBinder.asInterface().setEnabled(true);
        Object[] objArr2 = {creditHomeActivity.IEngagementSignalsCallback_Parcel().asBinder};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        ((TdsButtonV1View) TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, objArr2, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).setEnabled(true);
        int i4 = warmup + 77;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return null;
    }

    private final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 95;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        TdsGLBlurView tdsGLBlurView = IEngagementSignalsCallback_Parcel().onExtraCallbackWithResult;
        tdsGLBlurView.setFocusable(z);
        tdsGLBlurView.setClickable(z);
        int i4 = warmup + 107;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
    }

    private static final Unit onWarmupCompleted(toFlameGraphLine toflamegraphline, enableOverridePendingTransitionNew enableoverridependingtransitionnew) {
        int iIntValue;
        int i = 2 % 2;
        int i2 = warmup + 57;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TdsRollingNumberV1View tdsRollingNumberV1View = toflamegraphline.access100;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View, "");
        Integer num = (Integer) enableOverridePendingTransitionNew.onNavigationEvent(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -1422657423, 1422657424, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{enableoverridependingtransitionnew});
        if (num != null) {
            int i4 = warmup + 95;
            ICustomTabsServiceStub = i4 % 128;
            if (i4 % 2 != 0) {
                num.intValue();
                throw null;
            }
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        TdsRollingNumberV1View.setNumber$default(tdsRollingNumberV1View, iIntValue, true, (TdsRollingNumberV1View.access000) null, true, 4, (Object) null);
        TdsRollingNumberV1View tdsRollingNumberV1View2 = toflamegraphline.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View2, "");
        Integer num2 = (Integer) enableOverridePendingTransitionNew.onNavigationEvent(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -1422657423, 1422657424, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{enableoverridependingtransitionnew});
        TdsRollingNumberV1View.setNumber$default(tdsRollingNumberV1View2, num2 != null ? num2.intValue() : 0, true, (TdsRollingNumberV1View.access000) null, true, 4, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(toFlameGraphLine toflamegraphline, CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew) {
        int i = 2 % 2;
        int i2 = warmup + 19;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        toflamegraphline.asInterface.setText(creditHomeActivity.getString(im.toss.feature.credit.ui.main.R.string.credit_ui_expected_my_credit_interest));
        TdsRollingNumberV1View tdsRollingNumberV1View = toflamegraphline.access100;
        TdsRollingNumberV1View.IAuthTabCallbackStubProxy.onWarmupCompleted onwarmupcompleted = TdsRollingNumberV1View.IAuthTabCallbackStubProxy.onWarmupCompleted.IAuthTabCallback;
        tdsRollingNumberV1View.setRollingDirection(onwarmupcompleted);
        TdsRollingNumberV1View tdsRollingNumberV1View2 = toflamegraphline.access100;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View2, "");
        TdsRollingNumberV1View.setNumber$default(tdsRollingNumberV1View2, String.valueOf(enableoverridependingtransitionnew.onExtraCallbackWithResult()), true, (TdsRollingNumberV1View.access000) null, 0, false, false, true, 60, (Object) null);
        toflamegraphline.getInterfaceDescriptor.setRollingDirection(onwarmupcompleted);
        TdsRollingNumberV1View tdsRollingNumberV1View3 = toflamegraphline.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View3, "");
        TdsRollingNumberV1View.setNumber$default(tdsRollingNumberV1View3, String.valueOf(enableoverridependingtransitionnew.onExtraCallbackWithResult()), true, (TdsRollingNumberV1View.access000) null, 0, false, false, true, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 1;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(toFlameGraphLine toflamegraphline, enableOverridePendingTransitionNew enableoverridependingtransitionnew) {
        int iIntValue;
        int i;
        int iIntValue2;
        int i2 = 2 % 2;
        toflamegraphline.IAuthTabCallback.setVisibility(0);
        TdsRollingNumberV1View tdsRollingNumberV1View = toflamegraphline.access100;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View, "");
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        Integer num = (Integer) enableOverridePendingTransitionNew.onNavigationEvent(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, -1422657423, 1422657424, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{enableoverridependingtransitionnew});
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            int i3 = ICustomTabsServiceStub + 7;
            warmup = i3 % 128;
            int i4 = i3 % 2;
            iIntValue = 0;
        }
        TdsRollingNumberV1View.setNumber$default(tdsRollingNumberV1View, iIntValue, true, (TdsRollingNumberV1View.access000) null, true, 4, (Object) null);
        TdsRollingNumberV1View tdsRollingNumberV1View2 = toflamegraphline.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View2, "");
        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback4 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        Integer num2 = (Integer) enableOverridePendingTransitionNew.onNavigationEvent(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback3, -1422657423, 1422657424, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback4, new Object[]{enableoverridependingtransitionnew});
        if (num2 != null) {
            int i5 = ICustomTabsServiceStub + 75;
            warmup = i5 % 128;
            if (i5 % 2 == 0) {
                iIntValue2 = num2.intValue();
                int i6 = 96 / 0;
            } else {
                iIntValue2 = num2.intValue();
            }
            i = iIntValue2;
        } else {
            i = 0;
        }
        TdsRollingNumberV1View.setNumber$default(tdsRollingNumberV1View2, i, true, (TdsRollingNumberV1View.access000) null, true, 4, (Object) null);
        TdsBadgeV1View tdsBadgeV1View = toflamegraphline.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBadgeV1View, "");
        isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted(tdsBadgeV1View, CollectionsKt.listOf(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(1.0f), (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 400, 0L, false, 1788, (Object) null), false, 1, (Object) null);
        return Unit.INSTANCE;
    }

    static final class warmup extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ runOnUiThreadDelayed $timeline;
        int label;
        final /* synthetic */ CreditHomeActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        warmup(runOnUiThreadDelayed runonuithreaddelayed, CreditHomeActivity creditHomeActivity, access13800<? super warmup> access13800Var) {
            super(2, access13800Var);
            this.$timeline = runonuithreaddelayed;
            this.this$0 = creditHomeActivity;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 4 / 0;
            }
            int i5 = onWarmupCompleted + 73;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            warmup warmupVar = new warmup(this.$timeline, this.this$0, access13800Var);
            int i2 = onNavigationEvent + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return warmupVar;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            runOnUiThreadDelayed runonuithreaddelayed = this.$timeline;
            if (runonuithreaddelayed != null) {
                int i2 = onWarmupCompleted + 109;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                isFireOS.onExtraCallbackWithResult(runonuithreaddelayed, false, 1, (Object) null);
                int i4 = onWarmupCompleted + 87;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
            CreditHomeActivity.onPostMessage(this.this$0).IAuthTabCallback.setVisibility(8);
            Unit unit = Unit.INSTANCE;
            int i6 = onNavigationEvent + 41;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(final enableOverridePendingTransitionNew enableoverridependingtransitionnew, enablePreloadClassOpt enablepreloadclassopt) throws Throwable {
        final toFlameGraphLine toflamegraphline;
        LottieAnimationView lottieAnimationView;
        runOnUiThreadDelayed runonuithreaddelayedOnNavigationEvent;
        int i = 2 % 2;
        String strOnWarmupCompleted = enableoverridependingtransitionnew.onWarmupCompleted();
        enablePreloadClassOpt enablepreloadclassopt2 = enablePreloadClassOpt.KCB;
        checkInterval checkintervalIEngagementSignalsCallback_Parcel = IEngagementSignalsCallback_Parcel();
        if (enablepreloadclassopt == enablepreloadclassopt2) {
            int i2 = warmup + 83;
            ICustomTabsServiceStub = i2 % 128;
            int i3 = i2 % 2;
            toflamegraphline = checkintervalIEngagementSignalsCallback_Parcel.access100;
        } else {
            toflamegraphline = checkintervalIEngagementSignalsCallback_Parcel.getInterfaceDescriptor;
            int i4 = ICustomTabsServiceStub + 3;
            warmup = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 4;
            }
        }
        Intrinsics.checkNotNull(toflamegraphline);
        Object obj = null;
        if (enablepreloadclassopt == enablepreloadclassopt2) {
            int i6 = ICustomTabsServiceStub + 83;
            warmup = i6 % 128;
            if (i6 % 2 == 0) {
                LottieAnimationView lottieAnimationView2 = IEngagementSignalsCallback_Parcel().IAuthTabCallbackStubProxy;
                obj.hashCode();
                throw null;
            }
            lottieAnimationView = IEngagementSignalsCallback_Parcel().IAuthTabCallbackStubProxy;
        } else {
            lottieAnimationView = IEngagementSignalsCallback_Parcel().IAuthTabCallback_Parcel;
        }
        Intrinsics.checkNotNull(lottieAnimationView);
        onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1636837509, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, toflamegraphline}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1636837482);
        switch (strOnWarmupCompleted.hashCode()) {
            case 65:
                if (!strOnWarmupCompleted.equals("A")) {
                    int i7 = ICustomTabsServiceStub + 11;
                    warmup = i7 % 128;
                    int i8 = i7 % 2;
                    runonuithreaddelayedOnNavigationEvent = null;
                    break;
                } else {
                    runonuithreaddelayedOnNavigationEvent = onNavigationEvent(toflamegraphline, enableoverridependingtransitionnew, lottieAnimationView, (Function0<Unit>) new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda54
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;

                        public final Object invoke() {
                            int i9 = 2 % 2;
                            int i10 = IAuthTabCallback + 103;
                            onExtraCallback = i10 % 128;
                            int i11 = i10 % 2;
                            Unit unitIAuthTabCallback = CreditHomeActivity.IAuthTabCallback(toflamegraphline, enableoverridependingtransitionnew);
                            int i12 = IAuthTabCallback + 47;
                            onExtraCallback = i12 % 128;
                            int i13 = i12 % 2;
                            return unitIAuthTabCallback;
                        }
                    });
                    break;
                }
            case 66:
                if (strOnWarmupCompleted.equals(LiveCheckConstants.LOAD_PHONE_LOST_ACK)) {
                    runonuithreaddelayedOnNavigationEvent = onNavigationEvent(toflamegraphline, enableoverridependingtransitionnew, lottieAnimationView, (Function0<Unit>) new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda55
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            int i9 = 2 % 2;
                            int i10 = onWarmupCompleted + 71;
                            IAuthTabCallback = i10 % 128;
                            int i11 = i10 % 2;
                            Unit unitIAuthTabCallback = CreditHomeActivity.IAuthTabCallback(toflamegraphline, this, enableoverridependingtransitionnew);
                            int i12 = IAuthTabCallback + 93;
                            onWarmupCompleted = i12 % 128;
                            int i13 = i12 % 2;
                            return unitIAuthTabCallback;
                        }
                    });
                    break;
                }
                break;
            case 67:
                if (strOnWarmupCompleted.equals("C")) {
                    toflamegraphline.IAuthTabCallback.setText(getString(im.toss.feature.credit.ui.main.R.string.credit_ui_expected_credit_interest_format, String.valueOf(enableoverridependingtransitionnew.onExtraCallbackWithResult())));
                    runonuithreaddelayedOnNavigationEvent = onNavigationEvent(toflamegraphline, enableoverridependingtransitionnew, lottieAnimationView, (Function0<Unit>) new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda56
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            int i9 = 2 % 2;
                            int i10 = onWarmupCompleted + 7;
                            onExtraCallback = i10 % 128;
                            if (i10 % 2 == 0) {
                                CreditHomeActivity.onExtraCallback(toflamegraphline, enableoverridependingtransitionnew);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            Unit unitOnExtraCallback = CreditHomeActivity.onExtraCallback(toflamegraphline, enableoverridependingtransitionnew);
                            int i11 = onExtraCallback + 67;
                            onWarmupCompleted = i11 % 128;
                            int i12 = i11 % 2;
                            return unitOnExtraCallback;
                        }
                    });
                    break;
                }
                break;
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new warmup(runonuithreaddelayedOnNavigationEvent, this, null), 3, (Object) null);
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        toFlameGraphLine toflamegraphline = (toFlameGraphLine) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 57;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            toflamegraphline.asInterface.setTextSize(0, 11.0f);
            toflamegraphline.IAuthTabCallback.setTextSize(0, 9.0f);
        } else {
            toflamegraphline.asInterface.setTextSize(1, 11.0f);
            toflamegraphline.IAuthTabCallback.setTextSize(1, 9.0f);
        }
        int i3 = warmup + 87;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[PHI: r0 r5
      0x003c: PHI (r0v5 java.lang.Float) = (r0v4 java.lang.Float), (r0v14 java.lang.Float) binds: [B:8:0x003a, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x003c: PHI (r5v1 java.lang.Float) = (r5v0 java.lang.Float), (r5v6 java.lang.Float) binds: [B:8:0x003a, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final runOnUiThreadDelayed onNavigationEvent(final toFlameGraphLine toflamegraphline, final enableOverridePendingTransitionNew enableoverridependingtransitionnew, final LottieAnimationView lottieAnimationView, final Function0<Unit> function0) {
        Float fValueOf;
        Float fValueOf2;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 75;
        warmup = i2 % 128;
        float measuredHeight = 1.0f;
        if (i2 % 2 == 0) {
            fValueOf = Float.valueOf(2.0f);
            fValueOf2 = Float.valueOf(2.0f);
            if (Intrinsics.areEqual(enableoverridependingtransitionnew.onWarmupCompleted(), "C")) {
                measuredHeight = 0.1f * toflamegraphline.onExtraCallback().getMeasuredHeight();
                int i3 = ICustomTabsServiceStub + 45;
                warmup = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 3 % 2;
                }
            }
        } else {
            fValueOf = Float.valueOf(1.0f);
            measuredHeight = 0.0f;
            fValueOf2 = Float.valueOf(0.0f);
            if (Intrinsics.areEqual(enableoverridependingtransitionnew.onWarmupCompleted(), "C")) {
            }
        }
        float y = toflamegraphline.asInterface.getY();
        Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
        float f = -(y + varyMatches.onNavigationEvent(4, r7) + measuredHeight);
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        deprecated_dns deprecated_dnsVarOnExtraCallbackWithResult = deprecated_certificatepinner.onExtraCallbackWithResult();
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        FrameLayout frameLayoutOnExtraCallbackWithResult = toflamegraphline.readTypedObject.onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(frameLayoutOnExtraCallbackWithResult, "");
        Rally rallyOnWarmupCompleted = RallysKt.onWarmupCompleted(frameLayoutOnExtraCallbackWithResult, CollectionsKt.listOf(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf2, (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        FrameLayout frameLayoutOnExtraCallbackWithResult2 = toflamegraphline.readTypedObject.onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(frameLayoutOnExtraCallbackWithResult2, "");
        Rally rallyOnWarmupCompleted2 = RallysKt.onWarmupCompleted(frameLayoutOnExtraCallbackWithResult2, CollectionsKt.listOf(isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.IAuthTabCallbackStub()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(2.0f), (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        LottieAnimationView lottieAnimationView2 = IEngagementSignalsCallback_Parcel().extraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
        Rally rallyOnWarmupCompleted3 = RallysKt.onWarmupCompleted(lottieAnimationView2, CollectionsKt.listOf(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.IAuthTabCallbackStub()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        LottieAnimationView lottieAnimationView3 = IEngagementSignalsCallback_Parcel().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView3, "");
        Float f2 = fValueOf2;
        Rally rallyOnWarmupCompleted4 = RallysKt.onWarmupCompleted(lottieAnimationView3, CollectionsKt.listOf(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.IAuthTabCallbackStub()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, f2, (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        Typography5 typography5 = toflamegraphline.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        Rally rallyOnWarmupCompleted5 = RallysKt.onWarmupCompleted(typography5, CollectionsKt.listOf(isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, f2, (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        LinearLayout linearLayoutIAuthTabCallback = toflamegraphline.onTransact.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(linearLayoutIAuthTabCallback, "");
        Rally rallyOnWarmupCompleted6 = RallysKt.onWarmupCompleted(linearLayoutIAuthTabCallback, CollectionsKt.listOf(isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, f2, (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        TdsRollingNumberV1View tdsRollingNumberV1View = toflamegraphline.access100;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View, "");
        Rally rallyOnWarmupCompleted7 = RallysKt.onWarmupCompleted(tdsRollingNumberV1View, CollectionsKt.listOf(isMuted.onNavigationEvent(isMuted.getInterfaceDescriptor(new AppLovinSdkSettings(), (Float) null, Float.valueOf(f), (Function1) null, 5, (Object) null), (Float) null, f2, (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        TdsRollingNumberV1View tdsRollingNumberV1View2 = toflamegraphline.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View2, "");
        Float f3 = fValueOf;
        Rally rallyOnWarmupCompleted8 = RallysKt.onWarmupCompleted(tdsRollingNumberV1View2, CollectionsKt.listOf(isMuted.onNavigationEvent(isMuted.getInterfaceDescriptor(new AppLovinSdkSettings(), (Float) null, Float.valueOf(f), (Function1) null, 5, (Object) null), (Float) null, f3, (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        FrameLayout frameLayout = toflamegraphline.IAuthTabCallbackStubProxy;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        Rally rallyOnWarmupCompleted9 = RallysKt.onWarmupCompleted(frameLayout, CollectionsKt.listOf(isMuted.asBinder(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.IAuthTabCallbackStub()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, f3, (Function1) null, 5, (Object) null), (Float) null, Float.valueOf(this.access100), (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 150, 0L, false, 1788, (Object) null);
        Typography7 typography7 = toflamegraphline.asInterface;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallbackDefault = runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.plus(CollectionsKt.listOf(new Rally[]{rallyOnWarmupCompleted, rallyOnWarmupCompleted2, rallyOnWarmupCompleted3, rallyOnWarmupCompleted4, rallyOnWarmupCompleted5, rallyOnWarmupCompleted6, rallyOnWarmupCompleted7, rallyOnWarmupCompleted8, rallyOnWarmupCompleted9, RallysKt.onWarmupCompleted(typography7, CollectionsKt.listOf(isMuted.getInterfaceDescriptor(isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, f3, (Function1) null, 5, (Object) null), (Float) null, Float.valueOf(-(toflamegraphline.getInterfaceDescriptor.getMeasuredHeight() + measuredHeight)), (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null)}), (List) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1000602071, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, toflamegraphline, enableoverridependingtransitionnew}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1000602028)), 0, (getExtraParameters) null, 0, deprecated_dnsVarOnExtraCallbackWithResult, (Integer) null, (Boolean) null, 0, 0L, false, 4025, (Object) null), (Object) null, new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda13
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i5 = 2 % 2;
                int i6 = IAuthTabCallback + 61;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                Unit unitIAuthTabCallback = CreditHomeActivity.IAuthTabCallback(this.f$0, toflamegraphline, enableoverridependingtransitionnew, lottieAnimationView, function0);
                int i8 = onExtraCallbackWithResult + 105;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                return unitIAuthTabCallback;
            }
        }, 1, (Object) null);
        int i5 = warmup + 97;
        ICustomTabsServiceStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 95 / 0;
        }
        return runonuithreaddelayedIAuthTabCallbackDefault;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0041 A[PHI: r1
      0x0041: PHI (r1v9 androidx.constraintlayout.widget.Guideline) = (r1v6 androidx.constraintlayout.widget.Guideline), (r1v12 androidx.constraintlayout.widget.Guideline) binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r1
      0x003d: PHI (r1v7 androidx.constraintlayout.widget.Guideline) = (r1v6 androidx.constraintlayout.widget.Guideline), (r1v12 androidx.constraintlayout.widget.Guideline) binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(CreditHomeActivity creditHomeActivity, toFlameGraphLine toflamegraphline, enableOverridePendingTransitionNew enableoverridependingtransitionnew, LottieAnimationView lottieAnimationView, Function0 function0) {
        Guideline guideline;
        float f;
        int i = 2 % 2;
        int i2 = warmup + 7;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            minFresh.onNavigationEvent(creditHomeActivity, noStore.Companion.asInterface());
            guideline = toflamegraphline.onExtraCallbackWithResult;
            f = !(StringsKt.equals(enableoverridependingtransitionnew.onWarmupCompleted(), "C", true) ^ true) ? 0.35f : 0.45f;
        } else {
            minFresh.onNavigationEvent(creditHomeActivity, noStore.Companion.asInterface());
            guideline = toflamegraphline.onExtraCallbackWithResult;
            if (StringsKt.equals(enableoverridependingtransitionnew.onWarmupCompleted(), "C", true)) {
            }
        }
        guideline.setGuidelinePercent(f);
        lottieAnimationView.setVisibility(0);
        creditHomeActivity.IEngagementSignalsCallback_Parcel().extraCallbackWithResult.setVisibility(0);
        toflamegraphline.asInterface.setVisibility(0);
        toflamegraphline.IAuthTabCallbackStubProxy.setVisibility(0);
        if (function0 != null) {
            int i3 = ICustomTabsServiceStub + 67;
            warmup = i3 % 128;
            if (i3 % 2 == 0) {
                function0.invoke();
                int i4 = 23 / 0;
            } else {
                function0.invoke();
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object newSessionWithExtras(Object[] objArr) {
        int iIntValue;
        final CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        final toFlameGraphLine toflamegraphline = (toFlameGraphLine) objArr[1];
        enableOverridePendingTransitionNew enableoverridependingtransitionnew = (enableOverridePendingTransitionNew) objArr[2];
        int i = 2 % 2;
        Integer num = (Integer) enableOverridePendingTransitionNew.onNavigationEvent(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -1422657423, 1422657424, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{enableoverridependingtransitionnew});
        if (num != null) {
            int i2 = warmup + 33;
            ICustomTabsServiceStub = i2 % 128;
            int i3 = i2 % 2;
            iIntValue = num.intValue();
            int i4 = warmup + 19;
            ICustomTabsServiceStub = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iIntValue = 0;
        }
        float f = Intrinsics.areEqual(enableoverridependingtransitionnew.onWarmupCompleted(), LiveCheckConstants.LOAD_PHONE_LOST_ACK) ? 0.7f : iIntValue > 50 ? (iIntValue - 50) / 100.0f : 0.0f;
        float f2 = Intrinsics.areEqual(enableoverridependingtransitionnew.onWarmupCompleted(), LiveCheckConstants.LOAD_PHONE_LOST_ACK) ? 0.3f : iIntValue / 100.0f;
        LottieAnimationView lottieAnimationView = toflamegraphline.access000;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{lottieAnimationView, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.IAuthTabCallbackStub()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(f), Float.valueOf(f2), new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda17
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i6 = 2 % 2;
                int i7 = onExtraCallback + 55;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                toFlameGraphLine toflamegraphline2 = toflamegraphline;
                Float f3 = (Float) obj;
                if (i8 != 0) {
                    return CreditHomeActivity.onExtraCallbackWithResult(toflamegraphline2, f3.floatValue());
                }
                CreditHomeActivity.onExtraCallbackWithResult(toflamegraphline2, f3.floatValue());
                throw null;
            }
        }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        LottieAnimationView lottieAnimationView2 = creditHomeActivity.IEngagementSignalsCallback_Parcel().extraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
        List listListOf = CollectionsKt.listOf(new Rally[]{rally, (Rally) RallysKt.onWarmupCompleted(new Object[]{lottieAnimationView2, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.IAuthTabCallbackStub()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(0.0f), Float.valueOf(f2), new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda18
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i6 = 2 % 2;
                int i7 = onExtraCallbackWithResult + 79;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                Object[] objArr2 = {this.f$0, Float.valueOf(((Float) obj).floatValue())};
                int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                if (i8 != 0) {
                    return (Unit) CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1927998004, iOnWarmupCompleted, iOnWarmupCompleted2, objArr2, iOnWarmupCompleted3, 1927998019);
                }
                throw null;
            }
        }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)});
        int i6 = ICustomTabsServiceStub + 45;
        warmup = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 52 / 0;
        }
        return listListOf;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        toFlameGraphLine toflamegraphline = (toFlameGraphLine) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 115;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        toflamegraphline.access000.setProgress(fFloatValue);
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 35;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        CreditHomeActivity creditHomeActivity = (CreditHomeActivity) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = warmup + 113;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            creditHomeActivity.IEngagementSignalsCallback_Parcel().extraCallbackWithResult.setProgress(fFloatValue);
            Unit unit = Unit.INSTANCE;
            int i3 = warmup + 69;
            ICustomTabsServiceStub = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        creditHomeActivity.IEngagementSignalsCallback_Parcel().extraCallbackWithResult.setProgress(fFloatValue);
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ enableNebulaServiceInitOpt $creditBureauType;
        final /* synthetic */ toFlameGraphLine $targetView;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(enableNebulaServiceInitOpt enablenebulaserviceinitopt, toFlameGraphLine toflamegraphline, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$creditBureauType = enablenebulaserviceinitopt;
            this.$targetView = toflamegraphline;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 1;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 85 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = CreditHomeActivity.this.new onWarmupCompleted(this.$creditBureauType, this.$targetView, access13800Var);
            int i2 = onExtraCallback + 69;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 42 / 0;
            }
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            enableOverridePendingTransitionNew enableoverridependingtransitionnew;
            int iIntValue;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallback + 61;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                enableoverridependingtransitionnew = (enableOverridePendingTransitionNew) this.L$0;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                enableOverridePendingTransitionNew interfaceDescriptor = ((CreditHomeViewModel) CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -986076515, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{CreditHomeActivity.this}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 986076550)).getInterfaceDescriptor();
                if (interfaceDescriptor == null) {
                    return Unit.INSTANCE;
                }
                if (interfaceDescriptor.access000()) {
                    int i4 = IAuthTabCallback + 107;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        return Unit.INSTANCE;
                    }
                    Unit unit = Unit.INSTANCE;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                this.L$0 = interfaceDescriptor;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(300L, this) == objOnWarmupCompleted) {
                    int i5 = IAuthTabCallback + 117;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnWarmupCompleted;
                }
                enableoverridependingtransitionnew = interfaceDescriptor;
            }
            Integer numIAuthTabCallback = this.$creditBureauType == enableNebulaServiceInitOpt.KCB ? enableoverridependingtransitionnew.IAuthTabCallback() : enableoverridependingtransitionnew.IAuthTabCallbackDefault();
            this.$targetView.access100.setRollingDirection(TdsRollingNumberV1View.IAuthTabCallbackStubProxy.onExtraCallback.IAuthTabCallback);
            TdsRollingNumberV1View tdsRollingNumberV1View = this.$targetView.access100;
            Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View, "");
            TdsRollingNumberV1View.setSuffix$default(tdsRollingNumberV1View, "점", (response) null, (Integer) null, (Integer) null, false, 30, (Object) null);
            TdsRollingNumberV1View tdsRollingNumberV1View2 = this.$targetView.access100;
            Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View2, "");
            if (numIAuthTabCallback != null) {
                int i7 = onExtraCallback + 77;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                iIntValue = numIAuthTabCallback.intValue();
            } else {
                iIntValue = 0;
            }
            tdsRollingNumberV1View2.setNumber(iIntValue, true, TdsRollingNumberV1View.access000.IAuthTabCallback.onExtraCallbackWithResult.onExtraCallback, true);
            return Unit.INSTANCE;
        }
    }

    private static final Unit onExtraCallbackWithResult(toFlameGraphLine toflamegraphline, CreditHomeActivity creditHomeActivity, enableNebulaServiceInitOpt enablenebulaserviceinitopt) {
        int i = 2 % 2;
        TdsRollingNumberV1View tdsRollingNumberV1View = toflamegraphline.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View, "");
        TdsRollingNumberV1View.setSuffix$default(tdsRollingNumberV1View, "점", (response) null, (Integer) null, (Integer) null, false, 30, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(creditHomeActivity), (CoroutineContext) null, (setRandomHost) null, creditHomeActivity.new onWarmupCompleted(enablenebulaserviceinitopt, toflamegraphline, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsServiceStub + 115;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final runOnUiThreadDelayed onNavigationEvent(final enableNebulaServiceInitOpt enablenebulaserviceinitopt) {
        toFlameGraphLine toflamegraphline;
        LottieAnimationView lottieAnimationView;
        int i = 2 % 2;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        enableNebulaServiceInitOpt enablenebulaserviceinitopt2 = enableNebulaServiceInitOpt.KCB;
        checkInterval checkintervalIEngagementSignalsCallback_Parcel = IEngagementSignalsCallback_Parcel();
        if (enablenebulaserviceinitopt != enablenebulaserviceinitopt2) {
            toflamegraphline = checkintervalIEngagementSignalsCallback_Parcel.getInterfaceDescriptor;
        } else {
            int i2 = warmup + 67;
            ICustomTabsServiceStub = i2 % 128;
            int i3 = i2 % 2;
            toflamegraphline = checkintervalIEngagementSignalsCallback_Parcel.access100;
            int i4 = ICustomTabsServiceStub + 91;
            warmup = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 4;
            }
        }
        final toFlameGraphLine toflamegraphline2 = toflamegraphline;
        Intrinsics.checkNotNull(toflamegraphline2);
        Object obj = null;
        if (enablenebulaserviceinitopt == enablenebulaserviceinitopt2) {
            int i6 = warmup + 37;
            ICustomTabsServiceStub = i6 % 128;
            if (i6 % 2 != 0) {
                LottieAnimationView lottieAnimationView2 = IEngagementSignalsCallback_Parcel().IAuthTabCallbackStubProxy;
                obj.hashCode();
                throw null;
            }
            lottieAnimationView = IEngagementSignalsCallback_Parcel().IAuthTabCallbackStubProxy;
        } else {
            lottieAnimationView = IEngagementSignalsCallback_Parcel().IAuthTabCallback_Parcel;
        }
        final LottieAnimationView lottieAnimationView3 = lottieAnimationView;
        Intrinsics.checkNotNull(lottieAnimationView3);
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        deprecated_dns deprecated_dnsVarOnExtraCallbackWithResult = deprecated_certificatepinner.onExtraCallbackWithResult();
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        FrameLayout frameLayoutOnExtraCallbackWithResult = toflamegraphline2.readTypedObject.onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(frameLayoutOnExtraCallbackWithResult, "");
        Rally rallyOnWarmupCompleted = RallysKt.onWarmupCompleted(frameLayoutOnExtraCallbackWithResult, CollectionsKt.listOf(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.IAuthTabCallbackStub()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        FrameLayout frameLayoutOnExtraCallbackWithResult2 = toflamegraphline2.readTypedObject.onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(frameLayoutOnExtraCallbackWithResult2, "");
        Rally rallyOnWarmupCompleted2 = RallysKt.onWarmupCompleted(frameLayoutOnExtraCallbackWithResult2, CollectionsKt.listOf(isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.IAuthTabCallbackStub()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        LottieAnimationView lottieAnimationView4 = IEngagementSignalsCallback_Parcel().extraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView4, "");
        Rally rallyOnWarmupCompleted3 = RallysKt.onWarmupCompleted(lottieAnimationView4, CollectionsKt.listOf(new AppLovinSdkSettings[]{isMuted.asBinder(new AppLovinSdkSettings().onWarmupCompleted(new deprecated_dns(150.0d, 40.0d)), (Float) null, Float.valueOf(this.writeTypedObject), (Function1) null, 5, (Object) null), isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf2, (Function1) null, 5, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        LottieAnimationView lottieAnimationView5 = IEngagementSignalsCallback_Parcel().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView5, "");
        Rally rallyOnWarmupCompleted4 = RallysKt.onWarmupCompleted(lottieAnimationView5, CollectionsKt.listOf(isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, fValueOf2, (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        LottieAnimationView lottieAnimationView6 = toflamegraphline2.access000;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView6, "");
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{lottieAnimationView6, isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf2, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        LottieAnimationView lottieAnimationView7 = IEngagementSignalsCallback_Parcel().extraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView7, "");
        Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{lottieAnimationView7, isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, fValueOf2, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        TdsBadgeV1View tdsBadgeV1View = toflamegraphline2.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBadgeV1View, "");
        Rally rally3 = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsBadgeV1View, isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, fValueOf2, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        Typography5 typography5 = toflamegraphline2.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        Rally rallyOnWarmupCompleted5 = RallysKt.onWarmupCompleted(typography5, CollectionsKt.listOf(isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, fValueOf, (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 150, 0L, false, 1788, (Object) null);
        TdsRollingNumberV1View tdsRollingNumberV1View = toflamegraphline2.access100;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View, "");
        Rally rallyOnWarmupCompleted6 = RallysKt.onWarmupCompleted(tdsRollingNumberV1View, CollectionsKt.listOf(isMuted.getInterfaceDescriptor(isMuted.onNavigationEvent((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), 150}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), (Float) null, fValueOf, (Function1) null, 5, (Object) null), (Float) null, fValueOf2, (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        TdsRollingNumberV1View tdsRollingNumberV1View2 = toflamegraphline2.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View2, "");
        Rally rallyOnWarmupCompleted7 = RallysKt.onWarmupCompleted(tdsRollingNumberV1View2, CollectionsKt.listOf(isMuted.onNavigationEvent(isMuted.getInterfaceDescriptor((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), 150}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), (Float) null, fValueOf2, (Function1) null, 5, (Object) null), (Float) null, fValueOf2, (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        FrameLayout frameLayout = toflamegraphline2.IAuthTabCallbackStubProxy;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        Rally rallyOnWarmupCompleted8 = RallysKt.onWarmupCompleted(frameLayout, CollectionsKt.listOf(isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{new deprecated_dns(150.0d, 40.0d)}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf2, (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        FrameLayout frameLayout2 = toflamegraphline2.IAuthTabCallbackStubProxy;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
        Rally rallyOnWarmupCompleted9 = RallysKt.onWarmupCompleted(frameLayout2, CollectionsKt.listOf(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf2, (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        Typography7 typography7 = toflamegraphline2.asInterface;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        return runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rallyOnWarmupCompleted, rallyOnWarmupCompleted2, rallyOnWarmupCompleted3, rallyOnWarmupCompleted4, rally, rally2, rally3, rallyOnWarmupCompleted5, rallyOnWarmupCompleted6, rallyOnWarmupCompleted7, rallyOnWarmupCompleted8, rallyOnWarmupCompleted9, RallysKt.onWarmupCompleted(typography7, CollectionsKt.listOf(isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, fValueOf2, (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null)}), 0, (getExtraParameters) null, 0, deprecated_dnsVarOnExtraCallbackWithResult, (Integer) null, (Boolean) null, 0, 0L, false, 4025, (Object) null), (Object) null, new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda14
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i7 = 2 % 2;
                int i8 = onExtraCallbackWithResult + 101;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                Unit unitOnExtraCallback = CreditHomeActivity.onExtraCallback(toflamegraphline2, this, enablenebulaserviceinitopt);
                int i10 = onExtraCallbackWithResult + 9;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    return unitOnExtraCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 1, (Object) null), (Object) null, new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda15
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i7 = 2 % 2;
                int i8 = IAuthTabCallback + 27;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 == 0) {
                    CreditHomeActivity.onWarmupCompleted(lottieAnimationView3, this, toflamegraphline2);
                    throw null;
                }
                Unit unitOnWarmupCompleted = CreditHomeActivity.onWarmupCompleted(lottieAnimationView3, this, toflamegraphline2);
                int i9 = onNavigationEvent + 101;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 85 / 0;
                }
                return unitOnWarmupCompleted;
            }
        }, 1, (Object) null);
    }

    private static final Unit IAuthTabCallback(LottieAnimationView lottieAnimationView, CreditHomeActivity creditHomeActivity, toFlameGraphLine toflamegraphline) {
        int i = 2 % 2;
        int i2 = warmup + 123;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        lottieAnimationView.setVisibility(8);
        creditHomeActivity.IEngagementSignalsCallback_Parcel().extraCallbackWithResult.setVisibility(8);
        toflamegraphline.asInterface.setVisibility(8);
        toflamegraphline.IAuthTabCallbackStubProxy.setVisibility(8);
        TdsRollingNumberV1View tdsRollingNumberV1View = toflamegraphline.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View, "");
        TdsRollingNumberV1View.setSuffix$default(tdsRollingNumberV1View, "%", (response) null, (Integer) null, (Integer) null, false, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 43;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(final enableOverridePendingTransitionNew enableoverridependingtransitionnew, final enableNebulaServiceInitOpt enablenebulaserviceinitopt, enablePreloadClassOpt enablepreloadclassopt) throws Throwable {
        int iIntValue;
        int i = 2 % 2;
        IAuthTabCallback(true);
        checkInterval checkintervalIEngagementSignalsCallback_Parcel = IEngagementSignalsCallback_Parcel();
        Integer numOnTransact = enableoverridependingtransitionnew.onTransact();
        if (numOnTransact != null) {
            int i2 = ICustomTabsServiceStub + 23;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            iIntValue = numOnTransact.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numAsInterface = enableoverridependingtransitionnew.asInterface();
        onWarmupCompleted(enablepreloadclassopt, iIntValue, numAsInterface != null ? numAsInterface.intValue() : 0);
        Object obj = null;
        if (enablepreloadclassopt != enablePreloadClassOpt.KCB) {
            int i4 = warmup + 67;
            ICustomTabsServiceStub = i4 % 128;
            if (i4 % 2 != 0) {
                enablePreloadClassOpt enablepreloadclassopt2 = enablePreloadClassOpt.BOTH;
                obj.hashCode();
                throw null;
            }
            if (enablepreloadclassopt == enablePreloadClassOpt.BOTH) {
                AnimateText animateText = checkintervalIEngagementSignalsCallback_Parcel.access100.onTransact.IAuthTabCallback;
                Intrinsics.checkNotNull(animateText);
                Context context = animateText.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Configuration configuration = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                animateText.setTextColor(new getUrlokhttp(new access000(configuration)).receiveFile());
                response responseVar = response.Bold;
                Context context2 = animateText.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                Configuration configuration2 = context2.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                animateText.setStyle(11.0f, 1.2f, responseVar, new getUrlokhttp(new access100(configuration2)).receiveFile());
                Intrinsics.checkNotNullExpressionValue(animateText.getResources().getDisplayMetrics(), "");
                animateText.setMaxTextSize(varyMatches.onNavigationEvent(11, r8));
                String string = getString(im.toss.feature.credit.ui.history.R.string.score_format);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String str = String.format(string, Arrays.copyOf(new Object[]{String.valueOf((Integer) enableOverridePendingTransitionNew.onNavigationEvent(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -1984884629, 1984884629, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{enableoverridependingtransitionnew}))}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "");
                int iOnActivityLayout = animateText.onActivityLayout();
                Context context3 = animateText.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                Configuration configuration3 = context3.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration3, "");
                AnimateText.onWarmupCompleted(animateText, str, new setAuthenticatorokhttp.onNavigationEvent.onExtraCallback(iOnActivityLayout, new getUrlokhttp(new IAuthTabCallbackStubProxy(configuration3)).asBinder()), 0, true, (String) null, (AnimateText.onNavigationEvent) null, (Function0) null, (Function0) null, (Function0) null, 500, (Object) null);
                int i5 = warmup + 77;
                ICustomTabsServiceStub = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        if (enablepreloadclassopt == enablePreloadClassOpt.NICE || enablepreloadclassopt == enablePreloadClassOpt.BOTH) {
            AnimateText animateText2 = checkintervalIEngagementSignalsCallback_Parcel.getInterfaceDescriptor.onTransact.IAuthTabCallback;
            Intrinsics.checkNotNull(animateText2);
            Context context4 = animateText2.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            Configuration configuration4 = context4.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration4, "");
            animateText2.setTextColor(new getUrlokhttp(new getInterfaceDescriptor(configuration4)).receiveFile());
            response responseVar2 = response.Bold;
            Context context5 = animateText2.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            Configuration configuration5 = context5.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration5, "");
            animateText2.setStyle(11.0f, 1.2f, responseVar2, new getUrlokhttp(new IAuthTabCallback_Parcel(configuration5)).receiveFile());
            Intrinsics.checkNotNullExpressionValue(animateText2.getResources().getDisplayMetrics(), "");
            animateText2.setMaxTextSize(varyMatches.onNavigationEvent(11, r6));
            String string2 = getString(im.toss.feature.credit.ui.history.R.string.score_format);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String str2 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(enableoverridependingtransitionnew.IAuthTabCallbackStub())}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            int iOnActivityLayout2 = animateText2.onActivityLayout();
            Context context6 = animateText2.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            Configuration configuration6 = context6.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration6, "");
            AnimateText.onWarmupCompleted(animateText2, str2, new setAuthenticatorokhttp.onNavigationEvent.onExtraCallback(iOnActivityLayout2, new getUrlokhttp(new ICustomTabsCallback(configuration6)).asBinder()), 0, true, (String) null, (AnimateText.onNavigationEvent) null, (Function0) null, (Function0) null, (Function0) null, 500, (Object) null);
        }
        TdsBottomCtaV1View tdsBottomCtaV1View = checkintervalIEngagementSignalsCallback_Parcel.asBinder;
        if (enableoverridependingtransitionnew.readTypedObject()) {
            String string3 = getString(im.toss.features.credit.ui.R.string.credit_ui_main___5b7eeae809);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            tdsBottomCtaV1View.setTopDescription(string3);
            BaseTextView baseTextViewExtraCallbackWithResult = tdsBottomCtaV1View.extraCallbackWithResult();
            if (baseTextViewExtraCallbackWithResult != null) {
                Context context7 = baseTextViewExtraCallbackWithResult.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "");
                Configuration configuration7 = context7.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration7, "");
                baseTextViewExtraCallbackWithResult.setTextColor(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new extraCallback(configuration7))}, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
                baseTextViewExtraCallbackWithResult.setTextSize(2, 13.0f);
            }
        }
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        String string4 = getString(enableoverridependingtransitionnew.readTypedObject() ? im.toss.features.credit.ui.R.string.credit_ui_main___634ea41645 : im.toss.uikit.R.string.uikit_confirm);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string4, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj2) {
                int i7 = 2 % 2;
                int i8 = onExtraCallback + 119;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                Object[] objArr = {enableoverridependingtransitionnew, this, enablenebulaserviceinitopt, (View) obj2};
                Unit unit = (Unit) CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 2095381882, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -2095381852);
                int i10 = onExtraCallback + 47;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                return unit;
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        tdsBottomCtaV1View.asInterface().setEnabled(false);
        if (enableoverridependingtransitionnew.readTypedObject()) {
            int i7 = ICustomTabsServiceStub + 109;
            warmup = i7 % 128;
            if (i7 % 2 == 0) {
                enableoverridependingtransitionnew.access000();
                throw null;
            }
            if (enableoverridependingtransitionnew.access000()) {
                String string5 = getString(im.toss.feature.credit.ui.main.R.string.neo_close);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                tdsBottomCtaV1View.setSecondary(string5, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda3
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj2) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallbackWithResult + 71;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unitOnNavigationEvent = CreditHomeActivity.onNavigationEvent(this.f$0, enableoverridependingtransitionnew, enablenebulaserviceinitopt, (View) obj2);
                        int i11 = onExtraCallback + 1;
                        onExtraCallbackWithResult = i11 % 128;
                        if (i11 % 2 != 0) {
                            int i12 = 5 / 0;
                        }
                        return unitOnNavigationEvent;
                    }
                }, new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DARK, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 12, (DefaultConstructorMarker) null));
                ((TdsButtonV1View) TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{tdsBottomCtaV1View}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).setEnabled(false);
            } else {
                tdsBottomCtaV1View.setBottomButtonType(TdsTextButtonV0View.IAuthTabCallback.GREY);
                tdsBottomCtaV1View.setBottomButton(getString(im.toss.feature.credit.ui.main.R.string.neo_close), new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeActivity$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj2) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallbackWithResult + 31;
                        IAuthTabCallback = i9 % 128;
                        if (i9 % 2 == 0) {
                            CreditHomeActivity.onExtraCallbackWithResult(this.f$0, enableoverridependingtransitionnew, enablenebulaserviceinitopt, (View) obj2);
                            throw null;
                        }
                        Unit unitOnExtraCallbackWithResult = CreditHomeActivity.onExtraCallbackWithResult(this.f$0, enableoverridependingtransitionnew, enablenebulaserviceinitopt, (View) obj2);
                        int i10 = IAuthTabCallback + 43;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                });
            }
        }
        AnimateTop animateTop = checkintervalIEngagementSignalsCallback_Parcel.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(animateTop.getResources().getDisplayMetrics(), "");
        animateTop.setMaxTitleSize(varyMatches.onNavigationEvent(28, r2));
        Intrinsics.checkNotNullExpressionValue(animateTop.getResources().getDisplayMetrics(), "");
        animateTop.setMaxSubtitleSize(varyMatches.onNavigationEvent(22, r2));
        FrameLayout frameLayoutOnWarmupCompleted = IEngagementSignalsCallback_Parcel().onWarmupCompleted();
        Intrinsics.checkNotNullExpressionValue(frameLayoutOnWarmupCompleted, "");
        if (!frameLayoutOnWarmupCompleted.isLaidOut() || frameLayoutOnWarmupCompleted.isLayoutRequested()) {
            frameLayoutOnWarmupCompleted.addOnLayoutChangeListener(new IAuthTabCallbackDefault(enablepreloadclassopt));
            int i8 = warmup + 59;
            ICustomTabsServiceStub = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        int i10 = warmup + 35;
        ICustomTabsServiceStub = i10 % 128;
        int i11 = i10 % 2;
        onWarmupCompleted(this, enablepreloadclassopt);
    }

    private final void onNavigationEvent(enablePreloadClassOpt enablepreloadclassopt) {
        toFlameGraphLine toflamegraphline;
        int i = 2 % 2;
        checkInterval checkintervalIEngagementSignalsCallback_Parcel = IEngagementSignalsCallback_Parcel();
        int measuredWidth = checkintervalIEngagementSignalsCallback_Parcel.onWarmupCompleted().getMeasuredWidth();
        if (enablepreloadclassopt == enablePreloadClassOpt.KCB) {
            int i2 = ICustomTabsServiceStub + 123;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            toflamegraphline = checkintervalIEngagementSignalsCallback_Parcel.access100;
            int i4 = ICustomTabsServiceStub + 113;
            warmup = i4 % 128;
            int i5 = i4 % 2;
        } else {
            toflamegraphline = checkintervalIEngagementSignalsCallback_Parcel.getInterfaceDescriptor;
        }
        FrameLayout frameLayoutOnExtraCallback = toflamegraphline.onExtraCallback();
        Intrinsics.checkNotNull(frameLayoutOnExtraCallback);
        int top = frameLayoutOnExtraCallback.getTop();
        int measuredHeight = frameLayoutOnExtraCallback.getMeasuredHeight() / 2;
        int iIEngagementSignalsCallbackStubProxy = (int) ((IEngagementSignalsCallbackStubProxy() - frameLayoutOnExtraCallback.getTop()) * this.requestPostMessageChannel);
        LottieAnimationView lottieAnimationView = checkintervalIEngagementSignalsCallback_Parcel.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i6 = measuredWidth << 1;
        layoutParams.width = i6;
        layoutParams.height = -2;
        lottieAnimationView.setLayoutParams(layoutParams);
        LottieAnimationView lottieAnimationView2 = checkintervalIEngagementSignalsCallback_Parcel.onWarmupCompleted;
        float f = (-measuredWidth) / 2.0f;
        lottieAnimationView2.setX(f);
        lottieAnimationView2.setY((((top + measuredHeight) + iIEngagementSignalsCallbackStubProxy) - (ITrustedWebActivityCallback_Parcel() / 2.0f)) + (ITrustedWebActivityCallbackStubProxy() / 2.0f));
        LottieAnimationView lottieAnimationView3 = checkintervalIEngagementSignalsCallback_Parcel.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView3, "");
        ViewGroup.LayoutParams layoutParams2 = lottieAnimationView3.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i7 = warmup + 61;
        ICustomTabsServiceStub = i7 % 128;
        int i8 = i7 % 2;
        layoutParams2.width = i6;
        layoutParams2.height = -2;
        lottieAnimationView3.setLayoutParams(layoutParams2);
        LottieAnimationView lottieAnimationView4 = checkintervalIEngagementSignalsCallback_Parcel.IAuthTabCallback;
        lottieAnimationView4.setX(f);
        Intrinsics.checkNotNull(lottieAnimationView4);
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(lottieAnimationView4, (int) (ITrustedWebActivityCallbackStubProxy() * this.writeTypedObject));
        LottieAnimationView lottieAnimationView5 = checkintervalIEngagementSignalsCallback_Parcel.extraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView5, "");
        ViewGroup.LayoutParams layoutParams3 = lottieAnimationView5.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i9 = ICustomTabsServiceStub + 97;
        warmup = i9 % 128;
        int i10 = i9 % 2;
        M_ m_ = M_.onExtraCallback;
        int iMin = Math.min(m_.asInterface(), m_.IAuthTabCallbackDefault());
        layoutParams3.width = iMin;
        layoutParams3.height = iMin;
        lottieAnimationView5.setLayoutParams(layoutParams3);
        LottieAnimationView lottieAnimationView6 = checkintervalIEngagementSignalsCallback_Parcel.extraCallbackWithResult;
        Intrinsics.checkNotNull(lottieAnimationView6);
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(lottieAnimationView6, (int) (ITrustedWebActivityCallbackStubProxy() * 0.6d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c1, code lost:
    
        if (r9 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c3, code lost:
    
        r9 = (android.view.ViewGroup.MarginLayoutParams) r9;
        r9.topMargin = r13 + r14.onWarmupCompleted;
        r8.setLayoutParams(r9);
        r7 = r7.IEngagementSignalsCallback_Parcel().asBinder;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, "");
        r7.setPadding(r7.getPaddingLeft(), r7.getPaddingTop(), r7.getPaddingRight(), r10 + r14.onExtraCallback);
        r7 = im.toss.feature.credit.ui.main.home.CreditHomeActivity.warmup + 97;
        im.toss.feature.credit.ui.main.home.CreditHomeActivity.ICustomTabsServiceStub = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f1, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f9, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a9, code lost:
    
        if (r9 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final WindowInsetsCompat onWarmupCompleted(CreditHomeActivity creditHomeActivity, int i, int i2, int i3, int i4, int i5, int i6, View view, WindowInsetsCompat windowInsetsCompat) {
        TdsImageView tdsImageView;
        ViewGroup.LayoutParams layoutParams;
        int i7 = 2 % 2;
        int i8 = ICustomTabsServiceStub + 71;
        warmup = i8 % 128;
        int i9 = i8 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompat.onWarmupCompleted(forceInnerPermissionCheck.onExtraCallbackWithResult.onNavigationEvent());
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
        FrameLayout frameLayout = creditHomeActivity.IEngagementSignalsCallback_Parcel().extraCallback;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setPadding(frameLayout.getPaddingLeft(), i + cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        AppBarLayout appBarLayout = creditHomeActivity.IEngagementSignalsCallback_Parcel().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(appBarLayout, "");
        appBarLayout.setPadding(appBarLayout.getPaddingLeft(), i2 + cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted, appBarLayout.getPaddingRight(), appBarLayout.getPaddingBottom());
        AppBarLayout appBarLayout2 = creditHomeActivity.IEngagementSignalsCallback_Parcel().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(appBarLayout2, "");
        ViewGroup.LayoutParams layoutParams2 = appBarLayout2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i10 = warmup + 89;
        ICustomTabsServiceStub = i10 % 128;
        int i11 = i10 % 2;
        layoutParams2.height = i4 + cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted;
        appBarLayout2.setLayoutParams(layoutParams2);
        View view2 = creditHomeActivity.IEngagementSignalsCallback_Parcel().onActivityLayout;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i12 = ICustomTabsServiceStub + 3;
        warmup = i12 % 128;
        if (i12 % 2 == 0) {
            layoutParams3.height = i5 >> cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted;
            view2.setLayoutParams(layoutParams3);
            tdsImageView = creditHomeActivity.IEngagementSignalsCallback_Parcel().onMinimized;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            layoutParams = tdsImageView.getLayoutParams();
        } else {
            layoutParams3.height = i5 + cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted;
            view2.setLayoutParams(layoutParams3);
            tdsImageView = creditHomeActivity.IEngagementSignalsCallback_Parcel().onMinimized;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            layoutParams = tdsImageView.getLayoutParams();
        }
    }

    public static /* synthetic */ Unit onExtraCallback(CreditHomeActivity creditHomeActivity, switchJudgment switchjudgment, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 119655966, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity, switchjudgment, setDetectableSize}, iOnWarmupCompleted3, -119655934);
    }

    public static /* synthetic */ boolean onNavigationEvent(CreditHomeActivity creditHomeActivity) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Boolean) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1789878684, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity}, iOnWarmupCompleted3, -1789878677)).booleanValue();
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditHomeActivity creditHomeActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1860208070, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity, iEngagementSignalsCallbackDefault}, iOnWarmupCompleted3, 1860208098);
    }

    public static /* synthetic */ int IAuthTabCallbackStub(CreditHomeActivity creditHomeActivity) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Integer) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1776013329, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity}, iOnWarmupCompleted3, -1776013284)).intValue();
    }

    public static /* synthetic */ int asInterface(CreditHomeActivity creditHomeActivity) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Integer) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 782550647, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity}, iOnWarmupCompleted3, -782550609)).intValue();
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditHomeActivity creditHomeActivity, liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 122713429, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity, litetrackwatchdoghandlerthreadopt, setDetectableSize}, iOnWarmupCompleted3, -122713429);
    }

    public static /* synthetic */ void onWarmupCompleted(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew) throws Throwable {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -23419719, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity, enableoverridependingtransitionnew}, iOnWarmupCompleted3, 23419729);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(boolean z, ScoreDeltaInfo scoreDeltaInfo, String str, SetDetectableSize setDetectableSize) {
        Object[] objArr = {Boolean.valueOf(z), scoreDeltaInfo, str, setDetectableSize};
        return (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1351190312, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1351190294);
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(CreditHomeActivity creditHomeActivity) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 2059010559, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity}, iOnWarmupCompleted3, -2059010538);
    }

    public static /* synthetic */ Unit extraCallback(CreditHomeActivity creditHomeActivity) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1767247365, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity}, iOnWarmupCompleted3, -1767247362);
    }

    public static /* synthetic */ Unit onExtraCallback(liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt, CreditHomeActivity creditHomeActivity, DialogInterface dialogInterface) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1372894344, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{litetrackwatchdoghandlerthreadopt, creditHomeActivity, dialogInterface}, iOnWarmupCompleted3, -1372894297);
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditHomeActivity creditHomeActivity, float f) {
        Object[] objArr = {creditHomeActivity, Float.valueOf(f)};
        return (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1927998004, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1927998019);
    }

    public static /* synthetic */ WindowInsetsCompat onExtraCallbackWithResult(CreditHomeActivity creditHomeActivity, int i, int i2, int i3, int i4, int i5, int i6, View view, WindowInsetsCompat windowInsetsCompat) {
        Object[] objArr = {creditHomeActivity, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), view, windowInsetsCompat};
        return (WindowInsetsCompat) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 76334346, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -76334323);
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditHomeActivity creditHomeActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -801049774, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity, iEngagementSignalsCallbackDefault}, iOnWarmupCompleted3, 801049808);
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditHomeActivity creditHomeActivity, switchJudgment switchjudgment, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 577584397, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity, switchjudgment, setDetectableSize}, iOnWarmupCompleted3, -577584361);
    }

    public static /* synthetic */ Unit onWarmupCompleted(enableOverridePendingTransitionNew enableoverridependingtransitionnew, CreditHomeActivity creditHomeActivity, enableNebulaServiceInitOpt enablenebulaserviceinitopt, View view) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 2095381882, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{enableoverridependingtransitionnew, creditHomeActivity, enablenebulaserviceinitopt, view}, iOnWarmupCompleted3, -2095381852);
    }

    public static final /* synthetic */ CreditHomeViewModel onActivityLayout(CreditHomeActivity creditHomeActivity) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (CreditHomeViewModel) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -986076515, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity}, iOnWarmupCompleted3, 986076550);
    }

    public static final /* synthetic */ void onNavigationEvent(CreditHomeActivity creditHomeActivity, liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt) throws Throwable {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 329001923, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity, litetrackwatchdoghandlerthreadopt}, iOnWarmupCompleted3, -329001912);
    }

    public static final /* synthetic */ void onWarmupCompleted(CreditHomeActivity creditHomeActivity, getTime gettime) throws Throwable {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -503942773, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity, gettime}, iOnWarmupCompleted3, 503942777);
    }

    private static final int onRelationshipValidationResult(CreditHomeActivity creditHomeActivity) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Integer) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1188003075, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity}, iOnWarmupCompleted3, -1188003035)).intValue();
    }

    private static final int ICustomTabsCallback_Parcel(CreditHomeActivity creditHomeActivity) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Integer) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1640834940, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity}, iOnWarmupCompleted3, 1640834984)).intValue();
    }

    private final runOnUiThreadDelayed onExtraCallbackWithResult(enableNebulaServiceInitOpt enablenebulaserviceinitopt) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (runOnUiThreadDelayed) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1375461190, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{this, enablenebulaserviceinitopt}, iOnWarmupCompleted3, -1375461149);
    }

    private final runOnUiThreadDelayed IAuthTabCallback(enableNebulaServiceInitOpt enablenebulaserviceinitopt) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (runOnUiThreadDelayed) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1017811729, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{this, enablenebulaserviceinitopt}, iOnWarmupCompleted3, -1017811698);
    }

    private final List<Rally> onExtraCallbackWithResult(toFlameGraphLine toflamegraphline, enableOverridePendingTransitionNew enableoverridependingtransitionnew) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (List) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1000602071, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{this, toflamegraphline, enableoverridependingtransitionnew}, iOnWarmupCompleted3, -1000602028);
    }

    private static final Unit onWarmupCompleted(toFlameGraphLine toflamegraphline, float f) {
        Object[] objArr = {toflamegraphline, Float.valueOf(f)};
        return (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -902313627, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 902313629);
    }

    private static final Unit IAuthTabCallback(CreditHomeActivity creditHomeActivity, float f) {
        Object[] objArr = {creditHomeActivity, Float.valueOf(f)};
        return (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -660509935, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 660509947);
    }

    private final runOnUiThreadDelayed onWarmupCompleted(enableNebulaServiceInitOpt enablenebulaserviceinitopt) {
        return (runOnUiThreadDelayed) onNavigationEvent(zzho.onWarmupCompleted(), 864640163, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), zzho.onWarmupCompleted(), new Object[]{this, enablenebulaserviceinitopt}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 18761494, -864640141);
    }

    private final String IPostMessageService_Parcel() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (String) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1151292178, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{this}, iOnWarmupCompleted3, 1151292207);
    }

    private final runOnUiThreadDelayed onNavigationEvent(enableNebulaServiceInitOpt enablenebulaserviceinitopt, enablePreloadClassOpt enablepreloadclassopt, int i) {
        Object[] objArr = {this, enablenebulaserviceinitopt, enablepreloadclassopt, Integer.valueOf(i)};
        return (runOnUiThreadDelayed) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 896884779, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -896884778);
    }

    private final int getSmallIconId() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Integer) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1321291062, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{this}, iOnWarmupCompleted3, -1321291049)).intValue();
    }

    private final void onWarmupCompleted(CreditDualViewModel.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 495037728, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{this, onextracallbackwithresult}, iOnWarmupCompleted3, -495037719);
    }

    private static final Unit onExtraCallbackWithResult(CreditHomeActivity creditHomeActivity, liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 523720690, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity, litetrackwatchdoghandlerthreadopt, setDetectableSize}, iOnWarmupCompleted3, -523720648);
    }

    private static final Unit onNavigationEvent(enableOverridePendingTransitionNew enableoverridependingtransitionnew, CreditHomeActivity creditHomeActivity, enableNebulaServiceInitOpt enablenebulaserviceinitopt, View view) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1727907300, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{enableoverridependingtransitionnew, creditHomeActivity, enablenebulaserviceinitopt, view}, iOnWarmupCompleted3, 1727907346);
    }

    private static final Unit onWarmupCompleted(CreditHomeActivity creditHomeActivity, enableOverridePendingTransitionNew enableoverridependingtransitionnew, enableNebulaServiceInitOpt enablenebulaserviceinitopt, View view) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -286460562, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity, enableoverridependingtransitionnew, enablenebulaserviceinitopt, view}, iOnWarmupCompleted3, 286460582);
    }

    private static final void onNavigationEvent(CreditHomeActivity creditHomeActivity, View view) throws Throwable {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 772732079, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity, view}, iOnWarmupCompleted3, -772732073);
    }

    private static final void prefetch(CreditHomeActivity creditHomeActivity) throws Throwable {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1642812398, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity}, iOnWarmupCompleted3, 1642812447);
    }

    private static final boolean setEngagementSignalsCallback(CreditHomeActivity creditHomeActivity) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Boolean) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1797886763, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity}, iOnWarmupCompleted3, 1797886768)).booleanValue();
    }

    private static final Unit onExtraCallback(CreditHomeActivity creditHomeActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 857349904, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity, iEngagementSignalsCallbackDefault}, iOnWarmupCompleted3, -857349878);
    }

    private static final void onWarmupCompleted(CreditHomeActivity creditHomeActivity, String str, Bundle bundle) throws Throwable {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1200932416, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity, str, bundle}, iOnWarmupCompleted3, -1200932383);
    }

    private final void onExtraCallbackWithResult(boolean z) throws Throwable {
        Object[] objArr = {this, Boolean.valueOf(z)};
        onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1093073403, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1093073387);
    }

    private static final int AudioAttributesImplApi21Parcelizer() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Integer) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 920321322, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[0], iOnWarmupCompleted3, -920321283)).intValue();
    }

    private final void onWarmupCompleted(toFlameGraphLine toflamegraphline) throws Throwable {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1636837509, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{this, toflamegraphline}, iOnWarmupCompleted3, -1636837482);
    }

    private static final String ICustomTabsServiceStub(CreditHomeActivity creditHomeActivity) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (String) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -193314290, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity}, iOnWarmupCompleted3, 193314298);
    }

    private final void MediaBrowserCompatMediaItem() throws Throwable {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int length = 681384212 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132017736).substring(0, 4).length() + 39720355, 684715009, iOnWarmupCompleted, length, new Object[]{this}, iOnWarmupCompleted2, -684714961);
    }

    private final void MediaDescriptionCompat() throws Throwable {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -964744501, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{this}, iOnWarmupCompleted3, 964744515);
    }

    private static final Unit onWarmupCompleted(CreditHomeActivity creditHomeActivity, switchJudgment switchjudgment, getTypedExportedConstants gettypedexportedconstants, View view) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1713273442, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{creditHomeActivity, switchjudgment, gettypedexportedconstants, view}, iOnWarmupCompleted3, 1713273459);
    }

    private final void IAuthTabCallback(liteTrackWatchDogHandlerThreadOpt.access000 access000Var) throws Throwable {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1315580029, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{this, access000Var}, iOnWarmupCompleted3, 1315580066);
    }

    private final void onNavigationEvent(enableOverridePendingTransitionNew enableoverridependingtransitionnew) throws Throwable {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -276265100, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{this, enableoverridependingtransitionnew}, iOnWarmupCompleted3, 276265119);
    }

    private final void onExtraCallbackWithResult(int i, enablePreloadClassOpt enablepreloadclassopt) throws Throwable {
        Object[] objArr = {this, Integer.valueOf(i), enablepreloadclassopt};
        onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1681797648, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1681797624);
    }

    public final setFinalY IEngagementSignalsCallback() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (setFinalY) onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 602740871, iOnWarmupCompleted, iOnWarmupCompleted2, new Object[]{this}, iOnWarmupCompleted3, -602740846);
    }

    @Override // im.toss.feature.credit.ui.main.home.Hilt_CreditHomeActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 47;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        int i5 = warmup + 69;
        ICustomTabsServiceStub = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // im.toss.feature.credit.ui.main.home.Hilt_CreditHomeActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 115;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = ICustomTabsServiceStub + 31;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.feature.credit.ui.main.home.Hilt_CreditHomeActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 31;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            throw null;
        }
        int i4 = warmup + 41;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void ICustomTabsServiceStubProxy() {
        requestPostMessageChannelWithExtras = 5213450486434734698L;
        receiveFile = 478309096;
    }
}
