package im.toss.feature.credit.ui.quiz.mypage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Process;
import android.provider.Settings;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageActivity;
import im.toss.features.credit.data.response.Avatar;
import im.toss.features.credit.data.response.MyQuizDetailsResponse;
import im.toss.features.credit.ui.quiz.R;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography4;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.TdsTooltipV1View;
import im.toss.uikit.widget.gl.TdsGLBlurView;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Method;
import java.util.List;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.ActivityOnPausePoint;
import o.Address;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppCreatePoint;
import o.AppLovinAdImpl;
import o.AppLovinSdkSettings;
import o.AuthenticatorCompanion;
import o.AuthenticatorCompanionAuthenticatorNone;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BrickModulePackageExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.ForwardingCameraControl;
import o.ManagedRetainedValuesStoreKtExternalSyntheticLambda0;
import o.RightClickGesturesKtonRightClickDown2;
import o.SessionTrackera;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.authenticate;
import o.certificatePinner;
import o.deprecated_certificatePinner;
import o.deprecated_directory;
import o.deprecated_proxy;
import o.deprecated_proxySelector;
import o.findResAndMsg;
import o.formatMsgs;
import o.getAdService;
import o.getAppAlias;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getDummyAd;
import o.getExtraParameters;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getUserIdentifier;
import o.getVersionCode;
import o.h5ScreenShotObserverOnChangeOpt;
import o.hasRelativeParentPath;
import o.isFireOS;
import o.isMuted;
import o.isShowTransAnimate;
import o.isZipFile;
import o.maybeUpdateAnimatable;
import o.minFresh;
import o.nSetPosition;
import o.noStore;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0;
import o.readIntokhttp;
import o.readTimeout;
import o.response;
import o.setAdVideoPlaybackListener;
import o.setBaseDeeplink;
import o.setCompressedSize;
import o.setRandomHost;
import o.setVisitUrl;
import o.varyMatches;
import o.y1hExternalSyntheticLambda0;
import o.zzck;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditQuizMyPageActivity extends Hilt_CreditQuizMyPageActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static long onTransact = -8155558984249759816L;

    @Inject
    public getAppAlias creditGatewayApi;

    @Inject
    public getDummyAd termsIntent;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy asInterface = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(CreditQuizMyPageViewModel.class), new asInterface(this), new onTransact(this), new IAuthTabCallbackDefault(null, this));
    private final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageActivity$$ExternalSyntheticLambda1
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            hasRelativeParentPath hasrelativeparentpathOnExtraCallbackWithResult = CreditQuizMyPageActivity.onExtraCallbackWithResult(this.f$0);
            int i4 = onWarmupCompleted + 75;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return hasrelativeparentpathOnExtraCallbackWithResult;
        }
    });
    private final SessionTrackera asBinder = AppLovinAdImpl.IAuthTabCallback(this, new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageActivity$$ExternalSyntheticLambda2
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                CreditQuizMyPageActivity.onNavigationEvent(this.f$0, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Unit unitOnNavigationEvent = CreditQuizMyPageActivity.onNavigationEvent(this.f$0, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj);
            int i3 = onNavigationEvent + 45;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return unitOnNavigationEvent;
        }
    });

    public static /* synthetic */ void IAuthTabCallback(CreditQuizMyPageActivity creditQuizMyPageActivity, ActivityOnPausePoint activityOnPausePoint, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onExtraCallback(nSetPosition.onExtraCallbackWithResult(), 621355386, iOnExtraCallbackWithResult2, -621355381, iOnExtraCallbackWithResult, new Object[]{creditQuizMyPageActivity, activityOnPausePoint, view}, iOnExtraCallbackWithResult3);
        int i4 = IAuthTabCallbackStub + 9;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~((~i4) | i7 | i5);
        int i9 = (~i5) | i7;
        int i10 = i8 | (~(i9 | i4)) | (~(i2 | i4 | i5));
        int i11 = ~i9;
        int i12 = (~(i5 | i2)) | i4 | i11;
        int i13 = (~(i7 | i4)) | i11;
        int i14 = i2 + i4 + i3 + (933655473 * i6) + ((-1037598838) * i);
        int i15 = i14 * i14;
        int i16 = (((-1556109539) * i2) - 925892608) + (470833381 * i4) + (i10 * (-1134012188)) + (1134012188 * i12) + ((-1134012188) * i13) + (1604845568 * i3) + ((-1691877376) * i6) + ((-393216000) * i) + ((-1633878016) * i15);
        int i17 = ((i2 * (-727610197)) - 1081761860) + (i4 * (-727608285)) + (i10 * 956) + (i12 * (-956)) + (i13 * 956) + (i3 * (-727609241)) + (i6 * 1532828727) + (i * (-747900794)) + (i15 * 556466176);
        switch (i16 + (i17 * i17 * (-1911357440))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                boolean z = false;
                final CreditQuizMyPageActivity creditQuizMyPageActivity = (CreditQuizMyPageActivity) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i18 = 2 % 2;
                int i19 = IAuthTabCallback_Parcel;
                int i20 = i19 + 107;
                int i21 = i20 % 128;
                IAuthTabCallbackStub = i21;
                int i22 = i20 % 2;
                if ((iIntValue & 3) != 2) {
                    int i23 = i19 + 63;
                    IAuthTabCallbackStub = i23 % 128;
                    int i24 = i23 % 2;
                    z = true;
                } else {
                    int i25 = i21 + 19;
                    IAuthTabCallback_Parcel = i25 % 128;
                    int i26 = i25 % 2;
                }
                if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                } else {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i27 = IAuthTabCallbackStub + 107;
                        IAuthTabCallback_Parcel = i27 % 128;
                        int i28 = i27 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1225984381, iIntValue, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageActivity.initView.<anonymous> (CreditQuizMyPageActivity.kt:167)");
                    }
                    y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1529144101, true, new Function2() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageActivity$$ExternalSyntheticLambda0
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj, Object obj2) {
                            int i29 = 2 % 2;
                            int i30 = onWarmupCompleted + 43;
                            onExtraCallback = i30 % 128;
                            int i31 = i30 % 2;
                            Object[] objArr2 = {this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
                            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                            Unit unit = (Unit) CreditQuizMyPageActivity.onExtraCallback(nSetPosition.onExtraCallbackWithResult(), -94054386, nSetPosition.onExtraCallbackWithResult(), 94054388, iOnExtraCallbackWithResult, objArr2, nSetPosition.onExtraCallbackWithResult());
                            int i32 = onWarmupCompleted + 109;
                            onExtraCallback = i32 % 128;
                            if (i32 % 2 == 0) {
                                int i33 = 88 / 0;
                            }
                            return unit;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
                return Unit.INSTANCE;
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Unit unit;
        CreditQuizMyPageActivity creditQuizMyPageActivity = (CreditQuizMyPageActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {creditQuizMyPageActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        if (i3 != 0) {
            unit = (Unit) onExtraCallback(nSetPosition.onExtraCallbackWithResult(), -807839866, iOnExtraCallbackWithResult2, 807839867, iOnExtraCallbackWithResult, objArr2, iOnExtraCallbackWithResult3);
            int i4 = 86 / 0;
        } else {
            unit = (Unit) onExtraCallback(nSetPosition.onExtraCallbackWithResult(), -807839866, iOnExtraCallbackWithResult2, 807839867, iOnExtraCallbackWithResult, objArr2, iOnExtraCallbackWithResult3);
        }
        int i5 = IAuthTabCallbackStub + 99;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditQuizMyPageActivity creditQuizMyPageActivity, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(creditQuizMyPageActivity, str);
        }
        onNavigationEvent(creditQuizMyPageActivity, str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(isZipFile iszipfile, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 63;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(iszipfile, f);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(iszipfile, f);
        int i3 = IAuthTabCallback_Parcel + 77;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ hasRelativeParentPath onExtraCallbackWithResult(CreditQuizMyPageActivity creditQuizMyPageActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        hasRelativeParentPath hasrelativeparentpathIAuthTabCallback = IAuthTabCallback(creditQuizMyPageActivity);
        int i4 = IAuthTabCallback_Parcel + 117;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return hasrelativeparentpathIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(isZipFile iszipfile, CreditQuizMyPageActivity creditQuizMyPageActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(iszipfile, creditQuizMyPageActivity);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditQuizMyPageActivity creditQuizMyPageActivity, ActivityOnPausePoint activityOnPausePoint, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(creditQuizMyPageActivity, activityOnPausePoint, setDetectableSize);
        int i4 = IAuthTabCallbackStub + 53;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditQuizMyPageActivity creditQuizMyPageActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(creditQuizMyPageActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onNavigationEvent(CreditQuizMyPageActivity creditQuizMyPageActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 41;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(creditQuizMyPageActivity, view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditQuizMyPageActivity creditQuizMyPageActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 65;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {creditQuizMyPageActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
            return (Unit) onExtraCallback(nSetPosition.onExtraCallbackWithResult(), 1045458582, nSetPosition.onExtraCallbackWithResult(), -1045458576, nSetPosition.onExtraCallbackWithResult(), objArr, nSetPosition.onExtraCallbackWithResult());
        }
        Object[] objArr2 = {creditQuizMyPageActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 93;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 125;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return -1L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onTransact ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 121;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 3 / 2;
        }
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 113;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onTransact)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollBarSize() >> 8) + 84, 21233 - View.combineMeasuredStates(0, 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 14186), KeyEvent.keyCodeFromString("") + 19, 8808 - Drawable.resolveOpacity(0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i8 = $11 + 121;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    public static final /* synthetic */ hasRelativeParentPath onExtraCallback(CreditQuizMyPageActivity creditQuizMyPageActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        hasRelativeParentPath engagementSignalsCallback = creditQuizMyPageActivity.setEngagementSignalsCallback();
        int i4 = IAuthTabCallbackStub + 95;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return engagementSignalsCallback;
    }

    public static final /* synthetic */ void onNavigationEvent(CreditQuizMyPageActivity creditQuizMyPageActivity, Avatar avatar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onExtraCallback(nSetPosition.onExtraCallbackWithResult(), -1806052500, iOnExtraCallbackWithResult2, 1806052500, iOnExtraCallbackWithResult, new Object[]{creditQuizMyPageActivity, avatar}, iOnExtraCallbackWithResult3);
        int i4 = IAuthTabCallbackStub + 107;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreditQuizMyPageActivity creditQuizMyPageActivity = (CreditQuizMyPageActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 29;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return creditQuizMyPageActivity.ICustomTabsServiceDefault();
        }
        creditQuizMyPageActivity.ICustomTabsServiceDefault();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ SessionTrackera onWarmupCompleted(CreditQuizMyPageActivity creditQuizMyPageActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 69;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        SessionTrackera sessionTrackera = creditQuizMyPageActivity.asBinder;
        int i5 = i2 + 123;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return sessionTrackera;
        }
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(CreditQuizMyPageActivity creditQuizMyPageActivity, isZipFile iszipfile, ActivityOnPausePoint activityOnPausePoint, Avatar avatar) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 3;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        creditQuizMyPageActivity.onWarmupCompleted(iszipfile, activityOnPausePoint, avatar);
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 107;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                throw null;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i3 = onExtraCallbackWithResult + 45;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return getspecialfeatureoptinstatus2;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                    int i3 = onNavigationEvent + 117;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    return getspecialfeatureoptinstatus;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
                int i5 = onWarmupCompleted + 31;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return getspecialfeatureoptinstatus2;
                }
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            obj.hashCode();
            throw null;
        }
    }

    public static final class onTransact implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ ComponentActivity onExtraCallback;

        public onTransact(ComponentActivity componentActivity) {
            this.onExtraCallback = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                onWarmupCompleted();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ViewModelProvider.onWarmupCompleted onWarmupCompleted2 = onWarmupCompleted();
            int i3 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return onWarmupCompleted2;
        }

        public final ViewModelProvider.onWarmupCompleted onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ComponentActivity componentActivity = this.onExtraCallback;
            if (i3 != 0) {
                return componentActivity.getDefaultViewModelProviderFactory();
            }
            componentActivity.getDefaultViewModelProviderFactory();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CreditQuizMyPageActivity creditQuizMyPageActivity = (CreditQuizMyPageActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 107;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        SessionTrackerb sessionTrackerb = creditQuizMyPageActivity.tossRouter;
        if (i4 != 0) {
            throw null;
        }
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 113;
        int i6 = i5 % 128;
        IAuthTabCallback_Parcel = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 75;
        IAuthTabCallbackStub = i8 % 128;
        if (i8 % 2 == 0) {
            return sessionTrackerb;
        }
        throw null;
    }

    public static final class asInterface implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ ComponentActivity onNavigationEvent;

        public asInterface(ComponentActivity componentActivity) {
            this.onNavigationEvent = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted();
            int i4 = onExtraCallbackWithResult + 5;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                this.onNavigationEvent.getViewModelStore();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.onNavigationEvent.getViewModelStore();
            int i3 = onExtraCallback + 31;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return viewModelStore;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallbackDefault implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int asInterface = 1;
        private static int onExtraCallback;
        public static int onExtraCallbackWithResult;
        public static int onWarmupCompleted;
        final /* synthetic */ Function0 IAuthTabCallback;
        final /* synthetic */ ComponentActivity onNavigationEvent;

        public IAuthTabCallbackDefault(Function0 function0, ComponentActivity componentActivity) {
            this.IAuthTabCallback = function0;
            this.onNavigationEvent = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnNavigationEvent = onNavigationEvent();
            int i4 = onExtraCallback + 119;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnNavigationEvent;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asInterface + 115;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Function0 function0 = this.IAuthTabCallback;
            if (function0 != null) {
                int i4 = i3 + 7;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                    int i6 = onExtraCallback + 97;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                }
            }
            return this.onNavigationEvent.getDefaultViewModelCreationExtras();
        }

        public static int onWarmupCompleted() {
            int i = onExtraCallbackWithResult;
            int i2 = i % 6128358;
            onExtraCallbackWithResult = i + 1;
            if (i2 != 0) {
                return onWarmupCompleted;
            }
            int i3 = Settings.System.getInt(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getContentResolver(), "screen_brightness", -1);
            onWarmupCompleted = i3;
            return i3;
        }
    }

    public final getDummyAd onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 29;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        getDummyAd getdummyad = this.termsIntent;
        if (getdummyad == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 99;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return getdummyad;
    }

    private final CreditQuizMyPageViewModel ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.asInterface.getValue();
        if (i3 != 0) {
            return (CreditQuizMyPageViewModel) value;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final hasRelativeParentPath IAuthTabCallback(CreditQuizMyPageActivity creditQuizMyPageActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 15;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(creditQuizMyPageActivity);
        if (i3 != 0) {
            return hasRelativeParentPath.IAuthTabCallback(layoutInflaterFrom);
        }
        hasRelativeParentPath.IAuthTabCallback(layoutInflaterFrom);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final hasRelativeParentPath setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        hasRelativeParentPath hasrelativeparentpath = (hasRelativeParentPath) this.IAuthTabCallbackDefault.getValue();
        if (i3 != 0) {
            return hasrelativeparentpath;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(CreditQuizMyPageActivity creditQuizMyPageActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
            r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult();
            r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 r8lambdahekmogpxfnmskbbrjd3t2vn5d0 = r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_COMPLETED_MESSAGE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult() == r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_COMPLETED_MESSAGE) {
            int i3 = IAuthTabCallback_Parcel + 29;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            TdsToastV1.onWarmupCompleted onwarmupcompleted = TdsToastV1.Companion;
            String string = creditQuizMyPageActivity.getString(R.string.my_credit_quiz_alaram_terms_agreed);
            Intrinsics.checkNotNullExpressionValue(string, "");
            TdsToastV1.onNavigationEvent onNavigationEvent = TdsToastV1.onNavigationEvent.onNavigationEvent(isShowTransAnimate.onWarmupCompleted(onwarmupcompleted, string), viva.republica.toss.R.drawable.icn_success_color, 0, 2, (Object) null);
            DisplayMetrics displayMetrics = creditQuizMyPageActivity.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            BrickModulePackageExternalSyntheticLambda0.onExtraCallbackWithResult(onNavigationEvent.IAuthTabCallback(varyMatches.onNavigationEvent(90, displayMetrics)), 200, (Integer) null, 0, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }

    @Override // im.toss.feature.credit.ui.quiz.mypage.Hilt_CreditQuizMyPageActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 9;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            super.onResume();
            ICustomTabsServiceDefault().IAuthTabCallbackStub();
        } else {
            super.onResume();
            ICustomTabsServiceDefault().IAuthTabCallbackStub();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0062  */
    @Override // im.toss.base.BaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean bg_() {
        Object objOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutOnNavigationEvent = setEngagementSignalsCallback().IAuthTabCallback.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnNavigationEvent, "");
        if (constraintLayoutOnNavigationEvent.getVisibility() == 0) {
            int i4 = IAuthTabCallbackStub + 17;
            IAuthTabCallback_Parcel = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                objOnNavigationEvent = ((Result) ICustomTabsServiceDefault().IAuthTabCallback().IAuthTabCallback()).onNavigationEvent();
                int i5 = 13 / 0;
                if (Result.onExtraCallback(objOnNavigationEvent)) {
                    int i6 = IAuthTabCallbackStub + 29;
                    IAuthTabCallback_Parcel = i6 % 128;
                    int i7 = i6 % 2;
                    objOnNavigationEvent = null;
                }
            } else {
                objOnNavigationEvent = ((Result) ICustomTabsServiceDefault().IAuthTabCallback().IAuthTabCallback()).onNavigationEvent();
                if (Result.onExtraCallback(objOnNavigationEvent)) {
                }
            }
            IAuthTabCallback((ActivityOnPausePoint) objOnNavigationEvent);
            int i8 = IAuthTabCallback_Parcel + 47;
            IAuthTabCallbackStub = i8 % 128;
            if (i8 % 2 == 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }
        return super.bg_();
    }

    @Override // im.toss.feature.credit.ui.quiz.mypage.Hilt_CreditQuizMyPageActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 71;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView((View) setEngagementSignalsCallback().onWarmupCompleted());
        updateVisuals();
        ICustomTabsServiceStub();
        int i4 = IAuthTabCallbackStub + 71;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ Avatar $previousAvatar;
        int label;
        private static final byte[] $$a = {4, -66, -36, 8};
        private static final int $$b = 98;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        private static int onNavigationEvent = 478308964;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, byte b2, byte b3) {
            int i;
            byte[] bArr = $$a;
            int i2 = (b2 * 3) + 105;
            int i3 = (b3 * 4) + 4;
            int i4 = b * 2;
            byte[] bArr2 = new byte[1 - i4];
            int i5 = 0 - i4;
            if (bArr == null) {
                int i6 = i3;
                int i7 = 0;
                i2 = (-i2) + i3;
                i3 = i6 + 1;
                i = i7;
                bArr2[i] = (byte) i2;
                if (i == i5) {
                    return new String(bArr2, 0);
                }
                byte b4 = bArr[i3];
                int i8 = i3;
                i3 = i2;
                i2 = b4;
                i7 = i + 1;
                i6 = i8;
                i2 = (-i2) + i3;
                i3 = i6 + 1;
                i = i7;
                bArr2[i] = (byte) i2;
                if (i == i5) {
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i2;
                if (i == i5) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(Avatar avatar, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$previousAvatar = avatar;
        }

        public static /* synthetic */ Unit onNavigationEvent(CreditQuizMyPageActivity creditQuizMyPageActivity, ActivityOnPausePoint activityOnPausePoint, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(creditQuizMyPageActivity, activityOnPausePoint, setDetectableSize);
            }
            onExtraCallbackWithResult(creditQuizMyPageActivity, activityOnPausePoint, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = CreditQuizMyPageActivity.this.new asBinder(this.$previousAvatar, access13800Var);
            int i2 = onExtraCallback + 75;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return asbinder;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 71;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 69 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0164  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0165  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
            int i4;
            Throwable cause;
            int i5 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (true) {
                i4 = 2083011369;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                    break;
                }
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35124 - TextUtils.indexOf((CharSequence) "", '0')), ExpandableListView.getPackedPositionChild(0L) + 24, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10277, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - ((byte) KeyEvent.getModifierMetaStateMask())), 55 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 2168, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            if (i2 > 0) {
                int i7 = $10 + 49;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                int i9 = $10 + 67;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 12843), Drawable.resolveOpacity(0, 0) + 55, 2166 - ImageFormat.getBitsPerPixel(0), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i11 = $11 + 113;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    i4 = 2083011369;
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x007d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit onExtraCallbackWithResult(CreditQuizMyPageActivity creditQuizMyPageActivity, ActivityOnPausePoint activityOnPausePoint, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a('8' - AndroidCharacter.getMirror('0'), 4 - (Process.myPid() >> 22), new char[]{7, 7, 65530, 7, 7, 65530, 65531, 65530}, false, 184 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(creditQuizMyPageActivity.getIntent()));
            MyQuizDetailsResponse myQuizDetailsResponseAsInterface = activityOnPausePoint.asInterface();
            Integer numValueOf = null;
            if (myQuizDetailsResponseAsInterface != null) {
                int i4 = onExtraCallback + 53;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                Avatar avatarOnExtraCallbackWithResult = myQuizDetailsResponseAsInterface.onExtraCallbackWithResult();
                if (avatarOnExtraCallbackWithResult != null) {
                    int i6 = onExtraCallback + 45;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 == 0) {
                        Integer.valueOf(avatarOnExtraCallbackWithResult.onTransact());
                        throw null;
                    }
                    numValueOf = Integer.valueOf(avatarOnExtraCallbackWithResult.onTransact());
                } else {
                    int i7 = onWarmupCompleted + 77;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 4 / 4;
                    }
                }
            }
            setDetectableSize.onExtraCallback("level", numValueOf);
            return Unit.INSTANCE;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallback;
                int i4 = i3 + 65;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i3 + 71;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(300L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            Object[] objArr = {CreditQuizMyPageActivity.this};
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            Object objIAuthTabCallback = ((CreditQuizMyPageViewModel) CreditQuizMyPageActivity.onExtraCallback(nSetPosition.onExtraCallbackWithResult(), -69023439, nSetPosition.onExtraCallbackWithResult(), 69023442, iOnExtraCallbackWithResult, objArr, nSetPosition.onExtraCallbackWithResult())).IAuthTabCallback().IAuthTabCallback();
            final CreditQuizMyPageActivity creditQuizMyPageActivity = CreditQuizMyPageActivity.this;
            Avatar avatar = this.$previousAvatar;
            Object objOnNavigationEvent = ((Result) objIAuthTabCallback).onNavigationEvent();
            if (!(true ^ Result.onExtraCallback(objOnNavigationEvent))) {
                objOnNavigationEvent = null;
            }
            final ActivityOnPausePoint activityOnPausePoint = (ActivityOnPausePoint) objOnNavigationEvent;
            if (activityOnPausePoint == null) {
                Unit unit = Unit.INSTANCE;
                int i8 = onExtraCallback + 67;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                return unit;
            }
            ConvertByteArrayToFloatArray.onExtraCallback(1303879L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageActivity$startLevelUpAction$1$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2) throws Throwable {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallback + 89;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    CreditQuizMyPageActivity creditQuizMyPageActivity2 = creditQuizMyPageActivity;
                    if (i12 == 0) {
                        return CreditQuizMyPageActivity.asBinder.onNavigationEvent(creditQuizMyPageActivity2, activityOnPausePoint, (SetDetectableSize) obj2);
                    }
                    Unit unitOnNavigationEvent = CreditQuizMyPageActivity.asBinder.onNavigationEvent(creditQuizMyPageActivity2, activityOnPausePoint, (SetDetectableSize) obj2);
                    int i13 = 5 / 0;
                    return unitOnNavigationEvent;
                }
            }, 14, null);
            isZipFile iszipfile = CreditQuizMyPageActivity.onExtraCallback(creditQuizMyPageActivity).IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(iszipfile, "");
            CreditQuizMyPageActivity.onWarmupCompleted(creditQuizMyPageActivity, iszipfile, activityOnPausePoint, avatar);
            return Unit.INSTANCE;
        }
    }

    private final void ICustomTabsServiceStub() {
        int i = 2 % 2;
        setBaseDeeplink.onNavigationEvent(this, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, new onWarmupCompleted(this, (access13800) null), 1, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(this, (access13800) null), 3, (Object) null);
        int i2 = IAuthTabCallback_Parcel + 27;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final void updateVisuals() {
        int i = 2 % 2;
        setEngagementSignalsCallback().onNavigationEvent.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1225984381, true, new Function2() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageActivity$$ExternalSyntheticLambda7
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 73;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = CreditQuizMyPageActivity.onWarmupCompleted(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i5 = onWarmupCompleted + 35;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnWarmupCompleted;
                }
                throw null;
            }
        })));
        int i2 = IAuthTabCallbackStub + 43;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 73 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(CreditQuizMyPageActivity creditQuizMyPageActivity, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        SessionTrackerb.IAuthTabCallback((SessionTrackerb) onExtraCallback(nSetPosition.onExtraCallbackWithResult(), 673732708, iOnExtraCallbackWithResult2, -673732704, iOnExtraCallbackWithResult, new Object[]{creditQuizMyPageActivity}, iOnExtraCallbackWithResult3), creditQuizMyPageActivity, str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 91;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Activity, im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageActivity, java.lang.Object] */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        final ?? r1 = (CreditQuizMyPageActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 3) != 2, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1529144101, iIntValue, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageActivity.initView.<anonymous>.<anonymous> (CreditQuizMyPageActivity.kt:168)");
            }
            String strOnNavigationEvent = h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(r1.getIntent());
            CreditQuizMyPageViewModel creditQuizMyPageViewModelICustomTabsServiceDefault = r1.ICustomTabsServiceDefault();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback((Object) r1);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageActivity$$ExternalSyntheticLambda3
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        Unit unitOnExtraCallbackWithResult;
                        int i4 = 2 % 2;
                        int i5 = onExtraCallback + 59;
                        onWarmupCompleted = i5 % 128;
                        if (i5 % 2 == 0) {
                            unitOnExtraCallbackWithResult = CreditQuizMyPageActivity.onExtraCallbackWithResult(this.f$0, (String) obj);
                            int i6 = 3 / 0;
                        } else {
                            unitOnExtraCallbackWithResult = CreditQuizMyPageActivity.onExtraCallbackWithResult(this.f$0, (String) obj);
                        }
                        int i7 = onWarmupCompleted + 125;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                int i4 = IAuthTabCallback_Parcel + 115;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
            }
            int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            AppCreatePoint.onExtraCallback(889362224, TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{strOnNavigationEvent, creditQuizMyPageViewModelICustomTabsServiceDefault, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0}, -889362220, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IAuthTabCallbackStub + 13;
                IAuthTabCallback_Parcel = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i7 = 12 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = IAuthTabCallbackStub + 105;
            IAuthTabCallback_Parcel = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CreditQuizMyPageActivity creditQuizMyPageActivity = (CreditQuizMyPageActivity) objArr[0];
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(creditQuizMyPageActivity), (CoroutineContext) null, (setRandomHost) null, creditQuizMyPageActivity.new asBinder((Avatar) objArr[1], null), 3, (Object) null);
        int i2 = IAuthTabCallback_Parcel + 87;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 40 / 0;
        }
        return null;
    }

    private static final void onExtraCallbackWithResult(CreditQuizMyPageActivity creditQuizMyPageActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 95;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        creditQuizMyPageActivity.finish();
        int i4 = IAuthTabCallbackStub + 89;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        CreditQuizMyPageActivity creditQuizMyPageActivity = (CreditQuizMyPageActivity) objArr[0];
        ActivityOnPausePoint activityOnPausePoint = (ActivityOnPausePoint) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        creditQuizMyPageActivity.IAuthTabCallback(activityOnPausePoint);
        int i4 = IAuthTabCallback_Parcel + 103;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(final isZipFile iszipfile, final ActivityOnPausePoint activityOnPausePoint, Avatar avatar) throws Throwable {
        String str;
        Avatar avatarOnExtraCallbackWithResult;
        int i = 2 % 2;
        iszipfile.onTransact.setOnClickListener(new View.OnClickListener() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageActivity$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 71;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                CreditQuizMyPageActivity.onNavigationEvent(this.f$0, view);
                if (i4 != 0) {
                    int i5 = 54 / 0;
                }
            }
        });
        AnimateText animateText = iszipfile.asBinder;
        animateText.setFont(response.Bold);
        Intrinsics.checkNotNull(animateText);
        Context context = animateText.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        animateText.setTextColor(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new IAuthTabCallback(configuration))}, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
        animateText.setSubTypography(5);
        String string = getString(R.string.my_credit_quiz_level_up_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        AnimateText.onExtraCallback(animateText, string, readTimeout.asBinder.IAuthTabCallback.IAuthTabCallback, 0, AnimateText.onNavigationEvent.TOP_LEFT, false, false, (Function0) null, (Function0) null, (Function0) null, 500, (Object) null);
        setEngagementSignalsCallback().IAuthTabCallback.IAuthTabCallbackStub.setAlpha(0.0f);
        TdsTooltipV1View tdsTooltipV1View = iszipfile.IAuthTabCallbackStub;
        MyQuizDetailsResponse myQuizDetailsResponseAsInterface = activityOnPausePoint.asInterface();
        if (myQuizDetailsResponseAsInterface != null) {
            int i2 = IAuthTabCallback_Parcel + 113;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Avatar avatarOnExtraCallbackWithResult2 = myQuizDetailsResponseAsInterface.onExtraCallbackWithResult();
            if (avatarOnExtraCallbackWithResult2 != null) {
                str = (String) Avatar.IAuthTabCallback(new Object[]{avatarOnExtraCallbackWithResult2}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1592771429, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1592771429);
                if (str == null) {
                    str = "";
                }
            }
        }
        tdsTooltipV1View.setText(str);
        iszipfile.IAuthTabCallbackStub.setTail(TdsTooltipV1View.IAuthTabCallback.BOTTOM);
        setCompressedSize setcompressedsize = iszipfile.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(setcompressedsize, "");
        MyQuizDetailsResponse myQuizDetailsResponseAsInterface2 = activityOnPausePoint.asInterface();
        if (myQuizDetailsResponseAsInterface2 != null) {
            int i4 = IAuthTabCallback_Parcel + 13;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            avatarOnExtraCallbackWithResult = myQuizDetailsResponseAsInterface2.onExtraCallbackWithResult();
        } else {
            int i6 = IAuthTabCallback_Parcel + 81;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            avatarOnExtraCallbackWithResult = null;
        }
        onExtraCallback(setcompressedsize, avatarOnExtraCallbackWithResult);
        setCompressedSize setcompressedsize2 = iszipfile.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(setcompressedsize2, "");
        onExtraCallback(setcompressedsize2, avatar);
        TdsBottomCtaV1View tdsBottomCtaV1View = iszipfile.onNavigationEvent;
        tdsBottomCtaV1View.setElevation(0.0f);
        tdsBottomCtaV1View.asInterface().setOnClickListener(new View.OnClickListener() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageActivity$$ExternalSyntheticLambda5
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = 2 % 2;
                int i9 = onNavigationEvent + 59;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                CreditQuizMyPageActivity creditQuizMyPageActivity = this.f$0;
                if (i10 != 0) {
                    CreditQuizMyPageActivity.IAuthTabCallback(creditQuizMyPageActivity, activityOnPausePoint, view);
                    return;
                }
                CreditQuizMyPageActivity.IAuthTabCallback(creditQuizMyPageActivity, activityOnPausePoint, view);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        tdsBottomCtaV1View.setGradientVisibility(4);
        tdsBottomCtaV1View.setBottomCtaBackgroundColor(0);
        LottieAnimationView lottieAnimationView = iszipfile.asInterface;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        Object[] objArr = new Object[1];
        a(new char[]{24091, 46425, 24179, 16733, 59801, 63553, 21698, 17070, 11448, 31463, 27978, 56321, 48072, 63353, 56884, 44810, 1538, 30, 20651, 14906, 38196, 37598, 50566, 46512, 24674, 12272, 46602, 130, 61076, 47289, 11105, 37463, 32206, 13646, 40042, 28013, 51444, 17923, 3795, 63547, 22335, 54057, 33676, 19329, 8792, 28130, 29883, 50840, 45198, 65161, 59761, 20903, 16374, 2888, 23053, 9070, 35559, 33906, 52417, 48651, 6486, 4409, 16890, 2510, 58373, 41943, 12982, 34017, 29557}, Drawable.resolveOpacity(0, 0), objArr);
        zzck.onExtraCallback(lottieAnimationView, ((String) objArr[0]).intern(), (ManagedRetainedValuesStoreKtExternalSyntheticLambda0) null, 2, (Object) null);
        iszipfile.onNavigationEvent().post(new Runnable() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageActivity$$ExternalSyntheticLambda6
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i8 = 2 % 2;
                int i9 = onNavigationEvent + 59;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 == 0) {
                    CreditQuizMyPageActivity.onExtraCallbackWithResult(iszipfile, this);
                    int i10 = 81 / 0;
                } else {
                    CreditQuizMyPageActivity.onExtraCallbackWithResult(iszipfile, this);
                }
                int i11 = onWarmupCompleted + 47;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void IAuthTabCallback(isZipFile iszipfile, CreditQuizMyPageActivity creditQuizMyPageActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 115;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutOnNavigationEvent = iszipfile.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnNavigationEvent, "");
        constraintLayoutOnNavigationEvent.setVisibility(0);
        minFresh.onNavigationEvent(creditQuizMyPageActivity, noStore.Companion.IAuthTabCallback());
        iszipfile.asInterface.playAnimation();
        creditQuizMyPageActivity.onNavigationEvent(iszipfile);
        int i4 = IAuthTabCallback_Parcel + 69;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onExtraCallback implements getAdService {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onWarmupCompleted + 7;
            onExtraCallback = i4 % 128;
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

    private static final Unit onExtraCallback(isZipFile iszipfile, float f) {
        int i;
        int i2 = 2 % 2;
        LinearLayout linearLayoutOnExtraCallbackWithResult = iszipfile.IAuthTabCallback.onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(linearLayoutOnExtraCallbackWithResult, "");
        int i3 = 8;
        if (f > 0.5f) {
            i = 0;
        } else {
            int i4 = IAuthTabCallback_Parcel + 87;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            i = 8;
        }
        linearLayoutOnExtraCallbackWithResult.setVisibility(i);
        LinearLayout linearLayoutOnExtraCallbackWithResult2 = iszipfile.onExtraCallback.onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(linearLayoutOnExtraCallbackWithResult2, "");
        if (f <= 0.5f) {
            int i6 = IAuthTabCallback_Parcel + 107;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            i3 = 0;
        }
        linearLayoutOnExtraCallbackWithResult2.setVisibility(i3);
        return Unit.INSTANCE;
    }

    private final void onNavigationEvent(final isZipFile iszipfile) {
        int i = 2 % 2;
        TdsTooltipV1View tdsTooltipV1View = iszipfile.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(tdsTooltipV1View, "");
        AuthenticatorCompanion authenticatorCompanion = AuthenticatorCompanion.IAuthTabCallback;
        authenticate authenticateVar = authenticate.IN;
        List listListOf = CollectionsKt.listOf(authenticatorCompanion.onExtraCallbackWithResult(authenticateVar, AuthenticatorCompanionAuthenticatorNone.SLOW));
        Boolean bool = Boolean.FALSE;
        Rally rallyOnWarmupCompleted = RallysKt.onWarmupCompleted(tdsTooltipV1View, listListOf, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 400, 0L, false, 1660, (Object) null);
        TdsBottomCtaV1View tdsBottomCtaV1View = iszipfile.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        Rally rallyOnWarmupCompleted2 = RallysKt.onWarmupCompleted(tdsBottomCtaV1View, CollectionsKt.listOf(authenticatorCompanion.onExtraCallbackWithResult(authenticateVar, AuthenticatorCompanionAuthenticatorNone.FAST)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 0, 0L, false, 1916, (Object) null);
        FrameLayout frameLayout = iszipfile.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        Rally rallyOnWarmupCompleted3 = RallysKt.onWarmupCompleted(frameLayout, ((getUserIdentifier) deprecated_proxy.onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1261663334, new Object[]{deprecated_proxy.onNavigationEvent, deprecated_proxySelector.SMALL, certificatePinner.X}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1261663334, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult())).onNavigationEvent(), 0, getExtraParameters.Normal, 0, (Interpolator) null, (Integer) null, bool, 1600, 0L, false, 1652, (Object) null);
        LinearLayout linearLayoutOnExtraCallbackWithResult = iszipfile.IAuthTabCallback.onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(linearLayoutOnExtraCallbackWithResult, "");
        Address address = Address.onNavigationEvent;
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = RallysKt.onExtraCallback(address.onWarmupCompleted(), 1500);
        getVersionCode getversioncode = getVersionCode.MEDIUM;
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback2 = appLovinSdkSettingsOnExtraCallback.onExtraCallback(getversioncode);
        Float fValueOf = Float.valueOf(0.0f);
        Object[] objArr = {appLovinSdkSettingsOnExtraCallback2, Float.valueOf(-180.0f), fValueOf, null, 4, null};
        Object[] objArr2 = {(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1818891848, objArr, 1818891874, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), Float.valueOf(0.0f), Float.valueOf(1.0f), new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageActivity$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 51;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = CreditQuizMyPageActivity.onExtraCallbackWithResult(iszipfile, ((Float) obj).floatValue());
                int i5 = IAuthTabCallback + 67;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, null, 8, null};
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{linearLayoutOnExtraCallbackWithResult, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, objArr2, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, bool, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        LinearLayout linearLayoutOnExtraCallbackWithResult2 = iszipfile.onExtraCallback.onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(linearLayoutOnExtraCallbackWithResult2, "");
        Object[] objArr3 = {RallysKt.onExtraCallback(address.onWarmupCompleted(), 1500).onExtraCallback(getversioncode), fValueOf, Float.valueOf(180.0f), null, 4, null};
        Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{linearLayoutOnExtraCallbackWithResult2, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1818891848, objArr3, 1818891874, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, bool, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        TdsGLBlurView tdsGLBlurView = iszipfile.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsGLBlurView, "");
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        Rally rally3 = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsGLBlurView, isMuted.onExtraCallbackWithResult((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), deprecated_directory.None, deprecated_directory.Medium, (Function1) null, 4, (Object) null), 0, null, 0, null, null, bool, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        FrameLayout frameLayout2 = iszipfile.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub((Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayout2, isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), fValueOf, Float.valueOf(1.0f), (Function1) null, 4, (Object) null), 0, null, 0, null, null, bool, 150, 0L, false, 1660, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), rally3, rally, rally2, rallyOnWarmupCompleted3, rallyOnWarmupCompleted2, rallyOnWarmupCompleted, null), 3, (Object) null);
        int i2 = IAuthTabCallbackStub + 53;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Rally $blurRally;
        final /* synthetic */ Rally $card1RotateRally;
        final /* synthetic */ Rally $card2RotateRally;
        final /* synthetic */ Rally $cardWiggleRally;
        final /* synthetic */ Rally $ctaRally;
        final /* synthetic */ Rally $fadeRally;
        final /* synthetic */ Rally $tooltipRally;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(Rally rally, Rally rally2, Rally rally3, Rally rally4, Rally rally5, Rally rally6, Rally rally7, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$fadeRally = rally;
            this.$blurRally = rally2;
            this.$card1RotateRally = rally3;
            this.$card2RotateRally = rally4;
            this.$cardWiggleRally = rally5;
            this.$ctaRally = rally6;
            this.$tooltipRally = rally7;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub(this.$fadeRally, this.$blurRally, this.$card1RotateRally, this.$card2RotateRally, this.$cardWiggleRally, this.$ctaRally, this.$tooltipRally, access13800Var);
            int i2 = onNavigationEvent + 3;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallbackStub;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 11;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(1000, r8) == r1) goto L24;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onNavigationEvent = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                isFireOS.onExtraCallbackWithResult(this.$fadeRally, false, 1, (Object) null);
                isFireOS.onExtraCallbackWithResult(this.$blurRally, false, 1, (Object) null);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(400L, this) != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            if (i3 != 1) {
                int i4 = onNavigationEvent + 75;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0 ? i3 != 2 : i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = onExtraCallback + 43;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                isFireOS.onExtraCallbackWithResult(this.$ctaRally, false, 1, (Object) null);
                isFireOS.onExtraCallbackWithResult(this.$tooltipRally, false, 1, (Object) null);
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj);
            isFireOS.onExtraCallbackWithResult(this.$card1RotateRally, false, 1, (Object) null);
            isFireOS.onExtraCallbackWithResult(this.$card2RotateRally, false, 1, (Object) null);
            isFireOS.onExtraCallbackWithResult(this.$cardWiggleRally, false, 1, (Object) null);
            this.label = 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(CreditQuizMyPageActivity creditQuizMyPageActivity, ActivityOnPausePoint activityOnPausePoint, SetDetectableSize setDetectableSize) throws Throwable {
        Avatar avatarOnExtraCallbackWithResult;
        Integer numValueOf;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 107;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a(new char[]{19802, 50691, 19752, 7738, 39634, 42804, 23975, 19422, 16376, 2549, 12903, 54585}, KeyEvent.normalizeMetaState(1), objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(creditQuizMyPageActivity.getIntent()));
            if (activityOnPausePoint != null) {
                MyQuizDetailsResponse myQuizDetailsResponseAsInterface = activityOnPausePoint.asInterface();
                if (myQuizDetailsResponseAsInterface == null || (avatarOnExtraCallbackWithResult = myQuizDetailsResponseAsInterface.onExtraCallbackWithResult()) == null) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(avatarOnExtraCallbackWithResult.onTransact());
                    int i3 = IAuthTabCallbackStub + 31;
                    IAuthTabCallback_Parcel = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr2 = new Object[1];
            a(new char[]{19802, 50691, 19752, 7738, 39634, 42804, 23975, 19422, 16376, 2549, 12903, 54585}, KeyEvent.normalizeMetaState(0), objArr2);
            setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(creditQuizMyPageActivity.getIntent()));
            if (activityOnPausePoint != null) {
            }
        }
        setDetectableSize.onExtraCallback("level", numValueOf);
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallback(final ActivityOnPausePoint activityOnPausePoint) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1303881L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageActivity$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) throws Throwable {
                Unit unitOnNavigationEvent;
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 41;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    unitOnNavigationEvent = CreditQuizMyPageActivity.onNavigationEvent(this.f$0, activityOnPausePoint, (SetDetectableSize) obj);
                    int i4 = 18 / 0;
                } else {
                    unitOnNavigationEvent = CreditQuizMyPageActivity.onNavigationEvent(this.f$0, activityOnPausePoint, (SetDetectableSize) obj);
                }
                int i5 = onWarmupCompleted + 123;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnNavigationEvent;
            }
        }, 14, null);
        ConstraintLayout constraintLayoutOnNavigationEvent = setEngagementSignalsCallback().IAuthTabCallback.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnNavigationEvent, "");
        constraintLayoutOnNavigationEvent.setVisibility(8);
        updateVisuals();
        int i2 = IAuthTabCallback_Parcel + 11;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 39 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(setCompressedSize setcompressedsize, Avatar avatar) {
        String strOnWarmupCompleted;
        String strIAuthTabCallbackDefault;
        int i = 2 % 2;
        TdsImageView tdsImageView = setcompressedsize.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        Integer numValueOf = null;
        if (avatar != null) {
            int i2 = IAuthTabCallbackStub + 13;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                avatar.onWarmupCompleted();
                throw null;
            }
            strOnWarmupCompleted = avatar.onWarmupCompleted();
        } else {
            strOnWarmupCompleted = null;
        }
        TdsImageView.setImage$default(tdsImageView, strOnWarmupCompleted, (Function1) null, (Function1) null, 6, (Object) null);
        Typography4 typography4 = setcompressedsize.onExtraCallback;
        if (avatar != null) {
            strIAuthTabCallbackDefault = avatar.IAuthTabCallbackDefault();
            int i3 = IAuthTabCallbackStub + 125;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        } else {
            strIAuthTabCallbackDefault = null;
        }
        typography4.setText(strIAuthTabCallbackDefault);
        TdsBadgeV1View tdsBadgeV1View = setcompressedsize.onWarmupCompleted;
        if (avatar != null) {
            int i5 = IAuthTabCallbackStub + 37;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 == 0) {
                Integer.valueOf(avatar.onTransact());
                numValueOf.hashCode();
                throw null;
            }
            numValueOf = Integer.valueOf(avatar.onTransact());
        }
        tdsBadgeV1View.setText("Lv. " + numValueOf);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        Configuration configuration = getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iIAuthTabCallbackDefault = new getUrlokhttp(new onExtraCallbackWithResult(configuration)).IAuthTabCallbackDefault();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration2 = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{iIAuthTabCallbackDefault, new getDEFAULT_CONNECTION_SPECSokhttp(new onExtraCallback(configuration2)).onWarmupCompleted()});
        gradientDrawable.setCornerRadius(70.0f);
        setcompressedsize.onExtraCallbackWithResult().setBackgroundDrawable(gradientDrawable);
    }

    public static /* synthetic */ Unit onExtraCallback(CreditQuizMyPageActivity creditQuizMyPageActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditQuizMyPageActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(nSetPosition.onExtraCallbackWithResult(), -94054386, nSetPosition.onExtraCallbackWithResult(), 94054388, iOnExtraCallbackWithResult, objArr, nSetPosition.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ CreditQuizMyPageViewModel onNavigationEvent(CreditQuizMyPageActivity creditQuizMyPageActivity) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (CreditQuizMyPageViewModel) onExtraCallback(nSetPosition.onExtraCallbackWithResult(), -69023439, iOnExtraCallbackWithResult2, 69023442, iOnExtraCallbackWithResult, new Object[]{creditQuizMyPageActivity}, iOnExtraCallbackWithResult3);
    }

    private static final void onExtraCallbackWithResult(CreditQuizMyPageActivity creditQuizMyPageActivity, ActivityOnPausePoint activityOnPausePoint, View view) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onExtraCallback(nSetPosition.onExtraCallbackWithResult(), 621355386, iOnExtraCallbackWithResult2, -621355381, iOnExtraCallbackWithResult, new Object[]{creditQuizMyPageActivity, activityOnPausePoint, view}, iOnExtraCallbackWithResult3);
    }

    private static final Unit onNavigationEvent(CreditQuizMyPageActivity creditQuizMyPageActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditQuizMyPageActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(nSetPosition.onExtraCallbackWithResult(), 1045458582, nSetPosition.onExtraCallbackWithResult(), -1045458576, iOnExtraCallbackWithResult, objArr, nSetPosition.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallbackWithResult(CreditQuizMyPageActivity creditQuizMyPageActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditQuizMyPageActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(nSetPosition.onExtraCallbackWithResult(), -807839866, nSetPosition.onExtraCallbackWithResult(), 807839867, iOnExtraCallbackWithResult, objArr, nSetPosition.onExtraCallbackWithResult());
    }

    private final void onExtraCallback(Avatar avatar) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onExtraCallback(nSetPosition.onExtraCallbackWithResult(), -1806052500, iOnExtraCallbackWithResult2, 1806052500, iOnExtraCallbackWithResult, new Object[]{this, avatar}, iOnExtraCallbackWithResult3);
    }

    public final SessionTrackerb IAuthTabCallback() {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (SessionTrackerb) onExtraCallback(nSetPosition.onExtraCallbackWithResult(), 673732708, iOnExtraCallbackWithResult2, -673732704, iOnExtraCallbackWithResult, new Object[]{this}, iOnExtraCallbackWithResult3);
    }

    @Override // im.toss.feature.credit.ui.quiz.mypage.Hilt_CreditQuizMyPageActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = IAuthTabCallbackStub + 15;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.feature.credit.ui.quiz.mypage.Hilt_CreditQuizMyPageActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
    }

    @Override // im.toss.feature.credit.ui.quiz.mypage.Hilt_CreditQuizMyPageActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
