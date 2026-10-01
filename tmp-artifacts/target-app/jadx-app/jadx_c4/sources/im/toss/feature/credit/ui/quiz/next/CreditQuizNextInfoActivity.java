package im.toss.feature.credit.ui.quiz.next;

import android.content.Context;
import android.content.Intent;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import com.google.android.gms.internal.ads.zziea;
import im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity$;
import im.toss.features.credit.ui.quiz.R;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.teens.cvscash.CvsCashTransactionActivity$;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import im.toss.tds.compose.foundation.anim.rally.Rally;
import im.toss.tds.compose.foundation.anim.rally.RallyKt;
import im.toss.tds.compose.foundation.anim.rally.RallyModifierKt;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AppLovinAdImpl;
import o.AppLovinNativeAdImplc;
import o.AppLovinPostbackService;
import o.AppLovinSdkSettings;
import o.AppLovinStarRatingView;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.AuthenticatorCompanion;
import o.AuthenticatorCompanionAuthenticatorNone;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BrickModulePackageExternalSyntheticLambda0;
import o.Cache;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraProviderInitRetryPolicy1;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.DefaultSurfaceProcessorExternalSyntheticLambda10;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.FocusMeteringControlExternalSyntheticLambda3;
import o.ForwardingCameraControl;
import o.HighSpeedResolverExternalSyntheticLambda1;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.ImageCapturePixelHDRPlusQuirk;
import o.LowLightBoostControlExternalSyntheticLambda0;
import o.LowLightBoostControlExternalSyntheticLambda1;
import o.MaxAdViewAdapterListener;
import o.MaxRewardedInterstitialAdapter;
import o.MeteringRepeatingSessionExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SessionTrackera;
import o.SessionTrackerb;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.accessgetSourcePresenceObservablep;
import o.authenticate;
import o.bindChildren;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.clearValueCallback;
import o.component5;
import o.createCameraCaptureCallback;
import o.enableLoopMonitor;
import o.findResAndMsg;
import o.getAwbState;
import o.getBacktraceNote;
import o.getDummyAd;
import o.getHostnameVerifierokhttp;
import o.getHumanReadableName;
import o.getOriginalFullResponse;
import o.h5ScreenShotObserverOnChangeOpt;
import o.immediateFailedFuture;
import o.isRepeatingEnabled;
import o.isShowTransAnimate;
import o.isZslDisabledByByUserCaseConfig;
import o.mExternalSyntheticApiModelOutline1;
import o.maybeUpdateAnimatable;
import o.onPageLoadError;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambdaDml5dirzRCENiZicd2_b5Xg5o;
import o.r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0;
import o.r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE;
import o.requestPostMessageChannelWithExtras;
import o.resolveQuirkNames;
import o.setAdVideoPlaybackListener;
import o.setCallToAction;
import o.setHasShown;
import o.setRandomHost;
import o.setThreadList;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import o.u1;
import o.u2;
import o.u4;
import o.use;
import o.varyMatches;
import o.y1hExternalSyntheticLambda0;
import o.y3ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditQuizNextInfoActivity extends Hilt_CreditQuizNextInfoActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static char[] IAuthTabCallbackDefault = null;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 1;
    public static final int asInterface;
    private static int getInterfaceDescriptor;
    private static int onTransact;

    @Inject
    public r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE agreedToAllRequiredTermsUseCase;

    @Inject
    public getDummyAd termsIntent;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity$$ExternalSyntheticLambda9
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr = {this.f$0};
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object[] objArr2 = {this.f$0};
            String str = (String) CreditQuizNextInfoActivity.IAuthTabCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), objArr2, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 249399723, -249399721);
            int i3 = IAuthTabCallback + 57;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }
    });
    private final SessionTrackera asBinder = AppLovinAdImpl.IAuthTabCallback(this, new Function1() { // from class: im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity$$ExternalSyntheticLambda10
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            CreditQuizNextInfoActivity creditQuizNextInfoActivity = this.f$0;
            r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse = (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj;
            if (i3 == 0) {
                return CreditQuizNextInfoActivity.onWarmupCompleted(creditQuizNextInfoActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
            }
            CreditQuizNextInfoActivity.onWarmupCompleted(creditQuizNextInfoActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
            throw null;
        }
    });

    static {
        validateRelationship();
        Companion = new onNavigationEvent(null);
        asInterface = 8;
        int i = IAuthTabCallback_Parcel + 39;
        getInterfaceDescriptor = i % 128;
        if (i % 2 != 0) {
            int i2 = 9 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        Object obj;
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = i2 | i9;
        int i11 = (~(i7 | i2)) | i9 | (~(i8 | i2));
        int i12 = ~((~i2) | i6 | i5);
        int i13 = i6 + i5 + i + ((-2027816600) * i3) + ((-1234684791) * i4);
        int i14 = i13 * i13;
        int i15 = ((i6 * 572746074) - 905264446) + (i5 * 572746074) + (i10 * (-489)) + (i11 * (-489)) + (i12 * 489) + (572745585 * i) + (982511336 * i3) + ((-774025351) * i4) + (i14 * 1257177088);
        switch ((i6 * (-132237830)) + 1711013888 + ((-132237830) * i5) + (i10 * 228444679) + (228444679 * i11) + ((-228444679) * i12) + (96206848 * i) + (811597824 * i3) + (1100742656 * i4) + (1751056384 * i14) + (i15 * i15 * 1874919424)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                boolean z = false;
                final CreditQuizNextInfoActivity creditQuizNextInfoActivity = (CreditQuizNextInfoActivity) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i16 = 2 % 2;
                if ((iIntValue & 3) != 2) {
                    int i17 = onTransact + 53;
                    IAuthTabCallbackStubProxy = i17 % 128;
                    if (i17 % 2 != 0) {
                        z = true;
                    }
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i18 = IAuthTabCallbackStubProxy + 31;
                        onTransact = i18 % 128;
                        int i19 = i18 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1736997232, iIntValue, -1, "im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CreditQuizNextInfoActivity.kt:127)");
                    }
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditQuizNextInfoActivity);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnExtraCallback) {
                        Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity$$ExternalSyntheticLambda11
                            private static int onExtraCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke() throws Throwable {
                                int i20 = 2 % 2;
                                int i21 = onNavigationEvent + 21;
                                onExtraCallback = i21 % 128;
                                int i22 = i21 % 2;
                                Unit unitOnExtraCallback = CreditQuizNextInfoActivity.onExtraCallback(this.f$0);
                                int i23 = onNavigationEvent + 119;
                                onExtraCallback = i23 % 128;
                                int i24 = i23 % 2;
                                return unitOnExtraCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                        obj = function0;
                        MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 254);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            int i20 = IAuthTabCallbackStubProxy + 121;
                            onTransact = i20 % 128;
                            if (i20 % 2 != 0) {
                                int i21 = 5 % 5;
                            }
                        }
                    } else {
                        obj = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        }
                        MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 254);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return asInterface(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CreditQuizNextInfoActivity creditQuizNextInfoActivity = (CreditQuizNextInfoActivity) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(creditQuizNextInfoActivity, str, str2, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        int i3 = 93 / 0;
        return onExtraCallbackWithResult(creditQuizNextInfoActivity, str, str2, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
    }

    public static /* synthetic */ List IAuthTabCallback(AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone, int i, Rally rally) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 65;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        List listOnWarmupCompleted = onWarmupCompleted(authenticatorCompanionAuthenticatorNone, i, rally);
        int i5 = IAuthTabCallbackStubProxy + 117;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return listOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditQuizNextInfoActivity creditQuizNextInfoActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(creditQuizNextInfoActivity);
        int i4 = onTransact + 95;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditQuizNextInfoActivity creditQuizNextInfoActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(creditQuizNextInfoActivity);
        if (i3 != 0) {
            int i4 = 21 / 0;
        }
        int i5 = onTransact + 69;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        throw null;
    }

    private static final Unit onExtraCallback(CreditQuizNextInfoActivity creditQuizNextInfoActivity, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, String str, String str2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 29;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        creditQuizNextInfoActivity.IAuthTabCallback(deviceQuirksExternalSyntheticLambda0, str, str2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackStubProxy + 89;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(Rally rally, boolean z, CreditQuizNextInfoActivity creditQuizNextInfoActivity, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 11;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            IAuthTabCallback(rally, z, creditQuizNextInfoActivity, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(rally, z, creditQuizNextInfoActivity, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackStubProxy + 93;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditQuizNextInfoActivity creditQuizNextInfoActivity, String str, String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 7;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return onWarmupCompleted(creditQuizNextInfoActivity, str, str2, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(creditQuizNextInfoActivity, str, str2, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditQuizNextInfoActivity creditQuizNextInfoActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 11;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return (Unit) IAuthTabCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{creditQuizNextInfoActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1685623451, 1685623455);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditQuizNextInfoActivity creditQuizNextInfoActivity, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, String str, String str2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 75;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            onExtraCallback(creditQuizNextInfoActivity, deviceQuirksExternalSyntheticLambda0, str, str2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(creditQuizNextInfoActivity, deviceQuirksExternalSyntheticLambda0, str, str2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onTransact + 125;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CreditQuizNextInfoActivity creditQuizNextInfoActivity = (CreditQuizNextInfoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackDefault = IAuthTabCallbackDefault(creditQuizNextInfoActivity);
        int i4 = onTransact + 77;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreditQuizNextInfoActivity creditQuizNextInfoActivity = (CreditQuizNextInfoActivity) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(creditQuizNextInfoActivity, str, str2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        int i5 = onTransact + 49;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ List onWarmupCompleted(Rally rally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {rally};
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        if (i3 != 0) {
            throw null;
        }
        List list = (List) IAuthTabCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted, objArr, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 528195293, -528195293);
        int i4 = onTransact + 107;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditQuizNextInfoActivity creditQuizNextInfoActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
            return (Unit) IAuthTabCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{creditQuizNextInfoActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 93701234, -93701233);
        }
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CreditQuizNextInfoActivity creditQuizNextInfoActivity, String str, String str2, enableLoopMonitor enableloopmonitor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 17;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(deviceQuirksExternalSyntheticLambda0, creditQuizNextInfoActivity, str, str2, enableloopmonitor, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 19;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return -1L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ SessionTrackera onExtraCallbackWithResult(CreditQuizNextInfoActivity creditQuizNextInfoActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 17;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        SessionTrackera sessionTrackera = creditQuizNextInfoActivity.asBinder;
        int i5 = i2 + 41;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return sessionTrackera;
    }

    public final SessionTrackerb setEngagementSignalsCallback() {
        int i = 2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            int i2 = onTransact + 95;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 57 / 0;
            }
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = onTransact + 19;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final getDummyAd IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        getDummyAd getdummyad = this.termsIntent;
        if (getdummyad != null) {
            return getdummyad;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = onTransact + 9;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return null;
    }

    public static final class onNavigationEvent {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static long onExtraCallbackWithResult = -8965490690014906342L;
        private static int onNavigationEvent = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x0234  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0235  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            Object obj;
            Throwable cause;
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (true) {
                obj = null;
                if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                    break;
                }
                int i3 = $10 + 15;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24, Process.getGidForName("") + 19628, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() - (5407414049857832247L & onExtraCallbackWithResult);
                        try {
                            Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 59 - View.MeasureSpec.makeMeasureSpec(0, 0), 6383 - View.resolveSizeAndState(0, 0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback2).invoke(null, objArr3);
                        } catch (Throwable th) {
                            cause = th.getCause();
                            if (cause != null) {
                            }
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0')), 23 - TextUtils.lastIndexOf("", '0'), 19627 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (5407414049857832247L ^ onExtraCallbackWithResult);
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 59, 6383 - (Process.myPid() >> 22), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i6 = $10 + 61;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 / 5;
            }
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i8 = $10 + 77;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), TextUtils.indexOf("", "") + 59, 6383 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    obj.hashCode();
                    throw null;
                }
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr7 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 59 - KeyEvent.keyCodeFromString(""), 6383 - ((Process.getThreadPriority(0) + 20) >> 6), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
            String str = new String(cArr2);
            int i9 = $10 + 53;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            objArr[0] = str;
        }

        private onNavigationEvent() {
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) CreditQuizNextInfoActivity.class);
            Object[] objArr = new Object[1];
            a(new char[]{32095, 2025, 34825, 4779, 38875, 6266, 41614, 10040}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31392, objArr);
            intent.putExtra(((String) objArr[0]).intern(), str);
            intent.putExtra("EXTRA_QUIZ_NEXT_INFO_TITLE", str2);
            intent.putExtra("EXTRA_QUIZ_NEXT_INFO_MESSAGE", str3);
            intent.putExtra("EXTRA_QUIZ_NEXT_INFO_MY_PAGE_SCHEME", str4);
            int i2 = IAuthTabCallback + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return intent;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i = 2 % 2;
        r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE r8lambdackpzfvkcnb19lbykxqj6b3xvcwe = ((CreditQuizNextInfoActivity) objArr[0]).agreedToAllRequiredTermsUseCase;
        Object obj = null;
        if (r8lambdackpzfvkcnb19lbykxqj6b3xvcwe == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = IAuthTabCallbackStubProxy + 79;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = IAuthTabCallbackStubProxy + 43;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return r8lambdackpzfvkcnb19lbykxqj6b3xvcwe;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String IAuthTabCallbackDefault(CreditQuizNextInfoActivity creditQuizNextInfoActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = creditQuizNextInfoActivity.getIntent();
        if (i3 == 0) {
            int i4 = 37 / 0;
            if (intent == null) {
                return "";
            }
        } else if (intent == null) {
            return "";
        }
        String stringExtra = intent.getStringExtra("EXTRA_QUIZ_NEXT_INFO_MY_PAGE_SCHEME");
        if (stringExtra == null) {
            return "";
        }
        int i5 = onTransact + 23;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
        return stringExtra;
    }

    private final String updateVisuals() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.IAuthTabCallbackStub.getValue();
        int i4 = IAuthTabCallbackStubProxy + 93;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, im.toss.base.BaseActivity, im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        ?? r1 = (CreditQuizNextInfoActivity) objArr[0];
        r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse = (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
            int i3 = 10 / 0;
            if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult() == r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_COMPLETED_MESSAGE) {
                int i4 = IAuthTabCallbackStubProxy + 23;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                TdsToastV1.onWarmupCompleted onwarmupcompleted = TdsToastV1.Companion;
                String string = r1.getString(R.string.credit_quiz_alaram_terms_agreed);
                Intrinsics.checkNotNullExpressionValue(string, "");
                TdsToastV1.onNavigationEvent onNavigationEvent2 = TdsToastV1.onNavigationEvent.onNavigationEvent(isShowTransAnimate.onWarmupCompleted(onwarmupcompleted, string), viva.republica.toss.R.drawable.icn_success_color, 0, 2, (Object) null);
                DisplayMetrics displayMetrics = r1.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                BrickModulePackageExternalSyntheticLambda0.onExtraCallbackWithResult(onNavigationEvent2.IAuthTabCallback(varyMatches.onNavigationEvent(90, displayMetrics)), 500, (Integer) null, 0, 6, (Object) null);
                int i6 = IAuthTabCallbackStubProxy + 51;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
            if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult() == r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_COMPLETED_MESSAGE) {
            }
        }
        r1.ICustomTabsServiceStub();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r5
      0x0027: PHI (r5v2 android.content.Intent) = (r5v1 android.content.Intent), (r5v12 android.content.Intent) binds: [B:8:0x0025, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // im.toss.feature.credit.ui.quiz.next.Hilt_CreditQuizNextInfoActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        Intent intent;
        String stringExtra;
        String stringExtra2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 87;
        onTransact = i2 % 128;
        String str = "";
        if (i2 % 2 != 0) {
            super.onCreate(bundle);
            intent = getIntent();
            int i3 = 29 / 0;
            if (intent != null) {
                int i4 = IAuthTabCallbackStubProxy + 115;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                stringExtra = intent.getStringExtra("EXTRA_QUIZ_NEXT_INFO_TITLE");
                if (stringExtra == null) {
                    stringExtra = "";
                }
            }
        } else {
            super.onCreate(bundle);
            intent = getIntent();
            if (intent != null) {
            }
        }
        Intent intent2 = getIntent();
        if (intent2 != null && (stringExtra2 = intent2.getStringExtra("EXTRA_QUIZ_NEXT_INFO_MESSAGE")) != null) {
            str = stringExtra2;
        }
        Object obj = null;
        if (!StringsKt.isBlank(stringExtra)) {
            requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-2053037156, true, new CreditQuizNextInfoActivity$.ExternalSyntheticLambda3(this, stringExtra, str))), 1, (Object) null);
            return;
        }
        ICustomTabsServiceStub();
        int i6 = IAuthTabCallbackStubProxy + 117;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(CreditQuizNextInfoActivity creditQuizNextInfoActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        creditQuizNextInfoActivity.bg_();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 69;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(CreditQuizNextInfoActivity creditQuizNextInfoActivity, String str, String str2, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
                int i5 = onTransact + 23;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i7 = onTransact + 77;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(942935261, i2, -1, "im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CreditQuizNextInfoActivity.kt:131)");
            }
            creditQuizNextInfoActivity.IAuthTabCallback(deviceQuirksExternalSyntheticLambda0, str, str2, cameraCaptureResultEmptyCameraCaptureResult, i2 & 14);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i9 = onTransact + 59;
                IAuthTabCallbackStubProxy = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i11 = onTransact + 123;
                IAuthTabCallbackStubProxy = i11 % 128;
                int i12 = i11 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(final CreditQuizNextInfoActivity creditQuizNextInfoActivity, final String str, final String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1))) {
            int i3 = IAuthTabCallbackStubProxy + 3;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onTransact + 97;
                IAuthTabCallbackStubProxy = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1169347908, i, -1, "im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity.onCreate.<anonymous>.<anonymous> (CreditQuizNextInfoActivity.kt:123)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1169347908, i, -1, "im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity.onCreate.<anonymous>.<anonymous> (CreditQuizNextInfoActivity.kt:123)");
            }
            clearValueCallback.onWarmupCompleted(new Object[]{ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), null, ForwardingCameraControl.onExtraCallback(1736997232, true, new Function2() { // from class: im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity$$ExternalSyntheticLambda6
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 57;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    CreditQuizNextInfoActivity creditQuizNextInfoActivity2 = this.f$0;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                    if (i8 == 0) {
                        return CreditQuizNextInfoActivity.onExtraCallbackWithResult(creditQuizNextInfoActivity2, cameraCaptureResultEmptyCameraCaptureResult2, ((Integer) obj3).intValue());
                    }
                    CreditQuizNextInfoActivity.onExtraCallbackWithResult(creditQuizNextInfoActivity2, cameraCaptureResultEmptyCameraCaptureResult2, ((Integer) obj3).intValue());
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), false, null, null, null, 0, false, 0L, 0L, ForwardingCameraControl.onExtraCallback(942935261, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity$$ExternalSyntheticLambda7
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i6 = 2 % 2;
                    int i7 = IAuthTabCallback + 95;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    Object[] objArr = {this.f$0, str, str2, (DeviceQuirksExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
                    Unit unit = (Unit) CreditQuizNextInfoActivity.IAuthTabCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), objArr, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 823238920, -823238915);
                    int i9 = IAuthTabCallback + 101;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    return unit;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 390, 48, 2042}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -274372088, zziea.IAuthTabCallback(), 274372088, zziea.IAuthTabCallback());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(CreditQuizNextInfoActivity creditQuizNextInfoActivity, String str, String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = onTransact + 107;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = IAuthTabCallbackStubProxy + 113;
                onTransact = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2053037156, i, -1, "im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity.onCreate.<anonymous> (CreditQuizNextInfoActivity.kt:122)");
                    int i6 = 49 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2053037156, i, -1, "im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity.onCreate.<anonymous> (CreditQuizNextInfoActivity.kt:122)");
                }
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1169347908, true, new CreditQuizNextInfoActivity$.ExternalSyntheticLambda8(creditQuizNextInfoActivity, str, str2), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallbackStubProxy + 87;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i9 = onTransact + 103;
            IAuthTabCallbackStubProxy = i9 % 128;
            int i10 = i9 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Rally rally = (Rally) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rally, "");
        List listListOf = CollectionsKt.listOf((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, Cache.UP, AuthenticatorCompanionAuthenticatorNone.FAST, false, (Function1) null, 24, (Object) null), 1000}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()));
        int i4 = IAuthTabCallbackStubProxy + 81;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return listListOf;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Rally $lottieRally;
        final /* synthetic */ Rally $messageFadeRally;
        final /* synthetic */ Rally $slideRally;
        final /* synthetic */ Rally $titleFadeRally;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Rally rally, Rally rally2, Rally rally3, Rally rally4, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$lottieRally = rally;
            this.$titleFadeRally = rally2;
            this.$messageFadeRally = rally3;
            this.$slideRally = rally4;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$lottieRally, this.$titleFadeRally, this.$messageFadeRally, this.$slideRally, access13800Var);
            int i2 = onNavigationEvent + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 61;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onextracallbackCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(unit);
            int i4 = onNavigationEvent + 121;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
        
            im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity.onExtraCallback.onWarmupCompleted = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
        
            if ((!r1.hasNext()) == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
        
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            o.isFireOS.onExtraCallbackWithResult((im.toss.tds.compose.foundation.anim.rally.Rally) r1.next(), false, 1, (java.lang.Object) null);
            r3 = im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity.onExtraCallback.onNavigationEvent + 93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r6.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r6.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r7);
            r1 = kotlin.collections.CollectionsKt.listOf(new im.toss.tds.compose.foundation.anim.rally.Rally[]{r6.$lottieRally, r6.$titleFadeRally, r6.$messageFadeRally, r6.$slideRally}).iterator();
            r3 = im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity.onExtraCallback.onNavigationEvent + 89;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 19 / 0;
            }
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<accessgetSourcePresenceObservablep<Boolean>, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = CreditQuizNextInfoActivity.this.new IAuthTabCallback(access13800Var);
            iAuthTabCallback.L$0 = obj;
            int i2 = onWarmupCompleted + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i2 % 128;
            accessgetSourcePresenceObservablep<Boolean> accessgetsourcepresenceobservablep = (accessgetSourcePresenceObservablep) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(accessgetsourcepresenceobservablep, access13800Var);
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(accessgetsourcepresenceobservablep, access13800Var);
            int i3 = 82 / 0;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(accessgetSourcePresenceObservablep<Boolean> accessgetsourcepresenceobservablep, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(accessgetsourcepresenceobservablep, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                iAuthTabCallbackCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallbackCreate.invokeSuspend(unit);
            int i4 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnNavigationEvent;
            int i = 2 % 2;
            accessgetSourcePresenceObservablep accessgetsourcepresenceobservablep = (accessgetSourcePresenceObservablep) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {CreditQuizNextInfoActivity.this};
                r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE r8lambdackpzfvkcnb19lbykxqj6b3xvcwe = (r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE) CreditQuizNextInfoActivity.IAuthTabCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), objArr, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1492607128, -1492607122);
                this.L$0 = access15400.onNavigationEvent(accessgetsourcepresenceobservablep);
                this.L$1 = accessgetsourcepresenceobservablep;
                this.label = 1;
                objOnNavigationEvent = r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE.onNavigationEvent(r8lambdackpzfvkcnb19lbykxqj6b3xvcwe, "STD_1439_CREDITQUIZ_NOTIFICATION", false, this, 2, (Object) null);
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                accessgetsourcepresenceobservablep = (accessgetSourcePresenceObservablep) this.L$1;
                ResultKt.onNavigationEvent(obj);
                objOnNavigationEvent = ((Result) obj).onNavigationEvent();
            }
            Boolean boolOnNavigationEvent = access14000.onNavigationEvent(false);
            if (Result.onExtraCallback(objOnNavigationEvent)) {
                int i3 = onExtraCallbackWithResult + 117;
                int i4 = i3 % 128;
                onWarmupCompleted = i4;
                if (i3 % 2 == 0) {
                    int i5 = 61 / 0;
                }
                int i6 = i4 + 67;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                objOnNavigationEvent = boolOnNavigationEvent;
            }
            accessgetsourcepresenceobservablep.IAuthTabCallback(objOnNavigationEvent);
            return Unit.INSTANCE;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr3 = IAuthTabCallbackDefault;
        if (cArr3 != null) {
            int i8 = $10 + 83;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i9 = $10 + 75;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - TextUtils.indexOf("", "", 0)), 35 - TextUtils.getOffsetBefore("", 0), View.resolveSizeAndState(0, 0, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i2++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr3, i4, cArr4, 0, i5);
        if (bArr != null) {
            char[] cArr5 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 10935), ((byte) KeyEvent.getModifierMetaStateMask()) + 66, KeyEvent.getDeadChar(0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 28 - MotionEvent.axisFromString(""), 17657 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 49468), 70 - KeyEvent.getDeadChar(0, 0), 12486 - View.combineMeasuredStates(0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr4 = cArr5;
        }
        if (i7 > 0) {
            char[] cArr6 = new char[i5];
            System.arraycopy(cArr4, 0, cArr6, 0, i5);
            int i13 = i5 - i7;
            System.arraycopy(cArr6, 0, cArr4, i13, i7);
            System.arraycopy(cArr6, i7, cArr4, 0, i13);
        }
        if (z) {
            int i14 = $10 + 67;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            int i15 = $11 + 57;
            $10 = i15 % 128;
            i = 2;
            int i16 = i15 % 2;
            cArr4 = cArr;
        } else {
            i = 2;
        }
        if (i6 > 0) {
            int i17 = $10 + 105;
            $11 = i17 % 128;
            int i18 = i17 % i;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[i]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private static final Unit onNavigationEvent(CreditQuizNextInfoActivity creditQuizNextInfoActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        creditQuizNextInfoActivity.ICustomTabsServiceDefault();
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 19;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(Rally rally, boolean z, final CreditQuizNextInfoActivity creditQuizNextInfoActivity, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        boolean z2 = true;
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ^ true ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i5 = onTransact + 31;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2045753050, i2, -1, "im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity.Content.<anonymous>.<anonymous>.<anonymous> (CreditQuizNextInfoActivity.kt:220)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = RallyModifierKt.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, rally, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 2);
            if (z) {
                int i7 = IAuthTabCallbackStubProxy + 83;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                i3 = im.toss.uikit.R.string.uikit_confirm;
            } else {
                i3 = viva.republica.toss.R.string.next;
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(i3, cameraCaptureResultEmptyCameraCaptureResult, 0);
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Primary;
            setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Fill;
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult();
            setCallToAction.onNavigationEvent onnavigationevent = setCallToAction.onNavigationEvent.Block;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditQuizNextInfoActivity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                int i9 = onTransact + 111;
                IAuthTabCallbackStubProxy = i9 % 128;
                int i10 = i9 % 2;
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity$$ExternalSyntheticLambda12
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke() {
                            int i11 = 2 % 2;
                            int i12 = onExtraCallbackWithResult + 25;
                            IAuthTabCallback = i12 % 128;
                            int i13 = i12 % 2;
                            Unit unitIAuthTabCallback = CreditQuizNextInfoActivity.IAuthTabCallback(this.f$0);
                            int i14 = onExtraCallbackWithResult + 93;
                            IAuthTabCallback = i14 % 128;
                            int i15 = i14 % 2;
                            return unitIAuthTabCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                    obj = function0;
                }
                u4Var.onNavigationEvent(strOnExtraCallback, quirksExternalSyntheticBackport0IAuthTabCallback, (Function0) null, (Function0) obj, onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i2 & 14, 772);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x04bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, final CreditQuizNextInfoActivity creditQuizNextInfoActivity, String str, String str2, enableLoopMonitor enableloopmonitor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        Object objOnMinimized;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted;
        boolean zOnNavigationEvent;
        boolean zOnNavigationEvent2;
        boolean zOnNavigationEvent3;
        boolean zOnNavigationEvent4;
        boolean zOnExtraCallback;
        Object objOnMinimized2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(enableloopmonitor, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = onTransact + 115;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 39 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1595659549, i, -1, "im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity.Content.<anonymous> (CreditQuizNextInfoActivity.kt:142)");
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, deviceQuirksExternalSyntheticLambda0);
                FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                Rally rallyOnExtraCallback = creditQuizNextInfoActivity.onExtraCallback(100, AuthenticatorCompanionAuthenticatorNone.FAST, cameraCaptureResultEmptyCameraCaptureResult, 54);
                AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone = AuthenticatorCompanionAuthenticatorNone.SLOW;
                Rally rallyOnExtraCallback2 = creditQuizNextInfoActivity.onExtraCallback(300, authenticatorCompanionAuthenticatorNone, cameraCaptureResultEmptyCameraCaptureResult, 54);
                Rally rallyOnExtraCallback3 = creditQuizNextInfoActivity.onExtraCallback(500, authenticatorCompanionAuthenticatorNone, cameraCaptureResultEmptyCameraCaptureResult, 54);
                Boolean bool = Boolean.FALSE;
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity$$ExternalSyntheticLambda0
                        private static int onExtraCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj) {
                            int i5 = 2 % 2;
                            int i6 = onExtraCallback + 117;
                            onWarmupCompleted = i6 % 128;
                            int i7 = i6 % 2;
                            List listOnWarmupCompleted = CreditQuizNextInfoActivity.onWarmupCompleted((Rally) obj);
                            int i8 = onWarmupCompleted + 21;
                            onExtraCallback = i8 % 128;
                            if (i8 % 2 == 0) {
                                return listOnWarmupCompleted;
                            }
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                final Rally rally = (Rally) RallyKt.IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 515399683, -515399667, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), new Object[]{1, null, 0, null, null, 0, bool, null, null, null, null, null, null, null, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 1572870, 24576, 16318}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted());
                Unit unit = Unit.INSTANCE;
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rallyOnExtraCallback);
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rallyOnExtraCallback2);
                zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rallyOnExtraCallback3);
                zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rally);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent | zOnNavigationEvent2 | zOnNavigationEvent3 | zOnNavigationEvent4) {
                    int i5 = IAuthTabCallbackStubProxy + 97;
                    onTransact = i5 % 128;
                    int i6 = i5 % 2;
                    if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, 6);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(lowLightBoostControlExternalSyntheticLambda0, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null);
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.onExtraCallback(), false);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    Object[] objArr = new Object[1];
                    a(new int[]{0, 68, 61, 0}, true, new byte[]{1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0}, objArr);
                    AppLovinStarRatingView.IAuthTabCallback(((String) objArr[0]).intern(), (QuirksExternalSyntheticBackport0) null, false, false, 0, 0.5f, false, 0.0f, 0.0f, (QuirkSettingsLoader) null, (immediateFailedFuture) null, false, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 196614, 0, 8158);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 2, (Object) null), 0.0f, 1, (Object) null);
                    component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.onNavigationEvent(), onextracallbackwithresult.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, 54);
                    int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent2);
                    Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        int i7 = IAuthTabCallbackStubProxy + 103;
                        onTransact = i7 % 128;
                        int i8 = i7 % 2;
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback3);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = RallyModifierKt.IAuthTabCallback(onextracallback, rallyOnExtraCallback, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 2);
                    Object[] objArr2 = new Object[1];
                    a(new int[]{68, 50, 0, 16}, false, new byte[]{1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1}, objArr2);
                    AppLovinNativeAdImplc.onExtraCallbackWithResult(((String) objArr2[0]).intern(), quirksExternalSyntheticBackport0IAuthTabCallback, 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 508);
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                    mExternalSyntheticApiModelOutline1 mexternalsyntheticapimodeloutline1 = mExternalSyntheticApiModelOutline1.onWarmupCompleted;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = RallyModifierKt.IAuthTabCallback(onextracallback, rallyOnExtraCallback2, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 2);
                    mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = ((mExternalSyntheticApiModelOutline1.IAuthTabCallback.onExtraCallbackWithResult) mExternalSyntheticApiModelOutline1.asInterface.onExtraCallback.IAuthTabCallback(-616426957, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 616426958, new Object[]{mExternalSyntheticApiModelOutline1.asInterface.Companion}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted())).onNavigationEvent();
                    AppLovinPostbackService appLovinPostbackService = AppLovinPostbackService.onExtraCallbackWithResult;
                    getHumanReadableName gethumanreadablenameAsInterface = appLovinPostbackService.asInterface();
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    long jIsEngagementSignalsApiAvailable = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable();
                    isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
                    mexternalsyntheticapimodeloutline1.onWarmupCompleted(str, iAuthTabCallbackOnNavigationEvent, quirksExternalSyntheticBackport0IAuthTabCallback2, 0, gethumanreadablenameAsInterface, jIsEngagementSignalsApiAvailable, 0L, 0L, 0.0f, (bindChildren) null, (use) null, 0L, isrepeatingenabled.onExtraCallbackWithResult(), mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.Center, (mExternalSyntheticApiModelOutline1.onTransact) null, (mExternalSyntheticApiModelOutline1.IAuthTabCallbackStubProxy) null, (Long) null, (Object) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 100666752, 249800);
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback3 = RallyModifierKt.IAuthTabCallback(onextracallback, rallyOnExtraCallback3, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 2);
                    getHumanReadableName interfaceDescriptor = appLovinPostbackService.getInterfaceDescriptor();
                    long jICustomTabsService = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, quirksExternalSyntheticBackport0IAuthTabCallback3, interfaceDescriptor, Long.valueOf(jICustomTabsService), 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, isrepeatingenabled.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 98032}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    onPageLoadError.onTransact(cameraCaptureResultEmptyCameraCaptureResult, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditQuizNextInfoActivity);
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnExtraCallback || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized2 = creditQuizNextInfoActivity.new IAuthTabCallback(null);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                    }
                    final boolean zBooleanValue = ((Boolean) CameraPresenceProviderExternalSyntheticLambda2.onNavigationEvent(bool, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 6).onExtraCallbackWithResult()).booleanValue();
                    u1.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, (u2) null, ForwardingCameraControl.onExtraCallback(-2045753050, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i9 = 2 % 2;
                            int i10 = IAuthTabCallback + 49;
                            onWarmupCompleted = i10 % 128;
                            int i11 = i10 % 2;
                            Unit unitOnExtraCallback = CreditQuizNextInfoActivity.onExtraCallback(rally, zBooleanValue, creditQuizNextInfoActivity, (u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i12 = onWarmupCompleted + 113;
                            IAuthTabCallback = i12 % 128;
                            int i13 = i12 % 2;
                            return unitOnExtraCallback;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult, 384, 0, 4091);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
                objOnMinimized3 = new onExtraCallback(rallyOnExtraCallback, rallyOnExtraCallback2, rallyOnExtraCallback3, rally, null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, 6);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent3 = MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(lowLightBoostControlExternalSyntheticLambda0, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null);
                component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.onExtraCallback(), false);
                int iHashCode22 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted22 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent3);
                Function0 function0IAuthTabCallback22 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, Integer.valueOf(iHashCode22), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, quirksExternalSyntheticBackport0OnWarmupCompleted22, onextracallbackwithresult2.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr3 = new Object[1];
                a(new int[]{0, 68, 61, 0}, true, new byte[]{1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0}, objArr3);
                AppLovinStarRatingView.IAuthTabCallback(((String) objArr3[0]).intern(), (QuirksExternalSyntheticBackport0) null, false, false, 0, 0.5f, false, 0.0f, 0.0f, (QuirkSettingsLoader) null, (immediateFailedFuture) null, false, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 196614, 0, 8158);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent22 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 2, (Object) null), 0.0f, 1, (Object) null);
                component5 component5VarOnNavigationEvent22 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.onNavigationEvent(), onextracallbackwithresult.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, 54);
                int iHashCode32 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject32 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted32 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent22);
                Function0 function0IAuthTabCallback32 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, component5VarOnNavigationEvent22, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject32, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, Integer.valueOf(iHashCode32), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, quirksExternalSyntheticBackport0OnWarmupCompleted32, onextracallbackwithresult2.onTransact());
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback4 = RallyModifierKt.IAuthTabCallback(onextracallback, rallyOnExtraCallback, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 2);
                Object[] objArr22 = new Object[1];
                a(new int[]{68, 50, 0, 16}, false, new byte[]{1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1}, objArr22);
                AppLovinNativeAdImplc.onExtraCallbackWithResult(((String) objArr22[0]).intern(), quirksExternalSyntheticBackport0IAuthTabCallback4, 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 508);
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                mExternalSyntheticApiModelOutline1 mexternalsyntheticapimodeloutline12 = mExternalSyntheticApiModelOutline1.onWarmupCompleted;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback22 = RallyModifierKt.IAuthTabCallback(onextracallback, rallyOnExtraCallback2, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 2);
                mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallbackOnNavigationEvent2 = ((mExternalSyntheticApiModelOutline1.IAuthTabCallback.onExtraCallbackWithResult) mExternalSyntheticApiModelOutline1.asInterface.onExtraCallback.IAuthTabCallback(-616426957, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 616426958, new Object[]{mExternalSyntheticApiModelOutline1.asInterface.Companion}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted())).onNavigationEvent();
                AppLovinPostbackService appLovinPostbackService2 = AppLovinPostbackService.onExtraCallbackWithResult;
                getHumanReadableName gethumanreadablenameAsInterface2 = appLovinPostbackService2.asInterface();
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda02 = y3ExternalSyntheticLambda0.onExtraCallback;
                long jIsEngagementSignalsApiAvailable2 = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable();
                isRepeatingEnabled isrepeatingenabled2 = isRepeatingEnabled.onExtraCallback;
                mexternalsyntheticapimodeloutline12.onWarmupCompleted(str, iAuthTabCallbackOnNavigationEvent2, quirksExternalSyntheticBackport0IAuthTabCallback22, 0, gethumanreadablenameAsInterface2, jIsEngagementSignalsApiAvailable2, 0L, 0L, 0.0f, (bindChildren) null, (use) null, 0L, isrepeatingenabled2.onExtraCallbackWithResult(), mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.Center, (mExternalSyntheticApiModelOutline1.onTransact) null, (mExternalSyntheticApiModelOutline1.IAuthTabCallbackStubProxy) null, (Long) null, (Object) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 100666752, 249800);
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback32 = RallyModifierKt.IAuthTabCallback(onextracallback, rallyOnExtraCallback3, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 2);
                getHumanReadableName interfaceDescriptor2 = appLovinPostbackService2.getInterfaceDescriptor();
                long jICustomTabsService2 = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, quirksExternalSyntheticBackport0IAuthTabCallback32, interfaceDescriptor2, Long.valueOf(jICustomTabsService2), 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, isrepeatingenabled2.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 98032}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                onPageLoadError.onTransact(cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditQuizNextInfoActivity);
                objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback) {
                    objOnMinimized2 = creditQuizNextInfoActivity.new IAuthTabCallback(null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                    final boolean zBooleanValue2 = ((Boolean) CameraPresenceProviderExternalSyntheticLambda2.onNavigationEvent(bool, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 6).onExtraCallbackWithResult()).booleanValue();
                    u1.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, (u2) null, ForwardingCameraControl.onExtraCallback(-2045753050, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i9 = 2 % 2;
                            int i10 = IAuthTabCallback + 49;
                            onWarmupCompleted = i10 % 128;
                            int i11 = i10 % 2;
                            Unit unitOnExtraCallback = CreditQuizNextInfoActivity.onExtraCallback(rally, zBooleanValue2, creditQuizNextInfoActivity, (u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i12 = onWarmupCompleted + 113;
                            IAuthTabCallback = i12 % 128;
                            int i13 = i12 % 2;
                            return unitOnExtraCallback;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult, 384, 0, 4091);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback2, deviceQuirksExternalSyntheticLambda0);
                FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda122 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub2 = focusMeteringControlExternalSyntheticLambda122.IAuthTabCallbackStub();
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult3 = QuirkSettingsLoader.Companion;
                component5 component5VarOnNavigationEvent3 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub2, onextracallbackwithresult3.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult22 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback4 = onextracallbackwithresult22.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnNavigationEvent3, onextracallbackwithresult22.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult22.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult22.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult22.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult22.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                Rally rallyOnExtraCallback4 = creditQuizNextInfoActivity.onExtraCallback(100, AuthenticatorCompanionAuthenticatorNone.FAST, cameraCaptureResultEmptyCameraCaptureResult, 54);
                AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone2 = AuthenticatorCompanionAuthenticatorNone.SLOW;
                Rally rallyOnExtraCallback22 = creditQuizNextInfoActivity.onExtraCallback(300, authenticatorCompanionAuthenticatorNone2, cameraCaptureResultEmptyCameraCaptureResult, 54);
                Rally rallyOnExtraCallback32 = creditQuizNextInfoActivity.onExtraCallback(500, authenticatorCompanionAuthenticatorNone2, cameraCaptureResultEmptyCameraCaptureResult, 54);
                Boolean bool2 = Boolean.FALSE;
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                }
                final Rally rally2 = (Rally) RallyKt.IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 515399683, -515399667, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), new Object[]{1, null, 0, null, null, 0, bool2, null, null, null, null, null, null, null, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 1572870, 24576, 16318}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted());
                Unit unit2 = Unit.INSTANCE;
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rallyOnExtraCallback4);
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rallyOnExtraCallback22);
                zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rallyOnExtraCallback32);
                zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rally2);
                Object objOnMinimized32 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent | zOnNavigationEvent2 | zOnNavigationEvent3 | zOnNavigationEvent4) {
                }
                objOnMinimized32 = new onExtraCallback(rallyOnExtraCallback4, rallyOnExtraCallback22, rallyOnExtraCallback32, rally2, null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized32);
                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit2, (Function2) objOnMinimized32, cameraCaptureResultEmptyCameraCaptureResult, 6);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent32 = MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(lowLightBoostControlExternalSyntheticLambda02, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback2, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null);
                component5 component5VarOnWarmupCompleted22 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult3.onExtraCallback(), false);
                int iHashCode222 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject222 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted222 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent32);
                Function0 function0IAuthTabCallback222 = onextracallbackwithresult22.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult222 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult222, component5VarOnWarmupCompleted22, onextracallbackwithresult22.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult222, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject222, onextracallbackwithresult22.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult222, Integer.valueOf(iHashCode222), onextracallbackwithresult22.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult222, onextracallbackwithresult22.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult222, quirksExternalSyntheticBackport0OnWarmupCompleted222, onextracallbackwithresult22.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda122 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr32 = new Object[1];
                a(new int[]{0, 68, 61, 0}, true, new byte[]{1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0}, objArr32);
                AppLovinStarRatingView.IAuthTabCallback(((String) objArr32[0]).intern(), (QuirksExternalSyntheticBackport0) null, false, false, 0, 0.5f, false, 0.0f, 0.0f, (QuirkSettingsLoader) null, (immediateFailedFuture) null, false, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 196614, 0, 8158);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent222 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(onextracallback2, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 2, (Object) null), 0.0f, 1, (Object) null);
                component5 component5VarOnNavigationEvent222 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda122.onNavigationEvent(), onextracallbackwithresult3.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, 54);
                int iHashCode322 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject322 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted322 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent222);
                Function0 function0IAuthTabCallback322 = onextracallbackwithresult22.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult322 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult322, component5VarOnNavigationEvent222, onextracallbackwithresult22.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult322, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject322, onextracallbackwithresult22.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult322, Integer.valueOf(iHashCode322), onextracallbackwithresult22.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult322, onextracallbackwithresult22.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult322, quirksExternalSyntheticBackport0OnWarmupCompleted322, onextracallbackwithresult22.onTransact());
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback42 = RallyModifierKt.IAuthTabCallback(onextracallback2, rallyOnExtraCallback4, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 2);
                Object[] objArr222 = new Object[1];
                a(new int[]{68, 50, 0, 16}, false, new byte[]{1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1}, objArr222);
                AppLovinNativeAdImplc.onExtraCallbackWithResult(((String) objArr222[0]).intern(), quirksExternalSyntheticBackport0IAuthTabCallback42, 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 508);
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback2, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                mExternalSyntheticApiModelOutline1 mexternalsyntheticapimodeloutline122 = mExternalSyntheticApiModelOutline1.onWarmupCompleted;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback222 = RallyModifierKt.IAuthTabCallback(onextracallback2, rallyOnExtraCallback22, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 2);
                mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallbackOnNavigationEvent22 = ((mExternalSyntheticApiModelOutline1.IAuthTabCallback.onExtraCallbackWithResult) mExternalSyntheticApiModelOutline1.asInterface.onExtraCallback.IAuthTabCallback(-616426957, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 616426958, new Object[]{mExternalSyntheticApiModelOutline1.asInterface.Companion}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted())).onNavigationEvent();
                AppLovinPostbackService appLovinPostbackService22 = AppLovinPostbackService.onExtraCallbackWithResult;
                getHumanReadableName gethumanreadablenameAsInterface22 = appLovinPostbackService22.asInterface();
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda022 = y3ExternalSyntheticLambda0.onExtraCallback;
                long jIsEngagementSignalsApiAvailable22 = y3externalsyntheticlambda022.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable();
                isRepeatingEnabled isrepeatingenabled22 = isRepeatingEnabled.onExtraCallback;
                mexternalsyntheticapimodeloutline122.onWarmupCompleted(str, iAuthTabCallbackOnNavigationEvent22, quirksExternalSyntheticBackport0IAuthTabCallback222, 0, gethumanreadablenameAsInterface22, jIsEngagementSignalsApiAvailable22, 0L, 0L, 0.0f, (bindChildren) null, (use) null, 0L, isrepeatingenabled22.onExtraCallbackWithResult(), mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.Center, (mExternalSyntheticApiModelOutline1.onTransact) null, (mExternalSyntheticApiModelOutline1.IAuthTabCallbackStubProxy) null, (Long) null, (Object) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 100666752, 249800);
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback2, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback322 = RallyModifierKt.IAuthTabCallback(onextracallback2, rallyOnExtraCallback32, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 2);
                getHumanReadableName interfaceDescriptor22 = appLovinPostbackService22.getInterfaceDescriptor();
                long jICustomTabsService22 = y3externalsyntheticlambda022.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, quirksExternalSyntheticBackport0IAuthTabCallback322, interfaceDescriptor22, Long.valueOf(jICustomTabsService22), 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, isrepeatingenabled22.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 98032}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                onPageLoadError.onTransact(cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditQuizNextInfoActivity);
                objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042 A[PHI: r0
      0x0042: PHI (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002c, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e A[PHI: r0
      0x002e: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002c, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, final String str, final String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = onTransact + 15;
        IAuthTabCallbackStubProxy = i7 % 128;
        if (i7 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(411262806);
            if ((i & 53) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
                    int i8 = IAuthTabCallbackStubProxy + 17;
                    onTransact = i8 % 128;
                    int i9 = i8 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(411262806);
            if ((i & 6) == 0) {
            }
        }
        boolean z = false;
        if ((i & 48) == 0) {
            int i10 = onTransact + 119;
            IAuthTabCallbackStubProxy = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 33 / 0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                    int i12 = IAuthTabCallbackStubProxy + 23;
                    onTransact = i12 % 128;
                    int i13 = i12 % 2;
                    i5 = 32;
                } else {
                    i5 = 16;
                }
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
            }
            i3 |= i5;
        }
        if ((i & 384) == 0) {
            int i14 = IAuthTabCallbackStubProxy + 69;
            onTransact = i14 % 128;
            int i15 = i14 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this)) {
                int i16 = onTransact + 55;
                IAuthTabCallbackStubProxy = i16 % 128;
                i4 = i16 % 2 == 0 ? 29815 : 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            int i17 = onTransact + 5;
            IAuthTabCallbackStubProxy = i17 % 128;
            int i18 = i17 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            int i19 = IAuthTabCallbackStubProxy + 25;
            onTransact = i19 % 128;
            if (i19 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(411262806, i3, -1, "im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity.Content (CreditQuizNextInfoActivity.kt:138)");
            }
            setThreadList.onWarmupCompleted(1502939L, (String) null, (Function1) null, ForwardingCameraControl.onExtraCallback(-1595659549, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj2, Object obj3, Object obj4) throws Throwable {
                    int i20 = 2 % 2;
                    int i21 = onExtraCallback + 41;
                    IAuthTabCallback = i21 % 128;
                    int i22 = i21 % 2;
                    Unit unitOnWarmupCompleted = CreditQuizNextInfoActivity.onWarmupCompleted(deviceQuirksExternalSyntheticLambda0, this, str, str2, (enableLoopMonitor) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i23 = IAuthTabCallback + 89;
                    onExtraCallback = i23 % 128;
                    if (i23 % 2 != 0) {
                        return unitOnWarmupCompleted;
                    }
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3078, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity$$ExternalSyntheticLambda5
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2, Object obj3) {
                    int i20 = 2 % 2;
                    int i21 = onExtraCallbackWithResult + 119;
                    onNavigationEvent = i21 % 128;
                    if (i21 % 2 == 0) {
                        return CreditQuizNextInfoActivity.onExtraCallbackWithResult(this.f$0, deviceQuirksExternalSyntheticLambda0, str, str2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    CreditQuizNextInfoActivity.onExtraCallbackWithResult(this.f$0, deviceQuirksExternalSyntheticLambda0, str, str2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Rally onExtraCallback(final int i, @NotNull final AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        Object obj;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(authenticatorCompanionAuthenticatorNone, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onTransact + 7;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1906463290, i2, -1, "im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity.createFadeRally (CreditQuizNextInfoActivity.kt:238)");
        }
        Boolean bool = Boolean.FALSE;
        if (((i2 & 112) ^ 48) > 32) {
            int i6 = onTransact + 103;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(authenticatorCompanionAuthenticatorNone.ordinal())) {
                if ((i2 & 48) == 32) {
                    int i8 = IAuthTabCallbackStubProxy + 41;
                    onTransact = i8 % 128;
                    int i9 = i8 % 2;
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        boolean z2 = (((i2 & 14) ^ 6) > 4 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i)) || (i2 & 6) == 4;
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(z2 | z)) {
            obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                Function1 function1 = new Function1() { // from class: im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity$$ExternalSyntheticLambda2
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2) {
                        int i10 = 2 % 2;
                        int i11 = onWarmupCompleted + 121;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                        List listIAuthTabCallback = CreditQuizNextInfoActivity.IAuthTabCallback(authenticatorCompanionAuthenticatorNone, i, (Rally) obj2);
                        int i13 = onExtraCallback + 109;
                        onWarmupCompleted = i13 % 128;
                        if (i13 % 2 == 0) {
                            return listIAuthTabCallback;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function1);
                obj = function1;
            }
        }
        Rally rally = (Rally) RallyKt.IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 515399683, -515399667, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), new Object[]{1, null, 0, null, null, 0, bool, null, null, null, null, null, null, null, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult, 1572870, 0, 16318}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = IAuthTabCallbackStubProxy + 91;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return rally;
    }

    private static final List onWarmupCompleted(AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone, int i, Rally rally) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 65;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rally, "");
            Object[] objArr = {AuthenticatorCompanion.IAuthTabCallback.onExtraCallbackWithResult(authenticate.IN, authenticatorCompanionAuthenticatorNone), Integer.valueOf(i)};
            CollectionsKt.listOf((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()));
            throw null;
        }
        Intrinsics.checkNotNullParameter(rally, "");
        Object[] objArr2 = {AuthenticatorCompanion.IAuthTabCallback.onExtraCallbackWithResult(authenticate.IN, authenticatorCompanionAuthenticatorNone), Integer.valueOf(i)};
        List listListOf = CollectionsKt.listOf((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr2, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()));
        int i4 = onTransact + 123;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return listListOf;
    }

    private final void ICustomTabsServiceDefault() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(null), 3, (Object) null);
        int i2 = onTransact + 115;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = CreditQuizNextInfoActivity.this.new onWarmupCompleted(access13800Var);
            int i2 = onNavigationEvent + 23;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 25;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            }
            onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[PHI: r0
          0x0038: PHI (r0v10 java.lang.Object) = (r0v4 java.lang.Object), (r0v17 java.lang.Object) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r1
          0x0028: PHI (r1v2 int) = (r1v1 int), (r1v7 int) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted;
            int i;
            Object objOnExtraCallback;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 3;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 69 / 0;
                if (i == 0) {
                    Object obj2 = objOnWarmupCompleted;
                    ResultKt.onNavigationEvent(obj);
                    getDummyAd getdummyadIAuthTabCallback = CreditQuizNextInfoActivity.this.IAuthTabCallback();
                    getHostnameVerifierokhttp gethostnameverifierokhttp = CreditQuizNextInfoActivity.this;
                    String strOnNavigationEvent = h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(gethostnameverifierokhttp.getIntent());
                    this.label = 1;
                    objOnExtraCallback = getDummyAd.onExtraCallback(getdummyadIAuthTabCallback, gethostnameverifierokhttp, "STD_1439_CREDITQUIZ_NOTIFICATION", strOnNavigationEvent, "credit_quiz_next", 348L, (Map) null, (setHasShown) null, false, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, this, 8388576, (Object) null);
                    if (objOnExtraCallback == obj2) {
                        int i5 = onExtraCallback + 1;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    objOnExtraCallback = obj;
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            CreditQuizNextInfoActivity.onExtraCallbackWithResult(CreditQuizNextInfoActivity.this).onNavigationEvent((Intent) objOnExtraCallback);
            return Unit.INSTANCE;
        }
    }

    @Override // im.toss.base.BaseActivity
    public boolean bg_() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            ICustomTabsServiceStub();
            return super.bg_();
        }
        ICustomTabsServiceStub();
        super.bg_();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceStub() throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb.IAuthTabCallback(setEngagementSignalsCallback(), this, updateVisuals(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        finish();
        int i4 = IAuthTabCallbackStubProxy + 73;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditQuizNextInfoActivity creditQuizNextInfoActivity, String str, String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditQuizNextInfoActivity, str, str2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), objArr, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 573224578, -573224575);
    }

    public static /* synthetic */ String onWarmupCompleted(CreditQuizNextInfoActivity creditQuizNextInfoActivity) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (String) IAuthTabCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{creditQuizNextInfoActivity}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 249399723, -249399721);
    }

    public static /* synthetic */ Unit onExtraCallback(CreditQuizNextInfoActivity creditQuizNextInfoActivity, String str, String str2, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditQuizNextInfoActivity, str, str2, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), objArr, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 823238920, -823238915);
    }

    private static final List IAuthTabCallback(Rally rally) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (List) IAuthTabCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{rally}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 528195293, -528195293);
    }

    private static final Unit onWarmupCompleted(CreditQuizNextInfoActivity creditQuizNextInfoActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditQuizNextInfoActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), objArr, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1685623451, 1685623455);
    }

    private static final Unit IAuthTabCallback(CreditQuizNextInfoActivity creditQuizNextInfoActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (Unit) IAuthTabCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{creditQuizNextInfoActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 93701234, -93701233);
    }

    public final r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE onNavigationEvent() {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE) IAuthTabCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{this}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1492607128, -1492607122);
    }

    @Override // im.toss.feature.credit.ui.quiz.next.Hilt_CreditQuizNextInfoActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = IAuthTabCallbackStubProxy + 47;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.feature.credit.ui.quiz.next.Hilt_CreditQuizNextInfoActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = onTransact + 1;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            int i4 = 2 / 0;
        }
    }

    @Override // im.toss.feature.credit.ui.quiz.next.Hilt_CreditQuizNextInfoActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 85;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.feature.credit.ui.quiz.next.Hilt_CreditQuizNextInfoActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = IAuthTabCallbackStubProxy + 85;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
    }

    static void validateRelationship() {
        IAuthTabCallbackDefault = new char[]{27163, 27365, 27360, 27365, 27335, 27329, 27390, 27364, 27367, 27371, 27362, 27358, 27336, 27375, 27368, 27364, 27365, 27391, 27365, 27336, 27334, 27365, 27391, 27367, 27372, 27369, 27365, 27368, 27336, 27335, 27365, 27391, 27367, 27372, 27369, 27365, 27368, 27336, 27328, 27367, 27370, 27365, 27391, 27360, 27364, 27332, 27333, 27366, 27334, 27331, 27390, 27360, 27360, 27328, 27339, 27373, 27365, 27369, 27369, 27390, 27328, 27170, 27199, 27357, 27360, 27361, 27391, 27365, 27224, 27137, 27198, 27199, 27172, 27172, 27170, 27143, 27145, 27174, 27169, 27172, 27140, 27137, 27169, 27172, 27177, 27168, 27194, 27196, 27199, 27160, 27258, 27233, 27167, 27197, 27172, 27172, 27168, 27176, 27142, 27167, 27199, 27199, 27197, 27166, 27141, 27173, 27136, 27263, 27141, 27143, 27166, 27197, 27169, 27199, 27165, 27145, 27174, 27197};
    }
}
